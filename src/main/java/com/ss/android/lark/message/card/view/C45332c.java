package com.ss.android.lark.message.card.view;

import android.app.Activity;
import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.component.ui.display.manager.C25649b;
import com.larksuite.component.ui.display.manager.LKUIDisplayManager;
import com.larksuite.component.ui.layout.LKUIRoundLinearLayout;
import com.larksuite.component.universe_design.color.UDColorUtils;
import com.larksuite.component.universe_design.icon.UDIconUtils;
import com.larksuite.framework.flyfish.core.ComponentTree;
import com.larksuite.suite.R;
import com.ss.android.lark.appreciablelib.Scene;
import com.ss.android.lark.chat.entity.message.content.CardContent;
import com.ss.android.lark.chat.export.ui.menu.OpenMenuDataHolder;
import com.ss.android.lark.chat.export.ui.message.IMessageContext;
import com.ss.android.lark.chat.export.ui.message.IOpenCellCallback;
import com.ss.android.lark.chat.export.ui.message.IOpenMessageCell;
import com.ss.android.lark.chat.export.ui.message.style.BubbleStyle;
import com.ss.android.lark.chat.export.ui.message.style.C34034b;
import com.ss.android.lark.chat.export.ui.message.style.C34035c;
import com.ss.android.lark.chat.export.ui.message.style.IOpenBubbleStyleProvider;
import com.ss.android.lark.chat.export.ui.p1672b.C34029b;
import com.ss.android.lark.chat.export.vo.OpenMessageVO;
import com.ss.android.lark.chat.open.message.AbstractC34073b;
import com.ss.android.lark.chat.p1593a.C32807a;
import com.ss.android.lark.chat.vo.AbsMessageVO;
import com.ss.android.lark.chat.vo.ChatMessageVO;
import com.ss.android.lark.desktopmode.utils.DesktopUtil;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.message.card.C45294c;
import com.ss.android.lark.message.card.p2264d.C45302a;
import com.ss.android.lark.message.card.p2264d.C45304b;
import com.ss.android.lark.message.card.p2267g.C45310a;
import com.ss.android.lark.message.card.view.CardMessageBinder;
import com.ss.android.lark.message.service.impl.CardPreload;
import com.ss.android.lark.opmonitor.service.OPMonitor;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.lark.widget.richtext.Image;
import com.ss.android.lark.widget.richtext.RichText;
import java.util.List;
import java.util.Map;

/* renamed from: com.ss.android.lark.message.card.view.c */
public class C45332c implements IOpenMessageCell<CardContentVO>, IOpenBubbleStyleProvider<CardContentVO>, AbstractC34073b<CardContentVO> {

    /* renamed from: b */
    private static final int f114771b = UIHelper.dp2px(3.0f);

    /* renamed from: a */
    public final IOpenCellCallback<CardContentVO> f114772a;

    /* renamed from: c */
    private final IMessageContext f114773c;

    /* renamed from: d */
    private boolean f114774d;

    @Override // com.ss.android.lark.chat.export.ui.message.IOpenMessageCell
    /* renamed from: a */
    public void mo120410a(View view) {
    }

    /* renamed from: a */
    public void mo160108a(List<C34029b> list, OpenMenuDataHolder<CardContentVO> cVar) {
    }

    @Override // com.ss.android.lark.chat.export.ui.message.IOpenMessageCell
    /* renamed from: a */
    public Class<CardContentVO> mo120409a() {
        return CardContentVO.class;
    }

    @Override // com.ss.android.lark.chat.export.ui.p1672b.AbstractC34028a
    /* renamed from: a */
    public /* bridge */ /* synthetic */ void mo120413a(List list, Object obj) {
        mo160108a((List<C34029b>) list, (OpenMenuDataHolder) obj);
    }

