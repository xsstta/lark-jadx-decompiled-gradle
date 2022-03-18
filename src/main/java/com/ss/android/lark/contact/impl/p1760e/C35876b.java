package com.ss.android.lark.contact.impl.p1760e;

import android.util.Log;
import com.bytedance.lark.pb.basic.v1.Chatter;
import com.bytedance.lark.pb.basic.v1.ChattersAuthResult;
import com.bytedance.lark.pb.contact.v1.ChatterTagInfo;
import com.bytedance.lark.pb.contact.v1.CollaborationDepartmentStructure;
import com.bytedance.lark.pb.contact.v1.EduRoleType;
import com.bytedance.lark.pb.contact.v1.GetCollaborationStructureResponse;
import com.bytedance.lark.pb.contact.v1.GetDepartmentCombineChatResponse;
import com.bytedance.lark.pb.contact.v1.GetSubordinateDepartmentsRequestResponse;
import com.bytedance.lark.pb.contact.v1.InactiveParent;
import com.bytedance.lark.pb.contact.v1.InactiveParent2;
import com.bytedance.lark.pb.contact.v1.ParentDisplayNames;
import com.bytedance.lark.pb.contact.v1.ProfileFields;
import com.bytedance.lark.pb.contact.v1.PullManagedSchoolNodeResponse;
import com.bytedance.lark.pb.contact.v1.PullSchoolNodeResponse;
import com.bytedance.lark.pb.contact.v1.SchoolNode;
import com.bytedance.lark.pb.contact.v1.SchoolNodeLite;
import com.larksuite.suite.R;
import com.ss.android.lark.chat.api.IChatterParser;
import com.ss.android.lark.contact.C35358a;
import com.ss.android.lark.contact.dto.DepartmentStructureResponse;
import com.ss.android.lark.contact.dto.GetInactiveParentsResponse;
import com.ss.android.lark.contact.dto.SchoolContactStructureResponse;
import com.ss.android.lark.contact.entity.ChatInfo;
import com.ss.android.lark.contact.entity.Department;
import com.ss.android.lark.contact.entity.DepartmentStructure;
import com.ss.android.lark.contact.entity.EduDepartmentLevel;
import com.ss.android.lark.contact.entity.SchoolNodeWithUpperNodesPath;
import com.ss.android.lark.contact.entity.SchoolParent;
import com.ss.android.lark.contact.entity.VirtualNodeType;
import com.ss.android.lark.contact.impl.interfaces.IDepartmentServiceInternal;
import com.ss.android.lark.profile.v2.entity.BaseField;
import com.ss.android.lark.utils.UIHelper;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.ss.android.lark.contact.impl.e.b */
public class C35876b {

    /* renamed from: a */
    static IChatterParser f92800a = C35358a.m138143a().mo130165j().mo130202b();

