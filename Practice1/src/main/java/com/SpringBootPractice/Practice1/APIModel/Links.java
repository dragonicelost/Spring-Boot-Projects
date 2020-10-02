
package com.SpringBootPractice.Practice1.APIModel;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "patch",
    "reddit",
    "flickr",
    "presskit",
    "webcast",
    "youtube_id",
    "article",
    "wikipedia"
})
public class Links {

    @JsonProperty("patch")
    private Patch patch;
    @JsonProperty("reddit")
    private Reddit reddit;
    @JsonProperty("flickr")
    private Flickr flickr;
    @JsonProperty("presskit")
    private Object presskit;
    @JsonProperty("webcast")
    private String webcast;
    @JsonProperty("youtube_id")
    private String youtubeId;
    @JsonProperty("article")
    private Object article;
    @JsonProperty("wikipedia")
    private String wikipedia;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("patch")
    public Patch getPatch() {
        return patch;
    }

    @JsonProperty("patch")
    public void setPatch(Patch patch) {
        this.patch = patch;
    }

    public Links withPatch(Patch patch) {
        this.patch = patch;
        return this;
    }

    @JsonProperty("reddit")
    public Reddit getReddit() {
        return reddit;
    }

    @JsonProperty("reddit")
    public void setReddit(Reddit reddit) {
        this.reddit = reddit;
    }

    public Links withReddit(Reddit reddit) {
        this.reddit = reddit;
        return this;
    }

    @JsonProperty("flickr")
    public Flickr getFlickr() {
        return flickr;
    }

    @JsonProperty("flickr")
    public void setFlickr(Flickr flickr) {
        this.flickr = flickr;
    }

    public Links withFlickr(Flickr flickr) {
        this.flickr = flickr;
        return this;
    }

    @JsonProperty("presskit")
    public Object getPresskit() {
        return presskit;
    }

    @JsonProperty("presskit")
    public void setPresskit(Object presskit) {
        this.presskit = presskit;
    }

    public Links withPresskit(Object presskit) {
        this.presskit = presskit;
        return this;
    }

    @JsonProperty("webcast")
    public String getWebcast() {
        return webcast;
    }

    @JsonProperty("webcast")
    public void setWebcast(String webcast) {
        this.webcast = webcast;
    }

    public Links withWebcast(String webcast) {
        this.webcast = webcast;
        return this;
    }

    @JsonProperty("youtube_id")
    public String getYoutubeId() {
        return youtubeId;
    }

    @JsonProperty("youtube_id")
    public void setYoutubeId(String youtubeId) {
        this.youtubeId = youtubeId;
    }

    public Links withYoutubeId(String youtubeId) {
        this.youtubeId = youtubeId;
        return this;
    }

    @JsonProperty("article")
    public Object getArticle() {
        return article;
    }

    @JsonProperty("article")
    public void setArticle(Object article) {
        this.article = article;
    }

    public Links withArticle(Object article) {
        this.article = article;
        return this;
    }

    @JsonProperty("wikipedia")
    public String getWikipedia() {
        return wikipedia;
    }

    @JsonProperty("wikipedia")
    public void setWikipedia(String wikipedia) {
        this.wikipedia = wikipedia;
    }

    public Links withWikipedia(String wikipedia) {
        this.wikipedia = wikipedia;
        return this;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    public Links withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(patch).append(reddit).append(flickr).append(presskit).append(webcast).append(youtubeId).append(article).append(wikipedia).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Links) == false) {
            return false;
        }
        Links rhs = ((Links) other);
        return new EqualsBuilder().append(patch, rhs.patch).append(reddit, rhs.reddit).append(flickr, rhs.flickr).append(presskit, rhs.presskit).append(webcast, rhs.webcast).append(youtubeId, rhs.youtubeId).append(article, rhs.article).append(wikipedia, rhs.wikipedia).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
