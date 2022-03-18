package com.ss.ttvideoengine.model;

import android.text.TextUtils;
import com.google.firebase.messaging.Constants;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.ss.android.vc.meeting.framework.statemachine.SmEvents;
import com.ss.ttvideoengine.Resolution;
import com.ss.ttvideoengine.TTVideoEngine;
import com.ss.ttvideoengine.model.IVideoModel;
import com.ss.ttvideoengine.utils.TTVideoEngineLog;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONObject;

public class VideoModel implements IVideoModel {
    public LiveVideoRef liveVideoRef;
    private JSONObject mJsonInfo;
    private String mKeyseed;
    private HashMap<String, Resolution> mResolutionMap;
    private int mSourceType = 1;
    private boolean mURLEncrypted;
    private int mVersion = 1;
    public List<VideoAdRef> videoAdRefList;
    public VideoRef videoRef;
    private VideoRef vodVideoRef;

    public JSONObject getJsonInfo() {
        return this.mJsonInfo;
    }

    public int getSourceType() {
        return this.mSourceType;
    }

    public VideoRef getVideoRef() {
        return this.vodVideoRef;
    }

    @Override // com.ss.ttvideoengine.model.IVideoModel
    public String[] getCodecs() {
        VideoRef videoRef2 = this.vodVideoRef;
        if (videoRef2 != null) {
            return videoRef2.getCodecs();
        }
        return new String[0];
    }

    @Override // com.ss.ttvideoengine.model.IVideoModel
    public JSONObject getDnsInfo() {
        VideoRef videoRef2 = this.vodVideoRef;
        if (videoRef2 != null) {
            return videoRef2.getDnsInfo();
        }
        return null;
    }

    @Override // com.ss.ttvideoengine.model.IVideoModel
    public String getDynamicType() {
        VideoRef videoRef2 = this.vodVideoRef;
        if (videoRef2 != null) {
            return videoRef2.getValueStr(SmEvents.EVENT_HEARTBEAT_INVALID);
        }
        return "";
    }

    @Override // com.ss.ttvideoengine.model.IVideoModel
    public IVideoModel.Source getSource() {
        IVideoModel.Source source = IVideoModel.Source.None;
        int i = this.mSourceType;
        if (i == 0) {
            return IVideoModel.Source.LIVE;
        }
        if (i != 1) {
            return source;
        }
        return IVideoModel.Source.VOD;
    }

    @Override // com.ss.ttvideoengine.model.IVideoModel
    public List<SubInfo> getSubInfoList() {
        VideoRef videoRef2 = this.vodVideoRef;
        if (videoRef2 != null) {
            return videoRef2.mSubInfoList;
        }
        return null;
    }

    @Override // com.ss.ttvideoengine.model.IVideoModel
    public String[] getSupportQualityInfos() {
        VideoRef videoRef2 = this.vodVideoRef;
        if (videoRef2 != null) {
            return videoRef2.getSupportQualityInfos();
        }
        return null;
    }

    @Override // com.ss.ttvideoengine.model.IVideoModel
    public Resolution[] getSupportResolutions() {
        VideoRef videoRef2 = this.vodVideoRef;
        if (videoRef2 != null) {
            return videoRef2.getSupportResolutions();
        }
        return new Resolution[0];
    }

    @Override // com.ss.ttvideoengine.model.IVideoModel
    public int[] getSupportSubtitleLangs() {
        VideoRef videoRef2 = this.vodVideoRef;
        if (videoRef2 != null) {
            return videoRef2.getSupportSubtitleLangs();
        }
        return null;
    }

    public List<VideoThumbInfo> getThumbInfoList() {
        VideoRef videoRef2 = this.vodVideoRef;
        if (videoRef2 != null) {
            return videoRef2.mThumbInfoList;
        }
        return null;
    }

