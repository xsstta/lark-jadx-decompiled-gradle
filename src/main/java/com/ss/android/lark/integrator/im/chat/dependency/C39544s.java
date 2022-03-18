package com.ss.android.lark.integrator.im.chat.dependency;

import android.content.Context;
import com.ss.android.lark.biz.core.api.AbstractC29588w;
import com.ss.android.lark.biz.core.api.MagicViewContainer;
import com.ss.android.lark.dependency.AbstractC36452ab;
import com.ss.android.lark.featuregating.C37239a;
import com.ss.android.lark.integrator.im.C39603g;
import java.util.Map;

/* renamed from: com.ss.android.lark.integrator.im.chat.dependency.s */
public class C39544s implements AbstractC36452ab {
    /* renamed from: a */
    private boolean m156359a() {
        return C37239a.m146648b().mo136951a("lark.magic.chat.enable");
    }

    @Override // com.ss.android.lark.dependency.AbstractC36452ab
    /* renamed from: a */
    public void mo134407a(String str) {
        if (m156359a()) {
            C39603g.m157159a().getCoreDependency().mo143604o(str);
        }
    }

    @Override // com.ss.android.lark.dependency.AbstractC36452ab
    /* renamed from: a */
    public void mo134408a(String str, Map<String, String> map, Context context, final AbstractC36452ab.AbstractC36453a aVar) {
        if (m156359a()) {
            C39603g.m157159a().getCoreDependency().mo143496a(str, map, new MagicViewContainer(context), new AbstractC29588w() {
                /* class com.ss.android.lark.integrator.im.chat.dependency.C39544s.C395451 */

                @Override // com.ss.android.lark.biz.core.api.AbstractC29588w
                /* renamed from: a */
                public boolean mo105896a(String str, String str2, String str3) {
                    AbstractC36452ab.AbstractC36453a aVar = aVar;
                    if (aVar == null || aVar.mo123767a()) {
                        return true;
                    }
                    return false;
                }
            });
        }
    }
}
