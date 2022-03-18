package com.ss.android.lark.moments.impl.common;

import androidx.lifecycle.AbstractC1142af;
import kotlin.Metadata;
import kotlinx.coroutines.ExecutorCoroutineDispatcher;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\b&\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0007\u001a\u00020\bH\u0014R\u0012\u0010\u0003\u001a\u00020\u0004X¤\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/ss/android/lark/moments/impl/common/BaseViewModel;", "Landroidx/lifecycle/ViewModel;", "()V", "dispatcher", "Lkotlinx/coroutines/ExecutorCoroutineDispatcher;", "getDispatcher", "()Lkotlinx/coroutines/ExecutorCoroutineDispatcher;", "onCleared", "", "im_moments-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.moments.impl.common.a */
public abstract class BaseViewModel extends AbstractC1142af {
    /* access modifiers changed from: protected */
    public abstract ExecutorCoroutineDispatcher getDispatcher();

    /* access modifiers changed from: protected */
    @Override // androidx.lifecycle.AbstractC1142af
    public void onCleared() {
        super.onCleared();
        getDispatcher().close();
    }
}
