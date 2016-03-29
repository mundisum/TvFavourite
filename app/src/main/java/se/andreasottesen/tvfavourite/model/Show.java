package se.andreasottesen.tvfavourite.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by andreas.ottesen on 2016-03-27.
 */
public class Show {
    private Integer id;
    private String url;
    private String name;
    private String type;
    private String language;
    private List<Object> genres = new ArrayList<Object>();
    private String status;
    private Integer runtime;
    private String premiered;
    //private Schedule schedule;
    //private Rating rating;
    private Integer weight;
    //private Network network;
    private Object webChannel;
    //private Externals externals;
    //private Image image;
    private String summary;
    private Integer updated;
    //private com.example.Links Links;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     *
     * @return
     * The id
     */
    public Integer getId() {
        return id;
    }

    /**
     *
     * @param id
     * The id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     *
     * @return
     * The url
     */
    public String getUrl() {
        return url;
    }

    /**
     *
     * @param url
     * The url
     */
    public void setUrl(String url) {
        this.url = url;
    }

    /**
     *
     * @return
     * The name
     */
    public String getName() {
        return name;
    }

    /**
     *
     * @param name
     * The name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     *
     * @return
     * The type
     */
    public String getType() {
        return type;
    }

    /**
     *
     * @param type
     * The type
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     *
     * @return
     * The language
     */
    public String getLanguage() {
        return language;
    }

    /**
     *
     * @param language
     * The language
     */
    public void setLanguage(String language) {
        this.language = language;
    }

    /**
     *
     * @return
     * The genres
     */
    public List<Object> getGenres() {
        return genres;
    }

    /**
     *
     * @param genres
     * The genres
     */
    public void setGenres(List<Object> genres) {
        this.genres = genres;
    }

    /**
     *
     * @return
     * The status
     */
    public String getStatus() {
        return status;
    }

    /**
     *
     * @param status
     * The status
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     *
     * @return
     * The runtime
     */
    public Integer getRuntime() {
        return runtime;
    }

    /**
     *
     * @param runtime
     * The runtime
     */
    public void setRuntime(Integer runtime) {
        this.runtime = runtime;
    }

    /**
     *
     * @return
     * The premiered
     */
    public String getPremiered() {
        return premiered;
    }

    /**
     *
     * @param premiered
     * The premiered
     */
    public void setPremiered(String premiered) {
        this.premiered = premiered;
    }

    /**
     *
     * @return
     * The schedule
     */
//    public Schedule getSchedule() {
//        return schedule;
//    }

    /**
     *
     * @param schedule
     * The schedule
     */
//    public void setSchedule(Schedule schedule) {
//        this.schedule = schedule;
//    }

    /**
     *
     * @return
     * The rating
     */
//    public Rating getRating() {
//        return rating;
//    }

    /**
     *
     * @param rating
     * The rating
     */
//    public void setRating(Rating rating) {
//        this.rating = rating;
//    }

    /**
     *
     * @return
     * The weight
     */
    public Integer getWeight() {
        return weight;
    }

    /**
     *
     * @param weight
     * The weight
     */
    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    /**
     *
     * @return
     * The network
     */
//    public Network getNetwork() {
//        return network;
//    }

    /**
     *
     * @param network
     * The network
     */
//    public void setNetwork(Network network) {
//        this.network = network;
//    }

    /**
     *
     * @return
     * The webChannel
     */
    public Object getWebChannel() {
        return webChannel;
    }

    /**
     *
     * @param webChannel
     * The webChannel
     */
    public void setWebChannel(Object webChannel) {
        this.webChannel = webChannel;
    }

    /**
     *
     * @return
     * The externals
     */
//    public Externals getExternals() {
//        return externals;
//    }

    /**
     *
     * @param externals
     * The externals
     */
//    public void setExternals(Externals externals) {
//        this.externals = externals;
//    }

    /**
     *
     * @return
     * The image
     */
//    public Image getImage() {
//        return image;
//    }

    /**
     *
     * @param image
     * The image
     */
//    public void setImage(Image image) {
//        this.image = image;
//    }

    /**
     *
     * @return
     * The summary
     */
    public String getSummary() {
        return summary;
    }

    /**
     *
     * @param summary
     * The summary
     */
    public void setSummary(String summary) {
        this.summary = summary;
    }

    /**
     *
     * @return
     * The updated
     */
    public Integer getUpdated() {
        return updated;
    }

    /**
     *
     * @param updated
     * The updated
     */
    public void setUpdated(Integer updated) {
        this.updated = updated;
    }

    /**
     *
     * @return
     * The Links
     */
//    public com.example.Links getLinks() {
//        return Links;
//    }

    /**
     *
     * @param Links
     * The _links
     */
//    public void setLinks(com.example.Links Links) {
//        this.Links = Links;
//    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }
}
