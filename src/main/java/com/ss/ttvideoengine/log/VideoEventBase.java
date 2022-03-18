package com.ss.ttvideoengine.log;

import android.content.Context;
import android.text.TextUtils;
import com.ss.ttvideoengine.TTNetWorkListener;
import com.ss.ttvideoengine.TTNetworkStateCallback;
import com.ss.ttvideoengine.model.IVideoModel;
import com.ss.ttvideoengine.model.VideoInfo;
import com.ss.ttvideoengine.model.VideoModel;
import com.ss.ttvideoengine.utils.SessionIDGenerator;
import com.ss.ttvideoengine.utils.TTVideoEngineLog;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

public class VideoEventBase {
    public static volatile String gNetworkType = "unknown";
    public static volatile String gSigStrength = "unknown";
    private static TTNetWorkListener mTTNetWorkListener;
    public Map<String, Object> abrGeneralInfo = null;
    public Map abrInfo = null;
    public String abr_version = "";
    public int audioCodecNameId = Integer.MIN_VALUE;
    public String codec_type = "";
    public String dynamic_type = "";
    public String ffmpeg_version = "";
    public int formatType = Integer.MIN_VALUE;
    public boolean isUploadLogEnabled;
    public int is_enable_abr = 0;
    public int is_multi_dimensions;
    public int is_multi_dimensionsInput;
    public String libvcn_version = "";
    public int mAudioHwUser;
    public Context mContext;
    public String mCurHost;
    public String mCurIP;
    public String mCurQuality;
    public String mCurResolution;
    public String mCurURL;
    public int mCurrentConfigBitrate = Integer.MIN_VALUE;
    public String mCurrentQualityDesc = "";
    public String mCurrentResolution = "";
    public String mDNSType = "";
    public EventLoggerSource mDataSource;
    public String mDeviceId;
    public String mDrmTokenUrl = "";
    public int mDrmType;
    public int mEnableMDL = -1;
    public boolean mEnablePlayerDegrade;
    public String mInitialHost;
    public String mInitialIP;
    public String mInitialQualityDesc = "";
    public String mInitialURL;
    public String mLastResolution = "";
    public String mMdlVersion = "";
    private TTNetworkStateCallback mNetWorkChangeCb;
    private WeakReference<TTNetworkStateCallback> mNetWorkChangeCbr;
    public String mNetworkType = "";
    public String mOriginVid;
    public int mP2PCDNType = Integer.MIN_VALUE;
    public float mPlaySpeed = 1.0f;
    public int mPlayType;
    public int mReuseSocket;
    public String mSessionID;
    public String mSourceTypeStr = "";
    public String mSubTag = "default";
    public String mTag = "default";
    public String mTraceID = "";
    public String mVid = "";
    public int mVideoHW;
    public int mVideoHWUser;
    private Map mVideoInfo;
    public MDLTrackInfo mdlAudioInfo = new MDLTrackInfo();
    public MDLTrackInfo mdlVideoInfo = new MDLTrackInfo();
    public int mdl_cur_task_num = Integer.MIN_VALUE;
    public String pc = "";
    public String predict_version = "";
    public String preload_version = "";
    public String pv = "";
    public String sdk_version = "";
    public int speed_predict_type;
    public String sv = "";
    public String texturender_version = "";
    public int vd = Integer.MIN_VALUE;
    public int videoCodecNameId = Integer.MIN_VALUE;
    public int vs = Integer.MIN_VALUE;
    public String vtype = "";

    private static String _switchNetworkStrength(int i) {
        return i != 1 ? i != 2 ? i != 3 ? i != 4 ? "unknown" : "excellent" : "good" : "medium" : "weak";
    }

    private static String _switchNetworkType(int i) {
        return i != 0 ? i != 1 ? i != 2 ? i != 3 ? i != 4 ? "unknown" : "5G" : "3G" : "2G" : "4G" : "WIFI";
    }

    public String getCurHost() {
        return this.mCurHost;
    }

    public String getCurIP() {
        return this.mCurIP;
    }

    public String getCurQuality() {
        return this.mCurQuality;
    }

    public String getCurResolution() {
        return this.mCurResolution;
    }

    public String getCurURL() {
        return this.mCurURL;
    }

