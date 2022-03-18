package com.ss.android.lark.passport.infra.util.storage;

import android.content.Context;
import com.ss.android.lark.manis.annotation.RemoteServiceImpl;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@RemoteServiceImpl(service = IPassportStorageService.class)
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\u0010\u0010\b\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\u001a\u0010\t\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\u000b\u001a\u0004\u0018\u00010\u0006H\u0016¨\u0006\f"}, d2 = {"Lcom/ss/android/lark/passport/infra/util/storage/IPCPassportStorageServiceImpl;", "Lcom/ss/android/lark/passport/infra/util/storage/IPassportStorageService;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "getData", "", "key", "remove", "setData", "", "value", "passport-infra_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class IPCPassportStorageServiceImpl implements IPassportStorageService {
    public IPCPassportStorageServiceImpl(Context context) {
        Intrinsics.checkParameterIsNotNull(context, "context");
    }

    @Override // com.ss.android.lark.passport.infra.util.storage.IPassportStorageService
    public String getData(String str) {
        Intrinsics.checkParameterIsNotNull(str, "key");
        String data = InternalPassportStorageServiceImpl.getInstance().getData(str);
        if (data != null) {
            return data;
        }
        return "";
    }

    @Override // com.ss.android.lark.passport.infra.util.storage.IPassportStorageService
    public String remove(String str) {
        Intrinsics.checkParameterIsNotNull(str, "key");
        String remove = InternalPassportStorageServiceImpl.getInstance().remove(str);
        if (remove != null) {
            return remove;
        }
        return "";
    }

    @Override // com.ss.android.lark.passport.infra.util.storage.IPassportStorageService
    public void setData(String str, String str2) {
        Intrinsics.checkParameterIsNotNull(str, "key");
        InternalPassportStorageServiceImpl.getInstance().setData(str, str2);
    }
}
