package com.ss.ugc.effectplatform.model;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0017\u0018\u00002\u00020\u0001:\u0001\u001dB=\u0012\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\tJ\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\u0019\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0017HÖ\u0001R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001c\u0010\b\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000b\"\u0004\b\u000f\u0010\rR \u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R \u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0011\"\u0004\b\u0015\u0010\u0013¨\u0006\u001e"}, d2 = {"Lcom/ss/ugc/effectplatform/model/ResourceListModel;", "Lcom/ss/ugc/effectplatform/model/AndroidParcelable;", "resource_list", "", "Lcom/ss/ugc/effectplatform/model/ResourceListModel$ResourceListBean;", "url_prefix", "", "icon_uri", "params", "(Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;)V", "getIcon_uri", "()Ljava/lang/String;", "setIcon_uri", "(Ljava/lang/String;)V", "getParams", "setParams", "getResource_list", "()Ljava/util/List;", "setResource_list", "(Ljava/util/List;)V", "getUrl_prefix", "setUrl_prefix", "describeContents", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "ResourceListBean", "effect_model_release"}, mo238835k = 1, mv = {1, 1, 16})
public class ResourceListModel implements AndroidParcelable {
    public static final Parcelable.Creator CREATOR = new C65515a();
    private String icon_uri;
    private String params;
    private List<? extends ResourceListBean> resource_list;
    private List<String> url_prefix;

    @Metadata(bv = {1, 0, 3}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.ugc.effectplatform.model.ResourceListModel$a */
    public static class C65515a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkParameterIsNotNull(parcel, "in");
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            while (readInt != 0) {
                arrayList.add((ResourceListBean) parcel.readParcelable(ResourceListModel.class.getClassLoader()));
                readInt--;
            }
            return new ResourceListModel(arrayList, parcel.createStringArrayList(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new ResourceListModel[i];
        }
    }

    public ResourceListModel() {
        this(null, null, null, null, 15, null);
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        Intrinsics.checkParameterIsNotNull(parcel, "parcel");
        List<? extends ResourceListBean> list = this.resource_list;
        parcel.writeInt(list.size());
        for (ResourceListBean resourceListBean : list) {
            parcel.writeParcelable(resourceListBean, i);
        }
        parcel.writeStringList(this.url_prefix);
        parcel.writeString(this.icon_uri);
        parcel.writeString(this.params);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0017\u0018\u00002\u00020\u0001B)\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0006J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\u0019\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0010HÖ\u0001R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\b\"\u0004\b\f\u0010\nR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\b\"\u0004\b\u000e\u0010\n¨\u0006\u0016"}, d2 = {"Lcom/ss/ugc/effectplatform/model/ResourceListModel$ResourceListBean;", "Lcom/ss/ugc/effectplatform/model/AndroidParcelable;", "name", "", "value", "resource_uri", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getName", "()Ljava/lang/String;", "setName", "(Ljava/lang/String;)V", "getResource_uri", "setResource_uri", "getValue", "setValue", "describeContents", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "effect_model_release"}, mo238835k = 1, mv = {1, 1, 16})
    public static class ResourceListBean implements AndroidParcelable {
        public static final Parcelable.Creator CREATOR = new C65514a();
        private String name;
        private String resource_uri;
        private String value;

        @Metadata(bv = {1, 0, 3}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.ss.ugc.effectplatform.model.ResourceListModel$ResourceListBean$a */
        public static class C65514a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkParameterIsNotNull(parcel, "in");
                return new ResourceListBean(parcel.readString(), parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ResourceListBean[i];
            }
        }

        public ResourceListBean() {
            this(null, null, null, 7, null);
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i) {
            Intrinsics.checkParameterIsNotNull(parcel, "parcel");
            parcel.writeString(this.name);
            parcel.writeString(this.value);
            parcel.writeString(this.resource_uri);
        }

        public String getName() {
            return this.name;
        }

        public String getResource_uri() {
            return this.resource_uri;
        }

        public String getValue() {
            return this.value;
        }

        public void setName(String str) {
            this.name = str;
        }

        public void setResource_uri(String str) {
            this.resource_uri = str;
        }

        public void setValue(String str) {
            this.value = str;
        }

        public ResourceListBean(String str, String str2, String str3) {
            this.name = str;
            this.value = str2;
            this.resource_uri = str3;
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ ResourceListBean(String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3);
        }
    }

    public String getIcon_uri() {
        return this.icon_uri;
    }

    public String getParams() {
        return this.params;
    }

    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: java.util.List<? extends com.ss.ugc.effectplatform.model.ResourceListModel$ResourceListBean>, java.util.List<com.ss.ugc.effectplatform.model.ResourceListModel$ResourceListBean> */
    public List<ResourceListBean> getResource_list() {
        return this.resource_list;
    }

    public List<String> getUrl_prefix() {
        return this.url_prefix;
    }

    public void setIcon_uri(String str) {
        this.icon_uri = str;
    }

    public void setParams(String str) {
        this.params = str;
    }

    public void setResource_list(List<? extends ResourceListBean> list) {
        Intrinsics.checkParameterIsNotNull(list, "<set-?>");
        this.resource_list = list;
    }

    public void setUrl_prefix(List<String> list) {
        Intrinsics.checkParameterIsNotNull(list, "<set-?>");
        this.url_prefix = list;
    }

    public ResourceListModel(List<? extends ResourceListBean> list, List<String> list2, String str, String str2) {
        Intrinsics.checkParameterIsNotNull(list, "resource_list");
        Intrinsics.checkParameterIsNotNull(list2, "url_prefix");
        this.resource_list = list;
        this.url_prefix = list2;
        this.icon_uri = str;
        this.params = str2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ResourceListModel(List list, List list2, String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new ArrayList() : list, (i & 2) != 0 ? new ArrayList() : list2, (i & 4) != 0 ? null : str, (i & 8) != 0 ? null : str2);
    }
}
