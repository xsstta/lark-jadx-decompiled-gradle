package com.ss.android.lark.chatsetting.impl.group.avatar;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import butterknife.ButterKnife;
import com.larksuite.suite.R;
import com.ss.android.lark.base.fragment.BaseFragment;
import com.ss.android.lark.chatsetting.ChatSettingModule;
import com.ss.android.lark.chatsetting.impl.group.avatar.mvp.AbstractC34590b;
import com.ss.android.lark.chatsetting.impl.group.avatar.mvp.AvatarEditDelegate;
import com.ss.android.lark.chatsetting.impl.group.avatar.mvp.AvatarEditView;
import com.ss.android.lark.chatsetting.impl.group.avatar.mvp.C34594c;
import com.ss.android.lark.chatsetting.p1693a.AbstractC34461c;
import kotlin.Triple;

/* renamed from: com.ss.android.lark.chatsetting.impl.group.avatar.b */
public class C34569b extends BaseFragment {

    /* renamed from: a */
    public View f89257a;

    /* renamed from: b */
    private C34594c f89258b;

    /* renamed from: c */
    private AvatarEditView.AbstractC34588a f89259c = new AvatarEditView.AbstractC34588a() {
        /* class com.ss.android.lark.chatsetting.impl.group.avatar.C34569b.C345701 */

        @Override // com.ss.android.lark.chatsetting.impl.group.avatar.mvp.AvatarEditView.AbstractC34588a
        /* renamed from: a */
        public void mo127747a() {
            C34569b.this.finish();
        }

        @Override // com.ss.android.lark.chatsetting.impl.group.avatar.mvp.AvatarEditView.AbstractC34588a
        /* renamed from: a */
        public void mo127750a(AvatarEditView avatarEditView) {
            ButterKnife.bind(avatarEditView, C34569b.this.f89257a);
        }

        @Override // com.ss.android.lark.chatsetting.impl.group.avatar.mvp.AvatarEditView.AbstractC34588a
        /* renamed from: a */
        public void mo127748a(Bundle bundle) {
            Intent intent = new Intent();
            intent.putExtras(bundle);
            C34569b.this.setResult(-1, intent);
            C34569b.this.finish();
        }

        @Override // com.ss.android.lark.chatsetting.impl.group.avatar.mvp.AvatarEditView.AbstractC34588a
        /* renamed from: a */
        public void mo127749a(ImageView imageView, String str) {
            AbstractC34461c.AbstractC34463b p = ChatSettingModule.m133639a().mo127286p();
            C34569b bVar = C34569b.this;
            p.mo127300a(bVar, bVar.getActivity(), imageView, str, 670);
        }
    };

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        this.f89258b.destroy();
        super.onDestroy();
    }

    /* renamed from: a */
    private void m134293a(Bundle bundle) {
        Triple<AvatarEditView, AbstractC34590b, AvatarEditDelegate> a = AvatarEditBuilder.m134275a(bundle, this.f89259c, getActivity());
        if (a == null) {
            finish();
            return;
        }
        C34594c cVar = new C34594c(a.getFirst(), a.getSecond(), a.getThird());
        this.f89258b = cVar;
        cVar.create();
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f89257a = layoutInflater.inflate(R.layout.activity_group_avatar_edit, (ViewGroup) null);
        m134293a(getArguments());
        return this.f89257a;
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 670 && i2 == ChatSettingModule.m133639a().mo127286p().mo127298a()) {
            this.f89258b.mo127819a(intent.getExtras().getString("avatar_path"));
        }
    }
}
