package com.ss.android.lark.gecko;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import android.util.Pair;
import com.bytedance.geckox.C14205b;
import com.bytedance.geckox.C14218d;
import com.bytedance.geckox.model.CheckRequestBodyModel;
import com.bytedance.geckox.model.UpdatePackage;
import com.bytedance.geckox.p769e.AbstractC14267a;
import com.bytedance.geckox.utils.C14357e;
import com.bytedance.geckox.utils.C14367l;
import com.bytedance.geckox.utils.C14369m;
import com.ss.android.lark.appsetting.api.SettingManager;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.ss.android.lark.gecko.a */
public final class C38544a {

    /* renamed from: a */
    public C14218d f99063a;

    /* renamed from: b */
    private volatile boolean f99064b;

    /* renamed from: c */
    private C14205b f99065c;

    /* renamed from: d */
    private Map<String, String> f99066d;

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.lark.gecko.a$a */
    public static final class C38546a {

        /* renamed from: a */
        public static final C38544a f99068a = new C38544a();
    }

    /* renamed from: a */
    public static C38544a m151996a() {
        return C38546a.f99068a;
    }

    /* renamed from: b */
    public boolean mo141235b() {
        return this.f99064b;
    }

    private C38544a() {
        this.f99066d = new HashMap();
    }

    /* access modifiers changed from: private */
    /* renamed from: f */
    public /* synthetic */ void m152004f(String str) {
        m152002d(str);
        mo141234b(str);
    }

    /* renamed from: e */
    private String m152003e(String str) {
        return "ka_" + str;
    }

