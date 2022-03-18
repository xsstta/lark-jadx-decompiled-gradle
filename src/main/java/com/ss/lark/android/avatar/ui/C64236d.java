package com.ss.lark.android.avatar.ui;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentManager;
import butterknife.ButterKnife;
import com.larksuite.framework.utils.CollectionUtils;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.base.fragment.BaseFragment;
import com.ss.android.lark.desktopmode.utils.DesktopUtil;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.utils.StatusBarUtil;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.lark.widget.photo_picker.animation.AbstractC58594b;
import com.ss.android.lark.widget.photo_picker.entity.PhotoItem;
import com.ss.android.lark.widget.photo_picker.gallery.ImagePagerFragment;
import com.ss.android.lark.widget.photo_picker.p2951f.C58648a;
import com.ss.android.lark.widget.photo_picker.p2951f.C58660i;
import com.ss.lark.android.avatar.AvatarModule;
import com.ss.lark.android.avatar.dependency.IAvatarModuleDependency;
import com.ss.lark.android.avatar.statistics.AvatarHit;
import com.ss.lark.android.avatar.ui.AbstractC64247j;
import com.ss.lark.android.avatar.ui.AvatarPickView;
import com.ss.lark.android.avatar.ui.AvatarPreviewView;
import com.ss.lark.android.avatar.updateapi.IUpdateAvatarAPI;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.lark.android.avatar.ui.d */
public class C64236d extends BaseFragment {

    /* renamed from: a */
    public View f162400a;

    /* renamed from: b */
    public Activity f162401b;

    /* renamed from: c */
    public Bundle f162402c;

    /* renamed from: d */
    public AbstractC58594b f162403d;

    /* renamed from: e */
    public String f162404e;

    /* renamed from: f */
    AvatarPreviewView.AbstractC64224a f162405f = new AvatarPreviewView.AbstractC64224a() {
        /* class com.ss.lark.android.avatar.ui.C64236d.C642371 */

        @Override // com.ss.lark.android.avatar.ui.AvatarPreviewView.AbstractC64224a
        /* renamed from: c */
        public FragmentManager mo222670c() {
            return C64236d.this.getChildFragmentManager();
        }

        @Override // com.ss.lark.android.avatar.ui.AvatarPreviewView.AbstractC64224a
        /* renamed from: e */
        public void mo222672e() {
            C64236d.this.finish();
        }

        @Override // com.ss.lark.android.avatar.ui.AvatarPreviewView.AbstractC64224a
        /* renamed from: f */
        public String mo222673f() {
            return C64236d.this.f162404e;
        }

        @Override // com.ss.lark.android.avatar.ui.AvatarPreviewView.AbstractC64224a
        /* renamed from: a */
        public void mo222665a() {
            C64251k.m252697b(C64236d.this.mContext, C64236d.this);
        }

        @Override // com.ss.lark.android.avatar.ui.AvatarPreviewView.AbstractC64224a
        /* renamed from: b */
        public void mo222669b() {
            C64251k.m252696a(C64236d.this.mContext, C64236d.this, "AvatarPreviewLauncher");
        }

        @Override // com.ss.lark.android.avatar.ui.AvatarPreviewView.AbstractC64224a
        /* renamed from: d */
        public boolean mo222671d() {
            return UIUtils.isActivityRunning(C64236d.this.f162401b);
        }

        @Override // com.ss.lark.android.avatar.ui.AvatarPreviewView.AbstractC64224a
        /* renamed from: a */
        public void mo222667a(AbstractC64247j.AbstractC64249b bVar) {
            ButterKnife.bind(bVar, C64236d.this.f162400a);
        }

        @Override // com.ss.lark.android.avatar.ui.AvatarPreviewView.AbstractC64224a
        /* renamed from: a */
        public void mo222668a(String str) {
            AvatarModule.f162301b.mo222601a().mo132672a(C64236d.this.getContext(), str);
            AvatarHit.m252533c();
        }

        @Override // com.ss.lark.android.avatar.ui.AvatarPreviewView.AbstractC64224a
        /* renamed from: a */
        public void mo222666a(ImagePagerFragment imagePagerFragment) {
            if (C64236d.this.getArguments() != null) {
                Intent intent = new Intent();
                intent.putExtras(C64236d.this.getArguments());
                C64236d dVar = C64236d.this;
                dVar.f162403d = C58648a.m227464a(imagePagerFragment, intent, dVar.f162402c);
            }
        }
    };

