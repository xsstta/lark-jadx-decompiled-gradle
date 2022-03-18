package com.ss.android.lark.integrator.core;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.ss.android.lark.abtest.api.IABTestService;
import com.ss.android.lark.applink.AbstractC29186b;
import com.ss.android.lark.biz.core.api.IQRCodeScanResultHandler;
import com.ss.android.lark.biz.core.api.aj;
import com.ss.android.lark.calendar_api.ICalendarApi;
import com.ss.android.lark.ccm_api.ICCMApi;
import com.ss.android.lark.core.dependency.AbstractC36126l;
import com.ss.android.lark.core.p1772j.C36149a;
import com.ss.android.lark.desktopmode.utils.DesktopUtil;
import com.ss.android.lark.diskmanage.clean.DiskCleanTaskManager;
import com.ss.android.lark.diskmanage.clean.IDiskCleanTask;
import com.ss.android.lark.dynamicconfig.C36882a;
import com.ss.android.lark.larkconfig.export.handler.AbstractBaseSettingHandler;
import com.ss.android.lark.mail_api.IMailApi;
import com.ss.android.lark.main.p2231a.AbstractC44136a;
import com.ss.android.lark.maincore.AbstractC44548e;
import com.ss.android.lark.maincore.AbstractC44552i;
import com.ss.android.lark.maincore.ITitleController;
import com.ss.android.lark.meego_api.IMeegoApi;
import com.ss.android.lark.notification.export.AbstractNotification;
import com.ss.android.lark.openplatform_api.IOpenPlatformApi;
import com.ss.android.lark.passport_api.IPassportApi;
import com.ss.android.lark.platform.diskmanage.DiskManageSettingHandler;
import com.ss.android.lark.platform.diskmanage.DiskMonitorSettingHandler;
import com.ss.android.lark.setting.export.AbstractC54125a;
import com.ss.android.lark.utils.ApiUtils;
import com.ss.android.lark.utils.LarkContext;
import com.ss.android.lark.vc.api.IVCApi;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: com.ss.android.lark.integrator.core.m */
class C39373m implements AbstractC36126l {
    @Override // com.ss.android.lark.core.dependency.AbstractC36126l
    /* renamed from: b */
    public boolean mo133002b() {
        return false;
    }

    C39373m() {
    }

    @Override // com.ss.android.lark.core.dependency.AbstractC36126l
    /* renamed from: a */
    public void mo132996a(Map<String, Boolean> map) {
        map.putAll(((ICalendarApi) ApiUtils.getApi(ICalendarApi.class)).getLeanModeGatingMap());
        map.putAll(((IOpenPlatformApi) ApiUtils.getApi(IOpenPlatformApi.class)).getFeatureConfigMap());
    }

    @Override // com.ss.android.lark.core.dependency.AbstractC36126l
    /* renamed from: a */
    public void mo132994a(DiskCleanTaskManager aVar) {
        IDiskCleanTask diskCleanTask = ((IOpenPlatformApi) ApiUtils.getApi(IOpenPlatformApi.class)).getDiskCleanTask();
        IDiskCleanTask videoChatCleanTask = ((IVCApi) ApiUtils.getApi(IVCApi.class)).getVideoChatCleanTask();
        IDiskCleanTask diskCleanTask2 = ((IMailApi) ApiUtils.getApi(IMailApi.class)).getDiskCleanTask();
        IDiskCleanTask cCMDiskCleanTask = ((ICCMApi) ApiUtils.getApi(ICCMApi.class)).getCCMDiskCleanTask();
        if (videoChatCleanTask != null) {
            aVar.mo135590a(videoChatCleanTask);
        }
        if (cCMDiskCleanTask != null) {
            aVar.mo135590a(cCMDiskCleanTask);
        }
        if (diskCleanTask2 != null) {
            aVar.mo135590a(diskCleanTask2);
        }
        if (diskCleanTask != null) {
            aVar.mo135590a(diskCleanTask);
        }
    }

    @Override // com.ss.android.lark.core.dependency.AbstractC36126l
    /* renamed from: a */
    public void mo132998a(Set<String> set) {
        set.addAll(((IVCApi) ApiUtils.getApi(IVCApi.class)).getSyncKeys());
        set.addAll(((IOpenPlatformApi) ApiUtils.getApi(IOpenPlatformApi.class)).getSyncKeys());
        set.addAll(((ICalendarApi) ApiUtils.getApi(ICalendarApi.class)).getSyncKeys());
    }