    /* renamed from: a */
    private static List<Department> m140595a(List<com.bytedance.lark.pb.basic.v1.Department> list, Map<String, Boolean> map, boolean z) {
        ArrayList arrayList = new ArrayList();
        for (com.bytedance.lark.pb.basic.v1.Department department : list) {
            Department a = m140588a(department, z);
            if (a != null) {
                a.setHasLeaderPermission(Boolean.TRUE.equals(map.get(a.getId())));
                arrayList.add(a);
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public static SchoolNodeWithUpperNodesPath m140591a(com.bytedance.lark.pb.contact.v1.SchoolNodeWithUpperNodesPath schoolNodeWithUpperNodesPath) {
        if (schoolNodeWithUpperNodesPath == null) {
            return null;
        }
        SchoolNodeWithUpperNodesPath cVar = new SchoolNodeWithUpperNodesPath();
        SchoolParent a = m140590a(schoolNodeWithUpperNodesPath.node);
        if (schoolNodeWithUpperNodesPath.upper_node_path != null) {
            StringBuilder sb = new StringBuilder();
            ArrayList arrayList = new ArrayList();
            for (SchoolNodeLite schoolNodeLite : schoolNodeWithUpperNodesPath.upper_node_path) {
                com.ss.android.lark.contact.entity.SchoolNodeLite bVar = new com.ss.android.lark.contact.entity.SchoolNodeLite();
                bVar.mo130587a(schoolNodeLite.id);
                bVar.mo130588b(schoolNodeLite.name);
                sb.append(schoolNodeLite.name + "-");
                arrayList.add(bVar);
            }
            cVar.mo130594a(arrayList);
            if (a != null) {
                a.setName(sb.toString() + a.getName());
            }
        }
        cVar.mo130593a(a);
        return cVar;
    }

    /* renamed from: a */
    public static SchoolParent m140590a(SchoolNode schoolNode) {
        if (schoolNode == null) {
            return null;
        }
        SchoolParent schoolParent = new SchoolParent();
        schoolParent.setId(schoolNode.id);
        schoolParent.setName(schoolNode.name);
        schoolParent.setParentId(schoolNode.parent_id);
        schoolParent.setVirtualNode(schoolNode.is_virtual_node.booleanValue());
        ArrayList arrayList = new ArrayList();
        if (schoolNode.users != null) {
            for (Chatter chatter : schoolNode.users) {
                com.ss.android.lark.chat.entity.chatter.Chatter chatter2 = f92800a.getChatter(chatter);
                if (schoolNode.parent_display_names != null && schoolNode.parent_display_names.containsKey(chatter2.getId())) {
                    chatter2.setName(m140594a(schoolNode.parent_display_names.get(chatter2.getId())));
                }
                arrayList.add(chatter2);
            }
            schoolParent.setUsers(arrayList);
        }
        schoolParent.setStudentCount(schoolNode.student_count.intValue());
        schoolParent.setTeacherCount(schoolNode.teacher_count.intValue());
        if (schoolNode.dept_level != null) {
            schoolParent.setEduDepartmentLevel(EduDepartmentLevel.Companion.mo130491a(schoolNode.dept_level.getValue()));
        }
        schoolParent.setActiveParentCount(schoolNode.active_parent_count.intValue());
        schoolParent.setInactiveParentsCount(schoolNode.inactive_parent_count.intValue());
        if (schoolNode.inactive_parents != null) {
            ArrayList arrayList2 = new ArrayList();
            for (InactiveParent inactiveParent : schoolNode.inactive_parents) {
                com.ss.android.lark.contact.entity.InactiveParent inactiveParent2 = new com.ss.android.lark.contact.entity.InactiveParent();
                inactiveParent2.setId(inactiveParent.id);
                inactiveParent2.setName(m140593a(inactiveParent));
                arrayList2.add(inactiveParent2);
            }
            schoolParent.setInactiveParents(arrayList2);
        }
        if (schoolNode.child_nodes != null) {
            ArrayList arrayList3 = new ArrayList();
            for (SchoolNode schoolNode2 : schoolNode.child_nodes) {
                SchoolParent a = m140590a(schoolNode2);
                if (UIHelper.getString(R.string.Lark_Education_ProfileParent).equals(a.getName())) {
                    a.setParent(true);
                    a.setLastLevelName(schoolNode.name);
                } else if (UIHelper.getString(R.string.Lark_Education_TeacherLabel).equals(a.getName())) {
                    a.setTeacher(true);
                } else if (UIHelper.getString(R.string.Lark_Education_Student).equals(a.getName())) {
                    a.setStudent(true);
                }
                if (a != null) {
                    arrayList3.add(a);
                }
            }
            schoolParent.setChildNodes(arrayList3);
        }
        if (schoolNode.user_tags != null) {
            HashMap hashMap = new HashMap();
            for (Map.Entry<String, ChatterTagInfo> entry : schoolNode.user_tags.entrySet()) {
                ArrayList arrayList4 = new ArrayList();
                List<EduRoleType> list = entry.getValue().role_types;
                for (int i = 0; i < list.size(); i++) {
                    arrayList4.add(com.ss.android.lark.contact.entity.EduRoleType.Companion.mo130494a(list.get(i).getValue()));
                }
                com.ss.android.lark.contact.entity.ChatterTagInfo aVar = new com.ss.android.lark.contact.entity.ChatterTagInfo();
                aVar.mo130574a(arrayList4);
                hashMap.put(entry.getKey(), aVar);
            }
            schoolParent.setUserTags(hashMap);
        }
        if (schoolNode.vnode_type != null) {
            schoolParent.setVirtualNodeType(VirtualNodeType.Companion.mo130572a(schoolNode.vnode_type.getValue()));
        }
        return schoolParent;
    }

    /* renamed from: a */
    private static String m140593a(InactiveParent inactiveParent) {
        StringBuilder sb = new StringBuilder();
        if (!(inactiveParent == null || inactiveParent.names == null || inactiveParent.names.parent_name_via_student_relation == null)) {
            List<String> list = inactiveParent.names.parent_name_via_student_relation;
            for (int i = 0; i < list.size(); i++) {
                if (i == list.size() - 1) {
                    sb.append((Object) list.get(i));
                } else {
                    sb.append(((Object) list.get(i)) + "、");
                }
            }
        }
        return sb.toString();
    }

    /* renamed from: a */
    private static String m140594a(ParentDisplayNames parentDisplayNames) {
        StringBuilder sb = new StringBuilder();
        if (!(parentDisplayNames == null || parentDisplayNames.parent_name_via_student_relation == null)) {
            List<String> list = parentDisplayNames.parent_name_via_student_relation;
            for (int i = 0; i < list.size(); i++) {
                if (i == list.size() - 1) {
                    sb.append((Object) list.get(i));
                } else {
                    sb.append(((Object) list.get(i)) + "、");
                }
            }
        }
        return sb.toString();
    }

    /* renamed from: a */
    private static Map<String, String> m140598a(List<com.ss.android.lark.chat.entity.chatter.Chatter> list, com.ss.android.lark.chat.entity.chatter.Chatter chatter, Map<String, ProfileFields> map, int i) {
        HashMap hashMap = new HashMap();
        ArrayList<com.ss.android.lark.chat.entity.chatter.Chatter> arrayList = new ArrayList(list);
        if (chatter != null) {
            arrayList.add(chatter);
        }
        for (com.ss.android.lark.chat.entity.chatter.Chatter chatter2 : arrayList) {
            String id = chatter2.getId();
            ProfileFields profileFields = map.get(id);
            hashMap.put(id, "");
            if (!(profileFields == null || profileFields.profile_fields == null)) {
                List<BaseField> a = C35358a.m138143a().mo130168m().mo130241a(profileFields.profile_fields);
                if (a.size() >= i + 1) {
                    hashMap.put(id, C35358a.m138143a().mo130168m().mo130240a(a.get(i)));
                }
                Log.i("ModelParserDepartment", i + ((String) hashMap.get(id)));
            }
        }
        return hashMap;
    }

    /* renamed from: a */
    public static DepartmentStructure m140589a(String str, GetCollaborationStructureResponse getCollaborationStructureResponse) {
        DepartmentStructure departmentStructure = new DepartmentStructure();
        CollaborationDepartmentStructure collaborationDepartmentStructure = getCollaborationStructureResponse.department_structure;
        if (collaborationDepartmentStructure != null) {
            Department a = m140588a(collaborationDepartmentStructure.department, getCollaborationStructureResponse.show_department_count.booleanValue());
            if (a != null) {
                a.setId(str);
                departmentStructure.setDepartment(a);
            }
            if (collaborationDepartmentStructure.sub_departments != null) {
                departmentStructure.setSubDepartments(m140596a(collaborationDepartmentStructure.sub_departments, getCollaborationStructureResponse.show_department_count.booleanValue()));
            }
            departmentStructure.setHasMore(collaborationDepartmentStructure.has_more.booleanValue());
            departmentStructure.setHasMoreDepartment(collaborationDepartmentStructure.has_more_department.booleanValue());
            departmentStructure.setLeader(f92800a.getChatter(collaborationDepartmentStructure.leader));
            departmentStructure.setUsers(f92800a.getChatterList(collaborationDepartmentStructure.chatters));
        }
        return departmentStructure;
    }

    /* renamed from: a */
    public static IDepartmentServiceInternal.SubordinateDepartmentStructure m140592a(byte[] bArr) throws IOException {
        GetSubordinateDepartmentsRequestResponse decode = GetSubordinateDepartmentsRequestResponse.ADAPTER.decode(bArr);
        List<com.bytedance.lark.pb.basic.v1.Department> list = decode.departments;
        return new IDepartmentServiceInternal.SubordinateDepartmentStructure(m140596a(list, decode.is_show_member_count.booleanValue()), decode.member_count.intValue());
    }

    /* renamed from: a */
    public static DepartmentStructureResponse m140584a(PullSchoolNodeResponse pullSchoolNodeResponse) {
        if (pullSchoolNodeResponse == null || pullSchoolNodeResponse.node == null) {
            return null;
        }
        DepartmentStructure departmentStructure = new DepartmentStructure();
        departmentStructure.setDepartment(m140590a(pullSchoolNodeResponse.node));
        return new DepartmentStructureResponse(departmentStructure, null, null, null, null, null);
    }

    /* renamed from: a */
    public static GetInactiveParentsResponse m140585a(com.bytedance.lark.pb.contact.v1.GetInactiveParentsResponse getInactiveParentsResponse) {
        if (getInactiveParentsResponse == null || getInactiveParentsResponse.inactive_parent == null || getInactiveParentsResponse.inactive_parent.isEmpty()) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (InactiveParent2 inactiveParent2 : getInactiveParentsResponse.inactive_parent) {
            com.ss.android.lark.contact.entity.InactiveParent inactiveParent = new com.ss.android.lark.contact.entity.InactiveParent();
            inactiveParent.setId(inactiveParent2.parent_id);
            inactiveParent.setName(inactiveParent2.parent_name);
            arrayList.add(inactiveParent);
        }
        return new GetInactiveParentsResponse(getInactiveParentsResponse.has_more, arrayList);
    }

    /* renamed from: a */
    public static DepartmentStructureResponse m140583a(GetDepartmentCombineChatResponse getDepartmentCombineChatResponse) {
        List<String> list;
        List<String> list2;
        ChattersAuthResult chattersAuthResult;
        if (getDepartmentCombineChatResponse == null || getDepartmentCombineChatResponse.department_structure == null) {
            return null;
        }
        com.bytedance.lark.pb.contact.v1.DepartmentStructure departmentStructure = getDepartmentCombineChatResponse.department_structure;
        HashMap hashMap = new HashMap();
        if (!(getDepartmentCombineChatResponse.extend_fields == null || getDepartmentCombineChatResponse.extend_fields.dep_has_lead_perm == null)) {
            hashMap.putAll(getDepartmentCombineChatResponse.extend_fields.dep_has_lead_perm);
        }
        HashMap hashMap2 = new HashMap();
        if (!(getDepartmentCombineChatResponse.extend_fields == null || getDepartmentCombineChatResponse.extend_fields.user_profile_fields == null)) {
            hashMap2.putAll(getDepartmentCombineChatResponse.extend_fields.user_profile_fields);
        }
        DepartmentStructure departmentStructure2 = new DepartmentStructure();
        departmentStructure2.setDepartment(m140588a(departmentStructure.department, getDepartmentCombineChatResponse.is_show_member_count.booleanValue()));
        departmentStructure2.setHasMore(departmentStructure.has_more.booleanValue());
        departmentStructure2.setHasMoreDepartment(departmentStructure.has_more_department.booleanValue());
        com.ss.android.lark.chat.entity.chatter.Chatter chatter = f92800a.getChatter(departmentStructure.leader);
        departmentStructure2.setLeader(chatter);
        List<com.ss.android.lark.chat.entity.chatter.Chatter> chatterList = f92800a.getChatterList(departmentStructure.chatters);
        departmentStructure2.setUsers(chatterList);
        departmentStructure2.setAdministrators(departmentStructure.administrator);
        departmentStructure2.setSuperAdministrators(departmentStructure.super_administrator);
        departmentStructure2.setSubDepartments(m140595a(departmentStructure.sub_departments, hashMap, getDepartmentCombineChatResponse.is_show_member_count.booleanValue()));
        departmentStructure2.setChatInfo(m140587a(departmentStructure.chat_info));
        departmentStructure2.setSectionMap(m140597a(chatterList, chatter, hashMap2));
        departmentStructure2.setDutyMap(m140599b(chatterList, chatter, hashMap2));
        if (getDepartmentCombineChatResponse.extend_fields == null || getDepartmentCombineChatResponse.extend_fields.in_chat_chatter_ids == null) {
            list = null;
            list2 = getDepartmentCombineChatResponse.in_chat_chatter_ids;
        } else {
            list2 = getDepartmentCombineChatResponse.extend_fields.in_chat_chatter_ids;
            list = getDepartmentCombineChatResponse.extend_fields.chatters_deny_invite_same_chat;
        }
        HashMap hashMap3 = new HashMap();
        if (!(getDepartmentCombineChatResponse.extend_fields == null || (chattersAuthResult = getDepartmentCombineChatResponse.extend_fields.auth_result) == null || chattersAuthResult.denied_reasons == null)) {
            hashMap3.putAll(chattersAuthResult.denied_reasons);
        }
        HashMap hashMap4 = new HashMap();
        if (!(getDepartmentCombineChatResponse.extend_fields == null || getDepartmentCombineChatResponse.extend_fields.enterprise_emails == null)) {
            hashMap4.putAll(getDepartmentCombineChatResponse.extend_fields.enterprise_emails);
        }
        List list3 = getDepartmentCombineChatResponse.display_order;
        if (list3 == null) {
            list3 = new ArrayList();
        }
        return new DepartmentStructureResponse(departmentStructure2, list2, list, hashMap3, list3, hashMap4);
    }

    /* renamed from: a */
    public static SchoolContactStructureResponse m140586a(PullManagedSchoolNodeResponse pullManagedSchoolNodeResponse) {
        if (pullManagedSchoolNodeResponse == null) {
            return null;
        }
        if ((pullManagedSchoolNodeResponse.school_nodes == null || pullManagedSchoolNodeResponse.school_nodes.isEmpty()) && (pullManagedSchoolNodeResponse.superAdminNode == null || "".equals(pullManagedSchoolNodeResponse.superAdminNode.id))) {
            return null;
        }
        SchoolContactStructureResponse fVar = new SchoolContactStructureResponse();
        if (pullManagedSchoolNodeResponse.school_nodes != null && !pullManagedSchoolNodeResponse.school_nodes.isEmpty()) {
            List<com.bytedance.lark.pb.contact.v1.SchoolNodeWithUpperNodesPath> list = pullManagedSchoolNodeResponse.school_nodes;
            ArrayList arrayList = new ArrayList();
            for (com.bytedance.lark.pb.contact.v1.SchoolNodeWithUpperNodesPath schoolNodeWithUpperNodesPath : list) {
                SchoolNodeWithUpperNodesPath a = m140591a(schoolNodeWithUpperNodesPath);
                if (a != null) {
                    arrayList.add(a);
                }
            }
            fVar.mo130394a(arrayList);
        }
        if (pullManagedSchoolNodeResponse.superAdminNode != null && !"".equals(pullManagedSchoolNodeResponse.superAdminNode.id)) {
            fVar.mo130393a(m140590a(pullManagedSchoolNodeResponse.superAdminNode));
        }
        return fVar;
    }

    /* renamed from: a */
    public static ChatInfo m140587a(com.bytedance.lark.pb.contact.v1.ChatInfo chatInfo) {
        if (chatInfo == null) {
            return null;
        }
        ChatInfo chatInfo2 = new ChatInfo();
        chatInfo2.setUserPermission(ChatInfo.UserPermission.forNumber(chatInfo.user_perm.getValue()));
        chatInfo2.setMember(chatInfo.is_member.booleanValue());
        chatInfo2.setChat(C35358a.m138143a().mo130165j().mo130194a().getChat(chatInfo.chat));
        return chatInfo2;
    }

    /* renamed from: a */
    public static List<Department> m140596a(List<com.bytedance.lark.pb.basic.v1.Department> list, boolean z) {
        return m140595a(list, Collections.emptyMap(), z);
    }

    /* renamed from: a */
    public static Department m140588a(com.bytedance.lark.pb.basic.v1.Department department, boolean z) {
        if (department == null) {
            return null;
        }
        Department department2 = new Department();
        department2.setId(department.id);
        department2.setLeaderId(department.leader_id);
        department2.setMemberCount(department.member_count.intValue());
        department2.setName(department.name);
        department2.setParentId(department.parent_id);
        department2.setChatId(department.chat_id);
        department2.setHasSubDepartments(department.has_sub_departments.booleanValue());
        department2.setRefParentId(department.ref_parent_id);
        department2.setShowMemberCount(z);
        return department2;
    }

    /* renamed from: a */
    public static Map<String, String> m140597a(List<com.ss.android.lark.chat.entity.chatter.Chatter> list, com.ss.android.lark.chat.entity.chatter.Chatter chatter, Map<String, ProfileFields> map) {
        return m140598a(list, chatter, map, 0);
    }

    /* renamed from: b */
    public static Map<String, String> m140599b(List<com.ss.android.lark.chat.entity.chatter.Chatter> list, com.ss.android.lark.chat.entity.chatter.Chatter chatter, Map<String, ProfileFields> map) {
        return m140598a(list, chatter, map, 1);
    }
}
