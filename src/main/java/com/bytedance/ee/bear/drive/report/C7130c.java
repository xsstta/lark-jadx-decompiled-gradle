package com.bytedance.ee.bear.drive.report;

import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import com.bytedance.ee.bear.basesdk.services.C4511g;
import com.bytedance.ee.bear.contract.AbstractC5233x;
import com.bytedance.ee.bear.contract.AccountService;
import com.bytedance.ee.bear.contract.C5234y;
import com.bytedance.ee.bear.contract.al;
import com.bytedance.ee.bear.contract.an;
import com.bytedance.ee.bear.contract.drive.sdk.entity.open.BaseOpenEntity;
import com.bytedance.ee.bear.contract.p283g.C5174a;
import com.bytedance.ee.bear.drive.biz.permission.model.C6522b;
import com.bytedance.ee.bear.drive.core.model.AbstractC6946a;
import com.bytedance.ee.bear.drive.importfile.ImportFileEntity;
import com.bytedance.ee.bear.drive.loader.model.C7088b;
import com.bytedance.ee.bear.drive.view.preview.wrapper.AbstractC7549a;
import com.bytedance.ee.bear.drive.view.preview.wrapper.NotSupportPreviewView;
import com.bytedance.ee.bear.list.dto.C8275a;
import com.bytedance.ee.bear.list.p424c.AbstractC8149a;
import com.bytedance.ee.bear.service.C10917c;
import com.bytedance.ee.bear.thread.C11678b;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.io.C13672c;
import com.bytedance.ee.util.io.C13675f;
import com.bytedance.ee.util.p700c.C13598b;
import com.bytedance.ee.util.p716r.C13721c;
import com.huawei.hms.android.HwBuildEx;
import com.huawei.updatesdk.service.otaupdate.UpdateKey;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import io.reactivex.AbstractC68307f;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;
import org.koin.java.KoinJavaComponent;

/* renamed from: com.bytedance.ee.bear.drive.report.c */
public class C7130c {

    /* renamed from: a */
    private long f19202a;

    /* renamed from: b */
    private long f19203b;

    /* renamed from: c */
    private int f19204c = -60;

    /* renamed from: d */
    private String f19205d;

    /* renamed from: e */
    private Disposable f19206e;

    /* renamed from: f */
    private AbstractC5233x f19207f = C5234y.m21391b();

    /* renamed from: g */
    private al f19208g = C4511g.m18594d();

    /* renamed from: h */
    private an f19209h = ((an) KoinJavaComponent.m268610a(an.class));

    /* renamed from: i */
    private C7133d f19210i;

    /* renamed from: j */
    private C7137h f19211j;

    /* renamed from: com.bytedance.ee.bear.drive.report.c$a */
    public static class C7132a {

        /* renamed from: a */
        private String f19214a = "";

        /* renamed from: b */
        private String f19215b = "";

        /* renamed from: c */
        private String f19216c = "";

        /* renamed from: d */
        private long f19217d;

        /* renamed from: a */
        public String mo27984a() {
            return this.f19214a;
        }

        /* renamed from: b */
        public String mo27987b() {
            return this.f19215b;
        }

        /* renamed from: c */
        public String mo27989c() {
            return this.f19214a;
        }

        /* renamed from: d */
        public long mo27991d() {
            return this.f19217d;
        }

        /* renamed from: a */
        public void mo27985a(long j) {
            this.f19217d = j;
        }

        /* renamed from: b */
        public void mo27988b(String str) {
            this.f19215b = str;
        }

        /* renamed from: c */
        public void mo27990c(String str) {
            this.f19216c = str;
        }

        /* renamed from: a */
        public void mo27986a(String str) {
            this.f19214a = str;
        }
    }

    /* renamed from: a */
    public void mo27900a() {
        HashMap<String, Object> hashMap = new HashMap<>();
        m28585a(hashMap);
        m28594b(hashMap);
        hashMap.put("click", "contents");
        hashMap.put("target", "ccm_space_docs_contents_view");
        hashMap.put("convert_type", "none");
        this.f19207f.mo21084b("ccm_space_docs_topbar_click", hashMap);
    }

    /* renamed from: b */
    public void mo27928b() {
        HashMap<String, Object> hashMap = new HashMap<>();
        m28585a(hashMap);
        m28594b(hashMap);
        hashMap.put("is_show_contents", String.valueOf(true));
        this.f19207f.mo21084b("ccm_space_docs_topbar_view", hashMap);
    }

