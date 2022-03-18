package com.bytedance.ee.bear.doc.screenshot;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.view.View;
import android.webkit.ValueCallback;
import android.webkit.WebView;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.C1177w;
import androidx.lifecycle.LiveData;
import com.alibaba.fastjson.JSONObject;
import com.bytedance.ee.bear.appsetting.C4211a;
import com.bytedance.ee.bear.basesdk.services.C4511g;
import com.bytedance.ee.bear.bizwidget.shareview.ExternalShareMinaConfig;
import com.bytedance.ee.bear.bizwidget.shareview.ShareType;
import com.bytedance.ee.bear.browser.AbstractC4928g;
import com.bytedance.ee.bear.contract.AbstractC5089af;
import com.bytedance.ee.bear.contract.AbstractC5233x;
import com.bytedance.ee.bear.contract.C5234y;
import com.bytedance.ee.bear.contract.ak;
import com.bytedance.ee.bear.doc.screenshot.DocShotPresenter;
import com.bytedance.ee.bear.doc.screenshot.p298a.p299a.AbstractC5507c;
import com.bytedance.ee.bear.doc.screenshot.p298a.p299a.C5505b;
import com.bytedance.ee.bear.domain.BearUrl;
import com.bytedance.ee.bear.facade.common.AbstractC7717k;
import com.bytedance.ee.bear.facade.common.widget.Toast;
import com.bytedance.ee.bear.list.dto.C8275a;
import com.bytedance.ee.bear.p522q.C10539a;
import com.bytedance.ee.bear.screenshot.C10779a;
import com.bytedance.ee.bear.service.C10917c;
import com.bytedance.ee.bear.share.export.AbstractC11003a;
import com.bytedance.ee.bear.share.export.AbstractC11005b;
import com.bytedance.ee.bear.thread.C11678b;
import com.bytedance.ee.bear.webview.C11755a;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.io.C13671b;
import com.bytedance.ee.util.io.C13680g;
import com.bytedance.ee.util.io.C13681h;
import com.bytedance.ee.util.p700c.C13598b;
import com.bytedance.ee.util.p701d.C13615c;
import com.bytedance.ee.util.p710m.AbstractC13707b;
import com.bytedance.ee.util.p710m.C13708c;
import com.bytedance.ee.util.p718t.C13742g;
import com.larksuite.suite.R;
import com.ss.android.lark.diskmanage.cipher.C36808a;
import io.reactivex.AbstractC68307f;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import org.koin.java.KoinJavaComponent;

public class DocShotPresenter implements AbstractC5500a, AbstractC7717k {

    /* renamed from: a */
    public boolean f15591a;

    /* renamed from: b */
    private C5505b f15592b;

    /* renamed from: c */
    private C1177w<Boolean> f15593c = new C1177w<>();

    /* renamed from: d */
    private AbstractC5089af.AbstractC5092c f15594d;

    /* renamed from: e */
    private Runnable f15595e;

    /* renamed from: f */
    private FragmentActivity f15596f;

    /* renamed from: g */
    private AbstractC4928g f15597g;

    /* renamed from: h */
    private AbstractC5518b f15598h;

    /* renamed from: i */
    private WebView f15599i;

    /* renamed from: j */
    private File f15600j;

    /* renamed from: k */
    private String f15601k;

    /* renamed from: l */
    private String f15602l;

    /* renamed from: m */
    private String f15603m;

    /* renamed from: n */
    private boolean f15604n;

    /* renamed from: o */
    private String f15605o;

    /* renamed from: p */
    private C10917c f15606p;

    /* renamed from: q */
    private boolean f15607q;

    /* renamed from: r */
    private long f15608r = 0;

    /* renamed from: s */
    private long f15609s = 0;

    /* renamed from: t */
    private AbstractC5492b f15610t;

    /* renamed from: u */
    private int f15611u;

    public @interface SCREEN_SHOT_STATE {
    }

    /* renamed from: com.bytedance.ee.bear.doc.screenshot.DocShotPresenter$a */
    public interface AbstractC5491a {
        /* renamed from: a */
        void mo21954a(boolean z);
    }

