package com.ss.android.vc.meeting.module.setting.settingdialog;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.ListAdapter;
import android.widget.ListView;
import com.google.firebase.messaging.Constants;
import com.larksuite.component.ui.button.LKUISwitchButton;
import com.larksuite.suite.R;
import com.ss.android.lark.widget.listener.OnSingleClickListener;
import com.ss.android.vc.common.p3077b.C60700b;
import com.ss.android.vc.common.p3083e.C60735ab;
import com.ss.android.vc.common.p3083e.C60752f;
import com.ss.android.vc.common.widget.LineHeightTextView;
import com.ss.android.vc.entity.InterpreterSetting;
import com.ss.android.vc.entity.LanguageType;
import com.ss.android.vc.entity.Participant;
import com.ss.android.vc.entity.VideoChat;
import com.ss.android.vc.entity.VideoChatInMeetingInfo;
import com.ss.android.vc.entity.VideoChatSettings;
import com.ss.android.vc.entity.response.C60987v;
import com.ss.android.vc.meeting.basedialog.AbstractC61222a;
import com.ss.android.vc.meeting.framework.meeting.C61303k;
import com.ss.android.vc.meeting.model.C61381c;
import com.ss.android.vc.meeting.model.C61383d;
import com.ss.android.vc.meeting.model.C61388g;
import com.ss.android.vc.meeting.module.base.AbstractC61417a;
import com.ss.android.vc.meeting.module.interpretation.C61983j;
import com.ss.android.vc.meeting.module.interpretation.ILanguageSelectListener;
import com.ss.android.vc.meeting.module.interpretation.dialog.InterpretationManageDesktopDialog;
import com.ss.android.vc.meeting.module.interpretation.p3126a.AbstractC61935a;
import com.ss.android.vc.meeting.module.interpretation.p3127b.C61948c;
import com.ss.android.vc.meeting.module.interpretation.p3127b.C61949d;
import com.ss.android.vc.net.request.AbstractC63598b;
import com.ss.android.vc.net.request.C63602e;
import com.ss.android.vc.net.request.VcBizSender;
import com.ss.android.vc.statistics.event.C63742at;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C69121n;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004B\u001d\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000bJ\u0006\u0010\u001c\u001a\u00020\u0011J\u0006\u0010\u001d\u001a\u00020\u001eJ\u0010\u0010\u001f\u001a\u00020\u001e2\u0006\u0010 \u001a\u00020\u0011H\u0002J\u001c\u0010!\u001a\b\u0012\u0004\u0012\u00020#0\"2\f\u0010$\u001a\b\u0012\u0004\u0012\u00020#0\"H\u0002J\b\u0010%\u001a\u00020\u001eH\u0002J\b\u0010&\u001a\u00020\u001eH\u0002J\b\u0010'\u001a\u00020\u001eH\u0016J\u0010\u0010(\u001a\u00020\u001e2\u0006\u0010)\u001a\u00020*H\u0016J\u0016\u0010+\u001a\u00020\u001e2\f\u0010,\u001a\b\u0012\u0004\u0012\u00020#0-H\u0016J\u0010\u0010.\u001a\u00020\u001e2\u0006\u0010/\u001a\u000200H\u0016J\u001c\u00101\u001a\u00020\u001e2\b\u00102\u001a\u0004\u0018\u0001032\b\u00104\u001a\u0004\u0018\u000103H\u0016J\u0006\u00105\u001a\u00020\u001eJ\b\u00106\u001a\u00020\u001eH\u0002R\u0014\u0010\f\u001a\u00020\rXD¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u000e\u0010\u0005\u001a\u00020\u0006X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0015X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0011X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0011X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u0019X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001a\u001a\u0004\u0018\u00010\u001bX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u000e¢\u0006\u0002\n\u0000¨\u00067"}, d2 = {"Lcom/ss/android/vc/meeting/module/setting/settingdialog/SelectInterpretationViewHolder;", "Lcom/ss/android/vc/meeting/basedialog/CommonDialogInterface$OnDismissListener;", "Lcom/ss/android/vc/meeting/model/InMeetingInfoData$InMeetingInfoListener;", "Lcom/ss/android/vc/meeting/model/ParticipantData$ParticipantDataChange;", "Lcom/ss/android/vc/meeting/module/interpretation/ILanguageSelectListener;", "activity", "Landroid/app/Activity;", "meeting", "Lcom/ss/android/vc/meeting/framework/meeting/Meeting;", "dialog", "Lcom/ss/android/vc/meeting/basedialog/CommonDialogInterface;", "(Landroid/app/Activity;Lcom/ss/android/vc/meeting/framework/meeting/Meeting;Lcom/ss/android/vc/meeting/basedialog/CommonDialogInterface;)V", "TAG", "", "getTAG", "()Ljava/lang/String;", "mCloseView", "Landroid/view/View;", "mInterpretationAdapter", "Lcom/ss/android/vc/meeting/module/interpretation/SelectInterpretationAdapter;", "mInterpretationLv", "Landroid/widget/ListView;", "mInterpretationManagerContainer", "mInterpretationManagerView", "mMuteOriginalAudioBtn", "Lcom/larksuite/component/ui/button/LKUISwitchButton;", "mMuteOriginalAudioTxt", "Lcom/ss/android/vc/common/widget/LineHeightTextView;", "contentView", "dismiss", "", "init", "rootView", "initMainChannelInData", "", "Lcom/ss/android/vc/entity/LanguageType;", "originDatas", "initViewByData", "loadSuiteQuota", "onDismiss", "onLanguageTypeChanged", "position", "", "onMeetingSupportLanguageChanged", "supportLanguages", "", "onOpenInterpretationChanged", "isOpen", "", "onSelfParticipantRoleUpdate", "lastSelf", "Lcom/ss/android/vc/entity/Participant;", "currentSelf", "show", "toOpenInterpretationSettingDialog", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.vc.meeting.module.o.a.p */
public final class SelectInterpretationViewHolder implements AbstractC61222a.AbstractC61223a, C61381c.AbstractC61382a, C61388g.AbstractC61393a, ILanguageSelectListener {

