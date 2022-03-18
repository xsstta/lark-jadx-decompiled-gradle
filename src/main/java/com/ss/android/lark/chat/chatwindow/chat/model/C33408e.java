package com.ss.android.lark.chat.chatwindow.chat.model;

import com.larksuite.framework.utils.CollectionUtils;
import com.ss.android.lark.chat.base.view.vo.message.UnKnownContentVO;
import com.ss.android.lark.chat.core.model.C33955c;
import com.ss.android.lark.chat.entity.message.Message;
import com.ss.android.lark.chat.vo.ChatMessageVO;
import com.ss.android.lark.log.Log;
import java.util.List;

/* renamed from: com.ss.android.lark.chat.chatwindow.chat.model.e */
public class C33408e implements C33955c.AbstractC33956a<ChatMessageVO> {

    /* renamed from: a */
    AbstractC33409a f86032a;

    /* renamed from: com.ss.android.lark.chat.chatwindow.chat.model.e$a */
    public interface AbstractC33409a {
        /* renamed from: a */
        boolean mo122972a();

        /* renamed from: b */
        boolean mo122973b();
    }

    public C33408e(AbstractC33409a aVar) {
        this.f86032a = aVar;
    }

    @Override // com.ss.android.lark.chat.core.model.C33955c.AbstractC33956a
    /* renamed from: a */
    public void mo122969a(List<ChatMessageVO> list, int i, int i2) {
        m129447d(list, i, i2);
    }

    @Override // com.ss.android.lark.chat.core.model.C33955c.AbstractC33956a
    /* renamed from: b */
    public void mo122970b(List<ChatMessageVO> list, int i, int i2) {
        m129447d(list, i, i2);
    }

    @Override // com.ss.android.lark.chat.core.model.C33955c.AbstractC33956a
    /* renamed from: c */
    public void mo122971c(List<ChatMessageVO> list, int i, int i2) {
        m129447d(list, i, i2);
    }

    /* renamed from: d */
    private void m129447d(List<ChatMessageVO> list, int i, int i2) {
        if (!this.f86032a.mo122972a() || this.f86032a.mo122973b()) {
            if (CollectionUtils.isEmpty(list)) {
                list.add(((ChatMessageVO.Builder) ((ChatMessageVO.Builder) ((ChatMessageVO.Builder) ((ChatMessageVO.Builder) ((ChatMessageVO.Builder) ((ChatMessageVO.Builder) new ChatMessageVO.Builder().mo124162h("")).mo124164i("")).mo124147a(Message.Type.UNKNOWN)).mo124166j("")).mo124168k("")).mo124150a(new UnKnownContentVO())).mo124291a());
            }
            Log.m165379d("ExtraItemInterceptor", "insertItemWhenEmpty：" + list.size());
            return;
        }
        Log.m165379d("ExtraItemInterceptor", "insertItemWhenEmpty: hasMoreItem");
    }
}
