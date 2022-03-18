package com.larksuite.component.webview.container.impl.p1172c;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import androidx.fragment.app.Fragment;
import com.huawei.hms.framework.common.ContainerUtils;
import com.larksuite.framework.utils.CollectionUtils;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.permission.AbstractC51324c;
import com.ss.android.lark.permission.C51320a;
import com.ss.android.lark.permission.C51327f;
import com.ss.android.lark.utils.C57805b;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.lark.widget.photo_picker.C58557a;
import com.ss.android.lark.widget.photo_picker.p2951f.C58652c;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

/* renamed from: com.larksuite.component.webview.container.impl.c.a */
public class C25845a implements AbstractC25852c {

    /* renamed from: a */
    public Activity f63943a;

    /* renamed from: b */
    private ValueCallback<Uri> f63944b;

    /* renamed from: c */
    private ValueCallback<Uri[]> f63945c;

    /* renamed from: d */
    private boolean f63946d;

    /* renamed from: e */
    private Fragment f63947e;

    /* renamed from: f */
    private C58652c f63948f;

    /* renamed from: e */
    private Intent m93519e() {
        return new Intent("android.provider.MediaStore.RECORD_SOUND");
    }

    @Override // com.larksuite.component.webview.container.impl.p1172c.AbstractC25852c
    /* renamed from: a */
    public void mo91941a() {
        mo91943a(0, (Intent) null);
    }

    /* renamed from: c */
    private Intent m93517c() {
        try {
            return this.f63948f.mo198850a(false);
        } catch (IOException e) {
            this.f63948f.mo198851a();
            Log.m165390i("FileChooseHandler", "createCameraIntent", e);
            return new Intent("android.media.action.IMAGE_CAPTURE");
        }
    }

    /* renamed from: d */
    private Intent m93518d() {
        try {
            return this.f63948f.mo198852b(false);
        } catch (IOException e) {
            this.f63948f.mo198851a();
            Log.m165390i("FileChooseHandler", "createCamcorderIntent", e);
            return new Intent("android.media.action.VIDEO_CAPTURE");
        }
    }

    /* renamed from: b */
    private Intent m93516b() {
        Intent intent = new Intent("android.intent.action.GET_CONTENT");
        intent.addCategory("android.intent.category.OPENABLE");
        intent.setType("*/*");
        Intent a = m93514a(m93517c(), m93519e());
        a.putExtra("android.intent.extra.INTENT", intent);
        return a;
    }

    /* renamed from: a */
    private Intent m93513a(String str) {
        Intent intent = new Intent("android.intent.action.GET_CONTENT");
        intent.addCategory("android.intent.category.OPENABLE");
        intent.setType(str);
        return intent;
    }

    public C25845a(Fragment fragment) {
        this.f63947e = fragment;
        this.f63943a = fragment.getActivity();
        this.f63948f = new C58652c(fragment.getContext());
    }

    /* renamed from: a */
    private Intent m93514a(Intent... intentArr) {
        Intent intent = new Intent("android.intent.action.CHOOSER");
        intent.putExtra("android.intent.extra.INITIAL_INTENTS", intentArr);
        intent.putExtra("android.intent.extra.TITLE", this.f63943a.getResources().getString(R.string.Lark_Legacy_SelectToUpload));
        return intent;
    }

    /* renamed from: a */
    public void mo91946a(Uri... uriArr) {
        ValueCallback<Uri> valueCallback = this.f63944b;
        if (!(valueCallback == null || uriArr == null || uriArr.length <= 0)) {
            valueCallback.onReceiveValue(uriArr[0]);
        }
        ValueCallback<Uri[]> valueCallback2 = this.f63945c;
        if (valueCallback2 != null) {
            if (uriArr != null) {
                valueCallback2.onReceiveValue(uriArr);
            } else {
                valueCallback2.onReceiveValue(new Uri[0]);
            }
        }
        this.f63945c = null;
        this.f63944b = null;
        this.f63946d = false;
    }

    /* renamed from: a */
    private void m93515a(Intent intent, int i) {
        try {
            this.f63947e.startActivityForResult(intent, i);
        } catch (ActivityNotFoundException unused) {
            try {
                this.f63946d = true;
                this.f63947e.startActivityForResult(m93516b(), i);
            } catch (ActivityNotFoundException unused2) {
            }
        }
    }

