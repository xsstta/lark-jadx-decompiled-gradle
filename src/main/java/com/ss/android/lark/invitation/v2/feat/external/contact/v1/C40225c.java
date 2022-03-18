package com.ss.android.lark.invitation.v2.feat.external.contact.v1;

import android.text.TextUtils;
import com.bytedance.lark.pb.contact.v1.GetUserProfileResponse;
import com.bytedance.lark.pb.contact.v1.SearchUserByContactPointResponse;
import com.bytedance.lark.pb.contact.v1.SendUserInvitationResponse;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.mvp.BasePresenter;
import com.larksuite.suite.R;
import com.ss.android.lark.contact.entity.mobile.ContactMobileBean;
import com.ss.android.lark.inv.export.util.C40147z;
import com.ss.android.lark.invitation.v2.feat.external.bean.C40219a;
import com.ss.android.lark.invitation.v2.feat.external.common.InviteExternalService;
import com.ss.android.lark.invitation.v2.feat.external.contact.v1.AbstractC40220a;
import com.ss.android.lark.invitation.v2.feat.external.contact.v1.C40225c;
import com.ss.android.lark.invitation.v2.feat.external.p2054a.C40201a;
import com.ss.android.lark.invitation.v2.feat.external.p2054a.C40205c;
import com.ss.android.lark.invitation.v2.statistic.InvHitPoint;
import com.ss.android.lark.profile.entity.C52260a;
import com.ss.android.lark.sdk.C53241h;
import com.ss.android.lark.utils.ApiUtils;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.lark.utils.ViewUtils;

/* renamed from: com.ss.android.lark.invitation.v2.feat.external.contact.v1.c */
public class C40225c extends BasePresenter<AbstractC40220a.AbstractC40221a, AbstractC40220a.AbstractC40222b, AbstractC40220a.AbstractC40222b.AbstractC40223a> {

    /* renamed from: a */
    public String f102196a;

    /* renamed from: b */
    public String f102197b;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public AbstractC40220a.AbstractC40222b.AbstractC40223a createViewDelegate() {
        return new AbstractC40220a.AbstractC40222b.AbstractC40223a() {
            /* class com.ss.android.lark.invitation.v2.feat.external.contact.v1.C40225c.C402261 */
        };
    }

    /* renamed from: b */
    public void mo145935b(String str) {
        this.f102196a = str;
    }

    /* renamed from: c */
    public void mo145936c(String str) {
        this.f102197b = str;
    }

    /* renamed from: a */
    public void mo145933a(String str) {
        ((AbstractC40220a.AbstractC40222b) getView()).mo145926a(str, this.f102196a, C40147z.m159160a().isLarkEnv(), new C40205c.AbstractC40215a() {
            /* class com.ss.android.lark.invitation.v2.feat.external.contact.v1.C40225c.C402283 */

            @Override // com.ss.android.lark.invitation.v2.feat.external.p2054a.C40205c.AbstractC40215a
            /* renamed from: a */
            public void mo145893a(String str, boolean z, boolean z2) {
                C40225c.this.mo145934a(str, z);
                InvHitPoint.m160367b(z2);
            }
        });
        InvHitPoint.m160350a(0);
        InvHitPoint.m160384h();
    }

