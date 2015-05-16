package com.tumblr.jumblr.types;

import java.io.File;
import java.util.List;
import java.util.Map;

/**
 * This class represents a post of type "video"
 * @author jc
 */
public class VideoPost extends Post {

    private List<Video> player;
    private String caption;
    private String embed, permalink_url;
    private File data;
    private String thumbnail_url;
    private int thumbnail_width;
    private int thumbnail_height;

    /**
     * Get the permalink URL for this video
     */
    public String getPermalinkUrl() {
        return permalink_url;
    }

    /**
     * Get the thumbnail URL for the video
     * @return possibly null URL
     */
    public String getThumbnailUrl() {
        return thumbnail_url;
    }

    /**
     * Get the thumbnail URL for the video
     * @return 0 if not set
     */
    public int getThumbnailWidth() {
        return thumbnail_width;
    }

    /**
     * Get the thumbnail URL for the video
     * @return 0 if not set
     */
    public int getThumbnailHeight() {
        return thumbnail_height;
    }

    /**
     * Get the videos from this post
     * @return the videos
     */
    public List<Video> getVideos() {
        return this.player;
    }

    /**
     * Get the caption from this post
     * @return String caption
     */
    public String getCaption() {
        return caption;
    }

    /**
     * Set the embed code for this post
     * @param embed the Embed HTML for this post
     * @throws IllegalArgumentException if data is already set
     */
    public void setEmbedCode(String embed) {
        if (data != null) {
            throw new IllegalArgumentException("Cannot supply both data & embed");
        }
        this.embed = embed;
    }

    /**
     * Set the data for this post
     * @param file the file to read from
     * @throws IllegalArgumentException source is already set
     */
    public void setData(File file) {
        if (embed != null) {
            throw new IllegalArgumentException("Cannot supply both embed & data");
        }
        this.data = file;
    }

    /**
     * Set the caption for this post
     * @param caption the caption to set
     */
    public void setCaption(String caption) {
        this.caption = caption;
    }

    /**
     * Get the details for this post (in addition to the base details)
     * @return details of this post
     */
    @Override
    public Map<String, Object> detail() {
        Map<String, Object> details = super.detail();
        details.put("caption", caption);
        details.put("embed", embed);
        details.put("data", data);
        details.put("type", "video");
        return details;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof VideoPost)) return false;
        if (!super.equals(o)) return false;

        VideoPost videoPost = (VideoPost) o;

        if (thumbnail_width != videoPost.thumbnail_width) return false;
        if (thumbnail_height != videoPost.thumbnail_height) return false;
        if (player != null ? !player.equals(videoPost.player) : videoPost.player != null) return false;
        if (caption != null ? !caption.equals(videoPost.caption) : videoPost.caption != null) return false;
        if (embed != null ? !embed.equals(videoPost.embed) : videoPost.embed != null) return false;
        if (permalink_url != null ? !permalink_url.equals(videoPost.permalink_url) : videoPost.permalink_url != null)
            return false;
        if (data != null ? !data.equals(videoPost.data) : videoPost.data != null) return false;
        return !(thumbnail_url != null ? !thumbnail_url.equals(videoPost.thumbnail_url) : videoPost.thumbnail_url != null);

    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (player != null ? player.hashCode() : 0);
        result = 31 * result + (caption != null ? caption.hashCode() : 0);
        result = 31 * result + (embed != null ? embed.hashCode() : 0);
        result = 31 * result + (permalink_url != null ? permalink_url.hashCode() : 0);
        result = 31 * result + (data != null ? data.hashCode() : 0);
        result = 31 * result + (thumbnail_url != null ? thumbnail_url.hashCode() : 0);
        result = 31 * result + thumbnail_width;
        result = 31 * result + thumbnail_height;
        return result;
    }
}
