package com.bytedance.ee.bear.sheet.tab.contract;

import com.bytedance.ee.bear.sheet.tab.jsdata.SheetTabItem;
import java.util.ArrayList;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u001c\u0010\u0004\u001a\u0016\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005j\n\u0012\u0004\u0012\u00020\u0006\u0018\u0001`\u0007H&¨\u0006\b"}, d2 = {"Lcom/bytedance/ee/bear/sheet/tab/contract/ISheetTabModel;", "", "canEdit", "", "getSheetTabData", "Ljava/util/ArrayList;", "Lcom/bytedance/ee/bear/sheet/tab/jsdata/SheetTabItem;", "Lkotlin/collections/ArrayList;", "sheet_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.sheet.tab.a.b */
public interface ISheetTabModel {
    boolean canEdit();

    ArrayList<SheetTabItem> getSheetTabData();
}
