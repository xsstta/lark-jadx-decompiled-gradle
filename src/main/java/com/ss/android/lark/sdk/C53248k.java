package com.ss.android.lark.sdk;

import android.text.TextUtils;
import com.bytedance.lark.pb.basic.v1.Command;
import com.bytedance.lark.pb.basic.v1.Packet;
import com.bytedance.lark.sdk.AbstractC19832d;
import com.larksuite.framework.utils.C26284k;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import okio.ByteString;

/* renamed from: com.ss.android.lark.sdk.k */
public class C53248k implements AbstractC19832d {

    /* renamed from: a */
    private Map<Command, AbstractC53250a> f131600a;

    /* renamed from: b */
    private Map<com.ss.android.lark.pb.improto.Command, AbstractC53250a> f131601b;

    /* renamed from: c */
    private C53242i f131602c;

    /* renamed from: com.ss.android.lark.sdk.k$a */
    public interface AbstractC53250a {
        void onPush(byte[] bArr, String str, boolean z, boolean z2);
    }

    /* renamed from: com.ss.android.lark.sdk.k$c */
    public static class C53252c {

        /* renamed from: a */
        public static final C53248k f131604a = new C53248k();
    }

    /* renamed from: a */
    public static C53248k m205912a() {
        return C53252c.f131604a;
    }

    private C53248k() {
        this.f131600a = new HashMap();
        this.f131601b = new HashMap();
        this.f131602c = new C53242i();
    }

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.lark.sdk.k$b */
    public static class C53251b implements AbstractC53250a {

        /* renamed from: a */
        private AbstractC53250a f131603a;

        public C53251b(AbstractC53250a aVar) {
            this.f131603a = aVar;
        }

        @Override // com.ss.android.lark.sdk.C53248k.AbstractC53250a
        public void onPush(byte[] bArr, String str, boolean z, boolean z2) {
            if (this.f131603a == null) {
                C53241h.m205894a("PushDispatcher", "SdkPushListenerKeyWrapper mSdkPushListener is null");
                return;
            }
            C53241h.m205899c("PushDispatcher", "SdkPushListenerKeyWrapper just push");
            this.f131603a.onPush(bArr, str, z, z2);
        }
    }

    /* renamed from: a */
    public void mo181696a(Command command) {
        if (command != null) {
            this.f131600a.remove(command);
        }
    }

    /* renamed from: a */
    public void mo181699a(com.ss.android.lark.pb.improto.Command command) {
        if (command != null) {
            this.f131601b.remove(command);
        }
    }

    /* renamed from: a */
    public void mo181697a(Command command, AbstractC53250a aVar) {
        if (command != null && aVar != null) {
            if (C26284k.m95186b(C53254m.m205919a()) && this.f131600a.containsKey(command)) {
                String str = "command " + command + "has already registered!";
                C53254m.m205927c().mo181688a(str);
                C53241h.m205894a("PushDispatcher", str);
            }
            this.f131600a.put(command, new C53251b(aVar));
        }
    }

    /* renamed from: a */
    public void mo181700a(com.ss.android.lark.pb.improto.Command command, AbstractC53250a aVar) {
        if (command != null && aVar != null) {
            if (C26284k.m95186b(C53254m.m205919a()) && this.f131601b.containsKey(command)) {
                String str = "command " + command + "has already registered!";
                C53254m.m205927c().mo181688a(str);
                C53241h.m205894a("PushDispatcher", str);
            }
            this.f131601b.put(command, new C53251b(aVar));
        }
    }

    /* renamed from: a */
    public void mo181698a(Command command, String str, AbstractC53250a aVar) {
        mo181697a(command, aVar);
    }

    @Override // com.bytedance.lark.sdk.AbstractC19832d
    /* renamed from: a */
    public void mo67180a(Packet packet, long j, long j2) {
        ByteString byteString;
        boolean z;
        String str;
        String str2;
        Command command = packet.cmd;
        C53241h.m205898b("PushDispatcher", "thread = " + Thread.currentThread().getName() + " command = " + command);
        if (packet.payload == null) {
            byteString = ByteString.EMPTY;
        } else {
            byteString = packet.payload;
        }
        if (C53254m.m205928d() != null) {
            z = C53254m.m205928d().mo102654b();
        } else {
            z = false;
        }
        AbstractC53250a aVar = null;
        if (C53254m.m205928d() != null) {
            str = C53254m.m205928d().mo102652a();
        } else {
            str = null;
        }
        if (packet != null) {
            str2 = packet.user_id;
        } else {
            str2 = null;
        }
        if (!z || TextUtils.isEmpty(str2) || TextUtils.isEmpty(str) || str.equals(str2)) {
            if (command != Command.PASS_THROUGH_PUSH) {
                aVar = this.f131600a.get(command);
            } else {
                try {
                    com.ss.android.lark.pb.improto.Packet decode = com.ss.android.lark.pb.improto.Packet.ADAPTER.decode(byteString);
                    byteString = decode.mpayload;
                    aVar = this.f131601b.get(com.ss.android.lark.pb.improto.Command.fromValue(decode.mcommand.intValue()));
                } catch (IOException e) {
                    C53241h.m205894a("PushDispatcher", e.getMessage());
                } catch (IllegalStateException e2) {
                    String message = e2.getMessage();
                    C53241h.m205894a("PushDispatcher", e2.getMessage());
                    if (message == null || !message.contains("mcmd")) {
                        throw e2;
                    }
                    C53241h.m205900d("PushDispatcher", "catch exception for unsupported command");
                }
            }
            if (aVar != null) {
                aVar.onPush(byteString.toByteArray(), "", false, false);
            } else {
                C53241h.m205900d("PushDispatcher", "unprocessed push：" + command);
            }
            this.f131602c.mo181691a(command, aVar, j);
            long currentTimeMillis = System.currentTimeMillis();
            if (currentTimeMillis - j > 10000) {
                String str3 = "push time out command = " + command + ", decode time = " + (j2 - j) + ", handle push time = " + (currentTimeMillis - j2);
                C53241h.m205896a("PushDispatcher", str3, (Throwable) new RuntimeException(str3), true);
                return;
            }
            return;
        }
        C53241h.m205900d("PushDispatcher", "The packet does not belong to current user, packUid=" + str2 + "， currentUid=" + str);
    }
}
