package com.SpringBootPractice.Practice1.Utils;

import java.io.File;
import java.io.IOException;

import java.net.MalformedURLException;
import java.net.URL;
import org.jsonschema2pojo.DefaultGenerationConfig;
import org.jsonschema2pojo.GenerationConfig;
import org.jsonschema2pojo.Jackson2Annotator;
import org.jsonschema2pojo.SchemaGenerator;
import org.jsonschema2pojo.SchemaMapper;
import org.jsonschema2pojo.SchemaStore;
import org.jsonschema2pojo.SourceType;
import org.jsonschema2pojo.rules.RuleFactory;
import com.sun.codemodel.JCodeModel;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class CreatePojoFromJson {

	public static void main(String[] args) {

		String packageName = "com.SpringBootPractice.Practice1.APIModel";

		File inputJson = new File("." + File.separator + "APIModel.json");

		File outputPojoDirectory = new File("." + File.separator + "convertedPojo");

		outputPojoDirectory.mkdirs();

		try {

			new CreatePojoFromJson().convert2JSON(inputJson.toURI().toURL(), outputPojoDirectory, packageName,
					inputJson.getName().replace(".json", ""));
			File directoryPath = new File("E:\\Spring Boot Projects\\SB1\\Practice1\\Practice1\\convertedPojo\\com\\SpringBootPractice\\Practice1\\APIModel");
			String contents[] = directoryPath.list();
		      System.out.println("List of files and directories in the specified directory:");
		      for(int i=0; i<contents.length; i++) {
		         System.out.println(contents[i]);
		      
		
			String src="E:\\Spring Boot Projects\\SB1\\Practice1\\Practice1\\convertedPojo\\com\\SpringBootPractice\\Practice1\\APIModel\\"+contents[i];
			String dest="E:\\Spring Boot Projects\\SB1\\Practice1\\Practice1\\src\\main\\java\\com\\SpringBootPractice\\Practice1\\APIModel\\"+contents[i];
			 Path result = null;
		      try {
		         result = Files.move(Paths.get(src), Paths.get(dest));
		      } catch (IOException e) {
		         System.out.println("Exception while moving file: " + e.getMessage());
		      }
		      if(result != null) {
		         System.out.println("File moved successfully.");
		      }else{
		         System.out.println("File movement failed.");
		      }
		      
		      }
		}
		 catch (IOException e) {

			// TODO Auto-generated catch block

			System.out.println("Encountered issue while converting to pojo: " + e.getMessage());

			e.printStackTrace();

		}
		}
		

	

	public void convert2JSON(URL inputJson, File outputPojoDirectory, String packageName, String className)
			throws IOException {
		JCodeModel codeModel = new JCodeModel();
		URL source = inputJson;
		GenerationConfig config = new DefaultGenerationConfig() {
			@Override
			public boolean isGenerateBuilders() { // set config option by overriding method
				return true;
			}

			public SourceType getSourceType() {
				return SourceType.JSON;
			}
		};
		SchemaMapper mapper = new SchemaMapper(
				new RuleFactory(config, new Jackson2Annotator(config), new SchemaStore()), new SchemaGenerator());
		mapper.generate(codeModel, className, packageName, source);

		codeModel.build(outputPojoDirectory);

	}
}
