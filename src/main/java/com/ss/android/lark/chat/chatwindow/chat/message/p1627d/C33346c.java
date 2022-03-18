package com.ss.android.lark.chat.chatwindow.chat.message.p1627d;

import android.view.View;
import com.ss.android.lark.chat.export.ui.message.IOpenCellCallback;
import com.ss.android.lark.chat.export.ui.p1671a.AbstractC34027a;
import com.ss.android.lark.chat.export.vo.OpenMessageVO;
import com.ss.android.lark.chat.vo.AbsMessageVO;
import com.ss.android.lark.widget.richtext.Image;
import java.util.List;

/* renamed from: com.ss.android.lark.chat.chatwindow.chat.message.d.c */
public class C33346c implements IOpenCellCallback {

    /* renamed from: a */
    private C33343a f85904a;

    /* renamed from: b */
    private AbstractC34027a f85905b;

    /* renamed from: a */
    public void mo122831a(C33343a aVar) {
        this.f85904a = aVar;
    }

    public C33346c(AbstractC34027a aVar) {
        this.f85905b = aVar;
    }

    @Override // com.ss.android.lark.chat.export.ui.p1671a.AbstractC34027a
    /* renamed from: a */
    public void mo122832a(String str) {
        AbstractC34027a aVar = this.f85905b;
        if (aVar != null) {
            aVar.mo122832a(str);
        }
    }

    @Override // com.ss.android.lark.chat.export.ui.message.IOpenCellCallback
    /* renamed from: a */
    public void mo122829a(View view, OpenMessageVO cVar) {
        C33343a aVar = this.f85904a;
        if (aVar != null && (cVar instanceof AbsMessageVO)) {
            aVar.mo122824a(view, (AbsMessageVO) cVar);
        }
    }

    @Override // com.ss.android.lark.chat.export.ui.message.IOpenCellCallback
    /* renamed from: b */
    public boolean mo122833b(View view, OpenMessageVO cVar) {
        C33343a aVar = this.f85904a;
        if (aVar == null || !(cVar instanceof AbsMessageVO)) {
            return false;
        }
        return aVar.mo122828b(view, (AbsMessageVO) cVar);
    }

    @Override // com.ss.android.lark.chat.export.ui.p1671a.AbstractC34027a
    /* renamed from: a */
    public void mo122830a(View view, List<Image> list, Image image) {
        AbstractC34027a aVar = this.f85905b;
        if (aVar != null) {
            aVar.mo122830a(view, list, image);
        }
    }
}
