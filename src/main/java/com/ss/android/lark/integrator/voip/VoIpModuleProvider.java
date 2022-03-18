package com.ss.android.lark.integrator.voip;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.bytedance.i18n.claymore.ClaymoreImpl;
import com.huawei.updatesdk.service.otaupdate.UpdateDialogStatusCode;
import com.larksuite.framework.utils.UIUtils;
import com.ss.android.lark.biz.core.api.ContentStateChangeCallback;
import com.ss.android.lark.biz.core.api.ICoreApi;
import com.ss.android.lark.biz.core.api.IUiModeService;
import com.ss.android.lark.biz.core.api.LoadParams;
import com.ss.android.lark.biz.core.api.NetworkLevelListener;
import com.ss.android.lark.biz.core.api.WSConnState;
import com.ss.android.lark.biz.im.api.ChatBundle;
import com.ss.android.lark.biz.im.api.ChatWindowPrepareData;
import com.ss.android.lark.biz.im.api.ChatterNameDisplayRule;
import com.ss.android.lark.biz.im.api.IIMApi;
import com.ss.android.lark.chat.entity.chat.Chat;
import com.ss.android.lark.chat.entity.chatter.Chatter;
import com.ss.android.lark.chat.export.entity.chatter.OpenChatter;
import com.ss.android.lark.featuregating.C37239a;
import com.ss.android.lark.image.entity.AvatarImage;
import com.ss.android.lark.integrator.voip.VoIpModuleProvider;
import com.ss.android.lark.notification.export.entity.Notice;
import com.ss.android.lark.p1382b.C29410a;
import com.ss.android.lark.p1382b.p1384b.AbstractC29417b;
import com.ss.android.lark.passport.signinsdk_api.entity.AccountInterceptorBean;
import com.ss.android.lark.passport.signinsdk_api.interfaces.IAccountInterceptor;
import com.ss.android.lark.passport_api.IPassportApi;
import com.ss.android.lark.utils.ApiUtils;
import com.ss.android.lark.utils.LarkContext;
import com.ss.android.lark.vcintegrator.VideoChatModuleProvider;
import com.ss.android.lark.voip.C57977a;
import com.ss.android.lark.voip.p2911a.AbstractC57981a;
import com.ss.android.lark.voip.p2911a.AbstractC57983b;
import com.ss.android.lark.voip.p2911a.AbstractC57985c;
import com.ss.android.lark.voip.p2911a.AbstractC57987d;
import com.ss.android.lark.voip.p2912b.C58000a;
import com.ss.android.lark.voip.service.IVoIpNetLevelListener;
import com.ss.android.lark.voip.service.impl.C58143c;
import com.ss.android.vc.service.IVideoChatService;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

public class VoIpModuleProvider {

    /* renamed from: a */
    public static final Map<IVoIpNetLevelListener, NetworkLevelListener> f101839a = new ConcurrentHashMap();

    /* renamed from: b */
    public static List<AbstractC57981a.AbstractC57982a> f101840b = new ArrayList();

    /* renamed from: c */
    public static final Object f101841c = new Object();

    /* renamed from: d */
    public static IIMApi f101842d = ((IIMApi) ApiUtils.getApi(IIMApi.class));

    /* renamed from: e */
    public static ICoreApi f101843e = ((ICoreApi) ApiUtils.getApi(ICoreApi.class));

    /* renamed from: f */
    public static IPassportApi f101844f = ((IPassportApi) ApiUtils.getApi(IPassportApi.class));

    /* renamed from: g */
    private static final Map<C57977a, AbstractC29417b.AbstractC29418a> f101845g = new ConcurrentHashMap();

    /* renamed from: h */
    private static final Map<C57977a, WSConnState.AbstractC29537a> f101846h = new ConcurrentHashMap();

    /* renamed from: i */
    private static final Map<C57977a, IAccountInterceptor> f101847i = new ConcurrentHashMap();

    /* renamed from: j */
    private static volatile C57977a f101848j;

