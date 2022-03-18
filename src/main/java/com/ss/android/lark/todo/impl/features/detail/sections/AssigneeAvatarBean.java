package com.ss.android.lark.todo.impl.features.detail.sections;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0006HÆ\u0003J'\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00062\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001H\u0002J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0016"}, d2 = {"Lcom/ss/android/lark/todo/impl/features/detail/sections/AssigneeAvatarBean;", "", "id", "", "avatarKey", "statusShow", "", "(Ljava/lang/String;Ljava/lang/String;Z)V", "getAvatarKey", "()Ljava/lang/String;", "getId", "getStatusShow", "()Z", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "todo_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.todo.impl.features.detail.d.b */
public final class AssigneeAvatarBean {

    /* renamed from: a */
    private final String f139945a;

    /* renamed from: b */
    private final String f139946b;

    /* renamed from: c */
    private final boolean f139947c;

    public int hashCode() {
        String str = this.f139945a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f139946b;
        if (str2 != null) {
            i = str2.hashCode();
        }
        int i2 = (hashCode + i) * 31;
        boolean z = this.f139947c;
        if (z) {
            z = true;
        }
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        int i5 = z ? 1 : 0;
        return i2 + i3;
    }

    public String toString() {
        return "AssigneeAvatarBean(id=" + this.f139945a + ", avatarKey=" + this.f139946b + ", statusShow=" + this.f139947c + ")";
    }

    /* renamed from: a */
    public final String mo192543a() {
        return this.f139945a;
    }

    /* renamed from: b */
    public final String mo192544b() {
        return this.f139946b;
    }

    /* renamed from: c */
    public final boolean mo192545c() {
        return this.f139947c;
    }

    public boolean equals(Object obj) {
        AssigneeAvatarBean bVar = (AssigneeAvatarBean) obj;
        if (bVar == null || !Intrinsics.areEqual(this.f139945a, bVar.f139945a) || bVar.f139947c != this.f139947c) {
            return false;
        }
        return true;
    }

    public AssigneeAvatarBean(String str, String str2, boolean z) {
        Intrinsics.checkParameterIsNotNull(str, "id");
        Intrinsics.checkParameterIsNotNull(str2, "avatarKey");
        this.f139945a = str;
        this.f139946b = str2;
        this.f139947c = z;
    }
}
