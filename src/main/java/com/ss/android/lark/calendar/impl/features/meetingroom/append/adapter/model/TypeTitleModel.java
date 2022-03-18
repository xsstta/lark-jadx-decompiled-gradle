package com.ss.android.lark.calendar.impl.features.meetingroom.append.adapter.model;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0012\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001H\u0016J\u0012\u0010\u0010\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001H\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\u0003XD¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\b¨\u0006\u0011"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/meetingroom/append/adapter/model/TypeTitleModel;", "Lcom/ss/android/lark/calendar/impl/features/meetingroom/append/adapter/model/BaseModel;", "iconResId", "", "title", "", "(ILjava/lang/String;)V", "getIconResId", "()I", "getTitle", "()Ljava/lang/String;", "viewType", "getViewType", "isContentSame", "", "diffable", "isItemSame", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.features.meetingroom.append.adapter.model.i */
public final class TypeTitleModel implements BaseModel {

    /* renamed from: a */
    private final int f81849a = 3;

    /* renamed from: b */
    private final int f81850b;

    /* renamed from: c */
    private final String f81851c;

    @Override // com.ss.android.lark.calendar.impl.features.meetingroom.append.adapter.model.BaseModel
    /* renamed from: a */
    public int mo116760a() {
        return this.f81849a;
    }

    /* renamed from: b */
    public final int mo116815b() {
        return this.f81850b;
    }

    /* renamed from: c */
    public final String mo116817c() {
        return this.f81851c;
    }

    /* renamed from: a */
    public boolean isItemSame(BaseModel baseModel) {
        return baseModel instanceof TypeTitleModel;
    }

    /* renamed from: b */
    public boolean isContentSame(BaseModel baseModel) {
        if (!(baseModel instanceof TypeTitleModel) || !Intrinsics.areEqual(baseModel, this)) {
            return false;
        }
        return true;
    }

    public TypeTitleModel(int i, String str) {
        Intrinsics.checkParameterIsNotNull(str, "title");
        this.f81850b = i;
        this.f81851c = str;
    }
}
