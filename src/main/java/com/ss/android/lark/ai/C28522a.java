package com.ss.android.lark.ai;

import android.view.ViewGroup;
import com.ss.android.lark.ai.IComposeController;
import com.ss.android.lark.ai.enterpriseTopic.p1340c.C28557a;
import com.ss.android.lark.ai.p1328b.C28532a;
import com.ss.android.lark.ai.p1329c.AbstractC28534a;
import com.ss.android.lark.ai.smartreply.C28588a;
import com.ss.android.lark.ai.smartreply.C28601c;
import com.ss.android.lark.ai.smartreply.inter.AbstractC28621d;
import com.ss.android.lark.ai.smartreply.inter.ISmartReplyInterface;
import com.ss.android.lark.ai.smartreply.p1345c.p1346a.C28606a;
import com.ss.android.lark.ai.statistics.smartreply.SmartReplyHitPoint;
import com.ss.android.lark.ai.translate.p1348b.AbstractC28628a;
import com.ss.android.lark.ai.translate.p1348b.p1349a.C28629a;
import com.ss.android.lark.chat.entity.chat.Chat;
import com.ss.android.lark.keyboard.KeyBoard;
import java.util.List;

/* renamed from: com.ss.android.lark.ai.a */
public class C28522a {

    /* renamed from: a */
    private static volatile AbstractC28534a f71676a;

    /* renamed from: b */
    private C28629a f71677b;

    /* renamed from: c */
    private C28557a f71678c;

    /* renamed from: a */
    public static AbstractC28534a m104531a() {
        return f71676a;
    }

    /* renamed from: b */
    public List<String> mo101547b() {
        return C28532a.m104568a();
    }

    /* renamed from: c */
    public AbstractC28628a mo101548c() {
        if (this.f71677b == null) {
            this.f71677b = new C28629a();
        }
        return this.f71677b;
    }

    /* renamed from: d */
    public C28557a mo101549d() {
        if (this.f71678c == null) {
            this.f71678c = new C28557a();
        }
        return this.f71678c;
    }

    /* renamed from: e */
    public boolean mo101550e() {
        return m104531a().mo101558a("suite.ai.smart_reply.enabled");
    }

    /* renamed from: f */
    public boolean mo101551f() {
        return m104531a().mo101558a("suite.ai.smart_compose.mobile.enabled");
    }

    /* renamed from: g */
    public boolean mo101552g() {
        return m104531a().mo101558a("ai.smartcorrect.message");
    }

    public C28522a(AbstractC28534a aVar) {
        f71676a = aVar;
    }

    /* renamed from: a */
    public IComposeController mo101545a(String str, IComposeController.ConvoType convoType, IComposeController.EditorType editorType) {
        return new C28539d(str, convoType, editorType);
    }

    /* renamed from: a */
    public AbstractC28621d mo101546a(Chat chat, ViewGroup viewGroup, KeyBoard fVar, ISmartReplyInterface iSmartReplyInterface) {
        return new C28601c(chat, viewGroup, new C28588a(fVar, m104531a()), iSmartReplyInterface, m104531a(), C28606a.m104900a(), new SmartReplyHitPoint());
    }
}
