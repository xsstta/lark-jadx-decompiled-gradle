package com.bytedance.ee.bear.list.create;

import com.bytedance.ee.bear.list.dto.C8275a;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/bytedance/ee/bear/list/create/CreateControl;", "", "()V", "TAG", "", "canCreateLocal", "", "docType", "", "list_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.list.create.b */
public final class CreateControl {

    /* renamed from: a */
    public static final CreateControl f22197a = new CreateControl();

    private CreateControl() {
    }

    @JvmStatic
    /* renamed from: a */
    public static final boolean m33799a(int i) {
        C8275a aVar = C8275a.f22371d;
        Intrinsics.checkExpressionValueIsNotNull(aVar, "DocumentType.DOC");
        if (i != aVar.mo32555b()) {
            C8275a aVar2 = C8275a.f22372e;
            Intrinsics.checkExpressionValueIsNotNull(aVar2, "DocumentType.SHEET");
            if (i != aVar2.mo32555b()) {
                C8275a aVar3 = C8275a.f22374g;
                Intrinsics.checkExpressionValueIsNotNull(aVar3, "DocumentType.MINDNOTE");
                if (i == aVar3.mo32555b()) {
                    return true;
                }
                return false;
            }
        }
        return true;
    }
}
