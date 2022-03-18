package com.ss.android.vc.meeting.module.sketch.render.gl.impl;

import android.content.Context;
import android.graphics.RectF;
import android.graphics.SurfaceTexture;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.ss.android.vc.common.p3077b.C60700b;
import com.ss.android.vc.common.p3083e.C60740ad;
import com.ss.android.vc.meeting.module.sketch.ISketchViewImpl;
import com.ss.android.vc.meeting.module.sketch.SketchRenderModel;
import com.ss.android.vc.meeting.module.sketch.SketchView;
import com.ss.android.vc.meeting.module.sketch.action.ISketchAction;
import com.ss.android.vc.meeting.module.sketch.dto.Coord;
import com.ss.android.vc.meeting.module.sketch.render.gl.MarkersRenderer;
import com.ss.android.vc.meeting.module.sketch.render.gl.model.GLRenderModel;
import com.ss.android.vc.meeting.module.sketch.utils.CoordinateUtil;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0012\u0018\u0000 @2\u00020\u00012\u00020\u00022\u00020\u0003:\u0001@B\u0011\b\u0016\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006B\u001b\b\u0016\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\tJ\u0018\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001dH\u0016J\b\u0010\u001e\u001a\u00020\u0019H\u0016J\b\u0010\u001f\u001a\u00020\u0019H\u0016J\b\u0010 \u001a\u00020!H\u0016J\b\u0010\"\u001a\u00020#H\u0016J\b\u0010$\u001a\u00020\u0019H\u0002J\u0012\u0010%\u001a\u00020\u00192\b\u0010&\u001a\u0004\u0018\u00010'H\u0016J\b\u0010(\u001a\u00020\u0019H\u0016J\b\u0010)\u001a\u00020\u0019H\u0016J\b\u0010*\u001a\u00020\u0019H\u0016J\b\u0010+\u001a\u00020\u0019H\u0002J\b\u0010,\u001a\u00020\u0019H\u0016J \u0010-\u001a\u00020\u00192\u0006\u0010.\u001a\u00020/2\u0006\u00100\u001a\u0002012\u0006\u00102\u001a\u000201H\u0016J\u0010\u00103\u001a\u00020\u000b2\u0006\u0010.\u001a\u00020/H\u0016J \u00104\u001a\u00020\u00192\u0006\u0010.\u001a\u00020/2\u0006\u00100\u001a\u0002012\u0006\u00102\u001a\u000201H\u0016J\u0010\u00105\u001a\u00020\u00192\u0006\u0010.\u001a\u00020/H\u0016J\u0010\u00106\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u001dH\u0016J\u0010\u00107\u001a\u00020\u00192\u0006\u00108\u001a\u00020#H\u0016J\u0010\u00109\u001a\u00020\u00192\u0006\u0010:\u001a\u00020\u0017H\u0016J\u0010\u0010;\u001a\u00020\u00192\u0006\u0010<\u001a\u000201H\u0016J\u0010\u0010=\u001a\u00020>2\u0006\u0010?\u001a\u00020>H\u0016R\u000e\u0010\n\u001a\u00020\u000bX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u000bX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX.¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0011\u001a\u00020\u0012X\u0004¢\u0006\u0004\n\u0002\u0010\u0013R\u000e\u0010\u0014\u001a\u00020\u0015X.¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X.¢\u0006\u0002\n\u0000¨\u0006A"}, d2 = {"Lcom/ss/android/vc/meeting/module/sketch/render/gl/impl/GLSketchViewImpl;", "Lcom/ss/android/vc/meeting/module/sketch/render/gl/impl/BaseGLTextureView;", "Lcom/ss/android/vc/meeting/module/sketch/ISketchViewImpl;", "Landroid/view/TextureView$SurfaceTextureListener;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "attached", "", "isSketchViewValid", "mRenderModel", "Lcom/ss/android/vc/meeting/module/sketch/render/gl/model/GLRenderModel;", "mainHandler", "Landroid/os/Handler;", "markRenderRunnable", "com/ss/android/vc/meeting/module/sketch/render/gl/impl/GLSketchViewImpl$markRenderRunnable$1", "Lcom/ss/android/vc/meeting/module/sketch/render/gl/impl/GLSketchViewImpl$markRenderRunnable$1;", "markRenderer", "Lcom/ss/android/vc/meeting/module/sketch/render/gl/MarkersRenderer;", "sketchView", "Lcom/ss/android/vc/meeting/module/sketch/SketchView;", "attach", "", "parent", "Landroid/view/ViewGroup;", "params", "Landroid/widget/FrameLayout$LayoutParams;", "detach", "enterScaleMode", "getImplView", "Landroid/view/View;", "getRenderModel", "Lcom/ss/android/vc/meeting/module/sketch/SketchRenderModel;", "markRenderImpl", "onContentBoundChanged", "bound", "Landroid/graphics/RectF;", "onDestroy", "onEndRender", "onInit", "onRenderMark", "onStartRender", "onSurfaceTextureAvailable", "surface", "Landroid/graphics/SurfaceTexture;", "width", "", "height", "onSurfaceTextureDestroyed", "onSurfaceTextureSizeChanged", "onSurfaceTextureUpdated", "resetLayoutParams", "setRenderModel", "model", "setSketchView", "view", "setVisibleStatus", "visibility", "translateCoordinate", "Lcom/ss/android/vc/meeting/module/sketch/dto/Coord;", "percentPoint", "Companion", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
public final class GLSketchViewImpl extends BaseGLTextureView implements TextureView.SurfaceTextureListener, ISketchViewImpl {
    public static final Companion Companion = new Companion(null);
    private HashMap _$_findViewCache;
    private boolean attached;
    private volatile boolean isSketchViewValid;
    private GLRenderModel mRenderModel;
    private final Handler mainHandler = new Handler(Looper.getMainLooper());
    private final GLSketchViewImpl$markRenderRunnable$1 markRenderRunnable = new GLSketchViewImpl$markRenderRunnable$1(this);
    private MarkersRenderer markRenderer;
    private SketchView sketchView;

    public void _$_clearFindViewByIdCache() {
        HashMap hashMap = this._$_findViewCache;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    public View _$_findCachedViewById(int i) {
        if (this._$_findViewCache == null) {
            this._$_findViewCache = new HashMap();
        }
        View view = (View) this._$_findViewCache.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this._$_findViewCache.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    @Override // com.ss.android.vc.meeting.module.sketch.ISketchViewImpl
    public View getImplView() {
        return this;
    }

    @Override // com.ss.android.vc.meeting.module.sketch.ISketchViewImpl
    public void onEndRender() {
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lcom/ss/android/vc/meeting/module/sketch/render/gl/impl/GLSketchViewImpl$Companion;", "", "()V", "MARK_RENDER_INTERVAL", "", "TAG", "", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // com.ss.android.vc.meeting.module.sketch.ISketchViewImpl
    public SketchRenderModel getRenderModel() {
        GLRenderModel gLRenderModel = this.mRenderModel;
        if (gLRenderModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mRenderModel");
        }
        return gLRenderModel;
    }

    @Override // com.ss.android.vc.meeting.module.sketch.ISketchViewImpl
    public void onStartRender() {
        GLRenderModel gLRenderModel = this.mRenderModel;
        if (gLRenderModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mRenderModel");
        }
        gLRenderModel.invalidate();
    }

    @Override // com.ss.android.vc.meeting.module.sketch.ISketchViewImpl
    public void enterScaleMode() {
        GLRenderModel gLRenderModel = this.mRenderModel;
        if (gLRenderModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mRenderModel");
        }
        ISketchAction currentAction = gLRenderModel.getCurrentAction();
        if (currentAction != null) {
            currentAction.enterScaleMode();
        }
    }

    @Override // com.ss.android.vc.meeting.module.sketch.ISketchViewImpl
    public void onDestroy() {
        C60700b.m235851b("[Sketch] [GLSketchViewImpl]", "[onDestroy]", "onDestroy");
        this.isSketchViewValid = false;
        SketchView sketchView2 = this.sketchView;
        if (sketchView2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("sketchView");
        }
        sketchView2.endRender();
    }

    @Override // com.ss.android.vc.meeting.module.sketch.ISketchViewImpl
    public void onInit() {
        MarkersRenderer markersRenderer = new MarkersRenderer(getContext());
        this.markRenderer = markersRenderer;
        if (markersRenderer == null) {
            Intrinsics.throwUninitializedPropertyAccessException("markRenderer");
        }
        GLRenderModel gLRenderModel = this.mRenderModel;
        if (gLRenderModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mRenderModel");
        }
        markersRenderer.setModel(gLRenderModel);
    }

    public final void onRenderMark() {
        if (this.attached) {
            markRenderImpl();
            this.mainHandler.postDelayed(this.markRenderRunnable, 16);
        }
    }

    private final void markRenderImpl() {
        GLRenderModel gLRenderModel = this.mRenderModel;
        if (gLRenderModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mRenderModel");
        }
        synchronized (gLRenderModel.getMarkers()) {
            GLRenderModel gLRenderModel2 = this.mRenderModel;
            if (gLRenderModel2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mRenderModel");
            }
            if (!gLRenderModel2.getMarkers().isEmpty()) {
                MarkersRenderer markersRenderer = this.markRenderer;
                if (markersRenderer == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("markRenderer");
                }
                markersRenderer.postUpdate();
            }
            Unit unit = Unit.INSTANCE;
        }
    }

    @Override // com.ss.android.vc.meeting.module.sketch.ISketchViewImpl
    public void detach() {
        this.attached = false;
        this.mainHandler.removeCallbacks(this.markRenderRunnable);
        C60740ad.m236044a(this);
        MarkersRenderer markersRenderer = this.markRenderer;
        if (markersRenderer == null) {
            Intrinsics.throwUninitializedPropertyAccessException("markRenderer");
        }
        C60740ad.m236044a((View) markersRenderer);
    }

    @Override // com.ss.android.vc.meeting.module.sketch.ISketchViewImpl
    public void setSketchView(SketchView sketchView2) {
        Intrinsics.checkParameterIsNotNull(sketchView2, "view");
        this.sketchView = sketchView2;
    }

    @Override // com.ss.android.vc.meeting.module.sketch.render.gl.impl.BaseGLTextureView
    public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        Intrinsics.checkParameterIsNotNull(surfaceTexture, "surface");
        super.onSurfaceTextureUpdated(surfaceTexture);
    }

    @Override // com.ss.android.vc.meeting.module.sketch.ISketchViewImpl
    public void setVisibleStatus(int i) {
        setVisibility(i);
        MarkersRenderer markersRenderer = this.markRenderer;
        if (markersRenderer == null) {
            Intrinsics.throwUninitializedPropertyAccessException("markRenderer");
        }
        markersRenderer.setVisibility(i);
    }

    @Override // com.ss.android.vc.meeting.module.sketch.render.gl.impl.BaseGLTextureView, com.ss.android.vc.meeting.module.sketch.ISketchViewImpl
    public void onContentBoundChanged(RectF rectF) {
        C60700b.m235851b("[Sketch] [GLSketchViewImpl]", "[onContentBoundChanged]", "bound = " + rectF);
        super.onContentBoundChanged(rectF);
    }

    @Override // com.ss.android.vc.meeting.module.sketch.render.gl.impl.BaseGLTextureView
    public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        Intrinsics.checkParameterIsNotNull(surfaceTexture, "surface");
        super.onSurfaceTextureDestroyed(surfaceTexture);
        this.isSketchViewValid = false;
        SketchView sketchView2 = this.sketchView;
        if (sketchView2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("sketchView");
        }
        sketchView2.endRender();
        return true;
    }

    @Override // com.ss.android.vc.meeting.module.sketch.ISketchViewImpl
    public void setRenderModel(SketchRenderModel sketchRenderModel) {
        Intrinsics.checkParameterIsNotNull(sketchRenderModel, "model");
        if (sketchRenderModel instanceof GLRenderModel) {
            this.mRenderModel = (GLRenderModel) sketchRenderModel;
        } else {
            C60700b.m235864f("[Sketch] [GLSketchViewImpl]", "[setRenderModel]", "model is not GLRenderModel");
        }
    }

    public GLSketchViewImpl(Context context) {
        super(context);
        setEGLContextClientVersion(2);
        setOpaque(false);
        setSurfaceTextureListener(this);
    }

    @Override // com.ss.android.vc.meeting.module.sketch.ISketchViewImpl
    public void resetLayoutParams(FrameLayout.LayoutParams layoutParams) {
        Intrinsics.checkParameterIsNotNull(layoutParams, "params");
        C60700b.m235851b("[Sketch] [GLSketchViewImpl]", "[resetLayoutParams]", "[w]" + layoutParams.width + "  [h]" + layoutParams.height);
        setLayoutParams(new FrameLayout.LayoutParams(layoutParams));
    }

    @Override // com.ss.android.vc.meeting.module.sketch.ISketchViewImpl
    public Coord translateCoordinate(Coord coord) {
        Intrinsics.checkParameterIsNotNull(coord, "percentPoint");
        return CoordinateUtil.percent2PCDatum(coord, getRenderModel().getSketchRange().mo210163b(), getRenderModel().getSketchRange().mo210165c());
    }

    public GLSketchViewImpl(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setEGLContextClientVersion(2);
        setOpaque(false);
        setSurfaceTextureListener(this);
    }

    @Override // com.ss.android.vc.meeting.module.sketch.ISketchViewImpl
    public void attach(ViewGroup viewGroup, FrameLayout.LayoutParams layoutParams) {
        Intrinsics.checkParameterIsNotNull(viewGroup, "parent");
        Intrinsics.checkParameterIsNotNull(layoutParams, "params");
        C60700b.m235851b("[Sketch] [GLSketchViewImpl]", "[attach]", "[w]" + layoutParams.width + "  [h]" + layoutParams.height);
        viewGroup.addView(this, layoutParams);
        MarkersRenderer markersRenderer = this.markRenderer;
        if (markersRenderer == null) {
            Intrinsics.throwUninitializedPropertyAccessException("markRenderer");
        }
        viewGroup.addView(markersRenderer, new FrameLayout.LayoutParams(layoutParams));
        this.attached = true;
        this.mainHandler.post(this.markRenderRunnable);
    }

    @Override // com.ss.android.vc.meeting.module.sketch.render.gl.impl.BaseGLTextureView
    public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
        Intrinsics.checkParameterIsNotNull(surfaceTexture, "surface");
        super.onSurfaceTextureSizeChanged(surfaceTexture, i, i2);
        GLRenderModel gLRenderModel = this.mRenderModel;
        if (gLRenderModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mRenderModel");
        }
        gLRenderModel.setViewportChanged(true);
    }

    @Override // com.ss.android.vc.meeting.module.sketch.render.gl.impl.BaseGLTextureView
    public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        Intrinsics.checkParameterIsNotNull(surfaceTexture, "surface");
        super.onSurfaceTextureAvailable(surfaceTexture, i, i2);
        this.isSketchViewValid = true;
        SketchView sketchView2 = this.sketchView;
        if (sketchView2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("sketchView");
        }
        sketchView2.startRender();
        GLRenderModel gLRenderModel = this.mRenderModel;
        if (gLRenderModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mRenderModel");
        }
        gLRenderModel.setViewportChanged(true);
    }
}
