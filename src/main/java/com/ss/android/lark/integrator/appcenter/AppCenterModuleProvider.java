package com.ss.android.lark.integrator.appcenter;

import android.content.Context;
import android.net.http.SslError;
import android.os.Bundle;
import android.webkit.WebView;
import com.bytedance.ee.larkbrand.permission.AbstractC13298i;
import com.bytedance.i18n.claymore.ClaymoreImpl;
import com.bytedance.lark.pb.basic.v1.DomainSettings;
import com.huawei.hms.support.api.entity.core.CommonCode;
import com.larksuite.component.ui.toast.LKUIToast;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.suite.R;
import com.ss.android.appcenter.business.activity.appsetting.LittleAppPermissionData;
import com.ss.android.lark.appcenter.wrapper.AppCenterModule;
import com.ss.android.lark.appcenter.wrapper.dependency.IAppCenterModuleDependency;
import com.ss.android.lark.appcenter.wrapper.dto.C29142a;
import com.ss.android.lark.appcenter.wrapper.p1359a.AbstractC29129b;
import com.ss.android.lark.biz.core.api.ICoreApi;
import com.ss.android.lark.biz.core.api.IMainDrawerListener;
import com.ss.android.lark.biz.core.api.IQRCodeScanResultHandler;
import com.ss.android.lark.biz.core.api.ProfileResponse;
import com.ss.android.lark.biz.core.api.UrlParams;
import com.ss.android.lark.biz.core.api.aj;
import com.ss.android.lark.biz.core.api.aq;
import com.ss.android.lark.biz.im.api.ChatBundle;
import com.ss.android.lark.biz.im.api.IIMApi;
import com.ss.android.lark.dynamicconfig.DynamicConfigModule;
import com.ss.android.lark.featuregating.C37239a;
import com.ss.android.lark.image.entity.Image;
import com.ss.android.lark.integrator.littleapp.C39824h;
import com.ss.android.lark.integrator.littleapp.LittleAppModuleProvider;
import com.ss.android.lark.integrator.openplatform.OpenPlatformModuleProvider;
import com.ss.android.lark.littleapp.service.ILittleAppService;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.openplatform.openapp.BotOpenData;
import com.ss.android.lark.openplatform.openapp.ID_TYPE;
import com.ss.android.lark.openplatform.shareApp.dto.AbstractC48867a;
import com.ss.android.lark.openplatform.shareApp.dto.C48869c;
import com.ss.android.lark.openplatform.shareApp.dto.ShareAppResult;
import com.ss.android.lark.passport.signinsdk_api.feature.listener.user_switch.AbstractC49379a;
import com.ss.android.lark.passport.signinsdk_api.feature.listener.user_switch.C49382d;
import com.ss.android.lark.passport_api.IPassportApi;
import com.ss.android.lark.utils.ApiUtils;
import com.ss.android.lark.utils.LarkContext;
import com.tt.refer.common.base.AppType;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.json.JSONObject;

public class AppCenterModuleProvider {

    /* renamed from: a */
    public static volatile AppCenterModule f100374a;

    /* renamed from: b */
    public static final Map<AbstractC29129b, IMainDrawerListener> f100375b = new ConcurrentHashMap();

    @ClaymoreImpl(IAppCenterModuleDependency.class)
    public static class AppCenterModuleDependency implements IAppCenterModuleDependency {
        ICoreApi mCoreApi = ((ICoreApi) ApiUtils.getApi(ICoreApi.class));
        IPassportApi mPassportApi = ((IPassportApi) ApiUtils.getApi(IPassportApi.class));
        public AbstractC49379a sChangeListener;

