
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
    "fairings",
    "links",
    "static_fire_date_utc",
    "static_fire_date_unix",
    "tbd",
    "net",
    "window",
    "rocket",
    "success",
    "details",
    "crew",
    "ships",
    "capsules",
    "payloads",
    "launchpad",
    "auto_update",
    "failures",
    "flight_number",
    "name",
    "date_utc",
    "date_unix",
    "date_local",
    "date_precision",
    "upcoming",
    "cores",
    "id"
})
public class APIModel {

    @JsonProperty("fairings")
    private Fairings fairings;
    @JsonProperty("links")
    private Links links;
    @JsonProperty("static_fire_date_utc")
    private Object staticFireDateUtc;
    @JsonProperty("static_fire_date_unix")
    private Object staticFireDateUnix;
    @JsonProperty("tbd")
    private Boolean tbd;
    @JsonProperty("net")
    private Boolean net;
    @JsonProperty("window")
    private Object window;
    @JsonProperty("rocket")
    private String rocket;
    @JsonProperty("success")
    private Boolean success;
    @JsonProperty("details")
    private String details;
    @JsonProperty("crew")
    private List<Object> crew = new ArrayList<Object>();
    @JsonProperty("ships")
    private List<String> ships = new ArrayList<String>();
    @JsonProperty("capsules")
    private List<Object> capsules = new ArrayList<Object>();
    @JsonProperty("payloads")
    private List<String> payloads = new ArrayList<String>();
    @JsonProperty("launchpad")
    private String launchpad;
    @JsonProperty("auto_update")
    private Boolean autoUpdate;
    @JsonProperty("failures")
    private List<Object> failures = new ArrayList<Object>();
    @JsonProperty("flight_number")
    private Integer flightNumber;
    @JsonProperty("name")
    private String name;
    @JsonProperty("date_utc")
    private String dateUtc;
    @JsonProperty("date_unix")
    private Integer dateUnix;
    @JsonProperty("date_local")
    private String dateLocal;
    @JsonProperty("date_precision")
    private String datePrecision;
    @JsonProperty("upcoming")
    private Boolean upcoming;
    @JsonProperty("cores")
    private List<Core> cores = new ArrayList<Core>();
    @JsonProperty("id")
    private String id;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("fairings")
    public Fairings getFairings() {
        return fairings;
    }

    @JsonProperty("fairings")
    public void setFairings(Fairings fairings) {
        this.fairings = fairings;
    }

    public APIModel withFairings(Fairings fairings) {
        this.fairings = fairings;
        return this;
    }

    @JsonProperty("links")
    public Links getLinks() {
        return links;
    }

    @JsonProperty("links")
    public void setLinks(Links links) {
        this.links = links;
    }

    public APIModel withLinks(Links links) {
        this.links = links;
        return this;
    }

    @JsonProperty("static_fire_date_utc")
    public Object getStaticFireDateUtc() {
        return staticFireDateUtc;
    }

    @JsonProperty("static_fire_date_utc")
    public void setStaticFireDateUtc(Object staticFireDateUtc) {
        this.staticFireDateUtc = staticFireDateUtc;
    }

    public APIModel withStaticFireDateUtc(Object staticFireDateUtc) {
        this.staticFireDateUtc = staticFireDateUtc;
        return this;
    }

    @JsonProperty("static_fire_date_unix")
    public Object getStaticFireDateUnix() {
        return staticFireDateUnix;
    }

    @JsonProperty("static_fire_date_unix")
    public void setStaticFireDateUnix(Object staticFireDateUnix) {
        this.staticFireDateUnix = staticFireDateUnix;
    }

    public APIModel withStaticFireDateUnix(Object staticFireDateUnix) {
        this.staticFireDateUnix = staticFireDateUnix;
        return this;
    }

    @JsonProperty("tbd")
    public Boolean getTbd() {
        return tbd;
    }

