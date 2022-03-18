package com.ss.android.lark.pin.impl.v3.binder.viewholder;

import android.view.View;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.larksuite.suite.R;
import com.ss.android.lark.widget.fileview.FileView;

public class FileMessageViewHolder_ViewBinding implements Unbinder {

    /* renamed from: a */
    private FileMessageViewHolder f128416a;

    @Override // butterknife.Unbinder
    public void unbind() {
        FileMessageViewHolder fileMessageViewHolder = this.f128416a;
        if (fileMessageViewHolder != null) {
            this.f128416a = null;
            fileMessageViewHolder.mFileView = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public FileMessageViewHolder_ViewBinding(FileMessageViewHolder fileMessageViewHolder, View view) {
        this.f128416a = fileMessageViewHolder;
        fileMessageViewHolder.mFileView = (FileView) Utils.findRequiredViewAsType(view, R.id.file_view, "field 'mFileView'", FileView.class);
    }
}
