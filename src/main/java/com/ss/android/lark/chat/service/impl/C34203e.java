package com.ss.android.lark.chat.service.impl;

import com.ss.android.lark.chat.api.service.p1600b.C32821b;
import com.ss.android.lark.chat.service.AbstractC34119b;
import com.ss.android.lark.chat.service.IChatRelationPushSubscriber;
import com.ss.android.lark.chat.service.IPushChatRelationListener;
import com.ss.android.lark.chat.service.impl.C34289y;
import com.ss.android.lark.log.Log;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.ss.android.lark.chat.service.impl.e */
public class C34203e implements AbstractC34119b {

    /* renamed from: a */
    private final Map<Object, IChatRelationPushSubscriber> f88499a;

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.lark.chat.service.impl.e$a */
    public static final class C34205a {

        /* renamed from: a */
        public static final C34203e f88501a = new C34203e();
    }

    /* renamed from: a */
    public static C34203e m132761a() {
        return C34205a.f88501a;
    }

    private C34203e() {
        this.f88499a = new ConcurrentHashMap(16);
        C34289y.m132972a(new C34289y.AbstractC34290a() {
            /* class com.ss.android.lark.chat.service.impl.C34203e.C342041 */

            @Override // com.ss.android.lark.chat.service.impl.C34289y.AbstractC34290a
            /* renamed from: a */
            public void mo126753a(List<String> list, List<String> list2) {
                C32821b.m126120a().mo121030a(list, list2);
            }
        });
    }

    /* renamed from: b */
    public void mo126752b(String str) {
        C34289y.m132974b(str);
    }

    /* renamed from: a */
    public void mo126751a(String str) {
        C34289y.m132973a(str);
    }

    @Override // com.ss.android.lark.chat.service.AbstractC34119b
    /* renamed from: a */
    public void mo126544a(Object obj, String str) {
        IChatRelationPushSubscriber remove = this.f88499a.remove(obj);
        if (remove == null) {
            Log.m165397w("ChatSubscribeService", "subscriber unregister is empty，key: " + obj);
            return;
        }
        remove.mo126541a(str);
    }

    @Override // com.ss.android.lark.chat.service.AbstractC34119b
    /* renamed from: a */
    public void mo126545a(Object obj, String str, IPushChatRelationListener hVar) {
        IChatRelationPushSubscriber aVar = this.f88499a.get(obj);
        if (aVar == null) {
            synchronized (C34203e.class) {
                aVar = this.f88499a.get(obj);
                if (aVar == null) {
                    aVar = new ChatRelationPushSubscriber();
                    this.f88499a.put(obj, aVar);
                }
            }
        }
        aVar.mo126542a(str, hVar);
    }
}
