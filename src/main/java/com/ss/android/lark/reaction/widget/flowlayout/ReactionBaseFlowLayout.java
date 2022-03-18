package com.ss.android.lark.reaction.widget.flowlayout;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.ss.android.lark.reaction.widget.flowlayout.p2562a.C53061a;
import com.ss.android.lark.reaction.widget.p2559a.AbstractView$OnClickListenerC52989b;
import java.util.List;

public abstract class ReactionBaseFlowLayout extends FrameLayout {

    /* renamed from: a */
    protected ReactionTagLayout f131076a;

    /* renamed from: b */
    protected AbstractC53049d f131077b;

    /* renamed from: c */
    protected AbstractC53046a f131078c;

    /* renamed from: d */
    protected AbstractC53047b f131079d;

    /* renamed from: com.ss.android.lark.reaction.widget.flowlayout.ReactionBaseFlowLayout$a */
    public interface AbstractC53046a {
        void perform(String str);
    }

    /* renamed from: com.ss.android.lark.reaction.widget.flowlayout.ReactionBaseFlowLayout$b */
    public interface AbstractC53047b {
        void perform(String str);
    }

    /* renamed from: com.ss.android.lark.reaction.widget.flowlayout.ReactionBaseFlowLayout$d */
    public interface AbstractC53049d {
        void onReactionClicked(String str);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo181175a();

    public AbstractC53049d getReactionClickListener() {
        return this.f131077b;
    }

    public void setOnReactionMoreTrigger(AbstractC53047b bVar) {
        this.f131079d = bVar;
    }

    public void setOnReactionNameTrigger(AbstractC53046a aVar) {
        this.f131078c = aVar;
    }

    public void setReactionClickListener(AbstractC53049d dVar) {
        this.f131077b = dVar;
    }

    public ReactionBaseFlowLayout(Context context) {
        super(context);
        mo181175a();
    }

    /* renamed from: a */
    public boolean mo181176a(List<C53061a> list) {
        if (list == null || list.size() == 0) {
            return false;
        }
        return true;
    }

    public void setup(List<C53061a> list) {
        if (!mo181176a(list)) {
            this.f131076a.setVisibility(8);
        } else {
            this.f131076a.setVisibility(0);
        }
    }

    /* renamed from: com.ss.android.lark.reaction.widget.flowlayout.ReactionBaseFlowLayout$c */
    public class C53048c extends AbstractView$OnClickListenerC52989b {

        /* renamed from: b */
        private String f131081b;

        /* renamed from: c */
        private String f131082c;

        /* renamed from: d */
        private boolean f131083d;

        @Override // com.ss.android.lark.reaction.widget.p2559a.AbstractView$OnClickListenerC52989b
        /* renamed from: a */
        public void mo122732a(View view) {
            if (this.f131083d) {
                if (ReactionBaseFlowLayout.this.f131079d != null && !TextUtils.isEmpty(this.f131082c)) {
                    ReactionBaseFlowLayout.this.f131079d.perform(this.f131082c);
                }
            } else if (ReactionBaseFlowLayout.this.f131078c != null && !TextUtils.isEmpty(this.f131081b)) {
                ReactionBaseFlowLayout.this.f131078c.perform(this.f131081b);
            }
        }

        public C53048c(String str, String str2, boolean z) {
            this.f131081b = str;
            this.f131082c = str2;
            this.f131083d = z;
        }
    }

    public ReactionBaseFlowLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        mo181175a();
    }

    public ReactionBaseFlowLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        mo181175a();
    }
}
