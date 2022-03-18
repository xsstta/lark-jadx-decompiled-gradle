package com.ss.android.lark.photoeditor.impl.p2463a;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import com.larksuite.component.ui.toast.LKUIToast;
import com.larksuite.framework.utils.C26311p;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.diskmanage.cipher.C36808a;
import com.ss.android.lark.diskmanage.cipher.EncryptException;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.photoeditor.LarkPhotoEditorModule;
import com.ss.android.lark.utils.C57805b;
import com.ss.android.lark.utils.C57881t;
import com.ss.android.lark.utils.ImageUtils;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.lark.utils.rxjava.C57865c;
import java.io.File;

/* renamed from: com.ss.android.lark.photoeditor.impl.a.c */
public class C51432c implements AbstractC51431b {

    /* renamed from: a */
    public Context f127974a;

    /* renamed from: b */
    public String f127975b;

    /* renamed from: c */
    public String f127976c;

    /* renamed from: d */
    private boolean f127977d;

    @Override // com.ss.android.lark.photoeditor.impl.p2463a.AbstractC51431b
    /* renamed from: c */
    public boolean mo177086c() {
        return this.f127977d;
    }

    @Override // com.ss.android.lark.photoeditor.impl.p2463a.AbstractC51431b
    /* renamed from: a */
    public Runnable mo177084a() {
        return new Runnable() {
            /* class com.ss.android.lark.photoeditor.impl.p2463a.C51432c.RunnableC514331 */

            public void run() {
                if (!LarkPhotoEditorModule.m199349a().mo102821a(C51432c.this.f127976c, true)) {
                    LKUIToast.show(C51432c.this.f127974a, UIHelper.mustacheFormat((int) R.string.Lark_Audit_BlockedActionsDueToPermissionSettings, "BlockedAction", UIHelper.getString(R.string.Lark_Audit_BlockedActionDownloadFullImage)));
                } else if (C51432c.this.f127974a instanceof Activity) {
                    C57805b.m224333d((Activity) C51432c.this.f127974a, new C57805b.AbstractC57809a() {
                        /* class com.ss.android.lark.photoeditor.impl.p2463a.C51432c.RunnableC514331.C514341 */

                        @Override // com.ss.android.lark.utils.C57805b.AbstractC57809a
                        public void permissionGranted(boolean z) {
                            if (z) {
                                C51432c.this.mo177088a(C51432c.this.f127975b);
                            }
                        }
                    });
                }
            }
        };
    }

    @Override // com.ss.android.lark.photoeditor.impl.p2463a.AbstractC51431b
    /* renamed from: b */
    public String mo177085b() {
        return UIUtils.getString(this.f127974a, R.string.Lark_Legacy_SaveImage);
    }

    /* renamed from: a */
    public void mo177088a(final String str) {
        C57865c.m224574a(new C57865c.AbstractC57873d<String>() {
            /* class com.ss.android.lark.photoeditor.impl.p2463a.C51432c.C514352 */

            /* renamed from: a */
            public String produce() {
                if (TextUtils.isEmpty(str)) {
                    return "";
                }
                String str = str;
                String str2 = (C57881t.m224651w(C51432c.this.f127974a) + System.currentTimeMillis()) + "." + ImageUtils.ImageType.TYPE_PNG.getValue();
                C26311p.m95274a(str, str2);
                return str2;
            }
        }, new C57865c.AbstractC57871b<String>() {
            /* class com.ss.android.lark.photoeditor.impl.p2463a.C51432c.C514363 */

            /* renamed from: a */
            public void consume(String str) {
                if (TextUtils.isEmpty(str)) {
                    LKUIToast.show(C51432c.this.f127974a, (int) R.string.Lark_Legacy_SaveFailTip);
                } else {
                    C51432c.m199370a(C51432c.this.f127974a, str, true);
                    LKUIToast.show(C51432c.this.f127974a, (int) R.drawable.saving_pictures, (int) R.string.Lark_Legacy_SaveSuccess);
                }
                if (C51432c.this.f127974a instanceof Activity) {
                    ((Activity) C51432c.this.f127974a).finish();
                }
            }
        });
    }

    /* renamed from: b */
    private static void m199371b(String str) {
        try {
            C36808a.m145203a(new File(str));
            Log.m165389i("SavePhotoUrlAction", "[cipher] file encrypt success, path = " + str);
        } catch (EncryptException unused) {
            Log.m165383e("SavePhotoUrlAction", "[cipher] file encrypt failed, path = " + str);
        }
    }

    /* renamed from: a */
    public static final void m199370a(Context context, String str, boolean z) {
        Log.m165389i("SavePhotoUrlAction", "notifySystemScanFile, filePath = " + str + ", shouldEncryptFile = " + z);
        if (z) {
            m199371b(str);
        }
        C26311p.m95268a(context, str);
    }

    public C51432c(Context context, boolean z, String str, String str2) {
        this.f127974a = context;
        this.f127977d = z;
        this.f127975b = str;
        this.f127976c = str2;
    }
}
