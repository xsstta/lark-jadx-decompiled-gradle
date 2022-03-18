package com.tt.miniapp.msg;

import com.google.firebase.messaging.Constants;
import com.larksuite.component.openplatform.core.utils.C25527b;
import com.larksuite.framework.apiplugin.entity.LKBasePluginResult;
import com.tt.frontendapiinterface.IApiInputParam;
import com.tt.miniapp.p3324r.p3325a.C66709e;
import com.tt.refer.p3400a.p3401a.p3402a.C67704c;
import java.nio.ByteBuffer;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001a\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007¨\u0006\t"}, d2 = {"Lcom/tt/miniapp/msg/WebAppApiParamParser;", "", "()V", "parse", "Lcom/tt/frontendapiinterface/IApiInputParam;", "eventName", "", "context", "Lcom/tt/refer/abs/api/entity/APIInvokeParam;", "miniapp_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.tt.miniapp.r.e */
public final class WebAppApiParamParser {

    /* renamed from: a */
    public static final WebAppApiParamParser f168433a = new WebAppApiParamParser();

    private WebAppApiParamParser() {
    }

    @JvmStatic
    /* renamed from: a */
    public static final IApiInputParam m260522a(String str, C67704c cVar) {
        String str2;
        Intrinsics.checkParameterIsNotNull(str, "eventName");
        Intrinsics.checkParameterIsNotNull(cVar, "context");
        T t = null;
        if (str.hashCode() != -1406748165 || !str.equals("writeFile")) {
            return null;
        }
        String str3 = (String) cVar.mo234997a("filePath");
        Object a = cVar.mo234997a(Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
        if (a instanceof String) {
            str2 = (String) a;
        } else {
            str2 = "";
        }
        String str4 = (String) cVar.mo234997a("encoding");
        LKBasePluginResult.AbstractC25940a.C25941a<ByteBuffer> a2 = C25527b.m91119a(cVar);
        if (a2 != null) {
            t = a2.f64249b;
        }
        return new C66709e.C66710a(str3, str4, str2, t);
    }
}
