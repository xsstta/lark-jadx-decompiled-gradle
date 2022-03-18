package com.ss.android.lark.biz.im.extension;

import com.ss.android.lark.chat.export.ui.p1672b.C34029b;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b&\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u000e\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\tH\u0016J\u000f\u0010\n\u001a\u0004\u0018\u00010\u000bH'¢\u0006\u0002\u0010\fJ\u000f\u0010\r\u001a\u0004\u0018\u00010\u000bH'¢\u0006\u0002\u0010\fJ\b\u0010\u000e\u001a\u00020\u000bH&J\b\u0010\u000f\u001a\u00020\u0010H&J\b\u0010\u0011\u001a\u00020\u0012H&J\b\u0010\u0013\u001a\u00020\u0002H&J\u0016\u0010\u0014\u001a\u00020\u00022\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\tH\u0016R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0016"}, d2 = {"Lcom/ss/android/lark/biz/im/extension/MessageAction;", "Lcom/ss/android/lark/chat/export/ui/menu/MenuItem$OnItemSelectListener;", "", "actionContext", "Lcom/ss/android/lark/biz/im/extension/ActionContext;", "(Lcom/ss/android/lark/biz/im/extension/ActionContext;)V", "getActionContext", "()Lcom/ss/android/lark/biz/im/extension/ActionContext;", "convertToMenuItem", "Lcom/ss/android/lark/chat/export/ui/menu/MenuItem;", "getIconDrawableRes", "", "()Ljava/lang/Integer;", "getIconTintColorRes", "getId", "getLabel", "", "isEnable", "", "onClick", "onSelected", "menuItem", "im_chat_chat-export_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.biz.im.extension.h */
public abstract class MessageAction implements C34029b.AbstractC34032b<Unit> {

    /* renamed from: a */
    private final ActionContext f74304a;

    /* renamed from: a */
    public abstract int mo106818a();

    /* renamed from: b */
    public abstract Integer mo106819b();

    /* renamed from: c */
    public abstract Integer mo106820c();

    /* renamed from: d */
    public abstract String mo106821d();

    /* renamed from: e */
    public abstract boolean mo106822e();

    /* renamed from: f */
    public abstract void mo106823f();

    /* renamed from: h */
    public final ActionContext mo106825h() {
        return this.f74304a;
    }

    /* renamed from: g */
    public C34029b<Unit> mo106824g() {
        C34029b.C34031a d = C34029b.m131930a().mo126127a(mo106818a()).mo126135d(0);
        String d2 = mo106821d();
        if (d2 == null) {
            d2 = "";
        }
        C34029b.C34031a a = d.mo126133b(d2).mo126130a(mo106822e()).mo126128a(this);
        Integer b = mo106819b();
        if (b != null) {
            a.mo126132b(b.intValue());
        }
        Integer c = mo106820c();
        if (c != null) {
            a.mo126134c(c.intValue());
        }
        C34029b<Unit> a2 = a.mo126131a();
        Intrinsics.checkExpressionValueIsNotNull(a2, "builder.build()");
        return a2;
    }

    public MessageAction(ActionContext actionContext) {
        Intrinsics.checkParameterIsNotNull(actionContext, "actionContext");
        this.f74304a = actionContext;
    }

    @Override // com.ss.android.lark.chat.export.ui.p1672b.C34029b.AbstractC34032b
    public void onSelected(C34029b<Unit> bVar) {
        Intrinsics.checkParameterIsNotNull(bVar, "menuItem");
        mo106823f();
    }
}
