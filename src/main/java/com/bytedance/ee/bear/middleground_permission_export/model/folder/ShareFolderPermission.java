package com.bytedance.ee.bear.middleground_permission_export.model.folder;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\u0019\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u0013HÖ\u0001R\u001a\u0010\u0004\u001a\u00020\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u0002\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006 "}, d2 = {"Lcom/bytedance/ee/bear/middleground_permission_export/model/folder/ShareFolderPermission;", "Landroid/os/Parcelable;", "shareFolderUserPermission", "Lcom/bytedance/ee/bear/middleground_permission_export/model/folder/ShareFolderUserPermission;", "folderPublicPermission", "Lcom/bytedance/ee/bear/middleground_permission_export/model/folder/ShareFolderPublicPermission;", "(Lcom/bytedance/ee/bear/middleground_permission_export/model/folder/ShareFolderUserPermission;Lcom/bytedance/ee/bear/middleground_permission_export/model/folder/ShareFolderPublicPermission;)V", "getFolderPublicPermission", "()Lcom/bytedance/ee/bear/middleground_permission_export/model/folder/ShareFolderPublicPermission;", "setFolderPublicPermission", "(Lcom/bytedance/ee/bear/middleground_permission_export/model/folder/ShareFolderPublicPermission;)V", "getShareFolderUserPermission", "()Lcom/bytedance/ee/bear/middleground_permission_export/model/folder/ShareFolderUserPermission;", "setShareFolderUserPermission", "(Lcom/bytedance/ee/bear/middleground_permission_export/model/folder/ShareFolderUserPermission;)V", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "middleground-permission-export_release"}, mo238835k = 1, mv = {1, 1, 15})
public final class ShareFolderPermission implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C10167a();

    /* renamed from: a */
    private ShareFolderUserPermission f27435a;

    /* renamed from: b */
    private ShareFolderPublicPermission f27436b;

    @Metadata(bv = {1, 0, 3}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground_permission_export.model.folder.ShareFolderPermission$a */
    public static class C10167a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkParameterIsNotNull(parcel, "in");
            return new ShareFolderPermission((ShareFolderUserPermission) parcel.readSerializable(), (ShareFolderPublicPermission) parcel.readSerializable());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new ShareFolderPermission[i];
        }
    }

    public ShareFolderPermission() {
        this(null, null, 3, null);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ShareFolderPermission)) {
            return false;
        }
        ShareFolderPermission shareFolderPermission = (ShareFolderPermission) obj;
        return Intrinsics.areEqual(this.f27435a, shareFolderPermission.f27435a) && Intrinsics.areEqual(this.f27436b, shareFolderPermission.f27436b);
    }

    public int hashCode() {
        ShareFolderUserPermission shareFolderUserPermission = this.f27435a;
        int i = 0;
        int hashCode = (shareFolderUserPermission != null ? shareFolderUserPermission.hashCode() : 0) * 31;
        ShareFolderPublicPermission shareFolderPublicPermission = this.f27436b;
        if (shareFolderPublicPermission != null) {
            i = shareFolderPublicPermission.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        return "ShareFolderPermission(shareFolderUserPermission=" + this.f27435a + ", folderPublicPermission=" + this.f27436b + ")";
    }

    public void writeToParcel(Parcel parcel, int i) {
        Intrinsics.checkParameterIsNotNull(parcel, "parcel");
        parcel.writeSerializable(this.f27435a);
        parcel.writeSerializable(this.f27436b);
    }

    /* renamed from: a */
    public final ShareFolderUserPermission mo38687a() {
        return this.f27435a;
    }

    /* renamed from: b */
    public final ShareFolderPublicPermission mo38690b() {
        return this.f27436b;
    }

    /* renamed from: a */
    public final void mo38688a(ShareFolderPublicPermission shareFolderPublicPermission) {
        Intrinsics.checkParameterIsNotNull(shareFolderPublicPermission, "<set-?>");
        this.f27436b = shareFolderPublicPermission;
    }

    /* renamed from: a */
    public final void mo38689a(ShareFolderUserPermission shareFolderUserPermission) {
        Intrinsics.checkParameterIsNotNull(shareFolderUserPermission, "<set-?>");
        this.f27435a = shareFolderUserPermission;
    }

    public ShareFolderPermission(ShareFolderUserPermission shareFolderUserPermission, ShareFolderPublicPermission shareFolderPublicPermission) {
        Intrinsics.checkParameterIsNotNull(shareFolderUserPermission, "shareFolderUserPermission");
        Intrinsics.checkParameterIsNotNull(shareFolderPublicPermission, "folderPublicPermission");
        this.f27435a = shareFolderUserPermission;
        this.f27436b = shareFolderPublicPermission;
    }

    public /* synthetic */ ShareFolderPermission(ShareFolderUserPermission shareFolderUserPermission, ShareFolderPublicPermission shareFolderPublicPermission, int i, DefaultConstructorMarker defaultConstructorMarker) {
        ShareFolderUserPermission shareFolderUserPermission2;
        ShareFolderPublicPermission shareFolderPublicPermission2;
        ShareFolderPermission shareFolderPermission;
        if ((i & 1) != 0) {
            shareFolderUserPermission2 = new ShareFolderUserPermission(0, null, null, false, null, 31, null);
        } else {
            shareFolderUserPermission2 = shareFolderUserPermission;
        }
        if ((i & 2) != 0) {
            shareFolderPublicPermission2 = new ShareFolderPublicPermission(false, false, false, false, null, 0, false, false, false, false, null, 2047, null);
            shareFolderPermission = this;
        } else {
            shareFolderPermission = this;
            shareFolderPublicPermission2 = shareFolderPublicPermission;
        }
        new ShareFolderPermission(shareFolderUserPermission2, shareFolderPublicPermission2);
    }
}
