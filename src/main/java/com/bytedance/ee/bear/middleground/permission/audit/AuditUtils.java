package com.bytedance.ee.bear.middleground.permission.audit;

import com.bytedance.ee.bear.list.dto.C8275a;
import com.bytedance.ee.log.C13479a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;
import org.koin.java.KoinJavaComponent;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u000e\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J'\u0010\b\u001a\u00020\u00042\b\u0010\t\u001a\u0004\u0018\u00010\n2\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\u0002\u0010\u000eJ'\u0010\u000f\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\n2\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\u0002\u0010\u0010J\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012¨\u0006\u0013"}, d2 = {"Lcom/bytedance/ee/bear/middleground/permission/audit/AuditUtils;", "", "()V", "documentModuleType", "", "docType", "Lcom/bytedance/ee/bear/list/dto/DocumentType;", "documentObjectType", "driveObjectType", "appId", "", "appFileId", "localFile", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)I", "driveObjectValue", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)Ljava/lang/String;", "getAuditManager", "Lcom/bytedance/ee/bear/middleground/permission/audit/IAuditManager;", "middleground-permission_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.middleground.permission.d.c */
public final class AuditUtils {

    /* renamed from: a */
    public static final AuditUtils f26792a = new AuditUtils();

    private AuditUtils() {
    }

    /* renamed from: a */
    public final AbstractC9901d mo37711a() {
        try {
            return (AbstractC9901d) KoinJavaComponent.m268613a(AbstractC9901d.class, null, null, 6, null);
        } catch (Exception e) {
            C13479a.m54758a("AuditApiImpl", "doAudit fail. auditManager not found. err: " + e);
            return null;
        }
    }

    /* renamed from: a */
    public final int mo37709a(C8275a aVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "docType");
        if (Intrinsics.areEqual(aVar, C8275a.f22371d)) {
            return 5;
        }
        if (Intrinsics.areEqual(aVar, C8275a.f22372e)) {
            return 6;
        }
        if (Intrinsics.areEqual(aVar, C8275a.f22375h)) {
            return 7;
        }
        if (Intrinsics.areEqual(aVar, C8275a.f22370c)) {
            return 8;
        }
        if (Intrinsics.areEqual(aVar, C8275a.f22374g)) {
            return 9;
        }
        if (Intrinsics.areEqual(aVar, C8275a.f22376i)) {
            return 11;
        }
        if (Intrinsics.areEqual(aVar, C8275a.f22373f)) {
            return 10;
        }
        if (Intrinsics.areEqual(aVar, C8275a.f22378k)) {
            return 31;
        }
        return 0;
    }

    /* renamed from: b */
    public final int mo37712b(C8275a aVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "docType");
        if (Intrinsics.areEqual(aVar, C8275a.f22371d)) {
            return 1;
        }
        if (Intrinsics.areEqual(aVar, C8275a.f22372e)) {
            return 2;
        }
        if (Intrinsics.areEqual(aVar, C8275a.f22375h)) {
            return 3;
        }
        if (Intrinsics.areEqual(aVar, C8275a.f22370c)) {
            return 4;
        }
        if (Intrinsics.areEqual(aVar, C8275a.f22374g)) {
            return 6;
        }
        if (Intrinsics.areEqual(aVar, C8275a.f22376i)) {
            return 8;
        }
        if (Intrinsics.areEqual(aVar, C8275a.f22373f)) {
            return 7;
        }
        if (Intrinsics.areEqual(aVar, C8275a.f22378k)) {
            return 19;
        }
        return 0;
    }

    /* renamed from: a */
    public final int mo37710a(String str, String str2, Boolean bool) {
        boolean z;
        Intrinsics.checkParameterIsNotNull(str2, "appFileId");
        boolean z2 = false;
        if (bool != null) {
            z = bool.booleanValue();
        } else {
            z = false;
        }
        if (z) {
            return 21;
        }
        String str3 = str;
        if (str3 == null || str3.length() == 0) {
            z2 = true;
        }
        if (z2) {
            return 7;
        }
        return 14;
    }

    /* renamed from: b */
    public final String mo37713b(String str, String str2, Boolean bool) {
        boolean z;
        Intrinsics.checkParameterIsNotNull(str2, "appFileId");
        String str3 = str;
        if (str3 == null || str3.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return str2;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("app_id", str);
        jSONObject.put("app_file_id", str2);
        String jSONObject2 = jSONObject.toString();
        Intrinsics.checkExpressionValueIsNotNull(jSONObject2, "JSONObject().apply {\n   …\n            }.toString()");
        return jSONObject2;
    }
}
