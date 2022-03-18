package com.ss.android.lark.calendar.impl.features.events.edit.container;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.joooonho.SelectableRoundedImageView;
import com.larksuite.framework.utils.CollectionUtils;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.calendar.impl.features.events.detail.p1507d.C31256c;
import com.ss.android.lark.calendar.impl.features.events.edit.data.EventAttendeeData;
import com.ss.android.lark.calendar.impl.features.events.edit.listener.view.IDetailItemListener;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarEventAttendee;
import com.ss.android.lark.calendar.impl.utils.C32634ae;
import com.ss.android.lark.calendar.impl.utils.p1577a.AbstractView$OnClickListenerC32626b;
import java.util.HashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 \u001b2\u00020\u0001:\u0001\u001bB\u001b\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\r\u001a\u00020\u000eH\u0002J&\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u00112\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00140\u00132\u0006\u0010\u0015\u001a\u00020\fH\u0002J\u0016\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\u0017\u001a\u00020\b2\u0006\u0010\u0018\u001a\u00020\fJ\u000e\u0010\u0019\u001a\u00020\u000e2\u0006\u0010\u001a\u001a\u00020\nR\u000e\u0010\u0007\u001a\u00020\bX.¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u000e¢\u0006\u0002\n\u0000¨\u0006\u001c"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/events/edit/container/AttendeeContainer;", "Landroid/widget/RelativeLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "mAttendeeData", "Lcom/ss/android/lark/calendar/impl/features/events/edit/data/EventAttendeeData;", "mDetailItemListener", "Lcom/ss/android/lark/calendar/impl/features/events/edit/listener/view/IDetailItemListener;", "mDisableAttendeeSelect", "", "initListener", "", "refreshAttendees", "attendeeSum", "", "attendees", "", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/CalendarEventAttendee;", "isExternalEvent", "setData", "eventAttendeeData", "disableAttendeeSelect", "setDetailItemListener", "detailItemListener", "Companion", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class AttendeeContainer extends RelativeLayout {

    /* renamed from: d */
    public static final Companion f80084d = new Companion(null);

    /* renamed from: a */
    public IDetailItemListener f80085a;

    /* renamed from: b */
    public EventAttendeeData f80086b;

    /* renamed from: c */
    public boolean f80087c;

    /* renamed from: e */
    private HashMap f80088e;

    public AttendeeContainer(Context context) {
        this(context, null, 2, null);
    }

    /* renamed from: a */
    public View mo114742a(int i) {
        if (this.f80088e == null) {
            this.f80088e = new HashMap();
        }
        View view = (View) this.f80088e.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f80088e.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/events/edit/container/AttendeeContainer$Companion;", "", "()V", "ICON_WIDTH", "", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.events.edit.container.AttendeeContainer$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: a */
    private final void m119090a() {
        ((ImageView) mo114742a(R.id.iv_invite_attendee)).setOnClickListener(new C31585b(this));
        setOnClickListener(new View$OnClickListenerC31586c(this));
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/lark/calendar/impl/features/events/edit/container/AttendeeContainer$initListener$1", "Lcom/ss/android/lark/calendar/impl/utils/debounce/DebouncingClickListener;", "doClick", "", "v", "Landroid/view/View;", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.events.edit.container.AttendeeContainer$b */
    public static final class C31585b extends AbstractView$OnClickListenerC32626b {

        /* renamed from: a */
        final /* synthetic */ AttendeeContainer f80089a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C31585b(AttendeeContainer attendeeContainer) {
            this.f80089a = attendeeContainer;
        }

        @Override // com.ss.android.lark.calendar.impl.utils.p1577a.AbstractView$OnClickListenerC32626b
        /* renamed from: a */
        public void mo108751a(View view) {
            Intrinsics.checkParameterIsNotNull(view, "v");
            IDetailItemListener bVar = this.f80089a.f80085a;
            if (bVar != null) {
                bVar.mo114359a();
            }
        }
    }

    public final void setDetailItemListener(IDetailItemListener bVar) {
        Intrinsics.checkParameterIsNotNull(bVar, "detailItemListener");
        this.f80085a = bVar;
    }

    /* renamed from: a */
    public static final /* synthetic */ EventAttendeeData m119089a(AttendeeContainer attendeeContainer) {
        EventAttendeeData dVar = attendeeContainer.f80086b;
        if (dVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mAttendeeData");
        }
        return dVar;
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.events.edit.container.AttendeeContainer$c */
    public static final class View$OnClickListenerC31586c implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ AttendeeContainer f80090a;

        View$OnClickListenerC31586c(AttendeeContainer attendeeContainer) {
            this.f80090a = attendeeContainer;
        }

        public final void onClick(View view) {
            IDetailItemListener bVar;
            if (CollectionUtils.isNotEmpty(AttendeeContainer.m119089a(this.f80090a).mo115087b())) {
                IDetailItemListener bVar2 = this.f80090a.f80085a;
                if (bVar2 != null) {
                    bVar2.mo114360a(4);
                }
            } else if (!this.f80090a.f80087c && (bVar = this.f80090a.f80085a) != null) {
                bVar.mo114359a();
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AttendeeContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkParameterIsNotNull(context, "context");
        LayoutInflater.from(context).inflate(R.layout.view_event_attendee_container, this);
    }

    /* renamed from: a */
    public final void mo114743a(EventAttendeeData dVar, boolean z) {
        Intrinsics.checkParameterIsNotNull(dVar, "eventAttendeeData");
        this.f80086b = dVar;
        this.f80087c = z;
        m119090a();
        m119091a(dVar.mo115086a(), dVar.mo115087b(), dVar.mo115088c());
    }

    /* renamed from: a */
    private final void m119091a(int i, List<? extends CalendarEventAttendee> list, boolean z) {
        ((LinearLayout) mo114742a(R.id.ll_attendee_heads)).removeAllViews();
        if (!this.f80087c) {
            ImageView imageView = (ImageView) mo114742a(R.id.iv_invite_attendee);
            Intrinsics.checkExpressionValueIsNotNull(imageView, "iv_invite_attendee");
            imageView.setVisibility(0);
        } else {
            ImageView imageView2 = (ImageView) mo114742a(R.id.iv_invite_attendee);
            Intrinsics.checkExpressionValueIsNotNull(imageView2, "iv_invite_attendee");
            imageView2.setVisibility(8);
        }
        if (CollectionUtils.isNotEmpty(list)) {
            LinearLayout linearLayout = (LinearLayout) mo114742a(R.id.ll_attendee_heads_container);
            Intrinsics.checkExpressionValueIsNotNull(linearLayout, "ll_attendee_heads_container");
            linearLayout.setVisibility(0);
            int i2 = 0;
            while (i2 < list.size() && i2 <= 3) {
                SelectableRoundedImageView selectableRoundedImageView = new SelectableRoundedImageView(getContext());
                selectableRoundedImageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
                selectableRoundedImageView.mo85893a(5.0f, 5.0f, 5.0f, 5.0f);
                selectableRoundedImageView.setOval(true);
                CalendarEventAttendee calendarEventAttendee = (CalendarEventAttendee) list.get(i2);
                if (z || calendarEventAttendee.isThirdParty()) {
                    selectableRoundedImageView.setImageBitmap(C31256c.m117133a(32.0f, calendarEventAttendee.getLocalizedDisplayName()));
                } else {
                    C31256c.m117134a(getContext(), selectableRoundedImageView, 32, 32, (CalendarEventAttendee) list.get(i2), true);
                }
                float f = (float) 32;
                RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(UIUtils.dp2px(getContext(), f), UIUtils.dp2px(getContext(), f));
                layoutParams.setMargins(0, 0, UIUtils.dp2px(getContext(), 12.0f), 0);
                ((LinearLayout) mo114742a(R.id.ll_attendee_heads)).addView(selectableRoundedImageView, layoutParams);
                i2++;
            }
            TextView textView = (TextView) mo114742a(R.id.tv_invite_attendee_count);
            Intrinsics.checkExpressionValueIsNotNull(textView, "tv_invite_attendee_count");
            textView.setVisibility(0);
            TextView textView2 = (TextView) mo114742a(R.id.tv_invite_attendee_count);
            Intrinsics.checkExpressionValueIsNotNull(textView2, "tv_invite_attendee_count");
            textView2.setText(C32634ae.m125180a(R.plurals.Calendar_Plural_ShortDetailStringOfGuests, i));
            ImageView imageView3 = (ImageView) mo114742a(R.id.iv_invite_attendee_arrow);
            Intrinsics.checkExpressionValueIsNotNull(imageView3, "iv_invite_attendee_arrow");
            imageView3.setVisibility(0);
            TextView textView3 = (TextView) mo114742a(R.id.tv_invite_attendee);
            Intrinsics.checkExpressionValueIsNotNull(textView3, "tv_invite_attendee");
            textView3.setVisibility(8);
            return;
        }
        LinearLayout linearLayout2 = (LinearLayout) mo114742a(R.id.ll_attendee_heads_container);
        Intrinsics.checkExpressionValueIsNotNull(linearLayout2, "ll_attendee_heads_container");
        linearLayout2.setVisibility(8);
        TextView textView4 = (TextView) mo114742a(R.id.tv_invite_attendee);
        Intrinsics.checkExpressionValueIsNotNull(textView4, "tv_invite_attendee");
        textView4.setVisibility(0);
        TextView textView5 = (TextView) mo114742a(R.id.tv_invite_attendee_count);
        Intrinsics.checkExpressionValueIsNotNull(textView5, "tv_invite_attendee_count");
        textView5.setVisibility(8);
        ImageView imageView4 = (ImageView) mo114742a(R.id.iv_invite_attendee_arrow);
        Intrinsics.checkExpressionValueIsNotNull(imageView4, "iv_invite_attendee_arrow");
        imageView4.setVisibility(8);
        if (this.f80087c) {
            Context context = getContext();
            Intrinsics.checkExpressionValueIsNotNull(context, "context");
            ((TextView) mo114742a(R.id.tv_invite_attendee)).setTextColor(context.getResources().getColor(R.color.text_placeholder));
            return;
        }
        Context context2 = getContext();
        Intrinsics.checkExpressionValueIsNotNull(context2, "context");
        ((TextView) mo114742a(R.id.tv_invite_attendee)).setTextColor(context2.getResources().getColor(R.color.text_title));
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ AttendeeContainer(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }
}
