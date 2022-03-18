package com.bytedance.ee.bear.lynx.impl.utli;

import android.text.TextUtils;
import com.bytedance.ee.bear.contract.al;
import com.bytedance.ee.util.p701d.C13616d;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\b\u001a\u00020\u0004J\u0006\u0010\t\u001a\u00020\u0004R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u000e¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/bytedance/ee/bear/lynx/impl/utli/LynxResourceConstant;", "", "()V", "LYNX_RESOURCE_CHANNEL", "", "infoProviderService", "Lcom/bytedance/ee/bear/contract/InfoProvideService;", "resourceHost", "getResourceHost", "getResourcePrefix", "lynx-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.lynx.impl.c.f */
public final class LynxResourceConstant {

    /* renamed from: a */
    public static final LynxResourceConstant f23773a = new LynxResourceConstant();

    /* renamed from: b */
    private static final al f23774b = ((al) ServiceDependence.f23778b.mo33929a(al.class));

    /* renamed from: c */
    private static String f23775c = "";

    private LynxResourceConstant() {
    }

    /* renamed from: b */
    public final String mo33925b() {
        if (C13616d.m55261a()) {
            return "internal/ccm/lynx";
        }
        return "online/ccm/lynx";
    }

    /* renamed from: a */
    public final String mo33924a() {
        String str;
        if (TextUtils.isEmpty(f23775c)) {
            boolean F = f23774b.mo17345F();
            boolean a = C13616d.m55261a();
            if (F) {
                if (a) {
                    str = "https://tosv.byted.org/obj/gecko-internal-sg/";
                } else {
                    str = "https://lf16-sourcecdn-tos.ibytedtos.com/obj/byte-gurd-source-sg/";
                }
            } else if (a) {
                str = "https://tosv.byted.org/obj/gecko-internal/";
            } else {
                str = "https://lf-sourcecdn-tos.bytegecko.com/obj/byte-gurd-source/";
            }
            f23775c = str;
            f23775c += mo33925b() + "/docs_lynx_channel";
        }
        return f23775c;
    }
}
