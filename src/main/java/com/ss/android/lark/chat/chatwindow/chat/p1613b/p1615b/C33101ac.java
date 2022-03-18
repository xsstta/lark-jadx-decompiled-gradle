package com.ss.android.lark.chat.chatwindow.chat.p1613b.p1615b;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import com.ss.android.lark.chat.base.view.vo.message.BaseTextContentVO;
import com.ss.android.lark.chat.base.view.vo.message.TextContentVO;
import com.ss.android.lark.chat.base.view.vo.message.TranslatableContentVO;
import com.ss.android.lark.chat.entity.message.content.TextContent;
import com.ss.android.lark.chat.vo.AbsMessageVO;
import com.ss.android.lark.chatbase.p1690c.C34438a;
import com.ss.android.lark.chatwindow.C35247g;
import com.ss.android.lark.keyboard.utils.KBCopyManager;
import com.ss.android.lark.widget.richtext.C59035h;

/* renamed from: com.ss.android.lark.chat.chatwindow.chat.b.b.ac */
public class C33101ac implements AbstractC33114c<TextContentVO> {

    /* renamed from: a */
    private Context f85251a;

    public C33101ac(Context context) {
        this.f85251a = context;
    }

    @Override // com.ss.android.lark.chat.chatwindow.chat.p1613b.p1615b.AbstractC33114c
    /* renamed from: a */
    public <M extends AbsMessageVO<TextContentVO>> void mo122270a(M m) {
        boolean z;
        boolean z2;
        TextContentVO mVar = (TextContentVO) m.mo121699g();
        boolean z3 = !C35247g.m137634b((TranslatableContentVO) mVar);
        if (mVar.mo121929x() == 3) {
            z = true;
        } else {
            z = false;
        }
        if (!z3 || z) {
            z2 = true;
        } else {
            z2 = false;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        CharSequence a = C34438a.m133571a(C34438a.m133570a(mVar.mo121788g()), ((TextContent) mVar.mo126168z()).getDocEntityMap());
        if (!TextUtils.isEmpty(a)) {
            spannableStringBuilder.append(a);
            KBCopyManager.f103297a.mo146860a(spannableStringBuilder, null, true);
        } else {
            if (z2) {
                spannableStringBuilder.append((CharSequence) C59035h.m229214e(mVar.mo121772a()));
                KBCopyManager.f103297a.mo146860a(spannableStringBuilder, mVar.mo121772a(), false);
            }
            if (z3) {
                TranslatableContentVO y = mVar.mo121930y();
                if (y instanceof BaseTextContentVO) {
                    BaseTextContentVO baseTextContentVO = (BaseTextContentVO) y;
                    spannableStringBuilder.append((CharSequence) C59035h.m229214e(baseTextContentVO.mo121772a()));
                    KBCopyManager.f103297a.mo146860a(spannableStringBuilder, baseTextContentVO.mo121772a(), true);
                }
            }
        }
        C34438a.m133576a(this.f85251a, spannableStringBuilder.toString());
    }
}
