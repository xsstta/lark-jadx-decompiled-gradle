package com.ss.android.vc.meeting.module.follow.share.desktop;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.text.Editable;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.view.inputmethod.InputMethodManager;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.p034e.p035a.C0978a;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.SimpleItemAnimator;
import com.airbnb.lottie.LottieAnimationView;
import com.huawei.hms.location.LocationRequest;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.suite.R;
import com.scwang.smartrefresh.layout.SmartRefreshLayout;
import com.scwang.smartrefresh.layout.p1234a.AbstractC27129h;
import com.scwang.smartrefresh.layout.p1235b.C27136d;
import com.scwang.smartrefresh.layout.p1236c.AbstractC27137a;
import com.ss.android.lark.desktopmode.utils.DesktopUtil;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.vc.common.p3077b.C60700b;
import com.ss.android.vc.common.p3083e.C60745ag;
import com.ss.android.vc.common.p3083e.C60762k;
import com.ss.android.vc.common.p3083e.C60773o;
import com.ss.android.vc.common.p3083e.C60785x;
import com.ss.android.vc.common.widget.C60864h;
import com.ss.android.vc.common.widget.ExtendedEditText;
import com.ss.android.vc.common.widget.LoadingLottieView;
import com.ss.android.vc.entity.VcDoc;
import com.ss.android.vc.meeting.framework.meeting.C61303k;
import com.ss.android.vc.meeting.module.follow.share.C61814a;
import com.ss.android.vc.meeting.module.follow.share.C61821c;
import com.ss.android.vc.meeting.module.follow.share.C61826d;
import com.ss.android.vc.meeting.module.follow.share.C61850h;
import com.ss.android.vc.meeting.module.follow.share.IShareContentDialog;
import com.ss.android.vc.meeting.module.follow.share.desktop.C61832d;
import com.ss.android.vc.meeting.module.follow.share.desktop.ShareContentViewHolder;
import com.ss.android.vc.meeting.module.p3130k.C61999a;
import com.ss.android.vc.meeting.module.sharebox.ILocalSharePrepareContract;
import com.ss.android.vc.statistics.event.C63772u;
import com.ss.android.vc.statistics.event2.MeetingShareWindowEvent;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.vc.meeting.module.follow.share.desktop.d */
public class C61832d implements C61821c.AbstractC61824b {

    /* renamed from: A */
    private View f155202A;

    /* renamed from: B */
    private View f155203B;

    /* renamed from: C */
    private LottieAnimationView f155204C;

    /* renamed from: D */
    private ShareContentViewHolder.SharePanelSource f155205D;

    /* renamed from: E */
    private ILocalSharePrepareContract.IView f155206E;

    /* renamed from: F */
    private ShareContentViewHolder f155207F;

    /* renamed from: G */
    private ShareDocListLayoutManager f155208G;

    /* renamed from: H */
    private int f155209H;

    /* renamed from: I */
    private final int f155210I = LocationRequest.PRIORITY_HD_ACCURACY;

    /* renamed from: J */
    private Runnable f155211J = new Runnable() {
        /* class com.ss.android.vc.meeting.module.follow.share.desktop.$$Lambda$gVh7wD5qZtwr2408P3cDlO512dI */

        public final void run() {
            C61832d.this.mo214195d();
        }
    };

    /* renamed from: K */
    private BroadcastReceiver f155212K = new BroadcastReceiver() {
        /* class com.ss.android.vc.meeting.module.follow.share.desktop.C61832d.C618375 */

        public void onReceive(Context context, Intent intent) {
            if (intent.getAction() != null && "action.broadcast.orientation".equals(intent.getAction())) {
                C61832d.this.mo214190a(intent.getBooleanExtra("orientation_landscape", false));
            }
        }
    };

    /* renamed from: a */
    C61303k f155213a;

    /* renamed from: b */
    Activity f155214b;

    /* renamed from: c */
    IShareContentDialog f155215c;

    /* renamed from: d */
    public View f155216d;

    /* renamed from: e */
    public RecyclerView f155217e;

