package com.larksuite.component.openplatform.infra.network.openchatid2chatid;

import android.text.TextUtils;
import com.bytedance.ee.lark.infra.network.ref.entity.AbstractC12877d;
import com.bytedance.ee.lark.infra.network.ref.entity.C12878e;
import com.bytedance.ee.lark.infra.network.ref.entity.ECONetworkException;
import com.bytedance.ee.lark.infra.network.ref.p636b.C12868d;
import com.google.gson.Gson;

/* renamed from: com.larksuite.component.openplatform.infra.network.openchatid2chatid.b */
public class C25550b implements AbstractC12877d {
    /* renamed from: b */
    public String mo48551a(C12878e eVar, C12868d dVar) throws ECONetworkException {
        String e = dVar.mo48513e();
        if (!TextUtils.isEmpty(e)) {
            OpenIdData openIdData = (OpenIdData) new Gson().fromJson(e, OpenIdData.class);
            if (openIdData == null) {
                throw new ECONetworkException(" convert openId data null");
            } else if (eVar instanceof C25549a) {
                return ((C25549a) eVar).mo88687c().mo235487a(openIdData.getEncryptedData());
            } else {
                throw new ECONetworkException(" current context type err ");
            }
        } else {
            throw new ECONetworkException(" get response null");
        }
    }
}
