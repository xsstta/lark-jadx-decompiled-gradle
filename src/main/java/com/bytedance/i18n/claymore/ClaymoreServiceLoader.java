package com.bytedance.i18n.claymore;

import com.bytedance.lark.lynxlib.bullet.BulletDependency;
import com.larksuite.component.blockit.AbstractC24049b;
import com.larksuite.component.blockit.service.BlockitApiServiceImpl;
import com.larksuite.component.blockit.service.IBlockitApiService;
import com.larksuite.component.dybrid.h5api.AbstractC24152a;
import com.larksuite.component.dybrid.h5core.core.impl.H5ServiceImpl;
import com.ss.android.lark.abtest.api.IABTestService;
import com.ss.android.lark.abtest.api.listener.AbTestModuleDependency;
import com.ss.android.lark.abtest.impl.AbTestModule;
import com.ss.android.lark.account_provider.serviceimpl.CommonServiceImpl;
import com.ss.android.lark.appcenter.wrapper.dependency.IAppCenterModuleDependency;
import com.ss.android.lark.appsetting.api.IAppSettingDependency;
import com.ss.android.lark.appstrategy.p1374a.AbstractC29232a;
import com.ss.android.lark.biz.core.api.ICoreApi;
import com.ss.android.lark.biz.im.api.IIMApi;
import com.ss.android.lark.biz.im.extension.ImExtension;
import com.ss.android.lark.browser.dependency.IBrowserModuleDependency;
import com.ss.android.lark.browser.handler.C29908a;
import com.ss.android.lark.browser.handler.C29912b;
import com.ss.android.lark.browser.handler.C29916c;
import com.ss.android.lark.calendar.p1430a.AbstractC30060b;
import com.ss.android.lark.calendar_api.ICalendarApi;
import com.ss.android.lark.ccm_api.ICCMApi;
import com.ss.android.lark.core.dependency.AbstractC36116a;
import com.ss.android.lark.core.dependency.AbstractC36119d;
import com.ss.android.lark.core.im.CoreImExtension;
import com.ss.android.lark.core.impl.CoreApiImpl;
import com.ss.android.lark.create.groupchat.CreateGroupChatModule;
import com.ss.android.lark.create.groupchat.ICreateGroupChatModule;
import com.ss.android.lark.create.groupchat.p1777a.AbstractC36248c;
import com.ss.android.lark.dynamicconfig.p1819a.AbstractC36883a;
import com.ss.android.lark.emm.EMMModule;
import com.ss.android.lark.emm.p1827a.AbstractC37004b;
import com.ss.android.lark.emm.p1827a.AbstractC37005c;
import com.ss.android.lark.fcm.FCMModule;
import com.ss.android.lark.fcm_export.IFCMModule;
import com.ss.android.lark.featuregating.p1845b.C37246a;
import com.ss.android.lark.filedetail.FileDetailModuleDependency;
import com.ss.android.lark.filedetail.p1885a.AbstractC38197a;
import com.ss.android.lark.helpdesk_api.IHelpdeskApi;
import com.ss.android.lark.integrator.EMMModuleProvider;
import com.ss.android.lark.integrator.VPNSDKModuleProvider;
import com.ss.android.lark.integrator.appcenter.AppCenterModuleProvider;
import com.ss.android.lark.integrator.appstrategy.AppStrategyModuleProvider;
import com.ss.android.lark.integrator.blockit.BlockitDependencyImpl;
import com.ss.android.lark.integrator.calendar.CalendarApiImpl;
import com.ss.android.lark.integrator.calendar.CalendarDependency;
import com.ss.android.lark.integrator.calendar.im.CalendarImExtension;
import com.ss.android.lark.integrator.ccm.CCMApiImpl;
import com.ss.android.lark.integrator.core.AppContextDependencyImpl;
import com.ss.android.lark.integrator.core.AppSettingDependencyImpl;
import com.ss.android.lark.integrator.core.BasicContextDependencyImpl;
import com.ss.android.lark.integrator.core.CoreModuleProvider;
import com.ss.android.lark.integrator.core.ScreenshotDependencyImpl;
import com.ss.android.lark.integrator.helpdesk.HelpdeskApiImpl;
import com.ss.android.lark.integrator.im.IMModuleProvider;
import com.ss.android.lark.integrator.im.VideoChatImExtension;
import com.ss.android.lark.integrator.im.dependency.AbstractC39570l;
import com.ss.android.lark.integrator.im.dependency.AbstractC39573p;
import com.ss.android.lark.integrator.im.groupchat.CreateGroupChatModuleProvider;
import com.ss.android.lark.integrator.im.groupmember.GroupMemberManageModuleDependency;
import com.ss.android.lark.integrator.im.impl.IMApiImpl;
import com.ss.android.lark.integrator.im.money.BulletModuleProvider;
import com.ss.android.lark.integrator.im.money.MoneyModuleProvider;
import com.ss.android.lark.integrator.littleapp.LittleAppModuleProvider;
import com.ss.android.lark.integrator.mail.MailApiImpl;
import com.ss.android.lark.integrator.mail.MailModuleProvider;
import com.ss.android.lark.integrator.meego.MeegoApiImpl;
import com.ss.android.lark.integrator.meego.MeegoModuleProvider;
import com.ss.android.lark.integrator.meego.im.MeegoImExtension;
import com.ss.android.lark.integrator.minutes.MinutesDependencyInjector;
import com.ss.android.lark.integrator.moments.MomentsDependency;
import com.ss.android.lark.integrator.openplatform.OpenPlatformApiImpl;
import com.ss.android.lark.integrator.openplatform.OpenPlatformModuleProvider;
import com.ss.android.lark.integrator.openplatform.im.OpenPlatformImExtension;
import com.ss.android.lark.integrator.p2000c.C39132c;
import com.ss.android.lark.integrator.passport.PassportApiImpl;
import com.ss.android.lark.integrator.passport.lazy.init.DeviceRustCmdServiceImpl;
import com.ss.android.lark.integrator.passport.serviceimpl.DomainServiceImpl;
import com.ss.android.lark.integrator.passport.serviceimpl.GetTenantsByIdsServiceImpl;
import com.ss.android.lark.integrator.passport.serviceimpl.InitializeTaskManagerServiceImpl;
import com.ss.android.lark.integrator.passport.serviceimpl.PassportIntegrateServiceImpl;
import com.ss.android.lark.integrator.todo.TodoDependency;
import com.ss.android.lark.integrator.todo.im.TodoImExtension;
import com.ss.android.lark.integrator.voip.VoIpModuleProvider;
import com.ss.android.lark.inv.export.api.InvitationApi;
import com.ss.android.lark.inv.export.api.InvitationServiceApi;
import com.ss.android.lark.inv.export.dependency.IInvitationModuleDependency;
import com.ss.android.lark.invitation.v2.InvitationModule;
import com.ss.android.lark.invitation.v2.InvitationServiceApiImpl;
import com.ss.android.lark.larkconfig.export.plugin.IAppSettingPlugin;
import com.ss.android.lark.larkconfig.larksetting.p2106a.AbstractC41162a;
import com.ss.android.lark.littleapp.p2124b.AbstractC41301a;
import com.ss.android.lark.littleapp.prelaunch.AbstractC41413a;
import com.ss.android.lark.littleapp.prelaunch.PreLaunchServiceImpl;
import com.ss.android.lark.location.p2145a.AbstractC41551a;
import com.ss.android.lark.location.p2145a.AbstractC41553b;
import com.ss.android.lark.location.p2146b.AbstractC41567g;
import com.ss.android.lark.mail.p2157a.AbstractC41740a;
import com.ss.android.lark.mail_api.IMailApi;
import com.ss.android.lark.map.MapModule;
import com.ss.android.lark.meego.export.IMeegoPluginDependency;
import com.ss.android.lark.meego.wrapper.dependency.IMeegoModuleDependency;
import com.ss.android.lark.meego.wrapper.impl.MeegoPluginDependencyImpl;
import com.ss.android.lark.meego_api.IMeegoApi;
import com.ss.android.lark.member_manage.dependency.IGroupMemberManageModuleDependency;
import com.ss.android.lark.mm.depend.IMmDepend;
import com.ss.android.lark.moments.dependency.IMomentsDependency;
import com.ss.android.lark.money.MoneyModule;
import com.ss.android.lark.money_export.IMoneyModule;
import com.ss.android.lark.money_export.IMoneyModuleDependency;
import com.ss.android.lark.openplatform.p2399a.AbstractC48793a;
import com.ss.android.lark.openplatform_api.IOpenPlatformApi;
import com.ss.android.lark.p1382b.AbstractC29414b;
import com.ss.android.lark.p1954i.p1955a.AbstractC38780a;
import com.ss.android.lark.passport.KaServiceImpl;
import com.ss.android.lark.passport.biz_variant.BDTuringServiceImpl;
import com.ss.android.lark.passport.biz_variant.OneKeyLoginService;
import com.ss.android.lark.passport.device.service.AbstractC48976a;
import com.ss.android.lark.passport.device.service.impl.DevicesService;
import com.ss.android.lark.passport.device.service.impl.deviceid.DeviceIdService;
import com.ss.android.lark.passport.env.service.EnvServiceImpl;
import com.ss.android.lark.passport.infra.service.AbstractC49124b;
import com.ss.android.lark.passport.infra.service.AbstractC49125i;
import com.ss.android.lark.passport.infra.service.AbstractC49126j;
import com.ss.android.lark.passport.infra.service.AbstractC49127k;
import com.ss.android.lark.passport.infra.service.AbstractC49128n;
import com.ss.android.lark.passport.infra.service.AbstractC49129o;
import com.ss.android.lark.passport.infra.service.ICommonService;
import com.ss.android.lark.passport.infra.service.IDomainService;
import com.ss.android.lark.passport.infra.service.IInitializeTaskManagerService;
import com.ss.android.lark.passport.infra.service.IKaService;
import com.ss.android.lark.passport.infra.service.ILegacyUserListStorageService;
import com.ss.android.lark.passport.infra.service.IListenerManagerService;
import com.ss.android.lark.passport.infra.service.ILoginInitService;
import com.ss.android.lark.passport.infra.service.ILogoutUserService;
import com.ss.android.lark.passport.infra.service.IRouterActionFindService;
import com.ss.android.lark.passport.infra.service.ISessionInvalidService;
import com.ss.android.lark.passport.infra.service.IUserListService;
import com.ss.android.lark.passport.infra.service.IUserListStorageService;
import com.ss.android.lark.passport.infra.serviceimpl.ListenerManagerServiceImpl;
import com.ss.android.lark.passport.infra.serviceimpl.UserListService;
import com.ss.android.lark.passport.signinsdk_api.env.AbstractC49370a;
import com.ss.android.lark.passport.signinsdk_api.interfaces.AbstractC49390d;
import com.ss.android.lark.passport.signinsdk_api.interfaces.AbstractC49393f;
import com.ss.android.lark.passport.signinsdk_api.interfaces.AbstractC49396j;
import com.ss.android.lark.passport.signinsdk_api.interfaces.IBDTuringService;
import com.ss.android.lark.passport.signinsdk_api.interfaces.IDeviceService;
import com.ss.android.lark.passport.signinsdk_api.interfaces.ILoginSourceService;
import com.ss.android.lark.passport.signinsdk_api.interfaces.IQRLoginService;
import com.ss.android.lark.passport.signinsdk_api.interfaces.ISSOSDKAuthService;
import com.ss.android.lark.passport_api.IPassportApi;
import com.ss.android.lark.platform.abtest.abtest.ABTestModuleDependenceImpl;
import com.ss.android.lark.platform.browser.BrowserModuleProvider;
import com.ss.android.lark.platform.dynamicconfig.DynamicConfigModuleDependencyImpl;
import com.ss.android.lark.platform.larksetting.LarkSettingModuleProvider;
import com.ss.android.lark.platform.location.LocationDependencyImpl;
import com.ss.android.lark.platform.map.MapModuleProvider;
import com.ss.android.lark.platform.p2494o.p2495a.C51888a;
import com.ss.android.lark.platform.p2505u.C52008a;
import com.ss.android.lark.screen.audit.impl.ScreenshotDetector;
import com.ss.android.lark.screen.p2581a.p2582a.AbstractC53224b;
import com.ss.android.lark.screen.p2581a.p2582a.AbstractC53225c;
import com.ss.android.lark.statistics.p2697k.C54957b;
import com.ss.android.lark.thirdshare.base.export.p2739a.AbstractC55699a;
import com.ss.android.lark.thirdshare.base.impl.ThirdShareBaseApiImpl;
import com.ss.android.lark.thirdshare.container.p2743a.AbstractC55729a;
import com.ss.android.lark.thirdshare.lark.ThirdShareModule;
import com.ss.android.lark.thirdshare.lark.p2746a.p2747a.AbstractC55759a;
import com.ss.android.lark.thirdshare.lark.p2746a.p2747a.AbstractC55760b;
import com.ss.android.lark.threadwindow.handler.C56097a;
import com.ss.android.lark.todo.dependency.ITodoDependency;
import com.ss.android.lark.ug.invitation.InvitationModuleDependencyImpl;
import com.ss.android.lark.ug.thirdshare.dependency.LarkShareContainerDepApiImpl;
import com.ss.android.lark.ug.thirdshare.dependency.ThirdShareDependencyImpl;
import com.ss.android.lark.vc.api.IVCApi;
import com.ss.android.lark.vcintegrator.VCApiImpl;
import com.ss.android.lark.vcintegrator.VCDependency;
import com.ss.android.lark.voip.p2911a.AbstractC57987d;
import com.ss.android.lark.vpn.p2919a.AbstractC58196a;
import com.ss.android.lark.vpn.p2919a.AbstractC58198b;
import com.ss.android.lark.vpn.sangfor.VPNSDKModule;
import com.ss.android.ttvecamera.p3038g.C60375c;
import com.ss.android.vc.dependency.IVideoChatDependency;
import com.ss.lark.android.passport.biz.account.UserListStorageService;
import com.ss.lark.android.passport.biz.compat.tenant.TenantManageServiceCompat;
import com.ss.lark.android.passport.biz.feature.session.SessionInvalidService;
import com.ss.lark.android.passport.biz.feature.sso.LoginSourceService;
import com.ss.lark.android.passport.biz.service.impl.CrossEnvServiceImpl;
import com.ss.lark.android.passport.biz.service.impl.LegacyUserListStorageService;
import com.ss.lark.android.passport.biz.service.impl.LoginInitService;
import com.ss.lark.android.passport.biz.service.impl.LogoutUserService;
import com.ss.lark.android.passport.biz.service.impl.MakeUserOfflineServiceImpl;
import com.ss.lark.android.passport.biz.service.impl.MakeUserOnlineServiceImpl;
import com.ss.lark.android.passport.biz.service.impl.QRLoginService;
import com.ss.lark.android.passport.biz.service.impl.RouterActionFindService;
import com.ss.lark.android.passport.biz.service.impl.SSOSDKAuthService;
import com.ss.lark.android.passport.biz.service.impl.SwitchUserService;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.Metadata;
import kotlin._Assertions;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.C69121n;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.C69294l;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010#\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010(\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\t\bÆ\u0002\u0018\u00002\u00020\u0001:\u000245B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J/\u0010\u0015\u001a\u0004\u0018\u0001H\u0016\"\b\b\u0000\u0010\u0016*\u00020\u00012\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u0002H\u00160\u00052\u0006\u0010\u0018\u001a\u00020\u0019H\u0002¢\u0006\u0002\u0010\u001aJ/\u0010\u001b\u001a\u0004\u0018\u0001H\u0016\"\b\b\u0000\u0010\u0016*\u00020\u00012\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u0002H\u00160\u00052\u0006\u0010\u0018\u001a\u00020\u0019H\u0002¢\u0006\u0002\u0010\u001aJ/\u0010\u001c\u001a\u0004\u0018\u0001H\u0016\"\b\b\u0000\u0010\u0016*\u00020\u00012\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u0002H\u00160\u00052\u0006\u0010\u0018\u001a\u00020\u0019H\u0007¢\u0006\u0002\u0010\u001aJ/\u0010\u001d\u001a\u0004\u0018\u0001H\u0016\"\b\b\u0000\u0010\u0016*\u00020\u00012\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u0002H\u00160\u00052\u0006\u0010\u0018\u001a\u00020\u0019H\u0002¢\u0006\u0002\u0010\u001aJ/\u0010\u001e\u001a\u0004\u0018\u0001H\u0016\"\b\b\u0000\u0010\u0016*\u00020\u00012\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u0002H\u00160\u00052\u0006\u0010\u0018\u001a\u00020\u0019H\u0002¢\u0006\u0002\u0010\u001aJK\u0010\u001e\u001a\u0004\u0018\u0001H\u0016\"\b\b\u0000\u0010\u0016*\u00020\u00012\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u0002H\u00160\u00052\u0006\u0010\u0018\u001a\u00020\u00192\u001a\u0010\u001f\u001a\u0016\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0005\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0004H\u0002¢\u0006\u0002\u0010 J)\u0010!\u001a\u00020\u0019\"\b\b\u0000\u0010\u0016*\u00020\u00012\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u0002H\u00160\u00052\u0006\u0010\u0018\u001a\u00020\u0019H\bJ)\u0010\"\u001a\u00020\u0019\"\b\b\u0000\u0010\u0016*\u00020\u00012\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u0002H\u00160\u00052\u0006\u0010\u0018\u001a\u00020\u0019H\bJ \u0010#\u001a\u00020\u0019\"\b\b\u0000\u0010\u0016*\u00020\u00012\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u0002H\u00160\u0005H\u0007J)\u0010$\u001a\u00020%\"\b\b\u0000\u0010\u0016*\u00020\u00012\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u0002H\u00160\u00052\u0006\u0010\u0018\u001a\u00020\u0019H\bJ)\u0010&\u001a\u00020%\"\b\b\u0000\u0010\u0016*\u00020\u00012\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u0002H\u00160\u00052\u0006\u0010\u0018\u001a\u00020\u0019H\bJ&\u0010'\u001a\b\u0012\u0004\u0012\u0002H\u00160(\"\b\b\u0000\u0010\u0016*\u00020\u00012\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u0002H\u00160\u0005H\u0007J%\u0010)\u001a\u0002H\u0016\"\b\b\u0000\u0010\u0016*\u00020\u00012\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u0002H\u00160\u0005H\u0007¢\u0006\u0002\u0010*J'\u0010+\u001a\u0004\u0018\u0001H\u0016\"\b\b\u0000\u0010\u0016*\u00020\u00012\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u0002H\u00160\u0005H\u0007¢\u0006\u0002\u0010*J.\u0010,\u001a\u00020-\"\b\b\u0000\u0010\u0016*\u00020\u00012\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u0002H\u00160\u00052\f\u0010.\u001a\b\u0012\u0004\u0012\u0002H\u00160\u000fH\u0007JR\u0010/\u001a\u00020-\"\b\b\u0000\u0010\u0016*\u00020\u00012\u001a\u0010\u001f\u001a\u0016\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0005\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u00042\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u0002H\u00160\u00052\u0006\u00100\u001a\u00020\u00192\u0006\u00101\u001a\u0002H\u0016H\b¢\u0006\u0002\u00102JE\u00103\u001a\u00020-\"\b\b\u0000\u0010\u0016*\u00020\u00012\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u0002H\u00160\u00052\u0006\u00100\u001a\u00020\u00192\u001a\u0010\u001f\u001a\u0016\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0005\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0004H\bR\"\u0010\u0003\u001a\u0016\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0005\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0004X\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR6\u0010\r\u001a*\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0005\u0012\u001c\u0012\u001a\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u000f0\u000ej\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u000f`\u00100\u0004X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012X\u0004¢\u0006\u0002\n\u0000R\"\u0010\u0014\u001a\u0016\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0005\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0004X\u0004¢\u0006\u0002\n\u0000¨\u00066"}, d2 = {"Lcom/bytedance/i18n/claymore/ClaymoreServiceLoader;", "", "()V", "loaderCache", "", "Ljava/lang/Class;", "", "loaderListener", "Lcom/bytedance/i18n/claymore/ClaymoreServiceLoader$LoaderListener;", "getLoaderListener", "()Lcom/bytedance/i18n/claymore/ClaymoreServiceLoader$LoaderListener;", "setLoaderListener", "(Lcom/bytedance/i18n/claymore/ClaymoreServiceLoader$LoaderListener;)V", "loaders", "Ljava/util/LinkedHashSet;", "Lcom/bytedance/i18n/claymore/ClaymoreServiceLoader$Loader;", "Lkotlin/collections/LinkedHashSet;", "singletonDescCache", "", "", "staticCache", "createInstanceAndCache", "T", C60375c.f150914a, "index", "", "(Ljava/lang/Class;I)Ljava/lang/Object;", "createInstanceFromLoader", "createInstanceFromStatic", "getCacheOrCreate", "getCacheOrNull", "cache", "(Ljava/lang/Class;ILjava/util/Map;)Ljava/lang/Object;", "getLoaderCacheIndex", "getStaticCacheIndex", "getStaticCount", "isLoaderIndex", "", "isStaticIndex", "loadAll", "", "loadFirst", "(Ljava/lang/Class;)Ljava/lang/Object;", "loadFirstOrNull", "registerLoader", "", "loader", "removeNullAndReplace", "cacheIndex", "instance", "(Ljava/util/Map;Ljava/lang/Class;ILjava/lang/Object;)V", "tryAddNullPlaceHolder", "Loader", "LoaderListener", "core"}, mo238835k = 1, mv = {1, 4, 0})
public final class ClaymoreServiceLoader {
    public static final ClaymoreServiceLoader INSTANCE = new ClaymoreServiceLoader();
    private static final Map<Class<?>, List<?>> loaderCache = new ConcurrentHashMap();
    private static LoaderListener loaderListener;
    private static final Map<Class<?>, LinkedHashSet<Loader<?>>> loaders = new ConcurrentHashMap();
    private static final Set<String> singletonDescCache = new CopyOnWriteArraySet();
    private static final Map<Class<?>, List<?>> staticCache = new ConcurrentHashMap();

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J2\u0010\u0002\u001a\u00020\u00032\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u00052\f\u0010\u0006\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00052\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH&J2\u0010\u000b\u001a\u00020\u00032\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u00052\f\u0010\u0006\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00052\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH&¨\u0006\f"}, d2 = {"Lcom/bytedance/i18n/claymore/ClaymoreServiceLoader$LoaderListener;", "", "onCreateInstanceFromStatic", "", "interfaze", "Ljava/lang/Class;", "instance", "index", "", "timeCost", "", "onGetCacheOrCreate", "core"}, mo238835k = 1, mv = {1, 4, 0})
    public interface LoaderListener {
        void onCreateInstanceFromStatic(Class<?> cls, Class<?> cls2, int i, long j);