        @Override // com.ss.android.lark.appcenter.wrapper.dependency.IAppCenterModuleDependency
        public IAppCenterModuleDependency.AbstractC29131b getChatDependency() {
            return new IAppCenterModuleDependency.AbstractC29131b() {
                /* class com.ss.android.lark.integrator.appcenter.AppCenterModuleProvider.AppCenterModuleDependency.AnonymousClass12 */

                /* renamed from: a */
                IIMApi f100381a = ((IIMApi) ApiUtils.getApi(IIMApi.class));

                @Override // com.ss.android.lark.appcenter.wrapper.dependency.IAppCenterModuleDependency.AbstractC29131b
                /* renamed from: a */
                public void mo103373a(Context context, String str) {
                    this.f100381a.openChat(context, ChatBundle.m109259a().mo105927a(str).mo105923a(ChatBundle.SourceType.CARD).mo105929a());
                }

                @Override // com.ss.android.lark.appcenter.wrapper.dependency.IAppCenterModuleDependency.AbstractC29131b
                /* renamed from: b */
                public void mo103375b(Context context, String str) {
                    this.f100381a.openChat(context, ChatBundle.m109259a().mo105927a(str).mo105929a());
                }

                @Override // com.ss.android.lark.appcenter.wrapper.dependency.IAppCenterModuleDependency.AbstractC29131b
                /* renamed from: a */
                public void mo103374a(Context context, String str, String str2) {
                    this.f100381a.openChat(context, ChatBundle.m109259a().mo105931b(str).mo105935d(str2).mo105929a());
                }
            };
        }

        @Override // com.ss.android.lark.appcenter.wrapper.dependency.IAppCenterModuleDependency
        public Context getContext() {
            return LarkContext.getApplication();
        }

        @Override // com.ss.android.lark.appcenter.wrapper.dependency.IAppCenterModuleDependency
        public String getDeviceId() {
            return this.mPassportApi.getDeviceId();
        }

        @Override // com.ss.android.lark.appcenter.wrapper.dependency.IAppCenterModuleDependency
        public IAppCenterModuleDependency.AbstractC29132c getFeatureGatingDependency() {
            return new IAppCenterModuleDependency.AbstractC29132c() {
                /* class com.ss.android.lark.integrator.appcenter.AppCenterModuleProvider.AppCenterModuleDependency.C391033 */

                @Override // com.ss.android.lark.appcenter.wrapper.dependency.IAppCenterModuleDependency.AbstractC29132c
                /* renamed from: a */
                public boolean mo103376a(String str) {
                    return C37239a.m146648b().mo136951a(str);
                }
            };
        }

        @Override // com.ss.android.lark.appcenter.wrapper.dependency.IAppCenterModuleDependency
        public Locale getLanguageSetting() {
            return this.mCoreApi.getLanguageSetting();
        }

