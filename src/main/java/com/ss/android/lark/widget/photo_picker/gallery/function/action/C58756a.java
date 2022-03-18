package com.ss.android.lark.widget.photo_picker.gallery.function.action;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import com.larksuite.component.ui.toast.LKUIToast;
import com.larksuite.suite.R;
import com.ss.android.lark.appreciablelib.Biz;
import com.ss.android.lark.appreciablelib.Scene;
import com.ss.android.lark.image.ImageLoader;
import com.ss.android.lark.image.api.IRequestCreator;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.utils.C57805b;
import com.ss.android.lark.utils.rxjava.C57865c;
import com.ss.android.lark.widget.photo_picker.C58612c;
import com.ss.android.lark.widget.photo_picker.entity.PhotoItem;
import com.ss.android.lark.widget.photo_picker.entity.PhotoState;
import com.ss.android.lark.widget.photo_picker.p2951f.C58659h;
import java.io.File;

/* renamed from: com.ss.android.lark.widget.photo_picker.gallery.function.action.a */
public class C58756a implements AbstractC58768d {

    /* renamed from: a */
    public final Context f145228a;

    /* renamed from: b */
    public final PhotoItem f145229b;

    /* renamed from: c */
    public final IRequestCreator f145230c;

    /* renamed from: d */
    public Biz f145231d;

    /* renamed from: e */
    public Scene f145232e;

    /* renamed from: f */
    public int f145233f;

    /* renamed from: g */
    private final boolean f145234g;

    @Override // com.ss.android.lark.widget.photo_picker.gallery.function.action.AbstractC58768d
    /* renamed from: c */
    public String mo199178c() {
        return "";
    }

    @Override // com.ss.android.lark.widget.photo_picker.gallery.function.action.AbstractC58768d
    /* renamed from: d */
    public int mo199179d() {
        return R.drawable.icon_download_selector;
    }

    @Override // com.ss.android.lark.widget.photo_picker.gallery.function.action.AbstractC58768d
    /* renamed from: e */
    public boolean mo199180e() {
        return this.f145234g;
    }

    @Override // com.ss.android.lark.widget.photo_picker.gallery.function.action.AbstractC58768d
    /* renamed from: a */
    public Runnable mo199177a() {
        return new Runnable() {
            /* class com.ss.android.lark.widget.photo_picker.gallery.function.action.C58756a.RunnableC587571 */

            public void run() {
                if (!(C58756a.this.f145228a instanceof Activity)) {
                    return;
                }
                if (C58612c.m227290a().mo102869l().mo102873a()) {
                    LKUIToast.show(C58756a.this.f145228a, (int) R.string.Lark_Core_SecuritySettingKAToast);
                } else {
                    C57805b.m224333d((Activity) C58756a.this.f145228a, new C57805b.AbstractC57809a() {
                        /* class com.ss.android.lark.widget.photo_picker.gallery.function.action.C58756a.RunnableC587571.C587581 */

                        @Override // com.ss.android.lark.utils.C57805b.AbstractC57809a
                        public void permissionGranted(boolean z) {
                            if (z) {
                                C58756a.this.mo199184b();
                            }
                        }
                    });
                }
            }
        };
    }

    /* renamed from: b */
    public void mo199184b() {
        if (this.f145229b != null && this.f145228a != null) {
            m227948a(this.f145228a, this.f145229b, String.valueOf(System.currentTimeMillis()));
            C58612c.m227290a().mo102846a("picbrowser_download");
        }
    }

    /* renamed from: a */
    private String m227947a(String str) {
        if (str == null) {
            return "";
        }
        int indexOf = str.indexOf(":");
        if (indexOf == -1) {
            return str;
        }
        String substring = str.substring(indexOf);
        if (substring.length() > 1) {
            return substring.substring(1);
        }
        Log.m165383e("DownloadImageAction", "image key: " + str + " is invalid!");
        return str;
    }

    /* renamed from: a */
    private void m227948a(final Context context, final PhotoItem photoItem, final String str) {
        final Context applicationContext = context.getApplicationContext();
        String c = C58659h.m227519c(photoItem);
        if (!C58612c.m227290a().mo102849a(m227947a(c), true)) {
            C58612c.m227290a().mo102834a(context, R.string.Lark_Audit_BlockedActionDownloadFullImage, (DialogInterface.OnDismissListener) null);
            return;
        }
        C58612c.m227290a().mo102860e(m227947a(c));
        C57865c.m224574a(new C57865c.AbstractC57873d<Integer>() {
            /* class com.ss.android.lark.widget.photo_picker.gallery.function.action.C58756a.C587592 */

            /* JADX WARNING: Removed duplicated region for block: B:23:0x009e A[Catch:{ RuntimeException -> 0x00f5 }] */
            /* renamed from: a */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public java.lang.Integer produce() {
                /*
                // Method dump skipped, instructions count: 258
                */
                throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.widget.photo_picker.gallery.function.action.C58756a.C587592.produce():java.lang.Integer");
            }
        }, new C57865c.AbstractC57871b<Integer>() {
            /* class com.ss.android.lark.widget.photo_picker.gallery.function.action.C58756a.C587603 */

            /* renamed from: a */
            public void consume(Integer num) {
                int intValue = num.intValue();
                if (intValue == 0) {
                    LKUIToast.show(applicationContext, (int) R.drawable.saving_pictures, (int) R.string.Lark_Legacy_SaveSuccess);
                } else if (intValue == 1) {
                    photoItem.getPhotoState().getUIState().mo5929b(PhotoState.UIState.DONE);
                    LKUIToast.show(applicationContext, (int) R.drawable.saving_pictures, (int) R.string.Lark_Legacy_SaveSuccess);
                } else if (intValue == 2) {
                    photoItem.getPhotoState().getUIState().mo5929b(PhotoState.UIState.HIDE_LOOK);
                    LKUIToast.show(context, (int) R.string.Lark_Legacy_PictureDownloadFailed);
                }
            }
        });
    }

    /* renamed from: a */
    public File mo199183a(PhotoItem photoItem, String str, String str2) {
        if (photoItem.getWidth() == 0 || photoItem.getHeight() == 0) {
            return C58612c.m227290a().mo102827a(this.f145230c, str, str2, photoItem.getEntityId(), C58659h.m227515a(photoItem), photoItem.getType());
        }
        return C58612c.m227290a().mo102828a(this.f145230c, str, str2, photoItem.getEntityId(), C58659h.m227515a(photoItem), true, false, photoItem.getWidth(), photoItem.getHeight(), photoItem.getImageFormat(), photoItem.getType(), false);
    }

    public C58756a(Context context, boolean z, PhotoItem photoItem, Biz biz, Scene scene, int i) {
        this.f145228a = context;
        this.f145234g = z;
        this.f145229b = photoItem;
        this.f145230c = ImageLoader.with(context);
        this.f145231d = biz;
        this.f145232e = scene;
        this.f145233f = i;
    }
}
