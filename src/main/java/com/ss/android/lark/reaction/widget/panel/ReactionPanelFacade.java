package com.ss.android.lark.reaction.widget.panel;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.text.TextUtils;
import android.transition.AutoTransition;
import android.transition.Transition;
import android.transition.TransitionManager;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import androidx.core.view.animation.PathInterpolatorCompat;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.huawei.hms.location.LocationRequest;
import com.larksuite.suite.R;
import com.ss.android.lark.desktopmode.base.ContainerType;
import com.ss.android.lark.desktopmode.utils.DesktopUtil;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.reaction.widget.p2560b.C52990a;
import com.ss.android.lark.reaction.widget.panel.C53073a;
import com.ss.android.lark.reaction.widget.panel.C53082c;
import com.ss.android.lark.reaction.widget.panel.detail.ReactionPanel;
import com.ss.android.lark.reaction.widget.panel.p2563a.C53078a;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class ReactionPanelFacade {

    /* renamed from: A */
    private int f131183A;

    /* renamed from: B */
    private int f131184B;

    /* renamed from: a */
    public final AbstractC53072b f131185a;

    /* renamed from: b */
    public boolean f131186b;

    /* renamed from: c */
    public boolean f131187c;

    /* renamed from: d */
    public View f131188d;

    /* renamed from: e */
    public RecyclerView f131189e;

    /* renamed from: f */
    public ReactionPanel f131190f;

    /* renamed from: g */
    public View f131191g;

    /* renamed from: h */
    public GridView f131192h;

    /* renamed from: i */
    private final Context f131193i;

    /* renamed from: j */
    private final List<C53085d> f131194j;

    /* renamed from: k */
    private final View f131195k;

    /* renamed from: l */
    private boolean f131196l;

    /* renamed from: m */
    private int f131197m;

    /* renamed from: n */
    private List<String> f131198n;

    /* renamed from: o */
    private List<String> f131199o;

    /* renamed from: p */
    private PopupWindow f131200p;

    /* renamed from: q */
    private View f131201q;

    /* renamed from: r */
    private View f131202r;

    /* renamed from: s */
    private RecyclerView f131203s;

    /* renamed from: t */
    private boolean f131204t;

    /* renamed from: u */
    private PopupWindow.OnDismissListener f131205u;

    /* renamed from: v */
    private View.OnHoverListener f131206v;

    /* renamed from: w */
    private int f131207w;

    /* renamed from: x */
    private boolean f131208x;

    /* renamed from: y */
    private boolean f131209y;

    /* renamed from: z */
    private int f131210z;

    @Retention(RetentionPolicy.SOURCE)
    public @interface ReactionSource {
    }

    /* renamed from: com.ss.android.lark.reaction.widget.panel.ReactionPanelFacade$b */
    public interface AbstractC53072b {

        /* renamed from: com.ss.android.lark.reaction.widget.panel.ReactionPanelFacade$b$-CC  reason: invalid class name */
        public final /* synthetic */ class CC {
            public static void $default$a(AbstractC53072b bVar) {
            }

            public static void $default$b(AbstractC53072b bVar) {
            }
        }

        /* renamed from: a */
        void mo22763a();

        /* renamed from: a */
        void mo22764a(String str, int i);

        /* renamed from: b */
        void mo22765b();
    }

    /* renamed from: a */
    public void mo181302a(PopupWindow.OnDismissListener onDismissListener) {
        this.f131205u = onDismissListener;
    }

    /* renamed from: k */
    private List<String> m205458k() {
        return m205443a(this.f131199o);
    }

    /* access modifiers changed from: private */
    /* renamed from: l */
    public /* synthetic */ void m205459l() {
        PopupWindow.OnDismissListener onDismissListener = this.f131205u;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    /* renamed from: a */
    public void mo181300a() {
        PopupWindow popupWindow = this.f131200p;
        if (popupWindow != null) {
            popupWindow.dismiss();
        }
    }

    /* renamed from: c */
    private void m205449c() {
        m205452e();
        m205451d();
        m205453f();
        m205455h();
        m205447b(this.f131188d);
    }

    /* renamed from: f */
    private void m205453f() {
        if (this.f131184B != -1) {
            this.f131188d.findViewById(R.id.root).setBackgroundResource(this.f131184B);
        }
    }

    /* renamed from: g */
    private int m205454g() {
        if (DesktopUtil.m144301a(this.f131193i)) {
            return C52990a.m205225a(this.f131193i, ContainerType.Left) >> 1;
        }
        return 0;
    }

    /* renamed from: com.ss.android.lark.reaction.widget.panel.ReactionPanelFacade$a */
    public static class C53071a {

        /* renamed from: a */
        private Context f131213a;

        /* renamed from: b */
        private View f131214b;

        /* renamed from: c */
        private List<String> f131215c = new ArrayList();

        /* renamed from: d */
        private List<String> f131216d = new ArrayList();

        /* renamed from: e */
        private List<C53085d> f131217e = new ArrayList();

        /* renamed from: f */
        private AbstractC53072b f131218f;

        /* renamed from: g */
        private boolean f131219g;

        /* renamed from: h */
        private int f131220h = LocationRequest.PRIORITY_INDOOR;

        /* renamed from: i */
        private boolean f131221i = true;

        /* renamed from: j */
        private int f131222j = R.style.ReactionPanelAnimation;

        /* renamed from: k */
        private int f131223k = -1;

        /* renamed from: l */
        private int f131224l = -1;

        /* renamed from: a */
        public ReactionPanelFacade mo181311a() {
            return new ReactionPanelFacade(this.f131213a, this.f131214b, this.f131217e, this.f131215c, this.f131216d, this.f131218f, this.f131219g, this.f131221i, this.f131220h, this.f131222j, this.f131223k, this.f131224l);
        }

        /* renamed from: a */
        public C53071a mo181307a(int i) {
            this.f131222j = i;
            return this;
        }

        /* renamed from: b */
        public C53071a mo181312b(int i) {
            this.f131224l = i;
            return this;
        }

        /* renamed from: a */
        public C53071a mo181308a(AbstractC53072b bVar) {
            this.f131218f = bVar;
            return this;
        }

        /* renamed from: b */
        public C53071a mo181314b(boolean z) {
            this.f131221i = z;
            return this;
        }

        /* renamed from: a */
        public C53071a mo181309a(List<String> list) {
            if (list != null) {
                this.f131215c.clear();
                this.f131215c.addAll(list);
            }
            return this;
        }

        /* renamed from: b */
        public C53071a mo181313b(List<String> list) {
            if (list != null) {
                this.f131216d.clear();
                this.f131216d.addAll(list);
            }
            return this;
        }

        /* renamed from: c */
        public C53071a mo181315c(List<C53085d> list) {
            if (list != null) {
                this.f131217e.clear();
                this.f131217e.addAll(list);
            }
            return this;
        }

        /* renamed from: a */
        public C53071a mo181310a(boolean z) {
            this.f131219g = z;
            return this;
        }

        public C53071a(View view) {
            this.f131213a = view.getContext();
            this.f131214b = view;
        }
    }

    /* renamed from: h */
    private void m205455h() {
        if (!this.f131196l) {
            this.f131192h.setVisibility(8);
            return;
        }
        this.f131192h.setVisibility(0);
        this.f131191g.setVisibility(0);
        m205448b(this.f131198n);
        m205456i();
        m205457j();
    }

    /* renamed from: j */
    private void m205457j() {
        List<String> k = m205458k();
        this.f131190f.setPageCount(35);
        this.f131190f.setShowMoreBgColor(this.f131183A);
        this.f131190f.mo181334a(k, true);
        int a = C52990a.m205224a(this.f131193i, 4.0f) + (this.f131197m / 84);
        this.f131190f.mo181332a(a, 0, a, 0);
        this.f131190f.setBackgroundColor(0);
        this.f131190f.setReactionSelectListener(new ReactionPanel.AbstractC53093b() {
            /* class com.ss.android.lark.reaction.widget.panel.ReactionPanelFacade.C530691 */

            @Override // com.ss.android.lark.reaction.widget.panel.detail.ReactionPanel.AbstractC53093b
            /* renamed from: a */
            public void mo181304a(String str) {
                if (!Objects.equals(str, "#android#reaction#show#nothing#holder")) {
                    if (Objects.equals(str, "#android#reaction#show#more#holder")) {
                        if (ReactionPanelFacade.this.f131187c) {
                            TransitionManager.beginDelayedTransition((ViewGroup) ReactionPanelFacade.this.f131188d, ReactionPanelFacade.this.mo181303b());
                        }
                        ReactionPanelFacade.this.f131190f.setVisibility(8);
                        ReactionPanelFacade.this.f131192h.setVisibility(0);
                        if (ReactionPanelFacade.this.f131186b) {
                            ReactionPanelFacade.this.f131189e.setVisibility(0);
                            ReactionPanelFacade.this.f131191g.setVisibility(0);
                        }
                        if (ReactionPanelFacade.this.f131185a != null) {
                            ReactionPanelFacade.this.f131185a.mo22765b();
                            return;
                        }
                        return;
                    }
                    if (ReactionPanelFacade.this.f131185a != null) {
                        ReactionHitPoint.f131244a.mo181327a(str, "emoji", "none");
                        ReactionPanelFacade.this.f131185a.mo22764a(str, 2);
                    }
                    ReactionPanelFacade.this.mo181300a();
                }
            }
        });
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public Transition mo181303b() {
        return new AutoTransition().setOrdering(0).setDuration(100L).setInterpolator((TimeInterpolator) PathInterpolatorCompat.create(0.4f, 0.8f, 0.74f, 1.0f));
    }

    /* renamed from: i */
    private void m205456i() {
        if (this.f131209y) {
            this.f131201q.setVisibility(8);
            this.f131202r.setVisibility(8);
            this.f131203s.setVisibility(8);
            return;
        }
        this.f131201q.setVisibility(0);
        this.f131202r.setVisibility(0);
        this.f131203s.setVisibility(0);
        if (!DesktopUtil.m144307b()) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f131192h.getLayoutParams();
            marginLayoutParams.height = C52990a.m205224a(this.f131193i, 36.0f);
            marginLayoutParams.topMargin = 0;
        }
        this.f131203s.setAdapter(new C53078a(this.f131199o, new C53078a.AbstractC53080a() {
            /* class com.ss.android.lark.reaction.widget.panel.$$Lambda$ReactionPanelFacade$XghQCZ4BwRECteaH1eUSD_o3BU */

            @Override // com.ss.android.lark.reaction.widget.panel.p2563a.C53078a.AbstractC53080a
            public final void onReactionClicked(View view, String str) {
                ReactionPanelFacade.this.m205445a((ReactionPanelFacade) view, (View) str);
            }
        }, this.f131193i, !this.f131187c));
        if (DesktopUtil.m144307b()) {
            int a = C52990a.m205224a(this.f131193i, 8.0f);
            this.f131203s.setPadding(a, 0, a, 0);
        }
        this.f131203s.setLayoutManager(new GridLayoutManager(this.f131193i, 7));
    }

    /* renamed from: d */
    private void m205451d() {
        if (!this.f131208x) {
            Log.m165389i("ReactionPanelFacade", "Not init PopupWindow");
            return;
        }
        this.f131197m = Math.min((int) (((double) Math.min(C52990a.m205225a(this.f131193i, ContainerType.Right), C52990a.m205233b(this.f131193i))) * 0.92d), C52990a.m205224a(this.f131193i, 338.0f));
        if (this.f131194j.size() < 6 && !this.f131196l) {
            this.f131197m = (((this.f131197m - C52990a.m205224a(this.f131193i, 20.0f)) / 6) * this.f131194j.size()) + C52990a.m205224a(this.f131193i, 20.0f);
        }
        BasePopupWindow basePopupWindow = new BasePopupWindow(this.f131188d, this.f131197m, -2, true);
        this.f131200p = basePopupWindow;
        basePopupWindow.setBackgroundDrawable(new ColorDrawable(0));
        this.f131200p.setOutsideTouchable(true);
        this.f131200p.setTouchable(true);
        this.f131200p.setFocusable(this.f131204t);
        this.f131200p.setAnimationStyle(this.f131210z);
        this.f131200p.setOnDismissListener(new PopupWindow.OnDismissListener() {
            /* class com.ss.android.lark.reaction.widget.panel.$$Lambda$ReactionPanelFacade$hrkBdqwd1LLSD0qk_rknq6VpfO4 */

            public final void onDismiss() {
                ReactionPanelFacade.this.m205459l();
            }
        });
    }

    /* renamed from: e */
    private void m205452e() {
        int i;
        int i2;
        if (this.f131187c) {
            LayoutInflater from = LayoutInflater.from(this.f131193i);
            if (DesktopUtil.m144307b()) {
                i2 = R.layout.layout_reaction_panel_bottom_desktop;
            } else {
                i2 = R.layout.layout_reaction_panel_bottom;
            }
            this.f131188d = from.inflate(i2, (ViewGroup) null);
        } else {
            LayoutInflater from2 = LayoutInflater.from(this.f131193i);
            if (DesktopUtil.m144307b()) {
                i = R.layout.layout_reaction_panel_top_desktop;
            } else {
                i = R.layout.layout_reaction_panel_top;
            }
            this.f131188d = from2.inflate(i, (ViewGroup) null);
        }
        this.f131188d.setOnHoverListener(new View.OnHoverListener() {
            /* class com.ss.android.lark.reaction.widget.panel.$$Lambda$ReactionPanelFacade$P86D4pEN6Q8Jxr2K6Zckm6iKzI */

            public final boolean onHover(View view, MotionEvent motionEvent) {
                return ReactionPanelFacade.this.m205446a(view, motionEvent);
            }
        });
        this.f131192h = (GridView) this.f131188d.findViewById(R.id.first_line_reaction);
        this.f131190f = (ReactionPanel) this.f131188d.findViewById(R.id.emoji_panel);
        this.f131203s = (RecyclerView) this.f131188d.findViewById(R.id.reaction_recycler);
        this.f131189e = (RecyclerView) this.f131188d.findViewById(R.id.operation_list);
        this.f131191g = this.f131188d.findViewById(R.id.reaction_divider);
        this.f131201q = this.f131188d.findViewById(R.id.recently_use_tips);
        this.f131202r = this.f131188d.findViewById(R.id.recently_use_divider);
        this.f131188d.setOnClickListener(new View.OnClickListener() {
            /* class com.ss.android.lark.reaction.widget.panel.$$Lambda$ReactionPanelFacade$WyNNDPx8Hipr5yLFQFjnV7SyYg */

            public final void onClick(View view) {
                ReactionPanelFacade.this.m205450c(view);
            }
        });
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public /* synthetic */ void m205450c(View view) {
        mo181300a();
    }

    /* renamed from: a */
    public void mo181301a(View.OnHoverListener onHoverListener) {
        this.f131206v = onHoverListener;
    }

    /* renamed from: a */
    private List<String> m205443a(List<String> list) {
        int ceil = (int) Math.ceil((((double) list.size()) * 1.0d) / ((double) 34));
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < ceil; i++) {
            int i2 = 34 * i;
            List<String> subList = list.subList(i2, Math.min(i2 + 34, list.size()));
            if (this.f131187c) {
                arrayList.addAll(subList);
                int size = 34 - subList.size();
                for (int i3 = 0; i3 < size; i3++) {
                    arrayList.add("#android#reaction#show#nothing#holder");
                }
                arrayList.add("#android#reaction#show#more#holder");
            } else {
                int min = Math.min(subList.size(), 6);
                ArrayList arrayList2 = new ArrayList();
                arrayList2.addAll(subList);
                arrayList2.add(min, "#android#reaction#show#more#holder");
                arrayList.addAll(arrayList2);
            }
        }
        return arrayList;
    }

    /* renamed from: b */
    private void m205447b(View view) {
        if (!this.f131186b) {
            view.findViewById(R.id.reaction_divider).setVisibility(8);
            this.f131189e.setVisibility(8);
            return;
        }
        C53082c cVar = new C53082c(this.f131193i, this.f131194j);
        cVar.mo181330a(new C53082c.AbstractC53084b() {
            /* class com.ss.android.lark.reaction.widget.panel.$$Lambda$ReactionPanelFacade$EOCf7tJl_vOQMEFDCEykiOIHM40 */

            @Override // com.ss.android.lark.reaction.widget.panel.C53082c.AbstractC53084b
            public final void onItemClick(View view, int i) {
                ReactionPanelFacade.this.m205444a((ReactionPanelFacade) view, (View) i);
            }
        });
        this.f131189e.setAdapter(cVar);
        Context context = this.f131193i;
        int i = 6;
        if (!this.f131196l) {
            i = Math.min(6, this.f131194j.size());
        }
        this.f131189e.setLayoutManager(new GridLayoutManager(context, i));
        this.f131189e.setOverScrollMode(2);
        this.f131189e.setHasFixedSize(true);
        if (DesktopUtil.m144307b()) {
            int a = C52990a.m205224a(this.f131193i, 8.0f);
            this.f131189e.setPadding(a, a, a, a);
        }
    }

    /* renamed from: b */
    private void m205448b(List<String> list) {
        int i;
        if (this.f131209y) {
            int a = C52990a.m205224a(this.f131193i, 4.0f) + (this.f131197m / 84);
            this.f131192h.setPadding(a, 0, a, 0);
        }
        if (this.f131209y) {
            i = list.size() + 1;
        } else {
            i = list.size();
        }
        this.f131192h.setNumColumns(i);
        C53073a aVar = new C53073a(this.f131193i, list, this.f131209y, new C53073a.AbstractC53076a() {
            /* class com.ss.android.lark.reaction.widget.panel.ReactionPanelFacade.C530702 */

            @Override // com.ss.android.lark.reaction.widget.panel.C53073a.AbstractC53076a
            /* renamed from: a */
            public void mo181306a(String str) {
                if (TextUtils.isEmpty(str)) {
                    Log.m165383e("ReactionPanelFacade", "reaction ===> reaction key is null");
                    return;
                }
                if (ReactionPanelFacade.this.f131185a != null) {
                    ReactionPanelFacade.this.f131185a.mo22764a(str, 0);
                }
                ReactionPanelFacade.this.mo181300a();
            }

            @Override // com.ss.android.lark.reaction.widget.panel.C53073a.AbstractC53076a
            /* renamed from: a */
            public void mo181305a(View view) {
                TransitionManager.beginDelayedTransition((ViewGroup) ReactionPanelFacade.this.f131188d, ReactionPanelFacade.this.mo181303b());
                ReactionHitPoint.f131244a.mo181326a();
                ReactionPanelFacade.this.f131190f.setVisibility(0);
                ReactionPanelFacade.this.f131189e.setVisibility(8);
                ReactionPanelFacade.this.f131192h.setVisibility(8);
                ReactionPanelFacade.this.f131191g.setVisibility(8);
                if (ReactionPanelFacade.this.f131185a != null) {
                    ReactionPanelFacade.this.f131185a.mo22763a();
                }
            }
        });
        aVar.mo181316a(this.f131183A);
        this.f131192h.setAdapter((ListAdapter) aVar);
    }

    /* renamed from: a */
    public PopupWindow mo181296a(float f) {
        boolean z;
        if (f > ((float) C52990a.m205224a(this.f131193i, (float) this.f131207w))) {
            z = true;
        } else {
            z = false;
        }
        this.f131187c = z;
        m205449c();
        if (this.f131187c) {
            this.f131200p.showAtLocation(this.f131195k, 81, m205454g(), (int) ((((float) C52990a.m205233b(this.f131193i)) - f) + ((float) C52990a.m205224a(this.f131193i, 22.0f))));
        } else {
            this.f131200p.showAtLocation(this.f131195k, 49, m205454g(), (int) (f + ((float) C52990a.m205224a(this.f131193i, 22.0f))));
        }
        return this.f131200p;
    }

    /* renamed from: a */
    public PopupWindow mo181298a(View view) {
        boolean z;
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        int b = C52990a.m205233b(this.f131193i);
        if (iArr[1] > (b >> 1)) {
            z = true;
        } else {
            z = false;
        }
        this.f131187c = z;
        m205449c();
        if (this.f131187c) {
            this.f131200p.showAtLocation(view, 81, m205454g(), b - iArr[1]);
        } else {
            this.f131200p.showAtLocation(view, 49, m205454g(), iArr[1]);
        }
        return this.f131200p;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m205445a(View view, String str) {
        AbstractC53072b bVar = this.f131185a;
        if (bVar != null) {
            bVar.mo22764a(str, 1);
        }
        mo181300a();
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m205444a(View view, int i) {
        this.f131194j.get(i).f131252b.onMenuItemClick();
        mo181300a();
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ boolean m205446a(View view, MotionEvent motionEvent) {
        View.OnHoverListener onHoverListener = this.f131206v;
        if (onHoverListener != null) {
            return onHoverListener.onHover(view, motionEvent);
        }
        return false;
    }

    /* renamed from: a */
    public PopupWindow mo181297a(float f, float f2) {
        int i;
        int a = C52990a.m205224a(this.f131193i, (float) this.f131207w);
        int b = C52990a.m205233b(this.f131193i);
        float f3 = (float) a;
        int i2 = 49;
        if (f > f3) {
            this.f131187c = true;
            i = (int) ((((float) b) - f) + ((float) C52990a.m205224a(this.f131193i, 3.0f)));
            i2 = 81;
        } else if (((float) b) - f2 > f3) {
            this.f131187c = false;
            i = (int) (f2 + ((float) C52990a.m205224a(this.f131193i, 3.0f)));
        } else {
            this.f131187c = false;
            i = (int) (f + ((float) C52990a.m205224a(this.f131193i, 32.0f)));
        }
        m205449c();
        this.f131200p.showAtLocation(this.f131195k, i2, m205454g(), i);
        return this.f131200p;
    }

    /* renamed from: a */
    public PopupWindow mo181299a(boolean z, int i, int i2, int i3) {
        this.f131187c = z;
        m205449c();
        this.f131200p.showAtLocation(this.f131195k, i, i2, i3);
        return this.f131200p;
    }

    private ReactionPanelFacade(Context context, View view, List<C53085d> list, List<String> list2, List<String> list3, AbstractC53072b bVar, boolean z, boolean z2, int i, int i2, int i3, int i4) {
        boolean z3;
        boolean z4 = true;
        this.f131208x = true;
        this.f131193i = context;
        this.f131195k = view;
        this.f131194j = list;
        this.f131185a = bVar;
        if (list2 == null || list2.size() == 0) {
            z3 = false;
        } else {
            z3 = true;
        }
        this.f131196l = z3;
        this.f131186b = (list == null || list.size() == 0) ? false : z4;
        this.f131198n = list2;
        this.f131199o = list3;
        this.f131204t = z;
        this.f131207w = i;
        this.f131209y = z2;
        this.f131210z = i2;
        this.f131183A = i3;
        this.f131184B = i4;
    }
}
