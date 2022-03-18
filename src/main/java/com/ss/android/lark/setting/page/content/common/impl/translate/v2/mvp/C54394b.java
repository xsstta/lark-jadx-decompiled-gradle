package com.ss.android.lark.setting.page.content.common.impl.translate.v2.mvp;

import com.larksuite.component.metriclogger_constants.domains.translation.setting.p1096a.C24357a;
import com.larksuite.component.metriclogger_constants.domains.translation.setting.p1097b.C24358a;
import com.larksuite.component.metriclogger_constants.domains.translation.setting.p1098c.C24359a;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.callback.UICallbackExecutor;
import com.larksuite.framework.callback.UIGetDataCallback;
import com.larksuite.framework.mvp.BasePresenter;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.setting.C54115c;
import com.ss.android.lark.setting.page.content.common.dto.MineTranslateLanguageSetting;
import com.ss.android.lark.setting.page.content.common.impl.translate.mvp.AbstractC54282e;
import com.ss.android.lark.setting.page.content.common.impl.translate.mvp.C54278b;
import com.ss.android.lark.setting.page.content.common.impl.translate.mvp.C54281d;
import com.ss.android.lark.setting.page.content.common.impl.translate.v2.C54307a;
import com.ss.android.lark.setting.page.content.common.statistics.TranslateHitPoint;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.ss.android.lark.setting.page.content.common.impl.translate.v2.mvp.b */
public class C54394b extends BasePresenter<AbstractC54282e.AbstractC54283a, AbstractC54282e.AbstractC54285b, AbstractC54282e.AbstractC54285b.AbstractC54286a> {

    /* renamed from: a */
    public final AtomicBoolean f134559a = new AtomicBoolean(true);

    /* renamed from: b */
    private AbstractC54282e.AbstractC54285b.AbstractC54286a f134560b;

    @Override // com.larksuite.framework.mvp.BasePresenter, com.larksuite.framework.mvp.ILifecycle
    public void destroy() {
        super.destroy();
        this.f134560b = null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public AbstractC54282e.AbstractC54285b.AbstractC54286a createViewDelegate() {
        C54399b bVar = new C54399b();
        this.f134560b = bVar;
        return bVar;
    }

    /* renamed from: c */
    private void m211160c() {
        ((AbstractC54282e.AbstractC54283a) getModel()).mo185808a(false, (IGetDataCallback<MineTranslateLanguageSetting>) new UIGetDataCallback(new IGetDataCallback<MineTranslateLanguageSetting>() {
            /* class com.ss.android.lark.setting.page.content.common.impl.translate.v2.mvp.C54394b.C543962 */

            /* renamed from: a */
            public void onSuccess(MineTranslateLanguageSetting mineTranslateLanguageSetting) {
                ((AbstractC54282e.AbstractC54285b) C54394b.this.getView()).mo185778a(mineTranslateLanguageSetting);
                C54394b.this.mo186017b();
            }

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                C54394b.this.mo186017b();
                Log.m165383e("TAG_TRANSLATE_MINE_TRANSLATE_SETTING_PRESENTER2", "getTranslateSetting from local failed; err=" + errorResult);
                C54115c.m210080a().mo178278a(C24359a.f60140b, errorResult, null);
            }
        }));
    }

