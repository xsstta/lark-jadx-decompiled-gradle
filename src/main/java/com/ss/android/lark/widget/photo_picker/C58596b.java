package com.ss.android.lark.widget.photo_picker;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.larksuite.component.ui.p1153e.C25653b;
import com.larksuite.component.ui.toast.LKUIToast;
import com.larksuite.framework.utils.DeviceUtils;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.framework.utils.file.direct.DirectFileAccess;
import com.larksuite.suite.R;
import com.ss.android.lark.base.fragment.BaseFragment;
import com.ss.android.lark.cameraview.AbstractC32798i;
import com.ss.android.lark.cameraview.C32771d;
import com.ss.android.lark.cameraview.C32780e;
import com.ss.android.lark.cameraview.blacklist.CameraTypeBlackListManager;
import com.ss.android.lark.desktopmode.utils.DesktopUtil;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.permission.C51327f;
import com.ss.android.lark.utils.C57881t;
import com.ss.android.lark.utils.StatusBarUtil;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.lark.utils.ao;
import com.ss.android.lark.utils.rxjava.C57865c;
import com.ss.android.lark.widget.photo_picker.C58612c;
import com.ss.android.lark.widget.photo_picker.adapter.PhotoPickerUIConstants;
import com.ss.android.lark.widget.photo_picker.entity.Photo;
import com.ss.android.lark.widget.photo_picker.entity.PhotoItem;
import com.ss.android.lark.widget.photo_picker.gallery.ImagePagerFragment;
import com.ss.android.lark.widget.photo_picker.p2943a.C58564b;
import com.ss.android.lark.widget.photo_picker.p2947b.AbstractC58609a;
import com.ss.android.lark.widget.photo_picker.p2947b.AbstractC58610b;
import com.ss.android.lark.widget.photo_picker.p2948c.C58618b;
import com.ss.android.lark.widget.photo_picker.p2951f.C58652c;
import com.ss.android.lark.widget.photo_picker.statistics.ImagePreviewHitPoint;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: com.ss.android.lark.widget.photo_picker.b */
public class C58596b extends BaseFragment {

    /* renamed from: A */
    private View f144693A;

    /* renamed from: B */
    private TextView f144694B;

    /* renamed from: C */
    private ImageView f144695C;

    /* renamed from: D */
    private TextView f144696D;

    /* renamed from: E */
    private TextView f144697E;

    /* renamed from: F */
    private TextView f144698F;

    /* renamed from: G */
    private CheckBox f144699G;

    /* renamed from: H */
    private TextView f144700H;

    /* renamed from: I */
    private ViewGroup f144701I;

    /* renamed from: J */
    private LinearLayout f144702J;

    /* renamed from: K */
    private CompoundButton.OnCheckedChangeListener f144703K;

    /* renamed from: L */
    private Button f144704L;

    /* renamed from: M */
    private boolean f144705M;

    /* renamed from: a */
    public Activity f144706a;

    /* renamed from: b */
    public int f144707b = 9;

    /* renamed from: c */
    public int f144708c = -1;

    /* renamed from: d */
    public boolean f144709d;

    /* renamed from: e */
    public int f144710e;

    /* renamed from: f */
    public boolean f144711f;

    /* renamed from: g */
    public View f144712g;

    /* renamed from: h */
    public CheckBox f144713h;

    /* renamed from: i */
    public C58618b f144714i;

    /* renamed from: j */
    public ImagePagerFragment f144715j;

    /* renamed from: k */
    private View f144716k;

    /* renamed from: l */
    private int f144717l;

    /* renamed from: m */
    private boolean f144718m;

    /* renamed from: n */
    private boolean f144719n;

    /* renamed from: o */
    private boolean f144720o = true;

    /* renamed from: p */
    private boolean f144721p;

    /* renamed from: q */
    private boolean f144722q;

    /* renamed from: r */
    private boolean f144723r;

    /* renamed from: s */
    private int f144724s = 4;

    /* renamed from: t */
    private ArrayList<Photo> f144725t;

    /* renamed from: u */
    private boolean f144726u;

    /* renamed from: v */
    private boolean f144727v;

    /* renamed from: w */
    private int f144728w;

    /* renamed from: x */
    private boolean f144729x = true;

    /* renamed from: y */
    private int f144730y = 1;

    /* renamed from: z */
    private C58652c f144731z;

    /* renamed from: a */
    public boolean mo198611a(Photo photo, C58564b bVar) {
        if (this.f144706a == null) {
            return false;
        }
        if (bVar.mo198543f()) {
            if (photo.isVideo()) {
                LKUIToast.show(this.f144706a, (int) R.string.Lark_Legacy_PickerJustOneVideoTip);
            } else {
                LKUIToast.show(this.f144706a, (int) R.string.Lark_Legacy_SelectPhotosOrVideosError);
            }
            return true;
        } else if (!photo.isVideo()) {
            return false;
        } else {
            LKUIToast.show(this.f144706a, (int) R.string.Lark_Legacy_SelectPhotosOrVideosError);
            return true;
        }
    }

