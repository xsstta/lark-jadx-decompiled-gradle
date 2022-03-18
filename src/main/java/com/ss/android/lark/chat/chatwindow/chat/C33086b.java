package com.ss.android.lark.chat.chatwindow.chat;

import androidx.recyclerview.widget.C1356d;
import androidx.recyclerview.widget.C1374g;
import com.larksuite.framework.utils.p1203a.C26247a;
import com.ss.android.lark.chat.base.view.vo.message.AudioContentVO;
import com.ss.android.lark.chat.base.view.vo.message.BaseTextContentVO;
import com.ss.android.lark.chat.export.vo.ContentVO;
import com.ss.android.lark.chat.vo.ChatMessageVO;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.utils.C57782ag;
import com.ss.android.lark.widget.recyclerview.hive.AbstractView$OnClickListenerC58999a;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.lark.chat.chatwindow.chat.b */
public class C33086b extends AbstractView$OnClickListenerC58999a<ChatMessageVO> {

    /* renamed from: a */
    private final C1356d<ChatMessageVO> f85222a = new C1356d<>(this, new C1374g.AbstractC1378c<ChatMessageVO>() {
        /* class com.ss.android.lark.chat.chatwindow.chat.C33086b.C330871 */

        /* renamed from: a */
        public boolean areItemsTheSame(ChatMessageVO cVar, ChatMessageVO cVar2) {
            return cVar.isItemSame((ChatMessageVO<?>) cVar2);
        }

        /* renamed from: b */
        public boolean areContentsTheSame(ChatMessageVO cVar, ChatMessageVO cVar2) {
            if (cVar.mo124283s() || cVar2.mo124283s()) {
                return false;
            }
            if (cVar == cVar2 || cVar.isContentSame((ChatMessageVO<?>) cVar2)) {
                return true;
            }
            return false;
        }

        /* renamed from: c */
        public Object getChangePayload(ChatMessageVO cVar, ChatMessageVO cVar2) {
            int i;
            int i2;
            boolean z;
            boolean z2;
            boolean z3;
            boolean z4;
            boolean z5 = false;
            if (cVar.mo121658D() == null) {
                i = 0;
            } else {
                i = cVar.mo121658D().size();
            }
            if (cVar2.mo121658D() == null) {
                i2 = 0;
            } else {
                i2 = cVar2.mo121658D().size();
            }
            if (i != i2) {
                z = true;
            } else {
                z = false;
            }
            if (!cVar2.mo124280o() || cVar.mo124280o()) {
                z2 = false;
            } else {
                z2 = true;
            }
            boolean z6 = z | z2 | (!C26247a.m94983b(cVar2.mo121659E(), cVar.mo121659E())) | (!C26247a.m94983b(cVar2.mo124250W(), cVar.mo124250W()));
            ContentVO g = cVar.mo121699g();
            ContentVO g2 = cVar2.mo121699g();
            if ((g instanceof AudioContentVO) && (g2 instanceof AudioContentVO)) {
                if (((AudioContentVO) g).mo121809d() != ((AudioContentVO) g2).mo121809d()) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                z6 |= z4;
            }
            if ((g instanceof BaseTextContentVO) && (g2 instanceof BaseTextContentVO)) {
                BaseTextContentVO baseTextContentVO = (BaseTextContentVO) g;
                BaseTextContentVO baseTextContentVO2 = (BaseTextContentVO) g2;
                if (!C57782ag.m224242a(baseTextContentVO.mo121925t(), baseTextContentVO2.mo121925t()) || baseTextContentVO.mo121929x() != baseTextContentVO2.mo121929x()) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                boolean z7 = z6 | z3;
                if (baseTextContentVO.mo121792l() != baseTextContentVO2.mo121792l()) {
                    z5 = true;
                }
                z6 = z7 | z5;
            }
            if (z6) {
                return true;
            }
            return null;
        }
    });

    /* renamed from: a */
    public List<ChatMessageVO> mo122242a() {
        return this.f85222a.mo7374a();
    }

    @Override // com.ss.android.lark.widget.recyclerview.AbstractC58983c, androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f85222a.mo7374a().size();
    }

    /* renamed from: b */
    public ChatMessageVO mo31276a(int i) {
        return this.f85222a.mo7374a().get(i);
    }

    /* renamed from: a */
    public void mo122244a(List<ChatMessageVO> list) {
        this.f85222a.mo7376a(list);
        Log.m165389i("ChatWindow/ChatAdapter", "setData:" + list.size());
    }

    /* renamed from: a */
    public List<ChatMessageVO> mo122243a(int i, int i2, boolean z) {
        ArrayList arrayList = new ArrayList();
        if (i >= 0 && i2 >= 0) {
            ArrayList arrayList2 = new ArrayList(this.f85222a.mo7374a());
            if (i2 >= arrayList2.size()) {
                i2 = arrayList2.size() - 1;
            }
            if (i > i2) {
                Log.m165383e("ChatWindow/ChatAdapter", "error in putMessageReadState, startIndex = [" + i + "], endIndex = [" + i2 + "]");
                return arrayList;
            }
            if (z) {
                i2++;
            }
            while (i < i2) {
                arrayList.add((ChatMessageVO) arrayList2.get(i));
                i++;
            }
        }
        return arrayList;
    }
}
