package com.bytedance.ee.bear.middleground.drive.rustsdk;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import com.bytedance.ee.bear.middleground.drive.export.AbstractC9365d;
import com.bytedance.ee.bear.middleground.drive.export.PushPayload;
import com.bytedance.ee.log.C13479a;
import com.bytedance.lark.pb.space.drive.v1.BroadcastPush;
import com.larksuite.framework.utils.CollectionUtils;
import com.ss.android.lark.sdk.C53248k;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* access modifiers changed from: package-private */
/* renamed from: com.bytedance.ee.bear.middleground.drive.rustsdk.h */
public class C9389h implements C53248k.AbstractC53250a {

    /* renamed from: a */
    public String f25241a = "Middleground_Drive_DriveRustPushListener_ListSync";

    /* renamed from: b */
    public Map<String, Set<C9390a>> f25242b = new ConcurrentHashMap();

    /* renamed from: c */
    private HandlerC9391b f25243c;

    /* renamed from: a */
    public void mo35829a(String str) {
        HandlerC9391b bVar = this.f25243c;
        bVar.sendMessage(Message.obtain(bVar, 3, str));
    }

    public C9389h(HandlerThread handlerThread) {
        this.f25243c = new HandlerC9391b(handlerThread.getLooper());
    }

    /* renamed from: a */
    public PushPayload mo35828a(BroadcastPush.EventMessage.Payload payload) {
        return new PushPayload(payload.node_token, payload.file_type.intValue(), payload.data, payload.event_type.intValue(), payload.event_time.longValue(), payload.version.longValue(), payload.extra);
    }

    /* access modifiers changed from: private */
    /* renamed from: com.bytedance.ee.bear.middleground.drive.rustsdk.h$b */
    public final class HandlerC9391b extends Handler {
        /* renamed from: a */
        private void m38800a(byte[] bArr) {
            try {
                C13479a.m54764b(C9389h.this.f25241a, "dispatchPush() start");
                BroadcastPush decode = BroadcastPush.ADAPTER.decode(bArr);
                String str = C9389h.this.f25241a;
                C13479a.m54772d(str, "handleMessage MSG_ON_PUSH data=" + decode);
                if (!CollectionUtils.isEmpty(decode.event_message)) {
                    for (BroadcastPush.EventMessage eventMessage : decode.event_message) {
                        Set<C9390a> set = C9389h.this.f25242b.get(eventMessage.subsc_sign);
                        if (set != null) {
                            for (C9390a aVar : set) {
                                if (aVar.f25246c != null && aVar.f25247d == eventMessage.push_type.getValue()) {
                                    if (!CollectionUtils.isEmpty(eventMessage.payloads)) {
                                        if (eventMessage.push_status == BroadcastPush.EventMessage.PushStatus.NORMAL) {
                                            for (BroadcastPush.EventMessage.Payload payload : eventMessage.payloads) {
                                                aVar.f25246c.mo33402a(C9389h.this.mo35828a(payload));
                                            }
                                        } else {
                                            aVar.f25246c.mo33401a();
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            } catch (Throwable th) {
                C13479a.m54759a(C9389h.this.f25241a, "handleMessage MSG_ON_PUSH error", th);
            }
        }

        public void handleMessage(Message message) {
            int i = message.what;
            if (i == 1) {
                m38800a((byte[]) message.obj);
            } else if (i == 2) {
                C13479a.m54764b(C9389h.this.f25241a, "MSG_ADD_CALLBACK start");
                if (message.obj != null) {
                    C9390a aVar = (C9390a) message.obj;
                    if (C9389h.this.f25242b.get(aVar.f25244a) == null) {
                        C9389h.this.f25242b.put(aVar.f25244a, Collections.synchronizedSet(new HashSet()));
                    }
                    C9389h.this.f25242b.get(aVar.f25244a).add(aVar);
                }
            } else if (i == 3) {
                C13479a.m54764b(C9389h.this.f25241a, "MSG_REMOVE_CALLBACK start");
                String str = (String) message.obj;
                if (!TextUtils.isEmpty(str)) {
                    Set<C9390a> set = C9389h.this.f25242b.get(str);
                    if (!CollectionUtils.isEmpty(set)) {
                        Iterator<C9390a> it = set.iterator();
                        while (it.hasNext()) {
                            if (str.equals(it.next().f25244a)) {
                                it.remove();
                            }
                        }
                    }
                }
            } else if (i == 4) {
                C9389h.this.f25242b.clear();
            }
        }

        public HandlerC9391b(Looper looper) {
            super(looper);
        }
    }

    /* renamed from: a */
    public void mo35830a(String str, AbstractC9365d dVar, int i) {
        HandlerC9391b bVar = this.f25243c;
        bVar.sendMessage(Message.obtain(bVar, 2, new C9390a(str, "", dVar, i)));
    }

    /* access modifiers changed from: private */
    /* renamed from: com.bytedance.ee.bear.middleground.drive.rustsdk.h$a */
    public static class C9390a {

        /* renamed from: a */
        String f25244a;

        /* renamed from: b */
        String f25245b;

        /* renamed from: c */
        AbstractC9365d f25246c;

        /* renamed from: d */
        int f25247d;

        public C9390a(String str, String str2, AbstractC9365d dVar, int i) {
            this.f25244a = str;
            this.f25245b = str2;
            this.f25246c = dVar;
            this.f25247d = i;
        }
    }

    @Override // com.ss.android.lark.sdk.C53248k.AbstractC53250a
    public void onPush(byte[] bArr, String str, boolean z, boolean z2) {
        String str2 = this.f25241a;
        C13479a.m54772d(str2, "DriveRustPushListener.onPush: sid=" + str + " fromServerPipe=" + z + " offlinePush=" + z2);
        HandlerC9391b bVar = this.f25243c;
        bVar.sendMessage(Message.obtain(bVar, 1, bArr));
    }
}
