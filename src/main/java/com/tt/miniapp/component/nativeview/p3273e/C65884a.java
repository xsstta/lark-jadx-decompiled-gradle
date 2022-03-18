package com.tt.miniapp.component.nativeview.p3273e;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.larksuite.framework.utils.C26311p;
import com.larksuite.framework.utils.MediaStoreUtil;
import com.larksuite.suite.R;
import com.tt.miniapp.permission.AbstractC66590i;
import com.tt.miniapp.permission.C66588h;
import com.tt.miniapphost.util.C67590h;
import com.tt.option.p3389j.AbstractC67645c;
import java.util.HashSet;

/* renamed from: com.tt.miniapp.component.nativeview.e.a */
public class C65884a implements AbstractC67645c {

    /* renamed from: a */
    private ValueCallback<Uri[]> f166180a;

    /* renamed from: b */
    private Uri f166181b;

    /* renamed from: c */
    private boolean f166182c;

    /* renamed from: d */
    private Activity f166183d;

    /* renamed from: c */
    private Intent m258081c() {
        return new Intent("android.media.action.VIDEO_CAPTURE");
    }

    /* renamed from: d */
    private Intent m258082d() {
        return new Intent("android.provider.MediaStore.RECORD_SOUND");
    }

    /* renamed from: a */
    private Intent m258074a() {
        Intent intent = new Intent("android.intent.action.GET_CONTENT");
        intent.addCategory("android.intent.category.OPENABLE");
        intent.setType("*/*");
        Intent a = m258076a(m258080b(), m258081c(), m258082d());
        a.putExtra("android.intent.extra.INTENT", intent);
        return a;
    }

    /* renamed from: b */
    private Intent m258080b() {
        Intent intent = new Intent("android.media.action.IMAGE_CAPTURE");
        String str = System.currentTimeMillis() + ".jpg";
        Uri uri = null;
        try {
            uri = MediaStoreUtil.m94880a(this.f166183d, str, C26311p.m95283c(str), MediaStoreUtil.DirType.DCIM);
            this.f166181b = uri;
        } catch (Exception e) {
            AppBrandLogger.m52829e("FileChooseHandler", "create image uri exception", e);
        }
        intent.putExtra("output", uri);
        return intent;
    }

    /* renamed from: a */
    private Intent m258075a(String str) {
        Intent intent = new Intent("android.intent.action.GET_CONTENT");
        intent.addCategory("android.intent.category.OPENABLE");
        intent.setType(str);
        return intent;
    }

    public C65884a(Activity activity) {
        this.f166183d = activity;
        AppBrandLogger.m52830i("FileChooseHandler", "init FileChooseHandler");
    }

    /* renamed from: a */
    private Intent m258076a(Intent... intentArr) {
        Intent intent = new Intent("android.intent.action.CHOOSER");
        intent.putExtra("android.intent.extra.INITIAL_INTENTS", intentArr);
        intent.putExtra("android.intent.extra.TITLE", C67590h.m263073a((int) R.string.microapp_m_choose_file_need_upload));
        return intent;
    }

    /* renamed from: a */
    public void mo230668a(Uri uri) {
        ValueCallback<Uri[]> valueCallback = this.f166180a;
        if (valueCallback != null) {
            if (uri != null) {
                valueCallback.onReceiveValue(new Uri[]{uri});
            } else {
                valueCallback.onReceiveValue(new Uri[0]);
            }
        }
        this.f166180a = null;
        this.f166182c = false;
    }

    @Override // com.tt.option.p3389j.AbstractC67645c
    /* renamed from: a */
    public void mo230669a(ValueCallback<Uri[]> valueCallback, WebChromeClient.FileChooserParams fileChooserParams) {
        m258079a(valueCallback, fileChooserParams.getAcceptTypes());
    }

    /* renamed from: a */
    private void m258077a(int i, Intent intent) {
        Uri uri;
        AppBrandLogger.m52830i("FileChooseHandler", "onResult resultCode = " + i + " , mCameraFileUri = " + this.f166181b);
        final Uri uri2 = null;
        if (i != 0 || !this.f166182c) {
            if (intent != null && i == -1) {
                uri2 = intent.getData();
            }
            if (uri2 == null && i == -1 && (uri = this.f166181b) != null) {
                this.f166183d.sendBroadcast(new Intent("android.intent.action.MEDIA_SCANNER_SCAN_FILE", uri));
                uri2 = uri;
            }
            HashSet hashSet = new HashSet();
            hashSet.add("android.permission.READ_EXTERNAL_STORAGE");
            C66588h.m260183a().mo232189a(this.f166183d, hashSet, new AbstractC66590i() {
                /* class com.tt.miniapp.component.nativeview.p3273e.C65884a.C658851 */

                @Override // com.tt.miniapp.permission.AbstractC66590i
                /* renamed from: a */
                public void mo48890a() {
                    C65884a.this.mo230668a(uri2);
                }

                @Override // com.tt.miniapp.permission.AbstractC66590i
                /* renamed from: a */
                public void mo48891a(String str) {
                    C65884a.this.mo230668a((Uri) null);
                }
            });
            return;
        }
        this.f166182c = false;
        mo230668a((Uri) null);
    }

    /* renamed from: a */
    private void m258078a(Intent intent, int i) {
        try {
            this.f166183d.startActivityForResult(intent, i);
        } catch (ActivityNotFoundException unused) {
            try {
                this.f166182c = true;
                this.f166183d.startActivityForResult(m258074a(), i);
            } catch (ActivityNotFoundException unused2) {
            }
        }
    }

    /* renamed from: a */
    private void m258079a(ValueCallback<Uri[]> valueCallback, String[] strArr) {
        if (this.f166180a == null) {
            this.f166180a = valueCallback;
            String str = strArr[0];
            AppBrandLogger.m52830i("FileChooseHandler", "openFileChooser mimeType = " + str);
            this.f166181b = null;
            if (str.equals("image/*") || str.equals("image/")) {
                Intent a = m258076a(m258080b());
                a.putExtra("android.intent.extra.INTENT", m258075a("image/*"));
                m258078a(a, 11);
            } else if (str.equals("video/*")) {
                Intent a2 = m258076a(m258081c());
                a2.putExtra("android.intent.extra.INTENT", m258075a("video/*"));
                m258078a(a2, 11);
            } else if (str.equals("audio/*")) {
                Intent a3 = m258076a(m258082d());
                a3.putExtra("android.intent.extra.INTENT", m258075a("audio/*"));
                m258078a(a3, 11);
            } else {
                m258078a(m258074a(), 11);
            }
        }
    }

    @Override // com.tt.option.p3389j.AbstractC67645c
    /* renamed from: a */
    public void mo230667a(int i, int i2, Intent intent) {
        if (i == 11) {
            m258077a(i2, intent);
        }
    }
}
