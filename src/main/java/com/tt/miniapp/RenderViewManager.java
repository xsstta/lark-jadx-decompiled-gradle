package com.tt.miniapp;

import android.util.SparseArray;
import android.view.View;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.tt.frontendapiinterface.ApiHandler;
import com.tt.frontendapiinterface.IBaseRender;
import com.tt.miniapp.AppbrandServiceManager;
import com.tt.miniapp.LifeCycleManager;
import com.tt.miniapp.component.nativeview.NativeViewManager;
import com.tt.miniapp.render.RenderEngineManager;
import com.tt.option.p3389j.AbstractC67645c;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONException;
import org.json.JSONObject;

public class RenderViewManager extends AppbrandServiceManager.ServiceBase {
    private final ConcurrentHashMap<Integer, IRender> idToRender = new ConcurrentHashMap<>();
    private IRender mCurrentRender;
    private AbstractC65714a mIFeedback;
    private final SparseArray<Queue<String>> renderViewId2PendingJsArray = new SparseArray<>();

    public interface IRender extends IBaseRender {
        List<String> getDependencyJsComponents();

        AbstractC67645c getFileChooseHandler();

        NativeViewManager getNativeViewManager();

        View getRootView();

        void hideNavigationBarHomeButton();

        boolean isRenderInBrowserEnabled();

        boolean isTemplateReady();

        void onDOMReady();

        void onNativeWebViewPageFinished(boolean z);

        void onPkgDownloadDone(boolean z);

        void onSubAppInstallSuccess();

        void registerKeyBoardStateChange(IKeyBoardStateChange iKeyBoardStateChange);

        void registerPageLife(AbstractC66179g gVar);

        void reloadWebUrl();

        void setLoadAsWebView();

        void setNavigationBarLoading(boolean z);

        void unregisterKeyBoardStateChange(IKeyBoardStateChange iKeyBoardStateChange);

        void unregisterPageLife(AbstractC66179g gVar);

        void updateWebTitle(String str, boolean z);
    }

    public interface IRenderManager {
        void addRenderComponent(int i, View view);

        void flushPendingJs(int i, Queue<String> queue);

        void invokeHandler(int i, int i2, String str);

        void olderInvokeHandler(int i, int i2, String str);

        void publish(int i, String str, String str2);

        void publishDirectly(int i, String str, String str2);

        void publishFirst(int i, String str, String str2, IAppContext iAppContext);

        void publishFrontOfQueue(int i, String str, String str2);
    }

    /* renamed from: com.tt.miniapp.RenderViewManager$a */
    public interface AbstractC65714a {
        /* renamed from: a */
        void mo230302a(int i, String str, String str2);
    }

    public void unRegisterFeedback() {
        this.mIFeedback = null;
    }

    public IRender getCurrentIRender() {
        return this.mCurrentRender;
    }

    private IRenderManager getRenderManager() {
        return (IRenderManager) this.mApp.getService(RenderEngineManager.class);
    }

    public void clear() {
        this.idToRender.clear();
        setCurrentRender(null);
    }

    @LifeCycleManager.LifecycleInterest({LifeCycleManager.LifeCycleEvent.ON_APP_INSTALL_SUCCESS})
    public void onAppInstallSuccess() {
        for (IRender iRender : this.idToRender.values()) {
            if (iRender instanceof AppbrandFragment) {
                ((AppbrandFragment) iRender).onAppInstallSuccess();
            }
        }
    }

    @LifeCycleManager.LifecycleInterest({LifeCycleManager.LifeCycleEvent.ON_APP_START_LAUNCHING})
    public void onAppStartLaunch() {
        for (IRender iRender : this.idToRender.values()) {
            if (iRender instanceof AppbrandFragment) {
                ((AppbrandFragment) iRender).onAppStartLaunching();
            }
        }
    }

    public void registerFeedback(AbstractC65714a aVar) {
        this.mIFeedback = aVar;
    }

