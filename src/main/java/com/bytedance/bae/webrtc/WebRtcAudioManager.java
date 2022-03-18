package com.bytedance.bae.webrtc;

import android.media.AudioManager;
import android.media.AudioRecord;
import android.media.AudioTrack;
import android.os.Build;
import com.bytedance.bae.base.ContextUtils;
import com.bytedance.bae.base.RXLogging;
import com.huawei.hms.feature.dynamic.DynamicModule;
import com.huawei.hms.support.api.entity.core.JosStatusCodes;
import java.io.PrintWriter;
import java.io.StringWriter;

public class WebRtcAudioManager {
    private static boolean blacklistDeviceForOpenSLESUsage;
    private static boolean blacklistDeviceForOpenSLESUsageIsOverridden;
    private static boolean useStereoInput;
    private static boolean useStereoOutput;
    private boolean aAudio;
    private final AudioManager audioManager = ((AudioManager) ContextUtils.getApplicationContext().getSystemService("audio"));
    private boolean hardwareAEC;
    private boolean hardwareAGC;
    private boolean hardwareNS;
    private boolean initialized;
    private int inputBufferSize;
    private int inputChannels;
    private boolean lowLatencyInput;
    private boolean lowLatencyOutput;
    private final long nativeAudioManager;
    private int nativeChannels;
    private int nativeSampleRate;
    private int outputBufferSize;
    private int outputChannels;
    private boolean proAudio;
    private int sampleRate;

    private native void nativeCacheAudioParameters(int i, int i2, int i3, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, int i4, int i5, long j);

    private static boolean isAcousticEchoCancelerSupported() {
        return WebRtcAudioEffects.canUseAcousticEchoCanceler();
    }

    private static boolean isNoiseSuppressorSupported() {
        return WebRtcAudioEffects.canUseNoiseSuppressor();
    }

    private boolean isPermissionGranted() {
        return WebRtcAudioUtils.isPermissionGranted();
    }

    private boolean isWiredHeadsetOn() {
        return this.audioManager.isWiredHeadsetOn();
    }

    private int getLowLatencyInputFramesPerBuffer() {
        assertTrue(isLowLatencyInputSupported());
        return getLowLatencyOutputFramesPerBuffer();
    }

    public static synchronized boolean getStereoInput() {
        boolean z;
        synchronized (WebRtcAudioManager.class) {
            z = useStereoInput;
        }
        return z;
    }

    public static synchronized boolean getStereoOutput() {
        boolean z;
        synchronized (WebRtcAudioManager.class) {
            z = useStereoOutput;
        }
        return z;
    }

    private boolean hasEarpiece() {
        return ContextUtils.getApplicationContext().getPackageManager().hasSystemFeature("android.hardware.telephony");
    }

    private boolean isAAudioSupported() {
        RXLogging.m14765w("WebRtcAudioManager", "AAudio support is currently disabled on all devices!");
        return false;
    }

    private boolean isCommunicationModeEnabled() {
        if (this.audioManager.getMode() == 3) {
            return true;
        }
        return false;
    }

    private boolean isLowLatencyOutputSupported() {
        return ContextUtils.getApplicationContext().getPackageManager().hasSystemFeature("android.hardware.audio.low_latency");
    }

    public boolean isLowLatencyInputSupported() {
        if (Build.VERSION.SDK_INT < 21 || !isLowLatencyOutputSupported()) {
            return false;
        }
        return true;
    }

    private int getLowLatencyOutputFramesPerBuffer() {
        String property;
        assertTrue(isLowLatencyOutputSupported());
        if (Build.VERSION.SDK_INT >= 17 && (property = this.audioManager.getProperty("android.media.property.OUTPUT_FRAMES_PER_BUFFER")) != null) {
            return Integer.parseInt(property);
        }
        return DynamicModule.f58006b;
    }

    private int getMode() {
        try {
            return this.audioManager.getMode();
        } catch (Exception e) {
            StringWriter stringWriter = new StringWriter();
            e.printStackTrace(new PrintWriter(stringWriter));
            RXLogging.m14762e("WebRtcAudioManager", stringWriter.toString());
            return -1;
        }
    }

