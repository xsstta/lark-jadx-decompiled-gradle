package com.ss.android.lark.invitation.v2.feat.external.search;

import android.content.Intent;
import android.text.TextUtils;
import com.bytedance.lark.pb.contact.v1.SearchUserByContactPointResponse;
import com.bytedance.lark.pb.contact.v1.SendUserInvitationResponse;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.mvp.BasePresenter;
import com.larksuite.suite.R;
import com.ss.android.lark.invitation.v2.feat.external.bean.C40219a;
import com.ss.android.lark.invitation.v2.feat.external.common.InviteExternalService;
import com.ss.android.lark.invitation.v2.feat.external.search.AbstractC40294a;
import com.ss.android.lark.invitation.v2.feat.external.search.C40299d;
import com.ss.android.lark.invitation.v2.statistic.InvHitPoint;
import com.ss.android.lark.profile.dto.ProfileFinishResult;
import com.ss.android.lark.sdk.C53241h;
import com.ss.android.lark.utils.ApiUtils;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.lark.utils.ViewUtils;
import java.io.Serializable;

/* renamed from: com.ss.android.lark.invitation.v2.feat.external.search.d */
public class C40299d extends BasePresenter<AbstractC40294a.AbstractC40295a, AbstractC40294a.AbstractC40296b, AbstractC40294a.AbstractC40296b.AbstractC40297a> {

    /* renamed from: a */
    public IGetDataCallback<SearchUserByContactPointResponse> f102388a;

    /* renamed from: b */
    public String f102389b;

    /* renamed from: c */
    public String f102390c;

    /* renamed from: d */
    private String f102391d;

    /* renamed from: b */
    public String mo146148b() {
        return this.f102389b;
    }

    /* renamed from: c */
    public String mo146150c() {
        return this.f102391d;
    }

    /* renamed from: a */
    public AbstractC40294a.AbstractC40296b.AbstractC40297a createViewDelegate() {
        return new AbstractC40294a.AbstractC40296b.AbstractC40297a() {
            /* class com.ss.android.lark.invitation.v2.feat.external.search.C40299d.C403001 */

            @Override // com.ss.android.lark.invitation.v2.feat.external.search.AbstractC40294a.AbstractC40296b.AbstractC40297a
            /* renamed from: b */
            public String mo146141b() {
                return C40299d.this.f102390c;
            }

            @Override // com.ss.android.lark.invitation.v2.feat.external.search.AbstractC40294a.AbstractC40296b.AbstractC40297a
            /* renamed from: a */
            public void mo146138a() {
                if (TextUtils.isEmpty(C40299d.this.mo146148b())) {
                    InviteExternalService.m159379a(((AbstractC40294a.AbstractC40296b) C40299d.this.getView()).mo146128a(), new ApiUtils.AbstractC57748a() {
                        /* class com.ss.android.lark.invitation.v2.feat.external.search.$$Lambda$d$1$X3aGKSPEz5Dr8dD0R8fNbPstEs */

                        @Override // com.ss.android.lark.utils.ApiUtils.AbstractC57748a
                        public final void consume(Object obj) {
                            C40299d.C403001.m270652lambda$X3aGKSPEz5Dr8dD0R8fNbPstEs(C40299d.C403001.this, (C40219a) obj);
                        }
                    });
                } else {
                    ((AbstractC40294a.AbstractC40296b) C40299d.this.getView()).mo146131a(C40299d.this.mo146150c(), C40299d.this.mo146148b());
                }
            }

            /* access modifiers changed from: public */
            /* renamed from: a */
            private /* synthetic */ void m159747a(C40219a aVar) {
                if (aVar == null) {
                    ViewUtils.m224144a();
                } else if (aVar.f102188a != null) {
                    ViewUtils.m224150a(aVar.f102188a.getDisplayMsg());
                } else {
                    C40299d.this.f102389b = aVar.mo145910a();
                    C40299d.this.f102390c = aVar.mo145914c();
                    ((AbstractC40294a.AbstractC40296b) C40299d.this.getView()).mo146131a(C40299d.this.mo146150c(), C40299d.this.mo146148b());
                }
            }

            @Override // com.ss.android.lark.invitation.v2.feat.external.search.AbstractC40294a.AbstractC40296b.AbstractC40297a
            /* renamed from: a */
            public void mo146139a(final String str) {
                ((AbstractC40294a.AbstractC40296b) C40299d.this.getView()).mo146136e();
                C40299d.this.f102388a = new IGetDataCallback<SearchUserByContactPointResponse>() {
                    /* class com.ss.android.lark.invitation.v2.feat.external.search.C40299d.C403001.C403011 */

                    @Override // com.larksuite.framework.callback.IGetDataCallback
                    public void onError(ErrorResult errorResult) {
                        if (C40299d.this.f102388a == this) {
                            C40299d.this.mo146149b(str);
                            ((AbstractC40294a.AbstractC40296b) C40299d.this.getView()).mo146135d();
                        }
                    }

                    /* renamed from: a */
                    public void onSuccess(SearchUserByContactPointResponse searchUserByContactPointResponse) {
                        C40305f.m159762a().mo146158a(str);
                        if (C40299d.this.f102388a == this) {
                            if (searchUserByContactPointResponse == null || searchUserByContactPointResponse.profiles == null || searchUserByContactPointResponse.profiles.isEmpty()) {
                                C40299d.this.mo146149b(str);
                                ((AbstractC40294a.AbstractC40296b) C40299d.this.getView()).mo146135d();
                                InvHitPoint.m160363b(0);
                                return;
                            }
                            InvHitPoint.m160363b(searchUserByContactPointResponse.profiles.size());
                            ((AbstractC40294a.AbstractC40296b) C40299d.this.getView()).mo146132a(C40303e.m159755a(searchUserByContactPointResponse.profiles));
                        }
                    }
                };
                ((AbstractC40294a.AbstractC40295a) C40299d.this.getModel()).mo146126a(str, C40299d.this.f102388a);
            }

            @Override // com.ss.android.lark.invitation.v2.feat.external.search.AbstractC40294a.AbstractC40296b.AbstractC40297a
            /* renamed from: a */
            public void mo146140a(String str, boolean z) {
                C40299d.this.mo146147a(str, z);
            }
        };
    }

