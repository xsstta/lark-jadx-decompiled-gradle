package com.ss.android.lark.app.taskv2.central;

import com.bytedance.lark.pb.basic.v1.Command;
import com.ss.android.lark.featuregating.C37239a;
import com.ss.android.lark.passport_api.IPassportApi;
import com.ss.android.lark.sdk.AbstractC53238e;
import com.ss.android.lark.utils.ApiUtils;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0004\u001a\u00020\u0005H\u0016J\n\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0016J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\nH\u0016J\b\u0010\u000b\u001a\u00020\u0003H\u0016J\b\u0010\f\u001a\u00020\u0003H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"com/ss/android/lark/app/taskv2/central/InitRustSdkTaskForSimple$setRustDependency$1", "Lcom/ss/android/lark/sdk/ISdkDependency;", "isAsyncInvokeInBackground", "", "getInitStrategy", "", "getUserId", "", "inInitiatorInterceptorWhiteList", "command", "Lcom/bytedance/lark/pb/basic/v1/Command;", "interceptOtherUserPush", "isInvokeAsyncBackground", "lark-launcher_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
public final class InitRustSdkTaskForSimple$setRustDependency$1 implements AbstractC53238e {

    /* renamed from: a */
    private final boolean f72746a = C37239a.m146648b().mo136951a("lark.sdk.async_invoke_in_background");

    @Override // com.ss.android.lark.sdk.AbstractC53238e
    /* renamed from: b */
    public boolean mo102654b() {
        return false;
    }

    @Override // com.ss.android.lark.sdk.AbstractC53238e
    /* renamed from: c */
    public int mo102655c() {
        return 1;
    }

    @Override // com.ss.android.lark.sdk.AbstractC53238e
    /* renamed from: d */
    public boolean mo102656d() {
        return this.f72746a;
    }

    InitRustSdkTaskForSimple$setRustDependency$1() {
    }

    @Override // com.ss.android.lark.sdk.AbstractC53238e
    /* renamed from: a */
    public String mo102652a() {
        Object api = ApiUtils.getApi(IPassportApi.class);
        Intrinsics.checkExpressionValueIsNotNull(api, "ApiUtils.getApi(IPassportApi::class.java)");
        return ((IPassportApi) api).getUserId();
    }

    @Override // com.ss.android.lark.sdk.AbstractC53238e
    /* renamed from: a */
    public boolean mo102653a(Command command) {
        Intrinsics.checkParameterIsNotNull(command, "command");
        if (command == Command.SET_DEVICE || command == Command.MAKE_USER_ONLINE || command == Command.GET_INIT_SETTINGS) {
            return true;
        }
        return false;
    }
}