    public Map getVideoInfo() {
        return this.mVideoInfo;
    }

    public void movieFinish() {
        updateVideoInfo(null);
    }

    public void reset() {
        this.mSessionID = SessionIDGenerator.generateSessionID(this.mDeviceId);
    }

    public void unregisterNetwork() {
        TTNetWorkListener tTNetWorkListener = mTTNetWorkListener;
        if (tTNetWorkListener != null) {
            tTNetWorkListener.stopListen(this.mNetWorkChangeCbr);
        }
    }

    public static String getNetType() {
        TTNetWorkListener tTNetWorkListener;
        if (gNetworkType.equals("unknown") && (tTNetWorkListener = mTTNetWorkListener) != null) {
            gNetworkType = _switchNetworkType(tTNetWorkListener.getCurrentAccessType());
        }
        return gNetworkType;
    }

    public static String getSignalStrength() {
        TTNetWorkListener tTNetWorkListener;
        if (gNetworkType.equals("unknown")) {
            return "unknown";
        }
        if (gSigStrength.equals("unknown") && (tTNetWorkListener = mTTNetWorkListener) != null) {
            gSigStrength = _switchNetworkStrength(tTNetWorkListener.getCurrentAccessStrength());
        }
        return gSigStrength;
    }

    public String getCodecType() {
        Map map = this.mVideoInfo;
        Object obj = "";
        String str = obj;
        if (map != null) {
            Map map2 = (Map) map.get("codec");
            Object obj2 = obj;
            if (map2.get(this.mCurrentResolution) != null) {
                obj2 = map2.get(this.mCurrentResolution);
            }
            str = (String) obj2;
        }
        if (this.mDataSource == null || !TextUtils.isEmpty(str)) {
            return str;
        }
        return this.mDataSource.getLogValueStr(0);
    }

    public JSONObject getMDLInfo() {
        String mediaLoaderInfo;
        if (this.mDataSource == null) {
            return null;
        }
        synchronized (this) {
            mediaLoaderInfo = this.mDataSource.getMediaLoaderInfo();
        }
        TTVideoEngineLog.m256500d("VideoEventBase", "update mdl info: " + mediaLoaderInfo);
        if (TextUtils.isEmpty(mediaLoaderInfo)) {
            return null;
        }
        try {
            return new JSONObject(mediaLoaderInfo);
        } catch (JSONException e) {
            TTVideoEngineLog.m256503e("VideoEventBase", e.toString());
            return null;
        }
    }

    public void degradeModeChangeSession() {
        if (this.mEnablePlayerDegrade) {
            String sessionId = VideoEventOneStorage.getInstance().getSessionId(this.mOriginVid);
            TTVideoEngineLog.m256500d("VideoEventBase", "degradeModeChangeSession, stored sessionid:" + sessionId + ", current sessionid:" + this.mSessionID);
            if (sessionId != null && !sessionId.equals(this.mSessionID)) {
                TTVideoEngineLog.m256505i("VideoEventBase", String.format("degrade mode, change sessionId, before:%s, after:%s", this.mSessionID, sessionId));
                this.mSessionID = sessionId;
                this.mTraceID = sessionId;
            }
        }
    }

    public void registerNetwork() {
        if (this.mContext != null) {
            synchronized ("VideoEventBase") {
                if (mTTNetWorkListener == null) {
                    mTTNetWorkListener = TTNetWorkListener.getInstance();
                }
                this.mNetWorkChangeCb = new TTNetworkStateCallback() {
                    /* class com.ss.ttvideoengine.log.VideoEventBase.C654511 */

                    @Override // com.ss.ttvideoengine.TTNetworkStateCallback
                    public void onAccessChanged(int i, int i2, int i3) {
                        if (i == 0) {
                            VideoEventBase.this._changeNetworkType(i2, i3);
                        } else if (i == 1) {
                            VideoEventBase.this._changeSignalStrength(i2, i3);
                        }
                    }
                };
                WeakReference<TTNetworkStateCallback> weakReference = new WeakReference<>(this.mNetWorkChangeCb);
                this.mNetWorkChangeCbr = weakReference;
                mTTNetWorkListener.startListen(weakReference);
                gNetworkType = _switchNetworkType(mTTNetWorkListener.getCurrentAccessType());
                gSigStrength = _switchNetworkStrength(mTTNetWorkListener.getCurrentAccessStrength());
            }
        }
    }

