package com.ss.android.lark.chat.chatwindow.chat;

import com.ss.android.lark.chat.base.view.vo.message.BaseTextContentVO;
import com.ss.android.lark.chat.vo.ChatMessageVO;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.ss.android.lark.chat.chatwindow.chat.f */
public class C33235f {

    /* renamed from: a */
    private String f85535a;

    /* renamed from: b */
    private final Map<String, C33237b> f85536b = new HashMap();

    /* renamed from: c */
    private AbstractC33236a f85537c;

    /* renamed from: d */
    private final Map<String, Integer> f85538d = new HashMap();

    /* renamed from: com.ss.android.lark.chat.chatwindow.chat.f$a */
    public interface AbstractC33236a {
        /* renamed from: a */
        void mo122571a(String str);
    }

    /* renamed from: a */
    public void mo122562a(AbstractC33236a aVar) {
        this.f85537c = aVar;
    }

    /* renamed from: f */
    private void m128518f(String str) {
        AbstractC33236a aVar = this.f85537c;
        if (aVar != null) {
            aVar.mo122571a(str);
        }
    }

    /* renamed from: e */
    public boolean mo122570e(String str) {
        return str.equals(this.f85535a);
    }

    /* renamed from: com.ss.android.lark.chat.chatwindow.chat.f$b */
    private class C33237b {

        /* renamed from: a */
        public boolean f85539a = true;

        /* renamed from: b */
        public double f85540b = 0.5d;

        /* renamed from: d */
        private final int f85542d = -1;

        C33237b() {
        }
    }

    /* renamed from: a */
    public int mo122561a(String str) {
        if (this.f85536b.get(str) != null) {
        }
        return -1;
    }

    /* renamed from: c */
    public boolean mo122568c(String str) {
        C33237b bVar = this.f85536b.get(str);
        if (bVar != null) {
            return bVar.f85539a;
        }
        return true;
    }

    /* renamed from: b */
    public double mo122566b(String str) {
        C33237b bVar = this.f85536b.get(str);
        if (bVar != null) {
            return bVar.f85540b;
        }
        return 0.9d;
    }

    /* renamed from: d */
    public void mo122569d(String str) {
        String str2 = this.f85535a;
        if (str2 == null) {
            this.f85535a = str;
            m128518f(str);
        } else if (str.equals(str2)) {
            this.f85535a = null;
            m128518f(str);
        } else {
            this.f85535a = str;
            m128518f(str);
            m128518f(str2);
        }
    }

    /* renamed from: a */
    public void mo122563a(ChatMessageVO<? extends BaseTextContentVO<?>> cVar) {
        if (this.f85536b.get(cVar.mo121681a()) == null) {
            C33237b bVar = new C33237b();
            if (cVar.mo121695c() || cVar.mo124241N()) {
                bVar.f85539a = true;
            } else {
                bVar.f85539a = true;
                bVar.f85540b = 0.5d;
            }
            this.f85536b.put(cVar.mo121681a(), bVar);
        }
    }

    /* renamed from: a */
    public void mo122564a(String str, int i) {
        this.f85538d.put(str, Integer.valueOf(i));
    }

    /* renamed from: b */
    public int mo122567b(String str, int i) {
        if (this.f85538d.containsKey(str)) {
            return this.f85538d.get(str).intValue();
        }
        return i;
    }

    /* renamed from: a */
    public void mo122565a(String str, boolean z) {
        C33237b bVar = this.f85536b.get(str);
        if (bVar == null) {
            bVar = new C33237b();
            this.f85536b.put(str, bVar);
        }
        if (bVar.f85539a != z) {
            bVar.f85539a = z;
            m128518f(str);
        }
    }
}
