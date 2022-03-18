package com.ss.android.lark.contact.impl.contacts_facade;

import android.content.Context;
import com.larksuite.component.universe_design.badge.UDBadgeView;
import com.larksuite.framework.callback.UICallbackExecutor;
import com.ss.android.lark.contact.impl.p1748c.AbstractC35508b;
import com.ss.android.lark.contact.impl.p1748c.C35503a;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.widget.tab.C59204a;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.lark.contact.impl.contacts_facade.a */
public class C35571a {

    /* renamed from: a */
    public int f92004a;

    /* renamed from: b */
    public AbstractC35575a f92005b;

    /* renamed from: c */
    private AbstractC35508b f92006c;

    /* renamed from: d */
    private AbstractC35508b.AbstractC35509a f92007d = new AbstractC35508b.AbstractC35509a() {
        /* class com.ss.android.lark.contact.impl.contacts_facade.C35571a.C355721 */

        @Override // com.ss.android.lark.contact.impl.p1748c.AbstractC35508b.AbstractC35509a
        /* renamed from: a */
        public void mo130942a(final int i) {
            Log.m165389i("ContactRedDotHelper", "onNewFriendRequestCountChanged = " + i);
            UICallbackExecutor.execute(new Runnable() {
                /* class com.ss.android.lark.contact.impl.contacts_facade.C35571a.C355721.RunnableC355731 */

                public void run() {
                    if (C35571a.this.f92005b != null) {
                        C35571a.this.f92005b.mo131193a(i);
                    }
                }
            });
        }
    };

    /* renamed from: com.ss.android.lark.contact.impl.contacts_facade.a$a */
    public interface AbstractC35575a {
        /* renamed from: a */
        void mo131193a(int i);

        /* renamed from: a */
        void mo131194a(C59204a aVar);
    }

    /* renamed from: a */
    public void mo131197a() {
        AbstractC35508b bVar = this.f92006c;
        if (bVar != null) {
            bVar.mo130937a(this.f92007d);
        }
    }

    /* renamed from: b */
    public void mo131199b() {
        AbstractC35508b bVar = this.f92006c;
        if (bVar != null) {
            bVar.mo130940b(this.f92007d);
        }
    }

    public C35571a(AbstractC35575a aVar) {
        this.f92005b = aVar;
    }

    /* renamed from: a */
    public void mo131198a(Context context) {
        if (this.f92005b != null) {
            this.f92006c = C35503a.m138879a();
            this.f92005b.mo131194a(new C59204a<UDBadgeView, Integer>(context) {
                /* class com.ss.android.lark.contact.impl.contacts_facade.C35571a.C355742 */

                /* access modifiers changed from: protected */
                @Override // com.ss.android.lark.widget.tab.C59204a
                /* renamed from: a */
                public void mo31305a(Context context) {
                    super.mo31305a(context);
                    this.f147019e = new UDBadgeView.Builder().mo90261a(2131887091).mo90262a(context);
                }

                /* renamed from: a */
                public void mo31307a(Integer num) {
                    super.mo31307a((Object) num);
                    if (num.intValue() != C35571a.this.f92004a) {
                        C35571a.this.f92004a = num.intValue();
                        if (num.intValue() == 0) {
                            ((UDBadgeView) mo201282b()).setVisibility(8);
                            return;
                        }
                        String valueOf = String.valueOf(Math.abs(num.intValue()));
                        ((UDBadgeView) mo201282b()).setVisibility(0);
                        ((UDBadgeView) mo201282b()).setText(valueOf);
                        ((UDBadgeView) mo201282b()).mo90238b();
                    }
                }
            });
        }
    }
}
