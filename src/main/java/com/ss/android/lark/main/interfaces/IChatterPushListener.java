package com.ss.android.lark.main.interfaces;

import com.bytedance.lark.pb.basic.v1.Chatter;
import com.huawei.updatesdk.service.otaupdate.UpdateKey;
import java.util.List;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J \u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007H&¨\u0006\t"}, d2 = {"Lcom/ss/android/lark/main/interfaces/IChatterPushListener;", "", "onChatterPush", "", "id", "", UpdateKey.STATUS, "", "Lcom/bytedance/lark/pb/basic/v1/Chatter$ChatterCustomStatus;", "core_main_main_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.main.interfaces.c */
public interface IChatterPushListener {
    /* renamed from: a */
    void mo157411a(String str, List<Chatter.ChatterCustomStatus> list);
}