    /* renamed from: b */
    public void mo186017b() {
        ((AbstractC54282e.AbstractC54283a) getModel()).mo185808a(true, (IGetDataCallback<MineTranslateLanguageSetting>) new UIGetDataCallback(new IGetDataCallback<MineTranslateLanguageSetting>() {
            /* class com.ss.android.lark.setting.page.content.common.impl.translate.v2.mvp.C54394b.C543951 */

            /* renamed from: a */
            public void onSuccess(MineTranslateLanguageSetting mineTranslateLanguageSetting) {
                ((AbstractC54282e.AbstractC54285b) C54394b.this.getView()).mo185778a(mineTranslateLanguageSetting);
            }

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                Log.m165383e("TAG_TRANSLATE_MINE_TRANSLATE_SETTING_PRESENTER2", "getTranslateSetting from server failed; err=" + errorResult);
            }
        }));
    }

    @Override // com.larksuite.framework.mvp.BasePresenter, com.larksuite.framework.mvp.ILifecycle
    public void create() {
        super.create();
        C54115c.m210080a().mo178279a(C24359a.f60139a, (Map<String, ? extends Object>) null);
        m211160c();
    }

    /* renamed from: com.ss.android.lark.setting.page.content.common.impl.translate.v2.mvp.b$a */
    private class C54397a extends C54278b {
        private C54397a() {
        }

        @Override // com.ss.android.lark.setting.page.content.common.impl.translate.mvp.AbstractC54282e.AbstractC54283a.AbstractC54284a, com.ss.android.lark.setting.page.content.common.impl.translate.mvp.C54278b
        /* renamed from: a */
        public void mo185773a(final MineTranslateLanguageSetting mineTranslateLanguageSetting) {
            UICallbackExecutor.execute(new Runnable() {
                /* class com.ss.android.lark.setting.page.content.common.impl.translate.v2.mvp.C54394b.C54397a.RunnableC543981 */

                public void run() {
                    if (C54394b.this.f134559a.get()) {
                        ((AbstractC54282e.AbstractC54285b) C54394b.this.getView()).mo185778a(mineTranslateLanguageSetting);
                    }
                }
            });
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.lark.setting.page.content.common.impl.translate.v2.mvp.b$b */
    public class C54399b extends C54281d {
        private C54399b() {
        }

        @Override // com.ss.android.lark.setting.page.content.common.impl.translate.mvp.C54281d, com.ss.android.lark.setting.page.content.common.impl.translate.mvp.AbstractC54282e.AbstractC54285b.AbstractC54286a
        /* renamed from: a */
        public void mo185792a(final int i) {
            int i2;
            super.mo185792a(i);
            if (i == MineTranslateLanguageSetting.C54162a.f134062a) {
                i2 = 1;
            } else {
                i2 = 2;
            }
            HashMap hashMap = new HashMap();
            hashMap.put("display_type", Integer.valueOf(i2));
            C54115c.m210080a().mo178279a(C24358a.f60133a, hashMap);
            TranslateHitPoint.m210261a(i2);
            ((AbstractC54282e.AbstractC54283a) C54394b.this.getModel()).mo185804a((String) null, i, new IGetDataCallback<Boolean>() {
                /* class com.ss.android.lark.setting.page.content.common.impl.translate.v2.mvp.C54394b.C54399b.C544012 */

                /* renamed from: a */
                public void onSuccess(Boolean bool) {
                    ((AbstractC54282e.AbstractC54285b) C54394b.this.getView()).mo185785c(i);
                    Log.m165389i("TAG_TRANSLATE_MINE_TRANSLATE_SETTING_PRESENTER2", "onDefaultDisplayRuleConfigured succeed; displayRule=" + i);
                }

                @Override // com.larksuite.framework.callback.IGetDataCallback
                public void onError(ErrorResult errorResult) {
                    C54115c.m210080a().mo178278a(C24358a.f60134b, errorResult, null);
                    Log.m165383e("TAG_TRANSLATE_MINE_TRANSLATE_SETTING_PRESENTER2", "onDefaultDisplayRuleConfigured failed; err=" + errorResult);
                    MineTranslateLanguageSetting a = ((AbstractC54282e.AbstractC54283a) C54394b.this.getModel()).mo185798a();
                    if (a != null) {
                        ((AbstractC54282e.AbstractC54285b) C54394b.this.getView()).mo185785c(a.getDefaultDisplayRule());
                        ((AbstractC54282e.AbstractC54285b) C54394b.this.getView()).mo185788f();
                    }
                }
            });
        }

        @Override // com.ss.android.lark.setting.page.content.common.impl.translate.mvp.C54281d, com.ss.android.lark.setting.page.content.common.impl.translate.mvp.AbstractC54282e.AbstractC54285b.AbstractC54286a
        /* renamed from: b */
        public void mo185796b(final int i) {
            HashMap hashMap = new HashMap();
            hashMap.put(ShareHitPoint.f121869d, Integer.valueOf(i));
            C54115c.m210080a().mo178279a(C24357a.f60127c, hashMap);
            C54394b.this.f134559a.set(false);
            ((AbstractC54282e.AbstractC54283a) C54394b.this.getModel()).mo185799a(i, new IGetDataCallback<Boolean>() {
                /* class com.ss.android.lark.setting.page.content.common.impl.translate.v2.mvp.C54394b.C54399b.C544001 */

                /* renamed from: a */
                public void onSuccess(Boolean bool) {
                    C54394b.this.f134559a.set(true);
                    ((AbstractC54282e.AbstractC54285b) C54394b.this.getView()).mo185781b(i);
                    Log.m165389i("TAG_TRANSLATE_MINE_TRANSLATE_SETTING_PRESENTER2", "onSetAutoTranslateScope succeed; switchScope=" + i);
                    if (i == MineTranslateLanguageSetting.C54163b.f134064a || ((i == MineTranslateLanguageSetting.C54163b.f134068e && !C54307a.m210866a()) || (i == MineTranslateLanguageSetting.C54163b.f134070g && !C54307a.m210867b()))) {
                        ((AbstractC54282e.AbstractC54283a) C54394b.this.getModel()).mo185809b(false, null);
                    }
                }

                @Override // com.larksuite.framework.callback.IGetDataCallback
                public void onError(ErrorResult errorResult) {
                    C54115c.m210080a().mo178278a(C24357a.f60128d, errorResult, null);
                    Log.m165383e("TAG_TRANSLATE_MINE_TRANSLATE_SETTING_PRESENTER2", "onSetAutoTranslateScope failed; err=" + errorResult);
                    C54394b.this.f134559a.set(true);
                    MineTranslateLanguageSetting a = ((AbstractC54282e.AbstractC54283a) C54394b.this.getModel()).mo185798a();
                    if (a != null) {
                        ((AbstractC54282e.AbstractC54285b) C54394b.this.getView()).mo185781b(a.getGlobalAutoTranslateScope());
                        ((AbstractC54282e.AbstractC54285b) C54394b.this.getView()).mo185788f();
                    }
                }
            });
        }

        @Override // com.ss.android.lark.setting.page.content.common.impl.translate.mvp.C54281d, com.ss.android.lark.setting.page.content.common.impl.translate.mvp.AbstractC54282e.AbstractC54285b.AbstractC54286a
        /* renamed from: a */
        public void mo185795a(final boolean z) {
            Log.m165389i("TAG_TRANSLATE_MINE_TRANSLATE_SETTING_PRESENTER2", "start GlobalAutoTranslateChange process, switch=" + z);
            HashMap hashMap = new HashMap();
            hashMap.put("switch", Boolean.valueOf(z));
            C54115c.m210080a().mo178279a(C24357a.f60125a, hashMap);
            ((AbstractC54282e.AbstractC54283a) C54394b.this.getModel()).mo185809b(z, new IGetDataCallback<Boolean>() {
                /* class com.ss.android.lark.setting.page.content.common.impl.translate.v2.mvp.C54394b.C54399b.C544023 */

                /* renamed from: a */
                public void onSuccess(Boolean bool) {
                    Log.m165389i("TAG_TRANSLATE_MINE_TRANSLATE_SETTING_PRESENTER2", "onGlobalAutoTranslateChanged succeed, switch=" + z);
                }

                @Override // com.larksuite.framework.callback.IGetDataCallback
                public void onError(ErrorResult errorResult) {
                    C54115c.m210080a().mo178278a(C24357a.f60126b, errorResult, null);
                    Log.m165383e("TAG_TRANSLATE_MINE_TRANSLATE_SETTING_PRESENTER2", "onGlobalAutoTranslateChanged failed; err=" + errorResult);
                    MineTranslateLanguageSetting a = ((AbstractC54282e.AbstractC54283a) C54394b.this.getModel()).mo185798a();
                    if (a != null) {
                        ((AbstractC54282e.AbstractC54285b) C54394b.this.getView()).mo185781b(a.getGlobalAutoTranslateScope());
                        ((AbstractC54282e.AbstractC54285b) C54394b.this.getView()).mo185788f();
                    }
                }
            });
        }
    }

    public C54394b(AbstractC54282e.AbstractC54283a aVar, AbstractC54282e.AbstractC54285b bVar) {
        super(aVar, bVar);
        aVar.mo185803a(new C54397a());
    }
}