    public void updateMDLInfo() {
        JSONObject mDLInfo = getMDLInfo();
        if (mDLInfo != null) {
            boolean z = false;
            try {
                if (!mDLInfo.isNull("audio")) {
                    this.mdlAudioInfo.update(mDLInfo.getJSONObject("audio"));
                    z = true;
                }
                if (!mDLInfo.isNull("video")) {
                    TTVideoEngineLog.m256500d("VideoEventBase", "found video: " + mDLInfo.getJSONObject("video").toString());
                    this.mdlVideoInfo.update(mDLInfo.getJSONObject("video"));
                    z = true;
                }
                if (!z) {
                    this.mdlVideoInfo.update(mDLInfo);
                }
                if (!mDLInfo.isNull("cur_task_num")) {
                    this.mdl_cur_task_num = ((Integer) mDLInfo.get("cur_task_num")).intValue();
                }
                int i = -1;
                if (!mDLInfo.isNull("dns_type")) {
                    i = ((Integer) mDLInfo.get("dns_type")).intValue();
                }
                if (i == 0) {
                    this.mDNSType = "localDNS";
                } else if (i == 2 || i == 3) {
                    this.mDNSType = "httpDNS";
                } else if (i == 4) {
                    EventLoggerSource eventLoggerSource = this.mDataSource;
                    if (eventLoggerSource == null || eventLoggerSource.getLogValueInt(85) != 1) {
                        this.mDNSType = "customDNS";
                    } else {
                        this.mDNSType = "customDNSInnerByteDanceHTTPDNS";
                    }
                }
            } catch (JSONException e) {
                TTVideoEngineLog.m256501d(e);
            }
        }
    }

    public void setCurHost(String str) {
        this.mCurHost = str;
    }

    public void setCurIP(String str) {
        this.mCurIP = str;
    }

    public void setCurQuality(String str) {
        this.mCurQuality = str;
    }

    public void setCurResolution(String str) {
        this.mCurResolution = str;
    }

    public void setCurURL(String str) {
        this.mCurURL = str;
    }

    public void setP2PCDNType(int i) {
        this.mP2PCDNType = i;
    }

    public void setTag(String str) {
        this.mTag = str;
    }

    public void useVideoHW(int i) {
        this.mVideoHW = i;
        this.mVideoHWUser = i;
    }

    public MDLTrackInfo getMdlTrackInfo(JSONObject jSONObject) throws JSONException {
        MDLTrackInfo mDLTrackInfo = new MDLTrackInfo();
        mDLTrackInfo.update(jSONObject);
        return mDLTrackInfo;
    }

    public void setCurrentQualityDesc(String str) {
        if (TextUtils.isEmpty(this.mInitialQualityDesc)) {
            this.mInitialQualityDesc = str;
        }
        this.mCurrentQualityDesc = str;
    }

    public class MDLTrackInfo {
        public String mdl_blocked_ips = "";
        public int mdl_cache_type;
        public String mdl_cdn_cache = "";
        public String mdl_client_info = "";
        public long mdl_cur_cache_pos = -2147483648L;
        public long mdl_cur_end_pos = -2147483648L;
        public String mdl_cur_host = "";
        public String mdl_cur_ip = "";
        public long mdl_cur_req_pos = -2147483648L;
        public int mdl_cur_soure = -1;
        public String mdl_cur_url = "";
        public int mdl_disable_seek = -1;
        public long mdl_dns_t = -2147483648L;
        public long mdl_down_pos = -2147483648L;
        public long mdl_end_t = -2147483648L;
        public int mdl_error_code;
        public String mdl_extra_info = "";
        public String mdl_file_key = "";
        public long mdl_fs = -2147483648L;
        public int mdl_http_code = -1;
        public long mdl_http_open_end_t = -2147483648L;
        public long mdl_httpfb = -2147483648L;
        public String mdl_ip_list = "";
        public int mdl_is_socrf = -1;
        public String mdl_last_msg = "";
        public long mdl_lbs = -2147483648L;
        public int mdl_pcdn_full_speed = Integer.MIN_VALUE;
        public int mdl_player_wait_num = Integer.MIN_VALUE;
        public long mdl_player_wait_time = -2147483648L;
        public String mdl_re_url = "";
        public int mdl_read_src = -1;
        public long mdl_reply_size = -2147483648L;
        public int mdl_req_num = Integer.MIN_VALUE;
        public long mdl_req_t = -2147483648L;
        public int mdl_res_err = -1;
        public int mdl_seek_num = -1;
        public String mdl_server_timing = "";
        public int mdl_speed = Integer.MIN_VALUE;
        public int mdl_stage = Integer.MIN_VALUE;
        public long mdl_tbs = -2147483648L;
        public long mdl_tcp_end_t = -2147483648L;
        public long mdl_tcp_start_t = -2147483648L;
        public long mdl_ttfp = -2147483648L;
        public int mdl_url_index = -1;
        public int mdl_v_lt = -1;
        public int mdl_v_p2p_ier = 1;

