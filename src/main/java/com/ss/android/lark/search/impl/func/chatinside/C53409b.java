package com.ss.android.lark.search.impl.func.chatinside;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import butterknife.ButterKnife;
import com.larksuite.suite.R;
import com.ss.android.lark.base.fragment.BaseFragment;
import com.ss.android.lark.sdk.C53241h;
import com.ss.android.lark.search.impl.func.chatinside.detail.C53416a;
import com.ss.android.lark.search.impl.func.chatinside.mvp.C53526a;
import com.ss.android.lark.search.impl.func.chatinside.mvp.C53527b;
import com.ss.android.lark.search.impl.func.chatinside.mvp.ChatInsideSearchView;

/* renamed from: com.ss.android.lark.search.impl.func.chatinside.b */
public class C53409b extends BaseFragment {

    /* renamed from: a */
    public View f132013a;

    /* renamed from: b */
    private C53527b f132014b;

    /* renamed from: c */
    private ChatInsideSearchView.AbstractC53525a f132015c = new ChatInsideSearchView.AbstractC53525a() {
        /* class com.ss.android.lark.search.impl.func.chatinside.C53409b.C534101 */

        @Override // com.ss.android.lark.search.impl.func.chatinside.mvp.ChatInsideSearchView.AbstractC53525a
        /* renamed from: a */
        public void mo182442a() {
            C53409b.this.finish();
        }

        @Override // com.ss.android.lark.search.impl.func.chatinside.mvp.ChatInsideSearchView.AbstractC53525a
        /* renamed from: a */
        public void mo182443a(ChatInsideSearchView chatInsideSearchView) {
            ButterKnife.bind(chatInsideSearchView, C53409b.this.f132013a);
        }
    };

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        C53527b bVar = this.f132014b;
        if (bVar != null) {
            bVar.destroy();
        }
        super.onDestroy();
    }

    /* renamed from: a */
    private boolean m206835a(Bundle bundle) {
        if (bundle == null || !bundle.containsKey("extra.chat.id")) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, androidx.fragment.app.Fragment
    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        Bundle arguments = getArguments();
        if (!m206835a(arguments)) {
            C53241h.m205894a("LarkSearch.Search.ChatInsideSearchFragment", " arguments is null, finish!");
            finish();
            return;
        }
        m206834a(arguments.getString("extra.chat.id"), arguments.getBoolean("extra.show.file", true), arguments.getBoolean("extra.is.thread", false), arguments.getInt("extra.select.type", 0));
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.activity_chat_inside_search, viewGroup, false);
        this.f132013a = inflate;
        return inflate;
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityResult(int i, int i2, Intent intent) {
        if (i != 161) {
            if (i == 162 && i2 == -1 && intent != null) {
                m206833a(i, i2, intent, 6);
            }
        } else if (i2 == -1 && intent != null) {
            m206833a(i, i2, intent, 3);
        }
    }

    /* renamed from: a */
    private void m206834a(String str, boolean z, boolean z2, int i) {
        C53527b bVar = new C53527b(new C53526a(str, z, z2, i), new ChatInsideSearchView(this.f132015c, this.mContext, getChildFragmentManager()));
        this.f132014b = bVar;
        bVar.create();
    }

    /* renamed from: a */
    private void m206833a(int i, int i2, Intent intent, int i3) {
        for (Fragment fragment : getChildFragmentManager().getFragments()) {
            if ((fragment instanceof C53416a) && ((C53416a) fragment).mo182451a() == i3) {
                fragment.onActivityResult(i, i2, intent);
                return;
            }
        }
    }
}
