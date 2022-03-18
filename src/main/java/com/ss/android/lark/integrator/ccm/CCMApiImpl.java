package com.ss.android.lark.integrator.ccm;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.net.Uri;
import android.view.KeyEvent;
import android.view.MotionEvent;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import com.bytedance.ee.bear.basesdk.api.AbstractC4385i;
import com.bytedance.ee.bear.basesdk.api.AbstractC4388l;
import com.bytedance.ee.bear.basesdk.api.AbstractC4390n;
import com.bytedance.ee.bear.basesdk.api.IDarkMode;
import com.bytedance.ee.bear.basesdk.apisupport.AbstractC4434t;
import com.bytedance.ee.bear.contract.drive.AbstractC5138b;
import com.bytedance.ee.bear.contract.route.lark.SpaceMultipleDriveFileRouteBean;
import com.bytedance.ee.bear.contract.route.lark.SpaceRouteBean;
import com.bytedance.ee.bear.diskmanager.Biz;
import com.bytedance.ee.bear.diskmanager.CCMStorage;
import com.bytedance.ee.bear.integrator.dto.C7925a;
import com.bytedance.ee.bear.integrator.dto.DocConvertToken;
import com.bytedance.ee.bear.integrator.dto.FileClickModel;
import com.bytedance.ee.bear.lark.notification.docfeed.AbstractC8055g;
import com.bytedance.ee.bear.lark.p421h.C8043a;
import com.bytedance.ee.bear.lark.selector.auth.AbstractC8084c;
import com.bytedance.ee.bear.p391g.C7804b;
import com.bytedance.ee.bear.search.AbstractC10816c;
import com.bytedance.i18n.claymore.ClaymoreImpl;
import com.bytedance.lark.pb.basic.v1.C14928Entity;
import com.huawei.hms.framework.common.ContainerUtils;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.utils.CollectionUtils;
import com.ss.android.lark.abtest.api.p1324a.AbstractC28490a;
import com.ss.android.lark.applink.AbstractC29186b;
import com.ss.android.lark.base.activity.C29525a;
import com.ss.android.lark.biz.im.api.AbstractC29625q;
import com.ss.android.lark.ccm_api.AbstractC32803a;
import com.ss.android.lark.ccm_api.ICCMApi;
import com.ss.android.lark.ccm_api.p1592a.C32804a;
import com.ss.android.lark.chat.entity.chat.Chat;
import com.ss.android.lark.chat.entity.keyboard.IPlusItem;
import com.ss.android.lark.chat.entity.message.Message;
import com.ss.android.lark.chat.entity.p1664d.AbstractC33987b;
import com.ss.android.lark.chat.entity.p1667g.AbstractC33992b;
import com.ss.android.lark.chat.entity.page.DocPageConfig;
import com.ss.android.lark.chat.entity.page.IDocPageLoader;
import com.ss.android.lark.chat.entity.page.IDocPageProvider;
import com.ss.android.lark.desktopmode.p1787a.C36516a;
import com.ss.android.lark.diskmanage.clean.IDiskCleanTask;
import com.ss.android.lark.doc.entity.AbstractC36839d;
import com.ss.android.lark.doc.entity.C36836a;
import com.ss.android.lark.doc.entity.DocFeed;
import com.ss.android.lark.doc.entity.DocPermPair;
import com.ss.android.lark.doc.entity.DocResult;
import com.ss.android.lark.doc.entity.DocType;
import com.ss.android.lark.integrator.ccm.dependency.C39345b;
import com.ss.android.lark.integrator.ccm.p2006c.C39242e;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.maincore.AbstractC44548e;
import com.ss.android.lark.maincore.AbstractC44552i;
import com.ss.android.lark.maincore.ITitleController;
import com.ss.android.lark.notification.export.AbstractNotification;
import com.ss.android.lark.p1954i.C38777a;
import com.ss.android.lark.p1954i.p1956b.AbstractC38781a;
import com.ss.android.lark.p2567s.p2568a.p2570b.C53197a;
import com.ss.android.lark.p2567s.p2568a.p2570b.C53198b;
import com.ss.android.lark.preload.AbstractC52220a;
import com.ss.android.lark.utils.C57765ac;
import com.ss.android.lark.utils.LarkContext;
import java.net.URI;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

@ClaymoreImpl(ICCMApi.class)
public class CCMApiImpl implements ICCMApi {
    private static final Map<AbstractC33992b, C38777a.AbstractC38779a> sPushSaveToNutStateListenerMap = new ConcurrentHashMap();
    private final ConcurrentHashMap<AbstractC29625q, C38777a.AbstractC38779a> sPushSaveToNutStoreStateListenerMap = new ConcurrentHashMap<>();

    @Override // com.ss.android.lark.ccm_api.ICCMApi
    public void registerAnnouncementCloseListener(AbstractC33987b bVar) {
    }

    @Override // com.ss.android.lark.ccm_api.ICCMApi
    public void unRegisterAnnouncementCloseListener(AbstractC33987b bVar) {
    }

    @Override // com.ss.android.lark.ccm_api.ICCMApi
    public Map<String, String> getAutoInitModuleConfigMap() {
        return C53197a.f131527a;
    }

