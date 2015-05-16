package com.tumblr.jumblr.types;

import java.util.Map;

/**
 * This class represents a post of type "quote"
 * @author jc
 */
public class QuotePost extends SafePost {

    private String text;
    private String source;

    /**
     * Get the text of this post
     * @return the text
     */
    public String getText() {
        return text;
    }

    /**
     * Get the source of this post
     * @return the source
     */
    public String getSource() {
        return source;
    }

    /**
     * Set the text of this post
     * @param text the text
     */
    public void setText(String text) {
        this.text = text;
    }

    /**
     * Set the source of this post
     * @param source the source
     */
    public void setSource(String source) {
        this.source = source;
    }

    /**
     * Get the details for this post (and the base details)
     * @return the details
     */
    @Override
    protected Map<String, Object> detail() {
        Map<String, Object> map = super.detail();
        map.put("quote", this.text);
        map.put("source", this.source);
        map.put("type", "quote");
        return map;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof QuotePost)) return false;
        if (!super.equals(o)) return false;

        QuotePost quotePost = (QuotePost) o;

        if (text != null ? !text.equals(quotePost.text) : quotePost.text != null) return false;
        return !(source != null ? !source.equals(quotePost.source) : quotePost.source != null);

    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (text != null ? text.hashCode() : 0);
        result = 31 * result + (source != null ? source.hashCode() : 0);
        return result;
    }
}
