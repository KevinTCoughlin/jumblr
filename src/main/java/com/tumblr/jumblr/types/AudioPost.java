package com.tumblr.jumblr.types;

import java.io.File;
import java.util.Map;

/**
 * This class represents a post of type "audio"
 * @author jc
 */
public class AudioPost extends Post {

    private String caption, player, audio_url;
    private Integer plays;
    private String album_art, artist, album, track_name;
    private Integer track_number, year;

    private File data;
    private String external_url;

    /**
     * Get the audio URL for this post
     * @return the audio URL
     */
    public String getAudioUrl() {
        return audio_url;
    }

    /**
     * Get the play count for this post
     * @return the play count
     */
    public Integer getPlayCount() {
        return plays;
    }

    /**
     * Get the track name for this post
     * @return the track name
     */
    public String getTrackName() {
        return track_name;
    }

    /**
     * Get the album for this post
     * @return the album name
     */
    public String getAlbumName() {
        return album;
    }

    /**
     * Get the artist for this post
     * @return the artist
     */
    public String getArtistName() {
        return artist;
    }

    /**
     * Get the album art for this post
     * @return the album art
     */
    public String getAlbumArtUrl() {
        return album_art;
    }

    /**
     * Get the year for this post
     * @return the year
     */
    public Integer getYear() {
        return year;
    }

    /**
     * Get the track number for this post
     * @return the track number
     */
    public Integer getTrackNumber() {
        return track_number;
    }

    /**
     * Get the caption for this post
     * @return the caption
     */
    public String getCaption () {
        return caption;
    }

    /**
     * Get the embed code for this Post
     * @return the embed code
     */
    public String getEmbedCode() {
        return player;
    }

    /**
     * Set the external url for this post
     * @param url the external url
     * @throws IllegalArgumentException when data is already set
     */
    public void setExternalUrl(String url) {
        if (this.data != null) {
            throw new IllegalArgumentException("Cannot provide both data & external_url");
        }
        this.external_url = url;
    }

    /**
     * Set the data for this post
     * @param file the file to read from
     * @throws IllegalArgumentException source is already set
     */
    public void setData(File file) {
        if (external_url != null) {
            throw new IllegalArgumentException("Cannot supply both externalUrl & data");
        }
        this.data = file;
    }

    /**
     * Set the caption for this post
     * @param caption the caption
     */
    public void setCaption(String caption) {
        this.caption = caption;
    }

    /**
     * Get the details about this post (along with base details)
     * @return the detail
     */
    @Override
    public Map<String, Object> detail() {
        Map<String, Object> details = super.detail();
        details.put("type", "audio");
        details.put("caption", caption);
        details.put("data", data);
        details.put("external_url", external_url);
        return details;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof AudioPost)) return false;
        if (!super.equals(o)) return false;

        AudioPost audioPost = (AudioPost) o;

        if (caption != null ? !caption.equals(audioPost.caption) : audioPost.caption != null) return false;
        if (player != null ? !player.equals(audioPost.player) : audioPost.player != null) return false;
        if (audio_url != null ? !audio_url.equals(audioPost.audio_url) : audioPost.audio_url != null) return false;
        if (plays != null ? !plays.equals(audioPost.plays) : audioPost.plays != null) return false;
        if (album_art != null ? !album_art.equals(audioPost.album_art) : audioPost.album_art != null) return false;
        if (artist != null ? !artist.equals(audioPost.artist) : audioPost.artist != null) return false;
        if (album != null ? !album.equals(audioPost.album) : audioPost.album != null) return false;
        if (track_name != null ? !track_name.equals(audioPost.track_name) : audioPost.track_name != null) return false;
        if (track_number != null ? !track_number.equals(audioPost.track_number) : audioPost.track_number != null)
            return false;
        if (year != null ? !year.equals(audioPost.year) : audioPost.year != null) return false;
        if (data != null ? !data.equals(audioPost.data) : audioPost.data != null) return false;
        return !(external_url != null ? !external_url.equals(audioPost.external_url) : audioPost.external_url != null);

    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (caption != null ? caption.hashCode() : 0);
        result = 31 * result + (player != null ? player.hashCode() : 0);
        result = 31 * result + (audio_url != null ? audio_url.hashCode() : 0);
        result = 31 * result + (plays != null ? plays.hashCode() : 0);
        result = 31 * result + (album_art != null ? album_art.hashCode() : 0);
        result = 31 * result + (artist != null ? artist.hashCode() : 0);
        result = 31 * result + (album != null ? album.hashCode() : 0);
        result = 31 * result + (track_name != null ? track_name.hashCode() : 0);
        result = 31 * result + (track_number != null ? track_number.hashCode() : 0);
        result = 31 * result + (year != null ? year.hashCode() : 0);
        result = 31 * result + (data != null ? data.hashCode() : 0);
        result = 31 * result + (external_url != null ? external_url.hashCode() : 0);
        return result;
    }
}