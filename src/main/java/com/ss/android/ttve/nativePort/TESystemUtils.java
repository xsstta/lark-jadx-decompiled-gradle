package com.ss.android.ttve.nativePort;

import android.content.Context;
import android.content.pm.PackageManager;
import android.media.AudioManager;
import android.os.Build;
import android.util.Pair;
import com.ss.android.ttve.audio.C60178a;
import com.ss.android.ttve.model.VEAudioDeviceType;
import com.ss.android.vesdk.runtime.VERuntime;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class TESystemUtils {
    public static int getOutputAudioDeviceType() {
        if (Build.VERSION.SDK_INT >= 23) {
            return new C60178a().mo205503a().ordinal();
        }
        return VEAudioDeviceType.DEFAULT.ordinal();
    }

    public static boolean hasLowLatencyFeature() {
        PackageManager packageManager;
        Context e = VERuntime.m251382a().mo221784e();
        if (e == null || (packageManager = e.getPackageManager()) == null) {
            return false;
        }
        return packageManager.hasSystemFeature("android.hardware.audio.low_latency");
    }

    public static Pair<Integer, Integer> getSuggestedOutputProperty() {
        Context e = VERuntime.m251382a().mo221784e();
        if (e != null && Build.VERSION.SDK_INT >= 17) {
            AudioManager audioManager = (AudioManager) e.getSystemService("audio");
            String property = audioManager.getProperty("android.media.property.OUTPUT_SAMPLE_RATE");
            String property2 = audioManager.getProperty("android.media.property.OUTPUT_FRAMES_PER_BUFFER");
            try {
                return new Pair<>(Integer.valueOf(Integer.parseInt(property)), Integer.valueOf(Integer.parseInt(property2)));
            } catch (Exception unused) {
            }
        }
        return null;
    }

    public static int getOutputLatency(int i) {
        Method declaredMethod;
        try {
            Class<?> cls = Class.forName("android.media.AudioSystem");
            if (cls == null || (declaredMethod = cls.getDeclaredMethod("getOutputLatency", Integer.TYPE)) == null) {
                return 0;
            }
            declaredMethod.setAccessible(true);
            return ((Integer) declaredMethod.invoke(cls, Integer.valueOf(i))).intValue();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            return 0;
        } catch (NoSuchMethodException e2) {
            e2.printStackTrace();
            return 0;
        } catch (IllegalAccessException e3) {
            e3.printStackTrace();
            return 0;
        } catch (InvocationTargetException e4) {
            e4.printStackTrace();
            return 0;
        }
    }
}
