package com.bytedance.geckox.statistic;

import android.accounts.NetworkErrorException;
import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import com.bytedance.geckox.C14189a;
import com.bytedance.geckox.C14218d;
import com.bytedance.geckox.C14264e;
import com.bytedance.geckox.model.Common;
import com.bytedance.geckox.p757a.C14190a;
import com.bytedance.geckox.p761c.C14217b;
import com.bytedance.geckox.p771g.C14276b;
import com.bytedance.geckox.p772h.AbstractC14280c;
import com.bytedance.geckox.p772h.C14281d;
import com.bytedance.geckox.statistic.model.C14348a;
import com.bytedance.geckox.statistic.model.C14349b;
import com.bytedance.geckox.statistic.model.EventMessageModel;
import com.bytedance.geckox.statistic.model.StatisticModel;
import com.bytedance.geckox.statistic.p781a.C14329a;
import com.bytedance.geckox.utils.C14350a;
import com.bytedance.geckox.utils.C14364j;
import com.bytedance.geckox.utils.C14367l;
import com.bytedance.geckox.utils.C14373o;
import com.google.gson.reflect.TypeToken;
import com.huawei.updatesdk.service.otaupdate.UpdateKey;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.geckox.statistic.e */
public class C14343e {

    /* renamed from: a */
    private static long f37658a;

    /* renamed from: b */
    private static long f37659b;

    /* renamed from: a */
    public static void m57785a(Context context, C14331b bVar) {
        StatisticModel a = m57778a(context, m57777a(context), bVar);
        if (a != null && a.packages != null && C14264e.m57551a().mo52229d()) {
            String json = C14217b.m57431a().mo52132b().toJson(a);
            if (!TextUtils.isEmpty(json)) {
                m57789a(C14264e.m57551a().mo52233h().mo52034b(), C14264e.m57551a().mo52233h().mo52035c(), json);
            }
        }
    }

    /* renamed from: a */
    public static void m57788a(C14218d dVar, C14349b bVar) {
        AbstractC14328a g = C14264e.m57551a().mo52233h().mo52039g();
        if (g != null) {
            try {
                g.upload("geckosdk_query_pkgs", m57796b(dVar, bVar));
            } catch (Throwable th) {
                C14276b.m57603a("gecko-debug-tag", "UploadStatistic.query.pkgs:", th);
            }
        }
    }

    /* renamed from: a */
    public static void m57787a(Context context, C14348a aVar) {
        AbstractC14328a g = C14264e.m57551a().mo52233h().mo52039g();
        if (g != null) {
            try {
                List<StatisticModel.PackageStatisticModel> a = m57781a(aVar);
                if (a == null) {
                    return;
                }
                if (!a.isEmpty()) {
                    Common a2 = m57777a(context);
                    for (StatisticModel.PackageStatisticModel packageStatisticModel : a) {
                        g.upload("geckosdk_update_stats", m57782a(packageStatisticModel, a2));
                    }
                }
            } catch (Exception e) {
                C14276b.m57603a("gecko-debug-tag", "UploadStatistic.uploadChannel", e);
            }
        }
    }

    /* renamed from: a */
    public static void m57786a(Context context, StatisticModel.PackageStatisticModel packageStatisticModel) {
        AbstractC14328a g = C14264e.m57551a().mo52233h().mo52039g();
        if (g != null) {
            try {
                g.upload("geckosdk_update_stats", m57782a(packageStatisticModel, m57777a(context)));
            } catch (Exception e) {
                C14276b.m57603a("gecko-debug-tag", "UploadStatistic.uploadCleanChannel", e);
            }
        }
    }

    /* renamed from: a */
    private static void m57789a(final AbstractC14280c cVar, String str, final String str2) {
        final String str3 = "https://" + str + "/gecko/server/packages/stats";
        C14373o.m57855a().mo52491b().execute(new Runnable() {
            /* class com.bytedance.geckox.statistic.C14343e.RunnableC143441 */

            public void run() {
                for (int i = 0; i < 3; i++) {
                    try {
                        C14281d a = cVar.mo52248a(str3, str2);
                        if (a.f37540c != 200) {
                            throw new NetworkErrorException("net work get failed, code: " + a.f37540c + ", url:" + str3);
                        } else if (new JSONObject(a.f37539b).getInt(UpdateKey.STATUS) == 0) {
                            return;
                        }
                    } catch (Exception e) {
                        C14276b.m57603a("gecko-debug-tag", "upload statistic:", e);
                    }
                }
            }
        });
    }

