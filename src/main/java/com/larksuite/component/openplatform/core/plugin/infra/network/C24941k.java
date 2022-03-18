package com.larksuite.component.openplatform.core.plugin.infra.network;

import android.text.TextUtils;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.lark.infra.network.p622a.p623a.C12804c;
import com.bytedance.ee.lark.infra.network.p630d.p631a.AbstractC12831a;
import com.bytedance.ee.lark.infra.network.p630d.p631a.p632a.C12832a;
import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.google.firebase.messaging.Constants;
import com.tt.miniapp.errorcode.ApiCode;
import com.tt.miniapp.errorcode.C66015a;
import com.tt.refer.common.service.net.AbstractC67855c;
import com.tt.refer.p3400a.p3401a.AbstractC67709b;
import com.tt.refer.p3400a.p3401a.p3402a.C67701b;
import com.tt.refer.p3400a.p3401a.p3402a.C67706e;
import com.tt.refer.p3400a.p3407e.AbstractC67722a;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.larksuite.component.openplatform.core.plugin.infra.network.k */
public class C24941k {

    /* renamed from: a */
    public AbstractC67709b.AbstractC67710a f61068a;

    /* renamed from: b */
    private String f61069b;

    /* renamed from: c */
    private Object f61070c;

    /* renamed from: d */
    private String f61071d;

    /* renamed from: e */
    private String f61072e;

    /* renamed from: f */
    private String f61073f;

    /* renamed from: g */
    private int f61074g;

    /* renamed from: h */
    private JSONObject f61075h;

    /* renamed from: i */
    private IAppContext f61076i;

    /* renamed from: a */
    public int mo88028a(C67701b bVar) {
        this.f61069b = (String) bVar.mo234984a("url");
        this.f61070c = bVar.mo234984a("header");
        this.f61071d = (String) bVar.mo234984a("filePath");
        this.f61072e = (String) bVar.mo234984a(Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
        this.f61073f = (String) bVar.mo234985a("method", null);
        this.f61074g = ((Integer) bVar.mo234985a("taskId", 0)).intValue();
        String str = this.f61073f;
        if (str == null) {
            this.f61073f = "GET";
        } else if (str.trim().equals("")) {
            this.f61073f = "POST";
        }
        Object obj = this.f61070c;
        if (obj != null && (obj instanceof JSONObject)) {
            this.f61075h = (JSONObject) obj;
        }
        int i = this.f61074g;
        if (i > 0) {
            AppBrandLogger.m52830i("CreateDownloadFileTask", "js sdk task id :", Integer.valueOf(i));
        }
        int i2 = this.f61074g;
        if (i2 <= 0) {
            i2 = C12804c.m52892a();
        }
        m90183a(this.f61069b, this.f61075h, this.f61072e, this.f61071d, this.f61073f, new AbstractC12831a() {
            /* class com.larksuite.component.openplatform.core.plugin.infra.network.C24941k.C249421 */

            @Override // com.bytedance.ee.lark.infra.network.p630d.p631a.AbstractC12831a
            /* renamed from: a */
            public void mo48471a(JSONObject jSONObject) {
                C24941k.this.f61068a.mo235028a(C67706e.C67708a.m263377a("onDownloadTaskStateChange", jSONObject).mo235009a());
            }
        }, i2);
        return i2;
    }

    public C24941k(IAppContext iAppContext, AbstractC67709b.AbstractC67710a aVar) {
        this.f61076i = iAppContext;
        this.f61068a = aVar;
    }

    /* renamed from: a */
    public JSONObject mo88029a(int i, ApiCode apiCode) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("downloadTaskId", i);
            C66015a.m258507a(jSONObject, apiCode);
            jSONObject.put("state", "fail");
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return jSONObject;
    }

    /* renamed from: a */
    private void m90183a(String str, JSONObject jSONObject, String str2, String str3, String str4, AbstractC12831a aVar, int i) {
        if (TextUtils.isEmpty(str)) {
            aVar.mo48471a(mo88029a(i, ApiCode.DOWNLOADFILE_INVALID_URL));
            AppBrandLogger.m52829e("CreateDownloadFileTask", "addDownloadRequest->failed:download url is empty!");
        } else if (!this.f61068a.mo235037a("download", str)) {
            aVar.mo48471a(mo88029a(i, ApiCode.DOWNLOADFILE_INVALID_DOMAIN));
            AppBrandLogger.m52829e("CreateDownloadFileTask", "addDownloadRequest->failed:url is not safe:", str);
        } else {
            AbstractC67722a aVar2 = (AbstractC67722a) this.f61076i.findServiceByInterface(AbstractC67722a.class);
            if (TextUtils.isEmpty(str3) || TextUtils.equals(str3, "null") || TextUtils.equals(str3, "undefined")) {
                AppBrandLogger.m52830i("CreateDownloadFileTask", "addDownloadRequest->file path is null!");
                str3 = null;
            } else if (!aVar2.mo235083b(aVar2.mo235076a(str3)) && !aVar2.mo235094f(str3)) {
                aVar.mo48471a(mo88029a(i, ApiCode.GENERAL_FILE_CAN_NOT_WRITE));
                AppBrandLogger.m52829e("CreateDownloadFileTask", "addDownloadRequest failed:file can't write!");
                return;
            }
            ((AbstractC67855c) this.f61076i.findServiceByInterface(AbstractC67855c.class)).mo235488a(new C12832a(i, str, jSONObject, str3, str4, str2), aVar);
        }
    }
}
