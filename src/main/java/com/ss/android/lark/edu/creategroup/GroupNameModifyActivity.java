package com.ss.android.lark.edu.creategroup;

import android.content.Context;
import android.content.Intent;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import androidx.core.content.ContextCompat;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.larksuite.framework.utils.KeyboardUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.base.fragment.BaseFragmentActivity;
import com.ss.android.lark.biz.core.api.ICoreApi;
import com.ss.android.lark.dfcore.DynamicFeatureCore;
import com.ss.android.lark.edu.util.EduStatisticUtil;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.ui.CommonTitleBar;
import com.ss.android.lark.ui.IActionTitlebar;
import com.ss.android.lark.utils.ApiUtils;
import com.ss.android.lark.utils.C57824f;
import com.ss.android.lark.utils.EditTextLengthFilter;
import com.ss.android.lark.utils.UIHelper;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u001b2\u00020\u0001:\u0001\u001bB\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u000f\u001a\u00020\u0010H\u0002J\b\u0010\u0011\u001a\u00020\u0010H\u0002J\b\u0010\u0012\u001a\u00020\u0010H\u0002J\b\u0010\u0013\u001a\u00020\u0010H\u0002J\u0012\u0010\u0014\u001a\u00020\u00102\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0002J\u0012\u0010\u0017\u001a\u00020\u00102\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0014J\b\u0010\u001a\u001a\u00020\u0010H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X.¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X.¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX.¢\u0006\u0002\n\u0000R\u001b\u0010\t\u001a\u00020\n8BX\u0002¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000b\u0010\f¨\u0006\u001c"}, d2 = {"Lcom/ss/android/lark/edu/creategroup/GroupNameModifyActivity;", "Lcom/ss/android/lark/base/fragment/BaseFragmentActivity;", "()V", "clearButton", "Landroid/widget/ImageView;", "container", "Landroid/view/ViewGroup;", "editor", "Landroid/widget/EditText;", "groupName", "", "getGroupName", "()Ljava/lang/String;", "groupName$delegate", "Lkotlin/Lazy;", "bindEditor", "", "bindEvent", "bindTitleBar", "bindView", "handleSaveGroupNameGroup", "v", "Landroid/view/View;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "setupView", "Companion", "features_edu_release"}, mo238835k = 1, mv = {1, 1, 15})
public final class GroupNameModifyActivity extends BaseFragmentActivity {

