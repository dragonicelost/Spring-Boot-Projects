
package com.SpringBootPractice.Practice1.APIModel;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
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
    "small",
    "original"
})
public class Flickr {

    @JsonProperty("small")
    private List<Object> small = new ArrayList<Object>();
    @JsonProperty("original")
    private List<Object> original = new ArrayList<Object>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("small")
    public List<Object> getSmall() {
        return small;
    }

    @JsonProperty("small")
    public void setSmall(List<Object> small) {
        this.small = small;
    }

    public Flickr withSmall(List<Object> small) {
        this.small = small;
        return this;
    }

    @JsonProperty("original")
    public List<Object> getOriginal() {
        return original;
    }

    @JsonProperty("original")
    public void setOriginal(List<Object> original) {
        this.original = original;
    }

    public Flickr withOriginal(List<Object> original) {
        this.original = original;
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

    public Flickr withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(small).append(original).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Flickr) == false) {
            return false;
        }
        Flickr rhs = ((Flickr) other);
        return new EqualsBuilder().append(small, rhs.small).append(original, rhs.original).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
