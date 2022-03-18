package com.bumptech.glide.load.resource.p091b;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import androidx.appcompat.p017a.p018a.C0215a;
import androidx.appcompat.view.ContextThemeWrapper;
import androidx.core.content.ContextCompat;
import androidx.core.content.res.C0760e;

/* renamed from: com.bumptech.glide.load.resource.b.a */
public final class C2401a {

    /* renamed from: a */
    private static volatile boolean f7944a = true;

    /* renamed from: a */
    public static Drawable m10161a(Context context, int i, Resources.Theme theme) {
        return m10163a(context, context, i, theme);
    }

    /* renamed from: a */
    public static Drawable m10162a(Context context, Context context2, int i) {
        return m10163a(context, context2, i, null);
    }

    /* renamed from: b */
    private static Drawable m10164b(Context context, int i, Resources.Theme theme) {
        if (theme != null) {
            context = new ContextThemeWrapper(context, theme);
        }
        return C0215a.m655b(context, i);
    }

    /* renamed from: c */
    private static Drawable m10165c(Context context, int i, Resources.Theme theme) {
        return C0760e.m3682a(context.getResources(), i, theme);
    }

    /* renamed from: a */
    private static Drawable m10163a(Context context, Context context2, int i, Resources.Theme theme) {
        try {
            if (f7944a) {
                return m10164b(context2, i, theme);
            }
        } catch (NoClassDefFoundError unused) {
            f7944a = false;
        } catch (IllegalStateException e) {
            if (!context.getPackageName().equals(context2.getPackageName())) {
                return ContextCompat.getDrawable(context2, i);
            }
            throw e;
        } catch (Resources.NotFoundException unused2) {
        }
        if (theme == null) {
            theme = context2.getTheme();
        }
        return m10165c(context2, i, theme);
    }
}
