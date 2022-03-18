package com.ss.android.lark.integrator.mail;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import android.webkit.WebView;
import android.widget.ImageView;
import com.bytedance.ee.bear.contract.drive.AbstractC5138b;
import com.bytedance.ee.bear.contract.drive.sdk.entity.menu.BinderMenuAction;
import com.bytedance.ee.bear.contract.drive.sdk.entity.open.BaseOpenEntity;
import com.bytedance.ee.bear.contract.drive.sdk.entity.open.LocalOpenEntity;
import com.bytedance.ee.bear.contract.route.lark.SpaceMultipleDriveFileRouteBean;
import com.bytedance.ee.bear.drive.business.preview.attachment.SaveToAlbumMenu;
import com.bytedance.ee.bear.drive.business.preview.attachment.SaveToLocalMenu;
import com.bytedance.ee.bear.drive.business.preview.attachment.SaveToSpaceMenu;
import com.bytedance.ee.bear.drive.business.preview.attachment.menuaction.BinderAttachmentMenuAction;
import com.bytedance.ee.bear.drive.business.preview.attachment.menuaction.ForwardMenuAction;
import com.bytedance.ee.bear.drivesdk.plugin.model.menu.OpenExternalMenu;
import com.bytedance.ee.bear.integrator.dto.FileClickModel;
import com.bytedance.framwork.core.monitor.MonitorUtils;
import com.bytedance.i18n.claymore.ClaymoreImpl;
import com.bytedance.lark.pb.basic.v1.DomainSettings;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.thread.CoreThreadPool;
import com.larksuite.framework.utils.C26246a;
import com.larksuite.framework.utils.C26252ad;
import com.larksuite.framework.utils.C26284k;
import com.larksuite.framework.utils.C26311p;
import com.larksuite.framework.utils.CollectionUtils;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.account_provider.integrator.C28513a;
import com.ss.android.lark.biz.core.api.AbstractC29540ab;
import com.ss.android.lark.biz.core.api.AbstractC29586u;
import com.ss.android.lark.biz.core.api.BadgeStyle;
import com.ss.android.lark.biz.core.api.ContactSource;
import com.ss.android.lark.biz.core.api.FilePickerLaunchParams;
import com.ss.android.lark.biz.core.api.ICoreApi;
import com.ss.android.lark.biz.core.api.LoadParams;
import com.ss.android.lark.biz.core.api.NetworkLevelListener;
import com.ss.android.lark.biz.core.api.ProfileResponse;
import com.ss.android.lark.biz.core.api.TimeFormatSetting;
import com.ss.android.lark.biz.core.api.UrlParams;
import com.ss.android.lark.biz.core.api.ao;
import com.ss.android.lark.biz.im.api.AbstractC29616i;
import com.ss.android.lark.biz.im.api.AbstractC29627s;
import com.ss.android.lark.biz.im.api.AbstractC29628t;
import com.ss.android.lark.biz.im.api.ChatBundle;
import com.ss.android.lark.biz.im.api.IIMApi;
import com.ss.android.lark.calendar_api.ICalendarApi;
import com.ss.android.lark.ccm_api.ICCMApi;
import com.ss.android.lark.chat.entity.chat.Chat;
import com.ss.android.lark.chat.entity.chatter.Chatter;
import com.ss.android.lark.chat.entity.translate.TranslateLanguageSetting;
import com.ss.android.lark.dynamicconfig.C36882a;
import com.ss.android.lark.dynamicconfig.DynamicConfigModule;
import com.ss.android.lark.featuregating.C37239a;
import com.ss.android.lark.guidemgr.p1935b.p1937b.C38708a;
import com.ss.android.lark.integrator.mail.MailModuleProvider;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.mail.C41724a;
import com.ss.android.lark.mail.impl.AbstractC41849c;
import com.ss.android.lark.mail.impl.C41816b;
import com.ss.android.lark.mail.impl.ExternalUseConstant;
import com.ss.android.lark.mail.impl.entity.DriveFile;
import com.ss.android.lark.mail.impl.entity.DriveFileOperationMask;
import com.ss.android.lark.mail.impl.entity.MailAddress;
import com.ss.android.lark.mail.impl.entity.MailAttachment;
import com.ss.android.lark.mail.impl.entity.TranslationSetting;
import com.ss.android.lark.mail.impl.mulprocess.C43213b;
import com.ss.android.lark.mail.impl.network.NetworkChangeListener;
import com.ss.android.lark.mail.impl.p2164c.AbstractC41872d;
import com.ss.android.lark.mail.impl.utils.C43785p;
import com.ss.android.lark.mail.impl.utils.C43849u;
import com.ss.android.lark.mail.impl.utils.C43853v;
import com.ss.android.lark.mail.p2157a.AbstractC41740a;
import com.ss.android.lark.maincore.TabType;
import com.ss.android.lark.notification.export.AbstractNotification;
import com.ss.android.lark.notification.export.entity.Notice;
import com.ss.android.lark.openplatform_api.IOpenPlatformApi;
import com.ss.android.lark.p1382b.C29410a;
import com.ss.android.lark.passport.signinsdk_api.feature.listener.user_switch.AbstractC49379a;
import com.ss.android.lark.passport.signinsdk_api.feature.listener.user_switch.C49380b;
import com.ss.android.lark.passport.signinsdk_api.feature.listener.user_switch.C49381c;
import com.ss.android.lark.passport.signinsdk_api.feature.listener.user_switch.C49382d;
import com.ss.android.lark.passport_api.IPassportApi;
import com.ss.android.lark.profile.entity.Profile;
import com.ss.android.lark.statistics.Statistics;
import com.ss.android.lark.utils.ApiUtils;
import com.ss.android.lark.utils.C57824f;
import com.ss.android.lark.utils.C57881t;
import com.ss.android.lark.utils.LarkContext;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;

public class MailModuleProvider {

    /* renamed from: a */
    private static volatile C41724a f101467a;

    @ClaymoreImpl(AbstractC41740a.class)
    public static class MailModuleDependency implements AbstractC41740a {
        private HashMap<String, AbstractC29616i> chatBadgeListener;
        public final Map<AbstractC41872d, ao> listenerCache = new ConcurrentHashMap();
        public final Map<AbstractC41849c.AbstractC41866q, AbstractC29540ab> localeChangeObserverMap = new ConcurrentHashMap();
        public final Map<AbstractC41849c.AbstractC41852c, AbstractC29586u> mAppLifecycleListenerMap = new ConcurrentHashMap();
        private final ICalendarApi mCalendarApi = ((ICalendarApi) ApiUtils.getApi(ICalendarApi.class));
        public final ICoreApi mCoreApi = ((ICoreApi) ApiUtils.getApi(ICoreApi.class));
        public final IIMApi mIMApi = ((IIMApi) ApiUtils.getApi(IIMApi.class));
        public final Map<AbstractC41849c.AbstractC41862m, AbstractC29540ab> mLocaleChangeObserverMap = new ConcurrentHashMap();
        public final Map<NetworkChangeListener, NetworkLevelListener> mNetworkLevelListenerMap = new ConcurrentHashMap();
        private final IOpenPlatformApi mOpenPlatformApi = ((IOpenPlatformApi) ApiUtils.getApi(IOpenPlatformApi.class));
        public final IPassportApi mPassportApi = ((IPassportApi) ApiUtils.getApi(IPassportApi.class));
        public final Map<AbstractC41849c.AbstractC41866q, AbstractC29627s> mPushChatterListenerMap = new ConcurrentHashMap();

