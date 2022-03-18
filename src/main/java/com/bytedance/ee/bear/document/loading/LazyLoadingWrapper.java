package com.bytedance.ee.bear.document.loading;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import com.bytedance.ee.bear.document.DocOpenConfig;
import com.bytedance.ee.bear.document.loading.LoadingLayout;
import com.bytedance.ee.bear.list.dto.C8275a;
import com.bytedance.ee.log.C13479a;
import com.larksuite.suite.R;
import java.lang.ref.WeakReference;

public class LazyLoadingWrapper {

    /* renamed from: a */
    private final View f16409a;

    /* renamed from: b */
    private final Handler f16410b = new Handler(Looper.getMainLooper());

    /* renamed from: c */
    private LoadingLayout.AbstractC5864a f16411c;

    /* renamed from: d */
    private LoadingLayout f16412d;

    /* renamed from: e */
    private Integer f16413e;

    /* renamed from: f */
    private String f16414f;

    /* renamed from: g */
    private RunnableC5862a f16415g;

    /* renamed from: h */
    private final ViewGroup f16416h;

    /* renamed from: i */
    private final boolean f16417i;

    /* renamed from: j */
    private final String f16418j;

    /* renamed from: k */
    private LoadingState f16419k = LoadingState.INITIALIZED;

    public enum LoadingState {
        INITIALIZED,
        LOADING,
        FAIL,
        SUC
    }

    /* access modifiers changed from: private */
    /* renamed from: com.bytedance.ee.bear.document.loading.LazyLoadingWrapper$a */
    public class RunnableC5862a implements Runnable {

        /* renamed from: b */
        private WeakReference<LazyLoadingWrapper> f16422b;

        /* renamed from: c */
        private volatile boolean f16423c;

        /* renamed from: a */
        public void mo23561a() {
            this.f16423c = true;
        }

        public void run() {
            LazyLoadingWrapper lazyLoadingWrapper = this.f16422b.get();
            if (lazyLoadingWrapper != null && !this.f16423c) {
                lazyLoadingWrapper.mo23559c();
            }
        }

