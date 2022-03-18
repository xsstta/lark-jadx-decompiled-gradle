package com.bytedance.ee.bear.basesdk;

import android.content.Context;
import com.bytedance.ee.bear.drive.services.AbstractC7181i;
import com.bytedance.ee.bear.persistence.PersistenceSharedPreference;
import com.bytedance.ee.bear.service.C10929e;
import com.bytedance.ee.bear.thread.BearExecutors;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.db.DBController;
import com.bytedance.ee.util.io.C13675f;
import com.bytedance.ee.util.p701d.C13629i;
import com.ss.android.lark.diskmanage.storage.StoragePathUtils;
import io.reactivex.AbstractC68307f;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import java.io.File;
import java.io.IOException;
import java.util.regex.Pattern;

/* renamed from: com.bytedance.ee.bear.basesdk.b */
public final class C4442b {
    /* renamed from: a */
    public static void m18367a(Context context) {
        if (C13629i.m55308c()) {
            BearExecutors.m48469d().execute(new Runnable(context) {
                /* class com.bytedance.ee.bear.basesdk.$$Lambda$b$VWKF0kwETjhU0gmRHxGUGPBItbA */
                public final /* synthetic */ Context f$0;

                {
                    this.f$0 = r1;
                }

                public final void run() {
                    C4442b.m18371e(this.f$0);
                }
            });
        }
    }

    /* renamed from: b */
    public static AbstractC68307f<Boolean> m18368b(Context context) {
        C13479a.m54764b("DiskCleaner", "forceClean start");
        return AbstractC68307f.m265083a((Object) true).mo238020d(new Function(context) {
            /* class com.bytedance.ee.bear.basesdk.$$Lambda$b$xAwD2GxHwGVjowvpzJZPo5qAxeE */
            public final /* synthetic */ Context f$0;

            {
                this.f$0 = r1;
            }

            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return C4442b.m18366a(this.f$0, (Boolean) obj);
            }
        });
    }

    /* renamed from: d */
    private static void m18370d(Context context) throws IOException {
        File file = new File(StoragePathUtils.f94669a.mo135751q(context));
        if (file.exists() && DBController.m55316d()) {
            Pattern compile = Pattern.compile("^\\d+(_|_encrypt_)(offlineData|bear|drive|docs_keyvaule|notification|docs_user|todo)\\.(db|db-shm|db-wal|db_p0|db_p0-shm|db_p0-wal)");
            File[] listFiles = file.listFiles();
            if (listFiles != null) {
                for (File file2 : listFiles) {
                    if (file2.isFile() && compile.matcher(file2.getName()).matches()) {
                        C13675f.m55543l(file2);
                    }
                }
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public static /* synthetic */ void m18371e(Context context) {
        synchronized (C4442b.class) {
            try {
                PersistenceSharedPreference aVar = new PersistenceSharedPreference("ccm_diskclean_config_v2");
                if (!((Boolean) aVar.mo34038b("has_clean", Boolean.FALSE)).booleanValue()) {
                    C13479a.m54764b("DiskCleaner", "check that disk needs to be cleaned, perform delete. ");
                    m18369c(context);
                    aVar.mo34037a("has_clean", Boolean.TRUE);
                } else {
                    C13479a.m54764b("DiskCleaner", "check that disk has been cleaned. ");
                }
            } catch (Exception e) {
                C13479a.m54759a("DiskCleaner", "DiskCleaner.clean fail. ", e);
            }
        }
    }

    /* renamed from: c */
    private static synchronized void m18369c(Context context) throws Exception {
        File[] listFiles;
        synchronized (C4442b.class) {
            File filesDir = context.getFilesDir();
            File externalFilesDir = context.getExternalFilesDir(null);
            File parentFile = filesDir.getParentFile();
            File[] fileArr = {new File(filesDir, "drivemain"), new File(externalFilesDir, "drive"), new File(filesDir, "main"), new File(filesDir, "space/sdk_storage"), new File(filesDir, "font"), new File(filesDir, "log"), new File(filesDir, "space_res"), new File(filesDir, "space_downloadX"), new File(filesDir, "ccm/drive/docsimage"), new File(filesDir, "ccm/drive/rustsdk"), new File(externalFilesDir, "FileReader"), new File(filesDir, "space"), new File(filesDir, "bitable"), new File(filesDir, "eesz"), new File(parentFile, "app_p_n"), new File(parentFile, "app_p_a"), new File(parentFile, "app_plugins_v3"), new File(parentFile, "app_plugins_v3_libs")};
            File file = new File(filesDir, "drive");
            if (filesDir.exists() && (listFiles = filesDir.listFiles()) != null) {
                for (File file2 : listFiles) {
                    if (file2.getName().startsWith("space_res")) {
                        C13675f.m55543l(file2);
                    }
                }
            }
            for (int i = 0; i < 18; i++) {
                C13675f.m55543l(fileArr[i]);
            }
            if (file.exists()) {
                new C10929e().mo41523b(AbstractC7181i.class).mo238005b((Consumer) $$Lambda$rx3U07s_7AtT0KlgGE6X7pNQg.INSTANCE).mo238023d();
                C13675f.m55543l(file);
            }
            m18370d(context);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ Boolean m18366a(Context context, Boolean bool) throws Exception {
        m18369c(context);
        return true;
    }
}
