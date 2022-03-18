package com.ss.android.lark.widget.photo_picker.gallery.p2952a;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.fragment.app.FragmentActivity;
import com.ss.android.lark.base.fragment.BaseFragment;
import com.ss.android.lark.player.widget.VideoView;
import com.ss.android.lark.widget.photo_picker.entity.PhotoItem;
import com.ss.android.lark.widget.photo_picker.gallery.callback.OnChatAlbumClickListener;
import com.ss.android.lark.widget.photo_picker.gallery.callback.OnDialogMenuClickListener;
import com.ss.android.lark.widget.photo_picker.gallery.p2952a.C58715e;
import com.ss.android.lark.widget.photo_picker.p2948c.AbstractC58617a;

/* renamed from: com.ss.android.lark.widget.photo_picker.gallery.a.b */
public class C58694b extends BaseFragment implements AbstractC58617a {

    /* renamed from: a */
    public FrameLayout f145037a;

    /* renamed from: b */
    private boolean f145038b;

    /* renamed from: c */
    private boolean f145039c;

    /* renamed from: d */
    private boolean f145040d;

    /* renamed from: e */
    private boolean f145041e = true;

    /* renamed from: f */
    private boolean f145042f = true;

    /* renamed from: g */
    private PhotoItem f145043g;

    /* renamed from: h */
    private C58702d f145044h;

    /* renamed from: i */
    private boolean f145045i;

    /* renamed from: j */
    private OnDialogMenuClickListener f145046j;

    /* renamed from: k */
    private OnChatAlbumClickListener f145047k;

    /* renamed from: l */
    private C58715e.AbstractC58731c f145048l = new C58715e.AbstractC58731c() {
        /* class com.ss.android.lark.widget.photo_picker.gallery.p2952a.C58694b.C586951 */

        @Override // com.ss.android.lark.widget.photo_picker.gallery.p2952a.C58715e.AbstractC58731c
        /* renamed from: a */
        public void mo199067a() {
            FragmentActivity activity = C58694b.this.getActivity();
            if (activity != null) {
                activity.onBackPressed();
            }
        }

        @Override // com.ss.android.lark.widget.photo_picker.gallery.p2952a.C58715e.AbstractC58731c
        /* renamed from: a */
        public void mo199068a(C58715e eVar) {
            eVar.f145093d = new VideoView(C58694b.this.getContext());
            C58694b.this.f145037a.addView(eVar.f145093d, new FrameLayout.LayoutParams(-1, -1));
        }
    };

    @Override // com.ss.android.lark.widget.photo_picker.p2948c.AbstractC58617a
    /* renamed from: a */
    public void mo198633a() {
        C58702d dVar = this.f145044h;
        if (dVar != null) {
            dVar.mo199082c();
        }
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, com.ss.android.lark.base.fragment.BaseFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        C58702d dVar = this.f145044h;
        if (dVar != null) {
            dVar.destroy();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        C58702d dVar = this.f145044h;
        if (dVar != null) {
            dVar.mo199080b();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        C58702d dVar = this.f145044h;
        if (dVar != null) {
            dVar.mo199079a(this.f145045i);
        }
    }

    /* renamed from: b */
    public void mo199066b(PhotoItem photoItem) {
        this.f145043g = photoItem;
    }

    @Override // com.ss.android.lark.widget.photo_picker.p2948c.AbstractC58617a
    /* renamed from: a */
    public void mo198634a(float f) {
        C58702d dVar = this.f145044h;
        if (dVar != null) {
            dVar.mo199077a(f);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void setUserVisibleHint(boolean z) {
        this.f145045i = z;
        super.setUserVisibleHint(z);
        C58702d dVar = this.f145044h;
        if (dVar != null) {
            dVar.mo199081b(z);
        }
    }

    /* renamed from: a */
    private C58702d m227758a(OnDialogMenuClickListener onDialogMenuClickListener) {
        return new C58702d(this, this.f145043g, this.f145038b, this.f145040d, this.f145041e, this.f145042f, this.f145048l, onDialogMenuClickListener, this.f145039c, this.f145047k);
    }

    @Override // com.ss.android.lark.widget.photo_picker.p2948c.AbstractC58617a
    /* renamed from: a */
    public void mo198635a(PhotoItem photoItem) {
        C58702d dVar = this.f145044h;
        if (dVar != null) {
            dVar.mo199078a(photoItem);
        }
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, com.ss.android.lark.base.fragment.BaseFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        boolean z;
        OnChatAlbumClickListener onChatAlbumClickListener;
        boolean z2;
        boolean z3;
        super.onCreate(bundle);
        boolean z4 = false;
        if (getArguments() == null || !getArguments().getBoolean("isMute", false)) {
            z = false;
        } else {
            z = true;
        }
        this.f145038b = z;
        OnDialogMenuClickListener onDialogMenuClickListener = null;
        if (getArguments() == null) {
            onChatAlbumClickListener = null;
        } else {
            onChatAlbumClickListener = (OnChatAlbumClickListener) getArguments().getSerializable("chat_album_click_listener");
        }
        this.f145047k = onChatAlbumClickListener;
        if (getArguments() == null || !getArguments().getBoolean("showViewChatImage", true)) {
            z2 = false;
        } else {
            z2 = true;
        }
        this.f145039c = z2;
        if (getArguments() != null && getArguments().getBoolean("show_jump_chat", false)) {
            z4 = true;
        }
        this.f145040d = z4;
        if (getArguments() != null) {
            onDialogMenuClickListener = (OnDialogMenuClickListener) getArguments().getSerializable("click_listener");
        }
        this.f145046j = onDialogMenuClickListener;
        if (getArguments() == null) {
            z3 = true;
        } else {
            z3 = getArguments().getBoolean("show_save_to_driver", true);
        }
        this.f145041e = z3;
        this.f145042f = getArguments().getBoolean("enable_long_click", true);
        C58702d a = m227758a(this.f145046j);
        this.f145044h = a;
        a.mo199081b(this.f145045i);
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        this.f145044h.create();
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        FrameLayout frameLayout = new FrameLayout(layoutInflater.getContext());
        this.f145037a = frameLayout;
        return frameLayout;
    }

    /* renamed from: a */
    public static C58694b m227757a(PhotoItem photoItem, boolean z, boolean z2, boolean z3, boolean z4, OnDialogMenuClickListener onDialogMenuClickListener, boolean z5, OnChatAlbumClickListener onChatAlbumClickListener) {
        C58694b bVar = new C58694b();
        Bundle bundle = new Bundle();
        bundle.putBoolean("isMute", z);
        bundle.putSerializable("chat_album_click_listener", onChatAlbumClickListener);
        bundle.putBoolean("showViewChatImage", z5);
        bundle.putBoolean("show_jump_chat", z2);
        bundle.putBoolean("show_save_to_driver", z3);
        bundle.putSerializable("click_listener", onDialogMenuClickListener);
        bundle.putSerializable("enable_long_click", Boolean.valueOf(z4));
        bVar.setArguments(bundle);
        bVar.mo199066b(photoItem);
        return bVar;
    }
}
