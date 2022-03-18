package com.ss.android.lark.integrator.im;

import android.app.Activity;
import android.app.Dialog;
import android.app.Notification;
import android.app.PendingIntent;
import android.content.ComponentCallbacks2;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.ImageView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import com.bytedance.lark.pb.basic.v1.Chatter;
import com.bytedance.lark.pb.basic.v1.ImageSet;
import com.bytedance.lark.pb.basic.v1.RichTextElement;
import com.bytedance.lark.pb.basic.v1.UniversalUserSetting;
import com.bytedance.lark.pb.im.v1.ContentType;
import com.larksuite.framework.callback.AbstractC25974h;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.http.p1187b.AbstractC25990b;
import com.ss.android.lark.appreciablelib.Biz;
import com.ss.android.lark.appreciablelib.Scene;
import com.ss.android.lark.banner.export.AbstractC29479b;
import com.ss.android.lark.biz.core.api.AbstractC29540ab;
import com.ss.android.lark.biz.core.api.AbstractC29542ad;
import com.ss.android.lark.biz.core.api.AbstractC29543ag;
import com.ss.android.lark.biz.core.api.AbstractC29544ah;
import com.ss.android.lark.biz.core.api.AbstractC29561h;
import com.ss.android.lark.biz.core.api.AbstractC29562i;
import com.ss.android.lark.biz.core.api.AbstractC29572q;
import com.ss.android.lark.biz.core.api.AbstractC29586u;
import com.ss.android.lark.biz.core.api.AbstractC29588w;
import com.ss.android.lark.biz.core.api.AbstractC29589z;
import com.ss.android.lark.biz.core.api.AppConfig;
import com.ss.android.lark.biz.core.api.BadgeStyle;
import com.ss.android.lark.biz.core.api.C29548at;
import com.ss.android.lark.biz.core.api.C29550b;
import com.ss.android.lark.biz.core.api.EncryptImageData;
import com.ss.android.lark.biz.core.api.FavoriteForwardData;
import com.ss.android.lark.biz.core.api.FilePickerLaunchParams;
import com.ss.android.lark.biz.core.api.FileState;
import com.ss.android.lark.biz.core.api.ICoreApi;
import com.ss.android.lark.biz.core.api.IPushAddFriendListener;
import com.ss.android.lark.biz.core.api.LoadParams;
import com.ss.android.lark.biz.core.api.MagicViewContainer;
import com.ss.android.lark.biz.core.api.NetworkLevelListener;
import com.ss.android.lark.biz.core.api.ProfileResponse;
import com.ss.android.lark.biz.core.api.TimeFormatSetting;
import com.ss.android.lark.biz.core.api.UrlParams;
import com.ss.android.lark.biz.core.api.WSConnState;
import com.ss.android.lark.biz.core.api.an;
import com.ss.android.lark.biz.core.api.ao;
import com.ss.android.lark.biz.core.api.ar;
import com.ss.android.lark.biz.core.api.as;
import com.ss.android.lark.biz.core.api.az;
import com.ss.android.lark.biz.core.api.contact.IInitBuilder;
import com.ss.android.lark.biz.core.api.p1402b.AbstractC29551a;
import com.ss.android.lark.biz.core.api.p1404d.AbstractC29555b;
import com.ss.android.lark.biz.core.api.resource.AbstractC29579a;
import com.ss.android.lark.biz.core.api.resource.AbstractC29580b;
import com.ss.android.lark.biz.core.api.resource.AbstractC29581c;
import com.ss.android.lark.biz.core.api.resource.AbstractC29582d;
import com.ss.android.lark.biz.im.api.ChatBundle;
import com.ss.android.lark.chat.api.AbstractC32812c;
import com.ss.android.lark.chat.entity.chat.Chat;
import com.ss.android.lark.chat.entity.keyboard.IPlusItem;
import com.ss.android.lark.chat.entity.message.Message;
import com.ss.android.lark.chat.entity.message.content.ProfileContent;
import com.ss.android.lark.chat.export.ui.message.IOpenMessageCellFactory;
import com.ss.android.lark.contact.entity.SelectedData;
import com.ss.android.lark.contact.entity.UserRelationResponse;
import com.ss.android.lark.desktopmode.p1787a.C36516a;
import com.ss.android.lark.guidemgr.p1935b.p1937b.C38708a;
import com.ss.android.lark.image.entity.Image;
import com.ss.android.lark.integrator.im.dependency.AbstractC39572n;
import com.ss.android.lark.inv.export.api.InvitationServiceApi;
import com.ss.android.lark.larkconfig.export.p2103a.C41152a;
import com.ss.android.lark.larkconfig.export.p2105c.AbstractC41160a;
import com.ss.android.lark.location.p2146b.AbstractC41561d;
import com.ss.android.lark.location.p2146b.AbstractC41562e;
import com.ss.android.lark.location.p2146b.AbstractC41567g;
import com.ss.android.lark.location.p2146b.AbstractC41569h;
import com.ss.android.lark.maincore.AbstractC44544a;
import com.ss.android.lark.maincore.AbstractC44546c;
import com.ss.android.lark.notification.export.AbstractNotification;
import com.ss.android.lark.notification.export.entity.Notice;
import com.ss.android.lark.profile.entity.Profile;
import com.ss.android.lark.searchcommon.dto.C53892a;
import com.ss.android.lark.searchcommon.dto.SearchResponse;
import com.ss.android.lark.searchcommon.service.compatible.ISearchLifecycleObserver;
import com.ss.android.lark.utils.ApiUtils;
import com.ss.android.lark.utils.rxjava.C57865c;
import io.reactivex.Observable;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import okio.ByteString;

