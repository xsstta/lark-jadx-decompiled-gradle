package com.ss.android.vc.meeting.module.codeinterview;

import com.ss.android.vc.entity.VcMsgInfo;
import com.ss.android.vc.meeting.framework.meeting.C61303k;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0007\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0012\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\tH\u0016J\n\u0010\u0011\u001a\u0004\u0018\u00010\u0006H\u0016J\u0012\u0010\u0012\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\tH\u0016J\u0012\u0010\u0013\u001a\u00020\u000f2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0016J\u0010\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\u0005\u001a\u00020\u0006H\u0016R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u0002\n\u0000R \u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\r¨\u0006\u0016"}, d2 = {"Lcom/ss/android/vc/meeting/module/codeinterview/CodeInterviewControl;", "Lcom/ss/android/vc/meeting/module/codeinterview/AbsCodeInterviewControl;", "meeting", "Lcom/ss/android/vc/meeting/framework/meeting/Meeting;", "(Lcom/ss/android/vc/meeting/framework/meeting/Meeting;)V", "msgInfo", "Lcom/ss/android/vc/entity/VcMsgInfo;", "viewListeners", "", "Lcom/ss/android/vc/meeting/module/codeinterview/ICodeInterviewViewListener;", "getViewListeners", "()Ljava/util/List;", "setViewListeners", "(Ljava/util/List;)V", "addViewListener", "", "listener", "getMsgInfo", "removeViewListener", "setMsgInfo", "showUnSupportAleart", "Companion", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.vc.meeting.module.b.b */
public final class CodeInterviewControl extends AbsCodeInterviewControl {

    /* renamed from: a */
    public static final Companion f153976a = new Companion(null);

    /* renamed from: b */
    private List<ICodeInterviewViewListener> f153977b = new ArrayList();

    /* renamed from: c */
    private VcMsgInfo f153978c;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ss/android/vc/meeting/module/codeinterview/CodeInterviewControl$Companion;", "", "()V", "TAG", "", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.meeting.module.b.b$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // com.ss.android.vc.meeting.module.codeinterview.AbsCodeInterviewControl
    /* renamed from: a */
    public VcMsgInfo mo212752a() {
        return this.f153978c;
    }

    @Override // com.ss.android.vc.meeting.module.codeinterview.AbsCodeInterviewControl
    /* renamed from: a */
    public void mo212753a(VcMsgInfo vcMsgInfo) {
        this.f153978c = vcMsgInfo;
    }

    @Override // com.ss.android.vc.meeting.module.codeinterview.AbsCodeInterviewControl
    /* renamed from: b */
    public void mo212755b(ICodeInterviewViewListener dVar) {
        if (dVar != null) {
            this.f153977b.remove(dVar);
        }
    }

    @Override // com.ss.android.vc.meeting.module.codeinterview.AbsCodeInterviewControl
    /* renamed from: a */
    public void mo212754a(ICodeInterviewViewListener dVar) {
        if (dVar != null && !this.f153977b.contains(dVar)) {
            this.f153977b.add(dVar);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CodeInterviewControl(C61303k kVar) {
        super(kVar);
        Intrinsics.checkParameterIsNotNull(kVar, "meeting");
    }

    @Override // com.ss.android.vc.meeting.module.codeinterview.ICodeInterviewViewListener
    /* renamed from: b */
    public void mo212756b(VcMsgInfo vcMsgInfo) {
        Intrinsics.checkParameterIsNotNull(vcMsgInfo, "msgInfo");
        if (this.f153977b.size() > 0) {
            for (ICodeInterviewViewListener dVar : this.f153977b) {
                dVar.mo212756b(vcMsgInfo);
            }
            return;
        }
        C61303k meeting = getMeeting();
        Intrinsics.checkExpressionValueIsNotNull(meeting, "meeting");
        meeting.aD().mo212753a(vcMsgInfo);
    }
}
