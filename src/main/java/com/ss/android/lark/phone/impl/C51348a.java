package com.ss.android.lark.phone.impl;

import android.app.Activity;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.telecom.PhoneAccount;
import android.telecom.PhoneAccountHandle;
import android.telecom.TelecomManager;
import android.text.TextUtils;
import androidx.core.app.ActivityCompat;
import com.larksuite.component.ui.dialog.C25644o;
import com.larksuite.component.ui.toast.LKUIToast;
import com.larksuite.framework.utils.C26326z;
import com.larksuite.suite.R;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.permission.rxPermission.C51331a;
import com.ss.android.lark.phone.C51341b;
import com.ss.android.lark.phone.impl.C51348a;
import com.ss.android.lark.phone.statistics.PhoneHitPoint;
import com.ss.android.lark.util.share_preference.UserSP;
import com.ss.android.lark.utils.UIHelper;
import io.reactivex.functions.Consumer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.regex.Pattern;

/* renamed from: com.ss.android.lark.phone.impl.a */
public class C51348a {

    /* renamed from: com.ss.android.lark.phone.impl.a$b */
    public interface AbstractC51354b {
        /* renamed from: a */
        void mo176941a();

        /* renamed from: a */
        void mo176942a(List<C51352a> list, String str);
    }

    /* renamed from: a */
    public static void m199184a(boolean z, Activity activity, String str, AbstractC51354b bVar) {
        if (z) {
            try {
                activity.startActivity(new Intent("android.intent.action.CALL", Uri.parse("tel:" + str)));
            } catch (Exception e) {
                Log.m165397w("PhoneUtils", "singleSimCardCall failed " + e.getMessage());
                return;
            }
        } else {
            activity.startActivity(new Intent("android.intent.action.DIAL", Uri.parse("tel:" + str)).setFlags(268435456));
        }
        if (bVar != null) {
            bVar.mo176941a();
        }
    }

    /* renamed from: a */
    public static String m199176a() {
        return UserSP.getInstance().getString("sp.key.used.my.phone.number");
    }

    /* renamed from: a */
    public static void m199182a(String str) {
        UserSP.getInstance().putString("sp.key.used.my.phone.number", str);
    }

    /* renamed from: com.ss.android.lark.phone.impl.a$a */
    public static class C51352a {

        /* renamed from: a */
        public int f127871a;

        /* renamed from: b */
        public String f127872b;

        /* renamed from: c */
        public AbstractC51353a f127873c;

        /* renamed from: com.ss.android.lark.phone.impl.a$a$a */
        public interface AbstractC51353a {
            /* renamed from: a */
            void mo176961a();
        }

        public C51352a(int i, String str, AbstractC51353a aVar) {
            this.f127871a = i;
            this.f127872b = str;
            this.f127873c = aVar;
        }
    }

    /* renamed from: a */
    public static void m199179a(final Activity activity, final String str, final AbstractC51354b bVar) {
        new C51331a(activity).mo176924c("android.permission.CALL_PHONE").subscribe(new Consumer<Boolean>() {
            /* class com.ss.android.lark.phone.impl.C51348a.C513491 */

            /* renamed from: a */
            public void accept(Boolean bool) {
                try {
                    Log.m165389i("PhoneUtils", "makeCall");
                    if (!bool.booleanValue() || !C26326z.m95340d() || ActivityCompat.checkSelfPermission(activity, "android.permission.READ_PHONE_STATE") != 0) {
                        C51348a.m199184a(bool.booleanValue(), activity, str, bVar);
                        return;
                    }
                    TelecomManager telecomManager = (TelecomManager) activity.getSystemService("telecom");
                    List<PhoneAccountHandle> callCapablePhoneAccounts = telecomManager.getCallCapablePhoneAccounts();
                    if (callCapablePhoneAccounts == null || callCapablePhoneAccounts.size() < 2) {
                        C51348a.m199184a(bool.booleanValue(), activity, str, bVar);
                        return;
                    }
                    Log.m165389i("PhoneUtils", "phoneAccountHandles: size:" + callCapablePhoneAccounts.size());
                    AbstractC51354b bVar = bVar;
                    if (bVar != null) {
                        bVar.mo176942a(C51348a.m199177a(activity, telecomManager, callCapablePhoneAccounts, str, bVar), activity.getString(R.string.Lark_Legacy_SimSelect));
                    }
                } catch (Exception e) {
                    Log.m165382e("Make a failed call" + e.getMessage());
                    C51348a.m199184a(bool.booleanValue(), activity, str, bVar);
                }
            }
        });
    }