    /* renamed from: a */
    public void mo145932a(ContactMobileBean contactMobileBean) {
        final String str;
        ((AbstractC40220a.AbstractC40222b) getView()).mo145928b();
        if (C40147z.m159160a().isLarkEnv()) {
            str = contactMobileBean.getEmail().replace(" ", "");
        } else {
            str = contactMobileBean.getPhone().replace(" ", "");
        }
        ((AbstractC40220a.AbstractC40221a) getModel()).mo145922a(str, new IGetDataCallback<SearchUserByContactPointResponse>() {
            /* class com.ss.android.lark.invitation.v2.feat.external.contact.v1.C40225c.C402272 */

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                ((AbstractC40220a.AbstractC40222b) C40225c.this.getView()).mo145929c();
                ((AbstractC40220a.AbstractC40222b) C40225c.this.getView()).mo145925a(errorResult.getDisplayMsg());
                C53241h.m205894a("InvitationModule", errorResult.getDebugMsg());
            }

            /* renamed from: a */
            public void onSuccess(SearchUserByContactPointResponse searchUserByContactPointResponse) {
                ((AbstractC40220a.AbstractC40222b) C40225c.this.getView()).mo145929c();
                if (searchUserByContactPointResponse != null && searchUserByContactPointResponse.profiles != null && !searchUserByContactPointResponse.profiles.isEmpty()) {
                    InvHitPoint.m160350a(searchUserByContactPointResponse.profiles.size());
                    if (searchUserByContactPointResponse.profiles.size() == 1) {
                        GetUserProfileResponse getUserProfileResponse = searchUserByContactPointResponse.profiles.get(0);
                        if (getUserProfileResponse != null) {
                            C40147z.m159160a().openProfile(((AbstractC40220a.AbstractC40222b) C40225c.this.getView()).mo145924a(), C52260a.m202784a(getUserProfileResponse, C40147z.m159160a().getLoginDependency().mo145590f()), 10);
                        } else {
                            C53241h.m205894a("InvitationModule", "The profile is null.");
                        }
                    } else {
                        ((AbstractC40220a.AbstractC40222b) C40225c.this.getView()).mo145927a(C40201a.m159352a(searchUserByContactPointResponse.profiles));
                    }
                } else if (TextUtils.isEmpty(C40225c.this.f102196a)) {
                    InviteExternalService.m159379a(((AbstractC40220a.AbstractC40222b) C40225c.this.getView()).mo145924a(), new ApiUtils.AbstractC57748a(str) {
                        /* class com.ss.android.lark.invitation.v2.feat.external.contact.v1.$$Lambda$c$2$EjGd7P6kQUt3vUpPHBX2_xY8sYg */
                        public final /* synthetic */ String f$1;

                        {
                            this.f$1 = r2;
                        }

                        @Override // com.ss.android.lark.utils.ApiUtils.AbstractC57748a
                        public final void consume(Object obj) {
                            C40225c.C402272.this.m159437a(this.f$1, (C40219a) obj);
                        }
                    });
                } else {
                    C40225c.this.mo145933a(str);
                }
            }

            /* access modifiers changed from: private */
            /* renamed from: a */
            public /* synthetic */ void m159437a(String str, C40219a aVar) {
                if (aVar == null) {
                    ViewUtils.m224144a();
                } else if (aVar.f102188a != null) {
                    ViewUtils.m224150a(aVar.f102188a.getDisplayMsg());
                } else {
                    C40225c.this.f102196a = aVar.mo145910a();
                    C40225c.this.f102197b = aVar.mo145914c();
                    C40225c.this.mo145933a(str);
                }
            }
        });
    }

    public C40225c(AbstractC40220a.AbstractC40221a aVar, AbstractC40220a.AbstractC40222b bVar) {
        super(aVar, bVar);
        bVar.setViewDelegate(createViewDelegate());
    }

    /* renamed from: a */
    public void mo145934a(String str, boolean z) {
        ((AbstractC40220a.AbstractC40222b) getView()).mo145928b();
        ((AbstractC40220a.AbstractC40221a) getModel()).mo145923a(str, z, new IGetDataCallback<SendUserInvitationResponse>() {
            /* class com.ss.android.lark.invitation.v2.feat.external.contact.v1.C40225c.C402294 */

            /* renamed from: a */
            public void onSuccess(SendUserInvitationResponse sendUserInvitationResponse) {
                ((AbstractC40220a.AbstractC40222b) C40225c.this.getView()).mo145929c();
                if (sendUserInvitationResponse.success.booleanValue()) {
                    ((AbstractC40220a.AbstractC40222b) C40225c.this.getView()).mo145930d();
                    ((AbstractC40220a.AbstractC40222b) C40225c.this.getView()).mo145925a(UIHelper.getString(R.string.Lark_UserGrowth_InviteTenantToastSent));
                    InvHitPoint.m160358a("link", "invite_message", C40225c.this.f102197b);
                    return;
                }
                ViewUtils.m224144a();
            }

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                ((AbstractC40220a.AbstractC40222b) C40225c.this.getView()).mo145929c();
                ((AbstractC40220a.AbstractC40222b) C40225c.this.getView()).mo145925a(errorResult.getDisplayMsg());
                C53241h.m205894a("InvitationModule", errorResult.getDebugMsg());
            }
        });
    }
}
