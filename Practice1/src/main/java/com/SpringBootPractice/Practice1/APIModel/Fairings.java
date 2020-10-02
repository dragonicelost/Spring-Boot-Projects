
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
    "reused",
    "recovery_attempt",
    "recovered",
    "ships"
})
public class Fairings {

    @JsonProperty("reused")
    private Object reused;
    @JsonProperty("recovery_attempt")
    private Boolean recoveryAttempt;
    @JsonProperty("recovered")
    private Object recovered;
    @JsonProperty("ships")
    private List<String> ships = new ArrayList<String>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("reused")
    public Object getReused() {
        return reused;
    }

    @JsonProperty("reused")
    public void setReused(Object reused) {
        this.reused = reused;
    }

    public Fairings withReused(Object reused) {
        this.reused = reused;
        return this;
    }

    @JsonProperty("recovery_attempt")
    public Boolean getRecoveryAttempt() {
        return recoveryAttempt;
    }

    @JsonProperty("recovery_attempt")
    public void setRecoveryAttempt(Boolean recoveryAttempt) {
        this.recoveryAttempt = recoveryAttempt;
    }

    public Fairings withRecoveryAttempt(Boolean recoveryAttempt) {
        this.recoveryAttempt = recoveryAttempt;
        return this;
    }

    @JsonProperty("recovered")
    public Object getRecovered() {
        return recovered;
    }

    @JsonProperty("recovered")
    public void setRecovered(Object recovered) {
        this.recovered = recovered;
    }

    public Fairings withRecovered(Object recovered) {
        this.recovered = recovered;
        return this;
    }

    @JsonProperty("ships")
    public List<String> getShips() {
        return ships;
    }

    @JsonProperty("ships")
    public void setShips(List<String> ships) {
        this.ships = ships;
    }

    public Fairings withShips(List<String> ships) {
        this.ships = ships;
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

    public Fairings withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(reused).append(recoveryAttempt).append(recovered).append(ships).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Fairings) == false) {
            return false;
        }
        Fairings rhs = ((Fairings) other);
        return new EqualsBuilder().append(reused, rhs.reused).append(recoveryAttempt, rhs.recoveryAttempt).append(recovered, rhs.recovered).append(ships, rhs.ships).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
