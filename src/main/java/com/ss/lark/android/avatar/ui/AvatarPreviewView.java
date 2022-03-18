package com.ss.lark.android.avatar.ui;

import android.animation.LayoutTransition;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.FragmentManager;
import butterknife.BindView;
import com.larksuite.component.ui.toast.LKUIToast;
import com.larksuite.component.universe_design.color.UDColorUtils;
import com.larksuite.component.universe_design.dialog.UDDialogBuilder;
import com.larksuite.framework.ui.ViewPagerWithoutScroll;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.desktopmode.utils.DesktopUtil;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.ui.CommonTitleBar;
import com.ss.android.lark.ui.CommonTitleBarConstants;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.lark.utils.p2905b.C57810a;
import com.ss.android.lark.utils.p2905b.C57811b;
import com.ss.android.lark.widget.listener.OnSingleClickListener;
import com.ss.android.lark.widget.photo_picker.entity.PhotoItem;
import com.ss.android.lark.widget.photo_picker.gallery.ImagePagerFragment;
import com.ss.android.lark.widget.photo_picker.gallery.callback.IOnCreateView;
import com.ss.lark.android.avatar.statistics.AvatarHit;
import com.ss.lark.android.avatar.ui.AbstractC64247j;
import com.ss.lark.android.avatar.ui.AvatarCropFragment;
import com.ss.lark.android.avatar.ui.IAvatarDecorationContract;
import java.util.Collections;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

public class AvatarPreviewView implements AbstractC64247j.AbstractC64249b {

    /* renamed from: a */
    public AbstractC64247j.AbstractC64249b.AbstractC64250a f162340a;

    /* renamed from: b */
    public final AbstractC64224a f162341b;

    /* renamed from: c */
    public ImagePagerFragment f162342c;

    /* renamed from: d */
    public AvatarSource f162343d;

    /* renamed from: e */
    public int f162344e = -1;

    /* renamed from: f */
    public final int f162345f;

    /* renamed from: g */
    public final List<PhotoItem> f162346g;

    /* renamed from: h */
    public final Context f162347h;

    /* renamed from: i */
    private AvatarCropFragment f162348i;

    /* renamed from: j */
    private C64245g f162349j;

    /* renamed from: k */
    private int f162350k;

    /* renamed from: l */
    private Dialog f162351l;

    /* renamed from: m */
    private final String f162352m;
    @BindView(6654)
    ViewPagerWithoutScroll mMainVP;
    @BindView(6655)
    ViewGroup mPhotoPagerFooterFL;
    @BindView(6945)
    CommonTitleBar mTitleBar;

    /* renamed from: n */
    private final int f162353n = 40;

    /* renamed from: o */
    private final boolean f162354o;

    /* renamed from: p */
    private DialogInterface.OnClickListener f162355p = new DialogInterface.OnClickListener() {
        /* class com.ss.lark.android.avatar.ui.AvatarPreviewView.DialogInterface$OnClickListenerC642141 */

        public void onClick(DialogInterface dialogInterface, int i) {
            AvatarPreviewView.this.f162340a.mo222699b(AvatarPreviewView.this.f162346g.get(0).getImageKey());
        }
    };

    /* renamed from: com.ss.lark.android.avatar.ui.AvatarPreviewView$a */
    public interface AbstractC64224a {
        /* renamed from: a */
        void mo222665a();

        /* renamed from: a */
        void mo222666a(ImagePagerFragment imagePagerFragment);

        /* renamed from: a */
        void mo222667a(AbstractC64247j.AbstractC64249b bVar);

        /* renamed from: a */
        void mo222668a(String str);

        /* renamed from: b */
        void mo222669b();

        /* renamed from: c */
        FragmentManager mo222670c();

        /* renamed from: d */
        boolean mo222671d();

        /* renamed from: e */
        void mo222672e();

        /* renamed from: f */
        String mo222673f();
    }

    /* renamed from: m */
    private void m252583m() {
    }

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void destroy() {
    }

    /* renamed from: l */
    private void m252582l() {
        this.mPhotoPagerFooterFL.setVisibility(8);
    }

