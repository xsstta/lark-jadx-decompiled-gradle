package com.ss.android.lark.chat.api.service;

import com.bytedance.lark.pb.basic.v1.MessageSource;
import com.larksuite.framework.callback.IGetDataCallback;
import com.ss.android.lark.chat.entity.translate.TranslateLanguageSetting;
import com.ss.android.lark.dto.translate.C36874a;
import java.util.List;
import java.util.Map;

/* renamed from: com.ss.android.lark.chat.api.service.l */
public interface AbstractC32908l {
    /* renamed from: a */
    void mo121375a(int i, IGetDataCallback<Boolean> iGetDataCallback);

    /* renamed from: a */
    void mo121376a(int i, Map<String, Integer> map, IGetDataCallback<Boolean> iGetDataCallback);

    /* renamed from: a */
    void mo121377a(IGetDataCallback<TranslateLanguageSetting> iGetDataCallback);

    /* renamed from: a */
    void mo121378a(String str, IGetDataCallback<Boolean> iGetDataCallback);

    /* renamed from: a */
    void mo121379a(List<String> list, IGetDataCallback<Boolean> iGetDataCallback);

    /* renamed from: a */
    void mo121380a(List<String> list, boolean z, String str, MessageSource messageSource, String str2, IGetDataCallback<C36874a> iGetDataCallback);

    /* renamed from: a */
    void mo121381a(boolean z, IGetDataCallback<Boolean> iGetDataCallback);
}
