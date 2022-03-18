package com.ss.android.lark.calendar.impl.features.messagecard.helper.listener;

import android.content.Context;
import com.larksuite.component.universe_design.button.UDButton;
import com.larksuite.component.universe_design.color.UDColorUtils;
import com.larksuite.suite.R;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u000f2\u00020\u0001:\u0002\u000f\u0010B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\u0006\u0010\n\u001a\u00020\u000bJ\u0014\u0010\f\u001a\u00060\rR\u00020\u00002\u0006\u0010\u000e\u001a\u00020\u0005H\u0002R\u000e\u0010\u0006\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/messagecard/helper/listener/ReplyInvitationActionStyle;", "", "mActionView", "Lcom/larksuite/component/universe_design/button/UDButton;", "mResId", "", "btnTag", "mIsSelected", "", "(Lcom/larksuite/component/universe_design/button/UDButton;IIZ)V", "bindView", "", "getBtnColor", "Lcom/ss/android/lark/calendar/impl/features/messagecard/helper/listener/ReplyInvitationActionStyle$MessageCardBtnColorSet;", "tag", "Companion", "MessageCardBtnColorSet", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.features.messagecard.a.a.e */
public final class ReplyInvitationActionStyle {

    /* renamed from: a */
    public static final Companion f82281a = new Companion(null);

    /* renamed from: b */
    private final UDButton f82282b;

    /* renamed from: c */
    private final int f82283c;

    /* renamed from: d */
    private final int f82284d;

    /* renamed from: e */
    private final boolean f82285e;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/messagecard/helper/listener/ReplyInvitationActionStyle$Companion;", "", "()V", "ACCEPT_BTN", "", "DECLINE_BTN", "TENTATIVE_BTN", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.messagecard.a.a.e$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\b\b\u0004\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0002\u0010\u0006R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b¨\u0006\u000b"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/messagecard/helper/listener/ReplyInvitationActionStyle$MessageCardBtnColorSet;", "", "textColor", "", "bgColor", "borderColor", "(Lcom/ss/android/lark/calendar/impl/features/messagecard/helper/listener/ReplyInvitationActionStyle;III)V", "getBgColor", "()I", "getBorderColor", "getTextColor", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.messagecard.a.a.e$b */
    public final class MessageCardBtnColorSet {

        /* renamed from: b */
        private final int f82287b;

        /* renamed from: c */
        private final int f82288c;

        /* renamed from: d */
        private final int f82289d;

        /* renamed from: a */
        public final int mo117521a() {
            return this.f82287b;
        }

        /* renamed from: b */
        public final int mo117522b() {
            return this.f82288c;
        }

        /* renamed from: c */
        public final int mo117523c() {
            return this.f82289d;
        }

        public MessageCardBtnColorSet(int i, int i2, int i3) {
            this.f82287b = i;
            this.f82288c = i2;
            this.f82289d = i3;
        }
    }

    /* renamed from: a */
    public final void mo117520a() {
        Context context = this.f82282b.getContext();
        this.f82282b.setText(context.getString(this.f82283c));
        MessageCardBtnColorSet bVar = new MessageCardBtnColorSet(R.color.text_title, R.color.udtoken_component_outlined_bg, R.color.line_border_component);
        if (this.f82285e) {
            bVar = m122652a(this.f82284d);
        }
        UDButton uDButton = this.f82282b;
        Intrinsics.checkExpressionValueIsNotNull(context, "context");
        uDButton.setTextColor(UDColorUtils.getColor(context, bVar.mo117521a()));
        this.f82282b.setBackgroundColor(UDColorUtils.getColor(context, bVar.mo117522b()));
        this.f82282b.setStrokeColor(UDColorUtils.getColor(context, bVar.mo117523c()));
    }

    /* renamed from: a */
    private final MessageCardBtnColorSet m122652a(int i) {
        if (i == 0) {
            return new MessageCardBtnColorSet(R.color.ud_G700, R.color.ud_G50, R.color.ud_G700);
        }
        if (i == 1) {
            return new MessageCardBtnColorSet(R.color.ud_R600, R.color.ud_R50, R.color.ud_R600);
        }
        if (i != 2) {
            return new MessageCardBtnColorSet(R.color.text_title, R.color.udtoken_component_outlined_bg, R.color.line_border_component);
        }
        return new MessageCardBtnColorSet(R.color.text_title, R.color.ud_N200, R.color.line_border_component);
    }

    public ReplyInvitationActionStyle(UDButton uDButton, int i, int i2, boolean z) {
        Intrinsics.checkParameterIsNotNull(uDButton, "mActionView");
        this.f82282b = uDButton;
        this.f82283c = i;
        this.f82284d = i2;
        this.f82285e = z;
    }
}
