package com.ss.android.lark.dependency;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import com.ss.android.lark.chatwindow.view.tip.NewMessageTip;
import com.ss.android.lark.message.card.view.richtext.MsgCardLinkEmojiTextView;
import com.ss.android.lark.p1786d.C36421a;
import com.ss.android.lark.reaction.widget.flowlayout.ReactionFlowView;
import java.util.LinkedList;
import java.util.List;

public class as {

    /* renamed from: a */
    private static final List<C36467a> f94021a;

    /* renamed from: a */
    public static List<C36467a> m143784a() {
        return f94021a;
    }

    static {
        LinkedList linkedList = new LinkedList();
        f94021a = linkedList;
        linkedList.add(new C36467a(4, ReactionFlowView.class.getName(), new C36421a.AbstractC36427f() {
            /* class com.ss.android.lark.dependency.as.C364631 */

            @Override // com.ss.android.lark.p1786d.C36421a.AbstractC36427f
            /* renamed from: a */
            public View mo134292a(Context context) {
                return new ReactionFlowView(context);
            }
        }));
        linkedList.add(new C36467a(2, NewMessageTip.class.getName(), new C36421a.AbstractC36427f() {
            /* class com.ss.android.lark.dependency.as.C364642 */

            @Override // com.ss.android.lark.p1786d.C36421a.AbstractC36427f
            /* renamed from: a */
            public View mo134292a(Context context) {
                return new NewMessageTip(context);
            }
        }));
        linkedList.add(new C36467a(8, TextView.class.getName(), new C36421a.AbstractC36427f() {
            /* class com.ss.android.lark.dependency.as.C364653 */

            @Override // com.ss.android.lark.p1786d.C36421a.AbstractC36427f
            /* renamed from: a */
            public View mo134292a(Context context) {
                return new TextView(context);
            }
        }));
        linkedList.add(new C36467a(4, MsgCardLinkEmojiTextView.class.getName(), new C36421a.AbstractC36427f() {
            /* class com.ss.android.lark.dependency.as.C364664 */

            @Override // com.ss.android.lark.p1786d.C36421a.AbstractC36427f
            /* renamed from: a */
            public View mo134292a(Context context) {
                return new MsgCardLinkEmojiTextView(context);
            }
        }));
    }

    /* renamed from: com.ss.android.lark.dependency.as$a */
    public static class C36467a {

        /* renamed from: a */
        public int f94022a;

        /* renamed from: b */
        public String f94023b;

        /* renamed from: c */
        public C36421a.AbstractC36427f f94024c;

        public C36467a(int i, String str, C36421a.AbstractC36427f fVar) {
            this.f94022a = i;
            this.f94023b = str;
            this.f94024c = fVar;
        }
    }
}
