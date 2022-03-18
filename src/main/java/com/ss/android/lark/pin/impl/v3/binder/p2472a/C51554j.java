package com.ss.android.lark.pin.impl.v3.binder.p2472a;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.ss.android.lark.chat.entity.message.content.MediaContent;
import com.ss.android.lark.image.entity.Image;
import com.ss.android.lark.pin.PinModule;
import com.ss.android.lark.pin.impl.C51502e;
import com.ss.android.lark.pin.impl.entity.PinInfo;
import com.ss.android.lark.pin.impl.v3.binder.p2472a.AbstractC51540b;
import com.ss.android.lark.pin.impl.v3.binder.viewholder.C51612d;
import com.ss.android.lark.utils.UIHelper;

/* renamed from: com.ss.android.lark.pin.impl.v3.binder.a.j */
public class C51554j extends AbstractC51542c {
    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.pin.impl.v3.binder.p2472a.AbstractC51542c
    /* renamed from: b */
    public Image mo177536b(PinInfo bVar) {
        return PinModule.m199585b().mo144035i().mo144061a((MediaContent) bVar.mo177396g().getContent());
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.pin.impl.v3.binder.p2472a.AbstractC51542c
    /* renamed from: c */
    public Image mo177538c(PinInfo bVar) {
        return ((MediaContent) bVar.mo177396g().getContent()).getImageSet().getOrigin();
    }

    public C51554j(Context context, C51502e.AbstractC51506c cVar) {
        super(context, cVar);
    }

    /* renamed from: a */
    private void m200086a(ImageView imageView, int i) {
        int dp2px = UIHelper.dp2px((float) i);
        ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
        layoutParams.width = dp2px;
        layoutParams.height = dp2px;
        imageView.setLayoutParams(layoutParams);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo177530a(C51612d dVar, final PinInfo bVar) {
        super.mo177530a((AbstractC51540b.C51541a) dVar, bVar);
        dVar.f128432n.setOnClickListener(new View.OnClickListener() {
            /* class com.ss.android.lark.pin.impl.v3.binder.p2472a.C51554j.View$OnClickListenerC515551 */

            public void onClick(View view) {
                if (C51554j.this.f128306c != null) {
                    C51554j.this.f128306c.mo177363a(view, bVar);
                }
            }
        });
        dVar.f128431m.setOnLongClickListener(mo177529a(bVar));
        dVar.f128432n.setOnLongClickListener(mo177529a(bVar));
        dVar.f128431m.setOnGenericMotionListener(new View.OnGenericMotionListener() {
            /* class com.ss.android.lark.pin.impl.v3.binder.p2472a.C51554j.View$OnGenericMotionListenerC515562 */

            public boolean onGenericMotion(View view, MotionEvent motionEvent) {
                if (motionEvent.getButtonState() != 2 || C51554j.this.f128306c == null) {
                    return false;
                }
                C51554j.this.f128306c.mo177365a(view, bVar, motionEvent);
                return true;
            }
        });
    }

    @Override // com.ss.android.lark.pin.impl.v3.binder.p2472a.AbstractC51542c
    /* renamed from: a */
    public void mo177520a(C51612d dVar, int i, PinInfo bVar) {
        super.mo177520a(dVar, i, bVar);
        dVar.f128431m.setVisibility(0);
        dVar.f128432n.setVisibility(0);
        m200086a(dVar.f128432n, 24);
    }
}
