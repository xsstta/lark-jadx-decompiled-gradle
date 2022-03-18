package com.larksuite.framework.section;

import androidx.lifecycle.LifecycleOwner;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002J\b\u0010\u0003\u001a\u00020\u0004H&J\b\u0010\u0005\u001a\u00020\u0006H&J\b\u0010\u0007\u001a\u00020\bH&J\r\u0010\t\u001a\u00028\u0000H&¢\u0006\u0002\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/larksuite/framework/section/IViewAbility;", "T", "Lcom/larksuite/framework/section/IAbility;", "onStop", "", "provideDispatcher", "Lcom/larksuite/framework/section/IActionDispatcher;", "provideLifeCycleOwner", "Landroidx/lifecycle/LifecycleOwner;", "provideViewModel", "()Ljava/lang/Object;", "todo_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.larksuite.framework.a.f */
public interface IViewAbility<T> extends IAbility {
    /* renamed from: b */
    T mo92073b();

    /* renamed from: c */
    LifecycleOwner mo92074c();

    /* renamed from: d */
    IActionDispatcher mo92075d();
}
