package com.ss.android.appcenter.business.activity.appsetting;

import android.content.Context;
import android.content.res.Resources;
import android.os.CountDownTimer;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.huawei.updatesdk.service.otaupdate.UpdateKey;
import com.larksuite.component.universe_design.color.UDColorUtils;
import com.larksuite.suite.R;
import com.ss.android.appcenter.business.monitor.statistics.C27710b;
import com.ss.android.appcenter.common.util.C28184h;
import com.ss.android.appcenter.common.util.C28209p;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0016\u0018\u0000 .2\u00020\u00012\u00020\u0002:\u0001.B%\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\u000e\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020\bJ\u0010\u0010'\u001a\u00020%2\u0006\u0010(\u001a\u00020)H\u0016J\u0010\u0010*\u001a\u00020%2\u0006\u0010(\u001a\u00020)H\u0016J\u000e\u0010+\u001a\u00020%2\u0006\u0010,\u001a\u00020)J\b\u0010-\u001a\u00020%H\u0002R\u001a\u0010\n\u001a\u00020\bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\u0010X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0015\u001a\u00020\u0016X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u001a\u0010\u001b\u001a\u00020\u0016X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0018\"\u0004\b\u001d\u0010\u001aR\u001a\u0010\u001e\u001a\u00020\u0016X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u0018\"\u0004\b \u0010\u001aR\u001a\u0010!\u001a\u00020\u0016X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\u0018\"\u0004\b#\u0010\u001a¨\u0006/"}, d2 = {"Lcom/ss/android/appcenter/business/activity/appsetting/GadgetVersionUpdateView;", "Landroid/widget/FrameLayout;", "Lcom/ss/android/appcenter/business/activity/appsetting/GadgetUpdateCallback;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "currentStatus", "getCurrentStatus", "()I", "setCurrentStatus", "(I)V", "loadingView", "Landroid/widget/LinearLayout;", "getLoadingView", "()Landroid/widget/LinearLayout;", "setLoadingView", "(Landroid/widget/LinearLayout;)V", "reloadView", "Landroid/widget/TextView;", "getReloadView", "()Landroid/widget/TextView;", "setReloadView", "(Landroid/widget/TextView;)V", "retryView", "getRetryView", "setRetryView", "versionTag", "getVersionTag", "setVersionTag", "versionText", "getVersionText", "setVersionText", "changeStatus", "", UpdateKey.STATUS, "onDownloadFailed", "appId", "", "onDownloadSuccess", "setVersion", HiAnalyticsConstant.HaKey.BI_KEY_VERSION, "updateView", "Companion", "appcenter_release"}, mo238835k = 1, mv = {1, 1, 16})
public class GadgetVersionUpdateView extends FrameLayout implements GadgetUpdateCallback {

    /* renamed from: a */
    public static final Companion f69106a = new Companion(null);

    /* renamed from: b */
    private TextView f69107b;

    /* renamed from: c */
    private TextView f69108c;

    /* renamed from: d */
    private LinearLayout f69109d;

    /* renamed from: e */
    private TextView f69110e;

    /* renamed from: f */
    private TextView f69111f;

    /* renamed from: g */
    private int f69112g;

    public GadgetVersionUpdateView(Context context) {
        this(context, null, 0, 6, null);
    }

    public GadgetVersionUpdateView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lcom/ss/android/appcenter/business/activity/appsetting/GadgetVersionUpdateView$Companion;", "", "()V", "STATUS_ERROR", "", "STATUS_FINISH", "STATUS_LATEST", "STATUS_LOADING", "appcenter_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.appcenter.business.activity.appsetting.GadgetVersionUpdateView$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final int getCurrentStatus() {
        return this.f69112g;
    }

    public final LinearLayout getLoadingView() {
        return this.f69109d;
    }

    public final TextView getReloadView() {
        return this.f69110e;
    }

    public final TextView getRetryView() {
        return this.f69111f;
    }

    public final TextView getVersionTag() {
        return this.f69108c;
    }

    public final TextView getVersionText() {
        return this.f69107b;
    }

