package com.ss.android.lark.mm.module.reaction.panel;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.ss.android.lark.mm.depend.C45899c;
import com.ss.android.lark.mm.module.detail.C45950b;
import com.ss.android.lark.mm.module.detail.IMmDetailCommonDataProvider;
import com.ss.android.lark.mm.module.reaction.model.EmojiReaction;
import com.ss.android.lark.mm.module.reaction.panel.C46827c;
import com.ss.android.lark.mm.net.p2332a.C47057a;
import com.ss.android.lark.mm.net.p2333b.AbstractC47070c;
import com.ss.android.lark.mm.net.p2333b.C47068a;
import com.ss.android.lark.mm.p2288b.C45855f;
import java.util.UUID;

public class MmReactionLayout extends FrameLayout {

    /* renamed from: a */
    public AbstractC46813a f117825a;

    /* renamed from: b */
    private C46827c f117826b;

    /* renamed from: c */
    private C46827c.AbstractC46830b f117827c;

    /* renamed from: com.ss.android.lark.mm.module.reaction.panel.MmReactionLayout$a */
    public interface AbstractC46813a {
        /* renamed from: a */
        int mo164465a();

        /* renamed from: a */
        void mo164466a(EmojiReaction emojiReaction);
    }

    /* renamed from: a */
    private void m185493a() {
        this.f117827c = new C46827c.AbstractC46830b() {
            /* class com.ss.android.lark.mm.module.reaction.panel.MmReactionLayout.C468111 */

            @Override // com.ss.android.lark.mm.module.reaction.panel.C46827c.AbstractC46830b
            /* renamed from: a */
            public void mo164463a(String str) {
                final EmojiReaction emojiReaction = new EmojiReaction(str, (long) MmReactionLayout.this.f117825a.mo164465a(), UUID.randomUUID().toString());
                IMmDetailCommonDataProvider a = C45950b.m182104a(MmReactionLayout.this.getContext());
                C47057a.m186288f(a.mo161315a(), a.bc_(), emojiReaction.toJson(), new AbstractC47070c<String>() {
                    /* class com.ss.android.lark.mm.module.reaction.panel.MmReactionLayout.C468111.C468121 */

                    @Override // com.ss.android.lark.mm.net.p2333b.AbstractC47069b
                    /* renamed from: a */
                    public void mo161288a(C47068a aVar) {
                        C45855f.m181665d("MmReactionLayout", "onError " + aVar);
                    }

                    /* renamed from: a */
                    public void mo161289a(String str) {
                        C45855f.m181663b("MmReactionLayout", "onSuccess " + str);
                        MmReactionLayout.this.f117825a.mo164466a(emojiReaction);
                    }
                });
            }
        };
        C46827c a = new C46827c.C46829a(this).mo164510a(C45899c.m181859a().getHostDepend().mo144641i()).mo164509a(this.f117827c).mo164511a();
        this.f117826b = a;
        a.mo164507a();
    }

    public void setDepend(AbstractC46813a aVar) {
        this.f117825a = aVar;
    }

    public MmReactionLayout(Context context) {
        this(context, null);
    }

    public MmReactionLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public MmReactionLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m185493a();
    }
}
