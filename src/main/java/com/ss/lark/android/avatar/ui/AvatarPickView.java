package com.ss.lark.android.avatar.ui;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentManager;
import butterknife.BindView;
import com.larksuite.component.ui.toast.LKUIToast;
import com.larksuite.framework.ui.ViewPagerWithoutScroll;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.desktopmode.utils.DesktopUtil;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.lark.utils.p2905b.C57811b;
import com.ss.android.lark.widget.photo_picker.entity.PhotoItem;
import com.ss.lark.android.avatar.ui.AbstractC64247j;
import com.ss.lark.android.avatar.ui.AvatarCropFragment;

public class AvatarPickView implements AbstractC64247j.AbstractC64249b {

    /* renamed from: a */
    public AbstractC64247j.AbstractC64249b.AbstractC64250a f162326a;

    /* renamed from: b */
    public final AbstractC64213a f162327b;

    /* renamed from: c */
    public int f162328c = -1;

    /* renamed from: d */
    public final Context f162329d;

    /* renamed from: e */
    public AvatarSource f162330e;

    /* renamed from: f */
    private AvatarCropFragment f162331f;

    /* renamed from: g */
    private C64245g f162332g;

    /* renamed from: h */
    private Dialog f162333h;

    /* renamed from: i */
    private final int f162334i;

    /* renamed from: j */
    private boolean f162335j;
    @BindView(6654)
    ViewPagerWithoutScroll mMainVP;
    @BindView(6655)
    ViewGroup mPhotoPagerFooterFL;

    /* renamed from: com.ss.lark.android.avatar.ui.AvatarPickView$a */
    public interface AbstractC64213a {
        /* renamed from: a */
        FragmentManager mo222639a();

        /* renamed from: a */
        void mo222640a(int i);

        /* renamed from: a */
        void mo222641a(int i, Intent intent);

        /* renamed from: a */
        void mo222642a(AbstractC64247j.AbstractC64249b bVar);

        /* renamed from: b */
        void mo222643b(int i);

        /* renamed from: b */
        boolean mo222644b();

        /* renamed from: c */
        String mo222645c();
    }

    @Override // com.ss.lark.android.avatar.ui.AbstractC64247j.AbstractC64249b
    /* renamed from: a */
    public void mo222624a(PhotoItem photoItem) {
    }

    @Override // com.ss.lark.android.avatar.ui.AbstractC64247j.AbstractC64249b
    /* renamed from: a */
    public void mo222627a(boolean z) {
    }

    @Override // com.ss.lark.android.avatar.ui.AbstractC64247j.AbstractC64249b
    /* renamed from: d */
    public boolean mo222631d() {
        return false;
    }

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void destroy() {
    }

    /* renamed from: i */
    private void m252540i() {
        this.mPhotoPagerFooterFL.setVisibility(8);
    }

    @Override // com.ss.lark.android.avatar.ui.AbstractC64247j.AbstractC64249b
    /* renamed from: e */
    public String mo222632e() {
        return this.f162327b.mo222645c();
    }

    @Override // com.ss.lark.android.avatar.ui.AbstractC64247j.AbstractC64249b
    /* renamed from: b */
    public void mo222628b() {
        if (this.f162327b.mo222644b()) {
            this.f162333h.show();
        }
    }

    @Override // com.ss.lark.android.avatar.ui.AbstractC64247j.AbstractC64249b
    /* renamed from: c */
    public void mo222630c() {
        LKUIToast.show(this.f162329d, (int) R.drawable.modify_avatar_success, (int) R.string.Lark_Legacy_UcropAvatarSucc);
    }

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void create() {
        this.f162327b.mo222642a(this);
        m252538g();
    }

    @Override // com.ss.lark.android.avatar.ui.AbstractC64247j.AbstractC64249b
    /* renamed from: a */
    public void mo222623a() {
        if (this.f162327b.mo222644b()) {
            this.f162333h.hide();
        }
    }

    /* renamed from: f */
    public void mo222633f() {
        int i = this.f162334i;
        if (i == 2) {
            this.f162328c = 2;
            this.f162327b.mo222643b(234);
        } else if (i == 1) {
            this.f162328c = 1;
            this.f162327b.mo222640a(234);
        }
    }

