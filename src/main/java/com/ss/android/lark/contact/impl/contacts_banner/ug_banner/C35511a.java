package com.ss.android.lark.contact.impl.contacts_banner.ug_banner;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.larksuite.framework.callback.UICallbackExecutor;
import com.larksuite.framework.thread.CoreThreadPool;
import com.ss.android.lark.banner.export.AbstractC29478a;
import com.ss.android.lark.banner.export.AbstractC29479b;
import com.ss.android.lark.banner.export.AbstractC29491f;
import com.ss.android.lark.contact.C35358a;
import com.ss.android.lark.contact.impl.contacts_banner.ug_banner.p1749a.C35514a;
import com.ss.android.lark.contact.impl.contacts_banner.ug_banner.p1749a.View$OnAttachStateChangeListenerC35515b;
import com.ss.android.lark.contact.impl.contacts_banner.ug_banner.permission.C35525a;
import com.ss.android.lark.contact.impl.contacts_banner.ug_banner.permission.C35526b;
import com.ss.android.lark.contact.impl.contacts_banner.ug_banner.permission.View$OnAttachStateChangeListenerC35527c;
import java.lang.ref.WeakReference;

/* renamed from: com.ss.android.lark.contact.impl.contacts_banner.ug_banner.a */
public class C35511a implements IContactBannerLoader {

    /* renamed from: a */
    public final WeakReference<ViewGroup> f91800a;

    /* renamed from: b */
    public volatile WeakReference<Context> f91801b;

    /* renamed from: c */
    private volatile AbstractC29479b f91802c;

    /* renamed from: d */
    private void m138897d() {
        this.f91802c.mo104347a(new AbstractC29479b.AbstractC29480a() {
            /* class com.ss.android.lark.contact.impl.contacts_banner.ug_banner.C35511a.C355121 */

            @Override // com.ss.android.lark.banner.export.AbstractC29479b.AbstractC29480a
            /* renamed from: a */
            public void mo16922a() {
                Context context = C35511a.this.f91801b.get();
                if (context != null) {
                    C35511a.this.mo130948a(context, (AbstractC29478a) null);
                }
            }

            @Override // com.ss.android.lark.banner.export.AbstractC29479b.AbstractC29480a
            /* renamed from: a */
            public void mo16923a(AbstractC29478a aVar) {
                Context context = C35511a.this.f91801b.get();
                if (context != null) {
                    C35511a.this.mo130948a(context, aVar);
                }
            }
        });
    }

    /* renamed from: f */
    private void m138899f() {
        this.f91802c.mo104348a(C35525a.m138941a());
    }

    @Override // com.ss.android.lark.contact.impl.contacts_banner.ug_banner.IContactBannerLoader
    /* renamed from: a */
    public ViewGroup mo130946a() {
        return this.f91800a.get();
    }

    /* renamed from: e */
    private void m138898e() {
        this.f91802c.mo104350a("ContactsUpgradetoTeam", new C35514a());
        this.f91802c.mo104350a("ContactsPermission", new C35526b());
    }

    /* access modifiers changed from: public */
    /* renamed from: g */
    private /* synthetic */ void m138900g() {
        if (this.f91801b.get() != null && this.f91800a.get() != null) {
            m138896c();
        }
    }

    @Override // com.ss.android.lark.contact.impl.contacts_banner.ug_banner.IContactBannerLoader
    /* renamed from: b */
    public synchronized void mo130950b() {
        if (this.f91802c != null) {
            this.f91802c.mo104357e();
            this.f91802c = null;
        }
        this.f91800a.clear();
    }

    /* renamed from: c */
    private synchronized void m138896c() {
        if (this.f91802c == null) {
            this.f91802c = C35358a.m138143a().mo130172q().mo130190a();
            m138897d();
            m138898e();
            m138899f();
            this.f91802c.mo104356d();
        }
        this.f91802c.mo104345a();
    }

    public C35511a(ViewGroup viewGroup) {
        this.f91800a = new WeakReference<>(viewGroup);
    }

    @Override // com.ss.android.lark.contact.impl.contacts_banner.ug_banner.IContactBannerLoader
    /* renamed from: a */
    public void mo130947a(Context context) {
        this.f91801b = new WeakReference<>(context);
        CoreThreadPool.getDefault().getFixedThreadPool().submit(new Runnable() {
            /* class com.ss.android.lark.contact.impl.contacts_banner.ug_banner.$$Lambda$a$L0FmeDEbmraVMWWP21J2feJ0t_c */

            public final void run() {
                C35511a.lambda$L0FmeDEbmraVMWWP21J2feJ0t_c(C35511a.this);
            }
        });
    }

    /* renamed from: a */
    public void mo130948a(final Context context, final AbstractC29478a aVar) {
        UICallbackExecutor.execute(new Runnable() {
            /* class com.ss.android.lark.contact.impl.contacts_banner.ug_banner.C35511a.RunnableC355132 */

            public void run() {
                View a;
                ViewGroup viewGroup = C35511a.this.f91800a.get();
                if (viewGroup == null) {
                    C35511a.this.mo130950b();
                    return;
                }
                if (viewGroup.getChildCount() > 0) {
                    viewGroup.removeAllViews();
                }
                AbstractC29478a aVar = aVar;
                if (aVar != null && (a = aVar.mo104364a(context)) != null) {
                    C35511a.this.mo130949a(aVar, a);
                    viewGroup.addView(a);
                }
            }
        });
    }

    /* renamed from: a */
    public void mo130949a(AbstractC29478a aVar, View view) {
        if (aVar instanceof AbstractC29491f) {
            AbstractC29491f fVar = (AbstractC29491f) aVar;
            if (TextUtils.equals(fVar.mo104447d(), "ContactsUpgradetoTeam")) {
                new View$OnAttachStateChangeListenerC35515b().mo130953a(view);
            } else if (TextUtils.equals(fVar.mo104447d(), "ContactsPermission")) {
                new View$OnAttachStateChangeListenerC35527c().mo130968a(view);
            }
        }
    }
}