    /* renamed from: a */
    public View f157582a;

    /* renamed from: b */
    public C61303k f157583b;

    /* renamed from: c */
    private ListView f157584c;

    /* renamed from: d */
    private View f157585d;

    /* renamed from: e */
    private C61983j f157586e;

    /* renamed from: f */
    private View f157587f;

    /* renamed from: g */
    private LKUISwitchButton f157588g;

    /* renamed from: h */
    private LineHeightTextView f157589h;

    /* renamed from: i */
    private final String f157590i = "SelectInterpretationViewHolder";

    /* renamed from: j */
    private Activity f157591j;

    /* renamed from: k */
    private AbstractC61222a f157592k;

    @Override // com.ss.android.vc.meeting.model.C61388g.AbstractC61393a
    /* renamed from: a */
    public /* synthetic */ void mo212617a(InterpreterSetting interpreterSetting, InterpreterSetting interpreterSetting2) {
        C61388g.AbstractC61393a.CC.$default$a(this, interpreterSetting, interpreterSetting2);
    }

    @Override // com.ss.android.vc.meeting.model.C61388g.AbstractC61393a
    /* renamed from: a */
    public /* synthetic */ void mo212618a(LanguageType languageType, LanguageType languageType2) {
        C61388g.AbstractC61393a.CC.$default$a(this, languageType, languageType2);
    }

    @Override // com.ss.android.vc.meeting.model.C61388g.AbstractC61393a
    /* renamed from: a */
    public /* synthetic */ void mo212619a(Participant participant) {
        C61388g.AbstractC61393a.CC.$default$a(this, participant);
    }

    @Override // com.ss.android.vc.meeting.model.C61381c.AbstractC61382a
    /* renamed from: a */
    public /* synthetic */ void mo212487a(boolean z) {
        C61381c.AbstractC61382a.CC.$default$a(this, z);
    }

