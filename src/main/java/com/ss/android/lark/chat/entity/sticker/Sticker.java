package com.ss.android.lark.chat.entity.sticker;

import android.text.TextUtils;
import com.larksuite.framework.utils.p1203a.AbstractC26248b;
import com.ss.android.lark.chat.entity.image.ImageSet;
import com.ss.android.lark.image.entity.Image;
import java.io.Serializable;

public class Sticker implements AbstractC26248b<Sticker>, Serializable, Comparable {
    private String mDesc;
    private boolean mHasPaid;
    private ImageSet mImageSet;
    private Mode mMode;
    private int mPosition;
    private String mSmallUrl;
    private String mStickerId;
    private String mStickerSetId;

    public enum Mode {
        UNKNOWN(0),
        STICKER(1),
        MEME(2);
        
        private int mValue;

        public int getNumber() {
            return this.mValue;
        }

        public static Mode valueOf(int i) {
            return forNumber(i);
        }

        public static Mode forNumber(int i) {
            if (i == 0) {
                return UNKNOWN;
            }
            if (i == 1) {
                return STICKER;
            }
            if (i != 2) {
                return null;
            }
            return MEME;
        }

        private Mode(int i) {
            this.mValue = i;
        }
    }

    public String getDesc() {
        return this.mDesc;
    }

    public ImageSet getImageSet() {
        return this.mImageSet;
    }

    public Mode getMode() {
        return this.mMode;
    }

    public int getPosition() {
        return this.mPosition;
    }

    public String getSmallUrl() {
        return this.mSmallUrl;
    }

    public String getStickerId() {
        return this.mStickerId;
    }

    public String getStickerSetId() {
        return this.mStickerSetId;
    }

    public boolean isHasPaid() {
        return this.mHasPaid;
    }

    private Image getOriginImage() {
        ImageSet imageSet = getImageSet();
        if (imageSet == null) {
            return null;
        }
        return imageSet.getOrigin();
    }

    public int getOriginImageHeight() {
        Image originImage = getOriginImage();
        if (originImage == null) {
            return 0;
        }
        return originImage.getHeight();
    }

    public String getOriginImageKey() {
        Image originImage = getOriginImage();
        if (originImage == null) {
            return "";
        }
        return originImage.getKey();
    }

    public int getOriginImageWidth() {
        Image originImage = getOriginImage();
        if (originImage == null) {
            return 0;
        }
        return originImage.getWidth();
    }

    public String getImageKey() {
        String thumbnailImageKey = getThumbnailImageKey();
        if (TextUtils.isEmpty(thumbnailImageKey)) {
            thumbnailImageKey = getSmallUrl();
        }
        if (TextUtils.isEmpty(thumbnailImageKey)) {
            return getOriginImageKey();
        }
        return thumbnailImageKey;
    }

    public String getThumbnailImageKey() {
        Image thumbnail;
        ImageSet imageSet = getImageSet();
        if (imageSet == null || (thumbnail = imageSet.getThumbnail()) == null) {
            return "";
        }
        return thumbnail.getKey();
    }

    public void setDesc(String str) {
        this.mDesc = str;
    }

    public void setHasPaid(boolean z) {
        this.mHasPaid = z;
    }

    public void setImageSet(ImageSet imageSet) {
        this.mImageSet = imageSet;
    }

    public void setMode(Mode mode) {
        this.mMode = mode;
    }

    public void setPosition(int i) {
        this.mPosition = i;
    }

    public void setSmallUrl(String str) {
        this.mSmallUrl = str;
    }

    public void setStickerId(String str) {
        this.mStickerId = str;
    }

    public void setStickerSetId(String str) {
        this.mStickerSetId = str;
    }

    @Override // java.lang.Comparable
    public int compareTo(Object obj) {
        if (obj instanceof Sticker) {
            Sticker sticker = (Sticker) obj;
            if (getPosition() < sticker.getPosition()) {
                return -1;
            }
            if (getPosition() > sticker.getPosition()) {
                return 1;
            }
        }
        return 0;
    }

    public boolean isItemSame(Sticker sticker) {
        if (sticker != null && TextUtils.equals(this.mStickerId, sticker.getStickerId()) && TextUtils.equals(this.mStickerSetId, sticker.getStickerSetId())) {
            return true;
        }
        return false;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Sticker sticker = (Sticker) obj;
        if (!TextUtils.equals(this.mStickerId, sticker.getStickerId()) || !TextUtils.equals(getOriginImageKey(), sticker.getOriginImageKey()) || !TextUtils.equals(getThumbnailImageKey(), sticker.getThumbnailImageKey())) {
            return false;
        }
        return true;
    }

    public boolean isContentSame(Sticker sticker) {
        if (sticker != null && isItemSame(sticker) && TextUtils.equals(getOriginImageKey(), sticker.getOriginImageKey()) && TextUtils.equals(getThumbnailImageKey(), sticker.getThumbnailImageKey())) {
            return true;
        }
        return false;
    }
}
