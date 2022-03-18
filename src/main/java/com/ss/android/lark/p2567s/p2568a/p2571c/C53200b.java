package com.ss.android.lark.p2567s.p2568a.p2571c;

import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.android.HwBuildEx;
import com.ss.android.lark.core.language.C36235a;
import com.ss.android.lark.core.p1764b.C36093a;
import com.ss.android.lark.core.p1765c.C36096a;
import com.ss.android.lark.core.p1766d.C36099a;
import com.ss.android.lark.core.p1767e.C36133a;
import com.ss.android.lark.core.p1771i.C36143a;
import com.ss.android.lark.core.p1772j.C36149a;
import com.ss.android.lark.core.p1774k.C36187a;
import com.ss.android.lark.multitask.C48282c;
import com.ss.android.lark.platform.aa.C51657a;
import com.ss.android.lark.platform.ac.C51661a;
import com.ss.android.lark.platform.ae.C51677a;
import com.ss.android.lark.platform.af.C51684b;
import com.ss.android.lark.platform.ag.C51689a;
import com.ss.android.lark.platform.ah.C51698a;
import com.ss.android.lark.platform.ah.C51702c;
import com.ss.android.lark.platform.browser.BrowserModuleProvider;
import com.ss.android.lark.platform.filepicker.FilePickerModuleProvider;
import com.ss.android.lark.platform.map.MapModuleProvider;
import com.ss.android.lark.platform.offlinepush.C51894a;
import com.ss.android.lark.platform.p2473a.C51654a;
import com.ss.android.lark.platform.p2483d.C51795a;
import com.ss.android.lark.platform.p2485f.C51804b;
import com.ss.android.lark.platform.p2488i.C51816a;
import com.ss.android.lark.platform.p2492m.C51838a;
import com.ss.android.lark.platform.p2493n.C51854a;
import com.ss.android.lark.platform.p2496p.C51907a;
import com.ss.android.lark.platform.p2497q.C51931a;
import com.ss.android.lark.platform.p2506v.C52014a;
import com.ss.android.lark.platform.p2508x.C52054a;
import com.ss.android.lark.platform.p2510z.C52066a;
import com.ss.android.lark.platform.settings.SettingModuleProvider;
import com.ss.android.lark.search.p2583a.C53264a;
import com.ss.android.lark.simple.C54866b;
import com.ss.android.lark.ug.banner.C57365e;
import com.ss.android.lark.ug.p2860d.C57397a;
import com.ss.android.lark.ug.p2874e.C57480a;
import com.ss.android.lark.ug.p2877g.C57503a;
import com.ss.android.lark.ug.p2879i.C57522a;
import com.ss.ttvideoengine.TTVideoEngine;
import com.ss.ttvideoengine.log.IVideoEventLogger;