    private int getSampleRateForApiLevel() {
        if (Build.VERSION.SDK_INT < 17) {
            return WebRtcAudioUtils.getDefaultSampleRateHz();
        }
        String property = this.audioManager.getProperty("android.media.property.OUTPUT_SAMPLE_RATE");
        if (property == null) {
            return WebRtcAudioUtils.getDefaultSampleRateHz();
        }
        return Integer.parseInt(property);
    }

    private boolean isOpenSLESRecordShouldUseVoiceRecognition() {
        if (!Build.BRAND.equals("samsung") || Build.VERSION.SDK_INT < 21) {
            return false;
        }
        return true;
    }

    private boolean isProAudioSupported() {
        if (Build.VERSION.SDK_INT < 23 || !ContextUtils.getApplicationContext().getPackageManager().hasSystemFeature("android.hardware.audio.pro")) {
            return false;
        }
        return true;
    }

    private int getFixedDeviceRecordVolume() {
        try {
            if (this.audioManager.isMicrophoneMute()) {
                return 0;
            }
            return 100;
        } catch (Exception e) {
            StringWriter stringWriter = new StringWriter();
            e.printStackTrace(new PrintWriter(stringWriter));
            RXLogging.m14762e("WebRtcAudioManager", stringWriter.toString());
            return -1;
        }
    }

    private boolean isDeviceBlacklistedForOpenSLESUsage() {
        boolean z;
        if (blacklistDeviceForOpenSLESUsageIsOverridden) {
            z = blacklistDeviceForOpenSLESUsage;
        } else {
            z = WebRtcAudioUtils.deviceIsBlacklistedForOpenSLESUsage();
        }
        if (z) {
            RXLogging.m14761d("WebRtcAudioManager", Build.MODEL + " is blacklisted for OpenSL ES usage!");
        }
        return z;
    }

    private int getFixedDevicePlayVolume() {
        try {
            int mode = this.audioManager.getMode();
            int i = 2;
            if (mode != 0) {
                if (mode != 1) {
                    if (mode == 2 || mode == 3) {
                        i = 0;
                    }
                }
                return (int) ((((double) this.audioManager.getStreamVolume(i)) * 100.0d) / ((double) this.audioManager.getStreamMaxVolume(i)));
            }
            i = 3;
            return (int) ((((double) this.audioManager.getStreamVolume(i)) * 100.0d) / ((double) this.audioManager.getStreamMaxVolume(i)));
        } catch (Exception e) {
            StringWriter stringWriter = new StringWriter();
            e.printStackTrace(new PrintWriter(stringWriter));
            RXLogging.m14762e("WebRtcAudioManager", stringWriter.toString());
            return -1;
        }
    }

    private int getNativeOutputSampleRate() {
        if (WebRtcAudioUtils.runningOnEmulator()) {
            RXLogging.m14761d("WebRtcAudioManager", "Running emulator, overriding sample rate to 8 kHz.");
            return JosStatusCodes.RTN_CODE_COMMON_ERROR;
        } else if (WebRtcAudioUtils.isDefaultSampleRateOverridden()) {
            RXLogging.m14761d("WebRtcAudioManager", "Default sample rate is overriden to " + WebRtcAudioUtils.getDefaultSampleRateHz() + " Hz");
            return WebRtcAudioUtils.getDefaultSampleRateHz();
        } else {
            int defaultSampleRateHz = WebRtcAudioUtils.getDefaultSampleRateHz();
            RXLogging.m14761d("WebRtcAudioManager", "Sample rate is set to " + defaultSampleRateHz + " Hz");
            return defaultSampleRateHz;
        }
    }

    private boolean init() {
        RXLogging.m14761d("WebRtcAudioManager", "init" + WebRtcAudioUtils.getThreadInfo());
        if (this.initialized) {
            return true;
        }
        RXLogging.m14761d("WebRtcAudioManager", "audio mode is: " + WebRtcAudioUtils.modeToString(this.audioManager.getMode()));
        this.initialized = true;
        return true;
    }

