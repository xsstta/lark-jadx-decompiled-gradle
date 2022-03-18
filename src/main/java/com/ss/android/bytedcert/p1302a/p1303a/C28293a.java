package com.ss.android.bytedcert.p1302a.p1303a;

import android.content.Context;
import android.text.TextUtils;
import android.util.Pair;
import com.bytedance.geckox.C14205b;
import com.bytedance.geckox.C14218d;
import com.bytedance.geckox.model.CheckRequestBodyModel;
import com.bytedance.geckox.model.UpdatePackage;
import com.bytedance.geckox.p769e.AbstractC14267a;
import com.bytedance.geckox.utils.C14367l;
import com.ss.android.bytedcert.config.AbstractC28344d;
import com.ss.android.bytedcert.manager.BytedCertManager;
import com.ss.android.bytedcert.utils.C28433c;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/* renamed from: com.ss.android.bytedcert.a.a.a */
public class C28293a implements AbstractC28344d {

    /* renamed from: a */
    public String f71048a = "byted_cert";

    /* renamed from: b */
    C14205b f71049b;

    /* renamed from: c */
    private final String f71050c = "5c7ee26b59edea148ed605d013fd23bb";

    /* renamed from: d */
    private final String f71051d = "gecko.snssdk.com";

    /* renamed from: e */
    private final String f71052e = "default";

    /* renamed from: f */
    private String f71053f = "0";

    /* renamed from: g */
    private long f71054g;

    /* renamed from: h */
    private String f71055h;

    /* renamed from: i */
    private String f71056i;

    /* renamed from: j */
    private HashMap<String, List<AbstractC28344d.AbstractC28345a>> f71057j = new HashMap<>();

    @Override // com.ss.android.bytedcert.config.AbstractC28344d
    /* renamed from: a */
    public String mo100821a() {
        return C14367l.m57846b(new File(this.f71056i), "5c7ee26b59edea148ed605d013fd23bb", this.f71048a);
    }

    @Override // com.ss.android.bytedcert.config.AbstractC28344d
    /* renamed from: b */
    public void mo100827b() {
        C28433c.m104220c(new File(this.f71056i));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo100824a(String str, AbstractC28344d.AbstractC28345a aVar) {
        List<AbstractC28344d.AbstractC28345a> list = this.f71057j.get(str);
        if (list == null) {
            list = new LinkedList<>();
            this.f71057j.put(str, list);
        }
        list.add(aVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo100825a(String str, boolean z) {
        if (this.f71057j.get(str) != null) {
            ArrayList<AbstractC28344d.AbstractC28345a> arrayList = new ArrayList();
            arrayList.addAll(this.f71057j.get(str));
            for (AbstractC28344d.AbstractC28345a aVar : arrayList) {
                aVar.mo100951a(z);
            }
        }
    }

    @Override // com.ss.android.bytedcert.config.AbstractC28344d
    /* renamed from: a */
    public void mo100822a(Context context, AbstractC28344d.AbstractC28345a aVar) {
        if (this.f71049b == null) {
            this.f71049b = C14205b.m57334a(new C14218d.C14220a(context).mo52165b("5c7ee26b59edea148ed605d013fd23bb").mo52154a(this.f71054g).mo52163b(this.f71053f).mo52166c("gecko.snssdk.com").mo52158a(this.f71055h).mo52157a(new File(this.f71056i)).mo52161a("5c7ee26b59edea148ed605d013fd23bb").mo52162a());
        }
        HashMap hashMap = new HashMap();
        hashMap.put("5c7ee26b59edea148ed605d013fd23bb", Arrays.asList(new CheckRequestBodyModel.TargetChannel(this.f71048a)));
        HashMap hashMap2 = new HashMap();
        HashMap hashMap3 = new HashMap();
        hashMap3.put("business_version", BytedCertManager.getInstance().getVersionCode());
        hashMap2.put("5c7ee26b59edea148ed605d013fd23bb", hashMap3);
        mo100824a(this.f71048a, aVar);
        List<AbstractC28344d.AbstractC28345a> list = this.f71057j.get(this.f71048a);
        if (list == null || list.size() <= 1) {
            this.f71049b.mo52089a("default", hashMap2, hashMap, new AbstractC14267a() {
                /* class com.ss.android.bytedcert.p1302a.p1303a.C28293a.C282941 */

                /* renamed from: a */
                String f71058a;

                /* renamed from: b */
                Boolean f71059b;

                @Override // com.bytedance.geckox.p769e.AbstractC14267a
                /* renamed from: a */
                public void mo21857a() {
                    super.mo21857a();
                    if (this.f71059b == null) {
                        this.f71059b = false;
                        C28293a.this.mo100826a(this.f71058a, false, null);
                    }
                }

                {
                    this.f71058a = C28293a.this.f71048a;
                }

                @Override // com.bytedance.geckox.p769e.AbstractC14267a
                /* renamed from: a */
                public void mo21862a(String str, Throwable th) {
                    super.mo21862a(str, th);
                    this.f71059b = false;
                    C28293a.this.mo100826a(str, false, th);
                }

                @Override // com.bytedance.geckox.p769e.AbstractC14267a
                /* renamed from: a */
                public void mo21861a(String str, long j) {
                    super.mo21861a(str, j);
                    this.f71059b = true;
                    C28293a.this.mo100826a(str, true, null);
                }

                @Override // com.bytedance.geckox.p769e.AbstractC14267a
                /* renamed from: a */
                public void mo21864a(Map<String, List<Pair<String, Long>>> map, Map<String, List<UpdatePackage>> map2) {
                    super.mo21864a(map, map2);
                    List<UpdatePackage> list = map2.get("5c7ee26b59edea148ed605d013fd23bb");
                    if (list == null) {
                        C28293a.this.mo100825a(this.f71058a, false);
                        return;
                    }
                    for (UpdatePackage updatePackage : list) {
                        if (updatePackage.getChannel().equals(this.f71058a)) {
                            C28293a.this.mo100825a(this.f71058a, true);
                            return;
                        }
                    }
                    C28293a.this.mo100825a(this.f71058a, false);
                }
            });
        }
    }

    @Override // com.ss.android.bytedcert.config.AbstractC28344d
    /* renamed from: a */
    public void mo100823a(Context context, HashMap<String, String> hashMap) {
        String str = hashMap.get("cacheRootDir");
        this.f71054g = Long.parseLong(hashMap.get("appId"));
        this.f71055h = hashMap.get("appVersion");
        if (!TextUtils.isEmpty(str)) {
            this.f71056i = str;
        } else {
            this.f71056i = context.getFilesDir().getPath() + "/byted_cert/";
        }
        String str2 = hashMap.get("appName");
        str2.hashCode();
        if (str2.equals("offline")) {
            this.f71048a = "offline";
        }
        String str3 = hashMap.get("deviceId");
        this.f71053f = str3;
        if (TextUtils.isEmpty(str3) && BytedCertManager.getInstance().getCertMonitorConfig() != null) {
            this.f71053f = BytedCertManager.getInstance().getCertMonitorConfig().mo100950b();
        }
        if (TextUtils.isEmpty(this.f71053f)) {
            this.f71053f = "0";
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo100826a(String str, boolean z, Throwable th) {
        if (this.f71057j.get(str) != null) {
            ArrayList<AbstractC28344d.AbstractC28345a> arrayList = new ArrayList();
            arrayList.addAll(this.f71057j.get(str));
            for (AbstractC28344d.AbstractC28345a aVar : arrayList) {
                if (aVar != null) {
                    aVar.mo100952a(z, th);
                }
            }
            this.f71057j.get(str).clear();
        }
    }
}
