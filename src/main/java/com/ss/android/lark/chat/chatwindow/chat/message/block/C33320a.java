package com.ss.android.lark.chat.chatwindow.chat.message.block;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.FragmentActivity;
import com.larksuite.component.ui.display.manager.C25649b;
import com.larksuite.component.ui.display.manager.LKUIDisplayManager;
import com.larksuite.component.ui.display.manager.LarkFont;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.C29990c;
import com.ss.android.lark.chat.chatwindow.chat.message.AbstractC33342d;
import com.ss.android.lark.chat.chatwindow.chat.message.block.C33320a;
import com.ss.android.lark.chat.chatwindow.chat.message.p1624a.AbstractC33305o;
import com.ss.android.lark.chat.drawable.VerticalAlignImageSpan;
import com.ss.android.lark.chat.entity.message.Pin;
import com.ss.android.lark.chat.utils.C34339g;
import com.ss.android.lark.chat.utils.C34357v;
import com.ss.android.lark.chat.vo.ChatMessageVO;
import com.ss.android.lark.chatwindow.C35247g;
import com.ss.android.lark.dependency.AbstractC36503q;
import com.ss.android.lark.desktopmode.utils.DesktopUtil;
import com.ss.android.lark.ding.entity.DingStatus;
import com.ss.android.lark.dto.chat.ProfileSource;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.lark.widget.listener.C58546g;
import com.ss.android.lark.widget.recyclerview.hive.AbstractC59004b;
import com.ss.android.lark.widget.recyclerview.hive.AbstractC59010e;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/* renamed from: com.ss.android.lark.chat.chatwindow.chat.message.block.a */
public class C33320a extends AbstractC59004b<ChatMessageVO, C33322a> {

    /* renamed from: a */
    public final AbstractC33342d f85834a;

    /* renamed from: b */
    private final AbstractC33305o f85835b;

    /* renamed from: c */
    private final AbstractC36503q f85836c = C29990c.m110930b().mo134586n();

