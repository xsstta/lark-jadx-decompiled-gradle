package com.bytedance.ee.bear.middleground.permission.collaborator.search.department;

import com.bytedance.ee.bear.contract.NetService;
import com.bytedance.ee.log.C13479a;
import com.google.firebase.messaging.Constants;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u000e2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u000eB\u0005¢\u0006\u0002\u0010\u0003J\u0012\u0010\u0004\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0002J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\nH\u0002¨\u0006\u000f"}, d2 = {"Lcom/bytedance/ee/bear/middleground/permission/collaborator/search/department/DepartmentParser;", "Lcom/bytedance/ee/bear/contract/NetService$Parser;", "Lcom/bytedance/ee/bear/middleground/permission/collaborator/search/department/Department;", "()V", "parse", "json", "", "parseTopUser", "Lcom/bytedance/ee/bear/middleground/permission/collaborator/search/department/VisibleTopUserInDep;", "visibleTopUserJson", "Lorg/json/JSONObject;", "parseVisibleDep", "Lcom/bytedance/ee/bear/middleground/permission/collaborator/search/department/VisibleDepartment;", "visibleDepJson", "Companion", "middleground-permission_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.middleground.permission.collaborator.search.department.d */
public final class DepartmentParser implements NetService.AbstractC5074c<Department> {

    /* renamed from: a */
    public static final Companion f26707a = new Companion(null);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/bytedance/ee/bear/middleground/permission/collaborator/search/department/DepartmentParser$Companion;", "", "()V", "TAG", "", "middleground-permission_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.permission.collaborator.search.department.d$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: a */
    private final VisibleDepartment m41011a(JSONObject jSONObject) {
        String optString = jSONObject.optString("department_id");
        String optString2 = jSONObject.optString("name");
        String optString3 = jSONObject.optString("avatar");
        Intrinsics.checkExpressionValueIsNotNull(optString, "depId");
        Intrinsics.checkExpressionValueIsNotNull(optString2, "depName");
        Intrinsics.checkExpressionValueIsNotNull(optString3, "depAvatar");
        return new VisibleDepartment(optString, optString2, optString3);
    }

    /* renamed from: b */
    private final VisibleTopUserInDep m41012b(JSONObject jSONObject) {
        String optString = jSONObject.optString("user_id");
        String optString2 = jSONObject.optString("user_name");
        String optString3 = jSONObject.optString("avatar");
        Intrinsics.checkExpressionValueIsNotNull(optString, "userId");
        Intrinsics.checkExpressionValueIsNotNull(optString2, "userName");
        Intrinsics.checkExpressionValueIsNotNull(optString3, "userAvatar");
        return new VisibleTopUserInDep(optString, optString2, optString3);
    }

    /* renamed from: a */
    public Department parse(String str) {
        Department department = new Department(null, null, false, null, 15, null);
        try {
            JSONObject optJSONObject = new JSONObject(str).optJSONObject(Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
            JSONArray optJSONArray = optJSONObject.optJSONArray("visible_departments");
            ArrayList<VisibleDepartment> arrayList = new ArrayList<>();
            int length = optJSONArray.length();
            for (int i = 0; i < length; i++) {
                JSONObject optJSONObject2 = optJSONArray.optJSONObject(i);
                Intrinsics.checkExpressionValueIsNotNull(optJSONObject2, "visibleDepJson");
                arrayList.add(m41011a(optJSONObject2));
            }
            department.setVisibleDepartments(arrayList);
            JSONArray optJSONArray2 = optJSONObject.optJSONArray("visible_top_users_of_dep");
            ArrayList<VisibleTopUserInDep> arrayList2 = new ArrayList<>();
            int length2 = optJSONArray2.length();
            for (int i2 = 0; i2 < length2; i2++) {
                JSONObject optJSONObject3 = optJSONArray2.optJSONObject(i2);
                Intrinsics.checkExpressionValueIsNotNull(optJSONObject3, "visibleTopUserJson");
                arrayList2.add(m41012b(optJSONObject3));
            }
            department.setVisibleTopUserInDep(arrayList2);
            department.setHasMore(optJSONObject.optBoolean("has_more"));
        } catch (Throwable th) {
            C13479a.m54759a("DepartmentParser", "parse error", th);
        }
        return department;
    }
}
