package com.larksuite.component.ui.imageview;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.suite.R;
import java.lang.ref.WeakReference;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u000e\u0018\u0000 G2\u00020\u00012\u00020\u0002:\u0004GHIJB\u000f\b\u0012\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005B\u0005¢\u0006\u0002\u0010\u0006J\u0012\u0010!\u001a\u00020\"2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004H\u0002J\u0010\u0010#\u001a\u00020\"2\u0006\u0010$\u001a\u00020%H\u0016J\u0010\u0010&\u001a\u00020\"2\u0006\u0010$\u001a\u00020%H\u0002J\b\u0010'\u001a\u00020(H\u0016J\b\u0010)\u001a\u00020(H\u0016J\b\u0010*\u001a\u00020(H\u0016J\b\u0010\u0017\u001a\u00020\u0018H\u0002J\u0006\u0010+\u001a\u00020,J\u0006\u0010-\u001a\u00020.JR\u0010/\u001a\u00020\"2\b\u00100\u001a\u0004\u0018\u00010\u00042\u0006\u00101\u001a\u00020(2\u0006\u00102\u001a\u00020(2\u0006\u00103\u001a\u00020(2\u0006\u00104\u001a\u00020(2\u0006\u00105\u001a\u00020(2\u0006\u00106\u001a\u00020(2\u0006\u00107\u001a\u00020(2\u0006\u00108\u001a\u00020(H\u0016J\u0010\u00109\u001a\u00020\"2\u0006\u0010:\u001a\u00020(H\u0016J\u0012\u0010;\u001a\u00020\"2\b\u0010<\u001a\u0004\u0018\u00010=H\u0016J\u0014\u0010>\u001a\u00020\"2\n\u0010?\u001a\u00060\u0013R\u00020\u0000H\u0002J0\u0010@\u001a\u00020\"2\u0006\u0010A\u001a\u00020\n2\u0006\u0010B\u001a\u00020\u00102\u0006\u0010C\u001a\u00020\u00102\u0006\u0010D\u001a\u00020\u00102\u0006\u0010E\u001a\u00020\u0010H\u0002J\b\u0010F\u001a\u00020\"H\u0002R\u0016\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\bX\u000e¢\u0006\u0002\n\u0000R\u001b\u0010\t\u001a\u00020\n8BX\u0002¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000b\u0010\fR\u000e\u0010\u000f\u001a\u00020\u0010X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0010X\u000e¢\u0006\u0002\n\u0000R\u001f\u0010\u0012\u001a\u00060\u0013R\u00020\u00008BX\u0002¢\u0006\f\n\u0004\b\u0016\u0010\u000e\u001a\u0004\b\u0014\u0010\u0015R\u000e\u0010\u0017\u001a\u00020\u0018X\u000e¢\u0006\u0002\n\u0000R\u001b\u0010\u0019\u001a\u00020\u001a8BX\u0002¢\u0006\f\n\u0004\b\u001d\u0010\u000e\u001a\u0004\b\u001b\u0010\u001cR\u001f\u0010\u001e\u001a\u00060\u0013R\u00020\u00008BX\u0002¢\u0006\f\n\u0004\b \u0010\u000e\u001a\u0004\b\u001f\u0010\u0015¨\u0006K"}, d2 = {"Lcom/larksuite/component/ui/imageview/LKUIBadgeDrawable2;", "Landroid/graphics/drawable/Drawable;", "Landroid/view/View$OnLayoutChangeListener;", "view", "Landroid/view/View;", "(Landroid/view/View;)V", "()V", "anchorViewRef", "Ljava/lang/ref/WeakReference;", "badgeBounds", "Landroid/graphics/Rect;", "getBadgeBounds", "()Landroid/graphics/Rect;", "badgeBounds$delegate", "Lkotlin/Lazy;", "badgeCenterX", "", "badgeCenterY", "currentModel", "Lcom/larksuite/component/ui/imageview/LKUIBadgeDrawable2$Model;", "getCurrentModel", "()Lcom/larksuite/component/ui/imageview/LKUIBadgeDrawable2$Model;", "currentModel$delegate", "isAttached", "", "textDrawableHelper", "Lcom/larksuite/component/ui/imageview/TextDrawableHelper;", "getTextDrawableHelper", "()Lcom/larksuite/component/ui/imageview/TextDrawableHelper;", "textDrawableHelper$delegate", "updateModel", "getUpdateModel", "updateModel$delegate", "attachTo", "", "draw", "canvas", "Landroid/graphics/Canvas;", "drawText", "getIntrinsicHeight", "", "getIntrinsicWidth", "getOpacity", "newEdit", "Lcom/larksuite/component/ui/imageview/LKUIBadgeDrawable2$Editor;", "newIconEdit", "Lcom/larksuite/component/ui/imageview/LKUIBadgeDrawable2$IconEditor;", "onLayoutChange", "v", "left", "top", "right", "bottom", "oldLeft", "oldTop", "oldRight", "oldBottom", "setAlpha", "alpha", "setColorFilter", "colorFilter", "Landroid/graphics/ColorFilter;", "setMode", "newModel", "updateBadgeBounds", "rect", "centerX", "centerY", "badgeHalfWidth", "badgeHalfHeight", "updateCenterAndBounds", "Companion", "Editor", "IconEditor", "Model", "suite-ui_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.larksuite.component.ui.imageview.a */
public final class LKUIBadgeDrawable2 extends Drawable implements View.OnLayoutChangeListener {

    /* renamed from: a */
    public static final Companion f62638a = new Companion(null);

    /* renamed from: b */
    private final Lazy f62639b;

    /* renamed from: c */
    private float f62640c;

    /* renamed from: d */
    private float f62641d;

    /* renamed from: e */
    private final Lazy f62642e;

    /* renamed from: f */
    private final Lazy f62643f;

    /* renamed from: g */
    private WeakReference<View> f62644g;

    /* renamed from: h */
    private final Lazy f62645h;

    /* renamed from: i */
    private boolean f62646i;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0003H&J\u0012\u0010\u0004\u001a\u00020\u00002\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H&J\b\u0010\u0006\u001a\u00020\u0007H&J\u0010\u0010\b\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u0003H&J\u0012\u0010\t\u001a\u00020\u00002\b\u0010\t\u001a\u0004\u0018\u00010\u0005H&J\u0010\u0010\n\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u000bH&J\u0012\u0010\f\u001a\u00020\u00002\b\u0010\f\u001a\u0004\u0018\u00010\rH&J\u0010\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\u0003H&J\u0010\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000bH&J\u0010\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000bH&J\u0010\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u000bH&J\u0010\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u0013H&¨\u0006\u0014"}, d2 = {"Lcom/larksuite/component/ui/imageview/LKUIBadgeDrawable2$Editor;", "", "alignType", "", "background", "Landroid/graphics/drawable/Drawable;", "commit", "Lcom/larksuite/component/ui/imageview/LKUIBadgeDrawable2;", "gravity", "icon", "offset", "", "text", "", "textColor", "textHeightPadding", "textSize", "textWidthPadding", "visiable", "", "suite-ui_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.larksuite.component.ui.imageview.a$b */
    public interface Editor {
        /* renamed from: a */
        Editor mo89366a(float f);

        /* renamed from: a */
        Editor mo89367a(int i);

        /* renamed from: a */
        Editor mo89368a(Drawable drawable);

        /* renamed from: a */
        Editor mo89369a(String str);

        /* renamed from: a */
        Editor mo89370a(boolean z);

        /* renamed from: a */
        LKUIBadgeDrawable2 mo89371a();

        /* renamed from: b */
        Editor mo89372b(float f);

        /* renamed from: b */
        Editor mo89373b(int i);

        /* renamed from: b */
        Editor mo89374b(Drawable drawable);

        /* renamed from: c */
        Editor mo89375c(float f);

        /* renamed from: c */
        Editor mo89376c(int i);

        /* renamed from: d */
        Editor mo89377d(float f);
    }

    /* renamed from: b */
    private final Rect m91917b() {
        return (Rect) this.f62639b.getValue();
    }

    /* renamed from: c */
    private final Model m91918c() {
        return (Model) this.f62642e.getValue();
    }

    /* renamed from: d */
    private final Model m91919d() {
        return (Model) this.f62643f.getValue();
    }

    /* renamed from: e */
    private final TextDrawableHelper m91920e() {
        return (TextDrawableHelper) this.f62645h.getValue();
    }

    public int getOpacity() {
        return -3;
    }

    public void setAlpha(int i) {
    }

    public void setColorFilter(ColorFilter colorFilter) {
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0007J\u0018\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u0004H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/larksuite/component/ui/imageview/LKUIBadgeDrawable2$Companion;", "", "()V", "ALIGN_CORNER", "", "ALIGN_CORNER_CENTER", "ALIGN_ROUND_CENTER", "GRAVITY_BOTTOM_RIGHT", "GRAVITY_TOP_RIGHT", "obtain", "Lcom/larksuite/component/ui/imageview/LKUIBadgeDrawable2;", "view", "Landroid/view/View;", "index", "suite-ui_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.larksuite.component.ui.imageview.a$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        /* renamed from: a */
        public final LKUIBadgeDrawable2 mo89364a(View view) {
            Intrinsics.checkParameterIsNotNull(view, "view");
            return mo89365a(view, 0);
        }

        @JvmStatic
        /* renamed from: a */
        public final LKUIBadgeDrawable2 mo89365a(View view, int i) {
            Intrinsics.checkParameterIsNotNull(view, "view");
            if (i < 0 || 1 < i) {
                throw new IndexOutOfBoundsException("only support 2 badge");
            }
            Object tag = view.getTag(R.id.lkui_tag_key_view_badge_drawable);
            if (tag == null || !(tag instanceof Object[])) {
                tag = new LKUIBadgeDrawable2[2];
            }
            LKUIBadgeDrawable2[] aVarArr = (LKUIBadgeDrawable2[]) tag;
            if (aVarArr[i] == null) {
                aVarArr[i] = new LKUIBadgeDrawable2(view, null);
            }
            view.setTag(R.id.lkui_tag_key_view_badge_drawable, aVarArr);
            LKUIBadgeDrawable2 aVar = aVarArr[i];
            if (aVar == null) {
                Intrinsics.throwNpe();
            }
            return aVar;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0012\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0014\u0010\u0006\u001a\u00060\u0000R\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0016\u0010\f\u001a\u00060\u0000R\u00020\u00042\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0016J\b\u00102\u001a\u00020\u0004H\u0016J\u0012\u00103\u001a\u0002042\n\u00105\u001a\u00060\u0000R\u00020\u0004J\u0013\u00106\u001a\u0002072\b\u00108\u001a\u0004\u0018\u000109H\u0002J\u0014\u0010\u0014\u001a\u00060\u0000R\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u0007H\u0016J\u0006\u0010:\u001a\u000207J\b\u0010;\u001a\u00020\u0007H\u0016J\u0016\u0010\u0017\u001a\u00060\u0000R\u00020\u00042\b\u0010\u0017\u001a\u0004\u0018\u00010\rH\u0016J\u0014\u0010\u001a\u001a\u00060\u0000R\u00020\u00042\u0006\u0010\u001a\u001a\u00020\u001bH\u0016J\u0006\u0010<\u001a\u000204J\u0016\u0010 \u001a\u00060\u0000R\u00020\u00042\b\u0010 \u001a\u0004\u0018\u00010!H\u0016J\u0014\u0010&\u001a\u00060\u0000R\u00020\u00042\u0006\u0010&\u001a\u00020\u0007H\u0016J\u0014\u0010)\u001a\u00060\u0000R\u00020\u00042\u0006\u0010)\u001a\u00020\u001bH\u0016J\u0014\u0010,\u001a\u00060\u0000R\u00020\u00042\u0006\u0010,\u001a\u00020\u001bH\u0016J\u0014\u0010/\u001a\u00060\u0000R\u00020\u00042\u0006\u0010/\u001a\u00020\u001bH\u0016J\u0014\u0010=\u001a\u00060\u0000R\u00020\u00042\u0006\u0010=\u001a\u000207H\u0016R\u001a\u0010\u0006\u001a\u00020\u0007X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001c\u0010\f\u001a\u0004\u0018\u00010\rX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0014\u001a\u00020\u0007X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\t\"\u0004\b\u0016\u0010\u000bR\u001c\u0010\u0017\u001a\u0004\u0018\u00010\rX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u000f\"\u0004\b\u0019\u0010\u0011R\u001a\u0010\u001a\u001a\u00020\u001bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u001c\u0010 \u001a\u0004\u0018\u00010!X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\u001a\u0010&\u001a\u00020\u0007X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b'\u0010\t\"\u0004\b(\u0010\u000bR\u001a\u0010)\u001a\u00020\u001bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b*\u0010\u001d\"\u0004\b+\u0010\u001fR\u001a\u0010,\u001a\u00020\u001bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b-\u0010\u001d\"\u0004\b.\u0010\u001fR\u001a\u0010/\u001a\u00020\u001bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b0\u0010\u001d\"\u0004\b1\u0010\u001f¨\u0006>"}, d2 = {"Lcom/larksuite/component/ui/imageview/LKUIBadgeDrawable2$Model;", "Lcom/larksuite/component/ui/imageview/LKUIBadgeDrawable2$Editor;", "Lcom/larksuite/component/ui/imageview/LKUIBadgeDrawable2$IconEditor;", "drawable", "Lcom/larksuite/component/ui/imageview/LKUIBadgeDrawable2;", "(Lcom/larksuite/component/ui/imageview/LKUIBadgeDrawable2;Lcom/larksuite/component/ui/imageview/LKUIBadgeDrawable2;)V", "alignType", "", "getAlignType", "()I", "setAlignType", "(I)V", "background", "Landroid/graphics/drawable/Drawable;", "getBackground", "()Landroid/graphics/drawable/Drawable;", "setBackground", "(Landroid/graphics/drawable/Drawable;)V", "getDrawable", "()Lcom/larksuite/component/ui/imageview/LKUIBadgeDrawable2;", "gravity", "getGravity", "setGravity", "icon", "getIcon", "setIcon", "offset", "", "getOffset", "()F", "setOffset", "(F)V", "text", "", "getText", "()Ljava/lang/String;", "setText", "(Ljava/lang/String;)V", "textColor", "getTextColor", "setTextColor", "textHeightPadding", "getTextHeightPadding", "setTextHeightPadding", "textSize", "getTextSize", "setTextSize", "textWidthPadding", "getTextWidthPadding", "setTextWidthPadding", "commit", "copy", "", "model", "equals", "", "other", "", "hasText", "hashCode", "reset", "visiable", "suite-ui_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.larksuite.component.ui.imageview.a$c */
    public final class Model implements Editor {

        /* renamed from: a */
        final /* synthetic */ LKUIBadgeDrawable2 f62647a;

        /* renamed from: b */
        private String f62648b;

        /* renamed from: c */
        private float f62649c = 10.0f;

        /* renamed from: d */
        private float f62650d = 15.0f;

        /* renamed from: e */
        private float f62651e = 10.0f;

        /* renamed from: f */
        private int f62652f = -1;

        /* renamed from: g */
        private Drawable f62653g;

        /* renamed from: h */
        private float f62654h;

        /* renamed from: i */
        private Drawable f62655i;

        /* renamed from: j */
        private int f62656j = 1;

        /* renamed from: k */
        private int f62657k = 3;

        /* renamed from: l */
        private final LKUIBadgeDrawable2 f62658l;

        /* renamed from: b */
        public final String mo89381b() {
            return this.f62648b;
        }

        /* renamed from: c */
        public final float mo89382c() {
            return this.f62649c;
        }

        /* renamed from: d */
        public final float mo89384d() {
            return this.f62650d;
        }

        /* renamed from: e */
        public final float mo89387e() {
            return this.f62651e;
        }

        /* renamed from: f */
        public final int mo89391f() {
            return this.f62652f;
        }

        /* renamed from: g */
        public final Drawable mo89394g() {
            return this.f62653g;
        }

        /* renamed from: h */
        public final Drawable mo89396h() {
            return this.f62655i;
        }

        /* renamed from: i */
        public final int mo89399i() {
            return this.f62656j;
        }

        /* renamed from: j */
        public final int mo89400j() {
            return this.f62657k;
        }

        /* renamed from: k */
        public final boolean mo89401k() {
            boolean z;
            String str = this.f62648b;
            if (str == null || str.length() == 0) {
                z = true;
            } else {
                z = false;
            }
            return !z;
        }

        /* renamed from: l */
        public final void mo89402l() {
            this.f62648b = null;
            this.f62649c = 10.0f;
            this.f62650d = 15.0f;
            this.f62651e = 10.0f;
            this.f62654h = BitmapDescriptorFactory.HUE_RED;
            this.f62652f = -1;
            Drawable drawable = null;
            this.f62653g = drawable;
            this.f62655i = drawable;
            this.f62656j = 1;
            this.f62657k = 3;
        }

        public int hashCode() {
            int i;
            int i2;
            int hashCode = this.f62658l.hashCode() * 31;
            String str = this.f62648b;
            int i3 = 0;
            if (str != null) {
                i = str.hashCode();
            } else {
                i = 0;
            }
            int hashCode2 = (((((((((hashCode + i) * 31) + Float.valueOf(this.f62649c).hashCode()) * 31) + Float.valueOf(this.f62650d).hashCode()) * 31) + Float.valueOf(this.f62651e).hashCode()) * 31) + this.f62652f) * 31;
            Drawable drawable = this.f62653g;
            if (drawable != null) {
                i2 = drawable.hashCode();
            } else {
                i2 = 0;
            }
            int hashCode3 = (((hashCode2 + i2) * 31) + Float.valueOf(this.f62654h).hashCode()) * 31;
            Drawable drawable2 = this.f62655i;
            if (drawable2 != null) {
                i3 = drawable2.hashCode();
            }
            return ((((hashCode3 + i3) * 31) + this.f62656j) * 31) + this.f62657k;
        }

        @Override // com.larksuite.component.ui.imageview.LKUIBadgeDrawable2.Editor
        /* renamed from: a */
        public LKUIBadgeDrawable2 mo89371a() {
            this.f62658l.mo89356a(this);
            return this.f62658l;
        }

        /* renamed from: e */
        public Model mo89366a(float f) {
            Model cVar = this;
            cVar.f62649c = f;
            return cVar;
        }

        /* renamed from: f */
        public Model mo89372b(float f) {
            Model cVar = this;
            cVar.f62650d = f;
            return cVar;
        }

        /* renamed from: g */
        public Model mo89375c(float f) {
            Model cVar = this;
            cVar.f62651e = f;
            return cVar;
        }

        /* renamed from: h */
        public Model mo89377d(float f) {
            Model cVar = this;
            cVar.f62654h = f;
            return cVar;
        }

        /* renamed from: d */
        public Model mo89367a(int i) {
            Model cVar = this;
            cVar.f62652f = i;
            return cVar;
        }

        /* renamed from: e */
        public Model mo89373b(int i) {
            Model cVar = this;
            cVar.f62656j = i;
            return cVar;
        }

        /* renamed from: f */
        public Model mo89376c(int i) {
            Model cVar = this;
            cVar.f62657k = i;
            return cVar;
        }

        /* renamed from: c */
        public Model mo89368a(Drawable drawable) {
            Model cVar = this;
            cVar.f62653g = drawable;
            return cVar;
        }

        /* renamed from: d */
        public Model mo89374b(Drawable drawable) {
            Model cVar = this;
            cVar.f62655i = drawable;
            return cVar;
        }

        /* renamed from: b */
        public Model mo89369a(String str) {
            Model cVar = this;
            cVar.f62648b = str;
            return cVar;
        }

        /* renamed from: b */
        public Model mo89370a(boolean z) {
            Model cVar = this;
            this.f62647a.setVisible(z, false);
            return cVar;
        }

        public boolean equals(Object obj) {
            Class<?> cls;
            if (this == obj) {
                return true;
            }
            Class<?> cls2 = getClass();
            if (obj != null) {
                cls = obj.getClass();
            } else {
                cls = null;
            }
            if (!Intrinsics.areEqual(cls2, cls)) {
                return false;
            }
            if (obj != null) {
                Model cVar = (Model) obj;
                if (!(!Intrinsics.areEqual(this.f62658l, cVar.f62658l)) && !(!Intrinsics.areEqual(this.f62648b, cVar.f62648b)) && this.f62649c == cVar.f62649c && this.f62650d == cVar.f62650d && this.f62651e == cVar.f62651e && this.f62652f == cVar.f62652f && !(!Intrinsics.areEqual(this.f62653g, cVar.f62653g)) && this.f62654h == cVar.f62654h && !(!Intrinsics.areEqual(this.f62655i, cVar.f62655i)) && this.f62656j == cVar.f62656j && this.f62657k == cVar.f62657k) {
                    return true;
                }
                return false;
            }
            throw new TypeCastException("null cannot be cast to non-null type com.larksuite.component.ui.imageview.LKUIBadgeDrawable2.Model");
        }

        /* renamed from: a */
        public final void mo89378a(Model cVar) {
            Intrinsics.checkParameterIsNotNull(cVar, "model");
            this.f62648b = cVar.f62648b;
            this.f62649c = cVar.f62649c;
            this.f62652f = cVar.f62652f;
            this.f62650d = cVar.f62650d;
            this.f62651e = cVar.f62651e;
            this.f62654h = cVar.f62654h;
            this.f62653g = cVar.f62653g;
            this.f62655i = cVar.f62655i;
            this.f62656j = cVar.f62656j;
            this.f62657k = cVar.f62657k;
        }

        public Model(LKUIBadgeDrawable2 aVar, LKUIBadgeDrawable2 aVar2) {
            Intrinsics.checkParameterIsNotNull(aVar2, "drawable");
            this.f62647a = aVar;
            this.f62658l = aVar2;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroid/graphics/Rect;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.larksuite.component.ui.imageview.a$d */
    static final class C25660d extends Lambda implements Function0<Rect> {
        public static final C25660d INSTANCE = new C25660d();

        C25660d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Rect invoke() {
            return new Rect();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00060\u0001R\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lcom/larksuite/component/ui/imageview/LKUIBadgeDrawable2$Model;", "Lcom/larksuite/component/ui/imageview/LKUIBadgeDrawable2;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.larksuite.component.ui.imageview.a$e */
    static final class C25661e extends Lambda implements Function0<Model> {
        final /* synthetic */ LKUIBadgeDrawable2 this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C25661e(LKUIBadgeDrawable2 aVar) {
            super(0);
            this.this$0 = aVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Model invoke() {
            LKUIBadgeDrawable2 aVar = this.this$0;
            return new Model(aVar, aVar);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/larksuite/component/ui/imageview/TextDrawableHelper;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.larksuite.component.ui.imageview.a$f */
    static final class C25662f extends Lambda implements Function0<TextDrawableHelper> {
        public static final C25662f INSTANCE = new C25662f();

        C25662f() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final TextDrawableHelper invoke() {
            return new TextDrawableHelper();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00060\u0001R\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lcom/larksuite/component/ui/imageview/LKUIBadgeDrawable2$Model;", "Lcom/larksuite/component/ui/imageview/LKUIBadgeDrawable2;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.larksuite.component.ui.imageview.a$g */
    static final class C25663g extends Lambda implements Function0<Model> {
        final /* synthetic */ LKUIBadgeDrawable2 this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C25663g(LKUIBadgeDrawable2 aVar) {
            super(0);
            this.this$0 = aVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Model invoke() {
            LKUIBadgeDrawable2 aVar = this.this$0;
            return new Model(aVar, aVar);
        }
    }

    public int getIntrinsicHeight() {
        return m91917b().height();
    }

    public int getIntrinsicWidth() {
        return m91917b().width();
    }

    /* renamed from: f */
    private final boolean m91921f() {
        View view;
        WeakReference<View> weakReference = this.f62644g;
        if (weakReference != null) {
            view = weakReference.get();
        } else {
            view = null;
        }
        if (view == null || !this.f62646i) {
            return false;
        }
        return true;
    }

    public LKUIBadgeDrawable2() {
        this.f62639b = LazyKt.lazy(C25660d.INSTANCE);
        this.f62642e = LazyKt.lazy(new C25661e(this));
        this.f62643f = LazyKt.lazy(new C25663g(this));
        this.f62645h = LazyKt.lazy(C25662f.INSTANCE);
    }

    /* renamed from: a */
    public final Editor mo89355a() {
        m91919d().mo89402l();
        return m91919d();
    }

    /* renamed from: g */
    private final void m91922g() {
        View view;
        float f;
        float f2;
        float f3;
        float f4;
        float f5;
        float f6;
        float f7;
        WeakReference<View> weakReference = this.f62644g;
        if (weakReference != null && (view = weakReference.get()) != null) {
            Rect rect = new Rect();
            view.getDrawingRect(rect);
            Intrinsics.checkExpressionValueIsNotNull(view, "it");
            ViewGroup viewGroup = (ViewGroup) view.getParent();
            if (viewGroup != null) {
                viewGroup.offsetDescendantRectToMyCoords(view, rect);
            }
            if (!rect.isEmpty()) {
                int paddingLeft = view.getPaddingLeft();
                int paddingTop = view.getPaddingTop();
                int paddingRight = view.getPaddingRight();
                int paddingBottom = view.getPaddingBottom();
                m91920e().mo89430a(m91918c().mo89381b());
                m91920e().mo89427a(m91918c().mo89382c());
                float a = m91920e().mo89426a();
                float b = m91920e().mo89431b();
                Drawable g = m91918c().mo89394g();
                float f8 = BitmapDescriptorFactory.HUE_RED;
                if (g != null) {
                    f = (float) g.getIntrinsicWidth();
                } else {
                    f = BitmapDescriptorFactory.HUE_RED;
                }
                Drawable g2 = m91918c().mo89394g();
                if (g2 != null) {
                    f2 = (float) g2.getIntrinsicHeight();
                } else {
                    f2 = BitmapDescriptorFactory.HUE_RED;
                }
                Drawable h = m91918c().mo89396h();
                if (h != null) {
                    f3 = (float) h.getIntrinsicWidth();
                } else {
                    f3 = BitmapDescriptorFactory.HUE_RED;
                }
                Drawable h2 = m91918c().mo89396h();
                if (h2 != null) {
                    f8 = (float) h2.getIntrinsicHeight();
                }
                if (a > ((float) 0)) {
                    float f9 = (float) 2;
                    f5 = Math.max(a + (m91918c().mo89384d() * f9), f3) / f9;
                    f4 = Math.max(b + (m91918c().mo89387e() * f9), f8) / f9;
                } else {
                    float f10 = (float) 2;
                    f5 = Math.max(f, f3) / f10;
                    f4 = Math.max(f2, f8) / f10;
                }
                this.f62640c = ((float) rect.right) - ((float) paddingRight);
                if (m91918c().mo89399i() != 1) {
                    f6 = ((float) rect.bottom) - ((float) paddingBottom);
                } else {
                    f6 = ((float) rect.top) + ((float) paddingTop);
                }
                this.f62641d = f6;
                if (m91918c().mo89400j() == 2) {
                    this.f62640c -= f5;
                    float f11 = this.f62641d;
                    if (m91918c().mo89399i() == 1) {
                        f7 = f4;
                    } else {
                        f7 = -f4;
                    }
                    this.f62641d = f11 + f7;
                } else if (m91918c().mo89400j() == 3) {
                    this.f62640c -= ((float) (((rect.width() - paddingLeft) - paddingRight) / 2)) * 0.2929f;
                    float height = ((float) (((rect.height() - paddingTop) - paddingBottom) / 2)) * 0.2929f;
                    float f12 = this.f62641d;
                    if (m91918c().mo89399i() != 1) {
                        height = -height;
                    }
                    this.f62641d = f12 + height;
                }
                Drawable h3 = m91918c().mo89396h();
                if (h3 != null) {
                    float f13 = this.f62640c;
                    float f14 = this.f62641d;
                    h3.setBounds((int) (f13 - f5), (int) (f14 - f4), (int) (f13 + f5), (int) (f14 + f4));
                }
                Drawable g3 = m91918c().mo89394g();
                if (g3 != null) {
                    float f15 = this.f62640c;
                    float f16 = (float) 2;
                    float f17 = f / f16;
                    float f18 = this.f62641d;
                    float f19 = f2 / f16;
                    g3.setBounds((int) (f15 - f17), (int) (f18 - f19), (int) (f15 + f17), (int) (f18 + f19));
                }
                m91915a(m91917b(), this.f62640c, this.f62641d, f5, f4);
                invalidateSelf();
            }
        }
    }

    private LKUIBadgeDrawable2(View view) {
        this();
        this.f62644g = new WeakReference<>(view);
    }

    /* renamed from: a */
    private final void m91916a(View view) {
        if (view != null) {
            LKUIBadgeDrawable2 aVar = this;
            view.getOverlay().remove(aVar);
            view.getOverlay().add(aVar);
            this.f62646i = true;
            m91922g();
            view.addOnLayoutChangeListener(this);
        }
    }

    /* renamed from: a */
    private final void m91914a(Canvas canvas) {
        m91920e().mo89428a(m91918c().mo89391f());
        m91920e().mo89429a(canvas, m91917b().centerX(), m91917b().centerY());
    }

    public void draw(Canvas canvas) {
        Intrinsics.checkParameterIsNotNull(canvas, "canvas");
        if (isVisible() && m91921f()) {
            Drawable h = m91918c().mo89396h();
            if (h != null) {
                h.draw(canvas);
            }
            Drawable g = m91918c().mo89394g();
            if (g != null) {
                g.draw(canvas);
            }
            if (m91918c().mo89401k()) {
                m91914a(canvas);
            }
        }
    }

    /* renamed from: a */
    public final void mo89356a(Model cVar) {
        ViewGroup viewGroup;
        WeakReference<View> weakReference = this.f62644g;
        if (weakReference != null) {
            viewGroup = weakReference.get();
        } else {
            viewGroup = null;
        }
        if ((!Intrinsics.areEqual(cVar, m91918c())) && viewGroup != null) {
            m91918c().mo89378a(cVar);
            if (!m91921f()) {
                ViewGroup viewGroup2 = (ViewGroup) viewGroup.getParent();
                if (viewGroup2 != null) {
                    viewGroup = viewGroup2;
                }
                m91916a(viewGroup);
                return;
            }
            m91922g();
        }
    }

    public /* synthetic */ LKUIBadgeDrawable2(View view, DefaultConstructorMarker defaultConstructorMarker) {
        this(view);
    }

    /* renamed from: a */
    private final void m91915a(Rect rect, float f, float f2, float f3, float f4) {
        rect.set((int) (f - f3), (int) (f2 - f4), (int) (f + f3), (int) (f2 + f4));
    }

    public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        m91922g();
    }
}
