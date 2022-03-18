package com.ss.android.lark.setting;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import com.bytedance.lark.pb.im.v1.ContentType;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.ss.android.lark.biz.core.api.IUiModeService;
import com.ss.android.lark.maincore.AbstractC44552i;
import com.ss.android.lark.passport.signinsdk_api.account.AbstractC49339b;
import com.ss.android.lark.setting.dependency.ISettingDependency;
import com.ss.android.lark.setting.dto.C54124e;
import com.ss.android.lark.setting.dto.NotificationSettingWrapper;
import com.ss.android.lark.setting.dto.SidebarInfo;
import com.ss.android.lark.setting.page.C54129a;
import com.ss.android.lark.setting.page.C54133b;
import com.ss.android.lark.setting.page.content.common.C54150a;
import com.ss.android.lark.setting.page.content.common.dto.LanguageInfo;
import com.ss.android.lark.setting.page.content.common.dto.MineTranslateLanguageSetting;
import com.ss.android.lark.setting.page.content.common.impl.font.FontSizeSettingHitPoint;
import com.ss.android.lark.setting.page.content.common.impl.locale.C54183b;
import com.ss.android.lark.setting.page.content.common.impl.translate.manis.dto.ParcelableLanguageInfo;
import com.ss.android.lark.setting.page.content.common.impl.translate.manis.dto.ParcelableTranslateSettingConfig;
import com.ss.android.lark.setting.page.content.common.impl.translate.p2666b.C54232a;
import com.ss.android.lark.setting.page.content.common.impl.translate.v2.entity.C54377c;
import com.ss.android.lark.setting.page.content.general.GeneralSettingLauncher;
import com.ss.android.lark.setting.service.AbstractC54601a;
import com.ss.android.lark.setting.service.AbstractC54602b;
import com.ss.android.lark.setting.service.AbstractC54603d;
import com.ss.android.lark.setting.service.C54604e;
import com.ss.android.lark.setting.service.ISidebarService;
import com.ss.android.lark.setting.service.impl.C54608b;
import com.ss.android.lark.setting.service.impl.C54617d;
import com.ss.android.lark.setting.service.impl.SidebarServiceImpl;
import com.ss.android.lark.setting.service.impl.UserSettingFacade;
import com.ss.android.lark.setting.service.usersetting.appearance.UiModeService;
import com.ss.android.lark.setting.service.usersetting.base.C54667c;
import com.ss.android.lark.setting.service.usersetting.keyboardsend.KeyboardSendManager;
import com.ss.android.lark.setting.service.usersetting.msgalignmentstyle.AlignMode;
import com.ss.android.lark.setting.service.usersetting.msgalignmentstyle.MessageAlignModeService;
import com.ss.android.lark.setting.service.usersetting.p2674b.AbstractC54661b;
import com.ss.android.lark.setting.service.usersetting.p2674b.C54655a;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.lark.setting.c */
public class C54115c {

    /* renamed from: a */
    private static ISettingDependency f133991a;

    /* renamed from: com.ss.android.lark.setting.c$a */
    public interface AbstractC54118a {
        /* renamed from: a */
        void mo178097a(boolean z);
    }

    /* renamed from: com.ss.android.lark.setting.c$b */
    public interface AbstractC54119b {
        /* renamed from: a */
        void mo178094a(NotificationSettingWrapper notificationSettingWrapper);
    }

    /* renamed from: com.ss.android.lark.setting.c$c */
    public interface AbstractC54120c {
        void onDataChange(List<SidebarInfo> list, List<SidebarInfo> list2);
    }

    /* renamed from: com.ss.android.lark.setting.c$d */
    public interface AbstractC54121d {
        /* renamed from: a */
        void mo178095a(C54124e eVar);
    }

    /* renamed from: n */
    public String mo185228n() {
        return "system_setting";
    }

    /* renamed from: o */
    public boolean mo185229o() {
        return false;
    }

    /* renamed from: a */
    public static ISettingDependency m210080a() {
        return f133991a;
    }

    /* renamed from: d */
    public ISidebarService mo185218d() {
        return SidebarServiceImpl.f134962a;
    }

    /* renamed from: g */
    public IUiModeService mo185221g() {
        return UiModeService.f135042b;
    }

    /* renamed from: a */
    public void mo185209a(boolean z) {
        UserSettingFacade.m211870j().mo186577k();
        UserSettingFacade.m211870j().mo186552a(z);
        C54617d.m211936l().mo186596c(z);
        C54655a.m212173a().mo186709a(z);
    }

