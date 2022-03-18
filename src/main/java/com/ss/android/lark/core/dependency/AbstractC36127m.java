package com.ss.android.lark.core.dependency;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.bytedance.lark.pb.basic.v1.CardContent;
import com.larksuite.component.webview.container.dto.AbstractInjectWebViewDelegate;
import com.larksuite.framework.callback.IGetDataCallback;
import com.ss.android.lark.biz.core.api.UrlParams;
import com.ss.android.lark.biz.core.api.browser.AbstractC29553b;
import com.ss.android.lark.biz.core.api.browser.AbstractC29554c;
import com.ss.android.lark.biz.core.api.browser.PreviewRequest;
import com.ss.android.lark.biz.core.api.browser.PreviewV2Request;
import com.ss.android.lark.forward.p1898a.AbstractC38365a;
import com.ss.android.lark.main.p2231a.AbstractC44136a;
import com.ss.android.lark.maincore.AbstractC44548e;
import com.ss.android.lark.maincore.AbstractC44552i;
import com.ss.android.lark.maincore.ITitleController;
import com.ss.android.lark.maincore.dto.TabAppInfo;
import java.util.List;
import java.util.Map;
import okhttp3.OkHttpClient;
import org.json.JSONObject;

/* renamed from: com.ss.android.lark.core.dependency.m */
public interface AbstractC36127m {
    /* renamed from: a */
    Intent mo133004a(String str, String str2, String str3, int i);

    /* renamed from: a */
    AbstractC44552i mo133005a(Context context, ITitleController iTitleController, TabAppInfo tabAppInfo);

    /* renamed from: a */
    AbstractC44552i mo133006a(Context context, AbstractC44548e eVar, ITitleController iTitleController, TabAppInfo tabAppInfo);

    /* renamed from: a */
    OkHttpClient mo133007a();

    /* renamed from: a */
    void mo133008a(Activity activity, String str, IGetDataCallback<String> iGetDataCallback);

    /* renamed from: a */
    void mo133009a(Activity activity, String str, String str2, String str3, String str4, String str5);

    /* renamed from: a */
    void mo133010a(Context context, IGetDataCallback<String> iGetDataCallback);

    /* renamed from: a */
    void mo133011a(Context context, String str);

    /* renamed from: a */
    void mo133012a(Context context, String str, String str2, CardContent cardContent, boolean z, AbstractC38365a.AbstractC38377l lVar);

    /* renamed from: a */
    void mo133013a(Context context, String str, boolean z);

    /* renamed from: a */
    void mo133014a(Context context, List<String> list, CardContent cardContent, boolean z, AbstractC38365a.AbstractC38377l lVar);

    /* renamed from: a */
    void mo133015a(Fragment fragment, List<PreviewRequest> list, int i, AbstractC29553b bVar);

    /* renamed from: a */
    void mo133016a(Fragment fragment, List<PreviewV2Request> list, int i, AbstractC29554c cVar);

    /* renamed from: a */
    void mo133017a(String str);

    /* renamed from: a */
    void mo133018a(String str, IGetDataCallback<String> iGetDataCallback);

    /* renamed from: a */
    void mo133019a(String str, JSONObject jSONObject);

    /* renamed from: a */
    void mo133020a(String str, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3);

    /* renamed from: a */
    void mo133021a(String str, boolean z);

    /* renamed from: a */
    void mo133022a(String str, boolean z, int i);

    /* renamed from: a */
    void mo133023a(Map<String, AbstractC44136a.C44142ac> map, TabAppInfo tabAppInfo);

    /* renamed from: a */
    void mo133024a(int[] iArr, boolean z, IGetDataCallback<String> iGetDataCallback);

    /* renamed from: a */
    boolean mo133025a(Activity activity, String str, String str2, String str3, boolean z);

    /* renamed from: a */
    boolean mo133026a(Context context);

    /* renamed from: a */
    boolean mo133027a(Context context, Bundle bundle);

    /* renamed from: a */
    boolean mo133028a(Context context, String str, UrlParams.Source source);

    /* renamed from: a */
    boolean mo133029a(Context context, String str, String str2);

    /* renamed from: a */
    boolean mo133030a(String str, UrlParams urlParams);

    /* renamed from: b */
    AbstractInjectWebViewDelegate mo133031b();

    /* renamed from: b */
    void mo133032b(Context context);

    /* renamed from: b */
    void mo133033b(Context context, String str);

    /* renamed from: b */
    void mo133034b(Context context, String str, UrlParams.Source source);

    /* renamed from: b */
    void mo133035b(Map<String, AbstractC44136a.C44142ac> map, TabAppInfo tabAppInfo);

    /* renamed from: b */
    boolean mo133036b(String str);

    /* renamed from: c */
    void mo133037c(Map<String, AbstractC44136a.C44142ac> map, TabAppInfo tabAppInfo);

    /* renamed from: c */
    boolean mo133038c();

    /* renamed from: c */
    boolean mo133039c(Context context);

    /* renamed from: c */
    boolean mo133040c(Context context, String str);

    /* renamed from: d */
    void mo133041d(Context context);
}
