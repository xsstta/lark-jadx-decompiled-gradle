package com.larksuite.component.openplatform.plugins.device.nfc;

import android.nfc.Tag;
import android.nfc.tech.MifareClassic;
import com.ss.android.lark.log.Log;
import java.io.IOException;

/* renamed from: com.larksuite.component.openplatform.plugins.device.nfc.c */
public class C25595c implements AbstractC25594b {

    /* renamed from: a */
    private MifareClassic f62269a;

    /* renamed from: b */
    private Tag f62270b;

    @Override // com.larksuite.component.openplatform.plugins.device.nfc.AbstractC25594b
    /* renamed from: d */
    public byte[] mo88805d() {
        return null;
    }

    @Override // com.larksuite.component.openplatform.plugins.device.nfc.AbstractC25594b
    /* renamed from: e */
    public short mo88806e() {
        return 0;
    }

    @Override // com.larksuite.component.openplatform.plugins.device.nfc.AbstractC25594b
    /* renamed from: f */
    public Tag mo88807f() {
        return this.f62270b;
    }

    @Override // com.larksuite.component.openplatform.plugins.device.nfc.AbstractC25594b
    /* renamed from: c */
    public int mo88804c() {
        return this.f62269a.getMaxTransceiveLength();
    }

    @Override // com.larksuite.component.openplatform.plugins.device.nfc.AbstractC25594b
    /* renamed from: a */
    public boolean mo88801a() {
        try {
            this.f62269a.connect();
            return true;
        } catch (Exception e) {
            Log.m165384e("MifareClassicObject", "mifareClassic connect error", e);
            return false;
        }
    }

    @Override // com.larksuite.component.openplatform.plugins.device.nfc.AbstractC25594b
    /* renamed from: b */
    public boolean mo88803b() {
        try {
            this.f62269a.close();
            return true;
        } catch (IOException e) {
            Log.m165384e("MifareClassicObject", "mifareClassic close error", e);
            return false;
        }
    }

    @Override // com.larksuite.component.openplatform.plugins.device.nfc.AbstractC25594b
    /* renamed from: a */
    public void mo88800a(int i) {
        this.f62269a.setTimeout(i);
    }

    public C25595c(Tag tag) {
        this.f62269a = MifareClassic.get(tag);
        this.f62270b = tag;
    }

    @Override // com.larksuite.component.openplatform.plugins.device.nfc.AbstractC25594b
    /* renamed from: a */
    public byte[] mo88802a(byte[] bArr) {
        try {
            return this.f62269a.transceive(bArr);
        } catch (IOException e) {
            Log.m165384e("MifareClassicObject", "mifareClassic transceive error", e);
            return null;
        }
    }
}
