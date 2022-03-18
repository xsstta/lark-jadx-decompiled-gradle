package com.ss.android.lark.chat.entity.page;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.view.KeyEvent;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import com.google.firebase.messaging.Constants;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\"\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH&J\u0010\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u0010H&J\b\u0010\u0011\u001a\u00020\u0003H&J\u0010\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015H&J\u0010\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0017H&J#\u0010\u0018\u001a\u0004\u0018\u0001H\u0019\"\u0004\b\u0000\u0010\u00192\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u0002H\u00190\u001bH&¢\u0006\u0002\u0010\u001cJ\"\u0010\u001d\u001a\u00020\u00032\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u001f2\b\u0010!\u001a\u0004\u0018\u00010\"H&J\b\u0010#\u001a\u00020\u0013H&J\u0010\u0010$\u001a\u00020\u00032\u0006\u0010%\u001a\u00020&H&J\u0010\u0010'\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\tH&J\u0010\u0010(\u001a\u00020\u00132\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006)"}, d2 = {"Lcom/ss/android/lark/chat/entity/page/IDocPageLoader;", "", "addExtension", "", "extension", "Lcom/ss/android/lark/base/activity/ActivityExtension;", "createDocFragment", "Landroidx/fragment/app/Fragment;", "context", "Landroid/content/Context;", "url", "", "config", "Lcom/ss/android/lark/chat/entity/page/DocPageConfig;", "createDocPageExtension", "activity", "Landroidx/appcompat/app/AppCompatActivity;", "destroyDocPage", "dispatchKeyEvent", "", "event", "Landroid/view/KeyEvent;", "dispatchTouchEvent", "Landroid/view/MotionEvent;", "findExtension", "T", ShareHitPoint.f121869d, "Ljava/lang/Class;", "(Ljava/lang/Class;)Ljava/lang/Object;", "onActivityResult", "requestCode", "", "resultCode", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Landroid/content/Intent;", "onBackPressed", "onConfigurationChanged", "newConfig", "Landroid/content/res/Configuration;", "preloadDocPage", "removeExtension", "im_chat_chat-export_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.chat.entity.d.c */
public interface IDocPageLoader {
    /* renamed from: a */
    Fragment mo124910a(Context context, String str, DocPageConfig aVar);

    /* renamed from: a */
    void mo124911a();

    /* renamed from: a */
    void mo124912a(int i, int i2, Intent intent);

    /* renamed from: a */
    void mo124913a(Context context);

    /* renamed from: a */
    void mo124914a(Configuration configuration);

    /* renamed from: a */
    void mo124915a(AppCompatActivity appCompatActivity);

    /* renamed from: a */
    boolean mo124916a(KeyEvent keyEvent);

    /* renamed from: b */
    boolean mo124917b();
}