        @Override // com.ss.android.lark.appcenter.wrapper.dependency.IAppCenterModuleDependency
        public IAppCenterModuleDependency.AbstractC29134e getLittleAppDependency() {
            return new IAppCenterModuleDependency.AbstractC29134e() {
                /* class com.ss.android.lark.integrator.appcenter.AppCenterModuleProvider.AppCenterModuleDependency.C391099 */

                @Override // com.ss.android.lark.appcenter.wrapper.dependency.IAppCenterModuleDependency.AbstractC29134e
                /* renamed from: b */
                public void mo103386b() {
                    LittleAppModuleProvider.m157932a().mo148950j();
                }

                @Override // com.ss.android.lark.appcenter.wrapper.dependency.IAppCenterModuleDependency.AbstractC29134e
                /* renamed from: a */
                public void mo103380a() {
                    LittleAppModuleProvider.m157932a().mo148943b().mo149148a(AppCenterModuleDependency.this.getContext(), 1, "app_center");
                }

                @Override // com.ss.android.lark.appcenter.wrapper.dependency.IAppCenterModuleDependency.AbstractC29134e
                /* renamed from: a */
                public void mo103381a(Context context, int i) {
                    LittleAppModuleProvider.m157932a().mo148943b().mo149174b(context, i);
                }

                @Override // com.ss.android.lark.appcenter.wrapper.dependency.IAppCenterModuleDependency.AbstractC29134e
                /* renamed from: b */
                public void mo103387b(Context context, String str) {
                    LittleAppModuleProvider.m157932a().mo148943b().mo149188e(context, str);
                }

                @Override // com.ss.android.lark.appcenter.wrapper.dependency.IAppCenterModuleDependency.AbstractC29134e
                /* renamed from: a */
                public void mo103382a(Context context, String str) {
                    LittleAppModuleProvider.m157932a().mo148943b().mo149186d(context, str);
                }

                @Override // com.ss.android.lark.appcenter.wrapper.dependency.IAppCenterModuleDependency.AbstractC29134e
                /* renamed from: a */
                public List<LittleAppPermissionData> mo103379a(Context context, String str, AppType appType) {
                    List<com.ss.android.lark.littleapp.entity.LittleAppPermissionData> a = LittleAppModuleProvider.m157932a().mo148943b().mo149143a(context, str, appType);
                    ArrayList arrayList = new ArrayList();
                    for (com.ss.android.lark.littleapp.entity.LittleAppPermissionData littleAppPermissionData : a) {
                        arrayList.add(new LittleAppPermissionData(littleAppPermissionData.getPermission(), littleAppPermissionData.getName(), littleAppPermissionData.isGranted()));
                    }
                    return arrayList;
                }

                @Override // com.ss.android.lark.appcenter.wrapper.dependency.IAppCenterModuleDependency.AbstractC29134e
                /* renamed from: a */
                public void mo103383a(Context context, String str, String str2) {
                    LittleAppModuleProvider.m157932a().mo148943b().mo149175b(context, str, str2);
                }

                @Override // com.ss.android.lark.appcenter.wrapper.dependency.IAppCenterModuleDependency.AbstractC29134e
                /* renamed from: a */
                public void mo103384a(Context context, String str, String str2, AppType appType, AbstractC13298i iVar) {
                    LittleAppModuleProvider.m157932a().mo148943b().mo149154a(context, str, str2, appType, iVar);
                }

                @Override // com.ss.android.lark.appcenter.wrapper.dependency.IAppCenterModuleDependency.AbstractC29134e
                /* renamed from: a */
                public void mo103385a(Context context, String str, String str2, List<LittleAppPermissionData> list, AppType appType, String str3, Integer num) {
                    ILittleAppService b = LittleAppModuleProvider.m157932a().mo148943b();
                    if (!(list == null || list.size() == 0 || b == null)) {
                        ArrayList arrayList = new ArrayList();
                        for (LittleAppPermissionData littleAppPermissionData : list) {
                            arrayList.add(new com.ss.android.lark.littleapp.entity.LittleAppPermissionData(littleAppPermissionData.getPermission(), littleAppPermissionData.getName(), littleAppPermissionData.isGranted()));
                        }
                        b.mo149156a(context, str, str2, arrayList, appType, str3, num);
                    }
                }
            };
        }

