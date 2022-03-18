package com.ss.android.lark.watermark.core;

import com.larksuite.framework.thread.CoreThreadPool;
import com.ss.android.lark.watermark.dto.WatermarkInfo;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class WatermarkCache {
    public volatile WatermarkInfo mCache;
    public Map<IWatermarkInfoListener, Object> mListeners = new ConcurrentHashMap();
    private ReadWriteLock mRwDataLock = new ReentrantReadWriteLock();

    public interface IWatermarkInfoListener {
        void onWatermarkChanged(WatermarkInfo watermarkInfo);
    }

    private void onCacheChanged() {
        CoreThreadPool.getSerialTaskHandler().post(new Runnable() {
            /* class com.ss.android.lark.watermark.core.WatermarkCache.RunnableC582731 */

            public void run() {
                for (IWatermarkInfoListener iWatermarkInfoListener : WatermarkCache.this.mListeners.keySet()) {
                    if (WatermarkCache.this.mCache != null) {
                        iWatermarkInfoListener.onWatermarkChanged(WatermarkCache.this.mCache);
                    }
                }
            }
        });
    }

    public WatermarkInfo get() {
        try {
            this.mRwDataLock.readLock().lock();
            return this.mCache;
        } finally {
            this.mRwDataLock.readLock().unlock();
        }
    }

    public void clear() {
        try {
            this.mRwDataLock.writeLock().lock();
            this.mCache = null;
        } finally {
            this.mRwDataLock.writeLock().unlock();
        }
    }

    public void removeWatermarkInfoListener(IWatermarkInfoListener iWatermarkInfoListener) {
        this.mListeners.remove(iWatermarkInfoListener);
    }

    public void addWatermarkInfoListener(IWatermarkInfoListener iWatermarkInfoListener) {
        this.mListeners.put(iWatermarkInfoListener, new Object());
    }

    /* JADX INFO: finally extract failed */
    public void update(WatermarkInfo watermarkInfo) {
        try {
            this.mRwDataLock.writeLock().lock();
            this.mCache = watermarkInfo;
            this.mRwDataLock.writeLock().unlock();
            onCacheChanged();
        } catch (Throwable th) {
            this.mRwDataLock.writeLock().unlock();
            throw th;
        }
    }
}
