package com.bytedance.ee.bear.document.bottommenu;

import com.bytedance.ee.util.io.NonProguard;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0002\u0016\u0017B\u0005¢\u0006\u0002\u0010\u0002R \u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001a\u0010\n\u001a\u00020\u000bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015¨\u0006\u0018"}, d2 = {"Lcom/bytedance/ee/bear/document/bottommenu/BottomMenuData;", "Lcom/bytedance/ee/util/io/NonProguard;", "()V", "items", "", "Lcom/bytedance/ee/bear/document/bottommenu/BottomMenuData$Item;", "getItems", "()Ljava/util/List;", "setItems", "(Ljava/util/List;)V", "showCancel", "", "getShowCancel", "()Z", "setShowCancel", "(Z)V", "title", "", "getTitle", "()Ljava/lang/String;", "setTitle", "(Ljava/lang/String;)V", "Item", "Position", "document-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
public final class BottomMenuData implements NonProguard {
    private List<Item> items = new ArrayList();
    private boolean showCancel;
    private String title;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0006\"\u0004\b\u0011\u0010\b¨\u0006\u0012"}, d2 = {"Lcom/bytedance/ee/bear/document/bottommenu/BottomMenuData$Item;", "Lcom/bytedance/ee/util/io/NonProguard;", "()V", "id", "", "getId", "()Ljava/lang/String;", "setId", "(Ljava/lang/String;)V", "style", "", "getStyle", "()I", "setStyle", "(I)V", "text", "getText", "setText", "document-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    public static final class Item implements NonProguard {
        private String id;
        private int style;
        private String text;

        public final String getId() {
            return this.id;
        }

        public final int getStyle() {
            return this.style;
        }

        public final String getText() {
            return this.text;
        }

        public final void setId(String str) {
            this.id = str;
        }

        public final void setStyle(int i) {
            this.style = i;
        }

        public final void setText(String str) {
            this.text = str;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000e\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\u001a\u0010\f\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u0006\"\u0004\b\u000e\u0010\bR\u001a\u0010\u000f\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0006\"\u0004\b\u0011\u0010\b¨\u0006\u0012"}, d2 = {"Lcom/bytedance/ee/bear/document/bottommenu/BottomMenuData$Position;", "Lcom/bytedance/ee/util/io/NonProguard;", "()V", "height", "", "getHeight", "()I", "setHeight", "(I)V", "left", "getLeft", "setLeft", "top", "getTop", "setTop", "width", "getWidth", "setWidth", "document-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    public static final class Position implements NonProguard {
        private int height;
        private int left;
        private int top;
        private int width;

        public final int getHeight() {
            return this.height;
        }

        public final int getLeft() {
            return this.left;
        }

        public final int getTop() {
            return this.top;
        }

        public final int getWidth() {
            return this.width;
        }

        public final void setHeight(int i) {
            this.height = i;
        }

        public final void setLeft(int i) {
            this.left = i;
        }

        public final void setTop(int i) {
            this.top = i;
        }

        public final void setWidth(int i) {
            this.width = i;
        }
    }

    public final List<Item> getItems() {
        return this.items;
    }

    public final boolean getShowCancel() {
        return this.showCancel;
    }

    public final String getTitle() {
        return this.title;
    }

    public final void setShowCancel(boolean z) {
        this.showCancel = z;
    }

    public final void setTitle(String str) {
        this.title = str;
    }

    public final void setItems(List<Item> list) {
        Intrinsics.checkParameterIsNotNull(list, "<set-?>");
        this.items = list;
    }
}