    /* renamed from: a */
    static final /* synthetic */ KProperty[] f94928a = {Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(GroupNameModifyActivity.class), "groupName", "getGroupName()Ljava/lang/String;"))};

    /* renamed from: e */
    public static final Companion f94929e = new Companion(null);

    /* renamed from: b */
    public EditText f94930b;

    /* renamed from: c */
    public ImageView f94931c;

    /* renamed from: d */
    public ViewGroup f94932d;

    /* renamed from: f */
    private final Lazy f94933f = LazyKt.lazy(new C36932g(this));

    /* renamed from: d */
    private final String m145783d() {
        Lazy lazy = this.f94933f;
        KProperty kProperty = f94928a[0];
        return (String) lazy.getValue();
    }

    /* renamed from: a */
    public Context mo136314a(Configuration configuration) {
        return super.createConfigurationContext(configuration);
    }

    /* renamed from: a */
    public Resources mo136315a() {
        return super.getResources();
    }

    /* renamed from: a */
    public void mo136316a(Context context) {
        super.attachBaseContext(context);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void attachBaseContext(Context context) {
        m145779a(this, context);
    }

    /* renamed from: b */
    public void mo136317b() {
        super.onStop();
    }

    /* renamed from: c */
    public AssetManager mo136318c() {
        return super.getAssets();
    }

    public Context createConfigurationContext(Configuration configuration) {
        return m145777a(this, configuration);
    }

    public AssetManager getAssets() {
        return m145786f(this);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, com.larksuite.component.air.AirActivity
    public Resources getResources() {
        return m145782d(this);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity
    public void onStop() {
        m145785e(this);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lcom/ss/android/lark/edu/creategroup/GroupNameModifyActivity$Companion;", "", "()V", "GROUP_NAME_MAX_LENGTH", "", "KEY_GROUP_NAME", "", "features_edu_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.ss.android.lark.edu.creategroup.GroupNameModifyActivity$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: e */
    private final void m145784e() {
        m145788g();
        m145789h();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.ss.android.lark.edu.creategroup.GroupNameModifyActivity$g */
    static final class C36932g extends Lambda implements Function0<String> {
        final /* synthetic */ GroupNameModifyActivity this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C36932g(GroupNameModifyActivity groupNameModifyActivity) {
            super(0);
            this.this$0 = groupNameModifyActivity;
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            String stringExtra = this.this$0.getIntent().getStringExtra("gourp_name");
            if (stringExtra != null) {
                return stringExtra;
            }
            return "";
        }
    }

    /* renamed from: f */
    private final void m145787f() {
        View findViewById = findViewById(R.id.info_edit_text);
        Intrinsics.checkExpressionValueIsNotNull(findViewById, "findViewById(R.id.info_edit_text)");
        this.f94930b = (EditText) findViewById;
        View findViewById2 = findViewById(R.id.clear_btn);
        Intrinsics.checkExpressionValueIsNotNull(findViewById2, "findViewById(R.id.clear_btn)");
        this.f94931c = (ImageView) findViewById2;
        View findViewById3 = findViewById(R.id.container);
        Intrinsics.checkExpressionValueIsNotNull(findViewById3, "findViewById(R.id.container)");
        this.f94932d = (ViewGroup) findViewById3;
    }

    /* renamed from: i */
    private final void m145790i() {
        ImageView imageView = this.f94931c;
        if (imageView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("clearButton");
        }
        imageView.setOnClickListener(new View$OnClickListenerC36927b(this));
        ViewGroup viewGroup = this.f94932d;
        if (viewGroup == null) {
            Intrinsics.throwUninitializedPropertyAccessException("container");
        }
        viewGroup.setOnClickListener(new View$OnClickListenerC36928c(this));
        EditText editText = this.f94930b;
        if (editText == null) {
            Intrinsics.throwUninitializedPropertyAccessException("editor");
        }
        editText.setOnFocusChangeListener(new View$OnFocusChangeListenerC36929d(this));
    }

    /* renamed from: g */
    private final void m145788g() {
        CommonTitleBar commonTitleBar = (CommonTitleBar) findViewById(R.id.titlebar);
        commonTitleBar.setLeftClickListener(new View$OnClickListenerC36930e(this));
        commonTitleBar.setTitle(R.string.Lark_Legacy_GroupName);
        commonTitleBar.setMainTitleColor(ContextCompat.getColor(this, R.color.lkui_N900));
        commonTitleBar.addAction(new C36931f(this, UIHelper.getString(R.string.Lark_Legacy_Save)));
        Intrinsics.checkExpressionValueIsNotNull(commonTitleBar, "titleBar");
        commonTitleBar.getRightText().setPadding(0, 0, UIHelper.dp2px(15.0f), 0);
    }

    /* renamed from: h */
    private final void m145789h() {
        EditText editText = this.f94930b;
        if (editText == null) {
            Intrinsics.throwUninitializedPropertyAccessException("editor");
        }
        editText.setSingleLine();
        String d = m145783d();
        EditText editText2 = this.f94930b;
        if (editText2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("editor");
        }
        editText2.setText(d);
        EditText editText3 = this.f94930b;
        if (editText3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("editor");
        }
        editText3.setSelection(d.length());
        EditText editText4 = this.f94930b;
        if (editText4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("editor");
        }
        editText4.setFilters(new EditTextLengthFilter[]{new EditTextLengthFilter(40, null)});
        ImageView imageView = this.f94931c;
        if (imageView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("clearButton");
        }
        imageView.setVisibility(0);
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.ss.android.lark.edu.creategroup.GroupNameModifyActivity$b */
    public static final class View$OnClickListenerC36927b implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ GroupNameModifyActivity f94934a;

        View$OnClickListenerC36927b(GroupNameModifyActivity groupNameModifyActivity) {
            this.f94934a = groupNameModifyActivity;
        }

        public final void onClick(View view) {
            GroupNameModifyActivity.m145778a(this.f94934a).setText("");
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/lark/edu/creategroup/GroupNameModifyActivity$bindTitleBar$2", "Lcom/ss/android/lark/ui/IActionTitlebar$TextAction;", "performAction", "", "view", "Landroid/view/View;", "features_edu_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.ss.android.lark.edu.creategroup.GroupNameModifyActivity$f */
    public static final class C36931f extends IActionTitlebar.TextAction {

        /* renamed from: a */
        final /* synthetic */ GroupNameModifyActivity f94938a;

        @Override // com.ss.android.lark.ui.IActionTitlebar.Action, com.ss.android.lark.ui.IActionTitlebar.BaseAction
        public void performAction(View view) {
            Intrinsics.checkParameterIsNotNull(view, "view");
            super.performAction(view);
            this.f94938a.handleSaveGroupNameGroup(view);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C36931f(GroupNameModifyActivity groupNameModifyActivity, String str) {
            super(str);
            this.f94938a = groupNameModifyActivity;
        }
    }

    /* renamed from: a */
    public static final /* synthetic */ EditText m145778a(GroupNameModifyActivity groupNameModifyActivity) {
        EditText editText = groupNameModifyActivity.f94930b;
        if (editText == null) {
            Intrinsics.throwUninitializedPropertyAccessException("editor");
        }
        return editText;
    }

    /* renamed from: b */
    public static final /* synthetic */ ViewGroup m145780b(GroupNameModifyActivity groupNameModifyActivity) {
        ViewGroup viewGroup = groupNameModifyActivity.f94932d;
        if (viewGroup == null) {
            Intrinsics.throwUninitializedPropertyAccessException("container");
        }
        return viewGroup;
    }

    /* renamed from: c */
    public static final /* synthetic */ ImageView m145781c(GroupNameModifyActivity groupNameModifyActivity) {
        ImageView imageView = groupNameModifyActivity.f94931c;
        if (imageView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("clearButton");
        }
        return imageView;
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.ss.android.lark.edu.creategroup.GroupNameModifyActivity$e */
    public static final class View$OnClickListenerC36930e implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ GroupNameModifyActivity f94937a;

        View$OnClickListenerC36930e(GroupNameModifyActivity groupNameModifyActivity) {
            this.f94937a = groupNameModifyActivity;
        }

        public final void onClick(View view) {
            KeyboardUtils.hideKeyboard(this.f94937a);
            this.f94937a.setResult(0);
            this.f94937a.finish();
        }
    }

    /* renamed from: d */
    public static Resources m145782d(GroupNameModifyActivity groupNameModifyActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(groupNameModifyActivity);
        }
        return groupNameModifyActivity.mo136315a();
    }

    /* renamed from: f */
    public static AssetManager m145786f(GroupNameModifyActivity groupNameModifyActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(groupNameModifyActivity);
        }
        return groupNameModifyActivity.mo136318c();
    }

    /* access modifiers changed from: protected */
    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.larksuite.component.air.AirActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_group_name_modify);
        m145787f();
        m145784e();
        m145790i();
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.ss.android.lark.edu.creategroup.GroupNameModifyActivity$c */
    public static final class View$OnClickListenerC36928c implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ GroupNameModifyActivity f94935a;

        View$OnClickListenerC36928c(GroupNameModifyActivity groupNameModifyActivity) {
            this.f94935a = groupNameModifyActivity;
        }

        public final void onClick(View view) {
            GroupNameModifyActivity.m145778a(this.f94935a).clearFocus();
            GroupNameModifyActivity.m145780b(this.f94935a).setFocusable(true);
            GroupNameModifyActivity.m145780b(this.f94935a).setFocusableInTouchMode(true);
            GroupNameModifyActivity.m145780b(this.f94935a).requestFocus();
            KeyboardUtils.hideKeyboard(this.f94935a);
        }
    }

    /* renamed from: e */
    public static void m145785e(GroupNameModifyActivity groupNameModifyActivity) {
        groupNameModifyActivity.mo136317b();
        if (EnterTransitionCrashOptimizer.getContext() != null) {
            GroupNameModifyActivity groupNameModifyActivity2 = groupNameModifyActivity;
            if (Build.VERSION.SDK_INT >= 21) {
                try {
                    groupNameModifyActivity2.getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
                } catch (Throwable unused) {
                }
            }
        }
    }

    public final void handleSaveGroupNameGroup(View view) {
        if (view != null) {
            EditText editText = this.f94930b;
            if (editText == null) {
                Intrinsics.throwUninitializedPropertyAccessException("editor");
            }
            String obj = editText.getText().toString();
            if (!TextUtils.isEmpty(obj)) {
                Intent intent = new Intent();
                intent.putExtra("gourp_name", obj);
                setResult(-1, intent);
                EduStatisticUtil.m145871a(obj);
                finish();
            }
        }
    }

    /* renamed from: a */
    public static void m145779a(GroupNameModifyActivity groupNameModifyActivity, Context context) {
        groupNameModifyActivity.mo136316a(context);
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(groupNameModifyActivity);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "<anonymous parameter 0>", "Landroid/view/View;", "kotlin.jvm.PlatformType", "hasFocus", "", "onFocusChange"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.ss.android.lark.edu.creategroup.GroupNameModifyActivity$d */
    public static final class View$OnFocusChangeListenerC36929d implements View.OnFocusChangeListener {

        /* renamed from: a */
        final /* synthetic */ GroupNameModifyActivity f94936a;

        View$OnFocusChangeListenerC36929d(GroupNameModifyActivity groupNameModifyActivity) {
            this.f94936a = groupNameModifyActivity;
        }

        public final void onFocusChange(View view, boolean z) {
            int i;
            if (z) {
                KeyboardUtils.showKeyboard(this.f94936a);
            } else {
                KeyboardUtils.hideKeyboard(this.f94936a);
            }
            ImageView c = GroupNameModifyActivity.m145781c(this.f94936a);
            if (z) {
                i = 0;
            } else {
                i = 8;
            }
            c.setVisibility(i);
        }
    }

    /* renamed from: a */
    public static Context m145777a(GroupNameModifyActivity groupNameModifyActivity, Configuration configuration) {
        Context a = groupNameModifyActivity.mo136314a(configuration);
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).getLocaleWatcher().mo105895a("lancet_hook_create_configuration", a);
        Log.m165389i("LanguageHooker", "hook createConfigurationContext");
        return ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).updateContextForLanguage(a);
    }
}
