package com.ss.android.lark.mail.impl.p2168g;

import android.app.Activity;
import android.content.Context;
import com.larksuite.framework.utils.file.direct.DirectFileAccess;
import com.ss.android.lark.mail.impl.C41816b;
import com.ss.android.lark.mail.impl.p2168g.p2170b.C42154a;
import com.ss.android.lark.permission.C51327f;
import com.ss.android.lark.utils.C57805b;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.CountDownLatch;

/* renamed from: com.ss.android.lark.mail.impl.g.b */
public class C42150b {

    /* renamed from: a */
    C42154a f107179a;

    /* renamed from: com.ss.android.lark.mail.impl.g.b$a */
    private static class C42153a {

        /* renamed from: a */
        public static final C42150b f107183a = new C42150b();
    }

    /* renamed from: a */
    public static C42150b m168218a() {
        return C42153a.f107183a;
    }

    /* renamed from: b */
    public C42154a mo152116b() {
        return this.f107179a;
    }

    private C42150b() {
        try {
            this.f107179a = C42154a.m168225a(new File(mo152117c()), 1, 1, 104857600);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /* renamed from: c */
    public String mo152117c() {
        return m168220a(C41816b.m166115a().mo150132b(), false) + File.separator + "mail/image";
    }

    /* renamed from: a */
    public String mo152115a(Activity activity) {
        return m168220a(activity, true) + File.separator + "mail/image";
    }

    /* renamed from: a */
    private static String m168219a(Context context) {
        File a = DirectFileAccess.m95103a(new DirectFileAccess.StorageParams.Builder().mo93406a(DirectFileAccess.StorageLocation.EXTERNAL).mo93405a(DirectFileAccess.PathType.CACHE).mo93404a(context).mo93407a());
        if (a != null) {
            return a.getPath();
        }
        return "";
    }

    /* renamed from: b */
    private static String m168221b(final Activity activity) {
        Context b = C41816b.m166115a().mo150132b();
        if (C51327f.m199081a(b, "android.permission.WRITE_EXTERNAL_STORAGE")) {
            return m168219a(b);
        }
        if (activity != null) {
            final CountDownLatch countDownLatch = new CountDownLatch(1);
            try {
                activity.runOnUiThread(new Runnable() {
                    /* class com.ss.android.lark.mail.impl.p2168g.C42150b.RunnableC421511 */

                    public void run() {
                        C57805b.m224333d(activity, new C57805b.AbstractC57809a() {
                            /* class com.ss.android.lark.mail.impl.p2168g.C42150b.RunnableC421511.C421521 */

                            @Override // com.ss.android.lark.utils.C57805b.AbstractC57809a
                            public void permissionGranted(boolean z) {
                                countDownLatch.countDown();
                            }
                        });
                    }
                });
                countDownLatch.await();
                if (!C51327f.m199081a(activity, "android.permission.WRITE_EXTERNAL_STORAGE")) {
                    return "";
                }
                return m168219a((Context) activity);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        return "";
    }

    /* renamed from: a */
    private static String m168220a(Context context, boolean z) {
        String a = m168219a(context);
        if (a == null && z && (context instanceof Activity)) {
            a = m168221b((Activity) context);
        }
        if (a == null) {
            return DirectFileAccess.m95103a(new DirectFileAccess.StorageParams.Builder().mo93405a(DirectFileAccess.PathType.CACHE).mo93404a(context).mo93407a()).getAbsolutePath();
        }
        return a;
    }
}
