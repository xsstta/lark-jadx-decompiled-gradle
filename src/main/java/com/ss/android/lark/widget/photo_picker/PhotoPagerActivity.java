package com.ss.android.lark.widget.photo_picker;

import android.animation.Animator;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.ActionBar;
import androidx.viewpager.widget.ViewPager;
import com.larksuite.component.ui.p1153e.C25653b;
import com.larksuite.framework.utils.CollectionUtils;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.appreciablelib.Biz;
import com.ss.android.lark.appreciablelib.Scene;
import com.ss.android.lark.base.fragment.BaseFragmentActivity;
import com.ss.android.lark.desktopmode.utils.DesktopUtil;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.monitor.p2372a.C48211b;
import com.ss.android.lark.utils.StatusBarUtil;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.lark.widget.listener.OnSingleClickListener;
import com.ss.android.lark.widget.photo_picker.animation.AbstractC58594b;
import com.ss.android.lark.widget.photo_picker.animation.BaseData;
import com.ss.android.lark.widget.photo_picker.animation.C58595c;
import com.ss.android.lark.widget.photo_picker.entity.PhotoItem;
import com.ss.android.lark.widget.photo_picker.gallery.ImagePagerFragment;
import com.ss.android.lark.widget.photo_picker.gallery.callback.IOnCreateView;
import com.ss.android.lark.widget.photo_picker.gallery.callback.OnChatAlbumClickListener;
import com.ss.android.lark.widget.photo_picker.gallery.callback.OnDialogMenuClickListener;
import com.ss.android.lark.widget.photo_picker.gallery.callback.OnLoadMoreListener;
import com.ss.android.lark.widget.photo_picker.p2951f.C58648a;
import com.ss.android.lark.widget.photo_picker.p2951f.C58660i;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

public class PhotoPagerActivity extends BaseFragmentActivity {

    /* renamed from: a */
    public ImagePagerFragment f144533a;

    /* renamed from: b */
    public List<PhotoItem> f144534b;

    /* renamed from: c */
    private ActionBar f144535c;

    /* renamed from: d */
    private AbstractC58594b f144536d;

    /* renamed from: e */
    private Bundle f144537e;

    /* renamed from: f */
    private int f144538f;

    /* renamed from: g */
    private boolean f144539g;

    /* renamed from: h */
    private boolean f144540h;

    /* renamed from: i */
    private boolean f144541i;

    /* renamed from: j */
    private FrameLayout f144542j;

    /* renamed from: k */
    private TextView f144543k;

    /* renamed from: l */
    private boolean f144544l;

    /* renamed from: m */
    private OnDialogMenuClickListener f144545m;

    /* renamed from: n */
    private OnLoadMoreListener f144546n;

    /* renamed from: o */
    private OnChatAlbumClickListener f144547o;

    /* renamed from: p */
    private boolean f144548p;

    /* renamed from: q */
    private final Animator.AnimatorListener f144549q = new Animator.AnimatorListener() {
        /* class com.ss.android.lark.widget.photo_picker.PhotoPagerActivity.C585501 */

        public void onAnimationCancel(Animator animator) {
        }

        public void onAnimationRepeat(Animator animator) {
        }

        public void onAnimationStart(Animator animator) {
        }

        public void onAnimationEnd(Animator animator) {
            PhotoPagerActivity.this.setRequestedOrientation(-1);
        }
    };

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.base.fragment.BaseFragmentActivity
    public boolean isDoAnimationWithDefault() {
        return false;
    }

    /* renamed from: d */
    public static void m227098d() {
        try {
            C58612c.m227290a().mo102846a("picbrowser_view");
        } catch (Throwable th) {
            Log.m165382e(th.getMessage());
        }
    }

