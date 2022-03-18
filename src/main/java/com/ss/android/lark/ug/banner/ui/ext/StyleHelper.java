package com.ss.android.lark.ug.banner.ui.ext;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import com.larksuite.framework.utils.UIUtils;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0000\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, d2 = {"Lcom/ss/android/lark/ug/banner/ui/ext/StyleHelper;", "", "()V", "Companion", "ug-banner-ui_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.ss.android.lark.ug.banner.ui.a.b */
public final class StyleHelper {

    /* renamed from: a */
    public static final Companion f141250a = new Companion(null);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J8\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\u00042\b\b\u0003\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0003\u0010\u0010\u001a\u00020\u000eH\u0007J8\u0010\u0011\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\u00042\b\b\u0001\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0003\u0010\u0010\u001a\u00020\u000eH\u0007J8\u0010\u0012\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\u00042\b\b\u0003\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0003\u0010\u0010\u001a\u00020\u000eH\u0007J4\u0010\u0013\u001a\u00020\t2\u0006\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u00042\b\b\u0001\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000e2\b\b\u0001\u0010\u0010\u001a\u00020\u000eH\u0002J\u0010\u0010\u0015\u001a\u00020\u000e2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0018"}, d2 = {"Lcom/ss/android/lark/ug/banner/ui/ext/StyleHelper$Companion;", "", "()V", "DEFAULT_BANNER_CORNER_SIZE", "", "DEFAULT_BUTTON_CORNER_SIZE", "DEFAULT_CARD_CORNER_SIZE", "DEFAULT_STROKE_WIDTH", "createBannerBackgroundDrawable", "Landroid/graphics/drawable/Drawable;", "context", "Landroid/content/Context;", "corner", "solidColor", "", "strokeWidth", "strokeColor", "createButtonBackgroundDrawable", "createCardBackgroundDrawable", "createDrawable", "shape", "parseColor", "colorStr", "", "ug-banner-ui_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.ss.android.lark.ug.banner.ui.a.b$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        private final Drawable m222425a(int i, float f, int i2, int i3, int i4) {
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setShape(i);
            if (f > ((float) 0)) {
                gradientDrawable.setCornerRadius(f);
            }
            gradientDrawable.setColor(i2);
            gradientDrawable.setStroke(i3, i4);
            return gradientDrawable;
        }

        @JvmStatic
        /* renamed from: b */
        public final Drawable mo194569b(Context context, float f, int i, int i2, int i3) {
            Intrinsics.checkParameterIsNotNull(context, "context");
            return m222425a(0, f, i, i2, i3);
        }

        @JvmStatic
        /* renamed from: c */
        public final Drawable mo194570c(Context context, float f, int i, int i2, int i3) {
            Intrinsics.checkParameterIsNotNull(context, "context");
            return m222425a(0, f, i, i2, i3);
        }

        @JvmStatic
        /* renamed from: a */
        public final Drawable mo194568a(Context context, float f, int i, int i2, int i3) {
            Intrinsics.checkParameterIsNotNull(context, "context");
            return m222425a(0, f, i, i2, i3);
        }

        /* renamed from: a */
        public static /* synthetic */ Drawable m222426a(Companion aVar, Context context, float f, int i, int i2, int i3, int i4, Object obj) {
            int i5;
            int i6;
            if ((i4 & 2) != 0) {
                f = (float) UIUtils.dp2px(context, 8.0f);
            }
            if ((i4 & 4) != 0) {
                i5 = 0;
            } else {
                i5 = i;
            }
            if ((i4 & 8) != 0) {
                i2 = UIUtils.dp2px(context, 1.0f);
            }
            if ((i4 & 16) != 0) {
                i6 = 0;
            } else {
                i6 = i3;
            }
            return aVar.mo194568a(context, f, i5, i2, i6);
        }

        /* renamed from: b */
        public static /* synthetic */ Drawable m222427b(Companion aVar, Context context, float f, int i, int i2, int i3, int i4, Object obj) {
            int i5;
            int i6;
            if ((i4 & 2) != 0) {
                f = (float) UIUtils.dp2px(context, 8.0f);
            }
            if ((i4 & 4) != 0) {
                i5 = 0;
            } else {
                i5 = i;
            }
            if ((i4 & 8) != 0) {
                i2 = UIUtils.dp2px(context, 1.0f);
            }
            if ((i4 & 16) != 0) {
                i6 = 0;
            } else {
                i6 = i3;
            }
            return aVar.mo194569b(context, f, i5, i2, i6);
        }
    }
}