    @Override // com.ss.android.lark.ccm_api.ICCMApi
    public Map<String, String> getThirdPartyModuleConfigMap() {
        return C53197a.f131528b;
    }

    @Override // com.ss.android.lark.ccm_api.ICCMApi
    public Map<String, String> getThirdPartyPrefixModuleConfigMap() {
        return C53197a.f131529c;
    }

    @Override // com.ss.android.lark.ccm_api.ICCMApi
    public List<AbstractC28490a> getAbTestExperiments() {
        return C39242e.m154778j();
    }

    @Override // com.ss.android.lark.ccm_api.ICCMApi
    public IDocPageProvider getDocPageProvider() {
        return new IDocPageProvider() {
            /* class com.ss.android.lark.integrator.ccm.CCMApiImpl.C392315 */
        };
    }

    @Override // com.ss.android.lark.ccm_api.ICCMApi
    public Map<Integer, Integer> getLayoutResIdMap() {
        return C39345b.m155088a();
    }

    @Override // com.ss.android.lark.ccm_api.ICCMApi
    public Map<String, Boolean> getWikiFeatureGatingConfig() {
        return WikiModuleProvider.m154719b();
    }

    @Override // com.ss.android.lark.ccm_api.ICCMApi
    public AbstractC4434t apiGroups() {
        return C39234b.m154731a().mo143066a();
    }

    @Override // com.ss.android.lark.ccm_api.ICCMApi
    public void checkAndInit() {
        C39234b.m154731a().mo143067b().mo143103b();
    }

    @Override // com.ss.android.lark.ccm_api.ICCMApi
    public void fetchAppSetting() {
        C39234b.m154731a().mo143067b().mo143121l();
    }

    @Override // com.ss.android.lark.ccm_api.ICCMApi
    public String geWikiPageName() {
        return WikiModuleProvider.m154718a().mo143046a();
    }

    @Override // com.ss.android.lark.ccm_api.ICCMApi
    public IDiskCleanTask getCCMDiskCleanTask() {
        return C39234b.m154731a().mo143067b().mo143120k();
    }

    @Override // com.ss.android.lark.ccm_api.ICCMApi
    public Map<String, String> getDocArgsMessage() {
        return new C32804a().mo120923a("message").mo120925a();
    }

    @Override // com.ss.android.lark.ccm_api.ICCMApi
    public Map<String, String> getDocArgsMessageCard() {
        return new C32804a().mo120923a("message_card").mo120925a();
    }

    @Override // com.ss.android.lark.ccm_api.ICCMApi
    public Map<String, String> getDocArgsOther() {
        return new C32804a().mo120923a("lark_other").mo120925a();
    }

    @Override // com.ss.android.lark.ccm_api.ICCMApi
    public AbstractC8055g getDocModelParser() {
        return C39234b.m154731a().mo143067b().mo143119i();
    }

    @Override // com.ss.android.lark.ccm_api.ICCMApi
    public String getDocPageName() {
        return C39234b.m154731a().mo143067b().mo143118h();
    }

    @Override // com.ss.android.lark.ccm_api.ICCMApi
    public AbstractC4385i getDriveSdkWrapper() {
        return C39234b.m154731a().mo143066a().mo17144k();
    }

    @Override // com.ss.android.lark.ccm_api.ICCMApi
    public void injectSessionCookies() {
        C39234b.m154731a().mo143067b().mo143115e();
    }

    @Override // com.ss.android.lark.ccm_api.ICCMApi
    public boolean isEnableWikiTab() {
        return WikiModuleProvider.m154718a().mo143049b();
    }

    @Override // com.ss.android.lark.ccm_api.ICCMApi
    public boolean isP0MergeToMainProc() {
        return C39234b.m154731a().mo143067b().mo143122m();
    }

    @Override // com.ss.android.lark.ccm_api.ICCMApi
    public IDarkMode provideDarkMode() {
        return C39234b.m154731a().mo143066a().mo17141h();
    }

    @Override // com.ss.android.lark.ccm_api.ICCMApi
    public AbstractC4385i provideDriveSdk() {
        return C39234b.m154731a().mo143066a().mo17144k();
    }

    @Override // com.ss.android.lark.ccm_api.ICCMApi
    public AbstractC4388l provideFollowSdk() {
        return C7804b.m31283a().mo17147n();
    }

    @Override // com.ss.android.lark.ccm_api.ICCMApi
    public Collection<? extends AbstractNotification> provideNotificationImpls() {
        return C39234b.m154731a().mo143067b().mo143117g();
    }

    @Override // com.ss.android.lark.ccm_api.ICCMApi
    public AbstractC4390n providePermissionProvider() {
        return C7804b.m31283a().mo17149p();
    }

    @Override // com.ss.android.lark.ccm_api.ICCMApi
    public Collection<? extends AbstractC52220a> getDocsIdleActions() {
        C39242e b = C39234b.m154731a().mo143067b();
        if (b != null) {
            return b.mo143110c();
        }
        return new ArrayList();
    }

