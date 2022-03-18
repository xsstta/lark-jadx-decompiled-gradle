package com.ss.android.lark.chat.base.view.recycleview;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ArgbEvaluator;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.animation.Animation;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.Adapter;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.component.ui.p1153e.C25653b;
import com.larksuite.suite.R;
import com.ss.android.lark.chat.base.view.recycleview.C32944d;
import com.ss.android.lark.widget.recyclerview.AbstractC58983c;

/* renamed from: com.ss.android.lark.chat.base.view.recycleview.d */
public class C32944d<T extends RecyclerView.Adapter & AbstractC58983c> implements IShineAnimator {

    /* renamed from: a */
    public final RecyclerView f84666a;

    /* renamed from: b */
    public AbstractC32943c<T> f84667b;

    /* renamed from: c */
    public AbstractC32948b f84668c;

    /* renamed from: d */
    ValueAnimator f84669d;

    /* renamed from: e */
    private int f84670e = 100;

    /* renamed from: com.ss.android.lark.chat.base.view.recycleview.d$b */
    public interface AbstractC32948b<I> {
        boolean isItemsEquals(I i, I i2);
    }

    @Override // com.ss.android.lark.chat.base.view.recycleview.IShineAnimator
    /* renamed from: b */
    public void mo121647b() {
        ValueAnimator valueAnimator = this.f84669d;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
    }

    @Override // com.ss.android.lark.chat.base.view.recycleview.IShineAnimator
    /* renamed from: a */
    public void mo121646a() {
        this.f84666a.postDelayed(new RunnableC32946a(), (long) this.f84670e);
    }

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.lark.chat.base.view.recycleview.d$a */
    public class RunnableC32946a implements Runnable {

        /* renamed from: a */
        Object f84671a;

        /* access modifiers changed from: private */
        /* renamed from: a */
        public static /* synthetic */ float m126873a(float f) {
            return ((double) f) <= 0.5d ? BitmapDescriptorFactory.HUE_RED : (f * 2.0f) - 1.0f;
        }

