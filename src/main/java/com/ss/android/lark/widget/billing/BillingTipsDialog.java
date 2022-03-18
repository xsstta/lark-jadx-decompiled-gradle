package com.ss.android.lark.widget.billing;

import android.content.Context;
import android.content.DialogInterface;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.util.Log;
import com.larksuite.component.ui.dialog.C25639g;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.callback.UICallbackExecutor;
import com.larksuite.suite.R;
import com.ss.android.lark.C37030f;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.lark.widget.billing.BillingTipsDialog;
import com.ss.android.lark.widget.linked_emojicon.C58513g;
import org.json.JSONException;
import org.json.JSONObject;

public class BillingTipsDialog {

    /* renamed from: a */
    public static Boolean f143501a;

    /* renamed from: a */
    public static boolean m226153a(int i) {
        return i == 6002;
    }

    public enum Type {
        UNKNOWN(-1, R.string.Lark_Legacy_UnknownErr, R.string.Lark_Group_Cancel, R.string.Lark_Group_UplimitContactSalesButton, ""),
        CHAT_ADD_MEM_NUMBER_LIMIT(1, R.string.Lark_Group_UplimitUnableAddTitle, R.string.Lark_Group_Cancel, R.string.Lark_Group_UplimitContactSalesButton, "chat_number_limit"),
        CHAT_CREATE_GROUP_NUMBER_LIMIT(2, R.string.Lark_Group_UplimitUnableCreateTitle, R.string.Lark_Group_Cancel, R.string.Lark_Group_UplimitContactSalesButton, "chat_number_limit"),
        CHAT_JOIN_GROUP_NUMBER_LIMIT(3, R.string.Lark_Group_UplimitUnableJoinTitle, R.string.Lark_Group_Cancel, R.string.Lark_Group_UplimitContactSalesButton, "chat_number_limit"),
        CHAT_CREATE_EXTERNEL_GROUP_NUMBER_LIMIT(4, R.string.Lark_Group_UnableToCreateUplimitTitle, R.string.Lark_Group_Cancel, R.string.Lark_Group_UplimitContactSalesButton, "chat_number_limit"),
        CHAT_JOIN_EXTERNEL_GROUP_NUMBER_LIMIT(5, R.string.Lark_Group_UnableToJoinUplimitTitle, R.string.Lark_Group_Cancel, R.string.Lark_Group_UplimitContactSalesButton, "chat_number_limit"),
        BUZZ_LIMIT_ADMIN(6, R.string.Lark_Buzz_CantBuzzContactSupport, R.string.Lark_Buzz_ExceededQuotaButtonClose, R.string.Lark_Buzz_ExceededQuotaButton, "buzz_limit"),
        BUZZ_LIMIT_USER(7, R.string.Lark_Buzz_CantBuzzContactAdmin, -1, R.string.Lark_Legacy_IKnow, "buzz_limit");
        
        final int defaultTipsRes;
        final int leftBtnRes;
        final String reportType;
        final int rightBtnRes;
        final int value;

        public int getNumber() {
            return this.value;
        }

        public static Type valueOf(int i) {
            return forNumber(i);
        }

        public static Type forNumber(int i) {
            switch (i) {
                case 1:
                    return CHAT_ADD_MEM_NUMBER_LIMIT;
                case 2:
                    return CHAT_CREATE_GROUP_NUMBER_LIMIT;
                case 3:
                    return CHAT_JOIN_GROUP_NUMBER_LIMIT;
                case 4:
                    return CHAT_CREATE_EXTERNEL_GROUP_NUMBER_LIMIT;
                case 5:
                    return CHAT_JOIN_EXTERNEL_GROUP_NUMBER_LIMIT;
                case 6:
                    return BUZZ_LIMIT_ADMIN;
                case 7:
                    return BUZZ_LIMIT_USER;
                default:
                    return UNKNOWN;
            }
        }

