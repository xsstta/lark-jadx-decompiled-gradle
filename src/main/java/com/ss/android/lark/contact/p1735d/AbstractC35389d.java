package com.ss.android.lark.contact.p1735d;

import com.larksuite.framework.callback.IGetDataCallback;
import com.ss.android.lark.biz.core.api.ContactSource;
import com.ss.android.lark.contact.entity.UserRelationResponse;
import java.util.List;
import java.util.Map;

/* renamed from: com.ss.android.lark.contact.d.d */
public interface AbstractC35389d {
    /* renamed from: a */
    UserRelationResponse mo130274a(String str);

    /* renamed from: a */
    Map<String, Integer> mo130275a(Map<String, String> map);

    /* renamed from: a */
    void mo130276a(int i, List<String> list, String str, IGetDataCallback<Map<String, Integer>> iGetDataCallback);

    /* renamed from: a */
    void mo130277a(String str, String str2, String str3, String str4, String str5, ContactSource contactSource, IGetDataCallback<Boolean> iGetDataCallback);

    /* renamed from: a */
    void mo130278a(String str, boolean z, IGetDataCallback<Boolean> iGetDataCallback);

    /* renamed from: a */
    void mo130279a(List<String> list, int i, IGetDataCallback<Map<String, Integer>> iGetDataCallback);

    /* renamed from: a */
    void mo130280a(List<String> list, String str, ContactSource contactSource, IGetDataCallback<Boolean> iGetDataCallback);

    /* renamed from: b */
    void mo130281b(IGetDataCallback<String> iGetDataCallback);

    /* renamed from: b */
    void mo130282b(String str, IGetDataCallback<Boolean> iGetDataCallback);

    /* renamed from: b */
    void mo130283b(String str, boolean z, IGetDataCallback<Boolean> iGetDataCallback);

    /* renamed from: b */
    void mo130284b(boolean z, IGetDataCallback<Boolean> iGetDataCallback);

    /* renamed from: c */
    void mo130285c(IGetDataCallback<String> iGetDataCallback);

    /* renamed from: c */
    void mo130286c(String str, IGetDataCallback<UserRelationResponse> iGetDataCallback);

    /* renamed from: d */
    void mo130287d(String str, IGetDataCallback<Boolean> iGetDataCallback);

    /* renamed from: e */
    void mo130288e(String str, IGetDataCallback<Boolean> iGetDataCallback);
}
