package com.bytedance.ee.bear.sheet.tab.model;

import com.bytedance.ee.bear.sheet.actionsheet.ActionSheetItem;
import com.bytedance.ee.bear.sheet.actionsheet.ActionSheetModel;
import com.bytedance.ee.bear.sheet.actionsheet.LeftIcon;
import com.bytedance.ee.bear.sheet.tab.jsdata.SheetModalPanelData;
import com.google.firebase.messaging.Constants;
import com.larksuite.suite.R;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u00032\u00020\u0001:\u0002\u0003\u0004B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0005"}, d2 = {"Lcom/bytedance/ee/bear/sheet/tab/model/SheetActionSheetModel;", "Lcom/bytedance/ee/bear/sheet/actionsheet/ActionSheetModel;", "()V", "Companion", "SheetActionSheetItem", "sheet_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.sheet.tab.model.a */
public final class SheetActionSheetModel extends ActionSheetModel {

    /* renamed from: a */
    public static final Companion f30415a = new Companion(null);

    @JvmStatic
    /* renamed from: a */
    public static final SheetActionSheetModel m47014a(SheetModalPanelData sheetModalPanelData) {
        return f30415a.mo43402a(sheetModalPanelData);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007¨\u0006\u0007"}, d2 = {"Lcom/bytedance/ee/bear/sheet/tab/model/SheetActionSheetModel$Companion;", "", "()V", "buildActionSheetModel", "Lcom/bytedance/ee/bear/sheet/tab/model/SheetActionSheetModel;", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Lcom/bytedance/ee/bear/sheet/tab/jsdata/SheetModalPanelData;", "sheet_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.sheet.tab.model.a$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        /* renamed from: a */
        public final SheetActionSheetModel mo43402a(SheetModalPanelData sheetModalPanelData) {
            Integer num;
            boolean z;
            Intrinsics.checkParameterIsNotNull(sheetModalPanelData, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
            SheetActionSheetModel aVar = new SheetActionSheetModel();
            aVar.mo42052a(sheetModalPanelData.getTitle());
            SheetModalPanelData.ModalItem[] items = sheetModalPanelData.getItems();
            if (items != null) {
                ArrayList arrayList = new ArrayList();
                for (SheetModalPanelData.ModalItem modalItem : items) {
                    Intrinsics.checkExpressionValueIsNotNull(modalItem, "it");
                    if (SheetModalItemConfigEnum.getModalItem(modalItem.getId()) != null) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z) {
                        arrayList.add(modalItem);
                    }
                }
                ArrayList<SheetModalPanelData.ModalItem> arrayList2 = arrayList;
                ArrayList<Pair> arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList2, 10));
                for (SheetModalPanelData.ModalItem modalItem2 : arrayList2) {
                    Intrinsics.checkExpressionValueIsNotNull(modalItem2, "it");
                    arrayList3.add(new Pair(modalItem2, SheetModalItemConfigEnum.getModalItem(modalItem2.getId())));
                }
                for (Pair pair : arrayList3) {
                    SheetModalPanelData.ModalItem modalItem3 = (SheetModalPanelData.ModalItem) pair.component1();
                    SheetModalItemConfigEnum sheetModalItemConfigEnum = (SheetModalItemConfigEnum) pair.component2();
                    Intrinsics.checkExpressionValueIsNotNull(modalItem3, "item");
                    String title = modalItem3.getTitle();
                    Intrinsics.checkExpressionValueIsNotNull(title, "item.title");
                    boolean isEnable = modalItem3.isEnable();
                    if (modalItem3.isShowLeftIcon()) {
                        num = Integer.valueOf(sheetModalItemConfigEnum.leftIconRes);
                    } else {
                        num = null;
                    }
                    aVar.mo42051a(new SheetActionSheetItem(modalItem3, title, isEnable, num));
                }
            }
            return aVar;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0002\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/bytedance/ee/bear/sheet/tab/model/SheetActionSheetModel$SheetActionSheetItem;", "Lcom/bytedance/ee/bear/sheet/actionsheet/ActionSheetItem;", "itemId", "", "displayText", "", "enabled", "", "leftIconRes", "", "(Ljava/lang/Object;Ljava/lang/String;ZLjava/lang/Integer;)V", "sheet_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.sheet.tab.model.a$b */
    public static final class SheetActionSheetItem extends ActionSheetItem {
        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public SheetActionSheetItem(Object obj, String str, boolean z, Integer num) {
            super(obj, str, z);
            int i;
            int i2;
            Intrinsics.checkParameterIsNotNull(obj, "itemId");
            Intrinsics.checkParameterIsNotNull(str, "displayText");
            if (num != null) {
                int intValue = num.intValue();
                if (z) {
                    i2 = R.color.icon_n1;
                } else {
                    i2 = R.color.icon_disable;
                }
                mo42035a(new LeftIcon(intValue, Integer.valueOf(i2)));
            }
            if (z) {
                i = R.color.text_title;
            } else {
                i = R.color.text_disable;
            }
            mo42036a(Integer.valueOf(i));
        }
    }
}
