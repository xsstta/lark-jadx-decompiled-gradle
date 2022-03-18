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
import com.larksuite.component.openplatform.core.plugin.media.SaveVideoToPhotosAlbumHandlerPlugin;
import com.larksuite.framework.apiplugin.LKEvent;
import com.larksuite.framework.apiplugin.annotation.LKPluginFunction;
import com.larksuite.framework.apiplugin.annotation.LKRequiredParam;
import com.larksuite.framework.apiplugin.common.C25920a;
import com.larksuite.framework.apiplugin.common.C25921b;
import com.larksuite.framework.apiplugin.p1175a.AbstractC25895f;
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

public class SaveVideoToPhotosAlbumHandlerPlugin extends OPPlugin {
    private static final HashSet<String> VIDEO_TYPE_SET;
    public ILogger mILogger;
    private AbstractC25897h<SaveVideoToPhotosAlbumHandlerResponse> mInvokeCallback;

    /* access modifiers changed from: private */
    public static class SaveVideoToPhotosAlbumHandlerRequest extends C25920a {
        @JSONField(name = "filePath")
        @LKRequiredParam
        public String filePath;

        private SaveVideoToPhotosAlbumHandlerRequest() {
        }
    }

    /* access modifiers changed from: private */
    public static class SaveVideoToPhotosAlbumHandlerResponse extends C25921b {
        private SaveVideoToPhotosAlbumHandlerResponse() {
        }
    }

    @Override // com.larksuite.component.openplatform.core.plugin.OPPlugin, com.larksuite.framework.apiplugin.AbstractC25937e
    public void onRelease() {
        this.mInvokeCallback = null;
        super.onRelease();
    }

    static {
        HashSet<String> hashSet = new HashSet<>();
        VIDEO_TYPE_SET = hashSet;
        hashSet.add(".mp4");
        hashSet.add(".3gp");
        hashSet.add(".mpeg");
        hashSet.add(".avi");
        hashSet.add(".mov");
        hashSet.add(".wmv");
        hashSet.add(".vob");
        hashSet.add(".m4v");
        hashSet.add(".webm");
        hashSet.add(".rmvb");
        hashSet.add(".mkv");
        hashSet.add(".f4v");
        hashSet.add(".flv");
    }

    private boolean isVideo(String str) {
        int lastIndexOf;
        if (!TextUtils.isEmpty(str) && (lastIndexOf = str.lastIndexOf(".")) >= 0) {
            return VIDEO_TYPE_SET.contains(str.substring(lastIndexOf).toLowerCase());
        }
        return false;
    }

