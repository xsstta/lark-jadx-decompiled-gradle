package com.ss.android.lark.notification.setting.impl.setting.mvp;

import android.content.Context;
import com.larksuite.framework.callback.CallbackManager;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.callback.UICallbackExecutor;
import com.larksuite.framework.callback.UIGetDataCallback;
import com.larksuite.framework.mvp.BasePresenter;
import com.larksuite.suite.R;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.notification.dto.NotificationSettingV2;
import com.ss.android.lark.notification.setting.impl.setting.mvp.C48616a;
import com.ss.android.lark.utils.UIHelper;

/* renamed from: com.ss.android.lark.notification.setting.impl.setting.mvp.c */
public class C48628c extends BasePresenter<C48616a.AbstractC48617a, C48616a.AbstractC48619b, C48616a.AbstractC48619b.AbstractC48620a> {

    /* renamed from: a */
    CallbackManager f122297a;

    /* renamed from: b */
    Context f122298b;

    /* renamed from: d */
    private void m191708d() {
        m191709e();
    }

    /* renamed from: c */
    private C48616a.AbstractC48617a.AbstractC48618a m191707c() {
        return new C48616a.AbstractC48617a.AbstractC48618a() {
            /* class com.ss.android.lark.notification.setting.impl.setting.mvp.C48628c.C486291 */

            @Override // com.ss.android.lark.notification.setting.impl.setting.mvp.C48616a.AbstractC48617a.AbstractC48618a
            /* renamed from: a */
            public void mo169775a(NotificationSettingV2 notificationSettingV2) {
                ((C48616a.AbstractC48619b) C48628c.this.getView()).mo169736b(notificationSettingV2);
            }

            @Override // com.ss.android.lark.notification.setting.impl.setting.mvp.C48616a.AbstractC48617a.AbstractC48618a
            /* renamed from: a */
            public void mo169776a(final boolean z) {
                UICallbackExecutor.execute(new Runnable() {
                    /* class com.ss.android.lark.notification.setting.impl.setting.mvp.C48628c.C486291.RunnableC486301 */

                    public void run() {
                        ((C48616a.AbstractC48619b) C48628c.this.getView()).mo169746i(z);
                    }
                });
            }
        };
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C48616a.AbstractC48619b.AbstractC48620a createViewDelegate() {
        return new C48635a();
    }

    /* renamed from: b */
    public void mo169788b() {
        m191708d();
        m191710f();
    }

    /* renamed from: e */
    private void m191709e() {
        ((C48616a.AbstractC48617a) getModel()).mo169762a(new UIGetDataCallback(new IGetDataCallback<NotificationSettingV2>() {
            /* class com.ss.android.lark.notification.setting.impl.setting.mvp.C48628c.C486323 */

            /* renamed from: a */
            public void onSuccess(NotificationSettingV2 notificationSettingV2) {
                ((C48616a.AbstractC48619b) C48628c.this.getView()).mo169736b(notificationSettingV2);
                ((C48616a.AbstractC48619b) C48628c.this.getView()).mo169731a(notificationSettingV2);
            }

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                Log.m165383e("NotificationSettingsPresenter", "getNotificationSetting failed: " + errorResult.getDebugMsg());
                ((C48616a.AbstractC48619b) C48628c.this.getView()).mo169736b(NotificationSettingV2.allInstance());
            }
        }));
    }

