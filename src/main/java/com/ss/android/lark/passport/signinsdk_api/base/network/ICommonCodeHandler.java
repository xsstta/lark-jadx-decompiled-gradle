package com.ss.android.lark.passport.signinsdk_api.base.network;

import android.content.Context;
import com.ss.android.lark.passport.signinsdk_api.base.NetworkErrorResult;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H&J2\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t2\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u0002H\u0007\u0018\u00010\u000bH\u0016J\u001e\u0010\f\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00072\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u0002H\u0007\u0018\u00010\u000eH&J\u001c\u0010\u000f\u001a\u00020\u00032\b\u0010\u0010\u001a\u0004\u0018\u00010\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\u0013"}, d2 = {"Lcom/ss/android/lark/passport/signinsdk_api/base/network/ICommonCodeHandler;", "", "handleError", "", "error", "Lcom/ss/android/lark/passport/signinsdk_api/base/NetworkErrorResult;", "handleRetry", "T", "request", "Lcom/ss/android/lark/passport/signinsdk_api/base/network/IRequest;", "callback", "Lcom/ss/android/lark/passport/signinsdk_api/base/network/ICallback;", "handleSuccess", "model", "Lcom/ss/android/lark/passport/signinsdk_api/base/network/ResponseModel;", "handlerErrorWithContext", "context", "Landroid/content/Context;", "errorResult", "signinsdk-api_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.passport.signinsdk_api.base.network.b */
public interface ICommonCodeHandler {

    @Metadata(bv = {1, 0, 3}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.passport.signinsdk_api.base.network.b$a */
    public static final class C49357a {
        /* renamed from: a */
        public static boolean m194405a(ICommonCodeHandler bVar, Context context, NetworkErrorResult networkErrorResult) {
            return false;
        }

        /* renamed from: a */
        public static <T> boolean m194406a(ICommonCodeHandler bVar, IRequest eVar, NetworkErrorResult networkErrorResult, ICallback<T> aVar) {
            return false;
        }
    }

    /* renamed from: a */
    boolean mo171318a(Context context, NetworkErrorResult networkErrorResult);

    /* renamed from: a */
    boolean mo171319a(NetworkErrorResult networkErrorResult);

    /* renamed from: a */
    <T> boolean mo171320a(ResponseModel<T> responseModel);

    /* renamed from: a */
    <T> boolean mo171321a(IRequest eVar, NetworkErrorResult networkErrorResult, ICallback<T> aVar);
}
