package com.ss.android.lark.mail.impl.share;

import android.app.Activity;
import android.content.DialogInterface;
import android.text.TextUtils;
import com.alibaba.fastjson.JSONArray;
import com.bytedance.lark.pb.email.client.v1.PermissionCode;
import com.bytedance.lark.pb.email.client.v1.UserInfo;
import com.larksuite.component.ui.dialog.C25639g;
import com.larksuite.suite.R;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.mail.impl.C41816b;
import com.ss.android.lark.mail.impl.compose.attachment.LocalAttachment;
import com.ss.android.lark.mail.impl.entity.C42104p;
import com.ss.android.lark.mail.impl.entity.ShareMailAddress;
import com.ss.android.lark.mail.impl.share.collaborate.Collaborator;
import com.ss.android.lark.mail.impl.utils.C43779n;
import com.ss.android.lark.mail.impl.utils.C43819s;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.lark.mail.impl.share.h */
public class C43691h {

    /* renamed from: a */
    private static String f110859a = "show_share_discuss_guiding_dot";

    /* renamed from: b */
    private static Boolean f110860b;

    /* renamed from: com.ss.android.lark.mail.impl.share.h$a */
    public interface AbstractC43693a {
        void onOKButtonClick();
    }

    /* renamed from: b */
    public static String m173283b() {
        int n = C41816b.m166115a().mo150147n();
        if (n == 2) {
            return "https://internal-api.larksuite.com/space/api/box/stream/download/all/";
        }
        if (n == 3) {
            return "https://internal-api.feishu-staging.cn/space/api/box/stream/download/all/";
        }
        if (n != 4) {
            return "https://internal-api.feishu.cn/space/api/box/stream/download/all/";
        }
        return "https://internal-api.larksuite-staging.com/space/api/box/stream/download/all/";
    }

    /* renamed from: a */
    public static boolean m173279a() {
        if (f110860b == null) {
            f110860b = Boolean.valueOf(!C43779n.m173507a().contains(f110859a));
        }
        if (!f110860b.booleanValue()) {
            return false;
        }
        f110860b = false;
        C43779n.m173507a().putBoolean(f110859a, false);
        return true;
    }

    /* renamed from: a */
    public static boolean m173280a(PermissionCode permissionCode) {
        if (permissionCode == null || permissionCode == PermissionCode.NONE || permissionCode == PermissionCode.OWNER) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static boolean m173281a(C42104p pVar) {
        if (pVar == null) {
            return false;
        }
        return m173280a(pVar.mo152021c());
    }

    /* renamed from: a */
    public static Collaborator m173276a(UserInfo userInfo) {
        if (userInfo == null || TextUtils.isEmpty(userInfo.user_id)) {
            Log.m165383e("ShareUtil", "userInfoToCollaborator null");
            return null;
        }
        Collaborator collaborator = new Collaborator(userInfo.user_id, userInfo.collaborator_type);
        collaborator.avatar = userInfo.avatar;
        collaborator.en_name = userInfo.en_name;
        collaborator.cn_name = userInfo.cn_name;
        collaborator.code = userInfo.code;
        collaborator.department = userInfo.department;
        collaborator.email_address = userInfo.email_address;
        collaborator.permissionActionList = userInfo.permission_action;
        return collaborator;
    }

    /* renamed from: a */
    public static ArrayList<LocalAttachment> m173277a(JSONArray jSONArray) {
        Log.m165389i("ShareUtil", "parseSharedAttachmentList");
        if (jSONArray == null || jSONArray.size() == 0) {
            Log.m165383e("ShareUtil", "parseSharedAttachmentList empty data");
            return null;
        }
        try {
            ArrayList<LocalAttachment> arrayList = new ArrayList<>();
            int size = jSONArray.size();
            for (int i = 0; i < size; i++) {
                LocalAttachment a = LocalAttachment.m166708a(jSONArray.getJSONObject(i));
                if (a != null) {
                    arrayList.add(a);
                }
            }
            return arrayList;
        } catch (Exception e) {
            Log.m165384e("ShareUtil", "parseSharedAttachmentList", e);
            return null;
        }
    }

    /* renamed from: b */
    public static List<ShareMailAddress> m173284b(JSONArray jSONArray) {
        Log.m165389i("ShareUtil", "parseSharedAttachmentList");
        ArrayList arrayList = new ArrayList();
        if (jSONArray == null || jSONArray.size() == 0) {
            Log.m165383e("ShareUtil", "parseSharedRecipientList empty data");
            return arrayList;
        }
        int size = jSONArray.size();
        for (int i = 0; i < size; i++) {
            ShareMailAddress a = ShareMailAddress.m167846a(jSONArray.getJSONObject(i));
            if (a != null) {
                arrayList.add(a);
            }
        }
        return arrayList;
    }

    /* renamed from: b */
    private static C25639g.C25640a m173282b(Activity activity, final AbstractC43693a aVar) {
        C25639g.C25640a aVar2 = new C25639g.C25640a();
        aVar2.mo89266a(R.id.lkui_dialog_btn_center);
        aVar2.mo89268a(C43819s.m173684a((int) R.string.Mail_Alert_OK));
        aVar2.mo89272e(activity.getResources().getColor(R.color.primary_pri_500));
        aVar2.mo89267a(new DialogInterface.OnClickListener() {
            /* class com.ss.android.lark.mail.impl.share.C43691h.DialogInterface$OnClickListenerC436921 */

            public void onClick(DialogInterface dialogInterface, int i) {
                AbstractC43693a aVar = aVar;
                if (aVar != null) {
                    aVar.onOKButtonClick();
                }
            }
        });
        return aVar2;
    }

    /* renamed from: a */
    public static void m173278a(Activity activity, AbstractC43693a aVar) {
        Log.m165389i("ShareUtil", "showShareThreadDeletedDialog");
        if (activity != null && !activity.isFinishing()) {
            new C25639g(activity).mo89254m(R.string.Mail_Share_ShareThreadDeletedHint).mo89246d(false).mo89247e(false).mo89229a(m173282b(activity, aVar)).mo89239c();
        }
    }
}
