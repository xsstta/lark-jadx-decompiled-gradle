package com.ss.android.lark.p1786d;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import java.lang.reflect.Field;
import java.util.WeakHashMap;

/* renamed from: com.ss.android.lark.d.c */
public class C36431c {

    /* renamed from: a */
    static int f93983a = 1;

    /* renamed from: b */
    private static final WeakHashMap<Context, Context> f93984b = new WeakHashMap<>();

    /* renamed from: com.ss.android.lark.d.c$a */
    public static class C36432a extends ContextWrapper {

        /* renamed from: a */
        Context f93985a;

        public AssetManager getAssets() {
            Context context = this.f93985a;
            if (context != null) {
                return context.getAssets();
            }
            return super.getAssets();
        }

        public Resources getResources() {
            Context context = this.f93985a;
            if (context != null) {
                return context.getResources();
            }
            return super.getResources();
        }

        public Resources.Theme getTheme() {
            Context context = this.f93985a;
            if (context != null) {
                return context.getTheme();
            }
            return super.getTheme();
        }

        public C36432a(Context context, Context context2) {
            super(context);
            this.f93985a = context2;
        }
    }

    /* renamed from: a */
    public static void m143579a() {
        WeakHashMap<Context, Context> weakHashMap = f93984b;
        synchronized (weakHashMap) {
            weakHashMap.clear();
        }
    }

    /* renamed from: a */
    public static ContextWrapper m143577a(Context context) {
        if (context == null) {
            return null;
        }
        if (context instanceof C36432a) {
            return (C36432a) context;
        }
        if (Build.VERSION.SDK_INT >= 26) {
            WeakHashMap<Context, Context> weakHashMap = f93984b;
            synchronized (weakHashMap) {
                Context context2 = weakHashMap.get(context);
                if (context2 == null) {
                    context2 = m143580b(context);
                    weakHashMap.put(context, context2);
                }
                if (context2 != null) {
                    return new C36432a(context, context2);
                }
            }
        }
        return new ContextWrapper(context);
    }

    /* renamed from: b */
    private static Context m143580b(Context context) {
        try {
            Configuration configuration = (Configuration) m143578a(context.getResources().getConfiguration());
            Field a = C36433d.m143581a(Configuration.class, "assetsSeq");
            int intValue = ((Integer) a.get(configuration)).intValue();
            int i = f93983a;
            f93983a = i + 1;
            a.set(configuration, Integer.valueOf(intValue + i));
            return context.createConfigurationContext(configuration);
        } catch (Throwable th) {
            th.printStackTrace();
            return null;
        }
    }

    /* renamed from: a */
    public static <T> T m143578a(Parcelable parcelable) {
        Throwable th;
        Parcel parcel;
        try {
            parcel = Parcel.obtain();
            try {
                parcel.writeParcelable(parcelable, 0);
                parcel.setDataPosition(0);
                T t = (T) parcel.readParcelable(parcelable.getClass().getClassLoader());
                parcel.recycle();
                return t;
            } catch (Throwable th2) {
                th = th2;
                parcel.recycle();
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            parcel = null;
            parcel.recycle();
            throw th;
        }
    }
}
