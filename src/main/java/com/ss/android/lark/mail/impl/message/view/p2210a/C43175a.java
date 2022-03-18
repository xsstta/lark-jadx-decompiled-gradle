package com.ss.android.lark.mail.impl.message.view.p2210a;

import android.view.View;
import android.view.ViewGroup;
import com.larksuite.framework.utils.CollectionUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.mail.impl.uiframework.view.actionbar.AbstractC43709a;
import com.ss.android.lark.mail.impl.view.titlebar.AbsButton;
import com.ss.android.lark.utils.UIHelper;

/* renamed from: com.ss.android.lark.mail.impl.message.view.a.a */
public class C43175a extends AbstractC43709a<AbsButton, C43178c> {

    /* renamed from: h */
    private final String f109908h = "BottomActionBarAdapter";

    /* renamed from: i */
    private AbstractC43186e f109909i;

    /* renamed from: j */
    private final int f109910j = UIHelper.getDimens(R.dimen.mail_message_list_bottom_bar_height);

    public C43175a(AbstractC43186e eVar) {
        this.f109909i = eVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo154558a(C43178c cVar, int i) {
        if (CollectionUtils.isEmpty(this.f110927b) || this.f110927b.size() <= i) {
            Log.m165383e("BottomActionBarAdapter", "onBindViewHolder invalid data");
            return;
        }
        AbsButton absButton = (AbsButton) this.f110927b.get(i);
        if (absButton == null) {
            Log.m165383e("BottomActionBarAdapter", "onBindViewHolder invalid button");
            return;
        }
        cVar.f109914b.setText(absButton.getText());
        absButton.setImageResourceWithTint(this.f110931f, cVar.f109915c);
        final View a = cVar.mo154561a();
        if (!(a == null || a.getLayoutParams() == null)) {
            ViewGroup.LayoutParams layoutParams = a.getLayoutParams();
            layoutParams.height = this.f109910j;
            a.setLayoutParams(layoutParams);
        }
        absButton.setController(new AbsButton.AbstractC43949b() {
            /* class com.ss.android.lark.mail.impl.message.view.p2210a.C43175a.C431761 */

            @Override // com.ss.android.lark.mail.impl.view.titlebar.AbsButton.AbstractC43949b
            /* renamed from: a */
            public View mo154560a() {
                return a;
            }
        });
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C43178c mo154559b(ViewGroup viewGroup, int i, AbsButton absButton) {
        return new C43178c(this.f110931f, this.f109909i.mo154562a());
    }
}