    /* renamed from: f */
    public SmartRefreshLayout f155218f;

    /* renamed from: g */
    public ConstraintLayout f155219g;

    /* renamed from: h */
    public C61814a f155220h;

    /* renamed from: i */
    public View f155221i;

    /* renamed from: j */
    public TextView f155222j;

    /* renamed from: k */
    public C61821c.AbstractC61824b.AbstractC61825a f155223k;

    /* renamed from: l */
    public C60745ag.C60746a f155224l;

    /* renamed from: m */
    public RelativeLayout f155225m;

    /* renamed from: n */
    private ConstraintLayout f155226n;

    /* renamed from: o */
    private ConstraintLayout f155227o;

    /* renamed from: p */
    private ExtendedEditText f155228p;

    /* renamed from: q */
    private TextView f155229q;

    /* renamed from: r */
    private ImageView f155230r;

    /* renamed from: s */
    private TextView f155231s;

    /* renamed from: t */
    private C61850h f155232t;

    /* renamed from: u */
    private C60864h f155233u;

    /* renamed from: v */
    private View f155234v;

    /* renamed from: w */
    private C60762k f155235w;

    /* renamed from: x */
    private ConstraintLayout f155236x;

    /* renamed from: y */
    private View f155237y;

    /* renamed from: z */
    private View f155238z;

    /* renamed from: a */
    public void mo214190a(boolean z) {
    }

    /* renamed from: j */
    private void m241578j() {
        m241577i();
    }

    @Override // com.ss.android.vc.meeting.module.follow.share.C61821c.AbstractC61824b
    /* renamed from: a */
    public void mo214150a(String str) {
        this.f155218f.mo96416n();
        this.f155220h.mo214129a(str, new ArrayList());
        if (TextUtils.isEmpty(this.f155228p.getText()) || !TextUtils.equals(str, this.f155228p.getText().toString().trim())) {
            m241561a(0);
            mo214194c(false);
            return;
        }
        m241580l();
        mo214194c(false);
    }

    @Override // com.ss.android.vc.meeting.module.follow.share.C61821c.AbstractC61824b
    /* renamed from: a */
    public void mo214152a(String str, List<VcDoc> list, boolean z) {
        this.f155218f.mo96416n();
        if (list.size() > 0) {
            if (this.f155227o.getVisibility() != 0 || z) {
                m241579k();
            } else {
                m241561a(list.size());
            }
            this.f155220h.mo214129a(str, new ArrayList(list));
        } else {
            this.f155220h.mo214129a(str, new ArrayList());
            m241561a(list.size());
        }
        mo214194c(false);
    }

    @Override // com.ss.android.vc.meeting.module.follow.share.C61821c.AbstractC61824b
    /* renamed from: a */
    public void mo214151a(String str, List<VcDoc> list) {
        this.f155218f.mo96416n();
        if (!TextUtils.isEmpty(this.f155228p.getText())) {
            if (list.size() > 0) {
                m241579k();
                this.f155220h.mo214128a(str);
                this.f155220h.mo214130a(list);
            }
            mo214194c(false);
        }
    }

    @Override // com.ss.android.vc.meeting.module.follow.share.C61821c.AbstractC61824b
    /* renamed from: a */
    public void mo214149a(ErrorResult errorResult) {
        this.f155218f.mo96416n();
        mo214194c(false);
    }

    /* renamed from: c */
    public void mo214193c() {
        m241566a(false, (View) this.f155228p);
    }

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void destroy() {
        C0978a.m4782a(this.f155214b).mo4990a(this.f155212K);
    }

    /* renamed from: e */
    public void mo214196e() {
        this.f155218f.post(new Runnable() {
            /* class com.ss.android.vc.meeting.module.follow.share.desktop.$$Lambda$d$omHIJqXf2rBRaj6SCbkxe6ZizE */

            public final void run() {
                C61832d.this.m241581m();
            }
        });
    }

