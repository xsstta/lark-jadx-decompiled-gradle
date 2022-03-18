package com.ss.android.lark.notification.setting.impl.badgestyle.mvp;

import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.callback.UICallbackExecutor;
import com.larksuite.framework.mvp.BasePresenter;
import com.larksuite.suite.R;
import com.ss.android.lark.notification.setting.impl.badgestyle.mvp.C48592c;
import com.ss.android.lark.notification.statistics.NotificationSettingHitPoint;
import com.ss.android.lark.utils.UIHelper;

/* renamed from: com.ss.android.lark.notification.setting.impl.badgestyle.mvp.b */
public class C48587b extends BasePresenter<C48592c.AbstractC48593a, C48592c.AbstractC48595b, C48592c.AbstractC48595b.AbstractC48596a> {

    /* renamed from: com.ss.android.lark.notification.setting.impl.badgestyle.mvp.b$a */
    public interface AbstractC48591a {
        /* renamed from: a */
        void mo169678a(BadgeStyleSettingsView badgeStyleSettingsView);

        /* renamed from: a */
        void mo169679a(boolean z, String str);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C48592c.AbstractC48595b.AbstractC48596a createViewDelegate() {
        return new C48592c.AbstractC48595b.AbstractC48596a() {
            /* class com.ss.android.lark.notification.setting.impl.badgestyle.mvp.C48587b.C485881 */

            @Override // com.ss.android.lark.notification.setting.impl.badgestyle.mvp.C48592c.AbstractC48595b.AbstractC48596a
            /* renamed from: a */
            public void mo169697a(final boolean z) {
                ((C48592c.AbstractC48593a) C48587b.this.getModel()).mo169691a(z, new IGetDataCallback<Boolean>() {
                    /* class com.ss.android.lark.notification.setting.impl.badgestyle.mvp.C48587b.C485881.C485891 */

                    /* renamed from: a */
                    public void onSuccess(Boolean bool) {
                    }

                    @Override // com.larksuite.framework.callback.IGetDataCallback
                    public void onError(ErrorResult errorResult) {
                        ((C48592c.AbstractC48595b) C48587b.this.getView()).mo169688a(!z);
                        ((C48592c.AbstractC48595b) C48587b.this.getView()).mo169687a(UIHelper.getString(R.string.Lark_Settings_BadgeStyleChangeFail));
                    }
                });
            }

            @Override // com.ss.android.lark.notification.setting.impl.badgestyle.mvp.C48592c.AbstractC48595b.AbstractC48596a
            /* renamed from: b */
            public void mo169698b(final boolean z) {
                NotificationSettingHitPoint.m191339a("show_mute_remind_toggle", z);
                ((C48592c.AbstractC48593a) C48587b.this.getModel()).mo169693b(z, new IGetDataCallback<Boolean>() {
                    /* class com.ss.android.lark.notification.setting.impl.badgestyle.mvp.C48587b.C485881.C485902 */

                    /* renamed from: a */
                    public void onSuccess(Boolean bool) {
                    }

                    @Override // com.larksuite.framework.callback.IGetDataCallback
                    public void onError(ErrorResult errorResult) {
                        ((C48592c.AbstractC48595b) C48587b.this.getView()).mo169688a(!z);
                        ((C48592c.AbstractC48595b) C48587b.this.getView()).mo169687a(UIHelper.getString(R.string.Lark_Settings_BadgeStyleChangeFail));
                    }
                });
            }
        };
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public C48592c.AbstractC48593a.AbstractC48594a mo169696b() {
        return new C48592c.AbstractC48593a.AbstractC48594a() {
            /* class com.ss.android.lark.notification.setting.impl.badgestyle.mvp.$$Lambda$b$NcJv3O0zLM_49ilarUSek6xLpA */

            @Override // com.ss.android.lark.notification.setting.impl.badgestyle.mvp.C48592c.AbstractC48593a.AbstractC48594a
            public final void onBadgeStyleChanged(boolean z) {
                C48587b.this.m191541a(z);
            }
        };
    }

    @Override // com.larksuite.framework.mvp.BasePresenter, com.larksuite.framework.mvp.ILifecycle
    public void create() {
        super.create();
        ((C48592c.AbstractC48595b) getView()).mo169688a(((C48592c.AbstractC48593a) getModel()).mo169692a());
        ((C48592c.AbstractC48595b) getView()).mo169689b(((C48592c.AbstractC48593a) getModel()).mo169694b());
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: a */
    private /* synthetic */ void m191541a(boolean z) {
        UICallbackExecutor.execute(new Runnable(z) {
            /* class com.ss.android.lark.notification.setting.impl.badgestyle.mvp.$$Lambda$b$OpSzWjdf71AO5CiY_5JX31mUQ */
            public final /* synthetic */ boolean f$1;

            {
                this.f$1 = r2;
            }

            public final void run() {
                C48587b.this.m191542b(this.f$1);
            }
        });
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: b */
    private /* synthetic */ void m191542b(boolean z) {
        ((C48592c.AbstractC48595b) getView()).mo169688a(z);
    }

    public C48587b(C48592c.AbstractC48593a aVar, C48592c.AbstractC48595b bVar) {
        super(aVar, bVar);
        aVar.mo169690a(mo169696b());
    }
}
