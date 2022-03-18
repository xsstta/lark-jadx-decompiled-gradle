package com.ss.android.lark.passport.infra.util.storage;

import com.ss.android.lark.manis.annotation.RemoteService;
import ee.android.framework.manis.interfaces.IHookInterface;
import kotlin.Metadata;

@RemoteService
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u0003H&J\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u0003H&J\u001a\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\b\u0010\b\u001a\u0004\u0018\u00010\u0003H&¨\u0006\t"}, d2 = {"Lcom/ss/android/lark/passport/infra/util/storage/IPassportStorageService;", "Lee/android/framework/manis/interfaces/IHookInterface;", "getData", "", "key", "remove", "setData", "", "value", "passport-infra_release"}, mo238835k = 1, mv = {1, 1, 16})
public interface IPassportStorageService extends IHookInterface {
    String getData(String str);

    String remove(String str);

    void setData(String str, String str2);
}