    /* renamed from: e */
    public void mo198472e() {
        int i;
        boolean z;
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            String str = (String) C58595c.m227250a(this, "APPLICATION_ID");
            int value = BaseData.AnimationType.TRANSLATE_ANIMATION.getValue();
            if (DesktopUtil.m144301a((Context) this)) {
                i = value;
            } else {
                i = extras.getInt(str + ".animationtype", value);
            }
            if (i == value) {
                z = true;
            } else {
                z = false;
            }
            this.f144533a.mo198974i(z);
        }
    }

    /* renamed from: g */
    public void mo198474g() {
        if (this.f144535c != null) {
            HashMap hashMap = new HashMap();
            hashMap.put("index_first", Integer.toString(this.f144533a.mo198975j().getCurrentItem() + 1));
            hashMap.put("index_second", Integer.toString(this.f144533a.mo198977k().size()));
            this.f144535c.mo697a(UIHelper.mustacheFormat((int) R.string.Lark_Legacy_PickerImageIndex, hashMap));
        }
    }

    @Override // androidx.activity.ComponentActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void onBackPressed() {
        if (this.f144540h) {
            mo198473f();
            return;
        }
        if (this.f144536d == null || this.f144548p || (this.f144544l && this.f144538f != this.f144533a.mo198979l())) {
            finish();
            if (this.f144544l) {
                overridePendingTransition(0, 0);
            }
        } else {
            this.f144536d.mo198586a(new Animator.AnimatorListener() {
                /* class com.ss.android.lark.widget.photo_picker.PhotoPagerActivity.C585545 */

                public void onAnimationCancel(Animator animator) {
                }

                public void onAnimationRepeat(Animator animator) {
                }

                public void onAnimationStart(Animator animator) {
                    if (PhotoPagerActivity.this.f144533a != null) {
                        PhotoPagerActivity.this.f144533a.mo198982n();
                    }
                }

                public void onAnimationEnd(Animator animator) {
                    Intent intent = new Intent();
                    ArrayList<PhotoItem> k = PhotoPagerActivity.this.f144533a.mo198977k();
                    if (k != null) {
                        ArrayList arrayList = new ArrayList();
                        Iterator<PhotoItem> it = k.iterator();
                        while (it.hasNext()) {
                            arrayList.add(it.next().getCurrentUrl());
                        }
                        intent.putExtra("SELECTED_PHOTOS", arrayList);
                        PhotoPagerActivity.this.setResult(-1, intent);
                        PhotoPagerActivity.this.overridePendingTransition(0, 0);
                        PhotoPagerActivity.this.finish();
                    }
                }
            });
            this.f144536d.mo198587a(this);
        }
        StatusBarUtil.showStatusBar(this);
    }

    /* renamed from: a */
    private boolean mo198465a() {
        Bundle extras = getIntent().getExtras();
        this.f144537e = extras;
        if (extras == null) {
            return false;
        }
        this.f144538f = getIntent().getIntExtra("current_item", 0);
        this.f144539g = getIntent().getBooleanExtra("is_mute", false);
        this.f144545m = (OnDialogMenuClickListener) getIntent().getSerializableExtra("item_click_listener");
        this.f144546n = (OnLoadMoreListener) getIntent().getSerializableExtra("load_more_listener");
        this.f144547o = (OnChatAlbumClickListener) getIntent().getSerializableExtra("chat_album_listener");
        if (getIntent().getBooleanExtra("direct_pass_photo_data", false)) {
            this.f144534b = (List) getIntent().getSerializableExtra("photos_preview");
        } else {
            this.f144534b = C58660i.m227526a(this.f144537e, "key_photos_preview");
        }
        if (CollectionUtils.isEmpty(this.f144534b)) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    private void mo198467b() {
        FrameLayout frameLayout = (FrameLayout) findViewById(R.id.photoPagerHeader);
        this.f144542j = frameLayout;
        frameLayout.setVisibility(0);
        this.f144543k = (TextView) findViewById(R.id.tvIndex);
        if (this.f144540h) {
            this.f144542j.setBackgroundColor(C25653b.m91894a(this, R.color.lkui_N1000, 0.3f));
            ((ImageView) findViewById(R.id.ivDelete)).setVisibility(0);
            return;
        }
        this.f144542j.setBackgroundColor(UIUtils.getColor(this, R.color.lkui_transparent));
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f144543k.getLayoutParams();
        layoutParams.gravity = 1;
        layoutParams.topMargin = UIUtils.dp2px(this, 16.0f);
        int dp2px = UIUtils.dp2px(this, 2.0f);
        int dp2px2 = UIUtils.dp2px(this, 6.0f);
        this.f144543k.setPadding(dp2px2, dp2px, dp2px2, dp2px);
        this.f144543k.setBackgroundResource(R.drawable.bg_photo_header_index_label);
    }

    /* renamed from: f */
    public void mo198473f() {
        Intent intent = new Intent();
        ArrayList arrayList = new ArrayList();
        for (PhotoItem photoItem : this.f144534b) {
            arrayList.add(photoItem.getCurrentUrl());
        }
        intent.putExtra("SELECTED_PHOTOS", arrayList);
        setResult(-1, intent);
        if (this.f144536d == null || this.f144548p || (this.f144544l && this.f144538f != this.f144533a.mo198979l())) {
            finish();
            if (this.f144544l) {
                overridePendingTransition(0, 0);
            }
        } else {
            this.f144536d.mo198586a(new Animator.AnimatorListener() {
                /* class com.ss.android.lark.widget.photo_picker.PhotoPagerActivity.C585556 */

                public void onAnimationCancel(Animator animator) {
                }

                public void onAnimationRepeat(Animator animator) {
                }

                public void onAnimationEnd(Animator animator) {
                    PhotoPagerActivity.this.overridePendingTransition(0, 0);
                    PhotoPagerActivity.this.finish();
                }

                public void onAnimationStart(Animator animator) {
                    if (PhotoPagerActivity.this.f144533a != null) {
                        PhotoPagerActivity.this.f144533a.mo198982n();
                    }
                }
            });
            this.f144536d.mo198587a(this);
        }
        StatusBarUtil.showStatusBar(this);
    }

    /* renamed from: h */
    public void mo198475h() {
        if (this.f144540h || this.f144541i) {
            if (this.f144542j == null) {
                mo198467b();
            }
            int l = this.f144533a.mo198979l() + 1;
            int size = this.f144534b.size();
            if (size <= 0) {
                this.f144543k.setText("");
                return;
            }
            SpannableString spannableString = new SpannableString(l + " / " + size);
            spannableString.setSpan(new CharacterStyle() {
                /* class com.ss.android.lark.widget.photo_picker.PhotoPagerActivity.C585567 */

                public void updateDrawState(TextPaint textPaint) {
                    textPaint.setFakeBoldText(true);
                }
            }, 0, spannableString.length(), 33);
            this.f144543k.setText(spannableString);
        }
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (configuration.orientation == 2) {
            this.f144548p = true;
        } else {
            this.f144548p = false;
        }
    }

    /* access modifiers changed from: protected */
    @Override // androidx.fragment.app.FragmentActivity
    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        setIntent(intent);
        mo198465a();
        m227097c(null);
    }

    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        C48211b.m190251a().mo168690c();
    }

    /* renamed from: c */
    private void m227097c(final Bundle bundle) {
        ImagePagerFragment a = C58660i.m227525a(this);
        this.f144533a = a;
        if (a.mo198960b()) {
            mo198471a(bundle);
            mo198472e();
        }
        this.f144533a.mo198949a(new IOnCreateView() {
            /* class com.ss.android.lark.widget.photo_picker.PhotoPagerActivity.C585523 */

            @Override // com.ss.android.lark.widget.photo_picker.gallery.callback.IOnCreateView
            /* renamed from: a */
            public void mo198481a() {
                PhotoPagerActivity.this.mo198471a(bundle);
                PhotoPagerActivity.this.mo198472e();
            }
        });
    }

    @Override // androidx.core.app.ComponentActivity, androidx.appcompat.app.AppCompatActivity
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        ImagePagerFragment imagePagerFragment;
        if (!DesktopUtil.m144301a((Context) this) || (imagePagerFragment = this.f144533a) == null) {
            return super.dispatchKeyEvent(keyEvent);
        }
        return imagePagerFragment.mo198956a(keyEvent);
    }

    /* renamed from: b */
    private void m227096b(Bundle bundle) {
        m227097c(bundle);
        ActionBar supportActionBar = getSupportActionBar();
        this.f144535c = supportActionBar;
        if (supportActionBar != null) {
            supportActionBar.mo698a(true);
            mo198474g();
            if (Build.VERSION.SDK_INT >= 21) {
                this.f144535c.mo694a(25.0f);
            }
        }
        UIUtils.setStatusBarTransparent(this);
        findViewById(R.id.ivDelete).setOnClickListener(new OnSingleClickListener() {
            /* class com.ss.android.lark.widget.photo_picker.PhotoPagerActivity.C585512 */

            @Override // com.ss.android.lark.widget.listener.OnSingleClickListener
            public void onSingleClick(View view) {
                PhotoPagerActivity.this.f144534b.remove(PhotoPagerActivity.this.f144533a.mo198979l());
                if (PhotoPagerActivity.this.f144534b.isEmpty()) {
                    PhotoPagerActivity.this.mo198473f();
                    return;
                }
                PhotoPagerActivity.this.f144533a.mo198939a();
                PhotoPagerActivity.this.f144533a.mo198954a(PhotoPagerActivity.this.f144534b, Math.min(PhotoPagerActivity.this.f144533a.mo198979l(), PhotoPagerActivity.this.f144534b.size() - 1));
            }
        });
    }

    /* access modifiers changed from: protected */
    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.larksuite.component.air.AirActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void onCreate(Bundle bundle) {
        C48211b.m190252a("PhotoPagerActivity").mo168688b();
        C48211b.m190251a().mo168689b("setContentView");
        StatusBarUtil.hideStatusBar(this);
        super.onCreate(bundle);
        setContentView(R.layout.__picker_activity_photo_pager);
        C48211b.m190251a().mo168691c("setContentView");
        if (!mo198465a()) {
            finish();
            C48211b.m190251a().mo168693e();
        }
        m227096b(bundle);
    }

    /* renamed from: a */
    public void mo198471a(Bundle bundle) {
        AbstractC58594b bVar;
        OnDialogMenuClickListener onDialogMenuClickListener = this.f144545m;
        if (onDialogMenuClickListener != null) {
            this.f144533a.mo198947a(onDialogMenuClickListener);
        }
        OnLoadMoreListener onLoadMoreListener = this.f144546n;
        if (onLoadMoreListener != null) {
            this.f144533a.mo198948a(onLoadMoreListener);
        }
        OnChatAlbumClickListener onChatAlbumClickListener = this.f144547o;
        if (onChatAlbumClickListener != null) {
            this.f144533a.mo198946a(onChatAlbumClickListener);
        }
        boolean z = true;
        boolean z2 = this.f144537e.getBoolean("show_save", true);
        if (C58612c.m227290a().mo102864g()) {
            z2 = false;
        }
        boolean z3 = this.f144537e.getBoolean("show_jump_chat", true);
        String string = this.f144537e.getString("jump_chat_btn_text");
        boolean z4 = this.f144537e.getBoolean("show_save_to_driver", true);
        boolean z5 = this.f144537e.getBoolean("show_show_forward", false);
        boolean z6 = this.f144537e.getBoolean("show_translation", false);
        boolean z7 = this.f144537e.getBoolean("show_qr_code", true);
        boolean z8 = this.f144537e.getBoolean("is_secret", false);
        this.f144541i = this.f144537e.getBoolean("show_photo_index_label", false);
        this.f144540h = this.f144537e.getBoolean("show_photo_title_bar", false);
        this.f144544l = this.f144537e.getBoolean("exit_anim_limit", false);
        boolean z9 = this.f144537e.getBoolean("enable_long_click", true);
        this.f144533a.mo198962c(z2);
        this.f144533a.mo198959b(z2);
        this.f144533a.mo198966e(z3);
        this.f144533a.mo198953a(string);
        this.f144533a.mo198955a(z5);
        this.f144533a.mo198972h(z4);
        this.f144533a.mo198968f(z6);
        this.f144533a.mo198969g(z7);
        this.f144533a.mo198976j(z8);
        this.f144533a.mo198954a(this.f144534b, this.f144538f);
        this.f144533a.mo198978k(this.f144540h);
        this.f144533a.mo198980l(z9);
        if (!C58612c.m227290a().mo102854b("messenger.show.chat.album") || !this.f144537e.getBoolean("show_view_chat_image", false)) {
            z = false;
        }
        this.f144533a.mo198964d(z);
        this.f144533a.mo198942a((Biz) this.f144537e.getSerializable("biz"));
        this.f144533a.mo198943a((Scene) this.f144537e.getSerializable("scene"));
        this.f144533a.mo198957b(this.f144537e.getInt("from_type", 0));
        mo198475h();
        if (this.f144539g) {
            this.f144533a.mo198981m();
        }
        this.f144533a.mo198975j().setCurrentItem(this.f144533a.mo198979l());
        this.f144533a.mo198961c();
        if (DesktopUtil.m144301a((Context) this)) {
            bVar = null;
        } else {
            bVar = C58648a.m227465a(this.f144533a, getIntent(), bundle, this.f144549q);
        }
        this.f144536d = bVar;
        this.f144533a.mo198975j().addOnPageChangeListener(new ViewPager.C1581f() {
            /* class com.ss.android.lark.widget.photo_picker.PhotoPagerActivity.C585534 */

            @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener, androidx.viewpager.widget.ViewPager.C1581f
            public void onPageSelected(int i) {
                PhotoPagerActivity.m227098d();
            }

            @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener, androidx.viewpager.widget.ViewPager.C1581f
            public void onPageScrolled(int i, float f, int i2) {
                PhotoPagerActivity.this.mo198475h();
                PhotoPagerActivity.this.mo198474g();
            }
        });
        m227098d();
    }

    /* access modifiers changed from: protected */
    @Override // androidx.activity.ComponentActivity, androidx.fragment.app.FragmentActivity
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        ImagePagerFragment imagePagerFragment = this.f144533a;
        if (imagePagerFragment != null) {
            imagePagerFragment.onActivityResult(i, i2, intent);
        }
    }
}
