package com.ss.android.lark.moments.impl.commonvo;

import android.content.Context;
import com.bytedance.lark.pb.moments.v1.MomentUser;
import com.ss.android.lark.moments.dependency.MomentsDependencyHolder;
import com.ss.android.lark.moments.impl.hitpoint.MomentsHitHelper;
import com.ss.android.lark.moments.impl.hitpoint.MomentsHitPoint;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\u001d\u001a\u00020\u001eH\u0016J\u0010\u0010\u001f\u001a\u00020\u001e2\u0006\u0010 \u001a\u00020!H\u0016J\u0012\u0010\"\u001a\u00020\f2\b\u0010#\u001a\u0004\u0018\u00010\u0001H\u0016J\u0012\u0010$\u001a\u00020\f2\b\u0010#\u001a\u0004\u0018\u00010\u0001H\u0016J\b\u0010%\u001a\u00020\bH\u0016R\u0014\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\fX\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\rR\u001a\u0010\u000e\u001a\u00020\fX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\r\"\u0004\b\u000f\u0010\u0010R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0011\u001a\u00020\bX\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0015\u001a\u00020\bX\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\nR\u0014\u0010\u0017\u001a\u00020\bX\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\nR\u0014\u0010\u0019\u001a\u00020\u001aX\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001c¨\u0006&"}, d2 = {"Lcom/ss/android/lark/moments/impl/commonvo/MomentsUserVM;", "Lcom/ss/android/lark/moments/impl/commonvo/IMomentsUser;", "user", "Lcom/bytedance/lark/pb/moments/v1/MomentUser;", "model", "Lcom/ss/android/lark/moments/impl/commonvo/IMomentsUserModel;", "(Lcom/bytedance/lark/pb/moments/v1/MomentUser;Lcom/ss/android/lark/moments/impl/commonvo/IMomentsUserModel;)V", "avatarKey", "", "getAvatarKey", "()Ljava/lang/String;", "isFollowed", "", "()Z", "isOngoingFollow", "setOngoingFollow", "(Z)V", "nameIndex", "getNameIndex", "getUser", "()Lcom/bytedance/lark/pb/moments/v1/MomentUser;", "userId", "getUserId", "userName", "getUserName", "userType", "Lcom/bytedance/lark/pb/moments/v1/MomentUser$Type;", "getUserType", "()Lcom/bytedance/lark/pb/moments/v1/MomentUser$Type;", "clickFollowing", "", "clickUser", "context", "Landroid/content/Context;", "isContentSame", "diffable", "isItemSame", "toString", "im_moments-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.moments.impl.commonvo.g */
public final class MomentsUserVM implements IMomentsUser {

    /* renamed from: a */
    private final String f119467a;

    /* renamed from: b */
    private final String f119468b;

    /* renamed from: c */
    private final String f119469c;

    /* renamed from: d */
    private final String f119470d;

    /* renamed from: e */
    private final boolean f119471e;

    /* renamed from: f */
    private boolean f119472f;

    /* renamed from: g */
    private final MomentUser.Type f119473g;

    /* renamed from: h */
    private final MomentUser f119474h;

    /* renamed from: i */
    private final IMomentsUserModel f119475i;

    @Override // com.ss.android.lark.moments.impl.commonvo.IMomentsUser
    /* renamed from: a */
    public String mo166361a() {
        return this.f119467a;
    }

    @Override // com.ss.android.lark.moments.impl.commonvo.IMomentsUser
    /* renamed from: b */
    public String mo166363b() {
        return this.f119468b;
    }

    @Override // com.ss.android.lark.moments.impl.commonvo.IMomentsUser
    /* renamed from: c */
    public String mo166364c() {
        return this.f119469c;
    }

    @Override // com.ss.android.lark.moments.impl.commonvo.IMomentsUser
    /* renamed from: d */
    public String mo166365d() {
        return this.f119470d;
    }

    @Override // com.ss.android.lark.moments.impl.commonvo.IMomentsUser
    /* renamed from: e */
    public boolean mo166366e() {
        return this.f119471e;
    }

    @Override // com.ss.android.lark.moments.impl.commonvo.IMomentsUser
    /* renamed from: f */
    public boolean mo166367f() {
        return this.f119472f;
    }

    @Override // com.ss.android.lark.moments.impl.commonvo.IMomentsUser
    /* renamed from: g */
    public MomentUser.Type mo166368g() {
        return this.f119473g;
    }

    /* renamed from: i */
    public final MomentUser mo166471i() {
        return this.f119474h;
    }

    @Override // com.ss.android.lark.moments.impl.commonvo.IMomentsUser
    /* renamed from: h */
    public void mo166369h() {
        mo166468a(true);
        if (mo166366e()) {
            this.f119475i.unFollowUser(mo166364c());
        } else {
            this.f119475i.followUser(mo166364c());
        }
    }

    public String toString() {
        return "userId:" + mo166364c() + ", userName:" + mo166361a() + ", avatarKey:" + mo166365d() + ", isFollow:" + mo166366e() + ", isOngoingFollow:" + mo166367f();
    }

    /* renamed from: a */
    public void mo166468a(boolean z) {
        this.f119472f = z;
    }

    /* renamed from: a */
    public boolean isItemSame(IMomentsUser cVar) {
        if (cVar == null || !(cVar instanceof MomentsUserVM) || !Intrinsics.areEqual(cVar.mo166364c(), mo166364c())) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.lark.moments.impl.commonvo.IMomentsUser
    /* renamed from: a */
    public void mo166362a(Context context) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        if (this.f119474h.type == MomentUser.Type.USER) {
            MomentsHitPoint.f119720a.mo166849f(MomentsHitHelper.f119719r.mo166802c());
            MomentsDependencyHolder.f118998b.mo165899a().profileModuleDependency().mo144727a(context, mo166364c());
        }
    }

    /* renamed from: b */
    public boolean isContentSame(IMomentsUser cVar) {
        if ((cVar instanceof MomentsUserVM) && Intrinsics.areEqual(mo166361a(), cVar.mo166361a()) && Intrinsics.areEqual(mo166365d(), cVar.mo166365d()) && mo166366e() == cVar.mo166366e() && mo166367f() == ((MomentsUserVM) cVar).mo166367f()) {
            return true;
        }
        return false;
    }

    public MomentsUserVM(MomentUser momentUser, IMomentsUserModel dVar) {
        String str;
        Integer num;
        Intrinsics.checkParameterIsNotNull(momentUser, "user");
        Intrinsics.checkParameterIsNotNull(dVar, "model");
        this.f119474h = momentUser;
        this.f119475i = dVar;
        String str2 = momentUser.name;
        Intrinsics.checkExpressionValueIsNotNull(str2, "user.name");
        this.f119467a = str2;
        MomentUser.AnonymousUser anonymousUser = momentUser.anonymous;
        this.f119468b = (anonymousUser == null || (num = anonymousUser.idx) == null || (str = String.valueOf(num.intValue())) == null) ? "" : str;
        String str3 = momentUser.user_id;
        Intrinsics.checkExpressionValueIsNotNull(str3, "user.user_id");
        this.f119469c = str3;
        String str4 = momentUser.avatar_key;
        Intrinsics.checkExpressionValueIsNotNull(str4, "user.avatar_key");
        this.f119470d = str4;
        Boolean bool = momentUser.is_current_user_following;
        Intrinsics.checkExpressionValueIsNotNull(bool, "user.is_current_user_following");
        this.f119471e = bool.booleanValue();
        MomentUser.Type type = momentUser.type;
        Intrinsics.checkExpressionValueIsNotNull(type, "user.type");
        this.f119473g = type;
    }
}