    /* renamed from: f */
    private void m191710f() {
        ((C48616a.AbstractC48617a) getModel()).mo169769b(new UIGetDataCallback(new IGetDataCallback<Boolean>() {
            /* class com.ss.android.lark.notification.setting.impl.setting.mvp.C48628c.C486334 */

            /* renamed from: a */
            public void onSuccess(Boolean bool) {
                ((C48616a.AbstractC48619b) C48628c.this.getView()).mo169746i(bool.booleanValue());
            }

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                Log.m165383e("NotificationSettingsPresenter", "getMessageNotificationsOff failed: " + errorResult.getDebugMsg());
                ((C48616a.AbstractC48619b) C48628c.this.getView()).mo169746i(false);
            }
        }));
    }

    /* renamed from: g */
    private void m191711g() {
        ((C48616a.AbstractC48619b) getView()).mo169730a(((C48616a.AbstractC48617a) getModel()).mo169773c());
    }

    /* renamed from: i */
    private void m191713i() {
        ((C48616a.AbstractC48617a) getModel()).mo169774c(this.f122297a.wrapAndAddGetDataCallback(new IGetDataCallback<Boolean>() {
            /* class com.ss.android.lark.notification.setting.impl.setting.mvp.C48628c.C486345 */

            /* renamed from: a */
            public void onSuccess(Boolean bool) {
                ((C48616a.AbstractC48619b) C48628c.this.getView()).mo169734a(bool.booleanValue());
            }

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                Log.m165383e("NotificationSettingsPresenter", "isNotificationDetailDisplay failed: " + errorResult.getDebugMsg());
            }
        }));
    }

    @Override // com.larksuite.framework.mvp.BasePresenter, com.larksuite.framework.mvp.ILifecycle
    public void create() {
        super.create();
        m191712h();
        m191713i();
        m191708d();
        m191710f();
        m191711g();
    }

    /* renamed from: h */
    private void m191712h() {
        ((C48616a.AbstractC48619b) getView()).mo169744g(!((C48616a.AbstractC48617a) getModel()).mo169772b());
        ((C48616a.AbstractC48619b) getView()).mo169745h(((C48616a.AbstractC48617a) getModel()).mo169767a());
    }

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.lark.notification.setting.impl.setting.mvp.c$a */
    public class C48635a implements C48616a.AbstractC48619b.AbstractC48620a {
        private C48635a() {
        }

        @Override // com.ss.android.lark.notification.setting.impl.setting.mvp.C48616a.AbstractC48619b.AbstractC48620a
        /* renamed from: a */
        public void mo169779a(final boolean z) {
            ((C48616a.AbstractC48617a) C48628c.this.getModel()).mo169770b(z, (IGetDataCallback<Boolean>) C48628c.this.f122297a.wrapAndAddGetDataCallback(new IGetDataCallback<Boolean>() {
                /* class com.ss.android.lark.notification.setting.impl.setting.mvp.C48628c.C48635a.C486361 */

                /* renamed from: a */
                public void onSuccess(Boolean bool) {
                }

                @Override // com.larksuite.framework.callback.IGetDataCallback
                public void onError(ErrorResult errorResult) {
                    ((C48616a.AbstractC48619b) C48628c.this.getView()).mo169734a(!z);
                    ((C48616a.AbstractC48619b) C48628c.this.getView()).mo169733a(UIHelper.getString(R.string.Lark_Legacy_NetError));
                }
            }));
        }

        @Override // com.ss.android.lark.notification.setting.impl.setting.mvp.C48616a.AbstractC48619b.AbstractC48620a
        /* renamed from: b */
        public void mo169780b(boolean z) {
            ((C48616a.AbstractC48617a) C48628c.this.getModel()).mo169765a(z, (IGetDataCallback<Boolean>) new UIGetDataCallback(new IGetDataCallback<Boolean>() {
                /* class com.ss.android.lark.notification.setting.impl.setting.mvp.C48628c.C48635a.C486372 */

                /* renamed from: a */
                public void onSuccess(Boolean bool) {
                }

                @Override // com.larksuite.framework.callback.IGetDataCallback
                public void onError(ErrorResult errorResult) {
                    ((C48616a.AbstractC48619b) C48628c.this.getView()).mo169733a(UIHelper.getString(R.string.Lark_Legacy_NetError));
                }
            }));
        }

        @Override // com.ss.android.lark.notification.setting.impl.setting.mvp.C48616a.AbstractC48619b.AbstractC48620a
        /* renamed from: a */
        public void mo169778a(String str) {
            if (((C48616a.AbstractC48617a) C48628c.this.getModel()).mo169768a(C48628c.this.f122298b)) {
                ((C48616a.AbstractC48619b) C48628c.this.getView()).mo169737b(str);
            } else {
                ((C48616a.AbstractC48619b) C48628c.this.getView()).mo169729a(C48628c.this.f122298b);
            }
        }

        @Override // com.ss.android.lark.notification.setting.impl.setting.mvp.C48616a.AbstractC48619b.AbstractC48620a
        /* renamed from: c */
        public void mo169781c(final boolean z) {
            if (z != ((C48616a.AbstractC48617a) C48628c.this.getModel()).mo169767a()) {
                ((C48616a.AbstractC48619b) C48628c.this.getView()).mo169738b(z);
                ((C48616a.AbstractC48617a) C48628c.this.getModel()).mo169766a(z, new UIGetDataCallback<>(new IGetDataCallback<String>() {
                    /* class com.ss.android.lark.notification.setting.impl.setting.mvp.C48628c.C48635a.C486383 */

                    /* renamed from: a */
                    public void onSuccess(String str) {
                        ((C48616a.AbstractC48619b) C48628c.this.getView()).mo169740c(z);
                        ((C48616a.AbstractC48619b) C48628c.this.getView()).mo169728a();
                    }

                    @Override // com.larksuite.framework.callback.IGetDataCallback
                    public void onError(ErrorResult errorResult) {
                        ((C48616a.AbstractC48619b) C48628c.this.getView()).mo169728a();
                        ((C48616a.AbstractC48619b) C48628c.this.getView()).mo169741d(!z);
                    }
                }));
            }
        }

        @Override // com.ss.android.lark.notification.setting.impl.setting.mvp.C48616a.AbstractC48619b.AbstractC48620a
        /* renamed from: d */
        public void mo169782d(final boolean z) {
            if (z != (!((C48616a.AbstractC48617a) C48628c.this.getModel()).mo169772b())) {
                ((C48616a.AbstractC48619b) C48628c.this.getView()).mo169742e(z);
                ((C48616a.AbstractC48617a) C48628c.this.getModel()).mo169771b(z, new UIGetDataCallback<>(new IGetDataCallback<String>() {
                    /* class com.ss.android.lark.notification.setting.impl.setting.mvp.C48628c.C48635a.C486394 */

                    /* renamed from: a */
                    public void onSuccess(String str) {
                        ((C48616a.AbstractC48619b) C48628c.this.getView()).mo169735b();
                    }

                    @Override // com.larksuite.framework.callback.IGetDataCallback
                    public void onError(ErrorResult errorResult) {
                        ((C48616a.AbstractC48619b) C48628c.this.getView()).mo169735b();
                        ((C48616a.AbstractC48619b) C48628c.this.getView()).mo169743f(!z);
                    }
                }));
            }
        }

        @Override // com.ss.android.lark.notification.setting.impl.setting.mvp.C48616a.AbstractC48619b.AbstractC48620a
        /* renamed from: a */
        public void mo169777a(NotificationSettingV2 notificationSettingV2, IGetDataCallback<Boolean> iGetDataCallback) {
            ((C48616a.AbstractC48617a) C48628c.this.getModel()).mo169763a(notificationSettingV2, iGetDataCallback);
        }
    }

    /* renamed from: a */
    public void mo169787a(NotificationSettingV2 notificationSettingV2, final IGetDataCallback<Boolean> iGetDataCallback) {
        ((C48616a.AbstractC48617a) getModel()).mo169763a(notificationSettingV2, new IGetDataCallback<Boolean>() {
            /* class com.ss.android.lark.notification.setting.impl.setting.mvp.C48628c.C486312 */

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                IGetDataCallback iGetDataCallback = iGetDataCallback;
                if (iGetDataCallback != null) {
                    iGetDataCallback.onError(errorResult);
                }
            }

            /* renamed from: a */
            public void onSuccess(Boolean bool) {
                IGetDataCallback iGetDataCallback = iGetDataCallback;
                if (iGetDataCallback != null) {
                    iGetDataCallback.onSuccess(true);
                }
            }
        });
    }

    public C48628c(Context context, C48616a.AbstractC48617a aVar, C48616a.AbstractC48619b bVar, CallbackManager callbackManager) {
        super(aVar, bVar);
        this.f122297a = callbackManager;
        aVar.mo169764a(m191707c());
        this.f122298b = context;
    }
}
