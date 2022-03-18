package com.ss.android.lark.notification.setting.impl.setting.mvp;

import android.app.NotificationManager;
import android.content.Context;
import android.os.Build;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.callback.UIGetDataCallback;
import com.larksuite.framework.mvp.BaseModel;
import com.ss.android.lark.notification.C48398a;
import com.ss.android.lark.notification.dto.C48442a;
import com.ss.android.lark.notification.dto.MailNotificationSetting;
import com.ss.android.lark.notification.dto.NotificationSettingV2;
import com.ss.android.lark.notification.entity.RomTipHelperV2;
import com.ss.android.lark.notification.p2378b.AbstractC48407a;
import com.ss.android.lark.notification.p2379c.C48432a;
import com.ss.android.lark.notification.p2385g.C48529h;
import com.ss.android.lark.notification.setting.impl.setting.C48604c;
import com.ss.android.lark.notification.setting.impl.setting.mvp.C48616a;
import com.ss.android.lark.notification.setting.p2388a.p2389a.AbstractC48567b;
import com.ss.android.lark.notification.setting.p2388a.p2389a.AbstractC48568c;
import com.ss.android.lark.notification.setting.p2388a.p2390b.AbstractC48570a;
import com.ss.android.lark.utils.p2908e.C57823a;

/* renamed from: com.ss.android.lark.notification.setting.impl.setting.mvp.b */
public class C48621b extends BaseModel implements C48616a.AbstractC48617a {

    /* renamed from: a */
    public final AbstractC48407a.AbstractC48415g f122280a = C48398a.m190922a().mo169350m();

    /* renamed from: b */
    public C48616a.AbstractC48617a.AbstractC48618a f122281b;

    /* renamed from: c */
    private final AbstractC48407a.AbstractC48427o f122282c = C48398a.m190922a().mo169341d();

    /* renamed from: d */
    private final AbstractC48568c f122283d = new AbstractC48568c() {
        /* class com.ss.android.lark.notification.setting.impl.setting.mvp.C48621b.C486221 */

        @Override // com.ss.android.lark.notification.setting.p2388a.p2389a.AbstractC48568c
        /* renamed from: a */
        public void mo169649a(C48442a aVar) {
            if (C48621b.this.f122281b != null) {
                C48621b.this.f122281b.mo169775a(aVar.mo169501a());
            }
        }
    };

    /* renamed from: e */
    private final AbstractC48570a f122284e = new AbstractC48570a() {
        /* class com.ss.android.lark.notification.setting.impl.setting.mvp.C48621b.C486232 */

        @Override // com.ss.android.lark.notification.setting.p2388a.p2390b.AbstractC48570a
        /* renamed from: a */
        public void mo169651a(MailNotificationSetting mailNotificationSetting) {
        }
    };

    /* renamed from: f */
    private final AbstractC48567b f122285f = new AbstractC48567b() {
        /* class com.ss.android.lark.notification.setting.impl.setting.mvp.C48621b.C486243 */

        @Override // com.ss.android.lark.notification.setting.p2388a.p2389a.AbstractC48567b
        /* renamed from: a */
        public void mo169648a(boolean z) {
            if (C48621b.this.f122281b != null) {
                C48621b.this.f122281b.mo169776a(z);
            }
        }
    };

    @Override // com.ss.android.lark.notification.setting.impl.setting.mvp.C48616a.AbstractC48617a
    /* renamed from: a */
    public boolean mo169767a() {
        return this.f122280a.mo169380b();
    }

    @Override // com.ss.android.lark.notification.setting.impl.setting.mvp.C48616a.AbstractC48617a
    /* renamed from: b */
    public boolean mo169772b() {
        return this.f122280a.mo169381c();
    }

    @Override // com.ss.android.lark.notification.setting.impl.setting.mvp.C48616a.AbstractC48617a
    /* renamed from: c */
    public C48432a mo169773c() {
        return RomTipHelperV2.m191075a();
    }

    @Override // com.larksuite.framework.mvp.BaseModel, com.larksuite.framework.mvp.ILifecycle
    public void create() {
        super.create();
        this.f122282c.mo169406a(this.f122283d);
        C48529h.m191327a().mo169603a(this.f122284e);
        C48398a.m190922a().mo169341d().mo169405a(this.f122285f);
    }

    @Override // com.larksuite.framework.mvp.BaseModel, com.larksuite.framework.mvp.ILifecycle
    public void destroy() {
        this.f122282c.mo169415b(this.f122283d);
        C48529h.m191327a().mo169605b(this.f122284e);
        C48398a.m190922a().mo169341d().mo169414b(this.f122285f);
        super.destroy();
    }

    @Override // com.ss.android.lark.notification.setting.impl.setting.mvp.C48616a.AbstractC48617a
    /* renamed from: a */
    public void mo169764a(C48616a.AbstractC48617a.AbstractC48618a aVar) {
        this.f122281b = aVar;
    }

    @Override // com.ss.android.lark.notification.setting.impl.setting.mvp.C48616a.AbstractC48617a
    /* renamed from: a */
    public void mo169762a(IGetDataCallback<NotificationSettingV2> iGetDataCallback) {
        this.f122282c.mo169412b((IGetDataCallback) getCallbackManager().wrapAndAddCallback(iGetDataCallback));
    }

