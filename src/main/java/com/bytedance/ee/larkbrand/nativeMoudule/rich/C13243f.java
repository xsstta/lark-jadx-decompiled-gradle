package com.bytedance.ee.larkbrand.nativeMoudule.rich;

import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.MessageQueue;
import android.text.TextUtils;
import android.view.View;
import androidx.constraintlayout.widget.C0689b;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.bytedance.ee.larkbrand.nativeMoudule.rich.C13208a;
import com.bytedance.ee.larkbrand.nativeMoudule.rich.C13213b;
import com.bytedance.ee.larkbrand.nativeMoudule.rich.C13240e;
import com.bytedance.ee.larkbrand.nativeMoudule.rich.bean.C13233a;
import com.bytedance.ee.larkbrand.nativeMoudule.rich.bean.C13235c;
import com.bytedance.ee.larkbrand.nativeMoudule.rich.bean.RichTextData;
import com.bytedance.ee.larkbrand.nativeMoudule.rich.p660a.C13212a;
import com.bytedance.ee.larkbrand.nativeMoudule.rich.p661b.C13223c;
import com.bytedance.ee.larkbrand.nativeMoudule.rich.p661b.C13229d;
import com.bytedance.ee.larkbrand.nativeMoudule.rich.util.C13256a;
import com.bytedance.ee.larkbrand.nativeMoudule.rich.util.C13259b;
import com.bytedance.ee.larkbrand.nativeMoudule.rich.util.C13263c;
import com.bytedance.ee.larkbrand.nativeMoudule.rich.util.C13264d;
import com.bytedance.ee.larkbrand.nativeMoudule.rich.util.C13265e;
import com.bytedance.ee.larkbrand.nativeMoudule.rich.util.C13266f;
import com.bytedance.ee.larkbrand.nativeMoudule.rich.util.C13270g;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.larksuite.framework.callback.UICallbackExecutor;
import com.larksuite.suite.R;
import com.tt.miniapp.p3357x.p3358a.C67404a;
import com.tt.miniapphost.C67432a;
import com.tt.miniapphost.entity.AppInfoEntity;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.bytedance.ee.larkbrand.nativeMoudule.rich.f */
public class C13243f extends ConstraintLayout implements C13208a.AbstractC13211a, C13213b.AbstractC13216a, C13223c.AbstractC13227b, C13240e.AbstractC13242a, C13256a.AbstractC13258a, C13266f.AbstractC13269a {

    /* renamed from: a */
    public C13208a f35077a;

    /* renamed from: b */
    public C13223c f35078b;

    /* renamed from: c */
    public View f35079c;

    /* renamed from: d */
    public RichTextData f35080d;

    /* renamed from: e */
    public C13270g.C13271a f35081e = new C13270g.C13271a();

    /* renamed from: f */
    protected IAppContext f35082f;

    /* renamed from: g */
    private C13213b f35083g;

    /* renamed from: h */
    private View f35084h;

    /* renamed from: i */
    private C0689b f35085i;

    /* renamed from: j */
    private AbstractC13249a f35086j;

    /* renamed from: k */
    private C13266f f35087k;

    /* renamed from: l */
    private C13270g f35088l;

    /* renamed from: m */
    private Handler f35089m;

    /* renamed from: com.bytedance.ee.larkbrand.nativeMoudule.rich.f$a */
    public interface AbstractC13249a {
        /* renamed from: b */
        void mo49456b();

        /* renamed from: c */
        void mo49457c();
    }

    @Override // com.bytedance.ee.larkbrand.nativeMoudule.rich.C13240e.AbstractC13242a
    /* renamed from: c */
    public void mo49434c() {
        mo49447h();
    }

    /* renamed from: f */
    public void mo49444f() {
        mo49445g();
    }

    public C13213b getTool() {
        return this.f35083g;
    }

    /* renamed from: a */
    public void mo49440a(List<C13235c> list) {
        if (list == null || list.size() == 0) {
            AppBrandLogger.m52830i("RichText", "This action is not choose anyone");
        } else if (this.f35080d.isCustomize()) {
            m53964b("updateAt");
        } else {
            for (C13235c cVar : list) {
                this.f35077a.getEdit().mo49421a(cVar);
            }
        }
    }