    @ClaymoreImpl(AbstractC57987d.class)
    public static class VoIpModuleDependency implements AbstractC57987d {
        @Override // com.ss.android.lark.voip.p2911a.AbstractC57987d
        public AbstractC57981a getAppConfigurationDependency() {
            return new AbstractC57981a() {
                /* class com.ss.android.lark.integrator.voip.VoIpModuleProvider.VoIpModuleDependency.C400786 */

                @Override // com.ss.android.lark.voip.p2911a.AbstractC57981a
                /* renamed from: b */
                public void mo145500b(AbstractC57981a.AbstractC57982a aVar) {
                    synchronized (VoIpModuleProvider.f101841c) {
                        VoIpModuleProvider.f101840b.remove(aVar);
                    }
                }

                @Override // com.ss.android.lark.voip.p2911a.AbstractC57981a
                /* renamed from: a */
                public void mo145499a(AbstractC57981a.AbstractC57982a aVar) {
                    synchronized (VoIpModuleProvider.f101841c) {
                        if (!VoIpModuleProvider.f101840b.contains(aVar)) {
                            VoIpModuleProvider.f101840b.add(aVar);
                        }
                    }
                }
            };
        }

        @Override // com.ss.android.lark.voip.p2911a.AbstractC57987d
        public AbstractC57983b getAppStateDependency() {
            return new AbstractC57983b() {
                /* class com.ss.android.lark.integrator.voip.VoIpModuleProvider.VoIpModuleDependency.C400723 */

                /* renamed from: b */
                private ConcurrentHashMap<AbstractC57983b.AbstractC57984a, AbstractC29417b.AbstractC29418a> f101856b = new ConcurrentHashMap<>();

                @Override // com.ss.android.lark.voip.p2911a.AbstractC57983b
                /* renamed from: a */
                public void mo145494a(final AbstractC57983b.AbstractC57984a aVar) {
                    C400731 r0 = new AbstractC29417b.AbstractC29418a() {
                        /* class com.ss.android.lark.integrator.voip.VoIpModuleProvider.VoIpModuleDependency.C400723.C400731 */

                        @Override // com.ss.android.lark.p1382b.p1384b.AbstractC29417b.AbstractC29418a
                        public void OnAppStateChanged(boolean z) {
                            aVar.mo196611a(z);
                        }
                    };
                    this.f101856b.put(aVar, r0);
                    C29410a.m108289c().mo104284a(r0);
                }
            };
        }

        @Override // com.ss.android.lark.voip.p2911a.AbstractC57987d
        public AbstractC57987d.AbstractC57988a getChatDependency() {
            return new AbstractC57987d.AbstractC57988a() {
                /* class com.ss.android.lark.integrator.voip.VoIpModuleProvider.VoIpModuleDependency.C400797 */

                @Override // com.ss.android.lark.voip.p2911a.AbstractC57987d.AbstractC57988a
                /* renamed from: a */
                public Chatter mo145502a() {
                    return VoIpModuleProvider.f101842d.getLoginChatter();
                }

                @Override // com.ss.android.lark.voip.p2911a.AbstractC57987d.AbstractC57988a
                /* renamed from: b */
                public Chat mo145506b(String str) {
                    return VoIpModuleProvider.f101842d.syncGetP2pChatCreatedByChatterId(str, VoIpModuleProvider.f101844f.getUserId());
                }

                @Override // com.ss.android.lark.voip.p2911a.AbstractC57987d.AbstractC57988a
                /* renamed from: a */
                public Chatter mo145503a(String str) {
                    return VoIpModuleProvider.f101842d.getChatterById(str);
                }

                @Override // com.ss.android.lark.voip.p2911a.AbstractC57987d.AbstractC57988a
                /* renamed from: a */
                public String mo145504a(Chatter chatter) {
                    return VoIpModuleProvider.f101842d.getDisplayName(chatter, ChatterNameDisplayRule.ALIAS_NICKNAME_NAME);
                }

                @Override // com.ss.android.lark.voip.p2911a.AbstractC57987d.AbstractC57988a
                /* renamed from: a */
                public String mo145505a(OpenChatter openChatter) {
                    return VoIpModuleProvider.f101842d.getDisplayName(openChatter, ChatterNameDisplayRule.ALIAS_NAME);
                }

                /* access modifiers changed from: private */
                /* renamed from: a */
                public static /* synthetic */ void m158899a(AbstractC57987d.AbstractC57988a.AbstractC57989a aVar, Bundle bundle) {
                    if (aVar != null) {
                        aVar.mo196618a(bundle);
                    }
                }

                @Override // com.ss.android.lark.voip.p2911a.AbstractC57987d.AbstractC57988a
                /* renamed from: a */
                public Bundle mo145501a(String str, String str2, AbstractC57987d.AbstractC57988a.AbstractC57989a aVar) {
                    ChatWindowPrepareData chatLauncherInfo = VoIpModuleProvider.f101842d.getChatLauncherInfo(str);
                    if (chatLauncherInfo == null) {
                        return null;
                    }
                    return ChatBundle.m109259a().mo105927a(str).mo105925a(chatLauncherInfo).mo105933c(str2).mo105920a(-1).mo105929a().mo105916a(new ChatBundle.AbstractC29591b() {
                        /* class com.ss.android.lark.integrator.voip.$$Lambda$VoIpModuleProvider$VoIpModuleDependency$7$Les6LOlodeyTUi6iFNvLIp0EZws */

                        @Override // com.ss.android.lark.biz.im.api.ChatBundle.AbstractC29591b
                        public final void inject(Bundle bundle) {
                            VoIpModuleProvider.VoIpModuleDependency.C400797.m158899a(AbstractC57987d.AbstractC57988a.AbstractC57989a.this, bundle);
                        }
                    });
                }
            };
        }

