package com.ss.ttvideoengine.log;

import android.content.Context;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import com.huawei.hms.adapter.internal.CommonCode;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.ss.android.ttvecamera.p3038g.C60375c;
import com.ss.ttvideoengine.log.VideoEventBase;
import com.ss.ttvideoengine.utils.EngineThreadPool;
import com.ss.ttvideoengine.utils.TTVideoEngineLog;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public class VideoEventOneEvent {
    public long mAccuCostTime;
    public VideoEventBase mEventBase;
    public EventContext mEventContext;
    private VideoEventOneOpera mEventOpera;
    public long mFirstFrameTime = -2147483648L;
    public HashMap mLastEventTimeMap;
    public ArrayList<String> mRebufList = new ArrayList<>();

    public int getMovieStalledType() {
        return this.mEventContext.mBufferingType;
    }

    public long getStalledVideoBufferTime() {
        return this.mEventContext.mVideoLenBeforeMS;
    }

    public long getStatlledAudioBufferTime() {
        return this.mEventContext.mAudioLenBeforeMS;
    }

    public void onAVBadInterlaced() {
        this.mEventContext.mIsAVBadInterlaced = 1;
    }

    public void showedFirstFrame() {
        this.mFirstFrameTime = System.currentTimeMillis();
    }

    public void movieShouldRetry() {
        this.mEventContext.mRetryCount++;
    }

    public void reset() {
        synchronized (this.mLastEventTimeMap) {
            this.mLastEventTimeMap = new HashMap();
        }
        this.mAccuCostTime = 0;
        this.mRebufList = new ArrayList<>();
        this.mFirstFrameTime = -2147483648L;
    }

    public void sendOneEvent() {
        this.mEventBase.updateVideoInfo(null);
        TTVideoEngineLog.m256505i("VideoEventOneEvent", "report async");
        EngineThreadPool.addExecuteTask(new AsyncGetLogDataRunnable(this.mEventBase.mContext, this, this.mEventBase, this.mEventContext));
    }

    public long getLastRebufTime() {
        if (this.mEventContext.mStartT > 0) {
            return 0;
        }
        synchronized (this.mLastEventTimeMap) {
            if (!this.mLastEventTimeMap.containsKey("block_net")) {
                return -1;
            }
            return ((Long) this.mLastEventTimeMap.get("block_net")).longValue();
        }
    }

    /* access modifiers changed from: private */
    public static class AsyncGetLogDataRunnable implements Runnable {
        private Context rContext;
        private VideoEventOneEvent rEvent;
        private VideoEventBase rEventBase;
        private EventContext rEventContext;
        private Handler rHandler = new Handler(Looper.getMainLooper());

        public void run() {
            final boolean z;
            if (this.rEvent != null) {
                VideoEventBase videoEventBase = this.rEventBase;
                if (videoEventBase == null || !videoEventBase.isUploadLogEnabled) {
                    z = false;
                } else {
                    z = true;
                }
                final JSONObject jsonObject = this.rEvent.toJsonObject(this.rEventContext, this.rEventBase);
                Handler handler = this.rHandler;
                if (handler == null || handler.getLooper() == null) {
                    VideoEventManager.instance.addEventV2(z, jsonObject, "videoplayer_oneevent");
                    return;
                }
                this.rHandler.post(new Runnable() {
                    /* class com.ss.ttvideoengine.log.VideoEventOneEvent.AsyncGetLogDataRunnable.RunnableC654561 */

                    public void run() {
                        VideoEventManager.instance.addEventV2(z, jsonObject, "videoplayer_oneevent");
                    }
                });
                synchronized (this.rEvent.mLastEventTimeMap) {
                    this.rEvent.mLastEventTimeMap.remove(this.rEventContext.mEventType);
                    this.rEvent.mLastEventTimeMap.put(this.rEventContext.mEventType, Long.valueOf(this.rEventContext.mEndT));
                }
            }
        }

        public AsyncGetLogDataRunnable(Context context, VideoEventOneEvent videoEventOneEvent, VideoEventBase videoEventBase, EventContext eventContext) {
            this.rEvent = videoEventOneEvent;
            this.rEventBase = videoEventBase;
            this.rContext = context;
            this.rEventContext = eventContext;
        }
    }

    public void triggerBufferStartCb() {
        String str;
        VideoEventBase videoEventBase = this.mEventBase;
        if (videoEventBase != null && videoEventBase.mDataSource != null) {
            HashMap hashMap = new HashMap();
            if (this.mEventBase.mEnableMDL > 0) {
                hashMap.put("cur_url", this.mEventBase.mdlVideoInfo.mdl_cur_url);
                hashMap.put("cur_ip", this.mEventBase.mdlVideoInfo.mdl_cur_ip);
                str = this.mEventBase.mdlVideoInfo.mdl_cur_url;
            } else {
                hashMap.put("cur_url", this.mEventBase.mCurURL);
                hashMap.put("cur_ip", this.mEventBase.mCurIP);
                str = this.mEventBase.mCurURL;
            }
            try {
                hashMap.put("cur_host", Uri.parse(str).getHost());
            } catch (Exception e) {
                TTVideoEngineLog.m256505i("VideoEventOneEvent", "triggerBufferStartCb:" + e.toString());
            }
            this.mEventBase.mDataSource.onInfo(0, hashMap);
        }
    }

    public void _triggerBufferEndCb() {
        VideoEventBase videoEventBase = this.mEventBase;
        if (videoEventBase != null && videoEventBase.mDataSource != null) {
            HashMap hashMap = new HashMap();
            hashMap.put(HiAnalyticsConstant.BI_KEY_COST_TIME, Long.valueOf(this.mEventContext.mCostTime));
            hashMap.put("exit_type", this.mEventContext.mEndType);
            JSONObject mDLInfo = this.mEventBase.getMDLInfo();
            if (mDLInfo == null) {
                hashMap.put("cur_url", this.mEventBase.mCurURL);
                hashMap.put("cur_ip", this.mEventBase.mCurIP);
                try {
                    hashMap.put("cur_host", Uri.parse(this.mEventBase.mCurURL).getHost());
                } catch (Exception e) {
                    TTVideoEngineLog.m256505i("VideoEventOneEvent", "_triggerBufferEndCb:" + e.toString());
                }
            } else if (!mDLInfo.isNull("video")) {
                try {
                    VideoEventBase.MDLTrackInfo mdlTrackInfo = this.mEventBase.getMdlTrackInfo(mDLInfo.getJSONObject("video"));
                    hashMap.put("cur_url", mdlTrackInfo.mdl_cur_url);
                    hashMap.put("cur_ip", mdlTrackInfo.mdl_cur_ip);
                    hashMap.put("cur_host", Uri.parse(mdlTrackInfo.mdl_cur_url).getHost());
                } catch (Exception e2) {
                    TTVideoEngineLog.m256501d(e2);
                }
            }
            this.mEventBase.mDataSource.onInfo(1, hashMap);
        }
    }

    /* access modifiers changed from: private */
    public class EventContext {
        public long mAudioLenAfterMS;
        public long mAudioLenBaseAfterMs;
        public long mAudioLenBaseBeforeMs;
        public long mAudioLenBeforeMS;
        public long mAudioLenDecAfterMs;
        public long mAudioLenDecBeforeMs;
        public int mBufferingType;
        public long mBytesFromMDL;
        public int mConfigBitrateAfter;
        public int mConfigBitrateBefore;
        public long mCostTime;
        public long mEndT;
        public String mEndType;
        public String mEventType;
        public int mIndex;
        public int mIsABR;
        public int mIsAVBadInterlaced;
        public long mLastSeekTime;
        public long mPreStartT;
        public String mQualityDescAfter;
        public String mQualityDescBefore;
        public String mResolutionAfter;
        public String mResolutionBefore;
        public int mRetryCount;
        public long mStartT;
        public long mVideoAudioGap;
        public long mVideoLenAfterMS;
        public long mVideoLenBaseAfterMs;
        public long mVideoLenBaseBeforeMs;
        public long mVideoLenBeforeMS;
        public long mVideoLenDecAfterMs;
        public long mVideoLenDecBeforeMs;
        public int mVideoPos;

        private EventContext() {
            this.mEventType = "";
            this.mCostTime = -2147483648L;
            this.mEndType = "";
            this.mPreStartT = -2147483648L;
            this.mBufferingType = -1;
            this.mStartT = -2147483648L;
            this.mEndT = -2147483648L;
            this.mLastSeekTime = -2147483648L;
            this.mVideoPos = Integer.MIN_VALUE;
            this.mVideoLenBeforeMS = -1;
            this.mAudioLenBeforeMS = -1;
            this.mResolutionBefore = "";
            this.mResolutionAfter = "";
            this.mConfigBitrateBefore = Integer.MIN_VALUE;
            this.mConfigBitrateAfter = Integer.MIN_VALUE;
            this.mIsABR = Integer.MIN_VALUE;
            this.mQualityDescBefore = "";
            this.mQualityDescAfter = "";
        }
    }

    public void moviePreStalled(int i) {
        this.mEventContext.mPreStartT = System.currentTimeMillis();
        this.mEventContext.mBufferingType = i;
        TTVideoEngineLog.m256500d("VideoEventOneEvent", "movie stall type:" + i);
        VideoEventBase videoEventBase = this.mEventBase;
        if (videoEventBase != null) {
            videoEventBase.updateMDLInfo();
        }
    }

    public void movieStallEnd(String str) {
        if (this.mEventContext.mStartT <= 0 || this.mEventContext.mEventType.isEmpty()) {
            TTVideoEngineLog.m256500d("VideoEventOneEvent", "movieStallEnd without movieStalled, return.");
            this.mEventContext.mPreStartT = -2147483648L;
            this.mEventContext.mBufferingType = -1;
            return;
        }
        this.mEventContext.mEndT = System.currentTimeMillis();
        TTVideoEngineLog.m256500d("VideoEventOneEvent", "movieStallEnd");
        EventContext eventContext = this.mEventContext;
        eventContext.mCostTime = eventContext.mEndT - this.mEventContext.mStartT;
        if (this.mEventContext.mCostTime > 0) {
            this.mAccuCostTime += this.mEventContext.mCostTime;
        }
        this.mEventContext.mEndType = str;
        this.mEventContext.mLastSeekTime = this.mEventOpera.getLastSeekTime();
        if (this.mEventContext.mLastSeekTime == 0) {
            EventContext eventContext2 = this.mEventContext;
            eventContext2.mLastSeekTime = eventContext2.mStartT;
        }
        VideoEventBase videoEventBase = this.mEventBase;
        if (!(videoEventBase == null || videoEventBase.mDataSource == null)) {
            this.mEventContext.mResolutionAfter = this.mEventBase.mCurrentResolution;
            this.mEventContext.mConfigBitrateAfter = this.mEventBase.mCurrentConfigBitrate;
            this.mEventContext.mQualityDescAfter = this.mEventBase.mCurrentQualityDesc;
            Map bytesInfo = this.mEventBase.mDataSource.bytesInfo();
            if (bytesInfo != null) {
                this.mEventContext.mVideoLenAfterMS = ((Long) bytesInfo.get("vlen")).longValue();
                this.mEventContext.mAudioLenAfterMS = ((Long) bytesInfo.get("alen")).longValue();
                this.mEventContext.mVideoLenDecAfterMs = ((Long) bytesInfo.get("vDecLen")).longValue();
                this.mEventContext.mVideoLenBaseAfterMs = ((Long) bytesInfo.get("vBaseLen")).longValue();
                this.mEventContext.mAudioLenDecAfterMs = ((Long) bytesInfo.get("aDecLen")).longValue();
                this.mEventContext.mAudioLenBaseAfterMs = ((Long) bytesInfo.get("aBaseLen")).longValue();
                this.mEventContext.mVideoAudioGap = ((Long) bytesInfo.get("avGap")).longValue();
            }
        }
        HashMap hashMap = new HashMap();
        hashMap.put("p", Integer.valueOf(this.mEventContext.mVideoPos));
        hashMap.put("t", Long.valueOf(this.mEventContext.mEndT));
        hashMap.put(C60375c.f150914a, Long.valueOf(this.mEventContext.mCostTime));
        this.mRebufList.add(new JSONObject(hashMap).toString());
        this.mEventBase.degradeModeChangeSession();
        sendOneEvent();
        _triggerBufferEndCb();
        this.mEventContext = new EventContext();
    }

    VideoEventOneEvent(VideoEventBase videoEventBase, VideoEventOneOpera videoEventOneOpera) {
        this.mEventBase = videoEventBase;
        this.mEventOpera = videoEventOneOpera;
        this.mLastEventTimeMap = new HashMap();
        this.mEventContext = new EventContext();
    }

    public void movieStalled(int i, int i2) {
        int indexOf;
        int indexOf2;
        int indexOf3;
        int indexOf4;
        int indexOf5;
        int indexOf6;
        Object obj;
        TTVideoEngineLog.m256500d("VideoEventOneEvent", "movieStalled");
        this.mEventContext.mStartT = System.currentTimeMillis();
        this.mEventContext.mVideoPos = i;
        this.mEventContext.mIndex = i2;
        this.mEventContext.mEventType = "block_net";
        VideoEventBase videoEventBase = this.mEventBase;
        if (videoEventBase != null && videoEventBase.mDataSource != null) {
            this.mEventContext.mResolutionBefore = this.mEventBase.mCurrentResolution;
            this.mEventContext.mConfigBitrateBefore = this.mEventBase.mCurrentConfigBitrate;
            this.mEventContext.mQualityDescBefore = this.mEventBase.mCurrentQualityDesc;
            if (!(this.mEventBase.abrInfo == null || (obj = this.mEventBase.abrInfo.get("abr_used")) == null)) {
                this.mEventContext.mIsABR = ((Integer) obj).intValue();
            }
            this.mEventContext.mBytesFromMDL = this.mEventBase.mDataSource.getLogValueLong(56);
            String logValueStr = this.mEventBase.mDataSource.getLogValueStr(55);
            if (logValueStr != null) {
                String[] split = logValueStr.split(";");
                int length = split.length;
                if (length > 0 && split[0].contains("fvl") && (indexOf6 = split[0].indexOf(":")) > 0) {
                    try {
                        this.mEventContext.mVideoLenBeforeMS = Long.valueOf(split[0].substring(indexOf6 + 1)).longValue();
                    } catch (Exception e) {
                        TTVideoEngineLog.m256503e("VideoEventOneEvent", String.format("format error: %s", e.toString()));
                    }
                }
                if (1 < length && split[1].contains("fal") && (indexOf5 = split[1].indexOf(":")) > 0) {
                    try {
                        this.mEventContext.mAudioLenBeforeMS = Long.valueOf(split[1].substring(indexOf5 + 1)).longValue();
                    } catch (Exception e2) {
                        TTVideoEngineLog.m256503e("VideoEventOneEvent", String.format("format error: %s", e2.toString()));
                    }
                }
                if (2 < length && split[2].contains("dvl") && (indexOf4 = split[2].indexOf(":")) > 0) {
                    try {
                        this.mEventContext.mVideoLenDecBeforeMs = Long.valueOf(split[2].substring(indexOf4 + 1)).longValue();
                    } catch (Exception e3) {
                        TTVideoEngineLog.m256503e("VideoEventOneEvent", String.format("format error: %s", e3.toString()));
                    }
                }
                if (3 < length && split[3].contains("dal") && (indexOf3 = split[3].indexOf(":")) > 0) {
                    try {
                        this.mEventContext.mAudioLenDecBeforeMs = Long.valueOf(split[3].substring(indexOf3 + 1)).longValue();
                    } catch (Exception e4) {
                        TTVideoEngineLog.m256503e("VideoEventOneEvent", String.format("format error: %s", e4.toString()));
                    }
                }
                if (4 < length && split[4].contains("bvl") && (indexOf2 = split[4].indexOf(":")) > 0) {
                    try {
                        this.mEventContext.mVideoLenBaseBeforeMs = Long.valueOf(split[4].substring(indexOf2 + 1)).longValue();
                    } catch (Exception e5) {
                        TTVideoEngineLog.m256503e("VideoEventOneEvent", String.format("format error: %s", e5.toString()));
                    }
                }
                if (5 < length && split[5].contains("bal") && (indexOf = split[5].indexOf(":")) > 0) {
                    try {
                        this.mEventContext.mAudioLenBaseBeforeMs = Long.valueOf(split[5].substring(indexOf + 1)).longValue();
                    } catch (Exception e6) {
                        TTVideoEngineLog.m256503e("VideoEventOneEvent", String.format("format error: %s", e6.toString()));
                    }
                }
                this.mEventBase.mNetworkType = VideoEventBase.getNetType();
            }
        }
    }

    public JSONObject toJsonObject(EventContext eventContext, VideoEventBase videoEventBase) {
        long j;
        long j2;
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
            VideoEventOnePlay.putToMap(hashMap, CommonCode.MapKey.HAS_RESOLUTION, videoEventBase.mCurrentResolution);
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
            VideoEventOnePlay.putToMap((Map) hashMap, "play_speed", videoEventBase.mPlaySpeed);
            VideoEventOnePlay.putToMap(hashMap, "nt", videoEventBase.mNetworkType);
            VideoEventOnePlay.putToMap(hashMap, "mdl_version", videoEventBase.mMdlVersion);
            VideoEventOnePlay.putToMap((Map) hashMap, "enable_mdl", videoEventBase.mEnableMDL);
            VideoEventOnePlay.putToMap((Map) hashMap, "video_hw", videoEventBase.mVideoHW);
            VideoEventOnePlay.putToMap((Map) hashMap, "user_hw", videoEventBase.mVideoHWUser);
            VideoEventOnePlay.putToMap((Map) hashMap, "cur_task_num", videoEventBase.mdl_cur_task_num);
            VideoEventOnePlay.putToMap(hashMap, "cur_req_pos", videoEventBase.mdlVideoInfo.mdl_cur_req_pos);
            VideoEventOnePlay.putToMap(hashMap, "cur_end_pos", videoEventBase.mdlVideoInfo.mdl_cur_end_pos);
            VideoEventOnePlay.putToMap(hashMap, "cur_cache_pos", videoEventBase.mdlVideoInfo.mdl_cur_cache_pos);
            VideoEventOnePlay.putToMap((Map) hashMap, "cache_type", videoEventBase.mdlVideoInfo.mdl_cache_type);
            VideoEventOnePlay.putToMap(hashMap, "cur_ip", videoEventBase.mdlVideoInfo.mdl_cur_ip);
            VideoEventOnePlay.putToMap(hashMap, "cur_host", videoEventBase.mdlVideoInfo.mdl_cur_host);
            VideoEventOnePlay.putToMap(hashMap, "reply_size", videoEventBase.mdlVideoInfo.mdl_reply_size);
            VideoEventOnePlay.putToMap(hashMap, "down_pos", videoEventBase.mdlVideoInfo.mdl_down_pos);
            VideoEventOnePlay.putToMap(hashMap, "player_wait_time", videoEventBase.mdlVideoInfo.mdl_player_wait_time);
            VideoEventOnePlay.putToMap((Map) hashMap, "player_wait_num", videoEventBase.mdlVideoInfo.mdl_player_wait_num);
            VideoEventOnePlay.putToMap((Map) hashMap, "mdl_stage", videoEventBase.mdlVideoInfo.mdl_stage);
            VideoEventOnePlay.putToMap((Map) hashMap, "mdl_ec", videoEventBase.mdlVideoInfo.mdl_error_code);
            VideoEventOnePlay.putToMap((Map) hashMap, "mdl_speed", videoEventBase.mdlVideoInfo.mdl_speed);
            VideoEventOnePlay.putToMap(hashMap, "mdl_file_key", videoEventBase.mdlVideoInfo.mdl_file_key);
            VideoEventOnePlay.putToMap((Map) hashMap, "mdl_is_socrf", videoEventBase.mdlVideoInfo.mdl_is_socrf);
            VideoEventOnePlay.putToMap((Map) hashMap, "mdl_req_num", videoEventBase.mdlVideoInfo.mdl_req_num);
            VideoEventOnePlay.putToMap((Map) hashMap, "mdl_url_index", videoEventBase.mdlVideoInfo.mdl_url_index);
            VideoEventOnePlay.putToMap(hashMap, "mdl_re_url", videoEventBase.mdlVideoInfo.mdl_re_url);
            VideoEventOnePlay.putToMap((Map) hashMap, "mdl_cur_source", videoEventBase.mdlVideoInfo.mdl_cur_soure);
            VideoEventOnePlay.putToMap(hashMap, "mdl_extra_info", videoEventBase.mdlVideoInfo.mdl_extra_info);
            VideoEventOnePlay.putToMap(hashMap, "mdl_fs", videoEventBase.mdlVideoInfo.mdl_fs);
            VideoEventOnePlay.putToMap((Map) hashMap, "mdl_p2p_sp", videoEventBase.mdlVideoInfo.mdl_pcdn_full_speed);
            VideoEventOnePlay.putToMap(hashMap, "mdl_tbs", videoEventBase.mdlVideoInfo.mdl_tbs);
            VideoEventOnePlay.putToMap(hashMap, "mdl_lbs", videoEventBase.mdlVideoInfo.mdl_lbs);
            VideoEventOnePlay.putToMap(hashMap, "mdl_response_cache", this.mEventBase.mdlVideoInfo.mdl_cdn_cache);
            VideoEventOnePlay.putToMap(hashMap, "mdl_response_cinfo", this.mEventBase.mdlVideoInfo.mdl_client_info);
            VideoEventOnePlay.putToMap(hashMap, "a_cur_req_pos", videoEventBase.mdlAudioInfo.mdl_cur_req_pos);
            VideoEventOnePlay.putToMap(hashMap, "a_cur_end_pos", videoEventBase.mdlAudioInfo.mdl_cur_end_pos);
            VideoEventOnePlay.putToMap(hashMap, "a_cur_cache_pos", videoEventBase.mdlAudioInfo.mdl_cur_cache_pos);
            VideoEventOnePlay.putToMap((Map) hashMap, "a_cache_type", videoEventBase.mdlAudioInfo.mdl_cache_type);
            VideoEventOnePlay.putToMap(hashMap, "a_cur_ip", videoEventBase.mdlAudioInfo.mdl_cur_ip);
            VideoEventOnePlay.putToMap(hashMap, "a_cur_host", videoEventBase.mdlAudioInfo.mdl_cur_host);
            VideoEventOnePlay.putToMap(hashMap, "a_reply_size", videoEventBase.mdlAudioInfo.mdl_reply_size);
            VideoEventOnePlay.putToMap(hashMap, "a_down_pos", videoEventBase.mdlAudioInfo.mdl_down_pos);
            VideoEventOnePlay.putToMap(hashMap, "a_player_wait_time", videoEventBase.mdlAudioInfo.mdl_player_wait_time);
            VideoEventOnePlay.putToMap((Map) hashMap, "a_player_wait_num", videoEventBase.mdlAudioInfo.mdl_player_wait_num);
            VideoEventOnePlay.putToMap((Map) hashMap, "a_mdl_stage", videoEventBase.mdlAudioInfo.mdl_stage);
            VideoEventOnePlay.putToMap((Map) hashMap, "a_mdl_ec", videoEventBase.mdlAudioInfo.mdl_error_code);
            VideoEventOnePlay.putToMap((Map) hashMap, "a_mdl_speed", videoEventBase.mdlAudioInfo.mdl_speed);
            VideoEventOnePlay.putToMap(hashMap, "a_mdl_file_key", videoEventBase.mdlAudioInfo.mdl_file_key);
            VideoEventOnePlay.putToMap((Map) hashMap, "a_mdl_is_socrf", videoEventBase.mdlAudioInfo.mdl_is_socrf);
            VideoEventOnePlay.putToMap((Map) hashMap, "a_mdl_req_num", videoEventBase.mdlAudioInfo.mdl_req_num);
            VideoEventOnePlay.putToMap((Map) hashMap, "a_mdl_url_index", videoEventBase.mdlAudioInfo.mdl_url_index);
            VideoEventOnePlay.putToMap(hashMap, "a_mdl_re_url", videoEventBase.mdlAudioInfo.mdl_re_url);
            VideoEventOnePlay.putToMap((Map) hashMap, "a_mdl_cur_source", videoEventBase.mdlAudioInfo.mdl_cur_soure);
            VideoEventOnePlay.putToMap(hashMap, "a_mdl_extra_info", videoEventBase.mdlAudioInfo.mdl_extra_info);
            VideoEventOnePlay.putToMap(hashMap, "a_mdl_fs", videoEventBase.mdlAudioInfo.mdl_fs);
            VideoEventOnePlay.putToMap((Map) hashMap, "a_mdl_p2p_sp", videoEventBase.mdlAudioInfo.mdl_pcdn_full_speed);
            VideoEventOnePlay.putToMap(hashMap, "a_mdl_tbs", videoEventBase.mdlAudioInfo.mdl_tbs);
            VideoEventOnePlay.putToMap(hashMap, "a_mdl_lbs", videoEventBase.mdlAudioInfo.mdl_lbs);
            VideoEventOnePlay.putToMap(hashMap, "a_mdl_response_cache", this.mEventBase.mdlAudioInfo.mdl_cdn_cache);
            VideoEventOnePlay.putToMap(hashMap, "a_mdl_response_cinfo", this.mEventBase.mdlAudioInfo.mdl_client_info);
        }
        VideoEventOnePlay.putToMap(hashMap, "event_type", eventContext.mEventType);
        VideoEventOnePlay.putToMap(hashMap, HiAnalyticsConstant.BI_KEY_COST_TIME, eventContext.mCostTime);
        VideoEventOnePlay.putToMap(hashMap, "end_type", eventContext.mEndType);
        VideoEventOnePlay.putToMap((Map) hashMap, "index", eventContext.mIndex);
        long j3 = -1;
        if (this.mFirstFrameTime > 0) {
            j = eventContext.mStartT - this.mFirstFrameTime;
        } else {
            j = -1;
        }
        VideoEventOnePlay.putToMap(hashMap, "first_frame_interval", j);
        if (eventContext.mLastSeekTime > 0) {
            j2 = eventContext.mStartT - eventContext.mLastSeekTime;
        } else {
            j2 = -1;
        }
        VideoEventOnePlay.putToMap(hashMap, "last_seek_interval", j2);
        if (this.mLastEventTimeMap.containsKey(eventContext.mEventType)) {
            long longValue = ((Long) this.mLastEventTimeMap.get(eventContext.mEventType)).longValue();
            if (longValue > 0) {
                j3 = eventContext.mStartT - longValue;
            }
        }
        VideoEventOnePlay.putToMap(hashMap, "last_event_interval", j3);
        VideoEventOnePlay.putToMap((Map) hashMap, "last_switch_interval", -1);
        VideoEventOnePlay.putToMap((Map) hashMap, "video_pos", eventContext.mVideoPos);
        VideoEventOnePlay.putToMap((Map) hashMap, "retry_count", eventContext.mRetryCount);
        VideoEventOnePlay.putToMap((Map) hashMap, "reuse_socket", videoEventBase.mReuseSocket);
        VideoEventOnePlay.putToMap(hashMap, "read_count_mdl", eventContext.mBytesFromMDL);
        VideoEventOnePlay.putToMap(hashMap, "audio_len_before", eventContext.mAudioLenBeforeMS);
        VideoEventOnePlay.putToMap(hashMap, "video_len_before", eventContext.mVideoLenBeforeMS);
        VideoEventOnePlay.putToMap(hashMap, "audio_len_after", eventContext.mAudioLenAfterMS);
        VideoEventOnePlay.putToMap(hashMap, "video_len_after", eventContext.mVideoLenAfterMS);
        VideoEventOnePlay.putToMap(hashMap, "vlen_dec_before", eventContext.mVideoLenDecBeforeMs);
        VideoEventOnePlay.putToMap(hashMap, "vlen_base_before", eventContext.mVideoLenBaseBeforeMs);
        VideoEventOnePlay.putToMap(hashMap, "alen_dec_before", eventContext.mAudioLenDecBeforeMs);
        VideoEventOnePlay.putToMap(hashMap, "alen_base_before", eventContext.mAudioLenBaseBeforeMs);
        VideoEventOnePlay.putToMap(hashMap, "vlen_dec_after", eventContext.mVideoLenDecAfterMs);
        VideoEventOnePlay.putToMap(hashMap, "vlen_base_after", eventContext.mVideoLenBaseAfterMs);
        VideoEventOnePlay.putToMap(hashMap, "alen_dec_after", eventContext.mAudioLenDecAfterMs);
        VideoEventOnePlay.putToMap(hashMap, "alen_base_after", eventContext.mAudioLenBaseAfterMs);
        VideoEventOnePlay.putToMap(hashMap, "av_gap", eventContext.mVideoAudioGap);
        VideoEventOnePlay.putToMap((Map) hashMap, "buffer_reason", eventContext.mBufferingType);
        VideoEventOnePlay.putToMap(hashMap, "pst", eventContext.mPreStartT);
        VideoEventOnePlay.putToMap(hashMap, "st", eventContext.mStartT);
        VideoEventOnePlay.putToMap(hashMap, "et", eventContext.mEndT);
        VideoEventOnePlay.putToMap(hashMap, "resolution_before", eventContext.mResolutionBefore);
        VideoEventOnePlay.putToMap(hashMap, "resolution_after", eventContext.mResolutionAfter);
        VideoEventOnePlay.putToMap((Map) hashMap, "bitrate_before", eventContext.mConfigBitrateBefore);
        VideoEventOnePlay.putToMap((Map) hashMap, "bitrate_after", eventContext.mConfigBitrateAfter);
        VideoEventOnePlay.putToMap((Map) hashMap, "is_abr", eventContext.mIsABR);
        VideoEventOnePlay.putToMap(hashMap, "quality_desc_before", eventContext.mQualityDescBefore);
        VideoEventOnePlay.putToMap(hashMap, "quality_desc_after", eventContext.mQualityDescAfter);
        VideoEventOnePlay.putToMap((Map) hashMap, "bad_interlaced", eventContext.mIsAVBadInterlaced);
        TTVideoEngineLog.m256500d("VideoEventOneEvent", "OneEvent:" + hashMap.toString());
        return new JSONObject(hashMap);
    }
}
