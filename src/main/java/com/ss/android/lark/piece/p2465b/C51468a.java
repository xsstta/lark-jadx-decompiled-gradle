package com.ss.android.lark.piece.p2465b;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.p017a.p018a.C0215a;
import androidx.core.content.ContextCompat;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u001a\u0016\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005\u001a\u000e\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0001\u001a\u0012\u0010\u0006\u001a\u00020\u0001*\u00020\u00052\u0006\u0010\u0002\u001a\u00020\u0003\u001a\n\u0010\u0006\u001a\u00020\u0001*\u00020\u0001\u001a\u0014\u0010\u0007\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0007\u001a\u0014\u0010\b\u001a\u0004\u0018\u00010\t*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003\u001a\u0012\u0010\n\u001a\u00020\u000b*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003\u001a\u001c\u0010\n\u001a\u00020\u000b*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\u0010\f\u001a\u0004\u0018\u00010\r\u001a\u0012\u0010\u000e\u001a\u00020\u000f*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003\u001a\u001e\u0010\u0010\u001a\u0004\u0018\u00010\t*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0001\u0010\u0011\u001a\u00020\u0001¨\u0006\u0012"}, d2 = {"dp2px", "", "context", "Landroid/content/Context;", "dpValue", "", "dp", "getColorInt", "getDrawable", "Landroid/graphics/drawable/Drawable;", "getLayout", "Landroid/view/View;", "parentView", "Landroid/view/ViewGroup;", "getString", "", "getTintDrawable", "color", "piece_release"}, mo238835k = 2, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.piece.b.a */
public final class C51468a {
    /* renamed from: a */
    public static final int m199486a(int i) {
        return m199491b(i);
    }

    /* renamed from: b */
    public static final int m199491b(int i) {
        Resources system = Resources.getSystem();
        Intrinsics.checkExpressionValueIsNotNull(system, "Resources.getSystem()");
        return (int) ((((float) i) * system.getDisplayMetrics().density) + 0.5f);
    }

    /* renamed from: a */
    public static final int m199485a(float f, Context context) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        return m199488a(context, f);
    }

    /* renamed from: b */
    public static final Drawable m199492b(int i, Context context) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        return ContextCompat.getDrawable(context, i);
    }

    /* renamed from: a */
    public static final int m199487a(int i, Context context) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        return ContextCompat.getColor(context, i);
    }

    /* renamed from: c */
    public static final String m199493c(int i, Context context) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        String string = context.getResources().getString(i);
        Intrinsics.checkExpressionValueIsNotNull(string, "context.resources.getString(this)");
        return string;
    }

    /* renamed from: d */
    public static final View m199494d(int i, Context context) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        View inflate = LayoutInflater.from(context).inflate(i, (ViewGroup) null, false);
        Intrinsics.checkExpressionValueIsNotNull(inflate, "LayoutInflater.from(cont…nflate(this, null, false)");
        return inflate;
    }

    /* renamed from: a */
    public static final int m199488a(Context context, float f) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        Resources resources = context.getResources();
        Intrinsics.checkExpressionValueIsNotNull(resources, "context.resources");
        return (int) ((f * resources.getDisplayMetrics().density) + 0.5f);
    }

    /* renamed from: a */
    public static final Drawable m199489a(int i, Context context, int i2) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        Drawable b = C0215a.m655b(context, i);
        if (b == null) {
            return null;
        }
        b.mutate();
        b.setTint(m199487a(i2, context));
        return b;
    }

    /* renamed from: a */
    public static final View m199490a(int i, Context context, ViewGroup viewGroup) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        View inflate = LayoutInflater.from(context).inflate(i, viewGroup, false);
        Intrinsics.checkExpressionValueIsNotNull(inflate, "LayoutInflater.from(cont…(this, parentView, false)");
        return inflate;
    }
}
