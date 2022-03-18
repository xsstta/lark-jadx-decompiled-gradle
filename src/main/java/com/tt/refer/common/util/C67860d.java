package com.tt.refer.common.util;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.lark.infra.network.larkbrand.net.RustNetworkLevel;
import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.larksuite.component.openplatform.core.plugin.infra.network.AbstractC24950r;
import com.tt.refer.common.service.net.AbstractC67854b;
import com.tt.refer.common.service.net.entity.OpNetworkQualityType;
import com.tt.refer.common.service.net.entity.TTNetNetworkQualityLevel;
import com.tt.refer.p3400a.p3408f.AbstractC67724a;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.tt.refer.common.util.d */
public class C67860d {

    /* renamed from: a */
    public static OpNetworkQualityType f170916a;

    /* renamed from: b */
    private static Map<AbstractC24950r, AbstractC67854b> f170917b = new ConcurrentHashMap();

    /* access modifiers changed from: package-private */
    /* renamed from: com.tt.refer.common.util.d$2 */
    public static /* synthetic */ class C678622 {

        /* renamed from: a */
        static final /* synthetic */ int[] f170920a;

        /* JADX WARNING: Can't wrap try/catch for region: R(20:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|(3:19|20|22)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(22:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|22) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0049 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0054 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0060 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x006c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
            // Method dump skipped, instructions count: 121
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tt.refer.common.util.C67860d.C678622.<clinit>():void");
        }
    }

    /* renamed from: a */
    public static OpNetworkQualityType m263999a(IAppContext iAppContext) {
        if (iAppContext == null) {
            AppBrandLogger.m52829e("NetworkQualityUtil", " current appcontext is null");
            return null;
        }
        Context applicationContext = iAppContext.getApplicationContext();
        if (applicationContext != null) {
            String a = NetworkUtil.m264004a(applicationContext);
            if (TextUtils.equals(a, "none")) {
                return OpNetworkQualityType.UNAVAILABLE;
            }
            AppBrandLogger.m52830i("NetworkQualityUtil", " current network status " + a);
        }
        return m263998a(((AbstractC67724a) iAppContext.findServiceByInterface(AbstractC67724a.class)).mo50435a(), ((AbstractC67724a) iAppContext.findServiceByInterface(AbstractC67724a.class)).mo50457c());
    }

    /* renamed from: b */
    public static void m264001b(IAppContext iAppContext, AbstractC24950r rVar) {
        if (rVar == null || iAppContext == null) {
            boolean z = true;
            Object[] objArr = new Object[1];
            StringBuilder sb = new StringBuilder();
            sb.append(" unRegisterListener fail , listener is null ");
            if (rVar != null) {
                z = false;
            }
            sb.append(z);
            objArr[0] = sb.toString();
            AppBrandLogger.m52829e("NetworkQualityUtil", objArr);
            return;
        }
        AbstractC67854b remove = f170917b.remove(rVar);
        if (remove != null) {
            ((AbstractC67724a) iAppContext.findServiceByInterface(AbstractC67724a.class)).mo50454b(remove);
        }
    }

    /* renamed from: a */
    public static void m264000a(final IAppContext iAppContext, final AbstractC24950r rVar) {
        if (rVar == null || iAppContext == null) {
            boolean z = true;
            Object[] objArr = new Object[1];
            StringBuilder sb = new StringBuilder();
            sb.append(" registerListener fail , listener is null ");
            if (rVar != null) {
                z = false;
            }
            sb.append(z);
            objArr[0] = sb.toString();
            AppBrandLogger.m52829e("NetworkQualityUtil", objArr);
        } else if (!f170917b.containsKey(rVar)) {
            C678611 r0 = new AbstractC67854b() {
                /* class com.tt.refer.common.util.C67860d.C678611 */

                @Override // com.tt.refer.common.service.net.AbstractC67854b
                /* renamed from: a */
                public void mo235489a(int i) {
                    int c = ((AbstractC67724a) iAppContext.findServiceByInterface(AbstractC67724a.class)).mo50457c();
                    OpNetworkQualityType a = C67860d.m263998a(i, c);
                    if (C67860d.f170916a == null || a != C67860d.f170916a) {
                        C67860d.f170916a = a;
                        rVar.mo88036a(iAppContext, a);
                    }
                    AppBrandLogger.m52830i("NetworkQualityUtil", " rust change " + i + " ttnet " + c + " final " + a.getNetworkQuality());
                }

                @Override // com.tt.refer.common.service.net.AbstractC67854b
                /* renamed from: b */
                public void mo235490b(int i) {
                    int a = ((AbstractC67724a) iAppContext.findServiceByInterface(AbstractC67724a.class)).mo50435a();
                    OpNetworkQualityType a2 = C67860d.m263998a(a, i);
                    if (C67860d.f170916a == null || a2 != C67860d.f170916a) {
                        C67860d.f170916a = a2;
                        rVar.mo88036a(iAppContext, a2);
                    }
                    AppBrandLogger.m52830i("NetworkQualityUtil", " ttnet change " + i + " rust " + a + " final " + a2.getNetworkQuality());
                }
            };
            ((AbstractC67724a) iAppContext.findServiceByInterface(AbstractC67724a.class)).mo50445a(r0);
            f170917b.put(rVar, r0);
        }
    }

    /* renamed from: a */
    public static OpNetworkQualityType m263998a(int i, int i2) {
        AppBrandLogger.m52830i("NetworkQualityUtil", "evaluate network quality type   rustType " + i + " ttnetType " + i2);
        RustNetworkLevel forNumber = RustNetworkLevel.forNumber(i);
        TTNetNetworkQualityLevel forNumber2 = TTNetNetworkQualityLevel.forNumber(i2);
        OpNetworkQualityType opNetworkQualityType = OpNetworkQualityType.UNKNOWN;
        if (forNumber == RustNetworkLevel.SERVICE_UNAVAILABLE || forNumber == RustNetworkLevel.NET_UNAVAILABLE || forNumber == RustNetworkLevel.OFFLINE) {
            switch (C678622.f170920a[forNumber2.ordinal()]) {
                case 1:
                case 2:
                case 3:
                    return OpNetworkQualityType.UNAVAILABLE;
                case 4:
                case 5:
                case 6:
                    return OpNetworkQualityType.WEAK;
                case 7:
                case 8:
                case 9:
                case 10:
                    return OpNetworkQualityType.MODERATE;
            }
        } else if (forNumber == RustNetworkLevel.WEAK) {
            switch (C678622.f170920a[forNumber2.ordinal()]) {
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                    return OpNetworkQualityType.WEAK;
                case 7:
                case 8:
                case 9:
                case 10:
                    return OpNetworkQualityType.MODERATE;
            }
        } else if (forNumber == RustNetworkLevel.EXCELLENT) {
            switch (C678622.f170920a[forNumber2.ordinal()]) {
                case 1:
                case 2:
                case 4:
                case 5:
                case 6:
                    return OpNetworkQualityType.WEAK;
                case 3:
                case 9:
                case 10:
                    return OpNetworkQualityType.EXCELLENT;
                case 7:
                case 8:
                    return OpNetworkQualityType.MODERATE;
            }
        } else if (forNumber == RustNetworkLevel.UNKNOWN || forNumber == RustNetworkLevel.EVALUATING) {
            switch (C678622.f170920a[forNumber2.ordinal()]) {
                case 1:
                case 2:
                    return OpNetworkQualityType.UNAVAILABLE;
                case 3:
                    return OpNetworkQualityType.UNKNOWN;
                case 4:
                case 5:
                case 6:
                    return OpNetworkQualityType.WEAK;
                case 7:
                case 8:
                    return OpNetworkQualityType.MODERATE;
                case 9:
                case 10:
                    return OpNetworkQualityType.EXCELLENT;
            }
        }
        return opNetworkQualityType;
    }
}
