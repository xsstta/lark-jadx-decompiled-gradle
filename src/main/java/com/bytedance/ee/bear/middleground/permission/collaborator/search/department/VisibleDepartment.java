package com.bytedance.ee.bear.middleground.permission.collaborator.search.department;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.ee.bear.pathnavigationview.PathNavigationModel;
import com.larksuite.suite.R;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\b\u0018\u0000 \u001e2\u00020\u00012\u00020\u0002:\u0001\u001eB#\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004¢\u0006\u0002\u0010\u0007J\t\u0010\f\u001a\u00020\u0004HÆ\u0003J\t\u0010\r\u001a\u00020\u0004HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0004HÆ\u0003J'\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u0004HÆ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0002J\b\u0010\u0016\u001a\u00020\u0004H\u0016J\b\u0010\u0017\u001a\u00020\u0011H\u0016J\t\u0010\u0018\u001a\u00020\u0004HÖ\u0001J\u0019\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0006\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u001f"}, d2 = {"Lcom/bytedance/ee/bear/middleground/permission/collaborator/search/department/VisibleDepartment;", "Landroid/os/Parcelable;", "Lcom/bytedance/ee/bear/pathnavigationview/PathNavigationModel;", "departmentId", "", "depName", "avatar", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAvatar", "()Ljava/lang/String;", "getDepName", "getDepartmentId", "component1", "component2", "component3", "copy", "describeContents", "", "equals", "", "other", "", "getName", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "Companion", "middleground-permission_release"}, mo238835k = 1, mv = {1, 1, 15})
public final class VisibleDepartment implements Parcelable, PathNavigationModel {
    public static final Parcelable.Creator CREATOR = new C9870b();

    /* renamed from: a */
    public static final Companion f26659a = new Companion(null);

    /* renamed from: b */
    private final String f26660b;

    /* renamed from: c */
    private final String f26661c;

    /* renamed from: d */
    private final String f26662d;

    @Metadata(bv = {1, 0, 3}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.permission.collaborator.search.department.VisibleDepartment$b */
    public static class C9870b implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkParameterIsNotNull(parcel, "in");
            return new VisibleDepartment(parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new VisibleDepartment[i];
        }
    }

    public VisibleDepartment() {
        this(null, null, null, 7, null);
    }

    public int describeContents() {
        return 0;
    }

    public String toString() {
        return "VisibleDepartment(departmentId=" + this.f26660b + ", depName=" + this.f26661c + ", avatar=" + this.f26662d + ")";
    }

    public void writeToParcel(Parcel parcel, int i) {
        Intrinsics.checkParameterIsNotNull(parcel, "parcel");
        parcel.writeString(this.f26660b);
        parcel.writeString(this.f26661c);
        parcel.writeString(this.f26662d);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tJ\u000e\u0010\n\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tR\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/bytedance/ee/bear/middleground/permission/collaborator/search/department/VisibleDepartment$Companion;", "", "()V", "ROOT_CONTACT_ID", "", "ROOT_DEP_ID", "getRootContact", "Lcom/bytedance/ee/bear/middleground/permission/collaborator/search/department/VisibleDepartment;", "context", "Landroid/content/Context;", "getRootDep", "middleground-permission_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.permission.collaborator.search.department.VisibleDepartment$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final VisibleDepartment mo37548a(Context context) {
            Intrinsics.checkParameterIsNotNull(context, "context");
            String string = context.getString(R.string.Doc_Permission_DepContact);
            Intrinsics.checkExpressionValueIsNotNull(string, "context.getString(R.stri…oc_Permission_DepContact)");
            return new VisibleDepartment("root_contact", string, "");
        }

        /* renamed from: b */
        public final VisibleDepartment mo37549b(Context context) {
            Intrinsics.checkParameterIsNotNull(context, "context");
            String string = context.getString(R.string.Doc_Permission_AddUserOrganization);
            Intrinsics.checkExpressionValueIsNotNull(string, "context.getString(R.stri…sion_AddUserOrganization)");
            return new VisibleDepartment("0", string, "");
        }
    }

    @Override // com.bytedance.ee.bear.pathnavigationview.PathNavigationModel
    /* renamed from: a */
    public String mo30864a() {
        return this.f26661c;
    }

    /* renamed from: b */
    public final String mo37540b() {
        return this.f26660b;
    }

    /* renamed from: c */
    public final String mo37541c() {
        return this.f26661c;
    }

    /* renamed from: d */
    public final String mo37542d() {
        return this.f26662d;
    }

    public int hashCode() {
        return this.f26660b.hashCode();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || (!Intrinsics.areEqual(getClass(), obj.getClass()))) {
            return false;
        }
        return Objects.equals(this.f26660b, ((VisibleDepartment) obj).f26660b);
    }

    public VisibleDepartment(String str, String str2, String str3) {
        Intrinsics.checkParameterIsNotNull(str, "departmentId");
        Intrinsics.checkParameterIsNotNull(str2, "depName");
        Intrinsics.checkParameterIsNotNull(str3, "avatar");
        this.f26660b = str;
        this.f26661c = str2;
        this.f26662d = str3;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ VisibleDepartment(String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3);
    }
}
