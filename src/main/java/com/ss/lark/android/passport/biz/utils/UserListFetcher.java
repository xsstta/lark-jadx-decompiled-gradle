package com.ss.lark.android.passport.biz.utils;

import com.alibaba.fastjson.TypeReference;
import com.google.firebase.messaging.Constants;
import com.larksuite.framework.callback.IGetDataCallback;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import com.ss.android.lark.passport.infra.base.network.p2431a.C49069a;
import com.ss.android.lark.passport.infra.log.PassportLog;
import com.ss.android.lark.passport.infra.service.IUserListService;
import com.ss.android.lark.passport.infra.service.ServiceFinder;
import com.ss.android.lark.passport.signinsdk_api.account.ResponseUser;
import com.ss.android.lark.passport.signinsdk_api.account.User;
import com.ss.android.lark.passport.signinsdk_api.base.NetworkErrorResult;
import com.ss.android.lark.passport.signinsdk_api.base.network.ICallback;
import com.ss.android.lark.passport.signinsdk_api.base.network.ResponseModel;
import com.ss.lark.android.passport.biz.feature.FeatureCApi;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J0\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0016\b\u0002\u0010\u000b\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r\u0018\u00010\fH\u0007J\u001c\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u00042\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0002J\u0010\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u0004H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lcom/ss/lark/android/passport/biz/utils/UserListFetcher;", "", "()V", "TAG", "", "fetchUserList", "", ShareHitPoint.f121868c, "Lcom/ss/android/lark/passport/infra/service/IUserListService$UserLoginSource;", "handleToast", "", "callback", "Lcom/larksuite/framework/callback/IGetDataCallback;", "", "Lcom/ss/android/lark/passport/signinsdk_api/account/User;", "loge", "msg", "throwable", "", "logi", "passport-biz_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.lark.android.passport.biz.utils.h */
public final class UserListFetcher {

    /* renamed from: a */
    public static final UserListFetcher f164316a = new UserListFetcher();

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000-\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001J\b\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016J\u001c\u0010\n\u001a\u00020\u00072\u0012\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\fH\u0016¨\u0006\r"}, d2 = {"com/ss/lark/android/passport/biz/utils/UserListFetcher$fetchUserList$1", "Lcom/ss/android/lark/passport/signinsdk_api/base/network/ICallback;", "", "Lcom/ss/android/lark/passport/signinsdk_api/account/ResponseUser;", "getConvertType", "Ljava/lang/reflect/Type;", "onError", "", "networkErrorResult", "Lcom/ss/android/lark/passport/signinsdk_api/base/NetworkErrorResult;", "onSuccess", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Lcom/ss/android/lark/passport/signinsdk_api/base/network/ResponseModel;", "passport-biz_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.lark.android.passport.biz.utils.h$a */
    public static final class C65252a implements ICallback<List<? extends ResponseUser>> {

        /* renamed from: a */
        final /* synthetic */ IUserListService.UserLoginSource f164317a;

        /* renamed from: b */
        final /* synthetic */ IGetDataCallback f164318b;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001¨\u0006\u0004"}, d2 = {"com/ss/lark/android/passport/biz/utils/UserListFetcher$fetchUserList$1$getConvertType$1", "Lcom/alibaba/fastjson/TypeReference;", "", "Lcom/ss/android/lark/passport/signinsdk_api/account/ResponseUser;", "passport-biz_release"}, mo238835k = 1, mv = {1, 1, 16})
        /* renamed from: com.ss.lark.android.passport.biz.utils.h$a$a */
        public static final class C65253a extends TypeReference<List<? extends ResponseUser>> {
            C65253a() {
            }
        }

        @Override // com.ss.android.lark.passport.signinsdk_api.base.network.ICallback
        /* renamed from: a */
        public Type mo101474a() {
            Type type = new C65253a().getType();
            Intrinsics.checkExpressionValueIsNotNull(type, "object : TypeReference<L…<ResponseUser>>() {}.type");
            return type;
        }

