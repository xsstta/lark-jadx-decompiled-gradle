package com.ss.android.lark.multitask;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.os.ParcelFileDescriptor;
import android.view.View;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.framework.thread.CoreThreadPool;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.multitask.IMultitaskDependency;
import com.ss.android.lark.multitask.screencapture.C48351c;
import com.ss.android.lark.multitask.screencapture.ScreenshotCapture;
import com.ss.android.lark.slideback.BackgroundArtist;
import com.ss.android.lark.slideback.SlideFrameLayout;
import java.lang.ref.WeakReference;
import java.util.concurrent.Future;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001cB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u000e\u001a\u00020\u000fH\u0002J\u0018\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\u0013H\u0016J\u001e\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u0019J\u0018\u0010\u001a\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\r2\u0006\u0010\u001b\u001a\u00020\u0016H\u0016R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\b\u0012\u0002\b\u0003\u0018\u00010\bX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u0018\u0010\u000b\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\r\u0018\u00010\fX\u000e¢\u0006\u0002\n\u0000¨\u0006\u001d"}, d2 = {"Lcom/ss/android/lark/multitask/MultipleProcessBackgroundArtist;", "Lcom/ss/android/lark/slideback/BackgroundArtist;", "screenshotCapture", "Lcom/ss/android/lark/multitask/screencapture/ScreenshotCapture;", "(Lcom/ss/android/lark/multitask/screencapture/ScreenshotCapture;)V", "bitmap", "Landroid/graphics/Bitmap;", "future", "Ljava/util/concurrent/Future;", "paint", "Landroid/graphics/Paint;", "viewBehindThisRef", "Ljava/lang/ref/WeakReference;", "Landroid/view/View;", "capture", "", "onDraw", "view", "canvas", "Landroid/graphics/Canvas;", "onScreenshotCapturedImpl", "width", "", "height", "descriptor", "Landroid/os/ParcelFileDescriptor;", "onViewDragStateChanged", "state", "Companion", "base_multitask_impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.multitask.d */
public final class MultipleProcessBackgroundArtist implements BackgroundArtist {

    /* renamed from: b */
    public static final Companion f121583b = new Companion(null);

    /* renamed from: a */
    public volatile Bitmap f121584a;

    /* renamed from: c */
    private final Paint f121585c = new Paint();

    /* renamed from: d */
    private volatile WeakReference<View> f121586d;

    /* renamed from: e */
    private Future<?> f121587e;

    /* renamed from: f */
    private final ScreenshotCapture f121588f;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ss/android/lark/multitask/MultipleProcessBackgroundArtist$Companion;", "", "()V", "TAG", "", "base_multitask_impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.multitask.d$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.multitask.d$c */
    static final class RunnableC48287c implements Runnable {

        /* renamed from: a */
        final /* synthetic */ MultipleProcessBackgroundArtist f121593a;

        RunnableC48287c(MultipleProcessBackgroundArtist dVar) {
            this.f121593a = dVar;
        }

        public final void run() {
            this.f121593a.mo168898a();
        }
    }

