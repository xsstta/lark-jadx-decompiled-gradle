package com.bytedance.bae.webrtc;

import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.AudioManager;
import android.media.AudioTrack;
import android.os.Build;
import android.os.Process;
import com.bytedance.bae.base.ContextUtils;
import com.bytedance.bae.base.ExceptionUtils;
import com.bytedance.bae.base.RXLogging;
import com.bytedance.bae.base.ThreadUtils;
import java.nio.ByteBuffer;

public class WebRtcAudioTrack {
    private static final int DEFAULT_USAGE;
    private static ErrorCallback errorCallback;
    private static WebRtcAudioTrackErrorCallback errorCallbackOld;
    private static boolean sForbidVoip;
    public static volatile boolean speakerMute;
    private static int usageAttribute;
    private String apiResult = "";
    private final AudioManager audioManager;
    private AudioTrackThread audioThread;
    public AudioTrack audioTrack;
    public ByteBuffer byteBuffer;
    public byte[] emptyBytes;
    public final long nativeAudioTrack;
    private final ThreadUtils.ThreadChecker threadChecker;

    public enum AudioTrackStartErrorCode {
        AUDIO_TRACK_START_EXCEPTION,
        AUDIO_TRACK_START_STATE_MISMATCH
    }

    public interface ErrorCallback {
        void onWebRtcAudioTrackError(String str);

        void onWebRtcAudioTrackInitError(String str);

        void onWebRtcAudioTrackStartError(AudioTrackStartErrorCode audioTrackStartErrorCode, String str);
    }

    public interface WebRtcAudioTrackErrorCallback {
        void onWebRtcAudioTrackError(String str);

        void onWebRtcAudioTrackInitError(String str);

        void onWebRtcAudioTrackStartError(String str);
    }

    private int channelCountToConfiguration(int i) {
        return i == 1 ? 4 : 12;
    }

    private native void nativeCacheDirectBufferAddress(ByteBuffer byteBuffer2, long j);

    public native void nativeGetPlayoutData(int i, long j);

    private String getApiResult() {
        this.threadChecker.checkIsOnValidThread();
        return this.apiResult;
    }

    private void logMainParametersExtended() {
        logBufferSizeInFrames();
        logBufferCapacityInFrames();
    }

    private class AudioTrackThread extends Thread {
        private volatile boolean keepAlive = true;

        public void stopThread() {
            RXLogging.m14761d("WebRtcAudioTrack", "stopThread");
            this.keepAlive = false;
        }

        public void run() {
            boolean z;
            boolean z2;
            Process.setThreadPriority(-19);
            RXLogging.m14761d("WebRtcAudioTrack", "AudioTrackThread" + WebRtcAudioUtils.getThreadInfo());
            if (WebRtcAudioTrack.this.audioTrack.getPlayState() == 3) {
                z = true;
            } else {
                z = false;
            }
            WebRtcAudioTrack.assertTrue(z);
            int capacity = WebRtcAudioTrack.this.byteBuffer.capacity();
            while (this.keepAlive) {
                WebRtcAudioTrack webRtcAudioTrack = WebRtcAudioTrack.this;
                webRtcAudioTrack.nativeGetPlayoutData(capacity, webRtcAudioTrack.nativeAudioTrack);
                if (capacity <= WebRtcAudioTrack.this.byteBuffer.remaining()) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                WebRtcAudioTrack.assertTrue(z2);
                if (WebRtcAudioTrack.speakerMute) {
                    WebRtcAudioTrack.this.byteBuffer.clear();
                    WebRtcAudioTrack.this.byteBuffer.put(WebRtcAudioTrack.this.emptyBytes);
                    WebRtcAudioTrack.this.byteBuffer.position(0);
                }
                int writeBytes = writeBytes(WebRtcAudioTrack.this.audioTrack, WebRtcAudioTrack.this.byteBuffer, capacity);
                if (writeBytes != capacity) {
                    RXLogging.m14762e("WebRtcAudioTrack", "AudioTrack.write played invalid number of bytes: " + writeBytes);
                    if (writeBytes < 0) {
                        this.keepAlive = false;
                        WebRtcAudioTrack webRtcAudioTrack2 = WebRtcAudioTrack.this;
                        webRtcAudioTrack2.reportWebRtcAudioTrackError("AudioTrack.write failed: " + writeBytes);
                    }
                }
                WebRtcAudioTrack.this.byteBuffer.rewind();
            }
            if (WebRtcAudioTrack.this.audioTrack != null) {
                RXLogging.m14761d("WebRtcAudioTrack", "Calling AudioTrack.stop...");
                try {
                    WebRtcAudioTrack.this.audioTrack.stop();
                    RXLogging.m14761d("WebRtcAudioTrack", "AudioTrack.stop is done.");
                } catch (Exception e) {
                    RXLogging.m14762e("WebRtcAudioTrack", "AudioTrack.stop failed: " + e.getMessage());
                }
            }
        }

