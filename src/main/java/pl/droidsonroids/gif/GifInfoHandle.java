package pl.droidsonroids.gif;

import android.content.ContentResolver;
import android.content.res.AssetFileDescriptor;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build;
import android.system.ErrnoException;
import android.system.Os;
import android.view.Surface;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import java.io.FileDescriptor;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* access modifiers changed from: package-private */
public final class GifInfoHandle {

    /* renamed from: a */
    private volatile long f175229a;

    private static native void bindSurface(long j, Surface surface, long[] jArr);

    static native int createTempNativeFileDescriptor() throws GifIOException;

    static native int extractNativeFileDescriptor(FileDescriptor fileDescriptor, boolean z) throws GifIOException;

    private static native void free(long j);

    private static native long getAllocationByteCount(long j);

    private static native String getComment(long j);

    private static native int getCurrentFrameIndex(long j);

    private static native int getCurrentLoop(long j);

    private static native int getCurrentPosition(long j);

    private static native int getDuration(long j);

    private static native int getFrameDuration(long j, int i);

    private static native int getHeight(long j);

    private static native int getLoopCount(long j);

    private static native long getMetadataByteCount(long j);

    private static native int getNativeErrorCode(long j);

    private static native int getNumberOfFrames(long j);

    private static native long[] getSavedState(long j);

    private static native long getSourceLength(long j);

    private static native int getWidth(long j);

    private static native void glTexImage2D(long j, int i, int i2);

    private static native void glTexSubImage2D(long j, int i, int i2);

    private static native void initTexImageDescriptor(long j);

    private static native boolean isAnimationCompleted(long j);

    private static native boolean isOpaque(long j);

    static native long openByteArray(byte[] bArr) throws GifIOException;

    static native long openDirectByteBuffer(ByteBuffer byteBuffer) throws GifIOException;

    static native long openFile(String str) throws GifIOException;

    static native long openNativeFileDescriptor(int i, long j) throws GifIOException;

    static native long openStream(InputStream inputStream) throws GifIOException;

    private static native void postUnbindSurface(long j);

    private static native long renderFrame(long j, Bitmap bitmap);

    private static native boolean reset(long j);

    private static native long restoreRemainder(long j);

    private static native int restoreSavedState(long j, long[] jArr, Bitmap bitmap);

    private static native void saveRemainder(long j);

    private static native void seekToFrame(long j, int i, Bitmap bitmap);

    private static native void seekToFrameGL(long j, int i);

    private static native void seekToTime(long j, int i, Bitmap bitmap);

    private static native void setLoopCount(long j, char c);

    private static native void setOptions(long j, char c, boolean z);

    private static native void setSpeedFactor(long j, float f);

    private static native void startDecoderThread(long j);

    private static native void stopDecoderThread(long j);

    static {
        C70163h.m268955a();
    }

