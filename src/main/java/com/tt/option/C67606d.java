package com.tt.option;

import android.app.Activity;
import android.webkit.WebView;
import com.bytedance.ee.bear.atfinder.AbstractC4272g;
import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.he.loader.SettingsProvider;
import com.tt.miniapphost.entity.AppLaunchInfo;
import com.tt.miniapphost.entity.DisableStateEntity;
import com.tt.option.p3390k.AbstractC67648c;
import com.tt.p3256b.AbstractC65679a;
import java.util.List;
import org.json.JSONObject;

/* renamed from: com.tt.option.d */
public class C67606d {

    /* renamed from: com.tt.option.d$a */
    public interface AbstractC67608a {
    }

    /* renamed from: com.tt.option.d$b */
    public interface AbstractC67609b {

        /* renamed from: com.tt.option.d$b$a */
        public interface AbstractC67610a {
            /* renamed from: a */
            void mo231790a();

            /* renamed from: b */
            void mo231791b();
        }

        /* renamed from: a */
        long mo48977a(String str);

        /* renamed from: a */
        void mo48978a(String str, String str2, AbstractC67610a aVar, IAppContext iAppContext);
    }

    public boolean bindPhoneNumber(AbstractC67608a aVar) {
        return false;
    }

    public DisableStateEntity checkExtraAppbrandDisableState(int i) {
        return null;
    }

    public void doEditorAtSearch(String str, String str2, AbstractC4272g gVar, IAppContext iAppContext) {
    }

    public boolean gamePay(Activity activity, JSONObject jSONObject, String str) {
        return false;
    }

    public List<AppLaunchInfo> getAppLaunchInfo() {
        return null;
    }

    public double getBlankRate(String str) {
        return 0.05d;
    }

    public boolean getFeatureGating(String str) {
        return false;
    }

    public boolean getFeatureGating(String str, boolean z) {
        return z;
    }

    public <T> T getHostData(int i, T t, IAppContext iAppContext) {
        return t;
    }

    public AbstractC65679a getMiniAppLifeCycleInstance(IAppContext iAppContext) {
        return null;
    }

    public int getMiniAppProcessCount() {
        return 0;
    }

    public boolean getPayEnable() {
        return true;
    }

    public List<AppLaunchInfo> getRecommendList() {
        return null;
    }

    public SettingsProvider getSettingsProvider() {
        return null;
    }

    public long getSettingsRequestDelayTime() {
        return 3000;
    }

    public JSONObject getTmaFeatureConfig() {
        return null;
    }

    public boolean isCheckSafeDomain(boolean z, String str, String str2, IAppContext iAppContext) {
        return z;
    }

    public boolean isEnablePermissionSaveTest() {
        return true;
    }

    public boolean isEnableWebviewPreload() {
        return true;
    }

    public boolean isHideTitleMenuAboutItem() {
        return false;
    }

    public boolean isPreRenderApp() {
        return true;
    }

    public boolean isPreloadSp() {
        return false;
    }

    public boolean isReturnDeviceIdInSystemInfo() {
        return false;
    }

    public boolean isSlideActivity(String str) {
        return false;
    }

    public boolean isSupportExitEntirely() {
        return false;
    }

    public boolean needSettingTitleMenuItem() {
        return true;
    }

    public void onCreateWebView(WebView webView) {
    }

    public void onWebViewComponentDestroyed(WebView webView, IAppContext iAppContext) {
    }

    public List<AbstractC67648c> replaceMenuItems(List<AbstractC67648c> list, IAppContext iAppContext) {
        return list;
    }

    public String replaceProcessName(String str) {
        return str;
    }

    public void serviceCommandAction(String str, String str2, IAppContext iAppContext) {
    }

    public boolean shouldCheckPermissionBeforeCallhostmethod() {
        return true;
    }

    public boolean startAboutActivity(Activity activity, IAppContext iAppContext) {
        return false;
    }

    public void syncWebViewLoginCookie(String str) {
    }

    public AbstractC67609b createBlockLoadingCallback() {
        return new AbstractC67609b() {
            /* class com.tt.option.C67606d.C676071 */

            @Override // com.tt.option.C67606d.AbstractC67609b
            /* renamed from: a */
            public long mo48977a(String str) {
                return 0;
            }

            @Override // com.tt.option.C67606d.AbstractC67609b
            /* renamed from: a */
            public void mo48978a(String str, String str2, AbstractC67609b.AbstractC67610a aVar, IAppContext iAppContext) {
            }
        };
    }
}
