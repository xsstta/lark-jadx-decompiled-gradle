package com.ss.android.lark.search.impl.func.chatinside.detail.image.viewdata;

import com.ss.android.lark.chat.entity.image.ImageSet;
import java.io.Serializable;
import java.util.Objects;

public class ChatInsideSearchImageViewData implements Serializable {
    private String chatId;
    private ImageSet imageSet;
    private boolean isFromPostMessage;
    private boolean isSelectStatus;
    private boolean isThread;
    private String labelText;
    private String messageId;
    private int position;
    private int sectionFirstPosition;
    private int type;

    public String getChatId() {
        return this.chatId;
    }

    public ImageSet getImageSet() {
        return this.imageSet;
    }

    public String getLabelText() {
        return this.labelText;
    }

    public String getMessageId() {
        return this.messageId;
    }

    public int getPosition() {
        return this.position;
    }

    public int getSectionFirstPosition() {
        return this.sectionFirstPosition;
    }

    public int getType() {
        return this.type;
    }

    public boolean isFromPostMessage() {
        return this.isFromPostMessage;
    }

    public boolean isSelectStatus() {
        return this.isSelectStatus;
    }

    public boolean isThread() {
        return this.isThread;
    }

    public int hashCode() {
        return Objects.hash(Integer.valueOf(this.type), this.imageSet, Integer.valueOf(this.sectionFirstPosition), this.messageId, this.chatId, Boolean.valueOf(this.isThread), this.labelText, Boolean.valueOf(this.isFromPostMessage));
    }

    public void setChatId(String str) {
        this.chatId = str;
    }

    public void setFromPostMessage(boolean z) {
        this.isFromPostMessage = z;
    }

    public void setImageSet(ImageSet imageSet2) {
        this.imageSet = imageSet2;
    }

    public void setIsSelectStatus(boolean z) {
        this.isSelectStatus = z;
    }

    public void setLabelText(String str) {
        this.labelText = str;
    }

    public void setMessageId(String str) {
        this.messageId = str;
    }

    public void setPosition(int i) {
        this.position = i;
    }

    public void setSectionFirstPosition(int i) {
        this.sectionFirstPosition = i;
    }

    public void setThread(boolean z) {
        this.isThread = z;
    }

    public void setType(int i) {
        this.type = i;
    }

    public boolean equals(Object obj) {
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ChatInsideSearchImageViewData chatInsideSearchImageViewData = (ChatInsideSearchImageViewData) obj;
        if (Objects.equals(Integer.valueOf(this.type), Integer.valueOf(chatInsideSearchImageViewData.getType())) && Objects.equals(this.labelText, chatInsideSearchImageViewData.getLabelText()) && Objects.equals(this.messageId, chatInsideSearchImageViewData.messageId) && Objects.equals(Boolean.valueOf(this.isSelectStatus), Boolean.valueOf(chatInsideSearchImageViewData.isSelectStatus())) && Objects.equals(Boolean.valueOf(this.isFromPostMessage), Boolean.valueOf(chatInsideSearchImageViewData.isFromPostMessage())) && Objects.equals(Integer.valueOf(this.position), Integer.valueOf(chatInsideSearchImageViewData.position)) && Objects.equals(Integer.valueOf(this.sectionFirstPosition), Integer.valueOf(chatInsideSearchImageViewData.sectionFirstPosition))) {
            return Objects.equals(this.imageSet, chatInsideSearchImageViewData.imageSet);
        }
        return false;
    }
}
