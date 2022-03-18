package com.ss.android.lark.wschannel.service;

import android.content.Context;
import com.ss.android.lark.biz.core.api.NetworkLevelListener;
import com.ss.android.lark.biz.core.api.WSConnState;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public interface IWschannelService {

    @Retention(RetentionPolicy.SOURCE)
    public @interface PayloadType {
    }

    /* renamed from: a */
    NetworkLevelListener.NetworkLevel mo201516a();

    /* renamed from: a */
    void mo201517a(Context context);

    /* renamed from: a */
    void mo201518a(NetworkLevelListener networkLevelListener);

    /* renamed from: a */
    void mo201519a(WSConnState.AbstractC29537a aVar);

    /* renamed from: b */
    void mo201520b(Context context);

    /* renamed from: b */
    void mo201521b(NetworkLevelListener networkLevelListener);

    /* renamed from: b */
    void mo201522b(WSConnState.AbstractC29537a aVar);
}
