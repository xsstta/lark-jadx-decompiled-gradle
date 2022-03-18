package com.ss.android.lark.calendar.dependency.idependency;

import android.app.Activity;
import com.ss.android.lark.calendar.api.entity.PoiInfo;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001:\u0001\bJ\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&¨\u0006\t"}, d2 = {"Lcom/ss/android/lark/calendar/dependency/idependency/IPoiPickDependency;", "", "pickPoi", "", "activity", "Landroid/app/Activity;", "callback", "Lcom/ss/android/lark/calendar/dependency/idependency/IPoiPickDependency$IPoiPickCallBack;", "IPoiPickCallBack", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.a.a.y */
public interface IPoiPickDependency {

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H&¨\u0006\u0006"}, d2 = {"Lcom/ss/android/lark/calendar/dependency/idependency/IPoiPickDependency$IPoiPickCallBack;", "", "onPickPoi", "", "poi", "Lcom/ss/android/lark/calendar/api/entity/PoiInfo;", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.a.a.y$a */
    public interface IPoiPickCallBack {
        /* renamed from: a */
        void mo108292a(PoiInfo cVar);
    }

    /* renamed from: a */
    void mo108291a(Activity activity, IPoiPickCallBack aVar);
}
