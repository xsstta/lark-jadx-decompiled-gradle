package com.ss.ttm.player;

import android.media.AudioManager;
import android.media.AudioTrack;
import android.os.Build;
import android.os.ConditionVariable;
import android.os.SystemClock;
import android.util.Log;
import com.ss.ttm.utils.AVLogger;
import com.ss.ttm.utils.Util;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.Locale;

public class AJVoice implements AudioTrack.OnPlaybackPositionUpdateListener {
    private static final int SDK_INT = Build.VERSION.SDK_INT;
    public static final String TAG = "AJVoice";
    private static String mDeviceName;
    private static boolean mNeedReleaseWorkAround;
    private AudioTrackPositionTracker audioTrackPositionTracker;
    private long forceResetWorkaroundTimeMs = -9223372036854775807L;
    private Method getLatencyMethod;
    private long lastRawPlaybackHeadPosition;
    private int mAudioFormat = 2;
    private AudioManager mAudioManager;
    private AudioTrack mAudioTrack;
    private int mBlockSize = 2048;
    private int mBufferSizeMs;
    private int mChannels = 2;
    private int mChannelsLayout;
    private int mEnableAudioTrackSmoothClock;
    private int mFrameSamples;
    private long mLastGetLatencyMs;
    private int mLatencyMs;
    private float mLeftVolume = -1.0f;
    private int mMaxVolume;
    private byte[] mMinBytes;
    private long mNativeObject;
    private TTPlayer mPlayer;
    public ConditionVariable mReleasingConditionVariable;
    private int mSampleBytes = 2;
    private int mSampleFormat;
    private int mSampleRate = 44100;
    private int mSerial = -1;
    private int mSessionId = -1;
    private int mStartMediaTimeMs = -1;
    private long mStartTime;
    private volatile boolean mStoped = true;
    private int mStreamType = 3;
    private int mTrackBufferSize;
    private long mWrittenPcmBytes;

    public void onMarkerReached(AudioTrack audioTrack) {
    }

    public void onPeriodicNotification(AudioTrack audioTrack) {
    }

    public int getTrackBufferSize() {
        return this.mTrackBufferSize;
    }

    private long getPlaybackBytes() {
        return getPlaybackHeadPosition() * ((long) getPcmFrameSize(this.mAudioFormat, this.mChannels));
    }

    private long getPlaybackPositionMs() {
        return (getPlaybackHeadPosition() * 1000) / ((long) this.mSampleRate);
    }

    public int getSessionId() {
        AudioTrack audioTrack;
        int i = this.mSessionId;
        if (i != -1 || (audioTrack = this.mAudioTrack) == null) {
            return i;
        }
        return audioTrack.getAudioSessionId();
    }

    private long getWrittenDurationMs() {
        return ((this.mWrittenPcmBytes / ((long) getPcmFrameSize(this.mAudioFormat, this.mChannels))) * 1000) / ((long) this.mSampleRate);
    }

