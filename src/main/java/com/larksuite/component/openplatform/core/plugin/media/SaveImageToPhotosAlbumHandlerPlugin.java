package com.larksuite.component.openplatform.core.plugin.media;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.alibaba.fastjson.annotation.JSONField;
import com.bytedance.ee.bear.facade.common.widget.Toast;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.lark.infra.foundation.utils.C12784c;
import com.bytedance.ee.lark.infra.storage.filemanager.vivocompat.MediaStoreHelper;
import com.larksuite.component.openplatform.core.plugin.OPPlugin;
import com.larksuite.component.openplatform.core.plugin.media.SaveImageToPhotosAlbumHandlerPlugin;
import com.larksuite.framework.apiplugin.LKEvent;
import com.larksuite.framework.apiplugin.annotation.LKPluginFunction;
import com.larksuite.framework.apiplugin.annotation.LKRequiredParam;
import com.larksuite.framework.apiplugin.common.C25920a;
import com.larksuite.framework.apiplugin.common.C25921b;
import com.larksuite.framework.apiplugin.p1175a.AbstractC25897h;
import com.larksuite.framework.apiplugin.p1176b.C25906a;
import com.larksuite.framework.apiplugin.p1176b.C25912g;
import com.larksuite.suite.R;
import com.ss.android.lark.optrace.api.ILogger;
import com.tt.frontendapiinterface.ApiCallResultHelper;
import com.tt.miniapp.permission.C66578b;
import com.tt.refer.impl.business.file.TTBizError;
import com.tt.refer.impl.business.file.TTFile;
import com.tt.refer.impl.business.file.TTFileContext;
import com.tt.refer.impl.business.file.TTFileError;
import com.tt.refer.impl.business.file.TTFileException;
import com.tt.refer.impl.business.file.TTFileHelper;
import com.tt.refer.p3400a.p3401a.AbstractC67709b;
import com.tt.refer.p3400a.p3407e.AbstractC67722a;
import io.reactivex.Observable;
import io.reactivex.ObservableEmitter;
import io.reactivex.ObservableOnSubscribe;
import io.reactivex.p3456d.C68279a;
import java.io.File;
import java.util.HashSet;

public class SaveImageToPhotosAlbumHandlerPlugin extends OPPlugin {
    private static final HashSet<String> IMAGE_TYPE_SET;
    public ILogger mILogger;

    /* access modifiers changed from: private */
    public static class SaveImageToPhotosAlbumHandlerRequest extends C25920a {
        @JSONField(name = "filePath")
        @LKRequiredParam
        public String filePath;

        private SaveImageToPhotosAlbumHandlerRequest() {
        }
    }

    /* access modifiers changed from: private */
    public static class SaveImageToPhotosAlbumHandlerResponse extends C25921b {
        private SaveImageToPhotosAlbumHandlerResponse() {
        }
    }

    static {
        HashSet<String> hashSet = new HashSet<>();
        IMAGE_TYPE_SET = hashSet;
        hashSet.add(".jpg");
        hashSet.add(".png");
        hashSet.add(".bmp");
        hashSet.add(".gif");
        hashSet.add(".jpeg");
        hashSet.add(".webp");
    }

    private boolean isImage(String str) {
        int lastIndexOf;
        if (!TextUtils.isEmpty(str) && (lastIndexOf = str.lastIndexOf(".")) >= 0) {
            return IMAGE_TYPE_SET.contains(str.substring(lastIndexOf).toLowerCase());
        }
        return false;
    }