    @Override // com.ss.android.lark.chat.export.ui.message.IOpenMessageCell
    /* renamed from: a */
    public void mo120411a(final View view, int i, final OpenMessageVO<CardContentVO> cVar) {
        Scene scene;
        FragmentActivity g = this.f114773c.mo122543g();
        CardViewHolder a = CardViewHolder.m179942a(view);
        boolean a2 = CardViewHolder.m179943a(a);
        if (this.f114773c.mo122546j()) {
            scene = Scene.SecretChat;
        } else if (this.f114773c.mo122558v() || this.f114773c.mo122560x()) {
            scene = Scene.Thread;
        } else {
            scene = Scene.Chat;
        }
        CardMessageBinder.BindData a3 = CardMessageBinder.f114737f.mo160093a(cVar, this.f114773c.mo122540d(), scene);
        if (!a2 || cVar == null || !(g instanceof Activity) || a3 == null) {
            OPMonitor addCategoryValue = C45302a.m179899a(C45304b.f114700f).addCategoryValue("is_enable", Boolean.valueOf(a2));
            if (a3 == null) {
                addCategoryValue.setErrorMessage("bind data is null");
            }
            addCategoryValue.flush();
            return;
        }
        m179996a(a.getRootLayout(), cVar.ah());
        C45335e.m180022a((Context) g, cVar.mo121699g().mo160067d(), a.mo160062a(), false);
        CardMessageBinder bVar = new CardMessageBinder(g, a);
        C453331 r3 = new CardMessageBinder.IBinderCallBack() {
            /* class com.ss.android.lark.message.card.view.C45332c.C453331 */

            @Override // com.ss.android.lark.message.card.view.CardMessageBinder.IBinderCallBack
            /* renamed from: a */
            public void mo160094a(View view) {
                C45332c.this.f114772a.mo122833b(view, cVar);
            }

            @Override // com.ss.android.lark.message.card.view.CardMessageBinder.IBinderCallBack
            /* renamed from: a */
            public void mo160096a(boolean z) {
                if (z) {
                    C45332c.this.f114772a.mo122832a(cVar.mo121681a());
                }
            }

            @Override // com.ss.android.lark.message.card.view.CardMessageBinder.IBinderCallBack
            /* renamed from: a */
            public void mo160095a(View view, List<? extends Image> list, Image image) {
                C45332c.this.f114772a.mo122830a(view, list, image);
            }
        };
        if (m179999b()) {
            ComponentTree bVar2 = (ComponentTree) cVar.mo121699g().mo160072i();
            if (bVar2 != null) {
                CardMessageBinder.IBinderCallBack.Proxy aVar = (CardMessageBinder.IBinderCallBack.Proxy) bVar2.mo92403c();
                if (aVar != null) {
                    aVar.mo160097a(r3);
                }
                bVar.mo160075a(a.mRootLayout, a.f114725c, this.f114774d, bVar2);
            }
        } else {
            bVar.mo160073a(a3, Boolean.valueOf(this.f114774d)).mo160074a(r3);
        }
        m179997a(a, cVar);
        m179995a(a.mRootLayout, cVar);
        m179994a(g, cVar);
        m180000c(cVar);
    }

    /* renamed from: a */
    public boolean mo120415a(C34029b bVar, OpenMenuDataHolder<CardContentVO> cVar) {
        if (bVar.f87966a == 9) {
            return m179998a(cVar);
        }
        return (bVar.f87966a == 13 || bVar.f87966a == 11) ? false : true;
    }

    /* renamed from: b */
    private boolean m179999b() {
        if (this.f114774d || !C45294c.m179871a().mo143899a("chat.asyncmeasure.flyfish")) {
            return false;
        }
        return true;
    }

    /* renamed from: c */
    private void m180000c(OpenMessageVO<CardContentVO> cVar) {
        RichText c = cVar.mo121699g().mo160066c();
        if (c != null && c.getUrls() != null && !c.getUrls().isEmpty()) {
            C45294c.m179871a().mo143906g().mo143907a(c.getUrls());
        }
    }

    /* renamed from: a */
    private boolean m179998a(OpenMenuDataHolder<CardContentVO> cVar) {
        OpenMessageVO<CardContentVO> a = cVar.mo126137a();
        if (!C45294c.m179871a().mo143899a("messagecard.forward.enable")) {
            return false;
        }
        if (!(a instanceof ChatMessageVO) || !((ChatMessageVO) a).mo124248U()) {
            return a.mo121699g().mo160069f();
        }
        return false;
    }

