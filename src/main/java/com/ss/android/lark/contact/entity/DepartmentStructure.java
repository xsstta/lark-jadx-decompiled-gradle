package com.ss.android.lark.contact.entity;

import com.bytedance.lark.pb.basic.v1.DeniedReason;
import com.larksuite.framework.utils.CollectionUtils;
import com.ss.android.lark.chat.entity.chatter.Chatter;
import com.ss.android.lark.log.Log;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class DepartmentStructure implements Serializable {
    private static final long serialVersionUID = -6531359648726675196L;
    private Set<String> administrators = new HashSet();
    private ChatInfo chatInfo;
    private Map<String, DeniedReason> deniedReasons = new HashMap();
    private Set<String> denyInviteChatterIds = new HashSet();
    private Department department;
    private Map<String, String> dutyMap = new HashMap();
    private Map<String, String> enterpriseEmails = new HashMap();
    private boolean hasMore;
    private boolean hasMoreDepartment;
    private Set<String> inChatChatterIds = new HashSet();
    private Chatter leader;
    private Map<String, String> sectionMap = new HashMap();
    private Set<Department> subDepartments = new LinkedHashSet();
    private Set<String> superAdministrators = new HashSet();
    private Map<String, String> tenantId2NameMap = new HashMap();
    private List<Chatter> users = new ArrayList();

    public Set<String> getAdministrators() {
        return this.administrators;
    }

    public ChatInfo getChatInfo() {
        return this.chatInfo;
    }

    public Map<String, DeniedReason> getDeniedReasons() {
        return this.deniedReasons;
    }

    public Set<String> getDenyInviteChatterIds() {
        return this.denyInviteChatterIds;
    }

    public Department getDepartment() {
        return this.department;
    }

    public Map<String, String> getEnterpriseEmails() {
        return this.enterpriseEmails;
    }

    public Set<String> getInChatChatterIds() {
        return this.inChatChatterIds;
    }

    public Chatter getLeader() {
        return this.leader;
    }

    public Set<Department> getSubDepartments() {
        return this.subDepartments;
    }

    public Set<String> getSuperAdministrators() {
        return this.superAdministrators;
    }

    public Map<String, String> getTenantId2NameMap() {
        return this.tenantId2NameMap;
    }

    public List<Chatter> getUsers() {
        return this.users;
    }

    public boolean isHasMore() {
        return this.hasMore;
    }

    public boolean isHasMoreDepartment() {
        return this.hasMoreDepartment;
    }

    public Map<String, String> getDutyMap() {
        return new HashMap(this.dutyMap);
    }

    public Map<String, String> getSectionMap() {
        return new HashMap(this.sectionMap);
    }

    public void setChatInfo(ChatInfo chatInfo2) {
        this.chatInfo = chatInfo2;
    }

    public void setDepartment(Department department2) {
        this.department = department2;
    }

    public void setHasMore(boolean z) {
        this.hasMore = z;
    }

    public void setHasMoreDepartment(boolean z) {
        this.hasMoreDepartment = z;
    }

    public void setInChatChatterIds(Set<String> set) {
        this.inChatChatterIds = set;
    }

    public void setLeader(Chatter chatter) {
        this.leader = chatter;
    }

    public void setUsers(List<Chatter> list) {
        this.users = list;
    }

    private void addDeniedReasons(Map<String, DeniedReason> map) {
        if (CollectionUtils.isNotEmpty(map)) {
            this.deniedReasons.putAll(map);
        }
    }

    private void addDenyInviteChatters(Collection<String> collection) {
        if (CollectionUtils.isNotEmpty(collection)) {
            this.denyInviteChatterIds.addAll(collection);
        }
    }

    private void addEnterpriseEmails(Map<String, String> map) {
        if (CollectionUtils.isNotEmpty(map)) {
            this.enterpriseEmails.putAll(map);
        }
    }

    private void addInChatChatters(List<String> list) {
        if (CollectionUtils.isNotEmpty(list)) {
            this.inChatChatterIds.addAll(list);
        }
    }

    private void addSubDepartments(Set<Department> set) {
        if (CollectionUtils.isNotEmpty(set)) {
            this.subDepartments.addAll(set);
        }
    }

    private void setDenyInviteChatters(Collection<String> collection) {
        this.denyInviteChatterIds.clear();
        addDenyInviteChatters(collection);
    }

    public void addDutyMap(Map<String, String> map) {
        if (CollectionUtils.isNotEmpty(map)) {
            this.dutyMap.putAll(map);
        }
    }

    public void addSectionMap(Map<String, String> map) {
        if (CollectionUtils.isNotEmpty(map)) {
            this.sectionMap.putAll(map);
        }
    }

    public void addTenantId2NameMap(Map<String, String> map) {
        if (CollectionUtils.isNotEmpty(map)) {
            this.tenantId2NameMap.putAll(map);
        }
    }

    public void setAdministrators(Collection<String> collection) {
        this.administrators.clear();
        this.administrators.addAll(collection);
    }

    public void setDeniedReasons(Map<String, DeniedReason> map) {
        this.deniedReasons.clear();
        addDeniedReasons(map);
    }

    public void setDutyMap(Map<String, String> map) {
        this.dutyMap.clear();
        addDutyMap(map);
    }

    public void setEnterpriseEmails(Map<String, String> map) {
        this.enterpriseEmails.clear();
        addEnterpriseEmails(map);
    }

    public void setSectionMap(Map<String, String> map) {
        this.sectionMap.clear();
        addSectionMap(map);
    }

    public void setSubDepartments(Collection<Department> collection) {
        this.subDepartments.clear();
        this.subDepartments.addAll(collection);
    }

    public void setSuperAdministrators(Collection<String> collection) {
        this.superAdministrators.clear();
        this.superAdministrators.addAll(collection);
    }

    private void addUsers(List<Chatter> list) {
        if (CollectionUtils.isNotEmpty(list)) {
            for (Chatter chatter : list) {
                if (!this.users.contains(chatter)) {
                    this.users.add(chatter);
                }
            }
        }
    }

    public void appendForEdu(Department department2) {
        if (department2 instanceof SchoolParent) {
            Department department3 = this.department;
            if (department3 instanceof SchoolParent) {
                SchoolParent schoolParent = (SchoolParent) department2;
                ((SchoolParent) department3).setHasMoreUser(schoolParent.isHasMoreUser());
                ((SchoolParent) this.department).setHasMoreNode(schoolParent.isHasMoreNode());
                ((SchoolParent) this.department).getUsers().addAll(schoolParent.getUsers());
                Department department4 = this.department;
                ((SchoolParent) department4).setStudentCount(((SchoolParent) department4).getStudentCount() + schoolParent.getStudentCount());
                Department department5 = this.department;
                ((SchoolParent) department5).setTeacherCount(((SchoolParent) department5).getTeacherCount() + schoolParent.getTeacherCount());
                Department department6 = this.department;
                ((SchoolParent) department6).setActiveParentCount(((SchoolParent) department6).getActiveParentCount() + schoolParent.getActiveParentCount());
                Department department7 = this.department;
                ((SchoolParent) department7).setInactiveParentsCount(((SchoolParent) department7).getInactiveParentsCount() + schoolParent.getInactiveParentsCount());
                ((SchoolParent) this.department).getInactiveParents().addAll(schoolParent.getInactiveParents());
                ((SchoolParent) this.department).getChildNodes().addAll(schoolParent.getChildNodes());
                ((SchoolParent) this.department).getUserTags().putAll(schoolParent.getUserTags());
            }
        }
    }

    public void reset(DepartmentStructure departmentStructure, List<String> list, List<String> list2, Map<String, DeniedReason> map, Map<String, String> map2) {
        if (departmentStructure == null || departmentStructure.department == null) {
            Log.m165383e("DepartmentStructure", "departmentStructure is null or departmentStructure.department is null");
        }
        setDepartment(departmentStructure.department);
        setHasMore(departmentStructure.hasMore);
        setHasMoreDepartment(departmentStructure.hasMoreDepartment);
        setLeader(departmentStructure.leader);
        setSubDepartments(departmentStructure.subDepartments);
        setUsers(departmentStructure.users);
        setChatInfo(departmentStructure.chatInfo);
        addTenantId2NameMap(departmentStructure.getTenantId2NameMap());
        addInChatChatters(list);
        setSuperAdministrators(departmentStructure.superAdministrators);
        setAdministrators(departmentStructure.administrators);
        setSectionMap(departmentStructure.sectionMap);
        setDutyMap(departmentStructure.dutyMap);
        setDenyInviteChatters(list2);
        setDeniedReasons(map);
        setEnterpriseEmails(map2);
    }

    public void append(Set<Department> set, List<Chatter> list, List<String> list2, List<String> list3, Map<String, DeniedReason> map, Map<String, String> map2, Map<String, String> map3, Map<String, String> map4) {
        addSubDepartments(set);
        addUsers(list);
        addInChatChatters(list2);
        addDenyInviteChatters(list3);
        addDeniedReasons(map);
        addSectionMap(map2);
        addDutyMap(map3);
        addEnterpriseEmails(map4);
    }
}