        @Override // com.ss.android.lark.mail.p2157a.AbstractC41740a
        public AbstractC41740a.AbstractC41741a getAccountDependency() {
            return new AbstractC41740a.AbstractC41741a() {
                /* class com.ss.android.lark.integrator.mail.MailModuleProvider.MailModuleDependency.AnonymousClass21 */

                /* renamed from: b */
                private C28513a.AbstractC28514a f101489b;

                /* renamed from: c */
                private AbstractC49379a f101490c;

                @Override // com.ss.android.lark.mail.p2157a.AbstractC41740a.AbstractC41741a
                /* renamed from: a */
                public void mo144469a(final AbstractC41740a.AbstractC41741a.AbstractC41742a aVar) {
                    this.f101490c = new AbstractC49379a() {
                        /* class com.ss.android.lark.integrator.mail.MailModuleProvider.MailModuleDependency.AnonymousClass21.C398371 */

                        @Override // com.ss.android.lark.passport.signinsdk_api.feature.listener.user_switch.AbstractC49379a
                        /* renamed from: a */
                        public /* synthetic */ void mo102549a(C49380b bVar) {
                            AbstractC49379a.CC.$default$a(this, bVar);
                        }

                        @Override // com.ss.android.lark.passport.signinsdk_api.feature.listener.user_switch.AbstractC49379a
                        /* renamed from: a */
                        public /* synthetic */ void mo102550a(C49381c cVar) {
                            AbstractC49379a.CC.$default$a(this, cVar);
                        }

                        @Override // com.ss.android.lark.passport.signinsdk_api.feature.listener.user_switch.AbstractC49379a
                        public void onUserSwitchSuccess(C49382d dVar) {
                            aVar.mo150110a();
                        }
                    };
                    MailModuleDependency.this.mPassportApi.registerUserSwitchListener(this.f101490c);
                    $$Lambda$MailModuleProvider$MailModuleDependency$21$273De87cn85CWMHpdO46uyEWaN8 r0 = new C28513a.AbstractC28514a() {
                        /* class com.ss.android.lark.integrator.mail.$$Lambda$MailModuleProvider$MailModuleDependency$21$273De87cn85CWMHpdO46uyEWaN8 */

                        @Override // com.ss.android.lark.account_provider.integrator.C28513a.AbstractC28514a
                        public final void onLoginStatusChanged(int i) {
                            AbstractC41740a.AbstractC41741a.AbstractC41742a.this.mo150110a();
                        }
                    };
                    this.f101489b = r0;
                    C28513a.m104512a(r0);
                }
            };
        }

        @Override // com.ss.android.lark.mail.p2157a.AbstractC41740a
        public Context getAppContext() {
            return LarkContext.getApplication();
        }

        @Override // com.ss.android.lark.mail.p2157a.AbstractC41740a
        public AbstractC41740a.AbstractC41743b getAppLifecycleDependency() {
            return new AbstractC41740a.AbstractC41743b() {
                /* class com.ss.android.lark.integrator.mail.MailModuleProvider.MailModuleDependency.AnonymousClass14 */

                @Override // com.ss.android.lark.mail.p2157a.AbstractC41740a.AbstractC41743b
                /* renamed from: a */
                public void mo144454a(AbstractC41849c.AbstractC41852c cVar) {
                    if (cVar != null && !MailModuleDependency.this.mAppLifecycleListenerMap.containsKey(cVar)) {
                        $$Lambda$MailModuleProvider$MailModuleDependency$14$sdSHfnxxg3bEee51SLMrhvbTkvQ r0 = new AbstractC29586u() {
                            /* class com.ss.android.lark.integrator.mail.$$Lambda$MailModuleProvider$MailModuleDependency$14$sdSHfnxxg3bEee51SLMrhvbTkvQ */

                            @Override // com.ss.android.lark.biz.core.api.AbstractC29586u
                            public final void onAppLifecycleChanged(AbstractC29586u.C29587a aVar, AbstractC29586u.C29587a aVar2) {
                                MailModuleProvider.MailModuleDependency.AnonymousClass14.m158142a(AbstractC41849c.AbstractC41852c.this, aVar, aVar2);
                            }
                        };
                        MailModuleDependency.this.mCoreApi.addLifecycleObserver(r0);
                        MailModuleDependency.this.mAppLifecycleListenerMap.put(cVar, r0);
                        cVar.updateLifecycleState(MailModuleDependency.this.mCoreApi.isAppFront());
                    }
                }

                @Override // com.ss.android.lark.mail.p2157a.AbstractC41740a.AbstractC41743b
                /* renamed from: a */
                public void mo144455a(final AbstractC41849c.AbstractC41862m mVar) {
                    if (mVar != null && !MailModuleDependency.this.mLocaleChangeObserverMap.containsKey(mVar)) {
                        C398351 r0 = new AbstractC29540ab() {
                            /* class com.ss.android.lark.integrator.mail.MailModuleProvider.MailModuleDependency.AnonymousClass14.C398351 */

                            @Override // com.ss.android.lark.biz.core.api.AbstractC29540ab
                            public void onLanguageChange(Locale locale, Locale locale2) {
                                CoreThreadPool.getBackgroundHandler().post(new Runnable(locale2) {
                                    /* class com.ss.android.lark.integrator.mail.$$Lambda$MailModuleProvider$MailModuleDependency$14$1$sDORQAoX18kKi9e3SvHKSpdWcWc */
                                    public final /* synthetic */ Locale f$1;

                                    {
                                        this.f$1 = r2;
                                    }

                                    public final void run() {
                                        AbstractC41849c.AbstractC41862m.this.onLanguageChangeListener(this.f$1);
                                    }
                                });
                            }
                        };
                        MailModuleDependency.this.mLocaleChangeObserverMap.put(mVar, r0);
                        MailModuleDependency.this.mCoreApi.registerLanguageChangeListener(r0);
                    }
                }

                /* access modifiers changed from: private */
                /* renamed from: a */
                public static /* synthetic */ void m158142a(AbstractC41849c.AbstractC41852c cVar, AbstractC29586u.C29587a aVar, AbstractC29586u.C29587a aVar2) {
                    if (aVar.mo105887c() != aVar2.mo105887c()) {
                        cVar.updateLifecycleState(aVar2.mo105887c());
                    }
                }
            };
        }

        @Override // com.ss.android.lark.mail.p2157a.AbstractC41740a
        public AbstractC41740a.AbstractC41744c getBadgeDependency() {
            return new AbstractC41740a.AbstractC41744c() {
                /* class com.ss.android.lark.integrator.mail.MailModuleProvider.MailModuleDependency.C398394 */

                @Override // com.ss.android.lark.mail.p2157a.AbstractC41740a.AbstractC41744c
                /* renamed from: a */
                public int mo144481a() {
                    return MailModuleDependency.this.mCoreApi.getAppIconBadgeCount();
                }

                @Override // com.ss.android.lark.mail.p2157a.AbstractC41740a.AbstractC41744c
                /* renamed from: a */
                public void mo144482a(Context context, int i) {
                    MailModuleDependency.this.mCoreApi.setLauncherBadgeCount(context, i);
                }
            };
        }