    public void setCurrentRender(IRender iRender) {
        this.mCurrentRender = iRender;
    }

    public IRender getRender(int i) {
        return this.idToRender.get(Integer.valueOf(i));
    }

    public void removeRender(int i) {
        this.idToRender.remove(Integer.valueOf(i));
    }

    protected RenderViewManager(AppbrandApplicationImpl appbrandApplicationImpl) {
        super(appbrandApplicationImpl);
    }

    public void addRender(IRender iRender) {
        if (iRender != null && iRender.getRealRenderView() != null) {
            this.idToRender.put(Integer.valueOf(iRender.getRenderViewId()), iRender);
        }
    }

    public boolean readyToExecuteJs(int i) {
        IRender iRender = this.idToRender.get(Integer.valueOf(i));
        if (iRender != null) {
            return iRender.isTemplateReady();
        }
        return false;
    }

    public synchronized void flushPendingJs(int i) {
        Queue<String> queue = this.renderViewId2PendingJsArray.get(i);
        if (queue != null && queue.size() > 0) {
            LinkedList linkedList = new LinkedList(queue);
            queue.clear();
            getRenderManager().flushPendingJs(i, linkedList);
        }
    }

    public String getCallBackType(String str) throws JSONException {
        String optString = new JSONObject(str).optString(ApiHandler.API_CALLBACK_ERRMSG);
        String str2 = "cancel";
        if (!optString.contains(str2)) {
            str2 = "success";
        }
        if (optString.contains("fail")) {
            return "failure";
        }
        return str2;
    }

    public void publishPkgDownloadDone(boolean z) {
        for (Map.Entry<Integer, IRender> entry : this.idToRender.entrySet()) {
            entry.getValue().onPkgDownloadDone(z);
        }
    }

    public void addWebComponent(int i, View view) {
        getRenderManager().addRenderComponent(i, view);
    }

    public synchronized void addPendingJs(int i, String str) {
        if (this.renderViewId2PendingJsArray.get(i) == null) {
            this.renderViewId2PendingJsArray.put(i, new LinkedList());
        }
        this.renderViewId2PendingJsArray.get(i).add(str);
    }

    public void olderInvokeHandler(int i, int i2, String str) {
        getRenderManager().olderInvokeHandler(i, i2, str);
    }

    public void publishDirectly(int i, String str, String str2) {
        getRenderManager().publishDirectly(i, str, str2);
    }

    public void invokeHandler(int i, int i2, String str) {
        AppBrandLogger.m52828d("tma_RenderViewManager", "invokeHandler renderViewId ", Integer.valueOf(i), " callbackId ", Integer.valueOf(i2), " msg ", str);
        getRenderManager().invokeHandler(i, i2, str);
    }

    public void publish(int i, String str, String str2) {
        AppBrandLogger.m52828d("tma_RenderViewManager", "publish renderViewId ", Integer.valueOf(i), " event ", str, " msg ", str2);
        AbstractC65714a aVar = this.mIFeedback;
        if (aVar != null) {
            aVar.mo230302a(i, str, str2);
        }
        getRenderManager().publish(i, str, str2);
    }

    public void publishFrontOfQueue(int i, String str, String str2) {
        AppBrandLogger.m52828d("tma_RenderViewManager", "publish renderViewId ", Integer.valueOf(i), " event ", str, " msg ", str2);
        AbstractC65714a aVar = this.mIFeedback;
        if (aVar != null) {
            aVar.mo230302a(i, str, str2);
        }
        getRenderManager().publishFrontOfQueue(i, str, str2);
    }

    public void publishFirst(int i, String str, String str2, IAppContext iAppContext) {
        AppBrandLogger.m52828d("tma_RenderViewManager", "publish renderViewId ", Integer.valueOf(i), " event ", str, " msg ", str2);
        AbstractC65714a aVar = this.mIFeedback;
        if (aVar != null) {
            aVar.mo230302a(i, str, str2);
        }
        getRenderManager().publishFirst(i, str, str2, iAppContext);
    }
}
