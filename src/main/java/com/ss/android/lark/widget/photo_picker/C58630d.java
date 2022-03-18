package com.ss.android.lark.widget.photo_picker;

import android.app.Activity;
import android.app.ActivityOptions;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import com.larksuite.framework.utils.C26311p;
import com.larksuite.framework.utils.CollectionUtils;
import com.larksuite.framework.utils.UIUtils;
import com.ss.android.lark.appreciablelib.Biz;
import com.ss.android.lark.appreciablelib.Scene;
import com.ss.android.lark.desktopmode.utils.DesktopUtil;
import com.ss.android.lark.image.entity.ImageFormat;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.utils.navigation.Navigation;
import com.ss.android.lark.widget.photo_picker.animation.BaseData;
import com.ss.android.lark.widget.photo_picker.animation.activity_transition.ActivityTransitionLauncher;
import com.ss.android.lark.widget.photo_picker.entity.PhotoItem;
import com.ss.android.lark.widget.photo_picker.gallery.callback.OnChatAlbumClickListener;
import com.ss.android.lark.widget.photo_picker.gallery.callback.OnDialogMenuClickListener;
import com.ss.android.lark.widget.photo_picker.gallery.callback.OnLoadMoreListener;
import com.ss.android.lark.widget.photo_picker.p2951f.C58648a;
import com.ss.android.lark.widget.photo_picker.statistics.PerfPhotoViewMonitor;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: com.ss.android.lark.widget.photo_picker.d */
public class C58630d {
    /* renamed from: a */
    public static void m227374a(Context context, List<String> list, List<String> list2, int i, View view, boolean z) {
        if (i < 0) {
            Log.m165382e("gotoPreviewPhotos curPosition < 0");
        }
        ArrayList arrayList = new ArrayList();
        int i2 = 0;
        while (i2 < list.size()) {
            String str = list.get(i2);
            String str2 = i2 < list2.size() ? list2.get(i2) : null;
            if (C26311p.m95293m(str)) {
                arrayList.add(new PhotoItem().setPaths(Collections.singletonList(str)));
            } else {
                arrayList.add(new PhotoItem().setImageKey(str).setPaths(Collections.singletonList(str)).setEntityId(str2).setType(4));
            }
            i2++;
        }
        m227366a(context, arrayList, i, view, BaseData.AnimationType.TRANSLATE_ANIMATION, z, false, false);
    }

    /* renamed from: a */
    public static void m227375a(Context context, List<String> list, List<String> list2, int i, View view, boolean z, int i2, int i3, Biz biz, Scene scene, int i4) {
        if (i < 0) {
            Log.m165382e("gotoPreviewPhotos curPosition < 0");
        }
        ArrayList arrayList = new ArrayList();
        int i5 = 0;
        while (i5 < list.size()) {
            String str = list.get(i5);
            String str2 = i5 < list2.size() ? list2.get(i5) : null;
            if (C26311p.m95293m(str)) {
                arrayList.add(new PhotoItem().setPaths(Collections.singletonList(str)));
            } else {
                arrayList.add(new PhotoItem().setImageKey(str).setPaths(Collections.singletonList(str)).setType(4).setWidth(i2).setHeight(i3).setEntityId(str2).setImageFormat(ImageFormat.WEBP));
            }
            i5++;
        }
        m227372a(context, arrayList, i, view, BaseData.AnimationType.TRANSLATE_ANIMATION, z, true, true, false, true, false, false, null, null, "", null, biz, scene, i4);
    }

    /* renamed from: com.ss.android.lark.widget.photo_picker.d$a */
    public static class C58631a {

        /* renamed from: a */
        private Bundle f144772a = new Bundle();

        /* renamed from: b */
        private boolean f144773b;

        /* renamed from: c */
        private View f144774c;

        /* renamed from: d */
        private BaseData.AnimationType f144775d = BaseData.AnimationType.TRANSLATE_ANIMATION;

        /* renamed from: e */
        private ActivityTransitionLauncher.LocationInfo f144776e;

        /* renamed from: f */
        private List<PhotoItem> f144777f;

        /* renamed from: g */
        private int f144778g;

