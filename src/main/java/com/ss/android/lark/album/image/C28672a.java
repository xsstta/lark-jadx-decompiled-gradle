package com.ss.android.lark.album.image;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import butterknife.ButterKnife;
import com.larksuite.framework.utils.KeyboardUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.album.image.ChatImageAdapter;
import com.ss.android.lark.album.image.ChatImageView;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.lark.album.image.a */
public class C28672a extends Fragment {

    /* renamed from: a */
    public View f72139a;

    /* renamed from: b */
    private C28678c f72140b;

    /* renamed from: c */
    private ChatImageAdapter.AbstractC28662b f72141c;

    /* renamed from: d */
    private ChatImageView.AbstractC28671a f72142d = new ChatImageView.AbstractC28671a() {
        /* class com.ss.android.lark.album.image.C28672a.C286731 */

        @Override // com.ss.android.lark.album.image.ChatImageView.AbstractC28671a
        /* renamed from: a */
        public void mo101987a(ChatImageView chatImageView) {
            ButterKnife.bind(chatImageView, C28672a.this.f72139a);
        }
    };

    /* renamed from: a */
    public ArrayList<String> mo102012a() {
        return this.f72140b.mo102032b();
    }

    /* renamed from: b */
    public List<ChatImageViewData> mo102016b() {
        return this.f72140b.mo102035d();
    }

    /* renamed from: c */
    public void mo102017c() {
        this.f72140b.mo102034c();
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        C28678c cVar = this.f72140b;
        if (cVar != null) {
            cVar.destroy();
        }
        super.onDestroyView();
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        KeyboardUtils.hideKeyboard(getContext());
    }

    /* renamed from: d */
    private void m105122d() {
        String string = getArguments().getString("chat_id");
        if (!TextUtils.isEmpty(string)) {
            C28678c cVar = new C28678c(getContext(), this.f72142d, string, getArguments().getBoolean("is_thread"), this.f72141c);
            this.f72140b = cVar;
            cVar.create();
        }
    }

    /* renamed from: a */
    public void mo102013a(ChatImageAdapter.AbstractC28662b bVar) {
        this.f72141c = bVar;
    }

    /* renamed from: a */
    public void mo102014a(List<String> list) {
        this.f72140b.mo102030a(list);
    }

    /* renamed from: a */
    public void mo102015a(boolean z) {
        this.f72140b.mo102033b(z);
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        m105122d();
    }

    /* renamed from: a */
    public static C28672a m105121a(String str, boolean z) {
        C28672a aVar = new C28672a();
        Bundle bundle = new Bundle();
        bundle.putString("chat_id", str);
        bundle.putBoolean("is_thread", z);
        aVar.setArguments(bundle);
        return aVar;
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.fragment_chat_image, viewGroup, false);
        this.f72139a = inflate;
        return inflate;
    }
}