    /* renamed from: a */
    public static void m199180a(Context context, String str, AbstractC51354b bVar) {
        if (Pattern.matches("(\\d\\s*){9}", str)) {
            m199185b(context, str, bVar);
        } else {
            m199186c(context, str, bVar);
        }
    }

    /* renamed from: b */
    private static void m199185b(Context context, String str, AbstractC51354b bVar) {
        String mustacheFormat = UIHelper.mustacheFormat((int) R.string.View_G_IdOrPhoneNumber, "number", str);
        ((C25644o) ((C25644o) ((C25644o) ((C25644o) ((C25644o) new C25644o(context).mo89237b(mustacheFormat)).mo89250i(R.color.lkui_N600)).mo89249h(14)).mo89206a(context.getString(R.string.View_G_JoinMeeting), context.getString(R.string.Lark_Legacy_Call), context.getString(R.string.Lark_Legacy_Copy), context.getString(R.string.Lark_Legacy_CancelTip))).mo89202a(new DialogInterface.OnClickListener(str, context, bVar) {
            /* class com.ss.android.lark.phone.impl.$$Lambda$a$dw6xIQ53huSxqTbsmrdpKYHQVI4 */
            public final /* synthetic */ String f$0;
            public final /* synthetic */ Context f$1;
            public final /* synthetic */ C51348a.AbstractC51354b f$2;

            {
                this.f$0 = r1;
                this.f$1 = r2;
                this.f$2 = r3;
            }

            public final void onClick(DialogInterface dialogInterface, int i) {
                C51348a.lambda$dw6xIQ53huSxqTbsmrdpKYHQVI4(this.f$0, this.f$1, this.f$2, dialogInterface, i);
            }
        })).mo89239c();
        PhoneHitPoint.m199165a();
    }

    /* renamed from: c */
    private static void m199186c(Context context, String str, AbstractC51354b bVar) {
        ((C25644o) ((C25644o) ((C25644o) ((C25644o) ((C25644o) new C25644o(context).mo89237b(str + context.getResources().getString(R.string.Lark_Legacy_DialogPhoneDetermine))).mo89250i(R.color.lkui_N600)).mo89249h(14)).mo89206a(context.getString(R.string.Lark_Legacy_Call), context.getString(R.string.Lark_Legacy_Copy), context.getString(R.string.Lark_Legacy_CancelTip))).mo89202a(new DialogInterface.OnClickListener(context, str, bVar) {
            /* class com.ss.android.lark.phone.impl.$$Lambda$a$pC514uJolSaiyrWAZUeZHYJiXk */
            public final /* synthetic */ Context f$0;
            public final /* synthetic */ String f$1;
            public final /* synthetic */ C51348a.AbstractC51354b f$2;

            {
                this.f$0 = r1;
                this.f$1 = r2;
                this.f$2 = r3;
            }

            public final void onClick(DialogInterface dialogInterface, int i) {
                C51348a.m270877lambda$pC514uJolSaiyrWAZUeZHYJiXk(this.f$0, this.f$1, this.f$2, dialogInterface, i);
            }
        })).mo89239c();
    }

    /* renamed from: a */
    public static void m199178a(Activity activity, String str, PhoneAccountHandle phoneAccountHandle, AbstractC51354b bVar) {
        try {
            activity.startActivity(new Intent("android.intent.action.CALL", Uri.parse("tel:" + str)).putExtra("android.telecom.extra.PHONE_ACCOUNT_HANDLE", phoneAccountHandle));
            if (bVar != null) {
                bVar.mo176941a();
            }
        } catch (Exception e) {
            Log.m165397w("PhoneUtils", "doubleSimCardCall failed " + e.getMessage());
        }
    }

