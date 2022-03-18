package org.apache.commons.net;

import java.net.DatagramSocket;
import java.net.SocketException;
import java.nio.charset.Charset;

/* renamed from: org.apache.commons.net.a */
public abstract class AbstractC69935a {

    /* renamed from: e */
    private static final AbstractC69936b f174805e = new C69937c();

    /* renamed from: a */
    protected int f174806a = 0;

    /* renamed from: b */
    protected DatagramSocket f174807b = null;

    /* renamed from: c */
    protected boolean f174808c = false;

    /* renamed from: d */
    protected AbstractC69936b f174809d = f174805e;

    /* renamed from: f */
    private Charset f174810f = Charset.defaultCharset();

    /* renamed from: b */
    public boolean mo245780b() {
        return this.f174808c;
    }

    /* renamed from: a */
    public void mo245778a() throws SocketException {
        DatagramSocket a = this.f174809d.mo245781a();
        this.f174807b = a;
        a.setSoTimeout(this.f174806a);
        this.f174808c = true;
    }

    /* renamed from: a */
    public void mo245779a(int i) {
        this.f174806a = i;
    }
}
