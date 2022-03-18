package com.larksuite.component.ui.layout.plus;

import com.larksuite.component.ui.layout.ILKUILayout;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J&\u0010\u0003\u001a\u0012\u0012\u0004\u0012\u00020\u00050\u0004j\b\u0012\u0004\u0012\u00020\u0005`\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n¨\u0006\u000b"}, d2 = {"Lcom/larksuite/component/ui/layout/plus/InnerPlusFactory;", "", "()V", "createPlusList", "Ljava/util/ArrayList;", "Lcom/larksuite/component/ui/layout/plus/BaseInnerPlus;", "Lkotlin/collections/ArrayList;", "pluses", "", "layout", "Lcom/larksuite/component/ui/layout/ILKUILayout;", "suite-ui_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.larksuite.component.ui.layout.plus.b */
public final class InnerPlusFactory {

    /* renamed from: a */
    public static final InnerPlusFactory f62727a = new InnerPlusFactory();

    private InnerPlusFactory() {
    }

    /* renamed from: a */
    public final ArrayList<BaseInnerPlus> mo89810a(int i, ILKUILayout iLKUILayout) {
        BaseInnerPlus createPlus;
        Intrinsics.checkParameterIsNotNull(iLKUILayout, "layout");
        ArrayList<BaseInnerPlus> arrayList = new ArrayList<>();
        InnerPlusType[] values = InnerPlusType.values();
        for (InnerPlusType innerPlusType : values) {
            int value = innerPlusType.getValue();
            if ((i & value) == value && (createPlus = innerPlusType.createPlus(iLKUILayout)) != null) {
                arrayList.add(createPlus);
            }
        }
        return arrayList;
    }
}
