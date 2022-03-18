package com.bytedance.ee.ref.card.p686a;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import android.widget.FrameLayout;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.bytedance.ee.larkbrand.utils.JsonUtil;
import com.bytedance.ee.ref.card.api.CardAPIModule;
import com.bytedance.ee.ref.card.meta.CardAppInfo;
import com.bytedance.ee.ref.card.p686a.AbstractC13508d;
import com.bytedance.ee.ref.card.p687b.C13522b;
import com.bytedance.ee.ref.card.p687b.C13525d;
import com.bytedance.ee.ref.card.p690e.C13532a;
import com.bytedance.ee.ref.card.p690e.C13537b;
import com.google.firebase.messaging.Constants;
import com.lynx.tasm.AbstractC26911n;
import com.lynx.tasm.C26910m;
import com.lynx.tasm.LynxPerfMetric;
import com.lynx.tasm.LynxView;
import java.io.File;
import java.util.Arrays;

/* renamed from: com.bytedance.ee.ref.card.a.b */
public class C13505b extends FrameLayout {

    /* renamed from: a */
    public final String[] f35580a = {"http", "https", "file", "content", "res", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "asset"};

    /* renamed from: b */
    public CardAppInfo f35581b;

    /* renamed from: c */
    public IAppContext f35582c;

    /* renamed from: d */
    public C13525d f35583d;

    /* renamed from: e */
    private LynxView f35584e;

    /* renamed from: f */
    private C13507c f35585f;

    /* renamed from: g */
    private AbstractC26911n f35586g;

    /* renamed from: h */
    private boolean f35587h = true;

    /* renamed from: i */
    private AbstractC13508d.AbstractC13511c f35588i;

    public CardAppInfo getCardAppInfo() {
        return this.f35581b;
    }

    /* renamed from: a */
    public void mo50234a() {
        LynxView lynxView = this.f35584e;
        if (lynxView != null) {
            lynxView.destroy();
        }
    }

    /* renamed from: b */
    private void m54869b() {
        m54870c();
        addView(this.f35584e, new FrameLayout.LayoutParams(-1, -1));
    }

