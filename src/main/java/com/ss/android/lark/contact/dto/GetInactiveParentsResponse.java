package com.ss.android.lark.contact.dto;

import com.ss.android.lark.contact.entity.InactiveParent;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B#\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\u0002\u0010\u0007J\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\tJ\u0011\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0003J,\u0010\u0013\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010\u0014J\u0013\u0010\u0015\u001a\u00020\u00032\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001R\u001e\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u0010\n\u0002\u0010\f\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\"\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010¨\u0006\u001b"}, d2 = {"Lcom/ss/android/lark/contact/dto/GetInactiveParentsResponse;", "", "hasMore", "", "inactiveParent", "", "Lcom/ss/android/lark/contact/entity/InactiveParent;", "(Ljava/lang/Boolean;Ljava/util/List;)V", "getHasMore", "()Ljava/lang/Boolean;", "setHasMore", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "getInactiveParent", "()Ljava/util/List;", "setInactiveParent", "(Ljava/util/List;)V", "component1", "component2", "copy", "(Ljava/lang/Boolean;Ljava/util/List;)Lcom/ss/android/lark/contact/dto/GetInactiveParentsResponse;", "equals", "other", "hashCode", "", "toString", "", "core_contact_contact_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.contact.dto.c */
public final class GetInactiveParentsResponse {

    /* renamed from: a */
    private Boolean f91423a;

    /* renamed from: b */
    private List<InactiveParent> f91424b;

    public GetInactiveParentsResponse() {
        this(null, null, 3, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GetInactiveParentsResponse)) {
            return false;
        }
        GetInactiveParentsResponse cVar = (GetInactiveParentsResponse) obj;
        return Intrinsics.areEqual(this.f91423a, cVar.f91423a) && Intrinsics.areEqual(this.f91424b, cVar.f91424b);
    }

    public int hashCode() {
        Boolean bool = this.f91423a;
        int i = 0;
        int hashCode = (bool != null ? bool.hashCode() : 0) * 31;
        List<InactiveParent> list = this.f91424b;
        if (list != null) {
            i = list.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        return "GetInactiveParentsResponse(hasMore=" + this.f91423a + ", inactiveParent=" + this.f91424b + ")";
    }

    /* renamed from: a */
    public final Boolean mo130379a() {
        return this.f91423a;
    }

    /* renamed from: b */
    public final List<InactiveParent> mo130380b() {
        return this.f91424b;
    }

    public GetInactiveParentsResponse(Boolean bool, List<InactiveParent> list) {
        this.f91423a = bool;
        this.f91424b = list;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ GetInactiveParentsResponse(Boolean bool, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : bool, (i & 2) != 0 ? null : list);
    }
}
