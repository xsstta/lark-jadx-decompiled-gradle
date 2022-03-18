package com.bytedance.ee.bear.sheet.tab.contract;

import com.bytedance.ee.bear.sheet.tab.jsdata.SheetTabItem;
import com.google.firebase.messaging.Constants;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001:\u0001\u000eJ(\u0010\u0002\u001a\u00020\u00032\u001e\u0010\u0004\u001a\u001a\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0018\u00010\u0005j\f\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0018\u0001`\u0007H&J\u0012\u0010\b\u001a\u00020\u00032\b\u0010\t\u001a\u0004\u0018\u00010\nH&J\u0010\u0010\u000b\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\rH&¨\u0006\u000f"}, d2 = {"Lcom/bytedance/ee/bear/sheet/tab/contract/ISheetTabAdapter;", "", "setData", "", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Ljava/util/ArrayList;", "Lcom/bytedance/ee/bear/sheet/tab/jsdata/SheetTabItem;", "Lkotlin/collections/ArrayList;", "setOnSheetTabItemActionListener", "listener", "Lcom/bytedance/ee/bear/sheet/tab/contract/ISheetTabAdapter$OnSheetTabItemActionListener;", "setTabDropdownIconVisible", "showDropdownIcon", "", "OnSheetTabItemActionListener", "sheet_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.sheet.tab.a.a */
public interface ISheetTabAdapter {

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0007"}, d2 = {"Lcom/bytedance/ee/bear/sheet/tab/contract/ISheetTabAdapter$OnSheetTabItemActionListener;", "", "onClickTabItem", "", "item", "Lcom/bytedance/ee/bear/sheet/tab/jsdata/SheetTabItem;", "onDoubleClickTabItem", "sheet_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.sheet.tab.a.a$a */
    public interface OnSheetTabItemActionListener {
        /* renamed from: a */
        void mo43316a(SheetTabItem sheetTabItem);

        /* renamed from: b */
        void mo43319b(SheetTabItem sheetTabItem);
    }
}
