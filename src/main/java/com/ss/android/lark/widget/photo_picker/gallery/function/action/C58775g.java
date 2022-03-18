package com.ss.android.lark.widget.photo_picker.gallery.function.action;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.net.Uri;
import com.larksuite.component.ui.toast.LKUIToast;
import com.larksuite.framework.utils.C26311p;
import com.larksuite.framework.utils.MediaStoreUtil;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.framework.utils.UriCompatUtil;
import com.larksuite.suite.R;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.utils.C57805b;
import com.ss.android.lark.utils.ImageUtils;
import com.ss.android.lark.utils.rxjava.C57865c;
import com.ss.android.lark.widget.photo_picker.C58612c;
import com.ss.android.lark.widget.photo_picker.entity.PhotoItem;
import com.ss.android.lark.widget.photo_picker.p2951f.C58659h;
import java.io.File;

/* renamed from: com.ss.android.lark.widget.photo_picker.gallery.function.action.g */
public class C58775g implements AbstractC58768d {

    /* renamed from: a */
    public final Context f145272a;

    /* renamed from: b */
    private final boolean f145273b;

    /* renamed from: c */
    private final PhotoItem f145274c;

    @Override // com.ss.android.lark.widget.photo_picker.gallery.function.action.AbstractC58768d
    /* renamed from: d */
    public int mo199179d() {
        return R.drawable.icon_download_selector;
    }

    @Override // com.ss.android.lark.widget.photo_picker.gallery.function.action.AbstractC58768d
    /* renamed from: e */
    public boolean mo199180e() {
        return this.f145273b;
    }

    @Override // com.ss.android.lark.widget.photo_picker.gallery.function.action.AbstractC58768d
    /* renamed from: a */
    public Runnable mo199177a() {
        return new Runnable() {
            /* class com.ss.android.lark.widget.photo_picker.gallery.function.action.C58775g.RunnableC587761 */

            public void run() {
                if (!(C58775g.this.f145272a instanceof Activity)) {
                    return;
                }
                if (C58612c.m227290a().mo102869l().mo102873a()) {
                    LKUIToast.show(C58775g.this.f145272a, (int) R.string.Lark_Core_SecuritySettingKAToast);
                } else {
                    C57805b.m224333d((Activity) C58775g.this.f145272a, new C57805b.AbstractC57809a() {
                        /* class com.ss.android.lark.widget.photo_picker.gallery.function.action.C58775g.RunnableC587761.C587771 */

                        @Override // com.ss.android.lark.utils.C57805b.AbstractC57809a
                        public void permissionGranted(boolean z) {
                            if (z) {
                                C58775g.this.mo199198b();
                            }
                        }
                    });
                }
            }
        };
    }

    @Override // com.ss.android.lark.widget.photo_picker.gallery.function.action.AbstractC58768d
    /* renamed from: c */
    public String mo199178c() {
        if (this.f145274c.getTranslateProperty().isTranslated()) {
            return UIUtils.getString(this.f145272a, R.string.Lark_Chat_SaveTranslatedImage);
        }
        return UIUtils.getString(this.f145272a, R.string.Lark_Legacy_SaveImage);
    }

    /* renamed from: b */
    public void mo199198b() {
        if (this.f145274c != null && this.f145272a != null) {
            m227990a(this.f145272a, this.f145274c, String.valueOf(System.currentTimeMillis()));
            C58612c.m227290a().mo102846a("picbrowser_download");
            if (this.f145274c.getImageKey() == null) {
                Log.m165383e("SaveImageAction", "originKey is null!");
            }
        }
    }

    /* renamed from: a */
    private String m227989a(String str) {
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
        Log.m165383e("SaveImageAction", "image key: " + str + " is invalid!");
        return str;
    }

    public C58775g(Context context, boolean z, PhotoItem photoItem) {
        this.f145272a = context;
        this.f145273b = z;
        this.f145274c = photoItem;
    }

    /* renamed from: a */
    private void m227990a(final Context context, final PhotoItem photoItem, final String str) {
        final Context applicationContext = context.getApplicationContext();
        if (!C58612c.m227290a().mo102849a(m227989a(this.f145274c.getImageKey()), true)) {
            C58612c.m227290a().mo102834a(context, R.string.Lark_Audit_BlockedActionDownloadFullImage, (DialogInterface.OnDismissListener) null);
            return;
        }
        C58612c.m227290a().mo102860e(m227989a(this.f145274c.getImageKey()));
        C57865c.m224574a(new C57865c.AbstractC57873d<Uri>() {
            /* class com.ss.android.lark.widget.photo_picker.gallery.function.action.C58775g.C587782 */

            /* renamed from: a */
            public Uri produce() {
                Uri uri;
                Exception e;
                Log.m165389i("SaveImageAction", "save pic , originKey = " + C58659h.m227519c(photoItem));
                try {
                    File b = photoItem.getPhotoState().getShowFile().mo5927b();
                    if (b == null) {
                        return null;
                    }
                    String str = str + "." + ImageUtils.m224131a(b).getValue();
                    uri = MediaStoreUtil.m94879a(applicationContext, str);
                    if (uri == null) {
                        return null;
                    }
                    try {
                        MediaStoreUtil.m94890a(b, uri, applicationContext);
                        if (UriCompatUtil.m95039a(applicationContext, uri) != null) {
                            C26311p.m95268a(applicationContext, b.getAbsolutePath());
                        } else {
                            Log.m165397w("SaveImageAction", "fail to notify system scan file");
                        }
                        Log.m165389i("SaveImageAction", "save pic filename = " + str);
                    } catch (Exception e2) {
                        e = e2;
                        e.printStackTrace();
                        Log.m165383e("SaveImageAction", e.getMessage());
                        return uri;
                    }
                    return uri;
                } catch (Exception e3) {
                    uri = null;
                    e = e3;
                    e.printStackTrace();
                    Log.m165383e("SaveImageAction", e.getMessage());
                    return uri;
                }
            }
        }, new C57865c.AbstractC57871b<Uri>() {
            /* class com.ss.android.lark.widget.photo_picker.gallery.function.action.C58775g.C587793 */

            /* renamed from: a */
            public void consume(Uri uri) {
                if (uri == null) {
                    LKUIToast.show(context, (int) R.string.Lark_Legacy_SaveFailTip);
                } else {
                    LKUIToast.show(applicationContext, (int) R.drawable.saving_pictures, (int) R.string.Lark_Legacy_SaveSuccess);
                }
            }
        });
    }
}
