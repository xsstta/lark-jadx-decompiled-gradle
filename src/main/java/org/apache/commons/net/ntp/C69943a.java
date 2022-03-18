package org.apache.commons.net.ntp;

import com.ss.android.vc.meeting.framework.statemachine.SmActions;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.InetAddress;
import org.apache.commons.net.AbstractC69935a;

/* renamed from: org.apache.commons.net.ntp.a */
public final class C69943a extends AbstractC69935a {

    /* renamed from: e */
    private int f174814e = 3;

    /* renamed from: a */
    public C69946d mo245834a(InetAddress inetAddress) throws IOException {
        return mo245835a(inetAddress, SmActions.ACTION_CALLING_ENTRY);
    }

    /* renamed from: a */
    public C69946d mo245835a(InetAddress inetAddress, int i) throws IOException {
        if (!mo245780b()) {
            mo245778a();
        }
        C69944b bVar = new C69944b();
        bVar.mo245837a(3);
        bVar.mo245840b(this.f174814e);
        DatagramPacket n = bVar.mo245854n();
        n.setAddress(inetAddress);
        n.setPort(i);
        C69944b bVar2 = new C69944b();
        DatagramPacket n2 = bVar2.mo245854n();
        bVar.mo245838a(TimeStamp.getCurrentTime());
        this.f174807b.send(n);
        this.f174807b.receive(n2);
        return new C69946d(bVar2, System.currentTimeMillis(), false);
    }
}
