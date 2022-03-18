package com.lynx.tasm.behavior;

import android.graphics.Rect;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.lynx.react.bridge.ReadableArray;
import com.lynx.react.bridge.ReadableMap;
import com.lynx.tasm.behavior.p1223c.p1224a.AbstractC26638a;
import com.lynx.tasm.behavior.shadow.MeasureMode;
import com.lynx.tasm.behavior.ui.LynxBaseUI;

public final class PaintingContext {

    /* renamed from: a */
    private final C26690o f65898a;

    /* renamed from: b */
    private final AbstractC26638a f65899b;

    /* renamed from: a */
    public void mo94538a() {
        this.f65899b.mo94609a();
    }

    /* renamed from: b */
    public void mo94540b() {
        this.f65899b.mo94627d();
    }

    public void flush() {
        this.f65899b.mo94626c();
    }

    public void FinishLayoutOperation(long j) {
        this.f65899b.mo94623b(j);
    }

    public void FinishTasmOperation(long j) {
        this.f65899b.mo94619a(j);
    }

    public void setFontFaces(ReadableMap readableMap) {
        this.f65899b.mo94624b(readableMap);
    }

    public void setKeyframes(ReadableMap readableMap) {
        this.f65899b.mo94620a(readableMap);
    }

    public void validate(int i) {
        this.f65899b.mo94610a(i);
    }

    public float[] getBoundingClientOrigin(int i) {
        float[] fArr = {BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED};
        LynxBaseUI a = this.f65898a.mo94708a(i);
        if (a != null) {
            Rect L = a.mo94929L();
            fArr[0] = (float) L.left;
            fArr[1] = (float) L.top;
        }
        return fArr;
    }

    public PaintingContext(C26690o oVar, AbstractC26638a aVar) {
        this.f65898a = oVar;
        this.f65899b = aVar;
    }

    public void destroyNode(int i, int i2) {
        this.f65899b.mo94622b(i, i2);
    }

    public void removeNode(int i, int i2) {
        this.f65899b.mo94612a(i, i2);
    }

    public void setAttributes(int i, ReadableMap readableMap) {
        C26690o oVar = this.f65898a;
        if (oVar != null) {
            oVar.mo94723a(i, readableMap);
        }
    }

    public void setTransitionData(int i, float[] fArr) {
        C26690o oVar = this.f65898a;
        if (oVar != null) {
            oVar.mo94730a(i, fArr);
        }
    }

    public void updateFlattenStatus(int i, boolean z) {
        this.f65899b.mo94618a(i, z);
    }

    public void updateProps(int i, ReadableMap readableMap) {
        this.f65899b.mo94614a(i, readableMap);
    }

    /* renamed from: a */
    public void mo94539a(int i, Object obj) {
        this.f65899b.mo94615a(i, obj);
    }

    public void insertNode(int i, int i2, int i3) {
        this.f65899b.mo94613a(i, i2, i3);
    }

    public void setShadowData(int i, float[] fArr, int[] iArr) {
        C26690o oVar = this.f65898a;
        if (oVar != null) {
            oVar.mo94731a(i, fArr, iArr);
        }
    }

    public void setStringAttributes(int i, String[] strArr, String[] strArr2) {
        C26690o oVar = this.f65898a;
        if (oVar != null) {
            oVar.mo94736a(i, strArr, strArr2);
        }
    }

    public void setTransformData(int i, int[] iArr, float[] fArr) {
        C26690o oVar = this.f65898a;
        if (oVar != null) {
            oVar.mo94734a(i, iArr, fArr);
        }
    }

    public void UpdateLayoutPatchings(int[] iArr, int[][] iArr2, int[][] iArr3) {
        if (this.f65898a != null) {
            int length = iArr.length;
            for (int i = 0; i < length; i++) {
                this.f65898a.mo94718a(iArr[i], iArr2[i][0], iArr2[i][1], iArr2[i][2], iArr2[i][3], iArr3[i][0], iArr3[i][1], iArr3[i][2], iArr3[i][3]);
            }
        }
    }

