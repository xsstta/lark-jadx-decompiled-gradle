package com.ss.android.lark.core.impl;

import android.app.Activity;
import android.app.Application;
import android.app.Dialog;
import android.app.Notification;
import android.app.PendingIntent;
import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.Message;
import android.text.TextUtils;
import android.util.Pair;
import android.view.View;
import android.webkit.WebView;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;
import androidx.appcompat.app.BaseContextWrapperDelegate;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import com.bytedance.i18n.claymore.ClaymoreImpl;
import com.bytedance.lark.pb.basic.v1.ActionType;
import com.bytedance.lark.pb.basic.v1.Chatter;
import com.bytedance.lark.pb.basic.v1.DomainSettings;
import com.bytedance.lark.pb.basic.v1.ImageSet;
import com.bytedance.lark.pb.basic.v1.RichTextElement;
import com.bytedance.lark.pb.basic.v1.UniversalUserSetting;
import com.bytedance.lark.pb.contact.v1.InvitationSource;
import com.bytedance.lark.pb.im.v1.ContentType;
import com.larksuite.component.dybrid.h5api.AbstractC24152a;
import com.larksuite.component.ui.imageview.LKUIBadgeView;
import com.larksuite.component.webview.container.dto.C25830a;
import com.larksuite.framework.callback.AbstractC25974h;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.http.p1187b.AbstractC25990b;
import com.ss.android.lark.abtest.api.p1324a.AbstractC28490a;
import com.ss.android.lark.applink.C29187c;
import com.ss.android.lark.appreciablelib.Biz;
import com.ss.android.lark.appsetting.api.SettingManager;
import com.ss.android.lark.appstate.service.IClientService;
import com.ss.android.lark.banner.export.AbstractC29479b;
import com.ss.android.lark.base.fragment.BaseFragment;
import com.ss.android.lark.biz.core.api.AbstractC29539aa;
import com.ss.android.lark.biz.core.api.AbstractC29540ab;
import com.ss.android.lark.biz.core.api.AbstractC29541ac;
import com.ss.android.lark.biz.core.api.AbstractC29542ad;
import com.ss.android.lark.biz.core.api.AbstractC29543ag;
import com.ss.android.lark.biz.core.api.AbstractC29544ah;
import com.ss.android.lark.biz.core.api.AbstractC29560g;
import com.ss.android.lark.biz.core.api.AbstractC29561h;
import com.ss.android.lark.biz.core.api.AbstractC29562i;
import com.ss.android.lark.biz.core.api.AbstractC29563j;
import com.ss.android.lark.biz.core.api.AbstractC29565l;
import com.ss.android.lark.biz.core.api.AbstractC29569m;
import com.ss.android.lark.biz.core.api.AbstractC29570n;
import com.ss.android.lark.biz.core.api.AbstractC29571p;
import com.ss.android.lark.biz.core.api.AbstractC29572q;
import com.ss.android.lark.biz.core.api.AbstractC29575r;
import com.ss.android.lark.biz.core.api.AbstractC29583s;
import com.ss.android.lark.biz.core.api.AbstractC29585t;
import com.ss.android.lark.biz.core.api.AbstractC29586u;
import com.ss.android.lark.biz.core.api.AbstractC29588w;
import com.ss.android.lark.biz.core.api.AbstractC29589z;
import com.ss.android.lark.biz.core.api.AppConfig;
import com.ss.android.lark.biz.core.api.BadgeStyle;
import com.ss.android.lark.biz.core.api.C29538a;
import com.ss.android.lark.biz.core.api.C29548at;
import com.ss.android.lark.biz.core.api.C29550b;
import com.ss.android.lark.biz.core.api.C29556e;
import com.ss.android.lark.biz.core.api.CheckDownloadDialogCallback;
import com.ss.android.lark.biz.core.api.ContactSource;
import com.ss.android.lark.biz.core.api.ContentStateChangeCallback;
import com.ss.android.lark.biz.core.api.EncryptImageData;
import com.ss.android.lark.biz.core.api.FavoriteForwardData;
import com.ss.android.lark.biz.core.api.FilePickerLaunchParams;
import com.ss.android.lark.biz.core.api.FileState;
import com.ss.android.lark.biz.core.api.IContactsGroupController;
import com.ss.android.lark.biz.core.api.ICoreApi;
import com.ss.android.lark.biz.core.api.IDepartmentDetailFragmentBuilder;
import com.ss.android.lark.biz.core.api.ILocaleWatcher;
import com.ss.android.lark.biz.core.api.IMainDrawerListener;
import com.ss.android.lark.biz.core.api.IMineController;
import com.ss.android.lark.biz.core.api.IPerfQuickSwitchUserMonitor;
import com.ss.android.lark.biz.core.api.IPushAccountBadgeListener;
import com.ss.android.lark.biz.core.api.IPushAddFriendListener;
import com.ss.android.lark.biz.core.api.IQRCodeScanResultHandler;
import com.ss.android.lark.biz.core.api.ISettingsUpdateListener;
import com.ss.android.lark.biz.core.api.IUiModeService;
import com.ss.android.lark.biz.core.api.LoadParams;
import com.ss.android.lark.biz.core.api.MagicViewContainer;
import com.ss.android.lark.biz.core.api.NetworkLevelListener;
import com.ss.android.lark.biz.core.api.NetworkType;
import com.ss.android.lark.biz.core.api.NotificationSettingDetail;
import com.ss.android.lark.biz.core.api.PickType;
import com.ss.android.lark.biz.core.api.ProfileResponse;
import com.ss.android.lark.biz.core.api.ShareDataForwardData;
import com.ss.android.lark.biz.core.api.ShareTextForwardData;
import com.ss.android.lark.biz.core.api.TimeFormatSetting;
import com.ss.android.lark.biz.core.api.UrlParams;
import com.ss.android.lark.biz.core.api.WSConnState;
import com.ss.android.lark.biz.core.api.an;
import com.ss.android.lark.biz.core.api.ao;
import com.ss.android.lark.biz.core.api.aq;
import com.ss.android.lark.biz.core.api.ar;
import com.ss.android.lark.biz.core.api.as;
import com.ss.android.lark.biz.core.api.au;
import com.ss.android.lark.biz.core.api.av;
import com.ss.android.lark.biz.core.api.ay;
import com.ss.android.lark.biz.core.api.az;
import com.ss.android.lark.biz.core.api.browser.AbstractC29552a;
import com.ss.android.lark.biz.core.api.contact.IInitBuilder;
import com.ss.android.lark.biz.core.api.magic.IMagicLifecycleListener;
import com.ss.android.lark.biz.core.api.p1402b.AbstractC29551a;
import com.ss.android.lark.biz.core.api.p1404d.AbstractC29555b;
import com.ss.android.lark.biz.core.api.p1405e.AbstractC29559a;
import com.ss.android.lark.biz.core.api.resource.AbstractC29579a;
import com.ss.android.lark.biz.core.api.resource.AbstractC29580b;
import com.ss.android.lark.biz.core.api.resource.AbstractC29581c;
import com.ss.android.lark.biz.core.api.resource.AbstractC29582d;
import com.ss.android.lark.biz.im.api.ChatBundle;
import com.ss.android.lark.browser.C29638a;
import com.ss.android.lark.browser.biz.webapp.C29878b;
import com.ss.android.lark.chat.api.AbstractC32812c;
import com.ss.android.lark.chat.entity.chat.Chat;
import com.ss.android.lark.chat.entity.keyboard.IPlusItem;
import com.ss.android.lark.chat.entity.message.Message;
import com.ss.android.lark.chat.entity.message.content.FileContent;
import com.ss.android.lark.chat.entity.message.content.ImageContent;
import com.ss.android.lark.chat.entity.message.content.ProfileContent;
import com.ss.android.lark.chat.entity.message.content.StickerContent;
import com.ss.android.lark.chat.entity.message.content.TextContent;
import com.ss.android.lark.chat.export.ui.message.IOpenMessageCellFactory;
import com.ss.android.lark.contact.entity.Department;
import com.ss.android.lark.contact.entity.SelectedData;
import com.ss.android.lark.contact.entity.UserRelationResponse;
import com.ss.android.lark.contact.entity.api.ContactMobileApi;
import com.ss.android.lark.contact.impl.department.detail.DepartmentDetailFragmentBuilder;
import com.ss.android.lark.core.C36083a;
import com.ss.android.lark.core.fcm.FCMDownloadModuleProvider;
import com.ss.android.lark.core.language.C36235a;
import com.ss.android.lark.core.p1763a.C36084a;
import com.ss.android.lark.core.p1764b.C36093a;
import com.ss.android.lark.core.p1765c.C36096a;
import com.ss.android.lark.core.p1766d.C36099a;
import com.ss.android.lark.core.p1767e.C36133a;
import com.ss.android.lark.core.p1768f.C36136a;
import com.ss.android.lark.core.p1769g.C36141b;
import com.ss.android.lark.core.p1771i.C36143a;
import com.ss.android.lark.core.p1772j.C36149a;
import com.ss.android.lark.core.p1774k.C36187a;
import com.ss.android.lark.core.p1775l.AbstractC36232b;
import com.ss.android.lark.desktopmode.p1787a.C36516a;
import com.ss.android.lark.desktopmode.utils.DesktopUtil;
import com.ss.android.lark.dynamicconfig.C36882a;
import com.ss.android.lark.dynamicconfig.DynamicConfigModule;
import com.ss.android.lark.fcm_export.IFCMModule;
import com.ss.android.lark.forward.C38364a;
import com.ss.android.lark.forward.dto.CalendarForwardData;
import com.ss.android.lark.forward.dto.ForwardTemplate;
import com.ss.android.lark.forward.dto.TodoForwardData;
import com.ss.android.lark.forward.dto.template.ForwardEnhancedView;
import com.ss.android.lark.forward.dto.template.IForwardSelectListener;
import com.ss.android.lark.forward.template.MessageCardEnhancedView;
import com.ss.android.lark.forward.template.ShareForwardTemplateFactory;
import com.ss.android.lark.forward.template.TemplateFactoryUtils;
import com.ss.android.lark.guidemgr.p1935b.p1937b.C38708a;
import com.ss.android.lark.image.entity.Image;
import com.ss.android.lark.inv.export.api.InvitationServiceApi;
import com.ss.android.lark.larkconfig.export.p2103a.C41152a;
import com.ss.android.lark.larkconfig.export.p2105c.AbstractC41160a;
import com.ss.android.lark.larkconfig.userconfig.ClientDynamicLink;
import com.ss.android.lark.location.dto.LocationClientConfig;
import com.ss.android.lark.location.listener.AbstractC41583b;
import com.ss.android.lark.location.p2146b.AbstractC41558b;
import com.ss.android.lark.location.p2146b.AbstractC41559c;
import com.ss.android.lark.location.p2146b.AbstractC41561d;
import com.ss.android.lark.location.p2146b.AbstractC41562e;
import com.ss.android.lark.location.p2146b.AbstractC41567g;
import com.ss.android.lark.location.p2146b.AbstractC41569h;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.maincore.AbstractC44544a;
import com.ss.android.lark.maincore.AbstractC44546c;
import com.ss.android.lark.maincore.TabType;
import com.ss.android.lark.mira.MiraModule;
import com.ss.android.lark.multitask.C48282c;
import com.ss.android.lark.notification.export.AbstractNotification;
import com.ss.android.lark.notification.export.entity.C48499a;
import com.ss.android.lark.notification.export.entity.Notice;
import com.ss.android.lark.notification.p2385g.AbstractC48511a;
import com.ss.android.lark.openapi.jsapi.entity.ShareModel;
import com.ss.android.lark.p1382b.C29410a;
import com.ss.android.lark.p2567s.p2568a.p2571c.C53199a;
import com.ss.android.lark.p2567s.p2568a.p2571c.C53200b;
import com.ss.android.lark.passport.signinsdk_api.account.AbstractC49339b;
import com.ss.android.lark.passport.signinsdk_api.account.TenantInfo;
import com.ss.android.lark.passport.signinsdk_api.interfaces.AbstractC49405t;
import com.ss.android.lark.platform.aa.C51657a;
import com.ss.android.lark.platform.ab.C51659a;
import com.ss.android.lark.platform.abtest.C51660a;
import com.ss.android.lark.platform.ac.C51661a;
import com.ss.android.lark.platform.ad.C51676a;
import com.ss.android.lark.platform.ae.C51677a;
import com.ss.android.lark.platform.af.C51684b;
import com.ss.android.lark.platform.ag.C51689a;
import com.ss.android.lark.platform.ah.C51698a;
import com.ss.android.lark.platform.ah.C51701b;
import com.ss.android.lark.platform.ah.C51702c;
import com.ss.android.lark.platform.applink.C51707a;
import com.ss.android.lark.platform.batterymonitor.C51721b;
import com.ss.android.lark.platform.browser.BrowserModuleProvider;
import com.ss.android.lark.platform.dynamicconfig.C51797a;
import com.ss.android.lark.platform.filepicker.FilePickerModuleProvider;
import com.ss.android.lark.platform.larksetting.LarkSettingModuleProvider;
import com.ss.android.lark.platform.lifecycle.AppLifecycle;
import com.ss.android.lark.platform.lifecycle.ComponentCallbacks2C51833b;
import com.ss.android.lark.platform.map.MapModuleProvider;
import com.ss.android.lark.platform.network.C51858b;
import com.ss.android.lark.platform.network.C51864e;
import com.ss.android.lark.platform.network.C51866f;
import com.ss.android.lark.platform.network.ttnet.C51878d;
import com.ss.android.lark.platform.network.ttnet.C51880f;
import com.ss.android.lark.platform.offlinepush.OfflinePushClickHandler;
import com.ss.android.lark.platform.p2473a.C51654a;
import com.ss.android.lark.platform.p2476b.C51714a;
import com.ss.android.lark.platform.p2482c.C51790a;
import com.ss.android.lark.platform.p2482c.C51791b;
import com.ss.android.lark.platform.p2482c.C51792c;
import com.ss.android.lark.platform.p2483d.C51795a;
import com.ss.android.lark.platform.p2484e.C51798a;
import com.ss.android.lark.platform.p2485f.C51804b;
import com.ss.android.lark.platform.p2488i.C51816a;
import com.ss.android.lark.platform.p2489j.C51819a;
import com.ss.android.lark.platform.p2492m.C51838a;
import com.ss.android.lark.platform.p2493n.C51854a;
import com.ss.android.lark.platform.p2496p.C51907a;
import com.ss.android.lark.platform.p2497q.C51931a;
import com.ss.android.lark.platform.p2498r.C51947a;
import com.ss.android.lark.platform.p2499s.p2500a.C51949a;
import com.ss.android.lark.platform.p2505u.C52013b;
import com.ss.android.lark.platform.p2506v.C52014a;
import com.ss.android.lark.platform.p2510z.C52066a;
import com.ss.android.lark.platform.settings.SettingModuleProvider;
import com.ss.android.lark.platform.statistics.p2502b.C51963b;
import com.ss.android.lark.platform.statistics.p2502b.C51970d;
import com.ss.android.lark.platform.statistics.p2502b.C51973e;
import com.ss.android.lark.platform.statistics.p2502b.C51979h;
import com.ss.android.lark.platform.statistics.p2502b.C51984k;
import com.ss.android.lark.platform.statistics.perf.C51995b;
import com.ss.android.lark.platform.statistics.perf.C51997c;
import com.ss.android.lark.platform.statistics.perf.PerfQuickSwitchUserMonitor;
import com.ss.android.lark.profile.C52239a;
import com.ss.android.lark.profile.entity.Profile;
import com.ss.android.lark.sdk.C53253l;
import com.ss.android.lark.search.C53258a;
import com.ss.android.lark.search.p2583a.C53264a;
import com.ss.android.lark.searchcommon.dto.C53892a;
import com.ss.android.lark.searchcommon.dto.Scene;
import com.ss.android.lark.searchcommon.dto.SearchResponse;
import com.ss.android.lark.searchcommon.service.compatible.ISearchLifecycleObserver;
import com.ss.android.lark.setting.page.statistics.SettingHitPoint;
import com.ss.android.lark.setting.service.AbstractC54603d;
import com.ss.android.lark.setting.service.impl.C54608b;
import com.ss.android.lark.setting.service.usersetting.appearance.UiModeService;
import com.ss.android.lark.setting.service.usersetting.p2674b.AbstractC54661b;
import com.ss.android.lark.simple.C54866b;
import com.ss.android.lark.simple.switcher.SimpleModeSwitcher;
import com.ss.android.lark.ug.banner.C57365e;
import com.ss.android.lark.ug.invitation.C57532a;
import com.ss.android.lark.ug.p2860d.C57397a;
import com.ss.android.lark.ug.p2874e.C57480a;
import com.ss.android.lark.ug.p2877g.C57503a;
import com.ss.android.lark.ug.p2879i.C57522a;
import com.ss.android.lark.ug.thirdshare.C57559a;
import com.ss.android.lark.utils.LarkContext;
import com.ss.android.lark.utils.rxjava.C57865c;
import com.ss.android.lark.watermark.dto.WatermarkInfo;
import com.ss.android.lark.widget.richtext.C59029c;
import com.ss.android.lark.wschannel.service.IWschannelService;
import com.ss.android.lark.wschannelnotification.p2984a.C59280a;
import com.ss.android.lark.wschannelprocess.C59307d;
import com.ss.android.lark.wschannelprocess.WschannelPush;
import io.reactivex.Observable;
import java.io.File;
import java.security.KeyStoreException;
import java.security.PrivateKey;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import okio.ByteString;
import org.json.JSONObject;

@ClaymoreImpl(ICoreApi.class)
public class CoreApiImpl implements ICoreApi {
    @Override // com.ss.android.lark.biz.core.api.ICoreApi
    public String getFilePathListKey() {
        return "extra.file.path.list";
    }

    @Override // com.ss.android.lark.biz.core.api.ICoreApi
    public String getGroupMessageIDKey() {
        return "params_group_message_id";
    }

    @Override // com.ss.android.lark.biz.core.api.ICoreApi
    public String getGroupStateKey() {
        return "params_group_state";
    }

    @Override // com.ss.android.lark.biz.core.api.ICoreApi
    public void endPerfQuickSwitchUserMonitor() {
        PerfQuickSwitchUserMonitor.m201674c();
    }

    @Override // com.ss.android.lark.biz.core.api.ICoreApi
    public void endSection() {
        C51995b.m201714a();
    }

    @Override // com.ss.android.lark.biz.core.api.ICoreApi
    public Map<String, String> getAutoInitModuleConfigMap() {
        return C53199a.f131530a;
    }

    @Override // com.ss.android.lark.biz.core.api.ICoreApi
    public void getBrowserModule() {
        BrowserModuleProvider.m200667a();
    }

    @Override // com.ss.android.lark.biz.core.api.ICoreApi
    public Map<String, String> getThirdPartyModuleConfigMap() {
        return C53199a.f131531b;
    }

    @Override // com.ss.android.lark.biz.core.api.ICoreApi
    public Map<String, String> getThirdPartyPrefixModuleConfigMap() {
        return C53199a.f131532c;
    }

    @Override // com.ss.android.lark.biz.core.api.ICoreApi
    public void initKeyBoard() {
        C36143a.m142118a();
    }

    @Override // com.ss.android.lark.biz.core.api.ICoreApi
    public void initWSNotificationModule() {
        C51698a.m200478a();
    }

