package com.ss.android.lark.contact.impl.contacts_robot;

import com.larksuite.framework.callback.UICallbackExecutor;
import com.larksuite.framework.mvp.BasePresenter;
import com.ss.android.lark.chat.entity.chatter.Chatter;
import com.ss.android.lark.contact.impl.contacts_robot.AbstractC35717a;
import java.util.List;

/* renamed from: com.ss.android.lark.contact.impl.contacts_robot.d */
public class C35728d extends BasePresenter<AbstractC35717a.AbstractC35718a, AbstractC35717a.AbstractC35721b, AbstractC35717a.AbstractC35721b.AbstractC35722a> {
    /* access modifiers changed from: protected */
    /* renamed from: a */
    public AbstractC35717a.AbstractC35721b.AbstractC35722a createViewDelegate() {
        return new C35735b();
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public AbstractC35717a.AbstractC35718a.AbstractC35719a mo131530b() {
        return new C35733a();
    }

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.lark.contact.impl.contacts_robot.d$a */
    public class C35733a implements AbstractC35717a.AbstractC35718a.AbstractC35719a {
        @Override // com.ss.android.lark.contact.impl.contacts_robot.AbstractC35717a.AbstractC35718a.AbstractC35719a
        /* renamed from: a */
        public void mo131520a() {
            UICallbackExecutor.execute(new Runnable() {
                /* class com.ss.android.lark.contact.impl.contacts_robot.C35728d.C35733a.RunnableC357341 */

                public void run() {
                    AbstractC35717a.AbstractC35721b bVar = (AbstractC35717a.AbstractC35721b) C35728d.this.getView();
                    if (bVar != null) {
                        bVar.mo131513b();
                    }
                }
            });
        }

        private C35733a() {
        }
    }

    /* renamed from: com.ss.android.lark.contact.impl.contacts_robot.d$b */
    public class C35735b implements AbstractC35717a.AbstractC35721b.AbstractC35722a {
        @Override // com.ss.android.lark.contact.impl.contacts_robot.AbstractC35717a.AbstractC35721b.AbstractC35722a
        /* renamed from: b */
        public void mo131525b() {
            AbstractC35717a.AbstractC35718a aVar = (AbstractC35717a.AbstractC35718a) C35728d.this.getModel();
            if (aVar != null) {
                aVar.mo131519b();
            }
        }

        @Override // com.ss.android.lark.contact.impl.contacts_robot.AbstractC35717a.AbstractC35721b.AbstractC35722a
        /* renamed from: a */
        public boolean mo131524a() {
            AbstractC35717a.AbstractC35718a aVar = (AbstractC35717a.AbstractC35718a) C35728d.this.getModel();
            if (aVar == null) {
                return false;
            }
            return aVar.mo131518a();
        }

        public C35735b() {
        }
    }

    @Override // com.larksuite.framework.mvp.BasePresenter, com.larksuite.framework.mvp.ILifecycle
    public void create() {
        super.create();
        ((AbstractC35717a.AbstractC35718a) getModel()).mo131517a(new AbstractC35717a.AbstractC35718a.AbstractC35720b() {
            /* class com.ss.android.lark.contact.impl.contacts_robot.C35728d.C357291 */

            @Override // com.ss.android.lark.contact.impl.contacts_robot.AbstractC35717a.AbstractC35718a.AbstractC35720b
            /* renamed from: a */
            public void mo131521a() {
                UICallbackExecutor.execute(new Runnable() {
                    /* class com.ss.android.lark.contact.impl.contacts_robot.C35728d.C357291.RunnableC357301 */

                    public void run() {
                        AbstractC35717a.AbstractC35721b bVar = (AbstractC35717a.AbstractC35721b) C35728d.this.getView();
                        if (bVar != null) {
                            bVar.mo131509a();
                        }
                    }
                });
            }

            @Override // com.ss.android.lark.contact.impl.contacts_robot.AbstractC35717a.AbstractC35718a.AbstractC35720b
            /* renamed from: b */
            public void mo131523b(final List<Chatter> list) {
                UICallbackExecutor.execute(new Runnable() {
                    /* class com.ss.android.lark.contact.impl.contacts_robot.C35728d.C357291.RunnableC357312 */

                    public void run() {
                        AbstractC35717a.AbstractC35721b bVar = (AbstractC35717a.AbstractC35721b) C35728d.this.getView();
                        if (bVar != null) {
                            bVar.mo131511a(list);
                        }
                    }
                });
            }

            @Override // com.ss.android.lark.contact.impl.contacts_robot.AbstractC35717a.AbstractC35718a.AbstractC35720b
            /* renamed from: a */
            public void mo131522a(final List<Chatter> list) {
                UICallbackExecutor.execute(new Runnable() {
                    /* class com.ss.android.lark.contact.impl.contacts_robot.C35728d.C357291.RunnableC357323 */

                    public void run() {
                        AbstractC35717a.AbstractC35721b bVar = (AbstractC35717a.AbstractC35721b) C35728d.this.getView();
                        if (bVar != null) {
                            bVar.mo131514b(list);
                        }
                    }
                });
            }
        });
    }

    public C35728d(AbstractC35717a.AbstractC35718a aVar, AbstractC35717a.AbstractC35721b bVar) {
        super(aVar, bVar);
        aVar.mo131516a(mo131530b());
    }
}
