package com.bytedance.ee.bear.list.ownertype;

import com.bytedance.ee.bear.contract.NetService;
import com.bytedance.ee.log.C13479a;
import com.google.firebase.messaging.Constants;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\u0018\u0000 \u000e2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u000eB\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u0012\u0010\f\u001a\u00020\u00022\b\u0010\r\u001a\u0004\u0018\u00010\u0006H\u0016R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u000f"}, d2 = {"Lcom/bytedance/ee/bear/list/ownertype/OwnerTypeParser;", "Lcom/bytedance/ee/bear/contract/NetService$Parser;", "Lcom/bytedance/ee/bear/list/ownertype/OwnerType;", ShareHitPoint.f121869d, "", "objToken", "", "(ILjava/lang/String;)V", "getObjToken", "()Ljava/lang/String;", "getType", "()I", "parse", "json", "Companion", "list_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.list.ownertype.b */
public final class OwnerTypeParser implements NetService.AbstractC5074c<OwnerType> {

    /* renamed from: a */
    public static final Companion f23449a = new Companion(null);

    /* renamed from: b */
    private final int f23450b;

    /* renamed from: c */
    private final String f23451c;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/bytedance/ee/bear/list/ownertype/OwnerTypeParser$Companion;", "", "()V", "TAG", "", "list_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.list.ownertype.b$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: a */
    public OwnerType parse(String str) {
        boolean z;
        JSONObject jSONObject;
        int i;
        String str2 = str;
        if (str2 == null || str2.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return new OwnerType(0);
        }
        try {
            JSONObject optJSONObject = new JSONObject(str).optJSONObject(Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
            if (optJSONObject != null) {
                jSONObject = optJSONObject.optJSONObject(this.f23451c);
            } else {
                jSONObject = null;
            }
            if (jSONObject != null) {
                i = jSONObject.optInt("owner_type");
            } else {
                i = 0;
            }
            return new OwnerType(i);
        } catch (Throwable th) {
            C13479a.m54761a("OwnerTypeParser", th);
            return new OwnerType(0);
        }
    }

    public OwnerTypeParser(int i, String str) {
        Intrinsics.checkParameterIsNotNull(str, "objToken");
        this.f23450b = i;
        this.f23451c = str;
    }
}
