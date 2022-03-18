package com.ss.android.lark.applogbridge.util;

import com.bytedance.applog.C3426k;
import java.util.List;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J%\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f2\u000e\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u000fH\u0002¢\u0006\u0002\u0010\u0010J\u0012\u0010\u0011\u001a\u00020\f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0004H\u0002J \u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u00042\u000e\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0017J\u0010\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001bH\u0007R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u001a\u0010\u0006\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\n¨\u0006\u001c"}, d2 = {"Lcom/ss/android/lark/applogbridge/util/UriConfigCreator;", "", "()V", "HTTPS_PREFIX", "", "HTTP_PREFIX", "sHttpPrefix", "getSHttpPrefix", "()Ljava/lang/String;", "setSHttpPrefix", "(Ljava/lang/String;)V", "appendSendUri", "Lcom/bytedance/applog/UriConfig$Builder;", "configBuilder", "extraSendUri", "", "(Lcom/bytedance/applog/UriConfig$Builder;[Ljava/lang/String;)Lcom/bytedance/applog/UriConfig$Builder;", "createBySDKDomain", "domain", "createUriConfig", "Lcom/bytedance/applog/UriConfig;", "applogDomain", "sendDomain", "", "setHttpUrlPrefix", "", "isHttp", "", "applog-bridge_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.ss.android.lark.applogbridge.c.b */
public final class UriConfigCreator {

    /* renamed from: a */
    public static final UriConfigCreator f73091a = new UriConfigCreator();

    /* renamed from: b */
    private static String f73092b = "https://";

    private UriConfigCreator() {
    }

    @JvmStatic
    /* renamed from: a */
    public static final void m107384a(boolean z) {
        String str;
        if (z) {
            str = "http://";
        } else {
            str = "https://";
        }
        f73092b = str;
    }

    /* renamed from: a */
    private final C3426k.C3428a m107383a(String str) {
        C3426k.C3428a aVar = new C3426k.C3428a();
        aVar.mo13780a(Intrinsics.stringPlus(str, "/service/2/device_register/")).mo13783b(Intrinsics.stringPlus(str, "/service/2/app_alert_check/")).mo13785c(Intrinsics.stringPlus(str, "/service/2/log_settings/")).mo13786d(Intrinsics.stringPlus(str, "/service/2/abtest_config/"));
        return aVar;
    }

    /* renamed from: a */
    private final C3426k.C3428a m107382a(C3426k.C3428a aVar, String[] strArr) {
        boolean z;
        if (strArr != null) {
            if (strArr.length == 0) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                aVar.mo13781a(strArr);
            }
        }
        return aVar;
    }

    /* renamed from: a */
    public final C3426k mo103502a(String str, List<String> list) {
        String[] strArr = null;
        if (str != null && !StringsKt.startsWith$default(str, f73092b, false, 2, (Object) null)) {
            str = f73092b + str;
        }
        C3426k.C3428a a = m107383a(str);
        if (list != null) {
            List<String> list2 = list;
            if (list2 != null) {
                Object[] array = list2.toArray(new String[0]);
                if (array != null) {
                    strArr = (String[]) array;
                } else {
                    throw new TypeCastException("null cannot be cast to non-null type kotlin.Array<T>");
                }
            } else {
                throw new TypeCastException("null cannot be cast to non-null type java.util.Collection<T>");
            }
        }
        m107382a(a, strArr);
        C3426k a2 = a.mo13782a();
        Intrinsics.checkExpressionValueIsNotNull(a2, "uriConfigBuilder.build()");
        return a2;
    }
}
