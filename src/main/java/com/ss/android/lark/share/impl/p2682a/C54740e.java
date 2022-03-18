package com.ss.android.lark.share.impl.p2682a;

import android.app.Activity;
import android.content.Intent;
import android.text.TextUtils;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.share.impl.AbstractC54744b;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.lark.share.impl.a.e */
public class C54740e extends AbstractC54724a {

    /* renamed from: f */
    private String f135179f;

    /* renamed from: g */
    private final List<AbstractC54744b> f135180g = new ArrayList();

    @Override // com.ss.android.lark.share.impl.AbstractC54744b
    /* renamed from: c */
    public void mo186867c(Intent intent) {
    }

    @Override // com.ss.android.lark.share.impl.AbstractC54744b
    /* renamed from: d */
    public void mo186869d(Intent intent) {
    }

    @Override // com.ss.android.lark.share.impl.AbstractC54744b
    /* renamed from: c */
    public boolean mo186868c() {
        return m212389a(this.f135146c, this.f135179f, this.f135148e);
    }

    public C54740e(Activity activity) {
        super(activity);
        m212388a(activity);
    }

    /* renamed from: a */
    private void m212388a(Activity activity) {
        this.f135180g.add(new C54734c(activity));
        this.f135180g.add(new C54733b(activity));
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.share.impl.p2682a.AbstractC54724a, com.ss.android.lark.share.impl.AbstractC54723a
    /* renamed from: b */
    public void mo186864b(Intent intent) {
        String str;
        super.mo186864b(intent);
        this.f135147d = intent.getData();
        if (this.f135147d == null) {
            str = "";
        } else {
            str = this.f135147d.getScheme();
        }
        this.f135179f = str;
    }

    /* JADX WARNING: Removed duplicated region for block: B:6:0x0014  */
    @Override // com.ss.android.lark.share.impl.AbstractC54744b, com.ss.android.lark.share.impl.AbstractC54723a
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo186862a(android.content.Intent r4) {
        /*
            r3 = this;
            boolean r0 = super.mo186862a(r4)
            if (r0 != 0) goto L_0x0008
            r4 = 0
            return r4
        L_0x0008:
            java.util.List<com.ss.android.lark.share.impl.b> r1 = r3.f135180g
            java.util.Iterator r1 = r1.iterator()
        L_0x000e:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x0020
            java.lang.Object r2 = r1.next()
            com.ss.android.lark.share.impl.b r2 = (com.ss.android.lark.share.impl.AbstractC54744b) r2
            boolean r2 = r2.mo186862a(r4)
            if (r2 == 0) goto L_0x000e
        L_0x0020:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.share.impl.p2682a.C54740e.mo186862a(android.content.Intent):boolean");
    }

    /* renamed from: a */
    public static boolean m212389a(String str, String str2, String str3) {
        if (TextUtils.isEmpty(str) || !"android.intent.action.VIEW".equals(str) || !"lark".equals(str2) || !"share.lark.com".equals(str3)) {
            return false;
        }
        Log.m165389i("SdkShareHandler", "sdk share");
        return true;
    }
}
