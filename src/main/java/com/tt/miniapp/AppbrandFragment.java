package com.tt.miniapp;

import android.app.Activity;
import android.content.Context;
import android.graphics.Color;
import android.os.Bundle;
import android.os.Message;
import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.lark.infra.foundation.utils.CharacterUtils;
import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.larksuite.component.openplatform.core.component.p1115a.AbstractC24432a;
import com.larksuite.component.openplatform.core.loader.jsbundle.C24512a;
import com.larksuite.component.openplatform.core.utils.C25529d;
import com.larksuite.suite.R;
import com.ss.android.lark.optrace.api.TracingCoreSpan;
import com.tt.frontendapiinterface.IBackPressedListener;
import com.tt.miniapp.AppConfig;
import com.tt.miniapp.C66546p;
import com.tt.miniapp.component.nativeview.NativeViewManager;
import com.tt.miniapp.debug.C65983a;
import com.tt.miniapp.event.C66036d;
import com.tt.miniapp.p3276d.p3278b.AbstractC65980b;
import com.tt.miniapp.p3323q.C66692i;
import com.tt.miniapp.p3331t.C66890j;
import com.tt.miniapp.preload.PreloadManager;
import com.tt.miniapp.render.IAppbrandRender;
import com.tt.miniapp.render.IAppbrandRenderHost;
import com.tt.miniapp.util.TimeLogger;
import com.tt.miniapp.view.refresh.AbstractC67213b;
import com.tt.miniapp.view.refresh.RefreshHeaderView;
import com.tt.miniapp.view.refresh.SwipeToLoadLayout;
import com.tt.miniapp.view.swipeback.C67225b;
import com.tt.miniapphost.AbstractC67497e;
import com.tt.miniapphost.AppbrandContext;
import com.tt.miniapphost.C67432a;
import com.tt.miniapphost.MiniappHostBase;
import com.tt.miniapphost.data.C67485a;
import com.tt.miniapphost.entity.AppInfoEntity;
import com.tt.miniapphost.host.HostDependManager;
import com.tt.miniapphost.p3362a.p3363a.AbstractC67433a;
import com.tt.miniapphost.p3371e.C67509b;
import com.tt.miniapphost.p3371e.p3372a.C67500a;
import com.tt.miniapphost.p3371e.p3372a.C67501b;
import com.tt.miniapphost.util.MiniAppProcessUtils;
import com.tt.miniapphost.util.ProcessUtil;
import com.tt.miniapphost.util.TimeMeter;
import com.tt.option.ext.WebEventCallback;
import com.tt.option.p3380a.AbstractC67595b;
import com.tt.option.p3389j.AbstractC67645c;
import com.tt.refer.impl.business.meta.DependComponent;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

public class AppbrandFragment extends C67225b implements IAppbrandRenderHost, AbstractC67213b {
    public IAppContext appContext;
    private List<IBackPressedListener> backPressedListenerList = new ArrayList();
    private boolean disableSwipeBack;
    private boolean isLoadAsWebview;
    boolean isOnDestroyView;
    public final IAppbrandRender mAppbrandRender;
    public AbstractC67595b mBottomBar;
    private final ViewGroup mBottomBarContainer;
    public JSONObject mBottomBarData;
    private final View mContentView;
    public boolean mEnablePullDownRefresh;
    private AbstractC67645c mFileChooseHandler;
    private JSONObject mFirstRenderTitleBarJson;
    boolean mHidden = false;
    private AbstractC24432a mLegacyLifecycleListener;
    private String mOpenType;
    private AppConfig.AppPageConfig mPageAppPageConfig;
    private String mPageContent;
    private String mPageQuery;
    private TimeMeter mPageStartTime;
    public AbstractC66187h mPageTrans;
    public String mPageUrl;
    public final SwipeToLoadLayout mRefreshLayout;
    public ViewGroup mRenderContainer;
    private final RenderViewManager mRenderViewManager;
    private int mResumeCount;
    boolean mStart = false;
    private C65966d mTitleBar;
    private TracingCoreSpan mTracingCoreSpan;
    private View mView;
    private boolean mViewCreated;
    private final List<AbstractC66179g> pageLifes = new ArrayList();

    @Override // com.tt.miniapp.render.IAppbrandRenderHost
    public Fragment getFragment() {
        return this;
    }

    @Override // com.tt.miniapp.RenderViewManager.IRender
    public void setLoadAsWebView() {
        this.isLoadAsWebview = true;
    }

    @Override // com.tt.miniapp.render.IAppbrandRenderHost
    public IAppContext getAppContext() {
        return this.appContext;
    }

    @Override // com.tt.frontendapiinterface.IBaseRender
    public List<IBackPressedListener> getBackPressedListener() {
        return this.backPressedListenerList;
    }

    @Override // com.tt.miniapp.render.IAppbrandRenderHost
    public View getFragmentView() {
        return this.mView;
    }

    @Override // com.tt.frontendapiinterface.IBaseRender
    public String getPage() {
        return this.mPageUrl;
    }

    public String getPagePath() {
        return this.mPageContent;
    }

    @Override // com.tt.miniapp.render.IAppbrandRenderHost
    public RenderViewManager getRenderViewManager() {
        return this.mRenderViewManager;
    }

    @Override // com.tt.miniapp.render.IAppbrandRenderHost
    public C65966d getTitleBar() {
        return this.mTitleBar;
    }

    public IAppContext getiAppContext() {
        return this.appContext;
    }

    @Override // com.tt.miniapp.render.IAppbrandRenderHost
    public boolean isStarted() {
        return this.mStart;
    }

    public boolean isViewCreated() {
        return this.mViewCreated;
    }

