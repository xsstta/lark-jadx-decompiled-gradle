package com.bytedance.geckox.p757a;

import android.accounts.NetworkErrorException;
import android.content.Context;
import android.os.SystemClock;
import android.text.TextUtils;
import com.bytedance.geckox.C14218d;
import com.bytedance.geckox.meta.MetaDataManager;
import com.bytedance.geckox.model.C14294a;
import com.bytedance.geckox.model.Common;
import com.bytedance.geckox.p761c.C14217b;
import com.bytedance.geckox.p769e.AbstractC14267a;
import com.bytedance.geckox.p771g.C14276b;
import com.bytedance.geckox.p772h.C14281d;
import com.bytedance.geckox.statistic.C14343e;
import com.bytedance.geckox.statistic.model.StatisticModel;
import com.bytedance.geckox.utils.C14350a;
import com.bytedance.geckox.utils.C14357e;
import com.bytedance.geckox.utils.C14364j;
import com.bytedance.geckox.utils.C14369m;
import com.bytedance.geckox.utils.ExecutorC14360g;
import com.huawei.hms.location.LocationRequest;
import com.huawei.updatesdk.service.otaupdate.UpdateKey;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.bytedance.geckox.a.a */
public class C14190a {
    /* renamed from: a */
    private static void m57313a(C14218d dVar, String str, String str2) throws Exception {
        C14281d a = dVar.mo52143i().mo52248a(str, str2);
        if (a.f37540c != 200) {
            throw new NetworkErrorException("net work get failed, code: " + a.f37540c + ", url:" + str);
        } else if (new JSONObject(a.f37539b).getInt(UpdateKey.STATUS) != 0) {
            throw new RuntimeException("upload failed");
        }
    }

    /* renamed from: a */
    public static List<StatisticModel.PackageStatisticModel> m57306a(Context context) {
        return C14200b.m57324a(context).mo52080a();
    }

