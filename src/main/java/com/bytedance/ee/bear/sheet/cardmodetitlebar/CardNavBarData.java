package com.bytedance.ee.bear.sheet.cardmodetitlebar;

import com.bytedance.ee.util.io.NonProguard;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0012\u001a\u00020\u0004H\u0016R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001c\u0010\t\u001a\u0004\u0018\u00010\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0006\"\u0004\b\u0011\u0010\b¨\u0006\u0013"}, d2 = {"Lcom/bytedance/ee/bear/sheet/cardmodetitlebar/CardNavBarData;", "Lcom/bytedance/ee/util/io/NonProguard;", "()V", "bgColor", "", "getBgColor", "()Ljava/lang/String;", "setBgColor", "(Ljava/lang/String;)V", "items", "Lcom/bytedance/ee/bear/sheet/cardmodetitlebar/CardNavBarItem;", "getItems", "()Lcom/bytedance/ee/bear/sheet/cardmodetitlebar/CardNavBarItem;", "setItems", "(Lcom/bytedance/ee/bear/sheet/cardmodetitlebar/CardNavBarItem;)V", "title", "getTitle", "setTitle", "toString", "sheet_release"}, mo238835k = 1, mv = {1, 1, 15})
public final class CardNavBarData implements NonProguard {
    private String bgColor;
    private CardNavBarItem items;
    private String title;

    public final String getBgColor() {
        return this.bgColor;
    }

    public final CardNavBarItem getItems() {
        return this.items;
    }

    public final String getTitle() {
        return this.title;
    }

    public String toString() {
        return "CardNavBarData(title=" + this.title + ", bgColor=" + this.bgColor + ", items=" + this.items + ')';
    }

    public final void setBgColor(String str) {
        this.bgColor = str;
    }

    public final void setItems(CardNavBarItem cardNavBarItem) {
        this.items = cardNavBarItem;
    }

    public final void setTitle(String str) {
        this.title = str;
    }
}
