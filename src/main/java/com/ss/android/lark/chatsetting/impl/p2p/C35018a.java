package com.ss.android.lark.chatsetting.impl.p2p;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import butterknife.ButterKnife;
import com.larksuite.suite.R;
import com.ss.android.lark.chat.entity.chat.Chat;
import com.ss.android.lark.chat.entity.chatter.Chatter;
import com.ss.android.lark.chat.entity.message.content.ProfileContent;
import com.ss.android.lark.chatsetting.ChatSettingModule;
import com.ss.android.lark.chatsetting.impl.p2p.P2pSettingView;
import com.ss.android.lark.chatsetting.impl.statistics.ChatSettingHitPointNew;
import com.ss.android.lark.chatsetting.p1693a.AbstractC34461c;
import com.ss.android.lark.desktopmode.p1787a.C36516a;
import com.ss.android.lark.log.Log;

/* renamed from: com.ss.android.lark.chatsetting.impl.p2p.a */
public class C35018a extends C36516a {

    /* renamed from: a */
    View f90361a;

    /* renamed from: b */
    Context f90362b;

    /* renamed from: c */
    public Chat f90363c;

    /* renamed from: d */
    public AbstractC34461c.AbstractC34480s f90364d = ChatSettingModule.m133639a().mo127280j();

    /* renamed from: e */
    public AbstractC34461c.AbstractC34472k f90365e = ChatSettingModule.m133639a().mo127276f();

    /* renamed from: f */
    P2pSettingView.AbstractC35017a f90366f = new P2pSettingView.AbstractC35017a() {
        /* class com.ss.android.lark.chatsetting.impl.p2p.C35018a.C350191 */

        @Override // com.ss.android.lark.chatsetting.impl.p2p.P2pSettingView.AbstractC35017a
        /* renamed from: b */
        public void mo129046b() {
            C35018a.this.finish();
        }

        @Override // com.ss.android.lark.chatsetting.impl.p2p.P2pSettingView.AbstractC35017a
        /* renamed from: c */
        public void mo129048c() {
            ChatSettingModule.m133639a().mo127265a(C35018a.this.f90362b);
        }

        @Override // com.ss.android.lark.chatsetting.impl.p2p.P2pSettingView.AbstractC35017a
        /* renamed from: a */
        public void mo129040a() {
            C35018a.this.setResult(-1, new Intent());
            C35018a.this.finish();
        }

        @Override // com.ss.android.lark.chatsetting.impl.p2p.P2pSettingView.AbstractC35017a
        /* renamed from: a */
        public void mo129044a(P2pSettingView p2pSettingView) {
            ButterKnife.bind(p2pSettingView, C35018a.this.f90361a);
        }

        @Override // com.ss.android.lark.chatsetting.impl.p2p.P2pSettingView.AbstractC35017a
        /* renamed from: b */
        public void mo129047b(String str) {
            Log.m165389i("ChatP2pSettingActivity", "bot id is " + str);
            C35018a.this.f90364d.mo127423a(C35018a.this.f90362b, str);
        }

        @Override // com.ss.android.lark.chatsetting.impl.p2p.P2pSettingView.AbstractC35017a
        /* renamed from: a */
        public void mo129043a(Chatter chatter) {
            ProfileContent profileContent = new ProfileContent();
            profileContent.setId(chatter.getId());
            profileContent.setDisplayName(chatter.getLocalizedName());
            profileContent.setAvatarKey(chatter.getAvatarKey());
            C35018a.this.f90365e.mo127398a(C35018a.this.f90362b, profileContent);
        }

        @Override // com.ss.android.lark.chatsetting.impl.p2p.P2pSettingView.AbstractC35017a
        /* renamed from: a */
        public void mo129045a(String str) {
            Log.m165389i("ChatP2pSettingActivity", "chatter id is " + str);
            C35018a.this.f90364d.mo127424a(C35018a.this.f90362b, str, C35018a.this.f90363c.getId(), C35018a.this.f90363c.getName());
        }

        @Override // com.ss.android.lark.chatsetting.impl.p2p.P2pSettingView.AbstractC35017a
        /* renamed from: a */
        public void mo129041a(Context context, String str, boolean z) {
            ChatSettingModule.m133639a().mo127288r().mo127434a(context, str, z);
        }

        @Override // com.ss.android.lark.chatsetting.impl.p2p.P2pSettingView.AbstractC35017a
        /* renamed from: a */
        public void mo129042a(Context context, String str, boolean z, int i) {
            ChatSettingModule.m133639a().mo127288r().mo127435a(context, str, z, i);
        }
    };

    /* renamed from: g */
    private C35035d f90367g;

    /* renamed from: h */
    private Chatter f90368h;

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        C35035d dVar = this.f90367g;
        if (dVar != null) {
            dVar.destroy();
        }
        this.f90366f = null;
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        ChatSettingModule.m133639a().mo127274d().mo127317a();
    }

    /* renamed from: a */
    private void m136390a() {
        if (getArguments() != null) {
            this.f90363c = (Chat) getArguments().get("key_chat");
            Chatter chatter = (Chatter) getArguments().get("chatter_info");
            this.f90368h = chatter;
            if (this.f90363c == null || chatter == null) {
                finish();
                return;
            }
            C35035d dVar = new C35035d(getActivity(), this.f90366f, this.f90363c, this.f90368h, getArguments().getInt("key_params_hide_setting_item", 0));
            this.f90367g = dVar;
            dVar.create();
            ChatSettingHitPointNew.m136627a(getArguments().getString("key_params_source_to_setting"));
        }
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, androidx.fragment.app.Fragment
    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        this.f90362b = getContext();
        m136390a();
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.p2pchat_setting_layout_redesign, viewGroup, false);
        this.f90361a = inflate;
        return inflate;
    }
}
