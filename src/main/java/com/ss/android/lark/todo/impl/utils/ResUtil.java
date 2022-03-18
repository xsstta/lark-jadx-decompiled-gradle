package com.ss.android.lark.todo.impl.utils;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import com.ss.android.lark.todo.impl.framework.TodoContext;
import com.ss.android.lark.utils.UIHelper;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\b\u0006\n\u0002\u0010\u0011\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0012\u0010\u000b\u001a\u00020\f2\b\b\u0001\u0010\r\u001a\u00020\fH\u0007J\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\b\b\u0001\u0010\r\u001a\u00020\fJ\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u00112\b\b\u0001\u0010\u0012\u001a\u00020\fJ\u001e\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\f2\u0006\u0010\u0016\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0014J\"\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\f2\u0012\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00140\u0019J\u001e\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u001a\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0014J\"\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u001a\u001a\u00020\u00142\u0012\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00140\u0019J\u0016\u0010\u001b\u001a\u00020\u00142\u0006\u0010\u001c\u001a\u00020\f2\u0006\u0010\u001d\u001a\u00020\fJ\u0010\u0010\u001e\u001a\u00020\u00142\b\b\u0001\u0010\u0015\u001a\u00020\fJ\u001d\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010 2\b\b\u0001\u0010\u0015\u001a\u00020\f¢\u0006\u0002\u0010!R\u0013\u0010\u0003\u001a\u0004\u0018\u00010\u00048F¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\b8BX\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\n¨\u0006\""}, d2 = {"Lcom/ss/android/lark/todo/impl/utils/ResUtil;", "", "()V", "appContext", "Landroid/content/Context;", "getAppContext", "()Landroid/content/Context;", "resources", "Landroid/content/res/Resources;", "getResources", "()Landroid/content/res/Resources;", "getColor", "", "colorResId", "getColorStateList", "Landroid/content/res/ColorStateList;", "getDrawable", "Landroid/graphics/drawable/Drawable;", "drawableResId", "getMustacheFormatString", "", "stringResId", "key", "value", "dataMap", "", "str", "getPluralString", "pluralResId", "quantity", "getString", "getStringArray", "", "(I)[Ljava/lang/String;", "todo_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.todo.impl.b.e */
public final class ResUtil {

    /* renamed from: a */
    public static final ResUtil f139261a = new ResUtil();

    private ResUtil() {
    }

    /* renamed from: b */
    private final Resources m219606b() {
        Context a = mo191776a();
        if (a != null) {
            return a.getResources();
        }
        return null;
    }

    /* renamed from: a */
    public final Context mo191776a() {
        return new TodoContext().mo194110a();
    }

    /* renamed from: a */
    public final int mo191775a(int i) {
        Resources b = m219606b();
        if (b != null) {
            return b.getColor(i);
        }
        return 0;
    }

    /* renamed from: c */
    public final String mo191781c(int i) {
        String string;
        Resources b = m219606b();
        if (b == null || (string = b.getString(i)) == null) {
            return "";
        }
        return string;
    }

    /* renamed from: d */
    public final Drawable mo191782d(int i) {
        Resources b = m219606b();
        if (b != null) {
            return b.getDrawable(i);
        }
        return null;
    }

    /* renamed from: b */
    public final ColorStateList mo191780b(int i) {
        Resources b = m219606b();
        if (b != null) {
            return b.getColorStateList(i);
        }
        return null;
    }

    /* renamed from: a */
    public final String mo191777a(int i, int i2) {
        String quantityString;
        Resources b = m219606b();
        if (b == null || (quantityString = b.getQuantityString(i, i2, Integer.valueOf(i2))) == null) {
            return "";
        }
        return quantityString;
    }

    /* renamed from: a */
    public final String mo191779a(int i, Map<String, String> map) {
        Intrinsics.checkParameterIsNotNull(map, "dataMap");
        try {
            String mustacheFormat = UIHelper.mustacheFormat(i, map);
            Intrinsics.checkExpressionValueIsNotNull(mustacheFormat, "UIHelper.mustacheFormat(stringResId, dataMap)");
            return mustacheFormat;
        } catch (Exception unused) {
            return "";
        }
    }

    /* renamed from: a */
    public final String mo191778a(int i, String str, String str2) {
        Intrinsics.checkParameterIsNotNull(str, "key");
        Intrinsics.checkParameterIsNotNull(str2, "value");
        try {
            String mustacheFormat = UIHelper.mustacheFormat(i, str, str2);
            Intrinsics.checkExpressionValueIsNotNull(mustacheFormat, "UIHelper.mustacheFormat(stringResId, key, value)");
            return mustacheFormat;
        } catch (Exception unused) {
            return "";
        }
    }
}
