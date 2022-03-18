package com.ss.android.lark.calendar.impl.features.events.edit.widget;

import android.content.Context;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.larksuite.component.ui.button.LKUICheckBox;
import com.larksuite.framework.ui.BaseDialog;
import com.larksuite.suite.R;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.NotificationBoxType;
import com.ss.android.lark.calendar.impl.utils.C32634ae;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\u0018\u00002\u00020\u0001:\u0002\u0018\u0019B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bJ\u000e\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011J\b\u0010\u0012\u001a\u00020\u000fH\u0002J\b\u0010\u0013\u001a\u00020\u000fH\u0002J\u0010\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\u0004\u001a\u00020\u0005H\u0002J\u0006\u0010\u0015\u001a\u00020\u0000J\u0006\u0010\u0016\u001a\u00020\u000fJ\u0006\u0010\u0017\u001a\u00020\u000fR\u000e\u0010\t\u001a\u00020\nX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\fX\u000e¢\u0006\u0002\n\u0000¨\u0006\u001a"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/events/edit/widget/NotifyAttendeeDialog;", "Lcom/larksuite/framework/ui/BaseDialog;", "context", "Landroid/content/Context;", ShareHitPoint.f121869d, "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/NotificationBoxType;", "delegate", "Lcom/ss/android/lark/calendar/impl/features/events/edit/widget/NotifyAttendeeDialog$Delegate;", "(Landroid/content/Context;Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/NotificationBoxType;Lcom/ss/android/lark/calendar/impl/features/events/edit/widget/NotifyAttendeeDialog$Delegate;)V", "checkBoxType", "Lcom/ss/android/lark/calendar/impl/features/events/edit/widget/NotifyAttendeeDialog$CheckBoxType;", "mBoxIsChecked", "", "mIsForbidAppendSubTitle", "appendSubTitleText", "", "subTitleText", "", "initCheckBox", "initListener", "initType", "setCancelChangesText", "setShareStyle", "showSendCardCheckBox", "CheckBoxType", "Delegate", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class NotifyAttendeeDialog extends BaseDialog {

    /* renamed from: a */
    public final Delegate f81377a;

    /* renamed from: b */
    public CheckBoxType f81378b = CheckBoxType.CHECK_BOX_INVISIBLE;

    /* renamed from: c */
    public boolean f81379c = true;

    /* renamed from: d */
    private boolean f81380d;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/events/edit/widget/NotifyAttendeeDialog$CheckBoxType;", "", "(Ljava/lang/String;I)V", "SHARE_TO_CHAT", "TRANSFER_TO_CHAT", "CHECK_BOX_INVISIBLE", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    public enum CheckBoxType {
        SHARE_TO_CHAT,
        TRANSFER_TO_CHAT,
        CHECK_BOX_INVISIBLE
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u0018\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H&J\u0018\u0010\b\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H&¨\u0006\t"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/events/edit/widget/NotifyAttendeeDialog$Delegate;", "", "cancelChanges", "", "notSendNotification", "isShareToChat", "", "isTransferToChat", "sendNotification", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.events.edit.widget.NotifyAttendeeDialog$a */
    public interface Delegate {
        /* renamed from: a */
        void mo114706a();

        /* renamed from: a */
        void mo114707a(boolean z, boolean z2);

        /* renamed from: b */
        void mo114708b(boolean z, boolean z2);
    }

    /* renamed from: a */
    public final NotifyAttendeeDialog mo116421a() {
        ((TextView) findViewById(R.id.tvNotifyCancel)).setText(R.string.Calendar_Detail_CancelEdit);
        return this;
    }

    /* renamed from: d */
    private final void m121313d() {
        ((TextView) findViewById(R.id.tvNotifySend)).setOnClickListener(new View$OnClickListenerC31885d(this));
        ((TextView) findViewById(R.id.tvNotifyNotSend)).setOnClickListener(new View$OnClickListenerC31886e(this));
        ((TextView) findViewById(R.id.tvNotifyCancel)).setOnClickListener(new View$OnClickListenerC31887f(this));
    }

    /* renamed from: b */
    public final void mo116423b() {
        this.f81378b = CheckBoxType.SHARE_TO_CHAT;
        LinearLayout linearLayout = (LinearLayout) findViewById(R.id.checkboxContainer);
        Intrinsics.checkExpressionValueIsNotNull(linearLayout, "checkboxContainer");
        linearLayout.setVisibility(0);
        TextView textView = (TextView) findViewById(R.id.checkboxDesc);
        Intrinsics.checkExpressionValueIsNotNull(textView, "checkboxDesc");
        textView.setText(C32634ae.m125182b(R.string.Calendar_Edit_CreateAndShareEvent));
    }

    /* renamed from: e */
    private final void m121314e() {
        LKUICheckBox lKUICheckBox = (LKUICheckBox) findViewById(R.id.checkbox);
        Intrinsics.checkExpressionValueIsNotNull(lKUICheckBox, "checkbox");
        lKUICheckBox.setChecked(this.f81379c);
        ((LinearLayout) findViewById(R.id.checkboxContainer)).setOnClickListener(new View$OnClickListenerC31883b(this));
        ((LKUICheckBox) findViewById(R.id.checkbox)).setOnCheckedChangeListener(new C31884c(this));
        LinearLayout linearLayout = (LinearLayout) findViewById(R.id.checkboxContainer);
        Intrinsics.checkExpressionValueIsNotNull(linearLayout, "checkboxContainer");
        linearLayout.setVisibility(8);
    }

    /* renamed from: c */
    public final void mo116424c() {
        TextView textView = (TextView) findViewById(R.id.tvNotifyTitle);
        Intrinsics.checkExpressionValueIsNotNull(textView, "tvNotifyTitle");
        textView.setText(C32634ae.m125182b(R.string.Calendar_Edit_ShareEventInChatConfirm));
        TextView textView2 = (TextView) findViewById(R.id.tvNotifySubTitle);
        Intrinsics.checkExpressionValueIsNotNull(textView2, "tvNotifySubTitle");
        textView2.setVisibility(8);
        LinearLayout linearLayout = (LinearLayout) findViewById(R.id.checkboxContainer);
        Intrinsics.checkExpressionValueIsNotNull(linearLayout, "checkboxContainer");
        linearLayout.setVisibility(8);
        TextView textView3 = (TextView) findViewById(R.id.tvNotifySend);
        Intrinsics.checkExpressionValueIsNotNull(textView3, "tvNotifySend");
        textView3.setText(C32634ae.m125182b(R.string.Calendar_Edit_ShareEventInChatConfirmShareButton));
        TextView textView4 = (TextView) findViewById(R.id.tvNotifyNotSend);
        Intrinsics.checkExpressionValueIsNotNull(textView4, "tvNotifyNotSend");
        textView4.setText(C32634ae.m125182b(R.string.Calendar_Edit_ShareEventInChatConfirmDontShareButton));
        TextView textView5 = (TextView) findViewById(R.id.tvNotifyCancel);
        Intrinsics.checkExpressionValueIsNotNull(textView5, "tvNotifyCancel");
        textView5.setText(C32634ae.m125182b(R.string.Calendar_Edit_ShareEventInChatConfirmBackToEditingButton));
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.events.edit.widget.NotifyAttendeeDialog$f */
    public static final class View$OnClickListenerC31887f implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ NotifyAttendeeDialog f81385a;

        View$OnClickListenerC31887f(NotifyAttendeeDialog notifyAttendeeDialog) {
            this.f81385a = notifyAttendeeDialog;
        }

        public final void onClick(View view) {
            Delegate aVar = this.f81385a.f81377a;
            if (aVar != null) {
                aVar.mo114706a();
            }
            this.f81385a.dismiss();
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.events.edit.widget.NotifyAttendeeDialog$b */
    public static final class View$OnClickListenerC31883b implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ NotifyAttendeeDialog f81381a;

        View$OnClickListenerC31883b(NotifyAttendeeDialog notifyAttendeeDialog) {
            this.f81381a = notifyAttendeeDialog;
        }

        public final void onClick(View view) {
            NotifyAttendeeDialog notifyAttendeeDialog = this.f81381a;
            notifyAttendeeDialog.f81379c = !notifyAttendeeDialog.f81379c;
            LKUICheckBox lKUICheckBox = (LKUICheckBox) this.f81381a.findViewById(R.id.checkbox);
            Intrinsics.checkExpressionValueIsNotNull(lKUICheckBox, "checkbox");
            lKUICheckBox.setChecked(this.f81381a.f81379c);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.events.edit.widget.NotifyAttendeeDialog$d */
    public static final class View$OnClickListenerC31885d implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ NotifyAttendeeDialog f81383a;

        View$OnClickListenerC31885d(NotifyAttendeeDialog notifyAttendeeDialog) {
            this.f81383a = notifyAttendeeDialog;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:13:0x004b, code lost:
            if (r5.f81383a.f81378b == com.ss.android.lark.calendar.impl.features.events.edit.widget.NotifyAttendeeDialog.CheckBoxType.TRANSFER_TO_CHAT) goto L_0x004f;
         */
        /* JADX WARNING: Removed duplicated region for block: B:10:0x0034  */
        /* JADX WARNING: Removed duplicated region for block: B:17:0x0055  */
        /* JADX WARNING: Removed duplicated region for block: B:19:? A[RETURN, SYNTHETIC] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void onClick(android.view.View r6) {
            /*
                r5 = this;
                com.ss.android.lark.calendar.impl.features.events.edit.widget.NotifyAttendeeDialog r6 = r5.f81383a
                r6.dismiss()
                com.ss.android.lark.calendar.impl.features.events.edit.widget.NotifyAttendeeDialog r6 = r5.f81383a
                boolean r6 = r6.f81379c
                r0 = 1
                java.lang.String r1 = "checkboxContainer"
                r2 = 2131297755(0x7f0905db, float:1.8213464E38)
                r3 = 0
                if (r6 == 0) goto L_0x002d
                com.ss.android.lark.calendar.impl.features.events.edit.widget.NotifyAttendeeDialog r6 = r5.f81383a
                android.view.View r6 = r6.findViewById(r2)
                android.widget.LinearLayout r6 = (android.widget.LinearLayout) r6
                kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r6, r1)
                int r6 = r6.getVisibility()
                if (r6 != 0) goto L_0x002d
                com.ss.android.lark.calendar.impl.features.events.edit.widget.NotifyAttendeeDialog r6 = r5.f81383a
                com.ss.android.lark.calendar.impl.features.events.edit.widget.NotifyAttendeeDialog$CheckBoxType r6 = r6.f81378b
                com.ss.android.lark.calendar.impl.features.events.edit.widget.NotifyAttendeeDialog$CheckBoxType r4 = com.ss.android.lark.calendar.impl.features.events.edit.widget.NotifyAttendeeDialog.CheckBoxType.SHARE_TO_CHAT
                if (r6 != r4) goto L_0x002d
                r6 = 1
                goto L_0x002e
            L_0x002d:
                r6 = 0
            L_0x002e:
                com.ss.android.lark.calendar.impl.features.events.edit.widget.NotifyAttendeeDialog r4 = r5.f81383a
                boolean r4 = r4.f81379c
                if (r4 == 0) goto L_0x004e
                com.ss.android.lark.calendar.impl.features.events.edit.widget.NotifyAttendeeDialog r4 = r5.f81383a
                android.view.View r2 = r4.findViewById(r2)
                android.widget.LinearLayout r2 = (android.widget.LinearLayout) r2
                kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r2, r1)
                int r1 = r2.getVisibility()
                if (r1 != 0) goto L_0x004e
                com.ss.android.lark.calendar.impl.features.events.edit.widget.NotifyAttendeeDialog r1 = r5.f81383a
                com.ss.android.lark.calendar.impl.features.events.edit.widget.NotifyAttendeeDialog$CheckBoxType r1 = r1.f81378b
                com.ss.android.lark.calendar.impl.features.events.edit.widget.NotifyAttendeeDialog$CheckBoxType r2 = com.ss.android.lark.calendar.impl.features.events.edit.widget.NotifyAttendeeDialog.CheckBoxType.TRANSFER_TO_CHAT
                if (r1 != r2) goto L_0x004e
                goto L_0x004f
            L_0x004e:
                r0 = 0
            L_0x004f:
                com.ss.android.lark.calendar.impl.features.events.edit.widget.NotifyAttendeeDialog r1 = r5.f81383a
                com.ss.android.lark.calendar.impl.features.events.edit.widget.NotifyAttendeeDialog$a r1 = r1.f81377a
                if (r1 == 0) goto L_0x0058
                r1.mo114707a(r6, r0)
            L_0x0058:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.calendar.impl.features.events.edit.widget.NotifyAttendeeDialog.View$OnClickListenerC31885d.onClick(android.view.View):void");
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.events.edit.widget.NotifyAttendeeDialog$e */
    public static final class View$OnClickListenerC31886e implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ NotifyAttendeeDialog f81384a;

        View$OnClickListenerC31886e(NotifyAttendeeDialog notifyAttendeeDialog) {
            this.f81384a = notifyAttendeeDialog;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:13:0x004b, code lost:
            if (r5.f81384a.f81378b == com.ss.android.lark.calendar.impl.features.events.edit.widget.NotifyAttendeeDialog.CheckBoxType.TRANSFER_TO_CHAT) goto L_0x004f;
         */
        /* JADX WARNING: Removed duplicated region for block: B:10:0x0034  */
        /* JADX WARNING: Removed duplicated region for block: B:17:0x0055  */
        /* JADX WARNING: Removed duplicated region for block: B:19:? A[RETURN, SYNTHETIC] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void onClick(android.view.View r6) {
            /*
                r5 = this;
                com.ss.android.lark.calendar.impl.features.events.edit.widget.NotifyAttendeeDialog r6 = r5.f81384a
                r6.dismiss()
                com.ss.android.lark.calendar.impl.features.events.edit.widget.NotifyAttendeeDialog r6 = r5.f81384a
                boolean r6 = r6.f81379c
                r0 = 1
                java.lang.String r1 = "checkboxContainer"
                r2 = 2131297755(0x7f0905db, float:1.8213464E38)
                r3 = 0
                if (r6 == 0) goto L_0x002d
                com.ss.android.lark.calendar.impl.features.events.edit.widget.NotifyAttendeeDialog r6 = r5.f81384a
                android.view.View r6 = r6.findViewById(r2)
                android.widget.LinearLayout r6 = (android.widget.LinearLayout) r6
                kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r6, r1)
                int r6 = r6.getVisibility()
                if (r6 != 0) goto L_0x002d
                com.ss.android.lark.calendar.impl.features.events.edit.widget.NotifyAttendeeDialog r6 = r5.f81384a
                com.ss.android.lark.calendar.impl.features.events.edit.widget.NotifyAttendeeDialog$CheckBoxType r6 = r6.f81378b
                com.ss.android.lark.calendar.impl.features.events.edit.widget.NotifyAttendeeDialog$CheckBoxType r4 = com.ss.android.lark.calendar.impl.features.events.edit.widget.NotifyAttendeeDialog.CheckBoxType.SHARE_TO_CHAT
                if (r6 != r4) goto L_0x002d
                r6 = 1
                goto L_0x002e
            L_0x002d:
                r6 = 0
            L_0x002e:
                com.ss.android.lark.calendar.impl.features.events.edit.widget.NotifyAttendeeDialog r4 = r5.f81384a
                boolean r4 = r4.f81379c
                if (r4 == 0) goto L_0x004e
                com.ss.android.lark.calendar.impl.features.events.edit.widget.NotifyAttendeeDialog r4 = r5.f81384a
                android.view.View r2 = r4.findViewById(r2)
                android.widget.LinearLayout r2 = (android.widget.LinearLayout) r2
                kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r2, r1)
                int r1 = r2.getVisibility()
                if (r1 != 0) goto L_0x004e
                com.ss.android.lark.calendar.impl.features.events.edit.widget.NotifyAttendeeDialog r1 = r5.f81384a
                com.ss.android.lark.calendar.impl.features.events.edit.widget.NotifyAttendeeDialog$CheckBoxType r1 = r1.f81378b
                com.ss.android.lark.calendar.impl.features.events.edit.widget.NotifyAttendeeDialog$CheckBoxType r2 = com.ss.android.lark.calendar.impl.features.events.edit.widget.NotifyAttendeeDialog.CheckBoxType.TRANSFER_TO_CHAT
                if (r1 != r2) goto L_0x004e
                goto L_0x004f
            L_0x004e:
                r0 = 0
            L_0x004f:
                com.ss.android.lark.calendar.impl.features.events.edit.widget.NotifyAttendeeDialog r1 = r5.f81384a
                com.ss.android.lark.calendar.impl.features.events.edit.widget.NotifyAttendeeDialog$a r1 = r1.f81377a
                if (r1 == 0) goto L_0x0058
                r1.mo114708b(r6, r0)
            L_0x0058:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.calendar.impl.features.events.edit.widget.NotifyAttendeeDialog.View$OnClickListenerC31886e.onClick(android.view.View):void");
        }
    }

    /* renamed from: a */
    public final void mo116422a(String str) {
        String str2;
        Intrinsics.checkParameterIsNotNull(str, "subTitleText");
        if (!this.f81380d) {
            TextView textView = (TextView) findViewById(R.id.tvNotifySubTitle);
            Intrinsics.checkExpressionValueIsNotNull(textView, "tvNotifySubTitle");
            if (textView.getVisibility() == 0) {
                TextView textView2 = (TextView) findViewById(R.id.tvNotifySubTitle);
                Intrinsics.checkExpressionValueIsNotNull(textView2, "tvNotifySubTitle");
                str2 = textView2.getText();
            }
            TextView textView3 = (TextView) findViewById(R.id.tvNotifySubTitle);
            Intrinsics.checkExpressionValueIsNotNull(textView3, "tvNotifySubTitle");
            textView3.setText(str2 + str);
            TextView textView4 = (TextView) findViewById(R.id.tvNotifySubTitle);
            Intrinsics.checkExpressionValueIsNotNull(textView4, "tvNotifySubTitle");
            textView4.setVisibility(0);
        }
    }

    /* renamed from: a */
    private final void m121312a(NotificationBoxType notificationBoxType) {
        NotificationBoxType.BoxSubjectType a = notificationBoxType.mo119918a();
        if (a != null) {
            switch (C31896d.f81410i[a.ordinal()]) {
                case 1:
                    ((TextView) findViewById(R.id.tvNotifyTitle)).setText(R.string.Calendar_Detail_SendInvitationsToAttendees);
                    TextView textView = (TextView) findViewById(R.id.tvNotifySubTitle);
                    Intrinsics.checkExpressionValueIsNotNull(textView, "tvNotifySubTitle");
                    textView.setVisibility(8);
                    break;
                case 2:
                    ((TextView) findViewById(R.id.tvNotifyTitle)).setText(R.string.Calendar_Detail_SendUpdatesToAttendees);
                    NotificationBoxType.MeetingEventSpecialRule b = notificationBoxType.mo119922b();
                    if (b != null) {
                        int i = C31896d.f81402a[b.ordinal()];
                        if (i != 1) {
                            if (i == 2) {
                                TextView textView2 = (TextView) findViewById(R.id.tvNotifySubTitle);
                                Intrinsics.checkExpressionValueIsNotNull(textView2, "tvNotifySubTitle");
                                textView2.setVisibility(8);
                                break;
                            }
                        } else {
                            ((TextView) findViewById(R.id.tvNotifySubTitle)).setText(R.string.Calendar_Meeting_NewMeeting);
                            TextView textView3 = (TextView) findViewById(R.id.tvNotifySubTitle);
                            Intrinsics.checkExpressionValueIsNotNull(textView3, "tvNotifySubTitle");
                            textView3.setVisibility(0);
                            break;
                        }
                    }
                    break;
                case 3:
                    ((TextView) findViewById(R.id.tvNotifyTitle)).setText(R.string.Calendar_Detail_SendInvitationsToNewAttendeesOnly);
                    NotificationBoxType.MeetingEventSpecialRule b2 = notificationBoxType.mo119922b();
                    if (b2 != null) {
                        int i2 = C31896d.f81403b[b2.ordinal()];
                        if (i2 != 1) {
                            if (i2 == 2) {
                                TextView textView4 = (TextView) findViewById(R.id.tvNotifySubTitle);
                                Intrinsics.checkExpressionValueIsNotNull(textView4, "tvNotifySubTitle");
                                textView4.setVisibility(8);
                                break;
                            }
                        } else {
                            ((TextView) findViewById(R.id.tvNotifySubTitle)).setText(R.string.Calendar_Meeting_NewMeeting);
                            TextView textView5 = (TextView) findViewById(R.id.tvNotifySubTitle);
                            Intrinsics.checkExpressionValueIsNotNull(textView5, "tvNotifySubTitle");
                            textView5.setVisibility(0);
                            break;
                        }
                    }
                    break;
                case 4:
                    ((TextView) findViewById(R.id.tvNotifyTitle)).setText(R.string.Calendar_Detail_SendCancellationsToRemovedAttendees);
                    NotificationBoxType.MeetingEventSpecialRule b3 = notificationBoxType.mo119922b();
                    if (b3 != null) {
                        int i3 = C31896d.f81404c[b3.ordinal()];
                        if (i3 != 1) {
                            if (i3 == 2) {
                                TextView textView6 = (TextView) findViewById(R.id.tvNotifySubTitle);
                                Intrinsics.checkExpressionValueIsNotNull(textView6, "tvNotifySubTitle");
                                textView6.setVisibility(8);
                                break;
                            }
                        } else {
                            ((TextView) findViewById(R.id.tvNotifySubTitle)).setText(R.string.Calendar_Meeting_NewMeeting);
                            TextView textView7 = (TextView) findViewById(R.id.tvNotifySubTitle);
                            Intrinsics.checkExpressionValueIsNotNull(textView7, "tvNotifySubTitle");
                            textView7.setVisibility(0);
                            break;
                        }
                    }
                    break;
                case 5:
                    ((TextView) findViewById(R.id.tvNotifyTitle)).setText(R.string.Calendar_Detail_SendInvitationsToNewAttendeesAndUpdatesToExistingAttendees);
                    NotificationBoxType.MeetingEventSpecialRule b4 = notificationBoxType.mo119922b();
                    if (b4 != null) {
                        int i4 = C31896d.f81405d[b4.ordinal()];
                        if (i4 != 1) {
                            if (i4 == 2) {
                                TextView textView8 = (TextView) findViewById(R.id.tvNotifySubTitle);
                                Intrinsics.checkExpressionValueIsNotNull(textView8, "tvNotifySubTitle");
                                textView8.setVisibility(8);
                                break;
                            }
                        } else {
                            ((TextView) findViewById(R.id.tvNotifySubTitle)).setText(R.string.Calendar_Meeting_NewMeeting);
                            TextView textView9 = (TextView) findViewById(R.id.tvNotifySubTitle);
                            Intrinsics.checkExpressionValueIsNotNull(textView9, "tvNotifySubTitle");
                            textView9.setVisibility(0);
                            break;
                        }
                    }
                    break;
                case 6:
                    ((TextView) findViewById(R.id.tvNotifyTitle)).setText(R.string.Calendar_Detail_SendCancellationsToRemovedAttendeesAndUpdatesToRemainingAttendees);
                    NotificationBoxType.MeetingEventSpecialRule b5 = notificationBoxType.mo119922b();
                    if (b5 != null) {
                        int i5 = C31896d.f81406e[b5.ordinal()];
                        if (i5 != 1) {
                            if (i5 == 2) {
                                TextView textView10 = (TextView) findViewById(R.id.tvNotifySubTitle);
                                Intrinsics.checkExpressionValueIsNotNull(textView10, "tvNotifySubTitle");
                                textView10.setVisibility(8);
                                break;
                            }
                        } else {
                            ((TextView) findViewById(R.id.tvNotifySubTitle)).setText(R.string.Calendar_Meeting_NewMeeting);
                            TextView textView11 = (TextView) findViewById(R.id.tvNotifySubTitle);
                            Intrinsics.checkExpressionValueIsNotNull(textView11, "tvNotifySubTitle");
                            textView11.setVisibility(0);
                            break;
                        }
                    }
                    break;
                case 7:
                    ((TextView) findViewById(R.id.tvNotifyTitle)).setText(R.string.Calendar_Detail_SendCancellationsToRemovedAttendees);
                    NotificationBoxType.MeetingEventSpecialRule b6 = notificationBoxType.mo119922b();
                    if (b6 != null) {
                        int i6 = C31896d.f81407f[b6.ordinal()];
                        if (i6 != 1) {
                            if (i6 == 2) {
                                TextView textView12 = (TextView) findViewById(R.id.tvNotifySubTitle);
                                Intrinsics.checkExpressionValueIsNotNull(textView12, "tvNotifySubTitle");
                                textView12.setVisibility(8);
                                break;
                            }
                        } else {
                            ((TextView) findViewById(R.id.tvNotifySubTitle)).setText(R.string.Calendar_Meeting_NewMeeting);
                            TextView textView13 = (TextView) findViewById(R.id.tvNotifySubTitle);
                            Intrinsics.checkExpressionValueIsNotNull(textView13, "tvNotifySubTitle");
                            textView13.setVisibility(0);
                            break;
                        }
                    }
                    break;
                case 8:
                    ((TextView) findViewById(R.id.tvNotifyTitle)).setText(R.string.Calendar_Detail_SendInvitationsToNewAttendeesAndCancellationsToRemovedAttendees);
                    NotificationBoxType.MeetingEventSpecialRule b7 = notificationBoxType.mo119922b();
                    if (b7 != null) {
                        int i7 = C31896d.f81408g[b7.ordinal()];
                        if (i7 != 1) {
                            if (i7 == 2) {
                                TextView textView14 = (TextView) findViewById(R.id.tvNotifySubTitle);
                                Intrinsics.checkExpressionValueIsNotNull(textView14, "tvNotifySubTitle");
                                textView14.setVisibility(8);
                                break;
                            }
                        } else {
                            ((TextView) findViewById(R.id.tvNotifySubTitle)).setText(R.string.Calendar_Meeting_NewMeeting);
                            TextView textView15 = (TextView) findViewById(R.id.tvNotifySubTitle);
                            Intrinsics.checkExpressionValueIsNotNull(textView15, "tvNotifySubTitle");
                            textView15.setVisibility(0);
                            break;
                        }
                    }
                    break;
                case 9:
                    ((TextView) findViewById(R.id.tvNotifyTitle)).setText(R.string.Calendar_Detail_SendInvitationsToNewAttendeesCancellationsToRemovedAttendeesAndUpdatesToExistingAttendees);
                    NotificationBoxType.MeetingEventSpecialRule b8 = notificationBoxType.mo119922b();
                    if (b8 != null) {
                        int i8 = C31896d.f81409h[b8.ordinal()];
                        if (i8 != 1) {
                            if (i8 == 2) {
                                TextView textView16 = (TextView) findViewById(R.id.tvNotifySubTitle);
                                Intrinsics.checkExpressionValueIsNotNull(textView16, "tvNotifySubTitle");
                                textView16.setVisibility(8);
                                break;
                            }
                        } else {
                            ((TextView) findViewById(R.id.tvNotifySubTitle)).setText(R.string.Calendar_Meeting_NewMeeting);
                            TextView textView17 = (TextView) findViewById(R.id.tvNotifySubTitle);
                            Intrinsics.checkExpressionValueIsNotNull(textView17, "tvNotifySubTitle");
                            textView17.setVisibility(0);
                            break;
                        }
                    }
                    break;
                case 10:
                    ((TextView) findViewById(R.id.tvNotifyTitle)).setText(R.string.Calendar_Event_DeleteEventDesc);
                    TextView textView18 = (TextView) findViewById(R.id.tvNotifySubTitle);
                    Intrinsics.checkExpressionValueIsNotNull(textView18, "tvNotifySubTitle");
                    textView18.setVisibility(8);
                    break;
                case 11:
                    ((TextView) findViewById(R.id.tvNotifyTitle)).setText(R.string.Calendar_Event_DeleteEventDesc);
                    this.f81378b = CheckBoxType.TRANSFER_TO_CHAT;
                    LinearLayout linearLayout = (LinearLayout) findViewById(R.id.checkboxContainer);
                    Intrinsics.checkExpressionValueIsNotNull(linearLayout, "checkboxContainer");
                    linearLayout.setVisibility(0);
                    TextView textView19 = (TextView) findViewById(R.id.checkboxDesc);
                    Intrinsics.checkExpressionValueIsNotNull(textView19, "checkboxDesc");
                    textView19.setText(C32634ae.m125182b(R.string.Calendar_Transfer_ConvertWhenDelete));
                    TextView textView20 = (TextView) findViewById(R.id.tvNotifySubTitle);
                    Intrinsics.checkExpressionValueIsNotNull(textView20, "tvNotifySubTitle");
                    textView20.setVisibility(8);
                    this.f81380d = true;
                    break;
            }
        }
        if (notificationBoxType.mo119923c() == NotificationBoxType.MailAttendeeSpecialRule.ADD_MAIL_ATTENDEES_DEFAULT_RECEIVE_NOTIFICATION_SUBTITLE) {
            TextView textView21 = (TextView) findViewById(R.id.tvNotifySubTitle);
            Intrinsics.checkExpressionValueIsNotNull(textView21, "tvNotifySubTitle");
            textView21.setVisibility(0);
            ((TextView) findViewById(R.id.tvNotifySubTitle)).setText(R.string.Calendar_CalMail_InvitePopUpWindowSubtitle);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "<anonymous parameter 0>", "Landroid/widget/CompoundButton;", "kotlin.jvm.PlatformType", "isChecked", "", "onCheckedChanged"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.events.edit.widget.NotifyAttendeeDialog$c */
    public static final class C31884c implements CompoundButton.OnCheckedChangeListener {

        /* renamed from: a */
        final /* synthetic */ NotifyAttendeeDialog f81382a;

        C31884c(NotifyAttendeeDialog notifyAttendeeDialog) {
            this.f81382a = notifyAttendeeDialog;
        }

        public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            this.f81382a.f81379c = z;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NotifyAttendeeDialog(Context context, NotificationBoxType notificationBoxType, Delegate aVar) {
        super(context, R.style.CalendarNotifyAttendeeWindow);
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(notificationBoxType, ShareHitPoint.f121869d);
        setContentView(R.layout.dialog_notify_attendee);
        setCanceledOnTouchOutside(false);
        setCancelable(false);
        this.f81377a = aVar;
        m121314e();
        m121312a(notificationBoxType);
        m121313d();
    }
}
