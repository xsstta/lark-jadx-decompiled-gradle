package com.ss.android.lark.main.app.widgets.desktop.tenant_switcher;

import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.callback.UICallbackExecutor;
import com.larksuite.framework.mvp.BasePresenter;
import com.larksuite.framework.thread.CoreThreadPool;
import com.ss.android.lark.exception.entity.AbstractCallableC37029a;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.main.app.widgets.desktop.tenant_switcher.C44464b;
import com.ss.android.lark.main.app.widgets.desktop.tenant_switcher.entity.C44487b;
import java.util.List;

/* renamed from: com.ss.android.lark.main.app.widgets.desktop.tenant_switcher.d */
public class C44473d extends BasePresenter<C44464b.AbstractC44465a, C44464b.AbstractC44467b, C44464b.AbstractC44467b.AbstractC44468a> {

    /* renamed from: a */
    public boolean f112821a;

    /* renamed from: b */
    public volatile boolean f112822b;

    /* renamed from: c */
    public AbstractC44485a f112823c;

    /* renamed from: com.ss.android.lark.main.app.widgets.desktop.tenant_switcher.d$a */
    public interface AbstractC44485a {
        /* renamed from: a */
        void mo157849a(C44487b bVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C44464b.AbstractC44467b.AbstractC44468a createViewDelegate() {
        return new C44464b.AbstractC44467b.AbstractC44468a() {
            /* class com.ss.android.lark.main.app.widgets.desktop.tenant_switcher.C44473d.C444741 */

            @Override // com.ss.android.lark.main.app.widgets.desktop.tenant_switcher.C44464b.AbstractC44467b.AbstractC44468a
            /* renamed from: a */
            public void mo157886a() {
                CoreThreadPool.getDefault().getFixedThreadPool().submit(new AbstractCallableC37029a<Boolean>() {
                    /* class com.ss.android.lark.main.app.widgets.desktop.tenant_switcher.C44473d.C444741.C444751 */

                    /* access modifiers changed from: protected */
                    /* renamed from: a */
                    public Boolean mo102726b() throws Exception {
                        C44464b.AbstractC44465a aVar = (C44464b.AbstractC44465a) C44473d.this.getModel();
                        if (aVar != null) {
                            aVar.mo157882a(true);
                        }
                        return true;
                    }
                });
            }

            @Override // com.ss.android.lark.main.app.widgets.desktop.tenant_switcher.C44464b.AbstractC44467b.AbstractC44468a
            /* renamed from: a */
            public void mo157887a(C44487b bVar) {
                C44473d.this.mo157894a(bVar);
            }

            @Override // com.ss.android.lark.main.app.widgets.desktop.tenant_switcher.C44464b.AbstractC44467b.AbstractC44468a
            /* renamed from: b */
            public void mo157889b(C44487b bVar) {
                C44473d.this.mo157894a(bVar);
            }

            @Override // com.ss.android.lark.main.app.widgets.desktop.tenant_switcher.C44464b.AbstractC44467b.AbstractC44468a
            /* renamed from: a */
            public void mo157888a(boolean z) {
                C44473d.this.f112822b = true;
                C44473d.this.f112821a = z;
                C44473d.this.mo157895b();
            }
        };
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public C44464b.AbstractC44465a.AbstractC44466a mo157897c() {
        return new C44464b.AbstractC44465a.AbstractC44466a() {
            /* class com.ss.android.lark.main.app.widgets.desktop.tenant_switcher.C44473d.C444825 */

            @Override // com.ss.android.lark.main.app.widgets.desktop.tenant_switcher.C44464b.AbstractC44465a.AbstractC44466a
            /* renamed from: a */
            public void mo157884a() {
                final C44464b.AbstractC44467b bVar = (C44464b.AbstractC44467b) C44473d.this.getView();
                if (bVar != null) {
                    UICallbackExecutor.execute(new Runnable() {
                        /* class com.ss.android.lark.main.app.widgets.desktop.tenant_switcher.C44473d.C444825.RunnableC444842 */

                        public void run() {
                            bVar.mo157859a(false);
                            bVar.mo157860b(0);
                        }
                    });
                }
            }

            @Override // com.ss.android.lark.main.app.widgets.desktop.tenant_switcher.C44464b.AbstractC44465a.AbstractC44466a
            /* renamed from: a */
            public void mo157885a(final List<C44487b> list) {
                C44487b a = C44473d.this.mo157892a(list);
                if (!(C44473d.this.f112823c == null || a == null)) {
                    C44473d.this.f112823c.mo157849a(a);
                }
                C44464b.AbstractC44465a aVar = (C44464b.AbstractC44465a) C44473d.this.getModel();
                final C44464b.AbstractC44467b bVar = (C44464b.AbstractC44467b) C44473d.this.getView();
                if (aVar != null && bVar != null) {
                    UICallbackExecutor.execute(new Runnable() {
                        /* class com.ss.android.lark.main.app.widgets.desktop.tenant_switcher.C44473d.C444825.RunnableC444831 */

                        public void run() {
                            List<C44487b> list = list;
                            if (list != null) {
                                bVar.mo157858a(list);
                            }
                        }
                    });
                }
            }
        };
    }

    /* renamed from: b */
    public void mo157895b() {
        if (this.f112821a && this.f112822b) {
            CoreThreadPool.getDefault().getFixedThreadPool().submit(new AbstractCallableC37029a<Boolean>() {
                /* class com.ss.android.lark.main.app.widgets.desktop.tenant_switcher.C44473d.C444804 */

                /* renamed from: a */
                public Boolean mo102726b() throws Exception {
                    C44464b.AbstractC44465a aVar = (C44464b.AbstractC44465a) C44473d.this.getModel();
                    if (aVar == null) {
                        return true;
                    }
                    final boolean a = aVar.mo157883a();
                    UICallbackExecutor.execute(new Runnable() {
                        /* class com.ss.android.lark.main.app.widgets.desktop.tenant_switcher.C44473d.C444804.RunnableC444811 */

                        public void run() {
                            C44464b.AbstractC44467b bVar = (C44464b.AbstractC44467b) C44473d.this.getView();
                            if (bVar != null && !a) {
                                bVar.mo157854a();
                            }
                        }
                    });
                    return true;
                }
            });
        }
    }

    /* renamed from: a */
    public void mo157893a(AbstractC44485a aVar) {
        this.f112823c = aVar;
    }

    /* renamed from: a */
    public C44487b mo157892a(List<C44487b> list) {
        for (C44487b bVar : list) {
            if (bVar.mo157911d()) {
                return bVar;
            }
        }
        Log.m165383e("MainTenantSwitcherPresenter", "no current user in tenant info list!");
        return null;
    }

    /* renamed from: a */
    public void mo157894a(final C44487b bVar) {
        C44464b.AbstractC44467b bVar2 = (C44464b.AbstractC44467b) getView();
        if (bVar2 != null) {
            bVar2.mo157857a(new C44464b.AbstractC44467b.AbstractC44469b() {
                /* class com.ss.android.lark.main.app.widgets.desktop.tenant_switcher.C44473d.C444762 */

                @Override // com.ss.android.lark.main.app.widgets.desktop.tenant_switcher.C44464b.AbstractC44467b.AbstractC44469b
                /* renamed from: a */
                public void mo157890a() {
                    C44473d.this.mo157896b(bVar);
                }
            });
        }
    }

    /* renamed from: b */
    public void mo157896b(final C44487b bVar) {
        final C44464b.AbstractC44465a aVar = (C44464b.AbstractC44465a) getModel();
        final C44464b.AbstractC44467b bVar2 = (C44464b.AbstractC44467b) getView();
        if (aVar != null && bVar2 != null) {
            bVar2.mo157859a(true);
            CoreThreadPool.getDefault().getFixedThreadPool().submit(new AbstractCallableC37029a<Boolean>() {
                /* class com.ss.android.lark.main.app.widgets.desktop.tenant_switcher.C44473d.C444773 */

                /* renamed from: a */
                public Boolean mo102726b() throws Exception {
                    aVar.mo157881a(bVar, new IGetDataCallback<String>() {
                        /* class com.ss.android.lark.main.app.widgets.desktop.tenant_switcher.C44473d.C444773.C444781 */

                        /* renamed from: a */
                        public void onSuccess(String str) {
                        }

                        @Override // com.larksuite.framework.callback.IGetDataCallback
                        public void onError(final ErrorResult errorResult) {
                            UICallbackExecutor.execute(new Runnable() {
                                /* class com.ss.android.lark.main.app.widgets.desktop.tenant_switcher.C44473d.C444773.C444781.RunnableC444791 */

                                public void run() {
                                    bVar2.mo157859a(false);
                                    if (errorResult.getErrorCode() == 10015) {
                                        bVar2.mo157855a(1);
                                    }
                                }
                            });
                        }
                    });
                    return true;
                }
            });
        }
    }

    public C44473d(C44464b.AbstractC44465a aVar, C44464b.AbstractC44467b bVar) {
        super(aVar, bVar);
        aVar.mo157880a(mo157897c());
    }
}
