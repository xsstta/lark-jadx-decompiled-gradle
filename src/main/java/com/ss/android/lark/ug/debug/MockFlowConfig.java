package com.ss.android.lark.ug.debug;

import android.content.Context;
import android.content.DialogInterface;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.app.DialogInterfaceC0257a;
import com.ss.android.lark.ug.C57345a;
import com.ss.android.lark.ug.p2859c.AbstractC57392a;
import com.ss.android.lark.ui.p2892a.C57582a;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u0018\u0000 \u00032\u00020\u0001:\u0002\u0003\u0004B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0005"}, d2 = {"Lcom/ss/android/lark/ug/debug/MockFlowConfig;", "", "()V", "Companion", "ConfigView", "core_guide_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.ug.b.b */
public final class MockFlowConfig {

    /* renamed from: a */
    public static final Companion f141222a = new Companion(null);

    @JvmStatic
    /* renamed from: a */
    public static final void m222355a(Context context) {
        f141222a.mo194524a(context);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0002J\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u00042\u0006\u0010\f\u001a\u00020\u0004H\u0002J\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\nH\u0007J\u0018\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u0004H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lcom/ss/android/lark/ug/debug/MockFlowConfig$Companion;", "", "()V", "KEY_MOCK_ONBOARDING_FLOW_ID", "", "MOCK_FLOW_URL_PREFIX", "getMockOnBoardingFlowUrl", "getSP", "Landroid/content/SharedPreferences;", "context", "Landroid/content/Context;", "getString", "key", "openConfigDialog", "", "putString", "value", "core_guide_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.ug.b.b$a */
    public static final class Companion {
        private Companion() {
        }

        /* renamed from: a */
        public final String mo194523a() {
            boolean z;
            String a = m222356a("key_mock_onboarding_flow_id");
            if (a == null) {
                return null;
            }
            if (a.length() > 0) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                a = null;
            }
            if (a == null) {
                return null;
            }
            return "https://cloudapi.bytedance.net/faas/services/tto71l/invoke/GetDynamicFlow?platform=Android&id=" + a;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: b */
        private final SharedPreferences m222357b(Context context) {
            SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(context);
            Intrinsics.checkExpressionValueIsNotNull(defaultSharedPreferences, "PreferenceManager.getDef…haredPreferences(context)");
            return defaultSharedPreferences;
        }

        /* renamed from: a */
        private final String m222356a(String str) {
            AbstractC57392a a = C57345a.m222261a();
            Intrinsics.checkExpressionValueIsNotNull(a, "UGModule.getDependency()");
            Context d = a.mo194672d();
            Intrinsics.checkExpressionValueIsNotNull(d, "UGModule.getDependency().context");
            return m222357b(d).getString(str, null);
        }

        @JvmStatic
        /* renamed from: a */
        public final void mo194524a(Context context) {
            boolean z;
            Intrinsics.checkParameterIsNotNull(context, "context");
            ConfigView bVar = new ConfigView(context);
            String a = m222356a("key_mock_onboarding_flow_id");
            if (a != null) {
                if (a.length() > 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (!z) {
                    a = null;
                }
                if (a != null) {
                    bVar.getObFlowIdEdit().setText(a);
                }
            }
            new DialogInterfaceC0257a.C0258a(context).mo923a("UG Mock Flow").mo926b(bVar).mo924a("Save", new DialogInterface$OnClickListenerC57362a(bVar)).mo930c();
        }

        /* access modifiers changed from: package-private */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "dialog", "Landroid/content/DialogInterface;", "which", "", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.ug.b.b$a$a */
        public static final class DialogInterface$OnClickListenerC57362a implements DialogInterface.OnClickListener {

            /* renamed from: a */
            final /* synthetic */ ConfigView f141223a;

            DialogInterface$OnClickListenerC57362a(ConfigView bVar) {
                this.f141223a = bVar;
            }

            public final void onClick(DialogInterface dialogInterface, int i) {
                Companion aVar = MockFlowConfig.f141222a;
                String obj = this.f141223a.getObFlowIdEdit().getText().toString();
                if (obj != null) {
                    aVar.mo194525a("key_mock_onboarding_flow_id", StringsKt.trim((CharSequence) obj).toString());
                    return;
                }
                throw new TypeCastException("null cannot be cast to non-null type kotlin.CharSequence");
            }
        }

        /* renamed from: a */
        public final void mo194525a(String str, String str2) {
            AbstractC57392a a = C57345a.m222261a();
            Intrinsics.checkExpressionValueIsNotNull(a, "UGModule.getDependency()");
            Context d = a.mo194672d();
            Intrinsics.checkExpressionValueIsNotNull(d, "UGModule.getDependency().context");
            m222357b(d).edit().putString(str, str2).apply();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0002\u001a\u00020\u0003H\u0002R\u001a\u0010\u0005\u001a\u00020\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\n¨\u0006\r"}, d2 = {"Lcom/ss/android/lark/ug/debug/MockFlowConfig$ConfigView;", "Landroid/widget/LinearLayout;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "obFlowIdEdit", "Landroid/widget/EditText;", "getObFlowIdEdit", "()Landroid/widget/EditText;", "setObFlowIdEdit", "(Landroid/widget/EditText;)V", "createOnBoardingLayout", "", "core_guide_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.ug.b.b$b */
    public static final class ConfigView extends LinearLayout {

        /* renamed from: a */
        public EditText f141224a;

        public final EditText getObFlowIdEdit() {
            EditText editText = this.f141224a;
            if (editText == null) {
                Intrinsics.throwUninitializedPropertyAccessException("obFlowIdEdit");
            }
            return editText;
        }

        public final void setObFlowIdEdit(EditText editText) {
            Intrinsics.checkParameterIsNotNull(editText, "<set-?>");
            this.f141224a = editText;
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public ConfigView(Context context) {
            super(context);
            Intrinsics.checkParameterIsNotNull(context, "context");
            m222361a(context);
        }

        /* renamed from: a */
        private final void m222361a(Context context) {
            LinearLayout linearLayout = new LinearLayout(context);
            linearLayout.setOrientation(0);
            int a = C57582a.m223600a(16);
            linearLayout.setPadding(a, 0, a, 0);
            TextView textView = new TextView(context);
            textView.setText("flow_id");
            textView.setTextSize(16.0f);
            linearLayout.addView(textView, new LinearLayout.LayoutParams(-2, -2));
            EditText editText = new EditText(context);
            editText.setTextSize(13.0f);
            linearLayout.addView(editText, new LinearLayout.LayoutParams(-1, -2));
            this.f141224a = editText;
            addView(linearLayout, new LinearLayout.LayoutParams(-1, -2));
        }
    }
}
