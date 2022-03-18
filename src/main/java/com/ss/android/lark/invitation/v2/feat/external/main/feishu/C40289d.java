package com.ss.android.lark.invitation.v2.feat.external.main.feishu;

import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.mvp.BasePresenter;
import com.ss.android.lark.inv.export.util.C40147z;
import com.ss.android.lark.invitation.v2.feat.external.contact.v1.InviteExternalContactActivity;
import com.ss.android.lark.invitation.v2.feat.external.contact.v2.InviteExternalContactV2Activity;
import com.ss.android.lark.invitation.v2.feat.external.guide.InviteExternalGuideActivity;
import com.ss.android.lark.invitation.v2.feat.external.main.feishu.AbstractC40284a;
import com.ss.android.lark.invitation.v2.feat.external.search.InviteExternalSearchActivity;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.util.share_preference.UserSP;

/* renamed from: com.ss.android.lark.invitation.v2.feat.external.main.feishu.d */
public class C40289d extends BasePresenter<AbstractC40284a.AbstractC40285a, AbstractC40284a.AbstractC40286b, AbstractC40284a.AbstractC40286b.AbstractC40287a> {

    /* renamed from: a */
    public String f102371a;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public AbstractC40284a.AbstractC40286b.AbstractC40287a createViewDelegate() {
        return new AbstractC40284a.AbstractC40286b.AbstractC40287a() {
            /* class com.ss.android.lark.invitation.v2.feat.external.main.feishu.C40289d.C402912 */

            @Override // com.ss.android.lark.invitation.v2.feat.external.main.feishu.AbstractC40284a.AbstractC40286b.AbstractC40287a
            /* renamed from: c */
            public void mo146110c() {
                InviteExternalSearchActivity.m159708a(((AbstractC40284a.AbstractC40286b) C40289d.this.getView()).mo146104a());
            }

            @Override // com.ss.android.lark.invitation.v2.feat.external.main.feishu.AbstractC40284a.AbstractC40286b.AbstractC40287a
            /* renamed from: a */
            public void mo146108a() {
                C40147z.m159160a().openF2fGroupPage(((AbstractC40284a.AbstractC40286b) C40289d.this.getView()).mo146104a());
            }

            @Override // com.ss.android.lark.invitation.v2.feat.external.main.feishu.AbstractC40284a.AbstractC40286b.AbstractC40287a
            /* renamed from: b */
            public void mo146109b() {
                if (C40147z.m159160a().getContactDependency().mo145580a()) {
                    InviteExternalContactV2Activity.m159459a(((AbstractC40284a.AbstractC40286b) C40289d.this.getView()).mo146104a(), C40289d.this.f102371a);
                } else {
                    InviteExternalContactActivity.m159403a(((AbstractC40284a.AbstractC40286b) C40289d.this.getView()).mo146104a(), C40289d.this.f102371a);
                }
            }
        };
    }

    @Override // com.larksuite.framework.mvp.BasePresenter, com.larksuite.framework.mvp.ILifecycle
    public void create() {
        super.create();
        if (UserSP.getInstance().getBoolean("is_invite_external_guided")) {
            ((AbstractC40284a.AbstractC40286b) getView()).mo146107d();
            return;
        }
        ((AbstractC40284a.AbstractC40286b) getView()).mo146105b();
        ((AbstractC40284a.AbstractC40285a) getModel()).mo146080a(new IGetDataCallback<Boolean>() {
            /* class com.ss.android.lark.invitation.v2.feat.external.main.feishu.C40289d.C402901 */

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                Log.m165386e("InvitationModule", errorResult);
                ((AbstractC40284a.AbstractC40286b) C40289d.this.getView()).mo146106c();
            }

            /* renamed from: a */
            public void onSuccess(Boolean bool) {
                ((AbstractC40284a.AbstractC40286b) C40289d.this.getView()).mo146106c();
                if (bool.booleanValue()) {
                    InviteExternalGuideActivity.f102295a.mo146008a(((AbstractC40284a.AbstractC40286b) C40289d.this.getView()).mo146104a(), C40289d.this.f102371a);
                }
                UserSP.getInstance().putBoolean("is_invite_external_guided", true);
            }
        });
    }

    /* renamed from: a */
    public void mo146114a(String str) {
        this.f102371a = str;
    }

    public C40289d(AbstractC40284a.AbstractC40285a aVar, AbstractC40284a.AbstractC40286b bVar) {
        super(aVar, bVar);
        bVar.setViewDelegate(createViewDelegate());
    }
}
