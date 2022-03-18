package com.ss.android.vc.meeting.module.sketch.render.canvas;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.RectF;
import android.graphics.SurfaceTexture;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.framework.utils.C26284k;
import com.ss.android.vc.common.p3077b.C60700b;
import com.ss.android.vc.common.p3083e.C60735ab;
import com.ss.android.vc.common.p3083e.C60740ad;
import com.ss.android.vc.common.p3083e.C60776r;
import com.ss.android.vc.dependency.ar;
import com.ss.android.vc.entity.sketch.SketchRange;
import com.ss.android.vc.meeting.framework.meeting.C61303k;
import com.ss.android.vc.meeting.framework.meeting.DisplayMode;
import com.ss.android.vc.meeting.module.sketch.AbsSketchControl;
import com.ss.android.vc.meeting.module.sketch.ISketchViewImpl;
import com.ss.android.vc.meeting.module.sketch.SketchRenderModel;
import com.ss.android.vc.meeting.module.sketch.SketchView;
import com.ss.android.vc.meeting.module.sketch.action.ISketchAction;
import com.ss.android.vc.meeting.module.sketch.dto.Coord;
import com.ss.android.vc.meeting.module.sketch.render.AbstractShapeRender;
import com.ss.android.vc.meeting.module.sketch.render.canvas.model.CanvasRenderModel;
import com.ss.android.vc.meeting.module.sketch.render.canvas.painters.BasePainter;
import com.ss.android.vc.meeting.module.sketch.utils.CoordinateUtil;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000¤\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 F2\u00020\u00012\u00020\u00022\u00020\u0003:\u0002FGB%\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u0018\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001dH\u0016J\b\u0010\u001e\u001a\u00020\u0019H\u0016J\b\u0010\u001f\u001a\u00020\u0019H\u0016J\b\u0010 \u001a\u00020!H\u0016J\b\u0010\"\u001a\u00020\u0012H\u0016J\u0010\u0010#\u001a\u00020\u00192\u0006\u0010$\u001a\u00020%H\u0016J\b\u0010&\u001a\u00020\u0019H\u0016J\b\u0010'\u001a\u00020\u0019H\u0016J\b\u0010(\u001a\u00020\u0019H\u0016J\b\u0010)\u001a\u00020\u0019H\u0016J \u0010*\u001a\u00020\u00192\u0006\u0010+\u001a\u00020,2\u0006\u0010-\u001a\u00020\t2\u0006\u0010.\u001a\u00020\tH\u0016J\u0010\u0010/\u001a\u00020\f2\u0006\u0010+\u001a\u00020,H\u0016J \u00100\u001a\u00020\u00192\u0006\u0010+\u001a\u00020,2\u0006\u0010-\u001a\u00020\t2\u0006\u0010.\u001a\u00020\tH\u0016J\u0010\u00101\u001a\u00020\u00192\u0006\u0010+\u001a\u00020,H\u0016J\u0010\u00102\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u001dH\u0016J\u0018\u00103\u001a\u00020\u00192\u0006\u0010-\u001a\u00020\t2\u0006\u0010.\u001a\u00020\tH\u0002J\u0012\u00104\u001a\u00020\u00192\b\u00105\u001a\u0004\u0018\u000106H\u0016J\u0010\u00107\u001a\u00020\u00192\u0006\u00108\u001a\u00020\u0017H\u0016J\u0010\u00109\u001a\u00020\u00192\u0006\u0010:\u001a\u00020\tH\u0016J\u0010\u0010;\u001a\u00020<2\u0006\u0010=\u001a\u00020<H\u0016J4\u0010>\u001a\b\u0012\u0004\u0012\u00020@0?*\u000e\u0012\u0004\u0012\u00020@\u0012\u0004\u0012\u00020B0A2\u0006\u0010C\u001a\u00020\u00102\u0006\u0010$\u001a\u00020%2\u0006\u0010D\u001a\u00020ER\u000e\u0010\u000b\u001a\u00020\fX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X.¢\u0006\u0002\n\u0000R\u0014\u0010\u0013\u001a\b\u0018\u00010\u0014R\u00020\u0000X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\fX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X.¢\u0006\u0002\n\u0000¨\u0006H"}, d2 = {"Lcom/ss/android/vc/meeting/module/sketch/render/canvas/CanvasSketchViewImpl;", "Landroid/view/TextureView;", "Lcom/ss/android/vc/meeting/module/sketch/ISketchViewImpl;", "Landroid/view/TextureView$SurfaceTextureListener;", "ctx", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyle", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "isSketchViewValid", "", "mCacheBitmap", "Landroid/graphics/Bitmap;", "mCacheCanvas", "Landroid/graphics/Canvas;", "mRenderModel", "Lcom/ss/android/vc/meeting/module/sketch/render/canvas/model/CanvasRenderModel;", "mRenderThread", "Lcom/ss/android/vc/meeting/module/sketch/render/canvas/CanvasSketchViewImpl$RenderThread;", "mRendering", "sketchView", "Lcom/ss/android/vc/meeting/module/sketch/SketchView;", "attach", "", "parent", "Landroid/view/ViewGroup;", "params", "Landroid/widget/FrameLayout$LayoutParams;", "detach", "enterScaleMode", "getImplView", "Landroid/view/View;", "getRenderModel", "onContentBoundChanged", "bound", "Landroid/graphics/RectF;", "onDestroy", "onEndRender", "onInit", "onStartRender", "onSurfaceTextureAvailable", "surface", "Landroid/graphics/SurfaceTexture;", "width", "height", "onSurfaceTextureDestroyed", "onSurfaceTextureSizeChanged", "onSurfaceTextureUpdated", "resetLayoutParams", "setCacheSize", "setRenderModel", "model", "Lcom/ss/android/vc/meeting/module/sketch/SketchRenderModel;", "setSketchView", "view", "setVisibleStatus", "visibility", "translateCoordinate", "Lcom/ss/android/vc/meeting/module/sketch/dto/Coord;", "percentPoint", "renderAll", "", "", "", "Lcom/ss/android/vc/meeting/module/sketch/render/AbstractShapeRender;", "canvas", "sketchRange", "Lcom/ss/android/vc/entity/sketch/SketchRange;", "Companion", "RenderThread", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
public final class CanvasSketchViewImpl extends TextureView implements TextureView.SurfaceTextureListener, ISketchViewImpl {
    public static final Companion Companion = new Companion(null);
    private HashMap _$_findViewCache;
    public volatile boolean isSketchViewValid;
    public Bitmap mCacheBitmap;
    public Canvas mCacheCanvas;
    public volatile CanvasRenderModel mRenderModel;
    private RenderThread mRenderThread;
    public volatile boolean mRendering;
    public SketchView sketchView;

    public CanvasSketchViewImpl(Context context) {
        this(context, null, 0, 6, null);
    }

    public CanvasSketchViewImpl(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

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

    public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        Intrinsics.checkParameterIsNotNull(surfaceTexture, "surface");
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ss/android/vc/meeting/module/sketch/render/canvas/CanvasSketchViewImpl$Companion;", "", "()V", "TAG", "", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000A\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u000e\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0006\u0010\u0010\u001a\u00020\u0011J\b\u0010\u0012\u001a\u00020\u0011H\u0002J\u000e\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0006J\b\u0010\u0016\u001a\u00020\u0011H\u0002J\u0010\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u0018\u001a\u00020\u0019H\u0002J\u0006\u0010\u001a\u001a\u00020\u0014J\u0006\u0010\u001b\u001a\u00020\u0014R\u000e\u0010\u0005\u001a\u00020\u0006XD¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0006XD¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0010\u0010\r\u001a\u00020\u000eX\u0004¢\u0006\u0004\n\u0002\u0010\u000f¨\u0006\u001c"}, d2 = {"Lcom/ss/android/vc/meeting/module/sketch/render/canvas/CanvasSketchViewImpl$RenderThread;", "", "name", "", "(Lcom/ss/android/vc/meeting/module/sketch/render/canvas/CanvasSketchViewImpl;Ljava/lang/String;)V", "drawInterval", "", "lastLogTime", "logInterval", "mHandler", "Landroid/os/Handler;", "getName", "()Ljava/lang/String;", "renderRunnable", "com/ss/android/vc/meeting/module/sketch/render/canvas/CanvasSketchViewImpl$RenderThread$renderRunnable$1", "Lcom/ss/android/vc/meeting/module/sketch/render/canvas/CanvasSketchViewImpl$RenderThread$renderRunnable$1;", "isAlive", "", "isValidEnv", "join", "", "timeInMs", "onRender", "onRenderInternal", "canvas", "Landroid/graphics/Canvas;", "quit", "start", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
    public final class RenderThread {
        public final long drawInterval = 16;
        private long lastLogTime;
        private final long logInterval = 3000;
        public Handler mHandler;
        private final String name;
        private final CanvasSketchViewImpl$RenderThread$renderRunnable$1 renderRunnable = new CanvasSketchViewImpl$RenderThread$renderRunnable$1(this);
        final /* synthetic */ CanvasSketchViewImpl this$0;

        public final String getName() {
            return this.name;
        }

        public final void quit() {
            Looper looper;
            Handler handler = this.mHandler;
            if (handler != null && (looper = handler.getLooper()) != null) {
                looper.quit();
            }
        }

        public final void start() {
            Handler a = C60735ab.m235995a(this.name);
            a.post(this.renderRunnable);
            this.mHandler = a;
        }

        public final boolean isAlive() {
            Looper looper;
            Thread thread;
            Handler handler = this.mHandler;
            if (handler == null || (looper = handler.getLooper()) == null || (thread = looper.getThread()) == null) {
                return false;
            }
            return thread.isAlive();
        }

        private final boolean isValidEnv() {
            C61303k meeting;
            AbsSketchControl ag;
            DisplayMode displayMode;
            DisplayMode displayMode2;
            if (this.this$0.isSketchViewValid && isAlive() && !CanvasSketchViewImpl.access$getMRenderModel$p(this.this$0).getContentBoundary().isEmpty() && !CanvasSketchViewImpl.access$getMRenderModel$p(this.this$0).getOriginContentBoundary().isEmpty() && CanvasSketchViewImpl.access$getSketchView$p(this.this$0).getMeeting() != null && (meeting = CanvasSketchViewImpl.access$getSketchView$p(this.this$0).getMeeting()) != null && (ag = meeting.ag()) != null && ag.canSketchOn()) {
                C61303k meeting2 = CanvasSketchViewImpl.access$getSketchView$p(this.this$0).getMeeting();
                DisplayMode displayMode3 = null;
                if (meeting2 != null) {
                    displayMode = meeting2.mo212067p();
                } else {
                    displayMode = null;
                }
                if (displayMode == DisplayMode.ACTIVITY) {
                    return true;
                }
                C61303k meeting3 = CanvasSketchViewImpl.access$getSketchView$p(this.this$0).getMeeting();
                if (meeting3 != null) {
                    displayMode2 = meeting3.mo212067p();
                } else {
                    displayMode2 = null;
                }
                if (displayMode2 == DisplayMode.WINDOW) {
                    return true;
                }
                C61303k meeting4 = CanvasSketchViewImpl.access$getSketchView$p(this.this$0).getMeeting();
                if (meeting4 != null) {
                    displayMode3 = meeting4.mo212067p();
                }
                if (displayMode3 == DisplayMode.FAST_ENTRY) {
                    return true;
                }
            }
            return false;
        }

        public final boolean onRender() {
            boolean z;
            boolean z2;
            DisplayMode displayMode;
            if (!isValidEnv()) {
                StringBuilder sb = new StringBuilder();
                sb.append("invalid, isSketchViewValid = ");
                sb.append(this.this$0.isSketchViewValid);
                sb.append(", isAlive = ");
                sb.append(isAlive());
                sb.append(", content = ");
                sb.append(CanvasSketchViewImpl.access$getMRenderModel$p(this.this$0).getContentBoundary());
                sb.append(", origin = ");
                sb.append(CanvasSketchViewImpl.access$getMRenderModel$p(this.this$0).getOriginContentBoundary());
                sb.append(", display mode = ");
                C61303k meeting = CanvasSketchViewImpl.access$getSketchView$p(this.this$0).getMeeting();
                if (meeting != null) {
                    displayMode = meeting.mo212067p();
                } else {
                    displayMode = null;
                }
                sb.append(displayMode);
                C60700b.m235851b("[Sketch] [CanvasSketchViewImpl]", "[onRender3]", sb.toString());
                return false;
            }
            synchronized (CanvasSketchViewImpl.access$getMRenderModel$p(this.this$0)) {
                if (!CanvasSketchViewImpl.access$getMRenderModel$p(this.this$0).getDirty()) {
                    if (!(!CanvasSketchViewImpl.access$getMRenderModel$p(this.this$0).getVariateData().isEmpty())) {
                        z = false;
                        Unit unit = Unit.INSTANCE;
                    }
                }
                z = true;
                Unit unit2 = Unit.INSTANCE;
            }
            if (!z) {
                return true;
            }
            if (C26284k.m95185a(ar.m236694a()) || System.currentTimeMillis() - this.lastLogTime >= this.logInterval) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                this.lastLogTime = System.currentTimeMillis();
            }
            System.currentTimeMillis();
            Canvas lockCanvas = this.this$0.lockCanvas();
            if (lockCanvas != null) {
                System.currentTimeMillis();
                onRenderInternal(lockCanvas);
                try {
                    this.this$0.unlockCanvasAndPost(lockCanvas);
                } catch (IllegalArgumentException e) {
                    C60700b.m235864f("[Sketch] [CanvasSketchViewImpl]", "[onRender4]", "IllegalArgumentException: " + e.getStackTrace());
                }
                return true;
            }
            C60700b.m235864f("[Sketch] [CanvasSketchViewImpl]", "[onRender5]", "canvas == null");
            return false;
        }

        public final void join(long j) {
            Looper looper;
            Thread thread;
            Handler handler = this.mHandler;
            if (handler != null && (looper = handler.getLooper()) != null && (thread = looper.getThread()) != null) {
                thread.join(j);
            }
        }

        private final void onRenderInternal(Canvas canvas) {
            if (this.this$0.mRendering) {
                canvas.drawColor(0, PorterDuff.Mode.CLEAR);
                CanvasSketchViewImpl.access$getMRenderModel$p(this.this$0).setDirty(false);
                synchronized (CanvasSketchViewImpl.access$getMRenderModel$p(this.this$0)) {
                    if (CanvasSketchViewImpl.access$getMRenderModel$p(this.this$0).getStaticChanged()) {
                        this.this$0.mCacheCanvas.drawColor(0, PorterDuff.Mode.CLEAR);
                        CanvasSketchViewImpl canvasSketchViewImpl = this.this$0;
                        canvasSketchViewImpl.renderAll(canvasSketchViewImpl.getRenderModel().getStaticData(), this.this$0.mCacheCanvas, CanvasSketchViewImpl.access$getMRenderModel$p(this.this$0).getOriginContentBoundary(), CanvasSketchViewImpl.access$getMRenderModel$p(this.this$0).getSketchRange());
                        CanvasSketchViewImpl.access$getMRenderModel$p(this.this$0).updateStaticChanged(false, hashCode());
                    }
                    CanvasSketchViewImpl canvasSketchViewImpl2 = this.this$0;
                    canvasSketchViewImpl2.renderAll(canvasSketchViewImpl2.getRenderModel().getPendingStaticData(), this.this$0.mCacheCanvas, CanvasSketchViewImpl.access$getMRenderModel$p(this.this$0).getOriginContentBoundary(), CanvasSketchViewImpl.access$getMRenderModel$p(this.this$0).getSketchRange());
                    CanvasSketchViewImpl.access$getMRenderModel$p(this.this$0).getStaticData().putAll(this.this$0.getRenderModel().getPendingStaticData());
                    this.this$0.getRenderModel().getPendingStaticData().clear();
                    Unit unit = Unit.INSTANCE;
                }
                if (this.this$0.mRendering) {
                    canvas.drawBitmap(this.this$0.mCacheBitmap, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, (Paint) null);
                    synchronized (CanvasSketchViewImpl.access$getMRenderModel$p(this.this$0)) {
                        CanvasSketchViewImpl canvasSketchViewImpl3 = this.this$0;
                        List<String> renderAll = canvasSketchViewImpl3.renderAll(CanvasSketchViewImpl.access$getMRenderModel$p(canvasSketchViewImpl3).getDynamicData(), canvas, CanvasSketchViewImpl.access$getMRenderModel$p(this.this$0).getOriginContentBoundary(), CanvasSketchViewImpl.access$getMRenderModel$p(this.this$0).getSketchRange());
                        boolean z = true;
                        boolean z2 = !renderAll.isEmpty();
                        for (String str : renderAll) {
                            CanvasSketchViewImpl.access$getMRenderModel$p(this.this$0).removeDynamic(str);
                        }
                        CanvasSketchViewImpl canvasSketchViewImpl4 = this.this$0;
                        List<String> renderAll2 = canvasSketchViewImpl4.renderAll(CanvasSketchViewImpl.access$getMRenderModel$p(canvasSketchViewImpl4).getVariateData(), canvas, CanvasSketchViewImpl.access$getMRenderModel$p(this.this$0).getOriginContentBoundary(), CanvasSketchViewImpl.access$getMRenderModel$p(this.this$0).getSketchRange());
                        if (!(!renderAll2.isEmpty())) {
                            z = z2;
                        }
                        for (String str2 : renderAll2) {
                            CanvasSketchViewImpl.access$getMRenderModel$p(this.this$0).removeVariate(str2);
                        }
                        if (!CanvasSketchViewImpl.access$getMRenderModel$p(this.this$0).getDirty()) {
                            CanvasSketchViewImpl.access$getMRenderModel$p(this.this$0).setDirty(z);
                        }
                        Unit unit2 = Unit.INSTANCE;
                    }
                }
            }
        }

        public RenderThread(CanvasSketchViewImpl canvasSketchViewImpl, String str) {
            Intrinsics.checkParameterIsNotNull(str, "name");
            this.this$0 = canvasSketchViewImpl;
            this.name = str;
        }
    }

    @Override // com.ss.android.vc.meeting.module.sketch.ISketchViewImpl
    public void detach() {
        C60740ad.m236044a(this);
    }

    @Override // com.ss.android.vc.meeting.module.sketch.ISketchViewImpl
    public CanvasRenderModel getRenderModel() {
        CanvasRenderModel canvasRenderModel = this.mRenderModel;
        if (canvasRenderModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mRenderModel");
        }
        return canvasRenderModel;
    }

    @Override // com.ss.android.vc.meeting.module.sketch.ISketchViewImpl
    public void onInit() {
        setOpaque(false);
        setSurfaceTextureListener(this);
    }

    @Override // com.ss.android.vc.meeting.module.sketch.ISketchViewImpl
    public void enterScaleMode() {
        CanvasRenderModel canvasRenderModel = this.mRenderModel;
        if (canvasRenderModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mRenderModel");
        }
        ISketchAction currentAction = canvasRenderModel.getCurrentAction();
        if (currentAction != null) {
            currentAction.enterScaleMode();
        }
    }

    @Override // com.ss.android.vc.meeting.module.sketch.ISketchViewImpl
    public void onDestroy() {
        this.isSketchViewValid = false;
        C60700b.m235851b("[Sketch] [CanvasSketchViewImpl]", "[onDestroy]", "[destroy]");
        SketchView sketchView2 = this.sketchView;
        if (sketchView2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("sketchView");
        }
        sketchView2.endRender();
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(8:2|(1:4)|5|6|7|(1:9)|10|11) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:6:0x0018 */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x001c A[Catch:{ InterruptedException -> 0x0018 }] */
    @Override // com.ss.android.vc.meeting.module.sketch.ISketchViewImpl
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onEndRender() {
        /*
            r4 = this;
            com.ss.android.vc.meeting.module.sketch.render.canvas.CanvasSketchViewImpl$RenderThread r0 = r4.mRenderThread
            if (r0 == 0) goto L_0x002d
            java.lang.String r0 = "[Sketch] [CanvasSketchViewImpl]"
            java.lang.String r1 = "[endRender]"
            com.ss.android.vc.common.p3077b.C60700b.m235851b(r0, r1, r1)
            r1 = 0
            r4.mRendering = r1
            com.ss.android.vc.meeting.module.sketch.render.canvas.CanvasSketchViewImpl$RenderThread r1 = r4.mRenderThread
            if (r1 != 0) goto L_0x0015
            kotlin.jvm.internal.Intrinsics.throwNpe()
        L_0x0015:
            r1.quit()
        L_0x0018:
            com.ss.android.vc.meeting.module.sketch.render.canvas.CanvasSketchViewImpl$RenderThread r1 = r4.mRenderThread     // Catch:{ InterruptedException -> 0x0018 }
            if (r1 == 0) goto L_0x0021
            r2 = 1000(0x3e8, double:4.94E-321)
            r1.join(r2)     // Catch:{ InterruptedException -> 0x0018 }
        L_0x0021:
            java.lang.String r1 = "[endRender2]"
            java.lang.String r2 = "join complete"
            com.ss.android.vc.common.p3077b.C60700b.m235851b(r0, r1, r2)
            r0 = 0
            com.ss.android.vc.meeting.module.sketch.render.canvas.CanvasSketchViewImpl$RenderThread r0 = (com.ss.android.vc.meeting.module.sketch.render.canvas.CanvasSketchViewImpl.RenderThread) r0
            r4.mRenderThread = r0
        L_0x002d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.vc.meeting.module.sketch.render.canvas.CanvasSketchViewImpl.onEndRender():void");
    }

    @Override // com.ss.android.vc.meeting.module.sketch.ISketchViewImpl
    public void onStartRender() {
        if (this.mRenderThread == null) {
            C60700b.m235851b("[Sketch] [CanvasSketchViewImpl]", "[onStartRender]", "[startRender]");
            RenderThread renderThread = new RenderThread(this, "SketchRenderThread");
            this.mRenderThread = renderThread;
            if (renderThread != null) {
                renderThread.start();
            }
        }
        this.mRendering = true;
        CanvasRenderModel canvasRenderModel = this.mRenderModel;
        if (canvasRenderModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mRenderModel");
        }
        canvasRenderModel.invalidate();
    }

    @Override // com.ss.android.vc.meeting.module.sketch.ISketchViewImpl
    public void setVisibleStatus(int i) {
        setVisibility(i);
    }

    @Override // com.ss.android.vc.meeting.module.sketch.ISketchViewImpl
    public void setSketchView(SketchView sketchView2) {
        Intrinsics.checkParameterIsNotNull(sketchView2, "view");
        this.sketchView = sketchView2;
    }

    public static final /* synthetic */ CanvasRenderModel access$getMRenderModel$p(CanvasSketchViewImpl canvasSketchViewImpl) {
        CanvasRenderModel canvasRenderModel = canvasSketchViewImpl.mRenderModel;
        if (canvasRenderModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mRenderModel");
        }
        return canvasRenderModel;
    }

    public static final /* synthetic */ SketchView access$getSketchView$p(CanvasSketchViewImpl canvasSketchViewImpl) {
        SketchView sketchView2 = canvasSketchViewImpl.sketchView;
        if (sketchView2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("sketchView");
        }
        return sketchView2;
    }

    @Override // com.ss.android.vc.meeting.module.sketch.ISketchViewImpl
    public void resetLayoutParams(FrameLayout.LayoutParams layoutParams) {
        Intrinsics.checkParameterIsNotNull(layoutParams, "params");
        setLayoutParams(new FrameLayout.LayoutParams(layoutParams));
    }

    @Override // com.ss.android.vc.meeting.module.sketch.ISketchViewImpl
    public void setRenderModel(SketchRenderModel sketchRenderModel) {
        if (sketchRenderModel instanceof CanvasRenderModel) {
            this.mRenderModel = (CanvasRenderModel) sketchRenderModel;
        }
    }

    public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        Intrinsics.checkParameterIsNotNull(surfaceTexture, "surface");
        C60700b.m235851b("[Sketch] [CanvasSketchViewImpl]", "[onSurfaceTextureDestroyed]", "start");
        this.isSketchViewValid = false;
        SketchView sketchView2 = this.sketchView;
        if (sketchView2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("sketchView");
        }
        sketchView2.endRender();
        return true;
    }

    @Override // com.ss.android.vc.meeting.module.sketch.ISketchViewImpl
    public Coord translateCoordinate(Coord coord) {
        Intrinsics.checkParameterIsNotNull(coord, "percentPoint");
        return CoordinateUtil.percent2PCDatum(coord, getRenderModel().getSketchRange().mo210163b(), getRenderModel().getSketchRange().mo210165c());
    }

    @Override // com.ss.android.vc.meeting.module.sketch.ISketchViewImpl
    public void onContentBoundChanged(RectF rectF) {
        Intrinsics.checkParameterIsNotNull(rectF, "bound");
        Thread currentThread = Thread.currentThread();
        Looper mainLooper = Looper.getMainLooper();
        Intrinsics.checkExpressionValueIsNotNull(mainLooper, "Looper.getMainLooper()");
        if (currentThread == mainLooper.getThread()) {
            CanvasRenderModel canvasRenderModel = this.mRenderModel;
            if (canvasRenderModel == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mRenderModel");
            }
            RectF contentBoundary = canvasRenderModel.getContentBoundary();
            CanvasRenderModel canvasRenderModel2 = this.mRenderModel;
            if (canvasRenderModel2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mRenderModel");
            }
            float contentScale = CoordinateUtil.getContentScale(contentBoundary, canvasRenderModel2.getOriginContentBoundary());
            CanvasRenderModel canvasRenderModel3 = this.mRenderModel;
            if (canvasRenderModel3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mRenderModel");
            }
            float f = canvasRenderModel3.getContentBoundary().left;
            CanvasRenderModel canvasRenderModel4 = this.mRenderModel;
            if (canvasRenderModel4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mRenderModel");
            }
            float f2 = f - canvasRenderModel4.getOriginContentBoundary().left;
            CanvasRenderModel canvasRenderModel5 = this.mRenderModel;
            if (canvasRenderModel5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mRenderModel");
            }
            float f3 = canvasRenderModel5.getContentBoundary().top;
            CanvasRenderModel canvasRenderModel6 = this.mRenderModel;
            if (canvasRenderModel6 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mRenderModel");
            }
            float f4 = f3 - canvasRenderModel6.getOriginContentBoundary().top;
            setPivotX(BitmapDescriptorFactory.HUE_RED);
            setPivotY(BitmapDescriptorFactory.HUE_RED);
            if (!Float.isNaN(contentScale) && !Float.isInfinite(contentScale)) {
                setScaleX(contentScale);
                setScaleY(contentScale);
            }
            if (!Float.isNaN(f2) && !Float.isInfinite(f2)) {
                setTranslationX(f2);
            }
            if (!Float.isNaN(f4) && !Float.isInfinite(f4)) {
                setTranslationY(f4);
            }
        }
    }

    @Override // com.ss.android.vc.meeting.module.sketch.ISketchViewImpl
    public void attach(ViewGroup viewGroup, FrameLayout.LayoutParams layoutParams) {
        Intrinsics.checkParameterIsNotNull(viewGroup, "parent");
        Intrinsics.checkParameterIsNotNull(layoutParams, "params");
        viewGroup.addView(this, layoutParams);
    }

    private final void setCacheSize(int i, int i2) {
        CanvasRenderModel canvasRenderModel = this.mRenderModel;
        if (canvasRenderModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mRenderModel");
        }
        synchronized (canvasRenderModel) {
            CanvasRenderModel canvasRenderModel2 = this.mRenderModel;
            if (canvasRenderModel2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mRenderModel");
            }
            canvasRenderModel2.setSketchHashCode(hashCode());
            Bitmap createBitmap = Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_8888);
            Intrinsics.checkExpressionValueIsNotNull(createBitmap, "Bitmap.createBitmap(widt… Bitmap.Config.ARGB_8888)");
            this.mCacheBitmap = createBitmap;
            this.mCacheCanvas = new Canvas(this.mCacheBitmap);
            CanvasRenderModel canvasRenderModel3 = this.mRenderModel;
            if (canvasRenderModel3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mRenderModel");
            }
            canvasRenderModel3.updateStaticChanged(true, hashCode());
            Unit unit = Unit.INSTANCE;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CanvasSketchViewImpl(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkParameterIsNotNull(context, "ctx");
        Bitmap createBitmap = Bitmap.createBitmap(C60776r.m236139a(), C60776r.m236144b(), Bitmap.Config.ARGB_8888);
        Intrinsics.checkExpressionValueIsNotNull(createBitmap, "Bitmap.createBitmap(VCDe… Bitmap.Config.ARGB_8888)");
        this.mCacheBitmap = createBitmap;
        this.mCacheCanvas = new Canvas(this.mCacheBitmap);
    }

    public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        Intrinsics.checkParameterIsNotNull(surfaceTexture, "surface");
        this.isSketchViewValid = true;
        C60700b.m235851b("[Sketch] [CanvasSketchViewImpl]", "[onSurfaceTextureAvailable]", "$[w]" + i + "  [h]" + i2);
        if (i > 0 && i2 > 0) {
            setCacheSize(i, i2);
        }
        SketchView sketchView2 = this.sketchView;
        if (sketchView2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("sketchView");
        }
        sketchView2.startRender();
    }

    public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
        Intrinsics.checkParameterIsNotNull(surfaceTexture, "surface");
        C60700b.m235843a("[Sketch] [CanvasSketchViewImpl]", "[onSurfaceTextureSizeChanged]", "[w]" + i + "  [h]" + i2);
        if (i > 0 && i2 > 0) {
            setCacheSize(i, i2);
        }
    }

    public final List<String> renderAll(Map<String, AbstractShapeRender> map, Canvas canvas, RectF rectF, SketchRange aVar) {
        Intrinsics.checkParameterIsNotNull(map, "$this$renderAll");
        Intrinsics.checkParameterIsNotNull(canvas, "canvas");
        Intrinsics.checkParameterIsNotNull(rectF, "bound");
        Intrinsics.checkParameterIsNotNull(aVar, "sketchRange");
        LinkedList linkedList = new LinkedList();
        for (Map.Entry<String, AbstractShapeRender> entry : map.entrySet()) {
            String key = entry.getKey();
            AbstractShapeRender value = entry.getValue();
            if (this.mRendering && (value instanceof BasePainter) && ((BasePainter) value).draw(canvas, rectF, aVar)) {
                linkedList.add(key);
            }
        }
        return linkedList;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ CanvasSketchViewImpl(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