        public AudioTrackThread(String str) {
            super(str);
        }

        private int writeBytes(AudioTrack audioTrack, ByteBuffer byteBuffer, int i) {
            if (audioTrack == null) {
                return -1;
            }
            if (Build.VERSION.SDK_INT >= 21) {
                return audioTrack.write(byteBuffer, i, 0);
            }
            return audioTrack.write(byteBuffer.array(), byteBuffer.arrayOffset(), i);
        }
    }

    static {
        int defaultUsageAttribute = getDefaultUsageAttribute();
        DEFAULT_USAGE = defaultUsageAttribute;
        usageAttribute = defaultUsageAttribute;
    }

    private static int getDefaultUsageAttribute() {
        if (Build.VERSION.SDK_INT >= 21) {
            return 2;
        }
        return 0;
    }

    private int getStreamType() {
        this.threadChecker.checkIsOnValidThread();
        AudioTrack audioTrack2 = this.audioTrack;
        if (audioTrack2 == null) {
            return -1;
        }
        return audioTrack2.getStreamType();
    }

    private boolean isVolumeFixed() {
        if (Build.VERSION.SDK_INT < 21) {
            return false;
        }
        return this.audioManager.isVolumeFixed();
    }

    private int getStreamMaxVolume() {
        boolean z;
        this.threadChecker.checkIsOnValidThread();
        RXLogging.m14761d("WebRtcAudioTrack", "getStreamMaxVolume");
        if (this.audioManager != null) {
            z = true;
        } else {
            z = false;
        }
        assertTrue(z);
        return this.audioManager.getStreamMaxVolume(0);
    }

    private int getStreamVolume() {
        boolean z;
        this.threadChecker.checkIsOnValidThread();
        RXLogging.m14761d("WebRtcAudioTrack", "getStreamVolume");
        if (this.audioManager != null) {
            z = true;
        } else {
            z = false;
        }
        assertTrue(z);
        return this.audioManager.getStreamVolume(0);
    }

    private void releaseAudioResources() {
        RXLogging.m14761d("WebRtcAudioTrack", "releaseAudioResources");
        AudioTrack audioTrack2 = this.audioTrack;
        if (audioTrack2 != null) {
            audioTrack2.release();
            this.audioTrack = null;
        }
    }

    private void logBufferCapacityInFrames() {
        if (Build.VERSION.SDK_INT >= 24) {
            RXLogging.m14761d("WebRtcAudioTrack", "AudioTrack: buffer capacity in frames: " + this.audioTrack.getBufferCapacityInFrames());
        }
    }

    private void logBufferSizeInFrames() {
        if (Build.VERSION.SDK_INT >= 23) {
            RXLogging.m14761d("WebRtcAudioTrack", "AudioTrack: buffer size in frames: " + this.audioTrack.getBufferSizeInFrames());
        }
    }

    private void logUnderrunCount() {
        if (Build.VERSION.SDK_INT >= 24) {
            RXLogging.m14761d("WebRtcAudioTrack", "underrun count: " + this.audioTrack.getUnderrunCount());
        }
    }