    /* renamed from: a */
    public void mo49439a(String str) {
        m53964b(str);
        AbstractC13249a aVar = this.f35086j;
        if (aVar != null) {
            aVar.mo49457c();
        }
    }

    /* renamed from: a */
    public void m53962a(String[] strArr, String[] strArr2, final String str) {
        try {
            AppBrandLogger.m52830i("RichText", "request openids finished");
            this.f35081e.mo49489a("at", this.f35077a.getEdit().mo49423a(strArr, strArr2));
            final String obj = this.f35077a.getEdit().getText().toString();
            UICallbackExecutor.execute(new Runnable() {
                /* class com.bytedance.ee.larkbrand.nativeMoudule.rich.C13243f.RunnableC132484 */

                public void run() {
                    try {
                        if (C13243f.this.f35080d != null) {
                            AppBrandLogger.m52830i("RichText", "build event, eventName=" + C13243f.this.f35080d.getEventName());
                            C13243f.this.f35081e.mo49487a("content", obj, C13243f.this.f35080d.isEnablesReturnKey());
                            C13243f.this.f35081e.mo49491a(C13243f.this.f35080d.getEventName(), str, C13243f.this.f35082f);
                        }
                    } catch (Exception e) {
                        AppBrandLogger.eWithThrowable("RichText", "onOpenidGet build event", e);
                    }
                }
            });
        } catch (Exception e) {
            AppBrandLogger.eWithThrowable("RichText", "onOpenidGet", e);
        }
    }

    @Override // com.bytedance.ee.larkbrand.nativeMoudule.rich.C13240e.AbstractC13242a
    /* renamed from: a */
    public void mo49433a(boolean z) {
        this.f35083g.mo49342b(z || this.f35077a.getAttach().mo49473a() || this.f35080d.isEnablesReturnKey());
    }

    /* renamed from: o */
    private void m53968o() {
        m53963b(0);
    }

    /* renamed from: k */
    public void mo49449k() {
        m53964b("hide");
    }

    /* renamed from: l */
    private void m53965l() {
        C13264d.m54035a(getContext());
        m53967n();
        m53966m();
    }

    /* renamed from: q */
    private void m53970q() {
        C13263c.m54032a(this);
        AbstractC13249a aVar = this.f35086j;
        if (aVar != null) {
            aVar.mo49456b();
        }
    }

    /* renamed from: r */
    private void m53971r() {
        View view = this.f35079c;
        if (view != null) {
            removeView(view);
            this.f35079c = null;
        }
    }

    /* renamed from: d */
    public void mo49442d() {
        C13263c.m54033b(this.f35077a.getEdit());
    }

    /* renamed from: g */
    public void mo49445g() {
        post(new Runnable() {
            /* class com.bytedance.ee.larkbrand.nativeMoudule.rich.C13243f.RunnableC132452 */

            public void run() {
                C13243f.this.mo49442d();
                C13243f.this.f35077a.getEdit().post(new Runnable() {
                    /* class com.bytedance.ee.larkbrand.nativeMoudule.rich.C13243f.RunnableC132452.RunnableC132461 */

                    public void run() {
                        C13243f.this.f35077a.getEdit().requestFocus();
                    }
                });
            }
        });
    }

    @Override // com.bytedance.ee.larkbrand.nativeMoudule.rich.p661b.C13223c.AbstractC13227b
    /* renamed from: i */
    public void mo49364i() {
        C13229d.m53937a(this.f35077a.getEdit());
    }

    /* renamed from: p */
    private void m53969p() {
        C13263c.m54032a(this);
        View view = this.f35079c;
        if (view == null || view != this.f35078b) {
            this.f35089m.postDelayed(new Runnable() {
                /* class com.bytedance.ee.larkbrand.nativeMoudule.rich.C13243f.RunnableC132473 */

                public void run() {
                    if (C13243f.this.f35079c != null) {
                        C13243f fVar = C13243f.this;
                        fVar.removeView(fVar.f35079c);
                    }
                    if (C13243f.this.f35078b == null) {
                        C13243f.this.f35078b = new C13223c(C13243f.this.getContext(), C13243f.this);
                        C13243f.this.f35078b.setId(View.generateViewId());
                        C13243f.this.f35078b.setBackgroundColor(C13243f.this.getContext().getResources().getColor(R.color.bg_base));
                    }
                    C13243f fVar2 = C13243f.this;
                    fVar2.addView(fVar2.f35078b);
                    C13243f fVar3 = C13243f.this;
                    fVar3.mo49437a(fVar3.f35078b);
                    C13243f fVar4 = C13243f.this;
                    fVar4.f35079c = fVar4.f35078b;
                }
            }, 50);
        }
    }