    /* renamed from: com.bytedance.ee.bear.doc.screenshot.DocShotPresenter$b */
    public interface AbstractC5492b {
        /* renamed from: a */
        void mo21958a();
    }

    public static /* synthetic */ void lambda$0GFrYf3BEt0dUkLkPyC28yHgwIk(DocShotPresenter docShotPresenter) {
        docShotPresenter.m22313s();
    }

    public static /* synthetic */ String lambda$0_8qZkuUvqHBwRMH4DCxTK7a168(ArrayList arrayList, ak akVar) {
        return akVar.shareImages(null, null, arrayList, true);
    }

    public static /* synthetic */ void lambda$1zbtZ9JKVH0zBOB5ZjVcBQXKw34(DocShotPresenter docShotPresenter, AbstractC5491a aVar, Uri uri) {
        docShotPresenter.m22298a(aVar, uri);
    }

    /* renamed from: a */
    public LiveData<Boolean> mo21933a() {
        return this.f15593c;
    }

    /* renamed from: k */
    public boolean mo21953k() {
        return this.f15607q;
    }

    /* renamed from: a */
    public void mo21942a(boolean z, DocShotModel docShotModel) {
        this.f15609s = System.currentTimeMillis();
        C13479a.m54772d("DocShotPresenter", "docShotReady()...success = " + z + ", backPressed = " + mo21953k());
        if (mo21953k()) {
            C13479a.m54764b("DocShotPresenter", "docShotReady()... has backpressed");
        } else if (z) {
            m22308n();
        } else {
            mo21940a("docShotReady(), is success = false", docShotModel);
        }
    }

    /* renamed from: a */
    public void mo21935a(WebView webView, AbstractC5518b bVar, BearUrl bearUrl, boolean z) {
        this.f15608r = System.currentTimeMillis();
        m22305c(true);
        mo21943b(false);
        if (webView != null && bearUrl != null) {
            this.f15601k = bearUrl.f17450e;
            this.f15602l = bearUrl.f17447b;
            this.f15603m = bearUrl.f17446a;
            this.f15604n = z;
            this.f15598h = bVar;
            ((View) bVar).setVisibility(0);
            this.f15598h.setDocShotPresenter(this);
            this.f15598h.setActivity(this.f15596f);
            this.f15598h.mo21961a(this.f15605o);
            m22294a(0, webView);
            mo21946d();
            if (this.f15591a) {
                this.f15611u = webView.getScrollY();
                webView.scrollTo(0, 0);
            }
            m22310p();
        }
    }

    /* renamed from: a */
    public void mo21939a(String str) {
        this.f15605o = str;
    }

    /* renamed from: a */
    public void mo21940a(String str, DocShotModel docShotModel) {
        m22305c(false);
        m22307m();
        C13479a.m54764b("DocShotPresenter", "docShotFail()..");
        AbstractC5518b bVar = this.f15598h;
        if (bVar != null) {
            bVar.mo21963b();
        }
        AbstractC5089af.AbstractC5092c cVar = this.f15594d;
        if (cVar != null) {
            cVar.mo20205b();
            this.f15594d = null;
        }
        this.f15600j = null;
        m22294a(1, this.f15599i);
        m22295a(1, str, docShotModel);
    }

    /* renamed from: a */
    public void mo21938a(File file, float f) {
        m22307m();
        C13479a.m54764b("DocShotPresenter", "docShotSucess()..");
        if (this.f15598h != null) {
            this.f15598h.mo21960a(file, f, !(C4511g.m18594d().mo17344E() == 1 && ((AbstractC11003a) KoinJavaComponent.m268610a(AbstractC11003a.class)).mo41762a().mo41777a()) && !this.f15604n, C4511g.m18594d().mo17344E() == 1);
        }
        AbstractC5089af.AbstractC5092c cVar = this.f15594d;
        if (cVar != null) {
            cVar.mo20204a();
            this.f15594d = null;
        }
        if (file != null) {
            this.f15600j = file;
        }
        m22295a(0, "success", null);
        m22294a(1, this.f15599i);
    }

