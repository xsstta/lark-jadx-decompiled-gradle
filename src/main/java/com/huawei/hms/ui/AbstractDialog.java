package com.huawei.hms.ui;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Build;
import android.view.KeyEvent;
import com.huawei.hms.support.log.HMSLog;

public abstract class AbstractDialog {

    /* renamed from: a */
    public Activity f58926a;

    /* renamed from: b */
    public AlertDialog f58927b;

    /* renamed from: c */
    public Callback f58928c;

    public interface Callback {
        void onCancel(AbstractDialog abstractDialog);

        void onDoWork(AbstractDialog abstractDialog);
    }

    public abstract String onGetMessageString(Context context);

    public abstract String onGetNegativeButtonString(Context context);

    public abstract String onGetPositiveButtonString(Context context);

    public abstract String onGetTitleString(Context context);

    public Activity getActivity() {
        return this.f58926a;
    }

    public void cancel() {
        AlertDialog alertDialog = this.f58927b;
        if (alertDialog != null) {
            alertDialog.cancel();
        }
    }

    public void dismiss() {
        AlertDialog alertDialog = this.f58927b;
        if (alertDialog != null) {
            alertDialog.dismiss();
        }
    }

    public void fireCancel() {
        Callback callback = this.f58928c;
        if (callback != null) {
            callback.onCancel(this);
        }
    }

    public void fireDoWork() {
        Callback callback = this.f58928c;
        if (callback != null) {
            callback.onDoWork(this);
        }
    }

    public int getDialogThemeId() {
        if (m86968a(this.f58926a) == 0 || Build.VERSION.SDK_INT < 16) {
            return 3;
        }
        return 0;
    }

    /* renamed from: com.huawei.hms.ui.AbstractDialog$a */
    public class DialogInterface$OnClickListenerC23795a implements DialogInterface.OnClickListener {
        public DialogInterface$OnClickListenerC23795a() {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            AbstractDialog.this.fireDoWork();
        }
    }

    /* renamed from: com.huawei.hms.ui.AbstractDialog$b */
    public class DialogInterface$OnClickListenerC23796b implements DialogInterface.OnClickListener {
        public DialogInterface$OnClickListenerC23796b() {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            AbstractDialog.this.cancel();
        }
    }

    /* renamed from: com.huawei.hms.ui.AbstractDialog$c */
    public class DialogInterface$OnCancelListenerC23797c implements DialogInterface.OnCancelListener {
        public DialogInterface$OnCancelListenerC23797c() {
        }

        public void onCancel(DialogInterface dialogInterface) {
            AbstractDialog.this.fireCancel();
        }
    }

    /* renamed from: com.huawei.hms.ui.AbstractDialog$d */
    public class DialogInterface$OnKeyListenerC23798d implements DialogInterface.OnKeyListener {
        public DialogInterface$OnKeyListenerC23798d() {
        }

        public boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
            if (4 != i || keyEvent.getAction() != 1) {
                return false;
            }
            AbstractDialog.this.cancel();
            return true;
        }
    }

    public void setMessage(CharSequence charSequence) {
        AlertDialog alertDialog = this.f58927b;
        if (alertDialog != null) {
            alertDialog.setMessage(charSequence);
        }
    }

    public void setTitle(CharSequence charSequence) {
        AlertDialog alertDialog = this.f58927b;
        if (alertDialog != null) {
            alertDialog.setTitle(charSequence);
        }
    }

    /* renamed from: a */
    public static int m86968a(Context context) {
        if (context == null) {
            return 0;
        }
        return context.getResources().getIdentifier("androidhwext:style/Theme.Emui", null, null);
    }

    public AlertDialog onCreateDialog(Activity activity) {
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity(), getDialogThemeId());
        String onGetTitleString = onGetTitleString(activity);
        if (onGetTitleString != null) {
            builder.setTitle(onGetTitleString);
        }
        String onGetMessageString = onGetMessageString(activity);
        if (onGetMessageString != null) {
            builder.setMessage(onGetMessageString);
        }
        String onGetPositiveButtonString = onGetPositiveButtonString(activity);
        if (onGetPositiveButtonString != null) {
            builder.setPositiveButton(onGetPositiveButtonString, new DialogInterface$OnClickListenerC23795a());
        }
        String onGetNegativeButtonString = onGetNegativeButtonString(activity);
        if (onGetNegativeButtonString != null) {
            builder.setNegativeButton(onGetNegativeButtonString, new DialogInterface$OnClickListenerC23796b());
        }
        return builder.create();
    }

    public void show(Activity activity, Callback callback) {
        this.f58926a = activity;
        this.f58928c = callback;
        if (activity == null || activity.isFinishing()) {
            HMSLog.m86964e("AbstractDialog", "In show, The activity is null or finishing.");
            return;
        }
        AlertDialog onCreateDialog = onCreateDialog(this.f58926a);
        this.f58927b = onCreateDialog;
        onCreateDialog.setCanceledOnTouchOutside(false);
        this.f58927b.setOnCancelListener(new DialogInterface$OnCancelListenerC23797c());
        this.f58927b.setOnKeyListener(new DialogInterface$OnKeyListenerC23798d());
        this.f58927b.show();
    }
}
