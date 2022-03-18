package com.ss.android.lark.calendar.impl.features.messagecard.widget;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.huawei.updatesdk.service.otaupdate.UpdateKey;
import com.larksuite.component.ui.display.manager.C25649b;
import com.larksuite.component.universe_design.button.ButtonDrawableParams;
import com.larksuite.component.universe_design.button.C25717e;
import com.larksuite.component.universe_design.button.UDButton;
import com.larksuite.component.universe_design.color.UDColorUtils;
import com.larksuite.component.universe_design.icon.UDIconUtils;
import com.larksuite.component.universe_design.util.UDDimenUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.calendar.impl.features.messagecard.helper.listener.ReplyInvitationActionStyle;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarEventAttendee;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0002)*B%\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\b\u0010\u0014\u001a\u00020\u0015H\u0002J\u000e\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u0011J\u0006\u0010\u0018\u001a\u00020\u000eJ\u0016\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001a2\u0006\u0010\u001c\u001a\u00020\u000eH\u0002J\b\u0010\u001d\u001a\u00020\u0015H\u0002J\u000e\u0010\u001e\u001a\u00020\u00152\u0006\u0010\u001c\u001a\u00020\u000eJ\u0010\u0010\u001f\u001a\u00020\u00152\b\u0010 \u001a\u0004\u0018\u00010\fJ\u000e\u0010!\u001a\u00020\u00152\u0006\u0010\"\u001a\u00020#J\u000e\u0010$\u001a\u00020\u00152\u0006\u0010%\u001a\u00020&J\u000e\u0010'\u001a\u00020\u00152\u0006\u0010(\u001a\u00020\u0007R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\nX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0012\u001a\u0004\u0018\u00010\nX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0013\u001a\u0004\u0018\u00010\nX\u000e¢\u0006\u0002\n\u0000¨\u0006+"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/messagecard/widget/MessageCardReplyContainer;", "Landroid/widget/LinearLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "mAcceptBtn", "Lcom/larksuite/component/universe_design/button/UDButton;", "mActionClickListener", "Lcom/ss/android/lark/calendar/impl/features/messagecard/widget/MessageCardReplyContainer$OnActionClickListener;", "mCurShowStatus", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/CalendarEventAttendee$Status;", "mDeclineBtn", "mLayoutMode", "Lcom/ss/android/lark/calendar/impl/features/messagecard/widget/MessageCardReplyContainer$LayoutMode;", "mReplyBtn", "mTentativeBtn", "bindView", "", "createView", "layoutMode", "getCurReplyStatus", "getReplyInvitationStyle", "", "Lcom/ss/android/lark/calendar/impl/features/messagecard/helper/listener/ReplyInvitationActionStyle;", "mReplyStatus", "initView", "refreshActionStyle", "setActionListener", "actionListener", "setIsShowReplySpan", "isShow", "", "setReplySpanClickListener", "listener", "Landroid/view/View$OnClickListener;", "setReplyTextSize", "size", "LayoutMode", "OnActionClickListener", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class MessageCardReplyContainer extends LinearLayout {

    /* renamed from: a */
    public OnActionClickListener f82395a;

    /* renamed from: b */
    private CalendarEventAttendee.Status f82396b;

    /* renamed from: c */
    private UDButton f82397c;

    /* renamed from: d */
    private UDButton f82398d;

    /* renamed from: e */
    private UDButton f82399e;

    /* renamed from: f */
    private UDButton f82400f;

    /* renamed from: g */
    private LayoutMode f82401g;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/messagecard/widget/MessageCardReplyContainer$LayoutMode;", "", "(Ljava/lang/String;I)V", "HORIZONTAL", "VERTICAL", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    public enum LayoutMode {
        HORIZONTAL,
        VERTICAL
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/messagecard/widget/MessageCardReplyContainer$OnActionClickListener;", "", "onActionClick", "", UpdateKey.STATUS, "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/CalendarEventAttendee$Status;", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.messagecard.widget.MessageCardReplyContainer$a */
    public interface OnActionClickListener {
        /* renamed from: a */
        void mo117515a(CalendarEventAttendee.Status status);
    }

    public MessageCardReplyContainer(Context context) {
        this(context, null, 0, 6, null);
    }

    public MessageCardReplyContainer(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public final CalendarEventAttendee.Status getCurReplyStatus() {
        return this.f82396b;
    }

    /* renamed from: a */
    private final void m122795a() {
        UDButton uDButton;
        this.f82397c = (UDButton) findViewById(R.id.event_accept);
        this.f82398d = (UDButton) findViewById(R.id.event_decline);
        this.f82399e = (UDButton) findViewById(R.id.event_tentative);
        if (this.f82401g == LayoutMode.VERTICAL) {
            uDButton = (UDButton) findViewById(R.id.event_reply);
        } else {
            uDButton = (UDButton) findViewById(R.id.reply_icon);
        }
        this.f82400f = uDButton;
    }

    /* renamed from: b */
    private final void m122797b() {
        View$OnClickListenerC32213c cVar = new View$OnClickListenerC32213c(this);
        UDButton uDButton = this.f82397c;
        if (uDButton != null) {
            uDButton.setOnClickListener(cVar);
        }
        UDButton uDButton2 = this.f82398d;
        if (uDButton2 != null) {
            uDButton2.setOnClickListener(cVar);
        }
        UDButton uDButton3 = this.f82399e;
        if (uDButton3 != null) {
            uDButton3.setOnClickListener(cVar);
        }
        Context context = getContext();
        Intrinsics.checkExpressionValueIsNotNull(context, "context");
        int color = UDColorUtils.getColor(context, R.color.icon_n2);
        Context context2 = getContext();
        Intrinsics.checkExpressionValueIsNotNull(context2, "context");
        Drawable iconDrawable = UDIconUtils.getIconDrawable(context2, (int) R.drawable.ud_icon_chat_news_outlined, color);
        Context context3 = getContext();
        Intrinsics.checkExpressionValueIsNotNull(context3, "context");
        int a = (int) UDDimenUtils.m93308a(context3, 16);
        iconDrawable.setBounds(new Rect(0, 0, a, a));
        UDButton uDButton4 = this.f82400f;
        if (uDButton4 != null) {
            C25717e.m92488a(uDButton4, iconDrawable, C32212b.INSTANCE);
        }
    }

    public final void setActionListener(OnActionClickListener aVar) {
        this.f82395a = aVar;
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Lcom/larksuite/component/universe_design/button/ButtonDrawableParams;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.messagecard.widget.MessageCardReplyContainer$b */
    public static final class C32212b extends Lambda implements Function1<ButtonDrawableParams, Unit> {
        public static final C32212b INSTANCE = new C32212b();

        C32212b() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(ButtonDrawableParams aVar) {
            invoke(aVar);
            return Unit.INSTANCE;
        }

        public final void invoke(ButtonDrawableParams aVar) {
            Intrinsics.checkParameterIsNotNull(aVar, "$receiver");
            aVar.mo90319a(2);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/lark/calendar/impl/features/messagecard/widget/MessageCardReplyContainer$initView$clickListener$1", "Landroid/view/View$OnClickListener;", "onClick", "", "v", "Landroid/view/View;", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.messagecard.widget.MessageCardReplyContainer$c */
    public static final class View$OnClickListenerC32213c implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ MessageCardReplyContainer f82402a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        View$OnClickListenerC32213c(MessageCardReplyContainer messageCardReplyContainer) {
            this.f82402a = messageCardReplyContainer;
        }

        public void onClick(View view) {
            OnActionClickListener aVar;
            Intrinsics.checkParameterIsNotNull(view, "v");
            CalendarEventAttendee.Status status = null;
            int id = view.getId();
            if (id == R.id.event_accept) {
                status = CalendarEventAttendee.Status.ACCEPT;
            } else if (id == R.id.event_decline) {
                status = CalendarEventAttendee.Status.DECLINE;
            } else if (id == R.id.event_tentative) {
                status = CalendarEventAttendee.Status.TENTATIVE;
            }
            if (status != null && (aVar = this.f82402a.f82395a) != null) {
                aVar.mo117515a(status);
            }
        }
    }

    public final void setIsShowReplySpan(boolean z) {
        int i;
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        UDButton uDButton = this.f82400f;
        if (uDButton != null) {
            uDButton.setVisibility(i);
        }
    }

    public final void setReplySpanClickListener(View.OnClickListener onClickListener) {
        Intrinsics.checkParameterIsNotNull(onClickListener, "listener");
        UDButton uDButton = this.f82400f;
        if (uDButton != null) {
            uDButton.setOnClickListener(onClickListener);
        }
    }

    /* renamed from: a */
    public final void mo117764a(CalendarEventAttendee.Status status) {
        Intrinsics.checkParameterIsNotNull(status, "mReplyStatus");
        for (ReplyInvitationActionStyle eVar : m122796b(status)) {
            eVar.mo117520a();
        }
        this.f82396b = status;
    }

    public final void setReplyTextSize(int i) {
        UDButton uDButton = this.f82397c;
        if (uDButton != null) {
            C25649b.m91856a((TextView) uDButton, i);
        }
        UDButton uDButton2 = this.f82398d;
        if (uDButton2 != null) {
            C25649b.m91856a((TextView) uDButton2, i);
        }
        UDButton uDButton3 = this.f82399e;
        if (uDButton3 != null) {
            C25649b.m91856a((TextView) uDButton3, i);
        }
    }

    /* renamed from: a */
    public final void mo117763a(LayoutMode layoutMode) {
        int i;
        Intrinsics.checkParameterIsNotNull(layoutMode, "layoutMode");
        if (layoutMode != this.f82401g) {
            this.f82401g = layoutMode;
            removeAllViews();
            if (this.f82401g == LayoutMode.VERTICAL) {
                i = R.layout.message_card_vertical_reply_layout;
            } else {
                i = R.layout.messagee_card_reply_layout;
            }
            LayoutInflater.from(getContext()).inflate(i, (ViewGroup) this, true);
            m122795a();
            m122797b();
        }
    }

    /* renamed from: b */
    private final List<ReplyInvitationActionStyle> m122796b(CalendarEventAttendee.Status status) {
        UDButton uDButton = this.f82397c;
        UDButton uDButton2 = this.f82398d;
        UDButton uDButton3 = this.f82399e;
        if (uDButton == null || uDButton2 == null || uDButton3 == null) {
            return CollectionsKt.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        int i = C32215b.f82403a[status.ordinal()];
        if (i == 1) {
            arrayList.add(new ReplyInvitationActionStyle(uDButton, R.string.Calendar_Detail_Accept, 0, false));
            arrayList.add(new ReplyInvitationActionStyle(uDButton2, R.string.Calendar_Detail_Refuse, 1, false));
            arrayList.add(new ReplyInvitationActionStyle(uDButton3, R.string.Calendar_Detail_Maybe, 2, false));
        } else if (i == 2) {
            arrayList.add(new ReplyInvitationActionStyle(uDButton, R.string.Calendar_Detail_Accepted, 0, true));
            arrayList.add(new ReplyInvitationActionStyle(uDButton2, R.string.Calendar_Detail_Refuse, 1, false));
            arrayList.add(new ReplyInvitationActionStyle(uDButton3, R.string.Calendar_Detail_Maybe, 2, false));
        } else if (i == 3) {
            arrayList.add(new ReplyInvitationActionStyle(uDButton, R.string.Calendar_Detail_Accept, 0, false));
            arrayList.add(new ReplyInvitationActionStyle(uDButton2, R.string.Calendar_Detail_Refuse, 1, false));
            arrayList.add(new ReplyInvitationActionStyle(uDButton3, R.string.Calendar_Detail_Maybe, 2, true));
        } else if (i == 4) {
            arrayList.add(new ReplyInvitationActionStyle(uDButton, R.string.Calendar_Detail_Accept, 0, false));
            arrayList.add(new ReplyInvitationActionStyle(uDButton2, R.string.Calendar_Detail_Refused, 1, true));
            arrayList.add(new ReplyInvitationActionStyle(uDButton3, R.string.Calendar_Detail_Maybe, 2, false));
        }
        return arrayList;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MessageCardReplyContainer(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkParameterIsNotNull(context, "context");
        this.f82396b = CalendarEventAttendee.Status.NEEDS_ACTION;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ MessageCardReplyContainer(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