    /* renamed from: k */
    private void m227259k() {
        if (!DesktopUtil.m144301a((Context) this.f144706a)) {
            View findViewById = this.f144716k.findViewById(R.id.layout_title);
            StatusBarUtil.setTranslucentForImageView(this.f144706a, 178, findViewById);
        }
    }

    /* renamed from: l */
    private void m227260l() {
        ImagePreviewHitPoint.m228133d();
        C58612c.m227290a().mo102865h();
        if (this.f144717l != 1) {
            mo198614b(false);
        } else if (!this.f144719n) {
            mo198603a();
        } else {
            mo198614b(true);
        }
    }

    /* renamed from: m */
    private void m227261m() {
        C586089 r0 = new AbstractC58609a() {
            /* class com.ss.android.lark.widget.photo_picker.C58596b.C586089 */

            @Override // com.ss.android.lark.widget.photo_picker.p2947b.AbstractC58609a
            /* renamed from: a */
            public boolean mo147717a(int i, Photo photo, int i2) {
                int i3;
                boolean z;
                boolean z2 = true;
                if (C58596b.this.f144708c == -1 || (C58596b.this.f144707b > 1 && !C58596b.this.f144714i.mo198648e().mo198543f())) {
                    C58596b.this.f144710e = i2;
                    if (C58596b.this.f144707b <= 1) {
                        C58596b.this.f144710e = i2;
                        List<Photo> c = C58596b.this.f144714i.mo198648e().mo198540c();
                        if (!c.contains(photo)) {
                            c.clear();
                            C58596b.this.f144714i.mo198648e().notifyDataSetChanged();
                        }
                        if (C58596b.this.f144710e > 1) {
                            C58596b.this.f144710e = 1;
                        }
                        C58596b.this.mo198610a(true);
                        C58596b bVar = C58596b.this;
                        bVar.mo198604a(bVar.f144710e);
                        return true;
                    }
                    C58564b e = C58596b.this.f144714i.mo198648e();
                    boolean a = e.mo198537a(photo);
                    if (e.mo198538b() > 0 && !a && C58596b.this.mo198611a(photo, e)) {
                        return false;
                    }
                    C58596b.this.f144710e = i2;
                    if (i2 > C58596b.this.f144707b) {
                        C58596b bVar2 = C58596b.this;
                        bVar2.f144710e = bVar2.f144707b;
                        C58596b.this.mo198606a(photo);
                        if (C58596b.this.f144706a != null) {
                            if (C58596b.this.f144708c != -1) {
                                i3 = C58596b.this.f144708c;
                            } else {
                                i3 = C58596b.this.f144707b;
                            }
                            LKUIToast.show(C58596b.this.f144706a, UIHelper.mustacheFormat((int) R.string.Lark_Legacy_Max9Items, "number", Integer.toString(i3)));
                        }
                        return false;
                    }
                    if (C58612c.m227290a().mo102854b("messenger.send_video.original")) {
                        C58596b.this.mo198610a(true);
                    } else if (a || !photo.isVideo()) {
                        C58596b.this.mo198610a(true);
                    } else {
                        C58596b.this.mo198610a(false);
                    }
                    C58596b bVar3 = C58596b.this;
                    bVar3.mo198604a(bVar3.f144710e);
                    return true;
                }
                boolean a2 = C58596b.this.f144714i.mo198648e().mo198537a(photo);
                C58596b bVar4 = C58596b.this;
                if (bVar4.f144707b > 0) {
                    z = true;
                } else {
                    z = false;
                }
                bVar4.mo198610a(z);
                if (C58596b.this.f144707b <= 0 || (!a2 && C58596b.this.f144710e > 0)) {
                    C58596b.this.mo198606a(photo);
                    if (!C58596b.this.f144709d && !C58596b.this.f144714i.mo198648e().mo198543f()) {
                        z2 = false;
                    }
                    if (C58596b.this.f144706a == null) {
                        return false;
                    }
                    if (z2 && photo.isVideo()) {
                        LKUIToast.show(C58596b.this.f144706a, (int) R.string.Lark_Legacy_PickerJustOneVideoTip);
                    } else if (z2) {
                        LKUIToast.show(C58596b.this.f144706a, (int) R.string.Lark_Legacy_SelectPhotosOrVideosError);
                    } else {
                        LKUIToast.show(C58596b.this.f144706a, UIHelper.mustacheFormat((int) R.string.Lark_Legacy_PickerOverMaxCountTips, "max_count", Integer.toString(C58596b.this.f144708c)));
                    }
                    return false;
                }
                C58596b.this.f144710e = !a2;
                C58596b bVar5 = C58596b.this;
                bVar5.mo198604a(bVar5.f144710e);
                return true;
            }
        };
        if (this.f144714i.mo198648e() != null) {
            this.f144714i.mo198648e().mo198551a(r0);
        } else {
            this.f144714i.mo198640a(r0);
        }
    }

    /* renamed from: a */
    public void mo198603a() {
        try {
            startActivityForResult(this.f144731z.mo198850a(this.f144718m), 1);
        } catch (ActivityNotFoundException | IOException e) {
            e.printStackTrace();
        }
    }

