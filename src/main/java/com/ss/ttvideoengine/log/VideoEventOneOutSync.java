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

public class VideoEventOneOutSync {
    public int mAVOutSyncCount = 0;
    public EventContext mContext;
    public VideoEventBase mEventBase;
    public long mFirstFrameTime = -2147483648L;
    public int mIndex = 0;
    public long mLastEventTime = -2147483648L;
    public ArrayList<String> mList = new ArrayList<>();

    public void onAVBadInterlaced() {
        this.mContext.mIsAVBadInterlaced = 1;
    }

    public void showedFirstFrame() {
        this.mFirstFrameTime = System.currentTimeMillis();
    }

    private void _triggerOutSyncStartCb() {
        VideoEventBase videoEventBase = this.mEventBase;
        if (videoEventBase != null && videoEventBase.mDataSource != null) {
            this.mEventBase.mDataSource.onInfo(3, new HashMap());
        }
    }

    public void reset() {
        this.mList = new ArrayList<>();
        this.mAVOutSyncCount = 0;
        this.mIndex = 0;
        this.mFirstFrameTime = -2147483648L;
        this.mLastEventTime = -2147483648L;
    }

    public void sendOutSyncEvent() {
        TTVideoEngineLog.m256505i("VideoEventOneOutSync", "report oussync event");
        this.mEventBase.updateVideoInfo(null);
        EngineThreadPool.addExecuteTask(new AsyncGetLogDataRunnable(this.mEventBase.mContext, this, this.mEventBase, this.mContext));
    }

    /* access modifiers changed from: private */
    public static class AsyncGetLogDataRunnable implements Runnable {
        private Context rContext;
        private VideoEventOneOutSync rEvent;
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
                    /* class com.ss.ttvideoengine.log.VideoEventOneOutSync.AsyncGetLogDataRunnable.RunnableC654601 */

