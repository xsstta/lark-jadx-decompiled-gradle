package com.ss.android.ugc.effectmanager.common.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.ugc.effectplatform.model.UrlModel;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0017\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0011\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0001¢\u0006\u0002\u0010\u0005J\u0006\u0010\u0012\u001a\u00020\u0013J\b\u0010\u0014\u001a\u00020\bH\u0016J\u0019\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001aHÖ\u0001R8\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00078V@VX\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u0001X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001b"}, d2 = {"Lcom/ss/android/ugc/effectmanager/common/model/UrlModelTemplate;", "Lcom/ss/ugc/effectplatform/model/UrlModel;", "Landroid/os/Parcelable;", "Ljava/io/Serializable;", "urlModel", "(Lcom/ss/ugc/effectplatform/model/UrlModel;)V", "value", "", "", "urlList", "urlList$annotations", "()V", "getUrlList", "()Ljava/util/List;", "setUrlList", "(Ljava/util/List;)V", "getUrlModel", "()Lcom/ss/ugc/effectplatform/model/UrlModel;", "isValid", "", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "", "effectmanager_release"}, mo238835k = 1, mv = {1, 1, 15})
public class UrlModelTemplate extends UrlModel implements Parcelable, Serializable {
    public static final Parcelable.Creator CREATOR = new C60546a();
    private List<String> urlList;
    private final transient UrlModel urlModel;

    @Metadata(bv = {1, 0, 3}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.ss.android.ugc.effectmanager.common.model.UrlModelTemplate$a */
    public static class C60546a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkParameterIsNotNull(parcel, "in");
            return new UrlModelTemplate((UrlModel) parcel.readParcelable(UrlModelTemplate.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new UrlModelTemplate[i];
        }
    }

    public UrlModelTemplate() {
        this(null, 1, null);
    }

    public static /* synthetic */ void urlList$annotations() {
    }

    @Override // com.ss.ugc.effectplatform.model.UrlModel
    public void writeToParcel(Parcel parcel, int i) {
        Intrinsics.checkParameterIsNotNull(parcel, "parcel");
        parcel.writeParcelable(this.urlModel, i);
    }

    public UrlModel getUrlModel() {
        return this.urlModel;
    }

    public List<String> getUrlList() {
        List<String> url_list;
        UrlModel urlModel2 = getUrlModel();
        if (urlModel2 == null || (url_list = urlModel2.getUrl_list()) == null) {
            return super.getUrl_list();
        }
        return url_list;
    }

    public final boolean isValid() {
        boolean z;
        List<String> urlList2 = getUrlList();
        if (urlList2 == null || urlList2.isEmpty()) {
            z = true;
        } else {
            z = false;
        }
        return !z;
    }

    @Override // com.ss.ugc.effectplatform.model.UrlModel
    public String toString() {
        String urlModel2;
        UrlModel urlModel3 = getUrlModel();
        if (urlModel3 == null || (urlModel2 = urlModel3.toString()) == null) {
            return super.toString();
        }
        return urlModel2;
    }

    public UrlModelTemplate(UrlModel urlModel2) {
        super(null, null, 3, null);
        this.urlModel = urlModel2;
        this.urlList = new ArrayList();
    }

    public void setUrlList(List<String> list) {
        Intrinsics.checkParameterIsNotNull(list, "value");
        this.urlList = list;
        UrlModel urlModel2 = getUrlModel();
        if (urlModel2 != null) {
            urlModel2.setUrl_list(list);
        }
        super.setUrl_list(list);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ UrlModelTemplate(UrlModel urlModel2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : urlModel2);
    }
}
