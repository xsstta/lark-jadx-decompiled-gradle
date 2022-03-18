package com.bytedance.ee.bear.sheet.filter;

import com.bytedance.ee.util.io.NonProguard;
import com.google.firebase.messaging.Constants;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import kotlin.Metadata;
import kotlin.annotation.AnnotationRetention;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001:\u0004\t\n\u000b\fB\u0005¢\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\r"}, d2 = {"Lcom/bytedance/ee/bear/sheet/filter/FilterData;", "Lcom/bytedance/ee/util/io/NonProguard;", "()V", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Lcom/bytedance/ee/bear/sheet/filter/FilterData$FilterItem;", "getData", "()Lcom/bytedance/ee/bear/sheet/filter/FilterData$FilterItem;", "setData", "(Lcom/bytedance/ee/bear/sheet/filter/FilterData$FilterItem;)V", "ColRange", "FilterItem", "FilterOptionItem", "FilterSheetItem", "sheet_release"}, mo238835k = 1, mv = {1, 1, 15})
public final class FilterData implements NonProguard {
    private FilterItem data;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\b¨\u0006\f"}, d2 = {"Lcom/bytedance/ee/bear/sheet/filter/FilterData$ColRange;", "Lcom/bytedance/ee/util/io/NonProguard;", "()V", "index", "", "getIndex", "()I", "setIndex", "(I)V", "total", "getTotal", "setTotal", "sheet_release"}, mo238835k = 1, mv = {1, 1, 15})
    public static final class ColRange implements NonProguard {
        private int index;
        private int total;

        public final int getIndex() {
            return this.index;
        }

        public final int getTotal() {
            return this.total;
        }

        public final void setIndex(int i) {
            this.index = i;
        }

        public final void setTotal(int i) {
            this.total = i;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR$\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nX\u000e¢\u0006\u0010\n\u0002\u0010\u0010\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u0012X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0014\"\u0004\b\u0019\u0010\u0016¨\u0006\u001a"}, d2 = {"Lcom/bytedance/ee/bear/sheet/filter/FilterData$FilterItem;", "Lcom/bytedance/ee/util/io/NonProguard;", "()V", "colRange", "Lcom/bytedance/ee/bear/sheet/filter/FilterData$ColRange;", "getColRange", "()Lcom/bytedance/ee/bear/sheet/filter/FilterData$ColRange;", "setColRange", "(Lcom/bytedance/ee/bear/sheet/filter/FilterData$ColRange;)V", "items", "", "Lcom/bytedance/ee/bear/sheet/filter/FilterData$FilterSheetItem;", "getItems", "()[Lcom/bytedance/ee/bear/sheet/filter/FilterData$FilterSheetItem;", "setItems", "([Lcom/bytedance/ee/bear/sheet/filter/FilterData$FilterSheetItem;)V", "[Lcom/bytedance/ee/bear/sheet/filter/FilterData$FilterSheetItem;", "sheetId", "", "getSheetId", "()Ljava/lang/String;", "setSheetId", "(Ljava/lang/String;)V", "title", "getTitle", "setTitle", "sheet_release"}, mo238835k = 1, mv = {1, 1, 15})
    public static final class FilterItem implements NonProguard {
        private ColRange colRange;
        private FilterSheetItem[] items;
        private String sheetId;
        private String title;

        public final ColRange getColRange() {
            return this.colRange;
        }

        public final FilterSheetItem[] getItems() {
            return this.items;
        }

        public final String getSheetId() {
            return this.sheetId;
        }

        public final String getTitle() {
            return this.title;
        }

        public final void setColRange(ColRange colRange2) {
            this.colRange = colRange2;
        }

        public final void setItems(FilterSheetItem[] filterSheetItemArr) {
            this.items = filterSheetItemArr;
        }

        public final void setSheetId(String str) {
            this.sheetId = str;
        }