    @Override // com.ss.android.lark.core.dependency.AbstractC36126l
    /* renamed from: a */
    public void mo132995a(List<IQRCodeScanResultHandler> list) {
        IQRCodeScanResultHandler c = m155416c();
        if (c != null) {
            list.add(c);
        }
        IQRCodeScanResultHandler d = m155418d();
        if (d != null) {
            list.add(d);
        }
    }

    @Override // com.ss.android.lark.core.dependency.AbstractC36126l
    /* renamed from: a */
    public void mo132997a(Map<String, AbstractC44136a.C44142ac> map, Map<String, AbstractC44136a.C44142ac.AbstractC44143a> map2) {
        final IOpenPlatformApi iOpenPlatformApi = (IOpenPlatformApi) ApiUtils.getApi(IOpenPlatformApi.class);
        final IVCApi iVCApi = (IVCApi) ApiUtils.getApi(IVCApi.class);
        final IMailApi iMailApi = (IMailApi) ApiUtils.getApi(IMailApi.class);
        if (!map.containsKey(((ICalendarApi) ApiUtils.getApi(ICalendarApi.class)).getCalendarPageName())) {
            map.put(((ICalendarApi) ApiUtils.getApi(ICalendarApi.class)).getCalendarPageName(), new AbstractC44136a.C44142ac(((ICalendarApi) ApiUtils.getApi(ICalendarApi.class)).getCalendarPageName(), 1, false, null, $$Lambda$m$uhBm0t1Kd6FKoNl4qOKpk3L8so.INSTANCE, new AbstractC44136a.C44142ac.AbstractC44144b() {
                /* class com.ss.android.lark.integrator.core.C39373m.C393741 */

                @Override // com.ss.android.lark.main.p2231a.AbstractC44136a.C44142ac.AbstractC44144b
                /* renamed from: a */
                public void mo133368a(Context context) {
                    ((ICalendarApi) ApiUtils.getApi(ICalendarApi.class)).preloadCalendarTabPageData(context);
                }

                @Override // com.ss.android.lark.main.p2231a.AbstractC44136a.C44142ac.AbstractC44144b
                /* renamed from: b */
                public void mo133369b(Context context) {
                    if (context instanceof Activity) {
                        ((ICalendarApi) ApiUtils.getApi(ICalendarApi.class)).preloadCalendarTabPageView((Activity) context);
                    }
                }
            }));
        }
        if (!map.containsKey(iOpenPlatformApi.getAppCenterPageName())) {
            map.put(iOpenPlatformApi.getAppCenterPageName(), new AbstractC44136a.C44142ac(iOpenPlatformApi.getAppCenterPageName(), 2, false, map2.get(iOpenPlatformApi.getAppCenterPageName()), new AbstractC44136a.C44142ac.AbstractC44145c() {
                /* class com.ss.android.lark.integrator.core.$$Lambda$m$2xF0DFdhxKAmxGMKarMKIIhz_o */

                @Override // com.ss.android.lark.main.p2231a.AbstractC44136a.C44142ac.AbstractC44145c
                public final AbstractC44552i createTabPageSpec(Context context, AbstractC44548e eVar, ITitleController iTitleController) {
                    return IOpenPlatformApi.this.createAppCenterPageSpec(context, eVar, iTitleController);
                }
            }, new AbstractC44136a.C44142ac.AbstractC44144b() {
                /* class com.ss.android.lark.integrator.core.C39373m.C393752 */

                @Override // com.ss.android.lark.main.p2231a.AbstractC44136a.C44142ac.AbstractC44144b
                /* renamed from: b */
                public void mo133369b(Context context) {
                }

                @Override // com.ss.android.lark.main.p2231a.AbstractC44136a.C44142ac.AbstractC44144b
                /* renamed from: a */
                public void mo133368a(Context context) {
                    iOpenPlatformApi.preloadAppCenterData();
                }
            }));
        }
        if (!map.containsKey(((ICCMApi) ApiUtils.getApi(ICCMApi.class)).getDocPageName())) {
            map.put(((ICCMApi) ApiUtils.getApi(ICCMApi.class)).getDocPageName(), new AbstractC44136a.C44142ac(((ICCMApi) ApiUtils.getApi(ICCMApi.class)).getDocPageName(), 3, false, null, $$Lambda$m$YiJUzU9ZqqTAChc4xqK0YTspelA.INSTANCE, new AbstractC44136a.C44142ac.AbstractC44144b() {
                /* class com.ss.android.lark.integrator.core.C39373m.C393763 */

                @Override // com.ss.android.lark.main.p2231a.AbstractC44136a.C44142ac.AbstractC44144b
                /* renamed from: a */
                public void mo133368a(Context context) {
                    C36149a.m142162a().mo157113f("space");
                }

                @Override // com.ss.android.lark.main.p2231a.AbstractC44136a.C44142ac.AbstractC44144b
                /* renamed from: b */
                public void mo133369b(Context context) {
                    ((ICCMApi) ApiUtils.getApi(ICCMApi.class)).preloadDocSdk(context, 0);
                    ((ICCMApi) ApiUtils.getApi(ICCMApi.class)).preloadSpacePageUI(context);
                }
            }));
        }
        if (!map.containsKey(iMailApi.getPackageName())) {
            map.put(iMailApi.getPackageName(), new AbstractC44136a.C44142ac(iMailApi.getPackageName(), 6, false, map2.get(iMailApi.getPackageName()), new AbstractC44136a.C44142ac.AbstractC44145c() {
                /* class com.ss.android.lark.integrator.core.$$Lambda$m$XSufVQcToA0ECLN0PhMvLBNDycI */

                @Override // com.ss.android.lark.main.p2231a.AbstractC44136a.C44142ac.AbstractC44145c
                public final AbstractC44552i createTabPageSpec(Context context, AbstractC44548e eVar, ITitleController iTitleController) {
                    return IMailApi.this.createTabPageSpec(context, eVar, iTitleController);
                }
            }, new AbstractC44136a.C44142ac.AbstractC44144b() {
                /* class com.ss.android.lark.integrator.core.C39373m.C393774 */

                @Override // com.ss.android.lark.main.p2231a.AbstractC44136a.C44142ac.AbstractC44144b
                /* renamed from: a */
                public void mo133368a(Context context) {
                    iMailApi.preloadMainPageData(context);
                }

                @Override // com.ss.android.lark.main.p2231a.AbstractC44136a.C44142ac.AbstractC44144b
                /* renamed from: b */
                public void mo133369b(Context context) {
                    iMailApi.preloadMainPageUIView(context);
                }
            }));
        }
        if (!map.containsKey(((ICCMApi) ApiUtils.getApi(ICCMApi.class)).geWikiPageName())) {
            map.put(((ICCMApi) ApiUtils.getApi(ICCMApi.class)).geWikiPageName(), new AbstractC44136a.C44142ac(((ICCMApi) ApiUtils.getApi(ICCMApi.class)).geWikiPageName(), 7, false, map2.get(((ICCMApi) ApiUtils.getApi(ICCMApi.class)).geWikiPageName()), $$Lambda$m$adkLZLzM8fO2UNt0dKwzRROcdY.INSTANCE, new AbstractC44136a.C44142ac.AbstractC44144b() {
                /* class com.ss.android.lark.integrator.core.C39373m.C393785 */

                @Override // com.ss.android.lark.main.p2231a.AbstractC44136a.C44142ac.AbstractC44144b
                /* renamed from: a */
                public void mo133368a(Context context) {
                    ((ICCMApi) ApiUtils.getApi(ICCMApi.class)).preloadWikiTabPageData(context);
                }

                @Override // com.ss.android.lark.main.p2231a.AbstractC44136a.C44142ac.AbstractC44144b
                /* renamed from: b */
                public void mo133369b(Context context) {
                    ((ICCMApi) ApiUtils.getApi(ICCMApi.class)).preloadDocSdk(context, 0);
                    ((ICCMApi) ApiUtils.getApi(ICCMApi.class)).preloadWikiTabPageData(context);
                }
            }));
        }
        if (!map.containsKey(iVCApi.getPackageName())) {
            map.put(iVCApi.getPackageName(), new AbstractC44136a.C44142ac(iVCApi.getPackageName(), 11, false, map2.get(iVCApi.getPackageName()), new AbstractC44136a.C44142ac.AbstractC44145c() {
                /* class com.ss.android.lark.integrator.core.C39373m.C393796 */

                @Override // com.ss.android.lark.main.p2231a.AbstractC44136a.C44142ac.AbstractC44145c
                public AbstractC44552i createTabPageSpec(Context context, AbstractC44548e eVar, ITitleController iTitleController) {
                    return iVCApi.getTabPageSpec(context, eVar, iTitleController);
                }
            }));
        }
        if (!map.containsKey(((ICalendarApi) ApiUtils.getApi(ICalendarApi.class)).getTodoPageName())) {
            map.put(((ICalendarApi) ApiUtils.getApi(ICalendarApi.class)).getTodoPageName(), new AbstractC44136a.C44142ac(((ICalendarApi) ApiUtils.getApi(ICalendarApi.class)).getTodoPageName(), 13, false, map2.get(((ICalendarApi) ApiUtils.getApi(ICalendarApi.class)).getTodoPageName()), $$Lambda$m$IBOnHZDpjevlqkunSkFJWo7vmBc.INSTANCE));
        }
        if (!map.containsKey(iVCApi.getMinutesPackageName())) {
            map.put(iVCApi.getMinutesPackageName(), new AbstractC44136a.C44142ac(iVCApi.getMinutesPackageName(), 15, false, map2.get(iVCApi.getMinutesPackageName()), new AbstractC44136a.C44142ac.AbstractC44145c() {
                /* class com.ss.android.lark.integrator.core.C39373m.C393807 */

                @Override // com.ss.android.lark.main.p2231a.AbstractC44136a.C44142ac.AbstractC44145c
                public AbstractC44552i createTabPageSpec(Context context, AbstractC44548e eVar, ITitleController iTitleController) {
                    return iVCApi.getMinutesTabPageSpec(context, eVar, iTitleController);
                }
            }));
        }
    }

