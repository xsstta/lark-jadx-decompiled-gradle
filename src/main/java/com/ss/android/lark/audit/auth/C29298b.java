package com.ss.android.lark.audit.auth;

import android.util.ArrayMap;
import com.ss.android.lark.audit.p1377a.C29283a;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.pb.authorization.AllPermissionData;
import com.ss.android.lark.pb.authorization.OperatePermission;
import com.ss.android.lark.pb.authorization.PermissionType;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* renamed from: com.ss.android.lark.audit.auth.b */
public class C29298b {
    /* renamed from: a */
    private static C29303e m107703a(String str) {
        return new C29303e(str, null, null);
    }

    /* renamed from: a */
    private static List<OperatePermission> m107705a(Map<PermissionType, List<OperatePermission>> map) {
        if (C29283a.m107640a(map)) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<PermissionType, List<OperatePermission>> entry : map.entrySet()) {
            arrayList.addAll(entry.getValue());
        }
        return arrayList;
    }

    /* renamed from: a */
    private static Map<PermissionType, List<OperatePermission>> m107707a(List<OperatePermission> list) {
        if (C29283a.m107639a(list)) {
            return null;
        }
        ArrayMap arrayMap = new ArrayMap();
        for (OperatePermission operatePermission : list) {
            PermissionType permissionType = operatePermission.mperm_type;
            List list2 = (List) arrayMap.get(permissionType);
            if (list2 == null) {
                list2 = new ArrayList();
                arrayMap.put(permissionType, list2);
            }
            list2.add(operatePermission);
        }
        return arrayMap;
    }

    /* renamed from: a */
    private static List<OperatePermission> m107706a(Map<PermissionType, List<OperatePermission>> map, Map<PermissionType, List<OperatePermission>> map2) {
        if (C29283a.m107640a(map)) {
            return m107705a(map2);
        }
        if (C29283a.m107640a(map2)) {
            return m107705a(map);
        }
        for (Map.Entry<PermissionType, List<OperatePermission>> entry : map2.entrySet()) {
            map.remove(entry.getKey());
            map.put(entry.getKey(), entry.getValue());
        }
        return m107705a(map);
    }

    /* renamed from: a */
    public static C29303e m107704a(String str, C29303e eVar, C29303e eVar2) {
        if (!C29303e.m107711a(eVar2)) {
            Log.m165383e("AuditPerm_DataMerge", "should not merge for empty/invalid new data!");
            return eVar;
        } else if (!C29303e.m107711a(eVar)) {
            Log.m165383e("AuditPerm_DataMerge", "should not merge for empty/invalid origin data!");
            return eVar2;
        } else {
            AllPermissionData.C49551a aVar = new AllPermissionData.C49551a();
            aVar.mo172805a(eVar2.f73344c.mupdate_time);
            aVar.mo172808b(eVar2.f73344c.mexpire_time);
            List<OperatePermission> a = m107706a(m107707a(eVar.f73344c.moperate_permission_data), m107707a(eVar2.f73344c.moperate_permission_data));
            if (C29283a.m107639a(a)) {
                return m107703a(str);
            }
            aVar.mo172806a(a);
            return new C29303e(eVar2.f73342a, eVar2.f73343b, aVar.build());
        }
    }
}
