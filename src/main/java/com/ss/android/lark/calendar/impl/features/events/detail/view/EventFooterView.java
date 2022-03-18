package com.ss.android.lark.calendar.impl.features.events.detail.view;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import com.huawei.updatesdk.service.otaupdate.UpdateKey;
import com.larksuite.suite.R;
import com.ss.android.lark.calendar.impl.features.events.detail.ICalendarDetailContact;
import com.ss.android.lark.calendar.impl.features.events.detail.idata.IFooterData;
import com.ss.android.lark.calendar.impl.features.events.detail.idata.RSVPStatus;
import com.ss.android.lark.calendar.impl.features.events.detail.widget.FooterRSVPView;
import com.ss.android.lark.calendar.impl.features.events.detail.widget.FooterTextView;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\n\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u0019\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007B!\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u0016\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\u000eJ\u0006\u0010\u0013\u001a\u00020\u0010J\b\u0010\u0014\u001a\u00020\u0010H\u0002J\b\u0010\u0015\u001a\u00020\u0010H\u0002J\b\u0010\u0016\u001a\u00020\u0010H\u0002J\b\u0010\u0017\u001a\u00020\u0010H\u0002J\b\u0010\u0018\u001a\u00020\u0010H\u0002R\u000e\u0010\u000b\u001a\u00020\fX.¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX.¢\u0006\u0002\n\u0000¨\u0006\u001a"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/events/detail/view/EventFooterView;", "Landroid/widget/LinearLayout;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "mFooterData", "Lcom/ss/android/lark/calendar/impl/features/events/detail/idata/IFooterData;", "mViewAction", "Lcom/ss/android/lark/calendar/impl/features/events/detail/ICalendarDetailContact$IDetailViewAction;", "setDependency", "", "footerData", "viewAction", "showFooter", "showJoinFooter", "showRSVPCommentIcon", "showRSVPFooter", "showReplyStatusFooter", "showUnjoinableFooter", "Companion", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class EventFooterView extends LinearLayout {

    /* renamed from: c */
    public static final Companion f79617c = new Companion(null);

    /* renamed from: a */
    public IFooterData f79618a;

    /* renamed from: b */
    public ICalendarDetailContact.IDetailViewAction f79619b;

    /* renamed from: d */
    private HashMap f79620d;

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.events.detail.view.EventFooterView$e */
    public static final class View$OnClickListenerC31425e implements View.OnClickListener {

        /* renamed from: a */
        public static final View$OnClickListenerC31425e f79624a = new View$OnClickListenerC31425e();

        View$OnClickListenerC31425e() {
        }

        public final void onClick(View view) {
        }
    }

    /* renamed from: a */
    public View mo114069a(int i) {
        if (this.f79620d == null) {
            this.f79620d = new HashMap();
        }
        View view = (View) this.f79620d.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f79620d.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/events/detail/view/EventFooterView$Companion;", "", "()V", "TAG", "", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.events.detail.view.EventFooterView$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: b */
    private final void m118225b() {
        FooterRSVPView footerRSVPView = (FooterRSVPView) mo114069a(R.id.rsvpFooterView);
        Intrinsics.checkExpressionValueIsNotNull(footerRSVPView, "rsvpFooterView");
        footerRSVPView.setVisibility(0);
        FooterRSVPView footerRSVPView2 = (FooterRSVPView) mo114069a(R.id.rsvpFooterView);
        IFooterData iFooterData = this.f79618a;
        if (iFooterData == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mFooterData");
        }
        footerRSVPView2.mo114161a(iFooterData.mo113677b());
        ((FooterRSVPView) mo114069a(R.id.rsvpFooterView)).setActionListener(new C31424d(this));
        m118226c();
    }

    /* renamed from: c */
    private final void m118226c() {
        IFooterData iFooterData = this.f79618a;
        if (iFooterData == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mFooterData");
        }
        if (iFooterData.mo113678c()) {
            ((FooterRSVPView) mo114069a(R.id.rsvpFooterView)).setEndIconVisibility(0);
            ((FooterRSVPView) mo114069a(R.id.rsvpFooterView)).setEndIconClickListener(new View$OnClickListenerC31423c(this));
            return;
        }
        ((FooterRSVPView) mo114069a(R.id.rsvpFooterView)).setEndIconVisibility(8);
    }

    /* renamed from: e */
    private final void m118228e() {
        FooterTextView footerTextView = (FooterTextView) mo114069a(R.id.textFooterView);
        Intrinsics.checkExpressionValueIsNotNull(footerTextView, "textFooterView");
        footerTextView.setVisibility(0);
        ((FooterTextView) mo114069a(R.id.textFooterView)).mo114173a();
        ((FooterTextView) mo114069a(R.id.textFooterView)).setOnClickListener(new View$OnClickListenerC31422b(this));
    }

    /* renamed from: f */
    private final void m118229f() {
        FooterTextView footerTextView = (FooterTextView) mo114069a(R.id.textFooterView);
        Intrinsics.checkExpressionValueIsNotNull(footerTextView, "textFooterView");
        footerTextView.setVisibility(0);
        ((FooterTextView) mo114069a(R.id.textFooterView)).mo114174b();
        ((FooterTextView) mo114069a(R.id.textFooterView)).setOnClickListener(View$OnClickListenerC31425e.f79624a);
    }

    /* renamed from: d */
    private final void m118227d() {
        IFooterData iFooterData = this.f79618a;
        if (iFooterData == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mFooterData");
        }
        String d = iFooterData.mo113679d();
        if (TextUtils.isEmpty(d)) {
            FooterTextView footerTextView = (FooterTextView) mo114069a(R.id.textFooterView);
            Intrinsics.checkExpressionValueIsNotNull(footerTextView, "textFooterView");
            footerTextView.setVisibility(8);
            return;
        }
        FooterTextView footerTextView2 = (FooterTextView) mo114069a(R.id.textFooterView);
        Intrinsics.checkExpressionValueIsNotNull(footerTextView2, "textFooterView");
        footerTextView2.setVisibility(0);
        ((FooterTextView) mo114069a(R.id.textFooterView)).setReplyText(d);
    }

    /* renamed from: a */
    public final void mo114070a() {
        FooterRSVPView footerRSVPView = (FooterRSVPView) mo114069a(R.id.rsvpFooterView);
        Intrinsics.checkExpressionValueIsNotNull(footerRSVPView, "rsvpFooterView");
        footerRSVPView.setVisibility(8);
        FooterTextView footerTextView = (FooterTextView) mo114069a(R.id.textFooterView);
        Intrinsics.checkExpressionValueIsNotNull(footerTextView, "textFooterView");
        footerTextView.setVisibility(8);
        setVisibility(0);
        IFooterData iFooterData = this.f79618a;
        if (iFooterData == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mFooterData");
        }
        int i = C31452d.f79696a[iFooterData.mo113676a().ordinal()];
        if (i == 1) {
            m118225b();
        } else if (i == 2) {
            m118228e();
        } else if (i == 3) {
            m118229f();
        } else if (i == 4) {
            m118227d();
        } else if (i == 5) {
            setVisibility(8);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/lark/calendar/impl/features/events/detail/view/EventFooterView$showRSVPFooter$1", "Lcom/ss/android/lark/calendar/impl/features/events/detail/widget/FooterRSVPView$OnActionClickListener;", "onActionClick", "", UpdateKey.STATUS, "Lcom/ss/android/lark/calendar/impl/features/events/detail/idata/RSVPStatus;", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.events.detail.view.EventFooterView$d */
    public static final class C31424d implements FooterRSVPView.OnActionClickListener {

        /* renamed from: a */
        final /* synthetic */ EventFooterView f79623a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C31424d(EventFooterView eventFooterView) {
            this.f79623a = eventFooterView;
        }

        @Override // com.ss.android.lark.calendar.impl.features.events.detail.widget.FooterRSVPView.OnActionClickListener
        /* renamed from: a */
        public void mo114074a(RSVPStatus rSVPStatus) {
            Intrinsics.checkParameterIsNotNull(rSVPStatus, UpdateKey.STATUS);
            EventFooterView.m118223a(this.f79623a).mo113546b(rSVPStatus);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.events.detail.view.EventFooterView$b */
    public static final class View$OnClickListenerC31422b implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ EventFooterView f79621a;

        View$OnClickListenerC31422b(EventFooterView eventFooterView) {
            this.f79621a = eventFooterView;
        }

        public final void onClick(View view) {
            EventFooterView.m118223a(this.f79621a).mo113553g();
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public EventFooterView(Context context) {
        this(context, null);
        Intrinsics.checkParameterIsNotNull(context, "context");
    }

    /* renamed from: a */
    public static final /* synthetic */ ICalendarDetailContact.IDetailViewAction m118223a(EventFooterView eventFooterView) {
        ICalendarDetailContact.IDetailViewAction cVar = eventFooterView.f79619b;
        if (cVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mViewAction");
        }
        return cVar;
    }

    /* renamed from: b */
    public static final /* synthetic */ IFooterData m118224b(EventFooterView eventFooterView) {
        IFooterData iFooterData = eventFooterView.f79618a;
        if (iFooterData == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mFooterData");
        }
        return iFooterData;
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.events.detail.view.EventFooterView$c */
    public static final class View$OnClickListenerC31423c implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ EventFooterView f79622a;

        View$OnClickListenerC31423c(EventFooterView eventFooterView) {
            this.f79622a = eventFooterView;
        }

        public final void onClick(View view) {
            EventFooterView.m118223a(this.f79622a).mo113540a(EventFooterView.m118224b(this.f79622a).mo113677b());
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public EventFooterView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Intrinsics.checkParameterIsNotNull(context, "context");
    }

    /* renamed from: a */
    public final void mo114071a(IFooterData iFooterData, ICalendarDetailContact.IDetailViewAction cVar) {
        Intrinsics.checkParameterIsNotNull(iFooterData, "footerData");
        Intrinsics.checkParameterIsNotNull(cVar, "viewAction");
        this.f79618a = iFooterData;
        this.f79619b = cVar;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public EventFooterView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i, 0);
        Intrinsics.checkParameterIsNotNull(context, "context");
    }
}