    private SaveVideoToPhotosAlbumHandlerResponse standardSaveVideo(String str, LKEvent lKEvent) {
        SaveVideoToPhotosAlbumHandlerResponse saveVideoToPhotosAlbumHandlerResponse = new SaveVideoToPhotosAlbumHandlerResponse();
        this.mILogger.mo92224i("tma_SaveVideoToPhotosAlbumHandlerPlugin", "standard save video");
        if (TTFileHelper.m264257a().isCryptoToastDisable() || !C12784c.m52844a()) {
            AbstractC67722a aVar = (AbstractC67722a) getAppContext().findServiceByInterface(AbstractC67722a.class);
            TTFile gVar = new TTFile(str);
            TTFileContext hVar = new TTFileContext(lKEvent.mo92134c().mo92188a(), lKEvent.mo92146m());
            try {
                if (!gVar.mo235649c()) {
                    C25906a aVar2 = C25906a.f64072b;
                    fillFailedResponse(saveVideoToPhotosAlbumHandlerResponse, aVar2, "filePath invalid, ttfile:" + gVar);
                    return saveVideoToPhotosAlbumHandlerResponse;
                }
                File i = aVar.mo235635i(gVar, hVar);
                if (!isVideo(str)) {
                    this.mILogger.mo92223e("tma_SaveVideoToPhotosAlbumHandlerPlugin", "not video: ", str);
                    C25906a aVar3 = C25906a.f64080j;
                    fillFailedResponse(saveVideoToPhotosAlbumHandlerResponse, aVar3, "file is not video: " + str);
                    return saveVideoToPhotosAlbumHandlerResponse;
                }
                try {
                    Context applicationContext = getAppContext().getApplicationContext();
                    applicationContext.sendBroadcast(new Intent("android.intent.action.MEDIA_SCANNER_SCAN_FILE", MediaStoreHelper.m53185a(applicationContext, i, System.currentTimeMillis() + i.getName())));
                } catch (Exception e) {
                    AppBrandLogger.m52829e("tma_SaveVideoToPhotosAlbumHandlerPlugin", "saveVideo exception", e);
                    C25906a aVar4 = C25906a.f64080j;
                    fillFailedResponse(saveVideoToPhotosAlbumHandlerResponse, aVar4, "saveImage exception:" + e.getMessage());
                }
                return saveVideoToPhotosAlbumHandlerResponse;
            } catch (TTFileException e2) {
                this.mILogger.mo92223e("tma_SaveVideoToPhotosAlbumHandlerPlugin", "get system file exception", e2);
                if (e2.getTtFileError() == TTFileError.f171110l) {
                    C25912g gVar2 = C25912g.f64147e;
                    fillFailedResponse(saveVideoToPhotosAlbumHandlerResponse, gVar2, "file not exists:" + gVar);
                    ILogger aVar5 = this.mILogger;
                    aVar5.mo92224i("tma_SaveVideoToPhotosAlbumHandlerPlugin", "file not exists:" + gVar);
                } else if (e2.getTtFileError() == TTBizError.f171093b) {
                    C25906a aVar6 = C25906a.f64072b;
                    fillFailedResponse(saveVideoToPhotosAlbumHandlerResponse, aVar6, "filePath invalid, ttfile:" + gVar);
                } else {
                    C25906a aVar7 = C25906a.f64080j;
                    fillFailedResponse(saveVideoToPhotosAlbumHandlerResponse, aVar7, "internal error, error code:" + e2.getTtFileError().mo235661a());
                }
                return saveVideoToPhotosAlbumHandlerResponse;
            }
        } else {
            this.mILogger.mo92224i("tma_SaveVideoToPhotosAlbumHandlerPlugin", "file is encrypt,can not save");
            Toast.showText(getApiDependency().mo235051f(), getAppContext().getCurrentActivity().getString(R.string.OpenPlatform_Workplace_SafetyWarning_SaveFailed));
            fillFailedResponse(saveVideoToPhotosAlbumHandlerResponse, C25906a.f64080j, "crypto is enable");
            return saveVideoToPhotosAlbumHandlerResponse;
        }
    }

