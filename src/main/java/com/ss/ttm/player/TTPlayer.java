package com.ss.ttm.player;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Process;
import android.os.RemoteException;
import android.util.Log;
import android.view.Surface;
import com.C1711a;
import com.ss.ttm.player.MediaPlayer;
import java.util.List;
import java.util.Map;

public class TTPlayer {
    public static final String TAG = "TTPlayer";
    private static String mAppPath;
    private static String mCachePath;
    private static String mCrashPath;
    private static ILibraryLoader mDebugLibLoader = new DefaultLibraryLoader(true);
    private static boolean mIsIPCPlayer;
    private static boolean mSetLibraryLoader;
    private static int mSupportSampleRateNB;
    private static int[] mSupportSampleRates;
    private Context mContext;
    private FrameMetadataListener mFrameMetadataListener;
    private long mHandle;
    private long mId;
    private long mMediaDataSource;
    private IPlayerNotifyer mNotifyer;
    private long mNotifyerState = Long.MAX_VALUE;
    private MediaPlayer.OnScreenshotListener mScreenshotListener;
    private int mTracker;

    private static final native void _close(long j);

    private final native long _create(Context context, int i, String str);

    private static final native String _getAppPath();

    private static final native int _getCurrentPosition(long j);

    private static final native double _getDoubleValue(long j, int i, double d);

    private static final native int _getDuration(long j);

    private static final native float _getFloatValue(long j, int i, float f);

    private static final native int _getIntValue(long j, int i, int i2);

    private static final native Object _getJObjectValue(long j, int i);

    private static final native long _getLongValue(long j, int i, long j2);

    private static final native String _getStringValue(long j, int i);

    private static final native int _getVideoHeight(long j);

    private static final native int _getVideoWidth(long j);

    private static final native int _isLooping(long j);

    private static final native int _isPlaying(long j);

    private static final native void _mouseEvent(long j, int i, int i2, int i3);

    private static final native int _pause(long j);

    private static final native int _prepare(long j);

    private static final native void _prevClose(long j);

    private static final native void _registerPlayerInfo();

    private static final native void _release(long j);

    private static final native int _reset(long j);

    private static final native void _rotateCamera(long j, float f, float f2);

    private static final native int _seek(long j, int i);

    private static final native void _setAudioProcessor(long j, AudioProcessor audioProcessor);

    private static final native void _setCacheFile(long j, String str, int i);

    private static final native void _setDataSource(long j, IMediaDataSource iMediaDataSource);

    private static final native void _setDataSource(long j, String str);

    private static final native void _setDataSourceFd(long j, int i);

    private static final native int _setDoubleValue(long j, int i, double d);

    private static final native int _setFloatValue(long j, int i, float f);

    private static final native int _setIntValue(long j, int i, int i2);

    private static final native void _setLoadControl(long j, LoadControl loadControl);

    private static final native int _setLongValue(long j, int i, long j2);

    private static final native void _setLooping(long j, int i);

    private static final native void _setMaskInfo(long j, MaskInfo maskInfo);

    private static final native void _setMediaTransport(long j, MediaTransport mediaTransport);

    private static final native int _setStringValue(long j, int i, String str);

    private static final native void _setSubInfo(long j, SubInfo subInfo);

    private static final native void _setSupportFormatNB(int i);

    private static final native void _setSupprotSampleRates(int[] iArr, int i);

    private static final native int _setSurfaceValue(long j, long j2);

    private static final native int _setVideoSurface(long j, Surface surface);

    private static final native void _setVolume(long j, float f, float f2);

    private static final native int _start(long j);

    private static final native void _stop(long j);

    private static final native void _switchStream(long j, int i, int i2);

    private static final native void _takeScreenshot(long j);

    private static final void checkPlayerModel() {
    }

    public static final String getAppPath() {
        return mAppPath;
    }

    public static final String getCachePath() {
        return mCachePath;
    }

    public static final String getCrashPath() {
        return mCrashPath;
    }

    public static boolean isIPPlayer() {
        return mIsIPCPlayer;
    }