    GifInfoHandle() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo247202a(Surface surface, long[] jArr) {
        bindSurface(this.f175229a, surface, jArr);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public synchronized void mo247201a(int i, Bitmap bitmap) {
        seekToTime(this.f175229a, i, bitmap);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public synchronized long mo247203b() {
        return restoreRemainder(this.f175229a);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public synchronized boolean mo247204c() {
        return reset(this.f175229a);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public synchronized void mo247205d() {
        saveRemainder(this.f175229a);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public synchronized int mo247206e() {
        return getLoopCount(this.f175229a);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public synchronized int mo247207f() {
        return getNativeErrorCode(this.f175229a);
    }

    /* access modifiers changed from: protected */
    public void finalize() throws Throwable {
        try {
            mo247197a();
        } finally {
            super.finalize();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public synchronized int mo247209g() {
        return getDuration(this.f175229a);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public synchronized int mo247210h() {
        return getCurrentPosition(this.f175229a);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public synchronized int mo247211i() {
        return getCurrentFrameIndex(this.f175229a);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public synchronized int mo247212j() {
        return getCurrentLoop(this.f175229a);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public synchronized long mo247213k() {
        return getAllocationByteCount(this.f175229a);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public synchronized long mo247214l() {
        return getMetadataByteCount(this.f175229a);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public synchronized void mo247216n() {
        postUnbindSurface(this.f175229a);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: o */
    public synchronized long[] mo247217o() {
        return getSavedState(this.f175229a);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p */
    public synchronized int mo247218p() {
        return getWidth(this.f175229a);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: q */
    public synchronized int mo247219q() {
        return getHeight(this.f175229a);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: r */
    public synchronized int mo247220r() {
        return getNumberOfFrames(this.f175229a);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: s */
    public synchronized boolean mo247221s() {
        return isOpaque(this.f175229a);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public synchronized boolean mo247215m() {
        boolean z;
        if (this.f175229a == 0) {
            z = true;
        } else {
            z = false;
        }
        return z;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public synchronized void mo247197a() {
        free(this.f175229a);
        this.f175229a = 0;
    }

    GifInfoHandle(FileDescriptor fileDescriptor) throws GifIOException {
        this.f175229a = m268881a(fileDescriptor, 0, true);
    }

    GifInfoHandle(AssetFileDescriptor assetFileDescriptor) throws IOException {
        try {
            this.f175229a = m268881a(assetFileDescriptor.getFileDescriptor(), assetFileDescriptor.getStartOffset(), false);
        } finally {
            try {
                assetFileDescriptor.close();
            } catch (IOException unused) {
            }
        }
    }

    GifInfoHandle(InputStream inputStream) throws GifIOException {
        if (inputStream.markSupported()) {
            this.f175229a = openStream(inputStream);
            return;
        }
        throw new IllegalArgumentException("InputStream does not support marking");
    }

    GifInfoHandle(String str) throws GifIOException {
        this.f175229a = openFile(str);
    }

    GifInfoHandle(ByteBuffer byteBuffer) throws GifIOException {
        this.f175229a = openDirectByteBuffer(byteBuffer);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public synchronized long mo247196a(Bitmap bitmap) {
        return renderFrame(this.f175229a, bitmap);
    }

    GifInfoHandle(byte[] bArr) throws GifIOException {
        this.f175229a = openByteArray(bArr);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo247199a(float f) {
        if (f <= BitmapDescriptorFactory.HUE_RED || Float.isNaN(f)) {
            throw new IllegalArgumentException("Speed factor is not positive");
        }
        if (f < 4.656613E-10f) {
            f = 4.656613E-10f;
        }
        synchronized (this) {
            setSpeedFactor(this.f175229a, f);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo247200a(int i) {
        if (i < 0 || i > 65535) {
            throw new IllegalArgumentException("Loop count of range <0, 65535>");
        }
        synchronized (this) {
            setLoopCount(this.f175229a, (char) i);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo247198a(char c, boolean z) {
        setOptions(this.f175229a, c, z);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public synchronized int mo247195a(long[] jArr, Bitmap bitmap) {
        return restoreSavedState(this.f175229a, jArr, bitmap);
    }

    /* renamed from: a */
    private static int m268880a(FileDescriptor fileDescriptor, boolean z) throws GifIOException, ErrnoException {
        try {
            int createTempNativeFileDescriptor = createTempNativeFileDescriptor();
            Os.dup2(fileDescriptor, createTempNativeFileDescriptor);
            return createTempNativeFileDescriptor;
        } finally {
            if (z) {
                Os.close(fileDescriptor);
            }
        }
    }

    /* renamed from: a */
    static GifInfoHandle m268882a(ContentResolver contentResolver, Uri uri) throws IOException {
        if ("file".equals(uri.getScheme())) {
            return new GifInfoHandle(uri.getPath());
        }
        AssetFileDescriptor openAssetFileDescriptor = contentResolver.openAssetFileDescriptor(uri, "r");
        if (openAssetFileDescriptor != null) {
            return new GifInfoHandle(openAssetFileDescriptor);
        }
        throw new IOException("Could not open AssetFileDescriptor for " + uri);
    }

    /* renamed from: a */
    private static long m268881a(FileDescriptor fileDescriptor, long j, boolean z) throws GifIOException {
        int i;
        if (Build.VERSION.SDK_INT > 27) {
            try {
                i = m268880a(fileDescriptor, z);
            } catch (Exception e) {
                throw new GifIOException(GifError.OPEN_FAILED.errorCode, e.getMessage());
            }
        } else {
            i = extractNativeFileDescriptor(fileDescriptor, z);
        }
        return openNativeFileDescriptor(i, j);
    }
}