        @Override // com.ss.android.lark.appcenter.wrapper.dependency.IAppCenterModuleDependency
        public IAppCenterModuleDependency.AbstractC29135f getLoginDependency() {
            return new IAppCenterModuleDependency.AbstractC29135f() {
                /* class com.ss.android.lark.integrator.appcenter.AppCenterModuleProvider.AppCenterModuleDependency.AnonymousClass10 */

                @Override // com.ss.android.lark.appcenter.wrapper.dependency.IAppCenterModuleDependency.AbstractC29135f
                /* renamed from: a */
                public String mo103388a() {
                    return AppCenterModuleDependency.this.mPassportApi.getSession();
                }

                @Override // com.ss.android.lark.appcenter.wrapper.dependency.IAppCenterModuleDependency.AbstractC29135f
                /* renamed from: b */
                public String mo103389b() {
                    return AppCenterModuleDependency.this.mPassportApi.getUserId();
                }

                @Override // com.ss.android.lark.appcenter.wrapper.dependency.IAppCenterModuleDependency.AbstractC29135f
                /* renamed from: c */
                public String mo103390c() {
                    return AppCenterModuleDependency.this.mPassportApi.getUserName();
                }

                @Override // com.ss.android.lark.appcenter.wrapper.dependency.IAppCenterModuleDependency.AbstractC29135f
                /* renamed from: f */
                public String mo103393f() {
                    return AppCenterModuleDependency.this.mPassportApi.getTenantId();
                }

                @Override // com.ss.android.lark.appcenter.wrapper.dependency.IAppCenterModuleDependency.AbstractC29135f
                /* renamed from: d */
                public void mo103391d() {
                    AppCenterModuleDependency.this.sChangeListener = $$Lambda$AppCenterModuleProvider$AppCenterModuleDependency$10$3eSOaTCDwdKD3MsBtdkwTFM.INSTANCE;
                    AppCenterModuleDependency.this.mPassportApi.registerUserSwitchListener(AppCenterModuleDependency.this.sChangeListener);
                }

                @Override // com.ss.android.lark.appcenter.wrapper.dependency.IAppCenterModuleDependency.AbstractC29135f
                /* renamed from: e */
                public void mo103392e() {
                    if (AppCenterModuleDependency.this.sChangeListener != null) {
                        AppCenterModuleDependency.this.mPassportApi.unregisterUserSwitchListener(AppCenterModuleDependency.this.sChangeListener);
                    }
                }

                /* access modifiers changed from: private */
                /* renamed from: a */
                public static /* synthetic */ void m154367a(C49382d dVar) {
                    AppCenterModuleProvider.f100374a.mo103323h();
                }
            };
        }

        @Override // com.ss.android.lark.appcenter.wrapper.dependency.IAppCenterModuleDependency
        public IAppCenterModuleDependency.AbstractC29136g getOnCallDependency() {
            return new IAppCenterModuleDependency.AbstractC29136g() {
                /* class com.ss.android.lark.integrator.appcenter.AppCenterModuleProvider.AppCenterModuleDependency.AnonymousClass11 */

                @Override // com.ss.android.lark.appcenter.wrapper.dependency.IAppCenterModuleDependency.AbstractC29136g
                /* renamed from: a */
                public void mo103394a(String str, String str2, IGetDataCallback<String> iGetDataCallback) {
                    ((IIMApi) ApiUtils.getApi(IIMApi.class)).getOnCallChatId(str, str2, iGetDataCallback);
                }
            };
        }

        @Override // com.ss.android.lark.appcenter.wrapper.dependency.IAppCenterModuleDependency
        public String getOpenHost() {
            return DynamicConfigModule.m145551a(DomainSettings.Alias.OPEN);
        }

        public IAppCenterModuleDependency.AbstractC29137h getOpenPlatformDependency() {
            return new IAppCenterModuleDependency.AbstractC29137h() {
                /* class com.ss.android.lark.integrator.appcenter.AppCenterModuleProvider.AppCenterModuleDependency.C391055 */
            };
        }

        @Override // com.ss.android.lark.appcenter.wrapper.dependency.IAppCenterModuleDependency
        public IAppCenterModuleDependency.AbstractC29138i getProfileDependency() {
            return new IAppCenterModuleDependency.AbstractC29138i() {
                /* class com.ss.android.lark.integrator.appcenter.AppCenterModuleProvider.AppCenterModuleDependency.C391012 */

                /* renamed from: a */
                ICoreApi f100385a = ((ICoreApi) ApiUtils.getApi(ICoreApi.class));

                @Override // com.ss.android.lark.appcenter.wrapper.dependency.IAppCenterModuleDependency.AbstractC29138i
                /* renamed from: a */
                public void mo103395a(String str, final IGetDataCallback<String> iGetDataCallback) {
                    this.f100385a.fetchUserProfile(str, new IGetDataCallback<ProfileResponse>() {
                        /* class com.ss.android.lark.integrator.appcenter.AppCenterModuleProvider.AppCenterModuleDependency.C391012.C391021 */

                        @Override // com.larksuite.framework.callback.IGetDataCallback
                        public void onError(ErrorResult errorResult) {
                            iGetDataCallback.onError(errorResult);
                        }

                        /* renamed from: a */
                        public void onSuccess(ProfileResponse profileResponse) {
                            if (profileResponse == null || profileResponse.profile == null) {
                                iGetDataCallback.onSuccess("");
                            } else {
                                iGetDataCallback.onSuccess(profileResponse.profile.getDepartment());
                            }
                        }
                    });
                }
            };
        }