    /* renamed from: a */
    private static void m57791a(C14348a aVar, List<StatisticModel.PackageStatisticModel> list) {
        if (!aVar.f37670B || !aVar.f37671C) {
            StatisticModel.PackageStatisticModel packageStatisticModel = new StatisticModel.PackageStatisticModel();
            list.add(packageStatisticModel);
            packageStatisticModel.statsType = 1;
            packageStatisticModel.reqType = aVar.f37675G;
            packageStatisticModel.syncTaskId = aVar.f37676H;
            packageStatisticModel.apiVersion = aVar.f37677I;
            packageStatisticModel.updatePriority = aVar.f37678J;
            packageStatisticModel.accessKey = aVar.f37679a;
            packageStatisticModel.groupName = aVar.f37680b;
            packageStatisticModel.channel = aVar.f37681c;
            packageStatisticModel.ac = aVar.f37694p;
            packageStatisticModel.id = aVar.f37696r;
            packageStatisticModel.downloadRetryTimes = m57779a(aVar.f37701w);
            packageStatisticModel.downloadUrl = aVar.f37700v;
            packageStatisticModel.downloadFailRecords = m57795b(aVar.f37701w);
            packageStatisticModel.totalDuration = m57780a((Long) 0L, packageStatisticModel.downloadFailRecords);
            if (!aVar.f37670B) {
                packageStatisticModel.errCode = "300";
                if (aVar.f37701w != null && !aVar.f37701w.isEmpty()) {
                    packageStatisticModel.errMsg = aVar.f37701w.get(0).reason;
                }
            } else if (!aVar.f37671C) {
                packageStatisticModel.errCode = "450";
                packageStatisticModel.errMsg = aVar.f37673E;
            }
        } else {
            StatisticModel.PackageStatisticModel packageStatisticModel2 = new StatisticModel.PackageStatisticModel();
            list.add(packageStatisticModel2);
            packageStatisticModel2.reqType = aVar.f37675G;
            packageStatisticModel2.syncTaskId = aVar.f37676H;
            packageStatisticModel2.apiVersion = aVar.f37677I;
            packageStatisticModel2.updatePriority = aVar.f37678J;
            packageStatisticModel2.statsType = 0;
            packageStatisticModel2.accessKey = aVar.f37679a;
            packageStatisticModel2.groupName = aVar.f37680b;
            packageStatisticModel2.channel = aVar.f37681c;
            packageStatisticModel2.ac = aVar.f37694p;
            packageStatisticModel2.id = aVar.f37696r;
            packageStatisticModel2.downloadRetryTimes = m57779a(aVar.f37701w);
            packageStatisticModel2.downloadUrl = aVar.f37700v;
            packageStatisticModel2.downloadFailRecords = m57795b(aVar.f37701w);
            packageStatisticModel2.downloadDuration = Long.valueOf(aVar.f37703y - aVar.f37702x);
            packageStatisticModel2.totalDuration = m57780a(packageStatisticModel2.downloadDuration, packageStatisticModel2.downloadFailRecords);
            if (aVar.f37672D) {
                StatisticModel.PackageStatisticModel packageStatisticModel3 = new StatisticModel.PackageStatisticModel();
                list.add(packageStatisticModel3);
                packageStatisticModel3.reqType = aVar.f37675G;
                packageStatisticModel3.syncTaskId = aVar.f37676H;
                packageStatisticModel3.apiVersion = aVar.f37677I;
                packageStatisticModel3.updatePriority = aVar.f37678J;
                packageStatisticModel3.accessKey = aVar.f37679a;
                packageStatisticModel3.groupName = aVar.f37680b;
                packageStatisticModel3.statsType = 2;
                packageStatisticModel3.id = aVar.f37696r;
                packageStatisticModel3.channel = aVar.f37681c;
                packageStatisticModel3.activeCheckDuration = Long.valueOf(aVar.f37704z - aVar.f37703y);
                packageStatisticModel3.applyDuration = Long.valueOf(aVar.f37669A - aVar.f37704z);
                return;
            }
            StatisticModel.PackageStatisticModel packageStatisticModel4 = new StatisticModel.PackageStatisticModel();
            list.add(packageStatisticModel4);
            packageStatisticModel4.reqType = aVar.f37675G;
            packageStatisticModel4.syncTaskId = aVar.f37676H;
            packageStatisticModel4.apiVersion = aVar.f37677I;
            packageStatisticModel4.updatePriority = aVar.f37678J;
            packageStatisticModel4.statsType = 3;
            packageStatisticModel4.accessKey = aVar.f37679a;
            packageStatisticModel4.groupName = aVar.f37680b;
            packageStatisticModel4.errCode = "500";
            packageStatisticModel4.id = aVar.f37696r;
            packageStatisticModel4.channel = aVar.f37681c;
            packageStatisticModel4.errMsg = aVar.f37674F;
        }
    }

