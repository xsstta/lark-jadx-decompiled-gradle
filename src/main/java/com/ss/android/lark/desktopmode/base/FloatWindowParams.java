package com.ss.android.lark.desktopmode.base;

import android.content.DialogInterface;
import com.huawei.hms.location.LocationRequest;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.ss.android.lark.desktopmode.base.DesktopConstants;
import com.ss.android.lark.desktopmode.base.FragmentParams;
import java.util.ArrayList;
import java.util.List;

public class FloatWindowParams extends FragmentParams {
    private final int bgResId;
    private final List<Integer> coordination;
    private float dimAmount;
    private final String floatTag;
    private final int gravity;
    private final boolean isCancelable;
    private boolean isFloatStackBase;
    private DialogInterface.OnClickListener outsideClickListener;
    private boolean showTriangle;
    private final List<Integer> windowSize;

    public int getBgResId() {
        return this.bgResId;
    }

    public List<Integer> getCoordination() {
        return this.coordination;
    }

    public float getDimAmount() {
        return this.dimAmount;
    }

    public String getFloatTag() {
        return this.floatTag;
    }

    public int getGravity() {
        return this.gravity;
    }

    public DialogInterface.OnClickListener getOutsideClickListener() {
        return this.outsideClickListener;
    }

    public List<Integer> getWindowSize() {
        return this.windowSize;
    }

    public boolean isCancelable() {
        return this.isCancelable;
    }

    public boolean isFloatStackBase() {
        return this.isFloatStackBase;
    }

    public boolean isShowTriangle() {
        return this.showTriangle;
    }