    @Override // com.ss.android.lark.biz.core.api.ICoreApi
    public void perfBoostEndSection() {
        C51995b.m201714a();
    }

    @Override // com.ss.android.lark.biz.core.api.ICoreApi
    public void preLoadImageModule() {
        C51854a.m201097b();
    }

    @Override // com.ss.android.lark.biz.core.api.ICoreApi
    public void registerThirdShare() {
        C57559a.m223559a();
    }

    @Override // com.ss.android.lark.biz.core.api.ICoreApi
    public void checkNewVersion() {
        C51661a.m200388a().mo195606b();
    }

    @Override // com.ss.android.lark.biz.core.api.ICoreApi
    public C29187c getAppLink() {
        return C51707a.m200495a();
    }

    @Override // com.ss.android.lark.biz.core.api.ICoreApi
    public long getBeginCreateApplicationTime() {
        return C51973e.m201593k();
    }

    @Override // com.ss.android.lark.biz.core.api.ICoreApi
    public int getCurrentDarkMode() {
        return UiModeService.f135042b.mo186697d();
    }

    @Override // com.ss.android.lark.biz.core.api.ICoreApi
    public long getElapsedToLastForeground() {
        return C51790a.m200789b();
    }

    @Override // com.ss.android.lark.biz.core.api.ICoreApi
    public long getElapsedToStart() {
        return C51790a.m200787a();
    }

    @Override // com.ss.android.lark.biz.core.api.ICoreApi
    public AbstractC25990b getHttpClient() {
        return C51864e.m201147a();
    }

    @Override // com.ss.android.lark.biz.core.api.ICoreApi
    public AbstractC25990b getLarkHttpClient() {
        return C51864e.m201147a();
    }

    @Override // com.ss.android.lark.biz.core.api.ICoreApi
    public ForwardEnhancedView getMessageCardEnhancedView() {
        return new MessageCardEnhancedView();
    }

    @Override // com.ss.android.lark.biz.core.api.ICoreApi
    public long getNaturalBeginLaunchTime() {
        return C51973e.m201592j();
    }

    @Override // com.ss.android.lark.biz.core.api.ICoreApi
    public au getNetworkQuality() {
        return C51878d.m201201b();
    }

    @Override // com.ss.android.lark.biz.core.api.ICoreApi
    public int getNetworkQualityType() {
        return C51878d.m201199a();
    }

    @Override // com.ss.android.lark.biz.core.api.ICoreApi
    public int getPackageId() {
        return C51866f.m201151a();
    }

    @Override // com.ss.android.lark.biz.core.api.ICoreApi
    public AbstractC32812c getPerfEnterChatMonitor() {
        return new AbstractC32812c() {
            /* class com.ss.android.lark.core.impl.CoreApiImpl.C361461 */

            @Override // com.ss.android.lark.chat.api.AbstractC32812c
            /* renamed from: c */
            public void mo120967c() {
                C51997c.m201760h();
            }

            @Override // com.ss.android.lark.chat.api.AbstractC32812c
            /* renamed from: d */
            public void mo120970d() {
                C51997c.m201759g();
            }

            @Override // com.ss.android.lark.chat.api.AbstractC32812c
            /* renamed from: e */
            public void mo120974e() {
                C51997c.m201735a();
            }

            @Override // com.ss.android.lark.chat.api.AbstractC32812c
            /* renamed from: f */
            public void mo120975f() {
                C51997c.m201748b();
            }

            @Override // com.ss.android.lark.chat.api.AbstractC32812c
            /* renamed from: g */
            public void mo120976g() {
                C51997c.m201752c();
            }

            @Override // com.ss.android.lark.chat.api.AbstractC32812c
            /* renamed from: h */
            public void mo120977h() {
                C51997c.m201755d();
            }

            @Override // com.ss.android.lark.chat.api.AbstractC32812c
            /* renamed from: i */
            public void mo120978i() {
                C51997c.m201757e();
            }

            @Override // com.ss.android.lark.chat.api.AbstractC32812c
            /* renamed from: j */
            public void mo120979j() {
                C51997c.m201758f();
            }

            @Override // com.ss.android.lark.chat.api.AbstractC32812c
            /* renamed from: k */
            public void mo120980k() {
                C51997c.m201761i();
            }

            @Override // com.ss.android.lark.chat.api.AbstractC32812c
            /* renamed from: a */
            public void mo120952a() {
                C51997c.m201743a("key_doc", ChatBundle.SourceType.CARD);
            }

            @Override // com.ss.android.lark.chat.api.AbstractC32812c
            /* renamed from: b */
            public void mo120961b() {
                C51997c.m201743a("key_doc", ChatBundle.SourceType.PROFILE);
            }

            @Override // com.ss.android.lark.chat.api.AbstractC32812c
            /* renamed from: c */
            public void mo120968c(String str) {
                C51979h.m201608a(str);
            }

            @Override // com.ss.android.lark.chat.api.AbstractC32812c
            /* renamed from: d */
            public void mo120971d(String str) {
                C51979h.m201611b(str);
            }

            @Override // com.ss.android.lark.chat.api.AbstractC32812c
            /* renamed from: b */
            public void mo120963b(Context context) {
                C51997c.m201739a(context, "key_chatwindow", ChatBundle.ChatType.THREAD_DETAIL);
            }

            @Override // com.ss.android.lark.chat.api.AbstractC32812c
            /* renamed from: c */
            public void mo120969c(boolean z) {
                C51997c.m201753c(z);
            }

            @Override // com.ss.android.lark.chat.api.AbstractC32812c
            /* renamed from: d */
            public void mo120972d(boolean z) {
                C51997c.m201756d(z);
            }

            @Override // com.ss.android.lark.chat.api.AbstractC32812c
            /* renamed from: a */
            public void mo120955a(Context context) {
                C51997c.m201739a(context, "key_chatwindow", ChatBundle.ChatType.THREAD);
            }

            @Override // com.ss.android.lark.chat.api.AbstractC32812c
            /* renamed from: b */
            public void mo120964b(String str) {
                C51997c.m201741a(str);
            }

            @Override // com.ss.android.lark.chat.api.AbstractC32812c
            /* renamed from: e */
            public C53253l mo120973e(String str) {
                C53253l lVar = new C53253l();
                long c = C51979h.m201613c(str);
                if (c != -1) {
                    lVar.f131605a = c;
                    Log.m165389i("OpenTracer", "get running request params: " + str + "/" + lVar.f131605a);
                }
                return lVar;
            }

            @Override // com.ss.android.lark.chat.api.AbstractC32812c
            /* renamed from: a */
            public void mo120957a(String str) {
                C51997c.m201743a("key_chatwindow", ChatBundle.SourceType.fromValue(str));
            }

            @Override // com.ss.android.lark.chat.api.AbstractC32812c
            /* renamed from: b */
            public void mo120966b(boolean z) {
                C51997c.m201751b(z);
            }

            @Override // com.ss.android.lark.chat.api.AbstractC32812c
            /* renamed from: a */
            public void mo120960a(boolean z) {
                C51997c.m201745a(z);
            }

            @Override // com.ss.android.lark.chat.api.AbstractC32812c
            /* renamed from: a */
            public void mo120953a(int i, String str) {
                C51997c.m201736a(i, str);
            }

            @Override // com.ss.android.lark.chat.api.AbstractC32812c
            /* renamed from: b */
            public void mo120962b(int i, String str) {
                C51997c.m201749b(i, str);
            }

            @Override // com.ss.android.lark.chat.api.AbstractC32812c
            /* renamed from: b */
            public void mo120965b(String str, String str2) {
                C51979h.m201609a(str, str2);
            }

            @Override // com.ss.android.lark.chat.api.AbstractC32812c
            /* renamed from: a */
            public void mo120958a(String str, String str2) {
                C51997c.m201744a(str, str2);
            }

            @Override // com.ss.android.lark.chat.api.AbstractC32812c
            /* renamed from: a */
            public void mo120954a(long j, long j2, List<Long> list) {
                C51997c.m201737a(j, j2, list);
            }

            @Override // com.ss.android.lark.chat.api.AbstractC32812c
            /* renamed from: a */
            public void mo120959a(String str, boolean z, ErrorResult errorResult) {
                C51997c.m201742a("key_chatwindow", ChatBundle.ChatType.fromValue(str), z, errorResult);
            }

            @Override // com.ss.android.lark.chat.api.AbstractC32812c
            /* renamed from: a */
            public void mo120956a(Context context, String str, boolean z, int i, boolean z2) {
                C51997c.m201740a(context, "key_chatwindow", ChatBundle.ChatType.fromValue(str), z, i, z2);
            }
        };
    }

    @Override // com.ss.android.lark.biz.core.api.ICoreApi
    public IPerfQuickSwitchUserMonitor getPerfQuickSwitchUserMonitor() {
        return PerfQuickSwitchUserMonitor.m201668a();
    }

    @Override // com.ss.android.lark.biz.core.api.ICoreApi
    public String getPolicyUrlBeforeLogin() {
        return getClientDynamicLink("help-private-policy");
    }

    @Override // com.ss.android.lark.biz.core.api.ICoreApi
    public String getServiceTermUrlBeforeLogin() {
        return getClientDynamicLink("help-user-agreement");
    }

    @Override // com.ss.android.lark.biz.core.api.ICoreApi
    public void guidePrepare() {
        C57480a.m223132a().mo141823c();
    }

    @Override // com.ss.android.lark.biz.core.api.ICoreApi
    public void initBrowserModule() {
        BrowserModuleProvider.m200667a().mo106853b();
    }

    @Override // com.ss.android.lark.biz.core.api.ICoreApi
    public void initBytecertSdk() {
        C51798a.m200809a().mo177926a();
    }

    @Override // com.ss.android.lark.biz.core.api.ICoreApi
    public void initGuideMgrModule() {
        C57480a.m223132a().mo141821b();
    }

    @Override // com.ss.android.lark.biz.core.api.ICoreApi
    public void initGuideModule() {
        C57397a.m222529a().mo141239b();
    }

    @Override // com.ss.android.lark.biz.core.api.ICoreApi
    public void initMagicModule() {
        C57503a.m223196a().mo149982a();
    }

    @Override // com.ss.android.lark.biz.core.api.ICoreApi
    public void initPushMonitor() {
        C51949a.m201493a().mo181565d();
    }

    @Override // com.ss.android.lark.biz.core.api.ICoreApi
    public void initWschannelProcess() {
        C51702c.m200484a().mo201584a();
    }

    @Override // com.ss.android.lark.biz.core.api.ICoreApi
    public boolean isSystemTracerEnable() {
        return C51984k.m201636a();
    }

    @Override // com.ss.android.lark.biz.core.api.ICoreApi
    public IFCMModule loadFCMFromLocal() {
        return C36141b.m142101a();
    }

    @Override // com.ss.android.lark.biz.core.api.ICoreApi
    public void onAppTerminate() {
        C29410a.m108289c().mo104291e();
    }

    @Override // com.ss.android.lark.biz.core.api.ICoreApi
    public void onLocaleChange() {
        BrowserModuleProvider.m200667a().mo106859c();
    }

    @Override // com.ss.android.lark.biz.core.api.ICoreApi
    public void onUpdateDeviceEvent() {
        C36187a.m142438a().mo160271c();
    }

    @Override // com.ss.android.lark.biz.core.api.ICoreApi
    public void preloadDynamicConfig() {
        DynamicConfigModule.m145552b().mo136167a();
    }

    @Override // com.ss.android.lark.biz.core.api.ICoreApi
    public ICoreApi.AbstractC29533a provideQRCodeScannerFactory() {
        return new ICoreApi.AbstractC29533a() {
            /* class com.ss.android.lark.core.impl.CoreApiImpl.C361483 */
        };
    }

    @Override // com.ss.android.lark.biz.core.api.ICoreApi
    public void reloadGuideIfNeed() {
        C57480a.m223132a().mo141827e();
    }

    @Override // com.ss.android.lark.biz.core.api.ICoreApi
    public void resetWaterMark() {
        C51689a.m200461a().mo197369b();
    }

    @Override // com.ss.android.lark.biz.core.api.ICoreApi
    public void sendCalendarSettingClick() {
        SettingHitPoint.f134851a.mo186401d();
    }

    @Override // com.ss.android.lark.biz.core.api.ICoreApi
    public void sendLanguageSetting() {
        C36235a.m142710a().mo148284e();
    }

    @Override // com.ss.android.lark.biz.core.api.ICoreApi
    public void skipAuthorized() {
        C51795a.m200798a().mo104164c();
    }

    @Override // com.ss.android.lark.biz.core.api.ICoreApi
    public void startFlow() {
        C57522a.m223261a().mo194459d();
    }

    @Override // com.ss.android.lark.biz.core.api.ICoreApi
    public void startFromCardWithKeyChatWindow() {
        C51997c.m201743a("key_chatwindow", ChatBundle.SourceType.CARD);
    }

    @Override // com.ss.android.lark.biz.core.api.ICoreApi
    public void startFromCardWithKeyDoc() {
        C51997c.m201743a("key_doc", ChatBundle.SourceType.CARD);
    }

    @Override // com.ss.android.lark.biz.core.api.ICoreApi
    public void syncMainDomainSessionCookie() {
        BrowserModuleProvider.m200667a().mo106862e();
    }

    @Override // com.ss.android.lark.biz.core.api.ICoreApi
    public void unInitGuideMgrModule() {
        C57480a.m223132a().mo141825d();
    }

    @Override // com.ss.android.lark.biz.core.api.ICoreApi
    public void unInitMainModule() {
        C36149a.m142162a().mo157116h();
    }

    @Override // com.ss.android.lark.biz.core.api.ICoreApi
    public void unInitRustTrackPushMonitor() {
        C51949a.m201493a().mo181566e();
    }

    @Override // com.ss.android.lark.biz.core.api.ICoreApi
    public void updateDynamicConfig() {
        LarkSettingModuleProvider.m200903a().mo148453g();
    }

    @Override // com.ss.android.lark.biz.core.api.ICoreApi
    public void clearNotification() {
        C51907a.m201314a().mo169320b().mo169511a();
    }

    @Override // com.ss.android.lark.biz.core.api.ICoreApi
    public int getAppIconBadgeCount() {
        return C36093a.m141506a().mo104299b();
    }

    @Override // com.ss.android.lark.biz.core.api.ICoreApi
    public BadgeStyle getBadgeStyleSetting() {
        return SettingModuleProvider.f129183h.mo178263a().mo185219e().mo186566c();
    }

    @Override // com.ss.android.lark.biz.core.api.ICoreApi
    public Locale getCacheLanguageSetting() {
        return C36235a.m142710a().mo148282c().mo148303f();
    }

    @Override // com.ss.android.lark.biz.core.api.ICoreApi
    public Locale getCacheLanguageSettingwithDefault() {
        return C36235a.m142710a().mo148282c().mo148304g();
    }

    @Override // com.ss.android.lark.biz.core.api.ICoreApi
    public Locale getCachedLanguageSetting() {
        return C36235a.m142710a().mo148281b().mo105659a();
    }

    @Override // com.ss.android.lark.biz.core.api.ICoreApi
    public AbstractC41558b getCalendarMap() {
        return MapModuleProvider.m201088a().getCalendarMap();
    }

    @Override // com.ss.android.lark.biz.core.api.ICoreApi
    public String getChatReactionSampleConfig() {
        return LarkSettingModuleProvider.m200903a().mo148457k();
    }

    @Override // com.ss.android.lark.biz.core.api.ICoreApi
    public String getChatReadSampleConfig() {
        return LarkSettingModuleProvider.m200903a().mo148456j();
    }

    @Override // com.ss.android.lark.biz.core.api.ICoreApi
    public IContactsGroupController getContactGroupController() {
        return C36099a.m141515a().mo130135d().mo130293f();
    }

    @Override // com.ss.android.lark.biz.core.api.ICoreApi
    public AbstractC29563j getContactHomeController() {
        return C36099a.m141515a().mo130135d().mo130289b();
    }

    @Override // com.ss.android.lark.biz.core.api.ICoreApi
    public String getContactPageTag() {
        return C36099a.m141515a().mo130134c().mo130264b();
    }

    @Override // com.ss.android.lark.biz.core.api.ICoreApi
    public AbstractC29565l getContactsSelectorController() {
        return C36099a.m141515a().mo130135d().mo130291d();
    }

    @Override // com.ss.android.lark.biz.core.api.ICoreApi
    public NetworkLevelListener.NetworkLevel getCurNetWorkLevel() {
        return C51701b.m200482a().mo201515a().mo201516a();
    }

    @Override // com.ss.android.lark.biz.core.api.ICoreApi
    public String getCurrentAttribution() {
        return C57522a.m223261a().mo194456b().mo194493c();
    }

    @Override // com.ss.android.lark.biz.core.api.ICoreApi
    public Locale getDefaultLanguageSetting() {
        return C36235a.m142710a().mo148282c().mo148301d();
    }

    @Override // com.ss.android.lark.biz.core.api.ICoreApi
    public AbstractNotification.AbstractC48496c<Notice> getDefaultNotificationHitPoint() {
        return C51907a.m201314a().mo169326g();
    }

    @Override // com.ss.android.lark.biz.core.api.ICoreApi
    public String getDefaultTabName() {
        return C36149a.m142162a().mo157109d();
    }

    @Override // com.ss.android.lark.biz.core.api.ICoreApi
    public AbstractC29570n getDepartmentDetailController() {
        return C36099a.m141515a().mo130135d().mo130292e();
    }

    @Override // com.ss.android.lark.biz.core.api.ICoreApi
    public AbstractC29575r getDownloadService() {
        return C51816a.m200873a().mo135982a();
    }

    @Override // com.ss.android.lark.biz.core.api.ICoreApi
    public AbstractC29583s getEmailContactController() {
        return C36099a.m141515a().mo130135d().mo130290c();
    }

    @Override // com.ss.android.lark.biz.core.api.ICoreApi
    public int getExistActivityNumber() {
        return AppLifecycle.m200904a().mo177977g();
    }

    @Override // com.ss.android.lark.biz.core.api.ICoreApi
    public String getFeiShuMiniAppLink() {
        return LarkSettingModuleProvider.m200903a().mo148449c();
    }

    @Override // com.ss.android.lark.biz.core.api.ICoreApi
    public AbstractC24152a getH5Service() {
        return C51819a.m200877a().mo86772b();
    }

    @Override // com.ss.android.lark.biz.core.api.ICoreApi
    public Map<String, String> getHandleSchemaList() {
        return BrowserModuleProvider.m200667a().mo106865i();
    }

    @Override // com.ss.android.lark.biz.core.api.ICoreApi
    public String getHelpDeskAppid() {
        return LarkSettingModuleProvider.m200903a().mo148448b();
    }

    @Override // com.ss.android.lark.biz.core.api.ICoreApi
    public String getHybridMaterialConfig() {
        return C51797a.m200805a().mo177921b();
    }

    @Override // com.ss.android.lark.biz.core.api.ICoreApi
    public String getInviteExternalPageTitle() {
        return C57532a.m223304a().getInviteExternalPageTitle();
    }

    @Override // com.ss.android.lark.biz.core.api.ICoreApi
    public String getKeyFromNotification() {
        return C36149a.m142162a().mo157098b().mo105699a();
    }

    @Override // com.ss.android.lark.biz.core.api.ICoreApi
    public Locale getLanguageSetting() {
        return C36235a.m142710a().mo148282c().mo148297b();
    }

