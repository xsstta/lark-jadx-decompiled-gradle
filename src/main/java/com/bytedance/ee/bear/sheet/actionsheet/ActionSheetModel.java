package com.bytedance.ee.bear.sheet.actionsheet;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0002\b\u0016\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0005J\u001f\u0010\u0013\u001a\u00020\u00112\u0012\u0010\u0014\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00050\u0015\"\u00020\u0005¢\u0006\u0002\u0010\u0016R \u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001c\u0010\n\u001a\u0004\u0018\u00010\u000bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u0006\u0017"}, d2 = {"Lcom/bytedance/ee/bear/sheet/actionsheet/ActionSheetModel;", "", "()V", "items", "", "Lcom/bytedance/ee/bear/sheet/actionsheet/ActionSheetItem;", "getItems", "()Ljava/util/List;", "setItems", "(Ljava/util/List;)V", "title", "", "getTitle", "()Ljava/lang/String;", "setTitle", "(Ljava/lang/String;)V", "addItem", "", "item", "addItems", "sheetsActionSheetItems", "", "([Lcom/bytedance/ee/bear/sheet/actionsheet/ActionSheetItem;)V", "sheet_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.sheet.a.e */
public class ActionSheetModel {

    /* renamed from: a */
    private String f29684a;

    /* renamed from: b */
    private List<ActionSheetItem> f29685b = new ArrayList();

    /* renamed from: a */
    public final String mo42050a() {
        return this.f29684a;
    }

    /* renamed from: b */
    public final List<ActionSheetItem> mo42053b() {
        return this.f29685b;
    }

    /* renamed from: a */
    public final void mo42052a(String str) {
        this.f29684a = str;
    }

    /* renamed from: a */
    public final void mo42051a(ActionSheetItem cVar) {
        Intrinsics.checkParameterIsNotNull(cVar, "item");
        this.f29685b.add(cVar);
    }
}
