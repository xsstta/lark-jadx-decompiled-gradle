package com.ss.android.lark.money.redpacket.history.fragment.mvp;

import android.app.Activity;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.callback.UIGetDataCallback;
import com.larksuite.framework.mvp.BasePresenter;
import com.larksuite.framework.utils.CollectionUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.chat.entity.chatter.Chatter;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.money.p2366b.C48023a;
import com.ss.android.lark.money.redpacket.dto.RedPacketHistoryResponse;
import com.ss.android.lark.money.redpacket.history.fragment.mvp.AbstractC48144a;
import com.ss.android.lark.money.redpacket.history.fragment.mvp.RedPacketHistoryFragmentView;
import com.ss.android.lark.money.redpacket.history.fragment.p2370a.AbstractC48129c;
import com.ss.android.lark.money.redpacket.history.fragment.p2370a.C48128b;
import com.ss.android.lark.money.redpacket.history.fragment.p2370a.C48130d;
import com.ss.android.lark.money.redpacket.history.fragment.p2371b.C48135a;
import com.ss.android.lark.utils.UIHelper;
import java.util.Calendar;
import java.util.List;

/* renamed from: com.ss.android.lark.money.redpacket.history.fragment.mvp.d */
public class C48152d extends BasePresenter<AbstractC48144a.AbstractC48145a, AbstractC48144a.AbstractC48146b, AbstractC48144a.AbstractC48146b.AbstractC48147a> {

    /* renamed from: a */
    public Activity f121179a;

    /* renamed from: b */
    public AbstractC48129c f121180b;

    @Override // com.larksuite.framework.mvp.BasePresenter, com.larksuite.framework.mvp.ILifecycle
    public void create() {
        super.create();
        mo168549a();
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public AbstractC48144a.AbstractC48146b.AbstractC48147a createViewDelegate() {
        return new AbstractC48144a.AbstractC48146b.AbstractC48147a() {
            /* class com.ss.android.lark.money.redpacket.history.fragment.mvp.C48152d.C481564 */

            @Override // com.ss.android.lark.money.redpacket.history.fragment.mvp.AbstractC48144a.AbstractC48146b.AbstractC48147a
            /* renamed from: b */
            public void mo168545b() {
                C48152d.this.mo168552c();
            }

            @Override // com.ss.android.lark.money.redpacket.history.fragment.mvp.AbstractC48144a.AbstractC48146b.AbstractC48147a
            /* renamed from: a */
            public boolean mo168544a() {
                return ((AbstractC48144a.AbstractC48145a) C48152d.this.getModel()).mo168540a();
            }

            @Override // com.ss.android.lark.money.redpacket.history.fragment.mvp.AbstractC48144a.AbstractC48146b.AbstractC48147a
            /* renamed from: a */
            public void mo168542a(int i) {
                C48152d.this.mo168550a(i);
            }

            @Override // com.ss.android.lark.money.redpacket.history.fragment.mvp.AbstractC48144a.AbstractC48146b.AbstractC48147a
            /* renamed from: a */
            public void mo168543a(String str, boolean z) {
                C48023a.m189561a().mo168193a(C48152d.this.f121179a, str, z, false);
            }
        };
    }

    /* renamed from: a */
    public void mo168549a() {
        mo168551b();
        mo168550a(Calendar.getInstance().get(1));
    }

    /* renamed from: c */
    public void mo168552c() {
        ((AbstractC48144a.AbstractC48145a) getModel()).mo168541b(new UIGetDataCallback(new IGetDataCallback<RedPacketHistoryResponse>() {
            /* class com.ss.android.lark.money.redpacket.history.fragment.mvp.C48152d.C481553 */

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                ((AbstractC48144a.AbstractC48146b) C48152d.this.getView()).mo168522a();
            }

            /* renamed from: a */
            public void onSuccess(RedPacketHistoryResponse redPacketHistoryResponse) {
                ((AbstractC48144a.AbstractC48146b) C48152d.this.getView()).mo168530b(C48152d.this.f121180b.mo168515a(redPacketHistoryResponse.redPacketHistoryItemList));
                if (!redPacketHistoryResponse.hasMore) {
                    ((AbstractC48144a.AbstractC48146b) C48152d.this.getView()).mo168533e();
                }
                ((AbstractC48144a.AbstractC48146b) C48152d.this.getView()).mo168522a();
            }
        }));
    }

