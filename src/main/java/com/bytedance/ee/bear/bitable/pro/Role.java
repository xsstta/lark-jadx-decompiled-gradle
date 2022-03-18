package com.bytedance.ee.bear.bitable.pro;

import com.bytedance.ee.bear.share.export.UserInfo;
import com.bytedance.ee.util.io.NonProguard;
import com.ss.android.vc.meeting.framework.statemachine.SmActions;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0012\n\u0002\u0010\u0000\n\u0002\b\u0007\u0018\u0000 )2\u00020\u0001:\u0001)Bk\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\u0018\b\u0002\u0010\u0005\u001a\u0012\u0012\u0004\u0012\u00020\u00070\u0006j\b\u0012\u0004\u0012\u00020\u0007`\b\u0012\u0018\b\u0002\u0010\t\u001a\u0012\u0012\u0004\u0012\u00020\n0\u0006j\b\u0012\u0004\u0012\u00020\n`\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f\u0012\b\b\u0002\u0010\r\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0010¢\u0006\u0002\u0010\u0011J\u0013\u0010!\u001a\u00020\u000e2\b\u0010\"\u001a\u0004\u0018\u00010#H\u0002J\u0006\u0010$\u001a\u00020\u0010J\u0006\u0010%\u001a\u00020\u0010J\b\u0010&\u001a\u00020\u0010H\u0016J\u0006\u0010'\u001a\u00020\u000eJ\u0006\u0010(\u001a\u00020\u000eR\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u001a\u0010\u000f\u001a\u00020\u0010X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001a\u0010\r\u001a\u00020\u000eX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u0018\"\u0004\b\u0019\u0010\u001aR!\u0010\u0005\u001a\u0012\u0012\u0004\u0012\u00020\u00070\u0006j\b\u0012\u0004\u0012\u00020\u0007`\b¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001eR!\u0010\t\u001a\u0012\u0012\u0004\u0012\u00020\n0\u0006j\b\u0012\u0004\u0012\u00020\n`\b¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u001c¨\u0006*"}, d2 = {"Lcom/bytedance/ee/bear/bitable/pro/Role;", "Lcom/bytedance/ee/util/io/NonProguard;", "roleId", "", "name", "members", "Ljava/util/ArrayList;", "Lcom/bytedance/ee/bear/share/export/UserInfo;", "Lkotlin/collections/ArrayList;", "tableRoleList", "Lcom/bytedance/ee/bear/bitable/pro/TableRole;", "createdTime", "", "isDefault", "", "defaultType", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/ArrayList;Ljava/util/ArrayList;JZI)V", "getCreatedTime", "()J", "getDefaultType", "()I", "setDefaultType", "(I)V", "()Z", "setDefault", "(Z)V", "getMembers", "()Ljava/util/ArrayList;", "getName", "()Ljava/lang/String;", "getRoleId", "getTableRoleList", "equals", "other", "", "getCanEditTableCount", "getCanReadTableCount", "hashCode", "isDefaultTypeEdit", "isDefaultTypeRead", "Companion", "bitable-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
public final class Role implements NonProguard {
    public static final Companion Companion = new Companion(null);
    private final long createdTime;
    private int defaultType;
    private boolean isDefault;
    private final ArrayList<UserInfo> members;
    private final String name;
    private final String roleId;
    private final ArrayList<TableRole> tableRoleList;