    /* renamed from: d */
    public void mo198616d() {
        try {
            if (getChildFragmentManager().getBackStackEntryCount() > 0) {
                getChildFragmentManager().popBackStackImmediate("imageFragment", 1);
            }
            this.f144705M = false;
        } catch (Exception unused) {
        }
    }

    /* renamed from: f */
    public boolean mo198618f() {
        if (this.f144708c == -1) {
            int i = this.f144710e;
            int i2 = this.f144707b;
            if (i < i2 || i2 <= 1) {
                return false;
            }
            return true;
        } else if (this.f144710e >= this.f144707b) {
            return true;
        } else {
            return false;
        }
    }

    /* renamed from: j */
    private void m227258j() {
        if (this.f144730y == 3) {
            this.f144699G.setVisibility(8);
            this.f144700H.setVisibility(8);
        }
        if (!this.f144729x) {
            this.f144701I.setVisibility(4);
            this.f144712g.setVisibility(8);
        }
    }

    /* renamed from: e */
    public void mo198617e() {
        finish();
        if (this.f144717l > 0) {
            C58612c.m227290a().mo102865h();
        }
        if (!DesktopUtil.m144301a((Context) this.f144706a)) {
            this.f144706a.overridePendingTransition(R.anim.activity_nothing, R.anim.activity_close_to_bottom);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        if (this.f144705M) {
            try {
                getChildFragmentManager().popBackStackImmediate("imageFragment", 1);
                this.f144705M = false;
            } catch (Exception unused) {
            }
        }
        if (this.f144717l > 0) {
            C58612c.m227290a().mo102865h();
        }
    }

    /* renamed from: n */
    private void m227262n() {
        int i;
        this.f144713h.setVisibility(8);
        m227253c(false);
        ViewGroup viewGroup = this.f144701I;
        if (this.f144726u) {
            i = 0;
        } else {
            i = 4;
        }
        viewGroup.setVisibility(i);
        if (DesktopUtil.m144301a(this.mContext)) {
            this.f144702J.setBackgroundColor(UIHelper.getColor(R.color.lkui_N00));
            this.f144695C.setImageResource(R.drawable.titlebar_close_bg_desktop_selector);
        }
        int size = this.f144714i.mo198648e().mo198540c().size();
        if (size > 0) {
            this.f144698F.setVisibility(0);
            this.f144698F.setText(UIHelper.mustacheFormat((int) R.string.Lark_Legacy_Preview, "select_count", Integer.toString(size)));
        } else {
            this.f144698F.setVisibility(8);
        }
        this.f144704L.setVisibility(0);
        mo198605a(this.f144710e, false);
    }

    /* renamed from: b */
    public void mo198612b() {
        ImagePagerFragment imagePagerFragment;
        ArrayList<String> g = this.f144714i.mo198648e().mo198557g();
        List<Photo> c = this.f144714i.mo198648e().mo198540c();
        this.f144714i.mo198648e().mo198543f();
        if (g.isEmpty() && (imagePagerFragment = this.f144715j) != null && imagePagerFragment.isVisible()) {
            PhotoItem photoItem = this.f144715j.mo198977k().get(this.f144715j.mo198979l());
            c.add(photoItem.getPhoto());
            String currentUrl = photoItem.getCurrentUrl();
            if (!TextUtils.isEmpty(currentUrl)) {
                g.add(currentUrl);
                photoItem.isVideo();
            }
        }
        if (g.isEmpty()) {
            Activity activity = this.f144706a;
            if (activity != null) {
                LKUIToast.show(activity, (int) R.string.Lark_Legacy_PickerMinCountTips);
                return;
            }
            return;
        }
        m227254d(true);
        mo198617e();
    }

    /* renamed from: c */
    public void mo198615c() {
        ImagePagerFragment imagePagerFragment = this.f144715j;
        if (imagePagerFragment == null || !imagePagerFragment.isVisible()) {
            if (getArguments() != null && getArguments().getBoolean("receive_cancel_event", false)) {
                m227254d(false);
            }
            mo198617e();
            return;
        }
        m227262n();
        if (!DesktopUtil.m144301a((Context) this.f144706a)) {
            this.f144715j.mo198952a(new Runnable() {
                /* class com.ss.android.lark.widget.photo_picker.C58596b.RunnableC586002 */

                public void run() {
                    C58596b.this.mo198616d();
                }
            });
        } else {
            mo198616d();
        }
    }

    /* renamed from: g */
    private boolean m227255g() {
        Bundle arguments = getArguments();
        if (arguments == null) {
            return false;
        }
        this.f144717l = arguments.getInt("ONLY_CAMERA_TYPE", 0);
        this.f144718m = arguments.getBoolean("FACE_FRONT", false);
        this.f144719n = arguments.getBoolean("USE_LARK_CAMERA", false);
        this.f144729x = arguments.getBoolean("ensure_selection", true);
        this.f144730y = arguments.getInt("ACTION_TYPE", 1);
        this.f144728w = arguments.getInt("MAX_DURATION", 1);
        if (this.f144717l == 0) {
            this.f144720o = arguments.getBoolean("SHOW_CAMERA", true);
            this.f144721p = arguments.getBoolean("SHOW_GIF", false);
            this.f144722q = arguments.getBoolean("SHOW_VIDEO", false);
            this.f144723r = arguments.getBoolean("PREVIEW_ENABLED", true);
            this.f144707b = arguments.getInt("MAX_COUNT", 9);
            this.f144708c = arguments.getInt("TOTAL_MAX_COUNT", -1);
            this.f144709d = arguments.getBoolean("TOTAL_HAS_VIDEO", false);
            this.f144724s = arguments.getInt("column", 4);
            ArrayList<Photo> arrayList = (ArrayList) arguments.getSerializable("ORIGINAL_PHOTOS");
            this.f144725t = arrayList;
            if (arrayList != null) {
                this.f144710e = arrayList.size();
            }
            this.f144711f = arguments.getBoolean("keep_origin", false);
            this.f144726u = arguments.getBoolean("SHOW_ORIGIN", true);
            this.f144727v = arguments.getBoolean("IS_SEND", true);
        }
        return true;
    }

    /* renamed from: i */
    private void m227257i() {
        this.f144694B.setTextSize((float) PhotoPickerUIConstants.f144606e);
        this.f144704L.setTextSize((float) PhotoPickerUIConstants.f144607f);
        this.f144700H.setTextSize((float) PhotoPickerUIConstants.f144608g);
        this.f144697E.setTextSize((float) PhotoPickerUIConstants.f144608g);
        this.f144698F.setTextSize((float) PhotoPickerUIConstants.f144608g);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f144713h.getLayoutParams();
        layoutParams.width = UIUtils.dp2px(this.mContext, (float) PhotoPickerUIConstants.f144611j);
        layoutParams.height = UIUtils.dp2px(this.mContext, (float) PhotoPickerUIConstants.f144611j);
        this.f144713h.setTextSize((float) PhotoPickerUIConstants.f144612k);
        this.f144699G.setPadding(UIUtils.dp2px(this.mContext, (float) PhotoPickerUIConstants.f144609h), 0, UIUtils.dp2px(this.mContext, (float) PhotoPickerUIConstants.f144610i), 0);
        if (DesktopUtil.m144301a((Context) this.f144706a)) {
            this.f144695C.setImageResource(R.drawable.titlebar_close_bg_desktop_selector);
            this.f144693A.setBackgroundColor(C25653b.m91893a(UIHelper.getColor(R.color.lkui_N00), 0.7f));
            this.f144694B.setVisibility(0);
            this.f144704L.setTextColor(UIUtils.getColor(this.f144706a, R.color.lkui_N900));
            this.f144702J.setBackgroundColor(UIHelper.getColor(R.color.lkui_N00));
            this.f144700H.setTextColor(UIUtils.getColor(this.f144706a, R.color.lkui_N900));
            this.f144697E.setTextColor(UIUtils.getColor(this.f144706a, R.color.lkui_N900));
            this.f144698F.setTextColor(UIUtils.getColor(this.f144706a, R.color.lkui_N900));
        }
    }

    /* renamed from: h */
    private void m227256h() {
        this.f144731z = new C58652c(this.f144706a);
        this.f144693A = this.f144716k.findViewById(R.id.layout_title);
        this.f144694B = (TextView) this.f144716k.findViewById(R.id.title_text);
        boolean z = false;
        if (this.f144717l == 0) {
            ImageView imageView = (ImageView) this.f144716k.findViewById(R.id.btn_back);
            this.f144695C = imageView;
            imageView.setOnClickListener(new View.OnClickListener() {
                /* class com.ss.android.lark.widget.photo_picker.C58596b.View$OnClickListenerC585971 */

                public void onClick(View view) {
                    C58596b.this.mo198615c();
                }
            });
            this.f144702J = (LinearLayout) this.f144716k.findViewById(R.id.layout_original_photo);
            this.f144701I = (ViewGroup) this.f144716k.findViewById(R.id.origin_zone);
            this.f144696D = (TextView) this.f144716k.findViewById(R.id.btn_photo_send);
            this.f144697E = (TextView) this.f144716k.findViewById(R.id.btn_photo_edit);
            this.f144698F = (TextView) this.f144716k.findViewById(R.id.btn_photo_preview);
            View findViewById = this.f144716k.findViewById(R.id.layout_photo_send);
            this.f144712g = findViewById;
            findViewById.setOnClickListener(new View.OnClickListener() {
                /* class com.ss.android.lark.widget.photo_picker.C58596b.View$OnClickListenerC586013 */

                public void onClick(View view) {
                    C58596b.this.mo198612b();
                }
            });
            mo198604a(this.f144710e);
            this.f144698F.setMaxWidth(DeviceUtils.getScreenWidth(this.mContext) / 3);
            CheckBox checkBox = (CheckBox) this.f144716k.findViewById(R.id.cb_select_photo);
            this.f144713h = checkBox;
            checkBox.setVisibility(8);
            this.f144697E.setVisibility(8);
            this.f144698F.setVisibility(8);
            C586024 r0 = new CompoundButton.OnCheckedChangeListener() {
                /* class com.ss.android.lark.widget.photo_picker.C58596b.C586024 */

                public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                    boolean z2;
                    if (C58596b.this.f144714i != null && C58596b.this.f144715j != null) {
                        int l = C58596b.this.f144715j.mo198979l();
                        Photo photo = C58596b.this.f144715j.mo198977k().get(l).getPhoto();
                        if (photo != null) {
                            C58596b.this.f144714i.mo198637a(l, photo);
                            int b = C58596b.this.f144714i.mo198644b(photo);
                            String str = "";
                            if (C58596b.this.f144708c != -1) {
                                if (!z || C58596b.this.f144707b <= 0 || b < 0 || b + 1 > C58596b.this.f144707b) {
                                    z2 = false;
                                } else {
                                    z2 = true;
                                }
                                CheckBox checkBox = C58596b.this.f144713h;
                                if (z2) {
                                    str = String.valueOf(b + 1);
                                }
                                checkBox.setText(str);
                            } else if (z) {
                                C58596b.this.f144713h.setText(String.valueOf(b + 1));
                            } else {
                                C58596b.this.f144713h.setText(str);
                            }
                        }
                    }
                }
            };
            this.f144703K = r0;
            this.f144713h.setOnCheckedChangeListener(r0);
            if (!this.f144726u) {
                this.f144701I.setVisibility(4);
            } else {
                this.f144701I.setVisibility(0);
            }
            CheckBox checkBox2 = (CheckBox) this.f144716k.findViewById(R.id.cb_original_photo);
            this.f144699G = checkBox2;
            checkBox2.setChecked(this.f144711f);
            this.f144699G.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                /* class com.ss.android.lark.widget.photo_picker.C58596b.C586035 */

                public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                    C58596b.this.f144711f = z;
                }
            });
            if (this.f144727v) {
                this.f144696D.setText(getString(R.string.Lark_Legacy_PickerSend));
            } else {
                this.f144696D.setText(getString(R.string.Lark_Legacy_PickerConfirm));
            }
            final String E = C57881t.m224606E(this.f144706a);
            this.f144697E.setOnClickListener(new View.OnClickListener() {
                /* class com.ss.android.lark.widget.photo_picker.C58596b.View$OnClickListenerC586046 */

                public void onClick(View view) {
                    if (C58596b.this.f144715j != null && C58596b.this.f144715j.isVisible()) {
                        Photo photo = C58596b.this.f144715j.mo198977k().get(C58596b.this.f144715j.mo198979l()).getPhoto();
                        C58612c.AbstractC58615c a = C58612c.m227290a();
                        Activity activity = C58596b.this.f144706a;
                        C58596b bVar = C58596b.this;
                        String path = photo.getPath();
                        a.mo102835a(activity, bVar, 2, path, E + System.currentTimeMillis() + ".jpg");
                    }
                }
            });
            this.f144698F.setOnClickListener(new View.OnClickListener() {
                /* class com.ss.android.lark.widget.photo_picker.C58596b.View$OnClickListenerC586057 */

                public void onClick(View view) {
                    List<Photo> c = C58596b.this.f144714i.mo198648e().mo198540c();
                    if (c.size() != 0) {
                        ImagePagerFragment a = ImagePagerFragment.m227608a((ArrayList<Photo>) new ArrayList(c), 0);
                        a.mo198941a(C58596b.this);
                        C58596b.this.mo198608a(a);
                    }
                }
            });
            this.f144700H = (TextView) this.f144716k.findViewById(R.id.cb_original_photo_text);
            Button button = (Button) this.f144716k.findViewById(R.id.button);
            this.f144704L = button;
            button.setVisibility(0);
            C58618b bVar = (C58618b) getChildFragmentManager().findFragmentByTag("tag");
            this.f144714i = bVar;
            if (bVar == null) {
                C58618b a = C58618b.m227344a(this.f144720o, this.f144721p, this.f144722q, this.f144723r, this.f144724s, this.f144707b, this.f144708c, this.f144729x, this.f144725t);
                this.f144714i = a;
                a.mo198639a(this);
                getChildFragmentManager().beginTransaction().replace(R.id.container, this.f144714i, "tag").commit();
                getChildFragmentManager().executePendingTransactions();
            }
            this.f144714i.mo198638a(this.f144704L);
            m227261m();
            if (!this.f144729x) {
                this.f144714i.mo198648e().mo198552a(new AbstractC58610b() {
                    /* class com.ss.android.lark.widget.photo_picker.C58596b.C586068 */

                    @Override // com.ss.android.lark.widget.photo_picker.p2947b.AbstractC58610b
                    /* renamed from: a */
                    public void mo198628a(View view, int i) {
                        C58596b.this.f144712g.post(new Runnable() {
                            /* class com.ss.android.lark.widget.photo_picker.C58596b.C586068.RunnableC586071 */

                            public void run() {
                                C58596b.this.f144712g.performClick();
                            }
                        });
                    }
                });
            }
            m227258j();
            m227259k();
            m227257i();
        } else if (C51327f.m199085b(this) && C51327f.m199082a(this)) {
            m227260l();
            if (!DesktopUtil.m144301a((Context) this.f144706a)) {
                UIUtils.setStatusBarTransparent(this.f144706a);
            }
        } else {
            return;
        }
        if (this.f144708c != -1) {
            if (this.f144707b > 0) {
                z = true;
            }
            mo198610a(z);
        }
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, androidx.fragment.app.Fragment
    public void onSaveInstanceState(Bundle bundle) {
        bundle.putBoolean("imageFragmentAdded", this.f144705M);
        super.onSaveInstanceState(bundle);
    }

    /* renamed from: c */
    private void m227253c(boolean z) {
        if (!z || C58612c.m227290a().mo102864g()) {
            this.f144697E.setVisibility(8);
        } else {
            this.f144697E.setVisibility(0);
        }
    }

    /* renamed from: b */
    private int m227251b(int i) {
        int i2;
        boolean z = this.f144727v;
        if (z) {
            i2 = R.string.Lark_Legacy_PickerSendWithCount;
        } else {
            i2 = R.string.Lark_Legacy_PickerConfirmWithCount;
        }
        if (i != 1) {
            if (i == 2) {
                return R.string.Lark_Legacy_PickerUploadWithCount;
            }
            if (i != 3) {
                return i2;
            }
            return R.string.Lark_Legacy_PickerSendEnsure;
        } else if (z) {
            return R.string.Lark_Legacy_PickerSendWithCount;
        } else {
            return R.string.Lark_Legacy_PickerConfirmWithCount;
        }
    }

    /* renamed from: c */
    private int m227252c(int i) {
        int i2;
        boolean z = this.f144727v;
        if (z) {
            i2 = R.string.Lark_Legacy_PickerSend;
        } else {
            i2 = R.string.Lark_Legacy_PickerConfirm;
        }
        if (i != 1) {
            if (i == 2) {
                return R.string.Lark_Legacy_PickerUpload;
            }
            if (i != 3) {
                return i2;
            }
            return R.string.Lark_Legacy_PickerSendEnsure;
        } else if (z) {
            return R.string.Lark_Legacy_PickerSend;
        } else {
            return R.string.Lark_Legacy_PickerConfirm;
        }
    }

    /* renamed from: a */
    public void mo198604a(int i) {
        boolean z;
        ImagePagerFragment imagePagerFragment = this.f144715j;
        if (imagePagerFragment == null || !imagePagerFragment.isVisible()) {
            z = false;
        } else {
            z = true;
        }
        mo198605a(i, z);
    }

    /* renamed from: d */
    private void m227254d(boolean z) {
        C58618b bVar = this.f144714i;
        if (bVar != null) {
            List<Photo> c = bVar.mo198648e().mo198540c();
            ArrayList<String> g = this.f144714i.mo198648e().mo198557g();
            boolean f = this.f144714i.mo198648e().mo198543f();
            Intent intent = new Intent();
            intent.putExtra("KEY_SELECTED_MEDIA", new ArrayList(c));
            intent.putStringArrayListExtra("SELECTED_PHOTOS", g);
            intent.putExtra("KEEP_ORIGIN_PHOTO", this.f144711f);
            intent.putExtra("KEY_HAS_VIDEO", f);
            intent.putExtra("KEY_FOR_SEND", z);
            setResult(-1, intent);
            return;
        }
        setResult(0, new Intent());
    }

    /* renamed from: a */
    public void mo198606a(Photo photo) {
        boolean a = this.f144714i.mo198643a(photo);
        this.f144713h.setOnCheckedChangeListener(null);
        this.f144713h.setChecked(a);
        if (a) {
            this.f144713h.setText(String.valueOf(this.f144714i.mo198644b(photo) + 1));
        } else {
            this.f144713h.setText("");
        }
        this.f144713h.setOnCheckedChangeListener(this.f144703K);
    }

    /* renamed from: b */
    public void mo198613b(String str) {
        String str2 = C57881t.m224606E(this.f144706a) + System.currentTimeMillis() + ".jpg";
        if (getActivity() == null) {
            Log.m165397w("PhotoPickerFrameFragment", "onTakePhoto return getActivity == null ");
        } else {
            C58612c.m227290a().mo102852b(getActivity(), this, 3, str, str2, false, false, "");
        }
    }

    /* renamed from: a */
    public void mo198607a(PhotoItem photoItem) {
        boolean a = this.f144714i.mo198643a(photoItem.getPhoto());
        this.f144713h.setOnCheckedChangeListener(null);
        this.f144713h.setChecked(a);
        if (a) {
            this.f144713h.setText(String.valueOf(this.f144714i.mo198644b(photoItem.getPhoto()) + 1));
        } else {
            this.f144713h.setText("");
        }
        this.f144713h.setOnCheckedChangeListener(this.f144703K);
        int i = 0;
        int i2 = 4;
        if (photoItem.isVideo()) {
            if (C58612c.m227290a().mo102854b("messenger.send_video.original")) {
                ViewGroup viewGroup = this.f144701I;
                if (this.f144726u) {
                    i2 = 0;
                }
                viewGroup.setVisibility(i2);
            } else {
                this.f144701I.setVisibility(4);
            }
            m227253c(false);
            return;
        }
        ViewGroup viewGroup2 = this.f144701I;
        if (!this.f144726u) {
            i = 4;
        }
        viewGroup2.setVisibility(i);
        m227253c(true);
    }

    /* renamed from: b */
    public void mo198614b(boolean z) {
        int i;
        C32771d.m125800a(C58612c.m227290a().mo102859d());
        CameraTypeBlackListManager.f84002a.mo120680a(C58612c.m227290a().mo102861e());
        C32771d.m125799a().mo120697a(C58612c.m227290a().mo102863f());
        File a = DirectFileAccess.m95102a(DirectFileAccess.StorageParams.m95112i().mo93404a(this.f144706a).mo93406a(DirectFileAccess.StorageLocation.EXTERNAL).mo93405a(DirectFileAccess.PathType.CACHE));
        File file = new File(a, "photo");
        File file2 = new File(a, "video");
        if (z) {
            i = 257;
        } else {
            i = 259;
        }
        C32780e a2 = C32780e.m125818a(i, file.getAbsolutePath(), file2.getAbsolutePath(), this.f144728w);
        getChildFragmentManager().beginTransaction().add(R.id.camera_view_fragment, a2).addToBackStack(null).commit();
        a2.mo120756a(new AbstractC32798i() {
            /* class com.ss.android.lark.widget.photo_picker.C58596b.AnonymousClass10 */

            @Override // com.ss.android.lark.cameraview.AbstractC32798i
            /* renamed from: a */
            public void mo39842a(int i) {
            }

            @Override // com.ss.android.lark.cameraview.AbstractC32798i
            /* renamed from: a */
            public void mo39841a() {
                C58596b.this.setResult(0);
                C58596b.this.mo198617e();
            }

            @Override // com.ss.android.lark.cameraview.AbstractC32798i
            /* renamed from: a */
            public void mo39843a(String str) {
                ImagePreviewHitPoint.m228134d("photograph", "none");
                if (C58612c.m227290a().mo102854b("messenger.photo.take.to.edit")) {
                    C58596b.this.mo198613b(str);
                } else {
                    C58596b.this.mo198609a(str);
                }
            }

            @Override // com.ss.android.lark.cameraview.AbstractC32798i
            /* renamed from: a */
            public void mo39844a(final String str, String str2) {
                C57865c.m224574a(new C57865c.AbstractC57873d<ArrayList<Photo>>() {
                    /* class com.ss.android.lark.widget.photo_picker.C58596b.AnonymousClass10.C585981 */

                    /* renamed from: a */
                    public ArrayList<Photo> produce() {
                        File file = new File(str);
                        ArrayList<Photo> arrayList = new ArrayList<>();
                        int[] iArr = new int[10];
                        ao.m224298a(str, iArr);
                        int[] a = ao.m224310a(iArr);
                        arrayList.add(new Photo(0, str, "video/mp4", (long) iArr[3], a[0], a[1], file.length()));
                        return arrayList;
                    }
                }, new C57865c.AbstractC57871b<ArrayList<Photo>>() {
                    /* class com.ss.android.lark.widget.photo_picker.C58596b.AnonymousClass10.C585992 */

                    /* renamed from: a */
                    public void consume(ArrayList<Photo> arrayList) {
                        Intent intent = new Intent();
                        intent.putExtra("KEY_SELECTED_MEDIA", arrayList);
                        intent.putExtra("KEY_HAS_VIDEO", true);
                        C58596b.this.setResult(-1, intent);
                        C58596b.this.mo198617e();
                    }
                });
            }
        });
    }

    /* renamed from: a */
    public void mo198608a(ImagePagerFragment imagePagerFragment) {
        this.f144715j = imagePagerFragment;
        getChildFragmentManager().beginTransaction().replace(R.id.container, this.f144715j).addToBackStack("imageFragment").commitAllowingStateLoss();
        this.f144705M = true;
        this.f144713h.setVisibility(0);
        m227253c(true);
        this.f144698F.setVisibility(8);
        this.f144704L.setVisibility(8);
        if (DesktopUtil.m144301a(this.mContext)) {
            this.f144702J.setBackgroundColor(C25653b.m91893a(UIHelper.getColor(R.color.lkui_N00), 0.8f));
            this.f144695C.setImageResource(R.drawable.titlebar_back_bg_desktop_selector);
        }
    }

    /* renamed from: a */
    public void mo198609a(String str) {
        Intent intent = new Intent();
        Photo photo = new Photo();
        photo.setPath(str);
        ArrayList arrayList = new ArrayList();
        arrayList.add(photo);
        ArrayList<String> arrayList2 = new ArrayList<>();
        arrayList2.add(str);
        intent.putExtra("KEY_SELECTED_MEDIA", arrayList);
        intent.putStringArrayListExtra("SELECTED_PHOTOS", arrayList2);
        intent.putExtra("KEEP_ORIGIN_PHOTO", true);
        setResult(-1, intent);
        mo198617e();
    }

    /* renamed from: a */
    public void mo198610a(boolean z) {
        if (!z) {
            this.f144699G.setChecked(false);
        }
        this.f144699G.setEnabled(z);
        this.f144700H.setEnabled(z);
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        if (!DesktopUtil.m144301a((Context) this.f144706a)) {
            this.f144706a.overridePendingTransition(R.anim.activity_enter_from_bottom, R.anim.activity_nothing);
        }
        m227256h();
    }

    /* renamed from: a */
    public void mo198605a(int i, boolean z) {
        if (i > 0) {
            this.f144712g.setEnabled(true);
            this.f144696D.setEnabled(true);
            if (this.f144697E.getVisibility() != 0) {
                this.f144698F.setVisibility(0);
                this.f144698F.setText(UIHelper.mustacheFormat((int) R.string.Lark_Legacy_Preview, "select_count", Integer.toString(i)));
            } else {
                this.f144698F.setVisibility(8);
            }
            this.f144696D.setText(UIHelper.mustacheFormat(m227251b(this.f144730y), "count", Integer.toString(i)));
        } else if (this.f144708c != -1) {
            this.f144698F.setVisibility(8);
            this.f144712g.setEnabled(false);
            this.f144696D.setEnabled(false);
            this.f144696D.setText(getString(m227252c(this.f144730y)));
        } else {
            this.f144712g.setEnabled(z);
            this.f144698F.setVisibility(8);
            this.f144696D.setEnabled(z);
            this.f144696D.setText(getString(m227252c(this.f144730y)));
        }
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i;
        if (!m227255g()) {
            mo198617e();
            return null;
        }
        if (this.f144717l == 0) {
            i = R.layout.__picker_activity_photo_picker;
        } else {
            i = R.layout.__picker_activity_take_pic;
        }
        this.f144716k = layoutInflater.inflate(i, viewGroup, false);
        this.f144706a = getActivity();
        return this.f144716k;
    }

    @Override // androidx.fragment.app.Fragment
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        if (iArr.length <= 0 || iArr[0] != 0) {
            mo198617e();
        } else if ((i == 1 || i == 3) && iArr.length == 2 && iArr[0] == 0 && iArr[1] == 0) {
            m227260l();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityResult(int i, int i2, Intent intent) {
        int i3 = 0;
        if (i == 1) {
            if (i2 == -1) {
                this.f144731z.mo198853b();
                String c = this.f144731z.mo198854c();
                Intent intent2 = new Intent();
                ArrayList<String> arrayList = new ArrayList<>();
                arrayList.add(c);
                Photo photo = new Photo();
                photo.setPath(c);
                ArrayList arrayList2 = new ArrayList(1);
                arrayList2.add(photo);
                intent2.putExtra("KEY_SELECTED_MEDIA", arrayList2);
                intent2.putStringArrayListExtra("SELECTED_PHOTOS", arrayList);
                setResult(-1, intent2);
                mo198617e();
            } else if (i2 == 0) {
                setResult(0);
                mo198617e();
            }
        } else if (i == 2) {
            if (i2 == -1 && intent != null) {
                String stringExtra = intent.getStringExtra("key_result_path");
                String currentUrl = this.f144715j.mo198977k().get(this.f144715j.mo198979l()).getCurrentUrl();
                List<Photo> e = this.f144714i.mo198648e().mo198542e();
                int i4 = 0;
                while (true) {
                    if (i4 >= e.size()) {
                        break;
                    }
                    Photo photo2 = e.get(i4);
                    if (photo2.getPath().equals(currentUrl)) {
                        Photo photo3 = new Photo(photo2);
                        photo3.setPath(stringExtra);
                        e.set(i4, photo3);
                        break;
                    }
                    i4++;
                }
                List<Photo> c2 = this.f144714i.mo198648e().mo198540c();
                while (true) {
                    if (i3 >= c2.size()) {
                        break;
                    }
                    Photo photo4 = c2.get(i3);
                    if (photo4.getPath().equals(currentUrl)) {
                        Photo photo5 = new Photo(photo4);
                        photo5.setPath(stringExtra);
                        c2.set(i3, photo5);
                        break;
                    }
                    i3++;
                }
                this.f144714i.mo198648e().mo198554a(c2);
                this.f144714i.mo198648e().notifyDataSetChanged();
                int l = this.f144715j.mo198979l();
                PhotoItem photoItem = this.f144715j.mo198977k().get(l);
                PhotoItem tag = new PhotoItem().setPaths(Collections.singletonList(stringExtra)).setCurrentIndex(photoItem.getCurrentIndex()).setImageKey(photoItem.getImageKey()).setTag(photoItem.getTag());
                ArrayList arrayList3 = new ArrayList(this.f144715j.mo198977k());
                arrayList3.set(l, tag);
                ImagePagerFragment imagePagerFragment = this.f144715j;
                imagePagerFragment.mo198954a((List<PhotoItem>) arrayList3, imagePagerFragment.mo198979l());
                m227262n();
            }
        } else if (i != 3) {
        } else {
            if (i2 == -1) {
                if (intent != null) {
                    mo198609a(intent.getStringExtra("key_result_path"));
                }
            } else if (i2 == 0) {
                m227260l();
            }
        }
    }
}