        public MDLTrackInfo() {
        }

        public void update(JSONObject jSONObject) throws JSONException {
            if (jSONObject != null) {
                if (!jSONObject.isNull("cur_req_pos")) {
                    this.mdl_cur_req_pos = ((Number) jSONObject.get("cur_req_pos")).longValue();
                }
                if (!jSONObject.isNull("cur_end_pos")) {
                    this.mdl_cur_end_pos = ((Number) jSONObject.get("cur_end_pos")).longValue();
                }
                if (!jSONObject.isNull("cur_cache_pos")) {
                    this.mdl_cur_cache_pos = ((Number) jSONObject.get("cur_cache_pos")).longValue();
                }
                if (!jSONObject.isNull("cache_type")) {
                    this.mdl_cache_type = ((Number) jSONObject.get("cache_type")).intValue();
                }
                if (!jSONObject.isNull("down_pos")) {
                    this.mdl_down_pos = ((Number) jSONObject.get("down_pos")).longValue();
                }
                if (!jSONObject.isNull("err_code")) {
                    this.mdl_error_code = ((Integer) jSONObject.get("err_code")).intValue();
                }
                if (!jSONObject.isNull("player_wait_num")) {
                    this.mdl_player_wait_num = ((Integer) jSONObject.get("player_wait_num")).intValue();
                }
                if (!jSONObject.isNull("player_wait_time")) {
                    this.mdl_player_wait_time = ((Number) jSONObject.get("player_wait_time")).longValue();
                }
                if (!jSONObject.isNull("reply_size")) {
                    this.mdl_reply_size = ((Number) jSONObject.get("reply_size")).longValue();
                }
                if (!jSONObject.isNull("stage")) {
                    this.mdl_stage = ((Integer) jSONObject.get("stage")).intValue();
                }
                if (!jSONObject.isNull("cur_host")) {
                    this.mdl_cur_host = jSONObject.get("cur_host").toString();
                }
                if (!jSONObject.isNull("cur_ip")) {
                    this.mdl_cur_ip = jSONObject.get("cur_ip").toString();
                }
                if (!jSONObject.isNull("speed")) {
                    this.mdl_speed = ((Integer) jSONObject.get("speed")).intValue();
                }
                if (!jSONObject.isNull("url")) {
                    this.mdl_cur_url = jSONObject.get("url").toString();
                }
                if (!jSONObject.isNull("file_key")) {
                    this.mdl_file_key = jSONObject.get("file_key").toString();
                }
                if (!jSONObject.isNull("is_socrf")) {
                    this.mdl_is_socrf = ((Integer) jSONObject.get("is_socrf")).intValue();
                }
                if (!jSONObject.isNull("url_index")) {
                    this.mdl_url_index = ((Integer) jSONObject.get("url_index")).intValue();
                }
                if (!jSONObject.isNull("re_url")) {
                    this.mdl_re_url = jSONObject.get("re_url").toString();
                }
                if (!jSONObject.isNull("cur_source")) {
                    this.mdl_cur_soure = ((Integer) jSONObject.get("cur_source")).intValue();
                }
                if (!jSONObject.isNull("extra_info")) {
                    this.mdl_extra_info = jSONObject.get("extra_info").toString();
                }
                if (!jSONObject.isNull("status_code")) {
                    this.mdl_http_code = ((Integer) jSONObject.get("status_code")).intValue();
                }
                if (!jSONObject.isNull("req_t")) {
                    this.mdl_req_t = ((Number) jSONObject.get("req_t")).longValue();
                }
                if (!jSONObject.isNull("end_t")) {
                    this.mdl_end_t = ((Number) jSONObject.get("end_t")).longValue();
                }
                if (!jSONObject.isNull("dns_t")) {
                    this.mdl_dns_t = ((Number) jSONObject.get("dns_t")).longValue();
                }
                if (!jSONObject.isNull("tcp_con_start_t")) {
                    this.mdl_tcp_start_t = ((Number) jSONObject.get("tcp_con_start_t")).longValue();
                }
                if (!jSONObject.isNull("tcp_con_t")) {
                    this.mdl_tcp_end_t = ((Number) jSONObject.get("tcp_con_t")).longValue();
                }
                if (!jSONObject.isNull("tcp_first_pack_t")) {
                    this.mdl_ttfp = ((Number) jSONObject.get("tcp_first_pack_t")).longValue();
                }
                if (!jSONObject.isNull("http_first_body_t")) {
                    this.mdl_httpfb = ((Number) jSONObject.get("http_first_body_t")).longValue();
                }
                if (!jSONObject.isNull("http_open_end_t")) {
                    this.mdl_http_open_end_t = ((Number) jSONObject.get("http_open_end_t")).longValue();
                }
                if (!jSONObject.isNull("fs")) {
                    this.mdl_fs = ((Number) jSONObject.get("fs")).longValue();
                }
                if (!jSONObject.isNull("full_speed")) {
                    this.mdl_pcdn_full_speed = ((Integer) jSONObject.get("full_speed")).intValue();
                }
                if (!jSONObject.isNull("tbs")) {
                    this.mdl_tbs = ((Number) jSONObject.get("tbs")).longValue();
                }
                if (!jSONObject.isNull("lbs")) {
                    this.mdl_lbs = ((Number) jSONObject.get("lbs")).longValue();
                }
                if (!jSONObject.isNull("req_err")) {
                    this.mdl_res_err = ((Integer) jSONObject.get("req_err")).intValue();
                }
                if (!jSONObject.isNull("read_src")) {
                    this.mdl_read_src = ((Integer) jSONObject.get("read_src")).intValue();
                }
                if (!jSONObject.isNull("seek_times")) {
                    this.mdl_seek_num = ((Integer) jSONObject.get("seek_times")).intValue();
                }
                if (!jSONObject.isNull("last_msg")) {
                    this.mdl_last_msg = jSONObject.get("last_msg").toString();
                }
                if (!jSONObject.isNull("server_timing")) {
                    this.mdl_server_timing = jSONObject.get("server_timing").toString();
                }
                if (!jSONObject.isNull("v_lt")) {
                    this.mdl_v_lt = ((Integer) jSONObject.get("v_lt")).intValue();
                }
                if (!jSONObject.isNull("v_p2p_ier")) {
                    this.mdl_v_p2p_ier = ((Integer) jSONObject.get("v_p2p_ier")).intValue();
                }
                if (!jSONObject.isNull("req_num")) {
                    this.mdl_req_num = ((Integer) jSONObject.get("req_num")).intValue();
                }
                if (!jSONObject.isNull("ip_list")) {
                    this.mdl_ip_list = jSONObject.get("ip_list").toString();
                }
                if (!jSONObject.isNull("blocked_ip")) {
                    this.mdl_blocked_ips = jSONObject.get("blocked_ip").toString();
                }
                if (!jSONObject.isNull("cdn_cache")) {
                    this.mdl_cdn_cache = jSONObject.get("cdn_cache").toString();
                }
                if (!jSONObject.isNull("client_info")) {
                    this.mdl_client_info = jSONObject.get("client_info").toString();
                }
                if (!jSONObject.isNull("disable_seek")) {
                    this.mdl_disable_seek = ((Integer) jSONObject.get("disable_seek")).intValue();
                }
            }
        }
    }