    @Override // com.ss.android.lark.chat.export.ui.message.style.IOpenBubbleStyleProvider
    /* renamed from: b */
    public C34035c mo120416b(OpenMessageVO<CardContentVO> cVar) {
        CardContent.CardHeader d = cVar.mo121699g().mo160067d();
        if (d != null) {
            String theme = d.getTheme();
            if (C45310a.f114712a.containsKey(theme)) {
                int color = UIHelper.getColor(C45310a.f114712a.get(theme).f114715c);
                GradientDrawable gradientDrawable = new GradientDrawable();
                gradientDrawable.setColor(color);
                gradientDrawable.setCornerRadius((float) UIHelper.dp2px(50.0f));
                return C34035c.m131992a(color, color, gradientDrawable, null);
            }
            if (!TextUtils.isEmpty(theme)) {
                Log.m165389i("CardMessageCell", "msg card reply style find unsupported theme=" + theme);
            }
            Map<String, String> style = d.getStyle();
            if (style != null && style.containsKey("startColor") && style.containsKey("endColor")) {
                GradientDrawable gradientDrawable2 = new GradientDrawable();
                gradientDrawable2.setColor(C32807a.m125897C(cVar.mo121695c()));
                gradientDrawable2.setCornerRadius((float) UIHelper.dp2px(50.0f));
                return C34035c.m131993a(C32807a.m125896B(cVar.mo121695c()), gradientDrawable2);
            }
        }
        GradientDrawable gradientDrawable3 = new GradientDrawable();
        gradientDrawable3.setColor(C32807a.m125895A(cVar.mo121695c()));
        gradientDrawable3.setCornerRadius((float) UIHelper.dp2px(50.0f));
        return C34035c.m131993a(C32807a.m125902z(cVar.mo121695c()), gradientDrawable3);
    }

    @Override // com.ss.android.lark.chat.export.ui.message.style.IOpenBubbleStyleProvider
    /* renamed from: a */
    public C34034b mo120408a(OpenMessageVO<CardContentVO> cVar) {
        boolean z;
        if (cVar.mo121699g().mo160063a() == CardContent.Type.VCHAT) {
            z = true;
        } else {
            z = false;
        }
        C34034b a = C34034b.m131982a(0, 2);
        a.mo126155a(z);
        return a;
    }

    public C45332c(IMessageContext aVar, IOpenCellCallback<CardContentVO> bVar) {
        this(aVar, bVar, false);
    }

    /* renamed from: a */
    private void m179996a(LKUIRoundLinearLayout lKUIRoundLinearLayout, boolean z) {
        int i;
        if (lKUIRoundLinearLayout != null) {
            if (z) {
                i = 0;
            } else {
                i = 4;
            }
            float f = (float) i;
            lKUIRoundLinearLayout.mo89623a(4.0f, f, 4.0f, f);
        }
    }

    /* renamed from: a */
    private void m179997a(CardViewHolder cardViewHolder, OpenMessageVO<CardContentVO> cVar) {
        if (DesktopUtil.m144301a((Context) this.f114773c.mo122543g())) {
            cardViewHolder.getRootLayout().getLayoutParams().width = UIHelper.dp2px(300.0f);
        }
    }

    /* renamed from: a */
    private void m179994a(Context context, OpenMessageVO<CardContentVO> cVar) {
        CardContentVO g;
        CardContent.ExtraInfo e;
        if (this.f114773c.mo122558v() && (g = cVar.mo121699g()) != null && (e = g.mo160068e()) != null && e.isGadgetPreload()) {
            C45294c.m179871a().mo143894a(context);
        }
    }