    /* renamed from: a */
    public void mo185211a(String[] strArr, final IGetDataCallback<ParcelableLanguageInfo> iGetDataCallback) {
        C54232a.m210622a().mo185631a(strArr, new IGetDataCallback<List<ParcelableLanguageInfo>>() {
            /* class com.ss.android.lark.setting.C54115c.C541161 */

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                iGetDataCallback.onError(errorResult);
            }

            /* renamed from: a */
            public void onSuccess(List<ParcelableLanguageInfo> list) {
                if (!list.isEmpty()) {
                    iGetDataCallback.onSuccess(list.get(0));
                }
            }
        });
    }

    /* renamed from: a */
    public void mo185210a(boolean z, IGetDataCallback<Void> iGetDataCallback) {
        C54232a.m210622a().mo185623a(MineTranslateLanguageSetting.C54163b.f134068e, z, iGetDataCallback);
    }

    /* renamed from: a */
    public void mo185208a(String str, boolean z, IGetDataCallback<Void> iGetDataCallback) {
        C54232a.m210622a().mo185629a(str, z, iGetDataCallback);
    }

    /* renamed from: b */
    public AbstractC54601a mo185212b() {
        return C54608b.m211917b();
    }

    /* renamed from: c */
    public AbstractC54602b mo185216c() {
        return C54617d.m211936l();
    }

    /* renamed from: e */
    public AbstractC54603d mo185219e() {
        return UserSettingFacade.m211870j();
    }

    /* renamed from: f */
    public AbstractC54661b mo185220f() {
        return C54655a.m212173a();
    }

    /* renamed from: j */
    public boolean mo185224j() {
        return KeyboardSendManager.f135088a.mo186785b();
    }

    /* renamed from: k */
    public boolean mo185225k() {
        return MessageAlignModeService.f135136a.mo186840b();
    }

    /* renamed from: m */
    public List<String> mo185227m() {
        return C54604e.m211869a();
    }

    /* renamed from: r */
    public void mo185232r() {
        FontSizeSettingHitPoint.f134143a.mo185462f();
    }

    /* renamed from: h */
    public boolean mo185222h() {
        return mo185220f().mo186717d();
    }

    /* renamed from: p */
    public boolean mo185230p() {
        return C54667c.m212228a().mo186765f().getIsMessageNotificationsOff();
    }

    /* renamed from: q */
    public boolean mo185231q() {
        return m210080a().mo178288c("global.atuo.clean");
    }

    /* renamed from: i */
    public boolean mo185223i() {
        if (!mo185225k() || !MessageAlignModeService.f135136a.mo186841c().equals(AlignMode.AlignLeftAndRight)) {
            return false;
        }
        return true;
    }

    /* renamed from: l */
    public void mo185226l() {
        UserSettingFacade.m211870j().mo186577k();
        UserSettingFacade.m211870j().mo186576i();
        SidebarServiceImpl.f134962a.mo186615b();
        C54655a.m212173a().mo186719f();
    }

    /* renamed from: b */
    public void mo185213b(Context context) {
        C54129a.m210149a(context);
    }

    /* renamed from: c */
    public void mo185217c(Context context) {
        C54150a.m210228b(context);
    }

    public C54115c(ISettingDependency aVar) {
        f133991a = aVar;
    }

    /* renamed from: a */
    public AbstractC44552i mo185199a(Context context) {
        return new C54133b(context);
    }

    /* renamed from: a */
    public void mo185200a(Activity activity) {
        C54150a.m210222a((Context) activity);
    }

    /* renamed from: b */
    public void mo185215b(AbstractC49339b bVar) {
        C54183b.m210396a().mo185488a(bVar);
    }

    /* renamed from: a */
    public void mo185203a(final IGetDataCallback<List<ParcelableLanguageInfo>> iGetDataCallback) {
        C54232a.m210622a().mo185630a(true, (IGetDataCallback<MineTranslateLanguageSetting>) new IGetDataCallback<MineTranslateLanguageSetting>() {
            /* class com.ss.android.lark.setting.C54115c.C541172 */

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                IGetDataCallback iGetDataCallback = iGetDataCallback;
                if (iGetDataCallback != null) {
                    iGetDataCallback.onError(errorResult);
                }
            }

            /* renamed from: a */
            public void onSuccess(MineTranslateLanguageSetting mineTranslateLanguageSetting) {
                List<LanguageInfo> supportedLanguageList = mineTranslateLanguageSetting.getSupportedLanguageList();
                if (supportedLanguageList != null) {
                    ArrayList arrayList = new ArrayList();
                    for (LanguageInfo languageInfo : supportedLanguageList) {
                        ParcelableLanguageInfo parcelableLanguageInfo = new ParcelableLanguageInfo();
                        parcelableLanguageInfo.mo185705a(languageInfo.getKey());
                        parcelableLanguageInfo.mo185707b(languageInfo.getDisplayName());
                        parcelableLanguageInfo.mo185708c(languageInfo.getI18nName());
                        arrayList.add(parcelableLanguageInfo);
                    }
                    IGetDataCallback iGetDataCallback = iGetDataCallback;
                    if (iGetDataCallback != null) {
                        iGetDataCallback.onSuccess(arrayList);
                    }
                }
            }
        });
    }

    /* renamed from: a */
    public void mo185204a(AbstractC49339b bVar) {
        C54183b.m210396a().mo185490b(bVar);
    }

    /* renamed from: b */
    public void mo185214b(Context context, int i) {
        GeneralSettingLauncher.f134644a.mo186113b(context, i);
    }

    /* renamed from: a */
    public void mo185201a(Context context, int i) {
        GeneralSettingLauncher.f134644a.mo186111a(context, i);
    }

    /* renamed from: a */
    public void mo185202a(Context context, Bundle bundle) {
        C54150a.m210223a(context, bundle);
    }

    /* renamed from: a */
    public void mo185205a(ParcelableLanguageInfo parcelableLanguageInfo, boolean z, IGetDataCallback<Void> iGetDataCallback) {
        C54232a.m210622a().mo185626a(parcelableLanguageInfo.mo185704a(), C54377c.f134513e, !z, iGetDataCallback);
    }

    /* renamed from: a */
    public void mo185206a(String str, String str2, IGetDataCallback<ParcelableTranslateSettingConfig> iGetDataCallback) {
        C54232a.m210622a().mo185628a(str, str2, iGetDataCallback);
    }

    /* renamed from: a */
    public void mo185207a(String str, String str2, String[] strArr, ContentType contentType, IGetDataCallback<List<String>> iGetDataCallback) {
        C54232a.m210622a().mo185632a(strArr, str, str2, contentType, iGetDataCallback);
    }
}
