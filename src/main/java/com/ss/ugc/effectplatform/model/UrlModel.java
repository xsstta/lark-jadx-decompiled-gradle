package com.ss.ugc.effectplatform.model;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0017\u0018\u00002\u00020\u0001B!\u0012\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0002\u0010\u0006J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0002J\b\u0010\u0015\u001a\u00020\u0010H\u0016J\b\u0010\u0016\u001a\u00020\u0004H\u0016J\u0019\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u0010HÖ\u0001R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR \u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u001c"}, d2 = {"Lcom/ss/ugc/effectplatform/model/UrlModel;", "Lcom/ss/ugc/effectplatform/model/AndroidParcelable;", "url_list", "", "", "uri", "(Ljava/util/List;Ljava/lang/String;)V", "getUri", "()Ljava/lang/String;", "setUri", "(Ljava/lang/String;)V", "getUrl_list", "()Ljava/util/List;", "setUrl_list", "(Ljava/util/List;)V", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "effect_model_release"}, mo238835k = 1, mv = {1, 1, 16})
public class UrlModel implements AndroidParcelable {
    public static final Parcelable.Creator CREATOR = new C65516a();
    private String uri;
    private List<String> url_list;

    @Metadata(bv = {1, 0, 3}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.ugc.effectplatform.model.UrlModel$a */
    public static class C65516a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkParameterIsNotNull(parcel, "in");
            return new UrlModel(parcel.createStringArrayList(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new UrlModel[i];
        }
    }

    public UrlModel() {
        this(null, null, 3, null);
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        Intrinsics.checkParameterIsNotNull(parcel, "parcel");
        parcel.writeStringList(this.url_list);
        parcel.writeString(this.uri);
    }

    public String getUri() {
        return this.uri;
    }

    public List<String> getUrl_list() {
        return this.url_list;
    }

    public int hashCode() {
        Integer num;
        int i;
        List<String> url_list2 = getUrl_list();
        if (url_list2 != null) {
            num = Integer.valueOf(url_list2.hashCode());
        } else {
            num = null;
        }
        int intValue = num.intValue() * 31;
        String uri2 = getUri();
        if (uri2 != null) {
            i = uri2.hashCode();
        } else {
            i = 0;
        }
        return intValue + i;
    }

    public String toString() {
        return "UrlModel(url_list=" + getUrl_list() + ", uri=" + getUri() + ')';
    }

    public void setUri(String str) {
        this.uri = str;
    }

    public void setUrl_list(List<String> list) {
        Intrinsics.checkParameterIsNotNull(list, "<set-?>");
        this.url_list = list;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UrlModel)) {
            return false;
        }
        UrlModel urlModel = (UrlModel) obj;
        if (!(!Intrinsics.areEqual(getUrl_list(), urlModel.getUrl_list())) && !(!Intrinsics.areEqual(getUri(), urlModel.getUri()))) {
            return true;
        }
        return false;
    }

    public UrlModel(List<String> list, String str) {
        Intrinsics.checkParameterIsNotNull(list, "url_list");
        this.url_list = list;
        this.uri = str;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ UrlModel(List list, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new ArrayList() : list, (i & 2) != 0 ? null : str);
    }
}