        @Override // com.ss.android.lark.mail.p2157a.AbstractC41740a
        public AbstractC41740a.AbstractC41745d getChatDependency() {
            return new AbstractC41740a.AbstractC41745d() {
                /* class com.ss.android.lark.integrator.mail.MailModuleProvider.MailModuleDependency.AnonymousClass11 */

                /* renamed from: a */
                public String mo144444a(String str) {
                    return mo144445a(str, 48);
                }

                @Override // com.ss.android.lark.mail.p2157a.AbstractC41740a.AbstractC41745d
                /* renamed from: b */
                public void mo144449b(AbstractC41849c.AbstractC41866q qVar) {
                    if (qVar != null && MailModuleDependency.this.mPushChatterListenerMap.containsKey(qVar)) {
                        MailModuleDependency.this.mIMApi.removePushMineChatterChangedListener(MailModuleDependency.this.mPushChatterListenerMap.get(qVar));
                        MailModuleDependency.this.mPushChatterListenerMap.remove(qVar);
                    }
                }

                @Override // com.ss.android.lark.mail.p2157a.AbstractC41740a.AbstractC41745d
                /* renamed from: a */
                public void mo144447a(final AbstractC41849c.AbstractC41866q qVar) {
                    if (qVar != null) {
                        if (!MailModuleDependency.this.mPushChatterListenerMap.containsKey(qVar)) {
                            C398331 r0 = new AbstractC29627s() {
                                /* class com.ss.android.lark.integrator.mail.MailModuleProvider.MailModuleDependency.AnonymousClass11.C398331 */

                                @Override // com.ss.android.lark.biz.im.api.AbstractC29627s
                                public void onPushMineChatterChanged(Chatter chatter, Chat chat) {
                                    CoreThreadPool.getBackgroundHandler().post(new Runnable(chatter, qVar) {
                                        /* class com.ss.android.lark.integrator.mail.$$Lambda$MailModuleProvider$MailModuleDependency$11$1$HmNy4pYxAWB_ulbA_3GXpF7_ao */
                                        public final /* synthetic */ Chatter f$1;
                                        public final /* synthetic */ AbstractC41849c.AbstractC41866q f$2;

                                        {
                                            this.f$1 = r2;
                                            this.f$2 = r3;
                                        }

                                        public final void run() {
                                            MailModuleProvider.MailModuleDependency.AnonymousClass11.C398331.this.m158134a(this.f$1, this.f$2);
                                        }
                                    });
                                }

                                /* access modifiers changed from: private */
                                /* renamed from: a */
                                public /* synthetic */ void m158134a(Chatter chatter, AbstractC41849c.AbstractC41866q qVar) {
                                    MailAddress.C42062a aVar = new MailAddress.C42062a();
                                    aVar.mo151209a(chatter.getLocalizedName()).mo151213c(chatter.getId()).mo151215e(AnonymousClass11.this.mo144444a(chatter.getId()));
                                    qVar.onPushChatter(aVar.mo151210a());
                                }
                            };
                            MailModuleDependency.this.mPushChatterListenerMap.put(qVar, r0);
                            MailModuleDependency.this.mIMApi.addPushMineChatterChangedListener(r0);
                        }
                        if (!MailModuleDependency.this.localeChangeObserverMap.containsKey(qVar)) {
                            C398342 r02 = new AbstractC29540ab() {
                                /* class com.ss.android.lark.integrator.mail.MailModuleProvider.MailModuleDependency.AnonymousClass11.C398342 */

                                /* access modifiers changed from: private */
                                /* renamed from: a */
                                public /* synthetic */ void m158135a(AbstractC41849c.AbstractC41866q qVar) {
                                    AnonymousClass11 r0 = AnonymousClass11.this;
                                    qVar.onPushChatter(r0.mo144448b(MailModuleDependency.this.getUserId()));
                                }

                                @Override // com.ss.android.lark.biz.core.api.AbstractC29540ab
                                public void onLanguageChange(Locale locale, Locale locale2) {
                                    CoreThreadPool.getBackgroundHandler().post(new Runnable(qVar) {
                                        /* class com.ss.android.lark.integrator.mail.$$Lambda$MailModuleProvider$MailModuleDependency$11$2$g2_3K451uM84QGsd6b4XiRSXtgk */
                                        public final /* synthetic */ AbstractC41849c.AbstractC41866q f$1;

                                        {
                                            this.f$1 = r2;
                                        }

                                        public final void run() {
                                            MailModuleProvider.MailModuleDependency.AnonymousClass11.C398342.this.m158135a(this.f$1);
                                        }
                                    });
                                }
                            };
                            MailModuleDependency.this.localeChangeObserverMap.put(qVar, r02);
                            MailModuleDependency.this.mCoreApi.registerLanguageChangeListener(r02);
                        }
                    }
                }

                @Override // com.ss.android.lark.mail.p2157a.AbstractC41740a.AbstractC41745d
                /* renamed from: b */
                public MailAddress mo144448b(String str) {
                    if (TextUtils.isEmpty(str)) {
                        return new MailAddress.C42062a().mo151210a();
                    }
                    Chatter chatterById = MailModuleDependency.this.mIMApi.getChatterById(str);
                    if (chatterById == null) {
                        return new MailAddress.C42062a().mo151210a();
                    }
                    String localizedName = chatterById.getLocalizedName();
                    if (TextUtils.isEmpty(localizedName)) {
                        localizedName = "";
                    }
                    MailAddress.C42062a aVar = new MailAddress.C42062a();
                    aVar.mo151209a(localizedName);
                    aVar.mo151213c(str);
                    aVar.mo151215e(mo144444a(str));
                    aVar.mo151214d(chatterById.getAvatarKey());
                    aVar.mo151216f(chatterById.getTenantId());
                    return aVar.mo151210a();
                }

                @Override // com.ss.android.lark.mail.p2157a.AbstractC41740a.AbstractC41745d
                /* renamed from: a */
                public void mo144446a(Context context, String str) {
                    if (!TextUtils.isEmpty(str)) {
                        MailModuleDependency.this.mIMApi.openChat(context, ChatBundle.m109259a().mo105927a(str).mo105934c(false).mo105929a());
                    }
                }

                @Override // com.ss.android.lark.mail.p2157a.AbstractC41740a.AbstractC41745d
                /* renamed from: a */
                public String mo144445a(String str, int i) {
                    if (C43849u.m173830c()) {
                        Log.m165397w("IMailModuleDependency", "getChatterAvatarByUserId run on main thread");
                        return "";
                    }
                    Chatter chatterById = MailModuleDependency.this.mIMApi.getChatterById(str);
                    if (chatterById == null) {
                        return "";
                    }
                    return MailModuleDependency.this.mCoreApi.getAvatarPath(chatterById.getId(), chatterById.getAvatarKey(), i, MailModuleDependency.this.getAppContext().getResources().getDisplayMetrics().density);
                }
            };
        }

        @Override // com.ss.android.lark.mail.p2157a.AbstractC41740a
        public AbstractC41740a.AbstractC41746e getDriveUploadDownProxy() {
            return new AbstractC41740a.AbstractC41746e() {
                /* class com.ss.android.lark.integrator.mail.MailModuleProvider.MailModuleDependency.C398383 */

                @Override // com.ss.android.lark.mail.p2157a.AbstractC41740a.AbstractC41746e
                /* renamed from: a */
                public void mo144479a() {
                    Log.m165389i("IMailModuleDependency", "checkAndInitDoc");
                    ((ICCMApi) ApiUtils.getApi(ICCMApi.class)).checkAndInit();
                }

                @Override // com.ss.android.lark.mail.p2157a.AbstractC41740a.AbstractC41746e
                /* renamed from: b */
                public int mo144480b(String[] strArr) {
                    return ((ICCMApi) ApiUtils.getApi(ICCMApi.class)).driveCancelDownload(strArr);
                }

                @Override // com.ss.android.lark.mail.p2157a.AbstractC41740a.AbstractC41746e
                /* renamed from: a */
                public int mo144474a(String[] strArr) {
                    Log.m165389i("IMailModuleDependency", "driveCancelUpload");
                    return ((ICCMApi) ApiUtils.getApi(ICCMApi.class)).driveCancelUpload(strArr);
                }

                @Override // com.ss.android.lark.mail.p2157a.AbstractC41740a.AbstractC41746e
                /* renamed from: a */
                public String mo144475a(Uri uri, String str, String str2, String str3, AbstractC5138b.AbstractC5140b bVar) {
                    Log.m165389i("IMailModuleDependency", "driveUpload uri");
                    return ((ICCMApi) ApiUtils.getApi(ICCMApi.class)).driveUpload(uri, str, str2, str3, bVar);
                }

                @Override // com.ss.android.lark.mail.p2157a.AbstractC41740a.AbstractC41746e
                /* renamed from: a */
                public String mo144476a(String str, String str2, int i, boolean z, AbstractC5138b.AbstractC5139a aVar) {
                    return ((ICCMApi) ApiUtils.getApi(ICCMApi.class)).driveDownloadNormal(str, str2, i, z, aVar);
                }

                @Override // com.ss.android.lark.mail.p2157a.AbstractC41740a.AbstractC41746e
                /* renamed from: a */
                public String mo144478a(String str, String str2, String str3, String str4, AbstractC5138b.AbstractC5140b bVar) {
                    Log.m165389i("IMailModuleDependency", "driveUpload");
                    return ((ICCMApi) ApiUtils.getApi(ICCMApi.class)).driveUpload(str, str2, str3, str4, bVar);
                }

                @Override // com.ss.android.lark.mail.p2157a.AbstractC41740a.AbstractC41746e
                /* renamed from: a */
                public String mo144477a(String str, String str2, String str3, String str4, int i, String str5, AbstractC5138b.AbstractC5139a aVar) {
                    Log.m165389i("IMailModuleDependency", "driveDownload");
                    return ((ICCMApi) ApiUtils.getApi(ICCMApi.class)).driveDownload(str, str2, str3, str4, i, aVar);
                }
            };
        }

