package com.ss.android.lark.calendar.impl.features.recyclerview;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.google.firebase.messaging.Constants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0002\b&\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u0003B\r\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0015\u0010\f\u001a\u00020\r2\u0006\u0010\b\u001a\u00028\u0000H\u0017¢\u0006\u0002\u0010\u000eR$\u0010\b\u001a\u0004\u0018\u00018\u00002\b\u0010\u0007\u001a\u0004\u0018\u00018\u0000@BX\u000e¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\t\u0010\n¨\u0006\u000f"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/recyclerview/SimpleHolder;", "T", "", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "v", "Landroid/view/View;", "(Landroid/view/View;)V", "<set-?>", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "getData", "()Ljava/lang/Object;", "Ljava/lang/Object;", "onBind", "", "(Ljava/lang/Object;)V", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.features.b.f */
public abstract class SimpleHolder<T> extends RecyclerView.ViewHolder {

    /* renamed from: a */
    private T f75588a;

    /* renamed from: a */
    public final T mo109155a() {
        return this.f75588a;
    }

    /* renamed from: a */
    public void mo109156a(T t) {
        Intrinsics.checkParameterIsNotNull(t, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
        this.f75588a = t;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SimpleHolder(View view) {
        super(view);
        Intrinsics.checkParameterIsNotNull(view, "v");
    }
}