    /* renamed from: e */
    private static IQRCodeScanResultHandler m155420e() {
        return new IQRCodeScanResultHandler() {
            /* class com.ss.android.lark.integrator.core.C39373m.C393818 */

            /* renamed from: b */
            private String m155450b(String str) {
                return Uri.parse(str).getQueryParameter("resource_token");
            }

            /* renamed from: a */
            private boolean m155449a(String str) {
                if (!str.startsWith("https://")) {
                    return false;
                }
                if (!str.contains("feishu.cn/calendarpro/meetingroom") && !str.contains("larksuite.com/calendarpro/meetingroom")) {
                    if (str.contains(C36882a.m145561e() + "/calendarpro/meetingroom")) {
                        return true;
                    }
                    return false;
                }
                return true;
            }

            @Override // com.ss.android.lark.biz.core.api.IQRCodeScanResultHandler
            /* renamed from: a */
            public boolean mo105369a(String str, aj ajVar, int i) {
                if (!m155449a(str)) {
                    return false;
                }
                String b = m155450b(str);
                if (TextUtils.isEmpty(b)) {
                    b = "token is empty";
                }
                ((ICalendarApi) ApiUtils.getApi(ICalendarApi.class)).startPreemptMeetingRoomActivity(ajVar.mo105591a(), b);
                return true;
            }
        };
    }

