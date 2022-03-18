package com.ss.android.lark.widget.photo_picker.video;

import android.view.View;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.larksuite.suite.R;

public class OnlineNetworkStatusCover_ViewBinding implements Unbinder {

    /* renamed from: a */
    private OnlineNetworkStatusCover f145584a;

    /* renamed from: b */
    private View f145585b;

    /* renamed from: c */
    private View f145586c;

    @Override // butterknife.Unbinder
    public void unbind() {
        OnlineNetworkStatusCover onlineNetworkStatusCover = this.f145584a;
        if (onlineNetworkStatusCover != null) {
            this.f145584a = null;
            onlineNetworkStatusCover.mStatusTip = null;
            onlineNetworkStatusCover.mStatusCancel = null;
            onlineNetworkStatusCover.mStatusContinue = null;
            this.f145585b.setOnClickListener(null);
            this.f145585b = null;
            this.f145586c.setOnClickListener(null);
            this.f145586c = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public OnlineNetworkStatusCover_ViewBinding(final OnlineNetworkStatusCover onlineNetworkStatusCover, View view) {
        this.f145584a = onlineNetworkStatusCover;
        onlineNetworkStatusCover.mStatusTip = (TextView) Utils.findRequiredViewAsType(view, R.id.status_tip, "field 'mStatusTip'", TextView.class);
        View findRequiredView = Utils.findRequiredView(view, R.id.status_cancel, "field 'mStatusCancel' and method 'onCancelClick'");
        onlineNetworkStatusCover.mStatusCancel = findRequiredView;
        this.f145585b = findRequiredView;
        findRequiredView.setOnClickListener(new DebouncingOnClickListener() {
            /* class com.ss.android.lark.widget.photo_picker.video.OnlineNetworkStatusCover_ViewBinding.C588541 */

            @Override // butterknife.internal.DebouncingOnClickListener
            public void doClick(View view) {
                onlineNetworkStatusCover.onCancelClick(view);
            }
        });
        View findRequiredView2 = Utils.findRequiredView(view, R.id.status_continue, "field 'mStatusContinue' and method 'onContinueClick'");
        onlineNetworkStatusCover.mStatusContinue = findRequiredView2;
        this.f145586c = findRequiredView2;
        findRequiredView2.setOnClickListener(new DebouncingOnClickListener() {
            /* class com.ss.android.lark.widget.photo_picker.video.OnlineNetworkStatusCover_ViewBinding.C588552 */

            @Override // butterknife.internal.DebouncingOnClickListener
            public void doClick(View view) {
                onlineNetworkStatusCover.onContinueClick(view);
            }
        });
    }
}