    /* renamed from: a */
    public static List<C51352a> m199177a(final Activity activity, TelecomManager telecomManager, List<PhoneAccountHandle> list, final String str, final AbstractC51354b bVar) {
        CharSequence label;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (PhoneAccountHandle phoneAccountHandle : list) {
            PhoneAccount phoneAccount = telecomManager.getPhoneAccount(phoneAccountHandle);
            if (phoneAccount != null) {
                arrayList2.add(phoneAccount);
            }
        }
        Collections.sort(arrayList2, new Comparator<PhoneAccount>() {
            /* class com.ss.android.lark.phone.impl.C51348a.C513502 */

            /* renamed from: a */
            public int compare(PhoneAccount phoneAccount, PhoneAccount phoneAccount2) {
                if (phoneAccount == null || phoneAccount2 == null) {
                    return 0;
                }
                CharSequence shortDescription = phoneAccount.getShortDescription();
                CharSequence shortDescription2 = phoneAccount2.getShortDescription();
                if (shortDescription == null || shortDescription2 == null) {
                    return 0;
                }
                return shortDescription.toString().compareTo(shortDescription2.toString());
            }
        });
        final int i = 0;
        while (i < arrayList2.size()) {
            final PhoneAccount phoneAccount2 = (PhoneAccount) arrayList2.get(i);
            final String str2 = null;
            String charSequence = (phoneAccount2 == null || (label = phoneAccount2.getLabel()) == null) ? null : label.toString();
            StringBuilder sb = new StringBuilder();
            sb.append("SIM");
            int i2 = i + 1;
            sb.append(i2);
            final String sb2 = sb.toString();
            if (!TextUtils.isEmpty(charSequence)) {
                sb2 = sb2 + " " + charSequence;
            }
            CharSequence shortDescription = phoneAccount2.getShortDescription();
            if (shortDescription != null) {
                str2 = shortDescription.toString();
            }
            Log.m165389i("PhoneUtils", "Show simIndex: " + i + " displaySIMInfo:" + sb2 + " shortDescription:" + str2);
            arrayList.add(new C51352a(i, sb2, new C51352a.AbstractC51353a() {
                /* class com.ss.android.lark.phone.impl.C51348a.C513513 */

                @Override // com.ss.android.lark.phone.impl.C51348a.C51352a.AbstractC51353a
                /* renamed from: a */
                public void mo176961a() {
                    Log.m165389i("PhoneUtils", "Click simIndex: " + i + " displaySIMInfo:" + sb2 + " shortDescription:" + str2);
                    C51348a.m199178a(activity, str, phoneAccount2.getAccountHandle(), bVar);
                }
            }));
            i = i2;
        }
        return arrayList;
    }

    /* renamed from: a */
    public static /* synthetic */ void m199181a(Context context, String str, AbstractC51354b bVar, DialogInterface dialogInterface, int i) {
        ClipboardManager clipboardManager;
        if (i == 0) {
            m199179a((Activity) context, str, bVar);
        } else if (i == 1 && (clipboardManager = (ClipboardManager) context.getSystemService("clipboard")) != null) {
            clipboardManager.setPrimaryClip(ClipData.newPlainText("", str));
            LKUIToast.show(context, (int) R.string.Lark_Legacy_CopyReady);
        }
    }

    /* renamed from: a */
    public static /* synthetic */ void m199183a(String str, Context context, AbstractC51354b bVar, DialogInterface dialogInterface, int i) {
        ClipboardManager clipboardManager;
        if (i == 0) {
            C51341b.m199137a().mo144006f().openJoinMeetingPage(context, str.replaceAll("\\s", ""));
        } else if (i == 1) {
            m199179a((Activity) context, str, bVar);
        } else if (i == 2 && (clipboardManager = (ClipboardManager) context.getSystemService("clipboard")) != null) {
            clipboardManager.setPrimaryClip(ClipData.newPlainText("", str));
            LKUIToast.show(context, (int) R.string.Lark_Legacy_CopyReady);
        }
        PhoneHitPoint.m199166a(i);
    }
}
