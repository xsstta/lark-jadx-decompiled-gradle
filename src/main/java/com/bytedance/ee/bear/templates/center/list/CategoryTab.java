package com.bytedance.ee.bear.templates.center.list;

import com.bytedance.ee.util.io.NonProguard;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B3\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000bJ\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\t\u0010\u001a\u001a\u00020\bHÆ\u0003J\t\u0010\u001b\u001a\u00020\nHÆ\u0003J7\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\nHÆ\u0001J\u0013\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010 HÖ\u0003J\t\u0010!\u001a\u00020\nHÖ\u0001J\t\u0010\"\u001a\u00020#HÖ\u0001R\u001a\u0010\u0007\u001a\u00020\bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u001a\u0010\t\u001a\u00020\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017¨\u0006$"}, d2 = {"Lcom/bytedance/ee/bear/templates/center/list/CategoryTab;", "Lcom/bytedance/ee/util/io/NonProguard;", "categoryTabName", "", "categoryList", "", "Lcom/bytedance/ee/bear/templates/center/list/Category;", "categoryId", "", "pageNumber", "", "(Ljava/lang/CharSequence;Ljava/util/List;JI)V", "getCategoryId", "()J", "setCategoryId", "(J)V", "getCategoryList", "()Ljava/util/List;", "getCategoryTabName", "()Ljava/lang/CharSequence;", "getPageNumber", "()I", "setPageNumber", "(I)V", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "", "hashCode", "toString", "", "templates-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
public final class CategoryTab implements NonProguard {
    private long categoryId;
    private final List<Category> categoryList;
    private final CharSequence categoryTabName;
    private int pageNumber;

    public CategoryTab() {
        this(null, null, 0, 0, 15, null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: com.bytedance.ee.bear.templates.center.list.CategoryTab */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CategoryTab copy$default(CategoryTab categoryTab, CharSequence charSequence, List list, long j, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            charSequence = categoryTab.categoryTabName;
        }
        if ((i2 & 2) != 0) {
            list = categoryTab.categoryList;
        }
        if ((i2 & 4) != 0) {
            j = categoryTab.categoryId;
        }
        if ((i2 & 8) != 0) {
            i = categoryTab.pageNumber;
        }
        return categoryTab.copy(charSequence, list, j, i);
    }

    public final CharSequence component1() {
        return this.categoryTabName;
    }

    public final List<Category> component2() {
        return this.categoryList;
    }

    public final long component3() {
        return this.categoryId;
    }

    public final int component4() {
        return this.pageNumber;
    }

    public final CategoryTab copy(CharSequence charSequence, List<Category> list, long j, int i) {
        Intrinsics.checkParameterIsNotNull(charSequence, "categoryTabName");
        Intrinsics.checkParameterIsNotNull(list, "categoryList");
        return new CategoryTab(charSequence, list, j, i);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof CategoryTab) {
                CategoryTab categoryTab = (CategoryTab) obj;
                if (Intrinsics.areEqual(this.categoryTabName, categoryTab.categoryTabName) && Intrinsics.areEqual(this.categoryList, categoryTab.categoryList)) {
                    if (this.categoryId == categoryTab.categoryId) {
                        if (this.pageNumber == categoryTab.pageNumber) {
                            return true;
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        CharSequence charSequence = this.categoryTabName;
        int i = 0;
        int hashCode = (charSequence != null ? charSequence.hashCode() : 0) * 31;
        List<Category> list = this.categoryList;
        if (list != null) {
            i = list.hashCode();
        }
        long j = this.categoryId;
        return ((((hashCode + i) * 31) + ((int) (j ^ (j >>> 32)))) * 31) + this.pageNumber;
    }

    public String toString() {
        return "CategoryTab(categoryTabName=" + this.categoryTabName + ", categoryList=" + this.categoryList + ", categoryId=" + this.categoryId + ", pageNumber=" + this.pageNumber + ")";
    }

    public final long getCategoryId() {
        return this.categoryId;
    }

    public final List<Category> getCategoryList() {
        return this.categoryList;
    }

    public final CharSequence getCategoryTabName() {
        return this.categoryTabName;
    }

    public final int getPageNumber() {
        return this.pageNumber;
    }

    public final void setCategoryId(long j) {
        this.categoryId = j;
    }

    public final void setPageNumber(int i) {
        this.pageNumber = i;
    }

    public CategoryTab(CharSequence charSequence, List<Category> list, long j, int i) {
        Intrinsics.checkParameterIsNotNull(charSequence, "categoryTabName");
        Intrinsics.checkParameterIsNotNull(list, "categoryList");
        this.categoryTabName = charSequence;
        this.categoryList = list;
        this.categoryId = j;
        this.pageNumber = i;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ CategoryTab(java.lang.CharSequence r4, java.util.List r5, long r6, int r8, int r9, kotlin.jvm.internal.DefaultConstructorMarker r10) {
        /*
            r3 = this;
            r10 = r9 & 1
            if (r10 == 0) goto L_0x0008
            java.lang.String r4 = ""
            java.lang.CharSequence r4 = (java.lang.CharSequence) r4
        L_0x0008:
            r10 = r9 & 2
            if (r10 == 0) goto L_0x0013
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            java.util.List r5 = (java.util.List) r5
        L_0x0013:
            r10 = r5
            r5 = r9 & 4
            if (r5 == 0) goto L_0x001a
            r6 = -1
        L_0x001a:
            r0 = r6
            r5 = r9 & 8
            if (r5 == 0) goto L_0x0022
            r8 = 0
            r2 = 0
            goto L_0x0023
        L_0x0022:
            r2 = r8
        L_0x0023:
            r5 = r3
            r6 = r4
            r7 = r10
            r8 = r0
            r10 = r2
            r5.<init>(r6, r7, r8, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ee.bear.templates.center.list.CategoryTab.<init>(java.lang.CharSequence, java.util.List, long, int, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