    @Override // com.ss.lark.android.avatar.ui.AbstractC64247j.AbstractC64249b
    /* renamed from: e */
    public String mo222632e() {
        return this.f162341b.mo222673f();
    }

    /* renamed from: g */
    public IAvatarDecorationContract.IView mo222656g() {
        return new IAvatarDecorationContract.IView() {
            /* class com.ss.lark.android.avatar.ui.AvatarPreviewView.C642152 */

            /* renamed from: a */
            public void setViewDelegate(IAvatarDecorationContract.IView.IViewDelegate aVar) {
            }

            @Override // com.larksuite.framework.mvp.ILifecycle
            public void create() {
            }

            @Override // com.larksuite.framework.mvp.ILifecycle
            public void destroy() {
            }

            @Override // com.ss.lark.android.avatar.ui.IAvatarDecorationContract.IView
            /* renamed from: a */
            public void mo222659a(PhotoItem photoItem) {
                AvatarPreviewView.this.mo222624a(photoItem);
            }

            @Override // com.ss.lark.android.avatar.ui.IAvatarDecorationContract.IView
            /* renamed from: a */
            public void mo222661a(List<String> list) {
                AvatarPreviewView.this.mo222654a(list);
            }
        };
    }

    @Override // com.ss.lark.android.avatar.ui.AbstractC64247j.AbstractC64249b
    /* renamed from: a */
    public void mo222623a() {
        if (this.f162341b.mo222671d()) {
            this.f162351l.hide();
        }
    }

    @Override // com.ss.lark.android.avatar.ui.AbstractC64247j.AbstractC64249b
    /* renamed from: b */
    public void mo222628b() {
        if (this.f162341b.mo222671d()) {
            this.f162351l.show();
        }
    }

    @Override // com.ss.lark.android.avatar.ui.AbstractC64247j.AbstractC64249b
    /* renamed from: c */
    public void mo222630c() {
        LKUIToast.show(this.f162347h, (int) R.drawable.modify_avatar_success, (int) R.string.Lark_Legacy_UcropAvatarSucc);
    }

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void create() {
        this.f162341b.mo222667a(this);
        m252583m();
        m252579i();
        m252578h();
    }

    @Override // com.ss.lark.android.avatar.ui.AbstractC64247j.AbstractC64249b
    /* renamed from: d */
    public boolean mo222631d() {
        if (this.f162350k != 1) {
            return false;
        }
        mo222627a(true);
        return true;
    }

    /* renamed from: i */
    private void m252579i() {
        m252580j();
        m252581k();
        AvatarHit.m252531b();
        if (!DesktopUtil.m144301a(this.f162347h)) {
            UIUtils.setStatusBarTransparent(this.f162347h);
        }
        this.f162351l = C57811b.m224340a(this.f162347h, (int) R.drawable.modify_avatar_loading, UIHelper.getString(R.string.Lark_Legacy_Uploading), true);
        this.mPhotoPagerFooterFL.setLayoutTransition(new LayoutTransition());
    }

    /* renamed from: n */
    private void m252584n() {
        View inflate = LayoutInflater.from(this.f162347h).inflate(R.layout.avatar_modify_operation_layout, this.mPhotoPagerFooterFL, false);
        TextView textView = (TextView) inflate.findViewById(R.id.modify_text_view);
        textView.setText(R.string.Lark_ProfileMemo_DeleteImage);
        textView.setTextColor(UDColorUtils.getColor(this.f162347h, R.color.function_danger_500));
        textView.setOnClickListener(new View.OnClickListener() {
            /* class com.ss.lark.android.avatar.ui.$$Lambda$AvatarPreviewView$qL5fIN5WquuVFn6AAzfXskTKsJE */

            public final void onClick(View view) {
                AvatarPreviewView.this.m252576a((AvatarPreviewView) view);
            }
        });
        this.mPhotoPagerFooterFL.addView(inflate);
    }