    @Override // com.ss.android.lark.notification.setting.impl.setting.mvp.C48616a.AbstractC48617a
    /* renamed from: b */
    public void mo169769b(IGetDataCallback<Boolean> iGetDataCallback) {
        this.f122282c.mo169419c((IGetDataCallback) getCallbackManager().wrapAndAddCallback(iGetDataCallback));
    }

    @Override // com.ss.android.lark.notification.setting.impl.setting.mvp.C48616a.AbstractC48617a
    /* renamed from: c */
    public void mo169774c(IGetDataCallback<Boolean> iGetDataCallback) {
        this.f122282c.mo169402a(iGetDataCallback);
    }

    @Override // com.ss.android.lark.notification.setting.impl.setting.mvp.C48616a.AbstractC48617a
    /* renamed from: a */
    public boolean mo169768a(Context context) {
        if (Build.VERSION.SDK_INT < 24) {
            return C57823a.m224448a(context).mo196178b(context);
        }
        NotificationManager notificationManager = (NotificationManager) context.getSystemService("notification");
        if (notificationManager == null) {
            return false;
        }
        return notificationManager.areNotificationsEnabled();
    }

    @Override // com.ss.android.lark.notification.setting.impl.setting.mvp.C48616a.AbstractC48617a
    /* renamed from: a */
    public void mo169763a(NotificationSettingV2 notificationSettingV2, IGetDataCallback<Boolean> iGetDataCallback) {
        this.f122282c.mo169403a(notificationSettingV2, (IGetDataCallback) getCallbackManager().wrapAndAddCallback(iGetDataCallback));
    }

    @Override // com.ss.android.lark.notification.setting.impl.setting.mvp.C48616a.AbstractC48617a
    /* renamed from: b */
    public void mo169770b(boolean z, final IGetDataCallback<Boolean> iGetDataCallback) {
        if (z != this.f122282c.mo169411a(true)) {
            this.f122282c.mo169409a(z, (IGetDataCallback) getCallbackManager().wrapAndAddCallback(new IGetDataCallback<Boolean>() {
                /* class com.ss.android.lark.notification.setting.impl.setting.mvp.C48621b.C486254 */

                /* renamed from: a */
                public void onSuccess(Boolean bool) {
                    iGetDataCallback.onSuccess(bool);
                }

                @Override // com.larksuite.framework.callback.IGetDataCallback
                public void onError(ErrorResult errorResult) {
                    iGetDataCallback.onError(errorResult);
                }
            }));
        }
    }

    @Override // com.ss.android.lark.notification.setting.impl.setting.mvp.C48616a.AbstractC48617a
    /* renamed from: a */
    public void mo169765a(boolean z, IGetDataCallback<Boolean> iGetDataCallback) {
        this.f122282c.mo169422d(z, (IGetDataCallback) getCallbackManager().wrapAndAddCallback(iGetDataCallback));
    }

    @Override // com.ss.android.lark.notification.setting.impl.setting.mvp.C48616a.AbstractC48617a
    /* renamed from: b */
    public void mo169771b(final boolean z, final UIGetDataCallback<String> uIGetDataCallback) {
        this.f122280a.mo169379b(z, (IGetDataCallback) getCallbackManager().wrapAndAddCallback(new IGetDataCallback<String>() {
            /* class com.ss.android.lark.notification.setting.impl.setting.mvp.C48621b.C486276 */

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                UIGetDataCallback uIGetDataCallback = uIGetDataCallback;
                if (uIGetDataCallback != null) {
                    uIGetDataCallback.onError(errorResult);
                }
            }

            /* renamed from: a */
            public void onSuccess(String str) {
                C48621b.this.f122280a.mo169378b(!z);
                UIGetDataCallback uIGetDataCallback = uIGetDataCallback;
                if (uIGetDataCallback != null) {
                    uIGetDataCallback.onSuccess(str);
                }
            }
        }));
    }

    @Override // com.ss.android.lark.notification.setting.impl.setting.mvp.C48616a.AbstractC48617a
    /* renamed from: a */
    public void mo169766a(final boolean z, final UIGetDataCallback<String> uIGetDataCallback) {
        this.f122280a.mo169377a(z, (IGetDataCallback) getCallbackManager().wrapAndAddCallback(new IGetDataCallback<String>() {
            /* class com.ss.android.lark.notification.setting.impl.setting.mvp.C48621b.C486265 */

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                UIGetDataCallback uIGetDataCallback = uIGetDataCallback;
                if (uIGetDataCallback != null) {
                    uIGetDataCallback.onError(errorResult);
                }
            }

            /* renamed from: a */
            public void onSuccess(String str) {
                C48621b.this.f122280a.mo169376a(z);
                C48604c.m191601a();
                UIGetDataCallback uIGetDataCallback = uIGetDataCallback;
                if (uIGetDataCallback != null) {
                    uIGetDataCallback.onSuccess(str);
                }
            }
        }));
    }
}
