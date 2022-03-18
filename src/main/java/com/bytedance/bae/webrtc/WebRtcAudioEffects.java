package com.bytedance.bae.webrtc;

import android.media.audiofx.AcousticEchoCanceler;
import android.media.audiofx.AudioEffect;
import android.media.audiofx.NoiseSuppressor;
import android.os.Build;
import com.bytedance.bae.base.RXLogging;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class WebRtcAudioEffects {
    private static final UUID AOSP_ACOUSTIC_ECHO_CANCELER = UUID.fromString("bb392ec0-8d4d-11e0-a896-0002a5d5c51b");
    private static final UUID AOSP_NOISE_SUPPRESSOR = UUID.fromString("c06c8400-8e06-11e0-9cb6-0002a5d5c51b");
    private static Map<String, List<String>> audioEffectBlackList = new HashMap();
    private static AudioEffect.Descriptor[] cachedEffects;
    private AcousticEchoCanceler aec;
    private NoiseSuppressor ns;
    private boolean shouldEnableAec;
    private boolean shouldEnableNs;

    public static WebRtcAudioEffects create() {
        return new WebRtcAudioEffects();
    }

    public static boolean isAcousticEchoCancelerSupported() {
        return isAcousticEchoCancelerEffectAvailable();
    }

    public static boolean isNoiseSuppressorSupported() {
        return isNoiseSuppressorEffectAvailable();
    }

    private static AudioEffect.Descriptor[] getAvailableEffects() {
        AudioEffect.Descriptor[] descriptorArr = cachedEffects;
        if (descriptorArr != null) {
            return descriptorArr;
        }
        AudioEffect.Descriptor[] queryEffects = AudioEffect.queryEffects();
        cachedEffects = queryEffects;
        return queryEffects;
    }

    private static boolean isAcousticEchoCancelerEffectAvailable() {
        if (Build.VERSION.SDK_INT < 18) {
            return false;
        }
        return isEffectTypeAvailable(AudioEffect.EFFECT_TYPE_AEC);
    }

    private static boolean isNoiseSuppressorEffectAvailable() {
        if (Build.VERSION.SDK_INT < 18) {
            return false;
        }
        return isEffectTypeAvailable(AudioEffect.EFFECT_TYPE_NS);
    }

    private WebRtcAudioEffects() {
        RXLogging.m14761d("WebRtcAudioEffects", "ctor" + WebRtcAudioUtils.getThreadInfo());
    }

    private static void initAudioEffectBlackList() {
        audioEffectBlackList.put("vivo", new ArrayList());
        audioEffectBlackList.get("vivo").add("Funtouch OS_3.1_PD1616_D_7.17.5");
    }

    public void release() {
        RXLogging.m14761d("WebRtcAudioEffects", "release");
        AcousticEchoCanceler acousticEchoCanceler = this.aec;
        if (acousticEchoCanceler != null) {
            acousticEchoCanceler.release();
            this.aec = null;
        }
        NoiseSuppressor noiseSuppressor = this.ns;
        if (noiseSuppressor != null) {
            noiseSuppressor.release();
            this.ns = null;
        }
    }

    public static boolean canUseAcousticEchoCanceler() {
        boolean z;
        if (!isAcousticEchoCancelerSupported() || WebRtcAudioUtils.useWebRtcBasedAcousticEchoCanceler() || isAcousticEchoCancelerBlacklisted() || isAcousticEchoCancelerExcludedByUUID()) {
            z = false;
        } else {
            z = true;
        }
        RXLogging.m14761d("WebRtcAudioEffects", "canUseAcousticEchoCanceler: " + z);
        return z;
    }

    public static boolean canUseNoiseSuppressor() {
        boolean z;
        if (!isNoiseSuppressorSupported() || WebRtcAudioUtils.useWebRtcBasedNoiseSuppressor() || isNoiseSuppressorBlacklisted() || isNoiseSuppressorExcludedByUUID()) {
            z = false;
        } else {
            z = true;
        }
        RXLogging.m14761d("WebRtcAudioEffects", "canUseNoiseSuppressor: " + z);
        return z;
    }

    public static boolean isAcousticEchoCancelerBlacklisted() {
        boolean contains = WebRtcAudioUtils.getBlackListedModelsForAecUsage().contains(Build.MODEL);
        if (contains) {
            RXLogging.m14765w("WebRtcAudioEffects", Build.MODEL + " is blacklisted for HW AEC usage!");
        }
        return contains;
    }

    private static boolean isAcousticEchoCancelerExcludedByUUID() {
        if (Build.VERSION.SDK_INT < 18) {
            return false;
        }
        AudioEffect.Descriptor[] availableEffects = getAvailableEffects();
        for (AudioEffect.Descriptor descriptor : availableEffects) {
            if (descriptor.type.equals(AudioEffect.EFFECT_TYPE_AEC) && descriptor.uuid.equals(AOSP_ACOUSTIC_ECHO_CANCELER)) {
                return true;
            }
        }
        return false;
    }

    public static boolean isNoiseSuppressorBlacklisted() {
        boolean contains = WebRtcAudioUtils.getBlackListedModelsForNsUsage().contains(Build.MODEL);
        if (contains) {
            RXLogging.m14765w("WebRtcAudioEffects", Build.MODEL + " is blacklisted for HW NS usage!");
        }
        return contains;
    }

    private static boolean isNoiseSuppressorExcludedByUUID() {
        if (Build.VERSION.SDK_INT < 18) {
            return false;
        }
        AudioEffect.Descriptor[] availableEffects = getAvailableEffects();
        for (AudioEffect.Descriptor descriptor : availableEffects) {
            if (descriptor.type.equals(AudioEffect.EFFECT_TYPE_NS) && descriptor.uuid.equals(AOSP_NOISE_SUPPRESSOR)) {
                return true;
            }
        }
        return false;
    }

    public static boolean IsAudioEffectSupported() {
        if (audioEffectBlackList.isEmpty()) {
            initAudioEffectBlackList();
        }
        String productBrand = WebRtcAudioUtils.getProductBrand();
        if (productBrand.isEmpty() || !audioEffectBlackList.containsKey(productBrand)) {
            return true;
        }
        String romVersion = WebRtcAudioUtils.getRomVersion(productBrand);
        boolean contains = audioEffectBlackList.get(productBrand).contains(romVersion);
        RXLogging.m14765w("WebRtcAudioEffects", "IsAudioEffectSupported, " + productBrand + ", " + romVersion + ", in black list = " + contains);
        return !contains;
    }

    private static void assertTrue(boolean z) {
        if (!z) {
            throw new AssertionError("Expected condition to be true");
        }
    }

    private static boolean isEffectTypeAvailable(UUID uuid) {
        AudioEffect.Descriptor[] availableEffects = getAvailableEffects();
        if (availableEffects == null) {
            return false;
        }
        for (AudioEffect.Descriptor descriptor : availableEffects) {
            if (descriptor.type.equals(uuid)) {
                return true;
            }
        }
        return false;
    }

    private boolean effectTypeIsVoIP(UUID uuid) {
        if (Build.VERSION.SDK_INT < 18) {
            return false;
        }
        if ((!AudioEffect.EFFECT_TYPE_AEC.equals(uuid) || !isAcousticEchoCancelerSupported()) && (!AudioEffect.EFFECT_TYPE_NS.equals(uuid) || !isNoiseSuppressorSupported())) {
            return false;
        }
        return true;
    }

    public boolean setAEC(boolean z) {
        RXLogging.m14761d("WebRtcAudioEffects", "setAEC(" + z + ")");
        if (!canUseAcousticEchoCanceler()) {
            RXLogging.m14765w("WebRtcAudioEffects", "Platform AEC is not supported");
            this.shouldEnableAec = false;
            return false;
        } else if (this.aec == null || z == this.shouldEnableAec) {
            this.shouldEnableAec = z;
            return true;
        } else {
            RXLogging.m14762e("WebRtcAudioEffects", "Platform AEC state can't be modified while recording");
            return false;
        }
    }

    public boolean setNS(boolean z) {
        RXLogging.m14761d("WebRtcAudioEffects", "setNS(" + z + ")");
        if (!canUseNoiseSuppressor()) {
            RXLogging.m14765w("WebRtcAudioEffects", "Platform NS is not supported");
            this.shouldEnableNs = false;
            return false;
        } else if (this.ns == null || z == this.shouldEnableNs) {
            this.shouldEnableNs = z;
            return true;
        } else {
            RXLogging.m14762e("WebRtcAudioEffects", "Platform NS state can't be modified while recording");
            return false;
        }
    }

    public void enable(int i) {
        boolean z;
        boolean z2;
        String str;
        boolean z3;
        String str2;
        String str3;
        RXLogging.m14761d("WebRtcAudioEffects", "enable(audioSession=" + i + ")");
        boolean z4 = true;
        if (this.aec == null) {
            z = true;
        } else {
            z = false;
        }
        assertTrue(z);
        if (this.ns == null) {
            z2 = true;
        } else {
            z2 = false;
        }
        assertTrue(z2);
        String str4 = "enabled";
        if (isAcousticEchoCancelerSupported()) {
            AcousticEchoCanceler create = AcousticEchoCanceler.create(i);
            this.aec = create;
            if (create != null) {
                boolean enabled = create.getEnabled();
                if (!this.shouldEnableAec || !canUseAcousticEchoCanceler()) {
                    z3 = false;
                } else {
                    z3 = true;
                }
                if (this.aec.setEnabled(z3) != 0) {
                    RXLogging.m14762e("WebRtcAudioEffects", "Failed to set the AcousticEchoCanceler state");
                }
                StringBuilder sb = new StringBuilder();
                sb.append("AcousticEchoCanceler: was ");
                if (enabled) {
                    str2 = str4;
                } else {
                    str2 = "disabled";
                }
                sb.append(str2);
                sb.append(", enable: ");
                sb.append(z3);
                sb.append(", is now: ");
                if (this.aec.getEnabled()) {
                    str3 = str4;
                } else {
                    str3 = "disabled";
                }
                sb.append(str3);
                RXLogging.m14761d("WebRtcAudioEffects", sb.toString());
            } else {
                RXLogging.m14762e("WebRtcAudioEffects", "Failed to create the AcousticEchoCanceler instance");
            }
        }
        if (isNoiseSuppressorSupported()) {
            NoiseSuppressor create2 = NoiseSuppressor.create(i);
            this.ns = create2;
            if (create2 != null) {
                boolean enabled2 = create2.getEnabled();
                if (!this.shouldEnableNs || !canUseNoiseSuppressor()) {
                    z4 = false;
                }
                if (this.ns.setEnabled(z4) != 0) {
                    RXLogging.m14762e("WebRtcAudioEffects", "Failed to set the NoiseSuppressor state");
                }
                StringBuilder sb2 = new StringBuilder();
                sb2.append("NoiseSuppressor: was ");
                if (enabled2) {
                    str = str4;
                } else {
                    str = "disabled";
                }
                sb2.append(str);
                sb2.append(", enable: ");
                sb2.append(z4);
                sb2.append(", is now: ");
                if (!this.ns.getEnabled()) {
                    str4 = "disabled";
                }
                sb2.append(str4);
                RXLogging.m14761d("WebRtcAudioEffects", sb2.toString());
                return;
            }
            RXLogging.m14762e("WebRtcAudioEffects", "Failed to create the NoiseSuppressor instance");
        }
    }
}
