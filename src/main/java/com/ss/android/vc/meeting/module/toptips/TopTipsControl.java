package com.ss.android.vc.meeting.module.toptips;

import android.text.TextUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.vc.common.p3077b.C60700b;
import com.ss.android.vc.common.p3083e.C60735ab;
import com.ss.android.vc.entity.Participant;
import com.ss.android.vc.entity.background.ViewDeviceSetting;
import com.ss.android.vc.entity.background.VirtualBackgroundInfo;
import com.ss.android.vc.meeting.framework.meeting.ByteRtc;
import com.ss.android.vc.meeting.framework.meeting.C61303k;
import com.ss.android.vc.meeting.model.MeetingSpecificData;
import com.ss.android.vc.meeting.module.meetingdialog.labs.C62260i;
import com.ss.android.vc.meeting.module.meetingdialog.labs.C62261j;
import com.ss.android.vc.meeting.module.meetingdialog.labs.C62269o;
import com.ss.android.vc.meeting.module.meetingdialog.labs.effect.BeautifyEffect;
import com.ss.android.vc.meeting.module.meetingdialog.labs.effect.C62228c;
import com.ss.android.vc.meeting.module.meetingdialog.labs.effect.EffectModel;
import com.ss.android.vc.meeting.module.multi.gridcontent.TriggerType;
import com.ss.android.vc.meeting.module.p3159s.AbstractC62904a;
import com.ss.android.vc.net.request.AbstractC63598b;
import com.ss.android.vc.net.request.C63602e;
import com.ss.android.vc.statistics.event.C63732ac;
import java.util.HashSet;
import java.util.List;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 !2\u00020\u00012\u00020\u0002:\u0001!B\u000f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004¢\u0006\u0002\u0010\u0005J\b\u0010\n\u001a\u00020\u000bH\u0002J\b\u0010\f\u001a\u00020\u000bH\u0016J\n\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0002J\b\u0010\u0006\u001a\u00020\u0007H\u0016J\u0010\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u000eH\u0016J>\u0010\u0011\u001a\u00020\u000b2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00140\u00132\u0006\u0010\u0015\u001a\u00020\u00072\u0006\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\u0017\u001a\u00020\u00182\u000e\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u001aH\u0016J\u0010\u0010\u001b\u001a\u00020\u000b2\u0006\u0010\u001c\u001a\u00020\u0007H\u0016J.\u0010\u001d\u001a\u00020\u000b2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00140\u00132\u0006\u0010\u0015\u001a\u00020\u00072\u0006\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\u0017\u001a\u00020\u0018H\u0016J\u0012\u0010\u001e\u001a\u00020\u000b2\b\u0010\u001f\u001a\u0004\u0018\u00010\tH\u0016J\b\u0010 \u001a\u00020\u000bH\u0016R\u000e\u0010\u0006\u001a\u00020\u0007X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u000e¢\u0006\u0002\n\u0000¨\u0006\""}, d2 = {"Lcom/ss/android/vc/meeting/module/toptips/TopTipsControl;", "Lcom/ss/android/vc/meeting/module/toptips/AbsTopTipsControl;", "Lcom/ss/android/vc/meeting/model/MeetingSpecificData$OnMeetingDataChangeListener;", "meeting", "Lcom/ss/android/vc/meeting/framework/meeting/Meeting;", "(Lcom/ss/android/vc/meeting/framework/meeting/Meeting;)V", "isShowing", "", "mTopBarViewListener", "Lcom/ss/android/vc/meeting/module/toptips/AbsTopTipsControl$ITopTipsViewListener;", "closeEffect", "", "closeTips", "getEffectOnline", "", "onActiveSpeakerChanged", "rtcJoinId", "onParticipantChange", "sortedParticipants", "", "Lcom/ss/android/vc/entity/Participant;", "hasValidAS", "asRtcJoinId", "triggerType", "Lcom/ss/android/vc/meeting/module/multi/gridcontent/TriggerType;", "newEnterParticipants", "Ljava/util/HashSet;", "onVideoMute", "muted", "onVideoSort", "setViewControl", "topBarViewListener", "showTips", "Companion", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.vc.meeting.module.s.b */
public final class TopTipsControl extends AbstractC62904a implements MeetingSpecificData.OnMeetingDataChangeListener {

    /* renamed from: b */
    public static final Companion f158446b = new Companion(null);

    /* renamed from: a */
    public boolean f158447a;

    /* renamed from: c */
    private AbstractC62904a.AbstractC62907c f158448c;

    @Override // com.ss.android.vc.meeting.model.MeetingSpecificData.OnMeetingDataChangeListener
    /* renamed from: a */
    public void mo212577a(String str) {
        Intrinsics.checkParameterIsNotNull(str, "rtcJoinId");
    }

    @Override // com.ss.android.vc.meeting.model.MeetingSpecificData.OnMeetingDataChangeListener
    /* renamed from: a */
    public void mo212578a(List<Participant> list, boolean z, String str, TriggerType triggerType) {
        Intrinsics.checkParameterIsNotNull(list, "sortedParticipants");
        Intrinsics.checkParameterIsNotNull(str, "asRtcJoinId");
        Intrinsics.checkParameterIsNotNull(triggerType, "triggerType");
    }

    @Override // com.ss.android.vc.meeting.model.MeetingSpecificData.OnMeetingDataChangeListener
    /* renamed from: a */
    public void mo212579a(List<Participant> list, boolean z, String str, TriggerType triggerType, HashSet<String> hashSet) {
        Intrinsics.checkParameterIsNotNull(list, "sortedParticipants");
        Intrinsics.checkParameterIsNotNull(str, "asRtcJoinId");
        Intrinsics.checkParameterIsNotNull(triggerType, "triggerType");
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ss/android/vc/meeting/module/toptips/TopTipsControl$Companion;", "", "()V", "TAG", "", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.meeting.module.s.b$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // com.ss.android.vc.meeting.module.p3159s.AbstractC62904a
    /* renamed from: b */
    public boolean mo217388b() {
        return this.f158447a;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\b\u0010\u0004\u001a\u00020\u0003H\u0016¨\u0006\u0005"}, d2 = {"com/ss/android/vc/meeting/module/toptips/TopTipsControl$showTips$1", "Lcom/ss/android/vc/meeting/module/toptips/AbsTopTipsControl$ITipsInMeetingOnClickListener;", "onCloseClick", "", "onConfirmClick", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.meeting.module.s.b$c */
    public static final class C62910c implements AbstractC62904a.AbstractC62905a {

        /* renamed from: a */
        final /* synthetic */ TopTipsControl f158451a;

        @Override // com.ss.android.vc.meeting.module.p3159s.AbstractC62904a.AbstractC62906b
        /* renamed from: a */
        public void mo215232a() {
            this.f158451a.f158447a = false;
            this.f158451a.mo217395d();
            C63732ac.m249969a(true, false, true);
        }

        @Override // com.ss.android.vc.meeting.module.p3159s.AbstractC62904a.AbstractC62905a
        /* renamed from: b */
        public void mo217389b() {
            this.f158451a.f158447a = false;
            C63732ac.m249969a(true, false, false);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C62910c(TopTipsControl bVar) {
            this.f158451a = bVar;
        }
    }

    /* renamed from: c */
    public void mo217394c() {
        if (this.f158447a) {
            this.f158447a = false;
            AbstractC62904a.AbstractC62907c cVar = this.f158448c;
            if (cVar != null) {
                cVar.mo217390a();
            }
        }
    }

    /* renamed from: d */
    public final void mo217395d() {
        C60700b.m235851b("TopTipsControl", "[closeEffect]", "start");
        C60735ab.m236018e(new RunnableC62908b(this));
    }

    @Override // com.ss.android.vc.meeting.module.p3159s.AbstractC62904a
    /* renamed from: a */
    public void mo217386a() {
        C60700b.m235851b("TopTipsControl", "[showTips]", "showed");
        if (this.f158448c != null) {
            C61303k meeting = getMeeting();
            Intrinsics.checkExpressionValueIsNotNull(meeting, "meeting");
            if (!meeting.mo212092J().mo212504A()) {
                String e = m246318e();
                if (TextUtils.isEmpty(e)) {
                    mo217394c();
                    return;
                }
                C60700b.m235851b("TopTipsControl", "[showTips]", "on line effects: " + e);
                String mustacheFormat = UIHelper.mustacheFormat((int) R.string.View_MV_EffectsSmoothMeet, "effects", e);
                AbstractC62904a.AbstractC62907c cVar = this.f158448c;
                if (cVar != null) {
                    cVar.mo217392a(mustacheFormat);
                }
                AbstractC62904a.AbstractC62907c cVar2 = this.f158448c;
                if (cVar2 != null) {
                    cVar2.mo217393b(getAppContext().getString(R.string.View_MV_TurnOffEffects));
                }
                C63732ac.m249969a(true, true, false);
                this.f158447a = true;
                AbstractC62904a.AbstractC62907c cVar3 = this.f158448c;
                if (cVar3 != null) {
                    cVar3.mo217391a(new C62910c(this));
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.meeting.module.s.b$b */
    public static final class RunnableC62908b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ TopTipsControl f158449a;

        RunnableC62908b(TopTipsControl bVar) {
            this.f158449a = bVar;
        }

        public final void run() {
            ByteRtc y;
            ByteRtc y2;
            ByteRtc y3;
            ByteRtc y4;
            ViewDeviceSetting viewDeviceSetting;
            ViewDeviceSetting.Video video;
            ViewDeviceSetting viewDeviceSetting2;
            ViewDeviceSetting.Video video2;
            C62269o.f156438b = VirtualBackgroundInfo.newDisabled();
            C62269o.m243173a();
            C62269o.m243187e();
            C62260i iVar = C62261j.f156429a;
            if (!(iVar == null || (viewDeviceSetting2 = iVar.f156428b) == null || (video2 = viewDeviceSetting2.video) == null)) {
                video2.backgroundBlur = false;
            }
            C62260i iVar2 = C62261j.f156429a;
            if (!(iVar2 == null || (viewDeviceSetting = iVar2.f156428b) == null || (video = viewDeviceSetting.video) == null)) {
                video.virtualBackground = null;
            }
            C61303k meeting = this.f158449a.getMeeting();
            if (!(meeting == null || (y4 = meeting.mo212165y()) == null)) {
                y4.mo212023g(false);
            }
            C61303k meeting2 = this.f158449a.getMeeting();
            if (!(meeting2 == null || (y3 = meeting2.mo212165y()) == null)) {
                y3.mo211998a("");
            }
            C61303k meeting3 = this.f158449a.getMeeting();
            if (!(meeting3 == null || (y2 = meeting3.mo212165y()) == null)) {
                y2.mo212011b("default");
            }
            C61303k meeting4 = this.f158449a.getMeeting();
            if (!(meeting4 == null || (y = meeting4.mo212165y()) == null)) {
                y.mo212011b("vc-beautyandfilter");
            }
            C62228c.m243024e(new AbstractC63598b<List<EffectModel>>(this) {
                /* class com.ss.android.vc.meeting.module.toptips.TopTipsControl.RunnableC62908b.C629091 */

                /* renamed from: a */
                final /* synthetic */ RunnableC62908b f158450a;

                @Override // com.ss.android.vc.net.request.AbstractC63598b
                public void onError(C63602e eVar) {
                }

                /* JADX WARN: Incorrect args count in method signature: ()V */
                {
                    this.f158450a = r1;
                }

                /* renamed from: a */
                public void onSuccess(List<EffectModel> list) {
                    String[] strArr;
                    int[] iArr;
                    int i;
                    ByteRtc y;
                    if (list != null) {
                        for (EffectModel effectModel : list) {
                            BeautifyEffect newBeautifyEffectModel = EffectModel.newBeautifyEffectModel(effectModel, C62269o.m243171a(effectModel, EffectModel.BeautifyStyle.ORIGINAL));
                            int i2 = 0;
                            int[] iArr2 = new int[0];
                            String[] strArr2 = new String[0];
                            Intrinsics.checkExpressionValueIsNotNull(newBeautifyEffectModel, "realModel");
                            int i3 = !newBeautifyEffectModel.isBeautify();
                            List<EffectModel.TagModel> tags = newBeautifyEffectModel.getTags();
                            if (tags == null || tags.isEmpty()) {
                                iArr = iArr2;
                                strArr = strArr2;
                                i = 0;
                            } else {
                                int size = tags.size();
                                int[] iArr3 = new int[size];
                                String[] strArr3 = new String[size];
                                for (EffectModel.TagModel tagModel : tags) {
                                    Intrinsics.checkExpressionValueIsNotNull(tagModel, "tag");
                                    iArr3[i2] = tagModel.getUserValue();
                                    strArr3[i2] = tagModel.getTag();
                                    i2++;
                                }
                                i = size;
                                iArr = iArr3;
                                strArr = strArr3;
                            }
                            C61303k meeting = this.f158450a.f158449a.getMeeting();
                            if (!(meeting == null || (y = meeting.mo212165y()) == null)) {
                                y.mo212001a(newBeautifyEffectModel.getUnzipPath(), newBeautifyEffectModel.getPanel(), newBeautifyEffectModel.getCategory(), i, iArr, strArr, i3, "");
                            }
                        }
                    }
                }
            });
        }
    }

    /* renamed from: e */
    private final String m246318e() {
        String str;
        boolean z;
        C62260i iVar;
        ViewDeviceSetting viewDeviceSetting;
        ViewDeviceSetting.Video video;
        ViewDeviceSetting viewDeviceSetting2;
        ViewDeviceSetting.Video video2;
        StringBuilder sb = new StringBuilder();
        C62260i iVar2 = C62261j.f156429a;
        if (iVar2 == null || (viewDeviceSetting2 = iVar2.f156428b) == null || (video2 = viewDeviceSetting2.video) == null) {
            str = null;
        } else {
            str = video2.virtualBackground;
        }
        if (!TextUtils.isEmpty(str) || !((iVar = C62261j.f156429a) == null || (viewDeviceSetting = iVar.f156428b) == null || (video = viewDeviceSetting.video) == null || !video.backgroundBlur)) {
            sb.append(getAppContext().getString(R.string.View_VM_VirtualBackground));
            sb.append(getAppContext().getString(R.string.View_G_EnumerationComma));
        }
        if (!TextUtils.isEmpty(C62269o.m243179b().optString("selectedAnimoji"))) {
            sb.append(getAppContext().getString(R.string.View_VM_Avatar));
            sb.append(getAppContext().getString(R.string.View_G_EnumerationComma));
        }
        if (!TextUtils.isEmpty(C62269o.m243179b().optString("selectedFilter"))) {
            sb.append(getAppContext().getString(R.string.View_G_Filters));
            sb.append(getAppContext().getString(R.string.View_G_EnumerationComma));
        }
        Object opt = C62269o.m243179b().opt("selectedBeautyStyle");
        if (opt != null && (!Intrinsics.areEqual(opt, Integer.valueOf(EffectModel.BeautifyStyle.ORIGINAL.getValue())))) {
            sb.append(getAppContext().getString(R.string.View_VM_TouchUp));
            sb.append(getAppContext().getString(R.string.View_G_EnumerationComma));
        }
        if (sb.length() > 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            return null;
        }
        String sb2 = sb.toString();
        Intrinsics.checkExpressionValueIsNotNull(sb2, "effects.toString()");
        int length = sb.toString().length() - 1;
        if (sb2 != null) {
            String substring = sb2.substring(0, length);
            Intrinsics.checkExpressionValueIsNotNull(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
            return substring;
        }
        throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
    }

    @Override // com.ss.android.vc.meeting.model.MeetingSpecificData.OnMeetingDataChangeListener
    public void j_(boolean z) {
        if (z) {
            mo217394c();
        }
    }

    @Override // com.ss.android.vc.meeting.module.p3159s.AbstractC62904a
    /* renamed from: a */
    public void mo217387a(AbstractC62904a.AbstractC62907c cVar) {
        C60700b.m235851b("TopTipsControl", "[setViewControl]", "start");
        this.f158448c = cVar;
    }

    public TopTipsControl(C61303k kVar) {
        super(kVar);
        MeetingSpecificData J;
        if (kVar != null && (J = kVar.mo212092J()) != null) {
            J.mo212520a(this);
        }
    }
}
