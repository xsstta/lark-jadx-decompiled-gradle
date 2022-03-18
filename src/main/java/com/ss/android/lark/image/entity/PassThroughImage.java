package com.ss.android.lark.image.entity;

import com.bumptech.glide.load.AbstractC2265c;
import com.bytedance.lark.pb.basic.v1.SerCrypto;
import java.io.Serializable;
import java.security.MessageDigest;
import java.util.Objects;

public class PassThroughImage implements AbstractC2265c, Serializable {
    private volatile byte[] cacheKeyBytes;
    private SerCrypto crypto;
    private String fsUnit;
    private String imageKey;

    public SerCrypto getCrypto() {
        return this.crypto;
    }

    public String getFsUnit() {
        return this.fsUnit;
    }

    public String getImageKey() {
        return this.imageKey;
    }

    private byte[] getCacheKeyBytes() {
        if (this.cacheKeyBytes == null) {
            this.cacheKeyBytes = this.imageKey.getBytes(f7599a);
        }
        return this.cacheKeyBytes;
    }

    @Override // com.bumptech.glide.load.AbstractC2265c
    public int hashCode() {
        return Objects.hash(this.imageKey, this.fsUnit);
    }

    @Override // com.bumptech.glide.load.AbstractC2265c
    public void updateDiskCacheKey(MessageDigest messageDigest) {
        messageDigest.update(getCacheKeyBytes());
    }

    @Override // com.bumptech.glide.load.AbstractC2265c
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PassThroughImage)) {
            return false;
        }
        PassThroughImage passThroughImage = (PassThroughImage) obj;
        if (!Objects.equals(this.imageKey, passThroughImage.imageKey) || !Objects.equals(this.fsUnit, passThroughImage.fsUnit)) {
            return false;
        }
        return true;
    }

    public PassThroughImage(String str, String str2) {
        init(str, str2, null);
    }

    private void init(String str, String str2, SerCrypto serCrypto) {
        this.imageKey = str;
        this.fsUnit = str2;
        this.crypto = serCrypto;
    }

    public PassThroughImage(String str, String str2, SerCrypto serCrypto) {
        init(str, str2, serCrypto);
    }
}