        public final void setTitle(String str) {
            this.title = str;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0011\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0011\u0018\u00002\u00020\u0001:\u0001-B\u0005¢\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR$\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\nX\u000e¢\u0006\u0010\n\u0002\u0010\u000f\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR$\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\nX\u000e¢\u0006\u0010\n\u0002\u0010\u000f\u001a\u0004\b\u0011\u0010\f\"\u0004\b\u0012\u0010\u000eR\u001a\u0010\u0013\u001a\u00020\u0014X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001c\u0010\u0019\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u0006\"\u0004\b\u001b\u0010\bR\u001a\u0010\u001c\u001a\u00020\u001dX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001e\"\u0004\b\u001f\u0010 R\u001a\u0010!\u001a\u00020\u001dX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\u001e\"\u0004\b\"\u0010 R\u001c\u0010#\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b$\u0010\u0006\"\u0004\b%\u0010\bR\"\u0010&\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b'\u0010\u0002\u001a\u0004\b(\u0010\u0006\"\u0004\b)\u0010\bR\u001c\u0010*\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b+\u0010\u0006\"\u0004\b,\u0010\b¨\u0006."}, d2 = {"Lcom/bytedance/ee/bear/sheet/filter/FilterData$FilterOptionItem;", "Lcom/bytedance/ee/util/io/NonProguard;", "()V", "colorValue", "", "getColorValue", "()Ljava/lang/String;", "setColorValue", "(Ljava/lang/String;)V", "colors", "", "getColors", "()[Ljava/lang/String;", "setColors", "([Ljava/lang/String;)V", "[Ljava/lang/String;", "conditionValue", "getConditionValue", "setConditionValue", "count", "", "getCount", "()I", "setCount", "(I)V", "id", "getId", "setId", "isSelect", "", "()Z", "setSelect", "(Z)V", "isVisible", "setVisible", "title", "getTitle", "setTitle", ShareHitPoint.f121869d, "type$annotations", "getType", "setType", "value", "getValue", "setValue", "Type", "sheet_release"}, mo238835k = 1, mv = {1, 1, 15})
    public static final class FilterOptionItem implements NonProguard {
        private String colorValue;
        private String[] colors;
        private String[] conditionValue;
        private int count;
        private String id;
        private boolean isSelect;
        private boolean isVisible = true;
        private String title;
        private String type;
        private String value;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0002\b\u0002\b\u0002\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002B\u0000¨\u0006\u0003"}, d2 = {"Lcom/bytedance/ee/bear/sheet/filter/FilterData$FilterOptionItem$Type;", "", "Companion", "sheet_release"}, mo238835k = 1, mv = {1, 1, 15})
        @Retention(RetentionPolicy.SOURCE)
        @kotlin.annotation.Retention(AnnotationRetention.SOURCE)
        public @interface Type {
            public static final Companion Companion = Companion.f29940a;

            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lcom/bytedance/ee/bear/sheet/filter/FilterData$FilterOptionItem$Type$Companion;", "", "()V", "RANGE", "", "SINGLE", "TEXT", "sheet_release"}, mo238835k = 1, mv = {1, 1, 15})
            /* renamed from: com.bytedance.ee.bear.sheet.filter.FilterData$FilterOptionItem$Type$a */
            public static final class Companion {

                /* renamed from: a */
                static final /* synthetic */ Companion f29940a = new Companion();

                private Companion() {
                }
            }
        }

        public static /* synthetic */ void type$annotations() {
        }

        public final String getColorValue() {
            return this.colorValue;
        }

        public final String[] getColors() {
            return this.colors;
        }

        public final String[] getConditionValue() {
            return this.conditionValue;
        }

