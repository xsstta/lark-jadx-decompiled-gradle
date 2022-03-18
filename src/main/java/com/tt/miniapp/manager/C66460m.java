package com.tt.miniapp.manager;

import android.app.Application;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.bytedance.ee.lark.infra.config.mina.keys.Settings;
import com.bytedance.ee.lark.infra.config.mina.p614a.C12738a;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.lark.infra.foundation.schedulers.Action;
import com.bytedance.ee.lark.infra.foundation.schedulers.Observable;
import com.bytedance.ee.lark.infra.foundation.schedulers.Schedulers;
import com.bytedance.ee.lark.infra.foundation.utils.IOUtils;
import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.bytedance.ee.lark.infra.storage.p640c.C12899a;
import com.tt.miniapp.AppbrandConstant;
import com.tt.miniapp.event.C66036d;
import com.tt.miniapp.p3357x.p3359b.C67411g;
import com.tt.miniapphost.AppbrandContext;
import com.tt.miniapphost.C67467b;
import com.tt.miniapphost.data.ContextSingletonInstance;
import com.tt.miniapphost.host.HostDependManager;
import java.io.File;
import java.io.FilenameFilter;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import org.json.JSONObject;

/* renamed from: com.tt.miniapp.manager.m */
public class C66460m {

    /* renamed from: com.tt.miniapp.manager.m$a */
    public static class C66463a {

        /* renamed from: a */
        public List<String> f167768a;

        /* renamed from: b */
        public volatile int f167769b;
    }

    /* renamed from: a */
    public static String m259777a() {
        return HostDependManager.getInst().getSpPrefixPath() + "mini_app_storage";
    }

    /* renamed from: d */
    private static SharedPreferences m259785d() {
        return C12899a.m53203a(AppbrandContext.getInst().getApplicationContext(), m259777a());
    }

    /* renamed from: b */
    private static int m259783b() {
        if (ContextSingletonInstance.getInstance().storageInstance.f167769b == 0) {
            ContextSingletonInstance.getInstance().storageInstance.f167769b = C12738a.m52722a(AppbrandContext.getInst().getApplicationContext(), 20, Settings.BDP_TTPKG_CONFIG, Settings.BdpTtPkgConfig.NORMAL_LAUNCH_PKG_LIMIT);
        }
        return ContextSingletonInstance.getInstance().storageInstance.f167769b;
    }

    /* renamed from: c */
    private static List<String> m259784c() {
        LinkedList linkedList;
        String string = m259785d().getString("mini_app_storage_info", "");
        if (TextUtils.isEmpty(string)) {
            linkedList = new LinkedList();
        } else {
            linkedList = new LinkedList(Arrays.asList(string.split(" ")));
        }
        int size = linkedList.size();
        int i = 0;
        while (i < size) {
            if (m259782a(C66437h.m259713a(AppbrandContext.getInst().getApplicationContext(), linkedList.get(i)), 0, 3) == null) {
                linkedList.remove(i);
                i--;
                size--;
            }
            i++;
        }
        File downloadDir = AppbrandConstant.getDownloadDir(AppbrandContext.getInst().getApplicationContext());
        if (downloadDir.exists()) {
            String[] list = downloadDir.list();
            for (String str : list) {
                if (m259782a(C66437h.m259713a(AppbrandContext.getInst().getApplicationContext(), str), 0, 3) != null && !linkedList.contains(str)) {
                    linkedList.add(str);
                }
            }
        }
        return linkedList;
    }