    @Override // com.ss.ttvideoengine.model.IVideoModel
    public String getVType() {
        VideoRef videoRef2 = this.vodVideoRef;
        if (videoRef2 != null) {
            return videoRef2.getValueStr(211);
        }
        return "mp4";
    }

    @Override // com.ss.ttvideoengine.model.IVideoModel
    public List<VideoInfo> getVideoInfoList() {
        VideoRef videoRef2 = this.vodVideoRef;
        if (videoRef2 == null) {
            return Collections.emptyList();
        }
        return videoRef2.getVideoInfoList();
    }

    public VideoSeekTs getVideoSeekTS() {
        VideoRef videoRef2 = this.vodVideoRef;
        if (videoRef2 != null) {
            return videoRef2.mSeekTs;
        }
        return null;
    }

    @Override // com.ss.ttvideoengine.model.IVideoModel
    public boolean hasData() {
        if (this.vodVideoRef == null && this.liveVideoRef == null) {
            return false;
        }
        return true;
    }

    public boolean isLiveSource() {
        if (getSource() == IVideoModel.Source.LIVE) {
            return true;
        }
        return false;
    }

    @Override // com.ss.ttvideoengine.model.IVideoModel
    public String toMediaInfoJsonString() {
        JSONObject mediaInfo = getMediaInfo();
        if (mediaInfo != null) {
            return mediaInfo.toString();
        }
        return null;
    }

    public boolean isDashSource() {
        VideoRef videoRef2 = this.vodVideoRef;
        if (videoRef2 == null || !videoRef2.getValueBool(SmEvents.EVENT_HB_NOTICE_DISCONNECT).booleanValue()) {
            return false;
        }
        return true;
    }

    public boolean isHlsSource() {
        VideoRef videoRef2 = this.vodVideoRef;
        if (videoRef2 == null || !videoRef2.getValueBool(208).booleanValue()) {
            return false;
        }
        return true;
    }

