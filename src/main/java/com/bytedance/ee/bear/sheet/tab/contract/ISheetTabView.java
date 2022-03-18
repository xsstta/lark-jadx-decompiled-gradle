package com.bytedance.ee.bear.sheet.tab.contract;

import android.view.View;
import com.bytedance.ee.bear.sheet.tab.contract.ISheetTabAdapter;
import com.bytedance.ee.bear.sheet.tab.jsdata.SheetTabItem;
import com.google.firebase.messaging.Constants;
import java.util.ArrayList;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001:\u0001\u0017J\b\u0010\u0002\u001a\u00020\u0003H&J\u0010\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H&J$\u0010\u0007\u001a\u00020\u00032\u001a\u0010\b\u001a\u0016\u0012\u0004\u0012\u00020\n\u0018\u00010\tj\n\u0012\u0004\u0012\u00020\n\u0018\u0001`\u000bH&J\u0010\u0010\f\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u0006H&J\u0010\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H&J\u0010\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H&J\u0010\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u0012H&J\u0012\u0010\u0013\u001a\u00020\u00032\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H&J\b\u0010\u0016\u001a\u00020\u0003H&¨\u0006\u0018"}, d2 = {"Lcom/bytedance/ee/bear/sheet/tab/contract/ISheetTabView;", "", "hideSheetTabView", "", "setAddViewVisible", "visible", "", "setData", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Ljava/util/ArrayList;", "Lcom/bytedance/ee/bear/sheet/tab/jsdata/SheetTabItem;", "Lkotlin/collections/ArrayList;", "setDraggable", "draggable", "setDropdownIconVisible", "setExitLandscapeBtnVisible", "setSheetTabView", "sheetTabView", "Landroid/view/View;", "setViewDelegate", "viewDelegate", "Lcom/bytedance/ee/bear/sheet/tab/contract/ISheetTabView$Delegate;", "showSheetTabView", "Delegate", "sheet_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.sheet.tab.a.c */
public interface ISheetTabView {

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\b\u0010\u0006\u001a\u00020\u0003H&J\b\u0010\u0007\u001a\u00020\u0003H&J \u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\nH&¨\u0006\u000e"}, d2 = {"Lcom/bytedance/ee/bear/sheet/tab/contract/ISheetTabView$Delegate;", "Lcom/bytedance/ee/bear/sheet/tab/contract/ISheetTabAdapter$OnSheetTabItemActionListener;", "onChangeDragStatus", "", "isDragging", "", "onClickAddView", "onClickExitLandscapeBtn", "onMoveTabItem", "fromPos", "", "srcItem", "Lcom/bytedance/ee/bear/sheet/tab/jsdata/SheetTabItem;", "endPos", "sheet_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.sheet.tab.a.c$a */
    public interface Delegate extends ISheetTabAdapter.OnSheetTabItemActionListener {
        /* renamed from: a */
        void mo43314a();

        /* renamed from: a */
        void mo43315a(int i, SheetTabItem sheetTabItem, int i2);

        /* renamed from: a */
        void mo43317a(boolean z);

        /* renamed from: b */
        void mo43318b();
    }

    /* renamed from: a */
    void mo43331a();

    /* renamed from: a */
    void mo43332a(View view);

    /* renamed from: a */
    void mo43333a(Delegate aVar);

    /* renamed from: a */
    void mo43334a(ArrayList<SheetTabItem> arrayList);

    /* renamed from: a */
    void mo43335a(boolean z);

    /* renamed from: b */
    void mo43336b();

    /* renamed from: b */
    void mo43337b(boolean z);

    /* renamed from: c */
    void mo43338c(boolean z);

    /* renamed from: d */
    void mo43339d(boolean z);
}
