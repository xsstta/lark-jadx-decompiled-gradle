package com.larksuite.component.openplatform.infra.network.department;

import android.text.TextUtils;
import com.bytedance.ee.lark.infra.network.ref.entity.AbstractC12877d;
import com.bytedance.ee.lark.infra.network.ref.entity.C12878e;
import com.bytedance.ee.lark.infra.network.ref.entity.ECONetworkException;
import com.bytedance.ee.lark.infra.network.ref.p636b.C12868d;
import com.google.gson.Gson;
import com.larksuite.component.openplatform.infra.network.openchatid2chatid.C25549a;

/* renamed from: com.larksuite.component.openplatform.infra.network.department.a */
public class C25548a implements AbstractC12877d {
    /* renamed from: b */
    public String mo48551a(C12878e eVar, C12868d dVar) throws ECONetworkException {
        String e = dVar.mo48513e();
        if (!TextUtils.isEmpty(e)) {
            DepartmentIdData departmentIdData = (DepartmentIdData) new Gson().fromJson(e, DepartmentIdData.class);
            if (departmentIdData == null) {
                throw new ECONetworkException(" convert openId data null");
            } else if (eVar instanceof C25549a) {
                return ((C25549a) eVar).mo88687c().mo235487a(departmentIdData.getEncryptedData());
            } else {
                throw new ECONetworkException(" current context type err ");
            }
        } else {
            throw new ECONetworkException(" get response null");
        }
    }
}
