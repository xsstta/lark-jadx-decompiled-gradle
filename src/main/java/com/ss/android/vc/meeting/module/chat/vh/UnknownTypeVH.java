package com.ss.android.vc.meeting.module.chat.vh;

import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.firebase.messaging.Constants;
import com.larksuite.component.ui.imageview.LKUIRoundedImageView;
import com.larksuite.suite.R;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.lark.widget.listener.OnSingleClickListener;
import com.ss.android.vc.common.p3083e.C60773o;
import com.ss.android.vc.common.p3083e.C60774p;
import com.ss.android.vc.common.p3083e.C60783v;
import com.ss.android.vc.common.widget.LineHeightTextView;
import com.ss.android.vc.dependency.VideoChatModuleDependency;
import com.ss.android.vc.dependency.aj;
import com.ss.android.vc.entity.ByteviewUser;
import com.ss.android.vc.entity.ParticipantRole;
import com.ss.android.vc.entity.ParticipantType;
import com.ss.android.vc.meeting.framework.meeting.C61303k;
import com.ss.android.vc.meeting.model.C61383d;
import com.ss.android.vc.meeting.module.reaction.entity.InteractionMessage;
import com.ss.android.vc.meeting.utils.C63496i;
import com.ss.android.vc.meeting.utils.C63497j;
import java.util.TimeZone;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0016\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\r"}, d2 = {"Lcom/ss/android/vc/meeting/module/chat/vh/UnknownTypeVH;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "view", "Landroid/view/View;", "(Landroid/view/View;)V", "getView", "()Landroid/view/View;", "bindView", "", "meeting", "Lcom/ss/android/vc/meeting/framework/meeting/Meeting;", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Lcom/ss/android/vc/meeting/module/reaction/entity/InteractionMessage;", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.vc.meeting.module.chat.b.c */
public final class UnknownTypeVH extends RecyclerView.ViewHolder {

    /* renamed from: a */
    private final View f154469a;

    /* renamed from: a */
    public final View mo213399a() {
        return this.f154469a;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public UnknownTypeVH(View view) {
        super(view);
        Intrinsics.checkParameterIsNotNull(view, "view");
        this.f154469a = view;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/vc/meeting/module/chat/vh/UnknownTypeVH$bindView$1", "Lcom/ss/android/lark/widget/listener/OnSingleClickListener;", "onSingleClick", "", "v", "Landroid/view/View;", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.meeting.module.chat.b.c$a */
    public static final class C61575a extends OnSingleClickListener {

        /* renamed from: a */
        final /* synthetic */ UnknownTypeVH f154470a;

        /* renamed from: b */
        final /* synthetic */ InteractionMessage f154471b;

        /* renamed from: c */
        final /* synthetic */ C61303k f154472c;

        @Override // com.ss.android.lark.widget.listener.OnSingleClickListener
        public void onSingleClick(View view) {
            ByteviewUser byteviewUser = new ByteviewUser(this.f154471b.mo216916c().mo216940a(), this.f154471b.mo216916c().mo216941b(), ParticipantType.valueOf(this.f154471b.mo216916c().mo216944e().getNumber()));
            if (C63497j.m248860d(this.f154472c, byteviewUser)) {
                C63497j.m248853a(C60773o.m236124b(this.f154470a.mo213399a().getContext()), this.f154472c, byteviewUser);
            }
        }

        C61575a(UnknownTypeVH cVar, InteractionMessage aVar, C61303k kVar) {
            this.f154470a = cVar;
            this.f154471b = aVar;
            this.f154472c = kVar;
        }
    }

    /* renamed from: a */
    public final void mo213400a(C61303k kVar, InteractionMessage aVar) {
        Intrinsics.checkParameterIsNotNull(kVar, "meeting");
        Intrinsics.checkParameterIsNotNull(aVar, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
        TextView textView = (TextView) this.f154469a.findViewById(R.id.chat_content);
        Intrinsics.checkExpressionValueIsNotNull(textView, "view.chat_content");
        textView.setText(UIHelper.getString(R.string.View_M_UnknownMessageType));
        if (!C63496i.m248851e(kVar) || aVar.mo216916c().mo216946f() != ParticipantRole.INTERVIEWER) {
            C60783v.m236230a(aVar.mo216916c().mo216943d(), aVar.mo216916c().mo216940a(), ParticipantType.valueOf(aVar.mo216916c().mo216944e().getNumber()), (LKUIRoundedImageView) this.f154469a.findViewById(R.id.chat_avatar), 28, 28);
            LineHeightTextView lineHeightTextView = (LineHeightTextView) this.f154469a.findViewById(R.id.chat_username);
            Intrinsics.checkExpressionValueIsNotNull(lineHeightTextView, "view.chat_username");
            lineHeightTextView.setText(aVar.mo216916c().mo216942c());
        } else {
            C60783v.m236226a((int) R.drawable.icon_interviewer_avatar, (LKUIRoundedImageView) this.f154469a.findViewById(R.id.chat_avatar));
            ((LineHeightTextView) this.f154469a.findViewById(R.id.chat_username)).setText(R.string.View_M_Interviewer);
        }
        C61383d I = kVar.mo212091I();
        Intrinsics.checkExpressionValueIsNotNull(I, "meeting.meetingData");
        I.mo212494b().mo212589a(aVar.mo216916c().mo216940a(), ParticipantType.forNumber(aVar.mo216916c().mo216944e().getNumber()), aVar.mo216916c().mo216941b());
        aj settingDependency = VideoChatModuleDependency.getSettingDependency();
        Intrinsics.checkExpressionValueIsNotNull(settingDependency, "VideoChatModuleDependency.getSettingDependency()");
        String a = C60774p.m236132a(Long.parseLong(aVar.mo216921f()), settingDependency.is24Hour(), TimeZone.getDefault());
        TextView textView2 = (TextView) this.f154469a.findViewById(R.id.chat_time);
        Intrinsics.checkExpressionValueIsNotNull(textView2, "view.chat_time");
        textView2.setText(a);
        ((LKUIRoundedImageView) this.f154469a.findViewById(R.id.chat_avatar)).setOnClickListener(new C61575a(this, aVar, kVar));
    }
}
