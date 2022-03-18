package com.bytedance.ee.bear.sheet.filter;

import com.bytedance.ee.bear.sheet.filter.FilterData;
import com.bytedance.ee.util.io.NonProguard;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u000b\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\u001a\u0010\f\u001a\u00020\rX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R$\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0013X\u000e¢\u0006\u0010\n\u0002\u0010\u0019\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001c\u0010\u001a\u001a\u0004\u0018\u00010\u001bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u001a\u0010 \u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\u0006\"\u0004\b\"\u0010\bR\u001a\u0010#\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b$\u0010\u0006\"\u0004\b%\u0010\b¨\u0006&"}, d2 = {"Lcom/bytedance/ee/bear/sheet/filter/FilterPageData;", "Lcom/bytedance/ee/util/io/NonProguard;", "()V", "current", "", "getCurrent", "()I", "setCurrent", "(I)V", "currentCol", "getCurrentCol", "setCurrentCol", "hasNext", "", "getHasNext", "()Z", "setHasNext", "(Z)V", "list", "", "Lcom/bytedance/ee/bear/sheet/filter/FilterData$FilterOptionItem;", "getList", "()[Lcom/bytedance/ee/bear/sheet/filter/FilterData$FilterOptionItem;", "setList", "([Lcom/bytedance/ee/bear/sheet/filter/FilterData$FilterOptionItem;)V", "[Lcom/bytedance/ee/bear/sheet/filter/FilterData$FilterOptionItem;", "sheetId", "", "getSheetId", "()Ljava/lang/String;", "setSheetId", "(Ljava/lang/String;)V", "size", "getSize", "setSize", "total", "getTotal", "setTotal", "sheet_release"}, mo238835k = 1, mv = {1, 1, 15})
public final class FilterPageData implements NonProguard {
    private int current;
    private int currentCol;
    private boolean hasNext;
    private FilterData.FilterOptionItem[] list;
    private String sheetId;
    private int size;
    private int total;

    public final int getCurrent() {
        return this.current;
    }

    public final int getCurrentCol() {
        return this.currentCol;
    }

    public final boolean getHasNext() {
        return this.hasNext;
    }

    public final FilterData.FilterOptionItem[] getList() {
        return this.list;
    }

    public final String getSheetId() {
        return this.sheetId;
    }

    public final int getSize() {
        return this.size;
    }

    public final int getTotal() {
        return this.total;
    }

    public final void setCurrent(int i) {
        this.current = i;
    }

    public final void setCurrentCol(int i) {
        this.currentCol = i;
    }

    public final void setHasNext(boolean z) {
        this.hasNext = z;
    }

    public final void setList(FilterData.FilterOptionItem[] filterOptionItemArr) {
        this.list = filterOptionItemArr;
    }

    public final void setSheetId(String str) {
        this.sheetId = str;
    }

    public final void setSize(int i) {
        this.size = i;
    }

    public final void setTotal(int i) {
        this.total = i;
    }
}