    public void saveVideo(LKEvent lKEvent, String str, AbstractC25897h<SaveVideoToPhotosAlbumHandlerResponse> hVar) {
        if (TTFileHelper.m264259a(lKEvent.mo92146m(), getAppContext())) {
            hVar.callback(standardSaveVideo(str, lKEvent));
            return;
        }
        SaveVideoToPhotosAlbumHandlerResponse saveVideoToPhotosAlbumHandlerResponse = new SaveVideoToPhotosAlbumHandlerResponse();
        if (TextUtils.isEmpty(str)) {
            this.mILogger.mo92223e("tma_SaveVideoToPhotosAlbumHandlerPlugin", "invalid filePath: ", str);
            C25906a aVar = C25906a.f64072b;
            fillFailedResponse(saveVideoToPhotosAlbumHandlerResponse, aVar, "invalid filePath:" + str);
            hVar.callback(saveVideoToPhotosAlbumHandlerResponse);
            return;
        }
        File b = getApiDependency().mo235038b(str);
        if (!b.exists()) {
            this.mILogger.mo92223e("tma_SaveVideoToPhotosAlbumHandlerPlugin", "file not exist: ", str);
            C25912g gVar = C25912g.f64147e;
            fillFailedResponse(saveVideoToPhotosAlbumHandlerResponse, gVar, "file not exist: " + str);
            hVar.callback(saveVideoToPhotosAlbumHandlerResponse);
        } else if (!getApiDependency().mo235035a(b)) {
            C25906a aVar2 = C25906a.f64080j;
            fillFailedResponse(saveVideoToPhotosAlbumHandlerResponse, aVar2, "file can not read: " + str);
            hVar.callback(saveVideoToPhotosAlbumHandlerResponse);
            this.mILogger.mo92224i("tma_SaveVideoToPhotosAlbumHandlerPlugin", ApiCallResultHelper.generateFilePermissionDenyInfo("read", str), ", no read permission");
        } else if (!isVideo(str)) {
            this.mILogger.mo92223e("tma_SaveVideoToPhotosAlbumHandlerPlugin", "not video: ", str);
            C25906a aVar3 = C25906a.f64080j;
            fillFailedResponse(saveVideoToPhotosAlbumHandlerResponse, aVar3, "file is not video: " + str);
            hVar.callback(saveVideoToPhotosAlbumHandlerResponse);
        } else {
            try {
                Context applicationContext = getAppContext().getApplicationContext();
                applicationContext.sendBroadcast(new Intent("android.intent.action.MEDIA_SCANNER_SCAN_FILE", MediaStoreHelper.m53185a(applicationContext, b, System.currentTimeMillis() + b.getName())));
            } catch (Exception e) {
                AppBrandLogger.m52829e("tma_SaveVideoToPhotosAlbumHandlerPlugin", "saveVideo exception", e);
                C25906a aVar4 = C25906a.f64080j;
                fillFailedResponse(saveVideoToPhotosAlbumHandlerResponse, aVar4, "saveImage exception:" + e.getMessage());
            }
            hVar.callback(saveVideoToPhotosAlbumHandlerResponse);
        }
    }

    @LKPluginFunction(async = true, eventName = {"saveVideoToPhotosAlbum"})
    public void saveVideoToPhotosAlbumHandlerAsync(LKEvent lKEvent, SaveVideoToPhotosAlbumHandlerRequest saveVideoToPhotosAlbumHandlerRequest, AbstractC25895f fVar, AbstractC25897h<SaveVideoToPhotosAlbumHandlerResponse> hVar) {
        this.mInvokeCallback = hVar;
        SaveVideoToPhotosAlbumHandlerResponse saveVideoToPhotosAlbumHandlerResponse = new SaveVideoToPhotosAlbumHandlerResponse();
        this.mILogger = fVar.mo92190b();
        if (getAppContext() == null) {
            this.mILogger.mo92223e("tma_SaveVideoToPhotosAlbumHandlerPlugin", "app context is null");
            fillFailedResponse(saveVideoToPhotosAlbumHandlerResponse, C25906a.f64080j, "app context is null");
            hVar.callback(saveVideoToPhotosAlbumHandlerResponse);
            return;
        }
        Activity f = getApiDependency().mo235051f();
        if (f == null) {
            this.mILogger.mo92223e("tma_SaveVideoToPhotosAlbumHandlerPlugin", lKEvent.mo92146m(), " activity is null");
            fillFailedResponse(saveVideoToPhotosAlbumHandlerResponse, C25906a.f64080j, "activity is null");
            hVar.callback(saveVideoToPhotosAlbumHandlerResponse);
            return;
        }
        saveVideoToPhotosAlbum(lKEvent, saveVideoToPhotosAlbumHandlerRequest, fVar, f, hVar);
    }

