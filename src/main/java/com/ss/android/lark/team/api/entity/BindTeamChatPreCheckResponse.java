package com.ss.android.lark.team.api.entity;

import java.io.Serializable;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B;\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0002\u0010\nJ\u000f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0002\u0010\fJ\t\u0010\u0017\u001a\u00020\bHÆ\u0003J\t\u0010\u0018\u001a\u00020\bHÆ\u0003JN\u0010\u0019\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\bHÆ\u0001¢\u0006\u0002\u0010\u001aJ\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eHÖ\u0003J\t\u0010\u001f\u001a\u00020\bHÖ\u0001J\t\u0010 \u001a\u00020!HÖ\u0001R\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0004¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\t\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000fR\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0011¨\u0006\""}, d2 = {"Lcom/ss/android/lark/team/api/entity/BindTeamChatPreCheckResponse;", "Ljava/io/Serializable;", "toAddTeamMemberIds", "", "", "toAddChatMemberIds", "chatChattersVersion", "toAddTeamMemberCount", "", "toAddChatChatterCount", "(Ljava/util/List;Ljava/util/List;Ljava/lang/Long;II)V", "getChatChattersVersion", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getToAddChatChatterCount", "()I", "getToAddChatMemberIds", "()Ljava/util/List;", "getToAddTeamMemberCount", "getToAddTeamMemberIds", "component1", "component2", "component3", "component4", "component5", "copy", "(Ljava/util/List;Ljava/util/List;Ljava/lang/Long;II)Lcom/ss/android/lark/team/api/entity/BindTeamChatPreCheckResponse;", "equals", "", "other", "", "hashCode", "toString", "", "im_team_team_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class BindTeamChatPreCheckResponse implements Serializable {
    private final Long chatChattersVersion;
    private final int toAddChatChatterCount;
    private final List<Long> toAddChatMemberIds;
    private final int toAddTeamMemberCount;
    private final List<Long> toAddTeamMemberIds;

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: com.ss.android.lark.team.api.entity.BindTeamChatPreCheckResponse */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ BindTeamChatPreCheckResponse copy$default(BindTeamChatPreCheckResponse bindTeamChatPreCheckResponse, List list, List list2, Long l, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            list = bindTeamChatPreCheckResponse.toAddTeamMemberIds;
        }
        if ((i3 & 2) != 0) {
            list2 = bindTeamChatPreCheckResponse.toAddChatMemberIds;
        }
        if ((i3 & 4) != 0) {
            l = bindTeamChatPreCheckResponse.chatChattersVersion;
        }
        if ((i3 & 8) != 0) {
            i = bindTeamChatPreCheckResponse.toAddTeamMemberCount;
        }
        if ((i3 & 16) != 0) {
            i2 = bindTeamChatPreCheckResponse.toAddChatChatterCount;
        }
        return bindTeamChatPreCheckResponse.copy(list, list2, l, i, i2);
    }

    public final List<Long> component1() {
        return this.toAddTeamMemberIds;
    }

    public final List<Long> component2() {
        return this.toAddChatMemberIds;
    }

    public final Long component3() {
        return this.chatChattersVersion;
    }

    public final int component4() {
        return this.toAddTeamMemberCount;
    }

    public final int component5() {
        return this.toAddChatChatterCount;
    }

    public final BindTeamChatPreCheckResponse copy(List<Long> list, List<Long> list2, Long l, int i, int i2) {
        Intrinsics.checkParameterIsNotNull(list, "toAddTeamMemberIds");
        Intrinsics.checkParameterIsNotNull(list2, "toAddChatMemberIds");
        return new BindTeamChatPreCheckResponse(list, list2, l, i, i2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BindTeamChatPreCheckResponse)) {
            return false;
        }
        BindTeamChatPreCheckResponse bindTeamChatPreCheckResponse = (BindTeamChatPreCheckResponse) obj;
        return Intrinsics.areEqual(this.toAddTeamMemberIds, bindTeamChatPreCheckResponse.toAddTeamMemberIds) && Intrinsics.areEqual(this.toAddChatMemberIds, bindTeamChatPreCheckResponse.toAddChatMemberIds) && Intrinsics.areEqual(this.chatChattersVersion, bindTeamChatPreCheckResponse.chatChattersVersion) && this.toAddTeamMemberCount == bindTeamChatPreCheckResponse.toAddTeamMemberCount && this.toAddChatChatterCount == bindTeamChatPreCheckResponse.toAddChatChatterCount;
    }

    public int hashCode() {
        List<Long> list = this.toAddTeamMemberIds;
        int i = 0;
        int hashCode = (list != null ? list.hashCode() : 0) * 31;
        List<Long> list2 = this.toAddChatMemberIds;
        int hashCode2 = (hashCode + (list2 != null ? list2.hashCode() : 0)) * 31;
        Long l = this.chatChattersVersion;
        if (l != null) {
            i = l.hashCode();
        }
        return ((((hashCode2 + i) * 31) + this.toAddTeamMemberCount) * 31) + this.toAddChatChatterCount;
    }

    public String toString() {
        return "BindTeamChatPreCheckResponse(toAddTeamMemberIds=" + this.toAddTeamMemberIds + ", toAddChatMemberIds=" + this.toAddChatMemberIds + ", chatChattersVersion=" + this.chatChattersVersion + ", toAddTeamMemberCount=" + this.toAddTeamMemberCount + ", toAddChatChatterCount=" + this.toAddChatChatterCount + ")";
    }

    public final Long getChatChattersVersion() {
        return this.chatChattersVersion;
    }

    public final int getToAddChatChatterCount() {
        return this.toAddChatChatterCount;
    }

    public final List<Long> getToAddChatMemberIds() {
        return this.toAddChatMemberIds;
    }

    public final int getToAddTeamMemberCount() {
        return this.toAddTeamMemberCount;
    }

    public final List<Long> getToAddTeamMemberIds() {
        return this.toAddTeamMemberIds;
    }

    public BindTeamChatPreCheckResponse(List<Long> list, List<Long> list2, Long l, int i, int i2) {
        Intrinsics.checkParameterIsNotNull(list, "toAddTeamMemberIds");
        Intrinsics.checkParameterIsNotNull(list2, "toAddChatMemberIds");
        this.toAddTeamMemberIds = list;
        this.toAddChatMemberIds = list2;
        this.chatChattersVersion = l;
        this.toAddTeamMemberCount = i;
        this.toAddChatChatterCount = i2;
    }
}
