package com.ss.ttm.player;

import android.content.Context;
import android.os.RemoteException;
import android.view.Surface;
import com.ss.ttm.player.MediaPlayer;

public class TTPlayerRef extends ITTPlayerRef implements IPlayerNotifyer {
    private static final String TAG = "TTPlayerRef";
    private static String mAppPath;
    private static String mLoadErr;
    private TTPlayerClient mClient;
    private Context mContext;
    private long mId = System.currentTimeMillis();
    private TTPlayer mPlayer;

    @Override // com.ss.ttm.player.ITTPlayerRef
    public int getType() {
        return 1;
    }

    @Override // com.ss.ttm.player.ITTPlayerRef
    public Context getContext() {
        return this.mContext;
    }

    @Override // com.ss.ttm.player.ITTPlayerRef
    public void close() {
        this.mPlayer.close();
    }

    public long getNativeObject() {
        return this.mPlayer.getNativePlayer();
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.ttm.player.ITTPlayerRef
    public boolean isValid() {
        if (this.mPlayer == null) {
            return false;
        }
        return true;
    }

    @Override // com.ss.ttm.player.ITTPlayerRef
    public void pause() {
        this.mPlayer.pause();
    }

    @Override // com.ss.ttm.player.ITTPlayerRef
    public void prepare() {
        this.mPlayer.prepare();
    }

    @Override // com.ss.ttm.player.ITTPlayerRef
    public void prevClose() {
        this.mPlayer.prevClose();
    }

    @Override // com.ss.ttm.player.ITTPlayerRef
    public void reset() {
        this.mPlayer.reset();
    }

    @Override // com.ss.ttm.player.ITTPlayerRef
    public void start() {
        this.mPlayer.start();
    }

    @Override // com.ss.ttm.player.ITTPlayerRef
    public void stop() {
        this.mPlayer.stop();
    }

    @Override // com.ss.ttm.player.ITTPlayerRef
    public void takeScreenshot() {
        this.mPlayer.takeScreenshot();
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.ttm.player.ITTPlayerRef
    public int getLifeId() {
        return this.mPlayer.getIntOption(35, -1);
    }

    @Override // com.ss.ttm.player.ITTPlayerRef
    public void release() {
        TTPlayer tTPlayer = this.mPlayer;
        this.mPlayer = null;
        tTPlayer.release();
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.ttm.player.ITTPlayerRef
    public Object getObjectOption(int i) {
        return this.mPlayer.getObjectValue(i);
    }

    @Override // com.ss.ttm.player.ITTPlayerRef
    public String getStringOption(int i) {
        return this.mPlayer.getStringOption(i);
    }

    @Override // com.ss.ttm.player.ITTPlayerRef
    public void seekTo(int i) {
        this.mPlayer.seekTo(i);
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.ttm.player.ITTPlayerRef
    public void setAudioProcessor(AudioProcessor audioProcessor) {
        this.mPlayer.setAudioProcessor(audioProcessor);
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.ttm.player.ITTPlayerRef
    public void setDataSource(IMediaDataSource iMediaDataSource) {
        this.mPlayer.setDataSource(iMediaDataSource);
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.ttm.player.ITTPlayerRef
    public void setDataSourceFd(int i) {
        this.mPlayer.setDataSourceFd(i);
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.ttm.player.ITTPlayerRef
    public void setFrameMetadataListener(FrameMetadataListener frameMetadataListener) {
        this.mPlayer.setFrameMetadataListener(frameMetadataListener);
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.ttm.player.ITTPlayerRef
    public void setLoadControl(LoadControl loadControl) {
        this.mPlayer.setLoadControl(loadControl);
    }

    @Override // com.ss.ttm.player.ITTPlayerRef
    public void setLooping(int i) {
        this.mPlayer.setLooping(i);
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.ttm.player.ITTPlayerRef
    public void setMaskInfo(MaskInfo maskInfo) {
        this.mPlayer.setMaskInfo(maskInfo);
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.ttm.player.ITTPlayerRef
    public void setMediaTransport(MediaTransport mediaTransport) {
        this.mPlayer.setMediaTransport(mediaTransport);
    }

    @Override // com.ss.ttm.player.ITTPlayerRef
    public void setNotifyState(long j) {
        this.mPlayer.setNotifyerState(j);
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.ttm.player.ITTPlayerRef
    public void setOnScreenshotListener(MediaPlayer.OnScreenshotListener onScreenshotListener) {
        this.mPlayer.setOnScreenshotListener(onScreenshotListener);
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.ttm.player.ITTPlayerRef
    public void setSubInfo(SubInfo subInfo) {
        this.mPlayer.setSubInfo(subInfo);
    }

    @Override // com.ss.ttm.player.ITTPlayerRef
    public void setSurface(Surface surface) {
        this.mPlayer.setVideoSurface(surface);
    }

    public TTPlayerRef(Context context) {
        this.mContext = context;
    }

    @Override // com.ss.ttm.player.ITTPlayerRef
    public void setDataSource(String str) {
        this.mPlayer.setDataSource(str);
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.ttm.player.ITTPlayerRef
    public double getDoubleOption(int i, double d) {
        return this.mPlayer.getDoubleOption(i, d);
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.ttm.player.ITTPlayerRef
    public float getFloatOption(int i, float f) {
        return this.mPlayer.getFloatOption(i, f);
    }

    @Override // com.ss.ttm.player.ITTPlayerRef
    public int getIntOption(int i, int i2) {
        return this.mPlayer.getIntOption(i, i2);
    }

    @Override // com.ss.ttm.player.ITTPlayerRef
    public long getLongOption(int i, long j) {
        return this.mPlayer.getLongOption(i, j);
    }

    @Override // com.ss.ttm.player.ITTPlayerRef
    public void rotateCamera(float f, float f2) {
        this.mPlayer.rotateCamera(f, f2);
    }

    @Override // com.ss.ttm.player.ITTPlayerRef
    public void setCacheFile(String str, int i) {
        this.mPlayer.setCacheFile(str, i);
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.ttm.player.ITTPlayerRef
    public int setDoubleOption(int i, double d) {
        return this.mPlayer.setDoubleOption(i, d);
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.ttm.player.ITTPlayerRef
    public int setFloatOption(int i, float f) {
        return this.mPlayer.setFloatOption(i, f);
    }

    @Override // com.ss.ttm.player.ITTPlayerRef
    public int setLongOption(int i, long j) {
        return this.mPlayer.setLongOption(i, j);
    }

    @Override // com.ss.ttm.player.ITTPlayerRef
    public int setStringOption(int i, String str) {
        return this.mPlayer.setStringOption(i, str);
    }

    @Override // com.ss.ttm.player.ITTPlayerRef
    public void setVolume(float f, float f2) {
        this.mPlayer.setVolume(f, f2);
    }

    @Override // com.ss.ttm.player.ITTPlayerRef
    public void switchStream(int i, int i2) {
        this.mPlayer.switchStream(i, i2);
    }

    @Override // com.ss.ttm.player.ITTPlayerRef
    public int setIntOption(int i, int i2) {
        try {
            return this.mPlayer.setIntOption(i, i2);
        } catch (RemoteException e) {
            e.printStackTrace();
            return -1;
        }
    }

    public static final synchronized TTPlayerRef create(TTPlayerClient tTPlayerClient, Context context) {
        TTPlayerRef tTPlayerRef;
        StringBuffer stringBuffer;
        String str;
        synchronized (TTPlayerRef.class) {
            if (mAppPath == null) {
                mAppPath = TTPlayerConfiger.getAppFileCachePath(context);
                try {
                    if (TTPlayer.getAppPath() == null) {
                        TTPlayer.setTempFileDir(mAppPath);
                    }
                } catch (UnsatisfiedLinkError e) {
                    mLoadErr = e.getMessage();
                }
            }
            if (mLoadErr == null) {
                tTPlayerRef = new TTPlayerRef(context);
                tTPlayerRef.mClient = tTPlayerClient;
                try {
                    TTPlayer tTPlayer = new TTPlayer(context, tTPlayerRef.mId);
                    tTPlayerRef.mPlayer = tTPlayer;
                    tTPlayer.setNotifyer(tTPlayerRef);
                } catch (Throwable th) {
                    str = th.toString();
                }
            } else {
                throw new UnsatisfiedLinkError(mLoadErr);
            }
        }
        return tTPlayerRef;
        stringBuffer.append(th.toString());
        stringBuffer.append(",player:");
        stringBuffer.append(str);
        throw new RuntimeException(stringBuffer.toString());
    }

    @Override // com.ss.ttm.player.ITTPlayerRef
    public void mouseEvent(int i, int i2, int i3) {
        this.mPlayer.mouseEvent(i, i2, i3);
    }

    @Override // com.ss.ttm.player.IPlayerNotifyer
    public void handleErrorNotify(long j, int i, int i2, String str) {
        this.mClient.onPlayLogInfo(i, i2, str);
    }

    @Override // com.ss.ttm.player.IPlayerNotifyer
    public void handlePlayerNotify(long j, int i, int i2, int i3, String str) {
        this.mClient.onPlayerNotify(i, i2, i3, str);
    }
}
