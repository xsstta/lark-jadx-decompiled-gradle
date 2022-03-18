package com.ss.android.lark.create.groupchat.dto;

import com.bytedance.lark.pb.im.v1.CreateFaceToFaceApplicationResponse;
import com.bytedance.lark.pb.im.v1.FaceToFaceApplicant;
import com.bytedance.lark.pb.im.v1.PushFaceToFaceApplicants;
import com.ss.android.lark.create.groupchat.dto.ApplicantInfo;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\b\u0018\u0000 \u00182\u00020\u0001:\u0001\u0018B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0002\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0003J-\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001R\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\f¨\u0006\u0019"}, d2 = {"Lcom/ss/android/lark/create/groupchat/dto/ApplicantsResponse;", "", "applicationId", "", "token", "applicants", "", "Lcom/ss/android/lark/create/groupchat/dto/ApplicantInfo;", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "getApplicants", "()Ljava/util/List;", "getApplicationId", "()Ljava/lang/String;", "getToken", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "Companion", "im_create-group-chat_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.create.groupchat.dto.b */
public final class ApplicantsResponse {

    /* renamed from: a */
    public static final Companion f93536a = new Companion(null);

    /* renamed from: b */
    private final String f93537b;

    /* renamed from: c */
    private final String f93538c;

    /* renamed from: d */
    private final List<ApplicantInfo> f93539d;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ApplicantsResponse)) {
            return false;
        }
        ApplicantsResponse bVar = (ApplicantsResponse) obj;
        return Intrinsics.areEqual(this.f93537b, bVar.f93537b) && Intrinsics.areEqual(this.f93538c, bVar.f93538c) && Intrinsics.areEqual(this.f93539d, bVar.f93539d);
    }

    public int hashCode() {
        String str = this.f93537b;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f93538c;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        List<ApplicantInfo> list = this.f93539d;
        if (list != null) {
            i = list.hashCode();
        }
        return hashCode2 + i;
    }

    public String toString() {
        return "ApplicantsResponse(applicationId=" + this.f93537b + ", token=" + this.f93538c + ", applicants=" + this.f93539d + ")";
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0007H\u0007¨\u0006\b"}, d2 = {"Lcom/ss/android/lark/create/groupchat/dto/ApplicantsResponse$Companion;", "", "()V", "from", "Lcom/ss/android/lark/create/groupchat/dto/ApplicantsResponse;", "origin", "Lcom/bytedance/lark/pb/im/v1/CreateFaceToFaceApplicationResponse;", "Lcom/bytedance/lark/pb/im/v1/PushFaceToFaceApplicants;", "im_create-group-chat_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.create.groupchat.dto.b$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        /* renamed from: a */
        public final ApplicantsResponse mo133799a(CreateFaceToFaceApplicationResponse createFaceToFaceApplicationResponse) {
            Intrinsics.checkParameterIsNotNull(createFaceToFaceApplicationResponse, "origin");
            List<FaceToFaceApplicant> list = createFaceToFaceApplicationResponse.applicants;
            Intrinsics.checkExpressionValueIsNotNull(list, "origin.applicants");
            List<FaceToFaceApplicant> list2 = list;
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
            for (T t : list2) {
                ApplicantInfo.Companion aVar = ApplicantInfo.f93531a;
                Intrinsics.checkExpressionValueIsNotNull(t, "it");
                arrayList.add(aVar.mo133791a(t));
            }
            String str = createFaceToFaceApplicationResponse.application_id;
            Intrinsics.checkExpressionValueIsNotNull(str, "origin.application_id");
            String str2 = createFaceToFaceApplicationResponse.token;
            Intrinsics.checkExpressionValueIsNotNull(str2, "origin.token");
            return new ApplicantsResponse(str, str2, arrayList);
        }

        @JvmStatic
        /* renamed from: a */
        public final ApplicantsResponse mo133800a(PushFaceToFaceApplicants pushFaceToFaceApplicants) {
            Intrinsics.checkParameterIsNotNull(pushFaceToFaceApplicants, "origin");
            List<FaceToFaceApplicant> list = pushFaceToFaceApplicants.applicants;
            Intrinsics.checkExpressionValueIsNotNull(list, "origin.applicants");
            List<FaceToFaceApplicant> list2 = list;
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
            for (T t : list2) {
                ApplicantInfo.Companion aVar = ApplicantInfo.f93531a;
                Intrinsics.checkExpressionValueIsNotNull(t, "it");
                arrayList.add(aVar.mo133791a(t));
            }
            String str = pushFaceToFaceApplicants.application_id;
            Intrinsics.checkExpressionValueIsNotNull(str, "origin.application_id");
            return new ApplicantsResponse(str, null, arrayList, 2, null);
        }
    }

    /* renamed from: a */
    public final String mo133793a() {
        return this.f93537b;
    }

    /* renamed from: b */
    public final String mo133794b() {
        return this.f93538c;
    }

    /* renamed from: c */
    public final List<ApplicantInfo> mo133795c() {
        return this.f93539d;
    }

    public ApplicantsResponse(String str, String str2, List<ApplicantInfo> list) {
        Intrinsics.checkParameterIsNotNull(str, "applicationId");
        Intrinsics.checkParameterIsNotNull(str2, "token");
        Intrinsics.checkParameterIsNotNull(list, "applicants");
        this.f93537b = str;
        this.f93538c = str2;
        this.f93539d = list;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ApplicantsResponse(String str, String str2, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? "" : str2, list);
    }
}
