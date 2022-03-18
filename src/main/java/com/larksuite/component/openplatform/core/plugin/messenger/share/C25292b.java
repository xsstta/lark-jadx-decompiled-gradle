package com.larksuite.component.openplatform.core.plugin.messenger.share;

import android.app.Activity;
import android.app.Application;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.larkbrand.LarkExtensionManager;
import com.bytedance.ee.larkbrand.nativeMoudule.C13149b;
import com.bytedance.ee.larkbrand.p651f.C13047a;
import com.bytedance.ee.larkbrand.utils.C13362n;
import com.bytedance.ee.larkbrand.utils.C13374s;
import com.bytedance.ee.larkbrand.utils.C13377u;
import com.bytedance.ee.larkbrand.utils.C13380x;
import com.larksuite.component.ui.toast.LKUIToast;
import com.larksuite.suite.R;
import com.tt.frontendapiinterface.ApiHandler;
import com.tt.miniapp.errorcode.ApiCode;
import com.tt.miniapp.settings.v2.handler.C66808x;
import com.tt.miniapphost.AppbrandContext;
import com.tt.miniapphost.C67432a;
import com.tt.miniapphost.p3362a.p3363a.AbstractC67433a;
import com.tt.miniapphost.process.data.CrossProcessDataEntity;
import com.tt.miniapphost.process.p3376b.AbstractC67565b;
import com.tt.option.ext.AbstractC67619e;
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
import java.util.HashMap;
import org.json.JSONObject;

/* renamed from: com.larksuite.component.openplatform.core.plugin.messenger.share.b */
public class C25292b extends ApiHandler {

    /* renamed from: a */
    private final boolean f61782a = true;

    @Override // com.tt.frontendapiinterface.ApiHandler
    public String getActionName() {
        return "shareAppMessageDirectly";
    }

    @Override // com.tt.frontendapiinterface.ApiHandler, com.larksuite.framework.apiplugin.AbstractC25937e
    public boolean shouldHandleActivityResult() {
        return true;
    }

    public C25292b() {
    }

    @Override // com.tt.frontendapiinterface.ApiHandler
    public void act() {
        try {
            C13377u.m54411a(getAppContext());
            C13377u.m54418a(getActionName(), "chatInfo", true, getAppContext());
            JSONObject jSONObject = new JSONObject(this.mArgs);
            String optString = jSONObject.optString("path");
            mo88416a(jSONObject.optString("title"), optString, jSONObject.optString("desc"), jSONObject.optString("imageUrl"), jSONObject.optString("PCPath"), jSONObject.optString("PCMode"));
        } catch (Exception e) {
            AppBrandLogger.m52829e("LarkShareAppMessageCtrl", "", e);
        }
    }

