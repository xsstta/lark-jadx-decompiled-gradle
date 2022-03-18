package com.ss.ttm.player;

import android.media.MediaFormat;
import android.util.Log;

public class VendorQTI {
    public static void enableLowLatency(MediaFormat mediaFormat) {
        if (mediaFormat != null) {
            mediaFormat.setInteger("vendor.qti-ext-dec-low-latency.enable", 1);
        }
    }

    public static void debugEffect(MediaFormat mediaFormat) {
        if (mediaFormat != null) {
            mediaFormat.setInteger("vendor.qti-ext-vpp-demo.process-percent", 50);
            Log.d("VendorQTI", "mediaformat = " + mediaFormat.toString());
        }
    }

    public static void setupVpp(MediaFormat mediaFormat, int i) {
        int i2;
        if (mediaFormat != null) {
            mediaFormat.setString("vendor.qti-ext-vpp.mode", "HQV_MODE_MANUAL");
            if (i == 0 || i == 1) {
                if (i == 0) {
                    i2 = 10;
                } else {
                    i2 = 20;
                }
                mediaFormat.setInteger("vendor.qti-ext-vpp-cade.cade-level", i2);
                mediaFormat.setInteger("vendor.qti-ext-vpp-aie.ltm-sat-gain", 65);
                mediaFormat.setInteger("vendor.qti-ext-vpp-aie.ltm-sat-offset", 60);
                mediaFormat.setInteger("vendor.qti-ext-vpp-aie.ltm-ace-str", 50);
            } else if (i == 2) {
                mediaFormat.setInteger("vendor.qti-ext-vpp-cade.cade-level", 15);
                mediaFormat.setInteger("vendor.qti-ext-vpp-aie.ltm-sat-gain", 70);
                mediaFormat.setInteger("vendor.qti-ext-vpp-aie.ltm-sat-offset", 70);
                mediaFormat.setInteger("vendor.qti-ext-vpp-aie.ltm-ace-str", 50);
            } else {
                return;
            }
            mediaFormat.setInteger("vendor.qti-ext-vpp-aie.ltm-ace-brightness-low", 20);
            mediaFormat.setInteger("vendor.qti-ext-vpp-aie.ltm-ace-brightness-high", 20);
        }
    }
}