    /* renamed from: c */
    public boolean mo141236c(String str) {
        if (TextUtils.isEmpty(str) || m151998a(new File(str))) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    private boolean m151998a(File file) {
        if (file == null || !file.exists() || !file.isDirectory() || file.listFiles().length != 1 || !TextUtils.isDigitsOnly(file.getParentFile().getName())) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public void mo141234b(String str) {
        Log.i("GeckoResManager", "syncServerRes mClientCreated:" + this.f99064b + ", tid:" + str);
        if (this.f99064b && !TextUtils.isEmpty(str)) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(new CheckRequestBodyModel.TargetChannel(m152003e(str)));
            HashMap hashMap = new HashMap();
            hashMap.put(this.f99063a.mo52140f(), arrayList);
            this.f99065c.mo52091a(hashMap, new AbstractC14267a() {
                /* class com.ss.android.lark.gecko.C38544a.C385451 */

                @Override // com.bytedance.geckox.p769e.AbstractC14267a
                /* renamed from: a */
                public void mo21857a() {
                    Log.i("GeckoResManager", "onUpdateFinish");
                }

                @Override // com.bytedance.geckox.p769e.AbstractC14267a
                /* renamed from: a */
                public void mo21858a(UpdatePackage updatePackage) {
                    Log.i("GeckoResManager", "onUpdateStart " + updatePackage);
                }

                @Override // com.bytedance.geckox.p769e.AbstractC14267a
                /* renamed from: b */
                public void mo21865b(UpdatePackage updatePackage) {
                    Log.i("GeckoResManager", "onActivateSuccess " + updatePackage);
                }

                @Override // com.bytedance.geckox.p769e.AbstractC14267a
                /* renamed from: c */
                public void mo21868c(UpdatePackage updatePackage) {
                    Log.i("GeckoResManager", "onDownloadSuccess:" + updatePackage);
                }

                @Override // com.bytedance.geckox.p769e.AbstractC14267a
                /* renamed from: a */
                public void mo21860a(String str) {
                    Log.i("GeckoResManager", "onUpdating channel:" + str);
                }

                @Override // com.bytedance.geckox.p769e.AbstractC14267a
                /* renamed from: b */
                public void mo21867b(String str) {
                    Log.i("GeckoResManager", "onClean channel:" + str);
                }

                @Override // com.bytedance.geckox.p769e.AbstractC14267a
                /* renamed from: a */
                public void mo21859a(UpdatePackage updatePackage, Throwable th) {
                    Log.e("GeckoResManager", "onActivateFail " + updatePackage, th);
                }

                @Override // com.bytedance.geckox.p769e.AbstractC14267a
                /* renamed from: b */
                public void mo21866b(UpdatePackage updatePackage, Throwable th) {
                    Log.e("GeckoResManager", "onDownloadFail " + updatePackage, th);
                }

                @Override // com.bytedance.geckox.p769e.AbstractC14267a
                /* renamed from: a */
                public void mo21861a(String str, long j) {
                    Log.i("GeckoResManager", "onUpdateSuccess channel:" + str + ", version:" + j);
                    String a = C14367l.m57842a(C38544a.this.f99063a.mo52148n(), C38544a.this.f99063a.mo52140f(), str, j);
                    StringBuilder sb = new StringBuilder();
                    sb.append("onUpdateSuccess srcResPath:");
                    sb.append(a);
                    Log.i("GeckoResManager", sb.toString());
                    if (!C38544a.this.mo141236c(a)) {
                        C38544a aVar = C38544a.this;
                        C14357e.m57822a(a, aVar.mo141231a(aVar.f99063a.mo52133a(), str, j));
                    }
                }

                @Override // com.bytedance.geckox.p769e.AbstractC14267a
                /* renamed from: a */
                public void mo21862a(String str, Throwable th) {
                    Log.e("GeckoResManager", "onUpdateFailed channel:" + str, th);
                }

                @Override // com.bytedance.geckox.p769e.AbstractC14267a
                /* renamed from: a */
                public void mo21863a(Map<String, List<Pair<String, Long>>> map, Throwable th) {
                    Log.e("GeckoResManager", "onCheckServerVersionFail requestMap:" + map, th);
                }

                @Override // com.bytedance.geckox.p769e.AbstractC14267a
                /* renamed from: a */
                public void mo21864a(Map<String, List<Pair<String, Long>>> map, Map<String, List<UpdatePackage>> map2) {
                    Log.i("GeckoResManager", "onCheckServerVersionSuccess requestMap:" + map + ", responseMap:" + map2);
                }
            });
        }
    }

    /* renamed from: d */
    private void m152002d(String str) {
        String e = m152003e(str);
        String b = C14367l.m57846b(this.f99063a.mo52148n(), this.f99063a.mo52140f(), e);
        if (mo141236c(b)) {
            m152001c(this.f99063a.mo52133a(), e);
            return;
        }
        File file = new File(b);
        Long valueOf = Long.valueOf(file.getParentFile().getName());
        String b2 = m151999b(this.f99063a.mo52133a(), e);
        List<Long> b3 = C14369m.m57850b(new File(b2));
        if (b3 == null || b3.isEmpty()) {
            m152001c(this.f99063a.mo52133a(), e);
            C14357e.m57822a(b, m152000b(b2, valueOf.longValue()));
            return;
        }
        b3.remove(valueOf);
        for (Long l : b3) {
            C14357e.m57825c(new File(m151997a(b2, l.longValue())));
        }
        String b4 = m152000b(b2, valueOf.longValue());
        File file2 = new File(b4);
        if (m151998a(file2) || file2.length() != file.length()) {
            C14357e.m57825c(file2);
            C14357e.m57822a(b, b4);
        }
    }

    /* renamed from: a */
    public void mo141232a(C14218d dVar) {
        if (dVar != null && dVar.mo52148n().getName().endsWith("gecko_offline_res_x") && !this.f99064b) {
            this.f99063a = dVar;
            this.f99065c = C14205b.m57334a(dVar);
            this.f99064b = true;
        }
    }

    /* renamed from: a */
    public void mo141233a(String str) {
        Log.i("GeckoResManager", "updateKaRes mClientCreated:" + this.f99064b + ", tid:" + str);
        if (this.f99064b && !TextUtils.isEmpty(str)) {
            this.f99063a.mo52141g().execute(new Runnable(str) {
                /* class com.ss.android.lark.gecko.$$Lambda$a$_GtSFxPWPH4CFOeo5TLAozF78c */
                public final /* synthetic */ String f$1;

                {
                    this.f$1 = r2;
                }

                public final void run() {
                    C38544a.this.m152004f(this.f$1);
                }
            });
        }
    }

    /* renamed from: c */
    private void m152001c(Context context, String str) {
        C14357e.m57825c(new File(m151999b(context, str)));
    }

    /* renamed from: a */
    private String m151997a(String str, long j) {
        return str + File.separator + j;
    }

    /* renamed from: b */
    private String m152000b(String str, long j) {
        return str + File.separator + j + File.separator + "res";
    }

    /* renamed from: b */
    private String m151999b(Context context, String str) {
        return context.getFilesDir().getAbsolutePath() + File.separator + "gecko_ka_res" + File.separator + str;
    }

    /* renamed from: a */
    public String mo141230a(Context context, String str) {
        List<Long> b;
        Log.i("GeckoResManager", "getKaRes context:" + context + ", tid:" + str);
        if (context != null && !TextUtils.isEmpty(str)) {
            String e = m152003e(str);
            if (this.f99066d.containsKey(e)) {
                return this.f99066d.get(e);
            }
            GeckoSettingConfig geckoSettingConfig = (GeckoSettingConfig) SettingManager.getInstance().get(GeckoSettingConfig.class);
            if (geckoSettingConfig == null) {
                return null;
            }
            String b2 = C14367l.m57846b(new File(context.getFilesDir(), "gecko_offline_res_x"), geckoSettingConfig.f99062a, e);
            if (mo141236c(b2)) {
                return null;
            }
            File file = new File(b2);
            Long valueOf = Long.valueOf(file.getParentFile().getName());
            String b3 = m151999b(context, e);
            File file2 = new File(b3);
            if (file2.exists() && (b = C14369m.m57850b(file2)) != null && !b.isEmpty() && b.contains(valueOf)) {
                File file3 = new File(m152000b(b3, valueOf.longValue()));
                if (!m151998a(file3) && file.length() == file3.length()) {
                    String absolutePath = file3.listFiles()[0].getAbsolutePath();
                    this.f99066d.put(e, absolutePath);
                    return absolutePath;
                }
            }
        }
        return null;
    }

    /* renamed from: a */
    public String mo141231a(Context context, String str, long j) {
        return context.getFilesDir().getAbsolutePath() + File.separator + "gecko_ka_res" + File.separator + str + File.separator + j + File.separator + "res";
    }
}
