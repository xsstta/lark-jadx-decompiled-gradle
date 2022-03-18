package com.ss.android.lark.calendar.impl.features.calendarview.timezone.adapter;

import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.h6ah4i.android.widget.advrecyclerview.utils.AbstractC23303b;
import com.larksuite.suite.R;
import com.ss.android.lark.calendar.impl.features.calendarview.timezone.adapter.TimezoneAdapter;
import com.ss.android.lark.calendar.impl.utils.C32634ae;
import com.ss.android.lark.calendar.impl.utils.TimeZoneUtils;
import com.ss.android.lark.calendar.p1430a.C30022a;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0018\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fJ\u0006\u0010\r\u001a\u00020\u0003J\b\u0010\u000e\u001a\u00020\u0003H\u0016J\u001a\u0010\u000f\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0002J\u0010\u0010\u0010\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/calendarview/timezone/adapter/TimeZoneVH;", "Lcom/h6ah4i/android/widget/advrecyclerview/utils/AbstractSwipeableItemViewHolder;", "mView", "Landroid/view/View;", "mIsModifyForDesktop", "", "(Landroid/view/View;Z)V", "bindItem", "", "itemData", "Lcom/ss/android/lark/calendar/impl/features/calendarview/timezone/adapter/TimeZoneItemData;", "clickListener", "Lcom/ss/android/lark/calendar/impl/features/calendarview/timezone/adapter/TimezoneAdapter$ItemClickListener;", "getBehindView", "getSwipeableContainerView", "initListener", "initView", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.features.calendarview.timezone.a.b */
public final class TimeZoneVH extends AbstractC23303b {

    /* renamed from: a */
    private final View f78375a;

    /* renamed from: b */
    private final boolean f78376b;

    @Override // com.h6ah4i.android.widget.advrecyclerview.swipeable.AbstractC23298h
    /* renamed from: k */
    public View mo80851k() {
        RelativeLayout relativeLayout = (RelativeLayout) this.f78375a.findViewById(R.id.frontViewContainer);
        Intrinsics.checkExpressionValueIsNotNull(relativeLayout, "mView.frontViewContainer");
        return relativeLayout;
    }

    /* renamed from: l */
    public final View mo112482l() {
        RelativeLayout relativeLayout = (RelativeLayout) this.f78375a.findViewById(R.id.behindViewContainer);
        Intrinsics.checkExpressionValueIsNotNull(relativeLayout, "mView.behindViewContainer");
        return relativeLayout;
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendarview.timezone.a.b$a */
    public static final class View$OnClickListenerC31072a implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ TimezoneAdapter.ItemClickListener f78377a;

        /* renamed from: b */
        final /* synthetic */ TimeZoneItemData f78378b;

        View$OnClickListenerC31072a(TimezoneAdapter.ItemClickListener bVar, TimeZoneItemData aVar) {
            this.f78377a = bVar;
            this.f78378b = aVar;
        }

        public final void onClick(View view) {
            TimezoneAdapter.ItemClickListener bVar = this.f78377a;
            if (bVar != null) {
                bVar.mo112493a(this.f78378b);
            }
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendarview.timezone.a.b$b */
    public static final class View$OnClickListenerC31073b implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ TimezoneAdapter.ItemClickListener f78379a;

        /* renamed from: b */
        final /* synthetic */ TimeZoneItemData f78380b;

        View$OnClickListenerC31073b(TimezoneAdapter.ItemClickListener bVar, TimeZoneItemData aVar) {
            this.f78379a = bVar;
            this.f78380b = aVar;
        }

        public final void onClick(View view) {
            TimezoneAdapter.ItemClickListener bVar = this.f78379a;
            if (bVar != null) {
                bVar.mo112494b(this.f78380b);
            }
        }
    }

    /* renamed from: a */
    private final void m115918a(TimeZoneItemData aVar) {
        int i;
        boolean z;
        if (this.f78376b) {
            ((TextView) this.f78375a.findViewById(R.id.timezoneNameTV)).setTextSize(1, 14.0f);
            ((TextView) this.f78375a.findViewById(R.id.timezoneOffsetTV)).setTextSize(1, 12.0f);
            ((TextView) this.f78375a.findViewById(R.id.includeCityLabel)).setTextSize(1, 12.0f);
        }
        TextView textView = (TextView) this.f78375a.findViewById(R.id.timezoneNameTV);
        Intrinsics.checkExpressionValueIsNotNull(textView, "mView.timezoneNameTV");
        textView.setText(aVar.mo112479e());
        TextView textView2 = (TextView) this.f78375a.findViewById(R.id.timezoneOffsetTV);
        Intrinsics.checkExpressionValueIsNotNull(textView2, "mView.timezoneOffsetTV");
        textView2.setText(TimeZoneUtils.m125206a(aVar.mo112480f()));
        ImageView imageView = (ImageView) this.f78375a.findViewById(R.id.selectedIcon);
        Intrinsics.checkExpressionValueIsNotNull(imageView, "mView.selectedIcon");
        if (aVar.mo112476b()) {
            i = 0;
        } else {
            i = 8;
        }
        imageView.setVisibility(i);
        ArrayList<String> c = aVar.mo112477c();
        ArrayList<String> arrayList = c;
        if (arrayList == null || arrayList.isEmpty()) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            String b = C32634ae.m125182b(R.string.Calendar_Common_Comma);
            StringBuilder sb = new StringBuilder();
            sb.append(c.get(0));
            int size = c.size();
            for (int i2 = 1; i2 < size; i2++) {
                sb.append(b);
                sb.append(c.get(i2));
            }
            TextView textView3 = (TextView) this.f78375a.findViewById(R.id.includeCityLabel);
            Intrinsics.checkExpressionValueIsNotNull(textView3, "mView.includeCityLabel");
            textView3.setText(C30022a.f74882a.utilsDependency().mo108195a(R.string.Calendar_Common_Includes, "itemName", sb.toString()));
            TextView textView4 = (TextView) this.f78375a.findViewById(R.id.includeCityLabel);
            Intrinsics.checkExpressionValueIsNotNull(textView4, "mView.includeCityLabel");
            textView4.setVisibility(0);
            return;
        }
        TextView textView5 = (TextView) this.f78375a.findViewById(R.id.includeCityLabel);
        Intrinsics.checkExpressionValueIsNotNull(textView5, "mView.includeCityLabel");
        textView5.setVisibility(8);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TimeZoneVH(View view, boolean z) {
        super(view);
        Intrinsics.checkParameterIsNotNull(view, "mView");
        this.f78375a = view;
        this.f78376b = z;
    }

    /* renamed from: a */
    public final void mo112481a(TimeZoneItemData aVar, TimezoneAdapter.ItemClickListener bVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "itemData");
        m115918a(aVar);
        m115919b(aVar, bVar);
    }

    /* renamed from: b */
    private final void m115919b(TimeZoneItemData aVar, TimezoneAdapter.ItemClickListener bVar) {
        ((RelativeLayout) this.f78375a.findViewById(R.id.frontViewContainer)).setOnClickListener(new View$OnClickListenerC31072a(bVar, aVar));
        ((RelativeLayout) this.f78375a.findViewById(R.id.behindViewContainer)).setOnClickListener(new View$OnClickListenerC31073b(bVar, aVar));
    }
}
