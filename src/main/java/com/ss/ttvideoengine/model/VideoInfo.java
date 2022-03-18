package com.ss.ttvideoengine.model;

import android.text.TextUtils;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.ss.ttvideoengine.Resolution;
import com.ss.ttvideoengine.TTVideoEngine;
import com.ss.ttvideoengine.log.IVideoEventLogger;
import com.ss.ttvideoengine.model.VideoModelPb;
import com.ss.ttvideoengine.utils.TTHelper;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

public class VideoInfo implements IVideoInfo {
    public boolean isAutoDefinition = false;
    public String mBackupUrl1;
    private String mBackupUrl1Ver2 = null;
    public String mBackupUrl2;
    public String mBackupUrl3;
    private String mBarrageMaskOffset = null;
    private String mBarrageMaskUrl;
    public int mBitrate;
    private MediaBitrateFitterInfo mBitrateFitterInfo = null;
    private int mBitrateVer2;
    private String mCheckInfo;
    public String mCodecType;
    private String mCodecTypeVer2 = null;
    public String mDefinition;
    private String mDefinitionVer2;
    public String mDubVersion = "";
    public boolean mEncrypt = false;
    public String mFileHash;
    private String mFileHashVer2;
    private String mFileId = null;
    public int mGbr;
    private String mIndexRange;
    public int mInfoId = -1;
    private String mInitRange;
    private String mKeyseed = null;
    private String mKid;
    public String mLanguageCode = "";
    public int mLanguageId = -1;
    private String mLogoType;
    private String mLogoTypeVer2 = null;
    public float mLoudness = BitmapDescriptorFactory.HUE_RED;
    public String mMainUrl;
    private String mMainUrlVer2;
    private int mMediatype = 0;
    private String mP2pVerifyUrl = null;
    public HashMap<Double, Long> mPacketOffset;
    public float mPeak = BitmapDescriptorFactory.HUE_RED;
    public String mQuality;
    private String mQualityDesc = null;
    private int mQualityType = 0;
    private String mQualityVer2 = null;
    private Resolution mResolution = Resolution.Standard;
    private String mResolutonStr = Resolution.Standard.toString(VideoRef.TYPE_VIDEO);
    public long mSize = 0;
    private long mSizeVer2 = 0;
    private int mSocketBuffer = 0;
    public String mSpadea = null;
    private String mSpadeaVer2 = null;
    public String mStorePath;
    public String[] mURLs;
    private String[] mURLsVer2 = null;
    private long mUrlExpiredT = 0;
    public int mVHeight;
    private int mVHeightVer2;
    public String mVType;
    private String mVTypeVer2;
    public int mVWidth;
    private int mVWidthVer2;
    private int mVersion = 1;
    public int mVideoDuration = 0;
    public int playLoadMaxStep;
    public int playLoadMinStep;
    private int preLoadIntervalVer2 = 0;
    private int preLoadMaxStepVer2;
    private int preLoadMinStepVer2;
    private int preLoadSizeVer2;
    public int preloadInterval = 0;
    public int preloadSize;
    public int useVideoProxy = 1;

    public void parseFromPb(VideoModelPb.Audio audio) {
    }

    public void parseFromPb(VideoModelPb.Video video) {
    }

    @Override // com.ss.ttvideoengine.model.IVideoInfo
    public MediaBitrateFitterInfo getBitrateFitterInfo() {
        return this.mBitrateFitterInfo;
    }

    @Override // com.ss.ttvideoengine.model.IVideoInfo
    public int getMediatype() {
        return this.mMediatype;
    }

    @Override // com.ss.ttvideoengine.model.IVideoInfo
    public Resolution getResolution() {
        return this.mResolution;
    }

    public int getVersion() {
        return this.mVersion;
    }

