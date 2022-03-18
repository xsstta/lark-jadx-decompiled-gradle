package com.ss.android.lark.calendar.impl.features.calendars.share.adapter;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/calendars/share/adapter/MemberTextTipViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "view", "Landroid/view/View;", "(Landroid/view/View;)V", "tipTextView", "Landroid/widget/TextView;", "getTipTextView", "()Landroid/widget/TextView;", "getView", "()Landroid/view/View;", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.features.calendars.share.a.c */
public final class MemberTextTipViewHolder extends RecyclerView.ViewHolder {

    /* renamed from: a */
    private final TextView f76225a;

    /* renamed from: b */
    private final View f76226b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MemberTextTipViewHolder(View view) {
        super(view);
        Intrinsics.checkParameterIsNotNull(view, "view");
        this.f76226b = view;
        TextView textView = new TextView(view.getContext());
        this.f76225a = textView;
        textView.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
    }
}
