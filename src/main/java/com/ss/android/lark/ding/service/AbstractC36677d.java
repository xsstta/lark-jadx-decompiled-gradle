package com.ss.android.lark.ding.service;

import com.larksuite.framework.callback.IGetDataCallback;
import com.ss.android.lark.chat.entity.message.MessageInfo;
import com.ss.android.lark.ding.entity.DingStatus;
import java.util.List;

/* renamed from: com.ss.android.lark.ding.service.d */
public interface AbstractC36677d {
    /* renamed from: a */
    DingStatus mo135280a(String str);

    /* renamed from: a */
    void mo135281a(IGetDataCallback<Boolean> iGetDataCallback);

    /* renamed from: a */
    void mo135282a(String str, IGetDataCallback<MessageInfo> iGetDataCallback);

    /* renamed from: a */
    void mo135283a(String str, List<String> list, int i, boolean z, IGetDataCallback<DingStatus> iGetDataCallback);

    /* renamed from: a */
    void mo135284a(String str, List<String> list, List<String> list2, int i, boolean z, IGetDataCallback<DingStatus> iGetDataCallback);
}