    /* renamed from: a */
    public static void m57790a(EventMessageModel eventMessageModel) {
        AbstractC14328a g = C14264e.m57551a().mo52233h().mo52039g();
        if (g != null) {
            try {
                JSONObject jSONObject = new JSONObject(C14217b.m57431a().mo52132b().toJson(eventMessageModel));
                m57783a(jSONObject);
                g.upload("geckosdk_event_message", jSONObject);
            } catch (Throwable th) {
                C14276b.m57603a("gecko-debug-tag", "UploadStatistic.uploadSyncEvent", th);
            }
        }
    }

    /* renamed from: a */
    public static void m57784a() {
        if (C14189a.m57302a().mo52071d() && C14329a.m57726a().mo52458b()) {
            long currentTimeMillis = System.currentTimeMillis();
            if (currentTimeMillis - f37658a >= 300000) {
                f37658a = currentTimeMillis;
                C14373o.m57855a().mo52491b().execute(new Runnable() {
                    /* class com.bytedance.geckox.statistic.C14343e.RunnableC143463 */

                    public void run() {
                        long currentTimeMillis = System.currentTimeMillis();
                        Map<String, String> b = C14264e.m57551a().mo52225b();
                        long[] jArr = {0, 0, 0};
                        for (Map.Entry<String, String> entry : b.entrySet()) {
                            long[] a = C14367l.m57845a(new File(entry.getValue()), entry.getKey());
                            if (a != null) {
                                for (int i = 0; i < a.length; i++) {
                                    jArr[i] = jArr[i] + a[i];
                                }
                            }
                        }
                        C14343e.m57793a(b, currentTimeMillis, jArr);
                    }
                });
            }
        }
    }

    /* renamed from: a */
    public static void m57793a(Map<String, String> map, long j, long[] jArr) {
        if (jArr != null) {
            try {
                long j2 = jArr[0];
                long j3 = jArr[1];
                long j4 = jArr[2];
                long currentTimeMillis = System.currentTimeMillis() - j;
                C14276b.m57604a("gecko-debug-tag", "gecko resource info", "active_resource_usage:" + j2, "inactive_resource_usage:" + j3, "backup_resource_usage:" + j4, "cost:" + currentTimeMillis);
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("inactive_resource_usage", j3);
                jSONObject.put("backup_resource_usage", j4);
                jSONObject.put("active_resource_usage", j2);
                jSONObject.put("cost", currentTimeMillis);
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("sdk_version", "2.4.1");
                jSONObject2.put("aid", String.valueOf(C14264e.m57551a().mo52230e().aid));
                JSONObject jSONObject3 = new JSONObject();
                jSONObject3.put("dir4AccessKey", C14217b.m57431a().mo52132b().toJson(map));
                C14329a.m57726a().mo52457a("geckosdk_resource_info", jSONObject2, jSONObject, jSONObject3);
            } catch (Throwable th) {
                C14276b.m57603a("gecko-debug-tag", "UploadStatistic.uploadResourceInfo", th);
            }
        }
    }

