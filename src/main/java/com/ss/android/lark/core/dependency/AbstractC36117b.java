package com.ss.android.lark.core.dependency;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.larksuite.component.dybrid.h5core.AbstractC24186b;
import com.larksuite.component.dybrid.h5core.C24178a;
import com.larksuite.framework.callback.IGetDataCallback;
import com.ss.android.lark.browser.dependency.IBrowserModuleDependency;
import com.ss.android.lark.maincore.AbstractC44552i;
import com.ss.android.lark.search.dependency.ISearchModuleDependency;
import java.util.Map;

/* renamed from: com.ss.android.lark.core.dependency.b */
public interface AbstractC36117b {
    /* renamed from: a */
    int mo132698a(int i);

    /* renamed from: a */
    Intent mo132699a(String str, String str2);

    /* renamed from: a */
    String mo132700a(String str, String str2, Map<String, String> map);

    /* renamed from: a */
    Map<String, String> mo132701a();

    /* renamed from: a */
    void mo132702a(Context context);

    /* renamed from: a */
    void mo132703a(Context context, String str);

    /* renamed from: a */
    void mo132704a(C24178a aVar);

    /* renamed from: a */
    void mo132705a(IGetDataCallback<Long> iGetDataCallback);

    /* renamed from: a */
    void mo132706a(AbstractC44552i iVar, boolean z);

    /* renamed from: a */
    void mo132707a(String str);

    /* renamed from: a */
    void mo132708a(boolean z);

    /* renamed from: a */
    boolean mo132709a(Context context, Bundle bundle);

    /* renamed from: a */
    boolean mo132710a(Context context, String str, Map<String, String> map);

    /* renamed from: a */
    boolean mo132711a(String str, Map<String, String> map);

    /* renamed from: b */
    ISearchModuleDependency.AbstractC53321h.AbstractC53322a mo132712b(boolean z);

    /* renamed from: b */
    Map<String, String> mo132713b();

    /* renamed from: b */
    void mo132714b(IGetDataCallback<Boolean> iGetDataCallback);

    /* renamed from: b */
    boolean mo132715b(Context context, Bundle bundle);

    /* renamed from: b */
    boolean mo132716b(String str);

    /* renamed from: c */
    Map<String, String> mo132717c();

    /* renamed from: c */
    void mo132718c(String str);

    /* renamed from: c */
    void mo132719c(boolean z);

    /* renamed from: d */
    Intent mo132720d(String str);

    /* renamed from: d */
    AbstractC24186b.AbstractC24188b mo132721d();

    /* renamed from: e */
    IBrowserModuleDependency.AbstractC29886d mo132722e();

    /* renamed from: f */
    Map<String, String> mo132723f();

    /* renamed from: g */
    void mo132724g();

    /* renamed from: h */
    void mo132725h();

    /* renamed from: i */
    String mo132726i();

    /* renamed from: j */
    void mo132727j();

    /* renamed from: k */
    boolean mo132728k();
}