    /* renamed from: f */
    private static IQRCodeScanResultHandler m155421f() {
        return new IQRCodeScanResultHandler() {
            /* class com.ss.android.lark.integrator.core.C39373m.C393829 */

            /* renamed from: b */
            private String m155453b(String str) {
                return Uri.parse(str).getQueryParameter("resource_token");
            }

            /* renamed from: a */
            private boolean m155452a(String str) {
                if (!str.startsWith("https://")) {
                    return false;
                }
                return str.contains("/calendar/pages/resource_qrcode");
            }

            @Override // com.ss.android.lark.biz.core.api.IQRCodeScanResultHandler
            /* renamed from: a */
            public boolean mo105369a(String str, aj ajVar, int i) {
                if (!m155452a(str)) {
                    return false;
                }
                String b = m155453b(str);
                if (TextUtils.isEmpty(b)) {
                    return false;
                }
                ((ICalendarApi) ApiUtils.getApi(ICalendarApi.class)).startMeetingRoomSignInActivity(ajVar.mo105591a(), b, str);
                return true;
            }
        };
    }

    /* renamed from: c */
    private static IQRCodeScanResultHandler m155416c() {
        return ((IOpenPlatformApi) ApiUtils.getApi(IOpenPlatformApi.class)).getLittleAppQRCodeScanResultHandler();
    }