        @Override // com.ss.android.lark.voip.p2911a.AbstractC57987d
        public Context getContext() {
            return LarkContext.getApplication();
        }

        @Override // com.ss.android.lark.voip.p2911a.AbstractC57987d
        public String getDeviceId() {
            return VoIpModuleProvider.f101844f.getDeviceId();
        }

        @Override // com.ss.android.lark.voip.p2911a.AbstractC57987d
        public AbstractC57987d.AbstractC57990b getFeedDependency() {
            return new AbstractC57987d.AbstractC57990b() {
                /* class com.ss.android.lark.integrator.voip.VoIpModuleProvider.VoIpModuleDependency.AnonymousClass12 */

                @Override // com.ss.android.lark.voip.p2911a.AbstractC57987d.AbstractC57990b
                /* renamed from: a */
                public String mo145486a() {
                    return "switch_to_inbox";
                }

                @Override // com.ss.android.lark.voip.p2911a.AbstractC57987d.AbstractC57990b
                /* renamed from: b */
                public String mo145487b() {
                    return VoIpModuleProvider.f101842d.getFeedTabPageName();
                }
            };
        }

        @Override // com.ss.android.lark.voip.p2911a.AbstractC57987d
        public AbstractC57987d.AbstractC57991c getImageDependency() {
            return new AbstractC57987d.AbstractC57991c() {
                /* class com.ss.android.lark.integrator.voip.VoIpModuleProvider.VoIpModuleDependency.C400819 */

                @Override // com.ss.android.lark.voip.p2911a.AbstractC57987d.AbstractC57991c
                /* renamed from: a */
                public Object mo145509a(String str, String str2, int i, int i2) {
                    return AvatarImage.Builder.obtain(str, str2, UIUtils.dp2px(LarkContext.getApplication(), (float) i), UIUtils.dp2px(LarkContext.getApplication(), (float) i2)).build();
                }

                @Override // com.ss.android.lark.voip.p2911a.AbstractC57987d.AbstractC57991c
                /* renamed from: a */
                public void mo145510a(Context context, String str, String str2, String str3, ImageView imageView, int i, int i2) {
                    VoIpModuleProvider.f101843e.loadAvatarImage(context, imageView, str2, str3, new LoadParams().mo105413a(UIUtils.dp2px(context, (float) i)).mo105422b(UIUtils.dp2px(context, (float) i2)));
                }
            };
        }

        @Override // com.ss.android.lark.voip.p2911a.AbstractC57987d
        public Locale getLanguageSetting() {
            return VoIpModuleProvider.f101843e.getLanguageSetting();
        }

