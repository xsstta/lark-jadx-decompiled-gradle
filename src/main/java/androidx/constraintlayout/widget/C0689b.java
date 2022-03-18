package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.util.Xml;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.motion.p024a.C0530c;
import androidx.constraintlayout.motion.widget.C0547a;
import androidx.constraintlayout.solver.widgets.C0673h;
import androidx.constraintlayout.solver.widgets.ConstraintWidget;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Constraints;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.android.HwBuildEx;
import com.huawei.hms.location.ActivityIdentificationData;
import com.huawei.hms.location.LocationRequest;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.suite.R;
import com.ss.android.lark.calendar.impl.features.search.result.CalendarSearchResultRv;
import com.ss.android.lark.mm.module.list.control.MmListControl;
import com.ss.android.vc.meeting.framework.statemachine.SmEvents;
import com.ss.ttvideoengine.TTVideoEngine;
import com.ss.ttvideoengine.log.IVideoEventLogger;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import org.xmlpull.v1.XmlPullParserException;

/* renamed from: androidx.constraintlayout.widget.b */
public class C0689b {

    /* renamed from: a */
    public static final int[] f2867a = {0, 4, 8};

    /* renamed from: f */
    private static SparseIntArray f2868f;

    /* renamed from: b */
    private boolean f2869b;

    /* renamed from: c */
    private HashMap<String, ConstraintAttribute> f2870c = new HashMap<>();

    /* renamed from: d */
    private boolean f2871d = true;

    /* renamed from: e */
    private HashMap<Integer, C0690a> f2872e = new HashMap<>();

    /* renamed from: h */
    private String m3393h(int i) {
        switch (i) {
            case 1:
                return "left";
            case 2:
                return "right";
            case 3:
                return "top";
            case 4:
                return "bottom";
            case 5:
                return "baseline";
            case 6:
                return "start";
            case 7:
                return "end";
            default:
                return "undefined";
        }
    }

    /* renamed from: a */
    public void mo3894a(C0689b bVar) {
        for (Integer num : bVar.f2872e.keySet()) {
            int intValue = num.intValue();
            C0690a aVar = bVar.f2872e.get(num);
            if (!this.f2872e.containsKey(Integer.valueOf(intValue))) {
                this.f2872e.put(Integer.valueOf(intValue), new C0690a());
            }
            C0690a aVar2 = this.f2872e.get(Integer.valueOf(intValue));
            if (!aVar2.f2876d.f2906b) {
                aVar2.f2876d.mo3918a(aVar.f2876d);
            }
            if (!aVar2.f2874b.f2939a) {
                aVar2.f2874b.mo3922a(aVar.f2874b);
            }
            if (!aVar2.f2877e.f2945a) {
                aVar2.f2877e.mo3924a(aVar.f2877e);
            }
            if (!aVar2.f2875c.f2932a) {
                aVar2.f2875c.mo3920a(aVar.f2875c);
            }
            for (String str : aVar.f2878f.keySet()) {
                if (!aVar2.f2878f.containsKey(str)) {
                    aVar2.f2878f.put(str, aVar.f2878f.get(str));
                }
            }
        }
    }