        /* renamed from: a */
        public void mo198670a(Activity activity, int i) {
            m227377a();
            Intent a = mo198656a((Context) activity);
            if (!DesktopUtil.m144301a((Context) activity)) {
                C58648a.m227466a(activity, a, this.f144775d, this.f144774c, this.f144776e);
                if (Navigation.from(activity).openActivity(a, i)) {
                    activity.overridePendingTransition(0, 0);
                    return;
                }
                return;
            }
            a.setFlags(272629760);
            ActivityOptions activityOptions = null;
            if (!UIUtils.isActivityAlive(activity, DesktopPagerActivity.class.getName())) {
                activityOptions = DesktopUtil.m144294a(activity, UIUtils.dp2px(activity, 566.0f), UIUtils.dp2px(activity, 670.0f));
            }
            if (activityOptions == null) {
                activity.startActivityForResult(a, i);
            } else {
                activity.startActivityForResult(a, i, activityOptions.toBundle());
            }
        }

        /* renamed from: a */
        public void mo198669a(Activity activity) {
            PerfPhotoViewMonitor.f145408a.mo199294a(PerfPhotoViewMonitor.f145408a.mo199291a(this.f144777f, this.f144778g), null, null, 0);
            PerfPhotoViewMonitor.f145408a.mo199292a(1);
            mo198670a(activity, 666);
        }

        /* renamed from: a */
        public void mo198671a(Activity activity, Biz biz, Scene scene, int i) {
            PerfPhotoViewMonitor.f145408a.mo199294a(PerfPhotoViewMonitor.f145408a.mo199291a(this.f144777f, this.f144778g), biz, scene, i);
            PerfPhotoViewMonitor.f145408a.mo199292a(1);
            mo198670a(activity, 666);
        }

        /* renamed from: a */
        public C58631a mo198668a(boolean z) {
            this.f144773b = z;
            return this;
        }

