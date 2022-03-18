package com.ss.android.lark.threadwindow.fragment;

import com.larksuite.framework.callback.IGetDataCallback;
import com.ss.android.lark.chat.entity.chat.Chat;
import com.ss.android.lark.chat.vo.AbsMessageVO;
import com.ss.android.lark.dependency.AbstractC36459ag;
import com.ss.android.lark.dto.chat.ChatChatterResponse;
import com.ss.android.lark.dto.group.GroupRecallEntity;
import com.ss.android.lark.threaddetail.view.p2752b.p2754b.AbstractC55890m;
import com.ss.android.lark.threadtab.p2757a.AbstractC55977b;
import java.util.List;

/* renamed from: com.ss.android.lark.threadwindow.fragment.e */
public interface AbstractC56087e extends AbstractC55890m, AbstractC55977b {

    /* renamed from: com.ss.android.lark.threadwindow.fragment.e$-CC  reason: invalid class name */
    public final /* synthetic */ class CC {
        public static void $default$a(AbstractC56087e eVar, AbsMessageVO aVar, int i) {
        }
    }

    /* renamed from: a */
    void mo190954a(int i, boolean z);

    /* renamed from: a */
    void mo190955a(AbsMessageVO aVar, int i);

    /* renamed from: a */
    void mo190956a(String str, int i, AbstractC36459ag.AbstractC36460a aVar);

    /* renamed from: a */
    void mo190957a(String str, IGetDataCallback<ChatChatterResponse> iGetDataCallback);

    /* renamed from: a */
    void mo190958a(String str, List<GroupRecallEntity> list);

    /* renamed from: a */
    void mo190959a(String str, List<GroupRecallEntity> list, IGetDataCallback<List<GroupRecallEntity>> iGetDataCallback);

    /* renamed from: a */
    void mo190960a(List<String> list);

    /* renamed from: a */
    void mo190961a(List<String> list, int i);

    /* renamed from: a */
    boolean mo190962a(int i);

    /* renamed from: b */
    void mo190963b(int i);

    /* renamed from: b */
    void mo190964b(boolean z);

    /* renamed from: c */
    boolean mo190965c(int i);

    /* renamed from: d */
    void mo190966d(int i);

    /* renamed from: e */
    void mo190967e(int i);

    /* renamed from: h */
    Chat mo190968h();

    /* renamed from: i */
    boolean mo190969i();

    /* renamed from: j */
    void mo190970j();

    /* renamed from: j */
    void mo190971j(String str);

    /* renamed from: k */
    int mo190972k();

    /* renamed from: k */
    void mo190973k(String str);

    /* renamed from: l */
    float mo190974l();

    /* renamed from: m */
    int mo190975m();

    /* renamed from: n */
    boolean mo190976n();

    /* renamed from: o */
    boolean mo190977o();

    /* renamed from: p */
    boolean mo190978p();
}
