package com.ss.android.lark.widget.floatwindow.cardbag;

import android.animation.Animator;
import android.animation.LayoutTransition;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.larksuite.suite.R;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.widget.floatwindow.cardbag.C58458a;
import java.util.ArrayList;
import java.util.List;

public class DialogAnimationLayout extends FrameLayout {

    /* renamed from: a */
    public AbstractC58457b f143970a;

    /* renamed from: b */
    public ValueAnimator f143971b;

    /* renamed from: c */
    public int f143972c;

    /* renamed from: d */
    private int f143973d;

    /* renamed from: e */
    private int f143974e = -1;

    /* renamed from: f */
    private int f143975f = 1;

    /* renamed from: g */
    private LayoutTransition f143976g;

    /* renamed from: h */
    private List<View> f143977h = new ArrayList();

    /* renamed from: i */
    private int f143978i;

    /* renamed from: com.ss.android.lark.widget.floatwindow.cardbag.DialogAnimationLayout$b */
    public interface AbstractC58457b {
        /* renamed from: a */
        void mo135266a();
    }

    public int getAppearHeight() {
        return this.f143973d;
    }

    public List<View> getPackageViews() {
        return this.f143977h;
    }

    /* renamed from: h */
    private void m226643h() {
        setLayoutTransition(null);
    }

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.lark.widget.floatwindow.cardbag.DialogAnimationLayout$a */
    public class C58456a implements C58458a.AbstractC58463a {

        /* renamed from: b */
        private int f143985b;

        /* renamed from: b */
        private void m226658b() {
        }

        @Override // com.ss.android.lark.widget.floatwindow.cardbag.C58458a.AbstractC58463a
        /* renamed from: a */
        public void mo197929a() {
            if (this.f143985b != 1) {
                m226659c();
            } else {
                m226658b();
            }
        }

        /* renamed from: c */
        private void m226659c() {
            if (DialogAnimationLayout.this.getChildCount() > 3) {
                DialogAnimationLayout.this.mo197912b(DialogAnimationLayout.this.mo197906a(0), false);
            }
        }

        public C58456a(int i) {
            this.f143985b = i;
        }
    }

    /* renamed from: d */
    public boolean mo197915d() {
        if (this.f143977h.size() > 0) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    private void m226641f() {
        this.f143978i = (int) getResources().getDimension(R.dimen.card_dp_step);
        this.f143973d = (int) getResources().getDimension(R.dimen.trans_layout_height);
        m226644i();
    }

    private Animator getAppearAnimation() {
        return ObjectAnimator.ofFloat((Object) null, "translationY", (float) (-this.f143973d), 0.0f).setDuration(500L);
    }

    private Animator getDisAppearAnimation() {
        return ObjectAnimator.ofFloat((Object) null, "translationY", 0.0f, (float) (-this.f143973d)).setDuration(300L);
    }

    /* renamed from: j */
    private ValueAnimator m226645j() {
        m226646k();
        if (mo197915d()) {
            return C58458a.m226664a(this, new C58456a(1));
        }
        return null;
    }

    /* renamed from: b */
    public void mo197911b() {
        m226643h();
        this.f143977h.clear();
        removeAllViews();
        this.f143972c = 0;
    }

    /* renamed from: c */
    public void mo197914c() {
        ValueAnimator valueAnimator = this.f143971b;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            this.f143971b.end();
            this.f143971b = null;
        }
    }

    /* renamed from: e */
    public void mo197916e() {
        m226643h();
        mo197914c();
        mo197909a(this.f143977h.size() - 1, true);
    }

