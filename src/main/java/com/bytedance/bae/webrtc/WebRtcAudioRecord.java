package com.bytedance.bae.webrtc;

import android.media.AudioRecord;
import android.os.Build;
import android.os.Process;
import com.bytedance.bae.base.RXLogging;
import com.bytedance.bae.base.ThreadUtils;
import java.nio.ByteBuffer;
import java.util.Arrays;

public class WebRtcAudioRecord {
    private static final int DEFAULT_AUDIO_SOURCE;
    public static WebRtcAudioRecordSamplesReadyCallback audioSamplesReadyCallback;
    private static int audioSource;
    private static WebRtcAudioRecordErrorCallback errorCallback;
    public static volatile boolean microphoneMute;
    private String apiResult = "";
    public AudioRecord audioRecord;
    private AudioRecordThread audioThread;
    public ByteBuffer byteBuffer;
    private WebRtcAudioEffects effects;
    public byte[] emptyBytes;
    public final long nativeAudioRecord;

    public enum AudioRecordStartErrorCode {
        AUDIO_RECORD_START_EXCEPTION,
        AUDIO_RECORD_START_STATE_MISMATCH
    }

    public interface WebRtcAudioRecordErrorCallback {
        void onWebRtcAudioRecordError(String str);

        void onWebRtcAudioRecordInitError(String str);

        void onWebRtcAudioRecordStartError(AudioRecordStartErrorCode audioRecordStartErrorCode, String str);
    }

    public interface WebRtcAudioRecordSamplesReadyCallback {
        void onWebRtcAudioRecordSamplesReady(AudioSamples audioSamples);
    }

    private int channelCountToConfiguration(int i) {
        return i == 1 ? 16 : 12;
    }

    private static int getDefaultAudioSource() {
        return 7;
    }

    private native void nativeCacheDirectBufferAddress(ByteBuffer byteBuffer2, long j);

    public native void nativeDataIsRecorded(int i, long j);

    public static class AudioSamples {
        private final int audioFormat;
        private final int channelCount;
        private final byte[] data;
        private final int sampleRate;

        public int getAudioFormat() {
            return this.audioFormat;
        }

        public int getChannelCount() {
            return this.channelCount;
        }

        public byte[] getData() {
            return this.data;
        }

        public int getSampleRate() {
            return this.sampleRate;
        }

        private AudioSamples(AudioRecord audioRecord, byte[] bArr) {
            this.audioFormat = audioRecord.getAudioFormat();
            this.channelCount = audioRecord.getChannelCount();
            this.sampleRate = audioRecord.getSampleRate();
            this.data = bArr;
        }
    }

    private String getApiResult() {
        return this.apiResult;
    }

    private class AudioRecordThread extends Thread {
        private volatile boolean keepAlive = true;

        public void stopThread() {
            RXLogging.m14761d("WebRtcAudioRecord", "stopThread");
            this.keepAlive = false;
        }