    /* renamed from: a */
    private final void m101080a() {
        int i = this.f69112g;
        if (i == 0) {
            this.f69108c.setVisibility(0);
            this.f69108c.setBackgroundResource(R.drawable.app_setting_tag_latest);
            TextView textView = this.f69108c;
            Context context = getContext();
            Intrinsics.checkExpressionValueIsNotNull(context, "context");
            textView.setTextColor(UDColorUtils.getColor(context, R.color.text_placeholder));
            this.f69108c.setText(C28209p.m103297a(getContext(), (int) R.string.AppDetail_Setting_NoUpdate));
            this.f69109d.setVisibility(8);
            this.f69110e.setVisibility(8);
            this.f69111f.setVisibility(8);
        } else if (i == 1) {
            this.f69108c.setVisibility(0);
            this.f69108c.setBackgroundResource(R.drawable.app_setting_tag_hasnew);
            TextView textView2 = this.f69108c;
            Context context2 = getContext();
            Intrinsics.checkExpressionValueIsNotNull(context2, "context");
            textView2.setTextColor(UDColorUtils.getColor(context2, R.color.function_danger_500));
            this.f69108c.setText(C28209p.m103297a(getContext(), (int) R.string.AppDetail_Setting_Update));
            this.f69109d.setVisibility(0);
            this.f69110e.setVisibility(8);
            this.f69111f.setVisibility(8);
        } else if (i == 2) {
            this.f69108c.setVisibility(0);
            this.f69108c.setBackgroundResource(R.drawable.app_setting_tag_hasnew);
            TextView textView3 = this.f69108c;
            Context context3 = getContext();
            Intrinsics.checkExpressionValueIsNotNull(context3, "context");
            textView3.setTextColor(UDColorUtils.getColor(context3, R.color.function_danger_500));
            this.f69108c.setText(C28209p.m103297a(getContext(), (int) R.string.AppDetail_Setting_Update));
            this.f69109d.setVisibility(8);
            this.f69110e.setVisibility(0);
            this.f69111f.setVisibility(8);
        } else if (i == 3) {
            this.f69108c.setVisibility(0);
            this.f69108c.setBackgroundResource(R.drawable.app_setting_tag_hasnew);
            TextView textView4 = this.f69108c;
            Context context4 = getContext();
            Intrinsics.checkExpressionValueIsNotNull(context4, "context");
            textView4.setTextColor(UDColorUtils.getColor(context4, R.color.function_danger_500));
            this.f69108c.setText(C28209p.m103297a(getContext(), (int) R.string.AppDetail_Setting_Update));
            this.f69109d.setVisibility(8);
            this.f69110e.setVisibility(8);
            this.f69111f.setVisibility(0);
        }
    }

    public final void setCurrentStatus(int i) {
        this.f69112g = i;
    }

    public final void setLoadingView(LinearLayout linearLayout) {
        Intrinsics.checkParameterIsNotNull(linearLayout, "<set-?>");
        this.f69109d = linearLayout;
    }

    public final void setReloadView(TextView textView) {
        Intrinsics.checkParameterIsNotNull(textView, "<set-?>");
        this.f69110e = textView;
    }

    public final void setRetryView(TextView textView) {
        Intrinsics.checkParameterIsNotNull(textView, "<set-?>");
        this.f69111f = textView;
    }

    public final void setVersionTag(TextView textView) {
        Intrinsics.checkParameterIsNotNull(textView, "<set-?>");
        this.f69108c = textView;
    }

    public final void setVersionText(TextView textView) {
        Intrinsics.checkParameterIsNotNull(textView, "<set-?>");
        this.f69107b = textView;
    }

    public final void setVersion(String str) {
        Intrinsics.checkParameterIsNotNull(str, HiAnalyticsConstant.HaKey.BI_KEY_VERSION);
        this.f69107b.setText(str);
    }

    /* renamed from: a */
    public final void mo98544a(int i) {
        C28184h.m103250d("GadgetVersionUpdateView", "status: " + i);
        this.f69112g = i;
        m101080a();
    }

    @Override // com.ss.android.appcenter.business.activity.appsetting.GadgetUpdateCallback
    /* renamed from: a */
    public void mo98545a(String str) {
        Intrinsics.checkParameterIsNotNull(str, "appId");
        CountDownTimer e = GadgetUpdateControl.f69118a.mo98580e();
        if (e != null) {
            e.cancel();
        }
        if (Intrinsics.areEqual(GadgetUpdateControl.f69118a.mo98581f(), str)) {
            mo98544a(2);
            C27710b.m101311m(GadgetUpdateControl.f69118a.mo98581f());
        }
    }

