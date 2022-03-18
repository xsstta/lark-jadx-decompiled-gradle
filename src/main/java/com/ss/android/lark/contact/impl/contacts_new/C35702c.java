package com.ss.android.lark.contact.impl.contacts_new;

import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.mvp.BaseModel;
import com.larksuite.framework.utils.CollectionUtils;
import com.ss.android.lark.contact.C35358a;
import com.ss.android.lark.contact.dto.ChatApplication;
import com.ss.android.lark.contact.impl.contacts_new.AbstractC35695a;
import com.ss.android.lark.contact.impl.interfaces.AbstractC35936a;
import com.ss.android.lark.contact.impl.p1761f.C35890d;
import com.ss.android.lark.contact.impl.p1761f.C35906e;
import com.ss.android.lark.contact.p1733b.AbstractC35361b;
import com.ss.android.lark.contact.p1734c.AbstractC35384b;
import com.ss.android.lark.inv.export.util.InvApmUtils;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.lark.contact.impl.contacts_new.c */
public class C35702c extends BaseModel implements AbstractC35695a.AbstractC35696a {

    /* renamed from: a */
    AbstractC35936a f92329a = C35906e.m140678a();

    /* renamed from: b */
    public AbstractC35695a.AbstractC35696a.AbstractC35697a f92330b;

    /* renamed from: c */
    private boolean f92331c = true;

    /* renamed from: d */
    private String f92332d = "0";

    /* renamed from: e */
    private List<ChatApplication> f92333e = new ArrayList();

    /* renamed from: f */
    private AbstractC35361b.AbstractC35379r f92334f;

    /* renamed from: g */
    private AbstractC35384b f92335g = new AbstractC35384b() {
        /* class com.ss.android.lark.contact.impl.contacts_new.C35702c.C357031 */

        @Override // com.ss.android.lark.contact.p1734c.AbstractC35384b
        /* renamed from: a */
        public void mo130261a(List<ChatApplication> list) {
            if (!CollectionUtils.isEmpty(list) && C35702c.this.f92330b != null) {
                C35702c.this.f92330b.mo131485a(list);
            }
        }
    };

    @Override // com.ss.android.lark.contact.impl.contacts_new.AbstractC35695a.AbstractC35696a
    /* renamed from: b */
    public String mo131484b() {
        return this.f92332d;
    }

    @Override // com.ss.android.lark.contact.impl.contacts_new.AbstractC35695a.AbstractC35696a
    /* renamed from: a */
    public boolean mo131483a() {
        return this.f92331c;
    }

    @Override // com.larksuite.framework.mvp.BaseModel, com.larksuite.framework.mvp.ILifecycle
    public void destroy() {
        super.destroy();
        C35890d.m140654a().mo132124b(this.f92335g);
        this.f92330b = null;
    }

    @Override // com.larksuite.framework.mvp.BaseModel, com.larksuite.framework.mvp.ILifecycle
    public void create() {
        super.create();
        this.f92334f = C35358a.m138143a().mo130167l();
        C35890d.m140654a().mo132118a(this.f92335g);
    }

    @Override // com.ss.android.lark.contact.impl.contacts_new.AbstractC35695a.AbstractC35696a
    /* renamed from: a */
    public void mo131480a(AbstractC35695a.AbstractC35696a.AbstractC35697a aVar) {
        this.f92330b = aVar;
    }

    @Override // com.ss.android.lark.contact.impl.contacts_new.AbstractC35695a.AbstractC35696a
    /* renamed from: a */
    public void mo131482a(boolean z) {
        this.f92329a.mo130284b(z, (IGetDataCallback<Boolean>) null);
    }

    @Override // com.ss.android.lark.contact.impl.contacts_new.AbstractC35695a.AbstractC35696a
    /* renamed from: a */
    public void mo131479a(final IGetDataCallback<AbstractC35936a.C35940d> iGetDataCallback) {
        InvApmUtils.m158958a("contact_opt_contact_applications_fetch_timing_ms");
        this.f92329a.mo132143a(this.f92332d, 20, (IGetDataCallback) getCallbackManager().wrapAndAddCallback(new IGetDataCallback<AbstractC35936a.C35940d>() {
            /* class com.ss.android.lark.contact.impl.contacts_new.C35702c.C357042 */

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                IGetDataCallback iGetDataCallback = iGetDataCallback;
                if (iGetDataCallback != null) {
                    iGetDataCallback.onError(errorResult);
                }
                InvApmUtils.m158959a("contact_opt_contact_applications_fetch_fail", errorResult);
            }

            /* renamed from: a */
            public void onSuccess(AbstractC35936a.C35940d dVar) {
                C35702c.this.mo131490a(dVar);
                IGetDataCallback iGetDataCallback = iGetDataCallback;
                if (iGetDataCallback != null) {
                    iGetDataCallback.onSuccess(dVar);
                }
                InvApmUtils.m158967a("contact_opt_contact_applications_fetch_timing_ms", true);
            }
        }));
    }

    /* renamed from: a */
    public void mo131490a(AbstractC35936a.C35940d dVar) {
        this.f92331c = dVar.mo132240b();
        this.f92333e.addAll(dVar.mo132237a());
        if (!CollectionUtils.isEmpty(this.f92333e)) {
            this.f92332d = this.f92333e.get(this.f92333e.size() - 1).getId();
        }
    }

    /* renamed from: a */
    public void mo131491a(String str) {
        if (!CollectionUtils.isEmpty(this.f92333e)) {
            for (int i = 0; i < this.f92333e.size(); i++) {
                ChatApplication chatApplication = this.f92333e.get(i);
                if (chatApplication != null && str.equals(chatApplication.getId())) {
                    this.f92333e.remove(i);
                    return;
                }
            }
        }
    }

    @Override // com.ss.android.lark.contact.impl.contacts_new.AbstractC35695a.AbstractC35696a
    /* renamed from: a */
    public void mo131481a(final String str, final IGetDataCallback<Boolean> iGetDataCallback) {
        this.f92329a.mo132145a(str, (IGetDataCallback) getCallbackManager().wrapAndAddCallback(new IGetDataCallback<Boolean>() {
            /* class com.ss.android.lark.contact.impl.contacts_new.C35702c.C357053 */

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                IGetDataCallback iGetDataCallback = iGetDataCallback;
                if (iGetDataCallback != null) {
                    iGetDataCallback.onError(errorResult);
                }
            }

            /* renamed from: a */
            public void onSuccess(Boolean bool) {
                C35702c.this.mo131491a(str);
                IGetDataCallback iGetDataCallback = iGetDataCallback;
                if (iGetDataCallback != null) {
                    iGetDataCallback.onSuccess(true);
                }
            }
        }));
    }
}
