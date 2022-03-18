package com.ss.android.medialib.qr;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import com.ss.android.medialib.model.EnigmaResult;
import com.ss.android.ttve.nativePort.TENativeLibsLoader;
import com.ss.android.vesdk.C63929ab;
import com.ss.android.vesdk.utils.BitmapLoader;

public class PicScanner {
    public long handle = nativeCreate();
    private AbstractC59428a listener;
    private boolean success;

    /* renamed from: com.ss.android.medialib.qr.PicScanner$a */
    public interface AbstractC59428a {
        /* renamed from: a */
        void mo180938a(boolean z);
    }

    private native long nativeCreate();

    private native EnigmaResult nativeGetEnigmaResult(long j);

    private native void nativeRelease(long j);

    private native int nativeStart(long j, Bitmap bitmap, ScanSettings scanSettings);

    private native void nativeStop(long j);

    static {
        TENativeLibsLoader.m234148d();
    }

    public boolean isSuccess() {
        return this.success;
    }

    public boolean isValid() {
        if (this.handle != 0) {
            return true;
        }
        return false;
    }

    public void stop() {
        long j = this.handle;
        if (j != 0) {
            nativeStop(j);
        }
    }

    public EnigmaResult getEnigmaResult() {
        long j = this.handle;
        if (j == 0) {
            return null;
        }
        EnigmaResult nativeGetEnigmaResult = nativeGetEnigmaResult(j);
        if (!(nativeGetEnigmaResult == null || nativeGetEnigmaResult.getResult() == null)) {
            this.success = true;
        }
        return nativeGetEnigmaResult;
    }

    public synchronized void release() {
        C63929ab.m250974a("PicScanner", "release");
        long j = this.handle;
        if (j == 0) {
            C63929ab.m250978c("PicScanner", "release skip");
            return;
        }
        nativeRelease(j);
        this.handle = 0;
    }

    public void setListener(AbstractC59428a aVar) {
        this.listener = aVar;
    }

    public void onResult(boolean z) {
        AbstractC59428a aVar = this.listener;
        if (aVar != null) {
            aVar.mo180938a(z);
        }
    }

    public int start(Bitmap bitmap, ScanSettings scanSettings) {
        if (bitmap == null) {
            return -1;
        }
        this.success = false;
        nativeStart(this.handle, bitmap, scanSettings);
        if (!bitmap.isRecycled()) {
            bitmap.recycle();
        }
        return 0;
    }

    public int start(String str, ScanSettings scanSettings) {
        Throwable th;
        Bitmap bitmap;
        if (this.handle == 0) {
            return -1;
        }
        Bitmap bitmap2 = null;
        try {
            Bitmap loadBitmap = BitmapLoader.loadBitmap(str, scanSettings.width, scanSettings.height);
            if (loadBitmap != null) {
                try {
                    int width = loadBitmap.getWidth();
                    int height = loadBitmap.getHeight();
                    if (width * height > 4000000) {
                        float sqrt = (float) (1.0d / Math.sqrt((double) ((((float) width) * ((float) height)) / 4000000.0f)));
                        Matrix matrix = new Matrix();
                        matrix.postScale(sqrt, sqrt);
                        bitmap = Bitmap.createBitmap(loadBitmap, 0, 0, width, height, matrix, true);
                    } else {
                        bitmap = loadBitmap.copy(Bitmap.Config.ARGB_8888, true);
                    }
                    if (!loadBitmap.isRecycled()) {
                        loadBitmap.recycle();
                        if (bitmap2 != null && !bitmap2.isRecycled()) {
                            bitmap2.recycle();
                        }
                        return start(bitmap, scanSettings);
                    }
                } catch (Exception unused) {
                    bitmap2 = loadBitmap;
                    if (bitmap2 != null && !bitmap2.isRecycled()) {
                        bitmap2.recycle();
                    }
                    return -2;
                } catch (OutOfMemoryError unused2) {
                    bitmap2 = loadBitmap;
                    if (bitmap2 != null && !bitmap2.isRecycled()) {
                        bitmap2.recycle();
                    }
                    return -3;
                } catch (Throwable th2) {
                    th = th2;
                    bitmap2 = loadBitmap;
                    if (bitmap2 != null && !bitmap2.isRecycled()) {
                        bitmap2.recycle();
                    }
                    throw th;
                }
            } else {
                bitmap = null;
            }
            bitmap2 = loadBitmap;
            bitmap2.recycle();
            return start(bitmap, scanSettings);
        } catch (Exception unused3) {
            bitmap2.recycle();
            return -2;
        } catch (OutOfMemoryError unused4) {
            bitmap2.recycle();
            return -3;
        } catch (Throwable th3) {
            th = th3;
            bitmap2.recycle();
            throw th;
        }
    }
}
