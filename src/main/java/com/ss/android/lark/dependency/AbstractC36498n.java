package com.ss.android.lark.dependency;

import android.app.Activity;
import android.content.Context;
import com.bytedance.lark.pb.basic.v1.C14928Entity;
import com.larksuite.framework.callback.IGetDataCallback;
import com.ss.android.lark.chat.entity.chat.Chat;
import com.ss.android.lark.chat.entity.keyboard.IPlusItem;
import com.ss.android.lark.chat.entity.page.IDocPageLoader;
import com.ss.android.lark.doc.entity.AbstractC36839d;
import com.ss.android.lark.doc.entity.DocPermPair;
import com.ss.android.lark.doc.entity.DocResult;
import com.ss.android.lark.doc.entity.DocType;
import java.util.List;
import java.util.Map;

/* renamed from: com.ss.android.lark.dependency.n */
public interface AbstractC36498n {

    /* renamed from: com.ss.android.lark.dependency.n$a */
    public static class C36499a {

        /* renamed from: a */
        public String f94029a;

        /* renamed from: b */
        public String f94030b;
    }

    /* renamed from: com.ss.android.lark.dependency.n$b */
    public interface AbstractC36500b {
        /* renamed from: a */
        void mo123794a();

        /* renamed from: a */
        void mo123795a(Map<String, Map<String, DocPermPair.PermType>> map);

        /* renamed from: b */
        void mo123796b();
    }

    /* renamed from: a */
    int mo134666a(int i, String str, boolean z);

    /* renamed from: a */
    int mo134667a(DocType docType);

    /* renamed from: a */
    IPlusItem mo134668a(Context context, Chat chat);

    /* renamed from: a */
    IDocPageLoader mo134669a(String str);

    /* renamed from: a */
    DocResult mo134670a(String str, C14928Entity entity);

    /* renamed from: a */
    AbstractC36839d mo134671a(Context context);

    /* renamed from: a */
    void mo134672a(Activity activity, Map<String, Map<String, DocResult>> map, AbstractC36500b bVar);

    /* renamed from: a */
    void mo134673a(String str, IGetDataCallback<C36499a> iGetDataCallback);

    /* renamed from: a */
    void mo134674a(List<String> list);

    /* renamed from: b */
    int mo134675b(DocType docType);

    /* renamed from: b */
    String[] mo134676b(String str);
}
