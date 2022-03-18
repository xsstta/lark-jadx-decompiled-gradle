package com.larksuite.component.openplatform.core.plugin.device.nfc;

import android.nfc.Tag;
import android.nfc.tech.NfcA;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.tt.refer.p3400a.p3411h.AbstractC67731b;
import java.io.IOException;

/* renamed from: com.larksuite.component.openplatform.core.plugin.device.nfc.n */
public class C24864n implements AbstractC67731b {

    /* renamed from: a */
    private NfcA f61019a;

    /* renamed from: b */
    private Tag f61020b;

    @Override // com.tt.refer.p3400a.p3411h.AbstractC67731b
    /* renamed from: a */
    public Tag mo87893a() {
        return this.f61020b;
    }

    @Override // com.tt.refer.p3400a.p3411h.AbstractC67731b
    /* renamed from: d */
    public int mo87898d() {
        return this.f61019a.getMaxTransceiveLength();
    }

    @Override // com.tt.refer.p3400a.p3411h.AbstractC67731b
    /* renamed from: e */
    public boolean mo87899e() {
        return this.f61019a.isConnected();
    }

    @Override // com.tt.refer.p3400a.p3411h.AbstractC67731b
    /* renamed from: g */
    public short mo87901g() {
        return this.f61019a.getSak();
    }

    @Override // com.tt.refer.p3400a.p3411h.AbstractC67731b
    /* renamed from: b */
    public boolean mo87896b() {
        try {
            this.f61019a.connect();
            return true;
        } catch (Exception e) {
            AppBrandLogger.m52829e("NfcaObject", "nfca connect error", e);
            return false;
        }
    }

    @Override // com.tt.refer.p3400a.p3411h.AbstractC67731b
    /* renamed from: c */
    public boolean mo87897c() {
        try {
            this.f61019a.close();
            return true;
        } catch (IOException e) {
            AppBrandLogger.m52829e("NfcaObject", "nfca close error", e);
            return false;
        }
    }

    @Override // com.tt.refer.p3400a.p3411h.AbstractC67731b
    /* renamed from: f */
    public byte[] mo87900f() {
        try {
            return this.f61019a.getAtqa();
        } catch (RuntimeException e) {
            AppBrandLogger.m52829e("NfcaObject", "nfca getAtqa error", e);
            return null;
        }
    }

    @Override // com.tt.refer.p3400a.p3411h.AbstractC67731b
    /* renamed from: a */
    public void mo87894a(int i) {
        this.f61019a.setTimeout(i);
    }

    public C24864n(Tag tag) {
        this.f61019a = NfcA.get(tag);
        this.f61020b = tag;
    }

    @Override // com.tt.refer.p3400a.p3411h.AbstractC67731b
    /* renamed from: a */
    public byte[] mo87895a(byte[] bArr) {
        try {
            AppBrandLogger.m52830i("NfcaObject", "nfc isConnected", Boolean.valueOf(this.f61019a.isConnected()));
            if (mo87899e()) {
                return this.f61019a.transceive(bArr);
            }
            return null;
        } catch (IOException e) {
            AppBrandLogger.m52829e("NfcaObject", "nfca transceive error", e);
            return null;
        }
    }
}
