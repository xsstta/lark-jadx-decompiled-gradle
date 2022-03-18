package com.ss.android.lark.calendar.impl.features.arrange.base;

import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.ICallback;
import com.ss.android.lark.calendar.impl.features.calendarview.entity.DayEventChipViewData;
import java.util.ArrayList;
import java.util.HashMap;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&JB\u0010\u0006\u001a\u00020\u000328\u0010\u0007\u001a4\u0012\u0004\u0012\u00020\t\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\bj\u001e\u0012\u0004\u0012\u00020\t\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u000b0\nj\b\u0012\u0004\u0012\u00020\u000b`\r`\fH&¨\u0006\u000e"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/arrange/base/OnLoadEventInstances;", "Lcom/larksuite/framework/callback/ICallback;", "onLoadFailed", "", "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onLoadSucceed", "eventInstances", "Ljava/util/HashMap;", "", "Ljava/util/ArrayList;", "Lcom/ss/android/lark/calendar/impl/features/calendarview/entity/DayEventChipViewData;", "Lkotlin/collections/HashMap;", "Lkotlin/collections/ArrayList;", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.features.arrange.a.c */
public interface OnLoadEventInstances extends ICallback {
    /* renamed from: a */
    void mo108498a(ErrorResult errorResult);

    /* renamed from: a */
    void mo108499a(HashMap<String, ArrayList<DayEventChipViewData>> hashMap);
}
