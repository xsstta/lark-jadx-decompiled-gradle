package com.ss.android.lark.contact.impl.setting.mvp;

import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.callback.UIGetDataCallback;
import com.larksuite.framework.mvp.BasePresenter;
import com.ss.android.lark.contact.impl.setting.mvp.AbstractC36004a;
import com.ss.android.lark.contact.impl.setting.service.entity.C36064a;
import com.ss.android.lark.contact.impl.setting.service.entity.C36067c;
import com.ss.android.lark.contact.impl.setting.service.entity.C36069e;
import com.ss.android.lark.contact.impl.setting.service.entity.WayToAddMeSettingItem;

/* renamed from: com.ss.android.lark.contact.impl.setting.mvp.c */
public class C36011c extends BasePresenter<AbstractC36004a.AbstractC36005a, AbstractC36004a.AbstractC36006b, AbstractC36004a.AbstractC36006b.AbstractC36007a> {

    /* renamed from: a */
    private AbstractC36004a.AbstractC36006b.AbstractC36007a f93080a;

    @Override // com.larksuite.framework.mvp.BasePresenter, com.larksuite.framework.mvp.ILifecycle
    public void create() {
        super.create();
        m141214d();
    }

    @Override // com.larksuite.framework.mvp.BasePresenter, com.larksuite.framework.mvp.ILifecycle
    public void destroy() {
        super.destroy();
        this.f93080a = null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public AbstractC36004a.AbstractC36006b.AbstractC36007a createViewDelegate() {
        C36016a aVar = new C36016a();
        this.f93080a = aVar;
        return aVar;
    }

    /* renamed from: b */
    public void mo132455b() {
        ((AbstractC36004a.AbstractC36005a) getModel()).mo132439b(new UIGetDataCallback(new IGetDataCallback<C36067c>() {
            /* class com.ss.android.lark.contact.impl.setting.mvp.C36011c.C360143 */

            /* renamed from: a */
            public void onSuccess(C36067c cVar) {
                ((AbstractC36004a.AbstractC36006b) C36011c.this.getView()).mo132410a(cVar);
            }

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                ((AbstractC36004a.AbstractC36006b) C36011c.this.getView()).mo132416b();
            }
        }));
    }

