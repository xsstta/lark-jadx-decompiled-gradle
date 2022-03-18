package com.ss.android.vc.meeting.module.chat.vh;

import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.google.firebase.messaging.Constants;
import com.larksuite.component.ui.imageview.LKUIRoundedImageView;
import com.larksuite.component.universe_design.util.UDUiModeUtils;
import com.larksuite.suite.R;
import com.ss.android.floatbubble.C28460b;
import com.ss.android.lark.utils.C57782ag;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.lark.widget.listener.OnSingleClickListener;
import com.ss.android.lark.widget.richtext.RichText;
import com.ss.android.vc.common.p3077b.C60700b;
import com.ss.android.vc.common.p3083e.C60773o;
import com.ss.android.vc.common.p3083e.C60774p;
import com.ss.android.vc.common.p3083e.C60776r;
import com.ss.android.vc.common.p3083e.C60783v;
import com.ss.android.vc.common.utils.VCDialogUtils;
import com.ss.android.vc.common.widget.LineHeightTextView;
import com.ss.android.vc.common.widget.tag.ExternalTag;
import com.ss.android.vc.common.widget.tag.HostTag;
import com.ss.android.vc.dependency.AbstractC60890f;
import com.ss.android.vc.dependency.AbstractC60907u;
import com.ss.android.vc.dependency.AbstractC60914y;
import com.ss.android.vc.dependency.VideoChatModuleDependency;
import com.ss.android.vc.dependency.aj;
import com.ss.android.vc.entity.ByteviewUser;
import com.ss.android.vc.entity.Participant;
import com.ss.android.vc.entity.ParticipantRole;
import com.ss.android.vc.entity.ParticipantType;
import com.ss.android.vc.entity.VideoChat;
import com.ss.android.vc.meeting.framework.manager.MeetingUtil;
import com.ss.android.vc.meeting.framework.meeting.C61303k;
import com.ss.android.vc.meeting.model.C61383d;
import com.ss.android.vc.meeting.model.C61388g;
import com.ss.android.vc.meeting.module.floatingwindow.AbstractC61728a;
import com.ss.android.vc.meeting.module.reaction.entity.InteractionMessage;
import com.ss.android.vc.meeting.module.reaction.entity.TextContent;
import com.ss.android.vc.meeting.module.reaction.entity.VideoChatParticipant;
import com.ss.android.vc.meeting.module.reaction.livewidget.VCLinkEmojiTextView;
import com.ss.android.vc.meeting.module.reaction.livewidget.VCRichTextView;
import com.ss.android.vc.meeting.utils.C63497j;
import com.ss.android.vc.meeting.utils.ParticipantUtil;
import java.util.TimeZone;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0016\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fR\u000e\u0010\u0005\u001a\u00020\u0006XD¢\u0006\u0002\n\u0000R\u001a\u0010\u0002\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\u0004¨\u0006\u0010"}, d2 = {"Lcom/ss/android/vc/meeting/module/chat/vh/NormalMessageVH;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "view", "Landroid/view/View;", "(Landroid/view/View;)V", "TAG", "", "getView", "()Landroid/view/View;", "setView", "bindView", "", "meeting", "Lcom/ss/android/vc/meeting/framework/meeting/Meeting;", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Lcom/ss/android/vc/meeting/module/reaction/entity/InteractionMessage;", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.vc.meeting.module.chat.b.a */
public final class NormalMessageVH extends RecyclerView.ViewHolder {

    /* renamed from: a */
    private final String f154459a = "NormalMessageVH";

    /* renamed from: b */
    private View f154460b;