    @Override // com.ss.android.lark.widget.recyclerview.hive.AbstractC59004b
    /* renamed from: c */
    public int mo122651c() {
        return 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.lark.chat.chatwindow.chat.message.block.a$a */
    public static class C33322a extends AbstractC59010e {

        /* renamed from: a */
        public TextView f85840a;

        /* renamed from: b */
        public TextView f85841b;

        /* renamed from: c */
        public TextView f85842c;

        /* renamed from: d */
        public TextView f85843d;

        C33322a() {
        }

        /* renamed from: a */
        private void m129008a() {
            if (!DesktopUtil.m144307b()) {
                C25649b.m91857a(this.f85840a, LarkFont.CAPTION0);
                C25649b.m91857a(this.f85841b, LarkFont.CAPTION0);
                C25649b.m91857a(this.f85842c, LarkFont.CAPTION0);
                C25649b.m91857a(this.f85843d, LarkFont.CAPTION0);
            }
        }

        /* renamed from: a */
        private void m129009a(Context context) {
            int c = LKUIDisplayManager.m91881c(context, 12);
            Drawable drawable = UIUtils.getDrawable(context, R.drawable.ic_svg_message_tag_reply);
            drawable.setBounds(0, 0, c, c);
            this.f85840a.setCompoundDrawables(drawable, null, null, null);
            Drawable drawable2 = UIUtils.getDrawable(context, R.drawable.ic_svg_message_tag_forward);
            drawable2.setBounds(0, 0, c, c);
            this.f85842c.setCompoundDrawables(drawable2, null, null, null);
        }

        /* access modifiers changed from: protected */
        @Override // com.ss.android.lark.widget.recyclerview.hive.AbstractC59010e
        /* renamed from: a */
        public void mo122652a(View view) {
            this.f85840a = (TextView) view.findViewById(R.id.tv_reply_num);
            this.f85841b = (TextView) view.findViewById(R.id.chat_message_pin_desc);
            this.f85842c = (TextView) view.findViewById(R.id.chat_message_forward_desc);
            this.f85843d = (TextView) view.findViewById(R.id.chat_message_ding_desc);
            m129008a();
            m129009a(view.getContext());
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.widget.recyclerview.hive.AbstractC59004b
    /* renamed from: b */
    public Class<C33322a> mo122650b() {
        return C33322a.class;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public Context mo122719d() {
        return this.f85834a.mo122543g();
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m128996a(ChatMessageVO cVar, View view) {
        AbstractC33305o oVar = this.f85835b;
        if (oVar != null) {
            oVar.mo122776q(cVar.mo121681a());
        }
    }

    public C33320a(AbstractC33342d dVar, AbstractC33305o oVar) {
        this.f85834a = dVar;
        this.f85835b = oVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo122649a(C33322a aVar, ChatMessageVO cVar) {
        m128997b(aVar, cVar);
        m128998c(aVar, cVar);
        m128999d(aVar, cVar);
        m129000e(aVar, cVar);
    }

    /* renamed from: b */
    private void m128997b(C33322a aVar, ChatMessageVO cVar) {
        int w = cVar.mo121715w();
        if (w > 0) {
            if (w == 1) {
                aVar.f85840a.setText(UIHelper.mustacheFormat((int) R.string.Lark_Legacy_ChatNumReplySinglular, "count", Integer.toString(w)));
            } else {
                aVar.f85840a.setText(UIHelper.mustacheFormat((int) R.string.Lark_Legacy_ChatNumReplyPlural, "count", Integer.toString(w)));
            }
            aVar.f85840a.setVisibility(0);
            aVar.f85840a.setOnClickListener(new View.OnClickListener(cVar) {
                /* class com.ss.android.lark.chat.chatwindow.chat.message.block.$$Lambda$a$422AIHadCRqRIzWoJ5YUUkvuaA */
                public final /* synthetic */ ChatMessageVO f$1;

                {
                    this.f$1 = r2;
                }

                public final void onClick(View view) {
                    C33320a.this.m128996a((C33320a) this.f$1, (ChatMessageVO) view);
                }
            });
            return;
        }
        aVar.f85840a.setVisibility(8);
    }

    /* renamed from: c */
    private void m128998c(C33322a aVar, ChatMessageVO cVar) {
        String str;
        Pin E = cVar.mo121659E();
        if (!cVar.mo124242O() || E == null) {
            aVar.f85841b.setVisibility(8);
            return;
        }
        aVar.f85841b.setVisibility(0);
        if (this.f85834a.mo122540d()) {
            str = UIHelper.mustacheFormat((int) R.string.Lark_Pin_PinDiscriptionInGroup, "user", E.getOperatorDisplayName());
        } else {
            str = UIHelper.mustacheFormat((int) R.string.Lark_Pin_PinDiscriptionInSingleChat, "user", E.getOperatorDisplayName());
        }
        aVar.f85841b.setText(str);
    }

    /* renamed from: d */
    private void m128999d(C33322a aVar, ChatMessageVO cVar) {
        String str;
        if (!cVar.mo124242O() || cVar.ad() == null || !this.f85836c.mo134685a("lark.overseas.forward")) {
            aVar.f85842c.setVisibility(8);
            return;
        }
        Context d = mo122719d();
        String string = UIHelper.getString(R.string.Lark_Chat_MessageForward);
        String g = cVar.ad().mo124214g();
        if (!cVar.af() || cVar.ad().mo124230r()) {
            str = "";
        } else {
            str = cVar.ae();
        }
        SpannableStringBuilder a = C34357v.m133267a(d, string, "{{name}}", g, str, this.f85834a.mo122544h());
        aVar.f85842c.setMovementMethod(LinkMovementMethod.getInstance());
        aVar.f85842c.setVisibility(0);
        aVar.f85842c.setText(a);
    }

    /* renamed from: e */
    private void m129000e(C33322a aVar, ChatMessageVO cVar) {
        DingStatus W = cVar.mo124250W();
        if (!cVar.mo124247T() || W == null) {
            aVar.f85843d.setVisibility(8);
            return;
        }
        FragmentActivity g = this.f85834a.mo122543g();
        if (W.getConfirmedChatterIds().size() + W.getUnconfirmedChatterIds().size() > 0) {
            aVar.f85843d.setVisibility(0);
            Map<String, String> chatterNameMap = W.getChatterNameMap();
            HashMap hashMap = new HashMap();
            if (chatterNameMap == null || chatterNameMap.isEmpty()) {
                Log.m165397w("MessageFooterBlock", "originChatterNameMap empty");
            } else {
                hashMap.putAll(chatterNameMap);
            }
            aVar.f85843d.post(new Runnable(g, aVar, hashMap, W, cVar) {
                /* class com.ss.android.lark.chat.chatwindow.chat.message.block.$$Lambda$a$gMlEo_Y4gFJVhwra6DsDsoDo0Q */
                public final /* synthetic */ Context f$1;
                public final /* synthetic */ C33320a.C33322a f$2;
                public final /* synthetic */ Map f$3;
                public final /* synthetic */ DingStatus f$4;
                public final /* synthetic */ ChatMessageVO f$5;

                {
                    this.f$1 = r2;
                    this.f$2 = r3;
                    this.f$3 = r4;
                    this.f$4 = r5;
                    this.f$5 = r6;
                }

                public final void run() {
                    C33320a.this.m128995a(this.f$1, this.f$2, this.f$3, this.f$4, this.f$5);
                }
            });
            return;
        }
        aVar.f85843d.setVisibility(8);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m128995a(Context context, final C33322a aVar, Map map, DingStatus dingStatus, final ChatMessageVO cVar) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(UIHelper.getString(R.string.Lark_Chat_BuzzMessageTip));
        Drawable drawable = ContextCompat.getDrawable(context, R.drawable.ic_svg_message_tag_urgent);
        int c = LKUIDisplayManager.m91881c(context, 12);
        drawable.setBounds(0, 0, c, c);
        Objects.requireNonNull(drawable);
        VerticalAlignImageSpan cVar2 = new VerticalAlignImageSpan(drawable);
        SpannableString spannableString = new SpannableString(" ");
        spannableString.setSpan(cVar2, 0, 1, 33);
        spannableStringBuilder.insert(0, (CharSequence) spannableString);
        spannableStringBuilder.append((CharSequence) " ");
        aVar.f85843d.setText(C34357v.m133263a(mo122719d(), spannableStringBuilder, aVar.f85843d.getPaint(), (float) (aVar.f85843d.getMeasuredWidth() - c), map, dingStatus.getConfirmedChatterIds(), new C34357v.AbstractC34364c() {
            /* class com.ss.android.lark.chat.chatwindow.chat.message.block.C33320a.C333211 */

            @Override // com.ss.android.lark.chat.utils.C34357v.AbstractC34364c
            /* renamed from: a */
            public void mo122812a() {
                ArrayList<String> a = C35247g.m137627a(cVar.mo121699g());
                if (DesktopUtil.m144301a(aVar.f85843d.getContext())) {
                    C58546g.m227072a().mo198455a(aVar.f85843d);
                }
                C29990c.m110930b().mo134539a(C33320a.this.mo122719d(), cVar.mo121692b(), cVar.mo121710r(), cVar.mo121681a(), a, true);
            }

            @Override // com.ss.android.lark.chat.utils.C34357v.AbstractC34364c
            /* renamed from: a */
            public void mo122813a(String str) {
                C29990c.m110930b().mo134523V().mo134436a(C33320a.this.mo122719d(), new ProfileSource.C36868a().mo136066c(str).mo136060a(2).mo136062a(C34339g.m133170d(C33320a.this.f85834a.mo122550n())).mo136063a());
            }
        }), TextView.BufferType.SPANNABLE);
        aVar.f85843d.setMovementMethod(LinkMovementMethod.getInstance());
    }
}
