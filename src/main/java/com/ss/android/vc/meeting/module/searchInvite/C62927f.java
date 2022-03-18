package com.ss.android.vc.meeting.module.searchInvite;

import android.app.Activity;
import android.text.Editable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.utils.C57767ae;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.lark.widget.ExtendedEditText;
import com.ss.android.lark.widget.recyclerview.C58996h;
import com.ss.android.vc.common.p3083e.C60735ab;
import com.ss.android.vc.dto.SearchParticipantInfo;
import com.ss.android.vc.entity.InviteDialogBean;
import com.ss.android.vc.entity.Participant;
import com.ss.android.vc.meeting.basedialog.AbstractC61222a;
import com.ss.android.vc.meeting.framework.meeting.C61303k;
import com.ss.android.vc.meeting.module.p3143n.p3146b.p3147a.C62533c;
import com.ss.android.vc.meeting.module.searchInvite.AbstractC62918b;
import com.ss.android.vc.meeting.module.searchInvite.C62927f;
import java.util.List;

/* renamed from: com.ss.android.vc.meeting.module.searchInvite.f */
public class C62927f implements AbstractC62913a, AbstractC62918b.AbstractC62921b {

    /* renamed from: a */
    public ExtendedEditText f158497a;

    /* renamed from: b */
    public View f158498b;

    /* renamed from: c */
    public RecyclerView f158499c;

    /* renamed from: d */
    public AbstractC62918b.AbstractC62921b.AbstractC62922a f158500d;

    /* renamed from: e */
    public AbstractC62923c f158501e;

    /* renamed from: f */
    private LinearLayout f158502f;

    /* renamed from: g */
    private Activity f158503g;

    /* renamed from: h */
    private boolean f158504h;

    /* renamed from: i */
    private C62533c f158505i;

    /* renamed from: j */
    private C61303k f158506j;

    /* renamed from: k */
    private FrameLayout f158507k;

    /* renamed from: l */
    private RelativeLayout f158508l;

    /* renamed from: m */
    private TextView f158509m;

    /* renamed from: n */
    private TextView f158510n;

    /* renamed from: o */
    private TextView f158511o;

    /* renamed from: p */
    private RelativeLayout f158512p;

    /* renamed from: q */
    private Boolean f158513q = false;

    /* renamed from: r */
    private AbstractC61222a f158514r;

    /* renamed from: s */
    private ExtendedEditText f158515s;

    /* renamed from: t */
    private Boolean f158516t;

    /* renamed from: u */
    private C62926e f158517u;

    /* renamed from: v */
    private InviteDialogBean f158518v;

    /* renamed from: com.ss.android.vc.meeting.module.searchInvite.f$a */
    public interface AbstractC62932a {
        /* renamed from: a */
        void mo217443a();

        /* renamed from: b */
        void mo217444b();

        /* renamed from: c */
        void mo217445c();
    }

    @Override // com.ss.android.vc.meeting.module.searchInvite.AbstractC62918b.AbstractC62921b
    /* renamed from: a */
    public void mo217426a(ErrorResult errorResult) {
    }

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void create() {
    }

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void destroy() {
    }

    /* renamed from: com.ss.android.vc.meeting.module.searchInvite.f$b */
    public class C62933b implements AbstractC62932a {
        /* access modifiers changed from: private */
        /* renamed from: d */
        public /* synthetic */ void m246405d() {
            C62927f.this.f158501e.mo214546a();
        }

        @Override // com.ss.android.vc.meeting.module.searchInvite.C62927f.AbstractC62932a
        /* renamed from: b */
        public void mo217444b() {
            C62927f.this.mo217407b();
        }

        @Override // com.ss.android.vc.meeting.module.searchInvite.C62927f.AbstractC62932a
        /* renamed from: c */
        public void mo217445c() {
            C62927f.this.mo217440h();
        }

        @Override // com.ss.android.vc.meeting.module.searchInvite.C62927f.AbstractC62932a
        /* renamed from: a */
        public void mo217443a() {
            C62927f.this.f158497a.getText().clear();
            if (C62927f.this.f158501e != null) {
                C62927f.this.mo217440h();
                C60735ab.m236002a(new Runnable() {
                    /* class com.ss.android.vc.meeting.module.searchInvite.$$Lambda$f$b$LmP9b0ccuQt3v5MrFcaR8VGCknk */

                    public final void run() {
                        C62927f.C62933b.this.m246405d();
                    }
                }, 150);
            }
        }

