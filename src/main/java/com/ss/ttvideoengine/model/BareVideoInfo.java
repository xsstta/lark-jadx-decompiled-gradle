package com.ss.ttvideoengine.model;

import com.ss.ttvideoengine.Resolution;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

public class BareVideoInfo extends VideoInfo {
    public long mBitrate;
    public String mCheckInfo;
    public String mCodecType;
    public long mDuration;
    public long mExpire;
    public String mFileHash;
    public String mFileId;
    public String mFormat;
    public String mGear;
    public int mMediaType;
    public String mQuality;
    public Resolution mResolution;
    public long mSize;
    public String mSpadea;
    public List<String> mUrls;
    public int mVHeight;
    public int mVWidth;

    @Override // com.ss.ttvideoengine.model.VideoInfo, com.ss.ttvideoengine.model.IVideoInfo
    public MediaBitrateFitterInfo getBitrateFitterInfo() {
        return null;
    }

    @Override // com.ss.ttvideoengine.model.VideoInfo, com.ss.ttvideoengine.model.IVideoInfo
    public boolean getValueBool(int i) {
        return false;
    }

    @Override // com.ss.ttvideoengine.model.VideoInfo, com.ss.ttvideoengine.model.IVideoInfo
    public JSONObject toBashJsonObject() {
        return null;
    }

    @Override // com.ss.ttvideoengine.model.VideoInfo, com.ss.ttvideoengine.model.IVideoInfo
    public int getMediatype() {
        return this.mMediaType;
    }

    @Override // com.ss.ttvideoengine.model.VideoInfo, com.ss.ttvideoengine.model.IVideoInfo
    public Resolution getResolution() {
        return this.mResolution;
    }

    private BareVideoInfo() {
        super(null);
        this.mMediaType = -1;
        this.mExpire = -1;
    }

    public static class Builder {
        private long mBitrate;
        private String mCheckInfo;
        private String mCodecType;
        private long mDuration;
        private long mExpire = -1;
        private String mFileHash;
        private String mFileId;
        private String mFormat;
        private String mGear;
        private int mMediaType;
        private String mQuality;
        private Resolution mResolution;
        private long mSize;
        private String mSpadea;
        private List<String> mUrls;
        private int mVHeight;
        private int mVWidth;

        public BareVideoInfo build() {
            BareVideoInfo bareVideoInfo = new BareVideoInfo();
            bareVideoInfo.mMediaType = this.mMediaType;
            bareVideoInfo.mVWidth = this.mVWidth;
            bareVideoInfo.mVHeight = this.mVHeight;
            bareVideoInfo.mBitrate = this.mBitrate;
            bareVideoInfo.mDuration = this.mDuration;
            bareVideoInfo.mSize = this.mSize;
            bareVideoInfo.mExpire = this.mExpire;
            bareVideoInfo.mFileHash = this.mFileHash;
            bareVideoInfo.mFileId = this.mFileId;
            bareVideoInfo.mCodecType = this.mCodecType;
            bareVideoInfo.mFormat = this.mFormat;
            bareVideoInfo.mCheckInfo = this.mCheckInfo;
            bareVideoInfo.mResolution = this.mResolution;
            bareVideoInfo.mQuality = this.mQuality;
            bareVideoInfo.mGear = this.mGear;
            bareVideoInfo.mSpadea = this.mSpadea;
            bareVideoInfo.mUrls = this.mUrls;
            return bareVideoInfo;
        }

        public Builder bitrate(long j) {
            this.mBitrate = j;
            return this;
        }

        public Builder checkInfo(String str) {
            this.mCheckInfo = str;
            return this;
        }

        public Builder codecType(String str) {
            this.mCodecType = str;
            return this;
        }

        public Builder duration(long j) {
            this.mDuration = j;
            return this;
        }

        public Builder expire(long j) {
            this.mExpire = j;
            return this;
        }

        public Builder fileHash(String str) {
            this.mFileHash = str;
            return this;
        }

