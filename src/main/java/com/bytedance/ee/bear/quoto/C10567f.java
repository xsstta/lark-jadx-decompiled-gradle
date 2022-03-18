package com.bytedance.ee.bear.quoto;

import android.text.TextUtils;
import com.bytedance.ee.bear.basesdk.services.C4511g;
import com.bytedance.ee.bear.quoto.AbstractC10573j;
import com.bytedance.ee.bear.quoto.QuotaInfoResult;
import com.bytedance.ee.bear.service.C10917c;
import com.bytedance.ee.bear.service.C10929e;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.p702e.C13657b;
import com.larksuite.framework.mvp.BasePresenter;
import io.reactivex.disposables.C68289a;
import io.reactivex.functions.Consumer;

/* renamed from: com.bytedance.ee.bear.quoto.f */
public class C10567f extends BasePresenter<AbstractC10572i, AbstractC10573j, AbstractC10573j.AbstractC10574a> {

    /* renamed from: a */
    private final String f28347a;

    /* renamed from: b */
    private final String f28348b;

    /* renamed from: c */
    private final C68289a f28349c = new C68289a();

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public AbstractC10573j.AbstractC10574a createViewDelegate() {
        return null;
    }

    @Override // com.larksuite.framework.mvp.BasePresenter, com.larksuite.framework.mvp.ILifecycle
    public void destroy() {
        super.destroy();
        this.f28349c.mo237935a();
        C13479a.m54764b("ExceedQuotaPresenter", "destroy()...");
    }

    @Override // com.larksuite.framework.mvp.BasePresenter, com.larksuite.framework.mvp.ILifecycle
    public void create() {
        super.create();
        new C10917c(new C10929e());
        this.f28349c.mo237937a(((AbstractC10572i) getModel()).mo40016a(this.f28347a, this.f28348b).mo238001b(new Consumer(C4511g.m18594d().mo17356e()) {
            /* class com.bytedance.ee.bear.quoto.$$Lambda$f$4tUMkQmONJMIKta4bEFTXdz3P8 */
            public final /* synthetic */ String f$1;

            {
                this.f$1 = r2;
            }

            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C10567f.this.m43782a(this.f$1, (QuotaInfoResult) obj);
            }
        }, new Consumer() {
            /* class com.bytedance.ee.bear.quoto.$$Lambda$f$KG9zTlFnRYt19teHoSFfEdA08A */

            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C10567f.this.m43783a((Throwable) obj);
            }
        }));
        C13479a.m54764b("ExceedQuotaPresenter", "create()...");
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: a */
    private /* synthetic */ void m43783a(Throwable th) throws Exception {
        C13479a.m54764b("ExceedQuotaPresenter", "fetchQuotaInfo()...error = " + th);
        ((AbstractC10573j) getView()).mo40018a();
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: a */
    private /* synthetic */ void m43782a(String str, QuotaInfoResult quotaInfoResult) throws Exception {
        C13479a.m54764b("ExceedQuotaPresenter", "fetchQuotaInfo()...success, quotaInfoResult = " + quotaInfoResult);
        if (quotaInfoResult.getData() == null) {
            C13479a.m54764b("ExceedQuotaPresenter", "data is null, showDefaultExceedQuota");
            ((AbstractC10573j) getView()).mo40018a();
            return;
        }
        QuotaInfoResult.DataDTO dataDTO = (QuotaInfoResult.DataDTO) quotaInfoResult.getData();
        QuotaInfoResult.DataDTO.QuotaInfo owner = dataDTO.getOwner();
        QuotaInfoResult.DataDTO.QuotaInfo user = dataDTO.getUser();
        QuotaInfoResult.DataDTO.QuotaInfo tenant = dataDTO.getTenant();
        if (owner != null && C13657b.m55423b(owner.getContacts())) {
            QuotaInfoResult.DataDTO.ContactsDTO contactsDTO = owner.getContacts().get(0);
            if (!TextUtils.equals(str, contactsDTO.getUid()) || !C13657b.m55423b(tenant.getContacts())) {
                ((AbstractC10573j) getView()).mo40020a(contactsDTO, owner.getUsage(), owner.getLimit());
            } else {
                ((AbstractC10573j) getView()).mo40019a(owner.getUsage(), owner.getLimit(), tenant.getContacts());
            }
        } else if (user == null || tenant == null || !C13657b.m55423b(tenant.getContacts())) {
            C13479a.m54764b("ExceedQuotaPresenter", "showDefaultExceedQuota");
            ((AbstractC10573j) getView()).mo40018a();
        } else {
            C13479a.m54764b("ExceedQuotaPresenter", "showSelfExceedQuota");
            ((AbstractC10573j) getView()).mo40019a(user.getUsage(), user.getLimit(), tenant.getContacts());
        }
    }

    C10567f(AbstractC10572i iVar, AbstractC10573j jVar, String str, String str2) {
        super(iVar, jVar);
        this.f28347a = str;
        this.f28348b = str2;
    }
}
