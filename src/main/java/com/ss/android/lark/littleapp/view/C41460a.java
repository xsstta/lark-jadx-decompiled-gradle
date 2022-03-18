package com.ss.android.lark.littleapp.view;

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
import com.ss.android.lark.littleapp.C41354g;
import com.ss.android.lark.littleapp.p2125c.C41314a;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.maincore.dto.TabAppInfo;
import com.ss.android.lark.opmonitor.service.OPMonitor;
import com.tt.refer.impl.business.p3427a.p3428a.C67869a;
import java.util.HashMap;
import java.util.List;

/* renamed from: com.ss.android.lark.littleapp.view.a */
public class C41460a {

    /* renamed from: a */
    private GadgetMainTabView f105408a;

    /* renamed from: b */
    private GadgetNavigationTabView f105409b;

    /* renamed from: c */
    private final TabAppInfo f105410c;

    /* renamed from: d */
    private final C67869a.AbstractC67871a f105411d = new C67869a.AbstractC67871a() {
        /* class com.ss.android.lark.littleapp.view.C41460a.C414611 */

        @Override // com.tt.refer.impl.business.p3427a.p3428a.C67869a.AbstractC67871a
        public void onBadgePush(List<OpenAppBadgeNode> list, boolean z, boolean z2) {
            C41460a.this.mo149236a(list, z, z2);
        }
    };

    /* renamed from: e */
    private void m164508e() {
        C67869a.m264034a().mo235508a(this.f105411d);
    }

    /* renamed from: g */
    private void m164510g() {
        GadgetMainTabView gadgetMainTabView = this.f105408a;
        if (gadgetMainTabView != null) {
            gadgetMainTabView.setCurrentBadgeNode(null);
        }
        GadgetNavigationTabView gadgetNavigationTabView = this.f105409b;
        if (gadgetNavigationTabView != null) {
            gadgetNavigationTabView.setCurrentBadgeNode(null);
        }
    }

    /* renamed from: b */
    public boolean mo149237b() {
        return C41354g.m163939a().getFgValue("gadget.open_app.badge");
    }

    /* renamed from: a */
    public void mo149231a() {
        C67869a.m264034a().mo235509b(this.f105411d);
    }

    /* renamed from: c */
    public void mo149238c() {
        if (this.f105409b != null || this.f105408a != null) {
            if (!mo149237b()) {
                m164510g();
            } else {
                m164509f();
            }
        }
    }

    /* renamed from: f */
    private void m164509f() {
        final TabAppInfo tabAppInfo = this.f105410c;
        if (tabAppInfo != null && tabAppInfo.getExtra() != null) {
            String appID = tabAppInfo.getExtra().getAppID();
            if (TextUtils.isEmpty(appID)) {
                Log.m165389i("GadgetTabBadgeHelper", "pull local gadget badge error：appID empty");
                return;
            }
            HashMap hashMap = new HashMap();
            hashMap.put(appID, Integer.valueOf(CommonEnum.OpenAppFeatureType.MiniApp.getValue()));
            C67869a.m264037a(hashMap, new IGetDataCallback<PullOpenAppBadgeNodesResponse>() {
                /* class com.ss.android.lark.littleapp.view.C41460a.C414622 */

                /* renamed from: a */
                public void onSuccess(PullOpenAppBadgeNodesResponse pullOpenAppBadgeNodesResponse) {
                    if (pullOpenAppBadgeNodesResponse == null) {
                        C41460a.m164505a(1, null, false, "local response is empty");
                        C41460a.this.mo149239d();
                        return;
                    }
                    C41460a.this.mo149235a(pullOpenAppBadgeNodesResponse.notice_nodes, "local");
                    C41460a.m164505a(1, pullOpenAppBadgeNodesResponse.notice_nodes, true, "");
                    C41460a.this.mo149239d();
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
                    Log.m165383e("GadgetTabBadgeHelper", "pull local gadget badge error：" + ((Object) sb));
                    C41460a.m164505a(1, null, false, sb.toString());
                    C41460a.this.mo149239d();
                }
            }, true);
        }
    }

    /* renamed from: d */
    public void mo149239d() {
        final TabAppInfo tabAppInfo = this.f105410c;
        if (tabAppInfo != null && tabAppInfo.getExtra() != null) {
            String appID = tabAppInfo.getExtra().getAppID();
            if (TextUtils.isEmpty(appID)) {
                Log.m165389i("GadgetTabBadgeHelper", "pull net gadget badge error：appID empty");
                return;
            }
            HashMap hashMap = new HashMap();
            hashMap.put(appID, Integer.valueOf(CommonEnum.OpenAppFeatureType.MiniApp.getValue()));
            C67869a.m264037a(hashMap, new IGetDataCallback<PullOpenAppBadgeNodesResponse>() {
                /* class com.ss.android.lark.littleapp.view.C41460a.C414633 */

                /* renamed from: a */
                public void onSuccess(PullOpenAppBadgeNodesResponse pullOpenAppBadgeNodesResponse) {
                    if (pullOpenAppBadgeNodesResponse == null) {
                        C41460a.m164505a(2, null, false, "net response is empty");
                        return;
                    }
                    C41460a.this.mo149235a(pullOpenAppBadgeNodesResponse.notice_nodes, "net");
                    C41460a.m164505a(2, pullOpenAppBadgeNodesResponse.notice_nodes, true, "");
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
                    Log.m165383e("GadgetTabBadgeHelper", "pull net gadget badge error：" + ((Object) sb));
                    C41460a.m164505a(2, null, false, sb.toString());
                }
            }, false);
        }
    }