    public boolean isWebViewFragment() {
        return this.isLoadAsWebview;
    }

    @Override // com.tt.miniapp.render.IAppbrandRenderHost, androidx.fragment.app.Fragment
    public /* bridge */ /* synthetic */ Activity getActivity() {
        return super.getActivity();
    }

    @Override // com.tt.frontendapiinterface.IBaseRender
    public Activity getCurrentActivity() {
        return getActivity();
    }

    @Override // com.tt.miniapp.RenderViewManager.IRender
    public NativeViewManager getNativeViewManager() {
        return this.mAppbrandRender.getNativeViewManager();
    }

    @Override // com.tt.frontendapiinterface.IBaseRender
    public Object getRealRenderView() {
        return this.mAppbrandRender.getRealRenderView();
    }

    @Override // com.tt.frontendapiinterface.IBaseRender
    public int getRenderHeight() {
        return this.mAppbrandRender.getRenderHeight();
    }

    @Override // com.tt.frontendapiinterface.IBaseRender
    public int getRenderViewId() {
        return this.mAppbrandRender.getRenderViewId();
    }

    @Override // com.tt.frontendapiinterface.IBaseRender
    public int getRenderWidth() {
        return this.mAppbrandRender.getRenderWidth();
    }

    @Override // com.tt.miniapp.RenderViewManager.IRender
    public View getRootView() {
        return getView();
    }

    @Override // com.tt.frontendapiinterface.IBaseRender
    public void hideConfirmBar() {
        this.mAppbrandRender.hideConfirmBar();
    }

    @Override // com.tt.miniapp.RenderViewManager.IRender
    public void hideNavigationBarHomeButton() {
        this.mTitleBar.mo230943d();
    }

    @Override // com.tt.miniapp.RenderViewManager.IRender
    public boolean isTemplateReady() {
        return this.mAppbrandRender.isTemplateReady();
    }

    public void onAppInstallSuccess() {
        this.mAppbrandRender.onAppInstallSuccess();
    }

    public void onAppStartLaunching() {
        this.mAppbrandRender.onAppStartLaunching();
    }

    @Override // com.tt.miniapp.RenderViewManager.IRender
    public void onDOMReady() {
        this.mAppbrandRender.onDOMReady();
    }

    public void onPostResume() {
        this.mAppbrandRender.onPostResume();
    }

    @Override // com.tt.frontendapiinterface.IBaseRender
    public void onStartPullDownRefresh() {
        this.mRefreshLayout.setRefreshing(true);
    }

    @Override // com.tt.frontendapiinterface.IBaseRender
    public void onStopPullDownRefresh() {
        this.mRefreshLayout.setRefreshing(false);
    }

    @Override // com.tt.miniapp.RenderViewManager.IRender
    public void onSubAppInstallSuccess() {
        this.mAppbrandRender.onSubAppInstallSuccess();
    }

    public void onUserLeaveHint() {
        this.mAppbrandRender.onUserLeaveHint();
    }

    @Override // com.tt.frontendapiinterface.IBaseRender
    public boolean pullDownRefreshEnabled() {
        return this.mRefreshLayout.isEnabled();
    }

    @Override // com.tt.miniapp.RenderViewManager.IRender
    public void reloadWebUrl() {
        this.mAppbrandRender.reloadWebUrl();
    }

    @Override // com.tt.frontendapiinterface.IBaseRender
    public void showConfirmBar() {
        this.mAppbrandRender.showConfirmBar();
    }

    @Override // com.tt.frontendapiinterface.IBaseRender
    public int getTitleBarHeight() {
        C65966d dVar = this.mTitleBar;
        if (dVar != null) {
            return dVar.mo230948i();
        }
        return 0;
    }

    private void initContentView() {
        AppBrandLogger.m52830i("tma_AppbrandFragment", "initContentView");
        initPullDownRefresh();
        initPullDownRefreshHeader();
        initPopMenuConfig();
    }

    private boolean isStartPage() {
        AppInfoEntity appInfo = AppbrandApplicationImpl.getInst(this.appContext).getAppInfo();
        if (appInfo == null) {
            return false;
        }
        return TextUtils.equals(this.mPageUrl, appInfo.oriStartPage);
    }

    public AppConfig.AppPageConfig getAppPageConfig() {
        if (this.mPageAppPageConfig == null) {
            this.mPageAppPageConfig = AppConfig.AppPageConfig.parse(AppbrandApplicationImpl.getInst(this.appContext).getAppConfig(), this.mPageContent);
        }
        return this.mPageAppPageConfig;
    }

    @Override // com.tt.miniapp.RenderViewManager.IRender
    public AbstractC67645c getFileChooseHandler() {
        if (this.mFileChooseHandler == null) {
            this.mFileChooseHandler = HostDependManager.getInst().createChooseFileHandler(getActivity());
        }
        return this.mFileChooseHandler;
    }

    @Override // com.tt.miniapp.RenderViewManager.IRender
    public boolean isRenderInBrowserEnabled() {
        if (this.appContext == null || !this.mAppbrandRender.isRenderInBrowserEnabled() || !C24512a.m89387b(this.appContext.getAppId())) {
            return false;
        }
        return true;
    }

    public void tasksAfterTitleMarginRequest() {
        this.mAppbrandRender.onDetermineRenderContainerSize(this.mRenderContainer.getWidth(), this.mRenderContainer.getHeight());
    }

    private void onReadySetData() {
        AppBrandLogger.m52830i("tma_AppbrandFragment", "mPageUrl ", this.mPageUrl, " mPageContent ", this.mPageContent, " mPageQuery ", this.mPageQuery);
        boolean a = C65966d.m258373a(this.mPageContent, this.appContext);
        this.mAppbrandRender.setDisableScroll(a);
        this.mRefreshLayout.setDisableScroll(a);
        initContentView();
    }

