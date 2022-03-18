package com.ss.android.lark.pin.impl.v3.binder.p2472a;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.larksuite.component.ui.display.manager.C25649b;
import com.larksuite.component.ui.display.manager.LKUIDisplayManager;
import com.larksuite.component.ui.display.manager.LarkFont;
import com.ss.android.lark.chat.entity.message.content.MergeForwardContent;
import com.ss.android.lark.desktopmode.utils.DesktopUtil;
import com.ss.android.lark.pin.PinModule;
import com.ss.android.lark.pin.dto.C51487b;
import com.ss.android.lark.pin.impl.C51502e;
import com.ss.android.lark.pin.impl.entity.PinInfo;
import com.ss.android.lark.pin.impl.v3.binder.p2472a.AbstractC51540b;
import com.ss.android.lark.pin.impl.v3.binder.viewholder.C51617f;

/* renamed from: com.ss.android.lark.pin.impl.v3.binder.a.k */
public class C51557k extends AbstractC51540b<C51617f> {
    /* renamed from: a */
    private void m200094a(C51617f fVar) {
        C25649b.m91857a(fVar.f128439n, LarkFont.HEADLINE);
        fVar.f128440o.setEmojiconSize(LKUIDisplayManager.m91881c(this.f146181d, 16));
        fVar.f128440o.setTextSize(0, LKUIDisplayManager.m91865a(this.f146181d, LarkFont.BODY1));
        ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) fVar.f128441p.getLayoutParams();
        int c = LKUIDisplayManager.m91881c(this.f146181d, 4);
        int c2 = LKUIDisplayManager.m91881c(this.f146181d, 3);
        layoutParams.width = LKUIDisplayManager.m91881c(this.f146181d, 2);
        layoutParams.setMargins(0, c, 0, c2);
        fVar.f128441p.setLayoutParams(layoutParams);
    }

    public C51557k(Context context, C51502e.AbstractC51506c cVar) {
        super(context, cVar);
    }

    /* renamed from: a */
    public C51617f mo31176b(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return C51617f.C51619a.m200247a(layoutInflater, viewGroup);
    }

    /* renamed from: b */
    private void m200095b(C51617f fVar, PinInfo bVar) {
        MergeForwardContent mergeForwardContent = (MergeForwardContent) bVar.mo177396g().getContent();
        mergeForwardContent.setMessageId(bVar.mo177396g().getId());
        if (mergeForwardContent != null) {
            C51487b a = PinModule.m199585b().mo144035i().mo144062a(mergeForwardContent);
            String str = a.f128103a;
            CharSequence charSequence = a.f128104b;
            fVar.f128439n.setText(str);
            fVar.f128440o.setTranslateEmojiCode(false);
            fVar.f128440o.setText(charSequence);
        }
        if (!DesktopUtil.m144307b()) {
            m200094a(fVar);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo177530a(C51617f fVar, final PinInfo bVar) {
        super.mo177530a((AbstractC51540b.C51541a) fVar, bVar);
        View$OnClickListenerC515581 r0 = new View.OnClickListener() {
            /* class com.ss.android.lark.pin.impl.v3.binder.p2472a.C51557k.View$OnClickListenerC515581 */

            public void onClick(View view) {
                if (C51557k.this.f128306c != null) {
                    C51557k.this.f128306c.mo177363a(view, bVar);
                }
            }
        };
        View.OnLongClickListener a = mo177529a(bVar);
        fVar.f128438m.setOnClickListener(r0);
        fVar.f128438m.setOnLongClickListener(a);
    }

    /* renamed from: a */
    public void mo177520a(C51617f fVar, int i, PinInfo bVar) {
        super.mo31174a((AbstractC51540b.C51541a) fVar, i, bVar);
        m200095b(fVar, bVar);
    }
}
