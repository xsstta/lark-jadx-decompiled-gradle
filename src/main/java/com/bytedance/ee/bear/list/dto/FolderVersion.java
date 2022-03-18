package com.bytedance.ee.bear.list.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.ee.util.io.NonProguard;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00182\u00020\u00012\u00020\u0002:\u0001\u0018B#\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\t\u0010\r\u001a\u00020\u0004HÖ\u0001J\u0006\u0010\u000e\u001a\u00020\u0007J\u0006\u0010\u000f\u001a\u00020\u0007J\u0006\u0010\u0010\u001a\u00020\u0007J\u0006\u0010\u0011\u001a\u00020\u0007J\u0006\u0010\u0012\u001a\u00020\u0007J\u0019\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0004HÖ\u0001R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\tR\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000b¨\u0006\u0019"}, d2 = {"Lcom/bytedance/ee/bear/list/dto/FolderVersion;", "Lcom/bytedance/ee/util/io/NonProguard;", "Landroid/os/Parcelable;", "ownerType", "", "shareVersion", "isShareFolder", "", "(IIZ)V", "()Z", "getOwnerType", "()I", "getShareVersion", "describeContents", "isFolderV1", "isOldShareFolder", "isPersonalFolder", "isShareFolderV1", "isShareFolderV2", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "Companion", "list-export_release"}, mo238835k = 1, mv = {1, 1, 15})
public final class FolderVersion implements Parcelable, NonProguard {
    public static final Parcelable.Creator CREATOR = new C8274b();
    public static final Companion Companion = new Companion(null);
    private final boolean isShareFolder;
    private final int ownerType;
    private final int shareVersion;

    @Metadata(bv = {1, 0, 3}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.list.dto.FolderVersion$b */
    public static class C8274b implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkParameterIsNotNull(parcel, "in");
            return new FolderVersion(parcel.readInt(), parcel.readInt(), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new FolderVersion[i];
        }
    }

    public FolderVersion() {
        this(0, 0, false, 7, null);
    }

    @JvmStatic
    public static final boolean acceptOwnerType(int i) {
        return Companion.mo32534e(i);
    }

    @JvmStatic
    public static final FolderVersion getFolderVersionV2() {
        return Companion.mo32525a();
    }

    @JvmStatic
    public static final int getNewShareFolderOwnerType() {
        return Companion.mo32528b();
    }

    @JvmStatic
    public static final int getPersonalFolderOwnerType() {
        return Companion.mo32531c();
    }

    @JvmStatic
    public static final boolean isNewShareFolder(int i) {
        return Companion.mo32533d(i);
    }

    @JvmStatic
    public static final boolean isOldShareFolder(int i) {
        return Companion.mo32532c(i);
    }

    @JvmStatic
    public static final boolean isPersonalFolder(int i, boolean z) {
        return Companion.mo32527a(i, z);
    }

    @JvmStatic
    public static final boolean isShareFolder(int i, boolean z) {
        return Companion.mo32530b(i, z);
    }

    @JvmStatic
    public static final boolean isShareFolderV1(int i) {
        return Companion.mo32526a(i);
    }

    @JvmStatic
    public static final boolean isShareFolderV2(int i) {
        return Companion.mo32529b(i);
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        Intrinsics.checkParameterIsNotNull(parcel, "parcel");
        parcel.writeInt(this.ownerType);
        parcel.writeInt(this.shareVersion);
        parcel.writeInt(this.isShareFolder ? 1 : 0);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0004H\u0007J\b\u0010\f\u001a\u00020\rH\u0007J\b\u0010\u000e\u001a\u00020\u0004H\u0007J\b\u0010\u000f\u001a\u00020\u0004H\u0007J\u0010\u0010\u0010\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u0004H\u0007J\u0010\u0010\u0012\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u0004H\u0007J\u0018\u0010\u0013\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\nH\u0007J\u0018\u0010\u0014\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\nH\u0007J\u0010\u0010\u0015\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0004H\u0007J\u0010\u0010\u0016\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0004H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Lcom/bytedance/ee/bear/list/dto/FolderVersion$Companion;", "", "()V", "NEW_SHARE_FOLDER_VERSION", "", "OLD_SHARE_FOLDER_VERSION", "OWNER_TYPE_OLD_SHARE_FOLDER_V1", "OWNER_TYPE_OLD_SHARE_FOLDER_V2", "OWNER_TYPE_PERSONAL_FOLDER", "acceptOwnerType", "", "ownerType", "getFolderVersionV2", "Lcom/bytedance/ee/bear/list/dto/FolderVersion;", "getNewShareFolderOwnerType", "getPersonalFolderOwnerType", "isNewShareFolder", "shareVersion", "isOldShareFolder", "isPersonalFolder", "isShareFolder", "isShareFolderV1", "isShareFolderV2", "list-export_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.list.dto.FolderVersion$a */
    public static final class Companion {
        @JvmStatic
        /* renamed from: a */
        public final boolean mo32526a(int i) {
            return i == 1;
        }

        @JvmStatic
        /* renamed from: b */
        public final int mo32528b() {
            return 5;
        }

        @JvmStatic
        /* renamed from: b */
        public final boolean mo32529b(int i) {
            return i == 5;
        }

        @JvmStatic
        /* renamed from: c */
        public final int mo32531c() {
            return 0;
        }

        @JvmStatic
        /* renamed from: c */
        public final boolean mo32532c(int i) {
            return i == 0;
        }

        @JvmStatic
        /* renamed from: d */
        public final boolean mo32533d(int i) {
            return i == 1;
        }

        @JvmStatic
        /* renamed from: e */
        public final boolean mo32534e(int i) {
            return i == 0 || i == 1 || i == 5;
        }

        private Companion() {
        }

        @JvmStatic
        /* renamed from: a */
        public final FolderVersion mo32525a() {
            return new FolderVersion(5, 0, true);
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        /* renamed from: a */
        public final boolean mo32527a(int i, boolean z) {
            if (mo32529b(i)) {
                if (!z) {
                    return true;
                }
            } else if (i == 0) {
                return true;
            }
            return false;
        }

        @JvmStatic
        /* renamed from: b */
        public final boolean mo32530b(int i, boolean z) {
            Companion aVar = this;
            if (aVar.mo32526a(i)) {
                return true;
            }
            if (aVar.mo32529b(i)) {
                return z;
            }
            return false;
        }
    }

    public final int getOwnerType() {
        return this.ownerType;
    }

    public final int getShareVersion() {
        return this.shareVersion;
    }

    public final boolean isShareFolder() {
        return this.isShareFolder;
    }

    public final boolean isFolderV1() {
        int i = this.ownerType;
        if (i == 0 || i == 1) {
            return true;
        }
        return false;
    }

    public final boolean isOldShareFolder() {
        return Companion.mo32532c(this.shareVersion);
    }

    public final boolean isPersonalFolder() {
        return Companion.mo32527a(this.ownerType, this.isShareFolder);
    }

    public final boolean isShareFolderV1() {
        return Companion.mo32526a(this.ownerType);
    }

    public final boolean isShareFolderV2() {
        return Companion.mo32529b(this.ownerType);
    }

    public FolderVersion(int i, int i2, boolean z) {
        this.ownerType = i;
        this.shareVersion = i2;
        this.isShareFolder = z;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ FolderVersion(int i, int i2, boolean z, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? 0 : i, (i3 & 2) != 0 ? 0 : i2, (i3 & 4) != 0 ? false : z);
    }
}
