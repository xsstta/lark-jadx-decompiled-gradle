package com.larksuite.component.openplatform.core.plugin.infra.network;

import android.text.TextUtils;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.google.firebase.messaging.Constants;
import com.tt.frontendapiinterface.IApiInputParam;
import com.tt.miniapp.AppbrandApplicationImpl;
import com.tt.miniapp.ac.C65733b;
import com.tt.miniapp.errorcode.ApiCode;
import com.tt.miniapp.p3324r.AbstractC66694a;
import com.tt.miniapp.p3324r.C66718d;
import com.tt.miniapp.p3324r.p3325a.C66698b;
import com.tt.miniapp.p3324r.p3325a.C66712f;
import com.tt.miniapphost.entity.C67522b;
import com.tt.option.ext.AbstractC67619e;
import java.nio.ByteBuffer;
import java.util.List;
import okio.ByteString;

/* renamed from: com.larksuite.component.openplatform.core.plugin.infra.network.f */
public class C24934f extends AbstractC66694a {

    /* renamed from: b */
    private C66698b.C66699a f61064b;

    @Override // com.tt.frontendapiinterface.ApiHandler
    public String getActionName() {
        return "operateSocketTask";
    }

    public C24934f() {
    }

    /* renamed from: b */
    private void m90174b() {
        boolean z;
        try {
            z = C65733b.m257704a(getAppContext()).mo230340a(this.f61064b.f168369b, this.f61064b.f168372e, this.f61064b.f168373f);
        } catch (Exception e) {
            AppBrandLogger.stacktrace(6, "ApiOperateSocketTaskV2", e.getStackTrace());
            z = false;
        }
        C66698b.C66700b bVar = new C66698b.C66700b();
        bVar.f168374a = mo232441a(z, null);
        m90173a(bVar);
    }

    /* renamed from: a */
    private void m90172a() {
        boolean z;
        boolean z2;
        boolean z3;
        C66698b.C66700b bVar = new C66698b.C66700b();
        try {
            C67522b bVar2 = new C67522b();
            int i = this.f61064b.f168369b;
            if (!C66718d.m260519a(this.f61064b.f168370c)) {
                z = true;
            } else {
                z = false;
            }
            if (this.f61064b.f168371d != null) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z) {
                z3 = C65733b.m257704a(getAppContext()).mo230341a(i, this.f61064b.f168370c, bVar2);
            } else if (z2) {
                z3 = C65733b.m257704a(getAppContext()).mo230342a(i, m90171a(this.f61064b.f168371d), bVar2);
            } else {
                bVar2.mo234467a(paramIllegalMsg(Constants.ScionAnalytics.MessageType.DATA_MESSAGE));
                z3 = false;
            }
            if (z3) {
                AppBrandLogger.m52830i("ApiOperateSocketTaskV2", "send message success!");
                bVar.f168374a = mo232441a(true, null);
            } else {
                AppBrandLogger.m52830i("ApiOperateSocketTaskV2", "send message failed!");
                bVar.f168374a = mo232441a(false, bVar2.mo234468a());
                bVar.f168375b = Integer.valueOf(ApiCode.CONNECTSOCKET_SEND_ERROR.code);
                Throwable b = bVar2.mo234470b();
                if (b != null) {
                    bVar.f168376c = mo232440a(b);
                }
            }
        } catch (Exception e) {
            AppBrandLogger.stacktrace(6, "ApiOperateSocketTaskV2", e.getStackTrace());
            bVar.f168374a = mo232441a(false, e.getMessage());
            bVar.f168375b = Integer.valueOf(ApiCode.CONNECTSOCKET_SEND_ERROR.code);
            bVar.f168376c = mo232440a(e);
        }
        m90173a(bVar);
    }

    @Override // com.tt.frontendapiinterface.ApiHandler
    public void act() {
        if (this.f168359a == null) {
            AppBrandLogger.m52829e("ApiOperateSocketTaskV2", "input params is null");
            return;
        }
        C66698b.C66699a aVar = (C66698b.C66699a) this.f168359a;
        this.f61064b = aVar;
        try {
            String str = aVar.f168368a;
            if (TextUtils.equals(str, "send")) {
                AppBrandLogger.m52830i("ApiOperateSocketTaskV2", "operate socket send message!");
                m90172a();
            } else if (TextUtils.equals("close", str)) {
                AppBrandLogger.m52830i("ApiOperateSocketTaskV2", "operate socket close socket");
                m90174b();
            } else {
                C66698b.C66700b bVar = new C66698b.C66700b();
                bVar.f168374a = mo232441a(false, ApiCode.CONNECTSOCKET_ILLEGAL_OPERATIONTYPE.msg);
                bVar.f168375b = Integer.valueOf(ApiCode.CONNECTSOCKET_ILLEGAL_OPERATIONTYPE.code);
                AppBrandLogger.m52830i("ApiOperateSocketTaskV2", "illegal type:", str);
                m90173a(bVar);
            }
        } catch (Exception e) {
            C66698b.C66700b bVar2 = new C66698b.C66700b();
            bVar2.f168374a = mo232441a(false, null);
            m90173a(bVar2);
            AppBrandLogger.stacktrace(6, "ApiOperateSocketTaskV2", e.getStackTrace());
        }
    }

    /* renamed from: a */
    private void m90173a(C66698b.C66700b bVar) {
        AppbrandApplicationImpl.getInst(getAppContext()).getJsBridge().invokeApi(getActionName(), bVar, this.mCallBackId);
    }

    /* renamed from: a */
    private ByteString m90171a(List<C66712f> list) {
        ByteBuffer byteBuffer;
        if (list == null) {
            return null;
        }
        try {
            for (C66712f fVar : list) {
                if (fVar != null) {
                    if (TextUtils.equals(fVar.f168415a, Constants.ScionAnalytics.MessageType.DATA_MESSAGE) && (byteBuffer = fVar.f168416b) != null) {
                        return ByteString.of(byteBuffer);
                    }
                }
            }
        } catch (Exception e) {
            AppBrandLogger.stacktrace(6, "ApiOperateSocketTaskV2", e.getStackTrace());
        }
        return null;
    }

    public C24934f(IApiInputParam iApiInputParam, int i, AbstractC67619e eVar) {
        super(iApiInputParam, i, eVar);
    }
}
