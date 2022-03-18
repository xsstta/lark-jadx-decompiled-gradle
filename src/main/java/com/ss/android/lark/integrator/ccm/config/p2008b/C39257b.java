package com.ss.android.lark.integrator.ccm.config.p2008b;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.ee.bear.basesdk.AbstractC4482e;
import com.bytedance.ee.bear.p391g.C7804b;
import com.bytedance.ee.log.C13479a;
import com.ss.android.lark.applink.AbstractC29186b;
import com.ss.android.lark.applink.AppLink;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import com.ss.android.lark.integrator.ccm.p2006c.C39242e;
import java.util.HashMap;

/* renamed from: com.ss.android.lark.integrator.ccm.config.b.b */
public class C39257b extends AbstractC29186b {
    @Override // com.ss.android.lark.applink.AbstractC29194f
    /* renamed from: a */
    public boolean mo103482a() {
        return true;
    }

    /* renamed from: b */
    public void mo143134b(AppLink appLink) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        String str10;
        String str11;
        String str12;
        String str13;
        String str14;
        String queryParameter;
        C13479a.m54764b("DocsTemplateAppLinkHandler", "DocsTemplateAppLinkHandler perform open template center");
        try {
            Uri parse = Uri.parse(appLink.mo103435a());
            str8 = parse.getQueryParameter("openTemplateCenter");
            try {
                str7 = parse.getQueryParameter("categoryId");
                try {
                    str6 = parse.getQueryParameter("topicId");
                    try {
                        str5 = parse.getQueryParameter("objType");
                    } catch (Exception unused) {
                        str14 = null;
                        str5 = null;
                        str4 = null;
                        str3 = null;
                        str13 = null;
                        str = null;
                        str12 = null;
                        C13479a.m54758a("DocsTemplateAppLinkHandler", "split openTemplateCenter fail : url = " + appLink.mo103435a());
                        str9 = str13;
                        str10 = str12;
                        str11 = str14;
                        str2 = null;
                        HashMap hashMap = new HashMap();
                        hashMap.put("openTemplateCenter", str8);
                        hashMap.put("from", "applink");
                        hashMap.put("templateCategory", str7);
                        hashMap.put("topicId", str6);
                        hashMap.put("objType", str5);
                        hashMap.put("action", str3);
                        hashMap.put("templateID", str10);
                        hashMap.put("token", str9);
                        hashMap.put(ShareHitPoint.f121869d, str);
                        hashMap.put("clickFrom", str11);
                        hashMap.put("sceneId", str4);
                        hashMap.put("enterSource", str2);
                        C39242e.m154771a().mo143097a("https://bytedance.feishu.cn/drive/template_center", hashMap);
                    }
                } catch (Exception unused2) {
                    str14 = null;
                    str6 = null;
                    str5 = null;
                    str4 = null;
                    str3 = null;
                    str13 = null;
                    str = null;
                    str12 = null;
                    C13479a.m54758a("DocsTemplateAppLinkHandler", "split openTemplateCenter fail : url = " + appLink.mo103435a());
                    str9 = str13;
                    str10 = str12;
                    str11 = str14;
                    str2 = null;
                    HashMap hashMap2 = new HashMap();
                    hashMap2.put("openTemplateCenter", str8);
                    hashMap2.put("from", "applink");
                    hashMap2.put("templateCategory", str7);
                    hashMap2.put("topicId", str6);
                    hashMap2.put("objType", str5);
                    hashMap2.put("action", str3);
                    hashMap2.put("templateID", str10);
                    hashMap2.put("token", str9);
                    hashMap2.put(ShareHitPoint.f121869d, str);
                    hashMap2.put("clickFrom", str11);
                    hashMap2.put("sceneId", str4);
                    hashMap2.put("enterSource", str2);
                    C39242e.m154771a().mo143097a("https://bytedance.feishu.cn/drive/template_center", hashMap2);
                }
            } catch (Exception unused3) {
                str14 = null;
                str7 = null;
                str6 = null;
                str5 = null;
                str4 = null;
                str3 = null;
                str13 = null;
                str = null;
                str12 = null;
                C13479a.m54758a("DocsTemplateAppLinkHandler", "split openTemplateCenter fail : url = " + appLink.mo103435a());
                str9 = str13;
                str10 = str12;
                str11 = str14;
                str2 = null;
                HashMap hashMap22 = new HashMap();
                hashMap22.put("openTemplateCenter", str8);
                hashMap22.put("from", "applink");
                hashMap22.put("templateCategory", str7);
                hashMap22.put("topicId", str6);
                hashMap22.put("objType", str5);
                hashMap22.put("action", str3);
                hashMap22.put("templateID", str10);
                hashMap22.put("token", str9);
                hashMap22.put(ShareHitPoint.f121869d, str);
                hashMap22.put("clickFrom", str11);
                hashMap22.put("sceneId", str4);
                hashMap22.put("enterSource", str2);
                C39242e.m154771a().mo143097a("https://bytedance.feishu.cn/drive/template_center", hashMap22);
            }
            try {
                str4 = parse.getQueryParameter("sceneId");
                try {
                    str3 = parse.getQueryParameter("action");
                    try {
                        queryParameter = parse.getQueryParameter("template_id");
                        try {
                            str13 = parse.getQueryParameter("token");
                        } catch (Exception unused4) {
                            str12 = queryParameter;
                            str14 = null;
                            str13 = null;
                            str = null;
                            C13479a.m54758a("DocsTemplateAppLinkHandler", "split openTemplateCenter fail : url = " + appLink.mo103435a());
                            str9 = str13;
                            str10 = str12;
                            str11 = str14;
                            str2 = null;
                            HashMap hashMap222 = new HashMap();
                            hashMap222.put("openTemplateCenter", str8);
                            hashMap222.put("from", "applink");
                            hashMap222.put("templateCategory", str7);
                            hashMap222.put("topicId", str6);
                            hashMap222.put("objType", str5);
                            hashMap222.put("action", str3);
                            hashMap222.put("templateID", str10);
                            hashMap222.put("token", str9);
                            hashMap222.put(ShareHitPoint.f121869d, str);
                            hashMap222.put("clickFrom", str11);
                            hashMap222.put("sceneId", str4);
                            hashMap222.put("enterSource", str2);
                            C39242e.m154771a().mo143097a("https://bytedance.feishu.cn/drive/template_center", hashMap222);
                        }
                    } catch (Exception unused5) {
                        str14 = null;
                        str13 = null;
                        str = null;
                        str12 = null;
                        C13479a.m54758a("DocsTemplateAppLinkHandler", "split openTemplateCenter fail : url = " + appLink.mo103435a());
                        str9 = str13;
                        str10 = str12;
                        str11 = str14;
                        str2 = null;
                        HashMap hashMap2222 = new HashMap();
                        hashMap2222.put("openTemplateCenter", str8);
                        hashMap2222.put("from", "applink");
                        hashMap2222.put("templateCategory", str7);
                        hashMap2222.put("topicId", str6);
                        hashMap2222.put("objType", str5);
                        hashMap2222.put("action", str3);
                        hashMap2222.put("templateID", str10);
                        hashMap2222.put("token", str9);
                        hashMap2222.put(ShareHitPoint.f121869d, str);
                        hashMap2222.put("clickFrom", str11);
                        hashMap2222.put("sceneId", str4);
                        hashMap2222.put("enterSource", str2);
                        C39242e.m154771a().mo143097a("https://bytedance.feishu.cn/drive/template_center", hashMap2222);
                    }
                } catch (Exception unused6) {
                    str14 = null;
                    str3 = null;
                    str13 = null;
                    str = null;
                    str12 = null;
                    C13479a.m54758a("DocsTemplateAppLinkHandler", "split openTemplateCenter fail : url = " + appLink.mo103435a());
                    str9 = str13;
                    str10 = str12;
                    str11 = str14;
                    str2 = null;
                    HashMap hashMap22222 = new HashMap();
                    hashMap22222.put("openTemplateCenter", str8);
                    hashMap22222.put("from", "applink");
                    hashMap22222.put("templateCategory", str7);
                    hashMap22222.put("topicId", str6);
                    hashMap22222.put("objType", str5);
                    hashMap22222.put("action", str3);
                    hashMap22222.put("templateID", str10);
                    hashMap22222.put("token", str9);
                    hashMap22222.put(ShareHitPoint.f121869d, str);
                    hashMap22222.put("clickFrom", str11);
                    hashMap22222.put("sceneId", str4);
                    hashMap22222.put("enterSource", str2);
                    C39242e.m154771a().mo143097a("https://bytedance.feishu.cn/drive/template_center", hashMap22222);
                }
                try {
                    str = parse.getQueryParameter(ShareHitPoint.f121869d);
                    str12 = queryParameter;
                    try {
                        String queryParameter2 = parse.getQueryParameter("clickfrom");
                        try {
                            str2 = parse.getQueryParameter("enterSource");
                            str11 = queryParameter2;
                            str9 = str13;
                            str10 = str12;
                        } catch (Exception unused7) {
                            str14 = queryParameter2;
                            C13479a.m54758a("DocsTemplateAppLinkHandler", "split openTemplateCenter fail : url = " + appLink.mo103435a());
                            str9 = str13;
                            str10 = str12;
                            str11 = str14;
                            str2 = null;
                            HashMap hashMap222222 = new HashMap();
                            hashMap222222.put("openTemplateCenter", str8);
                            hashMap222222.put("from", "applink");
                            hashMap222222.put("templateCategory", str7);
                            hashMap222222.put("topicId", str6);
                            hashMap222222.put("objType", str5);
                            hashMap222222.put("action", str3);
                            hashMap222222.put("templateID", str10);
                            hashMap222222.put("token", str9);
                            hashMap222222.put(ShareHitPoint.f121869d, str);
                            hashMap222222.put("clickFrom", str11);
                            hashMap222222.put("sceneId", str4);
                            hashMap222222.put("enterSource", str2);
                            C39242e.m154771a().mo143097a("https://bytedance.feishu.cn/drive/template_center", hashMap222222);
                        }
                    } catch (Exception unused8) {
                        str14 = null;
                        C13479a.m54758a("DocsTemplateAppLinkHandler", "split openTemplateCenter fail : url = " + appLink.mo103435a());
                        str9 = str13;
                        str10 = str12;
                        str11 = str14;
                        str2 = null;
                        HashMap hashMap2222222 = new HashMap();
                        hashMap2222222.put("openTemplateCenter", str8);
                        hashMap2222222.put("from", "applink");
                        hashMap2222222.put("templateCategory", str7);
                        hashMap2222222.put("topicId", str6);
                        hashMap2222222.put("objType", str5);
                        hashMap2222222.put("action", str3);
                        hashMap2222222.put("templateID", str10);
                        hashMap2222222.put("token", str9);
                        hashMap2222222.put(ShareHitPoint.f121869d, str);
                        hashMap2222222.put("clickFrom", str11);
                        hashMap2222222.put("sceneId", str4);
                        hashMap2222222.put("enterSource", str2);
                        C39242e.m154771a().mo143097a("https://bytedance.feishu.cn/drive/template_center", hashMap2222222);
                    }
                } catch (Exception unused9) {
                    str12 = queryParameter;
                    str14 = null;
                    str = null;
                    C13479a.m54758a("DocsTemplateAppLinkHandler", "split openTemplateCenter fail : url = " + appLink.mo103435a());
                    str9 = str13;
                    str10 = str12;
                    str11 = str14;
                    str2 = null;
                    HashMap hashMap22222222 = new HashMap();
                    hashMap22222222.put("openTemplateCenter", str8);
                    hashMap22222222.put("from", "applink");
                    hashMap22222222.put("templateCategory", str7);
                    hashMap22222222.put("topicId", str6);
                    hashMap22222222.put("objType", str5);
                    hashMap22222222.put("action", str3);
                    hashMap22222222.put("templateID", str10);
                    hashMap22222222.put("token", str9);
                    hashMap22222222.put(ShareHitPoint.f121869d, str);
                    hashMap22222222.put("clickFrom", str11);
                    hashMap22222222.put("sceneId", str4);
                    hashMap22222222.put("enterSource", str2);
                    C39242e.m154771a().mo143097a("https://bytedance.feishu.cn/drive/template_center", hashMap22222222);
                }
            } catch (Exception unused10) {
                str14 = null;
                str4 = null;
                str3 = null;
                str13 = null;
                str = null;
                str12 = null;
                C13479a.m54758a("DocsTemplateAppLinkHandler", "split openTemplateCenter fail : url = " + appLink.mo103435a());
                str9 = str13;
                str10 = str12;
                str11 = str14;
                str2 = null;
                HashMap hashMap222222222 = new HashMap();
                hashMap222222222.put("openTemplateCenter", str8);
                hashMap222222222.put("from", "applink");
                hashMap222222222.put("templateCategory", str7);
                hashMap222222222.put("topicId", str6);
                hashMap222222222.put("objType", str5);
                hashMap222222222.put("action", str3);
                hashMap222222222.put("templateID", str10);
                hashMap222222222.put("token", str9);
                hashMap222222222.put(ShareHitPoint.f121869d, str);
                hashMap222222222.put("clickFrom", str11);
                hashMap222222222.put("sceneId", str4);
                hashMap222222222.put("enterSource", str2);
                C39242e.m154771a().mo143097a("https://bytedance.feishu.cn/drive/template_center", hashMap222222222);
            }
        } catch (Exception unused11) {
            str14 = null;
            str8 = null;
            str7 = null;
            str6 = null;
            str5 = null;
            str4 = null;
            str3 = null;
            str13 = null;
            str = null;
            str12 = null;
            C13479a.m54758a("DocsTemplateAppLinkHandler", "split openTemplateCenter fail : url = " + appLink.mo103435a());
            str9 = str13;
            str10 = str12;
            str11 = str14;
            str2 = null;
            HashMap hashMap2222222222 = new HashMap();
            hashMap2222222222.put("openTemplateCenter", str8);
            hashMap2222222222.put("from", "applink");
            hashMap2222222222.put("templateCategory", str7);
            hashMap2222222222.put("topicId", str6);
            hashMap2222222222.put("objType", str5);
            hashMap2222222222.put("action", str3);
            hashMap2222222222.put("templateID", str10);
            hashMap2222222222.put("token", str9);
            hashMap2222222222.put(ShareHitPoint.f121869d, str);
            hashMap2222222222.put("clickFrom", str11);
            hashMap2222222222.put("sceneId", str4);
            hashMap2222222222.put("enterSource", str2);
            C39242e.m154771a().mo143097a("https://bytedance.feishu.cn/drive/template_center", hashMap2222222222);
        }
        HashMap hashMap22222222222 = new HashMap();
        hashMap22222222222.put("openTemplateCenter", str8);
        hashMap22222222222.put("from", "applink");
        hashMap22222222222.put("templateCategory", str7);
        hashMap22222222222.put("topicId", str6);
        hashMap22222222222.put("objType", str5);
        hashMap22222222222.put("action", str3);
        hashMap22222222222.put("templateID", str10);
        hashMap22222222222.put("token", str9);
        hashMap22222222222.put(ShareHitPoint.f121869d, str);
        hashMap22222222222.put("clickFrom", str11);
        hashMap22222222222.put("sceneId", str4);
        hashMap22222222222.put("enterSource", str2);
        C39242e.m154771a().mo143097a("https://bytedance.feishu.cn/drive/template_center", hashMap22222222222);
    }

    @Override // com.ss.android.lark.applink.AbstractC29194f
    /* renamed from: d */
    public boolean mo103484d(Context context, AppLink appLink) {
        if (appLink == null || TextUtils.isEmpty(appLink.mo103435a())) {
            C13479a.m54775e("DocsTemplateAppLinkHandler", "check params appLink is null");
            return false;
        }
        C13479a.m54772d("DocsTemplateAppLinkHandler", "DocsTemplateAppLinkHandler can open call from " + Thread.currentThread().getName());
        return true;
    }

    @Override // com.ss.android.lark.applink.AbstractC29194f
    /* renamed from: c */
    public boolean mo103483c(Context context, final AppLink appLink) {
        String a = appLink.mo103435a();
        C13479a.m54764b("DocsTemplateAppLinkHandler", "appLink handle url: " + a);
        if (TextUtils.isEmpty(a)) {
            return false;
        }
        if (C7804b.m31285c()) {
            mo143134b(appLink);
            return true;
        }
        C13479a.m54764b("DocsTemplateAppLinkHandler", "DocsTemplateAppLinkHandler handle open doc waiting doc init");
        C39242e.m154771a().mo143103b();
        C39242e.m154771a().mo143083a(new AbstractC4482e() {
            /* class com.ss.android.lark.integrator.ccm.config.p2008b.C39257b.C392581 */

            @Override // com.bytedance.ee.bear.basesdk.AbstractC4482e
            public void onInit() {
                C39242e.m154771a().mo143105b(this);
                C39257b.this.mo143134b(appLink);
            }
        });
        return true;
    }
}
