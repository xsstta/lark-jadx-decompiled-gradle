package com.ss.android.lark.integrator.ccm.spacekit;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.view.KeyEvent;
import android.view.MotionEvent;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import com.google.firebase.messaging.Constants;
import com.ss.android.lark.base.activity.C29525a;
import com.ss.android.lark.chat.entity.page.DocPageConfig;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&J*\u0010\b\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u000eH&J\u0018\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u0011H&J\u0010\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0018\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0015\u001a\u00020\u0016H&J\u0018\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0015\u001a\u00020\u0018H&J+\u0010\u0019\u001a\u0004\u0018\u0001H\u001a\"\u0004\b\u0000\u0010\u001a2\u0006\u0010\u0004\u001a\u00020\u00052\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u0002H\u001a0\u001cH&¢\u0006\u0002\u0010\u001dJ*\u0010\u001e\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020 2\b\u0010\"\u001a\u0004\u0018\u00010#H&J\u0010\u0010$\u001a\u00020\u00142\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0018\u0010%\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010&\u001a\u00020'H&J\u0018\u0010(\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u000bH&J\u0018\u0010)\u001a\u00020\u00142\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&¨\u0006*"}, d2 = {"Lcom/ss/android/lark/integrator/ccm/spacekit/IDocPageSdkWrapper;", "", "addExtension", "", "key", "", "extension", "Lcom/ss/android/lark/base/activity/ActivityExtension;", "createDocFragment", "Landroidx/fragment/app/Fragment;", "context", "Landroid/content/Context;", "url", "config", "Lcom/ss/android/lark/chat/entity/page/DocPageConfig;", "createDocPageExtension", "activity", "Landroidx/appcompat/app/AppCompatActivity;", "destroyDocPage", "dispatchKeyEvent", "", "event", "Landroid/view/KeyEvent;", "dispatchTouchEvent", "Landroid/view/MotionEvent;", "findExtension", "T", ShareHitPoint.f121869d, "Ljava/lang/Class;", "(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;", "onActivityResult", "requestCode", "", "resultCode", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Landroid/content/Intent;", "onBackPressed", "onConfigurationChanged", "newConfig", "Landroid/content/res/Configuration;", "preloadDocPage", "removeExtension", "ccm_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.integrator.ccm.c.b */
public interface IDocPageSdkWrapper {
    /* renamed from: a */
    Fragment mo143052a(String str, Context context, String str2, DocPageConfig aVar);

    /* renamed from: a */
    <T> T mo143053a(String str, Class<T> cls);

    /* renamed from: a */
    void mo143054a(String str);

    /* renamed from: a */
    void mo143055a(String str, int i, int i2, Intent intent);

    /* renamed from: a */
    void mo143056a(String str, Context context);

    /* renamed from: a */
    void mo143057a(String str, Configuration configuration);

    /* renamed from: a */
    void mo143058a(String str, AppCompatActivity appCompatActivity);

    /* renamed from: a */
    void mo143059a(String str, C29525a aVar);

    /* renamed from: a */
    boolean mo143060a(String str, KeyEvent keyEvent);

    /* renamed from: a */
    boolean mo143061a(String str, MotionEvent motionEvent);

    /* renamed from: b */
    boolean mo143062b(String str);

    /* renamed from: b */
    boolean mo143063b(String str, C29525a aVar);
}
