package com.larksuite.component.openplatform.core.plugin.media;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.bytedance.ee.lark.infra.storage.filemanager.vivocompat.MediaStoreHelper;
import com.larksuite.component.openplatform.core.plugin.media.C25044f;
import com.tt.frontendapiinterface.ApiCallResultHelper;
import com.tt.miniapp.errorcode.ApiCode;
import com.tt.miniapp.p3260b.p3261a.p3262a.AbstractC65797c;
import com.tt.miniapp.permission.C66578b;
import com.tt.refer.common.annotation.ApiSupportType;
import com.tt.refer.common.base.AppType;
import com.tt.refer.p3400a.p3401a.AbstractC67709b;
import com.tt.refer.p3400a.p3401a.p3402a.C67701b;
import io.reactivex.Observable;
import io.reactivex.ObservableEmitter;
import io.reactivex.ObservableOnSubscribe;
import io.reactivex.p3456d.C68279a;
import java.io.File;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

@ApiSupportType(apiName = {"saveImageToPhotosAlbum"}, support = {AppType.WebAPP, AppType.GadgetAPP})
/* renamed from: com.larksuite.component.openplatform.core.plugin.media.f */
public class C25044f extends AbstractC65797c {

    /* renamed from: a */
    private static final HashSet<String> f61179a;

    public C25044f() {
    }

    @Override // com.tt.miniapp.p3260b.p3261a.p3262a.AbstractC65792a
    /* renamed from: a */
    public List<String> mo87215a() {
        return Collections.singletonList("saveImageToPhotosAlbum");
    }

    static {
        HashSet<String> hashSet = new HashSet<>();
        f61179a = hashSet;
        hashSet.add(".jpg");
        hashSet.add(".png");
        hashSet.add(".bmp");
        hashSet.add(".gif");
        hashSet.add(".jpeg");
        hashSet.add(".webp");
    }

    /* renamed from: b */
    public void mo88095b() {
        String str = (String) this.f165820j.mo234984a("filePath");
        if (TextUtils.isEmpty(str)) {
            mo230481a(ApiCode.SAVEIMAGETOPHOTOSALBUM_PATH_EMPTY);
            return;
        }
        File b = mo230475h().mo235038b(str);
        if (!b.exists()) {
            mo230481a(ApiCode.SAVEIMAGETOPHOTOSALBUM_INVALID_FILEPATH);
            AppBrandLogger.m52830i("tma_ApiSaveImageToPhotosAlbumCtrl", "file not exists:" + str);
        } else if (!mo230475h().mo235035a(b)) {
            mo230481a(ApiCode.GENERAL_FILE_CAN_NOT_READ);
            AppBrandLogger.m52830i("tma_ApiSaveImageToPhotosAlbumCtrl", ApiCallResultHelper.generateFilePermissionDenyInfo("read", str));
        } else if (!m90350a(str)) {
            mo230481a(ApiCode.SAVEIMAGETOPHOTOSALBUM_INVALID_IMAGE_DATA);
            AppBrandLogger.m52830i("tma_ApiSaveImageToPhotosAlbumCtrl", "file is not image");
        } else {
            try {
                Context applicationContext = mo230473f().getApplicationContext();
                applicationContext.sendBroadcast(new Intent("android.intent.action.MEDIA_SCANNER_SCAN_FILE", MediaStoreHelper.m53185a(applicationContext, b, System.currentTimeMillis() + b.getName())));
                mo230494j();
            } catch (Exception e) {
                AppBrandLogger.m52829e("tma_ApiSaveImageToPhotosAlbumCtrl", "saveImage exception", e);
                mo230481a(ApiCode.GENERAL_UNKONW_ERROR);
            }
        }
    }

    /* renamed from: a */
    private void m90349a(final Activity activity) {
        mo230475h().mo235021a(activity, mo230472e(), C66578b.C66579a.m260121f(mo230473f()), new AbstractC67709b.AbstractC67711b() {
            /* class com.larksuite.component.openplatform.core.plugin.media.C25044f.C250451 */

            @Override // com.tt.refer.p3400a.p3401a.AbstractC67709b.AbstractC67711b
            /* renamed from: a */
            public void mo87574a() {
                HashSet hashSet = new HashSet();
                hashSet.add("android.permission.WRITE_EXTERNAL_STORAGE");
                hashSet.add("android.permission.READ_EXTERNAL_STORAGE");
                C25044f.this.mo230475h().mo235022a(activity, C25044f.this.mo230472e(), hashSet, new AbstractC67709b.AbstractC67711b() {
                    /* class com.larksuite.component.openplatform.core.plugin.media.C25044f.C250451.C250461 */

                    @Override // com.tt.refer.p3400a.p3401a.AbstractC67709b.AbstractC67711b
                    /* renamed from: a */
                    public void mo87574a() {
                        Observable.create(new ObservableOnSubscribe() {
                            /* class com.larksuite.component.openplatform.core.plugin.media.$$Lambda$f$1$1$NnwvtyRNJ4YYzBywD9aS_kC4jbs */

                            @Override // io.reactivex.ObservableOnSubscribe
                            public final void subscribe(ObservableEmitter observableEmitter) {
                                C25044f.C250451.C250461.lambda$NnwvtyRNJ4YYzBywD9aS_kC4jbs(C25044f.C250451.C250461.this, observableEmitter);
                            }
                        }).subscribeOn(C68279a.m265023b()).subscribe();
                    }

                    /* access modifiers changed from: private */
                    /* renamed from: a */
                    public /* synthetic */ void m90356a(ObservableEmitter observableEmitter) throws Exception {
                        C25044f.this.mo88095b();
                    }

                    @Override // com.tt.refer.p3400a.p3401a.AbstractC67709b.AbstractC67711b
                    /* renamed from: a */
                    public void mo87575a(String str) {
                        C25044f.this.mo230481a(ApiCode.GENERAL_SYSTEM_AUTH_DENY);
                    }
                });
            }

            @Override // com.tt.refer.p3400a.p3401a.AbstractC67709b.AbstractC67711b
            /* renamed from: a */
            public void mo87575a(String str) {
                C25044f.this.mo230481a(ApiCode.GENERAL_USER_AUTH_DENIED);
            }
        });
    }

    /* renamed from: a */
    private boolean m90350a(String str) {
        int lastIndexOf;
        if (!TextUtils.isEmpty(str) && (lastIndexOf = str.lastIndexOf(".")) >= 0) {
            return f61179a.contains(str.substring(lastIndexOf).toLowerCase());
        }
        return false;
    }

    @Override // com.tt.miniapp.p3260b.p3261a.p3262a.AbstractC65797c
    /* renamed from: a */
    public void mo87216a(C67701b bVar) {
        AppBrandLogger.m52830i("tma_ApiSaveImageToPhotosAlbumCtrl", "invoke api");
        Activity f = mo230475h().mo235051f();
        if (f == null) {
            mo230481a(ApiCode.GENERAL_UNKONW_ERROR);
            AppBrandLogger.m52830i("tma_ApiSaveImageToPhotosAlbumCtrl", "activity is null");
            return;
        }
        m90349a(f);
    }

    public C25044f(String str, IAppContext iAppContext) {
        super(str, iAppContext);
    }
}
