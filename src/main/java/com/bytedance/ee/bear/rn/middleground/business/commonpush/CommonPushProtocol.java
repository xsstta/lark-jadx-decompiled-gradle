package com.bytedance.ee.bear.rn.middleground.business.commonpush;

import com.alibaba.fastjson.JSONObject;
import com.bytedance.ee.bear.rn.middleground.protocol.Protocol;
import com.bytedance.ee.bear.rn.middleground.protocol.Protocol.Body;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b&\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003:\u0002\u0005\u0006B\u0005¢\u0006\u0002\u0010\u0004¨\u0006\u0007"}, d2 = {"Lcom/bytedance/ee/bear/rn/middleground/business/commonpush/CommonPushProtocol;", "T", "Lcom/bytedance/ee/bear/rn/middleground/protocol/Protocol$Body;", "Lcom/bytedance/ee/bear/rn/middleground/protocol/Protocol;", "()V", "BeginSync", "EndSync", "rn-bridge-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.rn.middleground.business.a.a */
public abstract class CommonPushProtocol<T extends Protocol.Body> extends Protocol<T> {

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"Lcom/bytedance/ee/bear/rn/middleground/business/commonpush/CommonPushProtocol$BeginSync;", "Lcom/bytedance/ee/bear/rn/middleground/protocol/Protocol;", "Lcom/bytedance/ee/bear/rn/middleground/protocol/Protocol$Body$Empty;", "()V", "getJsonString", "", "rn-bridge-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.rn.middleground.business.a.a$a */
    public static final class BeginSync extends Protocol<Protocol.Body.Empty> {
        /* renamed from: a */
        public String mo40413a() {
            Protocol.Entity.Identifier c = mo40563c();
            if (c == null) {
                Intrinsics.throwNpe();
            }
            int type = c.getType();
            Protocol.Entity.Identifier c2 = mo40563c();
            if (c2 == null) {
                Intrinsics.throwNpe();
            }
            String jSONString = JSONObject.toJSONString((Object) new Protocol.Entity.Base("common", new Protocol.Entity.Data("beginSync", null, new Protocol.Entity.Identifier(type, c2.getToken(), false, null, 12, null), null, null, 26, null)), true);
            Intrinsics.checkExpressionValueIsNotNull(jSONString, "JSONObject.toJSONString(…    ), true\n            )");
            return jSONString;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"Lcom/bytedance/ee/bear/rn/middleground/business/commonpush/CommonPushProtocol$EndSync;", "Lcom/bytedance/ee/bear/rn/middleground/protocol/Protocol;", "Lcom/bytedance/ee/bear/rn/middleground/protocol/Protocol$Body$Empty;", "()V", "getJsonString", "", "rn-bridge-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.rn.middleground.business.a.a$b */
    public static final class EndSync extends Protocol<Protocol.Body.Empty> {
        /* renamed from: a */
        public String mo40414a() {
            Protocol.Entity.Identifier c = mo40563c();
            if (c == null) {
                Intrinsics.throwNpe();
            }
            int type = c.getType();
            Protocol.Entity.Identifier c2 = mo40563c();
            if (c2 == null) {
                Intrinsics.throwNpe();
            }
            String jSONString = JSONObject.toJSONString((Object) new Protocol.Entity.Base("common", new Protocol.Entity.Data("endSync", null, new Protocol.Entity.Identifier(type, c2.getToken(), false, null, 12, null), null, null, 26, null)), true);
            Intrinsics.checkExpressionValueIsNotNull(jSONString, "JSONObject.toJSONString(…    ), true\n            )");
            return jSONString;
        }
    }
}
