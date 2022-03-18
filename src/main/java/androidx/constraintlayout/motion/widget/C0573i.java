package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import androidx.constraintlayout.motion.p024a.C0530c;
import com.huawei.hms.android.HwBuildEx;
import com.larksuite.suite.R;
import java.util.HashMap;

/* renamed from: androidx.constraintlayout.motion.widget.i */
public class C0573i extends AbstractC0575j {

    /* renamed from: g */
    String f2167g;

    /* renamed from: h */
    int f2168h = f2095a;

    /* renamed from: i */
    int f2169i;

    /* renamed from: j */
    float f2170j = Float.NaN;

    /* renamed from: k */
    float f2171k = Float.NaN;

    /* renamed from: l */
    float f2172l = Float.NaN;

    /* renamed from: m */
    float f2173m = Float.NaN;

    /* renamed from: n */
    float f2174n = Float.NaN;

    /* renamed from: o */
    float f2175o = Float.NaN;

    /* renamed from: p */
    int f2176p;

    /* renamed from: r */
    private float f2177r = Float.NaN;

    /* renamed from: s */
    private float f2178s = Float.NaN;

    @Override // androidx.constraintlayout.motion.widget.AbstractC0549c
    /* renamed from: a */
    public void mo3233a(HashMap<String, AbstractC0588r> hashMap) {
    }

    public C0573i() {
        this.f2099e = 2;
    }

    /* renamed from: androidx.constraintlayout.motion.widget.i$a */
    private static class C0574a {

        /* renamed from: a */
        private static SparseIntArray f2179a;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f2179a = sparseIntArray;
            sparseIntArray.append(4, 1);
            f2179a.append(2, 2);
            f2179a.append(11, 3);
            f2179a.append(0, 4);
            f2179a.append(1, 5);
            f2179a.append(8, 6);
            f2179a.append(9, 7);
            f2179a.append(3, 9);
            f2179a.append(10, 8);
            f2179a.append(7, 11);
            f2179a.append(6, 12);
            f2179a.append(5, 10);
        }

        /* renamed from: a */
        public static void m2612a(C0573i iVar, TypedArray typedArray) {
            int indexCount = typedArray.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArray.getIndex(i);
                switch (f2179a.get(index)) {
                    case 1:
                        if (!MotionLayout.f1994a) {
                            if (typedArray.peekValue(index).type == 3) {
                                iVar.f2098d = typedArray.getString(index);
                                break;
                            } else {
                                iVar.f2097c = typedArray.getResourceId(index, iVar.f2097c);
                                break;
                            }
                        } else {
                            iVar.f2097c = typedArray.getResourceId(index, iVar.f2097c);
                            if (iVar.f2097c == -1) {
                                iVar.f2098d = typedArray.getString(index);
                                break;
                            } else {
                                break;
                            }
                        }
                    case 2:
                        iVar.f2096b = typedArray.getInt(index, iVar.f2096b);
                        break;
                    case 3:
                        if (typedArray.peekValue(index).type == 3) {
                            iVar.f2167g = typedArray.getString(index);
                            break;
                        } else {
                            iVar.f2167g = C0530c.f1948c[typedArray.getInteger(index, 0)];
                            break;
                        }
                    case 4:
                        iVar.f2180q = typedArray.getInteger(index, iVar.f2180q);
                        break;
                    case 5:
                        iVar.f2169i = typedArray.getInt(index, iVar.f2169i);
                        break;
                    case 6:
                        iVar.f2172l = typedArray.getFloat(index, iVar.f2172l);
                        break;
                    case 7:
                        iVar.f2173m = typedArray.getFloat(index, iVar.f2173m);
                        break;
                    case 8:
                        float f = typedArray.getFloat(index, iVar.f2171k);
                        iVar.f2170j = f;
                        iVar.f2171k = f;
                        break;
                    case 9:
                        iVar.f2176p = typedArray.getInt(index, iVar.f2176p);
                        break;
                    case 10:
                        iVar.f2168h = typedArray.getInt(index, iVar.f2168h);
                        break;
                    case 11:
                        iVar.f2170j = typedArray.getFloat(index, iVar.f2170j);
                        break;
                    case HwBuildEx.VersionCodes.EMUI_5_1 /*{ENCODED_INT: 12}*/:
                        iVar.f2171k = typedArray.getFloat(index, iVar.f2171k);
                        break;
                    default:
                        Log.e("KeyPosition", "unused attribute 0x" + Integer.toHexString(index) + "   " + f2179a.get(index));
                        break;
                }
            }
            if (iVar.f2096b == -1) {
                Log.e("KeyPosition", "no frame position");
            }
        }
    }

    @Override // androidx.constraintlayout.motion.widget.AbstractC0549c
    /* renamed from: a */
    public void mo3232a(Context context, AttributeSet attributeSet) {
        C0574a.m2612a(this, context.obtainStyledAttributes(attributeSet, new int[]{R.attr.curveFit, R.attr.drawPath, R.attr.framePosition, R.attr.keyPositionType, R.attr.motionTarget, R.attr.pathMotionArc, R.attr.percentHeight, R.attr.percentWidth, R.attr.percentX, R.attr.percentY, R.attr.sizePercent, R.attr.transitionEasing}));
    }
}
