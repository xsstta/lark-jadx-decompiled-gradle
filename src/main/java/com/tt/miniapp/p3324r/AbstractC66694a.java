package com.tt.miniapp.p3324r;

import android.text.TextUtils;
import android.util.Log;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.larksuite.framework.apiplugin.LKEvent;
import com.larksuite.framework.apiplugin.entity.LKPluginHandleResult;
import com.larksuite.framework.apiplugin.p1175a.AbstractC25901l;
import com.tt.frontendapiinterface.ApiHandler;
import com.tt.frontendapiinterface.IApiInputParam;
import com.tt.option.ext.AbstractC67619e;

/* renamed from: com.tt.miniapp.r.a */
public abstract class AbstractC66694a extends ApiHandler {

    /* renamed from: a */
    public IApiInputParam f168359a;

    public AbstractC66694a() {
    }

    /* renamed from: a */
    public String mo232440a(Throwable th) {
        if (th != null) {
            return Log.getStackTraceString(th);
        }
        return "";
    }

    @Override // com.tt.frontendapiinterface.ApiHandler, com.larksuite.framework.apiplugin.AbstractC25937e, com.larksuite.framework.apiplugin.p1175a.AbstractC25899j
    public LKPluginHandleResult handleEvent(LKEvent lKEvent) {
        Object obj;
        String m = lKEvent.mo92146m();
        Object[] objArr = new Object[1];
        StringBuilder sb = new StringBuilder();
        sb.append("eventName:");
        sb.append(m);
        sb.append(" paramsLength:");
        if (lKEvent.mo92147n() != null) {
            obj = Integer.valueOf(lKEvent.mo92147n().length());
        } else {
            obj = "";
        }
        sb.append(obj);
        sb.append(" env:");
        sb.append(lKEvent.mo92141h());
        objArr[0] = sb.toString();
        AppBrandLogger.m52830i("ApiHandler", objArr);
        if (getActionName().equals(m)) {
            AbstractC25901l o = lKEvent.mo92148o();
            if (o instanceof IApiInputParam) {
                this.f168359a = (IApiInputParam) o;
            } else {
                AppBrandLogger.m52829e("ApiHandler", "input params is error.");
                return lKEvent.mo92155v();
            }
        }
        return super.handleEvent(lKEvent);
    }

    /* renamed from: a */
    public String mo232441a(boolean z, String str) {
        StringBuffer stringBuffer = new StringBuffer();
        String str2 = "ok";
        if (TextUtils.isEmpty(str)) {
            String actionName = getActionName();
            if (!z) {
                str2 = "fail";
            }
            stringBuffer.append(buildErrorMsg(actionName, str2));
        } else {
            StringBuilder sb = new StringBuilder();
            String actionName2 = getActionName();
            if (!z) {
                str2 = "fail";
            }
            sb.append(buildErrorMsg(actionName2, str2));
            sb.append(" ");
            sb.append(str);
            stringBuffer.append(sb.toString());
        }
        return stringBuffer.toString();
    }

    public AbstractC66694a(IApiInputParam iApiInputParam, int i, AbstractC67619e eVar) {
        super("", i, eVar);
        this.f168359a = iApiInputParam;
    }
}
