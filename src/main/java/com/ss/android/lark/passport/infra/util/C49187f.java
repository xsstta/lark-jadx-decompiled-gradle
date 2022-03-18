package com.ss.android.lark.passport.infra.util;

import com.google.firebase.messaging.Constants;
import com.larksuite.framework.callback.IGetDataCallback;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import com.ss.android.lark.passport.infra.base.network.p2431a.C49069a;
import com.ss.android.lark.passport.signinsdk_api.base.AbstractC49352d;
import com.ss.android.lark.passport.signinsdk_api.base.NetworkErrorResult;
import com.ss.android.lark.passport.signinsdk_api.base.network.ICallback;
import com.ss.android.lark.passport.signinsdk_api.base.network.ResponseModel;
import java.lang.reflect.Type;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a&\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\n\u0012\u0004\u0012\u0002H\u0002\u0018\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u0005\u001a&\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\n\u0012\u0004\u0012\u0002H\u0002\u0018\u00010\u00062\u0006\u0010\u0004\u001a\u00020\u0005¨\u0006\u0007"}, d2 = {"toICallback", "Lcom/ss/android/lark/passport/signinsdk_api/base/network/ICallback;", "T", "Lcom/larksuite/framework/callback/IGetDataCallback;", ShareHitPoint.f121869d, "Ljava/lang/reflect/Type;", "Lcom/ss/android/lark/passport/signinsdk_api/base/IGetDataCallback;", "passport-infra_release"}, mo238835k = 2, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.passport.infra.util.f */
public final class C49187f {

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0016\u0010\b\u001a\u00020\u00052\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\nH\u0016¨\u0006\u000b"}, d2 = {"com/ss/android/lark/passport/infra/util/Callbacks$toICallback$1", "Lcom/ss/android/lark/passport/signinsdk_api/base/network/ICallback;", "getConvertType", "Ljava/lang/reflect/Type;", "onError", "", "networkErrorResult", "Lcom/ss/android/lark/passport/signinsdk_api/base/NetworkErrorResult;", "onSuccess", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Lcom/ss/android/lark/passport/signinsdk_api/base/network/ResponseModel;", "passport-infra_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.passport.infra.util.f$a */
    public static final class C49188a implements ICallback<T> {

        /* renamed from: a */
        final /* synthetic */ IGetDataCallback f123472a;

        /* renamed from: b */
        final /* synthetic */ Type f123473b;

        @Override // com.ss.android.lark.passport.signinsdk_api.base.network.ICallback
        /* renamed from: a */
        public Type mo101474a() {
            return this.f123473b;
        }

        @Override // com.ss.android.lark.passport.signinsdk_api.base.network.ICallback
        /* renamed from: a */
        public void mo101475a(NetworkErrorResult networkErrorResult) {
            Intrinsics.checkParameterIsNotNull(networkErrorResult, "networkErrorResult");
            IGetDataCallback iGetDataCallback = this.f123472a;
            if (iGetDataCallback != null) {
                iGetDataCallback.onError(C49069a.m193380a(networkErrorResult));
            }
        }

        @Override // com.ss.android.lark.passport.signinsdk_api.base.network.ICallback
        /* renamed from: a */
        public void mo101476a(ResponseModel<T> responseModel) {
            Intrinsics.checkParameterIsNotNull(responseModel, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
            IGetDataCallback iGetDataCallback = this.f123472a;
            if (iGetDataCallback != null) {
                iGetDataCallback.onSuccess(responseModel.getData());
            }
        }

        C49188a(IGetDataCallback iGetDataCallback, Type type) {
            this.f123472a = iGetDataCallback;
            this.f123473b = type;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0016\u0010\b\u001a\u00020\u00052\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\nH\u0016¨\u0006\u000b"}, d2 = {"com/ss/android/lark/passport/infra/util/Callbacks$toICallback$2", "Lcom/ss/android/lark/passport/signinsdk_api/base/network/ICallback;", "getConvertType", "Ljava/lang/reflect/Type;", "onError", "", "networkErrorResult", "Lcom/ss/android/lark/passport/signinsdk_api/base/NetworkErrorResult;", "onSuccess", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Lcom/ss/android/lark/passport/signinsdk_api/base/network/ResponseModel;", "passport-infra_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.passport.infra.util.f$b */
    public static final class C49189b implements ICallback<T> {

        /* renamed from: a */
        final /* synthetic */ AbstractC49352d f123474a;

        /* renamed from: b */
        final /* synthetic */ Type f123475b;

        @Override // com.ss.android.lark.passport.signinsdk_api.base.network.ICallback
        /* renamed from: a */
        public Type mo101474a() {
            return this.f123475b;
        }

        @Override // com.ss.android.lark.passport.signinsdk_api.base.network.ICallback
        /* renamed from: a */
        public void mo101475a(NetworkErrorResult networkErrorResult) {
            Intrinsics.checkParameterIsNotNull(networkErrorResult, "networkErrorResult");
            AbstractC49352d dVar = this.f123474a;
            if (dVar != null) {
                dVar.mo145178a(networkErrorResult);
            }
        }

        @Override // com.ss.android.lark.passport.signinsdk_api.base.network.ICallback
        /* renamed from: a */
        public void mo101476a(ResponseModel<T> responseModel) {
            Intrinsics.checkParameterIsNotNull(responseModel, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
            AbstractC49352d dVar = this.f123474a;
            if (dVar != null) {
                dVar.mo145179a((Object) responseModel.getData());
            }
        }

        C49189b(AbstractC49352d dVar, Type type) {
            this.f123474a = dVar;
            this.f123475b = type;
        }
    }

    /* renamed from: a */
    public static final <T> ICallback<T> m193934a(IGetDataCallback<T> iGetDataCallback, Type type) {
        Intrinsics.checkParameterIsNotNull(type, ShareHitPoint.f121869d);
        return new C49188a(iGetDataCallback, type);
    }

    /* renamed from: a */
    public static final <T> ICallback<T> m193935a(AbstractC49352d<T> dVar, Type type) {
        Intrinsics.checkParameterIsNotNull(type, ShareHitPoint.f121869d);
        return new C49189b(dVar, type);
    }
}
