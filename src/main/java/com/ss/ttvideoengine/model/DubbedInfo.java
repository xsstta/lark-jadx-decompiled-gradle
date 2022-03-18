package com.ss.ttvideoengine.model;

import android.text.TextUtils;
import org.json.JSONObject;

public class DubbedInfo {
    public int mBitrate;
    public String mCheckInfo;
    public String mFileKey;
    public int mInfoId = -1;
    public float mLoudness;
    public String mMainUrl;
    public int mMediaType;
    public float mPeak;

    public static class Builder {
        private int mBitrate;
        private String mCheckInfo;
        private String mFileKey;
        private int mInfoId = -1;
        private float mLoudness;
        private String mMainUrl;
        private int mMediaType;
        private float mPeak;

        public DubbedInfo build() {
            DubbedInfo dubbedInfo = new DubbedInfo();
            dubbedInfo.mMediaType = this.mMediaType;
            dubbedInfo.mMainUrl = this.mMainUrl;
            dubbedInfo.mCheckInfo = this.mCheckInfo;
            dubbedInfo.mInfoId = this.mInfoId;
            dubbedInfo.mBitrate = this.mBitrate;
            dubbedInfo.mLoudness = this.mLoudness;
            dubbedInfo.mPeak = this.mPeak;
            dubbedInfo.mFileKey = this.mFileKey;
            return dubbedInfo;
        }

        public Builder bitrate(int i) {
            this.mBitrate = i;
            return this;
        }

        public Builder checkInfo(String str) {
            this.mCheckInfo = str;
            return this;
        }

        public Builder fileKey(String str) {
            this.mFileKey = str;
            return this;
        }

        public Builder infoId(int i) {
            this.mInfoId = i;
            return this;
        }

        public Builder loudness(float f) {
            this.mLoudness = f;
            return this;
        }

        public Builder mainUrl(String str) {
            this.mMainUrl = str;
            return this;
        }

        public Builder mediaType(int i) {
            this.mMediaType = i;
            return this;
        }

        public Builder peak(float f) {
            this.mPeak = f;
            return this;
        }
    }

    public JSONObject toBashJsonObject() {
        try {
            if (TextUtils.isEmpty(this.mMainUrl)) {
                return null;
            }
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("main_url", this.mMainUrl);
            jSONObject.put("check_info", this.mCheckInfo);
            jSONObject.put("info_id", this.mInfoId);
            jSONObject.put("bitrate", this.mBitrate);
            jSONObject.put("loudness", (double) this.mLoudness);
            jSONObject.put("peak", (double) this.mPeak);
            return jSONObject;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
