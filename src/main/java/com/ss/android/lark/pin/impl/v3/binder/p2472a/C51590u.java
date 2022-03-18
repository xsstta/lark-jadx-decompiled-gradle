package com.ss.android.lark.pin.impl.v3.binder.p2472a;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.larksuite.suite.R;
import com.ss.android.lark.pin.PinModule;
import com.ss.android.lark.pin.impl.entity.PinInfo;
import com.ss.android.lark.pin.impl.v3.binder.p2472a.AbstractC51540b;
import com.ss.android.lark.pin.impl.v3.binder.viewholder.UnsupportMessageViewHolder;
import com.ss.android.lark.utils.C57851l;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.lark.widget.richtext.C59029c;

/* renamed from: com.ss.android.lark.pin.impl.v3.binder.a.u */
public class C51590u extends AbstractC51540b<UnsupportMessageViewHolder> {
    public C51590u(Context context) {
        super(context, null);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public UnsupportMessageViewHolder mo31176b(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return UnsupportMessageViewHolder.Factory.m200240a(layoutInflater, viewGroup);
    }

    /* renamed from: a */
    public void mo177520a(UnsupportMessageViewHolder unsupportMessageViewHolder, int i, PinInfo bVar) {
        String str;
        super.mo31174a((AbstractC51540b.C51541a) unsupportMessageViewHolder, i, bVar);
        if (bVar.mo177397h() != null) {
            str = bVar.mo177397h().getOperatorDisplayName();
        } else {
            str = "";
        }
        unsupportMessageViewHolder.name.setText(str);
        unsupportMessageViewHolder.postDate.setText(C57851l.m224543a(this.f146181d, bVar.mo177397h().getTimeStamp(), PinModule.m199585b().mo144023a(), PinModule.m199585b().mo144030d()));
        unsupportMessageViewHolder.content.setInfo(C59029c.m229161b(UIHelper.getString(R.string.Lark_Legacy_UnsupportedMessage)));
    }
}
