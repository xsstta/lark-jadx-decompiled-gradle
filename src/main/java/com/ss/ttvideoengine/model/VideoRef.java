package com.ss.ttvideoengine.model;

import android.text.TextUtils;
import com.huawei.hms.location.ActivityIdentificationData;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.huawei.updatesdk.service.otaupdate.UpdateKey;
import com.ss.android.vc.meeting.framework.statemachine.SmEvents;
import com.ss.ttvideoengine.Resolution;
import com.ss.ttvideoengine.model.VideoModelPb;
import com.ss.ttvideoengine.utils.TTHelper;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class VideoRef {
    public static int TYPE_AUDIO = 1;
    public static int TYPE_VIDEO;
    private VideoAdaptiveInfo mAdptiveInfo;
    private VideoAdaptiveInfo mAdptiveInfoVer2;
    private ArrayList<String> mAllQualityArray = new ArrayList<>();
    private String[] mAllQualityInfos;
    private Resolution[] mAllResolutions;
    private ArrayList<Resolution> mAllResolutionsArray = new ArrayList<>();
    private HashMap<String, Resolution> mAudioResolutionMap = TTHelper.defaultAudioResolutionMap();
    public String mAutoDefinition;
    public String mBackupURL;
    private String mBarrageMaskUrl;
    private String mBashString = "";
    private String[] mCodecArray = null;
    private boolean mCodecHasByteVC1 = false;
    private boolean mCodecHasByteVC2 = false;
    private boolean mCodecHasH264 = false;
    public String mDecodingMode;
    public int[] mDefaultInfoId = {-1, -1};
    private JSONObject mDnsInfo;
    private Map<String, VideoModelPb.DNS> mDnsInfoVer3;
    private long mDnsTime;
    public List<VideoInfo> mDubbedAudioInfo;
    private String mDynamicType = "";
    public List<VideoInfo> mDynamicVideoList;
    public boolean mEnableAdaptive;
    public boolean mEnableSSL;
    public String mFallbackApi;
    private String mFirstSubVid;
    private String mFormat = "mp4";
    private boolean mFormatHasDASH = false;
    private boolean mFormatHasHls = false;
    private boolean mFormatHasMP4 = false;
    private boolean mFormatHasMPD = false;
    public String mFullScreen;
    private boolean mHasEmbededSubtitle = false;
    public String mKeyseed;
    public float mLoudness;
    public String mMainURL;
    public String mMediaType;
    public int mMediaTypeInt;
    private int mMediaTypeIntVer2;
    private String mMediaTypeVer2;
    public float mPeak;
    public int mPopularityLevel;
    private String mPosterUrl;
    private String mPosterUrlVer2;
    public VideoSeekTs mSeekTs;
    private VideoSeekTs mSeekTsVer2;
    public int mStatus;
    private int mStatusVer2;
    public List<SubInfo> mSubInfoList;
    public int[] mSubLans;
    public List<VideoThumbInfo> mThumbInfoList;
    private List<VideoThumbInfo> mThumbInfoListVer2;
    private int mTotalCount;
    private int mTotalCountVer2;
    private boolean mURLEncrypted = false;
    public String[] mURLs;
    private long mUrlExpire;
    public String mUserId;
    public String mValidate;
    private int mVersion = 1;
    public int mVideoDuration;
    private int mVideoDurationVer2;
    public String mVideoId;
    private String mVideoIdVer2;
    public List<VideoInfo> mVideoList;
    private List<VideoInfo> mVideoListVer2;
    public String mVideoName;
    private HashMap<String, Resolution> mVideoResolutionMap = TTHelper.defaultVideoResolutionMap();

    public void parseFromPb(VideoModelPb.VideoInfo videoInfo) {
    }

    public JSONObject getDnsInfo() {
        return this.mDnsInfo;
    }

    public List<SubInfo> getSubInfoList() {
        return this.mSubInfoList;
    }

    public String[] getSupportQualityInfos() {
        return this.mAllQualityInfos;
    }

    public Resolution[] getSupportResolutions() {
        return this.mAllResolutions;
    }

    public int[] getSupportSubtitleLangs() {
        return this.mSubLans;
    }

    public int getVersion() {
        return this.mVersion;
    }

    public void extractFields(JSONObject jSONObject) throws Throwable {
        JSONArray optJSONArray;
        JSONArray optJSONArray2;
        JSONObject optJSONObject;
        JSONArray optJSONArray3;
        int i;
        boolean z;
        JSONArray optJSONArray4;
        JSONArray optJSONArray5;
        JSONObject optJSONObject2;
        JSONArray optJSONArray6;
        JSONArray optJSONArray7;
        int i2;
        boolean z2;
        JSONArray optJSONArray8;
        JSONArray optJSONArray9;
        JSONObject optJSONObject3;
        if (jSONObject != null) {
            JSONArray optJSONArray10 = jSONObject.optJSONArray("PlayInfoList");
            if ((optJSONArray10 == null || optJSONArray10.length() <= 0) && TextUtils.isEmpty(jSONObject.optString("VideoID")) && TextUtils.isEmpty(jSONObject.optString("Vid"))) {
                if (!TextUtils.isEmpty(jSONObject.optString("video_id"))) {
                    if (jSONObject.optInt(HiAnalyticsConstant.HaKey.BI_KEY_VERSION) == 3) {
                        this.mVersion = 3;
                    } else {
                        this.mVersion = 1;
                    }
                }
            } else if (jSONObject.optInt("Version") == 4) {
                this.mVersion = 4;
            } else {
                this.mVersion = 2;
            }
            int i3 = this.mVersion;
            if (i3 == 1 || i3 == 3) {
                if (jSONObject.has("volume") && (optJSONObject3 = jSONObject.optJSONObject("volume")) != null && (optJSONObject3.has("loudness") || optJSONObject3.has("peak"))) {
                    this.mLoudness = (float) optJSONObject3.optDouble("loudness");
                    this.mPeak = (float) optJSONObject3.optDouble("peak");
                }
                this.mFullScreen = jSONObject.optString("full_screen_strategy");
            }
            int i4 = this.mVersion;
            JSONArray jSONArray = optJSONArray10;
            if (i4 == 1) {
                JSONObject optJSONObject4 = jSONObject.optJSONObject("video_list");
                this.mVideoDuration = jSONObject.optInt("video_duration");
                this.mStatus = jSONObject.optInt(UpdateKey.STATUS);
                this.mValidate = jSONObject.optString("validate");
                this.mAutoDefinition = jSONObject.optString("auto_definition");
                this.mEnableSSL = jSONObject.optBoolean("enable_ssl");
                this.mEnableAdaptive = jSONObject.optBoolean("enable_adaptive");
                this.mUserId = jSONObject.optString("user_id");
                this.mVideoId = jSONObject.optString("video_id");
                this.mVideoName = jSONObject.optString("video_name");
                this.mPopularityLevel = jSONObject.optInt("popularity_level");
                this.mMediaType = jSONObject.optString("media_type");
                this.mDecodingMode = jSONObject.optString("optimal_decoding_mode");
                if (jSONObject.has("subtitle_langs") && (optJSONArray9 = jSONObject.optJSONArray("subtitle_langs")) != null && optJSONArray9.length() > 0) {
                    this.mSubLans = new int[optJSONArray9.length()];
                    for (int i5 = 0; i5 < optJSONArray9.length(); i5++) {
                        this.mSubLans[i5] = optJSONArray9.optInt(i5);
                    }
                }
                String optString = jSONObject.optString("key_seed");
                if (!TextUtils.isEmpty(optString)) {
                    this.mKeyseed = optString;
                }
                String optString2 = jSONObject.optString("barrage_mask_url");
                if (!TextUtils.isEmpty(optString2)) {
                    this.mBarrageMaskUrl = TTHelper.base64Decode(optString2, this.mURLEncrypted ? this.mKeyseed : null);
                }
                if (jSONObject.has("subtitle_infos") && (optJSONArray8 = jSONObject.optJSONArray("subtitle_infos")) != null && optJSONArray8.length() > 0) {
                    this.mSubInfoList = new ArrayList();
                    for (int i6 = 0; i6 < optJSONArray8.length(); i6++) {
                        try {
                            SubInfo subInfo = new SubInfo();
                            subInfo.extractFields(optJSONArray8.getJSONObject(i6));
                            this.mSubInfoList.add(subInfo);
                        } catch (Exception e) {
                            throw e;
                        }
                    }
                }
                this.mHasEmbededSubtitle = jSONObject.optBoolean("has_embedded_subtitle");
                this.mFallbackApi = jSONObject.optString("fallback_api");
                if (this.mMediaType.equals("video")) {
                    this.mMediaTypeInt = TYPE_VIDEO;
                } else if (this.mMediaType.equals("audio")) {
                    this.mMediaTypeInt = TYPE_AUDIO;
                }
                if (optJSONObject4 != null) {
                    try {
                        this.mVideoList = new ArrayList();
                        if (optJSONObject4.has("video_1")) {
                            VideoInfo _generateVideoInfo = _generateVideoInfo(optJSONObject4.getJSONObject("video_1"), this.mMediaTypeInt, this.mURLEncrypted ? this.mKeyseed : null);
                            _generateVideoInfo.mVideoDuration = this.mVideoDuration;
                            this.mVideoList.add(_generateVideoInfo);
                        }
                        if (optJSONObject4.has("video_2")) {
                            VideoInfo _generateVideoInfo2 = _generateVideoInfo(optJSONObject4.getJSONObject("video_2"), this.mMediaTypeInt, this.mURLEncrypted ? this.mKeyseed : null);
                            _generateVideoInfo2.mVideoDuration = this.mVideoDuration;
                            this.mVideoList.add(_generateVideoInfo2);
                        }
                        if (optJSONObject4.has("video_3")) {
                            VideoInfo _generateVideoInfo3 = _generateVideoInfo(optJSONObject4.getJSONObject("video_3"), this.mMediaTypeInt, this.mURLEncrypted ? this.mKeyseed : null);
                            _generateVideoInfo3.mVideoDuration = this.mVideoDuration;
                            this.mVideoList.add(_generateVideoInfo3);
                        }
                        if (optJSONObject4.has("video_4")) {
                            VideoInfo _generateVideoInfo4 = _generateVideoInfo(optJSONObject4.getJSONObject("video_4"), this.mMediaTypeInt, this.mURLEncrypted ? this.mKeyseed : null);
                            _generateVideoInfo4.mVideoDuration = this.mVideoDuration;
                            this.mVideoList.add(_generateVideoInfo4);
                        }
                        if (optJSONObject4.has("video_5")) {
                            VideoInfo _generateVideoInfo5 = _generateVideoInfo(optJSONObject4.getJSONObject("video_5"), this.mMediaTypeInt, this.mURLEncrypted ? this.mKeyseed : null);
                            _generateVideoInfo5.mVideoDuration = this.mVideoDuration;
                            this.mVideoList.add(_generateVideoInfo5);
                        }
                        if (optJSONObject4.has("video_6")) {
                            VideoInfo _generateVideoInfo6 = _generateVideoInfo(optJSONObject4.getJSONObject("video_6"), this.mMediaTypeInt, this.mURLEncrypted ? this.mKeyseed : null);
                            _generateVideoInfo6.mVideoDuration = this.mVideoDuration;
                            this.mVideoList.add(_generateVideoInfo6);
                        }
                        if (optJSONObject4.has("video_7")) {
                            VideoInfo _generateVideoInfo7 = _generateVideoInfo(optJSONObject4.getJSONObject("video_7"), this.mMediaTypeInt, this.mURLEncrypted ? this.mKeyseed : null);
                            _generateVideoInfo7.mVideoDuration = this.mVideoDuration;
                            this.mVideoList.add(_generateVideoInfo7);
                        }
                        if (optJSONObject4.has("video_8")) {
                            VideoInfo _generateVideoInfo8 = _generateVideoInfo(optJSONObject4.getJSONObject("video_8"), this.mMediaTypeInt, this.mURLEncrypted ? this.mKeyseed : null);
                            _generateVideoInfo8.mVideoDuration = this.mVideoDuration;
                            this.mVideoList.add(_generateVideoInfo8);
                        }
                    } catch (JSONException e2) {
                        throw e2;
                    }
                }
                this.mDnsInfo = jSONObject.optJSONObject("dns_info");
                this.mDnsTime = jSONObject.optLong("dns_time");
                JSONObject optJSONObject5 = jSONObject.optJSONObject("dynamic_video");
                if (optJSONObject5 != null) {
                    String optString3 = optJSONObject5.optString("main_url");
                    if (!TextUtils.isEmpty(optString3)) {
                        this.mMainURL = TTHelper.base64Decode(optString3, this.mURLEncrypted ? this.mKeyseed : null);
                    }
                    String optString4 = optJSONObject5.optString("backup_url_1");
                    if (!TextUtils.isEmpty(optString4)) {
                        this.mBackupURL = TTHelper.base64Decode(optString4, this.mURLEncrypted ? this.mKeyseed : null);
                    }
                    this.mDynamicType = optJSONObject5.optString("dynamic_type");
                    this.mDynamicVideoList = new ArrayList();
                    JSONArray optJSONArray11 = optJSONObject5.optJSONArray("dynamic_video_list");
                    if (optJSONArray11 == null || optJSONArray11.length() <= 0) {
                        i2 = 0;
                    } else {
                        int i7 = 0;
                        i2 = 0;
                        while (i7 < optJSONArray11.length()) {
                            try {
                                VideoInfo _generateVideoInfo9 = _generateVideoInfo(optJSONArray11.getJSONObject(i7), TYPE_VIDEO, this.mURLEncrypted ? this.mKeyseed : null);
                                int i8 = i2 + 1;
                                _generateVideoInfo9.mInfoId = i2;
                                this.mDynamicVideoList.add(_generateVideoInfo9);
                                i7++;
                                i2 = i8;
                            } catch (Exception e3) {
                                throw e3;
                            }
                        }
                    }
                    JSONArray optJSONArray12 = optJSONObject5.optJSONArray("dynamic_dubbed_audios");
                    if (optJSONArray12 == null || optJSONArray12.length() <= 0) {
                        z2 = false;
                    } else {
                        this.mDubbedAudioInfo = new ArrayList();
                        int i9 = 0;
                        z2 = false;
                        while (i9 < optJSONArray12.length()) {
                            try {
                                VideoInfo _generateVideoInfo10 = _generateVideoInfo(optJSONArray12.getJSONObject(i9), TYPE_AUDIO, this.mURLEncrypted ? this.mKeyseed : null);
                                int i10 = i2 + 1;
                                _generateVideoInfo10.mInfoId = i2;
                                this.mDynamicVideoList.add(_generateVideoInfo10);
                                this.mDubbedAudioInfo.add(_generateVideoInfo10);
                                i9++;
                                i2 = i10;
                                z2 = true;
                            } catch (Exception e4) {
                                throw e4;
                            }
                        }
                    }
                    JSONArray optJSONArray13 = optJSONObject5.optJSONArray("dynamic_audio_list");
                    int i11 = Integer.MAX_VALUE;
                    if (optJSONArray13 != null && optJSONArray13.length() > 0) {
                        int i12 = 0;
                        while (i12 < optJSONArray13.length()) {
                            try {
                                VideoInfo _generateVideoInfo11 = _generateVideoInfo(optJSONArray13.getJSONObject(i12), TYPE_AUDIO, this.mURLEncrypted ? this.mKeyseed : null);
                                int i13 = i2 + 1;
                                _generateVideoInfo11.mInfoId = i2;
                                if (z2 && i11 > _generateVideoInfo11.mBitrate) {
                                    this.mDefaultInfoId[TYPE_AUDIO] = _generateVideoInfo11.mInfoId;
                                    i11 = _generateVideoInfo11.mBitrate;
                                }
                                this.mDynamicVideoList.add(_generateVideoInfo11);
                                i12++;
                                i2 = i13;
                            } catch (Exception e5) {
                                throw e5;
                            }
                        }
                    }
                    if (this.mDynamicVideoList.size() > 0) {
                        ArrayList arrayList = new ArrayList();
                        if (!TextUtils.isEmpty(this.mMainURL)) {
                            arrayList.add(this.mMainURL);
                        }
                        if (!TextUtils.isEmpty(this.mBackupURL)) {
                            arrayList.add(this.mBackupURL);
                        }
                        String[] strArr = new String[arrayList.size()];
                        this.mURLs = strArr;
                        arrayList.toArray(strArr);
                    }
                }
                if (jSONObject.has("seek_ts")) {
                    VideoSeekTs videoSeekTs = new VideoSeekTs();
                    this.mSeekTs = videoSeekTs;
                    videoSeekTs.extractFields(jSONObject.getJSONObject("seek_ts"));
                }
                if (jSONObject.has("big_thumbs") && (optJSONArray7 = jSONObject.optJSONArray("big_thumbs")) != null && optJSONArray7.length() > 0) {
                    this.mThumbInfoList = new ArrayList();
                    for (int i14 = 0; i14 < optJSONArray7.length(); i14++) {
                        try {
                            VideoThumbInfo videoThumbInfo = new VideoThumbInfo();
                            videoThumbInfo.setVersion(this.mVersion);
                            videoThumbInfo.extractFields(optJSONArray7.getJSONObject(i14));
                            this.mThumbInfoList.add(videoThumbInfo);
                        } catch (Exception e6) {
                            throw e6;
                        }
                    }
                }
            } else if (i4 == 2) {
                try {
                    this.mStatusVer2 = jSONObject.optInt("Status");
                    this.mVideoIdVer2 = jSONObject.optString("VideoID");
                    this.mPosterUrlVer2 = jSONObject.optString("CoverUrl");
                    this.mVideoDurationVer2 = jSONObject.optInt("Duration");
                    this.mMediaTypeVer2 = jSONObject.optString("MediaType");
                    this.mTotalCountVer2 = jSONObject.optInt("TotalCount");
                    this.mEnableSSL = jSONObject.optBoolean("EnableSSL");
                    this.mEnableAdaptive = jSONObject.optBoolean("EnableAdaptive");
                    if (this.mMediaTypeVer2.equals("video")) {
                        this.mMediaTypeIntVer2 = TYPE_VIDEO;
                    } else if (this.mMediaTypeVer2.equals("audio")) {
                        this.mMediaTypeIntVer2 = TYPE_AUDIO;
                    }
                    if (jSONObject.has("Seekts")) {
                        VideoSeekTs videoSeekTs2 = new VideoSeekTs();
                        this.mSeekTsVer2 = videoSeekTs2;
                        videoSeekTs2.extractFields(jSONObject.getJSONObject("Seekts"));
                    }
                    if (jSONObject.has("BigThumbs") && (optJSONArray6 = jSONObject.optJSONArray("BigThumbs")) != null && optJSONArray6.length() > 0) {
                        this.mThumbInfoListVer2 = new ArrayList();
                        for (int i15 = 0; i15 < optJSONArray6.length(); i15++) {
                            try {
                                VideoThumbInfo videoThumbInfo2 = new VideoThumbInfo();
                                videoThumbInfo2.setVersion(this.mVersion);
                                videoThumbInfo2.extractFields(optJSONArray6.getJSONObject(i15));
                                this.mThumbInfoListVer2.add(videoThumbInfo2);
                            } catch (Exception unused) {
                            }
                        }
                    }
                    if (jSONArray != null && jSONArray.length() > 0) {
                        this.mVideoListVer2 = new ArrayList();
                        int i16 = 0;
                        while (i16 < jSONArray.length()) {
                            this.mVideoListVer2.add(_generateVideoInfo(jSONArray.getJSONObject(i16), this.mMediaTypeIntVer2, this.mURLEncrypted ? this.mKeyseed : null));
                            i16++;
                            jSONArray = jSONArray;
                        }
                    }
                    if (jSONObject.has("AdaptiveInfo") && (optJSONObject2 = jSONObject.optJSONObject("AdaptiveInfo")) != null) {
                        VideoAdaptiveInfo videoAdaptiveInfo = new VideoAdaptiveInfo();
                        this.mAdptiveInfoVer2 = videoAdaptiveInfo;
                        videoAdaptiveInfo.extractFields(optJSONObject2);
                        this.mDynamicType = this.mAdptiveInfoVer2.getValueStr(SmEvents.EVENT_HEARTBEAT_INVALID);
                        this.mMainURL = this.mAdptiveInfoVer2.getValueStr(108);
                        this.mBackupURL = this.mAdptiveInfoVer2.getValueStr(SmEvents.EVENT_NR);
                        ArrayList arrayList2 = new ArrayList();
                        if (!TextUtils.isEmpty(this.mMainURL)) {
                            arrayList2.add(this.mMainURL);
                        }
                        if (!TextUtils.isEmpty(this.mBackupURL)) {
                            arrayList2.add(this.mBackupURL);
                        }
                        String[] strArr2 = new String[arrayList2.size()];
                        this.mURLs = strArr2;
                        arrayList2.toArray(strArr2);
                    }
                } catch (Exception e7) {
                    throw e7;
                }
            } else if (i4 == 3) {
                this.mVideoDuration = jSONObject.optInt("video_duration");
                this.mStatus = jSONObject.optInt(UpdateKey.STATUS);
                this.mVideoId = jSONObject.optString("video_id");
                this.mUrlExpire = jSONObject.optLong("url_expire");
                this.mEnableSSL = jSONObject.optBoolean("enable_ssl");
                this.mEnableAdaptive = jSONObject.optBoolean("enable_adaptive");
                this.mMediaType = jSONObject.optString("media_type");
                this.mDecodingMode = jSONObject.optString("optimal_decoding_mode");
                this.mBarrageMaskUrl = jSONObject.optString("barrage_mask_url");
                this.mPopularityLevel = jSONObject.optInt("popularity_level");
                if (this.mMediaType.equals("video")) {
                    this.mMediaTypeInt = TYPE_VIDEO;
                } else if (this.mMediaType.equals("audio")) {
                    this.mMediaTypeInt = TYPE_AUDIO;
                }
                if (jSONObject.has("subtitle_langs") && (optJSONArray5 = jSONObject.optJSONArray("subtitle_langs")) != null && optJSONArray5.length() > 0) {
                    this.mSubLans = new int[optJSONArray5.length()];
                    for (int i17 = 0; i17 < optJSONArray5.length(); i17++) {
                        this.mSubLans[i17] = optJSONArray5.optInt(i17);
                    }
                }
                if (jSONObject.has("subtitle_infos") && (optJSONArray4 = jSONObject.optJSONArray("subtitle_infos")) != null && optJSONArray4.length() > 0) {
                    this.mSubInfoList = new ArrayList();
                    for (int i18 = 0; i18 < optJSONArray4.length(); i18++) {
                        try {
                            SubInfo subInfo2 = new SubInfo();
                            subInfo2.extractFields(optJSONArray4.getJSONObject(i18));
                            this.mSubInfoList.add(subInfo2);
                        } catch (Exception e8) {
                            throw e8;
                        }
                    }
                }
                this.mHasEmbededSubtitle = jSONObject.optBoolean("has_embedded_subtitle");
                JSONObject optJSONObject6 = jSONObject.optJSONObject("fallback_api");
                if (optJSONObject6 != null) {
                    this.mFallbackApi = optJSONObject6.optString("fallback_api");
                    String optString5 = optJSONObject6.optString("key_seed");
                    if (!TextUtils.isEmpty(optString5)) {
                        this.mKeyseed = optString5;
                    }
                }
                this.mVideoList = new ArrayList();
                JSONArray optJSONArray14 = jSONObject.optJSONArray("video_list");
                if (optJSONArray14 != null && optJSONArray14.length() > 0) {
                    for (int i19 = 0; i19 < optJSONArray14.length(); i19++) {
                        try {
                            this.mVideoList.add(_generateVideoInfo(optJSONArray14.getJSONObject(i19), this.mMediaTypeInt, this.mURLEncrypted ? this.mKeyseed : null));
                        } catch (Exception e9) {
                            throw e9;
                        }
                    }
                }
                JSONObject optJSONObject7 = jSONObject.optJSONObject("dynamic_video");
                if (optJSONObject7 != null) {
                    this.mMainURL = optJSONObject7.optString("main_url");
                    this.mBackupURL = optJSONObject7.optString("backup_url");
                    this.mDynamicType = optJSONObject7.optString("dynamic_type");
                    this.mDynamicVideoList = new ArrayList();
                    JSONArray optJSONArray15 = optJSONObject7.optJSONArray("dynamic_video_list");
                    if (optJSONArray15 == null || optJSONArray15.length() <= 0) {
                        i = 0;
                    } else {
                        int i20 = 0;
                        i = 0;
                        while (i20 < optJSONArray15.length()) {
                            try {
                                VideoInfo _generateVideoInfo12 = _generateVideoInfo(optJSONArray15.getJSONObject(i20), TYPE_VIDEO, this.mURLEncrypted ? this.mKeyseed : null);
                                int i21 = i + 1;
                                _generateVideoInfo12.mInfoId = i;
                                this.mDynamicVideoList.add(_generateVideoInfo12);
                                i20++;
                                i = i21;
                            } catch (Exception e10) {
                                throw e10;
                            }
                        }
                    }
                    JSONArray optJSONArray16 = optJSONObject7.optJSONArray("dynamic_dubbed_audios");
                    if (optJSONArray16 == null || optJSONArray16.length() <= 0) {
                        z = false;
                    } else {
                        this.mDubbedAudioInfo = new ArrayList();
                        int i22 = 0;
                        z = false;
                        while (i22 < optJSONArray16.length()) {
                            try {
                                VideoInfo _generateVideoInfo13 = _generateVideoInfo(optJSONArray16.getJSONObject(i22), TYPE_AUDIO, this.mURLEncrypted ? this.mKeyseed : null);
                                int i23 = i + 1;
                                _generateVideoInfo13.mInfoId = i;
                                this.mDynamicVideoList.add(_generateVideoInfo13);
                                this.mDubbedAudioInfo.add(_generateVideoInfo13);
                                i22++;
                                i = i23;
                                z = true;
                            } catch (Exception e11) {
                                throw e11;
                            }
                        }
                    }
                    JSONArray optJSONArray17 = optJSONObject7.optJSONArray("dynamic_audio_list");
                    int i24 = Integer.MAX_VALUE;
                    if (optJSONArray17 != null && optJSONArray17.length() > 0) {
                        int i25 = 0;
                        while (i25 < optJSONArray17.length()) {
                            try {
                                VideoInfo _generateVideoInfo14 = _generateVideoInfo(optJSONArray17.getJSONObject(i25), TYPE_AUDIO, this.mURLEncrypted ? this.mKeyseed : null);
                                int i26 = i + 1;
                                _generateVideoInfo14.mInfoId = i;
                                if (z && i24 > _generateVideoInfo14.mBitrate) {
                                    this.mDefaultInfoId[TYPE_AUDIO] = _generateVideoInfo14.mInfoId;
                                    i24 = _generateVideoInfo14.mBitrate;
                                }
                                this.mDynamicVideoList.add(_generateVideoInfo14);
                                i25++;
                                i = i26;
                            } catch (Exception e12) {
                                throw e12;
                            }
                        }
                    }
                    if (this.mDynamicVideoList.size() > 0) {
                        ArrayList arrayList3 = new ArrayList();
                        if (!TextUtils.isEmpty(this.mMainURL)) {
                            arrayList3.add(this.mMainURL);
                        }
                        if (!TextUtils.isEmpty(this.mBackupURL)) {
                            arrayList3.add(this.mBackupURL);
                        }
                        String[] strArr3 = new String[arrayList3.size()];
                        this.mURLs = strArr3;
                        arrayList3.toArray(strArr3);
                    }
                }
                if (jSONObject.has("seek_ts")) {
                    VideoSeekTs videoSeekTs3 = new VideoSeekTs();
                    this.mSeekTs = videoSeekTs3;
                    videoSeekTs3.extractFields(jSONObject.getJSONObject("seek_ts"));
                }
                this.mDnsInfo = jSONObject.optJSONObject("dns_info");
                this.mDnsTime = jSONObject.optLong("dns_time");
                if (jSONObject.has("big_thumbs") && (optJSONArray3 = jSONObject.optJSONArray("big_thumbs")) != null && optJSONArray3.length() > 0) {
                    this.mThumbInfoList = new ArrayList();
                    for (int i27 = 0; i27 < optJSONArray3.length(); i27++) {
                        try {
                            VideoThumbInfo videoThumbInfo3 = new VideoThumbInfo();
                            videoThumbInfo3.setVersion(this.mVersion);
                            videoThumbInfo3.extractFields(optJSONArray3.getJSONObject(i27));
                            this.mThumbInfoList.add(videoThumbInfo3);
                        } catch (Exception e13) {
                            throw e13;
                        }
                    }
                }
            } else if (i4 == 4) {
                try {
                    this.mStatus = jSONObject.optInt("Status");
                    this.mVideoId = jSONObject.optString("Vid");
                    this.mPosterUrl = jSONObject.optString("PosterUrl");
                    this.mVideoDuration = jSONObject.optInt("Duration");
                    this.mMediaType = jSONObject.optString("FileType");
                    this.mTotalCount = jSONObject.optInt("TotalCount");
                    this.mEnableSSL = jSONObject.optBoolean("EnableSSL");
                    this.mEnableAdaptive = jSONObject.optBoolean("EnableAdaptive");
                    this.mBarrageMaskUrl = jSONObject.optString("BarrageMaskUrl");
                    if (this.mMediaType.equals("video")) {
                        this.mMediaTypeInt = TYPE_VIDEO;
                    } else if (this.mMediaType.equals("audio")) {
                        this.mMediaTypeInt = TYPE_AUDIO;
                    }
                    if (jSONArray != null && jSONArray.length() > 0) {
                        this.mVideoList = new ArrayList();
                        for (int i28 = 0; i28 < jSONArray.length(); i28++) {
                            this.mVideoList.add(_generateVideoInfo(jSONArray.getJSONObject(i28), this.mMediaTypeInt, this.mURLEncrypted ? this.mKeyseed : null));
                        }
                    }
                    if (jSONObject.has("AdaptiveInfo") && (optJSONObject = jSONObject.optJSONObject("AdaptiveInfo")) != null) {
                        VideoAdaptiveInfo videoAdaptiveInfo2 = new VideoAdaptiveInfo();
                        this.mAdptiveInfo = videoAdaptiveInfo2;
                        videoAdaptiveInfo2.extractFields(optJSONObject);
                        this.mDynamicType = this.mAdptiveInfo.getValueStr(SmEvents.EVENT_HEARTBEAT_INVALID);
                        this.mMainURL = this.mAdptiveInfo.getValueStr(108);
                        this.mBackupURL = this.mAdptiveInfo.getValueStr(SmEvents.EVENT_NR);
                        ArrayList arrayList4 = new ArrayList();
                        if (!TextUtils.isEmpty(this.mMainURL)) {
                            arrayList4.add(this.mMainURL);
                        }
                        if (!TextUtils.isEmpty(this.mBackupURL)) {
                            arrayList4.add(this.mBackupURL);
                        }
                        String[] strArr4 = new String[arrayList4.size()];
                        this.mURLs = strArr4;
                        arrayList4.toArray(strArr4);
                    }
                    if (jSONObject.has("SubtitleInfoList") && (optJSONArray2 = jSONObject.optJSONArray("SubtitleInfoList")) != null && optJSONArray2.length() > 0) {
                        this.mSubInfoList = new ArrayList();
                        for (int i29 = 0; i29 < optJSONArray2.length(); i29++) {
                            try {
                                SubInfo subInfo3 = new SubInfo();
                                subInfo3.extractFields(optJSONArray2.getJSONObject(i29));
                                this.mSubInfoList.add(subInfo3);
                            } catch (Exception e14) {
                                throw e14;
                            }
                        }
                    }
                    if (jSONObject.has("ThumbInfoList") && (optJSONArray = jSONObject.optJSONArray("ThumbInfoList")) != null && optJSONArray.length() > 0) {
                        this.mThumbInfoList = new ArrayList();
                        for (int i30 = 0; i30 < optJSONArray.length(); i30++) {
                            VideoThumbInfo videoThumbInfo4 = new VideoThumbInfo();
                            videoThumbInfo4.setVersion(this.mVersion);
                            videoThumbInfo4.extractFields(optJSONArray.getJSONObject(i30));
                            this.mThumbInfoList.add(videoThumbInfo4);
                        }
                    }
                } catch (Exception e15) {
                    throw e15;
                }
            }
            List<VideoInfo> videoInfoList = getVideoInfoList();
            if (videoInfoList != null && videoInfoList.size() > 0) {
                Iterator<VideoInfo> it = videoInfoList.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    VideoInfo next = it.next();
                    int mediatype = next.getMediatype();
                    int i31 = TYPE_VIDEO;
                    if (mediatype == i31) {
                        this.mMediaTypeIntVer2 = i31;
                        this.mMediaTypeInt = i31;
                        break;
                    }
                    int mediatype2 = next.getMediatype();
                    int i32 = TYPE_AUDIO;
                    if (mediatype2 == i32) {
                        this.mMediaTypeIntVer2 = i32;
                        this.mMediaTypeInt = i32;
                    }
                }
            }
            this.mBashString = toBashString();
            Resolution[] resolutionArr = new Resolution[this.mAllResolutionsArray.size()];
            this.mAllResolutions = resolutionArr;
            this.mAllResolutionsArray.toArray(resolutionArr);
            String[] strArr5 = new String[this.mAllQualityArray.size()];
            this.mAllQualityInfos = strArr5;
            this.mAllQualityArray.toArray(strArr5);
        }
    }

    public VideoSeekTs getSeekTs() {
        if (this.mVersion == 2) {
            return this.mSeekTsVer2;
        }
        return this.mSeekTs;
    }

    public List<VideoThumbInfo> getThumbInfoList() {
        if (this.mVersion == 2) {
            return this.mThumbInfoListVer2;
        }
        return this.mThumbInfoList;
    }

    public String toBashString() {
        JSONObject bashJsonObject = toBashJsonObject();
        if (bashJsonObject != null) {
            return bashJsonObject.toString();
        }
        return "";
    }

    public List<VideoInfo> getVideoInfoList() {
        if (this.mVersion == 2) {
            return this.mVideoListVer2;
        }
        List<VideoInfo> list = null;
        List<VideoInfo> list2 = this.mVideoList;
        if (list2 != null && list2.size() > 0) {
            list = this.mVideoList;
        }
        List<VideoInfo> list3 = this.mDynamicVideoList;
        if (list3 == null || list3.size() <= 0) {
            return list;
        }
        return this.mDynamicVideoList;
    }

    public VideoRef() {
        int i = TYPE_VIDEO;
        this.mMediaTypeInt = i;
        this.mLoudness = BitmapDescriptorFactory.HUE_RED;
        this.mPeak = BitmapDescriptorFactory.HUE_RED;
        this.mFirstSubVid = null;
        this.mVideoListVer2 = null;
        this.mMediaTypeIntVer2 = i;
        this.mUrlExpire = 0;
    }

    public String[] getCodecs() {
        if (this.mCodecArray == null) {
            List<VideoInfo> videoInfoList = getVideoInfoList();
            ArrayList arrayList = new ArrayList();
            if (videoInfoList != null && videoInfoList.size() > 0) {
                for (VideoInfo videoInfo : videoInfoList) {
                    if (videoInfo != null) {
                        String valueStr = videoInfo.getValueStr(8);
                        if (!TextUtils.isEmpty(valueStr) && !arrayList.contains(valueStr)) {
                            arrayList.add(valueStr);
                        }
                    }
                }
            }
            String[] strArr = new String[arrayList.size()];
            this.mCodecArray = strArr;
            arrayList.toArray(strArr);
        }
        return this.mCodecArray;
    }

    public JSONObject toBashJsonObject() {
        try {
            List<VideoInfo> videoInfoList = getVideoInfoList();
            if (videoInfoList != null) {
                if (videoInfoList.size() > 0) {
                    JSONArray jSONArray = new JSONArray();
                    JSONArray jSONArray2 = new JSONArray();
                    for (VideoInfo videoInfo : videoInfoList) {
                        if (videoInfo != null) {
                            JSONObject bashJsonObject = videoInfo.toBashJsonObject();
                            if (bashJsonObject != null) {
                                if (videoInfo.getMediatype() == TYPE_VIDEO) {
                                    jSONArray.put(bashJsonObject);
                                } else if (videoInfo.getMediatype() == TYPE_AUDIO) {
                                    jSONArray2.put(bashJsonObject);
                                }
                            }
                        }
                    }
                    if (jSONArray.length() > 0 || jSONArray2.length() > 0) {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("dynamic_video_list", jSONArray);
                        jSONObject.put("dynamic_audio_list", jSONArray2);
                        return jSONObject;
                    }
                    return null;
                }
            }
            return null;
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void setVersion(int i) {
        this.mVersion = i;
    }

    public float getValueFloat(int i) {
        if (i == 224) {
            return this.mLoudness;
        }
        if (i != 225) {
            return BitmapDescriptorFactory.HUE_RED;
        }
        return this.mPeak;
    }

    public String resolutionToString(Resolution resolution) {
        return resolutionToString(resolution, getValueInt(7));
    }

    public long getValueLong(int i) {
        if (i == 216) {
            return this.mDnsTime;
        }
        if (i != 220) {
            return 0;
        }
        return this.mUrlExpire;
    }

    public String getResolutionStr(VideoInfo videoInfo) {
        if (videoInfo == null) {
            return resolutionToString(Resolution.Standard);
        }
        int mediatype = videoInfo.getMediatype();
        if (mediatype == TYPE_AUDIO) {
            String valueStr = videoInfo.getValueStr(18);
            if (valueStr != null) {
                return valueStr;
            }
            return resolutionToString(Resolution.Standard, mediatype);
        } else if (mediatype != TYPE_VIDEO) {
            return resolutionToString(Resolution.Standard);
        } else {
            String valueStr2 = videoInfo.getValueStr(7);
            if (valueStr2 != null) {
                return valueStr2;
            }
            return resolutionToString(Resolution.Standard, mediatype);
        }
    }

    public List<VideoInfo> getValueList(int i) {
        if (this.mVersion == 2) {
            if (i != 5) {
                return null;
            }
            return this.mVideoListVer2;
        } else if (i == 5) {
            return this.mVideoList;
        } else {
            if (i == 210) {
                return this.mDynamicVideoList;
            }
            if (i != 231) {
                return null;
            }
            return this.mDubbedAudioInfo;
        }
    }

    public Boolean getValueBool(int i) {
        if (i == 106) {
            return Boolean.valueOf(this.mEnableSSL);
        }
        if (i == 222) {
            return Boolean.valueOf(this.mEnableAdaptive);
        }
        if (i == 228) {
            return Boolean.valueOf(this.mCodecHasByteVC2);
        }
        if (i == 229) {
            return Boolean.valueOf(this.mHasEmbededSubtitle);
        }
        switch (i) {
            case SmEvents.EVENT_HBRESET:
                return Boolean.valueOf(this.mCodecHasH264);
            case 204:
                return Boolean.valueOf(this.mCodecHasByteVC1);
            case SmEvents.EVENT_HB_NOTICE_DISCONNECT:
                return Boolean.valueOf(this.mFormatHasDASH);
            case SmEvents.EVENT_NONET:
                return Boolean.valueOf(this.mFormatHasMP4);
            case 207:
                return Boolean.valueOf(this.mFormatHasMPD);
            case 208:
                return Boolean.valueOf(this.mFormatHasHls);
            default:
                return false;
        }
    }

    public int getValueInt(int i) {
        int i2 = this.mVersion;
        if (i2 == 2) {
            if (i == 3) {
                return this.mVideoDurationVer2;
            }
            if (i == 4) {
                return this.mStatusVer2;
            }
            if (i == 7) {
                return this.mMediaTypeIntVer2;
            }
            if (i == 209) {
                return this.mTotalCountVer2;
            }
            if (i != 230) {
                return 0;
            }
            return this.mDefaultInfoId[TYPE_AUDIO];
        } else if (i == 3) {
            return this.mVideoDuration;
        } else {
            if (i == 4) {
                return this.mStatus;
            }
            if (i == 7) {
                return this.mMediaTypeInt;
            }
            if (i == 9) {
                return i2;
            }
            if (i == 209) {
                return this.mTotalCount;
            }
            if (i == 227) {
                return this.mPopularityLevel;
            }
            if (i != 230) {
                return 0;
            }
            return this.mDefaultInfoId[TYPE_AUDIO];
        }
    }

    public VideoInfo getVideoInfo(Map<Integer, String> map) {
        List<VideoInfo> videoInfoList = getVideoInfoList();
        if (!(videoInfoList == null || videoInfoList.size() == 0)) {
            for (VideoInfo videoInfo : videoInfoList) {
                if (videoInfo != null) {
                    if (!(map == null || map.size() == 0)) {
                        boolean z = true;
                        Iterator<Map.Entry<Integer, String>> it = map.entrySet().iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                break;
                            }
                            Map.Entry<Integer, String> next = it.next();
                            int intValue = next.getKey().intValue();
                            String value = next.getValue();
                            if (!(TextUtils.isEmpty(value) || value.equals(videoInfo.getValueStr(intValue)))) {
                                z = false;
                                break;
                            }
                        }
                        if (z) {
                        }
                    }
                    return videoInfo;
                }
            }
        }
        return null;
    }

    public VideoInfo getVideoInfoWithClarity(String str) {
        List<VideoInfo> videoInfoList;
        if (TextUtils.isEmpty(str) || (videoInfoList = getVideoInfoList()) == null || videoInfoList.size() == 0) {
            return null;
        }
        for (int i = 0; i < videoInfoList.size(); i++) {
            if (videoInfoList.get(i) != null && getResolutionStr(videoInfoList.get(i)).equals(str)) {
                return videoInfoList.get(i);
            }
        }
        return videoInfoList.get(0);
    }

    public String getValueStr(int i) {
        if (i == 211) {
            return this.mFormat;
        }
        if (i == 215) {
            return this.mDynamicType;
        }
        if (i == 8) {
            return this.mBashString;
        }
        if (i == 233) {
            return this.mFirstSubVid;
        }
        if (this.mVersion == 2) {
            if (i == 2) {
                return this.mVideoIdVer2;
            }
            if (i == 7) {
                return this.mMediaTypeVer2;
            }
            if (i != 201) {
                return "";
            }
            return this.mPosterUrlVer2;
        } else if (i == 1) {
            return this.mUserId;
        } else {
            if (i == 2) {
                return this.mVideoId;
            }
            if (i == 7) {
                return this.mMediaType;
            }
            if (i == 201) {
                return this.mPosterUrl;
            }
            if (i == 221) {
                return this.mBarrageMaskUrl;
            }
            if (i == 223) {
                return this.mDecodingMode;
            }
            if (i == 226) {
                return this.mFullScreen;
            }
            if (i == 104) {
                return this.mVideoName;
            }
            if (i == 105) {
                return this.mValidate;
            }
            if (i == 217) {
                return this.mFallbackApi;
            }
            if (i == 218) {
                return this.mKeyseed;
            }
            switch (i) {
                case ActivityIdentificationData.WALKING:
                    return this.mAutoDefinition;
                case 108:
                    return this.mMainURL;
                case SmEvents.EVENT_NR:
                    return this.mBackupURL;
                default:
                    return "";
            }
        }
    }

    public void setUpResolution(HashMap<String, Resolution> hashMap) {
        int valueInt = getValueInt(7);
        if (hashMap == null || hashMap.size() <= 0) {
            if (valueInt == TYPE_AUDIO) {
                hashMap = this.mAudioResolutionMap;
            } else {
                hashMap = this.mVideoResolutionMap;
            }
        } else if (valueInt == TYPE_AUDIO) {
            this.mAudioResolutionMap = hashMap;
        } else {
            this.mVideoResolutionMap = hashMap;
        }
        Resolution resolution = Resolution.Standard;
        List<VideoInfo> videoInfoList = getVideoInfoList();
        if (videoInfoList != null) {
            for (int i = 0; i < videoInfoList.size(); i++) {
                VideoInfo videoInfo = videoInfoList.get(i);
                if (videoInfo != null && videoInfo.getMediatype() == valueInt) {
                    videoInfo.setResolutionBaseMap(hashMap);
                    Resolution resolution2 = videoInfo.getResolution();
                    String valueStr = videoInfo.getValueStr(32);
                    if (!this.mAllQualityArray.contains(valueStr)) {
                        this.mAllQualityArray.add(valueStr);
                    }
                    if (!this.mAllResolutionsArray.contains(resolution2)) {
                        this.mAllResolutionsArray.add(resolution2);
                    }
                }
            }
        }
        Resolution[] resolutionArr = new Resolution[this.mAllResolutionsArray.size()];
        this.mAllResolutions = resolutionArr;
        this.mAllResolutionsArray.toArray(resolutionArr);
        String[] strArr = new String[this.mAllQualityArray.size()];
        this.mAllQualityInfos = strArr;
        this.mAllQualityArray.toArray(strArr);
    }

    public void setValue(int i, boolean z) {
        if (i == 106) {
            this.mEnableSSL = z;
        }
    }

    public void setValueBool(int i, boolean z) {
        if (i == 219) {
            this.mURLEncrypted = z;
        }
    }

    public void setValueStr(int i, String str) {
        if (i == 218) {
            this.mKeyseed = str;
        }
    }

    public VideoInfo getVideoInfo(Resolution resolution, Map<Integer, String> map) {
        return getVideoInfo(resolution, getValueInt(7), map);
    }

    public void setValue(int i, VideoSeekTs videoSeekTs) {
        if (i == 214) {
            this.mSeekTs = videoSeekTs;
            this.mSeekTsVer2 = videoSeekTs;
        }
    }

    public String[] allVideoURLs(Resolution resolution, Map<Integer, String> map) {
        String[] strArr = this.mURLs;
        if (strArr != null && strArr.length > 0) {
            return strArr;
        }
        VideoInfo videoInfo = getVideoInfo(resolution, map);
        if (videoInfo == null) {
            return new String[0];
        }
        return videoInfo.getValueStrArr(16);
    }

    public void setValue(int i, int i2) {
        if (i == 3) {
            this.mVideoDuration = i2;
            this.mVideoDurationVer2 = i2;
        } else if (i == 4) {
            this.mStatus = i2;
        } else if (i == 7) {
            this.mMediaTypeInt = i2;
            this.mMediaTypeIntVer2 = i2;
        } else if (i == 209) {
            this.mTotalCountVer2 = i2;
        }
    }

    public String resolutionToString(Resolution resolution, int i) {
        HashMap<String, Resolution> hashMap;
        if (i == TYPE_AUDIO) {
            hashMap = this.mAudioResolutionMap;
        } else {
            hashMap = this.mVideoResolutionMap;
        }
        String str = null;
        Iterator<String> it = hashMap.keySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            String next = it.next();
            if (hashMap.get(next).getIndex() == resolution.getIndex()) {
                str = next;
                break;
            }
        }
        if (TextUtils.isEmpty(str)) {
            return resolution.toString(i);
        }
        return str;
    }

    public void setValue(int i, List list) {
        if (i == 5) {
            this.mVideoList = list;
            this.mVideoListVer2 = list;
        } else if (i == 210) {
            this.mDynamicVideoList = list;
        } else if (i == 212) {
            this.mThumbInfoListVer2 = list;
            this.mThumbInfoList = list;
        }
    }

    public void setValue(int i, String str) {
        if (i == 1) {
            this.mUserId = str;
        } else if (i == 2) {
            this.mVideoId = str;
            this.mVideoIdVer2 = str;
        } else if (i == 7) {
            this.mMediaTypeVer2 = str;
            this.mMediaType = str;
        } else if (i == 201) {
            this.mPosterUrlVer2 = str;
        } else if (i == 233) {
            this.mFirstSubVid = str;
        } else if (i == 104) {
            this.mVideoName = str;
        } else if (i != 105) {
            switch (i) {
                case ActivityIdentificationData.WALKING:
                    this.mAutoDefinition = str;
                    return;
                case 108:
                    this.mMainURL = str;
                    return;
                case SmEvents.EVENT_NR:
                    this.mBackupURL = str;
                    return;
                default:
                    return;
            }
        } else {
            this.mValidate = str;
        }
    }

    public void setValue(int i, String[] strArr) {
        if (i == 213) {
            this.mURLs = strArr;
        }
    }

    public VideoInfo getVideoInfo(Resolution resolution, int i, Map<Integer, String> map) {
        List<VideoInfo> videoInfoList = getVideoInfoList();
        if (!(videoInfoList == null || videoInfoList.size() == 0)) {
            for (VideoInfo videoInfo : videoInfoList) {
                if (videoInfo != null && i == videoInfo.getMediatype()) {
                    if (map != null && map.containsKey(32)) {
                        String str = map.get(32);
                        if (!TextUtils.isEmpty(videoInfo.getValueStr(32)) && videoInfo.getValueStr(32).equals(str)) {
                            return videoInfo;
                        }
                    }
                    if (resolution == videoInfo.getResolution()) {
                        if (!(map == null || map.size() == 0)) {
                            boolean z = true;
                            Iterator<Map.Entry<Integer, String>> it = map.entrySet().iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                    break;
                                }
                                Map.Entry<Integer, String> next = it.next();
                                int intValue = next.getKey().intValue();
                                String value = next.getValue();
                                if (!(TextUtils.isEmpty(value) || value.equals(videoInfo.getValueStr(intValue)))) {
                                    z = false;
                                    break;
                                }
                            }
                            if (z) {
                            }
                        }
                        return videoInfo;
                    }
                    continue;
                }
            }
        }
        return null;
    }

    private VideoInfo _generateVideoInfo(JSONObject jSONObject, int i, String str) {
        String str2;
        VideoInfo videoInfo = new VideoInfo(str);
        videoInfo.setVersion(this.mVersion);
        videoInfo.setMediatype(i);
        videoInfo.setValue(39, this.mLoudness);
        videoInfo.setValue(40, this.mPeak);
        videoInfo.extractFields(jSONObject);
        Resolution resolution = Resolution.Standard;
        int mediatype = videoInfo.getMediatype();
        if (mediatype == TYPE_AUDIO) {
            str2 = videoInfo.getValueStr(18);
        } else if (mediatype == TYPE_VIDEO) {
            str2 = videoInfo.getValueStr(7);
        } else {
            str2 = null;
        }
        if (!TextUtils.isEmpty(str2)) {
            if (str2.equals(Resolution.L_Standard.toString(mediatype))) {
                resolution = Resolution.L_Standard;
            } else if (str2.equals(Resolution.Standard.toString(mediatype))) {
                resolution = Resolution.Standard;
            } else if (str2.equals(Resolution.High.toString(mediatype))) {
                resolution = Resolution.High;
            } else if (str2.equals(Resolution.H_High.toString(mediatype))) {
                resolution = Resolution.H_High;
            } else if (str2.equals(Resolution.SuperHigh.toString(mediatype))) {
                resolution = Resolution.SuperHigh;
            } else if (str2.equals(Resolution.ExtremelyHigh.toString(mediatype))) {
                resolution = Resolution.ExtremelyHigh;
            } else if (str2.equals(Resolution.TwoK.toString(mediatype))) {
                resolution = Resolution.TwoK;
            } else if (str2.equals(Resolution.FourK.toString(mediatype))) {
                resolution = Resolution.FourK;
            } else if (str2.equals(Resolution.HDR.toString(mediatype))) {
                resolution = Resolution.HDR;
            } else if (str2.equals(Resolution.ExtremelyHigh_50F.toString(mediatype))) {
                resolution = Resolution.ExtremelyHigh_50F;
            } else if (str2.equals(Resolution.TwoK_50F.toString(mediatype))) {
                resolution = Resolution.TwoK_50F;
            } else if (str2.equals(Resolution.FourK_50F.toString(mediatype))) {
                resolution = Resolution.FourK_50F;
            } else if (str2.equals(Resolution.ExtremelyHigh_60F.toString(mediatype))) {
                resolution = Resolution.ExtremelyHigh_60F;
            } else if (str2.equals(Resolution.TwoK_60F.toString(mediatype))) {
                resolution = Resolution.TwoK_60F;
            } else if (str2.equals(Resolution.FourK_60F.toString(mediatype))) {
                resolution = Resolution.FourK_60F;
            } else if (str2.equals(Resolution.ExtremelyHigh_120F.toString(mediatype))) {
                resolution = Resolution.ExtremelyHigh_120F;
            } else if (str2.equals(Resolution.TwoK_120F.toString(mediatype))) {
                resolution = Resolution.TwoK_120F;
            } else if (str2.equals(Resolution.FourK_120F.toString(mediatype))) {
                resolution = Resolution.FourK_120F;
            } else if (str2.equals(Resolution.L_Standard_HDR.toString(mediatype))) {
                resolution = Resolution.L_Standard_HDR;
            } else if (str2.equals(Resolution.Standard_HDR.toString(mediatype))) {
                resolution = Resolution.Standard_HDR;
            } else if (str2.equals(Resolution.High_HDR.toString(mediatype))) {
                resolution = Resolution.High_HDR;
            } else if (str2.equals(Resolution.H_High_HDR.toString(mediatype))) {
                resolution = Resolution.H_High_HDR;
            } else if (str2.equals(Resolution.SuperHigh_HDR.toString(mediatype))) {
                resolution = Resolution.SuperHigh_HDR;
            } else if (str2.equals(Resolution.ExtremelyHigh_HDR.toString(mediatype))) {
                resolution = Resolution.ExtremelyHigh_HDR;
            } else if (str2.equals(Resolution.TwoK_HDR.toString(mediatype))) {
                resolution = Resolution.TwoK_HDR;
            } else if (str2.equals(Resolution.FourK_HDR.toString(mediatype))) {
                resolution = Resolution.FourK_HDR;
            }
        }
        videoInfo.setResolution(resolution);
        videoInfo.setValue(26, str2);
        String valueStr = videoInfo.getValueStr(6);
        if (!TextUtils.isEmpty(valueStr)) {
            this.mFormat = valueStr;
        }
        if (!this.mFormatHasMPD && this.mFormat.equals("mpd")) {
            this.mFormatHasMPD = true;
        } else if (!this.mFormatHasDASH && this.mFormat.equals("dash")) {
            this.mFormatHasDASH = true;
        } else if (!this.mFormatHasMP4 && this.mFormat.equals("mp4")) {
            this.mFormatHasMP4 = true;
        } else if (!this.mFormatHasHls && this.mFormat.equals("hls")) {
            this.mFormatHasHls = true;
        }
        String valueStr2 = videoInfo.getValueStr(8);
        if (!this.mCodecHasH264 && valueStr2.equals("h264")) {
            this.mCodecHasH264 = true;
        } else if (!this.mCodecHasByteVC1 && valueStr2.equals("bytevc1")) {
            this.mCodecHasByteVC1 = true;
        } else if (!this.mCodecHasByteVC2 && valueStr2.equals("bytevc2")) {
            this.mCodecHasByteVC2 = true;
        }
        return videoInfo;
    }
}