        @Override // com.ss.android.lark.appcenter.wrapper.dependency.IAppCenterModuleDependency
        public void initBytecertSdk() {
            this.mCoreApi.initBytecertSdk();
        }

        @Override // com.ss.android.lark.appcenter.wrapper.dependency.IAppCenterModuleDependency
        public boolean isGooglePlay() {
            return this.mPassportApi.isUsPackage();
        }

        @Override // com.ss.android.lark.appcenter.wrapper.dependency.IAppCenterModuleDependency
        public void notifyMainTabFragmentContentDraw() {
            this.mCoreApi.notifyMainTabFragmentContentDraw("appCenter");
        }

        @Override // com.ss.android.lark.appcenter.wrapper.dependency.IAppCenterModuleDependency
        public void registerWebLifecycleListener() {
            AppCenterModuleProvider.m154360a().mo103322g();
        }

        @Override // com.ss.android.lark.appcenter.wrapper.dependency.IAppCenterModuleDependency
        public IAppCenterModuleDependency.AbstractC29130a getBrowserDependency() {
            final aq b = AppCenterModuleProvider.m154361b();
            return new IAppCenterModuleDependency.AbstractC29130a() {
                /* class com.ss.android.lark.integrator.appcenter.AppCenterModuleProvider.AppCenterModuleDependency.AnonymousClass13 */

                @Override // com.ss.android.lark.appcenter.wrapper.dependency.IAppCenterModuleDependency.AbstractC29130a
                /* renamed from: a */
                public void mo103372a() {
                    AppCenterModuleDependency.this.mCoreApi.registerWebLifecycleListener(b);
                }
            };
        }

        @Override // com.ss.android.lark.appcenter.wrapper.dependency.IAppCenterModuleDependency
        public IAppCenterModuleDependency.AbstractC29133d getGuideDependency() {
            final ICoreApi iCoreApi = (ICoreApi) ApiUtils.getApi(ICoreApi.class);
            return new IAppCenterModuleDependency.AbstractC29133d() {
                /* class com.ss.android.lark.integrator.appcenter.AppCenterModuleProvider.AppCenterModuleDependency.C391044 */

                @Override // com.ss.android.lark.appcenter.wrapper.dependency.IAppCenterModuleDependency.AbstractC29133d
                /* renamed from: a */
                public void mo103377a(String str) {
                    iCoreApi.consumeGuide(str);
                }

                @Override // com.ss.android.lark.appcenter.wrapper.dependency.IAppCenterModuleDependency.AbstractC29133d
                /* renamed from: b */
                public boolean mo103378b(String str) {
                    boolean checkToShow = iCoreApi.checkToShow(str);
                    Log.m165389i("AppCenterModuleProvider", "checkToShow key:" + str + " result:" + checkToShow);
                    return checkToShow;
                }
            };
        }

        @Override // com.ss.android.lark.appcenter.wrapper.dependency.IAppCenterModuleDependency
        public boolean isReportFeatureOn() {
            return C37239a.m146648b().mo136951a("suite_report");
        }

        @Override // com.ss.android.lark.appcenter.wrapper.dependency.IAppCenterModuleDependency
        public boolean isStagingEnv() {
            if (this.mPassportApi.envType() == 2) {
                return true;
            }
            return false;
        }

