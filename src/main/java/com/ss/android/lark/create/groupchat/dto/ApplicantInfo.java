package com.ss.android.lark.create.groupchat.dto;

import com.bytedance.ee.bear.document.tips.BottomDialog;
import com.bytedance.lark.pb.im.v1.FaceToFaceApplicant;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0004\b\b\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001aB\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0000¢\u0006\u0002\u0010\u0003B+\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0014\u001a\u00020\tHÆ\u0003J1\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\tHÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u0002J\b\u0010\u0018\u001a\u00020\tH\u0016J\t\u0010\u0019\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001b"}, d2 = {"Lcom/ss/android/lark/create/groupchat/dto/ApplicantInfo;", "", "other", "(Lcom/ss/android/lark/create/groupchat/dto/ApplicantInfo;)V", BottomDialog.f17198f, "", "nickName", "avatarKey", "rank", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V", "getAvatarKey", "()Ljava/lang/String;", "getChatterId", "getNickName", "getRank", "()I", "component1", "component2", "component3", "component4", "copy", "equals", "", "hashCode", "toString", "Companion", "im_create-group-chat_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.create.groupchat.dto.a */
public final class ApplicantInfo {

    /* renamed from: a */
    public static final Companion f93531a = new Companion(null);

    /* renamed from: b */
    private final String f93532b;

    /* renamed from: c */
    private final String f93533c;

    /* renamed from: d */
    private final String f93534d;

    /* renamed from: e */
    private final int f93535e;

    public String toString() {
        return "ApplicantInfo(chatterId=" + this.f93532b + ", nickName=" + this.f93533c + ", avatarKey=" + this.f93534d + ", rank=" + this.f93535e + ")";
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0003J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0007R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/ss/android/lark/create/groupchat/dto/ApplicantInfo$Companion;", "", "()V", "DEFAULT_RANK", "", "convertUserId", "", "userId", "", "from", "Lcom/ss/android/lark/create/groupchat/dto/ApplicantInfo;", "applicants", "Lcom/bytedance/lark/pb/im/v1/FaceToFaceApplicant;", "im_create-group-chat_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.create.groupchat.dto.a$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        /* renamed from: a */
        public final String mo133792a(long j) {
            return String.valueOf(j);
        }

        @JvmStatic
        /* renamed from: a */
        public final ApplicantInfo mo133791a(FaceToFaceApplicant faceToFaceApplicant) {
            Intrinsics.checkParameterIsNotNull(faceToFaceApplicant, "applicants");
            Long l = faceToFaceApplicant.user_id;
            Intrinsics.checkExpressionValueIsNotNull(l, "applicants.user_id");
            String a = mo133792a(l.longValue());
            String str = faceToFaceApplicant.name;
            Intrinsics.checkExpressionValueIsNotNull(str, "applicants.name");
            String str2 = faceToFaceApplicant.avatar_key;
            Intrinsics.checkExpressionValueIsNotNull(str2, "applicants.avatar_key");
            return new ApplicantInfo(a, str, str2, (int) faceToFaceApplicant.rank.longValue());
        }
    }

    /* renamed from: a */
    public final String mo133784a() {
        return this.f93532b;
    }

    /* renamed from: b */
    public final String mo133785b() {
        return this.f93533c;
    }

    /* renamed from: c */
    public final String mo133786c() {
        return this.f93534d;
    }

    /* renamed from: d */
    public final int mo133787d() {
        return this.f93535e;
    }

    public int hashCode() {
        return ((((this.f93532b.hashCode() + 31) * 31) + this.f93533c.hashCode()) * 31) + this.f93534d.hashCode();
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof ApplicantInfo)) {
            return false;
        }
        ApplicantInfo aVar = (ApplicantInfo) obj;
        if (!Intrinsics.areEqual(this.f93532b, aVar.f93532b) || !Intrinsics.areEqual(this.f93533c, aVar.f93533c) || !Intrinsics.areEqual(this.f93534d, aVar.f93534d)) {
            return false;
        }
        return true;
    }

    public ApplicantInfo(String str, String str2, String str3, int i) {
        Intrinsics.checkParameterIsNotNull(str, BottomDialog.f17198f);
        Intrinsics.checkParameterIsNotNull(str2, "nickName");
        Intrinsics.checkParameterIsNotNull(str3, "avatarKey");
        this.f93532b = str;
        this.f93533c = str2;
        this.f93534d = str3;
        this.f93535e = i;
    }
}