        /* JADX DEBUG: Multi-variable search result rejected for r0v7, resolved type: android.os.Bundle */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r4v2, types: [java.util.List[], java.io.Serializable] */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public com.ss.android.lark.widget.photo_picker.C58630d.C58631a mo198667a(java.util.ArrayList<com.ss.android.lark.widget.photo_picker.entity.PhotoItem> r4) {
            /*
                r3 = this;
                r3.f144777f = r4
                com.ss.android.lark.widget.photo_picker.c$c r0 = com.ss.android.lark.widget.photo_picker.C58612c.m227290a()
                android.content.Context r0 = r0.mo102826a()
                boolean r0 = com.larksuite.framework.utils.C26252ad.m94993b(r0)
                if (r0 == 0) goto L_0x001f
                com.larksuite.framework.utils.al r0 = com.larksuite.framework.utils.al.m95028a()
                java.lang.String r1 = "key_photos_preview"
                r0.mo93366a(r1, r4)
                android.os.Bundle r4 = r3.f144772a
                r4.putString(r1, r1)
                goto L_0x0046
            L_0x001f:
                boolean r0 = com.larksuite.framework.utils.CollectionUtils.isEmpty(r4)
                java.lang.String r1 = "photos_preview"
                if (r0 != 0) goto L_0x0039
                int r0 = r4.size()
                r2 = 20
                if (r0 <= r2) goto L_0x0039
                android.os.Bundle r0 = r3.f144772a
                java.util.List[] r4 = com.larksuite.framework.utils.CollectionUtils.split(r4, r2)
                r0.putSerializable(r1, r4)
                goto L_0x003e
            L_0x0039:
                android.os.Bundle r0 = r3.f144772a
                r0.putSerializable(r1, r4)
            L_0x003e:
                android.os.Bundle r4 = r3.f144772a
                r0 = 1
                java.lang.String r1 = "direct_pass_photo_data"
                r4.putBoolean(r1, r0)
            L_0x0046:
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.widget.photo_picker.C58630d.C58631a.mo198667a(java.util.ArrayList):com.ss.android.lark.widget.photo_picker.d$a");
        }

        /* renamed from: a */
        public C58631a mo198666a(String str) {
            this.f144772a.putString("jump_chat_btn_text", str);
            return this;
        }

        /* renamed from: a */
        private void m227377a() {
            if (this.f144773b && CollectionUtils.isNotEmpty(this.f144777f)) {
                for (PhotoItem photoItem : this.f144777f) {
                    photoItem.getPhotoState().setLoadOrigin(true);
                }
            }
        }

        /* renamed from: a */
        public C58631a mo198658a(View view) {
            this.f144774c = view;
            return this;
        }

        /* renamed from: a */
        public C58631a mo198659a(Biz biz) {
            this.f144772a.putSerializable("biz", biz);
            return this;
        }

        /* renamed from: b */
        public C58631a mo198672b(int i) {
            this.f144772a.putInt("from_type", i);
            return this;
        }

        /* renamed from: c */
        public C58631a mo198674c(boolean z) {
            this.f144772a.putBoolean("show_delete", z);
            return this;
        }

        /* renamed from: d */
        public C58631a mo198675d(boolean z) {
            this.f144772a.putBoolean("show_save", z);
            return this;
        }

        /* renamed from: e */
        public C58631a mo198676e(boolean z) {
            this.f144772a.putBoolean("show_jump_chat", z);
            return this;
        }

        /* renamed from: f */
        public C58631a mo198677f(boolean z) {
            this.f144772a.putBoolean("show_save_to_driver", z);
            return this;
        }

        /* renamed from: g */
        public C58631a mo198678g(boolean z) {
            this.f144772a.putBoolean("show_show_forward", z);
            return this;
        }

        /* renamed from: h */
        public C58631a mo198679h(boolean z) {
            this.f144772a.putBoolean("show_translation", z);
            return this;
        }

        /* renamed from: i */
        public C58631a mo198680i(boolean z) {
            this.f144772a.putBoolean("is_secret", z);
            return this;
        }

        /* renamed from: j */
        public C58631a mo198681j(boolean z) {
            this.f144772a.putBoolean("show_photo_title_bar", z);
            return this;
        }

        /* renamed from: k */
        public C58631a mo198682k(boolean z) {
            this.f144772a.putBoolean("show_photo_index_label", z);
            return this;
        }

        /* renamed from: l */
        public C58631a mo198683l(boolean z) {
            this.f144772a.putBoolean("enable_long_click", z);
            return this;
        }

        /* renamed from: m */
        public C58631a mo198684m(boolean z) {
            this.f144772a.putBoolean("exit_anim_limit", z);
            return this;
        }

        /* renamed from: n */
        public C58631a mo198685n(boolean z) {
            this.f144772a.putBoolean("show_view_chat_image", z);
            return this;
        }

        /* renamed from: a */
        public C58631a mo198657a(int i) {
            this.f144778g = i;
            this.f144772a.putInt("current_item", i);
            return this;
        }

        /* renamed from: b */
        public C58631a mo198673b(boolean z) {
            this.f144772a.putBoolean("is_mute", z);
            return this;
        }

        /* renamed from: a */
        public Intent mo198656a(Context context) {
            Intent intent = new Intent();
            if (DesktopUtil.m144301a(context)) {
                intent.setClass(context, DesktopPagerActivity.class);
            } else {
                intent.setClass(context, PhotoPagerActivity.class);
            }
            intent.putExtras(this.f144772a);
            return intent;
        }

        /* renamed from: a */
        public C58631a mo198660a(Scene scene) {
            this.f144772a.putSerializable("scene", scene);
            return this;
        }

        /* renamed from: a */
        public C58631a mo198661a(BaseData.AnimationType animationType) {
            this.f144775d = animationType;
            return this;
        }

        /* renamed from: a */
        public C58631a mo198662a(ActivityTransitionLauncher.LocationInfo locationInfo) {
            this.f144776e = locationInfo;
            return this;
        }

        /* renamed from: a */
        public C58631a mo198663a(OnChatAlbumClickListener onChatAlbumClickListener) {
            this.f144772a.putSerializable("chat_album_listener", onChatAlbumClickListener);
            return this;
        }

        /* renamed from: a */
        public C58631a mo198664a(OnDialogMenuClickListener onDialogMenuClickListener) {
            if (onDialogMenuClickListener != null) {
                this.f144772a.putSerializable("item_click_listener", onDialogMenuClickListener);
            }
            return this;
        }

        /* renamed from: a */
        public C58631a mo198665a(OnLoadMoreListener onLoadMoreListener) {
            if (onLoadMoreListener != null) {
                this.f144772a.putSerializable("load_more_listener", onLoadMoreListener);
            }
            return this;
        }
    }

    /* renamed from: a */
    public static C58631a m227364a() {
        return new C58631a();
    }

    /* renamed from: b */
    public static void m227376b(Context context, List<PhotoItem> list, int i, View view, boolean z) {
        m227366a(context, list, i, view, BaseData.AnimationType.TRANSLATE_ANIMATION, true, false, z);
    }

    /* renamed from: a */
    public static void m227373a(Context context, List<String> list, int i, View view, boolean z) {
        m227365a(context, list, i, view, BaseData.AnimationType.TRANSLATE_ANIMATION, z);
    }

