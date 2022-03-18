package com.ss.android.vc.meeting.module.reaction.widget;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.text.TextUtils;
import android.transition.Fade;
import android.transition.Transition;
import android.transition.TransitionManager;
import android.transition.TransitionSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.larksuite.framework.ui.BasePopupWindow;
import com.larksuite.suite.R;
import com.ss.android.lark.desktopmode.base.ContainerType;
import com.ss.android.lark.desktopmode.utils.DesktopUtil;
import com.ss.android.lark.reaction.widget.p2560b.C52990a;
import com.ss.android.lark.reaction.widget.panel.C53082c;
import com.ss.android.lark.reaction.widget.panel.C53085d;
import com.ss.android.vc.common.p3077b.C60700b;
import com.ss.android.vc.common.p3083e.C60748b;
import com.ss.android.vc.common.p3083e.C60773o;
import com.ss.android.vc.meeting.module.reaction.widget.C62868b;
import com.ss.android.vc.meeting.module.reaction.widget.VcReactionPanel;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/* renamed from: com.ss.android.vc.meeting.module.reaction.widget.d */
public class C62877d {

    /* renamed from: a */
    public static final int f158335a = C60773o.m236122b((double) C60773o.m236123b((int) R.dimen.bottom_bar_reaction_expand_height_diff));

    /* renamed from: A */
    private int f158336A;

    /* renamed from: B */
    private boolean f158337B;

    /* renamed from: b */
    public final AbstractC62881b f158338b;

    /* renamed from: c */
    public final AbstractC62882c f158339c;

    /* renamed from: d */
    public View f158340d;

    /* renamed from: e */
    public RecyclerView f158341e;

    /* renamed from: f */
    public VcReactionPanel f158342f;

    /* renamed from: g */
    public View f158343g;

    /* renamed from: h */
    public GridView f158344h;

    /* renamed from: i */
    boolean f158345i;

    /* renamed from: j */
    private final Context f158346j;

    /* renamed from: k */
    private final List<C53085d> f158347k;

    /* renamed from: l */
    private final View f158348l;

    /* renamed from: m */
    private boolean f158349m;

    /* renamed from: n */
    private boolean f158350n;

    /* renamed from: o */
    private int f158351o;

    /* renamed from: p */
    private boolean f158352p;

    /* renamed from: q */
    private List<String> f158353q;

    /* renamed from: r */
    private List<String> f158354r;

    /* renamed from: s */
    private PopupWindow f158355s;

    /* renamed from: t */
    private boolean f158356t;

    /* renamed from: u */
    private PopupWindow.OnDismissListener f158357u;

    /* renamed from: v */
    private View.OnHoverListener f158358v;

    /* renamed from: w */
    private int f158359w;

    /* renamed from: x */
    private boolean f158360x;

    /* renamed from: y */
    private int f158361y;

    /* renamed from: z */
    private int f158362z;

    /* renamed from: com.ss.android.vc.meeting.module.reaction.widget.d$b */
    public interface AbstractC62881b {
        /* renamed from: a */
        void mo216898a();

        /* renamed from: a */
        void mo216899a(String str);

        /* renamed from: b */
        void mo216900b();
    }

    /* renamed from: com.ss.android.vc.meeting.module.reaction.widget.d$c */
    public interface AbstractC62882c {
        /* renamed from: a */
        void mo216901a(View view, String str, long j, boolean z);

        /* renamed from: a */
        void mo216902a(View view, String str, boolean z);
    }

    /* renamed from: c */
    public void mo217267c() {
        m246098g();
    }

    /* renamed from: h */
    private List<String> m246099h() {
        return m246089a(this.f158354r);
    }

