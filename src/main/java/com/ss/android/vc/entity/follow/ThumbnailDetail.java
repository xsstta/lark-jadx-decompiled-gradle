package com.ss.android.vc.entity.follow;

import java.io.Serializable;

public class ThumbnailDetail implements Serializable {
    private static final long serialVersionUID = 1;
    private CipherType cipherType;
    private String decryptKey;
    private String nonce;
    private String thumbnailUrl;

    public enum CipherType {
        UNENCRYPTED(0),
        AES_256_GCM(1),
        AES_CBC(2);
        
        private int value;

        public int getNumber() {
            return this.value;
        }

        public static CipherType valueOf(int i) {
            return forNumber(i);
        }

        public static CipherType forNumber(int i) {
            if (i == 0) {
                return UNENCRYPTED;
            }
            if (i == 1) {
                return AES_256_GCM;
            }
            if (i != 2) {
                return null;
            }
            return AES_CBC;
        }

        private CipherType(int i) {
            this.value = i;
        }
    }

    public CipherType getCipherType() {
        return this.cipherType;
    }

    public String getDecryptKey() {
        return this.decryptKey;
    }

    public String getNonce() {
        return this.nonce;
    }

    public String getThumbnailUrl() {
        return this.thumbnailUrl;
    }

    public String toString() {
        return "ThumbnailDetail{thumbnailUrl='" + this.thumbnailUrl + '\'' + ", decryptKey='" + this.decryptKey + '\'' + ", cipherType=" + this.cipherType + ", nonce='" + this.nonce + '\'' + '}';
    }

    public void setCipherType(CipherType cipherType2) {
        this.cipherType = cipherType2;
    }

    public void setDecryptKey(String str) {
        this.decryptKey = str;
    }

    public void setNonce(String str) {
        this.nonce = str;
    }

    public void setThumbnailUrl(String str) {
        this.thumbnailUrl = str;
    }
}
