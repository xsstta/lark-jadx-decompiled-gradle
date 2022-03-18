package com.ss.android.vc.meeting.module.codeinterview;

import android.app.Activity;
import com.ss.android.vc.business.bytertc.meeting.ByteRTCMeetingDesktopActivity;
import com.ss.android.vc.common.lifecycle.VCAppLifeCycle;
import com.ss.android.vc.common.p3077b.C60700b;
import com.ss.android.vc.common.p3083e.C60768m;
import com.ss.android.vc.entity.VcMsgInfo;
import com.ss.android.vc.meeting.framework.meeting.C61303k;
import com.ss.android.vc.meeting.module.base.AbstractC61424d;
import com.ss.android.vc.meeting.module.base.AbstractC61429i;
import com.ss.android.vc.meeting.module.multi.ByteRTCMeetingActivity;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \f2\u00020\u00012\u00020\u0002:\u0001\fB\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\b\u0010\u0006\u001a\u00020\u0007H\u0016J\b\u0010\b\u001a\u00020\u0007H\u0016J\u0010\u0010\t\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u000bH\u0016¨\u0006\r"}, d2 = {"Lcom/ss/android/vc/meeting/module/codeinterview/CodeInterviewViewControl;", "Lcom/ss/android/vc/meeting/module/base/BaseViewControl;", "Lcom/ss/android/vc/meeting/module/codeinterview/ICodeInterviewViewListener;", "present", "Lcom/ss/android/vc/meeting/module/base/IMeetingCallPresent;", "(Lcom/ss/android/vc/meeting/module/base/IMeetingCallPresent;)V", "destroy", "", "onResume", "showUnSupportAleart", "msgInfo", "Lcom/ss/android/vc/entity/VcMsgInfo;", "Companion", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.vc.meeting.module.b.c */
public final class CodeInterviewViewControl extends AbstractC61424d implements ICodeInterviewViewListener {

    /* renamed from: a */
    public static final Companion f153979a = new Companion(null);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ss/android/vc/meeting/module/codeinterview/CodeInterviewViewControl$Companion;", "", "()V", "TAG", "", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.meeting.module.b.c$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // com.ss.android.vc.meeting.module.base.AbstractC61424d
    public void destroy() {
        super.destroy();
        C61303k meeting = getMeeting();
        Intrinsics.checkExpressionValueIsNotNull(meeting, "meeting");
        meeting.aD().mo212755b(this);
    }

    @Override // com.ss.android.vc.meeting.module.base.AbstractC61424d
    public void onResume() {
        super.onResume();
        C61303k meeting = getMeeting();
        Intrinsics.checkExpressionValueIsNotNull(meeting, "meeting");
        if (meeting.aD().mo212752a() != null) {
            C60700b.m235851b("CodeInterviewViewControl@", "[onResume]", "show alert");
            Activity c = VCAppLifeCycle.m236256c();
            if (c != null && !c.isFinishing() && ((c instanceof ByteRTCMeetingActivity) || (c instanceof ByteRTCMeetingDesktopActivity))) {
                C61303k meeting2 = getMeeting();
                Intrinsics.checkExpressionValueIsNotNull(meeting2, "meeting");
                C60768m.m236110a(meeting2.aD().mo212752a(), c);
            }
            C61303k meeting3 = getMeeting();
            Intrinsics.checkExpressionValueIsNotNull(meeting3, "meeting");
            meeting3.aD().mo212753a((VcMsgInfo) null);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CodeInterviewViewControl(AbstractC61429i iVar) {
        super(iVar);
        Intrinsics.checkParameterIsNotNull(iVar, "present");
        C61303k meeting = getMeeting();
        Intrinsics.checkExpressionValueIsNotNull(meeting, "meeting");
        meeting.aD().mo212754a(this);
    }

    @Override // com.ss.android.vc.meeting.module.codeinterview.ICodeInterviewViewListener
    /* renamed from: b */
    public void mo212756b(VcMsgInfo vcMsgInfo) {
        Intrinsics.checkParameterIsNotNull(vcMsgInfo, "msgInfo");
        Activity c = VCAppLifeCycle.m236256c();
        if (c == null || c.isFinishing() || (!(c instanceof ByteRTCMeetingActivity) && !(c instanceof ByteRTCMeetingDesktopActivity))) {
            C60700b.m235851b("CodeInterviewViewControl@", "[showUnSupportAlert2]", "cannot get top Activity");
            C61303k meeting = getMeeting();
            Intrinsics.checkExpressionValueIsNotNull(meeting, "meeting");
            meeting.aD().mo212753a(vcMsgInfo);
            return;
        }
        C60700b.m235851b("CodeInterviewViewControl@", "[showUnSupportAlert]", "get top Activity");
        C60768m.m236110a(vcMsgInfo, c);
    }
}
