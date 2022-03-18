package com.tt.miniapphost.host;

import android.app.Activity;
import android.app.Application;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.ImageView;
import com.bytedance.ee.bear.atfinder.AbstractC4272g;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.lark.infra.network.p628c.p629a.C12824b;
import com.bytedance.ee.lark.infra.network.p628c.p629a.C12825c;
import com.bytedance.ee.lark.infra.network.p628c.p629a.C12827e;
import com.bytedance.ee.lark.infra.network.p628c.p629a.C12830f;
import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.bytedance.ee.larkbrand.permission.AbstractC13298i;
import com.he.loader.SettingsProvider;
import com.larksuite.suite.R;
import com.tt.frontendapiinterface.IBaseRender;
import com.tt.miniapp.component.nativeview.AbstractC65886f;
import com.tt.miniapp.maplocate.AbstractC66485c;
import com.tt.miniapp.permission.C66578b;
import com.tt.miniapp.titlemenu.item.IMenuItem;
import com.tt.miniapp.view.webcore.AbstractC67282j;
import com.tt.miniapp.view.webcore.C67231a;
import com.tt.miniapp.view.webcore.C67257d;
import com.tt.miniapphost.AbstractC67550j;
import com.tt.miniapphost.AppbrandContext;
import com.tt.miniapphost.C67475d;
import com.tt.miniapphost.data.ContextSingletonInstance;
import com.tt.miniapphost.entity.AppLaunchInfo;
import com.tt.miniapphost.entity.C67521a;
import com.tt.miniapphost.entity.C67524d;
import com.tt.miniapphost.entity.C67525e;
import com.tt.miniapphost.entity.C67526f;
import com.tt.miniapphost.entity.C67531h;
import com.tt.miniapphost.entity.C67537k;
import com.tt.miniapphost.entity.DisableStateEntity;
import com.tt.miniapphost.p3371e.C67498a;
import com.tt.miniapphost.p3373f.AbstractC67539a;
import com.tt.miniapphost.p3373f.AbstractC67540b;
import com.tt.miniapphost.process.p3378d.AbstractC67570a;
import com.tt.miniapphost.process.p3378d.AbstractC67571b;
import com.tt.miniapphost.util.C67590h;
import com.tt.miniapphost.util.DebugUtil;
import com.tt.miniapphost.util.TimeMeter;
import com.tt.option.AbstractC67597b;
import com.tt.option.C67600c;
import com.tt.option.C67606d;
import com.tt.option.ext.AbstractC67622h;
import com.tt.option.ext.AbstractC67626k;
import com.tt.option.p3380a.AbstractC67594a;
import com.tt.option.p3380a.AbstractC67595b;
import com.tt.option.p3382c.C67602b;
import com.tt.option.p3388i.AbstractC67636a;
import com.tt.option.p3389j.AbstractC67643b;
import com.tt.option.p3389j.AbstractC67645c;
import com.tt.option.p3390k.AbstractC67648c;
import com.tt.option.p3391l.AbstractC67653e;
import com.tt.option.p3392m.AbstractC67655b;
import com.tt.option.p3394o.C67663c;
import com.tt.option.p3398s.AbstractC67675b;
import com.tt.option.p3399t.AbstractC67687c;
import com.tt.option.previewImage.AbstractC67668a;
import com.tt.option.previewImage.ImageRequest;
import com.tt.option.share.AbstractC67678b;
import com.tt.option.share.AbstractC67681d;
import com.tt.option.share.AbstractC67682e;
import com.tt.option.share.AbstractC67683f;
import com.tt.option.share.AbstractC67684g;
import com.tt.option.share.ShareInfoModel;
import com.tt.option.ui.HostOptionUiDepend;
import com.tt.p3255a.AbstractC65677b;
import com.tt.p3255a.C65678c;
import com.tt.p3256b.AbstractC65679a;
import com.tt.refer.p3400a.p3408f.p3409a.AbstractC67728b;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

public class HostDependManager extends C67606d implements AbstractC65677b, AbstractC67597b {
    private AbstractC65677b hostEssentialDepend;
    private C67600c hostOptionDependRegister = new C67600c();

    public AbstractC65677b getHostEssentialDepend() {
        return this.hostEssentialDepend;
    }

    public static HostDependManager getInst() {
        return ContextSingletonInstance.getInstance().hostDependManager;
    }

    @Override // com.tt.option.p3384e.AbstractC67614b
    public List<AbstractC67570a> createAsyncHostDataHandlerList() {
        return this.hostOptionDependRegister.mo234828d().createAsyncHostDataHandlerList();
    }

    @Override // com.tt.option.p3384e.AbstractC67614b
    public List<AbstractC67728b> createAsyncHostDataHandlerV2List() {
        return this.hostOptionDependRegister.mo234828d().createAsyncHostDataHandlerV2List();
    }

    @Override // com.tt.option.ext.AbstractC67622h
    public AbstractC67622h.AbstractC67623a createExtHandler() {
        return this.hostOptionDependRegister.mo234804a().createExtHandler();
    }

    @Override // com.tt.option.p3387h.AbstractC67635b
    public AppBrandLogger.ILogger createLogger() {
        return this.hostOptionDependRegister.mo234829e().createLogger();
    }

    @Override // com.tt.option.ext.AbstractC67626k
    public AbstractC67626k.AbstractC67627a createNativeView() {
        return this.hostOptionDependRegister.mo234827c().createNativeView();
    }

    @Override // com.tt.option.p3384e.AbstractC67614b
    public List<AbstractC67571b> createSyncHostDataHandlerList() {
        return this.hostOptionDependRegister.mo234828d().createSyncHostDataHandlerList();
    }

    @Override // com.tt.option.p3391l.AbstractC67651c
    public C67498a.AbstractC67499a getEnsure() {
        return this.hostOptionDependRegister.mo234830f().getEnsure();
    }

    @Override // com.tt.option.p3386g.AbstractC67632b
    public Locale getInitLocale() {
        return this.hostOptionDependRegister.mo234802B().getInitLocale();
    }

    @Override // com.tt.option.p3383d.AbstractC67612b
    public String getPrefixPath() {
        return this.hostOptionDependRegister.mo234842r().getPrefixPath();
    }

    @Override // com.tt.option.p3383d.AbstractC67612b
    public String getSpPrefixPath() {
        return this.hostOptionDependRegister.mo234842r().getSpPrefixPath();
    }

    @Override // com.tt.option.ui.HostOptionUiDepend
    public void hideToast() {
        this.hostOptionDependRegister.mo234835k().hideToast();
    }

    @Override // com.tt.option.ui.HostOptionUiDepend
    public void initNativeUIParams() {
        this.hostOptionDependRegister.mo234835k().initNativeUIParams();
    }

