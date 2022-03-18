package com.larksuite.component.openplatform.plugins.device.nfc;

import android.nfc.Tag;
import android.nfc.tech.NfcA;
import com.ss.android.lark.log.Log;
import java.io.IOException;

/* renamed from: com.larksuite.component.openplatform.plugins.device.nfc.g */
public class C25602g implements AbstractC25594b {

    /* renamed from: a */
    private NfcA f62283a;

    /* renamed from: b */
    private Tag f62284b;

    @Override // com.larksuite.component.openplatform.plugins.device.nfc.AbstractC25594b
    /* renamed from: f */
    public Tag mo88807f() {
        return this.f62284b;
    }

    @Override // com.larksuite.component.openplatform.plugins.device.nfc.AbstractC25594b
    /* renamed from: c */
    public int mo88804c() {
        return this.f62283a.getMaxTransceiveLength();
    }

    @Override // com.larksuite.component.openplatform.plugins.device.nfc.AbstractC25594b
    /* renamed from: e */
    public short mo88806e() {
        return this.f62283a.getSak();
    }

    @Override // com.larksuite.component.openplatform.plugins.device.nfc.AbstractC25594b
    /* renamed from: a */
    public boolean mo88801a() {
        try {
            this.f62283a.connect();
            return true;
        } catch (Exception e) {
            Log.m165384e("NfcaObject", "nfca connect error", e);
            return false;
        }
    }

    @Override // com.larksuite.component.openplatform.plugins.device.nfc.AbstractC25594b
    /* renamed from: b */
    public boolean mo88803b() {
        try {
            this.f62283a.close();
            return true;
        } catch (IOException e) {
            Log.m165384e("NfcaObject", "nfca close error", e);
            return false;
        }
    }

    @Override // com.larksuite.component.openplatform.plugins.device.nfc.AbstractC25594b
    /* renamed from: d */
    public byte[] mo88805d() {
        try {
            return this.f62283a.getAtqa();
        } catch (RuntimeException e) {
            Log.m165384e("NfcaObject", "nfca getAtqa error", e);
            return null;
        }
    }

    @Override // com.larksuite.component.openplatform.plugins.device.nfc.AbstractC25594b
    /* renamed from: a */
    public void mo88800a(int i) {
        this.f62283a.setTimeout(i);
    }

    public C25602g(Tag tag) {
        this.f62283a = NfcA.get(tag);
        this.f62284b = tag;
    }

    @Override // com.larksuite.component.openplatform.plugins.device.nfc.AbstractC25594b
    /* renamed from: a */
    public byte[] mo88802a(byte[] bArr) {
        try {
            return this.f62283a.transceive(bArr);
        } catch (IOException e) {
            Log.m165384e("NfcaObject", "nfca transceive error", e);
            return null;
        }
    }
}