        private Type(int i, int i2, int i3, int i4, String str) {
            this.value = i;
            this.defaultTipsRes = i2;
            this.leftBtnRes = i3;
            this.rightBtnRes = i4;
            this.reportType = str;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.lark.widget.billing.BillingTipsDialog$3 */
    public static /* synthetic */ class C583273 {

        /* renamed from: a */
        static final /* synthetic */ int[] f143504a;

        /* JADX WARNING: Can't wrap try/catch for region: R(14:0|1|2|3|4|5|6|7|8|9|10|11|12|14) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                com.ss.android.lark.widget.billing.BillingTipsDialog$Type[] r0 = com.ss.android.lark.widget.billing.BillingTipsDialog.Type.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.ss.android.lark.widget.billing.BillingTipsDialog.C583273.f143504a = r0
                com.ss.android.lark.widget.billing.BillingTipsDialog$Type r1 = com.ss.android.lark.widget.billing.BillingTipsDialog.Type.BUZZ_LIMIT_ADMIN     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = com.ss.android.lark.widget.billing.BillingTipsDialog.C583273.f143504a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.ss.android.lark.widget.billing.BillingTipsDialog$Type r1 = com.ss.android.lark.widget.billing.BillingTipsDialog.Type.CHAT_CREATE_GROUP_NUMBER_LIMIT     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = com.ss.android.lark.widget.billing.BillingTipsDialog.C583273.f143504a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.ss.android.lark.widget.billing.BillingTipsDialog$Type r1 = com.ss.android.lark.widget.billing.BillingTipsDialog.Type.CHAT_JOIN_GROUP_NUMBER_LIMIT     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = com.ss.android.lark.widget.billing.BillingTipsDialog.C583273.f143504a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.ss.android.lark.widget.billing.BillingTipsDialog$Type r1 = com.ss.android.lark.widget.billing.BillingTipsDialog.Type.CHAT_ADD_MEM_NUMBER_LIMIT     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = com.ss.android.lark.widget.billing.BillingTipsDialog.C583273.f143504a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.ss.android.lark.widget.billing.BillingTipsDialog$Type r1 = com.ss.android.lark.widget.billing.BillingTipsDialog.Type.CHAT_CREATE_EXTERNEL_GROUP_NUMBER_LIMIT     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = com.ss.android.lark.widget.billing.BillingTipsDialog.C583273.f143504a     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.ss.android.lark.widget.billing.BillingTipsDialog$Type r1 = com.ss.android.lark.widget.billing.BillingTipsDialog.Type.CHAT_JOIN_EXTERNEL_GROUP_NUMBER_LIMIT     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.widget.billing.BillingTipsDialog.C583273.<clinit>():void");
        }
    }

    /* renamed from: h */
    private static String m226160h(Type type) {
        return type.reportType;
    }

    /* renamed from: d */
    private static String m226156d(Type type) {
        return UIHelper.getString(type.rightBtnRes);
    }

    /* renamed from: e */
    private static String m226157e(Type type) {
        if (type.leftBtnRes == -1) {
            return "";
        }
        return UIHelper.getString(type.leftBtnRes);
    }

    /* renamed from: f */
    private static void m226158f(final Type type) {
        if (f143501a == null) {
            C37030f.m146093a().mo103023a(new IGetDataCallback<Boolean>() {
                /* class com.ss.android.lark.widget.billing.BillingTipsDialog.C583251 */

                /* renamed from: a */
                public void onSuccess(Boolean bool) {
                    BillingTipsDialog.f143501a = bool;
                    BillingTipsDialog.m226152a(type);
                }

                @Override // com.larksuite.framework.callback.IGetDataCallback
                public void onError(ErrorResult errorResult) {
                    Log.e("BillingTipsDialog", "Failed to check is Admin");
                }
            });
        } else {
            m226152a(type);
        }
    }

    /* renamed from: g */
    private static void m226159g(final Type type) {
        if (f143501a == null) {
            C37030f.m146093a().mo103023a(new IGetDataCallback<Boolean>() {
                /* class com.ss.android.lark.widget.billing.BillingTipsDialog.C583262 */

                /* renamed from: a */
                public void onSuccess(Boolean bool) {
                    BillingTipsDialog.f143501a = bool;
                    BillingTipsDialog.m226154b(type);
                }

                @Override // com.larksuite.framework.callback.IGetDataCallback
                public void onError(ErrorResult errorResult) {
                    Log.e("BillingTipsDialog", "Failed to check is Admin");
                }
            });
        } else {
            m226154b(type);
        }
    }

    /* renamed from: b */
    public static void m226154b(Type type) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("function_type", m226160h(type));
            jSONObject.put("admin_flag", f143501a);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        C37030f.m146093a().mo103026a("common_pricing_popup_click", jSONObject);
    }

    /* renamed from: c */
    private static String m226155c(Type type) {
        switch (C583273.f143504a[type.ordinal()]) {
            case 1:
                return "https://applink.feishu.cn/client/helpdesk/open?id=6626260912531570952&extra=%7B%22channel%22%3A14%2C%22created_at%22%3A1616898084%2C%22human_service%22%3Atrue%2C%22scenario_id%22%3A6888204905589325826%2C%22signature%22%3A%2278b0c5156b727a66d02c9b689ea0785d1a865bb5%22%7D";
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                return "https://www.feishu.cn/hc/zh-CN/articles/360034114413";
            default:
                return "";
        }
    }

    /* renamed from: a */
    public static void m226152a(Type type) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("function_type", m226160h(type));
            jSONObject.put("admin_flag", f143501a);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        C37030f.m146093a().mo103026a("common_pricing_popup_view", jSONObject);
    }