    private void refreshCachePageState() {
        String str;
        AppbrandApplicationImpl.getInst(this.appContext).setCurrentRenderViewId(getRenderViewId());
        AppbrandApplicationImpl.getInst(this.appContext).setCurrentPagePath(this.mPageContent);
        AppbrandApplicationImpl inst = AppbrandApplicationImpl.getInst(this.appContext);
        if (isWebViewFragment()) {
            str = "webview";
        } else {
            str = "mp_native";
        }
        inst.setCurrentPageType(str);
    }

    @Override // com.tt.miniapp.RenderViewManager.IRender
    public List<String> getDependencyJsComponents() {
        Map<String, DependComponent> map;
        ArrayList arrayList = new ArrayList();
        AppInfoEntity appInfo = AppbrandApplicationImpl.getInst(this.appContext).getAppInfo();
        if (!(appInfo == null || (map = appInfo.jsComponents) == null || map.isEmpty())) {
            arrayList.addAll(map.keySet());
        }
        AppBrandLogger.m52830i("tma_AppbrandFragment", "getDependencyJsComponents:", Arrays.toString(arrayList.toArray()));
        return arrayList;
    }

    /* access modifiers changed from: package-private */
    public void initPullDownRefresh() {
        boolean z = getAppPageConfig().enablePullDownRefresh;
        if (MiniAppProcessUtils.isOryxProcess(ProcessUtil.getCurProcessName(AppbrandContext.getInst().getApplicationContext()))) {
            this.mEnablePullDownRefresh = false;
            this.mRefreshLayout.setRefreshEnabled(false);
            return;
        }
        this.mEnablePullDownRefresh = z;
        if (C65966d.m258373a(this.mPageContent, this.appContext)) {
            this.mRefreshLayout.setRefreshEnabled(false);
        } else {
            this.mRefreshLayout.setRefreshEnabled(z);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        AppBrandLogger.m52830i("tma_AppbrandFragment", "onDestroyView");
        this.isOnDestroyView = true;
        this.mAppbrandRender.onDestroyView();
        for (AbstractC66179g gVar : this.pageLifes) {
            if (gVar != null) {
                gVar.mo48900g();
            }
        }
        AbstractC67595b bVar = this.mBottomBar;
        if (bVar != null) {
            bVar.mo234797e();
        }
        C65966d dVar = this.mTitleBar;
        if (dVar != null) {
            dVar.mo230949j();
        }
    }

    @Override // com.tt.miniapp.view.refresh.AbstractC67213b
    public void onRefresh() {
        AppBrandLogger.m52830i("tma_AppbrandFragment", "onRefresh");
        try {
            AppbrandApplicationImpl.getInst(this.appContext).getJsBridge().sendMsgToJsCore("onPullDownRefresh", new JSONObject().toString(), getRenderViewId());
        } catch (Exception e) {
            AppBrandLogger.m52829e("tma_AppbrandFragment", "onRefresh", e);
        }
    }

    /* access modifiers changed from: package-private */
    public void initPopMenuConfig() {
        IAppContext iAppContext = this.appContext;
        if (iAppContext == null) {
            AppBrandLogger.m52829e("tma_AppbrandFragment", "initPopMenuConfig appContext == null");
            return;
        }
        AppConfig appConfig = AppbrandApplicationImpl.getInst(iAppContext).getAppConfig();
        if (appConfig == null) {
            AppBrandLogger.m52829e("tma_AppbrandFragment", "initPopMenuConfig app config == null");
            return;
        }
        AppConfig.C65690e eVar = appConfig.f165495b;
        if (eVar == null) {
            AppBrandLogger.m52829e("tma_AppbrandFragment", "initPopMenuConfig page list == null");
        } else if (TextUtils.isEmpty(this.mPageContent)) {
            AppBrandLogger.m52829e("tma_AppbrandFragment", "initPopMenuConfig: no current page content");
        } else {
            AppConfig.Window a = eVar.mo230061a(this.mPageContent);
            if (a == null) {
                AppBrandLogger.m52829e("tma_AppbrandFragment", "initPopMenuConfig: no current page window");
                return;
            }
            this.mAppbrandRender.initPopMenuConfig(a);
        }
    }

    public void initSwipeBack() {
        AppConfig.Window a;
        AppConfig appConfig = AppbrandApplicationImpl.getInst(this.appContext).getAppConfig();
        if (appConfig != null) {
            AppConfig.C65690e eVar = appConfig.f165495b;
            if (!(eVar == null || (a = eVar.mo230061a(this.mPageContent)) == null || !a.hasDisableSwipeBack)) {
                this.disableSwipeBack = a.disableSwipeBack;
            }
        } else {
            AppBrandLogger.m52829e("tma_AppbrandFragment", "initSwipeBack appconfig == null");
        }
        AppBrandLogger.m52830i("tma_AppbrandFragment", "disableSwipeBack", Boolean.valueOf(this.disableSwipeBack));
        setSwipeBackEnable(!this.disableSwipeBack);
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        AppBrandLogger.m52830i("tma_AppbrandFragment", "onDestroy:" + hashCode());
        this.mAppbrandRender.onDestroy();
        RenderViewManager renderViewManager = this.mRenderViewManager;
        if (renderViewManager != null) {
            renderViewManager.removeRender(getRenderViewId());
        }
        this.backPressedListenerList.clear();
        AbstractC24432a aVar = this.mLegacyLifecycleListener;
        if (aVar != null) {
            aVar.mo87227f();
            this.mLegacyLifecycleListener = null;
        }
        this.appContext = null;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDetach() {
        super.onDetach();
        AppBrandLogger.m52830i("tma_AppbrandFragment", "onDetach:" + hashCode());
        for (AbstractC66179g gVar : this.pageLifes) {
            if (gVar != null) {
                gVar.mo48897d();
            }
        }
        this.mAppbrandRender.onDetach();
    }

    @Override // androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        AppBrandLogger.m52830i("tma_AppbrandFragment", "onPause:" + hashCode());
        this.mAppbrandRender.onPause();
        if (this.appContext.isDestroyed() || this.appContext.isDestroying()) {
            AppBrandLogger.m52830i("tma_AppbrandFragment", "appContext destroy, because GadgetTab renderProcessGone");
            return;
        }
        if (!this.mHidden) {
            onPageExit(2);
            for (AbstractC66179g gVar : this.pageLifes) {
                if (gVar != null) {
                    gVar.mo48899f();
                }
            }
        }
        AbstractC24432a aVar = this.mLegacyLifecycleListener;
        if (aVar != null) {
            aVar.ae_();
        }
    }

    @Override // com.tt.miniapp.view.swipeback.C67225b, androidx.fragment.app.Fragment
    public void onResume() {
        AppbrandApplicationImpl inst;
        C66890j routeEventCtrl;
        super.onResume();
        AppBrandLogger.m52830i("tma_AppbrandFragment", "onResume");
        if (!this.mHidden) {
            this.mResumeCount++;
            logEnterEvent(2);
            refreshCachePageState();
            C65966d dVar = this.mTitleBar;
            if (dVar != null) {
                dVar.mo230946g();
            }
            for (AbstractC66179g gVar : this.pageLifes) {
                if (gVar != null) {
                    gVar.mo48898e();
                }
            }
            AbstractC24432a aVar = this.mLegacyLifecycleListener;
            if (aVar != null) {
                aVar.ad_();
            }
            IAppContext iAppContext = this.appContext;
            if (iAppContext instanceof AbstractC67433a) {
                boolean g = C25529d.m91166g(iAppContext);
                boolean f = true ^ C25529d.m91165f(this.appContext);
                if (g && f && (inst = AppbrandApplicationImpl.getInst(this.appContext)) != null && (routeEventCtrl = inst.getRouteEventCtrl()) != null && routeEventCtrl.mo232877f()) {
                    this.mAppbrandRender.reLaunchForSSB();
                }
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        this.mStart = true;
        AppBrandLogger.m52830i("tma_AppbrandFragment", "onStart:" + hashCode());
        this.mAppbrandRender.onStart();
        for (AbstractC66179g gVar : this.pageLifes) {
            if (gVar != null) {
                gVar.mo48896c();
            }
        }
        AbstractC24432a aVar = this.mLegacyLifecycleListener;
        if (aVar != null) {
            aVar.ac_();
        }
        handleBottomBar();
    }

    @Override // androidx.fragment.app.Fragment
    public void onStop() {
        super.onStop();
        if (this.appContext.isDestroying() || this.appContext.isDestroyed()) {
            AppBrandLogger.m52830i("tma_AppbrandFragment", "appContext Destroy,because renderProcessGone");
            return;
        }
        this.mStart = false;
        AppBrandLogger.m52830i("tma_AppbrandFragment", "onStop:" + hashCode());
        for (AbstractC66179g gVar : this.pageLifes) {
            if (gVar != null) {
                gVar.mo48894b();
            }
        }
        AbstractC24432a aVar = this.mLegacyLifecycleListener;
        if (aVar != null) {
            aVar.af_();
        }
        this.mRefreshLayout.setRefreshing(false);
    }

    /* access modifiers changed from: protected */
    public void handleBottomBar() {
        if (this.mBottomBarContainer != null) {
            String schema = C67432a.m262319a(this.appContext).getSchema();
            AbstractC67595b bVar = this.mBottomBar;
            if (bVar != null) {
                if (TextUtils.equals(bVar.mo234791a(), schema)) {
                    this.mBottomBar.mo234795c();
                    return;
                }
                this.mBottomBar.mo234797e();
                ViewGroup.LayoutParams layoutParams = this.mContentView.getLayoutParams();
                if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                    ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin = 0;
                }
                this.mContentView.setLayoutParams(layoutParams);
                this.mBottomBar = null;
                this.mBottomBarData = null;
            }
            if (isStartPage()) {
                JSONObject a = AbstractC67595b.m263097a(schema);
                this.mBottomBarData = a;
                if (a != null) {
                    AbstractC67595b createBottomBar = HostDependManager.getInst().createBottomBar(a.optString("tag"), schema, new AbstractC67595b.AbstractC67596a() {
                        /* class com.tt.miniapp.AppbrandFragment.C657074 */
                    });
                    this.mBottomBar = createBottomBar;
                    if (createBottomBar != null && createBottomBar.mo234792a(this.mBottomBarContainer)) {
                        this.mBottomBar.mo234795c();
                        ViewGroup.LayoutParams layoutParams2 = this.mContentView.getLayoutParams();
                        if (layoutParams2 instanceof ViewGroup.MarginLayoutParams) {
                            ((ViewGroup.MarginLayoutParams) layoutParams2).bottomMargin = this.mBottomBar.mo234793b();
                        }
                        registerBackPressedListener(new IBackPressedListener() {
                            /* class com.tt.miniapp.AppbrandFragment.C657085 */

                            @Override // com.tt.frontendapiinterface.IBackPressedListener
                            public boolean onBackPressed() {
                                if (AppbrandFragment.this.mBottomBar != null) {
                                    return AppbrandFragment.this.mBottomBar.mo234799g();
                                }
                                return false;
                            }
                        });
                    }
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void initPullDownRefreshHeader() {
        int i = getAppPageConfig().color;
        this.mRefreshLayout.setBackgroundColor(i);
        this.mAppbrandRender.updateBackgroundColor(i);
        RefreshHeaderView refreshHeaderView = (RefreshHeaderView) this.mRefreshLayout.getHeaderView();
        if (getAppPageConfig().isTextLight) {
            refreshHeaderView.setLoadingPoint1OrgColor(Color.parseColor("#33FFFFFF"));
            refreshHeaderView.setLoadingPoint2OrgColor(Color.parseColor("#33FFFFFF"));
            refreshHeaderView.setLoadingPoint3OrgColor(Color.parseColor("#33FFFFFF"));
            refreshHeaderView.setLoadingPoint1AnimColor(new int[]{Color.parseColor("#4dFFFFFF"), Color.parseColor("#33FFFFFF")});
            refreshHeaderView.setLoadingPoint2AnimColor(new int[]{Color.parseColor("#4dFFFFFF"), Color.parseColor("#33FFFFFF")});
            refreshHeaderView.setLoadingPoint3AnimColor(new int[]{Color.parseColor("#4dFFFFFF"), Color.parseColor("#33FFFFFF")});
            return;
        }
        refreshHeaderView.setLoadingPoint1OrgColor(Color.parseColor("#1a000000"));
        refreshHeaderView.setLoadingPoint2OrgColor(Color.parseColor("#1a000000"));
        refreshHeaderView.setLoadingPoint3OrgColor(Color.parseColor("#1a000000"));
        refreshHeaderView.setLoadingPoint1AnimColor(new int[]{Color.parseColor("#33000000"), Color.parseColor("#1a000000")});
        refreshHeaderView.setLoadingPoint2AnimColor(new int[]{Color.parseColor("#33000000"), Color.parseColor("#1a000000")});
        refreshHeaderView.setLoadingPoint3AnimColor(new int[]{Color.parseColor("#33000000"), Color.parseColor("#1a000000")});
    }

    public void setFirstRenderTitleData(JSONObject jSONObject) {
        this.mFirstRenderTitleBarJson = jSONObject;
    }

    public void setLegacyLifecycleListener(AbstractC24432a aVar) {
        this.mLegacyLifecycleListener = aVar;
    }

    public void setPageTrans(AbstractC66187h hVar) {
        this.mPageTrans = hVar;
    }

    @Override // com.tt.miniapp.render.IAppbrandRenderHost
    public void detachRenderView(View view) {
        this.mRenderContainer.removeView(view);
    }

    @Override // com.tt.frontendapiinterface.IBaseRender
    public View getNativeView(int i) {
        return this.mAppbrandRender.getNativeView(i);
    }

    public void onTrimMemory(int i) {
        this.mAppbrandRender.onTrimMemory(i);
    }

    @Override // com.tt.miniapp.RenderViewManager.IRender
    public void registerKeyBoardStateChange(IKeyBoardStateChange iKeyBoardStateChange) {
        this.mAppbrandRender.registerKeyBoardStateChange(iKeyBoardStateChange);
    }

    @Override // com.tt.miniapp.RenderViewManager.IRender
    public void registerPageLife(AbstractC66179g gVar) {
        if (gVar != null) {
            this.pageLifes.add(gVar);
        }
    }

    public void setDisableRefresh(boolean z) {
        this.mRefreshLayout.setDisableRefresh(z);
    }

    @Override // com.tt.miniapp.RenderViewManager.IRender
    public void setNavigationBarLoading(boolean z) {
        this.mTitleBar.mo230936a(z);
    }

    @Override // com.tt.frontendapiinterface.IBaseRender
    public void setNavigationBarTitle(String str) {
        C65966d dVar = this.mTitleBar;
        if (dVar != null) {
            dVar.mo230931a(str);
        }
    }

    public void setOpenType(String str) {
        this.mOpenType = str;
        this.mAppbrandRender.setOpenType(str);
    }

    @Override // com.tt.frontendapiinterface.IBaseRender
    public void showKeyboard(int i) {
        this.mAppbrandRender.showKeyboard(i);
    }

    @Override // com.tt.frontendapiinterface.IBaseRender
    public void unregisterBackPressedListener(IBackPressedListener iBackPressedListener) {
        this.backPressedListenerList.remove(iBackPressedListener);
    }

    @Override // com.tt.miniapp.RenderViewManager.IRender
    public void unregisterKeyBoardStateChange(IKeyBoardStateChange iKeyBoardStateChange) {
        this.mAppbrandRender.unregisterKeyBoardStateChange(iKeyBoardStateChange);
    }

    @Override // com.tt.miniapp.RenderViewManager.IRender
    public void unregisterPageLife(AbstractC66179g gVar) {
        this.pageLifes.remove(gVar);
    }

    @Override // com.tt.miniapp.render.IAppbrandRenderHost
    public void attachRenderView(View view) {
        this.mRenderContainer.addView(view, new ViewGroup.LayoutParams(-1, -1));
    }

    @Override // com.tt.frontendapiinterface.IBaseRender
    public boolean hasNativeView(int i) {
        if (getNativeView(i) != null) {
            return true;
        }
        return false;
    }

    @Override // com.tt.frontendapiinterface.IBaseRender
    public void registerBackPressedListener(IBackPressedListener iBackPressedListener) {
        if (iBackPressedListener != null && !this.backPressedListenerList.contains(iBackPressedListener)) {
            this.backPressedListenerList.add(iBackPressedListener);
        }
    }

    @Override // com.tt.miniapp.render.IAppbrandRenderHost
    public void attachRenderView(Fragment fragment) {
        getChildFragmentManager().beginTransaction().add(this.mRenderContainer.getId(), fragment).commitAllowingStateLoss();
    }

    @Override // com.tt.miniapp.RenderViewManager.IRender
    public void onPkgDownloadDone(boolean z) {
        AppBrandLogger.m52828d("tma_AppbrandFragment", "onPkgDownloadSuccess");
        this.mAppbrandRender.onPkgDownloadDone(z);
    }

    private void logPageEvent(boolean z) {
        C67501b.C67506e eVar;
        TracingCoreSpan renderViewTracingCoreSpan;
        if (this.mTracingCoreSpan == null && !z && (renderViewTracingCoreSpan = this.mAppbrandRender.getRenderViewTracingCoreSpan()) != null) {
            this.mTracingCoreSpan = renderViewTracingCoreSpan.generateSpan();
        }
        if (this.mTracingCoreSpan != null) {
            if (z) {
                eVar = C67501b.aD;
            } else {
                eVar = C67501b.aB;
            }
            new C67500a(eVar, this.appContext).reportPlatform(6).tracing(this.mTracingCoreSpan.getTracingID()).flush();
        }
    }

    @Override // com.tt.miniapp.view.swipeback.C67225b, androidx.fragment.app.Fragment
    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        AppBrandLogger.m52830i("tma_AppbrandFragment", "onActivityCreated:" + hashCode());
        C66692i.m260473a(this.appContext);
        RenderViewManager renderViewManager = this.mRenderViewManager;
        if (renderViewManager != null) {
            renderViewManager.setCurrentRender(this);
        } else {
            AppBrandLogger.m52829e("tma_AppbrandFragment", "webViewManager == null");
        }
        onReadySetData();
    }

    @Override // com.tt.miniapp.RenderViewManager.IRender
    public void onNativeWebViewPageFinished(boolean z) {
        C65966d dVar = this.mTitleBar;
        if (dVar != null) {
            dVar.mo230939b(z);
            if (z) {
                AppBrandLogger.m52830i("tma_AppbrandFragment", "native web pageFinished so hide home");
                this.mTitleBar.mo230943d();
            } else if (this.mTitleBar.mo230942c()) {
                AppBrandLogger.m52830i("tma_AppbrandFragment", "not canback but has home so show");
                this.mTitleBar.mo230944e();
            } else {
                AppBrandLogger.m52830i("tma_AppbrandFragment", "not canback and not home so do nothing");
            }
        }
    }

    @Override // com.tt.miniapp.view.swipeback.C67225b, androidx.fragment.app.Fragment
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        AppBrandLogger.m52830i("tma_AppbrandFragment", "onSaveInstanceState");
        for (AbstractC66179g gVar : this.pageLifes) {
            if (gVar != null) {
                gVar.mo48895b(bundle);
            }
        }
    }

    private void onPageExit(int i) {
        AppBrandLogger.m52830i("tma_AppbrandFragment", "onPageExit ", Integer.valueOf(i));
        TimeMeter timeMeter = this.mPageStartTime;
        if (timeMeter != null && timeMeter.isRunning()) {
            this.mAppbrandRender.onPageExit(i);
            String str = "";
            try {
                FragmentActivity activity = getActivity();
                if ((activity instanceof MiniappHostBase) && (((MiniappHostBase) activity).getActivityProxy() instanceof C66546p) && i != 2) {
                    str = "new_page";
                }
                C66036d.m258589a(this.mPageContent, this.mPageQuery, TimeMeter.stop(this.mPageStartTime), str, isWebViewFragment(), this.appContext);
                logPageEvent(true);
            } catch (Exception e) {
                AppBrandLogger.stacktrace(6, "tma_AppbrandFragment", e.getStackTrace());
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        super.onAttach(context);
        AppBrandLogger.m52830i("tma_AppbrandFragment", "onAttach:" + hashCode());
        this.mAppbrandRender.onAttach(context);
        for (AbstractC66179g gVar : this.pageLifes) {
            if (gVar != null) {
                gVar.mo48892a();
            }
        }
    }

    @Override // com.tt.miniapp.view.swipeback.C67225b, androidx.fragment.app.Fragment
    public void onHiddenChanged(boolean z) {
        super.onHiddenChanged(z);
        this.mHidden = z;
        for (AbstractC66179g gVar : this.pageLifes) {
            if (gVar != null) {
                if (z) {
                    gVar.mo48894b();
                } else {
                    gVar.mo48896c();
                }
            }
        }
        AppBrandLogger.m52830i("tma_AppbrandFragment", "onHiddenChanged ", Boolean.valueOf(z), " ", this.mOpenType);
        if (!z) {
            RenderViewManager renderViewManager = this.mRenderViewManager;
            if (renderViewManager != null) {
                renderViewManager.setCurrentRender(this);
            } else {
                AppBrandLogger.m52829e("tma_AppbrandFragment", "webViewManager == null");
            }
            C65966d dVar = this.mTitleBar;
            if (dVar != null) {
                dVar.mo230946g();
            }
            if (TextUtils.equals(this.mOpenType, "navigateBack") || TextUtils.equals(this.mOpenType, "switchTab") || TextUtils.equals(this.mOpenType, "reLaunch")) {
                this.mPageStartTime = TimeMeter.newAndStart();
                this.mAppbrandRender.sendOnAppRoute();
            }
            logEnterEvent(1);
            return;
        }
        onPageExit(1);
    }

    private void logEnterEvent(int i) {
        AppBrandLogger.m52830i("tma_AppbrandFragment", "logEnterEvent");
        String empty = CharacterUtils.empty();
        String empty2 = CharacterUtils.empty();
        FragmentActivity activity = getActivity();
        if (i == 1 || this.mResumeCount > 1) {
            empty = C67432a.m262319a(this.appContext).getCurrentPagePath();
            empty2 = C67432a.m262319a(this.appContext).getCurrentPageType();
            refreshCachePageState();
        } else if (activity instanceof MiniappHostBase) {
            AbstractC67497e activityProxy = ((MiniappHostBase) activity).getActivityProxy();
            if (activityProxy instanceof C66546p) {
                List<C66546p.C66557b> B = ((C66546p) activityProxy).mo232110B();
                if (B.size() >= 2) {
                    C66546p.C66557b bVar = B.get(B.size() - 2);
                    if ((bVar.f168057b instanceof AppbrandFragment) && ((AppbrandFragment) bVar.f168057b).isWebViewFragment()) {
                        empty = ((AppbrandFragment) bVar.f168057b).mPageContent;
                        empty2 = "webview";
                    } else if (bVar.f168057b instanceof C66661q) {
                        C66661q qVar = (C66661q) bVar.f168057b;
                        empty2 = qVar.mo232395d();
                        empty = qVar.mo232396e();
                    } else {
                        empty2 = "mp_native";
                    }
                } else if (B.size() == 1 && (B.get(B.size() - 1).f168057b instanceof C66661q)) {
                    empty2 = C67432a.m262319a(this.appContext).getCurrentPageType();
                    empty = C67432a.m262319a(this.appContext).getCurrentPagePath();
                    refreshCachePageState();
                }
            }
        }
        if (C65983a.m258415a().f166556f && C65983a.m258415a().f166560j != null && !this.mPageContent.equals(empty)) {
            Message obtainMessage = C65983a.m258415a().f166560j.obtainMessage();
            AppBrandLogger.m52830i("tma_AppbrandFragment", "mPageContent " + this.mPageContent, "lastPage " + empty, "lastHasWebView " + getRenderViewId());
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("mPageContent", this.mPageContent);
                jSONObject.put("lastPage", empty);
                obtainMessage.obj = jSONObject;
                C65983a.m258415a().f166560j.sendMessage(obtainMessage);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        this.mPageStartTime = TimeMeter.newAndStart();
        boolean isWebViewFragment = isWebViewFragment();
        boolean equals = TextUtils.equals(empty2, "webview");
        C66036d.m258585a(this.mPageContent, this.mPageQuery, isWebViewFragment ? 1 : 0, empty, equals ? 1 : 0, this.appContext);
        logPageEvent(false);
    }

    @Override // com.tt.frontendapiinterface.IBaseRender
    public void removeNativeView(int i, WebEventCallback webEventCallback) {
        this.mAppbrandRender.removeNativeView(i, webEventCallback);
    }

    @Override // com.tt.miniapp.RenderViewManager.IRender
    public void updateWebTitle(String str, boolean z) {
        C65966d dVar = this.mTitleBar;
        if (dVar != null) {
            dVar.mo230934a(str, z);
        }
    }

    @Override // com.tt.frontendapiinterface.IBaseRender
    public void setNavigationBarColor(String str, String str2) {
        C65966d dVar = this.mTitleBar;
        if (dVar != null) {
            dVar.mo230933a(str, str2);
            return;
        }
        AppBrandLogger.m52829e("tma_AppbrandFragment", "mTitleBar is null");
    }

    public void updateRouterParams(String str, String str2) {
        if (!TextUtils.equals(str, this.mPageUrl) || !TextUtils.equals(str2, this.mOpenType)) {
            TimeLogger.getInstance(this.appContext).logTimeDuration("AppbrandFragment_updateRouterParams");
            this.mPageUrl = str;
            this.mOpenType = str2;
            if (!TextUtils.isEmpty(str)) {
                String[] split = this.mPageUrl.split("\\?");
                if (split.length > 1) {
                    this.mPageContent = AppConfig.m257573a(split[0]);
                    this.mPageQuery = split[1];
                } else {
                    this.mPageContent = AppConfig.m257573a(split[0]);
                    this.mPageQuery = "";
                }
            }
            this.mAppbrandRender.updateArgument(this.mOpenType, this.mPageUrl, this.mPageContent, this.mPageQuery);
            this.mPageAppPageConfig = AppConfig.AppPageConfig.parse(AppbrandApplicationImpl.getInst(this.appContext).getAppConfig(), this.mPageContent);
        }
    }

    public AppbrandFragment(IAppbrandRender iAppbrandRender, IAppContext iAppContext) {
        super(iAppContext);
        this.mAppbrandRender = iAppbrandRender;
        this.appContext = iAppContext;
        TimeLogger.getInstance(iAppContext).logTimeDuration("AppbrandFragment_<init>");
        View preloadedView = ((PreloadManager) AppbrandApplicationImpl.getInst(iAppContext).getService(PreloadManager.class)).getPreloadedView(3);
        this.mView = preloadedView;
        this.mContentView = preloadedView.findViewById(R.id.microapp_m_content_view);
        this.mBottomBarContainer = (ViewGroup) this.mView.findViewById(R.id.microapp_m_bottom_bar_container);
        SwipeToLoadLayout swipeToLoadLayout = (SwipeToLoadLayout) this.mView.findViewById(R.id.microapp_m_refreshLayout);
        this.mRefreshLayout = swipeToLoadLayout;
        swipeToLoadLayout.setOnRefreshListener(this);
        swipeToLoadLayout.setRefreshEnabled(false);
        ((RefreshHeaderView) swipeToLoadLayout.getHeaderView()).setRefreshState(new RefreshHeaderView.AbstractC67203a() {
            /* class com.tt.miniapp.AppbrandFragment.C657031 */

            @Override // com.tt.miniapp.view.refresh.RefreshHeaderView.AbstractC67203a
            /* renamed from: a */
            public void mo230217a() {
            }

            @Override // com.tt.miniapp.view.refresh.RefreshHeaderView.AbstractC67203a
            /* renamed from: b */
            public void mo230218b() {
                AppbrandFragment.this.mRefreshLayout.setEnabled(AppbrandFragment.this.mEnablePullDownRefresh);
            }
        });
        swipeToLoadLayout.setEnabled(false);
        this.mRenderContainer = (ViewGroup) this.mView.findViewById(R.id.microapp_m_swipe_target);
        TimeLogger.getInstance(iAppContext).logTimeDuration("AppbrandFragment_beforeGetPreloadWebView");
        iAppbrandRender.initHost(this);
        RenderViewManager renderViewManager = AppbrandApplicationImpl.getInst(iAppContext).getRenderViewManager();
        this.mRenderViewManager = renderViewManager;
        renderViewManager.addRender(this);
        this.mResumeCount = 0;
        this.mView = attachToSwipeBack(this.mView);
    }

    public void onActivityRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        this.mAppbrandRender.onActivityRequestPermissionsResult(i, strArr, iArr);
    }

    @Override // com.tt.frontendapiinterface.IBaseRender
    public void updateNativeView(int i, String str, WebEventCallback webEventCallback) {
        this.mAppbrandRender.updateNativeView(i, str, webEventCallback);
    }

    @Override // com.tt.miniapp.view.swipeback.C67225b, androidx.fragment.app.Fragment
    public Animation onCreateAnimation(int i, boolean z, int i2) {
        AppBrandLogger.m52830i("tma_AppbrandFragment", "onCreateAnimation transit ", Integer.valueOf(i), " enter ", Boolean.valueOf(z), " nextAnim ", Integer.valueOf(i2));
        if (!z || i2 == 0) {
            this.mAppbrandRender.onAnimationEnd(false);
            return super.onCreateAnimation(i, z, i2);
        }
        Animation loadAnimation = AnimationUtils.loadAnimation(getActivity(), i2);
        loadAnimation.setAnimationListener(new Animation.AnimationListener() {
            /* class com.tt.miniapp.AppbrandFragment.animationAnimation$AnimationListenerC657063 */

            public void onAnimationRepeat(Animation animation) {
            }

            public void onAnimationStart(Animation animation) {
            }

            public void onAnimationEnd(Animation animation) {
                if (AppbrandFragment.this.mPageTrans != null) {
                    AppbrandFragment.this.mPageTrans.mo231524a();
                }
                AppbrandFragment.this.mPageTrans = null;
                AppbrandFragment.this.mAppbrandRender.onAnimationEnd(true);
            }
        });
        return loadAnimation;
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C65966d dVar;
        AbstractC65980b bVar;
        if (this.mViewCreated) {
            TimeLogger.getInstance(this.appContext).logError("AppbrandFragment_onCreateView_Twice");
            C67509b.m262589a("AppbrandFragment_onCreateView_Twice", Log.getStackTraceString(new Throwable()), "", this.appContext);
            return this.mView;
        }
        TimeLogger.getInstance(this.appContext).logTimeDuration("AppbrandFragment_onCreateView");
        initSwipeBack();
        C67485a a = C67485a.m262488a(this.appContext);
        if (!(a == null || (bVar = (AbstractC65980b) a.mo234274D().mo230962a(AbstractC65980b.class)) == null)) {
            this.mTitleBar = bVar.mo230965a(this.mView);
        }
        if (this.mTitleBar == null && (getCurrentActivity() instanceof MiniappHostBase)) {
            this.mTitleBar = new C65966d(AppbrandContext.getInst().getApplicationContext(), this.mView, this.appContext);
        }
        JSONObject jSONObject = this.mFirstRenderTitleBarJson;
        if (!(jSONObject == null || (dVar = this.mTitleBar) == null)) {
            dVar.mo230935a(jSONObject);
        }
        C65966d dVar2 = this.mTitleBar;
        if (dVar2 != null) {
            dVar2.mo230932a(this.mPageContent, new Runnable() {
                /* class com.tt.miniapp.AppbrandFragment.RunnableC657042 */

                public void run() {
                    AppbrandFragment.this.mRenderContainer.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() {
                        /* class com.tt.miniapp.AppbrandFragment.RunnableC657042.ViewTreeObserver$OnGlobalLayoutListenerC657051 */

                        public void onGlobalLayout() {
                            int width = AppbrandFragment.this.mRenderContainer.getWidth();
                            int height = AppbrandFragment.this.mRenderContainer.getHeight();
                            if (width != 0 && height != 0) {
                                AppbrandFragment.this.tasksAfterTitleMarginRequest();
                                AppbrandFragment.this.mRenderContainer.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                            }
                        }
                    });
                }
            });
        }
        initContentView();
        for (AbstractC66179g gVar : this.pageLifes) {
            if (gVar != null) {
                gVar.mo48893a(bundle);
            }
        }
        this.mViewCreated = true;
        this.mAppbrandRender.onCreateView();
        return this.mView;
    }

    @Override // com.tt.frontendapiinterface.IBaseRender
    public void addNativeView(int i, String str, String str2, WebEventCallback webEventCallback) {
        this.mAppbrandRender.addNativeView(i, str, str2, webEventCallback);
    }
}
