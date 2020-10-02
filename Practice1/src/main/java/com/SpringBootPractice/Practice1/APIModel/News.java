package com.SpringBootPractice.Practice1.APIModel;

import java.util.List;

import lombok.Data;

@Data
public class News {
	private String status;
	private String totalResults;
	private List<Article> articles;

}
