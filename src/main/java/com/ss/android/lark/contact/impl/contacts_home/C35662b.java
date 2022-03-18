package com.ss.android.lark.contact.impl.contacts_home;

import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.mvp.BaseModel;
import com.ss.android.lark.chat.entity.chatter.Chatter;
import com.ss.android.lark.contact.C35358a;
import com.ss.android.lark.contact.impl.contacts_home.AbstractC35680f;
import com.ss.android.lark.contact.impl.entity.ExternalContact;
import com.ss.android.lark.contact.impl.interfaces.AbstractC35936a;
import com.ss.android.lark.contact.impl.p1748c.AbstractC35508b;
import com.ss.android.lark.contact.impl.p1748c.C35503a;
import com.ss.android.lark.contact.impl.p1761f.C35890d;
import com.ss.android.lark.contact.impl.p1761f.C35906e;
import com.ss.android.lark.contact.impl.p1761f.C35917f;
import com.ss.android.lark.contact.p1733b.AbstractC35361b;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.pb.role.GetAdminPermissionInfoResponse;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* renamed from: com.ss.android.lark.contact.impl.contacts_home.b */
public class C35662b extends BaseModel implements AbstractC35680f.AbstractC35681a {

    /* renamed from: a */
    AbstractC35361b.AbstractC35367f f92249a;

    /* renamed from: b */
    AbstractC35361b.AbstractC35382u f92250b;

    /* renamed from: c */
    AbstractC35361b.AbstractC35376o f92251c;

    /* renamed from: d */
    AbstractC35936a f92252d = C35906e.m140678a();

    /* renamed from: e */
    AbstractC35508b f92253e = C35503a.m138879a();

    /* renamed from: f */
    public AbstractC35680f.AbstractC35681a.AbstractC35682a f92254f;

    /* renamed from: g */
    private final String f92255g;

    /* renamed from: h */
    private boolean f92256h = false;

    /* renamed from: i */
    private C35890d.AbstractC35904b f92257i = new C35890d.AbstractC35904b() {
        /* class com.ss.android.lark.contact.impl.contacts_home.$$Lambda$b$r11TIB_eC51psQ96vGBTyAEIXk0 */

        @Override // com.ss.android.lark.contact.impl.p1761f.C35890d.AbstractC35904b
        public final void onPushContact(ExternalContact externalContact) {
            C35662b.lambda$r11TIB_eC51psQ96vGBTyAEIXk0(C35662b.this, externalContact);
        }
    };

    /* renamed from: j */
    private AbstractC35508b.AbstractC35509a f92258j = new AbstractC35508b.AbstractC35509a() {
        /* class com.ss.android.lark.contact.impl.contacts_home.C35662b.C356642 */

        @Override // com.ss.android.lark.contact.impl.p1748c.AbstractC35508b.AbstractC35509a
        /* renamed from: a */
        public void mo130942a(int i) {
            if (C35662b.this.f92254f != null) {
                C35662b.this.f92254f.mo131432a(i);
            }
        }
    };

    @Override // com.ss.android.lark.contact.impl.contacts_home.AbstractC35680f.AbstractC35681a
    /* renamed from: b */
    public String mo131412b() {
        return this.f92255g;
    }

    @Override // com.ss.android.lark.contact.impl.contacts_home.AbstractC35680f.AbstractC35681a
    /* renamed from: a */
    public void mo131405a() {
        this.f92253e.mo130938b();
    }

    @Override // com.larksuite.framework.mvp.BaseModel, com.larksuite.framework.mvp.ILifecycle
    public void destroy() {
        super.destroy();
        this.f92253e.mo130940b(this.f92258j);
        if (this.f92256h) {
            C35890d.m140654a().mo132126b(this.f92257i);
        }
        this.f92254f = null;
    }

    @Override // com.larksuite.framework.mvp.BaseModel, com.larksuite.framework.mvp.ILifecycle
    public void create() {
        super.create();
        AbstractC35361b.AbstractC35376o h = C35358a.m138143a().mo130163h();
        this.f92251c = h;
        if (h != null) {
            this.f92256h = h.mo130229a();
        }
        if (this.f92256h) {
            C35890d.m140654a().mo132121a(this.f92257i);
        }
        this.f92249a = C35358a.m138143a().mo130165j();
        this.f92250b = C35358a.m138143a().mo130156d();
        this.f92253e.mo130937a(this.f92258j);
    }