        public void run() {
            boolean z;
            Process.setThreadPriority(-19);
            RXLogging.m14761d("WebRtcAudioRecord", "AudioRecordThread" + WebRtcAudioUtils.getThreadInfo());
            if (WebRtcAudioRecord.this.audioRecord.getRecordingState() == 3) {
                z = true;
            } else {
                z = false;
            }
            WebRtcAudioRecord.assertTrue(z);
            System.nanoTime();
            while (this.keepAlive) {
                int read = WebRtcAudioRecord.this.audioRecord.read(WebRtcAudioRecord.this.byteBuffer, WebRtcAudioRecord.this.byteBuffer.capacity());
                if (read == WebRtcAudioRecord.this.byteBuffer.capacity()) {
                    if (WebRtcAudioRecord.microphoneMute) {
                        WebRtcAudioRecord.this.byteBuffer.clear();
                        WebRtcAudioRecord.this.byteBuffer.put(WebRtcAudioRecord.this.emptyBytes);
                    }
                    if (this.keepAlive) {
                        WebRtcAudioRecord webRtcAudioRecord = WebRtcAudioRecord.this;
                        webRtcAudioRecord.nativeDataIsRecorded(read, webRtcAudioRecord.nativeAudioRecord);
                    }
                    if (WebRtcAudioRecord.audioSamplesReadyCallback != null) {
                        WebRtcAudioRecord.audioSamplesReadyCallback.onWebRtcAudioRecordSamplesReady(new AudioSamples(WebRtcAudioRecord.this.audioRecord, Arrays.copyOf(WebRtcAudioRecord.this.byteBuffer.array(), WebRtcAudioRecord.this.byteBuffer.capacity())));
                    }
                } else {
                    String str = "AudioRecord.read failed: " + read;
                    RXLogging.m14762e("WebRtcAudioRecord", str);
                    if (read == -3) {
                        this.keepAlive = false;
                        WebRtcAudioRecord.this.reportWebRtcAudioRecordError(str);
                    }
                }
            }
            try {
                if (WebRtcAudioRecord.this.audioRecord != null) {
                    WebRtcAudioRecord.this.audioRecord.stop();
                }
            } catch (Exception e) {
                RXLogging.m14762e("WebRtcAudioRecord", "AudioRecord.stop failed: " + e.getMessage());
            }
        }

        public AudioRecordThread(String str) {
            super(str);
        }
    }

    static {
        int defaultAudioSource = getDefaultAudioSource();
        DEFAULT_AUDIO_SOURCE = defaultAudioSource;
        audioSource = defaultAudioSource;
    }

    private int getAudioSource() {
        AudioRecord audioRecord2 = this.audioRecord;
        if (audioRecord2 == null) {
            return -1;
        }
        return audioRecord2.getAudioSource();
    }

    private void releaseAudioResources() {
        RXLogging.m14761d("WebRtcAudioRecord", "releaseAudioResources");
        AudioRecord audioRecord2 = this.audioRecord;
        if (audioRecord2 != null) {
            audioRecord2.release();
            this.audioRecord = null;
        }
    }

    private void logMainParameters() {
        RXLogging.m14761d("WebRtcAudioRecord", "AudioRecord: session ID: " + this.audioRecord.getAudioSessionId() + ", channels: " + this.audioRecord.getChannelCount() + ", sample rate: " + this.audioRecord.getSampleRate());
    }

    private void logMainParametersExtended() {
        if (Build.VERSION.SDK_INT >= 23) {
            RXLogging.m14761d("WebRtcAudioRecord", "AudioRecord: buffer size in frames: " + this.audioRecord.getBufferSizeInFrames());
        }
    }

    private boolean stopRecording() {
        boolean z;
        this.apiResult = "StopRecording:";
        RXLogging.m14761d("WebRtcAudioRecord", "StopRecording:");
        if (this.audioThread != null) {
            z = true;
        } else {
            z = false;
        }
        assertTrue(z);
        this.audioThread.stopThread();
        if (!ThreadUtils.joinUninterruptibly(this.audioThread, 2000)) {
            RXLogging.m14762e("WebRtcAudioRecord", "Join of AudioRecordJavaThread timed out");
            WebRtcAudioUtils.logAudioState("WebRtcAudioRecord");
            this.apiResult += "Join of AudioRecordJavaThread timed out";
        }
        this.audioThread = null;
        WebRtcAudioEffects webRtcAudioEffects = this.effects;
        if (webRtcAudioEffects != null) {
            webRtcAudioEffects.release();
        }
        releaseAudioResources();
        return true;
    }

