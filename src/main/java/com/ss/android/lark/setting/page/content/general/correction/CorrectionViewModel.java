package com.ss.android.lark.setting.page.content.general.correction;

import androidx.lifecycle.AbstractC1142af;
import androidx.lifecycle.AbstractC1178x;
import androidx.lifecycle.C1177w;
import com.google.firebase.messaging.Constants;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.pb.ai.CorrectionSetting;
import com.ss.android.lark.setting.service.usersetting.p2674b.AbstractC54661b;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0006\u0010\u0010\u001a\u00020\u0011J\u000e\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u0014J\u0010\u0010\u0015\u001a\u00020\u00112\u0006\u0010\u0016\u001a\u00020\u0007H\u0002J\u000e\u0010\u0017\u001a\u00020\u00112\u0006\u0010\u0016\u001a\u00020\u0007J\u0006\u0010\u0018\u001a\u00020\u0011R \u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00070\rX\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001a"}, d2 = {"Lcom/ss/android/lark/setting/page/content/general/correction/CorrectionViewModel;", "Landroidx/lifecycle/ViewModel;", "service", "Lcom/ss/android/lark/setting/service/usersetting/enterprisetopic/IASSettingService;", "(Lcom/ss/android/lark/setting/service/usersetting/enterprisetopic/IASSettingService;)V", "featureSetting", "Landroidx/lifecycle/MutableLiveData;", "Lcom/ss/android/lark/pb/ai/CorrectionSetting;", "getFeatureSetting", "()Landroidx/lifecycle/MutableLiveData;", "setFeatureSetting", "(Landroidx/lifecycle/MutableLiveData;)V", "mPushHandler", "Landroidx/lifecycle/Observer;", "getService", "()Lcom/ss/android/lark/setting/service/usersetting/enterprisetopic/IASSettingService;", "init", "", "loadCorrectionSetting", "forceServer", "", "onPushReceived", "setting", "setCorrectionSetting", "unInit", "Companion", "core_setting_setting_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.setting.page.content.general.correction.b */
public final class CorrectionViewModel extends AbstractC1142af {
    public static final Companion Companion = new Companion(null);
    private C1177w<CorrectionSetting> featureSetting = new C1177w<>();
    private final AbstractC1178x<CorrectionSetting> mPushHandler = new C54442c(this);
    private final AbstractC54661b service;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ss/android/lark/setting/page/content/general/correction/CorrectionViewModel$Companion;", "", "()V", "TAG", "", "core_setting_setting_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.setting.page.content.general.correction.b$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final C1177w<CorrectionSetting> getFeatureSetting() {
        return this.featureSetting;
    }

    public final AbstractC54661b getService() {
        return this.service;
    }

    public final void unInit() {
        this.service.mo186712b(this.mPushHandler);
    }

    public final void init() {
        loadCorrectionSetting(false);
        this.service.mo186705a(this.mPushHandler);
        loadCorrectionSetting(true);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0002H\u0016¨\u0006\t"}, d2 = {"com/ss/android/lark/setting/page/content/general/correction/CorrectionViewModel$loadCorrectionSetting$1", "Lcom/larksuite/framework/callback/IGetDataCallback;", "Lcom/ss/android/lark/pb/ai/CorrectionSetting;", "onError", "", "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onSuccess", "setting", "core_setting_setting_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.setting.page.content.general.correction.b$b */
    public static final class C54441b implements IGetDataCallback<CorrectionSetting> {

        /* renamed from: a */
        final /* synthetic */ CorrectionViewModel f134641a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C54441b(CorrectionViewModel bVar) {
            this.f134641a = bVar;
        }

        @Override // com.larksuite.framework.callback.IGetDataCallback
        public void onError(ErrorResult errorResult) {
            Intrinsics.checkParameterIsNotNull(errorResult, "err");
            Log.m165384e("CorrectionViewModel", "getCorrectionSetting error", errorResult);
        }

        /* renamed from: a */
        public void onSuccess(CorrectionSetting correctionSetting) {
            Intrinsics.checkParameterIsNotNull(correctionSetting, "setting");
            Log.m165379d("CorrectionViewModel", "getCorrectionSetting succeed");
            this.f134641a.getFeatureSetting().mo5926a(correctionSetting);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0002H\u0016¨\u0006\t"}, d2 = {"com/ss/android/lark/setting/page/content/general/correction/CorrectionViewModel$setCorrectionSetting$1", "Lcom/larksuite/framework/callback/IGetDataCallback;", "Lcom/ss/android/lark/pb/ai/CorrectionSetting;", "onError", "", "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onSuccess", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "core_setting_setting_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.setting.page.content.general.correction.b$d */
    public static final class C54443d implements IGetDataCallback<CorrectionSetting> {

        /* renamed from: a */
        final /* synthetic */ CorrectionViewModel f134643a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C54443d(CorrectionViewModel bVar) {
            this.f134643a = bVar;
        }

        @Override // com.larksuite.framework.callback.IGetDataCallback
        public void onError(ErrorResult errorResult) {
            Intrinsics.checkParameterIsNotNull(errorResult, "err");
            Log.m165390i("CorrectionViewModel", "setCorrectionSetting error", errorResult);
        }

        /* renamed from: a */
        public void onSuccess(CorrectionSetting correctionSetting) {
            Intrinsics.checkParameterIsNotNull(correctionSetting, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
            this.f134643a.loadCorrectionSetting(true);
            Log.m165379d("CorrectionViewModel", "setCorrectionSetting success");
        }
    }

    public final void onPushReceived(CorrectionSetting correctionSetting) {
        this.featureSetting.mo5926a(correctionSetting);
    }

    public final void setFeatureSetting(C1177w<CorrectionSetting> wVar) {
        Intrinsics.checkParameterIsNotNull(wVar, "<set-?>");
        this.featureSetting = wVar;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Lcom/ss/android/lark/pb/ai/CorrectionSetting;", "kotlin.jvm.PlatformType", "onChanged"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.setting.page.content.general.correction.b$c */
    static final class C54442c<T> implements AbstractC1178x<CorrectionSetting> {

        /* renamed from: a */
        final /* synthetic */ CorrectionViewModel f134642a;

        C54442c(CorrectionViewModel bVar) {
            this.f134642a = bVar;
        }

        /* renamed from: a */
        public final void onChanged(CorrectionSetting correctionSetting) {
            CorrectionViewModel bVar = this.f134642a;
            Intrinsics.checkExpressionValueIsNotNull(correctionSetting, "it");
            bVar.onPushReceived(correctionSetting);
        }
    }

    public final void loadCorrectionSetting(boolean z) {
        this.service.mo186710a(z, new C54441b(this));
    }

    public CorrectionViewModel(AbstractC54661b bVar) {
        Intrinsics.checkParameterIsNotNull(bVar, "service");
        this.service = bVar;
    }

    public final void setCorrectionSetting(CorrectionSetting correctionSetting) {
        Intrinsics.checkParameterIsNotNull(correctionSetting, "setting");
        this.service.mo186706a(correctionSetting, new C54443d(this));
    }
}