        @Override // com.ss.android.lark.mail.p2157a.AbstractC41740a
        public ExternalUseConstant getExternalUseConstant() {
            return ExternalUseConstant.f106055b.mo150229a();
        }

        @Override // com.ss.android.lark.mail.p2157a.AbstractC41740a
        public AbstractC41740a.AbstractC41747f getFeatureGatingDependency() {
            return new AbstractC41740a.AbstractC41747f() {
                /* class com.ss.android.lark.integrator.mail.MailModuleProvider.MailModuleDependency.AnonymousClass20 */

                @Override // com.ss.android.lark.mail.p2157a.AbstractC41740a.AbstractC41747f
                /* renamed from: a */
                public boolean mo144467a(String str) {
                    return C37239a.m146648b().mo136952a(str, C41724a.m165679a(str));
                }

                @Override // com.ss.android.lark.mail.p2157a.AbstractC41740a.AbstractC41747f
                /* renamed from: b */
                public boolean mo144468b(String str) {
                    return C37239a.m146648b().mo136955b(str, C41724a.m165679a(str));
                }
            };
        }

        @Override // com.ss.android.lark.mail.p2157a.AbstractC41740a
        public AbstractC41740a.AbstractC41748g getFilePickerDependency() {
            return new AbstractC41740a.AbstractC41748g() {
                /* class com.ss.android.lark.integrator.mail.MailModuleProvider.MailModuleDependency.AnonymousClass23 */

                @Override // com.ss.android.lark.mail.p2157a.AbstractC41740a.AbstractC41748g
                /* renamed from: a */
                public String mo144472a() {
                    return "extra.file.path.list";
                }

                @Override // com.ss.android.lark.mail.p2157a.AbstractC41740a.AbstractC41748g
                /* renamed from: a */
                public void mo144473a(Activity activity, int i, long j, String str, String str2) {
                    FilePickerLaunchParams fVar = new FilePickerLaunchParams(activity, i);
                    fVar.mo105737a(j);
                    fVar.mo105738a(str);
                    fVar.mo105745c(str2);
                    MailModuleDependency.this.mCoreApi.startReceivedFilesPicker(fVar);
                }
            };
        }

        @Override // com.ss.android.lark.mail.p2157a.AbstractC41740a
        public AbstractC41740a.AbstractC41749h getFileReaderDependency() {
            return new AbstractC41740a.AbstractC41749h() {
                /* class com.ss.android.lark.integrator.mail.MailModuleProvider.MailModuleDependency.C398405 */

                @Override // com.ss.android.lark.mail.p2157a.AbstractC41740a.AbstractC41749h
                /* renamed from: a */
                public void mo144483a(MailAttachment mailAttachment, String str) {
                    FileClickModel fileClickModel = new FileClickModel();
                    fileClickModel.setFile_id(mailAttachment.mo151234j());
                    fileClickModel.setDrive_file_key(mailAttachment.mo151234j());
                    fileClickModel.setFile_mime_type(mailAttachment.mo151242r());
                    fileClickModel.setFile_name(mailAttachment.mo151229f());
                    fileClickModel.setFile_size(mailAttachment.mo151231h());
                    fileClickModel.setMount_node_token(mailAttachment.mo151244t());
                    fileClickModel.setMount_point(mailAttachment.mo151243s());
                    fileClickModel.setDownLoadPath(C57881t.m224652x(LarkContext.getApplication()));
                    fileClickModel.setType(mailAttachment.mo151238n());
                    ((ICCMApi) ApiUtils.getApi(ICCMApi.class)).openFileReader(fileClickModel, str);
                }
            };
        }

        @Override // com.ss.android.lark.mail.p2157a.AbstractC41740a
        public AbstractC41740a.AbstractC41750i getFileUtilDependency() {
            return new AbstractC41740a.AbstractC41750i() {
                /* class com.ss.android.lark.integrator.mail.MailModuleProvider.MailModuleDependency.C398416 */

                @Override // com.ss.android.lark.mail.p2157a.AbstractC41740a.AbstractC41750i
                /* renamed from: a */
                public int mo144484a(String str, String str2) {
                    return C57881t.m224613a(str, str2);
                }
            };
        }

        @Override // com.ss.android.lark.mail.p2157a.AbstractC41740a
        public AbstractC41740a.AbstractC41751j getGeckoDependency() {
            return new AbstractC41740a.AbstractC41751j() {
                /* class com.ss.android.lark.integrator.mail.MailModuleProvider.MailModuleDependency.AnonymousClass15 */

                @Override // com.ss.android.lark.mail.p2157a.AbstractC41740a.AbstractC41751j
                /* renamed from: a */
                public long mo144456a() {
                    return (long) C29410a.m108287a().mo104277a();
                }

                @Override // com.ss.android.lark.mail.p2157a.AbstractC41740a.AbstractC41751j
                /* renamed from: b */
                public String mo144457b() {
                    if (MailModuleDependency.this.isDebug()) {
                        return "e0d4987feb7b9b221440f2c8cf5e35b8";
                    }
                    return "2b166d8e1ca28f39e33506037e36d05e";
                }

                @Override // com.ss.android.lark.mail.p2157a.AbstractC41740a.AbstractC41751j
                /* renamed from: c */
                public String mo144458c() {
                    return DynamicConfigModule.m145552b().mo136165a("gecko");
                }

                @Override // com.ss.android.lark.mail.p2157a.AbstractC41740a.AbstractC41751j
                /* renamed from: d */
                public String mo144459d() {
                    return MailModuleDependency.this.mPassportApi.getDeviceId();
                }

                @Override // com.ss.android.lark.mail.p2157a.AbstractC41740a.AbstractC41751j
                /* renamed from: e */
                public String mo144460e() {
                    return C26246a.m94977a(LarkContext.getApplication());
                }
            };
        }

        @Override // com.ss.android.lark.mail.p2157a.AbstractC41740a
        public AbstractC41740a.AbstractC41752k getGuideDependency() {
            return new AbstractC41740a.AbstractC41752k() {
                /* class com.ss.android.lark.integrator.mail.MailModuleProvider.MailModuleDependency.AnonymousClass16 */

                @Override // com.ss.android.lark.mail.p2157a.AbstractC41740a.AbstractC41752k
                /* renamed from: a */
                public void mo144461a(List<String> list) {
                    MailModuleDependency.this.mCoreApi.removeGuidesIfNeeded(list);
                }

                @Override // com.ss.android.lark.mail.p2157a.AbstractC41740a.AbstractC41752k
                /* renamed from: a */
                public boolean mo144462a(String str) {
                    return MailModuleDependency.this.mCoreApi.consumeGuide(str);
                }

                @Override // com.ss.android.lark.mail.p2157a.AbstractC41740a.AbstractC41752k
                /* renamed from: b */
                public boolean mo144464b(String str) {
                    return MailModuleDependency.this.mCoreApi.completeGuide(str);
                }

                @Override // com.ss.android.lark.mail.p2157a.AbstractC41740a.AbstractC41752k
                /* renamed from: a */
                public boolean mo144463a(String str, C38708a aVar) {
                    return MailModuleDependency.this.mCoreApi.startGuide(str, aVar);
                }
            };
        }

