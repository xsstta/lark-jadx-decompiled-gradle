package com.ss.android.lark.setting.page.content.general.feedfilter;

import com.ss.android.lark.setting.page.content.general.feedfilter.viewmodel.FeedFilterSettingState;
import kotlin.Metadata;
import kotlin.jvm.internal.PropertyReference1;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KDeclarationContainer;
import kotlin.reflect.KProperty1;

@Metadata(bv = {1, 0, 3}, mo238835k = 3, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.setting.page.content.general.feedfilter.f */
final /* synthetic */ class C54522f extends PropertyReference1 {
    public static final KProperty1 INSTANCE = new C54522f();

    C54522f() {
    }

    @Override // kotlin.jvm.internal.CallableReference, kotlin.reflect.KCallable
    public String getName() {
        return "updateMuteSetting";
    }

    @Override // kotlin.jvm.internal.CallableReference
    public KDeclarationContainer getOwner() {
        return Reflection.getOrCreateKotlinClass(FeedFilterSettingState.class);
    }

    @Override // kotlin.jvm.internal.CallableReference
    public String getSignature() {
        return "getUpdateMuteSetting()Lcom/larksuite/arch/jack/Async;";
    }

    @Override // kotlin.reflect.KProperty1
    public Object get(Object obj) {
        return ((FeedFilterSettingState) obj).mo186275c();
    }
}
