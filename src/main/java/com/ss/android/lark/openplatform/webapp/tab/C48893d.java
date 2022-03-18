package com.ss.android.lark.openplatform.webapp.tab;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import android.view.View;
import android.webkit.WebView;
import androidx.fragment.app.Fragment;
import com.bytedance.ee.larkwebview.base.LarkWebView;
import com.bytedance.ee.webapp.C13802g;
import com.bytedance.ee.webapp.v2.WebAppContainerDelegate;
import com.bytedance.ee.webapp.v2.WebAppDelegateBinder;
import com.bytedance.lark.webview.container.impl.C19857c;
import com.larksuite.component.webview.container.C25822b;
import com.larksuite.component.webview.container.dto.AbstractC25833d;
import com.larksuite.component.webview.container.dto.C25830a;
import com.ss.android.lark.maincore.AbstractC44552i;
import com.ss.android.lark.maincore.ITitleController;
import com.ss.android.lark.maincore.ITitleInfo;
import com.ss.android.lark.maincore.TabType;
import com.ss.android.lark.maincore.dto.TabAppInfo;
import com.ss.android.lark.openplatform.OpenPlatformModule;
import com.ss.android.lark.openplatform.openapp.BotOpenData;
import com.ss.android.lark.openplatform.openapp.ID_TYPE;
import com.ss.android.lark.openplatform.p2399a.AbstractC48793a;
import com.ss.android.lark.openplatform.webapp.p2406a.C48870a;
import com.ss.android.lark.openplatform.webapp.tab.p2410a.AbstractC48889e;
import com.ss.android.lark.openplatform.webapp.tab.plugin.SetMainNavRightItemsPlugin;
import com.ss.android.lark.sdk.C53241h;
import com.tt.refer.impl.business.p3433d.AbstractC67905a;
import java.util.Map;

/* renamed from: com.ss.android.lark.openplatform.webapp.tab.d */
public class C48893d implements AbstractC44552i, AbstractC44552i.AbstractC44556d {

    /* renamed from: a */
    public C48898e f122831a;

    /* renamed from: b */
    public TabAppInfo f122832b;

    /* renamed from: c */
    public WebAppMainTabView f122833c;

    /* renamed from: d */
    public C19857c f122834d;

    /* renamed from: e */
    public WebAppDelegateBinder f122835e;

    /* renamed from: f */
    public boolean f122836f;

    /* renamed from: g */
    private Context f122837g;

    /* renamed from: h */
    private ITitleController f122838h;

    /* renamed from: i */
    private WebAppNavigationTabView f122839i;

    /* renamed from: j */
    private boolean f122840j;

    /* renamed from: k */
    private final C48890c f122841k;

    /* renamed from: l */
    private AbstractC44552i.AbstractC44553a f122842l = new AbstractC44552i.AbstractC44553a() {
        /* class com.ss.android.lark.openplatform.webapp.tab.C48893d.C488941 */

        @Override // com.ss.android.lark.maincore.AbstractC44552i.AbstractC44553a
        /* renamed from: b */
        public void mo31325b(String str, String str2) {
        }

        @Override // com.ss.android.lark.maincore.AbstractC44552i.AbstractC44553a
        /* renamed from: a */
        public void mo31324a(String str, String str2) {
            if (C48893d.this.f122832b != null) {
                boolean equals = TextUtils.equals(C48893d.this.f122832b.getKey(), str);
                boolean equals2 = TextUtils.equals(C48893d.this.f122832b.getKey(), str2);
                if (C48893d.this.f122833c != null) {
                    if (equals && !equals2) {
                        C48893d.this.f122833c.mo110683b();
                    }
                    if (!equals && equals2) {
                        C48893d.this.f122833c.mo110677a();
                        if (C48893d.this.f122831a != null) {
                            C48893d.this.f122831a.mo170744i();
                        }
                    }
                }
            }
        }
    };

    @Override // com.ss.android.lark.maincore.AbstractC44552i
    /* renamed from: a */
    public void mo31309a(Bundle bundle) {
    }

    @Override // com.ss.android.lark.maincore.AbstractC44552i
    /* renamed from: d */
    public int mo31313d() {
        return 1;
    }

    @Override // com.ss.android.lark.maincore.AbstractC44552i
    /* renamed from: e */
    public boolean mo31314e() {
        return false;
    }

    @Override // com.ss.android.lark.maincore.AbstractC44552i
    /* renamed from: h */
    public int mo31317h() {
        return 1;
    }

    @Override // com.ss.android.lark.maincore.AbstractC44552i
    /* renamed from: m */
    public AbstractC44552i.AbstractC44554b mo31322m() {
        return null;
    }