    @Override // com.ss.android.lark.ccm_api.ICCMApi
    public AbstractC10816c makeWikiForLarkGlobalSearch() {
        return C39234b.m154731a().mo143066a().mo17151r().mo17078a();
    }

    @Override // com.ss.android.lark.ccm_api.ICCMApi
    public void initProcessorDoInit(String str) {
        C53198b.m205839a(str);
    }

    @Override // com.ss.android.lark.ccm_api.ICCMApi
    public IDocPageLoader getDocPageLoader(final String str) {
        return new IDocPageLoader() {
            /* class com.ss.android.lark.integrator.ccm.CCMApiImpl.C392282 */

            @Override // com.ss.android.lark.chat.entity.page.IDocPageLoader
            /* renamed from: b */
            public boolean mo124917b() {
                return C39234b.m154731a().mo143068c().mo143062b(str);
            }

            @Override // com.ss.android.lark.chat.entity.page.IDocPageLoader
            /* renamed from: a */
            public void mo124911a() {
                C39234b.m154731a().mo143068c().mo143054a(str);
            }

            @Override // com.ss.android.lark.chat.entity.page.IDocPageLoader
            /* renamed from: a */
            public void mo124913a(Context context) {
                C39234b.m154731a().mo143068c().mo143056a(str, context);
            }

            @Override // com.ss.android.lark.chat.entity.page.IDocPageLoader
            /* renamed from: a */
            public void mo124914a(Configuration configuration) {
                C39234b.m154731a().mo143068c().mo143057a(str, configuration);
            }

            @Override // com.ss.android.lark.chat.entity.page.IDocPageLoader
            /* renamed from: a */
            public void mo124915a(AppCompatActivity appCompatActivity) {
                C39234b.m154731a().mo143068c().mo143058a(str, appCompatActivity);
            }

            @Override // com.ss.android.lark.chat.entity.page.IDocPageLoader
            /* renamed from: a */
            public boolean mo124916a(KeyEvent keyEvent) {
                return C39234b.m154731a().mo143068c().mo143060a(str, keyEvent);
            }

            @Override // com.ss.android.lark.chat.entity.page.IDocPageLoader
            /* renamed from: a */
            public Fragment mo124910a(Context context, String str, DocPageConfig aVar) {
                return C39234b.m154731a().mo143068c().mo143052a(str, context, str, aVar);
            }

            @Override // com.ss.android.lark.chat.entity.page.IDocPageLoader
            /* renamed from: a */
            public void mo124912a(int i, int i2, Intent intent) {
                C39234b.m154731a().mo143068c().mo143055a(str, i, i2, intent);
            }
        };
    }

    @Override // com.ss.android.lark.ccm_api.ICCMApi
    public void preloadWikiTabPageData(Context context) {
        WikiModuleProvider.m154718a().mo143047a(context);
    }

    @Override // com.ss.android.lark.ccm_api.ICCMApi
    public boolean canOpen(String str) {
        return C39234b.m154731a().mo143067b().mo143095a(str);
    }

    @Override // com.ss.android.lark.ccm_api.ICCMApi
    public void clearCache(IGetDataCallback<Boolean> iGetDataCallback) {
        C39234b.m154731a().mo143067b().mo143106b(iGetDataCallback);
    }

    @Override // com.ss.android.lark.ccm_api.ICCMApi
    public void createDoc(Activity activity) {
        C39234b.m154731a().mo143066a().mo17142i().mo17042a(activity);
    }

    @Override // com.ss.android.lark.ccm_api.ICCMApi
    public AbstractC36839d createDocCardViewBinder(Context context) {
        return C39234b.m154731a().mo143067b().mo143112d(context);
    }

    @Override // com.ss.android.lark.ccm_api.ICCMApi
    public void destroyDocPage(String str) {
        C39234b.m154731a().mo143068c().mo143054a(str);
    }

    @Override // com.ss.android.lark.ccm_api.ICCMApi
    public void downloadFullResource(Context context) {
        C39234b.m154731a().mo143067b().mo143111c(context);
    }

    @Override // com.ss.android.lark.ccm_api.ICCMApi
    public void forceStopKeepAliveService(Context context) {
        C39234b.m154731a().mo143067b().mo143104b(context);
    }

    @Override // com.ss.android.lark.ccm_api.ICCMApi
    public void getCacheSize(IGetDataCallback<Long> iGetDataCallback) {
        C39234b.m154731a().mo143067b().mo143086a(iGetDataCallback);
    }

    @Override // com.ss.android.lark.ccm_api.ICCMApi
    public Map<String, String> getDocArgs(String str) {
        return new C32804a().mo120923a(str).mo120925a();
    }

    @Override // com.ss.android.lark.ccm_api.ICCMApi
    public AbstractC36839d getDocCardViewBinder(Context context) {
        return C39234b.m154731a().mo143067b().mo143112d(context);
    }

    @Override // com.ss.android.lark.ccm_api.ICCMApi
    public int getDocFilterIcon(DocType docType) {
        return C39234b.m154731a().mo143067b().mo143098b(docType);
    }

