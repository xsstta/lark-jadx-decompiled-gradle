package com.ss.android.lark.chat.base.view.recycleview;

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
import com.ss.android.lark.chat.base.view.recycleview.C32940b;
import com.ss.android.lark.chat.base.view.recycleview.C32944d;
import com.ss.android.lark.widget.recyclerview.AbstractC58983c;

/* renamed from: com.ss.android.lark.chat.base.view.recycleview.b */
public class C32940b<T extends RecyclerView.Adapter & AbstractC58983c> implements IShineAnimator {

    /* renamed from: a */
    public T f84652a;

    /* renamed from: b */
    public RecyclerView.ViewHolder f84653b;

    /* renamed from: c */
    public View f84654c;

    /* renamed from: d */
    public int f84655d;

    /* renamed from: e */
    public Object f84656e;

    /* renamed from: f */
    public int f84657f;

    /* renamed from: g */
    public int f84658g;

    /* renamed from: h */
    public C32944d.AbstractC32948b f84659h;

    /* renamed from: i */
    private Drawable f84660i;

    /* renamed from: j */
    private boolean f84661j;

    /* renamed from: k */
    private RecyclerView f84662k;

    /* renamed from: l */
    private AbstractC32943c<T> f84663l;

    /* renamed from: m */
    private int f84664m = 100;

    /* access modifiers changed from: private */
    /* renamed from: d */
    public /* synthetic */ void m126863d() {
        this.f84654c.setBackgroundColor(this.f84658g);
    }

    @Override // com.ss.android.lark.chat.base.view.recycleview.IShineAnimator
    /* renamed from: a */
    public void mo121646a() {
        m126862c();
        View view = this.f84654c;
        if (view != null) {
            view.postDelayed(new Runnable() {
                /* class com.ss.android.lark.chat.base.view.recycleview.$$Lambda$b$N7vE4lV6AlyjQWpdF4HEhujwrtk */

                public final void run() {
                    C32940b.this.m126863d();
                }
            }, (long) this.f84664m);
            this.f84661j = false;
        }
    }

    @Override // com.ss.android.lark.chat.base.view.recycleview.IShineAnimator
    /* renamed from: b */
    public void mo121647b() {
        if (!this.f84661j) {
            this.f84662k.post(new RunnableC32942a());
            this.f84661j = true;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.lark.chat.base.view.recycleview.b$a */
    public class RunnableC32942a implements Runnable {
        /* access modifiers changed from: private */
        /* renamed from: a */
        public static /* synthetic */ float m126866a(float f) {
            return ((double) f) <= 0.5d ? BitmapDescriptorFactory.HUE_RED : (f * 2.0f) - 1.0f;
        }

        public void run() {
            int i;
            if (C32940b.this.f84652a != null && C32940b.this.f84653b != null && C32940b.this.f84654c != null && C32940b.this.f84656e != null) {
                Animation animation = C32940b.this.f84654c.getAnimation();
                if (animation != null) {
                    animation.cancel();
                }
                if (C32940b.this.f84657f == 0) {
                    i = C25653b.m91894a(C32940b.this.f84654c.getContext(), R.color.ud_Y100, BitmapDescriptorFactory.HUE_RED);
                } else {
                    i = C32940b.this.f84657f;
                }
                ObjectAnimator ofInt = ObjectAnimator.ofInt(C32940b.this.f84654c, "backgroundColor", C32940b.this.f84658g, i);
                ofInt.setDuration(1000L);
                ofInt.setInterpolator($$Lambda$b$a$luQNgS4sKonbEDnXFxfH_C6wW0.INSTANCE);
                ofInt.setEvaluator(new ArgbEvaluator());
                ofInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(ofInt) {
                    /* class com.ss.android.lark.chat.base.view.recycleview.$$Lambda$b$a$vT3yUt_mXA7FYZeGjPd4nyyeEtQ */
                    public final /* synthetic */ ValueAnimator f$1;

                    {
                        this.f$1 = r2;
                    }

                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        C32940b.RunnableC32942a.this.m126867a(this.f$1, valueAnimator);
                    }
                });
                ofInt.start();
            }
        }

        private RunnableC32942a() {
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public /* synthetic */ void m126867a(ValueAnimator valueAnimator, ValueAnimator valueAnimator2) {
            int adapterPosition = C32940b.this.f84653b.getAdapterPosition();
            if (C32940b.this.f84655d != adapterPosition && adapterPosition >= 0 && adapterPosition < C32940b.this.f84652a.getItemCount()) {
                if (!C32940b.this.f84659h.isItemsEquals(C32940b.this.f84656e, C32940b.this.f84652a.mo31276a(adapterPosition))) {
                    valueAnimator.cancel();
                }
            }
        }
    }

    /* renamed from: c */
    private void m126862c() {
        T t = (T) this.f84662k.getAdapter();
        this.f84652a = t;
        if (t != null) {
            int targetItemPosition = this.f84663l.getTargetItemPosition(t);
            this.f84655d = targetItemPosition;
            if (targetItemPosition >= 0 && targetItemPosition < this.f84652a.getItemCount()) {
                Object a = this.f84652a.mo31276a(this.f84655d);
                this.f84656e = a;
                if (a != null) {
                    RecyclerView.ViewHolder findViewHolderForAdapterPosition = this.f84662k.findViewHolderForAdapterPosition(this.f84655d);
                    this.f84653b = findViewHolderForAdapterPosition;
                    if (findViewHolderForAdapterPosition != null) {
                        View view = findViewHolderForAdapterPosition.itemView;
                        this.f84654c = view;
                        Drawable background = view.getBackground();
                        this.f84660i = background;
                        if (background != null && (background instanceof ColorDrawable)) {
                            this.f84657f = ((ColorDrawable) background).getColor();
                        }
                        this.f84658g = C25653b.m91894a(this.f84654c.getContext(), R.color.ud_Y100, 1.0f);
                    }
                }
            }
        }
    }

    public C32940b(RecyclerView recyclerView, AbstractC32943c cVar, C32944d.AbstractC32948b bVar, int i) {
        this.f84662k = recyclerView;
        this.f84663l = cVar;
        this.f84659h = bVar;
        this.f84664m = i;
    }
}
