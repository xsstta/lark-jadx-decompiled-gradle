package com.ss.android.lark.widget.chat_function_view;

import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001R\u001a\u0010\u0002\u001a\u0004\u0018\u00010\u0003X¦\u000e¢\u0006\f\u001a\u0004\b\u0004\u0010\u0005\"\u0004\b\u0006\u0010\u0007R\u0016\u0010\b\u001a\u0004\u0018\u00010\t8VX\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\r8VX\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0012\u0010\u0010\u001a\u00020\rX¦\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u000fR\u0012\u0010\u0012\u001a\u00020\tX¦\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u000bR\u0012\u0010\u0014\u001a\u00020\u0015X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lcom/ss/android/lark/widget/chat_function_view/IChatFunctionItem;", "", "badge", "Lcom/ss/android/lark/widget/chat_function_view/ChatFunctionBadge;", "getBadge", "()Lcom/ss/android/lark/widget/chat_function_view/ChatFunctionBadge;", "setBadge", "(Lcom/ss/android/lark/widget/chat_function_view/ChatFunctionBadge;)V", "iconKey", "", "getIconKey", "()Ljava/lang/String;", "iconRes", "", "getIconRes", "()I", "id", "getId", "label", "getLabel", "onItemClickListener", "Lcom/ss/android/lark/widget/chat_function_view/IItemClickListener;", "getOnItemClickListener", "()Lcom/ss/android/lark/widget/chat_function_view/IItemClickListener;", "com.ss.android.lark.widget"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.widget.chat_function_view.d */
public interface IChatFunctionItem {

    @Metadata(bv = {1, 0, 3}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.widget.chat_function_view.d$a */
    public static final class C58374a {
        /* renamed from: a */
        public static int m226273a(IChatFunctionItem dVar) {
            return -1;
        }

        /* renamed from: b */
        public static String m226274b(IChatFunctionItem dVar) {
            return null;
        }
    }

    /* renamed from: a */
    int mo127572a();

    /* renamed from: a */
    void mo127573a(ChatFunctionBadge aVar);

    /* renamed from: b */
    ChatFunctionBadge mo127574b();

    /* renamed from: c */
    IItemClickListener mo127575c();

    /* renamed from: d */
    String mo127576d();

    /* renamed from: e */
    String mo127577e();

    /* renamed from: g */
    int mo127579g();
}