    @JsonProperty("tbd")
    public void setTbd(Boolean tbd) {
        this.tbd = tbd;
    }

    public APIModel withTbd(Boolean tbd) {
        this.tbd = tbd;
        return this;
    }

    @JsonProperty("net")
    public Boolean getNet() {
        return net;
    }

    @JsonProperty("net")
    public void setNet(Boolean net) {
        this.net = net;
    }

    public APIModel withNet(Boolean net) {
        this.net = net;
        return this;
    }

    @JsonProperty("window")
    public Object getWindow() {
        return window;
    }

    @JsonProperty("window")
    public void setWindow(Object window) {
        this.window = window;
    }

    public APIModel withWindow(Object window) {
        this.window = window;
        return this;
    }

    @JsonProperty("rocket")
    public String getRocket() {
        return rocket;
    }

    @JsonProperty("rocket")
    public void setRocket(String rocket) {
        this.rocket = rocket;
    }

    public APIModel withRocket(String rocket) {
        this.rocket = rocket;
        return this;
    }

    @JsonProperty("success")
    public Boolean getSuccess() {
        return success;
    }

    @JsonProperty("success")
    public void setSuccess(Boolean success) {
        this.success = success;
    }

    public APIModel withSuccess(Boolean success) {
        this.success = success;
        return this;
    }

    @JsonProperty("details")
    public String getDetails() {
        return details;
    }

    @JsonProperty("details")
    public void setDetails(String details) {
        this.details = details;
    }

    public APIModel withDetails(String details) {
        this.details = details;
        return this;
    }

    @JsonProperty("crew")
    public List<Object> getCrew() {
        return crew;
    }

    @JsonProperty("crew")
    public void setCrew(List<Object> crew) {
        this.crew = crew;
    }