    private void storeAudioParameters() {
        int i;
        int i2;
        int i3;
        int i4 = 2;
        if (getStereoOutput()) {
            i = 2;
        } else {
            i = 1;
        }
        this.outputChannels = i;
        if (!getStereoInput()) {
            i4 = 1;
        }
        this.inputChannels = i4;
        this.sampleRate = getNativeOutputSampleRate();
        this.hardwareAEC = isAcousticEchoCancelerSupported();
        this.hardwareAGC = false;
        this.hardwareNS = isNoiseSuppressorSupported();
        this.lowLatencyOutput = isLowLatencyOutputSupported();
        this.lowLatencyInput = isLowLatencyInputSupported();
        this.proAudio = isProAudioSupported();
        this.aAudio = isAAudioSupported();
        if (this.lowLatencyOutput) {
            i2 = getLowLatencyOutputFramesPerBuffer();
        } else {
            i2 = getMinOutputFrameSize(this.sampleRate, this.outputChannels);
        }
        this.outputBufferSize = i2;
        if (this.lowLatencyInput) {
            i3 = getLowLatencyInputFramesPerBuffer();
        } else {
            i3 = getMinInputFrameSize(this.sampleRate, this.inputChannels);
        }
        this.inputBufferSize = i3;
    }

    private String getAudioDeviceInfo() {
        try {
            return "{ Audio State: audio mode: " + WebRtcAudioUtils.modeToString(this.audioManager.getMode()) + ", has mic: " + WebRtcAudioUtils.hasMicrophone() + ", mic muted: " + this.audioManager.isMicrophoneMute() + ", music active: " + this.audioManager.isMusicActive() + ", speakerphone: " + this.audioManager.isSpeakerphoneOn() + ", headset: " + this.audioManager.isWiredHeadsetOn() + "BT SCO: " + this.audioManager.isBluetoothScoOn() + "music actived: " + this.audioManager.isMusicActive() + "permission: " + WebRtcAudioUtils.isPermissionGranted() + " bt_sco_available_off_call: " + this.audioManager.isBluetoothScoAvailableOffCall() + " }";
        } catch (Exception e) {
            StringWriter stringWriter = new StringWriter();
            e.printStackTrace(new PrintWriter(stringWriter));
            RXLogging.m14762e("WebRtcAudioManager", stringWriter.toString());
            return stringWriter.toString();
        }
    }

    private int SetAudioMode(int i) {
        try {
            this.audioManager.setMode(i);
            return 0;
        } catch (Exception e) {
            e.printStackTrace();
            return -1;
        }
    }

    private static void assertTrue(boolean z) {
        if (!z) {
            throw new AssertionError("Expected condition to be true");
        }
    }

    public static synchronized void setBlacklistDeviceForOpenSLESUsage(boolean z) {
        synchronized (WebRtcAudioManager.class) {
            blacklistDeviceForOpenSLESUsageIsOverridden = true;
            blacklistDeviceForOpenSLESUsage = z;
        }
    }

    public static synchronized void setStereoInput(boolean z) {
        synchronized (WebRtcAudioManager.class) {
            RXLogging.m14765w("WebRtcAudioManager", "Overriding default input behavior: setStereoInput(" + z + ')');
            useStereoInput = z;
        }
    }

    public static synchronized void setStereoOutput(boolean z) {
        synchronized (WebRtcAudioManager.class) {
            RXLogging.m14765w("WebRtcAudioManager", "Overriding default output behavior: setStereoOutput(" + z + ')');
            useStereoOutput = z;
        }
    }

    WebRtcAudioManager(long j) {
        RXLogging.m14761d("WebRtcAudioManager", "ctor" + WebRtcAudioUtils.getThreadInfo());
        this.nativeAudioManager = j;
        storeAudioParameters();
        nativeCacheAudioParameters(this.sampleRate, this.outputChannels, this.inputChannels, this.hardwareAEC, this.hardwareAGC, this.hardwareNS, this.lowLatencyOutput, this.lowLatencyInput, this.proAudio, this.aAudio, this.outputBufferSize, this.inputBufferSize, j);
        WebRtcAudioUtils.logAudioState("WebRtcAudioManager");
    }

    private static int getMinOutputFrameSize(int i, int i2) {
        int i3;
        int i4 = i2 * 2;
        if (i2 == 1) {
            i3 = 4;
        } else {
            i3 = 12;
        }
        return AudioTrack.getMinBufferSize(i, i3, 2) / i4;
    }

    private static int getMinInputFrameSize(int i, int i2) {
        int i3;
        int i4 = i2 * 2;
        if (i2 == 1) {
            i3 = 16;
        } else {
            i3 = 12;
        }
        return AudioRecord.getMinBufferSize(i, i3, 2) / i4;
    }
}