    /* renamed from: a */
    private static String m226148a(String str, Type type) {
        if (!TextUtils.isEmpty(str)) {
            return str;
        }
        return UIHelper.getString(type.defaultTipsRes);
    }

    /* renamed from: a */
    public static void m226151a(Context context, String str, Type type) {
        UICallbackExecutor.execute(new Runnable(context, type, str) {
            /* class com.ss.android.lark.widget.billing.$$Lambda$BillingTipsDialog$rQjuu5PtCacotK36IzHOMdz_EFU */
            public final /* synthetic */ Context f$0;
            public final /* synthetic */ BillingTipsDialog.Type f$1;
            public final /* synthetic */ String f$2;

            {
                this.f$0 = r1;
                this.f$1 = r2;
                this.f$2 = r3;
            }

            public final void run() {
                BillingTipsDialog.m226150a(this.f$0, this.f$1, this.f$2);
            }
        });
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ void m226150a(Context context, Type type, String str) {
        C58513g gVar = new C58513g(context);
        gVar.append(m226156d(type), new ForegroundColorSpan(UIHelper.getColor(R.color.lkui_B500)), 33);
        C25639g a = new C25639g(context).mo89242c(m226148a(str, type)).mo89225a(R.id.lkui_dialog_btn_right, gVar, new DialogInterface.OnClickListener(context, type) {
            /* class com.ss.android.lark.widget.billing.$$Lambda$BillingTipsDialog$4DkoqdBhXvIE_DDlD5f_2GyJGZw */
            public final /* synthetic */ Context f$0;
            public final /* synthetic */ BillingTipsDialog.Type f$1;

            {
                this.f$0 = r1;
                this.f$1 = r2;
            }

            public final void onClick(DialogInterface dialogInterface, int i) {
                BillingTipsDialog.m226149a(this.f$0, this.f$1, dialogInterface, i);
            }
        });
        String e = m226157e(type);
        if (!TextUtils.isEmpty(e)) {
            a.mo89225a(R.id.lkui_dialog_btn_left, e, (DialogInterface.OnClickListener) null);
        }
        a.mo89239c();
        m226158f(type);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ void m226149a(Context context, Type type, DialogInterface dialogInterface, int i) {
        C37030f.m146093a().mo103022a(context, m226155c(type));
        m226159g(type);
        dialogInterface.dismiss();
    }
}
