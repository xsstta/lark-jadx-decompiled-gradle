package com.bytedance.ee.bear.doc.follow.impl;

import com.bytedance.ee.bear.doc.follow.AbstractC5426c;
import com.bytedance.ee.bear.doc.follow.impl.rn.AbstractC5440a;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u000b\u0018\u0000 \u00182\u00020\u0001:\u0001\u0018B\u0005¢\u0006\u0002\u0010\u0002J\u0018\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u000bH\u0016J\b\u0010\u0011\u001a\u00020\u000eH\u0016J\u0012\u0010\u0012\u001a\u00020\u00052\b\u0010\u0013\u001a\u0004\u0018\u00010\u0006H\u0016J\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u000f\u001a\u00020\u0005H\u0016J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0016\u001a\u00020\u0005H\u0016J\u0010\u0010\u0017\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0005H\u0016R2\u0010\u0003\u001a\u001e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004j\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006`\u00078BX\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR2\u0010\n\u001a\u001e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u000b0\u0004j\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u000b`\u00078BX\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\t¨\u0006\u0019"}, d2 = {"Lcom/bytedance/ee/bear/doc/follow/impl/FollowCallbackMapUtil;", "", "()V", "callbackMap", "Ljava/util/LinkedHashMap;", "", "Lcom/bytedance/ee/bear/doc/follow/FollowInvokeCallback;", "Lkotlin/collections/LinkedHashMap;", "getCallbackMap", "()Ljava/util/LinkedHashMap;", "handleMap", "Lcom/bytedance/ee/bear/doc/follow/impl/rn/RNEventHandler;", "getHandleMap", "addEventHandler", "", "registerKey", "eventHandler", "clear", "generateCallbackId", "callback", "getEventHandler", "removeCallbackId", "callbackId", "removeEventHandler", "Companion", "document-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.doc.follow.impl.a */
public final class FollowCallbackMapUtil {

    /* renamed from: a */
    public static final Companion f15488a = new Companion(null);

    /* renamed from: d */
    private static final String f15489d = f15489d;

    /* renamed from: b */
    private final LinkedHashMap<String, AbstractC5440a> f15490b = new LinkedHashMap<>();

    /* renamed from: c */
    private final LinkedHashMap<String, AbstractC5426c> f15491c = new LinkedHashMap<>();

    @JvmStatic
    /* renamed from: a */
    public static final String m22033a(String str, String str2, String str3) {
        return f15488a.mo21764a(str, str2, str3);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J$\u0010\u0006\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u00042\u0006\u0010\t\u001a\u00020\u0004H\u0007R\u0016\u0010\u0003\u001a\u00020\u00048\u0002XD¢\u0006\b\n\u0000\u0012\u0004\b\u0005\u0010\u0002¨\u0006\n"}, d2 = {"Lcom/bytedance/ee/bear/doc/follow/impl/FollowCallbackMapUtil$Companion;", "", "()V", "ID_EMPTY", "", "ID_EMPTY$annotations", "eventRegisterKey", "token", "module", "eventType", "document-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.doc.follow.impl.a$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        /* renamed from: a */
        public final String mo21764a(String str, String str2, String str3) {
            Intrinsics.checkParameterIsNotNull(str3, "eventType");
            StringCompanionObject mVar = StringCompanionObject.f173215a;
            Locale locale = Locale.US;
            Intrinsics.checkExpressionValueIsNotNull(locale, "Locale.US");
            Object[] objArr = new Object[3];
            if (str == null) {
                str = "";
            }
            objArr[0] = str;
            if (str2 == null) {
                str2 = "";
            }
            objArr[1] = str2;
            objArr[2] = str3;
            String format = String.format(locale, "%s:%s:%s", Arrays.copyOf(objArr, 3));
            Intrinsics.checkExpressionValueIsNotNull(format, "java.lang.String.format(locale, format, *args)");
            return format;
        }
    }

    /* renamed from: b */
    private final LinkedHashMap<String, AbstractC5440a> m22034b() {
        return this.f15490b;
    }

    /* renamed from: c */
    private final LinkedHashMap<String, AbstractC5426c> m22035c() {
        return this.f15491c;
    }

    /* renamed from: a */
    public void mo21760a() {
        m22035c().clear();
        m22034b().clear();
    }

    /* renamed from: a */
    public AbstractC5426c mo21758a(String str) {
        Intrinsics.checkParameterIsNotNull(str, "callbackId");
        return m22035c().remove(str);
    }

    /* renamed from: b */
    public AbstractC5440a mo21762b(String str) {
        Intrinsics.checkParameterIsNotNull(str, "registerKey");
        return m22034b().get(str);
    }

    /* renamed from: c */
    public void mo21763c(String str) {
        Intrinsics.checkParameterIsNotNull(str, "registerKey");
        m22034b().remove(str);
    }

    /* renamed from: a */
    public String mo21759a(AbstractC5426c cVar) {
        String str = f15489d;
        if (cVar == null) {
            return str;
        }
        String hexString = Integer.toHexString(cVar.hashCode());
        Intrinsics.checkExpressionValueIsNotNull(hexString, "Integer.toHexString(callback.hashCode())");
        m22035c().put(hexString, cVar);
        return hexString;
    }

    /* renamed from: a */
    public void mo21761a(String str, AbstractC5440a aVar) {
        Intrinsics.checkParameterIsNotNull(str, "registerKey");
        Intrinsics.checkParameterIsNotNull(aVar, "eventHandler");
        m22034b().put(str, aVar);
    }
}