    /* renamed from: a */
    public final void mo168898a() {
        try {
            IMultitaskDependency.ActivityInfo c = C48335j.m190643a().mo168872c();
            if (c != null) {
                Activity c2 = c.mo168878c();
                if (c2 != null) {
                    this.f121586d = new WeakReference<>(C48351c.m190717a(c2));
                    return;
                }
            } else {
                Log.m165389i("MULTITASK-MultipleProcessBackgroundArtist", "No recent stopped activities");
            }
            this.f121588f.mo169096a(new MultipleProcessBackgroundArtist$capture$1(this));
        } catch (Exception e) {
            Log.m165384e("MULTITASK-MultipleProcessBackgroundArtist", "Exception thrown when capture", e);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.multitask.d$b */
    static final class RunnableC48286b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ MultipleProcessBackgroundArtist f121589a;

        /* renamed from: b */
        final /* synthetic */ ParcelFileDescriptor f121590b;

        /* renamed from: c */
        final /* synthetic */ int f121591c;

        /* renamed from: d */
        final /* synthetic */ int f121592d;

        RunnableC48286b(MultipleProcessBackgroundArtist dVar, ParcelFileDescriptor parcelFileDescriptor, int i, int i2) {
            this.f121589a = dVar;
            this.f121590b = parcelFileDescriptor;
            this.f121591c = i;
            this.f121592d = i2;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:14:0x0055, code lost:
            r2 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:15:0x0056, code lost:
            kotlin.io.C69101b.m265907a(r4, r1);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:16:0x0059, code lost:
            throw r2;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:20:0x005c, code lost:
            r2 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:21:0x005d, code lost:
            kotlin.io.C69101b.m265907a(r0, r1);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:22:0x0060, code lost:
            throw r2;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void run() {
            /*
                r8 = this;
                android.os.ParcelFileDescriptor r0 = r8.f121590b
                boolean r0 = com.ss.android.lark.multitask.screencapture.C48350b.m190716a(r0)
                if (r0 != 0) goto L_0x0009
                return
            L_0x0009:
                android.os.ParcelFileDescriptor r0 = r8.f121590b
                java.io.Closeable r0 = (java.io.Closeable) r0
                r1 = 0
                r2 = r1
                java.lang.Throwable r2 = (java.lang.Throwable) r2
                r3 = r0
                android.os.ParcelFileDescriptor r3 = (android.os.ParcelFileDescriptor) r3     // Catch:{ all -> 0x005a }
                java.io.DataInputStream r4 = new java.io.DataInputStream     // Catch:{ all -> 0x005a }
                java.io.FileInputStream r5 = new java.io.FileInputStream     // Catch:{ all -> 0x005a }
                java.io.FileDescriptor r3 = r3.getFileDescriptor()     // Catch:{ all -> 0x005a }
                r5.<init>(r3)     // Catch:{ all -> 0x005a }
                java.io.InputStream r5 = (java.io.InputStream) r5     // Catch:{ all -> 0x005a }
                r4.<init>(r5)     // Catch:{ all -> 0x005a }
                java.io.Closeable r4 = (java.io.Closeable) r4     // Catch:{ all -> 0x005a }
                java.lang.Throwable r1 = (java.lang.Throwable) r1     // Catch:{ all -> 0x005a }
                r3 = r4
                java.io.DataInputStream r3 = (java.io.DataInputStream) r3     // Catch:{ all -> 0x0053 }
                int r5 = r8.f121591c     // Catch:{ all -> 0x0053 }
                int r6 = r8.f121592d     // Catch:{ all -> 0x0053 }
                android.graphics.Bitmap$Config r7 = android.graphics.Bitmap.Config.ARGB_8888     // Catch:{ all -> 0x0053 }
                android.graphics.Bitmap r5 = android.graphics.Bitmap.createBitmap(r5, r6, r7)     // Catch:{ all -> 0x0053 }
                java.io.InputStream r3 = (java.io.InputStream) r3     // Catch:{ all -> 0x0053 }
                byte[] r3 = kotlin.io.C69100a.m265906a(r3)     // Catch:{ all -> 0x0053 }
                java.nio.ByteBuffer r3 = java.nio.ByteBuffer.wrap(r3)     // Catch:{ all -> 0x0053 }
                java.nio.Buffer r3 = (java.nio.Buffer) r3     // Catch:{ all -> 0x0053 }
                r5.copyPixelsFromBuffer(r3)     // Catch:{ all -> 0x0053 }
                com.ss.android.lark.multitask.d r3 = r8.f121589a     // Catch:{ all -> 0x0053 }
                r3.f121584a = r5     // Catch:{ all -> 0x0053 }
                kotlin.Unit r3 = kotlin.Unit.INSTANCE     // Catch:{ all -> 0x0053 }
                kotlin.io.C69101b.m265907a(r4, r1)
                kotlin.Unit r1 = kotlin.Unit.INSTANCE
                kotlin.io.C69101b.m265907a(r0, r2)
                return
            L_0x0053:
                r1 = move-exception
                throw r1     // Catch:{ all -> 0x0055 }
            L_0x0055:
                r2 = move-exception
                kotlin.io.C69101b.m265907a(r4, r1)
                throw r2
            L_0x005a:
                r1 = move-exception
                throw r1     // Catch:{ all -> 0x005c }
            L_0x005c:
                r2 = move-exception
                kotlin.io.C69101b.m265907a(r0, r1)
                throw r2
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.multitask.MultipleProcessBackgroundArtist.RunnableC48286b.run():void");
        }
    }

    public MultipleProcessBackgroundArtist(ScreenshotCapture dVar) {
        Intrinsics.checkParameterIsNotNull(dVar, "screenshotCapture");
        this.f121588f = dVar;
    }

    @Override // com.ss.android.lark.slideback.BackgroundArtist
    /* renamed from: a */
    public void mo168900a(View view, int i) {
        Intrinsics.checkParameterIsNotNull(view, "view");
        if (i == 0) {
            Future<?> future = this.f121587e;
            if (future != null) {
                future.cancel(true);
            }
            Bitmap bitmap = this.f121584a;
            if (bitmap != null) {
                bitmap.recycle();
            }
            this.f121584a = null;
        } else if (i == 1) {
            CoreThreadPool coreThreadPool = CoreThreadPool.getDefault();
            Intrinsics.checkExpressionValueIsNotNull(coreThreadPool, "CoreThreadPool.getDefault()");
            this.f121587e = coreThreadPool.getFixedThreadPool().submit(new RunnableC48287c(this));
        }
    }

    @Override // com.ss.android.lark.slideback.BackgroundArtist
    /* renamed from: a */
    public void mo168901a(View view, Canvas canvas) {
        View view2;
        Intrinsics.checkParameterIsNotNull(view, "view");
        Intrinsics.checkParameterIsNotNull(canvas, "canvas");
        SlideFrameLayout.C54909d dVar = (SlideFrameLayout.C54909d) view;
        dVar.mo187261a(true);
        WeakReference<View> weakReference = this.f121586d;
        if (weakReference == null || (view2 = weakReference.get()) == null) {
            dVar.setHostViewExplicitly(null);
            Bitmap bitmap = this.f121584a;
            if (bitmap != null) {
                canvas.drawBitmap(bitmap, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, this.f121585c);
            }
        } else if (!Intrinsics.areEqual(dVar.getHostView(), view2)) {
            dVar.setHostViewExplicitly(view2);
        }
    }

    /* renamed from: a */
    public final void mo168899a(int i, int i2, ParcelFileDescriptor parcelFileDescriptor) {
        Intrinsics.checkParameterIsNotNull(parcelFileDescriptor, "descriptor");
        CoreThreadPool coreThreadPool = CoreThreadPool.getDefault();
        Intrinsics.checkExpressionValueIsNotNull(coreThreadPool, "CoreThreadPool.getDefault()");
        coreThreadPool.getFixedThreadPool().submit(new RunnableC48286b(this, parcelFileDescriptor, i, i2));
    }
}
