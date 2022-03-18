package com.bytedance.ee.bear.sheet.fab;

import androidx.lifecycle.AbstractC1142af;
import androidx.lifecycle.C1177w;
import com.bytedance.ee.bear.sheet.common.C11088a;
import com.bytedance.ee.bear.sheet.fab.FabItem;

/* renamed from: com.bytedance.ee.bear.sheet.fab.b */
public class C11143b extends AbstractC1142af {
    private AbstractC11144a mDelegate;
    private C1177w<Integer> mFabHideTime = new C1177w<>();
    private C1177w<FabItem.FabSheetItem[]> mItems = new C1177w<>();

    /* renamed from: com.bytedance.ee.bear.sheet.fab.b$a */
    public interface AbstractC11144a {
        void onToolbarItemClick(String str, String str2);
    }

    public C1177w<Integer> getFabHideTime() {
        return this.mFabHideTime;
    }

    public C1177w<FabItem.FabSheetItem[]> getTopItems() {
        return this.mItems;
    }

    public void setDelegate(AbstractC11144a aVar) {
        this.mDelegate = aVar;
    }

    public void setFabHideTime(Integer num) {
        this.mFabHideTime.mo5929b(num);
    }

    public void updateItems(FabItem.FabSheetItem[] fabSheetItemArr) {
        this.mItems.mo5929b(fabSheetItemArr);
        for (FabItem.FabSheetItem fabSheetItem : fabSheetItemArr) {
            if (FabItemEnum.operation.name().equals(fabSheetItem.getId())) {
                C11088a.f29782a = fabSheetItem.getRangeType().toLowerCase();
                return;
            }
        }
    }

    public void clickItem(String str, String str2) {
        AbstractC11144a aVar = this.mDelegate;
        if (aVar != null) {
            if (str2 == null) {
                str2 = "";
            }
            aVar.onToolbarItemClick(str, str2);
        }
    }
}
