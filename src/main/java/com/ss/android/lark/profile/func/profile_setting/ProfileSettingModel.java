package com.ss.android.lark.profile.func.profile_setting;

import android.net.Uri;
import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.google.firebase.messaging.Constants;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.mvp.BaseModel;
import com.ss.android.lark.profile.C52239a;
import com.ss.android.lark.profile.dependency.IProfileModuleDependency;
import com.ss.android.lark.profile.func.profile_setting.IProfileSettingContract;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u00182\u00020\u00012\u00020\u0002:\u0001\u0018B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0016\u0010\u000b\u001a\u00020\f2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\t0\u000eH\u0016J\n\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0016J\n\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0016J\b\u0010\u0012\u001a\u00020\u0013H\u0016J\b\u0010\u0014\u001a\u00020\tH\u0016J\b\u0010\u0015\u001a\u00020\tH\u0016J\u001e\u0010\u0016\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\t2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\t0\u000eH\u0016J\b\u0010\u0017\u001a\u00020\fH\u0016R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u000e\u0010\b\u001a\u00020\tX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\tX\u000e¢\u0006\u0002\n\u0000¨\u0006\u0019"}, d2 = {"Lcom/ss/android/lark/profile/func/profile_setting/ProfileSettingModel;", "Lcom/larksuite/framework/mvp/BaseModel;", "Lcom/ss/android/lark/profile/func/profile_setting/IProfileSettingContract$IModel;", "mInitData", "Lcom/ss/android/lark/profile/func/profile_setting/ProfileSettingInitData;", "(Lcom/ss/android/lark/profile/func/profile_setting/ProfileSettingInitData;)V", "getMInitData", "()Lcom/ss/android/lark/profile/func/profile_setting/ProfileSettingInitData;", "mIsBlocked", "", "mIsDeleted", "deleteUser", "", "callback", "Lcom/larksuite/framework/callback/IGetDataCallback;", "getCurrentUserId", "", "getReportUrl", "getSettingInitViewData", "Lcom/ss/android/lark/profile/func/profile_setting/InitViewData;", "isBlocked", "isDeleted", "setBlockStatus", "setDeleted", "Companion", "core_profile_profile_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.profile.func.profile_setting.d */
public final class ProfileSettingModel extends BaseModel implements IProfileSettingContract.IModel {

    /* renamed from: b */
    public static final Companion f129892b = new Companion(null);

    /* renamed from: a */
    public boolean f129893a;

    /* renamed from: c */
    private boolean f129894c;

    /* renamed from: d */
    private final ProfileSettingInitData f129895d;

