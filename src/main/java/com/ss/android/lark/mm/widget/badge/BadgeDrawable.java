package com.ss.android.lark.mm.widget.badge;

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
import com.larksuite.component.universe_design.icon.UDIconUtils;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import com.ss.android.lark.mm.widget.badge.UDBadge;
import java.lang.ref.WeakReference;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 +2\u00020\u00012\u00020\u0002:\u0003+,-B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\bH\u0002J\u0010\u0010\u0012\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0014H\u0016J\u0006\u0010\u0015\u001a\u00020\u0016J\b\u0010\u0017\u001a\u00020\u0018H\u0016JR\u0010\u0019\u001a\u00020\u00102\b\u0010\u001a\u001a\u0004\u0018\u00010\b2\u0006\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u001c\u001a\u00020\u00182\u0006\u0010\u001d\u001a\u00020\u00182\u0006\u0010\u001e\u001a\u00020\u00182\u0006\u0010\u001f\u001a\u00020\u00182\u0006\u0010 \u001a\u00020\u00182\u0006\u0010!\u001a\u00020\u00182\u0006\u0010\"\u001a\u00020\u0018H\u0016J\u0010\u0010#\u001a\u00020\u00102\u0006\u0010$\u001a\u00020\u0018H\u0016J\u0012\u0010%\u001a\u00020\u00102\b\u0010&\u001a\u0004\u0018\u00010'H\u0016J\u000e\u0010(\u001a\u00020\u00102\u0006\u0010)\u001a\u00020\u000eJ\b\u0010*\u001a\u00020\u0010H\u0002R\u0016\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0004¢\u0006\u0002\n\u0000¨\u0006."}, d2 = {"Lcom/ss/android/lark/mm/widget/badge/BadgeDrawable;", "Landroid/graphics/drawable/Drawable;", "Landroid/view/View$OnLayoutChangeListener;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "anchorViewRef", "Ljava/lang/ref/WeakReference;", "Landroid/view/View;", "badge", "Lcom/ss/android/lark/mm/widget/badge/UDBadge;", "isAttached", "", "model", "Lcom/ss/android/lark/mm/widget/badge/BadgeDrawable$DrawableModel;", "attachTo", "", "anchorView", "draw", "canvas", "Landroid/graphics/Canvas;", "editor", "Lcom/ss/android/lark/mm/widget/badge/BadgeDrawable$DrawableEditor;", "getOpacity", "", "onLayoutChange", "v", "left", "top", "right", "bottom", "oldLeft", "oldTop", "oldRight", "oldBottom", "setAlpha", "alpha", "setColorFilter", "colorFilter", "Landroid/graphics/ColorFilter;", "setModel", "newModel", "updateLayout", "Companion", "DrawableEditor", "DrawableModel", "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.mm.widget.badge.a */
public final class BadgeDrawable extends Drawable implements View.OnLayoutChangeListener {

    /* renamed from: a */
    public static final Companion f118836a = new Companion(null);

    /* renamed from: b */
    private final DrawableModel f118837b = new DrawableModel(this);

    /* renamed from: c */
    private UDBadge f118838c = new UDBadge();

    /* renamed from: d */
    private WeakReference<View> f118839d;

    /* renamed from: e */
    private boolean f118840e;

    /* renamed from: f */
    private final Context f118841f;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\bf\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001J\u0010\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\bH&J\u0018\u0010\t\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000bH&J\u0010\u0010\r\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\u000eH&¨\u0006\u000f"}, d2 = {"Lcom/ss/android/lark/mm/widget/badge/BadgeDrawable$DrawableEditor;", "Lcom/ss/android/lark/mm/widget/badge/UDBadge$Editor;", "align", "Lcom/ss/android/lark/mm/widget/badge/UDBadgeAlign;", "commit", "Lcom/ss/android/lark/mm/widget/badge/BadgeDrawable;", "isAnchorViewCircle", "yes", "", "offset", "offsetX", "", "offsetY", "style", "", "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.widget.badge.a$b */
    public interface DrawableEditor extends UDBadge.Editor<DrawableEditor> {
        /* renamed from: a */
        DrawableEditor mo165750a(float f, float f2);

        /* renamed from: a */
        DrawableEditor mo165751a(int i);

        /* renamed from: a */
        DrawableEditor mo165752a(UDBadgeAlign uDBadgeAlign);

        /* renamed from: a */
        DrawableEditor mo165753a(boolean z);

        /* renamed from: a */
        BadgeDrawable mo165754a();
    }

    public int getOpacity() {
        return -3;
    }

    public void setAlpha(int i) {
    }

    public void setColorFilter(ColorFilter colorFilter) {
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bJ\u000e\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\bJ\u0016\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\rR\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/ss/android/lark/mm/widget/badge/BadgeDrawable$Companion;", "", "()V", "DELTA_SCALE", "", "detachFrom", "", "anchorView", "Landroid/view/View;", "obtain", "Lcom/ss/android/lark/mm/widget/badge/BadgeDrawable;", "view", "index", "", "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.widget.badge.a$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final BadgeDrawable mo165748a(View view) {
            Intrinsics.checkParameterIsNotNull(view, "view");
            return mo165749a(view, 0);
        }

        /* renamed from: a */
        public final BadgeDrawable mo165749a(View view, int i) {
            Intrinsics.checkParameterIsNotNull(view, "view");
            if (i < 0 || 1 < i) {
                throw new IndexOutOfBoundsException("only support 2 badge");
            }
            Object tag = view.getTag(R.id.mm_badge_drawable_tag);
            if (!(tag instanceof BadgeDrawable[])) {
                tag = null;
            }
            BadgeDrawable[] aVarArr = (BadgeDrawable[]) tag;
            if (aVarArr == null) {
                aVarArr = new BadgeDrawable[2];
                view.setTag(R.id.mm_badge_drawable_tag, aVarArr);
            }
            BadgeDrawable aVar = aVarArr[i];
            if (aVar != null) {
                return aVar;
            }
            Context context = view.getContext();
            Intrinsics.checkExpressionValueIsNotNull(context, "view.context");
            BadgeDrawable aVar2 = new BadgeDrawable(context);
            aVarArr[i] = aVar2;
            aVar2.mo165741a(view);
            return aVar2;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u00002\u00020\u00012\u00020\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0010\u0010\u001e\u001a\u00020\u00002\u0006\u0010\u001f\u001a\u00020\u001dH\u0016J\u0010\u0010 \u001a\u00020\u00002\u0006\u0010!\u001a\u00020\u0014H\u0016J\u0010\u0010\"\u001a\u00020\u00002\u0006\u0010#\u001a\u00020$H\u0016J\b\u0010%\u001a\u00020\u0004H\u0016J\u0010\u0010&\u001a\u00020\u00002\u0006\u0010&\u001a\u00020'H\u0016J\u0010\u0010(\u001a\u00020\u00002\u0006\u0010)\u001a\u00020*H\u0016J\u0010\u0010+\u001a\u00020\u00002\u0006\u0010,\u001a\u00020\u001dH\u0016J\u0010\u0010-\u001a\u00020\u00002\u0006\u0010.\u001a\u00020\u0014H\u0016J\u0010\u0010\u000e\u001a\u00020\u00022\u0006\u0010/\u001a\u00020\u000fH\u0016J\u0018\u00100\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0019\u001a\u00020\u0014H\u0016J\u0010\u00101\u001a\u00020\u00002\u0006\u0010,\u001a\u00020\u001dH\u0016J\u0010\u00102\u001a\u00020\u00002\u0006\u0010.\u001a\u00020\u0014H\u0016J\u0015\u00103\u001a\u0002042\u0006\u00105\u001a\u000206H\u0000¢\u0006\u0002\b7J\u0010\u0010\u001c\u001a\u00020\u00022\u0006\u0010\u001c\u001a\u00020\u001dH\u0016J\u0010\u00108\u001a\u00020\u00002\u0006\u00108\u001a\u000209H\u0016J\u0010\u0010:\u001a\u00020\u00002\u0006\u0010:\u001a\u00020\u001dH\u0016J\u0010\u0010;\u001a\u00020\u00002\u0006\u0010;\u001a\u00020\u0014H\u0016J\u0010\u0010<\u001a\u00020\u00022\u0006\u0010)\u001a\u00020\u0014H\u0016J\u000e\u0010=\u001a\u0002042\u0006\u0010>\u001a\u00020\u0000R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u001a\u0010\u000e\u001a\u00020\u000fX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0013\u001a\u00020\u0014X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0019\u001a\u00020\u0014X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u0016\"\u0004\b\u001b\u0010\u0018R\u000e\u0010\u001c\u001a\u00020\u001dX\u000e¢\u0006\u0002\n\u0000¨\u0006?"}, d2 = {"Lcom/ss/android/lark/mm/widget/badge/BadgeDrawable$DrawableModel;", "Lcom/ss/android/lark/mm/widget/badge/UDBadge$Model;", "Lcom/ss/android/lark/mm/widget/badge/BadgeDrawable$DrawableEditor;", "drawable", "Lcom/ss/android/lark/mm/widget/badge/BadgeDrawable;", "(Lcom/ss/android/lark/mm/widget/badge/BadgeDrawable;)V", "align", "Lcom/ss/android/lark/mm/widget/badge/UDBadgeAlign;", "getAlign", "()Lcom/ss/android/lark/mm/widget/badge/UDBadgeAlign;", "setAlign", "(Lcom/ss/android/lark/mm/widget/badge/UDBadgeAlign;)V", "getDrawable", "()Lcom/ss/android/lark/mm/widget/badge/BadgeDrawable;", "isAnchorViewCircle", "", "()Z", "setAnchorViewCircle", "(Z)V", "offsetX", "", "getOffsetX", "()F", "setOffsetX", "(F)V", "offsetY", "getOffsetY", "setOffsetY", "style", "", "badgeColor", "color", "badgeSize", "size", "badgeType", ShareHitPoint.f121869d, "Lcom/ss/android/lark/mm/widget/badge/UDBadge$BadgeType;", "commit", "icon", "Landroid/graphics/drawable/Drawable;", "iconPadding", "padding", "Landroid/graphics/RectF;", "innerBorderColor", "borderColor", "innerBorderWidth", "borderWidth", "yes", "offset", "outerBorderColor", "outerBorderWidth", "parseStyle", "", "context", "Landroid/content/Context;", "parseStyle$mm_release", "text", "", "textColor", "textSize", "textWidthPadding", "update", "newModel", "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.widget.badge.a$c */
    public static final class DrawableModel extends UDBadge.Model implements DrawableEditor {

        /* renamed from: a */
        private int f118842a = -1;

        /* renamed from: b */
        private UDBadgeAlign f118843b;

        /* renamed from: c */
        private boolean f118844c;

        /* renamed from: d */
        private float f118845d;

        /* renamed from: e */
        private float f118846e;

        /* renamed from: f */
        private final BadgeDrawable f118847f;

        /* renamed from: b */
        public final UDBadgeAlign mo165760b() {
            return this.f118843b;
        }

        /* renamed from: c */
        public final boolean mo165762c() {
            return this.f118844c;
        }

        /* renamed from: d */
        public final float mo165763d() {
            return this.f118845d;
        }

        /* renamed from: e */
        public final float mo165764e() {
            return this.f118846e;
        }

        @Override // com.ss.android.lark.mm.widget.badge.BadgeDrawable.DrawableEditor
        /* renamed from: a */
        public BadgeDrawable mo165754a() {
            this.f118847f.mo165742a(this);
            return this.f118847f;
        }

        /* renamed from: a */
        public DrawableModel mo165709b(float f) {
            mo165717c(f);
            return this;
        }

        /* renamed from: b */
        public DrawableModel mo165712c(int i) {
            mo165715a(Integer.valueOf(i));
            return this;
        }

        public DrawableModel(BadgeDrawable aVar) {
            Intrinsics.checkParameterIsNotNull(aVar, "drawable");
            this.f118847f = aVar;
        }

        @Override // com.ss.android.lark.mm.widget.badge.BadgeDrawable.DrawableEditor
        /* renamed from: a */
        public DrawableEditor mo165751a(int i) {
            this.f118842a = i;
            return this;
        }

        @Override // com.ss.android.lark.mm.widget.badge.BadgeDrawable.DrawableEditor
        /* renamed from: a */
        public DrawableEditor mo165752a(UDBadgeAlign uDBadgeAlign) {
            Intrinsics.checkParameterIsNotNull(uDBadgeAlign, "align");
            this.f118843b = uDBadgeAlign;
            return this;
        }

        @Override // com.ss.android.lark.mm.widget.badge.BadgeDrawable.DrawableEditor
        /* renamed from: a */
        public DrawableEditor mo165753a(boolean z) {
            this.f118844c = z;
            return this;
        }

        /* renamed from: a */
        public DrawableModel mo165710b(RectF rectF) {
            Intrinsics.checkParameterIsNotNull(rectF, "padding");
            mo165718c(rectF);
            return this;
        }

        /* renamed from: a */
        public DrawableModel mo165711b(Drawable drawable) {
            Intrinsics.checkParameterIsNotNull(drawable, "icon");
            mo165719c(drawable);
            return this;
        }

        /* renamed from: a */
        public final void mo165758a(Context context) {
            Intrinsics.checkParameterIsNotNull(context, "context");
            int i = this.f118842a;
            if (i != -1) {
                TypedArray obtainStyledAttributes = context.obtainStyledAttributes(null, new int[]{R.attr.mm_badge_color, R.attr.mm_badge_icon, R.attr.mm_badge_iconPadding, R.attr.mm_badge_innerBorderColor, R.attr.mm_badge_innerBorderWidth, R.attr.mm_badge_outerBorderColor, R.attr.mm_badge_outerBorderWidth, R.attr.mm_badge_size, R.attr.mm_badge_text, R.attr.mm_badge_textColor, R.attr.mm_badge_textSize, R.attr.mm_badge_textWidthPadding, R.attr.mm_badge_type}, 0, i);
                Intrinsics.checkExpressionValueIsNotNull(obtainStyledAttributes, "context.obtainStyledAttr…able.BadgeView, 0, style)");
                if (mo165724f() == UDBadge.BadgeType.UNKNOWN) {
                    mo165713a(UDBadge.f118808b.mo165704a(obtainStyledAttributes.getInt(12, UDBadge.BadgeType.UNKNOWN.getValue())));
                }
                if (mo165727g() == BitmapDescriptorFactory.HUE_RED) {
                    mo165717c(obtainStyledAttributes.getDimension(7, (float) UIUtils.dp2px(context, 16.0f)));
                }
                if (mo165729h() == null) {
                    mo165715a(Integer.valueOf(obtainStyledAttributes.getColor(0, 0)));
                }
                if (mo165730i() == BitmapDescriptorFactory.HUE_RED) {
                    mo165720d(obtainStyledAttributes.getDimension(6, BitmapDescriptorFactory.HUE_RED));
                }
                if (mo165731j() == 0) {
                    mo165721d(obtainStyledAttributes.getColor(5, 0));
                }
                if (mo165732k() == BitmapDescriptorFactory.HUE_RED) {
                    mo165722e(obtainStyledAttributes.getDimension(4, BitmapDescriptorFactory.HUE_RED));
                }
                if (mo165733l() == 0) {
                    mo165723e(obtainStyledAttributes.getColor(3, 0));
                }
                if (mo165734m() == null) {
                    mo165716a(obtainStyledAttributes.getString(8));
                }
                if (mo165736o() == 0) {
                    mo165726f(obtainStyledAttributes.getColor(9, 0));
                }
                if (mo165735n() == BitmapDescriptorFactory.HUE_RED) {
                    mo165725f(obtainStyledAttributes.getDimension(10, UIUtils.sp2px(context, 12.0f)));
                }
                if (mo165737p() == BitmapDescriptorFactory.HUE_RED) {
                    mo165728g(obtainStyledAttributes.getDimension(11, BitmapDescriptorFactory.HUE_RED));
                }
                if (mo165738q() == null) {
                    mo165719c(obtainStyledAttributes.getDrawable(1));
                }
                if (mo165739r() == null) {
                    float dimension = obtainStyledAttributes.getDimension(2, BitmapDescriptorFactory.HUE_RED);
                    mo165718c(new RectF(dimension, dimension, dimension, dimension));
                }
                obtainStyledAttributes.recycle();
            }
        }

        /* renamed from: a */
        public final void mo165759a(DrawableModel cVar) {
            Intrinsics.checkParameterIsNotNull(cVar, "newModel");
            super.mo165714a((UDBadge.Model) cVar);
            this.f118842a = cVar.f118842a;
            this.f118843b = cVar.f118843b;
            this.f118844c = cVar.f118844c;
            this.f118845d = cVar.f118845d;
            this.f118846e = cVar.f118846e;
        }

        @Override // com.ss.android.lark.mm.widget.badge.BadgeDrawable.DrawableEditor
        /* renamed from: a */
        public DrawableEditor mo165750a(float f, float f2) {
            this.f118845d = f;
            this.f118846e = f2;
            return this;
        }
    }

    /* renamed from: a */
    public final DrawableEditor mo165740a() {
        DrawableModel cVar = new DrawableModel(this);
        cVar.mo165759a(this.f118837b);
        return cVar;
    }

    /* renamed from: b */
    private final void m186759b() {
        View view;
        float f;
        float f2;
        int i;
        WeakReference<View> weakReference = this.f118839d;
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
                boolean c = this.f118837b.mo165762c();
                UDBadgeAlign b = this.f118837b.mo165760b();
                float f3 = BitmapDescriptorFactory.HUE_RED;
                if (b != null) {
                    switch (C47145b.f118848a[b.ordinal()]) {
                        case 1:
                            f3 = (float) rect.left;
                            f2 = (float) rect.top;
                            if (c) {
                                f3 += 14.0f;
                                f = f2 + 14.0f;
                                break;
                            }
                            f = f2;
                            break;
                        case 2:
                            f3 = (float) rect.right;
                            f2 = (float) rect.top;
                            if (c) {
                                f3 -= 14.0f;
                                f = f2 + 14.0f;
                                break;
                            }
                            f = f2;
                            break;
                        case 3:
                            f3 = (float) rect.right;
                            f2 = (float) rect.bottom;
                            if (c) {
                                f3 -= 14.0f;
                                f = f2 - 14.0f;
                                break;
                            }
                            f = f2;
                            break;
                        case 4:
                            f3 = (float) rect.left;
                            f2 = (float) rect.bottom;
                            if (c) {
                                f3 += 14.0f;
                                f = f2 - 14.0f;
                                break;
                            }
                            f = f2;
                            break;
                        case 5:
                            f3 = (float) rect.left;
                            i = Math.abs(rect.bottom - rect.top);
                            f = ((float) i) / 2.0f;
                            break;
                        case 6:
                            f3 = (float) rect.right;
                            i = Math.abs(rect.bottom - rect.top);
                            f = ((float) i) / 2.0f;
                            break;
                    }
                    this.f118838c.mo165699a(f3 + this.f118837b.mo165763d(), f + this.f118837b.mo165764e(), this.f118837b.mo165760b());
                    invalidateSelf();
                }
                f = BitmapDescriptorFactory.HUE_RED;
                this.f118838c.mo165699a(f3 + this.f118837b.mo165763d(), f + this.f118837b.mo165764e(), this.f118837b.mo165760b());
                invalidateSelf();
            }
        }
    }

    public void draw(Canvas canvas) {
        Intrinsics.checkParameterIsNotNull(canvas, "canvas");
        this.f118838c.mo165700a(canvas);
    }

    public BadgeDrawable(Context context) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        this.f118841f = context;
    }

    /* renamed from: a */
    public final void mo165741a(View view) {
        ViewGroup viewGroup;
        this.f118840e = true;
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
        this.f118839d = new WeakReference<>(view);
        m186759b();
    }

    /* renamed from: a */
    public final void mo165742a(DrawableModel cVar) {
        boolean z;
        Intrinsics.checkParameterIsNotNull(cVar, "newModel");
        this.f118837b.mo165759a(cVar);
        this.f118837b.mo165758a(this.f118841f);
        String m = this.f118837b.mo165734m();
        if (m != null) {
            boolean z2 = true;
            if (m.length() > 0) {
                z = true;
            } else {
                z = false;
            }
            if (!z || m.length() <= 3) {
                z2 = false;
            }
            if (!z2) {
                m = null;
            }
            if (m != null) {
                DrawableModel cVar2 = this.f118837b;
                Drawable mutate = UDIconUtils.getIconDrawable(this.f118841f, R.drawable.mm_ud_icon_more_outlined).mutate();
                mutate.setTint(UIUtils.getColor(this.f118841f, R.color.lkui_N00));
                cVar2.mo165719c(mutate);
                this.f118837b.mo165713a(UDBadge.BadgeType.ICON);
                float dp2px = (float) UIUtils.dp2px(this.f118841f, 4.0f);
                this.f118837b.mo165718c(new RectF(dp2px, BitmapDescriptorFactory.HUE_RED, dp2px, BitmapDescriptorFactory.HUE_RED));
            }
        }
        this.f118838c.mo165701a(this.f118837b);
        if (this.f118840e) {
            m186759b();
        }
    }

    public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        m186759b();
    }
}
