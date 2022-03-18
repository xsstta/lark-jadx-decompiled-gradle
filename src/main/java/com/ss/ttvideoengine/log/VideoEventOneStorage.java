package com.ss.ttvideoengine.log;

import android.text.TextUtils;
import com.ss.ttvideoengine.utils.TTVideoEngineLog;
import java.util.HashMap;

public class VideoEventOneStorage {
    private HashMap<String, StorageContext> mStorageMap;

    /* access modifiers changed from: private */
    public static class VideoEventOneStorageHolder {
        public static final VideoEventOneStorage instance = new VideoEventOneStorage();

        private VideoEventOneStorageHolder() {
        }
    }

    public static final VideoEventOneStorage getInstance() {
        return VideoEventOneStorageHolder.instance;
    }

    private VideoEventOneStorage() {
        this.mStorageMap = new HashMap<>();
    }

    /* access modifiers changed from: private */
    public class StorageContext {
        public VideoEventOnePlay mOnePlay;
        public String mSessionId;

        private StorageContext() {
        }
    }

    public void storeVideoId(String str) {
        if (TextUtils.isEmpty(str)) {
            TTVideoEngineLog.m256505i("VideoEventOneStorage", "storeVideoId return");
        } else {
            getStorageContextFromMap(str);
        }
    }

    public static String extractVideoId(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        int indexOf = str.indexOf("?rk=");
        int indexOf2 = str.indexOf("&k=");
        if (indexOf == -1 || indexOf2 == -1) {
            return null;
        }
        return str.substring(indexOf + 4, indexOf2);
    }

    public String getSessionId(String str) {
        if (TextUtils.isEmpty(str)) {
            TTVideoEngineLog.m256505i("VideoEventOneStorage", "getSessionId return");
            return null;
        }
        StorageContext storageContextFromMap = getStorageContextFromMap(str);
        TTVideoEngineLog.m256505i("VideoEventOneStorage", "getSessionId, session id:" + storageContextFromMap.mSessionId);
        return storageContextFromMap.mSessionId;
    }

    public void removeByVideoId(String str) {
        if (TextUtils.isEmpty(str)) {
            TTVideoEngineLog.m256505i("VideoEventOneStorage", "removeByVideoId return");
            return;
        }
        this.mStorageMap.remove(str);
        TTVideoEngineLog.m256505i("VideoEventOneStorage", "removeByVideoId remove vid:" + str + ", map size:" + this.mStorageMap.size());
    }

    public VideoEventOnePlay restoreOnePlay(String str) {
        if (TextUtils.isEmpty(str)) {
            TTVideoEngineLog.m256505i("VideoEventOneStorage", "restoreOnePlay return");
            return null;
        }
        TTVideoEngineLog.m256500d("VideoEventOneStorage", "degrade mode, restore onePlay from context, vid:" + str);
        return getStorageContextFromMap(str).mOnePlay;
    }

    private StorageContext getStorageContextFromMap(String str) {
        StorageContext storageContext = this.mStorageMap.get(str);
        if (storageContext == null) {
            TTVideoEngineLog.m256505i("VideoEventOneStorage", "getStorageContextFromMap, new context, vid:" + str);
            StorageContext storageContext2 = new StorageContext();
            this.mStorageMap.put(str, storageContext2);
            return storageContext2;
        }
        TTVideoEngineLog.m256505i("VideoEventOneStorage", "getStorageContextFromMap, old context, vid:" + str);
        return storageContext;
    }