    public void extractFields(JSONObject jSONObject) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        int i;
        JSONObject optJSONObject;
        int i2;
        String str7;
        JSONObject optJSONObject2;
        if (jSONObject != null) {
            if (!TextUtils.isEmpty(jSONObject.optString("main_url"))) {
                if (this.mVersion != 3) {
                    this.mVersion = 1;
                }
            } else if (!TextUtils.isEmpty(jSONObject.optString("MainPlayUrl")) && this.mVersion != 4) {
                this.mVersion = 2;
            }
            int i3 = this.mVersion;
            if (i3 == 1) {
                ArrayList arrayList = new ArrayList();
                this.mMainUrl = TTHelper.base64Decode(jSONObject.optString("main_url"), this.mKeyseed);
                this.mBackupUrl1 = TTHelper.base64Decode(jSONObject.optString("backup_url_1"), this.mKeyseed);
                this.mBackupUrl2 = TTHelper.base64Decode(jSONObject.optString("backup_url_2"), this.mKeyseed);
                this.mBackupUrl3 = TTHelper.base64Decode(jSONObject.optString("backup_url_3"), this.mKeyseed);
                if (!TextUtils.isEmpty(this.mMainUrl)) {
                    arrayList.add(this.mMainUrl);
                }
                if (!TextUtils.isEmpty(this.mBackupUrl1)) {
                    arrayList.add(this.mBackupUrl1);
                }
                if (!TextUtils.isEmpty(this.mBackupUrl2)) {
                    arrayList.add(this.mBackupUrl2);
                }
                if (!TextUtils.isEmpty(this.mBackupUrl3)) {
                    arrayList.add(this.mBackupUrl3);
                }
                String[] strArr = new String[arrayList.size()];
                this.mURLs = strArr;
                arrayList.toArray(strArr);
                try {
                    this.mVWidth = Integer.parseInt(jSONObject.optString("vwidth"));
                } catch (NumberFormatException unused) {
                    this.mVWidth = 0;
                }
                try {
                    this.mVHeight = Integer.parseInt(jSONObject.optString("vheight"));
                    i2 = 0;
                } catch (NumberFormatException unused2) {
                    i2 = 0;
                    this.mVHeight = 0;
                }
                try {
                    this.mBitrate = jSONObject.optInt("bitrate");
                } catch (Exception unused3) {
                    this.mBitrate = i2;
                }
                try {
                    this.mQualityType = jSONObject.optInt("quality_type");
                } catch (Exception unused4) {
                    this.mQualityType = 0;
                }
                this.mEncrypt = jSONObject.optBoolean("encrypt");
                this.mSpadea = jSONObject.optString("spade_a");
                this.mGbr = jSONObject.optInt("gbr");
                this.mStorePath = jSONObject.optString("storePath");
                this.mVType = jSONObject.optString("vtype");
                this.mDefinition = jSONObject.optString("definition");
                this.mCodecType = jSONObject.optString("codec_type");
                try {
                    this.mSize = jSONObject.optLong("size", 0);
                } catch (Exception unused5) {
                    this.mSize = 0;
                }
                if (jSONObject.has("volume") && (optJSONObject2 = jSONObject.optJSONObject("volume")) != null && (optJSONObject2.has("loudness") || optJSONObject2.has("peak"))) {
                    this.mLoudness = (float) optJSONObject2.optDouble("loudness");
                    this.mPeak = (float) optJSONObject2.optDouble("peak");
                }
                this.preloadSize = jSONObject.optInt("preload_size");
                this.playLoadMinStep = jSONObject.optInt("play_load_min_step");
                this.playLoadMaxStep = jSONObject.optInt("play_load_max_step");
                this.preloadInterval = jSONObject.optInt("preload_interval", -1);
                this.useVideoProxy = jSONObject.optInt("use_video_proxy", 1);
                this.mSocketBuffer = jSONObject.optInt("socket_buffer", 0);
                this.mFileHash = jSONObject.optString("file_hash");
                this.mQuality = jSONObject.optString("quality");
                this.mQualityDesc = jSONObject.optString("quality_desc");
                this.mLogoType = jSONObject.optString("logo_type");
                String optString = jSONObject.optString("file_id");
                this.mFileId = optString;
                if (!TextUtils.isEmpty(optString) && !TextUtils.isEmpty(this.mVType) && (this.mVType.equals("hls") || this.mVType.equals("m3u8"))) {
                    this.mFileHash = "fileid" + this.mFileId;
                }
                this.mP2pVerifyUrl = TTHelper.base64Decode(jSONObject.optString("p2p_verify_url"));
                this.mUrlExpiredT = jSONObject.optLong("url_expire");
                this.mCheckInfo = jSONObject.optString("check_info");
                this.mInitRange = jSONObject.optString("init_range");
                this.mIndexRange = jSONObject.optString("index_range");
                this.mKid = jSONObject.optString("kid");
                this.mBarrageMaskUrl = TTHelper.base64Decode(jSONObject.optString("barrage_mask_url"), this.mKeyseed);
                if (jSONObject.has("fitter_info")) {
                    MediaBitrateFitterInfo mediaBitrateFitterInfo = new MediaBitrateFitterInfo();
                    this.mBitrateFitterInfo = mediaBitrateFitterInfo;
                    mediaBitrateFitterInfo.extractFields(jSONObject.optJSONObject("fitter_info"));
                }
                if (jSONObject.has("pkt_offset")) {
                    try {
                        JSONArray jSONArray = new JSONArray(jSONObject.optString("pkt_offset"));
                        if (jSONArray.length() > 0) {
                            this.mPacketOffset = new HashMap<>();
                            for (int i4 = 0; i4 < jSONArray.length(); i4++) {
                                JSONArray optJSONArray = jSONArray.optJSONArray(i4);
                                if (optJSONArray != null && optJSONArray.length() == 2) {
                                    this.mPacketOffset.put(Double.valueOf(optJSONArray.optDouble(0)), Long.valueOf(optJSONArray.optLong(1)));
                                }
                            }
                        }
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
                try {
                    this.mLanguageId = jSONObject.optInt("language_id", -1);
                    str7 = "";
                    try {
                        this.mLanguageCode = jSONObject.optString("language_code", str7);
                        this.mDubVersion = jSONObject.optString("dub_version", str7);
                    } catch (Exception unused6) {
                    }
                } catch (Exception unused7) {
                    str7 = "";
                    this.mLanguageId = -1;
                    this.mLanguageCode = str7;
                    this.mDubVersion = str7;
                }
            } else if (i3 == 2) {
                this.mBitrateVer2 = jSONObject.optInt("Bitrate");
                this.mFileHashVer2 = jSONObject.optString("FileHash");
                this.mSizeVer2 = jSONObject.optLong("Size");
                this.mVHeightVer2 = jSONObject.optInt("Height");
                this.mVWidthVer2 = jSONObject.optInt("Width");
                this.mVTypeVer2 = jSONObject.optString("Format");
                this.mCodecTypeVer2 = jSONObject.optString("Codec");
                this.mLogoTypeVer2 = jSONObject.optString("Logo");
                this.mDefinitionVer2 = jSONObject.optString("Definition");
                this.mQualityVer2 = jSONObject.optString("Quality");
                this.mSpadeaVer2 = jSONObject.optString("PlayAuth");
                this.mMainUrlVer2 = jSONObject.optString("MainPlayUrl");
                this.mBackupUrl1Ver2 = jSONObject.optString("BackupPlayUrl");
                String optString2 = jSONObject.optString("MediaType");
                try {
                    this.mQualityType = jSONObject.optInt("QualityType");
                } catch (Exception unused8) {
                    this.mQualityType = 0;
                }
                if (!TextUtils.isEmpty(optString2)) {
                    if (optString2.equals("video")) {
                        this.mMediatype = VideoRef.TYPE_VIDEO;
                    } else if (optString2.equals("audio")) {
                        this.mMediatype = VideoRef.TYPE_AUDIO;
                    }
                }
                ArrayList arrayList2 = new ArrayList();
                if (!TextUtils.isEmpty(this.mMainUrlVer2)) {
                    arrayList2.add(this.mMainUrlVer2);
                }
                if (!TextUtils.isEmpty(this.mBackupUrl1Ver2)) {
                    arrayList2.add(this.mBackupUrl1Ver2);
                }
                String[] strArr2 = new String[arrayList2.size()];
                this.mURLsVer2 = strArr2;
                arrayList2.toArray(strArr2);
                this.preLoadIntervalVer2 = jSONObject.optInt("PreloadInterval", -1);
                this.preLoadMinStepVer2 = jSONObject.optInt("PreloadMinStep");
                this.preLoadMaxStepVer2 = jSONObject.optInt("PreloadMaxStep");
                this.preLoadSizeVer2 = jSONObject.optInt("PreloadSize");
                String optString3 = jSONObject.optString("FileID");
                this.mFileId = optString3;
                if (!TextUtils.isEmpty(optString3) && !TextUtils.isEmpty(this.mVTypeVer2) && (this.mVTypeVer2.equals("hls") || this.mVTypeVer2.equals("m3u8"))) {
                    this.mFileHashVer2 = "fileid" + this.mFileId;
                }
                this.mP2pVerifyUrl = jSONObject.optString("P2pVerifyURL");
                this.mCheckInfo = jSONObject.optString("CheckInfo");
                this.mInitRange = jSONObject.optString("InitRange");
                this.mIndexRange = jSONObject.optString("IndexRange");
                this.mKid = jSONObject.optString("PlayAuthID");
                if (jSONObject.has("fitter_info")) {
                    MediaBitrateFitterInfo mediaBitrateFitterInfo2 = new MediaBitrateFitterInfo();
                    this.mBitrateFitterInfo = mediaBitrateFitterInfo2;
                    mediaBitrateFitterInfo2.extractFields(jSONObject.optJSONObject("fitter_info"));
                }
                if (jSONObject.has("pkt_offset")) {
                    try {
                        JSONArray jSONArray2 = new JSONArray(jSONObject.optString("pkt_offset"));
                        if (jSONArray2.length() > 0) {
                            this.mPacketOffset = new HashMap<>();
                            for (int i5 = 0; i5 < jSONArray2.length(); i5++) {
                                JSONArray optJSONArray2 = jSONArray2.optJSONArray(i5);
                                if (optJSONArray2 != null && optJSONArray2.length() == 2) {
                                    this.mPacketOffset.put(Double.valueOf(optJSONArray2.optDouble(0)), Long.valueOf(optJSONArray2.optLong(1)));
                                }
                            }
                        }
                    } catch (Exception e2) {
                        e2.printStackTrace();
                    }
                }
                try {
                    this.mLanguageId = jSONObject.optInt("LanguageId", -1);
                    this.mLanguageCode = jSONObject.optString("LanguageCode", "");
                    this.mDubVersion = jSONObject.optString("DubVersion", "");
                } catch (Exception unused9) {
                    this.mLanguageId = -1;
                    this.mLanguageCode = "";
                    this.mDubVersion = "";
                }
            } else if (i3 == 3) {
                ArrayList arrayList3 = new ArrayList();
                this.mMainUrl = jSONObject.optString("main_url");
                this.mBackupUrl1 = jSONObject.optString("backup_url");
                arrayList3.add(this.mMainUrl);
                arrayList3.add(this.mBackupUrl1);
                String[] strArr3 = new String[arrayList3.size()];
                this.mURLs = strArr3;
                arrayList3.toArray(strArr3);
                if (jSONObject.has("volume") && (optJSONObject = jSONObject.optJSONObject("volume")) != null && (optJSONObject.has("loudness") || optJSONObject.has("peak"))) {
                    this.mLoudness = (float) optJSONObject.optDouble("loudness");
                    this.mPeak = (float) optJSONObject.optDouble("peak");
                }
                JSONObject optJSONObject3 = jSONObject.optJSONObject("video_meta");
                if (optJSONObject3 != null) {
                    this.mLogoType = optJSONObject3.optString("logo_type");
                    this.mQualityDesc = optJSONObject3.optString("quality_desc");
                    this.mVType = optJSONObject3.optString("vtype");
                    this.mDefinition = optJSONObject3.optString("definition");
                    str5 = "codec_type";
                    this.mCodecType = optJSONObject3.optString(str5);
                    try {
                        this.mVWidth = Integer.valueOf(optJSONObject3.optString("vwidth")).intValue();
                    } catch (NumberFormatException unused10) {
                        this.mVWidth = 0;
                    }
                    try {
                        this.mVHeight = Integer.valueOf(optJSONObject3.optString("vheight")).intValue();
                        i = 0;
                    } catch (NumberFormatException unused11) {
                        i = 0;
                        this.mVHeight = 0;
                    }
                    str3 = "bitrate";
                    try {
                        this.mBitrate = optJSONObject3.optInt(str3);
                    } catch (Exception unused12) {
                        this.mBitrate = i;
                    }
                    try {
                        this.mQualityType = optJSONObject3.optInt("quality_type");
                    } catch (Exception unused13) {
                        this.mQualityType = 0;
                    }
                    str4 = "quality";
                    this.mQuality = optJSONObject3.optString(str4);
                    this.mFileId = optJSONObject3.optString("file_id");
                    this.mFileHash = optJSONObject3.optString("file_hash");
                    if (!TextUtils.isEmpty(this.mFileId) && !TextUtils.isEmpty(this.mVType) && (this.mVType.equals("hls") || this.mVType.equals("m3u8") || TextUtils.isEmpty(this.mFileHash))) {
                        this.mFileHash = "fileid" + this.mFileId;
                    }
                    str2 = "pkt_offset";
                    str = "";
                    try {
                        this.mSize = optJSONObject3.optLong("size", 0);
                    } catch (Exception unused14) {
                        this.mSize = 0;
                    }
                } else {
                    str4 = "quality";
                    str3 = "bitrate";
                    str5 = "codec_type";
                    str2 = "pkt_offset";
                    str = "";
                }
                JSONObject optJSONObject4 = jSONObject.optJSONObject("audio_meta");
                if (optJSONObject4 != null) {
                    this.mQualityDesc = optJSONObject4.optString("quality_desc");
                    this.mVType = optJSONObject4.optString("atype");
                    this.mDefinition = optJSONObject4.optString("definition");
                    this.mQuality = optJSONObject4.optString(str4);
                    this.mCodecType = optJSONObject4.optString(str5);
                    try {
                        this.mBitrate = optJSONObject4.optInt(str3);
                    } catch (Exception unused15) {
                        this.mBitrate = 0;
                    }
                    this.mFileId = optJSONObject4.optString("file_id");
                    this.mFileHash = optJSONObject4.optString("file_hash");
                    if (!TextUtils.isEmpty(this.mFileId) && TextUtils.isEmpty(this.mFileHash)) {
                        this.mFileHash = "fileid" + this.mFileId;
                    }
                    try {
                        this.mSize = optJSONObject4.optLong("size", 0);
                    } catch (Exception unused16) {
                        this.mSize = 0;
                    }
                }
                JSONObject optJSONObject5 = jSONObject.optJSONObject("encrypt_info");
                if (optJSONObject5 != null) {
                    this.mEncrypt = optJSONObject5.optBoolean("encrypt");
                    this.mSpadea = optJSONObject5.optString("spade_a");
                    this.mKid = optJSONObject5.optString("kid");
                }
                JSONObject optJSONObject6 = jSONObject.optJSONObject("p2p_info");
                if (optJSONObject6 != null) {
                    this.mP2pVerifyUrl = optJSONObject6.optString("p2p_verify_url");
                }
                JSONObject optJSONObject7 = jSONObject.optJSONObject("check_info");
                if (optJSONObject7 != null) {
                    this.mCheckInfo = optJSONObject7.optString("check_info");
                }
                JSONObject optJSONObject8 = jSONObject.optJSONObject("base_range_info");
                if (optJSONObject8 != null) {
                    this.mInitRange = optJSONObject8.optString("init_range");
                    this.mIndexRange = optJSONObject8.optString("index_range");
                }
                JSONObject optJSONObject9 = jSONObject.optJSONObject("barrage_info");
                if (optJSONObject9 != null) {
                    this.mBarrageMaskOffset = optJSONObject9.optString("barrage_mask_offset");
                }
                if (jSONObject.has("fitter_info")) {
                    MediaBitrateFitterInfo mediaBitrateFitterInfo3 = new MediaBitrateFitterInfo();
                    this.mBitrateFitterInfo = mediaBitrateFitterInfo3;
                    mediaBitrateFitterInfo3.extractFields(jSONObject.optJSONObject("fitter_info"));
                }
                if (jSONObject.has(str2)) {
                    try {
                        JSONArray jSONArray3 = new JSONArray(jSONObject.optString(str2));
                        if (jSONArray3.length() > 0) {
                            this.mPacketOffset = new HashMap<>();
                            for (int i6 = 0; i6 < jSONArray3.length(); i6++) {
                                JSONArray optJSONArray3 = jSONArray3.optJSONArray(i6);
                                if (optJSONArray3 != null) {
                                    if (optJSONArray3.length() == 2) {
                                        this.mPacketOffset.put(Double.valueOf(optJSONArray3.optDouble(0)), Long.valueOf(optJSONArray3.optLong(1)));
                                    }
                                }
                            }
                        }
                    } catch (Exception e3) {
                        e3.printStackTrace();
                    }
                }
                try {
                    this.mLanguageId = jSONObject.optInt("language_id", -1);
                    str6 = str;
                    try {
                        this.mLanguageCode = jSONObject.optString("language_code", str6);
                        this.mDubVersion = jSONObject.optString("dub_version", str6);
                    } catch (Exception unused17) {
                    }
                } catch (Exception unused18) {
                    str6 = str;
                    this.mLanguageId = -1;
                    this.mLanguageCode = str6;
                    this.mDubVersion = str6;
                }
            } else if (i3 == 4) {
                this.mBitrate = jSONObject.optInt("Bitrate");
                this.mFileHash = jSONObject.optString("Md5");
                this.mSize = jSONObject.optLong("Size");
                this.mVHeight = jSONObject.optInt("Height");
                this.mVWidth = jSONObject.optInt("Width");
                this.mVType = jSONObject.optString("Format");
                this.mCodecType = jSONObject.optString("Codec");
                this.mLogoType = jSONObject.optString("LogoType");
                this.mDefinition = jSONObject.optString("Definition");
                this.mQuality = jSONObject.optString("Quality");
                this.mSpadea = jSONObject.optString("PlayAuth");
                this.mMainUrl = jSONObject.optString("MainPlayUrl");
                this.mBackupUrl1 = jSONObject.optString("BackupPlayUrl");
                try {
                    this.mQualityType = jSONObject.optInt("QualityType");
                } catch (Exception unused19) {
                    this.mQualityType = 0;
                }
                String optString4 = jSONObject.optString("FileType");
                if (!TextUtils.isEmpty(optString4)) {
                    if (optString4.equals("video")) {
                        this.mMediatype = VideoRef.TYPE_VIDEO;
                    } else if (optString4.equals("audio")) {
                        this.mMediatype = VideoRef.TYPE_AUDIO;
                    }
                }
                ArrayList arrayList4 = new ArrayList();
                if (!TextUtils.isEmpty(this.mMainUrl)) {
                    arrayList4.add(this.mMainUrl);
                }
                if (!TextUtils.isEmpty(this.mBackupUrl1)) {
                    arrayList4.add(this.mBackupUrl1);
                }
                String[] strArr4 = new String[arrayList4.size()];
                this.mURLs = strArr4;
                arrayList4.toArray(strArr4);
                String optString5 = jSONObject.optString("FileId");
                this.mFileId = optString5;
                if (!TextUtils.isEmpty(optString5) && !TextUtils.isEmpty(this.mVType) && (this.mVType.equals("hls") || this.mVType.equals("m3u8"))) {
                    this.mFileHash = "fileid" + this.mFileId;
                }
                this.mCheckInfo = jSONObject.optString("CheckInfo");
                this.mInitRange = jSONObject.optString("InitRange");
                this.mIndexRange = jSONObject.optString("IndexRange");
                this.mKid = jSONObject.optString("PlayAuthId");
                try {
                    this.mLanguageId = jSONObject.optInt("LanguageId", -1);
                    this.mLanguageCode = jSONObject.optString("LanguageCode", "");
                    this.mDubVersion = jSONObject.optString("DubVersion", "");
                } catch (Exception unused20) {
                    this.mLanguageId = -1;
                    this.mLanguageCode = "";
                    this.mDubVersion = "";
                }
            }
        }
    }

    public int getPreloadInterval() {
        int i = this.mVersion;
        if (i == 2 || i == 4) {
            return this.preLoadIntervalVer2;
        }
        return this.preloadInterval;
    }

    public int getSocketBuffer() {
        int i = this.mVersion;
        if (i == 2 || i == 4) {
            return 0;
        }
        return this.mSocketBuffer;
    }

    public boolean isUseVideoProxy() {
        int i = this.mVersion;
        if (i == 2 || i == 4 || this.useVideoProxy != 1) {
            return false;
        }
        return true;
    }

    public VideoInfo copyInfo() {
        VideoInfo videoInfo = new VideoInfo(this.mKeyseed);
        videoInfo.mVersion = this.mVersion;
        videoInfo.mURLs = this.mURLs;
        videoInfo.mMainUrl = this.mMainUrl;
        videoInfo.mBackupUrl1 = this.mBackupUrl1;
        videoInfo.mBackupUrl2 = this.mBackupUrl2;
        videoInfo.mBackupUrl3 = this.mBackupUrl3;
        videoInfo.mVWidth = this.mVWidth;
        videoInfo.mVHeight = this.mVHeight;
        videoInfo.mEncrypt = this.mEncrypt;
        videoInfo.mSpadea = this.mSpadea;
        videoInfo.mGbr = this.mGbr;
        videoInfo.mStorePath = this.mStorePath;
        videoInfo.mVType = this.mVType;
        videoInfo.mCodecType = this.mCodecType;
        videoInfo.mFileHash = this.mFileHash;
        videoInfo.mDefinition = this.mDefinition;
        videoInfo.preloadSize = this.preloadSize;
        videoInfo.playLoadMinStep = this.playLoadMinStep;
        videoInfo.playLoadMaxStep = this.playLoadMaxStep;
        videoInfo.mSize = this.mSize;
        videoInfo.mVideoDuration = this.mVideoDuration;
        videoInfo.preloadInterval = this.preloadInterval;
        videoInfo.useVideoProxy = this.useVideoProxy;
        videoInfo.mSocketBuffer = this.mSocketBuffer;
        videoInfo.isAutoDefinition = this.isAutoDefinition;
        videoInfo.mQuality = this.mQuality;
        videoInfo.mLogoType = this.mLogoType;
        videoInfo.mFileHash = this.mFileHash;
        videoInfo.mCheckInfo = this.mCheckInfo;
        videoInfo.mInitRange = this.mInitRange;
        videoInfo.mIndexRange = this.mIndexRange;
        videoInfo.mKid = this.mKid;
        videoInfo.mQualityType = this.mQualityType;
        videoInfo.mURLsVer2 = this.mURLsVer2;
        videoInfo.mMainUrlVer2 = this.mMainUrlVer2;
        videoInfo.mVWidthVer2 = this.mVWidthVer2;
        videoInfo.mVHeightVer2 = this.mVHeightVer2;
        videoInfo.mSpadeaVer2 = this.mSpadeaVer2;
        videoInfo.mVTypeVer2 = this.mVTypeVer2;
        videoInfo.mCodecTypeVer2 = this.mCodecTypeVer2;
        videoInfo.mDefinitionVer2 = this.mDefinitionVer2;
        videoInfo.preLoadSizeVer2 = this.preLoadSizeVer2;
        videoInfo.preLoadMinStepVer2 = this.preLoadMinStepVer2;
        videoInfo.preLoadMaxStepVer2 = this.preLoadMaxStepVer2;
        videoInfo.mSizeVer2 = this.mSizeVer2;
        videoInfo.preLoadIntervalVer2 = this.preLoadIntervalVer2;
        videoInfo.mLogoTypeVer2 = this.mLogoTypeVer2;
        videoInfo.mFileId = this.mFileId;
        videoInfo.mP2pVerifyUrl = this.mP2pVerifyUrl;
        videoInfo.mMediatype = this.mMediatype;
        videoInfo.mFileHashVer2 = this.mFileHashVer2;
        return videoInfo;
    }

    @Override // com.ss.ttvideoengine.model.IVideoInfo
    public JSONObject toBashJsonObject() {
        String str;
        try {
            JSONObject jSONObject = new JSONObject();
            String[] valueStrArr = getValueStrArr(16);
            if (valueStrArr != null) {
                if (valueStrArr.length > 0) {
                    jSONObject.put("main_url", valueStrArr[0]);
                    if (valueStrArr.length > 1) {
                        str = valueStrArr[1];
                    } else {
                        str = "";
                    }
                    jSONObject.put("backup_url_1", str);
                    jSONObject.put("bitrate", getValueInt(3));
                    jSONObject.put("vwidth", getValueInt(1));
                    jSONObject.put("vheight", getValueInt(2));
                    jSONObject.put("init_range", getValueStr(34));
                    jSONObject.put("index_range", getValueStr(35));
                    jSONObject.put("check_info", getValueStr(31));
                    jSONObject.put("kid", getValueStr(36));
                    jSONObject.put("loudness", (double) getValueFloat(39));
                    jSONObject.put("peak", (double) getValueFloat(40));
                    jSONObject.put("info_id", getValueInt(42));
                    return jSONObject;
                }
            }
            return null;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override // com.ss.ttvideoengine.model.IVideoInfo
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
        String valueStr = getValueStr(29);
        if (valueStr == null) {
            valueStr = "";
        }
        hashMap.put("p2p_crc", TTHelper.encodeUrl(valueStr));
        return hashMap;
    }

    public void setMediatype(int i) {
        this.mMediatype = i;
    }

    public void setResolution(Resolution resolution) {
        this.mResolution = resolution;
    }

    public void setVersion(int i) {
        this.mVersion = i;
    }

    @Override // com.ss.ttvideoengine.model.IVideoInfo
    public boolean getValueBool(int i) {
        if (this.mVersion == 1 && i == 4) {
            return this.mEncrypt;
        }
        return false;
    }

    @Override // com.ss.ttvideoengine.model.IVideoInfo
    public float getValueFloat(int i) {
        if (i == 39) {
            return this.mLoudness;
        }
        if (i != 40) {
            return BitmapDescriptorFactory.HUE_RED;
        }
        return this.mPeak;
    }

    @Override // com.ss.ttvideoengine.model.IVideoInfo
    public long getValueLong(int i) {
        if (this.mVersion == 2) {
            if (i != 12) {
                return -1;
            }
            return this.mSizeVer2;
        } else if (i == 12) {
            return this.mSize;
        } else {
            if (i != 30) {
                return -1;
            }
            return this.mUrlExpiredT;
        }
    }

    @Override // com.ss.ttvideoengine.model.IVideoInfo
    public String[] getValueStrArr(int i) {
        if (this.mVersion == 2) {
            if (i != 16) {
                return new String[0];
            }
            return this.mURLsVer2;
        } else if (i != 16) {
            return new String[0];
        } else {
            return this.mURLs;
        }
    }

    public VideoInfo(String str) {
        this.mKeyseed = str;
    }

    public void setResolutionBaseMap(HashMap<String, Resolution> hashMap) {
        if (hashMap != null && hashMap.size() > 0) {
            String str = null;
            if (this.mMediatype == VideoRef.TYPE_AUDIO) {
                str = getValueStr(18);
                if (TextUtils.isEmpty(str)) {
                    str = Resolution.Standard.toString(this.mMediatype);
                }
            } else if (this.mMediatype == VideoRef.TYPE_VIDEO) {
                str = getValueStr(7);
                if (TextUtils.isEmpty(str)) {
                    str = Resolution.Standard.toString(this.mMediatype);
                }
            }
            Resolution resolution = hashMap.get(str);
            this.mResolution = resolution;
            if (resolution == null) {
                this.mResolution = Resolution.Standard;
            }
        }
    }

    @Override // com.ss.ttvideoengine.model.IVideoInfo
    public int getValueInt(int i) {
        if (i == 38) {
            MediaBitrateFitterInfo mediaBitrateFitterInfo = this.mBitrateFitterInfo;
            if (mediaBitrateFitterInfo != null) {
                return mediaBitrateFitterInfo.getHeaderSize();
            }
            return 0;
        } else if (this.mVersion == 2) {
            if (i == 1) {
                return this.mVWidthVer2;
            }
            if (i == 2) {
                return this.mVHeightVer2;
            }
            if (i == 3) {
                return this.mBitrateVer2;
            }
            if (i == 13) {
                return this.preLoadIntervalVer2;
            }
            if (i == 41) {
                return this.mQualityType;
            }
            if (i == 42) {
                return this.mInfoId;
            }
            switch (i) {
                case 9:
                    return this.preLoadSizeVer2;
                case 10:
                    return this.preLoadMinStepVer2;
                case 11:
                    return this.preLoadMaxStepVer2;
                default:
                    return -1;
            }
        } else if (i == 1) {
            return this.mVWidth;
        } else {
            if (i == 2) {
                return this.mVHeight;
            }
            if (i == 3) {
                return this.mBitrate;
            }
            if (i == 13) {
                return this.preloadInterval;
            }
            if (i == 27) {
                return this.mVideoDuration;
            }
            if (i == 41) {
                return this.mQualityType;
            }
            if (i == 42) {
                return this.mInfoId;
            }
            switch (i) {
                case 9:
                    return this.preloadSize;
                case 10:
                    return this.playLoadMinStep;
                case 11:
                    return this.playLoadMaxStep;
                default:
                    switch (i) {
                        case 20:
                            return this.mGbr;
                        case 21:
                            return this.useVideoProxy;
                        case 22:
                            return this.mSocketBuffer;
                        default:
                            return -1;
                    }
            }
        }
    }

    @Override // com.ss.ttvideoengine.model.IVideoInfo
    public String getValueStr(int i) {
        switch (i) {
            case 26:
                return this.mResolutonStr;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP:
            case 30:
            case 32:
            case 33:
            default:
                if (this.mVersion == 2) {
                    if (i == 0) {
                        return this.mMainUrlVer2;
                    }
                    if (i == 15) {
                        return this.mFileHashVer2;
                    }
                    if (i == 5) {
                        return this.mSpadeaVer2;
                    }
                    if (i == 6) {
                        return this.mVTypeVer2;
                    }
                    if (i == 7) {
                        return this.mDefinitionVer2;
                    }
                    if (i == 8) {
                        return this.mCodecTypeVer2;
                    }
                    switch (i) {
                        case 17:
                            return this.mBackupUrl1Ver2;
                        case 18:
                            return this.mQualityVer2;
                        case 19:
                            return this.mLogoTypeVer2;
                        default:
                            return "";
                    }
                } else if (i == 0) {
                    return this.mMainUrl;
                } else {
                    if (i == 15) {
                        return this.mFileHash;
                    }
                    if (i == 37) {
                        return this.mBarrageMaskUrl;
                    }
                    if (i == 5) {
                        return this.mSpadea;
                    }
                    if (i == 6) {
                        return this.mVType;
                    }
                    if (i == 7) {
                        return this.mDefinition;
                    }
                    if (i == 8) {
                        return this.mCodecType;
                    }
                    if (i == 32) {
                        return this.mQualityDesc;
                    }
                    if (i == 33) {
                        return this.mBarrageMaskOffset;
                    }
                    switch (i) {
                        case 17:
                            return this.mBackupUrl1;
                        case 18:
                            return this.mQuality;
                        case 19:
                            return this.mLogoType;
                        default:
                            switch (i) {
                                case 23:
                                    return this.mBackupUrl2;
                                case 24:
                                    return this.mBackupUrl3;
                                case AvailableCode.ERROR_ON_ACTIVITY_RESULT:
                                    return this.mStorePath;
                                default:
                                    return "";
                            }
                    }
                }
            case IVideoEventLogger.LOGGER_OPTION_ENABLE_SR:
                return this.mFileId;
            case 29:
                return this.mP2pVerifyUrl;
            case TTVideoEngine.PLAYER_OPTION_ENABLE_PLAYER3_HARDWARE_DECODE /*{ENCODED_INT: 31}*/:
                return this.mCheckInfo;
            case 34:
                return this.mInitRange;
            case 35:
                return this.mIndexRange;
            case 36:
                return this.mKid;
        }
    }

    public void setValue(int i, boolean z) {
        if (i == 4) {
            this.mEncrypt = z;
        }
    }

    public void setValue(int i, float f) {
        if (i == 39) {
            this.mLoudness = f;
        } else if (i == 40) {
            this.mPeak = f;
        }
    }

    public void setValue(int i, long j) {
        if (i == 12) {
            this.mSize = j;
            this.mSizeVer2 = j;
        }
    }

    public void setValue(int i, String[] strArr) {
        if (i == 16) {
            this.mURLs = strArr;
            this.mURLsVer2 = strArr;
        }
    }

    public void setValue(int i, int i2) {
        if (i == 1) {
            this.mVWidth = i2;
            this.mVWidthVer2 = i2;
        } else if (i == 2) {
            this.mVHeight = i2;
            this.mVHeightVer2 = i2;
        } else if (i == 3) {
            this.mBitrate = i2;
            this.mBitrateVer2 = i2;
        } else if (i == 13) {
            this.preloadInterval = i2;
            this.preLoadIntervalVer2 = i2;
        } else if (i != 27) {
            switch (i) {
                case 9:
                    this.preloadSize = i2;
                    this.preLoadSizeVer2 = i2;
                    return;
                case 10:
                    this.playLoadMinStep = i2;
                    return;
                case 11:
                    this.playLoadMaxStep = i2;
                    return;
                default:
                    switch (i) {
                        case 20:
                            this.mGbr = i2;
                            return;
                        case 21:
                            this.useVideoProxy = i2;
                            return;
                        case 22:
                            this.mSocketBuffer = i2;
                            return;
                        default:
                            return;
                    }
            }
        } else {
            this.mVideoDuration = i2;
        }
    }

    public void setValue(int i, String str) {
        if (i == 0) {
            this.mMainUrlVer2 = str;
            this.mMainUrl = str;
        } else if (i == 15) {
            this.mFileHashVer2 = str;
            this.mFileHash = str;
        } else if (i == 5) {
            this.mSpadeaVer2 = str;
            this.mSpadea = str;
        } else if (i == 6) {
            this.mVTypeVer2 = str;
            this.mVType = str;
        } else if (i == 7) {
            this.mDefinitionVer2 = str;
            this.mDefinition = str;
        } else if (i != 8) {
            switch (i) {
                case 17:
                    this.mBackupUrl1Ver2 = str;
                    this.mBackupUrl1 = str;
                    return;
                case 18:
                    this.mQualityVer2 = str;
                    this.mQuality = str;
                    return;
                case 19:
                    this.mLogoTypeVer2 = str;
                    this.mLogoType = str;
                    return;
                default:
                    switch (i) {
                        case 23:
                            this.mBackupUrl2 = str;
                            return;
                        case 24:
                            this.mBackupUrl3 = str;
                            return;
                        case AvailableCode.ERROR_ON_ACTIVITY_RESULT:
                            this.mStorePath = str;
                            return;
                        case 26:
                            this.mResolutonStr = str;
                            return;
                        default:
                            return;
                    }
            }
        } else {
            this.mCodecTypeVer2 = str;
            this.mCodecType = str;
        }
    }
}
