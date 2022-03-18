package com.ss.android.lark.setting.page.content.general.feedfilter;

import com.ss.android.lark.setting.page.content.general.feedfilter.viewmodel.FeedFilterSettingState;
import kotlin.Metadata;
import kotlin.jvm.internal.PropertyReference1;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KDeclarationContainer;
import kotlin.reflect.KProperty1;

@Metadata(bv = {1, 0, 3}, mo238835k = 3, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.setting.page.content.general.feedfilter.d */
final /* synthetic */ class C54503d extends PropertyReference1 {
    public static final KProperty1 INSTANCE = new C54503d();

    C54503d() {
    }

    @Override // kotlin.jvm.internal.CallableReference, kotlin.reflect.KCallable
    public String getName() {
        return "feedFilterInfo";
    }

    @Override // kotlin.jvm.internal.CallableReference
    public KDeclarationContainer getOwner() {
        return Reflection.getOrCreateKotlinClass(FeedFilterSettingState.class);
    }

    @Override // kotlin.jvm.internal.CallableReference
    public String getSignature() {
        return "getFeedFilterInfo()Lcom/larksuite/arch/jack/Async;";
    }

    @Override // kotlin.reflect.KProperty1
    public Object get(Object obj) {
        return ((FeedFilterSettingState) obj).mo186272a();
    }
}
