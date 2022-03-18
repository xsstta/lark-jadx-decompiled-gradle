package com.ss.android.lark.mm.module.share.model;

import com.google.gson.annotations.SerializedName;
import java.io.Serializable;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\u0000\n\u0002\b\u0003\b\b\u0018\u00002\u00020\u0001BG\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b¢\u0006\u0002\u0010\rJ\u0010\u0010\u001a\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u000fJ\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u0010\u0010\u001d\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010\u0016J\u0011\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bHÆ\u0003JP\u0010\u001f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bHÆ\u0001¢\u0006\u0002\u0010 J\u0013\u0010!\u001a\u00020\u00032\b\u0010\"\u001a\u0004\u0018\u00010#HÖ\u0003J\t\u0010$\u001a\u00020\tHÖ\u0001J\t\u0010%\u001a\u00020\u0007HÖ\u0001R\u001a\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u000e\u0010\u000fR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u001a\u0010\b\u001a\u0004\u0018\u00010\t8\u0006X\u0004¢\u0006\n\n\u0002\u0010\u0017\u001a\u0004\b\u0015\u0010\u0016R\u001e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019¨\u0006&"}, d2 = {"Lcom/ss/android/lark/mm/module/share/model/ShareResponse;", "Ljava/io/Serializable;", "hasMore", "", "linkShare", "Lcom/ss/android/lark/mm/module/share/model/LinkShare;", "ownerId", "", "total", "", "users", "", "Lcom/ss/android/lark/mm/module/share/model/User;", "(Ljava/lang/Boolean;Lcom/ss/android/lark/mm/module/share/model/LinkShare;Ljava/lang/String;Ljava/lang/Integer;Ljava/util/List;)V", "getHasMore", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getLinkShare", "()Lcom/ss/android/lark/mm/module/share/model/LinkShare;", "getOwnerId", "()Ljava/lang/String;", "getTotal", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getUsers", "()Ljava/util/List;", "component1", "component2", "component3", "component4", "component5", "copy", "(Ljava/lang/Boolean;Lcom/ss/android/lark/mm/module/share/model/LinkShare;Ljava/lang/String;Ljava/lang/Integer;Ljava/util/List;)Lcom/ss/android/lark/mm/module/share/model/ShareResponse;", "equals", "other", "", "hashCode", "toString", "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class ShareResponse implements Serializable {
    @SerializedName("has_more")
    private final Boolean hasMore;
    @SerializedName("link_share")
    private final LinkShare linkShare;
    @SerializedName("owner_id")
    private final String ownerId;
    @SerializedName("total")
    private final Integer total;
    @SerializedName("users")
    private final List<User> users;

    public ShareResponse() {
        this(null, null, null, null, null, 31, null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: com.ss.android.lark.mm.module.share.model.ShareResponse */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ShareResponse copy$default(ShareResponse shareResponse, Boolean bool, LinkShare linkShare2, String str, Integer num, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            bool = shareResponse.hasMore;
        }
        if ((i & 2) != 0) {
            linkShare2 = shareResponse.linkShare;
        }
        if ((i & 4) != 0) {
            str = shareResponse.ownerId;
        }
        if ((i & 8) != 0) {
            num = shareResponse.total;
        }
        if ((i & 16) != 0) {
            list = shareResponse.users;
        }
        return shareResponse.copy(bool, linkShare2, str, num, list);
    }

    public final Boolean component1() {
        return this.hasMore;
    }

    public final LinkShare component2() {
        return this.linkShare;
    }

    public final String component3() {
        return this.ownerId;
    }

    public final Integer component4() {
        return this.total;
    }

    public final List<User> component5() {
        return this.users;
    }

    public final ShareResponse copy(Boolean bool, LinkShare linkShare2, String str, Integer num, List<User> list) {
        return new ShareResponse(bool, linkShare2, str, num, list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ShareResponse)) {
            return false;
        }
        ShareResponse shareResponse = (ShareResponse) obj;
        return Intrinsics.areEqual(this.hasMore, shareResponse.hasMore) && Intrinsics.areEqual(this.linkShare, shareResponse.linkShare) && Intrinsics.areEqual(this.ownerId, shareResponse.ownerId) && Intrinsics.areEqual(this.total, shareResponse.total) && Intrinsics.areEqual(this.users, shareResponse.users);
    }

    public int hashCode() {
        Boolean bool = this.hasMore;
        int i = 0;
        int hashCode = (bool != null ? bool.hashCode() : 0) * 31;
        LinkShare linkShare2 = this.linkShare;
        int hashCode2 = (hashCode + (linkShare2 != null ? linkShare2.hashCode() : 0)) * 31;
        String str = this.ownerId;
        int hashCode3 = (hashCode2 + (str != null ? str.hashCode() : 0)) * 31;
        Integer num = this.total;
        int hashCode4 = (hashCode3 + (num != null ? num.hashCode() : 0)) * 31;
        List<User> list = this.users;
        if (list != null) {
            i = list.hashCode();
        }
        return hashCode4 + i;
    }

    public String toString() {
        return "ShareResponse(hasMore=" + this.hasMore + ", linkShare=" + this.linkShare + ", ownerId=" + this.ownerId + ", total=" + this.total + ", users=" + this.users + ")";
    }

    public final Boolean getHasMore() {
        return this.hasMore;
    }

    public final LinkShare getLinkShare() {
        return this.linkShare;
    }

    public final String getOwnerId() {
        return this.ownerId;
    }

    public final Integer getTotal() {
        return this.total;
    }

    public final List<User> getUsers() {
        return this.users;
    }

    public ShareResponse(Boolean bool, LinkShare linkShare2, String str, Integer num, List<User> list) {
        this.hasMore = bool;
        this.linkShare = linkShare2;
        this.ownerId = str;
        this.total = num;
        this.users = list;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ShareResponse(Boolean bool, LinkShare linkShare2, String str, Integer num, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : bool, (i & 2) != 0 ? null : linkShare2, (i & 4) != 0 ? null : str, (i & 8) != 0 ? null : num, (i & 16) != 0 ? null : list);
    }
}
