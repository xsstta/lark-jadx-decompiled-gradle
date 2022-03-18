package com.ss.android.lark.contact.impl.p1748c;

import android.text.TextUtils;
import com.larksuite.framework.callback.CallbackManager;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.ss.android.lark.contact.C35358a;
import com.ss.android.lark.contact.feat.newContact.IPushNewContactBadgeListener;
import com.ss.android.lark.contact.impl.interfaces.AbstractC35936a;
import com.ss.android.lark.contact.impl.p1748c.AbstractC35508b;
import com.ss.android.lark.contact.impl.p1761f.C35890d;
import com.ss.android.lark.contact.impl.p1761f.C35906e;
import com.ss.android.lark.contact.p1734c.AbstractC35383a;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.ss.android.lark.contact.impl.c.a */
public class C35503a implements AbstractC35508b {

    /* renamed from: a */
    ConcurrentHashMap<AbstractC35508b.AbstractC35509a, Integer> f91786a;

    /* renamed from: b */
    private volatile boolean f91787b;

    /* renamed from: c */
    private AbstractC35936a f91788c;

    /* renamed from: d */
    private int f91789d;

    /* renamed from: e */
    private String f91790e;

    /* renamed from: f */
    private CallbackManager f91791f;

    /* renamed from: g */
    private IPushNewContactBadgeListener f91792g;

    /* renamed from: h */
    private AbstractC35383a f91793h;

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.lark.contact.impl.c.a$a */
    public static class C35507a {

        /* renamed from: a */
        static C35503a f91798a = new C35503a();
    }

    /* renamed from: a */
    public static C35503a m138879a() {
        return C35507a.f91798a;
    }

    @Override // com.ss.android.lark.contact.impl.p1748c.AbstractC35508b
    /* renamed from: b */
    public synchronized void mo130938b() {
        mo130936a((IGetDataCallback<Integer>) null);
    }

    private C35503a() {
        this.f91786a = new ConcurrentHashMap<>();
        this.f91789d = 0;
        this.f91791f = new CallbackManager();
        this.f91792g = new IPushNewContactBadgeListener() {
            /* class com.ss.android.lark.contact.impl.p1748c.C35503a.C355041 */

            @Override // com.ss.android.lark.contact.feat.newContact.IPushNewContactBadgeListener
            /* renamed from: a */
            public void mo130722a(int i) {
                C35503a.this.mo130935a(i);
                C35503a.this.mo130939b(i);
            }
        };
        this.f91793h = new AbstractC35383a() {
            /* class com.ss.android.lark.contact.impl.p1748c.C35503a.C355052 */

            @Override // com.ss.android.lark.contact.p1734c.AbstractC35383a
            /* renamed from: a */
            public void mo130260a(boolean z) {
                if (z) {
                    C35503a.this.mo130936a((IGetDataCallback<Integer>) null);
                }
            }
        };
        this.f91788c = C35906e.m140678a();
    }

    /* renamed from: c */
    private synchronized void m138880c() {
        if (!this.f91787b) {
            this.f91787b = true;
            C35890d.m140654a().mo132120a(this.f91792g);
            C35358a.m138143a().mo130148a(this.f91793h);
        }
    }

    /* renamed from: a */
    public void mo130935a(int i) {
        this.f91789d = i;
    }

    /* renamed from: a */
    public void mo130936a(final IGetDataCallback<Integer> iGetDataCallback) {
        this.f91788c.mo132140a((IGetDataCallback) this.f91791f.wrapAndAddCallback(new IGetDataCallback<AbstractC35936a.C35937a>() {
            /* class com.ss.android.lark.contact.impl.p1748c.C35503a.C355063 */

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                IGetDataCallback iGetDataCallback = iGetDataCallback;
                if (iGetDataCallback != null) {
                    iGetDataCallback.onError(errorResult);
                }
            }

            /* renamed from: a */
            public void onSuccess(AbstractC35936a.C35937a aVar) {
                if (aVar != null) {
                    int a = aVar.mo132215a();
                    IGetDataCallback iGetDataCallback = iGetDataCallback;
                    if (iGetDataCallback != null) {
                        iGetDataCallback.onSuccess(Integer.valueOf(a));
                    }
                    C35503a.this.mo130935a(a);
                    C35503a.this.mo130939b(a);
                }
            }
        }));
    }

    /* renamed from: b */
    public void mo130939b(int i) {
        for (AbstractC35508b.AbstractC35509a aVar : this.f91786a.keySet()) {
            if (aVar != null) {
                aVar.mo130942a(i);
            }
        }
    }

    @Override // com.ss.android.lark.contact.impl.p1748c.AbstractC35508b
    /* renamed from: a */
    public synchronized void mo130937a(AbstractC35508b.AbstractC35509a aVar) {
        this.f91786a.put(aVar, 0);
        String c = C35358a.m138143a().mo130163h().mo130231c();
        if (!TextUtils.equals(this.f91790e, c)) {
            this.f91790e = c;
            mo130938b();
        }
        if (this.f91787b) {
            mo130939b(this.f91789d);
        } else {
            m138880c();
        }
    }

    @Override // com.ss.android.lark.contact.impl.p1748c.AbstractC35508b
    /* renamed from: b */
    public synchronized void mo130940b(AbstractC35508b.AbstractC35509a aVar) {
        this.f91786a.remove(aVar);
    }
}
