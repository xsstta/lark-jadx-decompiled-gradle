package com.ss.android.lark.contact.entity;

import com.ss.android.lark.chat.entity.chatter.Chatter;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SchoolParent extends Department {
    private int activeParentCount;
    private List<SchoolParent> childNodes;
    private EduDepartmentLevel eduDepartmentLevel;
    private boolean hasMoreNode;
    private boolean hasMoreUser;
    private List<InactiveParent> inactiveParents;
    private int inactiveParentsCount;
    private boolean isParent = false;
    private boolean isStudent = false;
    private boolean isTeacher = false;
    private boolean isVirtualNode;
    private String lastLevelName = "";
    private int studentCount;
    private int teacherCount;
    private Map<String, ChatterTagInfo> userTags = new HashMap();
    private List<Chatter> users;
    private VirtualNodeType virtualNodeType;

    public int getActiveParentCount() {
        return this.activeParentCount;
    }

    public List<SchoolParent> getChildNodes() {
        return this.childNodes;
    }

    public EduDepartmentLevel getEduDepartmentLevel() {
        return this.eduDepartmentLevel;
    }

    public List<InactiveParent> getInactiveParents() {
        return this.inactiveParents;
    }

    public int getInactiveParentsCount() {
        return this.inactiveParentsCount;
    }

    public String getLastLevelName() {
        return this.lastLevelName;
    }

    public int getStudentCount() {
        return this.studentCount;
    }

    public int getTeacherCount() {
        return this.teacherCount;
    }

    public Map<String, ChatterTagInfo> getUserTags() {
        return this.userTags;
    }

    public List<Chatter> getUsers() {
        return this.users;
    }

    public VirtualNodeType getVirtualNodeType() {
        return this.virtualNodeType;
    }

    public boolean isHasMoreNode() {
        return this.hasMoreNode;
    }

    public boolean isHasMoreUser() {
        return this.hasMoreUser;
    }

    public boolean isParent() {
        return this.isParent;
    }

    public boolean isStudent() {
        return this.isStudent;
    }

    public boolean isTeacher() {
        return this.isTeacher;
    }

    public boolean isVirtualNode() {
        return this.isVirtualNode;
    }

    public void setActiveParentCount(int i) {
        this.activeParentCount = i;
    }

    public void setChildNodes(List<SchoolParent> list) {
        this.childNodes = list;
    }

    public void setEduDepartmentLevel(EduDepartmentLevel eduDepartmentLevel2) {
        this.eduDepartmentLevel = eduDepartmentLevel2;
    }

    public void setHasMoreNode(boolean z) {
        this.hasMoreNode = z;
    }

    public void setHasMoreUser(boolean z) {
        this.hasMoreUser = z;
    }

    public void setInactiveParents(List<InactiveParent> list) {
        this.inactiveParents = list;
    }

    public void setInactiveParentsCount(int i) {
        this.inactiveParentsCount = i;
    }

    public void setLastLevelName(String str) {
        this.lastLevelName = str;
    }

    public void setParent(boolean z) {
        this.isParent = z;
    }

    public void setStudent(boolean z) {
        this.isStudent = z;
    }

    public void setStudentCount(int i) {
        this.studentCount = i;
    }

    public void setTeacher(boolean z) {
        this.isTeacher = z;
    }

    public void setTeacherCount(int i) {
        this.teacherCount = i;
    }

    public void setUserTags(Map<String, ChatterTagInfo> map) {
        this.userTags = map;
    }

    public void setUsers(List<Chatter> list) {
        this.users = list;
    }

    public void setVirtualNode(boolean z) {
        this.isVirtualNode = z;
    }

    public void setVirtualNodeType(VirtualNodeType virtualNodeType2) {
        this.virtualNodeType = virtualNodeType2;
    }
}
