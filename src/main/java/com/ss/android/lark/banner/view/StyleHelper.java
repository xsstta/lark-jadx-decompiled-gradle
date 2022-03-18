package com.ss.android.lark.banner.view;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import com.larksuite.framework.utils.UIUtils;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.ss.android.lark.banner.view.h */
public final class StyleHelper {

    /* renamed from: a */
    public static final Companion f73802a = new Companion(null);

    /* renamed from: a */
    public static final Drawable m108714a(Context context, float f, int i, int i2, int i3) {
        return f73802a.mo104592a(context, f, i, i2, i3);
    }

    /* renamed from: b */
    public static final Drawable m108715b(Context context, float f, int i, int i2, int i3) {
        return f73802a.mo104595c(context, f, i, i2, i3);
    }

    /* renamed from: com.ss.android.lark.banner.view.h$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final Integer mo104593a(String str) {
            if (str == null) {
                return null;
            }
            try {
                return Integer.valueOf(Color.parseColor(str));
            } catch (Exception unused) {
                return null;
            }
        }

        /* renamed from: a */
        private final Drawable m108716a(int i, float f, int i2, int i3, int i4) {
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setShape(i);
            if (f > ((float) 0)) {
                gradientDrawable.setCornerRadius(f);
            }
            gradientDrawable.setColor(i2);
            gradientDrawable.setStroke(i3, i4);
            return gradientDrawable;
        }

        /* renamed from: b */
        public final Drawable mo104594b(Context context, float f, int i, int i2, int i3) {
            Intrinsics.checkParameterIsNotNull(context, "context");
            return m108716a(0, f, i, i2, i3);
        }

        /* renamed from: c */
        public final Drawable mo104595c(Context context, float f, int i, int i2, int i3) {
            Intrinsics.checkParameterIsNotNull(context, "context");
            return m108716a(0, f, i, i2, i3);
        }

        /* renamed from: a */
        public final Drawable mo104592a(Context context, float f, int i, int i2, int i3) {
            Intrinsics.checkParameterIsNotNull(context, "context");
            return m108716a(0, f, i, i2, i3);
        }

        /* renamed from: a */
        public static /* synthetic */ Drawable m108717a(Companion aVar, Context context, float f, int i, int i2, int i3, int i4, Object obj) {
            int i5;
            int i6;
            if ((i4 & 2) != 0) {
                f = (float) UIUtils.dp2px(context, 4.0f);
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
            return aVar.mo104592a(context, f, i5, i2, i6);
        }

        /* renamed from: b */
        public static /* synthetic */ Drawable m108718b(Companion aVar, Context context, float f, int i, int i2, int i3, int i4, Object obj) {
            int i5;
            int i6;
            if ((i4 & 2) != 0) {
                f = (float) UIUtils.dp2px(context, 4.0f);
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
            return aVar.mo104594b(context, f, i5, i2, i6);
        }
    }
}
