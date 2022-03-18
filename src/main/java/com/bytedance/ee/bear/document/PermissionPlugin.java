package com.bytedance.ee.bear.document;

import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.bytedance.ee.bear.browser.plugin.C4943e;
import com.bytedance.ee.bear.contract.doc.DocsOpenSource;
import com.bytedance.ee.bear.document.documentinfo.DocumentInfoAbility;
import com.bytedance.ee.bear.document.documentinfo.DocumentInfoProvider;
import com.bytedance.ee.bear.document.permapply.PermApplyPlugin;
import com.bytedance.ee.bear.document.permission.PermissionData;
import com.bytedance.ee.bear.jsbridge.AbstractC7945d;
import com.bytedance.ee.bear.jsbridge.AbstractC7947h;
import com.bytedance.ee.bear.list.dto.C8275a;
import com.bytedance.ee.bear.middleground.permission.ReadPermission;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.io.NonProguard;
import com.bytedance.ee.util.p700c.C13602d;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

public class PermissionPlugin extends DocumentPluginV2 implements AbstractC7945d<PermissionData> {
    public List<AbstractC7947h> callbacks = new ArrayList();
    private long lastUpdateTime;
    public ReadPermission readPermission = new ReadPermission("web", new WeakReference(new Function1() {
        /* class com.bytedance.ee.bear.document.$$Lambda$PermissionPlugin$Kz4odJYKiIVvea9TvAYqUWfsMDY */

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            return PermissionPlugin.this.lambda$new$0$PermissionPlugin((List) obj);
        }
    }));

    /* access modifiers changed from: private */
    public static class FileEvent implements NonProguard {
        public String action;
        public List<EmbedObject> objs;

        /* access modifiers changed from: private */
        public static class EmbedObject implements NonProguard {
            public String token;
            public int type;

            private EmbedObject() {
            }

            public String getToken() {
                return this.token;
            }

            public int getType() {
                return this.type;
            }

            public String toString() {
                return "EmbedObject{token='" + C13602d.m55222a(this.token) + '\'' + ", type=" + this.type + '}';
            }

            public void setToken(String str) {
                this.token = str;
            }

            public void setType(int i) {
                this.type = i;
            }
        }

        private FileEvent() {
        }

        public String getAction() {
            return this.action;
        }

        public List<EmbedObject> getObjs() {
            return this.objs;
        }

        public String toString() {
            return "FileEvent{action='" + this.action + '\'' + ", objs=" + this.objs + '}';
        }

        public void setAction(String str) {
            this.action = str;
        }

        public void setObjs(List<EmbedObject> list) {
            this.objs = list;
        }
    }

    private void updatePermission() {
        boolean z;
        DocumentMetadata documentMetadata = getDocumentMetadata();
        DocumentInfoProvider a = ((DocumentInfoAbility) getHost().mo19551b(DocumentInfoAbility.class)).mo23140a();
        String url = documentMetadata.getUrl();
        String originUrl = documentMetadata.getOriginUrl();
        String spaceId = documentMetadata.getSpaceId();
        String token = documentMetadata.getToken();
        if (documentMetadata.getOpenSource() == DocsOpenSource.vc) {
            z = true;
        } else {
            z = false;
        }
        a.mo23145a(url, originUrl, spaceId, token, z, documentMetadata.isType(C8275a.f22377j), false);
    }

    /* renamed from: com.bytedance.ee.bear.document.PermissionPlugin$a */
    private class C5617a implements AbstractC7945d<FileEvent> {
        private C5617a() {
        }

        /* renamed from: a */
        public void handle(FileEvent fileEvent, AbstractC7947h hVar) {
            List<FileEvent.EmbedObject> list;
            C13479a.m54764b("PermissionWebService", "FileEventHandler:" + fileEvent);
            if ("register".equals(fileEvent.action)) {
                List<FileEvent.EmbedObject> list2 = fileEvent.objs;
                if (!(list2 == null || list2.isEmpty())) {
                    ArrayList arrayList = new ArrayList();
                    for (FileEvent.EmbedObject embedObject : list2) {
                        arrayList.add(new ReadPermission.FileInfo(C8275a.m34052b(embedObject.type), embedObject.token));
                    }
                    PermissionPlugin.this.readPermission.mo37722a(arrayList);
                }
            } else if ("unregister".equals(fileEvent.action) && (list = fileEvent.objs) != null && !list.isEmpty()) {
                for (FileEvent.EmbedObject embedObject2 : list) {
                    PermissionPlugin.this.readPermission.mo37720a(C8275a.m34052b(embedObject2.type), embedObject2.token);
                }
            }
        }
    }

    /* renamed from: com.bytedance.ee.bear.document.PermissionPlugin$b */
    private class C5618b implements AbstractC7945d<String> {
        private C5618b() {
        }

        /* renamed from: a */
        public void handle(String str, AbstractC7947h hVar) {
            C13479a.m54764b("PermissionWebService", "PermissionChangeHandler:" + hVar);
            if (!PermissionPlugin.this.callbacks.contains(hVar)) {
                PermissionPlugin.this.callbacks.add(hVar);
            }
        }
    }

    @Override // com.bytedance.ee.bear.browser.plugin.AbstractC4941c, com.bytedance.ee.bear.browser.plugin.BasePlugin
    public void onDetachFromHost(C4943e eVar) {
        super.onDetachFromHost(eVar);
        this.readPermission.mo37719a();
        this.callbacks.clear();
    }

    @Override // com.bytedance.ee.bear.document.DocumentPluginV2, com.bytedance.ee.bear.browser.plugin.lazy.AbstractC4952a
    public void getBridgeHandlers(Map<String, AbstractC7945d<?>> map) {
        map.put("biz.util.notifyPermissionChange", this);
        map.put("biz.permission.requestNative", new C5617a());
        map.put("biz.permission.addEventListener", new C5618b());
    }

    public /* synthetic */ Unit lambda$new$0$PermissionPlugin(List list) {
        C13479a.m54772d("PermissionWebService", "FileEventHandler:" + list.toString());
        for (AbstractC7947h hVar : this.callbacks) {
            if (hVar != null) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("objPermissions", JSON.toJSON(list));
                hVar.mo17188a(jSONObject);
            }
        }
        return null;
    }

    public void handle(PermissionData permissionData, AbstractC7947h hVar) {
        PermApplyPlugin permApplyPlugin;
        if (permissionData == null || !TextUtils.equals(permissionData.getToken(), getDocumentMetadata().getToken())) {
            C13479a.m54758a("PermissionWebService", "PermissionWebService handle(): data " + permissionData);
            return;
        }
        C13479a.m54764b("PermissionWebService", "handle(): receive permission = " + permissionData.toString());
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis - this.lastUpdateTime > 600) {
            C13479a.m54764b("PermissionWebService", "updatePermission");
            updatePermission();
            this.lastUpdateTime = currentTimeMillis;
        } else {
            C13479a.m54764b("PermissionWebService", "updatePermission limit");
        }
        if (permissionData.getCode() == 4 && permissionData.getPermissionStatusCode() == 0 && (permApplyPlugin = (PermApplyPlugin) findPlugin(PermApplyPlugin.class)) != null) {
            permApplyPlugin.showNoPermission(permissionData);
        }
    }
}