        public C62933b() {
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: n */
    public /* synthetic */ void m246388n() {
        this.f158501e.mo214546a();
    }

    @Override // com.ss.android.vc.meeting.module.searchInvite.AbstractC62913a
    /* renamed from: c */
    public void mo217408c() {
        this.f158500d.mo217430a();
    }

    @Override // com.ss.android.vc.meeting.module.searchInvite.AbstractC62913a
    /* renamed from: d */
    public void mo217409d() {
        ExtendedEditText extendedEditText = this.f158497a;
        if (extendedEditText != null) {
            extendedEditText.clearFocus();
        }
    }

    /* renamed from: h */
    public void mo217440h() {
        mo217437a(false, (View) this.f158497a);
    }

    /* renamed from: k */
    private void m246385k() {
        this.f158511o.setOnClickListener(new View.OnClickListener() {
            /* class com.ss.android.vc.meeting.module.searchInvite.C62927f.View$OnClickListenerC629303 */

            public void onClick(View view) {
                C62927f.this.mo217407b();
            }
        });
    }

    /* renamed from: l */
    private void m246386l() {
        this.f158508l.setVisibility(8);
        this.f158510n.setVisibility(8);
    }

    @Override // com.ss.android.vc.meeting.module.searchInvite.AbstractC62913a
    /* renamed from: a */
    public void mo217406a() {
        mo217439g();
        mo217438f();
        this.f158499c.setVisibility(8);
    }

    @Override // com.ss.android.vc.meeting.module.searchInvite.AbstractC62918b.AbstractC62921b
    /* renamed from: e */
    public void mo217429e() {
        if (this.f158504h) {
            this.f158504h = false;
            this.f158499c.setVisibility(8);
        }
    }

    /* renamed from: g */
    public void mo217439g() {
        this.f158497a.setFocusable(true);
        this.f158497a.setFocusableInTouchMode(true);
        this.f158497a.requestFocus();
        mo217437a(true, (View) this.f158497a);
    }

    /* renamed from: j */
    private void m246384j() {
        this.f158502f.setOnClickListener(new View.OnClickListener() {
            /* class com.ss.android.vc.meeting.module.searchInvite.$$Lambda$f$494kEQ44bIJ3672oqA31J4CMzo */

            public final void onClick(View view) {
                C62927f.this.m246380a((C62927f) view);
            }
        });
        this.f158497a.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            /* class com.ss.android.vc.meeting.module.searchInvite.$$Lambda$f$FAAQa48VDfg6iCIDmBq4wrO4obY */

            public final void onFocusChange(View view, boolean z) {
                C62927f.this.m246381a((C62927f) view, (View) z);
            }
        });
        this.f158497a.addTextChangedListener(new C57767ae() {
            /* class com.ss.android.vc.meeting.module.searchInvite.C62927f.C629281 */

            @Override // com.ss.android.lark.utils.C57767ae
            public void afterTextChanged(Editable editable) {
                C62927f.this.f158500d.mo217431a(editable);
                if (TextUtils.isEmpty(editable.toString())) {
                    C62927f.this.f158501e.mo214549d();
                    C62927f.this.f158498b.setVisibility(8);
                    return;
                }
                C62927f.this.f158498b.setVisibility(0);
            }
        });
        this.f158498b.setOnClickListener(new View.OnClickListener() {
            /* class com.ss.android.vc.meeting.module.searchInvite.C62927f.View$OnClickListenerC629292 */

            public void onClick(View view) {
                C62927f.this.f158497a.getText().clear();
            }
        });
    }

    @Override // com.ss.android.vc.meeting.module.searchInvite.AbstractC62913a
    /* renamed from: b */
    public void mo217407b() {
        this.f158498b.callOnClick();
        mo217440h();
        C60735ab.m236002a(new Runnable() {
            /* class com.ss.android.vc.meeting.module.searchInvite.$$Lambda$f$AGs7NDixWqS2nKqRtMNt_ti5VQU */

            public final void run() {
                C62927f.this.m246388n();
            }
        }, 100);
    }

    /* renamed from: m */
    private void m246387m() {
        C58996h.m228978b(this.f158499c);
        this.f158499c.setLayoutManager(new LinearLayoutManager(this.f158503g, 1, false));
        this.f158499c.addOnScrollListener(new RecyclerView.OnScrollListener() {
            /* class com.ss.android.vc.meeting.module.searchInvite.C62927f.C629314 */

            @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
            public void onScrollStateChanged(RecyclerView recyclerView, int i) {
                super.onScrollStateChanged(recyclerView, i);
                C62927f fVar = C62927f.this;
                fVar.mo217437a(false, (View) fVar.f158499c);
            }
        });
        C62933b bVar = new C62933b();
        if (this.f158513q.booleanValue()) {
            this.f158505i = new C62533c(this.f158503g, this.f158506j, bVar, this.f158514r, true, this.f158516t);
        } else {
            this.f158505i = new C62533c(this.f158503g, this.f158506j, bVar);
        }
        this.f158499c.setAdapter(this.f158505i);
    }

    /* renamed from: i */
    private void m246383i() {
        this.f158507k.addView(LayoutInflater.from(this.f158503g).inflate(R.layout.videochat_search_invite_view, (ViewGroup) null));
        this.f158499c = (RecyclerView) this.f158507k.findViewById(R.id.search_result_rv);
        this.f158502f = (LinearLayout) this.f158507k.findViewById(R.id.search_bar_highlight);
        this.f158497a = (ExtendedEditText) this.f158507k.findViewById(R.id.search_et);
        this.f158498b = this.f158507k.findViewById(R.id.clear_search_highlight);
        this.f158508l = (RelativeLayout) this.f158507k.findViewById(R.id.warning_layout);
        this.f158509m = (TextView) this.f158507k.findViewById(R.id.warning_textview);
        this.f158510n = (TextView) this.f158507k.findViewById(R.id.search_result_top_normal_margin);
        this.f158511o = (TextView) this.f158507k.findViewById(R.id.search_cancel_button);
        this.f158515s = (ExtendedEditText) this.f158507k.findViewById(R.id.search_et);
        if (this.f158506j.al().mo213182i()) {
            ((ViewGroup.MarginLayoutParams) this.f158502f.getLayoutParams()).topMargin = UIUtils.dp2px(this.f158503g, 50.0f);
            this.f158497a.setHint(UIHelper.getString(R.string.View_M_Search));
        }
        m246384j();
        m246387m();
        m246385k();
        mo217438f();
    }