    @Override // com.ss.android.lark.maincore.AbstractC44552i
    /* renamed from: n */
    public void mo31323n() {
    }

    @Override // com.ss.android.lark.maincore.AbstractC44552i
    /* renamed from: f */
    public void mo31315f() {
        m192622r();
    }

    @Override // com.ss.android.lark.maincore.AbstractC44552i
    /* renamed from: l */
    public AbstractC44552i.AbstractC44553a mo31321l() {
        return this.f122842l;
    }

    @Override // com.ss.android.lark.maincore.AbstractC44552i
    /* renamed from: b */
    public String mo31311b() {
        return this.f122832b.getKey();
    }

    @Override // com.ss.android.lark.maincore.AbstractC44552i
    /* renamed from: g */
    public void mo31316g() {
        this.f122841k.mo170728a();
    }

    @Override // com.ss.android.lark.maincore.AbstractC44552i.AbstractC44556d
    /* renamed from: q */
    public void mo103432q() {
        this.f122841k.mo170733c();
    }

    @Override // com.ss.android.lark.maincore.AbstractC44552i
    /* renamed from: i */
    public Fragment mo31318i() {
        if (this.f122834d == null) {
            m192622r();
        }
        return this.f122834d;
    }

    @Override // com.ss.android.lark.maincore.AbstractC44552i
    /* renamed from: k */
    public ITitleInfo mo31320k() {
        if (this.f122831a == null) {
            this.f122831a = mo170738a();
        }
        return this.f122831a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C48898e mo170738a() {
        return new C48898e(this.f122837g, this.f122832b, new AbstractC48889e() {
            /* class com.ss.android.lark.openplatform.webapp.tab.C48893d.C488974 */

            @Override // com.ss.android.lark.openplatform.webapp.tab.p2410a.AbstractC48889e
            /* renamed from: b */
            public void mo170718b() {
                if (C48893d.this.f122835e != null) {
                    try {
                        C48893d.this.f122835e.goBack();
                    } catch (RemoteException e) {
                        C53241h.m205895a("WebAppTabPageSpecV2", "delegateBinder call goBack error : ", e);
                    }
                }
            }

            @Override // com.ss.android.lark.openplatform.webapp.tab.p2410a.AbstractC48889e
            /* renamed from: d */
            public void mo170723d() {
                if (C48893d.this.f122835e != null) {
                    try {
                        C48893d.this.f122835e.goForward();
                    } catch (RemoteException e) {
                        C53241h.m205895a("WebAppTabPageSpecV2", "delegateBinder call goForward error : ", e);
                    }
                }
            }

            @Override // com.ss.android.lark.openplatform.webapp.tab.p2410a.AbstractC48889e
            /* renamed from: e */
            public void mo170724e() {
                if (C48893d.this.f122834d != null) {
                    C48893d.this.f122834d.mo67292e();
                    C53241h.m205898b("WebAppTabPageSpecV2", "tab titleBar trigger reload");
                }
            }

            @Override // com.ss.android.lark.openplatform.webapp.tab.p2410a.AbstractC48889e
            /* renamed from: f */
            public String mo170725f() {
                if (C48893d.this.f122835e != null) {
                    try {
                        return C48893d.this.f122835e.getBotId();
                    } catch (RemoteException e) {
                        C53241h.m205895a("WebAppTabPageSpecV2", "delegateBinder call getBotid error : ", e);
                    }
                }
                return "";
            }

            @Override // com.ss.android.lark.openplatform.webapp.tab.p2410a.AbstractC48889e
            /* renamed from: g */
            public String mo170726g() {
                try {
                    return C48893d.this.f122832b.getExtra().getAppID();
                } catch (Exception e) {
                    C53241h.m205895a("WebAppTabPageSpecV2", "getAppid exception : ", e);
                    return "";
                }
            }

            @Override // com.ss.android.lark.openplatform.webapp.tab.p2410a.AbstractC48889e
            /* renamed from: a */
            public boolean mo170716a() {
                boolean z = false;
                if (C48893d.this.f122835e == null) {
                    return false;
                }
                try {
                    z = C48893d.this.f122835e.canGoBack();
                    C53241h.m205898b("WebAppTabPageSpecV2", "canGoBack " + z);
                    return z;
                } catch (RemoteException e) {
                    C53241h.m205895a("WebAppTabPageSpecV2", "delegateBinder call canGoback error : ", e);
                    return z;
                }
            }

            @Override // com.ss.android.lark.openplatform.webapp.tab.p2410a.AbstractC48889e
            /* renamed from: c */
            public boolean mo170722c() {
                boolean z = false;
                if (C48893d.this.f122835e == null) {
                    return false;
                }
                try {
                    z = C48893d.this.f122835e.canGoForward();
                    C53241h.m205898b("WebAppTabPageSpecV2", "canGoForward = " + z);
                    return z;
                } catch (RemoteException e) {
                    C53241h.m205895a("WebAppTabPageSpecV2", "delegateBinder call canGoBack error : ", e);
                    return z;
                }
            }

            @Override // com.ss.android.lark.openplatform.webapp.tab.p2410a.AbstractC48889e
            /* renamed from: a */
            public boolean mo170717a(String str) {
                C53241h.m205898b("WebAppTabPageSpecV2", "getCommonState " + C48893d.this.f122836f);
                return C48893d.this.f122836f;
            }

            @Override // com.ss.android.lark.openplatform.webapp.tab.p2410a.AbstractC48889e
            /* renamed from: b */
            public void mo170720b(String str) {
                try {
                    C53241h.m205898b("WebAppTabPageSpecV2", "start addCommon " + str);
                    C48893d.this.f122835e.addCommonApp(str, new WebAppTabPageSpecV2$4$1(this));
                } catch (Exception e) {
                    C53241h.m205895a("WebAppTabPageSpecV2", "addCommon exception ", e);
                }
            }

            @Override // com.ss.android.lark.openplatform.webapp.tab.p2410a.AbstractC48889e
            /* renamed from: c */
            public void mo170721c(String str) {
                try {
                    C53241h.m205898b("WebAppTabPageSpecV2", "start removeCommon " + str);
                    C48893d.this.f122835e.removeCommonApp(str, new WebAppTabPageSpecV2$4$2(this));
                } catch (Exception e) {
                    C53241h.m205895a("WebAppTabPageSpecV2", "removeCommon exception ", e);
                }
            }

            @Override // com.ss.android.lark.openplatform.webapp.tab.p2410a.AbstractC48889e
            /* renamed from: b */
            public void mo170719b(Context context, String str) {
                OpenPlatformModule.m192198d().openAboutActivity(context, str);
            }

            @Override // com.ss.android.lark.openplatform.webapp.tab.p2410a.AbstractC48889e
            /* renamed from: a */
            public void mo170715a(Context context, String str) {
                OpenPlatformModule.m192198d().startChatWindowByOpenData(new BotOpenData(str, ID_TYPE.BOT_ID));
            }
        });
    }

    @Override // com.ss.android.lark.maincore.AbstractC44552i
    /* renamed from: c */
    public <T extends View> T mo31312c() {
        if (this.f122833c == null) {
            WebAppMainTabView a = mo170737a(this.f122832b);
            this.f122833c = a;
            this.f122841k.mo170729a(a);
            this.f122841k.mo170733c();
        }
        return this.f122833c;
    }

    @Override // com.ss.android.lark.maincore.AbstractC44552i
    /* renamed from: j */
    public <T extends View> T mo31319j() {
        if (this.f122839i == null) {
            WebAppNavigationTabView b = mo170739b(this.f122832b);
            this.f122839i = b;
            this.f122841k.mo170730a(b);
            this.f122841k.mo170733c();
        }
        return this.f122839i;
    }

    /* renamed from: o */
    public int mo170740o() {
        if (OpenPlatformModule.m192198d().getMainDependency().mo144963a(this.f122832b.getKey()) == TabType.Main) {
            return 1506;
        }
        return 1507;
    }

    /* renamed from: s */
    private void m192623s() {
        String str;
        if (this.f122835e != null) {
            try {
                TabAppInfo tabAppInfo = this.f122832b;
                if (tabAppInfo == null) {
                    str = "";
                } else {
                    str = tabAppInfo.getKey();
                }
                C53241h.m205898b("WebAppTabPageSpecV2", "webapp tabkey = " + str);
                this.f122835e.setWebLifecycleListener(new WebAppTabPageSpecV2$6(this, str));
            } catch (RemoteException e) {
                C53241h.m205895a("WebAppTabPageSpecV2", "tab set lifecycler exception ", e);
            }
        }
    }

    /* renamed from: p */
    public void mo170741p() {
        String appID = this.f122832b.getExtra().getAppID();
        WebAppDelegateBinder webAppDelegateBinder = this.f122835e;
        if (webAppDelegateBinder != null) {
            try {
                webAppDelegateBinder.requestCommonApp(appID, new WebAppTabPageSpecV2$5(this));
            } catch (Exception e) {
                e.printStackTrace();
                C53241h.m205895a("WebAppTabPageSpecV2", "requestCommon exception ", e);
            }
        }
    }

    /* renamed from: r */
    private void m192622r() {
        if (!this.f122840j) {
            C13802g.m55926a().mo50865a(new C48870a(this.f122837g, OpenPlatformModule.m192198d()));
            OpenPlatformModule.m192198d().registerWebLifecycleListener(new AbstractC48793a.AbstractC48800g() {
                /* class com.ss.android.lark.openplatform.webapp.tab.C48893d.C488952 */

                /* renamed from: b */
                private boolean f122845b = true;

                @Override // com.ss.android.lark.openplatform.p2399a.AbstractC48793a.AbstractC48800g
                /* renamed from: a */
                public void mo170523a(WebView webView, Context context, String str, Map<String, String> map) {
                    C53241h.m205898b("WebAppTabPageSpecV2", " page finish refresh title layout");
                    C48893d.this.f122831a.mo170744i();
                }

                @Override // com.ss.android.lark.openplatform.p2399a.AbstractC48793a.AbstractC48800g
                /* renamed from: b */
                public void mo170524b(WebView webView, Context context, String str, Map<String, String> map) {
                    if (this.f122845b && (webView instanceof LarkWebView) && C48893d.this.mo31320k() != null && C48893d.this.f122831a.mo170743h()) {
                        ((LarkWebView) webView).mo49728a(new SetMainNavRightItemsPlugin(C48893d.this.f122831a, C48893d.this.f122835e));
                        this.f122845b = false;
                    }
                }
            });
            Bundle bundle = new Bundle();
            bundle.putString("url", this.f122832b.getExtra().getUrl());
            bundle.putString("key_appid", this.f122832b.getExtra().getAppID());
            bundle.putString("key_appname", C48880a.m192567a(this.f122837g, this.f122832b));
            bundle.putInt("key_scene", mo170740o());
            bundle.putBoolean("key_is_tab_mode", true);
            C25830a webAppInjector = OpenPlatformModule.m192198d().getWebAppInjector();
            WebAppContainerDelegate webAppContainerDelegate = new WebAppContainerDelegate();
            WebAppDelegateBinder webAppDelegateBinder = new WebAppDelegateBinder();
            this.f122835e = webAppDelegateBinder;
            try {
                webAppDelegateBinder.setTabTitleBarHeight(this.f122838h.mo99189a());
            } catch (RemoteException e) {
                e.printStackTrace();
            }
            m192623s();
            webAppContainerDelegate.mo50982a(this.f122835e);
            if (this.f122832b.getExtra() != null) {
                webAppContainerDelegate.mo50985a(this.f122838h);
                final String key = this.f122832b.getKey();
                webAppContainerDelegate.mo50987a(new AbstractC67905a() {
                    /* class com.ss.android.lark.openplatform.webapp.tab.C48893d.C488963 */

                    @Override // com.tt.refer.impl.business.p3433d.AbstractC67905a
                    /* renamed from: a */
                    public void mo149244a() {
                        C53241h.m205898b("WebAppTabPageSpecV2", "onFirstFrameDraw");
                        OpenPlatformModule.m192198d().getMainDependency().mo144965c(key);
                    }

                    @Override // com.tt.refer.impl.business.p3433d.AbstractC67905a
                    /* renamed from: b */
                    public void mo149245b() {
                        C53241h.m205898b("WebAppTabPageSpecV2", "onFirstFrameShow");
                        OpenPlatformModule.m192198d().getMainDependency().mo144966d(key);
                    }
                });
            } else {
                C53241h.m205898b("WebAppTabPageSpecV2", "getPageContent tabAppInfo.extra is null");
            }
            webAppInjector.mo91890a(webAppContainerDelegate);
            C25822b.m93352b().mo91901a(bundle, webAppInjector);
            this.f122834d = (C19857c) AbstractC25833d.CC.m93462a(this.f122837g, bundle, null).mo67297i();
            this.f122840j = true;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public WebAppMainTabView mo170737a(TabAppInfo tabAppInfo) {
        WebAppMainTabView webAppMainTabView = new WebAppMainTabView(this.f122837g);
        webAppMainTabView.mo170700a(tabAppInfo);
        return webAppMainTabView;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public WebAppNavigationTabView mo170739b(TabAppInfo tabAppInfo) {
        WebAppNavigationTabView webAppNavigationTabView = new WebAppNavigationTabView(this.f122837g);
        webAppNavigationTabView.mo170703a(tabAppInfo);
        return webAppNavigationTabView;
    }

    public C48893d(Context context, ITitleController iTitleController, TabAppInfo tabAppInfo) {
        this.f122837g = context;
        this.f122838h = iTitleController;
        this.f122832b = tabAppInfo;
        this.f122841k = C48890c.m192603a(tabAppInfo);
    }
}