    @Override // com.tt.option.p3381b.AbstractC67599b
    public boolean isDesktop() {
        return this.hostOptionDependRegister.mo234803C().isDesktop();
    }

    @Override // com.tt.option.p3386g.AbstractC67632b
    public boolean isEnableAppBundleMode() {
        return this.hostOptionDependRegister.mo234802B().isEnableAppBundleMode();
    }

    @Override // com.tt.option.p3386g.AbstractC67632b
    public boolean isEnableI18nNetRequest() {
        return this.hostOptionDependRegister.mo234802B().isEnableI18nNetRequest();
    }

    public boolean isHostOptionShareDialogDependEnable() {
        if (this.hostOptionDependRegister.mo234846v() != null) {
            return true;
        }
        return false;
    }

    @Override // com.tt.option.share.AbstractC67678b
    public ShareInfoModel obtainShareInfo() {
        return this.hostOptionDependRegister.mo234837m().obtainShareInfo();
    }

    @Override // com.tt.option.share.AbstractC67678b
    public AbstractC67678b.AbstractC67679a obtainShareInfoCallback() {
        return this.hostOptionDependRegister.mo234837m().obtainShareInfoCallback();
    }

    @Override // com.tt.option.p3386g.AbstractC67632b
    public String replaceOpenApiDomain() {
        return this.hostOptionDependRegister.mo234802B().replaceOpenApiDomain();
    }

    @Override // com.tt.option.p3396q.AbstractC67670b
    public boolean supportCustomerService() {
        return this.hostOptionDependRegister.mo234834j().supportCustomerService();
    }

    @Override // com.tt.option.C67606d
    public C67606d.AbstractC67609b createBlockLoadingCallback() {
        if (this.hostOptionDependRegister.mo234840p() != null) {
            return this.hostOptionDependRegister.mo234840p().createBlockLoadingCallback();
        }
        return super.createBlockLoadingCallback();
    }

    @Override // com.tt.miniapp.maplocate.AbstractC66484b
    public AbstractC67636a createMapInstance() {
        if (this.hostOptionDependRegister.mo234843s() != null) {
            return this.hostOptionDependRegister.mo234843s().createMapInstance();
        }
        return null;
    }

    @Override // com.tt.option.p3382c.AbstractC67605c
    public void firstFavoriteAction() {
        if (this.hostOptionDependRegister.mo234845u() != null) {
            this.hostOptionDependRegister.mo234845u().firstFavoriteAction();
        }
    }

    @Override // com.tt.option.C67606d
    public List<AppLaunchInfo> getAppLaunchInfo() {
        if (this.hostOptionDependRegister.mo234840p() != null) {
            return this.hostOptionDependRegister.mo234840p().getAppLaunchInfo();
        }
        return null;
    }

    @Override // com.tt.option.p3395p.AbstractC67667b
    public String getLoadSoVersion() {
        if (this.hostOptionDependRegister.mo234847w() != null) {
            return this.hostOptionDependRegister.mo234847w().getLoadSoVersion();
        }
        return "";
    }

    @Override // com.tt.option.p3395p.AbstractC67667b
    public String getLocalSoVersion() {
        if (this.hostOptionDependRegister.mo234847w() != null) {
            return this.hostOptionDependRegister.mo234847w().getLocalSoVersion();
        }
        return "";
    }

    @Override // com.tt.option.C67606d
    public int getMiniAppProcessCount() {
        if (this.hostOptionDependRegister.mo234840p() != null) {
            return this.hostOptionDependRegister.mo234840p().getMiniAppProcessCount();
        }
        return super.getMiniAppProcessCount();
    }

    @Override // com.tt.option.C67606d
    public boolean getPayEnable() {
        if (this.hostOptionDependRegister.mo234840p() != null) {
            return this.hostOptionDependRegister.mo234840p().getPayEnable();
        }
        return super.getPayEnable();
    }

    @Override // com.tt.option.C67606d
    public List<AppLaunchInfo> getRecommendList() {
        if (this.hostOptionDependRegister.mo234840p() != null) {
            return this.hostOptionDependRegister.mo234840p().getRecommendList();
        }
        return null;
    }

    @Override // com.tt.option.C67606d
    public SettingsProvider getSettingsProvider() {
        if (this.hostOptionDependRegister.mo234840p() != null) {
            return this.hostOptionDependRegister.mo234840p().getSettingsProvider();
        }
        return super.getSettingsProvider();
    }

    @Override // com.tt.option.C67606d
    public long getSettingsRequestDelayTime() {
        if (this.hostOptionDependRegister.mo234840p() != null) {
            return this.hostOptionDependRegister.mo234840p().getSettingsRequestDelayTime();
        }
        return 3000;
    }

    @Override // com.tt.option.p3395p.AbstractC67667b
    public String getTTWebViewVersion() {
        if (this.hostOptionDependRegister.mo234847w() != null) {
            return this.hostOptionDependRegister.mo234847w().getTTWebViewVersion();
        }
        return null;
    }

    @Override // com.tt.option.p3385f.AbstractC67630b
    public String getTenantId() {
        if (this.hostOptionDependRegister.mo234848x() != null) {
            return this.hostOptionDependRegister.mo234848x().getTenantId();
        }
        return null;
    }

    @Override // com.tt.option.C67606d
    public JSONObject getTmaFeatureConfig() {
        if (this.hostOptionDependRegister.mo234840p() != null) {
            return this.hostOptionDependRegister.mo234840p().getTmaFeatureConfig();
        }
        return null;
    }

    @Override // com.tt.option.p3385f.AbstractC67630b
    public String getUserId() {
        if (this.hostOptionDependRegister.mo234848x() != null) {
            return this.hostOptionDependRegister.mo234848x().getUserId();
        }
        return null;
    }

    @Override // com.tt.option.C67606d
    public boolean isPreRenderApp() {
        if (this.hostOptionDependRegister.mo234840p() != null) {
            return this.hostOptionDependRegister.mo234840p().isPreRenderApp();
        }
        return super.isPreRenderApp();
    }

    @Override // com.tt.option.C67606d
    public boolean isPreloadSp() {
        if (this.hostOptionDependRegister.mo234840p() != null) {
            return this.hostOptionDependRegister.mo234840p().isPreloadSp();
        }
        return super.isPreloadSp();
    }

    @Override // com.tt.option.p3395p.AbstractC67667b
    public boolean isTTWebView() {
        if (this.hostOptionDependRegister.mo234847w() != null) {
            return this.hostOptionDependRegister.mo234847w().isTTWebView();
        }
        return false;
    }

    @Override // com.tt.option.C67606d
    public boolean needSettingTitleMenuItem() {
        if (this.hostOptionDependRegister.mo234840p() != null) {
            return this.hostOptionDependRegister.mo234840p().needSettingTitleMenuItem();
        }
        return super.needSettingTitleMenuItem();
    }