    /* renamed from: a */
    private void m22300a(File file) {
        Uri a = C13681h.m55559a(mo21948f(), file);
        Intent intent = new Intent();
        intent.setAction("android.intent.action.SEND");
        intent.putExtra("android.intent.extra.STREAM", a);
        intent.setType("image/*");
        if (Build.VERSION.SDK_INT >= 24) {
            intent.addFlags(1);
            intent.addFlags(2);
        }
        try {
            this.f15596f.startActivity(Intent.createChooser(intent, mo21948f().getString(R.string.Doc_Doc_SharePic)));
        } catch (Exception unused) {
            Toast.showFailureText(mo21948f(), mo21948f().getString(R.string.Doc_Facade_OperateFailed), 0);
        }
    }

    @Override // com.bytedance.ee.bear.doc.screenshot.AbstractC5500a
    /* renamed from: a */
    public void mo21936a(ShareType shareType, boolean z) {
        FragmentActivity fragmentActivity;
        m22296a(shareType);
        if (C36808a.m145211c() != 1 || (fragmentActivity = this.f15596f) == null) {
            m22302b(shareType, z);
        } else {
            Toast.showText(fragmentActivity, fragmentActivity.getString(R.string.CreationMobile_ECM_ShareSecuritySettingKAToast), 1);
        }
    }

    /* renamed from: a */
    public void mo21941a(boolean z) {
        WebView webView = this.f15599i;
        if (webView != null) {
            boolean isVerticalScrollBarEnabled = webView.isVerticalScrollBarEnabled();
            if (!z || !isVerticalScrollBarEnabled) {
                this.f15599i.setVerticalScrollBarEnabled(false);
            } else {
                this.f15599i.setVerticalScrollBarEnabled(true);
            }
        }
    }

    /* renamed from: a */
    public void mo21934a(int i, int i2, int i3, int i4) {
        try {
            long currentTimeMillis = System.currentTimeMillis();
            if (this.f15608r == 0) {
                this.f15608r = currentTimeMillis;
            }
            if (this.f15609s == 0) {
                this.f15609s = currentTimeMillis;
            }
            int i5 = 0;
            if (i3 != 0) {
                i5 = i2 / i3;
                if (i2 % i3 > 0) {
                    i5++;
                }
            }
            HashMap hashMap = new HashMap();
            hashMap.put("file_id", m22311q());
            hashMap.put("file_type", m22312r());
            hashMap.put("time_cost_ms", String.valueOf(currentTimeMillis - this.f15608r));
            hashMap.put("js_cost_ms", String.valueOf(this.f15609s - this.f15608r));
            hashMap.put("native_cost_ms", String.valueOf(currentTimeMillis - this.f15609s));
            hashMap.put("width", String.valueOf(i));
            hashMap.put("height", String.valueOf(i2));
            hashMap.put("page_count", String.valueOf(i5));
            hashMap.put("file_size", String.valueOf((((i * i2) * 2) / 1024) / 1024));
            hashMap.put("status_code", String.valueOf(i4));
            C13479a.m54764b("DocShotPresenter", hashMap.toString());
            C5234y.m21391b().mo21079a("client_long_image_info", hashMap);
        } catch (Exception e) {
            C13479a.m54761a("DocShotPresenter", e);
        }
    }

    /* renamed from: a */
    public void mo21937a(AbstractC5089af.AbstractC5092c cVar) {
        this.f15594d = cVar;
    }

    /* renamed from: q */
    private String m22311q() {
        return C13598b.m55197d(this.f15602l);
    }

    /* renamed from: d */
    public void mo21946d() {
        AbstractC5518b bVar = this.f15598h;
        if (bVar != null) {
            bVar.mo21959a();
        }
    }

    /* renamed from: f */
    public Context mo21948f() {
        return this.f15596f.getApplication();
    }

