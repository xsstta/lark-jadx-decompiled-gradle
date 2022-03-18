package com.ss.android.lark.calendar.impl.features.messagecard;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.ss.android.lark.calendar.dependency.idependency.entity.IMessageCardData;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J(\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH&J\u0018\u0010\f\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H&¨\u0006\u0011"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/messagecard/IMessageCellFactory;", "", "onBindView", "", "itemView", "Landroid/view/View;", "position", "", "internalContent", "Lcom/ss/android/lark/calendar/impl/features/messagecard/InternalContent;", "messageData", "Lcom/ss/android/lark/calendar/dependency/idependency/entity/IMessageCardData;", "onCreateView", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.features.messagecard.a */
public interface IMessageCellFactory {
    /* renamed from: a */
    View mo117503a(LayoutInflater layoutInflater, ViewGroup viewGroup);

    /* renamed from: a */
    void mo117504a(View view, int i, InternalContent internalContent, IMessageCardData fVar);
}
