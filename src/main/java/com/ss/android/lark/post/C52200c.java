package com.ss.android.lark.post;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import butterknife.ButterKnife;
import com.larksuite.suite.R;
import com.ss.android.lark.base.fragment.BaseFragment;
import com.ss.android.lark.chat.entity.chat.Chat;
import com.ss.android.lark.desktopmode.utils.DesktopUtil;
import com.ss.android.lark.post.PostMessageView;
import com.ss.android.lark.reaction.widget.p2560b.C52990a;
import com.ss.android.lark.widget.photo_picker.C58557a;
import com.ss.android.lark.widget.photo_picker.C58633e;
import com.ss.android.lark.widget.richtext.RichText;

/* renamed from: com.ss.android.lark.post.c */
public class C52200c extends BaseFragment {

    /* renamed from: a */
    public View f129507a;

    /* renamed from: b */
    public boolean f129508b;

    /* renamed from: c */
    private C52207f f129509c;

    /* renamed from: d */
    private final PostMessageView.AbstractC52158a f129510d = new PostMessageView.AbstractC52158a() {
        /* class com.ss.android.lark.post.C52200c.C522011 */

        @Override // com.ss.android.lark.post.PostMessageView.AbstractC52158a
        /* renamed from: e */
        public Fragment mo178669e() {
            return C52200c.this;
        }

        @Override // com.ss.android.lark.post.PostMessageView.AbstractC52158a
        /* renamed from: a */
        public Context mo178659a() {
            return C52200c.this.getContext();
        }

        @Override // com.ss.android.lark.post.PostMessageView.AbstractC52158a
        /* renamed from: b */
        public Activity mo178665b() {
            return C52200c.this.getActivity();
        }

        @Override // com.ss.android.lark.post.PostMessageView.AbstractC52158a
        /* renamed from: c */
        public FragmentManager mo178667c() {
            return C52200c.this.getChildFragmentManager();
        }

        @Override // com.ss.android.lark.post.PostMessageView.AbstractC52158a
        /* renamed from: d */
        public Boolean mo178668d() {
            return Boolean.valueOf(C52990a.m205232a(mo178665b()));
        }

        @Override // com.ss.android.lark.post.PostMessageView.AbstractC52158a
        /* renamed from: a */
        public void mo178660a(PostMessageView postMessageView) {
            ButterKnife.bind(postMessageView, C52200c.this.f129507a);
        }

        @Override // com.ss.android.lark.post.PostMessageView.AbstractC52158a
        /* renamed from: a */
        public void mo178661a(C58557a.C58559a aVar) {
            if (mo178659a() != null) {
                aVar.mo198512a(mo178659a(), C52200c.this, 233);
            }
        }

        @Override // com.ss.android.lark.post.PostMessageView.AbstractC52158a
        /* renamed from: a */
        public void mo178662a(C58633e.C58634a aVar) {
            if (mo178659a() != null) {
                aVar.mo198694a(mo178659a(), C52200c.this, 911);
            }
        }

        @Override // com.ss.android.lark.post.PostMessageView.AbstractC52158a
        /* renamed from: b */
        public void mo178666b(RichText richText, Chat chat, boolean z) {
            C52200c.this.mo178753a(richText, chat, z);
        }

        @Override // com.ss.android.lark.post.PostMessageView.AbstractC52158a
        /* renamed from: a */
        public void mo178664a(RichText richText, Chat chat, boolean z) {
            C52200c.this.mo178753a(richText, chat, z);
            C52200c.this.finish();
        }

        @Override // com.ss.android.lark.post.PostMessageView.AbstractC52158a
        /* renamed from: a */
        public void mo178663a(RichText richText, Chat chat, Boolean bool, boolean z) {
            Intent intent = new Intent();
            intent.putExtra("key_params_post_richtext", richText);
            intent.putExtra("key_params_post_topic_group", chat);
            intent.putExtra("key_params_is_default_group", bool);
            intent.putExtra("key_params_is_anonymous", z);
            C52200c.this.setResult(-1, intent);
            C52200c.this.f129508b = true;
            C52200c.this.finish();
        }
    };

    /* renamed from: a */
    public boolean mo178754a() {
        C52207f fVar = this.f129509c;
        if (fVar != null) {
            return fVar.mo178764d();
        }
        return false;
    }

    /* renamed from: b */
    private void m202507b() {
        C52207f fVar = new C52207f(this.f129510d, m202508c());
        this.f129509c = fVar;
        fVar.create();
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, com.ss.android.lark.base.fragment.BaseFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        if (this.f129509c != null) {
            if (DesktopUtil.m144307b() && !this.f129508b) {
                this.f129509c.mo178763c();
                finish();
            }
            this.f129509c.destroy();
            this.f129509c = null;
        }
    }

    /* renamed from: c */
    private C52202d m202508c() {
        C52202d dVar = new C52202d();
        Bundle arguments = getArguments();
        if (arguments != null) {
            dVar.f129512a = (Chat) arguments.getSerializable("key_params_chat");
            dVar.f129513b = arguments.getString("key_params_text_hint", "");
            dVar.f129514c = (RichText) arguments.getSerializable("key_params_richtext");
            dVar.f129515d = arguments.getBoolean("key_params_is_show_group");
            dVar.f129516e = arguments.getString("key_params_individual_topic_draft_group_id");
            dVar.f129517f = Boolean.valueOf(arguments.getBoolean("key_params_is_interrupt_at_all", false));
        }
        return dVar;
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        m202507b();
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        C52207f fVar = this.f129509c;
        if (fVar != null) {
            fVar.mo178760a(i, i2, intent);
        }
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.activity_post_message, viewGroup, false);
        this.f129507a = inflate;
        return inflate;
    }

    /* renamed from: a */
    public void mo178753a(RichText richText, Chat chat, boolean z) {
        Intent intent = new Intent();
        intent.putExtra("key_params_post_richtext", richText);
        intent.putExtra("key_params_post_topic_group", chat);
        intent.putExtra("key_params_is_anonymous", z);
        setResult(0, intent);
        this.f129508b = true;
    }
}
