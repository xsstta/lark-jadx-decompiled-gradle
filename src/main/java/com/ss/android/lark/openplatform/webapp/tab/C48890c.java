package com.ss.android.lark.openplatform.webapp.tab;

import android.text.TextUtils;
import com.bytedance.lark.pb.openplatform.v1.CommonEnum;
import com.bytedance.lark.pb.openplatform.v1.OpenAppBadgeNode;
import com.bytedance.lark.pb.openplatform.v1.PullOpenAppBadgeNodesResponse;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.callback.UICallbackExecutor;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.maincore.dto.TabAppInfo;
import com.ss.android.lark.openplatform.OpenPlatformModule;
import com.ss.android.lark.openplatform.webapp.p2407b.C48873a;
import com.ss.android.lark.opmonitor.service.OPMonitor;
import com.tt.refer.impl.business.p3427a.p3428a.C67869a;
import java.util.HashMap;
import java.util.List;

/* renamed from: com.ss.android.lark.openplatform.webapp.tab.c */
public class C48890c {

    /* renamed from: a */
    private WebAppMainTabView f122823a;

    /* renamed from: b */
    private WebAppNavigationTabView f122824b;

    /* renamed from: c */
    private final TabAppInfo f122825c;

    /* renamed from: d */
    private final C67869a.AbstractC67871a f122826d = new C67869a.AbstractC67871a() {
        /* class com.ss.android.lark.openplatform.webapp.tab.$$Lambda$c$flvwXIVXuS5XCZZGliSlrRceVw */

        @Override // com.tt.refer.impl.business.p3427a.p3428a.C67869a.AbstractC67871a
        public final void onBadgePush(List list, boolean z, boolean z2) {
            C48890c.m270875lambda$flvwXIVXuS5XCZZGliSlrRceVw(C48890c.this, list, z, z2);
        }
    };

    /* renamed from: e */
    private void m192610e() {
        C67869a.m264034a().mo235508a(this.f122826d);
    }

    /* renamed from: g */
    private void m192612g() {
        WebAppMainTabView webAppMainTabView = this.f122823a;
        if (webAppMainTabView != null) {
            webAppMainTabView.setCurrentBadgeNode(null);
        }
        WebAppNavigationTabView webAppNavigationTabView = this.f122824b;
        if (webAppNavigationTabView != null) {
            webAppNavigationTabView.setCurrentBadgeNode(null);
        }
    }

    /* renamed from: b */
    public boolean mo170732b() {
        return OpenPlatformModule.m192198d().getFgValue("gadget.open_app.badge");
    }

    /* renamed from: c */
    public void mo170733c() {
        if (this.f122824b != null || this.f122823a != null) {
            if (!mo170732b()) {
                m192612g();
            } else {
                m192611f();
            }
        }
    }