                    public void run() {
                        VideoEventManager.instance.addEventV2(z, jsonObject, "videoplayer_oneevent");
                    }
                });
                this.rEvent.mLastEventTime = this.rEventContext.mEndT;
            }
        }

        public AsyncGetLogDataRunnable(Context context, VideoEventOneOutSync videoEventOneOutSync, VideoEventBase videoEventBase, EventContext eventContext) {
            this.rEvent = videoEventOneOutSync;
            this.rEventBase = videoEventBase;
            this.rContext = context;
            this.rEventContext = eventContext;
        }
    }

    private void _triggerOutSyncEndCb() {
        VideoEventBase videoEventBase = this.mEventBase;
        if (videoEventBase != null && videoEventBase.mDataSource != null) {
            HashMap hashMap = new HashMap();
            hashMap.put("begin_pos", Integer.valueOf(this.mContext.mBeginPos));
            hashMap.put("end_pos", Integer.valueOf(this.mContext.mEndPos));
            hashMap.put("render_drop_cnt", Integer.valueOf(this.mContext.mDropCount));
            hashMap.put("container_fps", Float.valueOf(this.mEventBase.mDataSource.getLogValueFloat(82)));
            hashMap.put("video_out_fps", Float.valueOf(this.mEventBase.mDataSource.getLogValueFloat(83)));
            hashMap.put("clock_diff", Long.valueOf(this.mEventBase.mDataSource.getLogValueLong(45)));
            int logValueInt = this.mEventBase.mDataSource.getLogValueInt(84);
            long j = 0;
            if (logValueInt > 0) {
                j = (long) (1000 / logValueInt);
            }
            hashMap.put("decode_time", Long.valueOf(j));
            this.mEventBase.mDataSource.onInfo(4, hashMap);
        }
    }

    public VideoEventOneOutSync(VideoEventBase videoEventBase) {
        this.mEventBase = videoEventBase;
        this.mContext = new EventContext();
    }

    /* access modifiers changed from: private */
    public class EventContext {
        public long mAudioBaseLenMs;
        public long mAudioDecoderLenMs;
        public long mAudioFormaterLenMs;
        public int mBeginPos;
        public int mBitrateAfter;
        public int mBitrateBefore;
        public int mBt;
        public long mCostTime;
        public int mDropCount;
        public int mEndPos;
        public long mEndT;
        public String mEndType;
        public int mHeadset;
        public int mIsABR;
        public int mIsAVBadInterlaced;
        public int mIsBackground;
        public int mIsCharging;
        public int mIsRadioMode;
        public long mLastAVSwitchInterval;
        public long mLastForebackSwitchInterval;
        public long mLastHeadsetSwitchInterval;
        public long mLastRebufT;
        public long mLastResSwitchInterval;
        public long mLastSeekT;
        public long mMaxAVDiff;
        public int mPower;
        public String mPtsList;
        public String mQualityDescAfter;
        public String mQualityDescBefore;
        public String mResolultionAfter;
        public String mResolutionBefore;
        public long mStartT;
        public long mVideoBaseLenMs;
        public String mVideoDecFpsList;
        public long mVideoDecoderLenMs;
        public long mVideoFormaterLenMS;

        private EventContext() {
            this.mStartT = -2147483648L;
            this.mEndT = -2147483648L;
            this.mDropCount = Integer.MIN_VALUE;
            this.mAudioFormaterLenMs = -2147483648L;
            this.mVideoFormaterLenMS = -2147483648L;
            this.mAudioDecoderLenMs = -2147483648L;
            this.mVideoDecoderLenMs = -2147483648L;
            this.mAudioBaseLenMs = -2147483648L;
            this.mVideoBaseLenMs = -2147483648L;
            this.mBitrateBefore = Integer.MIN_VALUE;
            this.mBitrateAfter = Integer.MIN_VALUE;
            this.mLastRebufT = -2147483648L;
            this.mLastSeekT = -2147483648L;
            this.mBeginPos = Integer.MIN_VALUE;
            this.mEndPos = Integer.MIN_VALUE;
            this.mCostTime = -2147483648L;
            this.mIsABR = Integer.MIN_VALUE;
            this.mQualityDescBefore = "";
            this.mQualityDescAfter = "";
            this.mIsRadioMode = Integer.MIN_VALUE;
            this.mLastAVSwitchInterval = -2147483648L;
            this.mLastResSwitchInterval = -2147483648L;
            this.mHeadset = Integer.MIN_VALUE;
            this.mBt = Integer.MIN_VALUE;
            this.mLastHeadsetSwitchInterval = -2147483648L;
            this.mPower = Integer.MIN_VALUE;
            this.mIsCharging = Integer.MIN_VALUE;
            this.mMaxAVDiff = -2147483648L;
            this.mIsBackground = Integer.MIN_VALUE;
            this.mLastForebackSwitchInterval = -2147483648L;
        }
    }

    public void AVOutSyncEnd(int i, String str) {
        if (this.mContext.mStartT <= 0) {
            TTVideoEngineLog.m256508w("VideoEventOneOutSync", "Invalid start time, return." + this.mContext.mStartT);
            return;
        }
        this.mContext.mEndType = str;
        this.mContext.mEndPos = i;
        this.mContext.mEndT = System.currentTimeMillis();
        EventContext eventContext = this.mContext;
        eventContext.mCostTime = eventContext.mEndT - this.mContext.mStartT;
        if (this.mContext.mCostTime > 200) {
            this.mAVOutSyncCount++;
        }
        VideoEventBase videoEventBase = this.mEventBase;
        if (videoEventBase != null) {
            this.mContext.mResolultionAfter = videoEventBase.mCurrentResolution;
            this.mContext.mBitrateAfter = this.mEventBase.mCurrentConfigBitrate;
            this.mContext.mQualityDescAfter = this.mEventBase.mCurrentQualityDesc;
            if (this.mEventBase.mDataSource != null) {
                this.mContext.mDropCount = this.mEventBase.mDataSource.getLogValueInt(79);
                this.mContext.mPtsList = this.mEventBase.mDataSource.getLogValueStr(78);
                this.mContext.mVideoDecFpsList = this.mEventBase.mDataSource.getLogValueStr(80);
                this.mContext.mMaxAVDiff = this.mEventBase.mDataSource.getLogValueLong(96);
            }
        }
        HashMap hashMap = new HashMap();
        hashMap.put("ps", Integer.valueOf(this.mContext.mBeginPos));
        hashMap.put("pe", Integer.valueOf(this.mContext.mEndPos));
        hashMap.put("st", Long.valueOf(this.mContext.mStartT));
        hashMap.put(C60375c.f150914a, Long.valueOf(this.mContext.mCostTime));
        this.mList.add(new JSONObject(hashMap).toString());
        this.mEventBase.degradeModeChangeSession();
        sendOutSyncEvent();
        _triggerOutSyncEndCb();
        this.mContext = new EventContext();
    }

    public JSONObject toJsonObject(EventContext eventContext, VideoEventBase videoEventBase) {
        long j;
        HashMap hashMap = new HashMap();
        if (videoEventBase != null) {
            VideoEventOnePlay.putToMap(hashMap, "player_sessionid", this.mEventBase.mSessionID);
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
            VideoEventOnePlay.putToMap((Map) hashMap, "play_speed", videoEventBase.mPlaySpeed);
            VideoEventOnePlay.putToMap(hashMap, "nt", videoEventBase.mNetworkType);
            VideoEventOnePlay.putToMap(hashMap, "mdl_version", videoEventBase.mMdlVersion);
            VideoEventOnePlay.putToMap((Map) hashMap, "enable_mdl", videoEventBase.mEnableMDL);
            VideoEventOnePlay.putToMap((Map) hashMap, "video_hw", videoEventBase.mVideoHW);
            VideoEventOnePlay.putToMap((Map) hashMap, "user_hw", videoEventBase.mVideoHWUser);
        }
        VideoEventOnePlay.putToMap(hashMap, "event_type", "av_outsync");
        VideoEventOnePlay.putToMap(hashMap, "st", eventContext.mStartT);
        VideoEventOnePlay.putToMap(hashMap, "et", eventContext.mEndT);
        VideoEventOnePlay.putToMap(hashMap, HiAnalyticsConstant.BI_KEY_COST_TIME, eventContext.mCostTime);
        VideoEventOnePlay.putToMap(hashMap, "end_type", eventContext.mEndType);
        VideoEventOnePlay.putToMap(hashMap, "audio_len_before", eventContext.mAudioFormaterLenMs);
        VideoEventOnePlay.putToMap(hashMap, "video_len_before", eventContext.mVideoFormaterLenMS);
        VideoEventOnePlay.putToMap(hashMap, "alen_dec_before", eventContext.mAudioDecoderLenMs);
        VideoEventOnePlay.putToMap(hashMap, "vlen_dec_before", eventContext.mVideoDecoderLenMs);
        VideoEventOnePlay.putToMap(hashMap, "alen_base_before", eventContext.mAudioBaseLenMs);
        VideoEventOnePlay.putToMap(hashMap, "vlen_base_before", eventContext.mVideoBaseLenMs);
        VideoEventOnePlay.putToMap(hashMap, "resolution_before", eventContext.mResolutionBefore);
        VideoEventOnePlay.putToMap(hashMap, "resolution_after", eventContext.mResolultionAfter);
        VideoEventOnePlay.putToMap((Map) hashMap, "bitrate_before", eventContext.mBitrateBefore);
        VideoEventOnePlay.putToMap((Map) hashMap, "bitrate_after", eventContext.mBitrateAfter);
        VideoEventOnePlay.putToMap((Map) hashMap, "index", this.mIndex);
        VideoEventOnePlay.putToMap((Map) hashMap, "radio_mode", eventContext.mIsRadioMode);
        VideoEventOnePlay.putToMap(hashMap, "last_av_switch_interval", eventContext.mLastAVSwitchInterval);
        VideoEventOnePlay.putToMap(hashMap, "last_res_switch_interval", eventContext.mLastResSwitchInterval);
        VideoEventOnePlay.putToMap((Map) hashMap, "headset", eventContext.mHeadset);
        VideoEventOnePlay.putToMap((Map) hashMap, "bt", eventContext.mBt);
        VideoEventOnePlay.putToMap(hashMap, "last_headset_switch_interval", eventContext.mLastHeadsetSwitchInterval);
        VideoEventOnePlay.putToMap((Map) hashMap, "power", eventContext.mPower);
        VideoEventOnePlay.putToMap((Map) hashMap, "is_charging", eventContext.mIsCharging);
        VideoEventOnePlay.putToMap(hashMap, "max_av_diff", eventContext.mMaxAVDiff);
        VideoEventOnePlay.putToMap((Map) hashMap, "is_background", eventContext.mIsBackground);
        VideoEventOnePlay.putToMap(hashMap, "last_foreback_switch_interval", eventContext.mLastForebackSwitchInterval);
        long j2 = -1;
        if (this.mFirstFrameTime > 0) {
            j = eventContext.mStartT - this.mFirstFrameTime;
        } else {
            j = -1;
        }
        VideoEventOnePlay.putToMap(hashMap, "first_frame_interval", j);
        if (this.mLastEventTime > 0) {
            j2 = eventContext.mStartT - this.mLastEventTime;
        }
        VideoEventOnePlay.putToMap(hashMap, "last_event_interval", j2);
        VideoEventOnePlay.putToMap(hashMap, "pts_list", eventContext.mPtsList);
        VideoEventOnePlay.putToMap((Map) hashMap, "begin_pos", eventContext.mBeginPos);
        VideoEventOnePlay.putToMap((Map) hashMap, "end_pos", eventContext.mEndPos);
        VideoEventOnePlay.putToMap((Map) hashMap, "drop_cnt", eventContext.mDropCount);
        VideoEventOnePlay.putToMap(hashMap, "v_dec_fps_list", eventContext.mVideoDecFpsList);
        if (eventContext.mLastRebufT > 0) {
            VideoEventOnePlay.putToMap(hashMap, "last_rebuf_interval", eventContext.mStartT - eventContext.mLastRebufT);
        }
        if (eventContext.mLastSeekT > 0) {
            VideoEventOnePlay.putToMap(hashMap, "last_seek_interval", eventContext.mStartT - eventContext.mLastSeekT);
        }
        VideoEventOnePlay.putToMap((Map) hashMap, "is_abr", eventContext.mIsABR);
        VideoEventOnePlay.putToMap(hashMap, "quality_desc_before", eventContext.mQualityDescBefore);
        VideoEventOnePlay.putToMap(hashMap, "quality_desc_after", eventContext.mQualityDescAfter);
        VideoEventOnePlay.putToMap((Map) hashMap, "bad_interlaced", eventContext.mIsAVBadInterlaced);
        return new JSONObject(hashMap);
    }

    public void AVOutSyncStart(int i, long j, long j2) {
        int indexOf;
        int indexOf2;
        int indexOf3;
        int indexOf4;
        int indexOf5;
        int indexOf6;
        Object obj;
        long currentTimeMillis = System.currentTimeMillis();
        this.mContext.mStartT = currentTimeMillis;
        this.mContext.mBeginPos = i;
        this.mIndex++;
        if (j == 0) {
            EventContext eventContext = this.mContext;
            eventContext.mLastRebufT = eventContext.mStartT;
        } else {
            this.mContext.mLastRebufT = j;
        }
        if (j2 == 0) {
            EventContext eventContext2 = this.mContext;
            eventContext2.mLastSeekT = eventContext2.mStartT;
        } else {
            this.mContext.mLastSeekT = j2;
        }
        VideoEventBase videoEventBase = this.mEventBase;
        if (videoEventBase != null) {
            this.mContext.mResolutionBefore = videoEventBase.mCurrentResolution;
            this.mContext.mBitrateBefore = this.mEventBase.mCurrentConfigBitrate;
            this.mContext.mQualityDescBefore = this.mEventBase.mCurrentQualityDesc;
            if (!(this.mEventBase.abrInfo == null || (obj = this.mEventBase.abrInfo.get("abr_used")) == null)) {
                this.mContext.mIsABR = ((Integer) obj).intValue();
            }
            if (this.mEventBase.mDataSource != null) {
                String logValueStr = this.mEventBase.mDataSource.getLogValueStr(55);
                if (logValueStr != null) {
                    String[] split = logValueStr.split(";");
                    int length = split.length;
                    if (length > 0 && split[0].contains("fvl") && (indexOf6 = split[0].indexOf(":")) > 0) {
                        this.mContext.mVideoFormaterLenMS = Long.valueOf(split[0].substring(indexOf6 + 1)).longValue();
                    }
                    if (1 < length && split[1].contains("fal") && (indexOf5 = split[1].indexOf(":")) > 0) {
                        this.mContext.mAudioFormaterLenMs = Long.valueOf(split[1].substring(indexOf5 + 1)).longValue();
                    }
                    if (2 < length && split[2].contains("dvl") && (indexOf4 = split[2].indexOf(":")) > 0) {
                        this.mContext.mVideoDecoderLenMs = Long.valueOf(split[2].substring(indexOf4 + 1)).longValue();
                    }
                    if (3 < length && split[3].contains("dal") && (indexOf3 = split[3].indexOf(":")) > 0) {
                        this.mContext.mAudioDecoderLenMs = Long.valueOf(split[3].substring(indexOf3 + 1)).longValue();
                    }
                    if (4 < length && split[4].contains("bvl") && (indexOf2 = split[4].indexOf(":")) > 0) {
                        this.mContext.mVideoBaseLenMs = Long.valueOf(split[4].substring(indexOf2 + 1)).longValue();
                    }
                    if (5 < length && split[5].contains("bal") && (indexOf = split[5].indexOf(":")) > 0) {
                        this.mContext.mAudioBaseLenMs = Long.valueOf(split[5].substring(indexOf + 1)).longValue();
                    }
                    this.mContext.mIsRadioMode = this.mEventBase.mDataSource.getLogValueInt(88);
                    this.mContext.mHeadset = this.mEventBase.mDataSource.getLogValueInt(89);
                    this.mContext.mBt = this.mEventBase.mDataSource.getLogValueInt(90);
                    this.mContext.mIsBackground = this.mEventBase.mDataSource.getLogValueInt(94);
                    long logValueLong = this.mEventBase.mDataSource.getLogValueLong(91);
                    if (logValueLong > 0) {
                        this.mContext.mLastAVSwitchInterval = currentTimeMillis - logValueLong;
                    }
                    long logValueLong2 = this.mEventBase.mDataSource.getLogValueLong(92);
                    if (logValueLong2 > 0) {
                        this.mContext.mLastResSwitchInterval = currentTimeMillis - logValueLong2;
                    }
                    long logValueLong3 = this.mEventBase.mDataSource.getLogValueLong(93);
                    if (logValueLong3 > 0) {
                        this.mContext.mLastHeadsetSwitchInterval = currentTimeMillis - logValueLong3;
                    }
                    long logValueLong4 = this.mEventBase.mDataSource.getLogValueLong(95);
                    if (logValueLong4 > 0) {
                        this.mContext.mLastForebackSwitchInterval = currentTimeMillis - logValueLong4;
                    }
                    Map batteryInfo = this.mEventBase.mDataSource.batteryInfo();
                    if (batteryInfo != null) {
                        this.mContext.mPower = ((Integer) batteryInfo.get("power")).intValue();
                        this.mContext.mIsCharging = ((Integer) batteryInfo.get("isCharging")).intValue();
                    }
                } else {
                    return;
                }
            }
        }
        _triggerOutSyncStartCb();
    }
}
