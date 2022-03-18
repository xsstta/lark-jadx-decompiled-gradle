package com.bytedance.ee.larkbrand.utils;

import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.google.firebase.messaging.Constants;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, d2 = {"Lcom/bytedance/ee/larkbrand/utils/DebugUtils;", "", "()V", "Companion", "miniapp_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.bytedance.ee.larkbrand.utils.f */
public final class DebugUtils {

    /* renamed from: a */
    public static final Companion f35244a = new Companion(null);

    @JvmStatic
    /* renamed from: a */
    public static final String m54323a(boolean z, String str) {
        return Companion.m54327a(f35244a, z, str, null, null, 12, null);
    }

    @JvmStatic
    /* renamed from: a */
    public static final String m54324a(boolean z, String str, String str2) {
        return Companion.m54327a(f35244a, z, str, str2, null, 8, null);
    }

    @JvmStatic
    /* renamed from: a */
    public static final String m54325a(boolean z, String str, String str2, Integer num) {
        return f35244a.mo49648a(z, str, str2, num);
    }

    @JvmStatic
    /* renamed from: a */
    public static final void m54326a(String str, String str2) {
        f35244a.mo49649a(str, str2);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J5\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\nH\u0007¢\u0006\u0002\u0010\u000bJ\u001a\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u00042\b\u0010\u000f\u001a\u0004\u0018\u00010\u0004H\u0007¨\u0006\u0010"}, d2 = {"Lcom/bytedance/ee/larkbrand/utils/DebugUtils$Companion;", "", "()V", "getRequestInfo", "", "beforeRequest", "", "url", "desc", "code", "", "(ZLjava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)Ljava/lang/String;", "log", "", "event", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "miniapp_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.bytedance.ee.larkbrand.utils.f$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        /* renamed from: a */
        public final void mo49649a(String str, String str2) {
            Intrinsics.checkParameterIsNotNull(str, "event");
            AppBrandLogger.m52830i("LITTLE APP MONITOR", "---event=" + str + "---" + str2);
        }

        @JvmStatic
        /* renamed from: a */
        public final String mo49648a(boolean z, String str, String str2, Integer num) {
            String str3;
            Intrinsics.checkParameterIsNotNull(str, "url");
            if (z) {
                str3 = "action=start---url=" + str;
            } else {
                str3 = "action=end---url=" + str;
            }
            if (num != null) {
                str3 = str3 + "---code=" + num;
            }
            if (str2 == null) {
                return str3;
            }
            return str3 + "---error=" + str2;
        }

        /* renamed from: a */
        public static /* synthetic */ String m54327a(Companion aVar, boolean z, String str, String str2, Integer num, int i, Object obj) {
            if ((i & 4) != 0) {
                str2 = null;
            }
            if ((i & 8) != 0) {
                num = null;
            }
            return aVar.mo49648a(z, str, str2, num);
        }
    }
}
