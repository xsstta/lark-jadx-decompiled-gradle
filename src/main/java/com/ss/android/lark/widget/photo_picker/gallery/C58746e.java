package com.ss.android.lark.widget.photo_picker.gallery;

import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.ss.android.lark.base.fragment.BaseFragment;
import com.ss.android.lark.image.api.IRequestCreator;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.player.entity.DataSource;
import com.ss.android.lark.player.p2511a.C52093l;
import com.ss.android.lark.player.widget.VideoView;
import com.ss.android.lark.utils.C57840j;
import com.ss.android.lark.widget.photo_picker.C58612c;
import com.ss.android.lark.widget.photo_picker.entity.PhotoItem;
import com.ss.android.lark.widget.photo_picker.p2948c.AbstractC58617a;
import com.ss.android.lark.widget.photo_picker.video.C58856a;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.functions.Consumer;
import java.io.File;

/* renamed from: com.ss.android.lark.widget.photo_picker.gallery.e */
public class C58746e extends BaseFragment implements AbstractC58617a {

    /* renamed from: a */
    public VideoView f145197a;

    /* renamed from: b */
    private IRequestCreator f145198b;

    /* renamed from: c */
    private PhotoItem f145199c;

    /* renamed from: d */
    private C58856a f145200d;

    @Override // com.ss.android.lark.widget.photo_picker.p2948c.AbstractC58617a
    /* renamed from: a */
    public void mo198633a() {
    }

    @Override // com.ss.android.lark.widget.photo_picker.p2948c.AbstractC58617a
    /* renamed from: a */
    public void mo198635a(PhotoItem photoItem) {
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, com.ss.android.lark.base.fragment.BaseFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        VideoView videoView = this.f145197a;
        if (videoView != null) {
            videoView.mo178606g();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        C58856a aVar = this.f145200d;
        if (aVar != null) {
            aVar.mo199454c();
        }
    }

    /* renamed from: b */
    public void mo199162b(PhotoItem photoItem) {
        this.f145199c = photoItem;
    }

    @Override // com.ss.android.lark.widget.photo_picker.p2948c.AbstractC58617a
    /* renamed from: a */
    public void mo198634a(float f) {
        C58856a aVar = this.f145200d;
        if (aVar != null) {
            aVar.mo199453a(f);
        }
    }

    /* renamed from: a */
    public void mo199161a(IRequestCreator iRequestCreator) {
        this.f145198b = iRequestCreator;
    }

    /* renamed from: a */
    public static C58746e m227922a(IRequestCreator iRequestCreator, PhotoItem photoItem) {
        C58746e eVar = new C58746e();
        eVar.setArguments(new Bundle());
        eVar.mo199161a(iRequestCreator);
        eVar.mo199162b(photoItem);
        return eVar;
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, androidx.fragment.app.Fragment
    public View onCreateView(final LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        final FrameLayout frameLayout = new FrameLayout(layoutInflater.getContext());
        this.f145200d = new C58856a(getContext(), this.f145198b, this.f145199c);
        final C52093l lVar = new C52093l();
        lVar.mo178468a("controller", this.f145200d);
        final DataSource dataSource = new DataSource();
        final String path = this.f145199c.getPhoto().getPath();
        C58612c.m227290a().mo102869l().mo102872a(new File(path), false, new C58612c.AbstractC58613a() {
            /* class com.ss.android.lark.widget.photo_picker.gallery.C58746e.C587471 */

            @Override // com.ss.android.lark.widget.photo_picker.C58612c.AbstractC58613a
            /* renamed from: a */
            public void mo198631a(Exception exc) {
                String str = C58746e.this.TAG;
                Log.m165383e(str, "[cipher] file decrypt failed, original path = " + path);
            }

            @Override // com.ss.android.lark.widget.photo_picker.C58612c.AbstractC58613a
            /* renamed from: a */
            public void mo198630a(File file) {
                String str = C58746e.this.TAG;
                Log.m165389i(str, "[cipher] file decrypt success, original path = " + path + ", new path = " + file.getAbsolutePath());
                dataSource.setUri(Uri.fromFile(file));
                C57840j.m224506b().mo196190b("videoplayer").observeOn(AndroidSchedulers.mainThread()).subscribe(new Consumer<Boolean>() {
                    /* class com.ss.android.lark.widget.photo_picker.gallery.C58746e.C587471.C587481 */

                    /* renamed from: a */
                    public void accept(Boolean bool) throws Exception {
                        if (bool.booleanValue() && C58746e.this.getActivity() != null && !C58746e.this.getActivity().isFinishing()) {
                            C58746e.this.f145197a = new VideoView(layoutInflater.getContext());
                            frameLayout.addView(C58746e.this.f145197a, new FrameLayout.LayoutParams(-1, -1));
                            C58746e.this.f145197a.setDataSource(dataSource);
                            C58746e.this.f145197a.setReceiverGroup(lVar);
                        }
                    }
                });
            }
        });
        return frameLayout;
    }
}