    private SaveImageToPhotosAlbumHandlerResponse standardSaveImage(SaveImageToPhotosAlbumHandlerRequest saveImageToPhotosAlbumHandlerRequest, LKEvent lKEvent) {
        SaveImageToPhotosAlbumHandlerResponse saveImageToPhotosAlbumHandlerResponse = new SaveImageToPhotosAlbumHandlerResponse();
        this.mILogger.mo92224i("SaveImageToPhotosAlbumHandlerPlugin", "standard saveImage>>>");
        if (TTFileHelper.m264257a().isCryptoToastDisable() || !C12784c.m52844a()) {
            AbstractC67722a aVar = (AbstractC67722a) getAppContext().findServiceByInterface(AbstractC67722a.class);
            TTFile gVar = new TTFile(saveImageToPhotosAlbumHandlerRequest.filePath);
            TTFileContext hVar = new TTFileContext(lKEvent.mo92134c().mo92188a(), lKEvent.mo92146m());
            try {
                if (!gVar.mo235649c()) {
                    C25906a aVar2 = C25906a.f64072b;
                    fillFailedResponse(saveImageToPhotosAlbumHandlerResponse, aVar2, "filePath invalid, ttfile:" + gVar);
                    return saveImageToPhotosAlbumHandlerResponse;
                }
                File i = aVar.mo235635i(gVar, hVar);
                if (!isImage(saveImageToPhotosAlbumHandlerRequest.filePath)) {
                    fillFailedResponse(saveImageToPhotosAlbumHandlerResponse, C25906a.f64080j, "file is not image");
                    this.mILogger.mo92224i("SaveImageToPhotosAlbumHandlerPlugin", "file is not image");
                    return saveImageToPhotosAlbumHandlerResponse;
                }
                try {
                    Context applicationContext = getAppContext().getApplicationContext();
                    applicationContext.sendBroadcast(new Intent("android.intent.action.MEDIA_SCANNER_SCAN_FILE", MediaStoreHelper.m53185a(applicationContext, i, System.currentTimeMillis() + i.getName())));
                } catch (Exception e) {
                    AppBrandLogger.m52829e("SaveImageToPhotosAlbumHandlerPlugin", "standard saveImage exception", e);
                    C25906a aVar3 = C25906a.f64080j;
                    fillFailedResponse(saveImageToPhotosAlbumHandlerResponse, aVar3, "standard saveImage exception:" + e.getMessage());
                }
                return saveImageToPhotosAlbumHandlerResponse;
            } catch (TTFileException e2) {
                this.mILogger.mo92223e("SaveImageToPhotosAlbumHandlerPlugin", "get system file exception", e2);
                if (e2.getTtFileError() == TTFileError.f171110l) {
                    C25912g gVar2 = C25912g.f64147e;
                    fillFailedResponse(saveImageToPhotosAlbumHandlerResponse, gVar2, "file not exists:" + gVar);
                    ILogger aVar4 = this.mILogger;
                    aVar4.mo92224i("SaveImageToPhotosAlbumHandlerPlugin", "file not exists:" + gVar);
                } else if (e2.getTtFileError() == TTBizError.f171093b) {
                    C25906a aVar5 = C25906a.f64072b;
                    fillFailedResponse(saveImageToPhotosAlbumHandlerResponse, aVar5, "filePath invalid, ttfile:" + gVar);
                } else {
                    C25906a aVar6 = C25906a.f64080j;
                    fillFailedResponse(saveImageToPhotosAlbumHandlerResponse, aVar6, "internal error, error code:" + e2.getTtFileError().mo235661a());
                }
                return saveImageToPhotosAlbumHandlerResponse;
            }
        } else {
            AppBrandLogger.m52830i("SaveImageToPhotosAlbumHandlerPlugin", "file is encrypt,can not save");
            Toast.showText(getApiDependency().mo235051f(), getAppContext().getCurrentActivity().getString(R.string.OpenPlatform_Workplace_SafetyWarning_SaveFailed));
            fillFailedResponse(saveImageToPhotosAlbumHandlerResponse, C25906a.f64080j, "crypto is enable");
            return saveImageToPhotosAlbumHandlerResponse;
        }
    }

