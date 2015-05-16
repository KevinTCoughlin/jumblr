package com.tumblr.jumblr.types;

import java.util.Map;

/**
 * This class represents a post of type "postcard"
 * @author jc
 */
public class PostcardPost extends SafePost {

    private String body;
    private String asking_name;
    private String asking_url;

    /**
     * Get the asking name for this postcard
     * @return the asking name
     */
    public String getAskingName() {
        return asking_name;
    }

    /**
     * Set the asking name for this postcard
     * @param askingName the asking name
     */
    public void setAskingName(String askingName) {
        this.asking_name = askingName;
    }

    /**
     * Get the asking URL for this postcard
     * @return the asking URL
     */
    public String getAskingUrl() {
        return asking_url;
    }

    /**
     * Set the asking URL for this postcard
     * @param askingUrl the asking URL
     */
    public void setAskingUrl(String askingUrl) {
        this.asking_url = askingUrl;
    }

    /**
     * Get the body for this postcard
     * @return the body
     */
    public String getBody() {
        return body;
    }

    /**
     * Set the body for this postcard
     * @param body the body
     */
    public void setBody(String body) {
        this.body = body;
    }

    /**
     * Get the details for this post (and the base details)
     * @return the details
     */
    @Override
    protected Map<String, Object> detail() {
        Map<String, Object> map = super.detail();
        map.put("body", body);
        map.put("asking_name", asking_name);
        map.put("asking_url", asking_url);
        map.put("type", "postcard");
        return map;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof PostcardPost)) return false;
        if (!super.equals(o)) return false;

        PostcardPost that = (PostcardPost) o;

        if (body != null ? !body.equals(that.body) : that.body != null) return false;
        if (asking_name != null ? !asking_name.equals(that.asking_name) : that.asking_name != null) return false;
        return !(asking_url != null ? !asking_url.equals(that.asking_url) : that.asking_url != null);

    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (body != null ? body.hashCode() : 0);
        result = 31 * result + (asking_name != null ? asking_name.hashCode() : 0);
        result = 31 * result + (asking_url != null ? asking_url.hashCode() : 0);
        return result;
    }
}