        @Override // com.ss.android.lark.voip.p2911a.AbstractC57987d
        public AbstractC57985c getLoginDependency() {
            return new AbstractC57985c() {
                /* class com.ss.android.lark.integrator.voip.VoIpModuleProvider.VoIpModuleDependency.C400765 */

                /* renamed from: b */
                private ConcurrentHashMap<AbstractC57985c.AbstractC57986a, IAccountInterceptor> f101864b = new ConcurrentHashMap<>();

                @Override // com.ss.android.lark.voip.p2911a.AbstractC57985c
                /* renamed from: a */
                public void mo145498a(final AbstractC57985c.AbstractC57986a aVar) {
                    C400771 r0 = new IAccountInterceptor() {
                        /* class com.ss.android.lark.integrator.voip.VoIpModuleProvider.VoIpModuleDependency.C400765.C400771 */

                        @Override // com.ss.android.lark.passport.signinsdk_api.interfaces.IAccountInterceptor
                        /* renamed from: a */
                        public boolean mo144654a() {
                            return aVar.mo196613a();
                        }

                        @Override // com.ss.android.lark.passport.signinsdk_api.interfaces.IAccountInterceptor
                        /* renamed from: c */
                        public int mo144656c() {
                            return aVar.mo196615c();
                        }

                        @Override // com.ss.android.lark.passport.signinsdk_api.interfaces.IAccountInterceptor
                        /* renamed from: d */
                        public int mo144657d() {
                            return aVar.mo196616d();
                        }

                        @Override // com.ss.android.lark.passport.signinsdk_api.interfaces.IAccountInterceptor
                        /* renamed from: b */
                        public AccountInterceptorBean mo144655b() {
                            C58000a b = aVar.mo196614b();
                            if (b == null) {
                                return null;
                            }
                            return new AccountInterceptorBean(b.mo196620a(), b.mo196621b(), b.mo196622c(), b.mo196623d());
                        }
                    };
                    this.f101864b.put(aVar, r0);
                    VoIpModuleProvider.f101844f.registerInterceptor(r0);
                }
            };
        }

        @Override // com.ss.android.lark.voip.p2911a.AbstractC57987d
        public AbstractC57987d.AbstractC57992d getMainDependency() {
            return new AbstractC57987d.AbstractC57992d() {
                /* class com.ss.android.lark.integrator.voip.VoIpModuleProvider.VoIpModuleDependency.AnonymousClass11 */

                @Override // com.ss.android.lark.voip.p2911a.AbstractC57987d.AbstractC57992d
                /* renamed from: a */
                public String mo145484a() {
                    return VoIpModuleProvider.f101843e.getKeyFromNotification();
                }

                @Override // com.ss.android.lark.voip.p2911a.AbstractC57987d.AbstractC57992d
                /* renamed from: a */
                public Bundle mo145483a(Bundle bundle) {
                    bundle.putInt("open_fragment_id", 4098);
                    return bundle;
                }

                @Override // com.ss.android.lark.voip.p2911a.AbstractC57987d.AbstractC57992d
                /* renamed from: a */
                public void mo145485a(Context context) {
                    VoIpModuleProvider.f101843e.startMainActivity(context);
                }

                @Override // com.ss.android.lark.voip.p2911a.AbstractC57987d.AbstractC57992d
                /* renamed from: a */
                public Intent mo145482a(Context context, String str, Bundle bundle) {
                    return VoIpModuleProvider.f101843e.getLaunchMainWindowIntent(context, str, bundle);
                }
            };
        }

        @Override // com.ss.android.lark.voip.p2911a.AbstractC57987d
        public AbstractC57987d.AbstractC57993e getMultiTaskDependency() {
            return new AbstractC57987d.AbstractC57993e() {
                /* class com.ss.android.lark.integrator.voip.VoIpModuleProvider.VoIpModuleDependency.C400701 */

                @Override // com.ss.android.lark.voip.p2911a.AbstractC57987d.AbstractC57993e
                /* renamed from: a */
                public boolean mo145474a() {
                    return VoIpModuleProvider.f101843e.isMultitaskEnabled(LarkContext.getApplication());
                }

                @Override // com.ss.android.lark.voip.p2911a.AbstractC57987d.AbstractC57993e
                /* renamed from: a */
                public void mo145472a(View view) {
                    VoIpModuleProvider.f101843e.addAppFloatView(view);
                }

                @Override // com.ss.android.lark.voip.p2911a.AbstractC57987d.AbstractC57993e
                /* renamed from: b */
                public void mo145475b(View view) {
                    VoIpModuleProvider.f101843e.removeAppFloatView(view);
                }

                @Override // com.ss.android.lark.voip.p2911a.AbstractC57987d.AbstractC57993e
                /* renamed from: a */
                public void mo145473a(AbstractC57987d.AbstractC57993e.AbstractC57994a aVar) {
                    if (aVar == null) {
                        VoIpModuleProvider.f101843e.setContentStandAloneCallback(null);
                        return;
                    }
                    ICoreApi iCoreApi = VoIpModuleProvider.f101843e;
                    aVar.getClass();
                    iCoreApi.setContentStandAloneCallback(new ContentStateChangeCallback() {
                        /* class com.ss.android.lark.integrator.voip.$$Lambda$L9yuvVtE_7lbSfbRzh2z19Ik1M */

                        @Override // com.ss.android.lark.biz.core.api.ContentStateChangeCallback
                        public final void onContentStateChanged(boolean z) {
                            AbstractC57987d.AbstractC57993e.AbstractC57994a.this.onChanged(z);
                        }
                    });
                }
            };
        }

