package com.ss.android.vc.meeting.module.lobby;

import android.text.TextUtils;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.larksuite.component.ui.imageview.LKUIRoundedImageView;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.thread.C26171w;
import com.larksuite.suite.R;
import com.ss.android.lark.chat.export.entity.chatter.OpenChatter;
import com.ss.android.vc.common.p3077b.C60700b;
import com.ss.android.vc.common.p3083e.C60783v;
import com.ss.android.vc.entity.ParticipantType;
import com.ss.android.vc.service.XIGetDataCallback;
import com.ss.android.vcxp.annotation.XMethod;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0017J\u0012\u0010\u0007\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0017¨\u0006\t"}, d2 = {"com/ss/android/vc/meeting/module/lobby/MeetingLobbyFragment$showAvatarView$1", "Lcom/ss/android/vc/service/XIGetDataCallback;", "Lcom/ss/android/lark/chat/export/entity/chatter/OpenChatter;", "onError", "", "errorResult", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onSuccess", "chatter", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
public final class MeetingLobbyFragment$showAvatarView$1 extends XIGetDataCallback<OpenChatter> {

    /* renamed from: a */
    final /* synthetic */ MeetingLobbyFragment f156048a;

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.meeting.module.lobby.MeetingLobbyFragment$showAvatarView$1$a */
    public static final class RunnableC62118a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ MeetingLobbyFragment$showAvatarView$1 f156049a;

        RunnableC62118a(MeetingLobbyFragment$showAvatarView$1 meetingLobbyFragment$showAvatarView$1) {
            this.f156049a = meetingLobbyFragment$showAvatarView$1;
        }

        public final void run() {
            ConstraintLayout constraintLayout = (ConstraintLayout) this.f156049a.f156048a.mo214952a(R.id.avatarLayout);
            if (constraintLayout != null) {
                constraintLayout.setVisibility(0);
            }
            LKUIRoundedImageView lKUIRoundedImageView = (LKUIRoundedImageView) this.f156049a.f156048a.mo214952a(R.id.avatarView);
            if (lKUIRoundedImageView != null) {
                lKUIRoundedImageView.setVisibility(0);
            }
        }
    }

    /* JADX WARN: Incorrect args count in method signature: ()V */
    MeetingLobbyFragment$showAvatarView$1(MeetingLobbyFragment fVar) {
        this.f156048a = fVar;
    }

    @Override // com.larksuite.framework.callback.IGetDataCallback
    @XMethod
    public void onError(ErrorResult errorResult) {
        Intrinsics.checkParameterIsNotNull(errorResult, "errorResult");
        C60700b.m235864f("MeetingLobbyFragment", "[getLoginChatter2]", "async onError: " + errorResult);
    }

    @XMethod
    public void onSuccess(OpenChatter openChatter) {
        String str;
        C60700b.m235851b("MeetingLobbyFragment", "[getLoginChatter]", "async success");
        if (((ConstraintLayout) this.f156048a.mo214952a(R.id.avatarLayout)) != null) {
            if (openChatter != null) {
                str = openChatter.getAvatarKey();
            } else {
                str = null;
            }
            if (!TextUtils.isEmpty(str)) {
                C26171w.m94675a(new RunnableC62118a(this));
                if (openChatter == null) {
                    Intrinsics.throwNpe();
                }
                C60783v.m236230a(openChatter.getAvatarKey(), openChatter.getId(), ParticipantType.LARK_USER, (LKUIRoundedImageView) this.f156048a.mo214952a(R.id.avatarView), 160, 160);
            }
        }
    }
}