        public RunnableC5862a(LazyLoadingWrapper lazyLoadingWrapper) {
            this.f16422b = new WeakReference<>(lazyLoadingWrapper);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.ee.bear.document.loading.LazyLoadingWrapper$1 */
    public static /* synthetic */ class C58611 {

        /* renamed from: a */
        static final /* synthetic */ int[] f16420a;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        static {
            /*
                com.bytedance.ee.bear.document.loading.LazyLoadingWrapper$LoadingState[] r0 = com.bytedance.ee.bear.document.loading.LazyLoadingWrapper.LoadingState.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.bytedance.ee.bear.document.loading.LazyLoadingWrapper.C58611.f16420a = r0
                com.bytedance.ee.bear.document.loading.LazyLoadingWrapper$LoadingState r1 = com.bytedance.ee.bear.document.loading.LazyLoadingWrapper.LoadingState.INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = com.bytedance.ee.bear.document.loading.LazyLoadingWrapper.C58611.f16420a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.bytedance.ee.bear.document.loading.LazyLoadingWrapper$LoadingState r1 = com.bytedance.ee.bear.document.loading.LazyLoadingWrapper.LoadingState.LOADING     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = com.bytedance.ee.bear.document.loading.LazyLoadingWrapper.C58611.f16420a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.bytedance.ee.bear.document.loading.LazyLoadingWrapper$LoadingState r1 = com.bytedance.ee.bear.document.loading.LazyLoadingWrapper.LoadingState.SUC     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = com.bytedance.ee.bear.document.loading.LazyLoadingWrapper.C58611.f16420a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.bytedance.ee.bear.document.loading.LazyLoadingWrapper$LoadingState r1 = com.bytedance.ee.bear.document.loading.LazyLoadingWrapper.LoadingState.FAIL     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ee.bear.document.loading.LazyLoadingWrapper.C58611.<clinit>():void");
        }
    }

    /* renamed from: e */
    private void m23579e() {
        LayoutInflater from = LayoutInflater.from(this.f16409a.getContext());
        if (TextUtils.equals(this.f16418j, C8275a.f22371d.mo32553a())) {
            from.inflate(R.layout.doc_new_create, this.f16416h, true);
        } else if (TextUtils.equals(this.f16418j, C8275a.f22378k.mo32553a())) {
            from.inflate(R.layout.docx_new_create, this.f16416h, true);
        }
        this.f16416h.setVisibility(0);
    }

    /* renamed from: f */
    private LoadingLayout m23580f() {
        View findViewById = this.f16409a.findViewById(R.id.loading);
        if (findViewById instanceof ViewStub) {
            this.f16412d = (LoadingLayout) ((ViewStub) findViewById).inflate();
        } else {
            this.f16412d = (LoadingLayout) findViewById;
        }
        LoadingLayout loadingLayout = this.f16412d;
        if (loadingLayout == null) {
            return null;
        }
        LoadingLayout.AbstractC5864a aVar = this.f16411c;
        if (aVar != null) {
            loadingLayout.setOnRetryListener(aVar);
        }
        Integer num = this.f16413e;
        if (num != null) {
            this.f16412d.mo23568a(num.intValue(), this.f16414f);
            this.f16413e = null;
        }
        return this.f16412d;
    }

    /* renamed from: a */
    public void mo23555a() {
        if (m23578a(LoadingState.INITIALIZED)) {
            RunnableC5862a aVar = this.f16415g;
            if (aVar != null) {
                this.f16410b.removeCallbacks(aVar);
                this.f16415g.mo23561a();
                this.f16415g = null;
            }
            this.f16411c = null;
            LoadingLayout loadingLayout = this.f16412d;
            if (loadingLayout != null) {
                loadingLayout.setOnRetryListener(null);
            }
        }
    }

    /* renamed from: c */
    public void mo23559c() {
        this.f16416h.setVisibility(8);
        RunnableC5862a aVar = this.f16415g;
        if (aVar != null) {
            this.f16410b.removeCallbacks(aVar);
            this.f16415g.mo23561a();
            this.f16415g = null;
        }
        LoadingLayout f = m23580f();
        if (f != null) {
            f.mo23569b();
        }
    }

    /* renamed from: d */
    public void mo23560d() {
        if (m23578a(LoadingState.SUC)) {
            this.f16416h.setVisibility(8);
            RunnableC5862a aVar = this.f16415g;
            if (aVar != null) {
                this.f16410b.removeCallbacks(aVar);
                this.f16415g.mo23561a();
                this.f16415g = null;
            }
            LoadingLayout loadingLayout = this.f16412d;
            if (loadingLayout != null) {
                loadingLayout.mo23570c();
            }
        }
    }

    /* renamed from: b */
    public void mo23558b() {
        if (m23578a(LoadingState.LOADING)) {
            if (this.f16417i) {
                m23579e();
            } else if (this.f16415g != null) {
                C13479a.m54764b("LazyLoadingWrapper", "lazyShow: is already showing");
            } else {
                this.f16416h.setVisibility(0);
                LoadingLayout loadingLayout = this.f16412d;
                if (loadingLayout != null) {
                    loadingLayout.mo23567a();
                    this.f16412d.mo23570c();
                }
                this.f16415g = new RunnableC5862a(this);
                long k = DocOpenConfig.m22770k();
                this.f16410b.removeCallbacks(this.f16415g);
                this.f16410b.postDelayed(this.f16415g, k);
            }
        }
    }

    /* renamed from: a */
    public void mo23557a(LoadingLayout.AbstractC5864a aVar) {
        LoadingLayout loadingLayout = this.f16412d;
        if (loadingLayout != null) {
            loadingLayout.setOnRetryListener(aVar);
        } else {
            this.f16411c = aVar;
        }
    }

    /* renamed from: a */
    private boolean m23578a(LoadingState loadingState) {
        LoadingState loadingState2 = this.f16419k;
        int i = C58611.f16420a[this.f16419k.ordinal()];
        boolean z = true;
        if (i == 1 || i == 2 ? this.f16419k.ordinal() > loadingState.ordinal() : i == 3 ? !(loadingState == LoadingState.FAIL || loadingState == LoadingState.INITIALIZED) : !(i == 4 && (loadingState == LoadingState.INITIALIZED || loadingState == LoadingState.LOADING))) {
            z = false;
        }
        if (!z) {
            C13479a.m54764b("LazyLoadingWrapper", "error while transfer from " + loadingState2.name() + " to " + loadingState.name());
        } else {
            this.f16419k = loadingState;
            C13479a.m54764b("LazyLoadingWrapper", "change from " + loadingState2.name() + " to " + this.f16419k.name());
        }
        return z;
    }

    /* renamed from: a */
    public void mo23556a(int i, String str) {
        if (m23578a(LoadingState.FAIL)) {
            LoadingLayout loadingLayout = this.f16412d;
            if (loadingLayout != null) {
                loadingLayout.mo23568a(i, str);
                return;
            }
            this.f16413e = Integer.valueOf(i);
            this.f16414f = str;
        }
    }

    LazyLoadingWrapper(View view, boolean z, String str) {
        this.f16409a = view;
        this.f16418j = str;
        this.f16417i = z;
        this.f16416h = (ViewGroup) view.findViewById(R.id.doc_webview_cover);
        View findViewById = view.findViewById(R.id.loading);
        if (!(findViewById instanceof ViewStub)) {
            this.f16412d = (LoadingLayout) findViewById;
        }
        this.f16419k = LoadingState.INITIALIZED;
    }
}