    /* renamed from: a */
    public static void m227365a(Context context, List<String> list, int i, View view, BaseData.AnimationType animationType, boolean z) {
        if (i < 0) {
            Log.m165382e("gotoPreviewPhotos curPosition < 0");
        }
        ArrayList arrayList = new ArrayList();
        for (String str : list) {
            if (C26311p.m95293m(str)) {
                arrayList.add(new PhotoItem().setPaths(Collections.singletonList(str)));
            } else {
                arrayList.add(new PhotoItem().setImageKey(str).setPaths(Collections.singletonList(str)).setType(3));
            }
        }
        m227366a(context, arrayList, i, view, animationType, z, false, false);
    }

    /* renamed from: a */
    public static void m227366a(Context context, List<PhotoItem> list, int i, View view, BaseData.AnimationType animationType, boolean z, boolean z2, boolean z3) {
        m227367a(context, list, i, view, animationType, z, z2, z3, null);
    }

    /* renamed from: a */
    public static void m227367a(Context context, List<PhotoItem> list, int i, View view, BaseData.AnimationType animationType, boolean z, boolean z2, boolean z3, OnDialogMenuClickListener onDialogMenuClickListener) {
        m227368a(context, list, i, view, animationType, z, z2, z3, onDialogMenuClickListener, null);
    }

    /* renamed from: a */
    public static void m227368a(Context context, List<PhotoItem> list, int i, View view, BaseData.AnimationType animationType, boolean z, boolean z2, boolean z3, OnDialogMenuClickListener onDialogMenuClickListener, OnLoadMoreListener onLoadMoreListener) {
        m227370a(context, list, i, view, animationType, z, true, true, z2, true, z3, onDialogMenuClickListener, onLoadMoreListener, "");
    }

    /* renamed from: a */
    public static void m227369a(Context context, List<PhotoItem> list, int i, View view, BaseData.AnimationType animationType, boolean z, boolean z2, boolean z3, OnDialogMenuClickListener onDialogMenuClickListener, OnLoadMoreListener onLoadMoreListener, String str) {
        m227370a(context, list, i, view, animationType, z, true, true, z2, true, z3, onDialogMenuClickListener, onLoadMoreListener, str);
    }

    /* renamed from: a */
    public static void m227370a(Context context, List<PhotoItem> list, int i, View view, BaseData.AnimationType animationType, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, OnDialogMenuClickListener onDialogMenuClickListener, OnLoadMoreListener onLoadMoreListener, String str) {
        m227371a(context, list, i, view, animationType, z, z2, z3, z4, z5, z6, false, onDialogMenuClickListener, onLoadMoreListener, str, null);
    }

    /* renamed from: a */
    public static void m227371a(Context context, List<PhotoItem> list, int i, View view, BaseData.AnimationType animationType, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, OnDialogMenuClickListener onDialogMenuClickListener, OnLoadMoreListener onLoadMoreListener, String str, OnChatAlbumClickListener onChatAlbumClickListener) {
        m227372a(context, list, i, view, animationType, z, z2, z3, z4, z5, z6, z7, onDialogMenuClickListener, onLoadMoreListener, str, onChatAlbumClickListener, null, null, 0);
    }

    /* renamed from: a */
    public static void m227372a(Context context, List<PhotoItem> list, int i, View view, BaseData.AnimationType animationType, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, OnDialogMenuClickListener onDialogMenuClickListener, OnLoadMoreListener onLoadMoreListener, String str, OnChatAlbumClickListener onChatAlbumClickListener, Biz biz, Scene scene, int i2) {
        if (CollectionUtils.isEmpty(list)) {
            Log.m165382e("gotoPreviewPhotos urls is empty, return");
            return;
        }
        if (i < 0) {
            Log.m165382e("gotoPreviewPhotos curPosition < 0");
        }
        m227364a().mo198658a(view).mo198667a((ArrayList) list).mo198657a(i).mo198673b(z4).mo198674c(false).mo198675d(z).mo198676e(z2).mo198678g(z3).mo198679h(z6).mo198661a(animationType).mo198664a(onDialogMenuClickListener).mo198665a(onLoadMoreListener).mo198666a(str).mo198677f(z5).mo198685n(z7).mo198663a(onChatAlbumClickListener).mo198659a(biz).mo198660a(scene).mo198672b(i2).mo198671a((Activity) context, biz, scene, i2);
    }
}
