package com.ss.android.vc.meeting.module.preview.launch;

import android.os.Bundle;
import android.text.TextUtils;
import com.ss.android.lark.base.fragment.BaseFragment;
import com.ss.android.vc.dependency.VideoChatModuleDependency;
import com.ss.android.vc.meeting.module.preview.AbstractC62684c;
import com.ss.android.vc.meeting.module.preview.AbstractC62746h;
import com.ss.android.vc.net.service.ChatInfo;
import com.ss.android.vc.net.service.ChatInfoService;
import com.ss.android.vc.net.service.GetChatInfoListener;
import com.ss.android.vc.net.service.GetUserInfoListener;
import com.ss.android.vc.net.service.UserInfoService;
import com.ss.android.vc.net.service.VideoChatUser;
import com.ss.android.vc.statistics.event.bq;

/* renamed from: com.ss.android.vc.meeting.module.preview.launch.b */
public class C62765b extends AbstractC62684c<C62766c> {

    /* renamed from: f */
    private String f157904f;

    /* renamed from: g */
    private String f157905g;

    /* access modifiers changed from: protected */
    @Override // com.ss.android.vc.meeting.module.preview.AbstractC62684c
    /* renamed from: e */
    public String mo216564e() {
        return "发起会议";
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.vc.meeting.module.preview.AbstractC62684c
    /* renamed from: d */
    public void mo216563d() {
        bq.m250211c(this.f157904f, this.f157736c);
    }

    @Override // androidx.fragment.app.Fragment, com.ss.android.vc.meeting.module.preview.AbstractC62684c
    public void onResume() {
        super.onResume();
        ((C62766c) this.f157735b).mo216777p();
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m245601a(ChatInfo chatInfo) {
        this.f157905g = chatInfo.getName();
        if (this.f157735b != null) {
            ((C62766c) this.f157735b).mo216773b(this.f157905g);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m245602a(VideoChatUser videoChatUser) {
        this.f157905g = videoChatUser.getName();
        if (this.f157735b != null) {
            ((C62766c) this.f157735b).mo216773b(this.f157905g);
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.vc.meeting.module.preview.AbstractC62684c
    /* renamed from: a */
    public boolean mo216587a(Bundle bundle) {
        if (!super.mo216587a(bundle)) {
            return false;
        }
        String string = bundle.getString("param_launch_chat_id");
        this.f157904f = string;
        if (TextUtils.isEmpty(string) || this.f157904f.equals("0")) {
            UserInfoService.getChatterById(VideoChatModuleDependency.m236630c(), new GetUserInfoListener() {
                /* class com.ss.android.vc.meeting.module.preview.launch.$$Lambda$b$fR98eZDbuoODRQy7xeDa8pc2uo */

                @Override // com.ss.android.vc.net.service.GetUserInfoListener
                public final void onGetUserInfo(VideoChatUser videoChatUser) {
                    C62765b.this.m245602a((C62765b) videoChatUser);
                }
            });
            return true;
        }
        ChatInfoService.getChatById(this.f157904f, new GetChatInfoListener() {
            /* class com.ss.android.vc.meeting.module.preview.launch.$$Lambda$b$Fu3nPyxTarvhFyotMy8XXofU1CI */

            @Override // com.ss.android.vc.net.service.GetChatInfoListener
            public final void onGetChatInfo(ChatInfo chatInfo) {
                C62765b.this.m245601a((C62765b) chatInfo);
            }
        });
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public C62766c mo216560a(BaseFragment baseFragment, AbstractC62746h hVar) {
        return new C62766c(baseFragment, hVar, this.f157904f, this.f157905g);
    }
}