    /* renamed from: g */
    private void m226642g() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            int i2 = childCount - 1;
            int a = C58458a.m226662a(i, i2, this.f143978i);
            int b = C58458a.m226668b(i, i2, this.f143978i);
            int c = C58458a.m226669c(i, i2, this.f143978i);
            int d = C58458a.m226670d(i, i2, this.f143978i);
            childAt.setPadding(a, c, b, d);
            if (((C58464b) childAt.getTag()) == null) {
                C58464b bVar = new C58464b();
                bVar.mo197938a(a, c, b, d);
                childAt.setTag(bVar);
            }
        }
    }

    /* renamed from: i */
    private void m226644i() {
        LayoutTransition layoutTransition = this.f143976g;
        if (layoutTransition != null) {
            setLayoutTransition(layoutTransition);
            return;
        }
        LayoutTransition layoutTransition2 = new LayoutTransition();
        this.f143976g = layoutTransition2;
        layoutTransition2.setStartDelay(2, 0);
        this.f143976g.setStartDelay(3, 0);
        this.f143976g.setAnimator(2, getAppearAnimation());
        this.f143976g.setAnimator(3, getDisAppearAnimation());
        this.f143976g.addTransitionListener(new LayoutTransition.TransitionListener() {
            /* class com.ss.android.lark.widget.floatwindow.cardbag.DialogAnimationLayout.C584531 */

            public void startTransition(LayoutTransition layoutTransition, ViewGroup viewGroup, View view, int i) {
                DialogAnimationLayout.this.mo197914c();
            }

            public void endTransition(LayoutTransition layoutTransition, ViewGroup viewGroup, final View view, final int i) {
                if (DialogAnimationLayout.this.getHeight() > DialogAnimationLayout.this.f143972c) {
                    DialogAnimationLayout dialogAnimationLayout = DialogAnimationLayout.this;
                    dialogAnimationLayout.f143972c = dialogAnimationLayout.getHeight();
                }
                if (i == 3) {
                    DialogAnimationLayout.this.post(new Runnable() {
                        /* class com.ss.android.lark.widget.floatwindow.cardbag.DialogAnimationLayout.C584531.RunnableC584541 */

                        public void run() {
                            if (DialogAnimationLayout.this.f143970a != null) {
                                DialogAnimationLayout.this.mo197911b();
                                DialogAnimationLayout.this.f143970a.mo135266a();
                                DialogAnimationLayout.this.setFinishListener(null);
                            }
                        }
                    });
                }
                DialogAnimationLayout.this.post(new Runnable() {
                    /* class com.ss.android.lark.widget.floatwindow.cardbag.DialogAnimationLayout.C584531.RunnableC584552 */

                    public void run() {
                        DialogAnimationLayout.this.mo197914c();
                        DialogAnimationLayout.this.f143971b = DialogAnimationLayout.this.mo197907a(view, i);
                    }
                });
            }
        });
        setLayoutTransition(this.f143976g);
    }

    /* renamed from: k */
    private void m226646k() {
        int size = (this.f143977h.size() - 1) - getChildCount();
        if (size >= 0) {
            m226643h();
            View view = this.f143977h.get(size);
            if (view.getParent() == null) {
                int i = this.f143978i;
                int i2 = i * 3 * 2;
                int i3 = i * 3 * 2;
                view.setPadding(i2, 0, i3, 0);
                if (((C58464b) view.getTag()) == null) {
                    C58464b bVar = new C58464b();
                    bVar.mo197938a(i2, 0, i3, 0);
                    view.setTag(bVar);
                }
                int i4 = -2;
                if (getChildCount() > 1) {
                    i4 = getChildAt(getChildCount() - 1).getHeight();
                }
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(this.f143974e, i4);
                layoutParams.gravity = this.f143975f;
                addView(view, 0, layoutParams);
            }
        }
    }

    /* renamed from: a */
    public void mo197908a() {
        if (this.f143977h.size() != 0) {
            m226643h();
            this.f143976g = null;
            removeAllViews();
            int a = mo197906a(0);
            if (a == -1) {
                Log.m165387e("DialogAnimationLayout", new Throwable("resetLayoutChildren error! Current thread is" + Thread.currentThread().getName()), true);
                return;
            }
            while (a < this.f143977h.size()) {
                View view = this.f143977h.get(a);
                if (a == this.f143977h.size() - 1) {
                    m226642g();
                    m226637a(view, true);
                } else {
                    m226637a(view, false);
                }
                a++;
            }
        }
    }

    public void setAppearHeight(int i) {
        this.f143973d = i;
    }

    public void setAppearWidth(int i) {
        this.f143974e = i;
    }

    public void setFinishListener(AbstractC58457b bVar) {
        this.f143970a = bVar;
    }

    public void setGravity(int i) {
        this.f143975f = i;
    }

    public void setPackageViews(List<View> list) {
        this.f143977h = list;
    }

    /* renamed from: a */
    public void mo197910a(View view) {
        this.f143977h.add(view);
    }

    /* renamed from: b */
    private boolean m226638b(int i) {
        int c = m226639c(i);
        if (c < 0 || c >= 3) {
            return false;
        }
        return true;
    }

    public DialogAnimationLayout(Context context) {
        super(context);
        m226641f();
    }

    /* renamed from: c */
    private int m226639c(int i) {
        if (i >= 0 && i <= this.f143977h.size() - 1) {
            if (this.f143977h.size() < 3) {
                return i;
            }
            int size = i - (this.f143977h.size() - 3);
            if (size < 0 || size >= 3) {
                return -1;
            }
            return size;
        }
        return -1;
    }

    /* renamed from: c */
    private ValueAnimator m226640c(View view) {
        if (view == null) {
            return null;
        }
        int height = view.getHeight();
        C58464b bVar = (C58464b) view.getTag();
        if (bVar == null) {
            bVar = new C58464b();
        }
        bVar.mo197937a(height);
        view.setTag(bVar);
        return C58458a.m226663a(this, height, new C58456a(0));
    }

    /* renamed from: a */
    public int mo197906a(int i) {
        if (i <= 3 && i >= 0) {
            if (this.f143977h.size() >= 3) {
                int size = i + (this.f143977h.size() - 3);
                if (size < 0 || size >= this.f143977h.size()) {
                    return -1;
                }
                return size;
            } else if (i < this.f143977h.size()) {
                return i;
            } else {
                return -1;
            }
        }
        return -1;
    }

    /* renamed from: b */
    public void mo197913b(View view) {
        this.f143977h.add(view);
        m226637a(view, true);
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int measuredHeight = getMeasuredHeight();
        int i3 = this.f143972c;
        if (measuredHeight < i3) {
            setMeasuredDimension(i, i3);
        }
    }

    /* renamed from: a */
    public ValueAnimator mo197907a(View view, int i) {
        if (i == 2) {
            m226640c(view);
        } else if (i == 3) {
            return m226645j();
        }
        return null;
    }

    public DialogAnimationLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m226641f();
    }

    /* renamed from: a */
    private void m226637a(View view, boolean z) {
        int childCount = getChildCount();
        if (z) {
            m226644i();
        } else {
            m226643h();
        }
        if (childCount >= 2) {
            childCount = 2;
        }
        int i = this.f143978i * childCount;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(this.f143974e, -2);
        layoutParams.gravity = this.f143975f;
        view.setPadding(0, i, 0, 0);
        addView(view, layoutParams);
    }

    /* renamed from: b */
    public void mo197912b(int i, boolean z) {
        if (m226638b(i) && getChildCount() != 0) {
            if (z) {
                m226644i();
            } else {
                m226643h();
            }
            mo197914c();
            removeViewAt(m226639c(i));
        }
    }

    /* renamed from: a */
    public void mo197909a(int i, boolean z) {
        if (m226638b(i)) {
            mo197914c();
            if (getChildCount() != 0 && this.f143977h.size() != 0) {
                int c = m226639c(i);
                View remove = this.f143977h.remove(i);
                if (remove != null && c >= 0) {
                    if (z) {
                        m226644i();
                    } else {
                        m226643h();
                    }
                    removeView(remove);
                }
            }
        } else if (i >= 0 && i < this.f143977h.size()) {
            this.f143977h.remove(i);
        }
    }

    public DialogAnimationLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m226641f();
    }
}
