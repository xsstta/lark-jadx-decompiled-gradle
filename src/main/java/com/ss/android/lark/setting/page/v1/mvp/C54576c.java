package com.ss.android.lark.setting.page.v1.mvp;

import android.app.NotificationManager;
import android.content.Context;
import android.os.Build;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.mvp.BaseModel;
import com.ss.android.lark.setting.C54115c;
import com.ss.android.lark.setting.dependency.ISettingDependency;
import com.ss.android.lark.setting.page.v1.AbstractC54553a;
import com.ss.android.lark.setting.page.v1.mvp.AbstractC54566a;
import com.ss.android.lark.setting.page.v1.p2672a.C54554a;
import com.ss.android.lark.utils.p2908e.C57823a;

/* renamed from: com.ss.android.lark.setting.page.v1.mvp.c */
public class C54576c extends BaseModel implements AbstractC54566a.AbstractC54567a {

    /* renamed from: a */
    public AbstractC54566a.AbstractC54567a.AbstractC54568a f134885a;

    /* renamed from: b */
    AbstractC54553a f134886b = new AbstractC54553a() {
        /* class com.ss.android.lark.setting.page.v1.mvp.C54576c.C545771 */

        @Override // com.ss.android.lark.setting.page.v1.AbstractC54553a
        /* renamed from: a */
        public void mo186421a(boolean z) {
        }

        @Override // com.ss.android.lark.setting.page.v1.AbstractC54553a
        /* renamed from: b */
        public void mo186422b(boolean z) {
            if (C54576c.this.f134885a != null) {
                C54576c.this.f134885a.mo186469a(z);
            }
        }
    };

    /* renamed from: c */
    private final ISettingDependency.IResourceDependency f134887c = C54115c.m210080a().mo178282b();

    /* renamed from: d */
    private final ISettingDependency.IUpgradeDependency f134888d = C54115c.m210080a().mo178300l();

    /* renamed from: e */
    private final ISettingDependency.IDocDependency f134889e = C54115c.m210080a().mo178274a();

    @Override // com.ss.android.lark.setting.page.v1.mvp.AbstractC54566a.AbstractC54567a
    /* renamed from: a */
    public C54554a mo186462a() {
        return C54584e.m211756a();
    }

    @Override // com.ss.android.lark.setting.page.v1.mvp.AbstractC54566a.AbstractC54567a
    /* renamed from: b */
    public void mo186466b() {
        this.f134888d.mo178385b();
    }

    @Override // com.ss.android.lark.setting.page.v1.mvp.AbstractC54566a.AbstractC54567a
    /* renamed from: c */
    public boolean mo186468c() {
        return this.f134888d.mo178384a();
    }

    @Override // com.larksuite.framework.mvp.BaseModel, com.larksuite.framework.mvp.ILifecycle
    public void create() {
        super.create();
        C54115c.m210080a().mo178303o().mo178368a(this.f134886b);
    }

    @Override // com.larksuite.framework.mvp.BaseModel, com.larksuite.framework.mvp.ILifecycle
    public void destroy() {
        super.destroy();
        C54115c.m210080a().mo178303o().mo178369b(this.f134886b);
        this.f134885a = null;
    }

    @Override // com.ss.android.lark.setting.page.v1.mvp.AbstractC54566a.AbstractC54567a
    /* renamed from: a */
    public void mo186464a(AbstractC54566a.AbstractC54567a.AbstractC54568a aVar) {
        this.f134885a = aVar;
    }

    @Override // com.ss.android.lark.setting.page.v1.mvp.AbstractC54566a.AbstractC54567a
    /* renamed from: a */
    public boolean mo186465a(Context context) {
        if (Build.VERSION.SDK_INT < 24) {
            return C57823a.m224448a(context).mo196178b(context);
        }
        NotificationManager notificationManager = (NotificationManager) context.getSystemService("notification");
        if (notificationManager == null) {
            return false;
        }
        return notificationManager.areNotificationsEnabled();
    }

    @Override // com.ss.android.lark.setting.page.v1.mvp.AbstractC54566a.AbstractC54567a
    /* renamed from: a */
    public void mo186463a(Context context, IGetDataCallback<String> iGetDataCallback) {
        if (iGetDataCallback != null) {
            C54115c.m210080a().mo178302n().mo178353a(context, (IGetDataCallback) getCallbackManager().wrapAndAddCallback(iGetDataCallback));
        }
    }

    @Override // com.ss.android.lark.setting.page.v1.mvp.AbstractC54566a.AbstractC54567a
    /* renamed from: b */
    public void mo186467b(Context context, IGetDataCallback<Boolean> iGetDataCallback) {
        C54115c.m210080a().mo178302n().mo178358b(context, (IGetDataCallback) getCallbackManager().wrapAndAddCallback(iGetDataCallback));
    }
}
