package com.ss.ttm.player;

import android.media.audiofx.AudioEffect;
import android.os.Build;
import com.huawei.hms.support.api.entity.core.JosStatusCodes;

public class AudioFormats {
    private static boolean sDetectDlbDevices;
    private static boolean sDlbDevice;
    private static final int[] validSampleRates = {4000, JosStatusCodes.RTN_CODE_COMMON_ERROR, 11025, 16000, 22050, 32000, 37800, 44056, 44100, 47250, 48000, 50000, 50400, 88200, 96000, 176400, 192000, 352800, 2822400, 5644800};

    public static int getDefaultSampleRatesNB() {
        return validSampleRates.length;
    }

    public static boolean isLicencedDolbyDevice() {
        if (sDetectDlbDevices) {
            return sDlbDevice;
        }
        AudioEffect.Descriptor[] queryEffects = AudioEffect.queryEffects();
        int length = queryEffects.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                break;
            } else if (queryEffects[i].implementor.contains("Dolby Laboratories")) {
                sDlbDevice = true;
                break;
            } else {
                i++;
            }
        }
        sDetectDlbDevices = true;
        return sDlbDevice;
    }

    public static int getMaxSupportedSampleRates(int[] iArr) {
        int i;
        int length = validSampleRates.length;
        if (Build.VERSION.SDK_INT >= 23) {
            i = length - 3;
        } else if (Build.VERSION.SDK_INT >= 21) {
            i = length - 5;
        } else {
            i = length - 9;
        }
        for (int i2 = 0; i2 < i; i2++) {
            iArr[i2] = validSampleRates[i2];
        }
        return i;
    }
}
