package com.ss.android.vesdk;

import com.huawei.hms.maps.model.BitmapDescriptorFactory;

public class VEMusicSRTEffectParam {
    private boolean mAddMask;
    private String mEffectResourcePath;
    private int mFontFaceIndex;
    private String mFontTTFPath;
    public AbstractC63884a mGetMusicProgressInvoker;
    private int mMaskColor = 1291845632;
    private boolean mParamUpdated;
    private C63886c[] mSrtData;

    /* renamed from: com.ss.android.vesdk.VEMusicSRTEffectParam$a */
    public interface AbstractC63884a {
        /* renamed from: a */
        float mo220882a();
    }

    /* renamed from: com.ss.android.vesdk.VEMusicSRTEffectParam$b */
    public interface AbstractC63885b extends AbstractC63884a {
        /* renamed from: a */
        VEMusicBitmapParam mo220883a(String str, int i, int i2, int i3, float f, int i4, int i5, int i6);
    }

    /* renamed from: com.ss.android.vesdk.VEMusicSRTEffectParam$c */
    public static class C63886c {

        /* renamed from: a */
        public String f161310a;

        /* renamed from: b */
        public int f161311b;

        /* renamed from: c */
        public int f161312c;

        /* renamed from: d */
        public int f161313d;
    }

    public boolean getAddMask() {
        return this.mAddMask;
    }

    public String getEffectResPath() {
        return this.mEffectResourcePath;
    }

    public int getFontFaceIndex() {
        return this.mFontFaceIndex;
    }

    public String getFontTTFPath() {
        return this.mFontTTFPath;
    }

    public int getMaskColor() {
        return this.mMaskColor;
    }

    private VEMusicSRTEffectParam() {
    }

    private boolean getParamUpdated() {
        if (!this.mParamUpdated) {
            return false;
        }
        this.mParamUpdated = false;
        return true;
    }

    public float getMusicProgress() {
        AbstractC63884a aVar = this.mGetMusicProgressInvoker;
        if (aVar != null) {
            return aVar.mo220882a();
        }
        return BitmapDescriptorFactory.HUE_RED;
    }

    public int[][] getSrtData() {
        int[][] iArr = new int[this.mSrtData.length][];
        int i = 0;
        while (true) {
            C63886c[] cVarArr = this.mSrtData;
            if (i >= cVarArr.length) {
                return iArr;
            }
            iArr[i] = convertDataToUnicode32(cVarArr[i]);
            i++;
        }
    }

    public void setAddMask(boolean z) {
        this.mAddMask = z;
        this.mParamUpdated = true;
    }

    public void setMaskColor(int i) {
        this.mMaskColor = i;
        this.mParamUpdated = true;
    }

    private int[] convertDataToUnicode32(C63886c cVar) {
        int codePointCount = cVar.f161310a.codePointCount(0, cVar.f161310a.length());
        int[] iArr = new int[(codePointCount + 3)];
        iArr[0] = cVar.f161313d;
        iArr[1] = cVar.f161311b;
        iArr[2] = cVar.f161312c;
        for (int i = 0; i < codePointCount; i++) {
            iArr[i + 3] = cVar.f161310a.codePointAt(i);
        }
        return iArr;
    }

    public void updateEffectResPath(C63886c[] cVarArr, String str, String str2, int i, AbstractC63884a aVar) {
        this.mSrtData = cVarArr;
        this.mFontTTFPath = str2;
        this.mEffectResourcePath = str;
        this.mFontFaceIndex = i;
        this.mGetMusicProgressInvoker = aVar;
        this.mParamUpdated = true;
    }

    public VEMusicSRTEffectParam(C63886c[] cVarArr, String str, String str2, int i, AbstractC63884a aVar) {
        this.mSrtData = cVarArr;
        this.mFontTTFPath = str2;
        this.mEffectResourcePath = str;
        this.mFontFaceIndex = i;
        this.mGetMusicProgressInvoker = aVar;
        this.mParamUpdated = true;
    }

    public VEMusicBitmapParam generateBitmap(String str, int i, int i2, int i3, float f, int i4, int i5, int i6) {
        AbstractC63884a aVar = this.mGetMusicProgressInvoker;
        if (aVar == null || !(aVar instanceof AbstractC63885b)) {
            return null;
        }
        return ((AbstractC63885b) aVar).mo220883a(str, i, i2, i3, f, i4, i5, i6);
    }

    public VEMusicBitmapParam generateBitmapUnicode(int[] iArr, int i, int i2, int i3, float f, int i4, int i5, int i6) {
        if (iArr == null || iArr.length <= 0) {
            return null;
        }
        return generateBitmap(new String(iArr, 0, iArr.length), i, i2, i3, f, i4, i5, i6);
    }
}
