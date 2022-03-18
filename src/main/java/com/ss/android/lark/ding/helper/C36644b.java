package com.ss.android.lark.ding.helper;

import android.app.Activity;
import android.content.Context;
import com.ss.android.lark.C37030f;
import com.ss.android.lark.ding.helper.p1804a.AbstractC36641b;
import com.ss.android.lark.ding.helper.p1804a.C36640a;
import com.ss.android.lark.ding.helper.view.AbstractC36671c;
import com.ss.android.lark.ding.helper.view.FloatDialogView;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.widget.floatwindow.AbstractC58451a;
import java.util.List;

/* renamed from: com.ss.android.lark.ding.helper.b */
public class C36644b {

    /* renamed from: a */
    public AbstractC36641b f94253a;

    /* renamed from: b */
    public AbstractC36671c f94254b;

    /* renamed from: c */
    private Context f94255c;

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.lark.ding.helper.b$a */
    public static class C36647a {

        /* renamed from: a */
        public static final C36644b f94258a = new C36644b();
    }

    /* renamed from: a */
    public static C36644b m144618a() {
        return C36647a.f94258a;
    }

    /* renamed from: g */
    public void mo135224g() {
        this.f94254b.mo135241c();
    }

    /* renamed from: com.ss.android.lark.ding.helper.b$b */
    protected class C36648b implements AbstractC36671c.AbstractC36672a {
        @Override // com.ss.android.lark.ding.helper.view.AbstractC36671c.AbstractC36672a
        /* renamed from: a */
        public void mo135226a() {
            C36644b.this.f94253a.mo135207b(new AbstractC36641b.AbstractC36642a() {
                /* class com.ss.android.lark.ding.helper.C36644b.C36648b.C366491 */

                @Override // com.ss.android.lark.ding.helper.p1804a.AbstractC36641b.AbstractC36642a
                /* renamed from: a */
                public void mo135210a() {
                    C36644b.this.mo135223f();
                }

                @Override // com.ss.android.lark.ding.helper.p1804a.AbstractC36641b.AbstractC36642a
                /* renamed from: a */
                public void mo135211a(AbstractC58451a aVar) {
                    C36644b.this.f94254b.mo135239b();
                }
            });
        }

        protected C36648b() {
        }

        @Override // com.ss.android.lark.ding.helper.view.AbstractC36671c.AbstractC36672a
        /* renamed from: a */
        public void mo135227a(String str) {
            if (!C36644b.this.f94253a.mo135201a().isEmpty() && C36644b.this.f94253a.mo135206b().mo117929a().equals(str)) {
                C36644b.this.mo135220c();
            }
        }
    }

    /* renamed from: c */
    public void mo135220c() {
        this.f94253a.mo135202a(new AbstractC36641b.AbstractC36642a() {
            /* class com.ss.android.lark.ding.helper.C36644b.C366462 */

            @Override // com.ss.android.lark.ding.helper.p1804a.AbstractC36641b.AbstractC36642a
            /* renamed from: a */
            public void mo135210a() {
            }

            @Override // com.ss.android.lark.ding.helper.p1804a.AbstractC36641b.AbstractC36642a
            /* renamed from: a */
            public void mo135211a(AbstractC58451a aVar) {
                C36644b.this.f94254b.mo135242c(C36644b.this.f94253a.mo135201a());
            }
        });
    }

    /* renamed from: d */
    public int mo135221d() {
        return this.f94253a.mo135201a().size();
    }

    /* renamed from: e */
    public boolean mo135222e() {
        return this.f94253a.mo135201a().isEmpty();
    }

    /* renamed from: f */
    public void mo135223f() {
        this.f94254b.mo135244d(this.f94253a.mo135201a());
    }

    /* renamed from: h */
    public void mo135225h() {
        this.f94253a.mo135209c();
        this.f94254b.mo135243d();
    }

    /* renamed from: b */
    public void mo135218b() {
        Log.m165389i("FloatDialogHelper", "showCurrentCard");
        this.f94254b.mo135240b(this.f94253a.mo135201a());
    }

    private C36644b() {
        this.f94255c = C37030f.m146093a().mo103021a();
        this.f94253a = new C36640a();
        this.f94254b = new FloatDialogView(this.f94255c, new C36648b());
    }

    /* renamed from: a */
    public void mo135213a(Activity activity) {
        this.f94254b.mo135235a(activity);
    }

    /* renamed from: a */
    public void mo135215a(String str) {
        this.f94253a.mo135203a(str, new AbstractC36641b.AbstractC36643b() {
            /* class com.ss.android.lark.ding.helper.C36644b.C366451 */

            @Override // com.ss.android.lark.ding.helper.p1804a.AbstractC36641b.AbstractC36642a
            /* renamed from: a */
            public void mo135210a() {
            }

            @Override // com.ss.android.lark.ding.helper.p1804a.AbstractC36641b.AbstractC36642a
            /* renamed from: a */
            public void mo135211a(AbstractC58451a aVar) {
                C36644b.this.f94254b.mo135242c(C36644b.this.f94253a.mo135201a());
            }

            @Override // com.ss.android.lark.ding.helper.p1804a.AbstractC36641b.AbstractC36643b
            /* renamed from: a */
            public void mo135212a(int i, AbstractC58451a aVar) {
                C36644b.this.f94254b.mo135234a(i);
            }
        });
    }

    /* renamed from: a */
    public void mo135214a(AbstractC58451a aVar) {
        if (this.f94253a.mo135205a(aVar)) {
            this.f94254b.mo135236a(this.f94253a.mo135206b());
        }
    }

    /* renamed from: a */
    public void mo135216a(List<AbstractC58451a> list) {
        this.f94253a.mo135208b(list);
    }

    /* renamed from: b */
    public void mo135219b(List<AbstractC58451a> list) {
        Log.m165389i("FloatDialogHelper", "showCardList + newList.size > " + list.size());
        this.f94253a.mo135204a(list);
        this.f94254b.mo135237a(this.f94253a.mo135201a());
    }

    /* renamed from: a */
    public void mo135217a(boolean z) {
        this.f94254b.mo135238a(z);
    }
}
