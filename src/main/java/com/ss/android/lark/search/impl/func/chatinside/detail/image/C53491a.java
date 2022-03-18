package com.ss.android.lark.search.impl.func.chatinside.detail.image;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import butterknife.ButterKnife;
import com.larksuite.framework.utils.KeyboardUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.search.C53258a;
import com.ss.android.lark.search.impl.func.chatinside.detail.image.ChatInsideSearchImageAdapter;
import com.ss.android.lark.search.impl.func.chatinside.detail.image.mvp.C53508b;
import com.ss.android.lark.search.impl.func.chatinside.detail.image.mvp.ChatInsideSearchImageView;
import com.ss.android.lark.search.impl.func.chatinside.detail.image.viewdata.ChatInsideSearchImageViewData;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.lark.search.impl.func.chatinside.detail.image.a */
public class C53491a extends Fragment {

    /* renamed from: a */
    public View f132156a;

    /* renamed from: b */
    private C53508b f132157b;

    /* renamed from: c */
    private ChatInsideSearchImageAdapter.AbstractC53490b f132158c;

    /* renamed from: d */
    private ChatInsideSearchImageView.AbstractC53501a f132159d = new ChatInsideSearchImageView.AbstractC53501a() {
        /* class com.ss.android.lark.search.impl.func.chatinside.detail.image.C53491a.C534921 */

        @Override // com.ss.android.lark.search.impl.func.chatinside.detail.image.mvp.ChatInsideSearchImageView.AbstractC53501a
        /* renamed from: a */
        public void mo182636a(ChatInsideSearchImageView chatInsideSearchImageView) {
            ButterKnife.bind(chatInsideSearchImageView, C53491a.this.f132156a);
        }

        @Override // com.ss.android.lark.search.impl.func.chatinside.detail.image.mvp.ChatInsideSearchImageView.AbstractC53501a
        /* renamed from: b */
        public void mo182638b(String str, int i) {
            C53258a.m205939a().mo181756f().mo181782a(str, i);
        }

        @Override // com.ss.android.lark.search.impl.func.chatinside.detail.image.mvp.ChatInsideSearchImageView.AbstractC53501a
        /* renamed from: a */
        public void mo182637a(String str, int i) {
            C53258a.m205939a().mo181756f().mo181784a(str, C53491a.class.getName(), i);
        }
    };

    /* renamed from: d */
    public String mo182635d() {
        return "image";
    }

    /* renamed from: a */
    public ArrayList<String> mo182629a() {
        return this.f132157b.mo182677b();
    }

    /* renamed from: b */
    public List<ChatInsideSearchImageViewData> mo182633b() {
        return this.f132157b.mo182680d();
    }

    /* renamed from: c */
    public void mo182634c() {
        this.f132157b.mo182679c();
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        C53508b bVar = this.f132157b;
        if (bVar != null) {
            bVar.destroy();
        }
        super.onDestroyView();
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        KeyboardUtils.hideKeyboard(getContext());
    }

    /* renamed from: e */
    private void m207168e() {
        String string = getArguments().getString("chat_id");
        if (!TextUtils.isEmpty(string)) {
            C53508b bVar = new C53508b(getContext(), this.f132159d, string, getArguments().getBoolean("is_thread"), getArguments().getBoolean("show_video"), getArguments().getBoolean("support_selectable"), this.f132158c);
            this.f132157b = bVar;
            bVar.create();
        }
    }

    /* renamed from: a */
    public void mo182630a(ChatInsideSearchImageAdapter.AbstractC53490b bVar) {
        this.f132158c = bVar;
    }

    /* renamed from: a */
    public void mo182631a(List<String> list) {
        this.f132157b.mo182675a(list);
    }

    /* renamed from: a */
    public void mo182632a(boolean z) {
        this.f132157b.mo182678b(z);
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        m207168e();
    }

    /* renamed from: a */
    public static Fragment m207166a(String str, boolean z) {
        C53491a aVar = new C53491a();
        Bundle bundle = new Bundle();
        bundle.putString("chat_id", str);
        bundle.putBoolean("is_thread", z);
        aVar.setArguments(bundle);
        return aVar;
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.fragment_chat_inside_search_image, viewGroup, false);
        this.f132156a = inflate;
        return inflate;
    }

    /* renamed from: a */
    public static C53491a m207167a(String str, boolean z, boolean z2, boolean z3) {
        C53491a aVar = new C53491a();
        Bundle bundle = new Bundle();
        bundle.putString("chat_id", str);
        bundle.putBoolean("is_thread", z);
        bundle.putBoolean("show_video", z2);
        bundle.putBoolean("support_selectable", z3);
        aVar.setArguments(bundle);
        return aVar;
    }
}
