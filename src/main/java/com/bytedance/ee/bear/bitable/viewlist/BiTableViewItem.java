package com.bytedance.ee.bear.bitable.viewlist;

import com.bytedance.ee.util.io.NonProguard;
import com.bytedance.ee.util.p700c.C13598b;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0013\u0010\u0016\u001a\u00020\u00042\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0002J\b\u0010\u0019\u001a\u00020\u001aH\u0016J\b\u0010\u001b\u001a\u00020\u000bH\u0016R\u001e\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u0010\n\u0002\u0010\t\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001c\u0010\n\u001a\u0004\u0018\u00010\u000bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u000bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\r\"\u0004\b\u0012\u0010\u000fR\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u000bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\r\"\u0004\b\u0015\u0010\u000f¨\u0006\u001c"}, d2 = {"Lcom/bytedance/ee/bear/bitable/viewlist/BiTableViewItem;", "Lcom/bytedance/ee/util/io/NonProguard;", "()V", "active", "", "getActive", "()Ljava/lang/Boolean;", "setActive", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "id", "", "getId", "()Ljava/lang/String;", "setId", "(Ljava/lang/String;)V", "title", "getTitle", "setTitle", ShareHitPoint.f121869d, "getType", "setType", "equals", "other", "", "hashCode", "", "toString", "bitable-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
public final class BiTableViewItem implements NonProguard {
    private Boolean active;
    private String id;
    private String title;
    private String type;

    public final Boolean getActive() {
        return this.active;
    }

    public final String getId() {
        return this.id;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getType() {
        return this.type;
    }

    public int hashCode() {
        int i;
        int i2;
        int i3;
        String str = this.id;
        int i4 = 0;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        int i5 = i * 31;
        String str2 = this.title;
        if (str2 != null) {
            i2 = str2.hashCode();
        } else {
            i2 = 0;
        }
        int i6 = (i5 + i2) * 31;
        String str3 = this.type;
        if (str3 != null) {
            i3 = str3.hashCode();
        } else {
            i3 = 0;
        }
        int i7 = (i6 + i3) * 31;
        Boolean bool = this.active;
        if (bool != null) {
            i4 = bool.hashCode();
        }
        return i7 + i4;
    }

    public String toString() {
        return "BiTableViewItem(id=" + this.id + ", title=" + C13598b.m55197d(this.title) + ", " + "type=" + this.type + ", active=" + this.active + ')';
    }

    public final void setActive(Boolean bool) {
        this.active = bool;
    }

    public final void setId(String str) {
        this.id = str;
    }

    public final void setTitle(String str) {
        this.title = str;
    }

    public final void setType(String str) {
        this.type = str;
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
        if (obj != null) {
            BiTableViewItem biTableViewItem = (BiTableViewItem) obj;
            if (!(!Intrinsics.areEqual(this.id, biTableViewItem.id)) && !(!Intrinsics.areEqual(this.title, biTableViewItem.title)) && !(!Intrinsics.areEqual(this.type, biTableViewItem.type)) && !(!Intrinsics.areEqual(this.active, biTableViewItem.active))) {
                return true;
            }
            return false;
        }
        throw new TypeCastException("null cannot be cast to non-null type com.bytedance.ee.bear.bitable.viewlist.BiTableViewItem");
    }
}
