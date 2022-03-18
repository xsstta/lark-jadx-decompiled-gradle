package com.ss.lark.android.passport.biz.base.p3208a;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.view.View;
import android.view.ViewGroup;
import com.huawei.hms.location.LocationRequest;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* renamed from: com.ss.lark.android.passport.biz.base.a.a */
public class C64343a {

    /* renamed from: a */
    private List<View> f162592a = new ArrayList();

    /* renamed from: b */
    private int f162593b = 0;

    /* renamed from: c */
    private int f162594c = LocationRequest.PRIORITY_HD_ACCURACY;

    /* renamed from: a */
    public void mo222863a() {
        m252960a(0, this.f162593b);
    }

    /* renamed from: b */
    public void mo222864b() {
        m252960a(this.f162593b, 0);
    }

    /* renamed from: com.ss.lark.android.passport.biz.base.a.a$a */
    public static class C64344a {

        /* renamed from: a */
        private ViewGroup f162595a;

        /* renamed from: b */
        private Set<View> f162596b = new HashSet();

        /* renamed from: c */
        private int f162597c;

        /* renamed from: a */
        public C64343a mo222867a() {
            ArrayList arrayList = new ArrayList();
            ViewGroup viewGroup = this.f162595a;
            if (viewGroup == null) {
                return new C64343a(arrayList, this.f162597c);
            }
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = this.f162595a.getChildAt(i);
                if (!this.f162596b.contains(childAt)) {
                    arrayList.add(childAt);
                }
            }
            return new C64343a(arrayList, this.f162597c);
        }

        /* renamed from: a */
        public C64344a mo222865a(int i) {
            this.f162597c = i;
            return this;
        }

        /* renamed from: a */
        public C64344a mo222866a(ViewGroup viewGroup) {
            this.f162595a = viewGroup;
            return this;
        }
    }

    C64343a(List<View> list, int i) {
        this.f162592a = list;
        this.f162593b = i;
    }

    /* renamed from: a */
    private void m252960a(int i, int i2) {
        AnimatorSet animatorSet = new AnimatorSet();
        ArrayList arrayList = new ArrayList();
        for (View view : this.f162592a) {
            arrayList.add(ObjectAnimator.ofFloat(view, "translationY", (float) i, (float) i2));
        }
        animatorSet.playTogether(arrayList);
        animatorSet.setDuration((long) this.f162594c);
        animatorSet.start();
    }
}