    /* renamed from: a */
    private void m179995a(LKUIRoundLinearLayout lKUIRoundLinearLayout, OpenMessageVO<CardContentVO> cVar) {
        if (this.f114774d) {
            lKUIRoundLinearLayout.setBackgroundColor(UDColorUtils.getColor(lKUIRoundLinearLayout.getContext(), R.color.bg_float));
            CardContent.CardHeader d = cVar.mo121699g().mo160067d();
            if (d != null) {
                String theme = d.getTheme();
                if (C45310a.f114712a.containsKey(theme)) {
                    int color = UIHelper.getColor(C45310a.f114712a.get(theme).f114714b);
                    C45294c.m179871a().mo143897a(lKUIRoundLinearLayout, lKUIRoundLinearLayout.findViewById(R.id.header_container), new int[]{color, color});
                    return;
                }
                Map<String, String> style = d.getStyle();
                if (style != null && style.containsKey("startColor") && style.containsKey("endColor")) {
                    lKUIRoundLinearLayout.setBorderWidth(BitmapDescriptorFactory.HUE_RED);
                    int parseColor = Color.parseColor(style.get("startColor"));
                    int parseColor2 = Color.parseColor(style.get("endColor"));
                    C45294c.m179871a().mo143897a(lKUIRoundLinearLayout, lKUIRoundLinearLayout.findViewById(R.id.header_container), new int[]{parseColor, parseColor2});
                }
            }
        }
    }

    @Override // com.ss.android.lark.chat.export.ui.message.IOpenMessageCell
    /* renamed from: a */
    public View mo120406a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        CardPreload.f114933a.mo160210a();
        return CardViewHolder.m179941a(layoutInflater, viewGroup, m179999b()).itemView;
    }

    @Override // com.ss.android.lark.chat.export.ui.message.style.IOpenBubbleStyleProvider
    /* renamed from: a */
    public BubbleStyle mo120407a(OpenMessageVO<CardContentVO> cVar, View view) {
        CardContentVO g = cVar.mo121699g();
        CardContent.Type a = g.mo160063a();
        BubbleStyle a2 = C45335e.m180020a(view.getContext(), (CardContent) g.mo126168z(), view.findViewById(R.id.header_container));
        if ((cVar instanceof ChatMessageVO) && ((ChatMessageVO) cVar).mo124248U()) {
            a2.mo126146b(R.color.bg_body_overlay);
        }
        if (!DesktopUtil.m144301a((Context) this.f114773c.mo122543g()) && (a == CardContent.Type.VCHAT || a == CardContent.Type.TEXT)) {
            a2.mo126144a(true);
        }
        return a2;
    }

    public C45332c(IMessageContext aVar, IOpenCellCallback<CardContentVO> bVar, boolean z) {
        this.f114773c = aVar;
        this.f114772a = bVar;
        this.f114774d = z;
    }

    @Override // com.ss.android.lark.chat.open.message.AbstractC34073b
    /* renamed from: a */
    public View mo126239a(View view, FrameLayout frameLayout, AbsMessageVO<CardContentVO> aVar) {
        if (aVar instanceof ChatMessageVO) {
            ChatMessageVO cVar = (ChatMessageVO) aVar;
            int m = cVar.mo121705m();
            if (cVar.mo124248U() && (m == 0 || m == 1)) {
                CardViewHolder a = CardViewHolder.m179942a(view);
                if (a.f114724b == null) {
                    a.f114724b = new TextView(frameLayout.getContext());
                    FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
                    layoutParams.bottomMargin = f114771b;
                    a.f114724b.setLayoutParams(layoutParams);
                }
                a.f114724b.setText(R.string.Lark_Legacy_EphemeralVisibllity);
                a.f114724b.setTextColor(UIHelper.getResources().getColor(R.color.text_title));
                C25649b.m91856a(a.f114724b, 12);
                a.f114724b.setCompoundDrawablePadding(UIHelper.dp2px(3.0f));
                Drawable iconDrawable = UDIconUtils.getIconDrawable(view.getContext(), (int) R.drawable.card_msg_icon_visiable, UDColorUtils.getColor(view.getContext(), R.color.icon_n1));
                iconDrawable.setBounds(0, 0, LKUIDisplayManager.m91881c(frameLayout.getContext(), 16), LKUIDisplayManager.m91881c(frameLayout.getContext(), 16));
                a.f114724b.setCompoundDrawables(iconDrawable, null, null, null);
                return a.f114724b;
            }
        }
        return null;
    }
}
