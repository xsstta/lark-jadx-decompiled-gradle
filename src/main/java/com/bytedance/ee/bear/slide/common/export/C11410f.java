package com.bytedance.ee.bear.slide.common.export;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Picture;
import android.net.Uri;
import android.text.TextUtils;
import android.webkit.WebView;
import com.alibaba.fastjson.JSONObject;
import com.bytedance.ee.bear.browser.AbstractC4928g;
import com.bytedance.ee.bear.browser.AbstractC4931i;
import com.bytedance.ee.bear.document.DocViewModel;
import com.bytedance.ee.bear.facade.common.widget.Toast;
import com.bytedance.ee.bear.slide.common.export.AbstractC11392a;
import com.bytedance.ee.bear.slide.common.export.C11404c;
import com.bytedance.ee.bear.slide.common.export.C11407d;
import com.bytedance.ee.bear.slide.common.export.C11410f;
import com.bytedance.ee.bear.slide.common.export.p551a.AbstractC11401d;
import com.bytedance.ee.bear.slide.common.export.p551a.C11398c;
import com.bytedance.ee.bear.slide.common.p550a.C11385a;
import com.bytedance.ee.bear.thread.BearExecutors;
import com.bytedance.ee.bear.thread.C11678b;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.io.C13671b;
import com.bytedance.ee.util.io.C13675f;
import com.bytedance.ee.util.io.C13680g;
import com.bytedance.ee.util.p710m.AbstractC13707b;
import com.bytedance.ee.util.p710m.C13708c;
import com.larksuite.suite.R;
import io.reactivex.AbstractC68307f;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Collections;
import java.util.Date;
import java.util.List;

/* renamed from: com.bytedance.ee.bear.slide.common.export.f */
public class C11410f implements AbstractC11392a {

    /* renamed from: a */
    public int f30655a;

    /* renamed from: b */
    public boolean f30656b;

    /* renamed from: c */
    public String f30657c;

    /* renamed from: d */
    public AbstractC11403b f30658d;

    /* renamed from: e */
    public Context f30659e;

    /* renamed from: f */
    public C11409e f30660f;

    /* renamed from: g */
    public Uri f30661g;

    /* renamed from: h */
    public List<Uri> f30662h;

    /* renamed from: i */
    private boolean f30663i;

    /* renamed from: j */
    private C11398c f30664j;

    /* renamed from: k */
    private AbstractC4931i f30665k;

    /* renamed from: l */
    private DocViewModel f30666l;

    /* renamed from: m */
    private SlideExportNetExecutor f30667m;

    /* renamed from: n */
    private Activity f30668n;

    /* renamed from: o */
    private AbstractC4928g f30669o;

    /* renamed from: p */
    private C11404c f30670p = new C11404c(this.f30659e);

    /* renamed from: q */
    private File f30671q;

    /* renamed from: com.bytedance.ee.bear.slide.common.export.f$a */
    public interface AbstractC11414a {
        void onSaveBitmapFinished(boolean z);
    }

    /* renamed from: a */
    public void mo43674a(String str, String str2) {
        this.f30663i = false;
        this.f30670p.mo43662a();
        this.f30656b = false;
        if (this.f30658d != null) {
            String token = this.f30666l.getToken();
            String b = this.f30666l.getDocName().mo5927b();
            mo43675f();
            if (str.equals("pdf")) {
                this.f30657c = C11407d.C11408a.f30650a;
                this.f30655a = 1;
                this.f30667m.mo43595a("slide2pdf", token, str2, b);
            } else if (str.equals("longPicture")) {
                this.f30657c = C11407d.C11408a.f30652c;
                this.f30655a = 1;
                mo43673a(str);
            } else if (str.equals("multiPicture")) {
                this.f30657c = C11407d.C11408a.f30651b;
                int length = str2.split("[|]").length - 1;
                this.f30655a = length;
                C13479a.m54764b("SlideExportPresenter", String.valueOf(length));
                this.f30667m.mo43595a("slide2png", token, str2, b);
            }
        }
    }