        void onGetCacheOrCreate(Class<?> cls, Class<?> cls2, int i, long j);
    }

    @JvmStatic
    public static final <T> T createInstanceFromStatic(Class<T> cls, int i) {
        if (cls == AbstractC41553b.class) {
            if (i != 0) {
                return null;
            }
            singletonDescCache.add("com.ss.android.lark.platform.map.MapModuleProvider$MapModuleDependencyImpl");
            return (T) new MapModuleProvider.MapModuleDependencyImpl();
        } else if (cls == AbstractC55760b.class) {
            if (i != 0) {
                return null;
            }
            singletonDescCache.add("com.ss.android.lark.ug.thirdshare.dependency.ThirdShareDependencyImpl");
            return (T) new ThirdShareDependencyImpl();
        } else if (cls == AbTestModuleDependency.class) {
            if (i != 0) {
                return null;
            }
            singletonDescCache.add("com.ss.android.lark.platform.abtest.abtest.ABTestModuleDependenceImpl");
            return (T) new ABTestModuleDependenceImpl();
        } else if (cls == AbstractC41551a.class) {
            if (i != 0) {
                return null;
            }
            singletonDescCache.add("com.ss.android.lark.platform.location.LocationDependencyImpl");
            return (T) new LocationDependencyImpl();
        } else if (cls == ICoreApi.class) {
            if (i != 0) {
                return null;
            }
            singletonDescCache.add("com.ss.android.lark.core.impl.CoreApiImpl");
            return (T) new CoreApiImpl();
        } else if (cls == IInvitationModuleDependency.class) {
            if (i != 0) {
                return null;
            }
            singletonDescCache.add("com.ss.android.lark.ug.invitation.InvitationModuleDependencyImpl");
            return (T) new InvitationModuleDependencyImpl();
        } else if (cls == AbstractC55729a.class) {
            if (i != 0) {
                return null;
            }
            singletonDescCache.add("com.ss.android.lark.ug.thirdshare.dependency.LarkShareContainerDepApiImpl");
            return (T) new LarkShareContainerDepApiImpl();
        } else if (cls == IAppSettingPlugin.class) {
            switch (i) {
                case 0:
                    singletonDescCache.add("com.ss.android.lark.platform.monitor.handler.CPUExceptionHandler$CPUExceptionHandlerFactory");
                    return (T) new C51888a.C51890a();
                case 1:
                    singletonDescCache.add("com.ss.android.lark.platform.seal.SealCertificateConfigHandler$SealCertificateConfigHandlerFactory");
                    return (T) new C52008a.C52012c();
                case 2:
                    singletonDescCache.add("com.ss.android.lark.threadwindow.handler.ThreadHeartbeatSettingHandler$ThreadHeartbeatSettingHandlerFactory");
                    return (T) new C56097a.C56100b();
                case 3:
                    singletonDescCache.add("com.ss.android.lark.browser.handler.SchemaListConfigHandler$SchemaListConfigHandlerFactory");
                    return (T) new C29912b.C29915b();
                case 4:
                    singletonDescCache.add("com.ss.android.lark.browser.handler.TTWebViewConfigHandler$TTWebViewConfigHandlerFactory");
                    return (T) new C29916c.C29919b();
                case 5:
                    singletonDescCache.add("com.ss.android.lark.browser.handler.BizDomainAllowListConfigHandler$BizDomainAllowListConfigHandlerFactory");
                    return (T) new C29908a.C29910a();
                case 6:
                    singletonDescCache.add("com.ss.android.lark.featuregating.handler.FeatureGatingHandler$FeatureGatingHandlerFactory");
                    return (T) new C37246a.C37248a();
                case 7:
                    singletonDescCache.add("com.ss.android.lark.statistics.handler.HitPointSettingHandler$HitPointSettingHandlerFactory");
                    return (T) new C54957b.C54959a();
                case 8:
                    singletonDescCache.add("com.ss.android.lark.integrator.godzilla.CrashProfileSettingHandler$CrashProfileSettingHandlerFactory");
                    return (T) new C39132c.C39134a();
                default:
                    return null;
            }
        } else if (cls == IBrowserModuleDependency.class) {
            if (i != 0) {
                return null;
            }
            singletonDescCache.add("com.ss.android.lark.platform.browser.BrowserModuleProvider$BrowserModuleDependencyImpl");
            return (T) new BrowserModuleProvider.BrowserModuleDependencyImpl();
        } else if (cls == AbstractC36883a.class) {
            if (i != 0) {
                return null;
            }
            singletonDescCache.add("com.ss.android.lark.platform.dynamicconfig.DynamicConfigModuleDependencyImpl");
            return (T) new DynamicConfigModuleDependencyImpl();
        } else if (cls == AbstractC41162a.class) {
            if (i != 0) {
                return null;
            }
            singletonDescCache.add("com.ss.android.lark.platform.larksetting.LarkSettingModuleProvider$LarkSettingModuleDependency");
            return (T) new LarkSettingModuleProvider.LarkSettingModuleDependency();
        } else if (cls == ImExtension.class) {
            if (i == 0) {
                singletonDescCache.add("com.ss.android.lark.core.im.CoreImExtension");
                return (T) new CoreImExtension();
            } else if (i == 1) {
                singletonDescCache.add("com.ss.android.lark.integrator.calendar.im.CalendarImExtension");
                return (T) new CalendarImExtension();
            } else if (i == 2) {
                singletonDescCache.add("com.ss.android.lark.integrator.todo.im.TodoImExtension");
                return (T) new TodoImExtension();
            } else if (i == 3) {
                singletonDescCache.add("com.ss.android.lark.integrator.openplatform.im.OpenPlatformImExtension");
                return (T) new OpenPlatformImExtension();
            } else if (i == 4) {
                singletonDescCache.add("com.ss.android.lark.integrator.im.VideoChatImExtension");
                return (T) new VideoChatImExtension();
            } else if (i != 5) {
                return null;
            } else {
                singletonDescCache.add("com.ss.android.lark.integrator.meego.im.MeegoImExtension");
                return (T) new MeegoImExtension();
            }
        } else if (cls == InvitationServiceApi.class) {
            if (i != 0) {
                return null;
            }
            singletonDescCache.add("com.ss.android.lark.invitation.v2.InvitationServiceApiImpl");
            return (T) new InvitationServiceApiImpl();
        } else if (cls == InvitationApi.class) {
            if (i != 0) {
                return null;
            }
            singletonDescCache.add("com.ss.android.lark.invitation.v2.InvitationModule");
            return (T) new InvitationModule();
        } else if (cls == IMoneyModuleDependency.class) {
            if (i != 0) {
                return null;
            }
            singletonDescCache.add("com.ss.android.lark.integrator.im.money.MoneyModuleProvider$MoneyModuleDependency");
            return (T) new MoneyModuleProvider.MoneyModuleDependency();
        } else if (cls == BulletDependency.class) {
            if (i != 0) {
                return null;
            }
            singletonDescCache.add("com.ss.android.lark.integrator.im.money.BulletModuleProvider$BulletDependencyImpl");
            return (T) new BulletModuleProvider.BulletDependencyImpl();
        } else if (cls == IGroupMemberManageModuleDependency.class) {
            if (i != 0) {
                return null;
            }
            singletonDescCache.add("com.ss.android.lark.integrator.im.groupmember.GroupMemberManageModuleDependency");
            return (T) new GroupMemberManageModuleDependency();
        } else if (cls == AbstractC36248c.class) {
            if (i != 0) {
                return null;
            }
            singletonDescCache.add("com.ss.android.lark.integrator.im.groupchat.CreateGroupChatModuleProvider$ICreateGroupChatModuleDependencyImpl");
            return (T) new CreateGroupChatModuleProvider.ICreateGroupChatModuleDependencyImpl();
        } else if (cls == IIMApi.class) {
            if (i != 0) {
                return null;
            }
            singletonDescCache.add("com.ss.android.lark.integrator.im.impl.IMApiImpl");
            return (T) new IMApiImpl();
        } else if (cls == AbstractC41413a.class) {
            if (i != 0) {
                return null;
            }
            singletonDescCache.add("com.ss.android.lark.littleapp.prelaunch.PreLaunchServiceImpl");
            return (T) new PreLaunchServiceImpl();
        } else if (cls == ICreateGroupChatModule.class) {
            if (i != 0) {
                return null;
            }
            singletonDescCache.add("com.ss.android.lark.create.groupchat.CreateGroupChatModule");
            return (T) new CreateGroupChatModule();
        } else if (cls == IMeegoPluginDependency.class) {
            if (i != 0) {
                return null;
            }
            singletonDescCache.add("com.ss.android.lark.meego.wrapper.impl.MeegoPluginDependencyImpl");
            return (T) new MeegoPluginDependencyImpl();
        } else if (cls == IMoneyModule.class) {
            if (i != 0) {
                return null;
            }
            singletonDescCache.add("com.ss.android.lark.money.MoneyModule");
            return (T) new MoneyModule();
        } else if (cls == ICommonService.class) {
            if (i != 0) {
                return null;
            }
            singletonDescCache.add("com.ss.android.lark.account_provider.serviceimpl.CommonServiceImpl");
            return (T) new CommonServiceImpl();
        } else if (cls == IBlockitApiService.class) {
            if (i != 0) {
                return null;
            }
            return (T) new BlockitApiServiceImpl();
        } else if (cls == IBDTuringService.class) {
            if (i != 0) {
                return null;
            }
            singletonDescCache.add("com.ss.android.lark.passport.biz_variant.BDTuringServiceImpl");
            return (T) new BDTuringServiceImpl();
        } else if (cls == AbstractC49396j.class) {
            if (i != 0) {
                return null;
            }
            singletonDescCache.add("com.ss.android.lark.passport.biz_variant.OneKeyLoginService");
            return (T) new OneKeyLoginService();
        } else if (cls == AbstractC49390d.class) {
            if (i != 0) {
                return null;
            }
            singletonDescCache.add("com.ss.android.lark.passport.device.service.impl.deviceid.DeviceIdService");
            return (T) new DeviceIdService();
        } else if (cls == IDeviceService.class) {
            if (i != 0) {
                return null;
            }
            singletonDescCache.add("com.ss.android.lark.passport.device.service.impl.DevicesService");
            return (T) new DevicesService();
        } else if (cls == IKaService.class) {
            if (i != 0) {
                return null;
            }
            singletonDescCache.add("com.ss.android.lark.passport.KaServiceImpl");
            return (T) new KaServiceImpl();
        } else if (cls == IQRLoginService.class) {
            if (i != 0) {
                return null;
            }
            singletonDescCache.add("com.ss.lark.android.passport.biz.service.impl.QRLoginService");
            return (T) new QRLoginService();
        } else if (cls == AbstractC49126j.class) {
            if (i != 0) {
                return null;
            }
            singletonDescCache.add("com.ss.lark.android.passport.biz.service.impl.MakeUserOnlineServiceImpl");
            return (T) new MakeUserOnlineServiceImpl();
        } else if (cls == AbstractC49128n.class) {
            if (i != 0) {
                return null;
            }
            singletonDescCache.add("com.ss.lark.android.passport.biz.service.impl.SwitchUserService");
            return (T) new SwitchUserService();
        } else if (cls == ILoginSourceService.class) {
            if (i != 0) {
                return null;
            }
            singletonDescCache.add("com.ss.lark.android.passport.biz.feature.sso.LoginSourceService");
            return (T) new LoginSourceService();
        } else if (cls == ISessionInvalidService.class) {
            if (i != 0) {
                return null;
            }
            singletonDescCache.add("com.ss.lark.android.passport.biz.feature.session.SessionInvalidService");
            return (T) new SessionInvalidService();
        } else if (cls == IUserListStorageService.class) {
            if (i != 0) {
                return null;
            }
            singletonDescCache.add("com.ss.lark.android.passport.biz.account.UserListStorageService");
            return (T) new UserListStorageService();
        } else if (cls == AbstractC49124b.class) {
            if (i != 0) {
                return null;
            }
            singletonDescCache.add("com.ss.lark.android.passport.biz.service.impl.CrossEnvServiceImpl");
            return (T) new CrossEnvServiceImpl();
        } else if (cls == AbstractC49125i.class) {
            if (i != 0) {
                return null;
            }
            singletonDescCache.add("com.ss.lark.android.passport.biz.service.impl.MakeUserOfflineServiceImpl");
            return (T) new MakeUserOfflineServiceImpl();
        } else if (cls == ILegacyUserListStorageService.class) {
            if (i != 0) {
                return null;
            }
            singletonDescCache.add("com.ss.lark.android.passport.biz.service.impl.LegacyUserListStorageService");
            return (T) new LegacyUserListStorageService();
        } else if (cls == IRouterActionFindService.class) {
            if (i != 0) {
                return null;
            }
            singletonDescCache.add("com.ss.lark.android.passport.biz.service.impl.RouterActionFindService");
            return (T) new RouterActionFindService();
        } else if (cls == ILogoutUserService.class) {
            if (i != 0) {
                return null;
            }
            singletonDescCache.add("com.ss.lark.android.passport.biz.service.impl.LogoutUserService");
            return (T) new LogoutUserService();
        } else if (cls == AbstractC49129o.class) {
            if (i != 0) {
                return null;
            }
            singletonDescCache.add("com.ss.lark.android.passport.biz.compat.tenant.TenantManageServiceCompat");
            return (T) new TenantManageServiceCompat();
        } else if (cls == ISSOSDKAuthService.class) {
            if (i != 0) {
                return null;
            }
            singletonDescCache.add("com.ss.lark.android.passport.biz.service.impl.SSOSDKAuthService");
            return (T) new SSOSDKAuthService();
        } else if (cls == ILoginInitService.class) {
            if (i != 0) {
                return null;
            }
            singletonDescCache.add("com.ss.lark.android.passport.biz.service.impl.LoginInitService");
            return (T) new LoginInitService();
        } else if (cls == AbstractC49370a.class) {
            if (i != 0) {
                return null;
            }
            singletonDescCache.add("com.ss.android.lark.passport.env.service.EnvServiceImpl");
            return (T) new EnvServiceImpl();
        } else if (cls == IUserListService.class) {
            if (i != 0) {
                return null;
            }
            singletonDescCache.add("com.ss.android.lark.passport.infra.serviceimpl.UserListService");
            return (T) new UserListService();
        } else if (cls == IListenerManagerService.class) {
            if (i != 0) {
                return null;
            }
            singletonDescCache.add("com.ss.android.lark.passport.infra.serviceimpl.ListenerManagerServiceImpl");
            return (T) new ListenerManagerServiceImpl();
        } else if (cls == AbstractC55759a.class) {
            if (i != 0) {
                return null;
            }
            singletonDescCache.add("com.ss.android.lark.thirdshare.lark.ThirdShareModule");
            return (T) new ThirdShareModule();
        } else if (cls == AbstractC55699a.class) {
            if (i != 0) {
                return null;
            }
            singletonDescCache.add("com.ss.android.lark.thirdshare.base.impl.ThirdShareBaseApiImpl");
            return (T) new ThirdShareBaseApiImpl();
        } else if (cls == IFCMModule.class) {
            if (i != 0) {
                return null;
            }
            singletonDescCache.add("com.ss.android.lark.fcm.FCMModule");
            return (T) new FCMModule();
        } else if (cls == AbstractC41567g.class) {
            if (i != 0) {
                return null;
            }
            singletonDescCache.add("com.ss.android.lark.map.MapModule");
            return (T) new MapModule();
        } else if (cls == IABTestService.class) {
            if (i != 0) {
                return null;
            }
            singletonDescCache.add("com.ss.android.lark.abtest.impl.AbTestModule");
            return (T) new AbTestModule();
        } else if (cls == AbstractC53225c.class) {
            if (i != 0) {
                return null;
            }
            singletonDescCache.add("com.ss.android.lark.screen.audit.impl.ScreenshotDetector");
            return (T) new ScreenshotDetector();
        } else if (cls == AbstractC37005c.class) {
            if (i != 0) {
                return null;
            }
            singletonDescCache.add("com.ss.android.lark.emm.EMMModule");
            return (T) new EMMModule();
        } else if (cls == AbstractC58198b.class) {
            if (i != 0) {
                return null;
            }
            singletonDescCache.add("com.ss.android.lark.vpn.sangfor.VPNSDKModule");
            return (T) new VPNSDKModule();
        } else if (cls == AbstractC24152a.class) {
            if (i != 0) {
                return null;
            }
            singletonDescCache.add("com.larksuite.component.dybrid.h5core.core.impl.H5ServiceImpl");
            return (T) new H5ServiceImpl();
        } else if (cls == IAppSettingDependency.class) {
            if (i == 0) {
                singletonDescCache.add("com.ss.android.lark.integrator.core.AppSettingDependencyImpl");
                return (T) new AppSettingDependencyImpl();
            } else if (i != 1) {
                return null;
            } else {
                singletonDescCache.add("com.ss.android.lark.integrator.im.AppSettingDependencyImpl");
                return (T) new com.ss.android.lark.integrator.im.AppSettingDependencyImpl();
            }
        } else if (cls == AbstractC36116a.class) {
            if (i != 0) {
                return null;
            }
            singletonDescCache.add("com.ss.android.lark.integrator.core.BasicContextDependencyImpl");
            return (T) new BasicContextDependencyImpl();
        } else if (cls == AbstractC37004b.class) {
            if (i != 0) {
                return null;
            }
            singletonDescCache.add("com.ss.android.lark.integrator.EMMModuleProvider$EMMModuleDependency");
            return (T) new EMMModuleProvider.EMMModuleDependency();
        } else if (cls == AbstractC36119d.class) {
            if (i != 0) {
                return null;
            }
            singletonDescCache.add("com.ss.android.lark.integrator.core.CoreModuleProvider$CoreDependencyImpl");
            return (T) new CoreModuleProvider.CoreDependencyImpl();
        } else if (cls == AbstractC58196a.class) {
            if (i != 0) {
                return null;
            }
            singletonDescCache.add("com.ss.android.lark.integrator.VPNSDKModuleProvider$VPNSDKDependency");
            return (T) new VPNSDKModuleProvider.VPNSDKDependency();
        } else if (cls == AbstractC29414b.class) {
            if (i != 0) {
                return null;
            }
            singletonDescCache.add("com.ss.android.lark.integrator.core.AppContextDependencyImpl");
            return (T) new AppContextDependencyImpl();
        } else if (cls == AbstractC53224b.class) {
            if (i != 0) {
                return null;
            }
            singletonDescCache.add("com.ss.android.lark.integrator.core.ScreenshotDependencyImpl");
            return (T) new ScreenshotDependencyImpl();
        } else if (cls == AbstractC39570l.class) {
            if (i != 0) {
                return null;
            }
            singletonDescCache.add("com.ss.android.lark.integrator.im.BasicContextDependencyImpl");
            return (T) new com.ss.android.lark.integrator.im.BasicContextDependencyImpl();
        } else if (cls == AbstractC38197a.class) {
            if (i != 0) {
                return null;
            }
            singletonDescCache.add("com.ss.android.lark.filedetail.FileDetailModuleDependency");
            return (T) new FileDetailModuleDependency();
        } else if (cls == AbstractC39573p.class) {
            if (i != 0) {
                return null;
            }
            singletonDescCache.add("com.ss.android.lark.integrator.im.IMModuleProvider$IMDependencyImpl");
            return (T) new IMModuleProvider.IMDependencyImpl();
        } else if (cls == ICalendarApi.class) {
            if (i != 0) {
                return null;
            }
            singletonDescCache.add("com.ss.android.lark.integrator.calendar.CalendarApiImpl");
            return (T) new CalendarApiImpl();
        } else if (cls == AbstractC30060b.class) {
            if (i != 0) {
                return null;
            }
            singletonDescCache.add("com.ss.android.lark.integrator.calendar.CalendarDependency");
            return (T) new CalendarDependency();
        } else if (cls == IMomentsDependency.class) {
            if (i != 0) {
                return null;
            }
            singletonDescCache.add("com.ss.android.lark.integrator.moments.MomentsDependency");
            return (T) new MomentsDependency();
        } else if (cls == ITodoDependency.class) {
            if (i != 0) {
                return null;
            }
            singletonDescCache.add("com.ss.android.lark.integrator.todo.TodoDependency");
            return (T) new TodoDependency();
        } else if (cls == IOpenPlatformApi.class) {
            if (i != 0) {
                return null;
            }
            singletonDescCache.add("com.ss.android.lark.integrator.openplatform.OpenPlatformApiImpl");
            return (T) new OpenPlatformApiImpl();
        } else if (cls == AbstractC41301a.class) {
            if (i != 0) {
                return null;
            }
            singletonDescCache.add("com.ss.android.lark.integrator.littleapp.LittleAppModuleProvider$LittleAppModuleDependencyImpl");
            return (T) new LittleAppModuleProvider.LittleAppModuleDependencyImpl();
        } else if (cls == AbstractC48793a.class) {
            if (i != 0) {
                return null;
            }
            singletonDescCache.add("com.ss.android.lark.integrator.openplatform.OpenPlatformModuleProvider$OpenPlatformModuleDependencyImpl");
            return (T) new OpenPlatformModuleProvider.OpenPlatformModuleDependencyImpl();
        } else if (cls == AbstractC24049b.class) {
            if (i != 0) {
                return null;
            }
            singletonDescCache.add("com.ss.android.lark.integrator.blockit.BlockitDependencyImpl");
            return (T) new BlockitDependencyImpl();
        } else if (cls == AbstractC29232a.class) {
            if (i != 0) {
                return null;
            }
            singletonDescCache.add("com.ss.android.lark.integrator.appstrategy.AppStrategyModuleProvider$AppStrategyModuleDependency");
            return (T) new AppStrategyModuleProvider.AppStrategyModuleDependency();
        } else if (cls == IAppCenterModuleDependency.class) {
            if (i != 0) {
                return null;
            }
            singletonDescCache.add("com.ss.android.lark.integrator.appcenter.AppCenterModuleProvider$AppCenterModuleDependency");
            return (T) new AppCenterModuleProvider.AppCenterModuleDependency();
        } else if (cls == IPassportApi.class) {
            if (i != 0) {
                return null;
            }
            singletonDescCache.add("com.ss.android.lark.integrator.passport.PassportApiImpl");
            return (T) new PassportApiImpl();
        } else if (cls == IInitializeTaskManagerService.class) {
            if (i != 0) {
                return null;
            }
            singletonDescCache.add("com.ss.android.lark.integrator.passport.serviceimpl.InitializeTaskManagerServiceImpl");
            return (T) new InitializeTaskManagerServiceImpl();
        } else if (cls == IDomainService.class) {
            if (i != 0) {
                return null;
            }
            singletonDescCache.add("com.ss.android.lark.integrator.passport.serviceimpl.DomainServiceImpl");
            return (T) new DomainServiceImpl();
        } else if (cls == AbstractC49393f.class) {
            if (i != 0) {
                return null;
            }
            singletonDescCache.add("com.ss.android.lark.integrator.passport.serviceimpl.GetTenantsByIdsServiceImpl");
            return (T) new GetTenantsByIdsServiceImpl();
        } else if (cls == AbstractC48976a.class) {
            if (i != 0) {
                return null;
            }
            singletonDescCache.add("com.ss.android.lark.integrator.passport.lazy.init.DeviceRustCmdServiceImpl");
            return (T) new DeviceRustCmdServiceImpl();
        } else if (cls == AbstractC49127k.class) {
            if (i != 0) {
                return null;
            }
            singletonDescCache.add("com.ss.android.lark.integrator.passport.serviceimpl.PassportIntegrateServiceImpl");
            return (T) new PassportIntegrateServiceImpl();
        } else if (cls == IHelpdeskApi.class) {
            if (i != 0) {
                return null;
            }
            singletonDescCache.add("com.ss.android.lark.integrator.helpdesk.HelpdeskApiImpl");
            return (T) new HelpdeskApiImpl();
        } else if (cls == IMailApi.class) {
            if (i != 0) {
                return null;
            }
            singletonDescCache.add("com.ss.android.lark.integrator.mail.MailApiImpl");
            return (T) new MailApiImpl();
        } else if (cls == AbstractC41740a.class) {
            if (i != 0) {
                return null;
            }
            singletonDescCache.add("com.ss.android.lark.integrator.mail.MailModuleProvider$MailModuleDependency");
            return (T) new MailModuleProvider.MailModuleDependency();
        } else if (cls == IVideoChatDependency.class) {
            if (i != 0) {
                return null;
            }
            singletonDescCache.add("com.ss.android.lark.vcintegrator.VCDependency");
            return (T) new VCDependency();
        } else if (cls == IMmDepend.class) {
            if (i != 0) {
                return null;
            }
            singletonDescCache.add("com.ss.android.lark.integrator.minutes.MinutesDependencyInjector$MmDependImpl");
            return (T) new MinutesDependencyInjector.MmDependImpl();
        } else if (cls == IVCApi.class) {
            if (i != 0) {
                return null;
            }
            singletonDescCache.add("com.ss.android.lark.vcintegrator.VCApiImpl");
            return (T) new VCApiImpl();
        } else if (cls == AbstractC57987d.class) {
            if (i != 0) {
                return null;
            }
            singletonDescCache.add("com.ss.android.lark.integrator.voip.VoIpModuleProvider$VoIpModuleDependency");
            return (T) new VoIpModuleProvider.VoIpModuleDependency();
        } else if (cls == AbstractC38780a.class) {
            if (i != 0) {
                return null;
            }
            singletonDescCache.add("DriveModuleDependency");
            return (T) new DriveModuleDependency();
        } else if (cls == ICCMApi.class) {
            if (i != 0) {
                return null;
            }
            singletonDescCache.add("com.ss.android.lark.integrator.ccm.CCMApiImpl");
            return (T) new CCMApiImpl();
        } else if (cls == IMeegoModuleDependency.class) {
            if (i != 0) {
                return null;
            }
            singletonDescCache.add("com.ss.android.lark.integrator.meego.MeegoModuleProvider$MeegoModuleDependency");
            return (T) new MeegoModuleProvider.MeegoModuleDependency();
        } else if (cls != IMeegoApi.class) {
            Intrinsics.checkParameterIsNotNull(cls, C60375c.f150914a);
            return null;
        } else if (i != 0) {
            return null;
        } else {
            singletonDescCache.add("com.ss.android.lark.integrator.meego.MeegoApiImpl");
            return (T) new MeegoApiImpl();
        }
    }

