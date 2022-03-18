package com.ss.android.lark.ug.dyflow.common.data;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u0000 -2\u00020\u0001:\u0001-B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u0007\b\u0016¢\u0006\u0002\u0010\u0005J\b\u0010'\u001a\u00020(H\u0016J\u001a\u0010)\u001a\u00020*2\b\u0010+\u001a\u0004\u0018\u00010\u00032\u0006\u0010,\u001a\u00020(H\u0016R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001a\u0010\f\u001a\u00020\rX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0018\u001a\u00020\u0019X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u001c\u0010\u001e\u001a\u0004\u0018\u00010\u0013X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u0015\"\u0004\b \u0010\u0017R\u001c\u0010!\u001a\u0004\u0018\u00010\u0013X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\u0015\"\u0004\b#\u0010\u0017R\u001c\u0010$\u001a\u0004\u0018\u00010\u0013X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010\u0015\"\u0004\b&\u0010\u0017¨\u0006."}, d2 = {"Lcom/ss/android/lark/ug/dyflow/common/data/FlowSlotData;", "Landroid/os/Parcelable;", "parcel", "Landroid/os/Parcel;", "(Landroid/os/Parcel;)V", "()V", "element", "Lcom/ss/android/lark/ug/dyflow/common/data/FlowElementData;", "getElement", "()Lcom/ss/android/lark/ug/dyflow/common/data/FlowElementData;", "setElement", "(Lcom/ss/android/lark/ug/dyflow/common/data/FlowElementData;)V", "flowId", "", "getFlowId", "()J", "setFlowId", "(J)V", "linkedStepUri", "", "getLinkedStepUri", "()Ljava/lang/String;", "setLinkedStepUri", "(Ljava/lang/String;)V", "shouldReportBehavior", "", "getShouldReportBehavior", "()Z", "setShouldReportBehavior", "(Z)V", "slotId", "getSlotId", "setSlotId", "stepId", "getStepId", "setStepId", "stepName", "getStepName", "setStepName", "describeContents", "", "writeToParcel", "", "dest", "flags", "CREATOR", "core_guide_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class FlowSlotData implements Parcelable {
    public static final CREATOR CREATOR = new CREATOR(null);

    /* renamed from: a */
    private long f141427a = -1;

    /* renamed from: b */
    private String f141428b;

    /* renamed from: c */
    private String f141429c;

    /* renamed from: d */
    private String f141430d;

    /* renamed from: e */
    private FlowElementData f141431e;

    /* renamed from: f */
    private String f141432f;

    /* renamed from: g */
    private boolean f141433g;

    public int describeContents() {
        return 0;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u001d\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016¢\u0006\u0002\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/ss/android/lark/ug/dyflow/common/data/FlowSlotData$CREATOR;", "Landroid/os/Parcelable$Creator;", "Lcom/ss/android/lark/ug/dyflow/common/data/FlowSlotData;", "()V", "createFromParcel", "parcel", "Landroid/os/Parcel;", "newArray", "", "size", "", "(I)[Lcom/ss/android/lark/ug/dyflow/common/data/FlowSlotData;", "core_guide_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.ug.dyflow.common.data.FlowSlotData$a */
    public static final class CREATOR implements Parcelable.Creator<FlowSlotData> {
        private CREATOR() {
        }

        /* renamed from: a */
        public FlowSlotData[] newArray(int i) {
            return new FlowSlotData[i];
        }

        public /* synthetic */ CREATOR(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public FlowSlotData createFromParcel(Parcel parcel) {
            Intrinsics.checkParameterIsNotNull(parcel, "parcel");
            return new FlowSlotData(parcel);
        }
    }

    /* renamed from: a */
    public final long mo194808a() {
        return this.f141427a;
    }

    /* renamed from: b */
    public final String mo194813b() {
        return this.f141428b;
    }

    /* renamed from: c */
    public final String mo194815c() {
        return this.f141429c;
    }

    /* renamed from: d */
    public final String mo194817d() {
        return this.f141430d;
    }

    /* renamed from: e */
    public final FlowElementData mo194820e() {
        return this.f141431e;
    }

    /* renamed from: f */
    public final String mo194821f() {
        return this.f141432f;
    }

    /* renamed from: g */
    public final boolean mo194822g() {
        return this.f141433g;
    }

    public FlowSlotData() {
    }

    /* renamed from: a */
    public final void mo194809a(long j) {
        this.f141427a = j;
    }

    /* renamed from: b */
    public final void mo194814b(String str) {
        this.f141429c = str;
    }

    /* renamed from: c */
    public final void mo194816c(String str) {
        this.f141430d = str;
    }

    /* renamed from: d */
    public final void mo194818d(String str) {
        this.f141432f = str;
    }

    /* renamed from: a */
    public final void mo194810a(FlowElementData flowElementData) {
        this.f141431e = flowElementData;
    }

    /* renamed from: a */
    public final void mo194811a(String str) {
        this.f141428b = str;
    }

    /* renamed from: a */
    public final void mo194812a(boolean z) {
        this.f141433g = z;
    }

    public FlowSlotData(Parcel parcel) {
        Intrinsics.checkParameterIsNotNull(parcel, "parcel");
        this.f141427a = parcel.readLong();
        this.f141428b = parcel.readString();
        this.f141429c = parcel.readString();
        this.f141430d = parcel.readString();
        this.f141431e = (FlowElementData) parcel.readParcelable(FlowElementData.class.getClassLoader());
        this.f141432f = parcel.readString();
        this.f141433g = parcel.readByte() != ((byte) 0);
    }

    public void writeToParcel(Parcel parcel, int i) {
        byte b;
        if (parcel != null) {
            parcel.writeLong(this.f141427a);
            parcel.writeString(this.f141428b);
            parcel.writeString(this.f141429c);
            parcel.writeString(this.f141430d);
            parcel.writeParcelable(this.f141431e, 0);
            parcel.writeString(this.f141432f);
            if (this.f141433g) {
                b = (byte) 1;
            } else {
                b = (byte) 0;
            }
            parcel.writeByte(b);
        }
    }
}
