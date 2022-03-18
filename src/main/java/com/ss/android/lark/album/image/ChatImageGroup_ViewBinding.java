package com.ss.android.lark.album.image;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatCheckBox;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.larksuite.suite.R;

public class ChatImageGroup_ViewBinding implements Unbinder {

    /* renamed from: a */
    private ChatImageGroup f72127a;

    @Override // butterknife.Unbinder
    public void unbind() {
        ChatImageGroup chatImageGroup = this.f72127a;
        if (chatImageGroup != null) {
            this.f72127a = null;
            chatImageGroup.mContentIV = null;
            chatImageGroup.mVideoDuration = null;
            chatImageGroup.mCheckBox = null;
            chatImageGroup.mMarkView = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public ChatImageGroup_ViewBinding(ChatImageGroup chatImageGroup, View view) {
        this.f72127a = chatImageGroup;
        chatImageGroup.mContentIV = (ImageView) Utils.findRequiredViewAsType(view, R.id.image, "field 'mContentIV'", ImageView.class);
        chatImageGroup.mVideoDuration = (TextView) Utils.findRequiredViewAsType(view, R.id.video_duration, "field 'mVideoDuration'", TextView.class);
        chatImageGroup.mCheckBox = (AppCompatCheckBox) Utils.findRequiredViewAsType(view, R.id.checkbox, "field 'mCheckBox'", AppCompatCheckBox.class);
        chatImageGroup.mMarkView = Utils.findRequiredView(view, R.id.mark_view, "field 'mMarkView'");
    }
}
