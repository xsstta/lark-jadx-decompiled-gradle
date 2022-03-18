package com.ss.android.lark.mediapicker.preview.base;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.fragment.app.Fragment;
import com.larksuite.suite.R;
import com.ss.android.lark.mediapicker.dependency.C44675a;
import com.ss.android.lark.mediapicker.dependency.LoadOption;
import com.ss.android.lark.mediapicker.entity.LocalMedia;
import com.ss.android.lark.mediapicker.player.VideoPlayerActivity;
import com.ss.android.lark.mediapicker.widget.OnSingleClickListener;

/* renamed from: com.ss.android.lark.mediapicker.preview.base.j */
public class C44740j extends Fragment implements AbstractC44730c {

    /* renamed from: a */
    public LocalMedia f113346a;

    /* renamed from: b */
    private ImageView f113347b;

    /* renamed from: c */
    private ImageView f113348c;

    /* renamed from: d */
    private int f113349d;

    @Override // com.ss.android.lark.mediapicker.preview.base.AbstractC44730c
    /* renamed from: a */
    public int mo158446a() {
        return this.f113349d;
    }

    /* renamed from: b */
    private void m177472b() {
        C44675a.m177227a(getContext(), this.f113346a.getPath(), this.f113347b, LoadOption.f113213k);
    }

    @Override // com.ss.android.lark.mediapicker.preview.base.AbstractC44730c
    /* renamed from: a */
    public void mo158447a(LocalMedia localMedia) {
        this.f113346a = localMedia;
        m177472b();
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.f113346a = (LocalMedia) arguments.getSerializable("media");
            this.f113349d = arguments.getInt("position", -2);
        }
    }

    /* renamed from: a */
    private void m177471a(View view) {
        this.f113347b = (ImageView) view.findViewById(R.id.cover);
        ImageView imageView = (ImageView) view.findViewById(R.id.play_btn);
        this.f113348c = imageView;
        imageView.setOnClickListener(new OnSingleClickListener() {
            /* class com.ss.android.lark.mediapicker.preview.base.C44740j.C447411 */

            @Override // com.ss.android.lark.mediapicker.widget.OnSingleClickListener
            /* renamed from: a */
            public void mo158215a(View view) {
                Intent intent = new Intent(C44740j.this.getContext(), VideoPlayerActivity.class);
                intent.putExtra("video_path", C44740j.this.f113346a.getPath());
                C44740j.this.startActivity(intent);
            }
        });
    }

    /* renamed from: a */
    public static Fragment m177470a(LocalMedia localMedia, int i) {
        C44740j jVar = new C44740j();
        Bundle bundle = new Bundle();
        bundle.putSerializable("media", localMedia);
        bundle.putSerializable("position", Integer.valueOf(i));
        jVar.setArguments(bundle);
        return jVar;
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.picker_preview_video, viewGroup, false);
        m177471a(inflate);
        m177472b();
        return inflate;
    }
}