    public static void registerPlayerInfo() {
        _registerPlayerInfo();
    }

    public Context getContext() {
        return this.mContext;
    }

    public final long getHandle() {
        return this.mHandle;
    }

    public long getNativePlayer() {
        return this.mHandle;
    }

    public static int isUsedThreadPool() {
        return TTPlayerConfiger.getValue(24, false) ? 1 : 0;
    }

    public void takeScreenshot() {
        _takeScreenshot(this.mHandle);
    }

    public static int getThreadPoolStackSize() {
        return TTPlayerConfiger.getValue(25, 32);
    }

    public int close() {
        long j = this.mHandle;
        if (j == 0) {
            return -1;
        }
        _close(j);
        return 0;
    }

    /* access modifiers changed from: protected */
    public int pause() {
        long j = this.mHandle;
        if (j == 0) {
            return -1;
        }
        return _pause(j);
    }

    /* access modifiers changed from: protected */
    public int prepare() {
        long j = this.mHandle;
        if (j == 0) {
            return -1;
        }
        return _prepare(j);
    }

    public int prevClose() {
        long j = this.mHandle;
        if (j == 0) {
            return -1;
        }
        _setVideoSurface(j, null);
        return 0;
    }

    /* access modifiers changed from: protected */
    public int reset() {
        long j = this.mHandle;
        if (j == 0) {
            return -1;
        }
        return _reset(j);
    }

    /* access modifiers changed from: protected */
    public int start() {
        long j = this.mHandle;
        if (j == 0) {
            return -1;
        }
        return _start(j);
    }

    /* access modifiers changed from: protected */
    public int stop() {
        long j = this.mHandle;
        if (j == 0) {
            return -1;
        }
        _stop(j);
        return 0;
    }

    private static void detectAudioFormat() {
        if (mSupportSampleRateNB == 0) {
            int[] iArr = new int[AudioFormats.getDefaultSampleRatesNB()];
            mSupportSampleRates = iArr;
            int maxSupportedSampleRates = AudioFormats.getMaxSupportedSampleRates(iArr);
            mSupportSampleRateNB = maxSupportedSampleRates;
            _setSupprotSampleRates(mSupportSampleRates, maxSupportedSampleRates);
        }
    }

    /* access modifiers changed from: protected */
    public void release() {
        this.mNotifyerState = 0;
        long j = this.mHandle;
        if (j != 0) {
            _release(j);
            this.mHandle = 0;
        }
        this.mNotifyer = null;
        this.mScreenshotListener = null;
    }

    static {
        synchronized (TTPlayer.class) {
            TTPlayerLibLoader.loadLibrary();
            try {
                detectAudioFormat();
            } catch (UnsatisfiedLinkError e) {
                String errorInfo = TTPlayerLibLoader.getErrorInfo();
                if (errorInfo != null) {
                    throw new UnsatisfiedLinkError(errorInfo);
                }
                throw e;
            }
        }
    }

    public static final void setCachePath(String str) {
        mCachePath = str;
    }

    public static final void setCrashPath(String str) {
        mCrashPath = str;
    }

    public static void setIsIPPlayer(boolean z) {
        mIsIPCPlayer = z;
    }

    public static final void setTempFileDir(String str) {
        mAppPath = str;
    }

    public void setFrameMetadataListener(FrameMetadataListener frameMetadataListener) {
        this.mFrameMetadataListener = frameMetadataListener;
    }

    public void setNotifyer(IPlayerNotifyer iPlayerNotifyer) {
        this.mNotifyer = iPlayerNotifyer;
    }

    public void setOnScreenshotListener(MediaPlayer.OnScreenshotListener onScreenshotListener) {
        this.mScreenshotListener = onScreenshotListener;
    }

    private static class DefaultLibraryLoader implements ILibraryLoader {
        boolean mLoadLibraryPath;

        public DefaultLibraryLoader(boolean z) {
            this.mLoadLibraryPath = z;
        }

