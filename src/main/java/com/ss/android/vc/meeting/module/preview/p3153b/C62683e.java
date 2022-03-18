package com.ss.android.vc.meeting.module.preview.p3153b;

import android.view.View;
import com.larksuite.suite.R;
import com.ss.android.lark.base.fragment.BaseFragment;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.vc.common.widget.avatarlist.VcPreviewAvatarListView;
import com.ss.android.vc.entity.VideoChat;
import com.ss.android.vc.meeting.module.preview.AbstractC62715f;
import com.ss.android.vc.meeting.module.preview.AbstractC62746h;
import com.ss.android.vc.meeting.module.preview.C62725g;
import com.ss.android.vc.meeting.module.preview.p3153b.C62670a;
import java.util.HashMap;

/* renamed from: com.ss.android.vc.meeting.module.preview.b.e */
public class C62683e extends AbstractC62715f<C62670a.AbstractC62673b.AbstractC62674a> implements C62670a.AbstractC62673b {

    /* renamed from: Q */
    protected VcPreviewAvatarListView f157733Q;

    /* access modifiers changed from: protected */
    @Override // com.ss.android.vc.meeting.module.preview.AbstractC62715f
    /* renamed from: x */
    public void mo216580x() {
        super.mo216580x();
        m245201C();
    }

    /* renamed from: C */
    private void m245201C() {
        this.f157824g.setVisibility(0);
        this.f157824g.setHint("");
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.vc.meeting.module.preview.AbstractC62715f
    /* renamed from: s */
    public void mo216579s() {
        super.mo216579s();
        if (this.f157822e != null) {
            this.f157733Q = (VcPreviewAvatarListView) this.f157822e.findViewById(R.id.meeting_avatar_list);
        }
    }

    @Override // com.ss.android.vc.meeting.module.preview.AbstractC62715f, com.ss.android.vc.meeting.module.preview.AbstractC62650a.AbstractC62653b
    /* renamed from: a */
    public void mo216526a(VideoChat videoChat) {
        super.mo216526a(videoChat);
        if (videoChat != null) {
            if (videoChat.getVideoChatSettings() != null) {
                String topic = videoChat.getVideoChatSettings().getTopic();
                if (videoChat.getMeetingSource() == VideoChat.MeetingSource.VC_FROM_INTERVIEW) {
                    HashMap hashMap = new HashMap();
                    hashMap.put("name", topic);
                    topic = UIHelper.mustacheFormat(this.f157818a.getResources().getString(R.string.View_M_VideoInterviewNameBraces), hashMap);
                }
                this.f157824g.setText(mo216682b(topic));
            }
            if (videoChat.getParticipants() != null && videoChat.getParticipants().size() >= 1) {
                this.f157733Q.setVisibility(0);
                this.f157733Q.mo208618a(videoChat.getId(), videoChat.getParticipants());
                this.f157733Q.setOnClickListener(new View.OnClickListener() {
                    /* class com.ss.android.vc.meeting.module.preview.p3153b.$$Lambda$e$huMY0bc5qqV7G8XKYc8YsGbTz8 */

                    public final void onClick(View view) {
                        C62683e.m245202a(VideoChat.this, view);
                    }
                });
            }
        }
    }

    C62683e(BaseFragment baseFragment, AbstractC62746h hVar) {
        super(baseFragment, hVar);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ void m245202a(VideoChat videoChat, View view) {
        C62725g.m245472a(videoChat.getId(), videoChat.getSponsorUser(), videoChat.getVideoChatSettings().getTopic(), videoChat.getParticipants());
    }
}
