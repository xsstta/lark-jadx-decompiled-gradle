package com.ss.android.lark.chat.chatwindow.chat.data.convert.textprocess;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u001d\u0018\u0000 22\u00020\u0001:\u00012B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004J\u0014\u0010\t\u001a\u00020\u00002\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\nJ\u000e\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u0010J\u000e\u0010\u0015\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u0016J\u000e\u0010\u001b\u001a\u00020\u00002\u0006\u0010\u001b\u001a\u00020\u0016J\u000e\u0010\u001e\u001a\u00020\u00002\u0006\u0010\u001e\u001a\u00020\u0016J\u000e\u0010 \u001a\u00020\u00002\u0006\u0010 \u001a\u00020\u0016J\u000e\u0010\"\u001a\u00020\u00002\u0006\u0010\"\u001a\u00020\u0016J\u000e\u0010$\u001a\u00020\u00002\u0006\u0010$\u001a\u00020\u0016J\u000e\u0010&\u001a\u00020\u00002\u0006\u0010&\u001a\u00020\u0016J\u000e\u0010)\u001a\u00020\u00002\u0006\u0010)\u001a\u00020\u0016J\u000e\u0010,\u001a\u00020\u00002\u0006\u0010,\u001a\u00020\u0016J\u0014\u0010/\u001a\u00020\u00002\f\u0010/\u001a\b\u0012\u0004\u0012\u00020\u00040\nR\u001a\u0010\u0003\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR \u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\u0010X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0015\u001a\u00020\u0016X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u001a\u0010\u001b\u001a\u00020\u0016X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0018\"\u0004\b\u001d\u0010\u001aR\u001a\u0010\u001e\u001a\u00020\u0016X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u0018\"\u0004\b\u001f\u0010\u001aR\u001a\u0010 \u001a\u00020\u0016X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010\u0018\"\u0004\b!\u0010\u001aR\u001a\u0010\"\u001a\u00020\u0016X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\u0018\"\u0004\b#\u0010\u001aR\u001a\u0010$\u001a\u00020\u0016X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b$\u0010\u0018\"\u0004\b%\u0010\u001aR\u001a\u0010&\u001a\u00020\u0016X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b'\u0010\u0018\"\u0004\b(\u0010\u001aR\u001a\u0010)\u001a\u00020\u0016X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b*\u0010\u0018\"\u0004\b+\u0010\u001aR\u001a\u0010,\u001a\u00020\u0016X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b-\u0010\u0018\"\u0004\b.\u0010\u001aR \u0010/\u001a\b\u0012\u0004\u0012\u00020\u00040\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b0\u0010\f\"\u0004\b1\u0010\u000e¨\u00063"}, d2 = {"Lcom/ss/android/lark/chat/chatwindow/chat/data/convert/textprocess/ProcessParams;", "", "()V", "anonymousId", "", "getAnonymousId", "()Ljava/lang/String;", "setAnonymousId", "(Ljava/lang/String;)V", "botIds", "", "getBotIds", "()Ljava/util/List;", "setBotIds", "(Ljava/util/List;)V", "contextType", "", "getContextType", "()I", "setContextType", "(I)V", "disableAtReadState", "", "getDisableAtReadState", "()Z", "setDisableAtReadState", "(Z)V", "hasImage", "getHasImage", "setHasImage", "isDisable", "setDisable", "isFromMe", "setFromMe", "isGroupAnnouncement", "setGroupAnnouncement", "isSecret", "setSecret", "parsePhone", "getParsePhone", "setParsePhone", "parseTranslate", "getParseTranslate", "setParseTranslate", "parseUrl", "getParseUrl", "setParseUrl", "readAtChatterIds", "getReadAtChatterIds", "setReadAtChatterIds", "Companion", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.chat.chatwindow.chat.data.a.a.d */
public final class ProcessParams {

    /* renamed from: a */
    public static final Companion f85445a = new Companion(null);

    /* renamed from: b */
    private List<String> f85446b = new ArrayList();

    /* renamed from: c */
    private List<String> f85447c = new ArrayList();

    /* renamed from: d */
    private boolean f85448d;

    /* renamed from: e */
    private boolean f85449e;

    /* renamed from: f */
    private boolean f85450f;

    /* renamed from: g */
    private boolean f85451g;

    /* renamed from: h */
    private boolean f85452h;

    /* renamed from: i */
    private boolean f85453i;

    /* renamed from: j */
    private boolean f85454j;

    /* renamed from: k */
    private boolean f85455k;

    /* renamed from: l */
    private String f85456l = "";

    /* renamed from: m */
    private boolean f85457m = true;

    /* renamed from: n */
    private int f85458n = 17;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lcom/ss/android/lark/chat/chatwindow/chat/data/convert/textprocess/ProcessParams$Companion;", "", "()V", "TYPE_CHAT", "", "TYPE_CHAT_THREAD", "TYPE_THREAD", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.chatwindow.chat.data.a.a.d$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: a */
    public final List<String> mo122465a() {
        return this.f85446b;
    }

    /* renamed from: b */
    public final List<String> mo122468b() {
        return this.f85447c;
    }

    /* renamed from: f */
    public final boolean mo122478f() {
        return this.f85452h;
    }

    /* renamed from: g */
    public final boolean mo122480g() {
        return this.f85453i;
    }

    /* renamed from: h */
    public final boolean mo122482h() {
        return this.f85454j;
    }

    /* renamed from: i */
    public final boolean mo122484i() {
        return this.f85455k;
    }

    /* renamed from: j */
    public final String mo122485j() {
        return this.f85456l;
    }

    /* renamed from: k */
    public final boolean mo122486k() {
        return this.f85457m;
    }

    /* renamed from: l */
    public final int mo122487l() {
        return this.f85458n;
    }

    /* renamed from: c */
    public final boolean mo122472c() {
        return this.f85448d;
    }

    /* renamed from: d */
    public final boolean mo122474d() {
        return this.f85449e;
    }

    /* renamed from: e */
    public final boolean mo122476e() {
        return this.f85450f;
    }

    /* renamed from: c */
    public final void mo122471c(boolean z) {
        this.f85450f = z;
    }

    /* renamed from: d */
    public final void mo122473d(boolean z) {
        this.f85451g = z;
    }

    /* renamed from: e */
    public final void mo122475e(boolean z) {
        this.f85453i = z;
    }

    /* renamed from: a */
    public final ProcessParams mo122463a(int i) {
        ProcessParams dVar = this;
        dVar.f85458n = i;
        return dVar;
    }

    /* renamed from: b */
    public final void mo122469b(List<String> list) {
        Intrinsics.checkParameterIsNotNull(list, "<set-?>");
        this.f85447c = list;
    }

    /* renamed from: f */
    public final ProcessParams mo122477f(boolean z) {
        ProcessParams dVar = this;
        dVar.f85454j = z;
        return dVar;
    }

    /* renamed from: g */
    public final ProcessParams mo122479g(boolean z) {
        ProcessParams dVar = this;
        dVar.f85450f = z;
        return dVar;
    }

    /* renamed from: h */
    public final ProcessParams mo122481h(boolean z) {
        ProcessParams dVar = this;
        dVar.f85452h = z;
        return dVar;
    }

    /* renamed from: i */
    public final ProcessParams mo122483i(boolean z) {
        ProcessParams dVar = this;
        dVar.f85455k = z;
        return dVar;
    }

    /* renamed from: a */
    public final ProcessParams mo122464a(String str) {
        ProcessParams dVar = this;
        if (str != null) {
            dVar.f85456l = str;
        }
        return dVar;
    }

    /* renamed from: b */
    public final void mo122470b(boolean z) {
        this.f85449e = z;
    }

    /* renamed from: a */
    public final void mo122466a(List<String> list) {
        Intrinsics.checkParameterIsNotNull(list, "<set-?>");
        this.f85446b = list;
    }

    /* renamed from: a */
    public final void mo122467a(boolean z) {
        this.f85448d = z;
    }
}