    /* renamed from: m */
    private void m22307m() {
        WebView webView = this.f15599i;
        if (webView != null) {
            webView.scrollTo(0, this.f15611u);
        }
    }

    /* renamed from: r */
    private String m22312r() {
        String str = this.f15603m;
        if (str == null) {
            return C8275a.f22371d.mo32553a();
        }
        return str;
    }

    /* renamed from: s */
    private /* synthetic */ void m22313s() {
        C13479a.m54764b("DocShotPresenter", "ScreenShotExitTimeout()");
        this.f15598h.mo21964c();
        this.f15595e = null;
    }

    @Override // com.bytedance.ee.bear.doc.screenshot.AbstractC5500a
    /* renamed from: e */
    public void mo21947e() {
        m22309o();
        m22296a(ShareType.More);
    }

    @Override // com.bytedance.ee.bear.doc.screenshot.AbstractC5500a
    /* renamed from: g */
    public void mo21949g() {
        m22297a(new AbstractC5491a() {
            /* class com.bytedance.ee.bear.doc.screenshot.DocShotPresenter.C54881 */

            @Override // com.bytedance.ee.bear.doc.screenshot.DocShotPresenter.AbstractC5491a
            /* renamed from: a */
            public void mo21954a(boolean z) {
                if (z) {
                    Toast.showSuccessText(DocShotPresenter.this.mo21948f(), DocShotPresenter.this.mo21948f().getString(R.string.Doc_Doc_ShotSaveSuccessfully), 0);
                    DocShotPresenter.this.mo21951i();
                    return;
                }
                Toast.showSuccessText(DocShotPresenter.this.mo21948f(), DocShotPresenter.this.mo21948f().getString(R.string.Doc_Facade_SaveFailed), 0);
            }
        });
    }

    /* renamed from: l */
    private void m22306l() {
        Runnable runnable = this.f15595e;
        if (runnable != null) {
            C13742g.m55710c(runnable);
        }
        $$Lambda$DocShotPresenter$0GFrYf3BEt0dUkLkPyC28yHgwIk r0 = new Runnable() {
            /* class com.bytedance.ee.bear.doc.screenshot.$$Lambda$DocShotPresenter$0GFrYf3BEt0dUkLkPyC28yHgwIk */

            public final void run() {
                DocShotPresenter.lambda$0GFrYf3BEt0dUkLkPyC28yHgwIk(DocShotPresenter.this);
            }
        };
        this.f15595e = r0;
        C13742g.m55706a(r0, 500);
    }

    /* renamed from: o */
    private void m22309o() {
        C13479a.m54772d("DocShotPresenter", "onShareDoc()...");
        File file = this.f15600j;
        if (file != null && file.exists() && this.f15600j.isFile()) {
            m22300a(this.f15600j);
        }
    }

    /* renamed from: c */
    public void mo21945c() {
        Runnable runnable = this.f15595e;
        if (runnable != null) {
            C13742g.m55710c(runnable);
            this.f15598h.mo21964c();
            this.f15595e = null;
        }
    }