    public void setVideoInfo(IVideoModel iVideoModel) {
        Object obj;
        List<VideoInfo> videoInfoList;
        if (iVideoModel != null) {
            HashMap hashMap = new HashMap();
            HashMap hashMap2 = new HashMap();
            HashMap hashMap3 = new HashMap();
            HashMap hashMap4 = new HashMap();
            HashMap hashMap5 = new HashMap();
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            if (iVideoModel.hasData() && (videoInfoList = iVideoModel.getVideoInfoList()) != null && videoInfoList.size() > 0) {
                int i = 0;
                for (VideoInfo videoInfo : videoInfoList) {
                    int mediatype = videoInfo.getMediatype();
                    String resolution = videoInfo.getResolution().toString(mediatype);
                    hashMap.put(resolution, Long.valueOf(videoInfo.getValueLong(12)));
                    hashMap2.put(resolution, videoInfo.getValueStr(8));
                    hashMap3.put(resolution, Integer.valueOf(videoInfo.getValueInt(3)));
                    hashMap4.put(Integer.valueOf(videoInfo.getValueInt(3)), videoInfo.getValueStr(15));
                    hashMap5.put(Integer.valueOf(videoInfo.getValueInt(3)), Integer.valueOf(i));
                    if (mediatype == 1) {
                        arrayList.add(Integer.valueOf(videoInfo.getValueInt(3)));
                    } else {
                        arrayList2.add(Integer.valueOf(videoInfo.getValueInt(3)));
                    }
                    i++;
                }
            }
            HashMap hashMap6 = new HashMap();
            String vType = iVideoModel.getVType();
            String dynamicType = iVideoModel.getDynamicType();
            hashMap6.put("duration", Integer.valueOf(iVideoModel.getVideoRefInt(3)));
            hashMap6.put("size", hashMap);
            hashMap6.put("codec", hashMap2);
            hashMap6.put("vtype", vType);
            hashMap6.put("dynamic_type", dynamicType);
            hashMap6.put("bitrate", hashMap3);
            hashMap6.put("fileKey", hashMap4);
            hashMap6.put("bitrateMapTable", hashMap5);
            hashMap6.put("audio_bitrate", arrayList);
            hashMap6.put("video_bitrate", arrayList2);
            this.mVideoInfo = hashMap6;
            if (!TextUtils.isEmpty(this.mCurrentResolution) && (obj = hashMap3.get(this.mCurrentResolution)) != null) {
                this.mCurrentConfigBitrate = ((Integer) obj).intValue();
            }
            this.vtype = vType;
            this.dynamic_type = dynamicType;
        }
    }

