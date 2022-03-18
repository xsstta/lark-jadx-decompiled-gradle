package com.ss.android.vc.meeting.module.subtitle.p3167b;

import android.text.TextUtils;
import android.util.SparseArray;
import android.view.View;
import com.larksuite.suite.R;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.vc.entity.ByteviewUser;
import com.ss.android.vc.entity.MeetingSubtitleData;
import com.ss.android.vc.meeting.framework.manager.MeetingUtil;
import com.ss.android.vc.meeting.module.subtitle.AbstractC63158f;
import com.ss.android.vc.meeting.module.subtitle.SubtitleModel2;
import com.ss.android.vc.net.service.GetUserInfoListener;
import com.ss.android.vc.net.service.UserInfoService;
import com.ss.android.vc.net.service.VideoChatUser;

/* renamed from: com.ss.android.vc.meeting.module.subtitle.b.e */
public class C63135e extends AbstractC63131b {
    /* renamed from: b */
    private void m247243b(ByteviewUser byteviewUser) {
        UserInfoService.getUserInfoById(this.f159096b, byteviewUser.getUserId(), byteviewUser.getParticipantType(), new GetUserInfoListener() {
            /* class com.ss.android.vc.meeting.module.subtitle.p3167b.$$Lambda$e$w3QhRpYYnyPCpw9tmTpyCo3Oefo */

            @Override // com.ss.android.vc.net.service.GetUserInfoListener
            public final void onGetUserInfo(VideoChatUser videoChatUser) {
                C63135e.lambda$w3QhRpYYnyPCpw9tmTpyCo3Oefo(C63135e.this, videoChatUser);
            }
        });
    }

    /* renamed from: c */
    private void m247245c(ByteviewUser byteviewUser) {
        UserInfoService.getUserInfoById(this.f159096b, byteviewUser.getUserId(), byteviewUser.getParticipantType(), new GetUserInfoListener() {
            /* class com.ss.android.vc.meeting.module.subtitle.p3167b.$$Lambda$e$HT2YomdaTwbT4CWpovgxwgfPVEE */

            @Override // com.ss.android.vc.net.service.GetUserInfoListener
            public final void onGetUserInfo(VideoChatUser videoChatUser) {
                C63135e.lambda$HT2YomdaTwbT4CWpovgxwgfPVEE(C63135e.this, videoChatUser);
            }
        });
    }

    /* renamed from: a */
    private void m247241a(ByteviewUser byteviewUser) {
        if (byteviewUser != null) {
            if (MeetingUtil.m238368a(this.f159096b, byteviewUser, MeetingUtil.IdType.DeviceId)) {
                this.f159100f.setText(UIHelper.mustacheFormat((int) R.string.View_G_TurnedOnSubtitlesNameBraces, "name", ""));
            } else {
                UserInfoService.getUserInfoById(this.f159096b, byteviewUser.getUserId(), byteviewUser.getParticipantType(), new GetUserInfoListener() {
                    /* class com.ss.android.vc.meeting.module.subtitle.p3167b.$$Lambda$e$D6vubRv62GxY1_NLo1ute0DT6jU */

                    @Override // com.ss.android.vc.net.service.GetUserInfoListener
                    public final void onGetUserInfo(VideoChatUser videoChatUser) {
                        C63135e.lambda$D6vubRv62GxY1_NLo1ute0DT6jU(C63135e.this, videoChatUser);
                    }
                });
            }
        }
    }

    /* access modifiers changed from: public */
    /* renamed from: b */
    private /* synthetic */ void m247244b(VideoChatUser videoChatUser) {
        String str;
        if (TextUtils.isEmpty(videoChatUser.getName())) {
            str = videoChatUser.getNickname();
        } else {
            str = videoChatUser.getName();
        }
        this.f159100f.setText(String.format("(%s)", UIHelper.mustacheFormat((int) R.string.View_G_StoppedScreenSharingNameBraces, "name", str)));
    }

    /* access modifiers changed from: public */
    /* renamed from: c */
    private /* synthetic */ void m247246c(VideoChatUser videoChatUser) {
        this.f159100f.setText(UIHelper.mustacheFormat((int) R.string.View_G_TurnedOnSubtitlesNameBraces, "name", ""));
    }

    /* access modifiers changed from: public */
    /* renamed from: a */
    private /* synthetic */ void m247242a(VideoChatUser videoChatUser) {
        String str;
        if (TextUtils.isEmpty(videoChatUser.getName())) {
            str = videoChatUser.getNickname();
        } else {
            str = videoChatUser.getName();
        }
        this.f159100f.setText(String.format("(%s)", UIHelper.mustacheFormat((int) R.string.View_G_StartedScreenSharingNameBraces, "name", str)));
    }

    @Override // com.ss.android.vc.meeting.module.subtitle.p3167b.AbstractC63131b
    /* renamed from: b */
    public void mo218593b(SubtitleModel2 subtitleModel2) {
        ByteviewUser byteviewUser = subtitleModel2.mSubtitleEvent.f152465b;
        if (subtitleModel2.mSubtitleEvent.f152464a == MeetingSubtitleData.SubtitleEvent.Type.TURN_SUBTITLE_ON) {
            m247241a(byteviewUser);
        } else if (subtitleModel2.mSubtitleEvent.f152464a == MeetingSubtitleData.SubtitleEvent.Type.START_SHARE_SCREEN) {
            m247245c(byteviewUser);
        } else if (subtitleModel2.mSubtitleEvent.f152464a == MeetingSubtitleData.SubtitleEvent.Type.STOP_SHARE_SCREEN) {
            m247243b(byteviewUser);
        }
    }

    public C63135e(View view, String str, SparseArray sparseArray, AbstractC63158f fVar) {
        super(view, str, sparseArray, fVar);
    }
}
