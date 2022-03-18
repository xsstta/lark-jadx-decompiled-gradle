package com.ss.android.lark.invite_new_tenant.invite.single.mobile;

import android.text.TextUtils;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.callback.UIGetDataCallback;
import com.larksuite.framework.mvp.BasePresenter;
import com.larksuite.framework.thread.CoreThreadPool;
import com.ss.android.lark.invite_new_tenant.invite.single.mobile.C40605c;
import com.ss.android.lark.invite_new_tenant.invite.single.mobile.entity.MobileCode;
import com.ss.android.lark.invite_new_tenant.service.IInviteNewTenantService;
import com.ss.android.lark.invite_new_tenant.statistics.StatisticsManager;

/* renamed from: com.ss.android.lark.invite_new_tenant.invite.single.mobile.f */
public class C40613f extends BasePresenter<C40605c.AbstractC40606a, C40605c.AbstractC40608c, C40605c.AbstractC40608c.AbstractC40609a> implements C40605c.AbstractC40607b {
    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C40605c.AbstractC40608c.AbstractC40609a createViewDelegate() {
        return new C40614a();
    }

    @Override // com.larksuite.framework.mvp.BasePresenter, com.larksuite.framework.mvp.ILifecycle
    public void create() {
        super.create();
        StatisticsManager.m160654a("invite_tenant_via_phone_view");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.lark.invite_new_tenant.invite.single.mobile.f$a */
    public class C40614a implements C40605c.AbstractC40608c.AbstractC40609a {
        @Override // com.ss.android.lark.invite_new_tenant.invite.single.mobile.C40605c.AbstractC40608c.AbstractC40609a
        /* renamed from: a */
        public void mo146738a() {
            ((C40605c.AbstractC40606a) C40613f.this.getModel()).mo146735a(new IGetDataCallback<IInviteNewTenantService.C40630a>() {
                /* class com.ss.android.lark.invite_new_tenant.invite.single.mobile.C40613f.C40614a.C406151 */

                /* renamed from: a */
                public void onSuccess(IInviteNewTenantService.C40630a aVar) {
                    ((C40605c.AbstractC40608c) C40613f.this.getView()).mo146719a(aVar);
                }

                @Override // com.larksuite.framework.callback.IGetDataCallback
                public void onError(ErrorResult errorResult) {
                    if (!TextUtils.isEmpty(errorResult.getDisplayMsg())) {
                        ((C40605c.AbstractC40608c) C40613f.this.getView()).mo146722b(errorResult.getDisplayMsg());
                    }
                }
            });
        }

        C40614a() {
        }

        @Override // com.ss.android.lark.invite_new_tenant.invite.single.mobile.C40605c.AbstractC40608c.AbstractC40609a
        /* renamed from: a */
        public void mo146739a(final String str) {
            final C406162 r0 = new IGetDataCallback<IInviteNewTenantService.C40631b>() {
                /* class com.ss.android.lark.invite_new_tenant.invite.single.mobile.C40613f.C40614a.C406162 */

                /* renamed from: a */
                public void onSuccess(IInviteNewTenantService.C40631b bVar) {
                    if (bVar.f103058a) {
                        ((C40605c.AbstractC40608c) C40613f.this.getView()).mo146721b();
                        ((C40605c.AbstractC40608c) C40613f.this.getView()).mo146717a();
                        StatisticsManager.m160653a(StatisticsManager.InviteType.PHONE, StatisticsManager.InviteResponseType.SUCCESS);
                        return;
                    }
                    ((C40605c.AbstractC40608c) C40613f.this.getView()).mo146723c();
                    ((C40605c.AbstractC40608c) C40613f.this.getView()).mo146717a();
                    StatisticsManager.m160653a(StatisticsManager.InviteType.PHONE, StatisticsManager.InviteResponseType.FAILED);
                }

                @Override // com.larksuite.framework.callback.IGetDataCallback
                public void onError(ErrorResult errorResult) {
                    if (!TextUtils.isEmpty(errorResult.getDisplayMsg())) {
                        ((C40605c.AbstractC40608c) C40613f.this.getView()).mo146722b(errorResult.getDisplayMsg());
                    }
                    if (!((C40605c.AbstractC40608c) C40613f.this.getView()).mo146724d()) {
                        StatisticsManager.m160653a(StatisticsManager.InviteType.PHONE, StatisticsManager.InviteResponseType.NO_NET);
                    } else if (errorResult.getErrorCode() == 5011) {
                        StatisticsManager.m160653a(StatisticsManager.InviteType.PHONE, StatisticsManager.InviteResponseType.INVALID_FORMAT);
                    } else {
                        StatisticsManager.m160653a(StatisticsManager.InviteType.PHONE, StatisticsManager.InviteResponseType.ERROR);
                    }
                }
            };
            CoreThreadPool.getDefault().getCachedThreadPool().submit(new Runnable() {
                /* class com.ss.android.lark.invite_new_tenant.invite.single.mobile.C40613f.C40614a.RunnableC406173 */

                public void run() {
                    ((C40605c.AbstractC40606a) C40613f.this.getModel()).mo146736a(IInviteNewTenantService.ContactType.MOBILE, str, new UIGetDataCallback(r0));
                }
            });
        }
    }

    @Override // com.ss.android.lark.invite_new_tenant.invite.single.mobile.C40605c.AbstractC40607b
    /* renamed from: a */
    public void mo146737a(MobileCode mobileCode) {
        ((C40605c.AbstractC40608c) getView()).mo146720a(mobileCode.code);
    }

    public C40613f(C40605c.AbstractC40606a aVar, C40605c.AbstractC40608c cVar) {
        super(aVar, cVar);
    }
}
