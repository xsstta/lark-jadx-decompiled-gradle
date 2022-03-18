package com.ss.android.lark.contact.dto;

import com.bytedance.lark.pb.basic.v1.DeniedReason;
import com.ss.android.lark.contact.entity.DepartmentStructure;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0004\b\b\u0018\u00002\u00020\u0001Bo\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\u0016\b\u0002\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\n\u0018\u00010\t\u0012\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u0005\u0012\u0016\b\u0002\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0018\u00010\t¢\u0006\u0002\u0010\u000eJ\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\u0011\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0003J\u0011\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0003J\u0017\u0010\u001b\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\n\u0018\u00010\tHÆ\u0003J\u0011\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u0005HÆ\u0003J\u0017\u0010\u001d\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0018\u00010\tHÆ\u0003Jy\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00052\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00052\u0016\b\u0002\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\n\u0018\u00010\t2\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u00052\u0016\b\u0002\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0018\u00010\tHÆ\u0001J\u0013\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\"\u001a\u00020\fHÖ\u0001J\t\u0010#\u001a\u00020\u0006HÖ\u0001R\u001f\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\n\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0019\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0019\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0012R\u001f\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0010R\u0019\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0012¨\u0006$"}, d2 = {"Lcom/ss/android/lark/contact/dto/DepartmentStructureResponse;", "", "departmentStructure", "Lcom/ss/android/lark/contact/entity/DepartmentStructure;", "inChatChatters", "", "", "denyInviteChatters", "deniedReasons", "", "Lcom/bytedance/lark/pb/basic/v1/DeniedReason;", "displayOrder", "", "enterpriseEmails", "(Lcom/ss/android/lark/contact/entity/DepartmentStructure;Ljava/util/List;Ljava/util/List;Ljava/util/Map;Ljava/util/List;Ljava/util/Map;)V", "getDeniedReasons", "()Ljava/util/Map;", "getDenyInviteChatters", "()Ljava/util/List;", "getDepartmentStructure", "()Lcom/ss/android/lark/contact/entity/DepartmentStructure;", "getDisplayOrder", "getEnterpriseEmails", "getInChatChatters", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "toString", "core_contact_contact_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.contact.dto.b */
public final class DepartmentStructureResponse {

    /* renamed from: a */
    private final DepartmentStructure f91417a;

    /* renamed from: b */
    private final List<String> f91418b;

    /* renamed from: c */
    private final List<String> f91419c;

    /* renamed from: d */
    private final Map<String, DeniedReason> f91420d;

    /* renamed from: e */
    private final List<Integer> f91421e;

    /* renamed from: f */
    private final Map<String, String> f91422f;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DepartmentStructureResponse)) {
            return false;
        }
        DepartmentStructureResponse bVar = (DepartmentStructureResponse) obj;
        return Intrinsics.areEqual(this.f91417a, bVar.f91417a) && Intrinsics.areEqual(this.f91418b, bVar.f91418b) && Intrinsics.areEqual(this.f91419c, bVar.f91419c) && Intrinsics.areEqual(this.f91420d, bVar.f91420d) && Intrinsics.areEqual(this.f91421e, bVar.f91421e) && Intrinsics.areEqual(this.f91422f, bVar.f91422f);
    }

    public int hashCode() {
        DepartmentStructure departmentStructure = this.f91417a;
        int i = 0;
        int hashCode = (departmentStructure != null ? departmentStructure.hashCode() : 0) * 31;
        List<String> list = this.f91418b;
        int hashCode2 = (hashCode + (list != null ? list.hashCode() : 0)) * 31;
        List<String> list2 = this.f91419c;
        int hashCode3 = (hashCode2 + (list2 != null ? list2.hashCode() : 0)) * 31;
        Map<String, DeniedReason> map = this.f91420d;
        int hashCode4 = (hashCode3 + (map != null ? map.hashCode() : 0)) * 31;
        List<Integer> list3 = this.f91421e;
        int hashCode5 = (hashCode4 + (list3 != null ? list3.hashCode() : 0)) * 31;
        Map<String, String> map2 = this.f91422f;
        if (map2 != null) {
            i = map2.hashCode();
        }
        return hashCode5 + i;
    }

    public String toString() {
        return "DepartmentStructureResponse(departmentStructure=" + this.f91417a + ", inChatChatters=" + this.f91418b + ", denyInviteChatters=" + this.f91419c + ", deniedReasons=" + this.f91420d + ", displayOrder=" + this.f91421e + ", enterpriseEmails=" + this.f91422f + ")";
    }

    /* renamed from: a */
    public final DepartmentStructure mo130370a() {
        return this.f91417a;
    }

    /* renamed from: b */
    public final List<String> mo130371b() {
        return this.f91418b;
    }

    /* renamed from: c */
    public final List<String> mo130372c() {
        return this.f91419c;
    }

    /* renamed from: d */
    public final Map<String, DeniedReason> mo130373d() {
        return this.f91420d;
    }

    /* renamed from: e */
    public final List<Integer> mo130374e() {
        return this.f91421e;
    }

    /* renamed from: f */
    public final Map<String, String> mo130376f() {
        return this.f91422f;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: java.util.Map<java.lang.String, ? extends com.bytedance.lark.pb.basic.v1.DeniedReason> */
    /* JADX WARN: Multi-variable type inference failed */
    public DepartmentStructureResponse(DepartmentStructure departmentStructure, List<String> list, List<String> list2, Map<String, ? extends DeniedReason> map, List<Integer> list3, Map<String, String> map2) {
        Intrinsics.checkParameterIsNotNull(departmentStructure, "departmentStructure");
        this.f91417a = departmentStructure;
        this.f91418b = list;
        this.f91419c = list2;
        this.f91420d = map;
        this.f91421e = list3;
        this.f91422f = map2;
    }
}