    @Override // com.ss.android.vc.meeting.model.C61388g.AbstractC61393a
    /* renamed from: b */
    public /* synthetic */ void mo212621b(Participant participant, Participant participant2) {
        C61388g.AbstractC61393a.CC.$default$b(this, participant, participant2);
    }

    @Override // com.ss.android.vc.meeting.model.C61388g.AbstractC61393a
    public /* synthetic */ void bB_() {
        C61388g.AbstractC61393a.CC.$default$bB_(this);
    }

    @Override // com.ss.android.vc.meeting.model.C61388g.AbstractC61393a
    public /* synthetic */ void bD_() {
        C61388g.AbstractC61393a.CC.$default$bD_(this);
    }

    @Override // com.ss.android.vc.meeting.model.C61388g.AbstractC61393a
    public /* synthetic */ void bG_() {
        C61388g.AbstractC61393a.CC.$default$bG_(this);
    }

    @Override // com.ss.android.vc.meeting.model.C61381c.AbstractC61382a
    public /* synthetic */ void onInMeetingInfoUpdate(VideoChatInMeetingInfo videoChatInMeetingInfo) {
        C61381c.AbstractC61382a.CC.$default$onInMeetingInfoUpdate(this, videoChatInMeetingInfo);
    }

    @Override // com.ss.android.vc.meeting.model.C61388g.AbstractC61393a
    public /* synthetic */ void onSelfRtcModeUpdate(Participant participant, Participant participant2) {
        C61388g.AbstractC61393a.CC.$default$onSelfRtcModeUpdate(this, participant, participant2);
    }

