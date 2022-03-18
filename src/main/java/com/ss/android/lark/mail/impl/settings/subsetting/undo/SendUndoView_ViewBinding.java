package com.ss.android.lark.mail.impl.settings.subsetting.undo;

import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.larksuite.component.universe_design.udswitch.UDSwitch;
import com.larksuite.suite.R;

public class SendUndoView_ViewBinding implements Unbinder {

    /* renamed from: a */
    private SendUndoView f110664a;

    @Override // butterknife.Unbinder
    public void unbind() {
        SendUndoView sendUndoView = this.f110664a;
        if (sendUndoView != null) {
            this.f110664a = null;
            sendUndoView.mSendUndoSwitch = null;
            sendUndoView.mDurationRV = null;
            sendUndoView.mSendUndoSwitchText = null;
            sendUndoView.mDurationLayout = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public SendUndoView_ViewBinding(SendUndoView sendUndoView, View view) {
        this.f110664a = sendUndoView;
        sendUndoView.mSendUndoSwitch = (UDSwitch) Utils.findRequiredViewAsType(view, R.id.mail_undo_switch, "field 'mSendUndoSwitch'", UDSwitch.class);
        sendUndoView.mDurationRV = (RecyclerView) Utils.findRequiredViewAsType(view, R.id.mail_undo_duration_list_rv, "field 'mDurationRV'", RecyclerView.class);
        sendUndoView.mSendUndoSwitchText = (TextView) Utils.findRequiredViewAsType(view, R.id.mail_undo_switch_name, "field 'mSendUndoSwitchText'", TextView.class);
        sendUndoView.mDurationLayout = Utils.findRequiredView(view, R.id.mail_duration_layout, "field 'mDurationLayout'");
    }
}
