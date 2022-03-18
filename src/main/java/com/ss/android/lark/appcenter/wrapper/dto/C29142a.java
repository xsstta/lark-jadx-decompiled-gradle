package com.ss.android.lark.appcenter.wrapper.dto;

import android.content.Context;
import android.net.http.SslError;
import android.webkit.WebView;
import com.ss.android.appcenter.p1262a.p1263a.AbstractC27537d;
import com.ss.android.lark.appcenter.wrapper.impl.p1362a.C29149e;
import com.ss.android.lark.appcenter.wrapper.p1359a.AbstractC29128a;
import java.util.Map;

/* renamed from: com.ss.android.lark.appcenter.wrapper.dto.a */
public class C29142a implements AbstractC29128a {
    @Override // com.ss.android.lark.appcenter.wrapper.p1359a.AbstractC29128a
    /* renamed from: b */
    public void mo103329b(WebView webView, Context context, String str, Map<String, String> map) {
        for (AbstractC27537d.AbstractC27538a aVar : C29149e.m107167a()) {
            aVar.mo98180a(webView, context, str, map);
        }
    }

    @Override // com.ss.android.lark.appcenter.wrapper.p1359a.AbstractC29128a
    /* renamed from: a */
    public void mo103328a(WebView webView, Context context, String str, Map<String, String> map) {
        for (AbstractC27537d.AbstractC27538a aVar : C29149e.m107167a()) {
            aVar.mo98181b(webView, context, str, map);
        }
    }

    @Override // com.ss.android.lark.appcenter.wrapper.p1359a.AbstractC29128a
    /* renamed from: a */
    public void mo103326a(WebView webView, Context context, String str, SslError sslError, Map<String, String> map) {
        for (AbstractC27537d.AbstractC27538a aVar : C29149e.m107167a()) {
            aVar.mo98178a(webView, context, str, sslError, map);
        }
    }

    @Override // com.ss.android.lark.appcenter.wrapper.p1359a.AbstractC29128a
    /* renamed from: a */
    public void mo103327a(WebView webView, Context context, String str, String str2, Map<String, String> map) {
        for (AbstractC27537d.AbstractC27538a aVar : C29149e.m107167a()) {
            aVar.mo98179a(webView, context, str, str2, map);
        }
    }
}
