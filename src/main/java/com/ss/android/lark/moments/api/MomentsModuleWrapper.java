package com.ss.android.lark.moments.api;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import androidx.fragment.app.Fragment;
import com.larksuite.framework.callback.IGetDataCallback;
import com.ss.android.lark.abtest.api.p1324a.AbstractC28490a;
import com.ss.android.lark.applink.AbstractC29186b;
import com.ss.android.lark.maincore.AbstractC44552i;
import com.ss.android.lark.maincore.ITitleController;
import com.ss.android.lark.maincore.dto.TabAppInfo;
import com.ss.android.lark.moments.dependency.MomentsDependencyHolder;
import com.ss.android.lark.moments.impl.abtest.MomentsExperimentConfig;
import com.ss.android.lark.moments.impl.applink.MomentsAppLinkHandler;
import com.ss.android.lark.moments.impl.featuregating.MomentsFeatureGating;
import com.ss.android.lark.moments.impl.mainview.MomentsAppNameHolder;
import com.ss.android.lark.moments.impl.mainview.tab.MomentsTabPageSpec;
import com.ss.android.lark.moments.impl.personal.p2361new.MomentsProfileFragment;
import com.ss.android.lark.moments.impl.rustadapter.service.MomentsSDKService;
import com.ss.android.lark.moments.impl.setting.MomentsSettingActivity;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J&\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\u0010\t\u001a\u0004\u0018\u00010\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016J\u0016\u0010\r\u001a\u0010\u0012\n\u0012\b\u0012\u0002\b\u0003\u0018\u00010\u000f\u0018\u00010\u000eH\u0016J\u001e\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00130\u00112\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0016J\u0010\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0012H\u0016J\b\u0010\u0017\u001a\u00020\u0012H\u0016J\b\u0010\u0018\u001a\u00020\u0019H\u0016J<\u0010\u001a\u001a\u00020\u001b2\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00120\u000e2\u0006\u0010\u001d\u001a\u00020\u00122\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u00122\f\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00190\"H\u0016J\u0012\u0010#\u001a\u00020\u001b2\b\u0010$\u001a\u0004\u0018\u00010%H\u0016J\u001e\u0010&\u001a\u00020\u001b2\u0006\u0010'\u001a\u00020\u00122\f\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00120\"H\u0016R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u0002\n\u0000¨\u0006("}, d2 = {"Lcom/ss/android/lark/moments/api/MomentsModuleWrapper;", "Lcom/ss/android/lark/moments/api/IMomentsModuleForLark;", "()V", "mMomentsTabPageSpec", "Lcom/ss/android/lark/moments/impl/mainview/tab/MomentsTabPageSpec;", "createMomentsTabPageSpec", "Lcom/ss/android/lark/maincore/TabPageSpec;", "context", "Landroid/content/Context;", "titleController", "Lcom/ss/android/lark/maincore/ITitleController;", "tabAppInfo", "Lcom/ss/android/lark/maincore/dto/TabAppInfo;", "getAbTestExperiments", "", "Lcom/ss/android/lark/abtest/api/experiment/LarkExperimentConfig;", "getAppLinkHandlers", "", "", "Lcom/ss/android/lark/applink/AppLinkHandler;", "getProfileMomentsFragment", "Landroidx/fragment/app/Fragment;", "userId", "getTabName", "isMomentsSettingEnable", "", "shareMomentsPost", "", "chatIds", "postId", "totalShareCount", "", "additionNote", "callback", "Lcom/larksuite/framework/callback/IGetDataCallback;", "startSettingActivity", "activity", "Landroid/app/Activity;", "updateProfileBackground", "backgroundToken", "im_moments-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.moments.a.b */
public final class MomentsModuleWrapper implements IMomentsModuleForLark {

    /* renamed from: a */
    private volatile MomentsTabPageSpec f118994a;

    @Override // com.ss.android.lark.moments.api.IMomentsModuleForLark
    /* renamed from: c */
    public List<AbstractC28490a<?>> mo165891c() {
        return MomentsExperimentConfig.f119000a;
    }

    @Override // com.ss.android.lark.moments.api.IMomentsModuleForLark
    /* renamed from: a */
    public String mo165885a() {
        return MomentsAppNameHolder.m188686a();
    }

    public MomentsModuleWrapper() {
        MomentsDependencyHolder.f118998b.mo165900a(new MomentsFeatureGating());
    }

    @Override // com.ss.android.lark.moments.api.IMomentsModuleForLark
    /* renamed from: b */
    public boolean mo165890b() {
        if (!MomentsDependencyHolder.f118998b.mo165899a().mainDependency().mo144719a("moments") || !MomentsDependencyHolder.f118998b.mo165901b().mo166489a()) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.lark.moments.api.IMomentsModuleForLark
    /* renamed from: a */
    public Fragment mo165883a(String str) {
        Intrinsics.checkParameterIsNotNull(str, "userId");
        return MomentsProfileFragment.f120599e.mo167753a(str);
    }

    @Override // com.ss.android.lark.moments.api.IMomentsModuleForLark
    /* renamed from: a */
    public Map<String, AbstractC29186b> mo165886a(Context context) {
        return MomentsAppLinkHandler.f119005a.mo165909a();
    }

    @Override // com.ss.android.lark.moments.api.IMomentsModuleForLark
    /* renamed from: a */
    public void mo165887a(Activity activity) {
        if (activity != null) {
            activity.startActivity(new Intent(activity, MomentsSettingActivity.class));
        }
    }

    @Override // com.ss.android.lark.moments.api.IMomentsModuleForLark
    /* renamed from: a */
    public void mo165888a(String str, IGetDataCallback<String> iGetDataCallback) {
        Intrinsics.checkParameterIsNotNull(str, "backgroundToken");
        Intrinsics.checkParameterIsNotNull(iGetDataCallback, "callback");
        MomentsSDKService.f120147a.mo167239a(str, iGetDataCallback);
    }

    @Override // com.ss.android.lark.moments.api.IMomentsModuleForLark
    /* renamed from: a */
    public AbstractC44552i mo165884a(Context context, ITitleController iTitleController, TabAppInfo tabAppInfo) {
        Intrinsics.checkParameterIsNotNull(tabAppInfo, "tabAppInfo");
        if (context == null) {
            return null;
        }
        if (this.f118994a == null) {
            return new MomentsTabPageSpec(context, iTitleController, tabAppInfo);
        }
        MomentsTabPageSpec aVar = this.f118994a;
        if (aVar != null) {
            aVar.mo167452a(iTitleController);
        }
        MomentsTabPageSpec aVar2 = this.f118994a;
        this.f118994a = null;
        return aVar2;
    }

    @Override // com.ss.android.lark.moments.api.IMomentsModuleForLark
    /* renamed from: a */
    public void mo165889a(List<String> list, String str, int i, String str2, IGetDataCallback<Boolean> iGetDataCallback) {
        Intrinsics.checkParameterIsNotNull(list, "chatIds");
        Intrinsics.checkParameterIsNotNull(str, "postId");
        Intrinsics.checkParameterIsNotNull(str2, "additionNote");
        Intrinsics.checkParameterIsNotNull(iGetDataCallback, "callback");
        MomentsSDKService.f120147a.mo167238a(str, i, list, str2, iGetDataCallback);
    }
}
