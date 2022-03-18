package com.ss.android.lark.integrator.im.dependency;

import android.app.Activity;
import com.larksuite.framework.callback.IGetDataCallback;
import com.ss.android.lark.ccm_api.ICCMApi;
import com.ss.android.lark.doc.entity.DocFeed;
import com.ss.android.lark.feed.p1871b.AbstractC38037a;
import com.ss.android.lark.utils.ApiUtils;
import java.util.List;
import java.util.Map;

/* renamed from: com.ss.android.lark.integrator.im.dependency.j */
public class C39568j implements AbstractC38037a.AbstractC38051k {

    /* renamed from: a */
    final ICCMApi f101043a = ((ICCMApi) ApiUtils.getApi(ICCMApi.class));

    @Override // com.ss.android.lark.feed.p1871b.AbstractC38037a.AbstractC38051k
    /* renamed from: a */
    public void mo139253a(Activity activity) {
        this.f101043a.createDoc(activity);
    }

    @Override // com.ss.android.lark.feed.p1871b.AbstractC38037a.AbstractC38051k
    /* renamed from: a */
    public void mo139255a(List<String> list) {
        this.f101043a.preloadDocFromFeed(list);
    }

    @Override // com.ss.android.lark.feed.p1871b.AbstractC38037a.AbstractC38051k
    /* renamed from: a */
    public String mo139252a(String str, Map<String, String> map) {
        return this.f101043a.getDocUrlWithParams(str, map);
    }

    @Override // com.ss.android.lark.feed.p1871b.AbstractC38037a.AbstractC38051k
    /* renamed from: a */
    public void mo139254a(String str, IGetDataCallback<DocFeed> iGetDataCallback) {
        this.f101043a.pullDocFeed(str, iGetDataCallback);
    }
}