    private void logMainParameters() {
        RXLogging.m14761d("WebRtcAudioTrack", "AudioTrack: session ID: " + this.audioTrack.getAudioSessionId() + ", channels: " + this.audioTrack.getChannelCount() + ", sample rate: " + this.audioTrack.getSampleRate() + ", max gain: " + AudioTrack.getMaxVolume());
    }

    private boolean stopPlayout() {
        boolean z;
        this.threadChecker.checkIsOnValidThread();
        RXLogging.m14761d("WebRtcAudioTrack", "stopPlayout");
        if (this.audioThread != null) {
            z = true;
        } else {
            z = false;
        }
        assertTrue(z);
        this.apiResult = "StopPlayout:";
        logUnderrunCount();
        this.audioThread.stopThread();
        RXLogging.m14761d("WebRtcAudioTrack", "Stopping the AudioTrackThread...");
        this.audioThread.interrupt();
        if (!ThreadUtils.joinUninterruptibly(this.audioThread, 2000)) {
            RXLogging.m14762e("WebRtcAudioTrack", "Join of AudioTrackThread timed out.");
            WebRtcAudioUtils.logAudioState("WebRtcAudioTrack");
            this.apiResult += "Join of AudioTrackThread timed out.";
        }
        RXLogging.m14761d("WebRtcAudioTrack", "AudioTrackThread has now been stopped.");
        this.audioThread = null;
        releaseAudioResources();
        return true;
    }

    private boolean startPlayout() {
        boolean z;
        boolean z2;
        this.threadChecker.checkIsOnValidThread();
        RXLogging.m14761d("WebRtcAudioTrack", "startPlayout");
        if (this.audioTrack != null) {
            z = true;
        } else {
            z = false;
        }
        assertTrue(z);
        if (this.audioThread == null) {
            z2 = true;
        } else {
            z2 = false;
        }
        assertTrue(z2);
        this.apiResult = "StartPlayout:";
        try {
            this.audioTrack.play();
            if (this.audioTrack.getPlayState() != 3) {
                reportWebRtcAudioTrackStartError(AudioTrackStartErrorCode.AUDIO_TRACK_START_STATE_MISMATCH, "AudioTrack.play failed - incorrect state :" + this.audioTrack.getPlayState());
                this.apiResult += "AudioTrack.play failed - incorrect state :" + this.audioTrack.getPlayState();
                releaseAudioResources();
                return false;
            }
            AudioTrackThread audioTrackThread = new AudioTrackThread("BaeTrackJavaThread");
            this.audioThread = audioTrackThread;
            audioTrackThread.start();
            return true;
        } catch (IllegalStateException e) {
            reportWebRtcAudioTrackStartError(AudioTrackStartErrorCode.AUDIO_TRACK_START_EXCEPTION, "AudioTrack.play failed: " + e.getMessage());
            releaseAudioResources();
            this.apiResult += "AudioTrack.play failed: " + e.getMessage();
            return false;
        }
    }

    public static void assertTrue(boolean z) {
        if (!z) {
            throw new AssertionError("Expected condition to be true");
        }
    }

    public static void setErrorCallback(ErrorCallback errorCallback2) {
        RXLogging.m14761d("WebRtcAudioTrack", "Set extended error callback");
        errorCallback = errorCallback2;
    }

    public static void setErrorCallback(WebRtcAudioTrackErrorCallback webRtcAudioTrackErrorCallback) {
        RXLogging.m14761d("WebRtcAudioTrack", "Set error callback (deprecated");
        errorCallbackOld = webRtcAudioTrackErrorCallback;
    }

    public static void setSpeakerMute(boolean z) {
        RXLogging.m14765w("WebRtcAudioTrack", "setSpeakerMute(" + z + ")");
        speakerMute = z;
    }

