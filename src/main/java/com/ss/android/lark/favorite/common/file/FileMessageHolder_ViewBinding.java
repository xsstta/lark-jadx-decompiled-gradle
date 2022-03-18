package com.ss.android.lark.favorite.common.file;

import android.view.View;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.larksuite.suite.R;
import com.ss.android.lark.widget.fileview.FileView;

public class FileMessageHolder_ViewBinding implements Unbinder {

    /* renamed from: a */
    private FileMessageHolder f95413a;

    @Override // butterknife.Unbinder
    public void unbind() {
        FileMessageHolder fileMessageHolder = this.f95413a;
        if (fileMessageHolder != null) {
            this.f95413a = null;
            fileMessageHolder.mFileView = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public FileMessageHolder_ViewBinding(FileMessageHolder fileMessageHolder, View view) {
        this.f95413a = fileMessageHolder;
        fileMessageHolder.mFileView = (FileView) Utils.findRequiredViewAsType(view, R.id.save_item_file, "field 'mFileView'", FileView.class);
    }
}