        @Override // com.ss.android.lark.appcenter.wrapper.dependency.IAppCenterModuleDependency
        public String getDynamicDomain(DomainSettings.Alias alias) {
            return DynamicConfigModule.m145551a(alias);
        }

        @Override // com.ss.android.lark.appcenter.wrapper.dependency.IAppCenterModuleDependency
        public boolean isTabEnable(String str) {
            return this.mCoreApi.isTabEnable(str);
        }

        @Override // com.ss.android.lark.appcenter.wrapper.dependency.IAppCenterModuleDependency
        public void openLarkAboutPage(Context context) {
            this.mCoreApi.openAboutPage(context);
        }

        @Override // com.ss.android.lark.appcenter.wrapper.dependency.IAppCenterModuleDependency
        public void enterBotChat(String str) {
            OpenPlatformModuleProvider.m158457a().mo170502a(new BotOpenData(str, ID_TYPE.BOT_ID));
        }

        public void getTriggerCode(Function1<? super String, Unit> function1) {
            ((IIMApi) ApiUtils.getApi(IIMApi.class)).getTriggerCode(function1);
        }

        @Override // com.ss.android.lark.appcenter.wrapper.dependency.IAppCenterModuleDependency
        public void notifyBootMileStoneFirstContentDraw(String str) {
            Log.m165389i("AppCenterModuleProvider", "AppCenter notify boot mile stone first content draw");
            this.mCoreApi.notifyBootMileStoneFirstContentDraw(str);
        }

        @Override // com.ss.android.lark.appcenter.wrapper.dependency.IAppCenterModuleDependency
        public void notifyBootMileStoneFirstDataLoaded(String str) {
            Log.m165389i("AppCenterModuleProvider", "AppCenter notify boot mile stone first data loaded");
            this.mCoreApi.notifyBootMileStoneFirstDataLoaded(str);
        }

        @Override // com.ss.android.lark.appcenter.wrapper.dependency.IAppCenterModuleDependency
        public void notifyBootMileStoneFirstFrameDraw(String str) {
            Log.m165389i("AppCenterModuleProvider", "AppCenter notify boot mile stone first frame draw");
            this.mCoreApi.notifyBootMileStoneFirstFrameDraw(str);
        }

        public void peakFeedCard(String str) {
            IIMApi iIMApi = (IIMApi) ApiUtils.getApi(IIMApi.class);
            if (iIMApi != null) {
                iIMApi.peakFeedCard(str);
            }
        }

        @Override // com.ss.android.lark.appcenter.wrapper.dependency.IAppCenterModuleDependency
        public void registerDrawerListener(final AbstractC29129b bVar) {
            if (bVar != null) {
                C391066 r0 = new IMainDrawerListener() {
                    /* class com.ss.android.lark.integrator.appcenter.AppCenterModuleProvider.AppCenterModuleDependency.C391066 */

                    @Override // com.ss.android.lark.biz.core.api.IMainDrawerListener
                    /* renamed from: a */
                    public void mo105897a() {
                        bVar.mo103330a();
                    }

                    @Override // com.ss.android.lark.biz.core.api.IMainDrawerListener
                    /* renamed from: b */
                    public void mo105899b() {
                        bVar.mo103332b();
                    }

                    @Override // com.ss.android.lark.biz.core.api.IMainDrawerListener
                    /* renamed from: c */
                    public void mo105900c() {
                        bVar.mo103333c();
                    }

                    @Override // com.ss.android.lark.biz.core.api.IMainDrawerListener
                    /* renamed from: d */
                    public void mo105901d() {
                        bVar.mo103334d();
                    }

                    @Override // com.ss.android.lark.biz.core.api.IMainDrawerListener
                    /* renamed from: a */
                    public void mo105898a(int i) {
                        bVar.mo103331a(i);
                    }
                };
                AppCenterModuleProvider.f100375b.put(bVar, r0);
                this.mCoreApi.registerDrawerListener(r0);
            }
        }

