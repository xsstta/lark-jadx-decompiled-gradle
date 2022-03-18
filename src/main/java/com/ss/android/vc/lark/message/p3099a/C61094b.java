package com.ss.android.vc.lark.message.p3099a;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.larksuite.suite.R;
import com.ss.android.lark.chat.export.entity.chatter.OpenChatter;
import com.ss.android.lark.chat.export.entity.message.content.SystemMessageType;
import com.ss.android.lark.chat.export.ui.menu.OpenMenuDataHolder;
import com.ss.android.lark.chat.export.ui.message.IMessageContext;
import com.ss.android.lark.chat.export.ui.message.IOpenMessageCell;
import com.ss.android.lark.chat.export.ui.message.style.BubbleStyle;
import com.ss.android.lark.chat.export.ui.message.style.C34034b;
import com.ss.android.lark.chat.export.ui.message.style.C34035c;
import com.ss.android.lark.chat.export.ui.message.style.IOpenBubbleStyleProvider;
import com.ss.android.lark.chat.export.ui.p1672b.C34029b;
import com.ss.android.lark.chat.export.vo.OpenMessageVO;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.lark.widget.linked_emojicon.widget.LinkEmojiTextView;
import com.ss.android.lark.widget.span.RecogniseSpansResult;
import com.ss.android.vc.common.p3083e.C60738ac;
import com.ss.android.vc.common.p3083e.C60773o;
import com.ss.android.vc.dependency.VideoChatModuleDependency;
import com.ss.android.vc.service.C63634c;
import java.util.List;

/* renamed from: com.ss.android.vc.lark.message.a.b */
public class C61094b implements IOpenMessageCell<VOIPSysContentVO>, IOpenBubbleStyleProvider<VOIPSysContentVO> {

    /* renamed from: a */
    private static final int f153009a = UIHelper.dp2px(12.0f);

    /* renamed from: b */
    private static final int f153010b = UIHelper.dp2px(12.0f);

    /* renamed from: c */
    private static final int f153011c = UIHelper.dp2px(8.0f);

    /* renamed from: d */
    private final IMessageContext f153012d;

    @Override // com.ss.android.lark.chat.export.ui.message.IOpenMessageCell
    /* renamed from: a */
    public void mo120410a(View view) {
    }

    /* renamed from: a */
    public void mo211340a(List<C34029b> list, OpenMenuDataHolder<VOIPSysContentVO> cVar) {
    }

    /* renamed from: a */
    public boolean mo120415a(C34029b bVar, OpenMenuDataHolder<VOIPSysContentVO> cVar) {
        return false;
    }

    @Override // com.ss.android.lark.chat.export.ui.message.style.IOpenBubbleStyleProvider
    /* renamed from: b */
    public C34035c mo120416b(OpenMessageVO<VOIPSysContentVO> cVar) {
        return null;
    }

    @Override // com.ss.android.lark.chat.export.ui.message.IOpenMessageCell
    /* renamed from: a */
    public Class<VOIPSysContentVO> mo120409a() {
        return VOIPSysContentVO.class;
    }

    public C61094b(IMessageContext aVar) {
        this.f153012d = aVar;
    }

    @Override // com.ss.android.lark.chat.export.ui.message.style.IOpenBubbleStyleProvider
    /* renamed from: a */
    public C34034b mo120408a(OpenMessageVO<VOIPSysContentVO> cVar) {
        int i;
        if (cVar.mo121695c()) {
            i = 3;
        } else {
            i = 2;
        }
        return C34034b.m131984b(i);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.vc.lark.message.a.b$a */
    public static class C61096a {

        /* renamed from: a */
        public LinkEmojiTextView f153016a;

        /* renamed from: b */
        public ImageView f153017b;

        /* renamed from: c */
        public TextView f153018c;

        /* renamed from: d */
        public LinearLayout f153019d;

        /* renamed from: e */
        public final View f153020e;

        private C61096a(View view) {
            this.f153020e = view;
            this.f153016a = (LinkEmojiTextView) view.findViewById(R.id.call_info);
            this.f153018c = (TextView) view.findViewById(R.id.call_tv);
            this.f153017b = (ImageView) view.findViewById(R.id.call_icon);
            this.f153019d = (LinearLayout) view.findViewById(R.id.call_layout);
            view.setTag(this);
        }

        /* renamed from: a */
        public static C61096a m237607a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
            return new C61096a(layoutInflater.inflate(R.layout.vc_voip_system_content_item, viewGroup, false));
        }
    }