        /* JADX DEBUG: Multi-variable search result rejected for r1v1, resolved type: com.ss.android.lark.chat.base.view.recycleview.c<T extends androidx.recyclerview.widget.RecyclerView$Adapter & com.ss.android.lark.widget.recyclerview.c> */
        /* JADX WARN: Multi-variable type inference failed */
        public void run() {
            int targetItemPosition;
            Object a;
            final int i;
            int i2;
            RecyclerView.Adapter adapter = C32944d.this.f84666a.getAdapter();
            if (adapter != null && (targetItemPosition = C32944d.this.f84667b.getTargetItemPosition(adapter)) >= 0) {
                AbstractC58983c cVar = (AbstractC58983c) adapter;
                if (targetItemPosition < cVar.getItemCount() && (a = cVar.mo31276a(targetItemPosition)) != null) {
                    this.f84671a = a;
                    RecyclerView.ViewHolder findViewHolderForAdapterPosition = C32944d.this.f84666a.findViewHolderForAdapterPosition(targetItemPosition);
                    if (findViewHolderForAdapterPosition != null) {
                        final View view = findViewHolderForAdapterPosition.itemView;
                        Animation animation = view.getAnimation();
                        if (animation != null) {
                            animation.cancel();
                        }
                        final Drawable background = view.getBackground();
                        if (background == null || !(background instanceof ColorDrawable)) {
                            i = 0;
                        } else {
                            i = ((ColorDrawable) background).getColor();
                        }
                        int a2 = C25653b.m91894a(view.getContext(), R.color.ud_Y100, 1.0f);
                        if (i == 0) {
                            i2 = C25653b.m91894a(view.getContext(), R.color.ud_Y100, BitmapDescriptorFactory.HUE_RED);
                        } else {
                            i2 = i;
                        }
                        C32944d.this.f84669d = ObjectAnimator.ofInt(view, "backgroundColor", a2, i2);
                        C32944d.this.f84669d.setDuration(3000L);
                        C32944d.this.f84669d.setInterpolator($$Lambda$d$a$VS8jnNHAdXepvsX3WItXSHb53iU.INSTANCE);
                        C32944d.this.f84669d.setEvaluator(new ArgbEvaluator());
                        C32944d.this.f84669d.addListener(new AnimatorListenerAdapter() {
                            /* class com.ss.android.lark.chat.base.view.recycleview.C32944d.RunnableC32946a.C329471 */

                            public void onAnimationCancel(Animator animator) {
                                m126876a(view, background);
                            }

                            public void onAnimationEnd(Animator animator) {
                                m126876a(view, background);
                            }

                            /* renamed from: a */
                            private void m126876a(View view, Drawable drawable) {
                                view.post(new Runnable(i, view, drawable) {
                                    /* class com.ss.android.lark.chat.base.view.recycleview.$$Lambda$d$a$1$wgDn9IWe_nET9GN735puGbN8jiE */
                                    public final /* synthetic */ int f$0;
                                    public final /* synthetic */ View f$1;
                                    public final /* synthetic */ Drawable f$2;

                                    {
                                        this.f$0 = r1;
                                        this.f$1 = r2;
                                        this.f$2 = r3;
                                    }

                                    public final void run() {
                                        C32944d.RunnableC32946a.C329471.m126875a(this.f$0, this.f$1, this.f$2);
                                    }
                                });
                            }

                            /* access modifiers changed from: private */
                            /* renamed from: a */
                            public static /* synthetic */ void m126875a(int i, View view, Drawable drawable) {
                                if (i >= 0) {
                                    view.setBackgroundColor(i);
                                } else {
                                    view.setBackground(drawable);
                                }
                            }
                        });
                        C32944d.this.f84669d.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(findViewHolderForAdapterPosition, targetItemPosition, adapter) {
                            /* class com.ss.android.lark.chat.base.view.recycleview.$$Lambda$d$a$vZE2L1lUFuaw49EPhu_5dTGUJxA */
                            public final /* synthetic */ RecyclerView.ViewHolder f$1;
                            public final /* synthetic */ int f$2;
                            public final /* synthetic */ RecyclerView.Adapter f$3;

                            {
                                this.f$1 = r2;
                                this.f$2 = r3;
                                this.f$3 = r4;
                            }

                            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                                C32944d.RunnableC32946a.this.m126874a(this.f$1, this.f$2, this.f$3, valueAnimator);
                            }
                        });
                        C32944d.this.f84669d.start();
                    }
                }
            }
        }

        private RunnableC32946a() {
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public /* synthetic */ void m126874a(RecyclerView.ViewHolder viewHolder, int i, RecyclerView.Adapter adapter, ValueAnimator valueAnimator) {
            int adapterPosition = viewHolder.getAdapterPosition();
            if (i != adapterPosition && adapterPosition >= 0) {
                AbstractC58983c cVar = (AbstractC58983c) adapter;
                if (adapterPosition < cVar.getItemCount()) {
                    if (!C32944d.this.f84668c.isItemsEquals(this.f84671a, cVar.mo31276a(adapterPosition))) {
                        C32944d.this.f84669d.cancel();
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public C32944d mo121650a(int i) {
        this.f84670e = i;
        return this;
    }

    /* renamed from: a */
    public C32944d mo121651a(AbstractC32943c cVar) {
        this.f84667b = cVar;
        return this;
    }

    /* renamed from: a */
    public static boolean m126868a(View view) {
        Drawable background = view.getBackground();
        if (background == null || !(background instanceof ColorDrawable) || ((ColorDrawable) background).getColor() != ContextCompat.getColor(view.getContext(), R.color.ud_Y100)) {
            return false;
        }
        return true;
    }

    public C32944d(RecyclerView recyclerView, AbstractC32948b bVar) {
        this.f84666a = recyclerView;
        if (bVar == null) {
            this.f84668c = $$Lambda$BcIAUDdf8rSFKScBdigKUFyonXQ.INSTANCE;
        } else {
            this.f84668c = bVar;
        }
    }
}
