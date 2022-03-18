package com.ss.android.vc.meeting.module.breakoutroom.widgets;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.widget.TextView;
import androidx.lifecycle.AbstractC1178x;
import androidx.lifecycle.C1177w;
import androidx.lifecycle.LifecycleOwner;
import com.huawei.hms.site.ActivityC23764o;
import com.larksuite.component.universe_design.dialog.UDBaseDialogBuilder;
import com.larksuite.component.universe_design.dialog.UDDialog;
import com.larksuite.component.universe_design.dialog.UDDialogController;
import com.larksuite.framework.utils.KeyboardUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.vc.common.lifecycle.VCAppLifeCycle;
import com.ss.android.vc.common.p3077b.C60700b;
import com.ss.android.vc.meeting.framework.manager.MeetingManager;
import com.ss.android.vc.meeting.framework.meeting.AbstractC61294b;
import com.ss.android.vc.meeting.framework.meeting.C61303k;
import com.ss.android.vc.meeting.module.breakoutroom.AbsBreakoutRoomControl;
import com.ss.android.vc.statistics.event.C63752c;
import com.ss.android.vc.statistics.event2.MeetingBreakoutRoomsPopupEvent;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import org.json.JSONObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0002\u001e\u001fB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J.\u0010\u0014\u001a\u00020\u0015\"\u000e\b\u0000\u0010\u0016*\b\u0012\u0004\u0012\u0002H\u00160\u00172\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u0002H\u00160\u00172\u0006\u0010\u0019\u001a\u00020\u001aH\u0016J\n\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0014J\n\u0010\u001d\u001a\u0004\u0018\u00010\u001cH\u0014R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u000e\u001a\u00020\u000fX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013¨\u0006 "}, d2 = {"Lcom/ss/android/vc/meeting/module/breakoutroom/widgets/BreakoutRoomPopWindowDialogController;", "Lcom/larksuite/component/universe_design/dialog/UDDialogController;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "mBreakoutRoomId", "", "mContext", "mDelegate", "Lcom/ss/android/vc/meeting/module/breakoutroom/widgets/BreakoutRoomPopWindowDialogController$IDelegate;", "meeting", "Lcom/ss/android/vc/meeting/framework/meeting/Meeting;", "onShouldShowListener", "Lcom/ss/android/vc/meeting/module/breakoutroom/widgets/BreakoutRoomPopWindowDialogController$OnShouldShowListener;", "shouldShow", "", "getShouldShow", "()Z", "setShouldShow", "(Z)V", "apply", "", "T", "Lcom/larksuite/component/universe_design/dialog/UDBaseDialogBuilder;", "builder", "dialog", "Lcom/larksuite/component/universe_design/dialog/UDDialog;", "onCreateFooter", "Landroid/view/View;", "onCreateHeader", "IDelegate", "OnShouldShowListener", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.vc.meeting.module.breakoutroom.b.b */
public final class BreakoutRoomPopWindowDialogController extends UDDialogController {

    /* renamed from: a */
    public IDelegate f154314a;

    /* renamed from: b */
    public String f154315b;

    /* renamed from: c */
    public OnShouldShowListener f154316c;

    /* renamed from: d */
    public C61303k f154317d;

    /* renamed from: e */
    private Context f154318e;

    /* renamed from: f */
    private boolean f154319f = true;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\bf\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H&¨\u0006\u0006"}, d2 = {"Lcom/ss/android/vc/meeting/module/breakoutroom/widgets/BreakoutRoomPopWindowDialogController$IDelegate;", "", "leaveBreakoutRoom", "", "roomId", "", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.meeting.module.breakoutroom.b.b$a */
    public interface IDelegate {
        /* renamed from: c */
        void mo213218c(String str);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, d2 = {"Lcom/ss/android/vc/meeting/module/breakoutroom/widgets/BreakoutRoomPopWindowDialogController$OnShouldShowListener;", "", "onShouldShow", "", "shouldShow", "", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.meeting.module.breakoutroom.b.b$b */
    public interface OnShouldShowListener {
        /* renamed from: a */
        void mo213219a(boolean z);
    }

    /* renamed from: a */
    public final boolean mo213226a() {
        return this.f154319f;
    }

    /* access modifiers changed from: protected */
    @Override // com.larksuite.component.universe_design.dialog.UDDialogController
    public View onCreateFooter() {
        TextView textView;
        View onCreateFooter = super.onCreateFooter();
        TextView textView2 = null;
        if (onCreateFooter != null) {
            textView = (TextView) onCreateFooter.findViewById(R.id.ud_dialog_btn_primary);
        } else {
            textView = null;
        }
        if (onCreateFooter != null) {
            textView2 = (TextView) onCreateFooter.findViewById(R.id.ud_dialog_btn_secondary);
        }
        if (textView != null) {
            textView.setOnClickListener(new View$OnClickListenerC61522c(this));
        }
        if (textView2 != null) {
            textView2.setOnClickListener(new View$OnClickListenerC61523d(this));
        }
        return onCreateFooter;
    }

    /* access modifiers changed from: protected */
    @Override // com.larksuite.component.universe_design.dialog.UDDialogController
    public View onCreateHeader() {
        AbsBreakoutRoomControl al;
        C1177w e;
        KeyboardUtils.hideKeyboard(VCAppLifeCycle.m236256c());
        View onCreateHeader = super.onCreateHeader();
        MeetingManager a = MeetingManager.m238341a();
        Intrinsics.checkExpressionValueIsNotNull(a, "MeetingManager.getInstance()");
        AbstractC61294b j = a.mo211906j();
        TextView textView = null;
        if (!(j instanceof C61303k)) {
            j = null;
        }
        C61303k kVar = (C61303k) j;
        if (onCreateHeader != null) {
            textView = (TextView) onCreateHeader.findViewById(R.id.ud_dialog_title_tv);
        }
        if (!(kVar == null || (al = kVar.al()) == null || (e = al.mo213177e()) == null)) {
            if (textView != null) {
                StringCompanionObject mVar = StringCompanionObject.f173215a;
                String mustacheFormat = UIHelper.mustacheFormat((int) R.string.View_G_YouWillLeaveRoomAutomatically, "number", e.toString());
                Intrinsics.checkExpressionValueIsNotNull(mustacheFormat, "UIHelper.mustacheFormat(…           it.toString())");
                String format = String.format(mustacheFormat, Arrays.copyOf(new Object[0], 0));
                Intrinsics.checkExpressionValueIsNotNull(format, "java.lang.String.format(format, *args)");
                textView.setText(format);
            }
            Activity c = VCAppLifeCycle.m236256c();
            if (c != null) {
                e.mo5923a((LifecycleOwner) c, new C61524e(textView));
            } else {
                throw new TypeCastException("null cannot be cast to non-null type androidx.lifecycle.LifecycleOwner");
            }
        }
        return onCreateHeader;
    }

    /* renamed from: a */
    public final void mo213225a(boolean z) {
        this.f154319f = z;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BreakoutRoomPopWindowDialogController(Context context) {
        super(context);
        Intrinsics.checkParameterIsNotNull(context, "context");
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.meeting.module.breakoutroom.b.b$c */
    static final class View$OnClickListenerC61522c implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ BreakoutRoomPopWindowDialogController f154320a;

        View$OnClickListenerC61522c(BreakoutRoomPopWindowDialogController bVar) {
            this.f154320a = bVar;
        }

        public final void onClick(View view) {
            UDDialog mDialog;
            this.f154320a.mo213225a(false);
            OnShouldShowListener bVar = this.f154320a.f154316c;
            if (bVar != null) {
                bVar.mo213219a(this.f154320a.mo213226a());
            }
            IDelegate aVar = this.f154320a.f154314a;
            if (aVar != null) {
                aVar.mo213218c(this.f154320a.f154315b);
                MeetingManager a = MeetingManager.m238341a();
                Intrinsics.checkExpressionValueIsNotNull(a, "MeetingManager.getInstance()");
                AbstractC61294b j = a.mo211906j();
                Intrinsics.checkExpressionValueIsNotNull(j, "MeetingManager.getInstance().onthecallMeeting");
                C63752c.m250237a("leaveroom_now", "leaveroom_soon", (JSONObject) null, j.mo212056e());
                MeetingBreakoutRoomsPopupEvent.f160827b.mo220267a().mo220264a("leaveroom_now", "none", this.f154320a.f154317d);
            }
            if (this.f154320a.getMAutoDismiss() && (mDialog = this.f154320a.getMDialog()) != null) {
                mDialog.dismiss();
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.meeting.module.breakoutroom.b.b$d */
    static final class View$OnClickListenerC61523d implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ BreakoutRoomPopWindowDialogController f154321a;

        View$OnClickListenerC61523d(BreakoutRoomPopWindowDialogController bVar) {
            this.f154321a = bVar;
        }

        public final void onClick(View view) {
            UDDialog mDialog;
            if (this.f154321a.getMAutoDismiss() && (mDialog = this.f154321a.getMDialog()) != null) {
                mDialog.dismiss();
            }
            this.f154321a.mo213225a(false);
            OnShouldShowListener bVar = this.f154321a.f154316c;
            if (bVar != null) {
                bVar.mo213219a(this.f154321a.mo213226a());
            }
            MeetingManager a = MeetingManager.m238341a();
            Intrinsics.checkExpressionValueIsNotNull(a, "MeetingManager.getInstance()");
            AbstractC61294b j = a.mo211906j();
            Intrinsics.checkExpressionValueIsNotNull(j, "MeetingManager.getInstance().onthecallMeeting");
            C63752c.m250237a("known", "leaveroom_soon", (JSONObject) null, j.mo212056e());
            MeetingBreakoutRoomsPopupEvent.f160827b.mo220267a().mo220264a("known", "none", this.f154321a.f154317d);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004¨\u0006\u0005"}, d2 = {"<anonymous>", "", ActivityC23764o.f58839a, "", "onChanged", "com/ss/android/vc/meeting/module/breakoutroom/widgets/BreakoutRoomPopWindowDialogController$onCreateHeader$1$1"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.meeting.module.breakoutroom.b.b$e */
    static final class C61524e<T> implements AbstractC1178x<Object> {

        /* renamed from: a */
        final /* synthetic */ TextView f154322a;

        C61524e(TextView textView) {
            this.f154322a = textView;
        }

        @Override // androidx.lifecycle.AbstractC1178x
        public final void onChanged(Object obj) {
            boolean z = obj instanceof Long;
            if (z) {
                if (!z) {
                    obj = null;
                }
                Long l = (Long) obj;
                C60700b.m235851b("BreakoutRoomPopWindow", "updatePopupWindowTitle", "count=" + l);
                TextView textView = this.f154322a;
                if (textView != null) {
                    StringCompanionObject mVar = StringCompanionObject.f173215a;
                    String mustacheFormat = UIHelper.mustacheFormat((int) R.string.View_G_YouWillLeaveRoomAutomatically, "number", String.valueOf(l));
                    Intrinsics.checkExpressionValueIsNotNull(mustacheFormat, "UIHelper.mustacheFormat(…\"number\", num.toString())");
                    String format = String.format(mustacheFormat, Arrays.copyOf(new Object[0], 0));
                    Intrinsics.checkExpressionValueIsNotNull(format, "java.lang.String.format(format, *args)");
                    textView.setText(format);
                }
            }
        }
    }

    @Override // com.larksuite.component.universe_design.dialog.UDDialogController
    public <T extends UDBaseDialogBuilder<? extends T>> void apply(UDBaseDialogBuilder<? extends T> uDBaseDialogBuilder, UDDialog uDDialog) {
        Intrinsics.checkParameterIsNotNull(uDBaseDialogBuilder, "builder");
        Intrinsics.checkParameterIsNotNull(uDDialog, "dialog");
        if (uDBaseDialogBuilder instanceof C61521a) {
            super.apply(uDBaseDialogBuilder, uDDialog);
            C61521a aVar = (C61521a) uDBaseDialogBuilder;
            this.f154318e = aVar.f154307a;
            this.f154314a = aVar.f154308b;
            this.f154315b = aVar.f154309c;
            this.f154319f = aVar.f154310d;
            this.f154316c = aVar.f154311e;
            this.f154317d = aVar.f154313g;
            return;
        }
        throw new IllegalArgumentException(("builder should be UDBaseListDialogBuilder, but actually " + uDBaseDialogBuilder.getClass().getSimpleName()).toString());
    }
}