    /* renamed from: a */
    public static void m259778a(final IAppContext iAppContext) {
        long j = m259785d().getLong("mini_app_last_report_time", 0);
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis - j > 86400000) {
            m259785d().edit().putLong("mini_app_last_report_time", currentTimeMillis).apply();
            Observable.create(new Action() {
                /* class com.tt.miniapp.manager.C66460m.C664622 */

                @Override // com.bytedance.ee.lark.infra.foundation.schedulers.Action
                public void act() {
                    long currentTimeMillis = System.currentTimeMillis();
                    long a = C67411g.m262284a(iAppContext.getApplicationContext()).mo234087a();
                    long b = C67411g.m262284a(iAppContext.getApplicationContext()).mo234089c().mo234086b();
                    long b2 = C67411g.m262284a(iAppContext.getApplicationContext()).mo234088b().mo234086b();
                    long b3 = C67411g.m262284a(iAppContext.getApplicationContext()).mo234090d().mo234086b();
                    long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
                    JSONObject jSONObject = new JSONObject();
                    try {
                        jSONObject.put("total_size", a);
                        jSONObject.put("pkg_size", b);
                        jSONObject.put("storage_size", b3);
                        jSONObject.put("user_size", b2);
                        jSONObject.put("calculate_time", currentTimeMillis2);
                        jSONObject.put("file_amount", 0);
                        AppBrandLogger.m52828d("StorageManager", jSONObject.toString());
                        C66036d.m258594a(jSONObject, iAppContext);
                    } catch (Exception e) {
                        AppBrandLogger.m52829e("StorageManager", e);
                    }
                }
            }).schudleOn(Schedulers.longIO()).subscribeSimple();
        }
    }

    /* renamed from: a */
    public static synchronized void m259779a(String str) {
        synchronized (C66460m.class) {
            File miniAppRootDir = AppbrandConstant.getMiniAppRootDir(AppbrandContext.getInst().getApplicationContext());
            if (ContextSingletonInstance.getInstance().storageInstance.f167768a == null) {
                ContextSingletonInstance.getInstance().storageInstance.f167768a = m259784c();
            }
            ContextSingletonInstance.getInstance().storageInstance.f167768a.remove(str);
            ContextSingletonInstance.getInstance().storageInstance.f167768a.add(0, str);
            int size = ContextSingletonInstance.getInstance().storageInstance.f167768a.size();
            if (size > m259783b()) {
                for (int i = size - 1; i >= m259783b(); i--) {
                    String str2 = ContextSingletonInstance.getInstance().storageInstance.f167768a.get(i);
                    ContextSingletonInstance.getInstance().storageInstance.f167768a.remove(str2);
                    C67467b.m262424a().mo48646a(AppbrandContext.getInst().getApplicationContext(), str2);
                    IOUtils.delete(AppbrandConstant.getDestAppRunRootDir(miniAppRootDir, str2));
                    m259780a(str2, 0, 3);
                }
            }
            m259781a(ContextSingletonInstance.getInstance().storageInstance.f167768a);
        }
    }

    /* renamed from: a */
    private static void m259781a(List<String> list) {
        int size = list.size();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < size; i++) {
            sb.append(list.get(i));
            if (i != size - 1) {
                sb.append(" ");
            }
        }
        m259785d().edit().putString("mini_app_storage_info", sb.toString()).commit();
    }

    /* renamed from: a */
    public static void m259780a(String str, int... iArr) {
        Application applicationContext = AppbrandContext.getInst().getApplicationContext();
        File a = C66437h.m259713a(applicationContext, str);
        C66440j.m259731a(applicationContext, str);
        File[] a2 = m259782a(a, iArr);
        if (a2 != null) {
            AppBrandLogger.m52830i("StorageManager", "deletePkgWithDownloadType removeAppId:", str, "filesToRemove:", a2);
            for (File file : a2) {
                C66437h.m259718b(file);
            }
        }
        File[] listFiles = a.listFiles();
        if (listFiles == null || listFiles.length == 0) {
            IOUtils.delete(a);
        }
    }

    /* renamed from: a */
    private static File[] m259782a(File file, final int... iArr) {
        File[] fileArr;
        if (iArr != null) {
            fileArr = file.listFiles(new FilenameFilter() {
                /* class com.tt.miniapp.manager.C66460m.C664611 */

                public boolean accept(File file, String str) {
                    int[] iArr = iArr;
                    if (iArr.length <= 0) {
                        return false;
                    }
                    boolean z = false;
                    for (int i : iArr) {
                        z |= C66437h.m259717a(str, i);
                    }
                    return z;
                }
            });
        } else {
            fileArr = null;
        }
        if (fileArr == null || fileArr.length != 0) {
            return fileArr;
        }
        return null;
    }
}