    /* renamed from: g */
    private void m241575g() {
        C60762k kVar = new C60762k(this.f155214b);
        this.f155235w = kVar;
        kVar.mo208369a(new C60762k.AbstractC60764a() {
            /* class com.ss.android.vc.meeting.module.follow.share.desktop.C61832d.C618342 */

            @Override // com.ss.android.vc.common.p3083e.C60762k.AbstractC60764a
            public void onKeyboardStateChanged(boolean z, int i) {
                if (z) {
                    ViewGroup.LayoutParams layoutParams = C61832d.this.f155221i.getLayoutParams();
                    layoutParams.height = i;
                    C61832d.this.f155221i.setLayoutParams(layoutParams);
                    C61832d.this.f155221i.setVisibility(0);
                    return;
                }
                ViewGroup.LayoutParams layoutParams2 = C61832d.this.f155221i.getLayoutParams();
                layoutParams2.height = 0;
                C61832d.this.f155221i.setLayoutParams(layoutParams2);
                C61832d.this.f155221i.setVisibility(8);
            }
        });
    }

    /* renamed from: i */
    private void m241577i() {
        this.f155228p.setFocusable(true);
        this.f155228p.setFocusableInTouchMode(true);
        this.f155228p.requestFocus();
        m241566a(true, (View) this.f155228p);
    }

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void create() {
        C0978a.m4782a(this.f155214b).mo4991a(this.f155212K, new IntentFilter("action.broadcast.orientation"));
    }

    /* renamed from: f */
    private void m241574f() {
        this.f155220h = new C61814a(this, this.f155214b, this.f155213a, this.f155205D, this.f155206E);
        ShareDocListLayoutManager shareDocListLayoutManager = new ShareDocListLayoutManager(this.f155214b, 1, false);
        this.f155208G = shareDocListLayoutManager;
        this.f155217e.setLayoutManager(shareDocListLayoutManager);
        this.f155217e.setAdapter(this.f155220h);
        ((SimpleItemAnimator) this.f155217e.getItemAnimator()).setSupportsChangeAnimations(false);
        m241576h();
    }

    /* renamed from: h */
    private void m241576h() {
        this.f155218f.mo96367b(new C61826d(new LoadingLottieView(this.f155214b)));
        this.f155218f.mo96368b(new AbstractC27137a() {
            /* class com.ss.android.vc.meeting.module.follow.share.desktop.$$Lambda$d$c8896fzQcKOJQ5GQbg4Di0aSjXM */

            @Override // com.scwang.smartrefresh.layout.p1236c.AbstractC27137a
            public final void onLoadmore(AbstractC27129h hVar) {
                C61832d.this.m241565a((C61832d) hVar);
            }
        });
        this.f155218f.mo96354a(new C27136d() {
            /* class com.ss.android.vc.meeting.module.follow.share.desktop.C61832d.C618353 */

            @Override // com.scwang.smartrefresh.layout.p1235b.C27136d, com.scwang.smartrefresh.layout.p1234a.AbstractC27130i
            /* renamed from: a */
            public boolean mo96480a(View view) {
                return false;
            }

            @Override // com.scwang.smartrefresh.layout.p1235b.C27136d, com.scwang.smartrefresh.layout.p1234a.AbstractC27130i
            /* renamed from: b */
            public boolean mo96481b(View view) {
                if (!DesktopUtil.m144307b()) {
                    if (!super.mo96481b(view) || !C60785x.m236238b() || !C61832d.this.f155223k.mo214154a()) {
                        return false;
                    }
                    return true;
                } else if (!C60785x.m236238b() || !C61832d.this.f155223k.mo214154a()) {
                    return false;
                } else {
                    return true;
                }
            }
        });
        this.f155218f.setOnGenericMotionListener(new View.OnGenericMotionListener() {
            /* class com.ss.android.vc.meeting.module.follow.share.desktop.C61832d.View$OnGenericMotionListenerC618364 */

            public boolean onGenericMotion(View view, MotionEvent motionEvent) {
                if (motionEvent.getAction() != 8 || C61832d.this.f155217e.canScrollVertically(1) || !C60785x.m236238b() || !C61832d.this.f155223k.mo214154a()) {
                    return false;
                }
                C61832d.this.f155218f.mo96431t();
                return false;
            }
        });
    }

