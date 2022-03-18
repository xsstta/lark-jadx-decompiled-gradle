package com.bytedance.ee.bear.middleground.permission.collaborator.search.newsearch.contact;

import android.os.Parcel;
import android.os.Parcelable;
import com.larksuite.suite.R;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\b\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\t\u0010\t\u001a\u00020\nHÖ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eHÖ\u0003J\t\u0010\u000f\u001a\u00020\nHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0003HÖ\u0001J\u0019\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\nHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0017"}, d2 = {"Lcom/bytedance/ee/bear/middleground/permission/collaborator/search/newsearch/contact/ContactMobileModel;", "Landroid/os/Parcelable;", "mobilePhone", "", "(Ljava/lang/String;)V", "getMobilePhone", "()Ljava/lang/String;", "component1", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "Companion", "middleground-permission-export_release"}, mo238835k = 1, mv = {1, 1, 15})
public final class ContactMobileModel implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C9896b();

    /* renamed from: a */
    public static final int f26785a = R.id.UiMessageContactMobileSelected;

    /* renamed from: b */
    public static final Companion f26786b = new Companion(null);

    /* renamed from: c */
    private final String f26787c;

    @Metadata(bv = {1, 0, 3}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.permission.collaborator.search.newsearch.contact.ContactMobileModel$b */
    public static class C9896b implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkParameterIsNotNull(parcel, "in");
            return new ContactMobileModel(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new ContactMobileModel[i];
        }
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof ContactMobileModel) && Intrinsics.areEqual(this.f26787c, ((ContactMobileModel) obj).f26787c);
        }
        return true;
    }

    public int hashCode() {
        String str = this.f26787c;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    public String toString() {
        return "ContactMobileModel(mobilePhone=" + this.f26787c + ")";
    }

    public void writeToParcel(Parcel parcel, int i) {
        Intrinsics.checkParameterIsNotNull(parcel, "parcel");
        parcel.writeString(this.f26787c);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/bytedance/ee/bear/middleground/permission/collaborator/search/newsearch/contact/ContactMobileModel$Companion;", "", "()V", "UI_MESSAGE_CONTACT_MOBILE_SELECTED", "", "getUI_MESSAGE_CONTACT_MOBILE_SELECTED", "()I", "middleground-permission-export_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.permission.collaborator.search.newsearch.contact.ContactMobileModel$a */
    public static final class Companion {
        private Companion() {
        }

        /* renamed from: a */
        public final int mo37696a() {
            return ContactMobileModel.f26785a;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public ContactMobileModel(String str) {
        Intrinsics.checkParameterIsNotNull(str, "mobilePhone");
        this.f26787c = str;
    }
}
