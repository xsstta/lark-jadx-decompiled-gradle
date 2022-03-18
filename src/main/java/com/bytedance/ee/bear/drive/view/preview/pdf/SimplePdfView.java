package com.bytedance.ee.bear.drive.view.preview.pdf;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.os.AsyncTask;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.lifecycle.AbstractC1178x;
import androidx.lifecycle.C1177w;
import androidx.lifecycle.LifecycleOwner;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bumptech.glide.load.engine.p087a.AbstractC2283e;
import com.bumptech.glide.load.engine.p087a.C2292k;
import com.bumptech.glide.load.engine.p088b.C2319j;
import com.bytedance.ee.bear.drive.biz.comment.area.CommentRectF;
import com.bytedance.ee.bear.drive.biz.preview.screen.DriveViewFullScreenVM;
import com.bytedance.ee.bear.drive.biz.preview.show.C6712a;
import com.bytedance.ee.bear.drive.biz.preview.vc.AbstractC6730d;
import com.bytedance.ee.bear.drive.common.C6894g;
import com.bytedance.ee.bear.drive.view.preview.AbstractC7256c;
import com.bytedance.ee.bear.drive.view.preview.block.DriveBlockPreviewVM;
import com.bytedance.ee.bear.drive.view.preview.pdf.C7414b;
import com.bytedance.ee.bear.drive.view.preview.pdf.SimplePdfView;
import com.bytedance.ee.bear.drive.view.preview.pdf.presentationview.PdfPresentationView;
import com.bytedance.ee.bear.drive.view.preview.wrapper.AbstractC7549a;
import com.bytedance.ee.bear.drive.view.preview.wrapper.C7555f;
import com.bytedance.ee.bear.drive.view.preview.wrapper.C7557g;
import com.bytedance.ee.bear.drive.view.preview.wrapper.ViewOwner;
import com.bytedance.ee.bear.drive.view.widget.RecyclingImageView;
import com.bytedance.ee.bear.facade.common.widget.Toast;
import com.bytedance.ee.bear.facade.common.widget.recyclerview.LinearLayoutManagerWrapper;
import com.bytedance.ee.bear.p522q.C10539a;
import com.bytedance.ee.bear.thread.C11678b;
import com.bytedance.ee.bear.widgets.BaseRecyclerView;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.p718t.C13749l;
import com.huawei.hms.location.LocationRequest;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.suite.R;
import io.reactivex.AbstractC68307f;
import io.reactivex.disposables.C68289a;
import io.reactivex.functions.AbstractC68322n;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import io.reactivex.p3456d.C68279a;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.Callable;

public class SimplePdfView extends FrameLayout implements AbstractC6730d, AbstractC7549a {

    /* renamed from: A */
    private AbstractC6730d.AbstractC6731a f19917A;

    /* renamed from: B */
    private int f19918B = -1;

    /* renamed from: a */
    public View.OnClickListener f19919a;

    /* renamed from: b */
    public C7414b f19920b;

    /* renamed from: c */
    public C7414b f19921c;

    /* renamed from: d */
    public int f19922d;

    /* renamed from: e */
    public int f19923e;

    /* renamed from: f */
    public SparseIntArray f19924f = new SparseIntArray();

    /* renamed from: g */
    public AbstractC2283e f19925g;

    /* renamed from: h */
    public boolean f19926h = false;

    /* renamed from: i */
    private BaseRecyclerView f19927i;

    /* renamed from: j */
    private LinearLayoutManager f19928j;

    /* renamed from: k */
    private TextView f19929k;

    /* renamed from: l */
    private TextView f19930l;

    /* renamed from: m */
    private int f19931m;

    /* renamed from: n */
    private int f19932n = 1;

    /* renamed from: o */
    private C7413a f19933o;

    /* renamed from: p */
    private C7555f f19934p;

    /* renamed from: q */
    private ViewOwner f19935q;

    /* renamed from: r */
    private C68289a f19936r;

    /* renamed from: s */
    private AbstractC7256c f19937s;

    /* renamed from: t */
    private C7409a f19938t;

    /* renamed from: u */
    private PdfPresentationView f19939u;

    /* renamed from: v */
    private boolean f19940v = false;

    /* renamed from: w */
    private ExhibitionMode f19941w = ExhibitionMode.NORMAL;

    /* renamed from: x */
    private C68289a f19942x = new C68289a();

    /* renamed from: y */
    private AbstractC1178x<Void> f19943y;

    /* renamed from: z */
    private boolean f19944z = false;

    @Override // com.bytedance.ee.bear.drive.view.preview.wrapper.AbstractC7549a
    public String getCommentQuote() {
        return null;
    }

    @Override // com.bytedance.ee.bear.drive.view.preview.wrapper.AbstractC7549a
    public View getView() {
        return this;
    }

    @Override // com.bytedance.ee.bear.drive.view.preview.wrapper.AbstractC7549a
    public CommentRectF hideCreateComment() {
        return null;
    }