        @Override // com.ss.ttm.player.ILibraryLoader
        public boolean onLoadNativeLibs(List<String> list) {
            for (String str : list) {
                try {
                    if (this.mLoadLibraryPath) {
                        System.load(str);
                    } else {
                        C1711a.m7628a(str);
                    }
                } catch (Throwable th) {
                    String str2 = TTPlayer.TAG;
                    Log.e(str2, "load lib failed = " + th.getMessage());
                    return false;
                }
            }
            return true;
        }
    }

    public Object getObjectValue(int i) {
        return _getJObjectValue(this.mHandle, i);
    }

    public String getStringOption(int i) {
        return _getStringValue(this.mHandle, i);
    }

    public void seekTo(int i) {
        _seek(this.mHandle, i);
    }

    public void setLooping(int i) {
        _setLooping(this.mHandle, i);
    }

    public int setSurfaceValue(long j) {
        return _setSurfaceValue(this.mHandle, j);
    }

    public final void takeScreenshotComplete(Bitmap bitmap) {
        MediaPlayer.OnScreenshotListener onScreenshotListener = this.mScreenshotListener;
        if (onScreenshotListener != null) {
            onScreenshotListener.onTakeScreenShotCompletion(bitmap);
        }
    }

    public void setAudioProcessor(AudioProcessor audioProcessor) {
        long j = this.mHandle;
        if (j != 0) {
            _setAudioProcessor(j, audioProcessor);
        }
    }

    public void setDataSource(IMediaDataSource iMediaDataSource) throws IllegalArgumentException, SecurityException, IllegalStateException {
        long j = this.mHandle;
        if (j != 0) {
            _setDataSource(j, iMediaDataSource);
        }
    }

    public void setDataSourceFd(int i) {
        long j = this.mHandle;
        if (j != 0) {
            _setDataSourceFd(j, i);
        }
    }

    public void setLoadControl(LoadControl loadControl) {
        long j = this.mHandle;
        if (j != 0) {
            _setLoadControl(j, loadControl);
        }
    }

    public void setMaskInfo(MaskInfo maskInfo) {
        long j = this.mHandle;
        if (j != 0) {
            _setMaskInfo(j, maskInfo);
        }
    }

    public void setMediaTransport(MediaTransport mediaTransport) {
        long j = this.mHandle;
        if (j != 0) {
            _setMediaTransport(j, mediaTransport);
        }
    }

    public void setNotifyerState(long j) {
        this.mNotifyerState = j;
        _setIntValue(this.mHandle, 16, (int) j);
        _setLongValue(this.mHandle, 16, j);
    }

    public void setSubInfo(SubInfo subInfo) {
        long j = this.mHandle;
        if (j != 0) {
            _setSubInfo(j, subInfo);
        }
    }

    /* access modifiers changed from: protected */
    public int setVideoSurface(Surface surface) {
        long j = this.mHandle;
        if (j != 0) {
            return _setVideoSurface(j, surface);
        }
        return -1;
    }

    private void create(long j) throws Exception {
        this.mNotifyer = null;
        Context context = this.mContext;
        boolean z = mIsIPCPlayer;
        long _create = _create(context, z ? 1 : 0, mAppPath);
        this.mHandle = _create;
        this.mId = j;
        if (_create == 0) {
            throw new Exception("create native player is fail.");
        }
    }

    public void setDataSource(String str) {
        long j = this.mHandle;
        if (j != 0) {
            _setDataSource(j, str);
        }
    }

    public double getDoubleOption(int i, double d) {
        return _getDoubleValue(this.mHandle, i, d);
    }

    public float getFloatOption(int i, float f) {
        return _getFloatValue(this.mHandle, i, f);
    }

    public void rotateCamera(float f, float f2) {
        _rotateCamera(this.mHandle, f, f2);
    }

    public void setCacheFile(String str, int i) {
        _setCacheFile(this.mHandle, str, i);
    }

    public int setDoubleOption(int i, double d) {
        return _setDoubleValue(this.mHandle, i, d);
    }

    public int setFloatOption(int i, float f) {
        return _setFloatValue(this.mHandle, i, f);
    }

    public int setLongOption(int i, long j) {
        return _setLongValue(this.mHandle, i, j);
    }

