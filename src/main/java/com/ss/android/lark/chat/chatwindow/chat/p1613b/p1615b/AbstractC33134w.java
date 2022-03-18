package com.ss.android.lark.chat.chatwindow.chat.p1613b.p1615b;

import com.ss.android.lark.chat.entity.message.AbstractC34006a;
import com.ss.android.lark.dto.translate.C36874a;
import com.ss.android.lark.dto.translate.TranslateState;
import java.util.Collection;
import java.util.List;
import java.util.Map;

/* renamed from: com.ss.android.lark.chat.chatwindow.chat.b.b.w */
public interface AbstractC33134w<T extends AbstractC34006a> {

    /* renamed from: com.ss.android.lark.chat.chatwindow.chat.b.b.w$a */
    public interface AbstractC33135a {
        /* renamed from: a */
        List<AbstractC34006a> mo122322a(Collection<String> collection, int i);

        /* renamed from: a */
        void mo122323a(Collection<AbstractC34006a> collection);

        /* renamed from: b */
        void mo122324b(Collection<AbstractC34006a> collection);
    }

    /* renamed from: com.ss.android.lark.chat.chatwindow.chat.b.b.w$b */
    public interface AbstractC33136b {
        /* renamed from: a */
        void mo122325a(TranslateState translateState);

        /* renamed from: a */
        void mo122326a(Map<String, TranslateState> map);
    }

    void batchUpdateTranslateState(List<T> list);

    void clearCache();

    boolean handlePushTranslateSettingV2(String str, List<String> list, Integer num, Map<String, Integer> map, Map<String, Integer> map2);

    void handlePushTranslateState(C36874a aVar, AbstractC33136b bVar);

    void setInitData(String str, AbstractC33135a aVar);
}
