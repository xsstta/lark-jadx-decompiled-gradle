package com.bytedance.ee.bear.search.space;

import android.animation.Animator;
import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bumptech.glide.C2124f;
import com.bumptech.glide.ComponentCallbacks2C2115c;
import com.bytedance.ee.bear.facade.common.widget.BearLottieView;
import com.bytedance.ee.bear.p522q.p523a.C10548d;
import com.bytedance.ee.bear.search.model.SearchResponse;
import com.bytedance.ee.bear.search.p536a.C10788a;
import com.bytedance.ee.bear.search.p536a.C10792b;
import com.bytedance.ee.bear.search.widget.SearchFilterView;
import com.bytedance.ee.bear.thread.C11678b;
import com.bytedance.ee.bear.widgets.universedesign.SpaceEditText;
import com.bytedance.ee.bear.widgets.universedesign.SpaceEmptyState;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.p703f.C13664a;
import com.bytedance.ee.util.p718t.C13742g;
import com.larksuite.suite.R;
import com.scwang.smartrefresh.layout.SmartRefreshLayout;
import io.reactivex.Observable;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.AbstractC68309a;
import java.util.concurrent.TimeUnit;

/* renamed from: com.bytedance.ee.bear.search.space.a */
public class C10880a {

    /* renamed from: A */
    View f29252A;

    /* renamed from: B */
    private C10788a f29253B;

    /* renamed from: C */
    private Disposable f29254C;

    /* renamed from: D */
    private final int f29255D;

    /* renamed from: E */
    private final boolean f29256E;

    /* renamed from: a */
    Context f29257a;

    /* renamed from: b */
    ViewGroup f29258b;

    /* renamed from: c */
    ImageView f29259c;

    /* renamed from: d */
    ImageView f29260d;

    /* renamed from: e */
    View f29261e;

    /* renamed from: f */
    ViewGroup f29262f;

    /* renamed from: g */
    View f29263g;

    /* renamed from: h */
    TextView f29264h;

    /* renamed from: i */
    SpaceEditText f29265i;

    /* renamed from: j */
    View f29266j;

    /* renamed from: k */
    RecyclerView f29267k;

    /* renamed from: l */
    View f29268l;

    /* renamed from: m */
    ImageView f29269m;

    /* renamed from: n */
    TextView f29270n;

    /* renamed from: o */
    ImageView f29271o;

    /* renamed from: p */
    TextView f29272p;

    /* renamed from: q */
    TextView f29273q;

    /* renamed from: r */
    BearLottieView f29274r;

    /* renamed from: s */
    SmartRefreshLayout f29275s;

    /* renamed from: t */
    RecyclerView f29276t;

    /* renamed from: u */
    SpaceEmptyState f29277u;

    /* renamed from: v */
    SearchFilterView f29278v;

    /* renamed from: w */
    View f29279w;

    /* renamed from: x */
    TextView f29280x;

    /* renamed from: y */
    View f29281y;

    /* renamed from: z */
    TextView f29282z;

    /* access modifiers changed from: private */
    /* renamed from: com.bytedance.ee.bear.search.space.a$a */
    public class C10881a implements C10792b.AbstractC10797a {

        /* renamed from: b */
        private C10880a f29284b;

        /* renamed from: c */
        private int f29285c;

        /* renamed from: d */
        private Context f29286d;

        /* renamed from: j */
        private int m45252j() {
            return this.f29285c;
        }

        @Override // com.bytedance.ee.bear.search.p536a.C10792b.AbstractC10797a
        /* renamed from: b */
        public View mo40879b() {
            return this.f29284b.f29261e;
        }

        @Override // com.bytedance.ee.bear.search.p536a.C10792b.AbstractC10797a
        /* renamed from: c */
        public View mo40880c() {
            return this.f29284b.f29263g;
        }

        @Override // com.bytedance.ee.bear.search.p536a.C10792b.AbstractC10797a
        /* renamed from: d */
        public View mo40881d() {
            return this.f29284b.f29264h;
        }

        @Override // com.bytedance.ee.bear.search.p536a.C10792b.AbstractC10797a
        /* renamed from: e */
        public View mo40882e() {
            return this.f29284b.f29262f;
        }

        @Override // com.bytedance.ee.bear.search.p536a.C10792b.AbstractC10797a
        /* renamed from: g */
        public EditText mo40884g() {
            return this.f29284b.f29265i;
        }

        @Override // com.bytedance.ee.bear.search.p536a.C10792b.AbstractC10797a
        /* renamed from: h */
        public View mo40885h() {
            return this.f29284b.f29267k;
        }