    /* renamed from: k */
    private void m241579k() {
        this.f155219g.setVisibility(4);
        this.f155222j.setVisibility(4);
        if (this.f155205D != ShareContentViewHolder.SharePanelSource.FROM_OUT_TAB || this.f155206E.mo217800d()) {
            this.f155220h.mo214131a(true);
        } else {
            this.f155220h.mo214131a(false);
        }
        this.f155220h.notifyDataSetChanged();
    }

    /* renamed from: l */
    private void m241580l() {
        this.f155219g.setVisibility(0);
        this.f155219g.setClickable(true);
        this.f155219g.setFocusable(true);
        this.f155222j.setVisibility(0);
        this.f155222j.setText(R.string.View_M_NoResultsFound);
        this.f155220h.mo214131a(false);
        this.f155220h.notifyDataSetChanged();
    }

    /* access modifiers changed from: private */
    /* renamed from: m */
    public /* synthetic */ void m241581m() {
        int measuredHeight = (this.f155238z.getMeasuredHeight() - this.f155202A.getMeasuredHeight()) - UIHelper.dp2px(64.0f);
        TextView textView = this.f155222j;
        int i = measuredHeight / 2;
        textView.setTop(i - (textView.getMeasuredHeight() / 2));
        TextView textView2 = this.f155222j;
        textView2.setBottom(i + (textView2.getMeasuredHeight() / 2));
    }

    /* renamed from: d */
    public void mo214195d() {
        this.f155215c.dismiss();
        C60745ag.C60746a aVar = this.f155224l;
        if (aVar != null) {
            aVar.mo208366a(false);
            this.f155224l = null;
        }
        this.f155228p.removeTextChangedListener(this.f155233u);
        C60700b.m235851b("FollowLog_ShareDocViewHolder", "[dismiss]", "dismiss");
        destroy();
    }

    /* renamed from: b */
    public void mo214191b() {
        if (DesktopUtil.m144307b()) {
            this.f155234v.startAnimation(AnimationUtils.loadAnimation(this.f155214b, R.anim.frame_right_in));
        }
        this.f155223k.mo214153a(this.f155228p.getEditableText(), false);
    }

