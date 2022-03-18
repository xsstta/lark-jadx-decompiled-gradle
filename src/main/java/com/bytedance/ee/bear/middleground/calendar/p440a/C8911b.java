package com.bytedance.ee.bear.middleground.calendar.p440a;

import android.content.Context;
import android.text.TextUtils;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import com.bytedance.ee.bear.middleground.calendar.C8890a;
import com.bytedance.ee.bear.middleground.calendar.editor.AbstractC8921a;
import com.bytedance.ee.bear.middleground.calendar.editor.AbstractC8922b;
import com.bytedance.ee.bear.middleground.calendar.util.OfflineUtils;
import com.bytedance.ee.bear.middleground.docsdk.AbstractC9312e;
import com.bytedance.ee.bear.middleground.docsdk.C9306a;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.io.C13675f;
import com.bytedance.lark.p832a.C14579a;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.util.List;
import java.util.Map;

/* renamed from: com.bytedance.ee.bear.middleground.calendar.a.b */
public class C8911b extends AbstractC9312e {

    /* renamed from: a */
    public static final String f24052a = Charset.defaultCharset().name();

    /* renamed from: b */
    private AbstractC8922b f24053b;

    /* renamed from: c */
    private AbstractC8912c f24054c;

    /* renamed from: d */
    private AbstractC8921a f24055d;

    @Override // com.bytedance.ee.bear.middleground.docsdk.AbstractC9312e
    /* renamed from: a */
    public C9306a mo34185a() {
        return C9306a.f25029c;
    }

    public C8911b(Context context) {
    }

    /* renamed from: a */
    public void mo34187a(AbstractC8912c cVar) {
        this.f24054c = cVar;
    }

    /* renamed from: a */
    public void mo34188a(AbstractC8921a aVar) {
        this.f24055d = aVar;
    }

    /* renamed from: a */
    private String m37341a(String str) {
        if (TextUtils.isEmpty(str)) {
            C13479a.m54758a("CalendarWebViewClient", "convertLarkDownloadUrl(): mainDomain is null");
            return "https://www.feishu.cn/download";
        }
        return "https://www." + str + "/download";
    }

    /* renamed from: a */
    public static String m37340a(InputStream inputStream) {
        Throwable th;
        BufferedReader bufferedReader;
        IOException e;
        StringBuffer stringBuffer = new StringBuffer();
        BufferedReader bufferedReader2 = null;
        if (inputStream != null) {
            try {
                if (inputStream.available() > 0) {
                    bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
                    while (true) {
                        try {
                            String readLine = bufferedReader.readLine();
                            if (readLine == null) {
                                break;
                            }
                            stringBuffer.append(readLine + System.getProperty("line.separator"));
                        } catch (IOException e2) {
                            e = e2;
                            try {
                                C13479a.m54761a("CalendarWebViewClient", e);
                                C13675f.m55505a(inputStream, bufferedReader);
                                return stringBuffer.toString();
                            } catch (Throwable th2) {
                                th = th2;
                                bufferedReader2 = bufferedReader;
                                C13675f.m55505a(inputStream, bufferedReader2);
                                throw th;
                            }
                        }
                    }
                    C13675f.m55505a(inputStream, bufferedReader);
                    return stringBuffer.toString();
                }
            } catch (IOException e3) {
                bufferedReader = null;
                e = e3;
                C13479a.m54761a("CalendarWebViewClient", e);
                C13675f.m55505a(inputStream, bufferedReader);
                return stringBuffer.toString();
            } catch (Throwable th3) {
                th = th3;
                C13675f.m55505a(inputStream, bufferedReader2);
                throw th;
            }
        }
        C13479a.m54758a("CalendarWebViewClient", "convertString()... steam is invalid");
        String stringBuffer2 = stringBuffer.toString();
        C13675f.m55505a(inputStream, null);
        return stringBuffer2;
    }

    /* renamed from: a */
    private String m37342a(List<String> list) {
        if (list == null || list.isEmpty()) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        for (String str : list) {
            sb.append("'");
            sb.append(str);
            sb.append("',");
        }
        return sb.toString();
    }

    /* renamed from: a */
    public void mo34189a(AbstractC8922b bVar) {
        this.f24053b = bVar;
    }

    @Override // com.bytedance.ee.bear.middleground.docsdk.AbstractC9312e, android.webkit.WebViewClient
    public boolean shouldOverrideUrlLoading(WebView webView, String str) {
        super.shouldOverrideUrlLoading(webView, str);
        AbstractC8922b bVar = this.f24053b;
        if (bVar != null) {
            return bVar.onStartLoading(webView, str);
        }
        return true;
    }