    @Override // com.bytedance.ee.larkbrand.nativeMoudule.rich.C13208a.AbstractC13211a
    /* renamed from: a */
    public void mo49327a() {
        if (this.f35079c != null) {
            m53968o();
            removeView(this.f35079c);
            this.f35079c = null;
        }
        this.f35083g.mo49334a(0);
    }

    /* renamed from: e */
    public void mo49443e() {
        m53971r();
        if (Build.VERSION.SDK_INT >= 23) {
            getContext().getMainLooper().getQueue().addIdleHandler(new MessageQueue.IdleHandler() {
                /* class com.bytedance.ee.larkbrand.nativeMoudule.rich.C13243f.C132441 */

                public boolean queueIdle() {
                    C13263c.m54033b(C13243f.this.f35077a.getEdit());
                    return false;
                }
            });
        }
    }

    @Override // com.bytedance.ee.larkbrand.nativeMoudule.rich.C13213b.AbstractC13216a
    /* renamed from: b */
    public void mo49349b() {
        RichTextData richTextData = this.f35080d;
        if (richTextData != null && richTextData.getMode() != null && this.f35080d.getMode().getItems() != null && !this.f35080d.getMode().getItems().isEmpty()) {
            this.f35087k.mo49481a(this.f35080d.getMode().getItems(), 0);
            this.f35087k.mo49479a();
        }
    }

    @Override // com.bytedance.ee.larkbrand.nativeMoudule.rich.util.C13256a.AbstractC13258a
    /* renamed from: j */
    public void mo49448j() {
        AppBrandLogger.m52830i("RichText", "attach image delete");
        this.f35081e.mo49490a("picture");
        this.f35077a.getAttach().setVisibility(8);
        if (TextUtils.isEmpty(this.f35077a.getEdit().getText()) && !this.f35080d.isEnablesReturnKey()) {
            this.f35083g.mo49342b(false);
        }
    }

    /* renamed from: m */
    private void m53966m() {
        C13208a aVar = new C13208a(getContext(), this.f35082f);
        this.f35077a = aVar;
        aVar.setListener(this);
        this.f35077a.setId(View.generateViewId());
        addView(this.f35077a);
        this.f35085i.mo3883a(this.f35077a.getId(), 4, this.f35084h.getId(), 3, 0);
        m53961a(this.f35077a, this.f35085i);
        this.f35085i.mo3904c(this.f35077a.getId(), -2);
        this.f35085i.mo3905c(this);
        this.f35077a.getAttach().setListener(this);
    }

    /* renamed from: n */
    private void m53967n() {
        String str;
        this.f35085i = new C0689b();
        RichTextData richTextData = this.f35080d;
        String str2 = "";
        if (richTextData != null) {
            String avatar = richTextData.getAvatar();
            RichTextData.UserModel mode = this.f35080d.getMode();
            if (mode != null) {
                str2 = mode.getData();
            }
            str2 = avatar;
            str = str2;
        } else {
            str = str2;
        }
        C13213b bVar = new C13213b(getContext(), str2, str);
        this.f35083g = bVar;
        bVar.mo49335a(this);
        View b = this.f35083g.mo49339b();
        this.f35084h = b;
        addView(b);
        this.f35085i.mo3883a(this.f35084h.getId(), 4, 0, 4, 0);
        m53961a(this.f35084h, this.f35085i);
        this.f35085i.mo3904c(this.f35084h.getId(), C13264d.f35141o);
    }

