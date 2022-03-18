package com.ss.android.lark.money.redpacket.detail;

import android.content.Context;
import com.larksuite.framework.callback.CallbackManager;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.callback.UIDelayGetDataCallback;
import com.larksuite.framework.callback.UIGetDataCallback;
import com.larksuite.framework.mvp.BasePresenter;
import com.larksuite.suite.R;
import com.ss.android.lark.chat.entity.message.content.RedPacketContent;
import com.ss.android.lark.money.redpacket.detail.C48106a;
import com.ss.android.lark.money.redpacket.detail.RedPacketDetailView;
import com.ss.android.lark.money.redpacket.dto.RedPacketDataWrapper;
import com.ss.android.lark.money.redpacket.dto.RedPacketDetail;
import com.ss.android.lark.money.redpacket.dto.RedPacketDetailItem;
import com.ss.android.lark.money.redpacket.dto.RedPacketInfo;
import com.ss.android.lark.money.redpacket.p2369b.C48040d;
import com.ss.android.lark.money.statistics.RedPacketHitPointOld;
import com.ss.android.lark.utils.UIHelper;
import java.util.List;

/* renamed from: com.ss.android.lark.money.redpacket.detail.c */
public class C48116c extends BasePresenter<C48106a.AbstractC48107a, C48106a.AbstractC48108b, C48106a.AbstractC48108b.AbstractC48109a> {

    /* renamed from: a */
    private CallbackManager f121111a;

    /* renamed from: b */
    public void mo168462b() {
        m189969d();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C48106a.AbstractC48108b.AbstractC48109a createViewDelegate() {
        return new C48106a.AbstractC48108b.AbstractC48109a() {
            /* class com.ss.android.lark.money.redpacket.detail.C48116c.C481171 */

            @Override // com.ss.android.lark.money.redpacket.detail.C48106a.AbstractC48108b.AbstractC48109a
            /* renamed from: b */
            public void mo168450b() {
                C48116c.this.mo168463c();
            }

            @Override // com.ss.android.lark.money.redpacket.detail.C48106a.AbstractC48108b.AbstractC48109a
            /* renamed from: c */
            public void mo168451c() {
                C48116c.this.mo168462b();
            }

            @Override // com.ss.android.lark.money.redpacket.detail.C48106a.AbstractC48108b.AbstractC48109a
            /* renamed from: d */
            public void mo168452d() {
                C48116c.this.mo168461a(true, true);
            }

            @Override // com.ss.android.lark.money.redpacket.detail.C48106a.AbstractC48108b.AbstractC48109a
            /* renamed from: a */
            public boolean mo168449a() {
                if (!((C48106a.AbstractC48107a) C48116c.this.getModel()).mo168442a() || ((C48106a.AbstractC48107a) C48116c.this.getModel()).mo168444b()) {
                    return false;
                }
                return true;
            }
        };
    }

    @Override // com.larksuite.framework.mvp.BasePresenter, com.larksuite.framework.mvp.ILifecycle
    public void destroy() {
        this.f121111a.cancelCallbacks();
        this.f121111a = null;
        super.destroy();
    }

    /* renamed from: e */
    private String m189970e() {
        if (((C48106a.AbstractC48107a) getModel()).mo168445c().type == RedPacketContent.Type.P2P) {
            return "single";
        }
        return "group";
    }

    /* renamed from: c */
    public void mo168463c() {
        ((C48106a.AbstractC48107a) getModel()).mo168440a(new UIGetDataCallback(new IGetDataCallback<List<RedPacketDetailItem>>() {
            /* class com.ss.android.lark.money.redpacket.detail.C48116c.C481193 */

            /* renamed from: a */
            public void onSuccess(List<RedPacketDetailItem> list) {
                ((C48106a.AbstractC48108b) C48116c.this.getView()).mo168428g();
                ((C48106a.AbstractC48108b) C48116c.this.getView()).mo168421a(list);
            }

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                ((C48106a.AbstractC48108b) C48116c.this.getView()).mo168428g();
                ((C48106a.AbstractC48108b) C48116c.this.getView()).mo168418a(errorResult.getDisplayMsg(UIHelper.getString(R.string.Lark_Legacy_UnknownError)));
            }
        }));
    }