    /* renamed from: a */
    public final View mo213391a() {
        return this.f154460b;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0018\u0010\b\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\n"}, d2 = {"com/ss/android/vc/meeting/module/chat/vh/NormalMessageVH$bindView$1", "Lcom/ss/android/vc/meeting/module/reaction/livewidget/VCLinkEmojiTextView$IURLStringClickListener;", "onURLClick", "", "view", "Landroid/view/View;", "text", "", "onURLLongClick", "", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.meeting.module.chat.b.a$a */
    public static final class C61572a implements VCLinkEmojiTextView.AbstractC62815i {

        /* renamed from: a */
        final /* synthetic */ C61303k f154461a;

        @Override // com.ss.android.vc.meeting.module.reaction.livewidget.VCLinkEmojiTextView.AbstractC62815i
        /* renamed from: b */
        public boolean mo213394b(View view, String str) {
            Intrinsics.checkParameterIsNotNull(view, "view");
            Intrinsics.checkParameterIsNotNull(str, "text");
            return false;
        }

        C61572a(C61303k kVar) {
            this.f154461a = kVar;
        }

        @Override // com.ss.android.vc.meeting.module.reaction.livewidget.VCLinkEmojiTextView.AbstractC62815i
        /* renamed from: a */
        public void mo213393a(View view, String str) {
            long j;
            Intrinsics.checkParameterIsNotNull(view, "view");
            Intrinsics.checkParameterIsNotNull(str, "text");
            if (!C60776r.m236157o()) {
                AbstractC60890f browserDependency = VideoChatModuleDependency.getBrowserDependency();
                if (browserDependency != null) {
                    browserDependency.openUrlBrowser(view.getContext(), str);
                }
            } else if (C28460b.m104296a(view.getContext())) {
                AbstractC60890f browserDependency2 = VideoChatModuleDependency.getBrowserDependency();
                if (browserDependency2 != null) {
                    browserDependency2.openUrlBrowser(view.getContext(), str);
                }
                Activity b = C60773o.m236124b(view.getContext());
                if (b != null) {
                    AbstractC61728a ae = this.f154461a.ae();
                    if (Build.VERSION.SDK_INT < 26) {
                        j = 1500;
                    } else {
                        j = (long) 800;
                    }
                    ae.mo213808a(b, j);
                }
            } else {
                Activity b2 = C60773o.m236124b(view.getContext());
                if (b2 != null) {
                    Activity activity = b2;
                    AbstractC60907u larkAppDependency = VideoChatModuleDependency.getLarkAppDependency();
                    Intrinsics.checkExpressionValueIsNotNull(larkAppDependency, "VideoChatModuleDependency.getLarkAppDependency()");
                    String mustacheFormat = UIHelper.mustacheFormat((int) R.string.View_G_PopupPermission, "appName", larkAppDependency.mo196409b());
                    Intrinsics.checkExpressionValueIsNotNull(mustacheFormat, "UIHelper.mustacheFormat(…Dependency().larkAppName)");
                    Resources resources = b2.getResources();
                    Intrinsics.checkExpressionValueIsNotNull(resources, "it.resources");
                    Configuration configuration = resources.getConfiguration();
                    Intrinsics.checkExpressionValueIsNotNull(configuration, "it.resources.configuration");
                    VCDialogUtils.m236160a((Context) activity, (int) R.string.View_N_FloatingWindowPermission, 1, mustacheFormat, (int) R.string.View_G_CancelButton, (int) R.string.View_G_ConfirmButton, false, UDUiModeUtils.m93320a(configuration));
                }
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NormalMessageVH(View view) {
        super(view);
        Intrinsics.checkParameterIsNotNull(view, "view");
        this.f154460b = view;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/vc/meeting/module/chat/vh/NormalMessageVH$bindView$2", "Lcom/ss/android/lark/widget/listener/OnSingleClickListener;", "onSingleClick", "", "v", "Landroid/view/View;", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.meeting.module.chat.b.a$b */
    public static final class C61573b extends OnSingleClickListener {

        /* renamed from: a */
        final /* synthetic */ NormalMessageVH f154462a;

        /* renamed from: b */
        final /* synthetic */ InteractionMessage f154463b;

        /* renamed from: c */
        final /* synthetic */ C61303k f154464c;

        @Override // com.ss.android.lark.widget.listener.OnSingleClickListener
        public void onSingleClick(View view) {
            ByteviewUser byteviewUser = new ByteviewUser(this.f154463b.mo216916c().mo216940a(), this.f154463b.mo216916c().mo216941b(), ParticipantType.valueOf(this.f154463b.mo216916c().mo216944e().getNumber()));
            if (C63497j.m248860d(this.f154464c, byteviewUser)) {
                C63497j.m248853a(C60773o.m236124b(this.f154462a.mo213391a().getContext()), this.f154464c, byteviewUser);
            }
        }

        C61573b(NormalMessageVH aVar, InteractionMessage aVar2, C61303k kVar) {
            this.f154462a = aVar;
            this.f154463b = aVar2;
            this.f154464c = kVar;
        }
    }

    /* renamed from: a */
    public final void mo213392a(C61303k kVar, InteractionMessage aVar) {
        String str;
        RichText richText;
        boolean z;
        C61388g b;
        Intrinsics.checkParameterIsNotNull(kVar, "meeting");
        Intrinsics.checkParameterIsNotNull(aVar, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
        String str2 = this.f154459a;
        StringBuilder sb = new StringBuilder();
        sb.append("cid=");
        sb.append(aVar.mo216918d());
        sb.append(", userId=");
        VideoChatParticipant c = aVar.mo216916c();
        Participant participant = null;
        if (c != null) {
            str = c.mo216940a();
        } else {
            str = null;
        }
        sb.append(str);
        C60700b.m235851b(str2, "[bindView]", sb.toString());
        ((VCRichTextView) this.f154460b.findViewById(R.id.chat_content)).setFakeBoldText(false);
        ((VCRichTextView) this.f154460b.findViewById(R.id.chat_content)).setUrlTextColor(C60773o.m236126d(R.color.text_link_normal));
        ((VCRichTextView) this.f154460b.findViewById(R.id.chat_content)).setIsUrlShowUnderLine(false);
        ((VCRichTextView) this.f154460b.findViewById(R.id.chat_content)).setNeedToRecognizePhone(false);
        ((VCRichTextView) this.f154460b.findViewById(R.id.chat_content)).setUrlStringClickListner(new C61572a(kVar));
        VCRichTextView vCRichTextView = (VCRichTextView) this.f154460b.findViewById(R.id.chat_content);
        TextContent i = aVar.mo216925i();
        if (i != null) {
            richText = i.mo216936a();
        } else {
            richText = null;
        }
        vCRichTextView.setInfo(richText);
        String d = kVar.mo212055d();
        if (d != null) {
            z = MeetingUtil.m238368a(d, new ByteviewUser(aVar.mo216916c().mo216940a(), aVar.mo216916c().mo216941b(), ParticipantType.valueOf(aVar.mo216916c().mo216944e().getNumber())), MeetingUtil.IdType.DeviceId);
        } else {
            z = false;
        }
        if (z) {
            C60783v.m236226a((int) R.drawable.icon_interviewer_avatar, (LKUIRoundedImageView) this.f154460b.findViewById(R.id.chat_avatar));
            ((LineHeightTextView) this.f154460b.findViewById(R.id.chat_username)).setText(R.string.View_M_Interviewer);
        } else {
            C60783v.m236230a(aVar.mo216916c().mo216943d(), aVar.mo216916c().mo216940a(), ParticipantType.valueOf(aVar.mo216916c().mo216944e().getNumber()), (LKUIRoundedImageView) this.f154460b.findViewById(R.id.chat_avatar), 28, 28);
            LineHeightTextView lineHeightTextView = (LineHeightTextView) this.f154460b.findViewById(R.id.chat_username);
            Intrinsics.checkExpressionValueIsNotNull(lineHeightTextView, "view.chat_username");
            lineHeightTextView.setText(aVar.mo216916c().mo216942c());
        }
        C61383d I = kVar.mo212091I();
        if (!(I == null || (b = I.mo212494b()) == null)) {
            participant = b.mo212589a(aVar.mo216916c().mo216940a(), ParticipantType.forNumber(aVar.mo216916c().mo216944e().getNumber()), aVar.mo216916c().mo216941b());
        }
        if (ParticipantUtil.m248732c(participant)) {
            ((LineHeightTextView) this.f154460b.findViewById(R.id.chat_username)).append(UIHelper.getString(R.string.View_M_MeParentheses));
        } else if (aVar.mo216926j()) {
            ((LineHeightTextView) this.f154460b.findViewById(R.id.chat_username)).append(UIHelper.getString(R.string.View_M_GuestParentheses));
        }
        if (participant == null) {
            HostTag hostTag = (HostTag) this.f154460b.findViewById(R.id.chat_tag_host);
            Intrinsics.checkExpressionValueIsNotNull(hostTag, "view.chat_tag_host");
            hostTag.setVisibility(8);
        } else if (participant.is_host()) {
            if (participant.isGuest() || kVar.mo212098P() || (kVar.mo212090H() == VideoChat.MeetingSource.VC_FROM_INTERVIEW && participant.getParticipantRole() == ParticipantRole.INTERVIEWEE)) {
                HostTag hostTag2 = (HostTag) this.f154460b.findViewById(R.id.chat_tag_host);
                Intrinsics.checkExpressionValueIsNotNull(hostTag2, "view.chat_tag_host");
                hostTag2.setVisibility(8);
            } else {
                HostTag hostTag3 = (HostTag) this.f154460b.findViewById(R.id.chat_tag_host);
                Intrinsics.checkExpressionValueIsNotNull(hostTag3, "view.chat_tag_host");
                hostTag3.setText(UIHelper.getString(R.string.View_M_Host));
                HostTag hostTag4 = (HostTag) this.f154460b.findViewById(R.id.chat_tag_host);
                Intrinsics.checkExpressionValueIsNotNull(hostTag4, "view.chat_tag_host");
                hostTag4.setVisibility(0);
            }
        } else if (!participant.isCoHost()) {
            HostTag hostTag5 = (HostTag) this.f154460b.findViewById(R.id.chat_tag_host);
            Intrinsics.checkExpressionValueIsNotNull(hostTag5, "view.chat_tag_host");
            hostTag5.setVisibility(8);
        } else if (participant.isGuest() || kVar.mo212098P() || (kVar.mo212090H() == VideoChat.MeetingSource.VC_FROM_INTERVIEW && participant.getParticipantRole() == ParticipantRole.INTERVIEWEE)) {
            HostTag hostTag6 = (HostTag) this.f154460b.findViewById(R.id.chat_tag_host);
            Intrinsics.checkExpressionValueIsNotNull(hostTag6, "view.chat_tag_host");
            hostTag6.setVisibility(8);
        } else {
            HostTag hostTag7 = (HostTag) this.f154460b.findViewById(R.id.chat_tag_host);
            Intrinsics.checkExpressionValueIsNotNull(hostTag7, "view.chat_tag_host");
            hostTag7.setText(UIHelper.getString(R.string.View_M_CoHost));
            HostTag hostTag8 = (HostTag) this.f154460b.findViewById(R.id.chat_tag_host);
            Intrinsics.checkExpressionValueIsNotNull(hostTag8, "view.chat_tag_host");
            hostTag8.setVisibility(0);
        }
        if (aVar.mo216926j() || aVar.mo216927k() == -1 || aVar.mo216916c().mo216947g()) {
            ExternalTag externalTag = (ExternalTag) this.f154460b.findViewById(R.id.externalTag);
            Intrinsics.checkExpressionValueIsNotNull(externalTag, "view.externalTag");
            externalTag.setVisibility(8);
        } else {
            AbstractC60914y loginDependency = VideoChatModuleDependency.getLoginDependency();
            Intrinsics.checkExpressionValueIsNotNull(loginDependency, "VideoChatModuleDependency.getLoginDependency()");
            boolean c2 = loginDependency.mo196421c();
            boolean e = VideoChatModuleDependency.m236632e();
            String d2 = VideoChatModuleDependency.m236631d();
            if (!e || c2 || C57782ag.m224242a(d2, String.valueOf(aVar.mo216927k()))) {
                ExternalTag externalTag2 = (ExternalTag) this.f154460b.findViewById(R.id.externalTag);
                Intrinsics.checkExpressionValueIsNotNull(externalTag2, "view.externalTag");
                externalTag2.setVisibility(8);
            } else {
                ExternalTag externalTag3 = (ExternalTag) this.f154460b.findViewById(R.id.externalTag);
                Intrinsics.checkExpressionValueIsNotNull(externalTag3, "view.externalTag");
                externalTag3.setVisibility(0);
            }
        }
        aj settingDependency = VideoChatModuleDependency.getSettingDependency();
        Intrinsics.checkExpressionValueIsNotNull(settingDependency, "VideoChatModuleDependency.getSettingDependency()");
        String a = C60774p.m236132a(Long.parseLong(aVar.mo216921f()), settingDependency.is24Hour(), TimeZone.getDefault());
        LineHeightTextView lineHeightTextView2 = (LineHeightTextView) this.f154460b.findViewById(R.id.chat_time);
        Intrinsics.checkExpressionValueIsNotNull(lineHeightTextView2, "view.chat_time");
        lineHeightTextView2.setText(a);
        ((LKUIRoundedImageView) this.f154460b.findViewById(R.id.chat_avatar)).setOnClickListener(new C61573b(this, aVar, kVar));
    }
}
