package com.ss.android.lark.invitation.v2.feat.edu.bean;

import com.bytedance.lark.pb.contact.v1.ClassPathName;
import com.bytedance.lark.pb.contact.v1.GetDepartmentInvitationUrlResponse;
import com.larksuite.suite.R;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.utils.UIHelper;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0010\u0018\u0000 \u001b2\u00020\u0001:\u0001\u001bB\u0005¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0018\u001a\u00020\fJ\u0006\u0010\u0019\u001a\u00020\fJ\u0006\u0010\u001a\u001a\u00020\fR\u001e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0004@BX.¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u001e\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\b@BX\u000e¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u001e\u0010\r\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\f@BX.¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u001e\u0010\u0010\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\f@BX.¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000fR\u001e\u0010\u0012\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\f@BX.¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000fR\u001e\u0010\u0014\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\f@BX.¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u000fR\u001e\u0010\u0016\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\f@BX.¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u000f¨\u0006\u001c"}, d2 = {"Lcom/ss/android/lark/invitation/v2/feat/edu/bean/EduInvitation;", "", "()V", "<set-?>", "Lcom/bytedance/lark/pb/contact/v1/ClassPathName;", "classPathName", "getClassPathName", "()Lcom/bytedance/lark/pb/contact/v1/ClassPathName;", "", "expiredTimestamp", "getExpiredTimestamp", "()J", "", "invitationMsg", "getInvitationMsg", "()Ljava/lang/String;", "invitationQrUrl", "getInvitationQrUrl", "invitationUrl", "getInvitationUrl", "inviterAvatar", "getInviterAvatar", "inviterName", "getInviterName", "getExpiredTime", "getShareMsg", "getShareTitle", "Companion", "core_invitation_v2_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.invitation.v2.feat.edu.a.a */
public final class EduInvitation {

    /* renamed from: h */
    public static final Companion f102065h = new Companion(null);

    /* renamed from: a */
    public String f102066a;

    /* renamed from: b */
    public String f102067b;

    /* renamed from: c */
    public long f102068c;

    /* renamed from: d */
    public String f102069d;

    /* renamed from: e */
    public String f102070e;

    /* renamed from: f */
    public ClassPathName f102071f;

    /* renamed from: g */
    public String f102072g;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bR\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/ss/android/lark/invitation/v2/feat/edu/bean/EduInvitation$Companion;", "", "()V", "TAG", "", "parse", "Lcom/ss/android/lark/invitation/v2/feat/edu/bean/EduInvitation;", "response", "Lcom/bytedance/lark/pb/contact/v1/GetDepartmentInvitationUrlResponse;", "core_invitation_v2_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.invitation.v2.feat.edu.a.a$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final EduInvitation mo145787a(GetDepartmentInvitationUrlResponse getDepartmentInvitationUrlResponse) {
            Intrinsics.checkParameterIsNotNull(getDepartmentInvitationUrlResponse, "response");
            EduInvitation aVar = new EduInvitation();
            String str = getDepartmentInvitationUrlResponse.invitation_url;
            Intrinsics.checkExpressionValueIsNotNull(str, "response.invitation_url");
            aVar.f102066a = str;
            String str2 = getDepartmentInvitationUrlResponse.invitation_qr_url;
            Intrinsics.checkExpressionValueIsNotNull(str2, "response.invitation_qr_url");
            aVar.f102067b = str2;
            Long l = getDepartmentInvitationUrlResponse.expired_timestamp;
            Intrinsics.checkExpressionValueIsNotNull(l, "response.expired_timestamp");
            aVar.f102068c = l.longValue();
            String str3 = getDepartmentInvitationUrlResponse.inviter_name;
            Intrinsics.checkExpressionValueIsNotNull(str3, "response.inviter_name");
            aVar.f102069d = str3;
            String str4 = getDepartmentInvitationUrlResponse.inviter_avatar;
            Intrinsics.checkExpressionValueIsNotNull(str4, "response.inviter_avatar");
            aVar.f102070e = str4;
            ClassPathName classPathName = getDepartmentInvitationUrlResponse.class_path_name;
            if (classPathName == null) {
                classPathName = new ClassPathName.C16140a().build();
                Intrinsics.checkExpressionValueIsNotNull(classPathName, "ClassPathName.Builder().build()");
            }
            aVar.f102071f = classPathName;
            String str5 = getDepartmentInvitationUrlResponse.invitation_msg;
            Intrinsics.checkExpressionValueIsNotNull(str5, "response.invitation_msg");
            aVar.f102072g = str5;
            return aVar;
        }
    }

    /* renamed from: a */
    public final String mo145778a() {
        String str = this.f102066a;
        if (str == null) {
            Intrinsics.throwUninitializedPropertyAccessException("invitationUrl");
        }
        return str;
    }

    /* renamed from: b */
    public final String mo145779b() {
        String str = this.f102067b;
        if (str == null) {
            Intrinsics.throwUninitializedPropertyAccessException("invitationQrUrl");
        }
        return str;
    }

    /* renamed from: c */
    public final String mo145780c() {
        String str = this.f102069d;
        if (str == null) {
            Intrinsics.throwUninitializedPropertyAccessException("inviterName");
        }
        return str;
    }

    /* renamed from: d */
    public final String mo145781d() {
        String str = this.f102070e;
        if (str == null) {
            Intrinsics.throwUninitializedPropertyAccessException("inviterAvatar");
        }
        return str;
    }

    /* renamed from: e */
    public final ClassPathName mo145782e() {
        ClassPathName classPathName = this.f102071f;
        if (classPathName == null) {
            Intrinsics.throwUninitializedPropertyAccessException("classPathName");
        }
        return classPathName;
    }

    /* renamed from: f */
    public final String mo145783f() {
        String str = this.f102072g;
        if (str == null) {
            Intrinsics.throwUninitializedPropertyAccessException("invitationMsg");
        }
        return str;
    }

    /* renamed from: h */
    public final String mo145785h() {
        String str = this.f102072g;
        if (str == null) {
            Intrinsics.throwUninitializedPropertyAccessException("invitationMsg");
        }
        return str;
    }

    /* renamed from: g */
    public final String mo145784g() {
        String str = this.f102069d;
        if (str == null) {
            Intrinsics.throwUninitializedPropertyAccessException("inviterName");
        }
        String mustacheFormat = UIHelper.mustacheFormat((int) R.string.Lark_Education_TeacherInviteYouToJoinClass, "teacher", str);
        Intrinsics.checkExpressionValueIsNotNull(mustacheFormat, "UIHelper.mustacheFormat(…, \"teacher\", inviterName)");
        return mustacheFormat;
    }

    /* renamed from: i */
    public final String mo145786i() {
        String str;
        if (this.f102068c == -1) {
            str = UIHelper.getString(R.string.Lark_Invitation_AddMembersPermanentLinkQRCode);
            Intrinsics.checkExpressionValueIsNotNull(str, "UIHelper.getString(strin…mbersPermanentLinkQRCode)");
        } else {
            str = new SimpleDateFormat("yyyy-MM-dd", Locale.getDefault()).format(new Date(this.f102068c * ((long) 1000)));
            Intrinsics.checkExpressionValueIsNotNull(str, "format.format(Date(expiredTimestamp * 1000))");
        }
        Log.m165389i("InvitationModule", "expiredTime: " + str);
        return str;
    }
}