    public void flush() {
        try {
            AudioTrackPositionTracker audioTrackPositionTracker2 = this.audioTrackPositionTracker;
            if (audioTrackPositionTracker2 != null) {
                audioTrackPositionTracker2.reset();
            }
            this.mStartMediaTimeMs = -1;
            this.mAudioTrack.flush();
            if (this.mWrittenPcmBytes > 0) {
                this.mWrittenPcmBytes = 0;
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public int getCurrentPositionMs() {
        AudioTrackPositionTracker audioTrackPositionTracker2 = this.audioTrackPositionTracker;
        if (audioTrackPositionTracker2 != null) {
            return this.mStartMediaTimeMs + ((int) (audioTrackPositionTracker2.getCurrentPositionUs(false) / 1000));
        }
        return 0;
    }

    public int getEOSDelayMs() {
        long j;
        long writtenDurationMs = getWrittenDurationMs();
        long playbackPositionMs = getPlaybackPositionMs();
        if (getLatency() > 0) {
            j = (long) (this.mLatencyMs - this.mBufferSizeMs);
        } else {
            j = 0;
        }
        return (int) ((writtenDurationMs - playbackPositionMs) + j);
    }

    public int getMaxVolume() {
        Log.i("ttmn", "getMaxVolume:" + this.mMaxVolume);
        return this.mMaxVolume;
    }

    public void pause() {
        try {
            AudioTrackPositionTracker audioTrackPositionTracker2 = this.audioTrackPositionTracker;
            if (audioTrackPositionTracker2 != null) {
                audioTrackPositionTracker2.pause();
            }
            this.mAudioTrack.pause();
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public void stop() {
        if (!this.mStoped) {
            this.mStoped = true;
            try {
                AudioTrackPositionTracker audioTrackPositionTracker2 = this.audioTrackPositionTracker;
                if (audioTrackPositionTracker2 != null) {
                    audioTrackPositionTracker2.pause();
                }
                this.mAudioTrack.pause();
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    private long getPlaybackHeadPosition() {
        int playState = this.mAudioTrack.getPlayState();
        if (playState == 1) {
            return 0;
        }
        long playbackHeadPosition = 4294967295L & ((long) this.mAudioTrack.getPlaybackHeadPosition());
        if (playbackHeadPosition == 0 && this.lastRawPlaybackHeadPosition > 0 && playState == 3) {
            if (this.forceResetWorkaroundTimeMs == -9223372036854775807L) {
                this.forceResetWorkaroundTimeMs = SystemClock.elapsedRealtime();
            }
            return this.lastRawPlaybackHeadPosition;
        }
        this.forceResetWorkaroundTimeMs = -9223372036854775807L;
        this.lastRawPlaybackHeadPosition = playbackHeadPosition;
        return playbackHeadPosition;
    }

    private boolean needsReset() {
        if (this.forceResetWorkaroundTimeMs == -9223372036854775807L || this.mWrittenPcmBytes <= 0 || SystemClock.elapsedRealtime() - this.forceResetWorkaroundTimeMs < 200) {
            return false;
        }
        return true;
    }

    private int reset() {
        this.mWrittenPcmBytes = 0;
        this.mLatencyMs = 0;
        this.forceResetWorkaroundTimeMs = -9223372036854775807L;
        this.mLastGetLatencyMs = 0;
        this.lastRawPlaybackHeadPosition = 0;
        this.mLeftVolume = -1.0f;
        AudioTrack audioTrack = this.mAudioTrack;
        this.mAudioTrack = null;
        try {
            audioTrack.flush();
            audioTrack.release();
        } catch (Exception unused) {
        } catch (Throwable th) {
            reconfigure();
            throw th;
        }
        return reconfigure();
    }

    public void close() {
        final AudioTrack audioTrack = this.mAudioTrack;
        if (audioTrack != null) {
            this.mAudioTrack = null;
            try {
                AVThreadPool.addTask(new Runnable() {
                    /* class com.ss.ttm.player.AJVoice.RunnableC654101 */

                    public void run() {
                        Log.i(AJVoice.TAG, "start release task");
                        AJVoice.this.releaseTrack(audioTrack);
                    }
                });
            } catch (Throwable th) {
                String str = TAG;
                Log.w(str, "create close thread fail = " + th);
                releaseTrack(audioTrack);
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0025  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0027  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public float getVolume() {
        /*
            r4 = this;
            com.ss.ttm.player.TTPlayer r0 = r4.mPlayer
            r1 = 0
            if (r0 == 0) goto L_0x0022
            float r0 = r4.mLeftVolume
            r2 = -1082130432(0xffffffffbf800000, float:-1.0)
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 != 0) goto L_0x0022
            android.media.AudioManager r0 = r4.mAudioManager
            if (r0 == 0) goto L_0x0022
            int r2 = r4.mStreamType     // Catch:{ Exception -> 0x0022 }
            int r0 = r0.getStreamMaxVolume(r2)     // Catch:{ Exception -> 0x0022 }
            android.media.AudioManager r2 = r4.mAudioManager     // Catch:{ Exception -> 0x0020 }
            int r3 = r4.mStreamType     // Catch:{ Exception -> 0x0020 }
            int r1 = r2.getStreamVolume(r3)     // Catch:{ Exception -> 0x0020 }
            goto L_0x0023
        L_0x0020:
            goto L_0x0023
        L_0x0022:
            r0 = 0
        L_0x0023:
            if (r1 < 0) goto L_0x0027
            float r0 = (float) r1
            return r0
        L_0x0027:
            if (r0 <= 0) goto L_0x002d
            int r0 = r0 / 4
            float r0 = (float) r0
            return r0
        L_0x002d:
            r0 = 1092616192(0x41200000, float:10.0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.ttm.player.AJVoice.getVolume():float");
    }

    public void resume() {
        try {
            AudioTrackPositionTracker audioTrackPositionTracker2 = this.audioTrackPositionTracker;
            if (audioTrackPositionTracker2 != null) {
                AudioTrack audioTrack = this.mAudioTrack;
                int i = this.mAudioFormat;
                audioTrackPositionTracker2.setAudioTrack(audioTrack, i, getPcmFrameSize(i, this.mChannels), this.mTrackBufferSize);
                this.audioTrackPositionTracker.start();
            }
            this.mAudioTrack.play();
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public AJVoice() {
        if (mDeviceName == null) {
            String str = Build.DEVICE;
            mDeviceName = str;
            if (str.equals("OnePlus6T")) {
                Log.d(TAG, "device need workaround");
                mNeedReleaseWorkAround = true;
            }
        }
    }

    public int getLatency() {
        getPlaybackHeadPosition();
        if (this.getLatencyMethod != null) {
            long nanoTime = System.nanoTime() / 1000000;
            if (nanoTime - this.mLastGetLatencyMs > 500) {
                try {
                    int intValue = ((Integer) this.getLatencyMethod.invoke(this.mAudioTrack, null)).intValue();
                    this.mLatencyMs = intValue;
                    int max = Math.max(intValue, 0);
                    this.mLatencyMs = max;
                    if (max > 5000) {
                        String str = TAG;
                        Log.w(str, "Ignoring impossibly large audio latency: " + this.mLatencyMs);
                        this.mLatencyMs = 0;
                    }
                } catch (Exception unused) {
                    this.getLatencyMethod = null;
                }
                this.mLastGetLatencyMs = nanoTime;
            }
        }
        return this.mLatencyMs;
    }

    public int start() {
        if (this.mAudioTrack == null) {
            Log.e(TAG, "audiotrack start before created");
            return -2;
        }
        this.mStoped = false;
        try {
            AudioTrackPositionTracker audioTrackPositionTracker2 = this.audioTrackPositionTracker;
            if (audioTrackPositionTracker2 != null) {
                AudioTrack audioTrack = this.mAudioTrack;
                int i = this.mAudioFormat;
                audioTrackPositionTracker2.setAudioTrack(audioTrack, i, getPcmFrameSize(i, this.mChannels), this.mTrackBufferSize);
            }
            this.mAudioTrack.play();
            this.mSerial = -1;
            if (mNeedReleaseWorkAround) {
                this.mStartTime = SystemClock.elapsedRealtime();
            }
            return 0;
        } catch (Throwable th) {
            String str = TAG;
            Log.e(str, "audioTrack start failed = " + th);
            return -3;
        }
    }

    private int reconfigure() {
        AudioManager audioManager = (AudioManager) this.mPlayer.getContext().getSystemService("audio");
        this.mAudioManager = audioManager;
        if (audioManager != null) {
            this.mMaxVolume = audioManager.getStreamMaxVolume(this.mStreamType);
        }
        int audioTrackChannelConfig = getAudioTrackChannelConfig(this.mChannels);
        this.mChannelsLayout = audioTrackChannelConfig;
        if (audioTrackChannelConfig == 0) {
            AVLogger.m256497k(TAG, String.format(Locale.US, "not supoort channel:%d", Integer.valueOf(this.mChannels)));
            return -1;
        }
        int i = this.mSampleBytes;
        if (i == 1) {
            this.mAudioFormat = 3;
        } else if (i != 2) {
            return -12;
        } else {
            this.mAudioFormat = 2;
        }
        int minBufferSize = AudioTrack.getMinBufferSize(this.mSampleRate, audioTrackChannelConfig, this.mAudioFormat);
        if (minBufferSize <= 0) {
            String str = TAG;
            Log.e(str, "getMinBufferSize failed, trace: sampleRate = " + this.mSampleRate + ", mChannelsLayout = " + this.mChannelsLayout + ", mAudioFormat = " + this.mAudioFormat);
            return minBufferSize;
        }
        this.mTrackBufferSize = minBufferSize;
        try {
            this.mMinBytes = new byte[minBufferSize];
            this.mBufferSizeMs = ((minBufferSize / getPcmFrameSize(this.mAudioFormat, this.mChannels)) * 1000) / this.mSampleRate;
            String str2 = TAG;
            Log.d(str2, "minbuffersize = " + minBufferSize + ", buffersizeMs = " + this.mBufferSizeMs);
            try {
                if (this.mSessionId == -1) {
                    this.mAudioTrack = new AudioTrack(this.mStreamType, this.mSampleRate, this.mChannelsLayout, this.mAudioFormat, minBufferSize, 1);
                } else {
                    this.mAudioTrack = new AudioTrack(this.mStreamType, this.mSampleRate, this.mChannelsLayout, this.mAudioFormat, minBufferSize, 1, this.mSessionId);
                }
                if (this.mAudioTrack.getState() == 1) {
                    return 0;
                }
                try {
                    this.mAudioTrack.release();
                    this.mAudioTrack = null;
                } catch (Exception unused) {
                    this.mAudioTrack = null;
                    str2 = TAG;
                }
                Log.e(str2, "create audiotrack but failed to initialize");
                return -3;
            } catch (Throwable th) {
                String str3 = TAG;
                Log.e(str3, "create audio track failed ,detail = " + th);
                return -1;
            }
        } catch (OutOfMemoryError unused2) {
            Log.e(TAG, "out of memory error when new audio buffer for audiotrack");
            return -10;
        }
    }

    public void setAudioTrackSmoothClock(int i) {
        if (Util.SDK_INT >= 21) {
            this.mEnableAudioTrackSmoothClock = i;
            if (i > 0) {
                this.audioTrackPositionTracker = new AudioTrackPositionTracker(null);
                this.mReleasingConditionVariable = new ConditionVariable(true);
            }
        }
    }

    public static int getAudioTrackChannelConfig(int i) {
        switch (i) {
            case 1:
                return 4;
            case 2:
                return 12;
            case 3:
                return 28;
            case 4:
                return 204;
            case 5:
                return 220;
            case 6:
                return 252;
            case 7:
                return 1276;
            case 8:
                if (Build.VERSION.SDK_INT < 23 && Build.VERSION.SDK_INT < 21) {
                    return 0;
                }
                return 6396;
            default:
                return 0;
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(6:2|3|(2:5|(1:7))|8|9|13) */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x001c, code lost:
        r6 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x001d, code lost:
        r0 = com.ss.ttm.player.AJVoice.TAG;
        android.util.Log.w(r0, "release in invalid state = " + r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:?, code lost:
        return;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:8:0x0018 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void releaseTrack(android.media.AudioTrack r6) {
        /*
            r5 = this;
            if (r6 != 0) goto L_0x0003
            return
        L_0x0003:
            boolean r0 = com.ss.ttm.player.AJVoice.mNeedReleaseWorkAround     // Catch:{ Exception -> 0x0018 }
            if (r0 == 0) goto L_0x0018
            long r0 = android.os.SystemClock.elapsedRealtime()     // Catch:{ Exception -> 0x0018 }
            long r2 = r5.mStartTime     // Catch:{ Exception -> 0x0018 }
            long r0 = r0 - r2
            r2 = 80
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 > 0) goto L_0x0018
            long r2 = r2 - r0
            java.lang.Thread.sleep(r2)     // Catch:{ Exception -> 0x0018 }
        L_0x0018:
            r6.release()     // Catch:{ Exception -> 0x001c }
            goto L_0x0033
        L_0x001c:
            r6 = move-exception
            java.lang.String r0 = com.ss.ttm.player.AJVoice.TAG
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "release in invalid state = "
            r1.append(r2)
            r1.append(r6)
            java.lang.String r6 = r1.toString()
            android.util.Log.w(r0, r6)
        L_0x0033:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.ttm.player.AJVoice.releaseTrack(android.media.AudioTrack):void");
    }

    public void setSessionId(int i) {
        String str = TAG;
        Log.d(str, "setSessionId : " + i);
        this.mSessionId = i;
        if (this.mPlayer != null && reset() == 0) {
            start();
        }
    }

    public void setStreamType(int i) {
        String str = TAG;
        Log.d(str, "set Stream type : " + i);
        this.mStreamType = i;
        if (this.mPlayer != null && reset() == 0) {
            start();
        }
    }

    public void setTrackVolume(float f, float f2) {
        AudioTrack audioTrack = this.mAudioTrack;
        if (audioTrack != null) {
            audioTrack.setStereoVolume(f, f2);
        }
    }

    public static int getPcmFrameSize(int i, int i2) {
        if (i == 2) {
            return i2 * 2;
        }
        if (i == 3) {
            return i2;
        }
        throw new IllegalArgumentException();
    }

    public int open(long j, TTPlayer tTPlayer) {
        this.mPlayer = tTPlayer;
        int reconfigure = reconfigure();
        if (reconfigure == 0) {
            float f = this.mLeftVolume;
            if (f != -1.0f) {
                setVolume(f, f);
            }
            if (Build.VERSION.SDK_INT >= 18) {
                try {
                    this.getLatencyMethod = AudioTrack.class.getMethod("getLatency", null);
                } catch (NoSuchMethodException unused) {
                }
            }
        }
        return reconfigure;
    }

    public void setVolume(float f, float f2) {
        AudioTrack audioTrack;
        try {
            int i = this.mMaxVolume;
            if (((float) i) < f) {
                f = (float) i;
            }
            if (f2 != -1048575.0f || (audioTrack = this.mAudioTrack) == null) {
                AudioManager audioManager = this.mAudioManager;
                if (audioManager != null) {
                    audioManager.setStreamVolume(this.mStreamType, (int) f, 0);
                }
            } else {
                audioTrack.setStereoVolume(f, f2);
            }
            this.mLeftVolume = f;
        } catch (Exception unused) {
        }
    }

    public int write(ByteBuffer byteBuffer, int i) {
        if (byteBuffer == null) {
            AVLogger.m256495e(TAG, "buffer is nullpoint");
            return -1;
        } else if (this.mAudioTrack.write(byteBuffer, 0, byteBuffer.capacity()) != byteBuffer.capacity()) {
            return -1;
        } else {
            byteBuffer.flip();
            return 0;
        }
    }

    public int write(byte[] bArr, int i, int i2, int i3) {
        if (bArr == null || bArr.length == 0) {
            AVLogger.m256495e(TAG, "buffer is nullpoint");
            return -10;
        }
        int i4 = 0;
        if (this.mStoped) {
            return 0;
        }
        if (this.mSerial != i3) {
            this.mSerial = i3;
            if (this.mWrittenPcmBytes > 0) {
                this.mAudioTrack.flush();
            }
        }
        try {
            int write = this.mAudioTrack.write(bArr, i, i2);
            if (write < 0) {
                Log.e(TAG, "write failed : ret: " + write + ", size = " + i2);
                return write;
            }
            this.mWrittenPcmBytes += (long) write;
            if (needsReset() && reset() == 0) {
                i4 = start();
            }
            return i4 == 0 ? write : i4;
        } catch (Exception e) {
            Log.d(TAG, "write fail = " + e);
            e.printStackTrace();
            return -1;
        }
    }

    public int write(byte[] bArr, int i, int i2, int i3, long j) {
        if (bArr == null || bArr.length == 0) {
            AVLogger.m256495e(TAG, "buffer is nullpoint");
            return -10;
        }
        int i4 = 0;
        if (this.mStoped) {
            return 0;
        }
        if (this.mSerial != i3) {
            this.mSerial = i3;
            AudioTrackPositionTracker audioTrackPositionTracker2 = this.audioTrackPositionTracker;
            if (audioTrackPositionTracker2 == null || this.mReleasingConditionVariable == null) {
                if (this.mWrittenPcmBytes > 0) {
                    this.mAudioTrack.flush();
                }
            } else if (this.mWrittenPcmBytes > 0) {
                if (audioTrackPositionTracker2.isPlaying()) {
                    this.mAudioTrack.pause();
                }
                this.audioTrackPositionTracker.reset();
                this.mStartMediaTimeMs = -1;
                this.mReleasingConditionVariable.close();
                this.mWrittenPcmBytes = 0;
                final AudioTrack audioTrack = this.mAudioTrack;
                this.mAudioTrack = null;
                AVThreadPool.addTask(new Runnable() {
                    /* class com.ss.ttm.player.AJVoice.RunnableC654112 */

                    public void run() {
                        try {
                            Log.d(AJVoice.TAG, "release old track");
                            audioTrack.flush();
                            audioTrack.release();
                            Log.d(AJVoice.TAG, "release old track done");
                        } finally {
                            AJVoice.this.mReleasingConditionVariable.open();
                        }
                    }
                });
                this.mReleasingConditionVariable.block();
                reconfigure();
                start();
                this.mSerial = i3;
            }
        }
        int i5 = this.mStartMediaTimeMs;
        if (i5 == -1) {
            this.mStartMediaTimeMs = (int) Math.max(0L, j);
        } else {
            long writtenDurationMs = ((long) i5) + getWrittenDurationMs();
            if (Math.abs(writtenDurationMs - j) > 200) {
                Log.e(TAG, "Discontinuity detected [expected " + writtenDurationMs + ", got " + j + "]");
                this.mStartMediaTimeMs = (int) (((long) this.mStartMediaTimeMs) + (j - writtenDurationMs));
            }
        }
        try {
            int write = this.mAudioTrack.write(bArr, i, i2);
            if (write < 0) {
                Log.e(TAG, "write failed : ret: " + write + ", size = " + i2);
                return write;
            }
            this.mWrittenPcmBytes += (long) write;
            if (needsReset() && reset() == 0) {
                i4 = start();
                this.mSerial = i3;
            }
            return i4 == 0 ? write : i4;
        } catch (Exception e) {
            Log.d(TAG, "write fail = " + e);
            e.printStackTrace();
            return -1;
        }
    }

    public void setSampleInfo(int i, int i2, int i3, int i4, int i5, int i6) {
        this.mSampleRate = i2;
        this.mChannels = i3;
        this.mBlockSize = i4;
        this.mSampleBytes = i6;
        this.mSampleFormat = i;
        this.mFrameSamples = i5;
    }
}