        @Override // com.ss.android.lark.mail.p2157a.AbstractC41740a
        public AbstractC41740a.AbstractC41753l getImageDependency() {
            return new AbstractC41740a.AbstractC41753l() {
                /* class com.ss.android.lark.integrator.mail.MailModuleProvider.MailModuleDependency.AnonymousClass22 */

                @Override // com.ss.android.lark.mail.p2157a.AbstractC41740a.AbstractC41753l
                /* renamed from: a */
                public void mo144470a(Context context, String str, ImageView imageView, int i, int i2) {
                    if (context == null) {
                        Log.m165383e("IMailModuleDependency", "loadImage null context");
                        return;
                    }
                    if (context instanceof Activity) {
                        Activity activity = (Activity) context;
                        if (activity.isDestroyed() || activity.isFinishing()) {
                            Log.m165383e("IMailModuleDependency", "loadImage activity not active");
                            return;
                        }
                    }
                    MailModuleDependency.this.mCoreApi.loadLocalOrUrlImage(context, imageView, str, new LoadParams().mo105413a(UIUtils.dp2px(context, (float) i)).mo105422b(UIUtils.dp2px(context, (float) i2)));
                }

                @Override // com.ss.android.lark.mail.p2157a.AbstractC41740a.AbstractC41753l
                /* renamed from: a */
                public void mo144471a(Context context, String str, String str2, ImageView imageView, int i, int i2) {
                    if (context == null) {
                        Log.m165383e("IMailModuleDependency", "loadAvatar null context");
                        return;
                    }
                    if (context instanceof Activity) {
                        Activity activity = (Activity) context;
                        if (activity.isDestroyed() || activity.isFinishing()) {
                            Log.m165383e("IMailModuleDependency", "loadAvatar activity not active");
                            return;
                        }
                    }
                    MailModuleDependency.this.mCoreApi.loadAvatarImage(context, imageView, str, str2, new LoadParams().mo105413a(UIUtils.dp2px(context, (float) i)).mo105422b(UIUtils.dp2px(context, (float) i2)));
                }
            };
        }

        @Override // com.ss.android.lark.mail.p2157a.AbstractC41740a
        public Locale getLocale() {
            return this.mCoreApi.getLanguageSetting();
        }

        @Override // com.ss.android.lark.mail.p2157a.AbstractC41740a
        public AbstractC41740a.AbstractC41755n getMainDependency() {
            return new AbstractC41740a.AbstractC41755n() {
                /* class com.ss.android.lark.integrator.mail.MailModuleProvider.MailModuleDependency.C398448 */

                @Override // com.ss.android.lark.mail.p2157a.AbstractC41740a.AbstractC41755n
                /* renamed from: a */
                public void mo144488a() {
                    MailModuleDependency.this.mCoreApi.launchMainWindow(LarkContext.getApplication());
                }

                @Override // com.ss.android.lark.mail.p2157a.AbstractC41740a.AbstractC41755n
                /* renamed from: c */
                public void mo144491c() {
                    MailModuleDependency.this.mCoreApi.notifyBootMileStoneFirstDataLoaded("mail");
                }

                @Override // com.ss.android.lark.mail.p2157a.AbstractC41740a.AbstractC41755n
                /* renamed from: d */
                public void mo144492d() {
                    MailModuleDependency.this.mCoreApi.notifyBootMileStoneFirstFrameDraw("mail");
                }

                @Override // com.ss.android.lark.mail.p2157a.AbstractC41740a.AbstractC41755n
                /* renamed from: b */
                public Intent mo144490b() {
                    return MailModuleDependency.this.mCoreApi.getLaunchMainWindowIntent(LarkContext.getApplication(), MailModuleProvider.m158123a().mo150099b());
                }

                @Override // com.ss.android.lark.mail.p2157a.AbstractC41740a.AbstractC41755n
                /* renamed from: e */
                public void mo144493e() {
                    MailModuleDependency.this.mCoreApi.notifyBootMileStoneFirstContentDraw("mail");
                    MailModuleDependency.this.mCoreApi.notifyMainTabFragmentContentDraw("mail");
                }

                @Override // com.ss.android.lark.mail.p2157a.AbstractC41740a.AbstractC41755n
                /* renamed from: a */
                public boolean mo144489a(String str) {
                    if (MailModuleDependency.this.mCoreApi.getTabType(str) != TabType.Others) {
                        return true;
                    }
                    return false;
                }
            };
        }

        @Override // com.ss.android.lark.mail.p2157a.AbstractC41740a
        public AbstractC41740a.AbstractC41756o getMetricsDependency() {
            return new AbstractC41740a.AbstractC41756o() {
                /* class com.ss.android.lark.integrator.mail.MailModuleProvider.MailModuleDependency.C398459 */

                @Override // com.ss.android.lark.mail.p2157a.AbstractC41740a.AbstractC41756o
                /* renamed from: b */
                public void mo144495b(String str, JSONObject jSONObject) {
                    Statistics.sendEvent(str, jSONObject);
                }

                @Override // com.ss.android.lark.mail.p2157a.AbstractC41740a.AbstractC41756o
                /* renamed from: c */
                public void mo144496c(String str, JSONObject jSONObject) {
                    MonitorUtils.monitorEvent(str, jSONObject, new JSONObject(), new JSONObject());
                }

                @Override // com.ss.android.lark.mail.p2157a.AbstractC41740a.AbstractC41756o
                /* renamed from: a */
                public void mo144494a(String str, JSONObject jSONObject) {
                    if (MailModuleDependency.this.isDebug()) {
                        Log.m165379d("IMailModuleDependency", "not upload in debug mode");
                        return;
                    }
                    Statistics.sendEvent(str, jSONObject);
                    MonitorUtils.monitorEvent(str, jSONObject, new JSONObject(), new JSONObject());
                }
            };
        }

        @Override // com.ss.android.lark.mail.p2157a.AbstractC41740a
        public AbstractC41740a.AbstractC41757p getNotificationDependency() {
            return new AbstractC41740a.AbstractC41757p() {
                /* class com.ss.android.lark.integrator.mail.MailModuleProvider.MailModuleDependency.AnonymousClass10 */

                /* renamed from: b */
                private String m158125b(int i) {
                    return i != 7 ? "normal_v2" : "newMail";
                }

                @Override // com.ss.android.lark.mail.p2157a.AbstractC41740a.AbstractC41757p
                /* renamed from: a */
                public AbstractNotification.AbstractC48496c<Notice> mo144442a() {
                    return MailModuleDependency.this.mCoreApi.getDefaultNotificationHitPoint();
                }

                @Override // com.ss.android.lark.mail.p2157a.AbstractC41740a.AbstractC41757p
                /* renamed from: a */
                public String mo144443a(int i) {
                    return MailModuleDependency.this.mCoreApi.getDetail(m158125b(i)).toString();
                }
            };
        }

        @Override // com.ss.android.lark.mail.p2157a.AbstractC41740a
        public AbstractC41740a.AbstractC41758q getProfileDependency() {
            return new AbstractC41740a.AbstractC41758q() {
                /* class com.ss.android.lark.integrator.mail.MailModuleProvider.MailModuleDependency.C398362 */

                @Override // com.ss.android.lark.mail.p2157a.AbstractC41740a.AbstractC41758q
                /* renamed from: a */
                public void mo144466a(String str, String str2, String str3, String str4) {
                    if (TextUtils.isEmpty(str) && TextUtils.equals(MailModuleDependency.this.getUserId(), str2)) {
                        str = MailModuleDependency.this.getTenantId();
                    }
                    if (!C41816b.m166115a().mo150154u().mo150160a("contact.contactcards.email") || (!TextUtils.isEmpty(str2) && TextUtils.equals(MailModuleDependency.this.getTenantId(), str))) {
                        Chatter chatterById = MailModuleDependency.this.mIMApi.getChatterById(str2);
                        if (chatterById == null) {
                            Log.m165383e("IMailModuleDependency", "openProfile empty chatter");
                        } else if (!chatterById.isBot()) {
                            ContactSource contactSource = new ContactSource();
                            contactSource.setSourceType(6);
                            MailModuleDependency.this.mCoreApi.startUserProfile(LarkContext.getApplication(), str2, chatterById.getId(), contactSource);
                        } else {
                            MailModuleDependency.this.mCoreApi.startAppProfileByBotId(LarkContext.getApplication(), chatterById.getId());
                        }
                    } else {
                        ContactSource contactSource2 = new ContactSource();
                        contactSource2.setSourceType(6);
                        MailModuleDependency.this.mCoreApi.startNameCardProfile(LarkContext.getApplication(), null, str3, contactSource2);
                    }
                }
            };
        }