    /* renamed from: d */
    private void m189969d() {
        ((C48106a.AbstractC48107a) getModel()).mo168446c(new UIDelayGetDataCallback((IGetDataCallback) this.f121111a.wrapAndAddCallback(new IGetDataCallback<RedPacketDataWrapper>() {
            /* class com.ss.android.lark.money.redpacket.detail.C48116c.C481182 */

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                C48116c.this.mo168460a(errorResult);
            }

            /* renamed from: a */
            public void onSuccess(RedPacketDataWrapper redPacketDataWrapper) {
                boolean z;
                ((C48106a.AbstractC48108b) C48116c.this.getView()).mo168424c();
                boolean z2 = true;
                ((C48106a.AbstractC48108b) C48116c.this.getView()).mo168422a(true);
                if (!redPacketDataWrapper.isRealNameAuthed) {
                    ((C48106a.AbstractC48108b) C48116c.this.getView()).mo168427f();
                    ((C48106a.AbstractC48108b) C48116c.this.getView()).mo168420a(redPacketDataWrapper.payToken, C48040d.m189602a().mo168233b(), redPacketDataWrapper.authUrl);
                    return;
                }
                ((C48106a.AbstractC48108b) C48116c.this.getView()).mo168416a(redPacketDataWrapper);
                boolean z3 = false;
                if (redPacketDataWrapper == null || redPacketDataWrapper.info == null) {
                    z2 = false;
                } else {
                    RedPacketInfo redPacketInfo = redPacketDataWrapper.info;
                    if (redPacketInfo.grabAmount != 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (redPacketInfo.grabNum != redPacketInfo.totalNum) {
                        z2 = false;
                    }
                    z3 = z;
                }
                ((C48106a.AbstractC48107a) C48116c.this.getModel()).mo168441a(z3, z2);
            }
        }), 1000));
        RedPacketHitPointOld.m190217a(m189970e());
    }

    @Override // com.larksuite.framework.mvp.BasePresenter, com.larksuite.framework.mvp.ILifecycle
    public void create() {
        super.create();
        this.f121111a = new CallbackManager();
        ((C48106a.AbstractC48108b) getView()).mo168417a(((C48106a.AbstractC48107a) getModel()).mo168445c(), ((C48106a.AbstractC48107a) getModel()).mo168447d());
    }

    /* renamed from: a */
    public void mo168460a(ErrorResult errorResult) {
        switch (errorResult.getErrorCode()) {
            case 4403:
                ((C48106a.AbstractC48108b) getView()).mo168424c();
                ((C48106a.AbstractC48108b) getView()).mo168422a(true);
                ((C48106a.AbstractC48108b) getView()).mo168425d();
                ((C48106a.AbstractC48107a) getModel()).mo168441a(false, true);
                return;
            case 4404:
                mo168461a(false, false);
                return;
            case 4405:
                ((C48106a.AbstractC48108b) getView()).mo168424c();
                ((C48106a.AbstractC48108b) getView()).mo168422a(true);
                ((C48106a.AbstractC48108b) getView()).mo168426e();
                ((C48106a.AbstractC48107a) getModel()).mo168441a(false, false);
                return;
            default:
                ((C48106a.AbstractC48108b) getView()).mo168424c();
                ((C48106a.AbstractC48108b) getView()).mo168422a(true);
                ((C48106a.AbstractC48108b) getView()).mo168427f();
                ((C48106a.AbstractC48108b) getView()).mo168418a(errorResult.getDisplayMsg(UIHelper.getString(R.string.Lark_Legacy_UnknownError)));
                return;
        }
    }

    /* renamed from: a */
    public void mo168461a(final boolean z, final boolean z2) {
        if (z) {
            ((C48106a.AbstractC48108b) getView()).mo168414a();
        }
        ((C48106a.AbstractC48107a) getModel()).mo168443b(new UIGetDataCallback(new IGetDataCallback<RedPacketDataWrapper>() {
            /* class com.ss.android.lark.money.redpacket.detail.C48116c.C481204 */

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                if (z) {
                    ((C48106a.AbstractC48108b) C48116c.this.getView()).mo168423b();
                }
                ((C48106a.AbstractC48108b) C48116c.this.getView()).mo168418a(errorResult.getDisplayMsg(UIHelper.getString(R.string.Lark_Legacy_UnknownError)));
            }

            /* renamed from: a */
            public void onSuccess(RedPacketDataWrapper redPacketDataWrapper) {
                if (z) {
                    ((C48106a.AbstractC48108b) C48116c.this.getView()).mo168423b();
                }
                if (z2) {
                    ((C48106a.AbstractC48108b) C48116c.this.getView()).mo168429h();
                    ((C48106a.AbstractC48108b) C48116c.this.getView()).mo168419a(((C48106a.AbstractC48107a) C48116c.this.getModel()).mo168448e(), redPacketDataWrapper.info, redPacketDataWrapper.detail);
                    return;
                }
                ((C48106a.AbstractC48108b) C48116c.this.getView()).mo168416a(redPacketDataWrapper);
            }
        }));
    }

    public C48116c(Context context, RedPacketDetailView.AbstractC48105b bVar, RedPacketInfo redPacketInfo, RedPacketDetail redPacketDetail, String str, String str2) {
        RedPacketDetailView redPacketDetailView = new RedPacketDetailView(context, bVar, str);
        C48110b bVar2 = new C48110b(redPacketInfo, redPacketDetail, str2);
        setView(redPacketDetailView);
        setModel(bVar2);
        redPacketDetailView.setViewDelegate(createViewDelegate());
    }
}
