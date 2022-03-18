package com.ss.android.lark.biz.core.api.resource;

import com.bytedance.lark.pb.basic.v1.SerCrypto;
import com.bytedance.lark.pb.basic.v1.TriggerDataCleanRequest;
import com.bytedance.lark.pb.basic.v1.TriggerDataCleanResponse;
import com.larksuite.framework.callback.IGetDataCallback;
import java.util.List;
import java.util.Map;

/* renamed from: com.ss.android.lark.biz.core.api.resource.d */
public interface AbstractC29582d {
    /* renamed from: a */
    Resource mo105863a(String str, String str2, String str3, boolean z);

    /* renamed from: a */
    String mo105864a(String str, int i, int i2);

    /* renamed from: a */
    String mo105865a(String str, String str2);

    /* renamed from: a */
    String mo105866a(String str, String str2, int i, float f);

    /* renamed from: a */
    String mo105867a(String str, String str2, int i, int i2);

    /* renamed from: a */
    String mo105868a(String str, String str2, String str3, SerCrypto serCrypto);

    /* renamed from: a */
    Map<String, Resource> mo105869a(List<ResourceRequestBaseSet> list);

    /* renamed from: a */
    void mo105870a(IGetDataCallback<String> iGetDataCallback);

    /* renamed from: a */
    void mo105871a(Integer num, Integer num2, TriggerDataCleanRequest.CleanType cleanType, IGetDataCallback<TriggerDataCleanResponse> iGetDataCallback);

    /* renamed from: a */
    void mo105872a(String str);

    /* renamed from: a */
    void mo105873a(String str, String str2, int i, float f, IGetDataCallback<String> iGetDataCallback);

    /* renamed from: a */
    void mo105874a(String str, String str2, String str3);

    /* renamed from: a */
    void mo105875a(List<ResourceRequestBaseSet> list, int i, IGetDataCallback<Map<String, Resource>> iGetDataCallback);

    /* renamed from: a */
    void mo105876a(List<String> list, String str, IGetDataCallback<StickerSetDownloadState> iGetDataCallback);

    /* renamed from: a */
    byte[] mo105877a(long j, String str, int i, float f, String str2);

    /* renamed from: b */
    String mo105878b(String str, String str2);

    /* renamed from: b */
    Map<String, Resource> mo105879b(List<ResourceRequestBaseSet> list);

    /* renamed from: b */
    void mo105880b(IGetDataCallback<Float> iGetDataCallback);

    /* renamed from: b */
    void mo105881b(String str, String str2, String str3);
}
