package com.ss.android.lark.moments.impl.detail;

import androidx.lifecycle.AbstractC1142af;
import androidx.lifecycle.C1144ai;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J'\u0010\u0007\u001a\u0002H\b\"\n\b\u0000\u0010\b*\u0004\u0018\u00010\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u0002H\b0\u000bH\u0016¢\u0006\u0002\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\r"}, d2 = {"Lcom/ss/android/lark/moments/impl/detail/MomentsDetailViewModelFactory;", "Landroidx/lifecycle/ViewModelProvider$Factory;", "postId", "", "(Ljava/lang/String;)V", "getPostId", "()Ljava/lang/String;", "create", "T", "Landroidx/lifecycle/ViewModel;", "modelClass", "Ljava/lang/Class;", "(Ljava/lang/Class;)Landroidx/lifecycle/ViewModel;", "im_moments-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.moments.impl.detail.g */
public final class MomentsDetailViewModelFactory implements C1144ai.AbstractC1146b {

    /* renamed from: a */
    private final String f119670a;

    public MomentsDetailViewModelFactory(String str) {
        Intrinsics.checkParameterIsNotNull(str, "postId");
        this.f119670a = str;
    }

    @Override // androidx.lifecycle.C1144ai.AbstractC1146b
    public <T extends AbstractC1142af> T create(Class<T> cls) {
        Intrinsics.checkParameterIsNotNull(cls, "modelClass");
        return cls.getConstructor(String.class).newInstance(this.f119670a);
    }
}