    /* renamed from: c */
    public void mo132456c() {
        ((AbstractC36004a.AbstractC36005a) getModel()).mo132441d(new UIGetDataCallback(new IGetDataCallback<C36064a>() {
            /* class com.ss.android.lark.contact.impl.setting.mvp.C36011c.C360154 */

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
            }

            /* renamed from: a */
            public void onSuccess(C36064a aVar) {
                ((AbstractC36004a.AbstractC36006b) C36011c.this.getView()).mo132411a(C36011c.this.mo132454a(aVar));
            }
        }));
    }

    /* renamed from: d */
    private void m141214d() {
        ((AbstractC36004a.AbstractC36005a) getModel()).mo132435a(new UIGetDataCallback(new IGetDataCallback<C36067c>() {
            /* class com.ss.android.lark.contact.impl.setting.mvp.C36011c.C360121 */

            /* renamed from: a */
            private void m141219a() {
                ((AbstractC36004a.AbstractC36006b) C36011c.this.getView()).mo132416b();
                C36011c.this.mo132455b();
            }

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                m141219a();
            }

            /* renamed from: a */
            public void onSuccess(C36067c cVar) {
                ((AbstractC36004a.AbstractC36006b) C36011c.this.getView()).mo132410a(cVar);
                m141219a();
            }
        }));
        ((AbstractC36004a.AbstractC36005a) getModel()).mo132440c(new UIGetDataCallback(new IGetDataCallback<C36064a>() {
            /* class com.ss.android.lark.contact.impl.setting.mvp.C36011c.C360132 */

            /* renamed from: a */
            private void m141221a() {
                C36011c.this.mo132456c();
            }

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                m141221a();
            }

            /* renamed from: a */
            public void onSuccess(C36064a aVar) {
                ((AbstractC36004a.AbstractC36006b) C36011c.this.getView()).mo132411a(C36011c.this.mo132454a(aVar));
                m141221a();
            }
        }));
    }

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.lark.contact.impl.setting.mvp.c$a */
    public class C36016a implements AbstractC36004a.AbstractC36006b.AbstractC36007a {
        private C36016a() {
        }

        @Override // com.ss.android.lark.contact.impl.setting.mvp.AbstractC36004a.AbstractC36006b.AbstractC36007a
        /* renamed from: b */
        public void mo132444b(final boolean z) {
            ((AbstractC36004a.AbstractC36005a) C36011c.this.getModel()).mo132436a(new WayToAddMeSettingItem(WayToAddMeSettingItem.AddMeType.CONTACT_TOKEN, z), new UIGetDataCallback(new IGetDataCallback<Void>() {
                /* class com.ss.android.lark.contact.impl.setting.mvp.C36011c.C36016a.C360182 */

                /* renamed from: a */
                public void onSuccess(Void r2) {
                    ((AbstractC36004a.AbstractC36006b) C36011c.this.getView()).mo132417b(z);
                }

                @Override // com.larksuite.framework.callback.IGetDataCallback
                public void onError(ErrorResult errorResult) {
                    ((AbstractC36004a.AbstractC36006b) C36011c.this.getView()).mo132417b(!z);
                    ((AbstractC36004a.AbstractC36006b) C36011c.this.getView()).mo132407a();
                }
            }));
        }

        @Override // com.ss.android.lark.contact.impl.setting.mvp.AbstractC36004a.AbstractC36006b.AbstractC36007a
        /* renamed from: c */
        public void mo132445c(final boolean z) {
            ((AbstractC36004a.AbstractC36005a) C36011c.this.getModel()).mo132436a(new WayToAddMeSettingItem(WayToAddMeSettingItem.AddMeType.GROUP_CHAT, z), new UIGetDataCallback(new IGetDataCallback<Void>() {
                /* class com.ss.android.lark.contact.impl.setting.mvp.C36011c.C36016a.C360193 */

                /* renamed from: a */
                public void onSuccess(Void r2) {
                    ((AbstractC36004a.AbstractC36006b) C36011c.this.getView()).mo132419c(z);
                }

                @Override // com.larksuite.framework.callback.IGetDataCallback
                public void onError(ErrorResult errorResult) {
                    ((AbstractC36004a.AbstractC36006b) C36011c.this.getView()).mo132419c(!z);
                    ((AbstractC36004a.AbstractC36006b) C36011c.this.getView()).mo132407a();
                }
            }));
        }

        @Override // com.ss.android.lark.contact.impl.setting.mvp.AbstractC36004a.AbstractC36006b.AbstractC36007a
        /* renamed from: d */
        public void mo132446d(final boolean z) {
            ((AbstractC36004a.AbstractC36005a) C36011c.this.getModel()).mo132436a(new WayToAddMeSettingItem(WayToAddMeSettingItem.AddMeType.SCHEDULE, z), new UIGetDataCallback(new IGetDataCallback<Void>() {
                /* class com.ss.android.lark.contact.impl.setting.mvp.C36011c.C36016a.C360204 */

                /* renamed from: a */
                public void onSuccess(Void r2) {
                    ((AbstractC36004a.AbstractC36006b) C36011c.this.getView()).mo132420d(z);
                }

                @Override // com.larksuite.framework.callback.IGetDataCallback
                public void onError(ErrorResult errorResult) {
                    ((AbstractC36004a.AbstractC36006b) C36011c.this.getView()).mo132420d(!z);
                    ((AbstractC36004a.AbstractC36006b) C36011c.this.getView()).mo132407a();
                }
            }));
        }

        @Override // com.ss.android.lark.contact.impl.setting.mvp.AbstractC36004a.AbstractC36006b.AbstractC36007a
        /* renamed from: e */
        public void mo132447e(final boolean z) {
            ((AbstractC36004a.AbstractC36005a) C36011c.this.getModel()).mo132436a(new WayToAddMeSettingItem(WayToAddMeSettingItem.AddMeType.DOCUMENT, z), new UIGetDataCallback(new IGetDataCallback<Void>() {
                /* class com.ss.android.lark.contact.impl.setting.mvp.C36011c.C36016a.C360215 */

                /* renamed from: a */
                public void onSuccess(Void r2) {
                    ((AbstractC36004a.AbstractC36006b) C36011c.this.getView()).mo132421e(z);
                }

                @Override // com.larksuite.framework.callback.IGetDataCallback
                public void onError(ErrorResult errorResult) {
                    ((AbstractC36004a.AbstractC36006b) C36011c.this.getView()).mo132421e(!z);
                    ((AbstractC36004a.AbstractC36006b) C36011c.this.getView()).mo132407a();
                }
            }));
        }

        @Override // com.ss.android.lark.contact.impl.setting.mvp.AbstractC36004a.AbstractC36006b.AbstractC36007a
        /* renamed from: f */
        public void mo132448f(final boolean z) {
            ((AbstractC36004a.AbstractC36005a) C36011c.this.getModel()).mo132436a(new WayToAddMeSettingItem(WayToAddMeSettingItem.AddMeType.MEETING, z), new UIGetDataCallback(new IGetDataCallback<Void>() {
                /* class com.ss.android.lark.contact.impl.setting.mvp.C36011c.C36016a.C360226 */

                /* renamed from: a */
                public void onSuccess(Void r2) {
                    ((AbstractC36004a.AbstractC36006b) C36011c.this.getView()).mo132422f(z);
                }

                @Override // com.larksuite.framework.callback.IGetDataCallback
                public void onError(ErrorResult errorResult) {
                    ((AbstractC36004a.AbstractC36006b) C36011c.this.getView()).mo132422f(!z);
                    ((AbstractC36004a.AbstractC36006b) C36011c.this.getView()).mo132407a();
                }
            }));
        }

        @Override // com.ss.android.lark.contact.impl.setting.mvp.AbstractC36004a.AbstractC36006b.AbstractC36007a
        /* renamed from: g */
        public void mo132449g(final boolean z) {
            ((AbstractC36004a.AbstractC36005a) C36011c.this.getModel()).mo132436a(new WayToAddMeSettingItem(WayToAddMeSettingItem.AddMeType.MAIL, z), new UIGetDataCallback(new IGetDataCallback<Void>() {
                /* class com.ss.android.lark.contact.impl.setting.mvp.C36011c.C36016a.C360237 */

                /* renamed from: a */
                public void onSuccess(Void r2) {
                    ((AbstractC36004a.AbstractC36006b) C36011c.this.getView()).mo132423g(z);
                }

                @Override // com.larksuite.framework.callback.IGetDataCallback
                public void onError(ErrorResult errorResult) {
                    ((AbstractC36004a.AbstractC36006b) C36011c.this.getView()).mo132423g(!z);
                    ((AbstractC36004a.AbstractC36006b) C36011c.this.getView()).mo132407a();
                }
            }));
        }

        @Override // com.ss.android.lark.contact.impl.setting.mvp.AbstractC36004a.AbstractC36006b.AbstractC36007a
        /* renamed from: h */
        public void mo132450h(final boolean z) {
            ((AbstractC36004a.AbstractC36005a) C36011c.this.getModel()).mo132438a(z, new UIGetDataCallback(new IGetDataCallback<Void>() {
                /* class com.ss.android.lark.contact.impl.setting.mvp.C36011c.C36016a.C360248 */

                /* renamed from: a */
                public void onSuccess(Void r2) {
                    ((AbstractC36004a.AbstractC36006b) C36011c.this.getView()).mo132424h(z);
                }

                @Override // com.larksuite.framework.callback.IGetDataCallback
                public void onError(ErrorResult errorResult) {
                    ((AbstractC36004a.AbstractC36006b) C36011c.this.getView()).mo132424h(!z);
                    ((AbstractC36004a.AbstractC36006b) C36011c.this.getView()).mo132407a();
                }
            }));
        }

        @Override // com.ss.android.lark.contact.impl.setting.mvp.AbstractC36004a.AbstractC36006b.AbstractC36007a
        /* renamed from: a */
        public void mo132443a(final boolean z) {
            ((AbstractC36004a.AbstractC36005a) C36011c.this.getModel()).mo132436a(new WayToAddMeSettingItem(WayToAddMeSettingItem.AddMeType.NAME_CARD, z), new UIGetDataCallback(new IGetDataCallback<Void>() {
                /* class com.ss.android.lark.contact.impl.setting.mvp.C36011c.C36016a.C360171 */

                /* renamed from: a */
                public void onSuccess(Void r2) {
                    ((AbstractC36004a.AbstractC36006b) C36011c.this.getView()).mo132415a(z);
                }

                @Override // com.larksuite.framework.callback.IGetDataCallback
                public void onError(ErrorResult errorResult) {
                    ((AbstractC36004a.AbstractC36006b) C36011c.this.getView()).mo132415a(!z);
                    ((AbstractC36004a.AbstractC36006b) C36011c.this.getView()).mo132407a();
                }
            }));
        }

        @Override // com.ss.android.lark.contact.impl.setting.mvp.AbstractC36004a.AbstractC36006b.AbstractC36007a
        /* renamed from: a */
        public void mo132442a(final String str, final boolean z, String str2) {
            ((AbstractC36004a.AbstractC36005a) C36011c.this.getModel()).mo132437a(str, str2, z, new UIGetDataCallback(new IGetDataCallback<Void>() {
                /* class com.ss.android.lark.contact.impl.setting.mvp.C36011c.C36016a.C360259 */

                /* renamed from: a */
                public void onSuccess(Void r3) {
                    ((AbstractC36004a.AbstractC36006b) C36011c.this.getView()).mo132413a(str, z);
                }

                @Override // com.larksuite.framework.callback.IGetDataCallback
                public void onError(ErrorResult errorResult) {
                    ((AbstractC36004a.AbstractC36006b) C36011c.this.getView()).mo132413a(str, !z);
                    ((AbstractC36004a.AbstractC36006b) C36011c.this.getView()).mo132412a(errorResult.getDisplayMsg());
                }
            }));
        }
    }

    /* renamed from: a */
    public C36069e mo132454a(C36064a aVar) {
        return new C36069e(aVar.mo132612a(), aVar.mo132614b(), aVar.mo132616c());
    }

    public C36011c(AbstractC36004a.AbstractC36005a aVar, AbstractC36004a.AbstractC36006b bVar) {
        super(aVar, bVar);
    }
}