    WebRtcAudioTrack(long j) {
        ThreadUtils.ThreadChecker threadChecker2 = new ThreadUtils.ThreadChecker();
        this.threadChecker = threadChecker2;
        threadChecker2.checkIsOnValidThread();
        RXLogging.m14761d("WebRtcAudioTrack", "ctor" + WebRtcAudioUtils.getThreadInfo());
        this.nativeAudioTrack = j;
        this.audioManager = (AudioManager) ContextUtils.getApplicationContext().getSystemService("audio");
    }

    private void reportWebRtcAudioTrackInitError(String str) {
        RXLogging.m14762e("WebRtcAudioTrack", "Init playout error: " + str);
        WebRtcAudioUtils.logAudioState("WebRtcAudioTrack");
        WebRtcAudioTrackErrorCallback webRtcAudioTrackErrorCallback = errorCallbackOld;
        if (webRtcAudioTrackErrorCallback != null) {
            webRtcAudioTrackErrorCallback.onWebRtcAudioTrackInitError(str);
        }
        ErrorCallback errorCallback2 = errorCallback;
        if (errorCallback2 != null) {
            errorCallback2.onWebRtcAudioTrackInitError(str);
        }
    }

    public static synchronized void setAudioTrackUsageAttribute(int i) {
        synchronized (WebRtcAudioTrack.class) {
            RXLogging.m14765w("WebRtcAudioTrack", "Default usage attribute is changed from: " + DEFAULT_USAGE + " to " + i);
            usageAttribute = i;
        }
    }

    private boolean setStreamVolume(int i) {
        boolean z;
        this.threadChecker.checkIsOnValidThread();
        RXLogging.m14761d("WebRtcAudioTrack", "setStreamVolume(" + i + ")");
        if (this.audioManager != null) {
            z = true;
        } else {
            z = false;
        }
        assertTrue(z);
        if (isVolumeFixed()) {
            RXLogging.m14762e("WebRtcAudioTrack", "The device implements a fixed volume policy.");
            return false;
        }
        this.audioManager.setStreamVolume(0, i, 0);
        return true;
    }

    public void reportWebRtcAudioTrackError(String str) {
        RXLogging.m14762e("WebRtcAudioTrack", "Run-time playback error: " + str);
        WebRtcAudioUtils.logAudioState("WebRtcAudioTrack");
        WebRtcAudioTrackErrorCallback webRtcAudioTrackErrorCallback = errorCallbackOld;
        if (webRtcAudioTrackErrorCallback != null) {
            webRtcAudioTrackErrorCallback.onWebRtcAudioTrackError(str);
        }
        ErrorCallback errorCallback2 = errorCallback;
        if (errorCallback2 != null) {
            errorCallback2.onWebRtcAudioTrackError(str);
        }
    }

    private void reportWebRtcAudioTrackStartError(AudioTrackStartErrorCode audioTrackStartErrorCode, String str) {
        RXLogging.m14762e("WebRtcAudioTrack", "Start playout error: " + audioTrackStartErrorCode + ". " + str);
        WebRtcAudioUtils.logAudioState("WebRtcAudioTrack");
        WebRtcAudioTrackErrorCallback webRtcAudioTrackErrorCallback = errorCallbackOld;
        if (webRtcAudioTrackErrorCallback != null) {
            webRtcAudioTrackErrorCallback.onWebRtcAudioTrackStartError(str);
        }
        ErrorCallback errorCallback2 = errorCallback;
        if (errorCallback2 != null) {
            errorCallback2.onWebRtcAudioTrackStartError(audioTrackStartErrorCode, str);
        }
    }

    private static AudioTrack createAudioTrackOnLowerThanLollipop(int i, int i2, int i3) {
        if (sForbidVoip) {
            return new AudioTrack(3, i, i2, 2, i3, 1);
        }
        return new AudioTrack(0, i, i2, 2, i3, 1);
    }

