package com.ss.android.lark.banner.p1397f;

import com.larksuite.framework.thread.CoreThreadPool;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.pb.guide.PushBannerRequest;
import com.ss.android.lark.pb.improto.Command;
import com.ss.android.lark.sdk.C53246j;
import com.ss.android.lark.sdk.C53248k;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: com.ss.android.lark.banner.f.a */
public class C29492a {

    /* renamed from: a */
    public List<AbstractC29498b> f73676a = new CopyOnWriteArrayList();

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.lark.banner.f.a$a */
    public static class C29497a {

        /* renamed from: a */
        public static C29492a f73682a = new C29492a();
    }

    /* renamed from: com.ss.android.lark.banner.f.a$b */
    public interface AbstractC29498b {
        /* renamed from: a */
        void mo104359a(String str);
    }

    /* renamed from: a */
    public static C29492a m108585a() {
        return C29497a.f73682a;
    }

    /* renamed from: b */
    public void mo104452b(AbstractC29498b bVar) {
        C53246j.m205911b(this.f73676a, bVar, new C53246j.AbstractC53247a() {
            /* class com.ss.android.lark.banner.p1397f.C29492a.C294952 */

            @Override // com.ss.android.lark.sdk.C53246j.AbstractC53247a
            public void handle() {
                C53248k.m205912a().mo181699a(Command.PUSH_BANNER);
            }
        });
    }

    /* renamed from: a */
    public void mo104450a(AbstractC29498b bVar) {
        if (!this.f73676a.contains(bVar)) {
            C53246j.m205910a(this.f73676a, bVar, new C53246j.AbstractC53247a() {
                /* class com.ss.android.lark.banner.p1397f.C29492a.C294931 */

                @Override // com.ss.android.lark.sdk.C53246j.AbstractC53247a
                public void handle() {
                    C53248k.m205912a().mo181700a(Command.PUSH_BANNER, new C53248k.AbstractC53250a() {
                        /* class com.ss.android.lark.banner.p1397f.C29492a.C294931.C294941 */

                        @Override // com.ss.android.lark.sdk.C53248k.AbstractC53250a
                        public void onPush(byte[] bArr, String str, boolean z, boolean z2) {
                            C29492a.this.mo104451a(bArr, str, z, z2);
                        }
                    });
                }
            });
        }
    }

    /* renamed from: a */
    public void mo104451a(byte[] bArr, String str, boolean z, boolean z2) {
        try {
            final String name = PushBannerRequest.ADAPTER.decode(bArr).mscene.name();
            CoreThreadPool.getDefault().getUIExecutor().execute(new Runnable() {
                /* class com.ss.android.lark.banner.p1397f.C29492a.RunnableC294963 */

                public void run() {
                    for (AbstractC29498b bVar : C29492a.this.f73676a) {
                        bVar.mo104359a(name);
                    }
                }
            });
        } catch (IOException e) {
            Log.m165387e(e.getMessage(), (Throwable) e, true);
        }
    }
}