    public boolean isMp4Source() {
        VideoRef videoRef2 = this.vodVideoRef;
        if (videoRef2 == null || !videoRef2.getValueBool(SmEvents.EVENT_NONET).booleanValue()) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.ttvideoengine.model.VideoModel$1 */
    public static /* synthetic */ class C654671 {
        static final /* synthetic */ int[] $SwitchMap$com$ss$ttvideoengine$model$IVideoModel$Format;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        static {
            /*
                com.ss.ttvideoengine.model.IVideoModel$Format[] r0 = com.ss.ttvideoengine.model.IVideoModel.Format.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.ss.ttvideoengine.model.VideoModel.C654671.$SwitchMap$com$ss$ttvideoengine$model$IVideoModel$Format = r0
                com.ss.ttvideoengine.model.IVideoModel$Format r1 = com.ss.ttvideoengine.model.IVideoModel.Format.HLS     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = com.ss.ttvideoengine.model.VideoModel.C654671.$SwitchMap$com$ss$ttvideoengine$model$IVideoModel$Format     // Catch:{ NoSuchFieldError -> 0x001d }
                com.ss.ttvideoengine.model.IVideoModel$Format r1 = com.ss.ttvideoengine.model.IVideoModel.Format.MP4     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = com.ss.ttvideoengine.model.VideoModel.C654671.$SwitchMap$com$ss$ttvideoengine$model$IVideoModel$Format     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.ss.ttvideoengine.model.IVideoModel$Format r1 = com.ss.ttvideoengine.model.IVideoModel.Format.DASH     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = com.ss.ttvideoengine.model.VideoModel.C654671.$SwitchMap$com$ss$ttvideoengine$model$IVideoModel$Format     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.ss.ttvideoengine.model.IVideoModel$Format r1 = com.ss.ttvideoengine.model.IVideoModel.Format.NONE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.ttvideoengine.model.VideoModel.C654671.<clinit>():void");
        }
    }

    @Override // com.ss.ttvideoengine.model.IVideoModel
    public String getSpadea() {
        List<VideoInfo> videoInfoList;
        VideoRef videoRef2 = this.vodVideoRef;
        if (videoRef2 == null || (videoInfoList = videoRef2.getVideoInfoList()) == null || videoInfoList.size() == 0) {
            return null;
        }
        for (VideoInfo videoInfo : videoInfoList) {
            String valueStr = videoInfo.getValueStr(5);
            if (!TextUtils.isEmpty(valueStr)) {
                return valueStr;
            }
        }
        return null;
    }

    @Override // com.ss.ttvideoengine.model.IVideoModel
    public List<Integer> getSupportedTTSAudioInfo() {
        VideoRef videoRef2 = this.vodVideoRef;
        ArrayList arrayList = null;
        if (videoRef2 == null) {
            return null;
        }
        List<VideoInfo> valueList = videoRef2.getValueList(231);
        if (!(valueList == null || valueList.size() == 0)) {
            arrayList = new ArrayList();
            for (VideoInfo videoInfo : valueList) {
                arrayList.add(Integer.valueOf(videoInfo.getValueInt(42)));
            }
        }
        return arrayList;
    }

    @Override // com.ss.ttvideoengine.model.IVideoModel
    public boolean isSupportHLSSeamlessSwitch() {
        if (!TextUtils.isEmpty(getVideoRefStr(8)) && hasFormat(IVideoModel.Format.HLS) && getVideoRefBool(222)) {
            return true;
        }
        return false;
    }

    public String getCodec() {
        VideoInfo videoInfo;
        VideoRef videoRef2 = this.vodVideoRef;
        if (videoRef2 != null) {
            if (this.mVersion == 2) {
                String[] codecs = videoRef2.getCodecs();
                boolean z = false;
                for (String str : codecs) {
                    if (str.equals("bytevc2")) {
                        return "bytevc2";
                    }
                    if (str.equals("bytevc1")) {
                        z = true;
                    }
                }
                if (z) {
                    return "bytevc1";
                }
                return "h264";
            }
            List<VideoInfo> videoInfoList = videoRef2.getVideoInfoList();
            if (!(videoInfoList == null || videoInfoList.size() == 0 || (videoInfo = videoInfoList.get(0)) == null)) {
                String str2 = videoInfo.mCodecType;
                if (TextUtils.isEmpty(str2)) {
                    return "h264";
                }
                return str2;
            }
        }
        return "h264";
    }

    @Override // com.ss.ttvideoengine.model.IVideoModel
    public Set<IVideoModel.Format> getFormats() {
        HashSet hashSet = new HashSet();
        VideoRef videoRef2 = this.vodVideoRef;
        if (videoRef2 != null) {
            if (videoRef2.getValueBool(SmEvents.EVENT_NONET).booleanValue()) {
                hashSet.add(IVideoModel.Format.MP4);
            } else if (this.vodVideoRef.getValueBool(208).booleanValue()) {
                hashSet.add(IVideoModel.Format.HLS);
            } else if (this.vodVideoRef.getValueBool(SmEvents.EVENT_HB_NOTICE_DISCONNECT).booleanValue() || this.vodVideoRef.getValueBool(207).booleanValue()) {
                hashSet.add(IVideoModel.Format.DASH);
            }
        }
        return hashSet;
    }

    @Override // com.ss.ttvideoengine.model.IVideoModel
    public JSONObject getMediaInfo() {
        String videoRefStr = getVideoRefStr(211);
        String videoRefStr2 = getVideoRefStr(2);
        int videoRefInt = getVideoRefInt(3);
        List<VideoInfo> videoInfoList = getVideoInfoList();
        if (videoInfoList == null) {
            return null;
        }
        try {
            HashMap hashMap = new HashMap();
            ArrayList arrayList = new ArrayList();
            for (VideoInfo videoInfo : videoInfoList) {
                arrayList.add(videoInfo.toMediaInfo());
            }
            hashMap.put("format", videoRefStr);
            hashMap.put("vid", videoRefStr2);
            hashMap.put("category", Integer.valueOf(getVideoRefInt(232)));
            hashMap.put("frt_sub_vid", getVideoRefStr(233));
            hashMap.put("duration", Integer.valueOf(videoRefInt));
            hashMap.put("infos", arrayList);
            return new JSONObject(hashMap);
        } catch (Throwable th) {
            TTVideoEngineLog.m256501d(th);
            return null;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0045 A[RETURN] */
    @Override // com.ss.ttvideoengine.model.IVideoModel
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean isSupportBash() {
        /*
            r4 = this;
            r0 = 8
            java.lang.String r0 = r4.getVideoRefStr(r0)
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            r1 = 0
            if (r0 == 0) goto L_0x000e
            return r1
        L_0x000e:
            com.ss.ttvideoengine.model.IVideoModel$Format r0 = com.ss.ttvideoengine.model.IVideoModel.Format.DASH
            boolean r0 = r4.hasFormat(r0)
            r2 = 1
            if (r0 == 0) goto L_0x002a
            java.lang.String r0 = r4.getDynamicType()
            boolean r3 = android.text.TextUtils.isEmpty(r0)
            if (r3 != 0) goto L_0x0045
            java.lang.String r3 = "segment_base"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0045
            return r2
        L_0x002a:
            com.ss.ttvideoengine.model.IVideoModel$Format r0 = com.ss.ttvideoengine.model.IVideoModel.Format.MP4
            boolean r0 = r4.hasFormat(r0)
            if (r0 == 0) goto L_0x0045
            r0 = 222(0xde, float:3.11E-43)
            boolean r0 = r4.getVideoRefBool(r0)
            if (r0 == 0) goto L_0x0045
            java.lang.String r0 = r4.getSpadea()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L_0x0045
            return r2
        L_0x0045:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.ttvideoengine.model.VideoModel.isSupportBash():boolean");
    }

    public void setVideoRef(VideoRef videoRef2) {
        this.vodVideoRef = videoRef2;
        setUpResolution(this.mResolutionMap);
    }

    public VideoInfo getVideoInfo(Resolution resolution) {
        VideoRef videoRef2 = this.vodVideoRef;
        if (videoRef2 != null) {
            return videoRef2.getVideoInfo(resolution, null);
        }
        return null;
    }

    @Override // com.ss.ttvideoengine.model.IVideoModel
    public boolean getVideoRefBool(int i) {
        VideoRef videoRef2 = this.vodVideoRef;
        if (videoRef2 != null) {
            return videoRef2.getValueBool(i).booleanValue();
        }
        return false;
    }

    @Override // com.ss.ttvideoengine.model.IVideoModel
    public float getVideoRefFloat(int i) {
        VideoRef videoRef2 = this.vodVideoRef;
        if (videoRef2 != null) {
            return videoRef2.getValueFloat(i);
        }
        return BitmapDescriptorFactory.HUE_RED;
    }

    @Override // com.ss.ttvideoengine.model.IVideoModel
    public int getVideoRefInt(int i) {
        VideoRef videoRef2 = this.vodVideoRef;
        if (videoRef2 != null) {
            return videoRef2.getValueInt(i);
        }
        return -1;
    }

    @Override // com.ss.ttvideoengine.model.IVideoModel
    public long getVideoRefLong(int i) {
        VideoRef videoRef2 = this.vodVideoRef;
        if (videoRef2 != null) {
            return videoRef2.getValueLong(i);
        }
        return 0;
    }

    @Override // com.ss.ttvideoengine.model.IVideoModel
    public String getVideoRefStr(int i) {
        VideoRef videoRef2 = this.vodVideoRef;
        if (videoRef2 != null) {
            return videoRef2.getValueStr(i);
        }
        return "";
    }

    @Override // com.ss.ttvideoengine.model.IVideoModel
    public String resolutionToString(Resolution resolution) {
        VideoRef videoRef2 = this.vodVideoRef;
        if (videoRef2 != null) {
            return videoRef2.resolutionToString(resolution);
        }
        return resolution.toString(VideoRef.TYPE_VIDEO);
    }

    @Override // com.ss.ttvideoengine.model.IVideoModel
    public void setUpResolution(HashMap<String, Resolution> hashMap) {
        this.mResolutionMap = hashMap;
        VideoRef videoRef2 = this.vodVideoRef;
        if (videoRef2 != null) {
            videoRef2.setUpResolution(hashMap);
        }
    }

    @Override // com.ss.ttvideoengine.model.IVideoModel
    public String[] allVideoURLs(Resolution resolution) {
        LiveVideoInfo liveVideoInfo;
        VideoRef videoRef2 = this.vodVideoRef;
        if (videoRef2 != null) {
            return videoRef2.allVideoURLs(resolution, null);
        }
        LiveVideoRef liveVideoRef2 = this.liveVideoRef;
        if (liveVideoRef2 == null || (liveVideoInfo = liveVideoRef2.getLiveVideoInfo()) == null) {
            return new String[0];
        }
        return liveVideoInfo.mURLs;
    }

    public int getPreloadInterval(Resolution resolution) {
        VideoInfo videoInfo;
        VideoRef videoRef2 = this.vodVideoRef;
        if (videoRef2 == null || (videoInfo = videoRef2.getVideoInfo(resolution, null)) == null) {
            return 0;
        }
        return videoInfo.getValueInt(13);
    }

    @Override // com.ss.ttvideoengine.model.IVideoModel
    public List<Integer> getSupportInfoId(int i) {
        VideoRef videoRef2 = this.vodVideoRef;
        ArrayList arrayList = null;
        if (videoRef2 == null) {
            return null;
        }
        List<VideoInfo> videoInfoList = videoRef2.getVideoInfoList();
        if (!(videoInfoList == null || videoInfoList.size() == 0)) {
            arrayList = new ArrayList();
            for (VideoInfo videoInfo : videoInfoList) {
                if (videoInfo.getMediatype() == i) {
                    arrayList.add(Integer.valueOf(videoInfo.mInfoId));
                }
            }
        }
        return arrayList;
    }

    @Override // com.ss.ttvideoengine.model.IVideoModel
    public VideoInfo getVideoInfoByInfoId(int i) {
        VideoRef videoRef2;
        List<VideoInfo> videoInfoList;
        if (!(i < 0 || (videoRef2 = this.vodVideoRef) == null || (videoInfoList = videoRef2.getVideoInfoList()) == null || videoInfoList.size() == 0)) {
            for (VideoInfo videoInfo : videoInfoList) {
                if (videoInfo.mInfoId == i) {
                    return videoInfo;
                }
            }
        }
        return null;
    }

    @Override // com.ss.ttvideoengine.model.IVideoModel
    public boolean hasFormat(IVideoModel.Format format) {
        if (this.vodVideoRef == null) {
            return false;
        }
        int i = C654671.$SwitchMap$com$ss$ttvideoengine$model$IVideoModel$Format[format.ordinal()];
        if (i == 1) {
            return this.vodVideoRef.getValueBool(208).booleanValue();
        }
        if (i == 2) {
            return this.vodVideoRef.getValueBool(SmEvents.EVENT_NONET).booleanValue();
        }
        if (i != 3) {
            return false;
        }
        return this.vodVideoRef.getValueBool(SmEvents.EVENT_HB_NOTICE_DISCONNECT).booleanValue();
    }

    public void extractFields(JSONObject jSONObject) throws Throwable {
        if (jSONObject != null) {
            try {
                this.mJsonInfo = new JSONObject(jSONObject.toString());
            } catch (Throwable unused) {
                TTVideoEngineLog.m256503e("VideoModel", "generate mJsonInfo error");
            }
            JSONObject optJSONObject = jSONObject.optJSONObject("video_info");
            if (optJSONObject != null && optJSONObject.length() > 0) {
                this.mVersion = 1;
                VideoRef videoRef2 = new VideoRef();
                videoRef2.setVersion(this.mVersion);
                JSONObject optJSONObject2 = optJSONObject.optJSONObject(Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
                videoRef2.setValueBool(219, this.mURLEncrypted);
                videoRef2.setValueStr(SmEvents.EVENT_AUTO_END, this.mKeyseed);
                videoRef2.extractFields(optJSONObject2);
                this.videoRef = videoRef2;
                this.vodVideoRef = videoRef2;
            }
            JSONArray optJSONArray = jSONObject.optJSONArray("video_ad_list");
            if (optJSONArray != null && optJSONArray.length() > 0) {
                this.videoAdRefList = new ArrayList();
                for (int i = 0; i < optJSONArray.length(); i++) {
                    try {
                        VideoAdRef videoAdRef = new VideoAdRef();
                        videoAdRef.extractFields(optJSONArray.getJSONObject(i));
                        this.videoAdRefList.add(videoAdRef);
                    } catch (Exception unused2) {
                    }
                }
            }
            JSONObject optJSONObject3 = jSONObject.optJSONObject("live_info");
            if (optJSONObject3 != null) {
                this.mSourceType = 0;
                this.liveVideoRef = new LiveVideoRef();
                this.liveVideoRef.extractFields(optJSONObject3.optJSONObject(Constants.ScionAnalytics.MessageType.DATA_MESSAGE));
            }
            JSONArray optJSONArray2 = jSONObject.optJSONArray("PlayInfoList");
            if ((optJSONArray2 != null && optJSONArray2.length() > 0) || !TextUtils.isEmpty(jSONObject.optString("VideoID")) || !TextUtils.isEmpty(jSONObject.optString("Vid"))) {
                if (jSONObject.optInt("Version") == 4) {
                    this.mVersion = 4;
                } else {
                    this.mVersion = 2;
                }
                VideoRef videoRef3 = new VideoRef();
                this.vodVideoRef = videoRef3;
                videoRef3.setVersion(this.mVersion);
                this.vodVideoRef.extractFields(jSONObject);
            }
            setUpResolution(this.mResolutionMap);
        }
    }

    @Override // com.ss.ttvideoengine.model.IVideoModel
    public VideoInfo getVideoInfo(Map<Integer, String> map) {
        VideoRef videoRef2 = this.vodVideoRef;
        if (videoRef2 != null) {
            return videoRef2.getVideoInfo(map);
        }
        return null;
    }

    public void setVideoRefBool(int i, boolean z) {
        if (i == 219) {
            this.mURLEncrypted = z;
        }
    }

    public void setVideoRefStr(int i, String str) {
        VideoRef videoRef2 = this.vodVideoRef;
        if (videoRef2 != null) {
            videoRef2.setValueStr(i, str);
        }
        if (i == 218) {
            this.mKeyseed = str;
        }
    }

    @Override // com.ss.ttvideoengine.model.IVideoModel
    public String[] allVideoURLs(Resolution resolution, Map<Integer, String> map) {
        LiveVideoInfo liveVideoInfo;
        VideoRef videoRef2 = this.vodVideoRef;
        if (videoRef2 != null) {
            return videoRef2.allVideoURLs(resolution, map);
        }
        LiveVideoRef liveVideoRef2 = this.liveVideoRef;
        if (liveVideoRef2 == null || (liveVideoInfo = liveVideoRef2.getLiveVideoInfo()) == null) {
            return new String[0];
        }
        return liveVideoInfo.mURLs;
    }

    public int getPreloadInterval(Resolution resolution, Map<Integer, String> map) {
        VideoInfo videoInfo;
        VideoRef videoRef2 = this.vodVideoRef;
        if (videoRef2 == null || (videoInfo = videoRef2.getVideoInfo(resolution, map)) == null) {
            return 0;
        }
        videoInfo.getValueInt(13);
        return 0;
    }

    @Override // com.ss.ttvideoengine.model.IVideoModel
    public VideoInfo getVideoInfo(Resolution resolution, Map<Integer, String> map) {
        VideoRef videoRef2 = this.vodVideoRef;
        if (videoRef2 != null) {
            return videoRef2.getVideoInfo(resolution, map);
        }
        return null;
    }

    @Override // com.ss.ttvideoengine.model.IVideoModel
    public VideoInfo getVideoInfo(Resolution resolution, boolean z) {
        VideoRef videoRef2 = this.vodVideoRef;
        if (videoRef2 != null) {
            return getVideoInfo(resolution, videoRef2.getValueInt(7), null, z);
        }
        return null;
    }

    @Override // com.ss.ttvideoengine.model.IVideoModel
    public VideoInfo getVideoInfo(Resolution resolution, int i, Map<Integer, String> map) {
        VideoRef videoRef2 = this.vodVideoRef;
        if (videoRef2 != null) {
            return videoRef2.getVideoInfo(resolution, i, map);
        }
        return null;
    }

    @Override // com.ss.ttvideoengine.model.IVideoModel
    public VideoInfo getVideoInfo(Resolution resolution, int i, boolean z) {
        if (this.vodVideoRef != null) {
            return getVideoInfo(resolution, i, null, z);
        }
        return null;
    }

    @Override // com.ss.ttvideoengine.model.IVideoModel
    public VideoInfo getVideoInfo(Resolution resolution, Map<Integer, String> map, boolean z) {
        VideoRef videoRef2 = this.vodVideoRef;
        if (videoRef2 != null) {
            return getVideoInfo(resolution, videoRef2.getValueInt(7), map, z);
        }
        return null;
    }

    @Override // com.ss.ttvideoengine.model.IVideoModel
    public VideoInfo getVideoInfo(Resolution resolution, int i, Map<Integer, String> map, boolean z) {
        String str;
        VideoInfo videoInfo = getVideoInfo(resolution, i, map);
        if (!z) {
            return videoInfo;
        }
        String[] allQualityInfos = TTVideoEngine.getAllQualityInfos();
        int i2 = 0;
        if (allQualityInfos.length > 0 && map != null && map.containsKey(32)) {
            int length = allQualityInfos.length - 1;
            if (videoInfo == null && (str = map.get(32)) != null) {
                int i3 = 0;
                while (true) {
                    if (i3 >= allQualityInfos.length) {
                        break;
                    } else if (allQualityInfos[i3].equals(str)) {
                        length = i3;
                        break;
                    } else {
                        i3++;
                    }
                }
                int i4 = length;
                while (videoInfo == null) {
                    map.put(32, allQualityInfos[i4]);
                    videoInfo = getVideoInfo(resolution, i, map);
                    if (videoInfo == null) {
                        i4 = ((i4 + allQualityInfos.length) - 1) % allQualityInfos.length;
                        if (i4 == length) {
                            break;
                        }
                    } else {
                        return videoInfo;
                    }
                }
            }
        }
        Resolution[] allResolutions = Resolution.getAllResolutions();
        if (allResolutions.length <= 0) {
            return videoInfo;
        }
        int length2 = allResolutions.length - 1;
        if (resolution != null) {
            while (true) {
                if (i2 >= allResolutions.length) {
                    break;
                } else if (allResolutions[i2].getIndex() == resolution.getIndex()) {
                    length2 = i2;
                    break;
                } else {
                    i2++;
                }
            }
        }
        int i5 = length2;
        while (videoInfo == null) {
            videoInfo = getVideoInfo(allResolutions[i5], i, (Map<Integer, String>) null);
            if (videoInfo != null) {
                break;
            }
            i5 = ((i5 + allResolutions.length) - 1) % allResolutions.length;
            if (i5 == length2) {
                break;
            }
        }
        return videoInfo;
    }
}
