package com.ss.android.lark.threaddetail.view.p2752b.p2754b;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import com.ss.android.lark.chat.base.view.vo.message.BaseTextContentVO;
import com.ss.android.lark.chat.base.view.vo.message.PostContentVO;
import com.ss.android.lark.chat.base.view.vo.message.TextContentVO;
import com.ss.android.lark.chat.base.view.vo.message.TranslatableContentVO;
import com.ss.android.lark.chat.entity.message.content.PostContent;
import com.ss.android.lark.chat.entity.message.content.TextContent;
import com.ss.android.lark.chat.vo.AbsMessageVO;
import com.ss.android.lark.chatbase.p1690c.C34438a;
import com.ss.android.lark.chatwindow.C35247g;
import com.ss.android.lark.doc.entity.Doc;
import com.ss.android.lark.keyboard.utils.KBCopyManager;
import com.ss.android.lark.widget.richtext.C59035h;
import java.util.Map;

/* renamed from: com.ss.android.lark.threaddetail.view.b.b.o */
public class C55896o implements AbstractC55879d {

    /* renamed from: a */
    private Context f138071a;

    public C55896o(Context context) {
        this.f138071a = context;
    }

    @Override // com.ss.android.lark.threaddetail.view.p2752b.p2754b.AbstractC55879d
    /* renamed from: a */
    public void mo190551a(AbsMessageVO aVar) {
        boolean z;
        boolean z2;
        TextContentVO mVar;
        PostContentVO iVar;
        Map<String, Doc> map;
        String str;
        BaseTextContentVO baseTextContentVO = (BaseTextContentVO) aVar.mo121699g();
        boolean z3 = !C35247g.m137634b((TranslatableContentVO) baseTextContentVO);
        if (baseTextContentVO.mo121929x() == 3) {
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
        CharSequence g = baseTextContentVO.mo121788g();
        if (baseTextContentVO instanceof PostContentVO) {
            iVar = (PostContentVO) baseTextContentVO;
            mVar = null;
        } else {
            mVar = (TextContentVO) baseTextContentVO;
            iVar = null;
        }
        if (iVar != null) {
            map = ((PostContent) iVar.mo126168z()).getDocEntityMap();
        } else {
            map = ((TextContent) mVar.mo126168z()).getDocEntityMap();
        }
        CharSequence a = C34438a.m133571a(C34438a.m133570a(g), map);
        if (!TextUtils.isEmpty(a)) {
            spannableStringBuilder.append(a);
            KBCopyManager.f103297a.mo146860a(spannableStringBuilder, null, true);
        } else {
            if (z2) {
                if (iVar != null) {
                    str = C34438a.m133572a(this.f138071a, iVar);
                } else {
                    str = C59035h.m229214e(mVar.mo121772a());
                }
                spannableStringBuilder.append((CharSequence) str);
                KBCopyManager.f103297a.mo146860a(spannableStringBuilder, baseTextContentVO.mo121772a(), false);
            }
            if (z3) {
                if (iVar != null) {
                    PostContentVO iVar2 = (PostContentVO) C35247g.m137625a((TranslatableContentVO) iVar);
                    if (iVar2 != null) {
                        spannableStringBuilder.append((CharSequence) C34438a.m133572a(this.f138071a, iVar2));
                        KBCopyManager.f103297a.mo146860a(spannableStringBuilder, iVar2.mo121772a(), false);
                    }
                } else {
                    TranslatableContentVO y = mVar.mo121930y();
                    if (y instanceof BaseTextContentVO) {
                        BaseTextContentVO baseTextContentVO2 = (BaseTextContentVO) y;
                        spannableStringBuilder.append((CharSequence) C59035h.m229214e(baseTextContentVO2.mo121772a()));
                        KBCopyManager.f103297a.mo146860a(spannableStringBuilder, baseTextContentVO2.mo121772a(), false);
                    }
                }
            }
        }
        C34438a.m133576a(this.f138071a, spannableStringBuilder.toString());
    }
}
