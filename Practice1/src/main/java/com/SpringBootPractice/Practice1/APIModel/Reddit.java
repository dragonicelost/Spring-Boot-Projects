
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
    "campaign",
    "launch",
    "media",
    "recovery"
})
public class Reddit {

    @JsonProperty("campaign")
    private String campaign;
    @JsonProperty("launch")
    private String launch;
    @JsonProperty("media")
    private String media;
    @JsonProperty("recovery")
    private Object recovery;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("campaign")
    public String getCampaign() {
        return campaign;
    }

    @JsonProperty("campaign")
    public void setCampaign(String campaign) {
        this.campaign = campaign;
    }

    public Reddit withCampaign(String campaign) {
        this.campaign = campaign;
        return this;
    }

    @JsonProperty("launch")
    public String getLaunch() {
        return launch;
    }

    @JsonProperty("launch")
    public void setLaunch(String launch) {
        this.launch = launch;
    }

    public Reddit withLaunch(String launch) {
        this.launch = launch;
        return this;
    }

    @JsonProperty("media")
    public String getMedia() {
        return media;
    }

    @JsonProperty("media")
    public void setMedia(String media) {
        this.media = media;
    }

    public Reddit withMedia(String media) {
        this.media = media;
        return this;
    }

    @JsonProperty("recovery")
    public Object getRecovery() {
        return recovery;
    }

    @JsonProperty("recovery")
    public void setRecovery(Object recovery) {
        this.recovery = recovery;
    }

    public Reddit withRecovery(Object recovery) {
        this.recovery = recovery;
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

    public Reddit withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(campaign).append(launch).append(media).append(recovery).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Reddit) == false) {
            return false;
        }
        Reddit rhs = ((Reddit) other);
        return new EqualsBuilder().append(campaign, rhs.campaign).append(launch, rhs.launch).append(media, rhs.media).append(recovery, rhs.recovery).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
