package com.ss.ttvideoengine.log;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.ss.android.ttvecamera.p3038g.C60375c;
import com.ss.ttvideoengine.utils.EngineThreadPool;
import com.ss.ttvideoengine.utils.TTVideoEngineLog;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public class VideoEventOneOpera {
    public int mAccuCostTime;
    public VideoEventBase mEventBase;
    public long mLastBufferEndT = -2147483648L;
    public long mLastBufferStartT = -2147483648L;
    public HashMap mLastOperaTimeMap;
    public OperaContext mOperaContext;
    public ArrayList<String> mSeekList = new ArrayList<>();

    public void movieShouldRetry() {
        this.mOperaContext.mRetryCount++;
    }

    public void reset() {
        synchronized (this.mLastOperaTimeMap) {
            this.mLastOperaTimeMap = new HashMap();
        }
        this.mAccuCostTime = 0;
        this.mSeekList = new ArrayList<>();
    }

    public void sendOperaEvent() {
        this.mEventBase.updateVideoInfo(null);
        TTVideoEngineLog.m256505i("VideoEventOneOpera", "report async");
        EngineThreadPool.addExecuteTask(new AsyncGetLogDataRunnable(this.mEventBase.mContext, this, this.mEventBase, this.mOperaContext));
    }

    public long getLastSeekTime() {
        if (this.mOperaContext.mStartT > 0) {
            return 0;
        }
        synchronized (this.mLastOperaTimeMap) {
            if (!this.mLastOperaTimeMap.containsKey("seek")) {
                return -1;
            }
            return ((Long) this.mLastOperaTimeMap.get("seek")).longValue();
        }
    }

    /* access modifiers changed from: private */
    public static class AsyncGetLogDataRunnable implements Runnable {
        private Context rContext;
        private VideoEventOneOpera rEvent;
        private VideoEventBase rEventBase;
        private Handler rHandler = new Handler(Looper.getMainLooper());
        private OperaContext rOperaContext;

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
                final JSONObject jsonObject = this.rEvent.toJsonObject(this.rOperaContext, this.rEventBase);
                Handler handler = this.rHandler;
                if (handler == null) {
                    VideoEventManager.instance.addEventV2(z, jsonObject, "videoplayer_oneopera");
                    return;
                }
                handler.post(new Runnable() {
                    /* class com.ss.ttvideoengine.log.VideoEventOneOpera.AsyncGetLogDataRunnable.RunnableC654581 */

                    public void run() {
                        VideoEventManager.instance.addEventV2(z, jsonObject, "videoplayer_oneopera");
                    }
                });
                synchronized (this.rEvent.mLastOperaTimeMap) {
                    this.rEvent.mLastOperaTimeMap.remove(this.rOperaContext.mOperaType);
                    this.rEvent.mLastOperaTimeMap.put(this.rOperaContext.mOperaType, Long.valueOf(this.rOperaContext.mEndT));
                }
                this.rEvent.mLastBufferStartT = -2147483648L;
                this.rEvent.mLastBufferEndT = -2147483648L;
            }
        }

        public AsyncGetLogDataRunnable(Context context, VideoEventOneOpera videoEventOneOpera, VideoEventBase videoEventBase, OperaContext operaContext) {
            this.rEvent = videoEventOneOpera;
            this.rEventBase = videoEventBase;
            this.rContext = context;
            this.rOperaContext = operaContext;
        }
    }

    /* access modifiers changed from: private */
    public class OperaContext {
        public long mAudioLenAfterMS;
        public int mConfigBitrateAfter;
        public int mConfigBitrateBefore;
        public long mCostTime;
        public long mEndT;
        public String mEndType;
        public int mIndex;
        public int mIsSeekInCached;
        public String mOperaType;
        public String mResolutionAfter;
        public String mResolutionBefore;
        public int mRetryCount;
        public long mStartT;
        public String mStateAfter;
        public String mStateBefore;
        public long mVideoLenAfterMS;

        private OperaContext() {
            this.mOperaType = "";
            this.mStateBefore = "";
            this.mStateAfter = "";
            this.mCostTime = -2147483648L;
            this.mEndType = "";
            this.mStartT = -2147483648L;
            this.mEndT = -2147483648L;
            this.mResolutionBefore = "";
            this.mResolutionAfter = "";
            this.mConfigBitrateBefore = Integer.MIN_VALUE;
            this.mConfigBitrateAfter = Integer.MIN_VALUE;
        }
    }

    VideoEventOneOpera(VideoEventBase videoEventBase) {
        this.mEventBase = videoEventBase;
        this.mLastOperaTimeMap = new HashMap();
        this.mOperaContext = new OperaContext();
    }

    public void endSeek(String str, int i) {
        if (this.mOperaContext.mStartT <= 0 || this.mOperaContext.mOperaType.isEmpty()) {
            TTVideoEngineLog.m256500d("VideoEventOneOpera", "endSeek without beginSeek, return.");
            return;
        }
        TTVideoEngineLog.m256500d("VideoEventOneOpera", "endSeek, from " + this.mOperaContext.mStateBefore + " to " + this.mOperaContext.mStateAfter);
        this.mOperaContext.mEndT = System.currentTimeMillis();
        OperaContext operaContext = this.mOperaContext;
        operaContext.mCostTime = operaContext.mEndT - this.mOperaContext.mStartT;
        if (this.mOperaContext.mCostTime > 0) {
            this.mAccuCostTime = (int) (((long) this.mAccuCostTime) + this.mOperaContext.mCostTime);
        }
        this.mOperaContext.mEndType = str;
        this.mOperaContext.mIsSeekInCached = i;
        VideoEventBase videoEventBase = this.mEventBase;
        if (!(videoEventBase == null || videoEventBase.mDataSource == null)) {
            this.mOperaContext.mResolutionAfter = this.mEventBase.mCurrentResolution;
            this.mOperaContext.mConfigBitrateAfter = this.mEventBase.mCurrentConfigBitrate;
            Map bytesInfo = this.mEventBase.mDataSource.bytesInfo();
            if (bytesInfo != null) {
                this.mOperaContext.mVideoLenAfterMS = ((Long) bytesInfo.get("vlen")).longValue();
                this.mOperaContext.mAudioLenAfterMS = ((Long) bytesInfo.get("alen")).longValue();
            }
        }
        HashMap hashMap = new HashMap();
        hashMap.put("fr", this.mOperaContext.mStateBefore);
        hashMap.put("to", this.mOperaContext.mStateAfter);
        hashMap.put("t", Long.valueOf(this.mOperaContext.mEndT));
        hashMap.put(C60375c.f150914a, Long.valueOf(this.mOperaContext.mCostTime));
        this.mSeekList.add(new JSONObject(hashMap).toString());
        this.mEventBase.degradeModeChangeSession();
        sendOperaEvent();
        this.mOperaContext = new OperaContext();
    }

    public JSONObject toJsonObject(OperaContext operaContext, VideoEventBase videoEventBase) {
        HashMap hashMap = new HashMap();
        if (videoEventBase != null) {
            VideoEventOnePlay.putToMap(hashMap, "player_sessionid", videoEventBase.mSessionID);
            if (videoEventBase.mCurURL == null || videoEventBase.mCurURL.isEmpty()) {
                VideoEventOnePlay.putToMap(hashMap, "cdn_url", videoEventBase.mInitialURL);
            } else {
                VideoEventOnePlay.putToMap(hashMap, "cdn_url", videoEventBase.mCurURL);
            }
            if (videoEventBase.mCurIP == null || videoEventBase.mCurIP.isEmpty()) {
                VideoEventOnePlay.putToMap(hashMap, "cdn_ip", videoEventBase.mInitialIP);
            } else {
                VideoEventOnePlay.putToMap(hashMap, "cdn_ip", videoEventBase.mCurIP);
            }
            VideoEventOnePlay.putToMap(hashMap, "source_type", videoEventBase.mSourceTypeStr);
            VideoEventOnePlay.putToMap(hashMap, "v", videoEventBase.mVid);
            VideoEventOnePlay.putToMap(hashMap, "pv", videoEventBase.pv);
            VideoEventOnePlay.putToMap(hashMap, "pc", videoEventBase.pc);
            VideoEventOnePlay.putToMap(hashMap, "sv", videoEventBase.sv);
            VideoEventOnePlay.putToMap(hashMap, "sdk_version", videoEventBase.sdk_version);
            VideoEventOnePlay.putToMap(hashMap, "vtype", videoEventBase.vtype);
            VideoEventOnePlay.putToMap(hashMap, "tag", videoEventBase.mTag);
            VideoEventOnePlay.putToMap(hashMap, "subtag", videoEventBase.mSubTag);
            VideoEventOnePlay.putToMap((Map) hashMap, "p2p_cdn_type", videoEventBase.mP2PCDNType);
            VideoEventOnePlay.putToMap(hashMap, "codec", videoEventBase.codec_type);
            VideoEventOnePlay.putToMap((Map) hashMap, "video_codec_nameid", videoEventBase.videoCodecNameId);
            VideoEventOnePlay.putToMap((Map) hashMap, "audio_codec_nameid", videoEventBase.audioCodecNameId);
            VideoEventOnePlay.putToMap((Map) hashMap, "format_type", videoEventBase.formatType);
            VideoEventOnePlay.putToMap((Map) hashMap, "drm_type", videoEventBase.mDrmType);
            VideoEventOnePlay.putToMap((Map) hashMap, "mdl_speed", videoEventBase.mdlVideoInfo.mdl_speed);
            VideoEventOnePlay.putToMap(hashMap, "nt", videoEventBase.mNetworkType);
            VideoEventOnePlay.putToMap((Map) hashMap, "reuse_socket", videoEventBase.mReuseSocket);
            VideoEventOnePlay.putToMap(hashMap, "mdl_version", videoEventBase.mMdlVersion);
            VideoEventOnePlay.putToMap((Map) hashMap, "enable_mdl", videoEventBase.mEnableMDL);
            VideoEventOnePlay.putToMap(hashMap, "mdl_req_t", videoEventBase.mdlVideoInfo.mdl_req_t);
            VideoEventOnePlay.putToMap(hashMap, "mdl_end_t", videoEventBase.mdlVideoInfo.mdl_end_t);
            VideoEventOnePlay.putToMap(hashMap, "mdl_dns_t", videoEventBase.mdlVideoInfo.mdl_dns_t);
            VideoEventOnePlay.putToMap(hashMap, "mdl_tcp_start_t", videoEventBase.mdlVideoInfo.mdl_tcp_start_t);
            VideoEventOnePlay.putToMap(hashMap, "mdl_tcp_end_t", videoEventBase.mdlVideoInfo.mdl_tcp_end_t);
            VideoEventOnePlay.putToMap(hashMap, "mdl_ttfp", videoEventBase.mdlVideoInfo.mdl_ttfp);
            VideoEventOnePlay.putToMap(hashMap, "mdl_httpfb", videoEventBase.mdlVideoInfo.mdl_httpfb);
            VideoEventOnePlay.putToMap(hashMap, "mdl_cur_ip", videoEventBase.mdlVideoInfo.mdl_cur_ip);
            VideoEventOnePlay.putToMap(hashMap, "mdl_cur_req_pos", videoEventBase.mdlVideoInfo.mdl_cur_req_pos);
            VideoEventOnePlay.putToMap(hashMap, "mdl_cur_end_pos", videoEventBase.mdlVideoInfo.mdl_cur_end_pos);
            VideoEventOnePlay.putToMap(hashMap, "mdl_cur_cache_pos", videoEventBase.mdlVideoInfo.mdl_cur_cache_pos);
            VideoEventOnePlay.putToMap((Map) hashMap, "mdl_cache_type", videoEventBase.mdlVideoInfo.mdl_cache_type);
            VideoEventOnePlay.putToMap(hashMap, "mdl_reply_size", videoEventBase.mdlVideoInfo.mdl_reply_size);
            VideoEventOnePlay.putToMap(hashMap, "mdl_down_pos", videoEventBase.mdlVideoInfo.mdl_down_pos);
            VideoEventOnePlay.putToMap((Map) hashMap, "mdl_error_code", videoEventBase.mdlVideoInfo.mdl_error_code);
            VideoEventOnePlay.putToMap((Map) hashMap, "mdl_http_code", videoEventBase.mdlVideoInfo.mdl_http_code);
            VideoEventOnePlay.putToMap(hashMap, "mdl_ip_list", videoEventBase.mdlVideoInfo.mdl_ip_list);
            VideoEventOnePlay.putToMap(hashMap, "mdl_blocked_ips", videoEventBase.mdlVideoInfo.mdl_blocked_ips);
            VideoEventOnePlay.putToMap(hashMap, "a_mdl_req_t", videoEventBase.mdlAudioInfo.mdl_req_t);
            VideoEventOnePlay.putToMap(hashMap, "a_mdl_end_t", videoEventBase.mdlAudioInfo.mdl_end_t);
            VideoEventOnePlay.putToMap(hashMap, "a_mdl_dns_t", videoEventBase.mdlAudioInfo.mdl_dns_t);
            VideoEventOnePlay.putToMap(hashMap, "a_mdl_tcp_start_t", videoEventBase.mdlAudioInfo.mdl_tcp_start_t);
            VideoEventOnePlay.putToMap(hashMap, "a_mdl_tcp_end_t", videoEventBase.mdlAudioInfo.mdl_tcp_end_t);
            VideoEventOnePlay.putToMap(hashMap, "a_mdl_ttfp", videoEventBase.mdlAudioInfo.mdl_ttfp);
            VideoEventOnePlay.putToMap(hashMap, "a_mdl_httpfb", videoEventBase.mdlAudioInfo.mdl_httpfb);
            VideoEventOnePlay.putToMap(hashMap, "a_mdl_cur_ip", videoEventBase.mdlAudioInfo.mdl_cur_ip);
            VideoEventOnePlay.putToMap(hashMap, "a_mdl_cur_req_pos", videoEventBase.mdlAudioInfo.mdl_cur_req_pos);
            VideoEventOnePlay.putToMap(hashMap, "a_mdl_cur_end_pos", videoEventBase.mdlAudioInfo.mdl_cur_end_pos);
            VideoEventOnePlay.putToMap(hashMap, "a_mdl_cur_cache_pos", videoEventBase.mdlAudioInfo.mdl_cur_cache_pos);
            VideoEventOnePlay.putToMap((Map) hashMap, "a_mdl_cache_type", videoEventBase.mdlAudioInfo.mdl_cache_type);
            VideoEventOnePlay.putToMap(hashMap, "a_mdl_reply_size", videoEventBase.mdlAudioInfo.mdl_reply_size);
            VideoEventOnePlay.putToMap(hashMap, "a_mdl_down_pos", videoEventBase.mdlAudioInfo.mdl_down_pos);
            VideoEventOnePlay.putToMap((Map) hashMap, "a_mdl_error_code", videoEventBase.mdlAudioInfo.mdl_error_code);
            VideoEventOnePlay.putToMap((Map) hashMap, "a_mdl_http_code", videoEventBase.mdlAudioInfo.mdl_http_code);
            VideoEventOnePlay.putToMap(hashMap, "a_mdl_ip_list", videoEventBase.mdlAudioInfo.mdl_ip_list);
            VideoEventOnePlay.putToMap(hashMap, "a_mdl_blocked_ips", videoEventBase.mdlAudioInfo.mdl_blocked_ips);
        }
        VideoEventOnePlay.putToMap(hashMap, "opera_type", operaContext.mOperaType);
        VideoEventOnePlay.putToMap(hashMap, "state_before", operaContext.mStateBefore);
        VideoEventOnePlay.putToMap(hashMap, "state_after", operaContext.mStateAfter);
        VideoEventOnePlay.putToMap(hashMap, HiAnalyticsConstant.BI_KEY_COST_TIME, operaContext.mCostTime);
        VideoEventOnePlay.putToMap(hashMap, "end_type", operaContext.mEndType);
        VideoEventOnePlay.putToMap((Map) hashMap, "index", operaContext.mIndex);
        long j = -1;
        if (this.mLastOperaTimeMap.containsKey(operaContext.mOperaType)) {
            long longValue = ((Long) this.mLastOperaTimeMap.get(operaContext.mOperaType)).longValue();
            if (longValue > 0) {
                j = operaContext.mStartT - longValue;
            }
        }
        VideoEventOnePlay.putToMap(hashMap, "last_interval", j);
        VideoEventOnePlay.putToMap((Map) hashMap, "retry_count", operaContext.mRetryCount);
        VideoEventOnePlay.putToMap((Map) hashMap, "is_seek_in_buffer", operaContext.mIsSeekInCached);
        VideoEventOnePlay.putToMap(hashMap, "video_len_after", operaContext.mVideoLenAfterMS);
        VideoEventOnePlay.putToMap(hashMap, "audio_len_after", operaContext.mAudioLenAfterMS);
        VideoEventOnePlay.putToMap(hashMap, "st", operaContext.mStartT);
        VideoEventOnePlay.putToMap(hashMap, "et", operaContext.mEndT);
        VideoEventOnePlay.putToMap(hashMap, "resolution_before", operaContext.mResolutionBefore);
        VideoEventOnePlay.putToMap(hashMap, "resolution_after", operaContext.mResolutionAfter);
        VideoEventOnePlay.putToMap((Map) hashMap, "bitrate_before", operaContext.mConfigBitrateBefore);
        VideoEventOnePlay.putToMap((Map) hashMap, "bitrate_after", operaContext.mConfigBitrateAfter);
        VideoEventOnePlay.putToMap(hashMap, "last_buf_start_t", this.mLastBufferStartT);
        VideoEventOnePlay.putToMap(hashMap, "last_buf_end_t", this.mLastBufferEndT);
        return new JSONObject(hashMap);
    }

    public void beginSeek(int i, int i2, int i3) {
        TTVideoEngineLog.m256500d("VideoEventOneOpera", "brian beginSeek from " + i + " to " + i2);
        this.mOperaContext.mStartT = System.currentTimeMillis();
        this.mOperaContext.mOperaType = "seek";
        this.mOperaContext.mStateBefore = Integer.toString(i);
        this.mOperaContext.mStateAfter = Integer.toString(i2);
        this.mOperaContext.mCostTime = 0;
        this.mOperaContext.mIndex = i3;
        VideoEventBase videoEventBase = this.mEventBase;
        if (videoEventBase != null) {
            this.mOperaContext.mResolutionBefore = videoEventBase.mCurrentResolution;
            this.mOperaContext.mConfigBitrateBefore = this.mEventBase.mCurrentConfigBitrate;
        }
    }
}