        @Override // com.ss.android.lark.appcenter.wrapper.dependency.IAppCenterModuleDependency
        public void unregisterDrawerListener(AbstractC29129b bVar) {
            IMainDrawerListener xVar = AppCenterModuleProvider.f100375b.get(bVar);
            AppCenterModuleProvider.f100375b.remove(bVar);
            if (xVar != null) {
                this.mCoreApi.unregisterDrawerListener(xVar);
            }
        }

        @Override // com.ss.android.lark.appcenter.wrapper.dependency.IAppCenterModuleDependency
        public void launchMainWindow(Context context, String str) {
            this.mCoreApi.launchMainWindow(context, str, null);
        }

        @Override // com.ss.android.lark.appcenter.wrapper.dependency.IAppCenterModuleDependency
        public void openByAppLink(Context context, String str) {
            this.mCoreApi.openInternal(context, str, 10);
        }

        @Override // com.ss.android.lark.appcenter.wrapper.dependency.IAppCenterModuleDependency
        public boolean canOpenByAppLink(Context context, String str) {
            return this.mCoreApi.canOpenInternal(context, str, 10);
        }

        public void uploadImage(String str, final IGetDataCallback<ArrayList<String>> iGetDataCallback) {
            this.mCoreApi.uploadImage(str, new IGetDataCallback<Image>() {
                /* class com.ss.android.lark.integrator.appcenter.AppCenterModuleProvider.AppCenterModuleDependency.C391088 */

                @Override // com.larksuite.framework.callback.IGetDataCallback
                public void onError(ErrorResult errorResult) {
                    iGetDataCallback.onError(errorResult);
                }

                /* renamed from: a */
                public void onSuccess(Image image) {
                    if (image != null) {
                        iGetDataCallback.onSuccess(new ArrayList(image.getUrls()));
                    }
                }
            });
        }

        public void openByAppLinkWithScene(Context context, String str, int i) {
            this.mCoreApi.openInternal(context, str, i);
        }

        public void startScanQRCodeActivity(Context context, int[] iArr, final IAppCenterModuleDependency.AbstractC29139j jVar) {
            int[] iArr2 = new int[iArr.length];
            System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
            this.mCoreApi.startScanQRCodeActivity(context, iArr2, new IQRCodeScanResultHandler() {
                /* class com.ss.android.lark.integrator.appcenter.AppCenterModuleProvider.AppCenterModuleDependency.C391001 */

                @Override // com.ss.android.lark.biz.core.api.IQRCodeScanResultHandler
                /* renamed from: a */
                public boolean mo105369a(String str, aj ajVar, int i) {
                    return jVar.mo103396a(str, ajVar.mo105591a());
                }
            });
        }

        @Override // com.ss.android.lark.appcenter.wrapper.dependency.IAppCenterModuleDependency
        public void startMiniProgramActivity(Context context, String str, int i) {
            Log.m165389i("AppCenterModuleProvider", "path enterMP scene:" + i);
            int i2 = CommonCode.StatusCode.API_CLIENT_EXPIRED;
            if (i != 1001) {
                i2 = 1000;
            }
            LittleAppModuleProvider.m157932a().mo148938a(context, str, i2);
        }

        @Override // com.ss.android.lark.appcenter.wrapper.dependency.IAppCenterModuleDependency
        public void openSearchMainPageFromAppCenter(Context context, String str, String str2, int i) {
            this.mCoreApi.openSearchMainPageFromAppCenter(context, str, str2, i);
        }

        @Override // com.ss.android.lark.appcenter.wrapper.dependency.IAppCenterModuleDependency
        public void monitorEvent(String str, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3) {
            C39824h.m158095a().mo144321a(getContext(), str, jSONObject, jSONObject2, jSONObject3);
        }