    @Override // com.bytedance.ee.bear.drive.view.preview.wrapper.AbstractC7549a
    public boolean onAreaClick() {
        return false;
    }

    @Override // com.bytedance.ee.bear.drive.view.preview.wrapper.AbstractC7549a
    public void onCommentInputPanelClose() {
    }

    @Override // com.bytedance.ee.bear.drive.view.preview.wrapper.AbstractC7549a
    public void onCommentListPanelClose() {
    }

    @Override // com.bytedance.ee.bear.drive.view.preview.wrapper.AbstractC7549a
    public void showSelectedComment(String str) {
    }

    @Override // com.bytedance.ee.bear.drive.view.preview.wrapper.AbstractC7549a
    public void showThumbnailPreview() {
    }

    @Override // com.bytedance.ee.bear.drive.view.preview.wrapper.AbstractC7549a
    public void updateComment(ArrayList<CommentRectF> arrayList) {
    }

    /* access modifiers changed from: private */
    /* renamed from: com.bytedance.ee.bear.drive.view.preview.pdf.SimplePdfView$a */
    public class C7409a extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

        /* renamed from: b */
        private int f19948b;

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public long getItemId(int i) {
            return (long) i;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemViewType(int i) {
            return 0;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemCount() {
            return this.f19948b;
        }

        /* renamed from: a */
        public void mo28932a(int i) {
            this.f19948b = i;
        }

        private C7409a() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            return new C7410a(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.drive_simple_pdf_item, viewGroup, false));
        }

        /* renamed from: com.bytedance.ee.bear.drive.view.preview.pdf.SimplePdfView$a$a */
        private class C7410a extends RecyclerView.ViewHolder {

            /* renamed from: a */
            public RecyclingImageView f19949a;

            /* renamed from: b */
            public View f19950b;

            public C7410a(View view) {
                super(view);
                this.f19949a = (RecyclingImageView) view.findViewById(R.id.simple_pdf_recycler_image);
                this.f19950b = view.findViewById(R.id.simple_pdf_divider);
                this.f19949a.setOnClickListener(SimplePdfView.this.f19919a);
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
            if (viewHolder instanceof C7410a) {
                C13479a.m54764b("DRIVE_PdfAdapter", "SimplePdfItemViewHolder >>>  pageCount: " + this.f19948b + ", currentPage: " + (i + 1));
                if (i == 0) {
                    ((C7410a) viewHolder).f19950b.setVisibility(8);
                } else {
                    ((C7410a) viewHolder).f19950b.setVisibility(0);
                }
                RecyclingImageView recyclingImageView = ((C7410a) viewHolder).f19949a;
                ViewGroup.LayoutParams layoutParams = recyclingImageView.getLayoutParams();
                int[] initWidthHeight = SimplePdfView.this.getInitWidthHeight();
                if (!(layoutParams.width == initWidthHeight[0] && layoutParams.height == initWidthHeight[1])) {
                    layoutParams.width = initWidthHeight[0];
                    layoutParams.height = initWidthHeight[1];
                    recyclingImageView.setLayoutParams(layoutParams);
                }
                AsyncTaskC7412c cVar = null;
                if (SimplePdfView.this.f19920b != null) {
                    SimplePdfView simplePdfView = SimplePdfView.this;
                    cVar = new AsyncTaskC7412c(simplePdfView.f19920b, recyclingImageView, i);
                } else if (SimplePdfView.this.f19921c != null) {
                    SimplePdfView simplePdfView2 = SimplePdfView.this;
                    cVar = new AsyncTaskC7412c(simplePdfView2.f19921c, recyclingImageView, i);
                }
                if (cVar != null) {
                    cVar.execute(new Void[0]);
                }
            }
        }
    }

    @Override // com.bytedance.ee.bear.drive.biz.preview.vc.AbstractC6730d
    public int getCurrentPage() {
        return this.f19932n;
    }

    @Override // com.bytedance.ee.bear.drive.biz.preview.vc.AbstractC6730d
    public RecyclerView getNormalModeFollowView() {
        return this.f19927i;
    }

    @Override // com.bytedance.ee.bear.drive.biz.preview.vc.AbstractC6730d
    public int getPageCount() {
        return this.f19931m;
    }

    /* renamed from: a */
    public boolean mo28922a() {
        C13479a.m54764b("SimplePdfView", "do exitPresentationMode. mIsPresentationMode: " + this.f19940v + ", mCurrentPage: " + this.f19932n);
        if (!this.f19940v) {
            return false;
        }
        C7555f fVar = this.f19934p;
        if (fVar != null) {
            fVar.liveInnerIsPresentationMode().mo5929b((Boolean) false);
            this.f19934p.liveInnerVideoFullScreen().mo5929b((Boolean) false);
            this.f19934p.liveInnerForceFullScreen().mo5929b((Boolean) false);
        }
        this.f19942x.mo237935a();
        m29642c(this.f19932n);
        this.f19939u.setVisibility(8);
        m29638a(false);
        this.f19940v = false;
        return true;
    }

