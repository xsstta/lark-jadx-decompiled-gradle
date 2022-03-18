package com.ss.android.lark.image.entity;

import android.text.TextUtils;
import com.bumptech.glide.load.AbstractC2265c;
import com.ss.android.lark.log.Log;
import java.security.MessageDigest;
import java.util.Objects;

public class AvatarImage implements AbstractC2265c {
    private volatile byte[] cacheKeyBytes;
    private CutType cutType;
    private String entityId;
    private ImageFormat format;
    private String fsUnit;
    private int height;
    private boolean isOnlyLocal;
    private String key;
    private boolean noop;
    private int quality;
    private int width;

    public CutType getCutType() {
        return this.cutType;
    }

    public String getEntityIdStr() {
        return this.entityId;
    }

    public ImageFormat getFormat() {
        return this.format;
    }

    public String getFsUnit() {
        return this.fsUnit;
    }

    public int getHeight() {
        return this.height;
    }

    public String getImageId() {
        return this.key;
    }

    public String getKey() {
        return this.key;
    }

    public int getQuality() {
        return this.quality;
    }

    public int getWidth() {
        return this.width;
    }

    public boolean isNoop() {
        return this.noop;
    }

    public boolean isOnlyLocal() {
        return this.isOnlyLocal;
    }

    public static class Builder {
        public CutType cutType = CutType.FACE;
        public String entityId;
        public ImageFormat format = ImageFormat.WEBP;
        public String fsUnit;
        public int height;
        public boolean isOnlyLocal;
        public String key;
        public boolean noop;
        public int quality = 70;
        public int width;

        public AvatarImage build() {
            return new AvatarImage(this);
        }

        public Builder cutType(CutType cutType2) {
            this.cutType = cutType2;
            return this;
        }

        public Builder format(ImageFormat imageFormat) {
            this.format = imageFormat;
            return this;
        }

        public Builder fsUnit(String str) {
            this.fsUnit = str;
            return this;
        }

        public Builder isOnlyLocal(boolean z) {
            this.isOnlyLocal = z;
            return this;
        }

        public Builder noop(boolean z) {
            this.noop = z;
            return this;
        }

        public Builder quality(int i) {
            this.quality = i;
            return this;
        }

        public Builder(String str) {
            this.fsUnit = str;
        }

        public static Builder obtain(String str, String str2, int i, int i2) {
            return new Builder(str, str2, i, i2);
        }

        private Builder(String str, String str2, int i, int i2) {
            this.key = str;
            this.entityId = str2;
            this.width = i;
            this.height = i2;
        }
    }

    private byte[] getCacheKeyBytes() {
        if (this.cacheKeyBytes == null) {
            this.cacheKeyBytes = getId().getBytes(f7599a);
        }
        return this.cacheKeyBytes;
    }

    public long getEntityId() {
        if (TextUtils.isEmpty(this.entityId)) {
            return 0;
        }
        try {
            return Long.parseLong(this.entityId);
        } catch (NumberFormatException unused) {
            Log.m165383e("AvatarImage", "Failed to convert id to long, avatar is:" + this);
            return 0;
        }
    }

    public String toString() {
        return "avatar#Key is: " + this.key + ", entityId is: " + this.entityId + ", width is: " + this.width + ", height is: " + this.height;
    }

    private String getId() {
        if (this.noop) {
            return this.key + "_origin";
        }
        return this.key + "_w" + this.width + "_h" + this.height + "_format" + this.format + "_quality" + this.quality + "isOnlyLocal" + this.isOnlyLocal;
    }

    @Override // com.bumptech.glide.load.AbstractC2265c
    public int hashCode() {
        return Objects.hash(this.key, this.entityId, Integer.valueOf(this.width), Integer.valueOf(this.height), this.cutType, this.format, Integer.valueOf(this.quality), Boolean.valueOf(this.noop), Boolean.valueOf(this.isOnlyLocal));
    }

    public AvatarImage setCutType(CutType cutType2) {
        this.cutType = cutType2;
        return this;
    }

    public AvatarImage setHeight(int i) {
        this.height = i;
        return this;
    }

    public AvatarImage setImageFormat(ImageFormat imageFormat) {
        this.format = imageFormat;
        return this;
    }

    public AvatarImage setKey(String str) {
        this.key = str;
        return this;
    }

    public AvatarImage setNoop(boolean z) {
        this.noop = z;
        return this;
    }

    public AvatarImage setOnlyLocal(boolean z) {
        this.isOnlyLocal = z;
        return this;
    }

    public AvatarImage setWidth(int i) {
        this.width = i;
        return this;
    }

    @Override // com.bumptech.glide.load.AbstractC2265c
    public void updateDiskCacheKey(MessageDigest messageDigest) {
        messageDigest.update(getCacheKeyBytes());
    }

    private AvatarImage(Builder builder) {
        this.cutType = CutType.FACE;
        this.format = ImageFormat.WEBP;
        this.quality = 70;
        this.key = builder.key;
        this.entityId = builder.entityId;
        this.width = builder.width;
        this.height = builder.height;
        this.cutType = builder.cutType;
        this.format = builder.format;
        this.quality = builder.quality;
        this.noop = builder.noop;
        this.isOnlyLocal = builder.isOnlyLocal;
        this.fsUnit = builder.fsUnit;
    }

    @Override // com.bumptech.glide.load.AbstractC2265c
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AvatarImage avatarImage = (AvatarImage) obj;
        if (this.width == avatarImage.width && this.height == avatarImage.height && this.quality == avatarImage.quality && this.noop == avatarImage.noop && this.isOnlyLocal == avatarImage.isOnlyLocal && Objects.equals(this.key, avatarImage.key)) {
            String str = this.entityId;
            if (Objects.equals(str, str) && this.cutType == avatarImage.cutType && this.format == avatarImage.format) {
                return true;
            }
            return false;
        }
        return false;
    }
}
