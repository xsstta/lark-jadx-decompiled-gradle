package com.bytedance.ee.bear.bitable.pro;

import android.text.TextUtils;
import com.bytedance.ee.bear.TableSimpleInfo;
import com.bytedance.ee.bear.contract.NetService;
import com.bytedance.ee.bear.share.export.UserInfo;
import com.bytedance.ee.log.C13479a;
import com.google.firebase.messaging.Constants;
import com.ss.android.vc.meeting.framework.statemachine.SmActions;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001d\u0012\u0016\u0010\u0003\u001a\u0012\u0012\u0004\u0012\u00020\u00050\u0004j\b\u0012\u0004\u0012\u00020\u0005`\u0006¢\u0006\u0002\u0010\u0007J\u0010\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\tH\u0002J*\u0010\f\u001a\u0004\u0018\u00010\r2\u0016\u0010\u000e\u001a\u0012\u0012\u0004\u0012\u00020\r0\u0004j\b\u0012\u0004\u0012\u00020\r`\u00062\u0006\u0010\u000f\u001a\u00020\tH\u0002J\u0012\u0010\u0010\u001a\u00020\u00022\b\u0010\u0011\u001a\u0004\u0018\u00010\tH\u0016J(\u0010\u0012\u001a\u0012\u0012\u0004\u0012\u00020\u00130\u0004j\b\u0012\u0004\u0012\u00020\u0013`\u00062\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\tH\u0002J \u0010\u0017\u001a\u0012\u0012\u0004\u0012\u00020\u00130\u0004j\b\u0012\u0004\u0012\u00020\u0013`\u00062\u0006\u0010\u0018\u001a\u00020\u0019H\u0002J \u0010\u001a\u001a\u0012\u0012\u0004\u0012\u00020\r0\u0004j\b\u0012\u0004\u0012\u00020\r`\u00062\u0006\u0010\u001b\u001a\u00020\u0015H\u0002J0\u0010\u001c\u001a\u0012\u0012\u0004\u0012\u00020\r0\u0004j\b\u0012\u0004\u0012\u00020\r`\u00062\u0016\u0010\u000e\u001a\u0012\u0012\u0004\u0012\u00020\r0\u0004j\b\u0012\u0004\u0012\u00020\r`\u0006H\u0002R\u000e\u0010\b\u001a\u00020\tXD¢\u0006\u0002\n\u0000R\u001e\u0010\u0003\u001a\u0012\u0012\u0004\u0012\u00020\u00050\u0004j\b\u0012\u0004\u0012\u00020\u0005`\u0006X\u0004¢\u0006\u0002\n\u0000¨\u0006\u001d"}, d2 = {"Lcom/bytedance/ee/bear/bitable/pro/BitableRoleResultParser;", "Lcom/bytedance/ee/bear/contract/NetService$Parser;", "Lcom/bytedance/ee/bear/bitable/pro/RoleResult;", "tableList", "Ljava/util/ArrayList;", "Lcom/bytedance/ee/bear/TableSimpleInfo;", "Lkotlin/collections/ArrayList;", "(Ljava/util/ArrayList;)V", "TAG", "", "findTableNameById", "tableId", "findTableRoleById", "Lcom/bytedance/ee/bear/bitable/pro/TableRole;", "tableRoleList", "id", "parse", "json", "parseDefaultMembers", "Lcom/bytedance/ee/bear/share/export/UserInfo;", "dataObj", "Lorg/json/JSONObject;", "nodeName", "parseMembers", "membersArrayObj", "Lorg/json/JSONArray;", "parseTableRoleList", "roleObj", "softAndFillTableRole", "bitable-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.bitable.pro.g */
public final class BitableRoleResultParser implements NetService.AbstractC5074c<RoleResult> {

    /* renamed from: a */
    private final String f14215a = "BitableRoleResultParser";

    /* renamed from: b */
    private final ArrayList<TableSimpleInfo> f14216b;

    public BitableRoleResultParser(ArrayList<TableSimpleInfo> arrayList) {
        Intrinsics.checkParameterIsNotNull(arrayList, "tableList");
        this.f14216b = arrayList;
    }

    /* renamed from: b */
    private final String m19977b(String str) {
        Iterator<TableSimpleInfo> it = this.f14216b.iterator();
        while (it.hasNext()) {
            TableSimpleInfo next = it.next();
            Intrinsics.checkExpressionValueIsNotNull(next, "tableInfo");
            if (TextUtils.equals(str, next.getId())) {
                String name = next.getName();
                Intrinsics.checkExpressionValueIsNotNull(name, "tableInfo.name");
                return name;
            }
        }
        return "";
    }

    /* renamed from: a */
    private final ArrayList<TableRole> m19973a(ArrayList<TableRole> arrayList) {
        ArrayList<TableRole> arrayList2 = new ArrayList<>();
        Iterator<TableSimpleInfo> it = this.f14216b.iterator();
        while (it.hasNext()) {
            TableSimpleInfo next = it.next();
            Intrinsics.checkExpressionValueIsNotNull(next, "simpleInfo");
            String id = next.getId();
            Intrinsics.checkExpressionValueIsNotNull(id, "simpleInfo.id");
            TableRole a = m19972a(arrayList, id);
            if (a != null) {
                arrayList2.add(a);
            } else {
                String id2 = next.getId();
                Intrinsics.checkExpressionValueIsNotNull(id2, "simpleInfo.id");
                String name = next.getName();
                Intrinsics.checkExpressionValueIsNotNull(name, "simpleInfo.name");
                arrayList2.add(new TableRole(id2, name, 0, null));
            }
        }
        return arrayList2;
    }

    /* renamed from: a */
    private final ArrayList<UserInfo> m19974a(JSONArray jSONArray) {
        ArrayList<UserInfo> arrayList = new ArrayList<>();
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            JSONObject optJSONObject = jSONArray.optJSONObject(i);
            UserInfo userInfo = new UserInfo();
            userInfo.setAvatarUrl(optJSONObject.optString("memberAvatarUrl", ""));
            userInfo.setLabel(optJSONObject.optString("memberDepartmentName", ""));
            userInfo.setEnName(optJSONObject.optString("memberEnName", ""));
            userInfo.setId(optJSONObject.optString("memberId", ""));
            userInfo.setName(optJSONObject.optString("memberName", ""));
            userInfo.setCnName(userInfo.getName());
            userInfo.setOwnerType(optJSONObject.optInt("memberType", 0));
            arrayList.add(userInfo);
        }
        return arrayList;
    }

    /* renamed from: a */
    private final ArrayList<TableRole> m19975a(JSONObject jSONObject) {
        ArrayList<TableRole> arrayList = new ArrayList<>();
        JSONObject optJSONObject = jSONObject.optJSONObject("tableRoleMap");
        if (optJSONObject == null) {
            optJSONObject = new JSONObject();
        }
        Iterator<String> keys = optJSONObject.keys();
        Intrinsics.checkExpressionValueIsNotNull(keys, "tableRoleMapObj.keys()");
        while (keys.hasNext()) {
            String next = keys.next();
            JSONObject optJSONObject2 = optJSONObject.optJSONObject(next);
            if (optJSONObject2 == null) {
                optJSONObject2 = new JSONObject();
            }
            JSONObject optJSONObject3 = optJSONObject2.optJSONObject("recRule");
            RecRule recRule = null;
            if (optJSONObject3 != null) {
                recRule = new RecRule(optJSONObject3.optInt("perm"), optJSONObject3.optInt("otherPerm"));
            }
            Intrinsics.checkExpressionValueIsNotNull(next, "tableId");
            arrayList.add(new TableRole(next, m19977b(next), optJSONObject2.optInt("perm"), recRule));
        }
        return m19973a(arrayList);
    }

    /* renamed from: a */
    public RoleResult parse(String str) {
        String str2;
        try {
            String str3 = "";
            if (str != null) {
                str2 = str;
            } else {
                str2 = str3;
            }
            JSONObject optJSONObject = new JSONObject(str2).optJSONObject(Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
            if (optJSONObject == null) {
                optJSONObject = new JSONObject();
            }
            JSONObject optJSONObject2 = optJSONObject.optJSONObject("roleMap");
            if (optJSONObject2 == null) {
                optJSONObject2 = new JSONObject();
            }
            HashMap hashMap = new HashMap();
            Iterator<String> keys = optJSONObject2.keys();
            Intrinsics.checkExpressionValueIsNotNull(keys, "roleMapObj.keys()");
            while (keys.hasNext()) {
                String next = keys.next();
                JSONObject optJSONObject3 = optJSONObject2.optJSONObject(next);
                if (optJSONObject3 == null) {
                    optJSONObject3 = new JSONObject();
                }
                Intrinsics.checkExpressionValueIsNotNull(next, "roleId");
                String optString = optJSONObject3.optString("name");
                Intrinsics.checkExpressionValueIsNotNull(optString, "roleObj.optString(\"name\")");
                JSONArray optJSONArray = optJSONObject3.optJSONArray("members");
                if (optJSONArray == null) {
                    optJSONArray = new JSONArray();
                }
                hashMap.put(next, new Role(next, optString, m19974a(optJSONArray), m19975a(optJSONObject3), optJSONObject3.optLong("createdTime", 0), false, 0, 96, null));
                str3 = str3;
            }
            JSONObject optJSONObject4 = optJSONObject.optJSONObject("defaultEditRole");
            Role role = null;
            if (optJSONObject4 != null) {
                String optString2 = optJSONObject4.optString("roleId");
                if (optString2 == null) {
                    optString2 = str3;
                }
                role = (Role) hashMap.get(optString2);
                if (role == null) {
                    role = new Role(optString2, null, null, null, 0, false, 0, SmActions.ACTION_RINGING_EXIT, null);
                }
                role.setDefault(true);
                role.setDefaultType(1);
                hashMap.remove(optString2);
                role.getMembers().addAll(m19976a(optJSONObject, "editMembers"));
            }
            JSONObject optJSONObject5 = optJSONObject.optJSONObject("defaultReadRole");
            Role role2 = null;
            if (optJSONObject5 != null) {
                String optString3 = optJSONObject5.optString("roleId");
                if (optString3 == null) {
                    optString3 = str3;
                }
                role2 = (Role) hashMap.get(optString3);
                if (role2 == null) {
                    role2 = new Role(optString3, null, null, null, 0, false, 0, SmActions.ACTION_RINGING_EXIT, null);
                }
                role2.setDefault(true);
                role2.setDefaultType(2);
                hashMap.remove(optString3);
                role2.getMembers().addAll(m19976a(optJSONObject, "readMembers"));
            }
            return new RoleResult(role, role2, new ArrayList(hashMap.values()));
        } catch (Throwable th) {
            C13479a.m54773d(this.f14215a, "BitableRoleResultParser.parse() error...", th);
            return new RoleResult(null, null, null, 7, null);
        }
    }

    /* renamed from: a */
    private final ArrayList<UserInfo> m19976a(JSONObject jSONObject, String str) {
        JSONArray optJSONArray;
        JSONObject optJSONObject = jSONObject.optJSONObject("extraMembers");
        if (optJSONObject == null || (optJSONArray = optJSONObject.optJSONArray(str)) == null) {
            return new ArrayList<>();
        }
        return m19974a(optJSONArray);
    }

    /* renamed from: a */
    private final TableRole m19972a(ArrayList<TableRole> arrayList, String str) {
        Iterator<TableRole> it = arrayList.iterator();
        while (it.hasNext()) {
            TableRole next = it.next();
            if (TextUtils.equals(next.getTableId(), str)) {
                return next;
            }
        }
        return null;
    }
}