    public APIModel withCrew(List<Object> crew) {
        this.crew = crew;
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

    public APIModel withShips(List<String> ships) {
        this.ships = ships;
        return this;
    }

    @JsonProperty("capsules")
    public List<Object> getCapsules() {
        return capsules;
    }

    @JsonProperty("capsules")
    public void setCapsules(List<Object> capsules) {
        this.capsules = capsules;
    }

    public APIModel withCapsules(List<Object> capsules) {
        this.capsules = capsules;
        return this;
    }

    @JsonProperty("payloads")
    public List<String> getPayloads() {
        return payloads;
    }

    @JsonProperty("payloads")
    public void setPayloads(List<String> payloads) {
        this.payloads = payloads;
    }

    public APIModel withPayloads(List<String> payloads) {
        this.payloads = payloads;
        return this;
    }

    @JsonProperty("launchpad")
    public String getLaunchpad() {
        return launchpad;
    }

    @JsonProperty("launchpad")
    public void setLaunchpad(String launchpad) {
        this.launchpad = launchpad;
    }

    public APIModel withLaunchpad(String launchpad) {
        this.launchpad = launchpad;
        return this;
    }

    @JsonProperty("auto_update")
    public Boolean getAutoUpdate() {
        return autoUpdate;
    }

    @JsonProperty("auto_update")
    public void setAutoUpdate(Boolean autoUpdate) {
        this.autoUpdate = autoUpdate;
    }

    public APIModel withAutoUpdate(Boolean autoUpdate) {
        this.autoUpdate = autoUpdate;
        return this;
    }

    @JsonProperty("failures")
    public List<Object> getFailures() {
        return failures;
    }

    @JsonProperty("failures")
    public void setFailures(List<Object> failures) {
        this.failures = failures;
    }

    public APIModel withFailures(List<Object> failures) {
        this.failures = failures;
        return this;
    }

    @JsonProperty("flight_number")
    public Integer getFlightNumber() {
        return flightNumber;
    }

    @JsonProperty("flight_number")
    public void setFlightNumber(Integer flightNumber) {
        this.flightNumber = flightNumber;
    }

    public APIModel withFlightNumber(Integer flightNumber) {
        this.flightNumber = flightNumber;
        return this;
    }

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    public APIModel withName(String name) {
        this.name = name;
        return this;
    }

    @JsonProperty("date_utc")
    public String getDateUtc() {
        return dateUtc;
    }

    @JsonProperty("date_utc")
    public void setDateUtc(String dateUtc) {
        this.dateUtc = dateUtc;
    }

    public APIModel withDateUtc(String dateUtc) {
        this.dateUtc = dateUtc;
        return this;
    }

    @JsonProperty("date_unix")
    public Integer getDateUnix() {
        return dateUnix;
    }

    @JsonProperty("date_unix")
    public void setDateUnix(Integer dateUnix) {
        this.dateUnix = dateUnix;
    }

    public APIModel withDateUnix(Integer dateUnix) {
        this.dateUnix = dateUnix;
        return this;
    }

    @JsonProperty("date_local")
    public String getDateLocal() {
        return dateLocal;
    }

    @JsonProperty("date_local")
    public void setDateLocal(String dateLocal) {
        this.dateLocal = dateLocal;
    }

    public APIModel withDateLocal(String dateLocal) {
        this.dateLocal = dateLocal;
        return this;
    }

    @JsonProperty("date_precision")
    public String getDatePrecision() {
        return datePrecision;
    }

    @JsonProperty("date_precision")
    public void setDatePrecision(String datePrecision) {
        this.datePrecision = datePrecision;
    }

    public APIModel withDatePrecision(String datePrecision) {
        this.datePrecision = datePrecision;
        return this;
    }

    @JsonProperty("upcoming")
    public Boolean getUpcoming() {
        return upcoming;
    }

    @JsonProperty("upcoming")
    public void setUpcoming(Boolean upcoming) {
        this.upcoming = upcoming;
    }

    public APIModel withUpcoming(Boolean upcoming) {
        this.upcoming = upcoming;
        return this;
    }

    @JsonProperty("cores")
    public List<Core> getCores() {
        return cores;
    }

    @JsonProperty("cores")
    public void setCores(List<Core> cores) {
        this.cores = cores;
    }

    public APIModel withCores(List<Core> cores) {
        this.cores = cores;
        return this;
    }

    @JsonProperty("id")
    public String getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    public APIModel withId(String id) {
        this.id = id;
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

    public APIModel withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(fairings).append(links).append(staticFireDateUtc).append(staticFireDateUnix).append(tbd).append(net).append(window).append(rocket).append(success).append(details).append(crew).append(ships).append(capsules).append(payloads).append(launchpad).append(autoUpdate).append(failures).append(flightNumber).append(name).append(dateUtc).append(dateUnix).append(dateLocal).append(datePrecision).append(upcoming).append(cores).append(id).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof APIModel) == false) {
            return false;
        }
        APIModel rhs = ((APIModel) other);
        return new EqualsBuilder().append(fairings, rhs.fairings).append(links, rhs.links).append(staticFireDateUtc, rhs.staticFireDateUtc).append(staticFireDateUnix, rhs.staticFireDateUnix).append(tbd, rhs.tbd).append(net, rhs.net).append(window, rhs.window).append(rocket, rhs.rocket).append(success, rhs.success).append(details, rhs.details).append(crew, rhs.crew).append(ships, rhs.ships).append(capsules, rhs.capsules).append(payloads, rhs.payloads).append(launchpad, rhs.launchpad).append(autoUpdate, rhs.autoUpdate).append(failures, rhs.failures).append(flightNumber, rhs.flightNumber).append(name, rhs.name).append(dateUtc, rhs.dateUtc).append(dateUnix, rhs.dateUnix).append(dateLocal, rhs.dateLocal).append(datePrecision, rhs.datePrecision).append(upcoming, rhs.upcoming).append(cores, rhs.cores).append(id, rhs.id).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
