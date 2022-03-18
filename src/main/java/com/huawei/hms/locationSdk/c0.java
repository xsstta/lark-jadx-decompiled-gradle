package com.huawei.hms.locationSdk;

import com.huawei.hms.common.internal.AnyClient;
import com.huawei.hms.common.internal.TaskApiCall;

public abstract class c0<ClientT extends AnyClient, ResultT> extends TaskApiCall<ClientT, ResultT> {

    /* renamed from: a */
    public final String f58396a;

    public c0(String str, String str2, String str3) {
        super(str, str2);
        this.f58396a = str3;
    }

    public c0(String str, String str2, String str3, String str4) {
        super(str, str2, str4);
        this.f58396a = str3;
    }
}
