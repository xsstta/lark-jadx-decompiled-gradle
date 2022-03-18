package com.ss.android.lark.todo.impl.features.detail.at.view.adapter;

import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\r\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006R\u001a\u0010\u0007\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\tR\u001a\u0010\r\u001a\u00020\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lcom/ss/android/lark/todo/impl/features/detail/at/view/adapter/AtLabelBean;", "Lcom/ss/android/lark/todo/impl/features/detail/at/view/adapter/AtBean;", "label", "", ShareHitPoint.f121868c, "", "(Ljava/lang/String;I)V", "id", "getId", "()Ljava/lang/String;", "setId", "(Ljava/lang/String;)V", "getLabel", ShareHitPoint.f121869d, "getType", "()I", "setType", "(I)V", "todo_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.todo.impl.features.detail.at.view.adapter.c */
public final class AtLabelBean extends AtBean {

    /* renamed from: a */
    private String f139685a;

    /* renamed from: b */
    private int f139686b;

    /* renamed from: c */
    private final String f139687c;

    @Override // com.ss.android.lark.todo.impl.features.detail.at.view.adapter.AtBean
    /* renamed from: a */
    public String mo192272a() {
        return this.f139685a;
    }

    @Override // com.ss.android.lark.todo.impl.features.detail.at.view.adapter.AtBean
    /* renamed from: b */
    public int mo192273b() {
        return this.f139686b;
    }

    /* renamed from: d */
    public final String mo192292d() {
        return this.f139687c;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AtLabelBean(String str, int i) {
        super(i);
        Intrinsics.checkParameterIsNotNull(str, "label");
        this.f139687c = str;
        this.f139685a = str;
    }
}
