package com.ss.android.lark.ug.dyflow.common.data;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.lark.ug.dyflow.common.data.FlowElementData;
import com.ss.android.lark.ug.dyflow.common.data.elements.ButtonElementData;
import com.ss.android.lark.ug.dyflow.common.data.elements.ConfigElementData;
import com.ss.android.lark.ug.dyflow.common.data.elements.PictureElementData;
import com.ss.android.lark.ug.dyflow.common.data.elements.TextElementData;
import com.ss.android.lark.ug.dyflow.common.data.elements.VideoElementData;
import java.util.HashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u0000 A2\u00020\u0001:\u0001AB\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u0007\b\u0016¢\u0006\u0002\u0010\u0005J\b\u0010(\u001a\u00020)H\u0016J\u0010\u0010*\u001a\u0004\u0018\u00010+2\u0006\u0010,\u001a\u00020\u001aJ\u0010\u0010-\u001a\u0004\u0018\u00010\u001a2\u0006\u0010,\u001a\u00020\u001aJ\u0010\u0010.\u001a\u0004\u0018\u00010/2\u0006\u0010,\u001a\u00020\u001aJ\u0010\u00100\u001a\u0004\u0018\u00010\u001a2\u0006\u0010,\u001a\u00020\u001aJ\u0010\u00101\u001a\u0004\u0018\u0001022\u0006\u0010,\u001a\u00020\u001aJ\u0010\u00103\u001a\u0004\u0018\u00010\u001a2\u0006\u0010,\u001a\u00020\u001aJ\u0010\u00104\u001a\u0004\u0018\u00010\u001b2\u0006\u0010,\u001a\u00020\u001aJ\u0010\u00105\u001a\u0004\u0018\u00010\u001a2\u0006\u0010,\u001a\u00020\u001aJ\u0010\u00106\u001a\u0004\u0018\u0001072\u0006\u0010,\u001a\u00020\u001aJ\u0010\u00108\u001a\u0004\u0018\u0001092\u0006\u0010,\u001a\u00020\u001aJ\u0010\u0010:\u001a\u0004\u0018\u00010\u001a2\u0006\u0010,\u001a\u00020\u001aJ\u000e\u0010;\u001a\u00020\u00132\u0006\u0010,\u001a\u00020\u001aJ\u000e\u0010<\u001a\u00020\u00132\u0006\u0010,\u001a\u00020\u001aJ\u001a\u0010=\u001a\u00020>2\b\u0010?\u001a\u0004\u0018\u00010\u00032\u0006\u0010@\u001a\u00020)H\u0016R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001a\u0010\f\u001a\u00020\rX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0012\u001a\u00020\u0013X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R(\u0010\u0018\u001a\u0010\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u001b\u0018\u00010\u0019X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u001c\u0010 \u001a\u0004\u0018\u00010\u001aX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\u001c\u0010%\u001a\u0004\u0018\u00010\u001aX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b&\u0010\"\"\u0004\b'\u0010$¨\u0006B"}, d2 = {"Lcom/ss/android/lark/ug/dyflow/common/data/FlowStepData;", "Landroid/os/Parcelable;", "parcel", "Landroid/os/Parcel;", "(Landroid/os/Parcel;)V", "()V", "flowContext", "Lcom/ss/android/lark/ug/dyflow/common/data/FlowContext;", "getFlowContext", "()Lcom/ss/android/lark/ug/dyflow/common/data/FlowContext;", "setFlowContext", "(Lcom/ss/android/lark/ug/dyflow/common/data/FlowContext;)V", "flowId", "", "getFlowId", "()J", "setFlowId", "(J)V", "hasConsumed", "", "getHasConsumed", "()Z", "setHasConsumed", "(Z)V", "slots", "", "", "Lcom/ss/android/lark/ug/dyflow/common/data/FlowSlotData;", "getSlots", "()Ljava/util/Map;", "setSlots", "(Ljava/util/Map;)V", "stepId", "getStepId", "()Ljava/lang/String;", "setStepId", "(Ljava/lang/String;)V", "stepName", "getStepName", "setStepName", "describeContents", "", "getButtonData", "Lcom/ss/android/lark/ug/dyflow/common/data/elements/ButtonElementData;", "key", "getButtonText", "getConfigData", "Lcom/ss/android/lark/ug/dyflow/common/data/elements/ConfigElementData;", "getLinkedStepUrl", "getPictureData", "Lcom/ss/android/lark/ug/dyflow/common/data/elements/PictureElementData;", "getPictureUrl", "getSlotData", "getText", "getTextData", "Lcom/ss/android/lark/ug/dyflow/common/data/elements/TextElementData;", "getVideoData", "Lcom/ss/android/lark/ug/dyflow/common/data/elements/VideoElementData;", "getVideoUrl", "hasSlot", "hasSlotAndElement", "writeToParcel", "", "dest", "flags", "CREATOR", "core_guide_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class FlowStepData implements Parcelable {
    public static final CREATOR CREATOR = new CREATOR(null);

    /* renamed from: a */
    public static final FlowStepData f141434a = new FlowStepData();

    /* renamed from: b */
    private long f141435b = -1;

    /* renamed from: c */
    private String f141436c;

    /* renamed from: d */
    private String f141437d;

    /* renamed from: e */
    private Map<String, FlowSlotData> f141438e;

    /* renamed from: f */
    private boolean f141439f;

    /* renamed from: g */
    private FlowContext f141440g;

    public int describeContents() {
        return 0;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\u0010\u0010\u0007\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\tH\u0016J\u001d\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0016¢\u0006\u0002\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0002¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000f"}, d2 = {"Lcom/ss/android/lark/ug/dyflow/common/data/FlowStepData$CREATOR;", "Landroid/os/Parcelable$Creator;", "Lcom/ss/android/lark/ug/dyflow/common/data/FlowStepData;", "()V", "EMPTY", "getEMPTY", "()Lcom/ss/android/lark/ug/dyflow/common/data/FlowStepData;", "createFromParcel", "parcel", "Landroid/os/Parcel;", "newArray", "", "size", "", "(I)[Lcom/ss/android/lark/ug/dyflow/common/data/FlowStepData;", "core_guide_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.ug.dyflow.common.data.FlowStepData$a */
    public static final class CREATOR implements Parcelable.Creator<FlowStepData> {
        private CREATOR() {
        }

        /* renamed from: a */
        public final FlowStepData mo194850a() {
            return FlowStepData.f141434a;
        }

        public /* synthetic */ CREATOR(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public FlowStepData[] newArray(int i) {
            return new FlowStepData[i];
        }

        /* renamed from: a */
        public FlowStepData createFromParcel(Parcel parcel) {
            Intrinsics.checkParameterIsNotNull(parcel, "parcel");
            return new FlowStepData(parcel);
        }
    }

    /* renamed from: a */
    public final long mo194828a() {
        return this.f141435b;
    }

    /* renamed from: b */
    public final String mo194834b() {
        return this.f141436c;
    }

    /* renamed from: c */
    public final String mo194837c() {
        return this.f141437d;
    }

    /* renamed from: d */
    public final Map<String, FlowSlotData> mo194839d() {
        return this.f141438e;
    }

    /* renamed from: e */
    public final boolean mo194842e() {
        return this.f141439f;
    }

    /* renamed from: f */
    public final FlowContext mo194843f() {
        return this.f141440g;
    }

    public FlowStepData() {
    }

    /* renamed from: a */
    public final void mo194829a(long j) {
        this.f141435b = j;
    }

    /* renamed from: b */
    public final void mo194835b(String str) {
        this.f141437d = str;
    }

    /* renamed from: a */
    public final void mo194830a(FlowContext aVar) {
        this.f141440g = aVar;
    }

    /* renamed from: a */
    public final void mo194831a(String str) {
        this.f141436c = str;
    }

    /* renamed from: c */
    public final FlowSlotData mo194836c(String str) {
        Intrinsics.checkParameterIsNotNull(str, "key");
        Map<String, FlowSlotData> map = this.f141438e;
        if (map != null) {
            return map.get(str);
        }
        return null;
    }

    /* renamed from: j */
    public final boolean mo194848j(String str) {
        FlowElementData flowElementData;
        FlowSlotData flowSlotData;
        Intrinsics.checkParameterIsNotNull(str, "key");
        Map<String, FlowSlotData> map = this.f141438e;
        if (map == null || (flowSlotData = map.get(str)) == null) {
            flowElementData = null;
        } else {
            flowElementData = flowSlotData.mo194820e();
        }
        if (flowElementData != null) {
            return true;
        }
        return false;
    }

    public FlowStepData(Parcel parcel) {
        Intrinsics.checkParameterIsNotNull(parcel, "parcel");
        this.f141435b = parcel.readLong();
        this.f141436c = parcel.readString();
        this.f141437d = parcel.readString();
        HashMap hashMap = new HashMap();
        parcel.readMap(hashMap, FlowSlotData.class.getClassLoader());
        if (!hashMap.isEmpty()) {
            this.f141438e = hashMap;
        }
    }

    /* renamed from: a */
    public final void mo194832a(Map<String, FlowSlotData> map) {
        this.f141438e = map;
    }

    /* renamed from: d */
    public final String mo194838d(String str) {
        FlowSlotData flowSlotData;
        FlowElementData.ElementType elementType;
        FlowElementData e;
        TextElementData b;
        Intrinsics.checkParameterIsNotNull(str, "key");
        Map<String, FlowSlotData> map = this.f141438e;
        if (map == null || (flowSlotData = map.get(str)) == null) {
            return null;
        }
        FlowElementData e2 = flowSlotData.mo194820e();
        if (e2 != null) {
            elementType = e2.mo194789a();
        } else {
            elementType = null;
        }
        if (elementType == null || C57432c.f141451a[elementType.ordinal()] != 1 || (e = flowSlotData.mo194820e()) == null || (b = e.mo194795b()) == null) {
            return null;
        }
        return b.mo194902a();
    }

    /* renamed from: e */
    public final String mo194841e(String str) {
        FlowSlotData flowSlotData;
        FlowElementData.ElementType elementType;
        FlowElementData e;
        ButtonElementData e2;
        Intrinsics.checkParameterIsNotNull(str, "key");
        Map<String, FlowSlotData> map = this.f141438e;
        if (map == null || (flowSlotData = map.get(str)) == null) {
            return null;
        }
        FlowElementData e3 = flowSlotData.mo194820e();
        if (e3 != null) {
            elementType = e3.mo194789a();
        } else {
            elementType = null;
        }
        if (elementType == null || C57432c.f141453c[elementType.ordinal()] != 1 || (e = flowSlotData.mo194820e()) == null || (e2 = e.mo194799e()) == null) {
            return null;
        }
        return e2.mo194879a();
    }

    /* renamed from: f */
    public final String mo194844f(String str) {
        FlowSlotData flowSlotData;
        FlowElementData.ElementType elementType;
        FlowElementData e;
        VideoElementData d;
        Intrinsics.checkParameterIsNotNull(str, "key");
        Map<String, FlowSlotData> map = this.f141438e;
        if (map == null || (flowSlotData = map.get(str)) == null) {
            return null;
        }
        FlowElementData e2 = flowSlotData.mo194820e();
        if (e2 != null) {
            elementType = e2.mo194789a();
        } else {
            elementType = null;
        }
        if (elementType == null || C57432c.f141455e[elementType.ordinal()] != 1 || (e = flowSlotData.mo194820e()) == null || (d = e.mo194797d()) == null) {
            return null;
        }
        return d.mo194911a();
    }

    /* renamed from: g */
    public final VideoElementData mo194845g(String str) {
        FlowSlotData flowSlotData;
        FlowElementData.ElementType elementType;
        FlowElementData e;
        Intrinsics.checkParameterIsNotNull(str, "key");
        Map<String, FlowSlotData> map = this.f141438e;
        if (map == null || (flowSlotData = map.get(str)) == null) {
            return null;
        }
        FlowElementData e2 = flowSlotData.mo194820e();
        if (e2 != null) {
            elementType = e2.mo194789a();
        } else {
            elementType = null;
        }
        if (elementType == null || C57432c.f141456f[elementType.ordinal()] != 1 || (e = flowSlotData.mo194820e()) == null) {
            return null;
        }
        return e.mo194797d();
    }

    /* renamed from: h */
    public final String mo194846h(String str) {
        FlowSlotData flowSlotData;
        FlowElementData.ElementType elementType;
        FlowElementData e;
        PictureElementData c;
        Intrinsics.checkParameterIsNotNull(str, "key");
        Map<String, FlowSlotData> map = this.f141438e;
        if (map == null || (flowSlotData = map.get(str)) == null) {
            return null;
        }
        FlowElementData e2 = flowSlotData.mo194820e();
        if (e2 != null) {
            elementType = e2.mo194789a();
        } else {
            elementType = null;
        }
        if (elementType == null || C57432c.f141457g[elementType.ordinal()] != 1 || (e = flowSlotData.mo194820e()) == null || (c = e.mo194796c()) == null) {
            return null;
        }
        return c.mo194893a();
    }

    /* renamed from: i */
    public final ConfigElementData mo194847i(String str) {
        FlowSlotData flowSlotData;
        FlowElementData.ElementType elementType;
        FlowElementData e;
        Intrinsics.checkParameterIsNotNull(str, "key");
        Map<String, FlowSlotData> map = this.f141438e;
        if (map == null || (flowSlotData = map.get(str)) == null) {
            return null;
        }
        FlowElementData e2 = flowSlotData.mo194820e();
        if (e2 != null) {
            elementType = e2.mo194789a();
        } else {
            elementType = null;
        }
        if (elementType == null || C57432c.f141459i[elementType.ordinal()] != 1 || (e = flowSlotData.mo194820e()) == null) {
            return null;
        }
        return e.mo194800f();
    }

    /* renamed from: a */
    public final void mo194833a(boolean z) {
        this.f141439f = z;
    }

    public void writeToParcel(Parcel parcel, int i) {
        if (parcel != null) {
            parcel.writeLong(this.f141435b);
            parcel.writeString(this.f141436c);
            parcel.writeString(this.f141437d);
            parcel.writeMap(this.f141438e);
        }
    }
}