    /* renamed from: f */
    public void mo217438f() {
        if (this.f158506j.mo212056e().getParticipants().size() >= this.f158506j.mo212056e().getVideoChatSettings().getMaxParticipantNum()) {
            m246382b(this.f158503g.getResources().getString(R.string.View_M_LimitReachedPercentDee, Integer.valueOf(this.f158506j.mo212056e().getVideoChatSettings().getMaxParticipantNum())));
            return;
        }
        Participant j = this.f158506j.mo212091I().mo212494b().mo212605j();
        if (!this.f158506j.mo212056e().getVideoChatSettings().isLocked() || (j != null && j.isHostOrCoHost())) {
            m246386l();
        } else {
            m246382b(this.f158503g.getResources().getString(R.string.View_M_MeetingLocked));
        }
    }

    /* renamed from: a */
    public void setViewDelegate(AbstractC62918b.AbstractC62921b.AbstractC62922a aVar) {
        this.f158500d = aVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m246380a(View view) {
        this.f158497a.setFocusable(true);
        this.f158497a.setFocusableInTouchMode(true);
        this.f158497a.requestFocus();
        mo217437a(true, (View) this.f158497a);
    }

    /* renamed from: b */
    private void m246382b(String str) {
        this.f158510n.setVisibility(8);
        this.f158508l.setVisibility(0);
        this.f158509m.setText(str);
    }

    @Override // com.ss.android.vc.meeting.module.searchInvite.AbstractC62918b.AbstractC62921b
    /* renamed from: a */
    public void mo217427a(String str) {
        this.f158499c.setVisibility(8);
        if (TextUtils.isEmpty(this.f158497a.getText()) || !str.equals(this.f158497a.getText().toString().trim())) {
            this.f158501e.mo214549d();
            return;
        }
        this.f158504h = true;
        this.f158501e.mo214548c();
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m246381a(View view, boolean z) {
        int i = 8;
        if (z && TextUtils.isEmpty(this.f158497a.getText())) {
            this.f158498b.setVisibility(8);
        }
        mo217437a(z, this.f158497a);
        RelativeLayout relativeLayout = this.f158512p;
        if (relativeLayout != null) {
            if (z) {
                i = 0;
            }
            relativeLayout.setVisibility(i);
        }
    }

    @Override // com.ss.android.vc.meeting.module.searchInvite.AbstractC62918b.AbstractC62921b
    /* renamed from: a */
    public void mo217428a(String str, List<SearchParticipantInfo> list) {
        if (TextUtils.isEmpty(this.f158497a.getText())) {
            this.f158501e.mo214549d();
            this.f158499c.setVisibility(8);
            return;
        }
        this.f158504h = true;
        if (list.size() > 0) {
            this.f158501e.mo214547b();
            this.f158499c.setVisibility(0);
            this.f158505i.resetAll(list);
            this.f158505i.notifyDataSetChanged();
        }
    }

    /* renamed from: a */
    public void mo217437a(boolean z, View view) {
        InputMethodManager inputMethodManager = (InputMethodManager) this.f158503g.getSystemService("input_method");
        if (inputMethodManager != null && z) {
            inputMethodManager.showSoftInput(view, 0);
        } else if (inputMethodManager != null && inputMethodManager.isActive()) {
            inputMethodManager.hideSoftInputFromWindow(view.getWindowToken(), 0);
        }
    }

    public C62927f(Activity activity, C61303k kVar, FrameLayout frameLayout, RelativeLayout relativeLayout, InviteDialogBean inviteDialogBean, AbstractC62923c cVar) {
        this.f158503g = activity;
        this.f158506j = kVar;
        this.f158507k = frameLayout;
        this.f158512p = relativeLayout;
        this.f158518v = inviteDialogBean;
        this.f158501e = cVar;
        this.f158517u = new C62926e(inviteDialogBean, this);
        m246383i();
    }

    public C62927f(Activity activity, C61303k kVar, FrameLayout frameLayout, InviteDialogBean inviteDialogBean, Boolean bool, AbstractC61222a aVar, AbstractC62923c cVar, Boolean bool2) {
        this.f158503g = activity;
        this.f158506j = kVar;
        this.f158507k = frameLayout;
        this.f158518v = inviteDialogBean;
        this.f158501e = cVar;
        this.f158513q = bool;
        this.f158514r = aVar;
        this.f158516t = bool2;
        this.f158517u = new C62926e(inviteDialogBean, this, bool);
        m246383i();
    }
}
