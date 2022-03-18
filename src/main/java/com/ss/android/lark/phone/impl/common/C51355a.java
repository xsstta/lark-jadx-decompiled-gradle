package com.ss.android.lark.phone.impl.common;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.text.TextUtils;
import com.larksuite.component.ui.dialog.C25642j;
import com.larksuite.component.ui.toast.LKUIToast;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.callback.UIGetDataCallback;
import com.larksuite.suite.R;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.phone.impl.C51348a;
import com.ss.android.lark.phone.impl.service.C51413a;
import com.ss.android.lark.phone.impl.service.entity.C51425a;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.lark.widget.p2932c.C58329a;
import com.ss.android.lark.widget.p2932c.C58339d;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.lark.phone.impl.common.a */
public class C51355a {

    /* renamed from: a */
    public static String f127874a;

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ void m199197a(CharSequence charSequence) {
        f127874a = charSequence.toString();
    }

    /* renamed from: a */
    public static void m199196a(Activity activity, List<C51348a.C51352a> list, String str) {
        m199193a((Context) activity, list, str).show();
    }

    /* renamed from: a */
    public static Dialog m199193a(Context context, List<C51348a.C51352a> list, String str) {
        ArrayList arrayList = new ArrayList();
        for (final C51348a.C51352a aVar : list) {
            arrayList.add(new C58339d.C58341a(aVar.f127871a, aVar.f127872b, new C58339d.AbstractC58343b() {
                /* class com.ss.android.lark.phone.impl.common.C51355a.C513582 */

                @Override // com.ss.android.lark.widget.p2932c.C58339d.AbstractC58343b
                public void onMenuItemClick() {
                    if (aVar.f127873c != null) {
                        aVar.f127873c.mo176961a();
                    }
                }
            }));
        }
        return new C58339d.C58344c(context, arrayList, str).mo197576a();
    }

    /* renamed from: a */
    public static void m199194a(final Activity activity, String str, final String str2) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new C58329a.C58331a().mo197546a(str).mo197545a(new C58339d.AbstractC58343b() {
            /* class com.ss.android.lark.phone.impl.common.C51355a.C513561 */

            @Override // com.ss.android.lark.widget.p2932c.C58339d.AbstractC58343b
            public void onMenuItemClick() {
                C51348a.m199179a(activity, str2, (C51348a.AbstractC51354b) new C51348a.AbstractC51354b() {
                    /* class com.ss.android.lark.phone.impl.common.C51355a.C513561.C513571 */

                    @Override // com.ss.android.lark.phone.impl.C51348a.AbstractC51354b
                    /* renamed from: a */
                    public void mo176941a() {
                    }

                    @Override // com.ss.android.lark.phone.impl.C51348a.AbstractC51354b
                    /* renamed from: a */
                    public void mo176942a(List<C51348a.C51352a> list, String str) {
                        C51355a.m199196a(activity, list, str);
                    }
                });
            }
        }).mo197558j());
        C58339d.m226198b(activity, arrayList, true);
    }

    /* renamed from: b */
    public static void m199198b(final Activity activity, final String str, String str2) {
        if (!TextUtils.isEmpty(str2)) {
            str2 = str2.replaceAll("[\\s\\+]", "");
        }
        f127874a = str2;
        ((C25642j) ((C25642j) ((C25642j) ((C25642j) ((C25642j) ((C25642j) ((C25642j) ((C25642j) new C25642j(activity).mo89248g(R.string.Lark_Legacy_UrgentCallTitleofConfirm)).mo89238b(true)).mo89251j(2)).mo89254m(R.string.Lark_Legacy_UrgentCallDesc)).mo89282a(UIHelper.getString(R.string.Lark_Legacy_UrgentCallInputPlaceholder)).mo89283d(str2).mo89280a(3).mo89247e(false)).mo89243c(false)).mo89281a($$Lambda$a$cpNBbBJEJK3tzbg1YVd_xiyRU.INSTANCE).mo89224a(R.id.lkui_dialog_btn_right, R.string.Lark_Legacy_ConfirmTip, new DialogInterface.OnClickListener() {
            /* class com.ss.android.lark.phone.impl.common.C51355a.DialogInterface$OnClickListenerC513604 */

            public void onClick(DialogInterface dialogInterface, int i) {
                String replaceAll = C51355a.f127874a.replaceAll(" ", "");
                if (TextUtils.isEmpty(replaceAll)) {
                    LKUIToast.show(activity, (int) R.string.Lark_Legacy_UrgentCallInputTips);
                    return;
                }
                C51348a.m199182a(replaceAll);
                dialogInterface.dismiss();
                C51413a.m199326a().mo177048b(replaceAll, str, new UIGetDataCallback(new IGetDataCallback<C51425a>() {
                    /* class com.ss.android.lark.phone.impl.common.C51355a.DialogInterface$OnClickListenerC513604.C513611 */

                    /* renamed from: a */
                    public void onSuccess(C51425a aVar) {
                        C51355a.m199195a(activity, aVar.mo177077b(), aVar.mo177076a(), aVar.mo177078c());
                    }

                    @Override // com.larksuite.framework.callback.IGetDataCallback
                    public void onError(ErrorResult errorResult) {
                        Log.m165396w("getEmergencyCallNumber failed: " + errorResult.getErrorMsg());
                        if (!TextUtils.isEmpty(errorResult.getErrorMsg())) {
                            LKUIToast.show(activity, errorResult.getErrorMsg());
                        }
                    }
                }));
            }
        })).mo89225a(R.id.lkui_dialog_btn_left, UIHelper.getString(R.string.Lark_Legacy_Cancel), new DialogInterface.OnClickListener() {
            /* class com.ss.android.lark.phone.impl.common.C51355a.DialogInterface$OnClickListenerC513593 */

            public void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.dismiss();
            }
        })).mo89239c();
    }

    /* renamed from: a */
    public static void m199195a(final Activity activity, String str, String str2, final boolean z) {
        C51348a.m199179a(activity, str, (C51348a.AbstractC51354b) new C51348a.AbstractC51354b() {
            /* class com.ss.android.lark.phone.impl.common.C51355a.C513625 */

            @Override // com.ss.android.lark.phone.impl.C51348a.AbstractC51354b
            /* renamed from: a */
            public void mo176941a() {
            }

            @Override // com.ss.android.lark.phone.impl.C51348a.AbstractC51354b
            /* renamed from: a */
            public void mo176942a(List<C51348a.C51352a> list, String str) {
                C51355a.m199196a(activity, list, str);
            }
        });
    }
}
