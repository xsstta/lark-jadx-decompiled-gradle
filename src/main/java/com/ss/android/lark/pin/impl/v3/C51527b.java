package com.ss.android.lark.pin.impl.v3;

import android.app.Activity;
import com.larksuite.framework.callback.UICallbackExecutor;
import com.ss.android.lark.chat.entity.chat.Chat;
import com.ss.android.lark.chat.entity.message.Message;
import com.ss.android.lark.pin.impl.BasePinPresenter;
import com.ss.android.lark.pin.impl.entity.PinInfo;
import com.ss.android.lark.pin.impl.v3.AbstractC51629c;
import com.ss.android.lark.pin.impl.v3.C51527b;
import com.ss.android.lark.pin.impl.v3.ChatPinView2;
import java.util.List;

/* renamed from: com.ss.android.lark.pin.impl.v3.b */
public class C51527b extends BasePinPresenter<AbstractC51629c.AbstractC51630a, AbstractC51629c.AbstractC51632b, AbstractC51629c.AbstractC51632b.AbstractC51633a> {

    /* renamed from: a */
    private final AbstractC51629c.AbstractC51632b.AbstractC51633a f128273a = new AbstractC51629c.AbstractC51632b.AbstractC51633a() {
        /* class com.ss.android.lark.pin.impl.v3.C51527b.C515281 */

        @Override // com.ss.android.lark.pin.impl.v3.AbstractC51629c.AbstractC51632b.AbstractC51633a
        /* renamed from: a */
        public void mo177491a() {
            ((AbstractC51629c.AbstractC51630a) C51527b.this.getModel()).mo177479b(false);
        }

        @Override // com.ss.android.lark.pin.impl.v3.AbstractC51629c.AbstractC51632b.AbstractC51633a
        /* renamed from: b */
        public boolean mo177496b() {
            return ((AbstractC51629c.AbstractC51630a) C51527b.this.getModel()).mo177475a();
        }

        @Override // com.ss.android.lark.pin.impl.v3.AbstractC51629c.AbstractC51632b.AbstractC51633a
        /* renamed from: c */
        public boolean mo177498c() {
            return ((AbstractC51629c.AbstractC51630a) C51527b.this.getModel()).mo177484g();
        }

        @Override // com.ss.android.lark.pin.impl.v3.AbstractC51629c.AbstractC51632b.AbstractC51633a
        /* renamed from: d */
        public Chat mo177499d() {
            return ((AbstractC51629c.AbstractC51630a) C51527b.this.getModel()).mo177480c();
        }

        @Override // com.ss.android.lark.pin.impl.v3.AbstractC51629c.AbstractC51632b.AbstractC51633a
        /* renamed from: a */
        public void mo177492a(Message message) {
            ((AbstractC51629c.AbstractC51630a) C51527b.this.getModel()).mo177471a(message, null);
        }

        @Override // com.ss.android.lark.pin.impl.v3.AbstractC51629c.AbstractC51632b.AbstractC51633a
        /* renamed from: b */
        public boolean mo177497b(Message message) {
            return ((AbstractC51629c.AbstractC51630a) C51527b.this.getModel()).mo177476a(message);
        }

        @Override // com.ss.android.lark.pin.impl.v3.AbstractC51629c.AbstractC51632b.AbstractC51633a
        /* renamed from: a */
        public void mo177493a(PinInfo bVar) {
            ((AbstractC51629c.AbstractC51632b) C51527b.this.getView()).mo177456a(((AbstractC51629c.AbstractC51630a) C51527b.this.getModel()).mo177481d(), ((AbstractC51629c.AbstractC51630a) C51527b.this.getModel()).mo177482e(), bVar, ((AbstractC51629c.AbstractC51630a) C51527b.this.getModel()).mo177477b());
        }

        @Override // com.ss.android.lark.pin.impl.v3.AbstractC51629c.AbstractC51632b.AbstractC51633a
        /* renamed from: a */
        public void mo177494a(String str) {
            ((AbstractC51629c.AbstractC51630a) C51527b.this.getModel()).mo177473a(str);
        }

        @Override // com.ss.android.lark.pin.impl.v3.AbstractC51629c.AbstractC51632b.AbstractC51633a
        /* renamed from: a */
        public void mo177495a(boolean z) {
            ((AbstractC51629c.AbstractC51630a) C51527b.this.getModel()).mo177474a(z);
        }
    };

    /* renamed from: b */
    private final AbstractC51629c.AbstractC51630a.AbstractC51631a f128274b;

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public AbstractC51629c.AbstractC51632b.AbstractC51633a createViewDelegate() {
        return this.f128273a;
    }

    @Override // com.larksuite.framework.mvp.BasePresenter, com.larksuite.framework.mvp.ILifecycle
    public void create() {
        super.create();
    }

    @Override // com.larksuite.framework.mvp.BasePresenter, com.larksuite.framework.mvp.ILifecycle
    public void destroy() {
        super.destroy();
    }

    @Override // com.ss.android.lark.pin.impl.BasePinPresenter
    /* renamed from: a */
    public void mo177330a() {
        ((AbstractC51629c.AbstractC51630a) getModel()).mo177485h();
    }