    @Override // com.tt.option.p3395p.AbstractC67667b
    public boolean shouldCheckTTWebview() {
        if (this.hostOptionDependRegister.mo234847w() != null) {
            return this.hostOptionDependRegister.mo234847w().shouldCheckTTWebview();
        }
        return false;
    }

    @Override // com.tt.option.p3395p.AbstractC67667b
    public boolean shouldDownloadIn4G() {
        if (this.hostOptionDependRegister.mo234847w() != null) {
            return this.hostOptionDependRegister.mo234847w().shouldDownloadIn4G();
        }
        return false;
    }

    @Override // com.tt.option.p3381b.AbstractC67599b
    public void clearFocusWhenHideSoftKeyboard(IAppContext iAppContext) {
        this.hostOptionDependRegister.mo234803C().clearFocusWhenHideSoftKeyboard(iAppContext);
    }

    @Override // com.tt.option.p3392m.AbstractC67655b
    public C12827e convertMetaRequest(C12827e eVar) {
        return this.hostOptionDependRegister.mo234833i().convertMetaRequest(eVar);
    }

    @Override // com.tt.option.p3381b.AbstractC67599b
    public void convertMouseEvent(WebView webView) {
        this.hostOptionDependRegister.mo234803C().convertMouseEvent(webView);
    }

    @Override // com.tt.option.p3389j.AbstractC67643b
    public AbstractC67645c createChooseFileHandler(Activity activity) {
        return this.hostOptionDependRegister.mo234831g().createChooseFileHandler(activity);
    }

    @Override // com.tt.p3255a.AbstractC65677b
    public C67531h createInitParams(IAppContext iAppContext) {
        return getHostEssentialDepend().createInitParams(iAppContext);
    }

    @Override // com.tt.option.ext.AbstractC67625j
    public List<AbstractC67550j> createNativeModules(AppbrandContext appbrandContext) {
        return this.hostOptionDependRegister.mo234826b().createNativeModules(appbrandContext);
    }

    @Override // com.tt.option.p3390k.AbstractC67647b
    public List<AbstractC67648c> createTitleMenuItems(IAppContext iAppContext) {
        return this.hostOptionDependRegister.mo234832h().createTitleMenuItems(iAppContext);
    }

    @Override // com.tt.option.p3386g.AbstractC67632b
    public boolean doAppBundleSplitInstallAction(Context context) {
        return this.hostOptionDependRegister.mo234802B().doAppBundleSplitInstallAction(context);
    }

    @Override // com.tt.option.ui.HostOptionUiDepend
    public C67521a getAnchorConfig(String str) {
        return this.hostOptionDependRegister.mo234835k().getAnchorConfig(str);
    }

    @Override // com.tt.option.p3394o.AbstractC67662b
    public C67663c getPermissionCustomDialogMsgEntity(IAppContext iAppContext) {
        return this.hostOptionDependRegister.mo234839o().getPermissionCustomDialogMsgEntity(iAppContext);
    }

    @Override // com.tt.option.p3397r.AbstractC67672b
    public String getScene(String str) {
        return this.hostOptionDependRegister.mo234838n().getScene(str);
    }

    @Override // com.tt.option.p3394o.AbstractC67662b
    public List<C66578b.C66579a> getUserDefinableHostPermissionList(IAppContext iAppContext) {
        return this.hostOptionDependRegister.mo234839o().getUserDefinableHostPermissionList(iAppContext);
    }

    @Override // com.tt.option.ui.HostOptionUiDepend
    public void initFeignHostConfig(Context context) {
        this.hostOptionDependRegister.mo234835k().initFeignHostConfig(context);
    }

    @Override // com.tt.option.p3381b.AbstractC67599b
    public String interceptRpx2Px(String str) {
        return this.hostOptionDependRegister.mo234803C().interceptRpx2Px(str);
    }

    @Override // com.tt.option.p3381b.AbstractC67599b
    public boolean shouldInterceptRpx2Px(String str) {
        return this.hostOptionDependRegister.mo234803C().shouldInterceptRpx2Px(str);
    }

    @Override // com.tt.option.p3394o.AbstractC67662b
    public void syncPermissionToService(IAppContext iAppContext) {
        this.hostOptionDependRegister.mo234839o().syncPermissionToService(iAppContext);
    }

    @Override // com.tt.option.C67606d
    public boolean bindPhoneNumber(C67606d.AbstractC67608a aVar) {
        if (this.hostOptionDependRegister.mo234840p() != null) {
            return this.hostOptionDependRegister.mo234840p().bindPhoneNumber(aVar);
        }
        return false;
    }

    @Override // com.tt.option.C67606d
    public DisableStateEntity checkExtraAppbrandDisableState(int i) {
        if (this.hostOptionDependRegister.mo234840p() != null) {
            return this.hostOptionDependRegister.mo234840p().checkExtraAppbrandDisableState(i);
        }
        return null;
    }

    @Override // com.tt.option.p3395p.AbstractC67667b
    public void cleanTTWebViewExtension(int i) {
        if (this.hostOptionDependRegister.mo234847w() != null) {
            this.hostOptionDependRegister.mo234847w().cleanTTWebViewExtension(i);
        }
    }

    @Override // com.tt.miniapp.maplocate.AbstractC66484b
    public AbstractC66485c createLocateInstance(Context context) {
        if (this.hostOptionDependRegister.mo234843s() != null) {
            return this.hostOptionDependRegister.mo234843s().createLocateInstance(context);
        }
        return null;
    }

    @Override // com.tt.option.ext.AbstractC67624i
    public boolean enableTTRender(View view) {
        if (this.hostOptionDependRegister.mo234850z() != null) {
            return this.hostOptionDependRegister.mo234850z().enableTTRender(view);
        }
        return true;
    }

    @Override // com.tt.option.p3395p.AbstractC67667b
    public void fetchWebviewCore(boolean z) {
        if (this.hostOptionDependRegister.mo234847w() != null) {
            this.hostOptionDependRegister.mo234847w().fetchWebviewCore(z);
        }
    }

    @Override // com.tt.option.C67606d
    public double getBlankRate(String str) {
        if (this.hostOptionDependRegister.mo234840p() != null) {
            return this.hostOptionDependRegister.mo234840p().getBlankRate(str);
        }
        return super.getBlankRate(str);
    }

    @Override // com.tt.option.C67606d
    public boolean getFeatureGating(String str) {
        if (this.hostOptionDependRegister.mo234840p() != null) {
            return this.hostOptionDependRegister.mo234840p().getFeatureGating(str);
        }
        return super.getFeatureGating(str);
    }

    @Override // com.tt.option.p3382c.AbstractC67605c
    public C67602b getHostCustomFavoriteEntity(Context context) {
        if (this.hostOptionDependRegister.mo234845u() != null) {
            return this.hostOptionDependRegister.mo234845u().getHostCustomFavoriteEntity(context);
        }
        return new C67602b.C67604a(context).mo234868a();
    }