    @Override // com.ss.android.lark.ccm_api.ICCMApi
    public int getDocInlineBlueIcon(DocType docType) {
        return C39234b.m154731a().mo143067b().mo143073a(docType, 0);
    }

    @Override // com.ss.android.lark.ccm_api.ICCMApi
    public int getDocInlineGrayIcon(DocType docType) {
        return C39234b.m154731a().mo143067b().mo143073a(docType, 2);
    }

    @Override // com.ss.android.lark.ccm_api.ICCMApi
    public int getDocInlineLightBlueIcon(DocType docType) {
        return C39234b.m154731a().mo143067b().mo143073a(docType, 3);
    }

    @Override // com.ss.android.lark.ccm_api.ICCMApi
    public int getDocInlineWhiteIcon(DocType docType) {
        return C39234b.m154731a().mo143067b().mo143073a(docType, 1);
    }

    @Override // com.ss.android.lark.ccm_api.ICCMApi
    public int getDocMiniIcon(DocType docType) {
        return C39234b.m154731a().mo143067b().mo143072a(docType);
    }

    @Override // com.ss.android.lark.ccm_api.ICCMApi
    public Map<String, AbstractC29186b> getSpaceKitAppLinkHandlers(Context context) {
        return C39234b.m154731a().mo143067b().mo143114e(context);
    }

    @Override // com.ss.android.lark.ccm_api.ICCMApi
    public Map<String, String> getUrlParamsMap(String str) {
        return new C32804a().mo120923a(str).mo120925a();
    }

    @Override // com.ss.android.lark.ccm_api.ICCMApi
    public void loadThumbnail(C8043a aVar) {
        C39234b.m154731a().mo143067b().mo143085a(aVar);
    }

    @Override // com.ss.android.lark.ccm_api.ICCMApi
    public boolean onDocPageBackPressed(String str) {
        return C39234b.m154731a().mo143068c().mo143062b(str);
    }

    @Override // com.ss.android.lark.ccm_api.ICCMApi
    public void onLoginStatusChangedEvent(int i) {
        C39242e b = C39234b.m154731a().mo143067b();
        if (b != null) {
            b.mo143078a(i);
        }
    }

    @Override // com.ss.android.lark.ccm_api.ICCMApi
    public void openDocs(SpaceRouteBean spaceRouteBean) {
        C39234b.m154731a().mo143066a().mo17142i().mo17047a(spaceRouteBean);
    }

    @Override // com.ss.android.lark.ccm_api.ICCMApi
    public String[] parseDocUrl(String str) {
        return C39234b.m154731a().mo143067b().mo143108b(str);
    }

    @Override // com.ss.android.lark.ccm_api.ICCMApi
    public void preloadSpacePageUI(Context context) {
        C39234b.m154731a().mo143066a().mo17151r().mo17080a(context);
    }

    @Override // com.ss.android.lark.ccm_api.ICCMApi
    public void setCCMConfig(String str) {
        C39234b.m154731a().mo143066a().mo17148o().mo17073a(str);
    }

    @Override // com.ss.android.lark.ccm_api.ICCMApi
    public void setIsAppInFront(boolean z) {
        C39234b.m154731a().mo143066a().mo17137d().mo17022b(z);
    }

    @Override // com.ss.android.lark.ccm_api.ICCMApi
    public void setOnWebViewCreateListener(AbstractC32803a aVar) {
        C39242e b = C39234b.m154731a().mo143067b();
        if (b != null) {
            b.mo143087a(aVar);
        }
    }

    @Override // com.ss.android.lark.ccm_api.ICCMApi
    public void setupServices(Context context) {
        C39234b.m154731a().mo143067b().mo143079a(context);
    }

    @Override // com.ss.android.lark.ccm_api.ICCMApi
    public C36836a syncPullDocFeedsByIds(List<String> list) {
        return C39234b.m154731a().mo143067b().mo143100b(list);
    }

    @Override // com.ss.android.lark.ccm_api.ICCMApi
    public void timingCleanData(long j) {
        C39234b.m154731a().mo143066a().mo17148o().mo17072a(j);
    }

    @Override // com.ss.android.lark.ccm_api.ICCMApi
    public void addListenerToDriveSaveStateEventPush(AbstractC29625q qVar) {
        $$Lambda$CCMApiImpl$fs23dC36gA5CDY7Y8zpsYUGncSw r0 = new C38777a.AbstractC38779a() {
            /* class com.ss.android.lark.integrator.ccm.$$Lambda$CCMApiImpl$fs23dC36gA5CDY7Y8zpsYUGncSw */

            @Override // com.ss.android.lark.p1954i.C38777a.AbstractC38779a
            public final void onPushSaveToNutStoreState(String str, int i) {
                AbstractC29625q.this.mo106747a(str, i);
            }
        };
        this.sPushSaveToNutStoreStateListenerMap.put(qVar, r0);
        DriveModuleProvider.f100541a.mo143050a().mo142135a(r0);
    }

    @Override // com.ss.android.lark.ccm_api.ICCMApi
    public int driveCancelDownload(String[] strArr) {
        return C39234b.m154731a().mo143066a().mo17145l().mo17061a(strArr);
    }

