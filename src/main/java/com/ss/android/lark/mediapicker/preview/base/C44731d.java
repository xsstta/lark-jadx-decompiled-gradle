package com.ss.android.lark.mediapicker.preview.base;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.larksuite.suite.R;
import com.ss.android.lark.mediapicker.entity.LocalMedia;
import com.ss.android.lark.mediapicker.widget.LargeImageView;
import java.io.File;

/* renamed from: com.ss.android.lark.mediapicker.preview.base.d */
public class C44731d extends Fragment implements AbstractC44730c {

    /* renamed from: a */
    private LargeImageView f113317a;

    /* renamed from: b */
    private LocalMedia f113318b;

    /* renamed from: c */
    private int f113319c;

    @Override // com.ss.android.lark.mediapicker.preview.base.AbstractC44730c
    /* renamed from: a */
    public int mo158446a() {
        return this.f113319c;
    }

    /* renamed from: b */
    private void m177425b() {
        this.f113317a.mo158481a(new File(this.f113318b.getPath()), R.drawable.picker_media_black_48dp, R.drawable.picker_media_black_broken_48dp);
    }

    @Override // com.ss.android.lark.mediapicker.preview.base.AbstractC44730c
    /* renamed from: a */
    public void mo158447a(LocalMedia localMedia) {
        this.f113318b = localMedia;
        m177425b();
    }

    /* renamed from: a */
    private void m177424a(View view) {
        this.f113317a = (LargeImageView) view.findViewById(R.id.large_iv);
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.f113318b = (LocalMedia) arguments.getSerializable("media");
            this.f113319c = arguments.getInt("position", -2);
        }
    }

    /* renamed from: a */
    public static Fragment m177423a(LocalMedia localMedia, int i) {
        C44731d dVar = new C44731d();
        Bundle bundle = new Bundle();
        bundle.putSerializable("media", localMedia);
        bundle.putSerializable("position", Integer.valueOf(i));
        dVar.setArguments(bundle);
        return dVar;
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.picker_preview_image, viewGroup, false);
        m177424a(inflate);
        m177425b();
        return inflate;
    }
}
