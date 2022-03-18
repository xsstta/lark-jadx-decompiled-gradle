package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.view.View;
import com.larksuite.suite.R;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.HashSet;

/* renamed from: androidx.constraintlayout.motion.widget.l */
public class C0578l extends AbstractC0549c {

    /* renamed from: g */
    public String f2199g;

    /* renamed from: h */
    public int f2200h = f2095a;

    /* renamed from: i */
    public String f2201i;

    /* renamed from: j */
    public String f2202j;

    /* renamed from: k */
    public int f2203k = f2095a;

    /* renamed from: l */
    public int f2204l = f2095a;

    /* renamed from: m */
    float f2205m = 0.1f;

    /* renamed from: n */
    public float f2206n = Float.NaN;

    /* renamed from: o */
    public boolean f2207o;

    /* renamed from: p */
    RectF f2208p = new RectF();

    /* renamed from: q */
    RectF f2209q = new RectF();

    /* renamed from: r */
    private int f2210r = -1;

    /* renamed from: s */
    private View f2211s;

    /* renamed from: t */
    private boolean f2212t = true;

    /* renamed from: u */
    private boolean f2213u = true;

    /* renamed from: v */
    private boolean f2214v = true;

    /* renamed from: w */
    private Method f2215w;

    /* renamed from: x */
    private Method f2216x;

    /* renamed from: y */
    private Method f2217y;

    /* renamed from: z */
    private float f2218z;

    @Override // androidx.constraintlayout.motion.widget.AbstractC0549c
    /* renamed from: a */
    public void mo3233a(HashMap<String, AbstractC0588r> hashMap) {
    }

    @Override // androidx.constraintlayout.motion.widget.AbstractC0549c
    /* renamed from: a */
    public void mo3234a(HashSet<String> hashSet) {
    }

    public C0578l() {
        this.f2099e = 5;
        this.f2100f = new HashMap();
    }

    /* renamed from: androidx.constraintlayout.motion.widget.l$a */
    private static class C0579a {

        /* renamed from: a */
        private static SparseIntArray f2219a;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f2219a = sparseIntArray;
            sparseIntArray.append(0, 8);
            f2219a.append(4, 4);
            f2219a.append(5, 1);
            f2219a.append(6, 2);
            f2219a.append(1, 7);
            f2219a.append(7, 6);
            f2219a.append(9, 5);
            f2219a.append(3, 9);
            f2219a.append(2, 10);
            f2219a.append(8, 11);
        }

        /* renamed from: a */
        public static void m2625a(C0578l lVar, TypedArray typedArray, Context context) {
            int indexCount = typedArray.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArray.getIndex(i);
                switch (f2219a.get(index)) {
                    case 1:
                        lVar.f2201i = typedArray.getString(index);
                        continue;
                    case 2:
                        lVar.f2202j = typedArray.getString(index);
                        continue;
                    case 4:
                        lVar.f2199g = typedArray.getString(index);
                        continue;
                    case 5:
                        lVar.f2205m = typedArray.getFloat(index, lVar.f2205m);
                        continue;
                    case 6:
                        lVar.f2203k = typedArray.getResourceId(index, lVar.f2203k);
                        continue;
                    case 7:
                        if (MotionLayout.f1994a) {
                            lVar.f2097c = typedArray.getResourceId(index, lVar.f2097c);
                            if (lVar.f2097c == -1) {
                                lVar.f2098d = typedArray.getString(index);
                            } else {
                                continue;
                            }
                        } else if (typedArray.peekValue(index).type == 3) {
                            lVar.f2098d = typedArray.getString(index);
                        } else {
                            lVar.f2097c = typedArray.getResourceId(index, lVar.f2097c);
                        }
                    case 8:
                        lVar.f2096b = typedArray.getInteger(index, lVar.f2096b);
                        lVar.f2206n = (((float) lVar.f2096b) + 0.5f) / 100.0f;
                        continue;
                    case 9:
                        lVar.f2204l = typedArray.getResourceId(index, lVar.f2204l);
                        continue;
                    case 10:
                        lVar.f2207o = typedArray.getBoolean(index, lVar.f2207o);
                        continue;
                    case 11:
                        lVar.f2200h = typedArray.getResourceId(index, lVar.f2200h);
                        break;
                }
                Log.e("KeyTrigger", "unused attribute 0x" + Integer.toHexString(index) + "   " + f2219a.get(index));
            }
        }
    }

    @Override // androidx.constraintlayout.motion.widget.AbstractC0549c
    /* renamed from: a */
    public void mo3232a(Context context, AttributeSet attributeSet) {
        C0579a.m2625a(this, context.obtainStyledAttributes(attributeSet, new int[]{R.attr.framePosition, R.attr.motionTarget, R.attr.motion_postLayoutCollision, R.attr.motion_triggerOnCollision, R.attr.onCross, R.attr.onNegativeCross, R.attr.onPositiveCross, R.attr.triggerId, R.attr.triggerReceiver, R.attr.triggerSlack}), context);
    }

    /* JADX WARNING: Removed duplicated region for block: B:108:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x008d  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00a2  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00b7  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00ce  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x00fa  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x011a A[SYNTHETIC, Splitter:B:73:0x011a] */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x0193 A[SYNTHETIC, Splitter:B:86:0x0193] */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x0204  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo3259a(float r11, android.view.View r12) {
        /*
        // Method dump skipped, instructions count: 636
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.motion.widget.C0578l.mo3259a(float, android.view.View):void");
    }

    /* renamed from: a */
    private void m2620a(RectF rectF, View view, boolean z) {
        rectF.top = (float) view.getTop();
        rectF.bottom = (float) view.getBottom();
        rectF.left = (float) view.getLeft();
        rectF.right = (float) view.getRight();
        if (z) {
            view.getMatrix().mapRect(rectF);
        }
    }
}
