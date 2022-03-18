package com.ss.android.lark.pin.impl.v3.binder.p2472a;

import android.content.Context;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.chat.entity.message.content.ShareGroupChatContent;
import com.ss.android.lark.pin.impl.C51502e;
import com.ss.android.lark.pin.impl.entity.PinInfo;
import com.ss.android.lark.pin.impl.v3.binder.p2472a.AbstractC51540b;
import com.ss.android.lark.pin.impl.v3.binder.viewholder.C51624i;
import com.ss.android.lark.utils.UIHelper;

/* renamed from: com.ss.android.lark.pin.impl.v3.binder.a.d */
public class C51543d extends AbstractC51540b<C51624i> {
    public C51543d(Context context, C51502e.AbstractC51506c cVar) {
        super(context, cVar);
    }

    /* renamed from: a */
    public C51624i mo31176b(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return C51624i.C51626a.m200250a(layoutInflater, viewGroup);
    }

    /* renamed from: a */
    public void mo177520a(C51624i iVar, int i, PinInfo bVar) {
        super.mo31174a((AbstractC51540b.C51541a) iVar, i, bVar);
        String string = UIHelper.getString(R.string.Lark_MessageType_SHARE_GROUP_CHAT);
        String name = ((ShareGroupChatContent) bVar.mo177396g().getContent()).getChat().getName();
        SpannableString spannableString = new SpannableString(string + name);
        spannableString.setSpan(new ForegroundColorSpan(UIUtils.getColor(this.f146181d, R.color.function_info_500)), 0, string.length(), 33);
        iVar.f128452m.setMaxLines(1);
        iVar.f128452m.setText(spannableString);
        iVar.f128453n.setVisibility(8);
    }
}