    public Role() {
        this(null, null, null, null, 0, false, 0, SmActions.ACTION_ONTHECALL_ENTRY, null);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/bytedance/ee/bear/bitable/pro/Role$Companion;", "", "()V", "DEFAULT_TYPE_EDIT", "", "DEFAULT_TYPE_READ", "bitable-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.bitable.pro.Role$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final long getCreatedTime() {
        return this.createdTime;
    }

    public final int getDefaultType() {
        return this.defaultType;
    }

    public final ArrayList<UserInfo> getMembers() {
        return this.members;
    }

    public final String getName() {
        return this.name;
    }

    public final String getRoleId() {
        return this.roleId;
    }

    public final ArrayList<TableRole> getTableRoleList() {
        return this.tableRoleList;
    }

    public final boolean isDefault() {
        return this.isDefault;
    }

    public int hashCode() {
        return this.roleId.hashCode();
    }

    public final boolean isDefaultTypeEdit() {
        if (this.defaultType == 1) {
            return true;
        }
        return false;
    }

    public final boolean isDefaultTypeRead() {
        if (this.defaultType == 2) {
            return true;
        }
        return false;
    }

    public final int getCanEditTableCount() {
        Iterator<TableRole> it = this.tableRoleList.iterator();
        int i = 0;
        while (it.hasNext()) {
            if (it.next().canEdit()) {
                i++;
            }
        }
        return i;
    }

    public final int getCanReadTableCount() {
        Iterator<TableRole> it = this.tableRoleList.iterator();
        int i = 0;
        while (it.hasNext()) {
            if (it.next().canRead()) {
                i++;
            }
        }
        return i;
    }

    public final void setDefault(boolean z) {
        this.isDefault = z;
    }

    public final void setDefaultType(int i) {
        this.defaultType = i;
    }

    public boolean equals(Object obj) {
        Class<?> cls;
        if (this == obj) {
            return true;
        }
        Class<?> cls2 = getClass();
        if (obj != null) {
            cls = obj.getClass();
        } else {
            cls = null;
        }
        if (!Intrinsics.areEqual(cls2, cls)) {
            return false;
        }
        if (obj == null) {
            throw new TypeCastException("null cannot be cast to non-null type com.bytedance.ee.bear.bitable.pro.Role");
        } else if (!Intrinsics.areEqual(this.roleId, ((Role) obj).roleId)) {
            return false;
        } else {
            return true;
        }
    }

    public Role(String str, String str2, ArrayList<UserInfo> arrayList, ArrayList<TableRole> arrayList2, long j, boolean z, int i) {
        Intrinsics.checkParameterIsNotNull(str, "roleId");
        Intrinsics.checkParameterIsNotNull(str2, "name");
        Intrinsics.checkParameterIsNotNull(arrayList, "members");
        Intrinsics.checkParameterIsNotNull(arrayList2, "tableRoleList");
        this.roleId = str;
        this.name = str2;
        this.members = arrayList;
        this.tableRoleList = arrayList2;
        this.createdTime = j;
        this.isDefault = z;
        this.defaultType = i;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ Role(java.lang.String r10, java.lang.String r11, java.util.ArrayList r12, java.util.ArrayList r13, long r14, boolean r16, int r17, int r18, kotlin.jvm.internal.DefaultConstructorMarker r19) {
        /*
            r9 = this;
            r0 = r18 & 1
            java.lang.String r1 = ""
            if (r0 == 0) goto L_0x0008
            r0 = r1
            goto L_0x0009
        L_0x0008:
            r0 = r10
        L_0x0009:
            r2 = r18 & 2
            if (r2 == 0) goto L_0x000e
            goto L_0x000f
        L_0x000e:
            r1 = r11
        L_0x000f:
            r2 = r18 & 4
            if (r2 == 0) goto L_0x0019
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            goto L_0x001a
        L_0x0019:
            r2 = r12
        L_0x001a:
            r3 = r18 & 8
            if (r3 == 0) goto L_0x0024
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            goto L_0x0025
        L_0x0024:
            r3 = r13
        L_0x0025:
            r4 = r18 & 16
            if (r4 == 0) goto L_0x002c
            r4 = 0
            goto L_0x002d
        L_0x002c:
            r4 = r14
        L_0x002d:
            r6 = r18 & 32
            r7 = 0
            if (r6 == 0) goto L_0x0034
            r6 = 0
            goto L_0x0036
        L_0x0034:
            r6 = r16
        L_0x0036:
            r8 = r18 & 64
            if (r8 == 0) goto L_0x003b
            goto L_0x003d
        L_0x003b:
            r7 = r17
        L_0x003d:
            r10 = r9
            r11 = r0
            r12 = r1
            r13 = r2
            r14 = r3
            r15 = r4
            r17 = r6
            r18 = r7
            r10.<init>(r11, r12, r13, r14, r15, r17, r18)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ee.bear.bitable.pro.Role.<init>(java.lang.String, java.lang.String, java.util.ArrayList, java.util.ArrayList, long, boolean, int, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
