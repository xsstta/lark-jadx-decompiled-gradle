package com.bytedance.ee.android.file.picker.lib.utils;

import android.content.Context;
import android.text.TextUtils;
import com.samskivert.mustache.C27035d;
import java.util.HashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J*\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\u00042\b\u0010\n\u001a\u0004\u0018\u00010\u0004J,\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0014\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010\fJ\"\u0010\u0003\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u00042\b\u0010\t\u001a\u0004\u0018\u00010\u00042\b\u0010\n\u001a\u0004\u0018\u00010\u0004J&\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\r\u001a\u00020\u00042\u0014\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010\f¨\u0006\u000e"}, d2 = {"Lcom/bytedance/ee/android/file/picker/lib/utils/TemplateUtils;", "", "()V", "mustacheFormat", "", "context", "Landroid/content/Context;", "stringResId", "", "key", "value", "dataMap", "", "template", "file-picker-lib_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.bytedance.ee.android.file.picker.lib.utils.i */
public final class TemplateUtils {

    /* renamed from: a */
    public static final TemplateUtils f12481a = new TemplateUtils();

    private TemplateUtils() {
    }

    /* renamed from: a */
    public final String mo16117a(Context context, int i, Map<String, String> map) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        String string = context.getString(i);
        Intrinsics.checkExpressionValueIsNotNull(string, "context.getString(stringResId)");
        if (TextUtils.isEmpty(string) || map == null || map.isEmpty()) {
            return string;
        }
        String a = C27035d.m98270a().mo96186a(string).mo96212a(map);
        Intrinsics.checkExpressionValueIsNotNull(a, "tmpl.execute(dataMap)");
        return a;
    }

    /* renamed from: a */
    public final String mo16116a(Context context, int i, String str, String str2) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        String string = context.getString(i);
        Intrinsics.checkExpressionValueIsNotNull(string, "context.getString(stringResId)");
        if (str == null || str2 == null) {
            return string;
        }
        HashMap hashMap = new HashMap(1);
        hashMap.put(str, str2);
        String a = C27035d.m98270a().mo96186a(string).mo96212a(hashMap);
        Intrinsics.checkExpressionValueIsNotNull(a, "tmpl.execute(dataMap)");
        return a;
    }
}
