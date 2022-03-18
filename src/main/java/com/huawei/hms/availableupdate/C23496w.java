package com.huawei.hms.availableupdate;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.view.KeyEvent;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.huawei.hms.support.log.HMSLog;
import com.huawei.hms.utils.ResourceLoaderUtil;
import java.text.NumberFormat;

/* renamed from: com.huawei.hms.availableupdate.w */
public class C23496w extends AbstractC23485o {

    /* renamed from: c */
    public ProgressBar f57934c;

    /* renamed from: d */
    public TextView f57935d;

    /* renamed from: e */
    public int f57936e = 0;

    /* renamed from: f */
    public DialogInterface.OnKeyListener f57937f = new DialogInterface$OnKeyListenerC23498b();

    /* renamed from: com.huawei.hms.availableupdate.w$b */
    public static class DialogInterface$OnKeyListenerC23498b implements DialogInterface.OnKeyListener {
        public DialogInterface$OnKeyListenerC23498b() {
        }

        public boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
            if (i == 4 && keyEvent.getRepeatCount() == 0) {
                return true;
            }
            return false;
        }
    }

    @Override // com.huawei.hms.availableupdate.AbstractC23485o
    /* renamed from: g */
    public AlertDialog mo82107g() {
        AlertDialog.Builder builder = new AlertDialog.Builder(mo82180e(), mo82181f());
        View inflate = View.inflate(mo82180e(), ResourceLoaderUtil.getLayoutId("hms_download_progress"), null);
        builder.setView(inflate);
        builder.setCancelable(false);
        builder.setOnKeyListener(this.f57937f);
        this.f57934c = (ProgressBar) inflate.findViewById(ResourceLoaderUtil.getIdId("download_info_progress"));
        this.f57935d = (TextView) inflate.findViewById(ResourceLoaderUtil.getIdId("hms_progress_text"));
        mo82192b(this.f57936e);
        return builder.create();
    }

    /* renamed from: a */
    public void mo82191a(int i) {
        this.f57936e = i;
    }

    /* renamed from: b */
    public void mo82192b(int i) {
        ProgressBar progressBar;
        Activity e = mo82180e();
        if (e == null || e.isFinishing()) {
            HMSLog.m86967w("DownloadProgress", "In setDownloading, The activity is null or finishing.");
        } else if (this.f57935d != null && (progressBar = this.f57934c) != null) {
            progressBar.setProgress(i);
            this.f57935d.setText(NumberFormat.getPercentInstance().format((double) (((float) i) / 100.0f)));
        }
    }
}
