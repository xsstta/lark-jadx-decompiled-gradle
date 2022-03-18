package com.bytedance.ee.bear.sheet.cardmodetitlebar;

import com.bytedance.ee.util.io.NonProguard;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\t\u001a\u00020\u0004H\u0016R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Lcom/bytedance/ee/bear/sheet/cardmodetitlebar/NavBarItem;", "Lcom/bytedance/ee/util/io/NonProguard;", "()V", "id", "", "getId", "()Ljava/lang/String;", "setId", "(Ljava/lang/String;)V", "toString", "sheet_release"}, mo238835k = 1, mv = {1, 1, 15})
public final class NavBarItem implements NonProguard {
    private String id;

    public final String getId() {
        return this.id;
    }

    public String toString() {
        return "NavBarItem(id=" + this.id + ')';
    }

    public final void setId(String str) {
        this.id = str;
    }
}