    public void saveImage(SaveImageToPhotosAlbumHandlerRequest saveImageToPhotosAlbumHandlerRequest, LKEvent lKEvent, AbstractC25897h<SaveImageToPhotosAlbumHandlerResponse> hVar) {
        if (TTFileHelper.m264259a(lKEvent.mo92146m(), getAppContext())) {
            hVar.callback(standardSaveImage(saveImageToPhotosAlbumHandlerRequest, lKEvent));
            return;
        }
        SaveImageToPhotosAlbumHandlerResponse saveImageToPhotosAlbumHandlerResponse = new SaveImageToPhotosAlbumHandlerResponse();
        this.mILogger.mo92224i("SaveImageToPhotosAlbumHandlerPlugin", "saveImage>>>");
        String str = saveImageToPhotosAlbumHandlerRequest.filePath;
        if (TextUtils.isEmpty(str)) {
            fillFailedResponse(saveImageToPhotosAlbumHandlerResponse, C25906a.f64072b, "filePath in empty");
            hVar.callback(saveImageToPhotosAlbumHandlerResponse);
            return;
        }
        File b = getApiDependency().mo235038b(str);
        if (!b.exists()) {
            C25912g gVar = C25912g.f64147e;
            fillFailedResponse(saveImageToPhotosAlbumHandlerResponse, gVar, "file not exists:" + str);
            hVar.callback(saveImageToPhotosAlbumHandlerResponse);
            ILogger aVar = this.mILogger;
            aVar.mo92224i("SaveImageToPhotosAlbumHandlerPlugin", "file not exists:" + str);
        } else if (!getApiDependency().mo235035a(b)) {
            fillFailedResponse(saveImageToPhotosAlbumHandlerResponse, C25906a.f64080j, "file can not read:");
            hVar.callback(saveImageToPhotosAlbumHandlerResponse);
            this.mILogger.mo92224i("SaveImageToPhotosAlbumHandlerPlugin", ApiCallResultHelper.generateFilePermissionDenyInfo("read", str));
        } else if (!isImage(str)) {
            fillFailedResponse(saveImageToPhotosAlbumHandlerResponse, C25906a.f64080j, "file is not image");
            hVar.callback(saveImageToPhotosAlbumHandlerResponse);
            this.mILogger.mo92224i("SaveImageToPhotosAlbumHandlerPlugin", "file is not image");
        } else {
            try {
                Context applicationContext = getAppContext().getApplicationContext();
                applicationContext.sendBroadcast(new Intent("android.intent.action.MEDIA_SCANNER_SCAN_FILE", MediaStoreHelper.m53185a(applicationContext, b, System.currentTimeMillis() + b.getName())));
            } catch (Exception e) {
                AppBrandLogger.m52829e("SaveImageToPhotosAlbumHandlerPlugin", "saveImage exception", e);
                C25906a aVar2 = C25906a.f64080j;
                fillFailedResponse(saveImageToPhotosAlbumHandlerResponse, aVar2, "saveImage exception:" + e.getMessage());
            }
            hVar.callback(saveImageToPhotosAlbumHandlerResponse);
        }
    }

