package com.ss.android.lark.mail.impl.p2168g.p2169a;

import com.bytedance.lark.pb.email.client.v1.UnsubscribeOption;
import com.ss.android.lark.mail.impl.entity.C42098k;

/* renamed from: com.ss.android.lark.mail.impl.g.a.ai */
public class C42121ai extends C42128h<UnsubscribeOption, C42098k> {
    public C42121ai(C42129i iVar) {
        super(iVar);
    }

    /* renamed from: b */
    public UnsubscribeOption mo152040a(UnsubscribeOption unsubscribeOption, C42098k kVar) {
        super.mo152040a((Object) unsubscribeOption, (Object) kVar);
        UnsubscribeOption.C16994a aVar = new UnsubscribeOption.C16994a();
        aVar.mo60048a(UnsubscribeOption.UnsubscribeType.fromValue(kVar.mo151969a())).mo60049a(kVar.mo151972b());
        return aVar.build();
    }

    /* renamed from: a */
    public C42098k mo152042b(UnsubscribeOption unsubscribeOption, C42098k kVar) {
        super.mo152040a((Object) unsubscribeOption, (Object) kVar);
        if (kVar == null) {
            kVar = new C42098k();
        }
        if (unsubscribeOption == null) {
            kVar.mo151970a(0);
            kVar.mo151971a("");
        } else {
            kVar.mo151970a(unsubscribeOption.unsubscribeType.getValue());
            kVar.mo151971a(unsubscribeOption.redirectedUrl);
        }
        return kVar;
    }
}