        @Override // com.ss.android.lark.passport.signinsdk_api.base.network.ICallback
        /* renamed from: a */
        public void mo101475a(NetworkErrorResult networkErrorResult) {
            Intrinsics.checkParameterIsNotNull(networkErrorResult, "networkErrorResult");
            IGetDataCallback iGetDataCallback = this.f164318b;
            if (iGetDataCallback != null) {
                iGetDataCallback.onError(C49069a.m193380a(networkErrorResult));
            }
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.ss.android.lark.passport.signinsdk_api.base.network.ResponseModel<java.util.List<com.ss.android.lark.passport.signinsdk_api.account.ResponseUser>>] */
        @Override // com.ss.android.lark.passport.signinsdk_api.base.network.ICallback
        /* renamed from: a */
        public void mo101476a(ResponseModel<List<? extends ResponseUser>> responseModel) {
            Intrinsics.checkParameterIsNotNull(responseModel, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
            IUserListService a = ServiceFinder.m193744a();
            User foregroundUser = a.getForegroundUser();
            if (foregroundUser != null) {
                Intrinsics.checkExpressionValueIsNotNull(foregroundUser, "service.foregroundUser ?…oge(\"no foreground user\")");
                List<? extends ResponseUser> data = responseModel.getData();
                if (data != null) {
                    List<? extends ResponseUser> list = data;
                    ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
                    for (T t : list) {
                        t.getUser().mergeWithResponseUser(t);
                        arrayList.add(t.getUser());
                    }
                    ArrayList arrayList2 = arrayList;
                    UserListFetcher hVar = UserListFetcher.f164316a;
                    StringBuilder sb = new StringBuilder();
                    sb.append("fetched users: ");
                    ArrayList<User> arrayList3 = arrayList2;
                    ArrayList arrayList4 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList3, 10));
                    for (User user : arrayList3) {
                        arrayList4.add(user.userId);
                    }
                    sb.append(arrayList4);
                    hVar.mo224502a(sb.toString());
                    List<User> addOrUpdateUsers = a.addOrUpdateUsers(arrayList2, foregroundUser.userId, this.f164317a);
                    IGetDataCallback iGetDataCallback = this.f164318b;
                    if (iGetDataCallback != null) {
                        iGetDataCallback.onSuccess(addOrUpdateUsers);
                        return;
                    }
                    return;
                }
                UserListFetcher.m256145a(UserListFetcher.f164316a, "no new users", null, 2, null);
                return;
            }
            UserListFetcher.m256145a(UserListFetcher.f164316a, "no foreground user", null, 2, null);
        }

        C65252a(IUserListService.UserLoginSource userLoginSource, IGetDataCallback iGetDataCallback) {
            this.f164317a = userLoginSource;
            this.f164318b = iGetDataCallback;
        }
    }

    private UserListFetcher() {
    }

    /* renamed from: a */
    public final void mo224502a(String str) {
        PassportLog.f123351c.mo171474a().mo171465b("UserListFetcher", str);
    }

    /* renamed from: a */
    private final void m256146a(String str, Throwable th) {
        if (th != null) {
            PassportLog.f123351c.mo171474a().mo171462a("UserListFetcher", str, th);
        } else {
            PassportLog.f123351c.mo171474a().mo171471d("UserListFetcher", str);
        }
    }

    @JvmStatic
    /* renamed from: a */
    public static final void m256144a(IUserListService.UserLoginSource userLoginSource, boolean z, IGetDataCallback<List<User>> iGetDataCallback) {
        Intrinsics.checkParameterIsNotNull(userLoginSource, ShareHitPoint.f121868c);
        FeatureCApi.m253710b(z, new C65252a(userLoginSource, iGetDataCallback));
    }

    /* renamed from: a */
    static /* synthetic */ void m256145a(UserListFetcher hVar, String str, Throwable th, int i, Object obj) {
        if ((i & 2) != 0) {
            th = null;
        }
        hVar.m256146a(str, th);
    }
}