        @Override // com.ss.android.lark.voip.p2911a.AbstractC57987d
        public AbstractC57987d.AbstractC57995f getNotificationDependency() {
            return new AbstractC57987d.AbstractC57995f() {
                /* class com.ss.android.lark.integrator.voip.VoIpModuleProvider.VoIpModuleDependency.C400712 */

                /* renamed from: d */
                private String m158879d(int i) {
                    return i != 10004 ? "normal_v2" : "at_v2";
                }

                @Override // com.ss.android.lark.voip.p2911a.AbstractC57987d.AbstractC57995f
                /* renamed from: a */
                public boolean mo145490a(int i) {
                    return VoIpModuleProvider.f101843e.getNotificationSetting().mo105561b(m158879d(i));
                }

                @Override // com.ss.android.lark.voip.p2911a.AbstractC57987d.AbstractC57995f
                /* renamed from: b */
                public boolean mo145492b(int i) {
                    return VoIpModuleProvider.f101843e.getNotificationSetting().mo105562c(m158879d(i));
                }

                @Override // com.ss.android.lark.voip.p2911a.AbstractC57987d.AbstractC57995f
                /* renamed from: c */
                public String mo145493c(int i) {
                    return VoIpModuleProvider.f101843e.getNotificationSetting().mo105560a(m158879d(i)).toString();
                }

                @Override // com.ss.android.lark.voip.p2911a.AbstractC57987d.AbstractC57995f
                /* renamed from: a */
                public void mo145488a(String str) {
                    if (!TextUtils.isEmpty(str)) {
                        Notice notice = new Notice();
                        notice.key = str;
                        notice.extra = new Notice.Extra();
                        notice.type = 10004;
                        notice.state = 1;
                        VoIpModuleProvider.f101843e.pushNotice(notice);
                    }
                }

                @Override // com.ss.android.lark.voip.p2911a.AbstractC57987d.AbstractC57995f
                /* renamed from: b */
                public void mo145491b(String str) {
                    if (!TextUtils.isEmpty(str)) {
                        Notice notice = new Notice();
                        notice.key = str;
                        notice.extra = new Notice.Extra();
                        notice.type = 10004;
                        notice.state = 3;
                        VoIpModuleProvider.f101843e.pushNotice(notice);
                    }
                }

                @Override // com.ss.android.lark.voip.p2911a.AbstractC57987d.AbstractC57995f
                /* renamed from: a */
                public void mo145489a(String str, String str2) {
                    Notice notice = new Notice();
                    notice.key = str;
                    notice.extra = new Notice.Extra();
                    notice.extra.f122006e = str2;
                    notice.type = UpdateDialogStatusCode.SHOW;
                    VoIpModuleProvider.f101843e.pushNotice(notice);
                }
            };
        }

        @Override // com.ss.android.lark.voip.p2911a.AbstractC57987d
        public AbstractC57987d.AbstractC57996g getSettingDependency() {
            return new AbstractC57987d.AbstractC57996g() {
                /* class com.ss.android.lark.integrator.voip.VoIpModuleProvider.VoIpModuleDependency.C400808 */

                @Override // com.ss.android.lark.voip.p2911a.AbstractC57987d.AbstractC57996g
                /* renamed from: a */
                public long mo145507a() {
                    return VoIpModuleProvider.f101843e.getNtpTime();
                }

                @Override // com.ss.android.lark.voip.p2911a.AbstractC57987d.AbstractC57996g
                /* renamed from: a */
                public boolean mo145508a(boolean z) {
                    return VoIpModuleProvider.f101843e.isNotificationShowDetail(z);
                }
            };
        }