    /* renamed from: f */
    private void m192611f() {
        final TabAppInfo tabAppInfo = this.f122825c;
        if (tabAppInfo != null && tabAppInfo.getExtra() != null) {
            String appID = tabAppInfo.getExtra().getAppID();
            if (TextUtils.isEmpty(appID)) {
                Log.m165389i("WebAppTabBadgeHelper", "pull local web badge error：appID empty");
                return;
            }
            HashMap hashMap = new HashMap();
            hashMap.put(appID, Integer.valueOf(CommonEnum.OpenAppFeatureType.H5.getValue()));
            C67869a.m264037a(hashMap, new IGetDataCallback<PullOpenAppBadgeNodesResponse>() {
                /* class com.ss.android.lark.openplatform.webapp.tab.C48890c.C488911 */

                /* renamed from: a */
                public void onSuccess(PullOpenAppBadgeNodesResponse pullOpenAppBadgeNodesResponse) {
                    if (pullOpenAppBadgeNodesResponse == null) {
                        C48890c.m192604a(1, null, false, "local response is empty");
                        C48890c.this.mo170734d();
                        return;
                    }
                    C48890c.this.mo170731a(pullOpenAppBadgeNodesResponse.notice_nodes, "local");
                    C48890c.m192604a(1, pullOpenAppBadgeNodesResponse.notice_nodes, true, "");
                    C48890c.this.mo170734d();
                }

                @Override // com.larksuite.framework.callback.IGetDataCallback
                public void onError(ErrorResult errorResult) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("[error=");
                    sb.append(errorResult.toString());
                    sb.append(",");
                    if (tabAppInfo.getExtra() != null) {
                        TabAppInfo.Extra extra = tabAppInfo.getExtra();
                        sb.append("[appUrl=");
                        sb.append(extra.getUrl());
                        sb.append("]");
                    }
                    sb.append("]");
                    Log.m165383e("WebAppTabBadgeHelper", "pull local gadget badge error：" + ((Object) sb));
                    C48890c.m192604a(1, null, false, sb.toString());
                    C48890c.this.mo170734d();
                }
            }, true);
        }
    }

    /* renamed from: d */
    public void mo170734d() {
        final TabAppInfo tabAppInfo = this.f122825c;
        if (tabAppInfo != null && tabAppInfo.getExtra() != null) {
            String appID = tabAppInfo.getExtra().getAppID();
            if (TextUtils.isEmpty(appID)) {
                Log.m165389i("WebAppTabBadgeHelper", "pull net web badge error：appID empty");
                return;
            }
            HashMap hashMap = new HashMap();
            hashMap.put(appID, Integer.valueOf(CommonEnum.OpenAppFeatureType.H5.getValue()));
            C67869a.m264037a(hashMap, new IGetDataCallback<PullOpenAppBadgeNodesResponse>() {
                /* class com.ss.android.lark.openplatform.webapp.tab.C48890c.C488922 */

                /* renamed from: a */
                public void onSuccess(PullOpenAppBadgeNodesResponse pullOpenAppBadgeNodesResponse) {
                    if (pullOpenAppBadgeNodesResponse == null) {
                        C48890c.m192604a(2, null, false, "net response is empty");
                        return;
                    }
                    C48890c.this.mo170731a(pullOpenAppBadgeNodesResponse.notice_nodes, "net");
                    C48890c.m192604a(2, pullOpenAppBadgeNodesResponse.notice_nodes, true, "");
                }

                @Override // com.larksuite.framework.callback.IGetDataCallback
                public void onError(ErrorResult errorResult) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("[error=");
                    sb.append(errorResult.toString());
                    sb.append(",");
                    if (tabAppInfo.getExtra() != null) {
                        TabAppInfo.Extra extra = tabAppInfo.getExtra();
                        sb.append("[appUrl=");
                        sb.append(extra.getUrl());
                        sb.append("]");
                    }
                    sb.append("]");
                    Log.m165383e("WebAppTabBadgeHelper", "pull net gadget badge error：" + ((Object) sb));
                    C48890c.m192604a(2, null, false, sb.toString());
                }
            }, false);
        }
    }

    /* renamed from: a */
    public void mo170728a() {
        C67869a.m264034a().mo235509b(this.f122826d);
    }

    /* renamed from: a */
    public void mo170729a(WebAppMainTabView webAppMainTabView) {
        this.f122823a = webAppMainTabView;
    }

    /* renamed from: a */
    private long m192602a(String str) {
        try {
            return Long.parseLong(str);
        } catch (NumberFormatException unused) {
            return 0;
        }
    }

    private C48890c(TabAppInfo tabAppInfo) {
        this.f122825c = tabAppInfo;
        m192610e();
    }

    /* renamed from: a */
    public static C48890c m192603a(TabAppInfo tabAppInfo) {
        return new C48890c(tabAppInfo);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m192609b(OpenAppBadgeNode openAppBadgeNode) {
        if (!mo170732b()) {
            WebAppMainTabView webAppMainTabView = this.f122823a;
            if (webAppMainTabView != null) {
                webAppMainTabView.setCurrentBadgeNode(null);
            }
            WebAppNavigationTabView webAppNavigationTabView = this.f122824b;
            if (webAppNavigationTabView != null) {
                webAppNavigationTabView.setCurrentBadgeNode(null);
                return;
            }
            return;
        }
        WebAppMainTabView webAppMainTabView2 = this.f122823a;
        if (webAppMainTabView2 != null) {
            OpenAppBadgeNode currentBadgeNode = webAppMainTabView2.getCurrentBadgeNode();
            if (currentBadgeNode == null || openAppBadgeNode == null) {
                this.f122823a.setCurrentBadgeNode(openAppBadgeNode);
            } else if (m192602a(currentBadgeNode.version) <= m192602a(openAppBadgeNode.version)) {
                this.f122823a.setCurrentBadgeNode(openAppBadgeNode);
            }
        }
        WebAppNavigationTabView webAppNavigationTabView2 = this.f122824b;
        if (webAppNavigationTabView2 != null) {
            OpenAppBadgeNode currentBadgeNode2 = webAppNavigationTabView2.getCurrentBadgeNode();
            if (currentBadgeNode2 == null || openAppBadgeNode == null) {
                this.f122824b.setCurrentBadgeNode(openAppBadgeNode);
            } else if (m192602a(currentBadgeNode2.version) <= m192602a(openAppBadgeNode.version)) {
                this.f122824b.setCurrentBadgeNode(openAppBadgeNode);
            }
        }
    }

    /* renamed from: b */
    private static String m192608b(List<OpenAppBadgeNode> list) {
        String str;
        JsonArray jsonArray = new JsonArray();
        if (list != null) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                OpenAppBadgeNode openAppBadgeNode = list.get(i);
                CommonEnum.OpenAppFeatureType openAppFeatureType = openAppBadgeNode.feature;
                if (openAppFeatureType != null) {
                    str = openAppFeatureType.name();
                } else {
                    str = "";
                }
                JsonObject jsonObject = new JsonObject();
                jsonObject.addProperty("appId", openAppBadgeNode.app_id);
                jsonObject.addProperty(ShareHitPoint.f121869d, str);
                jsonObject.addProperty("num", openAppBadgeNode.badge_num);
                jsonObject.addProperty("show", openAppBadgeNode.need_show);
                jsonArray.add(jsonObject);
            }
        }
        return jsonArray.toString();
    }

    /* renamed from: a */
    public static void m192606a(List<OpenAppBadgeNode> list) {
        OPMonitor a = C48873a.m192552a("op_app_badge_node_push");
        a.addCategoryValue("scene", 2);
        a.addCategoryValue("badge_brief", m192608b(list));
        a.setResultTypeSuccess();
        a.setErrorMessage("");
        a.flush();
    }

    /* renamed from: a */
    public void mo170730a(WebAppNavigationTabView webAppNavigationTabView) {
        this.f122824b = webAppNavigationTabView;
    }

    /* renamed from: a */
    public void mo170731a(List<OpenAppBadgeNode> list, String str) {
        TabAppInfo tabAppInfo = this.f122825c;
        if (!(tabAppInfo == null || tabAppInfo.getExtra() == null)) {
            OpenAppBadgeNode openAppBadgeNode = null;
            TabAppInfo.Extra extra = tabAppInfo.getExtra();
            for (OpenAppBadgeNode openAppBadgeNode2 : list) {
                if (TextUtils.equals(openAppBadgeNode2.app_id, extra.getAppID()) && openAppBadgeNode2.feature == CommonEnum.OpenAppFeatureType.H5) {
                    openAppBadgeNode = openAppBadgeNode2;
                }
            }
            if (openAppBadgeNode != null) {
                Log.m165389i("WebAppTabBadgeHelper", "update net webapp tab badge：scene=" + str + "," + openAppBadgeNode);
                UICallbackExecutor.execute(new Runnable(openAppBadgeNode) {
                    /* class com.ss.android.lark.openplatform.webapp.tab.$$Lambda$c$IU26tc0KPUd49l1JixpEmdKVieE */
                    public final /* synthetic */ OpenAppBadgeNode f$1;

                    {
                        this.f$1 = r2;
                    }

                    public final void run() {
                        C48890c.lambda$IU26tc0KPUd49l1JixpEmdKVieE(C48890c.this, this.f$1);
                    }
                });
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m192607a(List<OpenAppBadgeNode> list, boolean z, boolean z2) {
        if (mo170732b() && list != null && !list.isEmpty()) {
            mo170731a(list, "push");
            m192606a(list);
        }
    }

    /* renamed from: a */
    public static void m192604a(int i, List<OpenAppBadgeNode> list, boolean z, String str) {
        OPMonitor a = C48873a.m192552a("op_app_badge_pull_node");
        a.addCategoryValue("scene", Integer.valueOf(i));
        a.addCategoryValue("badge_brief", m192608b(list));
        if (z) {
            a.setResultTypeSuccess();
        } else {
            a.setResultTypeFail();
        }
        a.setErrorMessage(str);
        a.flush();
    }
}
