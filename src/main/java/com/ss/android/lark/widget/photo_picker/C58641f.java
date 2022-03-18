package com.ss.android.lark.widget.photo_picker;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatCheckBox;
import com.larksuite.component.ui.toast.LKUIToast;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.base.fragment.BaseFragment;
import com.ss.android.lark.desktopmode.utils.DesktopUtil;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.utils.C57881t;
import com.ss.android.lark.utils.StatusBarUtil;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.lark.widget.photo_picker.C58612c;
import com.ss.android.lark.widget.photo_picker.animation.activity_transition.C58585a;
import com.ss.android.lark.widget.photo_picker.animation.activity_transition.C58592b;
import com.ss.android.lark.widget.photo_picker.entity.Photo;
import com.ss.android.lark.widget.photo_picker.entity.PhotoItem;
import com.ss.android.lark.widget.photo_picker.gallery.ImagePagerFragment;
import com.ss.android.lark.widget.photo_picker.gallery.callback.OnPageSelectListener;
import com.ss.android.lark.widget.photo_picker.p2950e.C58635b;
import com.ss.android.lark.widget.photo_picker.statistics.ImagePreviewHitPoint;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.ss.android.lark.widget.photo_picker.f */
public class C58641f extends BaseFragment {

    /* renamed from: A */
    private int f144797A = 3;

    /* renamed from: a */
    public Activity f144798a;

    /* renamed from: b */
    public boolean f144799b;

    /* renamed from: c */
    public int f144800c = 9;

    /* renamed from: d */
    public int f144801d = 9;

    /* renamed from: e */
    public final List<Photo> f144802e = new ArrayList();

    /* renamed from: f */
    public final List<Photo> f144803f = new ArrayList();

    /* renamed from: g */
    public AppCompatCheckBox f144804g;

    /* renamed from: h */
    public View f144805h;

    /* renamed from: i */
    public ImagePagerFragment f144806i;

    /* renamed from: j */
    private View f144807j;

    /* renamed from: k */
    private boolean f144808k;

    /* renamed from: l */
    private int f144809l;

    /* renamed from: m */
    private int f144810m;

    /* renamed from: n */
    private boolean f144811n;

    /* renamed from: o */
    private boolean f144812o;

    /* renamed from: p */
    private boolean f144813p;

    /* renamed from: q */
    private ArrayList<String> f144814q;

    /* renamed from: r */
    private List<String> f144815r;

    /* renamed from: s */
    private View f144816s;

    /* renamed from: t */
    private View f144817t;

    /* renamed from: u */
    private TextView f144818u;

    /* renamed from: v */
    private CheckBox f144819v;

    /* renamed from: w */
    private View f144820w;

    /* renamed from: x */
    private View f144821x;

    /* renamed from: y */
    private CompoundButton.OnCheckedChangeListener f144822y;

    /* renamed from: z */
    private C58592b f144823z;

    /* renamed from: g */
    private int m227456g() {
        if (this.f144812o) {
            return R.string.Lark_Legacy_PickerSendWithCount;
        }
        return R.string.Lark_Legacy_PickerConfirmWithCount;
    }

    /* renamed from: h */
    private int m227457h() {
        if (this.f144812o) {
            return R.string.Lark_Legacy_PickerSend;
        }
        return R.string.Lark_Legacy_PickerConfirm;
    }

    /* renamed from: d */
    private Photo m227452d() {
        int i;
        List<Photo> list = this.f144802e;
        if (list != null && list.size() > (i = this.f144810m)) {
            return this.f144802e.get(i);
        }
        this.f144810m = 0;
        return null;
    }

    /* renamed from: e */
    private void m227454e() {
        if (!DesktopUtil.m144301a((Context) this.f144798a)) {
            View findViewById = this.f144807j.findViewById(R.id.layout_title);
            StatusBarUtil.setTranslucentForImageView(this.f144798a, 178, findViewById);
        }
    }

