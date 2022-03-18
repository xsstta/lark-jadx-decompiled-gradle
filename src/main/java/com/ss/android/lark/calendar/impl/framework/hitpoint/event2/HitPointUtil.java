package com.ss.android.lark.calendar.impl.framework.hitpoint.event2;

import android.text.TextUtils;
import com.bytedance.ee.util.p700c.C13598b;
import java.util.ArrayList;
import java.util.Collection;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u001f\n\u0002\u0018\u0002\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0007\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0004J\u0017\u0010\t\u001a\u00020\u00042\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0007¢\u0006\u0002\u0010\fJ\"\u0010\r\u001a\u00020\u000e\"\u0004\b\u0000\u0010\u000f2\u0012\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u000f0\u00120\u0011H\u0007J\u0010\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u000eH\u0007J\u0012\u0010\u0015\u001a\u00020\u00042\b\u0010\u0016\u001a\u0004\u0018\u00010\u0004H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Lcom/ss/android/lark/calendar/impl/framework/hitpoint/event2/HitPointUtil;", "", "()V", "FALSE", "", "NO_VALUE", "TRUE", "encryptText", "token", "getBooleanStr", "bool", "", "(Ljava/lang/Boolean;)Ljava/lang/String;", "getSize", "", "T", "target", "", "Ljava/util/ArrayList;", "getViewType", "modelIndex", "getWrapperValue", "nullableStr", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.framework.hitpoint.c.l */
public final class HitPointUtil {

    /* renamed from: a */
    public static final HitPointUtil f83371a = new HitPointUtil();

    @JvmStatic
    /* renamed from: a */
    public static final String m124398a(int i) {
        return i != 0 ? i != 1 ? i != 2 ? i != 3 ? "threeday" : "month" : "list" : "day" : "threeday";
    }

    private HitPointUtil() {
    }

    @JvmStatic
    /* renamed from: a */
    public static final String m124400a(String str) {
        if (!TextUtils.isEmpty(str) && str != null) {
            return str;
        }
        return "no_value";
    }

    @JvmStatic
    /* renamed from: a */
    public static final <T> int m124397a(Collection<ArrayList<T>> collection) {
        Intrinsics.checkParameterIsNotNull(collection, "target");
        int i = 0;
        for (ArrayList<T> arrayList : collection) {
            i += arrayList.size();
        }
        return i;
    }

    @JvmStatic
    /* renamed from: a */
    public static final String m124399a(Boolean bool) {
        if (Intrinsics.areEqual((Object) bool, (Object) true)) {
            return "true";
        }
        return "false";
    }

    /* renamed from: b */
    public final String mo118765b(String str) {
        boolean z;
        if (str == null) {
            return "no_value";
        }
        if (str.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return "no_value";
        }
        StringBuilder sb = new StringBuilder();
        sb.append("08a441");
        sb.append(C13598b.m55195b(str + "42b91e"));
        String c = C13598b.m55196c(sb.toString());
        if (c != null) {
            return c;
        }
        return "no_value";
    }
}
