package com.ss.android.lark.todo.impl.features.common.helper;

import android.widget.TextView;
import com.larksuite.suite.R;
import com.ss.android.lark.todo.dependency.TodoDependencyHolder;
import com.ss.android.lark.todo.dependency.idependency.ILoginDependency;
import com.ss.android.lark.todo.impl.utils.ResUtil;
import com.ss.android.lark.todo.impl.utils.TagUtil;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eJ\u0018\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010R\u001b\u0010\u0003\u001a\u00020\u00048BX\u0002¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0011"}, d2 = {"Lcom/ss/android/lark/todo/impl/features/common/helper/ExternalTagHelper;", "", "()V", "loginDependency", "Lcom/ss/android/lark/todo/dependency/idependency/ILoginDependency;", "getLoginDependency", "()Lcom/ss/android/lark/todo/dependency/idependency/ILoginDependency;", "loginDependency$delegate", "Lkotlin/Lazy;", "judgeToShowExternalTag", "", "textView", "Landroid/widget/TextView;", "isCrossTenant", "", "tenantId", "", "todo_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.todo.impl.features.common.helper.c */
public final class ExternalTagHelper {

    /* renamed from: a */
    public static final ExternalTagHelper f139400a = new ExternalTagHelper();

    /* renamed from: b */
    private static final Lazy f139401b = LazyKt.lazy(C56333a.INSTANCE);

    /* renamed from: a */
    private final ILoginDependency m219793a() {
        return (ILoginDependency) f139401b.getValue();
    }

    private ExternalTagHelper() {
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/todo/dependency/idependency/ILoginDependency;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.common.helper.c$a */
    static final class C56333a extends Lambda implements Function0<ILoginDependency> {
        public static final C56333a INSTANCE = new C56333a();

        C56333a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final ILoginDependency invoke() {
            return TodoDependencyHolder.f139242a.mo191730a().loginDependency();
        }
    }

    /* renamed from: a */
    public final void mo192000a(TextView textView, String str) {
        Intrinsics.checkParameterIsNotNull(textView, "textView");
        mo192001a(textView, !Intrinsics.areEqual(str, m219793a().mo145412b()));
    }

    /* renamed from: a */
    public final void mo192001a(TextView textView, boolean z) {
        Intrinsics.checkParameterIsNotNull(textView, "textView");
        if (z) {
            TagUtil.f139262a.mo191784a(textView, ResUtil.f139261a.mo191781c(R.string.Lark_Legacy_External));
        } else {
            TagUtil.f139262a.mo191783a(textView);
        }
    }
}