    /* renamed from: h */
    private void m252578h() {
        if (DesktopUtil.m144307b()) {
            this.mTitleBar.setVisibility(0);
            this.mTitleBar.setBackgroundColor(UIHelper.getColor(R.color.lkui_N900));
            this.mTitleBar.setLeftVisible(true);
            this.mTitleBar.setLeftImageResource(CommonTitleBarConstants.ICON_BACK, R.color.static_white);
            this.mTitleBar.setHeight(UIHelper.dp2px(40.0f));
            this.mTitleBar.setLeftClickListener(new View.OnClickListener() {
                /* class com.ss.lark.android.avatar.ui.AvatarPreviewView.View$OnClickListenerC642163 */

                public void onClick(View view) {
                    AvatarPreviewView.this.f162341b.mo222672e();
                }
            });
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.mMainVP.getLayoutParams();
            marginLayoutParams.bottomMargin = UIHelper.dp2px((float) 18);
            this.mMainVP.setLayoutParams(marginLayoutParams);
            ((View) this.mTitleBar.getParent()).setBackgroundColor(UIHelper.getColor(R.color.lkui_N1000));
        }
    }

    /* renamed from: j */
    private void m252580j() {
        this.f162349j = new C64245g(this.f162341b.mo222670c());
        if (this.f162342c == null) {
            this.f162342c = new ImagePagerFragment();
        }
        if (this.f162348i == null) {
            AvatarCropFragment aVar = new AvatarCropFragment(this.f162354o);
            this.f162348i = aVar;
            aVar.mo222676a(new AvatarCropFragment.ICropAvatarCallback() {
                /* class com.ss.lark.android.avatar.ui.AvatarPreviewView.C642174 */

                @Override // com.ss.lark.android.avatar.ui.AvatarCropFragment.ICropAvatarCallback
                /* renamed from: b */
                public void mo222636b() {
                    AvatarPreviewView.this.mo222627a(true);
                }

                @Override // com.ss.lark.android.avatar.ui.AvatarCropFragment.ICropAvatarCallback
                /* renamed from: a */
                public void mo222634a() {
                    if (AvatarPreviewView.this.f162344e == 1) {
                        AvatarPreviewView.this.mo222627a(true);
                        return;
                    }
                    AvatarPreviewView.this.f162341b.mo222669b();
                    AvatarPreviewView.this.mPhotoPagerFooterFL.postDelayed(new Runnable() {
                        /* class com.ss.lark.android.avatar.ui.AvatarPreviewView.C642174.RunnableC642181 */

                        public void run() {
                            AvatarPreviewView.this.mo222627a(false);
                        }
                    }, 1000);
                }

                @Override // com.ss.lark.android.avatar.ui.AvatarCropFragment.ICropAvatarCallback
                /* renamed from: a */
                public void mo222635a(String str) {
                    Log.m165389i("AvatarPreviewView", "onCropSuccess: " + str);
                    AvatarPreviewView.this.f162340a.mo222698a(str);
                }

                @Override // com.ss.lark.android.avatar.ui.AvatarCropFragment.ICropAvatarCallback
                /* renamed from: b */
                public void mo222637b(String str) {
                    Log.m165389i("AvatarPreviewView", "onCropSuccess: " + str);
                    LKUIToast.show(AvatarPreviewView.this.f162347h, str);
                }
            });
        }
        this.f162349j.mo222702a(this.f162342c);
        this.f162349j.mo222702a(this.f162348i);
        this.mMainVP.setAdapter(this.f162349j);
        this.mMainVP.setOffscreenPageLimit(this.f162349j.getCount() - 1);
        this.mMainVP.setPageMargin(UIHelper.dp2px(5.0f));
        mo222627a(false);
        this.f162342c.mo198949a(new IOnCreateView() {
            /* class com.ss.lark.android.avatar.ui.AvatarPreviewView.C642195 */

            @Override // com.ss.android.lark.widget.photo_picker.gallery.callback.IOnCreateView
            /* renamed from: a */
            public void mo198481a() {
                AvatarPreviewView.this.f162342c.mo198939a();
                AvatarPreviewView.this.f162342c.mo198954a(AvatarPreviewView.this.f162346g, AvatarPreviewView.this.f162345f);
                AvatarPreviewView.this.f162342c.mo198975j().setCurrentItem(AvatarPreviewView.this.f162345f);
                AvatarPreviewView.this.f162342c.mo198969g(false);
                AvatarPreviewView.this.f162342c.mo198961c();
                if (!DesktopUtil.m144301a(AvatarPreviewView.this.f162347h)) {
                    AvatarPreviewView.this.f162341b.mo222666a(AvatarPreviewView.this.f162342c);
                }
            }
        });
    }

