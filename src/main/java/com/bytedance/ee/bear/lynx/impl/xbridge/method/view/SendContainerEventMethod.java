package com.bytedance.ee.bear.lynx.impl.xbridge.method.view;

import com.bytedance.ee.bear.lynx.api.CCMLynxCardView;
import com.bytedance.ee.bear.lynx.impl.lynxview.CCMLynxViewRecord;
import com.bytedance.ee.bear.lynx.impl.utli.RoutePageUtils;
import com.bytedance.ee.bear.lynx.impl.xbridge.C8846a;
import com.bytedance.ee.bear.lynx.impl.xbridge.method.view.AbsSendContainerEventMethod;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.p701d.C13616d;
import com.bytedance.ies.xbridge.XBridgePlatformType;
import com.bytedance.ies.xbridge.XDynamic;
import com.bytedance.ies.xbridge.XKeyIterator;
import com.bytedance.ies.xbridge.XReadableArray;
import com.bytedance.ies.xbridge.XReadableMap;
import com.bytedance.ies.xbridge.utils.XReadableJSONUtils;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u000b2\u00020\u0001:\u0001\u000bB\u0005¢\u0006\u0002\u0010\u0002J \u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016¨\u0006\f"}, d2 = {"Lcom/bytedance/ee/bear/lynx/impl/xbridge/method/view/SendContainerEventMethod;", "Lcom/bytedance/ee/bear/lynx/impl/xbridge/method/view/AbsSendContainerEventMethod;", "()V", "handle", "", "params", "Lcom/bytedance/ee/bear/lynx/impl/xbridge/method/view/SendEventContainerMethodParamModel;", "callback", "Lcom/bytedance/ee/bear/lynx/impl/xbridge/method/view/AbsSendContainerEventMethod$XSendContainerEventCallback;", ShareHitPoint.f121869d, "Lcom/bytedance/ies/xbridge/XBridgePlatformType;", "Companion", "lynx-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.lynx.impl.xbridge.method.view.b */
public final class SendContainerEventMethod extends AbsSendContainerEventMethod {

    /* renamed from: a */
    public static final Companion f23863a = new Companion(null);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/bytedance/ee/bear/lynx/impl/xbridge/method/view/SendContainerEventMethod$Companion;", "", "()V", "TAG", "", "lynx-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.lynx.impl.xbridge.method.view.b$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // com.bytedance.ee.bear.lynx.impl.xbridge.method.view.AbsSendContainerEventMethod
    /* renamed from: a */
    public void mo34027a(SendEventContainerMethodParamModel sendEventContainerMethodParamModel, AbsSendContainerEventMethod.XSendContainerEventCallback aVar, XBridgePlatformType xBridgePlatformType) {
        XKeyIterator fVar;
        XDynamic i;
        Intrinsics.checkParameterIsNotNull(sendEventContainerMethodParamModel, "params");
        Intrinsics.checkParameterIsNotNull(aVar, "callback");
        Intrinsics.checkParameterIsNotNull(xBridgePlatformType, ShareHitPoint.f121869d);
        String a = sendEventContainerMethodParamModel.mo34020a();
        String b = sendEventContainerMethodParamModel.mo34023b();
        XReadableMap c = sendEventContainerMethodParamModel.mo34025c();
        CCMLynxCardView.LynxViewEventListener aVar2 = null;
        if (c != null) {
            fVar = c.mo53100a();
        } else {
            fVar = null;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (fVar != null) {
            while (fVar.mo53089a()) {
                String b2 = fVar.mo53090b();
                if (!(c == null || (i = c.mo53110i(b2)) == null)) {
                    switch (C8858c.f23864a[i.mo53082a().ordinal()]) {
                        case 1:
                            linkedHashMap.put(b2, String.valueOf(i.mo53083b()));
                            continue;
                        case 2:
                            linkedHashMap.put(b2, String.valueOf(i.mo53085d()));
                            continue;
                        case 3:
                            linkedHashMap.put(b2, C8846a.m37088a(c, b2).toString());
                            continue;
                        case 4:
                            linkedHashMap.put(b2, i.mo53086e());
                            continue;
                        case 5:
                            XReadableMap g = i.mo53088g();
                            if (g != null) {
                                String jSONObject = XReadableJSONUtils.f38087a.mo53181a(g).toString();
                                Intrinsics.checkExpressionValueIsNotNull(jSONObject, "XReadableJSONUtils.xRead…SONObject(map).toString()");
                                linkedHashMap.put(b2, jSONObject);
                                break;
                            } else {
                                continue;
                            }
                        case 6:
                            XReadableArray f = i.mo53087f();
                            if (f != null) {
                                String jSONArray = XReadableJSONUtils.f38087a.mo53180a(f).toString();
                                Intrinsics.checkExpressionValueIsNotNull(jSONArray, "XReadableJSONUtils.xRead…ONArray(array).toString()");
                                linkedHashMap.put(b2, jSONArray);
                                break;
                            } else {
                                continue;
                            }
                        default:
                            if (!C13616d.m55261a()) {
                                C13479a.m54775e("ccm-lynx: SendContainerEventMethod", "event param type unknown");
                                continue;
                            } else {
                                throw new IllegalArgumentException("Illegal level!");
                            }
                    }
                }
            }
        }
        CCMLynxCardView a2 = CCMLynxViewRecord.f23792a.mo33936a(a);
        if (a2 != null) {
            aVar2 = a2.mo33874a();
        }
        switch (b.hashCode()) {
            case -1351902487:
                if (b.equals("onClick")) {
                    if (aVar2 != null) {
                        aVar2.mo16943a(linkedHashMap);
                        return;
                    }
                    return;
                }
                break;
            case -1012968068:
                if (b.equals("onShow")) {
                    if (aVar2 != null) {
                        aVar2.mo16944b();
                        return;
                    }
                    return;
                }
                break;
            case -504772615:
                if (b.equals("openPage")) {
                    String str = linkedHashMap.get("location");
                    if (str != null) {
                        RoutePageUtils.f23776a.mo33926a(str, linkedHashMap);
                        return;
                    }
                    return;
                }
                break;
            case -256129687:
                if (b.equals("closeContainer")) {
                    if (aVar2 != null) {
                        aVar2.mo16942a();
                        return;
                    }
                    return;
                }
                break;
        }
        C13479a.m54775e("ccm-lynx: SendContainerEventMethod", "unknown event");
    }
}