    /* renamed from: d */
    private static IQRCodeScanResultHandler m155418d() {
        return ((IVCApi) ApiUtils.getApi(IVCApi.class)).getQRCodeScanResultHandler();
    }

    /* access modifiers changed from: private */
    /* renamed from: g */
    public static /* synthetic */ boolean m155422g() {
        return !DesktopUtil.m144301a(LarkContext.getApplication());
    }

    /* access modifiers changed from: private */
    /* renamed from: h */
    public static /* synthetic */ boolean m155423h() {
        return !DesktopUtil.m144301a(LarkContext.getApplication());
    }

    /* access modifiers changed from: private */
    /* renamed from: i */
    public static /* synthetic */ boolean m155424i() {
        if (!((ICCMApi) ApiUtils.getApi(ICCMApi.class)).isEnableWikiTab() || DesktopUtil.m144307b()) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.lark.core.dependency.AbstractC36126l
    /* renamed from: a */
    public List<AbstractBaseSettingHandler> mo132990a() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(DiskManageSettingHandler.m200854d());
        arrayList.add(DiskMonitorSettingHandler.m200859d());
        return arrayList;
    }

    @Override // com.ss.android.lark.core.dependency.AbstractC36126l
    /* renamed from: b */
    public void mo132999b(DiskCleanTaskManager aVar) {
        IDiskCleanTask cCMDiskCleanTask = ((ICCMApi) ApiUtils.getApi(ICCMApi.class)).getCCMDiskCleanTask();
        if (cCMDiskCleanTask != null) {
            aVar.mo135590a(cCMDiskCleanTask);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ boolean m155413a(IPassportApi iPassportApi) {
        return !iPassportApi.isCustomer();
    }

    @Override // com.ss.android.lark.core.dependency.AbstractC36126l
    /* renamed from: b */
    public void mo133000b(List<IQRCodeScanResultHandler> list) {
        list.add(m155420e());
        list.add(m155421f());
    }

    @Override // com.ss.android.lark.core.dependency.AbstractC36126l
    /* renamed from: c */
    public void mo133003c(List<AbstractNotification> list) {
        list.addAll(((IVCApi) ApiUtils.getApi(IVCApi.class)).provideNotificationImpls());
        list.addAll(((ICCMApi) ApiUtils.getApi(ICCMApi.class)).provideNotificationImpls());
        list.addAll(((IMailApi) ApiUtils.getApi(IMailApi.class)).provideNotificationImpls());
        list.addAll(((IOpenPlatformApi) ApiUtils.getApi(IOpenPlatformApi.class)).provideNotificationImpls());
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ boolean m155414a(IVCApi iVCApi) {
        if (DesktopUtil.m144301a(LarkContext.getApplication()) || !iVCApi.isMmTabEnable()) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.lark.core.dependency.AbstractC36126l
    /* renamed from: b */
    public void mo133001b(Map<String, AbstractC44136a.C44142ac.AbstractC44143a> map) {
        IMailApi iMailApi = (IMailApi) ApiUtils.getApi(IMailApi.class);
        map.put("appCenter", new AbstractC44136a.C44142ac.AbstractC44143a() {
            /* class com.ss.android.lark.integrator.core.$$Lambda$m$O7QuCcCmIHoo0uT0_miQCJj9FXg */

            @Override // com.ss.android.lark.main.p2231a.AbstractC44136a.C44142ac.AbstractC44143a
            public final boolean isEnable() {
                return C39373m.m155413a(IPassportApi.this);
            }
        });
        iMailApi.getClass();
        map.put("mail", new AbstractC44136a.C44142ac.AbstractC44143a() {
            /* class com.ss.android.lark.integrator.core.$$Lambda$gWLG2zbLRcn4aXROyH1ABzpIues */

            @Override // com.ss.android.lark.main.p2231a.AbstractC44136a.C44142ac.AbstractC44143a
            public final boolean isEnable() {
                return IMailApi.this.isMailTabEnable();
            }
        });
        map.put("wiki", $$Lambda$m$HkiNHSdOLvld0ra3M_0sLfQMKo4.INSTANCE);
        map.put("todo", $$Lambda$m$XXGiFR8pX0QDgaYUTyu8tchESo.INSTANCE);
        map.put("moments", $$Lambda$m$Z0YudmPC9YNVdVKA8qsIVT6B38o.INSTANCE);
        map.put("videomm", new AbstractC44136a.C44142ac.AbstractC44143a() {
            /* class com.ss.android.lark.integrator.core.$$Lambda$m$Iqjjh7QsWqjxB6sLnjfEMM2d4s */

            @Override // com.ss.android.lark.main.p2231a.AbstractC44136a.C44142ac.AbstractC44143a
            public final boolean isEnable() {
                return C39373m.m155414a(IVCApi.this);
            }
        });
    }

    @Override // com.ss.android.lark.core.dependency.AbstractC36126l
    /* renamed from: a */
    public void mo132993a(IABTestService iABTestService) {
        iABTestService.registerExperiments("小程序", ((IOpenPlatformApi) ApiUtils.getApi(IOpenPlatformApi.class)).getAbTestExperiments());
        iABTestService.registerExperiments("Docs", ((ICCMApi) ApiUtils.getApi(ICCMApi.class)).getAbTestExperiments());
        iABTestService.registerExperiments("VideoChat", ((IVCApi) ApiUtils.getApi(IVCApi.class)).getAbTestExperiments());
    }

    @Override // com.ss.android.lark.core.dependency.AbstractC36126l
    /* renamed from: a */
    public void mo132991a(Activity activity, List<AbstractC54125a> list) {
        list.addAll(((IPassportApi) ApiUtils.getApi(IPassportApi.class)).provideAccountSettingComponents(activity));
        list.add(((IVCApi) ApiUtils.getApi(IVCApi.class)).getChatSettingComponent(activity));
        list.add(((ICalendarApi) ApiUtils.getApi(ICalendarApi.class)).getCalendarSettingCompnent(activity));
        list.add(((IMailApi) ApiUtils.getApi(IMailApi.class)).getSettingComponent(activity));
        list.add(((ICalendarApi) ApiUtils.getApi(ICalendarApi.class)).getTodoSettingComponent(activity));
        list.add(((ICalendarApi) ApiUtils.getApi(ICalendarApi.class)).getMomentsSettingComponent(activity));
    }

    @Override // com.ss.android.lark.core.dependency.AbstractC36126l
    /* renamed from: a */
    public void mo132992a(Context context, Map<String, AbstractC29186b> map) {
        map.putAll(((IOpenPlatformApi) ApiUtils.getApi(IOpenPlatformApi.class)).getAppLinkHandlers(context));
        map.putAll(((IMailApi) ApiUtils.getApi(IMailApi.class)).getAppLinkHandlers(context));
        map.putAll(((IVCApi) ApiUtils.getApi(IVCApi.class)).getAppLinkHandlers(context));
        map.putAll(((ICalendarApi) ApiUtils.getApi(ICalendarApi.class)).getCalAppLinkHandlers(context));
        map.putAll(((ICCMApi) ApiUtils.getApi(ICCMApi.class)).getSpaceKitAppLinkHandlers(context));
        map.putAll(((IPassportApi) ApiUtils.getApi(IPassportApi.class)).getLoginAppLinkHandlers(context));
        map.putAll(((ICalendarApi) ApiUtils.getApi(ICalendarApi.class)).getTodoAppLinkHandlers(context));
        map.putAll(((ICalendarApi) ApiUtils.getApi(ICalendarApi.class)).getMomentsAppLinkHandlers(context));
        map.putAll(((IMeegoApi) ApiUtils.getApi(IMeegoApi.class)).getAppLinkHandlers(context));
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ AbstractC44552i m155410a(Context context, AbstractC44548e eVar, ITitleController iTitleController) {
        return ((ICalendarApi) ApiUtils.getApi(ICalendarApi.class)).createTodoTabPageSpec(context, iTitleController);
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static /* synthetic */ AbstractC44552i m155415b(Context context, AbstractC44548e eVar, ITitleController iTitleController) {
        return ((ICCMApi) ApiUtils.getApi(ICCMApi.class)).getWikiTabPageSpec(context, eVar, iTitleController);
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public static /* synthetic */ AbstractC44552i m155417c(Context context, AbstractC44548e eVar, ITitleController iTitleController) {
        return ((ICCMApi) ApiUtils.getApi(ICCMApi.class)).createDocTabPageSpec(context, eVar, iTitleController);
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public static /* synthetic */ AbstractC44552i m155419d(Context context, AbstractC44548e eVar, ITitleController iTitleController) {
        return ((ICalendarApi) ApiUtils.getApi(ICalendarApi.class)).createCalendarTabPageSpec(context, iTitleController);
    }
}
