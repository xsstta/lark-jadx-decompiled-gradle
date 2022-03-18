package com.ss.android.lark.money.redpacket.history.fragment.mvp;

import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.mvp.BaseModel;
import com.ss.android.lark.chat.entity.chatter.Chatter;
import com.ss.android.lark.money.MoneyModule;
import com.ss.android.lark.money.redpacket.dto.RedPacketHistoryResponse;
import com.ss.android.lark.money.redpacket.history.fragment.mvp.AbstractC48144a;
import com.ss.android.lark.money.redpacket.p2369b.AbstractC48037a;
import com.ss.android.lark.money.redpacket.p2369b.C48040d;
import com.ss.android.lark.money_export.IMoneyModuleDependency;

/* renamed from: com.ss.android.lark.money.redpacket.history.fragment.mvp.b */
public abstract class AbstractC48148b extends BaseModel implements AbstractC48144a.AbstractC48145a {

    /* renamed from: a */
    protected AbstractC48037a f121168a = C48040d.m189602a();

    /* renamed from: b */
    protected IMoneyModuleDependency.IChatDependency f121169b = MoneyModule.getDependency().getChatDependency();

    /* renamed from: c */
    public int f121170c;

    /* renamed from: d */
    public String f121171d = "";

    /* renamed from: e */
    public boolean f121172e = true;

    /* renamed from: f */
    public volatile boolean f121173f = false;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo168546a(int i, int i2, String str, IGetDataCallback<RedPacketHistoryResponse> iGetDataCallback);

    @Override // com.larksuite.framework.mvp.BaseModel, com.larksuite.framework.mvp.ILifecycle
    public void create() {
        super.create();
    }

    @Override // com.larksuite.framework.mvp.BaseModel, com.larksuite.framework.mvp.ILifecycle
    public void destroy() {
        super.destroy();
    }

    @Override // com.ss.android.lark.money.redpacket.history.fragment.mvp.AbstractC48144a.AbstractC48145a
    /* renamed from: a */
    public boolean mo168540a() {
        if (!this.f121172e || this.f121173f) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.lark.money.redpacket.history.fragment.mvp.AbstractC48144a.AbstractC48145a
    /* renamed from: a */
    public void mo168539a(IGetDataCallback<Chatter> iGetDataCallback) {
        this.f121169b.getLoginChatter((IGetDataCallback) getCallbackManager().wrapAndAddCallback(iGetDataCallback));
    }

    @Override // com.ss.android.lark.money.redpacket.history.fragment.mvp.AbstractC48144a.AbstractC48145a
    /* renamed from: b */
    public void mo168541b(final IGetDataCallback<RedPacketHistoryResponse> iGetDataCallback) {
        this.f121173f = true;
        mo168546a(this.f121170c, 20, this.f121171d, (IGetDataCallback) getCallbackManager().wrapAndAddCallback(new IGetDataCallback<RedPacketHistoryResponse>() {
            /* class com.ss.android.lark.money.redpacket.history.fragment.mvp.AbstractC48148b.C481502 */

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                IGetDataCallback iGetDataCallback = iGetDataCallback;
                if (iGetDataCallback != null) {
                    iGetDataCallback.onError(errorResult);
                }
                AbstractC48148b.this.f121173f = false;
            }

            /* renamed from: a */
            public void onSuccess(RedPacketHistoryResponse redPacketHistoryResponse) {
                AbstractC48148b.this.f121172e = redPacketHistoryResponse.hasMore;
                AbstractC48148b.this.f121171d = redPacketHistoryResponse.nextCursor;
                IGetDataCallback iGetDataCallback = iGetDataCallback;
                if (iGetDataCallback != null) {
                    iGetDataCallback.onSuccess(redPacketHistoryResponse);
                }
                AbstractC48148b.this.f121173f = false;
            }
        }));
    }

    @Override // com.ss.android.lark.money.redpacket.history.fragment.mvp.AbstractC48144a.AbstractC48145a
    /* renamed from: a */
    public void mo168538a(final int i, final IGetDataCallback<RedPacketHistoryResponse> iGetDataCallback) {
        mo168546a(i, 20, "", (IGetDataCallback) getCallbackManager().wrapAndAddCallback(new IGetDataCallback<RedPacketHistoryResponse>() {
            /* class com.ss.android.lark.money.redpacket.history.fragment.mvp.AbstractC48148b.C481491 */

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                IGetDataCallback iGetDataCallback = iGetDataCallback;
                if (iGetDataCallback != null) {
                    iGetDataCallback.onError(errorResult);
                }
            }

            /* renamed from: a */
            public void onSuccess(RedPacketHistoryResponse redPacketHistoryResponse) {
                AbstractC48148b.this.f121170c = i;
                AbstractC48148b.this.f121172e = redPacketHistoryResponse.hasMore;
                AbstractC48148b.this.f121171d = redPacketHistoryResponse.nextCursor;
                IGetDataCallback iGetDataCallback = iGetDataCallback;
                if (iGetDataCallback != null) {
                    iGetDataCallback.onSuccess(redPacketHistoryResponse);
                }
            }
        }));
    }
}
