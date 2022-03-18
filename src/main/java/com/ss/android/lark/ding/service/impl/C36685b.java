package com.ss.android.lark.ding.service.impl;

import com.bytedance.lark.pb.basic.v1.C14928Entity;
import com.bytedance.lark.pb.basic.v1.Command;
import com.bytedance.lark.pb.basic.v1.Urgent;
import com.larksuite.framework.thread.CoreThreadPool;
import com.ss.android.lark.chat.api.AbstractC32810b;
import com.ss.android.lark.chat.entity.message.MessageInfo;
import com.ss.android.lark.ding.C36618a;
import com.ss.android.lark.ding.dependency.IDingModuleDependency;
import com.ss.android.lark.ding.dto.C36636a;
import com.ss.android.lark.ding.p1803a.AbstractC36620b;
import com.ss.android.lark.ding.p1803a.AbstractC36621c;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.sdk.C53246j;
import com.ss.android.lark.sdk.C53248k;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: com.ss.android.lark.ding.service.impl.b */
public class C36685b {

    /* renamed from: a */
    public List<AbstractC36621c> f94307a;

    /* renamed from: b */
    public List<AbstractC36620b> f94308b;

    /* renamed from: c */
    private IDingModuleDependency.AbstractC36631h f94309c;

    /* renamed from: d */
    private AbstractC32810b f94310d;

    /* renamed from: e */
    private List<Object> f94311e;

    /* renamed from: com.ss.android.lark.ding.service.impl.b$a */
    private static class C36689a {

        /* renamed from: a */
        public static final C36685b f94319a = new C36685b();
    }

    /* renamed from: a */
    public static final C36685b m144766a() {
        return C36689a.f94319a;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static /* synthetic */ void m144768b() {
        C53248k.m205912a().mo181696a(Command.PUSH_URGENT);
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public /* synthetic */ void m144771c() {
        C53248k.m205912a().mo181697a(Command.PUSH_URGENT, new C53248k.AbstractC53250a() {
            /* class com.ss.android.lark.ding.service.impl.$$Lambda$L9s1per9kLd72tMgtdbxBEnQBKM */

            @Override // com.ss.android.lark.sdk.C53248k.AbstractC53250a
            public final void onPush(byte[] bArr, String str, boolean z, boolean z2) {
                C36685b.this.mo135294a(bArr, str, z, z2);
            }
        });
    }

    /* renamed from: com.ss.android.lark.ding.service.impl.b$3 */
    static /* synthetic */ class C366883 {

        /* renamed from: a */
        static final /* synthetic */ int[] f94318a;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        static {
            /*
                com.bytedance.lark.pb.basic.v1.Urgent$Status[] r0 = com.bytedance.lark.pb.basic.v1.Urgent.Status.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.ss.android.lark.ding.service.impl.C36685b.C366883.f94318a = r0
                com.bytedance.lark.pb.basic.v1.Urgent$Status r1 = com.bytedance.lark.pb.basic.v1.Urgent.Status.ME_CREATE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = com.ss.android.lark.ding.service.impl.C36685b.C366883.f94318a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.bytedance.lark.pb.basic.v1.Urgent$Status r1 = com.bytedance.lark.pb.basic.v1.Urgent.Status.URGENT_ME     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = com.ss.android.lark.ding.service.impl.C36685b.C366883.f94318a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.bytedance.lark.pb.basic.v1.Urgent$Status r1 = com.bytedance.lark.pb.basic.v1.Urgent.Status.ME_ACK     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = com.ss.android.lark.ding.service.impl.C36685b.C366883.f94318a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.bytedance.lark.pb.basic.v1.Urgent$Status r1 = com.bytedance.lark.pb.basic.v1.Urgent.Status.ACK_ME     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.ding.service.impl.C36685b.C366883.<clinit>():void");
        }
    }

    private C36685b() {
        this.f94307a = new CopyOnWriteArrayList();
        this.f94308b = new CopyOnWriteArrayList();
        this.f94311e = new CopyOnWriteArrayList();
        this.f94309c = C36618a.m144492a().mo135102g();
        this.f94310d = C36618a.m144492a().mo135104i().mo135137b();
    }

    /* renamed from: b */
    private void m144770b(Object obj) {
        C53246j.m205911b(this.f94311e, obj, $$Lambda$b$fNIlq_NmRfplq1G3SxjyM_qlMdc.INSTANCE);
    }

    /* renamed from: a */
    private void m144767a(Object obj) {
        C53246j.m205910a(this.f94311e, obj, new C53246j.AbstractC53247a() {
            /* class com.ss.android.lark.ding.service.impl.$$Lambda$b$22YsUiMuIOrQc9CSEMaB0Osthg */

            @Override // com.ss.android.lark.sdk.C53246j.AbstractC53247a
            public final void handle() {
                C36685b.this.m144771c();
            }
        });
    }

    /* renamed from: b */
    public void mo135295b(AbstractC36620b bVar) {
        this.f94308b.remove(bVar);
        m144770b((Object) bVar);
    }

    /* renamed from: a */
    public void mo135292a(AbstractC36620b bVar) {
        this.f94308b.add(bVar);
        m144767a((Object) bVar);
    }

    /* renamed from: a */
    public void mo135293a(AbstractC36621c cVar) {
        this.f94307a.add(cVar);
        m144767a((Object) cVar);
    }

    /* renamed from: b */
    public void mo135296b(AbstractC36621c cVar) {
        this.f94307a.remove(cVar);
        m144770b((Object) cVar);
    }

    /* renamed from: a */
    public void mo135291a(Urgent urgent, Map<String, MessageInfo> map) {
        final MessageInfo messageInfo = map.get(urgent.message_id);
        final C36636a a = C36757d.m144998a(urgent);
        CoreThreadPool.getDefault().getUIExecutor().execute(new Runnable() {
            /* class com.ss.android.lark.ding.service.impl.C36685b.RunnableC366861 */

            public void run() {
                for (AbstractC36621c cVar : C36685b.this.f94307a) {
                    cVar.mo135095a(a, messageInfo);
                }
            }
        });
    }

    /* renamed from: b */
    private void m144769b(Urgent urgent, Map<String, MessageInfo> map) {
        final C36636a a = C36757d.m144998a(urgent);
        final MessageInfo messageInfo = map.get(urgent.message_id);
        if (urgent.status == Urgent.Status.ME_ACK) {
            a.mo135175c(this.f94309c.mo135154a());
        }
        a.mo135170a(messageInfo.getDingStatus());
        CoreThreadPool.getDefault().getUIExecutor().execute(new Runnable() {
            /* class com.ss.android.lark.ding.service.impl.C36685b.RunnableC366872 */

            public void run() {
                for (AbstractC36620b bVar : C36685b.this.f94308b) {
                    bVar.mo135094a(a, messageInfo);
                }
            }
        });
    }

    /* renamed from: a */
    public void mo135294a(byte[] bArr, String str, boolean z, boolean z2) {
        try {
            C14928Entity decode = C14928Entity.ADAPTER.decode(bArr);
            Map<String, Urgent> map = decode.urgents;
            if (map != null) {
                Map<String, MessageInfo> a = this.f94310d.mo120947a(decode);
                for (Urgent urgent : map.values()) {
                    int i = C366883.f94318a[urgent.status.ordinal()];
                    if (i == 1 || i == 2) {
                        mo135291a(urgent, a);
                    } else if (i == 3 || i == 4) {
                        m144769b(urgent, a);
                    }
                }
            }
        } catch (Exception e) {
            Log.m165386e(e.getMessage(), e);
        }
    }
}