    @Override // com.tt.option.C67606d
    public AbstractC65679a getMiniAppLifeCycleInstance(IAppContext iAppContext) {
        if (this.hostOptionDependRegister.mo234840p() != null) {
            return this.hostOptionDependRegister.mo234840p().getMiniAppLifeCycleInstance(iAppContext);
        }
        return super.getMiniAppLifeCycleInstance(iAppContext);
    }

    @Override // com.tt.option.p3381b.AbstractC67599b
    public byte[] interceptRpx2Px(byte[] bArr) {
        return this.hostOptionDependRegister.mo234803C().interceptRpx2Px(bArr);
    }

    @Override // com.tt.option.C67606d
    public boolean isSlideActivity(String str) {
        if (this.hostOptionDependRegister.mo234840p() != null) {
            return this.hostOptionDependRegister.mo234840p().isSlideActivity(str);
        }
        return false;
    }

    @Override // com.tt.option.p3395p.AbstractC67667b
    public boolean isTTRenderInBrowserEnabled(int i) {
        if (this.hostOptionDependRegister.mo234847w() != null) {
            return this.hostOptionDependRegister.mo234847w().isTTRenderInBrowserEnabled(i);
        }
        return false;
    }

    @Override // com.tt.option.C67606d
    public void onCreateWebView(WebView webView) {
        if (this.hostOptionDependRegister.mo234840p() != null) {
            this.hostOptionDependRegister.mo234840p().onCreateWebView(webView);
        }
    }

    @Override // com.tt.option.C67606d
    public String replaceProcessName(String str) {
        if (this.hostOptionDependRegister.mo234840p() != null) {
            return this.hostOptionDependRegister.mo234840p().replaceProcessName(str);
        }
        return super.replaceProcessName(str);
    }

    @Override // com.tt.option.p3395p.AbstractC67667b
    public void setPerformanceListener(AbstractC67282j.AbstractC67283a aVar) {
        if (this.hostOptionDependRegister.mo234847w() != null) {
            this.hostOptionDependRegister.mo234847w().setPerformanceListener(aVar);
        }
    }

    @Override // com.tt.option.C67606d
    public void syncWebViewLoginCookie(String str) {
        if (this.hostOptionDependRegister.mo234840p() != null) {
            this.hostOptionDependRegister.mo234840p().syncWebViewLoginCookie(str);
        }
    }

    @Override // com.tt.option.ext.AbstractC67624i
    public boolean enableTTRender(String str) {
        if (this.hostOptionDependRegister.mo234850z() != null) {
            return this.hostOptionDependRegister.mo234850z().enableTTRender(str);
        }
        return true;
    }

    @Override // com.tt.p3255a.AbstractC65677b
    public void loadImage(Context context, C65678c cVar) {
        getHostEssentialDepend().loadImage(context, cVar);
    }

    public void setHostDepend(AbstractC65677b bVar, C67600c cVar) {
        this.hostEssentialDepend = bVar;
        if (cVar != null) {
            this.hostOptionDependRegister = cVar;
        }
    }

    @Override // com.tt.p3255a.AbstractC65677b
    public void showShareDialog(Activity activity, AbstractC67683f fVar) {
        getHostEssentialDepend().showShareDialog(activity, fVar);
    }

    @Override // com.tt.option.p3398s.AbstractC67675b
    public void checkSession(String str, AbstractC67675b.AbstractC67676a aVar) {
        this.hostOptionDependRegister.mo234844t().checkSession(str, aVar);
    }

    @Override // com.tt.option.ui.HostOptionUiDepend
    public Dialog getLoadingDialog(Activity activity, String str) {
        return this.hostOptionDependRegister.mo234835k().getLoadingDialog(activity, str);
    }

    @Override // com.tt.option.p3394o.AbstractC67662b
    public void getLocalScope(JSONObject jSONObject, IAppContext iAppContext) throws JSONException {
        this.hostOptionDependRegister.mo234839o().getLocalScope(jSONObject, iAppContext);
    }

    @Override // com.tt.option.p3381b.AbstractC67599b
    public int getScreenWidthForDesktop(Context context, IAppContext iAppContext) {
        return this.hostOptionDependRegister.mo234803C().getScreenWidthForDesktop(context, iAppContext);
    }

    @Override // com.tt.option.share.AbstractC67678b
    public void getShareToken(ShareInfoModel shareInfoModel, AbstractC67682e eVar) {
        this.hostOptionDependRegister.mo234837m().getShareToken(shareInfoModel, eVar);
    }

    @Override // com.tt.option.p3399t.AbstractC67686b
    public AbstractC67687c getVideoEditor(Context context, String str) {
        return this.hostOptionDependRegister.mo234849y().getVideoEditor(context, str);
    }

    @Override // com.tt.option.p3396q.AbstractC67670b
    public boolean handleAppbrandDisablePage(Context context, String str) {
        return this.hostOptionDependRegister.mo234834j().handleAppbrandDisablePage(context, str);
    }

    @Override // com.tt.option.p3396q.AbstractC67670b
    public boolean interceptOpenWebUrl(Context context, String str) {
        return this.hostOptionDependRegister.mo234834j().interceptOpenWebUrl(context, str);
    }

    @Override // com.tt.option.p3381b.AbstractC67599b
    public boolean interceptSetTitleBarMargin(Context context, View view) {
        return this.hostOptionDependRegister.mo234803C().interceptSetTitleBarMargin(context, view);
    }

    @Override // com.tt.option.p3396q.AbstractC67670b
    public boolean openCustomerService(Context context, String str) {
        return this.hostOptionDependRegister.mo234834j().openCustomerService(context, str);
    }

    @Override // com.tt.p3255a.AbstractC65677b
    public boolean openLoginActivity(Activity activity, HashMap<String, Object> hashMap) {
        return getHostEssentialDepend().openLoginActivity(activity, hashMap);
    }

    @Override // com.tt.option.p3396q.AbstractC67670b
    public boolean openProfile(Activity activity, String str) {
        return this.hostOptionDependRegister.mo234834j().openProfile(activity, str);
    }

    @Override // com.tt.option.p3396q.AbstractC67670b
    public boolean openSchema(Context context, String str) {
        return this.hostOptionDependRegister.mo234834j().openSchema(context, str);
    }

    @Override // com.tt.option.p3394o.AbstractC67662b
    public C66578b.C66579a permissionTypeToPermission(int i, IAppContext iAppContext) {
        return this.hostOptionDependRegister.mo234839o().permissionTypeToPermission(i, iAppContext);
    }

