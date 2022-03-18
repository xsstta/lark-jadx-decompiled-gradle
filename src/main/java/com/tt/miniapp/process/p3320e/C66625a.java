package com.tt.miniapp.process.p3320e;

import android.text.TextUtils;
import com.tt.frontendapiinterface.ApiHandler;
import com.tt.frontendapiinterface.IApiInputParam;
import com.tt.frontendapiinterface.IApiOutputParam;
import com.tt.miniapp.process.p3316a.C66612a;
import com.tt.miniapphost.AbstractC67550j;
import com.tt.miniapphost.AppbrandContext;
import com.tt.miniapphost.process.data.CrossProcessDataEntity;
import com.tt.miniapphost.process.extra.ICrossProcessOperator;
import com.tt.miniapphost.process.p3376b.AbstractC67565b;
import com.tt.miniapphost.util.ProcessUtil;

/* renamed from: com.tt.miniapp.process.e.a */
public class C66625a {
    /* renamed from: a */
    private static boolean m260274a(ICrossProcessOperator iCrossProcessOperator) {
        return "hostProcess".equals(iCrossProcessOperator.operateProcessIdentify());
    }

    /* renamed from: a */
    public static void m260273a(final ApiHandler apiHandler) {
        if (!m260274a((ICrossProcessOperator) apiHandler) || ProcessUtil.isMainProcess(AppbrandContext.getInst().getApplicationContext())) {
            apiHandler.doAct();
        } else {
            C66612a.m260225a(apiHandler.getActionName(), apiHandler.mArgs, new AbstractC67565b() {
                /* class com.tt.miniapp.process.p3320e.C66625a.C666261 */

                @Override // com.tt.miniapphost.process.p3376b.AbstractC67565b
                /* renamed from: a */
                public void mo48980a(CrossProcessDataEntity crossProcessDataEntity) {
                    String str;
                    if (crossProcessDataEntity != null) {
                        str = crossProcessDataEntity.mo234744b("apiExecuteResult");
                    } else {
                        str = null;
                    }
                    if (TextUtils.isEmpty(str)) {
                        str = apiHandler.makeMsgByResult(false, null, null).toString();
                    }
                    apiHandler.callbackOnOriginProcess(str);
                }
            });
        }
    }

    /* renamed from: a */
    public static IApiOutputParam m260271a(AbstractC67550j jVar, IApiInputParam iApiInputParam, AbstractC67550j.AbstractC67551a aVar) throws Exception {
        return jVar.mo49105a(iApiInputParam, aVar);
    }

    /* renamed from: a */
    public static String m260272a(AbstractC67550j jVar, String str, AbstractC67550j.AbstractC67551a aVar) throws Exception {
        return jVar.mo49104a(str, aVar);
    }
}
