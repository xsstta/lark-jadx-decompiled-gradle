package com.ss.android.lark.feed.app.menu;

import com.larksuite.framework.callback.CallbackManager;
import com.larksuite.framework.callback.IGetDataCallback;
import com.ss.android.lark.feed.app.menu.AbstractC37663e;
import com.ss.android.lark.feed.app.model.AbstractC37773h;
import com.ss.android.lark.feed.app.model.C37731d;
import com.ss.android.lark.feed.interfaces.AbstractC38087ab;
import com.ss.android.lark.feed.interfaces.AbstractC38102k;
import com.ss.android.lark.feed.p1847a.C37268c;
import java.util.Map;

/* renamed from: com.ss.android.lark.feed.app.menu.a */
public class C37647a implements AbstractC37663e.AbstractC37664a {

    /* renamed from: a */
    public AbstractC37773h f96532a = C37731d.m148488a();

    /* renamed from: b */
    public AbstractC37663e.AbstractC37664a.AbstractC37665a f96533b;

    /* renamed from: c */
    C37731d.AbstractC37734b f96534c = new C37731d.AbstractC37734b() {
        /* class com.ss.android.lark.feed.app.menu.C37647a.C376481 */

        @Override // com.ss.android.lark.feed.app.model.C37731d.AbstractC37734b
        /* renamed from: a */
        public void mo137402a(Map<Integer, Integer> map) {
            if (C37647a.this.f96533b != null) {
                C37647a.this.f96533b.mo138090a(map);
            }
        }
    };

    /* renamed from: d */
    private CallbackManager f96535d = new CallbackManager();

    /* renamed from: e */
    private AbstractC38102k f96536e = new AbstractC38102k() {
        /* class com.ss.android.lark.feed.app.menu.C37647a.C376503 */

        @Override // com.ss.android.lark.feed.interfaces.AbstractC38102k
        /* renamed from: a */
        public void mo138080a() {
            C37647a.this.mo138077a();
        }
    };

    /* renamed from: f */
    private AbstractC38087ab f96537f = new AbstractC38087ab() {
        /* class com.ss.android.lark.feed.app.menu.C37647a.C376492 */

        @Override // com.ss.android.lark.feed.interfaces.AbstractC38087ab
        /* renamed from: a */
        public void mo137283a(boolean z) {
        }

        @Override // com.ss.android.lark.feed.interfaces.AbstractC38087ab
        /* renamed from: a */
        public void mo137282a() {
            if (C37647a.this.f96533b != null) {
                C37647a.this.f96533b.mo138090a(C37647a.this.f96532a.mo138425p());
            }
        }
    };

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void create() {
        m148081b();
    }

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void destroy() {
        m148082c();
    }

    /* renamed from: a */
    public void mo138077a() {
        AbstractC37663e.AbstractC37664a.AbstractC37665a aVar = this.f96533b;
        if (aVar != null) {
            aVar.mo138089a();
        }
    }

    /* renamed from: b */
    private void m148081b() {
        this.f96532a.mo138402a(this.f96534c);
        C37268c.m146767c().mo139338a(this.f96536e);
        C37268c.m146767c().mo139330a(this.f96537f);
    }

    /* renamed from: c */
    private void m148082c() {
        this.f96532a.mo138408b(this.f96534c);
        C37268c.m146767c().mo139350b(this.f96536e);
        CallbackManager callbackManager = this.f96535d;
        if (callbackManager != null) {
            callbackManager.cancelCallbacks();
        }
        C37268c.m146767c().mo139343b(this.f96537f);
    }

    @Override // com.ss.android.lark.feed.app.menu.AbstractC37663e.AbstractC37664a
    /* renamed from: a */
    public void mo138079a(AbstractC37663e.AbstractC37664a.AbstractC37665a aVar) {
        this.f96533b = aVar;
    }

    @Override // com.ss.android.lark.feed.app.menu.AbstractC37663e.AbstractC37664a
    /* renamed from: a */
    public void mo138078a(IGetDataCallback<Map<Integer, Integer>> iGetDataCallback) {
        this.f96535d.wrapAndAddGetDataCallback(iGetDataCallback).onSuccess(this.f96532a.mo138425p());
    }
}
