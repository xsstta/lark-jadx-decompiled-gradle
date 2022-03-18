package com.ss.android.lark.feed.service.impl;

import com.bytedance.lark.pb.basic.v1.Command;
import com.bytedance.lark.pb.feed.v1.PushShortcutsResponse;
import com.larksuite.framework.thread.CoreThreadPool;
import com.ss.android.lark.biz.im.api.Shortcut;
import com.ss.android.lark.feed.interfaces.AbstractC38109s;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.sdk.C53246j;
import com.ss.android.lark.sdk.C53248k;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: com.ss.android.lark.feed.service.impl.l */
public class C38167l {

    /* renamed from: a */
    public List<AbstractC38109s> f97856a;

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.lark.feed.service.impl.l$a */
    public static class C38172a {

        /* renamed from: a */
        public static final C38167l f97863a = new C38167l();
    }

    /* renamed from: a */
    public static final C38167l m150039a() {
        return C38172a.f97863a;
    }

    private C38167l() {
        this.f97856a = new CopyOnWriteArrayList();
    }

    /* renamed from: a */
    public void mo139529a(AbstractC38109s sVar) {
        C53246j.m205910a(this.f97856a, sVar, new C53246j.AbstractC53247a() {
            /* class com.ss.android.lark.feed.service.impl.C38167l.C381681 */

            @Override // com.ss.android.lark.sdk.C53246j.AbstractC53247a
            public void handle() {
                C53248k.m205912a().mo181697a(Command.PUSH_SHORTCUTS, new C53248k.AbstractC53250a() {
                    /* class com.ss.android.lark.feed.service.impl.C38167l.C381681.C381691 */

                    @Override // com.ss.android.lark.sdk.C53248k.AbstractC53250a
                    public void onPush(byte[] bArr, String str, boolean z, boolean z2) {
                        C38167l.this.mo139530a(bArr, str, z, z2);
                    }
                });
            }
        });
    }

    /* renamed from: b */
    public void mo139531b(AbstractC38109s sVar) {
        C53246j.m205911b(this.f97856a, sVar, new C53246j.AbstractC53247a() {
            /* class com.ss.android.lark.feed.service.impl.C38167l.C381702 */

            @Override // com.ss.android.lark.sdk.C53246j.AbstractC53247a
            public void handle() {
                C53248k.m205912a().mo181696a(Command.PUSH_SHORTCUTS);
            }
        });
    }

    /* renamed from: a */
    public void mo139530a(byte[] bArr, String str, boolean z, boolean z2) {
        try {
            final PushShortcutsResponse decode = PushShortcutsResponse.ADAPTER.decode(bArr);
            final List<Shortcut> a = C38165j.m150038a(decode.shortcuts);
            CoreThreadPool.getDefault().getUIExecutor().execute(new Runnable() {
                /* class com.ss.android.lark.feed.service.impl.C38167l.RunnableC381713 */

                public void run() {
                    for (AbstractC38109s sVar : C38167l.this.f97856a) {
                        sVar.mo138554a(a, C38159h.m150025a(decode.entity_previews));
                    }
                }
            });
        } catch (Exception e) {
            Log.m165387e(e.getMessage(), (Throwable) e, true);
        }
    }
}