    /* renamed from: h */
    public void mo49447h() {
        AppBrandLogger.m52830i("RichText", "show at panel");
        IAppContext iAppContext = this.f35082f;
        if (iAppContext != null && iAppContext.getCurrentActivity() != null) {
            C13263c.m54032a(this);
            m53971r();
            try {
                Intent intent = new Intent();
                intent.setComponent(new ComponentName(getContext().getPackageName(), "com.ss.android.lark.contact.impl.selector.little_app.LittleAppSelectMemberActivity"));
                intent.putExtra("ui_style", 6);
                this.f35082f.getCurrentActivity().startActivityForResult(intent, 20005);
            } catch (ActivityNotFoundException e) {
                AppBrandLogger.eWithThrowable("RichText", "showAtPanel", e);
            }
        }
    }

    public void setListener(AbstractC13249a aVar) {
        this.f35086j = aVar;
    }

    /* renamed from: a */
    public void mo49437a(View view) {
        m53960a(view, C13264d.f35140n);
    }

    @Override // com.bytedance.ee.larkbrand.nativeMoudule.rich.p661b.C13223c.AbstractC13227b
    /* renamed from: a */
    public void mo49363a(C13233a aVar) {
        this.f35077a.getEdit().mo49420a(aVar);
    }

    /* renamed from: b */
    private void m53963b(int i) {
        this.f35085i.mo3883a(this.f35084h.getId(), 4, 0, 4, i);
        this.f35085i.mo3905c(this);
    }

