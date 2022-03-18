package com.ss.ttm.player;

import android.content.Context;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.ParcelFileDescriptor;
import android.os.PowerManager;
import android.util.Log;
import android.view.Surface;
import android.view.SurfaceHolder;
import com.bytedance.platform.godzilla.thread.p873a.C20341a;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.ss.android.lark.mm.module.list.control.MmListControl;
import com.ss.ttm.net.AVResolver;
import com.ss.ttm.player.MediaPlayer;
import com.ss.ttm.utils.AVErrorInfo;
import com.ss.ttm.utils.AVLogger;
import com.ss.ttm.utils.AVTime;
import com.ss.ttvideoengine.log.IVideoEventLogger;
import java.io.FileDescriptor;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class TTPlayerClient extends MediaPlayerClient implements Handler.Callback, ISurfaceListener {
    public static final String TAG = "TTPlayerClient";
    private String mBufferingInfo;
    private TTSurfaceCallback mCallback;
    private HashMap<Integer, Integer> mConfigParams;
    private Context mContext;
    private int mCrashType;
    private StringBuilder mCrashedInfo;
    private int mDisablePlayerStayAwake;
    private int mErrorCode;
    private Handler mHandler;
    private final Object mHandlerLocker = new Object();
    private long mListenerState = 0;
    private LinkedList<String> mLogInfo = new LinkedList<>();
    private MediaPlayer.OnLogListener mLogListener;
    private int mMediaCodecStopTimeOutMs;
    private MediaPlayer.OnBufferingUpdateListener mOnBufferingUpdateListener;
    private MediaPlayer.OnCompletionListener mOnCompletionListener;
    private MediaPlayer.OnErrorListener mOnErrorListener;
    private MediaPlayer.OnExternInfoListener mOnExternInfoListener;
    private MediaPlayer.OnInfoListener mOnInfoListener;
    private MediaPlayer.OnPreparedListener mOnPreparedListener;
    private MediaPlayer.onSARChangedListener mOnSARChangedListener;
    private MediaPlayer.OnSeekCompleteListener mOnSeekCompleteListener;
    private MediaPlayer.OnVideoSizeChangedListener mOnVideoSizeChangedListener;
    private int mPlayLifeId = -1;
    public ITTPlayerRef mPlayer;
    public final ReentrantReadWriteLock.ReadLock mReadLock;
    private final ReentrantReadWriteLock mReadWritedLock;
    private volatile boolean mRealsedSurface = false;
    private final ReentrantLock mReentrantLock = new ReentrantLock();
    private final ReentrantLock mReentrantLockInRtc = new ReentrantLock();
    private int mRtcPlay;
    private boolean mScreenOnWhilePlaying;
    private boolean mSeekComplete = true;
    private boolean mStayAwake;
    private Surface mSurface;
    private SurfaceHolder mSurfaceHolder;
    private String mUri;
    private String mVoiceInfo;
    private PowerManager.WakeLock mWakeLock;
    private MediaPlayer mWrapper;
    private final ReentrantReadWriteLock.WriteLock mWriteLock;

    public static Thread new_insert_after_java_lang_Thread_by_knot(Thread thread) {
        return C20341a.m74147a() ? new Thread(thread.getThreadGroup(), thread, thread.getName(), (long) C20341a.f49621b) : thread;
    }

    @Override // com.ss.ttm.player.MediaPlayerClient
    public int getSelectedTrack(int i) {
        if (i == 2) {
            return 1;
        }
        if (i == 1) {
            return 0;
        }
        return i == 4 ? 2 : -1;
    }

    static {
        TTVersion.saveVersionInfo();
    }

    @Override // com.ss.ttm.player.MediaPlayerClient
    public String getDataSource() {
        return this.mUri;
    }

    @Override // com.ss.ttm.player.MediaPlayerClient
    public void prepare() {
        prepareAsync();
    }

    public boolean isValid() {
        ITTPlayerRef iTTPlayerRef = this.mPlayer;
        if (iTTPlayerRef == null || !iTTPlayerRef.isValid()) {
            return false;
        }
        return true;
    }

    public void close() {
        this.mRealsedSurface = true;
        this.mReadLock.lock();
        try {
            if (isValid()) {
                this.mPlayer.close();
            }
        } finally {
            this.mReadLock.unlock();
        }
    }

    @Override // com.ss.ttm.player.MediaPlayerClient
    public int getCurrentPosition() {
        this.mReadLock.lock();
        try {
            int i = 0;
            if (isValid()) {
                i = this.mPlayer.getIntOption(2, 0);
            }
            return i;
        } finally {
            this.mReadLock.unlock();
        }
    }

    @Override // com.ss.ttm.player.MediaPlayerClient
    public int getDuration() {
        this.mReadLock.lock();
        try {
            int i = 0;
            if (isValid()) {
                i = this.mPlayer.getIntOption(1, 0);
            }
            return i;
        } finally {
            this.mReadLock.unlock();
        }
    }

    @Override // com.ss.ttm.player.MediaPlayerClient
    public int getType() {
        int i;
        this.mReadLock.lock();
        try {
            if (isValid()) {
                i = this.mPlayer.getType();
            } else {
                i = 0;
            }
            return i;
        } finally {
            this.mReadLock.unlock();
        }
    }

    @Override // com.ss.ttm.player.MediaPlayerClient
    public int getVideoHeight() {
        this.mReadLock.lock();
        try {
            int i = 0;
            if (isValid()) {
                i = this.mPlayer.getIntOption(4, 0);
            }
            return i;
        } finally {
            this.mReadLock.unlock();
        }
    }

    @Override // com.ss.ttm.player.MediaPlayerClient
    public int getVideoWidth() {
        this.mReadLock.lock();
        try {
            int i = 0;
            if (isValid()) {
                i = this.mPlayer.getIntOption(3, 0);
            }
            return i;
        } finally {
            this.mReadLock.unlock();
        }
    }

    public void updateSurfaceScreenOn() {
        boolean z;
        SurfaceHolder surfaceHolder = this.mSurfaceHolder;
        if (surfaceHolder != null && this.mDisablePlayerStayAwake == 0) {
            if (!this.mScreenOnWhilePlaying || !this.mStayAwake) {
                z = false;
            } else {
                z = true;
            }
            surfaceHolder.setKeepScreenOn(z);
        }
    }

    @Override // com.ss.ttm.player.MediaPlayerClient
    public MediaPlayer.TrackInfo[] getTrackInfo() {
        return new MediaPlayer.TrackInfo[]{new MediaPlayer.TrackInfo(0, new MediaFormat()), new MediaPlayer.TrackInfo(1, new MediaFormat()), new MediaPlayer.TrackInfo(2, new MediaFormat())};
    }

    @Override // com.ss.ttm.player.MediaPlayerClient
    public int getVideoType() {
        this.mReadLock.lock();
        try {
            int i = 0;
            if (isValid()) {
                i = this.mPlayer.getIntOption(11, 0);
            }
            return i;
        } finally {
            this.mReadLock.unlock();
        }
    }

    @Override // com.ss.ttm.player.MediaPlayerClient
    public boolean isLooping() {
        this.mReadLock.lock();
        try {
            boolean z = false;
            if (isValid() && this.mPlayer.getIntOption(5, 0) == 1) {
                z = true;
            }
            return z;
        } finally {
            this.mReadLock.unlock();
        }
    }

    @Override // com.ss.ttm.player.MediaPlayerClient
    public boolean isMute() {
        this.mReadLock.lock();
        try {
            boolean z = false;
            if (isValid() && this.mPlayer.getIntOption(12, 0) == 1) {
                z = true;
            }
            return z;
        } finally {
            this.mReadLock.unlock();
        }
    }

    @Override // com.ss.ttm.player.MediaPlayerClient
    public boolean isPlaying() {
        this.mReadLock.lock();
        try {
            boolean z = false;
            if (isValid() && this.mPlayer.getIntOption(6, 0) == 1) {
                z = true;
            }
            return z;
        } finally {
            this.mReadLock.unlock();
        }
    }

    /* JADX INFO: finally extract failed */
    @Override // com.ss.ttm.player.MediaPlayerClient
    public void pause() {
        this.mReadLock.lock();
        try {
            if (isValid()) {
                this.mPlayer.pause();
            }
            this.mReadLock.unlock();
            stayAwake(false);
        } catch (Throwable th) {
            this.mReadLock.unlock();
            throw th;
        }
    }

    @Override // com.ss.ttm.player.MediaPlayerClient
    public void prepareAsync() {
        this.mReadLock.lock();
        try {
            if (isValid()) {
                this.mErrorCode = 0;
                this.mLogInfo.clear();
                if (this.mRealsedSurface) {
                    this.mPlayer.setSurface(this.mSurfaceHolder.getSurface());
                    this.mRealsedSurface = false;
                }
                this.mPlayer.prepare();
                updateLifeId();
            }
        } finally {
            this.mReadLock.unlock();
        }
    }

    /* JADX INFO: finally extract failed */
    @Override // com.ss.ttm.player.MediaPlayerClient
    public void prevClose() {
        this.mRealsedSurface = true;
        SurfaceHolder surfaceHolder = this.mSurfaceHolder;
        if (surfaceHolder != null) {
            surfaceHolder.removeCallback(this.mCallback);
        }
        this.mReadLock.lock();
        try {
            if (isValid()) {
                this.mPlayer.prevClose();
            }
            this.mReadLock.unlock();
            this.mSurface = null;
        } catch (Throwable th) {
            this.mReadLock.unlock();
            throw th;
        }
    }

    /* JADX INFO: finally extract failed */
    @Override // com.ss.ttm.player.MediaPlayerClient
    public void releaseAsync() {
        this.mRealsedSurface = true;
        SurfaceHolder surfaceHolder = this.mSurfaceHolder;
        if (surfaceHolder != null) {
            surfaceHolder.removeCallback(this.mCallback);
        }
        this.mReadLock.lock();
        try {
            if (isValid()) {
                this.mPlayer.prevClose();
            }
            this.mReadLock.unlock();
            this.mSurface = null;
            new_insert_after_java_lang_Thread_by_knot(new Thread(new Runnable() {
                /* class com.ss.ttm.player.TTPlayerClient.RunnableC654161 */

                public void run() {
                    TTPlayerClient.this.release();
                }
            })).start();
        } catch (Throwable th) {
            this.mReadLock.unlock();
            throw th;
        }
    }

    @Override // com.ss.ttm.player.MediaPlayerClient
    public void reset() {
        this.mWriteLock.lock();
        try {
            if (isValid()) {
                this.mPlayer.reset();
                SurfaceHolder surfaceHolder = this.mSurfaceHolder;
                if (surfaceHolder != null) {
                    this.mPlayer.setSurface(surfaceHolder.getSurface());
                }
                this.mHandler.removeCallbacksAndMessages(null);
                this.mErrorCode = 0;
                this.mLogInfo.clear();
                updateLifeId();
            }
        } finally {
            this.mWriteLock.unlock();
        }
    }

    /* JADX INFO: finally extract failed */
    @Override // com.ss.ttm.player.MediaPlayerClient
    public void start() {
        this.mReadLock.lock();
        try {
            if (isValid()) {
                this.mPlayer.start();
                updateLifeId();
                this.mRtcPlay = this.mPlayer.getIntOption(800, 0);
            }
            this.mReadLock.unlock();
            stayAwake(true);
        } catch (Throwable th) {
            this.mReadLock.unlock();
            throw th;
        }
    }

    /* JADX INFO: finally extract failed */
    @Override // com.ss.ttm.player.MediaPlayerClient
    public void stop() {
        this.mReadLock.lock();
        try {
            if (isValid()) {
                this.mPlayer.stop();
            }
            this.mReadLock.unlock();
            stayAwake(false);
        } catch (Throwable th) {
            this.mReadLock.unlock();
            throw th;
        }
    }

    /* access modifiers changed from: protected */
    public void updateLifeId() {
        try {
            this.mReentrantLock.lock();
            this.mPlayLifeId = this.mPlayer.getLifeId();
        } finally {
            if (this.mReentrantLock.isLocked()) {
                this.mReentrantLock.unlock();
            }
        }
    }

    private String getPlayerErrorInfo() {
        try {
            StringBuilder sb = new StringBuilder();
            LinkedList<String> linkedList = this.mLogInfo;
            if (!((linkedList == null || linkedList.size() <= 0) && this.mBufferingInfo == null && this.mVoiceInfo == null)) {
                AVErrorInfo.setupErrorInfo(this.mContext, sb, "error", "play error", this.mUri);
                Iterator<String> it = this.mLogInfo.iterator();
                while (it.hasNext()) {
                    sb.append(it.next());
                    sb.append("\n");
                }
                String str = this.mBufferingInfo;
                if (str != null) {
                    sb.append(str);
                    sb.append("\n");
                    this.mBufferingInfo = null;
                }
                String str2 = this.mVoiceInfo;
                if (str2 != null) {
                    sb.append(str2);
                    sb.append("\n");
                    this.mVoiceInfo = null;
                }
            }
            return sb.toString();
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX INFO: finally extract failed */
    @Override // com.ss.ttm.player.MediaPlayerClient
    public void release() {
        String playerErrorInfo;
        stayAwake(false);
        updateSurfaceScreenOn();
        this.mWriteLock.lock();
        try {
            ITTPlayerRef iTTPlayerRef = this.mPlayer;
            this.mPlayer = null;
            this.mPlayLifeId = -1;
            if (iTTPlayerRef != null) {
                iTTPlayerRef.release();
            }
            this.mWriteLock.unlock();
            SurfaceHolder surfaceHolder = this.mSurfaceHolder;
            if (surfaceHolder != null) {
                surfaceHolder.removeCallback(this.mCallback);
                this.mSurfaceHolder = null;
                this.mRealsedSurface = true;
            }
            this.mSurface = null;
            synchronized (this.mHandlerLocker) {
                Handler handler = this.mHandler;
                if (handler != null) {
                    handler.removeCallbacksAndMessages(null);
                    this.mHandler = null;
                }
            }
            if (!(this.mLogListener == null || (playerErrorInfo = getPlayerErrorInfo()) == null || playerErrorInfo.length() <= 0)) {
                this.mLogListener.onLogInfo(this.mWrapper, playerErrorInfo);
            }
            this.mContext = null;
        } catch (Throwable th) {
            this.mWriteLock.unlock();
            throw th;
        }
    }

    private String getPlayerCrashedInfo() {
        Context context;
        String crashFileContext;
        String crashFileContext2;
        int value = TTPlayerConfiger.getValue(18, 1);
        StringBuilder sb = new StringBuilder();
        ITTPlayerRef iTTPlayerRef = this.mPlayer;
        if (iTTPlayerRef == null) {
            context = this.mContext;
        } else {
            context = iTTPlayerRef.getContext();
        }
        if (context == null) {
            return "context is null";
        }
        if (value > 1) {
            String existsCrashFilePath = TTCrashUtil.existsCrashFilePath(context);
            if (existsCrashFilePath == null || (crashFileContext2 = TTCrashUtil.getCrashFileContext(context, existsCrashFilePath, sb)) == null) {
                AVErrorInfo.setupPhoneInfo(context, sb);
            } else {
                TTCrashUtil.deleteCrashFile(this.mContext, existsCrashFilePath);
                this.mCrashType = 1;
                if (TTPlayerConfiger.getValue(5, false)) {
                    Log.i("ttplayer", "<TTPlayerIPClient,getCrashedInfo>find breakpad file");
                }
                return crashFileContext2;
            }
        }
        String value2 = TTPlayerConfiger.getValue(19, (String) null);
        if (value2 == null || (crashFileContext = TTCrashUtil.getCrashFileContext(this.mContext, value2, sb)) == null) {
            sb.append("\ncreate time:" + AVTime.getFormatNow());
            sb.append("\nport version:");
            sb.append(value);
            sb.append("\nstart service info:");
            sb.append(TTPlayerConfiger.getValue(16, "not find service start info"));
            sb.append("\nstop service info:");
            sb.append(TTPlayerConfiger.getValue(12, "not find service stop info"));
            sb.append("\ncrash:");
            sb.append(TTPlayerConfiger.getValue(7, false));
            sb.append("\nsdk info:");
            sb.append(TTPlayerConfiger.getValue(15, "not find sdk info"));
            sb.append("\ntimeout count:");
            sb.append(TTPlayerConfiger.getValue(10, -1));
            sb.append("\nforeground:");
            sb.append(TTPlayerConfiger.getValue(21, -1));
            sb.append("\non screen:");
            sb.append(TTPlayerConfiger.getValue(22, -1));
            sb.append("\n battery info:");
            sb.append(TTPlayerConfiger.getValue(23, "not find"));
            sb.append("\nurl:");
            sb.append(this.mUri);
            sb.append("\ncrash:\r\n");
            sb.append((CharSequence) this.mCrashedInfo);
            this.mCrashType = 0;
            if (value <= 1) {
                return sb.toString();
            }
            if (TTPlayerConfiger.getValue(5, false)) {
                Log.i("ttplayer", "<TTPlayerIPClient,getCrashedInfo>" + sb.toString());
            }
            return TTCrashUtil.getBase64SampleCrash(sb.toString());
        }
        TTCrashUtil.deleteCrashFile(this.mContext, value2);
        this.mCrashType = 1;
        if (TTPlayerConfiger.getValue(5, false)) {
            Log.i("ttplayer", "<TTPlayerIPClient,getCrashedInfo>find breakpad file");
        }
        return crashFileContext;
    }

    @Override // com.ss.ttm.player.MediaPlayerClient
    public void setOnLogListener(MediaPlayer.OnLogListener onLogListener) {
        this.mLogListener = onLogListener;
    }

    @Override // com.ss.ttm.player.ISurfaceListener
    public void onSurfaceChanged(SurfaceHolder surfaceHolder) {
        AVLogger.m256497k(TAG, "surface is change");
    }

    private void sendSeekCompleted(int i) {
        MediaPlayer.OnSeekCompleteListener onSeekCompleteListener;
        if (!this.mSeekComplete && (onSeekCompleteListener = this.mOnSeekCompleteListener) != null) {
            this.mSeekComplete = true;
            if (i >= this.mPlayLifeId) {
                onSeekCompleteListener.onSeekComplete(this.mWrapper);
            }
        }
    }

    public Object getObjectOption(int i) {
        Object obj;
        this.mReadLock.lock();
        try {
            if (isValid()) {
                obj = this.mPlayer.getObjectOption(i);
            } else {
                obj = null;
            }
            return obj;
        } finally {
            this.mReadLock.unlock();
        }
    }

    public boolean handleMessage(Message message) {
        String str;
        int i = message.arg2;
        int i2 = message.what;
        int i3 = message.arg1;
        if (message.obj instanceof String) {
            str = (String) message.obj;
        } else {
            str = null;
        }
        handleNotify(i, i2, i3, str);
        return true;
    }

    /* access modifiers changed from: protected */
    public void onCrashedInfo(String str) {
        if (this.mCrashedInfo.length() < 1024) {
            StringBuilder sb = this.mCrashedInfo;
            sb.append(str);
            sb.append("\n");
        }
    }

    @Override // com.ss.ttm.player.MediaPlayerClient
    public void seekTo(int i) {
        this.mReadLock.lock();
        try {
            if (isValid()) {
                this.mSeekComplete = false;
                this.mPlayer.seekTo(i);
            }
        } finally {
            this.mReadLock.unlock();
        }
    }

    @Override // com.ss.ttm.player.MediaPlayerClient
    public void selectTrack(int i) {
        this.mReadLock.lock();
        ITTPlayerRef iTTPlayerRef = this.mPlayer;
        if (iTTPlayerRef != null && i == 0) {
            iTTPlayerRef.setIntOption(261, 0);
        }
        this.mReadLock.unlock();
    }

    public void setAudioProcessor(AudioProcessor audioProcessor) {
        this.mReadLock.lock();
        try {
            if (isValid()) {
                this.mPlayer.setAudioProcessor(audioProcessor);
            }
        } finally {
            this.mReadLock.unlock();
        }
    }

    public void setDataSource(FileDescriptor fileDescriptor) throws IOException {
        ParcelFileDescriptor dup = ParcelFileDescriptor.dup(fileDescriptor);
        try {
            this.mPlayer.setDataSourceFd(dup.getFd());
        } finally {
            if (dup != null) {
                dup.close();
            }
        }
    }

    @Override // com.ss.ttm.player.MediaPlayerClient
    public void setFrameMetadataListener(FrameMetadataListener frameMetadataListener) {
        this.mReadLock.lock();
        try {
            if (isValid()) {
                this.mPlayer.setFrameMetadataListener(frameMetadataListener);
            }
        } finally {
            this.mReadLock.unlock();
        }
    }

    public void setLoadControl(LoadControl loadControl) {
        this.mReadLock.lock();
        try {
            if (isValid()) {
                this.mPlayer.setLoadControl(loadControl);
            }
        } finally {
            this.mReadLock.unlock();
        }
    }

    public void setMaskInfo(MaskInfo maskInfo) {
        this.mReadLock.lock();
        try {
            if (isValid()) {
                this.mPlayer.setMaskInfo(maskInfo);
            }
        } finally {
            this.mReadLock.unlock();
        }
    }

    @Override // com.ss.ttm.player.MediaPlayerClient
    public void setMediaTransport(MediaTransport mediaTransport) {
        this.mReadLock.lock();
        try {
            if (isValid()) {
                this.mPlayer.setMediaTransport(mediaTransport);
            }
        } finally {
            this.mReadLock.unlock();
        }
    }

    @Override // com.ss.ttm.player.MediaPlayerClient
    public void setPanoVideoControlModel(int i) {
        this.mReadLock.lock();
        try {
            if (isValid()) {
                this.mPlayer.setIntOption(11, i);
            }
        } finally {
            this.mReadLock.unlock();
        }
    }

    @Override // com.ss.ttm.player.MediaPlayerClient
    public void setScreenOnWhilePlaying(boolean z) {
        if (this.mScreenOnWhilePlaying != z) {
            if (z && this.mSurfaceHolder == null) {
                Log.w(TAG, "setScreenOnWhilePlaying(true) is ineffective without a SurfaceHolder");
            }
            this.mScreenOnWhilePlaying = z;
            updateSurfaceScreenOn();
        }
    }

    public void setSubInfo(SubInfo subInfo) {
        this.mReadLock.lock();
        try {
            if (isValid()) {
                this.mPlayer.setSubInfo(subInfo);
            }
        } finally {
            this.mReadLock.unlock();
        }
    }

    @Override // com.ss.ttm.player.MediaPlayerClient
    public void setSurface(Surface surface) {
        this.mReadLock.lock();
        try {
            if (isValid()) {
                this.mSurface = surface;
                this.mPlayer.setSurface(surface);
            }
        } finally {
            this.mReadLock.unlock();
        }
    }

    private void sendCompletioned(int i) {
        try {
            this.mReentrantLock.lock();
            MediaPlayer.OnCompletionListener onCompletionListener = this.mOnCompletionListener;
            if (onCompletionListener != null && i >= this.mPlayLifeId) {
                onCompletionListener.onCompletion(this.mWrapper);
            }
        } finally {
            if (this.mReentrantLock.isLocked()) {
                this.mReentrantLock.unlock();
            }
        }
    }

    private void stayAwake(boolean z) {
        PowerManager.WakeLock wakeLock = this.mWakeLock;
        if (wakeLock != null) {
            if (z && !wakeLock.isHeld()) {
                this.mWakeLock.acquire();
            } else if (!z && this.mWakeLock.isHeld()) {
                this.mWakeLock.release();
            }
        }
        this.mStayAwake = z;
        updateSurfaceScreenOn();
    }

    @Override // com.ss.ttm.player.MediaPlayerClient
    public void deselectTrack(int i) {
        this.mReadLock.lock();
        ITTPlayerRef iTTPlayerRef = this.mPlayer;
        if (iTTPlayerRef != null && i == 0) {
            iTTPlayerRef.setIntOption(261, 1);
        } else if (iTTPlayerRef != null) {
            iTTPlayerRef.setIntOption(65, (i << 8) | 0);
        }
        this.mReadLock.unlock();
    }

    @Override // com.ss.ttm.player.MediaPlayerClient
    public String getStringOption(int i) {
        if (i == 5001) {
            return getPlayerCrashedInfo();
        }
        String str = null;
        if (i == 5002) {
            LinkedList<String> linkedList = this.mLogInfo;
            if (linkedList == null || linkedList.size() == 0) {
                return null;
            }
            return getPlayerErrorInfo();
        }
        this.mReadLock.lock();
        try {
            if (isValid()) {
                str = this.mPlayer.getStringOption(i);
            }
            return str;
        } finally {
            this.mReadLock.unlock();
        }
    }

    @Override // com.ss.ttm.player.ISurfaceListener
    public void onSurfaceCreated(SurfaceHolder surfaceHolder) {
        this.mSurfaceHolder = surfaceHolder;
        if (!this.mRealsedSurface) {
            this.mReadLock.lock();
            try {
                if (isValid()) {
                    SurfaceHolder surfaceHolder2 = this.mSurfaceHolder;
                    if (surfaceHolder != surfaceHolder2) {
                        if (surfaceHolder2 != null) {
                            surfaceHolder2.removeCallback(this.mCallback);
                        }
                        this.mSurfaceHolder = surfaceHolder;
                        if (surfaceHolder != null) {
                            surfaceHolder.addCallback(this.mCallback);
                        }
                    }
                    this.mPlayer.setSurface(surfaceHolder.getSurface());
                }
            } finally {
                this.mReadLock.unlock();
            }
        }
    }

    @Override // com.ss.ttm.player.MediaPlayerClient
    public void setDataSource(IMediaDataSource iMediaDataSource) throws IllegalArgumentException, SecurityException, IllegalStateException, IOException {
        if (iMediaDataSource != null) {
            this.mReadLock.lock();
            try {
                if (isValid()) {
                    this.mPlayer.setDataSource(iMediaDataSource);
                }
            } finally {
                this.mReadLock.unlock();
            }
        } else {
            throw new IllegalArgumentException("null mediadatasource pointer.");
        }
    }

    /* JADX INFO: finally extract failed */
    @Override // com.ss.ttm.player.MediaPlayerClient
    public void setDisplay(SurfaceHolder surfaceHolder) {
        SurfaceHolder surfaceHolder2 = this.mSurfaceHolder;
        if (surfaceHolder2 != null) {
            surfaceHolder2.removeCallback(this.mCallback);
        }
        this.mSurfaceHolder = surfaceHolder;
        Surface surface = null;
        if (surfaceHolder != null) {
            surfaceHolder.addCallback(this.mCallback);
            surface = this.mSurfaceHolder.getSurface();
        }
        this.mReadLock.lock();
        try {
            if (isValid()) {
                this.mPlayer.setSurface(surface);
            }
            this.mReadLock.unlock();
            updateSurfaceScreenOn();
        } catch (Throwable th) {
            this.mReadLock.unlock();
            throw th;
        }
    }

    @Override // com.ss.ttm.player.MediaPlayerClient
    public void setIsMute(boolean z) {
        int i;
        this.mReadLock.lock();
        try {
            if (isValid()) {
                ITTPlayerRef iTTPlayerRef = this.mPlayer;
                if (z) {
                    i = 1;
                } else {
                    i = 0;
                }
                iTTPlayerRef.setIntOption(12, i);
            }
        } finally {
            this.mReadLock.unlock();
        }
    }

    @Override // com.ss.ttm.player.MediaPlayerClient
    public void setLooping(boolean z) {
        int i;
        this.mReadLock.lock();
        try {
            if (isValid()) {
                ITTPlayerRef iTTPlayerRef = this.mPlayer;
                if (z) {
                    i = 1;
                } else {
                    i = 0;
                }
                iTTPlayerRef.setLooping(i);
            }
        } finally {
            this.mReadLock.unlock();
        }
    }

    @Override // com.ss.ttm.player.MediaPlayerClient
    public void setOnBufferingUpdateListener(MediaPlayer.OnBufferingUpdateListener onBufferingUpdateListener) {
        this.mOnBufferingUpdateListener = onBufferingUpdateListener;
        this.mListenerState |= 8;
        this.mReadLock.lock();
        try {
            if (isValid()) {
                this.mPlayer.setNotifyState(this.mListenerState);
            }
        } finally {
            this.mReadLock.unlock();
        }
    }

    @Override // com.ss.ttm.player.MediaPlayerClient
    public void setOnCompletionListener(MediaPlayer.OnCompletionListener onCompletionListener) {
        this.mOnCompletionListener = onCompletionListener;
        this.mListenerState |= 8192;
        this.mReadLock.lock();
        try {
            if (isValid()) {
                this.mPlayer.setNotifyState(this.mListenerState);
            }
        } finally {
            this.mReadLock.unlock();
        }
    }

    @Override // com.ss.ttm.player.MediaPlayerClient
    public void setOnErrorListener(MediaPlayer.OnErrorListener onErrorListener) {
        this.mOnErrorListener = onErrorListener;
        this.mListenerState |= 35184372088833L;
        this.mReadLock.lock();
        try {
            if (isValid()) {
                this.mPlayer.setNotifyState(this.mListenerState);
            }
        } finally {
            this.mReadLock.unlock();
        }
    }

    @Override // com.ss.ttm.player.MediaPlayerClient
    public void setOnExternInfoListener(MediaPlayer.OnExternInfoListener onExternInfoListener) {
        this.mOnExternInfoListener = onExternInfoListener;
        this.mListenerState |= -8646883788170199040L;
        this.mReadLock.lock();
        try {
            if (isValid()) {
                this.mPlayer.setNotifyState(this.mListenerState);
            }
        } finally {
            this.mReadLock.unlock();
        }
    }

    @Override // com.ss.ttm.player.MediaPlayerClient
    public void setOnInfoListener(MediaPlayer.OnInfoListener onInfoListener) {
        this.mOnInfoListener = onInfoListener;
        this.mListenerState |= 7385488862257088434L;
        this.mReadLock.lock();
        try {
            if (isValid()) {
                this.mPlayer.setNotifyState(this.mListenerState);
            }
        } finally {
            this.mReadLock.unlock();
        }
    }

    @Override // com.ss.ttm.player.MediaPlayerClient
    public void setOnPreparedListener(MediaPlayer.OnPreparedListener onPreparedListener) {
        this.mOnPreparedListener = onPreparedListener;
        this.mListenerState |= 4;
        this.mReadLock.lock();
        try {
            if (isValid()) {
                this.mPlayer.setNotifyState(this.mListenerState);
            }
        } finally {
            this.mReadLock.unlock();
        }
    }

    @Override // com.ss.ttm.player.MediaPlayerClient
    public void setOnSARChangedListener(MediaPlayer.onSARChangedListener onsarchangedlistener) {
        this.mOnSARChangedListener = onsarchangedlistener;
        this.mListenerState |= 8388608;
        this.mReadLock.lock();
        try {
            if (isValid()) {
                this.mPlayer.setNotifyState(this.mListenerState);
            }
        } finally {
            this.mReadLock.unlock();
        }
    }

    @Override // com.ss.ttm.player.MediaPlayerClient
    public void setOnSeekCompleteListener(MediaPlayer.OnSeekCompleteListener onSeekCompleteListener) {
        this.mOnSeekCompleteListener = onSeekCompleteListener;
        this.mListenerState |= 4096;
        this.mReadLock.lock();
        try {
            if (isValid()) {
                this.mPlayer.setNotifyState(this.mListenerState);
            }
        } finally {
            this.mReadLock.unlock();
        }
    }

    @Override // com.ss.ttm.player.MediaPlayerClient
    public void setOnVideoSizeChangedListener(MediaPlayer.OnVideoSizeChangedListener onVideoSizeChangedListener) {
        this.mOnVideoSizeChangedListener = onVideoSizeChangedListener;
        this.mListenerState |= 64;
        this.mReadLock.lock();
        try {
            if (isValid()) {
                this.mPlayer.setNotifyState(this.mListenerState);
            }
        } finally {
            this.mReadLock.unlock();
        }
    }

    @Override // com.ss.ttm.player.MediaPlayerClient
    public void setPlaybackParams(PlaybackParams playbackParams) {
        this.mReadLock.lock();
        try {
            if (!(!isValid() || playbackParams == null || playbackParams.getSpeed() == -1.0f)) {
                this.mPlayer.setFloatOption(60, playbackParams.getSpeed());
            }
        } finally {
            this.mReadLock.unlock();
        }
    }

    @Override // com.ss.ttm.player.MediaPlayerClient
    public void takeScreenshot(MediaPlayer.OnScreenshotListener onScreenshotListener) {
        if (this.mPlayer != null && onScreenshotListener != null) {
            this.mListenerState |= 32768;
            this.mReadLock.lock();
            try {
                if (isValid()) {
                    this.mPlayer.setNotifyState(this.mListenerState);
                    this.mPlayer.setOnScreenshotListener(onScreenshotListener);
                    this.mPlayer.takeScreenshot();
                }
            } finally {
                this.mReadLock.unlock();
            }
        }
    }

    @Override // com.ss.ttm.player.ISurfaceListener
    public void onSurfaceDestroyed(SurfaceHolder surfaceHolder) {
        if (!this.mRealsedSurface) {
            if (this.mMediaCodecStopTimeOutMs > 0) {
                try {
                    AVThreadPool.addTask(new Callable<String>() {
                        /* class com.ss.ttm.player.TTPlayerClient.CallableC654172 */

                        @Override // java.util.concurrent.Callable
                        public String call() {
                            try {
                                TTPlayerClient.this.mReadLock.lockInterruptibly();
                                try {
                                    if (TTPlayerClient.this.isValid()) {
                                        TTPlayerClient.this.mPlayer.setSurface(null);
                                    }
                                    return "OK";
                                } finally {
                                    TTPlayerClient.this.mReadLock.unlock();
                                }
                            } catch (InterruptedException unused) {
                                Log.e(TTPlayerClient.TAG, "mPlayer setsurface null failed.");
                                return "OK";
                            }
                        }
                    }).get((long) this.mMediaCodecStopTimeOutMs, TimeUnit.MILLISECONDS);
                } catch (InterruptedException | ExecutionException | TimeoutException unused) {
                    Log.e(TAG, "set surface time out");
                }
            } else {
                this.mReadLock.lock();
                try {
                    if (isValid()) {
                        this.mPlayer.setSurface(null);
                    }
                } finally {
                    this.mReadLock.unlock();
                }
            }
        }
    }

    @Override // com.ss.ttm.player.MediaPlayerClient
    public void setDataSource(String str) throws IllegalArgumentException, SecurityException, IllegalStateException, IOException {
        if (str.toLowerCase(Locale.US).indexOf("://") <= 0) {
            this.mUri = "file://" + str;
        } else {
            this.mUri = str;
        }
        this.mReadLock.lock();
        try {
            if (isValid()) {
                this.mPlayer.setDataSource(this.mUri);
            }
        } finally {
            this.mReadLock.unlock();
        }
    }

    public static synchronized TTPlayerClient create(MediaPlayer mediaPlayer, Context context) {
        TTPlayerClient create;
        synchronized (TTPlayerClient.class) {
            create = create(mediaPlayer, context, null);
        }
        return create;
    }

    @Override // com.ss.ttm.player.MediaPlayerClient
    public float getFloatOption(int i, float f) {
        this.mReadLock.lock();
        try {
            if (isValid()) {
                f = this.mPlayer.getFloatOption(i, f);
            }
            return f;
        } finally {
            this.mReadLock.unlock();
        }
    }

    @Override // com.ss.ttm.player.MediaPlayerClient
    public long getLongOption(int i, long j) {
        this.mReadLock.lock();
        try {
            if (isValid()) {
                j = this.mPlayer.getLongOption(i, j);
            }
            return j;
        } finally {
            this.mReadLock.unlock();
        }
    }

    @Override // com.ss.ttm.player.MediaPlayerClient
    public void rotateCamera(float f, float f2) {
        this.mReadLock.lock();
        try {
            if (isValid()) {
                this.mPlayer.rotateCamera(f, f2);
            }
        } finally {
            this.mReadLock.unlock();
        }
    }

    @Override // com.ss.ttm.player.MediaPlayerClient
    public void setCacheFile(String str, int i) {
        this.mReadLock.lock();
        try {
            if (isValid()) {
                this.mPlayer.setCacheFile(str, i);
            }
        } finally {
            this.mReadLock.unlock();
        }
    }

    @Override // com.ss.ttm.player.MediaPlayerClient
    public int setFloatOption(int i, float f) {
        int i2;
        this.mReadLock.lock();
        try {
            if (isValid()) {
                i2 = this.mPlayer.setFloatOption(i, f);
            } else {
                i2 = -1;
            }
            return i2;
        } finally {
            this.mReadLock.unlock();
        }
    }

    @Override // com.ss.ttm.player.MediaPlayerClient
    public int setLongOption(int i, long j) {
        int i2;
        this.mReadLock.lock();
        try {
            if (isValid()) {
                i2 = this.mPlayer.setLongOption(i, j);
            } else {
                i2 = -1;
            }
            return i2;
        } finally {
            this.mReadLock.unlock();
        }
    }

    @Override // com.ss.ttm.player.MediaPlayerClient
    public int setStringOption(int i, String str) {
        int i2;
        this.mReadLock.lock();
        try {
            if (isValid()) {
                i2 = this.mPlayer.setStringOption(i, str);
            } else {
                i2 = -1;
            }
            return i2;
        } finally {
            this.mReadLock.unlock();
        }
    }

    @Override // com.ss.ttm.player.MediaPlayerClient
    public void setVolume(float f, float f2) {
        this.mReadLock.lock();
        try {
            if (isValid()) {
                this.mPlayer.setVolume(f, f2);
            }
        } finally {
            this.mReadLock.unlock();
        }
    }

    private void onExternInfo(int i, String str) {
        if (this.mRtcPlay != 0) {
            try {
                this.mReentrantLockInRtc.lock();
                MediaPlayer.OnExternInfoListener onExternInfoListener = this.mOnExternInfoListener;
                if (!(onExternInfoListener == null || str == null)) {
                    onExternInfoListener.onExternInfo(this.mWrapper, i, str);
                }
            } finally {
                this.mReentrantLockInRtc.unlock();
            }
        } else {
            MediaPlayer.OnExternInfoListener onExternInfoListener2 = this.mOnExternInfoListener;
            if (onExternInfoListener2 != null && str != null) {
                onExternInfoListener2.onExternInfo(this.mWrapper, i, str);
            }
        }
    }

    private void sendErrorInfo(int i, int i2) {
        try {
            this.mReentrantLock.lock();
            MediaPlayer.OnErrorListener onErrorListener = this.mOnErrorListener;
            if (onErrorListener != null && i2 >= this.mPlayLifeId) {
                int i3 = this.mErrorCode;
                if (i3 != 0) {
                    i = i3;
                } else if (i == 0) {
                    i = -1048575;
                }
                onErrorListener.onError(this.mWrapper, i, 0);
            }
        } finally {
            if (this.mReentrantLock.isLocked()) {
                this.mReentrantLock.unlock();
            }
        }
    }

    @Override // com.ss.ttm.player.MediaPlayerClient
    public int getIntOption(int i, int i2) {
        if (i == 5000) {
            return this.mErrorCode;
        }
        if (i == 26) {
            return this.mCrashType;
        }
        this.mReadLock.lock();
        try {
            if (isValid()) {
                i2 = this.mPlayer.getIntOption(i, i2);
            }
            return i2;
        } finally {
            this.mReadLock.unlock();
        }
    }

    @Override // com.ss.ttm.player.MediaPlayerClient
    public int setIntOption(int i, int i2) {
        int i3;
        if (i == 41) {
            AVResolver.HOST_MAX_CACHE_TIME = i2;
            return 0;
        } else if (i == 5003) {
            this.mDisablePlayerStayAwake = i2;
            return 0;
        } else if (i == 952) {
            this.mMediaCodecStopTimeOutMs = i2;
            return 0;
        } else {
            this.mReadLock.lock();
            try {
                if (isValid()) {
                    i3 = this.mPlayer.setIntOption(i, i2);
                } else {
                    i3 = -1;
                }
                return i3;
            } finally {
                this.mReadLock.unlock();
            }
        }
    }

    @Override // com.ss.ttm.player.MediaPlayerClient
    public void setWakeMode(Context context, int i) {
        boolean z;
        PowerManager.WakeLock wakeLock = this.mWakeLock;
        if (wakeLock != null) {
            if (wakeLock.isHeld()) {
                z = true;
                this.mWakeLock.release();
            } else {
                z = false;
            }
            this.mWakeLock = null;
        } else {
            z = false;
        }
        PowerManager.WakeLock newWakeLock = ((PowerManager) context.getSystemService("power")).newWakeLock(i | 536870912, TTPlayerClient.class.getName());
        this.mWakeLock = newWakeLock;
        newWakeLock.setReferenceCounted(false);
        if (z) {
            this.mWakeLock.acquire();
        }
    }

    @Override // com.ss.ttm.player.MediaPlayerClient
    public void switchStream(int i, int i2) {
        if (this.mPlayer != null) {
            this.mReadLock.lock();
            try {
                if (isValid()) {
                    this.mPlayer.switchStream(i, i2);
                }
            } finally {
                this.mReadLock.unlock();
            }
        }
    }

    private TTPlayerClient(Context context, HashMap<Integer, Integer> hashMap) {
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
        this.mReadWritedLock = reentrantReadWriteLock;
        this.mReadLock = reentrantReadWriteLock.readLock();
        this.mWriteLock = reentrantReadWriteLock.writeLock();
        this.mErrorCode = 0;
        this.mRtcPlay = 0;
        this.mCrashedInfo = new StringBuilder(1024);
        this.mCrashType = -1;
        this.mDisablePlayerStayAwake = 0;
        this.mConfigParams = null;
        this.mMediaCodecStopTimeOutMs = -1;
        this.mConfigParams = hashMap;
        this.mRealsedSurface = false;
        this.mCallback = new TTSurfaceCallback(this);
        this.mContext = context;
        if (Looper.myLooper() != null) {
            this.mHandler = new Handler(this);
        } else {
            this.mHandler = new Handler(Looper.getMainLooper(), this);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0056, code lost:
        if (0 == 0) goto L_0x005f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x005a, code lost:
        if (0 == 0) goto L_0x005f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x005c, code lost:
        r0.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x005f, code lost:
        setDataSource(r4.toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0066, code lost:
        return;
     */
    @Override // com.ss.ttm.player.MediaPlayerClient
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void setDataSource(android.content.Context r3, android.net.Uri r4) throws java.lang.IllegalArgumentException, java.lang.SecurityException, java.lang.IllegalStateException, java.io.IOException {
        /*
        // Method dump skipped, instructions count: 103
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.ttm.player.TTPlayerClient.setDataSource(android.content.Context, android.net.Uri):void");
    }

    private void notifyInfo(int i, int i2) {
        MediaPlayer.OnInfoListener onInfoListener = this.mOnInfoListener;
        if (onInfoListener != null) {
            int i3 = -1;
            if (i == 4) {
                i3 = 701;
            } else if (i == 5) {
                i3 = 702;
            } else if (i == 32) {
                i3 = 251658253;
            } else if (i == 47) {
                i3 = -268435408;
            } else if (i == 1000) {
                i3 = 16777217;
            } else if (i == 41) {
                i3 = -268435424;
            } else if (i == 42) {
                i3 = -268435423;
            } else if (i == 57) {
                i3 = -268435403;
            } else if (i == 58) {
                i3 = -268435402;
            } else if (i == 61) {
                i3 = -268435401;
            } else if (i != 62) {
                switch (i) {
                    case 7:
                        i3 = 3;
                        break;
                    case 8:
                        i3 = 801;
                        break;
                    case 9:
                        i3 = 802;
                        break;
                    case 10:
                        i3 = 901;
                        break;
                    default:
                        switch (i) {
                            case 20:
                                i3 = 251658243;
                                break;
                            case 21:
                                i3 = 251658244;
                                break;
                            case 22:
                                i3 = 251658245;
                                break;
                            case 23:
                                i3 = 251658246;
                                break;
                            case 24:
                                i3 = 251658247;
                                break;
                            case AvailableCode.ERROR_ON_ACTIVITY_RESULT:
                                i3 = 251658248;
                                break;
                            case 26:
                                i3 = 251658249;
                                break;
                            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP:
                                i3 = 251658250;
                                break;
                            case IVideoEventLogger.LOGGER_OPTION_ENABLE_SR /*{ENCODED_INT: 28}*/:
                                i3 = 251658251;
                                break;
                            case 29:
                                i3 = 251658252;
                                break;
                            case 30:
                                i3 = -268435390;
                                break;
                            default:
                                switch (i) {
                                    case 34:
                                        i3 = -268435442;
                                        break;
                                    case 35:
                                        i3 = -268435441;
                                        break;
                                    case 36:
                                        i3 = -268435440;
                                        break;
                                    case 37:
                                        i3 = -268435439;
                                        break;
                                    case 38:
                                        i3 = -268435438;
                                        break;
                                    case 39:
                                        i3 = -268435437;
                                        break;
                                    default:
                                        switch (i) {
                                            case 49:
                                                i3 = -268435392;
                                                break;
                                            case MmListControl.f116813f:
                                                i3 = -268435391;
                                                break;
                                            case 51:
                                                i3 = -268435407;
                                                break;
                                            case 52:
                                                i3 = -268435406;
                                                break;
                                            case 53:
                                                i3 = -268435405;
                                                break;
                                            case 54:
                                                i3 = -268435404;
                                                break;
                                        }
                                }
                        }
                }
            } else {
                i3 = -268435436;
            }
            onInfoListener.onInfo(this.mWrapper, i3, i2);
        }
    }

    public static synchronized TTPlayerClient create(MediaPlayer mediaPlayer, Context context, HashMap<Integer, Integer> hashMap) {
        synchronized (TTPlayerClient.class) {
            TTVersion.saveVersionInfo();
            TTPlayerClient tTPlayerClient = new TTPlayerClient(context, hashMap);
            ITTPlayerRef create = ITTPlayerRef.create(context, tTPlayerClient, hashMap);
            if (create == null) {
                return null;
            }
            tTPlayerClient.mPlayer = create;
            tTPlayerClient.mWrapper = mediaPlayer;
            return tTPlayerClient;
        }
    }

    @Override // com.ss.ttm.player.MediaPlayerClient
    public void mouseEvent(int i, int i2, int i3) {
        int i4 = 2;
        if (i == 0) {
            i4 = 1;
        } else if (i == 1) {
            i4 = 3;
        } else if (i != 2) {
            i4 = 0;
        }
        this.mReadLock.lock();
        try {
            if (isValid()) {
                this.mPlayer.mouseEvent(i4, i2, i3);
            }
        } finally {
            this.mReadLock.unlock();
        }
    }

    /* access modifiers changed from: protected */
    public void onPlayLogInfo(int i, int i2, String str) {
        if (i != 2) {
            if (i == 0) {
                this.mErrorCode = i2;
            }
            if (str != null) {
                if (this.mLogInfo.size() > 40) {
                    this.mLogInfo.removeFirst();
                }
                this.mLogInfo.addLast(String.format(Locale.US, "%s&&time:%d", str, Long.valueOf(System.currentTimeMillis())));
            }
        } else if (i2 == 1) {
            this.mVoiceInfo = str;
        } else if (i2 == 0) {
            this.mBufferingInfo = str;
        }
    }

    @Override // com.ss.ttm.player.MediaPlayerClient
    public void setDataSource(Context context, Uri uri, Map<String, String> map) throws IllegalArgumentException, SecurityException, IllegalStateException, IOException {
        if (uri != null) {
            setDataSource(context, uri);
            if (map != null && map.size() != 0) {
                StringBuilder sb = new StringBuilder();
                for (Map.Entry<String, String> entry : map.entrySet()) {
                    sb.append(entry.getKey());
                    sb.append(":");
                    sb.append(entry.getValue());
                    sb.append("\r\n");
                }
                this.mReadLock.lock();
                try {
                    if (isValid()) {
                        this.mPlayer.setStringOption(20, sb.toString());
                    }
                } finally {
                    this.mReadLock.unlock();
                }
            }
        }
    }

    @Override // com.ss.ttm.player.MediaPlayerClient
    public void setDataSource(FileDescriptor fileDescriptor, long j, long j2) throws IllegalStateException, IllegalArgumentException, IOException {
        setDataSource(fileDescriptor);
        this.mReadLock.lock();
        try {
            if (isValid()) {
                this.mPlayer.setLongOption(135, j);
                this.mPlayer.setLongOption(136, j2);
            }
        } finally {
            this.mReadLock.unlock();
        }
    }

    public void onPlayerNotify(int i, int i2, int i3, String str) {
        synchronized (this.mHandlerLocker) {
            Handler handler = this.mHandler;
            if (handler != null) {
                if (i2 != 40 || str == null) {
                    Message obtainMessage = handler.obtainMessage(i2, i3, i);
                    obtainMessage.obj = str;
                    obtainMessage.sendToTarget();
                    return;
                }
                handleNotify(i, i2, i3, str);
            }
        }
    }

    /* JADX INFO: finally extract failed */
    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0044  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void handleNotify(int r5, int r6, int r7, java.lang.String r8) {
        /*
        // Method dump skipped, instructions count: 392
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.ttm.player.TTPlayerClient.handleNotify(int, int, int, java.lang.String):void");
    }
}