    /* renamed from: k */
    private void m252581k() {
        this.mPhotoPagerFooterFL.removeAllViews();
        View inflate = UIHelper.inflate(R.layout.avatar_modify_operation_layout, this.mPhotoPagerFooterFL);
        TextView textView = (TextView) inflate.findViewById(R.id.modify_text_view);
        textView.setText(this.f162352m);
        inflate.setOnClickListener(new View.OnClickListener() {
            /* class com.ss.lark.android.avatar.ui.AvatarPreviewView.View$OnClickListenerC642206 */

            public void onClick(View view) {
                if (!DesktopUtil.m144301a(AvatarPreviewView.this.f162347h)) {
                    AvatarHit.m252530a(AvatarPreviewView.this.f162343d);
                    AvatarPreviewView.this.mo222655f();
                    return;
                }
                AvatarPreviewView.this.f162341b.mo222669b();
            }
        });
        this.mPhotoPagerFooterFL.setVisibility(0);
        if (DesktopUtil.m144307b()) {
            inflate.getLayoutParams().height = UIHelper.dp2px(40.0f);
            textView.setTextSize(14.0f);
            this.mPhotoPagerFooterFL.findViewById(R.id.divider_button).setVisibility(8);
        }
        if (this.f162343d == AvatarSource.EDIT_ALIAS) {
            m252584n();
        }
    }

    /* renamed from: f */
    public void mo222655f() {
        if (this.f162341b.mo222671d()) {
            View inflate = UIHelper.inflate(R.layout.modify_avatar_bottom_popupwindow, null);
            final Dialog a = C57811b.m224341a(this.f162347h, inflate);
            C57810a.m224336a(this.f162347h, a);
            inflate.findViewById(R.id.take_picture_tv).setOnClickListener(new OnSingleClickListener() {
                /* class com.ss.lark.android.avatar.ui.AvatarPreviewView.C642217 */

                @Override // com.ss.android.lark.widget.listener.OnSingleClickListener
                public void onSingleClick(View view) {
                    Dialog dialog = a;
                    if (dialog != null) {
                        dialog.dismiss();
                    }
                    Log.m165389i("AvatarPreviewView", "showModifyAvatarPopup going to take picture");
                    AvatarPreviewView.this.f162344e = 1;
                    AvatarPreviewView.this.f162341b.mo222665a();
                    AvatarHit.m252534c(AvatarPreviewView.this.f162343d);
                }
            });
            inflate.findViewById(R.id.select_from_gallery_tv).setOnClickListener(new OnSingleClickListener() {
                /* class com.ss.lark.android.avatar.ui.AvatarPreviewView.C642228 */

                @Override // com.ss.android.lark.widget.listener.OnSingleClickListener
                public void onSingleClick(View view) {
                    Dialog dialog = a;
                    if (dialog != null) {
                        dialog.dismiss();
                    }
                    Log.m165389i("AvatarPreviewView", "showModifyAvatarPopup going to select from gallery");
                    AvatarPreviewView.this.f162344e = 2;
                    AvatarPreviewView.this.f162341b.mo222669b();
                    AvatarHit.m252535d(AvatarPreviewView.this.f162343d);
                }
            });
            inflate.findViewById(R.id.cancel_tv).setOnClickListener(new OnSingleClickListener() {
                /* class com.ss.lark.android.avatar.ui.AvatarPreviewView.C642239 */

                @Override // com.ss.android.lark.widget.listener.OnSingleClickListener
                public void onSingleClick(View view) {
                    Dialog dialog = a;
                    if (dialog != null) {
                        dialog.dismiss();
                    }
                    Log.m165389i("AvatarPreviewView", "showModifyAvatarPopup cancel");
                    AvatarHit.m252536e(AvatarPreviewView.this.f162343d);
                }
            });
            AvatarHit.m252532b(this.f162343d);
        }
    }