    /* renamed from: a */
    public static void m57792a(final String str, final String str2, final String str3, final String str4, final String str5, final String str6) {
        if (C14329a.m57726a().mo52458b()) {
            long currentTimeMillis = System.currentTimeMillis();
            if (currentTimeMillis - f37659b >= 300000) {
                f37659b = currentTimeMillis;
                C14373o.m57855a().mo52491b().execute(new Runnable() {
                    /* class com.bytedance.geckox.statistic.C14343e.RunnableC143474 */

                    public void run() {
                        try {
                            JSONObject jSONObject = new JSONObject();
                            jSONObject.put("gecko_sdk_version", "2.4.1");
                            jSONObject.put("access_key", str);
                            jSONObject.put("channel", str2);
                            jSONObject.put("id", str3);
                            jSONObject.put(ShareHitPoint.f121869d, str4);
                            jSONObject.put("hit_local", str5);
                            jSONObject.put("is_blacklist", str6);
                            C14329a.m57726a().mo52457a("geckosdk_resource_access", jSONObject, null, null);
                        } catch (Throwable th) {
                            C14276b.m57603a("gecko-debug-tag", "UploadStatistic.uploadResourceAccess", th);
                        }
                    }
                });
            }
        }
    }

    /* renamed from: b */
    private static List<StatisticModel.PackageStatisticModel> m57794b(Context context) {
        return C14190a.m57306a(context);
    }

    /* renamed from: b */
    private static List<StatisticModel.PackageStatisticModel.DownloadFailRecords> m57795b(List<StatisticModel.PackageStatisticModel.DownloadFailRecords> list) {
        if (list == null || list.isEmpty()) {
            return null;
        }
        return list;
    }

    /* renamed from: a */
    private static Common m57777a(Context context) {
        Common e = C14264e.m57551a().mo52230e();
        String b = C14350a.m57809b(context);
        e.ac = C14364j.m57839a(context);
        e.appName = b;
        return e;
    }

    /* renamed from: a */
    private static Integer m57779a(List<StatisticModel.PackageStatisticModel.DownloadFailRecords> list) {
        if (list == null || list.isEmpty()) {
            return null;
        }
        return Integer.valueOf(list.size());
    }

