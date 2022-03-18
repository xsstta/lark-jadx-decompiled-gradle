package com.larksuite.component.dybrid.h5core.core.p1075a;

import android.content.Context;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import androidx.fragment.app.Fragment;
import com.larksuite.component.dybrid.h5api.api.AbstractC24163f;
import com.larksuite.component.dybrid.h5api.api.AbstractC24166i;
import com.larksuite.component.dybrid.h5api.api.AbstractC24168k;
import com.larksuite.component.dybrid.h5api.api.AbstractC24172n;
import com.larksuite.component.dybrid.h5api.api.C24160c;
import com.larksuite.component.dybrid.h5api.api.C24162e;
import com.larksuite.component.dybrid.h5api.api.H5PluginConfig;
import com.larksuite.component.dybrid.h5api.p1070a.AbstractC24153a;
import com.larksuite.component.dybrid.h5api.p1070a.AbstractC24154b;
import com.ss.android.lark.openapi.jsapi.AbstractC48759a;
import java.util.Map;

/* renamed from: com.larksuite.component.dybrid.h5core.core.a.a */
public interface AbstractC24200a extends AbstractC24163f {
    /* renamed from: a */
    WebResourceResponse mo86817a(String str, String str2);

    /* renamed from: a */
    AbstractC24168k mo86818a(C24162e eVar, C24160c cVar, WebView webView);

    /* renamed from: a */
    Map<String, AbstractC48759a<String>> mo86819a(AbstractC24168k kVar);

    /* renamed from: a */
    void mo86820a(Context context, AbstractC24166i iVar);

    /* renamed from: a */
    void mo86821a(AbstractC24153a aVar);

    /* renamed from: a */
    void mo86822a(AbstractC24154b bVar);

    /* renamed from: a */
    void mo86823a(H5PluginConfig h5PluginConfig);

    /* renamed from: a */
    boolean mo86824a(C24162e eVar, C24160c cVar);

    /* renamed from: b */
    Fragment mo86825b(C24162e eVar, C24160c cVar);

    /* renamed from: e */
    boolean mo86826e();

    /* renamed from: f */
    AbstractC24172n mo86827f();
}
