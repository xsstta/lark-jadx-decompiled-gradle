package com.ss.android.lark.integrator.core;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.TextView;
import com.bytedance.ee.bear.middleground.comment.Comment;
import com.larksuite.framework.thread.CoreThreadPool;
import com.ss.android.lark.abtest.api.IABTestService;
import com.ss.android.lark.calendar_api.ICalendarApi;
import com.ss.android.lark.chat.entity.message.content.TodoContent;
import com.ss.android.lark.chat.export.entity.message.Content;
import com.ss.android.lark.core.dependency.ITodoDependency;
import com.ss.android.lark.core.p1772j.C36149a;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.main.C44134a;
import com.ss.android.lark.platform.offlinepush.OfflinePushClickHandler;
import com.ss.android.lark.utils.ApiUtils;
import com.ss.android.lark.utils.LarkContext;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;
import pl.droidsonroids.gif.GifImageView;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u0000 '2\u00020\u0001:\u0001'B\u0005¢\u0006\u0002\u0010\u0002J0\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\b\u001a\u0004\u0018\u00010\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0016J.\u0010\f\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\b\u001a\u0004\u0018\u00010\t2\u0006\u0010\r\u001a\u00020\u000eH\u0016J\u0014\u0010\u000f\u001a\u0004\u0018\u00010\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u000eH\u0016J\b\u0010\u0012\u001a\u00020\u000eH\u0016J\b\u0010\u0013\u001a\u00020\u0014H\u0016J,\u0010\u0015\u001a\u0004\u0018\u00010\u00102\u000e\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u00172\u0006\u0010\u0018\u001a\u00020\u000e2\b\u0010\u0019\u001a\u0004\u0018\u00010\u000eH\u0016J\u001c\u0010\u001a\u001a\u00020\u00042\b\u0010\u001b\u001a\u0004\u0018\u00010\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u000eH\u0016J\b\u0010\u001e\u001a\u00020\u001fH\u0016J\b\u0010 \u001a\u00020\u001fH\u0016J\u0010\u0010!\u001a\u00020\u00042\u0006\u0010\"\u001a\u00020#H\u0016J\u0010\u0010$\u001a\u00020\u00042\u0006\u0010%\u001a\u00020&H\u0016¨\u0006("}, d2 = {"Lcom/ss/android/lark/integrator/core/TodoDependencyImpl;", "Lcom/ss/android/lark/core/dependency/ITodoDependency;", "()V", "bindViewWithTodoMsg", "", "titleTV", "Landroid/widget/TextView;", "contentTV", "typeIV", "Lpl/droidsonroids/gif/GifImageView;", "content", "Lcom/ss/android/lark/chat/export/entity/message/Content;", "bindViewWithTodoSummary", "summary", "", "getLaunchTodoTransPageIntent", "Landroid/content/Intent;", "bizExtra", "getOpenTodoFromNoticeKey", "getShareTodoCode", "", "getShareTodoResult", "chatIds", "Ljava/util/ArrayList;", Comment.f24093e, "todoGuid", "handleTodoOfflinePushNotice", "context", "Landroid/content/Context;", "obj", "isTodoSettingEnable", "", "isTodoTabEnable", "onABExperimentsInit", "module", "Lcom/ss/android/lark/abtest/api/IABTestService;", "startTodoSettingActivity", "activity", "Landroid/app/Activity;", "Companion", "core_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.integrator.core.r */
public final class TodoDependencyImpl implements ITodoDependency {

    /* renamed from: a */
    public static final Companion f100712a = new Companion(null);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ss/android/lark/integrator/core/TodoDependencyImpl$Companion;", "", "()V", "TAG", "", "core_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.integrator.core.r$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // com.ss.android.lark.core.dependency.ITodoDependency
    /* renamed from: a */
    public void mo133128a(IABTestService iABTestService) {
        Intrinsics.checkParameterIsNotNull(iABTestService, "module");
        Object api = ApiUtils.getApi(ICalendarApi.class);
        Intrinsics.checkExpressionValueIsNotNull(api, "ApiUtils.getApi(ICalendarApi::class.java)");
        iABTestService.registerExperiments("TODO", ((ICalendarApi) api).getAbTestExperiments());
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.integrator.core.r$b */
    static final class RunnableC39390b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ Context f100713a;

        /* renamed from: b */
        final /* synthetic */ Intent f100714b;

        /* renamed from: c */
        final /* synthetic */ String f100715c;

        RunnableC39390b(Context context, Intent intent, String str) {
            this.f100713a = context;
            this.f100714b = intent;
            this.f100715c = str;
        }

        public final void run() {
            OfflinePushClickHandler.m201275a(this.f100713a, this.f100714b, this.f100715c);
        }
    }

    @Override // com.ss.android.lark.core.dependency.ITodoDependency
    /* renamed from: b */
    public int mo133129b() {
        Object api = ApiUtils.getApi(ICalendarApi.class);
        Intrinsics.checkExpressionValueIsNotNull(api, "ApiUtils.getApi(ICalendarApi::class.java)");
        return ((ICalendarApi) api).getShareTodoCode();
    }

    @Override // com.ss.android.lark.core.dependency.ITodoDependency
    /* renamed from: a */
    public String mo133123a() {
        String openTodoFromNoticeKey = ((ICalendarApi) ApiUtils.getApi(ICalendarApi.class)).getOpenTodoFromNoticeKey();
        Intrinsics.checkExpressionValueIsNotNull(openTodoFromNoticeKey, "calendarApi.getOpenTodoFromNoticeKey()");
        return openTodoFromNoticeKey;
    }

    @Override // com.ss.android.lark.core.dependency.ITodoDependency
    /* renamed from: c */
    public boolean mo133130c() {
        if (((ICalendarApi) ApiUtils.getApi(ICalendarApi.class)).isTodoTabEnable()) {
            Object api = ApiUtils.getApi(ICalendarApi.class);
            Intrinsics.checkExpressionValueIsNotNull(api, "ApiUtils.getApi(ICalendarApi::class.java)");
            if (((ICalendarApi) api).isTodoDailyRemindEnable()) {
                return true;
            }
        }
        return false;
    }

    @Override // com.ss.android.lark.core.dependency.ITodoDependency
    /* renamed from: a */
    public Intent mo133121a(String str) {
        ICalendarApi iCalendarApi = (ICalendarApi) ApiUtils.getApi(ICalendarApi.class);
        Intent todoIntentForWsChannelOfflinePush = iCalendarApi.getTodoIntentForWsChannelOfflinePush(str);
        if (todoIntentForWsChannelOfflinePush != null) {
            return todoIntentForWsChannelOfflinePush;
        }
        C44134a a = C36149a.m142162a();
        Intrinsics.checkExpressionValueIsNotNull(a, "MainModuleProvider.getModule()");
        Intrinsics.checkExpressionValueIsNotNull(iCalendarApi, "calendarApi");
        Intent a2 = a.mo157098b().mo105697a(LarkContext.getApplication(), iCalendarApi.getTodoPageName());
        if (!TextUtils.isEmpty(str)) {
            Bundle bundle = new Bundle();
            iCalendarApi.packageLaunchTodoTransPageIntent(bundle, str);
            a2.putExtras(bundle);
        }
        return a2;
    }

    @Override // com.ss.android.lark.core.dependency.ITodoDependency
    /* renamed from: a */
    public void mo133124a(Activity activity) {
        Intrinsics.checkParameterIsNotNull(activity, "activity");
        ((ICalendarApi) ApiUtils.getApi(ICalendarApi.class)).startTodoSettingActivity(activity);
    }

    @Override // com.ss.android.lark.core.dependency.ITodoDependency
    /* renamed from: a */
    public void mo133125a(Context context, String str) {
        ICalendarApi iCalendarApi = (ICalendarApi) ApiUtils.getApi(ICalendarApi.class);
        C44134a a = C36149a.m142162a();
        Intrinsics.checkExpressionValueIsNotNull(a, "MainModuleProvider.getModule()");
        Intrinsics.checkExpressionValueIsNotNull(iCalendarApi, "calendarApi");
        Intent a2 = a.mo157098b().mo105697a(LarkContext.getApplication(), iCalendarApi.getTodoPageName());
        try {
            JSONObject jSONObject = new JSONObject(str);
            String optString = jSONObject.optString("user_id");
            String optString2 = jSONObject.optString("extra_str");
            if (!TextUtils.isEmpty(optString2)) {
                Bundle bundle = new Bundle();
                iCalendarApi.packageTodoOfflinePushNotice(bundle, optString2);
                bundle.putString("user_id", optString);
                a2.putExtras(bundle);
            }
        } catch (JSONException e) {
            Log.m165383e("TodoDependencyImpl", "notification click catch = " + e);
        }
        CoreThreadPool coreThreadPool = CoreThreadPool.getDefault();
        Intrinsics.checkExpressionValueIsNotNull(coreThreadPool, "CoreThreadPool.getDefault()");
        coreThreadPool.getCachedThreadPool().execute(new RunnableC39390b(context, a2, str));
    }

    @Override // com.ss.android.lark.core.dependency.ITodoDependency
    /* renamed from: a */
    public Intent mo133122a(ArrayList<String> arrayList, String str, String str2) {
        Intrinsics.checkParameterIsNotNull(str, Comment.f24093e);
        return ((ICalendarApi) ApiUtils.getApi(ICalendarApi.class)).getShareTodoResult(arrayList, str, str2);
    }

    @Override // com.ss.android.lark.core.dependency.ITodoDependency
    /* renamed from: a */
    public void mo133126a(TextView textView, TextView textView2, GifImageView gifImageView, Content content) {
        if (content instanceof TodoContent) {
            ((ICalendarApi) ApiUtils.getApi(ICalendarApi.class)).bindViewWithShareTodoMsg(textView, textView2, gifImageView, (TodoContent) content);
        }
    }

    @Override // com.ss.android.lark.core.dependency.ITodoDependency
    /* renamed from: a */
    public void mo133127a(TextView textView, TextView textView2, GifImageView gifImageView, String str) {
        Intrinsics.checkParameterIsNotNull(str, "summary");
        ((ICalendarApi) ApiUtils.getApi(ICalendarApi.class)).bindViewWithTodoSummary(textView, textView2, gifImageView, str);
    }
}