    /* renamed from: f */
    private boolean m227455f() {
        for (Photo photo : this.f144803f) {
            if (photo.isVideo()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: c */
    private boolean m227451c() {
        Bundle arguments = getArguments();
        if (arguments == null) {
            return false;
        }
        this.f144808k = arguments.getBoolean("is_use_transition_anim", true);
        this.f144810m = arguments.getInt("current_item", 0);
        this.f144811n = arguments.getBoolean("show_delete", true);
        this.f144812o = arguments.getBoolean("IS_SEND", true);
        this.f144797A = arguments.getInt("MEDIA_TYPE", 3);
        List<Photo> a = C58635b.m227434a().mo198706a(this.mContext, arguments.getString("key_photos_preview_picker"));
        if (!(a instanceof ArrayList)) {
            return false;
        }
        this.f144802e.addAll((ArrayList) a);
        ArrayList arrayList = (ArrayList) arguments.getSerializable("SELECTED_ITEMS");
        if (arrayList != null) {
            this.f144803f.addAll(arrayList);
            this.f144809l = this.f144803f.size();
        }
        this.f144799b = arguments.getBoolean("keep_origin", false);
        this.f144800c = arguments.getInt("MAX_COUNT", 9);
        this.f144801d = arguments.getInt("TOTAL_MAX_COUNT", -1);
        this.f144813p = arguments.getBoolean("TOTAL_HAS_VIDEO", false);
        return true;
    }

    /* renamed from: b */
    public void mo198840b() {
        ArrayList arrayList = new ArrayList(this.f144803f.size());
        for (Photo photo : this.f144803f) {
            arrayList.add(photo.getPath());
        }
        Intent intent = new Intent();
        intent.putStringArrayListExtra("SELECTED_PHOTOS", new ArrayList<>(arrayList));
        intent.putExtra("KEY_SELECTED_MEDIA", new ArrayList(this.f144803f));
        intent.putExtra("KEEP_ORIGIN_PHOTO", this.f144799b);
        intent.putExtra("is_send_photo", false);
        intent.putExtra("KEY_HAS_VIDEO", m227455f());
        intent.putStringArrayListExtra("photo_new_old_map", this.f144814q);
        setResult(-1, intent);
        if (this.f144806i.mo198979l() != this.f144810m) {
            finish();
            if (!DesktopUtil.m144301a((Context) this.f144798a)) {
                this.f144798a.overridePendingTransition(0, 0);
            }
        } else if (!this.f144808k || DesktopUtil.m144301a((Context) this.f144798a)) {
            finish();
        } else {
            this.f144823z.mo198587a(this.f144798a);
        }
    }

    /* renamed from: a */
    public void mo198836a() {
        ImagePagerFragment imagePagerFragment;
        PhotoItem h;
        Photo photo;
        ArrayList arrayList = new ArrayList(this.f144803f);
        if (!(!arrayList.isEmpty() || (imagePagerFragment = this.f144806i) == null || !imagePagerFragment.isVisible() || (h = this.f144806i.mo198971h()) == null || (photo = h.getPhoto()) == null)) {
            arrayList.add(photo);
            this.f144803f.addAll(arrayList);
        }
        if (arrayList.isEmpty()) {
            LKUIToast.show(this.f144798a, getString(R.string.Lark_Legacy_PickerMinCountTips));
            return;
        }
        ArrayList<String> arrayList2 = new ArrayList<>();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((Photo) it.next()).getPath());
        }
        Intent intent = new Intent();
        intent.putExtra("KEY_SELECTED_MEDIA", new ArrayList(this.f144803f));
        intent.putStringArrayListExtra("SELECTED_PHOTOS", arrayList2);
        intent.putExtra("KEEP_ORIGIN_PHOTO", this.f144799b);
        intent.putExtra("is_send_photo", true);
        intent.putExtra("KEY_HAS_VIDEO", m227455f());
        setResult(-1, intent);
        finish();
    }

    /* renamed from: b */
    private void m227448b(int i) {
        this.f144809l = i;
        m227444a(i);
    }

    /* renamed from: b */
    private boolean m227449b(Photo photo) {
        return this.f144803f.contains(photo);
    }

    /* renamed from: c */
    private void m227450c(Photo photo) {
        boolean d = m227453d(photo);
        this.f144821x.setEnabled(d);
        if (d) {
            this.f144821x.setVisibility(0);
        } else {
            this.f144821x.setVisibility(4);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo198839a(boolean z) {
        if (!z) {
            this.f144819v.setChecked(false);
        }
        this.f144819v.setEnabled(z);
        this.f144820w.setEnabled(z);
    }

    /* renamed from: d */
    private boolean m227453d(Photo photo) {
        if (C58612c.m227290a().mo102854b("messenger.send_video.original")) {
            return true;
        }
        return !photo.isVideo();
    }

    /* renamed from: a */
    private void m227444a(int i) {
        boolean z;
        if (i > 0) {
            this.f144818u.setText(UIHelper.mustacheFormat(m227456g(), "count", Integer.toString(i)));
        } else {
            this.f144818u.setText(m227457h());
        }
        if (this.f144801d != -1) {
            View view = this.f144817t;
            boolean z2 = true;
            if (this.f144800c <= 0 || this.f144809l <= 0) {
                z = false;
            } else {
                z = true;
            }
            view.setEnabled(z);
            TextView textView = this.f144818u;
            if (this.f144800c <= 0 || this.f144809l <= 0) {
                z2 = false;
            }
            textView.setEnabled(z2);
        }
    }

    /* renamed from: a */
    private void m227445a(Bundle bundle) {
        boolean z;
        View findViewById = this.f144807j.findViewById(R.id.btn_back);
        this.f144816s = findViewById;
        findViewById.setOnClickListener(new View.OnClickListener() {
            /* class com.ss.android.lark.widget.photo_picker.C58641f.View$OnClickListenerC586421 */

            public void onClick(View view) {
                C58641f.this.mo198840b();
            }
        });
        this.f144818u = (TextView) this.f144807j.findViewById(R.id.btn_photo_send);
        this.f144817t = this.f144807j.findViewById(R.id.layout_photo_send);
        this.f144821x = this.f144807j.findViewById(R.id.origin_zone);
        this.f144819v = (CheckBox) this.f144807j.findViewById(R.id.cb_original_photo);
        this.f144820w = this.f144807j.findViewById(R.id.original_label);
        this.f144817t.setOnClickListener(new View.OnClickListener() {
            /* class com.ss.android.lark.widget.photo_picker.C58641f.View$OnClickListenerC586432 */

            public void onClick(View view) {
                ImagePreviewHitPoint.m228132c("send", "im_chat_main_view");
                C58641f.this.mo198836a();
            }
        });
        m227444a(this.f144809l);
        final String E = C57881t.m224606E(this.f144798a);
        View findViewById2 = this.f144807j.findViewById(R.id.tv_edit_photo);
        this.f144805h = findViewById2;
        findViewById2.setOnClickListener(new View.OnClickListener() {
            /* class com.ss.android.lark.widget.photo_picker.C58641f.View$OnClickListenerC586443 */

            public void onClick(View view) {
                ImagePreviewHitPoint.m228132c("edit", "public_pic_edit_view");
                C58612c.AbstractC58615c a = C58612c.m227290a();
                Activity activity = C58641f.this.f144798a;
                C58641f fVar = C58641f.this;
                String path = fVar.f144802e.get(C58641f.this.f144806i.mo198979l()).getPath();
                a.mo102835a(activity, fVar, 1, path, E + System.currentTimeMillis() + ".jpg");
            }
        });
        this.f144804g = (AppCompatCheckBox) this.f144807j.findViewById(R.id.cb_select_photo);
        C586454 r0 = new CompoundButton.OnCheckedChangeListener() {
            /* class com.ss.android.lark.widget.photo_picker.C58641f.C586454 */

            public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                int l;
                boolean z2;
                if (C58641f.this.f144806i != null && C58641f.this.f144806i.mo198977k().size() > (l = C58641f.this.f144806i.mo198979l())) {
                    PhotoItem photoItem = C58641f.this.f144806i.mo198977k().get(l);
                    C58641f.this.mo198837a(l, photoItem);
                    int indexOf = C58641f.this.f144803f.indexOf(photoItem.getPhoto());
                    String str = "";
                    if (C58641f.this.f144801d != -1) {
                        if (!z || C58641f.this.f144800c <= 0 || indexOf < 0 || indexOf + 1 > C58641f.this.f144800c) {
                            z2 = false;
                        } else {
                            z2 = true;
                        }
                        AppCompatCheckBox appCompatCheckBox = C58641f.this.f144804g;
                        if (z2) {
                            str = String.valueOf(indexOf + 1);
                        }
                        appCompatCheckBox.setText(str);
                    } else if (z) {
                        C58641f.this.f144804g.setText(String.valueOf(indexOf + 1));
                    } else {
                        C58641f.this.f144804g.setText(str);
                    }
                }
            }
        };
        this.f144822y = r0;
        this.f144804g.setOnCheckedChangeListener(r0);
        mo198838a(m227452d());
        this.f144819v.setChecked(this.f144799b);
        this.f144819v.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            /* class com.ss.android.lark.widget.photo_picker.C58641f.C586465 */

            public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                C58641f.this.f144799b = z;
                if (C58641f.this.f144799b) {
                    ImagePreviewHitPoint.m228132c("original_image", "none");
                }
            }
        });
        if (this.f144806i == null) {
            ImagePagerFragment imagePagerFragment = (ImagePagerFragment) getChildFragmentManager().findFragmentById(R.id.photoPagerFragment);
            this.f144806i = imagePagerFragment;
            imagePagerFragment.mo198941a(this);
        }
        List<PhotoItem> photoItemsByPhotos = PhotoItem.getPhotoItemsByPhotos(this.f144802e);
        this.f144806i.mo198954a(photoItemsByPhotos, this.f144810m);
        this.f144806i.mo198950a(new OnPageSelectListener() {
            /* class com.ss.android.lark.widget.photo_picker.C58641f.C586476 */

            @Override // com.ss.android.lark.widget.photo_picker.gallery.callback.OnPageSelectListener
            /* renamed from: a */
            public void mo198846a(PhotoItem photoItem) {
                UIUtils.display(C58641f.this.f144805h, !photoItem.isVideo());
            }
        });
        this.f144806i.mo198975j().setCurrentItem(this.f144810m);
        View view = this.f144805h;
        boolean z2 = true;
        if (photoItemsByPhotos.isEmpty() || photoItemsByPhotos.get(this.f144810m).isVideo()) {
            z = false;
        } else {
            z = true;
        }
        UIUtils.display(view, z);
        if (this.f144808k && !DesktopUtil.m144301a((Context) this.f144798a)) {
            Intent intent = new Intent();
            intent.putExtras(getArguments());
            this.f144823z = C58585a.m227230a(intent).mo198595a(this.f144798a).mo198596a(this.f144806i.mo198975j()).mo198597a(bundle);
        }
        m227454e();
        this.f144815r = new ArrayList();
        this.f144814q = new ArrayList<>();
        if (this.f144801d != -1) {
            if (this.f144800c <= 0) {
                z2 = false;
            }
            mo198839a(z2);
        }
    }

    /* renamed from: a */
    public void mo198838a(Photo photo) {
        if (photo != null) {
            boolean b = m227449b(photo);
            this.f144804g.setOnCheckedChangeListener(null);
            this.f144804g.setChecked(b);
            if (b) {
                this.f144804g.setText(String.valueOf(this.f144803f.indexOf(photo) + 1));
            } else {
                this.f144804g.setText("");
            }
            this.f144804g.setOnCheckedChangeListener(this.f144822y);
            m227450c(photo);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        if (!m227451c()) {
            finish();
            return;
        }
        ImagePreviewHitPoint.m228131c();
        m227445a(bundle);
    }

    /* renamed from: a */
    public void mo198837a(int i, PhotoItem photoItem) {
        int i2;
        Photo photo = photoItem.getPhoto();
        if (photo != null) {
            int size = this.f144803f.size();
            if (m227449b(photo)) {
                i2 = -1;
            } else {
                i2 = 1;
            }
            if (!m227446a(i, photo, size + i2)) {
                this.f144804g.setChecked(false);
            } else if (this.f144803f.contains(photo)) {
                this.f144803f.remove(photo);
            } else {
                this.f144803f.add(photo);
            }
        }
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f144807j = layoutInflater.inflate(R.layout.__picker_activity_photo_preview_picker, viewGroup, false);
        this.f144798a = getActivity();
        return this.f144807j;
    }

    /* renamed from: a */
    private boolean m227446a(int i, Photo photo, int i2) {
        if (this.f144803f.contains(photo)) {
            mo198839a(true);
            m227448b(i2);
            return true;
        } else if (!m227447a(this.f144803f, photo, this.f144800c, i2)) {
            return false;
        } else {
            mo198839a(m227453d(photo));
            m227448b(i2);
            return true;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i2 == -1 && i == 1 && intent != null) {
            String stringExtra = intent.getStringExtra("key_result_path");
            this.f144815r.add(stringExtra);
            Log.m165389i("PhotoPreviewPicker", "onActivityResult resultImage = " + stringExtra);
            Photo photo = this.f144802e.get(this.f144806i.mo198979l());
            this.f144814q.add(photo.getPath());
            this.f144814q.add(stringExtra);
            Photo photo2 = new Photo(photo);
            photo2.setPath(stringExtra);
            this.f144802e.set(this.f144806i.mo198979l(), photo2);
            if (this.f144803f.contains(photo)) {
                this.f144803f.set(this.f144803f.indexOf(photo), photo2);
            }
            this.f144806i.mo198954a(PhotoItem.getPhotoItemsByPhotos(this.f144802e), this.f144806i.mo198979l());
        }
    }

    /* renamed from: a */
    private boolean m227447a(List<Photo> list, Photo photo, int i, int i2) {
        int i3 = this.f144801d;
        String str = "max_count";
        int i4 = R.string.Lark_Legacy_PickerOverMaxCountTips;
        if (i3 != -1) {
            if (i == 1) {
                if (i2 <= i) {
                    return true;
                }
                Activity activity = this.f144798a;
                if (activity == null) {
                    return false;
                }
                LKUIToast.show(activity, UIHelper.mustacheFormat((int) R.string.Lark_Legacy_PickerOverMaxCountTips, str, Integer.toString(i3)));
                return false;
            } else if (i <= 0) {
                mo198838a(photo);
                mo198839a(false);
                if (this.f144798a == null) {
                    return false;
                }
                if (this.f144813p && photo.isVideo()) {
                    LKUIToast.show(this.f144798a, (int) R.string.Lark_Legacy_PickerJustOneVideoTip);
                } else if (this.f144813p) {
                    LKUIToast.show(this.f144798a, (int) R.string.Lark_Legacy_SelectPhotosOrVideosError);
                } else {
                    LKUIToast.show(this.f144798a, UIHelper.mustacheFormat((int) R.string.Lark_Legacy_PickerOverMaxCountTips, str, Integer.toString(this.f144801d)));
                }
                return false;
            }
        }
        if (i <= 1) {
            list.clear();
            return true;
        } else if (i2 > i) {
            mo198838a(photo);
            int i5 = this.f144801d;
            if (i5 != -1) {
                i = i5;
            }
            if (this.f144797A != 3) {
                i4 = R.string.Lark_Legacy_Max9Items;
                str = "number";
            }
            LKUIToast.show(this.f144798a, UIHelper.mustacheFormat(i4, str, Integer.toString(i)));
            return false;
        } else {
            if (m227455f()) {
                if (this.f144797A == 3) {
                    if (photo.isVideo()) {
                        LKUIToast.show(this.f144798a, getString(R.string.Lark_Legacy_PickerJustOneVideoTip));
                    } else {
                        LKUIToast.show(this.f144798a, getString(R.string.Lark_Legacy_SelectPhotosOrVideosError));
                    }
                    return false;
                }
            } else if (list.size() > 0 && photo.isVideo() && this.f144797A == 3) {
                LKUIToast.show(this.f144798a, getString(R.string.Lark_Legacy_SelectPhotosOrVideosError));
                return false;
            }
            return true;
        }
    }
}
