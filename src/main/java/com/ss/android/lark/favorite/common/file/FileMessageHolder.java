package com.ss.android.lark.favorite.common.file;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.larksuite.suite.R;
import com.ss.android.lark.favorite.common.base.AbstractC37119a;
import com.ss.android.lark.widget.fileview.FileView;

public class FileMessageHolder extends AbstractC37119a {
    @BindView(8635)
    public FileView mFileView;

    @Override // com.ss.android.lark.favorite.common.base.AbstractC37119a
    /* renamed from: a */
    public void mo136728a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        ButterKnife.bind(this, layoutInflater.inflate(R.layout.save_item_file_message_layout, viewGroup, true));
    }
}
