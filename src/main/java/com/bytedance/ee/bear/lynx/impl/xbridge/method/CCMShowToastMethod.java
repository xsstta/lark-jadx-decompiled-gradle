package com.bytedance.ee.bear.lynx.impl.xbridge.method;

import android.content.Context;
import com.bytedance.ee.bear.facade.common.widget.Toast;
import com.bytedance.ies.xbridge.XBridgePlatformType;
import com.bytedance.ies.xbridge.model.results.XDefaultResultModel;
import com.bytedance.ies.xbridge.ui.base.AbsXShowToastMethod;
import com.bytedance.ies.xbridge.ui.model.XShowToastMethodParamModel;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J \u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0016R\u0014\u0010\u0003\u001a\u00020\u0004XD¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000f"}, d2 = {"Lcom/bytedance/ee/bear/lynx/impl/xbridge/method/CCMShowToastMethod;", "Lcom/bytedance/ies/xbridge/ui/base/AbsXShowToastMethod;", "()V", "name", "", "getName", "()Ljava/lang/String;", "handle", "", "params", "Lcom/bytedance/ies/xbridge/ui/model/XShowToastMethodParamModel;", "callback", "Lcom/bytedance/ies/xbridge/ui/base/AbsXShowToastMethod$XShowToastCallback;", ShareHitPoint.f121869d, "Lcom/bytedance/ies/xbridge/XBridgePlatformType;", "lynx-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.lynx.impl.xbridge.method.f */
public final class CCMShowToastMethod extends AbsXShowToastMethod {

    /* renamed from: a */
    private final String f23823a = "ccm.showToast";

    @Override // com.bytedance.ies.xbridge.XBridgeMethod, com.bytedance.ies.xbridge.ui.base.AbsXShowToastMethod
    /* renamed from: a */
    public String mo33973a() {
        return this.f23823a;
    }

    @Override // com.bytedance.ies.xbridge.ui.base.AbsXShowToastMethod
    /* renamed from: a */
    public void mo33986a(XShowToastMethodParamModel bVar, AbsXShowToastMethod.XShowToastCallback aVar, XBridgePlatformType xBridgePlatformType) {
        Intrinsics.checkParameterIsNotNull(bVar, "params");
        Intrinsics.checkParameterIsNotNull(aVar, "callback");
        Intrinsics.checkParameterIsNotNull(xBridgePlatformType, ShareHitPoint.f121869d);
        Context context = (Context) mo52930a(Context.class);
        int i = 0;
        if (context == null) {
            aVar.mo53189a(0, "context not provided in host");
            return;
        }
        String b = bVar.mo53209b();
        switch (b.hashCode()) {
            case -1867169789:
                if (b.equals("success")) {
                    String a = bVar.mo53206a();
                    Integer c = bVar.mo53211c();
                    if (c != null) {
                        i = c.intValue();
                    }
                    Toast.showSuccessText(context, a, i);
                    break;
                }
                break;
            case -1364013995:
                if (b.equals("center")) {
                    String a2 = bVar.mo53206a();
                    Integer c2 = bVar.mo53211c();
                    if (c2 != null) {
                        i = c2.intValue();
                    }
                    Toast.showCenterToast(context, a2, i);
                    break;
                }
                break;
            case -1039745817:
                if (b.equals("normal")) {
                    String a3 = bVar.mo53206a();
                    Integer c3 = bVar.mo53211c();
                    if (c3 != null) {
                        i = c3.intValue();
                    }
                    Toast.showText(context, a3, i);
                    break;
                }
                break;
            case 3135262:
                if (b.equals("fail")) {
                    String a4 = bVar.mo53206a();
                    Integer c4 = bVar.mo53211c();
                    if (c4 != null) {
                        i = c4.intValue();
                    }
                    Toast.showFailureText(context, a4, i);
                    break;
                }
                break;
        }
        AbsXShowToastMethod.XShowToastCallback.C14454a.m58471a(aVar, new XDefaultResultModel(), null, 2, null);
    }
}
