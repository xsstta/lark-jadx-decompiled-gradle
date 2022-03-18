package com.ss.android.lark.chatsetting.impl;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.text.TextUtils;
import com.larksuite.component.ui.toast.LKUIToast;
import com.larksuite.framework.utils.C26279i;
import com.larksuite.suite.R;
import com.ss.android.lark.chat.entity.chat.Chat;
import com.ss.android.lark.chatsetting.ChatSettingModule;
import com.ss.android.lark.http.p1953b.C38763d;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.time.format.Options;
import com.ss.android.lark.time.format.TimeFormatUtils;
import com.ss.android.lark.time.format.entity.DatePreciseness;
import com.ss.android.lark.time.format.entity.DisplayPattern;
import com.ss.android.lark.time.format.entity.LengthType;
import com.ss.android.lark.utils.UIHelper;
import java.util.Date;
import java.util.Map;
import java.util.TimeZone;

/* renamed from: com.ss.android.lark.chatsetting.impl.a */
public class C34501a {
    /* renamed from: a */
    public static boolean m133933a() {
        return ChatSettingModule.m133639a().mo127294x().mo127447a();
    }

    /* renamed from: b */
    public static boolean m133935b() {
        return ChatSettingModule.m133639a().mo127268a("im.chatsetting.group.ownership.v2");
    }

    /* renamed from: b */
    public static boolean m133936b(Chat chat) {
        if (m133934a(chat) || (chat != null && chat.isAdmin())) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static String m133931a(Map<String, String> map) {
        return C38763d.m153061a("https://" + ChatSettingModule.m133639a().mo127264a() + "/report/", map);
    }

    /* renamed from: a */
    public static boolean m133934a(Chat chat) {
        if (chat == null || chat.isP2PChat() || chat.getOwnerId() == null || !TextUtils.equals(chat.getOwnerId(), ChatSettingModule.m133639a().mo127277g().mo127412a())) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public static void m133932a(Context context, String str) {
        if (!TextUtils.isEmpty(str)) {
            try {
                ((ClipboardManager) context.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("", str));
            } catch (Exception e) {
                Log.m165387e("copy failed", (Throwable) e, true);
            }
            LKUIToast.show(context, (int) R.string.Lark_Legacy_CopyReady);
        }
    }

    /* renamed from: a */
    public static String m133929a(String str, String str2, long j) {
        LengthType lengthType;
        Date date = new Date(j * 1000);
        boolean c = C26279i.m95164c(date);
        Options aVar = new Options();
        aVar.mo191595a(TimeZone.getDefault().getID());
        aVar.mo191591a(DatePreciseness.DAY);
        if (c) {
            lengthType = LengthType.SHORT;
        } else {
            lengthType = LengthType.LONG;
        }
        aVar.mo191593a(lengthType);
        aVar.mo191592a(DisplayPattern.ABSOLUTE);
        return UIHelper.mustacheFormat(str, str2, TimeFormatUtils.m219291f(UIHelper.getContext(), date, aVar));
    }

    /* renamed from: a */
    public static String m133930a(String str, String str2, Date date) {
        LengthType lengthType;
        boolean c = C26279i.m95164c(date);
        Options aVar = new Options();
        aVar.mo191595a(TimeZone.getDefault().getID());
        aVar.mo191591a(DatePreciseness.DAY);
        if (c) {
            lengthType = LengthType.SHORT;
        } else {
            lengthType = LengthType.LONG;
        }
        aVar.mo191593a(lengthType);
        aVar.mo191592a(DisplayPattern.ABSOLUTE);
        return UIHelper.mustacheFormat(str, str2, TimeFormatUtils.m219289e(UIHelper.getContext(), date, aVar));
    }
}
