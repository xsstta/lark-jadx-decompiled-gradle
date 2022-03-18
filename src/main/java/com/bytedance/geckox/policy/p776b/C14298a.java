package com.bytedance.geckox.policy.p776b;

import android.text.TextUtils;
import android.util.Pair;
import com.bytedance.geckox.C14218d;
import com.bytedance.geckox.C14264e;
import com.bytedance.geckox.OptionCheckUpdateParams;
import com.bytedance.geckox.model.CheckRequestBodyModel;
import com.bytedance.geckox.model.UpdatePackage;
import com.bytedance.geckox.p761c.C14217b;
import com.bytedance.geckox.p769e.AbstractC14267a;
import com.bytedance.geckox.p771g.C14276b;
import com.bytedance.geckox.p773i.C14282a;
import com.bytedance.geckox.settings.model.GlobalConfigSettings;
import com.bytedance.geckox.utils.C14367l;
import com.bytedance.pipeline.AbstractC20233b;
import com.google.gson.reflect.TypeToken;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.bytedance.geckox.policy.b.a */
public class C14298a {

    /* renamed from: a */
    public static Map<String, UpdatePackage> f37573a;

    /* renamed from: b */
    public static Map<String, UpdatePackage> f37574b;

    /* renamed from: c */
    public C14218d f37575c;

    /* renamed from: a */
    public static Map<String, UpdatePackage> m57673a() {
        return f37573a;
    }

    /* renamed from: a */
    public void mo52343a(C14218d dVar) {
        this.f37575c = dVar;
    }

    /* renamed from: a */
    public static void m57674a(String str, UpdatePackage updatePackage) {
        if (f37573a == null) {
            f37573a = new ConcurrentHashMap();
        }
        f37573a.put(str, updatePackage);
    }

    /* renamed from: b */
    public static void m57675b(String str, UpdatePackage updatePackage) {
        if (f37574b == null) {
            f37574b = new ConcurrentHashMap();
        }
        f37574b.put(str, updatePackage);
    }

    /* renamed from: a */
    public void mo52344a(final String str, final Map<String, List<CheckRequestBodyModel.TargetChannel>> map, final OptionCheckUpdateParams optionCheckUpdateParams) {
        GlobalConfigSettings i = C14264e.m57551a().mo52234i();
        if (i != null && i.getReqMeta() != null && i.getReqMeta().getLazy() != null) {
            this.f37575c.mo52142h().execute(new Runnable() {
                /* class com.bytedance.geckox.policy.p776b.C14298a.RunnableC142991 */

                public void run() {
                    String str;
                    ArrayList arrayList = new ArrayList();
                    ArrayList arrayList2 = new ArrayList();
                    ArrayList arrayList3 = new ArrayList();
                    AbstractC14267a listener = optionCheckUpdateParams.getListener();
                    Map map = map;
                    if (map != null) {
                        str = null;
                        for (Map.Entry entry : map.entrySet()) {
                            String str2 = (String) entry.getKey();
                            for (CheckRequestBodyModel.TargetChannel targetChannel : (List) entry.getValue()) {
                                String str3 = str2 + "-" + targetChannel.channelName;
                                long j = 0;
                                if (C14298a.f37573a == null || !C14298a.f37573a.containsKey(str3)) {
                                    Long c = C14367l.m57848c(C14298a.this.f37575c.mo52148n(), str2, targetChannel.channelName);
                                    if (c != null) {
                                        j = c.longValue();
                                    }
                                    UpdatePackage updatePackage = new UpdatePackage();
                                    updatePackage.setAccessKey(str2);
                                    updatePackage.setChannel(targetChannel.channelName);
                                    updatePackage.setLocalVersion(j);
                                    updatePackage.setVersion(j);
                                    if (c == null) {
                                        arrayList3.add(updatePackage.getChannel());
                                    } else {
                                        arrayList2.add(updatePackage);
                                    }
                                } else {
                                    Long c2 = C14367l.m57848c(C14298a.this.f37575c.mo52148n(), str2, targetChannel.channelName);
                                    if (c2 != null) {
                                        j = c2.longValue();
                                    }
                                    UpdatePackage updatePackage2 = C14298a.f37573a.get(str3);
                                    if (updatePackage2 == null || j != updatePackage2.getVersion()) {
                                        arrayList.add(C14298a.f37573a.get(str3));
                                    } else {
                                        arrayList2.add(updatePackage2);
                                    }
                                }
                            }
                            str = str2;
                        }
                    } else if (TextUtils.isEmpty(str)) {
                        str = null;
                    } else if (C14298a.f37574b != null) {
                        str = null;
                        for (Map.Entry<String, UpdatePackage> entry2 : C14298a.f37574b.entrySet()) {
                            String f = C14298a.this.f37575c.mo52140f();
                            if ((f + "-" + str).equals(entry2.getKey())) {
                                arrayList.add(entry2.getValue());
                            }
                            str = f;
                        }
                    } else {
                        return;
                    }
                    if (listener != null) {
                        if (!arrayList.isEmpty()) {
                            listener.mo21864a((Map<String, List<Pair<String, Long>>>) null, new HashMap<String, List<UpdatePackage>>(str, arrayList) {
                                /* class com.bytedance.geckox.policy.p776b.C14298a.RunnableC142991.C143001 */
                                final /* synthetic */ String val$accessKey;
                                final /* synthetic */ List val$downloadUpdatePackages;

                                {
                                    this.val$accessKey = r2;
                                    this.val$downloadUpdatePackages = r3;
                                    put(r2, r3);
                                }
                            });
                        } else if (!arrayList2.isEmpty()) {
                            listener.mo21864a((Map<String, List<Pair<String, Long>>>) null, (Map<String, List<UpdatePackage>>) null);
                        }
                    }
                    if (!arrayList3.isEmpty() && listener != null) {
                        listener.mo21863a((Map<String, List<Pair<String, Long>>>) null, new Exception("request channels" + C14217b.m57431a().mo52132b().toJson(arrayList3, new TypeToken<List<String>>() {
                            /* class com.bytedance.geckox.policy.p776b.C14298a.RunnableC142991.C143012 */
                        }.getType()) + "is not lazy update"));
                    }
                    if (!arrayList.isEmpty()) {
                        C14276b.m57604a("gecko-debug-tag", "lazy update start...");
                        try {
                            AbstractC20233b<List<UpdatePackage>> a = C14282a.m57618a(C14298a.this.f37575c, C14298a.this.f37575c.mo52148n(), listener, optionCheckUpdateParams);
                            a.setPipelineData("req_type", 5);
                            a.proceed(arrayList);
                            if (listener != null) {
                                listener.mo21857a();
                            }
                            C14276b.m57604a("gecko-debug-tag", "lazy update finished");
                        } catch (Exception e) {
                            C14276b.m57603a("gecko-debug-tag", "lazy update failed:", e);
                            if (listener != null) {
                                listener.mo21857a();
                            }
                            C14276b.m57604a("gecko-debug-tag", "lazy update finished");
                        } catch (Throwable th) {
                            if (listener != null) {
                                listener.mo21857a();
                            }
                            C14276b.m57604a("gecko-debug-tag", "lazy update finished");
                            throw th;
                        }
                    }
                }
            });
        }
    }
}