    /* renamed from: a */
    public void mo214185a() {
        this.f155233u = new C60864h() {
            /* class com.ss.android.vc.meeting.module.follow.share.desktop.C61832d.C618331 */

            /* access modifiers changed from: private */
            /* renamed from: a */
            public /* synthetic */ void m241598a(Editable editable) {
                C61832d.this.f155223k.mo214153a(editable, false);
                if (C61832d.this.f155224l != null) {
                    C61832d.this.f155224l.mo208366a(false);
                    C61832d.this.f155224l = null;
                }
            }

            @Override // com.ss.android.vc.common.widget.C60864h
            public void afterTextChanged(Editable editable) {
                if (C61832d.this.f155224l != null) {
                    C61832d.this.f155224l.mo208366a(false);
                }
                $$Lambda$d$1$IVizRqZP7KEAGLXbmq4CP7tUKE8 r0 = new Runnable(editable) {
                    /* class com.ss.android.vc.meeting.module.follow.share.desktop.$$Lambda$d$1$IVizRqZP7KEAGLXbmq4CP7tUKE8 */
                    public final /* synthetic */ Editable f$1;

                    {
                        this.f$1 = r2;
                    }

                    public final void run() {
                        C61832d.C618331.this.m241598a(this.f$1);
                    }
                };
                C61832d.this.f155224l = C60745ag.m236063a(r0, 200);
                if (TextUtils.isEmpty(editable.toString())) {
                    C61832d.this.f155216d.setVisibility(8);
                } else {
                    C61832d.this.f155216d.setVisibility(0);
                }
            }
        };
        this.f155232t = new C61850h(this, this.f155213a, this.f155205D, this.f155206E);
        this.f155217e = (RecyclerView) this.f155234v.findViewById(R.id.doc_search_list);
        this.f155218f = (SmartRefreshLayout) this.f155234v.findViewById(R.id.doc_search_container);
        this.f155226n = (ConstraintLayout) this.f155234v.findViewById(R.id.search_bar_fake);
        this.f155227o = (ConstraintLayout) this.f155234v.findViewById(R.id.search_bar_highlight);
        this.f155228p = (ExtendedEditText) this.f155234v.findViewById(R.id.search_et);
        this.f155216d = this.f155234v.findViewById(R.id.clear_search_highlight);
        this.f155229q = (TextView) this.f155234v.findViewById(R.id.search_cancel_button);
        this.f155219g = (ConstraintLayout) this.f155234v.findViewById(R.id.doc_search_mask);
        this.f155221i = this.f155234v.findViewById(R.id.search_mask_keyboard_padding);
        this.f155222j = (TextView) this.f155234v.findViewById(R.id.doc_search_no_result);
        this.f155236x = (ConstraintLayout) this.f155234v.findViewById(R.id.container_search);
        this.f155237y = this.f155234v.findViewById(R.id.search_bar_file_list_divider);
        this.f155225m = (RelativeLayout) this.f155234v.findViewById(R.id.search_file_area_root_view);
        this.f155230r = (ImageView) this.f155234v.findViewById(R.id.doc_search_image);
        this.f155231s = (TextView) this.f155234v.findViewById(R.id.doc_search_hint);
        this.f155238z = this.f155234v.findViewById(R.id.share_content_coordinator);
        this.f155202A = this.f155234v.findViewById(R.id.share_content_appbar_layout);
        this.f155203B = this.f155234v.findViewById(R.id.share_contnet_loading_layout);
        this.f155204C = (LottieAnimationView) this.f155234v.findViewById(R.id.share_content_first_loading_lottie);
        mo214194c(true);
        m241574f();
        m241562a(this.f155234v);
        m241575g();
        mo214190a(C61999a.m242220f());
    }

