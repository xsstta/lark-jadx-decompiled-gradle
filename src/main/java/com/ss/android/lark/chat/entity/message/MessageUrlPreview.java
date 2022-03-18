package com.ss.android.lark.chat.entity.message;

import com.ss.android.lark.chat.entity.image.ImageSet;
import java.io.Serializable;

public class MessageUrlPreview implements Serializable {
    private int count;
    private ImageSet coverImage;
    private String description;
    private ImageSet icon;
    private boolean isDeleted;
    private String messageId;
    private int offset;
    private PreviewVideo previewVideo;
    private int sequenceId;
    private String title;
    private String url;

    public int getCount() {
        return this.count;
    }

    public ImageSet getCoverImage() {
        return this.coverImage;
    }

    public String getDescription() {
        return this.description;
    }

    public ImageSet getIcon() {
        return this.icon;
    }

    public String getMessageId() {
        return this.messageId;
    }

    public int getOffset() {
        return this.offset;
    }

    public PreviewVideo getPreviewVideo() {
        return this.previewVideo;
    }

    public int getSequenceId() {
        return this.sequenceId;
    }

    public String getTitle() {
        return this.title;
    }

    public String getUrl() {
        return this.url;
    }

    public boolean isDeleted() {
        return this.isDeleted;
    }

    public void setCount(int i) {
        this.count = i;
    }

    public void setCoverImage(ImageSet imageSet) {
        this.coverImage = imageSet;
    }

    public void setDeleted(boolean z) {
        this.isDeleted = z;
    }

    public void setDescription(String str) {
        this.description = str;
    }

    public void setIcon(ImageSet imageSet) {
        this.icon = imageSet;
    }

    public void setMessageId(String str) {
        this.messageId = str;
    }

    public void setOffset(int i) {
        this.offset = i;
    }

    public void setPreviewVideo(PreviewVideo previewVideo2) {
        this.previewVideo = previewVideo2;
    }

    public void setSequenceId(int i) {
        this.sequenceId = i;
    }

    public void setTitle(String str) {
        this.title = str;
    }

    public void setUrl(String str) {
        this.url = str;
    }
}
