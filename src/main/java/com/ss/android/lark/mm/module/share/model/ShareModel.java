package com.ss.android.lark.mm.module.share.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B3\u0012\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\tJ\u000f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0011\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\bHÆ\u0003J7\u0010\u0017\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bHÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bHÖ\u0003J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001R\"\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R \u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u000b\"\u0004\b\u0013\u0010\r¨\u0006 "}, d2 = {"Lcom/ss/android/lark/mm/module/share/model/ShareModel;", "Ljava/io/Serializable;", "searchList", "", "Lcom/ss/android/lark/mm/module/share/model/User;", "collaboratorList", "", "linkShare", "Lcom/ss/android/lark/mm/module/share/model/LinkShare;", "(Ljava/util/List;Ljava/util/List;Lcom/ss/android/lark/mm/module/share/model/LinkShare;)V", "getCollaboratorList", "()Ljava/util/List;", "setCollaboratorList", "(Ljava/util/List;)V", "getLinkShare", "()Lcom/ss/android/lark/mm/module/share/model/LinkShare;", "setLinkShare", "(Lcom/ss/android/lark/mm/module/share/model/LinkShare;)V", "getSearchList", "setSearchList", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class ShareModel implements Serializable {
    private List<User> collaboratorList;
    private LinkShare linkShare;
    private List<User> searchList;

    public ShareModel() {
        this(null, null, null, 7, null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.ss.android.lark.mm.module.share.model.ShareModel */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ShareModel copy$default(ShareModel shareModel, List list, List list2, LinkShare linkShare2, int i, Object obj) {
        if ((i & 1) != 0) {
            list = shareModel.searchList;
        }
        if ((i & 2) != 0) {
            list2 = shareModel.collaboratorList;
        }
        if ((i & 4) != 0) {
            linkShare2 = shareModel.linkShare;
        }
        return shareModel.copy(list, list2, linkShare2);
    }

    public final List<User> component1() {
        return this.searchList;
    }

    public final List<User> component2() {
        return this.collaboratorList;
    }

    public final LinkShare component3() {
        return this.linkShare;
    }

    public final ShareModel copy(List<User> list, List<User> list2, LinkShare linkShare2) {
        Intrinsics.checkParameterIsNotNull(list, "searchList");
        return new ShareModel(list, list2, linkShare2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ShareModel)) {
            return false;
        }
        ShareModel shareModel = (ShareModel) obj;
        return Intrinsics.areEqual(this.searchList, shareModel.searchList) && Intrinsics.areEqual(this.collaboratorList, shareModel.collaboratorList) && Intrinsics.areEqual(this.linkShare, shareModel.linkShare);
    }

    public int hashCode() {
        List<User> list = this.searchList;
        int i = 0;
        int hashCode = (list != null ? list.hashCode() : 0) * 31;
        List<User> list2 = this.collaboratorList;
        int hashCode2 = (hashCode + (list2 != null ? list2.hashCode() : 0)) * 31;
        LinkShare linkShare2 = this.linkShare;
        if (linkShare2 != null) {
            i = linkShare2.hashCode();
        }
        return hashCode2 + i;
    }

    public String toString() {
        return "ShareModel(searchList=" + this.searchList + ", collaboratorList=" + this.collaboratorList + ", linkShare=" + this.linkShare + ")";
    }

    public final List<User> getCollaboratorList() {
        return this.collaboratorList;
    }

    public final LinkShare getLinkShare() {
        return this.linkShare;
    }

    public final List<User> getSearchList() {
        return this.searchList;
    }

    public final void setCollaboratorList(List<User> list) {
        this.collaboratorList = list;
    }

    public final void setLinkShare(LinkShare linkShare2) {
        this.linkShare = linkShare2;
    }

    public final void setSearchList(List<User> list) {
        Intrinsics.checkParameterIsNotNull(list, "<set-?>");
        this.searchList = list;
    }

    public ShareModel(List<User> list, List<User> list2, LinkShare linkShare2) {
        Intrinsics.checkParameterIsNotNull(list, "searchList");
        this.searchList = list;
        this.collaboratorList = list2;
        this.linkShare = linkShare2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ShareModel(List list, List list2, LinkShare linkShare2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new ArrayList() : list, (i & 2) != 0 ? null : list2, (i & 4) != 0 ? null : linkShare2);
    }
}