    @JvmStatic
    public static final <T> int getStaticCount(Class<T> cls) {
        if (cls == AbstractC41553b.class || cls == AbstractC55760b.class || cls == AbTestModuleDependency.class || cls == AbstractC41551a.class || cls == ICoreApi.class || cls == IInvitationModuleDependency.class || cls == AbstractC55729a.class) {
            return 1;
        }
        if (cls == IAppSettingPlugin.class) {
            return 9;
        }
        if (cls == IBrowserModuleDependency.class || cls == AbstractC36883a.class || cls == AbstractC41162a.class) {
            return 1;
        }
        if (cls == ImExtension.class) {
            return 6;
        }
        if (cls == InvitationServiceApi.class || cls == InvitationApi.class || cls == IMoneyModuleDependency.class || cls == BulletDependency.class || cls == IGroupMemberManageModuleDependency.class || cls == AbstractC36248c.class || cls == IIMApi.class || cls == AbstractC41413a.class || cls == ICreateGroupChatModule.class || cls == IMeegoPluginDependency.class || cls == IMoneyModule.class || cls == ICommonService.class || cls == IBlockitApiService.class || cls == IBDTuringService.class || cls == AbstractC49396j.class || cls == AbstractC49390d.class || cls == IDeviceService.class || cls == IKaService.class || cls == IQRLoginService.class || cls == AbstractC49126j.class || cls == AbstractC49128n.class || cls == ILoginSourceService.class || cls == ISessionInvalidService.class || cls == IUserListStorageService.class || cls == AbstractC49124b.class || cls == AbstractC49125i.class || cls == ILegacyUserListStorageService.class || cls == IRouterActionFindService.class || cls == ILogoutUserService.class || cls == AbstractC49129o.class || cls == ISSOSDKAuthService.class || cls == ILoginInitService.class || cls == AbstractC49370a.class || cls == IUserListService.class || cls == IListenerManagerService.class || cls == AbstractC55759a.class || cls == AbstractC55699a.class || cls == IFCMModule.class || cls == AbstractC41567g.class || cls == IABTestService.class || cls == AbstractC53225c.class || cls == AbstractC37005c.class || cls == AbstractC58198b.class || cls == AbstractC24152a.class) {
            return 1;
        }
        if (cls == IAppSettingDependency.class) {
            return 2;
        }
        return (cls == AbstractC36116a.class || cls == AbstractC37004b.class || cls == AbstractC36119d.class || cls == AbstractC58196a.class || cls == AbstractC29414b.class || cls == AbstractC53224b.class || cls == AbstractC39570l.class || cls == AbstractC38197a.class || cls == AbstractC39573p.class || cls == ICalendarApi.class || cls == AbstractC30060b.class || cls == IMomentsDependency.class || cls == ITodoDependency.class || cls == IOpenPlatformApi.class || cls == AbstractC41301a.class || cls == AbstractC48793a.class || cls == AbstractC24049b.class || cls == AbstractC29232a.class || cls == IAppCenterModuleDependency.class || cls == IPassportApi.class || cls == IInitializeTaskManagerService.class || cls == IDomainService.class || cls == AbstractC49393f.class || cls == AbstractC48976a.class || cls == AbstractC49127k.class || cls == IHelpdeskApi.class || cls == IMailApi.class || cls == AbstractC41740a.class || cls == IVideoChatDependency.class || cls == IMmDepend.class || cls == IVCApi.class || cls == AbstractC57987d.class || cls == AbstractC38780a.class || cls == ICCMApi.class || cls == IMeegoModuleDependency.class || cls == IMeegoApi.class) ? 1 : 0;
    }

