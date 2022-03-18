package com.ss.android.appcenter.business.tab.fragmentv3.templateswitch;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.suite.R;
import com.ss.android.appcenter.business.net.p1272c.C27733c;
import com.ss.android.appcenter.business.tab.business.p1273a.C27800k;
import com.ss.android.appcenter.business.tab.fragmentv3.templateswitch.C28098a;
import com.ss.android.appcenter.common.util.C28209p;
import java.util.List;

public class TemplateSwitchContainer extends FrameLayout {

    /* renamed from: a */
    public RecyclerView f70366a;

    /* renamed from: b */
    public C27800k.AbstractC27804b f70367b;

    /* renamed from: c */
    public C27800k.AbstractC27803a f70368c;

    /* renamed from: d */
    private View f70369d;

    /* renamed from: e */
    private C28098a f70370e;

    /* renamed from: a */
    private void m102743a() {
        C27800k.AbstractC27804b bVar = this.f70367b;
        if (bVar == null || bVar.mo99211a() == null) {
            this.f70370e.mo100022a((String) null);
        } else {
            this.f70370e.mo100022a(this.f70367b.mo99211a().f69303a);
        }
    }

    public TemplateSwitchContainer(Context context) {
        this(context, null);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m102744a(View view) {
        mo100011a(false);
    }

    /* renamed from: c */
    private void m102745c(boolean z) {
        float f;
        View view = this.f70369d;
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
        if (z) {
            this.f70369d.setOnClickListener(new View.OnClickListener() {
                /* class com.ss.android.appcenter.business.tab.fragmentv3.templateswitch.$$Lambda$TemplateSwitchContainer$rGsEZjUstrpDgvQF5tm3EbMnDCY */

                public final void onClick(View view) {
                    TemplateSwitchContainer.this.m102744a((TemplateSwitchContainer) view);
                }
            });
        } else {
            this.f70369d.setOnClickListener(null);
        }
    }

    /* renamed from: a */
    public void mo100010a(List<C27733c> list) {
        this.f70370e.mo100023a(list);
        if (list.size() > 10) {
            C28209p.m103299a(this.f70366a, ((int) (((float) C28209p.m103291a(48.0f)) * 6.5f)) + C28209p.m103291a(4.0f));
            this.f70366a.setPadding(0, 0, 0, C28209p.m103291a(4.0f));
            return;
        }
        C28209p.m103299a(this.f70366a, -2);
        this.f70366a.setPadding(0, 0, 0, 0);
    }

    /* renamed from: b */
    public void mo100012b(final boolean z) {
        float f;
        int measuredHeight = this.f70366a.getMeasuredHeight();
        float f2 = BitmapDescriptorFactory.HUE_RED;
        if (z) {
            f = (float) (-measuredHeight);
        } else {
            f = BitmapDescriptorFactory.HUE_RED;
        }
        if (!z) {
            f2 = (float) (-measuredHeight);
        }
        ObjectAnimator duration = ObjectAnimator.ofFloat(this.f70366a, "translationY", f, f2).setDuration(200L);
        duration.addListener(new Animator.AnimatorListener() {
            /* class com.ss.android.appcenter.business.tab.fragmentv3.templateswitch.TemplateSwitchContainer.C280973 */

            public void onAnimationRepeat(Animator animator) {
            }

            /* renamed from: a */
            private void m102752a() {
                if (TemplateSwitchContainer.this.f70368c != null) {
                    TemplateSwitchContainer.this.f70368c.mo99209b(z);
                }
            }

            public void onAnimationCancel(Animator animator) {
                m102752a();
            }

            public void onAnimationEnd(Animator animator) {
                m102752a();
            }

            public void onAnimationStart(Animator animator) {
                if (TemplateSwitchContainer.this.f70368c != null) {
                    TemplateSwitchContainer.this.f70368c.mo99208a(z);
                }
            }
        });
        duration.start();
    }

    /* renamed from: a */
    public void mo100011a(final boolean z) {
        if (z) {
            m102743a();
            this.f70370e.notifyDataSetChanged();
        }
        m102745c(z);
        if (this.f70366a.getMeasuredHeight() == 0) {
            this.f70366a.getViewTreeObserver().addOnPreDrawListener(new ViewTreeObserver.OnPreDrawListener() {
                /* class com.ss.android.appcenter.business.tab.fragmentv3.templateswitch.TemplateSwitchContainer.ViewTreeObserver$OnPreDrawListenerC280962 */

                public boolean onPreDraw() {
                    TemplateSwitchContainer.this.mo100012b(z);
                    TemplateSwitchContainer.this.f70366a.getViewTreeObserver().removeOnPreDrawListener(this);
                    return true;
                }
            });
        } else {
            mo100012b(z);
        }
    }

    public TemplateSwitchContainer(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: a */
    public void mo100009a(C27800k.AbstractC27804b bVar, C27800k.AbstractC27803a aVar) {
        this.f70367b = bVar;
        this.f70368c = aVar;
    }

    public TemplateSwitchContainer(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        View inflate = LayoutInflater.from(context).inflate(R.layout.workplace_template_switch_container, (ViewGroup) this, true);
        this.f70369d = inflate.findViewById(R.id.bg_wrapper);
        this.f70366a = (RecyclerView) inflate.findViewById(R.id.recycler);
        this.f70370e = new C28098a(new C28098a.AbstractC28099a() {
            /* class com.ss.android.appcenter.business.tab.fragmentv3.templateswitch.TemplateSwitchContainer.C280951 */

            @Override // com.ss.android.appcenter.business.tab.fragmentv3.templateswitch.C28098a.AbstractC28099a
            /* renamed from: a */
            public void mo100013a() {
                TemplateSwitchContainer.this.mo100011a(false);
            }

            @Override // com.ss.android.appcenter.business.tab.fragmentv3.templateswitch.C28098a.AbstractC28099a
            /* renamed from: a */
            public void mo100014a(C27733c cVar) {
                if (TemplateSwitchContainer.this.f70367b != null) {
                    TemplateSwitchContainer.this.f70367b.mo99212a(cVar);
                }
                TemplateSwitchContainer.this.mo100011a(false);
            }
        });
        this.f70366a.setLayoutManager(new LinearLayoutManager(context));
        this.f70366a.setAdapter(this.f70370e);
    }
}
