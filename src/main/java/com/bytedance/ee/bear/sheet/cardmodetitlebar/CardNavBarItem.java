package com.bytedance.ee.bear.sheet.cardmodetitlebar;

import com.bytedance.ee.util.io.NonProguard;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0002J\b\u0010\u0012\u001a\u00020\u0013H\u0016J\b\u0010\u0014\u001a\u00020\u0015H\u0016R$\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004X\u000e¢\u0006\u0010\n\u0002\u0010\n\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR$\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004X\u000e¢\u0006\u0010\n\u0002\u0010\n\u001a\u0004\b\f\u0010\u0007\"\u0004\b\r\u0010\t¨\u0006\u0016"}, d2 = {"Lcom/bytedance/ee/bear/sheet/cardmodetitlebar/CardNavBarItem;", "Lcom/bytedance/ee/util/io/NonProguard;", "()V", "left", "", "Lcom/bytedance/ee/bear/sheet/cardmodetitlebar/NavBarItem;", "getLeft", "()[Lcom/bytedance/ee/bear/sheet/cardmodetitlebar/NavBarItem;", "setLeft", "([Lcom/bytedance/ee/bear/sheet/cardmodetitlebar/NavBarItem;)V", "[Lcom/bytedance/ee/bear/sheet/cardmodetitlebar/NavBarItem;", "right", "getRight", "setRight", "equals", "", "other", "", "hashCode", "", "toString", "", "sheet_release"}, mo238835k = 1, mv = {1, 1, 15})
public final class CardNavBarItem implements NonProguard {
    private NavBarItem[] left;
    private NavBarItem[] right;

    public final NavBarItem[] getLeft() {
        return this.left;
    }

    public final NavBarItem[] getRight() {
        return this.right;
    }

    public int hashCode() {
        int i;
        NavBarItem[] navBarItemArr = this.left;
        int i2 = 0;
        if (navBarItemArr != null) {
            i = Arrays.hashCode(navBarItemArr);
        } else {
            i = 0;
        }
        int i3 = i * 31;
        NavBarItem[] navBarItemArr2 = this.right;
        if (navBarItemArr2 != null) {
            i2 = Arrays.hashCode(navBarItemArr2);
        }
        return i3 + i2;
    }

    public String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append("CardNavBarItem(left=");
        NavBarItem[] navBarItemArr = this.left;
        String str2 = null;
        if (navBarItemArr != null) {
            str = Arrays.toString(navBarItemArr);
            Intrinsics.checkExpressionValueIsNotNull(str, "java.util.Arrays.toString(this)");
        } else {
            str = null;
        }
        sb.append(str);
        sb.append(", right=");
        NavBarItem[] navBarItemArr2 = this.right;
        if (navBarItemArr2 != null) {
            str2 = Arrays.toString(navBarItemArr2);
            Intrinsics.checkExpressionValueIsNotNull(str2, "java.util.Arrays.toString(this)");
        }
        sb.append(str2);
        sb.append(')');
        return sb.toString();
    }

    public final void setLeft(NavBarItem[] navBarItemArr) {
        this.left = navBarItemArr;
    }

    public final void setRight(NavBarItem[] navBarItemArr) {
        this.right = navBarItemArr;
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
            CardNavBarItem cardNavBarItem = (CardNavBarItem) obj;
            if (this.left != null) {
                if (cardNavBarItem.left == null) {
                    return false;
                }
            } else if (cardNavBarItem.left != null) {
                return false;
            }
            if (this.right != null) {
                if (cardNavBarItem.right == null) {
                    return false;
                }
            } else if (cardNavBarItem.right != null) {
                return false;
            }
            return true;
        }
        throw new TypeCastException("null cannot be cast to non-null type com.bytedance.ee.bear.sheet.cardmodetitlebar.CardNavBarItem");
    }
}
