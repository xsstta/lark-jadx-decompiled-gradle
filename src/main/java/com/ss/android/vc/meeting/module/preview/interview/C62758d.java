package com.ss.android.vc.meeting.module.preview.interview;

import android.view.View;
import com.larksuite.suite.R;
import com.ss.android.lark.base.fragment.BaseFragment;
import com.ss.android.vc.common.widget.avatarlist.VcPreviewAvatarListView;
import com.ss.android.vc.entity.VideoChat;
import com.ss.android.vc.meeting.module.preview.AbstractC62715f;
import com.ss.android.vc.meeting.module.preview.AbstractC62746h;
import com.ss.android.vc.meeting.module.preview.C62725g;
import com.ss.android.vc.meeting.module.preview.interview.C62747a;

/* renamed from: com.ss.android.vc.meeting.module.preview.interview.d */
public class C62758d extends AbstractC62715f<C62747a.AbstractC62750b.AbstractC62751a> implements C62747a.AbstractC62750b {

    /* renamed from: Q */
    protected VcPreviewAvatarListView f157897Q;

    /* access modifiers changed from: protected */
    @Override // com.ss.android.vc.meeting.module.preview.AbstractC62715f
    /* renamed from: s */
    public void mo216579s() {
        super.mo216579s();
        if (this.f157822e != null) {
            this.f157897Q = (VcPreviewAvatarListView) this.f157822e.findViewById(R.id.meeting_avatar_list);
        }
    }

    @Override // com.ss.android.vc.meeting.module.preview.AbstractC62715f, com.ss.android.vc.meeting.module.preview.AbstractC62650a.AbstractC62653b
    /* renamed from: a */
    public void mo216526a(VideoChat videoChat) {
        super.mo216526a(videoChat);
        if (videoChat != null && videoChat.getParticipants() != null && videoChat.getParticipants().size() >= 1) {
            this.f157897Q.setVisibility(0);
            this.f157897Q.mo208618a(videoChat.getId(), videoChat.getParticipants());
            this.f157897Q.setOnClickListener(new View.OnClickListener() {
                /* class com.ss.android.vc.meeting.module.preview.interview.$$Lambda$d$VHhWBQGyW16UFJCd2HAxrRa9_Lo */

                public final void onClick(View view) {
                    C62758d.m245584a(VideoChat.this, view);
                }
            });
        }
    }

    C62758d(BaseFragment baseFragment, AbstractC62746h hVar) {
        super(baseFragment, hVar);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ void m245584a(VideoChat videoChat, View view) {
        C62725g.m245472a(videoChat.getId(), videoChat.getSponsorUser(), videoChat.getVideoChatSettings().getTopic(), videoChat.getParticipants());
    }
}
