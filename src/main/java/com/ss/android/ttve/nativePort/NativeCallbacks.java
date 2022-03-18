package com.ss.android.ttve.nativePort;

import com.ss.android.vesdk.model.BefTextLayout;
import com.ss.android.vesdk.model.BefTextLayoutResult;
import java.nio.ByteBuffer;

public class NativeCallbacks {

    public interface ICameraFrameCallback {
        void onResult(ByteBuffer byteBuffer, int i, int i2, long j);
    }

    public interface IGetFrameCallback {
        void onResult(int[] iArr, int i, int i2, long j);
    }

    public interface ILensCallback {
        void onError(int i, int i2, String str);

        void onInfo(int i, int i2, int i3, String str);

        void onSuccess(int i, float f, int i2);
    }

    public interface OnARTextBitmapCallback {
        BefTextLayoutResult onResult(String str, BefTextLayout befTextLayout);
    }

    public interface OnARTextContentCallback {
        void onResult(String[] strArr);
    }

    /* renamed from: com.ss.android.ttve.nativePort.NativeCallbacks$a */
    public interface AbstractC60235a {
        /* renamed from: a */
        void mo205726a();

        /* renamed from: a */
        void mo205727a(float f);

        /* renamed from: a */
        void mo205728a(boolean z);
    }

    /* renamed from: com.ss.android.ttve.nativePort.NativeCallbacks$b */
    public interface AbstractC60236b {
        /* renamed from: a */
        void mo205729a(float f);
    }

    /* renamed from: com.ss.android.ttve.nativePort.NativeCallbacks$c */
    public interface AbstractC60237c {
        /* renamed from: a */
        int mo205730a(byte[] bArr, int i, int i2, boolean z);
    }

    /* renamed from: com.ss.android.ttve.nativePort.NativeCallbacks$d */
    public interface AbstractC60238d {
        /* renamed from: a */
        int mo205731a(byte[] bArr, int i, int i2, int i3, float f);
    }

    /* renamed from: com.ss.android.ttve.nativePort.NativeCallbacks$e */
    public interface AbstractC60239e {
        /* renamed from: a */
        void mo205732a(int i, int i2, int i3);

        /* renamed from: a */
        void mo205733a(int i, int i2, String str);
    }

    /* renamed from: com.ss.android.ttve.nativePort.NativeCallbacks$f */
    public interface AbstractC60240f {
        /* renamed from: a */
        void mo205734a();
    }

    /* renamed from: com.ss.android.ttve.nativePort.NativeCallbacks$g */
    public interface AbstractC60241g {
        /* renamed from: a */
        int mo205735a();

        /* renamed from: a */
        int mo205736a(float f);

        /* renamed from: a */
        int mo205737a(int i, float f, float f2, boolean z);

        /* renamed from: a */
        int mo205738a(int i, int i2, float f);
    }

    /* renamed from: com.ss.android.ttve.nativePort.NativeCallbacks$h */
    public interface AbstractC60242h {
        /* renamed from: a */
        int mo205739a(int i);

        /* renamed from: a */
        int mo205740a(int i, double d);

        /* renamed from: b */
        int mo205741b(int i);

        /* renamed from: b */
        int mo205742b(int i, double d);

        /* renamed from: c */
        int mo205743c(int i);
    }
}
