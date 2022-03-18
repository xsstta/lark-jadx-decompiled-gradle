package com.ss.ttvideoengine.log;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.huawei.hms.adapter.internal.CommonCode;
import com.ss.ttvideoengine.utils.EngineThreadPool;
import com.ss.ttvideoengine.utils.Error;
import com.ss.ttvideoengine.utils.TTVideoEngineLog;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public class VideoEventOneError {
    public String mCDNIP = "";
    public String mCDNUrl = "";
    public int mDisAbleV3Async;
    public int mErrorCode = Integer.MIN_VALUE;
    public String mErrorStage = "";
    public int mErrorType = Integer.MIN_VALUE;
    public VideoEventBase mEventBase;
    public boolean mFirstFrameShown;
    public int mRetryCount;
    public int vsc = Integer.MIN_VALUE;
    public String vscMessage = "";

    public void showedFirstFrame() {
        this.mFirstFrameShown = true;
    }

    public void reset() {
        this.mRetryCount = 0;
        this.mFirstFrameShown = false;
    }

    public void sendErrorEvent() {
        if (this.mFirstFrameShown) {
            this.mErrorStage = "playing";
        } else {
            this.mErrorStage = "beforePlay";
        }
        if (this.mDisAbleV3Async == 1) {
            TTVideoEngineLog.m256505i("VideoEventOneError", "report sync");
            VideoEventManager.instance.addEventV2(this.mEventBase.isUploadLogEnabled, toJsonObject(), "videoplayer_oneerror");
            return;
        }
        TTVideoEngineLog.m256505i("VideoEventOneError", "report async");
        EngineThreadPool.addExecuteTask(new AsyncGetLogDataRunnable(this.mEventBase.mContext, this, this.mEventBase));
    }

    /* access modifiers changed from: private */
    public static class AsyncGetLogDataRunnable implements Runnable {
        private Context rContext;
        private VideoEventOneError rEvent;
        private VideoEventBase rEventBase;
        private Handler rHandler = new Handler(Looper.getMainLooper());

        public void run() {
            final boolean z;
            if (this.rEvent != null) {
                VideoEventBase videoEventBase = this.rEventBase;
                if (videoEventBase != null) {
                    videoEventBase.updateMDLInfo();
                    this.rEventBase.mNetworkType = VideoEventBase.getNetType();
                }
                VideoEventBase videoEventBase2 = this.rEventBase;
                if (videoEventBase2 == null || !videoEventBase2.isUploadLogEnabled) {
                    z = false;
                } else {
                    z = true;
                }
                final JSONObject jsonObject = this.rEvent.toJsonObject();
                Handler handler = this.rHandler;
                if (handler == null || handler.getLooper() == null) {
                    VideoEventManager.instance.addEventV2(z, jsonObject, "videoplayer_oneerror");
                } else {
                    this.rHandler.post(new Runnable() {
                        /* class com.ss.ttvideoengine.log.VideoEventOneError.AsyncGetLogDataRunnable.RunnableC654541 */

                        public void run() {
                            VideoEventManager.instance.addEventV2(z, jsonObject, "videoplayer_oneerror");
                        }
                    });
                }
            }
        }

        public AsyncGetLogDataRunnable(Context context, VideoEventOneError videoEventOneError, VideoEventBase videoEventBase) {
            this.rEvent = videoEventOneError;
            this.rEventBase = videoEventBase;
            this.rContext = context;
        }
    }

    public JSONObject toJsonObject() {
        HashMap hashMap = new HashMap();
        VideoEventBase videoEventBase = this.mEventBase;
        if (videoEventBase != null) {
            VideoEventOnePlay.putToMap(hashMap, "player_sessionid", videoEventBase.mSessionID);
            if (this.mEventBase.mCurURL == null || this.mEventBase.mCurURL.isEmpty()) {
                VideoEventOnePlay.putToMap(hashMap, "cdn_url", this.mEventBase.mInitialURL);
            } else {
                VideoEventOnePlay.putToMap(hashMap, "cdn_url", this.mEventBase.mCurURL);
            }
            if (this.mEventBase.mCurIP == null || this.mEventBase.mCurIP.isEmpty()) {
                VideoEventOnePlay.putToMap(hashMap, "cdn_ip", this.mEventBase.mInitialIP);
            } else {
                VideoEventOnePlay.putToMap(hashMap, "cdn_ip", this.mEventBase.mCurIP);
            }
            VideoEventOnePlay.putToMap(hashMap, CommonCode.MapKey.HAS_RESOLUTION, this.mEventBase.mCurrentResolution);
            VideoEventOnePlay.putToMap(hashMap, "source_type", this.mEventBase.mSourceTypeStr);
            VideoEventOnePlay.putToMap(hashMap, "v", this.mEventBase.mVid);
            VideoEventOnePlay.putToMap(hashMap, "pv", this.mEventBase.pv);
            VideoEventOnePlay.putToMap(hashMap, "pc", this.mEventBase.pc);
            VideoEventOnePlay.putToMap(hashMap, "sv", this.mEventBase.sv);
            VideoEventOnePlay.putToMap(hashMap, "tag", this.mEventBase.mTag);
            VideoEventOnePlay.putToMap(hashMap, "subtag", this.mEventBase.mSubTag);
            VideoEventOnePlay.putToMap(hashMap, "sdk_version", this.mEventBase.sdk_version);
            VideoEventOnePlay.putToMap((Map) hashMap, "video_hw", this.mEventBase.mVideoHW);
            VideoEventOnePlay.putToMap(hashMap, "vtype", this.mEventBase.vtype);
            VideoEventOnePlay.putToMap((Map) hashMap, "p2p_cdn_type", this.mEventBase.mP2PCDNType);
            VideoEventOnePlay.putToMap(hashMap, "codec", this.mEventBase.codec_type);
            VideoEventOnePlay.putToMap((Map) hashMap, "video_codec_nameid", this.mEventBase.videoCodecNameId);
            VideoEventOnePlay.putToMap((Map) hashMap, "audio_codec_nameid", this.mEventBase.audioCodecNameId);
            VideoEventOnePlay.putToMap((Map) hashMap, "format_type", this.mEventBase.formatType);
            VideoEventOnePlay.putToMap((Map) hashMap, "drm_type", this.mEventBase.mDrmType);
            VideoEventOnePlay.putToMap(hashMap, "drm_token_url", this.mEventBase.mDrmTokenUrl);
            VideoEventOnePlay.putToMap(hashMap, "cur_req_pos", this.mEventBase.mdlVideoInfo.mdl_cur_req_pos);
            VideoEventOnePlay.putToMap(hashMap, "cur_end_pos", this.mEventBase.mdlVideoInfo.mdl_cur_end_pos);
            VideoEventOnePlay.putToMap(hashMap, "cur_cache_pos", this.mEventBase.mdlVideoInfo.mdl_cur_cache_pos);
            VideoEventOnePlay.putToMap((Map) hashMap, "cache_type", this.mEventBase.mdlVideoInfo.mdl_cache_type);
            VideoEventOnePlay.putToMap(hashMap, "cur_ip", this.mEventBase.mdlVideoInfo.mdl_cur_ip);
            VideoEventOnePlay.putToMap(hashMap, "cur_host", this.mEventBase.mdlVideoInfo.mdl_cur_host);
            VideoEventOnePlay.putToMap(hashMap, "reply_size", this.mEventBase.mdlVideoInfo.mdl_reply_size);
            VideoEventOnePlay.putToMap(hashMap, "down_pos", this.mEventBase.mdlVideoInfo.mdl_down_pos);
            VideoEventOnePlay.putToMap(hashMap, "player_wait_time", this.mEventBase.mdlVideoInfo.mdl_player_wait_time);
            VideoEventOnePlay.putToMap((Map) hashMap, "player_wait_num", this.mEventBase.mdlVideoInfo.mdl_player_wait_num);
            VideoEventOnePlay.putToMap((Map) hashMap, "mdl_stage", this.mEventBase.mdlVideoInfo.mdl_stage);
            VideoEventOnePlay.putToMap((Map) hashMap, "mdl_ec", this.mEventBase.mdlVideoInfo.mdl_error_code);
            VideoEventOnePlay.putToMap((Map) hashMap, "mdl_speed", this.mEventBase.mdlVideoInfo.mdl_speed);
            VideoEventOnePlay.putToMap(hashMap, "mdl_file_key", this.mEventBase.mdlVideoInfo.mdl_file_key);
            VideoEventOnePlay.putToMap((Map) hashMap, "mdl_is_socrf", this.mEventBase.mdlVideoInfo.mdl_is_socrf);
            VideoEventOnePlay.putToMap((Map) hashMap, "mdl_req_num", this.mEventBase.mdlVideoInfo.mdl_req_num);
            VideoEventOnePlay.putToMap((Map) hashMap, "mdl_url_index", this.mEventBase.mdlVideoInfo.mdl_url_index);
            VideoEventOnePlay.putToMap(hashMap, "mdl_re_url", this.mEventBase.mdlVideoInfo.mdl_re_url);
            VideoEventOnePlay.putToMap(hashMap, "nt", this.mEventBase.mNetworkType);
            VideoEventOnePlay.putToMap(hashMap, "mdl_fs", this.mEventBase.mdlVideoInfo.mdl_fs);
            VideoEventOnePlay.putToMap(hashMap, "req_t", this.mEventBase.mdlVideoInfo.mdl_req_t);
            VideoEventOnePlay.putToMap(hashMap, "end_t", this.mEventBase.mdlVideoInfo.mdl_end_t);
            VideoEventOnePlay.putToMap(hashMap, "dns_t", this.mEventBase.mdlVideoInfo.mdl_dns_t);
            VideoEventOnePlay.putToMap(hashMap, "tcp_con_start_t", this.mEventBase.mdlVideoInfo.mdl_tcp_start_t);
            VideoEventOnePlay.putToMap(hashMap, "tcp_con_t", this.mEventBase.mdlVideoInfo.mdl_tcp_end_t);
            VideoEventOnePlay.putToMap(hashMap, "tcp_first_pack_t", this.mEventBase.mdlVideoInfo.mdl_ttfp);
            VideoEventOnePlay.putToMap(hashMap, "http_first_body_t", this.mEventBase.mdlVideoInfo.mdl_httpfb);
            VideoEventOnePlay.putToMap(hashMap, "http_open_end_t", this.mEventBase.mdlVideoInfo.mdl_http_open_end_t);
            VideoEventOnePlay.putToMap((Map) hashMap, "http_code", this.mEventBase.mdlVideoInfo.mdl_http_code);
            VideoEventOnePlay.putToMap(hashMap, "mdl_extra_info", this.mEventBase.mdlVideoInfo.mdl_extra_info);
            VideoEventOnePlay.putToMap(hashMap, "mdl_version", this.mEventBase.mMdlVersion);
            VideoEventOnePlay.putToMap(hashMap, "mdl_ip_list", this.mEventBase.mdlVideoInfo.mdl_ip_list);
            VideoEventOnePlay.putToMap(hashMap, "mdl_blocked_ips", this.mEventBase.mdlVideoInfo.mdl_blocked_ips);
        }
        VideoEventOnePlay.putToMap((Map) hashMap, "errt", this.mErrorType);
        VideoEventOnePlay.putToMap((Map) hashMap, "errc", this.mErrorCode);
        VideoEventOnePlay.putToMap(hashMap, "es", this.mErrorStage);
        VideoEventOnePlay.putToMap((Map) hashMap, "vsc", this.vsc);
        VideoEventOnePlay.putToMap(hashMap, "vsc_message", this.vscMessage);
        VideoEventOnePlay.putToMap((Map) hashMap, "retry_count", this.mRetryCount);
        return new JSONObject(hashMap);
    }

    public void errorHappened(Error error) {
        this.mErrorCode = error.code;
        this.mErrorType = error.getType();
        sendErrorEvent();
    }

    VideoEventOneError(VideoEventBase videoEventBase) {
        this.mEventBase = videoEventBase;
    }

    public void errorHappened(int i, String str) {
        this.vsc = i;
        this.vscMessage = str;
        sendErrorEvent();
    }

    public void movieShouldRetry(Error error, int i, int i2) {
        this.mRetryCount++;
    }
}
