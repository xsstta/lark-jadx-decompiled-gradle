package com.ss.android.lark.mm.module.reaction.panel;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;
import com.larksuite.framework.ui.BasePopupWindow;
import com.larksuite.suite.R;
import com.ss.android.lark.desktopmode.base.ContainerType;
import com.ss.android.lark.mm.module.reaction.panel.MmReactionPanel;
import com.ss.android.lark.reaction.widget.p2560b.C52990a;
import com.ss.android.lark.reaction.widget.panel.C53085d;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.lark.mm.module.reaction.panel.c */
public class C46827c {

    /* renamed from: a */
    public final AbstractC46830b f117880a;

    /* renamed from: b */
    public final AbstractC46831c f117881b;

    /* renamed from: c */
    boolean f117882c;

    /* renamed from: d */
    private final Context f117883d;

    /* renamed from: e */
    private final View f117884e;

    /* renamed from: f */
    private int f117885f;

    /* renamed from: g */
    private boolean f117886g;

    /* renamed from: h */
    private List<String> f117887h;

    /* renamed from: i */
    private PopupWindow f117888i;

    /* renamed from: j */
    private View f117889j;

    /* renamed from: k */
    private MmReactionPanel f117890k;

    /* renamed from: l */
    private boolean f117891l;

    /* renamed from: m */
    private PopupWindow.OnDismissListener f117892m;

    /* renamed from: n */
    private View.OnHoverListener f117893n;

    /* renamed from: o */
    private int f117894o;

    /* renamed from: p */
    private int f117895p;

    /* renamed from: q */
    private int f117896q;

    /* renamed from: r */
    private int f117897r;

    /* renamed from: com.ss.android.lark.mm.module.reaction.panel.c$b */
    public interface AbstractC46830b {
        /* renamed from: a */
        void mo164463a(String str);
    }

    /* renamed from: com.ss.android.lark.mm.module.reaction.panel.c$c */
    public interface AbstractC46831c {
        /* renamed from: a */
        void mo164512a(View view, String str, long j, boolean z);

        /* renamed from: a */
        void mo164513a(View view, String str, boolean z);
    }

    /* renamed from: e */
    private void m185530e() {
        m185531f();
    }