    @Override // com.ss.android.lark.biz.core.api.ICoreApi
    public String getLanguageSettingCode() {
        return C36235a.m142710a().mo148282c().mo148307j();
    }

    @Override // com.ss.android.lark.biz.core.api.ICoreApi
    public String getLanguageWithLocal() {
        return C36235a.m142710a().mo148282c().mo148307j();
    }

    @Override // com.ss.android.lark.biz.core.api.ICoreApi
    public Activity getLastTopActivity() {
        return C29410a.m108289c().mo104290d();
    }

    @Override // com.ss.android.lark.biz.core.api.ICoreApi
    public AbstractC41559c getLittleAppMap() {
        return MapModuleProvider.m201088a().getLittleAppMap();
    }

    @Override // com.ss.android.lark.biz.core.api.ICoreApi
    public String getLoadSoVersion() {
        return C51657a.m200381a().mo194413d();
    }

    @Override // com.ss.android.lark.biz.core.api.ICoreApi
    public String getLocalSoVersion() {
        return C51657a.m200381a().mo194411c();
    }

    @Override // com.ss.android.lark.biz.core.api.ICoreApi
    public TimeFormatSetting getLocalTimeFormat() {
        return SettingModuleProvider.f129183h.mo178263a().mo185219e().mo186572e();
    }

    @Override // com.ss.android.lark.biz.core.api.ICoreApi
    public AbstractC29551a getLocaleCache() {
        return C36235a.m142710a().mo148281b();
    }

    @Override // com.ss.android.lark.biz.core.api.ICoreApi
    public ILocaleWatcher getLocaleWatcher() {
        return C36235a.m142710a().mo148283d();
    }

    @Override // com.ss.android.lark.biz.core.api.ICoreApi
    public AbstractC41561d getLocationMessageMap() {
        return MapModuleProvider.m201088a().getLocationMessageMap();
    }

    @Override // com.ss.android.lark.biz.core.api.ICoreApi
    public CharSequence getMainActivityName() {
        return C36149a.m142162a().mo157112f();
    }

    @Override // com.ss.android.lark.biz.core.api.ICoreApi
    public AbstractC29555b getMainLauncher() {
        return C36149a.m142162a().mo157098b();
    }

    @Override // com.ss.android.lark.biz.core.api.ICoreApi
    public boolean getNavMuteBadgeSetting() {
        return SettingModuleProvider.f129183h.mo178263a().mo185219e().mo186571d();
    }

    @Override // com.ss.android.lark.biz.core.api.ICoreApi
    public AbstractC29572q getNetworkMonitor() {
        return C51816a.m200873a().mo135983b();
    }

    @Override // com.ss.android.lark.biz.core.api.ICoreApi
    public AbstractC29539aa getNotificationSetting() {
        return C51907a.m201314a().mo169324e();
    }

    @Override // com.ss.android.lark.biz.core.api.ICoreApi
    public long getNtpTime() {
        return C54608b.m211917b().mo186512a();
    }

    @Override // com.ss.android.lark.biz.core.api.ICoreApi
    public int getOneWayContactSelectLimit() {
        return LarkSettingModuleProvider.m200903a().mo148454h();
    }

    @Override // com.ss.android.lark.biz.core.api.ICoreApi
    public String getOnlyLanguage() {
        return C36235a.m142710a().mo148282c().mo148308k();
    }

    @Override // com.ss.android.lark.biz.core.api.ICoreApi
    public String getOpenApiUrl() {
        BrowserModuleProvider.m200667a();
        return C29638a.m109622a().getOpenApiUrl();
    }

    @Override // com.ss.android.lark.biz.core.api.ICoreApi
    public boolean getP2pBuildGroupTipShowSetting() {
        return SettingModuleProvider.f129183h.mo178263a().mo185216c().mo186526d();
    }

    @Override // com.ss.android.lark.biz.core.api.ICoreApi
    public AbstractC41562e getPOIService() {
        return MapModuleProvider.m201088a().getPOIService();
    }

    @Override // com.ss.android.lark.biz.core.api.ICoreApi
    public AbstractC41569h getPickLocationMap() {
        return MapModuleProvider.m201088a().getPickLocationMap();
    }

    @Override // com.ss.android.lark.biz.core.api.ICoreApi
    public Profile getProfile() {
        return AbstractC36232b.m142703a().mo178819a().mo180502a();
    }

    @Override // com.ss.android.lark.biz.core.api.ICoreApi
    public AbstractC29542ad getProfileLauncherService() {
        return AbstractC36232b.m142703a().mo178821b();
    }

    @Override // com.ss.android.lark.biz.core.api.ICoreApi
    public IOpenMessageCellFactory getProfileMessageCellFactory() {
        return AbstractC36232b.m142703a().mo178824g();
    }

    @Override // com.ss.android.lark.biz.core.api.ICoreApi
    public AbstractC29582d getResourceService() {
        return C51947a.m201491a().mo181472a();
    }

    @Override // com.ss.android.lark.biz.core.api.ICoreApi
    public Activity getRightActivity() {
        return AppLifecycle.m200904a().mo177979i();
    }

    @Override // com.ss.android.lark.biz.core.api.ICoreApi
    public Map<String, String> getSchemaHandleListByManis() {
        BrowserModuleProvider.m200667a();
        return C29638a.m109622a().getManisDependency().mo107692a();
    }

    @Override // com.ss.android.lark.biz.core.api.ICoreApi
    public ISearchLifecycleObserver getSearchLifecycleObserver() {
        return C53264a.m205974a().mo181716d();
    }

    @Override // com.ss.android.lark.biz.core.api.ICoreApi
    public List<String> getSecLinkWhiteList() {
        return BrowserModuleProvider.m200667a().mo106866j();
    }

    @Override // com.ss.android.lark.biz.core.api.ICoreApi
    public List<String> getSecurityWhiteListByManis() {
        BrowserModuleProvider.m200667a();
        return C29638a.m109622a().getManisDependency().mo107699b();
    }

    @Override // com.ss.android.lark.biz.core.api.ICoreApi
    public List<String> getSupportShowBannerSourceList() {
        return LarkSettingModuleProvider.m200903a().mo148451e();
    }

    @Override // com.ss.android.lark.biz.core.api.ICoreApi
    public Activity getTopActivity() {
        return AppLifecycle.m200904a().mo177978h();
    }

    @Override // com.ss.android.lark.biz.core.api.ICoreApi
    public IUiModeService getUiModeService() {
        return SettingModuleProvider.f129183h.mo178263a().mo185221g();
    }

    @Override // com.ss.android.lark.biz.core.api.ICoreApi
    public int getUpdateAvatarResultCode() {
        return C36084a.m141488a().mo222591a();
    }

    @Override // com.ss.android.lark.biz.core.api.ICoreApi
    public int getWatermarkStrategy() {
        return C51689a.m200461a().mo197373c();
    }

    @Override // com.ss.android.lark.biz.core.api.ICoreApi
    public C25830a getWebAppInjector() {
        return BrowserModuleProvider.m200667a().mo106864g();
    }

    @Override // com.ss.android.lark.biz.core.api.ICoreApi
    public Map<aq, aq> getWebLifecycleListeners() {
        return C29878b.m110476a().mo107587b();
    }

    @Override // com.ss.android.lark.biz.core.api.ICoreApi
    public Boolean hadGotInstallAttribution() {
        return C57522a.m223261a().mo194456b().mo194495d();
    }

    @Override // com.ss.android.lark.biz.core.api.ICoreApi
    public void handleDepartmentDetailBackPressed() {
        C36099a.m141515a().mo130135d().mo130292e().mo105788b();
    }

    @Override // com.ss.android.lark.biz.core.api.ICoreApi
    public void initAppSettingV3() {
        C51677a.m200443a().mo148569c().mo148562c();
    }

    @Override // com.ss.android.lark.biz.core.api.ICoreApi
    public boolean isAllowSecret() {
        return C51677a.m200443a().mo148570d();
    }

    @Override // com.ss.android.lark.biz.core.api.ICoreApi
    public boolean isAotTaskRunning() {
        return C51654a.m200378a().mo101338c();
    }

    @Override // com.ss.android.lark.biz.core.api.ICoreApi
    public boolean isAppFront() {
        return AppLifecycle.m200904a().mo177975e();
    }

    @Override // com.ss.android.lark.biz.core.api.ICoreApi
    public boolean isAppRealForeground() {
        return C29410a.m108289c().mo104288b();
    }

    @Override // com.ss.android.lark.biz.core.api.ICoreApi
    public boolean isAuthorized() {
        return C51795a.m200798a().mo104163b();
    }

    @Override // com.ss.android.lark.biz.core.api.ICoreApi
    public boolean isClientContactOptUi() {
        return C36099a.m141515a().mo130140i();
    }

    @Override // com.ss.android.lark.biz.core.api.ICoreApi
    public boolean isCurrentUserInZenMode() {
        return SettingModuleProvider.f129183h.mo178263a().mo185219e().mo186574g();
    }

    @Override // com.ss.android.lark.biz.core.api.ICoreApi
    public boolean isDozeState() {
        return C51721b.m200560g().mo177826h();
    }

    @Override // com.ss.android.lark.biz.core.api.ICoreApi
    public boolean isFloatingWindowEnabled() {
        return C48282c.m190475a().mo169068d(LarkContext.getApplication());
    }

    @Override // com.ss.android.lark.biz.core.api.ICoreApi
    public boolean isFollowSystemLanguage() {
        return C36235a.m142710a().mo148282c().mo148305h();
    }

    @Override // com.ss.android.lark.biz.core.api.ICoreApi
    public boolean isFullWidthPunctuation() {
        return C36235a.m142710a().mo148282c().mo148306i();
    }