    /* renamed from: c */
    private void m54870c() {
        C26910m c = this.f35585f.mo50252c();
        c.mo95727a("BDLynxModule", CardAPIModule.class, this.f35582c);
        c.mo95731b(C13512e.m54910a(this.f35585f.mo50251b()));
        this.f35584e = c.mo95734a(getContext());
        C135061 r0 = new AbstractC26911n() {
            /* class com.bytedance.ee.ref.card.p686a.C13505b.C135061 */

            /* renamed from: b */
            private CardAppInfo f35590b;

            @Override // com.lynx.tasm.AbstractC26911n
            /* renamed from: b */
            public void mo11461b() {
                String str;
                super.mo11461b();
                CardAppInfo cardAppInfo = this.f35590b;
                if (cardAppInfo == null) {
                    str = "";
                } else {
                    str = cardAppInfo.getIdentifier();
                }
                AppBrandLogger.m52830i("card_app_launch", "card_view_onFirstScreen and cardId:", str);
            }

            @Override // com.lynx.tasm.AbstractC26911n
            /* renamed from: a */
            public void mo11457a() {
                String str;
                super.mo11457a();
                CardAppInfo cardAppInfo = this.f35590b;
                if (cardAppInfo == null) {
                    str = "";
                } else {
                    str = cardAppInfo.getIdentifier();
                }
                AppBrandLogger.m52830i("card_app_launch", "card_view_onLoadSuccess and cardId:", str);
                if (C13505b.this.f35581b != null) {
                    new C13537b("op_app_card_render_result", C13532a.f35631k, C13505b.this.f35582c).mo50291a(C13505b.this.f35581b).setResultTypeSuccess().flush();
                }
            }

            @Override // com.lynx.tasm.AbstractC26911n
            /* renamed from: d */
            public void mo11463d() {
                String str;
                super.mo11463d();
                CardAppInfo cardAppInfo = this.f35590b;
                if (cardAppInfo == null) {
                    str = "";
                } else {
                    str = cardAppInfo.getIdentifier();
                }
                AppBrandLogger.m52830i("card_app_launch", "card_view_onPageUpdate and cardId:", str);
                if (C13505b.this.f35581b != null) {
                    new C13537b("op_app_card_render_result", C13532a.f35632l, C13505b.this.f35582c).mo50291a(C13505b.this.f35581b).setResultTypeSuccess().flush();
                }
            }

            {
                this.f35590b = C13505b.this.getCardAppInfo();
            }

            @Override // com.lynx.tasm.AbstractC26911n
            /* renamed from: a */
            public void mo11458a(LynxPerfMetric lynxPerfMetric) {
                super.mo11458a(lynxPerfMetric);
                if (lynxPerfMetric != null) {
                    new C13537b("op_app_card_performance", null, C13505b.this.f35582c).mo50291a(C13505b.this.f35581b).addCategoryValue("performance_type", "first_load").addMap(JsonUtil.m54377a(lynxPerfMetric.toJSONObject().toString())).flush();
                }
            }

            @Override // com.lynx.tasm.AbstractC26911n
            /* renamed from: b */
            public void mo50245b(LynxPerfMetric lynxPerfMetric) {
                super.mo50245b(lynxPerfMetric);
                if (lynxPerfMetric != null) {
                    new C13537b("op_app_card_performance", null, C13505b.this.f35582c).mo50291a(C13505b.this.f35581b).addCategoryValue("performance_type", "update").addMap(JsonUtil.m54377a(lynxPerfMetric.toJSONObject().toString())).flush();
                }
            }

            @Override // com.lynx.tasm.AbstractC26911n
            /* renamed from: c */
            public void mo50246c(String str) {
                String str2;
                super.mo50246c(str);
                CardAppInfo cardAppInfo = this.f35590b;
                if (cardAppInfo == null) {
                    str2 = "";
                } else {
                    str2 = cardAppInfo.getIdentifier();
                }
                AppBrandLogger.m52829e("card_app_launch", "card_view_onLoadFailed!" + str, " cardId:", str2);
                if (C13505b.this.f35581b != null) {
                    new C13537b("op_app_card_render_result", C13532a.f35630j, C13505b.this.f35582c).mo50291a(C13505b.this.f35581b).setResultTypeFail().setErrorMessage(str).flush();
                }
            }

            @Override // com.lynx.tasm.AbstractC26911n
            /* renamed from: a */
            public void mo11460a(String str) {
                String str2;
                super.mo11460a(str);
                CardAppInfo cardAppInfo = this.f35590b;
                if (cardAppInfo == null) {
                    str2 = "";
                } else {
                    str2 = cardAppInfo.getIdentifier();
                }
                AppBrandLogger.m52830i("card_app_launch", "card_view_onPageStart....url:" + str, "cardId", str2);
            }

            @Override // com.lynx.tasm.behavior.AbstractC26674h, com.lynx.tasm.AbstractC26911n
            /* renamed from: b */
            public String mo33934b(String str) {
                String str2;
                String str3 = null;
                if (TextUtils.isEmpty(str)) {
                    AppBrandLogger.m52829e("card_app_launch", "shouldRedirectImageUrl is empty!");
                    return null;
                }
                try {
                    Uri parse = Uri.parse(str);
                    String scheme = parse.getScheme();
                    if (scheme != null && Arrays.asList(C13505b.this.f35580a).contains(scheme)) {
                        return str;
                    }
                    if (!parse.isRelative()) {
                        AppBrandLogger.m52830i("card_app_launch", "other custom schema!!!");
                    } else if (C13505b.this.f35583d != null) {
                        String scheme2 = C13505b.this.f35583d.mo50284a().getScheme();
                        String parent = new File(C13505b.this.f35583d.mo50284a().getPath()).getParent();
                        if (!parent.isEmpty()) {
                            if (!parent.endsWith(File.separator)) {
                                str2 = new File(parent + File.separator + str).getAbsolutePath();
                                str3 = new Uri.Builder().scheme(scheme2).path(str2).build().toString();
                            }
                        }
                        str2 = new File(parent + str).getAbsolutePath();
                        str3 = new Uri.Builder().scheme(scheme2).path(str2).build().toString();
                    }
                    if (!TextUtils.isEmpty(str3)) {
                        return str3;
                    }
                    return super.mo33934b(str);
                } catch (Exception e) {
                    e.printStackTrace();
                    AppBrandLogger.m52829e("card_app_launch", "shouldRedirectImageUrl->error:" + e.getMessage());
                }
            }

            @Override // com.lynx.tasm.AbstractC26911n
            /* renamed from: d */
            public void mo50247d(String str) {
                String str2;
                super.mo50247d(str);
                CardAppInfo cardAppInfo = this.f35590b;
                if (cardAppInfo == null) {
                    str2 = "";
                } else {
                    str2 = cardAppInfo.getIdentifier();
                }
                AppBrandLogger.m52829e("card_app_launch", "card_view_onReceivedError" + str, " and cardId:", str2);
                if (C13505b.this.f35581b != null) {
                    new C13537b("op_app_card_render_result", C13532a.f35633m, C13505b.this.f35582c).mo50291a(C13505b.this.f35581b).setResultTypeFail().setErrorMessage(str).flush();
                }
            }
        };
        this.f35586g = r0;
        this.f35584e.addLynxViewClient(r0);
    }