    @Override // com.tt.option.p3390k.AbstractC67647b
    public List<IMenuItem> replacesMenuItems(List<IMenuItem> list, IAppContext iAppContext) {
        return this.hostOptionDependRegister.mo234832h().replacesMenuItems(list, iAppContext);
    }

    @Override // com.tt.option.p3389j.AbstractC67643b
    public boolean scanCode(Activity activity, AbstractC67643b.AbstractC67644a aVar) {
        return this.hostOptionDependRegister.mo234831g().scanCode(activity, aVar);
    }

    @Override // com.tt.option.p3394o.AbstractC67662b
    public C66578b.C66579a scopeToBrandPermission(String str, IAppContext iAppContext) {
        return this.hostOptionDependRegister.mo234839o().scopeToBrandPermission(str, iAppContext);
    }

    @Override // com.tt.option.p3394o.AbstractC67662b
    public void setPermissionTime(int i, IAppContext iAppContext) {
        this.hostOptionDependRegister.mo234839o().setPermissionTime(i, iAppContext);
    }

    @Override // com.tt.option.p3394o.AbstractC67662b
    public boolean shouldFilterPermission(int i, IAppContext iAppContext) {
        return this.hostOptionDependRegister.mo234839o().shouldFilterPermission(i, iAppContext);
    }

    @Override // com.tt.option.p3396q.AbstractC67670b
    public boolean startMiniAppActivity(Context context, Intent intent) {
        return this.hostOptionDependRegister.mo234834j().startMiniAppActivity(context, intent);
    }

    @Override // com.tt.option.p3396q.AbstractC67670b
    public boolean startMiniAppService(Context context, Intent intent) {
        return this.hostOptionDependRegister.mo234834j().startMiniAppService(context, intent);
    }

    @Override // com.tt.option.p3395p.AbstractC67667b
    public void initTTWebViewExtension(WebView webView, int i) {
        if (this.hostOptionDependRegister.mo234847w() != null) {
            this.hostOptionDependRegister.mo234847w().initTTWebViewExtension(webView, i);
        }
    }

    @Override // com.tt.option.C67606d
    public void onWebViewComponentDestroyed(WebView webView, IAppContext iAppContext) {
        if (this.hostOptionDependRegister.mo234840p() != null) {
            this.hostOptionDependRegister.mo234840p().onWebViewComponentDestroyed(webView, iAppContext);
        }
    }

    @Override // com.tt.option.C67606d
    public List<AbstractC67648c> replaceMenuItems(List<AbstractC67648c> list, IAppContext iAppContext) {
        if (this.hostOptionDependRegister.mo234840p() != null) {
            return this.hostOptionDependRegister.mo234840p().replaceMenuItems(list, iAppContext);
        }
        return super.replaceMenuItems(list, iAppContext);
    }

    @Override // com.tt.option.p3395p.AbstractC67667b
    public void setPlatformLayerScrollListener(int i, AbstractC67282j.AbstractC67284b bVar) {
        if (this.hostOptionDependRegister.mo234847w() != null) {
            this.hostOptionDependRegister.mo234847w().setPlatformLayerScrollListener(i, bVar);
        }
    }

    @Override // com.tt.option.C67606d
    public boolean startAboutActivity(Activity activity, IAppContext iAppContext) {
        if (this.hostOptionDependRegister.mo234840p() != null) {
            return this.hostOptionDependRegister.mo234840p().startAboutActivity(activity, iAppContext);
        }
        return super.startAboutActivity(activity, iAppContext);
    }

    @Override // com.tt.option.p3394o.AbstractC67662b
    public void syncPermissionToService(IAppContext iAppContext, String str) {
        this.hostOptionDependRegister.mo234839o().syncPermissionToService(iAppContext, str);
    }

    @Override // com.tt.option.C67606d
    public boolean getFeatureGating(String str, boolean z) {
        if (this.hostOptionDependRegister.mo234840p() != null) {
            return this.hostOptionDependRegister.mo234840p().getFeatureGating(str, z);
        }
        return super.getFeatureGating(str, z);
    }

    @Override // com.tt.option.p3392m.AbstractC67655b
    public C12830f doGet(C12827e eVar, IAppContext iAppContext) {
        C12830f fVar;
        long currentMillis = TimeMeter.currentMillis();
        try {
            fVar = this.hostOptionDependRegister.mo234833i().doGet(eVar, iAppContext);
        } catch (Exception e) {
            AppBrandLogger.m52829e("HostDependManager", "doGet", e);
            AppBrandLogger.m52828d("HostDependManager", "doGetError");
            e.printStackTrace();
            C12830f fVar2 = new C12830f(iAppContext);
            fVar2.mo48460a(e.getClass() + ":" + e.getMessage());
            fVar2.mo48461a(e);
            if (DebugUtil.debug()) {
                Application applicationContext = AppbrandContext.getInst().getApplicationContext();
                showToast(applicationContext, null, C67590h.m263073a((int) R.string.microapp_m_network_request_failed) + e.getMessage(), 0, null);
            }
            fVar = fVar2;
        }
        if (fVar == null) {
            fVar = new C12830f(iAppContext);
            fVar.mo48460a("unknown net error");
        }
        C67475d.m262452a(eVar, fVar, TimeMeter.currentMillis() - currentMillis, iAppContext);
        return fVar;
    }

    @Override // com.tt.option.p3392m.AbstractC67655b
    public C12830f doPostBody(C12827e eVar, IAppContext iAppContext) {
        C12830f fVar;
        long currentMillis = TimeMeter.currentMillis();
        try {
            fVar = this.hostOptionDependRegister.mo234833i().doPostBody(eVar, iAppContext);
        } catch (Exception e) {
            AppBrandLogger.m52829e("HostDependManager", "doPostBody", e);
            C12830f fVar2 = new C12830f(iAppContext);
            fVar2.mo48460a(e.getClass() + ":" + e.getMessage());
            fVar2.mo48461a(e);
            if (DebugUtil.debug()) {
                Application applicationContext = AppbrandContext.getInst().getApplicationContext();
                showToast(applicationContext, null, C67590h.m263073a((int) R.string.microapp_m_network_request_failed) + e.getMessage(), 0, null);
            }
            fVar = fVar2;
        }
        if (fVar == null) {
            fVar = new C12830f(iAppContext);
            fVar.mo48460a("unknown net error");
        }
        C67475d.m262452a(eVar, fVar, TimeMeter.currentMillis() - currentMillis, iAppContext);
        return fVar;
    }

