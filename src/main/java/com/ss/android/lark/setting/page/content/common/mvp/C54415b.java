package com.ss.android.lark.setting.page.content.common.mvp;

import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.callback.UIGetDataCallback;
import com.larksuite.framework.mvp.BaseModel;
import com.ss.android.lark.biz.core.api.TimeFormatSetting;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.setting.C54115c;
import com.ss.android.lark.setting.dependency.ISettingDependency;
import com.ss.android.lark.setting.page.content.common.dto.C54164a;
import com.ss.android.lark.setting.page.content.common.mvp.AbstractC54411a;
import com.ss.android.lark.setting.service.AbstractC54603d;
import com.ss.android.lark.setting.service.impl.UserSettingFacade;
import com.ss.android.lark.utils.C57849k;

/* renamed from: com.ss.android.lark.setting.page.content.common.mvp.b */
public class C54415b extends BaseModel implements AbstractC54411a.AbstractC54412a {

    /* renamed from: a */
    final AbstractC54603d f134589a = UserSettingFacade.m211870j();

    /* renamed from: b */
    public final ISettingDependency.IResourceDependency f134590b = C54115c.m210080a().mo178282b();

    /* renamed from: c */
    private final ISettingDependency.IDocDependency f134591c = C54115c.m210080a().mo178274a();

    @Override // com.larksuite.framework.mvp.BaseModel, com.larksuite.framework.mvp.ILifecycle
    public void create() {
        super.create();
    }

    @Override // com.larksuite.framework.mvp.BaseModel, com.larksuite.framework.mvp.ILifecycle
    public void destroy() {
        super.destroy();
    }

    /* renamed from: a */
    public static boolean m211216a() {
        return C54115c.m210080a().mo178291e().mo178337a("global.atuo.clean");
    }

