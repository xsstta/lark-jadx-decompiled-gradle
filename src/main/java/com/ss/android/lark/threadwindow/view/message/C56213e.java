package com.ss.android.lark.threadwindow.view.message;

import com.larksuite.suite.R;
import com.ss.android.lark.chat.base.view.vo.ThreadMessageVO;
import com.ss.android.lark.chat.base.view.vo.message.FileContentVO;
import com.ss.android.lark.chat.chatwindow.chat.message.AbstractC33342d;
import com.ss.android.lark.chat.chatwindow.chat.message.FileMessageCell;
import com.ss.android.lark.chat.vo.AbsMessageVO;
import com.ss.android.lark.statistics.chat.ChatHitPointNew;
import com.ss.android.lark.utils.UIHelper;

/* renamed from: com.ss.android.lark.threadwindow.view.message.e */
public class C56213e extends FileMessageCell {

    /* renamed from: b */
    private final AbstractC56214a f139113b;

    /* renamed from: com.ss.android.lark.threadwindow.view.message.e$a */
    public interface AbstractC56214a {
        /* renamed from: a */
        void mo190456a(String str, int i);
    }

    public C56213e(AbstractC33342d dVar, AbstractC56214a aVar) {
        super(dVar, null);
        this.f139113b = aVar;
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.chat.chatwindow.chat.message.FileMessageCell
    /* renamed from: a */
    public void mo122649a(FileMessageCell.FileMessageViewHolder fileMessageViewHolder, AbsMessageVO<FileContentVO> aVar) {
        super.mo122649a(fileMessageViewHolder, aVar);
        fileMessageViewHolder.mFileView.setBackground(UIHelper.getDrawable(R.drawable.thread_item_float_white_bg));
        fileMessageViewHolder.mFileView.setBottomMargin(true);
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.chat.chatwindow.chat.message.FileMessageCell
    /* renamed from: b */
    public void mo122683c(FileMessageCell.FileMessageViewHolder fileMessageViewHolder, AbsMessageVO<FileContentVO> aVar) {
        int i;
        if (!aVar.ai() && this.f139113b != null) {
            if (!this.f85789d.mo122560x()) {
                ChatHitPointNew.f135660c.mo187384a(this.f85789d.mo122550n(), "file", ChatHitPointNew.f135660c.mo187391b("file"), ChatHitPointNew.f135660c.mo187378a(aVar, (String) null, (String) null));
            }
            AbstractC56214a aVar2 = this.f139113b;
            String a = aVar.mo121681a();
            if (aVar instanceof ThreadMessageVO) {
                i = ((ThreadMessageVO) aVar).mo121673S();
            } else {
                i = 0;
            }
            aVar2.mo190456a(a, i);
        }
    }
}