    /* renamed from: a */
    public void setViewDelegate(AbstractC64247j.AbstractC64249b.AbstractC64250a aVar) {
        this.f162340a = aVar;
    }

    @Override // com.ss.lark.android.avatar.ui.AbstractC64247j.AbstractC64249b
    /* renamed from: b */
    public void mo222629b(String str) {
        m252577a(str, false);
    }

    @Override // com.ss.lark.android.avatar.ui.AbstractC64247j.AbstractC64249b
    /* renamed from: a */
    public void mo222624a(PhotoItem photoItem) {
        C64246h.m252677a(this.f162342c, new Function1(Collections.singletonList(photoItem)) {
            /* class com.ss.lark.android.avatar.ui.$$Lambda$AvatarPreviewView$M0kDsjqJr5Jm2bHYyqqy06Cc9M */
            public final /* synthetic */ List f$0;

            {
                this.f$0 = r1;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AvatarPreviewView.m252575a(this.f$0, (ImagePagerFragment) obj);
            }
        });
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: a */
    private /* synthetic */ void m252576a(View view) {
        ((UDDialogBuilder) ((UDDialogBuilder) ((UDDialogBuilder) new UDDialogBuilder(this.f162347h).message(UIHelper.getString(R.string.Lark_ProfileMemo_DeleteThisImage_PopupText))).addActionButton(R.id.ud_dialog_btn_primary, R.string.Lark_ProfileMemo_DeleteThisImage_DeleteButton, this.f162355p)).addActionButton(R.id.ud_dialog_btn_secondary, R.string.Lark_ProfileMemo_DeleteThisImage_GoBack_Button, (DialogInterface.OnClickListener) null)).show();
    }

    @Override // com.ss.lark.android.avatar.ui.AbstractC64247j.AbstractC64249b
    /* renamed from: a */
    public void mo222626a(String str) {
        LKUIToast.show(this.f162347h, str);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo222654a(final List<String> list) {
        View inflate = LayoutInflater.from(this.f162347h).inflate(R.layout.avatar_modify_operation_layout, this.mPhotoPagerFooterFL, false);
        TextView textView = (TextView) inflate.findViewById(R.id.modify_text_view);
        textView.setText(R.string.Lark_Profile_DecorateProfilePhoto);
        textView.setOnClickListener(new View.OnClickListener() {
            /* class com.ss.lark.android.avatar.ui.AvatarPreviewView.AnonymousClass10 */

            public void onClick(View view) {
                AvatarPreviewView.this.f162341b.mo222668a((String) list.get(0));
            }
        });
        this.mPhotoPagerFooterFL.addView(inflate);
    }

    @Override // com.ss.lark.android.avatar.ui.AbstractC64247j.AbstractC64249b
    /* renamed from: a */
    public void mo222627a(boolean z) {
        this.mMainVP.setCurrentItem(0, z);
        this.f162350k = 0;
        this.mPhotoPagerFooterFL.setVisibility(0);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ Unit m252575a(List list, ImagePagerFragment imagePagerFragment) {
        imagePagerFragment.mo198954a(list, 0);
        return Unit.INSTANCE;
    }

    /* renamed from: a */
    private void m252577a(String str, boolean z) {
        this.f162348i.mo222677a(str);
        this.f162341b.mo222670c().beginTransaction().detach(this.f162348i).attach(this.f162348i).commitAllowingStateLoss();
        this.mMainVP.setCurrentItem(1, z);
        m252582l();
        this.f162350k = 1;
    }

    public AvatarPreviewView(Context context, int i, List<PhotoItem> list, String str, AbstractC64224a aVar, AvatarSource avatarSource) {
        boolean z;
        this.f162341b = aVar;
        this.f162345f = i;
        this.f162346g = list;
        this.f162352m = str;
        this.f162347h = context;
        this.f162343d = avatarSource;
        if (avatarSource == AvatarSource.PROFILE || avatarSource == AvatarSource.MOMENTS) {
            z = true;
        } else {
            z = false;
        }
        this.f162354o = z;
    }
}