    private boolean startRecording() {
        boolean z;
        boolean z2;
        this.apiResult = "StartRecording:";
        RXLogging.m14761d("WebRtcAudioRecord", "StartRecording:");
        if (this.audioRecord != null) {
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
        try {
            this.audioRecord.startRecording();
            if (this.audioRecord.getRecordingState() != 3) {
                reportWebRtcAudioRecordStartError(AudioRecordStartErrorCode.AUDIO_RECORD_START_STATE_MISMATCH, "AudioRecord.startRecording failed - incorrect state :" + this.audioRecord.getRecordingState());
                this.apiResult += "AudioRecord.startRecording failed - incorrect state :" + this.audioRecord.getRecordingState();
                WebRtcAudioEffects webRtcAudioEffects = this.effects;
                if (webRtcAudioEffects != null) {
                    webRtcAudioEffects.release();
                }
                releaseAudioResources();
                return false;
            }
            AudioRecordThread audioRecordThread = new AudioRecordThread("BaeRecordJavaThread");
            this.audioThread = audioRecordThread;
            audioRecordThread.start();
            return true;
        } catch (IllegalStateException e) {
            reportWebRtcAudioRecordStartError(AudioRecordStartErrorCode.AUDIO_RECORD_START_EXCEPTION, "AudioRecord.startRecording failed: " + e.getMessage());
            this.apiResult += "AudioRecord.startRecording failed: " + e.getMessage();
            releaseAudioResources();
            return false;
        }
    }

    public static void setOnAudioSamplesReady(WebRtcAudioRecordSamplesReadyCallback webRtcAudioRecordSamplesReadyCallback) {
        audioSamplesReadyCallback = webRtcAudioRecordSamplesReadyCallback;
    }

    public static void assertTrue(boolean z) {
        if (!z) {
            throw new AssertionError("Expected condition to be true");
        }
    }

    public static void setErrorCallback(WebRtcAudioRecordErrorCallback webRtcAudioRecordErrorCallback) {
        RXLogging.m14761d("WebRtcAudioRecord", "Set error callback");
        errorCallback = webRtcAudioRecordErrorCallback;
    }

    public static void setMicrophoneMute(boolean z) {
        RXLogging.m14765w("WebRtcAudioRecord", "setMicrophoneMute(" + z + ")");
        microphoneMute = z;
    }

    WebRtcAudioRecord(long j) {
        RXLogging.m14761d("WebRtcAudioRecord", "ctor" + WebRtcAudioUtils.getThreadInfo());
        this.nativeAudioRecord = j;
        if (WebRtcAudioEffects.IsAudioEffectSupported()) {
            this.effects = WebRtcAudioEffects.create();
        }
    }

    private boolean enableBuiltInAEC(boolean z) {
        RXLogging.m14761d("WebRtcAudioRecord", "enableBuiltInAEC(" + z + ')');
        WebRtcAudioEffects webRtcAudioEffects = this.effects;
        if (webRtcAudioEffects != null) {
            return webRtcAudioEffects.setAEC(z);
        }
        RXLogging.m14762e("WebRtcAudioRecord", "Built-in AEC is not supported on this platform");
        return false;
    }

    private boolean enableBuiltInNS(boolean z) {
        RXLogging.m14761d("WebRtcAudioRecord", "enableBuiltInNS(" + z + ')');
        WebRtcAudioEffects webRtcAudioEffects = this.effects;
        if (webRtcAudioEffects != null) {
            return webRtcAudioEffects.setNS(z);
        }
        RXLogging.m14762e("WebRtcAudioRecord", "Built-in NS is not supported on this platform");
        return false;
    }

    private void reportWebRtcAudioRecordInitError(String str) {
        RXLogging.m14762e("WebRtcAudioRecord", "Init recording error: " + str);
        WebRtcAudioUtils.logAudioState("WebRtcAudioRecord");
        WebRtcAudioRecordErrorCallback webRtcAudioRecordErrorCallback = errorCallback;
        if (webRtcAudioRecordErrorCallback != null) {
            webRtcAudioRecordErrorCallback.onWebRtcAudioRecordInitError(str);
        }
    }

    public static synchronized void setAudioSource(int i) {
        synchronized (WebRtcAudioRecord.class) {
            RXLogging.m14765w("WebRtcAudioRecord", "Audio source is changed from: " + audioSource + " to " + i);
            audioSource = i;
        }
    }

    public void reportWebRtcAudioRecordError(String str) {
        RXLogging.m14762e("WebRtcAudioRecord", "Run-time recording error: " + str);
        WebRtcAudioUtils.logAudioState("WebRtcAudioRecord");
        WebRtcAudioRecordErrorCallback webRtcAudioRecordErrorCallback = errorCallback;
        if (webRtcAudioRecordErrorCallback != null) {
            webRtcAudioRecordErrorCallback.onWebRtcAudioRecordError(str);
        }
    }

    private void reportWebRtcAudioRecordStartError(AudioRecordStartErrorCode audioRecordStartErrorCode, String str) {
        RXLogging.m14762e("WebRtcAudioRecord", "Start recording error: " + audioRecordStartErrorCode + ". " + str);
        WebRtcAudioUtils.logAudioState("WebRtcAudioRecord");
        WebRtcAudioRecordErrorCallback webRtcAudioRecordErrorCallback = errorCallback;
        if (webRtcAudioRecordErrorCallback != null) {
            webRtcAudioRecordErrorCallback.onWebRtcAudioRecordStartError(audioRecordStartErrorCode, str);
        }
    }

    private int initRecording(int i, int i2, boolean z) {
        int i3;
        String str = "InitRecording(sampleRate=" + i + ", channels=" + i2 + ", forbidVoip=" + z + "):";
        this.apiResult = str;
        RXLogging.m14761d("WebRtcAudioRecord", str);
        if (this.audioRecord != null) {
            reportWebRtcAudioRecordInitError("InitRecording called twice without StopRecording.");
            return -1;
        }
        int i4 = i / 100;
        this.byteBuffer = ByteBuffer.allocateDirect(i2 * 2 * i4);
        RXLogging.m14761d("WebRtcAudioRecord", "byteBuffer.capacity: " + this.byteBuffer.capacity());
        this.emptyBytes = new byte[this.byteBuffer.capacity()];
        nativeCacheDirectBufferAddress(this.byteBuffer, this.nativeAudioRecord);
        int channelCountToConfiguration = channelCountToConfiguration(i2);
        int minBufferSize = AudioRecord.getMinBufferSize(i, channelCountToConfiguration, 2);
        if (minBufferSize == -1 || minBufferSize == -2) {
            reportWebRtcAudioRecordInitError("AudioRecord.getMinBufferSize failed: " + minBufferSize);
            this.apiResult += "AudioRecord.getMinBufferSize failed: " + minBufferSize;
            return -1;
        }
        RXLogging.m14761d("WebRtcAudioRecord", "AudioRecord.getMinBufferSize: " + minBufferSize);
        int max = Math.max(minBufferSize * 2, this.byteBuffer.capacity());
        RXLogging.m14761d("WebRtcAudioRecord", "bufferSizeInBytes: " + max);
        try {
            if (z) {
                i3 = 0;
            } else {
                i3 = audioSource;
            }
            AudioRecord audioRecord2 = new AudioRecord(i3, i, channelCountToConfiguration, 2, max);
            this.audioRecord = audioRecord2;
            if (audioRecord2.getState() != 1) {
                reportWebRtcAudioRecordInitError("Failed to create a new AudioRecord instance");
                releaseAudioResources();
                this.apiResult += "Failed to create a new AudioRecord instance";
                return -1;
            }
            WebRtcAudioEffects webRtcAudioEffects = this.effects;
            if (webRtcAudioEffects != null) {
                webRtcAudioEffects.enable(this.audioRecord.getAudioSessionId());
            }
            logMainParameters();
            logMainParametersExtended();
            return i4;
        } catch (IllegalArgumentException e) {
            reportWebRtcAudioRecordInitError("AudioRecord ctor error: " + e.getMessage());
            releaseAudioResources();
            this.apiResult += "AudioRecord ctor error: " + e.getMessage();
            return -1;
        }
    }
}
