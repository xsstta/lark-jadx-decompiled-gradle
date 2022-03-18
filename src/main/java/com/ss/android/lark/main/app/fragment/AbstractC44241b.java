package com.ss.android.lark.main.app.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.larksuite.framework.callback.UICallbackExecutor;
import com.larksuite.framework.mvp.BasePresenter;
import com.ss.android.lark.main.C44134a;
import com.ss.android.lark.main.app.fragment.AbstractC44241b;
import com.ss.android.lark.main.app.fragment.C44274f;
import com.ss.android.lark.main.interfaces.AbstractC44499a;
import com.ss.android.lark.main.interfaces.AbstractC44502e;
import com.ss.android.lark.main.interfaces.NetworkLevel;
import com.ss.android.lark.passport.signinsdk_api.account.TenantInfo;
import java.util.List;

/* renamed from: com.ss.android.lark.main.app.fragment.b */
public abstract class AbstractC44241b extends BasePresenter<C44274f.AbstractC44275a, C44274f.AbstractC44277b, C44274f.AbstractC44277b.AbstractC44278a> {

    /* renamed from: a */
    private C44246a f112229a;

    /* renamed from: b */
    private AbstractC44499a f112230b;

    /* renamed from: c */
    private AbstractC44502e f112231c = new AbstractC44502e() {
        /* class com.ss.android.lark.main.app.fragment.AbstractC44241b.C442421 */

        @Override // com.ss.android.lark.main.interfaces.AbstractC44502e
        /* renamed from: a */
        public void mo157283a(final boolean z) {
            UICallbackExecutor.execute(new Runnable() {
                /* class com.ss.android.lark.main.app.fragment.AbstractC44241b.C442421.RunnableC442431 */

                public void run() {
                    ((C44274f.AbstractC44277b) AbstractC44241b.this.getView()).mo157322e(z);
                }
            });
        }
    };

    /* renamed from: a */
    public abstract void mo157276a(Bundle bundle);

    /* renamed from: a */
    public boolean mo157278a(KeyEvent keyEvent) {
        return false;
    }

    /* renamed from: d */
    public abstract Bundle mo157281d();

    /* renamed from: e */
    public abstract boolean mo157282e();

    /* renamed from: f */
    private void mo157349f() {
        this.f112230b = new AbstractC44499a() {
            /* class com.ss.android.lark.main.app.fragment.AbstractC44241b.C442442 */

            @Override // com.ss.android.lark.main.interfaces.AbstractC44499a
            /* renamed from: a */
            public void mo157172a() {
                UICallbackExecutor.execute(new Runnable() {
                    /* class com.ss.android.lark.main.app.fragment.AbstractC44241b.C442442.RunnableC442451 */

                    public void run() {
                        C44274f.AbstractC44277b bVar = (C44274f.AbstractC44277b) AbstractC44241b.this.getView();
                        if (bVar != null) {
                            bVar.mo157314a(false);
                        }
                    }
                });
            }
        };
    }

    /* renamed from: a */
    public C44274f.AbstractC44277b.AbstractC44278a createViewDelegate() {
        return new C44254b();
    }

    /* renamed from: c */
    public C44274f.AbstractC44275a.AbstractC44276a mo157280c() {
        C44246a aVar = new C44246a();
        this.f112229a = aVar;
        return aVar;
    }

    /* renamed from: com.ss.android.lark.main.app.fragment.b$b */
    public class C44254b implements C44274f.AbstractC44277b.AbstractC44278a {
        @Override // com.ss.android.lark.main.app.fragment.C44274f.AbstractC44277b.AbstractC44278a
        /* renamed from: b */
        public void mo157304b() {
            C44274f.AbstractC44275a aVar = (C44274f.AbstractC44275a) AbstractC44241b.this.getModel();
            if (aVar != null) {
                aVar.mo157357b();
            }
        }

        @Override // com.ss.android.lark.main.app.fragment.C44274f.AbstractC44277b.AbstractC44278a
        /* renamed from: a */
        public boolean mo157303a() {
            C44274f.AbstractC44275a aVar = (C44274f.AbstractC44275a) AbstractC44241b.this.getModel();
            if (aVar != null) {
                return aVar.mo157356a();
            }
            return false;
        }

