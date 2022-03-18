package com.larksuite.component.universe_design.dialog;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.Window;
import androidx.appcompat.app.DialogC0259b;
import com.larksuite.suite.R;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0016\u0018\u0000 \u00152\u00020\u0001:\u0003\u0015\u0016\u0017B\u000f\b\u0010\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u0017\b\u0010\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\b\u0010\n\u001a\u00020\u000bH\u0016J\u0014\u0010\f\u001a\u0004\u0018\u00010\r2\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\u0002J\u0012\u0010\u000e\u001a\u00020\u000b2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0014J\u0015\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\tH\u0000¢\u0006\u0002\b\u0013J\b\u0010\u0014\u001a\u00020\u000bH\u0016R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u000e¢\u0006\u0002\n\u0000¨\u0006\u0018"}, d2 = {"Lcom/larksuite/component/universe_design/dialog/UDDialog;", "Landroidx/appcompat/app/AppCompatDialog;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "theme", "", "(Landroid/content/Context;I)V", "mCallback", "Lcom/larksuite/component/universe_design/dialog/UDDialog$DialogCallback;", "dismiss", "", "getActivity", "Landroid/app/Activity;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "setCallback", "callback", "setCallback$universe_ui_dialog_release", "show", "Companion", "Config", "DialogCallback", "universe-ui-dialog_release"}, mo238835k = 1, mv = {1, 1, 16})
public class UDDialog extends DialogC0259b {
    public static final Companion Companion = new Companion(null);
    public static final Config config = new Config();
    private DialogCallback mCallback;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H'J\u001a\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\u0010\u0007\u001a\u0004\u0018\u00010\bH'J\b\u0010\t\u001a\u00020\u0003H'J\b\u0010\n\u001a\u00020\u0003H'¨\u0006\u000b"}, d2 = {"Lcom/larksuite/component/universe_design/dialog/UDDialog$DialogCallback;", "", "beforeCreate", "", "dialog", "Lcom/larksuite/component/universe_design/dialog/UDDialog;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onDismiss", "onShow", "universe-ui-dialog_release"}, mo238835k = 1, mv = {1, 1, 16})
    public interface DialogCallback {
        void beforeCreate(UDDialog uDDialog);

        void onCreate(UDDialog uDDialog, Bundle bundle);

        void onDismiss();

        void onShow();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/larksuite/component/universe_design/dialog/UDDialog$Companion;", "", "()V", "config", "Lcom/larksuite/component/universe_design/dialog/UDDialog$Config;", "getConfig", "()Lcom/larksuite/component/universe_design/dialog/UDDialog$Config;", "universe-ui-dialog_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.larksuite.component.universe_design.dialog.UDDialog$a */
    public static final class Companion {
        private Companion() {
        }

        /* renamed from: a */
        public final Config mo90734a() {
            return UDDialog.config;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0000¢\u0006\u0002\u0010\u0002J\b\u0010\u0005\u001a\u00020\u0004H\u0007J\u0010\u0010\u0006\u001a\u00020\u00072\b\b\u0001\u0010\b\u001a\u00020\u0004R\u0012\u0010\u0003\u001a\u00020\u00048\u0002@\u0002X\u000e¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/larksuite/component/universe_design/dialog/UDDialog$Config;", "", "()V", "mBottomAnimStyle", "", "getBottomAnimStyle", "setBottomAnimStyle", "", "animStyle", "universe-ui-dialog_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.larksuite.component.universe_design.dialog.UDDialog$b */
    public static final class Config {

        /* renamed from: a */
        private int f63280a = R.style.UD_BottomDialogAnim;

        /* renamed from: a */
        public final int mo90735a() {
            return this.f63280a;
        }
    }

    public void show() {
        Activity activity = getActivity(getContext());
        if (activity != null && !activity.isFinishing()) {
            super.show();
            DialogCallback dialogCallback = this.mCallback;
            if (dialogCallback != null) {
                dialogCallback.onShow();
            }
        }
    }

    @Override // androidx.appcompat.app.DialogC0259b
    public void dismiss() {
        Activity activity;
        if (isShowing() && (activity = getActivity(getContext())) != null && !activity.isFinishing()) {
            DialogCallback dialogCallback = this.mCallback;
            if (dialogCallback != null) {
                dialogCallback.onDismiss();
            }
            super.dismiss();
        }
    }

    public final void setCallback$universe_ui_dialog_release(DialogCallback dialogCallback) {
        Intrinsics.checkParameterIsNotNull(dialogCallback, "callback");
        this.mCallback = dialogCallback;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public UDDialog(Context context) {
        this(context, R.style.UDDialog);
        Intrinsics.checkParameterIsNotNull(context, "context");
    }

    private final Activity getActivity(Context context) {
        if (context == null || (context instanceof Activity)) {
            return (Activity) context;
        }
        if (!(context instanceof ContextWrapper)) {
            return null;
        }
        return getActivity(((ContextWrapper) context).getBaseContext());
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.DialogC0259b
    public void onCreate(Bundle bundle) {
        Window window = getWindow();
        if (window != null) {
            window.clearFlags(131080);
        }
        DialogCallback dialogCallback = this.mCallback;
        if (dialogCallback != null) {
            dialogCallback.beforeCreate(this);
        }
        super.onCreate(bundle);
        DialogCallback dialogCallback2 = this.mCallback;
        if (dialogCallback2 != null) {
            dialogCallback2.onCreate(this, bundle);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public UDDialog(Context context, int i) {
        super(context, i);
        Intrinsics.checkParameterIsNotNull(context, "context");
    }
}
