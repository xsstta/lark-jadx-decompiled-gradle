package com.larksuite.component.openplatform.core.plugin.messenger.share;

import android.app.Activity;
import android.app.Application;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.text.TextUtils;
import com.alibaba.fastjson.annotation.JSONField;
import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.bytedance.ee.larkbrand.LarkExtensionManager;
import com.bytedance.ee.larkbrand.nativeMoudule.C13149b;
import com.bytedance.ee.larkbrand.p651f.C13047a;
import com.bytedance.ee.larkbrand.utils.C13374s;
import com.bytedance.ee.larkbrand.utils.C13377u;
import com.bytedance.ee.larkbrand.utils.C13380x;
import com.google.firebase.messaging.Constants;
import com.larksuite.component.openplatform.core.plugin.OPPlugin;
import com.larksuite.component.ui.toast.LKUIToast;
import com.larksuite.framework.apiplugin.AbstractC25905b;
import com.larksuite.framework.apiplugin.LKEvent;
import com.larksuite.framework.apiplugin.annotation.LKPluginFunction;
import com.larksuite.framework.apiplugin.common.C25920a;
import com.larksuite.framework.apiplugin.common.C25921b;
import com.larksuite.framework.apiplugin.common.Messenger;
import com.larksuite.framework.apiplugin.p1175a.AbstractC25897h;
import com.larksuite.framework.apiplugin.p1176b.C25906a;
import com.larksuite.suite.R;
import com.ss.android.lark.optrace.api.ILogger;
import com.tt.miniapp.settings.v2.handler.C66808x;
import com.tt.miniapphost.AppbrandContext;
import com.tt.miniapphost.C67432a;
import com.tt.miniapphost.p3362a.p3363a.AbstractC67433a;
import com.tt.miniapphost.process.data.CrossProcessDataEntity;
import com.tt.miniapphost.process.p3376b.AbstractC67565b;
import io.reactivex.Observable;
import io.reactivex.ObservableEmitter;
import io.reactivex.ObservableOnSubscribe;
import io.reactivex.ObservableSource;
import io.reactivex.Scheduler;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import io.reactivex.p3456d.C68279a;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class ShareAppMessagePlugin extends OPPlugin {
    private final boolean hasGrantedChatInfo = true;
    public AbstractC25897h<ShareAppMessageResponse> invokeCallback;
    private AbstractC25905b lkBridgeContext;
    public LKEvent lkEvent;
    public IAppContext mAppContext;
    public ShareAppMessageResponse response;

    /* access modifiers changed from: private */
    public static class ShareAppMessageResponse extends C25921b {
        @JSONField(name = Constants.ScionAnalytics.MessageType.DATA_MESSAGE)
        public List<Messenger.ChatInfo> mChatResult = new ArrayList();
    }

    @Override // com.larksuite.component.openplatform.core.plugin.OPPlugin, com.larksuite.framework.apiplugin.AbstractC25937e
    public void onRelease() {
    }

    @Override // com.larksuite.framework.apiplugin.AbstractC25937e
    public boolean shouldHandleActivityResult() {
        return true;
    }

    private static class ShareAppMessageRequest extends C25920a {
        @JSONField(name = "desc")
        public String mDesc;
        @JSONField(name = "imageUrl")
        public String mImageUrl;
        @JSONField(name = "PCMode")
        public String mPCMode;
        @JSONField(name = "PCPath")
        public String mPCPath;
        @JSONField(name = "path")
        public String mPath;
        @JSONField(name = "title")
        public String mTitle;

        private ShareAppMessageRequest() {
        }
    }

    private String parseLaunchMode(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            return Uri.parse(str).getQueryParameter("launch_mode");
        } catch (Exception e) {
            this.lkEvent.mo92134c().mo92190b().mo92223e("LarkShareAppMessageCtrl", e);
            return null;
        }
    }

    public File saveImage(Bitmap bitmap) {
        if (bitmap == null) {
            return null;
        }
        File filesDir = this.mAppContext.getCurrentActivity().getFilesDir();
        File file = new File(filesDir, "appbrand" + File.separator + System.currentTimeMillis() + ".png");
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            bitmap.compress(Bitmap.CompressFormat.PNG, 100, fileOutputStream);
            fileOutputStream.flush();
            fileOutputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        bitmap.recycle();
        return file;
    }

    private void sendEvent2ChatIdToOpenChatIds(Messenger.ChatIdsToOpenChatIdsRequest chatIdsToOpenChatIdsRequest, final boolean z) {
        this.lkBridgeContext.mo92211a("chatIdsToOpenChatIds", chatIdsToOpenChatIdsRequest, this.mAppContext, new AbstractC25897h<Messenger.ChatIdsToOpenChatIdsResponse>() {
            /* class com.larksuite.component.openplatform.core.plugin.messenger.share.ShareAppMessagePlugin.C252691 */

            /* renamed from: a */
            public void callback(Messenger.ChatIdsToOpenChatIdsResponse chatIdsToOpenChatIdsResponse) {
                ShareAppMessagePlugin.this.lkEvent.mo92134c().mo92190b().mo92224i("LarkShareAppMessageCtrl", "chatIds2OpenChatIds");
                if (chatIdsToOpenChatIdsResponse == null || chatIdsToOpenChatIdsResponse.mChatInfos.isEmpty()) {
                    ShareAppMessagePlugin shareAppMessagePlugin = ShareAppMessagePlugin.this;
                    shareAppMessagePlugin.fillFailedResponse(shareAppMessagePlugin.response, C25906a.f64080j, "result is null");
                    ShareAppMessagePlugin.this.invokeCallback.callback(ShareAppMessagePlugin.this.response);
                    ShareAppMessagePlugin.this.lkEvent.mo92134c().mo92190b().mo92223e("LarkShareAppMessageCtrl", "result is null");
                    return;
                }
                for (Messenger.ChatInfo chatInfo : chatIdsToOpenChatIdsResponse.mChatInfos) {
                    Messenger.ChatInfo chatInfo2 = new Messenger.ChatInfo();
                    chatInfo2.mId = chatInfo.mId;
                    chatInfo2.mChatType = chatInfo.mChatType;
                    chatInfo2.mUserType = chatInfo.mUserType;
                    if (z) {
                        chatInfo2.mAvatarUrls = chatInfo.mAvatarUrls;
                        chatInfo2.mI18nNames = chatInfo.mI18nNames;
                        chatInfo2.mName = chatInfo.mName;
                    }
                    ShareAppMessagePlugin.this.response.mChatResult.add(chatInfo2);
                }
                ShareAppMessagePlugin.this.invokeCallback.callback(ShareAppMessagePlugin.this.response);
            }
        }, Messenger.ChatIdsToOpenChatIdsResponse.class);
    }

    @Override // com.larksuite.framework.apiplugin.AbstractC25937e
    public boolean handleActivityResult(int i, int i2, Intent intent) {
        this.lkEvent.mo92134c().mo92190b().mo92224i("LarkShareAppMessageCtrl", "handle share result", Integer.valueOf(i), Integer.valueOf(i2));
        if (i == 20008) {
            if (intent == null) {
                this.lkEvent.mo92134c().mo92190b().mo92223e("LarkShareAppMessageCtrl", "share to lark activity result intent is null");
                fillFailedResponse(this.response, C25906a.f64080j, "intent is null");
                this.invokeCallback.callback(this.response);
                return true;
            }
            String stringExtra = intent.getStringExtra("share_data");
            String stringExtra2 = intent.getStringExtra("share_type");
            if (TextUtils.isEmpty(stringExtra)) {
                ILogger b = this.lkEvent.mo92134c().mo92190b();
                b.mo92223e("LarkShareAppMessageCtrl", "share to lark activity result chat json is null , share type " + stringExtra2);
                fillFailedResponse(this.response, C25906a.f64073c, C25906a.f64073c.f64117J);
                this.invokeCallback.callback(this.response);
                return true;
            }
            if (!TextUtils.isEmpty(stringExtra2)) {
                Activity currentActivity = this.mAppContext.getCurrentActivity();
                LKUIToast.loadSuccess(currentActivity, currentActivity.getResources().getString(R.string.OpenPlatform_Share_ShareSuccessToast));
            }
            this.lkEvent.mo92134c().mo92190b().mo92224i("LarkShareAppMessageCtrl", "handle share result, start transformID");
            try {
                Messenger.ChatIdsToOpenChatIdsRequest chatIdsToOpenChatIdsRequest = new Messenger.ChatIdsToOpenChatIdsRequest();
                JSONArray jSONArray = new JSONArray(stringExtra);
                for (int i3 = 0; i3 < jSONArray.length(); i3++) {
                    Messenger.ChatRequest chatRequest = new Messenger.ChatRequest();
                    JSONObject optJSONObject = jSONArray.optJSONObject(i3);
                    if (optJSONObject != null) {
                        String optString = optJSONObject.optString("id");
                        int optInt = optJSONObject.optInt("chatType");
                        if (optJSONObject.optBoolean("isBot")) {
                            optInt = 2;
                        }
                        chatRequest.mChatId = optString;
                        chatRequest.mType = String.valueOf(optInt);
                        chatIdsToOpenChatIdsRequest.mChats.add(chatRequest);
                    }
                }
                this.lkEvent.mo92134c().mo92190b().mo92222d("LarkShareAppMessageCtrl", "do ChatIdToOpenChatIds");
                sendEvent2ChatIdToOpenChatIds(chatIdsToOpenChatIdsRequest, true);
            } catch (JSONException e) {
                this.lkEvent.mo92134c().mo92190b().mo92223e("LarkShareAppMessageCtrl", e.getMessage());
                fillFailedResponse(this.response, C25906a.f64080j, e.getMessage());
                this.invokeCallback.callback(this.response);
            }
        }
        return super.handleActivityResult(i, i2, intent);
    }

    @LKPluginFunction(async = true, eventName = {"shareAppMessageDirectly"})
    public void shareAppMessage(LKEvent lKEvent, ShareAppMessageRequest shareAppMessageRequest, AbstractC25905b bVar, AbstractC25897h<ShareAppMessageResponse> hVar) {
        IAppContext eventContext = getEventContext(lKEvent);
        ShareAppMessageResponse shareAppMessageResponse = new ShareAppMessageResponse();
        if (eventContext == null) {
            lKEvent.mo92134c().mo92190b().mo92223e("LarkShareAppMessageCtrl", "appContext is null");
            fillFailedResponse(shareAppMessageResponse, C25906a.f64080j, "appContext is null");
            hVar.callback(shareAppMessageResponse);
            return;
        }
        this.response = new ShareAppMessageResponse();
        this.invokeCallback = hVar;
        this.mAppContext = eventContext;
        this.lkEvent = lKEvent;
        this.lkBridgeContext = bVar;
        C13377u.m54411a(eventContext);
        C13377u.m54418a(lKEvent.mo92146m(), "chatInfo", true, eventContext);
        String str = shareAppMessageRequest.mPath;
        openShare(shareAppMessageRequest.mTitle, str, shareAppMessageRequest.mDesc, shareAppMessageRequest.mImageUrl, shareAppMessageRequest.mPCPath, shareAppMessageRequest.mPCMode);
    }

    public void openShare(final String str, final String str2, String str3, final String str4, final String str5, final String str6) {
        Scheduler scheduler;
        String str7;
        String str8;
        String str9 = C67432a.m262319a(this.mAppContext).getAppInfo().appId;
        final String parseLaunchMode = parseLaunchMode(C67432a.m262319a(this.mAppContext).getSchema());
        String b = C66808x.m260690a().mo232716b();
        this.lkEvent.mo92134c().mo92190b().mo92224i("LarkShareAppMessageCtrl", "appid = " + str9 + " , shardLinks = " + b);
        if (b.contains(str9)) {
            if (this.mAppContext.getCurrentActivity() != null) {
                if (!TextUtils.isEmpty(str2)) {
                    str7 = Uri.decode(str2);
                } else {
                    str7 = str2;
                }
                if (str7 == null || (!str7.startsWith("http:") && !str7.startsWith("https:"))) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("sslocal://microapp?app_id=");
                    sb.append(str9);
                    String str10 = "";
                    if (TextUtils.isEmpty(str7)) {
                        str8 = str10;
                    } else {
                        str8 = "&start_page=" + Uri.encode(str7);
                    }
                    sb.append(str8);
                    if (!TextUtils.isEmpty(parseLaunchMode)) {
                        str10 = "&launch_mode=" + parseLaunchMode;
                    }
                    sb.append(str10);
                    str7 = sb.toString();
                }
                LarkExtensionManager.getInstance().getExtension().mo49613a(true, str9, str, str3, str7, "", false, "", this.mAppContext);
            }
        } else if (LarkExtensionManager.getInstance().getExtension().mo49614i()) {
            Observable flatMap = Observable.create(new ObservableOnSubscribe<Bitmap>() {
                /* class com.larksuite.component.openplatform.core.plugin.messenger.share.ShareAppMessagePlugin.C252766 */

                @Override // io.reactivex.ObservableOnSubscribe
                public void subscribe(ObservableEmitter<Bitmap> observableEmitter) throws Exception {
                    Bitmap bitmap;
                    Activity currentActivity = ShareAppMessagePlugin.this.mAppContext.getCurrentActivity();
                    String string = currentActivity.getResources().getString(R.string.lark_brand_wait);
                    if (TextUtils.isEmpty(str4)) {
                        try {
                            if (ShareAppMessagePlugin.this.mAppContext instanceof AbstractC67433a) {
                                Bitmap a = C25301c.m90791a(((AbstractC67433a) ShareAppMessagePlugin.this.mAppContext).mo234156a());
                                C13149b.m53758a(currentActivity, null, string, 2147483647L, "loading");
                                bitmap = C25301c.m90790a(a);
                            } else {
                                bitmap = null;
                            }
                            if (bitmap == null) {
                                observableEmitter.onError(new IllegalStateException("Failed capture share screen"));
                                return;
                            }
                            observableEmitter.onNext(bitmap);
                            observableEmitter.onComplete();
                        } catch (OutOfMemoryError e) {
                            observableEmitter.onError(e);
                        }
                    } else {
                        C13149b.m53758a(currentActivity, null, string, 2147483647L, "loading");
                        try {
                            observableEmitter.onNext(C25301c.m90792a(str4, ShareAppMessagePlugin.this.mAppContext));
                            observableEmitter.onComplete();
                        } catch (IOException e2) {
                            observableEmitter.onError(e2);
                        }
                    }
                }
            }).observeOn(C68279a.m265023b()).map(new Function<Bitmap, File>() {
                /* class com.larksuite.component.openplatform.core.plugin.messenger.share.ShareAppMessagePlugin.C252755 */

                /* renamed from: a */
                public File apply(Bitmap bitmap) throws Exception {
                    return ShareAppMessagePlugin.this.saveImage(bitmap);
                }
            }).observeOn(C68279a.m265023b()).flatMap(new Function<File, ObservableSource<String>>() {
                /* class com.larksuite.component.openplatform.core.plugin.messenger.share.ShareAppMessagePlugin.C252724 */

                /* renamed from: a */
                public ObservableSource<String> apply(final File file) throws Exception {
                    return Observable.create(new ObservableOnSubscribe<String>() {
                        /* class com.larksuite.component.openplatform.core.plugin.messenger.share.ShareAppMessagePlugin.C252724.C252731 */

                        @Override // io.reactivex.ObservableOnSubscribe
                        public void subscribe(final ObservableEmitter<String> observableEmitter) throws Exception {
                            String str;
                            File file = file;
                            if (file == null || !file.exists()) {
                                if (file == null) {
                                    str = "bitmap is null ";
                                } else {
                                    str = "file save failed ";
                                }
                                observableEmitter.onError(new IOException(str));
                                return;
                            }
                            C13374s.m54386a(file.getAbsolutePath(), new AbstractC67565b() {
                                /* class com.larksuite.component.openplatform.core.plugin.messenger.share.ShareAppMessagePlugin.C252724.C252731.C252741 */

                                @Override // com.tt.miniapphost.process.p3376b.AbstractC67565b
                                /* renamed from: a */
                                public void mo48980a(CrossProcessDataEntity crossProcessDataEntity) {
                                    file.delete();
                                    if (crossProcessDataEntity != null) {
                                        observableEmitter.onNext(crossProcessDataEntity.mo234744b("lark_upload_image_result"));
                                        observableEmitter.onComplete();
                                        return;
                                    }
                                    observableEmitter.onError(new RuntimeException("Upload Image failed!"));
                                }
                            });
                        }
                    });
                }
            });
            if (TextUtils.isEmpty(str4)) {
                scheduler = AndroidSchedulers.mainThread();
            } else {
                scheduler = C68279a.m265023b();
            }
            flatMap.subscribeOn(scheduler).subscribe(new Consumer<String>() {
                /* class com.larksuite.component.openplatform.core.plugin.messenger.share.ShareAppMessagePlugin.C252702 */

                /* renamed from: a */
                public void accept(String str) throws Exception {
                    boolean z;
                    C13149b.m53755a();
                    String a = C13047a.C13048a.m53531a();
                    if (ShareAppMessagePlugin.this.mAppContext.getCurrentActivity() != null) {
                        Uri.Builder appendQueryParameter = Uri.parse(a).buildUpon().appendQueryParameter("appId", C67432a.m262319a(ShareAppMessagePlugin.this.mAppContext).getAppInfo().appId);
                        if (!TextUtils.isEmpty(str2)) {
                            appendQueryParameter.appendQueryParameter("path", Uri.decode(str2));
                        }
                        if (!TextUtils.isEmpty(parseLaunchMode)) {
                            appendQueryParameter.appendQueryParameter("launch_mode", parseLaunchMode);
                        }
                        if (TextUtils.isEmpty(str5) || TextUtils.isEmpty(str6)) {
                            z = false;
                        } else {
                            appendQueryParameter.appendQueryParameter("path_pc", Uri.decode(str5)).appendQueryParameter("mode", str6);
                            z = true;
                        }
                        String builder = appendQueryParameter.toString();
                        if (!z) {
                            builder = C13380x.m54429a(builder, "mode", "sidebar-semi");
                        }
                        String str2 = str;
                        if (TextUtils.isEmpty(str2)) {
                            str2 = C67432a.m262319a(ShareAppMessagePlugin.this.mAppContext).getAppInfo().appName;
                        }
                        LarkExtensionManager.getInstance().getExtension().mo49613a(false, C67432a.m262319a(ShareAppMessagePlugin.this.mAppContext).getAppInfo().appId, str2, "", builder, appendQueryParameter.build().toString(), z, str, ShareAppMessagePlugin.this.mAppContext);
                    }
                }
            }, new Consumer<Throwable>() {
                /* class com.larksuite.component.openplatform.core.plugin.messenger.share.ShareAppMessagePlugin.C252713 */

                /* renamed from: a */
                public void accept(Throwable th) throws Exception {
                    C13149b.m53755a();
                    Application applicationContext = AppbrandContext.getInst().getApplicationContext();
                    C13149b.m53757a(applicationContext, applicationContext.getResources().getString(R.string.lark_brand_share_failed));
                    ILogger b = ShareAppMessagePlugin.this.lkEvent.mo92134c().mo92190b();
                    b.mo92223e("LarkShareAppMessageCtrl", "share failed: " + th);
                    ShareAppMessagePlugin.this.response.mErrorCode = C25906a.f64080j.f64115H;
                    ShareAppMessagePlugin.this.response.mErrorMessage = th.getMessage();
                    ShareAppMessagePlugin.this.invokeCallback.callback(ShareAppMessagePlugin.this.response);
                }
            });
        }
    }
}