    /* renamed from: d */
    public void mo186051d(final IGetDataCallback<Boolean> iGetDataCallback) {
        this.f134589a.mo186569d(new IGetDataCallback<TimeFormatSetting>() {
            /* class com.ss.android.lark.setting.page.content.common.mvp.C54415b.C544204 */

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                IGetDataCallback iGetDataCallback = iGetDataCallback;
                if (iGetDataCallback != null) {
                    iGetDataCallback.onError(errorResult);
                }
            }

            /* renamed from: a */
            public void onSuccess(TimeFormatSetting timeFormatSetting) {
                boolean z;
                IGetDataCallback iGetDataCallback = iGetDataCallback;
                if (iGetDataCallback != null) {
                    if (timeFormatSetting.mo105510a() == TimeFormatSetting.TimeFormat.TWENTY_FOUR_HOUR) {
                        z = true;
                    } else {
                        z = false;
                    }
                    iGetDataCallback.onSuccess(Boolean.valueOf(z));
                }
            }
        });
    }

    @Override // com.ss.android.lark.setting.page.content.common.mvp.AbstractC54411a.AbstractC54412a
    /* renamed from: a */
    public void mo186045a(final IGetDataCallback<InitData> iGetDataCallback) {
        mo186051d(getCallbackManager().wrapAndAddGetDataCallback(new IGetDataCallback<Boolean>() {
            /* class com.ss.android.lark.setting.page.content.common.mvp.C54415b.C544161 */

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                IGetDataCallback iGetDataCallback = iGetDataCallback;
                if (iGetDataCallback != null) {
                    iGetDataCallback.onError(errorResult);
                }
            }

            /* renamed from: a */
            public void onSuccess(Boolean bool) {
                if (iGetDataCallback != null) {
                    InitData initData = new InitData();
                    initData.is24HourTime = bool.booleanValue();
                    iGetDataCallback.onSuccess(initData);
                }
            }
        }));
    }

    @Override // com.ss.android.lark.setting.page.content.common.mvp.AbstractC54411a.AbstractC54412a
    /* renamed from: b */
    public void mo186047b(IGetDataCallback<Boolean> iGetDataCallback) {
        if (m211216a()) {
            C54115c.m210080a().mo178280a((IGetDataCallback) getCallbackManager().wrapAndAddCallback(iGetDataCallback));
        } else {
            C54164a.m210285a((IGetDataCallback) getCallbackManager().wrapAndAddCallback(iGetDataCallback));
        }
    }

    @Override // com.ss.android.lark.setting.page.content.common.mvp.AbstractC54411a.AbstractC54412a
    /* renamed from: c */
    public void mo186048c(final IGetDataCallback<String> iGetDataCallback) {
        if (m211216a()) {
            C54115c.m210080a().mo178284b((IGetDataCallback) getCallbackManager().wrapAndAddCallback(iGetDataCallback));
        } else {
            this.f134591c.mo178330a((IGetDataCallback) getCallbackManager().wrapAndAddCallback(new IGetDataCallback<Long>() {
                /* class com.ss.android.lark.setting.page.content.common.mvp.C54415b.C544183 */

                /* renamed from: a */
                private void m211224a(final long j) {
                    C54415b.this.f134590b.mo178373b((IGetDataCallback) C54415b.this.getCallbackManager().wrapAndAddCallback(new IGetDataCallback<Float>() {
                        /* class com.ss.android.lark.setting.page.content.common.mvp.C54415b.C544183.C544191 */

                        @Override // com.larksuite.framework.callback.IGetDataCallback
                        public void onError(ErrorResult errorResult) {
                            m211226a(0);
                        }

                        /* renamed from: a */
                        public void onSuccess(Float f) {
                            m211226a((long) (f.floatValue() * 1024.0f * 1024.0f));
                        }

                        /* renamed from: a */
                        private void m211226a(long j) {
                            long b = C57849k.m224525b(C54115c.m210080a().mo178267C());
                            long j2 = j + b + j;
                            if (j2 <= 3145728) {
                                j2 = 0;
                            }
                            String a = C57849k.m224519a((double) j2);
                            Log.m165389i("MineLanguageAndTranslateModel", "FormatSize:" + a + "androidSizeInB:" + b + " sdkSizeInB:" + j + " docSizeInB:" + j);
                            if (iGetDataCallback != null) {
                                iGetDataCallback.onSuccess(a);
                            }
                        }
                    }));
                }

                @Override // com.larksuite.framework.callback.IGetDataCallback
                public void onError(ErrorResult errorResult) {
                    Log.m165397w("MineLanguageAndTranslateModel", "getDocCacheSize:" + errorResult);
                    m211224a(0);
                }

                /* renamed from: a */
                public void onSuccess(Long l) {
                    Log.m165389i("MineLanguageAndTranslateModel", "getDocCacheSize:" + l);
                    m211224a(l.longValue());
                }
            }));
        }
    }

    @Override // com.ss.android.lark.setting.page.content.common.mvp.AbstractC54411a.AbstractC54412a
    /* renamed from: a */
    public void mo186046a(boolean z, IGetDataCallback<Boolean> iGetDataCallback) {
        TimeFormatSetting.TimeFormat timeFormat;
        final UIGetDataCallback wrapAndAddGetDataCallback = getCallbackManager().wrapAndAddGetDataCallback(iGetDataCallback);
        TimeFormatSetting timeFormatSetting = new TimeFormatSetting();
        if (z) {
            timeFormat = TimeFormatSetting.TimeFormat.TWENTY_FOUR_HOUR;
        } else {
            timeFormat = TimeFormatSetting.TimeFormat.TWELVE_HOUR;
        }
        timeFormatSetting.mo105511a(timeFormat);
        this.f134589a.mo186543a(timeFormatSetting, new IGetDataCallback<Boolean>() {
            /* class com.ss.android.lark.setting.page.content.common.mvp.C54415b.C544172 */

            /* renamed from: a */
            public void onSuccess(Boolean bool) {
                IGetDataCallback iGetDataCallback = wrapAndAddGetDataCallback;
                if (iGetDataCallback != null) {
                    iGetDataCallback.onSuccess(bool);
                }
            }

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                IGetDataCallback iGetDataCallback = wrapAndAddGetDataCallback;
                if (iGetDataCallback != null) {
                    iGetDataCallback.onError(errorResult);
                }
            }
        });
    }
}
