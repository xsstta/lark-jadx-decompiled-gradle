package com.lynx.tasm.animation.p1219c;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ArgbEvaluator;
import android.animation.FloatEvaluator;
import android.animation.ValueAnimator;
import android.os.Build;
import android.util.DisplayMetrics;
import android.util.SparseArray;
import com.huawei.hms.feature.dynamic.DynamicModule;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.lynx.react.bridge.ReadableArray;
import com.lynx.react.bridge.ReadableMap;
import com.lynx.tasm.animation.AnimationConstant;
import com.lynx.tasm.animation.C26562a;
import com.lynx.tasm.animation.C26570b;
import com.lynx.tasm.animation.C26584c;
import com.lynx.tasm.behavior.C26697s;
import com.lynx.tasm.behavior.ui.LynxBaseUI;
import com.lynx.tasm.behavior.ui.LynxUI;
import com.lynx.tasm.behavior.ui.UIShadowProxy;
import com.lynx.tasm.behavior.ui.utils.C26834g;
import com.lynx.tasm.p1216a.C26546b;
import com.ss.ttm.player.MediaPlayer;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.lynx.tasm.animation.c.a */
public class C26585a {

    /* renamed from: a */
    public boolean f65786a;

    /* renamed from: b */
    public final List<Animator> f65787b;

    /* renamed from: c */
    private boolean f65788c;

    /* renamed from: d */
    private final LynxBaseUI f65789d;

    /* renamed from: e */
    private ValueAnimator f65790e;

    /* renamed from: f */
    private final SparseArray<C26562a> f65791f = new SparseArray<>();

    /* renamed from: g */
    private boolean f65792g;

    /* renamed from: a */
    public void mo94456a() {
        this.f65792g = true;
    }

    /* renamed from: b */
    public boolean mo94462b() {
        return this.f65792g;
    }

    /* access modifiers changed from: private */
    /* renamed from: com.lynx.tasm.animation.c.a$a */
    public static class C26595a extends AnimatorListenerAdapter {

        /* renamed from: a */
        private static final Map<String, Object> f65853a;

        /* renamed from: g */
        WeakReference<LynxBaseUI> f65854g;

        /* renamed from: h */
        int f65855h;

        static {
            HashMap hashMap = new HashMap();
            f65853a = hashMap;
            hashMap.put("animation_type", "transition");
        }

        public void onAnimationRepeat(Animator animator) {
            super.onAnimationRepeat(animator);
        }

        public void onAnimationStart(Animator animator) {
            super.onAnimationStart(animator);
        }

        public void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            LynxBaseUI lynxBaseUI = this.f65854g.get();
            if (lynxBaseUI != null) {
                if (lynxBaseUI instanceof UIShadowProxy) {
                    lynxBaseUI = ((UIShadowProxy) lynxBaseUI).mo53300d();
                }
                m96399a(lynxBaseUI, C26584c.m96385a(this.f65855h));
            }
        }

        public C26595a(LynxBaseUI lynxBaseUI, int i) {
            this.f65854g = new WeakReference<>(lynxBaseUI);
            this.f65855h = i;
        }