    /* renamed from: a */
    public final String mo216367a() {
        return this.f157590i;
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.meeting.module.o.a.p$e */
    public static final class RunnableC62603e implements Runnable {

        /* renamed from: a */
        final /* synthetic */ AbstractC61222a f157597a;

        RunnableC62603e(AbstractC61222a aVar) {
            this.f157597a = aVar;
        }

        public final void run() {
            this.f157597a.mo211606a();
        }
    }

    /* renamed from: e */
    public final void mo216370e() {
        AbstractC61222a aVar = this.f157592k;
        if (aVar != null) {
            aVar.dismiss();
        }
    }

    /* renamed from: g */
    private final void m244832g() {
        VcBizSender.m249303n(this.f157583b.mo212055d()).mo219889a(new C62602d(this));
    }

    /* renamed from: c */
    public final View mo216368c() {
        View inflate = LayoutInflater.from(this.f157591j).inflate(R.layout.interpretation_select_layout, (ViewGroup) null);
        Intrinsics.checkExpressionValueIsNotNull(inflate, "rootView");
        m244829a(inflate);
        return inflate;
    }

    @Override // com.ss.android.vc.meeting.basedialog.AbstractC61222a.AbstractC61223a
    public void bY_() {
        C61383d I;
        C61388g b;
        C61383d I2;
        C61381c a;
        C61303k kVar = this.f157583b;
        if (!(kVar == null || (I2 = kVar.mo212091I()) == null || (a = I2.mo212490a()) == null)) {
            a.mo212470b(this);
        }
        C61303k kVar2 = this.f157583b;
        if (kVar2 != null && (I = kVar2.mo212091I()) != null && (b = I.mo212494b()) != null) {
            b.mo212597b(this);
        }
    }

    /* renamed from: d */
    public final void mo216369d() {
        AbstractC61222a a = C61949d.m242019a(this.f157591j, this.f157583b, false);
        if (a instanceof C61948c) {
            ((C61948c) a).mo214483a(this.f157592k);
        } else if (a instanceof InterpretationManageDesktopDialog) {
            ((InterpretationManageDesktopDialog) a).mo214480a(this.f157592k);
        }
        C60735ab.m236002a(new RunnableC62603e(a), 200);
    }

    /* renamed from: f */
    private final void m244831f() {
        List<LanguageType> list;
        VideoChat e;
        VideoChatSettings videoChatSettings;
        C61303k kVar = this.f157583b;
        if (kVar == null || (e = kVar.mo212056e()) == null || (videoChatSettings = e.getVideoChatSettings()) == null) {
            list = null;
        } else {
            list = videoChatSettings.getMeetingSupportLanguages();
        }
        if (list != null) {
            List<LanguageType> b = m244830b(C69121n.m265989f(list));
            if (b != null && b.size() > 0) {
                C61983j jVar = new C61983j(this.f157591j, this.f157583b, this, b);
                this.f157586e = jVar;
                ListView listView = this.f157584c;
                if (listView != null) {
                    listView.setAdapter((ListAdapter) jVar);
                    return;
                }
                return;
            }
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type kotlin.collections.MutableList<com.ss.android.vc.entity.LanguageType>");
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/vc/meeting/module/setting/settingdialog/SelectInterpretationViewHolder$init$1", "Landroid/view/View$OnClickListener;", "onClick", "", "v", "Landroid/view/View;", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.meeting.module.o.a.p$a */
    public static final class View$OnClickListenerC62599a implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ SelectInterpretationViewHolder f157593a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        View$OnClickListenerC62599a(SelectInterpretationViewHolder pVar) {
            this.f157593a = pVar;
        }

        public void onClick(View view) {
            this.f157593a.mo216370e();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/vc/meeting/module/setting/settingdialog/SelectInterpretationViewHolder$init$2", "Lcom/ss/android/lark/widget/listener/OnSingleClickListener;", "onSingleClick", "", "v", "Landroid/view/View;", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.meeting.module.o.a.p$b */
    public static final class C62600b extends OnSingleClickListener {

        /* renamed from: a */
        final /* synthetic */ SelectInterpretationViewHolder f157594a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C62600b(SelectInterpretationViewHolder pVar) {
            this.f157594a = pVar;
        }

        @Override // com.ss.android.lark.widget.listener.OnSingleClickListener
        public void onSingleClick(View view) {
            this.f157594a.mo216369d();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0012\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0016J\u0012\u0010\u0007\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\t"}, d2 = {"com/ss/android/vc/meeting/module/setting/settingdialog/SelectInterpretationViewHolder$loadSuiteQuota$1", "Lcom/ss/android/vc/net/request/IVcGetDataCallback;", "Lcom/ss/android/vc/entity/response/GetSuiteQuotaEntity;", "onError", "", "error", "Lcom/ss/android/vc/net/request/VcErrorResult;", "onSuccess", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.meeting.module.o.a.p$d */
    public static final class C62602d implements AbstractC63598b<C60987v> {

        /* renamed from: a */
        final /* synthetic */ SelectInterpretationViewHolder f157596a;

        @Override // com.ss.android.vc.net.request.AbstractC63598b
        public void onError(C63602e eVar) {
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C62602d(SelectInterpretationViewHolder pVar) {
            this.f157596a = pVar;
        }

        /* renamed from: a */
        public void onSuccess(C60987v vVar) {
            Participant participant;
            C61383d I;
            C61388g b;
            if (C60752f.m236082b(vVar)) {
                String a = this.f157596a.mo216367a();
                C60700b.m235851b(a, "[loadSuiteQuota]", "interpretation = " + vVar.f152724b);
                C61303k kVar = this.f157596a.f157583b;
                if (kVar == null || (I = kVar.mo212091I()) == null || (b = I.mo212494b()) == null) {
                    participant = null;
                } else {
                    participant = b.mo212605j();
                }
                if (participant == null || !participant.is_host() || participant.isGuest() || !vVar.f152724b) {
                    View view = this.f157596a.f157582a;
                    if (view != null) {
                        C60752f.m236083c(view);
                        return;
                    }
                    return;
                }
                View view2 = this.f157596a.f157582a;
                if (view2 != null) {
                    C60752f.m236079a(view2);
                    return;
                }
                return;
            }
            C60700b.m235851b(this.f157596a.mo216367a(), "[loadSuiteQuota2]", "entity = null ");
        }
    }

    @Override // com.ss.android.vc.meeting.model.C61381c.AbstractC61382a
    public void h_(boolean z) {
        if (!z) {
            mo216370e();
        }
    }

    /* renamed from: b */
    private final List<LanguageType> m244830b(List<LanguageType> list) {
        LanguageType languageType;
        AbstractC61417a W;
        AbstractC61935a x;
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(list);
        C61303k kVar = this.f157583b;
        if (kVar == null || (W = kVar.mo212105W()) == null || (x = W.mo212845x()) == null) {
            languageType = null;
        } else {
            languageType = x.mo214447d();
        }
        if (languageType == null) {
            Intrinsics.throwNpe();
        }
        arrayList.add(0, languageType);
        return arrayList;
    }

    @Override // com.ss.android.vc.meeting.module.interpretation.ILanguageSelectListener
    /* renamed from: a */
    public void mo214516a(int i) {
        ListAdapter listAdapter;
        boolean z;
        LineHeightTextView lineHeightTextView = this.f157589h;
        boolean z2 = true;
        if (lineHeightTextView != null) {
            if (i != 0) {
                z = true;
            } else {
                z = false;
            }
            lineHeightTextView.setEnabled(z);
        }
        LKUISwitchButton lKUISwitchButton = this.f157588g;
        if (lKUISwitchButton != null) {
            if (i == 0) {
                z2 = false;
            }
            lKUISwitchButton.setEnabled(z2);
        }
        ListView listView = this.f157584c;
        C61983j jVar = null;
        if (listView != null) {
            listAdapter = listView.getAdapter();
        } else {
            listAdapter = null;
        }
        if (listAdapter instanceof C61983j) {
            jVar = listAdapter;
        }
        C61983j jVar2 = jVar;
        if (jVar2 != null) {
            jVar2.notifyDataSetChanged();
        }
    }

    @Override // com.ss.android.vc.meeting.model.C61381c.AbstractC61382a
    /* renamed from: a */
    public void mo212486a(List<? extends LanguageType> list) {
        Intrinsics.checkParameterIsNotNull(list, "supportLanguages");
        List<LanguageType> b = m244830b(C69121n.m265989f(list));
        C61983j jVar = this.f157586e;
        if (jVar != null) {
            jVar.mo214565a(b);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:42:0x0108  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x010f  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m244829a(android.view.View r3) {
        /*
        // Method dump skipped, instructions count: 319
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.vc.meeting.module.setting.settingdialog.SelectInterpretationViewHolder.m244829a(android.view.View):void");
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "buttonView", "Landroid/widget/CompoundButton;", "kotlin.jvm.PlatformType", "isChecked", "", "onCheckedChanged"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.meeting.module.o.a.p$c */
    public static final class C62601c implements CompoundButton.OnCheckedChangeListener {

        /* renamed from: a */
        final /* synthetic */ SelectInterpretationViewHolder f157595a;

        C62601c(SelectInterpretationViewHolder pVar) {
            this.f157595a = pVar;
        }

        public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            AbstractC61935a aB = this.f157595a.f157583b.aB();
            Intrinsics.checkExpressionValueIsNotNull(aB, "meeting.interpretationControl");
            aB.mo214448d(z);
            C63742at.m250079b(this.f157595a.f157583b.mo212056e(), z);
        }
    }

    @Override // com.ss.android.vc.meeting.model.C61388g.AbstractC61393a
    /* renamed from: a */
    public void mo212620a(Participant participant, Participant participant2) {
        boolean z;
        if (participant2 != null) {
            z = participant2.is_host();
        } else {
            z = false;
        }
        if (z) {
            m244832g();
            return;
        }
        View view = this.f157582a;
        if (view != null) {
            C60752f.m236083c(view);
        }
    }

    public SelectInterpretationViewHolder(Activity activity, C61303k kVar, AbstractC61222a aVar) {
        Intrinsics.checkParameterIsNotNull(activity, "activity");
        Intrinsics.checkParameterIsNotNull(kVar, "meeting");
        Intrinsics.checkParameterIsNotNull(aVar, "dialog");
        this.f157591j = activity;
        this.f157583b = kVar;
        this.f157592k = aVar;
    }
}
