package com.lark.falcon.engine.inspect.p1062a.p1064b;

import android.util.Base64;
import com.lark.falcon.engine.inspect.p1062a.C24010d;
import com.lark.falcon.engine.inspect.p1062a.p1063a.AbstractC23981c;
import com.lark.falcon.engine.inspect.p1062a.p1063a.AbstractC23982d;
import com.lark.falcon.engine.inspect.p1062a.p1063a.C23984e;
import com.lark.falcon.engine.inspect.p1062a.p1063a.C23985f;
import com.lark.falcon.engine.inspect.p1062a.p1063a.C23986g;
import com.lark.falcon.engine.inspect.p1062a.p1063a.C23987h;
import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* renamed from: com.lark.falcon.engine.inspect.a.b.i */
public class C24002i implements AbstractC23981c {

    /* renamed from: a */
    private final AbstractC23999f f59364a;

    public C24002i(AbstractC23999f fVar) {
        this.f59364a = fVar;
    }

    /* renamed from: a */
    private static String m87742a(String str) {
        try {
            MessageDigest instance = MessageDigest.getInstance("SHA-1");
            instance.update(C24001h.m87740a(str + "258EAFA5-E914-47DA-95CA-C5AB0DC85B11"));
            return Base64.encodeToString(instance.digest(), 2);
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: a */
    private static boolean m87743a(C23985f fVar) {
        if (!"websocket".equalsIgnoreCase(m87741a(fVar, "Upgrade")) || !"Upgrade".equals(m87741a(fVar, "Connection")) || !"13".equals(m87741a(fVar, "Sec-WebSocket-Version"))) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    private static String m87741a(C23984e eVar, String str) {
        return eVar.mo86144a(str);
    }

    @Override // com.lark.falcon.engine.inspect.p1062a.p1063a.AbstractC23981c
    /* renamed from: a */
    public boolean mo86140a(C24010d dVar, C23985f fVar, C23986g gVar) throws IOException {
        if (!m87743a(fVar)) {
            gVar.f59339c = 501;
            gVar.f59340d = "Not Implemented";
            gVar.f59341e = AbstractC23982d.m87686a("Not a supported WebSocket upgrade request\n", "text/plain");
            return true;
        }
        m87744b(dVar, fVar, gVar);
        return false;
    }

    /* renamed from: b */
    private void m87744b(C24010d dVar, C23985f fVar, C23986g gVar) throws IOException {
        gVar.f59339c = 101;
        gVar.f59340d = "Switching Protocols";
        gVar.mo86146a("Upgrade", "websocket");
        gVar.mo86146a("Connection", "Upgrade");
        gVar.f59341e = null;
        String a = m87741a(fVar, "Sec-WebSocket-Key");
        if (a != null) {
            gVar.mo86146a("Sec-WebSocket-Accept", m87742a(a));
        }
        InputStream a2 = dVar.mo86179a();
        OutputStream b = dVar.mo86180b();
        C23987h.m87702a(gVar, new C23987h.C23991b(new BufferedOutputStream(b)));
        new C24003j(a2, b, this.f59364a).mo86164a();
    }
}
