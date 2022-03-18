package com.bytedance.ee.bear.lynx.impl.xbridge.method.fg;

import com.bytedance.ies.xbridge.C14434d;
import com.bytedance.ies.xbridge.XReadableArray;
import com.bytedance.ies.xbridge.XReadableMap;
import com.bytedance.ies.xbridge.model.params.XBaseParamModel;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0007\u0018\u0000 \u000b2\u00020\u0001:\u0001\u000bB\u0005¢\u0006\u0002\u0010\u0002J\u000e\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0016R \u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\t¨\u0006\f"}, d2 = {"Lcom/bytedance/ee/bear/lynx/impl/xbridge/method/fg/CCMGetFgMethodParam;", "Lcom/bytedance/ies/xbridge/model/params/XBaseParamModel;", "()V", "keys", "", "", "getKeys", "()Ljava/util/List;", "setKeys", "(Ljava/util/List;)V", "provideParamList", "Companion", "lynx-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.lynx.impl.xbridge.method.a.b */
public final class CCMGetFgMethodParam extends XBaseParamModel {

    /* renamed from: b */
    public static final Companion f23816b = new Companion(null);

    /* renamed from: a */
    public List<String> f23817a;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007¨\u0006\u0007"}, d2 = {"Lcom/bytedance/ee/bear/lynx/impl/xbridge/method/fg/CCMGetFgMethodParam$Companion;", "", "()V", "convert", "Lcom/bytedance/ee/bear/lynx/impl/xbridge/method/fg/CCMGetFgMethodParam;", "params", "Lcom/bytedance/ies/xbridge/XReadableMap;", "lynx-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.lynx.impl.xbridge.method.a.b$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        /* renamed from: a */
        public final CCMGetFgMethodParam mo33978a(XReadableMap hVar) {
            Intrinsics.checkParameterIsNotNull(hVar, "params");
            XReadableArray a = C14434d.m58262a(hVar, "keys", (XReadableArray) null, 2, (Object) null);
            if (a == null || a.mo53091a() <= 0) {
                return null;
            }
            CCMGetFgMethodParam bVar = new CCMGetFgMethodParam();
            ArrayList arrayList = new ArrayList();
            int a2 = a.mo53091a();
            for (int i = 0; i < a2; i++) {
                arrayList.add(a.mo53096d(i));
            }
            bVar.mo33977a(arrayList);
            return bVar;
        }
    }

    /* renamed from: a */
    public final List<String> mo33976a() {
        List<String> list = this.f23817a;
        if (list == null) {
            Intrinsics.throwUninitializedPropertyAccessException("keys");
        }
        return list;
    }

    /* renamed from: a */
    public final void mo33977a(List<String> list) {
        Intrinsics.checkParameterIsNotNull(list, "<set-?>");
        this.f23817a = list;
    }
}
