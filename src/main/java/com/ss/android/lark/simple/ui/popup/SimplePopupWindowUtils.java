package com.ss.android.lark.simple.ui.popup;

import android.app.Activity;
import android.text.SpannableString;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import com.larksuite.framework.utils.DeviceUtils;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.simple.SimpleModule;
import com.ss.android.lark.simple.service.SimpleModeService;
import com.ss.android.lark.utils.UIHelper;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0012\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0002J\u001a\u0010\f\u001a\u00020\r2\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u000e\u001a\u00020\u000fH\u0007J\u0012\u0010\u0010\u001a\u00020\r2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lcom/ss/android/lark/simple/ui/popup/SimplePopupWindowUtils;", "", "()V", "TAB_DISTANCE", "", "TAB_HEIGHT", "TIP_TOTAL_LENGTH", "VIEW_HEIGHT", "getSpan", "Landroid/text/SpannableString;", "context", "Landroid/app/Activity;", "showSimplePopupWindow", "", "view", "Landroid/view/View;", "startSetting", "core_simple_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.ss.android.lark.simple.ui.a.b */
public final class SimplePopupWindowUtils {

    /* renamed from: a */
    public static final SimplePopupWindowUtils f135496a = new SimplePopupWindowUtils();

    private SimplePopupWindowUtils() {
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\t"}, d2 = {"com/ss/android/lark/simple/ui/popup/SimplePopupWindowUtils$getSpan$1", "Landroid/text/style/ClickableSpan;", "onClick", "", "widget", "Landroid/view/View;", "updateDrawState", "ds", "Landroid/text/TextPaint;", "core_simple_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.ss.android.lark.simple.ui.a.b$a */
    public static final class C54890a extends ClickableSpan {

        /* renamed from: a */
        final /* synthetic */ Activity f135497a;

        C54890a(Activity activity) {
            this.f135497a = activity;
        }

        public void onClick(View view) {
            Intrinsics.checkParameterIsNotNull(view, "widget");
            SimplePopupWindowUtils.f135496a.mo187167a(this.f135497a);
        }

        public void updateDrawState(TextPaint textPaint) {
            Intrinsics.checkParameterIsNotNull(textPaint, "ds");
            textPaint.setColor(UIUtils.getColor(this.f135497a, R.color.lkui_B700));
            textPaint.setUnderlineText(false);
        }
    }

    /* renamed from: a */
    public final void mo187167a(Activity activity) {
        SimpleModule.ISimpleModuleDependency a;
        SimpleModule.ISettingDependency e;
        if (activity != null && (a = SimpleModule.f135402b.mo187078a()) != null && (e = a.mo187094e()) != null) {
            e.mo187089a(activity);
        }
    }

    /* renamed from: b */
    private final SpannableString m212843b(Activity activity) {
        String mustacheFormat = UIHelper.mustacheFormat((int) R.string.Lark_Legacy_BasicModeTurnOnToast);
        String string = UIHelper.getString(R.string.Lark_Legacy_BasicModeTurnOnToastButton);
        int length = mustacheFormat.length() + string.length();
        SpannableString spannableString = new SpannableString(mustacheFormat + string);
        spannableString.setSpan(new C54890a(activity), length - string.length(), length, 33);
        return spannableString;
    }

    @JvmStatic
    /* renamed from: a */
    public static final void m212842a(Activity activity, View view) {
        Intrinsics.checkParameterIsNotNull(view, "view");
        if (UIUtils.isActivityRunning(activity)) {
            SimplePopupWindow aVar = new SimplePopupWindow(activity);
            aVar.mo187162a(f135496a.m212843b(activity));
            aVar.mo187161a();
            Activity activity2 = activity;
            aVar.showAsDropDown(view, (DeviceUtils.getScreenWidth(activity2) - UIUtils.dp2px(activity2, 328.0f)) / 2, ((-UIUtils.dp2px(activity2, 24.0f)) - UIUtils.dp2px(activity2, 65.0f)) - UIUtils.dp2px(activity2, 72.0f));
            SimpleModeService.f135451c.mo187138a().mo187136c();
        }
    }
}