    /* renamed from: a */
    public void setViewDelegate(C61821c.AbstractC61824b.AbstractC61825a aVar) {
        this.f155223k = aVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m241565a(AbstractC27129h hVar) {
        C60700b.m235851b("FollowLog_ShareDocViewHolder", "[onLoadMore]", "load more begin");
        this.f155223k.mo214155b();
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public /* synthetic */ void m241567b(View view) {
        this.f155228p.getText().clear();
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public /* synthetic */ void m241570c(View view) {
        if (TextUtils.isEmpty(this.f155228p.getText())) {
            this.f155216d.setVisibility(8);
        }
        m241566a(true, (View) this.f155228p);
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public /* synthetic */ void m241573d(View view) {
        this.f155228p.setFocusable(true);
        this.f155228p.setFocusableInTouchMode(true);
        this.f155228p.requestFocus();
        m241566a(true, (View) this.f155228p);
    }

    /* renamed from: a */
    private void m241561a(int i) {
        this.f155219g.setVisibility(0);
        if (this.f155227o.getVisibility() == 0) {
            this.f155219g.setClickable(true);
            this.f155219g.setFocusable(true);
            this.f155222j.setVisibility(4);
        } else {
            this.f155219g.setClickable(false);
            this.f155219g.setFocusable(false);
            if (i == 0) {
                this.f155222j.setVisibility(0);
                this.f155222j.setText(R.string.View_MV_NoDocsToShare_Status);
                mo214196e();
            }
        }
        this.f155220h.mo214131a(false);
        this.f155220h.notifyDataSetChanged();
    }

    /* renamed from: a */
    private void m241562a(View view) {
        this.f155226n.setOnClickListener(new View.OnClickListener(view) {
            /* class com.ss.android.vc.meeting.module.follow.share.desktop.$$Lambda$d$PIZR80LdCzlut3sWwLQeVpMsmjQ */
            public final /* synthetic */ View f$1;

            {
                this.f$1 = r2;
            }

            public final void onClick(View view) {
                C61832d.this.m241571c((C61832d) this.f$1, view);
            }
        });
        this.f155227o.setOnClickListener(new View.OnClickListener() {
            /* class com.ss.android.vc.meeting.module.follow.share.desktop.$$Lambda$d$TMCRKlu2X8EyyohGOXDc8vy9BYE */

            public final void onClick(View view) {
                C61832d.this.m241573d(view);
            }
        });
        this.f155228p.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            /* class com.ss.android.vc.meeting.module.follow.share.desktop.$$Lambda$d$xcipJ8lqi2874B9uqg6FeXRY54 */

            public final void onFocusChange(View view, boolean z) {
                C61832d.this.m241572c((C61832d) view, (View) z);
            }
        });
        this.f155228p.setOnClickListener(new View.OnClickListener() {
            /* class com.ss.android.vc.meeting.module.follow.share.desktop.$$Lambda$d$oSd4IuF5qQtw4dCxXLphU79uVo */

            public final void onClick(View view) {
                C61832d.this.m241570c((C61832d) view);
            }
        });
        C60864h hVar = this.f155233u;
        if (hVar != null) {
            this.f155228p.addTextChangedListener(hVar);
        }
        this.f155216d.setOnClickListener(new View.OnClickListener() {
            /* class com.ss.android.vc.meeting.module.follow.share.desktop.$$Lambda$d$aCgUbhIx8SYnKlrXTRYQJuDUf3M */

            public final void onClick(View view) {
                C61832d.this.m241567b((C61832d) view);
            }
        });
        this.f155229q.setOnClickListener(new View.OnClickListener(view) {
            /* class com.ss.android.vc.meeting.module.follow.share.desktop.$$Lambda$d$94zNASLfqv_G4NvjD_uctD9YmU */
            public final /* synthetic */ View f$1;

            {
                this.f$1 = r2;
            }

            public final void onClick(View view) {
                C61832d.this.m241568b((C61832d) this.f$1, view);
            }
        });
        this.f155219g.setOnClickListener(new View.OnClickListener(view) {
            /* class com.ss.android.vc.meeting.module.follow.share.desktop.$$Lambda$d$1uPEKoPQZPuuR81mWD3juy333KI */
            public final /* synthetic */ View f$1;

            {
                this.f$1 = r2;
            }

            public final void onClick(View view) {
                C61832d.this.m241563a((C61832d) this.f$1, view);
            }
        });
    }

    /* renamed from: b */
    public void mo214192b(boolean z) {
        this.f155217e.setEnabled(z);
        this.f155226n.setEnabled(z);
        this.f155230r.setEnabled(z);
        this.f155231s.setEnabled(z);
        this.f155220h.mo214131a(z);
        this.f155220h.notifyDataSetChanged();
        this.f155208G.mo214184a(z);
        this.f155218f.setEnabled(z);
    }

    /* renamed from: c */
    public void mo214194c(boolean z) {
        if (z) {
            this.f155203B.setVisibility(0);
            if (!this.f155204C.isAnimating()) {
                this.f155204C.playAnimation();
                return;
            }
            return;
        }
        if (this.f155204C.isAnimating()) {
            this.f155204C.cancelAnimation();
        }
        this.f155203B.setVisibility(8);
    }

    /* renamed from: a */
    public void mo214187a(LinearLayout linearLayout) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f155236x.getLayoutParams();
        marginLayoutParams.topMargin = C60773o.m236115a(16.0d);
        this.f155236x.setLayoutParams(marginLayoutParams);
        this.f155237y.setVisibility(8);
        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) this.f155225m.getLayoutParams();
        int i = marginLayoutParams2.leftMargin;
        int a = C60773o.m236115a(16.0d);
        this.f155225m.setBackgroundResource(R.drawable.vc_bg_float_top_radius_10);
        if (linearLayout != null) {
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) linearLayout.getLayoutParams();
            int height = linearLayout.getHeight();
            int i2 = this.f155209H;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(BitmapDescriptorFactory.HUE_RED, 1.0f);
            ofFloat.setDuration(200L);
            ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(layoutParams, height, i2, linearLayout, i, a, marginLayoutParams2) {
                /* class com.ss.android.vc.meeting.module.follow.share.desktop.$$Lambda$d$ToNB0LPZSXE33JTxj_QlD0YO8 */
                public final /* synthetic */ LinearLayout.LayoutParams f$1;
                public final /* synthetic */ int f$2;
                public final /* synthetic */ int f$3;
                public final /* synthetic */ LinearLayout f$4;
                public final /* synthetic */ int f$5;
                public final /* synthetic */ int f$6;
                public final /* synthetic */ ViewGroup.MarginLayoutParams f$7;

                {
                    this.f$1 = r2;
                    this.f$2 = r3;
                    this.f$3 = r4;
                    this.f$4 = r5;
                    this.f$5 = r6;
                    this.f$6 = r7;
                    this.f$7 = r8;
                }

                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    C61832d.this.m241564a(this.f$1, this.f$2, this.f$3, this.f$4, this.f$5, this.f$6, this.f$7, valueAnimator);
                }
            });
            ofFloat.addListener(new Animator.AnimatorListener() {
                /* class com.ss.android.vc.meeting.module.follow.share.desktop.C61832d.C618397 */

                public void onAnimationCancel(Animator animator) {
                }

                public void onAnimationRepeat(Animator animator) {
                }

                public void onAnimationStart(Animator animator) {
                }

                public void onAnimationEnd(Animator animator) {
                    if (C61832d.this.f155220h.getItemCount() == 0) {
                        C61832d.this.f155219g.setVisibility(0);
                        C61832d.this.f155219g.setFocusable(false);
                        C61832d.this.f155219g.setClickable(false);
                        C61832d.this.f155222j.setVisibility(0);
                        C61832d.this.f155222j.setText(R.string.View_MV_NoDocsToShare_Status);
                        C61832d.this.mo214196e();
                        return;
                    }
                    C61832d.this.f155219g.setVisibility(4);
                }
            });
            ofFloat.start();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m241563a(View view, View view2) {
        mo214186a(view, true);
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public /* synthetic */ void m241568b(View view, View view2) {
        mo214186a(view, true);
    }

    /* renamed from: a */
    public void mo214186a(View view, boolean z) {
        this.f155216d.callOnClick();
        mo214193c();
        m241569b(view, z);
    }

    /* renamed from: b */
    private void m241569b(View view, boolean z) {
        this.f155215c.mo214138e();
        view.findViewById(R.id.group_true_search).setVisibility(8);
        this.f155226n.setVisibility(0);
        this.f155219g.setVisibility(4);
        this.f155223k.mo214156c();
        this.f155220h.mo214131a(z);
        this.f155220h.notifyDataSetChanged();
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public /* synthetic */ void m241572c(View view, boolean z) {
        if (z) {
            if (TextUtils.isEmpty(this.f155228p.getText())) {
                this.f155216d.setVisibility(8);
            }
            m241566a(true, (View) this.f155228p);
            return;
        }
        m241566a(false, (View) this.f155228p);
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public /* synthetic */ void m241571c(View view, View view2) {
        String str;
        this.f155215c.mo214137d();
        this.f155226n.setVisibility(8);
        view.findViewById(R.id.group_true_search).setVisibility(0);
        this.f155219g.setVisibility(0);
        this.f155219g.setClickable(true);
        this.f155219g.setFocusable(true);
        this.f155220h.mo214131a(false);
        this.f155220h.notifyDataSetChanged();
        this.f155222j.setVisibility(4);
        this.f155217e.setVisibility(0);
        if (this.f155205D == ShareContentViewHolder.SharePanelSource.FROM_IN_MEETING_VIEW) {
            C63772u.m250380b(this.f155213a.mo212056e());
        }
        MeetingShareWindowEvent.Companion aVar = MeetingShareWindowEvent.f160861a;
        C61303k kVar = this.f155213a;
        ShareContentViewHolder.SharePanelSource sharePanelSource = this.f155205D;
        ILocalSharePrepareContract.IView bVar = this.f155206E;
        if (bVar == null) {
            str = null;
        } else {
            str = bVar.mo217810n();
        }
        aVar.mo220364a(kVar, "search", sharePanelSource, str, "vc_meeting_share_window_search_view");
        m241578j();
    }

    /* renamed from: a */
    private void m241566a(boolean z, View view) {
        InputMethodManager inputMethodManager = (InputMethodManager) this.f155214b.getSystemService("input_method");
        if (inputMethodManager != null && z) {
            inputMethodManager.showSoftInput(view, 0);
        } else if (inputMethodManager != null && inputMethodManager.isActive()) {
            inputMethodManager.hideSoftInputFromWindow(view.getWindowToken(), 0);
        }
    }

    /* renamed from: a */
    public void mo214188a(final LinearLayout linearLayout, final View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f155236x.getLayoutParams();
        marginLayoutParams.topMargin = C60773o.m236115a(8.0d);
        this.f155236x.setLayoutParams(marginLayoutParams);
        this.f155237y.setVisibility(0);
        final ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) this.f155225m.getLayoutParams();
        final int i = marginLayoutParams2.leftMargin;
        this.f155225m.setBackgroundResource(0);
        if (linearLayout != null && view != null) {
            final LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) linearLayout.getLayoutParams();
            final int height = linearLayout.getHeight();
            this.f155209H = height;
            final int top = view.getTop();
            ValueAnimator ofFloat = ValueAnimator.ofFloat(BitmapDescriptorFactory.HUE_RED, 1.0f);
            ofFloat.setDuration(200L);
            ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(0, 0, 0) {
                /* class com.ss.android.vc.meeting.module.follow.share.desktop.C61832d.C618386 */

                /* renamed from: c */
                final /* synthetic */ int f155246c;

                /* renamed from: g */
                final /* synthetic */ int f155250g;

                public void onAnimationUpdate(ValueAnimator valueAnimator) {
                    float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                    LinearLayout.LayoutParams layoutParams = layoutParams;
                    int i = height;
                    layoutParams.height = (int) (((float) i) - (((float) (i - this.f155246c)) * floatValue));
                    linearLayout.setLayoutParams(layoutParams);
                    View view = view;
                    int i2 = top;
                    view.setTop((int) (((float) i2) + (((float) (this.f155250g - i2)) * floatValue)));
                    int i3 = i;
                    int i4 = (int) (((float) i3) + (((float) (0 - i3)) * floatValue));
                    marginLayoutParams2.setMarginStart(i4);
                    marginLayoutParams2.setMarginEnd(i4);
                    C61832d.this.f155225m.setLayoutParams(marginLayoutParams2);
                }

                {
                    this.f155246c = r4;
                    this.f155250g = r8;
                }
            });
            ofFloat.start();
        }
    }

    public C61832d(ShareContentViewHolder.SharePanelSource sharePanelSource, ILocalSharePrepareContract.IView bVar, C61303k kVar, Activity activity, IShareContentDialog bVar2, View view) {
        this.f155205D = sharePanelSource;
        this.f155206E = bVar;
        this.f155213a = kVar;
        this.f155214b = activity;
        this.f155215c = bVar2;
        this.f155234v = view;
        this.f155207F = this.f155207F;
        mo214185a();
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m241564a(LinearLayout.LayoutParams layoutParams, int i, int i2, LinearLayout linearLayout, int i3, int i4, ViewGroup.MarginLayoutParams marginLayoutParams, ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        layoutParams.height = (int) (((float) i) + (((float) (i2 - i)) * floatValue));
        linearLayout.setLayoutParams(layoutParams);
        int i5 = (int) (((float) i3) + (((float) (i4 - i3)) * floatValue));
        marginLayoutParams.setMarginStart(i5);
        marginLayoutParams.setMarginEnd(i5);
        this.f155225m.setLayoutParams(marginLayoutParams);
    }
}