    @Override // com.ss.android.lark.profile.func.profile_setting.IProfileSettingContract.IModel
    /* renamed from: d */
    public void mo179427d() {
        this.f129894c = true;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ss/android/lark/profile/func/profile_setting/ProfileSettingModel$Companion;", "", "()V", "TAG", "", "core_profile_profile_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.profile.func.profile_setting.d$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // com.ss.android.lark.profile.func.profile_setting.IProfileSettingContract.IModel
    /* renamed from: b */
    public boolean mo179425b() {
        return this.f129893a;
    }

    @Override // com.ss.android.lark.profile.func.profile_setting.IProfileSettingContract.IModel
    /* renamed from: c */
    public boolean mo179426c() {
        return this.f129894c;
    }

    @Override // com.ss.android.lark.profile.func.profile_setting.IProfileSettingContract.IModel
    /* renamed from: a */
    public String mo179422a() {
        return this.f129895d.getUserId();
    }

    @Override // com.ss.android.lark.profile.func.profile_setting.IProfileSettingContract.IModel
    /* renamed from: f */
    public InitViewData mo179429f() {
        boolean showCallSettingItem = this.f129895d.getShowCallSettingItem();
        return new InitViewData(this.f129895d.getShowBlockItem(), this.f129895d.isBlock(), this.f129895d.getShowReportItem(), showCallSettingItem, this.f129895d.getShowDeleteItem());
    }

    @Override // com.ss.android.lark.profile.func.profile_setting.IProfileSettingContract.IModel
    /* renamed from: e */
    public String mo179428e() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        String userId = this.f129895d.getUserId();
        if (userId != null) {
            linkedHashMap.put("chatter_id", userId);
            IProfileModuleDependency d = C52239a.m202617d();
            Intrinsics.checkExpressionValueIsNotNull(d, "ProfileModule.getDependency()");
            IProfileModuleDependency.AbstractC52253g q = d.mo133587q();
            Intrinsics.checkExpressionValueIsNotNull(q, "ProfileModule.getDependency().loginDependency");
            linkedHashMap.put("is_cross_tenant", Integer.valueOf(!TextUtils.equals(this.f129895d.getTenantId(), q.mo133624c()) ? 1 : 0));
            StringBuilder sb = new StringBuilder();
            sb.append("https://");
            IProfileModuleDependency d2 = C52239a.m202617d();
            Intrinsics.checkExpressionValueIsNotNull(d2, "ProfileModule.getDependency()");
            sb.append(d2.mo133545a());
            sb.append("/report/?type=chatter&params=");
            sb.append(Uri.encode(JSONObject.toJSONString(linkedHashMap)));
            return sb.toString();
        }
        throw new TypeCastException("null cannot be cast to non-null type kotlin.Any");
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0017\u0010\u0007\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0002\u0010\t¨\u0006\n"}, d2 = {"com/ss/android/lark/profile/func/profile_setting/ProfileSettingModel$setBlockStatus$1", "Lcom/larksuite/framework/callback/IGetDataCallback;", "", "onError", "", "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onSuccess", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "(Ljava/lang/Boolean;)V", "core_profile_profile_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.profile.func.profile_setting.d$b */
    public static final class C52446b implements IGetDataCallback<Boolean> {

        /* renamed from: a */
        final /* synthetic */ ProfileSettingModel f129896a;

        /* renamed from: b */
        final /* synthetic */ boolean f129897b;

        /* renamed from: c */
        final /* synthetic */ IGetDataCallback f129898c;

        /* renamed from: a */
        public void onSuccess(Boolean bool) {
            this.f129896a.f129893a = this.f129897b;
            this.f129898c.onSuccess(bool);
        }

        @Override // com.larksuite.framework.callback.IGetDataCallback
        public void onError(ErrorResult errorResult) {
            Intrinsics.checkParameterIsNotNull(errorResult, "err");
            this.f129898c.onError(errorResult);
        }

        C52446b(ProfileSettingModel dVar, boolean z, IGetDataCallback iGetDataCallback) {
            this.f129896a = dVar;
            this.f129897b = z;
            this.f129898c = iGetDataCallback;
        }
    }

    public ProfileSettingModel(ProfileSettingInitData profileSettingInitData) {
        Intrinsics.checkParameterIsNotNull(profileSettingInitData, "mInitData");
        this.f129895d = profileSettingInitData;
        this.f129893a = profileSettingInitData.isBlock();
    }

    @Override // com.ss.android.lark.profile.func.profile_setting.IProfileSettingContract.IModel
    /* renamed from: a */
    public void mo179423a(IGetDataCallback<Boolean> iGetDataCallback) {
        Intrinsics.checkParameterIsNotNull(iGetDataCallback, "callback");
        IProfileModuleDependency d = C52239a.m202617d();
        Intrinsics.checkExpressionValueIsNotNull(d, "ProfileModule.getDependency()");
        d.mo133582l().mo133659b(this.f129895d.getUserId(), getCallbackManager().wrapAndAddGetDataCallback(iGetDataCallback));
    }

    @Override // com.ss.android.lark.profile.func.profile_setting.IProfileSettingContract.IModel
    /* renamed from: a */
    public void mo179424a(boolean z, IGetDataCallback<Boolean> iGetDataCallback) {
        Intrinsics.checkParameterIsNotNull(iGetDataCallback, "callback");
        IProfileModuleDependency d = C52239a.m202617d();
        Intrinsics.checkExpressionValueIsNotNull(d, "ProfileModule.getDependency()");
        d.mo133582l().mo133657a(this.f129895d.getUserId(), z, getCallbackManager().wrapAndAddGetDataCallback(new C52446b(this, z, iGetDataCallback)));
    }
}