    public void updateVideoInfo(VideoModel videoModel) {
        Map versionInfo;
        Object obj;
        if (videoModel != null) {
            setVideoInfo(videoModel);
        }
        Map map = this.mVideoInfo;
        if (map != null) {
            if (this.vd <= 0) {
                this.vd = ((Integer) map.get("duration")).intValue() * 1000;
            }
            Object obj2 = ((Map) this.mVideoInfo.get("size")).get(this.mCurrentResolution);
            int i = -1;
            if (obj2 != null) {
                i = ((Long) obj2).intValue();
            }
            this.vs = i;
            Map map2 = (Map) this.mVideoInfo.get("codec");
            if (map2.get(this.mCurrentResolution) != null) {
                obj = map2.get(this.mCurrentResolution);
            } else {
                obj = "";
            }
            this.codec_type = (String) obj;
        }
        if (this.mDataSource != null) {
            String str = this.pv;
            if ((str == null || str.isEmpty()) && (versionInfo = this.mDataSource.versionInfo()) != null) {
                this.pv = (String) versionInfo.get("pv");
                this.pc = (String) versionInfo.get("pc");
                this.sv = (String) versionInfo.get("sv");
                this.sdk_version = (String) versionInfo.get("sdk_version");
                this.ffmpeg_version = (String) versionInfo.get("ffv");
                this.libvcn_version = (String) versionInfo.get("vcnv");
                this.texturender_version = (String) versionInfo.get("trv");
                this.abr_version = (String) versionInfo.get("abrv");
                this.predict_version = (String) versionInfo.get("prdtv");
                this.preload_version = (String) versionInfo.get("prldv");
            }
            if (TextUtils.isEmpty(this.codec_type)) {
                String logValueStr = this.mDataSource.getLogValueStr(0);
                if (!TextUtils.isEmpty(logValueStr)) {
                    this.codec_type = logValueStr;
                }
            }
            String logValueStr2 = this.mDataSource.getLogValueStr(37);
            if (!TextUtils.isEmpty(logValueStr2)) {
                this.mMdlVersion = logValueStr2;
            }
            TTVideoEngineLog.m256505i("VideoEventBase", "video_type:" + this.vtype);
            if (TextUtils.isEmpty(this.vtype)) {
                String logValueStr3 = this.mDataSource.getLogValueStr(65);
                TTVideoEngineLog.m256505i("VideoEventBase", "get video_type from player:" + logValueStr3);
                if (!TextUtils.isEmpty(logValueStr3)) {
                    if (logValueStr3.indexOf("mp4") > 0) {
                        this.vtype = "mp4";
                    } else {
                        int indexOf = logValueStr3.indexOf(",");
                        if (indexOf < 0) {
                            this.vtype = logValueStr3;
                        } else {
                            this.vtype = logValueStr3.substring(0, indexOf);
                        }
                    }
                }
            }
            TTVideoEngineLog.m256505i("VideoEventBase", "video_size :" + this.vs);
            if (this.vs <= 0) {
                this.vs = (int) this.mDataSource.getLogValueLong(66);
                TTVideoEngineLog.m256505i("VideoEventBase", "get video_size from player:" + this.vs);
            }
            this.videoCodecNameId = this.mDataSource.getLogValueInt(24);
            this.audioCodecNameId = this.mDataSource.getLogValueInt(25);
            switch (this.videoCodecNameId) {
                case 2:
                    this.mVideoHW = 1;
                    break;
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                    this.mVideoHW = 0;
                    break;
            }
            this.formatType = this.mDataSource.getLogValueInt(49);
        }
    }

