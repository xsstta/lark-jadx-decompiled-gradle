package com.ss.android.lark.moments.impl.common.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ArgbEvaluator;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.animation.Animation;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.Adapter;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.component.ui.p1153e.C25653b;
import com.larksuite.suite.R;
import com.ss.android.lark.moments.impl.common.widget.C47292b;
import com.ss.android.lark.widget.recyclerview.AbstractC58983c;

/* renamed from: com.ss.android.lark.moments.impl.common.widget.b */
public class C47292b<T extends RecyclerView.Adapter & AbstractC58983c> {

    /* renamed from: a */
    public final RecyclerView f119278a;

    /* renamed from: b */
    public AbstractC47291a<T> f119279b;

    /* renamed from: c */
    public AbstractC47296b f119280c;

    /* renamed from: d */
    private int f119281d = 100;

    /* renamed from: com.ss.android.lark.moments.impl.common.widget.b$b */
    public interface AbstractC47296b<I> {
        boolean isItemsEquals(I i, I i2);
    }

    /* renamed from: a */
    public void mo166247a() {
        this.f119278a.postDelayed(new RunnableC47294a(), (long) this.f119281d);
    }

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.lark.moments.impl.common.widget.b$a */
    public class RunnableC47294a implements Runnable {

        /* renamed from: a */
        Object f119282a;

        /* access modifiers changed from: private */
        /* renamed from: a */
        public static /* synthetic */ float m187287a(float f) {
            return ((double) f) <= 0.5d ? BitmapDescriptorFactory.HUE_RED : (f * 2.0f) - 1.0f;
        }

        /* JADX DEBUG: Multi-variable search result rejected for r0v3, resolved type: com.ss.android.lark.moments.impl.common.widget.a<T extends androidx.recyclerview.widget.RecyclerView$Adapter & com.ss.android.lark.widget.recyclerview.c> */
        /* JADX WARN: Multi-variable type inference failed */
        public void run() {
            int targetItemPosition;
            Object a;
            final int i;
            int i2;
            RecyclerView.Adapter adapter = C47292b.this.f119278a.getAdapter();
            if (adapter != null && (targetItemPosition = C47292b.this.f119279b.getTargetItemPosition(adapter)) >= 0) {
                AbstractC58983c cVar = (AbstractC58983c) adapter;
                if (targetItemPosition < cVar.getItemCount() && (a = cVar.mo31276a(targetItemPosition)) != null) {
                    this.f119282a = a;
                    RecyclerView.ViewHolder findViewHolderForAdapterPosition = C47292b.this.f119278a.findViewHolderForAdapterPosition(targetItemPosition);
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
                        ObjectAnimator ofInt = ObjectAnimator.ofInt(view, "backgroundColor", a2, i2);
                        ofInt.setDuration(3000L);
                        ofInt.setInterpolator($$Lambda$b$a$nlB1eihPxE7FXj6Mpe5m7kA9L_4.INSTANCE);
                        ofInt.setEvaluator(new ArgbEvaluator());
                        ofInt.addListener(new AnimatorListenerAdapter() {
                            /* class com.ss.android.lark.moments.impl.common.widget.C47292b.RunnableC47294a.C472951 */

                            public void onAnimationCancel(Animator animator) {
                                m187290a(view, background);
                            }

                            public void onAnimationEnd(Animator animator) {
                                m187290a(view, background);
                            }

                            /* renamed from: a */
                            private void m187290a(View view, Drawable drawable) {
                                view.post(new Runnable(i, view, drawable) {
                                    /* class com.ss.android.lark.moments.impl.common.widget.$$Lambda$b$a$1$m5fKCmcJq7K8FgxmUv3dLzxEf0g */
                                    public final /* synthetic */ int f$0;
                                    public final /* synthetic */ View f$1;
                                    public final /* synthetic */ Drawable f$2;

                                    {
                                        this.f$0 = r1;
                                        this.f$1 = r2;
                                        this.f$2 = r3;
                                    }

                                    public final void run() {
                                        C47292b.RunnableC47294a.C472951.m187289a(this.f$0, this.f$1, this.f$2);
                                    }
                                });
                            }

                            /* access modifiers changed from: private */
                            /* renamed from: a */
                            public static /* synthetic */ void m187289a(int i, View view, Drawable drawable) {
                                if (i >= 0) {
                                    view.setBackgroundColor(i);
                                } else {
                                    view.setBackground(drawable);
                                }
                            }
                        });
                        ofInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(findViewHolderForAdapterPosition, targetItemPosition, adapter, ofInt) {
                            /* class com.ss.android.lark.moments.impl.common.widget.$$Lambda$b$a$xJZDpSKkPPdIRUflDRVdsnhJq38 */
                            public final /* synthetic */ RecyclerView.ViewHolder f$1;
                            public final /* synthetic */ int f$2;
                            public final /* synthetic */ RecyclerView.Adapter f$3;
                            public final /* synthetic */ ValueAnimator f$4;

                            {
                                this.f$1 = r2;
                                this.f$2 = r3;
                                this.f$3 = r4;
                                this.f$4 = r5;
                            }

                            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                                C47292b.RunnableC47294a.this.m187288a(this.f$1, this.f$2, this.f$3, this.f$4, valueAnimator);
                            }
                        });
                        ofInt.start();
                    }
                }
            }
        }

        private RunnableC47294a() {
        }

        /* access modifiers changed from: private */
        /* access modifiers changed from: public */
        /* renamed from: a */
        private /* synthetic */ void m187288a(RecyclerView.ViewHolder viewHolder, int i, RecyclerView.Adapter adapter, ValueAnimator valueAnimator, ValueAnimator valueAnimator2) {
            int adapterPosition = viewHolder.getAdapterPosition();
            if (i != adapterPosition && adapterPosition >= 0) {
                AbstractC58983c cVar = (AbstractC58983c) adapter;
                if (adapterPosition < cVar.getItemCount()) {
                    if (!C47292b.this.f119280c.isItemsEquals(this.f119282a, cVar.mo31276a(adapterPosition))) {
                        valueAnimator.cancel();
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public C47292b mo166246a(AbstractC47291a aVar) {
        this.f119279b = aVar;
        return this;
    }

    public C47292b(RecyclerView recyclerView, AbstractC47296b bVar) {
        this.f119278a = recyclerView;
        if (bVar == null) {
            this.f119280c = $$Lambda$83r0STn5evuWOAGS00R0gPkRrDI.INSTANCE;
        } else {
            this.f119280c = bVar;
        }
    }
}
