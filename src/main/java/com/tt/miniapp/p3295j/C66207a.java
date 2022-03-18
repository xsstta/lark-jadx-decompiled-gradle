package com.tt.miniapp.p3295j;

import android.app.Activity;
import android.view.View;
import android.webkit.WebView;
import com.tt.frontendapiinterface.IBackPressedListener;
import com.tt.miniapp.AbstractC66179g;
import com.tt.miniapp.IKeyBoardStateChange;
import com.tt.miniapp.RenderViewManager;
import com.tt.miniapp.component.nativeview.NativeViewManager;
import com.tt.option.ext.WebEventCallback;
import com.tt.option.p3389j.AbstractC67645c;
import java.util.Collections;
import java.util.List;

/* renamed from: com.tt.miniapp.j.a */
public class C66207a implements RenderViewManager.IRender {

    /* renamed from: a */
    private WebView f167119a;

    /* renamed from: b */
    private int f167120b;

    @Override // com.tt.frontendapiinterface.IBaseRender
    public void addNativeView(int i, String str, String str2, WebEventCallback webEventCallback) {
    }

    @Override // com.tt.frontendapiinterface.IBaseRender
    public List<IBackPressedListener> getBackPressedListener() {
        return null;
    }

    @Override // com.tt.frontendapiinterface.IBaseRender
    public Activity getCurrentActivity() {
        return null;
    }

    @Override // com.tt.miniapp.RenderViewManager.IRender
    public AbstractC67645c getFileChooseHandler() {
        return null;
    }

    @Override // com.tt.frontendapiinterface.IBaseRender
    public View getNativeView(int i) {
        return null;
    }

    @Override // com.tt.miniapp.RenderViewManager.IRender
    public NativeViewManager getNativeViewManager() {
        return null;
    }

    @Override // com.tt.frontendapiinterface.IBaseRender
    public String getPage() {
        return null;
    }

    @Override // com.tt.frontendapiinterface.IBaseRender
    public int getRenderHeight() {
        return 0;
    }

    @Override // com.tt.frontendapiinterface.IBaseRender
    public int getRenderWidth() {
        return 0;
    }

    @Override // com.tt.miniapp.RenderViewManager.IRender
    public View getRootView() {
        return null;
    }

    @Override // com.tt.frontendapiinterface.IBaseRender
    public int getTitleBarHeight() {
        return 0;
    }

    @Override // com.tt.frontendapiinterface.IBaseRender
    public boolean hasNativeView(int i) {
        return false;
    }

    @Override // com.tt.frontendapiinterface.IBaseRender
    public void hideConfirmBar() {
    }

    @Override // com.tt.miniapp.RenderViewManager.IRender
    public void hideNavigationBarHomeButton() {
    }

    @Override // com.tt.miniapp.RenderViewManager.IRender
    public boolean isRenderInBrowserEnabled() {
        return false;
    }

    @Override // com.tt.miniapp.RenderViewManager.IRender
    public boolean isTemplateReady() {
        return true;
    }

    @Override // com.tt.miniapp.RenderViewManager.IRender
    public void onDOMReady() {
    }

    @Override // com.tt.miniapp.RenderViewManager.IRender
    public void onNativeWebViewPageFinished(boolean z) {
    }

    @Override // com.tt.miniapp.RenderViewManager.IRender
    public void onPkgDownloadDone(boolean z) {
    }

    @Override // com.tt.frontendapiinterface.IBaseRender
    public void onStartPullDownRefresh() {
    }

    @Override // com.tt.frontendapiinterface.IBaseRender
    public void onStopPullDownRefresh() {
    }

    @Override // com.tt.miniapp.RenderViewManager.IRender
    public void onSubAppInstallSuccess() {
    }

    @Override // com.tt.frontendapiinterface.IBaseRender
    public boolean pullDownRefreshEnabled() {
        return false;
    }

    @Override // com.tt.frontendapiinterface.IBaseRender
    public void registerBackPressedListener(IBackPressedListener iBackPressedListener) {
    }

    @Override // com.tt.miniapp.RenderViewManager.IRender
    public void registerKeyBoardStateChange(IKeyBoardStateChange iKeyBoardStateChange) {
    }

    @Override // com.tt.miniapp.RenderViewManager.IRender
    public void registerPageLife(AbstractC66179g gVar) {
    }

    @Override // com.tt.miniapp.RenderViewManager.IRender
    public void reloadWebUrl() {
    }

    @Override // com.tt.frontendapiinterface.IBaseRender
    public void removeNativeView(int i, WebEventCallback webEventCallback) {
    }

    @Override // com.tt.miniapp.RenderViewManager.IRender
    public void setLoadAsWebView() {
    }

    @Override // com.tt.frontendapiinterface.IBaseRender
    public void setNavigationBarColor(String str, String str2) {
    }

    @Override // com.tt.miniapp.RenderViewManager.IRender
    public void setNavigationBarLoading(boolean z) {
    }

    @Override // com.tt.frontendapiinterface.IBaseRender
    public void setNavigationBarTitle(String str) {
    }

    @Override // com.tt.frontendapiinterface.IBaseRender
    public void showConfirmBar() {
    }

    @Override // com.tt.frontendapiinterface.IBaseRender
    public void showKeyboard(int i) {
    }

    @Override // com.tt.frontendapiinterface.IBaseRender
    public void unregisterBackPressedListener(IBackPressedListener iBackPressedListener) {
    }

    @Override // com.tt.miniapp.RenderViewManager.IRender
    public void unregisterKeyBoardStateChange(IKeyBoardStateChange iKeyBoardStateChange) {
    }

    @Override // com.tt.miniapp.RenderViewManager.IRender
    public void unregisterPageLife(AbstractC66179g gVar) {
    }

    @Override // com.tt.frontendapiinterface.IBaseRender
    public void updateNativeView(int i, String str, WebEventCallback webEventCallback) {
    }

    @Override // com.tt.miniapp.RenderViewManager.IRender
    public void updateWebTitle(String str, boolean z) {
    }

    /* renamed from: a */
    public WebView getRealRenderView() {
        return this.f167119a;
    }

    @Override // com.tt.miniapp.RenderViewManager.IRender
    public List<String> getDependencyJsComponents() {
        return Collections.EMPTY_LIST;
    }

    @Override // com.tt.frontendapiinterface.IBaseRender
    public int getRenderViewId() {
        return this.f167120b;
    }

    public C66207a(WebView webView, int i) {
        this.f167119a = webView;
        this.f167120b = i;
    }
}
