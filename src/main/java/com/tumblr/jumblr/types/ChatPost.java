package com.tumblr.jumblr.types;

import java.util.List;
import java.util.Map;

/**
 * This class represents a post of type "chat"
 * @author jc
 */
public class ChatPost extends SafePost {

    private String title;
    private String body;
    private List<Dialogue> dialogue;

    /**
     * Get the dialogues for this post
     * @return an Array[Dialogue]
     */
    public List<Dialogue> getDialogue() {
        return dialogue;
    }

    /**
     * Get the title for this post
     * @return the title
     */
    public String getTitle() {
        return title;
    }

    /**
     * Get the body for this post
     * @return the body
     */
    public String getBody() {
        return body;
    }

    /**
     * Set the body for this post
     * @param body the body to set
     */
    public void setBody(String body) {
        this.body = body;
    }

    /**
     * Set the title for this post
     * @param title the title to set
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * Get the details for this post (and the base details)
     * @return the detail
     */
    @Override
    public Map<String, Object> detail() {
        Map<String, Object> details = super.detail();
        details.put("title", title);
        details.put("conversation", body);
        details.put("type", "chat");
        return details;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ChatPost)) return false;
        if (!super.equals(o)) return false;

        ChatPost chatPost = (ChatPost) o;

        if (title != null ? !title.equals(chatPost.title) : chatPost.title != null) return false;
        if (body != null ? !body.equals(chatPost.body) : chatPost.body != null) return false;
        return !(dialogue != null ? !dialogue.equals(chatPost.dialogue) : chatPost.dialogue != null);

    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (title != null ? title.hashCode() : 0);
        result = 31 * result + (body != null ? body.hashCode() : 0);
        result = 31 * result + (dialogue != null ? dialogue.hashCode() : 0);
        return result;
    }
}