    public final <T> int getLoaderCacheIndex(Class<T> cls, int i) {
        return i;
    }

    private ClaymoreServiceLoader() {
    }

    public final LoaderListener getLoaderListener() {
        return loaderListener;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b&\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0005¢\u0006\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002H\u0002J\b\u0010\u0007\u001a\u00020\bH\u0016J\b\u0010\t\u001a\u00020\u0002H&J\r\u0010\n\u001a\u00028\u0000H&¢\u0006\u0002\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/bytedance/i18n/claymore/ClaymoreServiceLoader$Loader;", "T", "", "()V", "equals", "", "other", "hashCode", "", "identity", "newInstance", "()Ljava/lang/Object;", "core"}, mo238835k = 1, mv = {1, 4, 0})
    public static abstract class Loader<T> {
        public abstract Object identity();

        public abstract T newInstance();

        public int hashCode() {
            return identity().hashCode();
        }

        public boolean equals(Object obj) {
            Object identity = identity();
            Object obj2 = null;
            if (!(obj instanceof Loader)) {
                obj = null;
            }
            Loader loader = (Loader) obj;
            if (loader != null) {
                obj2 = loader.identity();
            }
            return Intrinsics.areEqual(identity, obj2);
        }
    }

    public static final /* synthetic */ Map access$getLoaderCache$p(ClaymoreServiceLoader claymoreServiceLoader) {
        return loaderCache;
    }

    public static final /* synthetic */ Map access$getLoaders$p(ClaymoreServiceLoader claymoreServiceLoader) {
        return loaders;
    }

    public static final /* synthetic */ Map access$getStaticCache$p(ClaymoreServiceLoader claymoreServiceLoader) {
        return staticCache;
    }

    public final void setLoaderListener(LoaderListener loaderListener2) {
        loaderListener = loaderListener2;
    }

    @JvmStatic
    public static final <T> Iterator<T> loadAll(Class<T> cls) {
        Intrinsics.checkParameterIsNotNull(cls, C60375c.f150914a);
        return new ClaymoreServiceLoader$loadAll$1(cls);
    }

    @JvmStatic
    public static final <T> T loadFirst(Class<T> cls) {
        Intrinsics.checkParameterIsNotNull(cls, C60375c.f150914a);
        return (T) C69294l.m266135c(C69294l.m266116a(loadAll(cls)));
    }

    @JvmStatic
    public static final <T> T loadFirstOrNull(Class<T> cls) {
        Intrinsics.checkParameterIsNotNull(cls, C60375c.f150914a);
        try {
            return (T) C69294l.m266135c(C69294l.m266116a(loadAll(cls)));
        } catch (Exception unused) {
            return null;
        }
    }

    public final <T> int getStaticCacheIndex(Class<T> cls, int i) {
        int i2;
        List list = (List) access$getLoaderCache$p(this).get(cls);
        if (list != null) {
            i2 = list.size();
        } else {
            i2 = 0;
        }
        return i - i2;
    }

    public final <T> boolean isLoaderIndex(Class<T> cls, int i) {
        int i2;
        LinkedHashSet linkedHashSet = (LinkedHashSet) access$getLoaders$p(this).get(cls);
        if (linkedHashSet != null) {
            i2 = linkedHashSet.size();
        } else {
            i2 = 0;
        }
        if (i < i2) {
            return true;
        }
        return false;
    }

    @JvmStatic
    public static final <T> void registerLoader(Class<T> cls, Loader<T> loader) {
        Intrinsics.checkParameterIsNotNull(cls, C60375c.f150914a);
        Intrinsics.checkParameterIsNotNull(loader, "loader");
        synchronized (cls) {
            Map<Class<?>, LinkedHashSet<Loader<?>>> map = loaders;
            if (map.get(cls) == null) {
                map.put(cls, new LinkedHashSet<>());
            }
            LinkedHashSet<Loader<?>> linkedHashSet = map.get(cls);
            if (linkedHashSet != null) {
                Boolean.valueOf(linkedHashSet.add(loader));
            }
        }
    }

    public final <T> T getCacheOrCreate(Class<T> cls, int i) {
        T t;
        Class<?> cls2;
        long currentTimeMillis = System.currentTimeMillis();
        synchronized (cls) {
            ClaymoreServiceLoader claymoreServiceLoader = INSTANCE;
            t = (T) claymoreServiceLoader.getCacheOrNull(cls, i);
            if (t == null) {
                t = (T) claymoreServiceLoader.createInstanceAndCache(cls, i);
            }
            LoaderListener loaderListener2 = loaderListener;
            if (loaderListener2 != null) {
                if (t != null) {
                    cls2 = t.getClass();
                } else {
                    cls2 = null;
                }
                loaderListener2.onGetCacheOrCreate(cls, cls2, i, System.currentTimeMillis() - currentTimeMillis);
            }
        }
        return t;
    }

    public final <T> boolean isStaticIndex(Class<T> cls, int i) {
        int i2;
        boolean z;
        int i3;
        LinkedHashSet linkedHashSet = (LinkedHashSet) access$getLoaders$p(this).get(cls);
        if (linkedHashSet != null) {
            i2 = linkedHashSet.size();
        } else {
            i2 = 0;
        }
        if (i < i2) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return false;
        }
        List list = (List) access$getLoaderCache$p(this).get(cls);
        if (list != null) {
            i3 = list.size();
        } else {
            i3 = 0;
        }
        if (i - i3 < getStaticCount(cls)) {
            return true;
        }
        return false;
    }