        @Override // com.ss.android.lark.appcenter.wrapper.dependency.IAppCenterModuleDependency
        public void showShareComponent(final Context context, String str, String str2, String str3, String str4, String str5) {
            Log.m165389i("AppCenterModuleProvider", String.format("showShareComponent>>> entryName:%s, appId:%s, iconKey:%s, appName:%s, desc:%s", str, str2, str3, str4, str5));
            OpenPlatformModuleProvider.m158457a().mo170497a(context, str, new C48869c(str2, str3, str4, str5), new AbstractC48867a() {
                /* class com.ss.android.lark.integrator.appcenter.AppCenterModuleProvider.AppCenterModuleDependency.C391077 */

                @Override // com.ss.android.lark.openplatform.shareApp.dto.AbstractC48867a
                /* renamed from: a */
                public void mo142986a() {
                }

                @Override // com.ss.android.lark.openplatform.shareApp.dto.AbstractC48867a
                /* renamed from: a */
                public void mo142987a(ShareAppResult shareAppResult) {
                }

                @Override // com.ss.android.lark.openplatform.shareApp.dto.AbstractC48867a
                /* renamed from: b */
                public void mo142989b() {
                }

                @Override // com.ss.android.lark.openplatform.shareApp.dto.AbstractC48867a
                /* renamed from: b */
                public void mo142990b(boolean z, String str) {
                }

                @Override // com.ss.android.lark.openplatform.shareApp.dto.AbstractC48867a
                /* renamed from: a */
                public void mo142988a(boolean z, String str) {
                    Log.m165389i("AppCenterModuleProvider", String.format("showShareComponent>>> sendShareCardResult success: %b, msg: %s", Boolean.valueOf(z), str));
                    if (z) {
                        LKUIToast.show(context, (int) R.drawable.appcenter_ok_img, (int) R.string.OpenPlatform_Share_ShareSuccessToast);
                    } else {
                        LKUIToast.show(context, (int) R.drawable.appcenter_show_toast_err, (int) R.string.AppDetail_Share_Share_Fail);
                    }
                }
            });
        }

        @Override // com.ss.android.lark.appcenter.wrapper.dependency.IAppCenterModuleDependency
        public void startWebPageActivity(Context context, String str, String str2, boolean z, String str3, String str4) {
            Bundle bundle = new Bundle();
            bundle.putString("app_icon_key", str2);
            bundle.putBoolean("is_web_app", z);
            bundle.putString("app_id", str4);
            this.mCoreApi.openUrl(context, str, UrlParams.m108857a().mo105519a(str3).mo105516a(bundle).mo105523a());
        }
    }

    /* renamed from: b */
    public static aq m154361b() {
        final C29142a aVar = new C29142a();
        return new aq() {
            /* class com.ss.android.lark.integrator.appcenter.AppCenterModuleProvider.C390991 */

            @Override // com.ss.android.lark.biz.core.api.aq
            /* renamed from: a */
            public void mo102649a(WebView webView, Context context, String str, Map<String, String> map) {
                aVar.mo103328a(webView, context, str, map);
            }

            @Override // com.ss.android.lark.biz.core.api.aq
            /* renamed from: b */
            public void mo102650b(WebView webView, Context context, String str, Map<String, String> map) {
                aVar.mo103329b(webView, context, str, map);
            }

            @Override // com.ss.android.lark.biz.core.api.aq
            /* renamed from: a */
            public void mo102647a(WebView webView, Context context, String str, SslError sslError, Map<String, String> map) {
                aVar.mo103326a(webView, context, str, sslError, map);
            }

            @Override // com.ss.android.lark.biz.core.api.aq
            /* renamed from: a */
            public void mo102648a(WebView webView, Context context, String str, String str2, Map<String, String> map) {
                aVar.mo103327a(webView, context, str, str2, map);
            }
        };
    }

    /* renamed from: a */
    public static AppCenterModule m154360a() {
        if (f100374a == null) {
            synchronized (AppCenterModuleProvider.class) {
                if (f100374a == null) {
                    f100374a = new AppCenterModule(LarkContext.getApplication());
                }
            }
        }
        return f100374a;
    }
}