    /* renamed from: g */
    private void m252538g() {
        m252539h();
        if (!DesktopUtil.m144301a(this.f162329d)) {
            UIUtils.setStatusBarTransparent(this.f162329d);
        }
        this.f162333h = C57811b.m224340a(this.f162329d, (int) R.drawable.modify_avatar_loading, UIHelper.getString(R.string.Lark_Legacy_Uploading), true);
    }

    /* renamed from: h */
    private void m252539h() {
        this.f162332g = new C64245g(this.f162327b.mo222639a());
        if (this.f162331f == null) {
            AvatarCropFragment aVar = new AvatarCropFragment(this.f162335j);
            this.f162331f = aVar;
            aVar.mo222676a(new AvatarCropFragment.ICropAvatarCallback() {
                /* class com.ss.lark.android.avatar.ui.AvatarPickView.C642111 */

                @Override // com.ss.lark.android.avatar.ui.AvatarCropFragment.ICropAvatarCallback
                /* renamed from: b */
                public void mo222636b() {
                    AvatarPickView.this.mo222627a(true);
                }

                @Override // com.ss.lark.android.avatar.ui.AvatarCropFragment.ICropAvatarCallback
                /* renamed from: a */
                public void mo222634a() {
                    if (AvatarPickView.this.f162328c == 1) {
                        AvatarPickView.this.f162327b.mo222640a(234);
                    } else if (AvatarPickView.this.f162328c == 2) {
                        AvatarPickView.this.f162327b.mo222643b(234);
                    }
                }

                @Override // com.ss.lark.android.avatar.ui.AvatarCropFragment.ICropAvatarCallback
                /* renamed from: b */
                public void mo222637b(String str) {
                    Log.m165389i("AvatarPickView", "onCropSuccess: " + str);
                    LKUIToast.show(AvatarPickView.this.f162329d, str);
                }

                @Override // com.ss.lark.android.avatar.ui.AvatarCropFragment.ICropAvatarCallback
                /* renamed from: a */
                public void mo222635a(String str) {
                    Log.m165389i("AvatarPickView", "onCropSuccess: " + str);
                    if (AvatarPickView.this.f162330e == AvatarSource.EDIT_ALIAS) {
                        AvatarPickView.this.f162326a.mo222698a(str);
                    } else if (UIUtils.isActivityRunning((Activity) AvatarPickView.this.f162329d)) {
                        Intent intent = new Intent();
                        intent.putExtra("avatar_path", str);
                        AvatarPickView.this.f162327b.mo222641a(777, intent);
                    }
                }
            });
        }
        this.f162332g.mo222702a(this.f162331f);
        this.mMainVP.setAdapter(this.f162332g);
        this.mMainVP.setOffscreenPageLimit(this.f162332g.getCount() - 1);
        this.mMainVP.setPageMargin(UIHelper.dp2px(5.0f));
        if (DesktopUtil.m144301a(this.f162329d)) {
            this.mMainVP.post(new Runnable() {
                /* class com.ss.lark.android.avatar.ui.AvatarPickView.RunnableC642122 */

                public void run() {
                    AvatarPickView.this.mo222633f();
                }
            });
        } else {
            mo222633f();
        }
        m252540i();
    }

    /* renamed from: a */
    public void setViewDelegate(AbstractC64247j.AbstractC64249b.AbstractC64250a aVar) {
        this.f162326a = aVar;
    }

    @Override // com.ss.lark.android.avatar.ui.AbstractC64247j.AbstractC64249b
    /* renamed from: b */
    public void mo222629b(String str) {
        m252537a(str, false);
    }

    @Override // com.ss.lark.android.avatar.ui.AbstractC64247j.AbstractC64249b
    /* renamed from: a */
    public void mo222626a(String str) {
        LKUIToast.show(this.f162329d, str);
    }

    /* renamed from: a */
    private void m252537a(String str, boolean z) {
        this.f162331f.mo222677a(str);
        this.f162331f.mo222674a();
    }

    public AvatarPickView(Context context, int i, AvatarSource avatarSource, AbstractC64213a aVar) {
        boolean z;
        this.f162327b = aVar;
        this.f162334i = i;
        this.f162329d = context;
        this.f162330e = avatarSource;
        if (avatarSource == AvatarSource.MOMENTS || avatarSource == AvatarSource.PROFILE) {
            z = true;
        } else {
            z = false;
        }
        this.f162335j = z;
    }
}