    /* renamed from: com.ss.android.lark.desktopmode.base.FloatWindowParams$1 */
    static /* synthetic */ class C365661 {

        /* renamed from: a */
        static final /* synthetic */ int[] f94115a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                com.ss.android.lark.desktopmode.base.DesktopConstants$UIType[] r0 = com.ss.android.lark.desktopmode.base.DesktopConstants.UIType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.ss.android.lark.desktopmode.base.FloatWindowParams.C365661.f94115a = r0
                com.ss.android.lark.desktopmode.base.DesktopConstants$UIType r1 = com.ss.android.lark.desktopmode.base.DesktopConstants.UIType.FLOAT_MODAL_WIDE_M1     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = com.ss.android.lark.desktopmode.base.FloatWindowParams.C365661.f94115a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.ss.android.lark.desktopmode.base.DesktopConstants$UIType r1 = com.ss.android.lark.desktopmode.base.DesktopConstants.UIType.FLOAT_MODAL_THIN_M2     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = com.ss.android.lark.desktopmode.base.FloatWindowParams.C365661.f94115a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.ss.android.lark.desktopmode.base.DesktopConstants$UIType r1 = com.ss.android.lark.desktopmode.base.DesktopConstants.UIType.FLOAT_POPOVER_P1     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.desktopmode.base.FloatWindowParams.C365661.<clinit>():void");
        }
    }

    /* renamed from: com.ss.android.lark.desktopmode.base.FloatWindowParams$a */
    public static final class C36567a extends FragmentParams.AbstractC36568a<C36567a, FloatWindowParams> {

        /* renamed from: a */
        public int f94116a;

        /* renamed from: b */
        public List<Integer> f94117b;

        /* renamed from: c */
        public List<Integer> f94118c;

        /* renamed from: d */
        public boolean f94119d;

        /* renamed from: e */
        public float f94120e;

        /* renamed from: f */
        public boolean f94121f;

        /* renamed from: g */
        public String f94122g;

        /* renamed from: h */
        public int f94123h;

        /* renamed from: i */
        public DialogInterface.OnClickListener f94124i;

        public C36567a() {
            super(ContainerType.Float);
            this.f94116a = 17;
            this.f94117b = new ArrayList();
            ArrayList arrayList = new ArrayList();
            this.f94118c = arrayList;
            this.f94119d = false;
            this.f94120e = 0.3f;
            this.f94121f = false;
            this.f94122g = null;
            this.f94123h = 0;
            arrayList.add(440);
            this.f94118c.add(560);
        }

        /* renamed from: a */
        public FloatWindowParams mo134930b() {
            return new FloatWindowParams(this);
        }

        /* renamed from: a */
        public C36567a mo134942a(float f) {
            this.f94120e = f;
            return this;
        }

        /* renamed from: d */
        public C36567a mo134950d(int i) {
            this.f94123h = i;
            return this;
        }

        /* renamed from: a */
        public C36567a mo134943a(int i) {
            this.f94116a = i;
            return this;
        }

        /* renamed from: a */
        public C36567a mo134945a(String str) {
            this.f94122g = str;
            return this;
        }

        /* renamed from: b */
        public C36567a mo134948b(int i) {
            this.f94118c.set(0, Integer.valueOf(i));
            return this;
        }

        /* renamed from: c */
        public C36567a mo134949c(int i) {
            this.f94118c.set(1, Integer.valueOf(i));
            return this;
        }

        /* renamed from: a */
        public C36567a mo134946a(boolean z) {
            this.f94119d = z;
            return this;
        }

        public C36567a(DesktopConstants.UIType uIType) {
            super(ContainerType.Float);
            this.f94116a = 17;
            this.f94117b = new ArrayList();
            this.f94118c = new ArrayList();
            this.f94119d = false;
            this.f94120e = 0.3f;
            this.f94121f = false;
            this.f94122g = null;
            this.f94123h = 0;
            int i = C365661.f94115a[uIType.ordinal()];
            if (i == 1) {
                this.f94118c.add(760);
                this.f94118c.add(520);
                this.f94120e = 0.3f;
                this.f94119d = false;
                this.f94116a = 17;
            } else if (i == 2) {
                this.f94118c.add(440);
                this.f94118c.add(560);
                this.f94120e = 0.3f;
                this.f94119d = false;
                this.f94116a = 17;
            } else if (i == 3) {
                this.f94118c.add(Integer.valueOf((int) LocationRequest.PRIORITY_INDOOR));
                this.f94118c.add(450);
                this.f94120e = BitmapDescriptorFactory.HUE_RED;
                this.f94119d = false;
                this.f94116a = 51;
            }
        }

        /* renamed from: a */
        public C36567a mo134944a(int i, int i2) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(Integer.valueOf(i));
            arrayList.add(Integer.valueOf(i2));
            this.f94117b = arrayList;
            return this;
        }
    }

    public void setFloatStackBase(boolean z) {
        this.isFloatStackBase = z;
    }

    public FloatWindowParams(C36567a aVar) {
        super(aVar.f94125j, aVar.f94126k);
        this.gravity = aVar.f94116a;
        this.coordination = aVar.f94117b;
        this.windowSize = aVar.f94118c;
        this.isCancelable = aVar.f94119d;
        this.dimAmount = aVar.f94120e;
        this.showTriangle = aVar.f94121f;
        this.floatTag = aVar.f94122g;
        this.bgResId = aVar.f94123h;
        this.outsideClickListener = aVar.f94124i;
    }

    public FloatWindowParams(FloatWindowParams floatWindowParams) {
        super(floatWindowParams.containerType, false);
        this.gravity = floatWindowParams.gravity;
        this.coordination = floatWindowParams.coordination;
        this.windowSize = floatWindowParams.windowSize;
        this.isCancelable = floatWindowParams.isCancelable;
        this.dimAmount = floatWindowParams.dimAmount;
        this.showTriangle = floatWindowParams.showTriangle;
        this.floatTag = floatWindowParams.floatTag;
        this.bgResId = floatWindowParams.bgResId;
        this.outsideClickListener = floatWindowParams.outsideClickListener;
    }

    public FloatWindowParams(int i, ContainerType containerType, List<Integer> list, List<Integer> list2, boolean z, float f, boolean z2, String str, int i2, DialogInterface.OnClickListener onClickListener) {
        super(containerType, false);
        this.gravity = i;
        this.coordination = list;
        this.windowSize = list2;
        this.isCancelable = z;
        this.dimAmount = f;
        this.showTriangle = z2;
        this.floatTag = str;
        this.bgResId = i2;
        this.outsideClickListener = onClickListener;
    }
}