    private static AudioTrack createAudioTrackOnLollipopOrHigher(int i, int i2, int i3) {
        int i4;
        RXLogging.m14761d("WebRtcAudioTrack", "createAudioTrackOnLollipopOrHigher");
        if (sForbidVoip) {
            i4 = 3;
        } else {
            i4 = 0;
        }
        int nativeOutputSampleRate = AudioTrack.getNativeOutputSampleRate(i4);
        RXLogging.m14761d("WebRtcAudioTrack", "nativeOutputSampleRate: " + nativeOutputSampleRate);
        if (i != nativeOutputSampleRate) {
            RXLogging.m14765w("WebRtcAudioTrack", "Unable to use fast mode since requested sample rate is not native");
        }
        if (sForbidVoip) {
            usageAttribute = 1;
        } else {
            usageAttribute = DEFAULT_USAGE;
        }
        if (usageAttribute != DEFAULT_USAGE) {
            RXLogging.m14765w("WebRtcAudioTrack", "A non default usage attribute is used: " + usageAttribute);
        }
        return new AudioTrack(new AudioAttributes.Builder().setUsage(usageAttribute).setContentType(1).build(), new AudioFormat.Builder().setEncoding(2).setSampleRate(i).setChannelMask(i2).build(), i3, 1, 0);
    }

    private boolean initPlayout(int i, int i2, boolean z) {
        this.apiResult = "InitPlayout(sampleRate=" + i + ", channels=" + i2 + ", forbidVoip=" + z + "):";
        sForbidVoip = z;
        try {
            this.threadChecker.checkIsOnValidThread();
            RXLogging.m14761d("WebRtcAudioTrack", "initPlayout(sampleRate=" + i + ", channels=" + i2 + ")");
            this.byteBuffer = ByteBuffer.allocateDirect(i2 * 2 * (i / 100));
            StringBuilder sb = new StringBuilder();
            sb.append("byteBuffer.capacity: ");
            sb.append(this.byteBuffer.capacity());
            RXLogging.m14761d("WebRtcAudioTrack", sb.toString());
            this.emptyBytes = new byte[this.byteBuffer.capacity()];
            nativeCacheDirectBufferAddress(this.byteBuffer, this.nativeAudioTrack);
            int channelCountToConfiguration = channelCountToConfiguration(i2);
            int minBufferSize = AudioTrack.getMinBufferSize(i, channelCountToConfiguration, 2);
            RXLogging.m14761d("WebRtcAudioTrack", "AudioTrack.getMinBufferSize: " + minBufferSize);
            if (minBufferSize < this.byteBuffer.capacity()) {
                reportWebRtcAudioTrackInitError("AudioTrack.getMinBufferSize returns an invalid value.");
                this.apiResult += "AudioTrack.getMinBufferSize returns an invalid value.";
                return false;
            } else if (this.audioTrack != null) {
                reportWebRtcAudioTrackInitError("Conflict with existing AudioTrack.");
                this.apiResult += "Conflict with existing AudioTrack.";
                return false;
            } else {
                try {
                    if (Build.VERSION.SDK_INT >= 21) {
                        this.audioTrack = createAudioTrackOnLollipopOrHigher(i, channelCountToConfiguration, minBufferSize);
                    } else {
                        this.audioTrack = createAudioTrackOnLowerThanLollipop(i, channelCountToConfiguration, minBufferSize);
                    }
                    AudioTrack audioTrack2 = this.audioTrack;
                    if (audioTrack2 == null || audioTrack2.getState() != 1) {
                        reportWebRtcAudioTrackInitError("Initialization of audio track failed.");
                        releaseAudioResources();
                        this.apiResult += "Initialization of audio track failed.";
                        return false;
                    }
                    logMainParameters();
                    logMainParametersExtended();
                    return true;
                } catch (IllegalArgumentException e) {
                    reportWebRtcAudioTrackInitError(ExceptionUtils.stackTrace(e) + e.getMessage());
                    releaseAudioResources();
                    return false;
                }
            }
        } catch (Exception e2) {
            RXLogging.m14766w("WebRtcAudioTrack", "initPlayout exception", e2);
            reportWebRtcAudioTrackInitError(ExceptionUtils.stackTrace(e2));
            this.apiResult += "initPlayout exception";
            return false;
        }
    }
}
