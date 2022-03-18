package com.ss.android.lark.search.widget.params;

import com.bytedance.lark.pb.search.v1.ChatFilterParam;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0013\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0016\u0010\u001b\u001a\u00020\u00002\u000e\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004J\u000e\u0010\u001c\u001a\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u000bJ\u000e\u0010\n\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u000bJ\u000e\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000bJ\u000e\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u000bJ\u000e\u0010\u0018\u001a\u00020\u00002\u0006\u0010\u001d\u001a\u00020\u000bR \u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001a\u0010\n\u001a\u00020\u000bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0010\u001a\u00020\u000bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\r\"\u0004\b\u0012\u0010\u000fR\u001a\u0010\u0013\u001a\u00020\u000bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\r\"\u0004\b\u0015\u0010\u000fR\u001a\u0010\u0016\u001a\u00020\u000bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\r\"\u0004\b\u0017\u0010\u000fR\u001a\u0010\u0018\u001a\u00020\u000bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\r\"\u0004\b\u001a\u0010\u000f¨\u0006\u001e"}, d2 = {"Lcom/ss/android/lark/search/widget/params/ChatPickerParams;", "Lcom/ss/android/lark/search/widget/params/BasePickerParams;", "()V", "chatModeList", "", "Lcom/bytedance/lark/pb/search/v1/ChatFilterParam$ChatMode;", "getChatModeList", "()Ljava/util/List;", "setChatModeList", "(Ljava/util/List;)V", "excludeResignedUser", "", "getExcludeResignedUser", "()Z", "setExcludeResignedUser", "(Z)V", "excludeWithoutChatUser", "getExcludeWithoutChatUser", "setExcludeWithoutChatUser", "includeThread", "getIncludeThread", "setIncludeThread", "isCheckPermission", "setCheckPermission", "needSearchOuterTenant", "getNeedSearchOuterTenant", "setNeedSearchOuterTenant", "chatMode", "checkPermission", "searchOuterTenant", "search-widget_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.search.widget.c.c */
public final class ChatPickerParams extends BasePickerParams {

    /* renamed from: a */
    private boolean f133039a;

    /* renamed from: b */
    private boolean f133040b = true;

    /* renamed from: c */
    private List<ChatFilterParam.ChatMode> f133041c = new ArrayList();

    /* renamed from: d */
    private boolean f133042d = true;

    /* renamed from: e */
    private boolean f133043e = true;

    /* renamed from: f */
    private boolean f133044f;

    /* renamed from: c */
    public final boolean mo183683c() {
        return this.f133039a;
    }

    /* renamed from: d */
    public final boolean mo183685d() {
        return this.f133040b;
    }

    /* renamed from: e */
    public final List<ChatFilterParam.ChatMode> mo183687e() {
        return this.f133041c;
    }

    /* renamed from: f */
    public final boolean mo183688f() {
        return this.f133042d;
    }

    /* renamed from: g */
    public final boolean mo183689g() {
        return this.f133043e;
    }

    /* renamed from: h */
    public final boolean mo183690h() {
        return this.f133044f;
    }

    /* renamed from: a */
    public final ChatPickerParams mo183680a(boolean z) {
        ChatPickerParams cVar = this;
        cVar.f133039a = z;
        return cVar;
    }

    /* renamed from: b */
    public final ChatPickerParams mo183681b(boolean z) {
        ChatPickerParams cVar = this;
        cVar.f133040b = z;
        return cVar;
    }

    /* renamed from: c */
    public final ChatPickerParams mo183682c(boolean z) {
        ChatPickerParams cVar = this;
        cVar.f133042d = z;
        return cVar;
    }

    /* renamed from: d */
    public final ChatPickerParams mo183684d(boolean z) {
        ChatPickerParams cVar = this;
        cVar.f133043e = z;
        return cVar;
    }

    /* renamed from: e */
    public final ChatPickerParams mo183686e(boolean z) {
        ChatPickerParams cVar = this;
        cVar.f133044f = z;
        return cVar;
    }

    /* renamed from: a */
    public final ChatPickerParams mo183679a(List<ChatFilterParam.ChatMode> list) {
        ChatPickerParams cVar = this;
        if (list != null) {
            cVar.f133041c.clear();
            cVar.f133041c.addAll(list);
        }
        return cVar;
    }
}