    /* renamed from: b */
    public void mo168551b() {
        ((AbstractC48144a.AbstractC48145a) getModel()).mo168539a(new UIGetDataCallback(new IGetDataCallback<Chatter>() {
            /* class com.ss.android.lark.money.redpacket.history.fragment.mvp.C48152d.C481531 */

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                Log.m165384e("redpacket", "loadAvatar getLoginChatter onError", errorResult);
            }

            /* renamed from: a */
            public void onSuccess(Chatter chatter) {
                if (chatter != null) {
                    ((AbstractC48144a.AbstractC48146b) C48152d.this.getView()).mo168527a(chatter.getAvatarKey(), chatter.getId());
                }
            }
        }));
    }

    /* renamed from: c */
    private AbstractC48148b m190070c(int i) {
        if (i == 0) {
            return new C48151c();
        }
        return new C48157e();
    }

    /* renamed from: b */
    private void m190069b(int i) {
        if (i == 0) {
            this.f121180b = new C48128b();
        } else if (i != 1) {
            this.f121180b = new C48128b();
        } else {
            this.f121180b = new C48130d();
        }
    }

    /* renamed from: a */
    public void mo168550a(final int i) {
        ((AbstractC48144a.AbstractC48146b) getView()).mo168529b();
        ((AbstractC48144a.AbstractC48146b) getView()).mo168523a(Calendar.getInstance().get(1));
        ((AbstractC48144a.AbstractC48145a) getModel()).mo168538a(i, new UIGetDataCallback(new IGetDataCallback<RedPacketHistoryResponse>() {
            /* class com.ss.android.lark.money.redpacket.history.fragment.mvp.C48152d.C481542 */

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                ((AbstractC48144a.AbstractC48146b) C48152d.this.getView()).mo168526a(errorResult.getDisplayMsg(UIHelper.getString(R.string.Lark_Legacy_UnknownError)));
                ((AbstractC48144a.AbstractC48146b) C48152d.this.getView()).mo168524a(0, 0, Calendar.getInstance().get(1));
                ((AbstractC48144a.AbstractC48146b) C48152d.this.getView()).mo168531c();
            }

            /* renamed from: a */
            public void onSuccess(RedPacketHistoryResponse redPacketHistoryResponse) {
                ((AbstractC48144a.AbstractC48146b) C48152d.this.getView()).mo168524a(redPacketHistoryResponse.totalNum, redPacketHistoryResponse.totalAmount, i);
                List<C48135a> a = C48152d.this.f121180b.mo168515a(redPacketHistoryResponse.redPacketHistoryItemList);
                ((AbstractC48144a.AbstractC48146b) C48152d.this.getView()).mo168528a(a);
                if (CollectionUtils.isEmpty(a)) {
                    ((AbstractC48144a.AbstractC48146b) C48152d.this.getView()).mo168532d();
                } else if (!redPacketHistoryResponse.hasMore) {
                    ((AbstractC48144a.AbstractC48146b) C48152d.this.getView()).mo168533e();
                }
                ((AbstractC48144a.AbstractC48146b) C48152d.this.getView()).mo168531c();
            }
        }));
    }

    public C48152d(Activity activity, int i, RedPacketHistoryFragmentView.AbstractC48143a aVar) {
        this.f121179a = activity;
        RedPacketHistoryFragmentView redPacketHistoryFragmentView = new RedPacketHistoryFragmentView(activity, i, aVar);
        AbstractC48148b c = m190070c(i);
        setView(redPacketHistoryFragmentView);
        setModel(c);
        redPacketHistoryFragmentView.setViewDelegate(createViewDelegate());
        m190069b(i);
    }
}
