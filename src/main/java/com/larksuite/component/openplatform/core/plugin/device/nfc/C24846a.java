package com.larksuite.component.openplatform.core.plugin.device.nfc;

import android.nfc.Tag;
import android.nfc.tech.MifareClassic;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.tt.refer.p3400a.p3411h.AbstractC67731b;
import java.io.IOException;

/* renamed from: com.larksuite.component.openplatform.core.plugin.device.nfc.a */
public class C24846a implements AbstractC67731b {

    /* renamed from: a */
    private MifareClassic f60999a;

    /* renamed from: b */
    private Tag f61000b;

    @Override // com.tt.refer.p3400a.p3411h.AbstractC67731b
    /* renamed from: f */
    public byte[] mo87900f() {
        return null;
    }

    @Override // com.tt.refer.p3400a.p3411h.AbstractC67731b
    /* renamed from: g */
    public short mo87901g() {
        return 0;
    }

    @Override // com.tt.refer.p3400a.p3411h.AbstractC67731b
    /* renamed from: a */
    public Tag mo87893a() {
        return this.f61000b;
    }

    @Override // com.tt.refer.p3400a.p3411h.AbstractC67731b
    /* renamed from: d */
    public int mo87898d() {
        return this.f60999a.getMaxTransceiveLength();
    }

    @Override // com.tt.refer.p3400a.p3411h.AbstractC67731b
    /* renamed from: e */
    public boolean mo87899e() {
        return this.f60999a.isConnected();
    }

    @Override // com.tt.refer.p3400a.p3411h.AbstractC67731b
    /* renamed from: b */
    public boolean mo87896b() {
        try {
            this.f60999a.connect();
            return true;
        } catch (Exception e) {
            AppBrandLogger.m52829e("MifareClassicObject", "mifareClassic connect error", e);
            return false;
        }
    }

    @Override // com.tt.refer.p3400a.p3411h.AbstractC67731b
    /* renamed from: c */
    public boolean mo87897c() {
        try {
            this.f60999a.close();
            return true;
        } catch (IOException e) {
            AppBrandLogger.m52829e("MifareClassicObject", "mifareClassic close error", e);
            return false;
        }
    }

    @Override // com.tt.refer.p3400a.p3411h.AbstractC67731b
    /* renamed from: a */
    public void mo87894a(int i) {
        this.f60999a.setTimeout(i);
    }

    public C24846a(Tag tag) {
        this.f60999a = MifareClassic.get(tag);
        this.f61000b = tag;
    }

    @Override // com.tt.refer.p3400a.p3411h.AbstractC67731b
    /* renamed from: a */
    public byte[] mo87895a(byte[] bArr) {
        try {
            AppBrandLogger.m52830i("MifareClassicObject", "nfc isConnected", Boolean.valueOf(this.f60999a.isConnected()));
            if (mo87899e()) {
                return this.f60999a.transceive(bArr);
            }
            return null;
        } catch (IOException e) {
            AppBrandLogger.m52829e("MifareClassicObject", "mifareClassic transceive error", e);
            return null;
        }
    }
}