        @Override // com.ss.android.lark.mail.p2157a.AbstractC41740a
        public AbstractC41740a.AbstractC41759r getSettingDependency() {
            return new AbstractC41740a.AbstractC41759r() {
                /* class com.ss.android.lark.integrator.mail.MailModuleProvider.MailModuleDependency.AnonymousClass13 */

                @Override // com.ss.android.lark.mail.p2157a.AbstractC41740a.AbstractC41759r
                /* renamed from: a */
                public boolean mo144451a() {
                    if (MailModuleDependency.this.mCoreApi.getBadgeStyleSetting() == BadgeStyle.STRONG_REMIND) {
                        return true;
                    }
                    return false;
                }

                @Override // com.ss.android.lark.mail.p2157a.AbstractC41740a.AbstractC41759r
                /* renamed from: b */
                public boolean mo144453b() {
                    if (MailModuleDependency.this.mCoreApi.getLocalTimeFormat().mo105510a() == TimeFormatSetting.TimeFormat.TWENTY_FOUR_HOUR) {
                        return true;
                    }
                    return false;
                }

                @Override // com.ss.android.lark.mail.p2157a.AbstractC41740a.AbstractC41759r
                /* renamed from: a */
                public void mo144450a(AbstractC41872d dVar) {
                    $$Lambda$MailModuleProvider$MailModuleDependency$13$cMmAlQ19Md5d_7_x7r7bQ2oY71w r0 = new ao() {
                        /* class com.ss.android.lark.integrator.mail.$$Lambda$MailModuleProvider$MailModuleDependency$13$cMmAlQ19Md5d_7_x7r7bQ2oY71w */

                        @Override // com.ss.android.lark.biz.core.api.ao
                        public final void onTimeFormatChange(TimeFormatSetting timeFormatSetting) {
                            MailModuleProvider.MailModuleDependency.AnonymousClass13.m158137a(AbstractC41872d.this, timeFormatSetting);
                        }
                    };
                    MailModuleDependency.this.mCoreApi.registerTimeFormatSettingObserver(r0);
                    MailModuleDependency.this.listenerCache.put(dVar, r0);
                }

                @Override // com.ss.android.lark.mail.p2157a.AbstractC41740a.AbstractC41759r
                /* renamed from: b */
                public void mo144452b(AbstractC41872d dVar) {
                    ao aoVar = MailModuleDependency.this.listenerCache.get(dVar);
                    MailModuleDependency.this.listenerCache.remove(dVar);
                    if (aoVar != null) {
                        MailModuleDependency.this.mCoreApi.unRegisterTimeFormatSettingObserver(aoVar);
                    }
                }

                /* access modifiers changed from: private */
                /* renamed from: a */
                public static /* synthetic */ void m158137a(AbstractC41872d dVar, TimeFormatSetting timeFormatSetting) {
                    boolean z;
                    if (timeFormatSetting.mo105510a() == TimeFormatSetting.TimeFormat.TWENTY_FOUR_HOUR) {
                        z = true;
                    } else {
                        z = false;
                    }
                    dVar.mo150437a(z);
                }
            };
        }

        @Override // com.ss.android.lark.mail.p2157a.AbstractC41740a
        public String getTenantId() {
            return this.mPassportApi.getTenantId();
        }

        @Override // com.ss.android.lark.mail.p2157a.AbstractC41740a
        public String getTenantName() {
            return this.mPassportApi.getTenantName();
        }

        @Override // com.ss.android.lark.mail.p2157a.AbstractC41740a
        public AbstractC41740a.AbstractC41760s getWschannelDependency() {
            return new AbstractC41740a.AbstractC41760s() {
                /* class com.ss.android.lark.integrator.mail.MailModuleProvider.MailModuleDependency.C398427 */

                @Override // com.ss.android.lark.mail.p2157a.AbstractC41740a.AbstractC41760s
                /* renamed from: a */
                public NetworkChangeListener.NetworkLevel mo144485a() {
                    return NetworkChangeListener.NetworkLevel.forNumber(MailModuleDependency.this.mCoreApi.getCurNetWorkLevel().getValue());
                }

                @Override // com.ss.android.lark.mail.p2157a.AbstractC41740a.AbstractC41760s
                /* renamed from: b */
                public void mo144487b(NetworkChangeListener networkChangeListener) {
                    if (networkChangeListener != null) {
                        MailModuleDependency.this.mCoreApi.unRegisterNetworkLevelListener(MailModuleDependency.this.mNetworkLevelListenerMap.remove(networkChangeListener));
                    }
                }

                @Override // com.ss.android.lark.mail.p2157a.AbstractC41740a.AbstractC41760s
                /* renamed from: a */
                public void mo144486a(final NetworkChangeListener networkChangeListener) {
                    if (networkChangeListener != null && !MailModuleDependency.this.mNetworkLevelListenerMap.containsKey(networkChangeListener)) {
                        C398431 r0 = new NetworkLevelListener() {
                            /* class com.ss.android.lark.integrator.mail.MailModuleProvider.MailModuleDependency.C398427.C398431 */

                            @Override // com.ss.android.lark.biz.core.api.NetworkLevelListener
                            public void onNetworkLevelChanged(NetworkLevelListener.NetworkLevel networkLevel) {
                                if (networkLevel != null) {
                                    networkChangeListener.onNetworkChanged(NetworkChangeListener.NetworkLevel.forNumber(networkLevel.getValue()));
                                }
                            }
                        };
                        MailModuleDependency.this.mCoreApi.registerNetworkLevelListener(r0);
                        MailModuleDependency.this.mNetworkLevelListenerMap.put(networkChangeListener, r0);
                    }
                }
            };
        }

        @Override // com.ss.android.lark.mail.p2157a.AbstractC41740a
        public boolean isAppRealForeground() {
            return this.mCoreApi.isAppRealForeground();
        }

        @Override // com.ss.android.lark.mail.p2157a.AbstractC41740a
        public boolean isCNEnv() {
            return this.mPassportApi.isCNEnv();
        }

        @Override // com.ss.android.lark.mail.p2157a.AbstractC41740a
        public boolean isGooglePlay() {
            return this.mPassportApi.isUsPackage();
        }

        public boolean isLarkEnv() {
            return this.mPassportApi.isOverseaTenantBrand();
        }

        @Override // com.ss.android.lark.mail.p2157a.AbstractC41740a
        public boolean isUsingTTWebView() {
            return this.mCoreApi.isUsingTTWebView();
        }

        @Override // com.ss.android.lark.mail.p2157a.AbstractC41740a
        public int getEnv() {
            if (this.mPassportApi.envType() != 2) {
                return 1;
            }
            return 3;
        }

        @Override // com.ss.android.lark.mail.p2157a.AbstractC41740a
        public String getForwardModuleAdditionNoteKey() {
            Log.m165389i("IMailModuleDependency", "getForwardModuleAdditionNoteKey");
            return "key_param_addition_note";
        }

        @Override // com.ss.android.lark.mail.p2157a.AbstractC41740a
        public String getUA() {
            return C57824f.m224460a(getAppContext(), null, getLocale());
        }

        public String getUserAvatar() {
            try {
                return this.mPassportApi.getAvatarUrl();
            } catch (Exception e) {
                e.printStackTrace();
                return "";
            }
        }

        @Override // com.ss.android.lark.mail.p2157a.AbstractC41740a
        public String getUserId() {
            try {
                return this.mPassportApi.getUserId();
            } catch (Exception e) {
                e.printStackTrace();
                return "";
            }
        }

        @Override // com.ss.android.lark.mail.p2157a.AbstractC41740a
        public String getUserS() {
            try {
                return this.mPassportApi.getSession();
            } catch (Exception e) {
                e.printStackTrace();
                return "";
            }
        }

        @Override // com.ss.android.lark.mail.p2157a.AbstractC41740a
        public boolean isDebug() {
            return C26284k.m95186b(getAppContext());
        }

        @Override // com.ss.android.lark.mail.p2157a.AbstractC41740a
        public boolean isLeanModeOpen() {
            return this.mCoreApi.isOn("leanMode");
        }

        @Override // com.ss.android.lark.mail.p2157a.AbstractC41740a
        public TranslationSetting syncTranslationSetting() {
            Log.m165389i("IMailModuleDependency", "syncTranslationSetting");
            return C43853v.m173850h();
        }

        @Override // com.ss.android.lark.mail.p2157a.AbstractC41740a
        public String getDomain() {
            if (!C26252ad.m94993b(LarkContext.getApplication())) {
                return C36882a.m145562f();
            }
            return C36882a.m145561e();
        }