    /* renamed from: i */
    public void mo21951i() {
        try {
            HashMap hashMap = new HashMap();
            hashMap.put("action", "download");
            C5234y.m21391b().mo21079a("click_long_image_share", hashMap);
        } catch (Exception e) {
            C13479a.m54761a("DocShotPresenter", e);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.ee.bear.doc.screenshot.DocShotPresenter$3 */
    public static /* synthetic */ class C54903 {

        /* renamed from: a */
        static final /* synthetic */ int[] f15617a;

        /* JADX WARNING: Can't wrap try/catch for region: R(12:0|1|2|3|4|5|6|7|8|9|10|12) */
        /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                com.bytedance.ee.bear.bizwidget.shareview.ShareType[] r0 = com.bytedance.ee.bear.bizwidget.shareview.ShareType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.bytedance.ee.bear.doc.screenshot.DocShotPresenter.C54903.f15617a = r0
                com.bytedance.ee.bear.bizwidget.shareview.ShareType r1 = com.bytedance.ee.bear.bizwidget.shareview.ShareType.Wechat     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = com.bytedance.ee.bear.doc.screenshot.DocShotPresenter.C54903.f15617a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.bytedance.ee.bear.bizwidget.shareview.ShareType r1 = com.bytedance.ee.bear.bizwidget.shareview.ShareType.WechatMoments     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = com.bytedance.ee.bear.doc.screenshot.DocShotPresenter.C54903.f15617a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.bytedance.ee.bear.bizwidget.shareview.ShareType r1 = com.bytedance.ee.bear.bizwidget.shareview.ShareType.QQ     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = com.bytedance.ee.bear.doc.screenshot.DocShotPresenter.C54903.f15617a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.bytedance.ee.bear.bizwidget.shareview.ShareType r1 = com.bytedance.ee.bear.bizwidget.shareview.ShareType.Weibo     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = com.bytedance.ee.bear.doc.screenshot.DocShotPresenter.C54903.f15617a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.bytedance.ee.bear.bizwidget.shareview.ShareType r1 = com.bytedance.ee.bear.bizwidget.shareview.ShareType.More     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ee.bear.doc.screenshot.DocShotPresenter.C54903.<clinit>():void");
        }
    }

    /* renamed from: p */
    private void m22310p() {
        AbstractC5233x b = C5234y.m21391b();
        HashMap<String, Object> c = b.mo21086c("docCommonParams");
        b.mo21084b("ccm_space_docs_topbar_view", c);
        C13479a.m54772d("DocShotPresenter", "reportTopBarViewEvent, params = " + c);
    }

    @Override // com.bytedance.ee.bear.doc.screenshot.AbstractC5500a
    /* renamed from: j */
    public void mo21952j() {
        AbstractC5233x b = C5234y.m21391b();
        HashMap hashMap = new HashMap(b.mo21086c("docCommonParams"));
        hashMap.put("click", "close");
        hashMap.put("target", "none");
        b.mo21084b("ccm_space_docs_topbar_click", hashMap);
        C13479a.m54772d("DocShotPresenter", "reportTopBarClickCloseEvent, params = " + hashMap);
    }

    @Override // com.bytedance.ee.bear.doc.screenshot.AbstractC5500a
    /* renamed from: b */
    public boolean mo21944b() {
        m22305c(false);
        C13479a.m54772d("DocShotPresenter", "onBackPressed()...");
        mo21943b(true);
        m22294a(1, this.f15599i);
        C5505b bVar = this.f15592b;
        if (bVar != null) {
            bVar.mo21999b();
        }
        AbstractC5492b bVar2 = this.f15610t;
        if (bVar2 != null) {
            bVar2.mo21958a();
        }
        AbstractC5518b bVar3 = this.f15598h;
        if (bVar3 == null || !bVar3.mo21965d()) {
            return false;
        }
        if ("doc".equals(this.f15603m)) {
            m22306l();
        } else {
            this.f15598h.mo21964c();
        }
        return true;
    }

    @Override // com.bytedance.ee.bear.doc.screenshot.AbstractC5500a
    /* renamed from: h */
    public void mo21950h() {
        FragmentActivity fragmentActivity;
        m22296a(ShareType.Lark);
        if (C36808a.m145211c() != 1 || (fragmentActivity = this.f15596f) == null) {
            File file = this.f15600j;
            if (file != null && file.exists() && this.f15600j.isFile()) {
                Uri fromFile = Uri.fromFile(this.f15600j);
                ArrayList arrayList = new ArrayList();
                arrayList.add(fromFile);
                this.f15606p.mo41508c(ak.class).mo238020d(new Function(arrayList) {
                    /* class com.bytedance.ee.bear.doc.screenshot.$$Lambda$DocShotPresenter$0_8qZkuUvqHBwRMH4DCxTK7a168 */
                    public final /* synthetic */ ArrayList f$0;

                    {
                        this.f$0 = r1;
                    }

                    @Override // io.reactivex.functions.Function
                    public final Object apply(Object obj) {
                        return DocShotPresenter.lambda$0_8qZkuUvqHBwRMH4DCxTK7a168(this.f$0, (ak) obj);
                    }
                }).mo238001b($$Lambda$DocShotPresenter$V8xi6D6vfQ7644Y03q2uXT3wLtQ.INSTANCE, $$Lambda$DocShotPresenter$vV2edFr2AmVF6QgfGDYg94tkjtk.INSTANCE);
                return;
            }
            return;
        }
        Toast.showText(fragmentActivity, fragmentActivity.getString(R.string.CreationMobile_ECM_ShareSecuritySettingKAToast), 1);
    }

    /* renamed from: n */
    private void m22308n() {
        WebView webView = this.f15599i;
        if (webView != null) {
            webView.measure(0, 0);
            final int measuredWidth = this.f15599i.getMeasuredWidth();
            final int measuredHeight = this.f15599i.getMeasuredHeight();
            if (measuredWidth <= 0 || measuredHeight <= 0) {
                C13479a.m54758a("DocShotPresenter", "webView size is  0, width: " + measuredWidth + ", height: " + measuredHeight);
                mo21940a("web view  size error", (DocShotModel) null);
                return;
            }
            final int height = this.f15599i.getHeight();
            C13479a.m54764b("DocShotPresenter", "captureWebViewIfNeed()... count = " + (measuredHeight / height) + ", contentHeight =" + measuredHeight + ",height = " + height);
            C5505b a = new C5505b.C5506a(mo21948f()).mo22001a(this.f15599i).mo22000a(measuredWidth).mo22007b(measuredHeight).mo22008c(this.f15599i.getHeight()).mo22002a(this.f15593c).mo22005a(this.f15591a).mo22004a(C10779a.m44661a(mo21948f(), this.f15605o, ".png")).mo22003a(new AbstractC5507c() {
                /* class com.bytedance.ee.bear.doc.screenshot.DocShotPresenter.C54892 */

                @Override // com.bytedance.ee.bear.doc.screenshot.p298a.p299a.AbstractC5507c, com.bytedance.ee.bear.doc.screenshot.p298a.p299a.AbstractC5504a
                /* renamed from: a */
                public void mo21955a() {
                    if (DocShotPresenter.this.f15591a) {
                        DocShotPresenter.this.mo21941a(false);
                    }
                }

                @Override // com.bytedance.ee.bear.doc.screenshot.p298a.p299a.AbstractC5504a
                /* renamed from: a */
                public void mo21957a(File file, float f) {
                    if (DocShotPresenter.this.f15591a) {
                        DocShotPresenter.this.mo21941a(true);
                    }
                    DocShotPresenter.this.mo21938a(file, f);
                    DocShotPresenter.this.mo21934a(measuredWidth, measuredHeight, height, 0);
                }

                @Override // com.bytedance.ee.bear.doc.screenshot.p298a.p299a.AbstractC5507c, com.bytedance.ee.bear.doc.screenshot.p298a.p299a.AbstractC5504a
                /* renamed from: a */
                public void mo21956a(int i, String str) {
                    if (DocShotPresenter.this.f15591a) {
                        DocShotPresenter.this.mo21941a(true);
                    }
                    C13479a.m54758a("DocShotPresenter", "code:" + i + ", errorInfo :" + str);
                    DocShotPresenter.this.mo21940a(str, (DocShotModel) null);
                    DocShotPresenter.this.mo21934a(measuredWidth, measuredHeight, height, 1);
                }
            }).mo22006a();
            this.f15592b = a;
            a.mo21998a();
            return;
        }
        C13479a.m54758a("DocShotPresenter", "captureWebViewIfNeed while getWebView null");
        mo21940a("web view == null", (DocShotModel) null);
    }

    /* renamed from: b */
    public void mo21943b(boolean z) {
        this.f15607q = z;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ void m22301a(Throwable th) throws Exception {
        Toast.showFailureText(C13615c.f35773a, (int) R.string.Doc_Facade_SaveFailed);
        C13479a.m54761a("DocShotPresenter", th);
    }

    /* renamed from: c */
    private void m22305c(boolean z) {
        this.f15593c.mo5929b(Boolean.valueOf(z));
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: a */
    private /* synthetic */ Uri m22292a(Boolean bool) throws Exception {
        String name = this.f15600j.getName();
        Uri uri = null;
        for (int i = 1; i < 5; i++) {
            uri = C13671b.m55462a(mo21948f(), name, "", C13680g.f35878a);
            C13671b.m55469a(mo21948f(), this.f15600j.getAbsolutePath(), uri);
            if (uri != null) {
                break;
            }
            StringBuilder sb = new StringBuilder(name);
            int lastIndexOf = name.lastIndexOf(".");
            name = sb.insert(lastIndexOf, "(" + i + ")").toString();
        }
        if (uri != null) {
            return uri;
        }
        throw new RuntimeException("retry 5 times but destUri.exists == true");
    }

    /* renamed from: a */
    private void m22296a(ShareType shareType) {
        try {
            HashMap hashMap = new HashMap();
            hashMap.put("action", "share_button_click");
            int i = C54903.f15617a[shareType.ordinal()];
            if (i == 1) {
                hashMap.put("to_platform", "wechat");
            } else if (i == 2) {
                hashMap.put("to_platform", "wechat_article");
            } else if (i == 3) {
                hashMap.put("to_platform", "qq");
            } else if (i == 4) {
                hashMap.put("to_platform", "weibo");
            } else if (i == 5) {
                hashMap.put("to_platform", "more");
            }
            C5234y.m21391b().mo21079a("client_long_image_share", hashMap);
        } catch (Exception e) {
            C13479a.m54761a("DocShotPresenter", e);
        }
    }

    /* renamed from: a */
    private void m22297a(AbstractC5491a aVar) {
        C13479a.m54764b("DocShotPresenter", "onSaveDocBitmap()....");
        if (C36808a.m145211c() == 1) {
            Toast.showText(mo21948f(), mo21948f().getString(R.string.CreationMobile_ECM_SecuritySettingKAToast), 1, true);
            if (aVar != null) {
                aVar.mo21954a(false);
                return;
            }
            return;
        }
        C13708c.m55598a(mo21948f(), "android.permission.WRITE_EXTERNAL_STORAGE", mo21948f().getString(R.string.Doc_Facade_PermissionStorage), new AbstractC13707b(aVar) {
            /* class com.bytedance.ee.bear.doc.screenshot.$$Lambda$DocShotPresenter$FIINFr7EYvGJpka9V7LV_B7zFrg */
            public final /* synthetic */ DocShotPresenter.AbstractC5491a f$1;

            {
                this.f$1 = r2;
            }

            @Override // com.bytedance.ee.util.p710m.AbstractC13707b
            public final void onCheckResult(boolean z) {
                DocShotPresenter.this.m22299a((DocShotPresenter) this.f$1, (DocShotPresenter.AbstractC5491a) z);
            }
        });
    }

    /* renamed from: a */
    private void m22294a(int i, WebView webView) {
        if (webView != null) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("state", (Object) Integer.valueOf(i));
            C11755a.m48726a(webView, "javascript:window.native.screenshot", jSONObject, (ValueCallback<String>) null);
            this.f15599i = webView;
        }
    }

    /* renamed from: a */
    private /* synthetic */ void m22298a(AbstractC5491a aVar, Uri uri) throws Exception {
        boolean z;
        if (uri != null) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            C13671b.m55476e(mo21948f(), uri);
        }
        if (aVar != null) {
            aVar.mo21954a(z);
        }
    }

    /* renamed from: b */
    private void m22302b(ShareType shareType, boolean z) {
        boolean z2;
        int i;
        C13479a.m54772d("DocShotPresenter", "onShareToExternalApp()... channel = " + shareType.name());
        ExternalShareMinaConfig externalShareMinaConfig = (ExternalShareMinaConfig) C4211a.m17514a().mo16532a("external_share_config", ExternalShareMinaConfig.class, new ExternalShareMinaConfig());
        File file = this.f15600j;
        if (file != null && file.exists() && this.f15600j.isFile()) {
            String str = null;
            if (z) {
                HashMap hashMap = new HashMap();
                hashMap.put("Doc_name", this.f15605o);
                hashMap.put("Doc_url", Uri.parse(this.f15601k).buildUpon().clearQuery().toString());
                hashMap.put("emoji", "👉");
                Context f = mo21948f();
                if (externalShareMinaConfig.isShareDomainBanned(shareType)) {
                    i = R.string.Doc_Share_ExternalShareContentV2;
                } else {
                    i = R.string.Doc_Share_ExternalShareContentV1;
                }
                str = C10539a.m43640a(f, i, hashMap);
            }
            if (externalShareMinaConfig.isShareChannelBanned(shareType)) {
                ((AbstractC11003a) KoinJavaComponent.m268610a(AbstractC11003a.class)).mo41762a().mo41771a(this.f15596f, shareType, this.f15600j, str, (AbstractC11005b) null);
                return;
            }
            if (C4511g.m18594d().mo17344E() == 2) {
                z2 = true;
            } else {
                z2 = false;
            }
            ((AbstractC11003a) KoinJavaComponent.m268610a(AbstractC11003a.class)).mo41762a().mo41775a(z2, this.f15596f, shareType, this.f15600j, (AbstractC11005b) null);
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: a */
    private /* synthetic */ void m22299a(AbstractC5491a aVar, boolean z) {
        C13479a.m54764b("DocShotPresenter", "saveDocShot()... isGrant = " + z);
        if (z) {
            AbstractC68307f.m265083a((Object) true).mo237985a(C11678b.m48479c()).mo238020d(new Function() {
                /* class com.bytedance.ee.bear.doc.screenshot.$$Lambda$DocShotPresenter$SNCbbqXy5nwI1E08N6Bp7W8kw4 */

                @Override // io.reactivex.functions.Function
                public final Object apply(Object obj) {
                    return DocShotPresenter.this.m22292a((DocShotPresenter) ((Boolean) obj));
                }
            }).mo237985a(C11678b.m48481e()).mo238001b(new Consumer(aVar) {
                /* class com.bytedance.ee.bear.doc.screenshot.$$Lambda$DocShotPresenter$1zbtZ9JKVH0zBOB5ZjVcBQXKw34 */
                public final /* synthetic */ DocShotPresenter.AbstractC5491a f$1;

                {
                    this.f$1 = r2;
                }

                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    DocShotPresenter.lambda$1zbtZ9JKVH0zBOB5ZjVcBQXKw34(DocShotPresenter.this, this.f$1, (Uri) obj);
                }
            }, $$Lambda$DocShotPresenter$Fv_MrHUtepEH_4LOGNmr_P4EzY.INSTANCE);
        }
    }

    /* renamed from: a */
    private void m22295a(int i, String str, DocShotModel docShotModel) {
        try {
            HashMap hashMap = new HashMap();
            hashMap.put("file_id", m22311q());
            hashMap.put("file_type", m22312r());
            hashMap.put("status_code", Integer.valueOf(i));
            hashMap.put("status_name", str);
            if (docShotModel != null && !docShotModel.success) {
                hashMap.put("image_count", Integer.valueOf(docShotModel.image_count));
                hashMap.put("image_load_count", Integer.valueOf(docShotModel.image_load_count));
                hashMap.put("image_load_timeout", Boolean.valueOf(docShotModel.image_load_timeout));
            }
            C5234y.m21391b().mo21079a("client_generate_long_image", hashMap);
        } catch (Exception e) {
            C13479a.m54761a("DocShotPresenter", e);
        }
    }

    public DocShotPresenter(FragmentActivity fragmentActivity, AbstractC4928g gVar, C10917c cVar, boolean z) {
        this.f15596f = fragmentActivity;
        this.f15597g = gVar;
        this.f15606p = cVar;
        this.f15591a = !z;
        C13479a.m54764b("DocShotPresenter", "isCppEncodeEnabled:" + this.f15591a);
    }
}