    private final <T> T createInstanceFromLoader(Class<T> cls, int i) {
        List mutableList;
        Loader loader;
        LinkedHashSet<Loader<?>> linkedHashSet = loaders.get(cls);
        ClaymoreNoop claymoreNoop = null;
        T t = (linkedHashSet == null || (mutableList = CollectionsKt.toMutableList(linkedHashSet)) == null || (loader = (Loader) CollectionsKt.getOrNull(mutableList, i)) == null) ? null : (T) loader.newInstance();
        if (t != null) {
            ClaymoreImpl claymoreImpl = (ClaymoreImpl) t.getClass().getAnnotation(ClaymoreImpl.class);
            if (claymoreImpl == null) {
                claymoreImpl = null;
            }
            ClaymoreNoop claymoreNoop2 = (ClaymoreNoop) t.getClass().getAnnotation(ClaymoreNoop.class);
            if (claymoreNoop2 != null) {
                claymoreNoop = claymoreNoop2;
            }
            if ((claymoreImpl != null && claymoreImpl.singleton()) || (claymoreNoop != null && claymoreNoop.singleton())) {
                Set<String> set = singletonDescCache;
                String name = t.getClass().getName();
                Intrinsics.checkExpressionValueIsNotNull(name, "it.javaClass.name");
                set.add(name);
            }
        }
        return t;
    }

