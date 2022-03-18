package com.ss.android.lark.moments.api;

import android.app.Activity;
import android.content.Context;
import androidx.fragment.app.Fragment;
import com.larksuite.framework.callback.IGetDataCallback;
import com.ss.android.lark.abtest.api.p1324a.AbstractC28490a;
import com.ss.android.lark.applink.AbstractC29186b;
import com.ss.android.lark.maincore.AbstractC44552i;
import com.ss.android.lark.maincore.ITitleController;
import com.ss.android.lark.maincore.dto.TabAppInfo;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J&\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\tH&J\u0016\u0010\n\u001a\u0010\u0012\n\u0012\b\u0012\u0002\b\u0003\u0018\u00010\f\u0018\u00010\u000bH&J\u001e\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\u000e2\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H&J\u0010\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u000fH&J\b\u0010\u0014\u001a\u00020\u000fH&J\b\u0010\u0015\u001a\u00020\u0016H&J<\u0010\u0017\u001a\u00020\u00182\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000b2\u0006\u0010\u001a\u001a\u00020\u000f2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u000f2\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00160\u001fH&J\u0012\u0010 \u001a\u00020\u00182\b\u0010!\u001a\u0004\u0018\u00010\"H&J\u001e\u0010#\u001a\u00020\u00182\u0006\u0010$\u001a\u00020\u000f2\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u001fH&¨\u0006%"}, d2 = {"Lcom/ss/android/lark/moments/api/IMomentsModuleForLark;", "", "createMomentsTabPageSpec", "Lcom/ss/android/lark/maincore/TabPageSpec;", "context", "Landroid/content/Context;", "titleController", "Lcom/ss/android/lark/maincore/ITitleController;", "tabAppInfo", "Lcom/ss/android/lark/maincore/dto/TabAppInfo;", "getAbTestExperiments", "", "Lcom/ss/android/lark/abtest/api/experiment/LarkExperimentConfig;", "getAppLinkHandlers", "", "", "Lcom/ss/android/lark/applink/AppLinkHandler;", "getProfileMomentsFragment", "Landroidx/fragment/app/Fragment;", "userId", "getTabName", "isMomentsSettingEnable", "", "shareMomentsPost", "", "chatIds", "postId", "totalShareCount", "", "additionNote", "callback", "Lcom/larksuite/framework/callback/IGetDataCallback;", "startSettingActivity", "activity", "Landroid/app/Activity;", "updateProfileBackground", "backgroundToken", "im_moments-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.moments.a.a */
public interface IMomentsModuleForLark {
    /* renamed from: a */
    Fragment mo165883a(String str);

    /* renamed from: a */
    AbstractC44552i mo165884a(Context context, ITitleController iTitleController, TabAppInfo tabAppInfo);

    /* renamed from: a */
    String mo165885a();

    /* renamed from: a */
    Map<String, AbstractC29186b> mo165886a(Context context);

    /* renamed from: a */
    void mo165887a(Activity activity);

    /* renamed from: a */
    void mo165888a(String str, IGetDataCallback<String> iGetDataCallback);

    /* renamed from: a */
    void mo165889a(List<String> list, String str, int i, String str2, IGetDataCallback<Boolean> iGetDataCallback);

    /* renamed from: b */
    boolean mo165890b();

    /* renamed from: c */
    List<AbstractC28490a<?>> mo165891c();
}