        public final int getCount() {
            return this.count;
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

        public final String getValue() {
            return this.value;
        }

        public final boolean isSelect() {
            return this.isSelect;
        }

        public final boolean isVisible() {
            return this.isVisible;
        }

        public final void setColorValue(String str) {
            this.colorValue = str;
        }

        public final void setColors(String[] strArr) {
            this.colors = strArr;
        }

        public final void setConditionValue(String[] strArr) {
            this.conditionValue = strArr;
        }

        public final void setCount(int i) {
            this.count = i;
        }

        public final void setId(String str) {
            this.id = str;
        }

        public final void setSelect(boolean z) {
            this.isSelect = z;
        }

        public final void setTitle(String str) {
            this.title = str;
        }

        public final void setType(String str) {
            this.type = str;
        }

        public final void setValue(String str) {
            this.value = str;
        }

        public final void setVisible(boolean z) {
            this.isVisible = z;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\r\u0018\u00002\u00020\u0001:\u0001&B\u0005¢\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\"\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b\u0011\u0010\u0002\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0016\u001a\u00020\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\f\"\u0004\b\u0017\u0010\u000eR$\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u0019X\u000e¢\u0006\u0010\n\u0002\u0010\u001f\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u001c\u0010 \u001a\u0004\u0018\u00010\u0010X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\u0013\"\u0004\b\"\u0010\u0015R\u001a\u0010#\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b$\u0010\u0006\"\u0004\b%\u0010\b¨\u0006'"}, d2 = {"Lcom/bytedance/ee/bear/sheet/filter/FilterData$FilterSheetItem;", "Lcom/bytedance/ee/util/io/NonProguard;", "()V", "current", "", "getCurrent", "()I", "setCurrent", "(I)V", "hasNext", "", "getHasNext", "()Z", "setHasNext", "(Z)V", "id", "", "id$annotations", "getId", "()Ljava/lang/String;", "setId", "(Ljava/lang/String;)V", "isSelectAll", "setSelectAll", "list", "", "Lcom/bytedance/ee/bear/sheet/filter/FilterData$FilterOptionItem;", "getList", "()[Lcom/bytedance/ee/bear/sheet/filter/FilterData$FilterOptionItem;", "setList", "([Lcom/bytedance/ee/bear/sheet/filter/FilterData$FilterOptionItem;)V", "[Lcom/bytedance/ee/bear/sheet/filter/FilterData$FilterOptionItem;", "title", "getTitle", "setTitle", "total", "getTotal", "setTotal", "Id", "sheet_release"}, mo238835k = 1, mv = {1, 1, 15})
    public static final class FilterSheetItem implements NonProguard {
        private int current;
        private boolean hasNext;
        private String id;
        private boolean isSelectAll;
        private FilterOptionItem[] list;
        private String title;
        private int total;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0002\b\u0002\b\u0002\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002B\u0000¨\u0006\u0003"}, d2 = {"Lcom/bytedance/ee/bear/sheet/filter/FilterData$FilterSheetItem$Id;", "", "Companion", "sheet_release"}, mo238835k = 1, mv = {1, 1, 15})
        @Retention(RetentionPolicy.SOURCE)
        @kotlin.annotation.Retention(AnnotationRetention.SOURCE)
        public @interface Id {
            public static final Companion Companion = Companion.f29941a;

            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lcom/bytedance/ee/bear/sheet/filter/FilterData$FilterSheetItem$Id$Companion;", "", "()V", "FILTER_COLOR", "", "FILTER_CONDITION", "FILTER_VALUE", "sheet_release"}, mo238835k = 1, mv = {1, 1, 15})
            /* renamed from: com.bytedance.ee.bear.sheet.filter.FilterData$FilterSheetItem$Id$a */
            public static final class Companion {

                /* renamed from: a */
                static final /* synthetic */ Companion f29941a = new Companion();

                private Companion() {
                }
            }
        }

        public static /* synthetic */ void id$annotations() {
        }

        public final int getCurrent() {
            return this.current;
        }

        public final boolean getHasNext() {
            return this.hasNext;
        }

        public final String getId() {
            return this.id;
        }

        public final FilterOptionItem[] getList() {
            return this.list;
        }

        public final String getTitle() {
            return this.title;
        }

        public final int getTotal() {
            return this.total;
        }

        public final boolean isSelectAll() {
            return this.isSelectAll;
        }

        public final void setCurrent(int i) {
            this.current = i;
        }

        public final void setHasNext(boolean z) {
            this.hasNext = z;
        }

        public final void setId(String str) {
            this.id = str;
        }

        public final void setList(FilterOptionItem[] filterOptionItemArr) {
            this.list = filterOptionItemArr;
        }

        public final void setSelectAll(boolean z) {
            this.isSelectAll = z;
        }

        public final void setTitle(String str) {
            this.title = str;
        }

        public final void setTotal(int i) {
            this.total = i;
        }
    }

    public final FilterItem getData() {
        return this.data;
    }

    public final void setData(FilterItem filterItem) {
        this.data = filterItem;
    }
}
