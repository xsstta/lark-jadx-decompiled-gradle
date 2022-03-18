package com.ss.android.vc.meeting.module.interpretation;

import android.app.Activity;
import android.text.Editable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.AbsListView;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import com.larksuite.suite.R;
import com.ss.android.lark.utils.C57767ae;
import com.ss.android.lark.widget.ExtendedEditText;
import com.ss.android.vc.entity.LanguageType;
import com.ss.android.vc.meeting.basedialog.AbstractC61222a;
import com.ss.android.vc.meeting.framework.meeting.C61303k;
import com.ss.android.vc.meeting.module.interpretation.p3128c.C61958a;
import com.ss.android.vc.service.VideoChatManager;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class SearchLanguageView implements View.OnClickListener, AbsListView.OnScrollListener {

    /* renamed from: a */
    public LinearLayout f155528a;

    /* renamed from: b */
    public ExtendedEditText f155529b;

    /* renamed from: c */
    public View f155530c;

    /* renamed from: d */
    public ListView f155531d;

    /* renamed from: e */
    public List<LanguageType> f155532e = new ArrayList();

    /* renamed from: f */
    AbstractC61933a f155533f;

    /* renamed from: g */
    private Activity f155534g;

    /* renamed from: h */
    private C61978h f155535h;

    /* renamed from: i */
    private List<LanguageType> f155536i = new ArrayList();

    /* renamed from: j */
    private C61303k f155537j;

    /* renamed from: k */
    private AbstractC61222a f155538k;

    /* renamed from: l */
    private boolean f155539l;

    /* renamed from: m */
    private FrameLayout f155540m;

    /* renamed from: n */
    private TextView f155541n;

    /* renamed from: o */
    private TextView f155542o;

    /* renamed from: p */
    private Boolean f155543p;

    /* renamed from: q */
    private List<LanguageType> f155544q;

    /* renamed from: r */
    private View f155545r;

    public enum Status {
        NoResult,
        Result,
        Exit
    }

    /* renamed from: com.ss.android.vc.meeting.module.interpretation.SearchLanguageView$a */
    public interface AbstractC61933a {
        /* renamed from: a */
        void mo214435a(Status status);
    }

    public void onClick(View view) {
    }

    public void onScroll(AbsListView absListView, int i, int i2, int i3) {
    }

    /* renamed from: d */
    private void m241919d() {
        mo214427a(false, (View) this.f155529b);
    }

    /* renamed from: c */
    private void m241918c() {
        this.f155542o.setOnClickListener(new View.OnClickListener() {
            /* class com.ss.android.vc.meeting.module.interpretation.SearchLanguageView.View$OnClickListenerC619281 */

            public void onClick(View view) {
                SearchLanguageView.this.mo214424a();
            }
        });
    }

    /* renamed from: a */
    public void mo214424a() {
        this.f155530c.callOnClick();
        m241919d();
        this.f155529b.setFocusable(false);
        AbstractC61933a aVar = this.f155533f;
        if (aVar != null) {
            aVar.mo214435a(Status.Exit);
        }
        this.f155540m.removeView(this.f155545r);
    }

    /* renamed from: e */
    private void m241920e() {
        C61978h hVar = new C61978h(this.f155534g, this.f155537j, this.f155538k, Boolean.valueOf(this.f155539l), this.f155543p, this.f155544q);
        this.f155535h = hVar;
        this.f155531d.setAdapter((ListAdapter) hVar);
        this.f155531d.setOnScrollListener(this);
    }

    /* renamed from: f */
    private void m241921f() {
        this.f155528a.setOnClickListener(new View.OnClickListener() {
            /* class com.ss.android.vc.meeting.module.interpretation.SearchLanguageView.View$OnClickListenerC619292 */

            public void onClick(View view) {
                SearchLanguageView.this.f155529b.setFocusable(true);
                SearchLanguageView.this.f155529b.setFocusableInTouchMode(true);
                SearchLanguageView.this.f155529b.requestFocus();
                SearchLanguageView.this.f155529b.findFocus();
                SearchLanguageView searchLanguageView = SearchLanguageView.this;
                searchLanguageView.mo214427a(true, (View) searchLanguageView.f155529b);
            }
        });
        this.f155529b.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            /* class com.ss.android.vc.meeting.module.interpretation.SearchLanguageView.View$OnFocusChangeListenerC619303 */

            public void onFocusChange(View view, boolean z) {
                if (z) {
                    if (TextUtils.isEmpty(SearchLanguageView.this.f155529b.getText())) {
                        SearchLanguageView.this.f155530c.setVisibility(8);
                    }
                    SearchLanguageView searchLanguageView = SearchLanguageView.this;
                    searchLanguageView.mo214427a(true, (View) searchLanguageView.f155529b);
                    return;
                }
                SearchLanguageView.this.f155532e.clear();
                SearchLanguageView searchLanguageView2 = SearchLanguageView.this;
                searchLanguageView2.mo214427a(false, (View) searchLanguageView2.f155529b);
            }
        });
        this.f155529b.addTextChangedListener(new C57767ae() {
            /* class com.ss.android.vc.meeting.module.interpretation.SearchLanguageView.C619314 */

            @Override // com.ss.android.lark.utils.C57767ae
            public void afterTextChanged(Editable editable) {
                if (TextUtils.isEmpty(editable.toString())) {
                    SearchLanguageView.this.f155530c.setVisibility(8);
                    SearchLanguageView.this.f155531d.setVisibility(4);
                    return;
                }
                SearchLanguageView.this.f155530c.setVisibility(0);
                SearchLanguageView.this.mo214426a(editable.toString());
            }
        });
        this.f155530c.setOnClickListener(new View.OnClickListener() {
            /* class com.ss.android.vc.meeting.module.interpretation.SearchLanguageView.View$OnClickListenerC619325 */

            public void onClick(View view) {
                SearchLanguageView.this.f155529b.getText().clear();
                SearchLanguageView.this.f155532e.clear();
            }
        });
    }

    /* renamed from: b */
    private void m241917b() {
        View inflate = LayoutInflater.from(this.f155534g).inflate(R.layout.videochat_search_language_view, (ViewGroup) null);
        this.f155545r = inflate;
        this.f155540m.addView(inflate);
        this.f155531d = (ListView) this.f155540m.findViewById(R.id.search_result_lv);
        this.f155528a = (LinearLayout) this.f155540m.findViewById(R.id.search_bar_highlight);
        this.f155529b = (ExtendedEditText) this.f155540m.findViewById(R.id.search_et);
        this.f155530c = this.f155540m.findViewById(R.id.clear_search_highlight);
        this.f155541n = (TextView) this.f155540m.findViewById(R.id.search_result_top_normal_margin);
        this.f155542o = (TextView) this.f155540m.findViewById(R.id.search_cancel_button);
        m241921f();
        m241918c();
        this.f155529b.setFocusable(true);
        this.f155529b.setFocusableInTouchMode(true);
        this.f155529b.requestFocus();
        mo214427a(true, (View) this.f155529b);
        m241920e();
    }

    /* renamed from: a */
    public void mo214425a(AbstractC61933a aVar) {
        this.f155533f = aVar;
    }

    /* renamed from: a */
    public void mo214426a(String str) {
        this.f155532e.clear();
        C61303k kVar = this.f155537j;
        if (!(kVar == null || kVar.mo212056e() == null || this.f155537j.mo212056e().getVideoChatSettings() == null)) {
            this.f155536i = VideoChatManager.m249444a().mo220132j().getMeetingSupportInterpretationLanguage();
        }
        if (this.f155536i != null) {
            HashMap<String, String> a = C61958a.m242071a();
            for (int i = 0; i < this.f155536i.size(); i++) {
                if (m241916a(a.get(this.f155536i.get(i).despI18nKey), str)) {
                    this.f155532e.add(this.f155536i.get(i));
                }
            }
        }
        this.f155531d.setVisibility(0);
        this.f155535h.mo214552a(this.f155532e);
        if (this.f155532e.size() <= 0) {
            AbstractC61933a aVar = this.f155533f;
            if (aVar != null) {
                aVar.mo214435a(Status.NoResult);
            }
        } else if (this.f155533f != null) {
            this.f155541n.setVisibility(8);
            this.f155533f.mo214435a(Status.Result);
        }
    }

    public void onScrollStateChanged(AbsListView absListView, int i) {
        mo214427a(false, (View) this.f155531d);
    }

    /* renamed from: a */
    private boolean m241916a(String str, String str2) {
        if (!(str == null || str2 == null)) {
            int length = str2.length();
            int length2 = str.length() - length;
            for (int i = 0; i <= length2; i++) {
                if (str.regionMatches(true, i, str2, 0, length)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: a */
    public void mo214427a(boolean z, View view) {
        InputMethodManager inputMethodManager = (InputMethodManager) this.f155534g.getSystemService("input_method");
        if (inputMethodManager != null && z) {
            inputMethodManager.showSoftInput(view, 0);
        } else if (inputMethodManager != null && inputMethodManager.isActive()) {
            inputMethodManager.hideSoftInputFromWindow(view.getWindowToken(), 0);
        }
    }

    public SearchLanguageView(Activity activity, C61303k kVar, AbstractC61222a aVar, boolean z, FrameLayout frameLayout, Boolean bool, List<LanguageType> list) {
        this.f155534g = activity;
        this.f155537j = kVar;
        this.f155538k = aVar;
        this.f155539l = z;
        this.f155540m = frameLayout;
        this.f155543p = bool;
        this.f155544q = list;
        m241917b();
    }
}
