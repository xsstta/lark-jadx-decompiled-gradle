package com.bytedance.ee.bear.drive.report;

import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import com.bytedance.ee.bear.contract.AbstractC5233x;
import com.bytedance.ee.bear.contract.AccountService;
import com.bytedance.ee.bear.contract.C5084ad;
import com.bytedance.ee.bear.contract.C5102ai;
import com.bytedance.ee.bear.contract.C5234y;
import com.bytedance.ee.bear.contract.NetService;
import com.bytedance.ee.bear.contract.an;
import com.bytedance.ee.bear.drive.biz.plugin.C6535d;
import com.bytedance.ee.bear.drive.common.DriveNetUtils;
import com.bytedance.ee.bear.drive.config.strategy.AbstractC6927d;
import com.bytedance.ee.bear.drive.config.strategy.C6930g;
import com.bytedance.ee.bear.drive.core.model.AbstractC6946a;
import com.bytedance.ee.bear.drive.report.C7130c;
import com.bytedance.ee.bear.middleground.drive.p452a.AbstractC9349a;
import com.bytedance.ee.bear.service.C10917c;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.p700c.C13598b;
import com.bytedance.ee.util.p702e.C13657b;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import java.util.HashMap;
import java.util.Map;
import org.koin.java.KoinJavaComponent;

/* renamed from: com.bytedance.ee.bear.drive.report.a */
public class C7128a {

    /* renamed from: a */
    private C10917c f19196a;

    /* renamed from: b */
    private AbstractC5233x f19197b;

    /* renamed from: c */
    private an f19198c;

    /* renamed from: d */
    private C7133d f19199d;

    /* renamed from: e */
    private C7137h f19200e;

    /* renamed from: f */
    private HashMap<String, Boolean> f19201f = new HashMap<>();

    /* renamed from: a */
    public void mo27879a(String str, int i) {
        this.f19199d.mo27994b(C7135f.m28702a(str, i));
        this.f19199d.mo27994b(str);
    }

    /* renamed from: a */
    public void mo27882a(String str, int i, String str2, String str3) {
        String a = C7135f.m28702a(str, i);
        C7135f a2 = this.f19199d.mo27992a(a);
        if (a2 == null) {
            a2 = new C7135f();
            this.f19199d.mo27993a(a, a2);
            this.f19199d.mo27993a(str, a2);
        }
        Bundle l = a2.mo28014l();
        if (l == null) {
            l = new Bundle();
        }
        l.putString(str2, str3);
        a2.mo27998a(l);
    }

    /* renamed from: a */
    public void mo27883a(String str, int i, String str2, String str3, Bundle bundle, int i2) {
        String a = C7135f.m28702a(str, i);
        C7135f a2 = this.f19199d.mo27992a(a);
        if (a2 == null) {
            a2 = new C7135f();
            this.f19199d.mo27993a(a, a2);
            this.f19199d.mo27993a(str, a2);
        }
        a2.mo28000a(str);
        a2.mo28003b(str2);
        a2.mo28004c(str3);
        a2.mo27998a(bundle);
        a2.mo27997a(i2);
    }

    /* renamed from: a */
    public void mo27893a(String str, boolean z, int i) {
        String a = C7135f.m28702a(str, i);
        C7135f a2 = this.f19199d.mo27992a(a);
        if (a2 == null) {
            a2 = new C7135f();
            this.f19199d.mo27993a(a, a2);
            this.f19199d.mo27993a(str, a2);
        }
        a2.mo28001a(z);
    }

