package com.ss.android.lark.platform.ag;

import android.content.Context;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.ss.android.lark.appreciablelib.Biz;
import com.ss.android.lark.appreciablelib.Scene;
import com.ss.android.lark.biz.core.api.C29548at;
import com.ss.android.lark.biz.core.api.TimeFormatSetting;
import com.ss.android.lark.biz.im.api.ChatterNameDisplayRule;
import com.ss.android.lark.core.C36083a;
import com.ss.android.lark.core.language.C36235a;
import com.ss.android.lark.featuregating.C37239a;
import com.ss.android.lark.platform.p2493n.C51854a;
import com.ss.android.lark.platform.settings.SettingModuleProvider;
import com.ss.android.lark.utils.LarkContext;
import com.ss.android.lark.watermark.C58275e;
import com.ss.android.lark.watermark.IWatermarkModuleDependency;
import java.io.File;

/* renamed from: com.ss.android.lark.platform.ag.a */
public class C51689a {

    /* renamed from: a */
    private static volatile C58275e f128569a;

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.lark.platform.ag.a$a */
    public static class C51697a {

        /* renamed from: a */
        public static final IWatermarkModuleDependency f128578a = C51689a.m200460a(LarkContext.getApplication());
    }

    /* renamed from: a */
    public static C58275e m200461a() {
        if (f128569a == null) {
            synchronized (C51689a.class) {
                if (f128569a == null) {
                    f128569a = new C58275e(C51697a.f128578a);
                }
            }
        }
        return f128569a;
    }

    /* renamed from: a */
    public static IWatermarkModuleDependency m200460a(final Context context) {
        return new IWatermarkModuleDependency() {
            /* class com.ss.android.lark.platform.ag.C51689a.C516901 */

            @Override // com.ss.android.lark.watermark.IWatermarkModuleDependency
            /* renamed from: a */
            public Context mo177764a() {
                return context;
            }

            @Override // com.ss.android.lark.watermark.IWatermarkModuleDependency
            /* renamed from: b */
            public IWatermarkModuleDependency.AbstractC58211d mo177765b() {
                return new IWatermarkModuleDependency.AbstractC58211d() {
                    /* class com.ss.android.lark.platform.ag.C51689a.C516901.C516911 */

                    @Override // com.ss.android.lark.watermark.IWatermarkModuleDependency.AbstractC58211d
                    /* renamed from: a */
                    public int mo177770a() {
                        if (SettingModuleProvider.f129183h.mo178263a().mo185216c().mo186528f().booleanValue()) {
                            return 0;
                        }
                        return 1;
                    }

                    @Override // com.ss.android.lark.watermark.IWatermarkModuleDependency.AbstractC58211d
                    /* renamed from: b */
                    public boolean mo177771b() {
                        if (SettingModuleProvider.f129183h.mo178263a().mo185219e().mo186572e().mo105510a() == TimeFormatSetting.TimeFormat.TWENTY_FOUR_HOUR) {
                            return true;
                        }
                        return false;
                    }
                };
            }

            @Override // com.ss.android.lark.watermark.IWatermarkModuleDependency
            /* renamed from: c */
            public IWatermarkModuleDependency.AbstractC58210c mo177766c() {
                return new IWatermarkModuleDependency.AbstractC58210c() {
                    /* class com.ss.android.lark.platform.ag.C51689a.C516901.C516922 */

                    @Override // com.ss.android.lark.watermark.IWatermarkModuleDependency.AbstractC58210c
                    /* renamed from: a */
                    public String mo177772a() {
                        return C36235a.m142710a().mo148282c().mo148304g().getLanguage().toLowerCase();
                    }

                    @Override // com.ss.android.lark.watermark.IWatermarkModuleDependency.AbstractC58210c
                    /* renamed from: b */
                    public String mo177773b() {
                        return C36083a.m141486a().getIMDependency().mo132808a(C36083a.m141486a().getIMDependency().mo132884b(true), ChatterNameDisplayRule.NAME);
                    }
                };
            }

            @Override // com.ss.android.lark.watermark.IWatermarkModuleDependency
            /* renamed from: d */
            public IWatermarkModuleDependency.AbstractC58208a mo177767d() {
                return new IWatermarkModuleDependency.AbstractC58208a() {
                    /* class com.ss.android.lark.platform.ag.C51689a.C516901.C516933 */

                    @Override // com.ss.android.lark.watermark.IWatermarkModuleDependency.AbstractC58208a
                    /* renamed from: a */
                    public boolean mo177774a(String str) {
                        return C37239a.m146648b().mo136951a(str);
                    }
                };
            }

            @Override // com.ss.android.lark.watermark.IWatermarkModuleDependency
            /* renamed from: e */
            public IWatermarkModuleDependency.ILoginDependency mo177768e() {
                return new IWatermarkModuleDependency.ILoginDependency() {
                    /* class com.ss.android.lark.platform.ag.C51689a.C516901.C516944 */

                    @Override // com.ss.android.lark.watermark.IWatermarkModuleDependency.ILoginDependency
                    /* renamed from: a */
                    public String mo177775a() {
                        return C36083a.m141486a().getPassportDependency().mo133085d();
                    }

                    @Override // com.ss.android.lark.watermark.IWatermarkModuleDependency.ILoginDependency
                    /* renamed from: b */
                    public int mo177776b() {
                        return C36083a.m141486a().getPassportDependency().mo133083c();
                    }
                };
            }

            @Override // com.ss.android.lark.watermark.IWatermarkModuleDependency
            /* renamed from: f */
            public IWatermarkModuleDependency.AbstractC58209b mo177769f() {
                return new IWatermarkModuleDependency.AbstractC58209b() {
                    /* class com.ss.android.lark.platform.ag.C51689a.C516901.C516955 */

                    @Override // com.ss.android.lark.watermark.IWatermarkModuleDependency.AbstractC58209b
                    /* renamed from: a */
                    public void mo177777a(Context context, File file, final IGetDataCallback<File> iGetDataCallback) {
                        C51854a.m201094a().mo142159a(context, file, new IGetDataCallback<C29548at>() {
                            /* class com.ss.android.lark.platform.ag.C51689a.C516901.C516955.C516961 */

                            @Override // com.larksuite.framework.callback.IGetDataCallback
                            public void onError(ErrorResult errorResult) {
                                IGetDataCallback iGetDataCallback = iGetDataCallback;
                                if (iGetDataCallback != null) {
                                    iGetDataCallback.onError(errorResult);
                                }
                            }

                            /* renamed from: a */
                            public void onSuccess(C29548at atVar) {
                                IGetDataCallback iGetDataCallback = iGetDataCallback;
                                if (iGetDataCallback != null) {
                                    iGetDataCallback.onSuccess(atVar.f73941a);
                                }
                            }
                        }, Biz.Messenger, Scene.Chat);
                    }
                };
            }
        };
    }
}
