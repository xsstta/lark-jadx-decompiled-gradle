package com.ss.android.lark.statistics.p2701o;

import com.huawei.hms.android.HwBuildEx;
import com.larksuite.framework.utils.CollectionUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.chat.base.view.vo.message.PostContentVO;
import com.ss.android.lark.chat.base.view.vo.message.TextContentVO;
import com.ss.android.lark.chat.export.ui.p1672b.C34029b;
import com.ss.android.lark.chat.export.vo.ContentVO;
import com.ss.android.lark.chat.vo.AbsMessageVO;
import com.ss.android.lark.doc.entity.DocResult;
import com.ss.android.lark.statistics.chat.ChatHitPointExtraParams;
import com.ss.android.lark.statistics.chat.ChatHitPointNew;
import com.ss.android.lark.utils.C57859q;
import com.ss.android.lark.utils.UIHelper;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/* renamed from: com.ss.android.lark.statistics.o.a */
public class C54970a {

    /* renamed from: a */
    private static Map<String, Object> f135848a = new HashMap();

    /* renamed from: b */
    private static WeakReference<AbsMessageVO> f135849b = null;

    /* renamed from: b */
    public static String m213423b(int i) {
        return i != 0 ? i != 2 ? i != 9 ? i != 12 ? i != 21 ? i != 25 ? "none" : "im_chat_msg_menu_more_app_view" : "todo_create_view" : "im_msg_multi_select_view" : "public_multi_select_share_view" : "im_chat_main_view" : "public_reaction_panel_select_view";
    }

    /* renamed from: c */
    public static boolean m213425c(int i) {
        return i == 7 || i == 9 || i == 11 || i == 12 || i == 13 || i == 21 || i == 25 || i == 16 || i == 2;
    }

    /* renamed from: a */
    public static Map<String, Object> m213418a() {
        return f135848a;
    }

    /* renamed from: b */
    public static AbsMessageVO m213422b() {
        WeakReference<AbsMessageVO> weakReference = f135849b;
        if (weakReference == null) {
            return null;
        }
        return weakReference.get();
    }

    /* renamed from: c */
    public static void m213424c() {
        f135848a.clear();
        f135849b = null;
    }

    /* renamed from: a */
    public static String m213417a(int i) {
        if (i == 0) {
            return "reaction";
        }
        if (i == 2) {
            return "sticker_save";
        }
        if (i == 5) {
            return "ding";
        }
        if (i == 7) {
            return "reply";
        }
        if (i == 9) {
            return "forward";
        }
        if (i == 21) {
            return "todo";
        }
        if (i == 23) {
            return "delete";
        }
        if (i == 25) {
            return "more_action";
        }
        if (i == 153) {
            return "reaction_click";
        }
        switch (i) {
            case 11:
                return "favorite";
            case HwBuildEx.VersionCodes.EMUI_5_1:
                return "multi_select";
            case 13:
                return "pin";
            case 14:
                return ChatHitPointExtraParams.Click.PIN_TO_TOP.getValue();
            case 15:
                return "withdraw";
            case 16:
                return "translate";
            default:
                return "";
        }
    }

    /* renamed from: a */
    public static void m213421a(C34029b bVar) {
        int i = bVar.f87966a;
        if (i == 5) {
            MessageMenuHitPoint.f135850a.mo187644a();
        } else if (i == 23) {
            MessageMenuHitPoint.f135850a.mo187653i();
        } else if (i == 7) {
            MessageMenuHitPoint.f135850a.mo187646b();
        } else if (i == 8) {
            MessageMenuHitPoint.f135850a.mo187647c();
        } else if (i == 9) {
            MessageMenuHitPoint.f135850a.mo187648d();
        } else if (i == 15) {
            MessageMenuHitPoint.f135850a.mo187651g();
        } else if (i != 16) {
            switch (i) {
                case 11:
                    MessageMenuHitPoint.f135850a.mo187649e();
                    return;
                case HwBuildEx.VersionCodes.EMUI_5_1:
                    MessageMenuHitPoint.f135850a.mo187650f();
                    return;
                case 13:
                    MessageMenuHitPoint.f135850a.mo187645a(Objects.equals(bVar.f87971f, UIHelper.getString(R.string.Lark_Pin_PinButton)));
                    return;
                default:
                    return;
            }
        } else {
            MessageMenuHitPoint.f135850a.mo187652h();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:29:0x0071  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m213419a(int r7, boolean r8) {
        /*
        // Method dump skipped, instructions count: 146
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.statistics.p2701o.C54970a.m213419a(int, boolean):void");
    }

    /* renamed from: a */
    public static void m213420a(AbsMessageVO aVar, Map<String, Object> map) {
        String str;
        String str2;
        if (!CollectionUtils.isEmpty(map)) {
            ContentVO g = aVar.mo121699g();
            DocResult docResult = null;
            if (g instanceof TextContentVO) {
                docResult = ((TextContentVO) g).mo121903n();
            } else if (g instanceof PostContentVO) {
                docResult = ((PostContentVO) g).mo121884p();
            }
            String str3 = "none";
            if (docResult != null) {
                str3 = docResult.getDoc().getId();
                str2 = ChatHitPointNew.f135660c.mo187376a(docResult.getDoc().getDocType());
                str = "true";
            } else {
                str = "false";
                str2 = str3;
            }
            HashMap hashMap = new HashMap();
            hashMap.put("file_id", C57859q.m224567c(str3));
            hashMap.put("file_type", str2);
            hashMap.put("is_single_doc", str);
            hashMap.putAll(map);
            f135848a.clear();
            f135848a.putAll(hashMap);
            f135849b = new WeakReference<>(aVar);
        }
    }
}