    /* renamed from: a */
    public void mo43672a(File file, List<Bitmap> list) {
        C13479a.m54764b("SlideExportPresenter", "docShotSuccess()...");
        if (this.f30663i) {
            C13479a.m54764b("SlideExportPresenter", "doExportLongPictureSuccess but back pressed...");
        } else if (file == null || list == null) {
            mo43679j();
        } else {
            this.f30671q = file;
            this.f30660f.mo43669a(this.f30657c, String.valueOf(file.length() / 1048576), String.valueOf(this.f30655a), "100", "success");
            AbstractC11403b bVar = this.f30658d;
            if (bVar != null) {
                bVar.mo43617a(file, list);
            }
        }
    }

    /* renamed from: a */
    public void mo43673a(String str) {
        AbstractC4931i iVar = this.f30665k;
        if (iVar != null && iVar.mo19435b() != null) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("exportType", (Object) str);
            this.f30665k.mo19428a("javascript:window.lark.biz.slide.exportStart", jSONObject);
        }
    }

    /* renamed from: a */
    public void mo43670a(JSONObject jSONObject) {
        AbstractC4931i iVar = this.f30665k;
        if (iVar != null && iVar.mo19435b() != null) {
            this.f30665k.mo19428a("javascript:window.lark.biz.util.goBack", jSONObject);
        }
    }

    /* renamed from: f */
    public void mo43675f() {
        AbstractC11403b bVar = this.f30658d;
        if (bVar != null) {
            bVar.mo43616a();
        }
    }

    /* renamed from: i */
    public void mo43678i() {
        this.f30658d.mo43618b();
    }

    /* renamed from: k */
    private void m47384k() {
        this.f30670p.mo43663a(new C11404c.AbstractC11406a() {
            /* class com.bytedance.ee.bear.slide.common.export.C11410f.C114111 */

            @Override // com.bytedance.ee.bear.slide.common.export.C11404c.AbstractC11406a
            /* renamed from: a */
            public void mo43666a() {
                C13479a.m54764b("SlideExportPresenter", "screen on");
            }

            @Override // com.bytedance.ee.bear.slide.common.export.C11404c.AbstractC11406a
            /* renamed from: b */
            public void mo43667b() {
                C13479a.m54764b("SlideExportPresenter", "don't share when screen off");
            }

            @Override // com.bytedance.ee.bear.slide.common.export.C11404c.AbstractC11406a
            /* renamed from: c */
            public void mo43668c() {
                C13479a.m54764b("SlideExportPresenter", "user present");
                C11410f.this.mo43676g();
            }
        });
    }

    /* renamed from: l */
    private void m47385l() {
        this.f30667m.mo43594a(new AbstractC11392a.AbstractC11393a() {
            /* class com.bytedance.ee.bear.slide.common.export.C11410f.C114122 */

            @Override // com.bytedance.ee.bear.slide.common.export.AbstractC11392a.AbstractC11393a
            /* renamed from: a */
            public void mo43634a() {
                C11410f.this.mo43679j();
            }

            @Override // com.bytedance.ee.bear.slide.common.export.AbstractC11392a.AbstractC11393a
            /* renamed from: a */
            public void mo43635a(Uri uri) {
                C13479a.m54764b("SlideExportPresenter", "onDownloadPDFSuccess()...");
                C11410f.this.f30658d.mo43620d();
                C11410f.this.f30661g = uri;
                C11410f.this.f30656b = true;
                C11410f.this.mo43676g();
                C11410f.this.f30660f.mo43669a(C11410f.this.f30657c, String.valueOf(C13680g.m55554b(C11410f.this.f30659e, uri) / 1048576), String.valueOf(C11410f.this.f30655a), "100", "success");
            }

            @Override // com.bytedance.ee.bear.slide.common.export.AbstractC11392a.AbstractC11393a
            /* renamed from: a */
            public void mo43636a(List<Uri> list) {
                C13479a.m54764b("SlideExportPresenter", "onDownloadMultiPictureSuccess()...");
                C11410f.this.f30658d.mo43620d();
                C11410f.this.f30662h = list;
                C11410f.this.f30656b = true;
                C11410f.this.mo43676g();
                long j = 0;
                for (Uri uri : list) {
                    j += C13671b.m55475d(C11410f.this.f30659e, uri) / 1048576;
                }
                C11410f.this.f30660f.mo43669a(C11410f.this.f30657c, String.valueOf(j), String.valueOf(C11410f.this.f30655a), "100", "success");
            }
        });
    }

    /* access modifiers changed from: private */
    /* renamed from: n */
    public /* synthetic */ void m47387n() {
        try {
            C13675f.m55498a(this.f30671q);
        } catch (IOException e) {
            C13479a.m54761a("SlideExportPresenter", e);
        }
    }

    @Override // com.bytedance.ee.bear.slide.common.export.AbstractC11392a
    /* renamed from: c */
    public void mo43631c() {
        m47377a(new AbstractC11414a() {
            /* class com.bytedance.ee.bear.slide.common.export.$$Lambda$f$LjNzdRDJEyyJA5W5keoAHC5UlCg */

            @Override // com.bytedance.ee.bear.slide.common.export.C11410f.AbstractC11414a
            public final void onSaveBitmapFinished(boolean z) {
                C11410f.this.m47380a((C11410f) z);
            }
        });
    }

    /* access modifiers changed from: private */
    /* renamed from: o */
    public /* synthetic */ void m47388o() {
        C11385a.m47260a(this.f30668n, Collections.singletonList(this.f30671q), this.f30659e.getString(R.string.Doc_Doc_SharePic));
    }

    @Override // com.bytedance.ee.bear.slide.common.export.AbstractC11392a
    /* renamed from: e */
    public boolean mo43633e() {
        C13479a.m54764b("SlideExportPresenter", "onBackPressed()...");
        AbstractC11403b bVar = this.f30658d;
        if (bVar != null) {
            return bVar.mo43619c();
        }
        return false;
    }

    /* renamed from: h */
    public void mo43677h() {
        C13479a.m54764b("SlideExportPresenter", "doExportLongPicture()...");
        if (this.f30663i) {
            C13479a.m54764b("SlideExportPresenter", "doExportLongPicture()... but cancel");
        } else {
            m47386m();
        }
    }

    @Override // com.bytedance.ee.bear.slide.common.export.AbstractC11392a
    /* renamed from: b */
    public void mo43630b() {
        C13479a.m54772d("SlideExportPresenter", "onShareDoc()...");
        File file = this.f30671q;
        if (file != null && file.exists() && this.f30671q.isFile()) {
            BearExecutors.m48469d().execute(new Runnable() {
                /* class com.bytedance.ee.bear.slide.common.export.$$Lambda$f$JOqBRSQ7ZZiiqLmnazUzipV3nU */

                public final void run() {
                    C11410f.this.m47388o();
                }
            });
        }
    }

    @Override // com.bytedance.ee.bear.slide.common.export.AbstractC11392a
    /* renamed from: d */
    public void mo43632d() {
        C13479a.m54764b("SlideExportPresenter", "cancelExportTask()...");
        this.f30663i = true;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("pageStatus", "MAIN");
        mo43670a(jSONObject);
        this.f30670p.mo43664b();
        C11398c cVar = this.f30664j;
        if (cVar != null) {
            cVar.mo43649b();
        }
        SlideExportNetExecutor slideExportNetExecutor = this.f30667m;
        if (slideExportNetExecutor != null) {
            slideExportNetExecutor.mo43597b();
        }
        if (this.f30671q != null) {
            BearExecutors.m48469d().execute(new Runnable() {
                /* class com.bytedance.ee.bear.slide.common.export.$$Lambda$f$o__FtACfwqLrA_P1Bui5UHhRnss */

                public final void run() {
                    C11410f.this.m47387n();
                }
            });
        }
    }

    /* renamed from: g */
    public void mo43676g() {
        C13479a.m54772d("SlideExportPresenter", "checkScreenState()..." + this.f30656b);
        if (C11417h.m47423b(this.f30659e) && !C11417h.m47424c(this.f30659e) && this.f30656b) {
            m47382b(this.f30657c);
        }
    }

    /* renamed from: j */
    public void mo43679j() {
        C13479a.m54764b("SlideExportPresenter", "doExportFail()..");
        AbstractC11403b bVar = this.f30658d;
        if (bVar != null) {
            bVar.mo43621e();
        }
        this.f30660f.mo43669a(this.f30657c, "0", String.valueOf(this.f30655a), "0", "failed");
    }

    /* renamed from: m */
    private void m47386m() {
        int i;
        int i2;
        WebView b = this.f30665k.mo19435b();
        if (b != null) {
            Picture capturePicture = b.capturePicture();
            if (capturePicture != null) {
                i = capturePicture.getHeight();
                i2 = capturePicture.getWidth();
            } else {
                i2 = 0;
                i = 0;
            }
            if (i <= 0 || i2 <= 0) {
                b.measure(0, 0);
                i = b.getMeasuredHeight();
                i2 = b.getMeasuredWidth();
            }
            if (i <= 0 || i2 <= 0) {
                C13479a.m54758a("SlideExportPresenter", "webView size is 0, width: " + i2 + ", height: " + i);
                mo43679j();
                return;
            }
            int height = b.getHeight();
            int i3 = i / height;
            C13479a.m54764b("SlideExportPresenter", "captureWebView()... count = " + i3 + ", contentHeight =" + i + ",height = " + height);
            if (i3 >= 40) {
                mo43678i();
                return;
            }
            C11398c a = new C11398c.C11400a(this.f30659e).mo43652a(b).mo43651a(i2).mo43656b(i).mo43657c(height).mo43658d(b.getScrollY()).mo43654a(C11417h.m47420a(this.f30659e).getAbsolutePath()).mo43653a(new AbstractC11401d() {
                /* class com.bytedance.ee.bear.slide.common.export.C11410f.C114133 */

                @Override // com.bytedance.ee.bear.slide.common.export.p551a.AbstractC11401d
                /* renamed from: a */
                public void mo43659a() {
                }

                @Override // com.bytedance.ee.bear.slide.common.export.p551a.AbstractC11401d
                /* renamed from: b */
                public void mo43661b() {
                    C11410f.this.mo43679j();
                }

                @Override // com.bytedance.ee.bear.slide.common.export.p551a.AbstractC11401d
                /* renamed from: a */
                public void mo43660a(File file, List<Bitmap> list) {
                    C11410f.this.mo43672a(file, list);
                }
            }).mo43655a();
            this.f30664j = a;
            a.mo43646a();
            return;
        }
        C13479a.m54758a("SlideExportPresenter", "captureWebView()... but WebView is null");
        mo43679j();
    }

    @Override // com.bytedance.ee.bear.slide.common.export.AbstractC11392a
    /* renamed from: a */
    public void mo43629a() {
        String a = C11417h.m47421a(this.f30666l.getBearUrl().f17446a, this.f30666l.getBearUrl().f17447b);
        if (!TextUtils.isEmpty(a)) {
            this.f30658d.setPreviewImage(a);
        }
    }

    /* renamed from: a */
    public void mo43671a(AbstractC11403b bVar) {
        this.f30658d = bVar;
        bVar.setPresenter(this);
    }

    /* renamed from: a */
    private void m47376a(Uri uri) {
        C13479a.m54772d("SlideExportPresenter", "sharePDF()...");
        C13671b.m55467a(this.f30659e, uri, (String) null);
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public /* synthetic */ void m47383b(List list) {
        Context context = this.f30659e;
        C11385a.m47261a(context, list, context.getString(R.string.Doc_Doc_SharePic), 100);
    }

    /* renamed from: a */
    private void m47377a(AbstractC11414a aVar) {
        C13479a.m54772d("SlideExportPresenter", "onSaveBitmap()....");
        Context context = this.f30659e;
        C13708c.m55598a(context, "android.permission.WRITE_EXTERNAL_STORAGE", context.getString(R.string.Doc_Facade_PermissionStorage), new AbstractC13707b(aVar) {
            /* class com.bytedance.ee.bear.slide.common.export.$$Lambda$f$6FFt0hfqJ1vcw8VnRVn5cBRJ4g */
            public final /* synthetic */ C11410f.AbstractC11414a f$1;

            {
                this.f$1 = r2;
            }

            @Override // com.bytedance.ee.util.p710m.AbstractC13707b
            public final void onCheckResult(boolean z) {
                C11410f.this.m47378a((C11410f) this.f$1, (C11410f.AbstractC11414a) z);
            }
        });
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ Boolean m47375a(Boolean bool) throws Exception {
        Uri a = C13671b.m55462a(this.f30659e, new SimpleDateFormat("yyyyMMddHHmmss").format(new Date()) + ".jpg", null, C13680g.f35878a);
        boolean a2 = C13671b.m55469a(this.f30659e, this.f30671q.getAbsolutePath(), a);
        C13671b.m55476e(this.f30659e, a);
        return Boolean.valueOf(a2);
    }

    /* renamed from: b */
    private void m47382b(String str) {
        this.f30656b = false;
        if (TextUtils.equals(str, C11407d.C11408a.f30650a)) {
            this.f30658d.mo43619c();
            Context context = this.f30659e;
            Toast.showSuccessText(context, context.getString(R.string.Slide_Slide_SaveSuccessfully), 0);
            m47376a(this.f30661g);
        } else if (TextUtils.equals(str, C11407d.C11408a.f30651b)) {
            this.f30658d.mo43619c();
            Context context2 = this.f30659e;
            Toast.showSuccessText(context2, context2.getString(R.string.Doc_Doc_ShotSaveSuccessfully), 0);
            m47379a(this.f30662h);
        }
    }

    /* renamed from: a */
    private void m47379a(List<Uri> list) {
        BearExecutors.m48469d().execute(new Runnable(list) {
            /* class com.bytedance.ee.bear.slide.common.export.$$Lambda$f$68LW1bS6an630BanM4EadCcGHU4 */
            public final /* synthetic */ List f$1;

            {
                this.f$1 = r2;
            }

            public final void run() {
                C11410f.this.m47383b((C11410f) this.f$1);
            }
        });
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m47380a(boolean z) {
        if (z) {
            Context context = this.f30659e;
            Toast.showSuccessText(context, context.getString(R.string.Doc_Doc_ShotSaveSuccessfully), 0);
            return;
        }
        Context context2 = this.f30659e;
        Toast.showFailureText(context2, context2.getString(R.string.Doc_Facade_SaveFailed), 0);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m47378a(AbstractC11414a aVar, boolean z) {
        C13479a.m54772d("SlideExportPresenter", "saveLongPicture()... isGrant = " + z);
        if (z) {
            AbstractC68307f.m265083a((Object) true).mo237985a(C11678b.m48479c()).mo238020d(new Function() {
                /* class com.bytedance.ee.bear.slide.common.export.$$Lambda$f$_Pzo8YTkyDjNTUdEOnJKOOLCuM */

                @Override // io.reactivex.functions.Function
                public final Object apply(Object obj) {
                    return C11410f.this.m47375a((Boolean) obj);
                }
            }).mo237985a(C11678b.m48481e()).mo238018d(new Consumer(z, aVar) {
                /* class com.bytedance.ee.bear.slide.common.export.$$Lambda$f$old_iwQIWMHWatcPcSETNMMwj54 */
                public final /* synthetic */ boolean f$0;
                public final /* synthetic */ C11410f.AbstractC11414a f$1;

                {
                    this.f$0 = r1;
                    this.f$1 = r2;
                }

                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    C11410f.m47381a(this.f$0, this.f$1, (Boolean) obj);
                }
            });
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ void m47381a(boolean z, AbstractC11414a aVar, Boolean bool) throws Exception {
        C13479a.m54764b("SlideExportPresenter", "saveLongPicture()... isGrant = " + z);
        if (aVar != null) {
            aVar.onSaveBitmapFinished(bool.booleanValue());
        }
    }

    C11410f(Activity activity, AbstractC4928g gVar, AbstractC4931i iVar, DocViewModel docViewModel, C11409e eVar) {
        this.f30668n = activity;
        this.f30669o = gVar;
        Context applicationContext = activity.getApplicationContext();
        this.f30659e = applicationContext;
        this.f30665k = iVar;
        this.f30666l = docViewModel;
        this.f30667m = new SlideExportNetExecutor(applicationContext, this.f30669o);
        this.f30660f = eVar;
        m47385l();
        m47384k();
    }
}
