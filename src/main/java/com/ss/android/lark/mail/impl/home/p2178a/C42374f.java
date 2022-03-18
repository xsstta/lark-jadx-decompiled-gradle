package com.ss.android.lark.mail.impl.home.p2178a;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.bytedance.ee.log.C13479a;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.suite.R;
import com.ss.android.lark.mail.impl.entity.C42088b;
import com.ss.android.lark.mail.impl.home.p2178a.C42359a;
import com.ss.android.lark.mail.impl.home.p2178a.C42379g;
import com.ss.android.lark.mail.impl.p2171h.C42187a;
import com.ss.android.lark.mail.impl.service.C43277a;
import com.ss.android.lark.maincore.AbstractC44548e;
import com.ss.android.lark.utils.StatusBarUtil;
import com.ss.android.lark.utils.UIHelper;
import java.util.List;

/* renamed from: com.ss.android.lark.mail.impl.home.a.f */
public class C42374f implements C42379g.AbstractC42381b {

    /* renamed from: a */
    public View f107859a;

    /* renamed from: b */
    public View f107860b;

    /* renamed from: c */
    View f107861c;

    /* renamed from: d */
    View f107862d;

    /* renamed from: e */
    public AbstractC44548e f107863e;

    /* renamed from: f */
    private LinearLayout f107864f;

    /* renamed from: g */
    private C42359a f107865g;

    /* renamed from: h */
    private Context f107866h;

    /* renamed from: i */
    private C42379g.AbstractC42381b.AbstractC42382a f107867i;

    /* renamed from: j */
    private boolean f107868j;

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void destroy() {
    }

    /* renamed from: b */
    public boolean mo152542b() {
        return this.f107868j;
    }

    /* renamed from: a */
    public void mo152535a() {
        mo152540a(false);
        mo152541b(false);
        this.f107867i.mo152519a(false);
    }

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void create() {
        this.f107861c = new View(this.f107866h);
        View inflate = LayoutInflater.from(this.f107866h).inflate(R.layout.mail_account_list_layout, (ViewGroup) null);
        this.f107859a = inflate;
        View findViewById = inflate.findViewById(R.id.mail_gray_layer);
        this.f107862d = findViewById;
        findViewById.setBackgroundColor(UIHelper.getColor(R.color.bg_mask));
        View findViewById2 = this.f107859a.findViewById(R.id.mail_account_list_content_panel);
        this.f107860b = findViewById2;
        findViewById2.setVisibility(4);
        this.f107864f = (LinearLayout) this.f107859a.findViewById(R.id.mail_account_list);
        this.f107865g = new C42359a(this.f107866h);
        View$OnClickListenerC423751 r0 = new View.OnClickListener() {
            /* class com.ss.android.lark.mail.impl.home.p2178a.C42374f.View$OnClickListenerC423751 */

            public void onClick(View view) {
                C42374f.this.mo152535a();
            }
        };
        this.f107861c.setOnClickListener(r0);
        this.f107862d.setOnClickListener(r0);
    }

    /* renamed from: a */
    public void setViewDelegate(C42379g.AbstractC42381b.AbstractC42382a aVar) {
        this.f107867i = aVar;
    }

    /* renamed from: a */
    public void mo152538a(AbstractC44548e eVar) {
        this.f107863e = eVar;
    }

    /* renamed from: a */
    public void mo152539a(List<C42368d> list) {
        this.f107865g.mo152516a(list);
        this.f107864f.removeAllViews();
        View$OnClickListenerC423762 r4 = new View.OnClickListener() {
            /* class com.ss.android.lark.mail.impl.home.p2178a.C42374f.View$OnClickListenerC423762 */

            public void onClick(View view) {
                C42368d dVar = (C42368d) view.getTag();
                if (!dVar.f107849a.f107028e) {
                    C42374f.this.mo152535a();
                    C13479a.m54763b("switchAccount " + dVar.f107849a.mo151808a());
                    C43277a.m171921a().mo154931a(dVar.f107849a.f107024a, (IGetDataCallback<C42088b>) null);
                    C42187a.m168537g(dVar.f107849a.mo151813e() ^ true);
                }
            }
        };
        for (int i = 0; i < this.f107865g.getItemCount(); i++) {
            C42359a.C42360a a = this.f107865g.onCreateViewHolder(this.f107864f, i);
            a.itemView.setOnClickListener(r4);
            this.f107865g.onBindViewHolder(a, i);
            this.f107864f.addView(a.itemView);
        }
        this.f107860b.requestLayout();
    }

