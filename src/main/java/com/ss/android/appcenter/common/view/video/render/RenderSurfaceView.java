package com.ss.android.appcenter.common.view.video.render;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.util.AttributeSet;
import android.view.Surface;
import android.view.TextureView;
import com.ss.android.appcenter.common.util.C28184h;
import com.ss.android.appcenter.common.view.video.base.player.IPlayer;
import java.lang.ref.WeakReference;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0003\u001c\u001d\u001eB\u000f\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005B\u0017\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bB\u001f\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000bJ\b\u0010\u0010\u001a\u0004\u0018\u00010\rJ \u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\nH\u0016J\u0010\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0013\u001a\u00020\u0014H\u0016J \u0010\u0019\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\nH\u0016J\u0010\u0010\u001a\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0016J\u0010\u0010\u001b\u001a\u00020\u00122\b\u0010\f\u001a\u0004\u0018\u00010\rR\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fXD¢\u0006\u0002\n\u0000¨\u0006\u001f"}, d2 = {"Lcom/ss/android/appcenter/common/view/video/render/RenderSurfaceView;", "Landroid/view/TextureView;", "Landroid/view/TextureView$SurfaceTextureListener;", "ctx", "Landroid/content/Context;", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "renderCallback", "Lcom/ss/android/appcenter/common/view/video/render/RenderSurfaceView$IRenderCallback;", "tag", "", "getRenderCallback", "onSurfaceTextureAvailable", "", "surfaceTexture", "Landroid/graphics/SurfaceTexture;", "width", "height", "onSurfaceTextureDestroyed", "", "onSurfaceTextureSizeChanged", "onSurfaceTextureUpdated", "setRenderCallback", "IRenderCallback", "IRenderHolder", "InternalRenderHolder", "appcenter_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class RenderSurfaceView extends TextureView implements TextureView.SurfaceTextureListener {

    /* renamed from: a */
    private final String f70846a = "AppCenterRenderSurfaceView";

    /* renamed from: b */
    private IRenderCallback f70847b;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\"\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007H&J\"\u0010\t\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007H&J\u0012\u0010\n\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H&¨\u0006\u000b"}, d2 = {"Lcom/ss/android/appcenter/common/view/video/render/RenderSurfaceView$IRenderCallback;", "", "onSurfaceChanged", "", "renderHolder", "Lcom/ss/android/appcenter/common/view/video/render/RenderSurfaceView$IRenderHolder;", "width", "", "height", "onSurfaceCreated", "onSurfaceDestroy", "appcenter_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.appcenter.common.view.video.render.RenderSurfaceView$a */
    public interface IRenderCallback {
        /* renamed from: a */
        void mo100482a(IRenderHolder bVar);

        /* renamed from: a */
        void mo100483a(IRenderHolder bVar, int i, int i2);

        /* renamed from: b */
        void mo100484b(IRenderHolder bVar, int i, int i2);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H&¨\u0006\u0006"}, d2 = {"Lcom/ss/android/appcenter/common/view/video/render/RenderSurfaceView$IRenderHolder;", "", "bindPlayer", "", "player", "Lcom/ss/android/appcenter/common/view/video/base/player/IPlayer;", "appcenter_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.appcenter.common.view.video.render.RenderSurfaceView$b */
    public interface IRenderHolder {
        /* renamed from: a */
        void mo100590a(IPlayer cVar);
    }

    public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        Intrinsics.checkParameterIsNotNull(surfaceTexture, "surfaceTexture");
    }

    public final IRenderCallback getRenderCallback() {
        return this.f70847b;
    }

    public final void setRenderCallback(IRenderCallback aVar) {
        this.f70847b = aVar;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J\u0012\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0016R\u0016\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0006X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/ss/android/appcenter/common/view/video/render/RenderSurfaceView$InternalRenderHolder;", "Lcom/ss/android/appcenter/common/view/video/render/RenderSurfaceView$IRenderHolder;", "surface", "Landroid/view/Surface;", "(Landroid/view/Surface;)V", "mSurfaceHolder", "Ljava/lang/ref/WeakReference;", "bindPlayer", "", "player", "Lcom/ss/android/appcenter/common/view/video/base/player/IPlayer;", "appcenter_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.appcenter.common.view.video.render.RenderSurfaceView$c */
    private static final class InternalRenderHolder implements IRenderHolder {

        /* renamed from: a */
        private final WeakReference<Surface> f70848a;

        public InternalRenderHolder(Surface surface) {
            this.f70848a = new WeakReference<>(surface);
        }

        @Override // com.ss.android.appcenter.common.view.video.render.RenderSurfaceView.IRenderHolder
        /* renamed from: a */
        public void mo100590a(IPlayer cVar) {
            if (cVar != null && this.f70848a.get() != null) {
                cVar.mo100489a(this.f70848a.get());
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public RenderSurfaceView(Context context) {
        super(context);
        Intrinsics.checkParameterIsNotNull(context, "ctx");
        setSurfaceTextureListener(this);
    }

    public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        Intrinsics.checkParameterIsNotNull(surfaceTexture, "surfaceTexture");
        String str = this.f70846a;
        C28184h.m103250d(str, "surfaceDestroyed: surface=" + surfaceTexture);
        Surface surface = new Surface(surfaceTexture);
        IRenderCallback aVar = this.f70847b;
        if (aVar == null) {
            return true;
        }
        aVar.mo100482a(new InternalRenderHolder(surface));
        return true;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public RenderSurfaceView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkParameterIsNotNull(context, "ctx");
        Intrinsics.checkParameterIsNotNull(attributeSet, "attrs");
        setSurfaceTextureListener(this);
    }

    public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        Intrinsics.checkParameterIsNotNull(surfaceTexture, "surfaceTexture");
        String str = this.f70846a;
        C28184h.m103250d(str, "surfaceCreated:surface=" + surfaceTexture);
        Surface surface = new Surface(surfaceTexture);
        IRenderCallback aVar = this.f70847b;
        if (aVar != null) {
            aVar.mo100483a(new InternalRenderHolder(surface), i, i2);
        }
    }

    public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
        Intrinsics.checkParameterIsNotNull(surfaceTexture, "surfaceTexture");
        String str = this.f70846a;
        C28184h.m103250d(str, "surfaceChanged: surface=" + surfaceTexture + ",width = " + i + ", height = " + i2);
        Surface surface = new Surface(surfaceTexture);
        IRenderCallback aVar = this.f70847b;
        if (aVar != null) {
            aVar.mo100484b(new InternalRenderHolder(surface), i, i2);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public RenderSurfaceView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkParameterIsNotNull(context, "ctx");
        Intrinsics.checkParameterIsNotNull(attributeSet, "attrs");
        setSurfaceTextureListener(this);
    }
}
