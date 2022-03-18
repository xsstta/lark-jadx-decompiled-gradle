package com.ss.android.vesdk;

import android.os.Handler;
import android.view.Surface;
import android.view.SurfaceHolder;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0002!\"B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bJ\b\u0010\u0016\u001a\u00020\u0017H\u0002J*\u0010\u0018\u001a\u00020\u00172\b\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u001cH\u0016J\u0012\u0010\u001f\u001a\u00020\u00172\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0016J\u0012\u0010 \u001a\u00020\u00172\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0016R\u001c\u0010\t\u001a\u0004\u0018\u00010\u0007X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001a\u0010\u000e\u001a\u00020\u000fX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0005X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0003X\u000e¢\u0006\u0002\n\u0000¨\u0006#"}, d2 = {"Lcom/ss/android/vesdk/VESurfaceCallback;", "Landroid/view/SurfaceHolder$Callback;", "veImage", "Lcom/ss/android/vesdk/VEImage;", "surfaceListener", "Lcom/ss/android/vesdk/VESurfaceCallback$SurfaceListener;", "handler", "Landroid/os/Handler;", "(Lcom/ss/android/vesdk/VEImage;Lcom/ss/android/vesdk/VESurfaceCallback$SurfaceListener;Landroid/os/Handler;)V", "mHandler", "getMHandler", "()Landroid/os/Handler;", "setMHandler", "(Landroid/os/Handler;)V", "mState", "Lcom/ss/android/vesdk/VESurfaceCallback$SurfaceState;", "getMState", "()Lcom/ss/android/vesdk/VESurfaceCallback$SurfaceState;", "setMState", "(Lcom/ss/android/vesdk/VESurfaceCallback$SurfaceState;)V", "mSurfaceListener", "mVEImage", "runSurfaceChanged", "", "surfaceChanged", "holder", "Landroid/view/SurfaceHolder;", "format", "", "width", "height", "surfaceCreated", "surfaceDestroyed", "SurfaceListener", "SurfaceState", "veimage_release"}, mo238835k = 1, mv = {1, 1, 13})
public final class VESurfaceCallback implements SurfaceHolder.Callback {

    /* renamed from: a */
    private VEImage f161384a;

    /* renamed from: b */
    private SurfaceListener f161385b;

    /* renamed from: c */
    private Handler f161386c;

    /* renamed from: d */
    private SurfaceState f161387d = SurfaceState.Destroyed;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/ss/android/vesdk/VESurfaceCallback$SurfaceState;", "", "(Ljava/lang/String;I)V", "Created", "Changed", "Destroyed", "veimage_release"}, mo238835k = 1, mv = {1, 1, 13})
    public enum SurfaceState {
        Created,
        Changed,
        Destroyed
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H&J\u0012\u0010\u0007\u001a\u00020\u00032\b\u0010\b\u001a\u0004\u0018\u00010\tH&J\b\u0010\n\u001a\u00020\u0003H&¨\u0006\u000b"}, d2 = {"Lcom/ss/android/vesdk/VESurfaceCallback$SurfaceListener;", "", "onSurfaceChanged", "", "width", "", "height", "onSurfaceCreated", "holder", "Landroid/view/SurfaceHolder;", "onSurfaceDestory", "veimage_release"}, mo238835k = 1, mv = {1, 1, 13})
    /* renamed from: com.ss.android.vesdk.VESurfaceCallback$a */
    public interface SurfaceListener {
        /* renamed from: a */
        void mo203595a(int i, int i2);

        /* renamed from: a */
        void mo203596a(SurfaceHolder surfaceHolder);

        /* renamed from: r */
        void mo203615r();
    }

    /* renamed from: a */
    public final SurfaceState mo220972a() {
        return this.f161387d;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 13})
    /* renamed from: com.ss.android.vesdk.VESurfaceCallback$b */
    static final class RunnableC63908b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ VESurfaceCallback f161388a;

        RunnableC63908b(VESurfaceCallback vESurfaceCallback) {
            this.f161388a = vESurfaceCallback;
        }

        public final void run() {
            this.f161388a.mo220973b();
        }
    }

    /* renamed from: b */
    public final void mo220973b() {
        if (!this.f161384a.mo220772a().isEmpty()) {
            Iterator<T> it = this.f161384a.mo220772a().iterator();
            while (it.hasNext()) {
                it.next().run();
            }
        }
        this.f161384a.mo220772a().clear();
    }

    public void surfaceCreated(SurfaceHolder surfaceHolder) {
        this.f161387d = SurfaceState.Created;
        SurfaceListener aVar = this.f161385b;
        if (aVar != null) {
            aVar.mo203596a(surfaceHolder);
        }
    }

    public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        VEImage vEImage = this.f161384a;
        if (surfaceHolder == null) {
            Intrinsics.throwNpe();
        }
        Surface surface = surfaceHolder.getSurface();
        Intrinsics.checkExpressionValueIsNotNull(surface, "holder!!.surface");
        vEImage.mo220774a(surface);
        this.f161387d = SurfaceState.Destroyed;
        SurfaceListener aVar = this.f161385b;
        if (aVar != null) {
            aVar.mo203615r();
        }
    }

    public VESurfaceCallback(VEImage vEImage, SurfaceListener aVar, Handler handler) {
        Intrinsics.checkParameterIsNotNull(vEImage, "veImage");
        this.f161384a = vEImage;
        this.f161385b = aVar;
        this.f161386c = handler;
    }

    public void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
        VEImage vEImage = this.f161384a;
        if (surfaceHolder == null) {
            Intrinsics.throwNpe();
        }
        Surface surface = surfaceHolder.getSurface();
        Intrinsics.checkExpressionValueIsNotNull(surface, "holder!!.surface");
        vEImage.mo220775a(surface, i2, i3);
        this.f161387d = SurfaceState.Changed;
        SurfaceListener aVar = this.f161385b;
        if (aVar != null) {
            aVar.mo203595a(i2, i3);
        }
        Handler handler = this.f161386c;
        if (handler != null) {
            if (handler == null) {
                Intrinsics.throwNpe();
            }
            handler.post(new RunnableC63908b(this));
            return;
        }
        mo220973b();
    }
}
