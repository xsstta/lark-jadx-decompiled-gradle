package com.tt.refer.p3400a.p3401a;

import android.content.Context;
import com.bytedance.lark.pb.basic.v1.CardContent;
import com.ss.android.lark.littleapp.entity.ChatModel;
import java.util.List;

/* renamed from: com.tt.refer.a.a.c */
public interface AbstractC67712c {

    /* renamed from: com.tt.refer.a.a.c$a */
    public interface AbstractC67713a {
        void onResult(List<String> list, List<String> list2);
    }

    /* renamed from: com.tt.refer.a.a.c$b */
    public interface AbstractC67714b {
        void onResult(String str, CardContent cardContent);
    }

    /* renamed from: com.tt.refer.a.a.c$c */
    public interface AbstractC67715c {
        void onResult(String str);
    }

    /* renamed from: com.tt.refer.a.a.c$d */
    public interface AbstractC67716d {
        void onResult(boolean z, boolean z2, String str);
    }

    /* renamed from: a */
    ChatModel mo235063a(String str);

    /* renamed from: a */
    void mo235064a(Context context, String str, String str2, CardContent cardContent, boolean z, AbstractC67716d dVar);

    /* renamed from: a */
    void mo235065a(Context context, List<String> list, CardContent cardContent, boolean z, AbstractC67716d dVar);

    /* renamed from: a */
    void mo235066a(String str, String str2, String str3, AbstractC67714b bVar);

    /* renamed from: a */
    void mo235067a(List<String> list, AbstractC67713a aVar);

    /* renamed from: a */
    void mo235068a(List<String> list, String str, String str2, AbstractC67715c cVar);
}
