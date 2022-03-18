package com.ss.android.lark.money.redpacket.send;

import android.content.Context;
import android.text.TextUtils;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.mvp.BaseModel;
import com.ss.android.lark.chat.entity.message.content.RedPacketContent;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.money.MoneyModule;
import com.ss.android.lark.money.p2367c.C48033a;
import com.ss.android.lark.money.redpacket.dto.SendRedPacketResponse;
import com.ss.android.lark.money.redpacket.p2369b.AbstractC48037a;
import com.ss.android.lark.money.redpacket.p2369b.C48040d;
import com.ss.android.lark.money.redpacket.send.C48173a;
import com.ss.android.lark.money_export.IMoneyModuleDependency;

/* renamed from: com.ss.android.lark.money.redpacket.send.e */
public class C48181e extends BaseModel implements C48173a.AbstractC48174a {

    /* renamed from: a */
    public String f121236a;

    /* renamed from: b */
    private final String f121237b;

    /* renamed from: c */
    private final String f121238c;

    /* renamed from: d */
    private boolean f121239d;

    /* renamed from: e */
    private String f121240e;

    /* renamed from: f */
    private AbstractC48037a f121241f = C48040d.m189602a();

    /* renamed from: g */
    private IMoneyModuleDependency.ILoginDependency f121242g = MoneyModule.getDependency().getLoginDependency();

    /* renamed from: h */
    private IMoneyModuleDependency.IAuditDependency f121243h = MoneyModule.getDependency().getAuditDependency();

    @Override // com.ss.android.lark.money.redpacket.send.C48173a.AbstractC48174a
    /* renamed from: a */
    public String mo168621a() {
        return this.f121237b;
    }

    @Override // com.ss.android.lark.money.redpacket.send.C48173a.AbstractC48174a
    /* renamed from: b */
    public String mo168626b() {
        return this.f121238c;
    }

    @Override // com.ss.android.lark.money.redpacket.send.C48173a.AbstractC48174a
    /* renamed from: c */
    public String mo168627c() {
        return this.f121243h.getUserAuthorityControledTip();
    }

    @Override // com.ss.android.lark.money.redpacket.send.C48173a.AbstractC48174a
    /* renamed from: a */
    public boolean mo168625a(ErrorResult errorResult) {
        if (errorResult == null) {
            return false;
        }
        int errorCode = errorResult.getErrorCode();
        if (errorCode == this.f121243h.getLoginUserAuthorityDeniedCode() || errorCode == this.f121243h.getOtherUserAuthorityDeniedCode()) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.lark.money.redpacket.send.C48173a.AbstractC48174a
    /* renamed from: a */
    public void mo168623a(final IGetDataCallback<String> iGetDataCallback) {
        if (TextUtils.isEmpty(this.f121236a)) {
            this.f121241f.mo168218a((IGetDataCallback) getCallbackManager().wrapAndAddCallback(new IGetDataCallback<String>() {
                /* class com.ss.android.lark.money.redpacket.send.C48181e.C481821 */

                @Override // com.larksuite.framework.callback.IGetDataCallback
                public void onError(ErrorResult errorResult) {
                    IGetDataCallback iGetDataCallback = iGetDataCallback;
                    if (iGetDataCallback != null) {
                        iGetDataCallback.onError(errorResult);
                    }
                }

                /* renamed from: a */
                public void onSuccess(String str) {
                    C48181e.this.f121236a = str;
                    IGetDataCallback iGetDataCallback = iGetDataCallback;
                    if (iGetDataCallback != null) {
                        iGetDataCallback.onSuccess(C48181e.this.f121236a);
                    }
                }
            }));
        } else if (iGetDataCallback != null) {
            iGetDataCallback.onSuccess(this.f121236a);
        }
    }

    @Override // com.ss.android.lark.money.redpacket.send.C48173a.AbstractC48174a
    /* renamed from: a */
    public void mo168622a(Context context, String str) {
        this.f121243h.onUserAuthorityDenied(context, str);
    }

    public C48181e(boolean z, String str, String str2, String str3) {
        this.f121239d = z;
        this.f121240e = str;
        this.f121237b = str2;
        this.f121238c = str3;
    }

    @Override // com.ss.android.lark.money.redpacket.send.C48173a.AbstractC48174a
    /* renamed from: a */
    public void mo168624a(boolean z, double d, int i, String str, Long l, final IGetDataCallback<C48178c> iGetDataCallback) {
        RedPacketContent.Type type;
        boolean z2;
        long b = C48033a.m189578b(d);
        if (!this.f121239d) {
            type = RedPacketContent.Type.P2P;
        } else if (z) {
            type = RedPacketContent.Type.GROUP_RANDOM;
        } else {
            type = RedPacketContent.Type.GROUP_FIX;
        }
        if (this.f121242g.isPrimaryHost() || MoneyModule.getDependency().getFeatureGatingDependency().isEnable("hongbao.pay.balance")) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.f121241f.mo168217a(b, i, str, type, this.f121240e, C48179d.m190180a(z2), l, (IGetDataCallback) getCallbackManager().wrapAndAddCallback(new IGetDataCallback<SendRedPacketResponse>() {
            /* class com.ss.android.lark.money.redpacket.send.C48181e.C481832 */

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                IGetDataCallback iGetDataCallback = iGetDataCallback;
                if (iGetDataCallback != null) {
                    iGetDataCallback.onError(errorResult);
                }
            }

            /* renamed from: a */
            public void onSuccess(SendRedPacketResponse aVar) {
                Log.m165379d("SendRedPacketModel", "createRedPacket payUrl: " + aVar.mo168500a());
                if (iGetDataCallback != null) {
                    C48178c a = C48179d.m190179a(aVar.mo168500a(), aVar.mo168501b());
                    if (a == null) {
                        iGetDataCallback.onError(new ErrorResult("invalid payUrl"));
                    } else {
                        iGetDataCallback.onSuccess(a);
                    }
                }
            }
        }));
    }
}
