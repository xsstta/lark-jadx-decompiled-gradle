package com.larksuite.component.universe_design.badge;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.component.universe_design.badge.UDBadge;
import com.larksuite.component.universe_design.color.UDColorUtils;
import com.larksuite.component.universe_design.util.UDDimenUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import java.lang.ref.WeakReference;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0016\u0018\u0000 +2\u00020\u00012\u00020\u0002:\u0003+,-B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\bH\u0002J\u0010\u0010\u0012\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0014H\u0016J\u0006\u0010\u0015\u001a\u00020\u0016J\b\u0010\u0017\u001a\u00020\u0018H\u0016JR\u0010\u0019\u001a\u00020\u00102\b\u0010\u001a\u001a\u0004\u0018\u00010\b2\u0006\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u001c\u001a\u00020\u00182\u0006\u0010\u001d\u001a\u00020\u00182\u0006\u0010\u001e\u001a\u00020\u00182\u0006\u0010\u001f\u001a\u00020\u00182\u0006\u0010 \u001a\u00020\u00182\u0006\u0010!\u001a\u00020\u00182\u0006\u0010\"\u001a\u00020\u0018H\u0016J\u0010\u0010#\u001a\u00020\u00102\u0006\u0010$\u001a\u00020\u0018H\u0016J\u0012\u0010%\u001a\u00020\u00102\b\u0010&\u001a\u0004\u0018\u00010'H\u0016J\u000e\u0010(\u001a\u00020\u00102\u0006\u0010)\u001a\u00020\u000eJ\b\u0010*\u001a\u00020\u0010H\u0002R\u0016\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0004¢\u0006\u0002\n\u0000¨\u0006."}, d2 = {"Lcom/larksuite/component/universe_design/badge/UDBadgeDrawable;", "Landroid/graphics/drawable/Drawable;", "Landroid/view/View$OnLayoutChangeListener;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "anchorViewRef", "Ljava/lang/ref/WeakReference;", "Landroid/view/View;", "badge", "Lcom/larksuite/component/universe_design/badge/UDBadge;", "isAttached", "", "model", "Lcom/larksuite/component/universe_design/badge/UDBadgeDrawable$DrawableModel;", "attachTo", "", "anchorView", "draw", "canvas", "Landroid/graphics/Canvas;", "editor", "Lcom/larksuite/component/universe_design/badge/UDBadgeDrawable$DrawableEditor;", "getOpacity", "", "onLayoutChange", "v", "left", "top", "right", "bottom", "oldLeft", "oldTop", "oldRight", "oldBottom", "setAlpha", "alpha", "setColorFilter", "colorFilter", "Landroid/graphics/ColorFilter;", "setModel", "newModel", "updateLayout", "Companion", "DrawableEditor", "DrawableModel", "universe-ui-badge_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.larksuite.component.universe_design.badge.c */
public class UDBadgeDrawable extends Drawable implements View.OnLayoutChangeListener {

    /* renamed from: a */
    public static final Companion f63069a = new Companion(null);

    /* renamed from: b */
    private final DrawableModel f63070b = new DrawableModel(this);

    /* renamed from: c */
    private UDBadge f63071c = new UDBadge();

    /* renamed from: d */
    private WeakReference<View> f63072d;

    /* renamed from: e */
    private boolean f63073e;

    /* renamed from: f */
    private final Context f63074f;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\bf\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001J\u0010\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\bH&J\u0018\u0010\t\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000bH&J\u0010\u0010\r\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\u000eH&¨\u0006\u000f"}, d2 = {"Lcom/larksuite/component/universe_design/badge/UDBadgeDrawable$DrawableEditor;", "Lcom/larksuite/component/universe_design/badge/UDBadge$Editor;", "align", "Lcom/larksuite/component/universe_design/badge/UDBadgeAlign;", "commit", "Lcom/larksuite/component/universe_design/badge/UDBadgeDrawable;", "isAnchorViewCircle", "yes", "", "offset", "offsetX", "", "offsetY", "style", "", "universe-ui-badge_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.larksuite.component.universe_design.badge.c$b */
    public interface DrawableEditor extends UDBadge.Editor<DrawableEditor> {
        /* renamed from: a */
        DrawableEditor mo90272a(UDBadgeAlign uDBadgeAlign);

        /* renamed from: a */
        UDBadgeDrawable mo90273a();

        DrawableEditor a_(int i);
    }

    public int getOpacity() {
        return -3;
    }

    public void setAlpha(int i) {
    }

    public void setColorFilter(ColorFilter colorFilter) {
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bJ\u0016\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nR\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/larksuite/component/universe_design/badge/UDBadgeDrawable$Companion;", "", "()V", "DELTA_SCALE", "", "obtain", "Lcom/larksuite/component/universe_design/badge/UDBadgeDrawable;", "view", "Landroid/view/View;", "index", "", "universe-ui-badge_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.larksuite.component.universe_design.badge.c$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final UDBadgeDrawable mo90271a(View view, int i) {
            Intrinsics.checkParameterIsNotNull(view, "view");
            if (i < 0 || 1 < i) {
                throw new IndexOutOfBoundsException("only support 2 badge");
            }
            Object tag = view.getTag(R.id.ud_badge_drawable_tag);
            if (!(tag instanceof UDBadgeDrawable[])) {
                tag = null;
            }
            UDBadgeDrawable[] cVarArr = (UDBadgeDrawable[]) tag;
            if (cVarArr == null) {
                cVarArr = new UDBadgeDrawable[2];
                view.setTag(R.id.ud_badge_drawable_tag, cVarArr);
            }
            UDBadgeDrawable cVar = cVarArr[i];
            if (cVar != null) {
                return cVar;
            }
            Context context = view.getContext();
            Intrinsics.checkExpressionValueIsNotNull(context, "view.context");
            UDBadgeDrawable cVar2 = new UDBadgeDrawable(context);
            cVarArr[i] = cVar2;
            cVar2.mo90264a(view);
            return cVar2;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\u0018\u00002\u00020\u00012\u00020\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0010\u0010\u001e\u001a\u00020\u00002\u0006\u0010\u001f\u001a\u00020\u001dH\u0016J\u0010\u0010 \u001a\u00020\u00002\u0006\u0010!\u001a\u00020\u0014H\u0016J\u0010\u0010\"\u001a\u00020\u00002\u0006\u0010#\u001a\u00020$H\u0016J\b\u0010%\u001a\u00020\u0004H\u0016J\u0010\u0010&\u001a\u00020\u00002\u0006\u0010&\u001a\u00020'H\u0016J\u0010\u0010(\u001a\u00020\u00002\u0006\u0010)\u001a\u00020*H\u0016J\u0010\u0010+\u001a\u00020\u00002\u0006\u0010,\u001a\u00020\u001dH\u0016J\u0010\u0010-\u001a\u00020\u00002\u0006\u0010.\u001a\u00020\u0014H\u0016J\u0010\u0010\u000e\u001a\u00020\u00022\u0006\u0010/\u001a\u00020\u000fH\u0016J\u0018\u00100\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0019\u001a\u00020\u0014H\u0016J\u0010\u00101\u001a\u00020\u00002\u0006\u0010,\u001a\u00020\u001dH\u0016J\u0010\u00102\u001a\u00020\u00002\u0006\u0010.\u001a\u00020\u0014H\u0016J\u0015\u00103\u001a\u0002042\u0006\u00105\u001a\u000206H\u0000¢\u0006\u0002\b7J\u0010\u0010\u001c\u001a\u00020\u00022\u0006\u0010\u001c\u001a\u00020\u001dH\u0016J\u0010\u00108\u001a\u00020\u00002\u0006\u00108\u001a\u000209H\u0016J\u0010\u0010:\u001a\u00020\u00002\u0006\u0010:\u001a\u00020\u001dH\u0016J\u0010\u0010;\u001a\u00020\u00022\u0006\u0010<\u001a\u00020\u001dH\u0016J\u0010\u0010=\u001a\u00020\u00002\u0006\u0010=\u001a\u00020\u0014H\u0016J\u0010\u0010>\u001a\u00020\u00022\u0006\u0010)\u001a\u00020\u0014H\u0016J\u000e\u0010?\u001a\u0002042\u0006\u0010@\u001a\u00020\u0000R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u001a\u0010\u000e\u001a\u00020\u000fX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0013\u001a\u00020\u0014X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0019\u001a\u00020\u0014X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u0016\"\u0004\b\u001b\u0010\u0018R\u000e\u0010\u001c\u001a\u00020\u001dX\u000e¢\u0006\u0002\n\u0000¨\u0006A"}, d2 = {"Lcom/larksuite/component/universe_design/badge/UDBadgeDrawable$DrawableModel;", "Lcom/larksuite/component/universe_design/badge/UDBadge$Model;", "Lcom/larksuite/component/universe_design/badge/UDBadgeDrawable$DrawableEditor;", "drawable", "Lcom/larksuite/component/universe_design/badge/UDBadgeDrawable;", "(Lcom/larksuite/component/universe_design/badge/UDBadgeDrawable;)V", "align", "Lcom/larksuite/component/universe_design/badge/UDBadgeAlign;", "getAlign", "()Lcom/larksuite/component/universe_design/badge/UDBadgeAlign;", "setAlign", "(Lcom/larksuite/component/universe_design/badge/UDBadgeAlign;)V", "getDrawable", "()Lcom/larksuite/component/universe_design/badge/UDBadgeDrawable;", "isAnchorViewCircle", "", "()Z", "setAnchorViewCircle", "(Z)V", "offsetX", "", "getOffsetX", "()F", "setOffsetX", "(F)V", "offsetY", "getOffsetY", "setOffsetY", "style", "", "badgeColor", "color", "badgeSize", "size", "badgeType", ShareHitPoint.f121869d, "Lcom/larksuite/component/universe_design/badge/UDBadge$BadgeType;", "commit", "icon", "Landroid/graphics/drawable/Drawable;", "iconPadding", "padding", "Landroid/graphics/RectF;", "innerBorderColor", "borderColor", "innerBorderWidth", "borderWidth", "yes", "offset", "outerBorderColor", "outerBorderWidth", "parseStyle", "", "context", "Landroid/content/Context;", "parseStyle$universe_ui_badge_release", "text", "", "textColor", "textMaxLength", "maxLength", "textSize", "textWidthPadding", "update", "newModel", "universe-ui-badge_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.larksuite.component.universe_design.badge.c$c */
    public static final class DrawableModel extends UDBadge.Model implements DrawableEditor {

        /* renamed from: a */
        private int f63075a = -1;

        /* renamed from: b */
        private UDBadgeAlign f63076b;

        /* renamed from: c */
        private boolean f63077c;

        /* renamed from: d */
        private float f63078d;

        /* renamed from: e */
        private float f63079e;

        /* renamed from: f */
        private final UDBadgeDrawable f63080f;

        /* renamed from: o */
        public final UDBadgeAlign mo90278o() {
            return this.f63076b;
        }

        /* renamed from: p */
        public final boolean mo90279p() {
            return this.f63077c;
        }

        /* renamed from: q */
        public final float mo90280q() {
            return this.f63078d;
        }

        /* renamed from: r */
        public final float mo90281r() {
            return this.f63079e;
        }

        @Override // com.larksuite.component.universe_design.badge.UDBadgeDrawable.DrawableEditor
        /* renamed from: a */
        public UDBadgeDrawable mo90273a() {
            this.f63080f.mo90265a(this);
            return this.f63080f;
        }

        @Override // com.larksuite.component.universe_design.badge.UDBadgeDrawable.DrawableEditor
        public DrawableEditor a_(int i) {
            this.f63075a = i;
            return this;
        }

        public DrawableModel(UDBadgeDrawable cVar) {
            Intrinsics.checkParameterIsNotNull(cVar, "drawable");
            this.f63080f = cVar;
        }

        @Override // com.larksuite.component.universe_design.badge.UDBadgeDrawable.DrawableEditor
        /* renamed from: a */
        public DrawableEditor mo90272a(UDBadgeAlign uDBadgeAlign) {
            Intrinsics.checkParameterIsNotNull(uDBadgeAlign, "align");
            this.f63076b = uDBadgeAlign;
            return this;
        }

        /* renamed from: c */
        public DrawableModel mo90207a(String str) {
            Intrinsics.checkParameterIsNotNull(str, "text");
            mo90218b(str);
            return this;
        }

        /* renamed from: a */
        public final void mo90276a(DrawableModel cVar) {
            Intrinsics.checkParameterIsNotNull(cVar, "newModel");
            super.mo90213a((UDBadge.Model) cVar);
            this.f63075a = cVar.f63075a;
            this.f63076b = cVar.f63076b;
            this.f63077c = cVar.f63077c;
            this.f63078d = cVar.f63078d;
            this.f63079e = cVar.f63079e;
        }

        /* renamed from: a */
        public final void mo90275a(Context context) {
            Intrinsics.checkParameterIsNotNull(context, "context");
            int i = this.f63075a;
            if (i != -1) {
                TypedArray obtainStyledAttributes = context.obtainStyledAttributes(null, new int[]{R.attr.ud_badge_color, R.attr.ud_badge_icon, R.attr.ud_badge_iconPadding, R.attr.ud_badge_innerBorderColor, R.attr.ud_badge_innerBorderWidth, R.attr.ud_badge_outerBorderColor, R.attr.ud_badge_outerBorderWidth, R.attr.ud_badge_size, R.attr.ud_badge_text, R.attr.ud_badge_textColor, R.attr.ud_badge_textMaxLength, R.attr.ud_badge_textSize, R.attr.ud_badge_textWidthPadding, R.attr.ud_badge_type}, 0, i);
                if (aj_() == UDBadge.BadgeType.UNKNOWN) {
                    mo90212a(UDBadge.f63020b.mo90202a(obtainStyledAttributes.getInt(13, UDBadge.BadgeType.UNKNOWN.getValue())));
                }
                if (mo90215b() == BitmapDescriptorFactory.HUE_RED) {
                    mo90208a(obtainStyledAttributes.getDimension(7, UDDimenUtils.m93307a(context, 16.0f)));
                }
                if (mo90219c() == 0) {
                    mo90209a(obtainStyledAttributes.getColor(0, 0));
                }
                if (mo90222d() == BitmapDescriptorFactory.HUE_RED) {
                    mo90216b(obtainStyledAttributes.getDimension(6, BitmapDescriptorFactory.HUE_RED));
                }
                if (mo90225e() == 0) {
                    mo90217b(obtainStyledAttributes.getColor(5, 0));
                }
                if (mo90228f() == BitmapDescriptorFactory.HUE_RED) {
                    mo90220c(obtainStyledAttributes.getDimension(4, BitmapDescriptorFactory.HUE_RED));
                }
                if (mo90229g() == 0) {
                    mo90221c(obtainStyledAttributes.getColor(3, 0));
                }
                if (mo90230h() == null) {
                    mo90218b(obtainStyledAttributes.getString(8));
                }
                if (mo90232j() == 0) {
                    mo90224d(obtainStyledAttributes.getColor(9, 0));
                }
                if (mo90231i() == BitmapDescriptorFactory.HUE_RED) {
                    mo90223d(obtainStyledAttributes.getDimension(11, (float) UDDimenUtils.m93312c(context, 12.0f)));
                }
                if (mo90233k() == BitmapDescriptorFactory.HUE_RED) {
                    mo90226e(obtainStyledAttributes.getDimension(12, BitmapDescriptorFactory.HUE_RED));
                }
                if (mo90235m() == null) {
                    mo90211a(obtainStyledAttributes.getDrawable(1));
                }
                if (mo90236n() == null) {
                    float dimension = obtainStyledAttributes.getDimension(2, BitmapDescriptorFactory.HUE_RED);
                    mo90210a(new RectF(dimension, dimension, dimension, dimension));
                }
                obtainStyledAttributes.recycle();
            }
        }
    }

    /* renamed from: a */
    public final DrawableEditor mo90263a() {
        DrawableModel cVar = new DrawableModel(this);
        cVar.mo90276a(this.f63070b);
        return cVar;
    }

    /* renamed from: b */
    private final void m92425b() {
        View view;
        float f;
        float f2;
        float f3;
        int i;
        WeakReference<View> weakReference = this.f63072d;
        if (weakReference != null && (view = weakReference.get()) != null) {
            Intrinsics.checkExpressionValueIsNotNull(view, "anchorViewRef?.get() ?: return");
            Rect rect = new Rect();
            view.getDrawingRect(rect);
            ViewParent parent = view.getParent();
            if (!(parent instanceof ViewGroup)) {
                parent = null;
            }
            ViewGroup viewGroup = (ViewGroup) parent;
            if (viewGroup != null) {
                viewGroup.offsetDescendantRectToMyCoords(view, rect);
            }
            if (!rect.isEmpty()) {
                boolean p = this.f63070b.mo90279p();
                float f4 = BitmapDescriptorFactory.HUE_RED;
                if (p) {
                    f = (((float) rect.height()) / 2.0f) * 0.2929f;
                } else {
                    f = BitmapDescriptorFactory.HUE_RED;
                }
                UDBadgeAlign o = this.f63070b.mo90278o();
                if (o != null) {
                    switch (C25712d.f63081a[o.ordinal()]) {
                        case 1:
                            f4 = (float) rect.left;
                            f3 = (float) rect.top;
                            if (p) {
                                f4 += f;
                                f2 = f3 + f;
                                break;
                            }
                            f2 = f3;
                            break;
                        case 2:
                            f4 = (float) rect.right;
                            f3 = (float) rect.top;
                            if (p) {
                                f4 -= f;
                                f2 = f3 + f;
                                break;
                            }
                            f2 = f3;
                            break;
                        case 3:
                            f4 = (float) rect.right;
                            f3 = (float) rect.bottom;
                            if (p) {
                                f4 -= f;
                                f2 = f3 - f;
                                break;
                            }
                            f2 = f3;
                            break;
                        case 4:
                            f4 = (float) rect.left;
                            f3 = (float) rect.bottom;
                            if (p) {
                                f4 += f;
                                f2 = f3 - f;
                                break;
                            }
                            f2 = f3;
                            break;
                        case 5:
                            f4 = (float) rect.left;
                            i = Math.abs(rect.bottom - rect.top);
                            f2 = ((float) i) / 2.0f;
                            break;
                        case 6:
                            f4 = (float) rect.right;
                            i = Math.abs(rect.bottom - rect.top);
                            f2 = ((float) i) / 2.0f;
                            break;
                    }
                    this.f63071c.mo90195a(f4 + this.f63070b.mo90280q(), f2 + this.f63070b.mo90281r(), this.f63070b.mo90278o());
                    invalidateSelf();
                }
                f2 = BitmapDescriptorFactory.HUE_RED;
                this.f63071c.mo90195a(f4 + this.f63070b.mo90280q(), f2 + this.f63070b.mo90281r(), this.f63070b.mo90278o());
                invalidateSelf();
            }
        }
    }

    public void draw(Canvas canvas) {
        Intrinsics.checkParameterIsNotNull(canvas, "canvas");
        this.f63071c.mo90196a(canvas);
    }

    public UDBadgeDrawable(Context context) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        this.f63074f = context;
    }

    /* renamed from: a */
    public final void mo90264a(View view) {
        ViewGroup viewGroup;
        this.f63073e = true;
        ViewParent parent = view.getParent();
        if (!(parent instanceof ViewGroup)) {
            parent = null;
        }
        ViewGroup viewGroup2 = (ViewGroup) parent;
        if (viewGroup2 != null) {
            viewGroup = viewGroup2;
        } else {
            viewGroup = view;
        }
        viewGroup.getOverlay().add(this);
        viewGroup.addOnLayoutChangeListener(this);
        this.f63072d = new WeakReference<>(view);
        m92425b();
    }

    /* renamed from: a */
    public final void mo90265a(DrawableModel cVar) {
        boolean z;
        Intrinsics.checkParameterIsNotNull(cVar, "newModel");
        this.f63070b.mo90276a(cVar);
        this.f63070b.mo90275a(this.f63074f);
        String h = this.f63070b.mo90230h();
        if (h != null) {
            boolean z2 = true;
            if (h.length() > 0) {
                z = true;
            } else {
                z = false;
            }
            if (!z || h.length() <= this.f63070b.mo90234l()) {
                z2 = false;
            }
            Drawable drawable = null;
            if (!z2) {
                h = null;
            }
            if (h != null) {
                DrawableModel cVar2 = this.f63070b;
                Drawable drawable2 = this.f63074f.getDrawable(R.drawable.ud_icon_more_outlined);
                if (drawable2 != null) {
                    drawable = drawable2.mutate();
                    drawable.setTint(UDColorUtils.getColor(this.f63074f, R.color.static_white));
                }
                cVar2.mo90211a(drawable);
                this.f63070b.mo90212a(UDBadge.BadgeType.ICON);
                float a = UDDimenUtils.m93307a(this.f63074f, 4.0f);
                this.f63070b.mo90210a(new RectF(a, BitmapDescriptorFactory.HUE_RED, a, BitmapDescriptorFactory.HUE_RED));
            }
        }
        this.f63071c.mo90197a(this.f63070b);
        if (this.f63073e) {
            m92425b();
        }
    }

    public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        m92425b();
    }
}