    /* renamed from: a */
    private static List<StatisticModel.PackageStatisticModel> m57781a(C14348a aVar) {
        ArrayList arrayList = new ArrayList();
        if (aVar.f37682d == null && aVar.f37684f == 0) {
            m57791a(aVar, arrayList);
        } else if (!aVar.f37686h || !aVar.f37687i) {
            StatisticModel.PackageStatisticModel packageStatisticModel = new StatisticModel.PackageStatisticModel();
            arrayList.add(packageStatisticModel);
            packageStatisticModel.statsType = 101;
            packageStatisticModel.reqType = aVar.f37675G;
            packageStatisticModel.syncTaskId = aVar.f37676H;
            packageStatisticModel.apiVersion = aVar.f37677I;
            packageStatisticModel.updatePriority = aVar.f37678J;
            packageStatisticModel.accessKey = aVar.f37679a;
            packageStatisticModel.groupName = aVar.f37680b;
            packageStatisticModel.channel = aVar.f37681c;
            packageStatisticModel.ac = aVar.f37694p;
            packageStatisticModel.patchId = aVar.f37695q;
            packageStatisticModel.id = aVar.f37696r;
            packageStatisticModel.downloadRetryTimes = m57779a(aVar.f37683e);
            packageStatisticModel.downloadUrl = aVar.f37682d;
            packageStatisticModel.downloadFailRecords = m57795b(aVar.f37683e);
            packageStatisticModel.totalDuration = m57780a((Long) 0L, packageStatisticModel.downloadFailRecords);
            if (!aVar.f37686h) {
                packageStatisticModel.errCode = "301";
                if (aVar.f37683e != null && !aVar.f37683e.isEmpty()) {
                    packageStatisticModel.errMsg = aVar.f37683e.get(0).reason;
                }
            } else if (!aVar.f37687i) {
                packageStatisticModel.errCode = "402";
                packageStatisticModel.errMsg = aVar.f37697s;
            }
            m57791a(aVar, arrayList);
        } else {
            StatisticModel.PackageStatisticModel packageStatisticModel2 = new StatisticModel.PackageStatisticModel();
            arrayList.add(packageStatisticModel2);
            packageStatisticModel2.statsType = 100;
            packageStatisticModel2.reqType = aVar.f37675G;
            packageStatisticModel2.syncTaskId = aVar.f37676H;
            packageStatisticModel2.apiVersion = aVar.f37677I;
            packageStatisticModel2.updatePriority = aVar.f37678J;
            packageStatisticModel2.groupName = aVar.f37680b;
            packageStatisticModel2.accessKey = aVar.f37679a;
            packageStatisticModel2.channel = aVar.f37681c;
            packageStatisticModel2.ac = aVar.f37694p;
            packageStatisticModel2.id = aVar.f37696r;
            packageStatisticModel2.patchId = aVar.f37695q;
            packageStatisticModel2.downloadRetryTimes = m57779a(aVar.f37683e);
            packageStatisticModel2.downloadUrl = aVar.f37682d;
            packageStatisticModel2.downloadFailRecords = m57795b(aVar.f37683e);
            packageStatisticModel2.downloadDuration = Long.valueOf(aVar.f37685g - aVar.f37684f);
            packageStatisticModel2.totalDuration = m57780a(packageStatisticModel2.downloadDuration, packageStatisticModel2.downloadFailRecords);
            if (!aVar.f37688j) {
                StatisticModel.PackageStatisticModel packageStatisticModel3 = new StatisticModel.PackageStatisticModel();
                arrayList.add(packageStatisticModel3);
                packageStatisticModel3.statsType = 100;
                packageStatisticModel3.groupName = aVar.f37680b;
                packageStatisticModel3.reqType = aVar.f37675G;
                packageStatisticModel3.syncTaskId = aVar.f37676H;
                packageStatisticModel3.apiVersion = aVar.f37677I;
                packageStatisticModel3.updatePriority = aVar.f37678J;
                packageStatisticModel3.channel = aVar.f37681c;
                packageStatisticModel3.errCode = "403";
                packageStatisticModel3.errMsg = aVar.f37698t;
                packageStatisticModel3.ac = aVar.f37694p;
                packageStatisticModel3.patchId = aVar.f37695q;
                packageStatisticModel3.id = aVar.f37696r;
                packageStatisticModel3.downloadRetryTimes = m57779a(aVar.f37683e);
                packageStatisticModel3.downloadUrl = aVar.f37682d;
                packageStatisticModel3.downloadFailRecords = m57795b(aVar.f37683e);
                packageStatisticModel3.downloadDuration = Long.valueOf(aVar.f37685g - aVar.f37684f);
                packageStatisticModel3.totalDuration = m57780a(packageStatisticModel3.downloadDuration, packageStatisticModel3.downloadFailRecords);
                m57791a(aVar, arrayList);
            } else if (aVar.f37689k) {
                StatisticModel.PackageStatisticModel packageStatisticModel4 = new StatisticModel.PackageStatisticModel();
                arrayList.add(packageStatisticModel4);
                packageStatisticModel4.reqType = aVar.f37675G;
                packageStatisticModel4.syncTaskId = aVar.f37676H;
                packageStatisticModel4.apiVersion = aVar.f37677I;
                packageStatisticModel4.updatePriority = aVar.f37678J;
                packageStatisticModel4.accessKey = aVar.f37679a;
                packageStatisticModel4.groupName = aVar.f37680b;
                packageStatisticModel4.statsType = 102;
                packageStatisticModel4.patchId = aVar.f37695q;
                packageStatisticModel4.id = aVar.f37696r;
                packageStatisticModel4.channel = aVar.f37681c;
                packageStatisticModel4.activeCheckDuration = Long.valueOf(aVar.f37692n - aVar.f37685g);
                packageStatisticModel4.applyDuration = Long.valueOf(aVar.f37693o - aVar.f37692n);
            } else {
                StatisticModel.PackageStatisticModel packageStatisticModel5 = new StatisticModel.PackageStatisticModel();
                packageStatisticModel5.reqType = aVar.f37675G;
                packageStatisticModel5.syncTaskId = aVar.f37676H;
                packageStatisticModel5.apiVersion = aVar.f37677I;
                packageStatisticModel5.updatePriority = aVar.f37678J;
                arrayList.add(packageStatisticModel5);
                packageStatisticModel5.accessKey = aVar.f37679a;
                packageStatisticModel5.groupName = aVar.f37680b;
                packageStatisticModel5.statsType = 103;
                packageStatisticModel5.errCode = "501";
                packageStatisticModel5.channel = aVar.f37681c;
                packageStatisticModel5.patchId = aVar.f37695q;
                packageStatisticModel5.id = aVar.f37696r;
                packageStatisticModel5.errMsg = aVar.f37699u;
                m57791a(aVar, arrayList);
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    private static JSONObject m57783a(JSONObject jSONObject) throws JSONException {
        Common a = m57777a(C14264e.m57551a().mo52231f());
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        jSONObject.put("params_for_special", "gecko");
        jSONObject.put("device_id", a.deviceId);
        jSONObject.put("device_model", a.deviceModel);
        jSONObject.put("os", 0);
        jSONObject.put("region", a.region);
        jSONObject.put("app_version", a.appVersion);
        jSONObject.put("sdk_version", "2.4.1");
        jSONObject.put("aid", a.aid);
        return jSONObject;
    }

    /* renamed from: a */
    private static Long m57780a(Long l, List<StatisticModel.PackageStatisticModel.DownloadFailRecords> list) {
        long j;
        if (l != null) {
            j = l.longValue();
        } else {
            j = 0;
        }
        if (list == null) {
            return Long.valueOf(j);
        }
        for (StatisticModel.PackageStatisticModel.DownloadFailRecords downloadFailRecords : list) {
            if (downloadFailRecords.duration != null) {
                j += downloadFailRecords.duration.longValue();
            }
        }
        return Long.valueOf(j);
    }

    /* renamed from: b */
    private static JSONObject m57796b(C14218d dVar, C14349b bVar) throws Exception {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("params_for_special", "gecko");
        jSONObject.put("device_id", dVar.mo52150p());
        jSONObject.put("os", 0);
        jSONObject.put("region", dVar.mo52147m());
        jSONObject.put("app_version", dVar.mo52149o());
        jSONObject.put("sdk_version", "2.4.1");
        jSONObject.put("api_version", bVar.f37716l);
        jSONObject.put("aid", dVar.mo52145k());
        jSONObject.put("x_tt_logid", bVar.f37709e);
        jSONObject.put("http_status", bVar.f37711g);
        jSONObject.put("err_msg", bVar.f37708d);
        if (TextUtils.isEmpty(bVar.f37709e)) {
            jSONObject.put("deployments_info", bVar.f37706b);
            jSONObject.put("local_info", bVar.f37705a);
            jSONObject.put("custom_info", bVar.f37707c);
        } else {
            jSONObject.put("deployments_info", "");
            jSONObject.put("local_info", "");
            jSONObject.put("custom_info", "");
        }
        jSONObject.put("os_version", Build.VERSION.SDK_INT + "");
        jSONObject.put("device_platform", "android");
        jSONObject.put("device_model", Build.MODEL);
        jSONObject.put("ac", bVar.f37710f);
        jSONObject.put("req_type", bVar.f37712h);
        jSONObject.put("is_intercept", bVar.f37713i);
        jSONObject.put("err_code", bVar.f37714j);
        if (bVar.f37715k != 0) {
            jSONObject.put("sync_task_id", bVar.f37715k);
        }
        if (bVar.f37717m != -1) {
            jSONObject.put("delay_from_launch", bVar.f37717m);
        }
        if (bVar.f37718n != -1) {
            jSONObject.put("delay_in_queue", bVar.f37718n);
        }
        if (bVar.f37719o != -1) {
            jSONObject.put("is_merged", bVar.f37719o);
        }
        return jSONObject;
    }

    /* renamed from: a */
    private static JSONObject m57782a(StatisticModel.PackageStatisticModel packageStatisticModel, Common common) throws Exception {
        long j;
        long j2;
        int i;
        String str;
        long j3;
        long j4;
        long j5;
        long j6;
        int i2;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("params_for_special", "gecko");
        jSONObject.put("region", common.region);
        jSONObject.put("aid", common.aid);
        jSONObject.put("err_code", packageStatisticModel.errCode);
        jSONObject.put("err_msg", packageStatisticModel.errMsg);
        jSONObject.put("sdk_version", common.sdkVersion);
        jSONObject.put("access_key", packageStatisticModel.accessKey);
        jSONObject.put("stats_type", packageStatisticModel.statsType);
        jSONObject.put("device_id", common.deviceId);
        long j7 = 0;
        if (packageStatisticModel.patchId == null) {
            j = 0;
        } else {
            j = packageStatisticModel.patchId.longValue();
        }
        jSONObject.put("patch_id", j);
        jSONObject.put("group_name", packageStatisticModel.groupName);
        jSONObject.put("os", common.os);
        jSONObject.put("os_version", common.osVersion);
        jSONObject.put("app_version", common.appVersion);
        jSONObject.put("device_model", common.deviceModel);
        jSONObject.put("channel", packageStatisticModel.channel);
        if (packageStatisticModel.id == null) {
            j2 = 0;
        } else {
            j2 = packageStatisticModel.id.longValue();
        }
        jSONObject.put("id", j2);
        jSONObject.put("ac", common.ac);
        int i3 = 0;
        if (packageStatisticModel.downloadRetryTimes == null) {
            i = 0;
        } else {
            i = packageStatisticModel.downloadRetryTimes.intValue();
        }
        jSONObject.put("download_retry_times", i);
        String str2 = "";
        if (packageStatisticModel.downloadUrl == null) {
            str = str2;
        } else {
            str = packageStatisticModel.downloadUrl;
        }
        jSONObject.put("download_url", str);
        if (packageStatisticModel.downloadDuration == null) {
            j3 = 0;
        } else {
            j3 = packageStatisticModel.downloadDuration.longValue();
        }
        jSONObject.put("download_duration", j3);
        if (packageStatisticModel.downloadFailRecords != null) {
            str2 = C14217b.m57431a().mo52132b().toJson(packageStatisticModel.downloadFailRecords, new TypeToken<List<StatisticModel.PackageStatisticModel.DownloadFailRecords>>() {
                /* class com.bytedance.geckox.statistic.C14343e.C143452 */
            }.getType());
        }
        jSONObject.put("download_fail_records", str2);
        jSONObject.put("log_id", packageStatisticModel.logId);
        if (packageStatisticModel.activeCheckDuration == null) {
            j4 = 0;
        } else {
            j4 = packageStatisticModel.activeCheckDuration.longValue();
        }
        jSONObject.put("active_check_duration", j4);
        if (packageStatisticModel.applyDuration == null) {
            j5 = 0;
        } else {
            j5 = packageStatisticModel.applyDuration.longValue();
        }
        jSONObject.put("apply_duration", j5);
        if (packageStatisticModel.totalDuration == null) {
            j6 = 0;
        } else {
            j6 = packageStatisticModel.totalDuration.longValue();
        }
        jSONObject.put("total_duration", j6);
        jSONObject.put("req_type", packageStatisticModel.reqType);
        if (packageStatisticModel.syncTaskId != 0) {
            jSONObject.put("sync_task_id", packageStatisticModel.syncTaskId);
        }
        jSONObject.put("api_version", packageStatisticModel.apiVersion);
        jSONObject.put("device_platform", "android");
        jSONObject.put("update_priority", packageStatisticModel.updatePriority);
        if (packageStatisticModel.expireAge != null) {
            i3 = packageStatisticModel.expireAge.intValue();
        }
        jSONObject.put("expire_age", i3);
        if (packageStatisticModel.cleanDuration != null) {
            j7 = packageStatisticModel.cleanDuration.longValue();
        }
        jSONObject.put("clean_duration", j7);
        if (packageStatisticModel.cleanStrategy == null) {
            i2 = 1;
        } else {
            i2 = packageStatisticModel.cleanStrategy.intValue();
        }
        jSONObject.put("clean_strategy", i2);
        return jSONObject;
    }

    /* renamed from: a */
    private static StatisticModel m57778a(Context context, Common common, C14331b bVar) {
        ArrayList<StatisticModel.PackageStatisticModel> arrayList = new ArrayList();
        for (C14348a aVar : bVar.mo52460a()) {
            List<StatisticModel.PackageStatisticModel> a = m57781a(aVar);
            if (!a.isEmpty()) {
                arrayList.addAll(a);
            }
        }
        arrayList.addAll(m57794b(context));
        if (arrayList.isEmpty()) {
            return null;
        }
        String b = C14350a.m57809b(context);
        common.ac = C14364j.m57839a(context);
        common.appName = b;
        StatisticModel statisticModel = new StatisticModel();
        statisticModel.common = common;
        statisticModel.packages = arrayList;
        String uuid = UUID.randomUUID().toString();
        for (StatisticModel.PackageStatisticModel packageStatisticModel : arrayList) {
            packageStatisticModel.logId = uuid;
        }
        return statisticModel;
    }
}