    private void saveVideoToPhotosAlbum(final LKEvent lKEvent, final SaveVideoToPhotosAlbumHandlerRequest saveVideoToPhotosAlbumHandlerRequest, AbstractC25895f fVar, final Activity activity, final AbstractC25897h<SaveVideoToPhotosAlbumHandlerResponse> hVar) {
        this.mILogger.mo92224i("tma_SaveVideoToPhotosAlbumHandlerPlugin", "saveVideoToPhotosAlbum enter");
        final SaveVideoToPhotosAlbumHandlerResponse saveVideoToPhotosAlbumHandlerResponse = new SaveVideoToPhotosAlbumHandlerResponse();
        getApiDependency().mo235021a(activity, lKEvent.mo92146m(), C66578b.C66579a.m260121f(getAppContext()), new AbstractC67709b.AbstractC67711b() {
            /* class com.larksuite.component.openplatform.core.plugin.media.SaveVideoToPhotosAlbumHandlerPlugin.C250251 */

            @Override // com.tt.refer.p3400a.p3401a.AbstractC67709b.AbstractC67711b
            /* renamed from: a */
            public void mo87574a() {
                HashSet hashSet = new HashSet();
                hashSet.add("android.permission.WRITE_EXTERNAL_STORAGE");
                hashSet.add("android.permission.READ_EXTERNAL_STORAGE");
                SaveVideoToPhotosAlbumHandlerPlugin.this.getApiDependency().mo235022a(activity, lKEvent.mo92146m(), hashSet, new AbstractC67709b.AbstractC67711b() {
                    /* class com.larksuite.component.openplatform.core.plugin.media.SaveVideoToPhotosAlbumHandlerPlugin.C250251.C250261 */

                    @Override // com.tt.refer.p3400a.p3401a.AbstractC67709b.AbstractC67711b
                    /* renamed from: a */
                    public void mo87574a() {
                        Observable.create(new ObservableOnSubscribe(lKEvent, saveVideoToPhotosAlbumHandlerRequest, hVar) {
                            /* class com.larksuite.component.openplatform.core.plugin.media.$$Lambda$SaveVideoToPhotosAlbumHandlerPlugin$1$1$3LC6r0VGpLE2991ovmfRSs8c68 */
                            public final /* synthetic */ LKEvent f$1;
                            public final /* synthetic */ SaveVideoToPhotosAlbumHandlerPlugin.SaveVideoToPhotosAlbumHandlerRequest f$2;
                            public final /* synthetic */ AbstractC25897h f$3;

                            {
                                this.f$1 = r2;
                                this.f$2 = r3;
                                this.f$3 = r4;
                            }

                            @Override // io.reactivex.ObservableOnSubscribe
                            public final void subscribe(ObservableEmitter observableEmitter) {
                                SaveVideoToPhotosAlbumHandlerPlugin.C250251.C250261.this.m90294a(this.f$1, this.f$2, this.f$3, observableEmitter);
                            }
                        }).subscribeOn(C68279a.m265023b()).subscribe();
                    }

                    @Override // com.tt.refer.p3400a.p3401a.AbstractC67709b.AbstractC67711b
                    /* renamed from: a */
                    public void mo87575a(String str) {
                        SaveVideoToPhotosAlbumHandlerPlugin.this.mILogger.mo92224i("tma_SaveVideoToPhotosAlbumHandlerPlugin", "saveVideoToPhotosAlbum SDCARD denied");
                        SaveVideoToPhotosAlbumHandlerPlugin.this.fillFailedResponse(saveVideoToPhotosAlbumHandlerResponse, C25906a.f64075e, "saveVideoToPhotosAlbum system auth deny");
                        hVar.callback(saveVideoToPhotosAlbumHandlerResponse);
                    }

                    /* access modifiers changed from: private */
                    /* renamed from: a */
                    public /* synthetic */ void m90294a(LKEvent lKEvent, SaveVideoToPhotosAlbumHandlerRequest saveVideoToPhotosAlbumHandlerRequest, AbstractC25897h hVar, ObservableEmitter observableEmitter) throws Exception {
                        SaveVideoToPhotosAlbumHandlerPlugin.this.saveVideo(lKEvent, saveVideoToPhotosAlbumHandlerRequest.filePath, hVar);
                    }
                });
            }

            @Override // com.tt.refer.p3400a.p3401a.AbstractC67709b.AbstractC67711b
            /* renamed from: a */
            public void mo87575a(String str) {
                SaveVideoToPhotosAlbumHandlerPlugin.this.mILogger.mo92224i("tma_SaveVideoToPhotosAlbumHandlerPlugin", "saveVideoToPhotosAlbum ALBUM denied");
                SaveVideoToPhotosAlbumHandlerPlugin.this.fillFailedResponse(saveVideoToPhotosAlbumHandlerResponse, C25906a.f64076f, "saveVideoToPhotosAlbum user auth deny");
                hVar.callback(saveVideoToPhotosAlbumHandlerResponse);
            }
        });
    }
}
