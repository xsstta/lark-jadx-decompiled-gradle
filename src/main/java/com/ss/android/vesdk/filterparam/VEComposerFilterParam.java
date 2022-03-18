package com.ss.android.vesdk.filterparam;

import android.os.Parcel;
import android.os.Parcelable;

public class VEComposerFilterParam extends VEBaseFilterParam {
    public static final Parcelable.Creator<VEComposerFilterParam> CREATOR = new Parcelable.Creator<VEComposerFilterParam>() {
        /* class com.ss.android.vesdk.filterparam.VEComposerFilterParam.C640031 */

        /* renamed from: a */
        public VEComposerFilterParam[] newArray(int i) {
            return new VEComposerFilterParam[i];
        }

        /* renamed from: a */
        public VEComposerFilterParam createFromParcel(Parcel parcel) {
            return new VEComposerFilterParam(parcel);
        }
    };
    private int action;
    public boolean autoDump;
    private int mode;
    private String[] nodePaths;
    private String[] oldNodePaths;
    private int orderType;
    private String[] tags;
    private String[] updateNodeKeys;
    private float[] updateNodeValues;

    @Override // com.ss.android.vesdk.filterparam.VEBaseFilterParam
    public int describeContents() {
        return 0;
    }

    public boolean isOverallComposer() {
        return true;
    }

    public VEComposerFilterParam() {
        this.filterName = "composer filter";
        this.filterType = 18;
        this.filterDurationType = 1;
        reset();
    }

    private void reset() {
        this.mode = 0;
        this.orderType = 0;
        this.action = 0;
        this.oldNodePaths = null;
        this.nodePaths = null;
        this.tags = null;
        this.updateNodeKeys = null;
        this.updateNodeValues = null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0042, code lost:
        if (r3.length == r4.length) goto L_0x0052;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x004f, code lost:
        if (r0.length == r3.length) goto L_0x0052;
     */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0054  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean isValid() {
        /*
        // Method dump skipped, instructions count: 114
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.vesdk.filterparam.VEComposerFilterParam.isValid():boolean");
    }

    @Override // com.ss.android.vesdk.filterparam.VEBaseFilterParam
    public String toString() {
        return "VEComposerFilterParam{mode=" + this.mode + ", orderType=" + this.orderType + ", action='" + this.action + '\'' + ", oldNodePaths='" + this.oldNodePaths + '\'' + ", nodePaths='" + this.nodePaths + '\'' + ", tags='" + this.tags + '\'' + ", updateNodekeys='" + this.updateNodeKeys + '\'' + ", updateNodeValues='" + this.updateNodeValues + '\'' + '}';
    }

    public void removeComposerNodes(String[] strArr) {
        reset();
        this.action = 32;
        this.nodePaths = strArr;
    }

    protected VEComposerFilterParam(Parcel parcel) {
        super(parcel);
        this.mode = parcel.readInt();
        this.orderType = parcel.readInt();
        this.action = parcel.readInt();
        parcel.readStringArray(this.oldNodePaths);
        parcel.readStringArray(this.nodePaths);
        parcel.readStringArray(this.tags);
        parcel.readStringArray(this.updateNodeKeys);
        parcel.readFloatArray(this.updateNodeValues);
    }

    public void appendComposerNodesWithTag(String[] strArr, String[] strArr2) {
        reset();
        this.action = 16;
        this.nodePaths = strArr;
        this.tags = strArr2;
    }

    public void reloadComposerNodesWithTag(String[] strArr, String[] strArr2) {
        reset();
        this.action = 4;
        this.nodePaths = strArr;
        this.tags = strArr2;
    }

    public void setComposerMode(int i, int i2) {
        reset();
        this.action = 2;
        this.mode = i;
        this.orderType = i2;
    }

    public void setComposerNodesWithTag(String[] strArr, String[] strArr2) {
        reset();
        this.action = 1;
        this.nodePaths = strArr;
        this.tags = strArr2;
    }

    @Override // com.ss.android.vesdk.filterparam.VEBaseFilterParam
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.mode);
        parcel.writeInt(this.orderType);
        parcel.writeInt(this.action);
        parcel.writeStringArray(this.oldNodePaths);
        parcel.writeStringArray(this.nodePaths);
        parcel.writeStringArray(this.tags);
        parcel.writeStringArray(this.updateNodeKeys);
        parcel.writeFloatArray(this.updateNodeValues);
    }

    public void replaceComposerNodesWithTag(String[] strArr, String[] strArr2, String[] strArr3) {
        reset();
        this.action = 64;
        this.oldNodePaths = strArr;
        this.nodePaths = strArr2;
        this.tags = strArr3;
    }

    public void updateMultiComposerNodes(String[] strArr, String[] strArr2, float[] fArr) {
        reset();
        this.action = 8;
        this.nodePaths = strArr;
        this.updateNodeKeys = strArr2;
        this.updateNodeValues = fArr;
    }
}