        @Override // com.ss.android.lark.voip.p2911a.AbstractC57987d
        public String getUserId() {
            return VoIpModuleProvider.f101844f.getUserId();
        }

        @Override // com.ss.android.lark.voip.p2911a.AbstractC57987d
        public AbstractC57987d.AbstractC57997h getVideoChatDependency() {
            return new AbstractC57987d.AbstractC57997h() {
                /* class com.ss.android.lark.integrator.voip.VoIpModuleProvider.VoIpModuleDependency.AnonymousClass10 */

                /* renamed from: b */
                private final IVideoChatService f101851b = VideoChatModuleProvider.m224877f();

                @Override // com.ss.android.lark.voip.p2911a.AbstractC57987d.AbstractC57997h
                /* renamed from: b */
                public boolean mo145478b() {
                    return this.f101851b.isRinging();
                }

                @Override // com.ss.android.lark.voip.p2911a.AbstractC57987d.AbstractC57997h
                /* renamed from: c */
                public void mo145479c() {
                    this.f101851b.notifyVoipOnCall();
                }

                @Override // com.ss.android.lark.voip.p2911a.AbstractC57987d.AbstractC57997h
                /* renamed from: d */
                public boolean mo145480d() {
                    return this.f101851b.isLiveInFloat();
                }

                @Override // com.ss.android.lark.voip.p2911a.AbstractC57987d.AbstractC57997h
                /* renamed from: e */
                public void mo145481e() {
                    this.f101851b.interruptFloatLive();
                }

                @Override // com.ss.android.lark.voip.p2911a.AbstractC57987d.AbstractC57997h
                /* renamed from: a */
                public boolean mo145477a() {
                    return this.f101851b.isOngoing(true);
                }

                @Override // com.ss.android.lark.voip.p2911a.AbstractC57987d.AbstractC57997h
                /* renamed from: a */
                public void mo145476a(Context context, OpenChatter openChatter, IVideoChatService.AbstractC63627b bVar) {
                    this.f101851b.mo220072a(context, openChatter, bVar);
                }
            };
        }

        @Override // com.ss.android.lark.voip.p2911a.AbstractC57987d
        public AbstractC57987d.AbstractC57998i getWsChannelDependency() {
            return new AbstractC57987d.AbstractC57998i() {
                /* class com.ss.android.lark.integrator.voip.VoIpModuleProvider.VoIpModuleDependency.C400744 */

                /* renamed from: b */
                private ConcurrentHashMap<AbstractC57987d.AbstractC57998i.AbstractC57999a, WSConnState.AbstractC29537a> f101860b = new ConcurrentHashMap<>();

                @Override // com.ss.android.lark.voip.p2911a.AbstractC57987d.AbstractC57998i
                /* renamed from: a */
                public void mo145495a(final AbstractC57987d.AbstractC57998i.AbstractC57999a aVar) {
                    C400751 r0 = new WSConnState.AbstractC29537a() {
                        /* class com.ss.android.lark.integrator.voip.VoIpModuleProvider.VoIpModuleDependency.C400744.C400751 */

                        @Override // com.ss.android.lark.biz.core.api.WSConnState.AbstractC29537a
                        /* renamed from: a */
                        public void mo102563a(WSConnState.ConnState connState) {
                            boolean z;
                            AbstractC57987d.AbstractC57998i.AbstractC57999a aVar = aVar;
                            if (connState == null || connState != WSConnState.ConnState.Connected) {
                                z = false;
                            } else {
                                z = true;
                            }
                            aVar.mo196612a(z);
                        }
                    };
                    this.f101860b.put(aVar, r0);
                    VoIpModuleProvider.f101843e.addConnStateListener(r0);
                }

                @Override // com.ss.android.lark.voip.p2911a.AbstractC57987d.AbstractC57998i
                /* renamed from: b */
                public void mo145497b(IVoIpNetLevelListener bVar) {
                    if (VoIpModuleProvider.f101839a.containsKey(bVar)) {
                        VoIpModuleProvider.f101843e.unRegisterNetworkLevelListener(VoIpModuleProvider.f101839a.get(bVar));
                        VoIpModuleProvider.f101839a.remove(bVar);
                    }
                }

                @Override // com.ss.android.lark.voip.p2911a.AbstractC57987d.AbstractC57998i
                /* renamed from: a */
                public void mo145496a(IVoIpNetLevelListener bVar) {
                    $$Lambda$VoIpModuleProvider$VoIpModuleDependency$4$DGHcRdzqrYAtyfuBY00wt4ZUlFM r0 = new NetworkLevelListener() {
                        /* class com.ss.android.lark.integrator.voip.$$Lambda$VoIpModuleProvider$VoIpModuleDependency$4$DGHcRdzqrYAtyfuBY00wt4ZUlFM */

                        @Override // com.ss.android.lark.biz.core.api.NetworkLevelListener
                        public final void onNetworkLevelChanged(NetworkLevelListener.NetworkLevel networkLevel) {
                            VoIpModuleProvider.VoIpModuleDependency.C400744.m158887a(IVoIpNetLevelListener.this, networkLevel);
                        }
                    };
                    VoIpModuleProvider.f101839a.put(bVar, r0);
                    VoIpModuleProvider.f101843e.registerNetworkLevelListener(r0);
                }

                /* access modifiers changed from: private */
                /* renamed from: a */
                public static /* synthetic */ void m158887a(IVoIpNetLevelListener bVar, NetworkLevelListener.NetworkLevel networkLevel) {
                    if (networkLevel.getValue() >= NetworkLevelListener.NetworkLevel.EVALUATING.getValue()) {
                        bVar.mo196636b();
                    } else {
                        bVar.mo196635a();
                    }
                }
            };
        }

