package com.ss.android.vesdk;

import android.os.Build;
import com.ss.android.ttve.nativePort.TENativeLibsLoader;
import com.ss.android.vesdk.runtime.VEEffectConfig;
import com.ss.android.vesdk.runtime.VERuntime;
import java.io.File;
import java.util.List;

public class VEImageDetectUtils {
    public static final String TAG = "VEImageDetectUtils";
    private IDetectImageResultListener mDetectResultListener;
    private IDetectImageResultWithNumListener mDetectResultWithNumListener;
    private boolean mInterruptDetectImageContent = true;
    private long mNativeHandler;

    public interface IDetectImageResultListener {
        void onDetectResult(String str, String str2, String str3, boolean z);
    }

    public interface IDetectImageResultWithNumListener {
        void onDetectResult(String str, String str2, String str3, int i);
    }

    private native int nativeDestroy(long j);

    private native int nativeDetectImageContent(long j, String str, String str2, String[] strArr, int i, int i2);

    private native long nativeInit(int i, int i2, String str, String str2, boolean z, String str3);

    static {
        TENativeLibsLoader.m234143a();
    }

    public synchronized void stopDetectImagesContentIfNeed() {
        this.mInterruptDetectImageContent = true;
    }

    public int destroy() {
        long j = this.mNativeHandler;
        if (j == 0) {
            C63929ab.m250978c(TAG, "invoke destroy() encounter handler == 0. Consider destroy() has been called already?");
            return -1;
        }
        int nativeDestroy = nativeDestroy(j);
        if (nativeDestroy == 0) {
            this.mNativeHandler = 0;
            C63929ab.m250974a(TAG, "NativeHandler destroy succeed.");
        }
        this.mDetectResultListener = null;
        return nativeDestroy;
    }

    public int init() {
        long nativeInit = nativeInit(0, 0, VERuntime.m251382a().mo221782d().mo221804b(), Build.DEVICE, false, VEEffectConfig.getCacheDir());
        if (nativeInit == 0) {
            return -1;
        }
        this.mNativeHandler = nativeInit;
        return 0;
    }

    public void setDetectImageContentListener(IDetectImageResultListener iDetectImageResultListener) {
        this.mDetectResultListener = iDetectImageResultListener;
    }

    public void setDetectImageContentWithNumListener(IDetectImageResultWithNumListener iDetectImageResultWithNumListener) {
        this.mDetectResultWithNumListener = iDetectImageResultWithNumListener;
    }

    public void detectImagesContent(String str, List<String> list, List<String> list2) {
        int i;
        synchronized (this) {
            this.mInterruptDetectImageContent = false;
        }
        if (list2.isEmpty()) {
            C63929ab.m250978c(TAG, "Unexpected argument. scanAlgorithmList is empty?");
            return;
        }
        String[] strArr = new String[list2.size()];
        list2.toArray(strArr);
        int size = list.size();
        for (i = 0; i < size && !this.mInterruptDetectImageContent; i++) {
            String str2 = list.get(i);
            if (str2.startsWith("content") || new File(str2).exists()) {
                nativeDetectImageContent(this.mNativeHandler, str, list.get(i), strArr, -1, -1);
            } else {
                String str3 = TAG;
                C63929ab.m250980d(str3, "Illegal argument. file: \"" + str2 + "\" is not exist.");
            }
        }
    }

    public void onNativeCallback_onDetectImageContent(String str, String str2, String str3, boolean z, int i) {
        IDetectImageResultListener iDetectImageResultListener = this.mDetectResultListener;
        if (iDetectImageResultListener == null && this.mDetectResultWithNumListener == null) {
            C63929ab.m250978c(TAG, "Native callback onDetectImageContent encounter no listener handle?");
            return;
        }
        if (iDetectImageResultListener != null) {
            iDetectImageResultListener.onDetectResult(str, str2, str3, z);
        }
        IDetectImageResultWithNumListener iDetectImageResultWithNumListener = this.mDetectResultWithNumListener;
        if (iDetectImageResultWithNumListener != null) {
            iDetectImageResultWithNumListener.onDetectResult(str, str2, str3, i);
        }
    }

    public void detectImagesContentWithSize(String str, List<String> list, List<String> list2, int i, int i2) {
        int i3;
        synchronized (this) {
            this.mInterruptDetectImageContent = false;
        }
        if (list2.isEmpty()) {
            C63929ab.m250978c(TAG, "Unexpected argument. scanAlgorithmList is empty?");
            return;
        }
        String[] strArr = new String[list2.size()];
        list2.toArray(strArr);
        int size = list.size();
        for (i3 = 0; i3 < size && !this.mInterruptDetectImageContent; i3++) {
            String str2 = list.get(i3);
            if (str2.startsWith("content") || new File(str2).exists()) {
                nativeDetectImageContent(this.mNativeHandler, str, list.get(i3), strArr, i, i2);
            } else {
                String str3 = TAG;
                C63929ab.m250980d(str3, "Illegal argument. file: \"" + str2 + "\" is not exist.");
            }
        }
    }

    public int detectImageContent(String str, String str2, List<String> list, int i, int i2) {
        if (!str2.startsWith("content") && !new File(str2).exists()) {
            String str3 = TAG;
            C63929ab.m250980d(str3, "Illegal argument. file: \"" + str2 + "\" is not exist.");
            return -100;
        } else if (list.isEmpty()) {
            C63929ab.m250978c(TAG, "Unexpected argument. scanAlgorithmList is empty?");
            return -100;
        } else {
            String str4 = TAG;
            C63929ab.m250978c(str4, "detectImageContent... stickerId:" + str + ", imagePath=" + str2 + ", maxWidth=" + i + ", maxHeight=" + i);
            String[] strArr = new String[list.size()];
            list.toArray(strArr);
            return nativeDetectImageContent(this.mNativeHandler, str, str2, strArr, i, i2);
        }
    }
}