    /* renamed from: a */
    public void mo146146a(String str) {
        this.f102389b = str;
    }

    /* renamed from: b */
    public void mo146149b(String str) {
        this.f102391d = str;
    }

    /* renamed from: c */
    public void mo146151c(String str) {
        this.f102390c = str;
    }

    public C40299d(AbstractC40294a.AbstractC40295a aVar, AbstractC40294a.AbstractC40296b bVar) {
        super(aVar, bVar);
        bVar.setViewDelegate(createViewDelegate());
    }

    /* renamed from: a */
    public void mo146147a(String str, boolean z) {
        ((AbstractC40294a.AbstractC40296b) getView()).mo146133b();
        ((AbstractC40294a.AbstractC40295a) getModel()).mo146127a(str, z, new IGetDataCallback<SendUserInvitationResponse>() {
            /* class com.ss.android.lark.invitation.v2.feat.external.search.C40299d.C403022 */

            /* renamed from: a */
            public void onSuccess(SendUserInvitationResponse sendUserInvitationResponse) {
                ((AbstractC40294a.AbstractC40296b) C40299d.this.getView()).mo146134c();
                if (sendUserInvitationResponse.success.booleanValue()) {
                    ((AbstractC40294a.AbstractC40296b) C40299d.this.getView()).mo146130a(UIHelper.getString(R.string.Lark_UserGrowth_InviteTenantToastSent));
                    ((AbstractC40294a.AbstractC40296b) C40299d.this.getView()).mo146137f();
                    return;
                }
                ViewUtils.m224144a();
            }

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                ((AbstractC40294a.AbstractC40296b) C40299d.this.getView()).mo146134c();
                ((AbstractC40294a.AbstractC40296b) C40299d.this.getView()).mo146130a(errorResult.getDisplayMsg());
                C53241h.m205894a("InvitationModule", errorResult.getDebugMsg());
            }
        });
    }

    /* renamed from: a */
    public void mo146145a(int i, int i2, Intent intent) {
        if (i2 == -1 && intent != null && i == 273) {
            Serializable serializableExtra = intent.getSerializableExtra("params_key_profile");
            if (serializableExtra instanceof ProfileFinishResult) {
                ((AbstractC40294a.AbstractC40296b) getView()).mo146129a((ProfileFinishResult) serializableExtra);
                return;
            }
            C53241h.m205899c("InvitationModule", "profile onActivityResult : result is not ProfileFinishResult");
        }
    }
}