    @Override // com.tt.option.p3392m.AbstractC67655b
    public C12830f doPostUrlEncoded(C12827e eVar, IAppContext iAppContext) throws Exception {
        C12830f fVar;
        long currentMillis = TimeMeter.currentMillis();
        try {
            fVar = this.hostOptionDependRegister.mo234833i().doPostUrlEncoded(eVar, iAppContext);
        } catch (Exception e) {
            AppBrandLogger.m52829e("HostDependManager", "doPostUrlEncoded", e);
            C12830f fVar2 = new C12830f(iAppContext);
            fVar2.mo48460a(e.getClass() + ":" + e.getMessage());
            fVar2.mo48461a(e);
            if (DebugUtil.debug()) {
                Application applicationContext = AppbrandContext.getInst().getApplicationContext();
                showToast(applicationContext, null, "网络请求失败 " + e.getMessage(), 0, null);
            }
            fVar = fVar2;
        }
        if (fVar == null) {
            fVar = new C12830f(iAppContext);
            fVar.mo48460a("unknown net error");
        }
        C67475d.m262452a(eVar, fVar, TimeMeter.currentMillis() - currentMillis, iAppContext);
        return fVar;
    }

    @Override // com.tt.option.p3392m.AbstractC67655b
    public C12830f doRequest(C12827e eVar, IAppContext iAppContext) {
        C12830f fVar;
        try {
            fVar = this.hostOptionDependRegister.mo234833i().doRequest(eVar, iAppContext);
        } catch (Throwable th) {
            AppBrandLogger.m52829e("HostDependManager", "doRequest", th);
            C12830f fVar2 = new C12830f(iAppContext);
            fVar2.mo48460a(th.getClass() + ":" + th.getMessage());
            fVar2.mo48461a(th);
            if (DebugUtil.debug()) {
                Application applicationContext = AppbrandContext.getInst().getApplicationContext();
                showToast(applicationContext, null, C67590h.m263073a((int) R.string.microapp_m_network_request_failed) + th.getMessage(), 0, null);
            }
            fVar = fVar2;
        }
        if (fVar != null) {
            return fVar;
        }
        C12830f fVar3 = new C12830f(iAppContext);
        fVar3.mo48460a("unknown net error");
        return fVar3;
    }

    @Override // com.tt.option.p3392m.AbstractC67655b
    public C12830f postMultiPart(C12827e eVar, IAppContext iAppContext) throws Exception {
        C12830f fVar;
        long currentMillis = TimeMeter.currentMillis();
        try {
            fVar = this.hostOptionDependRegister.mo234833i().postMultiPart(eVar, iAppContext);
        } catch (Exception e) {
            AppBrandLogger.m52829e("HostDependManager", "postMultiPart", e);
            C12830f fVar2 = new C12830f(iAppContext);
            fVar2.mo48460a(e.getClass() + ":" + e.getMessage());
            fVar2.mo48461a(e);
            if (DebugUtil.debug()) {
                Application applicationContext = AppbrandContext.getInst().getApplicationContext();
                showToast(applicationContext, null, AppbrandContext.getInst().getApplicationContext().getResources().getString(R.string.microapp_m_network_request_failed) + e.getMessage(), 0, null);
            }
            fVar = fVar2;
        }
        if (fVar == null) {
            fVar = new C12830f(iAppContext);
            fVar.mo48460a("unknown net error");
        }
        C67475d.m262452a(eVar, fVar, TimeMeter.currentMillis() - currentMillis, iAppContext);
        return fVar;
    }

    @Override // com.tt.option.p3393n.AbstractC67660b
    public boolean chooseLocationActivity(IAppContext iAppContext, String str, int i) {
        return this.hostOptionDependRegister.mo234836l().chooseLocationActivity(iAppContext, str, i);
    }

    @Override // com.tt.option.p3380a.AbstractC67594a
    public AbstractC67595b createBottomBar(String str, String str2, AbstractC67595b.AbstractC67596a aVar) {
        AbstractC67594a q = this.hostOptionDependRegister.mo234841q();
        if (q != null) {
            return q.createBottomBar(str, str2, aVar);
        }
        return null;
    }

    @Override // com.tt.option.p3394o.AbstractC67662b
    public Set<C66578b.C66579a> filterNeedRequestPermission(String str, Set<C66578b.C66579a> set, IAppContext iAppContext) {
        return this.hostOptionDependRegister.mo234839o().filterNeedRequestPermission(str, set, iAppContext);
    }

    @Override // com.tt.option.p3381b.AbstractC67599b
    public int getScreenHeightForDesktop(Context context, int i, IAppContext iAppContext) {
        return this.hostOptionDependRegister.mo234803C().getScreenHeightForDesktop(context, i, iAppContext);
    }

    @Override // com.tt.option.share.AbstractC67678b
    public void getShareBaseInfo(String str, AbstractC67681d dVar, IAppContext iAppContext) {
        this.hostOptionDependRegister.mo234837m().getShareBaseInfo(str, dVar, iAppContext);
    }

    @Override // com.tt.option.p3389j.AbstractC67643b
    public C67524d handleActivityImageResult(int i, int i2, Intent intent) {
        return this.hostOptionDependRegister.mo234831g().handleActivityImageResult(i, i2, intent);
    }

    @Override // com.tt.p3255a.AbstractC65677b
    public boolean handleActivityLoginResult(int i, int i2, Intent intent) {
        return getHostEssentialDepend().handleActivityLoginResult(i, i2, intent);
    }

    @Override // com.tt.option.p3389j.AbstractC67643b
    public C67537k handleActivityScanResult(int i, int i2, Intent intent) {
        return this.hostOptionDependRegister.mo234831g().handleActivityScanResult(i, i2, intent);
    }

    @Override // com.tt.p3255a.AbstractC65677b
    public boolean handleActivityShareResult(int i, int i2, Intent intent) {
        return getHostEssentialDepend().handleActivityShareResult(i, i2, intent);
    }

    @Override // com.tt.option.p3389j.AbstractC67643b
    public C67526f handleActivityVideoResult(int i, int i2, Intent intent) {
        return this.hostOptionDependRegister.mo234831g().handleActivityVideoResult(i, i2, intent);
    }

    @Override // com.tt.option.p3393n.AbstractC67660b
    public C67525e handleChooseLocationResult(int i, int i2, Intent intent) {
        return this.hostOptionDependRegister.mo234836l().handleChooseLocationResult(i, i2, intent);
    }

    @Override // com.tt.option.p3394o.AbstractC67662b
    public void handleCustomizePermissionResult(JSONObject jSONObject, int i, boolean z) throws JSONException {
        this.hostOptionDependRegister.mo234839o().handleCustomizePermissionResult(jSONObject, i, z);
    }

    @Override // com.tt.option.p3381b.AbstractC67599b
    public void interceptStatusBarToImmersed(View view, View view2, int i) {
        this.hostOptionDependRegister.mo234803C().interceptStatusBarToImmersed(view, view2, i);
    }

    @Override // com.tt.option.p3394o.AbstractC67662b
    public void metaExtraNotify(String str, String str2, IAppContext iAppContext) {
        this.hostOptionDependRegister.mo234839o().metaExtraNotify(str, str2, iAppContext);
    }