    public void storeSessionId(String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            TTVideoEngineLog.m256505i("VideoEventOneStorage", "storeSessionId return");
            return;
        }
        StorageContext storageContextFromMap = getStorageContextFromMap(str);
        storageContextFromMap.mSessionId = str2;
        TTVideoEngineLog.m256505i("VideoEventOneStorage", "storeSessionId, session id:" + storageContextFromMap.mSessionId);
    }

    public void storeOnePlay(String str, VideoEventOnePlay videoEventOnePlay) {
        if (TextUtils.isEmpty(str)) {
            TTVideoEngineLog.m256505i("VideoEventOneStorage", "storeOnePlay return");
            return;
        }
        TTVideoEngineLog.m256500d("VideoEventOneStorage", "storeOnePlay, vid:" + str);
        StorageContext storageContextFromMap = getStorageContextFromMap(str);
        if (storageContextFromMap.mOnePlay == null) {
            TTVideoEngineLog.m256505i("VideoEventOneStorage", "storeOnePlay new, vid:" + str);
            storageContextFromMap.mOnePlay = videoEventOnePlay;
            return;
        }
        TTVideoEngineLog.m256505i("VideoEventOneStorage", "storeOnePlay store, vid:" + str);
        storeOnePlayInternal(storageContextFromMap.mOnePlay, videoEventOnePlay);
    }

    private void storeOnePlayInternal(VideoEventOnePlay videoEventOnePlay, VideoEventOnePlay videoEventOnePlay2) {
        videoEventOnePlay.et = videoEventOnePlay2.et;
        videoEventOnePlay.videoBufferLength = videoEventOnePlay2.videoBufferLength;
        videoEventOnePlay.audioBufferLength = videoEventOnePlay2.audioBufferLength;
        videoEventOnePlay.leave_reason = videoEventOnePlay2.leave_reason;
        videoEventOnePlay.leave_block_t = videoEventOnePlay2.leave_block_t;
        videoEventOnePlay.leave_method = videoEventOnePlay2.leave_method;
        videoEventOnePlay.server_local_diff = videoEventOnePlay2.server_local_diff;
        videoEventOnePlay.videoAudioGap = videoEventOnePlay2.videoAudioGap;
        if (videoEventOnePlay2.errt != Integer.MIN_VALUE) {
            videoEventOnePlay.errt = videoEventOnePlay2.errt;
        }
        if (videoEventOnePlay2.errc != Integer.MIN_VALUE) {
            videoEventOnePlay.errc = videoEventOnePlay2.errc;
        }
        if (videoEventOnePlay2.merror != null) {
            videoEventOnePlay.merror = videoEventOnePlay2.merror;
        }
        if (videoEventOnePlay2.lastSeekStartT != -2147483648L) {
            videoEventOnePlay.lastSeekStartT = videoEventOnePlay2.lastSeekStartT;
        }
        if (videoEventOnePlay2.lastSeekEndT != -2147483648L) {
            videoEventOnePlay.lastSeekEndT = videoEventOnePlay2.lastSeekEndT;
        }
        if (videoEventOnePlay2.lastBufferStartT != -2147483648L) {
            videoEventOnePlay.lastBufferStartT = videoEventOnePlay2.lastBufferStartT;
        }
        if (videoEventOnePlay2.lastBufferEndT != -2147483648L) {
            videoEventOnePlay.lastBufferEndT = videoEventOnePlay2.lastBufferEndT;
        }
        if (videoEventOnePlay2.lastResolutionStartT != -2147483648L) {
            videoEventOnePlay.lastResolutionStartT = videoEventOnePlay2.lastResolutionStartT;
        }
        if (videoEventOnePlay2.lastResolutionEndT != -2147483648L) {
            videoEventOnePlay.lastResolutionEndT = videoEventOnePlay2.lastResolutionEndT;
        }
        if (videoEventOnePlay2.lastSeekPosition != Integer.MIN_VALUE) {
            videoEventOnePlay.lastSeekPosition = videoEventOnePlay2.lastSeekPosition;
        }
        if (videoEventOnePlay2.lastHijackCode != -1) {
            videoEventOnePlay.lastHijackCode = videoEventOnePlay2.lastHijackCode;
        }
        videoEventOnePlay.bc += videoEventOnePlay2.bc;
        videoEventOnePlay.br += videoEventOnePlay2.br;
        videoEventOnePlay.watchduration += videoEventOnePlay2.watchduration;
        videoEventOnePlay.vps += videoEventOnePlay2.vps;
        videoEventOnePlay.vds += videoEventOnePlay2.vds;
        videoEventOnePlay.bufferAccuT += videoEventOnePlay2.bufferAccuT;
        videoEventOnePlay.mPlayList.addAll(videoEventOnePlay2.mPlayList);
        videoEventOnePlay.mPauseList.addAll(videoEventOnePlay2.mPauseList);
        videoEventOnePlay.mResolutionList.addAll(videoEventOnePlay2.mResolutionList);
        videoEventOnePlay.mPlaySpeedList.addAll(videoEventOnePlay2.mPlaySpeedList);
        videoEventOnePlay.mRadiomodeList.addAll(videoEventOnePlay2.mRadiomodeList);
        videoEventOnePlay.mLoopList.addAll(videoEventOnePlay2.mLoopList);
        videoEventOnePlay.mErrorList.addAll(videoEventOnePlay2.mErrorList);
        videoEventOnePlay.mRebufList.addAll(videoEventOnePlay2.mRebufList);
        videoEventOnePlay.mSeekList.addAll(videoEventOnePlay2.mSeekList);
        videoEventOnePlay.mAVOutsyncList.addAll(videoEventOnePlay2.mAVOutsyncList);
        videoEventOnePlay.mAVOutsyncCount += videoEventOnePlay2.mAVOutsyncCount;
        videoEventOnePlay.dropCount += videoEventOnePlay2.dropCount;
        videoEventOnePlay.loopcount += videoEventOnePlay2.loopcount;
        videoEventOnePlay.switchResolutionCount += videoEventOnePlay2.switchResolutionCount;
        videoEventOnePlay.bufferAccuT += videoEventOnePlay2.bufferAccuT;
        videoEventOnePlay.decoderBufferAccuT += videoEventOnePlay2.decoderBufferAccuT;
        videoEventOnePlay.seekCount += videoEventOnePlay2.seekCount;
        videoEventOnePlay.mBufferTimeout += videoEventOnePlay2.mBufferTimeout;
        videoEventOnePlay.networkTimeout += videoEventOnePlay2.networkTimeout;
        videoEventOnePlay.seek_accu_t += videoEventOnePlay2.seek_accu_t;
    }
}