    /* renamed from: g */
    private C64240f f162406g;

    /* renamed from: h */
    private AvatarDecorationPresenter f162407h;

    /* renamed from: i */
    private AvatarSource f162408i;

    /* renamed from: j */
    private boolean f162409j;

    /* renamed from: k */
    private String f162410k;

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        C64240f fVar = this.f162406g;
        if (fVar != null) {
            fVar.destroy();
        }
        AvatarDecorationPresenter cVar = this.f162407h;
        if (cVar != null) {
            cVar.destroy();
        }
        super.onDestroy();
    }

    /* renamed from: b */
    private void m252646b() {
        boolean z;
        int i;
        Bundle arguments = getArguments();
        if (arguments == null) {
            finish();
            return;
        }
        AvatarSource avatarSource = (AvatarSource) arguments.getSerializable("avatar_source");
        this.f162408i = avatarSource;
        if (avatarSource == AvatarSource.MOMENTS || this.f162408i == AvatarSource.PROFILE || this.f162408i == AvatarSource.EDIT_ALIAS) {
            z = true;
        } else {
            z = false;
        }
        this.f162409j = z;
        this.f162410k = arguments.getString("failed_upload_toast", UIHelper.getString(R.string.Lark_Legacy_UcropUploadingAvatarFail));
        List<PhotoItem> a = C58660i.m227526a(arguments, "key_photos_preview");
        if (this.f162409j) {
            i = 3;
        } else {
            i = 4;
        }
        for (PhotoItem photoItem : a) {
            if (photoItem != null) {
                photoItem.setType(i);
                this.f162404e = photoItem.getEntityId();
            }
        }
        String string = arguments.getString("extra_toolbar_text", "");
        IUpdateAvatarAPI iUpdateAvatarAPI = (IUpdateAvatarAPI) arguments.getSerializable("extra_updateapi");
        if (!m252645a(arguments.getInt("direct_pick_photo", 0), iUpdateAvatarAPI)) {
            m252644a(a, string, iUpdateAvatarAPI);
        }
    }

    /* renamed from: a */
    public void mo222691a() {
        if (!this.f162406g.mo222695a()) {
            AbstractC58594b bVar = this.f162403d;
            if (bVar != null) {
                bVar.mo198587a(this.f162401b);
            } else {
                finish();
            }
            if (!DesktopUtil.m144301a(this.mContext)) {
                StatusBarUtil.showStatusBar(this.f162401b);
            }
        }
    }

    /* renamed from: a */
    private void m252643a(Intent intent) {
        if (intent == null) {
            finish();
            return;
        }
        ArrayList<String> stringArrayListExtra = intent.getStringArrayListExtra("SELECTED_PHOTOS");
        if (CollectionUtils.isEmpty(stringArrayListExtra)) {
            Log.m165389i(this.TAG, "onActivityResult photos is empty");
            finish();
            return;
        }
        String str = stringArrayListExtra.get(0);
        if (!TextUtils.isEmpty(str)) {
            this.f162406g.mo222697b(str);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        m252646b();
    }

    /* renamed from: a */
    private boolean m252645a(int i, IUpdateAvatarAPI iUpdateAvatarAPI) {
        if (i == 0 || iUpdateAvatarAPI == null) {
            return false;
        }
        AvatarPickView avatarPickView = new AvatarPickView(this.mContext, i, this.f162408i, new AvatarPickView.AbstractC64213a() {
            /* class com.ss.lark.android.avatar.ui.C64236d.C642382 */

            @Override // com.ss.lark.android.avatar.ui.AvatarPickView.AbstractC64213a
            /* renamed from: a */
            public FragmentManager mo222639a() {
                return C64236d.this.getChildFragmentManager();
            }

            @Override // com.ss.lark.android.avatar.ui.AvatarPickView.AbstractC64213a
            /* renamed from: c */
            public String mo222645c() {
                return C64236d.this.f162404e;
            }

            @Override // com.ss.lark.android.avatar.ui.AvatarPickView.AbstractC64213a
            /* renamed from: b */
            public boolean mo222644b() {
                return UIUtils.isActivityRunning(C64236d.this.f162401b);
            }

            @Override // com.ss.lark.android.avatar.ui.AvatarPickView.AbstractC64213a
            /* renamed from: a */
            public void mo222640a(int i) {
                C64251k.m252698b(C64236d.this.mContext, C64236d.this, i);
            }

            @Override // com.ss.lark.android.avatar.ui.AvatarPickView.AbstractC64213a
            /* renamed from: b */
            public void mo222643b(int i) {
                C64251k.m252699b(C64236d.this.mContext, C64236d.this, i, "AvatarPreviewLauncher");
            }

            @Override // com.ss.lark.android.avatar.ui.AvatarPickView.AbstractC64213a
            /* renamed from: a */
            public void mo222642a(AbstractC64247j.AbstractC64249b bVar) {
                ButterKnife.bind(bVar, C64236d.this.f162400a);
            }

            @Override // com.ss.lark.android.avatar.ui.AvatarPickView.AbstractC64213a
            /* renamed from: a */
            public void mo222641a(int i, Intent intent) {
                C64236d.this.setResult(i, intent);
                C64236d.this.finish();
            }
        });
        C64240f fVar = new C64240f(getActivity(), new C64239e(iUpdateAvatarAPI), avatarPickView);
        this.f162406g = fVar;
        fVar.mo222694a(this.f162410k);
        this.f162406g.mo222693a(this.f162408i);
        this.f162406g.create();
        return true;
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i2 == -1) {
            if (i == 233 || i == 234) {
                m252643a(intent);
            }
        } else if (i2 == 0 && i == 234) {
            finish();
        }
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f162402c = bundle;
        if (bundle != null) {
            bundle.remove("android:support:fragments");
        }
        if (!DesktopUtil.m144301a(getContext())) {
            StatusBarUtil.hideStatusBar(getActivity());
        }
        this.f162400a = layoutInflater.inflate(R.layout.avatar_layout_picker_fragment_photo_pager, viewGroup, false);
        this.f162401b = getActivity();
        return this.f162400a;
    }

    /* renamed from: a */
    private void m252644a(List<PhotoItem> list, String str, IUpdateAvatarAPI iUpdateAvatarAPI) {
        if (CollectionUtils.isEmpty(list) || iUpdateAvatarAPI == null) {
            finish();
            return;
        }
        AvatarPreviewView avatarPreviewView = new AvatarPreviewView(this.mContext, 0, list, str, this.f162405f, this.f162408i);
        C64240f fVar = new C64240f(getActivity(), new C64239e(iUpdateAvatarAPI), avatarPreviewView);
        this.f162406g = fVar;
        fVar.mo222694a(this.f162410k);
        this.f162406g.mo222693a(this.f162408i);
        this.f162406g.create();
        IAvatarModuleDependency b = AvatarModule.m252480b();
        if (!b.mo132679c() && !this.f162409j && b.mo132676b().mo132684a("lark.im.personalized_avatar", false)) {
            AvatarDecorationPresenter cVar = new AvatarDecorationPresenter(new AvatarDecorationModel(), avatarPreviewView.mo222656g());
            this.f162407h = cVar;
            cVar.create();
        }
    }
}