    @Override // com.tt.option.p3394o.AbstractC67662b
    public void onDeniedWhenHasRequested(Activity activity, String str, IAppContext iAppContext) {
        this.hostOptionDependRegister.mo234839o().onDeniedWhenHasRequested(activity, str, iAppContext);
    }

    @Override // com.tt.option.p3396q.AbstractC67670b
    public boolean openDocument(Activity activity, String str, String str2) {
        return this.hostOptionDependRegister.mo234834j().openDocument(activity, str, str2);
    }

    @Override // com.tt.option.p3396q.AbstractC67670b
    public boolean openWebBrowser(Context context, String str, boolean z) {
        return this.hostOptionDependRegister.mo234834j().openWebBrowser(context, str, z);
    }

    @Override // com.tt.option.p3394o.AbstractC67662b
    public void savePermissionGrant(int i, boolean z, IAppContext iAppContext) {
        this.hostOptionDependRegister.mo234839o().savePermissionGrant(i, z, iAppContext);
    }

    @Override // com.tt.p3255a.AbstractC65677b
    public boolean share(Activity activity, ShareInfoModel shareInfoModel, AbstractC67684g gVar) {
        return getHostEssentialDepend().share(activity, shareInfoModel, gVar);
    }

    @Override // com.tt.option.p3394o.AbstractC67662b
    public void syncAuth(String str, IAppContext iAppContext, AbstractC13298i iVar) {
        this.hostOptionDependRegister.mo234839o().syncAuth(str, iAppContext, iVar);
    }

    @Override // com.tt.option.p3381b.AbstractC67599b
    public void triggerSoftKeyBoardShowEvent(int i, int i2, IAppContext iAppContext) {
        this.hostOptionDependRegister.mo234803C().triggerSoftKeyBoardShowEvent(i, i2, iAppContext);
    }

    @Override // com.tt.option.p3391l.AbstractC67652d
    public AbstractC67653e createSDKMonitorInstance(Context context, String str, JSONObject jSONObject) {
        if (this.hostOptionDependRegister.mo234801A() != null) {
            return this.hostOptionDependRegister.mo234801A().createSDKMonitorInstance(context, str, jSONObject);
        }
        return null;
    }

    @Override // com.tt.option.C67606d
    public boolean gamePay(Activity activity, JSONObject jSONObject, String str) {
        if (this.hostOptionDependRegister.mo234840p() != null) {
            return this.hostOptionDependRegister.mo234840p().gamePay(activity, jSONObject, str);
        }
        return false;
    }

    @Override // com.tt.option.C67606d
    public <T> T getHostData(int i, T t, IAppContext iAppContext) {
        return this.hostOptionDependRegister.mo234840p() != null ? (T) this.hostOptionDependRegister.mo234840p().getHostData(i, t, iAppContext) : (T) super.getHostData(i, t, iAppContext);
    }

    public void loadImage(Context context, ImageView imageView, Uri uri) {
        getHostEssentialDepend().loadImage(context, new C65678c(uri).mo229922a(imageView));
    }

    @Override // com.tt.option.p3396q.AbstractC67670b
    public boolean openSchema(Context context, String str, String str2) {
        return this.hostOptionDependRegister.mo234834j().openSchema(context, str, str2);
    }

    @Override // com.tt.option.share.AbstractC67680c
    public void openShareDialog(Activity activity, ShareInfoModel shareInfoModel, AbstractC67683f fVar) {
        if (this.hostOptionDependRegister.mo234846v() != null) {
            this.hostOptionDependRegister.mo234846v().openShareDialog(activity, shareInfoModel, fVar);
        }
    }

    @Override // com.tt.option.p3395p.AbstractC67667b
    public void registerPlatformView(int i, View view, int i2) {
        if (this.hostOptionDependRegister.mo234847w() != null) {
            this.hostOptionDependRegister.mo234847w().registerPlatformView(i, view, i2);
        }
    }

    @Override // com.tt.option.C67606d
    public void serviceCommandAction(String str, String str2, IAppContext iAppContext) {
        if (this.hostOptionDependRegister.mo234840p() != null) {
            this.hostOptionDependRegister.mo234840p().serviceCommandAction(str, str2, iAppContext);
        }
        super.serviceCommandAction(str, str2, iAppContext);
    }

    @Override // com.tt.option.p3394o.AbstractC67662b
    public void syncPermissionToService(IAppContext iAppContext, String str, AbstractC13298i iVar) {
        this.hostOptionDependRegister.mo234839o().syncPermissionToService(iAppContext, str, iVar);
    }

    @Override // com.tt.option.p3392m.AbstractC67655b
    public C12825c downloadFile(C12824b bVar, AbstractC67655b.AbstractC67656a aVar, IAppContext iAppContext) {
        C12825c cVar;
        long currentMillis = TimeMeter.currentMillis();
        try {
            cVar = this.hostOptionDependRegister.mo234833i().downloadFile(bVar, aVar, iAppContext);
        } catch (Exception e) {
            AppBrandLogger.m52829e("HostDependManager", "downloadFile", e);
            C12825c cVar2 = new C12825c(iAppContext);
            cVar2.mo48460a(e.getClass() + ":" + e.getMessage());
            cVar2.mo48461a(e);
            if (DebugUtil.debug()) {
                Application applicationContext = AppbrandContext.getInst().getApplicationContext();
                showToast(applicationContext, null, AppbrandContext.getInst().getApplicationContext().getResources().getString(R.string.microapp_m_network_request_failed) + e.getMessage(), 0, null);
            }
            cVar = cVar2;
        }
        if (cVar == null) {
            cVar = new C12825c(iAppContext);
            cVar.mo48460a("unknown net error");
        }
        C67475d.m262452a(bVar, cVar, TimeMeter.currentMillis() - currentMillis, iAppContext);
        return cVar;
    }

    @Override // com.tt.option.p3396q.AbstractC67670b
    public void jumpToWebView(Context context, String str, String str2, boolean z) {
        this.hostOptionDependRegister.mo234834j().jumpToWebView(context, str, str2, z);
    }

    @Override // com.tt.option.p3396q.AbstractC67670b
    public void overridePendingTransition(Activity activity, int i, int i2, int i3) {
        this.hostOptionDependRegister.mo234834j().overridePendingTransition(activity, i, i2, i3);
    }

    @Override // com.tt.option.ui.HostOptionUiDepend
    public void showRegionPickerView(Activity activity, String str, String[] strArr, HostOptionUiDepend.AbstractC67693e eVar) {
        this.hostOptionDependRegister.mo234835k().showRegionPickerView(activity, str, strArr, eVar);
    }

    @Override // com.tt.option.ui.HostOptionUiDepend
    public void showUnSupportView(Activity activity, String str, HostOptionUiDepend.AbstractC67695g gVar, IAppContext iAppContext) {
        this.hostOptionDependRegister.mo234835k().showUnSupportView(activity, str, gVar, iAppContext);
    }