    /* renamed from: a */
    public void mo27924a(String str, String str2, String str3, String str4) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("module", str);
            jSONObject.put("src_module", str);
            jSONObject.put("sub_module", "");
            jSONObject.put("file_id", C13721c.m55650d(str3));
            jSONObject.put("sub_file_type", str4);
            jSONObject.put("action", str2);
            jSONObject.put("product_type", "drive");
            jSONObject.put("file_type", "file");
            jSONObject.put("is_dir", 0);
            jSONObject.put("is_export", 0);
            C13479a.m54764b("DriveReport", "reportClientFileDownload. params = " + jSONObject);
            this.f19207f.mo21080a("client_file_download", jSONObject);
        } catch (Exception e) {
            C13479a.m54759a("DriveReport", "reportClientFileDownload fail ", e);
        }
    }

    /* renamed from: a */
    public void mo27923a(String str, String str2, String str3, Bundle bundle) {
        if (bundle != null) {
            try {
                String string = bundle.getString("module", "");
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("module", bundle.getString("module", ""));
                jSONObject.put("src_module", string);
                jSONObject.put("sub_module", "");
                jSONObject.put("file_id", C13721c.m55650d(str2));
                jSONObject.put("sub_file_type", str3);
                jSONObject.put("action", str);
                jSONObject.put("product_type", "drive");
                jSONObject.put("file_type", "file");
                jSONObject.put("is_dir", (Object) 0);
                jSONObject.put("is_import", (Object) 0);
                C13479a.m54772d("DriveReport", "reportClientFileUpload. params = " + jSONObject);
                AbstractC5233x xVar = this.f19207f;
                if (xVar != null) {
                    xVar.mo21080a("client_file_upload", jSONObject);
                }
            } catch (Exception e) {
                C13479a.m54759a("DriveReport", "reportClientFileUpload fail ", e);
            }
        }
    }

    /* renamed from: a */
    public void mo27901a(int i, AbstractC6946a aVar, AbstractC7549a aVar2) {
        if (aVar != null && aVar2 != null) {
            int i2 = !(aVar2 instanceof NotSupportPreviewView) ? 1 : 0;
            C7135f a = this.f19210i.mo27992a(aVar.mo27322a().f18785a);
            String c = a != null ? a.mo28005c() : "";
            if (i == 2) {
                m28580a(aVar.mo27322a().f18785a, c, i2);
            } else {
                m28590b(aVar.mo27322a().f18785a, c, i2);
            }
        }
    }

    /* renamed from: a */
    public void mo27921a(String str, String str2) {
        this.f19204c += 60;
        HashMap<String, Object> hashMap = new HashMap<>();
        hashMap.put("session_duration", Integer.valueOf(this.f19204c));
        hashMap.put("in_page", String.valueOf(true));
        hashMap.put("session_id", this.f19205d);
        m28595b(hashMap, str, str2);
        this.f19207f.mo21079a("launch_duration", hashMap);
    }

    /* renamed from: a */
    public void mo27918a(String str) {
        HashMap<String, Object> g = m28600g((AbstractC6946a) null);
        if (!TextUtils.isEmpty(str)) {
            g.put("container_id", C13598b.m55197d(str));
            g.put("container_type", "wiki");
        }
        m28593b("ccm_drive_file_upload_process_view", g);
    }

    /* renamed from: a */
    public void mo27922a(String str, String str2, String str3) {
        HashMap<String, Object> g = m28600g((AbstractC6946a) null);
        g.put("click", str);
        g.put("target", str2);
        if (!TextUtils.isEmpty(str3)) {
            g.put("container_id", C13598b.m55197d(str3));
            g.put("container_type", "wiki");
        }
        m28593b("ccm_drive_file_upload_process_click", g);
    }

    /* renamed from: b */
    public void mo27935b(String str) {
        HashMap<String, Object> g = m28600g((AbstractC6946a) null);
        g.put("click", str);
        m28593b("ccm_drive_stop_upload_confirm_click", g);
    }

    /* renamed from: b */
    public void mo27936b(String str, String str2) {
        HashMap hashMap = new HashMap();
        hashMap.put("action", str);
        C7137h hVar = this.f19211j;
        if (hVar != null && hVar.f19227a) {
            hashMap.put("app_from", "vc");
        }
        hashMap.put("file_type", str2);
        this.f19207f.mo21079a("drive_enter_presentation", hashMap);
    }

    /* renamed from: a */
    public void mo27906a(AbstractC6946a aVar, String str) {
        String str2;
        if (aVar != null && aVar.mo27322a() != null) {
            AccountService.Account f = this.f19209h.mo16408f();
            if (f == null) {
                str2 = "";
            } else {
                str2 = f.f14592i;
            }
            m28582a("client_file_open", aVar.mo27322a().f18785a, aVar.mo27322a().mo27364g(), "online", str, !TextUtils.equals(str, str2) ? "true" : "false");
        }
    }

    /* renamed from: a */
    public void mo27914a(C7088b bVar) {
        String str;
        if (bVar != null && bVar.mo27322a() != null) {
            AccountService.Account f = this.f19209h.mo16408f();
            if (f == null) {
                str = "";
            } else {
                str = f.f14592i;
            }
            m28581a(bVar.mo27322a().f18785a, bVar.mo27322a().mo27364g(), "online", str, "false");
        }
    }

    /* renamed from: a */
    public void mo27904a(AbstractC6946a aVar) {
        if (aVar != null && aVar.mo27322a() != null) {
            m28604m();
            m28603l(aVar.mo27322a().f18785a, aVar.mo27322a().mo27364g());
        }
    }

    /* renamed from: a */
    public void mo27915a(final C7132a aVar) {
        this.f19204c = -60;
        if (aVar != null) {
            Disposable disposable = this.f19206e;
            if (disposable != null) {
                disposable.dispose();
            }
            this.f19206e = AbstractC68307f.m265073a(0, 60, TimeUnit.SECONDS).mo237985a(C11678b.m48480d()).mo238018d(new Consumer<Long>() {
                /* class com.bytedance.ee.bear.drive.report.C7130c.C71311 */

                /* renamed from: a */
                public void accept(Long l) throws Exception {
                    C7130c.this.mo27921a(aVar.mo27989c(), aVar.mo27987b());
                }
            });
        }
    }

    /* renamed from: a */
    public void mo27905a(AbstractC6946a aVar, C6522b bVar) {
        this.f19207f.mo21077a("driveCommonParams");
        if (aVar != null) {
            this.f19207f.mo21078a("driveCommonParams", "file_id", C13598b.m55197d(aVar.mo27322a().f18785a));
            this.f19207f.mo21078a("driveCommonParams", "file_type", C8275a.f22375h.mo32553a());
            this.f19207f.mo21078a("driveCommonParams", "page_token", C13598b.m55197d(aVar.mo27322a().f18785a));
            this.f19207f.mo21078a("driveCommonParams", "sub_file_type", aVar.mo27322a().mo27364g());
            this.f19207f.mo21078a("driveCommonParams", "module", "drive");
            String str = "none";
            this.f19207f.mo21078a("driveCommonParams", "sub_module", str);
            this.f19207f.mo21078a("driveCommonParams", "user_permission", m28577a(bVar));
            this.f19207f.mo21078a("driveCommonParams", "file_permission", m28588b(bVar));
            AbstractC5233x xVar = this.f19207f;
            C7137h hVar = this.f19211j;
            if (hVar != null && hVar.f19227a) {
                str = "vc";
            }
            xVar.mo21078a("driveCommonParams", "app_form", str);
        }
    }

    /* renamed from: b */
    public void mo27933b(C7132a aVar) {
        String str = "";
        String c = aVar != null ? aVar.mo27989c() : str;
        if (aVar != null) {
            str = aVar.mo27987b();
        }
        m28597c(c, str, "play", "audio_play");
    }

    /* renamed from: c */
    public void mo27943c(C7132a aVar) {
        String str = "";
        String c = aVar != null ? aVar.mo27989c() : str;
        if (aVar != null) {
            str = aVar.mo27987b();
        }
        m28597c(c, str, "pause", "audio_play");
    }

    /* renamed from: c */
    public void mo27945c(String str, String str2) {
        m28596c(str, C13672c.m55481b(str2), "re_upload");
    }

    /* renamed from: a */
    public void mo27916a(C7132a aVar, String str) {
        if (aVar != null) {
            m28592b(aVar.mo27989c(), aVar.mo27987b(), "click_rename", "success", str);
        }
    }

    /* renamed from: b */
    public void mo27934b(C7132a aVar, String str) {
        if (aVar != null) {
            m28592b(aVar.mo27989c(), aVar.mo27987b(), "click_rename_confirm", "success", str);
        }
    }

    /* renamed from: c */
    public void mo27944c(String str) {
        m28583a(str, "drive_click_upload_multimedia", new HashMap<>());
    }

    /* renamed from: a */
    public void mo27925a(String str, String str2, boolean z, String str3) {
        HashMap<String, Object> hashMap = new HashMap<>();
        hashMap.put("file_size", Long.valueOf(C13675f.m55525d(str) / 1048576));
        hashMap.put("dummy_token", str2);
        hashMap.put(UpdateKey.STATUS, z ? "success" : "fail");
        hashMap.put("file_id", str3);
        m28583a(str, "drive_upload_result", hashMap);
    }

    /* renamed from: a */
    public void mo27913a(ImportFileEntity importFileEntity) {
        HashMap<String, Object> hashMap = new HashMap<>();
        String a = importFileEntity.mo27485a();
        String b = importFileEntity.mo27487b() != null ? C13672c.m55481b(importFileEntity.mo27487b()) : "";
        hashMap.put("action", "import");
        m28586a(hashMap, importFileEntity);
        m28595b(hashMap, a, b);
        this.f19207f.mo21079a("client_content_management", hashMap);
    }

    /* renamed from: a */
    public void mo27927a(boolean z, ImportFileEntity importFileEntity) {
        HashMap<String, Object> hashMap = new HashMap<>();
        if (z) {
            hashMap.put("action", "notify_admin");
        } else {
            hashMap.put("action", "cancel");
        }
        m28595b(hashMap, importFileEntity.mo27485a(), importFileEntity.mo27487b() != null ? C13672c.m55481b(importFileEntity.mo27487b()) : "");
        hashMap.put("trigger_action", "import");
        this.f19207f.mo21079a("client_commerce", hashMap);
    }

    /* renamed from: b */
    public void mo27930b(AbstractC6946a aVar, String str) {
        if (aVar != null) {
            HashMap<String, Object> hashMap = new HashMap<>();
            String str2 = aVar.mo27322a().f18785a;
            String d = aVar.mo27333d();
            hashMap.put("action", "save_to_drive");
            hashMap.put(ShareHitPoint.f121868c, str);
            m28595b(hashMap, str2, d);
            this.f19207f.mo21079a("client_content_management", hashMap);
        }
    }

    /* renamed from: a */
    public void mo27912a(AbstractC6946a aVar, boolean z) {
        if (aVar != null && aVar.mo27322a() != null) {
            HashMap<String, Object> hashMap = new HashMap<>();
            m28595b(hashMap, aVar.mo27322a().f18785a, aVar.mo27322a().mo27364g());
            hashMap.put("display_type", z ? "full" : "default");
            C13479a.m54772d("DriveReport", "reportClickDisplayEvent map = " + hashMap);
            this.f19207f.mo21079a("client_click_display", hashMap);
        }
    }

    /* renamed from: a */
    public void mo27919a(String str, int i) {
        HashMap hashMap = new HashMap();
        hashMap.put("file_id", C13598b.m55197d(str));
        hashMap.put("file_type", C8275a.f22375h.mo32553a());
        hashMap.put("is_landscape", Integer.valueOf(i));
        C7135f a = this.f19210i.mo27992a(str);
        if (!(a == null || a.mo27996a() == null)) {
            hashMap.put("sub_file_type", a.mo28005c());
            hashMap.put("preview_from", a.mo27996a());
            Bundle l = a.mo28014l();
            String b = m28589b(a.mo27996a(), l != null ? l.getString("drive_fragment_type") : null, a.mo28002b());
            if (TextUtils.isEmpty(b) && l != null && !TextUtils.isEmpty(l.getString("module"))) {
                b = l.getString("module");
            }
            if (TextUtils.isEmpty(b)) {
                b = "other_link";
            }
            hashMap.put("module", b);
        }
        this.f19207f.mo21079a("client_file_landscape", hashMap);
        C13479a.m54772d("DriveReport", "report client_file_landscape, params: " + hashMap);
    }

    /* renamed from: a */
    public void mo27907a(AbstractC6946a aVar, String str, String str2) {
        HashMap<String, Object> hashMap = new HashMap<>();
        hashMap.put("click", str);
        hashMap.put("diaplay", str2);
        hashMap.put("target", "none");
        m28578a(aVar, hashMap);
    }

    /* renamed from: a */
    public void mo27910a(AbstractC6946a aVar, String str, String str2, String str3) {
        HashMap<String, Object> hashMap = new HashMap<>();
        hashMap.put("click", str);
        hashMap.put("diaplay", str2);
        hashMap.put("target", "none");
        hashMap.put("media_display", str3);
        m28578a(aVar, hashMap);
    }

    /* renamed from: b */
    public void mo27932b(AbstractC6946a aVar, String str, String str2, String str3) {
        HashMap<String, Object> hashMap = new HashMap<>();
        hashMap.put("click", str);
        hashMap.put("diaplay", str2);
        hashMap.put("target", "none");
        hashMap.put("action_type", str3);
        m28578a(aVar, hashMap);
    }

    /* renamed from: a */
    public void mo27920a(String str, BaseOpenEntity baseOpenEntity) {
        if (baseOpenEntity != null) {
            HashMap<String, Object> a = mo27899a(baseOpenEntity);
            a.put("diaplay", str);
            m28584a(baseOpenEntity.getFileId(), a);
            m28593b("ccm_drive_page_view", a);
        }
    }

    /* renamed from: a */
    public void mo27909a(AbstractC6946a aVar, String str, String str2, Boolean bool) {
        HashMap<String, Object> hashMap = new HashMap<>();
        hashMap.put("click", str);
        hashMap.put("diaplay", str2);
        hashMap.put("target", "none");
        hashMap.put("is_fullscreen", bool);
        m28578a(aVar, hashMap);
    }

    /* renamed from: a */
    public void mo27908a(AbstractC6946a aVar, String str, String str2, long j) {
        HashMap<String, Object> hashMap = new HashMap<>();
        hashMap.put("click", str);
        hashMap.put("diaplay", str2);
        hashMap.put("target", "none");
        m28579a(aVar, hashMap, j);
    }

    /* renamed from: a */
    public void mo27911a(AbstractC6946a aVar, String str, String str2, Map<String, Object> map) {
        HashMap<String, Object> g = m28600g(aVar);
        g.put("click", str);
        g.put("target", str2);
        if (map != null) {
            for (Map.Entry<String, Object> entry : map.entrySet()) {
                g.put(entry.getKey(), entry.getValue());
            }
        }
        m28593b("ccm_space_docs_topbar_click", g);
    }

    /* renamed from: b */
    public void mo27931b(AbstractC6946a aVar, String str, String str2) {
        if (aVar != null) {
            HashMap<String, Object> g = m28600g(aVar);
            g.put("click", str);
            g.put("target", str2);
            m28584a(aVar.mo27322a().f18785a, g);
            m28593b("ccm_drive_file_menu_click", g);
        }
    }

    /* renamed from: a */
    public void mo27902a(BaseOpenEntity baseOpenEntity, String str, String str2) {
        if (baseOpenEntity != null) {
            HashMap<String, Object> a = mo27899a(baseOpenEntity);
            a.put("click", str);
            a.put("target", str2);
            m28584a(baseOpenEntity.getFileId(), a);
            m28593b("ccm_drive_file_menu_click", a);
        }
    }

    /* renamed from: a */
    public HashMap<String, Object> mo27899a(BaseOpenEntity baseOpenEntity) {
        Pair<String, String> e = m28599e(baseOpenEntity);
        return mo27973k((String) e.first, (String) e.second);
    }

    /* renamed from: b */
    public void mo27929b(BaseOpenEntity baseOpenEntity) {
        if (baseOpenEntity != null) {
            this.f19207f.mo21079a("ccm_drive_exceed_storage_limit_view", mo27899a(baseOpenEntity));
        }
    }

    /* renamed from: a */
    public void mo27903a(BaseOpenEntity baseOpenEntity, boolean z) {
        if (baseOpenEntity != null) {
            HashMap<String, Object> a = mo27899a(baseOpenEntity);
            a.put("click", z ? "finish" : "cancel");
            this.f19207f.mo21079a("ccm_drive_file_download_click", a);
        }
    }

    /* renamed from: a */
    public void mo27926a(HashMap<String, Object> hashMap, String str, String str2) {
        HashMap<String, Object> hashMap2 = new HashMap<>();
        hashMap2.putAll(hashMap);
        hashMap2.put("target", "none");
        m28585a(hashMap2);
        m28594b(hashMap2);
        m28598c(hashMap2, str, str2);
        this.f19207f.mo21079a("ccm_drive_page_click", hashMap2);
    }

    /* renamed from: e */
    public void mo27953e() {
        m28596c("", "", "show_upload_layer");
    }

    /* renamed from: f */
    public void mo27959f() {
        m28596c("", "", "hide_upload_layer");
    }

    /* renamed from: g */
    public void mo27962g() {
        m28596c("", "", "cancel_upload_batch");
    }

    /* renamed from: h */
    public void mo27965h() {
        m28596c("", "", "cancel_upload");
    }

    /* renamed from: i */
    public void mo27968i() {
        m28596c("", "", "cancel_upload_confirm");
    }

    /* renamed from: j */
    public void mo27971j() {
        m28596c("", "", "cancel_upload_cancel");
    }

    /* renamed from: d */
    public void mo27946d() {
        m28593b("ccm_drive_stop_upload_confirm_view", m28600g((AbstractC6946a) null));
    }

    /* renamed from: l */
    public boolean mo27977l() {
        C7137h hVar = this.f19211j;
        if (hVar == null || !hVar.f19227a) {
            return false;
        }
        return true;
    }

    /* renamed from: m */
    private void m28604m() {
        Disposable disposable = this.f19206e;
        if (disposable != null) {
            disposable.dispose();
            this.f19206e = null;
        }
        this.f19203b = System.currentTimeMillis();
    }

    /* renamed from: c */
    public void mo27937c() {
        HashMap<String, Object> hashMap = new HashMap<>();
        m28585a(hashMap);
        m28594b(hashMap);
        this.f19207f.mo21084b("ccm_space_docs_contents_view", hashMap);
    }

    /* renamed from: k */
    public void mo27974k() {
        m28597c("", "", "cancel_open_in_other_apps", "window");
    }

    /* renamed from: a */
    public void mo27917a(C7137h hVar) {
        this.f19211j = hVar;
    }

    /* renamed from: a */
    private String m28577a(C6522b bVar) {
        if (bVar == null) {
            return "";
        }
        return bVar.mo26067m();
    }

    /* renamed from: b */
    private String m28588b(C6522b bVar) {
        if (bVar == null) {
            return "";
        }
        return bVar.mo26067m();
    }

    /* renamed from: c */
    public void mo27938c(BaseOpenEntity baseOpenEntity) {
        if (baseOpenEntity != null) {
            this.f19207f.mo21079a("ccm_drive_exceed_download_limit_view", mo27899a(baseOpenEntity));
        }
    }

    /* renamed from: e */
    public void mo27954e(AbstractC6946a aVar) {
        if (aVar != null) {
            m28593b("ccm_drive_edit_view", m28600g(aVar));
        }
    }

    /* renamed from: e */
    private Pair<String, String> m28599e(BaseOpenEntity baseOpenEntity) {
        String str;
        String str2 = "none";
        if (baseOpenEntity != null) {
            str2 = baseOpenEntity.getFileId();
            str = C13675f.m55521c(baseOpenEntity.getFileName());
        } else {
            str = str2;
        }
        return new Pair<>(str2, str);
    }

    /* renamed from: g */
    private HashMap<String, Object> m28600g(AbstractC6946a aVar) {
        Pair<String, String> h = m28601h(aVar);
        return mo27973k((String) h.first, (String) h.second);
    }

    /* renamed from: h */
    private Pair<String, String> m28601h(AbstractC6946a aVar) {
        String str;
        String str2 = "none";
        if (aVar == null || aVar.mo27322a() == null) {
            str = str2;
        } else {
            str2 = aVar.mo27322a().f18785a;
            str = aVar.mo27322a().mo27364g();
        }
        return new Pair<>(str2, str);
    }

    /* renamed from: d */
    public void mo27947d(BaseOpenEntity baseOpenEntity) {
        if (baseOpenEntity != null) {
            this.f19207f.mo21079a("ccm_drive_file_download_view", mo27899a(baseOpenEntity));
        }
    }

    /* renamed from: f */
    public void mo27960f(C7132a aVar) {
        String str;
        String str2 = "";
        if (aVar != null) {
            str = aVar.mo27989c();
        } else {
            str = str2;
        }
        if (aVar != null) {
            str2 = aVar.mo27987b();
        }
        m28597c(str, str2, "play", "video_play");
    }

    /* renamed from: i */
    public void mo27969i(C7132a aVar) {
        String str;
        String str2 = "";
        if (aVar != null) {
            str = aVar.mo27989c();
        } else {
            str = str2;
        }
        if (aVar != null) {
            str2 = aVar.mo27987b();
        }
        m28597c(str, str2, "unmute", "toolbar");
    }

    /* renamed from: l */
    public void mo27976l(C7132a aVar) {
        String str;
        String str2 = "";
        if (aVar != null) {
            str = aVar.mo27989c();
        } else {
            str = str2;
        }
        if (aVar != null) {
            str2 = aVar.mo27987b();
        }
        m28597c(str, str2, "fast_forward", "toolbar");
    }

    /* renamed from: n */
    public void mo27979n(C7132a aVar) {
        if (aVar != null) {
            m28592b(aVar.mo27989c(), aVar.mo27987b(), "click_rename_confirm", "success", "use_new");
        }
    }

    /* renamed from: p */
    public void mo27981p(C7132a aVar) {
        String str;
        String str2 = "";
        if (aVar != null) {
            str = aVar.mo27989c();
        } else {
            str = str2;
        }
        if (aVar != null) {
            str2 = aVar.mo27987b();
        }
        m28597c(str, str2, "click_folder", "window");
    }

    /* renamed from: q */
    public void mo27982q(C7132a aVar) {
        String str;
        String str2 = "";
        if (aVar != null) {
            str = aVar.mo27989c();
        } else {
            str = str2;
        }
        if (aVar != null) {
            str2 = aVar.mo27987b();
        }
        m28597c(str, str2, "click_file", "window");
    }

    /* renamed from: b */
    public static C7132a m28587b(AbstractC6946a aVar) {
        C7132a aVar2 = new C7132a();
        if (!(aVar == null || aVar.mo27322a() == null)) {
            aVar2.mo27986a(aVar.mo27322a().f18785a);
            aVar2.mo27988b(aVar.mo27322a().mo27364g());
            aVar2.mo27990c(aVar.mo27333d());
            aVar2.mo27985a(aVar.mo27322a().f18787c);
        }
        return aVar2;
    }

    /* renamed from: d */
    public void mo27948d(AbstractC6946a aVar) {
        if (aVar != null) {
            HashMap<String, Object> g = m28600g(aVar);
            m28584a(aVar.mo27322a().f18785a, g);
            m28593b("ccm_drive_file_menu_view", g);
        }
    }

    /* renamed from: e */
    public void mo27955e(C7132a aVar) {
        String str;
        String str2 = "";
        if (aVar != null) {
            str = aVar.mo27989c();
        } else {
            str = str2;
        }
        if (aVar != null) {
            str2 = aVar.mo27987b();
        }
        m28597c(str, str2, "unmute", "toolbar");
    }

    /* renamed from: f */
    public Bundle mo27958f(AbstractC6946a aVar) {
        Bundle bundle = new Bundle();
        bundle.putInt("more_scene", 1);
        if (aVar != null) {
            for (Map.Entry<String, Object> entry : m28600g(aVar).entrySet()) {
                bundle.putString(entry.getKey(), (String) entry.getValue());
            }
        }
        return bundle;
    }

    /* renamed from: g */
    public void mo27963g(C7132a aVar) {
        String str;
        String str2 = "";
        if (aVar != null) {
            str = aVar.mo27989c();
        } else {
            str = str2;
        }
        if (aVar != null) {
            str2 = aVar.mo27987b();
        }
        m28597c(str, str2, "pause", "video_play");
    }

    /* renamed from: h */
    public void mo27966h(C7132a aVar) {
        String str;
        String str2 = "";
        if (aVar != null) {
            str = aVar.mo27989c();
        } else {
            str = str2;
        }
        if (aVar != null) {
            str2 = aVar.mo27987b();
        }
        m28597c(str, str2, "mute", "toolbar");
    }

    /* renamed from: j */
    public void mo27972j(C7132a aVar) {
        String str;
        String str2;
        if (aVar != null) {
            str = aVar.mo27989c();
        } else {
            str = "";
        }
        if (aVar != null) {
            str2 = aVar.mo27987b();
        } else {
            str2 = "";
        }
        m28597c(str, str2, "zoom_in", "");
    }

    /* renamed from: k */
    public void mo27975k(C7132a aVar) {
        String str;
        String str2;
        if (aVar != null) {
            str = aVar.mo27989c();
        } else {
            str = "";
        }
        if (aVar != null) {
            str2 = aVar.mo27987b();
        } else {
            str2 = "";
        }
        m28597c(str, str2, "zoom_out", "");
    }

    /* renamed from: m */
    public void mo27978m(C7132a aVar) {
        String str;
        String str2 = "";
        if (aVar != null) {
            str = aVar.mo27989c();
        } else {
            str = str2;
        }
        if (aVar != null) {
            str2 = aVar.mo27987b();
        }
        m28597c(str, str2, "fast_rewind", "toolbar");
    }

    /* renamed from: o */
    public void mo27980o(C7132a aVar) {
        String str;
        HashMap<String, Object> hashMap = new HashMap<>();
        hashMap.put("action", "file_within_info_page");
        String str2 = "";
        if (aVar != null) {
            str = aVar.mo27989c();
        } else {
            str = str2;
        }
        if (aVar != null) {
            str2 = aVar.mo27987b();
        }
        m28595b(hashMap, str, str2);
        this.f19207f.mo21079a("client_content_management", hashMap);
    }

    /* renamed from: e */
    public void mo27956e(String str) {
        if (str != null) {
            HashMap hashMap = new HashMap();
            hashMap.put("file_id", C13598b.m55197d(str));
            hashMap.put("file_type", C8275a.m34050a(C8275a.f22375h.mo32555b()));
            this.f19207f.mo21079a("click_innerpage_more", hashMap);
        }
    }

    /* renamed from: d */
    public void mo27950d(C7132a aVar) {
        String str;
        String str2 = "";
        if (aVar != null) {
            str = aVar.mo27989c();
        } else {
            str = str2;
        }
        if (aVar != null) {
            str2 = aVar.mo27987b();
        }
        m28597c(str, str2, "mute", "toolbar");
    }

    /* renamed from: c */
    public void mo27939c(AbstractC6946a aVar) {
        JSONObject jSONObject = new JSONObject();
        if (aVar != null && aVar.mo27322a() != null) {
            try {
                jSONObject.put("module", "drive");
                jSONObject.put("sub_module", "none");
                if (!TextUtils.isEmpty(aVar.mo27322a().f18785a)) {
                    jSONObject.put("file_id", C13598b.m55197d(aVar.mo27322a().f18785a));
                } else {
                    jSONObject.put("file_id", "none");
                }
                jSONObject.put("file_type", C8275a.f22375h.mo32553a());
                if (!TextUtils.isEmpty(aVar.mo27322a().mo27364g())) {
                    jSONObject.put("sub_file_type", aVar.mo27322a().mo27364g());
                } else {
                    jSONObject.put("sub_file_type", "none");
                }
                jSONObject.put("container_id", "none");
                jSONObject.put("container_type", "none");
                jSONObject.put("app_form", "none");
                this.f19207f.mo21081a("ccm_space_docs_details_view", jSONObject, "");
            } catch (Exception e) {
                C13479a.m54758a("DriveReport", "reportShowDocDetails()...error = " + e);
            }
        }
    }

    /* renamed from: d */
    public void mo27951d(String str) {
        m28583a(str, "drive_click_upload_file", new HashMap<>());
    }

    /* renamed from: a */
    private void m28585a(HashMap<String, Object> hashMap) {
        hashMap.put("module", "drive");
        hashMap.put("sub_module", "none");
        C7137h hVar = this.f19211j;
        if (hVar == null || !hVar.f19227a) {
            hashMap.put("app_form", "none");
        } else {
            hashMap.put("app_form", "vc");
        }
        hashMap.put("target", "none");
    }

    /* renamed from: b */
    private void m28594b(HashMap<String, Object> hashMap) {
        hashMap.put("container_id", "none");
        hashMap.put("container_type", "none");
        hashMap.put("shortcut_id", "none");
        hashMap.put("is_shortcut", "false");
    }

    /* renamed from: a */
    private void m28578a(AbstractC6946a aVar, HashMap<String, Object> hashMap) {
        m28579a(aVar, hashMap, -1);
    }

    /* renamed from: f */
    public void mo27961f(String str, String str2) {
        m28597c(str, str2, "open_in_other_apps", "headerbar_more");
    }

    /* renamed from: h */
    public void mo27967h(String str, String str2) {
        HashMap<String, Object> hashMap = new HashMap<>();
        m28595b(hashMap, str, str2);
        this.f19207f.mo21079a("click_enter_history_within", hashMap);
    }

    /* renamed from: k */
    public HashMap<String, Object> mo27973k(String str, String str2) {
        HashMap<String, Object> hashMap = new HashMap<>();
        m28585a(hashMap);
        m28594b(hashMap);
        m28598c(hashMap, str, str2);
        return hashMap;
    }

    public C7130c(C10917c cVar, C7133d dVar) {
        this.f19210i = dVar;
    }

    /* renamed from: j */
    public String mo27970j(String str, String str2) {
        if (!"client_file_open".equals(str) || !"attachment".equals(str2)) {
            return str;
        }
        return "drive_sdk_file_open";
    }

    /* renamed from: l */
    private void m28603l(String str, String str2) {
        HashMap<String, Object> hashMap = new HashMap<>();
        hashMap.put("session_duration", Long.valueOf((this.f19203b - this.f19202a) / 1000));
        hashMap.put("in_page", String.valueOf(true));
        hashMap.put("session_id", this.f19205d);
        m28595b(hashMap, str, str2);
        this.f19207f.mo21079a("launch_duration", hashMap);
    }

    /* renamed from: i */
    public static void m28602i(String str, String str2) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("module", "drive");
            jSONObject.put("sub_module", "none");
            if (!TextUtils.isEmpty(str)) {
                jSONObject.put("file_id", C13598b.m55197d(str));
            } else {
                jSONObject.put("file_id", "none");
            }
            jSONObject.put("file_type", C8275a.m34050a(C8275a.f22375h.mo32555b()));
            if (!TextUtils.isEmpty(str2)) {
                jSONObject.put("sub_file_type", str2);
            } else {
                jSONObject.put("sub_file_type", "none");
            }
            jSONObject.put("container_id", "none");
            jSONObject.put("container_type", "none");
            jSONObject.put("app_form", "none");
            AbstractC5233x b = C5234y.m21391b();
            if (b != null) {
                b.mo21081a("ccm_space_drive_rename_view", jSONObject, "");
            }
        } catch (JSONException e) {
            C13479a.m54758a("DriveReport", "reportFileChooseClick()...error = " + e);
        }
    }

    /* renamed from: g */
    public void mo27964g(String str, String str2) {
        String str3;
        HashMap<String, Object> hashMap = new HashMap<>();
        hashMap.put("action", str2);
        C7135f a = this.f19210i.mo27992a(str);
        if (a != null) {
            str3 = a.mo28005c();
        } else {
            str3 = "";
        }
        m28595b(hashMap, str, str3);
        this.f19207f.mo21079a("client_praise", hashMap);
    }

    /* renamed from: e */
    public void mo27957e(String str, String str2) {
        HashMap<String, Object> hashMap = new HashMap<>();
        hashMap.put("dummy_token", str2);
        m28583a(str, "drive_click_upload_file_confirm", hashMap);
    }

    /* renamed from: a */
    private void m28584a(String str, HashMap<String, Object> hashMap) {
        C7135f a = this.f19210i.mo27992a(str);
        if (a == null) {
            return;
        }
        if (a.mo28015m() == 3) {
            hashMap.put("scene", "im");
        } else if (a.mo28015m() == 2) {
            hashMap.put("scene", "space");
        }
    }

    /* renamed from: b */
    private void m28593b(String str, HashMap<String, Object> hashMap) {
        C13479a.m54772d("DriveReport", "reportDriveEventV2 event = " + str + ", map = " + hashMap);
        this.f19207f.mo21084b(str, hashMap);
    }

    /* renamed from: c */
    public void mo27940c(AbstractC6946a aVar, String str) {
        if (aVar != null) {
            HashMap<String, Object> g = m28600g(aVar);
            m28584a(aVar.mo27322a().f18785a, g);
            g.put("diaplay", str);
            m28593b("ccm_drive_page_view", g);
        }
    }

    /* renamed from: d */
    public void mo27952d(String str, String str2) {
        HashMap<String, Object> hashMap = new HashMap<>();
        hashMap.put("dummy_token", str2);
        m28583a(str, "drive_click_upload_multimedia_confirm", hashMap);
    }

    /* renamed from: a */
    private void m28586a(Map<String, Object> map, ImportFileEntity importFileEntity) {
        HashMap<String, String> c = importFileEntity.mo27488c();
        if (c.containsKey("is_grid") && c.get("is_grid") != null) {
            if (Boolean.parseBoolean(c.get("is_grid"))) {
                map.put(ShareHitPoint.f121868c, "grid_more");
            } else {
                map.put(ShareHitPoint.f121868c, "left_slide");
            }
        }
        if (c.containsKey("is_file_detail") && c.get("is_file_detail") != null) {
            if (Boolean.parseBoolean(c.get("is_file_detail"))) {
                map.put(ShareHitPoint.f121868c, "innerpage_more");
            } else {
                map.put(ShareHitPoint.f121868c, "attachment_more");
            }
        }
    }

    /* renamed from: a */
    private void m28580a(String str, String str2, int i) {
        HashMap<String, Object> k = mo27973k(str, str2);
        k.put("preview_viable", Integer.valueOf(i));
        m28593b("ccm_docs_page_view", k);
    }

    /* renamed from: b */
    private void m28590b(String str, String str2, int i) {
        HashMap<String, Object> k = mo27973k(str, str2);
        k.put("preview_viable", Integer.valueOf(i));
        m28593b("ccm_drive_page_view", k);
    }

    /* renamed from: a */
    private void m28579a(AbstractC6946a aVar, HashMap<String, Object> hashMap, long j) {
        HashMap<String, Object> g = m28600g(aVar);
        if (hashMap != null && hashMap.size() > 0) {
            g.putAll(hashMap);
        }
        if (j >= 0) {
            g.put("play_time", Long.valueOf(j));
        }
        m28593b("ccm_drive_page_click", g);
    }

    /* renamed from: c */
    private void m28596c(String str, String str2, String str3) {
        HashMap<String, Object> hashMap = new HashMap<>();
        hashMap.put("event_type", "mouseClick");
        hashMap.put("sub_module", "upload_layer");
        hashMap.put("action", str3);
        m28595b(hashMap, str, str2);
        this.f19207f.mo21079a("client_file_upload", hashMap);
    }

    /* renamed from: d */
    public void mo27949d(AbstractC6946a aVar, String str, String str2) {
        HashMap<String, Object> g = m28600g(aVar);
        g.put("click", str);
        g.put("target", str2);
        m28593b("ccm_docs_page_click", g);
    }

    /* renamed from: c */
    private void m28598c(HashMap<String, Object> hashMap, String str, String str2) {
        Object obj;
        String str3 = "none";
        if (str3.equals(str)) {
            obj = str3;
        } else {
            obj = C13598b.m55197d(str);
        }
        hashMap.put("file_id", obj);
        if (!str3.equals(str)) {
            str3 = C8275a.f22375h.mo32553a();
        }
        hashMap.put("file_type", str3);
        hashMap.put("sub_file_type", str2);
    }

    /* renamed from: a */
    private void m28583a(String str, String str2, HashMap<String, Object> hashMap) {
        String str3;
        String b = C13672c.m55481b(str);
        if (hashMap.containsKey("file_id")) {
            str3 = (String) hashMap.get("file_id");
        } else {
            str3 = "";
        }
        HashMap<String, Object> hashMap2 = new HashMap<>(hashMap);
        hashMap2.put("action", str2);
        hashMap2.put("sub_module", "recent");
        m28595b(hashMap2, str3, b);
        this.f19207f.mo21079a("client_content_management", hashMap2);
    }

    /* renamed from: b */
    public static String m28589b(String str, String str2, String str3) {
        String str4;
        String str5 = "";
        if (TextUtils.isEmpty(str)) {
            return str5;
        }
        str.hashCode();
        char c = 65535;
        String str6 = "calendar";
        switch (str.hashCode()) {
            case -1961668694:
                if (str.equals("tab_personal")) {
                    c = 0;
                    break;
                }
                break;
            case -1902200833:
                if (str.equals("from_parent_sheet")) {
                    c = 1;
                    break;
                }
                break;
            case -1389265756:
                if (str.equals("from_parent_mindnote")) {
                    c = 2;
                    break;
                }
                break;
            case -1366839291:
                if (str.equals("drive_sdk")) {
                    c = 3;
                    break;
                }
                break;
            case -1354042618:
                if (str.equals("tab_favorite")) {
                    c = 4;
                    break;
                }
                break;
            case -907320503:
                if (str.equals("tab_home")) {
                    c = 5;
                    break;
                }
                break;
            case -519244153:
                if (str.equals("from_parent_bitable")) {
                    c = 6;
                    break;
                }
                break;
            case -178324674:
                if (str.equals(str6)) {
                    c = 7;
                    break;
                }
                break;
            case -113928104:
                if (str.equals("tab_folder")) {
                    c = '\b';
                    break;
                }
                break;
            case -102166727:
                if (str.equals("tab_offline")) {
                    c = '\t';
                    break;
                }
                break;
            case 3343799:
                if (str.equals("mail")) {
                    c = '\n';
                    break;
                }
                break;
            case 248701330:
                if (str.equals("tab_search")) {
                    c = 11;
                    break;
                }
                break;
            case 306539794:
                if (str.equals("doc_embed")) {
                    c = '\f';
                    break;
                }
                break;
            case 498059870:
                if (str.equals("tab_shared_folder")) {
                    c = '\r';
                    break;
                }
                break;
            case 819565027:
                if (str.equals("doc_mention")) {
                    c = 14;
                    break;
                }
                break;
            case 934983331:
                if (str.equals("tab_personal_folder")) {
                    c = 15;
                    break;
                }
                break;
            case 954925063:
                if (str.equals("message")) {
                    c = 16;
                    break;
                }
                break;
            case 1028708505:
                if (str.equals("lark_search")) {
                    c = 17;
                    break;
                }
                break;
            case 1178514824:
                if (str.equals("tab_sharetome")) {
                    c = 18;
                    break;
                }
                break;
            case 2016408475:
                if (str.equals("from_parent_docs")) {
                    c = 19;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                return "personal";
            case 1:
                return "sheet";
            case 2:
                return "mindnote";
            case 3:
                if ("1001".equals(str3)) {
                    return "im";
                }
                if ("1002".equals(str3)) {
                    return "mini_program";
                }
                return "unknown";
            case 4:
                return "favorites";
            case 5:
                return "home";
            case 6:
                return "bitable";
            case 7:
                if (!"attachment".equals(str2)) {
                    str6 = "calendar_link";
                }
                return str6;
            case '\b':
            case 15:
                return "folder";
            case '\t':
                return "offline";
            case '\n':
                if ("attachment".equals(str2)) {
                    str4 = "email";
                } else {
                    str4 = "email_link";
                }
                return str4;
            case 11:
            case 17:
                return "search";
            case HwBuildEx.VersionCodes.EMUI_5_1 /*{ENCODED_INT: 12}*/:
            case 14:
            case 19:
                return "doc";
            case '\r':
                return "shared_folder";
            case 16:
                return "im_link";
            case 18:
                return "sharetome";
            default:
                if ("main".equals(str2)) {
                    str5 = "other_link";
                }
                return str5;
        }
    }

    /* renamed from: c */
    public void mo27941c(AbstractC6946a aVar, String str, String str2) {
        if (aVar != null) {
            HashMap<String, Object> g = m28600g(aVar);
            g.put("click", str);
            g.put("target", str2);
            m28593b("ccm_drive_edit_click", g);
        }
    }

    /* renamed from: b */
    private void m28595b(HashMap<String, Object> hashMap, String str, String str2) {
        Bundle l;
        hashMap.put("file_id", C13598b.m55197d(str));
        hashMap.put("file_type", C8275a.f22375h.mo32553a());
        hashMap.put("module", "drive");
        hashMap.put("src_module", "");
        hashMap.put("sub_module", "");
        hashMap.put("src_obj_id", "");
        hashMap.put("product", C5174a.m21161a(this.f19208g.mo17344E()));
        if (str2 != null) {
            hashMap.put("sub_file_type", str2.toLowerCase());
        } else {
            hashMap.put("sub_file_type", "");
        }
        C7135f a = this.f19210i.mo27992a(str);
        if (!(a == null || a.mo27996a() == null)) {
            hashMap.put("preview_from", a.mo27996a());
        }
        C7137h hVar = this.f19211j;
        if (hVar != null && hVar.f19227a) {
            hashMap.put("preview_from", "vc");
        }
        if (a != null && !TextUtils.isEmpty(a.mo28002b())) {
            hashMap.put("sdkAppId", a.mo28002b());
        }
        if (!(a == null || (l = a.mo28014l()) == null)) {
            hashMap.put("src_module", l.getString("src_module"));
            hashMap.put("sub_module", l.getString("sub_module"));
            hashMap.put("src_obj_id", C13598b.m55197d(l.getString("parent_token")));
        }
        C7137h hVar2 = this.f19211j;
        if (hVar2 != null && hVar2.f19227a) {
            hashMap.put("app_from", "vc");
            hashMap.put("meeting_id", this.f19211j.f19228b);
        }
        hashMap.put("product_type", "drive");
    }

    /* renamed from: c */
    private void m28597c(String str, String str2, String str3, String str4) {
        HashMap<String, Object> hashMap = new HashMap<>();
        hashMap.put("event_type", "mouseClick");
        hashMap.put("mode", "drive_view");
        hashMap.put("action", str3);
        hashMap.put(ShareHitPoint.f121868c, str4);
        hashMap.put("media_type", str4);
        m28595b(hashMap, str, str2);
        C13479a.m54772d("DriveReport", "reportPreviewRelatedEvent map = " + hashMap);
        this.f19207f.mo21079a("toggle_attribute", hashMap);
    }

    /* renamed from: b */
    public static void m28591b(String str, String str2, String str3, String str4) {
        JSONObject jSONObject = new JSONObject();
        try {
            if (!TextUtils.isEmpty(str)) {
                jSONObject.put("module", str);
                String h = ((AbstractC8149a) KoinJavaComponent.m268610a(AbstractC8149a.class)).mo31527h(str);
                if (!TextUtils.isEmpty(h)) {
                    jSONObject.put("target", h);
                }
            } else {
                jSONObject.put("module", "none");
            }
            if (!TextUtils.isEmpty(str2)) {
                jSONObject.put("sub_module", str2);
            } else {
                jSONObject.put("sub_module", "none");
            }
            jSONObject.put("file_id", "none");
            jSONObject.put("file_type", C8275a.f22375h.mo32553a());
            jSONObject.put("sub_file_type", "none");
            if (!TextUtils.isEmpty(str3)) {
                jSONObject.put("container_id", C13598b.m55198e(str3));
                jSONObject.put("container_type", "folder");
            } else {
                jSONObject.put("container_id", "none");
                jSONObject.put("container_type", "none");
            }
            jSONObject.put("app_form", "none");
            jSONObject.put("click", str4);
            jSONObject.put("choose_type", "file");
            jSONObject.put("add_mode", "click_upload");
            AbstractC5233x b = C5234y.m21391b();
            if (b != null) {
                b.mo21081a("ccm_space_file_choose_click", jSONObject, "");
            }
        } catch (JSONException e) {
            C13479a.m54758a("DriveReport", "reportFileChooseClick()...error = " + e);
        }
    }

    /* renamed from: c */
    public void mo27942c(AbstractC6946a aVar, String str, String str2, String str3) {
        HashMap<String, Object> hashMap = new HashMap<>();
        hashMap.put("click", str);
        hashMap.put("diaplay", str2);
        hashMap.put("is_mute", str3);
        hashMap.put("target", "none");
        m28578a(aVar, hashMap);
    }

    /* renamed from: a */
    private void m28581a(String str, String str2, String str3, String str4, String str5) {
        m28582a("drive_sdk_file_open", str, str2, str3, str4, str5);
    }

    /* renamed from: b */
    private void m28592b(String str, String str2, String str3, String str4, String str5) {
        HashMap<String, Object> hashMap = new HashMap<>();
        hashMap.put("action", str3);
        hashMap.put("sub_module", "recent");
        hashMap.put("status_name", str4);
        hashMap.put("sub_confirm_type", str5);
        m28595b(hashMap, str, str2);
        this.f19207f.mo21079a("client_content_management", hashMap);
    }

    /* renamed from: a */
    private void m28582a(String str, String str2, String str3, String str4, String str5, String str6) {
        Object obj;
        Bundle l;
        HashMap<String, Object> hashMap = new HashMap<>();
        hashMap.put("network_status", str4);
        hashMap.put("session_id", this.f19205d);
        hashMap.put("file_tenant_id", C13598b.m55197d(str5));
        hashMap.put("file_is_cross_tenant", str6);
        m28595b(hashMap, str2, str3);
        C7137h hVar = this.f19211j;
        if (hVar == null || !hVar.f19227a) {
            hashMap.put("mode", "preview");
        } else {
            hashMap.put("mode", "presentation");
        }
        C7135f a = this.f19210i.mo27992a(str2);
        if (!(a == null || (l = a.mo28014l()) == null)) {
            String string = l.getString("drive_fragment_type");
            String b = m28589b(a.mo27996a(), string, a.mo28002b());
            str = mo27970j(str, string);
            if (TextUtils.isEmpty(b)) {
                b = l.getString("module");
            }
            hashMap.put("module", b);
            if ("home".equals(b)) {
                String str7 = (String) hashMap.get("sub_module");
                if (!TextUtils.isEmpty(str7)) {
                    if (str7.equals("recent")) {
                        hashMap.put("module", "recent");
                    } else if (str7.equals("quickaccess")) {
                        hashMap.put("module", "quickaccess");
                    }
                }
            }
            if (TextUtils.isEmpty((String) hashMap.get("src_module"))) {
                hashMap.put("src_module", b);
            }
        }
        if ("client_file_open".equals(str)) {
            C7137h hVar2 = this.f19211j;
            if (hVar2 == null || !hVar2.f19227a) {
                obj = "default";
            } else {
                obj = "full";
            }
            hashMap.put("display_type", obj);
        }
        C13479a.m54772d("DriveReport", "reportPreviewEventInternal event = " + str + ", map = " + hashMap);
        this.f19207f.mo21079a(str, hashMap);
    }
}
