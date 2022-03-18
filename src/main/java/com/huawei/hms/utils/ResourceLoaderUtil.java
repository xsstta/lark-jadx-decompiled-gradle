package com.huawei.hms.utils;

import android.content.Context;
import android.graphics.drawable.Drawable;

public abstract class ResourceLoaderUtil {

    /* renamed from: a */
    public static Context f58974a;

    /* renamed from: b */
    public static String f58975b;

    public static Context getmContext() {
        return f58974a;
    }

    public static int getAnimId(String str) {
        return f58974a.getResources().getIdentifier(str, "anim", f58975b);
    }

    public static int getColorId(String str) {
        return f58974a.getResources().getIdentifier(str, "color", f58975b);
    }

    public static Drawable getDrawable(String str) {
        return f58974a.getResources().getDrawable(getDrawableId(str));
    }

    public static int getDrawableId(String str) {
        return f58974a.getResources().getIdentifier(str, "drawable", f58975b);
    }

    public static int getIdId(String str) {
        return f58974a.getResources().getIdentifier(str, "id", f58975b);
    }

    public static int getLayoutId(String str) {
        return f58974a.getResources().getIdentifier(str, "layout", f58975b);
    }

    public static String getString(String str) {
        return f58974a.getResources().getString(getStringId(str));
    }

    public static int getStringId(String str) {
        return f58974a.getResources().getIdentifier(str, "string", f58975b);
    }

    public static int getStyleId(String str) {
        return f58974a.getResources().getIdentifier(str, "style", f58975b);
    }

    public static void setmContext(Context context) {
        f58974a = context;
        f58975b = context.getPackageName();
    }

    public static String getString(String str, Object... objArr) {
        return f58974a.getResources().getString(getStringId(str), objArr);
    }
}