    public void beginToPlay(String str, String str2) {
        this.mVid = str;
        this.mDeviceId = str2;
        String generateTrackID = SessionIDGenerator.generateTrackID(str2);
        this.mSessionID = generateTrackID;
        this.mTraceID = generateTrackID;
    }

    public void _changeNetworkType(int i, int i2) {
        String _switchNetworkType = _switchNetworkType(i);
        String _switchNetworkType2 = _switchNetworkType(i2);
        TTVideoEngineLog.m256500d("VideoEventBase", String.format("receive network type changed, from:%s to:%s", _switchNetworkType, _switchNetworkType2));
        gNetworkType = _switchNetworkType2;
    }

    public void _changeSignalStrength(int i, int i2) {
        String _switchNetworkStrength = _switchNetworkStrength(i);
        String _switchNetworkStrength2 = _switchNetworkStrength(i2);
        TTVideoEngineLog.m256500d("VideoEventBase", String.format("receive signal strength changed, from:%s to:%s", _switchNetworkStrength, _switchNetworkStrength2));
        gSigStrength = _switchNetworkStrength2;
    }

    public void configResolution(String str, String str2) {
        Object obj;
        this.mLastResolution = str2;
        this.mCurrentResolution = str;
        Map map = this.mVideoInfo;
        if (map != null && (obj = ((Map) map.get("bitrate")).get(this.mCurrentResolution)) != null) {
            this.mCurrentConfigBitrate = ((Integer) obj).intValue();
        }
    }

    public void setSourceType(int i, String str) {
        switch (i) {
            case 0:
                this.mSourceTypeStr = "local_url";
                break;
            case 1:
                this.mSourceTypeStr = "dir_url";
                break;
            case 2:
                this.mSourceTypeStr = "playitem";
                break;
            case 3:
                this.mSourceTypeStr = "preload";
                break;
            case 4:
                this.mSourceTypeStr = "feed";
                break;
            case 5:
                this.mSourceTypeStr = "vid";
                break;
            case 6:
                this.mSourceTypeStr = "fd";
                break;
            case 7:
                this.mSourceTypeStr = "mds";
                break;
        }
        this.mVid = str;
    }

    VideoEventBase(EventLoggerSource eventLoggerSource, boolean z, Context context) {
        this.mDataSource = eventLoggerSource;
        this.mSessionID = SessionIDGenerator.generateSessionID(null);
        this.isUploadLogEnabled = z;
        this.mContext = context;
    }
}
