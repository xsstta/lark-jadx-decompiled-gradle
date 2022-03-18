package com.ss.android.lark.guidemgr.p1935b.p1939d;

import androidx.core.util.C0844e;
import com.bytedance.lark.pb.basic.v1.Command;
import com.bytedance.lark.pb.onboarding.v1.UserGuideUpdatedRequest;
import com.larksuite.framework.callback.IGetDataCallback;
import com.ss.android.lark.guidemgr.p1935b.p1938c.C38711a;
import com.ss.android.lark.guidemgr.p1935b.p1938c.C38712b;
import com.ss.android.lark.guidemgr.p1935b.p1942g.C38723a;
import com.ss.android.lark.sdk.C53248k;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: com.ss.android.lark.guidemgr.b.d.a */
public class C38713a {

    /* renamed from: a */
    private volatile boolean f99593a;

    /* renamed from: b */
    private List<IGetDataCallback> f99594b;

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.lark.guidemgr.b.d.a$a */
    public static class C38715a {

        /* renamed from: a */
        public static final C38713a f99596a = new C38713a();
    }

    /* renamed from: a */
    public static C38713a m152914a() {
        return C38715a.f99596a;
    }

    private C38713a() {
        this.f99594b = new CopyOnWriteArrayList();
    }

    /* renamed from: c */
    private void m152915c() {
        C53248k.m205912a().mo181697a(Command.USER_GUIDE_UPDATED_REQUEST, new C53248k.AbstractC53250a() {
            /* class com.ss.android.lark.guidemgr.p1935b.p1939d.C38713a.C387141 */

            @Override // com.ss.android.lark.sdk.C53248k.AbstractC53250a
            public void onPush(byte[] bArr, String str, boolean z, boolean z2) {
                try {
                    UserGuideUpdatedRequest decode = UserGuideUpdatedRequest.ADAPTER.decode(bArr);
                    if (decode != null && decode.ordered_pairs != null) {
                        C38713a.this.mo141880a(C38723a.m152936a(decode.ordered_pairs));
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        });
    }

    /* renamed from: b */
    public synchronized void mo141881b() {
        if (!this.f99593a) {
            m152915c();
            this.f99593a = true;
        }
    }

    /* renamed from: b */
    public void mo141882b(IGetDataCallback<List<C0844e<C38711a, List<C38712b>>>> iGetDataCallback) {
        this.f99594b.remove(iGetDataCallback);
    }

    /* renamed from: a */
    public void mo141879a(IGetDataCallback<List<C0844e<C38711a, List<C38712b>>>> iGetDataCallback) {
        if (!this.f99594b.contains(iGetDataCallback)) {
            this.f99594b.add(iGetDataCallback);
        }
    }

    /* renamed from: a */
    public void mo141880a(List<C0844e<C38711a, List<C38712b>>> list) {
        for (IGetDataCallback iGetDataCallback : this.f99594b) {
            iGetDataCallback.onSuccess(list);
        }
    }
}
