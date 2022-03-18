package com.ss.android.lark.openplatform.shareApp.dto;

import java.util.List;

public class ShareAppResult {

    /* renamed from: a */
    ShareTab f122770a;

    /* renamed from: b */
    List<C48868b> f122771b;

    public enum ShareTab {
        TAB_CHAT("chat"),
        TAB_LINK("link"),
        TAB_QRCODE("qrcode"),
        TAB_UNKNOWN("unknown");
        
        private String tab;

        public String getTab() {
            return this.tab;
        }

        public static ShareTab value(String str) {
            return forString(str);
        }

        public static ShareTab forString(String str) {
            str.hashCode();
            char c = 65535;
            switch (str.hashCode()) {
                case -951532658:
                    if (str.equals("qrcode")) {
                        c = 0;
                        break;
                    }
                    break;
                case 3052376:
                    if (str.equals("chat")) {
                        c = 1;
                        break;
                    }
                    break;
                case 3321850:
                    if (str.equals("link")) {
                        c = 2;
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                    return TAB_QRCODE;
                case 1:
                    return TAB_CHAT;
                case 2:
                    return TAB_LINK;
                default:
                    return TAB_UNKNOWN;
            }
        }

        private ShareTab(String str) {
            this.tab = str;
        }
    }

    /* renamed from: a */
    public ShareTab mo170670a() {
        return this.f122770a;
    }

    /* renamed from: b */
    public List<C48868b> mo170673b() {
        return this.f122771b;
    }

    public ShareAppResult(ShareTab shareTab) {
        this.f122770a = shareTab;
    }

    /* renamed from: a */
    public void mo170671a(ShareTab shareTab) {
        this.f122770a = shareTab;
    }

    /* renamed from: a */
    public void mo170672a(List<C48868b> list) {
        this.f122771b = list;
    }
}
