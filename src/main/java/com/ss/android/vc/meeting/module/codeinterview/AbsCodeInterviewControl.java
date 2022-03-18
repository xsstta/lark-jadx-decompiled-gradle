package com.ss.android.vc.meeting.module.codeinterview;

import com.ss.android.vc.entity.VcMsgInfo;
import com.ss.android.vc.meeting.framework.meeting.C61303k;
import com.ss.android.vc.meeting.module.base.AbstractC61420b;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b&\u0018\u00002\u00020\u00012\u00020\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0012\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u0002H&J\n\u0010\t\u001a\u0004\u0018\u00010\nH&J\u0012\u0010\u000b\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u0002H&J\u0012\u0010\f\u001a\u00020\u00072\b\u0010\r\u001a\u0004\u0018\u00010\nH&¨\u0006\u000e"}, d2 = {"Lcom/ss/android/vc/meeting/module/codeinterview/AbsCodeInterviewControl;", "Lcom/ss/android/vc/meeting/module/base/BaseControl;", "Lcom/ss/android/vc/meeting/module/codeinterview/ICodeInterviewViewListener;", "meeting", "Lcom/ss/android/vc/meeting/framework/meeting/Meeting;", "(Lcom/ss/android/vc/meeting/framework/meeting/Meeting;)V", "addViewListener", "", "listener", "getMsgInfo", "Lcom/ss/android/vc/entity/VcMsgInfo;", "removeViewListener", "setMsgInfo", "msgInfo", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.vc.meeting.module.b.a */
public abstract class AbsCodeInterviewControl extends AbstractC61420b implements ICodeInterviewViewListener {
    /* renamed from: a */
    public abstract VcMsgInfo mo212752a();

    /* renamed from: a */
    public abstract void mo212753a(VcMsgInfo vcMsgInfo);

    /* renamed from: a */
    public abstract void mo212754a(ICodeInterviewViewListener dVar);

    /* renamed from: b */
    public abstract void mo212755b(ICodeInterviewViewListener dVar);

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AbsCodeInterviewControl(C61303k kVar) {
        super(kVar);
        Intrinsics.checkParameterIsNotNull(kVar, "meeting");
    }
}