    @Override // android.webkit.WebViewClient
    public WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
        C13479a.m54764b("CalendarWebViewClient", "shouldInterceptRequest()... url = " + str);
        if (TextUtils.equals(str, C8890a.m37287c())) {
            return m37339a(webView, str, "calendar_mobile_index.html");
        }
        if (str.contains(C14579a.m59042a())) {
            String a = C14579a.m59042a();
            C13479a.m54764b("CalendarWebViewClient", "shouldInterceptRequest(): load common js " + a);
            return m37343b(webView, str, a);
        } else if (!str.contains("calendar_mobile_index.js")) {
            return null;
        } else {
            String substring = str.substring(str.lastIndexOf("/") + 1);
            C13479a.m54764b("CalendarWebViewClient", "shouldInterceptRequest(): jsName =" + substring);
            return m37343b(webView, str, substring);
        }
    }

    @Override // com.bytedance.ee.bear.middleground.docsdk.AbstractC9312e
    /* renamed from: a */
    public void mo34190a(String str, Map<String, String> map) {
        AbstractC8912c cVar = this.f24054c;
        if (cVar != null) {
            cVar.onTrackEvent(str, map);
        } else {
            C13479a.m54758a("CalendarWebViewClient", "onTrackEvent(): mAnalyticCallback is null");
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.middleground.docsdk.AbstractC9312e
    /* renamed from: a */
    public void mo34186a(WebView webView, boolean z, int i) {
        super.mo34186a(webView, z, i);
        AbstractC8921a aVar = this.f24055d;
        if (aVar != null) {
            aVar.mo34221a();
        }
        C8890a.m37286b();
    }

    /* renamed from: b */
    private WebResourceResponse m37343b(WebView webView, String str, String str2) {
        Exception e;
        InputStream inputStream;
        try {
            inputStream = webView.getContext().getAssets().open(str2);
            try {
                if (inputStream.available() > 0) {
                    return new WebResourceResponse(OfflineUtils.m37361a(str), f24052a, inputStream);
                }
                C13675f.m55517b(inputStream);
                C13479a.m54758a("CalendarWebViewClient", "shouldInterceptRequest()... mResponseContent inputstream is invalid end");
                return null;
            } catch (Exception e2) {
                e = e2;
                C13675f.m55517b(inputStream);
                C13479a.m54759a("CalendarWebViewClient", "shouldInterceptRequest(): failed exception = ", e);
                return null;
            }
        } catch (Exception e3) {
            e = e3;
            inputStream = null;
            C13675f.m55517b(inputStream);
            C13479a.m54759a("CalendarWebViewClient", "shouldInterceptRequest(): failed exception = ", e);
            return null;
        }
    }

    /* renamed from: a */
    private WebResourceResponse m37339a(WebView webView, String str, String str2) {
        Exception e;
        InputStream inputStream;
        try {
            inputStream = webView.getContext().getAssets().open(str2);
            try {
                String a = m37340a(inputStream);
                C13479a.m54764b("CalendarWebViewClient", "getHtmlWebResourceResponse(): 1 = " + a);
                if (!a.contains("domainConfig") && C8890a.m37288d() != null) {
                    StringBuilder sb = new StringBuilder(a);
                    sb.insert(sb.indexOf("<head>") + 6, "\n<script>\n    var domainConfig = {\n      common: {\n        domainPool: [\n{{domainPool}}        ],\n      },\n      space_api: [\n{{space_api}}      ],\n      urlMapper: {\n        downloadLark: '{{downloadLark}}',\n      },\n    };\n    </script>".replace("{{domainPool}}", m37342a(C8890a.m37288d().mo34208a())).replace("{{space_api}}", m37342a(C8890a.m37288d().mo34209b())).replace("{{downloadLark}}", m37341a(C8890a.m37288d().mo34210c())));
                    a = sb.toString();
                    C13479a.m54764b("CalendarWebViewClient", "getHtmlWebResourceResponse(): 2 = " + a);
                }
                String str3 = f24052a;
                ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(a.getBytes(str3));
                try {
                    if (byteArrayInputStream.available() > 0) {
                        return new WebResourceResponse(OfflineUtils.m37361a(str), str3, byteArrayInputStream);
                    }
                    C13675f.m55517b(byteArrayInputStream);
                    C13479a.m54758a("CalendarWebViewClient", "shouldInterceptRequest()... mResponseContent inputstream is invalid end");
                    return null;
                } catch (Exception e2) {
                    e = e2;
                    inputStream = byteArrayInputStream;
                    C13675f.m55517b(inputStream);
                    C13479a.m54759a("CalendarWebViewClient", "shouldInterceptRequest(): failed exception = ", e);
                    return null;
                }
            } catch (Exception e3) {
                e = e3;
                C13675f.m55517b(inputStream);
                C13479a.m54759a("CalendarWebViewClient", "shouldInterceptRequest(): failed exception = ", e);
                return null;
            }
        } catch (Exception e4) {
            e = e4;
            inputStream = null;
            C13675f.m55517b(inputStream);
            C13479a.m54759a("CalendarWebViewClient", "shouldInterceptRequest(): failed exception = ", e);
            return null;
        }
    }
}