/* renamed from: com.ss.android.lark.integrator.im.d */
public class C39557d implements AbstractC39572n {
    @Override // com.ss.android.lark.integrator.im.dependency.AbstractC39572n
    /* renamed from: a */
    public boolean mo143501a(String str) {
        return ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).completeGuide(str);
    }

    @Override // com.ss.android.lark.integrator.im.dependency.AbstractC39572n
    /* renamed from: b */
    public boolean mo143559b(String str) {
        return ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).checkToShow(str);
    }

    @Override // com.ss.android.lark.integrator.im.dependency.AbstractC39572n
    /* renamed from: a */
    public void mo143413a() {
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).guidePrepare();
    }

    @Override // com.ss.android.lark.integrator.im.dependency.AbstractC39572n
    /* renamed from: a */
    public void mo143457a(View view, Activity activity, String str, String str2, View.OnClickListener onClickListener) {
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).showClickAvatarTip(view, activity, str, str2, onClickListener);
    }

    @Override // com.ss.android.lark.integrator.im.dependency.AbstractC39572n
    /* renamed from: a */
    public void mo143455a(View view) {
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).showUpgradeToBigTeamUserTip(view);
    }

    @Override // com.ss.android.lark.integrator.im.dependency.AbstractC39572n
    /* renamed from: b */
    public boolean mo143555b() {
        return ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).isSmartReplyEnabled();
    }

    @Override // com.ss.android.lark.integrator.im.dependency.AbstractC39572n
    /* renamed from: c */
    public boolean mo143569c() {
        return ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).isMessengerSmartComposeEnabled();
    }

    @Override // com.ss.android.lark.integrator.im.dependency.AbstractC39572n
    /* renamed from: a */
    public void mo143462a(IGetDataCallback<TimeFormatSetting> iGetDataCallback) {
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).getTimeFormatFromServer(iGetDataCallback);
    }

    @Override // com.ss.android.lark.integrator.im.dependency.AbstractC39572n
    /* renamed from: a */
    public void mo143470a(ao aoVar) {
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).registerTimeFormatSettingObserver(aoVar);
    }

    @Override // com.ss.android.lark.integrator.im.dependency.AbstractC39572n
    /* renamed from: b */
    public void mo143540b(ao aoVar) {
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).unRegisterTimeFormatSettingObserver(aoVar);
    }

    @Override // com.ss.android.lark.integrator.im.dependency.AbstractC39572n
    /* renamed from: a */
    public boolean mo143503a(boolean z) {
        return ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).isNotificationShowDetail(z);
    }

    @Override // com.ss.android.lark.integrator.im.dependency.AbstractC39572n
    /* renamed from: a */
    public boolean mo143499a(long j) {
        return ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).isInZenMode(j);
    }

    @Override // com.ss.android.lark.integrator.im.dependency.AbstractC39572n
    /* renamed from: a */
    public void mo143423a(Context context, int i) {
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).openFeedMessageFilterSettingPage(context, i);
    }

    @Override // com.ss.android.lark.integrator.im.dependency.AbstractC39572n
    /* renamed from: b */
    public void mo143554b(boolean z) {
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).setIsDingAddressBookOn(z);
    }

    @Override // com.ss.android.lark.integrator.im.dependency.AbstractC39572n
    /* renamed from: b */
    public void mo143532b(IGetDataCallback<List<String>> iGetDataCallback) {
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).pullDingAddressBookInfo(iGetDataCallback);
    }

    @Override // com.ss.android.lark.integrator.im.dependency.AbstractC39572n
    /* renamed from: c */
    public boolean mo143571c(String str) {
        return ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).isVibrateOn(str);
    }

    @Override // com.ss.android.lark.integrator.im.dependency.AbstractC39572n
    /* renamed from: a */
    public void mo143474a(AbstractC29562i iVar) {
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).registerBadgeStyleObserver(iVar);
    }

    @Override // com.ss.android.lark.integrator.im.dependency.AbstractC39572n
    /* renamed from: b */
    public void mo143544b(AbstractC29562i iVar) {
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).unRegisterBadgeStyleObserver(iVar);
    }

    @Override // com.ss.android.lark.integrator.im.dependency.AbstractC39572n
    /* renamed from: a */
    public void mo143480a(AbstractC29589z zVar) {
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).registerNavMuteBadgeObserver(zVar);
    }

    @Override // com.ss.android.lark.integrator.im.dependency.AbstractC39572n
    /* renamed from: b */
    public void mo143548b(AbstractC29589z zVar) {
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).unRegisterNavMuteBadgeObserver(zVar);
    }

    @Override // com.ss.android.lark.integrator.im.dependency.AbstractC39572n
    /* renamed from: a */
    public void mo143471a(ar arVar) {
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).registerZenSettingUpdateObserver(arVar);
    }

    @Override // com.ss.android.lark.integrator.im.dependency.AbstractC39572n
    /* renamed from: b */
    public void mo143541b(ar arVar) {
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).unRegisterZenSettingUpdateObserver(arVar);
    }

    @Override // com.ss.android.lark.integrator.im.dependency.AbstractC39572n
    /* renamed from: a */
    public void mo143495a(String str, String str2, String[] strArr, ContentType contentType, IGetDataCallback<List<String>> iGetDataCallback) {
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).sendTranslateRequest(str, str2, strArr, contentType, iGetDataCallback);
    }

    @Override // com.ss.android.lark.integrator.im.dependency.AbstractC39572n
    /* renamed from: a */
    public void mo143422a(Context context) {
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).goMineTranslationSettingPage(context);
    }

    @Override // com.ss.android.lark.integrator.im.dependency.AbstractC39572n
    /* renamed from: b */
    public boolean mo143557b(Context context) {
        return ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).openUserProtocol(context);
    }

    @Override // com.ss.android.lark.integrator.im.dependency.AbstractC39572n
    /* renamed from: c */
    public boolean mo143570c(Context context) {
        return ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).openPrivacyPolicy(context);
    }

    @Override // com.ss.android.lark.integrator.im.dependency.AbstractC39572n
    /* renamed from: a */
    public void mo143489a(String str, String str2) {
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).sendLinkClickEvent(str, str2);
    }

    @Override // com.ss.android.lark.integrator.im.dependency.AbstractC39572n
    /* renamed from: a */
    public void mo143437a(Context context, String str) {
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).openUrl(context, str);
    }

    @Override // com.ss.android.lark.integrator.im.dependency.AbstractC39572n
    /* renamed from: a */
    public void mo143440a(Context context, String str, UrlParams urlParams) {
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).openUrl(context, str, urlParams);
    }

    @Override // com.ss.android.lark.integrator.im.dependency.AbstractC39572n
    /* renamed from: a */
    public void mo143441a(Context context, String str, UrlParams urlParams, Map<String, String> map) {
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).openUrl(context, str, urlParams, map);
    }

    @Override // com.ss.android.lark.integrator.im.dependency.AbstractC39572n
    /* renamed from: a */
    public void mo143442a(Context context, String str, UrlParams urlParams, Map<String, String> map, Map<String, String> map2) {
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).openUrl(context, str, urlParams, map, map2);
    }

    @Override // com.ss.android.lark.integrator.im.dependency.AbstractC39572n
    /* renamed from: a */
    public void mo143438a(Context context, String str, int i) {
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).openLKPUrl(context, str, i);
    }

    @Override // com.ss.android.lark.integrator.im.dependency.AbstractC39572n
    /* renamed from: a */
    public void mo143465a(AbstractC29540ab abVar) {
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).registerLanguageChangeListener(abVar);
    }

    @Override // com.ss.android.lark.integrator.im.dependency.AbstractC39572n
    /* renamed from: b */
    public void mo143535b(AbstractC29540ab abVar) {
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).unRegisterLanguageChangeListener(abVar);
    }

    @Override // com.ss.android.lark.integrator.im.dependency.AbstractC39572n
    /* renamed from: b */
    public boolean mo143558b(Context context, String str, int i) {
        return ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).canOpenInternal(context, str, i);
    }

    @Override // com.ss.android.lark.integrator.im.dependency.AbstractC39572n
    /* renamed from: a */
    public void mo143498a(boolean z, IGetDataCallback<AppConfig> iGetDataCallback) {
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).loadAppConfig(z, iGetDataCallback);
    }

    @Override // com.ss.android.lark.integrator.im.dependency.AbstractC39572n
    /* renamed from: a */
    public void mo143473a(AbstractC29561h hVar) {
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).addBackToFrontEventListener(hVar);
    }

    @Override // com.ss.android.lark.integrator.im.dependency.AbstractC39572n
    /* renamed from: b */
    public void mo143543b(AbstractC29561h hVar) {
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).removeBackToFrontEventListener(hVar);
    }

    @Override // com.ss.android.lark.integrator.im.dependency.AbstractC39572n
    /* renamed from: a */
    public void mo143447a(Context context, String str, String str2, String str3, int i) {
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).goInviteInactiveParentListActivity(context, str, str2, str3, i);
    }

    @Override // com.ss.android.lark.integrator.im.dependency.AbstractC39572n
    /* renamed from: a */
    public void mo143460a(Fragment fragment, List<SelectedData> list, int i) {
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).startSelectedConfirm(fragment, list, i);
    }

    @Override // com.ss.android.lark.integrator.im.dependency.AbstractC39572n
    /* renamed from: a */
    public void mo143418a(Activity activity, List<SelectedData> list, int i) {
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).startSelectedConfirm(activity, list, i);
    }

    @Override // com.ss.android.lark.integrator.im.dependency.AbstractC39572n
    /* renamed from: a */
    public void mo143467a(AbstractC29543ag agVar) {
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).addPushContactStateListener(agVar);
    }

    @Override // com.ss.android.lark.integrator.im.dependency.AbstractC39572n
    /* renamed from: b */
    public void mo143537b(AbstractC29543ag agVar) {
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).removePushContactStateListener(agVar);
    }

    @Override // com.ss.android.lark.integrator.im.dependency.AbstractC39572n
    /* renamed from: a */
    public void mo143415a(int i, List<String> list, String str, IGetDataCallback<Map<String, Integer>> iGetDataCallback) {
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).getAuthChatter(i, list, str, iGetDataCallback);
    }

    @Override // com.ss.android.lark.integrator.im.dependency.AbstractC39572n
    /* renamed from: a */
    public void mo143427a(Context context, IInitBuilder<IInitBuilder.IApplyCollabDialogBuilder> aVar) {
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).showApplyCollabDialog(context, aVar);
    }

    @Override // com.ss.android.lark.integrator.im.dependency.AbstractC39572n
    /* renamed from: a */
    public void mo143497a(String str, boolean z, IGetDataCallback<Boolean> iGetDataCallback) {
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).setupBlockUser(str, z, iGetDataCallback);
    }

    @Override // com.ss.android.lark.integrator.im.dependency.AbstractC39572n
    /* renamed from: a */
    public void mo143486a(String str, IGetDataCallback<Boolean> iGetDataCallback) {
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).closeFriendApplicationBanner(str, iGetDataCallback);
    }

    @Override // com.ss.android.lark.integrator.im.dependency.AbstractC39572n
    /* renamed from: b */
    public void mo143553b(String str, boolean z, IGetDataCallback<Boolean> iGetDataCallback) {
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).agreeChatApplication(str, z, iGetDataCallback);
    }

    @Override // com.ss.android.lark.integrator.im.dependency.AbstractC39572n
    /* renamed from: b */
    public void mo143550b(String str, IGetDataCallback<UserRelationResponse> iGetDataCallback) {
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).checkContactRelationShip(str, iGetDataCallback);
    }

    @Override // com.ss.android.lark.integrator.im.dependency.AbstractC39572n
    /* renamed from: a */
    public void mo143425a(Context context, ImageView imageView, String str, String str2, LoadParams loadParams) {
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).loadAvatarImage(context, imageView, str, str2, loadParams);
    }

    @Override // com.ss.android.lark.integrator.im.dependency.AbstractC39572n
    /* renamed from: a */
    public void mo143424a(Context context, ImageView imageView, String str, LoadParams loadParams) {
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).loadEncryptImage(context, imageView, str, loadParams);
    }

    @Override // com.ss.android.lark.integrator.im.dependency.AbstractC39572n
    /* renamed from: a */
    public String mo143411a(RichTextElement.ImageProperty imageProperty) {
        return ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).getThumbnailKeyFromPb(imageProperty);
    }

    @Override // com.ss.android.lark.integrator.im.dependency.AbstractC39572n
    /* renamed from: a */
    public void mo143436a(Context context, File file, boolean z, IGetDataCallback<C29548at> iGetDataCallback, Biz biz, Scene scene) {
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).compressImage(context, file, z, iGetDataCallback, biz, scene);
    }

    @Override // com.ss.android.lark.integrator.im.dependency.AbstractC39572n
    /* renamed from: a */
    public void mo143453a(Context context, String str, boolean z, boolean z2, AbstractC25974h hVar, IGetDataCallback<EncryptImageData> iGetDataCallback) {
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).uploadEncryptImage(context, str, z, z2, hVar, iGetDataCallback);
    }

    @Override // com.ss.android.lark.integrator.im.dependency.AbstractC39572n
    /* renamed from: a */
    public Observable<EncryptImageData> mo143410a(Context context, String str, boolean z, boolean z2, AbstractC25974h hVar, Biz biz, Scene scene) {
        return ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).uploadEncryptImageV2(context, str, z, z2, hVar, biz, scene);
    }

    @Override // com.ss.android.lark.integrator.im.dependency.AbstractC39572n
    /* renamed from: a */
    public void mo143476a(AbstractC29579a aVar) {
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).addPushResourceDownloadProgressListener(aVar);
    }

    @Override // com.ss.android.lark.integrator.im.dependency.AbstractC39572n
    /* renamed from: a */
    public void mo143477a(AbstractC29580b bVar) {
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).addPushPushResourceListener(bVar);
    }

    @Override // com.ss.android.lark.integrator.im.dependency.AbstractC39572n
    /* renamed from: a */
    public void mo143478a(AbstractC29581c cVar) {
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).addPushResourceUploadProgressListener(cVar);
    }

    @Override // com.ss.android.lark.integrator.im.dependency.AbstractC39572n
    /* renamed from: b */
    public void mo143546b(AbstractC29581c cVar) {
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).removePushResourceUploadProgressListener(cVar);
    }

    @Override // com.ss.android.lark.integrator.im.dependency.AbstractC39572n
    /* renamed from: a */
    public void mo143466a(IPushAddFriendListener afVar) {
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).registerAddFriendPush(afVar);
    }

    @Override // com.ss.android.lark.integrator.im.dependency.AbstractC39572n
    /* renamed from: b */
    public void mo143536b(IPushAddFriendListener afVar) {
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).unregisterAddFriendPush(afVar);
    }

    @Override // com.ss.android.lark.integrator.im.dependency.AbstractC39572n
    /* renamed from: a */
    public void mo143479a(AbstractC29586u uVar) {
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).addLifeCycleObserver(uVar);
    }

    @Override // com.ss.android.lark.integrator.im.dependency.AbstractC39572n
    /* renamed from: b */
    public void mo143547b(AbstractC29586u uVar) {
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).removeLifeCycleObserver(uVar);
    }

    @Override // com.ss.android.lark.integrator.im.dependency.AbstractC39572n
    /* renamed from: a */
    public void mo143421a(ComponentCallbacks2 componentCallbacks2) {
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).registerComponentCallbacks(componentCallbacks2);
    }

    @Override // com.ss.android.lark.integrator.im.dependency.AbstractC39572n
    /* renamed from: a */
    public void mo143485a(String str, Activity activity) {
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).parseQRCode(str, activity);
    }

    @Override // com.ss.android.lark.integrator.im.dependency.AbstractC39572n
    /* renamed from: a */
    public void mo143416a(Activity activity) {
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).startScanQRCodeActivity(activity);
    }

    @Override // com.ss.android.lark.integrator.im.dependency.AbstractC39572n
    /* renamed from: a */
    public void mo143417a(Activity activity, String str) {
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).goShareStickerSetSelectPage(activity, str);
    }

    @Override // com.ss.android.lark.integrator.im.dependency.AbstractC39572n
    /* renamed from: a */
    public void mo143432a(Context context, Message message, String str, String str2, String str3) {
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).goChatForwardSelectPage(context, message, str, str2, str3);
    }

    @Override // com.ss.android.lark.integrator.im.dependency.AbstractC39572n
    /* renamed from: a */
    public void mo143430a(Context context, Message message, int i, String str, String str2, String str3) {
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).goChatForwardSelectPage(context, message, i, str, str2, str3);
    }

    @Override // com.ss.android.lark.integrator.im.dependency.AbstractC39572n
    /* renamed from: a */
    public void mo143426a(Context context, FavoriteForwardData favoriteForwardData, int i, String str, int i2) {
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).goChatForwardSelectPage(context, favoriteForwardData, i, str, i2);
    }

    @Override // com.ss.android.lark.integrator.im.dependency.AbstractC39572n
    /* renamed from: a */
    public void mo143435a(Context context, C36516a aVar, Chat chat, ArrayList<String> arrayList, int i, String str, String str2, boolean z, String str3) {
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).goChatForwardSelectPage(context, aVar, chat, arrayList, i, str, str2, z, str3);
    }

    @Override // com.ss.android.lark.integrator.im.dependency.AbstractC39572n
    /* renamed from: a */
    public void mo143434a(Context context, C36516a aVar, Chat chat, ArrayList<String> arrayList, int i, String str, String str2, String str3) {
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).goChatOneByOneForwardSelectPage(context, aVar, chat, arrayList, i, str, str2, str3);
    }

    @Override // com.ss.android.lark.integrator.im.dependency.AbstractC39572n
    /* renamed from: a */
    public void mo143431a(Context context, Message message, String str, String str2) {
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).goShareThreadTopicSelectPage(context, message, str, str2);
    }

    @Override // com.ss.android.lark.integrator.im.dependency.AbstractC39572n
    /* renamed from: a */
    public void mo143429a(Context context, Chat chat, ArrayList<String> arrayList, String str, int i, String str2, String str3) {
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).goThreadForwardSelectPage(context, chat, arrayList, str, i, str2, str3);
    }

    @Override // com.ss.android.lark.integrator.im.dependency.AbstractC39572n
    /* renamed from: a */
    public void mo143433a(Context context, ProfileContent profileContent) {
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).goProfileShareForwardSelectPage(context, profileContent);
    }

    @Override // com.ss.android.lark.integrator.im.dependency.AbstractC39572n
    /* renamed from: a */
    public void mo143481a(AbstractC44544a aVar) {
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).registerBootMileStoneListener(aVar);
    }

    @Override // com.ss.android.lark.integrator.im.dependency.AbstractC39572n
    /* renamed from: b */
    public void mo143549b(AbstractC44544a aVar) {
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).unregisterBootMileStoneListener(aVar);
    }

    @Override // com.ss.android.lark.integrator.im.dependency.AbstractC39572n
    /* renamed from: a */
    public void mo143492a(String str, String str2, long j, String str3, int i, IGetDataCallback<SearchResponse> iGetDataCallback) {
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).searchPinMessages(str, str2, j, str3, i, iGetDataCallback);
    }

    @Override // com.ss.android.lark.integrator.im.dependency.AbstractC39572n
    /* renamed from: a */
    public void mo143484a(String str, int i, int i2, IGetDataCallback<SearchResponse> iGetDataCallback) {
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).searchHelpDesks(str, i, i2, iGetDataCallback);
    }

    @Override // com.ss.android.lark.integrator.im.dependency.AbstractC39572n
    /* renamed from: a */
    public void mo143445a(Context context, String str, String str2, int i) {
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).openSearchMainPageFromMsgMenu(context, str, str2, i);
    }

    @Override // com.ss.android.lark.integrator.im.dependency.AbstractC39572n
    /* renamed from: a */
    public void mo143450a(Context context, String str, boolean z) {
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).startChatImageResourceActivity(context, str, z);
    }

    @Override // com.ss.android.lark.integrator.im.dependency.AbstractC39572n
    /* renamed from: b */
    public void mo143528b(Context context, String str, String str2, int i) {
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).openSearchMainPageFromFeed(context, str, str2, i);
    }

    @Override // com.ss.android.lark.integrator.im.dependency.AbstractC39572n
    /* renamed from: a */
    public void mo143488a(String str, com.ss.android.lark.searchcommon.dto.Scene scene, List<C53892a> list, IGetDataCallback<Void> iGetDataCallback) {
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).putSearchFeedBack(str, scene, list, iGetDataCallback);
    }

    @Override // com.ss.android.lark.integrator.im.dependency.AbstractC39572n
    /* renamed from: a */
    public void mo143451a(Context context, String str, boolean z, boolean z2) {
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).openChatInternalSearchPage(context, str, z, z2);
    }

    @Override // com.ss.android.lark.integrator.im.dependency.AbstractC39572n
    /* renamed from: a */
    public void mo143452a(Context context, String str, boolean z, boolean z2, int i) {
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).openChatInternalSearchPage(context, str, z, z2, i);
    }

    @Override // com.ss.android.lark.integrator.im.dependency.AbstractC39572n
    /* renamed from: a */
    public void mo143448a(Context context, String str, String str2, String str3, int i, String str4, String str5, IGetDataCallback<String> iGetDataCallback, AbstractC25974h hVar) {
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).downLoadMessageVideo(context, str, str2, str3, i, str4, str5, iGetDataCallback, hVar);
    }

    @Override // com.ss.android.lark.integrator.im.dependency.AbstractC39572n
    /* renamed from: a */
    public void mo143475a(AbstractC29572q.AbstractC29573a aVar) {
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).registerFileDownloadStateChangeListener(aVar);
    }

    @Override // com.ss.android.lark.integrator.im.dependency.AbstractC39572n
    /* renamed from: b */
    public void mo143545b(AbstractC29572q.AbstractC29573a aVar) {
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).unRegisterFileDownloadStateChangeListener(aVar);
    }

    @Override // com.ss.android.lark.integrator.im.dependency.AbstractC39572n
    /* renamed from: b */
    public void mo143529b(Context context, String str, String str2, String str3, int i, String str4, String str5, IGetDataCallback<String> iGetDataCallback, AbstractC25974h hVar) {
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).downLoadMessageFile(context, str, str2, str3, i, str4, str5, iGetDataCallback, hVar);
    }

    @Override // com.ss.android.lark.integrator.im.dependency.AbstractC39572n
    /* renamed from: a */
    public void mo143494a(String str, String str2, String str3, int i, IGetDataCallback<Boolean> iGetDataCallback) {
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).cancelDownloadMessageFile(str, str2, str3, i, iGetDataCallback);
    }

    @Override // com.ss.android.lark.integrator.im.dependency.AbstractC39572n
    /* renamed from: a */
    public void mo143491a(String str, String str2, int i, IGetDataCallback<FileState> iGetDataCallback) {
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).checkFileState(str, str2, i, iGetDataCallback);
    }

    @Override // com.ss.android.lark.integrator.im.dependency.AbstractC39572n
    /* renamed from: a */
    public boolean mo143500a(Context context, AbstractC41567g.AbstractC41568a aVar) {
        return ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).getLocation(context, aVar);
    }

    @Override // com.ss.android.lark.integrator.im.dependency.AbstractC39572n
    /* renamed from: a */
    public double[] mo143504a(double d, double d2) {
        return ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).obtainGCJLatLng(d, d2);
    }

    @Override // com.ss.android.lark.integrator.im.dependency.AbstractC39572n
    /* renamed from: b */
    public boolean mo143556b(double d, double d2) {
        return ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).isInHouse(d, d2);
    }

    @Override // com.ss.android.lark.integrator.im.dependency.AbstractC39572n
    /* renamed from: a */
    public void mo143458a(WebView webView, String str) {
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).setWebViewTag(webView, str);
    }

    @Override // com.ss.android.lark.integrator.im.dependency.AbstractC39572n
    /* renamed from: a */
    public void mo143414a(int i) {
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).setInAppBadgeCount(i);
    }

    @Override // com.ss.android.lark.integrator.im.dependency.AbstractC39572n
    /* renamed from: a */
    public void mo143420a(Notification notification, int i) {
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).setMiuiLauncherBadgeCount(notification, i);
    }

    @Override // com.ss.android.lark.integrator.im.dependency.AbstractC39572n
    /* renamed from: a */
    public void mo143428a(Context context, FilePickerLaunchParams fVar, C36516a aVar, boolean z) {
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).startPicker(context, fVar, aVar, z);
    }

    @Override // com.ss.android.lark.integrator.im.dependency.AbstractC39572n
    /* renamed from: a */
    public void mo143472a(az azVar) {
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).registerUpgradeListener(azVar);
    }

    @Override // com.ss.android.lark.integrator.im.dependency.AbstractC39572n
    /* renamed from: b */
    public void mo143542b(az azVar) {
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).unRegisterUpgradeListener(azVar);
    }

    @Override // com.ss.android.lark.integrator.im.dependency.AbstractC39572n
    /* renamed from: a */
    public void mo143464a(WSConnState.AbstractC29537a aVar) {
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).addConnStateListener(aVar);
    }

    @Override // com.ss.android.lark.integrator.im.dependency.AbstractC39572n
    /* renamed from: b */
    public void mo143534b(WSConnState.AbstractC29537a aVar) {
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).removeConnStateListener(aVar);
    }

    @Override // com.ss.android.lark.integrator.im.dependency.AbstractC39572n
    /* renamed from: a */
    public void mo143463a(NetworkLevelListener networkLevelListener) {
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).registerNetworkLevelListener(networkLevelListener);
    }

    @Override // com.ss.android.lark.integrator.im.dependency.AbstractC39572n
    /* renamed from: b */
    public void mo143533b(NetworkLevelListener networkLevelListener) {
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).unRegisterNetworkLevelListener(networkLevelListener);
    }

    @Override // com.ss.android.lark.integrator.im.dependency.AbstractC39572n
    /* renamed from: a */
    public void mo143469a(an anVar) {
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).registerStoreStateListener(anVar);
    }

    @Override // com.ss.android.lark.integrator.im.dependency.AbstractC39572n
    /* renamed from: b */
    public void mo143539b(an anVar) {
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).unRegisterStoreStateListener(anVar);
    }

    @Override // com.ss.android.lark.integrator.im.dependency.AbstractC39572n
    /* renamed from: b */
    public void mo143531b(View view) {
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).attachBackgroundWatermark(view);
    }

    @Override // com.ss.android.lark.integrator.im.dependency.AbstractC39572n
    /* renamed from: a */
    public void mo143419a(Dialog dialog) {
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).attachGlobalWatermark(dialog);
    }

    @Override // com.ss.android.lark.integrator.im.dependency.AbstractC39572n
    /* renamed from: a */
    public void mo143496a(String str, Map<String, String> map, MagicViewContainer awVar, AbstractC29588w wVar) {
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).registerScenario(str, map, awVar, wVar);
    }

    @Override // com.ss.android.lark.integrator.im.dependency.AbstractC39572n
    /* renamed from: a */
    public void mo143454a(Context context, boolean z) {
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).startNotificationSetting(context, z);
    }

    @Override // com.ss.android.lark.integrator.im.dependency.AbstractC39572n
    /* renamed from: a */
    public void mo143493a(String str, String str2, long j, String str3, String str4) {
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).sendNotificationShowEvent(str, str2, j, str3, str4);
    }

    @Override // com.ss.android.lark.integrator.im.dependency.AbstractC39572n
    /* renamed from: b */
    public void mo143552b(String str, String str2, long j, String str3, String str4) {
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).sendNotificationShowEvent(str, str2, System.currentTimeMillis(), str3, str4);
    }

    @Override // com.ss.android.lark.integrator.im.dependency.AbstractC39572n
    /* renamed from: b */
    public void mo143530b(Context context, String str, boolean z) {
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).openInviteExternalPage(context, str, z);
    }

    @Override // com.ss.android.lark.integrator.im.dependency.AbstractC39572n
    /* renamed from: a */
    public void mo143483a(C57865c.AbstractC57871b<Boolean> bVar) {
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).checkInviteMemberPermission(bVar);
    }

    @Override // com.ss.android.lark.integrator.im.dependency.AbstractC39572n
    /* renamed from: a */
    public void mo143439a(Context context, String str, Bundle bundle) {
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).openInviteMemberGuidePage(context, str, bundle);
    }

    @Override // com.ss.android.lark.integrator.im.dependency.AbstractC39572n
    /* renamed from: b */
    public void mo143527b(Context context, String str, Bundle bundle) {
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).openWelcomeToLarkPage(context, str, bundle);
    }

    @Override // com.ss.android.lark.integrator.im.dependency.AbstractC39572n
    /* renamed from: a */
    public void mo143468a(AbstractC29544ah ahVar) {
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).addPushFileUploadListener(ahVar);
    }

    @Override // com.ss.android.lark.integrator.im.dependency.AbstractC39572n
    /* renamed from: b */
    public void mo143538b(AbstractC29544ah ahVar) {
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).removePushFileUploadListener(ahVar);
    }

    @Override // com.ss.android.lark.integrator.im.dependency.AbstractC39572n
    /* renamed from: a */
    public void mo143446a(Context context, String str, String str2, ImageView imageView) {
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).previewTopicGroupAvatar(context, str, str2, imageView);
    }

    @Override // com.ss.android.lark.integrator.im.dependency.AbstractC39572n
    /* renamed from: a */
    public void mo143449a(Context context, String str, String str2, String str3, View view) {
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).previewGroupAvatar(context, str, str2, str3, view);
    }

    @Override // com.ss.android.lark.integrator.im.dependency.AbstractC39572n
    /* renamed from: a */
    public void mo143459a(Fragment fragment, Activity activity, ImageView imageView, int i, String str) {
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).openGetPhotoMenu(fragment, activity, imageView, i, str);
    }

    @Override // com.ss.android.lark.integrator.im.dependency.AbstractC39572n
    /* renamed from: a */
    public void mo143444a(Context context, String str, String str2) {
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).openSettingTeamName(context, str, str2);
    }

    @Override // com.ss.android.lark.integrator.im.dependency.AbstractC39572n
    /* renamed from: a */
    public void mo143461a(Lifecycle lifecycle, View view) {
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).evictMultitaskFloatWindow(lifecycle, view);
    }

    @Override // com.ss.android.lark.integrator.im.dependency.AbstractC39572n
    /* renamed from: a */
    public void mo143490a(String str, String str2, int i) {
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).beginSection(str, str2, i);
    }

    @Override // com.ss.android.lark.integrator.im.dependency.AbstractC39572n
    /* renamed from: b */
    public void mo143551b(String str, String str2) {
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).asyncTraceBegin(str, str2);
    }

    @Override // com.ss.android.lark.integrator.im.dependency.AbstractC39572n
    /* renamed from: a */
    public void mo143487a(String str, ChatBundle.SourceType sourceType) {
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).start(str, sourceType.value);
    }

    @Override // com.ss.android.lark.integrator.im.dependency.AbstractC39572n
    /* renamed from: a */
    public void mo143456a(View view, int i) {
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).showChatInputTip(view, i);
    }

    @Override // com.ss.android.lark.integrator.im.dependency.AbstractC39572n
    /* renamed from: a */
    public boolean mo143502a(String str, C38708a aVar) {
        return ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).startGuide(str, aVar);
    }

    @Override // com.ss.android.lark.integrator.im.dependency.AbstractC39572n
    /* renamed from: a */
    public String mo143412a(String str, int i, int i2) {
        return ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).getResUrlByResKey(str, i, i2);
    }

    @Override // com.ss.android.lark.integrator.im.dependency.AbstractC39572n
    /* renamed from: a */
    public void mo143482a(AbstractC44546c cVar) {
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).showGuideIfNeed(cVar);
    }

    @Override // com.ss.android.lark.integrator.im.dependency.AbstractC39572n
    /* renamed from: a */
    public void mo143443a(Context context, String str, Object obj, int i, int i2, IGetDataCallback<File> iGetDataCallback) {
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).downloadImageAsync(context, str, obj, i, i2, iGetDataCallback);
    }

    @Override // com.ss.android.lark.integrator.im.dependency.AbstractC39572n
    /* renamed from: A */
    public String mo143375A() {
        return ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).getContactPageTag();
    }

    @Override // com.ss.android.lark.integrator.im.dependency.AbstractC39572n
    /* renamed from: B */
    public boolean mo143376B() {
        return ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).isClientContactOptUi();
    }

    @Override // com.ss.android.lark.integrator.im.dependency.AbstractC39572n
    /* renamed from: C */
    public AbstractC29582d mo143377C() {
        return ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).getResourceService();
    }

    @Override // com.ss.android.lark.integrator.im.dependency.AbstractC39572n
    /* renamed from: D */
    public void mo143378D() {
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).initBytecertSdk();
    }

    @Override // com.ss.android.lark.integrator.im.dependency.AbstractC39572n
    /* renamed from: E */
    public AbstractC29542ad mo143379E() {
        return ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).getProfileLauncherService();
    }

    @Override // com.ss.android.lark.integrator.im.dependency.AbstractC39572n
    /* renamed from: F */
    public IOpenMessageCellFactory mo143380F() {
        return ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).getProfileMessageCellFactory();
    }

    @Override // com.ss.android.lark.integrator.im.dependency.AbstractC39572n
    /* renamed from: G */
    public String mo143381G() {
        return ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).getGroupMessageIDKey();
    }

    @Override // com.ss.android.lark.integrator.im.dependency.AbstractC39572n
    /* renamed from: H */
    public String mo143382H() {
        return ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).getGroupStateKey();
    }

    @Override // com.ss.android.lark.integrator.im.dependency.AbstractC39572n
    /* renamed from: I */
    public Profile mo143383I() {
        return ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).getProfile();
    }

    @Override // com.ss.android.lark.integrator.im.dependency.AbstractC39572n
    /* renamed from: J */
    public long mo143384J() {
        return ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).getElapsedToStart();
    }

    @Override // com.ss.android.lark.integrator.im.dependency.AbstractC39572n
    /* renamed from: K */
    public long mo143385K() {
        return ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).getElapsedToLastForeground();
    }

    @Override // com.ss.android.lark.integrator.im.dependency.AbstractC39572n
    /* renamed from: L */
    public AbstractC29555b mo143386L() {
        return ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).getMainLauncher();
    }

    @Override // com.ss.android.lark.integrator.im.dependency.AbstractC39572n
    /* renamed from: M */
    public String mo143387M() {
        return ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).getDefaultTabName();
    }

    @Override // com.ss.android.lark.integrator.im.dependency.AbstractC39572n
    /* renamed from: N */
    public AbstractC41561d mo143388N() {
        return ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).getLocationMessageMap();
    }

    @Override // com.ss.android.lark.integrator.im.dependency.AbstractC39572n
    /* renamed from: O */
    public AbstractC41569h mo143389O() {
        return ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).getPickLocationMap();
    }

    @Override // com.ss.android.lark.integrator.im.dependency.AbstractC39572n
    /* renamed from: P */
    public AbstractC41562e mo143390P() {
        return ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).getPOIService();
    }

    @Override // com.ss.android.lark.integrator.im.dependency.AbstractC39572n
    /* renamed from: Q */
    public int mo143391Q() {
        return ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).getAppIconBadgeCount();
    }

    @Override // com.ss.android.lark.integrator.im.dependency.AbstractC39572n
    /* renamed from: R */
    public boolean mo143392R() {
        return ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).isDozeState();
    }

    @Override // com.ss.android.lark.integrator.im.dependency.AbstractC39572n
    /* renamed from: S */
    public String mo143393S() {
        return ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).getFilePathListKey();
    }

    @Override // com.ss.android.lark.integrator.im.dependency.AbstractC39572n
    /* renamed from: T */
    public boolean mo143394T() {
        return ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).isNeedStrongNotice();
    }

    @Override // com.ss.android.lark.integrator.im.dependency.AbstractC39572n
    /* renamed from: U */
    public NetworkLevelListener.NetworkLevel mo143395U() {
        return ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).getCurNetWorkLevel();
    }

    @Override // com.ss.android.lark.integrator.im.dependency.AbstractC39572n
    /* renamed from: V */
    public void mo143396V() {
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).onUpdateDeviceEvent();
    }

    @Override // com.ss.android.lark.integrator.im.dependency.AbstractC39572n
    /* renamed from: W */
    public boolean mo143397W() {
        return ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).isGlobalWaterMark();
    }

    @Override // com.ss.android.lark.integrator.im.dependency.AbstractC39572n
    /* renamed from: X */
    public void mo143398X() {
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).initKeyBoard();
    }

    @Override // com.ss.android.lark.integrator.im.dependency.AbstractC39572n
    /* renamed from: Y */
    public AbstractNotification.AbstractC48496c<Notice> mo143399Y() {
        return ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).getDefaultNotificationHitPoint();
    }

    @Override // com.ss.android.lark.integrator.im.dependency.AbstractC39572n
    /* renamed from: Z */
    public void mo143400Z() {
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).clearNotification();
    }

    @Override // com.ss.android.lark.integrator.im.dependency.AbstractC39572n
    public boolean aa() {
        return ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).isInvitationUnionEnable();
    }

    @Override // com.ss.android.lark.integrator.im.dependency.AbstractC39572n
    public boolean ab() {
        return ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).isInviteMemberEnable();
    }

    @Override // com.ss.android.lark.integrator.im.dependency.AbstractC39572n
    public boolean ac() {
        return ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).isInviteMemberAdminEnable();
    }

    @Override // com.ss.android.lark.integrator.im.dependency.AbstractC39572n
    public boolean ad() {
        return ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).isInviteExternalEnable();
    }

    @Override // com.ss.android.lark.integrator.im.dependency.AbstractC39572n
    public String ae() {
        return ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).getInviteExternalPageTitle();
    }

    @Override // com.ss.android.lark.integrator.im.dependency.AbstractC39572n
    public int af() {
        return ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).getUpdateAvatarResultCode();
    }

    @Override // com.ss.android.lark.integrator.im.dependency.AbstractC39572n
    public String ag() {
        return ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).getCurrentAttribution();
    }

    @Override // com.ss.android.lark.integrator.im.dependency.AbstractC39572n
    public AbstractC25990b ah() {
        return ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).getHttpClient();
    }

    @Override // com.ss.android.lark.integrator.im.dependency.AbstractC39572n
    public void ai() {
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).endSection();
    }

    @Override // com.ss.android.lark.integrator.im.dependency.AbstractC39572n
    public AbstractC32812c aj() {
        return ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).getPerfEnterChatMonitor();
    }

    @Override // com.ss.android.lark.integrator.im.dependency.AbstractC39572n
    public ISearchLifecycleObserver ak() {
        return ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).getSearchLifecycleObserver();
    }

    @Override // com.ss.android.lark.integrator.im.dependency.AbstractC39572n
    public boolean al() {
        return ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).isOpenUserCustomStatus();
    }

    @Override // com.ss.android.lark.integrator.im.dependency.AbstractC39572n
    public boolean am() {
        return ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).isMedalEnabled();
    }

    @Override // com.ss.android.lark.integrator.im.dependency.AbstractC39572n
    /* renamed from: e */
    public TimeFormatSetting mo143579e() {
        return ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).getLocalTimeFormat();
    }

    @Override // com.ss.android.lark.integrator.im.dependency.AbstractC39572n
    /* renamed from: h */
    public long mo143590h() {
        return ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).getCachedNtpTime();
    }

    @Override // com.ss.android.lark.integrator.im.dependency.AbstractC39572n
    /* renamed from: j */
    public void mo143594j() {
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).preloadUserSetting();
    }

    @Override // com.ss.android.lark.integrator.im.dependency.AbstractC39572n
    /* renamed from: k */
    public BadgeStyle mo143596k() {
        return ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).getBadgeStyleSetting();
    }

    @Override // com.ss.android.lark.integrator.im.dependency.AbstractC39572n
    /* renamed from: r */
    public Locale mo143610r() {
        return ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).getCacheLanguageSetting();
    }

    @Override // com.ss.android.lark.integrator.im.dependency.AbstractC39572n
    /* renamed from: s */
    public String mo143612s() {
        return ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).getLanguageWithLocal();
    }

    @Override // com.ss.android.lark.integrator.im.dependency.AbstractC39572n
    /* renamed from: t */
    public AbstractC29551a mo143614t() {
        return ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).getLocaleCache();
    }

    @Override // com.ss.android.lark.integrator.im.dependency.AbstractC39572n
    /* renamed from: u */
    public Locale mo143615u() {
        return ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).getDefaultLanguageSetting();
    }

    @Override // com.ss.android.lark.integrator.im.dependency.AbstractC39572n
    /* renamed from: v */
    public C29550b mo143616v() {
        return ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).getAppConfig();
    }

    @Override // com.ss.android.lark.integrator.im.dependency.AbstractC39572n
    /* renamed from: w */
    public int mo143617w() {
        return ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).getOneWayContactSelectLimit();
    }

    @Override // com.ss.android.lark.integrator.im.dependency.AbstractC39572n
    /* renamed from: x */
    public boolean mo143618x() {
        return ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).isAllowSecret();
    }

    @Override // com.ss.android.lark.integrator.im.dependency.AbstractC39572n
    /* renamed from: y */
    public String mo143619y() {
        return ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).getChatReactionSampleConfig();
    }

    @Override // com.ss.android.lark.integrator.im.dependency.AbstractC39572n
    /* renamed from: z */
    public String mo143620z() {
        return ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).getChatReadSampleConfig();
    }

    @Override // com.ss.android.lark.integrator.im.dependency.AbstractC39572n
    /* renamed from: f */
    public boolean mo143585f() {
        return ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).isMessengerEnterpriseTopicEnable();
    }

    @Override // com.ss.android.lark.integrator.im.dependency.AbstractC39572n
    /* renamed from: i */
    public boolean mo143593i() {
        return ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).getP2pBuildGroupTipShowSetting();
    }

    @Override // com.ss.android.lark.integrator.im.dependency.AbstractC39572n
    /* renamed from: l */
    public boolean mo143599l() {
        return ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).getNavMuteBadgeSetting();
    }

    @Override // com.ss.android.lark.integrator.im.dependency.AbstractC39572n
    /* renamed from: m */
    public boolean mo143601m() {
        return ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).isCurrentUserInZenMode();
    }

    @Override // com.ss.android.lark.integrator.im.dependency.AbstractC39572n
    /* renamed from: n */
    public boolean mo143603n() {
        return ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).isSettingV2Enable();
    }

    @Override // com.ss.android.lark.integrator.im.dependency.AbstractC39572n
    /* renamed from: o */
    public boolean mo143605o() {
        return ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).isSettingMessageAlignmentEnable();
    }

    @Override // com.ss.android.lark.integrator.im.dependency.AbstractC39572n
    /* renamed from: p */
    public boolean mo143607p() {
        return ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).isSettingKeyboardEnterSendEnable();
    }

    @Override // com.ss.android.lark.integrator.im.dependency.AbstractC39572n
    /* renamed from: q */
    public Locale mo143609q() {
        return ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).getLanguageSetting();
    }

    @Override // com.ss.android.lark.integrator.im.dependency.AbstractC39572n
    /* renamed from: g */
    public boolean mo143589g() {
        return ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).isMessageAlignLeftAndRightEnable();
    }

    @Override // com.ss.android.lark.integrator.im.dependency.AbstractC39572n
    /* renamed from: d */
    public boolean mo143577d() {
        return ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).isMessengerSmartCorrectionEnabled();
    }

    @Override // com.ss.android.lark.integrator.im.dependency.AbstractC39572n
    /* renamed from: b */
    public Image mo143518b(ImageSet imageSet) {
        return ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).getMiddleFromPb(imageSet);
    }

    @Override // com.ss.android.lark.integrator.im.dependency.AbstractC39572n
    /* renamed from: c */
    public ByteString mo143560c(ImageSet imageSet) {
        return ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).getInlinePreviewFromPb(imageSet);
    }

    @Override // com.ss.android.lark.integrator.im.dependency.AbstractC39572n
    /* renamed from: d */
    public void mo143572d(long j) {
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).setGetFeedCardsV2Start(j);
    }

    @Override // com.ss.android.lark.integrator.im.dependency.AbstractC39572n
    /* renamed from: f */
    public void mo143584f(IGetDataCallback<InvitationServiceApi.InvitePermissionResult> iGetDataCallback) {
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).pullInvitePermission4Banner(iGetDataCallback);
    }

    @Override // com.ss.android.lark.integrator.im.dependency.AbstractC39572n
    /* renamed from: g */
    public AppConfig.FeatureConfig mo143587g(String str) {
        return ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).getFeatureConfig(str);
    }

    @Override // com.ss.android.lark.integrator.im.dependency.AbstractC39572n
    /* renamed from: i */
    public UserRelationResponse mo143592i(String str) {
        return ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).getContactUserRelationShip(str);
    }

    @Override // com.ss.android.lark.integrator.im.dependency.AbstractC39572n
    /* renamed from: l */
    public void mo143598l(String str) {
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).notifyBootMileStoneFirstFrameDraw(str);
    }

    @Override // com.ss.android.lark.integrator.im.dependency.AbstractC39572n
    /* renamed from: m */
    public void mo143600m(String str) {
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).notifyBootMileStoneFirstContentDraw(str);
    }

    @Override // com.ss.android.lark.integrator.im.dependency.AbstractC39572n
    /* renamed from: n */
    public void mo143602n(String str) {
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).addChatHistorySideMenuClickHitPoint(str);
    }

    @Override // com.ss.android.lark.integrator.im.dependency.AbstractC39572n
    /* renamed from: o */
    public void mo143604o(String str) {
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).unregisterScenario(str);
    }

    @Override // com.ss.android.lark.integrator.im.dependency.AbstractC39572n
    /* renamed from: p */
    public void mo143606p(String str) {
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).putBannerCloseStatus(str);
    }

    @Override // com.ss.android.lark.integrator.im.dependency.AbstractC39572n
    /* renamed from: q */
    public AbstractC29479b mo143608q(String str) {
        return ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).getBannerController(str);
    }

    @Override // com.ss.android.lark.integrator.im.dependency.AbstractC39572n
    /* renamed from: b */
    public String mo143519b(RichTextElement.ImageProperty imageProperty) {
        return ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).getMiddleKeyFromPb(imageProperty);
    }

    @Override // com.ss.android.lark.integrator.im.dependency.AbstractC39572n
    /* renamed from: c */
    public void mo143561c(long j) {
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).setGetFeedCardsV2Start(j);
    }

    @Override // com.ss.android.lark.integrator.im.dependency.AbstractC39572n
    /* renamed from: d */
    public void mo143573d(Activity activity) {
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).attachWatermark(activity);
    }

    @Override // com.ss.android.lark.integrator.im.dependency.AbstractC39572n
    /* renamed from: e */
    public String mo143580e(String str) {
        return ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).getNotificationSettingDetail(str);
    }

    @Override // com.ss.android.lark.integrator.im.dependency.AbstractC39572n
    /* renamed from: g */
    public void mo143588g(IGetDataCallback<InvitationServiceApi.InviteActivityBannerResult> iGetDataCallback) {
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).pullInviteActivityBanner(iGetDataCallback);
    }

    @Override // com.ss.android.lark.integrator.im.dependency.AbstractC39572n
    /* renamed from: h */
    public UniversalUserSetting mo143591h(String str) {
        return ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).getUniversalUserSetting(str);
    }

    @Override // com.ss.android.lark.integrator.im.dependency.AbstractC39572n
    /* renamed from: j */
    public void mo143595j(String str) {
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).notifyMainTabFragmentContentDraw(str);
    }

    @Override // com.ss.android.lark.integrator.im.dependency.AbstractC39572n
    /* renamed from: k */
    public void mo143597k(String str) {
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).notifyBootMileStoneFirstDataLoaded(str);
    }

    @Override // com.ss.android.lark.integrator.im.dependency.AbstractC39572n
    /* renamed from: r */
    public boolean mo143611r(String str) {
        return ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).tryLock(str);
    }

    @Override // com.ss.android.lark.integrator.im.dependency.AbstractC39572n
    /* renamed from: s */
    public void mo143613s(String str) {
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).unlock(str);
    }

    @Override // com.ss.android.lark.integrator.im.dependency.AbstractC39572n
    /* renamed from: b */
    public void mo143520b(long j) {
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).setTriggerLoginInfoChangedEnd(j);
    }

    @Override // com.ss.android.lark.integrator.im.dependency.AbstractC39572n
    /* renamed from: c */
    public void mo143562c(Activity activity) {
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).attachPartialWatermark(activity);
    }

    @Override // com.ss.android.lark.integrator.im.dependency.AbstractC39572n
    /* renamed from: d */
    public void mo143574d(Context context) {
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).updateInAppBadgeCount(context);
    }

    @Override // com.ss.android.lark.integrator.im.dependency.AbstractC39572n
    /* renamed from: e */
    public void mo143581e(long j) {
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).setHideLoadingStart(j);
    }

    @Override // com.ss.android.lark.integrator.im.dependency.AbstractC39572n
    /* renamed from: f */
    public boolean mo143586f(String str) {
        return ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).isAppConfigOn(str);
    }

    @Override // com.ss.android.lark.integrator.im.dependency.AbstractC39572n
    /* renamed from: a */
    public Chatter.ChatterCustomStatus mo143404a(List<Chatter.ChatterCustomStatus> list) {
        return ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).getOpenedUserStatus(list);
    }

    @Override // com.ss.android.lark.integrator.im.dependency.AbstractC39572n
    /* renamed from: b */
    public void mo143521b(Activity activity) {
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).startQrCodeScreenShot(activity);
    }

    @Override // com.ss.android.lark.integrator.im.dependency.AbstractC39572n
    /* renamed from: d */
    public void mo143575d(IGetDataCallback<String> iGetDataCallback) {
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).getMyPhoneNumber(iGetDataCallback);
    }

    @Override // com.ss.android.lark.integrator.im.dependency.AbstractC39572n
    /* renamed from: e */
    public void mo143582e(Activity activity) {
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).detachWatermark(activity);
    }

    @Override // com.ss.android.lark.integrator.im.dependency.AbstractC39572n
    /* renamed from: a */
    public as mo143405a(Fragment fragment) {
        return ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).getIdlePositionLifecycle(fragment);
    }

    @Override // com.ss.android.lark.integrator.im.dependency.AbstractC39572n
    /* renamed from: e */
    public void mo143583e(IGetDataCallback iGetDataCallback) {
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).getEnableDingBySmsPhone(iGetDataCallback);
    }

    @Override // com.ss.android.lark.integrator.im.dependency.AbstractC39572n
    /* renamed from: a */
    public IPlusItem mo143406a(Chat chat) {
        return ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).getProfileKBPlusItem(chat);
    }

    @Override // com.ss.android.lark.integrator.im.dependency.AbstractC39572n
    /* renamed from: a */
    public Image mo143407a(com.bytedance.lark.pb.basic.v1.Image image) {
        return ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).getImage(image);
    }

    @Override // com.ss.android.lark.integrator.im.dependency.AbstractC39572n
    /* renamed from: c */
    public void mo143566c(IGetDataCallback<AppConfig> iGetDataCallback) {
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).registerAppConfigListener(iGetDataCallback);
    }

    @Override // com.ss.android.lark.integrator.im.dependency.AbstractC39572n
    /* renamed from: d */
    public boolean mo143578d(String str) {
        return ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).isSoundOn(str);
    }

    @Override // com.ss.android.lark.integrator.im.dependency.AbstractC39572n
    /* renamed from: a */
    public Image mo143408a(ImageSet imageSet) {
        return ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).getThumbnailFromPb(imageSet);
    }

    @Override // com.ss.android.lark.integrator.im.dependency.AbstractC39572n
    /* renamed from: c */
    public void mo143563c(Context context, int i) {
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).setLauncherBadgeCount(context, i);
    }

    @Override // com.ss.android.lark.integrator.im.dependency.AbstractC39572n
    /* renamed from: b */
    public void mo143522b(Activity activity, String str) {
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).openChat(activity, str);
    }

    @Override // com.ss.android.lark.integrator.im.dependency.AbstractC39572n
    /* renamed from: c */
    public void mo143564c(Context context, String str) {
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).openInvitationUnionPage(context, str);
    }

    @Override // com.ss.android.lark.integrator.im.dependency.AbstractC39572n
    /* renamed from: d */
    public void mo143576d(String str, IGetDataCallback<String> iGetDataCallback) {
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).uploadGroupAvatar(str, iGetDataCallback);
    }

    @Override // com.ss.android.lark.integrator.im.dependency.AbstractC39572n
    /* renamed from: b */
    public void mo143523b(Context context, int i) {
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).openFeedMessageFilterSortPage(context, i);
    }

    @Override // com.ss.android.lark.integrator.im.dependency.AbstractC39572n
    /* renamed from: b */
    public void mo143525b(Context context, IInitBuilder<IInitBuilder.IBlockTipBuilder> aVar) {
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).showBlockTipDialog(context, aVar);
    }

    @Override // com.ss.android.lark.integrator.im.dependency.AbstractC39572n
    /* renamed from: c */
    public void mo143567c(String str, IGetDataCallback<ProfileResponse> iGetDataCallback) {
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).fetchUserProfile(str, iGetDataCallback);
    }

    @Override // com.ss.android.lark.integrator.im.dependency.AbstractC39572n
    /* renamed from: a */
    public <T extends C41152a> T mo143409a(String str, AbstractC41160a aVar) {
        return (T) ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).getAppConfig(str, aVar);
    }

    @Override // com.ss.android.lark.integrator.im.dependency.AbstractC39572n
    /* renamed from: b */
    public void mo143526b(Context context, String str) {
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).openInviteMemberPageSmart(context, str);
    }

    @Override // com.ss.android.lark.integrator.im.dependency.AbstractC39572n
    /* renamed from: c */
    public void mo143568c(String str, String str2) {
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).asyncTraceEnd(str, str2);
    }

    @Override // com.ss.android.lark.integrator.im.dependency.AbstractC39572n
    /* renamed from: a */
    public PendingIntent mo143401a(Message message, boolean z, boolean z2) {
        return ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).getCommonNotificationIntent(message, z, z2);
    }

    @Override // com.ss.android.lark.integrator.im.dependency.AbstractC39572n
    /* renamed from: a */
    public Fragment mo143403a(Context context, Bundle bundle, Chat chat) {
        return ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).getForwardPickFragment(context, bundle, chat);
    }

    @Override // com.ss.android.lark.integrator.im.dependency.AbstractC39572n
    /* renamed from: c */
    public void mo143565c(Context context, String str, int i) {
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).openInternal(context, str, i);
    }

    @Override // com.ss.android.lark.integrator.im.dependency.AbstractC39572n
    /* renamed from: a */
    public Bitmap mo143402a(String str, int i, int i2, int i3) {
        return ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).encodeQRCode(str, i, i2, i3);
    }

    @Override // com.ss.android.lark.integrator.im.dependency.AbstractC39572n
    /* renamed from: b */
    public void mo143524b(Context context, ImageView imageView, String str, LoadParams loadParams) {
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).loadLocalOrUrlImage(context, imageView, str, loadParams);
    }
}
