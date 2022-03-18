package com.ss.android.photoeditor.ve.paint;

import android.content.Context;
import android.graphics.RectF;
import android.view.ViewConfiguration;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.ss.android.photoeditor.ve.base.VEBaseController;
import com.ss.android.photoeditor.ve.controller.IImageEditController;
import com.ss.android.photoeditor.ve.p3018e.C59902f;
import com.ss.android.ttve.utils.C60275a;
import com.ss.android.vesdk.VEImage;
import kotlin.Metadata;
import kotlin.collections.C69043h;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0013\n\u0002\b\b\b&\u0018\u0000 &2\u00020\u00012\u00020\u0002:\u0002&'B\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\b\u0010\u001c\u001a\u00020\u001dH\u0002J\u001a\u0010\u001e\u001a\u00020\t2\u0006\u0010\u0015\u001a\u00020\r2\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010 J\b\u0010!\u001a\u00020\u001dH\u0016J\u000e\u0010\"\u001a\u00020\u001d2\u0006\u0010#\u001a\u00020\rJ\b\u0010$\u001a\u00020\u001dH\u0016J\u0014\u0010%\u001a\u00020\u001d2\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010 H\u0004R\u0014\u0010\b\u001a\u00020\tX\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\f\u001a\u00020\rX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0012\u001a\u00020\rX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u000f\"\u0004\b\u0014\u0010\u0011R\u001a\u0010\u0015\u001a\u00020\rX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u000f\"\u0004\b\u0017\u0010\u0011R\u0014\u0010\u0018\u001a\u00020\u0019X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001b¨\u0006("}, d2 = {"Lcom/ss/android/photoeditor/ve/paint/PaintController;", "Lcom/ss/android/photoeditor/ve/base/VEBaseController;", "Lcom/ss/android/photoeditor/ve/controller/IImageEditController;", "context", "Landroid/content/Context;", "veImage", "Lcom/ss/android/vesdk/VEImage;", "(Landroid/content/Context;Lcom/ss/android/vesdk/VEImage;)V", "VEIMAGE_RESOURCE_PATH", "", "getVEIMAGE_RESOURCE_PATH", "()Ljava/lang/String;", "paintMaxSize", "", "getPaintMaxSize", "()F", "setPaintMaxSize", "(F)V", "paintMinSize", "getPaintMinSize", "setPaintMinSize", "paintSize", "getPaintSize", "setPaintSize", "touchSlop", "", "getTouchSlop", "()I", "endBrushSticker", "", "getBrushParams", "paintColor", "", "onTouchEnd", "setPaintSizeRadio", "paintSizeRadio", "toolbarHide", "updateBrushParams", "Companion", "OnPaintEventListener", "photoeditor_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.ss.android.photoeditor.ve.paint.a */
public abstract class PaintController extends VEBaseController implements IImageEditController {

    /* renamed from: b */
    public static final Companion f149212b = new Companion(null);

    /* renamed from: c */
    private final String f149213c;

    /* renamed from: d */
    private final int f149214d;

    /* renamed from: e */
    private float f149215e;

    /* renamed from: f */
    private float f149216f;

    /* renamed from: g */
    private float f149217g;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&¨\u0006\u0005"}, d2 = {"Lcom/ss/android/photoeditor/ve/paint/PaintController$OnPaintEventListener;", "", "onPaintMoveTouchDown", "", "onPaintMoveTouchUp", "photoeditor_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.ss.android.photoeditor.ve.paint.a$b */
    public interface OnPaintEventListener {
        /* renamed from: a */
        void mo203994a();

        /* renamed from: b */
        void mo203995b();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nXT¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\nXT¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rXT¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/ss/android/photoeditor/ve/paint/PaintController$Companion;", "", "()V", "BRUSH_PARAM_BASE_RESOLUTION", "", "BRUSH_PARAM_BRUSH_HARDNESS", "BRUSH_PARAM_COLOR", "BRUSH_PARAM_ROTATION_ANGLE", "BRUSH_PARAM_SIZE", "BRUSH_VALUE_BASE_RESOLUTION", "", "BRUSH_VALUE_BRUSH_HARDNESS", "BRUSH_VALUE_ROTATION_ANGLE", "", "photoeditor_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.ss.android.photoeditor.ve.paint.a$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: s */
    public final String mo203591s() {
        return this.f149213c;
    }

