package com.ss.android.lark.threadmergeforward;

import android.content.Context;
import android.content.Intent;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import butterknife.ButterKnife;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.google.firebase.messaging.Constants;
import com.larksuite.suite.R;
import com.ss.android.lark.C29990c;
import com.ss.android.lark.base.fragment.BaseFragmentActivity;
import com.ss.android.lark.biz.core.api.ICoreApi;
import com.ss.android.lark.chat.entity.chat.Chat;
import com.ss.android.lark.chat.entity.message.Message;
import com.ss.android.lark.chatwindow.view.photo_preview.DialogMenuClickListenerImpl;
import com.ss.android.lark.dependency.AbstractC36474h;
import com.ss.android.lark.dependency.IForwardDependency;
import com.ss.android.lark.dfcore.DynamicFeatureCore;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.threadmergeforward.C55954a;
import com.ss.android.lark.threadmergeforward.ThreadMergeForwardView;
import com.ss.android.lark.utils.ApiUtils;
import com.ss.android.lark.utils.C57824f;
import com.ss.android.lark.widget.photo_picker.C58630d;
import com.ss.android.lark.widget.photo_picker.animation.BaseData;
import com.ss.android.lark.widget.photo_picker.entity.PhotoItem;
import com.ss.android.lark.widget.photo_picker.entity.PhotoState;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000I\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0006\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001aB\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0002J\b\u0010\u0010\u001a\u00020\u0011H\u0002J\"\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00142\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0014J\u0012\u0010\u0018\u001a\u00020\u00112\b\u0010\u0019\u001a\u0004\u0018\u00010\u000fH\u0014R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0004\n\u0002\u0010\u0007R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u000e¢\u0006\u0002\n\u0000¨\u0006\u001b"}, d2 = {"Lcom/ss/android/lark/threadmergeforward/ThreadMergeForwardActivity;", "Lcom/ss/android/lark/base/fragment/BaseFragmentActivity;", "()V", "mPresenter", "Lcom/ss/android/lark/threadmergeforward/ThreadMergeForwardPresenter;", "mViewDependency", "com/ss/android/lark/threadmergeforward/ThreadMergeForwardActivity$mViewDependency$1", "Lcom/ss/android/lark/threadmergeforward/ThreadMergeForwardActivity$mViewDependency$1;", "message", "Lcom/ss/android/lark/chat/entity/message/Message;", "originMessageId", "", "checkValidity", "", "bundle", "Landroid/os/Bundle;", "initMVP", "", "onActivityResult", "requestCode", "", "resultCode", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Landroid/content/Intent;", "onCreate", "savedInstanceState", "Companion", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
public final class ThreadMergeForwardActivity extends BaseFragmentActivity {

    /* renamed from: b */
    public static final Companion f138240b = new Companion(null);

    /* renamed from: a */
    public String f138241a = "";

    /* renamed from: c */
    private Message f138242c;

    /* renamed from: d */
    private ThreadMergeForwardPresenter f138243d;

    /* renamed from: e */
    private final C55939b f138244e = new C55939b(this);

    /* renamed from: a */
    public Context mo190695a(Configuration configuration) {
        return super.createConfigurationContext(configuration);
    }

    /* renamed from: a */
    public Resources mo190696a() {
        return super.getResources();
    }

    /* renamed from: a */
    public void mo190697a(Context context) {
        super.attachBaseContext(context);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void attachBaseContext(Context context) {
        m217342a(this, context);
    }

    /* renamed from: b */
    public void mo190698b() {
        super.onStop();
    }

    /* renamed from: c */
    public AssetManager mo190699c() {
        return super.getAssets();
    }

    public Context createConfigurationContext(Configuration configuration) {
        return m217340a(this, configuration);
    }

    public AssetManager getAssets() {
        return m217345c(this);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, com.larksuite.component.air.AirActivity
    public Resources getResources() {
        return m217341a(this);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity
    public void onStop() {
        m217344b(this);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lcom/ss/android/lark/threadmergeforward/ThreadMergeForwardActivity$Companion;", "", "()V", "KEY_THREAD_MERGE_FORWARD_MESSAGE", "", "KEY_THREAD_MERGE_FORWARD_ORIGIN_ID", "LOG_TAG", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.threadmergeforward.ThreadMergeForwardActivity$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000I\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\u0010\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J>\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\t2\u0010\u0010\n\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\f\u0018\u00010\u000b2\b\u0010\u0005\u001a\u0004\u0018\u00010\r2\u0006\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0016J \u0010\u0012\u001a\u00020\u00032\b\u0010\u0013\u001a\u0004\u0018\u00010\u00142\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00110\u0016H\u0016¨\u0006\u0017"}, d2 = {"com/ss/android/lark/threadmergeforward/ThreadMergeForwardActivity$mViewDependency$1", "Lcom/ss/android/lark/threadmergeforward/ThreadMergeForwardView$ViewDependency;", "finishActivity", "", "injectView", "view", "Lcom/ss/android/lark/threadmergeforward/IThreadMergeForwardContract$IView;", "startPhotoPreview", "currentPosition", "", "photoItems", "", "Lcom/ss/android/lark/widget/photo_picker/entity/PhotoItem;", "Landroid/view/View;", "isMute", "", "chatId", "", "startSelectChatActivityFromMergeForward", "chat", "Lcom/ss/android/lark/chat/entity/chat/Chat;", "selectedMessageIds", "Ljava/util/ArrayList;", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.threadmergeforward.ThreadMergeForwardActivity$b */
    public static final class C55939b implements ThreadMergeForwardView.ViewDependency {

        /* renamed from: a */
        final /* synthetic */ ThreadMergeForwardActivity f138245a;

        @Override // com.ss.android.lark.threadmergeforward.ThreadMergeForwardView.ViewDependency
        /* renamed from: a */
        public void mo190702a() {
            this.f138245a.finish();
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C55939b(ThreadMergeForwardActivity threadMergeForwardActivity) {
            this.f138245a = threadMergeForwardActivity;
        }

        @Override // com.ss.android.lark.threadmergeforward.ThreadMergeForwardView.ViewDependency
        /* renamed from: a */
        public void mo190705a(C55954a.AbstractC55957b bVar) {
            Intrinsics.checkParameterIsNotNull(bVar, "view");
            ButterKnife.bind(bVar, this.f138245a);
        }

        @Override // com.ss.android.lark.threadmergeforward.ThreadMergeForwardView.ViewDependency
        /* renamed from: a */
        public void mo190704a(Chat chat, ArrayList<String> arrayList) {
            Intrinsics.checkParameterIsNotNull(arrayList, "selectedMessageIds");
            AbstractC36474h b = C29990c.m110930b();
            Intrinsics.checkExpressionValueIsNotNull(b, "ChatModuleInstanceHolder.getDependency()");
            IForwardDependency E = b.mo134506E();
            ThreadMergeForwardActivity threadMergeForwardActivity = this.f138245a;
            E.mo134373a(threadMergeForwardActivity, null, chat, arrayList, 9, "topic_click", "thread_details", true, threadMergeForwardActivity.f138241a);
        }

        @Override // com.ss.android.lark.threadmergeforward.ThreadMergeForwardView.ViewDependency
        /* renamed from: a */
        public void mo190703a(int i, List<? extends PhotoItem> list, View view, boolean z, String str) {
            PhotoState photoState;
            if (list != null) {
                for (PhotoItem photoItem : list) {
                    if (!(photoItem == null || (photoState = photoItem.getPhotoState()) == null)) {
                        photoState.setLoadOrigin(true);
                    }
                }
            }
            ThreadMergeForwardActivity threadMergeForwardActivity = this.f138245a;
            BaseData.AnimationType animationType = BaseData.AnimationType.TRANSLATE_ANIMATION;
            if (str == null) {
                str = "";
            }
            C58630d.m227367a(threadMergeForwardActivity, list, i, view, animationType, true, z, false, new DialogMenuClickListenerImpl(str));
        }
    }

    /* renamed from: d */
    private final void m217346d() {
        ThreadMergeForwardActivity threadMergeForwardActivity = this;
        String str = this.f138241a;
        Message message = this.f138242c;
        if (message == null) {
            Intrinsics.throwNpe();
        }
        ThreadMergeForwardPresenter gVar = new ThreadMergeForwardPresenter(threadMergeForwardActivity, str, message, this.f138244e);
        this.f138243d = gVar;
        if (gVar != null) {
            gVar.create();
        }
    }

    /* renamed from: a */
    public static Resources m217341a(ThreadMergeForwardActivity threadMergeForwardActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(threadMergeForwardActivity);
        }
        return threadMergeForwardActivity.mo190696a();
    }

    /* renamed from: c */
    public static AssetManager m217345c(ThreadMergeForwardActivity threadMergeForwardActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(threadMergeForwardActivity);
        }
        return threadMergeForwardActivity.mo190699c();
    }

    /* renamed from: b */
    public static void m217344b(ThreadMergeForwardActivity threadMergeForwardActivity) {
        threadMergeForwardActivity.mo190698b();
        if (EnterTransitionCrashOptimizer.getContext() != null) {
            ThreadMergeForwardActivity threadMergeForwardActivity2 = threadMergeForwardActivity;
            if (Build.VERSION.SDK_INT >= 21) {
                try {
                    threadMergeForwardActivity2.getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
                } catch (Throwable unused) {
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.larksuite.component.air.AirActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Intent intent = getIntent();
        Intrinsics.checkExpressionValueIsNotNull(intent, "intent");
        if (!m217343a(intent.getExtras())) {
            finish();
            return;
        }
        setContentView(R.layout.activity_thread_merge_forward);
        m217346d();
    }

    /* renamed from: a */
    private final boolean m217343a(Bundle bundle) {
        if (bundle == null || !bundle.containsKey("key_thread_merge_forward_origin_id")) {
            return false;
        }
        String string = bundle.getString("key_thread_merge_forward_origin_id", "");
        Intrinsics.checkExpressionValueIsNotNull(string, "bundle.getString(KEY_THR…GE_FORWARD_ORIGIN_ID, \"\")");
        this.f138241a = string;
        if (TextUtils.isEmpty(string)) {
            Log.m165383e("ThreadMergeForwardActivity", "message is null, finish");
            return false;
        } else if (!bundle.containsKey("key_thread_merge_forward_message")) {
            return false;
        } else {
            Serializable serializable = bundle.getSerializable("key_thread_merge_forward_message");
            if (serializable != null) {
                Message message = (Message) serializable;
                this.f138242c = message;
                if (message == null) {
                    return false;
                }
                Log.m165389i("ThreadMergeForwardActivity", "enter threadMergeForward, originMessageId:" + this.f138241a + ", message:" + this.f138242c);
                return true;
            }
            throw new TypeCastException("null cannot be cast to non-null type com.ss.android.lark.chat.entity.message.Message");
        }
    }

    /* renamed from: a */
    public static void m217342a(ThreadMergeForwardActivity threadMergeForwardActivity, Context context) {
        threadMergeForwardActivity.mo190697a(context);
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(threadMergeForwardActivity);
        }
    }

    /* renamed from: a */
    public static Context m217340a(ThreadMergeForwardActivity threadMergeForwardActivity, Configuration configuration) {
        Context a = threadMergeForwardActivity.mo190695a(configuration);
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).getLocaleWatcher().mo105895a("lancet_hook_create_configuration", a);
        Log.m165389i("LanguageHooker", "hook createConfigurationContext");
        return ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).updateContextForLanguage(a);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.activity.ComponentActivity, androidx.fragment.app.FragmentActivity
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        ThreadMergeForwardPresenter gVar = this.f138243d;
        if (gVar != null) {
            gVar.mo190756a(i, i2, intent);
        }
    }
}
