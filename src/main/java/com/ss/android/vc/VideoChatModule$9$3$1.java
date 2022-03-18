package com.ss.android.vc;

import android.text.TextUtils;
import android.widget.FrameLayout;
import com.ss.android.lark.chat.export.entity.chat.OpenChat;
import com.ss.android.vc.VideoChatModule;
import com.ss.android.vc.common.p3083e.C60735ab;
import com.ss.android.vc.entity.response.IDTypeEntity;

public class VideoChatModule$9$3$1 implements VideoChatModule.IVideoChatStatusListener {

    /* renamed from: a */
    final /* synthetic */ VideoChatModule.AnonymousClass12.C606381 f151719a;

    VideoChatModule$9$3$1(VideoChatModule.AnonymousClass12.C606381 r1) {
        this.f151719a = r1;
    }

    @Override // com.ss.android.vc.VideoChatModule.IVideoChatStatusListener
    public void onMeetingStatusChanged(String str, IDTypeEntity iDTypeEntity, boolean z) {
        C60735ab.m236001a(new Runnable(r0, iDTypeEntity, str, r1, z) {
            /* class com.ss.android.vc.$$Lambda$VideoChatModule$9$3$1$TumvFcMmvtFQNWgDOqA4cMLEwlQ */
            public final /* synthetic */ FrameLayout f$1;
            public final /* synthetic */ IDTypeEntity f$2;
            public final /* synthetic */ String f$3;
            public final /* synthetic */ OpenChat f$4;
            public final /* synthetic */ boolean f$5;

            {
                this.f$1 = r2;
                this.f$2 = r3;
                this.f$3 = r4;
                this.f$4 = r5;
                this.f$5 = r6;
            }

            public final void run() {
                VideoChatModule$9$3$1.lambda$TumvFcMmvtFQNWgDOqA4cMLEwlQ(VideoChatModule$9$3$1.this, this.f$1, this.f$2, this.f$3, this.f$4, this.f$5);
            }
        });
    }

    /* access modifiers changed from: public */
    /* renamed from: a */
    private /* synthetic */ void m235731a(FrameLayout frameLayout, IDTypeEntity iDTypeEntity, String str, OpenChat openChat, boolean z) {
        frameLayout.setEnabled(true);
        if (iDTypeEntity == IDTypeEntity.GROUP_ID && TextUtils.equals(str, openChat.getId())) {
            VideoChatModule.AnonymousClass12.this.f151659a.mo211325a(z);
        }
    }
}
