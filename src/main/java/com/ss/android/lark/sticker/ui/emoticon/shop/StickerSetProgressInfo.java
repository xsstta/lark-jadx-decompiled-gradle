package com.ss.android.lark.sticker.ui.emoticon.shop;

import com.ss.android.lark.chat.entity.sticker.StickerSet;
import java.io.Serializable;

public class StickerSetProgressInfo implements Serializable {
    private long mDownLoadProgress;
    private Download mDownload = Download.DONE;
    private StickerSet mStickerSet;
    private long mTotalSize;

    public enum Download {
        LOADING(0),
        DONE(1);
        
        private int mValue;

        public int getNumber() {
            return this.mValue;
        }

        public static Download valueOf(int i) {
            return forNumber(i);
        }

        public static Download forNumber(int i) {
            if (i == 0) {
                return LOADING;
            }
            if (i != 1) {
                return DONE;
            }
            return DONE;
        }

        private Download(int i) {
            this.mValue = i;
        }
    }

    public long getDownLoadProgress() {
        return this.mDownLoadProgress;
    }

    public Download getDownload() {
        return this.mDownload;
    }

    public StickerSet getStickerSet() {
        return this.mStickerSet;
    }

    public long getTotalSize() {
        return this.mTotalSize;
    }

    public int hashCode() {
        return super.hashCode();
    }

    public String getStickerSetId() {
        StickerSet stickerSet = this.mStickerSet;
        if (stickerSet == null) {
            return "";
        }
        return stickerSet.getStickerSetId();
    }

    public boolean isDownloading() {
        if (this.mDownload == Download.LOADING) {
            return true;
        }
        return false;
    }

    public boolean isHadPaid() {
        StickerSet stickerSet = this.mStickerSet;
        if (stickerSet == null) {
            return false;
        }
        return stickerSet.isHasPaid();
    }

    public boolean needRegisterPush() {
        StickerSet stickerSet = this.mStickerSet;
        if (stickerSet != null && stickerSet.isHasPaid() && !this.mStickerSet.isAdded()) {
            return true;
        }
        return false;
    }

    public void setDownLoadProgress(long j) {
        this.mDownLoadProgress = j;
    }

    public void setDownload(Download download) {
        this.mDownload = download;
    }

    public void setStickerSet(StickerSet stickerSet) {
        this.mStickerSet = stickerSet;
    }

    public void setTotalSize(long j) {
        this.mTotalSize = j;
    }

    public void setPerm(StickerSet.Perm perm) {
        StickerSet stickerSet = this.mStickerSet;
        if (stickerSet != null) {
            stickerSet.setPerm(perm);
        }
    }

    public boolean equals(Object obj) {
        StickerSet stickerSet;
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass() || (stickerSet = this.mStickerSet) == null) {
            return false;
        }
        StickerSetProgressInfo stickerSetProgressInfo = (StickerSetProgressInfo) obj;
        if (this.mDownload == stickerSetProgressInfo.mDownload && this.mTotalSize == stickerSetProgressInfo.mTotalSize && this.mDownLoadProgress == stickerSetProgressInfo.mDownLoadProgress && stickerSet.equals(stickerSetProgressInfo.mStickerSet)) {
            return true;
        }
        return false;
    }
}
