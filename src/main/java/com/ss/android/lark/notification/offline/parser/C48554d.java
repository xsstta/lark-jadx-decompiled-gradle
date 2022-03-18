package com.ss.android.lark.notification.offline.parser;

import android.content.Intent;
import com.alibaba.fastjson.JSONObject;
import com.ss.android.lark.notification.dto.OfflineNotice;

/* renamed from: com.ss.android.lark.notification.offline.parser.d */
public class C48554d {

    /* renamed from: a */
    private final IOfflineExtraParser f122175a;

    /* renamed from: a */
    public int mo169637a() {
        return this.f122175a.mo169635a();
    }

    /* renamed from: b */
    public Intent mo169638b() {
        return this.f122175a.mo169636b();
    }

    public C48554d(OfflineNotice offlineNotice) {
        this.f122175a = m191412a(offlineNotice, m191413a(offlineNotice));
    }

    /* renamed from: a */
    private String m191413a(OfflineNotice offlineNotice) {
        JSONObject businessInfo = offlineNotice.getBusinessInfo();
        if (businessInfo == null) {
            return "chat";
        }
        int intValue = businessInfo.getIntValue("belong_to");
        if (intValue == 0) {
            intValue = 1;
        }
        String string = businessInfo.getString("biz");
        String string2 = businessInfo.getString("channel");
        if ("calendar".equals(string)) {
            return "calendar";
        }
        if (intValue == 2) {
            return "mail";
        }
        if ("docs".equals(string)) {
            return "doc";
        }
        if ("openapp_chat".equals(string)) {
            return "open_app_chat";
        }
        if ("thread".equals(string2)) {
            return "thread";
        }
        if ("todo".equals(string)) {
            return "todo";
        }
        return "chat";
    }

    /* renamed from: a */
    private IOfflineExtraParser m191412a(OfflineNotice offlineNotice, String str) {
        str.hashCode();
        char c = 65535;
        switch (str.hashCode()) {
            case -917865205:
                if (str.equals("open_app_chat")) {
                    c = 0;
                    break;
                }
                break;
            case -874443254:
                if (str.equals("thread")) {
                    c = 1;
                    break;
                }
                break;
            case -178324674:
                if (str.equals("calendar")) {
                    c = 2;
                    break;
                }
                break;
            case 99640:
                if (str.equals("doc")) {
                    c = 3;
                    break;
                }
                break;
            case 3052376:
                if (str.equals("chat")) {
                    c = 4;
                    break;
                }
                break;
            case 3343799:
                if (str.equals("mail")) {
                    c = 5;
                    break;
                }
                break;
            case 3565638:
                if (str.equals("todo")) {
                    c = 6;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                return new C48555e(offlineNotice);
            case 1:
                return new ThreadOfflineExtraParser(offlineNotice);
            case 2:
                return new C48551a(offlineNotice);
            case 3:
                return new C48552b(offlineNotice);
            case 4:
                return new ChatOfflineExtraParser(offlineNotice);
            case 5:
                return new C48553c(offlineNotice);
            case 6:
                return new C48557g(offlineNotice);
            default:
                return new ChatOfflineExtraParser(offlineNotice);
        }
    }
}