        /* renamed from: i */
        public ImageView mo40878a() {
            return this.f29284b.f29260d;
        }

        @Override // com.bytedance.ee.bear.search.p536a.C10792b.AbstractC10797a
        /* renamed from: f */
        public int mo40883f() {
            int i = this.f29285c;
            if (i == 0) {
                return m45252j();
            }
            return i;
        }

        C10881a(Context context, C10880a aVar, int i) {
            this.f29286d = context;
            this.f29284b = aVar;
            this.f29285c = i;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public void mo41395i() {
        this.f29253B.mo40862b();
    }

    /* renamed from: m */
    private boolean m45234m() {
        if (this.f29274r.getVisibility() == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: n */
    private void m45235n() {
        Disposable disposable = this.f29254C;
        if (disposable != null && !disposable.isDisposed()) {
            this.f29254C.dispose();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo41382a() {
        m45233l();
        this.f29275s.setVisibility(8);
        this.f29277u.setVisibility(8);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo41388b() {
        m45235n();
        this.f29274r.setVisibility(8);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public void mo41391e() {
        if (this.f29278v.mo41406c()) {
            this.f29278v.mo41407d();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public void mo41396j() {
        this.f29253B.mo40863c();
        C13742g.m55706a(new Runnable() {
            /* class com.bytedance.ee.bear.search.space.$$Lambda$9s038ZH4KxZN_hZ7YkUnwKIHCv0 */

            public final void run() {
                C10880a.this.mo41394h();
            }
        }, 200);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public void mo41392f() {
        this.f29282z.setVisibility(0);
        this.f29252A.setVisibility(8);
        this.f29268l.setVisibility(8);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public void mo41393g() {
        this.f29261e.setFocusableInTouchMode(false);
        this.f29265i.setFocusable(true);
        this.f29265i.requestFocus();
        C10548d.m43703b(this.f29265i);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public void mo41394h() {
        this.f29261e.setFocusableInTouchMode(true);
        this.f29265i.clearFocus();
        C10548d.m43697a((View) this.f29265i);
    }

    /* renamed from: k */
    private void m45232k() {
        C10788a aVar = new C10788a();
        this.f29253B = aVar;
        aVar.mo40853a(this.f29257a).mo40859a(this.f29256E).mo40856a((EditText) this.f29265i).mo40854a(this.f29266j).mo40857a(this.f29264h).mo40858a(new C10881a(this.f29257a, this, this.f29255D)).mo40855a(this.f29258b);
        this.f29253B.mo40860a();
    }

    /* renamed from: l */
    private void m45233l() {
        C13479a.m54772d("SpaceSearchViewHolder", "resetLoadingViewTimer: ");
        m45235n();
        if (!m45234m()) {
            C13479a.m54772d("SpaceSearchViewHolder", "resetLoadingViewTimer: send timer");
            this.f29254C = Observable.timer(500, TimeUnit.MILLISECONDS).subscribeOn(C11678b.m48480d()).observeOn(C11678b.m48481e()).doOnComplete(new AbstractC68309a() {
                /* class com.bytedance.ee.bear.search.space.$$Lambda$a$OSMapO5vJ4PhYAMD08Nrb0FMo0Y */

                @Override // io.reactivex.functions.AbstractC68309a
                public final void run() {
                    C10880a.lambda$OSMapO5vJ4PhYAMD08Nrb0FMo0Y(C10880a.this);
                }
            }).subscribe();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: o */
    public /* synthetic */ void m45236o() throws Exception {
        C13479a.m54772d("SpaceSearchViewHolder", "handleMessage: exec timer to show loading view");
        BearLottieView bearLottieView = this.f29274r;
        if (bearLottieView == null || bearLottieView.getWindowToken() == null) {
            C13479a.m54772d("SpaceSearchViewHolder", "handleMessage: loading view is null");
            return;
        }
        this.f29274r.setVisibility(0);
        this.f29274r.playAnimation();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo41389c() {
        if (!this.f29278v.mo41406c()) {
            this.f29278v.mo41401a();
            this.f29281y.animate().rotationBy(180.0f).setDuration(100).start();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public void mo41390d() {
        if (this.f29278v.mo41406c()) {
            this.f29278v.mo41405b();
            this.f29281y.animate().rotationBy(-180.0f).setDuration(100).start();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo41384a(Animator.AnimatorListener animatorListener) {
        this.f29263g.setVisibility(8);
        this.f29253B.mo40861a(animatorListener);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo41385a(Context context, SearchResponse.Data.Candidates candidates) {
        this.f29267k.setVisibility(8);
        this.f29252A.setVisibility(8);
        this.f29268l.setVisibility(0);
        this.f29270n.setText(candidates.getOwner_name());
        ((C2124f) ComponentCallbacks2C2115c.m9151c(context).mo10414a(new C13664a(candidates.getAvatar_url())).mo11123a((int) R.drawable.search_owner_place_holder)).mo10399a(this.f29269m);
        this.f29265i.setText("");
        this.f29266j.setVisibility(8);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo41387a(Resources resources, boolean z) {
        int i;
        int color = resources.getColor(R.color.primary_pri_500);
        int color2 = resources.getColor(R.color.text_caption);
        TextView textView = this.f29272p;
        if (z) {
            i = color;
        } else {
            i = color2;
        }
        textView.setTextColor(i);
        TextView textView2 = this.f29273q;
        if (z) {
            color = color2;
        }
        textView2.setTextColor(color);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo41383a(int i, boolean z, String str) {
        int i2;
        if (!z) {
            this.f29282z.setVisibility(0);
            this.f29252A.setVisibility(8);
            this.f29268l.setVisibility(8);
            return;
        }
        this.f29272p.setText(R.string.Doc_Search_All);
        if (i != 1) {
            i2 = R.string.Doc_Search_InThisFolder;
        } else if (TextUtils.equals(str, "favorites")) {
            i2 = R.string.Doc_Main_TabFavorite;
        } else {
            i2 = R.string.Doc_Search_MyContent;
        }
        this.f29273q.setText(i2);
    }

    C10880a(Context context, View view, int i, boolean z) {
        this.f29257a = context;
        this.f29255D = i;
        this.f29256E = z;
        this.f29258b = (ViewGroup) view.findViewById(R.id.search_root);
        this.f29259c = (ImageView) view.findViewById(R.id.search_bar_back);
        this.f29260d = (ImageView) view.findViewById(R.id.title_layout);
        this.f29261e = view.findViewById(R.id.search_bar_layout);
        this.f29262f = (ViewGroup) view.findViewById(R.id.search_bar);
        this.f29263g = view.findViewById(R.id.search_container_layout);
        this.f29264h = (TextView) view.findViewById(R.id.search_bar_item_cancel_button);
        this.f29265i = (SpaceEditText) view.findViewById(R.id.search_bar_item_search_bar);
        this.f29266j = view.findViewById(R.id.search_bar_item_clear_icon);
        this.f29267k = (RecyclerView) view.findViewById(R.id.search_suggestion_list);
        this.f29268l = view.findViewById(R.id.search_filter_owner_item);
        this.f29269m = (ImageView) view.findViewById(R.id.search_filter_owner_item_avatar);
        this.f29270n = (TextView) view.findViewById(R.id.search_filter_owner_item_name);
        this.f29271o = (ImageView) view.findViewById(R.id.search_filter_owner_item_delete);
        this.f29272p = (TextView) view.findViewById(R.id.search_result_all_txt);
        this.f29273q = (TextView) view.findViewById(R.id.search_result_subtype);
        this.f29274r = (BearLottieView) view.findViewById(R.id.search_loading);
        this.f29275s = (SmartRefreshLayout) view.findViewById(R.id.search_refresh_layout);
        this.f29276t = (RecyclerView) view.findViewById(R.id.search_result_recycler);
        this.f29277u = (SpaceEmptyState) view.findViewById(R.id.search_not_found_empty_state);
        this.f29279w = view.findViewById(R.id.search_filter_ll);
        this.f29280x = (TextView) view.findViewById(R.id.search_filter_txt);
        this.f29278v = (SearchFilterView) view.findViewById(R.id.search_filter_view);
        this.f29281y = view.findViewById(R.id.search_filter_arrow_icon);
        this.f29282z = (TextView) view.findViewById(R.id.search_offline_title);
        this.f29252A = view.findViewById(R.id.search_filter_group);
        m45232k();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo41386a(Resources resources, int i, boolean z, boolean z2, String str) {
        if (i != 1) {
            this.f29278v.mo41415h();
        } else if (!z2) {
            this.f29278v.mo41409f();
        }
        this.f29252A.setVisibility(0);
        this.f29282z.setVisibility(8);
        this.f29268l.setVisibility(8);
        this.f29278v.mo41420m();
        mo41383a(i, true, str);
        mo41387a(resources, z);
    }
}
