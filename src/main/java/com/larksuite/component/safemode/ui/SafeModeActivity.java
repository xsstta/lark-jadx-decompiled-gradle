package com.larksuite.component.safemode.ui;

import android.app.Activity;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.larksuite.component.safemode.SafeModeManager;
import com.larksuite.component.safemode.utils.VirtualBoxUtil;
import com.larksuite.component.universe_design.button.UDButton;
import com.larksuite.suite.R;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0002J\u0012\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0014J\b\u0010\n\u001a\u00020\u0007H\u0014R\u000e\u0010\u0003\u001a\u00020\u0004X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u000e¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/larksuite/component/safemode/ui/SafeModeActivity;", "Landroid/app/Activity;", "()V", "isInVirtualEnv", "", "mRecovered", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onDestroy", "safemode_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class SafeModeActivity extends Activity {

    /* renamed from: a */
    public boolean f62350a;

    /* renamed from: b */
    private boolean f62351b;

    /* renamed from: c */
    private HashMap f62352c;

    /* renamed from: a */
    public View mo88895a(int i) {
        if (this.f62352c == null) {
            this.f62352c = new HashMap();
        }
        View view = (View) this.f62352c.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f62352c.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    /* renamed from: a */
    public void mo88896a() {
        super.onStop();
    }

    /* access modifiers changed from: protected */
    public void onStop() {
        m91433a(this);
    }

    /* renamed from: b */
    private final boolean m91434b() {
        if (VirtualBoxUtil.f62349a.mo88893a() != null || VirtualBoxUtil.f62349a.mo88894b()) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        super.onDestroy();
        if (!this.f62351b) {
            if (this.f62350a) {
                Runtime runtime = Runtime.getRuntime();
                runtime.exec("pm clear " + getPackageName());
                return;
            }
            SafeModeManager.f62333a.mo88872d();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.larksuite.component.safemode.ui.SafeModeActivity$a */
    static final class View$OnClickListenerC25619a implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ SafeModeActivity f62353a;

        View$OnClickListenerC25619a(SafeModeActivity safeModeActivity) {
            this.f62353a = safeModeActivity;
        }

        public final void onClick(View view) {
            this.f62353a.finish();
        }
    }

    /* renamed from: a */
    public static void m91433a(SafeModeActivity safeModeActivity) {
        safeModeActivity.mo88896a();
        if (EnterTransitionCrashOptimizer.getContext() != null) {
            SafeModeActivity safeModeActivity2 = safeModeActivity;
            if (Build.VERSION.SDK_INT >= 21) {
                try {
                    safeModeActivity2.getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
                } catch (Throwable unused) {
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.safemode_content);
        boolean b = m91434b();
        this.f62351b = b;
        if (b) {
            TextView textView = (TextView) mo88895a(R.id.safemode_btn_text);
            Intrinsics.checkExpressionValueIsNotNull(textView, "safemode_btn_text");
            textView.setText(getString(R.string.Lark_Login_V3_Lark_PrivacyNoticeDisagreeDialogLogOut));
            TextView textView2 = (TextView) mo88895a(R.id.safemode_detail);
            Intrinsics.checkExpressionValueIsNotNull(textView2, "safemode_detail");
            textView2.setText(getString(R.string.Lark_Legacy_MockLocationErrorDesc));
            ((UDButton) mo88895a(R.id.safemode_btn)).setOnClickListener(new View$OnClickListenerC25619a(this));
            return;
        }
        ((UDButton) mo88895a(R.id.safemode_btn)).setOnClickListener(new View$OnClickListenerC25620b(this));
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.larksuite.component.safemode.ui.SafeModeActivity$b */
    static final class View$OnClickListenerC25620b implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ SafeModeActivity f62354a;

        View$OnClickListenerC25620b(SafeModeActivity safeModeActivity) {
            this.f62354a = safeModeActivity;
        }

        public final void onClick(View view) {
            if (!this.f62354a.f62350a) {
                ((ImageView) this.f62354a.mo88895a(R.id.safemode_image)).setImageResource(R.drawable.illustration_empty_neutral_restoring);
                ((TextView) this.f62354a.mo88895a(R.id.safemode_desc)).setText(R.string.Lark_Login_SafeModeDataFixing);
                TextView textView = (TextView) this.f62354a.mo88895a(R.id.safemode_detail);
                Intrinsics.checkExpressionValueIsNotNull(textView, "safemode_detail");
                textView.setVisibility(8);
                ((TextView) this.f62354a.mo88895a(R.id.safemode_btn_text)).setText(R.string.Lark_Login_SafeModeDataFixingButton);
                ProgressBar progressBar = (ProgressBar) this.f62354a.mo88895a(R.id.safemode_progress);
                Intrinsics.checkExpressionValueIsNotNull(progressBar, "safemode_progress");
                progressBar.setVisibility(0);
                UDButton uDButton = (UDButton) this.f62354a.mo88895a(R.id.safemode_btn);
                Intrinsics.checkExpressionValueIsNotNull(uDButton, "safemode_btn");
                uDButton.setEnabled(false);
                ((UDButton) this.f62354a.mo88895a(R.id.safemode_btn)).postDelayed(new Runnable(this) {
                    /* class com.larksuite.component.safemode.ui.SafeModeActivity.View$OnClickListenerC25620b.RunnableC256211 */

                    /* renamed from: a */
                    final /* synthetic */ View$OnClickListenerC25620b f62355a;

                    {
                        this.f62355a = r1;
                    }

                    public final void run() {
                        ((ImageView) this.f62355a.f62354a.mo88895a(R.id.safemode_image)).setImageResource(R.drawable.illustration_empty_positive_complete);
                        ((TextView) this.f62355a.f62354a.mo88895a(R.id.safemode_desc)).setText(R.string.Lark_Login_SafeModeFixFinished);
                        TextView textView = (TextView) this.f62355a.f62354a.mo88895a(R.id.safemode_detail);
                        Intrinsics.checkExpressionValueIsNotNull(textView, "safemode_detail");
                        textView.setVisibility(0);
                        ((TextView) this.f62355a.f62354a.mo88895a(R.id.safemode_detail)).setText(R.string.Lark_Login_SafeModeFixFinishedDesc);
                        ((TextView) this.f62355a.f62354a.mo88895a(R.id.safemode_btn_text)).setText(R.string.Lark_Login_SafeModeCloseAppButton);
                        ProgressBar progressBar = (ProgressBar) this.f62355a.f62354a.mo88895a(R.id.safemode_progress);
                        Intrinsics.checkExpressionValueIsNotNull(progressBar, "safemode_progress");
                        progressBar.setVisibility(8);
                        UDButton uDButton = (UDButton) this.f62355a.f62354a.mo88895a(R.id.safemode_btn);
                        Intrinsics.checkExpressionValueIsNotNull(uDButton, "safemode_btn");
                        uDButton.setEnabled(true);
                        this.f62355a.f62354a.f62350a = true;
                    }
                }, 4000);
                return;
            }
            this.f62354a.finish();
        }
    }
}