    /* access modifiers changed from: protected */
    /* renamed from: t */
    public final int mo203592t() {
        return this.f149214d;
    }

    /* access modifiers changed from: protected */
    /* renamed from: u */
    public float mo203731u() {
        return this.f149215e;
    }

    /* access modifiers changed from: protected */
    /* renamed from: v */
    public float mo203732v() {
        return this.f149216f;
    }

    /* access modifiers changed from: protected */
    /* renamed from: w */
    public float mo203993w() {
        return this.f149217g;
    }

    @Override // com.ss.android.photoeditor.ve.base.VEBaseController
    /* renamed from: m */
    public void mo203702m() {
        super.mo203702m();
        mo204014x();
    }

    /* renamed from: x */
    private final void mo204014x() {
        mo203707r().mo220804l();
        mo203707r().mo220803k();
    }

    @Override // com.ss.android.photoeditor.ve.base.VEBaseController
    /* renamed from: g */
    public void mo203696g() {
        super.mo203696g();
        m232497a(this, (double[]) null, 1, (Object) null);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo203991b(float f) {
        this.f149217g = f;
    }

    /* renamed from: c */
    public final void mo203992c(float f) {
        mo203991b(mo203731u() + (f * (mo203732v() - mo203731u())));
        m232497a(this, (double[]) null, 1, (Object) null);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo203990a(double[] dArr) {
        float f;
        float f2;
        float f3;
        Integer b;
        RectF f4 = mo203695f();
        if (f4 != null) {
            f = f4.width();
        } else {
            f = (float) mo203672a();
        }
        RectF b2 = mo203686b();
        if (b2 != null) {
            f2 = b2.width();
        } else {
            f2 = (float) mo203672a();
        }
        float max = Math.max(f, f2);
        int[] i = mo203707r().mo220801i();
        if (i == null || (b = C69043h.m265756b(i, 0)) == null) {
            f3 = max;
        } else {
            f3 = (float) b.intValue();
        }
        mo203707r().mo220794c(mo203989a(C60275a.m234185a(mo203706q(), mo203993w()) * (f3 / max), dArr));
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PaintController(Context context, VEImage vEImage) {
        super(context, vEImage);
        int i;
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(vEImage, "veImage");
        this.f149213c = C59902f.m232472a(context);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        if (viewConfiguration != null) {
            i = viewConfiguration.getScaledTouchSlop();
        } else {
            i = 3;
        }
        this.f149214d = i;
        this.f149215e = 6.0f;
        this.f149216f = 16.0f;
    }

    /* renamed from: a */
    public final String mo203989a(float f, double[] dArr) {
        JSONObject jSONObject = new JSONObject();
        if (dArr != null) {
            JSONArray jSONArray = new JSONArray();
            for (double d : dArr) {
                jSONArray.put(d);
            }
            jSONObject.put("brush_color", jSONArray);
        }
        jSONObject.put("brush_size", Float.valueOf(f)).put("base_resolution", 1).put("brush_hardness", 1).put("rotation_angle", Float.valueOf((float) BitmapDescriptorFactory.HUE_RED));
        String jSONObject2 = jSONObject.toString();
        Intrinsics.checkExpressionValueIsNotNull(jSONObject2, "jsonObject.toString()");
        return jSONObject2;
    }

    /* renamed from: a */
    public static /* synthetic */ void m232497a(PaintController aVar, double[] dArr, int i, Object obj) {
        if (obj == null) {
            if ((i & 1) != 0) {
                dArr = null;
            }
            aVar.mo203990a(dArr);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: updateBrushParams");
    }
}