    @Override // com.ss.android.lark.chat.export.ui.message.IOpenMessageCell
    /* renamed from: a */
    public View mo120406a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return C61096a.m237607a(layoutInflater, viewGroup).f153020e;
    }

    /* renamed from: a */
    private void m237593a(C61096a aVar, OpenMessageVO<VOIPSysContentVO> cVar) {
        if (cVar.mo121695c()) {
            aVar.f153018c.getPaint().setFlags(aVar.f153018c.getPaint().getFlags() & -9);
        } else {
            aVar.f153018c.getPaint().setFlags(aVar.f153018c.getPaint().getFlags() & -9);
        }
        aVar.f153016a.setTextColor(C60773o.m236126d(R.color.ud_N500));
        aVar.f153018c.setTextColor(C60773o.m236126d(R.color.ud_B700));
        aVar.f153017b.setImageDrawable(C60773o.m236128f(R.drawable.icon_voip_call_blue));
        aVar.f153016a.setAtTextColor(R.color.ud_B700);
    }

    @Override // com.ss.android.lark.chat.export.ui.message.style.IOpenBubbleStyleProvider
    /* renamed from: a */
    public BubbleStyle mo120407a(OpenMessageVO<VOIPSysContentVO> cVar, View view) {
        int i = !cVar.mo121695c() ? 1 : 0;
        int[] iArr = new int[4];
        int i2 = f153010b;
        iArr[0] = i2;
        int i3 = f153011c;
        iArr[1] = i3;
        iArr[2] = i2;
        if (cVar.ah()) {
            i3 = f153009a;
        }
        iArr[3] = i3;
        return BubbleStyle.m131964a(i, (View) null, iArr);
    }

    @Override // com.ss.android.lark.chat.export.ui.p1672b.AbstractC34028a
    /* renamed from: a */
    public /* bridge */ /* synthetic */ void mo120413a(List list, Object obj) {
        mo211340a((List<C34029b>) list, (OpenMenuDataHolder) obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ void m237592a(VOIPSysContentVO aVar, Context context, View view) {
        OpenChatter d = aVar.mo211338d();
        if (d != null) {
            if (d.isDimission()) {
                C60738ac.m236023a((int) R.string.Lark_Legacy_ChatterResignPermissionPhone);
            } else if (C63634c.m249496b("byteview.call.encrypted.android") && context != null && (context instanceof Activity)) {
                VideoChatModuleDependency.getDependency().showVoIpCallDialog((Activity) context, d);
            }
        }
    }

    @Override // com.ss.android.lark.chat.export.ui.message.IOpenMessageCell
    /* renamed from: a */
    public void mo120411a(View view, int i, final OpenMessageVO<VOIPSysContentVO> cVar) {
        int i2;
        final Context context = view.getContext();
        C61096a aVar = (C61096a) view.getTag();
        VOIPSysContentVO g = cVar.mo121699g();
        boolean b = g.mo211336b();
        boolean c = g.mo211337c();
        m237593a(aVar, cVar);
        TextView textView = aVar.f153018c;
        if (b) {
            i2 = R.string.Lark_View_CallAgain;
        } else {
            i2 = R.string.Lark_View_CallBack;
        }
        textView.setText(context.getString(i2));
        SystemMessageType a = g.mo211335a();
        if (a == SystemMessageType.USER_CALL_E2EE_VOICE_DURATION) {
            aVar.f153019d.setVisibility(8);
            aVar.f153016a.setText(g.mo211339e());
        } else if (a == SystemMessageType.USER_CALL_E2EE_VOICE_ON_CANCELL) {
            aVar.f153016a.mo198363a((RecogniseSpansResult) null, context.getString(R.string.Lark_View_Canceled), c);
            aVar.f153019d.setVisibility(0);
        } else if (a == SystemMessageType.USER_CALL_E2EE_VOICE_ON_MISSING) {
            aVar.f153016a.mo198363a((RecogniseSpansResult) null, context.getString(R.string.Lark_View_NoResponse), c);
            aVar.f153019d.setVisibility(0);
        } else if (a == SystemMessageType.USER_CALL_E2EE_VOICE_WHEN_REFUSED) {
            aVar.f153016a.mo198363a((RecogniseSpansResult) null, context.getString(R.string.Lark_View_Declined), c);
            aVar.f153019d.setVisibility(0);
        } else if (a == SystemMessageType.USER_CALL_E2EE_VOICE_WHEN_OCCUPY) {
            aVar.f153016a.mo198363a((RecogniseSpansResult) null, context.getString(R.string.Lark_View_Unavailable), c);
            aVar.f153019d.setVisibility(0);
        }
        aVar.f153016a.setAtStringClickListner(new LinkEmojiTextView.AbstractC58521f() {
            /* class com.ss.android.vc.lark.message.p3099a.C61094b.C610951 */

            @Override // com.ss.android.lark.widget.linked_emojicon.widget.LinkEmojiTextView.AbstractC58521f
            /* renamed from: b */
            public boolean mo117507b(View view, String str, String str2) {
                return false;
            }

            @Override // com.ss.android.lark.widget.linked_emojicon.widget.LinkEmojiTextView.AbstractC58521f
            /* renamed from: c */
            public void mo120297c(View view, String str, String str2) {
                VideoChatModuleDependency.getDependency().startContactsProfileActivityByChatterId(context, str2, cVar.mo121692b());
            }
        });
        aVar.f153019d.setOnClickListener(new View.OnClickListener(context) {
            /* class com.ss.android.vc.lark.message.p3099a.$$Lambda$b$rgO35r9tO99PIz1o_kyx7nK9as */
            public final /* synthetic */ Context f$1;

            {
                this.f$1 = r2;
            }

            public final void onClick(View view) {
                C61094b.m271162lambda$rgO35r9tO99PIz1o_kyx7nK9as(VOIPSysContentVO.this, this.f$1, view);
            }
        });
    }
}
