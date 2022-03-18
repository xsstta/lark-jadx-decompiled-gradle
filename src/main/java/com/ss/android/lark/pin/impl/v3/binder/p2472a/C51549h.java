package com.ss.android.lark.pin.impl.v3.binder.p2472a;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import com.ss.android.lark.chat.entity.message.content.ImageContent;
import com.ss.android.lark.image.entity.Image;
import com.ss.android.lark.pin.PinModule;
import com.ss.android.lark.pin.impl.C51502e;
import com.ss.android.lark.pin.impl.entity.PinInfo;
import com.ss.android.lark.pin.impl.v3.binder.p2472a.AbstractC51540b;
import com.ss.android.lark.pin.impl.v3.binder.viewholder.C51612d;

/* renamed from: com.ss.android.lark.pin.impl.v3.binder.a.h */
public class C51549h extends AbstractC51542c {
    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.pin.impl.v3.binder.p2472a.AbstractC51542c
    /* renamed from: b */
    public Image mo177536b(PinInfo bVar) {
        return PinModule.m199585b().mo144035i().mo144060a((ImageContent) bVar.mo177396g().getContent());
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.pin.impl.v3.binder.p2472a.AbstractC51542c
    /* renamed from: c */
    public Image mo177538c(PinInfo bVar) {
        return ((ImageContent) bVar.mo177396g().getContent()).getImageSet().getOrigin();
    }

    public C51549h(Context context, C51502e.AbstractC51506c cVar) {
        super(context, cVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo177530a(C51612d dVar, final PinInfo bVar) {
        super.mo177530a((AbstractC51540b.C51541a) dVar, bVar);
        dVar.f128431m.setOnClickListener(new View.OnClickListener() {
            /* class com.ss.android.lark.pin.impl.v3.binder.p2472a.C51549h.View$OnClickListenerC515501 */

            public void onClick(View view) {
                if (C51549h.this.f128306c != null) {
                    C51549h.this.f128306c.mo177363a(view, bVar);
                }
            }
        });
        dVar.f128431m.setOnLongClickListener(mo177529a(bVar));
        dVar.f128431m.setOnGenericMotionListener(new View.OnGenericMotionListener() {
            /* class com.ss.android.lark.pin.impl.v3.binder.p2472a.C51549h.View$OnGenericMotionListenerC515512 */

            public boolean onGenericMotion(View view, MotionEvent motionEvent) {
                if (motionEvent.getButtonState() != 2 || C51549h.this.f128306c == null) {
                    return false;
                }
                return C51549h.this.f128306c.mo177365a(view, bVar, motionEvent);
            }
        });
    }

    @Override // com.ss.android.lark.pin.impl.v3.binder.p2472a.AbstractC51542c
    /* renamed from: a */
    public void mo177520a(C51612d dVar, int i, PinInfo bVar) {
        super.mo177520a(dVar, i, bVar);
        dVar.f128431m.setVisibility(0);
        dVar.f128432n.setVisibility(8);
    }
}
