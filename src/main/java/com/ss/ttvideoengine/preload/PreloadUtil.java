package com.ss.ttvideoengine.preload;

import com.ss.ttvideoengine.DataLoaderHelper;
import com.ss.ttvideoengine.utils.TTVideoEngineLog;
import java.util.HashMap;
import java.util.concurrent.locks.ReentrantLock;

public class PreloadUtil {
    public long mPlayBufferLowerBound;
    public long mPlayBufferUpperBound;
    private final ReentrantLock mPlayInfoLock = new ReentrantLock();
    private final HashMap<String, PlayInfo> mPlayInfoMap = new HashMap<>();

    /* access modifiers changed from: package-private */
    public static class PlayInfo {
        boolean mCacheEnd;
        long mDuration;
        long mLastPlayPosition;
        long mLastPlayableBuffer;
        boolean mTriggered;
        String mVideoID = "";

        PlayInfo() {
        }
    }

    private void checkPlayBuffer(String str) {
        PlayInfo playInfo = this.mPlayInfoMap.get(str);
        if (playInfo != null) {
            if (playInfo.mLastPlayableBuffer > this.mPlayBufferUpperBound && !playInfo.mTriggered) {
                TTVideoEngineLog.m256500d("PreloadUtil", "trigger preload " + str + " playable buffer is: " + playInfo.mLastPlayableBuffer);
                DataLoaderHelper.getDataLoader().notifyTriggerPreload(playInfo.mLastPlayableBuffer);
                playInfo.mTriggered = true;
            }
            if (playInfo.mCacheEnd || (playInfo.mDuration > 0 && playInfo.mLastPlayableBuffer + playInfo.mLastPlayPosition + 1000 >= playInfo.mDuration)) {
                if (!playInfo.mTriggered) {
                    TTVideoEngineLog.m256500d("PreloadUtil", "cached video trigger preload " + str + " playable buffer is: " + playInfo.mLastPlayableBuffer);
                    DataLoaderHelper.getDataLoader().notifyTriggerPreload(playInfo.mLastPlayableBuffer);
                    playInfo.mTriggered = true;
                }
            } else if (playInfo.mLastPlayableBuffer < this.mPlayBufferLowerBound) {
                long preloadTaskCount = DataLoaderHelper.getDataLoader().getPreloadTaskCount();
                if (playInfo.mTriggered && preloadTaskCount > 0) {
                    cancelPreload("low_buffer", str);
                    playInfo.mTriggered = false;
                }
            }
        }
    }

    public void notifyCacheEnd(String str) {
        this.mPlayInfoLock.lock();
        if (!this.mPlayInfoMap.containsKey(str)) {
            if (this.mPlayInfoMap.size() >= 2) {
                this.mPlayInfoMap.clear();
            }
            this.mPlayInfoMap.put(str, new PlayInfo());
        }
        TTVideoEngineLog.m256500d("PreloadUtil", "key :" + str + " cache end.");
        PlayInfo playInfo = this.mPlayInfoMap.get(str);
        if (playInfo != null) {
            playInfo.mCacheEnd = true;
            if (!playInfo.mTriggered) {
                TTVideoEngineLog.m256500d("PreloadUtil", "cached video trigger preload " + str + " cache end ");
                DataLoaderHelper.getDataLoader().notifyTriggerPreload(playInfo.mLastPlayableBuffer);
                playInfo.mTriggered = true;
            }
        } else {
            TTVideoEngineLog.m256500d("PreloadUtil", "key :" + str + " play info null");
        }
        this.mPlayInfoLock.unlock();
    }

    private void cancelPreload(String str, String str2) {
        TTVideoEngineLog.m256500d("PreloadUtil", "cancel preload because:" + str + " traceId:" + str2);
        DataLoaderHelper.getDataLoader().cancelAllTasks();
        DataLoaderHelper.getDataLoader().notifyPreloadCancelled(str, str2);
    }

    public void updatePlayInfo(int i, String str, String str2, long j) {
        this.mPlayInfoLock.lock();
        if (!this.mPlayInfoMap.containsKey(str2)) {
            if (this.mPlayInfoMap.size() >= 2) {
                this.mPlayInfoMap.clear();
            }
            PlayInfo playInfo = new PlayInfo();
            playInfo.mVideoID = str2;
            this.mPlayInfoMap.put(str2, playInfo);
        }
        PlayInfo playInfo2 = this.mPlayInfoMap.get(str2);
        if (playInfo2 == null) {
            this.mPlayInfoLock.unlock();
            return;
        }
        if (i == 22) {
            playInfo2.mDuration = j;
        } else if (i == 23) {
            playInfo2.mLastPlayPosition = j;
            checkPlayBuffer(str2);
        } else if (i == 25) {
            cancelPreload("buffering", str2);
        } else if (i == 27) {
            playInfo2.mLastPlayableBuffer = j;
            checkPlayBuffer(str2);
        }
        this.mPlayInfoLock.unlock();
    }
}