    @Override // com.ss.android.lark.ccm_api.ICCMApi
    public int driveCancelUpload(String[] strArr) {
        return C39234b.m154731a().mo143066a().mo17145l().mo17066b(strArr);
    }

    @Override // com.ss.android.lark.ccm_api.ICCMApi
    public int getDocInlineBlueIcon(int i) {
        return C39234b.m154731a().mo143067b().mo143073a(DocType.forNumber(i), 0);
    }

    @Override // com.ss.android.lark.ccm_api.ICCMApi
    public int getDocInlineGrayIcon(int i) {
        return C39234b.m154731a().mo143067b().mo143073a(DocType.forNumber(i), 2);
    }

    @Override // com.ss.android.lark.ccm_api.ICCMApi
    public int getDocInlineLightBlueIcon(int i) {
        return C39234b.m154731a().mo143067b().mo143073a(DocType.forNumber(i), 3);
    }

    @Override // com.ss.android.lark.ccm_api.ICCMApi
    public void initDocPlugin(Context context) {
        int i;
        C39242e b = C39234b.m154731a().mo143067b();
        if (b != null) {
            if (C57765ac.m224187a(context)) {
                i = 0;
            } else {
                i = 5000;
            }
            b.mo143080a(context, i);
        }
    }

    @Override // com.ss.android.lark.ccm_api.ICCMApi
    public AbstractC10816c makeDocForLarkGlobalSearch(boolean z) {
        return C39234b.m154731a().mo143066a().mo17151r().mo17079a(z);
    }

    @Override // com.ss.android.lark.ccm_api.ICCMApi
    public void registerPushSaveToNutStateListener(final AbstractC33992b bVar) {
        if (bVar != null) {
            C392304 r0 = new C38777a.AbstractC38779a() {
                /* class com.ss.android.lark.integrator.ccm.CCMApiImpl.C392304 */

                @Override // com.ss.android.lark.p1954i.C38777a.AbstractC38779a
                public void onPushSaveToNutStoreState(String str, int i) {
                    bVar.mo123079a(str, i);
                }
            };
            sPushSaveToNutStateListenerMap.put(bVar, r0);
            C38777a a = DriveModuleProvider.f100541a.mo143050a();
            if (a != null) {
                a.mo142135a(r0);
            }
        }
    }

    @Override // com.ss.android.lark.ccm_api.ICCMApi
    public void removeListenerToDriveSaveStateEventPush(AbstractC29625q qVar) {
        C38777a.AbstractC38779a aVar = this.sPushSaveToNutStoreStateListenerMap.get(qVar);
        this.sPushSaveToNutStoreStateListenerMap.remove(qVar);
        if (aVar != null) {
            DriveModuleProvider.f100541a.mo143050a().mo142137b(aVar);
        }
    }

    @Override // com.ss.android.lark.ccm_api.ICCMApi
    public void unRegisterPushSaveToNutStateListener(AbstractC33992b bVar) {
        Map<AbstractC33992b, C38777a.AbstractC38779a> map;
        C38777a.AbstractC38779a aVar;
        if (bVar != null && (aVar = (map = sPushSaveToNutStateListenerMap).get(bVar)) != null) {
            map.remove(bVar);
            C38777a a = DriveModuleProvider.f100541a.mo143050a();
            if (a != null) {
                a.mo142137b(aVar);
            }
        }
    }

    @Override // com.ss.android.lark.ccm_api.ICCMApi
    public void preloadDoc(List<String> list) {
        if (!CollectionUtils.isEmpty(list)) {
            boolean z = false;
            for (String str : list) {
                z |= C39234b.m154731a().mo143067b().mo143095a(str);
                if (z) {
                    break;
                }
            }
            if (z) {
                C39234b.m154731a().mo143067b().mo143091a(list);
            }
        }
    }

    @Override // com.ss.android.lark.ccm_api.ICCMApi
    public void preloadDocFromFeed(List<String> list) {
        ArrayList arrayList = new ArrayList();
        for (String str : list) {
            arrayList.add(appendQuery(str, "from=docs_feed"));
        }
        C39234b.m154731a().mo143067b().mo143091a(arrayList);
    }

    @Override // com.ss.android.lark.ccm_api.ICCMApi
    public boolean open(SpaceMultipleDriveFileRouteBean spaceMultipleDriveFileRouteBean) {
        return C39234b.m154731a().mo143066a().mo17142i().mo17047a(spaceMultipleDriveFileRouteBean);
    }

    @Override // com.ss.android.lark.ccm_api.ICCMApi
    public void jumpSearchWiki(String str, String str2) {
        WikiModuleProvider.m154718a().mo143048a(str, str2);
    }

    @Override // com.ss.android.lark.ccm_api.ICCMApi
    public void addExtension(String str, C29525a aVar) {
        C39234b.m154731a().mo143068c().mo143059a(str, aVar);
    }

    @Override // com.ss.android.lark.ccm_api.ICCMApi
    public void createDocPageExtension(String str, AppCompatActivity appCompatActivity) {
        C39234b.m154731a().mo143068c().mo143058a(str, appCompatActivity);
    }