    /* access modifiers changed from: private */
    /* renamed from: i */
    public /* synthetic */ void m246100i() {
        PopupWindow.OnDismissListener onDismissListener = this.f158357u;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    /* renamed from: a */
    public View mo217262a() {
        m246095d();
        return this.f158340d;
    }

    /* renamed from: b */
    public void mo217264b() {
        PopupWindow popupWindow = this.f158355s;
        if (popupWindow != null) {
            popupWindow.dismiss();
        }
    }

    /* renamed from: e */
    private void m246096e() {
        if (this.f158336A != -1) {
            this.f158340d.findViewById(R.id.root).setBackground(C60773o.m236128f(this.f158336A));
        }
    }

    /* renamed from: f */
    private void m246097f() {
        if (!this.f158349m) {
            this.f158344h.setVisibility(8);
            return;
        }
        this.f158344h.setVisibility(0);
        this.f158343g.setVisibility(0);
        m246094b(this.f158353q);
    }

    /* renamed from: g */
    private void m246098g() {
        C60700b.m235851b("VcReactionPanelFacade", "[bindReactionPanel]", "bindReactionPanel");
        List<String> h = m246099h();
        this.f158342f.setPageCount(35);
        this.f158342f.setShowMoreBgColor(this.f158362z);
        this.f158342f.setBackgroundColor(0);
        this.f158342f.setReactionSelectListener(new VcReactionPanel.AbstractC62867b() {
            /* class com.ss.android.vc.meeting.module.reaction.widget.C62877d.C628781 */

            @Override // com.ss.android.vc.meeting.module.reaction.widget.VcReactionPanel.AbstractC62867b
            /* renamed from: a */
            public void mo217241a(String str) {
                if (Objects.equals(str, "#android#reaction#show#more#holder")) {
                    C62877d.this.mo217265b(true);
                    return;
                }
                if (C62877d.this.f158338b != null) {
                    C62877d.this.f158338b.mo216899a(str);
                }
                C62877d.this.mo217264b();
            }

            @Override // com.ss.android.vc.meeting.module.reaction.widget.VcReactionPanel.AbstractC62867b
            /* renamed from: a */
            public void mo217239a(View view, String str) {
                if (C62877d.this.f158339c != null) {
                    C62877d.this.f158339c.mo216902a(view, str, false);
                }
            }

            @Override // com.ss.android.vc.meeting.module.reaction.widget.VcReactionPanel.AbstractC62867b
            /* renamed from: a */
            public void mo217240a(View view, String str, long j, boolean z) {
                if (C62877d.this.f158339c != null) {
                    C62877d.this.f158339c.mo216901a(view, str, j, z);
                }
            }
        });
        this.f158342f.mo217229a(h, true);
    }

    /* renamed from: com.ss.android.vc.meeting.module.reaction.widget.d$a */
    public static class C62880a {

        /* renamed from: a */
        private Context f158365a;

        /* renamed from: b */
        private View f158366b;

        /* renamed from: c */
        private List<String> f158367c = new ArrayList();

        /* renamed from: d */
        private List<String> f158368d = new ArrayList();

        /* renamed from: e */
        private List<C53085d> f158369e = new ArrayList();

        /* renamed from: f */
        private AbstractC62881b f158370f;

        /* renamed from: g */
        private AbstractC62882c f158371g;

        /* renamed from: h */
        private boolean f158372h;

        /* renamed from: i */
        private int f158373i = C62877d.f158335a;

        /* renamed from: j */
        private boolean f158374j = true;

        /* renamed from: k */
        private int f158375k = R.style.ReactionPanelAnimation;

        /* renamed from: l */
        private int f158376l = -1;

        /* renamed from: m */
        private int f158377m = -1;

        /* renamed from: n */
        private boolean f158378n = false;

        /* renamed from: a */
        public C62877d mo217273a() {
            return new C62877d(this.f158365a, this.f158366b, this.f158369e, this.f158367c, this.f158368d, this.f158370f, this.f158371g, this.f158372h, this.f158374j, this.f158373i, this.f158375k, this.f158376l, this.f158377m, this.f158378n);
        }

        /* renamed from: a */
        public C62880a mo217268a(int i) {
            this.f158376l = i;
            return this;
        }

        /* renamed from: b */
        public C62880a mo217274b(int i) {
            this.f158377m = i;
            return this;
        }

        /* renamed from: a */
        public C62880a mo217269a(AbstractC62881b bVar) {
            this.f158370f = bVar;
            return this;
        }

        /* renamed from: a */
        public C62880a mo217270a(AbstractC62882c cVar) {
            this.f158371g = cVar;
            return this;
        }

        /* renamed from: b */
        public C62880a mo217275b(List<String> list) {
            if (list != null) {
                this.f158368d.clear();
                this.f158368d.addAll(list);
            }
            return this;
        }

        /* renamed from: a */
        public C62880a mo217271a(List<String> list) {
            if (list != null) {
                this.f158367c.clear();
                this.f158367c.addAll(list);
            }
            return this;
        }

        public C62880a(View view) {
            this.f158365a = view.getContext();
            this.f158366b = view;
        }

        /* renamed from: a */
        public C62880a mo217272a(boolean z) {
            this.f158378n = z;
            return this;
        }
    }

    /* renamed from: d */
    private void m246095d() {
        this.f158340d = C60748b.m236068a(this.f158346j, R.layout.layout_vc_reaction_panel_top, (ViewGroup) this.f158348l, true);
        this.f158351o = Math.min((int) (((double) Math.min(C52990a.m205225a(this.f158346j, ContainerType.Right), C52990a.m205233b(this.f158346j))) * 0.92d), C52990a.m205224a(this.f158346j, 338.0f));
        if (!this.f158345i) {
            BasePopupWindow basePopupWindow = new BasePopupWindow(this.f158340d, this.f158351o, -2, true);
            this.f158355s = basePopupWindow;
            basePopupWindow.setBackgroundDrawable(new ColorDrawable(0));
            this.f158355s.setOutsideTouchable(true);
            this.f158355s.setTouchable(true);
            this.f158355s.setFocusable(this.f158356t);
            this.f158355s.setAnimationStyle(this.f158361y);
            this.f158355s.setOnDismissListener(new PopupWindow.OnDismissListener() {
                /* class com.ss.android.vc.meeting.module.reaction.widget.$$Lambda$d$ggZUPOOUFzREMFFW8nHm3X7LY */

                public final void onDismiss() {
                    C62877d.this.m246100i();
                }
            });
        }
        this.f158340d.setOnHoverListener(new View.OnHoverListener() {
            /* class com.ss.android.vc.meeting.module.reaction.widget.$$Lambda$d$F0UhPa9HgZPpNiqmWN9nIBi2q2I */

            public final boolean onHover(View view, MotionEvent motionEvent) {
                return C62877d.this.m246092a(view, motionEvent);
            }
        });
        this.f158344h = (GridView) this.f158340d.findViewById(R.id.first_line_reaction);
        this.f158342f = (VcReactionPanel) this.f158340d.findViewById(R.id.emoji_panel);
        this.f158341e = (RecyclerView) this.f158340d.findViewById(R.id.operation_list);
        this.f158343g = this.f158340d.findViewById(R.id.reaction_divider);
        this.f158340d.setOnClickListener(new View.OnClickListener() {
            /* class com.ss.android.vc.meeting.module.reaction.widget.$$Lambda$d$qNNHv9_gvJCbvAsVlxATdy4VSY */

            public final void onClick(View view) {
                C62877d.this.m246093b((C62877d) view);
            }
        });
        m246096e();
        m246097f();
        m246090a(this.f158340d);
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public /* synthetic */ void m246093b(View view) {
        mo217264b();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public Transition mo217266c(boolean z) {
        int i;
        TransitionSet transitionSet = new TransitionSet();
        if (z) {
            i = 1;
        } else {
            i = 2;
        }
        transitionSet.addTransition(new Fade(i)).setOrdering(0);
        transitionSet.setDuration(50L);
        return transitionSet;
    }

    /* renamed from: b */
    private void m246094b(List<String> list) {
        int i;
        C60700b.m235851b("VcReactionPanelFacade", "[bindReactionIcon]", "bindReactionIcon");
        if (this.f158360x) {
            i = list.size() + 1;
        } else {
            i = list.size();
        }
        this.f158344h.setNumColumns(i);
        C62868b bVar = new C62868b(this.f158346j, list, this.f158360x, new C62868b.AbstractC62872a() {
            /* class com.ss.android.vc.meeting.module.reaction.widget.C62877d.C628792 */

            @Override // com.ss.android.vc.meeting.module.reaction.widget.C62868b.AbstractC62872a
            /* renamed from: a */
            public void mo217254a(String str) {
                if (TextUtils.isEmpty(str)) {
                    C60700b.m235861e("VcReactionPanelFacade", "[onReactionClicked]", "reaction ===> reaction key is null");
                    return;
                }
                if (C62877d.this.f158338b != null) {
                    C62877d.this.f158338b.mo216899a(str);
                }
                C62877d.this.mo217264b();
            }

            @Override // com.ss.android.vc.meeting.module.reaction.widget.C62868b.AbstractC62872a
            /* renamed from: a */
            public void mo217251a(View view) {
                TransitionManager.beginDelayedTransition((ViewGroup) C62877d.this.f158340d, C62877d.this.mo217266c(true));
                C62877d.this.f158342f.setVisibility(0);
                C62877d.this.f158341e.setVisibility(8);
                C62877d.this.f158344h.setVisibility(4);
                C62877d.this.f158340d.findViewById(R.id.root).setBackgroundResource(R.drawable.vc_bg_im_reaction_expand);
                C62877d.this.f158343g.setVisibility(8);
                if (C62877d.this.f158338b != null) {
                    C62877d.this.f158338b.mo216898a();
                }
            }

            @Override // com.ss.android.vc.meeting.module.reaction.widget.C62868b.AbstractC62872a
            /* renamed from: a */
            public void mo217252a(View view, String str) {
                if (C62877d.this.f158339c != null) {
                    C62877d.this.f158339c.mo216902a(view, str, true);
                }
            }

            @Override // com.ss.android.vc.meeting.module.reaction.widget.C62868b.AbstractC62872a
            /* renamed from: a */
            public void mo217253a(View view, String str, long j, boolean z) {
                if (C62877d.this.f158339c != null) {
                    C62877d.this.f158339c.mo216901a(view, str, j, z);
                }
            }
        });
        bVar.mo217243a(this.f158362z);
        this.f158344h.setAdapter((ListAdapter) bVar);
    }

    /* renamed from: a */
    public void mo217263a(boolean z) {
        if (this.f158352p != z) {
            this.f158352p = z;
            if (this.f158337B) {
                this.f158342f.mo217227a(this.f158346j);
                m246098g();
            }
        }
    }

    /* renamed from: a */
    private List<String> m246089a(List<String> list) {
        int ceil = (int) Math.ceil((((double) list.size()) * 1.0d) / ((double) 34));
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < ceil; i++) {
            int i2 = 34 * i;
            List<String> subList = list.subList(i2, Math.min(i2 + 34, list.size()));
            if (this.f158352p) {
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
    public void mo217265b(boolean z) {
        this.f158342f.setVisibility(8);
        this.f158340d.setVisibility(0);
        this.f158340d.findViewById(R.id.root).setBackgroundResource(R.drawable.vc_bg_im_reaction_collapse);
        this.f158344h.setVisibility(0);
        if (this.f158350n) {
            this.f158341e.setVisibility(0);
            this.f158343g.setVisibility(0);
        }
        AbstractC62881b bVar = this.f158338b;
        if (bVar != null) {
            bVar.mo216900b();
        }
    }

    /* renamed from: a */
    private void m246090a(View view) {
        C53082c cVar = new C53082c(this.f158346j, this.f158347k);
        cVar.mo181330a(new C53082c.AbstractC53084b() {
            /* class com.ss.android.vc.meeting.module.reaction.widget.$$Lambda$d$xHjL4V4GOcuBxKAG9xKYFdtptKg */

            @Override // com.ss.android.lark.reaction.widget.panel.C53082c.AbstractC53084b
            public final void onItemClick(View view, int i) {
                C62877d.this.m246091a((C62877d) view, (View) i);
            }
        });
        this.f158341e.setAdapter(cVar);
        this.f158341e.setLayoutManager(new GridLayoutManager(this.f158346j, 6));
        this.f158341e.setOverScrollMode(2);
        this.f158341e.setHasFixedSize(true);
        if (DesktopUtil.m144307b()) {
            int a = C52990a.m205224a(this.f158346j, 8.0f);
            this.f158341e.setPadding(a, a, a, a);
        }
        if (!this.f158350n) {
            view.findViewById(R.id.reaction_divider).setVisibility(8);
            this.f158341e.setVisibility(8);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ boolean m246092a(View view, MotionEvent motionEvent) {
        View.OnHoverListener onHoverListener = this.f158358v;
        if (onHoverListener != null) {
            return onHoverListener.onHover(view, motionEvent);
        }
        return false;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m246091a(View view, int i) {
        this.f158347k.get(i).f131252b.onMenuItemClick();
        mo217264b();
    }

    private C62877d(Context context, View view, List<C53085d> list, List<String> list2, List<String> list3, AbstractC62881b bVar, AbstractC62882c cVar, boolean z, boolean z2, int i, int i2, int i3, int i4, boolean z3) {
        boolean z4;
        boolean z5 = true;
        this.f158352p = true;
        this.f158346j = context;
        this.f158348l = view;
        this.f158347k = list;
        this.f158338b = bVar;
        this.f158339c = cVar;
        if (list2 == null || list2.size() == 0) {
            z4 = false;
        } else {
            z4 = true;
        }
        this.f158349m = z4;
        this.f158350n = (list == null || list.size() == 0) ? false : z5;
        this.f158353q = list2;
        this.f158354r = list3;
        this.f158356t = z;
        this.f158359w = i;
        this.f158360x = z2;
        this.f158361y = i2;
        this.f158362z = i3;
        this.f158336A = i4;
        this.f158345i = z3;
    }
}