    @Override // com.tt.p3255a.AbstractC65677b
    public boolean startImagePreviewActivity(Activity activity, String str, List<String> list, int i) {
        return getHostEssentialDepend().startImagePreviewActivity(activity, str, list, i);
    }

    @Override // com.tt.option.C67606d
    public void doEditorAtSearch(String str, String str2, AbstractC4272g gVar, IAppContext iAppContext) {
        if (this.hostOptionDependRegister.mo234840p() != null) {
            this.hostOptionDependRegister.mo234840p().doEditorAtSearch(str, str2, gVar, iAppContext);
        } else {
            super.doEditorAtSearch(str, str2, gVar, iAppContext);
        }
    }

    @Override // com.tt.option.C67606d
    public boolean isCheckSafeDomain(boolean z, String str, String str2, IAppContext iAppContext) {
        if (this.hostOptionDependRegister.mo234840p() != null) {
            return this.hostOptionDependRegister.mo234840p().isCheckSafeDomain(z, str, str2, iAppContext);
        }
        return super.isCheckSafeDomain(z, str, str2, iAppContext);
    }

    @Override // com.tt.p3255a.AbstractC65677b
    public boolean startImagePreviewActivity(Activity activity, List<ImageRequest> list, int i, AbstractC67668a aVar) {
        return getHostEssentialDepend().startImagePreviewActivity(activity, list, i, aVar);
    }

    @Override // com.tt.option.p3389j.AbstractC67643b
    public void chooseImage(IAppContext iAppContext, int i, boolean z, boolean z2, String str) {
        this.hostOptionDependRegister.mo234831g().chooseImage(iAppContext, i, z, z2, str);
    }

    @Override // com.tt.option.p3389j.AbstractC67643b
    public void chooseImageForFeedback(IAppContext iAppContext, int i, boolean z, boolean z2, String str) {
        this.hostOptionDependRegister.mo234831g().chooseImageForFeedback(iAppContext, i, z, z2, str);
    }

    @Override // com.tt.option.p3389j.AbstractC67643b
    public void chooseVideo(IAppContext iAppContext, int i, boolean z, boolean z2, String str) {
        this.hostOptionDependRegister.mo234831g().chooseVideo(iAppContext, i, z, z2, str);
    }

    @Override // com.tt.option.p3396q.AbstractC67670b
    public void preHandleIntent(Context context, Intent intent, int i, int i2, String str) {
        this.hostOptionDependRegister.mo234834j().preHandleIntent(context, intent, i, i2, str);
    }

    @Override // com.tt.option.ui.HostOptionUiDepend
    public void showActionSheet(Context context, String str, String[] strArr, AbstractC67550j.AbstractC67551a<Integer> aVar, IAppContext iAppContext) {
        this.hostOptionDependRegister.mo234835k().showActionSheet(context, str, strArr, aVar, iAppContext);
    }

    @Override // com.tt.option.ui.HostOptionUiDepend
    public void showMultiPickerView(Activity activity, String str, List<List<String>> list, int[] iArr, HostOptionUiDepend.AbstractC67690b bVar) {
        this.hostOptionDependRegister.mo234835k().showMultiPickerView(activity, str, list, iArr, bVar);
    }

    @Override // com.tt.option.ui.HostOptionUiDepend
    public Dialog showPermissionDialog(Activity activity, int i, String str, AbstractC67540b bVar, IAppContext iAppContext) {
        return this.hostOptionDependRegister.mo234835k().showPermissionDialog(activity, i, str, bVar, iAppContext);
    }

    @Override // com.tt.option.ui.HostOptionUiDepend
    public void showPickerView(Activity activity, String str, int i, List<String> list, HostOptionUiDepend.AbstractC67691c<String> cVar) {
        this.hostOptionDependRegister.mo234835k().showPickerView(activity, str, i, list, cVar);
    }

    @Override // com.tt.option.ui.HostOptionUiDepend
    public void showToast(Context context, String str, String str2, long j, String str3) {
        this.hostOptionDependRegister.mo234835k().showToast(context, str, str2, j, str3);
    }

    @Override // com.tt.option.ext.AbstractC67624i
    public AbstractC65886f getNativeComponentView(String str, int i, int i2, C67231a aVar, C67257d dVar, IBaseRender iBaseRender) {
        if (this.hostOptionDependRegister.mo234850z() != null) {
            return this.hostOptionDependRegister.mo234850z().getNativeComponentView(str, i, i2, aVar, dVar, iBaseRender);
        }
        return null;
    }

    @Override // com.tt.option.ui.HostOptionUiDepend
    public Dialog showPermissionsDialog(Activity activity, Set<Integer> set, LinkedHashMap<Integer, String> linkedHashMap, AbstractC67539a aVar, HashMap<String, String> hashMap, IAppContext iAppContext) {
        return this.hostOptionDependRegister.mo234835k().showPermissionsDialog(activity, set, linkedHashMap, aVar, hashMap, iAppContext);
    }

    @Override // com.tt.option.ui.HostOptionUiDepend
    public void showToast(Context context, ViewGroup viewGroup, String str, String str2, long j, String str3) {
        this.hostOptionDependRegister.mo234835k().showToast(context, viewGroup, str, str2, j, str3);
    }

    @Override // com.tt.option.p3393n.AbstractC67660b
    public boolean openLocation(Activity activity, String str, String str2, double d, double d2, int i, String str3, String str4) {
        return this.hostOptionDependRegister.mo234836l().openLocation(activity, str, str2, d, d2, i, str3, str4);
    }

    @Override // com.tt.option.ui.HostOptionUiDepend
    public void showTimePickerView(Activity activity, String str, int i, int i2, int i3, int i4, int i5, int i6, HostOptionUiDepend.AbstractC67694f<String> fVar) {
        this.hostOptionDependRegister.mo234835k().showTimePickerView(activity, str, i, i2, i3, i4, i5, i6, fVar);
    }

    @Override // com.tt.option.ui.HostOptionUiDepend
    public void showModal(Context context, String str, String str2, String str3, boolean z, String str4, String str5, String str6, String str7, AbstractC67550j.AbstractC67551a<Integer> aVar, Activity activity) {
        this.hostOptionDependRegister.mo234835k().showModal(context, str, str2, str3, z, str4, str5, str6, str7, aVar, activity);
    }

    @Override // com.tt.option.ui.HostOptionUiDepend
    public void showDatePickerView(Activity activity, String str, String str2, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, HostOptionUiDepend.AbstractC67689a<String> aVar) {
        this.hostOptionDependRegister.mo234835k().showDatePickerView(activity, str, str2, i, i2, i3, i4, i5, i6, i7, i8, i9, aVar);
    }
}
