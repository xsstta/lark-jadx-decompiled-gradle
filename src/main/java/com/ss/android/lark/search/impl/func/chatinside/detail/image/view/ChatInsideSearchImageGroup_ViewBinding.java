package com.ss.android.lark.search.impl.func.chatinside.detail.image.view;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatCheckBox;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.larksuite.suite.R;

public class ChatInsideSearchImageGroup_ViewBinding implements Unbinder {

    /* renamed from: a */
    private ChatInsideSearchImageGroup f132219a;

    @Override // butterknife.Unbinder
    public void unbind() {
        ChatInsideSearchImageGroup chatInsideSearchImageGroup = this.f132219a;
        if (chatInsideSearchImageGroup != null) {
            this.f132219a = null;
            chatInsideSearchImageGroup.mContentIV = null;
            chatInsideSearchImageGroup.mForwardIV = null;
            chatInsideSearchImageGroup.mVideoDuration = null;
            chatInsideSearchImageGroup.mCheckBox = null;
            chatInsideSearchImageGroup.mMarkView = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public ChatInsideSearchImageGroup_ViewBinding(ChatInsideSearchImageGroup chatInsideSearchImageGroup, View view) {
        this.f132219a = chatInsideSearchImageGroup;
        chatInsideSearchImageGroup.mContentIV = (ImageView) Utils.findRequiredViewAsType(view, R.id.image, "field 'mContentIV'", ImageView.class);
        chatInsideSearchImageGroup.mForwardIV = (ImageView) Utils.findRequiredViewAsType(view, R.id.forward, "field 'mForwardIV'", ImageView.class);
        chatInsideSearchImageGroup.mVideoDuration = (TextView) Utils.findRequiredViewAsType(view, R.id.video_duration, "field 'mVideoDuration'", TextView.class);
        chatInsideSearchImageGroup.mCheckBox = (AppCompatCheckBox) Utils.findRequiredViewAsType(view, R.id.checkbox, "field 'mCheckBox'", AppCompatCheckBox.class);
        chatInsideSearchImageGroup.mMarkView = Utils.findRequiredView(view, R.id.mark_view, "field 'mMarkView'");
    }
}
