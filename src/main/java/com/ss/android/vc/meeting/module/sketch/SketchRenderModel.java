package com.ss.android.vc.meeting.module.sketch;

import android.graphics.RectF;
import com.bytedance.frameworks.baselib.network.http.cronet.impl.C14002h;
import com.google.firebase.messaging.Constants;
import com.larksuite.suite.R;
import com.ss.android.vc.common.p3077b.C60700b;
import com.ss.android.vc.common.p3083e.C60735ab;
import com.ss.android.vc.common.p3083e.C60773o;
import com.ss.android.vc.entity.sketch.SketchOperationUnit;
import com.ss.android.vc.entity.sketch.SketchRange;
import com.ss.android.vc.meeting.module.sketch.action.ArrowAction;
import com.ss.android.vc.meeting.module.sketch.action.ISketchAction;
import com.ss.android.vc.meeting.module.sketch.action.PencilAction;
import com.ss.android.vc.meeting.module.sketch.action.SketchMode;
import com.ss.android.vc.meeting.module.sketch.dto.MarkerDrawableData;
import com.ss.android.vc.meeting.module.sketch.dto.arrow.ArrowDrawableData;
import com.ss.android.vc.meeting.module.sketch.dto.comet.CometDrawableData;
import com.ss.android.vc.meeting.module.sketch.dto.oval.OvalDrawableData;
import com.ss.android.vc.meeting.module.sketch.dto.pencil.PencilDrawableData;
import com.ss.android.vc.meeting.module.sketch.dto.pencil.PencilType;
import com.ss.android.vc.meeting.module.sketch.dto.rect.RectangleDrawableData;
import com.ss.android.vc.meeting.module.sketch.render.AbstractShapeRender;
import com.ss.android.vc.meeting.module.sketch.render.IMarkRender;
import com.ss.android.vc.meeting.module.sketch.render.IRemotePencilsProxyRenderer;
import com.ss.android.vc.meeting.module.sketch.utils.UsernameStore;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentSkipListSet;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000ì\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u001a\b&\u0018\u0000 \u00012\u00020\u0001:\u0004\u0001\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0018\u0010Q\u001a\u00020R2\u0006\u0010S\u001a\u00020\u001e2\u0006\u0010T\u001a\u00020UH&J\b\u0010V\u001a\u00020RH&J\b\u0010W\u001a\u00020RH&J\b\u0010X\u001a\u00020RH\u0002J\b\u0010Y\u001a\u00020RH\u0002J\u0006\u0010Z\u001a\u00020RJ\u0010\u0010[\u001a\u00020\u001f2\u0006\u0010\\\u001a\u00020]H&J\u0010\u0010^\u001a\u00020\u001f2\u0006\u0010_\u001a\u00020`H&J\u0010\u0010a\u001a\u00020U2\u0006\u0010b\u001a\u00020cH&J\u0010\u0010d\u001a\u00020\u001f2\u0006\u0010e\u001a\u00020fH&J\u0010\u0010g\u001a\u00020\u001f2\u0006\u0010h\u001a\u00020iH&J\u0010\u0010j\u001a\u00020\u001f2\u0006\u0010k\u001a\u00020lH&J\u0016\u0010m\u001a\u00020\u001e2\u0006\u0010n\u001a\u00020\u001e2\u0006\u0010o\u001a\u00020\bJ\b\u0010p\u001a\u00020RH&J\u000e\u0010q\u001a\u00020F2\u0006\u0010n\u001a\u00020\u001eJ\u0010\u0010r\u001a\u00020R2\u0006\u0010n\u001a\u00020\u001eH\u0004J\u0016\u0010s\u001a\u00020R2\f\u0010t\u001a\b\u0012\u0004\u0012\u00020\u001e0uH\u0002J\u0010\u0010s\u001a\u00020R2\u0006\u0010n\u001a\u00020\u001eH\u0002J\b\u0010v\u001a\u00020RH\u0016J\u0014\u0010w\u001a\u00020R2\f\u0010x\u001a\b\u0012\u0004\u0012\u00020z0yJ\u000e\u0010{\u001a\u00020R2\u0006\u0010S\u001a\u00020\u001eJ\u0019\u0010|\u001a\u00020R2\f\u0010}\u001a\b\u0012\u0004\u0012\u00020\u001e0~¢\u0006\u0002\u0010J\u0018\u0010\u0001\u001a\u00020R2\u0006\u0010S\u001a\u00020\u001e2\u0007\u0010\u0001\u001a\u00020FJ\u000f\u0010\u0001\u001a\u00020R2\u0006\u0010S\u001a\u00020\u001eJ\u001a\u0010\u0001\u001a\u00020R2\f\u0010}\u001a\b\u0012\u0004\u0012\u00020\u001e0~¢\u0006\u0002\u0010J\u0007\u0010\u0001\u001a\u00020RJ\u0011\u0010\u0001\u001a\u00020R2\b\u0010\u0001\u001a\u00030\u0001J\u0019\u0010\u0001\u001a\u00020R2\u0007\u0010\u0001\u001a\u00020F2\u0007\u0010\u0001\u001a\u00020FJ\u0019\u0010\u0001\u001a\u00020R2\u0007\u0010\u0001\u001a\u00020\b2\u0007\u0010\u0001\u001a\u00020\bJ\u000f\u0010\u0018\u001a\u00020R2\u0007\u0010\u0001\u001a\u00020\u001bJ\u0011\u0010\u0001\u001a\u00020R2\b\b\u0001\u0010\u0007\u001a\u00020\bJ\u0012\u0010\u0001\u001a\u00020R2\t\u0010\u0001\u001a\u0004\u0018\u000107J\u0018\u0010\u0001\u001a\u00020R2\u0006\u0010S\u001a\u00020\u001e2\u0007\u0010\u0001\u001a\u00020\u001fJ\u0011\u0010\u0001\u001a\u00020R2\u0006\u0010\\\u001a\u00020]H&J\u0011\u0010\u0001\u001a\u00020R2\u0006\u0010h\u001a\u00020iH&J\u0007\u0010\u0001\u001a\u00020RJ#\u0010\u0001\u001a\u00020R2\u0006\u0010S\u001a\u00020\u001e2\u0007\u0010\u0001\u001a\u00020\u001f2\t\b\u0002\u0010\u0001\u001a\u00020FJ\u001c\u0010\u0001\u001a\u00020R2\u0006\u0010\\\u001a\u00020]2\t\b\u0002\u0010\u0001\u001a\u00020FH&J\u0019\u0010\u0001\u001a\u00020R2\u0007\u0010\u0001\u001a\u00020F2\u0007\u0010\u0001\u001a\u00020\bJ\u001a\u0010\u0001\u001a\u00020R2\u0006\u0010h\u001a\u00020i2\u0007\u0010\u0001\u001a\u00020FH&J\u0018\u0010\u0001\u001a\u00020R2\u0006\u0010S\u001a\u00020\u001e2\u0007\u0010\u0001\u001a\u00020\u001fR\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0007\u001a\u00020\bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR$\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u000e@FX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u0015X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u0010\u0010\u001a\u001a\u0004\u0018\u00010\u001bX\u000e¢\u0006\u0002\n\u0000R-\u0010\u001c\u001a\u001e\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u001f0\u001dj\u000e\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u001f` ¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u001a\u0010#\u001a\u00020$X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R$\u0010)\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u000e@FX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b*\u0010\u0011\"\u0004\b+\u0010\u0013R\u000e\u0010,\u001a\u00020-X\u0004¢\u0006\u0002\n\u0000R-\u0010.\u001a\u001e\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u001f0\u001dj\u000e\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u001f` ¢\u0006\b\n\u0000\u001a\u0004\b/\u0010\"R\u001a\u00100\u001a\u000201X.¢\u0006\u000e\n\u0000\u001a\u0004\b2\u00103\"\u0004\b4\u00105R\u0010\u00106\u001a\u0004\u0018\u000107X\u000e¢\u0006\u0002\n\u0000R\u0014\u00108\u001a\b\u0012\u0004\u0012\u00020\u001e09X\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b:\u0010;R\u001a\u0010<\u001a\u00020\bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b=\u0010\n\"\u0004\b>\u0010\fR\u001a\u0010?\u001a\u00020@X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bA\u0010B\"\u0004\bC\u0010DR\u001a\u0010E\u001a\u00020FX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bG\u0010H\"\u0004\bI\u0010JR-\u0010K\u001a\u001e\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u001f0\u001dj\u000e\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u001f` ¢\u0006\b\n\u0000\u001a\u0004\bL\u0010\"R\u000e\u0010M\u001a\u00020NX\u0004¢\u0006\u0002\n\u0000R-\u0010O\u001a\u001e\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u001f0\u001dj\u000e\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u001f` ¢\u0006\b\n\u0000\u001a\u0004\bP\u0010\"¨\u0006 \u0001"}, d2 = {"Lcom/ss/android/vc/meeting/module/sketch/SketchRenderModel;", "", "sketchControl", "Lcom/ss/android/vc/meeting/module/sketch/AbsSketchControl;", "(Lcom/ss/android/vc/meeting/module/sketch/AbsSketchControl;)V", "arrowAction", "Lcom/ss/android/vc/meeting/module/sketch/action/ArrowAction;", "color", "", "getColor", "()I", "setColor", "(I)V", "value", "Landroid/graphics/RectF;", "contentBoundary", "getContentBoundary", "()Landroid/graphics/RectF;", "setContentBoundary", "(Landroid/graphics/RectF;)V", "currentAction", "Lcom/ss/android/vc/meeting/module/sketch/action/ISketchAction;", "getCurrentAction", "()Lcom/ss/android/vc/meeting/module/sketch/action/ISketchAction;", "setCurrentAction", "(Lcom/ss/android/vc/meeting/module/sketch/action/ISketchAction;)V", "currentMode", "Lcom/ss/android/vc/meeting/module/sketch/action/SketchMode;", "dynamicData", "Ljava/util/LinkedHashMap;", "", "Lcom/ss/android/vc/meeting/module/sketch/render/AbstractShapeRender;", "Lkotlin/collections/LinkedHashMap;", "getDynamicData", "()Ljava/util/LinkedHashMap;", "eraseTimeOutShapesTask", "Ljava/lang/Runnable;", "getEraseTimeOutShapesTask", "()Ljava/lang/Runnable;", "setEraseTimeOutShapesTask", "(Ljava/lang/Runnable;)V", "originContentBoundary", "getOriginContentBoundary", "setOriginContentBoundary", "pencilAction", "Lcom/ss/android/vc/meeting/module/sketch/action/PencilAction;", "pendingStaticData", "getPendingStaticData", "remoteReceiver", "Lcom/ss/android/vc/meeting/module/sketch/SketchRemoteReceiver;", "getRemoteReceiver", "()Lcom/ss/android/vc/meeting/module/sketch/SketchRemoteReceiver;", "setRemoteReceiver", "(Lcom/ss/android/vc/meeting/module/sketch/SketchRemoteReceiver;)V", "selfShapeCountListener", "Lcom/ss/android/vc/meeting/module/sketch/SketchRenderModel$OnSelfShapeCountListener;", "selfShapes", "Ljava/util/concurrent/ConcurrentSkipListSet;", "getSketchControl", "()Lcom/ss/android/vc/meeting/module/sketch/AbsSketchControl;", "sketchHashCode", "getSketchHashCode", "setSketchHashCode", "sketchRange", "Lcom/ss/android/vc/entity/sketch/SketchRange;", "getSketchRange", "()Lcom/ss/android/vc/entity/sketch/SketchRange;", "setSketchRange", "(Lcom/ss/android/vc/entity/sketch/SketchRange;)V", "staticChanged", "", "getStaticChanged", "()Z", "setStaticChanged", "(Z)V", "staticData", "getStaticData", "usernameStore", "Lcom/ss/android/vc/meeting/module/sketch/utils/UsernameStore;", "variateData", "getVariateData", "addMark", "", "key", "mark", "Lcom/ss/android/vc/meeting/module/sketch/render/IMarkRender;", "addRemotePencilsProxyRender", "clearCurrentAction", "clearDynamics", "clearStatic", "clearVariates", "createArrowRender", "arrowDrawableData", "Lcom/ss/android/vc/meeting/module/sketch/dto/arrow/ArrowDrawableData;", "createCometRender", "cometDrawableData", "Lcom/ss/android/vc/meeting/module/sketch/dto/comet/CometDrawableData;", "createMarkRender", "markerDrawableData", "Lcom/ss/android/vc/meeting/module/sketch/dto/MarkerDrawableData;", "createOvalRender", "ovalDrawableData", "Lcom/ss/android/vc/meeting/module/sketch/dto/oval/OvalDrawableData;", "createPencilRender", "pencilDrawableData", "Lcom/ss/android/vc/meeting/module/sketch/dto/pencil/PencilDrawableData;", "createRectRender", "rectangleDrawableData", "Lcom/ss/android/vc/meeting/module/sketch/dto/rect/RectangleDrawableData;", "getUserNameById", "id", "userType", "invalidate", "isSelfShape", "onSelfShapeAdded", "onSelfShapeRemoved", "ids", "Ljava/util/Enumeration;", "onTransformed", "operate", "operations", "", "Lcom/ss/android/vc/entity/sketch/SketchOperationUnit;", "removeDynamic", "removeDynamics", "keys", "", "([Ljava/lang/String;)V", "removeStatic", "updateSelfShapes", "removeVariate", "removeVariates", "reset", "removeData", "Lcom/ss/android/vc/meeting/module/sketch/dto/RemoveData;", "clearDynamic", "clearSelfShape", "resetSketchRange", "w", C14002h.f36692e, "mode", "setCurrentColor", "setSelfShapeCountListener", "listener", "updateDynamic", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "updateDynamicArrow", "updateDynamicPencil", "updateSelfShapeCount", "updateStatic", "recordSelfShape", "updateStaticArrow", "self", "updateStaticChanged", "changed", "code", "updateStaticPencil", "updateVariate", "Companion", "OnSelfShapeCountListener", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
public abstract class SketchRenderModel {
    public static final Companion Companion = new Companion(null);
    private final ArrowAction arrowAction = new ArrowAction(this);
    private int color = C60773o.m236126d(R.color.ud_R500);
    private volatile RectF contentBoundary = new RectF();
    private ISketchAction currentAction;
    private SketchMode currentMode;
    private final LinkedHashMap<String, AbstractShapeRender> dynamicData = new LinkedHashMap<>();
    private Runnable eraseTimeOutShapesTask = new SketchRenderModel$eraseTimeOutShapesTask$1(this);
    private volatile RectF originContentBoundary = new RectF();
    private final PencilAction pencilAction = new PencilAction(this);
    private final LinkedHashMap<String, AbstractShapeRender> pendingStaticData = new LinkedHashMap<>();
    public SketchRemoteReceiver remoteReceiver;
    private OnSelfShapeCountListener selfShapeCountListener;
    private ConcurrentSkipListSet<String> selfShapes = new ConcurrentSkipListSet<>();
    private final AbsSketchControl sketchControl;
    private int sketchHashCode;
    private SketchRange sketchRange = new SketchRange(1920, 1080);
    private boolean staticChanged = true;
    private final LinkedHashMap<String, AbstractShapeRender> staticData = new LinkedHashMap<>();
    private final UsernameStore usernameStore = new UsernameStore();
    private final LinkedHashMap<String, AbstractShapeRender> variateData = new LinkedHashMap<>();

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, d2 = {"Lcom/ss/android/vc/meeting/module/sketch/SketchRenderModel$OnSelfShapeCountListener;", "", "onChanged", "", "count", "", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
    public interface OnSelfShapeCountListener {
        void onChanged(int i);
    }

    @Metadata(bv = {1, 0, 3}, mo238835k = 3, mv = {1, 1, 16})
    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[SketchMode.values().length];
            $EnumSwitchMapping$0 = iArr;
            iArr[SketchMode.PENCIL.ordinal()] = 1;
            iArr[SketchMode.HIGHLIGHT.ordinal()] = 2;
            iArr[SketchMode.ARROW.ordinal()] = 3;
        }
    }

    public abstract void addMark(String str, IMarkRender iMarkRender);

    public abstract void addRemotePencilsProxyRender();

    public abstract void clearCurrentAction();

    public abstract AbstractShapeRender createArrowRender(ArrowDrawableData arrowDrawableData);

    public abstract AbstractShapeRender createCometRender(CometDrawableData cometDrawableData);

    public abstract IMarkRender createMarkRender(MarkerDrawableData markerDrawableData);

    public abstract AbstractShapeRender createOvalRender(OvalDrawableData ovalDrawableData);

    public abstract AbstractShapeRender createPencilRender(PencilDrawableData pencilDrawableData);

    public abstract AbstractShapeRender createRectRender(RectangleDrawableData rectangleDrawableData);

    public abstract void invalidate();

    public void onTransformed() {
    }

    public abstract void updateDynamicArrow(ArrowDrawableData arrowDrawableData);

    public abstract void updateDynamicPencil(PencilDrawableData pencilDrawableData);

    public abstract void updateStaticArrow(ArrowDrawableData arrowDrawableData, boolean z);

    public abstract void updateStaticPencil(PencilDrawableData pencilDrawableData, boolean z);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ss/android/vc/meeting/module/sketch/SketchRenderModel$Companion;", "", "()V", "TAG", "", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final int getColor() {
        return this.color;
    }

    public final RectF getContentBoundary() {
        return this.contentBoundary;
    }

    public final ISketchAction getCurrentAction() {
        return this.currentAction;
    }

    public final LinkedHashMap<String, AbstractShapeRender> getDynamicData() {
        return this.dynamicData;
    }

    public final Runnable getEraseTimeOutShapesTask() {
        return this.eraseTimeOutShapesTask;
    }

    public final RectF getOriginContentBoundary() {
        return this.originContentBoundary;
    }

    public final LinkedHashMap<String, AbstractShapeRender> getPendingStaticData() {
        return this.pendingStaticData;
    }

    public final AbsSketchControl getSketchControl() {
        return this.sketchControl;
    }

    public final int getSketchHashCode() {
        return this.sketchHashCode;
    }

    public final SketchRange getSketchRange() {
        return this.sketchRange;
    }

    public final boolean getStaticChanged() {
        return this.staticChanged;
    }

    public final LinkedHashMap<String, AbstractShapeRender> getStaticData() {
        return this.staticData;
    }

    public final LinkedHashMap<String, AbstractShapeRender> getVariateData() {
        return this.variateData;
    }

    public final void reset() {
        reset(true, true);
    }

    private final void clearDynamics() {
        synchronized (this) {
            this.dynamicData.clear();
            Unit unit = Unit.INSTANCE;
        }
    }

    public final void clearVariates() {
        synchronized (this) {
            this.variateData.clear();
            Unit unit = Unit.INSTANCE;
        }
    }

    public final SketchRemoteReceiver getRemoteReceiver() {
        SketchRemoteReceiver sketchRemoteReceiver = this.remoteReceiver;
        if (sketchRemoteReceiver == null) {
            Intrinsics.throwUninitializedPropertyAccessException("remoteReceiver");
        }
        return sketchRemoteReceiver;
    }

    public final void updateSelfShapeCount() {
        OnSelfShapeCountListener onSelfShapeCountListener = this.selfShapeCountListener;
        if (onSelfShapeCountListener != null) {
            onSelfShapeCountListener.onChanged(this.selfShapes.size());
        }
    }

    private final void clearStatic() {
        synchronized (this) {
            this.staticData.clear();
            this.pendingStaticData.clear();
            this.staticChanged = true;
            Unit unit = Unit.INSTANCE;
        }
    }

    public final void setColor(int i) {
        this.color = i;
    }

    public final void setCurrentAction(ISketchAction iSketchAction) {
        this.currentAction = iSketchAction;
    }

    public final void setCurrentColor(int i) {
        this.color = i;
    }

    public final void setSelfShapeCountListener(OnSelfShapeCountListener onSelfShapeCountListener) {
        this.selfShapeCountListener = onSelfShapeCountListener;
    }

    public final void setSketchHashCode(int i) {
        this.sketchHashCode = i;
    }

    public final void setStaticChanged(boolean z) {
        this.staticChanged = z;
    }

    public final void setEraseTimeOutShapesTask(Runnable runnable) {
        Intrinsics.checkParameterIsNotNull(runnable, "<set-?>");
        this.eraseTimeOutShapesTask = runnable;
    }

    public final void setRemoteReceiver(SketchRemoteReceiver sketchRemoteReceiver) {
        Intrinsics.checkParameterIsNotNull(sketchRemoteReceiver, "<set-?>");
        this.remoteReceiver = sketchRemoteReceiver;
    }

    public final void setSketchRange(SketchRange aVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "<set-?>");
        this.sketchRange = aVar;
    }

    private final void onSelfShapeRemoved(String str) {
        this.selfShapes.remove(str);
        updateSelfShapeCount();
    }

    public final boolean isSelfShape(String str) {
        Intrinsics.checkParameterIsNotNull(str, "id");
        return this.selfShapes.contains(str);
    }

    public final void setContentBoundary(RectF rectF) {
        Intrinsics.checkParameterIsNotNull(rectF, "value");
        this.contentBoundary.set(rectF);
        onTransformed();
    }

    public final void setOriginContentBoundary(RectF rectF) {
        Intrinsics.checkParameterIsNotNull(rectF, "value");
        this.originContentBoundary = rectF;
        invalidate();
    }

    private final void onSelfShapeRemoved(Enumeration<String> enumeration) {
        ConcurrentSkipListSet<String> concurrentSkipListSet = this.selfShapes;
        ArrayList list = Collections.list(enumeration);
        Intrinsics.checkExpressionValueIsNotNull(list, "java.util.Collections.list(this)");
        concurrentSkipListSet.removeAll(list);
        updateSelfShapeCount();
    }

    public final void operate(List<? extends SketchOperationUnit> list) {
        Intrinsics.checkParameterIsNotNull(list, "operations");
        SketchRemoteReceiver sketchRemoteReceiver = this.remoteReceiver;
        if (sketchRemoteReceiver == null) {
            Intrinsics.throwUninitializedPropertyAccessException("remoteReceiver");
        }
        sketchRemoteReceiver.operate(list);
    }

    public final void removeDynamics(String[] strArr) {
        Intrinsics.checkParameterIsNotNull(strArr, "keys");
        for (String str : strArr) {
            removeDynamic(str);
        }
    }

    public final void removeVariates(String[] strArr) {
        Intrinsics.checkParameterIsNotNull(strArr, "keys");
        for (String str : strArr) {
            removeVariate(str);
        }
    }

    /* access modifiers changed from: protected */
    public final void onSelfShapeAdded(String str) {
        Intrinsics.checkParameterIsNotNull(str, "id");
        this.selfShapes.add(str);
        updateSelfShapeCount();
        if (this.sketchControl.getTransferInVideo()) {
            C60735ab.m236015d().removeCallbacks(this.eraseTimeOutShapesTask);
            this.sketchControl.addTimeOutShapes(str);
            C60735ab.m236015d().postDelayed(this.eraseTimeOutShapesTask, (long) SketchConfig.guest_local_shape_auto_disappear_time);
        }
    }

    public final void removeDynamic(String str) {
        Intrinsics.checkParameterIsNotNull(str, "key");
        C60700b.m235851b("[Sketch][SketchRenderModel]", "[removeDynamic]", "[id]" + str);
        synchronized (this) {
            this.dynamicData.remove(str);
        }
    }

    public SketchRenderModel(AbsSketchControl absSketchControl) {
        Intrinsics.checkParameterIsNotNull(absSketchControl, "sketchControl");
        this.sketchControl = absSketchControl;
    }

    public final void removeVariate(String str) {
        Intrinsics.checkParameterIsNotNull(str, "key");
        C60700b.m235851b("[Sketch][SketchRenderModel]", "[removeVariate]", "[id]" + str);
        synchronized (this) {
            this.variateData.remove(str);
            for (Map.Entry<String, AbstractShapeRender> entry : this.variateData.entrySet()) {
                AbstractShapeRender value = entry.getValue();
                if (value instanceof IRemotePencilsProxyRenderer) {
                    ((IRemotePencilsProxyRenderer) value).removePencil(str);
                }
            }
            Unit unit = Unit.INSTANCE;
        }
    }

    public final void setCurrentAction(SketchMode sketchMode) {
        Intrinsics.checkParameterIsNotNull(sketchMode, "mode");
        C60700b.m235851b("[Sketch][SketchRenderModel]", "[setCurrentAction]", "old mode = " + this.currentMode + ", new mode = " + sketchMode);
        int i = WhenMappings.$EnumSwitchMapping$0[sketchMode.ordinal()];
        if (i == 1) {
            this.pencilAction.setPencilType(PencilType.DEFAULT);
            if (!Intrinsics.areEqual(this.currentAction, this.pencilAction)) {
                PencilAction pencilAction2 = this.pencilAction;
                this.currentAction = pencilAction2;
                pencilAction2.onSelected(true, this.color);
            }
        } else if (i == 2) {
            this.pencilAction.setPencilType(PencilType.MARKER);
            if (!Intrinsics.areEqual(this.currentAction, this.pencilAction)) {
                PencilAction pencilAction3 = this.pencilAction;
                this.currentAction = pencilAction3;
                pencilAction3.onSelected(true, this.color);
            }
        } else if (i == 3) {
            this.currentAction = this.arrowAction;
            this.pencilAction.onSelected(false, this.color);
            this.arrowAction.onSelected(true, this.color);
        }
        this.currentMode = sketchMode;
    }

    /* JADX WARNING: Removed duplicated region for block: B:48:0x019f  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x01f2  */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x0177 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x01c8 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void reset(com.ss.android.vc.meeting.module.sketch.dto.RemoveData r8) {
        /*
        // Method dump skipped, instructions count: 554
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.vc.meeting.module.sketch.SketchRenderModel.reset(com.ss.android.vc.meeting.module.sketch.dto.RemoveData):void");
    }

    public final void resetSketchRange(int i, int i2) {
        this.sketchRange.mo210161a(i);
        this.sketchRange.mo210164b(i2);
    }

    public final String getUserNameById(String str, int i) {
        Intrinsics.checkParameterIsNotNull(str, "id");
        String usernameById = this.usernameStore.getUsernameById(str, i);
        Intrinsics.checkExpressionValueIsNotNull(usernameById, "usernameStore.getUsernameById(id, userType)");
        return usernameById;
    }

    public final void reset(boolean z, boolean z2) {
        C60700b.m235851b("[Sketch][SketchRenderModel]", "[reset]", "reset");
        clearStatic();
        if (z) {
            clearDynamics();
        }
        clearVariates();
        if (z2) {
            this.selfShapes.clear();
        }
        invalidate();
    }

    public final void updateDynamic(String str, AbstractShapeRender abstractShapeRender) {
        Intrinsics.checkParameterIsNotNull(str, "key");
        Intrinsics.checkParameterIsNotNull(abstractShapeRender, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
        synchronized (this) {
            this.dynamicData.put(str, abstractShapeRender);
            Unit unit = Unit.INSTANCE;
        }
        invalidate();
    }

    public final void updateStaticChanged(boolean z, int i) {
        if (this.sketchHashCode == i) {
            this.staticChanged = z;
        } else {
            C60700b.m235864f("[Sketch][SketchRenderModel]", "[updateStaticChanged]", "Hashcode is different");
        }
    }

    public final void updateVariate(String str, AbstractShapeRender abstractShapeRender) {
        Intrinsics.checkParameterIsNotNull(str, "key");
        Intrinsics.checkParameterIsNotNull(abstractShapeRender, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
        synchronized (this) {
            this.variateData.put(str, abstractShapeRender);
            Unit unit = Unit.INSTANCE;
        }
    }

    public final void removeStatic(String str, boolean z) {
        Intrinsics.checkParameterIsNotNull(str, "key");
        C60700b.m235851b("[Sketch][SketchRenderModel]", "[removeStatic]", "[id]" + str + "  [updateSelfShapes]" + z);
        synchronized (this) {
            if (this.staticData.remove(str) != null) {
                this.staticChanged = true;
                Unit unit = Unit.INSTANCE;
            } else {
                this.pendingStaticData.remove(str);
            }
        }
        invalidate();
        if (z) {
            onSelfShapeRemoved(str);
        }
    }

    public final void updateStatic(String str, AbstractShapeRender abstractShapeRender, boolean z) {
        Intrinsics.checkParameterIsNotNull(str, "key");
        Intrinsics.checkParameterIsNotNull(abstractShapeRender, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
        synchronized (this) {
            if (this.staticData.containsKey(str)) {
                this.staticData.put(str, abstractShapeRender);
                this.staticChanged = true;
            } else {
                this.pendingStaticData.put(str, abstractShapeRender);
            }
            Unit unit = Unit.INSTANCE;
        }
        invalidate();
        if (z) {
            onSelfShapeAdded(str);
        }
    }

    public static /* synthetic */ void updateStaticArrow$default(SketchRenderModel sketchRenderModel, ArrowDrawableData arrowDrawableData, boolean z, int i, Object obj) {
        if (obj == null) {
            if ((i & 2) != 0) {
                z = false;
            }
            sketchRenderModel.updateStaticArrow(arrowDrawableData, z);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: updateStaticArrow");
    }

    public static /* synthetic */ void updateStatic$default(SketchRenderModel sketchRenderModel, String str, AbstractShapeRender abstractShapeRender, boolean z, int i, Object obj) {
        if (obj == null) {
            if ((i & 4) != 0) {
                z = false;
            }
            sketchRenderModel.updateStatic(str, abstractShapeRender, z);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: updateStatic");
    }
}