    @Override // com.ss.android.lark.ccm_api.ICCMApi
    public boolean dispatchDocPageKeyEvent(String str, KeyEvent keyEvent) {
        return C39234b.m154731a().mo143068c().mo143060a(str, keyEvent);
    }

    @Override // com.ss.android.lark.ccm_api.ICCMApi
    public boolean dispatchDocPageTouchEvent(String str, MotionEvent motionEvent) {
        return C39234b.m154731a().mo143068c().mo143061a(str, motionEvent);
    }

    @Override // com.ss.android.lark.ccm_api.ICCMApi
    public <T> T findExtension(String str, Class<T> cls) {
        return (T) C39234b.m154731a().mo143068c().mo143053a(str, cls);
    }

    @Override // com.ss.android.lark.ccm_api.ICCMApi
    public int getDocIcon(DocType docType, String str) {
        return C39234b.m154731a().mo143067b().mo143074a(docType, str);
    }

    @Override // com.ss.android.lark.ccm_api.ICCMApi
    public int getDocInlineIcon(DocType docType, int i) {
        return C39234b.m154731a().mo143067b().mo143073a(docType, i);
    }

    @Override // com.ss.android.lark.ccm_api.ICCMApi
    public IPlusItem getDocSendKBPlusItem(Context context, Chat chat) {
        return C39234b.m154731a().mo143067b().mo143075a(context, chat);
    }

    @Override // com.ss.android.lark.ccm_api.ICCMApi
    public String getDocUrlWithFromQuery(String str, String str2) {
        return C39234b.m154731a().mo143067b().mo143101b(str, str2);
    }

    @Override // com.ss.android.lark.ccm_api.ICCMApi
    public String getDocUrlWithId(String str, String str2) {
        return C39234b.m154731a().mo143067b().mo143077a(str, str2);
    }

    @Override // com.ss.android.lark.ccm_api.ICCMApi
    public String getDocUrlWithParams(String str, Map<String, String> map) {
        return C39234b.m154731a().mo143067b().mo143102b(str, map);
    }

    @Override // com.ss.android.lark.ccm_api.ICCMApi
    public String getDocUrlWithQuerys(String str, Map<String, String> map) {
        return C39234b.m154731a().mo143067b().mo143109c(str, map);
    }

    @Override // com.ss.android.lark.ccm_api.ICCMApi
    public IPlusItem getSendKBPlugin(Context context, Chat chat) {
        return C39234b.m154731a().mo143067b().mo143075a(context, chat);
    }

    @Override // com.ss.android.lark.ccm_api.ICCMApi
    public int getWikiIcon(DocType docType, String str) {
        return C39234b.m154731a().mo143067b().mo143099b(docType, str);
    }

    @Override // com.ss.android.lark.ccm_api.ICCMApi
    public void onConfigurationChanged(String str, Configuration configuration) {
        C39234b.m154731a().mo143068c().mo143057a(str, configuration);
    }

    @Override // com.ss.android.lark.ccm_api.ICCMApi
    public boolean open(String str, Map<String, String> map) {
        return C39234b.m154731a().mo143067b().mo143097a(str, map);
    }

    @Override // com.ss.android.lark.ccm_api.ICCMApi
    public void openFileReader(FileClickModel fileClickModel, String str) {
        C39234b.m154731a().mo143067b().mo143084a(fileClickModel, str);
    }

    @Override // com.ss.android.lark.ccm_api.ICCMApi
    public void preloadDocPage(String str, Context context) {
        C39234b.m154731a().mo143068c().mo143056a(str, context);
    }

    @Override // com.ss.android.lark.ccm_api.ICCMApi
    public void pullDocFeed(String str, IGetDataCallback<DocFeed> iGetDataCallback) {
        C39234b.m154731a().mo143067b().mo143089a(str, iGetDataCallback);
    }

    @Override // com.ss.android.lark.ccm_api.ICCMApi
    public void reloadTabPageSpecUrl(AbstractC44552i iVar, boolean z) {
        C39234b.m154731a().mo143067b().mo143088a(iVar, z);
    }

    @Override // com.ss.android.lark.ccm_api.ICCMApi
    public boolean removeExtension(String str, C29525a aVar) {
        return C39234b.m154731a().mo143068c().mo143063b(str, aVar);
    }

    @Override // com.ss.android.lark.ccm_api.ICCMApi
    public boolean startDriveSDKActivity(Context context, C7925a aVar) {
        return C39234b.m154731a().mo143067b().mo143092a(context, aVar);
    }