    @Override // com.ss.android.lark.biz.core.api.ICoreApi
    public boolean isGlobalWaterMark() {
        if (C51689a.m200461a().mo197373c() == 0) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.lark.biz.core.api.ICoreApi
    public boolean isHasNewVersion() {
        return C51661a.m200388a().mo195610e();
    }

    @Override // com.ss.android.lark.biz.core.api.ICoreApi
    public boolean isInvitationUnionEnable() {
        return C57532a.m223304a().isInvitationUnionEnable();
    }

    @Override // com.ss.android.lark.biz.core.api.ICoreApi
    public boolean isInviteExternalEnable() {
        return C57532a.m223304a().isInviteExternalEnable();
    }

    @Override // com.ss.android.lark.biz.core.api.ICoreApi
    public boolean isInviteMemberAdminEnable() {
        return C57532a.m223304a().isInviteMemberAdminEnable();
    }

    @Override // com.ss.android.lark.biz.core.api.ICoreApi
    public boolean isInviteMemberEnable() {
        return C57532a.m223304a().isInviteMemberEnable();
    }

    @Override // com.ss.android.lark.biz.core.api.ICoreApi
    public boolean isMailSmartComposeEnabled() {
        return SettingModuleProvider.f129183h.mo178263a().mo185216c().mo186532j();
    }

    @Override // com.ss.android.lark.biz.core.api.ICoreApi
    public boolean isMedalEnabled() {
        return AbstractC36232b.m142703a().mo178825h();
    }

    @Override // com.ss.android.lark.biz.core.api.ICoreApi
    public boolean isMessageAlignLeftAndRightEnable() {
        return SettingModuleProvider.f129183h.mo178263a().mo185223i();
    }

    @Override // com.ss.android.lark.biz.core.api.ICoreApi
    public boolean isMessengerEnterpriseTopicEnable() {
        return SettingModuleProvider.f129183h.mo178263a().mo185222h();
    }

    @Override // com.ss.android.lark.biz.core.api.ICoreApi
    public boolean isMessengerSmartComposeEnabled() {
        return SettingModuleProvider.f129183h.mo178263a().mo185216c().mo186531i();
    }

    @Override // com.ss.android.lark.biz.core.api.ICoreApi
    public boolean isMessengerSmartCorrectionEnabled() {
        return SettingModuleProvider.f129183h.mo178263a().mo185216c().mo186533k();
    }

    @Override // com.ss.android.lark.biz.core.api.ICoreApi
    public boolean isNeedShowCreateGroupGuide() {
        return SettingModuleProvider.f129183h.mo178263a().mo185216c().mo186529g();
    }

    @Override // com.ss.android.lark.biz.core.api.ICoreApi
    public boolean isNeedStrongNotice() {
        return C51661a.m200388a().mo195609d();
    }

    @Override // com.ss.android.lark.biz.core.api.ICoreApi
    public boolean isNotificationUndisturbed() {
        return SettingModuleProvider.f129183h.mo178263a().mo185230p();
    }

    @Override // com.ss.android.lark.biz.core.api.ICoreApi
    public boolean isOpenUserCustomStatus() {
        return C36187a.m142438a().mo160274e();
    }

    @Override // com.ss.android.lark.biz.core.api.ICoreApi
    public boolean isSettingKeyboardEnterSendEnable() {
        return SettingModuleProvider.f129183h.mo178263a().mo185224j();
    }

    @Override // com.ss.android.lark.biz.core.api.ICoreApi
    public boolean isSettingMessageAlignmentEnable() {
        return SettingModuleProvider.f129183h.mo178263a().mo185225k();
    }

    @Override // com.ss.android.lark.biz.core.api.ICoreApi
    public boolean isSettingV2Enable() {
        return SettingModuleProvider.f129183h.mo178263a().mo185229o();
    }

    @Override // com.ss.android.lark.biz.core.api.ICoreApi
    public boolean isSmartReplyEnabled() {
        return SettingModuleProvider.f129183h.mo178263a().mo185216c().mo186530h();
    }

    @Override // com.ss.android.lark.biz.core.api.ICoreApi
    public boolean isUseDiskManage() {
        return SettingModuleProvider.f129183h.mo178263a().mo185231q();
    }

    @Override // com.ss.android.lark.biz.core.api.ICoreApi
    public boolean isUsingTTWebView() {
        return C51657a.m200381a().mo194410b();
    }

    @Override // com.ss.android.lark.biz.core.api.ICoreApi
    public void loadAttribution() {
        C57522a.m223261a().mo194456b().mo194491b();
    }

    @Override // com.ss.android.lark.biz.core.api.ICoreApi
    public void preLoadSettingV1FromLocal() {
        C51677a.m200443a().mo148569c().mo148556a();
    }

    @Override // com.ss.android.lark.biz.core.api.ICoreApi
    public void preloadUserSetting() {
        SettingModuleProvider.f129183h.mo178263a().mo185219e().mo186555b();
    }

    @Override // com.ss.android.lark.biz.core.api.ICoreApi
    public IMineController provideMineController() {
        return C36187a.m142438a().mo160269b();
    }

    @Override // com.ss.android.lark.biz.core.api.ICoreApi
    public void resetItemsSelectedStatus() {
        C36099a.m141515a().mo130135d().mo130292e().mo105795e();
    }

    @Override // com.ss.android.lark.biz.core.api.ICoreApi
    public void sendInitGear() {
        SettingModuleProvider.f129183h.mo178263a().mo185232r();
    }

    @Override // com.ss.android.lark.biz.core.api.ICoreApi
    public void setupNotificationListener() {
        C51702c.m200484a().mo201585a(new WschannelPush.AbstractC59292c() {
            /* class com.ss.android.lark.core.impl.CoreApiImpl.C361472 */

            @Override // com.ss.android.lark.wschannelprocess.WschannelPush.AbstractC59292c
            /* renamed from: a */
            public void mo133177a(WschannelPush.C59290a aVar) {
                C51698a.m200478a().mo201538a(new C59280a(aVar.mo201561a(), aVar.mo201562b(), aVar.mo201563c(), aVar.mo201564d(), aVar.mo201565e()));
            }
        });
    }

    @Override // com.ss.android.lark.biz.core.api.ICoreApi
    public boolean shouldUseTTWebView() {
        return C51657a.m200381a().mo194415e();
    }

    @Override // com.ss.android.lark.biz.core.api.ICoreApi
    public C29550b getAppConfig() {
        if (C51677a.m200443a() == null || C51677a.m200443a().mo148569c() == null) {
            return null;
        }
        return C51677a.m200443a().mo148569c().mo148565f();
    }

    @Override // com.ss.android.lark.biz.core.api.ICoreApi
    public long getCachedNtpTime() {
        return SettingModuleProvider.f129183h.mo178263a().mo185212b().mo186513a(30000);
    }

    @Override // com.ss.android.lark.biz.core.api.ICoreApi
    public Department getCurDepartment() {
        return C36099a.m141515a().mo130135d().mo130292e().mo105791c();
    }

    @Override // com.ss.android.lark.biz.core.api.ICoreApi
    public BaseFragment getDepartmentDetailAsFragment() {
        return C36099a.m141515a().mo130135d().mo130292e().mo105779a();
    }

    @Override // com.ss.android.lark.biz.core.api.ICoreApi
    public void addBackToFrontEventListener(AbstractC29561h hVar) {
        ComponentCallbacks2C51833b.m200969a(hVar);
    }

    @Override // com.ss.android.lark.biz.core.api.ICoreApi
    public void addFrontToBackEventListener(AbstractC29585t tVar) {
        ComponentCallbacks2C51833b.m200970a(tVar);
    }

    @Override // com.ss.android.lark.biz.core.api.ICoreApi
    public void endSpan(String str) {
        C51979h.m201611b(str);
    }

    @Override // com.ss.android.lark.biz.core.api.ICoreApi
    public void hookClassLoader(String str) {
        MiraModule.m205165e(str);
    }

    @Override // com.ss.android.lark.biz.core.api.ICoreApi
    public void initProcessorDoInit(String str) {
        C53200b.m205840a(str);
    }

    @Override // com.ss.android.lark.biz.core.api.ICoreApi
    public void initTTNet(Context context) {
        C51880f.m201207a(context);
    }

    @Override // com.ss.android.lark.biz.core.api.ICoreApi
    public boolean isInstanceOfBaseContextWrapperDelegate(AppCompatDelegate appCompatDelegate) {
        return appCompatDelegate instanceof BaseContextWrapperDelegate;
    }

    @Override // com.ss.android.lark.biz.core.api.ICoreApi
    public void loadPlugin(String str) {
        MiraModule.m205162b(str);
    }

    @Override // com.ss.android.lark.biz.core.api.ICoreApi
    public void perfBoostBeginSection(String str) {
        C51995b.m201716a(str);
    }

    @Override // com.ss.android.lark.biz.core.api.ICoreApi
    public void registerComponentCallbacks(ComponentCallbacks2 componentCallbacks2) {
        ComponentCallbacks2C51833b.m200968a(componentCallbacks2);
    }

    @Override // com.ss.android.lark.biz.core.api.ICoreApi
    public void registerNetworkQualityListener(av avVar) {
        C51878d.m201200a(avVar);
    }

    @Override // com.ss.android.lark.biz.core.api.ICoreApi
    public void removeBackToFrontEventListener(AbstractC29561h hVar) {
        ComponentCallbacks2C51833b.m200973b(hVar);
    }

    @Override // com.ss.android.lark.biz.core.api.ICoreApi
    public void removeFrontToBackEventListener(AbstractC29585t tVar) {
        ComponentCallbacks2C51833b.m200974b(tVar);
    }

    @Override // com.ss.android.lark.biz.core.api.ICoreApi
    public void startPerfQuickSwitchUserMonitor(String str) {
        PerfQuickSwitchUserMonitor.m201669a(str);
    }

    @Override // com.ss.android.lark.biz.core.api.ICoreApi
    public void startSpan(String str) {
        C51979h.m201608a(str);
    }

    @Override // com.ss.android.lark.biz.core.api.ICoreApi
    public void startWschannelService(Context context) {
        C59307d.m230284a(context);
    }

    @Override // com.ss.android.lark.biz.core.api.ICoreApi
    public void unRegisterNetworkQualityListener(av avVar) {
        C51878d.m201202b(avVar);
    }

    @Override // com.ss.android.lark.biz.core.api.ICoreApi
    public void unregisterComponentCallbacks(ComponentCallbacks2 componentCallbacks2) {
        ComponentCallbacks2C51833b.m200972b(componentCallbacks2);
    }

    @Override // com.ss.android.lark.biz.core.api.ICoreApi
    public void addActivityObserver(C29538a aVar) {
        AppLifecycle.m200904a().mo177965a(aVar);
    }

    @Override // com.ss.android.lark.biz.core.api.ICoreApi
    public void addAppFloatView(View view) {
        C48282c.m190475a().mo169059a(view);
    }

    @Override // com.ss.android.lark.biz.core.api.ICoreApi
    public void addAppLifecycleObserver(AbstractC29586u uVar) {
        AppLifecycle.m200904a().mo177967a(uVar);
    }

    @Override // com.ss.android.lark.biz.core.api.ICoreApi
    public void addChatHistorySideMenuClickHitPoint(String str) {
        C53264a.m205974a().mo181710a(str);
    }

    @Override // com.ss.android.lark.biz.core.api.ICoreApi
    public void addLifeCycleObserver(AbstractC29586u uVar) {
        AppLifecycle.m200904a().mo177967a(uVar);
    }

    @Override // com.ss.android.lark.biz.core.api.ICoreApi
    public void addLifecycleObserver(AbstractC29586u uVar) {
        AppLifecycle.m200904a().mo177967a(uVar);
    }

    @Override // com.ss.android.lark.biz.core.api.ICoreApi
    public void addPushContactStateListener(AbstractC29543ag agVar) {
        C36099a.m141515a().mo130128a(agVar);
    }

    @Override // com.ss.android.lark.biz.core.api.ICoreApi
    public void addPushFileUploadListener(AbstractC29544ah ahVar) {
        C51676a.m200442a().mo101340a(ahVar);
    }

    @Override // com.ss.android.lark.biz.core.api.ICoreApi
    public void addPushPushResourceListener(AbstractC29580b bVar) {
        C51947a.m201491a().mo181474a(bVar);
    }

    @Override // com.ss.android.lark.biz.core.api.ICoreApi
    public void addPushResourceDownloadProgressListener(AbstractC29579a aVar) {
        C51947a.m201491a().mo181473a(aVar);
    }

    @Override // com.ss.android.lark.biz.core.api.ICoreApi
    public void addPushResourceUploadProgressListener(AbstractC29581c cVar) {
        C51947a.m201491a().mo181475a(cVar);
    }

    @Override // com.ss.android.lark.biz.core.api.ICoreApi
    public void attachBackgroundWatermark(View view) {
        C51689a.m200461a().mo197365a(view);
    }

    @Override // com.ss.android.lark.biz.core.api.ICoreApi
    public void attachDialogWatermark(Dialog dialog) {
        C51689a.m200461a().mo197371b(dialog);
    }

    @Override // com.ss.android.lark.biz.core.api.ICoreApi
    public void attachGlobalWatermark(Activity activity) {
        C51689a.m200461a().mo197361a(activity);
    }

    @Override // com.ss.android.lark.biz.core.api.ICoreApi
    public void attachPartialWatermark(Activity activity) {
        C51689a.m200461a().mo197370b(activity);
    }

    @Override // com.ss.android.lark.biz.core.api.ICoreApi
    public void attachWatermark(Activity activity) {
        C51689a.m200461a().mo197370b(activity);
    }

    @Override // com.ss.android.lark.biz.core.api.ICoreApi
    public void checkAndStartFlow(IGetDataCallback<Boolean> iGetDataCallback) {
        C57522a.m223261a().mo194457b(iGetDataCallback);
    }

    @Override // com.ss.android.lark.biz.core.api.ICoreApi
    public void checkFlowStatus(IGetDataCallback<Bundle> iGetDataCallback) {
        C57522a.m223261a().mo194452a(iGetDataCallback);
    }

    @Override // com.ss.android.lark.biz.core.api.ICoreApi
    public void detachWatermark(Activity activity) {
        C51689a.m200461a().mo197374c(activity);
    }

    @Override // com.ss.android.lark.biz.core.api.ICoreApi
    public void doAot(Context context) {
        C51654a.m200378a().mo101337a(context);
    }

    @Override // com.ss.android.lark.biz.core.api.ICoreApi
    public String fetchAppLogDomain(boolean z) {
        return C51714a.m200518a(z);
    }

    @Override // com.ss.android.lark.biz.core.api.ICoreApi
    public void fetchWebViewCore(boolean z) {
        C51657a.m200381a().mo194408a(z);
    }

    @Override // com.ss.android.lark.biz.core.api.ICoreApi
    public void getEnableDingBySmsPhone(IGetDataCallback iGetDataCallback) {
        C36099a.m141515a().mo130127a(iGetDataCallback);
    }

    @Override // com.ss.android.lark.biz.core.api.ICoreApi
    public void getLastTopActivity(IGetDataCallback<Activity> iGetDataCallback) {
        C29410a.m108289c().mo104283a(iGetDataCallback);
    }

    @Override // com.ss.android.lark.biz.core.api.ICoreApi
    public void getMyPhoneNumber(IGetDataCallback<String> iGetDataCallback) {
        C36099a.m141515a().mo130131b(iGetDataCallback);
    }

    @Override // com.ss.android.lark.biz.core.api.ICoreApi
    public String getPluginNativeLibraryDir(String str) {
        return MiraModule.m205166f(str);
    }

    @Override // com.ss.android.lark.biz.core.api.ICoreApi
    public long getRunningSpan(String str) {
        return C51979h.m201613c(str);
    }

    @Override // com.ss.android.lark.biz.core.api.ICoreApi
    public String getSourceFile(String str) {
        return MiraModule.m205167g(str);
    }

    @Override // com.ss.android.lark.biz.core.api.ICoreApi
    public void initAppFloat(Application application) {
        C48282c.m190475a().mo169064b(application);
    }

    @Override // com.ss.android.lark.biz.core.api.ICoreApi
    public void initMainModule(Context context) {
        C36149a.m142162a().mo157107c(context);
    }

    @Override // com.ss.android.lark.biz.core.api.ICoreApi
    public void initNightMode(Context context) {
        UiModeService.f135042b.mo186689a(context);
    }

    @Override // com.ss.android.lark.biz.core.api.ICoreApi
    public void initNotificationModule(Context context) {
        C51907a.m201314a().mo169318a(context);
    }

    @Override // com.ss.android.lark.biz.core.api.ICoreApi
    public void initWebViewSDKBasic(Context context) {
        C51657a.m200381a().mo194404a(context);
    }

    @Override // com.ss.android.lark.biz.core.api.ICoreApi
    public void injectWebViewCoreResource(Application application) {
        C51657a.m200381a().mo194414d(application);
    }

    @Override // com.ss.android.lark.biz.core.api.ICoreApi
    public boolean isAppreciableForwardError(ErrorResult errorResult) {
        return !TemplateFactoryUtils.m151923a(errorResult);
    }

    @Override // com.ss.android.lark.biz.core.api.ICoreApi
    public boolean isPluginInstalled(String str) {
        return MiraModule.m205163c(str);
    }

    @Override // com.ss.android.lark.biz.core.api.ICoreApi
    public boolean isPluginLoaded(String str) {
        return MiraModule.m205164d(str);
    }

    @Override // com.ss.android.lark.biz.core.api.ICoreApi
    public void loadAppConfigTabConfig(IGetDataCallback<Boolean> iGetDataCallback) {
        C36149a.m142162a().mo157086a(iGetDataCallback);
    }

    @Override // com.ss.android.lark.biz.core.api.ICoreApi
    public void notifyBootMileStoneFirstContentDraw(String str) {
        C36149a.m142162a().mo157117h(str);
    }

    @Override // com.ss.android.lark.biz.core.api.ICoreApi
    public void notifyBootMileStoneFirstDataLoaded(String str) {
        C36149a.m142162a().mo157113f(str);
    }

    @Override // com.ss.android.lark.biz.core.api.ICoreApi
    public void notifyBootMileStoneFirstFrameDraw(String str) {
        C36149a.m142162a().mo157114g(str);
    }

    @Override // com.ss.android.lark.biz.core.api.ICoreApi
    public void notifyMainTabFragmentContentDraw(String str) {
        C36149a.m142162a().mo157119i(str);
    }

    @Override // com.ss.android.lark.biz.core.api.ICoreApi
    public void openAboutPage(Context context) {
        C51661a.m200388a().mo195602a(context);
    }

    @Override // com.ss.android.lark.biz.core.api.ICoreApi
    public void openMinePage(Context context) {
        C36187a.m142438a().mo160264a(context);
    }

    @Override // com.ss.android.lark.biz.core.api.ICoreApi
    public void openSearchMainPageFromAllPin(Activity activity) {
        C53264a.m205974a().mo181703a(activity);
    }

    @Override // com.ss.android.lark.biz.core.api.ICoreApi
    public void openUgDebugPage(Context context) {
        C57522a.m223261a().mo194450a(context);
    }

    @Override // com.ss.android.lark.biz.core.api.ICoreApi
    public void pullTenantsBadge(IGetDataCallback iGetDataCallback) {
        C36149a.m142162a().mo157100b(iGetDataCallback);
    }

    @Override // com.ss.android.lark.biz.core.api.ICoreApi
    public void putBannerCloseStatus(String str) {
        C57365e.m222366a().mo104320b(str);
    }

    @Override // com.ss.android.lark.biz.core.api.ICoreApi
    public void registerAccountBadgePush(IPushAccountBadgeListener aeVar) {
        C36149a.m142162a().mo157087a(aeVar);
    }

    @Override // com.ss.android.lark.biz.core.api.ICoreApi
    public void registerBootMileStoneListener(AbstractC44544a aVar) {
        C36149a.m142162a().mo157090a(aVar);
    }

    @Override // com.ss.android.lark.biz.core.api.ICoreApi
    public void registerDrawerListener(IMainDrawerListener xVar) {
        C36149a.m142162a().mo157088a(xVar);
    }

    @Override // com.ss.android.lark.biz.core.api.ICoreApi
    public void registerSessionSyncedListener(AbstractC29552a aVar) {
        BrowserModuleProvider.m200667a().mo106847a(aVar);
    }

    @Override // com.ss.android.lark.biz.core.api.ICoreApi
    public void registerStoreStateListener(an anVar) {
        C52066a.m201979a().mo201660a(anVar);
    }

    @Override // com.ss.android.lark.biz.core.api.ICoreApi
    public void registerTenantInfoListener(AbstractC49405t tVar) {
        C36149a.m142162a().mo157092a(tVar);
    }

    @Override // com.ss.android.lark.biz.core.api.ICoreApi
    public void registerUpgradeListener(az azVar) {
        C51661a.m200388a().mo195604a(azVar);
    }

    @Override // com.ss.android.lark.biz.core.api.ICoreApi
    public void registerWatermarkInfoChangedListener(AbstractC29559a aVar) {
        C51689a.m200461a().mo197367a(aVar);
    }

    @Override // com.ss.android.lark.biz.core.api.ICoreApi
    public void registerWebLifecycleListener(aq aqVar) {
        BrowserModuleProvider.m200667a().mo106846a(aqVar);
    }

    @Override // com.ss.android.lark.biz.core.api.ICoreApi
    public void removeActivityObserver(C29538a aVar) {
        AppLifecycle.m200904a().mo177971b(aVar);
    }

    @Override // com.ss.android.lark.biz.core.api.ICoreApi
    public void removeAppFloatView(View view) {
        C48282c.m190475a().mo169065b(view);
    }

    @Override // com.ss.android.lark.biz.core.api.ICoreApi
    public void removeAppLifecycleObserver(AbstractC29586u uVar) {
        AppLifecycle.m200904a().mo177972b(uVar);
    }

    @Override // com.ss.android.lark.biz.core.api.ICoreApi
    public void removeCustomViewAppFloat(String str) {
        C48282c.m190475a().mo169063a(str);
    }

    @Override // com.ss.android.lark.biz.core.api.ICoreApi
    public void removeGuidesIfNeeded(List<String> list) {
        C57480a.m223132a().mo141818a(list);
    }

    @Override // com.ss.android.lark.biz.core.api.ICoreApi
    public void removeLifeCycleObserver(AbstractC29586u uVar) {
        AppLifecycle.m200904a().mo177972b(uVar);
    }

    @Override // com.ss.android.lark.biz.core.api.ICoreApi
    public void removeLifecycleObserver(AbstractC29586u uVar) {
        AppLifecycle.m200904a().mo177972b(uVar);
    }

    @Override // com.ss.android.lark.biz.core.api.ICoreApi
    public void removePushContactStateListener(AbstractC29543ag agVar) {
        C36099a.m141515a().mo130132b(agVar);
    }

    @Override // com.ss.android.lark.biz.core.api.ICoreApi
    public void removePushFileUploadListener(AbstractC29544ah ahVar) {
        C51676a.m200442a().mo101341b(ahVar);
    }

    @Override // com.ss.android.lark.biz.core.api.ICoreApi
    public void removePushResourceDownloadProgressListener(AbstractC29579a aVar) {
        C51947a.m201491a().mo181476b(aVar);
    }

    @Override // com.ss.android.lark.biz.core.api.ICoreApi
    public void removePushResourceListener(AbstractC29580b bVar) {
        C51947a.m201491a().mo181477b(bVar);
    }

    @Override // com.ss.android.lark.biz.core.api.ICoreApi
    public void removePushResourceUploadProgressListener(AbstractC29581c cVar) {
        C51947a.m201491a().mo181478b(cVar);
    }

    @Override // com.ss.android.lark.biz.core.api.ICoreApi
    public void setContentStandAloneCallback(ContentStateChangeCallback dVar) {
        C48282c.m190475a().mo169062a(dVar);
    }

    @Override // com.ss.android.lark.biz.core.api.ICoreApi
    public void setGetFeedCardsV2End(long j) {
        PerfQuickSwitchUserMonitor.m201668a().mo178205n(j);
    }

    @Override // com.ss.android.lark.biz.core.api.ICoreApi
    public void setGetFeedCardsV2Start(long j) {
        PerfQuickSwitchUserMonitor.m201668a().mo178204m(j);
    }

    @Override // com.ss.android.lark.biz.core.api.ICoreApi
    public void setHideLoadingStart(long j) {
        PerfQuickSwitchUserMonitor.m201668a().mo178206o(j);
    }

    @Override // com.ss.android.lark.biz.core.api.ICoreApi
    public void setInAppBadgeCount(int i) {
        C36093a.m141506a().mo104295a(i);
    }

    @Override // com.ss.android.lark.biz.core.api.ICoreApi
    public void setMonitorInited(boolean z) {
        C51949a.m201493a().mo181562a(z);
    }

    @Override // com.ss.android.lark.biz.core.api.ICoreApi
    public void setTriggerLoginInfoChangedEnd(long j) {
        PerfQuickSwitchUserMonitor.m201668a().mo178203l(j);
    }

    @Override // com.ss.android.lark.biz.core.api.ICoreApi
    public void showGuideIfNeed(AbstractC44546c cVar) {
        C36149a.m142162a().mo157091a(cVar);
    }

    @Override // com.ss.android.lark.biz.core.api.ICoreApi
    public void shutDownOtherProcessOnSimpleMode(Context context) {
        SimpleModeSwitcher.f135403a.mo187106e(context);
    }

    @Override // com.ss.android.lark.biz.core.api.ICoreApi
    public void startQrCodeScreenShot(Activity activity) {
        C51931a.m201432a().mo180845b(activity);
    }

    @Override // com.ss.android.lark.biz.core.api.ICoreApi
    public void startScanQRCodeActivity(Activity activity) {
        C51931a.m201432a().mo180840a(activity);
    }

    @Override // com.ss.android.lark.biz.core.api.ICoreApi
    public String tenantDocDomain(String str) {
        return C36882a.m145557a(str);
    }

    @Override // com.ss.android.lark.biz.core.api.ICoreApi
    public void unRegisterAccountBadgePush(IPushAccountBadgeListener aeVar) {
        C36149a.m142162a().mo157101b(aeVar);
    }

    @Override // com.ss.android.lark.biz.core.api.ICoreApi
    public void unRegisterStoreStateListener(an anVar) {
        C52066a.m201979a().mo201662b(anVar);
    }

    @Override // com.ss.android.lark.biz.core.api.ICoreApi
    public void unRegisterTenantInfoListener(AbstractC49405t tVar) {
        C36149a.m142162a().mo157104b(tVar);
    }

    @Override // com.ss.android.lark.biz.core.api.ICoreApi
    public void unRegisterUpgradeListener(az azVar) {
        C51661a.m200388a().mo195607b(azVar);
    }

    @Override // com.ss.android.lark.biz.core.api.ICoreApi
    public void unRegisterWatermarkInfoChangedListener(AbstractC29559a aVar) {
        C51689a.m200461a().mo197372b(aVar);
    }

    @Override // com.ss.android.lark.biz.core.api.ICoreApi
    public void unRegisterWebLifecycleListener(aq aqVar) {
        BrowserModuleProvider.m200667a().mo106855b(aqVar);
    }

    @Override // com.ss.android.lark.biz.core.api.ICoreApi
    public void unlock(String str) {
        C57480a.m223132a().mo141832h(str);
    }

    @Override // com.ss.android.lark.biz.core.api.ICoreApi
    public void unregisterBootMileStoneListener(AbstractC44544a aVar) {
        C36149a.m142162a().mo157103b(aVar);
    }

    @Override // com.ss.android.lark.biz.core.api.ICoreApi
    public void unregisterDrawerListener(IMainDrawerListener xVar) {
        C36149a.m142162a().mo157102b(xVar);
    }

    @Override // com.ss.android.lark.biz.core.api.ICoreApi
    public void unregisterMagicLifecycle(String str) {
        C57503a.m223196a().mo149986b(str);
    }

    @Override // com.ss.android.lark.biz.core.api.ICoreApi
    public void unregisterScenario(String str) {
        C57503a.m223196a().mo149983a(str);
    }

    @Override // com.ss.android.lark.biz.core.api.ICoreApi
    public void updateInAppBadgeCount(Context context) {
        C36093a.m141506a().mo104300b(context);
    }

    @Override // com.ss.android.lark.biz.core.api.ICoreApi
    public void addConnStateListener(WSConnState.AbstractC29537a aVar) {
        C51701b.m200482a().mo201515a().mo201519a(aVar);
    }

    @Override // com.ss.android.lark.biz.core.api.ICoreApi
    public void addDownloadTask(C29556e eVar) {
        C51816a.m200873a().mo135983b().mo105816a(eVar);
    }

    @Override // com.ss.android.lark.biz.core.api.ICoreApi
    public void addLocaleSelectListener(AbstractC49339b bVar) {
        SettingModuleProvider.f129183h.mo178263a().mo185204a(bVar);
    }

    @Override // com.ss.android.lark.biz.core.api.ICoreApi
    public void addSettingsUpdateListener(ISettingsUpdateListener amVar) {
        SettingModuleProvider.f129183h.mo178263a().mo185216c().mo186516a(amVar);
    }

    @Override // com.ss.android.lark.biz.core.api.ICoreApi
    public void attachGlobalWatermark(Dialog dialog) {
        C51689a.m200461a().mo197363a(dialog);
    }

    @Override // com.ss.android.lark.biz.core.api.ICoreApi
    public void beforeConfigurationChangedForLocale(Configuration configuration) {
        C36235a.m142710a().mo148282c().mo148289a(configuration);
    }

    @Override // com.ss.android.lark.biz.core.api.ICoreApi
    public void checkInviteMemberPermission(C57865c.AbstractC57871b<Boolean> bVar) {
        C57532a.m223304a().getService().checkInviteMemberPermission(bVar);
    }

    @Override // com.ss.android.lark.biz.core.api.ICoreApi
    public boolean checkToShow(String str) {
        return C57480a.m223132a().mo141828e(str);
    }

    @Override // com.ss.android.lark.biz.core.api.ICoreApi
    public boolean completeGuide(String str) {
        return C57480a.m223132a().mo141830f(str);
    }

    @Override // com.ss.android.lark.biz.core.api.ICoreApi
    public boolean consumeGuide(String str) {
        return C57480a.m223132a().mo141824c(str);
    }

    @Override // com.ss.android.lark.biz.core.api.ICoreApi
    public String decodeQRCode(Bitmap bitmap) {
        return C51931a.m201432a().mo180838a(bitmap);
    }

    @Override // com.ss.android.lark.biz.core.api.ICoreApi
    public byte[] decryptFile(File file) throws KeyStoreException {
        return C52014a.m201804a().mo197215b(file);
    }

    @Override // com.ss.android.lark.biz.core.api.ICoreApi
    public boolean didShowGuide(String str) {
        return C57480a.m223132a().mo141822b(str);
    }

    @Override // com.ss.android.lark.biz.core.api.ICoreApi
    public boolean encryptFile(File file) {
        return C52014a.m201804a().mo197214a(file);
    }

    @Override // com.ss.android.lark.biz.core.api.ICoreApi
    public String getApiKey(Context context) {
        return MapModuleProvider.m201088a().getApiKey(context);
    }

    @Override // com.ss.android.lark.biz.core.api.ICoreApi
    public String getAttributionConfig(String str) {
        return C57522a.m223261a().mo194456b().mo194496d(str);
    }

    @Override // com.ss.android.lark.biz.core.api.ICoreApi
    public AbstractC29479b getBannerController(String str) {
        return C57365e.m222366a().mo104319a(str);
    }

    @Override // com.ss.android.lark.biz.core.api.ICoreApi
    public UserRelationResponse getContactUserRelationShip(String str) {
        return C36099a.m141515a().mo130136e().mo130274a(str);
    }

    @Override // com.ss.android.lark.biz.core.api.ICoreApi
    public NetworkType getCurrentNetworkType(Context context) {
        return C51816a.m200873a().mo135983b().mo105815a(context);
    }

    @Override // com.ss.android.lark.biz.core.api.ICoreApi
    public NotificationSettingDetail getDetail(String str) {
        return C51907a.m201314a().mo169324e().mo105560a(str);
    }

    @Override // com.ss.android.lark.biz.core.api.ICoreApi
    public String getDomain(DomainSettings.Alias alias) {
        return DynamicConfigModule.m145552b().mo136164a(alias);
    }

    @Override // com.ss.android.lark.biz.core.api.ICoreApi
    public List<String> getDomains(DomainSettings.Alias alias) {
        return DynamicConfigModule.m145552b().mo136169b(alias);
    }

    @Override // com.ss.android.lark.biz.core.api.ICoreApi
    public String getDynamicDomainByManis(DomainSettings.Alias alias) {
        BrowserModuleProvider.m200667a();
        return C29638a.m109622a().getManisDependency().mo107691a(alias);
    }

    @Override // com.ss.android.lark.biz.core.api.ICoreApi
    public AppConfig.FeatureConfig getFeatureConfig(String str) {
        return C51804b.m200825a().mo148365b().mo148372b(str);
    }

    @Override // com.ss.android.lark.biz.core.api.ICoreApi
    public as getIdlePositionLifecycle(Fragment fragment) {
        return C48282c.m190475a().mo169056a(fragment);
    }

    @Override // com.ss.android.lark.biz.core.api.ICoreApi
    public Image getImage(com.bytedance.lark.pb.basic.v1.Image image) {
        return C51854a.m201094a().mo142150a(image);
    }

    @Override // com.ss.android.lark.biz.core.api.ICoreApi
    public ByteString getInlinePreviewFromPb(ImageSet imageSet) {
        return C51854a.m201094a().mo142169c(imageSet);
    }

    @Override // com.ss.android.lark.biz.core.api.ICoreApi
    public String getLanguageLocalTag(Locale locale) {
        return C36235a.m142710a().mo148282c().mo148296b(locale);
    }

    @Override // com.ss.android.lark.biz.core.api.ICoreApi
    public Locale getLocaleFromConfiguration(Configuration configuration) {
        return C36235a.m142710a().mo148282c().mo148298b(configuration);
    }

    @Override // com.ss.android.lark.biz.core.api.ICoreApi
    public AppCompatDelegate getLocaleHookDelegate(AppCompatDelegate appCompatDelegate) {
        return C36235a.m142710a().mo148280a(appCompatDelegate);
    }

    @Override // com.ss.android.lark.biz.core.api.ICoreApi
    public AbstractC41583b getLocationClient(Context context) {
        return MapModuleProvider.m201088a().getLocationClient(context);
    }

    @Override // com.ss.android.lark.biz.core.api.ICoreApi
    public Image getMiddleFromPb(ImageSet imageSet) {
        return C51854a.m201094a().mo142165b(imageSet);
    }

    @Override // com.ss.android.lark.biz.core.api.ICoreApi
    public String getMiddleKeyFromPb(RichTextElement.ImageProperty imageProperty) {
        return C51854a.m201094a().mo142167b(imageProperty);
    }

    @Override // com.ss.android.lark.biz.core.api.ICoreApi
    public Chatter.ChatterCustomStatus getOpenedUserStatus(List<Chatter.ChatterCustomStatus> list) {
        return C36187a.m142438a().mo160263a(list);
    }

    @Override // com.ss.android.lark.biz.core.api.ICoreApi
    public IPlusItem getProfileKBPlusItem(Chat chat) {
        return AbstractC36232b.m142703a().mo178818a(chat);
    }

    @Override // com.ss.android.lark.biz.core.api.ICoreApi
    public int getTabIndex(String str) {
        return C36149a.m142162a().mo157097b(str);
    }

    @Override // com.ss.android.lark.biz.core.api.ICoreApi
    public TabType getTabType(String str) {
        return C36149a.m142162a().mo157080a(str);
    }

    @Override // com.ss.android.lark.biz.core.api.ICoreApi
    public <T extends View> T getTabView(String str) {
        return (T) C36149a.m142162a().mo157108d(str);
    }

    @Override // com.ss.android.lark.biz.core.api.ICoreApi
    public PrivateKey getTenantCertPrivateKey(String str) {
        return C52013b.m201803a().mo178253a(str);
    }

    @Override // com.ss.android.lark.biz.core.api.ICoreApi
    public List<String> getTenantTrustHostList(String str) {
        return C52013b.m201803a().mo178257e(str);
    }

    @Override // com.ss.android.lark.biz.core.api.ICoreApi
    public Image getThumbnailFromPb(ImageSet imageSet) {
        return C51854a.m201094a().mo142151a(imageSet);
    }

    @Override // com.ss.android.lark.biz.core.api.ICoreApi
    public String getThumbnailKeyFromPb(RichTextElement.ImageProperty imageProperty) {
        return C51854a.m201094a().mo142155a(imageProperty);
    }

    @Override // com.ss.android.lark.biz.core.api.ICoreApi
    public void getTimeFormatFromServer(IGetDataCallback<TimeFormatSetting> iGetDataCallback) {
        SettingModuleProvider.f129183h.mo178263a().mo185219e().mo186569d(iGetDataCallback);
    }

    @Override // com.ss.android.lark.biz.core.api.ICoreApi
    public UniversalUserSetting getUniversalUserSetting(String str) {
        return C51659a.m200385a().mo148385a().mo148377a(str);
    }

    @Override // com.ss.android.lark.biz.core.api.ICoreApi
    public WatermarkInfo getWatermarkInfo(Context context) {
        return C51689a.m200461a().mo197360a(context);
    }

    @Override // com.ss.android.lark.biz.core.api.ICoreApi
    public void goExternalContactActivity(Context context) {
        C36099a.m141515a().mo130130b().mo130273e(context);
    }

    @Override // com.ss.android.lark.biz.core.api.ICoreApi
    public void goMineTranslationSettingPage(Context context) {
        SettingModuleProvider.f129183h.mo178263a().mo185217c(context);
    }

    @Override // com.ss.android.lark.biz.core.api.ICoreApi
    public void initDynamicResources(Context context) {
        C36083a.m141486a().getGeckoResDependency().mo132777a();
    }

    @Override // com.ss.android.lark.biz.core.api.ICoreApi
    public boolean isAppConfigOn(String str) {
        return C51804b.m200825a().mo148365b().mo148371a(str);
    }

    @Override // com.ss.android.lark.biz.core.api.ICoreApi
    public boolean isAppLink(Uri uri) {
        return C51707a.m200495a().mo103470a(uri);
    }

    @Override // com.ss.android.lark.biz.core.api.ICoreApi
    public boolean isDefaultTab(String str) {
        return C36149a.m142162a().mo157121j(str);
    }

    @Override // com.ss.android.lark.biz.core.api.ICoreApi
    public boolean isGuideFgEnabled(String str) {
        return C57480a.m223132a().mo141833i(str);
    }

    @Override // com.ss.android.lark.biz.core.api.ICoreApi
    public boolean isInZenMode(long j) {
        return SettingModuleProvider.f129183h.mo178263a().mo185219e().mo186554a(j);
    }

    @Override // com.ss.android.lark.biz.core.api.ICoreApi
    public boolean isInstanceOfMainActivity(Context context) {
        return C36149a.m142162a().mo157098b().mo105702a(context);
    }

    @Override // com.ss.android.lark.biz.core.api.ICoreApi
    public boolean isInterceptUrl(String str) {
        return BrowserModuleProvider.m200667a().mo106860c(str);
    }

    @Override // com.ss.android.lark.biz.core.api.ICoreApi
    public boolean isLowMemoryDevice(Context context) {
        return C29410a.m108288b().mo104293a(context);
    }

    @Override // com.ss.android.lark.biz.core.api.ICoreApi
    public boolean isMultitaskEnabled(Application application) {
        return C48282c.m190475a().mo169067c(application);
    }

    @Override // com.ss.android.lark.biz.core.api.ICoreApi
    public boolean isNotificationShowDetail(boolean z) {
        return SettingModuleProvider.f129183h.mo178263a().mo185216c().mo186524b(z);
    }

    @Override // com.ss.android.lark.biz.core.api.ICoreApi
    public boolean isOn(String str) {
        return C51804b.m200825a().mo148365b().mo148371a(str);
    }

    @Override // com.ss.android.lark.biz.core.api.ICoreApi
    public boolean isSandboxProcess(Context context) {
        return C51657a.m200381a().mo194412c(context);
    }

    @Override // com.ss.android.lark.biz.core.api.ICoreApi
    public boolean isSimpleModeOn(Context context) {
        return C54866b.m212765a().mo187076a(context);
    }

    @Override // com.ss.android.lark.biz.core.api.ICoreApi
    public boolean isSoundOn(String str) {
        return C51907a.m201314a().mo169324e().mo105562c(str);
    }

    @Override // com.ss.android.lark.biz.core.api.ICoreApi
    public boolean isTTNetOn(Context context) {
        return C51880f.m201212c(LarkContext.getApplication());
    }

    @Override // com.ss.android.lark.biz.core.api.ICoreApi
    public boolean isTabEnable(String str) {
        return C36149a.m142162a().mo157111e(str);
    }

    @Override // com.ss.android.lark.biz.core.api.ICoreApi
    public boolean isVibrateOn(String str) {
        return C51907a.m201314a().mo169324e().mo105561b(str);
    }

    @Override // com.ss.android.lark.biz.core.api.ICoreApi
    public void launchMainWindow(Context context) {
        C36149a.m142162a().mo157098b().mo105705b(context);
    }

    @Override // com.ss.android.lark.biz.core.api.ICoreApi
    public void noticeClientEvent(boolean z) {
        C51791b.m200791a().mo103630a().mo103634a(z);
    }

    @Override // com.ss.android.lark.biz.core.api.ICoreApi
    public void notifySettingModulehandleLoginStatusChangedEvent(boolean z) {
        SettingModuleProvider.f129183h.mo178263a().mo185209a(z);
    }

    @Override // com.ss.android.lark.biz.core.api.ICoreApi
    public void onAFConversionDataFail(String str) {
        C57522a.m223261a().mo194456b().mo194489a(str);
    }

    @Override // com.ss.android.lark.biz.core.api.ICoreApi
    public void onAFConversionDataSuccess(Map<String, Object> map) {
        C57522a.m223261a().mo194456b().mo194490a(map);
    }

    @Override // com.ss.android.lark.biz.core.api.ICoreApi
    public void onGotDeviceID(String str) {
        C57522a.m223261a().mo194456b().mo194492b(str);
    }

    @Override // com.ss.android.lark.biz.core.api.ICoreApi
    public boolean openPrivacyPolicy(Context context) {
        return C51684b.m200451a().mo195871b(context);
    }

    @Override // com.ss.android.lark.biz.core.api.ICoreApi
    public boolean openUserProtocol(Context context) {
        return C51684b.m200451a().mo195870a(context);
    }

    @Override // com.ss.android.lark.biz.core.api.ICoreApi
    public void openVcWelcomeGuide(Bitmap bitmap) {
        C57397a.m222529a().mo141242f().mo141518a(bitmap);
    }

    @Override // com.ss.android.lark.biz.core.api.ICoreApi
    public void pullDingAddressBookInfo(IGetDataCallback<List<String>> iGetDataCallback) {
        SettingModuleProvider.f129183h.mo178263a().mo185216c().mo186521b(iGetDataCallback);
    }

    @Override // com.ss.android.lark.biz.core.api.ICoreApi
    public void pullInviteActivityBanner(IGetDataCallback<InvitationServiceApi.InviteActivityBannerResult> iGetDataCallback) {
        C57532a.m223304a().getService().pullInviteActivityBanner(iGetDataCallback);
    }

    @Override // com.ss.android.lark.biz.core.api.ICoreApi
    public void pullInvitePermission4Banner(IGetDataCallback<InvitationServiceApi.InvitePermissionResult> iGetDataCallback) {
        C57532a.m223304a().getService().pullInvitePermission4Banner(iGetDataCallback);
    }

    @Override // com.ss.android.lark.biz.core.api.ICoreApi
    public void pushNotice(Notice notice) {
        C51907a.m201314a().mo169320b().mo169512a(notice);
    }

    @Override // com.ss.android.lark.biz.core.api.ICoreApi
    public void registerAddFriendPush(IPushAddFriendListener afVar) {
        C52239a.m202617d().mo133588r().mo133629a(afVar);
    }

    @Override // com.ss.android.lark.biz.core.api.ICoreApi
    public void registerAppConfigCacheCallback(AbstractC29560g gVar) {
        C51677a.m200443a().mo148569c().mo148557a(gVar);
    }

    @Override // com.ss.android.lark.biz.core.api.ICoreApi
    public void registerAppConfigListener(IGetDataCallback<AppConfig> iGetDataCallback) {
        C51804b.m200825a().mo148365b().mo148368a(iGetDataCallback);
    }

    @Override // com.ss.android.lark.biz.core.api.ICoreApi
    public void registerBadgeStyleObserver(AbstractC29562i iVar) {
        SettingModuleProvider.f129183h.mo178263a().mo185219e().mo186546a(iVar);
    }

    @Override // com.ss.android.lark.biz.core.api.ICoreApi
    public void registerFileDownloadStateChangeListener(AbstractC29572q.AbstractC29573a aVar) {
        C51816a.m200873a().mo135983b().mo105817a(aVar);
    }

    @Override // com.ss.android.lark.biz.core.api.ICoreApi
    public void registerLanguageChangeListener(AbstractC29540ab abVar) {
        C36235a.m142710a().mo148282c().mo148290a(abVar);
    }

    @Override // com.ss.android.lark.biz.core.api.ICoreApi
    public void registerNavMuteBadgeObserver(AbstractC29589z zVar) {
        SettingModuleProvider.f129183h.mo178263a().mo185219e().mo186547a(zVar);
    }

    @Override // com.ss.android.lark.biz.core.api.ICoreApi
    public void registerNetworkLevelListener(NetworkLevelListener networkLevelListener) {
        C51701b.m200482a().mo201515a().mo201518a(networkLevelListener);
    }

    @Override // com.ss.android.lark.biz.core.api.ICoreApi
    public void registerNetworkStateListener(AbstractC29572q.AbstractC29574b bVar) {
        C51816a.m200873a().mo135983b().mo105818a(bVar);
    }

    @Override // com.ss.android.lark.biz.core.api.ICoreApi
    public void registerRustNetLevelPushOnly(Context context) {
        C51701b.m200482a().mo201515a().mo201520b(context);
    }

    @Override // com.ss.android.lark.biz.core.api.ICoreApi
    public void registerTimeFormatSettingObserver(ao aoVar) {
        SettingModuleProvider.f129183h.mo178263a().mo185219e().mo186544a(aoVar);
    }

    @Override // com.ss.android.lark.biz.core.api.ICoreApi
    public void registerZenSettingUpdateObserver(ar arVar) {
        SettingModuleProvider.f129183h.mo178263a().mo185219e().mo186545a(arVar);
    }

    @Override // com.ss.android.lark.biz.core.api.ICoreApi
    public void removeConnStateListener(WSConnState.AbstractC29537a aVar) {
        C51701b.m200482a().mo201515a().mo201522b(aVar);
    }

    @Override // com.ss.android.lark.biz.core.api.ICoreApi
    public void removeLocaleSelectListener(AbstractC49339b bVar) {
        SettingModuleProvider.f129183h.mo178263a().mo185215b(bVar);
    }

    @Override // com.ss.android.lark.biz.core.api.ICoreApi
    public void removeSettingsUpdateListener(ISettingsUpdateListener amVar) {
        SettingModuleProvider.f129183h.mo178263a().mo185216c().mo186522b(amVar);
    }

    @Override // com.ss.android.lark.biz.core.api.ICoreApi
    public void saveLanguageSetting(Locale locale) {
        C36235a.m142710a().mo148282c().mo148291a(locale);
    }

    @Override // com.ss.android.lark.biz.core.api.ICoreApi
    public void setContainedChatters(List<String> list) {
        C36099a.m141515a().mo130135d().mo130292e().mo105792c(list);
    }

    @Override // com.ss.android.lark.biz.core.api.ICoreApi
    public void setIsDingAddressBookOn(boolean z) {
        SettingModuleProvider.f129183h.mo178263a().mo185216c().mo186518a(z);
    }

    @Override // com.ss.android.lark.biz.core.api.ICoreApi
    public void setOrganizationListener(AbstractC29541ac acVar) {
        C36099a.m141515a().mo130135d().mo130292e().mo105782a(acVar);
    }

    @Override // com.ss.android.lark.biz.core.api.ICoreApi
    public void setSelectedChatters(List<String> list) {
        C36099a.m141515a().mo130135d().mo130292e().mo105786a(list);
    }

    @Override // com.ss.android.lark.biz.core.api.ICoreApi
    public void showUpgradeToBigTeamUserTip(View view) {
        C57397a.m222529a().mo141241e().mo141293a(view);
    }

    @Override // com.ss.android.lark.biz.core.api.ICoreApi
    public void startMainActivity(Context context) {
        C36149a.m142162a().mo157098b().mo105710d(context);
    }

    @Override // com.ss.android.lark.biz.core.api.ICoreApi
    public void startReceivedFilesPicker(FilePickerLaunchParams fVar) {
        FilePickerModuleProvider.f128779a.mo177952a().mo139541b(fVar);
    }

    @Override // com.ss.android.lark.biz.core.api.ICoreApi
    public boolean tryLock(String str) {
        return C57480a.m223132a().mo141831g(str);
    }

    @Override // com.ss.android.lark.biz.core.api.ICoreApi
    public void unRegisterAppConfigCacheCallback(AbstractC29560g gVar) {
        C51677a.m200443a().mo148569c().mo148561b(gVar);
    }

    @Override // com.ss.android.lark.biz.core.api.ICoreApi
    public void unRegisterBadgeStyleObserver(AbstractC29562i iVar) {
        SettingModuleProvider.f129183h.mo178263a().mo185219e().mo186559b(iVar);
    }

    @Override // com.ss.android.lark.biz.core.api.ICoreApi
    public void unRegisterFileDownloadStateChangeListener(AbstractC29572q.AbstractC29573a aVar) {
        C51816a.m200873a().mo135983b().mo105820b(aVar);
    }

    @Override // com.ss.android.lark.biz.core.api.ICoreApi
    public void unRegisterLanguageChangeListener(AbstractC29540ab abVar) {
        C36235a.m142710a().mo148282c().mo148299b(abVar);
    }

    @Override // com.ss.android.lark.biz.core.api.ICoreApi
    public void unRegisterNavMuteBadgeObserver(AbstractC29589z zVar) {
        SettingModuleProvider.f129183h.mo178263a().mo185219e().mo186560b(zVar);
    }

    @Override // com.ss.android.lark.biz.core.api.ICoreApi
    public void unRegisterNetworkLevelListener(NetworkLevelListener networkLevelListener) {
        C51701b.m200482a().mo201515a().mo201521b(networkLevelListener);
    }

    @Override // com.ss.android.lark.biz.core.api.ICoreApi
    public void unRegisterNetworkStateListener(AbstractC29572q.AbstractC29574b bVar) {
        C51816a.m200873a().mo135983b().mo105821b(bVar);
    }

    @Override // com.ss.android.lark.biz.core.api.ICoreApi
    public void unRegisterTimeFormatSettingObserver(ao aoVar) {
        SettingModuleProvider.f129183h.mo178263a().mo185219e().mo186557b(aoVar);
    }

    @Override // com.ss.android.lark.biz.core.api.ICoreApi
    public void unRegisterZenSettingUpdateObserver(ar arVar) {
        SettingModuleProvider.f129183h.mo178263a().mo185219e().mo186558b(arVar);
    }

    @Override // com.ss.android.lark.biz.core.api.ICoreApi
    public void unregisterAddFriendPush(IPushAddFriendListener afVar) {
        C52239a.m202617d().mo133588r().mo133632b(afVar);
    }

    @Override // com.ss.android.lark.biz.core.api.ICoreApi
    public void updateAppBaseContext(Application application) {
        C36235a.m142710a().mo148282c().mo148287a(application);
    }

    @Override // com.ss.android.lark.biz.core.api.ICoreApi
    public Context updateContextForLanguage(Context context) {
        return C36235a.m142710a().mo148282c().mo148285a(context);
    }

    @Override // com.ss.android.lark.biz.core.api.ICoreApi
    public void updateTimeFormatSetting(TimeFormatSetting timeFormatSetting) {
        SettingModuleProvider.f129183h.mo178263a().mo185219e().mo186542a(timeFormatSetting);
    }

    @Override // com.ss.android.lark.biz.core.api.ICoreApi
    public void warmUpP0Process(Context context) {
        BrowserModuleProvider.m200667a().mo106840a(LarkContext.getApplication());
    }

    @Override // com.ss.android.lark.biz.core.api.ICoreApi
    public void attachGlobalWatermark(FrameLayout frameLayout) {
        C51689a.m200461a().mo197366a(frameLayout);
    }

    @Override // com.ss.android.lark.biz.core.api.ICoreApi
    public String decodeQRCode(String str) {
        return C51931a.m201432a().mo180839a(str);
    }

    @Override // com.ss.android.lark.biz.core.api.ICoreApi
    public String getNotificationSettingDetail(String str) {
        return C51907a.m201314a().mo169324e().mo105560a(str).toString();
    }

    @Override // com.ss.android.lark.biz.core.api.ICoreApi
    public long getNtpTime(long j) {
        return SettingModuleProvider.f129183h.mo178263a().mo185212b().mo186513a(j);
    }

    @Override // com.ss.android.lark.biz.core.api.ICoreApi
    public X509Certificate[] getTenantCertCertificate(String str) {
        if (C52013b.m201803a().mo178253a(str) != null) {
            return new X509Certificate[0];
        }
        Log.m165397w("CoreApiImpl", "getTenantCertPrivateKey failed, cert is empty");
        return null;
    }

    @Override // com.ss.android.lark.biz.core.api.ICoreApi
    public void noticeFirstScreenEvent(String str) {
        IClientService.ClientEvent clientEvent;
        IClientService a = C51791b.m200791a().mo103630a();
        if (TextUtils.equals("ChatWindowActivity", str)) {
            clientEvent = IClientService.ClientEvent.CHAT_MESSAGE_GOT;
        } else {
            clientEvent = IClientService.ClientEvent.FIRST_SCREEN_FINISHED;
        }
        a.mo103633a(clientEvent);
    }

    @Override // com.ss.android.lark.biz.core.api.ICoreApi
    public void startPicker(FilePickerLaunchParams fVar) {
        FilePickerModuleProvider.f128779a.mo177952a().mo139539a(fVar);
    }

    private String getClientDynamicLink(String str) {
        String string = SettingManager.getInstance().getString(ClientDynamicLink.class);
        if (TextUtils.isEmpty(string)) {
            return "";
        }
        try {
            return new JSONObject(string).optString(str);
        } catch (Exception e) {
            Log.m165384e("CoreApiImpl", "parse ClientDynamicLink failed, the key is " + str, e);
            return "";
        }
    }

    @Override // com.ss.android.lark.biz.core.api.ICoreApi
    public void registerOnlinePush(Context context) {
        IWschannelService a = C51701b.m200482a().mo201515a();
        AbstractC54603d e = SettingModuleProvider.f129183h.mo178263a().mo185219e();
        AbstractC48511a c = C51907a.m201314a().mo169322c();
        AbstractC54661b f = SettingModuleProvider.f129183h.mo178263a().mo185220f();
        C51677a.m200443a().mo148569c().mo148567h();
        C51677a.m200443a().mo148568b();
        a.mo201517a(context);
        C51949a.m201493a().mo181563b().mo181604b();
        C51949a.m201493a().mo181564c().mo181594a();
        e.mo186538a();
        c.mo169594a();
        C36133a.m142081a().mo133683b();
        f.mo186711b();
        C36149a.m142162a().mo157118i();
    }

    @Override // com.ss.android.lark.biz.core.api.ICoreApi
    public <V> void putKeyToBoostTracerMap(String str, V v) {
        C51963b.m201559a(str, (Object) v);
    }

    @Override // com.ss.android.lark.biz.core.api.ICoreApi
    public void startWschannelServiceDelay(Context context, long j) {
        C59307d.m230285a(context, j);
    }

    @Override // com.ss.android.lark.biz.core.api.ICoreApi
    public void addActivityFloatWindow(View view, AppCompatActivity appCompatActivity) {
        C48282c.m190475a().mo169060a(view, appCompatActivity);
    }

    @Override // com.ss.android.lark.biz.core.api.ICoreApi
    public void asyncTraceBegin(String str, String str2) {
        C51995b.m201724b(str, str2);
    }

    @Override // com.ss.android.lark.biz.core.api.ICoreApi
    public void asyncTraceEnd(String str, String str2) {
        C51995b.m201726c(str, str2);
    }

    @Override // com.ss.android.lark.biz.core.api.ICoreApi
    public void checkFCMDownloadWithDialog(Activity activity, CheckDownloadDialogCallback cVar) {
        FCMDownloadModuleProvider.m142093a().mo136915a(activity, cVar);
    }

    @Override // com.ss.android.lark.biz.core.api.ICoreApi
    public void checkNewVersionWithDialog(Context context, ay ayVar) {
        C51661a.m200388a().mo195603a(context, ayVar);
    }

    @Override // com.ss.android.lark.biz.core.api.ICoreApi
    public void checkUserProtocol(Activity activity, AbstractC29571p pVar) {
        C51684b.m200451a().mo195869a(activity, pVar);
    }

    @Override // com.ss.android.lark.biz.core.api.ICoreApi
    public void evictMultitaskFloatWindow(Lifecycle lifecycle, View view) {
        C48282c.m190475a().mo169061a(lifecycle, view);
    }

    @Override // com.ss.android.lark.biz.core.api.ICoreApi
    public void findTabViews(Activity activity, IGetDataCallback<List<Pair<String, View>>> iGetDataCallback) {
        C36149a.m142162a().mo157082a(activity, iGetDataCallback);
    }

    @Override // com.ss.android.lark.biz.core.api.ICoreApi
    public void goImageForwardSelectPage(Context context, ImageContent imageContent) {
        C51838a.m200992a().mo140410a(context, imageContent);
    }

    @Override // com.ss.android.lark.biz.core.api.ICoreApi
    public void goProfileShareForwardSelectPage(Context context, ProfileContent profileContent) {
        C51838a.m200992a().mo140412a(context, profileContent);
    }

    @Override // com.ss.android.lark.biz.core.api.ICoreApi
    public void goShareForwardSelectPage(Context context, ShareDataForwardData shareDataForwardData) {
        C51838a.m200992a().mo140397a(context, shareDataForwardData);
    }

    @Override // com.ss.android.lark.biz.core.api.ICoreApi
    public void goShareStickerSetSelectPage(Activity activity, String str) {
        C51838a.m200992a().mo140432b(activity, str);
    }

    @Override // com.ss.android.lark.biz.core.api.ICoreApi
    public void goToFolderInsideSearchPage(Context context, String str) {
        C53264a.m205974a().mo181704a(context, str);
    }

    @Override // com.ss.android.lark.biz.core.api.ICoreApi
    public void openChat(Activity activity, String str) {
        C51838a.m200992a().mo140433c(activity, str);
    }

    @Override // com.ss.android.lark.biz.core.api.ICoreApi
    public void openInvitationUnionPage(Context context, String str) {
        C57532a.m223304a().openInvitationUnionPage(context, str);
    }

    @Override // com.ss.android.lark.biz.core.api.ICoreApi
    public void openInviteMemberPageSmart(Context context, String str) {
        C57532a.m223304a().openInviteMemberPageSmart(context, str);
    }

    @Override // com.ss.android.lark.biz.core.api.ICoreApi
    public void openUrl(Context context, UrlParams urlParams) {
        BrowserModuleProvider.m200667a().mo106841a(context, urlParams);
    }

    @Override // com.ss.android.lark.biz.core.api.ICoreApi
    public void parseQRCode(String str, Activity activity) {
        C51931a.m201432a().mo180844a(str, activity);
    }

    @Override // com.ss.android.lark.biz.core.api.ICoreApi
    public void registerMagicLifecycle(String str, IMagicLifecycleListener bVar) {
        C57503a.m223196a().mo149984a(str, bVar);
    }

    @Override // com.ss.android.lark.biz.core.api.ICoreApi
    public void removeActivityFloatWindow(View view, AppCompatActivity appCompatActivity) {
        C48282c.m190475a().mo169066b(view, appCompatActivity);
    }

    @Override // com.ss.android.lark.biz.core.api.ICoreApi
    public void saveOrientation(int i, int i2) {
        C51792c.m200792a().mo177907a(i, i2);
    }

    @Override // com.ss.android.lark.biz.core.api.ICoreApi
    public void sendLinkClickEvent(String str, String str2) {
        BrowserModuleProvider.m200667a().mo106850a(str, str2);
    }

    @Override // com.ss.android.lark.biz.core.api.ICoreApi
    public void setLauncherBadgeCount(Context context, int i) {
        C36093a.m141506a().mo104298a(context, i);
    }

    @Override // com.ss.android.lark.biz.core.api.ICoreApi
    public void setMiuiLauncherBadgeCount(Notification notification, int i) {
        C36093a.m141506a().mo104296a(notification, i);
    }

    @Override // com.ss.android.lark.biz.core.api.ICoreApi
    public void setPageChangeListener(Fragment fragment, IMineController.OnGotoOtherPageListener aVar) {
        C36187a.m142438a().mo160268a(fragment, aVar);
    }

    @Override // com.ss.android.lark.biz.core.api.ICoreApi
    public void setWebViewTag(WebView webView, String str) {
        C51657a.m200381a().mo194406a(webView, str);
    }

    @Override // com.ss.android.lark.biz.core.api.ICoreApi
    public void showApplyCollabDialog(Context context, IInitBuilder<IInitBuilder.IApplyCollabDialogBuilder> aVar) {
        C36096a.m141510a().mo130101a(context, aVar);
    }

    @Override // com.ss.android.lark.biz.core.api.ICoreApi
    public void showBlockTipDialog(Context context, IInitBuilder<IInitBuilder.IBlockTipBuilder> aVar) {
        C36096a.m141510a().mo130102b(context, aVar);
    }

    @Override // com.ss.android.lark.biz.core.api.ICoreApi
    public void start(String str, String str2) {
        C51997c.m201743a(str, ChatBundle.SourceType.fromValue(str2));
    }

    @Override // com.ss.android.lark.biz.core.api.ICoreApi
    public void startNotificationSetting(Context context, boolean z) {
        C51907a.m201314a().mo169319a(context, z);
    }

    @Override // com.ss.android.lark.biz.core.api.ICoreApi
    public void startSpan(String str, String str2) {
        C51979h.m201609a(str, str2);
    }

    @Override // com.ss.android.lark.biz.core.api.ICoreApi
    public void switchToOpenSearchTab(Activity activity, String str) {
        C53264a.m205974a().mo181701a(activity, str);
    }

    @Override // com.ss.android.lark.biz.core.api.ICoreApi
    public void uploadGroupAvatar(String str, IGetDataCallback<String> iGetDataCallback) {
        C36084a.m141488a().mo222600a(str, iGetDataCallback);
    }

    @Override // com.ss.android.lark.biz.core.api.ICoreApi
    public void uploadImage(String str, IGetDataCallback<Image> iGetDataCallback) {
        C51854a.m201094a().mo142164a(str, iGetDataCallback);
    }

    @Override // com.ss.android.lark.biz.core.api.ICoreApi
    public boolean canOpenExternal(Context context, Uri uri) {
        return C51707a.m200495a().mo103474b(context, uri);
    }

    @Override // com.ss.android.lark.biz.core.api.ICoreApi
    public boolean changeAppLanguage(Context context, Locale locale) {
        return C36235a.m142710a().mo148282c().mo148292a((Application) context, locale);
    }

    @Override // com.ss.android.lark.biz.core.api.ICoreApi
    public void checkContactRelationShip(String str, IGetDataCallback<UserRelationResponse> iGetDataCallback) {
        C36099a.m141515a().mo130136e().mo130286c(str, iGetDataCallback);
    }

    @Override // com.ss.android.lark.biz.core.api.ICoreApi
    public boolean checkSoNeedUpdate(Context context, String str) {
        return C36136a.m142085a().mo136151a(context).checkSoNeedUpdate(str);
    }

    @Override // com.ss.android.lark.biz.core.api.ICoreApi
    public void closeFriendApplicationBanner(String str, IGetDataCallback<Boolean> iGetDataCallback) {
        C36099a.m141515a().mo130136e().mo130287d(str, iGetDataCallback);
    }

    @Override // com.ss.android.lark.biz.core.api.ICoreApi
    public void fetchUserProfile(String str, IGetDataCallback<ProfileResponse> iGetDataCallback) {
        AbstractC36232b.m142703a().mo178819a().mo180508a(str, iGetDataCallback);
    }

    @Override // com.ss.android.lark.biz.core.api.ICoreApi
    public void fetchUserProfileByIdFromNet(String str, IGetDataCallback<ProfileResponse> iGetDataCallback) {
        AbstractC36232b.m142703a().mo178819a().mo180509b(str, iGetDataCallback);
    }

    @Override // com.ss.android.lark.biz.core.api.ICoreApi
    public void getABExperimentVersion(String str, IGetDataCallback<String> iGetDataCallback) {
        C51677a.m200443a().mo148569c().mo148558a(str, iGetDataCallback);
    }

    @Override // com.ss.android.lark.biz.core.api.ICoreApi
    public <T> T getAbTestValue(Class<? extends AbstractC28490a> cls, boolean z) {
        return (T) C51660a.m200386a().getAbTestValue(cls, z);
    }

    @Override // com.ss.android.lark.biz.core.api.ICoreApi
    public <T extends C41152a> T getAppConfig(String str, AbstractC41160a aVar) {
        return (T) C51677a.m200443a().mo148569c().mo148555a(str, aVar);
    }

    @Override // com.ss.android.lark.biz.core.api.ICoreApi
    public String getEmojiImage(String str, String str2) {
        return C51947a.m201491a().mo181472a().mo105878b(str, str2);
    }

    @Override // com.ss.android.lark.biz.core.api.ICoreApi
    public boolean getLocation(Context context, AbstractC41567g.AbstractC41568a aVar) {
        return MapModuleProvider.m201088a().getLocation(context, aVar);
    }

    @Override // com.ss.android.lark.biz.core.api.ICoreApi
    public String getReactionImage(String str, String str2) {
        return C51947a.m201491a().mo181472a().mo105865a(str, str2);
    }

    @Override // com.ss.android.lark.biz.core.api.ICoreApi
    public void goContactsGroupActivity(Context context, String str) {
        C36099a.m141515a().mo130130b().mo130271b(context, str);
    }

    @Override // com.ss.android.lark.biz.core.api.ICoreApi
    public void goImageForwardSelectPage(Context context, String str) {
        C51838a.m200992a().mo140423a(context, str);
    }

    @Override // com.ss.android.lark.biz.core.api.ICoreApi
    public void goShareForwardSelectPage(Context context, ShareTextForwardData shareTextForwardData) {
        C51838a.m200992a().mo140399a(context, shareTextForwardData);
    }

    @Override // com.ss.android.lark.biz.core.api.ICoreApi
    public void initLanguageModule(Application application, AbstractC29540ab abVar) {
        C36235a.m142710a().mo148282c().mo148288a(application, abVar);
    }

    @Override // com.ss.android.lark.biz.core.api.ICoreApi
    public boolean isInHouse(double d, double d2) {
        return MapModuleProvider.m201088a().isInHouse(d, d2);
    }

    @Override // com.ss.android.lark.biz.core.api.ICoreApi
    public boolean isSameWithSetting(Locale locale, Locale locale2) {
        return C36235a.m142710a().mo148282c().mo148294a(locale, locale2);
    }

    @Override // com.ss.android.lark.biz.core.api.ICoreApi
    public void loadAppConfig(boolean z, IGetDataCallback<AppConfig> iGetDataCallback) {
        C51804b.m200825a().mo148365b().mo148370a(z, iGetDataCallback);
    }

    @Override // com.ss.android.lark.biz.core.api.ICoreApi
    public double[] obtainGCJLatLng(double d, double d2) {
        return MapModuleProvider.m201088a().obtainGCJLatLng(d, d2);
    }

    @Override // com.ss.android.lark.biz.core.api.ICoreApi
    public void openAppLinkUrl(Context context, String str) {
        C51707a.m200495a().mo103471b(context, str, 0);
    }

    @Override // com.ss.android.lark.biz.core.api.ICoreApi
    public boolean openCustomUrl(Context context, String str) {
        return BrowserModuleProvider.m200667a().mo106857b(context, str);
    }

    @Override // com.ss.android.lark.biz.core.api.ICoreApi
    public void openFeedMessageFilterSettingPage(Context context, int i) {
        SettingModuleProvider.f129183h.mo178263a().mo185201a(context, i);
    }

    @Override // com.ss.android.lark.biz.core.api.ICoreApi
    public void openFeedMessageFilterSortPage(Context context, int i) {
        SettingModuleProvider.f129183h.mo178263a().mo185214b(context, i);
    }

    @Override // com.ss.android.lark.biz.core.api.ICoreApi
    public void openLanguageSettingPage(Context context, Bundle bundle) {
        SettingModuleProvider.f129183h.mo178263a().mo185202a(context, bundle);
    }

    @Override // com.ss.android.lark.biz.core.api.ICoreApi
    public void openUrl(Context context, String str) {
        BrowserModuleProvider.m200667a().mo106842a(context, str);
    }

    @Override // com.ss.android.lark.biz.core.api.ICoreApi
    public boolean parseQRCode(Context context, String str) {
        return C51931a.m201432a().mo180844a(str, context);
    }

    @Override // com.ss.android.lark.biz.core.api.ICoreApi
    public <T extends Notice, R extends C48499a> void registerNotification(int i, AbstractNotification<T, R> abstractNotification) {
        C51907a.m201314a().mo169323d().mo169513a(i, abstractNotification);
    }

    @Override // com.ss.android.lark.biz.core.api.ICoreApi
    public void removeDownloadTask(String str, String str2) {
        C51816a.m200873a().mo135983b().mo105819a(str, str2);
    }

    @Override // com.ss.android.lark.biz.core.api.ICoreApi
    public Context setContextLocale(Context context, Locale locale) {
        return C36235a.m142710a().mo148282c().mo148295b(context, locale);
    }

    @Override // com.ss.android.lark.biz.core.api.ICoreApi
    public void setTargetDepartmentId(String str, String str2) {
        C36099a.m141515a().mo130135d().mo130292e().mo105784a(str, str2);
    }

    @Override // com.ss.android.lark.biz.core.api.ICoreApi
    public void showChatInputTip(View view, int i) {
        C57397a.m222529a().mo141241e().mo141297a(view, i);
    }

    @Override // com.ss.android.lark.biz.core.api.ICoreApi
    public void startAppProfileByBotId(Context context, String str) {
        AbstractC36232b.m142703a().mo178821b().mo105585c(context, str);
    }

    @Override // com.ss.android.lark.biz.core.api.ICoreApi
    public boolean startGuide(String str, C38708a aVar) {
        return C57480a.m223132a().mo141819a(str, aVar);
    }

    @Override // com.ss.android.lark.biz.core.api.ICoreApi
    public boolean startGuides(List<String> list, C38708a aVar) {
        return C57480a.m223132a().mo141820a(list, aVar);
    }

    @Override // com.ss.android.lark.biz.core.api.ICoreApi
    public void startSelectMyGroupActivity(Context context, Message message) {
        C36099a.m141515a().mo130130b().mo130267a(context, message);
    }

    @Override // com.ss.android.lark.biz.core.api.ICoreApi
    public void syncMainDomainSessionCookie(boolean z, int i) {
        BrowserModuleProvider.m200667a().mo106851a(z, i);
    }

    @Override // com.ss.android.lark.biz.core.api.ICoreApi
    public Intent getLaunchMainWindowIntent(Context context, String str) {
        return C36149a.m142162a().mo157098b().mo105697a(context, str);
    }

    @Override // com.ss.android.lark.biz.core.api.ICoreApi
    public AbstractC41583b getLocationClient(Context context, LocationClientConfig locationClientConfig) {
        return MapModuleProvider.m201088a().getLocationClient(context, locationClientConfig);
    }

    @Override // com.ss.android.lark.biz.core.api.ICoreApi
    public void launchMainWindow(Context context, String str) {
        C36149a.m142162a().mo157098b().mo105706b(context, str);
    }

    @Override // com.ss.android.lark.biz.core.api.ICoreApi
    public void asyncTraceBegin(long j, String str, int i) {
        C51984k.m201633a(j, str, i);
    }

    @Override // com.ss.android.lark.biz.core.api.ICoreApi
    public void asyncTraceEnd(long j, String str, int i) {
        C51984k.m201638b(j, str, i);
    }

    @Override // com.ss.android.lark.biz.core.api.ICoreApi
    public void beginSection(String str, String str2, int i) {
        C51995b.m201718a(str, str2, i);
    }

    @Override // com.ss.android.lark.biz.core.api.ICoreApi
    public void handleSwitchTenant(Context context, Intent intent, String str) {
        OfflinePushClickHandler.m201275a(context, intent, str);
    }

    @Override // com.ss.android.lark.biz.core.api.ICoreApi
    public void fillTenantBadge(List<TenantInfo> list, List<TenantInfo.PendingUser> list2, IGetDataCallback<List<TenantInfo>> iGetDataCallback) {
        C36149a.m142162a().mo157094a(list, list2, iGetDataCallback);
    }

    @Override // com.ss.android.lark.biz.core.api.ICoreApi
    public void forwardWithTemplate(Context context, ForwardTemplate forwardTemplate, int i) {
        C51838a.m200992a().mo140421a(context, forwardTemplate, i);
    }

    @Override // com.ss.android.lark.biz.core.api.ICoreApi
    public ForwardTemplate getForwardTemplate(Context context, com.ss.android.lark.chat.entity.message.Message message, ShareModel shareModel) {
        return ShareForwardTemplateFactory.m151836a(context, message, shareModel);
    }

    @Override // com.ss.android.lark.biz.core.api.ICoreApi
    public void goCalendarShareSelectPage(Context context, CalendarForwardData calendarForwardData, int i) {
        C51838a.m200992a().mo140419a(context, calendarForwardData, i);
    }

    @Override // com.ss.android.lark.biz.core.api.ICoreApi
    public void goCalendarTransferSelectPage(Context context, CalendarForwardData calendarForwardData, int i) {
        C51838a.m200992a().mo140431b(context, calendarForwardData, i);
    }

    @Override // com.ss.android.lark.biz.core.api.ICoreApi
    public void goGroupShareForwardSelectPage(Context context, ShareDataForwardData shareDataForwardData, int i) {
        C51838a.m200992a().mo140398a(context, shareDataForwardData, i);
    }

    @Override // com.ss.android.lark.biz.core.api.ICoreApi
    public void goShareVideoMeeting(Context context, String str, String str2) {
        C51838a.m200992a().mo140427a(context, str, str2);
    }

    @Override // com.ss.android.lark.biz.core.api.ICoreApi
    public void goStickerForwardSelectPage(Context context, String str, StickerContent stickerContent) {
        C51838a.m200992a().mo140425a(context, str, stickerContent);
    }

    @Override // com.ss.android.lark.biz.core.api.ICoreApi
    public void gotoShareForwardSelectPage(Context context, com.ss.android.lark.chat.entity.message.Message message, ShareModel shareModel) {
        C51838a.m200992a().mo140407a(context, message, shareModel);
    }

    @Override // com.ss.android.lark.biz.core.api.ICoreApi
    public void openInternal(Context context, String str, int i) {
        C51707a.m200495a().mo103471b(context, str, i);
    }

    @Override // com.ss.android.lark.biz.core.api.ICoreApi
    public void openInviteExternalPage(Context context, String str, boolean z) {
        C57532a.m223304a().openInviteExternalPage(context, str, z);
    }

    @Override // com.ss.android.lark.biz.core.api.ICoreApi
    public void openInviteMemberGuidePage(Context context, String str, Bundle bundle) {
        C57532a.m223304a().openInviteMemberGuidePage(context, str, bundle);
    }

    @Override // com.ss.android.lark.biz.core.api.ICoreApi
    public void openLKPUrl(Context context, String str, int i) {
        BrowserModuleProvider.m200667a().mo106843a(context, str, i);
    }

    @Override // com.ss.android.lark.biz.core.api.ICoreApi
    public void openUpgradeTeamPage(Activity activity, String str, String str2) {
        C57397a.m222529a().mo141237a(activity, str, str2);
    }

    @Override // com.ss.android.lark.biz.core.api.ICoreApi
    public void openWelcomeToLarkPage(Context context, String str, Bundle bundle) {
        C57532a.m223304a().openWelcomeToLarkPage(context, str, bundle);
    }

    @Override // com.ss.android.lark.biz.core.api.ICoreApi
    public void setupBadge(LKUIBadgeView lKUIBadgeView, int i, boolean z) {
        C36149a.m142162a().mo157085a(lKUIBadgeView, i, z);
    }

    @Override // com.ss.android.lark.biz.core.api.ICoreApi
    public void startChatImageResourceActivity(Context context, String str, boolean z) {
        C53264a.m205974a().mo181707a(context, str, z);
    }

    @Override // com.ss.android.lark.biz.core.api.ICoreApi
    public void agreeChatApplication(String str, boolean z, IGetDataCallback<Boolean> iGetDataCallback) {
        C36099a.m141515a().mo130136e().mo130278a(str, z, iGetDataCallback);
    }

    @Override // com.ss.android.lark.biz.core.api.ICoreApi
    public boolean canOpenInternal(Context context, String str, int i) {
        return C51707a.m200495a().mo103469a(context, str, i);
    }

    @Override // com.ss.android.lark.biz.core.api.ICoreApi
    public PendingIntent getCommonNotificationIntent(com.ss.android.lark.chat.entity.message.Message message, boolean z, boolean z2) {
        return C51907a.m201314a().mo169324e().mo105559a(message, z, z2);
    }

    @Override // com.ss.android.lark.biz.core.api.ICoreApi
    public void getExternalContactAuth(List<String> list, int i, IGetDataCallback<Map<String, Integer>> iGetDataCallback) {
        C36099a.m141515a().mo130136e().mo130279a(list, i, iGetDataCallback);
    }

    @Override // com.ss.android.lark.biz.core.api.ICoreApi
    public Fragment getForwardPickFragment(Context context, Bundle bundle, Chat chat) {
        return C51838a.m200992a().mo140392a(context, bundle, chat);
    }

    @Override // com.ss.android.lark.biz.core.api.ICoreApi
    public Intent getLaunchMainWindowIntent(Context context, Bundle bundle, int i) {
        return C36149a.m142162a().mo157098b().mo105696a(context, bundle, i);
    }

    @Override // com.ss.android.lark.biz.core.api.ICoreApi
    public String getResUrlByResKey(String str, int i, int i2) {
        return C51947a.m201491a().mo181472a().mo105864a(str, i, i2);
    }

    @Override // com.ss.android.lark.biz.core.api.ICoreApi
    public void goGroupShareForwardSelectPage(Context context, Chat chat, int i) {
        C51838a.m200992a().mo140401a(context, chat, i);
    }

    @Override // com.ss.android.lark.biz.core.api.ICoreApi
    public Fragment newContactMobileFragment(ContactMobileApi.ContactType contactType, ContactMobileApi.C35402a aVar, String str) {
        return C36099a.m141515a().mo130137f().mo130575a(ContactMobileApi.ContactType.PHONE, aVar, str);
    }

    @Override // com.ss.android.lark.biz.core.api.ICoreApi
    public void openLocalFileDetail(Context context, FileContent fileContent, boolean z) {
        C36083a.m141486a().getMigrateTempDependency().mo132979a(context, fileContent, z);
    }

    @Override // com.ss.android.lark.biz.core.api.ICoreApi
    public void openSettingTeamName(Context context, String str, String str2) {
        C57397a.m222529a().mo141240c().mo141343a(context, str, str2);
    }

    @Override // com.ss.android.lark.biz.core.api.ICoreApi
    public void setEnv(int i, String str, IGetDataCallback<Boolean> iGetDataCallback) {
        C52066a.m201979a().mo201661b().mo201663a(i, str, iGetDataCallback);
    }

    @Override // com.ss.android.lark.biz.core.api.ICoreApi
    public void setupBlockUser(String str, boolean z, IGetDataCallback<Boolean> iGetDataCallback) {
        C36099a.m141515a().mo130136e().mo130283b(str, z, iGetDataCallback);
    }

    @Override // com.ss.android.lark.biz.core.api.ICoreApi
    public void showCreateNewCalendarTipIfNeed(Activity activity, View view, View.OnClickListener onClickListener) {
        C57397a.m222529a().mo141241e().mo141292a(activity, view, onClickListener);
    }

    @Override // com.ss.android.lark.biz.core.api.ICoreApi
    public void startScanQRCodeActivity(Context context, int[] iArr, IQRCodeScanResultHandler iQRCodeScanResultHandler) {
        C51931a.m201432a().mo180841a(context, iArr, iQRCodeScanResultHandler);
    }

    @Override // com.ss.android.lark.biz.core.api.ICoreApi
    public void startSelectedConfirm(Activity activity, List<SelectedData> list, int i) {
        C36099a.m141515a().mo130130b().mo130266a(activity, list, i);
    }

    @Override // com.ss.android.lark.biz.core.api.ICoreApi
    public void goImageForwardSelectPage(Context context, String str, int i) {
        C51838a.m200992a().mo140424a(context, str, i);
    }

    @Override // com.ss.android.lark.biz.core.api.ICoreApi
    public void openUrl(Context context, String str, UrlParams urlParams) {
        BrowserModuleProvider.m200667a().mo106854b(context, str, urlParams);
    }

    @Override // com.ss.android.lark.biz.core.api.ICoreApi
    public void startSelectedConfirm(Fragment fragment, List<SelectedData> list, int i) {
        C36099a.m141515a().mo130130b().mo130270a(fragment, list, i);
    }

    @Override // com.ss.android.lark.biz.core.api.ICoreApi
    public Intent getLaunchMainWindowIntent(Context context, String str, Bundle bundle) {
        return C36149a.m142162a().mo157098b().mo105698a(context, str, bundle);
    }

    @Override // com.ss.android.lark.biz.core.api.ICoreApi
    public void gotoShareForwardSelectPage(Activity activity, String str, ShareModel shareModel) {
        com.ss.android.lark.chat.entity.message.Message message = new com.ss.android.lark.chat.entity.message.Message();
        message.setType(Message.Type.TEXT);
        TextContent textContent = new TextContent();
        textContent.setRichText(C59029c.m229161b(str));
        message.setMessageContent(textContent);
        C51838a.m200992a().mo140407a(activity, message, shareModel);
    }

    @Override // com.ss.android.lark.biz.core.api.ICoreApi
    public void launchMainWindow(Context context, String str, Bundle bundle) {
        C36149a.m142162a().mo157098b().mo105707b(context, str, bundle);
    }

    @Override // com.ss.android.lark.biz.core.api.ICoreApi
    public void generateDefaultDrawable(Context context, int i, float f, IGetDataCallback<Drawable> iGetDataCallback) {
        C51689a.m200461a().mo197364a(context, i, f, iGetDataCallback);
    }

    @Override // com.ss.android.lark.biz.core.api.ICoreApi
    public void goChatForwardSelectPage(Context context, FavoriteForwardData favoriteForwardData, int i, int i2) {
        C51838a.m200992a().mo140395a(context, favoriteForwardData, i, i2);
    }

    @Override // com.ss.android.lark.biz.core.api.ICoreApi
    public void goShareThreadTopicSelectPage(Context context, com.ss.android.lark.chat.entity.message.Message message, String str, String str2) {
        C51838a.m200992a().mo140408a(context, message, str, str2);
    }

    @Override // com.ss.android.lark.biz.core.api.ICoreApi
    public void goTodoShareSelectPage(Context context, C36516a<?> aVar, TodoForwardData todoForwardData, int i) {
        C51838a.m200992a().mo140418a(context, aVar, todoForwardData, i);
    }

    @Override // com.ss.android.lark.biz.core.api.ICoreApi
    public void loadEncryptImage(Context context, ImageView imageView, String str, LoadParams loadParams) {
        C51854a.m201094a().mo142157a(context, imageView, str, loadParams);
    }

    @Override // com.ss.android.lark.biz.core.api.ICoreApi
    public void loadLocalOrUrlImage(Context context, ImageView imageView, String str, LoadParams loadParams) {
        C51854a.m201094a().mo142168b(context, imageView, str, loadParams);
    }

    @Override // com.ss.android.lark.biz.core.api.ICoreApi
    public void loadTabConfig(boolean z, String str, String str2, IGetDataCallback<Boolean> iGetDataCallback) {
        C36149a.m142162a().mo157096a(z, str, str2, iGetDataCallback);
    }

    @Override // com.ss.android.lark.biz.core.api.ICoreApi
    public void openChatInternalSearchPage(Context context, String str, boolean z, boolean z2) {
        C53264a.m205974a().mo181708a(context, str, z, z2);
    }

    @Override // com.ss.android.lark.biz.core.api.ICoreApi
    public void openInviteParentChannel(Context context, String str, String str2, InvitationSource invitationSource) {
        C57532a.m223304a().openInviteParentChannel(context, str, str2, invitationSource);
    }

    @Override // com.ss.android.lark.biz.core.api.ICoreApi
    public void openPickChatFilterPageFromDoc(Activity activity, ArrayList<String> arrayList, String str, int i) {
        C53264a.m205974a().mo181712b(activity, arrayList, str, i);
    }

    @Override // com.ss.android.lark.biz.core.api.ICoreApi
    public void openPickChatterFilterPageFromDoc(Activity activity, ArrayList<String> arrayList, String str, int i) {
        C53264a.m205974a().mo181702a(activity, arrayList, str, i);
    }

    @Override // com.ss.android.lark.biz.core.api.ICoreApi
    public void openSearchMainPageFromAppCenter(Context context, String str, String str2, int i) {
        C53264a.m205974a().mo181719f(context, str, str2, i);
    }

    @Override // com.ss.android.lark.biz.core.api.ICoreApi
    public void openSearchMainPageFromCalendar(Context context, String str, String str2, int i) {
        C53264a.m205974a().mo181718e(context, str, str2, i);
    }

    @Override // com.ss.android.lark.biz.core.api.ICoreApi
    public void openSearchMainPageFromFeed(Context context, String str, String str2, int i) {
        C53264a.m205974a().mo181717d(context, str, str2, i);
    }

    @Override // com.ss.android.lark.biz.core.api.ICoreApi
    public void openSearchMainPageFromLynxCard(Context context, String str, String str2, int i) {
        C53264a.m205974a().mo181724k(context, str, str2, i);
    }

    @Override // com.ss.android.lark.biz.core.api.ICoreApi
    public void openSearchMainPageFromMsgMenu(Context context, String str, String str2, int i) {
        C53264a.m205974a().mo181723j(context, str, str2, i);
    }

    @Override // com.ss.android.lark.biz.core.api.ICoreApi
    public void openSearchMainPageFromPin(Activity activity, String str, String str2, int i) {
        C53264a.m205974a().mo181715c(activity, str, str2, i);
    }

    @Override // com.ss.android.lark.biz.core.api.ICoreApi
    public void openSearchMainPageFromSpace(Context context, String str, String str2, int i) {
        C53264a.m205974a().mo181720g(context, str, str2, i);
    }

    @Override // com.ss.android.lark.biz.core.api.ICoreApi
    public void openSearchMainPageFromThread(Context context, String str, String str2, int i) {
        C53264a.m205974a().mo181722i(context, str, str2, i);
    }

    @Override // com.ss.android.lark.biz.core.api.ICoreApi
    public void openSearchMainPageFromTodo(Context context, String str, String str2, int i) {
        C53264a.m205974a().mo181706a(context, str, str2, i);
    }

    @Override // com.ss.android.lark.biz.core.api.ICoreApi
    public void openSearchMainPageFromWiki(Context context, String str, String str2, int i) {
        C53264a.m205974a().mo181721h(context, str, str2, i);
    }

    @Override // com.ss.android.lark.biz.core.api.ICoreApi
    public void previewChatterAvatar(Context context, String str, String str2, View view) {
        C36084a.m141488a().mo222593a(context, str, str2, view);
    }

    @Override // com.ss.android.lark.biz.core.api.ICoreApi
    public void previewTopicGroupAvatar(Context context, String str, String str2, ImageView imageView) {
        C36084a.m141488a().mo222597a(context, str, str2, imageView);
    }

    @Override // com.ss.android.lark.biz.core.api.ICoreApi
    public void registerScenario(String str, Map<String, String> map, MagicViewContainer awVar, AbstractC29588w wVar) {
        C57503a.m223196a().mo149985a(str, map, awVar, wVar);
    }

    @Override // com.ss.android.lark.biz.core.api.ICoreApi
    public void createStore(Context context, String str, String str2, String str3) {
        new C51858b().mo178027a(context, str, str2, str3);
    }

    @Override // com.ss.android.lark.biz.core.api.ICoreApi
    public Bitmap encodeQRCode(String str, int i, int i2, int i3) {
        return C51931a.m201432a().mo180837a(str, i, i2, i3);
    }

    @Override // com.ss.android.lark.biz.core.api.ICoreApi
    public void getAuthChatter(int i, List<String> list, String str, IGetDataCallback<Map<String, Integer>> iGetDataCallback) {
        C36099a.m141515a().mo130136e().mo130276a(i, list, str, iGetDataCallback);
    }

    @Override // com.ss.android.lark.biz.core.api.ICoreApi
    public String getAvatarPath(String str, String str2, int i, float f) {
        return C51947a.m201491a().mo181472a().mo105866a(str, str2, i, f);
    }

    @Override // com.ss.android.lark.biz.core.api.ICoreApi
    public void putSearchFeedBack(String str, Scene scene, List<C53892a> list, IGetDataCallback<Void> iGetDataCallback) {
        C53264a.m205974a().mo181714c().mo181833a(str, scene, list, iGetDataCallback);
    }

    @Override // com.ss.android.lark.biz.core.api.ICoreApi
    public void searchDocForChat(String str, int i, int i2, IGetDataCallback<SearchResponse> iGetDataCallback) {
        C53264a.m205974a().mo181714c().mo181832a(str, i, i2, iGetDataCallback);
    }

    @Override // com.ss.android.lark.biz.core.api.ICoreApi
    public void searchHelpDesks(String str, int i, int i2, IGetDataCallback<SearchResponse> iGetDataCallback) {
        C53264a.m205974a().mo181714c().mo181836b(str, i, i2, iGetDataCallback);
    }

    @Override // com.ss.android.lark.biz.core.api.ICoreApi
    public void sendMessage(String str, String str2, Map<String, String> map, IGetDataCallback<String> iGetDataCallback) {
        C51838a.m200992a();
        C38364a.m151054a().mo140442d().mo140483a(str, str2, map, iGetDataCallback);
    }

    @Override // com.ss.android.lark.biz.core.api.ICoreApi
    public void startNameCardProfile(Context context, String str, String str2, ContactSource contactSource) {
        AbstractC36232b.m142703a().mo178821b().mo105583b(context, str, str2, contactSource);
    }

    @Override // com.ss.android.lark.biz.core.api.ICoreApi
    public void startPicker(Context context, FilePickerLaunchParams fVar, C36516a aVar, boolean z) {
        FilePickerModuleProvider.f128779a.mo177952a().mo139540a(fVar, aVar, DesktopUtil.m144301a(context));
    }

    @Override // com.ss.android.lark.biz.core.api.ICoreApi
    public void startUserProfile(Context context, String str, String str2, ContactSource contactSource) {
        AbstractC36232b.m142703a().mo178821b().mo105573a(context, str, str2, contactSource);
    }

    @Override // com.ss.android.lark.biz.core.api.ICoreApi
    public void checkFileState(String str, String str2, int i, IGetDataCallback<FileState> iGetDataCallback) {
        C51816a.m200873a().mo135982a().mo105832a(str, str2, i, iGetDataCallback);
    }

    @Override // com.ss.android.lark.biz.core.api.ICoreApi
    public String getResUrlByResKey(String str, String str2, int i, int i2) {
        return C51947a.m201491a().mo181472a().mo105867a(str, str2, i, i2);
    }

    @Override // com.ss.android.lark.biz.core.api.ICoreApi
    public void goChatForwardSelectPage(Context context, com.ss.android.lark.chat.entity.message.Message message, int i, String str) {
        C51838a.m200992a().mo140404a(context, message, i, str);
    }

    @Override // com.ss.android.lark.biz.core.api.ICoreApi
    public void startScanQRCodeActivity(Context context, int[] iArr, IQRCodeScanResultHandler iQRCodeScanResultHandler, AbstractC29569m mVar) {
        C51931a.m201432a().mo180842a(context, iArr, iQRCodeScanResultHandler, mVar);
    }

    @Override // com.ss.android.lark.biz.core.api.ICoreApi
    public void openUrl(Context context, String str, UrlParams urlParams, Map<String, String> map) {
        BrowserModuleProvider.m200667a().mo106844a(context, str, urlParams, map);
    }

    @Override // com.ss.android.lark.biz.core.api.ICoreApi
    public void report(String str, Map<String, Float> map, Map<String, String> map2, Map<String, String> map3, boolean z) {
        C51970d.m201580a(str, map, map2, map3, z);
    }

    @Override // com.ss.android.lark.biz.core.api.ICoreApi
    public void addCustomViewAppFloat(Drawable drawable, int[] iArr, String str, int i, Runnable runnable) {
        C48282c.m190475a().mo169058a(drawable, iArr, str, i, runnable);
    }

    @Override // com.ss.android.lark.biz.core.api.ICoreApi
    public void checkFileState(String str, String str2, int i, int i2, IGetDataCallback<FileState> iGetDataCallback) {
        C51816a.m200873a().mo135982a().mo105832a(str, str2, i2, iGetDataCallback);
    }

    @Override // com.ss.android.lark.biz.core.api.ICoreApi
    public void goChatForwardSelectPage(Context context, FavoriteForwardData favoriteForwardData, int i, String str, int i2) {
        C51838a.m200992a().mo140396a(context, favoriteForwardData, i, str, i2);
    }

    @Override // com.ss.android.lark.biz.core.api.ICoreApi
    public void goInviteInactiveParentListActivity(Context context, String str, String str2, String str3, int i) {
        C36099a.m141515a().mo130126a(context, str, str2, str3, i);
    }

    @Override // com.ss.android.lark.biz.core.api.ICoreApi
    public void goMomentsPostShareSelectPage(Context context, String str, String str2, int i, int i2) {
        C51838a.m200992a().mo140428a(context, str, str2, i, i2);
    }

    @Override // com.ss.android.lark.biz.core.api.ICoreApi
    public void loadAvatarImage(Context context, ImageView imageView, String str, String str2, LoadParams loadParams) {
        C51854a.m201094a().mo142158a(context, imageView, str, str2, loadParams);
    }

    @Override // com.ss.android.lark.biz.core.api.ICoreApi
    public void openChatInternalSearchPage(Context context, String str, boolean z, boolean z2, int i) {
        C53264a.m205974a().mo181709a(context, str, z, z2, i);
    }

    @Override // com.ss.android.lark.biz.core.api.ICoreApi
    public void openGetPhotoMenu(Fragment fragment, Activity activity, ImageView imageView, int i, String str) {
        C36084a.m141488a().mo222599a(fragment, activity, imageView, i, str);
    }

    @Override // com.ss.android.lark.biz.core.api.ICoreApi
    public void previewGroupAvatar(Context context, String str, String str2, String str3, View view) {
        C36084a.m141488a().mo222598a(context, str, str2, str3, view);
    }

    @Override // com.ss.android.lark.biz.core.api.ICoreApi
    public void sendTranslateRequest(String str, String str2, String[] strArr, ContentType contentType, IGetDataCallback<List<String>> iGetDataCallback) {
        SettingModuleProvider.f129183h.mo178263a().mo185207a(str, str2, strArr, contentType, iGetDataCallback);
    }

    @Override // com.ss.android.lark.biz.core.api.ICoreApi
    public void asyncGetAvatarPath(String str, String str2, int i, float f, IGetDataCallback<String> iGetDataCallback) {
        C51947a.m201491a().mo181472a().mo105873a(str, str2, i, f, iGetDataCallback);
    }

    @Override // com.ss.android.lark.biz.core.api.ICoreApi
    public void cancelDownloadMessageFile(String str, String str2, String str3, int i, IGetDataCallback<Boolean> iGetDataCallback) {
        C51816a.m200873a().mo135982a().mo105835a(str, str2, str3, i, iGetDataCallback);
    }

    @Override // com.ss.android.lark.biz.core.api.ICoreApi
    public void downloadImage(List<String> list, List<String> list2, int i, int i2, IGetDataCallback<List<Bitmap>> iGetDataCallback) {
        C53264a.m205974a();
        C53258a.m205939a().mo181758g().mo181807a(list, list2, i, i2, iGetDataCallback);
    }

    @Override // com.ss.android.lark.biz.core.api.ICoreApi
    public void sendNotificationShowEvent(String str, String str2, long j, String str3, String str4) {
        C51907a.m201314a().mo169325f().mo105364a(str, str2, System.currentTimeMillis(), str3, str4);
    }

    @Override // com.ss.android.lark.biz.core.api.ICoreApi
    public void showClickAvatarTip(View view, Activity activity, String str, String str2, View.OnClickListener onClickListener) {
        C57397a.m222529a().mo141241e().mo141295a(view, activity, str, str2, onClickListener);
    }

    @Override // com.ss.android.lark.biz.core.api.ICoreApi
    public void showTenantPickTip(View view, Rect rect, String str, String str2, View.OnClickListener onClickListener) {
        C57397a.m222529a().mo141241e().mo141296a(view, rect, str, str2, onClickListener);
    }

    @Override // com.ss.android.lark.biz.core.api.ICoreApi
    public void traceNotificationShow(String str, String str2, long j, String str3, String str4) {
        C51907a.m201314a().mo169325f().mo105364a(str, str2, j, str3, str4);
    }

    @Override // com.ss.android.lark.biz.core.api.ICoreApi
    public void openUrl(Context context, String str, UrlParams urlParams, Map<String, String> map, Map<String, String> map2) {
        BrowserModuleProvider.m200667a().mo106845a(context, str, urlParams, map, map2);
    }

    @Override // com.ss.android.lark.biz.core.api.ICoreApi
    public void goChatForwardSelectPage(Context context, com.ss.android.lark.chat.entity.message.Message message, String str, String str2, String str3) {
        C51838a.m200992a().mo140409a(context, message, str, str2, str3);
    }

    @Override // com.ss.android.lark.biz.core.api.ICoreApi
    public void compressImage(Context context, File file, boolean z, IGetDataCallback<C29548at> iGetDataCallback, Biz biz, com.ss.android.lark.appreciablelib.Scene scene) {
        C51854a.m201094a().mo142160a(context, file, z, iGetDataCallback, biz, scene);
    }

    @Override // com.ss.android.lark.biz.core.api.ICoreApi
    public void forwardWithTemplateFromFragment(Context context, C36516a aVar, ForwardTemplate forwardTemplate, int i, int[] iArr, int[] iArr2) {
        C51838a.m200992a().mo140430b(context, aVar, forwardTemplate, i, iArr, iArr2);
    }

    @Override // com.ss.android.lark.biz.core.api.ICoreApi
    public void goShareFileCopySelectPage(Context context, String str, String str2, long j, boolean z, String str3) {
        C51838a.m200992a().mo140429a(context, str, str2, j, z, str3);
    }

    @Override // com.ss.android.lark.biz.core.api.ICoreApi
    public void previewMomentsProfileBackground(Context context, String str, String str2, View view, String str3, String str4) {
        C36084a.m141488a().mo222596a(context, str, str2, view, str3, str4);
    }

    @Override // com.ss.android.lark.biz.core.api.ICoreApi
    public void selectTargetsForForwardingMailToChat(Context context, int i, Bundle bundle, int i2, String str, String str2) {
        C51838a.m200992a().mo140394a(context, i, bundle, i2, str, str2);
    }

    @Override // com.ss.android.lark.biz.core.api.ICoreApi
    public void uploadEncryptImage(Context context, String str, boolean z, boolean z2, AbstractC25974h hVar, IGetDataCallback<EncryptImageData> iGetDataCallback) {
        C51854a.m201094a().mo142163a(context, str, z, z2, hVar, iGetDataCallback);
    }

    @Override // com.ss.android.lark.biz.core.api.ICoreApi
    public void downloadImageAsync(Context context, String str, Object obj, int i, int i2, IGetDataCallback<File> iGetDataCallback) {
        C51854a.m201094a().mo142161a(LarkContext.getApplication(), str, obj, i, i2, iGetDataCallback);
    }

    @Override // com.ss.android.lark.biz.core.api.ICoreApi
    public void searchPinMessages(String str, String str2, long j, String str3, int i, IGetDataCallback<SearchResponse> iGetDataCallback) {
        C53264a.m205974a().mo181714c().mo181834a(str, str2, j, str3, i, iGetDataCallback);
    }

    @Override // com.ss.android.lark.biz.core.api.ICoreApi
    public void goChatForwardSelectPage(Context context, com.ss.android.lark.chat.entity.message.Message message, int i, String str, String str2, String str3) {
        C51838a.m200992a().mo140405a(context, message, i, str, str2, str3);
    }

    @Override // com.ss.android.lark.biz.core.api.ICoreApi
    public void goChatForwardSelectPage(Context context, com.ss.android.lark.chat.entity.message.Message message, IForwardSelectListener iForwardSelectListener, String str, String str2, String str3) {
        C51838a.m200992a().mo140406a(context, message, iForwardSelectListener, str, str2, str3);
    }

    @Override // com.ss.android.lark.biz.core.api.ICoreApi
    public File downloadImage(Context context, String str, Object obj, int i, int i2, boolean z, boolean z2) {
        return C51854a.m201094a().mo142154a(context, str, obj, i, i2, z, z2);
    }

    @Override // com.ss.android.lark.biz.core.api.ICoreApi
    public void goThreadForwardSelectPage(Context context, Chat chat, ArrayList<String> arrayList, String str, int i, String str2, String str3) {
        C51838a.m200992a().mo140402a(context, chat, arrayList, str, i, str2, str3);
    }

    @Override // com.ss.android.lark.biz.core.api.ICoreApi
    public Observable<EncryptImageData> uploadEncryptImageV2(Context context, String str, boolean z, boolean z2, AbstractC25974h hVar, Biz biz, com.ss.android.lark.appreciablelib.Scene scene) {
        return C51854a.m201094a().mo142152a(context, str, z, z2, hVar, biz, scene);
    }

    @Override // com.ss.android.lark.biz.core.api.ICoreApi
    public void sendFriendRequest(String str, String str2, String str3, String str4, String str5, ContactSource contactSource, IGetDataCallback<Boolean> iGetDataCallback) {
        C36099a.m141515a().mo130136e().mo130277a(str, str2, str3, str4, str5, contactSource, iGetDataCallback);
    }

    @Override // com.ss.android.lark.biz.core.api.ICoreApi
    public void initDepartmentDetailController(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7) {
        C36099a.m141515a().mo130135d().mo130292e().mo105780a(new DepartmentDetailFragmentBuilder().mo131805j(z).mo105802a(z2).mo105805b(z3).mo105807c(z4).mo105810f(z5).mo105808d(z6).mo105811g(z7));
    }

    @Override // com.ss.android.lark.biz.core.api.ICoreApi
    public void goChatOneByOneForwardSelectPage(Context context, C36516a aVar, Chat chat, ArrayList<String> arrayList, int i, String str, String str2, String str3) {
        C51838a.m200992a().mo140414a(context, aVar, chat, arrayList, i, str, str2, str3);
    }

    @Override // com.ss.android.lark.biz.core.api.ICoreApi
    public IDepartmentDetailFragmentBuilder getDepartmentDetailFragmentBuilder(boolean z, boolean z2, PickType pickType, AbstractC29541ac acVar, boolean z3, boolean z4, boolean z5, Boolean bool) {
        return new DepartmentDetailFragmentBuilder().mo131805j(z).mo105802a(z2).mo105807c(z3).mo105798a(pickType).mo105809e(z4).mo105800a(bool).mo105805b(z5).mo105799a(acVar);
    }

    @Override // com.ss.android.lark.biz.core.api.ICoreApi
    public void downLoadMessageFile(Context context, String str, String str2, String str3, int i, String str4, String str5, IGetDataCallback<String> iGetDataCallback, AbstractC25974h hVar) {
        C51816a.m200873a().mo135982a().mo105828a(context, str, str2, str3, i, str4, str5, iGetDataCallback, hVar);
    }

    @Override // com.ss.android.lark.biz.core.api.ICoreApi
    public void searchUser(String str, String str2, boolean z, boolean z2, int i, int i2, boolean z3, List<ActionType> list, IGetDataCallback<SearchResponse> iGetDataCallback) {
        C53264a.m205974a().mo181714c().mo181835a(str, str2, z, z2, i, i2, z3, list, iGetDataCallback);
    }

    @Override // com.ss.android.lark.biz.core.api.ICoreApi
    public void downLoadMessageVideo(Context context, String str, String str2, String str3, int i, String str4, String str5, IGetDataCallback<String> iGetDataCallback, AbstractC25974h hVar) {
        C51816a.m200873a().mo135982a().mo105838b(context, str, str2, str3, i, str4, str5, iGetDataCallback, hVar);
    }

    @Override // com.ss.android.lark.biz.core.api.ICoreApi
    public void goChatForwardSelectPage(Context context, C36516a aVar, Chat chat, ArrayList<String> arrayList, int i, String str, String str2, boolean z, String str3) {
        C51838a.m200992a().mo140415a(context, aVar, chat, arrayList, i, str, str2, z, str3);
    }

    @Override // com.ss.android.lark.biz.core.api.ICoreApi
    public void downLoadMessageVideo(Context context, String str, String str2, String str3, int i, int i2, String str4, String str5, IGetDataCallback<String> iGetDataCallback, AbstractC25974h hVar) {
        C51816a.m200873a().mo135982a().mo105837b(context, str, str2, str3, i, i2, str4, str5, iGetDataCallback, hVar);
    }
}
