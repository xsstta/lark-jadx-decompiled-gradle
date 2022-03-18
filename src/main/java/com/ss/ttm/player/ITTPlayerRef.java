package com.ss.ttm.player;

import android.content.Context;
import android.util.Log;
import android.view.Surface;
import com.ss.ttm.player.MediaPlayer;
import com.ss.ttm.utils.HardWareInfo;
import java.util.HashMap;

public abstract class ITTPlayerRef {
    /* access modifiers changed from: protected */
    public abstract void close();

    /* access modifiers changed from: protected */
    public abstract Context getContext();

    /* access modifiers changed from: protected */
    public abstract double getDoubleOption(int i, double d);

    /* access modifiers changed from: protected */
    public abstract float getFloatOption(int i, float f);

    /* access modifiers changed from: protected */
    public abstract int getIntOption(int i, int i2);

    /* access modifiers changed from: protected */
    public abstract int getLifeId();

    /* access modifiers changed from: protected */
    public abstract long getLongOption(int i, long j);

    /* access modifiers changed from: protected */
    public abstract Object getObjectOption(int i);

    /* access modifiers changed from: protected */
    public abstract String getStringOption(int i);

    /* access modifiers changed from: protected */
    public abstract int getType();

    /* access modifiers changed from: protected */
    public void invalid() {
    }

    /* access modifiers changed from: protected */
    public abstract boolean isValid();

    /* access modifiers changed from: protected */
    public abstract void mouseEvent(int i, int i2, int i3);

    /* access modifiers changed from: protected */
    public abstract void pause();

    /* access modifiers changed from: protected */
    public abstract void prepare();

    /* access modifiers changed from: protected */
    public abstract void prevClose();

    /* access modifiers changed from: protected */
    public abstract void release();

    /* access modifiers changed from: protected */
    public abstract void reset();

    /* access modifiers changed from: protected */
    public abstract void rotateCamera(float f, float f2);

    /* access modifiers changed from: protected */
    public abstract void seekTo(int i);

    /* access modifiers changed from: protected */
    public abstract void setAudioProcessor(AudioProcessor audioProcessor);

    /* access modifiers changed from: protected */
    public abstract void setCacheFile(String str, int i);

    /* access modifiers changed from: protected */
    public abstract void setDataSource(IMediaDataSource iMediaDataSource);

    /* access modifiers changed from: protected */
    public abstract void setDataSource(String str);

    /* access modifiers changed from: protected */
    public abstract void setDataSourceFd(int i);

    /* access modifiers changed from: protected */
    public abstract int setDoubleOption(int i, double d);

    /* access modifiers changed from: protected */
    public abstract int setFloatOption(int i, float f);

    /* access modifiers changed from: protected */
    public abstract void setFrameMetadataListener(FrameMetadataListener frameMetadataListener);

    /* access modifiers changed from: protected */
    public abstract int setIntOption(int i, int i2);

    /* access modifiers changed from: protected */
    public abstract void setLoadControl(LoadControl loadControl);

    /* access modifiers changed from: protected */
    public abstract int setLongOption(int i, long j);

    /* access modifiers changed from: protected */
    public abstract void setLooping(int i);

    /* access modifiers changed from: protected */
    public abstract void setMaskInfo(MaskInfo maskInfo);

    /* access modifiers changed from: protected */
    public abstract void setMediaTransport(MediaTransport mediaTransport);

    /* access modifiers changed from: protected */
    public abstract void setNotifyState(long j);

    /* access modifiers changed from: protected */
    public abstract void setOnScreenshotListener(MediaPlayer.OnScreenshotListener onScreenshotListener);

    /* access modifiers changed from: protected */
    public abstract int setStringOption(int i, String str);

    /* access modifiers changed from: protected */
    public abstract void setSubInfo(SubInfo subInfo);

    /* access modifiers changed from: protected */
    public abstract void setSurface(Surface surface);

    /* access modifiers changed from: protected */
    public abstract void setVolume(float f, float f2);

    /* access modifiers changed from: protected */
    public abstract void start();

    /* access modifiers changed from: protected */
    public abstract void stop();

    /* access modifiers changed from: protected */
    public abstract void switchStream(int i, int i2);

    /* access modifiers changed from: protected */
    public abstract void takeScreenshot();

    public static synchronized ITTPlayerRef create(Context context, TTPlayerClient tTPlayerClient, HashMap<Integer, Integer> hashMap) {
        TTPlayerRef tTPlayerRef;
        synchronized (ITTPlayerRef.class) {
            tTPlayerRef = null;
            if (HardWareInfo.getCpuFamily() == 1 && (tTPlayerRef = TTPlayerRef.create(tTPlayerClient, context)) != null && TTPlayerConfiger.isPrintInfo()) {
                Log.i("ttplayer", "---------->ttplayer on<------------");
            }
            if (tTPlayerRef == null) {
                Log.i("ttplayer", TTPlayerConfiger.getValue(16, "not find start service info."));
                if (hashMap == null || hashMap.get(100).intValue() != 1) {
                    if (!TTPlayerConfiger.getValue(7, false) && TTPlayerConfiger.getValue(10, 0) < 3) {
                        TTPlayerConfiger.setValue(7, true);
                    }
                } else if (hashMap.get(7).intValue() == 0 && hashMap.get(10).intValue() < 3) {
                    hashMap.put(7, 1);
                }
            }
        }
        return tTPlayerRef;
    }
}