        public C44254b() {
            AbstractC44241b.this = r1;
        }

        @Override // com.ss.android.lark.main.app.fragment.C44274f.AbstractC44277b.AbstractC44278a
        /* renamed from: a */
        public void mo157301a(String str) {
            C44274f.AbstractC44275a aVar = (C44274f.AbstractC44275a) AbstractC44241b.this.getModel();
            if (aVar != null) {
                aVar.mo157354a(str);
            }
        }

        @Override // com.ss.android.lark.main.app.fragment.C44274f.AbstractC44277b.AbstractC44278a
        /* renamed from: a */
        public void mo157302a(boolean z) {
            C44274f.AbstractC44275a aVar = (C44274f.AbstractC44275a) AbstractC44241b.this.getModel();
            if (aVar != null) {
                aVar.mo157355a(z);
            }
        }
    }

    /* renamed from: b */
    public void mo157279b() {
        ((C44274f.AbstractC44277b) getView()).mo157319c();
    }

    @Override // com.larksuite.framework.mvp.BasePresenter, com.larksuite.framework.mvp.ILifecycle
    public void create() {
        super.create();
        C44134a.m174959a().mo133194N().mo133383a(this.f112230b);
        C44134a.m174959a().mo133187G().mo133370a(this.f112231c);
    }

    @Override // com.larksuite.framework.mvp.BasePresenter, com.larksuite.framework.mvp.ILifecycle
    public void destroy() {
        C44134a.m174959a().mo133194N().mo133387b(this.f112230b);
        C44134a.m174959a().mo133187G().mo133372b(this.f112231c);
        super.destroy();
        ((C44274f.AbstractC44277b) getView()).destroy();
        setView(new C44255c());
    }

    /* renamed from: com.ss.android.lark.main.app.fragment.b$a */
    public class C44246a implements C44274f.AbstractC44275a.AbstractC44276a {
        public C44246a() {
            AbstractC44241b.this = r1;
        }

        @Override // com.ss.android.lark.main.app.fragment.C44274f.AbstractC44275a.AbstractC44276a
        /* renamed from: a */
        public void mo157286a(final long j) {
            UICallbackExecutor.execute(new Runnable() {
                /* class com.ss.android.lark.main.app.fragment.AbstractC44241b.C44246a.RunnableC442537 */

                public void run() {
                    C44274f.AbstractC44277b bVar = (C44274f.AbstractC44277b) AbstractC44241b.this.getView();
                    if (bVar != null) {
                        bVar.mo157306a(j);
                    }
                }
            });
        }

        @Override // com.ss.android.lark.main.app.fragment.C44274f.AbstractC44275a.AbstractC44276a
        /* renamed from: c */
        public void mo157293c(final boolean z) {
            UICallbackExecutor.execute(new Runnable() {
                /* class com.ss.android.lark.main.app.fragment.AbstractC44241b.C44246a.RunnableC442515 */

                public void run() {
                    C44274f.AbstractC44277b bVar = (C44274f.AbstractC44277b) AbstractC44241b.this.getView();
                    if (bVar != null) {
                        bVar.mo157321d(z);
                    }
                }
            });
        }

        @Override // com.ss.android.lark.main.app.fragment.C44274f.AbstractC44275a.AbstractC44276a
        /* renamed from: a */
        public void mo157287a(final C44256d dVar) {
            UICallbackExecutor.execute(new Runnable() {
                /* class com.ss.android.lark.main.app.fragment.AbstractC44241b.C44246a.RunnableC442471 */

                public void run() {
                    C44274f.AbstractC44277b bVar = (C44274f.AbstractC44277b) AbstractC44241b.this.getView();
                    if (bVar != null) {
                        View b = dVar.mo157324b();
                        if (dVar.mo157323a()) {
                            bVar.mo157308a(b);
                        } else {
                            bVar.mo157317b(b);
                        }
                    }
                }
            });
        }

