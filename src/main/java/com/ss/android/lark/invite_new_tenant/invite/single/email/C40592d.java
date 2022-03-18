package com.ss.android.lark.invite_new_tenant.invite.single.email;

import android.text.TextUtils;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.callback.UIGetDataCallback;
import com.larksuite.framework.mvp.BasePresenter;
import com.ss.android.lark.invite_new_tenant.invite.single.email.C40585a;
import com.ss.android.lark.invite_new_tenant.service.IInviteNewTenantService;
import com.ss.android.lark.invite_new_tenant.statistics.StatisticsManager;

/* renamed from: com.ss.android.lark.invite_new_tenant.invite.single.email.d */
public class C40592d extends BasePresenter<C40585a.AbstractC40586a, C40585a.AbstractC40587b, C40585a.AbstractC40587b.AbstractC40588a> {
    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C40585a.AbstractC40587b.AbstractC40588a createViewDelegate() {
        return new C40593a();
    }

    @Override // com.larksuite.framework.mvp.BasePresenter, com.larksuite.framework.mvp.ILifecycle
    public void create() {
        super.create();
        StatisticsManager.m160654a("invite_tenant_via_email_view");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.lark.invite_new_tenant.invite.single.email.d$a */
    public class C40593a implements C40585a.AbstractC40587b.AbstractC40588a {
        C40593a() {
        }

        @Override // com.ss.android.lark.invite_new_tenant.invite.single.email.C40585a.AbstractC40587b.AbstractC40588a
        /* renamed from: a */
        public void mo146714a(String str) {
            ((C40585a.AbstractC40586a) C40592d.this.getModel()).mo146713a(IInviteNewTenantService.ContactType.EMAIL, str, new UIGetDataCallback(new IGetDataCallback<IInviteNewTenantService.C40631b>() {
                /* class com.ss.android.lark.invite_new_tenant.invite.single.email.C40592d.C40593a.C405941 */

                /* renamed from: a */
                public void onSuccess(IInviteNewTenantService.C40631b bVar) {
                    if (bVar.f103058a) {
                        ((C40585a.AbstractC40587b) C40592d.this.getView()).mo146706a();
                        ((C40585a.AbstractC40587b) C40592d.this.getView()).mo146709b();
                        StatisticsManager.m160653a(StatisticsManager.InviteType.EMAIL, StatisticsManager.InviteResponseType.SUCCESS);
                        return;
                    }
                    ((C40585a.AbstractC40587b) C40592d.this.getView()).mo146710c();
                    ((C40585a.AbstractC40587b) C40592d.this.getView()).mo146709b();
                    StatisticsManager.m160653a(StatisticsManager.InviteType.EMAIL, StatisticsManager.InviteResponseType.FAILED);
                }

                @Override // com.larksuite.framework.callback.IGetDataCallback
                public void onError(ErrorResult errorResult) {
                    if (!((C40585a.AbstractC40587b) C40592d.this.getView()).mo146711d()) {
                        StatisticsManager.m160653a(StatisticsManager.InviteType.EMAIL, StatisticsManager.InviteResponseType.NO_NET);
                    } else if (errorResult.getErrorCode() == 5012) {
                        StatisticsManager.m160653a(StatisticsManager.InviteType.EMAIL, StatisticsManager.InviteResponseType.INVALID_FORMAT);
                    } else {
                        StatisticsManager.m160653a(StatisticsManager.InviteType.EMAIL, StatisticsManager.InviteResponseType.ERROR);
                    }
                    if (!TextUtils.isEmpty(errorResult.getDisplayMsg())) {
                        ((C40585a.AbstractC40587b) C40592d.this.getView()).mo146708a(errorResult.getDisplayMsg());
                    }
                }
            }));
        }
    }

    public C40592d(C40585a.AbstractC40586a aVar, C40585a.AbstractC40587b bVar) {
        super(aVar, bVar);
    }
}
