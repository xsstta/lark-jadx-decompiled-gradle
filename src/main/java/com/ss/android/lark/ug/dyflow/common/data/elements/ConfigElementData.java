package com.ss.android.lark.ug.dyflow.common.data.elements;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.HashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012B\u001b\b\u0016\u0012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\u0005B\u000f\b\u0016\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\b\u0010\f\u001a\u00020\rH\u0016J\u001a\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0011\u001a\u00020\rH\u0016R\u001d\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0013"}, d2 = {"Lcom/ss/android/lark/ug/dyflow/common/data/elements/ConfigElementData;", "Landroid/os/Parcelable;", "map", "", "", "(Ljava/util/Map;)V", "parcel", "Landroid/os/Parcel;", "(Landroid/os/Parcel;)V", "configs", "getConfigs", "()Ljava/util/Map;", "describeContents", "", "writeToParcel", "", "dest", "flags", "CREATOR", "core_guide_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class ConfigElementData implements Parcelable {
    public static final CREATOR CREATOR = new CREATOR(null);

    /* renamed from: a */
    private final Map<String, String> f141461a;

    public int describeContents() {
        return 0;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u001d\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016¢\u0006\u0002\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/ss/android/lark/ug/dyflow/common/data/elements/ConfigElementData$CREATOR;", "Landroid/os/Parcelable$Creator;", "Lcom/ss/android/lark/ug/dyflow/common/data/elements/ConfigElementData;", "()V", "createFromParcel", "parcel", "Landroid/os/Parcel;", "newArray", "", "size", "", "(I)[Lcom/ss/android/lark/ug/dyflow/common/data/elements/ConfigElementData;", "core_guide_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.ug.dyflow.common.data.elements.ConfigElementData$a */
    public static final class CREATOR implements Parcelable.Creator<ConfigElementData> {
        private CREATOR() {
        }

        /* renamed from: a */
        public ConfigElementData[] newArray(int i) {
            return new ConfigElementData[i];
        }

        public /* synthetic */ CREATOR(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public ConfigElementData createFromParcel(Parcel parcel) {
            Intrinsics.checkParameterIsNotNull(parcel, "parcel");
            return new ConfigElementData(parcel);
        }
    }

    /* renamed from: a */
    public final Map<String, String> mo194886a() {
        return this.f141461a;
    }

    public ConfigElementData(Parcel parcel) {
        Intrinsics.checkParameterIsNotNull(parcel, "parcel");
        HashMap hashMap = new HashMap();
        this.f141461a = hashMap;
        parcel.readMap(hashMap, getClass().getClassLoader());
    }

    public ConfigElementData(Map<String, String> map) {
        Intrinsics.checkParameterIsNotNull(map, "map");
        HashMap hashMap = new HashMap();
        this.f141461a = hashMap;
        hashMap.putAll(map);
    }

    public void writeToParcel(Parcel parcel, int i) {
        if (parcel != null) {
            parcel.writeMap(this.f141461a);
        }
    }
}
