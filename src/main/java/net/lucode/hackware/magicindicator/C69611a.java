package net.lucode.hackware.magicindicator;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.Interpolator;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import java.util.ArrayList;
import java.util.List;
import net.lucode.hackware.magicindicator.buildins.commonnavigator.p3484c.C69626a;

/* renamed from: net.lucode.hackware.magicindicator.a */
public class C69611a {

    /* renamed from: a */
    public ValueAnimator f174012a;

    /* renamed from: b */
    private List<MagicIndicator> f174013b = new ArrayList();

    /* renamed from: c */
    private int f174014c;

    /* renamed from: d */
    private int f174015d = 150;

    /* renamed from: e */
    private Interpolator f174016e = new AccelerateDecelerateInterpolator();

    /* renamed from: f */
    private Animator.AnimatorListener f174017f = new AnimatorListenerAdapter() {
        /* class net.lucode.hackware.magicindicator.C69611a.C696121 */

        public void onAnimationEnd(Animator animator) {
            C69611a.this.mo243178a(0);
            C69611a.this.f174012a = null;
        }
    };

    /* renamed from: g */
    private ValueAnimator.AnimatorUpdateListener f174018g = new ValueAnimator.AnimatorUpdateListener() {
        /* class net.lucode.hackware.magicindicator.C69611a.C696132 */

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            int i = (int) floatValue;
            float f = floatValue - ((float) i);
            if (floatValue < BitmapDescriptorFactory.HUE_RED) {
                i--;
                f += 1.0f;
            }
            C69611a.this.mo243179a(i, f, 0);
        }
    };

    /* renamed from: a */
    public void mo243181a(MagicIndicator magicIndicator) {
        this.f174013b.add(magicIndicator);
    }

    /* renamed from: b */
    private void m267389b(int i) {
        for (MagicIndicator magicIndicator : this.f174013b) {
            magicIndicator.mo243173a(i);
        }
    }

    /* renamed from: a */
    public void mo243178a(int i) {
        for (MagicIndicator magicIndicator : this.f174013b) {
            magicIndicator.mo243175b(i);
        }
    }

    /* renamed from: a */
    public static C69626a m267388a(List<C69626a> list, int i) {
        C69626a aVar;
        if (i >= 0 && i <= list.size() - 1) {
            return list.get(i);
        }
        C69626a aVar2 = new C69626a();
        if (i < 0) {
            aVar = list.get(0);
        } else {
            i = (i - list.size()) + 1;
            aVar = list.get(list.size() - 1);
        }
        aVar2.f174062a = aVar.f174062a + (aVar.mo243243a() * i);
        aVar2.f174063b = aVar.f174063b;
        aVar2.f174064c = aVar.f174064c + (aVar.mo243243a() * i);
        aVar2.f174065d = aVar.f174065d;
        aVar2.f174066e = aVar.f174066e + (aVar.mo243243a() * i);
        aVar2.f174067f = aVar.f174067f;
        aVar2.f174068g = aVar.f174068g + (i * aVar.mo243243a());
        aVar2.f174069h = aVar.f174069h;
        return aVar2;
    }

    /* renamed from: a */
    public void mo243180a(int i, boolean z) {
        if (this.f174014c != i) {
            if (z) {
                ValueAnimator valueAnimator = this.f174012a;
                if (valueAnimator == null || !valueAnimator.isRunning()) {
                    mo243178a(2);
                }
                m267389b(i);
                float f = (float) this.f174014c;
                ValueAnimator valueAnimator2 = this.f174012a;
                if (valueAnimator2 != null) {
                    f = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                    this.f174012a.cancel();
                    this.f174012a = null;
                }
                ValueAnimator valueAnimator3 = new ValueAnimator();
                this.f174012a = valueAnimator3;
                valueAnimator3.setFloatValues(f, (float) i);
                this.f174012a.addUpdateListener(this.f174018g);
                this.f174012a.addListener(this.f174017f);
                this.f174012a.setInterpolator(this.f174016e);
                this.f174012a.setDuration((long) this.f174015d);
                this.f174012a.start();
            } else {
                m267389b(i);
                ValueAnimator valueAnimator4 = this.f174012a;
                if (valueAnimator4 != null && valueAnimator4.isRunning()) {
                    mo243179a(this.f174014c, BitmapDescriptorFactory.HUE_RED, 0);
                }
                mo243178a(0);
                mo243179a(i, BitmapDescriptorFactory.HUE_RED, 0);
            }
            this.f174014c = i;
        }
    }

    /* renamed from: a */
    public void mo243179a(int i, float f, int i2) {
        for (MagicIndicator magicIndicator : this.f174013b) {
            magicIndicator.mo243174a(i, f, i2);
        }
    }
}
