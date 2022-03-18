package com.ss.android.lark.chat.chatwindow.chat.message.p1627d;

import com.ss.android.lark.chat.entity.message.AbstractC34006a;
import com.ss.android.lark.chat.entity.message.Message;
import com.ss.android.lark.chat.export.vo.ContentVO;
import com.ss.android.lark.chat.export.vo.IOpenMsgVOConverter;
import com.ss.android.lark.chat.vo.IMsgVOConverter;

/* renamed from: com.ss.android.lark.chat.chatwindow.chat.message.d.b */
public class C33345b implements IMsgVOConverter {

    /* renamed from: a */
    private IOpenMsgVOConverter f85903a;

    @Override // com.ss.android.lark.chat.vo.IMsgVOConverter
    /* renamed from: a */
    public Message.Type mo122452a() {
        return Message.Type.forNumber(this.f85903a.mo120418a().getNumber());
    }

    public C33345b(IOpenMsgVOConverter bVar) {
        this.f85903a = bVar;
    }

    @Override // com.ss.android.lark.chat.vo.IMsgVOConverter
    /* renamed from: b */
    public ContentVO<?> mo122453b(AbstractC34006a aVar) {
        return this.f85903a.mo120419b(aVar);
    }

    @Override // com.ss.android.lark.chat.vo.IMsgVOConverter
    /* renamed from: c */
    public CharSequence mo122454c(AbstractC34006a aVar) {
        return this.f85903a.mo120420c(aVar);
    }
}
