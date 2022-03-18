package com.bytedance.ug.sdk.share.impl.p923g;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import com.bytedance.ug.sdk.share.api.entity.TokenInfoBean;
import com.bytedance.ug.sdk.share.api.p916c.AbstractC20808c;
import com.bytedance.ug.sdk.share.impl.network.p929a.RunnableC20860a;
import com.bytedance.ug.sdk.share.impl.p919c.C20826a;
import com.bytedance.ug.sdk.share.impl.p921e.C20831b;
import com.bytedance.ug.sdk.share.impl.p921e.C20832c;
import com.bytedance.ug.sdk.share.impl.p926i.p927a.C20848a;
import com.bytedance.ug.sdk.share.impl.p928j.C20850a;
import com.bytedance.ug.sdk.share.impl.p928j.C20853d;
import com.bytedance.ug.sdk.share.impl.p928j.C20854e;
import com.bytedance.ug.sdk.share.impl.p928j.C20859f;
import com.google.gson.GsonBuilder;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: com.bytedance.ug.sdk.share.impl.g.b */
public class C20836b {

    /* renamed from: a */
    public volatile boolean f51002a;

    /* renamed from: b */
    private final Context f51003b;

    /* access modifiers changed from: private */
    /* renamed from: com.bytedance.ug.sdk.share.impl.g.b$a */
    public static class C20838a {

        /* renamed from: a */
        public static C20836b f51005a = new C20836b();
    }

    /* renamed from: a */
    public static C20836b m75878a() {
        return C20838a.f51005a;
    }

    private C20836b() {
        this.f51003b = C20840d.m75892a().mo70319b();
    }

    /* renamed from: d */
    private void m75881d() {
        C20859f.m75922a().mo70336b("user_copy_content");
    }

    /* renamed from: e */
    private String m75882e() {
        return C20859f.m75922a().mo70335a("user_copy_content", "");
    }

    /* renamed from: b */
    public void mo70314b() {
        m75881d();
        C20850a.m75906a("ClipBoardCheckerManager", "clear clipboard");
        C20853d.m75910a(C20840d.m75892a().mo70319b(), "", "");
    }

    /* renamed from: c */
    public void mo70315c() {
        if (!this.f51002a) {
            String a = C20853d.m75909a(this.f51003b);
            if (!TextUtils.isEmpty(a)) {
                String e = m75882e();
                if (TextUtils.isEmpty(e) || !a.equals(e)) {
                    mo70313a(a);
                    return;
                }
                C20826a.m75837a().mo70295a(false, "token", "filtered");
                mo70314b();
            }
        }
    }

    /* renamed from: c */
    private void m75880c(String str) {
        this.f51002a = true;
        C20826a.m75837a().mo70292a(new RunnableC20860a(str, "clipboard", new RunnableC20860a.AbstractC20864a() {
            /* class com.bytedance.ug.sdk.share.impl.p923g.C20836b.C208371 */

            @Override // com.bytedance.ug.sdk.share.impl.network.p929a.RunnableC20860a.AbstractC20864a
            /* renamed from: a */
            public void mo70316a(int i) {
                String str;
                if (i == 2) {
                    C20836b.this.mo70314b();
                    str = "expired";
                } else if (i == 1001) {
                    str = "other_app";
                } else if (i == 1) {
                    str = "failed";
                } else {
                    str = "unknown";
                }
                C20836b.this.f51002a = false;
                C20843e.m75897a().mo70324a(false);
                C20832c.m75872a(false, "token", str);
                C20831b.m75869a(false);
                C20826a.m75837a().mo70295a(false, "token", str);
            }

            @Override // com.bytedance.ug.sdk.share.impl.network.p929a.RunnableC20860a.AbstractC20864a
            /* renamed from: a */
            public void mo70317a(String str) {
                C20836b.this.mo70314b();
                C20836b.this.f51002a = false;
                try {
                    TokenInfoBean tokenInfoBean = (TokenInfoBean) new GsonBuilder().create().fromJson(str, TokenInfoBean.class);
                    if (tokenInfoBean != null) {
                        tokenInfoBean.setTokenType("token");
                        Activity g = C20826a.m75837a().mo70303g();
                        if (g != null) {
                            if (!C20826a.m75837a().mo70298b(g, tokenInfoBean)) {
                                C20836b.this.mo70312a(tokenInfoBean);
                            }
                        } else {
                            return;
                        }
                    }
                } catch (Exception e) {
                    C20854e.m75914b(e.toString());
                }
                C20843e.m75897a().mo70324a(false);
                C20832c.m75872a(true, "token", "success");
                C20831b.m75869a(true);
                C20826a.m75837a().mo70295a(true, "token", "success");
            }
        }));
    }

    /* renamed from: b */
    private String m75879b(String str) {
        String c = C20840d.m75892a().mo70320c();
        if (TextUtils.isEmpty(c)) {
            return null;
        }
        try {
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            Matcher matcher = Pattern.compile(c).matcher(str);
            if (matcher.find()) {
                return matcher.group();
            }
            return null;
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* renamed from: a */
    public void mo70312a(TokenInfoBean tokenInfoBean) {
        Activity g;
        AbstractC20808c a;
        if (tokenInfoBean != null && (g = C20826a.m75837a().mo70303g()) != null && (a = C20826a.m75837a().mo70287a(g, tokenInfoBean)) != null) {
            new C20848a(g, tokenInfoBean, a).mo70331a();
        }
    }

    /* renamed from: a */
    public void mo70313a(String str) {
        String b = m75879b(str);
        if (TextUtils.isEmpty(b)) {
            C20826a.m75837a().mo70295a(false, "token", "regex match failed");
            return;
        }
        C20843e.m75897a().mo70324a(true);
        m75880c(b);
    }
}
