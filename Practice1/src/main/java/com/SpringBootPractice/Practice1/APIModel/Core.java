
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
    "core",
    "flight",
    "gridfins",
    "legs",
    "reused",
    "landing_attempt",
    "landing_success",
    "landing_type",
    "landpad"
})
public class Core {

    @JsonProperty("core")
    private String core;
    @JsonProperty("flight")
    private Integer flight;
    @JsonProperty("gridfins")
    private Boolean gridfins;
    @JsonProperty("legs")
    private Boolean legs;
    @JsonProperty("reused")
    private Boolean reused;
    @JsonProperty("landing_attempt")
    private Boolean landingAttempt;
    @JsonProperty("landing_success")
    private Boolean landingSuccess;
    @JsonProperty("landing_type")
    private String landingType;
    @JsonProperty("landpad")
    private String landpad;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("core")
    public String getCore() {
        return core;
    }

    @JsonProperty("core")
    public void setCore(String core) {
        this.core = core;
    }

    public Core withCore(String core) {
        this.core = core;
        return this;
    }

    @JsonProperty("flight")
    public Integer getFlight() {
        return flight;
    }

    @JsonProperty("flight")
    public void setFlight(Integer flight) {
        this.flight = flight;
    }

    public Core withFlight(Integer flight) {
        this.flight = flight;
        return this;
    }

    @JsonProperty("gridfins")
    public Boolean getGridfins() {
        return gridfins;
    }

    @JsonProperty("gridfins")
    public void setGridfins(Boolean gridfins) {
        this.gridfins = gridfins;
    }

    public Core withGridfins(Boolean gridfins) {
        this.gridfins = gridfins;
        return this;
    }

    @JsonProperty("legs")
    public Boolean getLegs() {
        return legs;
    }

    @JsonProperty("legs")
    public void setLegs(Boolean legs) {
        this.legs = legs;
    }

    public Core withLegs(Boolean legs) {
        this.legs = legs;
        return this;
    }

    @JsonProperty("reused")
    public Boolean getReused() {
        return reused;
    }

    @JsonProperty("reused")
    public void setReused(Boolean reused) {
        this.reused = reused;
    }

    public Core withReused(Boolean reused) {
        this.reused = reused;
        return this;
    }

    @JsonProperty("landing_attempt")
    public Boolean getLandingAttempt() {
        return landingAttempt;
    }

    @JsonProperty("landing_attempt")
    public void setLandingAttempt(Boolean landingAttempt) {
        this.landingAttempt = landingAttempt;
    }

    public Core withLandingAttempt(Boolean landingAttempt) {
        this.landingAttempt = landingAttempt;
        return this;
    }

    @JsonProperty("landing_success")
    public Boolean getLandingSuccess() {
        return landingSuccess;
    }

    @JsonProperty("landing_success")
    public void setLandingSuccess(Boolean landingSuccess) {
        this.landingSuccess = landingSuccess;
    }

    public Core withLandingSuccess(Boolean landingSuccess) {
        this.landingSuccess = landingSuccess;
        return this;
    }

    @JsonProperty("landing_type")
    public String getLandingType() {
        return landingType;
    }

    @JsonProperty("landing_type")
    public void setLandingType(String landingType) {
        this.landingType = landingType;
    }

    public Core withLandingType(String landingType) {
        this.landingType = landingType;
        return this;
    }

    @JsonProperty("landpad")
    public String getLandpad() {
        return landpad;
    }

    @JsonProperty("landpad")
    public void setLandpad(String landpad) {
        this.landpad = landpad;
    }

    public Core withLandpad(String landpad) {
        this.landpad = landpad;
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

    public Core withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(core).append(flight).append(gridfins).append(legs).append(reused).append(landingAttempt).append(landingSuccess).append(landingType).append(landpad).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Core) == false) {
            return false;
        }
        Core rhs = ((Core) other);
        return new EqualsBuilder().append(core, rhs.core).append(flight, rhs.flight).append(gridfins, rhs.gridfins).append(legs, rhs.legs).append(reused, rhs.reused).append(landingAttempt, rhs.landingAttempt).append(landingSuccess, rhs.landingSuccess).append(landingType, rhs.landingType).append(landpad, rhs.landpad).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
