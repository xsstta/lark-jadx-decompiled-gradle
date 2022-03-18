package com.ss.android.lark.profile.func.add_friend;

import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.mvp.BaseModel;
import com.ss.android.lark.biz.core.api.ContactSource;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import com.ss.android.lark.profile.C52239a;
import com.ss.android.lark.profile.dependency.IProfileModuleDependency;
import com.ss.android.lark.profile.func.add_friend.IAddFriendContract;
import com.ss.android.lark.utils.C57859q;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \"2\u00020\u00012\u00020\u0002:\u0001\"BE\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0002\u0010\rJ*\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u00042\b\u0010\u0019\u001a\u0004\u0018\u00010\u00042\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u000b0\u001bH\u0016J\b\u0010\u001c\u001a\u00020\bH\u0016J\b\u0010\u001d\u001a\u00020\u0004H\u0016J\b\u0010\u001e\u001a\u00020\u001fH\u0016J\b\u0010 \u001a\u00020\u000bH\u0016J\b\u0010!\u001a\u00020\u000bH\u0016R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0010R\u0011\u0010\f\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u0010R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000fR\u0013\u0010\u0003\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000fR\u0013\u0010\t\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u000f¨\u0006#"}, d2 = {"Lcom/ss/android/lark/profile/func/add_friend/AddFriendModel;", "Lcom/larksuite/framework/mvp/BaseModel;", "Lcom/ss/android/lark/profile/func/add_friend/IAddFriendContract$IModel;", "userId", "", "token", "chatId", ShareHitPoint.f121868c, "Lcom/ss/android/lark/biz/core/api/ContactSource;", "userName", "isHasTenantCertification", "", "isTenantCertification", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/ss/android/lark/biz/core/api/ContactSource;Ljava/lang/String;ZZ)V", "getChatId", "()Ljava/lang/String;", "()Z", "getSource", "()Lcom/ss/android/lark/biz/core/api/ContactSource;", "getToken", "getUserId", "getUserName", "addContact", "", "reason", "alias", "callback", "Lcom/larksuite/framework/callback/IGetDataCallback;", "getContactSource", "getEncryptUserId", "getInitViewData", "Lcom/ss/android/lark/profile/func/add_friend/AddFriendViewData;", "getIsHasTenantCertification", "getIsTenantCertification", "Companion", "core_profile_profile_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.profile.func.add_friend.b */
public final class AddFriendModel extends BaseModel implements IAddFriendContract.IModel {

    /* renamed from: a */
    public static final Companion f129616a = new Companion(null);

    /* renamed from: b */
    private final String f129617b;

    /* renamed from: c */
    private final String f129618c;

    /* renamed from: d */
    private final String f129619d;

    /* renamed from: e */
    private final ContactSource f129620e;

    /* renamed from: f */
    private final String f129621f;

    /* renamed from: g */
    private final boolean f129622g;

    /* renamed from: h */
    private final boolean f129623h;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ss/android/lark/profile/func/add_friend/AddFriendModel$Companion;", "", "()V", "TAG", "", "core_profile_profile_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.profile.func.add_friend.b$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // com.ss.android.lark.profile.func.add_friend.IAddFriendContract.IModel
    /* renamed from: b */
    public ContactSource mo179057b() {
        return this.f129620e;
    }

    @Override // com.ss.android.lark.profile.func.add_friend.IAddFriendContract.IModel
    /* renamed from: d */
    public boolean mo179059d() {
        return this.f129622g;
    }

    @Override // com.ss.android.lark.profile.func.add_friend.IAddFriendContract.IModel
    /* renamed from: e */
    public boolean mo179060e() {
        return this.f129623h;
    }

    @Override // com.ss.android.lark.profile.func.add_friend.IAddFriendContract.IModel
    /* renamed from: a */
    public AddFriendViewData mo179055a() {
        return new AddFriendViewData(this.f129621f, this.f129617b);
    }

    @Override // com.ss.android.lark.profile.func.add_friend.IAddFriendContract.IModel
    /* renamed from: c */
    public String mo179058c() {
        String str = this.f129617b;
        if (str == null) {
            str = this.f129618c;
        }
        if (str == null) {
            str = "";
        }
        String a = C57859q.m224565a(str);
        Intrinsics.checkExpressionValueIsNotNull(a, "EncryptUtils.uidEncryptor(userId ?: token?:\"\")");
        return a;
    }

    @Override // com.ss.android.lark.profile.func.add_friend.IAddFriendContract.IModel
    /* renamed from: a */
    public void mo179056a(String str, String str2, IGetDataCallback<Boolean> iGetDataCallback) {
        Intrinsics.checkParameterIsNotNull(iGetDataCallback, "callback");
        IProfileModuleDependency d = C52239a.m202617d();
        Intrinsics.checkExpressionValueIsNotNull(d, "ProfileModule.getDependency()");
        d.mo133582l().mo133656a(this.f129618c, this.f129617b, str, str2, this.f129619d, this.f129620e, getCallbackManager().wrapAndAddGetDataCallback(iGetDataCallback));
    }

    public AddFriendModel(String str, String str2, String str3, ContactSource contactSource, String str4, boolean z, boolean z2) {
        Intrinsics.checkParameterIsNotNull(contactSource, ShareHitPoint.f121868c);
        this.f129617b = str;
        this.f129618c = str2;
        this.f129619d = str3;
        this.f129620e = contactSource;
        this.f129621f = str4;
        this.f129622g = z;
        this.f129623h = z2;
    }
}
