package com.ss.android.ugc.effectmanager.effect.model;

import com.ss.android.ugc.effectmanager.effect.model.template.EffectQRCodeTemplate;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0011\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004¢\u0006\u0002\u0010\u0005R\u0016\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R$\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t8V@VX\u000e¢\u0006\f\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/ss/android/ugc/effectmanager/effect/model/EffectQRCode;", "Lcom/ss/android/ugc/effectmanager/effect/model/template/EffectQRCodeTemplate;", "Ljava/io/Serializable;", "kQrcode", "Lcom/ss/ugc/effectplatform/model/EffectQRCode;", "(Lcom/ss/ugc/effectplatform/model/EffectQRCode;)V", "getKQrcode", "()Lcom/ss/ugc/effectplatform/model/EffectQRCode;", "value", "", "qrCodeText", "getQrCodeText", "()Ljava/lang/String;", "setQrCodeText", "(Ljava/lang/String;)V", "effectmanager_release"}, mo238835k = 1, mv = {1, 1, 15})
public final class EffectQRCode extends EffectQRCodeTemplate implements Serializable {
    private final transient com.ss.ugc.effectplatform.model.EffectQRCode kQrcode;

    public EffectQRCode() {
        this(null, 1, null);
    }

    @Override // com.ss.android.ugc.effectmanager.effect.model.template.EffectQRCodeTemplate
    public com.ss.ugc.effectplatform.model.EffectQRCode getKQrcode() {
        return this.kQrcode;
    }

    @Override // com.ss.ugc.effectplatform.model.EffectQRCode
    public String getQrCodeText() {
        String qrCodeText;
        com.ss.ugc.effectplatform.model.EffectQRCode kQrcode2 = getKQrcode();
        if (kQrcode2 == null || (qrCodeText = kQrcode2.getQrCodeText()) == null) {
            return super.getQrCodeText();
        }
        return qrCodeText;
    }

    public EffectQRCode(com.ss.ugc.effectplatform.model.EffectQRCode effectQRCode) {
        super(effectQRCode);
        String qrCodeText;
        this.kQrcode = effectQRCode;
        com.ss.ugc.effectplatform.model.EffectQRCode kQrcode2 = getKQrcode();
        if (kQrcode2 != null && (qrCodeText = kQrcode2.getQrCodeText()) != null) {
            super.setQrCodeText(qrCodeText);
        }
    }

    @Override // com.ss.ugc.effectplatform.model.EffectQRCode
    public void setQrCodeText(String str) {
        Intrinsics.checkParameterIsNotNull(str, "value");
        com.ss.ugc.effectplatform.model.EffectQRCode kQrcode2 = getKQrcode();
        if (kQrcode2 != null) {
            kQrcode2.setQrCodeText(str);
        }
        super.setQrCodeText(str);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ EffectQRCode(com.ss.ugc.effectplatform.model.EffectQRCode effectQRCode, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : effectQRCode);
    }
}
