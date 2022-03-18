package com.ss.android.lark.calendar.impl.features.events.edit.fragment.meetingroom.model;

import com.ss.android.lark.calendar.impl.features.events.edit.fragment.meetingroom.type.ITypeFactory;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0012\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001H\u0016J\u0012\u0010\u0012\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001H\u0016J\u0010\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u0014\u001a\u00020\u0015H\u0016R\u001a\u0010\u0002\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u0004\u001a\u00020\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u0016"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/meetingroom/model/TypeTitleModel;", "Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/meetingroom/model/ItemModel;", "resId", "", "title", "", "(ILjava/lang/String;)V", "getResId", "()I", "setResId", "(I)V", "getTitle", "()Ljava/lang/String;", "setTitle", "(Ljava/lang/String;)V", "isContentSame", "", "diffable", "isItemSame", ShareHitPoint.f121869d, "typeFactory", "Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/meetingroom/type/ITypeFactory;", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.features.events.edit.fragment.meetingroom.b.m */
public final class TypeTitleModel implements ItemModel {

    /* renamed from: a */
    private int f80768a;

    /* renamed from: b */
    private String f80769b;

    /* renamed from: b */
    public boolean isContentSame(ItemModel dVar) {
        return false;
    }

    /* renamed from: a */
    public final int mo115815a() {
        return this.f80768a;
    }

    /* renamed from: b */
    public final String mo115817b() {
        return this.f80769b;
    }

    /* renamed from: a */
    public boolean isItemSame(ItemModel dVar) {
        return Intrinsics.areEqual(this, dVar);
    }

    @Override // com.ss.android.lark.calendar.impl.features.events.edit.fragment.meetingroom.model.ItemModel
    /* renamed from: a */
    public int mo115745a(ITypeFactory aVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "typeFactory");
        return aVar.mo115888a(this);
    }

    public TypeTitleModel(int i, String str) {
        Intrinsics.checkParameterIsNotNull(str, "title");
        this.f80768a = i;
        this.f80769b = str;
    }
}
