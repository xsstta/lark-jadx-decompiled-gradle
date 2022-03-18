package com.larksuite.component.openplatform.core.plugin.media;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.bytedance.ee.lark.infra.storage.filemanager.vivocompat.MediaStoreHelper;
import com.larksuite.component.openplatform.core.plugin.media.C25047g;
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

@ApiSupportType(apiName = {"saveVideoToPhotosAlbum"}, support = {AppType.WebAPP, AppType.GadgetAPP})
/* renamed from: com.larksuite.component.openplatform.core.plugin.media.g */
public class C25047g extends AbstractC65797c {

    /* renamed from: a */
    private static final HashSet<String> f61183a;

    public C25047g() {
    }

    @Override // com.tt.miniapp.p3260b.p3261a.p3262a.AbstractC65792a
    /* renamed from: a */
    public List<String> mo87215a() {
        return Collections.singletonList("saveVideoToPhotosAlbum");
    }

    static {
        HashSet<String> hashSet = new HashSet<>();
        f61183a = hashSet;
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

    /* renamed from: b */
    public void mo88096b() {
        AppBrandLogger.m52830i("tma_ApiSaveVideoToPhotosAlbumCtrl", "saveVideo begin");
        String str = (String) this.f165820j.mo234984a("filePath");
        if (TextUtils.isEmpty(str)) {
            AppBrandLogger.m52829e("tma_ApiSaveVideoToPhotosAlbumCtrl", "invalid filePath: ", str);
            mo230481a(ApiCode.SAVEVIDEOTOPHOTOSALBUM_FILE_PATH_EMPTY);
            return;
        }
        File b = mo230475h().mo235038b(str);
        if (!b.exists()) {
            AppBrandLogger.m52829e("tma_ApiSaveVideoToPhotosAlbumCtrl", "file not exist: ", str);
            mo230481a(ApiCode.SAVEVIDEOTOPHOTOSALBUM_FILE_NOT_EXIST);
        } else if (!mo230475h().mo235035a(b)) {
            mo230481a(ApiCode.GENERAL_FILE_CAN_NOT_READ);
            AppBrandLogger.m52830i("tma_ApiSaveVideoToPhotosAlbumCtrl", ApiCallResultHelper.generateFilePermissionDenyInfo("read", str), ", no read permission");
        } else if (!m90360a(str)) {
            AppBrandLogger.m52829e("tma_ApiSaveVideoToPhotosAlbumCtrl", "not video: ", str);
            mo230481a(ApiCode.SAVEVIDEOTOPHOTOSALBUM_FILE_NOT_VIDOE);
        } else {
            try {
                Context applicationContext = mo230473f().getApplicationContext();
                applicationContext.sendBroadcast(new Intent("android.intent.action.MEDIA_SCANNER_SCAN_FILE", MediaStoreHelper.m53185a(applicationContext, b, System.currentTimeMillis() + b.getName())));
                mo230494j();
            } catch (Exception e) {
                AppBrandLogger.m52829e("tma_ApiSaveVideoToPhotosAlbumCtrl", "saveVideo exception", e);
                mo230481a(ApiCode.GENERAL_UNKONW_ERROR);
            }
        }
    }

    /* renamed from: a */
    private boolean m90360a(String str) {
        int lastIndexOf;
        if (!TextUtils.isEmpty(str) && (lastIndexOf = str.lastIndexOf(".")) >= 0) {
            return f61183a.contains(str.substring(lastIndexOf).toLowerCase());
        }
        return false;
    }

    /* renamed from: a */
    private void m90359a(final Activity activity) {
        AppBrandLogger.m52830i("tma_ApiSaveVideoToPhotosAlbumCtrl", "saveVideoToPhotosAlbum enter");
        mo230475h().mo235021a(activity, mo230472e(), C66578b.C66579a.m260121f(mo230473f()), new AbstractC67709b.AbstractC67711b() {
            /* class com.larksuite.component.openplatform.core.plugin.media.C25047g.C250481 */

            @Override // com.tt.refer.p3400a.p3401a.AbstractC67709b.AbstractC67711b
            /* renamed from: a */
            public void mo87574a() {
                HashSet hashSet = new HashSet();
                hashSet.add("android.permission.WRITE_EXTERNAL_STORAGE");
                hashSet.add("android.permission.READ_EXTERNAL_STORAGE");
                C25047g.this.mo230475h().mo235022a(activity, C25047g.this.mo230472e(), hashSet, new AbstractC67709b.AbstractC67711b() {
                    /* class com.larksuite.component.openplatform.core.plugin.media.C25047g.C250481.C250491 */

                    @Override // com.tt.refer.p3400a.p3401a.AbstractC67709b.AbstractC67711b
                    /* renamed from: a */
                    public void mo87574a() {
                        Observable.create(new ObservableOnSubscribe() {
                            /* class com.larksuite.component.openplatform.core.plugin.media.$$Lambda$g$1$1$FSe98YEXiyC42Tb2Bch1sDmwhQU */

                            @Override // io.reactivex.ObservableOnSubscribe
                            public final void subscribe(ObservableEmitter observableEmitter) {
                                C25047g.C250481.C250491.lambda$FSe98YEXiyC42Tb2Bch1sDmwhQU(C25047g.C250481.C250491.this, observableEmitter);
                            }
                        }).subscribeOn(C68279a.m265023b()).subscribe();
                    }

                    /* access modifiers changed from: private */
                    /* renamed from: a */
                    public /* synthetic */ void m90366a(ObservableEmitter observableEmitter) throws Exception {
                        C25047g.this.mo88096b();
                    }

                    @Override // com.tt.refer.p3400a.p3401a.AbstractC67709b.AbstractC67711b
                    /* renamed from: a */
                    public void mo87575a(String str) {
                        AppBrandLogger.m52830i("tma_ApiSaveVideoToPhotosAlbumCtrl", "saveVideoToPhotosAlbum SDCARD denied");
                        C25047g.this.mo230481a(ApiCode.GENERAL_SYSTEM_AUTH_DENY);
                    }
                });
            }

            @Override // com.tt.refer.p3400a.p3401a.AbstractC67709b.AbstractC67711b
            /* renamed from: a */
            public void mo87575a(String str) {
                AppBrandLogger.m52830i("tma_ApiSaveVideoToPhotosAlbumCtrl", "saveVideoToPhotosAlbum ALBUM denied");
                C25047g.this.mo230481a(ApiCode.GENERAL_USER_AUTH_DENIED);
            }
        });
    }

    @Override // com.tt.miniapp.p3260b.p3261a.p3262a.AbstractC65797c
    /* renamed from: a */
    public void mo87216a(C67701b bVar) {
        Activity f = mo230475h().mo235051f();
        if (f == null) {
            AppBrandLogger.m52829e("tma_ApiSaveVideoToPhotosAlbumCtrl", this.f165818h, " activity is null");
            mo230481a(ApiCode.GENERAL_UNKONW_ERROR);
            return;
        }
        m90359a(f);
    }

    public C25047g(String str, IAppContext iAppContext) {
        super(str, iAppContext);
    }
}