    private void saveImageToPhotosAlbum(final Activity activity, final SaveImageToPhotosAlbumHandlerRequest saveImageToPhotosAlbumHandlerRequest, final LKEvent lKEvent, final AbstractC25897h<SaveImageToPhotosAlbumHandlerResponse> hVar) {
        final SaveImageToPhotosAlbumHandlerResponse saveImageToPhotosAlbumHandlerResponse = new SaveImageToPhotosAlbumHandlerResponse();
        getApiDependency().mo235021a(activity, lKEvent.mo92146m(), C66578b.C66579a.m260121f(getAppContext()), new AbstractC67709b.AbstractC67711b() {
            /* class com.larksuite.component.openplatform.core.plugin.media.SaveImageToPhotosAlbumHandlerPlugin.C250231 */

            @Override // com.tt.refer.p3400a.p3401a.AbstractC67709b.AbstractC67711b
            /* renamed from: a */
            public void mo87574a() {
                SaveImageToPhotosAlbumHandlerPlugin.this.mILogger.mo92224i("SaveImageToPhotosAlbumHandlerPlugin", "requestAppPermission>>> onGranted");
                HashSet hashSet = new HashSet();
                hashSet.add("android.permission.WRITE_EXTERNAL_STORAGE");
                hashSet.add("android.permission.READ_EXTERNAL_STORAGE");
                SaveImageToPhotosAlbumHandlerPlugin.this.getApiDependency().mo235022a(activity, lKEvent.mo92146m(), hashSet, new AbstractC67709b.AbstractC67711b() {
                    /* class com.larksuite.component.openplatform.core.plugin.media.SaveImageToPhotosAlbumHandlerPlugin.C250231.C250241 */

                    @Override // com.tt.refer.p3400a.p3401a.AbstractC67709b.AbstractC67711b
                    /* renamed from: a */
                    public void mo87574a() {
                        SaveImageToPhotosAlbumHandlerPlugin.this.mILogger.mo92224i("SaveImageToPhotosAlbumHandlerPlugin", "requestSystemPermission>>> onGranted");
                        Observable.create(new ObservableOnSubscribe(saveImageToPhotosAlbumHandlerRequest, lKEvent, hVar) {
                            /* class com.larksuite.component.openplatform.core.plugin.media.$$Lambda$SaveImageToPhotosAlbumHandlerPlugin$1$1$U14ZHh6sjb49OiRds9CpwlJxiFM */
                            public final /* synthetic */ SaveImageToPhotosAlbumHandlerPlugin.SaveImageToPhotosAlbumHandlerRequest f$1;
                            public final /* synthetic */ LKEvent f$2;
                            public final /* synthetic */ AbstractC25897h f$3;

                            {
                                this.f$1 = r2;
                                this.f$2 = r3;
                                this.f$3 = r4;
                            }

                            @Override // io.reactivex.ObservableOnSubscribe
                            public final void subscribe(ObservableEmitter observableEmitter) {
                                SaveImageToPhotosAlbumHandlerPlugin.C250231.C250241.this.m90289a(this.f$1, this.f$2, this.f$3, observableEmitter);
                            }
                        }).subscribeOn(C68279a.m265023b()).subscribe();
                    }

                    @Override // com.tt.refer.p3400a.p3401a.AbstractC67709b.AbstractC67711b
                    /* renamed from: a */
                    public void mo87575a(String str) {
                        SaveImageToPhotosAlbumHandlerPlugin.this.mILogger.mo92224i("SaveImageToPhotosAlbumHandlerPlugin", "requestSystemPermission>>> onDenied");
                        SaveImageToPhotosAlbumHandlerPlugin.this.fillFailedResponse(saveImageToPhotosAlbumHandlerResponse, C25906a.f64075e, "request SystemPermission >>> onDenied");
                        hVar.callback(saveImageToPhotosAlbumHandlerResponse);
                    }

                    /* access modifiers changed from: private */
                    /* renamed from: a */
                    public /* synthetic */ void m90289a(SaveImageToPhotosAlbumHandlerRequest saveImageToPhotosAlbumHandlerRequest, LKEvent lKEvent, AbstractC25897h hVar, ObservableEmitter observableEmitter) throws Exception {
                        SaveImageToPhotosAlbumHandlerPlugin.this.saveImage(saveImageToPhotosAlbumHandlerRequest, lKEvent, hVar);
                    }
                });
            }

            @Override // com.tt.refer.p3400a.p3401a.AbstractC67709b.AbstractC67711b
            /* renamed from: a */
            public void mo87575a(String str) {
                SaveImageToPhotosAlbumHandlerPlugin.this.mILogger.mo92224i("SaveImageToPhotosAlbumHandlerPlugin", "requestAppPermission>>> onDenied");
                SaveImageToPhotosAlbumHandlerPlugin.this.fillFailedResponse(saveImageToPhotosAlbumHandlerResponse, C25906a.f64076f, "request AppPermission >>> onDenied");
                hVar.callback(saveImageToPhotosAlbumHandlerResponse);
            }
        });
    }

    @LKPluginFunction(async = true, eventName = {"saveImageToPhotosAlbum"})
    public void SaveImageToPhotosAlbumHandlerAsync(LKEvent lKEvent, SaveImageToPhotosAlbumHandlerRequest saveImageToPhotosAlbumHandlerRequest, ILogger aVar, AbstractC25897h<SaveImageToPhotosAlbumHandlerResponse> hVar) {
        SaveImageToPhotosAlbumHandlerResponse saveImageToPhotosAlbumHandlerResponse = new SaveImageToPhotosAlbumHandlerResponse();
        this.mILogger = aVar;
        aVar.mo92224i("SaveImageToPhotosAlbumHandlerPlugin", "invoke api");
        Activity f = getApiDependency().mo235051f();
        if (f == null) {
            fillFailedResponse(saveImageToPhotosAlbumHandlerResponse, C25906a.f64080j, "activity in null");
            hVar.callback(saveImageToPhotosAlbumHandlerResponse);
            this.mILogger.mo92224i("SaveImageToPhotosAlbumHandlerPlugin", "activity is null");
            return;
        }
        saveImageToPhotosAlbum(f, saveImageToPhotosAlbumHandlerRequest, lKEvent, hVar);
    }
}