    public void setInlineImageStyleData(int i, float[] fArr, int[] iArr, int[] iArr2) {
        C26690o oVar = this.f65898a;
        if (oVar != null) {
            oVar.mo94732a(i, fArr, iArr, iArr2);
        }
    }

    public void setTextStyleData(int i, int[] iArr, float[] fArr, String str) {
        C26690o oVar = this.f65898a;
        if (oVar != null) {
            oVar.mo94735a(i, iArr, fArr, str);
        }
    }

    public void createNode(int i, String str, ReadableMap readableMap, ReadableArray readableArray, boolean z) {
        this.f65899b.mo94616a(i, str, readableMap, readableArray, z);
    }

    public long measureText(int i, float f, int i2, float f2, int i3) {
        C26690o oVar = this.f65898a;
        if (oVar == null) {
            return 0;
        }
        return oVar.mo94707a(i, f, MeasureMode.fromInt(i2), f2, MeasureMode.fromInt(i3));
    }

    public void updateUITreeOperations(int[] iArr, int[] iArr2, int[] iArr3, String[] strArr, boolean[] zArr, int[] iArr4) {
        C26690o oVar = this.f65898a;
        if (oVar != null) {
            oVar.mo94739a(iArr, iArr2, iArr3, strArr, zArr, iArr4);
        }
    }

    public void setSingleValueStyleData(int i, int[] iArr, float f, int i2, int i3, int i4, int i5) {
        C26690o oVar = this.f65898a;
        if (oVar != null) {
            oVar.mo94733a(i, iArr, f, i2, i3, i4, i5);
        }
    }

    public void setBackgroundData(int i, int i2, String[] strArr, float[] fArr, float[] fArr2, int[] iArr, int[] iArr2, int[] iArr3) {
        C26690o oVar = this.f65898a;
        if (oVar != null) {
            oVar.mo94721a(i, i2, strArr, fArr, fArr2, iArr, iArr2, iArr3);
        }
    }

    public void setLayoutData(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
        C26690o oVar = this.f65898a;
        if (oVar != null) {
            oVar.mo94718a(i, i2, i3, i4, i5, i6, i7, i8, i9);
        }
    }

    public void setLayoutAnimationData(int i, int i2, long j, long j2, int i3, int i4, float f, float f2, float f3, float f4, int i5) {
        C26690o oVar = this.f65898a;
        if (oVar != null) {
            oVar.mo94720a(i, i2, j, j2, i3, i4, f, f2, f3, f4, i5);
        }
    }

    public void setAnimationData(int i, String str, long j, long j2, int i2, float f, float f2, float f3, float f4, int i3, int i4, int i5, int i6, int i7) {
        C26690o oVar = this.f65898a;
        if (oVar != null) {
            oVar.mo94726a(i, str, j, j2, i2, f, f2, f3, f4, i3, i4, i5, i6, i7);
        }
    }

    public void updateLayout(int i, float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10, float f11, float f12, float f13, float f14, float f15, float f16, float[] fArr, float[] fArr2, float f17) {
        this.f65899b.mo94611a(i, f, f2, f3, f4, f5, f6, f7, f8, f9, f10, f11, f12, f13, f14, f15, f16, fArr, fArr2, f17);
    }

    public void setBorderData(int i, float f, float f2, float f3, float f4, int i2, int i3, int i4, int i5, float f5, float f6, float f7, float f8, float f9, float f10, float f11, float f12, int i6, int i7, int i8, int i9) {
        C26690o oVar = this.f65898a;
        if (oVar != null) {
            oVar.mo94715a(i, f, f2, f3, f4, i2, i3, i4, i5, f5, f6, f7, f8, f9, f10, f11, f12, i6, i7, i8, i9);
        }
    }
}
