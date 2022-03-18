package com.ss.android.lark.chatsetting.impl.group.ownership.applicant;

import com.ss.android.lark.chat.entity.chat.AddChatChatterApply;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001BE\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u000bJ\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0007HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0003HÆ\u0003JU\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\"\u001a\u00020#HÖ\u0001J\t\u0010$\u001a\u00020\u0003HÖ\u0001R\u001c\u0010\n\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\rR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\rR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\rR\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\r¨\u0006%"}, d2 = {"Lcom/ss/android/lark/chatsetting/impl/group/ownership/applicant/ApplicantViewData;", "", "name", "", "avatarKey", "id", "joinGroupWay", "Lcom/ss/android/lark/chat/entity/chat/AddChatChatterApply$Ways;", "inviterId", "inviterName", "additionalComments", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/ss/android/lark/chat/entity/chat/AddChatChatterApply$Ways;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAdditionalComments", "()Ljava/lang/String;", "setAdditionalComments", "(Ljava/lang/String;)V", "getAvatarKey", "getId", "getInviterId", "getInviterName", "getJoinGroupWay", "()Lcom/ss/android/lark/chat/entity/chat/AddChatChatterApply$Ways;", "getName", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "", "toString", "im_chatsetting_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.chatsetting.impl.group.ownership.applicant.g */
public final class ApplicantViewData {

    /* renamed from: a */
    private final String f89601a;

    /* renamed from: b */
    private final String f89602b;

    /* renamed from: c */
    private final String f89603c;

    /* renamed from: d */
    private final AddChatChatterApply.Ways f89604d;

    /* renamed from: e */
    private final String f89605e;

    /* renamed from: f */
    private final String f89606f;

    /* renamed from: g */
    private String f89607g;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ApplicantViewData)) {
            return false;
        }
        ApplicantViewData gVar = (ApplicantViewData) obj;
        return Intrinsics.areEqual(this.f89601a, gVar.f89601a) && Intrinsics.areEqual(this.f89602b, gVar.f89602b) && Intrinsics.areEqual(this.f89603c, gVar.f89603c) && Intrinsics.areEqual(this.f89604d, gVar.f89604d) && Intrinsics.areEqual(this.f89605e, gVar.f89605e) && Intrinsics.areEqual(this.f89606f, gVar.f89606f) && Intrinsics.areEqual(this.f89607g, gVar.f89607g);
    }

    public int hashCode() {
        String str = this.f89601a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f89602b;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f89603c;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        AddChatChatterApply.Ways ways = this.f89604d;
        int hashCode4 = (hashCode3 + (ways != null ? ways.hashCode() : 0)) * 31;
        String str4 = this.f89605e;
        int hashCode5 = (hashCode4 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.f89606f;
        int hashCode6 = (hashCode5 + (str5 != null ? str5.hashCode() : 0)) * 31;
        String str6 = this.f89607g;
        if (str6 != null) {
            i = str6.hashCode();
        }
        return hashCode6 + i;
    }

    public String toString() {
        return "ApplicantViewData(name=" + this.f89601a + ", avatarKey=" + this.f89602b + ", id=" + this.f89603c + ", joinGroupWay=" + this.f89604d + ", inviterId=" + this.f89605e + ", inviterName=" + this.f89606f + ", additionalComments=" + this.f89607g + ")";
    }

    /* renamed from: a */
    public final String mo128130a() {
        return this.f89601a;
    }

    /* renamed from: b */
    public final String mo128131b() {
        return this.f89602b;
    }

    /* renamed from: c */
    public final String mo128132c() {
        return this.f89603c;
    }

    /* renamed from: d */
    public final AddChatChatterApply.Ways mo128133d() {
        return this.f89604d;
    }

    /* renamed from: e */
    public final String mo128134e() {
        return this.f89605e;
    }

    /* renamed from: f */
    public final String mo128136f() {
        return this.f89606f;
    }

    /* renamed from: g */
    public final String mo128137g() {
        return this.f89607g;
    }

    public ApplicantViewData(String str, String str2, String str3, AddChatChatterApply.Ways ways, String str4, String str5, String str6) {
        Intrinsics.checkParameterIsNotNull(str, "name");
        Intrinsics.checkParameterIsNotNull(str2, "avatarKey");
        Intrinsics.checkParameterIsNotNull(str3, "id");
        Intrinsics.checkParameterIsNotNull(ways, "joinGroupWay");
        this.f89601a = str;
        this.f89602b = str2;
        this.f89603c = str3;
        this.f89604d = ways;
        this.f89605e = str4;
        this.f89606f = str5;
        this.f89607g = str6;
    }
}
