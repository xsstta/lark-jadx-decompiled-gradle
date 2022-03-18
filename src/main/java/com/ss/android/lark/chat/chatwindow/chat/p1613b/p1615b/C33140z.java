package com.ss.android.lark.chat.chatwindow.chat.p1613b.p1615b;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import com.ss.android.lark.chat.base.view.vo.message.PostContentVO;
import com.ss.android.lark.chat.base.view.vo.message.TranslatableContentVO;
import com.ss.android.lark.chat.entity.message.content.PostContent;
import com.ss.android.lark.chat.vo.AbsMessageVO;
import com.ss.android.lark.chatbase.p1690c.C34438a;
import com.ss.android.lark.chatwindow.C35247g;
import com.ss.android.lark.keyboard.utils.KBCopyManager;

/* renamed from: com.ss.android.lark.chat.chatwindow.chat.b.b.z */
public class C33140z implements AbstractC33114c<PostContentVO> {

    /* renamed from: a */
    private Context f85278a;

    public C33140z(Context context) {
        this.f85278a = context;
    }

    @Override // com.ss.android.lark.chat.chatwindow.chat.p1613b.p1615b.AbstractC33114c
    /* renamed from: a */
    public <M extends AbsMessageVO<PostContentVO>> void mo122270a(M m) {
        boolean z;
        boolean z2;
        PostContentVO iVar;
        PostContentVO iVar2 = (PostContentVO) m.mo121699g();
        boolean z3 = !C35247g.m137634b((TranslatableContentVO) iVar2);
        if (iVar2.mo121929x() == 3) {
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
        CharSequence a = C34438a.m133571a(C34438a.m133570a(iVar2.mo121788g()), ((PostContent) iVar2.mo126168z()).getDocEntityMap());
        if (!TextUtils.isEmpty(a)) {
            spannableStringBuilder.append(a);
            KBCopyManager.f103297a.mo146860a(spannableStringBuilder, null, true);
        } else {
            if (z2) {
                spannableStringBuilder.append((CharSequence) C34438a.m133572a(this.f85278a, iVar2));
                KBCopyManager.f103297a.mo146860a(spannableStringBuilder, iVar2.mo121772a(), false);
            }
            if (z3 && (iVar = (PostContentVO) C35247g.m137625a((TranslatableContentVO) iVar2)) != null) {
                spannableStringBuilder.append((CharSequence) C34438a.m133572a(this.f85278a, iVar));
                KBCopyManager.f103297a.mo146860a(spannableStringBuilder, iVar.mo121772a(), true);
            }
        }
        C34438a.m133576a(this.f85278a, spannableStringBuilder);
    }
}
