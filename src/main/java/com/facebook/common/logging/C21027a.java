package com.facebook.common.logging;

import android.util.Log;
import java.io.PrintWriter;
import java.io.StringWriter;

/* renamed from: com.facebook.common.logging.a */
public class C21027a implements AbstractC21028b {

    /* renamed from: a */
    public static final C21027a f51415a = new C21027a();

    /* renamed from: b */
    private String f51416b = "unknown";

    /* renamed from: c */
    private int f51417c = 5;

    /* renamed from: a */
    public static C21027a m76618a() {
        return f51415a;
    }

    @Override // com.facebook.common.logging.AbstractC21028b
    /* renamed from: b */
    public int mo71253b() {
        return this.f51417c;
    }

    private C21027a() {
    }

    /* renamed from: a */
    private String m76619a(String str) {
        if (this.f51416b == null) {
            return str;
        }
        return this.f51416b + ":" + str;
    }

    @Override // com.facebook.common.logging.AbstractC21028b
    /* renamed from: b */
    public boolean mo71256b(int i) {
        if (this.f51417c <= i) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    private static String m76621a(Throwable th) {
        if (th == null) {
            return "";
        }
        StringWriter stringWriter = new StringWriter();
        th.printStackTrace(new PrintWriter(stringWriter));
        return stringWriter.toString();
    }

    @Override // com.facebook.common.logging.AbstractC21028b
    /* renamed from: a */
    public void mo71250a(int i) {
        this.f51417c = i;
    }

    @Override // com.facebook.common.logging.AbstractC21028b
    /* renamed from: b */
    public void mo71254b(String str, String str2) {
        m76622a(3, str, str2);
    }

    @Override // com.facebook.common.logging.AbstractC21028b
    /* renamed from: c */
    public void mo71257c(String str, String str2) {
        m76622a(4, str, str2);
    }

    @Override // com.facebook.common.logging.AbstractC21028b
    /* renamed from: d */
    public void mo71259d(String str, String str2) {
        m76622a(5, str, str2);
    }

    @Override // com.facebook.common.logging.AbstractC21028b
    /* renamed from: e */
    public void mo71261e(String str, String str2) {
        m76622a(6, str, str2);
    }

    @Override // com.facebook.common.logging.AbstractC21028b
    /* renamed from: f */
    public void mo71263f(String str, String str2) {
        m76622a(6, str, str2);
    }

    /* renamed from: a */
    private static String m76620a(String str, Throwable th) {
        return str + '\n' + m76621a(th);
    }

    @Override // com.facebook.common.logging.AbstractC21028b
    /* renamed from: a */
    public void mo71251a(String str, String str2) {
        m76622a(2, str, str2);
    }

    /* renamed from: a */
    private void m76622a(int i, String str, String str2) {
        Log.println(i, m76619a(str), str2);
    }

    @Override // com.facebook.common.logging.AbstractC21028b
    /* renamed from: b */
    public void mo71255b(String str, String str2, Throwable th) {
        m76623a(3, str, str2, th);
    }

    @Override // com.facebook.common.logging.AbstractC21028b
    /* renamed from: c */
    public void mo71258c(String str, String str2, Throwable th) {
        m76623a(4, str, str2, th);
    }

    @Override // com.facebook.common.logging.AbstractC21028b
    /* renamed from: d */
    public void mo71260d(String str, String str2, Throwable th) {
        m76623a(5, str, str2, th);
    }

    @Override // com.facebook.common.logging.AbstractC21028b
    /* renamed from: e */
    public void mo71262e(String str, String str2, Throwable th) {
        m76623a(6, str, str2, th);
    }

    @Override // com.facebook.common.logging.AbstractC21028b
    /* renamed from: f */
    public void mo71264f(String str, String str2, Throwable th) {
        m76623a(6, str, str2, th);
    }

    @Override // com.facebook.common.logging.AbstractC21028b
    /* renamed from: a */
    public void mo71252a(String str, String str2, Throwable th) {
        m76623a(2, str, str2, th);
    }

    /* renamed from: a */
    private void m76623a(int i, String str, String str2, Throwable th) {
        Log.println(i, m76619a(str), m76620a(str2, th));
    }
}
