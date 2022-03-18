package com.ss.android.lark.chat.chatwindow.chat.message;

import android.view.View;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.larksuite.component.ui.display.manager.C25649b;
import com.larksuite.component.ui.display.manager.LarkFont;
import com.larksuite.suite.R;
import com.ss.android.lark.chat.base.view.vo.message.UnKnownContentVO;
import com.ss.android.lark.chat.chatwindow.chat.message.p1631f.p1633b.C33360a;
import com.ss.android.lark.chat.vo.AbsMessageVO;
import com.ss.android.lark.desktopmode.utils.DesktopUtil;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.lark.widget.recyclerview.hive.AbstractC59010e;

public class UnKnownMessageCell extends AbstractC33290a<UnKnownContentVO, UnknownMessageViewHolder> {
    /* access modifiers changed from: protected */
    /* renamed from: b */
    public boolean mo122755b(UnknownMessageViewHolder unknownMessageViewHolder, AbsMessageVO<UnKnownContentVO> aVar) {
        return true;
    }

    @Override // com.ss.android.lark.widget.recyclerview.hive.AbstractC59004b
    /* renamed from: c */
    public int mo122651c() {
        return R.layout.chat_message_item_unkown;
    }

    /* access modifiers changed from: package-private */
    public static class UnknownMessageViewHolder extends AbstractC59010e {
        @BindView(7385)
        public TextView textView;

        UnknownMessageViewHolder() {
        }

        /* renamed from: a */
        private void m128891a() {
            if (!DesktopUtil.m144307b()) {
                C25649b.m91857a(this.textView, LarkFont.TITLE3);
            }
        }

        /* access modifiers changed from: protected */
        @Override // com.ss.android.lark.widget.recyclerview.hive.AbstractC59010e
        /* renamed from: a */
        public void mo122652a(View view) {
            ButterKnife.bind(this, view);
            m128891a();
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.widget.recyclerview.hive.AbstractC59004b
    /* renamed from: a */
    public Class mo122646a() {
        return UnKnownContentVO.class;
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.widget.recyclerview.hive.AbstractC59004b
    /* renamed from: b */
    public Class<UnknownMessageViewHolder> mo122650b() {
        return UnknownMessageViewHolder.class;
    }

    public class UnknownMessageViewHolder_ViewBinding implements Unbinder {

        /* renamed from: a */
        private UnknownMessageViewHolder f85788a;

        @Override // butterknife.Unbinder
        public void unbind() {
            UnknownMessageViewHolder unknownMessageViewHolder = this.f85788a;
            if (unknownMessageViewHolder != null) {
                this.f85788a = null;
                unknownMessageViewHolder.textView = null;
                return;
            }
            throw new IllegalStateException("Bindings already cleared.");
        }

        public UnknownMessageViewHolder_ViewBinding(UnknownMessageViewHolder unknownMessageViewHolder, View view) {
            this.f85788a = unknownMessageViewHolder;
            unknownMessageViewHolder.textView = (TextView) Utils.findRequiredViewAsType(view, R.id.chat_message_unkown_content, "field 'textView'", TextView.class);
        }
    }

    public UnKnownMessageCell(AbstractC33342d dVar) {
        super(dVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo122649a(UnknownMessageViewHolder unknownMessageViewHolder, AbsMessageVO<UnKnownContentVO> aVar) {
        super.mo122648a((AbstractC59010e) unknownMessageViewHolder, (AbsMessageVO) aVar);
        unknownMessageViewHolder.textView.setText(UIHelper.mustacheFormat((int) R.string.Lark_Legacy_UnknownMessageTypeTip));
        unknownMessageViewHolder.textView.setTextColor(C33360a.m129156c(aVar.mo121695c()));
    }
}