    /* renamed from: g */
    private List<String> m185532g() {
        return m185525a(this.f117887h);
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: h */
    private /* synthetic */ void m185533h() {
        PopupWindow.OnDismissListener onDismissListener = this.f117892m;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    /* renamed from: a */
    public View mo164507a() {
        m185528c();
        return this.f117889j;
    }

    /* renamed from: b */
    public void mo164508b() {
        PopupWindow popupWindow = this.f117888i;
        if (popupWindow != null) {
            popupWindow.dismiss();
        }
    }

    /* renamed from: d */
    private void m185529d() {
        if (this.f117897r != -1) {
            this.f117889j.findViewById(R.id.root).setBackgroundResource(this.f117897r);
        }
    }

    /* renamed from: com.ss.android.lark.mm.module.reaction.panel.c$a */
    public static class C46829a {

        /* renamed from: a */
        private Context f117899a;

        /* renamed from: b */
        private View f117900b;

        /* renamed from: c */
        private List<String> f117901c = new ArrayList();

        /* renamed from: d */
        private List<String> f117902d = new ArrayList();

        /* renamed from: e */
        private List<C53085d> f117903e = new ArrayList();

        /* renamed from: f */
        private AbstractC46830b f117904f;

        /* renamed from: g */
        private AbstractC46831c f117905g;

        /* renamed from: h */
        private boolean f117906h;

        /* renamed from: i */
        private int f117907i = 0;

        /* renamed from: j */
        private boolean f117908j = true;

        /* renamed from: k */
        private int f117909k = R.style.ReactionPanelAnimation;

        /* renamed from: l */
        private int f117910l = -1;

        /* renamed from: m */
        private int f117911m = -1;

        /* renamed from: n */
        private boolean f117912n = false;

        /* renamed from: a */
        public C46827c mo164511a() {
            return new C46827c(this.f117899a, this.f117900b, this.f117903e, this.f117901c, this.f117902d, this.f117904f, this.f117905g, this.f117906h, this.f117908j, this.f117907i, this.f117909k, this.f117910l, this.f117911m, this.f117912n);
        }

        /* renamed from: a */
        public C46829a mo164509a(AbstractC46830b bVar) {
            this.f117904f = bVar;
            return this;
        }

        /* renamed from: a */
        public C46829a mo164510a(List<String> list) {
            if (list != null) {
                this.f117902d.clear();
                this.f117902d.addAll(list);
            }
            return this;
        }

        public C46829a(View view) {
            this.f117899a = view.getContext();
            this.f117900b = view;
        }
    }

    /* renamed from: f */
    private void m185531f() {
        List<String> g = m185532g();
        this.f117890k.setPageCount(21);
        this.f117890k.setShowMoreBgColor(this.f117896q);
        this.f117890k.setBackgroundColor(0);
        this.f117890k.setReactionSelectListener(new MmReactionPanel.AbstractC46820b() {
            /* class com.ss.android.lark.mm.module.reaction.panel.C46827c.C468281 */

            @Override // com.ss.android.lark.mm.module.reaction.panel.MmReactionPanel.AbstractC46820b
            /* renamed from: a */
            public void mo164481a(String str) {
                if (C46827c.this.f117880a != null) {
                    C46827c.this.f117880a.mo164463a(str);
                }
                C46827c.this.mo164508b();
            }

            @Override // com.ss.android.lark.mm.module.reaction.panel.MmReactionPanel.AbstractC46820b
            /* renamed from: a */
            public void mo164479a(View view, String str) {
                if (C46827c.this.f117881b != null) {
                    C46827c.this.f117881b.mo164513a(view, str, false);
                }
            }

            @Override // com.ss.android.lark.mm.module.reaction.panel.MmReactionPanel.AbstractC46820b
            /* renamed from: a */
            public void mo164480a(View view, String str, long j, boolean z) {
                if (C46827c.this.f117881b != null) {
                    C46827c.this.f117881b.mo164512a(view, str, j, z);
                }
            }
        });
        this.f117890k.mo164469a(g, true);
    }

    /* renamed from: c */
    private void m185528c() {
        this.f117889j = LayoutInflater.from(this.f117883d).inflate(R.layout.mm_layout_reaction_panel_top, (ViewGroup) this.f117884e, true);
        this.f117885f = Math.min((int) (((double) Math.min(C52990a.m205225a(this.f117883d, ContainerType.Right), C52990a.m205233b(this.f117883d))) * 0.92d), C52990a.m205224a(this.f117883d, 338.0f));
        if (!this.f117882c) {
            BasePopupWindow basePopupWindow = new BasePopupWindow(this.f117889j, this.f117885f, -2, true);
            this.f117888i = basePopupWindow;
            basePopupWindow.setBackgroundDrawable(new ColorDrawable(0));
            this.f117888i.setOutsideTouchable(true);
            this.f117888i.setTouchable(true);
            this.f117888i.setFocusable(this.f117891l);
            this.f117888i.setAnimationStyle(this.f117895p);
            this.f117888i.setOnDismissListener(new PopupWindow.OnDismissListener() {
                /* class com.ss.android.lark.mm.module.reaction.panel.$$Lambda$c$L6buwBiPnLSShn6vfX5bBxzupfY */

                public final void onDismiss() {
                    C46827c.this.m185533h();
                }
            });
        }
        this.f117889j.setOnHoverListener(new View.OnHoverListener() {
            /* class com.ss.android.lark.mm.module.reaction.panel.$$Lambda$c$lOWP09b1AXAe9HzUT1qdbz6oSGQ */

            public final boolean onHover(View view, MotionEvent motionEvent) {
                return C46827c.this.m185527a(view, motionEvent);
            }
        });
        this.f117890k = (MmReactionPanel) this.f117889j.findViewById(R.id.emoji_panel);
        this.f117889j.setOnClickListener(new View.OnClickListener() {
            /* class com.ss.android.lark.mm.module.reaction.panel.$$Lambda$c$dFqIDqvZaEKnsPV1UmNvknMMX0 */

            public final void onClick(View view) {
                C46827c.this.m185526a((C46827c) view);
            }
        });
        m185529d();
        m185530e();
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: a */
    private /* synthetic */ void m185526a(View view) {
        mo164508b();
    }

    /* renamed from: a */
    private List<String> m185525a(List<String> list) {
        int ceil = (int) Math.ceil((((double) list.size()) * 1.0d) / ((double) 20));
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < ceil; i++) {
            int i2 = 20 * i;
            List<String> subList = list.subList(i2, Math.min(i2 + 20, list.size()));
            if (this.f117886g) {
                arrayList.addAll(subList);
                int size = 20 - subList.size();
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

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: a */
    private /* synthetic */ boolean m185527a(View view, MotionEvent motionEvent) {
        View.OnHoverListener onHoverListener = this.f117893n;
        if (onHoverListener != null) {
            return onHoverListener.onHover(view, motionEvent);
        }
        return false;
    }

    private C46827c(Context context, View view, List<C53085d> list, List<String> list2, List<String> list3, AbstractC46830b bVar, AbstractC46831c cVar, boolean z, boolean z2, int i, int i2, int i3, int i4, boolean z3) {
        this.f117886g = true;
        this.f117883d = context;
        this.f117884e = view;
        this.f117880a = bVar;
        this.f117881b = cVar;
        this.f117887h = list3;
        this.f117891l = z;
        this.f117894o = i;
        this.f117895p = i2;
        this.f117896q = i3;
        this.f117897r = i4;
        this.f117882c = z3;
    }
}
