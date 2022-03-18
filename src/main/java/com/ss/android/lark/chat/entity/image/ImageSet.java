package com.ss.android.lark.chat.entity.image;

import com.ss.android.lark.chat.entity.message.MessageIdentity;
import com.ss.android.lark.image.entity.Image;
import java.io.Serializable;
import okio.ByteString;

public class ImageSet implements Serializable {
    private static final long serialVersionUID = 3501109319906571184L;
    protected ByteString inlinePreview;
    protected Image intact;
    private boolean isFromMe;
    private boolean isOriginSource;
    protected boolean isTranslated;
    protected String key;
    protected MessageIdentity messageIdentity;
    protected Image middle;
    protected Image origin;
    private long originSize;
    protected Image thumbnail;

    public ImageSet() {
    }

    public ByteString getInlinePreview() {
        return this.inlinePreview;
    }

    public Image getIntact() {
        return this.intact;
    }

    public String getKey() {
        return this.key;
    }

    public MessageIdentity getMessageIdentity() {
        return this.messageIdentity;
    }

    public Image getMiddle() {
        return this.middle;
    }

    public Image getOrigin() {
        return this.origin;
    }

    public long getOriginSize() {
        return this.originSize;
    }

    public Image getThumbnail() {
        return this.thumbnail;
    }

    public boolean isFromMe() {
        return this.isFromMe;
    }

    public boolean isOriginSource() {
        return this.isOriginSource;
    }

    public boolean isTranslated() {
        return this.isTranslated;
    }

    public void setFromMe(boolean z) {
        this.isFromMe = z;
    }

    public void setInlinePreview(ByteString byteString) {
        this.inlinePreview = byteString;
    }

    public void setIntact(Image image) {
        this.intact = image;
    }

    public void setKey(String str) {
        this.key = str;
    }

    public void setMessageIdentity(MessageIdentity messageIdentity2) {
        this.messageIdentity = messageIdentity2;
    }

    public void setMiddle(Image image) {
        this.middle = image;
    }

    public void setOrigin(Image image) {
        this.origin = image;
    }

    public void setOriginSize(long j) {
        this.originSize = j;
    }

    public void setOriginSource(boolean z) {
        this.isOriginSource = z;
    }

    public void setThumbnail(Image image) {
        this.thumbnail = image;
    }

    public void setTranslated(boolean z) {
        this.isTranslated = z;
    }

    public ImageSet(String str, Image image, Image image2) {
        this.key = str;
        this.origin = image;
        this.thumbnail = image2;
    }

    public ImageSet(String str, Image image, Image image2, Image image3, ByteString byteString, MessageIdentity messageIdentity2) {
        this.key = str;
        this.origin = image;
        this.thumbnail = image2;
        this.middle = image3;
        this.inlinePreview = byteString;
        this.messageIdentity = messageIdentity2;
    }
}