    /* renamed from: a */
    private String m90779a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            return Uri.parse(str).getQueryParameter("launch_mode");
        } catch (Exception e) {
            AppBrandLogger.m52829e("LarkShareAppMessageCtrl", e);
            return null;
        }
    }

    /* renamed from: a */
    public File mo88415a(Bitmap bitmap) {
        if (bitmap == null) {
            return null;
        }
        File filesDir = getAppContext().getCurrentActivity().getFilesDir();
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

    public C25292b(String str, int i, AbstractC67619e eVar) {
        super(str, i, eVar);
    }

    @Override // com.tt.frontendapiinterface.ApiHandler, com.larksuite.framework.apiplugin.AbstractC25937e
    public boolean handleActivityResult(int i, int i2, Intent intent) {
        AppBrandLogger.m52830i("LarkShareAppMessageCtrl", "handle share result", Integer.valueOf(i), Integer.valueOf(i2));
        if (i == 20008) {
            if (intent == null) {
                AppBrandLogger.m52829e("LarkShareAppMessageCtrl", "share to lark activity result intent is null");
                callbackFail(ApiCode.GENERAL_UNKONW_ERROR);
                return true;
            }
            String stringExtra = intent.getStringExtra("share_data");
            String stringExtra2 = intent.getStringExtra("share_type");
            if (TextUtils.isEmpty(stringExtra)) {
                AppBrandLogger.m52829e("LarkShareAppMessageCtrl", "share to lark activity result chat json is null , share type " + stringExtra2);
                callbackFail(ApiCode.GENERAL_CANCEL);
                return true;
            }
            if (!TextUtils.isEmpty(stringExtra2)) {
                Activity currentActivity = getAppContext().getCurrentActivity();
                LKUIToast.loadSuccess(currentActivity, currentActivity.getResources().getString(R.string.OpenPlatform_Share_ShareSuccessToast));
            }
            AppBrandLogger.m52830i("LarkShareAppMessageCtrl", "handle share result, start transformID");
            C13362n.m54361a(stringExtra, new C13362n.AbstractC13365a() {
                /* class com.larksuite.component.openplatform.core.plugin.messenger.share.C25292b.C252931 */

                @Override // com.bytedance.ee.larkbrand.utils.C13362n.AbstractC13365a
                /* renamed from: a */
                public void mo49668a(HashMap<String, Object> hashMap) {
                    C25292b.this.callbackMsg(true, hashMap, null);
                }

                @Override // com.bytedance.ee.larkbrand.utils.C13362n.AbstractC13365a
                /* renamed from: a */
                public void mo49667a(String str, Throwable th) {
                    C25292b.this.callbackDefaultMsg(true);
                }
            }, true, getAppContext());
        }
        return super.handleActivityResult(i, i2, intent);
    }

    /* renamed from: a */
    public void mo88416a(final String str, final String str2, String str3, final String str4, final String str5, final String str6) {
        Scheduler scheduler;
        String str7;
        String str8;
        String str9 = C67432a.m262319a(getAppContext()).getAppInfo().appId;
        final String a = m90779a(C67432a.m262319a(getAppContext()).getSchema());
        String b = C66808x.m260690a().mo232716b();
        AppBrandLogger.m52830i("LarkShareAppMessageCtrl", "appid = " + str9 + " , shardLinks = " + b);
        if (b.contains(str9)) {
            if (getAppContext().getCurrentActivity() != null) {
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
                    if (!TextUtils.isEmpty(a)) {
                        str10 = "&launch_mode=" + a;
                    }
                    sb.append(str10);
                    str7 = sb.toString();
                }
                LarkExtensionManager.getInstance().getExtension().mo49613a(true, str9, str, str3, str7, "", false, "", getAppContext());
            }
        } else if (LarkExtensionManager.getInstance().getExtension().mo49614i()) {
            Observable flatMap = Observable.create(new ObservableOnSubscribe<Bitmap>() {
                /* class com.larksuite.component.openplatform.core.plugin.messenger.share.C25292b.C253006 */

                @Override // io.reactivex.ObservableOnSubscribe
                public void subscribe(ObservableEmitter<Bitmap> observableEmitter) throws Exception {
                    Bitmap bitmap;
                    Activity currentActivity = C25292b.this.getAppContext().getCurrentActivity();
                    String string = currentActivity.getResources().getString(R.string.lark_brand_wait);
                    if (TextUtils.isEmpty(str4)) {
                        try {
                            if (C25292b.this.getAppContext() instanceof AbstractC67433a) {
                                Bitmap a = C25301c.m90791a(((AbstractC67433a) C25292b.this.getAppContext()).mo234156a());
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
                            observableEmitter.onNext(C25301c.m90792a(str4, C25292b.this.getAppContext()));
                            observableEmitter.onComplete();
                        } catch (IOException e2) {
                            observableEmitter.onError(e2);
                        }
                    }
                }
            }).observeOn(C68279a.m265023b()).map(new Function<Bitmap, File>() {
                /* class com.larksuite.component.openplatform.core.plugin.messenger.share.C25292b.C252995 */

                /* renamed from: a */
                public File apply(Bitmap bitmap) throws Exception {
                    return C25292b.this.mo88415a(bitmap);
                }
            }).observeOn(C68279a.m265023b()).flatMap(new Function<File, ObservableSource<String>>() {
                /* class com.larksuite.component.openplatform.core.plugin.messenger.share.C25292b.C252964 */

                /* renamed from: a */
                public ObservableSource<String> apply(final File file) throws Exception {
                    return Observable.create(new ObservableOnSubscribe<String>() {
                        /* class com.larksuite.component.openplatform.core.plugin.messenger.share.C25292b.C252964.C252971 */

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
                                /* class com.larksuite.component.openplatform.core.plugin.messenger.share.C25292b.C252964.C252971.C252981 */

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
                /* class com.larksuite.component.openplatform.core.plugin.messenger.share.C25292b.C252942 */

                /* renamed from: a */
                public void accept(String str) throws Exception {
                    boolean z;
                    C13149b.m53755a();
                    String a = C13047a.C13048a.m53531a();
                    if (C25292b.this.getAppContext().getCurrentActivity() != null) {
                        Uri.Builder appendQueryParameter = Uri.parse(a).buildUpon().appendQueryParameter("appId", C67432a.m262319a(C25292b.this.getAppContext()).getAppInfo().appId);
                        if (!TextUtils.isEmpty(str2)) {
                            appendQueryParameter.appendQueryParameter("path", Uri.decode(str2));
                        }
                        if (!TextUtils.isEmpty(a)) {
                            appendQueryParameter.appendQueryParameter("launch_mode", a);
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
                            str2 = C67432a.m262319a(C25292b.this.getAppContext()).getAppInfo().appName;
                        }
                        LarkExtensionManager.getInstance().getExtension().mo49613a(false, C67432a.m262319a(C25292b.this.getAppContext()).getAppInfo().appId, str2, "", builder, appendQueryParameter.build().toString(), z, str, C25292b.this.getAppContext());
                    }
                }
            }, new Consumer<Throwable>() {
                /* class com.larksuite.component.openplatform.core.plugin.messenger.share.C25292b.C252953 */

                /* renamed from: a */
                public void accept(Throwable th) throws Exception {
                    C13149b.m53755a();
                    Application applicationContext = AppbrandContext.getInst().getApplicationContext();
                    C13149b.m53757a(applicationContext, applicationContext.getResources().getString(R.string.lark_brand_share_failed));
                    AppBrandLogger.m52829e("LarkShareAppMessageCtrl", "share failed: " + th);
                    C25292b.this.callbackExtraInfoMsg(false, th.getMessage());
                }
            });
        }
    }
}
