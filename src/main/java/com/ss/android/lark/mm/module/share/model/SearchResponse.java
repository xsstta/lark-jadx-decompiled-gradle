package com.ss.android.lark.mm.module.share.model;

import com.google.gson.annotations.SerializedName;
import java.io.Serializable;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B/\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006¢\u0006\u0002\u0010\bJ\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\nJ\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\nJ\u0011\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006HÆ\u0003J8\u0010\u0012\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006HÆ\u0001¢\u0006\u0002\u0010\u0013J\u0013\u0010\u0014\u001a\u00020\u00032\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001R\u001a\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\t\u0010\nR\u001a\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\f\u0010\nR\u001e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00068\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u001b"}, d2 = {"Lcom/ss/android/lark/mm/module/share/model/SearchResponse;", "Ljava/io/Serializable;", "hasMore", "", "mobileSupport", "users", "", "Lcom/ss/android/lark/mm/module/share/model/User;", "(Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/util/List;)V", "getHasMore", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getMobileSupport", "getUsers", "()Ljava/util/List;", "component1", "component2", "component3", "copy", "(Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/util/List;)Lcom/ss/android/lark/mm/module/share/model/SearchResponse;", "equals", "other", "", "hashCode", "", "toString", "", "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class SearchResponse implements Serializable {
    @SerializedName("has_more")
    private final Boolean hasMore;
    @SerializedName("mobile_support")
    private final Boolean mobileSupport;
    @SerializedName("users")
    private final List<User> users;

    public SearchResponse() {
        this(null, null, null, 7, null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.ss.android.lark.mm.module.share.model.SearchResponse */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SearchResponse copy$default(SearchResponse searchResponse, Boolean bool, Boolean bool2, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            bool = searchResponse.hasMore;
        }
        if ((i & 2) != 0) {
            bool2 = searchResponse.mobileSupport;
        }
        if ((i & 4) != 0) {
            list = searchResponse.users;
        }
        return searchResponse.copy(bool, bool2, list);
    }

    public final Boolean component1() {
        return this.hasMore;
    }

    public final Boolean component2() {
        return this.mobileSupport;
    }

    public final List<User> component3() {
        return this.users;
    }

    public final SearchResponse copy(Boolean bool, Boolean bool2, List<User> list) {
        return new SearchResponse(bool, bool2, list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SearchResponse)) {
            return false;
        }
        SearchResponse searchResponse = (SearchResponse) obj;
        return Intrinsics.areEqual(this.hasMore, searchResponse.hasMore) && Intrinsics.areEqual(this.mobileSupport, searchResponse.mobileSupport) && Intrinsics.areEqual(this.users, searchResponse.users);
    }

    public int hashCode() {
        Boolean bool = this.hasMore;
        int i = 0;
        int hashCode = (bool != null ? bool.hashCode() : 0) * 31;
        Boolean bool2 = this.mobileSupport;
        int hashCode2 = (hashCode + (bool2 != null ? bool2.hashCode() : 0)) * 31;
        List<User> list = this.users;
        if (list != null) {
            i = list.hashCode();
        }
        return hashCode2 + i;
    }

    public String toString() {
        return "SearchResponse(hasMore=" + this.hasMore + ", mobileSupport=" + this.mobileSupport + ", users=" + this.users + ")";
    }

    public final Boolean getHasMore() {
        return this.hasMore;
    }

    public final Boolean getMobileSupport() {
        return this.mobileSupport;
    }

    public final List<User> getUsers() {
        return this.users;
    }

    public SearchResponse(Boolean bool, Boolean bool2, List<User> list) {
        this.hasMore = bool;
        this.mobileSupport = bool2;
        this.users = list;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ SearchResponse(Boolean bool, Boolean bool2, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : bool, (i & 2) != 0 ? null : bool2, (i & 4) != 0 ? null : list);
    }
}
