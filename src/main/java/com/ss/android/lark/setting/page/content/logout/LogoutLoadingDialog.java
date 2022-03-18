package com.ss.android.lark.setting.page.content.logout;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import com.larksuite.framework.ui.BaseDialog;
import com.larksuite.framework.utils.DeviceUtils;
import com.larksuite.suite.R;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u0000 \n2\u00020\u0001:\u0001\nB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0002\u001a\u00020\u0003H\u0002J\b\u0010\b\u001a\u00020\u0006H\u0002J\b\u0010\t\u001a\u00020\u0006H\u0016¨\u0006\u000b"}, d2 = {"Lcom/ss/android/lark/setting/page/content/logout/LogoutLoadingDialog;", "Lcom/larksuite/framework/ui/BaseDialog;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "dismiss", "", "init", "initPosition", "show", "Companion", "core_setting_setting_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.setting.page.content.b.a */
public final class LogoutLoadingDialog extends BaseDialog {

    /* renamed from: a */
    public static final Companion f134022a = new Companion(null);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lcom/ss/android/lark/setting/page/content/logout/LogoutLoadingDialog$Companion;", "", "()V", "PERCENT_TOP_MARGIN", "", "TAG", "", "core_setting_setting_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.setting.page.content.b.a$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // com.larksuite.framework.ui.BaseDialog
    public void dismiss() {
        if (super.isShowing()) {
            super.dismiss();
        }
    }

    @Override // com.larksuite.framework.ui.BaseDialog
    public void show() {
        if (!super.isShowing()) {
            super.show();
        }
    }

    /* renamed from: a */
    private final void m210181a() {
        WindowManager.LayoutParams layoutParams;
        Window window;
        Window window2 = super.getWindow();
        if (window2 != null) {
            window2.setGravity(49);
        }
        int screenHeight = (int) (((float) DeviceUtils.getScreenHeight(getContext())) * 0.75f);
        Window window3 = super.getWindow();
        if (window3 != null) {
            layoutParams = window3.getAttributes();
        } else {
            layoutParams = null;
        }
        if (layoutParams != null) {
            layoutParams.y = screenHeight;
        }
        if (layoutParams != null && (window = super.getWindow()) != null) {
            window.setAttributes(layoutParams);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LogoutLoadingDialog(Context context) {
        super(context, R.style.CommonDialog);
        Intrinsics.checkParameterIsNotNull(context, "context");
        requestWindowFeature(1);
        setCanceledOnTouchOutside(false);
        m210182a(context);
    }

    /* renamed from: a */
    private final void m210182a(Context context) {
        setContentView(LayoutInflater.from(context).inflate(R.layout.dialog_logout_loading, (ViewGroup) null));
        m210181a();
    }
}
