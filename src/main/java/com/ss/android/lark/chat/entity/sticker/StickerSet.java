package com.ss.android.lark.chat.entity.sticker;

import android.text.TextUtils;
import com.larksuite.framework.utils.CollectionUtils;
import com.ss.android.lark.image.entity.Image;
import java.io.Serializable;
import java.util.List;

public class StickerSet implements Serializable {
    private Archive mArchive;
    private String mAuthorId;
    private Image mCover;
    private String mDescription;
    private boolean mHasPaid;
    private Image mIcon;
    private Perm mPerm;
    private Image mPreview;
    private String mStickerSetId;
    private StickerSetType mStickerSetType;
    private List<Sticker> mStickers;
    private String mTitle;
    private long mUpdateTime;
    private int mVersion;

    public enum Perm {
        UNKNOWN(0),
        ALONE(1),
        OWN(2);
        
        private int mValue;

        public int getNumber() {
            return this.mValue;
        }

        public static Perm valueOf(int i) {
            return forNumber(i);
        }

        public static Perm forNumber(int i) {
            if (i == 0) {
                return UNKNOWN;
            }
            if (i == 1) {
                return ALONE;
            }
            if (i != 2) {
                return null;
            }
            return OWN;
        }

        private Perm(int i) {
            this.mValue = i;
        }
    }

    public Archive getArchive() {
        return this.mArchive;
    }

    public String getAuthorId() {
        return this.mAuthorId;
    }

    public Image getCover() {
        return this.mCover;
    }

    public String getDescription() {
        return this.mDescription;
    }

    public Image getIcon() {
        return this.mIcon;
    }

    public Perm getPerm() {
        return this.mPerm;
    }

    public Image getPreview() {
        return this.mPreview;
    }

    public String getStickerSetId() {
        return this.mStickerSetId;
    }

    public StickerSetType getStickerSetType() {
        return this.mStickerSetType;
    }

    public List<Sticker> getStickers() {
        return this.mStickers;
    }

    public String getTitle() {
        return this.mTitle;
    }

    public long getUpdateTime() {
        return this.mUpdateTime;
    }

    public int getVersion() {
        return this.mVersion;
    }

    public boolean isHasPaid() {
        return this.mHasPaid;
    }

    public String getArchiveKey() {
        Archive archive = this.mArchive;
        if (archive == null) {
            return "";
        }
        return archive.getKey();
    }

    public String getPreviewKey() {
        Image image = this.mPreview;
        if (image == null) {
            return "";
        }
        return image.getKey();
    }

    public boolean isAdded() {
        if (this.mPerm == Perm.OWN) {
            return true;
        }
        return false;
    }

    public String getArchiveUrl() {
        Archive archive = this.mArchive;
        if (archive == null) {
            return "";
        }
        List<String> urls = archive.getUrls();
        if (CollectionUtils.isEmpty(urls)) {
            return "";
        }
        return urls.get(0);
    }

    public void setArchive(Archive archive) {
        this.mArchive = archive;
    }

    public void setAuthorId(String str) {
        this.mAuthorId = str;
    }

    public void setCover(Image image) {
        this.mCover = image;
    }

    public void setDescription(String str) {
        this.mDescription = str;
    }

    public void setHasPaid(boolean z) {
        this.mHasPaid = z;
    }

    public void setIcon(Image image) {
        this.mIcon = image;
    }

    public void setPerm(Perm perm) {
        this.mPerm = perm;
    }

    public void setPreview(Image image) {
        this.mPreview = image;
    }

    public void setStickerSetId(String str) {
        this.mStickerSetId = str;
    }

    public void setStickerSetType(StickerSetType stickerSetType) {
        this.mStickerSetType = stickerSetType;
    }

    public void setStickers(List<Sticker> list) {
        this.mStickers = list;
    }

    public void setTitle(String str) {
        this.mTitle = str;
    }

    public void setUpdateTime(long j) {
        this.mUpdateTime = j;
    }

    public void setVersion(int i) {
        this.mVersion = i;
    }

    public boolean equals(Object obj) {
        List<Sticker> list;
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            StickerSet stickerSet = (StickerSet) obj;
            if (!(TextUtils.equals(this.mStickerSetId, stickerSet.getStickerSetId()) && this.mPerm == stickerSet.mPerm && (list = this.mStickers) != null && stickerSet.mStickers != null && list.size() == stickerSet.getStickers().size())) {
                return false;
            }
            int size = this.mStickers.size();
            for (int i = 0; i < size; i++) {
                if (!this.mStickers.get(i).equals(stickerSet.getStickers().get(i))) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }
}