        public Builder fileId(String str) {
            this.mFileId = str;
            return this;
        }

        public Builder format(String str) {
            this.mFormat = str;
            return this;
        }

        public Builder gear(String str) {
            this.mGear = str;
            return this;
        }

        public Builder mediaType(int i) {
            this.mMediaType = i;
            return this;
        }

        public Builder quality(String str) {
            this.mQuality = str;
            return this;
        }

        public Builder resolution(Resolution resolution) {
            this.mResolution = resolution;
            return this;
        }

        public Builder size(long j) {
            this.mSize = j;
            return this;
        }

        public Builder spadea(String str) {
            this.mSpadea = str;
            return this;
        }

        public Builder urls(List<String> list) {
            this.mUrls = list;
            return this;
        }

        public Builder vHeight(int i) {
            this.mVHeight = i;
            return this;
        }

        public Builder vWidth(int i) {
            this.mVWidth = i;
            return this;
        }

        public Builder addUrl(String str) {
            if (this.mUrls == null) {
                this.mUrls = new ArrayList();
            }
            this.mUrls.add(str);
            return this;
        }
    }

    @Override // com.ss.ttvideoengine.model.VideoInfo, com.ss.ttvideoengine.model.IVideoInfo
    public Map toMediaInfo() {
        String str;
        HashMap hashMap = new HashMap();
        hashMap.put("file_id", getValueStr(28));
        if (getMediatype() == VideoRef.TYPE_VIDEO) {
            str = "video";
        } else {
            str = "audio";
        }
        hashMap.put("media_type", str);
        hashMap.put("file_size", Long.valueOf(getValueLong(12)));
        hashMap.put("bitrate", Integer.valueOf(getValueInt(3)));
        hashMap.put("quality", getValueStr(18));
        hashMap.put("width", Integer.valueOf(getValueInt(1)));
        hashMap.put("height", Integer.valueOf(getValueInt(2)));
        hashMap.put("codec", getValueStr(8));
        hashMap.put("urls", getValueStrArr(16));
        hashMap.put("file_hash", getValueStr(15));
        return hashMap;
    }

    @Override // com.ss.ttvideoengine.model.VideoInfo, com.ss.ttvideoengine.model.IVideoInfo
    public int getValueInt(int i) {
        long j;
        if (i == 1) {
            return this.mVWidth;
        }
        if (i == 2) {
            return this.mVHeight;
        }
        if (i == 3) {
            j = this.mBitrate;
        } else if (i != 27) {
            return 0;
        } else {
            j = this.mDuration;
        }
        return (int) j;
    }

    @Override // com.ss.ttvideoengine.model.VideoInfo, com.ss.ttvideoengine.model.IVideoInfo
    public long getValueLong(int i) {
        if (i == 12) {
            return this.mSize;
        }
        if (i != 30) {
            return 0;
        }
        return this.mExpire;
    }

    @Override // com.ss.ttvideoengine.model.VideoInfo, com.ss.ttvideoengine.model.IVideoInfo
    public String[] getValueStrArr(int i) {
        if (i != 16) {
            return new String[0];
        }
        List<String> list = this.mUrls;
        if (list != null) {
            return (String[]) list.toArray(new String[0]);
        }
        return new String[0];
    }

    @Override // com.ss.ttvideoengine.model.VideoInfo, com.ss.ttvideoengine.model.IVideoInfo
    public String getValueStr(int i) {
        if (i == 5) {
            return this.mSpadea;
        }
        if (i == 6) {
            return this.mFormat;
        }
        if (i == 7) {
            return this.mGear;
        }
        if (i == 8) {
            return this.mCodecType;
        }
        if (i == 15) {
            return this.mFileHash;
        }
        if (i == 18) {
            return this.mQuality;
        }
        if (i == 28) {
            return this.mFileId;
        }
        if (i != 31) {
            return null;
        }
        return this.mCheckInfo;
    }
}