    private final <T> T getCacheOrNull(Class<T> cls, int i) {
        int i2;
        int i3;
        boolean z;
        Map<Class<?>, List<?>> map = loaderCache;
        List<?> list = map.get(cls);
        int i4 = 0;
        if (list != null) {
            i2 = list.size();
        } else {
            i2 = 0;
        }
        if (i < i2) {
            return (T) getCacheOrNull(cls, i, map);
        }
        LinkedHashSet linkedHashSet = (LinkedHashSet) access$getLoaders$p(this).get(cls);
        if (linkedHashSet != null) {
            i3 = linkedHashSet.size();
        } else {
            i3 = 0;
        }
        if (i < i3) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return null;
        }
        List list2 = (List) access$getLoaderCache$p(this).get(cls);
        if (list2 != null) {
            i4 = list2.size();
        }
        return (T) getCacheOrNull(cls, i - i4, staticCache);
    }

    /* JADX WARNING: Removed duplicated region for block: B:47:0x00b3  */
    /* JADX WARNING: Removed duplicated region for block: B:84:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final <T> T createInstanceAndCache(java.lang.Class<T> r15, int r16) {
        /*
        // Method dump skipped, instructions count: 327
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.i18n.claymore.ClaymoreServiceLoader.createInstanceAndCache(java.lang.Class, int):java.lang.Object");
    }

    private final <T> T getCacheOrNull(Class<T> cls, int i, Map<Class<?>, List<?>> map) {
        List<?> list = map.get(cls);
        if (list != null) {
            return (T) CollectionsKt.getOrNull(list, i);
        }
        return null;
    }

    public final <T> void tryAddNullPlaceHolder(Class<T> cls, int i, Map<Class<?>, List<?>> map) {
        ArrayList arrayList = map.get(cls);
        if (arrayList == null) {
            arrayList = new ArrayList();
            map.put(cls, arrayList);
        }
        List f = C69121n.m265989f(arrayList);
        if (i >= f.size()) {
            f.add(null);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: java.lang.Class<T> */
    /* JADX WARN: Multi-variable type inference failed */
    private final <T> void removeNullAndReplace(Map<Class<?>, List<?>> map, Class<T> cls, int i, T t) {
        boolean z;
        if (!singletonDescCache.contains(t.getClass().getName())) {
            t = null;
        }
        ArrayList arrayList = map.get(cls);
        if (arrayList == null) {
            arrayList = new ArrayList();
            map.put(cls, arrayList);
        }
        List f = C69121n.m265989f(arrayList);
        if (i < f.size()) {
            if (f.get(i) == null) {
                z = true;
            } else {
                z = false;
            }
            if (!_Assertions.f173221a || z) {
                f.remove(i);
            } else {
                throw new AssertionError("This should never happen!");
            }
        }
        f.add(i, t);
    }
}
