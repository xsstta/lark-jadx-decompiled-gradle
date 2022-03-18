package com.ss.android.lark.feed.app.filter.widget;

import com.ss.android.lark.feed.app.filter.data.FeedTabItemData;
import kotlin.Metadata;
import kotlin.jvm.C69113a;
import kotlin.jvm.internal.PropertyReference0;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KDeclarationContainer;

/* access modifiers changed from: package-private */
@Metadata(bv = {1, 0, 3}, mo238835k = 3, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.feed.app.filter.widget.c */
public final /* synthetic */ class C37568c extends PropertyReference0 {
    C37568c(FeedTabItemData.IFilterItem eVar) {
        super(eVar);
    }

    @Override // kotlin.jvm.internal.CallableReference, kotlin.reflect.KCallable
    public String getName() {
        return "javaClass";
    }

    @Override // kotlin.jvm.internal.CallableReference
    public KDeclarationContainer getOwner() {
        return Reflection.getOrCreateKotlinPackage(C69113a.class, "im_feed_release");
    }

    @Override // kotlin.jvm.internal.CallableReference
    public String getSignature() {
        return "getJavaClass(Ljava/lang/Object;)Ljava/lang/Class;";
    }

    @Override // kotlin.reflect.KProperty0
    public Object get() {
        return C69113a.m265953a((FeedTabItemData.IFilterItem) this.receiver);
    }
}
