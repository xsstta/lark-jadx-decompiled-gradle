package com.ss.android.lark.core.dependency;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.widget.TextView;
import com.bytedance.ee.bear.middleground.comment.Comment;
import com.ss.android.lark.abtest.api.IABTestService;
import com.ss.android.lark.chat.export.entity.message.Content;
import java.util.ArrayList;
import kotlin.Metadata;
import pl.droidsonroids.gif.GifImageView;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J0\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\u0010\t\u001a\u0004\u0018\u00010\nH&J.\u0010\u000b\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\f\u001a\u00020\rH&J\u0014\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\rH&J\b\u0010\u0011\u001a\u00020\rH&J\b\u0010\u0012\u001a\u00020\u0013H&J,\u0010\u0014\u001a\u0004\u0018\u00010\u000f2\u000e\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\u00162\u0006\u0010\u0017\u001a\u00020\r2\b\u0010\u0018\u001a\u0004\u0018\u00010\rH&J\u001c\u0010\u0019\u001a\u00020\u00032\b\u0010\u001a\u001a\u0004\u0018\u00010\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\rH&J\b\u0010\u001d\u001a\u00020\u001eH&J\b\u0010\u001f\u001a\u00020\u001eH&J\u0010\u0010 \u001a\u00020\u00032\u0006\u0010!\u001a\u00020\"H&J\u0010\u0010#\u001a\u00020\u00032\u0006\u0010$\u001a\u00020%H&¨\u0006&"}, d2 = {"Lcom/ss/android/lark/core/dependency/ITodoDependency;", "", "bindViewWithTodoMsg", "", "titleTV", "Landroid/widget/TextView;", "contentTV", "typeIV", "Lpl/droidsonroids/gif/GifImageView;", "content", "Lcom/ss/android/lark/chat/export/entity/message/Content;", "bindViewWithTodoSummary", "summary", "", "getLaunchTodoTransPageIntent", "Landroid/content/Intent;", "bizExtra", "getOpenTodoFromNoticeKey", "getShareTodoCode", "", "getShareTodoResult", "chatIds", "Ljava/util/ArrayList;", Comment.f24093e, "todoGuid", "handleTodoOfflinePushNotice", "context", "Landroid/content/Context;", "jsonStr", "isTodoSettingEnable", "", "isTodoTabEnable", "onABExperimentsInit", "module", "Lcom/ss/android/lark/abtest/api/IABTestService;", "startTodoSettingActivity", "activity", "Landroid/app/Activity;", "core-integrator_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.core.dependency.r */
public interface ITodoDependency {
    /* renamed from: a */
    Intent mo133121a(String str);

    /* renamed from: a */
    Intent mo133122a(ArrayList<String> arrayList, String str, String str2);

    /* renamed from: a */
    String mo133123a();

    /* renamed from: a */
    void mo133124a(Activity activity);

    /* renamed from: a */
    void mo133125a(Context context, String str);

    /* renamed from: a */
    void mo133126a(TextView textView, TextView textView2, GifImageView gifImageView, Content content);

    /* renamed from: a */
    void mo133127a(TextView textView, TextView textView2, GifImageView gifImageView, String str);

    /* renamed from: a */
    void mo133128a(IABTestService iABTestService);

    /* renamed from: b */
    int mo133129b();

    /* renamed from: c */
    boolean mo133130c();
}
