package com.ss.android.lark.widget.dialog;

import android.app.Activity;
import android.content.Context;
import com.ss.android.lark.widget.dialog.loadingdialog.LoadingDialog;

public class CommonLoadingDialog {
    private final int DIALOG_ANIMATION_SPEED = 2;
    private final int DIALOG_CORNER_RADIUS = 6;
    private final float DIALOG_DIM_AMOUNT = 0.5f;
    private final int DIALOG_LABEL_TEXT_SIZE = 14;
    private final int DIALOG_SIZE = 100;
    private final int DIALOG_VIEW_SIZE = 35;
    private boolean mCancellable;
    private int mDialogSize = 100;
    private String mLabel;
    private LoadingDialog mLoadingDialog;

    public void dismiss() {
        LoadingDialog loadingDialog = this.mLoadingDialog;
        if (loadingDialog != null && loadingDialog.mo197790b()) {
            this.mLoadingDialog.mo197792c();
        }
    }

    public void setCancellable(boolean z) {
        this.mCancellable = z;
    }

    public void setDialogSize(int i) {
        this.mDialogSize = i;
    }

    public void setLabel(String str) {
        this.mLabel = str;
    }

    public void show(Context context) {
        if (this.mLoadingDialog == null) {
            this.mLoadingDialog = init(context);
        }
        if (!this.mLoadingDialog.mo197790b() && !((Activity) context).isFinishing()) {
            this.mLoadingDialog.mo197780a();
        }
    }

    private LoadingDialog init(Context context) {
        LoadingDialog a = LoadingDialog.m226492a(context).mo197784a(LoadingDialog.Style.SPIN_INDETERMINATE);
        int i = this.mDialogSize;
        return a.mo197783a(i, i).mo197789b(35, 35).mo197786a(this.mCancellable).mo197791c(14.0f).mo197785a(this.mLabel).mo197787b(6.0f).mo197788b(2).mo197781a(0.5f);
    }
}
