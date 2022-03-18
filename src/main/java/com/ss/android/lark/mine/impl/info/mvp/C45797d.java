package com.ss.android.lark.mine.impl.info.mvp;

import com.bytedance.lark.pb.basic.v1.Command;
import com.bytedance.lark.pb.basic.v1.SyncDataStrategy;
import com.bytedance.lark.pb.contact.v2.GetUserProfileRequest;
import com.bytedance.lark.pb.contact.v2.GetUserProfileResponse;
import com.google.firebase.messaging.Constants;
import com.larksuite.framework.callback.IGetDataCallback;
import com.ss.android.lark.mine.C45421b;
import com.ss.android.lark.mine.dto.TenantCertificationInfo;
import com.ss.android.lark.mine.p2270a.AbstractC45399a;
import com.ss.android.lark.sdk.SdkSender;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u0014\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"fetchTenantCertificationInfo", "", "callback", "Lcom/larksuite/framework/callback/IGetDataCallback;", "Lcom/ss/android/lark/mine/dto/TenantCertificationInfo;", "core_mine_release"}, mo238835k = 2, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.mine.impl.info.mvp.d */
public final class C45797d {

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/mine/dto/TenantCertificationInfo;", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "", "kotlin.jvm.PlatformType", "parse"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mine.impl.info.mvp.d$a */
    static final class C45798a<T> implements SdkSender.IParser<T> {

        /* renamed from: a */
        public static final C45798a f115570a = new C45798a();

        C45798a() {
        }

        /* renamed from: a */
        public final TenantCertificationInfo parse(byte[] bArr) {
            GetUserProfileResponse decode = GetUserProfileResponse.ADAPTER.decode(bArr);
            Boolean bool = decode.user_info.has_tenant_certification;
            Intrinsics.checkExpressionValueIsNotNull(bool, "response.user_info.has_tenant_certification");
            boolean booleanValue = bool.booleanValue();
            Boolean bool2 = decode.user_info.is_tenant_certification;
            Intrinsics.checkExpressionValueIsNotNull(bool2, "response.user_info.is_tenant_certification");
            return new TenantCertificationInfo(booleanValue, bool2.booleanValue(), decode.user_info.tenant_certification_url);
        }
    }

    /* renamed from: a */
    public static final void m181463a(IGetDataCallback<TenantCertificationInfo> iGetDataCallback) {
        Intrinsics.checkParameterIsNotNull(iGetDataCallback, "callback");
        AbstractC45399a a = C45421b.m180420a();
        Intrinsics.checkExpressionValueIsNotNull(a, "MineModule.getDependency()");
        AbstractC45399a.AbstractC45410k q = a.mo133458q();
        Intrinsics.checkExpressionValueIsNotNull(q, "MineModule.getDependency().loginDependency");
        GetUserProfileRequest.C16488a a2 = new GetUserProfileRequest.C16488a().mo58770a(q.mo133504e()).mo58767a(SyncDataStrategy.FORCE_SERVER);
        a2.mo58768a(GetUserProfileRequest.Scene.BY_USER_ID);
        SdkSender.asynSendRequestNonWrap(Command.GET_USER_PROFILE_V2, a2, iGetDataCallback, C45798a.f115570a);
    }
}