    /* renamed from: a */
    public void mo28919a(ExhibitionMode exhibitionMode, int i) {
        int i2 = C74082.f19946a[exhibitionMode.ordinal()];
        if (i2 == 1) {
            mo28922a();
        } else if (i2 == 2) {
            mo28924b(i);
            m29636a("auto");
        }
    }

    @Override // com.bytedance.ee.bear.drive.biz.preview.vc.AbstractC6730d
    /* renamed from: a */
    public int mo26485a(int i) {
        int i2 = this.f19924f.get(i);
        if (i2 != 0) {
            return i2;
        }
        C7414b availablePdfRender = getAvailablePdfRender();
        if (availablePdfRender == null || availablePdfRender.mo28952c()) {
            C13479a.m54758a("SimplePdfView", "getPageHeight, pdfRender is null or a page is opening. ");
            return this.f19924f.get(0);
        }
        int[] a = availablePdfRender.mo28950a(i - 1, false);
        if (a.length < 2 || a[1] <= 0) {
            return i2;
        }
        int i3 = a[1];
        this.f19924f.put(i, i3);
        return i3;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m29637a(Void r3) {
        AbstractC6730d.AbstractC6731a aVar;
        boolean b = mo28924b(this.f19932n);
        m29636a("click");
        if (b && (aVar = this.f19917A) != null) {
            aVar.mo26496a(ExhibitionMode.PRESENTATION, this.f19932n);
        }
    }

    /* renamed from: a */
    public void mo28921a(Throwable th) {
        C13479a.m54759a("SimplePdfView", "exitIfNeeded() error=", th);
        if (m29641b(th)) {
            C7555f fVar = this.f19934p;
            if (fVar != null) {
                fVar.liveInnerPasswordProtected().mo5926a("");
                return;
            }
            return;
        }
        C7555f fVar2 = this.f19934p;
        if (fVar2 != null) {
            fVar2.getLiveInnerShowPreviewFailedPage().mo5926a((Void) null);
        }
    }

    @Override // com.bytedance.ee.bear.drive.view.preview.wrapper.AbstractC7549a
    /* renamed from: a */
    public void mo28370a(Configuration configuration) {
        C13479a.m54764b("DriveSdk", "SimplePdfView onNewConfiguration, newConfig = " + configuration);
        int i = configuration.orientation;
        this.f19918B = i;
        this.f19926h = true;
        C7414b bVar = this.f19920b;
        if (bVar != null) {
            bVar.mo28949a(i);
        }
        C7414b bVar2 = this.f19921c;
        if (bVar2 != null) {
            bVar2.mo28949a(this.f19918B);
        }
        this.f19938t.notifyDataSetChanged();
        postDelayed(new Runnable() {
            /* class com.bytedance.ee.bear.drive.view.preview.pdf.$$Lambda$9rtPS98KgX80FU07bSZesePiC0 */

            public final void run() {
                SimplePdfView.this.mo28925c();
            }
        }, 100);
    }

    /* renamed from: a */
    private void m29638a(boolean z) {
        ((DriveViewFullScreenVM) this.f19935q.viewModel(DriveViewFullScreenVM.class)).getImmersiveTitleTopState().mo5926a(Boolean.valueOf(z));
    }

    private C7414b getAvailablePdfRender() {
        C7414b bVar = this.f19920b;
        if (bVar != null) {
            return bVar;
        }
        return this.f19921c;
    }

    /* access modifiers changed from: private */
    /* renamed from: i */
    public /* synthetic */ C7414b m29652i() throws Exception {
        this.f19920b.mo28948a();
        return this.f19920b;
    }

    /* renamed from: g */
    private void m29650g() {
        this.f19927i.addOnScrollListener(new RecyclerView.OnScrollListener() {
            /* class com.bytedance.ee.bear.drive.view.preview.pdf.SimplePdfView.C74071 */

            @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
            public void onScrolled(RecyclerView recyclerView, int i, int i2) {
                if (i2 != 0) {
                    SimplePdfView.this.mo28925c();
                }
            }
        });
    }

    private int getLastPageIndex() {
        int i = this.f19932n - 1;
        if (i < 1) {
            return 1;
        }
        return i;
    }

    private int getNextPageIndex() {
        int i = this.f19932n + 1;
        int i2 = this.f19931m;
        return i > i2 ? i2 : i;
    }

    /* access modifiers changed from: private */
    /* renamed from: j */
    public /* synthetic */ void m29653j() {
        AbstractC6730d.AbstractC6731a aVar = this.f19917A;
        if (aVar != null) {
            aVar.mo26496a(ExhibitionMode.NORMAL, this.f19932n);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: k */
    public /* synthetic */ void m29654k() {
        this.f19917A.mo26496a(ExhibitionMode.NORMAL, this.f19932n);
    }

    /* renamed from: b */
    public boolean mo28923b() {
        return this.f19940v;
    }

    @Override // com.bytedance.ee.bear.drive.biz.preview.vc.AbstractC6730d
    public ExhibitionMode getCurrentMode() {
        if (mo28923b()) {
            return ExhibitionMode.PRESENTATION;
        }
        return ExhibitionMode.NORMAL;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.ee.bear.drive.view.preview.pdf.SimplePdfView$2 */
    public static /* synthetic */ class C74082 {

        /* renamed from: a */
        static final /* synthetic */ int[] f19946a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            /*
                com.bytedance.ee.bear.drive.view.preview.pdf.ExhibitionMode[] r0 = com.bytedance.ee.bear.drive.view.preview.pdf.ExhibitionMode.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.bytedance.ee.bear.drive.view.preview.pdf.SimplePdfView.C74082.f19946a = r0
                com.bytedance.ee.bear.drive.view.preview.pdf.ExhibitionMode r1 = com.bytedance.ee.bear.drive.view.preview.pdf.ExhibitionMode.NORMAL     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = com.bytedance.ee.bear.drive.view.preview.pdf.SimplePdfView.C74082.f19946a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.bytedance.ee.bear.drive.view.preview.pdf.ExhibitionMode r1 = com.bytedance.ee.bear.drive.view.preview.pdf.ExhibitionMode.PRESENTATION     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ee.bear.drive.view.preview.pdf.SimplePdfView.C74082.<clinit>():void");
        }
    }

    /* renamed from: com.bytedance.ee.bear.drive.view.preview.pdf.SimplePdfView$c */
    private class AsyncTaskC7412c extends AsyncTask<Void, Void, C7414b.C7415a> {

        /* renamed from: b */
        private WeakReference<RecyclingImageView> f19955b;

        /* renamed from: c */
        private C7414b f19956c;

        /* renamed from: d */
        private int f19957d;

        /* access modifiers changed from: protected */
        public void onPreExecute() {
            super.onPreExecute();
            RecyclingImageView recyclingImageView = this.f19955b.get();
            if (recyclingImageView != null) {
                recyclingImageView.mo29686a((Bitmap) null, SimplePdfView.this.f19925g);
                recyclingImageView.setTag(String.valueOf(this.f19957d));
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public C7414b.C7415a doInBackground(Void... voidArr) {
            if (!this.f19956c.mo28954e()) {
                return this.f19956c.mo28947a(this.f19957d, false, SimplePdfView.this.f19925g);
            }
            C13479a.m54775e("RenderTask", "doInBackground() mRenderTaskPdfRender.isClosed()");
            return null;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void onPostExecute(C7414b.C7415a aVar) {
            if (aVar != null) {
                if (!aVar.mo28955a()) {
                    C13479a.m54764b("RenderTask", "onPostExecute() result.isSuccessful() is false, exitIfNeeded.");
                    SimplePdfView.this.mo28921a(aVar.mo28958d());
                    return;
                }
                RecyclingImageView recyclingImageView = this.f19955b.get();
                if (recyclingImageView == null || !recyclingImageView.getTag().equals(String.valueOf(this.f19957d))) {
                    aVar.mo28956b().recycle();
                    return;
                }
                ViewGroup.LayoutParams layoutParams = recyclingImageView.getLayoutParams();
                if (!(layoutParams.height == aVar.mo28957c() && layoutParams.width == aVar.mo28959e())) {
                    layoutParams.height = aVar.mo28957c();
                    layoutParams.width = aVar.mo28959e();
                    recyclingImageView.setLayoutParams(layoutParams);
                    SimplePdfView.this.f19924f.put(this.f19957d, aVar.mo28957c());
                }
                if (SimplePdfView.this.f19922d == 0 || SimplePdfView.this.f19923e == 0 || SimplePdfView.this.f19926h) {
                    SimplePdfView.this.f19922d = aVar.mo28957c();
                    SimplePdfView.this.f19923e = aVar.mo28959e();
                    SimplePdfView.this.f19926h = false;
                }
                recyclingImageView.mo29686a(aVar.mo28956b(), SimplePdfView.this.f19925g);
            }
        }

        AsyncTaskC7412c(C7414b bVar, RecyclingImageView recyclingImageView, int i) {
            this.f19956c = bVar;
            this.f19955b = new WeakReference<>(recyclingImageView);
            this.f19957d = i;
        }
    }

    /* renamed from: h */
    private void m29651h() {
        C68289a aVar = this.f19936r;
        if (aVar != null) {
            aVar.mo237935a();
        }
        C7414b bVar = this.f19920b;
        if (bVar != null) {
            bVar.mo28953d();
        }
        C7414b bVar2 = this.f19921c;
        if (bVar2 != null) {
            bVar2.mo28953d();
        }
        AbstractC2283e eVar = this.f19925g;
        if (eVar != null) {
            eVar.mo10691a();
        }
    }

    public int getCurrentOrientation() {
        if (this.f19918B == -1) {
            this.f19918B = C13749l.m55757d(getContext());
        }
        return this.f19918B;
    }

    @Override // com.bytedance.ee.bear.drive.view.preview.wrapper.AbstractC7549a
    public boolean onBackPressed() {
        if (!mo28923b()) {
            return false;
        }
        if (!mo28922a() || this.f19917A == null) {
            return true;
        }
        post(new Runnable() {
            /* class com.bytedance.ee.bear.drive.view.preview.pdf.$$Lambda$SimplePdfView$n2udrwsxv1R64FuOEUlkaVDgTkA */

            public final void run() {
                SimplePdfView.this.m29653j();
            }
        });
        return true;
    }

    /* access modifiers changed from: private */
    /* renamed from: f */
    public void m29649f() {
        if (C6894g.m27258a(this.f19933o.mo28941b()) && this.f19941w == ExhibitionMode.PRESENTATION) {
            C13479a.m54764b("SimplePdfView", "do checkDefaultExhibitionMode, auto enter presentation mode. ");
            mo28924b(1);
            m29636a("auto");
        }
        AbstractC6730d.AbstractC6731a aVar = this.f19917A;
        if (aVar != null) {
            aVar.mo26494a();
        }
    }

    /* access modifiers changed from: package-private */
    public int[] getInitWidthHeight() {
        int i;
        int i2 = this.f19923e;
        if (i2 == 0 || (i = this.f19922d) == 0 || this.f19926h) {
            i2 = C13749l.m55736a();
            if (getCurrentOrientation() == 1) {
                i = C13749l.m55748b();
            } else {
                i = (i2 * i2) / C13749l.m55748b();
            }
        }
        return new int[]{i2, i};
    }

    /* renamed from: d */
    private void m29646d() {
        LayoutInflater.from(getContext()).inflate(R.layout.drive_preview_pdf_view, this);
        this.f19927i = (BaseRecyclerView) findViewById(R.id.recycler_view);
        this.f19929k = (TextView) findViewById(R.id.indicator_view);
        this.f19939u = (PdfPresentationView) findViewById(R.id.presentation_view);
        this.f19930l = (TextView) findViewById(R.id.block_indicator);
        this.f19936r = new C68289a();
        C7409a aVar = new C7409a();
        this.f19938t = aVar;
        aVar.setHasStableIds(true);
        this.f19928j = new LinearLayoutManagerWrapper(getContext());
        this.f19927i.setItemAnimator(null);
        this.f19927i.setLayoutManager(this.f19928j);
        this.f19927i.setAdapter(this.f19938t);
        m29650g();
        this.f19925g = m29648e();
    }

    /* renamed from: e */
    private AbstractC2283e m29648e() {
        int a = C13749l.m55736a() * C13749l.m55748b() * 4;
        int b = new C2319j.C2320a(getContext()).mo10745a(0).mo10744a(BitmapDescriptorFactory.HUE_RED).mo10747b(4.0f).mo10746a().mo10742b();
        if (b <= a) {
            return null;
        }
        C13479a.m54764b("SimplePdfView", "SimplePdfView enable bitmapPool. targetBitmapPoolSize: " + b);
        return new C2292k((long) b);
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        C7555f fVar = this.f19934p;
        if (fVar == null || !fVar.isBlockViewChanging()) {
            super.onDetachedFromWindow();
            m29651h();
            if (C6894g.m27258a(this.f19933o.mo28941b()) && this.f19934p != null) {
                C13479a.m54772d("SimplePdfView", "simplePdfView ppt detach from window, disable presentation action. ");
                this.f19934p.liveInnerShowPresentationAction().mo5926a((Boolean) false);
                if (this.f19943y != null) {
                    this.f19934p.liveOuterEnterPresentationMode().mo5928b(this.f19943y);
                }
            }
        }
    }

    @Override // com.bytedance.ee.bear.drive.view.preview.wrapper.AbstractC7549a
    public void show() {
        if (this.f19933o != null) {
            AbstractC7256c cVar = this.f19937s;
            if (cVar != null) {
                cVar.mo26117a();
            }
            C6712a.m26463a(this.f19934p, this);
            m29640b(this.f19933o.mo28938a());
            if (this.f19944z && C6894g.m27258a(this.f19933o.mo28941b()) && this.f19934p != null) {
                C13479a.m54764b("SimplePdfView", "simplePdfView show ppt, enable presentation action. ");
                this.f19934p.liveInnerShowPresentationAction().mo5926a((Boolean) true);
                C1177w<Void> liveOuterEnterPresentationMode = this.f19934p.liveOuterEnterPresentationMode();
                LifecycleOwner lifecycleOwner = this.f19935q.lifecycleOwner();
                $$Lambda$SimplePdfView$BwSwrdSWWm1Rgcq6dLGlMAJuv3Q r2 = new AbstractC1178x() {
                    /* class com.bytedance.ee.bear.drive.view.preview.pdf.$$Lambda$SimplePdfView$BwSwrdSWWm1Rgcq6dLGlMAJuv3Q */

                    @Override // androidx.lifecycle.AbstractC1178x
                    public final void onChanged(Object obj) {
                        SimplePdfView.this.m29637a((SimplePdfView) ((Void) obj));
                    }
                };
                this.f19943y = r2;
                liveOuterEnterPresentationMode.mo5923a(lifecycleOwner, r2);
            }
        }
    }

    /* renamed from: c */
    public void mo28925c() {
        int i;
        if (this.f19928j.findFirstCompletelyVisibleItemPosition() == 0) {
            i = 1;
        } else {
            int findFirstVisibleItemPosition = this.f19928j.findFirstVisibleItemPosition();
            i = m29629a(this.f19927i, this.f19928j.findViewByPosition(findFirstVisibleItemPosition), findFirstVisibleItemPosition);
        }
        if (i != this.f19932n) {
            setIndicator(i);
        }
    }

    /* renamed from: b */
    private boolean m29641b(Throwable th) {
        return th instanceof SecurityException;
    }

    /* renamed from: a */
    public void mo28920a(C7413a aVar) {
        this.f19933o = aVar;
    }

    @Override // com.bytedance.ee.bear.drive.biz.preview.vc.AbstractC6730d
    public void setCurrentPosition(int i) {
        setIndicator(i);
    }

    public void setDefaultExhibitionMode(ExhibitionMode exhibitionMode) {
        this.f19941w = exhibitionMode;
    }

    public void setOnPageClickListener(View.OnClickListener onClickListener) {
        this.f19919a = onClickListener;
    }

    @Override // com.bytedance.ee.bear.drive.view.preview.AbstractC7262d
    public void setOnShowViewTrackEventCallback(AbstractC7256c cVar) {
        this.f19937s = cVar;
    }

    @Override // com.bytedance.ee.bear.drive.biz.preview.vc.AbstractC6730d
    public void setPDFActionListener(AbstractC6730d.AbstractC6731a aVar) {
        this.f19917A = aVar;
    }

    public void setPresentationEnable(boolean z) {
        this.f19944z = z;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static /* synthetic */ Integer m29639b(PdfPresentationView.C7417a aVar) throws Exception {
        return Integer.valueOf(aVar.f19985a);
    }

    @Override // com.bytedance.ee.bear.drive.biz.preview.vc.AbstractC6730d
    public void setExhibitionMode(ExhibitionMode exhibitionMode) {
        mo28919a(exhibitionMode, this.f19932n);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m29632a(View view) {
        if (mo28922a() && this.f19917A != null) {
            post(new Runnable() {
                /* class com.bytedance.ee.bear.drive.view.preview.pdf.$$Lambda$SimplePdfView$N0KmEc4TqhN9E2lgfuMLt8EOI */

                public final void run() {
                    SimplePdfView.this.m29654k();
                }
            });
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public /* synthetic */ void m29643c(Throwable th) throws Exception {
        mo28921a(th);
        if (!m29641b(th)) {
            AbstractC7256c cVar = this.f19937s;
            if (cVar != null) {
                cVar.mo26119a("pdf_render", th);
            }
            C6712a.m26465c(this.f19934p, this);
        }
    }

    /* renamed from: d */
    private String m29645d(int i) {
        return String.format("%d/%d", Integer.valueOf(i), Integer.valueOf(this.f19931m));
    }

    public SimplePdfView(Context context) {
        super(context);
        m29646d();
    }

    /* renamed from: c */
    private void m29642c(int i) {
        C13479a.m54764b("SimplePdfView", "scrollToIndex: " + i);
        setIndicator(i);
        this.f19928j.scrollToPositionWithOffset(i + -1, LocationRequest.PRIORITY_HD_ACCURACY);
    }

    private void setIndicator(int i) {
        this.f19932n = i;
        this.f19929k.setText(m29645d(i));
        this.f19930l.setText(C10539a.m43639a(getContext(), R.string.CreationMobile_Docs_PDFPreview_TotalPages, "total", String.valueOf(this.f19931m)));
    }

    @Override // com.bytedance.ee.bear.drive.view.preview.wrapper.AbstractC7549a
    public void onSetup(ViewOwner viewOwner) {
        this.f19935q = viewOwner;
        this.f19934p = (C7555f) viewOwner.viewModel(C7555f.class);
        ((DriveBlockPreviewVM) viewOwner.viewModel(DriveBlockPreviewVM.class)).getLiveBlockState().mo5923a(viewOwner.lifecycleOwner(), new AbstractC1178x() {
            /* class com.bytedance.ee.bear.drive.view.preview.pdf.$$Lambda$SimplePdfView$kTfHXB9TUuACf4oxDEb_yDPJm10 */

            @Override // androidx.lifecycle.AbstractC1178x
            public final void onChanged(Object obj) {
                SimplePdfView.this.m29633a((SimplePdfView) ((DriveBlockPreviewVM.BlockState) obj));
            }
        });
    }

    @Override // com.bytedance.ee.bear.drive.biz.preview.vc.AbstractC6730d
    public void setPresentationPage(int i) {
        if (mo28923b()) {
            C7414b.C7415a a = m29631a(i, true);
            if (!a.mo28955a()) {
                C13479a.m54759a("SimplePdfView", "setPresentationView fail. ", a.mo28958d());
                return;
            }
            this.f19939u.mo28962a(this.f19931m, i, a, this.f19925g);
            this.f19932n = i;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ C7411b m29630a(PdfPresentationView.C7417a aVar) throws Exception {
        int i;
        if (aVar.f19986b == 1) {
            i = getNextPageIndex();
        } else {
            i = getLastPageIndex();
        }
        C13479a.m54772d("SimplePdfView", "presentation mode, load page: " + i);
        return new C7411b(i, m29631a(i, true));
    }

    /* renamed from: b */
    private void m29640b(String str) {
        if (!new File(str).exists()) {
            C13479a.m54758a("SimplePdfView", "file is not exists: " + str);
            return;
        }
        this.f19920b = new C7414b(str, getCurrentOrientation());
        this.f19936r.mo237935a();
        this.f19936r.mo237937a(AbstractC68307f.m265099b((Callable) new Callable() {
            /* class com.bytedance.ee.bear.drive.view.preview.pdf.$$Lambda$SimplePdfView$xEvrqriOqhhM0qSe_CWsaBolr8 */

            @Override // java.util.concurrent.Callable
            public final Object call() {
                return SimplePdfView.this.m29652i();
            }
        }).mo238004b(C11678b.m48479c()).mo237985a(C11678b.m48481e()).mo238001b(new Consumer() {
            /* class com.bytedance.ee.bear.drive.view.preview.pdf.$$Lambda$SimplePdfView$JCr15B5J6Td19UjYpx8NSSnFoa4 */

            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                SimplePdfView.this.m29635a((SimplePdfView) ((C7414b) obj));
            }
        }, new Consumer() {
            /* class com.bytedance.ee.bear.drive.view.preview.pdf.$$Lambda$SimplePdfView$8Zd6tq4wTTZer6B42qg0WE3gWK4 */

            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                SimplePdfView.this.m29643c((SimplePdfView) ((Throwable) obj));
            }
        }));
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public /* synthetic */ boolean m29644c(PdfPresentationView.C7417a aVar) throws Exception {
        C13479a.m54772d("SimplePdfView", "presentation mode, fling coming, currentPageIndex: " + aVar.f19985a + ", direction: " + aVar.f19986b);
        if (aVar.f19985a == this.f19931m && aVar.f19986b == 1) {
            Toast.showCenterToast(getContext(), getContext().getText(R.string.Drive_Drive_AlreadyTheLastPage), 0);
            return false;
        } else if (aVar.f19985a != 1 || aVar.f19986b != 0) {
            return true;
        } else {
            Toast.showCenterToast(getContext(), getContext().getText(R.string.Drive_Drive_AlreadyTheFirstPage), 0);
            return false;
        }
    }

    /* renamed from: b */
    public boolean mo28924b(int i) {
        C13479a.m54764b("SimplePdfView", "do enterPresentationMode. position: " + i + ", mIsPresentationMode: " + this.f19940v + ", mCurrentPage: " + this.f19932n);
        if (this.f19940v) {
            return false;
        }
        C7414b.C7415a a = m29631a(i, true);
        if (!a.mo28955a()) {
            C13479a.m54759a("SimplePdfView", "enterPresentationMode fail. ", a.mo28958d());
            return false;
        }
        this.f19927i.dispatchTouchEvent(MotionEvent.obtain(SystemClock.uptimeMillis(), SystemClock.uptimeMillis(), 3, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 0));
        C7555f fVar = this.f19934p;
        if (fVar != null) {
            fVar.liveInnerIsPresentationMode().mo5929b((Boolean) true);
            this.f19934p.liveInnerVideoFullScreen().mo5929b((Boolean) true);
            this.f19934p.liveInnerForceFullScreen().mo5929b((Boolean) true);
        }
        this.f19939u.mo28962a(this.f19931m, i, a, this.f19925g);
        this.f19932n = i;
        this.f19942x.mo237937a(this.f19939u.mo28961a().filter(new AbstractC68322n() {
            /* class com.bytedance.ee.bear.drive.view.preview.pdf.$$Lambda$SimplePdfView$0TZEVsucMnFQYLmxUKQRmwrMSRg */

            @Override // io.reactivex.functions.AbstractC68322n
            public final boolean test(Object obj) {
                return SimplePdfView.this.m29644c((PdfPresentationView.C7417a) obj);
            }
        }).distinctUntilChanged($$Lambda$SimplePdfView$XBG9ZK2i8ObYgH17IJBmX_U3zWw.INSTANCE).observeOn(C68279a.m265025d()).map(new Function() {
            /* class com.bytedance.ee.bear.drive.view.preview.pdf.$$Lambda$SimplePdfView$4Cf7kmgoFJGt1LYDXODDhGWhMg */

            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return SimplePdfView.this.m29630a((PdfPresentationView.C7417a) obj);
            }
        }).observeOn(C11678b.m48481e()).subscribe(new Consumer() {
            /* class com.bytedance.ee.bear.drive.view.preview.pdf.$$Lambda$SimplePdfView$J6AO_kmrnTGSOvCfEYWEGDzpMYI */

            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                SimplePdfView.this.m29634a((SimplePdfView) ((SimplePdfView.C7411b) obj));
            }
        }, $$Lambda$SimplePdfView$VNvQ8nVIM7VKdOHuegAR3WAJLmU.INSTANCE));
        this.f19939u.setBackClickListener(new PdfPresentationView.AbstractC7418b() {
            /* class com.bytedance.ee.bear.drive.view.preview.pdf.$$Lambda$SimplePdfView$IibHEhmJ2fNaIr8nDJgTlYbx5HE */

            @Override // com.bytedance.ee.bear.drive.view.preview.pdf.presentationview.PdfPresentationView.AbstractC7418b
            public final void onBackClick(View view) {
                SimplePdfView.this.m29632a((SimplePdfView) view);
            }
        });
        this.f19939u.setVisibility(0);
        m29638a(true);
        this.f19940v = true;
        return true;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m29633a(DriveBlockPreviewVM.BlockState blockState) {
        int i;
        TextView textView = this.f19930l;
        int i2 = 0;
        if (blockState == DriveBlockPreviewVM.BlockState.BLOCK) {
            i = 0;
        } else {
            i = 8;
        }
        textView.setVisibility(i);
        TextView textView2 = this.f19929k;
        if (blockState != DriveBlockPreviewVM.BlockState.FULLSCREEN) {
            i2 = 8;
        }
        textView2.setVisibility(i2);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m29634a(C7411b bVar) throws Exception {
        if (bVar.f19953b.mo28955a()) {
            this.f19939u.mo28962a(this.f19931m, bVar.f19952a, bVar.f19953b, this.f19925g);
            int i = bVar.f19952a;
            this.f19932n = i;
            AbstractC6730d.AbstractC6731a aVar = this.f19917A;
            if (aVar != null) {
                aVar.mo26495a(i);
                return;
            }
            return;
        }
        C13479a.m54759a("SimplePdfView", "load page err. ", bVar.f19953b.mo28958d());
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m29635a(C7414b bVar) throws Exception {
        this.f19931m = bVar.mo28951b();
        this.f19938t.mo28932a(bVar.mo28951b());
        this.f19938t.notifyDataSetChanged();
        setIndicator(1);
        AbstractC7256c cVar = this.f19937s;
        if (cVar != null) {
            cVar.mo26118a("pdf_render");
        }
        C6712a.m26464b(this.f19934p, this);
        C13479a.m54764b("SimplePdfView", "renderFile, mPageCount = " + this.f19931m);
        post(new Runnable() {
            /* class com.bytedance.ee.bear.drive.view.preview.pdf.$$Lambda$SimplePdfView$1VSsV1j8bt8aMdO4ht3N5rHbW0 */

            public final void run() {
                SimplePdfView.this.m29649f();
            }
        });
    }

    /* renamed from: a */
    private void m29636a(String str) {
        if (this.f19934p != null) {
            HashMap hashMap = new HashMap();
            hashMap.put("action", str);
            this.f19934p.liveInnerReportMsg().mo28018a(C7557g.m30301a(20, hashMap));
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: com.bytedance.ee.bear.drive.view.preview.pdf.SimplePdfView$b */
    public static class C7411b {

        /* renamed from: a */
        int f19952a;

        /* renamed from: b */
        C7414b.C7415a f19953b;

        C7411b(int i, C7414b.C7415a aVar) {
            this.f19952a = i;
            this.f19953b = aVar;
        }
    }

    public SimplePdfView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m29646d();
    }

    /* renamed from: a */
    private C7414b.C7415a m29631a(int i, boolean z) {
        C7414b availablePdfRender = getAvailablePdfRender();
        if (availablePdfRender == null || availablePdfRender.mo28954e()) {
            return new C7414b.C7415a(new IllegalAccessException("pdfRender is null or closed. "));
        }
        return availablePdfRender.mo28947a(i - 1, z, this.f19925g);
    }

    /* renamed from: a */
    private int m29629a(RecyclerView recyclerView, View view, int i) {
        if (view == null) {
            return i + 1;
        }
        int[] iArr = new int[2];
        recyclerView.getLocationInWindow(iArr);
        int[] iArr2 = new int[2];
        view.getLocationInWindow(iArr2);
        if (((float) (view.getHeight() - (iArr[1] - iArr2[1]))) > (((float) recyclerView.getHeight()) / 2.0f) - ((float) recyclerView.getPaddingTop())) {
            return i + 1;
        }
        int i2 = i + 1 + 1;
        int i3 = this.f19931m;
        return i2 > i3 ? i3 : i2;
    }

    public SimplePdfView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m29646d();
    }
}
