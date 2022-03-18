package com.ss.android.socialbase.downloader.notification;

import android.content.Context;
import android.content.Intent;
import android.util.SparseArray;
import com.ss.android.socialbase.downloader.downloader.C60046b;
import com.ss.android.socialbase.downloader.p3025b.C59990a;
import java.util.HashSet;
import java.util.Set;

/* renamed from: com.ss.android.socialbase.downloader.notification.b */
public class C60147b {

    /* renamed from: a */
    private static volatile C60147b f150106a;

    /* renamed from: c */
    private static final Object f150107c = new Object();

    /* renamed from: b */
    private final Set<String> f150108b = new HashSet();

    /* renamed from: d */
    private final SparseArray<AbstractC60146a> f150109d = new SparseArray<>();

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public SparseArray<AbstractC60146a> mo205466b() {
        SparseArray<AbstractC60146a> sparseArray;
        synchronized (this.f150109d) {
            sparseArray = this.f150109d;
        }
        return sparseArray;
    }

    private C60147b() {
    }

    /* renamed from: a */
    public static C60147b m233714a() {
        if (f150106a == null) {
            synchronized (C60147b.class) {
                if (f150106a == null) {
                    f150106a = new C60147b();
                }
            }
        }
        return f150106a;
    }

    /* renamed from: d */
    public void mo205469d(int i) {
        mo205467b(i);
        if (i != 0) {
            m233714a().mo205465a(i);
        }
    }

    /* renamed from: c */
    public AbstractC60146a mo205468c(int i) {
        AbstractC60146a aVar;
        if (i == 0) {
            return null;
        }
        synchronized (this.f150109d) {
            aVar = this.f150109d.get(i);
        }
        return aVar;
    }

    /* renamed from: a */
    public void mo205465a(int i) {
        Context G = C60046b.m232945G();
        if (G != null && i != 0) {
            try {
                Intent intent = new Intent(G, DownloadNotificationService.class);
                intent.setAction("android.ss.intent.action.DOWNLOAD_NOTIFICATION_CANCEL");
                intent.putExtra("DOWNLOAD_NOTIFICATION_BUNDLE_EXTRA_ID", i);
                G.startService(intent);
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    /* renamed from: b */
    public AbstractC60146a mo205467b(int i) {
        AbstractC60146a aVar;
        if (i == 0) {
            return null;
        }
        synchronized (this.f150109d) {
            aVar = this.f150109d.get(i);
            if (aVar != null) {
                this.f150109d.remove(i);
                C59990a.m232833a("removeNotificationId " + i);
            }
        }
        return aVar;
    }
}
