package com.tt.miniapp.jsbridge;

import com.larksuite.framework.apiplugin.LKEvent;
import com.ss.android.lark.opmonitor.trace.OPTrace;
import com.tt.frontendapiinterface.IApiInputParam;
import com.tt.option.ext.AbstractC67619e;

/* renamed from: com.tt.miniapp.jsbridge.h */
public class C66254h {

    /* renamed from: a */
    public String f167222a;

    /* renamed from: b */
    public String f167223b;

    /* renamed from: c */
    public int f167224c;

    /* renamed from: d */
    public AbstractC67619e f167225d;

    /* renamed from: e */
    public IApiInputParam f167226e;

    /* renamed from: f */
    public Runnable f167227f;

    /* renamed from: g */
    public LKEvent f167228g;

    /* renamed from: h */
    public boolean f167229h;

    /* renamed from: i */
    public OPTrace f167230i;

    public C66254h(Runnable runnable, LKEvent lKEvent, boolean z) {
        this.f167227f = runnable;
        this.f167228g = lKEvent;
        this.f167229h = z;
    }

    public C66254h(String str, IApiInputParam iApiInputParam, int i) {
        this.f167222a = str;
        this.f167226e = iApiInputParam;
        this.f167224c = i;
    }

    public C66254h(String str, Runnable runnable, OPTrace oPTrace, boolean z) {
        this.f167222a = str;
        this.f167227f = runnable;
        this.f167230i = oPTrace;
        this.f167229h = z;
    }

    public C66254h(String str, String str2, int i, AbstractC67619e eVar) {
        this.f167222a = str;
        this.f167223b = str2;
        this.f167224c = i;
        this.f167225d = eVar;
    }
}