    public int setStringOption(int i, String str) {
        return _setStringValue(this.mHandle, i, str);
    }

    public void setVolume(float f, float f2) {
        _setVolume(this.mHandle, f, f2);
    }

    public void switchStream(int i, int i2) {
        _switchStream(this.mHandle, i, i2);
    }

    public TTPlayer(Context context, long j) throws Exception {
        this.mContext = context;
        create(j);
    }

    public long getLongOption(int i, long j) {
        if (i == 50) {
            return this.mHandle;
        }
        return _getLongValue(this.mHandle, i, j);
    }

    public int getIntOption(int i, int i2) {
        if (i == 11) {
            return _getIntValue(this.mHandle, i, i2);
        }
        if (i == 51) {
            return this.mTracker;
        }
        switch (i) {
            case 1:
                return _getDuration(this.mHandle);
            case 2:
                return _getCurrentPosition(this.mHandle);
            case 3:
                return _getVideoWidth(this.mHandle);
            case 4:
                return _getVideoHeight(this.mHandle);
            case 5:
                return _isLooping(this.mHandle);
            case 6:
                return _isPlaying(this.mHandle);
            default:
                return _getIntValue(this.mHandle, i, i2);
        }
    }

    public int setIntOption(int i, int i2) throws RemoteException {
        if (i == 22) {
            if (i2 == 0) {
                Log.i("ttplayer", "will occur anr crash");
            } else if (i2 == 2) {
                Log.i("ttplayer", "will occur native crash");
            } else if (i2 == 1) {
                Process.killProcess(Process.myPid());
                System.exit(0);
                String str = null;
                Log.i("ttplayer", "will occur java crash");
                if (!str.endsWith("java")) {
                    Log.i("ttplayer", "occur java crash end");
                } else {
                    throw new RemoteException("simple crash occur");
                }
            }
        }
        if (i != 111) {
            return _setIntValue(this.mHandle, i, i2);
        }
        int length = TTPlayerKeys.SupportSampleRates.length;
        int[] iArr = new int[TTPlayerKeys.SupportSampleRates.length];
        int i3 = 0;
        for (int i4 = 0; i4 < length; i4++) {
            if (((1 << i4) & i2) == 0) {
                iArr[i3] = TTPlayerKeys.SupportSampleRates[i4];
                i3++;
            }
        }
        _setSupprotSampleRates(iArr, i3);
        return 0;
    }

    public void mouseEvent(int i, int i2, int i3) {
        _mouseEvent(this.mHandle, i, i2, i3);
    }

    public void frameDTSNotify(int i, long j, long j2) {
        try {
            FrameMetadataListener frameMetadataListener = this.mFrameMetadataListener;
            if (frameMetadataListener != null) {
                frameMetadataListener.frameDTSNotify(i, j2, j);
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public final void onLogInfo(int i, int i2, String str) {
        IPlayerNotifyer iPlayerNotifyer = this.mNotifyer;
        if (iPlayerNotifyer != null) {
            try {
                iPlayerNotifyer.handleErrorNotify(this.mId, i, i2, str);
            } catch (Throwable unused) {
            }
        }
    }

    public void updateFrameTerminatedDTS(int i, long j, long j2) {
        try {
            FrameMetadataListener frameMetadataListener = this.mFrameMetadataListener;
            if (frameMetadataListener != null) {
                frameMetadataListener.updateFrameTerminatedDTS(i, j2, j);
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public void onFrameAboutToBeRendered(int i, long j, long j2, Map<Integer, String> map) {
        try {
            FrameMetadataListener frameMetadataListener = this.mFrameMetadataListener;
            if (frameMetadataListener != null) {
                frameMetadataListener.onFrameAboutToBeRendered(i, j, j2, map);
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public void onNotify(int i, int i2, int i3, String str) {
        if (((this.mNotifyerState >> i2) & 1) == 1) {
            try {
                IPlayerNotifyer iPlayerNotifyer = this.mNotifyer;
                if (iPlayerNotifyer != null) {
                    iPlayerNotifyer.handlePlayerNotify(this.mId, i, i2, i3, str);
                }
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }
}