    /* renamed from: b */
    private void m53964b(String str) {
        C13212a[] atData = this.f35077a.getEdit().getAtData();
        JSONArray jSONArray = new JSONArray();
        if (atData != null && atData.length > 0) {
            for (C13212a aVar : atData) {
                if (TextUtils.isEmpty(aVar.mo49330c())) {
                    jSONArray.put(aVar.mo49329b());
                }
            }
        }
        if (jSONArray.length() > 0) {
            AppBrandLogger.m52830i("RichText", "at span need to request openid");
            AppInfoEntity appInfo = C67432a.m262319a(this.f35082f).getAppInfo();
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put(HiAnalyticsConstant.HaKey.BI_KEY_APPID, appInfo.appId);
                jSONObject.put("userids", jSONArray);
                C13259b.m54027a(jSONObject, new C13259b.AbstractC13262a(str) {
                    /* class com.bytedance.ee.larkbrand.nativeMoudule.rich.$$Lambda$f$eK73VOCHtKmH2qdlNY6brvew8g */
                    public final /* synthetic */ String f$1;

                    {
                        this.f$1 = r2;
                    }

                    @Override // com.bytedance.ee.larkbrand.nativeMoudule.rich.util.C13259b.AbstractC13262a
                    public final void onOpenidGet(String[] strArr, String[] strArr2) {
                        C13243f.this.m53962a((C13243f) this.f$1, (String) strArr, strArr2);
                    }
                }, this.f35082f);
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else {
            AppBrandLogger.m52830i("RichText", "all at span has openid");
            m53962a((String[]) null, (String[]) null, str);
        }
    }

    @Override // com.bytedance.ee.larkbrand.nativeMoudule.rich.C13213b.AbstractC13216a
    /* renamed from: a */
    public void mo49348a(int i) {
        if (i == 1) {
            mo49447h();
        } else if (i == 2) {
            m53969p();
        } else if (i == 3) {
            m53970q();
        } else if (i == 4) {
            mo49439a("publish");
        }
    }

    /* renamed from: a */
    public void mo49438a(RichTextData richTextData) {
        boolean z;
        boolean z2;
        boolean z3;
        if (richTextData != null) {
            this.f35080d = richTextData;
            boolean z4 = true;
            if (richTextData.isEnablesReturnKey()) {
                this.f35083g.mo49342b(true);
            }
            if (!TextUtils.isEmpty(this.f35080d.getAvatar())) {
                AppBrandLogger.m52828d("RichText", "updateRichText avatar=" + this.f35080d.getAvatar());
                this.f35083g.mo49336a(this.f35080d.getAvatar());
            }
            if (!TextUtils.isEmpty(this.f35080d.getContent())) {
                this.f35077a.getEdit().mo49422a(this.f35080d.getContent(), this.f35080d.getAt());
            }
            if (!TextUtils.isEmpty(this.f35080d.getPlaceholder())) {
                this.f35077a.mo49321a(this.f35080d.getPlaceholder());
            }
            if (this.f35080d.getPicture() != null && this.f35080d.getPicture().length > 0) {
                try {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(this.f35080d.getPicture()[0]);
                    this.f35081e.mo49488a("picture", arrayList);
                } catch (Exception e) {
                    AppBrandLogger.eWithThrowable("RichText", "", e);
                }
                this.f35077a.getAttach().mo49472a(this.f35080d.getPicture()[0]);
                this.f35083g.mo49342b(true);
            }
            RichTextData richTextData2 = this.f35080d;
            if (richTextData2 != null) {
                this.f35083g.mo49343c(richTextData2.isShowEmoji());
            }
            RichTextData richTextData3 = this.f35080d;
            if (richTextData3 != null) {
                C13213b bVar = this.f35083g;
                if (richTextData3.getAt() != null) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                bVar.mo49344d(z3);
            }
            C13213b bVar2 = this.f35083g;
            if (this.f35080d.getPicture() != null) {
                z = true;
            } else {
                z = false;
            }
            bVar2.mo49345e(z);
            C13213b bVar3 = this.f35083g;
            if (this.f35080d.getMode() != null) {
                z2 = true;
            } else {
                z2 = false;
            }
            bVar3.mo49338a(z2);
            C13240e edit = this.f35077a.getEdit();
            if (!(this.f35080d.getPicture() == null && this.f35080d.getAt() == null)) {
                z4 = false;
            }
            edit.setAnonymous(z4);
        }
    }

    /* renamed from: a */
    private void m53960a(View view, int i) {
        this.f35085i.mo3883a(view.getId(), 4, 0, 4, 0);
        m53961a(view, this.f35085i);
        this.f35085i.mo3904c(view.getId(), i);
        this.f35085i.mo3883a(this.f35084h.getId(), 4, view.getId(), 3, 0);
        this.f35085i.mo3905c(this);
    }

    /* renamed from: a */
    private void m53961a(View view, C0689b bVar) {
        bVar.mo3883a(view.getId(), 1, 0, 1, 0);
        bVar.mo3883a(view.getId(), 2, 0, 2, 0);
        bVar.mo3907d(view.getId(), 0);
    }

    @Override // com.bytedance.ee.larkbrand.nativeMoudule.rich.util.C13266f.AbstractC13269a
    /* renamed from: a */
    public void mo49435a(int i, String str) {
        AppBrandLogger.m52830i("RichText", "onPickViewConfirm index=" + i + " item=" + str);
        this.f35083g.mo49341b(str);
        try {
            this.f35081e.mo49487a("userModelSelect", str, false);
            m53964b("modelSelect");
            this.f35083g.mo49336a(str);
        } catch (Exception e) {
            e.printStackTrace();
            AppBrandLogger.eWithThrowable("RichText", "onPickViewConfirm", e);
            this.f35088l.mo49485a("error", "send anonymous error");
        }
        mo49443e();
    }

    /* renamed from: a */
    public void mo49436a(Bitmap bitmap, String str) {
        int a = C13264d.m54034a(getContext(), 12.0f);
        this.f35077a.getAttach().setImageBitmap(C13265e.m54037a(bitmap, a, a));
        try {
            ArrayList arrayList = new ArrayList();
            arrayList.add(C67404a.m262266a(this.f35082f).mo234076a(str));
            AppBrandLogger.m52830i("RichText", "image url=" + C67404a.m262266a(this.f35082f).mo234076a(str));
            this.f35088l.mo49486a("picSelect", arrayList);
            this.f35081e.mo49488a("picture", arrayList);
        } catch (Exception e) {
            e.printStackTrace();
            this.f35088l.mo49485a("error", "send picture url error");
        }
        this.f35083g.mo49342b(true);
    }

    public C13243f(Context context, RichTextData richTextData, IAppContext iAppContext) {
        super(context);
        this.f35082f = iAppContext;
        this.f35080d = richTextData;
        C13266f fVar = new C13266f(iAppContext.getCurrentActivity());
        this.f35087k = fVar;
        fVar.mo49480a(this);
        this.f35088l = new C13270g(richTextData.getEventName(), iAppContext);
        setTag("RichText");
        m53965l();
        mo49438a(this.f35080d);
        this.f35089m = new Handler(Looper.getMainLooper());
    }
}
