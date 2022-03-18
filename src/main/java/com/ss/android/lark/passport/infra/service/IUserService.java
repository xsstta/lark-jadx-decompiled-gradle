package com.ss.android.lark.passport.infra.service;

import com.ss.android.lark.passport.infra.base.storage.key.Key;
import com.ss.android.lark.passport.infra.service.IUserInfo;
import com.ss.android.lark.passport.signinsdk_api.account.User;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J#\u0010\u0006\u001a\u0004\u0018\u0001H\u0007\"\u0004\b\u0000\u0010\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u0002H\u00070\tH&¢\u0006\u0002\u0010\nJ)\u0010\u000b\u001a\u0002H\u0007\"\u0004\b\u0000\u0010\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u0002H\u00070\t2\u0006\u0010\f\u001a\u0002H\u0007H&¢\u0006\u0002\u0010\rJ\u0012\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0003H&J+\u0010\u0011\u001a\u00020\u000f\"\u0004\b\u0000\u0010\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u0002H\u00070\t2\b\u0010\u0012\u001a\u0004\u0018\u0001H\u0007H&¢\u0006\u0002\u0010\u0013R\u0014\u0010\u0002\u001a\u0004\u0018\u00010\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0014"}, d2 = {"Lcom/ss/android/lark/passport/infra/service/IUserService;", "Lcom/ss/android/lark/passport/infra/service/IUserInfo$Getter;", "user", "Lcom/ss/android/lark/passport/signinsdk_api/account/User;", "getUser", "()Lcom/ss/android/lark/passport/signinsdk_api/account/User;", "get", "T", "key", "Lcom/ss/android/lark/passport/infra/base/storage/key/Key;", "(Lcom/ss/android/lark/passport/infra/base/storage/key/Key;)Ljava/lang/Object;", "getOrDefault", "default", "(Lcom/ss/android/lark/passport/infra/base/storage/key/Key;Ljava/lang/Object;)Ljava/lang/Object;", "mergeLocalUserInfo", "", "remoteUser", "put", "value", "(Lcom/ss/android/lark/passport/infra/base/storage/key/Key;Ljava/lang/Object;)V", "passport-infra_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.passport.infra.service.q */
public interface IUserService extends IUserInfo.Getter {
    /* renamed from: a */
    <T> void mo171595a(Key<T> aVar, T t);

    /* renamed from: a */
    void mo171596a(User user);

    /* renamed from: e */
    User mo171597e();
}