    @Override // com.ss.android.appcenter.business.activity.appsetting.GadgetUpdateCallback
    /* renamed from: b */
    public void mo98546b(String str) {
        Intrinsics.checkParameterIsNotNull(str, "appId");
        CountDownTimer e = GadgetUpdateControl.f69118a.mo98580e();
        if (e != null) {
            e.cancel();
        }
        if (Intrinsics.areEqual(GadgetUpdateControl.f69118a.mo98581f(), str)) {
            mo98544a(3);
            C27710b.m101315o(GadgetUpdateControl.f69118a.mo98581f());
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public GadgetVersionUpdateView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkParameterIsNotNull(context, "context");
        LayoutInflater.from(context).inflate(R.layout.appcenter_appsetting_view, (ViewGroup) this, true);
        View findViewById = findViewById(R.id.app_setting_version);
        Intrinsics.checkExpressionValueIsNotNull(findViewById, "findViewById(R.id.app_setting_version)");
        this.f69107b = (TextView) findViewById;
        View findViewById2 = findViewById(R.id.app_setting_tag);
        Intrinsics.checkExpressionValueIsNotNull(findViewById2, "findViewById(R.id.app_setting_tag)");
        this.f69108c = (TextView) findViewById2;
        View findViewById3 = findViewById(R.id.app_setting_loading);
        Intrinsics.checkExpressionValueIsNotNull(findViewById3, "findViewById(R.id.app_setting_loading)");
        this.f69109d = (LinearLayout) findViewById3;
        View findViewById4 = findViewById(R.id.app_setting_reload);
        Intrinsics.checkExpressionValueIsNotNull(findViewById4, "findViewById(R.id.app_setting_reload)");
        this.f69110e = (TextView) findViewById4;
        View findViewById5 = findViewById(R.id.app_setting_retry);
        Intrinsics.checkExpressionValueIsNotNull(findViewById5, "findViewById(R.id.app_setting_retry)");
        this.f69111f = (TextView) findViewById5;
        this.f69112g = 0;
        m101080a();
        this.f69110e.setOnClickListener(View$OnClickListenerC276651.f69113a);
        this.f69111f.setOnClickListener(new View.OnClickListener(this) {
            /* class com.ss.android.appcenter.business.activity.appsetting.GadgetVersionUpdateView.View$OnClickListenerC276662 */

            /* renamed from: a */
            final /* synthetic */ GadgetVersionUpdateView f69114a;

            {
                this.f69114a = r1;
            }

            public final void onClick(View view) {
                this.f69114a.mo98544a(1);
                GadgetUpdateControl.f69118a.mo98582g().mo98570c(GadgetUpdateControl.f69118a.mo98581f());
                C27710b.m101316p(GadgetUpdateControl.f69118a.mo98581f());
            }
        });
        getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener(this) {
            /* class com.ss.android.appcenter.business.activity.appsetting.GadgetVersionUpdateView.ViewTreeObserver$OnGlobalLayoutListenerC276673 */

            /* renamed from: a */
            final /* synthetic */ GadgetVersionUpdateView f69115a;

            public void onGlobalLayout() {
                if (this.f69115a.getResources() != null) {
                    Resources resources = this.f69115a.getResources();
                    Intrinsics.checkExpressionValueIsNotNull(resources, "resources");
                    Locale locale = resources.getConfiguration().locale;
                    Intrinsics.checkExpressionValueIsNotNull(locale, "local");
                    String language = locale.getLanguage();
                    if (language != null) {
                        int hashCode = language.hashCode();
                        if (hashCode != 3241) {
                            if (hashCode != 3383) {
                                if (hashCode == 3886 && language.equals("zh")) {
                                    this.f69115a.getVersionText().getLayoutParams().width = -2;
                                    this.f69115a.getReloadView().getLayoutParams().width = -2;
                                    this.f69115a.getRetryView().getLayoutParams().width = -2;
                                    this.f69115a.getLayoutParams().height = C28209p.m103293a(this.f69115a.getContext(), 57.0f);
                                }
                            } else if (language.equals("ja")) {
                                this.f69115a.getVersionText().getLayoutParams().width = C28209p.m103293a(this.f69115a.getContext(), 110.0f);
                                this.f69115a.getReloadView().getLayoutParams().width = -2;
                                this.f69115a.getRetryView().getLayoutParams().width = C28209p.m103293a(this.f69115a.getContext(), 154.0f);
                                this.f69115a.getLayoutParams().height = C28209p.m103293a(this.f69115a.getContext(), 64.0f);
                            }
                        } else if (language.equals("en")) {
                            this.f69115a.getVersionText().getLayoutParams().width = C28209p.m103293a(this.f69115a.getContext(), 116.0f);
                            this.f69115a.getReloadView().getLayoutParams().width = C28209p.m103293a(this.f69115a.getContext(), 142.0f);
                            this.f69115a.getRetryView().getLayoutParams().width = C28209p.m103293a(this.f69115a.getContext(), 154.0f);
                            this.f69115a.getLayoutParams().height = C28209p.m103293a(this.f69115a.getContext(), 64.0f);
                        }
                    }
                }
                this.f69115a.getViewTreeObserver().removeOnGlobalLayoutListener(this);
            }

            /* JADX WARN: Incorrect args count in method signature: ()V */
            {
                this.f69115a = r1;
            }
        });
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ GadgetVersionUpdateView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
