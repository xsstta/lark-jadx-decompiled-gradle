package com.ss.android.lark.filedetail.impl.open;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.larksuite.component.ui.toast.LKUIToast;
import com.larksuite.framework.thread.CoreThreadPool;
import com.larksuite.framework.utils.C26310o;
import com.larksuite.framework.utils.C26311p;
import com.larksuite.suite.R;
import com.ss.android.lark.diskmanage.cipher.C36808a;
import com.ss.android.lark.diskmanage.cipher.CipherException;
import com.ss.android.lark.diskmanage.cipher.DecryptException;
import com.ss.android.lark.filedetail.FileDetailModule;
import com.ss.android.lark.filedetail.impl.DownloadFileUtils;
import com.ss.android.lark.filedetail.p1885a.AbstractC38197a;
import com.ss.android.lark.log.Log;
import java.io.File;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.ss.android.lark.filedetail.impl.open.c */
public class C38303c {

    /* renamed from: a */
    private static AbstractC38197a.AbstractC38198a f98350a = FileDetailModule.f97880b.mo139564a().getAuditDependency();

    /* renamed from: a */
    public static boolean m150714a() {
        if (C36808a.m145211c() == 1) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.lark.filedetail.impl.open.c$a */
    public static class C38304a {

        /* renamed from: a */
        public static final String[][] f98351a = {new String[]{"application/zip", "application/x-zip-compressed"}};

        /* renamed from: b */
        private static final Map<String, String> f98352b = new HashMap<String, String>() {
            /* class com.ss.android.lark.filedetail.impl.open.C38303c.C38304a.C383051 */

            {
                for (int i = 0; i < C38304a.f98351a.length; i++) {
                    put(C38304a.f98351a[i][0], C38304a.f98351a[i][1]);
                    put(C38304a.f98351a[i][1], C38304a.f98351a[i][0]);
                }
            }
        };

        /* renamed from: a */
        public static String m150717a(String str) {
            return f98352b.get(str);
        }
    }

    /* renamed from: a */
    public static File m150710a(File file) {
        if (file == null) {
            return null;
        }
        String absolutePath = file.getAbsolutePath();
        try {
            String a = C36808a.m145200a(absolutePath);
            if (TextUtils.isEmpty(a) || a.equals(absolutePath)) {
                return null;
            }
            return new File(a);
        } catch (CipherException e) {
            Log.m165383e("FileOpenUtils", "[cipher] getOriginalEncryptedFile failed, filePath: " + absolutePath + ", error: " + e);
            return null;
        }
    }

    /* renamed from: a */
    public static String m150711a(String str) {
        if (DownloadFileUtils.m150311a(str)) {
            Log.m165389i("FileOpenUtils", "[cipher] not cipher file");
            return str;
        }
        if (!TextUtils.isEmpty(str)) {
            File file = null;
            try {
                file = C36808a.m145210b(new File(str));
                Log.m165389i("FileOpenUtils", "[cipher] file decrypt success, original path = " + str + ", new path = " + file.getAbsolutePath());
            } catch (DecryptException e) {
                Log.m165383e("FileOpenUtils", "[cipher] file decrypt failed, original path = " + str + ", code: " + e.getErrorCode());
            }
            if (file != null && file.exists()) {
                return file.getAbsolutePath();
            }
        }
        return "";
    }

    /* renamed from: b */
    private static boolean m150716b(Context context, File file, String str) {
        Log.m165389i("FileOpenUtils", "openFile: " + str);
        if (TextUtils.isEmpty(str)) {
            str = C26311p.m95279b(file);
        }
        Intent intent = new Intent();
        intent.setAction("android.intent.action.VIEW");
        intent.addFlags(268435456);
        C26310o.m95260a(context, intent, str, file, true);
        if (intent.resolveActivity(context.getPackageManager()) == null) {
            Log.m165397w("FileOpenUtils", "no activity can open this file as " + str);
            return false;
        }
        try {
            context.startActivity(intent);
            return true;
        } catch (Exception e) {
            Log.m165397w("FileOpenUtils", "openFile: " + e.getMessage());
            return false;
        }
    }

    /* renamed from: a */
    private static boolean m150715a(Context context, File file, String str) {
        if (!m150716b(context, file, str) && !m150716b(context, file, C38304a.m150717a(str))) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public static void m150712a(Context context, File file, String str, String str2) {
        CoreThreadPool.getDefault().getCachedThreadPool().execute(new Runnable(file, str2, context, str) {
            /* class com.ss.android.lark.filedetail.impl.open.$$Lambda$c$B47_2wySqjrnqu01gcbSSrXezuc */
            public final /* synthetic */ File f$0;
            public final /* synthetic */ String f$1;
            public final /* synthetic */ Context f$2;
            public final /* synthetic */ String f$3;

            {
                this.f$0 = r1;
                this.f$1 = r2;
                this.f$2 = r3;
                this.f$3 = r4;
            }

            public final void run() {
                C38303c.m150713a(this.f$0, this.f$1, this.f$2, this.f$3);
            }
        });
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ void m150713a(File file, String str, Context context, String str2) {
        if (!f98350a.mo139597a(str, true)) {
            f98350a.mo139594a(context, R.string.Lark_Audit_BlockedActionOpenInAnotherApp);
            return;
        }
        f98350a.mo139596a(str);
        if (m150710a(file) != null) {
            Log.m165383e("FileOpenUtils", "[cipher] openFile by third apps, current file is Encrypted!");
            LKUIToast.enableToast();
            LKUIToast.show(context, (int) R.string.Lark_Core_SecuritySettingCannotShare);
        } else if (file == null || !file.exists()) {
            LKUIToast.enableToast();
            LKUIToast.show(context, (int) R.string.Lark_Legacy_FileOpenFail);
        } else {
            String b = C26311p.m95279b(file);
            if (!"*/*".equals(b) && m150715a(context, file, b)) {
                return;
            }
            if ((TextUtils.equals(b, str2) || !m150715a(context, file, str2)) && !m150716b(context, file, "*/*")) {
                LKUIToast.enableToast();
                LKUIToast.show(context, (int) R.string.Lark_Legacy_FileBrowserNotSupport);
            }
        }
    }
}
