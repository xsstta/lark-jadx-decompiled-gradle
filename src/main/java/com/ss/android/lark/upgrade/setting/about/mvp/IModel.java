package com.ss.android.lark.upgrade.setting.about.mvp;

import com.larksuite.framework.callback.IGetDataCallback;
import java.io.File;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005H&J\n\u0010\u0007\u001a\u0004\u0018\u00010\bH&J\n\u0010\t\u001a\u0004\u0018\u00010\bH&J\u0018\u0010\n\u001a\u00020\u00032\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u0005H&J\n\u0010\f\u001a\u0004\u0018\u00010\bH&J\n\u0010\r\u001a\u0004\u0018\u00010\bH&J\n\u0010\u000e\u001a\u0004\u0018\u00010\bH&J\n\u0010\u000f\u001a\u0004\u0018\u00010\bH&J\b\u0010\u0010\u001a\u00020\u0006H&J\b\u0010\u0011\u001a\u00020\u0006H&J \u0010\u0012\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00020\u000b2\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0005H&¨\u0006\u0015"}, d2 = {"Lcom/ss/android/lark/upgrade/setting/about/mvp/IModel;", "Lcom/larksuite/framework/mvp/IModel;", "checkNewVersion", "", "callback", "Lcom/larksuite/framework/callback/IGetDataCallback;", "", "getApplicationPermissionDescUrl", "", "getBestPracticeUrl", "getLogFile", "Ljava/io/File;", "getReleaseNotesUrl", "getSecurityWhitePaperUrl", "getSpecialFunctionUrl", "getThirdPartySDKListUrl", "isHasNewVersion", "isPrimaryHost", "sendFileMessageToSelfP2PChat", "file", "Ljava/lang/Void;", "core_upgrade_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.upgrade.setting.about.b.c */
public interface IModel extends com.larksuite.framework.mvp.IModel {
    /* renamed from: a */
    String mo195793a();

    /* renamed from: a */
    void mo195794a(IGetDataCallback<File> iGetDataCallback);

    /* renamed from: a */
    void mo195795a(File file, IGetDataCallback<Void> iGetDataCallback);

    /* renamed from: b */
    String mo195796b();

    /* renamed from: b */
    void mo195797b(IGetDataCallback<Boolean> iGetDataCallback);

    /* renamed from: c */
    String mo195798c();

    /* renamed from: d */
    String mo195799d();

    /* renamed from: e */
    String mo195800e();

    /* renamed from: f */
    String mo195801f();

    /* renamed from: g */
    boolean mo195802g();
}
