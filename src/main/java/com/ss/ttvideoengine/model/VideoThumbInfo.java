package com.ss.ttvideoengine.model;

import android.text.TextUtils;
import com.ss.ttvideoengine.model.VideoModelPb;
import com.ss.ttvideoengine.utils.TTVideoEngineLog;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class VideoThumbInfo {
    private int mCaptureNumVer4;
    private int mCellHeightVer4;
    private int mCellWidthVer4;
    public double mDuration;
    private double mDurationVer2;
    public String mFext;
    private String mFextVer2;
    private String mFormatVer4;
    public int mImgNum;
    private int mImgNumVer2;
    public String mImgUrl;
    public ArrayList<String> mImgUrlList;
    private String mImgUrlVer2;
    private int mImgXLenVer4;
    public int mImgXlen;
    private int mImgXlenVer2;
    public int mImgXsize;
    private int mImgXsizeVer2;
    private int mImgYLenVer4;
    public int mImgYlen;
    private int mImgYlenVer2;
    public int mImgYsize;
    private int mImgYsizeVer2;
    public double mInterval;
    private double mIntervalVer2;
    private double mIntervalVer4;
    private ArrayList<String> mStoreUrlsVer4;
    public String mUri;
    private String mUriVer2;
    private int mVersion = 1;

    public void parseFromPb(VideoModelPb.BigThumb bigThumb) {
    }

    public List<String> getUrls() {
        if (this.mVersion != 4 || this.mStoreUrlsVer4 == null) {
            return null;
        }
        return new ArrayList(this.mStoreUrlsVer4);
    }

    public void setVersion(int i) {
        this.mVersion = i;
    }

    public double getValueDouble(int i) {
        int i2 = this.mVersion;
        if (i2 == 2) {
            if (i == 7) {
                return this.mDurationVer2;
            }
            if (i != 8) {
                return -1.0d;
            }
            return this.mIntervalVer2;
        } else if (i2 == 4) {
            if (i != 8) {
                return -1.0d;
            }
            return this.mIntervalVer4;
        } else if (i == 7) {
            return this.mDuration;
        } else {
            if (i != 8) {
                return -1.0d;
            }
            return this.mInterval;
        }
    }

    public String getValueStr(int i) {
        int i2 = this.mVersion;
        if (i2 == 2) {
            if (i == 1) {
                return this.mUriVer2;
            }
            if (i == 2) {
                return this.mImgUrlVer2;
            }
            if (i != 9) {
                return "";
            }
            return this.mFextVer2;
        } else if (i2 == 4) {
            if (i != 9) {
                return "";
            }
            return this.mFormatVer4;
        } else if (i == 1) {
            return this.mUri;
        } else {
            if (i == 2) {
                return this.mImgUrl;
            }
            if (i != 9) {
                return "";
            }
            return this.mFext;
        }
    }

    public int getValueInt(int i) {
        int i2 = this.mVersion;
        if (i2 == 2) {
            if (i == 0) {
                return this.mImgNumVer2;
            }
            if (i == 3) {
                return this.mImgXsizeVer2;
            }
            if (i == 4) {
                return this.mImgYsizeVer2;
            }
            if (i == 5) {
                return this.mImgXlenVer2;
            }
            if (i != 6) {
                return -1;
            }
            return this.mImgYlenVer2;
        } else if (i2 == 4) {
            if (i == 0) {
                return this.mCaptureNumVer4;
            }
            if (i == 3) {
                return this.mCellWidthVer4;
            }
            if (i == 4) {
                return this.mCellHeightVer4;
            }
            if (i == 5) {
                return this.mImgXLenVer4;
            }
            if (i != 6) {
                return -1;
            }
            return this.mImgYLenVer4;
        } else if (i == 0) {
            return this.mImgNum;
        } else {
            if (i == 3) {
                return this.mImgXsize;
            }
            if (i == 4) {
                return this.mImgYsize;
            }
            if (i == 5) {
                return this.mImgXlen;
            }
            if (i != 6) {
                return -1;
            }
            return this.mImgYlen;
        }
    }

    public void extractFields(JSONObject jSONObject) {
        if (jSONObject != null) {
            if (jSONObject.has("img_num")) {
                if (this.mVersion != 3) {
                    this.mVersion = 1;
                }
            } else if (jSONObject.has("ImgUrl")) {
                this.mVersion = 2;
            }
            int i = this.mVersion;
            int i2 = 0;
            if (i == 1 || i == 3) {
                try {
                    this.mImgNum = jSONObject.getInt("img_num");
                    String optString = jSONObject.optString("uri");
                    this.mUri = optString;
                    if (TextUtils.isEmpty(optString)) {
                        this.mUri = jSONObject.optString("img_uri");
                    }
                    this.mImgUrl = jSONObject.optString("img_url");
                    this.mImgXsize = jSONObject.optInt("img_x_size");
                    this.mImgYsize = jSONObject.optInt("img_y_size");
                    this.mImgXlen = jSONObject.optInt("img_x_len");
                    this.mImgYlen = jSONObject.optInt("img_y_len");
                    this.mDuration = jSONObject.optDouble("duration");
                    this.mInterval = jSONObject.optDouble("interval");
                    this.mFext = jSONObject.optString("fext");
                    JSONArray optJSONArray = jSONObject.optJSONArray("img_urls");
                    if (optJSONArray != null && optJSONArray.length() > 0) {
                        this.mImgUrlList = new ArrayList<>();
                        while (i2 < optJSONArray.length()) {
                            this.mImgUrlList.add(optJSONArray.optString(i2));
                            i2++;
                        }
                    }
                } catch (JSONException e) {
                    TTVideoEngineLog.m256501d(e);
                }
            } else if (i == 2) {
                try {
                    this.mImgNumVer2 = jSONObject.getInt("ImgNum");
                    this.mUriVer2 = jSONObject.optString("Uri");
                    this.mImgUrlVer2 = jSONObject.optString("ImgUrl");
                    this.mImgXsizeVer2 = jSONObject.optInt("ImgXSize");
                    this.mImgYsizeVer2 = jSONObject.optInt("ImgYSize");
                    this.mImgXlenVer2 = jSONObject.optInt("ImgXLen");
                    this.mImgYlenVer2 = jSONObject.optInt("ImgYLen");
                    this.mDurationVer2 = jSONObject.optDouble("Duration");
                    this.mIntervalVer2 = jSONObject.optDouble("Interval");
                    this.mFextVer2 = jSONObject.optString("Fext");
                } catch (JSONException e2) {
                    TTVideoEngineLog.m256501d(e2);
                }
            } else if (i == 4) {
                this.mCaptureNumVer4 = jSONObject.optInt("CaptureNum");
                JSONArray optJSONArray2 = jSONObject.optJSONArray("StoreUrls");
                if (optJSONArray2 != null && optJSONArray2.length() > 0) {
                    this.mStoreUrlsVer4 = new ArrayList<>();
                    while (i2 < optJSONArray2.length()) {
                        this.mStoreUrlsVer4.add(optJSONArray2.optString(i2));
                        i2++;
                    }
                }
                this.mCellWidthVer4 = jSONObject.optInt("CellWidth");
                this.mCellHeightVer4 = jSONObject.optInt("CellHeight");
                this.mImgXLenVer4 = jSONObject.optInt("ImgXLen");
                this.mImgYLenVer4 = jSONObject.optInt("ImgYLen");
                this.mIntervalVer4 = jSONObject.optDouble("Interval");
                this.mFormatVer4 = jSONObject.optString("Format");
            }
        }
    }
}
