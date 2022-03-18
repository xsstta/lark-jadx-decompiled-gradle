package com.larksuite.component.dybrid.h5core.p1079g.p1080a.p1081a;

import com.bytedance.lark.pb.basic.v1.Command;
import com.bytedance.lark.pb.basic.v1.Packet;
import com.bytedance.lark.sdk.AbstractC19832d;
import com.larksuite.component.dybrid.h5api.p1071b.C24174b;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import okio.ByteString;

/* renamed from: com.larksuite.component.dybrid.h5core.g.a.a.a */
public class C24222a implements AbstractC19832d {

    /* renamed from: a */
    private Map<Command, List<AbstractC24223a>> f59860a = new ConcurrentHashMap();

    /* renamed from: com.larksuite.component.dybrid.h5core.g.a.a.a$a */
    public interface AbstractC24223a {
        /* renamed from: a */
        void mo86857a(byte[] bArr, String str, boolean z, boolean z2);
    }

    /* renamed from: a */
    public void mo86858a() {
        this.f59860a.clear();
    }

    /* renamed from: com.larksuite.component.dybrid.h5core.g.a.a.a$b */
    private static class C24224b implements AbstractC24223a {

        /* renamed from: a */
        private AbstractC24223a f59861a;

        public C24224b(AbstractC24223a aVar) {
            this.f59861a = aVar;
        }

        @Override // com.larksuite.component.dybrid.h5core.p1079g.p1080a.p1081a.C24222a.AbstractC24223a
        /* renamed from: a */
        public void mo86857a(byte[] bArr, String str, boolean z, boolean z2) {
            if (this.f59861a == null) {
                C24174b.m88301c("PushDispatcher", "SdkPushListenerKeyWrapper mSdkPushListener is null");
                return;
            }
            C24174b.m88296a("PushDispatcher", "SdkPushListenerKeyWrapper just push");
            this.f59861a.mo86857a(bArr, str, z, z2);
        }
    }

    /* renamed from: a */
    public void mo86859a(Command command, AbstractC24223a aVar) {
        if (command != null && aVar != null) {
            List<AbstractC24223a> list = this.f59860a.get(command);
            if (list == null) {
                list = new CopyOnWriteArrayList<>();
                this.f59860a.put(command, list);
            }
            list.add(new C24224b(aVar));
        }
    }

    /* renamed from: b */
    public void mo86860b(Command command, AbstractC24223a aVar) {
        if (command != null) {
            if (aVar == null) {
                this.f59860a.remove(command);
                return;
            }
            List<AbstractC24223a> list = this.f59860a.get(command);
            if (list != null) {
                Iterator<AbstractC24223a> it = list.iterator();
                while (it.hasNext()) {
                    if (it.next() == aVar) {
                        it.remove();
                        return;
                    }
                }
            }
        }
    }

    @Override // com.bytedance.lark.sdk.AbstractC19832d
    /* renamed from: a */
    public void mo67180a(Packet packet, long j, long j2) {
        ByteString byteString;
        Command command = packet.cmd;
        C24174b.m88296a("PushDispatcher", "thread = " + Thread.currentThread().getName() + " command = " + command);
        if (packet.payload == null) {
            byteString = ByteString.EMPTY;
        } else {
            byteString = packet.payload;
        }
        List<AbstractC24223a> list = this.f59860a.get(command);
        if (list != null) {
            for (AbstractC24223a aVar : list) {
                aVar.mo86857a(byteString.toByteArray(), "", false, false);
            }
        } else {
            C24174b.m88299b("PushDispatcher", "push have not be handled：" + command);
        }
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis - j > 10000) {
            String str = "push time out command = " + command + ", decode time = " + (j2 - j) + ", handle push time = " + (currentTimeMillis - j2);
            C24174b.m88297a("PushDispatcher", str, new RuntimeException(str));
        }
    }
}
