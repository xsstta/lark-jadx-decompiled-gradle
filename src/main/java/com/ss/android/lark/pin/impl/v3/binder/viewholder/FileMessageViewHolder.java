package com.ss.android.lark.pin.impl.v3.binder.viewholder;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.larksuite.suite.R;
import com.ss.android.lark.desktopmode.utils.DesktopUtil;
import com.ss.android.lark.pin.impl.v3.binder.p2472a.AbstractC51540b;
import com.ss.android.lark.widget.fileview.FileView;

public class FileMessageViewHolder extends AbstractC51540b.C51541a {
    @BindView(6685)
    public FileView mFileView;

    public FileMessageViewHolder(View view) {
        super(view);
        ButterKnife.bind(this, view);
    }

    /* renamed from: com.ss.android.lark.pin.impl.v3.binder.viewholder.FileMessageViewHolder$a */
    public static final class C51597a {
        /* renamed from: a */
        public static FileMessageViewHolder m200236a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
            FileMessageViewHolder fileMessageViewHolder = new FileMessageViewHolder(layoutInflater.inflate(R.layout.chatpin_item_file2, viewGroup, false));
            DesktopUtil.m144299a(fileMessageViewHolder.mFileView.f143940a);
            DesktopUtil.m144306b(fileMessageViewHolder.mFileView.f143941b);
            return fileMessageViewHolder;
        }
    }
}
