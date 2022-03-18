package com.ss.android.lark.calendar.impl.features.calendarview.timezone;

import android.content.Context;
import com.ss.android.lark.calendar.impl.features.calendarview.timezone.TimeZoneEnterView;
import com.ss.android.lark.calendar.impl.features.search.calendar.TimeZoneSelectorPresenter;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\b\u0010\u000b\u001a\u00020\fH\u0016¨\u0006\r"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/calendarview/timezone/TimeZoneSelectorDialog;", "Lcom/ss/android/lark/calendar/impl/features/calendarview/timezone/TimeZoneBaseDialog;", "context", "Landroid/content/Context;", "themeResId", "", ShareHitPoint.f121868c, "Lcom/ss/android/lark/calendar/impl/features/calendarview/timezone/TimeZoneEnterView$Source;", "timezoneId", "", "(Landroid/content/Context;ILcom/ss/android/lark/calendar/impl/features/calendarview/timezone/TimeZoneEnterView$Source;Ljava/lang/String;)V", "middleStatus", "", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.features.calendarview.timezone.f */
public final class TimeZoneSelectorDialog extends TimeZoneBaseDialog {
    @Override // com.ss.android.lark.calendar.impl.features.calendarview.timezone.widget.DragShrinkDialog
    public void am_() {
        mo112221a().mo118115c();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TimeZoneSelectorDialog(Context context, int i, TimeZoneEnterView.Source source, String str) {
        super(context, i, source, str);
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(source, ShareHitPoint.f121868c);
        Intrinsics.checkParameterIsNotNull(str, "timezoneId");
        mo112221a().mo118112a(new TimeZoneSelectorPresenter.Dependency(this) {
            /* class com.ss.android.lark.calendar.impl.features.calendarview.timezone.TimeZoneSelectorDialog.C310811 */

            /* renamed from: a */
            final /* synthetic */ TimeZoneSelectorDialog f78402a;

            @Override // com.ss.android.lark.calendar.impl.features.search.calendar.TimeZoneSelectorPresenter.Dependency
            /* renamed from: a */
            public void mo112545a() {
                this.f78402a.mo112529g();
            }

            @Override // com.ss.android.lark.calendar.impl.features.search.calendar.TimeZoneSelectorPresenter.Dependency
            /* renamed from: b */
            public void mo112547b() {
                this.f78402a.mo112530h();
            }

            @Override // com.ss.android.lark.calendar.impl.features.search.calendar.TimeZoneSelectorPresenter.Dependency
            /* renamed from: c */
            public void mo112548c() {
                this.f78402a.mo112528f();
            }

            /* JADX WARN: Incorrect args count in method signature: ()V */
            {
                this.f78402a = r1;
            }

            @Override // com.ss.android.lark.calendar.impl.features.search.calendar.TimeZoneSelectorPresenter.Dependency
            /* renamed from: a */
            public void mo112546a(String str) {
                Intrinsics.checkParameterIsNotNull(str, "timeZoneId");
                Iterator<T> it = this.f78402a.mo112225b().iterator();
                while (it.hasNext()) {
                    it.next().mo108585a(str);
                }
            }
        });
    }
}
