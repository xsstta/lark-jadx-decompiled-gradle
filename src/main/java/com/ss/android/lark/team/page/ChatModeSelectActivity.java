package com.ss.android.lark.team.page;

import android.content.Context;
import android.content.Intent;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.larksuite.component.universe_design.icon.UDIconUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.base.fragment.BaseFragmentActivity;
import com.ss.android.lark.biz.core.api.ICoreApi;
import com.ss.android.lark.chat.entity.chat.Chat;
import com.ss.android.lark.dfcore.DynamicFeatureCore;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.ui.p2892a.C57582a;
import com.ss.android.lark.utils.ApiUtils;
import com.ss.android.lark.utils.C57824f;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0014J\b\u0010\u0015\u001a\u00020\u0012H\u0002J\b\u0010\u0016\u001a\u00020\u0012H\u0002J\b\u0010\u0017\u001a\u00020\u0012H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X.¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X.¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X.¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX.¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\tX.¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004X.¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0004X.¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0007X.¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\tX.¢\u0006\u0002\n\u0000¨\u0006\u0018"}, d2 = {"Lcom/ss/android/lark/team/page/ChatModeSelectActivity;", "Lcom/ss/android/lark/base/fragment/BaseFragmentActivity;", "()V", "conversionExampleView", "Landroid/view/View;", "conversionSelectContainer", "conversionSelectIcon", "Landroid/widget/ImageView;", "conversionSelectText", "Landroid/widget/TextView;", "hintText", "selectedChatMode", "Lcom/ss/android/lark/chat/entity/chat/Chat$ChatMode;", "topicExampleView", "topicSelectContainer", "topicSelectIcon", "topicSelectText", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onSelectConversion", "onSelectTopic", "updateActivityResult", "im_team_team_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class ChatModeSelectActivity extends BaseFragmentActivity {

    /* renamed from: a */
    private View f136882a;

    /* renamed from: b */
    private ImageView f136883b;

    /* renamed from: c */
    private TextView f136884c;

    /* renamed from: d */
    private View f136885d;

    /* renamed from: e */
    private ImageView f136886e;

    /* renamed from: f */
    private TextView f136887f;

    /* renamed from: g */
    private TextView f136888g;

    /* renamed from: h */
    private View f136889h;

    /* renamed from: i */
    private View f136890i;

    /* renamed from: j */
    private Chat.ChatMode f136891j = Chat.ChatMode.THREAD_V2;

    /* renamed from: a */
    public Context mo189212a(Configuration configuration) {
        return super.createConfigurationContext(configuration);
    }

    /* renamed from: a */
    public void mo189214a(Context context) {
        super.attachBaseContext(context);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void attachBaseContext(Context context) {
        m215122a(this, context);
    }

    /* renamed from: c */
    public Resources mo189216c() {
        return super.getResources();
    }

    public Context createConfigurationContext(Configuration configuration) {
        return m215120a(this, configuration);
    }

    /* renamed from: d */
    public void mo189218d() {
        super.onStop();
    }

    /* renamed from: e */
    public AssetManager mo189219e() {
        return super.getAssets();
    }

    public AssetManager getAssets() {
        return m215124c(this);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, com.larksuite.component.air.AirActivity
    public Resources getResources() {
        return m215121a(this);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity
    public void onStop() {
        m215123b(this);
    }

    /* renamed from: f */
    private final void m215125f() {
        Intent intent = new Intent();
        intent.putExtra("result_selected_chat_mode", this.f136891j);
        setResult(-1, intent);
    }

    /* renamed from: a */
    public final void mo189213a() {
        this.f136891j = Chat.ChatMode.THREAD_V2;
        m215125f();
        ChatModeSelectActivity chatModeSelectActivity = this;
        int d = C57582a.m223616d(chatModeSelectActivity, R.color.static_white);
        View view = this.f136882a;
        if (view == null) {
            Intrinsics.throwUninitializedPropertyAccessException("topicSelectContainer");
        }
        view.setSelected(true);
        ImageView imageView = this.f136883b;
        if (imageView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("topicSelectIcon");
        }
        imageView.setImageDrawable(UDIconUtils.getIconDrawable(chatModeSelectActivity, (int) R.drawable.ud_icon_msgcard_rectangle_outlined, d));
        TextView textView = this.f136884c;
        if (textView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("topicSelectText");
        }
        textView.setTextColor(d);
        View view2 = this.f136885d;
        if (view2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("conversionSelectContainer");
        }
        view2.setSelected(false);
        ImageView imageView2 = this.f136886e;
        if (imageView2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("conversionSelectIcon");
        }
        imageView2.setImageResource(R.drawable.icon_group_type_dot);
        TextView textView2 = this.f136887f;
        if (textView2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("conversionSelectText");
        }
        textView2.setTextColor(C57582a.m223616d(chatModeSelectActivity, R.color.text_title));
        TextView textView3 = this.f136888g;
        if (textView3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("hintText");
        }
        textView3.setText(R.string.Lark_Group_CreateGroup_Mode_Topic_Description);
        View view3 = this.f136889h;
        if (view3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("topicExampleView");
        }
        view3.setVisibility(0);
        View view4 = this.f136890i;
        if (view4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("conversionExampleView");
        }
        view4.setVisibility(4);
    }

    /* renamed from: b */
    public final void mo189215b() {
        this.f136891j = Chat.ChatMode.DEFAULT;
        m215125f();
        ChatModeSelectActivity chatModeSelectActivity = this;
        int d = C57582a.m223616d(chatModeSelectActivity, R.color.static_white);
        View view = this.f136882a;
        if (view == null) {
            Intrinsics.throwUninitializedPropertyAccessException("topicSelectContainer");
        }
        view.setSelected(false);
        ImageView imageView = this.f136883b;
        if (imageView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("topicSelectIcon");
        }
        imageView.setImageResource(R.drawable.icon_group_type_dot);
        TextView textView = this.f136884c;
        if (textView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("topicSelectText");
        }
        textView.setTextColor(C57582a.m223616d(chatModeSelectActivity, R.color.text_title));
        View view2 = this.f136885d;
        if (view2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("conversionSelectContainer");
        }
        view2.setSelected(true);
        ImageView imageView2 = this.f136886e;
        if (imageView2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("conversionSelectIcon");
        }
        imageView2.setImageDrawable(UDIconUtils.getIconDrawable(chatModeSelectActivity, (int) R.drawable.ud_icon_msgcard_rectangle_outlined, d));
        TextView textView2 = this.f136887f;
        if (textView2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("conversionSelectText");
        }
        textView2.setTextColor(d);
        TextView textView3 = this.f136888g;
        if (textView3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("hintText");
        }
        textView3.setText(R.string.Lark_Group_CreateGroup_Mode_Default_Description);
        View view3 = this.f136889h;
        if (view3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("topicExampleView");
        }
        view3.setVisibility(4);
        View view4 = this.f136890i;
        if (view4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("conversionExampleView");
        }
        view4.setVisibility(0);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.team.page.ChatModeSelectActivity$a */
    static final class View$OnClickListenerC55447a implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ ChatModeSelectActivity f136892a;

        View$OnClickListenerC55447a(ChatModeSelectActivity chatModeSelectActivity) {
            this.f136892a = chatModeSelectActivity;
        }

        public final void onClick(View view) {
            this.f136892a.mo189213a();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.team.page.ChatModeSelectActivity$b */
    static final class View$OnClickListenerC55448b implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ ChatModeSelectActivity f136893a;

        View$OnClickListenerC55448b(ChatModeSelectActivity chatModeSelectActivity) {
            this.f136893a = chatModeSelectActivity;
        }

        public final void onClick(View view) {
            this.f136893a.mo189215b();
        }
    }

    /* renamed from: a */
    public static Resources m215121a(ChatModeSelectActivity chatModeSelectActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(chatModeSelectActivity);
        }
        return chatModeSelectActivity.mo189216c();
    }

    /* renamed from: c */
    public static AssetManager m215124c(ChatModeSelectActivity chatModeSelectActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(chatModeSelectActivity);
        }
        return chatModeSelectActivity.mo189219e();
    }

    /* renamed from: b */
    public static void m215123b(ChatModeSelectActivity chatModeSelectActivity) {
        chatModeSelectActivity.mo189218d();
        if (EnterTransitionCrashOptimizer.getContext() != null) {
            ChatModeSelectActivity chatModeSelectActivity2 = chatModeSelectActivity;
            if (Build.VERSION.SDK_INT >= 21) {
                try {
                    chatModeSelectActivity2.getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
                } catch (Throwable unused) {
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.larksuite.component.air.AirActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void onCreate(Bundle bundle) {
        Serializable serializable;
        Bundle extras;
        super.onCreate(bundle);
        setContentView(R.layout.fragment_chat_mode_select);
        View findViewById = findViewById(R.id.type_topic_container);
        Intrinsics.checkExpressionValueIsNotNull(findViewById, "findViewById(R.id.type_topic_container)");
        this.f136882a = findViewById;
        View findViewById2 = findViewById(R.id.type_topic_icon);
        Intrinsics.checkExpressionValueIsNotNull(findViewById2, "findViewById(R.id.type_topic_icon)");
        this.f136883b = (ImageView) findViewById2;
        View findViewById3 = findViewById(R.id.type_topic_name);
        Intrinsics.checkExpressionValueIsNotNull(findViewById3, "findViewById(R.id.type_topic_name)");
        this.f136884c = (TextView) findViewById3;
        View findViewById4 = findViewById(R.id.type_conversion_container);
        Intrinsics.checkExpressionValueIsNotNull(findViewById4, "findViewById(R.id.type_conversion_container)");
        this.f136885d = findViewById4;
        View findViewById5 = findViewById(R.id.type_conversion_icon);
        Intrinsics.checkExpressionValueIsNotNull(findViewById5, "findViewById(R.id.type_conversion_icon)");
        this.f136886e = (ImageView) findViewById5;
        View findViewById6 = findViewById(R.id.type_conversion_name);
        Intrinsics.checkExpressionValueIsNotNull(findViewById6, "findViewById(R.id.type_conversion_name)");
        this.f136887f = (TextView) findViewById6;
        View findViewById7 = findViewById(R.id.hint);
        Intrinsics.checkExpressionValueIsNotNull(findViewById7, "findViewById(R.id.hint)");
        this.f136888g = (TextView) findViewById7;
        View findViewById8 = findViewById(R.id.example_topic);
        Intrinsics.checkExpressionValueIsNotNull(findViewById8, "findViewById(R.id.example_topic)");
        this.f136889h = findViewById8;
        View findViewById9 = findViewById(R.id.example_conversion);
        Intrinsics.checkExpressionValueIsNotNull(findViewById9, "findViewById(R.id.example_conversion)");
        this.f136890i = findViewById9;
        View view = this.f136882a;
        if (view == null) {
            Intrinsics.throwUninitializedPropertyAccessException("topicSelectContainer");
        }
        view.setOnClickListener(new View$OnClickListenerC55447a(this));
        View view2 = this.f136885d;
        if (view2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("conversionSelectContainer");
        }
        view2.setOnClickListener(new View$OnClickListenerC55448b(this));
        Intent intent = getIntent();
        Chat.ChatMode chatMode = null;
        if (intent == null || (extras = intent.getExtras()) == null) {
            serializable = null;
        } else {
            serializable = extras.getSerializable("intent_chat_mode");
        }
        if (serializable instanceof Chat.ChatMode) {
            chatMode = serializable;
        }
        Chat.ChatMode chatMode2 = chatMode;
        if (chatMode2 == null) {
            chatMode2 = this.f136891j;
        }
        this.f136891j = chatMode2;
        if (C55465a.f136932a[chatMode2.ordinal()] != 1) {
            mo189213a();
        } else {
            mo189215b();
        }
    }

    /* renamed from: a */
    public static void m215122a(ChatModeSelectActivity chatModeSelectActivity, Context context) {
        chatModeSelectActivity.mo189214a(context);
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(chatModeSelectActivity);
        }
    }

    /* renamed from: a */
    public static Context m215120a(ChatModeSelectActivity chatModeSelectActivity, Configuration configuration) {
        Context a = chatModeSelectActivity.mo189212a(configuration);
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).getLocaleWatcher().mo105895a("lancet_hook_create_configuration", a);
        Log.m165389i("LanguageHooker", "hook createConfigurationContext");
        return ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).updateContextForLanguage(a);
    }
}