    /* renamed from: a */
    public static void m57312a(C14218d dVar) {
        if (dVar.mo52137c()) {
            Common common = new Common(dVar.mo52145k(), dVar.mo52149o(), dVar.mo52150p(), C14350a.m57809b(dVar.mo52133a()), C14364j.m57839a(dVar.mo52133a()), dVar.mo52146l(), dVar.mo52147m());
            StatisticModel statisticModel = new StatisticModel();
            statisticModel.common = common;
            statisticModel.packages.addAll(m57306a(dVar.mo52133a()));
            if (!statisticModel.packages.isEmpty()) {
                String str = "https://" + dVar.mo52144j() + "/gecko/server/packages/stats";
                String json = C14217b.m57431a().mo52132b().toJson(statisticModel);
                for (int i = 0; i < 3; i++) {
                    try {
                        m57313a(dVar, str, json);
                        return;
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
                C14276b.m57604a("clean-channel", "upload failed", json);
            }
        }
    }

    /* renamed from: a */
    private static List<C14193a> m57307a(Map<String, C14294a> map, File file) {
        C14294a value;
        Iterator<Map.Entry<String, C14294a>> it;
        File file2;
        Iterator<C14294a.C14295a> it2;
        List<Long> b;
        Iterator<Long> it3;
        File file3;
        List<Long> b2;
        Iterator<Map.Entry<String, C14294a>> it4;
        File file4;
        Iterator<C14294a.C14295a> it5;
        File file5;
        String str;
        String str2;
        ArrayList arrayList = new ArrayList();
        Iterator<Map.Entry<String, C14294a>> it6 = map.entrySet().iterator();
        while (it6.hasNext()) {
            Map.Entry<String, C14294a> next = it6.next();
            String key = next.getKey();
            File file6 = new File(file, key);
            if (file6.isDirectory() && (value = next.getValue()) != null && value.f37567a != null && !value.f37567a.isEmpty()) {
                Iterator<C14294a.C14295a> it7 = value.f37567a.iterator();
                while (it7.hasNext()) {
                    C14294a.C14295a next2 = it7.next();
                    String str3 = next2.f37568a;
                    int i = next2.f37569b;
                    List<Long> list = next2.f37570c;
                    File file7 = new File(file6, str3);
                    String str4 = "";
                    String str5 = "--pending-delete";
                    if (i != 1) {
                        if (i != 2) {
                            if (i == 3) {
                                File file8 = new File(file6, str3);
                                File file9 = new File(file6, str3 + str5);
                                file8.renameTo(file9);
                                arrayList.add(new C14193a(key, str3, i, 0, file9));
                                MetaDataManager.f37560a.mo52263a(key, str3);
                            }
                        } else if (!(list == null || (b2 = C14369m.m57850b(file7)) == null || b2.isEmpty())) {
                            for (Long l : b2) {
                                if (list.get(0).longValue() > l.longValue()) {
                                    File file10 = new File(file7, l + str5);
                                    new File(file7, l + str4).renameTo(file10);
                                    it4 = it6;
                                    it5 = it7;
                                    str2 = str4;
                                    file4 = file6;
                                    str = str5;
                                    file5 = file7;
                                    arrayList.add(new C14193a(key, str3, i, l.longValue(), file10));
                                } else {
                                    it4 = it6;
                                    it5 = it7;
                                    str2 = str4;
                                    file5 = file7;
                                    file4 = file6;
                                    str = str5;
                                }
                                it6 = it4;
                                str4 = str2;
                                str5 = str;
                                file7 = file5;
                                it7 = it5;
                                file6 = file4;
                            }
                        }
                        it = it6;
                        it2 = it7;
                        file2 = file6;
                    } else {
                        it = it6;
                        it2 = it7;
                        File file11 = file7;
                        file2 = file6;
                        if (!(list == null || (b = C14369m.m57850b(file11)) == null || b.isEmpty())) {
                            Iterator<Long> it8 = b.iterator();
                            while (it8.hasNext()) {
                                Long next3 = it8.next();
                                if (list.contains(next3)) {
                                    File file12 = new File(file11, next3 + str5);
                                    new File(file11, next3 + str4).renameTo(file12);
                                    it3 = it8;
                                    file3 = file11;
                                    arrayList.add(new C14193a(key, str3, i, next3.longValue(), file12));
                                } else {
                                    it3 = it8;
                                    file3 = file11;
                                }
                                file11 = file3;
                                it8 = it3;
                            }
                        }
                    }
                    it6 = it;
                    it7 = it2;
                    file6 = file2;
                }
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    private static List<C14193a> m57308a(Map<String, C14294a> map, Map<String, String> map2) {
        C14294a value;
        Iterator<Map.Entry<String, C14294a>> it;
        Iterator<C14294a.C14295a> it2;
        List<Long> b;
        Iterator<Long> it3;
        File file;
        List<Long> b2;
        Iterator<Map.Entry<String, C14294a>> it4;
        Iterator<C14294a.C14295a> it5;
        File file2;
        String str;
        String str2;
        ArrayList arrayList = new ArrayList();
        Iterator<Map.Entry<String, C14294a>> it6 = map.entrySet().iterator();
        while (it6.hasNext()) {
            Map.Entry<String, C14294a> next = it6.next();
            String key = next.getKey();
            String str3 = map2.get(key);
            if (!TextUtils.isEmpty(str3)) {
                File file3 = new File(str3, key);
                if (file3.isDirectory() && (value = next.getValue()) != null && value.f37567a != null && !value.f37567a.isEmpty()) {
                    Iterator<C14294a.C14295a> it7 = value.f37567a.iterator();
                    while (it7.hasNext()) {
                        C14294a.C14295a next2 = it7.next();
                        String str4 = next2.f37568a;
                        int i = next2.f37569b;
                        List<Long> list = next2.f37570c;
                        File file4 = new File(file3, str4);
                        String str5 = "";
                        String str6 = "--pending-delete";
                        if (i != 1) {
                            if (i != 2) {
                                if (i == 3) {
                                    File file5 = new File(file3, str4);
                                    File file6 = new File(file3, str4 + str6);
                                    file5.renameTo(file6);
                                    arrayList.add(new C14193a(key, str4, i, 0, file6));
                                    MetaDataManager.f37560a.mo52263a(key, str4);
                                }
                            } else if (!(list == null || (b2 = C14369m.m57850b(file4)) == null || b2.isEmpty())) {
                                for (Long l : b2) {
                                    if (list.get(0).longValue() > l.longValue()) {
                                        File file7 = new File(file4, l + str6);
                                        new File(file4, l + str5).renameTo(file7);
                                        it4 = it6;
                                        it5 = it7;
                                        str2 = str5;
                                        str = str6;
                                        file2 = file4;
                                        arrayList.add(new C14193a(key, str4, i, l.longValue(), file7));
                                    } else {
                                        it4 = it6;
                                        it5 = it7;
                                        str2 = str5;
                                        str = str6;
                                        file2 = file4;
                                    }
                                    it6 = it4;
                                    str5 = str2;
                                    str6 = str;
                                    file4 = file2;
                                    it7 = it5;
                                }
                            }
                            it = it6;
                            it2 = it7;
                        } else {
                            it = it6;
                            it2 = it7;
                            File file8 = file4;
                            if (!(list == null || (b = C14369m.m57850b(file8)) == null || b.isEmpty())) {
                                Iterator<Long> it8 = b.iterator();
                                while (it8.hasNext()) {
                                    Long next3 = it8.next();
                                    if (list.contains(next3)) {
                                        File file9 = new File(file8, next3 + str6);
                                        new File(file8, next3 + str5).renameTo(file9);
                                        it3 = it8;
                                        file = file8;
                                        arrayList.add(new C14193a(key, str4, i, next3.longValue(), file9));
                                    } else {
                                        it3 = it8;
                                        file = file8;
                                    }
                                    file8 = file;
                                    it8 = it3;
                                }
                            }
                        }
                        it6 = it;
                        it7 = it2;
                    }
                }
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public static void m57309a(int i, Context context, List<C14193a> list, AbstractC14267a aVar) {
        String str;
        String str2;
        if (!(list == null || list.isEmpty())) {
            for (C14193a aVar2 : list) {
                File file = aVar2.f37340e;
                long uptimeMillis = SystemClock.uptimeMillis();
                boolean a = C14357e.m57823a(file);
                long uptimeMillis2 = SystemClock.uptimeMillis();
                int i2 = LocationRequest.PRIORITY_HD_ACCURACY;
                if (a) {
                    if (aVar != null) {
                        aVar.mo21867b(aVar2.f37337b);
                    }
                    C14200b.m57324a(context).mo52081a(aVar2.f37336a, aVar2.f37337b, aVar2.f37338c, LocationRequest.PRIORITY_HD_ACCURACY, aVar2.f37339d, 0, null, uptimeMillis2 - uptimeMillis, 1);
                    str2 = "0";
                    str = "";
                } else {
                    C14200b.m57324a(context).mo52081a(aVar2.f37336a, aVar2.f37337b, aVar2.f37338c, 201, aVar2.f37339d, 601, "delete failed", uptimeMillis2 - uptimeMillis, 1);
                    i2 = 201;
                    str2 = "601";
                    str = "delete failed";
                }
                C14343e.m57786a(context, new StatisticModel.PackageStatisticModel(aVar2.f37336a, aVar2.f37337b, Integer.valueOf(aVar2.f37338c), Integer.valueOf(i2), Long.valueOf(aVar2.f37339d), str2, str, Long.valueOf(uptimeMillis2 - uptimeMillis), 1, i));
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: com.bytedance.geckox.a.a$a */
    public static class C14193a {

        /* renamed from: a */
        String f37336a;

        /* renamed from: b */
        String f37337b;

        /* renamed from: c */
        int f37338c;

        /* renamed from: d */
        long f37339d;

        /* renamed from: e */
        File f37340e;

        C14193a(String str, String str2, int i, long j, File file) {
            this.f37336a = str;
            this.f37337b = str2;
            this.f37338c = i;
            this.f37339d = j;
            this.f37340e = file;
        }
    }

    /* renamed from: a */
    public static void m57310a(final int i, final Context context, Map<String, C14294a> map, File file, final AbstractC14267a aVar) {
        if (map != null && !map.isEmpty()) {
            final List<C14193a> list = null;
            try {
                list = m57307a(map, file);
            } catch (Exception e) {
                e.printStackTrace();
            }
            if (list != null) {
                ExecutorC14360g.m57832a().execute(new Runnable() {
                    /* class com.bytedance.geckox.p757a.C14190a.RunnableC141911 */

                    public void run() {
                        try {
                            C14190a.m57309a(i, context, list, aVar);
                        } catch (Exception e) {
                            C14276b.m57603a("clean-channel", "", e);
                        } catch (Throwable th) {
                            C14343e.m57784a();
                            throw th;
                        }
                        C14343e.m57784a();
                    }
                });
            }
        }
    }

    /* renamed from: a */
    public static void m57311a(final int i, final Context context, Map<String, C14294a> map, Map<String, String> map2, final AbstractC14267a aVar) {
        if (map != null && !map.isEmpty()) {
            final List<C14193a> list = null;
            try {
                list = m57308a(map, map2);
            } catch (Exception e) {
                e.printStackTrace();
            }
            if (list != null) {
                ExecutorC14360g.m57832a().execute(new Runnable() {
                    /* class com.bytedance.geckox.p757a.C14190a.RunnableC141922 */

                    public void run() {
                        try {
                            C14190a.m57309a(i, context, list, aVar);
                        } catch (Exception e) {
                            C14276b.m57603a("clean-channel", "", e);
                        } catch (Throwable th) {
                            C14343e.m57784a();
                            throw th;
                        }
                        C14343e.m57784a();
                    }
                });
            }
        }
    }
}
