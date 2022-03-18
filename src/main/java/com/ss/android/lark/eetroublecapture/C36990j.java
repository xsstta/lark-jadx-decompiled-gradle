package com.ss.android.lark.eetroublecapture;

import android.database.ContentObserver;
import android.net.Uri;
import android.os.Handler;
import android.os.SystemClock;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.lark.eetroublecapture.j */
public class C36990j extends ContentObserver {

    /* renamed from: a */
    public static long f95089a;

    /* renamed from: b */
    private final Uri f95090b;

    /* renamed from: c */
    private AbstractC36989i f95091c;

    public void onChange(boolean z) {
        super.onChange(z);
        f95089a = SystemClock.elapsedRealtime();
        AbstractC36989i iVar = this.f95091c;
        if (iVar != null) {
            iVar.mo136502a(this.f95090b);
        }
    }

    public C36990j(Handler handler, Uri uri, AbstractC36989i iVar) {
        super(handler);
        this.f95090b = uri;
        this.f95091c = iVar;
    }
}