        @Override // com.ss.android.lark.voip.p2911a.AbstractC57987d
        public void initVideoChat() {
            VideoChatModuleProvider.m224877f().checkAndInit();
        }

        @Override // com.ss.android.lark.voip.p2911a.AbstractC57987d
        public boolean isGooglePlay() {
            return VoIpModuleProvider.f101844f.isUsPackage();
        }

        @Override // com.ss.android.lark.voip.p2911a.AbstractC57987d
        public boolean isOverseaTenantBrand() {
            return VoIpModuleProvider.f101844f.isOverseaTenantBrand();
        }

        @Override // com.ss.android.lark.voip.p2911a.AbstractC57987d
        public boolean isAppRealForeground() {
            return C29410a.m108289c().mo104288b();
        }

        @Override // com.ss.android.lark.voip.p2911a.AbstractC57987d
        public boolean isPreReleaseenv() {
            if (VoIpModuleProvider.f101844f.envType() == 3) {
                return true;
            }
            return false;
        }

        @Override // com.ss.android.lark.voip.p2911a.AbstractC57987d
        public boolean isProductionEnv() {
            if (VoIpModuleProvider.f101844f.envType() == 1) {
                return true;
            }
            return false;
        }

        @Override // com.ss.android.lark.voip.p2911a.AbstractC57987d
        public Map<String, Boolean> getVoIPFeatureMap() {
            HashMap hashMap = new HashMap();
            Set<String> a = C58143c.m225527a();
            if (a != null) {
                for (String str : a) {
                    hashMap.put(str, Boolean.valueOf(isFeatureGatingEnable(str)));
                }
            }
            return hashMap;
        }

        public void attachWatermark(FrameLayout frameLayout) {
            VoIpModuleProvider.f101843e.attachGlobalWatermark(frameLayout);
        }

        public boolean isFeatureGatingEnable(String str) {
            return C37239a.m146648b().mo136952a(str, C58143c.m225528a(str));
        }
    }

    /* renamed from: a */
    public static C57977a m158862a() {
        if (f101848j == null) {
            synchronized (VoIpModuleProvider.class) {
                if (f101848j == null) {
                    f101848j = new C57977a();
                    IUiModeService uiModeService = f101843e.getUiModeService();
                    if (uiModeService.mo105602a()) {
                        uiModeService.mo105601a(new IUiModeService.UiModeChangeListener() {
                            /* class com.ss.android.lark.integrator.voip.VoIpModuleProvider.C400691 */

                            @Override // com.ss.android.lark.biz.core.api.IUiModeService.UiModeChangeListener
                            public void onNightModeChange(int i) {
                                synchronized (VoIpModuleProvider.f101841c) {
                                    for (AbstractC57981a.AbstractC57982a aVar : VoIpModuleProvider.f101840b) {
                                        aVar.mo196617a(i);
                                    }
                                }
                            }
                        });
                    }
                }
            }
        }
        return f101848j;
    }
}