    public C51527b(Activity activity, ChatPinView2.AbstractC51519a aVar, String str, String str2, int i, int i2, boolean z) {
        C515292 r2 = new AbstractC51629c.AbstractC51630a.AbstractC51631a() {
            /* class com.ss.android.lark.pin.impl.v3.C51527b.C515292 */

            /* access modifiers changed from: private */
            /* renamed from: d */
            public /* synthetic */ void m199975d() {
                ((AbstractC51629c.AbstractC51632b) C51527b.this.getView()).mo177460b();
            }

            /* access modifiers changed from: private */
            /* renamed from: e */
            public /* synthetic */ void m199976e() {
                ((AbstractC51629c.AbstractC51632b) C51527b.this.getView()).mo177449a();
            }

            @Override // com.ss.android.lark.pin.impl.v3.AbstractC51629c.AbstractC51630a.AbstractC51631a
            /* renamed from: a */
            public void mo177500a() {
                UICallbackExecutor.post(new Runnable() {
                    /* class com.ss.android.lark.pin.impl.v3.$$Lambda$b$2$Lzcku1seClK33GXUvcAiooMInc */

                    public final void run() {
                        C51527b.C515292.this.m199976e();
                    }
                });
            }

            @Override // com.ss.android.lark.pin.impl.v3.AbstractC51629c.AbstractC51630a.AbstractC51631a
            /* renamed from: c */
            public int mo177507c() {
                return ((AbstractC51629c.AbstractC51632b) C51527b.this.getView()).mo177464c();
            }

            @Override // com.ss.android.lark.pin.impl.v3.AbstractC51629c.AbstractC51630a.AbstractC51631a
            /* renamed from: b */
            public void mo177506b() {
                UICallbackExecutor.post(new Runnable() {
                    /* class com.ss.android.lark.pin.impl.v3.$$Lambda$b$2$ZyHWELFbBaU4CKiUetmWNbxNfFE */

                    public final void run() {
                        C51527b.C515292.this.m199975d();
                    }
                });
            }

            /* access modifiers changed from: private */
            /* renamed from: b */
            public /* synthetic */ void m199972b(Boolean bool) {
                ((AbstractC51629c.AbstractC51632b) C51527b.this.getView()).mo177454a(bool);
            }

            @Override // com.ss.android.lark.pin.impl.v3.AbstractC51629c.AbstractC51630a.AbstractC51631a
            /* renamed from: a */
            public void mo177501a(int i) {
                ((AbstractC51629c.AbstractC51632b) C51527b.this.getView()).mo177461b(i);
            }

            /* access modifiers changed from: private */
            /* renamed from: b */
            public /* synthetic */ void m199974b(boolean z) {
                ((AbstractC51629c.AbstractC51632b) C51527b.this.getView()).mo177458a(z);
            }

            @Override // com.ss.android.lark.pin.impl.v3.AbstractC51629c.AbstractC51630a.AbstractC51631a
            /* renamed from: a */
            public void mo177502a(Boolean bool) {
                UICallbackExecutor.execute(new Runnable(bool) {
                    /* class com.ss.android.lark.pin.impl.v3.$$Lambda$b$2$Tf00MxS_yzs9aUzvZuI5XYX5Hxg */
                    public final /* synthetic */ Boolean f$1;

                    {
                        this.f$1 = r2;
                    }

                    public final void run() {
                        C51527b.C515292.this.m199972b((C51527b.C515292) this.f$1);
                    }
                });
            }

            @Override // com.ss.android.lark.pin.impl.v3.AbstractC51629c.AbstractC51630a.AbstractC51631a
            /* renamed from: a */
            public void mo177503a(String str) {
                ((AbstractC51629c.AbstractC51632b) C51527b.this.getView()).mo177455a(str);
            }

            @Override // com.ss.android.lark.pin.impl.v3.AbstractC51629c.AbstractC51630a.AbstractC51631a
            /* renamed from: a */
            public void mo177505a(boolean z) {
                UICallbackExecutor.execute(new Runnable(z) {
                    /* class com.ss.android.lark.pin.impl.v3.$$Lambda$b$2$Wo0apSnZqx3nkgXaFZal2OjFSiU */
                    public final /* synthetic */ boolean f$1;

                    {
                        this.f$1 = r2;
                    }

                    public final void run() {
                        C51527b.C515292.this.m199974b((C51527b.C515292) this.f$1);
                    }
                });
            }

            /* access modifiers changed from: private */
            /* renamed from: b */
            public /* synthetic */ void m199973b(List list, boolean z, boolean z2) {
                ((AbstractC51629c.AbstractC51632b) C51527b.this.getView()).mo177457a(list, ((AbstractC51629c.AbstractC51630a) C51527b.this.getModel()).mo177483f(), z, z2);
            }

            @Override // com.ss.android.lark.pin.impl.v3.AbstractC51629c.AbstractC51630a.AbstractC51631a
            /* renamed from: a */
            public void mo177504a(List<PinInfo> list, boolean z, boolean z2) {
                UICallbackExecutor.execute(new Runnable(list, z, z2) {
                    /* class com.ss.android.lark.pin.impl.v3.$$Lambda$b$2$Or4TK7aZejhNGOdIdR5M31nSV9Q */
                    public final /* synthetic */ List f$1;
                    public final /* synthetic */ boolean f$2;
                    public final /* synthetic */ boolean f$3;

                    {
                        this.f$1 = r2;
                        this.f$2 = r3;
                        this.f$3 = r4;
                    }

                    public final void run() {
                        C51527b.C515292.this.m199973b(this.f$1, this.f$2, this.f$3);
                    }
                });
            }
        };
        this.f128274b = r2;
        ChatPinView2 chatPinView2 = new ChatPinView2(activity, i, aVar);
        C51522a aVar2 = new C51522a(r2, str, i, str2, i2, z);
        chatPinView2.setViewDelegate(createViewDelegate());
        setView(chatPinView2);
        setModel(aVar2);
    }
}
