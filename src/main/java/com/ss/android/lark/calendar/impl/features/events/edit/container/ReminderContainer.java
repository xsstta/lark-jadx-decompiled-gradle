package com.ss.android.lark.calendar.impl.features.events.edit.container;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.larksuite.suite.R;
import com.ss.android.lark.calendar.impl.features.events.edit.listener.view.IDetailItemListener;
import com.ss.android.lark.calendar.impl.features.events.edit.listener.view.IHideFeatureListener;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\u001b\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\u0006\u0010\u000b\u001a\u00020\fJ\u000e\u0010\r\u001a\u00020\f2\u0006\u0010\u0002\u001a\u00020\u0003J\u000e\u0010\u000e\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\bJ\u000e\u0010\u0010\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\nJ\u0006\u0010\u0012\u001a\u00020\fJ\u0010\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\u0015H\u0016J\u000e\u0010\u0016\u001a\u00020\f2\u0006\u0010\u0017\u001a\u00020\u0018R\u000e\u0010\u0007\u001a\u00020\bX.¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX.¢\u0006\u0002\n\u0000¨\u0006\u0019"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/events/edit/container/ReminderContainer;", "Landroid/widget/LinearLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "mClickedListener", "Lcom/ss/android/lark/calendar/impl/features/events/edit/listener/view/IDetailItemListener;", "mHideFeatureListener", "Lcom/ss/android/lark/calendar/impl/features/events/edit/listener/view/IHideFeatureListener;", "initListener", "", "initView", "setDetailItemListener", "detailItemListener", "setOnHideListener", "hideFeatureListener", "setUnEditable", "setVisibility", "visibility", "", "showReminderText", "reminder", "", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class ReminderContainer extends LinearLayout {

    /* renamed from: a */
    public IDetailItemListener f80145a;

    /* renamed from: b */
    public IHideFeatureListener f80146b;

    /* renamed from: c */
    private HashMap f80147c;

    public ReminderContainer(Context context) {
        this(context, null, 2, null);
    }

    /* renamed from: a */
    public View mo114810a(int i) {
        if (this.f80147c == null) {
            this.f80147c = new HashMap();
        }
        View view = (View) this.f80147c.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f80147c.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    /* renamed from: a */
    public final void mo114811a() {
        setOnClickListener(new View$OnClickListenerC31603a(this));
        ((LinearLayout) mo114810a(R.id.ll_delete_container)).setOnClickListener(new View$OnClickListenerC31604b(this));
    }

    /* renamed from: b */
    public final void mo114814b() {
        LinearLayout linearLayout = (LinearLayout) mo114810a(R.id.ll_delete_container);
        Intrinsics.checkExpressionValueIsNotNull(linearLayout, "ll_delete_container");
        linearLayout.setVisibility(8);
        setClickable(false);
        TextView textView = (TextView) mo114810a(R.id.tv_event_alarm_time);
        Intrinsics.checkExpressionValueIsNotNull(textView, "tv_event_alarm_time");
        textView.setClickable(false);
        ImageView imageView = (ImageView) mo114810a(R.id.iv_reminder_icon);
        Intrinsics.checkExpressionValueIsNotNull(imageView, "iv_reminder_icon");
        imageView.setClickable(false);
        Context context = getContext();
        Intrinsics.checkExpressionValueIsNotNull(context, "context");
        ((TextView) mo114810a(R.id.tv_event_alarm_time)).setTextColor(context.getResources().getColor(R.color.text_placeholder));
    }

    public final void setDetailItemListener(IDetailItemListener bVar) {
        Intrinsics.checkParameterIsNotNull(bVar, "detailItemListener");
        this.f80145a = bVar;
    }

    public final void setOnHideListener(IHideFeatureListener cVar) {
        Intrinsics.checkParameterIsNotNull(cVar, "hideFeatureListener");
        this.f80146b = cVar;
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.events.edit.container.ReminderContainer$a */
    public static final class View$OnClickListenerC31603a implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ ReminderContainer f80148a;

        View$OnClickListenerC31603a(ReminderContainer reminderContainer) {
            this.f80148a = reminderContainer;
        }

        public final void onClick(View view) {
            ReminderContainer.m119158a(this.f80148a).mo114360a(13);
        }
    }

    /* renamed from: a */
    public static final /* synthetic */ IDetailItemListener m119158a(ReminderContainer reminderContainer) {
        IDetailItemListener bVar = reminderContainer.f80145a;
        if (bVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mClickedListener");
        }
        return bVar;
    }

    /* renamed from: b */
    public static final /* synthetic */ IHideFeatureListener m119159b(ReminderContainer reminderContainer) {
        IHideFeatureListener cVar = reminderContainer.f80146b;
        if (cVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mHideFeatureListener");
        }
        return cVar;
    }

    public void setVisibility(int i) {
        super.setVisibility(i);
        IHideFeatureListener cVar = this.f80146b;
        if (cVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mHideFeatureListener");
        }
        cVar.mo114309a();
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.events.edit.container.ReminderContainer$b */
    public static final class View$OnClickListenerC31604b implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ ReminderContainer f80149a;

        View$OnClickListenerC31604b(ReminderContainer reminderContainer) {
            this.f80149a = reminderContainer;
        }

        public final void onClick(View view) {
            this.f80149a.setVisibility(8);
            ReminderContainer.m119159b(this.f80149a).mo114310a(13);
        }
    }

    /* renamed from: a */
    public final void mo114812a(Context context) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        LayoutInflater.from(context).inflate(R.layout.view_event_reminder_container, this);
    }

    /* renamed from: a */
    public final void mo114813a(String str) {
        Intrinsics.checkParameterIsNotNull(str, "reminder");
        TextView textView = (TextView) mo114810a(R.id.tv_event_alarm_time);
        Intrinsics.checkExpressionValueIsNotNull(textView, "tv_event_alarm_time");
        textView.setText(str);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ReminderContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkParameterIsNotNull(context, "context");
        mo114812a(context);
        mo114811a();
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ReminderContainer(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }
}
