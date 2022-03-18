package com.ss.android.lark.money.redpacket.send;

import android.content.Context;
import android.text.TextUtils;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.callback.UIGetDataCallback;
import com.larksuite.framework.mvp.BasePresenter;
import com.larksuite.suite.R;
import com.ss.android.lark.chat.entity.redpacket.RedPacketCover;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.money.redpacket.p2369b.C48040d;
import com.ss.android.lark.money.redpacket.send.C48173a;
import com.ss.android.lark.money.redpacket.send.SendRedPacketView;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.lark.utils.statistics.PerfLog;
import java.lang.ref.WeakReference;

/* renamed from: com.ss.android.lark.money.redpacket.send.f */
public class C48184f extends BasePresenter<C48173a.AbstractC48174a, C48173a.AbstractC48175b, C48173a.AbstractC48175b.AbstractC48176a> {
    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C48173a.AbstractC48175b.AbstractC48176a createViewDelegate() {
        return new C48187b();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.lark.money.redpacket.send.f$a */
    public static class RunnableC48186a implements Runnable {

        /* renamed from: a */
        private final WeakReference<C48173a.AbstractC48175b> f121248a;

        public void run() {
            C48173a.AbstractC48175b bVar = this.f121248a.get();
            if (bVar != null) {
                bVar.mo168599b();
            }
        }

        RunnableC48186a(C48173a.AbstractC48175b bVar) {
            this.f121248a = new WeakReference<>(bVar);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.lark.money.redpacket.send.f$b */
    public class C48187b implements C48173a.AbstractC48175b.AbstractC48176a {
        private C48187b() {
        }

        @Override // com.ss.android.lark.money.redpacket.send.C48173a.AbstractC48175b.AbstractC48176a
        /* renamed from: a */
        public void mo168628a(Context context, boolean z, double d, int i, String str, Long l) {
            ((C48173a.AbstractC48175b) C48184f.this.getView()).mo168591a();
            m190198b(context, z, d, i, str, l);
        }

        /* renamed from: b */
        private void m190198b(final Context context, final boolean z, final double d, final int i, final String str, final Long l) {
            final String contextId = PerfLog.getContextId();
            PerfLog.start("async_get_pay_token", contextId, "");
            ((C48173a.AbstractC48174a) C48184f.this.getModel()).mo168623a(new UIGetDataCallback(new IGetDataCallback<String>() {
                /* class com.ss.android.lark.money.redpacket.send.C48184f.C48187b.C481881 */

                /* renamed from: a */
                public void onSuccess(final String str) {
                    PerfLog.end("async_get_pay_token", contextId, "");
                    PerfLog.start("async_call_send_hongbao", contextId, "");
                    ((C48173a.AbstractC48174a) C48184f.this.getModel()).mo168624a(z, d, i, str, l, new UIGetDataCallback(new IGetDataCallback<C48178c>() {
                        /* class com.ss.android.lark.money.redpacket.send.C48184f.C48187b.C481881.C481891 */

                        @Override // com.larksuite.framework.callback.IGetDataCallback
                        public void onError(ErrorResult errorResult) {
                            Log.m165397w("SendRedPacketPresenter", "createRedPacket: onError: " + errorResult);
                            ((C48173a.AbstractC48175b) C48184f.this.getView()).mo168599b();
                            C48184f.this.mo168633a(context, errorResult);
                            PerfLog.end("async_call_send_hongbao", contextId, "");
                        }

                        /* renamed from: a */
                        public void onSuccess(C48178c cVar) {
                            PerfLog.end("async_call_send_hongbao", contextId, "");
                            PerfLog.start("call_cjpay_single", contextId, "");
                            ((C48173a.AbstractC48175b) C48184f.this.getView()).mo168597a(str, C48040d.m189602a().mo168233b(), cVar, new RunnableC48186a((C48173a.AbstractC48175b) C48184f.this.getView()));
                            PerfLog.end("call_cjpay_single", contextId, "");
                        }
                    }));
                }

                @Override // com.larksuite.framework.callback.IGetDataCallback
                public void onError(ErrorResult errorResult) {
                    Log.m165397w("SendRedPacketPresenter", "getPayToken: onError: " + errorResult);
                    ((C48173a.AbstractC48175b) C48184f.this.getView()).mo168595a(errorResult.getDisplayMsg(UIHelper.getString(R.string.Lark_Legacy_SendRedPacketFailed)));
                    ((C48173a.AbstractC48175b) C48184f.this.getView()).mo168599b();
                }
            }));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo168634a(RedPacketCover redPacketCover) {
        ((C48173a.AbstractC48175b) getView()).mo168593a(redPacketCover);
    }

    /* renamed from: a */
    public void mo168633a(Context context, ErrorResult errorResult) {
        if (((C48173a.AbstractC48174a) getModel()).mo168625a(errorResult)) {
            String c = ((C48173a.AbstractC48174a) getModel()).mo168627c();
            if (!TextUtils.isEmpty(errorResult.getDisplayMsg())) {
                c = errorResult.getDisplayMsg();
            }
            ((C48173a.AbstractC48174a) getModel()).mo168622a(context, c);
            return;
        }
        switch (errorResult.getErrorCode()) {
            case 260000:
                ((C48173a.AbstractC48175b) getView()).mo168592a(R.string.Lark_NewContacts_CantSendHongbaoDueToBlockOthers);
                return;
            case 260001:
            case 260002:
                ((C48173a.AbstractC48175b) getView()).mo168596a(((C48173a.AbstractC48174a) getModel()).mo168621a(), ((C48173a.AbstractC48174a) getModel()).mo168626b());
                return;
            case 260003:
                ((C48173a.AbstractC48175b) getView()).mo168592a(R.string.Lark_NewContacts_CantSendHongbaoDueToBlock);
                return;
            default:
                ((C48173a.AbstractC48175b) getView()).mo168595a(errorResult.getDisplayMsg(UIHelper.getString(R.string.Lark_Legacy_SendRedPacketFailed)));
                Log.m165379d("SendRedPacketPresenter", "send red packet error code: " + errorResult.getErrorCode());
                return;
        }
    }

    public C48184f(Context context, SendRedPacketView.AbstractC48172b bVar, boolean z, String str, int i, String str2, String str3) {
        m190194a(context, bVar, z, str, i, str2, str3);
    }

    /* renamed from: a */
    private void m190194a(Context context, SendRedPacketView.AbstractC48172b bVar, boolean z, String str, int i, String str2, String str3) {
        SendRedPacketView sendRedPacketView = new SendRedPacketView(context, bVar, z, i);
        sendRedPacketView.setViewDelegate(createViewDelegate());
        setView(sendRedPacketView);
        setModel(new C48181e(z, str, str2, str3));
    }
}
