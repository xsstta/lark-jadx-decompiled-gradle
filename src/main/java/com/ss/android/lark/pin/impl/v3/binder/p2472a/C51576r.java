package com.ss.android.lark.pin.impl.v3.binder.p2472a;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.larksuite.component.ui.p1153e.C25655d;
import com.larksuite.suite.R;
import com.ss.android.lark.chat.entity.message.content.StickerContent;
import com.ss.android.lark.desktopmode.utils.DesktopUtil;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.pin.PinModule;
import com.ss.android.lark.pin.impl.C51502e;
import com.ss.android.lark.pin.impl.entity.PinInfo;
import com.ss.android.lark.pin.impl.utils.ImageUtil;
import com.ss.android.lark.pin.impl.v3.binder.p2472a.AbstractC51540b;
import com.ss.android.lark.pin.impl.v3.binder.viewholder.C51606b;
import com.ss.android.lark.utils.ImageUtils;
import com.ss.android.lark.utils.UIHelper;

/* renamed from: com.ss.android.lark.pin.impl.v3.binder.a.r */
public class C51576r extends AbstractC51540b<C51606b> {
    /* access modifiers changed from: protected */
    /* renamed from: a */
    public int mo177588a(View view) {
        int a = C25655d.m91902a(this.f146181d).mo89313a();
        if (DesktopUtil.m144301a(this.f146181d)) {
            a = Math.min(UIHelper.dp2px(160.0f), a);
        }
        return (a - view.getPaddingStart()) - view.getPaddingEnd();
    }

    public C51576r(Context context, C51502e.AbstractC51506c cVar) {
        super(context, cVar);
    }

    /* renamed from: a */
    public C51606b mo31176b(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return C51606b.C51608a.m200243a(layoutInflater, viewGroup);
    }

    /* renamed from: b */
    private void m200152b(C51606b bVar, PinInfo bVar2) {
        StickerContent stickerContent = (StickerContent) bVar2.mo177396g().getContent();
        if (stickerContent != null) {
            String key = stickerContent.getKey();
            int width = stickerContent.getWidth();
            int height = stickerContent.getHeight();
            int[] a = ImageUtils.m224135a(width, height, mo177588a(bVar.itemView), UIHelper.dp2px(84.0f), 0, 0);
            Log.m165389i("ljc", "origin width is:" + width + ", height is:" + height);
            Log.m165389i("ljc", "resize width is:" + a[0] + ", height is:" + a[1]);
            int i = a[0];
            int i2 = a[1];
            bVar.f128424m.setVisibility(0);
            ImageUtil.f128174a.mo177355a(this.f146181d, UIHelper.px2dp((float) i), UIHelper.px2dp((float) i2), bVar.f128424m);
            PinModule.m199585b().mo144020a(this.f146181d, false, i, i2, key, bVar.f128424m, R.drawable.common_chat_window_image_item_holder, R.drawable.common_failed_chat_picture);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo177530a(final C51606b bVar, final PinInfo bVar2) {
        super.mo177530a((AbstractC51540b.C51541a) bVar, bVar2);
        bVar.f128424m.setOnClickListener(new View.OnClickListener() {
            /* class com.ss.android.lark.pin.impl.v3.binder.p2472a.C51576r.View$OnClickListenerC515771 */

            public void onClick(View view) {
                if (C51576r.this.f128306c != null) {
                    C51576r.this.f128306c.mo177363a(bVar.f128424m, bVar2);
                }
            }
        });
        bVar.f128424m.setOnLongClickListener(mo177529a(bVar2));
    }

    /* renamed from: a */
    public void mo177520a(C51606b bVar, int i, PinInfo bVar2) {
        super.mo31174a((AbstractC51540b.C51541a) bVar, i, bVar2);
        m200152b(bVar, bVar2);
    }
}
