package com.bytedance.ug.sdk.share.api.panel;

import com.bytedance.ug.sdk.share.impl.p923g.C20839c;
import com.bytedance.ug.sdk.share.impl.p924h.p925a.AbstractC20847a;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.android.HwBuildEx;
import com.ss.ttvideoengine.log.IVideoEventLogger;

public enum ShareChannelType {
    WX_TIMELINE,
    WX,
    QQ,
    QZONE,
    SYSTEM,
    COPY_LINK,
    DINGDING,
    DOUYIN,
    DOUYIN_IM,
    WEIBO,
    FEILIAO,
    DUOSHAN,
    FACEBOOK,
    LINE,
    WHATSAPP,
    INSTAGRAM,
    TIKTOK,
    TWITTER,
    KAKAO,
    SNAPCHAT,
    MESSENGER,
    TOUTIAO,
    FEISHU,
    ZHIFUBAO,
    IMAGE_SHARE,
    SMS,
    LONG_IMAGE,
    VK;

    /* renamed from: com.bytedance.ug.sdk.share.api.panel.ShareChannelType$1 */
    static /* synthetic */ class C208191 {

        /* renamed from: a */
        static final /* synthetic */ int[] f50977a;

        /* JADX WARNING: Can't wrap try/catch for region: R(56:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31|32|33|34|35|36|37|38|39|40|41|42|43|44|45|46|47|48|49|50|51|52|53|54|(3:55|56|58)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(58:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31|32|33|34|35|36|37|38|39|40|41|42|43|44|45|46|47|48|49|50|51|52|53|54|55|56|58) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0049 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0054 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0060 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x006c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x0078 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x0084 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x0090 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x009c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:29:0x00a8 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:31:0x00b4 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:33:0x00c0 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:35:0x00cc */
        /* JADX WARNING: Missing exception handler attribute for start block: B:37:0x00d8 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:39:0x00e4 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:41:0x00f0 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:43:0x00fc */
        /* JADX WARNING: Missing exception handler attribute for start block: B:45:0x0108 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:47:0x0114 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:49:0x0120 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:51:0x012c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:53:0x0138 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:55:0x0144 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
            // Method dump skipped, instructions count: 337
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ug.sdk.share.api.panel.ShareChannelType.C208191.<clinit>():void");
        }
    }

    public static String getShareChannel(ShareChannelType shareChannelType) {
        AbstractC20847a a = C20839c.m75890a(shareChannelType);
        if (a != null) {
            return a.mo70330a();
        }
        return null;
    }

    public static String getShareItemTypeName(ShareChannelType shareChannelType) {
        if (shareChannelType == null) {
            return "";
        }
        switch (C208191.f50977a[shareChannelType.ordinal()]) {
            case 1:
                return "wechat";
            case 2:
                return "moments";
            case 3:
                return "qq";
            case 4:
                return "qzone";
            case 5:
                return "sys_share";
            case 6:
                return "copy_link";
            case 7:
                return "dingding";
            case 8:
                return "douyin";
            case 9:
                return "douyin_im";
            case 10:
                return "weibo";
            case 11:
                return "feiliao";
            case HwBuildEx.VersionCodes.EMUI_5_1 /*{ENCODED_INT: 12}*/:
                return "duoshan";
            case 13:
                return "facebook";
            case 14:
                return "line";
            case 15:
                return "whatsapp";
            case 16:
                return "instagram";
            case 17:
                return "tiktok";
            case 18:
                return "twitter";
            case 19:
                return "kakao";
            case 20:
                return "snapchat";
            case 21:
                return "messenger";
            case 22:
                return "toutiao";
            case 23:
                return "feishu";
            case 24:
                return "zhifubao";
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /*{ENCODED_INT: 25}*/:
                return "image_share";
            case 26:
                return "sms";
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /*{ENCODED_INT: 27}*/:
                return "long_image";
            case IVideoEventLogger.LOGGER_OPTION_ENABLE_SR /*{ENCODED_INT: 28}*/:
                return "vk";
            default:
                return "";
        }
    }

    public static ShareChannelType getShareItemType(String str) {
        str.hashCode();
        char c = 65535;
        switch (str.hashCode()) {
            case -1777292293:
                if (str.equals("image_share")) {
                    c = 0;
                    break;
                }
                break;
            case -1436108013:
                if (str.equals("messenger")) {
                    c = 1;
                    break;
                }
                break;
            case -1325936172:
                if (str.equals("douyin")) {
                    c = 2;
                    break;
                }
                break;
            case -1278276362:
                if (str.equals("feishu")) {
                    c = 3;
                    break;
                }
                break;
            case -1210558778:
                if (str.equals("zhifubao")) {
                    c = 4;
                    break;
                }
                break;
            case -1134307907:
                if (str.equals("toutiao")) {
                    c = 5;
                    break;
                }
                break;
            case -972069643:
                if (str.equals("feiliao")) {
                    c = 6;
                    break;
                }
                break;
            case -916346253:
                if (str.equals("twitter")) {
                    c = 7;
                    break;
                }
                break;
            case -873713414:
                if (str.equals("tiktok")) {
                    c = '\b';
                    break;
                }
                break;
            case -791770330:
                if (str.equals("wechat")) {
                    c = '\t';
                    break;
                }
                break;
            case -333314600:
                if (str.equals("long_image")) {
                    c = '\n';
                    break;
                }
                break;
            case -150184081:
                if (str.equals("douyin_im")) {
                    c = 11;
                    break;
                }
                break;
            case 3616:
                if (str.equals("qq")) {
                    c = '\f';
                    break;
                }
                break;
            case 3765:
                if (str.equals("vk")) {
                    c = '\r';
                    break;
                }
                break;
            case 114009:
                if (str.equals("sms")) {
                    c = 14;
                    break;
                }
                break;
            case 3321844:
                if (str.equals("line")) {
                    c = 15;
                    break;
                }
                break;
            case 28903346:
                if (str.equals("instagram")) {
                    c = 16;
                    break;
                }
                break;
            case 101812419:
                if (str.equals("kakao")) {
                    c = 17;
                    break;
                }
                break;
            case 108102557:
                if (str.equals("qzone")) {
                    c = 18;
                    break;
                }
                break;
            case 113011944:
                if (str.equals("weibo")) {
                    c = 19;
                    break;
                }
                break;
            case 133393148:
                if (str.equals("dingding")) {
                    c = 20;
                    break;
                }
                break;
            case 284397090:
                if (str.equals("snapchat")) {
                    c = 21;
                    break;
                }
                break;
            case 497130182:
                if (str.equals("facebook")) {
                    c = 22;
                    break;
                }
                break;
            case 540697581:
                if (str.equals("sys_share")) {
                    c = 23;
                    break;
                }
                break;
            case 1235271283:
                if (str.equals("moments")) {
                    c = 24;
                    break;
                }
                break;
            case 1505434244:
                if (str.equals("copy_link")) {
                    c = 25;
                    break;
                }
                break;
            case 1934780818:
                if (str.equals("whatsapp")) {
                    c = 26;
                    break;
                }
                break;
            case 2011705408:
                if (str.equals("duoshan")) {
                    c = 27;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                return IMAGE_SHARE;
            case 1:
                return MESSENGER;
            case 2:
                return DOUYIN;
            case 3:
                return FEISHU;
            case 4:
                return ZHIFUBAO;
            case 5:
                return TOUTIAO;
            case 6:
                return FEILIAO;
            case 7:
                return TWITTER;
            case '\b':
                return TIKTOK;
            case '\t':
                return WX;
            case '\n':
                return LONG_IMAGE;
            case 11:
                return DOUYIN_IM;
            case HwBuildEx.VersionCodes.EMUI_5_1 /*{ENCODED_INT: 12}*/:
                return QQ;
            case '\r':
                return VK;
            case 14:
                return SMS;
            case 15:
                return LINE;
            case 16:
                return INSTAGRAM;
            case 17:
                return KAKAO;
            case 18:
                return QZONE;
            case 19:
                return WEIBO;
            case 20:
                return DINGDING;
            case 21:
                return SNAPCHAT;
            case 22:
                return FACEBOOK;
            case 23:
                return SYSTEM;
            case 24:
                return WX_TIMELINE;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /*{ENCODED_INT: 25}*/:
                return COPY_LINK;
            case 26:
                return WHATSAPP;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /*{ENCODED_INT: 27}*/:
                return DUOSHAN;
            default:
                return null;
        }
    }
}
