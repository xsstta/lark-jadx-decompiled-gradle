package com.google.zxing.qrcode.p1003a;

import com.google.zxing.qrcode.decoder.C23224a;
import com.google.zxing.qrcode.decoder.ErrorCorrectionLevel;
import com.google.zxing.qrcode.decoder.Mode;
import com.huawei.hms.location.LocationRequest;

/* renamed from: com.google.zxing.qrcode.a.f */
public final class C23222f {

    /* renamed from: a */
    private Mode f57270a;

    /* renamed from: b */
    private ErrorCorrectionLevel f57271b;

    /* renamed from: c */
    private C23224a f57272c;

    /* renamed from: d */
    private int f57273d = -1;

    /* renamed from: e */
    private C23217b f57274e;

    /* renamed from: b */
    public static boolean m84138b(int i) {
        return i >= 0 && i < 8;
    }

    /* renamed from: a */
    public C23217b mo80535a() {
        return this.f57274e;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder((int) LocationRequest.PRIORITY_HD_ACCURACY);
        sb.append("<<\n");
        sb.append(" mode: ");
        sb.append(this.f57270a);
        sb.append("\n ecLevel: ");
        sb.append(this.f57271b);
        sb.append("\n version: ");
        sb.append(this.f57272c);
        sb.append("\n maskPattern: ");
        sb.append(this.f57273d);
        if (this.f57274e == null) {
            sb.append("\n matrix: null\n");
        } else {
            sb.append("\n matrix:\n");
            sb.append(this.f57274e);
        }
        sb.append(">>\n");
        return sb.toString();
    }

    /* renamed from: a */
    public void mo80536a(int i) {
        this.f57273d = i;
    }

    /* renamed from: a */
    public void mo80537a(C23217b bVar) {
        this.f57274e = bVar;
    }

    /* renamed from: a */
    public void mo80538a(ErrorCorrectionLevel errorCorrectionLevel) {
        this.f57271b = errorCorrectionLevel;
    }

    /* renamed from: a */
    public void mo80539a(Mode mode) {
        this.f57270a = mode;
    }

    /* renamed from: a */
    public void mo80540a(C23224a aVar) {
        this.f57272c = aVar;
    }
}
