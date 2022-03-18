package com.ss.android.lark.leanmode.p2119a;

import com.bytedance.lark.pb.device.v1.PushCleanDataResponse;
import com.ss.android.lark.leanmode.dto.C41262a;
import com.ss.android.lark.leanmode.dto.CleanLevel;

/* renamed from: com.ss.android.lark.leanmode.a.a */
public class C41240a {
    /* renamed from: a */
    public static C41262a m163536a(PushCleanDataResponse pushCleanDataResponse) {
        C41262a aVar = new C41262a();
        if (pushCleanDataResponse == null) {
            return aVar;
        }
        aVar.mo148646a(pushCleanDataResponse.data_time_limit.longValue());
        if (pushCleanDataResponse.clean_level == null) {
            return aVar;
        }
        aVar.mo148647a(CleanLevel.fromValue(pushCleanDataResponse.clean_level.getValue()));
        return aVar;
    }
}