        @Override // com.ss.android.lark.mail.p2157a.AbstractC41740a
        public boolean isSmartComposeEnabled() {
            if (!this.mCoreApi.isMailSmartComposeEnabled() || !this.mIMApi.isSmartComposeEnable()) {
                return false;
            }
            return true;
        }

        @Override // com.ss.android.lark.mail.p2157a.AbstractC41740a
        public boolean openPrivacyPolicy(Context context) {
            return this.mCoreApi.openPrivacyPolicy(context);
        }

        @Override // com.ss.android.lark.mail.p2157a.AbstractC41740a
        public boolean openUserProtocol(Context context) {
            return this.mCoreApi.openUserProtocol(context);
        }

        @Override // com.ss.android.lark.mail.p2157a.AbstractC41740a
        public void observeTranslationSetting(final C43853v.AbstractC43859a aVar) {
            this.mIMApi.addPushTranslateLanguageSettingListener(new AbstractC29628t() {
                /* class com.ss.android.lark.integrator.mail.MailModuleProvider.MailModuleDependency.AnonymousClass18 */

                @Override // com.ss.android.lark.biz.im.api.AbstractC29628t
                /* renamed from: a */
                public void mo106752a(int i) {
                    C43853v.AbstractC43859a aVar = aVar;
                    if (aVar != null) {
                        aVar.mo156227a();
                    }
                }

                @Override // com.ss.android.lark.biz.im.api.AbstractC29628t
                /* renamed from: b */
                public void mo106756b(TranslateLanguageSetting translateLanguageSetting) {
                    C43853v.AbstractC43859a aVar = aVar;
                    if (aVar != null) {
                        aVar.mo156227a();
                    }
                }

                @Override // com.ss.android.lark.biz.im.api.AbstractC29628t
                /* renamed from: a */
                public void mo106753a(TranslateLanguageSetting translateLanguageSetting) {
                    C43853v.AbstractC43859a aVar = aVar;
                    if (aVar != null) {
                        aVar.mo156227a();
                    }
                }

                @Override // com.ss.android.lark.biz.im.api.AbstractC29628t
                /* renamed from: b */
                public void mo106757b(Map<String, Integer> map) {
                    C43853v.AbstractC43859a aVar = aVar;
                    if (aVar != null) {
                        aVar.mo156227a();
                    }
                }

                @Override // com.ss.android.lark.biz.im.api.AbstractC29628t
                /* renamed from: a */
                public void mo106754a(List<String> list) {
                    C43853v.AbstractC43859a aVar = aVar;
                    if (aVar != null) {
                        aVar.mo156227a();
                    }
                }

                @Override // com.ss.android.lark.biz.im.api.AbstractC29628t
                /* renamed from: a */
                public void mo106755a(Map<String, Integer> map) {
                    C43853v.AbstractC43859a aVar = aVar;
                    if (aVar != null) {
                        aVar.mo156227a();
                    }
                }
            });
        }

        @Override // com.ss.android.lark.mail.p2157a.AbstractC41740a
        public List<String> getDomains(DomainSettings.Alias alias) {
            Log.m165389i("IMailModuleDependency", "getDomains");
            if (alias != null) {
                return DynamicConfigModule.m145553b(alias);
            }
            Log.m165383e("IMailModuleDependency", "getDomains null");
            return null;
        }

        public Bundle assembleProfileData(Profile profile) {
            String str;
            Bundle bundle = new Bundle();
            bundle.putString("address", profile.getEmail());
            if (C43785p.m173548c()) {
                str = profile.getName();
            } else {
                str = profile.getEnName();
            }
            bundle.putString("userName", str);
            bundle.putString("userID", profile.getId());
            bundle.putString("department", profile.getDepartment());
            bundle.putString("avatar", profile.getAvatarKey());
            return bundle;
        }

        @Override // com.ss.android.lark.mail.p2157a.AbstractC41740a
        public boolean tryOpenUrlWithDoc(String str) {
            Log.m165389i("IMailModuleDependency", "tryOpenUrlWithDoc");
            if (TextUtils.isEmpty(str)) {
                Log.m165389i("IMailModuleDependency", "tryOpenUrlWithDoc invalid url");
                return false;
            } else if (((ICCMApi) ApiUtils.getApi(ICCMApi.class)).canOpen(str)) {
                return ((ICCMApi) ApiUtils.getApi(ICCMApi.class)).open(getAppContext(), str, R.anim.push_left_in_noalpha, R.anim.push_right_out_noalpha, null);
            } else {
                return false;
            }
        }

        @Override // com.ss.android.lark.mail.p2157a.AbstractC41740a
        public boolean tryOpenUrlWithLittleApp(String str) {
            if (TextUtils.isEmpty(str)) {
                return false;
            }
            try {
                if (this.mOpenPlatformApi.canOpenAppLink(str)) {
                    return this.mOpenPlatformApi.openUrl(LarkContext.getApplication(), str, 1000);
                }
            } catch (Throwable th) {
                Log.m165384e("IMailModuleDependency", "tryOpenUrlWithLittleApp err", th);
            }
            return false;
        }

        /* JADX WARNING: Removed duplicated region for block: B:8:0x001b  */
        /* JADX WARNING: Removed duplicated region for block: B:9:0x0028 A[ORIG_RETURN, RETURN, SYNTHETIC] */
        @Override // com.ss.android.lark.mail.p2157a.AbstractC41740a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean viewByDrive(android.os.Bundle r2) {
            /*
                r1 = this;
                if (r2 == 0) goto L_0x0018
                java.lang.Class<com.bytedance.ee.bear.contract.route.lark.SpaceMultipleDriveFileRouteBean> r0 = com.bytedance.ee.bear.contract.route.lark.SpaceMultipleDriveFileRouteBean.class
                java.lang.ClassLoader r0 = r0.getClassLoader()
                r2.setClassLoader(r0)
                java.lang.String r0 = "drive_route_bean"
                android.os.Parcelable r2 = r2.getParcelable(r0)     // Catch:{ all -> 0x0014 }
                com.bytedance.ee.bear.contract.route.lark.SpaceMultipleDriveFileRouteBean r2 = (com.bytedance.ee.bear.contract.route.lark.SpaceMultipleDriveFileRouteBean) r2     // Catch:{ all -> 0x0014 }
                goto L_0x0019
            L_0x0014:
                r2 = move-exception
                r2.printStackTrace()
            L_0x0018:
                r2 = 0
            L_0x0019:
                if (r2 == 0) goto L_0x0028
                java.lang.Class<com.ss.android.lark.ccm_api.ICCMApi> r0 = com.ss.android.lark.ccm_api.ICCMApi.class
                java.lang.Object r0 = com.ss.android.lark.utils.ApiUtils.getApi(r0)
                com.ss.android.lark.ccm_api.ICCMApi r0 = (com.ss.android.lark.ccm_api.ICCMApi) r0
                boolean r2 = r0.open(r2)
                goto L_0x0029
            L_0x0028:
                r2 = 0
            L_0x0029:
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.integrator.mail.MailModuleProvider.MailModuleDependency.viewByDrive(android.os.Bundle):boolean");
        }

        @Override // com.ss.android.lark.mail.p2157a.AbstractC41740a
        public void onCreateWebView(WebView webView, String str) {
            this.mCoreApi.setWebViewTag(webView, "MailWebView");
        }

        public void fetchProfile(String str, final IGetDataCallback<Bundle> iGetDataCallback) {
            Log.m165389i("IMailModuleDependency", "fetchProfile");
            if (TextUtils.isEmpty(str) || iGetDataCallback == null) {
                Log.m165383e("IMailModuleDependency", "fetchProfile invalid input");
            } else {
                this.mCoreApi.fetchUserProfile(str, new IGetDataCallback<ProfileResponse>() {
                    /* class com.ss.android.lark.integrator.mail.MailModuleProvider.MailModuleDependency.AnonymousClass19 */

                    @Override // com.larksuite.framework.callback.IGetDataCallback
                    public void onError(ErrorResult errorResult) {
                        Log.m165383e("IMailModuleDependency", "fetchProfile onError");
                    }

