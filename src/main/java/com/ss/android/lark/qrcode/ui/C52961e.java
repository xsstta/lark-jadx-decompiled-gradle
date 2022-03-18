package com.ss.android.lark.qrcode.ui;

import android.content.Intent;
import com.google.zxing.BarcodeFormat;
import com.ss.android.lark.qrcode.QRCodeModule;
import com.ss.android.lark.qrcode.p2553a.AbstractC52938a;
import com.ss.android.lark.qrcode.ui.C52945b;
import java.util.ArrayList;

/* renamed from: com.ss.android.lark.qrcode.ui.e */
public class C52961e implements C52945b.AbstractC52946a {

    /* renamed from: a */
    AbstractC52938a f130846a;

    /* renamed from: b */
    private BarcodeFormat[] f130847b;

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void create() {
    }

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void destroy() {
    }

    @Override // com.ss.android.lark.qrcode.ui.C52945b.AbstractC52946a
    /* renamed from: a */
    public BarcodeFormat[] mo180906a() {
        return this.f130847b;
    }

    public C52961e(Intent intent) {
        AbstractC52938a b = QRCodeModule.m204933b();
        this.f130846a = b;
        b.mo178100a();
        ArrayList arrayList = new ArrayList();
        if (intent != null) {
            int[] intArrayExtra = intent.getIntArrayExtra("key_code_format");
            if (intArrayExtra == null) {
                arrayList.add(BarcodeFormat.QR_CODE);
            } else {
                for (int i = 0; i < intArrayExtra.length; i++) {
                    if (intArrayExtra[i] == 0) {
                        arrayList.add(BarcodeFormat.QR_CODE);
                    } else if (intArrayExtra[i] == 1) {
                        arrayList.add(BarcodeFormat.EAN_8);
                        arrayList.add(BarcodeFormat.EAN_13);
                        arrayList.add(BarcodeFormat.UPC_EAN_EXTENSION);
                        arrayList.add(BarcodeFormat.CODE_39);
                        arrayList.add(BarcodeFormat.CODE_93);
                        arrayList.add(BarcodeFormat.CODE_128);
                        arrayList.add(BarcodeFormat.CODABAR);
                    }
                }
            }
        }
        this.f130847b = (BarcodeFormat[]) arrayList.toArray(new BarcodeFormat[0]);
    }
}