        /* renamed from: a */
        public static void m96399a(LynxBaseUI lynxBaseUI, String str) {
            if (lynxBaseUI != null && lynxBaseUI.mo94578s() != null && lynxBaseUI.mo94578s().containsKey("transitionend")) {
                Map<String, Object> map = f65853a;
                map.put("animation_type", "transition-" + str);
                lynxBaseUI.mo95039u().mo94687i().mo94075a(new C26546b(lynxBaseUI.mo94576q(), "transitionend", map));
            }
        }
    }

    /* renamed from: e */
    private void m96389e() {
        for (Animator animator : new ArrayList(this.f65787b)) {
            animator.end();
        }
        this.f65787b.clear();
        ValueAnimator valueAnimator = this.f65790e;
        if (valueAnimator != null) {
            valueAnimator.end();
        }
    }

    /* renamed from: c */
    public boolean mo94463c() {
        if (this.f65791f.size() == 0 || (!m96388b(DynamicModule.f58006b) && !m96388b(1024) && !m96388b(MediaPlayer.MEDIA_PLAYER_OPTION_APPID) && !m96388b(2048) && !m96388b(16) && !m96388b(32))) {
            return false;
        }
        return true;
    }

    /* renamed from: d */
    public boolean mo94464d() {
        for (Animator animator : this.f65787b) {
            if (animator.isRunning()) {
                return true;
            }
        }
        ValueAnimator valueAnimator = this.f65790e;
        if (valueAnimator == null || !valueAnimator.isRunning()) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public static boolean m96387a(C26697s sVar) {
        return sVar.mo94775a("transition");
    }

    /* renamed from: b */
    private boolean m96388b(int i) {
        if (this.f65791f.indexOfKey(i) >= 0) {
            return true;
        }
        return false;
    }

    public C26585a(LynxBaseUI lynxBaseUI) {
        this.f65789d = lynxBaseUI;
        this.f65787b = new ArrayList();
        this.f65792g = false;
    }

    /* renamed from: a */
    public boolean mo94458a(int i) {
        if (this.f65791f.size() == 0 || this.f65791f.get(i) == null) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    public void mo94461b(ReadableMap readableMap) {
        if (readableMap == null || readableMap.getArray("transition") == null) {
            m96389e();
        }
    }

    /* renamed from: a */
    public boolean mo94459a(ReadableMap readableMap) {
        if (readableMap == null) {
            return false;
        }
        ReadableArray array = readableMap.getArray("transition");
        if (array == null) {
            m96389e();
            return false;
        }
        int i = 0;
        while (true) {
            if (i >= array.size()) {
                break;
            }
            ReadableArray array2 = array.getArray(i);
            int i2 = array2.getInt(0);
            if (i2 == 0) {
                m96389e();
                return false;
            }
            C26562a aVar = new C26562a();
            aVar.mo94375a(i2);
            aVar.mo94376a((long) array2.getDouble(1));
            aVar.mo94381b((long) array2.getDouble(aVar.mo94372a(array2, 2)));
            if (aVar.mo94385d() == 8177) {
                this.f65791f.clear();
                int[] iArr = AnimationConstant.f65677a;
                for (int i3 : iArr) {
                    C26562a aVar2 = new C26562a(aVar);
                    aVar2.mo94375a(i3);
                    this.f65791f.put(aVar2.mo94385d(), aVar2);
                }
            } else {
                this.f65791f.put(aVar.mo94385d(), aVar);
                i++;
            }
        }
        if (this.f65791f.size() != 0) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public boolean mo94460a(LynxBaseUI lynxBaseUI, final int i, Object obj) {
        final LynxBaseUI lynxBaseUI2;
        final LynxUI lynxUI;
        final LynxUI lynxUI2;
        final int i2;
        final LynxUI lynxUI3;
        if (this.f65791f.size() == 0 || this.f65791f.get(i) == null) {
            return false;
        }
        LynxBaseUI lynxBaseUI3 = this.f65789d;
        if (lynxBaseUI3 != null) {
            lynxBaseUI2 = lynxBaseUI3;
        } else {
            lynxBaseUI2 = lynxBaseUI;
        }
        C26562a aVar = this.f65791f.get(i);
        float f = 1.0f;
        if (i != 1) {
            if (i == 64) {
                final int intValue = ((Integer) obj).intValue();
                ValueAnimator ofObject = ValueAnimator.ofObject(new ArgbEvaluator(), Integer.valueOf(lynxBaseUI2.mo94918A().mo95536d()), Integer.valueOf(intValue));
                this.f65787b.add(ofObject);
                ofObject.setDuration((long) Math.round((float) aVar.mo94378b()));
                ofObject.setInterpolator(C26570b.m96358a(aVar));
                ofObject.setStartDelay(aVar.mo94382c());
                ofObject.addListener(new C26595a(i, lynxBaseUI2) {
                    /* class com.lynx.tasm.animation.p1219c.C26585a.C265861 */

                    @Override // com.lynx.tasm.animation.p1219c.C26585a.C26595a
                    public void onAnimationEnd(Animator animator) {
                        super.onAnimationEnd(animator);
                        lynxBaseUI2.mo94918A().mo95523a(intValue);
                        lynxBaseUI2.mo95041w();
                        C26585a.this.f65787b.remove(animator);
                    }
                });
                ofObject.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                    /* class com.lynx.tasm.animation.p1219c.C26585a.C265916 */

                    public void onAnimationUpdate(ValueAnimator valueAnimator) {
                        Object animatedValue = valueAnimator.getAnimatedValue();
                        if (animatedValue != null) {
                            lynxBaseUI2.mo94918A().mo95523a(((Integer) animatedValue).intValue());
                            lynxBaseUI2.mo95041w();
                        }
                    }
                });
                ofObject.start();
                return false;
            } else if (i != 128) {
                if (i != 4096 || !(lynxBaseUI2 instanceof LynxUI)) {
                    return false;
                }
                if (lynxBaseUI2.mo94920C() instanceof UIShadowProxy) {
                    lynxUI3 = (LynxUI) lynxBaseUI2.mo94920C();
                } else {
                    lynxUI3 = (LynxUI) lynxBaseUI2;
                }
                final C26834g a = C26834g.m97548a((List) obj, lynxUI3.mo95039u().mo94692n().ad(), lynxUI3.ad(), (float) lynxUI3.mo95039u().mo94692n().mo94937T(), (float) lynxUI3.mo95039u().mo94692n().mo94938U(), (float) lynxUI3.mo94937T(), (float) lynxUI3.mo94938U());
                if (a == null) {
                    return false;
                }
                final float G = lynxUI3.mo94924G();
                final float H = lynxUI3.mo94925H();
                final float I = lynxUI3.mo94926I();
                final float rotation = lynxUI3.av().getRotation();
                final float rotationX = lynxUI3.av().getRotationX();
                final float rotationY = lynxUI3.av().getRotationY();
                final float scaleX = lynxUI3.av().getScaleX();
                final float scaleY = lynxUI3.av().getScaleY();
                ValueAnimator ofInt = ValueAnimator.ofInt(0);
                this.f65787b.add(ofInt);
                ofInt.setDuration(aVar.mo94378b());
                ofInt.setInterpolator(C26570b.m96358a(aVar));
                ofInt.setStartDelay(aVar.mo94382c());
                ofInt.addListener(new C26595a(i, lynxUI3) {
                    /* class com.lynx.tasm.animation.p1219c.C26585a.C265927 */

                    @Override // com.lynx.tasm.animation.p1219c.C26585a.C26595a
                    public void onAnimationEnd(Animator animator) {
                        super.onAnimationEnd(animator);
                        lynxUI3.av().setTranslationX(a.mo95559b());
                        lynxUI3.av().setTranslationY(a.mo95562c());
                        if (Build.VERSION.SDK_INT >= 21) {
                            lynxUI3.av().setTranslationZ(a.mo95564d());
                        }
                        lynxUI3.av().setRotation(a.mo95566e());
                        lynxUI3.av().setRotationY(a.mo95568f());
                        lynxUI3.av().setScaleX(a.mo95572h());
                        lynxUI3.av().setScaleY(a.mo95574i());
                        C26585a.this.f65787b.remove(animator);
                    }
                });
                ofInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                    /* class com.lynx.tasm.animation.p1219c.C26585a.C265938 */

                    public void onAnimationUpdate(ValueAnimator valueAnimator) {
                        float animatedFraction = valueAnimator.getAnimatedFraction();
                        DisplayMetrics b = lynxUI3.mo95039u().mo94672b();
                        float a = a.mo95553a((float) lynxUI3.mo94937T(), b);
                        float f = G;
                        if (a != f) {
                            lynxUI3.av().setTranslationX(f + ((a.mo95553a((float) lynxUI3.mo94937T(), b) - G) * animatedFraction));
                        }
                        float b2 = a.mo95560b((float) lynxUI3.mo94938U(), b);
                        float f2 = H;
                        if (b2 != f2) {
                            lynxUI3.av().setTranslationY(f2 + ((a.mo95560b((float) lynxUI3.mo94938U(), b) - H) * animatedFraction));
                        }
                        float d = a.mo95564d();
                        float f3 = I;
                        if (d != f3) {
                            float d2 = f3 + ((a.mo95564d() - I) * animatedFraction);
                            if (Build.VERSION.SDK_INT >= 21) {
                                lynxUI3.av().setTranslationZ(d2);
                            }
                        }
                        float e = a.mo95566e();
                        float f4 = rotation;
                        if (e != f4) {
                            lynxUI3.av().setRotation(f4 + ((a.mo95566e() - rotation) * animatedFraction));
                        }
                        float f5 = a.mo95568f();
                        float f6 = rotationX;
                        if (f5 != f6) {
                            lynxUI3.av().setRotation(f6 + ((a.mo95568f() - rotationX) * animatedFraction));
                        }
                        float g = a.mo95570g();
                        float f7 = rotationY;
                        if (g != f7) {
                            lynxUI3.av().setRotationY(f7 + ((a.mo95570g() - rotationY) * animatedFraction));
                        }
                        float h = a.mo95572h();
                        float f8 = scaleX;
                        if (h != f8) {
                            lynxUI3.av().setScaleX(f8 + ((a.mo95572h() - scaleX) * animatedFraction));
                        }
                        float i = a.mo95574i();
                        float f9 = scaleY;
                        if (i != f9) {
                            lynxUI3.av().setScaleY(f9 + (animatedFraction * (a.mo95574i() - scaleY)));
                        }
                    }
                });
                ofInt.start();
                return false;
            } else if (this.f65788c) {
                return false;
            } else {
                ValueAnimator valueAnimator = this.f65790e;
                if (valueAnimator != null) {
                    if (valueAnimator.isRunning()) {
                        this.f65790e.end();
                    }
                    this.f65790e = null;
                }
                if (lynxBaseUI2.mo94920C() instanceof UIShadowProxy) {
                    lynxUI2 = (LynxUI) lynxBaseUI2.mo94920C();
                } else {
                    lynxUI2 = (LynxUI) lynxBaseUI2;
                }
                int intValue2 = ((Integer) obj).intValue();
                int visibility = lynxUI2.av().getVisibility();
                if (intValue2 == 1) {
                    i2 = 0;
                } else {
                    i2 = 4;
                }
                if (visibility == i2) {
                    return false;
                }
                this.f65786a = true;
                final float alpha = lynxUI2.av().getAlpha();
                float f2 = BitmapDescriptorFactory.HUE_RED;
                if (visibility == 0 && (i2 == 4 || i2 == 8)) {
                    f2 = alpha;
                    f = BitmapDescriptorFactory.HUE_RED;
                } else if ((visibility == 4 || visibility == 8) && i2 == 0) {
                    lynxUI2.av().setAlpha(BitmapDescriptorFactory.HUE_RED);
                } else {
                    f2 = alpha;
                }
                ValueAnimator ofObject2 = ValueAnimator.ofObject(new FloatEvaluator(), Float.valueOf(f2), Float.valueOf(f));
                this.f65790e = ofObject2;
                ofObject2.setDuration(aVar.mo94378b());
                this.f65790e.setInterpolator(C26570b.m96358a(aVar));
                this.f65790e.setStartDelay(aVar.mo94382c());
                this.f65790e.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                    /* class com.lynx.tasm.animation.p1219c.C26585a.AnonymousClass11 */

                    public void onAnimationUpdate(ValueAnimator valueAnimator) {
                        Object animatedValue = valueAnimator.getAnimatedValue();
                        if (animatedValue != null) {
                            lynxUI2.av().setAlpha(((Float) animatedValue).floatValue());
                        }
                    }
                });
                this.f65790e.addListener(new C26595a(lynxBaseUI2, i) {
                    /* class com.lynx.tasm.animation.p1219c.C26585a.AnonymousClass12 */

                    public void onAnimationCancel(Animator animator) {
                        super.onAnimationCancel(animator);
                        C26585a.this.f65786a = false;
                    }

                    @Override // com.lynx.tasm.animation.p1219c.C26585a.C26595a
                    public void onAnimationStart(Animator animator) {
                        super.onAnimationStart(animator);
                        lynxUI2.av().setVisibility(0);
                        C26585a.this.f65786a = false;
                    }

                    @Override // com.lynx.tasm.animation.p1219c.C26585a.C26595a
                    public void onAnimationEnd(Animator animator) {
                        super.onAnimationEnd(animator);
                        C26595a.m96399a(lynxBaseUI2, C26584c.m96385a(i));
                        lynxUI2.mo95075i(i2);
                        lynxUI2.av().setAlpha(alpha);
                    }
                });
                this.f65790e.start();
                return false;
            }
        } else if (this.f65786a) {
            return false;
        } else {
            final float min = Math.min(((Float) obj).floatValue(), 1.0f);
            if (lynxBaseUI2.mo94920C() instanceof UIShadowProxy) {
                lynxUI = (LynxUI) lynxBaseUI2.mo94920C();
            } else {
                lynxUI = (LynxUI) lynxBaseUI2;
            }
            if (min == lynxUI.av().getAlpha()) {
                return false;
            }
            ValueAnimator ofObject3 = ValueAnimator.ofObject(new FloatEvaluator(), Float.valueOf(lynxUI.av().getAlpha()), Float.valueOf(min));
            this.f65787b.add(ofObject3);
            ofObject3.setDuration(aVar.mo94378b());
            ofObject3.setInterpolator(C26570b.m96358a(aVar));
            ofObject3.setStartDelay(aVar.mo94382c());
            ofObject3.addListener(new C26595a(i, lynxUI) {
                /* class com.lynx.tasm.animation.p1219c.C26585a.C265949 */

                @Override // com.lynx.tasm.animation.p1219c.C26585a.C26595a
                public void onAnimationEnd(Animator animator) {
                    super.onAnimationEnd(animator);
                    lynxUI.av().setAlpha(min);
                    C26585a.this.f65787b.remove(animator);
                }
            });
            ofObject3.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                /* class com.lynx.tasm.animation.p1219c.C26585a.AnonymousClass10 */

                public void onAnimationUpdate(ValueAnimator valueAnimator) {
                    Object animatedValue = valueAnimator.getAnimatedValue();
                    if (animatedValue != null) {
                        lynxUI.av().setAlpha(((Float) animatedValue).floatValue());
                    }
                }
            });
            this.f65788c = true;
            ofObject3.start();
            return false;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0046, code lost:
        if (r3 != 2048) goto L_0x006c;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private android.animation.ValueAnimator m96386a(int r3, final com.lynx.tasm.behavior.ui.LynxBaseUI r4, int r5, int r6, com.lynx.tasm.animation.C26562a r7, boolean r8) {
        /*
        // Method dump skipped, instructions count: 109
        */
        throw new UnsupportedOperationException("Method not decompiled: com.lynx.tasm.animation.p1219c.C26585a.m96386a(int, com.lynx.tasm.behavior.ui.LynxBaseUI, int, int, com.lynx.tasm.animation.a, boolean):android.animation.ValueAnimator");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:71:0x0125, code lost:
        if (r0 != r6) goto L_0x0127;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo94457a(com.lynx.tasm.behavior.ui.LynxBaseUI r43, final int r44, final int r45, final int r46, final int r47, final int r48, final int r49, final int r50, final int r51, final int r52, final int r53, final int r54, final int r55, final int r56, final int r57, final int r58, final int r59, final android.graphics.Rect r60) {
        /*
        // Method dump skipped, instructions count: 684
        */
        throw new UnsupportedOperationException("Method not decompiled: com.lynx.tasm.animation.p1219c.C26585a.mo94457a(com.lynx.tasm.behavior.ui.LynxBaseUI, int, int, int, int, int, int, int, int, int, int, int, int, int, int, int, int, android.graphics.Rect):void");
    }
}
