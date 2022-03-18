package com.larksuite.component.webview.container.impl.p1172c;

import android.content.DialogInterface;
import android.text.TextUtils;
import android.webkit.GeolocationPermissions;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.larksuite.component.ui.dialog.C25639g;
import com.larksuite.component.webview.container.impl.p1172c.C25848b;
import com.larksuite.suite.R;
import com.ss.android.lark.permission.rxPermission.C51331a;
import com.ss.android.lark.utils.UIHelper;
import io.reactivex.functions.Consumer;
import java.lang.ref.WeakReference;

/* renamed from: com.larksuite.component.webview.container.impl.c.b */
public class C25848b implements AbstractC25853d {

    /* renamed from: a */
    public C25851a f63957a;

    /* renamed from: b */
    private WeakReference<Fragment> f63958b;

    @Override // com.larksuite.component.webview.container.impl.p1172c.AbstractC25853d
    /* renamed from: a */
    public void mo91947a() {
    }

    /* renamed from: b */
    public void mo91949b() {
        this.f63957a = null;
    }

    public C25848b(Fragment fragment) {
        this.f63958b = new WeakReference<>(fragment);
    }

    /* renamed from: a */
    private boolean m93528a(String str) {
        C25851a aVar;
        if (TextUtils.isEmpty(str) || (aVar = this.f63957a) == null) {
            return false;
        }
        return str.equals(aVar.f63966a);
    }

    @Override // com.larksuite.component.webview.container.impl.p1172c.AbstractC25853d
    /* renamed from: a */
    public void mo91948a(final String str, final GeolocationPermissions.Callback callback) {
        WeakReference<Fragment> weakReference = this.f63958b;
        if (weakReference == null || weakReference.get() == null) {
            callback.invoke(str, false, false);
            return;
        }
        final Fragment fragment = this.f63958b.get();
        if (!fragment.isAdded()) {
            callback.invoke(str, false, false);
            return;
        }
        FragmentActivity activity = fragment.getActivity();
        if (activity == null || !activity.isFinishing()) {
            String mustacheFormat = UIHelper.mustacheFormat((int) R.string.Lark_Legacy_BrowserLocationAuthMessage, "baseurl", str);
            if (m93528a(str)) {
                callback.invoke(str, this.f63957a.f63967b, false);
            } else {
                new C25639g(activity).mo89248g(R.string.Lark_Legacy_BrowserLocationAuthTitle).mo89242c(mustacheFormat).mo89224a(R.id.lkui_dialog_btn_right, R.string.Lark_Legacy_PhoneAlertDialogConfirm, new DialogInterface.OnClickListener() {
                    /* class com.larksuite.component.webview.container.impl.p1172c.C25848b.DialogInterface$OnClickListenerC258502 */

                    public void onClick(DialogInterface dialogInterface, int i) {
                        C51331a aVar = new C51331a(fragment.getActivity());
                        if (aVar.mo176921a("android.permission.ACCESS_FINE_LOCATION")) {
                            callback.invoke(str, true, true);
                            C25848b bVar = C25848b.this;
                            bVar.f63957a = new C25851a(str, true);
                            return;
                        }
                        aVar.mo176924c("android.permission.ACCESS_FINE_LOCATION").subscribe(new Consumer(callback, str) {
                            /* class com.larksuite.component.webview.container.impl.p1172c.$$Lambda$b$2$AgLUf6m7vvbTH7r7aXfsNPXMPfk */
                            public final /* synthetic */ GeolocationPermissions.Callback f$1;
                            public final /* synthetic */ String f$2;

                            {
                                this.f$1 = r2;
                                this.f$2 = r3;
                            }

                            @Override // io.reactivex.functions.Consumer
                            public final void accept(Object obj) {
                                C25848b.DialogInterface$OnClickListenerC258502.this.m93532a(this.f$1, this.f$2, (Boolean) obj);
                            }
                        });
                    }

                    /* access modifiers changed from: private */
                    /* renamed from: a */
                    public /* synthetic */ void m93532a(GeolocationPermissions.Callback callback, String str, Boolean bool) throws Exception {
                        callback.invoke(str, bool.booleanValue(), bool.booleanValue());
                        C25848b bVar = C25848b.this;
                        bVar.f63957a = new C25851a(str, bool.booleanValue());
                    }
                }).mo89224a(R.id.lkui_dialog_btn_left, R.string.Lark_Legacy_PhoneAlertDialogCancel, new DialogInterface.OnClickListener() {
                    /* class com.larksuite.component.webview.container.impl.p1172c.C25848b.DialogInterface$OnClickListenerC258491 */

                    public void onClick(DialogInterface dialogInterface, int i) {
                        callback.invoke(str, false, false);
                        C25848b bVar = C25848b.this;
                        bVar.f63957a = new C25851a(str, false);
                    }
                }).mo89239c();
            }
        } else {
            callback.invoke(str, false, false);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: com.larksuite.component.webview.container.impl.c.b$a */
    public class C25851a {

        /* renamed from: a */
        public String f63966a;

        /* renamed from: b */
        public boolean f63967b;

        public C25851a(String str, boolean z) {
            this.f63966a = str;
            this.f63967b = z;
        }
    }
}