                    /* renamed from: a */
                    public void onSuccess(ProfileResponse profileResponse) {
                        Log.m165389i("IMailModuleDependency", "fetchProfile onSuccess");
                        if (profileResponse == null || profileResponse.profile == null) {
                            Log.m165383e("IMailModuleDependency", "fetchProfile onSuccess invalid data");
                        } else {
                            iGetDataCallback.onSuccess(MailModuleDependency.this.assembleProfileData(profileResponse.profile));
                        }
                    }
                });
            }
        }

        @Override // com.ss.android.lark.mail.p2157a.AbstractC41740a
        public boolean tryOpenUrlWithAppBrowser(Context context, String str) {
            if (TextUtils.isEmpty(str)) {
                Log.m165383e("IMailModuleDependency", "tryOpenUrlWithAppBrowser url empty");
                return false;
            }
            try {
                this.mCoreApi.openUrl(context, str, UrlParams.m108857a().mo105523a());
                return true;
            } catch (Throwable th) {
                Log.m165384e("IMailModuleDependency", "tryOpenUrlWithAppBrowser err", th);
                return false;
            }
        }

        @Override // com.ss.android.lark.mail.p2157a.AbstractC41740a
        public void viewLocalFileByDrive(Context context, String str) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(new OpenExternalMenu((BinderMenuAction) null));
            ((ICCMApi) ApiUtils.getApi(ICCMApi.class)).getDriveSdkWrapper().mo17057a(context, (BaseOpenEntity) new LocalOpenEntity("10", "", "10", C26311p.m95285e(str), null, arrayList, str));
        }

        @Override // com.ss.android.lark.mail.p2157a.AbstractC41740a
        public void openCalendar(Context context, String str, String str2, long j) {
            this.mCalendarApi.startEmailEventDetailActivity(context, str, str2, j);
        }

        @Override // com.ss.android.lark.mail.p2157a.AbstractC41740a
        public void forwardMailToChat(Context context, int i, Bundle bundle, int i2, String str) {
            Log.m165389i("IMailModuleDependency", "forwardMailToChat");
            this.mCoreApi.selectTargetsForForwardingMailToChat(context, i, bundle, i2, str, "forwardToChatChatIDList");
        }

        @Override // com.ss.android.lark.mail.p2157a.AbstractC41740a
        public boolean viewByDrive(String str, List<DriveFile> list, DriveFileOperationMask driveFileOperationMask, HashMap hashMap, final AbstractC41849c.AbstractC41850a aVar) {
            Log.m165389i("IMailModuleDependency", "viewByDrive");
            if (CollectionUtils.isEmpty(list)) {
                Log.m165383e("IMailModuleDependency", "viewByDrive invalid data");
                return false;
            }
            ArrayList<SpaceMultipleDriveFileRouteBean.DriveFile> arrayList = new ArrayList<>();
            for (DriveFile driveFile : list) {
                if (driveFile != null && !TextUtils.isEmpty(driveFile.mo151091a())) {
                    SpaceMultipleDriveFileRouteBean.DriveFile driveFile2 = new SpaceMultipleDriveFileRouteBean.DriveFile();
                    driveFile2.mo20950c("email");
                    driveFile2.mo20946a(driveFile.mo151091a());
                    if (!TextUtils.isEmpty(driveFile.mo151093b())) {
                        driveFile2.mo20948b(C26311p.m95284d(driveFile.mo151093b()));
                    }
                    arrayList.add(driveFile2);
                }
            }
            SpaceMultipleDriveFileRouteBean spaceMultipleDriveFileRouteBean = new SpaceMultipleDriveFileRouteBean();
            spaceMultipleDriveFileRouteBean.mo20962b("thirdparty_attachment");
            if (str == null && CollectionUtils.isNotEmpty(arrayList)) {
                str = arrayList.get(0).mo20945a();
            }
            spaceMultipleDriveFileRouteBean.mo20959a(str);
            spaceMultipleDriveFileRouteBean.mo20940a(arrayList);
            spaceMultipleDriveFileRouteBean.mo20960a(hashMap);
            Bundle bundle = new Bundle();
            ArrayList<? extends Parcelable> arrayList2 = new ArrayList<>();
            if (driveFileOperationMask != null && driveFileOperationMask.mo151103a()) {
                ForwardMenuAction forwardMenuAction = new ForwardMenuAction();
                forwardMenuAction.mo27052a(new BinderAttachmentMenuAction.Stub() {
                    /* class com.ss.android.lark.integrator.mail.MailModuleProvider.MailModuleDependency.BinderC398321 */

                    @Override // com.bytedance.ee.bear.drive.business.preview.attachment.menuaction.AttachmentBaseMenuAction.AbstractC6877a
                    public void action(Bundle bundle) {
                        Log.m165389i("IMailModuleDependency", "viewByDrive click forward");
                        if (bundle == null) {
                            Log.m165383e("IMailModuleDependency", "viewByDrive click forward empty data");
                            return;
                        }
                        String string = bundle.getString("EXTRA_KEY_CUR_TOKEN");
                        if (TextUtils.isEmpty(string)) {
                            Log.m165383e("IMailModuleDependency", "viewByDrive click forward invalid token");
                            return;
                        }
                        AbstractC41849c.AbstractC41850a aVar = aVar;
                        if (aVar != null) {
                            aVar.forwardClick(string);
                        }
                    }
                });
                arrayList2.add(forwardMenuAction);
            }
            arrayList2.add(new SaveToLocalMenu(new SaveToLocalMenu.AbstractC6873a() {
                /* class com.ss.android.lark.integrator.mail.MailModuleProvider.MailModuleDependency.AnonymousClass12 */

                @Override // com.bytedance.ee.bear.drive.business.preview.attachment.SaveToLocalMenu.AbstractC6873a
                /* renamed from: a */
                public void mo27042a(boolean z, SaveToLocalMenu.C6874b bVar) {
                    Log.m165389i("IMailModuleDependency", "SaveToLocalMenu onSaved");
                    if (!z || bVar == null) {
                        Log.m165383e("IMailModuleDependency", "SaveToLocalMenu onSaved failed");
                    }
                }
            }));
            if (driveFileOperationMask != null && driveFileOperationMask.mo151105c()) {
                arrayList2.add(new SaveToAlbumMenu(new SaveToLocalMenu.AbstractC6873a() {
                    /* class com.ss.android.lark.integrator.mail.MailModuleProvider.MailModuleDependency.AnonymousClass17 */

                    @Override // com.bytedance.ee.bear.drive.business.preview.attachment.SaveToLocalMenu.AbstractC6873a
                    /* renamed from: a */
                    public void mo27042a(boolean z, SaveToLocalMenu.C6874b bVar) {
                        Log.m165389i("IMailModuleDependency", "saveToAlbumMenu onSaved");
                        if (!z || bVar == null) {
                            Log.m165383e("IMailModuleDependency", "saveToAlbumMenu onSaved failed");
                        }
                    }
                }));
            }
            if (driveFileOperationMask != null && !driveFileOperationMask.mo151106d()) {
                SaveToSpaceMenu saveToSpaceMenu = new SaveToSpaceMenu();
                saveToSpaceMenu.mo27043a(false);
                arrayList2.add(saveToSpaceMenu);
            }
            bundle.putParcelableArrayList("AttachmentMenuConfig", arrayList2);
            spaceMultipleDriveFileRouteBean.mo20958a(bundle);
            if (C41816b.m166115a().mo150120a() == C43213b.f109974a) {
                return ((ICCMApi) ApiUtils.getApi(ICCMApi.class)).open(spaceMultipleDriveFileRouteBean);
            }
            Bundle bundle2 = new Bundle();
            bundle2.putParcelable("drive_route_bean", spaceMultipleDriveFileRouteBean);
            return C41816b.m166115a().mo150129a(bundle2);
        }
    }

    /* renamed from: b */
    public static AbstractC41740a m158124b() {
        return (AbstractC41740a) ApiUtils.getApi(AbstractC41740a.class);
    }

    /* renamed from: a */
    public static C41724a m158123a() {
        if (f101467a == null) {
            synchronized (MailModuleProvider.class) {
                if (f101467a == null) {
                    f101467a = new C41724a();
                }
            }
        }
        return f101467a;
    }
}