        @Override // com.ss.android.lark.main.app.fragment.C44274f.AbstractC44275a.AbstractC44276a
        /* renamed from: b */
        public void mo157292b(final boolean z) {
            UICallbackExecutor.execute(new Runnable() {
                /* class com.ss.android.lark.main.app.fragment.AbstractC44241b.C44246a.RunnableC442504 */

                public void run() {
                    C44274f.AbstractC44277b bVar = (C44274f.AbstractC44277b) AbstractC44241b.this.getView();
                    if (bVar != null) {
                        bVar.mo157320c(z);
                    }
                }
            });
        }

        @Override // com.ss.android.lark.main.app.fragment.C44274f.AbstractC44275a.AbstractC44276a
        /* renamed from: a */
        public void mo157288a(final NetworkLevel networkLevel) {
            UICallbackExecutor.execute(new Runnable() {
                /* class com.ss.android.lark.main.app.fragment.AbstractC44241b.C44246a.RunnableC442526 */

                public void run() {
                    C44274f.AbstractC44277b bVar = (C44274f.AbstractC44277b) AbstractC44241b.this.getView();
                    if (bVar != null) {
                        bVar.mo157310a(networkLevel);
                    }
                }
            });
        }

        @Override // com.ss.android.lark.main.app.fragment.C44274f.AbstractC44275a.AbstractC44276a
        /* renamed from: a */
        public void mo157290a(final List<TenantInfo> list) {
            UICallbackExecutor.execute(new Runnable() {
                /* class com.ss.android.lark.main.app.fragment.AbstractC44241b.C44246a.RunnableC442482 */

                public void run() {
                    C44274f.AbstractC44277b bVar = (C44274f.AbstractC44277b) AbstractC44241b.this.getView();
                    if (bVar != null) {
                        bVar.mo157313a(list);
                    }
                }
            });
        }

        @Override // com.ss.android.lark.main.app.fragment.C44274f.AbstractC44275a.AbstractC44276a
        /* renamed from: a */
        public void mo157291a(final boolean z) {
            UICallbackExecutor.execute(new Runnable() {
                /* class com.ss.android.lark.main.app.fragment.AbstractC44241b.C44246a.RunnableC442493 */

                public void run() {
                    C44274f.AbstractC44277b bVar = (C44274f.AbstractC44277b) AbstractC44241b.this.getView();
                    if (bVar != null) {
                        bVar.mo157318b(z);
                    }
                }
            });
        }

        /* access modifiers changed from: public */
        /* renamed from: b */
        private /* synthetic */ void m175496b(String str, String str2) {
            C44274f.AbstractC44277b bVar = (C44274f.AbstractC44277b) AbstractC44241b.this.getView();
            if (bVar != null) {
                bVar.mo157312a(str, str2);
            }
        }

        @Override // com.ss.android.lark.main.app.fragment.C44274f.AbstractC44275a.AbstractC44276a
        /* renamed from: a */
        public void mo157289a(String str, String str2) {
            UICallbackExecutor.execute(new Runnable(str, str2) {
                /* class com.ss.android.lark.main.app.fragment.$$Lambda$b$a$wwRV3jNp39bw_qqoCL3hzhEC158 */
                public final /* synthetic */ String f$1;
                public final /* synthetic */ String f$2;

                {
                    this.f$1 = r2;
                    this.f$2 = r3;
                }

                public final void run() {
                    AbstractC44241b.C44246a.lambda$wwRV3jNp39bw_qqoCL3hzhEC158(AbstractC44241b.C44246a.this, this.f$1, this.f$2);
                }
            });
        }
    }

    /* renamed from: a */
    public void mo157277a(boolean z) {
        C44274f.AbstractC44275a aVar = (C44274f.AbstractC44275a) getModel();
        if (aVar != null) {
            aVar.mo157355a(z);
        }
    }

    public AbstractC44241b(C44274f.AbstractC44275a aVar, C44274f.AbstractC44277b bVar) {
        super(aVar, bVar);
        aVar.mo157353a(mo157280c());
        mo157349f();
    }

    /* renamed from: a */
    public void mo157275a(int i, int i2, Intent intent) {
        Fragment a = ((C44274f.AbstractC44277b) getView()).mo157305a();
        if (a != null) {
            a.onActivityResult(i, i2, intent);
        }
    }
}
