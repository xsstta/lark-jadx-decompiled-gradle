package com.ss.android.lark.calendar.impl.features.calendarview.timezone;

import android.content.Context;
import android.widget.FrameLayout;
import com.larksuite.suite.R;
import com.ss.android.lark.calendar.impl.features.calendarview.timezone.TimeZoneEnterView;
import com.ss.android.lark.calendar.impl.features.calendarview.timezone.widget.DragShrinkDialog;
import com.ss.android.lark.calendar.impl.features.search.calendar.TimeZoneSelectorModel;
import com.ss.android.lark.calendar.impl.features.search.calendar.TimeZoneSelectorPresenter;
import com.ss.android.lark.calendar.impl.features.search.calendar.TimeZoneSelectorView;
import com.ss.android.lark.calendar.impl.framework.hitpoint.event.GeneralHitPoint;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\b\u0016\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u0010\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0011J\b\u0010\u001a\u001a\u00020\u0018H\u0016J\u0010\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u0006\u001a\u00020\u0007H\u0002J\u000e\u0010\u001c\u001a\u00020\u00182\u0006\u0010\u001d\u001a\u00020\u001eR\u0014\u0010\u000b\u001a\u00020\fX\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR*\u0010\u000f\u001a\u0012\u0012\u0004\u0012\u00020\u00110\u0010j\b\u0012\u0004\u0012\u00020\u0011`\u0012X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016¨\u0006\u001f"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/calendarview/timezone/TimeZoneBaseDialog;", "Lcom/ss/android/lark/calendar/impl/features/calendarview/timezone/widget/DragShrinkDialog;", "context", "Landroid/content/Context;", "themeResId", "", ShareHitPoint.f121868c, "Lcom/ss/android/lark/calendar/impl/features/calendarview/timezone/TimeZoneEnterView$Source;", "timezoneId", "", "(Landroid/content/Context;ILcom/ss/android/lark/calendar/impl/features/calendarview/timezone/TimeZoneEnterView$Source;Ljava/lang/String;)V", "mPresenter", "Lcom/ss/android/lark/calendar/impl/features/search/calendar/TimeZoneSelectorPresenter;", "getMPresenter", "()Lcom/ss/android/lark/calendar/impl/features/search/calendar/TimeZoneSelectorPresenter;", "mSelectTimeZoneChangeListener", "Ljava/util/ArrayList;", "Lcom/ss/android/lark/calendar/impl/features/calendarview/timezone/ISelectTimeZoneChangeListener;", "Lkotlin/collections/ArrayList;", "getMSelectTimeZoneChangeListener", "()Ljava/util/ArrayList;", "setMSelectTimeZoneChangeListener", "(Ljava/util/ArrayList;)V", "addSelectTimeZoneChangeListener", "", "selectTimeZonChangeListener", "dismiss", "hitPoint", "setShowSelectedToast", "isShow", "", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.features.calendarview.timezone.c */
public class TimeZoneBaseDialog extends DragShrinkDialog {

    /* renamed from: a */
    private final TimeZoneSelectorPresenter f78398a;

    /* renamed from: b */
    private ArrayList<ISelectTimeZoneChangeListener> f78399b = new ArrayList<>();

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final TimeZoneSelectorPresenter mo112221a() {
        return this.f78398a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final ArrayList<ISelectTimeZoneChangeListener> mo112225b() {
        return this.f78399b;
    }

    @Override // com.larksuite.framework.ui.BaseDialog
    public void dismiss() {
        super.dismiss();
        this.f78399b.clear();
        this.f78398a.destroy();
    }

    /* renamed from: a */
    public final void mo112543a(ISelectTimeZoneChangeListener aVar) {
        if (aVar != null) {
            this.f78399b.add(aVar);
        }
    }

    /* renamed from: a */
    public final void mo112544a(boolean z) {
        this.f78398a.mo118114a(z);
    }

    /* renamed from: a */
    private final void m115983a(TimeZoneEnterView.Source source) {
        int i = C31079d.f78400a[source.ordinal()];
        if (i == 1) {
            GeneralHitPoint.m124280x("threeday");
        } else if (i == 2) {
            GeneralHitPoint.m124280x("day");
        } else if (i == 3) {
            GeneralHitPoint.m124280x("profile");
        } else if (i == 4) {
            GeneralHitPoint.m124280x("findtime");
        } else if (i == 5) {
            GeneralHitPoint.m124280x("chat");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TimeZoneBaseDialog(Context context, int i, TimeZoneEnterView.Source source, String str) {
        super(context, i);
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(source, ShareHitPoint.f121868c);
        Intrinsics.checkParameterIsNotNull(str, "timezoneId");
        mo112526b(R.layout.dialog_timezone_selector);
        FrameLayout frameLayout = (FrameLayout) findViewById(R.id.rootView);
        Intrinsics.checkExpressionValueIsNotNull(frameLayout, "rootView");
        TimeZoneSelectorView jVar = new TimeZoneSelectorView(frameLayout);
        TimeZoneSelectorModel hVar = new TimeZoneSelectorModel(str);
        hVar.mo118109a(source);
        TimeZoneSelectorPresenter iVar = new TimeZoneSelectorPresenter(jVar, hVar);
        this.f78398a = iVar;
        iVar.create();
        m115983a(source);
    }
}