    /* renamed from: b */
    public void mo50241b(String str) {
        this.f35584e.updateData(str);
    }

    public void setCardViewSizeChangeListener(AbstractC13508d.AbstractC13511c cVar) {
        if (cVar != null) {
            this.f35588i = cVar;
        }
    }

    /* renamed from: a */
    public void mo50237a(String str) {
        mo50238a(str, "");
    }

    /* renamed from: a */
    public void mo50235a(AbstractC13508d.AbstractC13510b bVar) {
        this.f35584e.removeLynxViewClient(this.f35586g);
        this.f35584e.addLynxViewClient(new C13513f(bVar));
        this.f35584e.addLynxViewClient(this.f35586g);
    }

    /* renamed from: a */
    public void mo50236a(CardAppInfo cardAppInfo) {
        if (cardAppInfo != null) {
            this.f35581b = cardAppInfo;
            this.f35582c.setAppId(cardAppInfo.getAppId());
            C13522b bVar = (C13522b) this.f35582c.getExtra();
            if (bVar == null) {
                bVar = new C13522b();
            }
            bVar.mo50277a(this.f35581b.getIdentifier());
        }
    }

    /* renamed from: a */
    public void mo50239a(byte[] bArr) {
        mo50240a(bArr, "");
    }

    /* renamed from: a */
    public void mo50238a(String str, String str2) {
        this.f35584e.renderTemplateUrl(str, str2);
    }

    /* renamed from: a */
    public void mo50240a(byte[] bArr, String str) {
        this.f35584e.renderTemplateWithBaseUrl(bArr, str, "");
    }

    public C13505b(Context context, IAppContext iAppContext, C13507c cVar) {
        super(context);
        this.f35582c = iAppContext;
        this.f35585f = cVar;
        this.f35581b = cVar.mo50250a();
        C13522b bVar = new C13522b();
        CardAppInfo cardAppInfo = this.f35581b;
        if (cardAppInfo != null) {
            this.f35582c.setAppId(cardAppInfo.getAppId());
            bVar.mo50277a(this.f35581b.getIdentifier());
        }
        this.f35582c.setExtra(bVar);
        m54869b();
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (this.f35587h) {
            this.f35587h = false;
            return;
        }
        AbstractC13508d.AbstractC13511c cVar = this.f35588i;
        if (cVar != null) {
            cVar.mo50265a(i, i2);
        }
    }
}