    @Override // com.ss.android.lark.ccm_api.ICCMApi
    public void convertDocToken(String str, final IGetDataCallback<ICCMApi.C32801a> iGetDataCallback) {
        C39234b.m154731a().mo143067b().mo143107b(str, new IGetDataCallback<DocConvertToken>() {
            /* class com.ss.android.lark.integrator.ccm.CCMApiImpl.C392271 */

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                IGetDataCallback iGetDataCallback = iGetDataCallback;
                if (iGetDataCallback != null) {
                    iGetDataCallback.onError(errorResult);
                }
            }

            /* renamed from: a */
            public void onSuccess(DocConvertToken docConvertToken) {
                ICCMApi.C32801a aVar = new ICCMApi.C32801a();
                aVar.f84174a = docConvertToken.getToken();
                aVar.f84175b = docConvertToken.getChatToken();
                IGetDataCallback iGetDataCallback = iGetDataCallback;
                if (iGetDataCallback != null) {
                    iGetDataCallback.onSuccess(aVar);
                }
            }
        });
    }

    @Override // com.ss.android.lark.ccm_api.ICCMApi
    public int getDocIcon(int i, String str) {
        return C39234b.m154731a().mo143067b().mo143074a(DocType.forNumber(i), str);
    }

    @Override // com.ss.android.lark.ccm_api.ICCMApi
    public int getWikiIcon(int i, String str) {
        return C39234b.m154731a().mo143067b().mo143099b(DocType.forNumber(i), str);
    }

    @Override // com.ss.android.lark.ccm_api.ICCMApi
    public void onAppStatusConfigurationChanged(Application application, Configuration configuration) {
        AbstractC4434t a = C39234b.m154731a().mo143066a();
        if (a != null) {
            a.mo17137d().mo17020a(application, configuration);
        }
    }

    @Override // com.ss.android.lark.ccm_api.ICCMApi
    public DocResult parseDocResultFromPb(String str, C14928Entity entity) {
        return C39234b.m154731a().mo143067b().mo143119i().mo31150a(str, entity);
    }

    @Override // com.ss.android.lark.ccm_api.ICCMApi
    public void preloadDocSdk(Context context, int i) {
        C39242e b = C39234b.m154731a().mo143067b();
        if (b != null) {
            b.mo143080a(LarkContext.getApplication(), i);
        }
    }

    private static String appendQuery(String str, String str2) {
        URI uri;
        try {
            URI uri2 = new URI(str);
            String query = uri2.getQuery();
            if (query != null) {
                str2 = query + ContainerUtils.FIELD_DELIMITER + str2;
            }
            uri = new URI(uri2.getScheme(), uri2.getAuthority(), uri2.getPath(), str2, uri2.getFragment());
        } catch (Exception e) {
            Log.m165383e("CCMApiImpl", "add query error:" + e);
            uri = null;
        }
        if (uri != null) {
            return uri.toString();
        }
        return str;
    }

    @Override // com.ss.android.lark.ccm_api.ICCMApi
    public String getCCMInnerFilePath(Context context, Biz biz, String str) {
        return CCMStorage.m21715b(context, biz, str);
    }

    @Override // com.ss.android.lark.ccm_api.ICCMApi
    public void createDocFeed(String str, DocType docType, IGetDataCallback<C36836a> iGetDataCallback) {
        C39234b.m154731a().mo143067b().mo143090a(str, docType, iGetDataCallback);
    }

    @Override // com.ss.android.lark.ccm_api.ICCMApi
    public AbstractC44552i createDocTabPageSpec(Context context, AbstractC44548e eVar, ITitleController iTitleController) {
        return C39234b.m154731a().mo143067b().mo143076a(context, eVar, iTitleController);
    }

    @Override // com.ss.android.lark.ccm_api.ICCMApi
    public AbstractC44552i getWikiTabPageSpec(Context context, AbstractC44548e eVar, ITitleController iTitleController) {
        return WikiModuleProvider.m154718a().mo143045a(context, eVar, iTitleController);
    }

    @Override // com.ss.android.lark.ccm_api.ICCMApi
    public void doDocPermAuthBeforeChatP2pToGroup(Activity activity, Map<String, Map<String, DocResult>> map, final ICCMApi.AbstractC32802b bVar) {
        C39234b.m154731a().mo143067b().mo143082a(activity, map, new AbstractC8084c() {
            /* class com.ss.android.lark.integrator.ccm.CCMApiImpl.C392293 */

            @Override // com.bytedance.ee.bear.lark.selector.auth.AbstractC8084c
            /* renamed from: a */
            public void mo31233a() {
                ICCMApi.AbstractC32802b bVar = bVar;
                if (bVar != null) {
                    bVar.mo120920a();
                }
            }

            @Override // com.bytedance.ee.bear.lark.selector.auth.AbstractC8084c
            /* renamed from: b */
            public void mo31235b() {
                ICCMApi.AbstractC32802b bVar = bVar;
                if (bVar != null) {
                    bVar.mo120922b();
                }
            }

            @Override // com.bytedance.ee.bear.lark.selector.auth.AbstractC8084c
            /* renamed from: a */
            public void mo31234a(Map<String, Map<String, DocPermPair.PermType>> map) {
                ICCMApi.AbstractC32802b bVar = bVar;
                if (bVar != null) {
                    bVar.mo120921a(map);
                }
            }
        });
    }

    @Override // com.ss.android.lark.ccm_api.ICCMApi
    public void jumpSearchDocs(String str, String str2, String str3) {
        C39234b.m154731a().mo143066a().mo17142i().mo17051b(str, "", str3);
    }

    @Override // com.ss.android.lark.ccm_api.ICCMApi
    public boolean open(String str, String str2, Map<String, String> map) {
        C39242e b = C39234b.m154731a().mo143067b();
        if (b != null) {
            return b.mo143096a(str, str2, map);
        }
        return false;
    }

    @Override // com.ss.android.lark.ccm_api.ICCMApi
    public void onDocPageActivityResult(String str, int i, int i2, Intent intent) {
        C39234b.m154731a().mo143068c().mo143055a(str, i, i2, intent);
    }

    @Override // com.ss.android.lark.ccm_api.ICCMApi
    public Map<String, String> getDocArgsMessage(boolean z, boolean z2, boolean z3, String str) {
        return new C32804a().mo120923a("message").mo120924a(z).mo120927b(z2).mo120928c(z3).mo120926b(str).mo120925a();
    }

    @Override // com.ss.android.lark.ccm_api.ICCMApi
    public void getDrivePreviewUrl(String str, String str2, int i, IGetDataCallback<String> iGetDataCallback) {
        C38777a a = DriveModuleProvider.f100541a.mo143050a();
        if (a != null) {
            a.mo142136b().mo142140a(str, str2, i, iGetDataCallback);
        }
    }

    @Override // com.ss.android.lark.ccm_api.ICCMApi
    public void getDrivePreviewUrl(String str, String str2, Message.SourceType sourceType, IGetDataCallback<String> iGetDataCallback) {
        int i;
        C38777a a = DriveModuleProvider.f100541a.mo143050a();
        if (a != null) {
            AbstractC38781a b = a.mo142136b();
            if (sourceType == null) {
                i = Message.SourceType.TYPE_FROM_MESSAGE.getNumber();
            } else {
                i = sourceType.getNumber();
            }
            b.mo142140a(str, str2, i, iGetDataCallback);
        }
    }

    @Override // com.ss.android.lark.ccm_api.ICCMApi
    public boolean open(Context context, String str, String str2, Map<String, String> map) {
        C39242e b = C39234b.m154731a().mo143067b();
        if (b != null) {
            return b.mo143094a(context, str, str2, map);
        }
        return false;
    }

    @Override // com.ss.android.lark.ccm_api.ICCMApi
    public String driveDownloadNormal(String str, String str2, int i, boolean z, AbstractC5138b.AbstractC5139a aVar) {
        return C39234b.m154731a().mo143066a().mo17145l().mo17064a(str, str2, i, z, aVar);
    }

    @Override // com.ss.android.lark.ccm_api.ICCMApi
    public String driveUpload(Uri uri, String str, String str2, String str3, AbstractC5138b.AbstractC5140b bVar) {
        return C39234b.m154731a().mo143066a().mo17145l().mo17063a(uri, str, str2, str3, bVar);
    }

    @Override // com.ss.android.lark.ccm_api.ICCMApi
    public boolean open(Context context, String str, int i, int i2, Map<String, String> map) {
        return C39234b.m154731a().mo143067b().mo143093a(context, str, i, i2, map);
    }

    @Override // com.ss.android.lark.ccm_api.ICCMApi
    public void saveToNutStore(String str, String str2, String str3, int i, IGetDataCallback<String> iGetDataCallback) {
        DriveModuleProvider.f100541a.mo143050a().mo142136b().mo142141a(str, str2, str3, i, iGetDataCallback);
    }

    @Override // com.ss.android.lark.ccm_api.ICCMApi
    public String driveUpload(String str, String str2, String str3, String str4, AbstractC5138b.AbstractC5140b bVar) {
        return C39234b.m154731a().mo143066a().mo17145l().mo17065a(str, str2, str3, str4, bVar);
    }

    @Override // com.ss.android.lark.ccm_api.ICCMApi
    public void saveToNutStore(String str, String str2, String str3, Message.SourceType sourceType, IGetDataCallback<String> iGetDataCallback) {
        int i;
        C38777a a = DriveModuleProvider.f100541a.mo143050a();
        if (a != null) {
            AbstractC38781a b = a.mo142136b();
            if (sourceType == null) {
                i = Message.SourceType.TYPE_FROM_MESSAGE.getNumber();
            } else {
                i = sourceType.getNumber();
            }
            b.mo142141a(str, str2, str3, i, iGetDataCallback);
        }
    }

    @Override // com.ss.android.lark.ccm_api.ICCMApi
    public String driveDownload(String str, String str2, String str3, String str4, int i, AbstractC5138b.AbstractC5139a aVar) {
        return C39234b.m154731a().mo143066a().mo17145l().mo17062a().mo20423a(str, str2, str3, str4, i, aVar);
    }

    @Override // com.ss.android.lark.ccm_api.ICCMApi
    public void goDocsSelector(Context context, C36516a aVar, int i, String str, int i2, String str2) {
        C39234b.m154731a().mo143067b().mo143081a(context, i, str, i2, str2);
    }

    @Override // com.ss.android.lark.ccm_api.ICCMApi
    public void startDocSelectActivity(Activity activity, C36516a aVar, int i, int i2, String str, String str2) {
        C39234b.m154731a().mo143067b().mo143081a(activity, i, str, i2, str2);
    }
}