    /* renamed from: a */
    public void mo3891a(ConstraintLayout constraintLayout) {
        int childCount = constraintLayout.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = constraintLayout.getChildAt(i);
            ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) childAt.getLayoutParams();
            int id = childAt.getId();
            if (!this.f2871d || id != -1) {
                if (!this.f2872e.containsKey(Integer.valueOf(id))) {
                    this.f2872e.put(Integer.valueOf(id), new C0690a());
                }
                C0690a aVar = this.f2872e.get(Integer.valueOf(id));
                if (!aVar.f2876d.f2906b) {
                    aVar.mo3912a(id, layoutParams);
                    if (childAt instanceof ConstraintHelper) {
                        aVar.f2876d.ae = ((ConstraintHelper) childAt).getReferencedIds();
                        if (childAt instanceof Barrier) {
                            Barrier barrier = (Barrier) childAt;
                            aVar.f2876d.aj = barrier.mo3787a();
                            aVar.f2876d.ab = barrier.getType();
                            aVar.f2876d.ac = barrier.getMargin();
                        }
                    }
                    aVar.f2876d.f2906b = true;
                }
                if (!aVar.f2874b.f2939a) {
                    aVar.f2874b.f2940b = childAt.getVisibility();
                    aVar.f2874b.f2942d = childAt.getAlpha();
                    aVar.f2874b.f2939a = true;
                }
                if (Build.VERSION.SDK_INT >= 17 && !aVar.f2877e.f2945a) {
                    aVar.f2877e.f2945a = true;
                    aVar.f2877e.f2946b = childAt.getRotation();
                    aVar.f2877e.f2947c = childAt.getRotationX();
                    aVar.f2877e.f2948d = childAt.getRotationY();
                    aVar.f2877e.f2949e = childAt.getScaleX();
                    aVar.f2877e.f2950f = childAt.getScaleY();
                    float pivotX = childAt.getPivotX();
                    float pivotY = childAt.getPivotY();
                    if (!(((double) pivotX) == 0.0d && ((double) pivotY) == 0.0d)) {
                        aVar.f2877e.f2951g = pivotX;
                        aVar.f2877e.f2952h = pivotY;
                    }
                    aVar.f2877e.f2953i = childAt.getTranslationX();
                    aVar.f2877e.f2954j = childAt.getTranslationY();
                    if (Build.VERSION.SDK_INT >= 21) {
                        aVar.f2877e.f2955k = childAt.getTranslationZ();
                        if (aVar.f2877e.f2956l) {
                            aVar.f2877e.f2957m = childAt.getElevation();
                        }
                    }
                }
            } else {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
        }
    }

    /* renamed from: a */
    public void mo3888a(Context context, int i) {
        mo3901b((ConstraintLayout) LayoutInflater.from(context).inflate(i, (ViewGroup) null));
    }

    /* renamed from: a */
    public void mo3893a(Constraints constraints) {
        int childCount = constraints.getChildCount();
        this.f2872e.clear();
        for (int i = 0; i < childCount; i++) {
            View childAt = constraints.getChildAt(i);
            Constraints.LayoutParams layoutParams = (Constraints.LayoutParams) childAt.getLayoutParams();
            int id = childAt.getId();
            if (!this.f2871d || id != -1) {
                if (!this.f2872e.containsKey(Integer.valueOf(id))) {
                    this.f2872e.put(Integer.valueOf(id), new C0690a());
                }
                C0690a aVar = this.f2872e.get(Integer.valueOf(id));
                if (childAt instanceof ConstraintHelper) {
                    aVar.mo3914a((ConstraintHelper) childAt, id, layoutParams);
                }
                aVar.mo3913a(id, layoutParams);
            } else {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
        }
    }

    /* renamed from: a */
    public void mo3890a(ConstraintHelper constraintHelper, ConstraintWidget constraintWidget, ConstraintLayout.LayoutParams layoutParams, SparseArray<ConstraintWidget> sparseArray) {
        int id = constraintHelper.getId();
        if (this.f2872e.containsKey(Integer.valueOf(id))) {
            C0690a aVar = this.f2872e.get(Integer.valueOf(id));
            if (constraintWidget instanceof C0673h) {
                constraintHelper.mo3063a(aVar, (C0673h) constraintWidget, layoutParams, sparseArray);
            }
        }
    }

    /* renamed from: a */
    public void mo3886a(int i, ConstraintLayout.LayoutParams layoutParams) {
        if (this.f2872e.containsKey(Integer.valueOf(i))) {
            this.f2872e.get(Integer.valueOf(i)).mo3915a(layoutParams);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo3892a(ConstraintLayout constraintLayout, boolean z) {
        int childCount = constraintLayout.getChildCount();
        HashSet hashSet = new HashSet(this.f2872e.keySet());
        for (int i = 0; i < childCount; i++) {
            View childAt = constraintLayout.getChildAt(i);
            int id = childAt.getId();
            if (!this.f2872e.containsKey(Integer.valueOf(id))) {
                Log.w("ConstraintSet", "id unknown " + C0547a.m2559a(childAt));
            } else if (this.f2871d && id == -1) {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            } else if (id != -1) {
                if (this.f2872e.containsKey(Integer.valueOf(id))) {
                    hashSet.remove(Integer.valueOf(id));
                    C0690a aVar = this.f2872e.get(Integer.valueOf(id));
                    if (childAt instanceof Barrier) {
                        aVar.f2876d.ad = 1;
                    }
                    if (aVar.f2876d.ad != -1 && aVar.f2876d.ad == 1) {
                        Barrier barrier = (Barrier) childAt;
                        barrier.setId(id);
                        barrier.setType(aVar.f2876d.ab);
                        barrier.setMargin(aVar.f2876d.ac);
                        barrier.setAllowsGoneWidget(aVar.f2876d.aj);
                        if (aVar.f2876d.ae != null) {
                            barrier.setReferencedIds(aVar.f2876d.ae);
                        } else if (aVar.f2876d.af != null) {
                            aVar.f2876d.ae = m3391a(barrier, aVar.f2876d.af);
                            barrier.setReferencedIds(aVar.f2876d.ae);
                        }
                    }
                    ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) childAt.getLayoutParams();
                    layoutParams.mo3845b();
                    aVar.mo3915a(layoutParams);
                    if (z) {
                        ConstraintAttribute.m3339a(childAt, aVar.f2878f);
                    }
                    childAt.setLayoutParams(layoutParams);
                    if (aVar.f2874b.f2941c == 0) {
                        childAt.setVisibility(aVar.f2874b.f2940b);
                    }
                    if (Build.VERSION.SDK_INT >= 17) {
                        childAt.setAlpha(aVar.f2874b.f2942d);
                        childAt.setRotation(aVar.f2877e.f2946b);
                        childAt.setRotationX(aVar.f2877e.f2947c);
                        childAt.setRotationY(aVar.f2877e.f2948d);
                        childAt.setScaleX(aVar.f2877e.f2949e);
                        childAt.setScaleY(aVar.f2877e.f2950f);
                        if (!Float.isNaN(aVar.f2877e.f2951g)) {
                            childAt.setPivotX(aVar.f2877e.f2951g);
                        }
                        if (!Float.isNaN(aVar.f2877e.f2952h)) {
                            childAt.setPivotY(aVar.f2877e.f2952h);
                        }
                        childAt.setTranslationX(aVar.f2877e.f2953i);
                        childAt.setTranslationY(aVar.f2877e.f2954j);
                        if (Build.VERSION.SDK_INT >= 21) {
                            childAt.setTranslationZ(aVar.f2877e.f2955k);
                            if (aVar.f2877e.f2956l) {
                                childAt.setElevation(aVar.f2877e.f2957m);
                            }
                        }
                    }
                } else {
                    Log.v("ConstraintSet", "WARNING NO CONSTRAINTS for view " + id);
                }
            }
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            Integer num = (Integer) it.next();
            C0690a aVar2 = this.f2872e.get(num);
            if (aVar2.f2876d.ad != -1 && aVar2.f2876d.ad == 1) {
                Barrier barrier2 = new Barrier(constraintLayout.getContext());
                barrier2.setId(num.intValue());
                if (aVar2.f2876d.ae != null) {
                    barrier2.setReferencedIds(aVar2.f2876d.ae);
                } else if (aVar2.f2876d.af != null) {
                    aVar2.f2876d.ae = m3391a(barrier2, aVar2.f2876d.af);
                    barrier2.setReferencedIds(aVar2.f2876d.ae);
                }
                barrier2.setType(aVar2.f2876d.ab);
                barrier2.setMargin(aVar2.f2876d.ac);
                ConstraintLayout.LayoutParams generateDefaultLayoutParams = constraintLayout.generateDefaultLayoutParams();
                barrier2.mo3801c();
                aVar2.mo3915a(generateDefaultLayoutParams);
                constraintLayout.addView(barrier2, generateDefaultLayoutParams);
            }
            if (aVar2.f2876d.f2905a) {
                Guideline guideline = new Guideline(constraintLayout.getContext());
                guideline.setId(num.intValue());
                ConstraintLayout.LayoutParams generateDefaultLayoutParams2 = constraintLayout.generateDefaultLayoutParams();
                aVar2.mo3915a(generateDefaultLayoutParams2);
                constraintLayout.addView(guideline, generateDefaultLayoutParams2);
            }
        }
    }

    /* renamed from: a */
    public void mo3884a(int i, int i2, int i3, int i4, int i5, int i6, int i7, float f) {
        if (i4 < 0) {
            throw new IllegalArgumentException("margin must be > 0");
        } else if (i7 < 0) {
            throw new IllegalArgumentException("margin must be > 0");
        } else if (f <= BitmapDescriptorFactory.HUE_RED || f > 1.0f) {
            throw new IllegalArgumentException("bias must be between 0 and 1 inclusive");
        } else if (i3 == 1 || i3 == 2) {
            mo3883a(i, 1, i2, i3, i4);
            mo3883a(i, 2, i5, i6, i7);
            this.f2872e.get(Integer.valueOf(i)).f2876d.f2925u = f;
        } else if (i3 == 6 || i3 == 7) {
            mo3883a(i, 6, i2, i3, i4);
            mo3883a(i, 7, i5, i6, i7);
            this.f2872e.get(Integer.valueOf(i)).f2876d.f2925u = f;
        } else {
            mo3883a(i, 3, i2, i3, i4);
            mo3883a(i, 4, i5, i6, i7);
            this.f2872e.get(Integer.valueOf(i)).f2876d.f2926v = f;
        }
    }

    /* renamed from: a */
    public void mo3885a(int i, int i2, int i3, int i4, int[] iArr, float[] fArr, int i5) {
        if (iArr.length < 2) {
            throw new IllegalArgumentException("must have 2 or more widgets in a chain");
        } else if (fArr == null || fArr.length == iArr.length) {
            if (fArr != null) {
                m3392g(iArr[0]).f2876d.f2894P = fArr[0];
            }
            m3392g(iArr[0]).f2876d.f2897S = i5;
            mo3883a(iArr[0], 3, i, i2, 0);
            for (int i6 = 1; i6 < iArr.length; i6++) {
                int i7 = iArr[i6];
                int i8 = i6 - 1;
                mo3883a(iArr[i6], 3, iArr[i8], 4, 0);
                mo3883a(iArr[i8], 4, iArr[i6], 3, 0);
                if (fArr != null) {
                    m3392g(iArr[i6]).f2876d.f2894P = fArr[i6];
                }
            }
            mo3883a(iArr[iArr.length - 1], 4, i3, i4, 0);
        } else {
            throw new IllegalArgumentException("must have 2 or more widgets in a chain");
        }
    }

    /* renamed from: a */
    public void mo3883a(int i, int i2, int i3, int i4, int i5) {
        if (!this.f2872e.containsKey(Integer.valueOf(i))) {
            this.f2872e.put(Integer.valueOf(i), new C0690a());
        }
        C0690a aVar = this.f2872e.get(Integer.valueOf(i));
        switch (i2) {
            case 1:
                if (i4 == 1) {
                    aVar.f2876d.f2912h = i3;
                    aVar.f2876d.f2913i = -1;
                } else if (i4 == 2) {
                    aVar.f2876d.f2913i = i3;
                    aVar.f2876d.f2912h = -1;
                } else {
                    throw new IllegalArgumentException("Left to " + m3393h(i4) + " undefined");
                }
                aVar.f2876d.f2882D = i5;
                return;
            case 2:
                if (i4 == 1) {
                    aVar.f2876d.f2914j = i3;
                    aVar.f2876d.f2915k = -1;
                } else if (i4 == 2) {
                    aVar.f2876d.f2915k = i3;
                    aVar.f2876d.f2914j = -1;
                } else {
                    throw new IllegalArgumentException("right to " + m3393h(i4) + " undefined");
                }
                aVar.f2876d.f2883E = i5;
                return;
            case 3:
                if (i4 == 3) {
                    aVar.f2876d.f2916l = i3;
                    aVar.f2876d.f2917m = -1;
                    aVar.f2876d.f2920p = -1;
                } else if (i4 == 4) {
                    aVar.f2876d.f2917m = i3;
                    aVar.f2876d.f2916l = -1;
                    aVar.f2876d.f2920p = -1;
                } else {
                    throw new IllegalArgumentException("right to " + m3393h(i4) + " undefined");
                }
                aVar.f2876d.f2884F = i5;
                return;
            case 4:
                if (i4 == 4) {
                    aVar.f2876d.f2919o = i3;
                    aVar.f2876d.f2918n = -1;
                    aVar.f2876d.f2920p = -1;
                } else if (i4 == 3) {
                    aVar.f2876d.f2918n = i3;
                    aVar.f2876d.f2919o = -1;
                    aVar.f2876d.f2920p = -1;
                } else {
                    throw new IllegalArgumentException("right to " + m3393h(i4) + " undefined");
                }
                aVar.f2876d.f2885G = i5;
                return;
            case 5:
                if (i4 == 5) {
                    aVar.f2876d.f2920p = i3;
                    aVar.f2876d.f2919o = -1;
                    aVar.f2876d.f2918n = -1;
                    aVar.f2876d.f2916l = -1;
                    aVar.f2876d.f2917m = -1;
                    return;
                }
                throw new IllegalArgumentException("right to " + m3393h(i4) + " undefined");
            case 6:
                if (i4 == 6) {
                    aVar.f2876d.f2922r = i3;
                    aVar.f2876d.f2921q = -1;
                } else if (i4 == 7) {
                    aVar.f2876d.f2921q = i3;
                    aVar.f2876d.f2922r = -1;
                } else {
                    throw new IllegalArgumentException("right to " + m3393h(i4) + " undefined");
                }
                aVar.f2876d.f2887I = i5;
                return;
            case 7:
                if (i4 == 7) {
                    aVar.f2876d.f2924t = i3;
                    aVar.f2876d.f2923s = -1;
                } else if (i4 == 6) {
                    aVar.f2876d.f2923s = i3;
                    aVar.f2876d.f2924t = -1;
                } else {
                    throw new IllegalArgumentException("right to " + m3393h(i4) + " undefined");
                }
                aVar.f2876d.f2886H = i5;
                return;
            default:
                throw new IllegalArgumentException(m3393h(i2) + " to " + m3393h(i4) + " unknown");
        }
    }

    /* renamed from: a */
    public void mo3887a(int i, String str) {
        m3392g(i).f2876d.f2927w = str;
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0079, code lost:
        if (r0.equals("PropertySet") != false) goto L_0x0091;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x017b, code lost:
        continue;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo3889a(android.content.Context r10, org.xmlpull.v1.XmlPullParser r11) {
        /*
        // Method dump skipped, instructions count: 450
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.C0689b.mo3889a(android.content.Context, org.xmlpull.v1.XmlPullParser):void");
    }

    /* renamed from: a */
    public int[] mo3896a() {
        Integer[] numArr = (Integer[]) this.f2872e.keySet().toArray(new Integer[0]);
        int length = numArr.length;
        int[] iArr = new int[length];
        for (int i = 0; i < length; i++) {
            iArr[i] = numArr[i].intValue();
        }
        return iArr;
    }

    /* renamed from: androidx.constraintlayout.widget.b$a */
    public static class C0690a {

        /* renamed from: a */
        int f2873a;

        /* renamed from: b */
        public final C0693d f2874b = new C0693d();

        /* renamed from: c */
        public final C0692c f2875c = new C0692c();

        /* renamed from: d */
        public final C0691b f2876d = new C0691b();

        /* renamed from: e */
        public final C0694e f2877e = new C0694e();

        /* renamed from: f */
        public HashMap<String, ConstraintAttribute> f2878f = new HashMap<>();

        /* renamed from: a */
        public C0690a clone() {
            C0690a aVar = new C0690a();
            aVar.f2876d.mo3918a(this.f2876d);
            aVar.f2875c.mo3920a(this.f2875c);
            aVar.f2874b.mo3922a(this.f2874b);
            aVar.f2877e.mo3924a(this.f2877e);
            aVar.f2873a = this.f2873a;
            return aVar;
        }

        /* renamed from: a */
        public void mo3915a(ConstraintLayout.LayoutParams layoutParams) {
            layoutParams.f2812d = this.f2876d.f2912h;
            layoutParams.f2813e = this.f2876d.f2913i;
            layoutParams.f2814f = this.f2876d.f2914j;
            layoutParams.f2815g = this.f2876d.f2915k;
            layoutParams.f2816h = this.f2876d.f2916l;
            layoutParams.f2817i = this.f2876d.f2917m;
            layoutParams.f2818j = this.f2876d.f2918n;
            layoutParams.f2819k = this.f2876d.f2919o;
            layoutParams.f2820l = this.f2876d.f2920p;
            layoutParams.f2824p = this.f2876d.f2921q;
            layoutParams.f2825q = this.f2876d.f2922r;
            layoutParams.f2826r = this.f2876d.f2923s;
            layoutParams.f2827s = this.f2876d.f2924t;
            layoutParams.leftMargin = this.f2876d.f2882D;
            layoutParams.rightMargin = this.f2876d.f2883E;
            layoutParams.topMargin = this.f2876d.f2884F;
            layoutParams.bottomMargin = this.f2876d.f2885G;
            layoutParams.f2832x = this.f2876d.f2893O;
            layoutParams.f2833y = this.f2876d.f2892N;
            layoutParams.f2829u = this.f2876d.f2889K;
            layoutParams.f2831w = this.f2876d.f2891M;
            layoutParams.f2834z = this.f2876d.f2925u;
            layoutParams.f2783A = this.f2876d.f2926v;
            layoutParams.f2821m = this.f2876d.f2928x;
            layoutParams.f2822n = this.f2876d.f2929y;
            layoutParams.f2823o = this.f2876d.f2930z;
            layoutParams.f2784B = this.f2876d.f2927w;
            layoutParams.f2799Q = this.f2876d.f2879A;
            layoutParams.f2800R = this.f2876d.f2880B;
            layoutParams.f2788F = this.f2876d.f2894P;
            layoutParams.f2787E = this.f2876d.f2895Q;
            layoutParams.f2790H = this.f2876d.f2897S;
            layoutParams.f2789G = this.f2876d.f2896R;
            layoutParams.f2802T = this.f2876d.ah;
            layoutParams.f2803U = this.f2876d.f175415ai;
            layoutParams.f2791I = this.f2876d.f2898T;
            layoutParams.f2792J = this.f2876d.f2899U;
            layoutParams.f2795M = this.f2876d.f2900V;
            layoutParams.f2796N = this.f2876d.f2901W;
            layoutParams.f2793K = this.f2876d.f2902X;
            layoutParams.f2794L = this.f2876d.f2903Y;
            layoutParams.f2797O = this.f2876d.f2904Z;
            layoutParams.f2798P = this.f2876d.aa;
            layoutParams.f2801S = this.f2876d.f2881C;
            layoutParams.f2811c = this.f2876d.f2911g;
            layoutParams.f2809a = this.f2876d.f2909e;
            layoutParams.f2810b = this.f2876d.f2910f;
            layoutParams.width = this.f2876d.f2907c;
            layoutParams.height = this.f2876d.f2908d;
            if (this.f2876d.ag != null) {
                layoutParams.f2804V = this.f2876d.ag;
            }
            if (Build.VERSION.SDK_INT >= 17) {
                layoutParams.setMarginStart(this.f2876d.f2887I);
                layoutParams.setMarginEnd(this.f2876d.f2886H);
            }
            layoutParams.mo3845b();
        }

        /* renamed from: a */
        public void mo3913a(int i, Constraints.LayoutParams layoutParams) {
            mo3912a(i, (ConstraintLayout.LayoutParams) layoutParams);
            this.f2874b.f2942d = layoutParams.ap;
            this.f2877e.f2946b = layoutParams.as;
            this.f2877e.f2947c = layoutParams.at;
            this.f2877e.f2948d = layoutParams.au;
            this.f2877e.f2949e = layoutParams.av;
            this.f2877e.f2950f = layoutParams.aw;
            this.f2877e.f2951g = layoutParams.ax;
            this.f2877e.f2952h = layoutParams.ay;
            this.f2877e.f2953i = layoutParams.az;
            this.f2877e.f2954j = layoutParams.aA;
            this.f2877e.f2955k = layoutParams.aB;
            this.f2877e.f2957m = layoutParams.ar;
            this.f2877e.f2956l = layoutParams.aq;
        }

        /* renamed from: a */
        public void mo3912a(int i, ConstraintLayout.LayoutParams layoutParams) {
            this.f2873a = i;
            this.f2876d.f2912h = layoutParams.f2812d;
            this.f2876d.f2913i = layoutParams.f2813e;
            this.f2876d.f2914j = layoutParams.f2814f;
            this.f2876d.f2915k = layoutParams.f2815g;
            this.f2876d.f2916l = layoutParams.f2816h;
            this.f2876d.f2917m = layoutParams.f2817i;
            this.f2876d.f2918n = layoutParams.f2818j;
            this.f2876d.f2919o = layoutParams.f2819k;
            this.f2876d.f2920p = layoutParams.f2820l;
            this.f2876d.f2921q = layoutParams.f2824p;
            this.f2876d.f2922r = layoutParams.f2825q;
            this.f2876d.f2923s = layoutParams.f2826r;
            this.f2876d.f2924t = layoutParams.f2827s;
            this.f2876d.f2925u = layoutParams.f2834z;
            this.f2876d.f2926v = layoutParams.f2783A;
            this.f2876d.f2927w = layoutParams.f2784B;
            this.f2876d.f2928x = layoutParams.f2821m;
            this.f2876d.f2929y = layoutParams.f2822n;
            this.f2876d.f2930z = layoutParams.f2823o;
            this.f2876d.f2879A = layoutParams.f2799Q;
            this.f2876d.f2880B = layoutParams.f2800R;
            this.f2876d.f2881C = layoutParams.f2801S;
            this.f2876d.f2911g = layoutParams.f2811c;
            this.f2876d.f2909e = layoutParams.f2809a;
            this.f2876d.f2910f = layoutParams.f2810b;
            this.f2876d.f2907c = layoutParams.width;
            this.f2876d.f2908d = layoutParams.height;
            this.f2876d.f2882D = layoutParams.leftMargin;
            this.f2876d.f2883E = layoutParams.rightMargin;
            this.f2876d.f2884F = layoutParams.topMargin;
            this.f2876d.f2885G = layoutParams.bottomMargin;
            this.f2876d.f2894P = layoutParams.f2788F;
            this.f2876d.f2895Q = layoutParams.f2787E;
            this.f2876d.f2897S = layoutParams.f2790H;
            this.f2876d.f2896R = layoutParams.f2789G;
            this.f2876d.ah = layoutParams.f2802T;
            this.f2876d.f175415ai = layoutParams.f2803U;
            this.f2876d.f2898T = layoutParams.f2791I;
            this.f2876d.f2899U = layoutParams.f2792J;
            this.f2876d.f2900V = layoutParams.f2795M;
            this.f2876d.f2901W = layoutParams.f2796N;
            this.f2876d.f2902X = layoutParams.f2793K;
            this.f2876d.f2903Y = layoutParams.f2794L;
            this.f2876d.f2904Z = layoutParams.f2797O;
            this.f2876d.aa = layoutParams.f2798P;
            this.f2876d.ag = layoutParams.f2804V;
            this.f2876d.f2889K = layoutParams.f2829u;
            this.f2876d.f2891M = layoutParams.f2831w;
            this.f2876d.f2888J = layoutParams.f2828t;
            this.f2876d.f2890L = layoutParams.f2830v;
            this.f2876d.f2893O = layoutParams.f2832x;
            this.f2876d.f2892N = layoutParams.f2833y;
            if (Build.VERSION.SDK_INT >= 17) {
                this.f2876d.f2886H = layoutParams.getMarginEnd();
                this.f2876d.f2887I = layoutParams.getMarginStart();
            }
        }

        /* renamed from: a */
        public void mo3914a(ConstraintHelper constraintHelper, int i, Constraints.LayoutParams layoutParams) {
            mo3913a(i, layoutParams);
            if (constraintHelper instanceof Barrier) {
                this.f2876d.ad = 1;
                Barrier barrier = (Barrier) constraintHelper;
                this.f2876d.ab = barrier.getType();
                this.f2876d.ae = barrier.getReferencedIds();
                this.f2876d.ac = barrier.getMargin();
            }
        }
    }

    /* renamed from: androidx.constraintlayout.widget.b$c */
    public static class C0692c {

        /* renamed from: h */
        private static SparseIntArray f2931h;

        /* renamed from: a */
        public boolean f2932a;

        /* renamed from: b */
        public int f2933b = -1;

        /* renamed from: c */
        public String f2934c;

        /* renamed from: d */
        public int f2935d = -1;

        /* renamed from: e */
        public int f2936e;

        /* renamed from: f */
        public float f2937f = Float.NaN;

        /* renamed from: g */
        public float f2938g = Float.NaN;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f2931h = sparseIntArray;
            sparseIntArray.append(2, 1);
            f2931h.append(4, 2);
            f2931h.append(5, 3);
            f2931h.append(1, 4);
            f2931h.append(0, 5);
            f2931h.append(3, 6);
        }

        /* renamed from: a */
        public void mo3920a(C0692c cVar) {
            this.f2932a = cVar.f2932a;
            this.f2933b = cVar.f2933b;
            this.f2934c = cVar.f2934c;
            this.f2935d = cVar.f2935d;
            this.f2936e = cVar.f2936e;
            this.f2938g = cVar.f2938g;
            this.f2937f = cVar.f2937f;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo3919a(Context context, AttributeSet attributeSet) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.animate_relativeTo, R.attr.drawPath, R.attr.motionPathRotate, R.attr.motionStagger, R.attr.pathMotionArc, R.attr.transitionEasing});
            this.f2932a = true;
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                switch (f2931h.get(index)) {
                    case 1:
                        this.f2938g = obtainStyledAttributes.getFloat(index, this.f2938g);
                        break;
                    case 2:
                        this.f2935d = obtainStyledAttributes.getInt(index, this.f2935d);
                        break;
                    case 3:
                        if (obtainStyledAttributes.peekValue(index).type == 3) {
                            this.f2934c = obtainStyledAttributes.getString(index);
                            break;
                        } else {
                            this.f2934c = C0530c.f1948c[obtainStyledAttributes.getInteger(index, 0)];
                            break;
                        }
                    case 4:
                        this.f2936e = obtainStyledAttributes.getInt(index, 0);
                        break;
                    case 5:
                        this.f2933b = C0689b.m3388a(obtainStyledAttributes, index, this.f2933b);
                        break;
                    case 6:
                        this.f2937f = obtainStyledAttributes.getFloat(index, this.f2937f);
                        break;
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    /* renamed from: androidx.constraintlayout.widget.b$e */
    public static class C0694e {

        /* renamed from: n */
        private static SparseIntArray f2944n;

        /* renamed from: a */
        public boolean f2945a;

        /* renamed from: b */
        public float f2946b;

        /* renamed from: c */
        public float f2947c;

        /* renamed from: d */
        public float f2948d;

        /* renamed from: e */
        public float f2949e = 1.0f;

        /* renamed from: f */
        public float f2950f = 1.0f;

        /* renamed from: g */
        public float f2951g = Float.NaN;

        /* renamed from: h */
        public float f2952h = Float.NaN;

        /* renamed from: i */
        public float f2953i;

        /* renamed from: j */
        public float f2954j;

        /* renamed from: k */
        public float f2955k;

        /* renamed from: l */
        public boolean f2956l;

        /* renamed from: m */
        public float f2957m;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f2944n = sparseIntArray;
            sparseIntArray.append(6, 1);
            f2944n.append(7, 2);
            f2944n.append(8, 3);
            f2944n.append(4, 4);
            f2944n.append(5, 5);
            f2944n.append(0, 6);
            f2944n.append(1, 7);
            f2944n.append(2, 8);
            f2944n.append(3, 9);
            f2944n.append(9, 10);
            f2944n.append(10, 11);
        }

        /* renamed from: a */
        public void mo3924a(C0694e eVar) {
            this.f2945a = eVar.f2945a;
            this.f2946b = eVar.f2946b;
            this.f2947c = eVar.f2947c;
            this.f2948d = eVar.f2948d;
            this.f2949e = eVar.f2949e;
            this.f2950f = eVar.f2950f;
            this.f2951g = eVar.f2951g;
            this.f2952h = eVar.f2952h;
            this.f2953i = eVar.f2953i;
            this.f2954j = eVar.f2954j;
            this.f2955k = eVar.f2955k;
            this.f2956l = eVar.f2956l;
            this.f2957m = eVar.f2957m;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo3923a(Context context, AttributeSet attributeSet) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{16843552, 16843553, 16843554, 16843555, 16843556, 16843557, 16843558, 16843559, 16843560, 16843770, 16843840});
            this.f2945a = true;
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                switch (f2944n.get(index)) {
                    case 1:
                        this.f2946b = obtainStyledAttributes.getFloat(index, this.f2946b);
                        break;
                    case 2:
                        this.f2947c = obtainStyledAttributes.getFloat(index, this.f2947c);
                        break;
                    case 3:
                        this.f2948d = obtainStyledAttributes.getFloat(index, this.f2948d);
                        break;
                    case 4:
                        this.f2949e = obtainStyledAttributes.getFloat(index, this.f2949e);
                        break;
                    case 5:
                        this.f2950f = obtainStyledAttributes.getFloat(index, this.f2950f);
                        break;
                    case 6:
                        this.f2951g = obtainStyledAttributes.getDimension(index, this.f2951g);
                        break;
                    case 7:
                        this.f2952h = obtainStyledAttributes.getDimension(index, this.f2952h);
                        break;
                    case 8:
                        this.f2953i = obtainStyledAttributes.getDimension(index, this.f2953i);
                        break;
                    case 9:
                        this.f2954j = obtainStyledAttributes.getDimension(index, this.f2954j);
                        break;
                    case 10:
                        if (Build.VERSION.SDK_INT >= 21) {
                            this.f2955k = obtainStyledAttributes.getDimension(index, this.f2955k);
                            break;
                        } else {
                            break;
                        }
                    case 11:
                        if (Build.VERSION.SDK_INT >= 21) {
                            this.f2956l = true;
                            this.f2957m = obtainStyledAttributes.getDimension(index, this.f2957m);
                            break;
                        } else {
                            break;
                        }
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    /* renamed from: androidx.constraintlayout.widget.b$b */
    public static class C0691b {
        private static SparseIntArray ak;

        /* renamed from: A */
        public int f2879A = -1;

        /* renamed from: B */
        public int f2880B = -1;

        /* renamed from: C */
        public int f2881C = -1;

        /* renamed from: D */
        public int f2882D = -1;

        /* renamed from: E */
        public int f2883E = -1;

        /* renamed from: F */
        public int f2884F = -1;

        /* renamed from: G */
        public int f2885G = -1;

        /* renamed from: H */
        public int f2886H = -1;

        /* renamed from: I */
        public int f2887I = -1;

        /* renamed from: J */
        public int f2888J = -1;

        /* renamed from: K */
        public int f2889K = -1;

        /* renamed from: L */
        public int f2890L = -1;

        /* renamed from: M */
        public int f2891M = -1;

        /* renamed from: N */
        public int f2892N = -1;

        /* renamed from: O */
        public int f2893O = -1;

        /* renamed from: P */
        public float f2894P = -1.0f;

        /* renamed from: Q */
        public float f2895Q = -1.0f;

        /* renamed from: R */
        public int f2896R;

        /* renamed from: S */
        public int f2897S;

        /* renamed from: T */
        public int f2898T;

        /* renamed from: U */
        public int f2899U;

        /* renamed from: V */
        public int f2900V = -1;

        /* renamed from: W */
        public int f2901W = -1;

        /* renamed from: X */
        public int f2902X = -1;

        /* renamed from: Y */
        public int f2903Y = -1;

        /* renamed from: Z */
        public float f2904Z = 1.0f;

        /* renamed from: a */
        public boolean f2905a;
        public float aa = 1.0f;
        public int ab = -1;
        public int ac;
        public int ad = -1;
        public int[] ae;
        public String af;
        public String ag;
        public boolean ah;

        /* renamed from: ai  reason: collision with root package name */
        public boolean f175415ai;
        public boolean aj = true;

        /* renamed from: b */
        public boolean f2906b;

        /* renamed from: c */
        public int f2907c;

        /* renamed from: d */
        public int f2908d;

        /* renamed from: e */
        public int f2909e = -1;

        /* renamed from: f */
        public int f2910f = -1;

        /* renamed from: g */
        public float f2911g = -1.0f;

        /* renamed from: h */
        public int f2912h = -1;

        /* renamed from: i */
        public int f2913i = -1;

        /* renamed from: j */
        public int f2914j = -1;

        /* renamed from: k */
        public int f2915k = -1;

        /* renamed from: l */
        public int f2916l = -1;

        /* renamed from: m */
        public int f2917m = -1;

        /* renamed from: n */
        public int f2918n = -1;

        /* renamed from: o */
        public int f2919o = -1;

        /* renamed from: p */
        public int f2920p = -1;

        /* renamed from: q */
        public int f2921q = -1;

        /* renamed from: r */
        public int f2922r = -1;

        /* renamed from: s */
        public int f2923s = -1;

        /* renamed from: t */
        public int f2924t = -1;

        /* renamed from: u */
        public float f2925u = 0.5f;

        /* renamed from: v */
        public float f2926v = 0.5f;

        /* renamed from: w */
        public String f2927w;

        /* renamed from: x */
        public int f2928x = -1;

        /* renamed from: y */
        public int f2929y;

        /* renamed from: z */
        public float f2930z;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            ak = sparseIntArray;
            sparseIntArray.append(39, 24);
            ak.append(40, 25);
            ak.append(42, 28);
            ak.append(43, 29);
            ak.append(48, 35);
            ak.append(47, 34);
            ak.append(21, 4);
            ak.append(20, 3);
            ak.append(18, 1);
            ak.append(56, 6);
            ak.append(57, 7);
            ak.append(28, 17);
            ak.append(29, 18);
            ak.append(30, 19);
            ak.append(0, 26);
            ak.append(44, 31);
            ak.append(45, 32);
            ak.append(27, 10);
            ak.append(26, 9);
            ak.append(60, 13);
            ak.append(63, 16);
            ak.append(61, 14);
            ak.append(58, 11);
            ak.append(62, 15);
            ak.append(59, 12);
            ak.append(51, 38);
            ak.append(37, 37);
            ak.append(36, 39);
            ak.append(50, 40);
            ak.append(35, 20);
            ak.append(49, 36);
            ak.append(25, 5);
            ak.append(38, 76);
            ak.append(46, 76);
            ak.append(41, 76);
            ak.append(19, 76);
            ak.append(17, 76);
            ak.append(3, 23);
            ak.append(5, 27);
            ak.append(7, 30);
            ak.append(8, 8);
            ak.append(4, 33);
            ak.append(6, 2);
            ak.append(1, 22);
            ak.append(2, 21);
            ak.append(22, 61);
            ak.append(24, 62);
            ak.append(23, 63);
            ak.append(55, 69);
            ak.append(34, 70);
            ak.append(12, 71);
            ak.append(10, 72);
            ak.append(11, 73);
            ak.append(13, 74);
            ak.append(9, 75);
        }

        /* renamed from: a */
        public void mo3918a(C0691b bVar) {
            this.f2905a = bVar.f2905a;
            this.f2907c = bVar.f2907c;
            this.f2906b = bVar.f2906b;
            this.f2908d = bVar.f2908d;
            this.f2909e = bVar.f2909e;
            this.f2910f = bVar.f2910f;
            this.f2911g = bVar.f2911g;
            this.f2912h = bVar.f2912h;
            this.f2913i = bVar.f2913i;
            this.f2914j = bVar.f2914j;
            this.f2915k = bVar.f2915k;
            this.f2916l = bVar.f2916l;
            this.f2917m = bVar.f2917m;
            this.f2918n = bVar.f2918n;
            this.f2919o = bVar.f2919o;
            this.f2920p = bVar.f2920p;
            this.f2921q = bVar.f2921q;
            this.f2922r = bVar.f2922r;
            this.f2923s = bVar.f2923s;
            this.f2924t = bVar.f2924t;
            this.f2925u = bVar.f2925u;
            this.f2926v = bVar.f2926v;
            this.f2927w = bVar.f2927w;
            this.f2928x = bVar.f2928x;
            this.f2929y = bVar.f2929y;
            this.f2930z = bVar.f2930z;
            this.f2879A = bVar.f2879A;
            this.f2880B = bVar.f2880B;
            this.f2881C = bVar.f2881C;
            this.f2882D = bVar.f2882D;
            this.f2883E = bVar.f2883E;
            this.f2884F = bVar.f2884F;
            this.f2885G = bVar.f2885G;
            this.f2886H = bVar.f2886H;
            this.f2887I = bVar.f2887I;
            this.f2888J = bVar.f2888J;
            this.f2889K = bVar.f2889K;
            this.f2890L = bVar.f2890L;
            this.f2891M = bVar.f2891M;
            this.f2892N = bVar.f2892N;
            this.f2893O = bVar.f2893O;
            this.f2894P = bVar.f2894P;
            this.f2895Q = bVar.f2895Q;
            this.f2896R = bVar.f2896R;
            this.f2897S = bVar.f2897S;
            this.f2898T = bVar.f2898T;
            this.f2899U = bVar.f2899U;
            this.f2900V = bVar.f2900V;
            this.f2901W = bVar.f2901W;
            this.f2902X = bVar.f2902X;
            this.f2903Y = bVar.f2903Y;
            this.f2904Z = bVar.f2904Z;
            this.aa = bVar.aa;
            this.ab = bVar.ab;
            this.ac = bVar.ac;
            this.ad = bVar.ad;
            this.ag = bVar.ag;
            int[] iArr = bVar.ae;
            if (iArr != null) {
                this.ae = Arrays.copyOf(iArr, iArr.length);
            } else {
                this.ae = null;
            }
            this.af = bVar.af;
            this.ah = bVar.ah;
            this.f175415ai = bVar.f175415ai;
            this.aj = bVar.aj;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo3917a(Context context, AttributeSet attributeSet) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{16842948, 16842996, 16842997, 16842999, 16843000, 16843001, 16843002, 16843701, 16843702, R.attr.barrierAllowsGoneWidgets, R.attr.barrierDirection, R.attr.barrierMargin, R.attr.chainUseRtl, R.attr.constraint_referenced_ids, R.attr.constraint_referenced_tags, R.attr.layout_constrainedHeight, R.attr.layout_constrainedWidth, R.attr.layout_constraintBaseline_creator, R.attr.layout_constraintBaseline_toBaselineOf, R.attr.layout_constraintBottom_creator, R.attr.layout_constraintBottom_toBottomOf, R.attr.layout_constraintBottom_toTopOf, R.attr.layout_constraintCircle, R.attr.layout_constraintCircleAngle, R.attr.layout_constraintCircleRadius, R.attr.layout_constraintDimensionRatio, R.attr.layout_constraintEnd_toEndOf, R.attr.layout_constraintEnd_toStartOf, R.attr.layout_constraintGuide_begin, R.attr.layout_constraintGuide_end, R.attr.layout_constraintGuide_percent, R.attr.layout_constraintHeight_default, R.attr.layout_constraintHeight_max, R.attr.layout_constraintHeight_min, R.attr.layout_constraintHeight_percent, R.attr.layout_constraintHorizontal_bias, R.attr.layout_constraintHorizontal_chainStyle, R.attr.layout_constraintHorizontal_weight, R.attr.layout_constraintLeft_creator, R.attr.layout_constraintLeft_toLeftOf, R.attr.layout_constraintLeft_toRightOf, R.attr.layout_constraintRight_creator, R.attr.layout_constraintRight_toLeftOf, R.attr.layout_constraintRight_toRightOf, R.attr.layout_constraintStart_toEndOf, R.attr.layout_constraintStart_toStartOf, R.attr.layout_constraintTop_creator, R.attr.layout_constraintTop_toBottomOf, R.attr.layout_constraintTop_toTopOf, R.attr.layout_constraintVertical_bias, R.attr.layout_constraintVertical_chainStyle, R.attr.layout_constraintVertical_weight, R.attr.layout_constraintWidth_default, R.attr.layout_constraintWidth_max, R.attr.layout_constraintWidth_min, R.attr.layout_constraintWidth_percent, R.attr.layout_editor_absoluteX, R.attr.layout_editor_absoluteY, R.attr.layout_goneMarginBottom, R.attr.layout_goneMarginEnd, R.attr.layout_goneMarginLeft, R.attr.layout_goneMarginRight, R.attr.layout_goneMarginStart, R.attr.layout_goneMarginTop, R.attr.maxHeight, R.attr.maxWidth, R.attr.minHeight, R.attr.minWidth});
            this.f2906b = true;
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                int i2 = ak.get(index);
                if (i2 == 80) {
                    this.ah = obtainStyledAttributes.getBoolean(index, this.ah);
                } else if (i2 != 81) {
                    switch (i2) {
                        case 1:
                            this.f2920p = C0689b.m3388a(obtainStyledAttributes, index, this.f2920p);
                            continue;
                        case 2:
                            this.f2885G = obtainStyledAttributes.getDimensionPixelSize(index, this.f2885G);
                            continue;
                        case 3:
                            this.f2919o = C0689b.m3388a(obtainStyledAttributes, index, this.f2919o);
                            continue;
                        case 4:
                            this.f2918n = C0689b.m3388a(obtainStyledAttributes, index, this.f2918n);
                            continue;
                        case 5:
                            this.f2927w = obtainStyledAttributes.getString(index);
                            continue;
                        case 6:
                            this.f2879A = obtainStyledAttributes.getDimensionPixelOffset(index, this.f2879A);
                            continue;
                        case 7:
                            this.f2880B = obtainStyledAttributes.getDimensionPixelOffset(index, this.f2880B);
                            continue;
                        case 8:
                            if (Build.VERSION.SDK_INT >= 17) {
                                this.f2886H = obtainStyledAttributes.getDimensionPixelSize(index, this.f2886H);
                                break;
                            } else {
                                continue;
                            }
                        case 9:
                            this.f2924t = C0689b.m3388a(obtainStyledAttributes, index, this.f2924t);
                            continue;
                        case 10:
                            this.f2923s = C0689b.m3388a(obtainStyledAttributes, index, this.f2923s);
                            continue;
                        case 11:
                            this.f2891M = obtainStyledAttributes.getDimensionPixelSize(index, this.f2891M);
                            continue;
                        case HwBuildEx.VersionCodes.EMUI_5_1 /*{ENCODED_INT: 12}*/:
                            this.f2892N = obtainStyledAttributes.getDimensionPixelSize(index, this.f2892N);
                            continue;
                        case 13:
                            this.f2888J = obtainStyledAttributes.getDimensionPixelSize(index, this.f2888J);
                            continue;
                        case 14:
                            this.f2890L = obtainStyledAttributes.getDimensionPixelSize(index, this.f2890L);
                            continue;
                        case 15:
                            this.f2893O = obtainStyledAttributes.getDimensionPixelSize(index, this.f2893O);
                            continue;
                        case 16:
                            this.f2889K = obtainStyledAttributes.getDimensionPixelSize(index, this.f2889K);
                            continue;
                        case 17:
                            this.f2909e = obtainStyledAttributes.getDimensionPixelOffset(index, this.f2909e);
                            continue;
                        case 18:
                            this.f2910f = obtainStyledAttributes.getDimensionPixelOffset(index, this.f2910f);
                            continue;
                        case 19:
                            this.f2911g = obtainStyledAttributes.getFloat(index, this.f2911g);
                            continue;
                        case 20:
                            this.f2925u = obtainStyledAttributes.getFloat(index, this.f2925u);
                            continue;
                        case 21:
                            this.f2908d = obtainStyledAttributes.getLayoutDimension(index, this.f2908d);
                            continue;
                        case 22:
                            this.f2907c = obtainStyledAttributes.getLayoutDimension(index, this.f2907c);
                            continue;
                        case 23:
                            this.f2882D = obtainStyledAttributes.getDimensionPixelSize(index, this.f2882D);
                            continue;
                        case 24:
                            this.f2912h = C0689b.m3388a(obtainStyledAttributes, index, this.f2912h);
                            continue;
                        case AvailableCode.ERROR_ON_ACTIVITY_RESULT /*{ENCODED_INT: 25}*/:
                            this.f2913i = C0689b.m3388a(obtainStyledAttributes, index, this.f2913i);
                            continue;
                        case 26:
                            this.f2881C = obtainStyledAttributes.getInt(index, this.f2881C);
                            continue;
                        case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /*{ENCODED_INT: 27}*/:
                            this.f2883E = obtainStyledAttributes.getDimensionPixelSize(index, this.f2883E);
                            continue;
                        case IVideoEventLogger.LOGGER_OPTION_ENABLE_SR /*{ENCODED_INT: 28}*/:
                            this.f2914j = C0689b.m3388a(obtainStyledAttributes, index, this.f2914j);
                            continue;
                        case 29:
                            this.f2915k = C0689b.m3388a(obtainStyledAttributes, index, this.f2915k);
                            continue;
                        case 30:
                            if (Build.VERSION.SDK_INT >= 17) {
                                this.f2887I = obtainStyledAttributes.getDimensionPixelSize(index, this.f2887I);
                                break;
                            } else {
                                continue;
                            }
                        case TTVideoEngine.PLAYER_OPTION_ENABLE_PLAYER3_HARDWARE_DECODE /*{ENCODED_INT: 31}*/:
                            this.f2921q = C0689b.m3388a(obtainStyledAttributes, index, this.f2921q);
                            continue;
                        case 32:
                            this.f2922r = C0689b.m3388a(obtainStyledAttributes, index, this.f2922r);
                            continue;
                        case 33:
                            this.f2884F = obtainStyledAttributes.getDimensionPixelSize(index, this.f2884F);
                            continue;
                        case 34:
                            this.f2917m = C0689b.m3388a(obtainStyledAttributes, index, this.f2917m);
                            continue;
                        case 35:
                            this.f2916l = C0689b.m3388a(obtainStyledAttributes, index, this.f2916l);
                            continue;
                        case 36:
                            this.f2926v = obtainStyledAttributes.getFloat(index, this.f2926v);
                            continue;
                        case 37:
                            this.f2895Q = obtainStyledAttributes.getFloat(index, this.f2895Q);
                            continue;
                        case 38:
                            this.f2894P = obtainStyledAttributes.getFloat(index, this.f2894P);
                            continue;
                        case 39:
                            this.f2896R = obtainStyledAttributes.getInt(index, this.f2896R);
                            continue;
                        case 40:
                            this.f2897S = obtainStyledAttributes.getInt(index, this.f2897S);
                            continue;
                        default:
                            switch (i2) {
                                case 54:
                                    this.f2898T = obtainStyledAttributes.getInt(index, this.f2898T);
                                    continue;
                                case 55:
                                    this.f2899U = obtainStyledAttributes.getInt(index, this.f2899U);
                                    continue;
                                case 56:
                                    this.f2900V = obtainStyledAttributes.getDimensionPixelSize(index, this.f2900V);
                                    continue;
                                case 57:
                                    this.f2901W = obtainStyledAttributes.getDimensionPixelSize(index, this.f2901W);
                                    continue;
                                case 58:
                                    this.f2902X = obtainStyledAttributes.getDimensionPixelSize(index, this.f2902X);
                                    continue;
                                case 59:
                                    this.f2903Y = obtainStyledAttributes.getDimensionPixelSize(index, this.f2903Y);
                                    continue;
                                default:
                                    switch (i2) {
                                        case 61:
                                            this.f2928x = C0689b.m3388a(obtainStyledAttributes, index, this.f2928x);
                                            continue;
                                        case 62:
                                            this.f2929y = obtainStyledAttributes.getDimensionPixelSize(index, this.f2929y);
                                            continue;
                                        case 63:
                                            this.f2930z = obtainStyledAttributes.getFloat(index, this.f2930z);
                                            continue;
                                        default:
                                            switch (i2) {
                                                case 69:
                                                    this.f2904Z = obtainStyledAttributes.getFloat(index, 1.0f);
                                                    continue;
                                                case 70:
                                                    this.aa = obtainStyledAttributes.getFloat(index, 1.0f);
                                                    continue;
                                                case 71:
                                                    Log.e("ConstraintSet", "CURRENTLY UNSUPPORTED");
                                                    continue;
                                                case 72:
                                                    this.ab = obtainStyledAttributes.getInt(index, this.ab);
                                                    continue;
                                                case 73:
                                                    this.ac = obtainStyledAttributes.getDimensionPixelSize(index, this.ac);
                                                    continue;
                                                case 74:
                                                    this.af = obtainStyledAttributes.getString(index);
                                                    continue;
                                                case 75:
                                                    this.aj = obtainStyledAttributes.getBoolean(index, this.aj);
                                                    continue;
                                                case 76:
                                                    Log.w("ConstraintSet", "unused attribute 0x" + Integer.toHexString(index) + "   " + ak.get(index));
                                                    continue;
                                                case 77:
                                                    this.ag = obtainStyledAttributes.getString(index);
                                                    continue;
                                                default:
                                                    Log.w("ConstraintSet", "Unknown attribute 0x" + Integer.toHexString(index) + "   " + ak.get(index));
                                                    continue;
                                                    continue;
                                                    continue;
                                                    continue;
                                            }
                                    }
                            }
                    }
                } else {
                    this.f175415ai = obtainStyledAttributes.getBoolean(index, this.f175415ai);
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f2868f = sparseIntArray;
        sparseIntArray.append(77, 25);
        f2868f.append(78, 26);
        f2868f.append(80, 29);
        f2868f.append(81, 30);
        f2868f.append(87, 36);
        f2868f.append(86, 35);
        f2868f.append(59, 4);
        f2868f.append(58, 3);
        f2868f.append(56, 1);
        f2868f.append(95, 6);
        f2868f.append(96, 7);
        f2868f.append(66, 17);
        f2868f.append(67, 18);
        f2868f.append(68, 19);
        f2868f.append(0, 27);
        f2868f.append(82, 32);
        f2868f.append(83, 33);
        f2868f.append(65, 10);
        f2868f.append(64, 9);
        f2868f.append(99, 13);
        f2868f.append(102, 16);
        f2868f.append(100, 14);
        f2868f.append(97, 11);
        f2868f.append(101, 15);
        f2868f.append(98, 12);
        f2868f.append(90, 40);
        f2868f.append(75, 39);
        f2868f.append(74, 41);
        f2868f.append(89, 42);
        f2868f.append(73, 20);
        f2868f.append(88, 37);
        f2868f.append(63, 5);
        f2868f.append(76, 82);
        f2868f.append(85, 82);
        f2868f.append(79, 82);
        f2868f.append(57, 82);
        f2868f.append(55, 82);
        f2868f.append(5, 24);
        f2868f.append(7, 28);
        f2868f.append(23, 31);
        f2868f.append(24, 8);
        f2868f.append(6, 34);
        f2868f.append(8, 2);
        f2868f.append(3, 23);
        f2868f.append(4, 21);
        f2868f.append(2, 22);
        f2868f.append(13, 43);
        f2868f.append(26, 44);
        f2868f.append(21, 45);
        f2868f.append(22, 46);
        f2868f.append(20, 60);
        f2868f.append(18, 47);
        f2868f.append(19, 48);
        f2868f.append(14, 49);
        f2868f.append(15, 50);
        f2868f.append(16, 51);
        f2868f.append(17, 52);
        f2868f.append(25, 53);
        f2868f.append(91, 54);
        f2868f.append(69, 55);
        f2868f.append(92, 56);
        f2868f.append(70, 57);
        f2868f.append(93, 58);
        f2868f.append(71, 59);
        f2868f.append(60, 61);
        f2868f.append(62, 62);
        f2868f.append(61, 63);
        f2868f.append(27, 64);
        f2868f.append(ActivityIdentificationData.WALKING, 65);
        f2868f.append(34, 66);
        f2868f.append(108, 67);
        f2868f.append(104, 79);
        f2868f.append(1, 38);
        f2868f.append(103, 68);
        f2868f.append(94, 69);
        f2868f.append(72, 70);
        f2868f.append(31, 71);
        f2868f.append(29, 72);
        f2868f.append(30, 73);
        f2868f.append(32, 74);
        f2868f.append(28, 75);
        f2868f.append(LocationRequest.PRIORITY_NO_POWER, 76);
        f2868f.append(84, 77);
        f2868f.append(SmEvents.EVENT_NR, 78);
        f2868f.append(54, 80);
        f2868f.append(53, 81);
    }

    /* renamed from: a */
    public void mo3895a(boolean z) {
        this.f2871d = z;
    }

    /* renamed from: b */
    public void mo3902b(boolean z) {
        this.f2869b = z;
    }

    /* renamed from: a */
    public C0690a mo3878a(int i) {
        return m3392g(i);
    }

    /* renamed from: b */
    public int mo3897b(int i) {
        return m3392g(i).f2874b.f2941c;
    }

    /* renamed from: c */
    public int mo3903c(int i) {
        return m3392g(i).f2874b.f2940b;
    }

    /* renamed from: d */
    public int mo3906d(int i) {
        return m3392g(i).f2876d.f2908d;
    }

    /* renamed from: e */
    public int mo3909e(int i) {
        return m3392g(i).f2876d.f2907c;
    }

    /* renamed from: androidx.constraintlayout.widget.b$d */
    public static class C0693d {

        /* renamed from: a */
        public boolean f2939a;

        /* renamed from: b */
        public int f2940b;

        /* renamed from: c */
        public int f2941c;

        /* renamed from: d */
        public float f2942d = 1.0f;

        /* renamed from: e */
        public float f2943e = Float.NaN;

        /* renamed from: a */
        public void mo3922a(C0693d dVar) {
            this.f2939a = dVar.f2939a;
            this.f2940b = dVar.f2940b;
            this.f2942d = dVar.f2942d;
            this.f2943e = dVar.f2943e;
            this.f2941c = dVar.f2941c;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo3921a(Context context, AttributeSet attributeSet) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{16842972, 16843551, R.attr.layout_constraintTag, R.attr.motionProgress, R.attr.visibilityMode});
            this.f2939a = true;
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == 1) {
                    this.f2942d = obtainStyledAttributes.getFloat(index, this.f2942d);
                } else if (index == 0) {
                    this.f2940b = obtainStyledAttributes.getInt(index, this.f2940b);
                    this.f2940b = C0689b.f2867a[this.f2940b];
                } else if (index == 4) {
                    this.f2941c = obtainStyledAttributes.getInt(index, this.f2941c);
                } else if (index == 3) {
                    this.f2943e = obtainStyledAttributes.getFloat(index, this.f2943e);
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    /* renamed from: f */
    public C0690a mo3910f(int i) {
        if (this.f2872e.containsKey(Integer.valueOf(i))) {
            return this.f2872e.get(Integer.valueOf(i));
        }
        return null;
    }

    /* renamed from: g */
    private C0690a m3392g(int i) {
        if (!this.f2872e.containsKey(Integer.valueOf(i))) {
            this.f2872e.put(Integer.valueOf(i), new C0690a());
        }
        return this.f2872e.get(Integer.valueOf(i));
    }

    /* renamed from: c */
    public void mo3905c(ConstraintLayout constraintLayout) {
        mo3892a(constraintLayout, true);
        constraintLayout.setConstraintSet(null);
        constraintLayout.requestLayout();
    }

    /* renamed from: d */
    public void mo3908d(ConstraintLayout constraintLayout) {
        int childCount = constraintLayout.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = constraintLayout.getChildAt(i);
            int id = childAt.getId();
            if (!this.f2872e.containsKey(Integer.valueOf(id))) {
                Log.v("ConstraintSet", "id unknown " + C0547a.m2559a(childAt));
            } else if (this.f2871d && id == -1) {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            } else if (this.f2872e.containsKey(Integer.valueOf(id))) {
                ConstraintAttribute.m3339a(childAt, this.f2872e.get(Integer.valueOf(id)).f2878f);
            }
        }
    }

    /* renamed from: b */
    public void mo3901b(ConstraintLayout constraintLayout) {
        int childCount = constraintLayout.getChildCount();
        this.f2872e.clear();
        for (int i = 0; i < childCount; i++) {
            View childAt = constraintLayout.getChildAt(i);
            ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) childAt.getLayoutParams();
            int id = childAt.getId();
            if (!this.f2871d || id != -1) {
                if (!this.f2872e.containsKey(Integer.valueOf(id))) {
                    this.f2872e.put(Integer.valueOf(id), new C0690a());
                }
                C0690a aVar = this.f2872e.get(Integer.valueOf(id));
                aVar.f2878f = ConstraintAttribute.m3337a(this.f2870c, childAt);
                aVar.mo3912a(id, layoutParams);
                aVar.f2874b.f2940b = childAt.getVisibility();
                if (Build.VERSION.SDK_INT >= 17) {
                    aVar.f2874b.f2942d = childAt.getAlpha();
                    aVar.f2877e.f2946b = childAt.getRotation();
                    aVar.f2877e.f2947c = childAt.getRotationX();
                    aVar.f2877e.f2948d = childAt.getRotationY();
                    aVar.f2877e.f2949e = childAt.getScaleX();
                    aVar.f2877e.f2950f = childAt.getScaleY();
                    float pivotX = childAt.getPivotX();
                    float pivotY = childAt.getPivotY();
                    if (!(((double) pivotX) == 0.0d && ((double) pivotY) == 0.0d)) {
                        aVar.f2877e.f2951g = pivotX;
                        aVar.f2877e.f2952h = pivotY;
                    }
                    aVar.f2877e.f2953i = childAt.getTranslationX();
                    aVar.f2877e.f2954j = childAt.getTranslationY();
                    if (Build.VERSION.SDK_INT >= 21) {
                        aVar.f2877e.f2955k = childAt.getTranslationZ();
                        if (aVar.f2877e.f2956l) {
                            aVar.f2877e.f2957m = childAt.getElevation();
                        }
                    }
                }
                if (childAt instanceof Barrier) {
                    Barrier barrier = (Barrier) childAt;
                    aVar.f2876d.aj = barrier.mo3787a();
                    aVar.f2876d.ae = barrier.getReferencedIds();
                    aVar.f2876d.ab = barrier.getType();
                    aVar.f2876d.ac = barrier.getMargin();
                }
            } else {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
        }
    }

    /* renamed from: a */
    public void mo3879a(int i, float f) {
        m3392g(i).f2876d.f2925u = f;
    }

    /* renamed from: b */
    public void mo3898b(int i, float f) {
        m3392g(i).f2876d.f2926v = f;
    }

    /* renamed from: c */
    public void mo3904c(int i, int i2) {
        m3392g(i).f2876d.f2908d = i2;
    }

    /* renamed from: d */
    public void mo3907d(int i, int i2) {
        m3392g(i).f2876d.f2907c = i2;
    }

    /* renamed from: a */
    public void mo3880a(int i, int i2) {
        if (i2 == 0) {
            mo3884a(i, 0, 1, 0, 0, 2, 0, 0.5f);
        } else {
            mo3884a(i, i2, 2, 0, i2, 1, 0, 0.5f);
        }
    }

    /* renamed from: b */
    public void mo3899b(int i, int i2) {
        m3392g(i).f2874b.f2940b = i2;
    }

    /* renamed from: a */
    private int[] m3391a(View view, String str) {
        int i;
        Object designInformation;
        String[] split = str.split(",");
        Context context = view.getContext();
        int[] iArr = new int[split.length];
        int i2 = 0;
        int i3 = 0;
        while (i2 < split.length) {
            String trim = split[i2].trim();
            try {
                i = R$id.class.getField(trim).getInt(null);
            } catch (Exception unused) {
                i = 0;
            }
            if (i == 0) {
                i = context.getResources().getIdentifier(trim, "id", context.getPackageName());
            }
            if (i == 0 && view.isInEditMode() && (view.getParent() instanceof ConstraintLayout) && (designInformation = ((ConstraintLayout) view.getParent()).getDesignInformation(0, trim)) != null && (designInformation instanceof Integer)) {
                i = ((Integer) designInformation).intValue();
            }
            iArr[i3] = i;
            i2++;
            i3++;
        }
        if (i3 != split.length) {
            return Arrays.copyOf(iArr, i3);
        }
        return iArr;
    }

    /* renamed from: b */
    public void mo3900b(Context context, int i) {
        XmlResourceParser xml = context.getResources().getXml(i);
        try {
            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                if (eventType == 0) {
                    xml.getName();
                } else if (eventType == 2) {
                    String name = xml.getName();
                    C0690a a = m3389a(context, Xml.asAttributeSet(xml));
                    if (name.equalsIgnoreCase("Guideline")) {
                        a.f2876d.f2905a = true;
                    }
                    this.f2872e.put(Integer.valueOf(a.f2873a), a);
                }
            }
        } catch (XmlPullParserException e) {
            e.printStackTrace();
        } catch (IOException e2) {
            e2.printStackTrace();
        }
    }

    /* renamed from: a */
    private C0690a m3389a(Context context, AttributeSet attributeSet) {
        C0690a aVar = new C0690a();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{16842948, 16842960, 16842972, 16842996, 16842997, 16842999, 16843000, 16843001, 16843002, 16843039, 16843040, 16843071, 16843072, 16843551, 16843552, 16843553, 16843554, 16843555, 16843556, 16843557, 16843558, 16843559, 16843560, 16843701, 16843702, 16843770, 16843840, R.attr.animate_relativeTo, R.attr.barrierAllowsGoneWidgets, R.attr.barrierDirection, R.attr.barrierMargin, R.attr.chainUseRtl, R.attr.constraint_referenced_ids, R.attr.constraint_referenced_tags, R.attr.drawPath, R.attr.flow_firstHorizontalBias, R.attr.flow_firstHorizontalStyle, R.attr.flow_firstVerticalBias, R.attr.flow_firstVerticalStyle, R.attr.flow_horizontalAlign, R.attr.flow_horizontalBias, R.attr.flow_horizontalGap, R.attr.flow_horizontalStyle, R.attr.flow_lastHorizontalBias, R.attr.flow_lastHorizontalStyle, R.attr.flow_lastVerticalBias, R.attr.flow_lastVerticalStyle, R.attr.flow_maxElementsWrap, R.attr.flow_verticalAlign, R.attr.flow_verticalBias, R.attr.flow_verticalGap, R.attr.flow_verticalStyle, R.attr.flow_wrapMode, R.attr.layout_constrainedHeight, R.attr.layout_constrainedWidth, R.attr.layout_constraintBaseline_creator, R.attr.layout_constraintBaseline_toBaselineOf, R.attr.layout_constraintBottom_creator, R.attr.layout_constraintBottom_toBottomOf, R.attr.layout_constraintBottom_toTopOf, R.attr.layout_constraintCircle, R.attr.layout_constraintCircleAngle, R.attr.layout_constraintCircleRadius, R.attr.layout_constraintDimensionRatio, R.attr.layout_constraintEnd_toEndOf, R.attr.layout_constraintEnd_toStartOf, R.attr.layout_constraintGuide_begin, R.attr.layout_constraintGuide_end, R.attr.layout_constraintGuide_percent, R.attr.layout_constraintHeight_default, R.attr.layout_constraintHeight_max, R.attr.layout_constraintHeight_min, R.attr.layout_constraintHeight_percent, R.attr.layout_constraintHorizontal_bias, R.attr.layout_constraintHorizontal_chainStyle, R.attr.layout_constraintHorizontal_weight, R.attr.layout_constraintLeft_creator, R.attr.layout_constraintLeft_toLeftOf, R.attr.layout_constraintLeft_toRightOf, R.attr.layout_constraintRight_creator, R.attr.layout_constraintRight_toLeftOf, R.attr.layout_constraintRight_toRightOf, R.attr.layout_constraintStart_toEndOf, R.attr.layout_constraintStart_toStartOf, R.attr.layout_constraintTag, R.attr.layout_constraintTop_creator, R.attr.layout_constraintTop_toBottomOf, R.attr.layout_constraintTop_toTopOf, R.attr.layout_constraintVertical_bias, R.attr.layout_constraintVertical_chainStyle, R.attr.layout_constraintVertical_weight, R.attr.layout_constraintWidth_default, R.attr.layout_constraintWidth_max, R.attr.layout_constraintWidth_min, R.attr.layout_constraintWidth_percent, R.attr.layout_editor_absoluteX, R.attr.layout_editor_absoluteY, R.attr.layout_goneMarginBottom, R.attr.layout_goneMarginEnd, R.attr.layout_goneMarginLeft, R.attr.layout_goneMarginRight, R.attr.layout_goneMarginStart, R.attr.layout_goneMarginTop, R.attr.motionProgress, R.attr.motionStagger, R.attr.pathMotionArc, R.attr.pivotAnchor, R.attr.transitionEasing, R.attr.transitionPathRotate, R.attr.visibilityMode});
        m3390a(context, aVar, obtainStyledAttributes);
        obtainStyledAttributes.recycle();
        return aVar;
    }

    /* renamed from: a */
    public static int m3388a(TypedArray typedArray, int i, int i2) {
        int resourceId = typedArray.getResourceId(i, i2);
        if (resourceId == -1) {
            return typedArray.getInt(i, -1);
        }
        return resourceId;
    }

    /* renamed from: a */
    public void mo3881a(int i, int i2, int i3) {
        C0690a g = m3392g(i);
        switch (i2) {
            case 1:
                g.f2876d.f2882D = i3;
                return;
            case 2:
                g.f2876d.f2883E = i3;
                return;
            case 3:
                g.f2876d.f2884F = i3;
                return;
            case 4:
                g.f2876d.f2885G = i3;
                return;
            case 5:
                throw new IllegalArgumentException("baseline does not support margins");
            case 6:
                g.f2876d.f2887I = i3;
                return;
            case 7:
                g.f2876d.f2886H = i3;
                return;
            default:
                throw new IllegalArgumentException("unknown constraint");
        }
    }

    /* renamed from: a */
    private void m3390a(Context context, C0690a aVar, TypedArray typedArray) {
        int indexCount = typedArray.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = typedArray.getIndex(i);
            if (!(index == 1 || 23 == index || 24 == index)) {
                aVar.f2875c.f2932a = true;
                aVar.f2876d.f2906b = true;
                aVar.f2874b.f2939a = true;
                aVar.f2877e.f2945a = true;
            }
            switch (f2868f.get(index)) {
                case 1:
                    aVar.f2876d.f2920p = m3388a(typedArray, index, aVar.f2876d.f2920p);
                    break;
                case 2:
                    aVar.f2876d.f2885G = typedArray.getDimensionPixelSize(index, aVar.f2876d.f2885G);
                    break;
                case 3:
                    aVar.f2876d.f2919o = m3388a(typedArray, index, aVar.f2876d.f2919o);
                    break;
                case 4:
                    aVar.f2876d.f2918n = m3388a(typedArray, index, aVar.f2876d.f2918n);
                    break;
                case 5:
                    aVar.f2876d.f2927w = typedArray.getString(index);
                    break;
                case 6:
                    aVar.f2876d.f2879A = typedArray.getDimensionPixelOffset(index, aVar.f2876d.f2879A);
                    break;
                case 7:
                    aVar.f2876d.f2880B = typedArray.getDimensionPixelOffset(index, aVar.f2876d.f2880B);
                    break;
                case 8:
                    if (Build.VERSION.SDK_INT >= 17) {
                        aVar.f2876d.f2886H = typedArray.getDimensionPixelSize(index, aVar.f2876d.f2886H);
                        break;
                    } else {
                        break;
                    }
                case 9:
                    aVar.f2876d.f2924t = m3388a(typedArray, index, aVar.f2876d.f2924t);
                    break;
                case 10:
                    aVar.f2876d.f2923s = m3388a(typedArray, index, aVar.f2876d.f2923s);
                    break;
                case 11:
                    aVar.f2876d.f2891M = typedArray.getDimensionPixelSize(index, aVar.f2876d.f2891M);
                    break;
                case HwBuildEx.VersionCodes.EMUI_5_1 /*{ENCODED_INT: 12}*/:
                    aVar.f2876d.f2892N = typedArray.getDimensionPixelSize(index, aVar.f2876d.f2892N);
                    break;
                case 13:
                    aVar.f2876d.f2888J = typedArray.getDimensionPixelSize(index, aVar.f2876d.f2888J);
                    break;
                case 14:
                    aVar.f2876d.f2890L = typedArray.getDimensionPixelSize(index, aVar.f2876d.f2890L);
                    break;
                case 15:
                    aVar.f2876d.f2893O = typedArray.getDimensionPixelSize(index, aVar.f2876d.f2893O);
                    break;
                case 16:
                    aVar.f2876d.f2889K = typedArray.getDimensionPixelSize(index, aVar.f2876d.f2889K);
                    break;
                case 17:
                    aVar.f2876d.f2909e = typedArray.getDimensionPixelOffset(index, aVar.f2876d.f2909e);
                    break;
                case 18:
                    aVar.f2876d.f2910f = typedArray.getDimensionPixelOffset(index, aVar.f2876d.f2910f);
                    break;
                case 19:
                    aVar.f2876d.f2911g = typedArray.getFloat(index, aVar.f2876d.f2911g);
                    break;
                case 20:
                    aVar.f2876d.f2925u = typedArray.getFloat(index, aVar.f2876d.f2925u);
                    break;
                case 21:
                    aVar.f2876d.f2908d = typedArray.getLayoutDimension(index, aVar.f2876d.f2908d);
                    break;
                case 22:
                    aVar.f2874b.f2940b = typedArray.getInt(index, aVar.f2874b.f2940b);
                    aVar.f2874b.f2940b = f2867a[aVar.f2874b.f2940b];
                    break;
                case 23:
                    aVar.f2876d.f2907c = typedArray.getLayoutDimension(index, aVar.f2876d.f2907c);
                    break;
                case 24:
                    aVar.f2876d.f2882D = typedArray.getDimensionPixelSize(index, aVar.f2876d.f2882D);
                    break;
                case AvailableCode.ERROR_ON_ACTIVITY_RESULT /*{ENCODED_INT: 25}*/:
                    aVar.f2876d.f2912h = m3388a(typedArray, index, aVar.f2876d.f2912h);
                    break;
                case 26:
                    aVar.f2876d.f2913i = m3388a(typedArray, index, aVar.f2876d.f2913i);
                    break;
                case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /*{ENCODED_INT: 27}*/:
                    aVar.f2876d.f2881C = typedArray.getInt(index, aVar.f2876d.f2881C);
                    break;
                case IVideoEventLogger.LOGGER_OPTION_ENABLE_SR /*{ENCODED_INT: 28}*/:
                    aVar.f2876d.f2883E = typedArray.getDimensionPixelSize(index, aVar.f2876d.f2883E);
                    break;
                case 29:
                    aVar.f2876d.f2914j = m3388a(typedArray, index, aVar.f2876d.f2914j);
                    break;
                case 30:
                    aVar.f2876d.f2915k = m3388a(typedArray, index, aVar.f2876d.f2915k);
                    break;
                case TTVideoEngine.PLAYER_OPTION_ENABLE_PLAYER3_HARDWARE_DECODE /*{ENCODED_INT: 31}*/:
                    if (Build.VERSION.SDK_INT >= 17) {
                        aVar.f2876d.f2887I = typedArray.getDimensionPixelSize(index, aVar.f2876d.f2887I);
                        break;
                    } else {
                        break;
                    }
                case 32:
                    aVar.f2876d.f2921q = m3388a(typedArray, index, aVar.f2876d.f2921q);
                    break;
                case 33:
                    aVar.f2876d.f2922r = m3388a(typedArray, index, aVar.f2876d.f2922r);
                    break;
                case 34:
                    aVar.f2876d.f2884F = typedArray.getDimensionPixelSize(index, aVar.f2876d.f2884F);
                    break;
                case 35:
                    aVar.f2876d.f2917m = m3388a(typedArray, index, aVar.f2876d.f2917m);
                    break;
                case 36:
                    aVar.f2876d.f2916l = m3388a(typedArray, index, aVar.f2876d.f2916l);
                    break;
                case 37:
                    aVar.f2876d.f2926v = typedArray.getFloat(index, aVar.f2876d.f2926v);
                    break;
                case 38:
                    aVar.f2873a = typedArray.getResourceId(index, aVar.f2873a);
                    break;
                case 39:
                    aVar.f2876d.f2895Q = typedArray.getFloat(index, aVar.f2876d.f2895Q);
                    break;
                case 40:
                    aVar.f2876d.f2894P = typedArray.getFloat(index, aVar.f2876d.f2894P);
                    break;
                case 41:
                    aVar.f2876d.f2896R = typedArray.getInt(index, aVar.f2876d.f2896R);
                    break;
                case 42:
                    aVar.f2876d.f2897S = typedArray.getInt(index, aVar.f2876d.f2897S);
                    break;
                case 43:
                    aVar.f2874b.f2942d = typedArray.getFloat(index, aVar.f2874b.f2942d);
                    break;
                case 44:
                    if (Build.VERSION.SDK_INT >= 21) {
                        aVar.f2877e.f2956l = true;
                        aVar.f2877e.f2957m = typedArray.getDimension(index, aVar.f2877e.f2957m);
                        break;
                    } else {
                        break;
                    }
                case 45:
                    aVar.f2877e.f2947c = typedArray.getFloat(index, aVar.f2877e.f2947c);
                    break;
                case 46:
                    aVar.f2877e.f2948d = typedArray.getFloat(index, aVar.f2877e.f2948d);
                    break;
                case 47:
                    aVar.f2877e.f2949e = typedArray.getFloat(index, aVar.f2877e.f2949e);
                    break;
                case 48:
                    aVar.f2877e.f2950f = typedArray.getFloat(index, aVar.f2877e.f2950f);
                    break;
                case 49:
                    aVar.f2877e.f2951g = typedArray.getDimension(index, aVar.f2877e.f2951g);
                    break;
                case MmListControl.f116813f /*{ENCODED_INT: 50}*/:
                    aVar.f2877e.f2952h = typedArray.getDimension(index, aVar.f2877e.f2952h);
                    break;
                case 51:
                    aVar.f2877e.f2953i = typedArray.getDimension(index, aVar.f2877e.f2953i);
                    break;
                case 52:
                    aVar.f2877e.f2954j = typedArray.getDimension(index, aVar.f2877e.f2954j);
                    break;
                case 53:
                    if (Build.VERSION.SDK_INT >= 21) {
                        aVar.f2877e.f2955k = typedArray.getDimension(index, aVar.f2877e.f2955k);
                        break;
                    } else {
                        break;
                    }
                case 54:
                    aVar.f2876d.f2898T = typedArray.getInt(index, aVar.f2876d.f2898T);
                    break;
                case 55:
                    aVar.f2876d.f2899U = typedArray.getInt(index, aVar.f2876d.f2899U);
                    break;
                case 56:
                    aVar.f2876d.f2900V = typedArray.getDimensionPixelSize(index, aVar.f2876d.f2900V);
                    break;
                case 57:
                    aVar.f2876d.f2901W = typedArray.getDimensionPixelSize(index, aVar.f2876d.f2901W);
                    break;
                case 58:
                    aVar.f2876d.f2902X = typedArray.getDimensionPixelSize(index, aVar.f2876d.f2902X);
                    break;
                case 59:
                    aVar.f2876d.f2903Y = typedArray.getDimensionPixelSize(index, aVar.f2876d.f2903Y);
                    break;
                case 60:
                    aVar.f2877e.f2946b = typedArray.getFloat(index, aVar.f2877e.f2946b);
                    break;
                case 61:
                    aVar.f2876d.f2928x = m3388a(typedArray, index, aVar.f2876d.f2928x);
                    break;
                case 62:
                    aVar.f2876d.f2929y = typedArray.getDimensionPixelSize(index, aVar.f2876d.f2929y);
                    break;
                case 63:
                    aVar.f2876d.f2930z = typedArray.getFloat(index, aVar.f2876d.f2930z);
                    break;
                case 64:
                    aVar.f2875c.f2933b = m3388a(typedArray, index, aVar.f2875c.f2933b);
                    break;
                case 65:
                    if (typedArray.peekValue(index).type == 3) {
                        aVar.f2875c.f2934c = typedArray.getString(index);
                        break;
                    } else {
                        aVar.f2875c.f2934c = C0530c.f1948c[typedArray.getInteger(index, 0)];
                        break;
                    }
                case 66:
                    aVar.f2875c.f2936e = typedArray.getInt(index, 0);
                    break;
                case 67:
                    aVar.f2875c.f2938g = typedArray.getFloat(index, aVar.f2875c.f2938g);
                    break;
                case 68:
                    aVar.f2874b.f2943e = typedArray.getFloat(index, aVar.f2874b.f2943e);
                    break;
                case 69:
                    aVar.f2876d.f2904Z = typedArray.getFloat(index, 1.0f);
                    break;
                case 70:
                    aVar.f2876d.aa = typedArray.getFloat(index, 1.0f);
                    break;
                case 71:
                    Log.e("ConstraintSet", "CURRENTLY UNSUPPORTED");
                    break;
                case 72:
                    aVar.f2876d.ab = typedArray.getInt(index, aVar.f2876d.ab);
                    break;
                case 73:
                    aVar.f2876d.ac = typedArray.getDimensionPixelSize(index, aVar.f2876d.ac);
                    break;
                case 74:
                    aVar.f2876d.af = typedArray.getString(index);
                    break;
                case 75:
                    aVar.f2876d.aj = typedArray.getBoolean(index, aVar.f2876d.aj);
                    break;
                case 76:
                    aVar.f2875c.f2935d = typedArray.getInt(index, aVar.f2875c.f2935d);
                    break;
                case 77:
                    aVar.f2876d.ag = typedArray.getString(index);
                    break;
                case 78:
                    aVar.f2874b.f2941c = typedArray.getInt(index, aVar.f2874b.f2941c);
                    break;
                case 79:
                    aVar.f2875c.f2937f = typedArray.getFloat(index, aVar.f2875c.f2937f);
                    break;
                case CalendarSearchResultRv.f82651b /*{ENCODED_INT: 80}*/:
                    aVar.f2876d.ah = typedArray.getBoolean(index, aVar.f2876d.ah);
                    break;
                case 81:
                    aVar.f2876d.f175415ai = typedArray.getBoolean(index, aVar.f2876d.f175415ai);
                    break;
                case 82:
                    Log.w("ConstraintSet", "unused attribute 0x" + Integer.toHexString(index) + "   " + f2868f.get(index));
                    break;
                default:
                    Log.w("ConstraintSet", "Unknown attribute 0x" + Integer.toHexString(index) + "   " + f2868f.get(index));
                    break;
            }
        }
    }

    /* renamed from: a */
    public void mo3882a(int i, int i2, int i3, int i4) {
        if (!this.f2872e.containsKey(Integer.valueOf(i))) {
            this.f2872e.put(Integer.valueOf(i), new C0690a());
        }
        C0690a aVar = this.f2872e.get(Integer.valueOf(i));
        switch (i2) {
            case 1:
                if (i4 == 1) {
                    aVar.f2876d.f2912h = i3;
                    aVar.f2876d.f2913i = -1;
                    return;
                } else if (i4 == 2) {
                    aVar.f2876d.f2913i = i3;
                    aVar.f2876d.f2912h = -1;
                    return;
                } else {
                    throw new IllegalArgumentException("left to " + m3393h(i4) + " undefined");
                }
            case 2:
                if (i4 == 1) {
                    aVar.f2876d.f2914j = i3;
                    aVar.f2876d.f2915k = -1;
                    return;
                } else if (i4 == 2) {
                    aVar.f2876d.f2915k = i3;
                    aVar.f2876d.f2914j = -1;
                    return;
                } else {
                    throw new IllegalArgumentException("right to " + m3393h(i4) + " undefined");
                }
            case 3:
                if (i4 == 3) {
                    aVar.f2876d.f2916l = i3;
                    aVar.f2876d.f2917m = -1;
                    aVar.f2876d.f2920p = -1;
                    return;
                } else if (i4 == 4) {
                    aVar.f2876d.f2917m = i3;
                    aVar.f2876d.f2916l = -1;
                    aVar.f2876d.f2920p = -1;
                    return;
                } else {
                    throw new IllegalArgumentException("right to " + m3393h(i4) + " undefined");
                }
            case 4:
                if (i4 == 4) {
                    aVar.f2876d.f2919o = i3;
                    aVar.f2876d.f2918n = -1;
                    aVar.f2876d.f2920p = -1;
                    return;
                } else if (i4 == 3) {
                    aVar.f2876d.f2918n = i3;
                    aVar.f2876d.f2919o = -1;
                    aVar.f2876d.f2920p = -1;
                    return;
                } else {
                    throw new IllegalArgumentException("right to " + m3393h(i4) + " undefined");
                }
            case 5:
                if (i4 == 5) {
                    aVar.f2876d.f2920p = i3;
                    aVar.f2876d.f2919o = -1;
                    aVar.f2876d.f2918n = -1;
                    aVar.f2876d.f2916l = -1;
                    aVar.f2876d.f2917m = -1;
                    return;
                }
                throw new IllegalArgumentException("right to " + m3393h(i4) + " undefined");
            case 6:
                if (i4 == 6) {
                    aVar.f2876d.f2922r = i3;
                    aVar.f2876d.f2921q = -1;
                    return;
                } else if (i4 == 7) {
                    aVar.f2876d.f2921q = i3;
                    aVar.f2876d.f2922r = -1;
                    return;
                } else {
                    throw new IllegalArgumentException("right to " + m3393h(i4) + " undefined");
                }
            case 7:
                if (i4 == 7) {
                    aVar.f2876d.f2924t = i3;
                    aVar.f2876d.f2923s = -1;
                    return;
                } else if (i4 == 6) {
                    aVar.f2876d.f2923s = i3;
                    aVar.f2876d.f2924t = -1;
                    return;
                } else {
                    throw new IllegalArgumentException("right to " + m3393h(i4) + " undefined");
                }
            default:
                throw new IllegalArgumentException(m3393h(i2) + " to " + m3393h(i4) + " unknown");
        }
    }
}