    @Override // com.ss.android.lark.contact.impl.contacts_home.AbstractC35680f.AbstractC35681a
    /* renamed from: a */
    public void mo131408a(AbstractC35680f.AbstractC35681a.AbstractC35682a aVar) {
        this.f92254f = aVar;
    }

    @Override // com.ss.android.lark.contact.impl.contacts_home.AbstractC35680f.AbstractC35681a
    /* renamed from: a */
    public void mo131406a(IGetDataCallback<GetAdminPermissionInfoResponse> iGetDataCallback) {
        C35917f.m140749a().mo132182b(iGetDataCallback);
    }

    /* access modifiers changed from: public */
    /* renamed from: a */
    private /* synthetic */ void m139606a(final ExternalContact externalContact) {
        if (externalContact != null) {
            mo131409a(externalContact.getChatterId(), (IGetDataCallback) getCallbackManager().wrapAndAddCallback(new IGetDataCallback<Chatter>() {
                /* class com.ss.android.lark.contact.impl.contacts_home.C35662b.C356631 */

                @Override // com.larksuite.framework.callback.IGetDataCallback
                public void onError(ErrorResult errorResult) {
                }

                /* renamed from: a */
                public void onSuccess(Chatter chatter) {
                    if (chatter != null) {
                        C35662b.this.mo131407a(chatter, externalContact.isDeleted());
                    }
                }
            }));
        }
    }

    public C35662b(String str) {
        this.f92255g = str;
    }

    /* renamed from: a */
    public void mo131407a(final Chatter chatter, final boolean z) {
        final String tenantId = chatter.getTenantId();
        mo131411a(Collections.singletonList(tenantId), (IGetDataCallback) getCallbackManager().wrapAndAddCallback(new IGetDataCallback<Map<String, String>>() {
            /* class com.ss.android.lark.contact.impl.contacts_home.C35662b.C356664 */

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                Log.m165382e(errorResult.toString());
            }

            /* renamed from: a */
            public void onSuccess(Map<String, String> map) {
                if (C35662b.this.f92254f != null) {
                    C35662b.this.f92254f.mo131433a(chatter, map.get(tenantId), z);
                }
            }
        }));
    }

    @Override // com.ss.android.lark.contact.impl.contacts_home.AbstractC35680f.AbstractC35681a
    /* renamed from: a */
    public void mo131409a(String str, IGetDataCallback<Chatter> iGetDataCallback) {
        this.f92249a.mo130200a(str, (IGetDataCallback) getCallbackManager().wrapAndAddCallback(iGetDataCallback));
    }

    /* renamed from: a */
    public void mo131411a(List<String> list, final IGetDataCallback<Map<String, String>> iGetDataCallback) {
        this.f92250b.mo130257a(list, true, (IGetDataCallback) getCallbackManager().wrapAndAddCallback(new IGetDataCallback<Map<String, String>>() {
            /* class com.ss.android.lark.contact.impl.contacts_home.C35662b.C356653 */

            /* renamed from: a */
            public void onSuccess(Map<String, String> map) {
                IGetDataCallback iGetDataCallback = iGetDataCallback;
                if (iGetDataCallback != null) {
                    iGetDataCallback.onSuccess(map);
                }
            }

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                IGetDataCallback iGetDataCallback = iGetDataCallback;
                if (iGetDataCallback != null) {
                    iGetDataCallback.onError(errorResult);
                }
            }
        }));
    }

    @Override // com.ss.android.lark.contact.impl.contacts_home.AbstractC35680f.AbstractC35681a
    /* renamed from: a */
    public void mo131410a(String str, String str2, IGetDataCallback<Boolean> iGetDataCallback) {
        this.f92252d.mo130288e(str, (IGetDataCallback) getCallbackManager().wrapAndAddCallback(iGetDataCallback));
    }
}
