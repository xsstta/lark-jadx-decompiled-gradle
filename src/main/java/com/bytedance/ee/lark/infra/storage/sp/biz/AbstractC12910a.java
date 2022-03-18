package com.bytedance.ee.lark.infra.storage.sp.biz;

import com.bytedance.ee.lark.infra.sandbox.context.IBaseService;
import com.bytedance.ee.lark.infra.storage.sp.base.AppBaseStorage;
import org.json.JSONArray;

/* renamed from: com.bytedance.ee.lark.infra.storage.sp.biz.a */
public interface AbstractC12910a extends IBaseService {
    /* renamed from: a */
    String mo48687a(AppBaseStorage.StorageType storageType, String str);

    /* renamed from: a */
    String mo48688a(String str);

    /* renamed from: a */
    boolean mo48689a();

    /* renamed from: a */
    boolean mo48690a(AppBaseStorage.StorageType storageType);

    /* renamed from: a */
    boolean mo48691a(AppBaseStorage.StorageType storageType, String str, String str2, String str3) throws SetValueIOException;

    /* renamed from: a */
    boolean mo48692a(String str, String str2, long j);

    /* renamed from: a */
    boolean mo48693a(String str, String str2, String str3) throws SetValueIOException;

    /* renamed from: b */
    long mo48694b();

    /* renamed from: b */
    long mo48695b(AppBaseStorage.StorageType storageType);

    /* renamed from: b */
    String mo48696b(AppBaseStorage.StorageType storageType, String str);

    /* renamed from: b */
    String mo48697b(String str);

    /* renamed from: c */
    long mo48698c();

    /* renamed from: c */
    long mo48699c(AppBaseStorage.StorageType storageType);

    /* renamed from: c */
    String mo48700c(String str);

    /* renamed from: c */
    boolean mo48701c(AppBaseStorage.StorageType storageType, String str);

    /* renamed from: d */
    JSONArray mo48702d();

    /* renamed from: d */
    JSONArray mo48703d(AppBaseStorage.StorageType storageType);

    /* renamed from: d */
    boolean mo48704d(String str);

    /* renamed from: e */
    void mo48705e();
}