    /* renamed from: a */
    public void mo27884a(String str, AbstractC6946a aVar, AbstractC6927d dVar) {
        String str2;
        String a = m28538a(aVar);
        String b = m28544b(aVar);
        long c = m28546c(aVar);
        if (a != null && !a.startsWith("local_")) {
            HashMap hashMap = new HashMap();
            int a2 = m28537a(dVar);
            String a3 = m28539a(a, str, a2);
            C7135f a4 = this.f19199d.mo27992a(a);
            String a5 = this.f19197b.mo21075a(a3, "start_time");
            if (a5 != null) {
                try {
                    long uptimeMillis = SystemClock.uptimeMillis() - Long.parseLong(a5);
                    hashMap.put("stage", str);
                    hashMap.put("loading_type", Integer.valueOf(a2));
                    if (a4 == null) {
                        str2 = "";
                    } else {
                        str2 = a4.mo27996a();
                    }
                    m28542a(hashMap, uptimeMillis, a, b, c, str2);
                    C13479a.m54772d("DriveDevPerformanceReport", "reportTimeCostEvent 111 ==>" + hashMap);
                    this.f19197b.mo21079a("dev_performance_drive_open_stages", hashMap);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }

    /* renamed from: a */
    public void mo27887a(String str, String str2, AbstractC6927d dVar) {
        HashMap hashMap = new HashMap();
        C7135f a = this.f19199d.mo27992a(str2);
        int a2 = m28537a(dVar);
        String a3 = this.f19197b.mo21075a(m28539a(str2, str, a2), "start_time");
        if (a3 != null) {
            try {
                long uptimeMillis = SystemClock.uptimeMillis() - Long.parseLong(a3);
                hashMap.put("stage", str);
                hashMap.put("loading_type", Integer.valueOf(a2));
                if (a != null) {
                    m28542a(hashMap, uptimeMillis, str2, a.mo28005c(), a.mo28006d(), a.mo27996a());
                } else {
                    m28542a(hashMap, uptimeMillis, str2, "", 0, "");
                }
                C13479a.m54772d("DriveDevPerformanceReport", "reportTimeCostEvent 222 ==>" + hashMap);
                this.f19197b.mo21079a("dev_performance_drive_open_stages", hashMap);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    /* renamed from: a */
    public void mo27889a(String str, String str2, String str3, int i) {
        mo27891a(str, str2, str3, i, "", "");
    }

    /* renamed from: a */
    public void mo27890a(String str, String str2, String str3, int i, String str4) {
        mo27891a(str, str2, str3, i, "", str4);
    }

    /* renamed from: a */
    public void mo27891a(String str, String str2, String str3, int i, String str4, String str5) {
        m28541a("dev_performance_drive_open_finish", str, str2, str3, i, str4, str5);
    }

    /* renamed from: a */
    public void mo27880a(String str, int i, long j, AbstractC6946a aVar) {
        if (aVar != null && aVar.mo27322a() != null) {
            mo27881a(str, i, j, aVar.mo27322a().f18785a, aVar.mo27322a().mo27364g(), aVar.mo27322a().f18787c);
        }
    }

    /* renamed from: a */
    public void mo27881a(String str, int i, long j, String str2, String str3, long j2) {
        String str4 = "";
        String str5 = (String) C13657b.m55418a(str2, str4);
        String str6 = (String) C13657b.m55418a(str3, str4);
        HashMap hashMap = new HashMap();
        C7135f a = this.f19199d.mo27992a(str5);
        try {
            hashMap.put("key", str);
            hashMap.put("code", Integer.valueOf(i));
            if (a != null) {
                str4 = a.mo27996a();
            }
            m28542a(hashMap, j, str5, str6, j2, str4);
            C13479a.m54772d("DriveDevPerformanceReport", "reportDataCollection " + hashMap);
            this.f19197b.mo21079a("dev_performance_data_collection", hashMap);
        } catch (Exception e) {
            C13479a.m54761a("DriveDevPerformanceReport", e);
        }
    }

    /* renamed from: a */
    public void mo27885a(String str, String str2) {
        if (str != null) {
            String concat = str.concat(str2);
            this.f19197b.mo21077a(concat);
            this.f19197b.mo21078a(concat, "start_time", String.valueOf(SystemClock.uptimeMillis()));
        }
    }

    /* renamed from: a */
    public void mo27878a(String str) {
        if (str != null) {
            String concat = str.concat("dev_performance_drive_import_finish");
            this.f19197b.mo21077a(concat);
            this.f19197b.mo21078a(concat, "start_time", String.valueOf(SystemClock.uptimeMillis()));
        }
    }

    /* renamed from: a */
    public void mo27888a(String str, String str2, String str3) {
        String str4;
        String str5;
        C7135f a = this.f19199d.mo27992a(str3);
        HashMap hashMap = new HashMap();
        if (a != null) {
            str4 = a.mo28005c();
        } else {
            str4 = "";
        }
        long d = a != null ? a.mo28006d() : 0;
        String a2 = this.f19197b.mo21075a(str3.concat("dev_performance_drive_import_finish"), "start_time");
        if (a2 != null) {
            try {
                long uptimeMillis = SystemClock.uptimeMillis() - Long.parseLong(a2);
                hashMap.put("result_key", str);
                hashMap.put("result_code", str2);
                if (a == null) {
                    str5 = "";
                } else {
                    str5 = a.mo27996a();
                }
                m28542a(hashMap, uptimeMillis, str3, str4, d, str5);
                C13479a.m54772d("DriveDevPerformanceReport", "reportImportFinishEvent map = " + hashMap);
                this.f19197b.mo21079a("dev_performance_drive_import_finish", hashMap);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    /* renamed from: a */
    public void mo27886a(String str, String str2, long j, long j2, long j3, long j4, long j5, String str3, String str4, long j6) {
        String str5;
        HashMap hashMap = new HashMap();
        C7135f a = this.f19199d.mo27992a(str);
        if (a == null) {
            str5 = "";
        } else {
            str5 = a.mo27996a();
        }
        m28542a(hashMap, j6, str, str2, j, str5);
        hashMap.put("image_height", Long.valueOf(j2));
        hashMap.put("image_width", Long.valueOf(j3));
        hashMap.put("screen_height", Long.valueOf(j4));
        hashMap.put("screen_width", Long.valueOf(j5));
        hashMap.put("open_mode", str3);
        hashMap.put("result_key", str4);
        C13479a.m54772d("DriveDevPerformanceReport", "reportImagePreviewEvent :  " + hashMap);
        this.f19197b.mo21079a("image_preview", hashMap);
    }

    /* renamed from: a */
    public void mo27892a(String str, HashMap<String, Object> hashMap) {
        HashMap hashMap2 = new HashMap();
        hashMap2.put("archive_file_type", str);
        hashMap2.putAll(hashMap);
        this.f19197b.mo21084b("ccm_drive_archive_extract_dev", hashMap2);
    }

    /* renamed from: a */
    public void mo27877a(C7137h hVar) {
        this.f19200e = hVar;
    }

    /* renamed from: a */
    public static int m28537a(AbstractC6927d dVar) {
        if (dVar != null && (dVar instanceof C6930g)) {
            return 1;
        }
        return 0;
    }

    /* renamed from: b */
    public static String m28544b(AbstractC6946a aVar) {
        if (aVar == null) {
            return "";
        }
        return aVar.mo27322a().mo27364g();
    }

    /* renamed from: a */
    public static String m28538a(AbstractC6946a aVar) {
        if (aVar == null || aVar.mo27322a() == null) {
            return "";
        }
        return aVar.mo27322a().f18785a;
    }

    /* renamed from: c */
    public static long m28546c(AbstractC6946a aVar) {
        if (aVar == null || aVar.mo27322a() == null) {
            return 0;
        }
        return aVar.mo27322a().f18787c;
    }

    /* renamed from: b */
    public void mo27894b(String str) {
        if (TextUtils.isEmpty(str) || this.f19201f.containsKey(str)) {
            this.f19201f.remove(str);
        } else {
            mo27889a("nativeFail", "DEC1", str, 3);
        }
    }

    /* renamed from: c */
    private static String m28547c(String str) {
        int indexOf;
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        int indexOf2 = str.indexOf("CronetError");
        if (indexOf2 >= 0) {
            int indexOf3 = str.indexOf("url=");
            if (indexOf3 <= 0 || indexOf3 <= indexOf2) {
                return str;
            }
            return str.substring(indexOf2, indexOf3);
        }
        int indexOf4 = str.indexOf("ReqwestError");
        if (indexOf4 < 0 || (indexOf = str.indexOf("https://")) <= 0 || indexOf <= indexOf4) {
            return str;
        }
        return str.substring(indexOf4, indexOf);
    }

    /* renamed from: a */
    public static String m28540a(Throwable th) {
        String str;
        String str2 = "";
        if (th != null) {
            str = th.toString();
            if (th.getCause() != null) {
                str2 = th.getCause().toString();
            }
        } else {
            str = str2;
        }
        if (TextUtils.isEmpty(str2)) {
            return str;
        }
        return String.format("%s. cause: %s", str, m28547c(str2));
    }

    /* renamed from: b */
    public static String m28545b(Throwable th) {
        if (th instanceof NetService.ServerErrorException) {
            return ((NetService.ServerErrorException) th).getCode() + "";
        } else if (!(th instanceof NetService.HttpErrorException)) {
            return "";
        } else {
            return ((NetService.HttpErrorException) th).getCode() + "";
        }
    }

    /* renamed from: c */
    public void mo27898c(Throwable th) {
        HashMap hashMap = new HashMap();
        String message = th.getMessage();
        if (message == null) {
            message = "unknown";
        }
        hashMap.put("drive_load_mime_types_properties", message);
        this.f19197b.mo21079a("load_mimetype_properties", hashMap);
    }

    /* renamed from: c */
    private String m28548c(String str, String str2) {
        return str.concat("dev_performance_drive_open_finish").concat("0");
    }

    public C7128a(C10917c cVar, C7133d dVar) {
        this.f19196a = cVar;
        this.f19197b = C5234y.m21391b();
        this.f19198c = (an) KoinJavaComponent.m268610a(an.class);
        this.f19199d = dVar;
    }

    /* renamed from: b */
    private long m28543b(String str, int i) {
        String a;
        if ((i == 3 || i == 5) && (a = this.f19197b.mo21075a(m28548c(str, "dev_performance_drive_open_finish"), "start_time")) != null) {
            try {
                return SystemClock.uptimeMillis() - Long.parseLong(a);
            } catch (Exception e) {
                C13479a.m54761a("DriveDevPerformanceReport", e);
            }
        }
        return -1;
    }

    /* renamed from: b */
    public void mo27895b(String str, String str2) {
        String str3;
        long j;
        String str4;
        C7135f a = this.f19199d.mo27992a(str);
        HashMap hashMap = new HashMap();
        if (a != null) {
            str3 = a.mo28005c();
        } else {
            str3 = "";
        }
        if (a != null) {
            j = a.mo28006d();
        } else {
            j = 0;
        }
        String concat = str.concat(str2);
        C7135f a2 = this.f19199d.mo27992a(str);
        String a3 = this.f19197b.mo21075a(concat, "start_time");
        if (a3 != null) {
            try {
                long uptimeMillis = SystemClock.uptimeMillis() - Long.parseLong(a3);
                hashMap.put("stage", str2);
                if (a2 == null) {
                    str4 = "";
                } else {
                    str4 = a2.mo27996a();
                }
                m28542a(hashMap, uptimeMillis, str, str3, j, str4);
                C13479a.m54772d("DriveDevPerformanceReport", "reportImportTimeCostEvent map = " + hashMap);
                this.f19197b.mo21079a("dev_performance_drive_import_stages", hashMap);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    /* renamed from: a */
    public void mo27874a(AbstractC6946a aVar, int i) {
        if (aVar != null) {
            String a = C7135f.m28702a(aVar.mo27322a().f18785a, i);
            C7135f a2 = this.f19199d.mo27992a(a);
            if (a2 == null) {
                a2 = new C7135f();
                this.f19199d.mo27993a(a, a2);
                this.f19199d.mo27993a(aVar.mo27322a().f18785a, a2);
            }
            a2.mo27999a(aVar);
        }
    }

    /* renamed from: a */
    private String m28539a(String str, String str2, int i) {
        return str.concat(str2).concat(String.valueOf(i));
    }

    /* renamed from: b */
    public void mo27896b(String str, String str2, AbstractC6927d dVar) {
        if (str != null && !str.startsWith("local_")) {
            String a = m28539a(str, str2, m28537a(dVar));
            this.f19197b.mo21077a(a);
            this.f19197b.mo21078a(a, "start_time", String.valueOf(SystemClock.uptimeMillis()));
        }
    }

    /* renamed from: a */
    public void mo27875a(AbstractC6946a aVar, int i, int i2) {
        if (i != 1000) {
            mo27876a(C7130c.m28587b(aVar), i, i2);
        }
    }

    /* renamed from: a */
    public void mo27876a(C7130c.C7132a aVar, int i, int i2) {
        if (i != 403) {
            if (i != 404) {
                if (i == 1000) {
                    C13479a.m54764b("DriveDevPerformanceReport", "reportRustDownloadFailedFinishEvent user cancel");
                    return;
                } else if (i == 1007 || i == 1010) {
                    mo27889a("nativeFail", "DEC3", aVar.mo27989c(), i2);
                    return;
                } else if (i == 1024) {
                    C13479a.m54764b("DriveDevPerformanceReport", "reportRustDownloadFailedFinishEvent user not login");
                    return;
                } else if (i != 2003) {
                    if (i == 3002) {
                        mo27889a("nativeFail", "DEC16", aVar.mo27989c(), i2);
                        return;
                    } else if (DriveNetUtils.m27237a()) {
                        mo27889a("nativeFail", "DEC3", aVar.mo27989c(), i2);
                        return;
                    } else {
                        mo27890a("rustFail", "DEC8", aVar.mo27989c(), i2, "rust error, code: " + i);
                        return;
                    }
                }
            }
            mo27889a("nativeFail", "DEC27", aVar.mo27989c(), i2);
            return;
        }
        mo27889a("nativeFail", "DEC4", aVar.mo27989c(), i2);
    }

    /* renamed from: a */
    private void m28542a(Map<String, Object> map, long j, String str, String str2, long j2, String str3) {
        map.put(HiAnalyticsConstant.BI_KEY_COST_TIME, Long.valueOf(j));
        map.put("file_token", C13598b.m55197d(str));
        if (TextUtils.isEmpty(str2)) {
            map.put("file_type", str2);
        } else {
            map.put("file_type", str2.toLowerCase());
        }
        map.put("file_size", Long.valueOf(j2));
        if (this.f19198c.mo16408f() != null) {
            map.put("user_id", C13598b.m55197d(this.f19198c.mo16408f().f14584a));
            map.put("tenant_id", C13598b.m55197d(this.f19198c.mo16408f().f14592i));
        }
        if (!TextUtils.isEmpty(str3)) {
            map.put("preview_from", str3);
        } else {
            C13479a.m54775e("DriveDevPerformanceReport", "PREVIEW_FROM is empty...");
        }
        C7135f a = this.f19199d.mo27992a(str);
        if (a != null && !TextUtils.isEmpty(a.mo28002b())) {
            map.put("sdkAppId", a.mo28002b());
        }
    }

    /* renamed from: b */
    public void mo27897b(String str, String str2, String str3, int i, String str4, String str5) {
        m28541a("dev_performance_drive_open_downgrade", str, str2, str3, i, str4, str5);
    }

    /* renamed from: a */
    private void m28541a(String str, String str2, String str3, String str4, int i, String str5, String str6) {
        String str7;
        HashMap hashMap = new HashMap();
        hashMap.put("result_key", str2);
        hashMap.put("result_code", str3);
        hashMap.put("file_token", C13598b.m55197d(str4));
        if (TextUtils.isEmpty(str5)) {
            str5 = "";
        }
        hashMap.put("open_type", str5);
        if (TextUtils.isEmpty(str6)) {
            str6 = "";
        }
        hashMap.put("error_message", str6);
        hashMap.put("source_type", String.valueOf(i));
        hashMap.put(HiAnalyticsConstant.BI_KEY_COST_TIME, Long.valueOf(m28543b(str4, i)));
        C7135f a = this.f19199d.mo27992a(C7135f.m28702a(str4, i));
        if (a != null) {
            hashMap.put("preview_from", a.mo27996a());
            if (!TextUtils.isEmpty(a.mo28002b())) {
                hashMap.put("sdkAppId", a.mo28002b());
            }
            hashMap.put("file_type", a.mo28005c());
            hashMap.put("file_size", Long.valueOf(a.mo28006d()));
            hashMap.put("preview_type", Integer.valueOf(a.mo28007e()));
            hashMap.put("preview_ext", a.mo28008f());
            hashMap.put("preview_size", Long.valueOf(a.mo28009g()));
            hashMap.put("doc_has_cache", Integer.valueOf(a.mo28010h()));
            hashMap.put("mime_type", a.mo28011i());
            hashMap.put("real_mime_type", a.mo28012j());
            String str8 = "1";
            if (a.mo28013k()) {
                str7 = str8;
            } else {
                str7 = "0";
            }
            hashMap.put("isRealType", str7);
            Bundle l = a.mo28014l();
            if (l != null) {
                for (String str9 : l.keySet()) {
                    hashMap.put(str9, l.get(str9));
                }
            }
            if (a.mo28016n()) {
                str8 = "2";
            }
            hashMap.put("load_from", str8);
        }
        hashMap.put("tt_init", Boolean.valueOf(C6535d.m26238a().mo26100j()));
        hashMap.put("tt_pluginstateenable", Boolean.valueOf(C6535d.m26238a().mo26083e()));
        hashMap.put("tt_pkgcanuseplugin", Boolean.valueOf(C6535d.m26238a().mo26082d()));
        hashMap.put("tt_netinitfalseuninstalled", Boolean.valueOf(C6535d.m26238a().mo26098h()));
        C7137h hVar = this.f19200e;
        if (hVar != null && hVar.f19227a) {
            hashMap.put("preview_from", "vc");
        }
        AccountService.Account f = ((an) KoinJavaComponent.m268610a(an.class)).mo16408f();
        if (f != null) {
            hashMap.put("user_id", C13598b.m55197d(f.f14584a));
            hashMap.put("tenant_id", C13598b.m55197d(f.f14592i));
        }
        hashMap.put("doc_network_status", String.valueOf(C5084ad.m20847d().mo20038b().mo20040a()));
        hashMap.put("app_visible", String.valueOf(C5102ai.m20872j().mo20212d()));
        hashMap.put("app_doze", String.valueOf(C5102ai.m20872j().mo20214f()));
        hashMap.put("doc_network_level", String.valueOf(((AbstractC9349a) KoinJavaComponent.m268610a(AbstractC9349a.class)).mo35644j().getValue()));
        C13479a.m54764b("DriveDevPerformanceReport", "event = " + str + ", reportOpenFinishEvent, data: " + C13598b.m55190a(hashMap));
        this.f19201f.put(str4, true);
        this.f19197b.mo21079a(str, hashMap);
    }
}
