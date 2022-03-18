package com.ss.android.lark.calendar.impl.framework.hitpoint.event;

import android.text.TextUtils;
import com.bytedance.ee.util.p700c.C13598b;
import com.ss.android.lark.calendar.impl.features.events.detail.videoUrl.entity.VideoType;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0002J\u0018\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0007J\u0017\u0010\u000b\u001a\u00020\u00042\b\u0010\f\u001a\u0004\u0018\u00010\nH\u0007¢\u0006\u0002\u0010\rJ\u0012\u0010\u000e\u001a\u00020\u00042\b\u0010\u000f\u001a\u0004\u0018\u00010\u0004H\u0007J\u0010\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u0004H\u0002J\u0010\u0010\u0011\u001a\u00020\u00042\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013J\u0012\u0010\u0014\u001a\u00020\u00042\b\u0010\u0015\u001a\u0004\u0018\u00010\u0004H\u0007¨\u0006\u0016"}, d2 = {"Lcom/ss/android/lark/calendar/impl/framework/hitpoint/event/HitPointUtil;", "", "()V", "encryptTea", "", "token", "getArrangeHitPointChatType", ShareHitPoint.f121868c, "", "isFromP2P", "", "getBooleanStr", "bool", "(Ljava/lang/Boolean;)Ljava/lang/String;", "getFileId", "url", "getUrlToken", "getVCTypeHitString", "vcType", "Lcom/ss/android/lark/calendar/impl/features/events/detail/videoUrl/entity/VideoType;", "getWrapperValue", "nullableStr", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.framework.hitpoint.b.e */
public final class HitPointUtil {

    /* renamed from: a */
    public static final HitPointUtil f83349a = new HitPointUtil();

    @JvmStatic
    /* renamed from: a */
    public static final String m124311a(int i, boolean z) {
        return i == 2 ? z ? "single" : "group" : "";
    }

    private HitPointUtil() {
    }

    @JvmStatic
    /* renamed from: b */
    public static final String m124314b(String str) {
        if (!TextUtils.isEmpty(str) && str != null) {
            return str;
        }
        return "no_value";
    }

    @JvmStatic
    /* renamed from: a */
    public static final String m124312a(Boolean bool) {
        if (Intrinsics.areEqual((Object) bool, (Object) true)) {
            return "true";
        }
        return "false";
    }

    @JvmStatic
    /* renamed from: a */
    public static final String m124313a(String str) {
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
        HitPointUtil eVar = f83349a;
        return eVar.m124316d(eVar.m124315c(str));
    }

    /* renamed from: c */
    private final String m124315c(String str) {
        int lastIndexOf$default = StringsKt.lastIndexOf$default((CharSequence) str, '/', 0, false, 6, (Object) null);
        if (lastIndexOf$default == -1) {
            return "no_value";
        }
        int i = lastIndexOf$default + 1;
        if (str != null) {
            String substring = str.substring(i);
            Intrinsics.checkExpressionValueIsNotNull(substring, "(this as java.lang.String).substring(startIndex)");
            return substring;
        }
        throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
    }

    /* renamed from: d */
    private final String m124316d(String str) {
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

    /* renamed from: a */
    public final String mo118740a(VideoType videoType) {
        if (videoType == null) {
            return "unknown";
        }
        int i = C32499f.f83350a[videoType.ordinal()];
        if (i == 1) {
            return "lark_vc";
        }
        if (i == 2) {
            return "custom_vc";
        }
        if (i == 3) {
            return "no_vc";
        }
        if (i != 4) {
            return "unknown";
        }
        return "lark_livestream";
    }
}