    /* renamed from: a */
    public void mo149233a(GadgetMainTabView gadgetMainTabView) {
        this.f105408a = gadgetMainTabView;
    }

    /* renamed from: a */
    private long m164503a(String str) {
        try {
            return Long.parseLong(str);
        } catch (NumberFormatException unused) {
            return 0;
        }
    }

    private C41460a(TabAppInfo tabAppInfo) {
        this.f105410c = tabAppInfo;
        m164508e();
    }

    /* renamed from: a */
    public static C41460a m164504a(TabAppInfo tabAppInfo) {
        return new C41460a(tabAppInfo);
    }

    /* renamed from: a */
    public static void m164506a(List<OpenAppBadgeNode> list) {
        OPMonitor a = C41314a.m163781a("op_app_badge_node_push");
        a.addCategoryValue("scene", 2);
        a.addCategoryValue("badge_brief", m164507b(list));
        a.setResultTypeSuccess();
        a.setErrorMessage("");
        a.flush();
    }

    /* renamed from: b */
    private static String m164507b(List<OpenAppBadgeNode> list) {
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
    public void mo149232a(OpenAppBadgeNode openAppBadgeNode) {
        if (!mo149237b()) {
            m164510g();
            return;
        }
        GadgetMainTabView gadgetMainTabView = this.f105408a;
        if (gadgetMainTabView != null) {
            OpenAppBadgeNode currentBadgeNode = gadgetMainTabView.getCurrentBadgeNode();
            if (currentBadgeNode == null || openAppBadgeNode == null) {
                this.f105408a.setCurrentBadgeNode(openAppBadgeNode);
            } else if (m164503a(currentBadgeNode.version) <= m164503a(openAppBadgeNode.version)) {
                this.f105408a.setCurrentBadgeNode(openAppBadgeNode);
            }
        }
        GadgetNavigationTabView gadgetNavigationTabView = this.f105409b;
        if (gadgetNavigationTabView != null) {
            OpenAppBadgeNode currentBadgeNode2 = gadgetNavigationTabView.getCurrentBadgeNode();
            if (currentBadgeNode2 == null || openAppBadgeNode == null) {
                this.f105409b.setCurrentBadgeNode(openAppBadgeNode);
            } else if (m164503a(currentBadgeNode2.version) <= m164503a(openAppBadgeNode.version)) {
                this.f105409b.setCurrentBadgeNode(openAppBadgeNode);
            }
        }
    }

    /* renamed from: a */
    public void mo149234a(GadgetNavigationTabView gadgetNavigationTabView) {
        this.f105409b = gadgetNavigationTabView;
    }

    /* renamed from: a */
    public void mo149235a(List<OpenAppBadgeNode> list, String str) {
        TabAppInfo tabAppInfo = this.f105410c;
        if (!(tabAppInfo == null || tabAppInfo.getExtra() == null)) {
            final OpenAppBadgeNode openAppBadgeNode = null;
            TabAppInfo.Extra extra = tabAppInfo.getExtra();
            for (OpenAppBadgeNode openAppBadgeNode2 : list) {
                if (TextUtils.equals(openAppBadgeNode2.app_id, extra.getAppID()) && openAppBadgeNode2.feature == CommonEnum.OpenAppFeatureType.MiniApp) {
                    openAppBadgeNode = openAppBadgeNode2;
                }
            }
            if (openAppBadgeNode != null) {
                Log.m165389i("GadgetTabBadgeHelper", "update net gadget tab badge：scene=" + str + "," + openAppBadgeNode);
                UICallbackExecutor.execute(new Runnable() {
                    /* class com.ss.android.lark.littleapp.view.C41460a.RunnableC414644 */

                    public void run() {
                        C41460a.this.mo149232a(openAppBadgeNode);
                    }
                });
            }
        }
    }

    /* renamed from: a */
    public void mo149236a(List<OpenAppBadgeNode> list, boolean z, boolean z2) {
        if (mo149237b() && list != null && !list.isEmpty()) {
            mo149235a(list, "push");
            m164506a(list);
        }
    }

    /* renamed from: a */
    public static void m164505a(int i, List<OpenAppBadgeNode> list, boolean z, String str) {
        OPMonitor a = C41314a.m163781a("op_app_badge_pull_node");
        a.addCategoryValue("scene", Integer.valueOf(i));
        a.addCategoryValue("badge_brief", m164507b(list));
        if (z) {
            a.setResultTypeSuccess();
        } else {
            a.setResultTypeFail();
        }
        a.setErrorMessage(str);
        a.flush();
    }
}
