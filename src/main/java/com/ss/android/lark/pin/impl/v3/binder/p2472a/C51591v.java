package com.ss.android.lark.pin.impl.v3.binder.p2472a;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.larksuite.component.ui.display.manager.C25649b;
import com.larksuite.component.ui.display.manager.LarkFont;
import com.larksuite.suite.R;
import com.ss.android.lark.chat.entity.message.content.CardContent;
import com.ss.android.lark.desktopmode.utils.DesktopUtil;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.pin.PinModule;
import com.ss.android.lark.pin.dto.C51488f;
import com.ss.android.lark.pin.impl.C51502e;
import com.ss.android.lark.pin.impl.entity.PinInfo;
import com.ss.android.lark.pin.impl.v3.binder.p2472a.AbstractC51540b;
import com.ss.android.lark.pin.impl.v3.binder.viewholder.C51627j;
import com.ss.android.lark.pin.p2466a.AbstractC51472a;
import com.ss.android.lark.ui.p2892a.C57582a;
import com.ss.android.lark.widget.richtext.RichText;
import java.util.ArrayList;

/* renamed from: com.ss.android.lark.pin.impl.v3.binder.a.v */
public class C51591v extends AbstractC51540b<C51627j> {
    /* renamed from: a */
    private void m200201a(C51627j jVar) {
        C25649b.m91853a(jVar.f128457p, 32);
        C25649b.m91857a(jVar.f128454m, LarkFont.HEADLINE);
    }

    public C51591v(Context context, C51502e.AbstractC51506c cVar) {
        super(context, cVar);
    }

    /* renamed from: a */
    public C51627j mo31176b(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return C51627j.C51628a.m200251a(layoutInflater, viewGroup);
    }

    /* access modifiers changed from: private */
    @Override // com.ss.android.lark.pin.impl.v3.binder.p2472a.AbstractC51540b
    /* renamed from: a */
    public /* synthetic */ void m200200a(PinInfo bVar, View view) {
        if (this.f128306c != null) {
            this.f128306c.mo177363a(view, bVar);
        }
    }

    /* renamed from: b */
    private void m200202b(final C51627j jVar, final PinInfo bVar) {
        CardContent cardContent = (CardContent) bVar.mo177396g().getContent();
        if (cardContent != null) {
            if (cardContent.getType() != CardContent.Type.VOTE) {
                Log.m165383e("PinHolderView", "this card type is " + cardContent.getType() + " ,is not vote, do not support");
                return;
            }
            RichText richText = cardContent.getRichText();
            if (richText != null) {
                PinModule.m199585b().mo144035i().mo144075a(richText, new AbstractC51472a.AbstractC51474b.AbstractC51475a() {
                    /* class com.ss.android.lark.pin.impl.v3.binder.p2472a.C51591v.C515921 */

                    @Override // com.ss.android.lark.pin.p2466a.AbstractC51472a.AbstractC51474b.AbstractC51475a
                    /* renamed from: a */
                    public void mo177255a() {
                    }

                    @Override // com.ss.android.lark.pin.p2466a.AbstractC51472a.AbstractC51474b.AbstractC51475a
                    /* renamed from: a */
                    public void mo177256a(C51488f fVar) {
                        if (fVar != null) {
                            C51591v.this.mo177606a(jVar, fVar, bVar);
                        }
                    }
                });
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo177530a(C51627j jVar, final PinInfo bVar) {
        super.mo177530a((AbstractC51540b.C51541a) jVar, bVar);
        View$OnClickListenerC515932 r0 = new View.OnClickListener() {
            /* class com.ss.android.lark.pin.impl.v3.binder.p2472a.C51591v.View$OnClickListenerC515932 */

            public void onClick(View view) {
                if (C51591v.this.f128306c != null) {
                    C51591v.this.f128306c.mo177363a(view, bVar);
                }
            }
        };
        jVar.itemView.setOnClickListener(r0);
        jVar.f128455n.setOnClickListener(r0);
        jVar.itemView.setOnLongClickListener(mo177529a(bVar));
    }

    /* renamed from: a */
    public void mo177520a(C51627j jVar, int i, PinInfo bVar) {
        super.mo31174a((AbstractC51540b.C51541a) jVar, i, bVar);
        m200202b(jVar, bVar);
        if (!DesktopUtil.m144307b()) {
            m200201a(jVar);
        }
    }

    /* renamed from: a */
    public void mo177606a(C51627j jVar, C51488f fVar, PinInfo bVar) {
        ArrayList arrayList = new ArrayList(fVar.mo177313b());
        jVar.f128454m.setText(fVar.mo177312a().get(0));
        VoteOptionAdapter wVar = new VoteOptionAdapter(this.f146181d, arrayList);
        jVar.f128455n.setAdapter(wVar);
        jVar.f128455n.setLayoutManager(new LinearLayoutManager(this.f146181d));
        if (bVar.mo177391b()) {
            jVar.f128456o.setBackgroundResource(R.drawable.item_bg_corner4_white);
            jVar.f128456o.setPadding(-C57582a.m223601a(this.f146181d, 8.0f), -C57582a.m223601a(this.f146181d, 8.0f), -C57582a.m223601a(this.f146181d, 8.0f), 0);
        }
        wVar.mo177610a(new View.OnClickListener(bVar) {
            /* class com.ss.android.lark.pin.impl.v3.binder.p2472a.$$Lambda$v$tG1ih_1im150Ki54y3ZP4F3tDao */
            public final /* synthetic */ PinInfo f$1;

            {
                this.f$1 = r2;
            }

            public final void onClick(View view) {
                C51591v.lambda$tG1ih_1im150Ki54y3ZP4F3tDao(C51591v.this, this.f$1, view);
            }
        });
        wVar.mo177611a(mo177529a(bVar));
    }
}