    /* renamed from: b */
    public void mo152541b(final boolean z) {
        float f;
        float f2;
        int height = this.f107860b.getHeight();
        if (z) {
            f = (float) (0 - height);
        } else {
            f = (float) 0;
        }
        if (z) {
            f2 = (float) 0;
        } else {
            f2 = (float) (0 - height);
        }
        ObjectAnimator duration = ObjectAnimator.ofFloat(this.f107860b, "translationY", f, f2).setDuration(200L);
        duration.addListener(new Animator.AnimatorListener() {
            /* class com.ss.android.lark.mail.impl.home.p2178a.C42374f.C423784 */

            public void onAnimationRepeat(Animator animator) {
            }

            public void onAnimationStart(Animator animator) {
                if (z) {
                    C42374f.this.f107860b.setVisibility(0);
                }
            }

            public void onAnimationCancel(Animator animator) {
                if (!z) {
                    C42374f.this.f107863e.mo99184a(C42374f.this.f107861c);
                    C42374f.this.f107863e.mo99184a(C42374f.this.f107859a);
                }
            }

            public void onAnimationEnd(Animator animator) {
                if (!z) {
                    C42374f.this.f107863e.mo99184a(C42374f.this.f107861c);
                    C42374f.this.f107863e.mo99184a(C42374f.this.f107859a);
                }
            }
        });
        duration.start();
    }

    /* renamed from: a */
    public void mo152540a(boolean z) {
        float f;
        View view = this.f107862d;
        if (view != null) {
            float f2 = BitmapDescriptorFactory.HUE_RED;
            if (z) {
                f = BitmapDescriptorFactory.HUE_RED;
            } else {
                f = 1.0f;
            }
            if (z) {
                f2 = 1.0f;
            }
            ObjectAnimator.ofFloat(view, "alpha", f, f2).setDuration(200L).start();
        }
    }

    /* renamed from: a */
    public void mo152536a(View view, int i) {
        if (this.f107865g.getItemCount() != 0) {
            this.f107860b.measure(0, 0);
            int dp2px = UIHelper.dp2px(286.0f);
            if (this.f107860b.getMeasuredHeight() > dp2px) {
                ((RelativeLayout.LayoutParams) this.f107860b.getLayoutParams()).height = dp2px;
                this.f107860b.requestLayout();
            }
            this.f107861c.setMinimumHeight(StatusBarUtil.getStatusBarHeight(this.f107866h) + view.getBottom() + i);
            this.f107863e.mo99185a(view.getRootView(), 0, this.f107861c, null);
            if (view.getParent() == null) {
                this.f107863e.mo99185a(view, StatusBarUtil.getStatusBarHeight(this.f107866h) + view.getTop() + view.getHeight(), this.f107859a, null);
            } else {
                this.f107863e.mo99185a(view, view.getHeight(), this.f107859a, null);
            }
            this.f107868j = true;
            this.f107867i.mo152519a(true);
            this.f107859a.getViewTreeObserver().addOnPreDrawListener(new ViewTreeObserver.OnPreDrawListener() {
                /* class com.ss.android.lark.mail.impl.home.p2178a.C42374f.ViewTreeObserver$OnPreDrawListenerC423773 */

                public boolean onPreDraw() {
                    C42374f.this.f107859a.getViewTreeObserver().removeOnPreDrawListener(this);
                    C42374f.this.mo152540a(true);
                    C42374f.this.mo152541b(true);
                    return false;
                }
            });
        }
    }

    public C42374f(Context context, C42379g.AbstractC42381b.AbstractC42382a aVar, AbstractC44548e eVar) {
        this.f107866h = context;
        this.f107867i = aVar;
        this.f107863e = eVar;
    }
}