/* renamed from: com.ss.android.lark.s.a.c.b */
public final class C53200b {
    /* renamed from: a */
    public static void m205840a(String str) {
        if (str != null) {
            str.hashCode();
            char c = 65535;
            switch (str.hashCode()) {
                case -2096697282:
                    if (str.equals("com.ss.android.lark.contact.ContactModule")) {
                        c = 0;
                        break;
                    }
                    break;
                case -2071504640:
                    if (str.equals("com.ss.android.lark.ttwebview.TTWebViewInitModule")) {
                        c = 1;
                        break;
                    }
                    break;
                case -1966311160:
                    if (str.equals("com.ss.android.lark.forward.ForwardModule")) {
                        c = 2;
                        break;
                    }
                    break;
                case -1876548048:
                    if (str.equals("com.ss.android.lark.authorization.AuthorizationModule")) {
                        c = 3;
                        break;
                    }
                    break;
                case -1869579174:
                    if (str.equals("com.ss.android.lark.seccache.SecCacheModule")) {
                        c = 4;
                        break;
                    }
                    break;
                case -1802680262:
                    if (str.equals("com.ss.android.lark.notification.NotificationModule")) {
                        c = 5;
                        break;
                    }
                    break;
                case -1538619324:
                    if (str.equals("com.ss.android.lark.file.picker.FilePickerModule")) {
                        c = 6;
                        break;
                    }
                    break;
                case -1434883906:
                    if (str.equals("com.ss.android.lark.platform.offlinepush.InitOfflinePushModuleProvider")) {
                        c = 7;
                        break;
                    }
                    break;
                case -1416798246:
                    if (str.equals("com.ss.android.lark.search.SearchModule")) {
                        c = '\b';
                        break;
                    }
                    break;
                case -1352610438:
                    if (str.equals("com.ss.android.lark.multitask.MultitaskModule")) {
                        c = '\t';
                        break;
                    }
                    break;
                case -1296321446:
                    if (str.equals("com.ss.android.lark.language.LanguageModule")) {
                        c = '\n';
                        break;
                    }
                    break;
                case -1261516166:
                    if (str.equals("com.ss.android.lark.ug.UGModule")) {
                        c = 11;
                        break;
                    }
                    break;
                case -965787462:
                    if (str.equals("com.ss.android.lark.guidemgr.GuideMgrModule")) {
                        c = '\f';
                        break;
                    }
                    break;
                case -579141574:
                    if (str.equals("com.ss.android.lark.wschannelprocess.WschannelProcessModule")) {
                        c = '\r';
                        break;
                    }
                    break;
                case -552310238:
                    if (str.equals("com.ss.android.lark.wschannelnotification.WsChannelNotificationModule")) {
                        c = 14;
                        break;
                    }
                    break;
                case -489929162:
                    if (str.equals("com.ss.android.lark.upgrade.UpgradeModule")) {
                        c = 15;
                        break;
                    }
                    break;
                case -364194890:
                    if (str.equals("com.ss.android.lark.map.MapModule")) {
                        c = 16;
                        break;
                    }
                    break;
                case -327675750:
                    if (str.equals("com.ss.android.lark.simple.SimpleModule")) {
                        c = 17;
                        break;
                    }
                    break;
                case -260795780:
                    if (str.equals("com.ss.android.lark.share.ShareModule")) {
                        c = 18;
                        break;
                    }
                    break;
                case -195931834:
                    if (str.equals("com.ss.android.lark.watermark.WatermarkModule")) {
                        c = 19;
                        break;
                    }
                    break;
                case -84484492:
                    if (str.equals("com.ss.android.lark.image.ImageModule")) {
                        c = 20;
                        break;
                    }
                    break;
                case -59103232:
                    if (str.equals("com.ss.android.lark.store.StoreModule")) {
                        c = 21;
                        break;
                    }
                    break;
                case 170166538:
                    if (str.equals("com.ss.android.lark.aot.AotModule")) {
                        c = 22;
                        break;
                    }
                    break;
                case 199927066:
                    if (str.equals("com.ss.android.lark.qrcode.QRCodeModule")) {
                        c = 23;
                        break;
                    }
                    break;
                case 388873530:
                    if (str.equals("com.ss.android.lark.keyboard.KeyboardModule")) {
                        c = 24;
                        break;
                    }
                    break;
                case 476789754:
                    if (str.equals("com.ss.android.lark.main.MainModule")) {
                        c = 25;
                        break;
                    }
                    break;
                case 591756090:
                    if (str.equals("com.ss.android.lark.collaboration.ContactCollaborationModule")) {
                        c = 26;
                        break;
                    }
                    break;
                case 654865591:
                    if (str.equals("com.ss.android.lark.larkconfig.userconfig.AppUserConfigModule")) {
                        c = 27;
                        break;
                    }
                    break;
                case 716817242:
                    if (str.equals("com.ss.android.lark.banner.BannerModule")) {
                        c = 28;
                        break;
                    }
                    break;
                case 956443544:
                    if (str.equals("com.ss.android.lark.corrupt.CorruptModule")) {
                        c = 29;
                        break;
                    }
                    break;
                case 980208798:
                    if (str.equals("com.ss.android.lark.setting.SettingModule")) {
                        c = 30;
                        break;
                    }
                    break;
                case 1107194076:
                    if (str.equals("com.ss.android.lark.larkconfig.config.ConfigModule")) {
                        c = 31;
                        break;
                    }
                    break;
                case 1307318106:
                    if (str.equals("com.ss.android.lark.userprotocol.UserProtocolModule")) {
                        c = ' ';
                        break;
                    }
                    break;
                case 1545280570:
                    if (str.equals("com.ss.android.lark.mine.MineModule")) {
                        c = '!';
                        break;
                    }
                    break;
                case 1817439896:
                    if (str.equals("com.ss.android.lark.magic.MagicModule")) {
                        c = '\"';
                        break;
                    }
                    break;
                case 1898621518:
                    if (str.equals("com.ss.android.lark.browser.BrowserModule")) {
                        c = '#';
                        break;
                    }
                    break;
                case 1920342902:
                    if (str.equals("com.ss.android.lark.guide.GuideModule")) {
                        c = '$';
                        break;
                    }
                    break;
                case 2004093530:
                    if (str.equals("com.ss.android.lark.download.DownloadModule")) {
                        c = '%';
                        break;
                    }
                    break;
                case 2015936772:
                    if (str.equals("com.ss.android.lark.badge.BadgeModule")) {
                        c = '&';
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                    C36099a.m141515a();
                    return;
                case 1:
                    C51657a.m200381a();
                    return;
                case 2:
                    C51838a.m200992a();
                    return;
                case 3:
                    C51795a.m200798a();
                    return;
                case 4:
                    C52014a.m201804a();
                    return;
                case 5:
                    C51907a.m201314a();
                    return;
                case 6:
                    FilePickerModuleProvider.f128779a.mo177952a();
                    return;
                case 7:
                    C51894a.m201282a();
                    return;
                case '\b':
                    C53264a.m205974a();
                    return;
                case '\t':
                    C48282c.m190475a();
                    return;
                case '\n':
                    C36235a.m142710a();
                    return;
                case 11:
                    C57522a.m223261a();
                    return;
                case HwBuildEx.VersionCodes.EMUI_5_1:
                    C57480a.m223132a();
                    return;
                case '\r':
                    C51702c.m200484a();
                    return;
                case 14:
                    C51698a.m200478a();
                    return;
                case 15:
                    C51661a.m200388a();
                    return;
                case 16:
                    MapModuleProvider.m201088a();
                    return;
                case 17:
                    C54866b.m212765a();
                    return;
                case 18:
                    C52054a.m201947a();
                    return;
                case 19:
                    C51689a.m200461a();
                    return;
                case 20:
                    C51854a.m201094a();
                    return;
                case 21:
                    C52066a.m201979a();
                    return;
                case 22:
                    C51654a.m200378a();
                    return;
                case 23:
                    C51931a.m201432a();
                    return;
                case 24:
                    C36143a.m142118a();
                    return;
                case AvailableCode.ERROR_ON_ACTIVITY_RESULT:
                    C36149a.m142162a();
                    return;
                case 26:
                    C36096a.m141510a();
                    return;
                case AvailableCode.USER_IGNORE_PREVIOUS_POPUP:
                    C51677a.m200443a();
                    return;
                case IVideoEventLogger.LOGGER_OPTION_ENABLE_SR /*{ENCODED_INT: 28}*/:
                    C57365e.m222366a();
                    return;
                case 29:
                    C36133a.m142081a();
                    return;
                case 30:
                    SettingModuleProvider.f129183h.mo178263a();
                    return;
                case TTVideoEngine.PLAYER_OPTION_ENABLE_PLAYER3_HARDWARE_DECODE /*{ENCODED_INT: 31}*/:
                    C51804b.m200825a();
                    return;
                case ' ':
                    C51684b.m200451a();
                    return;
                case '!':
                    C36187a.m142438a();
                    return;
                case '\"':
                    C57503a.m223196a();
                    return;
                case '#':
                    BrowserModuleProvider.m200667a();
                    return;
                case '$':
                    C57397a.m222529a();
                    return;
                case '%':
                    C51816a.m200873a();
                    return;
                case '&':
                    C36093a.m141506a();
                    return;
                default:
                    return;
            }
        }
    }
}
