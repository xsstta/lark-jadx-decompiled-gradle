package com.bytedance.ee.bear.templates.center.list;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B#\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0002\u0010\u0007J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÆ\u0003J'\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001b\u001a\u00020\u0005HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001a\u0010\u0004\u001a\u00020\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0006\u001a\u00020\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\r\"\u0004\b\u0011\u0010\u000f¨\u0006\u001c"}, d2 = {"Lcom/bytedance/ee/bear/templates/center/list/CategoryBean;", "", "categoryId", "", "description", "", "name", "(JLjava/lang/String;Ljava/lang/String;)V", "getCategoryId", "()J", "setCategoryId", "(J)V", "getDescription", "()Ljava/lang/String;", "setDescription", "(Ljava/lang/String;)V", "getName", "setName", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "templates-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.templates.center.list.a */
public final class CategoryBean {

    /* renamed from: a */
    private long f30854a;

    /* renamed from: b */
    private String f30855b;

    /* renamed from: c */
    private String f30856c;

    public CategoryBean() {
        this(0, null, null, 7, null);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof CategoryBean) {
                CategoryBean aVar = (CategoryBean) obj;
                if (!(this.f30854a == aVar.f30854a) || !Intrinsics.areEqual(this.f30855b, aVar.f30855b) || !Intrinsics.areEqual(this.f30856c, aVar.f30856c)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        long j = this.f30854a;
        int i = ((int) (j ^ (j >>> 32))) * 31;
        String str = this.f30855b;
        int i2 = 0;
        int hashCode = (i + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f30856c;
        if (str2 != null) {
            i2 = str2.hashCode();
        }
        return hashCode + i2;
    }

    public String toString() {
        return "CategoryBean(categoryId=" + this.f30854a + ", description=" + this.f30855b + ", name=" + this.f30856c + ")";
    }

    /* renamed from: a */
    public final long mo44124a() {
        return this.f30854a;
    }

    /* renamed from: b */
    public final String mo44125b() {
        return this.f30856c;
    }

    public CategoryBean(long j, String str, String str2) {
        Intrinsics.checkParameterIsNotNull(str, "description");
        Intrinsics.checkParameterIsNotNull(str2, "name");
        this.f30854a = j;
        this.f30855b = str;
        this.f30856c = str2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ CategoryBean(long j, String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? -1 : j, (i & 2) != 0 ? "" : str, (i & 4) != 0 ? "" : str2);
    }
}
