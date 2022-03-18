package com.ss.android.lark.ding.service.impl;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Bitmap;
import com.larksuite.component.ui.dialog.C25639g;
import com.larksuite.component.ui.toast.LKUIToast;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.callback.UICallbackExecutor;
import com.larksuite.framework.utils.C26271f;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.ding.C36618a;
import com.ss.android.lark.ding.dependency.IDingModuleDependency;
import com.ss.android.lark.ding.service.AbstractC36674b;
import com.ss.android.lark.permission.AbstractC51324c;
import com.ss.android.lark.permission.C51327f;
import com.ss.android.lark.util.share_preference.UserSP;
import com.ss.android.lark.utils.C57820d;
import com.ss.android.lark.utils.UIHelper;
import java.io.ByteArrayOutputStream;
import java.lang.ref.WeakReference;
import java.util.List;

/* renamed from: com.ss.android.lark.ding.service.impl.a */
public class C36678a implements AbstractC36674b {

    /* renamed from: a */
    public static IDingModuleDependency.ISettingDependency f94294a = C36618a.m144492a().mo135101f();

    /* renamed from: com.ss.android.lark.ding.service.impl.a$a */
    private static final class C36684a {

        /* renamed from: a */
        public static final C36678a f94306a = new C36678a();
    }

    /* renamed from: b */
    public static C36678a m144755b() {
        return C36684a.f94306a;
    }

    /* renamed from: c */
    public void mo135286c() {
        UserSP.getInstance().putBoolean("ding_address_book_tips_need_show", true);
    }

    /* renamed from: d */
    private static boolean m144757d() {
        boolean z;
        boolean o = C36618a.m144492a().mo135110o();
        boolean b = C36618a.m144492a().mo135102g().mo135155b();
        if (!o || b) {
            z = true;
        } else {
            z = false;
        }
        if (z && !UserSP.getInstance().getBoolean("ding_address_book_tips_showed", false)) {
            return UserSP.getInstance().getBoolean("ding_address_book_tips_need_show", false);
        }
        return false;
    }

    @Override // com.ss.android.lark.ding.service.AbstractC36674b
    /* renamed from: a */
    public void mo135268a() {
        C26271f.C26272a aVar = new C26271f.C26272a();
        Context a = C36618a.m144492a().mo135096a();
        aVar.mo93382a(UIHelper.mustacheFormat((int) R.string.Lark_Legacy_DingTitle));
        new C26271f(a).mo93380b(aVar);
        f94294a.mo135116a(false);
    }

    /* renamed from: b */
    private void m144756b(final Activity activity) {
        UICallbackExecutor.execute(new Runnable() {
            /* class com.ss.android.lark.ding.service.impl.C36678a.RunnableC366823 */

            public void run() {
                if (UIUtils.isActivityRunning(activity)) {
                    UserSP.getInstance().putBoolean("ding_address_book_tips_showed", true);
                    final WeakReference weakReference = new WeakReference(activity);
                    new C25639g(activity).mo89248g(R.string.Lark_Legacy_DingPhoneFirstRecTitle).mo89254m(R.string.Lark_Legacy_UrgentAddressBookTip).mo89251j(2).mo89225a(R.id.lkui_dialog_btn_left, UIHelper.getString(R.string.Lark_Legacy_RemindMeLater), (DialogInterface.OnClickListener) null).mo89225a(R.id.lkui_dialog_btn_right, UIHelper.getString(R.string.Lark_Legacy_SettingRightnow), new DialogInterface.OnClickListener() {
                        /* class com.ss.android.lark.ding.service.impl.C36678a.RunnableC366823.DialogInterface$OnClickListenerC366831 */

                        public void onClick(DialogInterface dialogInterface, int i) {
                            if (weakReference.get() != null) {
                                C36678a.this.mo135285a((Activity) weakReference.get(), true, null);
                            }
                        }
                    }).mo89239c();
                }
            }
        });
    }

    /* renamed from: a */
    public static byte[] m144754a(Bitmap bitmap) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        bitmap.compress(Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream);
        return byteArrayOutputStream.toByteArray();
    }

    @Override // com.ss.android.lark.ding.service.AbstractC36674b
    /* renamed from: a */
    public void mo135269a(final IGetDataCallback iGetDataCallback) {
        f94294a.mo135115a(new IGetDataCallback<List<String>>() {
            /* class com.ss.android.lark.ding.service.impl.C36678a.C366812 */

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                IGetDataCallback iGetDataCallback = iGetDataCallback;
                if (iGetDataCallback != null) {
                    iGetDataCallback.onError(errorResult);
                }
            }

            /* renamed from: a */
            public void onSuccess(List<String> list) {
                C26271f.C26272a aVar = new C26271f.C26272a();
                Context a = C36618a.m144492a().mo135096a();
                aVar.mo93382a(UIHelper.mustacheFormat((int) R.string.Lark_Legacy_DingTitle));
                aVar.mo93383a(list);
                aVar.mo93384a(C36678a.m144754a(C57820d.m224430a(UIUtils.getDrawable(a, C36618a.m144492a().mo135098c()))));
                new C26271f(a).mo93379a(aVar);
                C36678a.f94294a.mo135116a(true);
            }
        });
    }

    @Override // com.ss.android.lark.ding.service.AbstractC36674b
    /* renamed from: a */
    public boolean mo135270a(Activity activity) {
        if (!m144757d()) {
            return false;
        }
        m144756b(activity);
        return true;
    }

    /* renamed from: a */
    public void mo135285a(Activity activity, final boolean z, final IGetDataCallback iGetDataCallback) {
        final WeakReference weakReference = new WeakReference(activity);
        C51327f.m199086c(activity, new AbstractC51324c() {
            /* class com.ss.android.lark.ding.service.impl.C36678a.C366791 */

            @Override // com.ss.android.lark.permission.AbstractC51324c
            /* renamed from: b */
            public void mo49824b() {
                UICallbackExecutor.execute(new Runnable() {
                    /* class com.ss.android.lark.ding.service.impl.C36678a.C366791.RunnableC366801 */

                    public void run() {
                        if (weakReference.get() != null) {
                            LKUIToast.show((Context) weakReference.get(), UIUtils.getString((Context) weakReference.get(), R.string.Lark_Legacy_PermissionFailTip));
                        }
                    }
                });
            }

            @Override // com.ss.android.lark.permission.AbstractC51324c
            /* renamed from: a */
            public void mo49823a() {
                if (weakReference.get() == null) {
                    return;
                }
                if (z) {
                    C36678a.this.mo135269a(iGetDataCallback);
                } else {
                    C36678a.this.mo135268a();
                }
            }
        });
    }
}
