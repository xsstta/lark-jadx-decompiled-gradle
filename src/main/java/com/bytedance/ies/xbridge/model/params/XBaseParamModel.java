package com.bytedance.ies.xbridge.model.params;

import com.bytedance.ies.xbridge.XReadableMap;
import com.bytedance.ies.xbridge.XReadableType;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\b&\u0018\u0000 \u00062\u00020\u0001:\u0001\u0006B\u0005¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0016¨\u0006\u0007"}, d2 = {"Lcom/bytedance/ies/xbridge/model/params/XBaseParamModel;", "", "()V", "provideParamList", "", "", "Companion", "x-bridge-core-api_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.bytedance.ies.xbridge.d.c.a */
public abstract class XBaseParamModel {

    /* renamed from: e */
    public static final Companion f38030e = new Companion(null);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001d\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\u001e\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000bJ'\u0010\r\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\f\u001a\u00020\u000e¢\u0006\u0002\u0010\u000f¨\u0006\u0010"}, d2 = {"Lcom/bytedance/ies/xbridge/model/params/XBaseParamModel$Companion;", "", "()V", "getBooleanValue", "", "params", "Lcom/bytedance/ies/xbridge/XReadableMap;", "name", "", "(Lcom/bytedance/ies/xbridge/XReadableMap;Ljava/lang/String;)Ljava/lang/Boolean;", "getIntValue", "", "defaultValue", "getLongValue", "", "(Lcom/bytedance/ies/xbridge/XReadableMap;Ljava/lang/String;J)Ljava/lang/Long;", "x-bridge-core-api_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.bytedance.ies.xbridge.d.c.a$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final Boolean mo53119a(XReadableMap hVar, String str) {
            Intrinsics.checkParameterIsNotNull(hVar, "params");
            Intrinsics.checkParameterIsNotNull(str, "name");
            if (hVar.mo53110i(str).mo53082a() == XReadableType.Boolean) {
                return Boolean.valueOf(hVar.mo53104c(str));
            }
            return null;
        }
    }
}