    /* renamed from: a */
    public void mo91943a(int i, Intent intent) {
        Uri uri;
        if (i != 0 || !this.f63946d) {
            ArrayList arrayList = new ArrayList();
            if (intent == null || i != -1) {
                uri = null;
            } else {
                uri = intent.getData();
            }
            if (intent != null && uri == null) {
                ArrayList<String> stringArrayListExtra = intent.getStringArrayListExtra("SELECTED_PHOTOS");
                if (!CollectionUtils.isEmpty(stringArrayListExtra)) {
                    for (String str : stringArrayListExtra) {
                        if (!TextUtils.isEmpty(str)) {
                            File file = new File(str);
                            if (file.exists()) {
                                arrayList.add(Uri.fromFile(file));
                            }
                        }
                    }
                } else {
                    return;
                }
            } else if (uri == null && i == -1 && !TextUtils.isEmpty(this.f63948f.mo198854c())) {
                File file2 = new File(this.f63948f.mo198854c());
                if (file2.exists()) {
                    uri = Uri.fromFile(file2);
                    this.f63947e.getContext().sendBroadcast(new Intent("android.intent.action.MEDIA_SCANNER_SCAN_FILE", uri));
                }
            }
            if (uri != null) {
                arrayList.add(uri);
            }
            if (arrayList.isEmpty() || C51327f.m199080a(this.f63943a)) {
                mo91946a((Uri[]) arrayList.toArray(new Uri[0]));
                return;
            }
            final Uri[] uriArr = (Uri[]) arrayList.toArray(new Uri[0]);
            C51327f.m199083b(this.f63943a, new AbstractC51324c() {
                /* class com.larksuite.component.webview.container.impl.p1172c.C25845a.C258461 */

                @Override // com.ss.android.lark.permission.AbstractC51324c
                /* renamed from: a */
                public void mo49823a() {
                    C25845a.this.mo91946a(uriArr);
                }

                @Override // com.ss.android.lark.permission.AbstractC51324c
                /* renamed from: b */
                public void mo49824b() {
                    C25845a.this.mo91946a(new Uri[0]);
                    if (C25845a.this.f63943a != null && !C25845a.this.f63943a.isDestroyed()) {
                        new C51320a.C51322a(C25845a.this.f63943a, UIHelper.mustacheFormat((int) R.string.Lark_Legacy_PermissionRequiredAsk)).mo176898a(UIUtils.getString(C25845a.this.f63943a, R.string.Lark_Legacy_PermissionTitle)).mo176901b(UIUtils.getString(C25845a.this.f63943a, R.string.Lark_Legacy_Setting)).mo176899a(UIUtils.getString(C25845a.this.f63943a, R.string.Lark_Legacy_CancelTip), null).mo176897a(19991).mo176900a().mo176894a();
                    }
                }
            });
            return;
        }
        this.f63946d = false;
        mo91946a(new Uri[0]);
    }

    @Override // com.larksuite.component.webview.container.impl.p1172c.AbstractC25852c
    /* renamed from: a */
    public void mo91945a(ValueCallback<Uri[]> valueCallback, WebChromeClient.FileChooserParams fileChooserParams) {
        mo91944a(null, valueCallback, fileChooserParams.getAcceptTypes(), "", false);
    }

    @Override // com.larksuite.component.webview.container.impl.p1172c.AbstractC25852c
    /* renamed from: a */
    public void mo91942a(int i, int i2, Intent intent) {
        if (i == 12000 || i == 13000) {
            mo91943a(i2, intent);
        }
    }

    /* renamed from: a */
    public void mo91944a(final ValueCallback<Uri> valueCallback, final ValueCallback<Uri[]> valueCallback2, final String[] strArr, final String str, boolean z) {
        final int i;
        String str2;
        if ((this.f63944b == null && this.f63945c == null) || z) {
            this.f63944b = valueCallback;
            this.f63945c = valueCallback2;
            if (valueCallback2 != null) {
                i = 13000;
            } else {
                i = 12000;
            }
            String str3 = strArr[0];
            if (str3.equals("audio/*") || C51327f.m199084b(this.f63943a) || z) {
                if (str.length() > 0) {
                    str2 = str;
                } else {
                    str2 = "filesystem";
                }
                if (str.equals("filesystem")) {
                    for (String str4 : strArr) {
                        String[] split = str4.split(ContainerUtils.KEY_VALUE_DELIMITER);
                        if (split.length == 2 && "capture".equals(split[0])) {
                            str2 = split[1];
                        }
                    }
                }
                this.f63948f.mo198851a();
                if (str3.equals("image/*") || str3.contains("image/")) {
                    if (str2.equals("camera")) {
                        C58557a.m227127a().mo198520e(1).mo198525h(false).mo198532o(false).mo198526i(true).mo198512a(this.f63943a, this.f63947e, i);
                    } else {
                        C58557a.m227127a().mo198525h(false).mo198532o(false).mo198526i(true).mo198512a(this.f63943a, this.f63947e, i);
                    }
                } else if (str3.equals("video/*")) {
                    if (str2.equals("camcorder")) {
                        m93515a(m93518d(), i);
                        return;
                    }
                    Intent a = m93514a(m93518d());
                    a.putExtra("android.intent.extra.INTENT", m93513a("video/*"));
                    m93515a(a, i);
                } else if (!str3.equals("audio/*")) {
                    m93515a(m93516b(), i);
                } else if (str2.equals("microphone")) {
                    m93515a(m93519e(), i);
                } else {
                    Intent a2 = m93514a(m93519e());
                    a2.putExtra("android.intent.extra.INTENT", m93513a("audio/*"));
                    m93515a(a2, i);
                }
            } else {
                C57805b.m224331b(this.f63943a, new C57805b.AbstractC57809a() {
                    /* class com.larksuite.component.webview.container.impl.p1172c.C25845a.C258472 */

                    @Override // com.ss.android.lark.utils.C57805b.AbstractC57809a
                    public void permissionGranted(boolean z) {
                        if (z) {
                            C25845a.this.mo91944a(valueCallback, valueCallback2, strArr, str, true);
                        } else {
                            C25845a.this.mo91943a(i, (Intent) null);
                        }
                    }
                });
            }
        }
    }
}
