package com.ss.android.lark.moments.impl.report;

import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.text.Editable;
import android.text.InputFilter;
import android.text.Spanned;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.AbstractC1178x;
import androidx.lifecycle.ViewModelLazy;
import com.airbnb.lottie.LottieAnimationView;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.huawei.hms.location.LocationRequest;
import com.huawei.updatesdk.service.otaupdate.UpdateKey;
import com.larksuite.component.ui.imageview.LKUIRoundedImageView2;
import com.larksuite.component.ui.toast.C25707a;
import com.larksuite.component.ui.toast.LKUIToast;
import com.larksuite.component.universe_design.util.UDUiModeUtils;
import com.larksuite.framework.utils.KeyboardUtils;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.base.fragment.BaseFragmentActivity;
import com.ss.android.lark.biz.core.api.ICoreApi;
import com.ss.android.lark.dfcore.DynamicFeatureCore;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.moments.impl.mainview.MomentsAppNameHolder;
import com.ss.android.lark.ui.CommonTitleBar;
import com.ss.android.lark.utils.ApiUtils;
import com.ss.android.lark.utils.C57824f;
import com.ss.android.lark.utils.UIHelper;
import java.util.HashMap;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u000e\u001a\u00020\u000fH\u0002J\b\u0010\u0010\u001a\u00020\u000fH\u0002J\u0012\u0010\u0011\u001a\u00020\u000f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0014J\u0010\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\u0015\u001a\u00020\u0016H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u000e¢\u0006\u0002\n\u0000R\u001b\u0010\b\u001a\u00020\t8BX\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\n\u0010\u000b¨\u0006\u0018"}, d2 = {"Lcom/ss/android/lark/moments/impl/report/MomentsReportActivity;", "Lcom/ss/android/lark/base/fragment/BaseFragmentActivity;", "()V", "commentId", "", "postId", "textCountFilterToast", "Lcom/larksuite/component/ui/toast/LKUIGlobalToast;", "vm", "Lcom/ss/android/lark/moments/impl/report/MomentsReportViewModel;", "getVm", "()Lcom/ss/android/lark/moments/impl/report/MomentsReportViewModel;", "vm$delegate", "Lkotlin/Lazy;", "initObserver", "", "initView", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "setReportButtonStatus", UpdateKey.STATUS, "", "Companion", "im_moments-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class MomentsReportActivity extends BaseFragmentActivity {

    /* renamed from: d */
    public static final Companion f120868d = new Companion(null);

    /* renamed from: a */
    public String f120869a = "";

    /* renamed from: b */
    public String f120870b = "";

    /* renamed from: c */
    public C25707a f120871c;

    /* renamed from: e */
    private final Lazy f120872e = new ViewModelLazy(Reflection.getOrCreateKotlinClass(MomentsReportViewModel.class), new MomentsReportActivity$$special$$inlined$viewModels$2(this), new MomentsReportActivity$$special$$inlined$viewModels$1(this));

    /* renamed from: f */
    private HashMap f120873f;

    /* renamed from: a */
    public Context mo168149a(Configuration configuration) {
        return super.createConfigurationContext(configuration);
    }

    /* renamed from: a */
    public final MomentsReportViewModel mo168150a() {
        return (MomentsReportViewModel) this.f120872e.getValue();
    }

    /* renamed from: a */
    public void mo168152a(Context context) {
        super.attachBaseContext(context);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void attachBaseContext(Context context) {
        m189526a(this, context);
    }

    /* renamed from: b */
    public Resources mo168153b() {
        return super.getResources();
    }

    /* renamed from: b */
    public View mo168154b(int i) {
        if (this.f120873f == null) {
            this.f120873f = new HashMap();
        }
        View view = (View) this.f120873f.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f120873f.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    /* renamed from: c */
    public void mo168155c() {
        super.onStop();
    }

    public Context createConfigurationContext(Configuration configuration) {
        return m189524a(this, configuration);
    }

    /* renamed from: d */
    public AssetManager mo168157d() {
        return super.getAssets();
    }

    public AssetManager getAssets() {
        return m189528c(this);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, com.larksuite.component.air.AirActivity
    public Resources getResources() {
        return m189525a(this);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity
    public void onStop() {
        m189527b(this);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bXT¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\bXT¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/ss/android/lark/moments/impl/report/MomentsReportActivity$Companion;", "", "()V", "BT_STATUS_DISABLE", "", "BT_STATUS_LOADING", "BT_STATUS_NORMAL", "EXTRA_KEY_COMMENT_ID", "", "EXTRA_KEY_POST_ID", "MAX_REPORT_DESCRIPTION_COUNT", "im_moments-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.moments.impl.report.MomentsReportActivity$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: f */
    private final void m189530f() {
        mo168150a().getReportResponse().mo5923a(this, new C48008b(this));
    }

    /* renamed from: e */
    private final void m189529e() {
        MomentsReportActivity momentsReportActivity = this;
        ((CommonTitleBar) mo168154b(R.id.titleBar)).setTitle(UIUtils.getString(momentsReportActivity, R.string.Lark_Community_Report));
        ((CommonTitleBar) mo168154b(R.id.titleBar)).setLeftClickListener(new View$OnClickListenerC48009c(this));
        if (UDUiModeUtils.m93319a(momentsReportActivity)) {
            ((ConstraintLayout) mo168154b(R.id.root_view)).setBackgroundColor(UIHelper.getColor(R.color.bg_base));
        } else {
            ((ConstraintLayout) mo168154b(R.id.root_view)).setBackgroundColor(UIHelper.getColor(R.color.ud_N100));
        }
        TextView textView = (TextView) mo168154b(R.id.tvTips);
        Intrinsics.checkExpressionValueIsNotNull(textView, "tvTips");
        textView.setText(UIHelper.mustacheFormat((int) R.string.Lark_Community_ReportInfoWillGoToCommunityAdminCustomized, "ExclusiveCommunityName", MomentsAppNameHolder.m188686a()));
        ((EditText) mo168154b(R.id.etDescription)).addTextChangedListener(new C48010d(this));
        EditText editText = (EditText) mo168154b(R.id.etDescription);
        Intrinsics.checkExpressionValueIsNotNull(editText, "etDescription");
        editText.setFilters(new C48011e[]{new C48011e(this, LocationRequest.PRIORITY_HD_ACCURACY)});
        ((LKUIRoundedImageView2) mo168154b(R.id.btReport)).setOnClickListener(new View$OnClickListenerC48012f(this));
        mo168151a(1);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J*\u0010\u0006\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\tH\u0016J*\u0010\f\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tH\u0016¨\u0006\u000e"}, d2 = {"com/ss/android/lark/moments/impl/report/MomentsReportActivity$initView$2", "Landroid/text/TextWatcher;", "afterTextChanged", "", "s", "Landroid/text/Editable;", "beforeTextChanged", "", "start", "", "count", "after", "onTextChanged", "before", "im_moments-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.moments.impl.report.MomentsReportActivity$d */
    public static final class C48010d implements TextWatcher {

        /* renamed from: a */
        final /* synthetic */ MomentsReportActivity f120876a;

        public void afterTextChanged(Editable editable) {
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C48010d(MomentsReportActivity momentsReportActivity) {
            this.f120876a = momentsReportActivity;
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            EditText editText = (EditText) this.f120876a.mo168154b(R.id.etDescription);
            Intrinsics.checkExpressionValueIsNotNull(editText, "etDescription");
            int length = editText.getText().length();
            if (length <= 0) {
                this.f120876a.mo168151a(1);
            } else {
                this.f120876a.mo168151a(0);
            }
            TextView textView = (TextView) this.f120876a.mo168154b(R.id.tvTextCount);
            Intrinsics.checkExpressionValueIsNotNull(textView, "tvTextCount");
            textView.setText(length + "/200");
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.moments.impl.report.MomentsReportActivity$c */
    public static final class View$OnClickListenerC48009c implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ MomentsReportActivity f120875a;

        View$OnClickListenerC48009c(MomentsReportActivity momentsReportActivity) {
            this.f120875a = momentsReportActivity;
        }

        public final void onClick(View view) {
            KeyboardUtils.hideKeyboard(this.f120875a);
            this.f120875a.finish();
        }
    }

    /* renamed from: a */
    public static Resources m189525a(MomentsReportActivity momentsReportActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(momentsReportActivity);
        }
        return momentsReportActivity.mo168153b();
    }

    /* renamed from: c */
    public static AssetManager m189528c(MomentsReportActivity momentsReportActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(momentsReportActivity);
        }
        return momentsReportActivity.mo168157d();
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.moments.impl.report.MomentsReportActivity$f */
    public static final class View$OnClickListenerC48012f implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ MomentsReportActivity f120878a;

        View$OnClickListenerC48012f(MomentsReportActivity momentsReportActivity) {
            this.f120878a = momentsReportActivity;
        }

        public final void onClick(View view) {
            KeyboardUtils.hideKeyboard(this.f120878a);
            this.f120878a.mo168151a(2);
            MomentsReportViewModel a = this.f120878a.mo168150a();
            String str = this.f120878a.f120869a;
            String str2 = this.f120878a.f120870b;
            EditText editText = (EditText) this.f120878a.mo168154b(R.id.etDescription);
            Intrinsics.checkExpressionValueIsNotNull(editText, "etDescription");
            a.sendReport(str, str2, editText.getText().toString());
        }
    }

    /* renamed from: b */
    public static void m189527b(MomentsReportActivity momentsReportActivity) {
        momentsReportActivity.mo168155c();
        if (EnterTransitionCrashOptimizer.getContext() != null) {
            MomentsReportActivity momentsReportActivity2 = momentsReportActivity;
            if (Build.VERSION.SDK_INT >= 21) {
                try {
                    momentsReportActivity2.getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
                } catch (Throwable unused) {
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.larksuite.component.air.AirActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.moments_activity_report);
        String stringExtra = getIntent().getStringExtra("post_id");
        String str = "";
        if (stringExtra == null) {
            stringExtra = str;
        }
        this.f120869a = stringExtra;
        String stringExtra2 = getIntent().getStringExtra("comment_id");
        if (stringExtra2 != null) {
            str = stringExtra2;
        }
        this.f120870b = str;
        m189529e();
        m189530f();
        ((EditText) mo168154b(R.id.etDescription)).requestFocus();
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "onChanged", "(Ljava/lang/Boolean;)V"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.moments.impl.report.MomentsReportActivity$b */
    public static final class C48008b<T> implements AbstractC1178x<Boolean> {

        /* renamed from: a */
        final /* synthetic */ MomentsReportActivity f120874a;

        C48008b(MomentsReportActivity momentsReportActivity) {
            this.f120874a = momentsReportActivity;
        }

        /* renamed from: a */
        public final void onChanged(Boolean bool) {
            Intrinsics.checkExpressionValueIsNotNull(bool, "it");
            if (bool.booleanValue()) {
                MomentsReportActivity momentsReportActivity = this.f120874a;
                LKUIToast.show(momentsReportActivity, UIUtils.getString(momentsReportActivity, R.string.Lark_Community_ReportSuccessful));
                this.f120874a.finish();
                return;
            }
            MomentsReportActivity momentsReportActivity2 = this.f120874a;
            LKUIToast.show(momentsReportActivity2, UIUtils.getString(momentsReportActivity2, R.string.Lark_Community_ReportFailed));
            this.f120874a.mo168151a(0);
            ((EditText) this.f120874a.mo168154b(R.id.etDescription)).requestFocus();
            KeyboardUtils.showKeyboard(this.f120874a);
        }
    }

    /* renamed from: a */
    public final void mo168151a(int i) {
        if (i == 0) {
            ((LKUIRoundedImageView2) mo168154b(R.id.btReport)).setBackgroundColor(UIUtils.getColor(this, R.color.primary_pri_500));
            LKUIRoundedImageView2 lKUIRoundedImageView2 = (LKUIRoundedImageView2) mo168154b(R.id.btReport);
            Intrinsics.checkExpressionValueIsNotNull(lKUIRoundedImageView2, "btReport");
            lKUIRoundedImageView2.setEnabled(true);
            LKUIRoundedImageView2 lKUIRoundedImageView22 = (LKUIRoundedImageView2) mo168154b(R.id.btReport);
            Intrinsics.checkExpressionValueIsNotNull(lKUIRoundedImageView22, "btReport");
            lKUIRoundedImageView22.setClickable(true);
            EditText editText = (EditText) mo168154b(R.id.etDescription);
            Intrinsics.checkExpressionValueIsNotNull(editText, "etDescription");
            editText.setFocusable(true);
            EditText editText2 = (EditText) mo168154b(R.id.etDescription);
            Intrinsics.checkExpressionValueIsNotNull(editText2, "etDescription");
            editText2.setFocusableInTouchMode(true);
            LottieAnimationView lottieAnimationView = (LottieAnimationView) mo168154b(R.id.btReportLoading);
            Intrinsics.checkExpressionValueIsNotNull(lottieAnimationView, "btReportLoading");
            lottieAnimationView.setVisibility(8);
        } else if (i == 1) {
            ((LKUIRoundedImageView2) mo168154b(R.id.btReport)).setBackgroundColor(UIUtils.getColor(this, R.color.fill_disable));
            LKUIRoundedImageView2 lKUIRoundedImageView23 = (LKUIRoundedImageView2) mo168154b(R.id.btReport);
            Intrinsics.checkExpressionValueIsNotNull(lKUIRoundedImageView23, "btReport");
            lKUIRoundedImageView23.setEnabled(false);
            LKUIRoundedImageView2 lKUIRoundedImageView24 = (LKUIRoundedImageView2) mo168154b(R.id.btReport);
            Intrinsics.checkExpressionValueIsNotNull(lKUIRoundedImageView24, "btReport");
            lKUIRoundedImageView24.setClickable(false);
            EditText editText3 = (EditText) mo168154b(R.id.etDescription);
            Intrinsics.checkExpressionValueIsNotNull(editText3, "etDescription");
            editText3.setFocusable(true);
            EditText editText4 = (EditText) mo168154b(R.id.etDescription);
            Intrinsics.checkExpressionValueIsNotNull(editText4, "etDescription");
            editText4.setFocusableInTouchMode(true);
            LottieAnimationView lottieAnimationView2 = (LottieAnimationView) mo168154b(R.id.btReportLoading);
            Intrinsics.checkExpressionValueIsNotNull(lottieAnimationView2, "btReportLoading");
            lottieAnimationView2.setVisibility(8);
        } else if (i == 2) {
            ((LKUIRoundedImageView2) mo168154b(R.id.btReport)).setBackgroundColor(UIUtils.getColor(this, R.color.primary_pri_300));
            LKUIRoundedImageView2 lKUIRoundedImageView25 = (LKUIRoundedImageView2) mo168154b(R.id.btReport);
            Intrinsics.checkExpressionValueIsNotNull(lKUIRoundedImageView25, "btReport");
            lKUIRoundedImageView25.setEnabled(false);
            LKUIRoundedImageView2 lKUIRoundedImageView26 = (LKUIRoundedImageView2) mo168154b(R.id.btReport);
            Intrinsics.checkExpressionValueIsNotNull(lKUIRoundedImageView26, "btReport");
            lKUIRoundedImageView26.setClickable(false);
            EditText editText5 = (EditText) mo168154b(R.id.etDescription);
            Intrinsics.checkExpressionValueIsNotNull(editText5, "etDescription");
            editText5.setFocusable(false);
            EditText editText6 = (EditText) mo168154b(R.id.etDescription);
            Intrinsics.checkExpressionValueIsNotNull(editText6, "etDescription");
            editText6.setFocusableInTouchMode(false);
            LottieAnimationView lottieAnimationView3 = (LottieAnimationView) mo168154b(R.id.btReportLoading);
            Intrinsics.checkExpressionValueIsNotNull(lottieAnimationView3, "btReportLoading");
            lottieAnimationView3.setVisibility(0);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J:\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u0006H\u0016¨\u0006\f"}, d2 = {"com/ss/android/lark/moments/impl/report/MomentsReportActivity$initView$3", "Landroid/text/InputFilter$LengthFilter;", "filter", "", ShareHitPoint.f121868c, "start", "", "end", "dest", "Landroid/text/Spanned;", "dstart", "dend", "im_moments-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.moments.impl.report.MomentsReportActivity$e */
    public static final class C48011e extends InputFilter.LengthFilter {

        /* renamed from: a */
        final /* synthetic */ MomentsReportActivity f120877a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C48011e(MomentsReportActivity momentsReportActivity, int i) {
            super(i);
            this.f120877a = momentsReportActivity;
        }

        public CharSequence filter(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
            Intrinsics.checkParameterIsNotNull(charSequence, ShareHitPoint.f121868c);
            Intrinsics.checkParameterIsNotNull(spanned, "dest");
            if (spanned.length() - (i4 - i3) >= getMax()) {
                C25707a aVar = this.f120877a.f120871c;
                if (aVar != null) {
                    aVar.mo90189b();
                }
                MomentsReportActivity momentsReportActivity = this.f120877a;
                momentsReportActivity.f120871c = LKUIToast.newGlobal(momentsReportActivity, UIUtils.getString(momentsReportActivity, R.string.Lark_Community_LimitReport200Words));
                C25707a aVar2 = this.f120877a.f120871c;
                if (aVar2 != null) {
                    aVar2.mo90191c();
                }
            }
            return super.filter(charSequence, i, i2, spanned, i3, i4);
        }
    }

    /* renamed from: a */
    public static void m189526a(MomentsReportActivity momentsReportActivity, Context context) {
        momentsReportActivity.mo168152a(context);
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(momentsReportActivity);
        }
    }

    /* renamed from: a */
    public static Context m189524a(MomentsReportActivity momentsReportActivity, Configuration configuration) {
        Context a = momentsReportActivity.mo168149a(configuration);
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).getLocaleWatcher().mo105895a("lancet_hook_create_configuration", a);
        Log.m165389i("LanguageHooker", "hook createConfigurationContext");
        return ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).updateContextForLanguage(a);
    }
}
