package com.ss.android.lark.p2993y.p2994a;

import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.C29990c;
import com.ss.android.lark.chat.base.view.vo.message.BaseTextContentVO;
import com.ss.android.lark.chat.base.view.vo.message.TranslatableContentVO;
import com.ss.android.lark.chat.chatwindow.chat.message.p1631f.p1633b.C33360a;
import com.ss.android.lark.chat.entity.message.content.BaseTextContent;
import com.ss.android.lark.chat.export.vo.ContentVO;
import com.ss.android.lark.chat.vo.ChatMessageVO;
import com.ss.android.lark.chatbase.p1690c.C34438a;
import com.ss.android.lark.chatwindow.C35247g;

/* renamed from: com.ss.android.lark.y.a.a */
public interface AbstractC59357a {

    /* renamed from: c */
    public static final boolean f147354c = C29990c.m110930b().mo134586n().mo134685a("message.translation.feedback");

    /* renamed from: a */
    boolean mo122800a(AbstractC59358b bVar, ChatMessageVO cVar);

    /* renamed from: com.ss.android.lark.y.a.a$-CC  reason: invalid class name */
    public final /* synthetic */ class CC {
        public static boolean $default$a(AbstractC59357a aVar, AbstractC59358b bVar, ChatMessageVO cVar) {
            ContentVO g = cVar.mo121699g();
            boolean z = false;
            if (cVar.mo121698f() || !(g instanceof TranslatableContentVO)) {
                UIUtils.hide(bVar.mo122801a());
                UIUtils.hide(bVar.mo122802b());
                return false;
            }
            TranslatableContentVO oVar = (TranslatableContentVO) g;
            if (oVar.mo121926u()) {
                UIUtils.show(bVar.mo122801a());
                UIUtils.hide(bVar.mo122802b());
                bVar.mo122801a().setTag(null);
                Object tag = bVar.mo122801a().getTag(R.id.translate_from_me_tag);
                if (tag == null || ((Boolean) tag).booleanValue() != cVar.mo121695c()) {
                    z = true;
                }
                if (!bVar.mo122801a().isAnimating() || z) {
                    bVar.mo122801a().setAnimation(C33360a.m129177u(cVar.mo121695c()));
                    bVar.mo122801a().playAnimation();
                }
                bVar.mo122801a().setTag(R.id.translate_from_me_tag, Boolean.valueOf(cVar.mo121695c()));
            } else {
                if (bVar.mo122801a().isAnimating()) {
                    bVar.mo122801a().cancelAnimation();
                }
                boolean z2 = AbstractC59357a.f147354c;
                if (z2) {
                    UIUtils.hide(bVar.mo122801a());
                } else {
                    UIUtils.hide(bVar.mo122802b());
                }
                if (!C35247g.m137634b(oVar)) {
                    bVar.mo122801a().setTag(R.id.translate_show_origin_tag, true);
                    bVar.mo122801a().setImageResource(R.drawable.ic_translate_show_origin_for_others);
                    if (!z2) {
                        UIUtils.show(bVar.mo122801a());
                    } else if (!(oVar instanceof BaseTextContentVO) || C34438a.m133580a((BaseTextContent) ((BaseTextContentVO) oVar).mo126168z())) {
                        UIUtils.hide(bVar.mo122802b());
                    } else {
                        UIUtils.show(bVar.mo122802b());
                    }
                } else if (cVar.mo121695c() && !cVar.mo124242O() && oVar.mo121928w()) {
                    bVar.mo122801a().setTag(R.id.translate_show_origin_tag, false);
                    bVar.mo122801a().setImageResource(R.drawable.ic_translate_preview_tag);
                    if (z2) {
                        UIUtils.show(bVar.mo122802b());
                    } else {
                        UIUtils.show(bVar.mo122801a());
                    }
                } else if (z2) {
                    UIUtils.hide(bVar.mo122802b());
                } else {
                    UIUtils.hide(bVar.mo122801a());
                }
                bVar.mo122801a().setTag(cVar);
            }
            return true;
        }
    }
}
