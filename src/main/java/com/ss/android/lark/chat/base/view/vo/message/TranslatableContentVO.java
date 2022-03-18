package com.ss.android.lark.chat.base.view.vo.message;

import com.larksuite.framework.utils.p1203a.C26247a;
import com.ss.android.lark.chat.export.entity.message.Content;
import com.ss.android.lark.chat.export.vo.ContentVO;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0010\u000e\n\u0002\b\t\b&\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003B\r\u0012\u0006\u0010\u0004\u001a\u00028\u0000¢\u0006\u0002\u0010\u0005J\b\u0010\"\u001a\u00020\u000fH\u0016J\u0016\u0010#\u001a\u00020\u000f2\f\u0010$\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0003H\u0016J\b\u0010%\u001a\u00020\u000fH\u0016R \u0010\u0006\u001a\u00020\u0007X\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001a\u0010\u000e\u001a\u00020\u000fX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0013\u001a\u00020\u000fX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0010\"\u0004\b\u0014\u0010\u0012R\u001a\u0010\u0015\u001a\u00020\u000fX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0010\"\u0004\b\u0016\u0010\u0012R\"\u0010\u0017\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0000X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u001c\u0010\u001c\u001a\u0004\u0018\u00010\u001dX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!¨\u0006&"}, d2 = {"Lcom/ss/android/lark/chat/base/view/vo/message/TranslatableContentVO;", "T", "Lcom/ss/android/lark/chat/export/entity/message/Content;", "Lcom/ss/android/lark/chat/export/vo/ContentVO;", "content", "(Lcom/ss/android/lark/chat/export/entity/message/Content;)V", "displayRule", "", "displayRule$annotations", "()V", "getDisplayRule", "()I", "setDisplayRule", "(I)V", "isAutoTranslatedForReceiver", "", "()Z", "setAutoTranslatedForReceiver", "(Z)V", "isManualTranslated", "setManualTranslated", "isTranslating", "setTranslating", "translateInfo", "getTranslateInfo", "()Lcom/ss/android/lark/chat/base/view/vo/message/TranslatableContentVO;", "setTranslateInfo", "(Lcom/ss/android/lark/chat/base/view/vo/message/TranslatableContentVO;)V", "translateLanguage", "", "getTranslateLanguage", "()Ljava/lang/String;", "setTranslateLanguage", "(Ljava/lang/String;)V", "canReply", "isContentSame", "diffable", "isTranslated", "im_chat_chat-export_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.chat.base.view.vo.message.o */
public abstract class TranslatableContentVO<T extends Content> extends ContentVO<T> {

    /* renamed from: a */
    private String f84886a = "";

    /* renamed from: b */
    private boolean f84887b;

    /* renamed from: c */
    private boolean f84888c;

    /* renamed from: d */
    private boolean f84889d;

    /* renamed from: e */
    private int f84890e;

    /* renamed from: f */
    private TranslatableContentVO<T> f84891f;

    /* renamed from: t */
    public final String mo121925t() {
        return this.f84886a;
    }

    /* renamed from: u */
    public final boolean mo121926u() {
        return this.f84887b;
    }

    /* renamed from: v */
    public final boolean mo121927v() {
        return this.f84888c;
    }

    /* renamed from: w */
    public final boolean mo121928w() {
        return this.f84889d;
    }

    /* renamed from: x */
    public final int mo121929x() {
        return this.f84890e;
    }

    /* renamed from: y */
    public final TranslatableContentVO<T> mo121930y() {
        return this.f84891f;
    }

    /* renamed from: i */
    public boolean mo121814i() {
        boolean z;
        int i = this.f84890e;
        if (i == 1 || i == 0) {
            return false;
        }
        String str = this.f84886a;
        if (str == null || str.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z || this.f84891f == null) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public final void mo121919a(TranslatableContentVO<T> oVar) {
        this.f84891f = oVar;
    }

    /* renamed from: b */
    public final void mo121920b(int i) {
        this.f84890e = i;
    }

    /* renamed from: c */
    public final void mo121921c(boolean z) {
        this.f84887b = z;
    }

    /* renamed from: d */
    public final void mo121922d(boolean z) {
        this.f84888c = z;
    }

    /* renamed from: e */
    public final void mo121923e(String str) {
        this.f84886a = str;
    }

    /* renamed from: e */
    public final void mo121924e(boolean z) {
        this.f84889d = z;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TranslatableContentVO(T t) {
        super(t);
        Intrinsics.checkParameterIsNotNull(t, "content");
    }

    @Override // com.ss.android.lark.chat.export.vo.ContentVO
    /* renamed from: a */
    public boolean mo121780a(ContentVO<?> aVar) {
        if (!super.mo121780a(aVar) || !(aVar instanceof TranslatableContentVO)) {
            return false;
        }
        TranslatableContentVO oVar = (TranslatableContentVO) aVar;
        if (!C26247a.m94981a(this.f84886a, oVar.f84886a) || this.f84887b != oVar.f84887b || this.f84888c != oVar.f84888c || this.f84889d != oVar.f84889d || this.f84890e != oVar.f84890e) {
            return false;
        }
        if (!Intrinsics.areEqual(this.f84891f, oVar.f84891f)) {
            TranslatableContentVO<T> oVar2 = this.f84891f;
            if (oVar2 == null) {
                return false;
            }
            if (oVar2 == null) {
                Intrinsics.throwNpe();
            }
            if (oVar2.mo121780a((ContentVO<?>) oVar.f84891f)) {
                return true;
            }
            return false;
        }
        return true;
    }
}
