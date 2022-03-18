package com.tt.miniapp.falcon.snapshot;

import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.larksuite.framework.utils.C26278h;
import com.tt.miniapp.manager.p3302a.C66399c;
import com.tt.miniapphost.util.C67586c;
import java.io.File;
import java.io.FilenameFilter;

/* renamed from: com.tt.miniapp.falcon.snapshot.h */
public class C66082h {

    /* renamed from: a */
    private final IAppContext f166797a;

    /* renamed from: b */
    private final String f166798b;

    /* renamed from: c */
    private final String f166799c;

    /* renamed from: d */
    private final File f166800d;

    /* renamed from: e */
    private final SnapshotType f166801e;

    /* renamed from: a */
    public String mo231234a() {
        return this.f166799c;
    }

    /* renamed from: b */
    public String mo231235b() {
        return this.f166800d.getAbsolutePath();
    }

    /* renamed from: d */
    public boolean mo231237d() {
        return this.f166800d.exists();
    }

    /* renamed from: e */
    public void mo231238e() {
        if (this.f166800d.exists()) {
            C67586c.m263051b(this.f166800d);
        }
    }

    /* renamed from: c */
    public void mo231236c() {
        if (this.f166800d.exists()) {
            this.f166800d.getParentFile().listFiles(new FilenameFilter() {
                /* class com.tt.miniapp.falcon.snapshot.$$Lambda$h$JYo_hSFLPBlJlN8UwqZVe8hbWrA */

                public final boolean accept(File file, String str) {
                    return C66082h.this.m258785a(file, str);
                }
            });
        }
    }

    /* renamed from: f */
    private String m258786f() {
        String b = C66399c.m259608a().mo231922b(this.f166797a.getApplicationContext(), this.f166797a);
        StringBuilder sb = new StringBuilder();
        sb.append("Blob_");
        sb.append(this.f166797a.getAppId());
        if (!C26278h.m95144a() || !C26278h.m95145a(this.f166797a.getApplicationContext())) {
            sb.append("_");
            sb.append("bit32");
        } else {
            sb.append("_");
            sb.append("bit64");
        }
        sb.append("_");
        sb.append(b);
        sb.append("_");
        sb.append(this.f166798b);
        sb.append(new C66085k().toString());
        return sb.toString();
    }

    /* renamed from: g */
    private String m258787g() {
        String str;
        File externalFilesDir = this.f166797a.getApplicationContext().getExternalFilesDir(null);
        if (externalFilesDir == null) {
            externalFilesDir = this.f166797a.getApplicationContext().getFilesDir();
        }
        if (externalFilesDir != null) {
            str = externalFilesDir.getPath();
        } else {
            str = "";
        }
        String str2 = str + "/jsi_snapshot/" + this.f166801e + "/";
        File file = new File(str2);
        if (!file.exists()) {
            file.mkdirs();
        }
        String str3 = str2 + this.f166797a.getAppId() + "/";
        File file2 = new File(str3);
        if (!file2.exists()) {
            file2.mkdirs();
        }
        return str3;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ boolean m258785a(File file, String str) {
        if (!str.equals(this.f166799c)) {
            AppBrandLogger.m52830i("SnapshotFile", "deleteOtherVersionSnapshot");
            C67586c.m263051b(new File(file + "/" + str));
        }
        return true;
    }

    public C66082h(IAppContext iAppContext, String str, SnapshotType snapshotType) {
        this.f166797a = iAppContext;
        this.f166798b = str;
        this.f166801e = snapshotType;
        String f = m258786f();
        this.f166799c = f;
        this.f166800d = new File(m258787g() + f);
    }
}
