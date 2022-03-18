package com.ss.android.lark.chat.chatwindow.chat.p1613b;

import android.graphics.Rect;
import android.view.View;
import android.widget.PopupWindow;
import com.larksuite.framework.utils.CollectionUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.chat.base.view.p1603a.AbstractC32926a;
import com.ss.android.lark.chat.base.view.p1603a.C32930d;
import com.ss.android.lark.chat.chatwindow.chat.C33240h;
import com.ss.android.lark.chat.entity.reaction.Reaction;
import com.ss.android.lark.chat.export.ui.p1672b.C34029b;
import com.ss.android.lark.chatwindow.p1723b.C35232a;
import com.ss.android.lark.chatwindow.p1723b.C35234b;
import com.ss.android.lark.desktopmode.utils.DesktopUtil;
import com.ss.android.lark.reaction.widget.panel.C53085d;
import com.ss.android.lark.reaction.widget.panel.ReactionPanelFacade;
import com.ss.android.lark.sdk.C53241h;
import com.ss.android.lark.statistics.message_menu.MessageMenuHitPoint;
import com.ss.android.lark.statistics.p2701o.C54970a;
import com.ss.android.lark.statistics.p2704r.C54984a;
import com.ss.android.lark.statistics.reaction.ReactionHitPoint;
import com.ss.android.lark.utils.UIHelper;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.lark.chat.chatwindow.chat.b.a */
public class C33088a implements AbstractC32926a {

    /* renamed from: a */
    private final C32930d.C32934c f85224a;

    /* renamed from: b */
    private ReactionPanelFacade f85225b;

    @Override // com.ss.android.lark.chat.base.view.p1603a.AbstractC32926a
    /* renamed from: b */
    public void mo121586b() {
        ReactionPanelFacade reactionPanelFacade = this.f85225b;
        if (reactionPanelFacade != null) {
            reactionPanelFacade.mo181300a();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public /* synthetic */ void m127966c() {
        C32930d.AbstractC32935d c = this.f85224a.mo121615c();
        if (c != null) {
            c.onDismiss();
        }
    }

    @Override // com.ss.android.lark.chat.base.view.p1603a.AbstractC32926a
    /* renamed from: a */
    public boolean mo121582a() {
        PopupWindow popupWindow;
        C32930d.C32934c cVar = this.f85224a;
        if (cVar == null || this.f85225b == null) {
            return false;
        }
        int[] j = cVar.mo121622j();
        if (j != null) {
            popupWindow = this.f85225b.mo181297a((float) j[0], (float) j[1]);
        } else {
            popupWindow = this.f85225b.mo181296a((float) this.f85224a.mo121619g());
        }
        C32930d.AbstractC32938g d = this.f85224a.mo121616d();
        if (d != null) {
            d.onShow(popupWindow);
        }
        C54984a.m213522a();
        return true;
    }

    public C33088a(C32930d.C32934c cVar) {
        this(cVar, null, false);
    }

    @Override // com.ss.android.lark.chat.base.view.p1603a.AbstractC32926a
    /* renamed from: a */
    public void mo121581a(View.OnHoverListener onHoverListener) {
        ReactionPanelFacade reactionPanelFacade = this.f85225b;
        if (reactionPanelFacade != null) {
            reactionPanelFacade.mo181301a(onHoverListener);
        }
    }

    @Override // com.ss.android.lark.chat.base.view.p1603a.AbstractC32926a
    /* renamed from: a */
    public boolean mo121584a(View view) {
        ReactionPanelFacade reactionPanelFacade;
        if (this.f85224a == null || (reactionPanelFacade = this.f85225b) == null) {
            return false;
        }
        PopupWindow a = reactionPanelFacade.mo181298a(view);
        C32930d.AbstractC32938g d = this.f85224a.mo121616d();
        if (d != null) {
            d.onShow(a);
        }
        C54984a.m213522a();
        return true;
    }

    /* renamed from: a */
    private boolean m127965a(List<C34029b> list) {
        if (C33240h.m128531a().mo122576c()) {
            return false;
        }
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).f87966a == 0) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    private List<C53085d> m127964a(C32930d.C32934c cVar) {
        if (!C33240h.m128531a().mo122576c()) {
            return C35232a.m137575a(cVar.mo121613a(), cVar.mo121617e());
        }
        ArrayList arrayList = new ArrayList();
        for (C34029b bVar : cVar.mo121617e()) {
            if (bVar instanceof C34029b) {
                C34029b bVar2 = bVar;
                if (bVar2.f87966a == 8 || bVar2.f87966a == 26) {
                    arrayList.add(bVar2);
                }
            }
        }
        if (!arrayList.isEmpty()) {
            return C35232a.m137575a(cVar.mo121613a(), arrayList);
        }
        C53241h.m205894a("ChatWindowMenuController", "partial selection is enabled but copying、search is disabled: " + cVar.mo121617e().toString());
        return C35232a.m137575a(cVar.mo121613a(), cVar.mo121617e());
    }

    @Override // com.ss.android.lark.chat.base.view.p1603a.AbstractC32926a
    /* renamed from: a */
    public boolean mo121583a(Rect rect) {
        ReactionPanelFacade reactionPanelFacade;
        if (this.f85224a == null || (reactionPanelFacade = this.f85225b) == null) {
            return false;
        }
        PopupWindow a = reactionPanelFacade.mo181297a((float) (rect.top + UIHelper.dp2px(11.0f)), (float) (rect.bottom - UIHelper.dp2px(11.0f)));
        C32930d.AbstractC32938g d = this.f85224a.mo121616d();
        if (d != null) {
            d.onShow(a);
        }
        C54984a.m213522a();
        return true;
    }

    /* renamed from: a */
    public void mo122251a(String str, int i) {
        C32930d.AbstractC32936e b = this.f85224a.mo121614b();
        if (b != null) {
            b.onMenuSelected(C34029b.m131930a().mo126135d(1).mo126129a(str).mo126136e(i).mo126131a());
        }
    }

    public C33088a(C32930d.C32934c cVar, List<Reaction> list, boolean z) {
        List<String> list2;
        List<String> list3;
        int i;
        this.f85224a = cVar;
        View f = cVar.mo121618f();
        if (f == null || CollectionUtils.isEmpty(cVar.mo121617e())) {
            C53241h.m205894a("ChatWindowMenuController", "AnchorView cannot be null");
            return;
        }
        boolean a = m127965a(cVar.mo121617e());
        ArrayList arrayList = new ArrayList();
        if (a) {
            list2 = C35234b.m137579e().mo121402b();
        } else {
            list2 = new ArrayList<>();
        }
        if (a) {
            list3 = C35234b.m137579e().mo121403c();
        } else {
            list3 = new ArrayList<>();
        }
        C330891 r5 = new ReactionPanelFacade.AbstractC53072b() {
            /* class com.ss.android.lark.chat.chatwindow.chat.p1613b.C33088a.C330891 */

            @Override // com.ss.android.lark.reaction.widget.panel.ReactionPanelFacade.AbstractC53072b
            /* renamed from: b */
            public void mo22765b() {
                ReactionHitPoint.f135903c.mo187701b();
            }

            @Override // com.ss.android.lark.reaction.widget.panel.ReactionPanelFacade.AbstractC53072b
            /* renamed from: a */
            public void mo22763a() {
                MessageMenuHitPoint.f135850a.mo187654j();
                C54970a.m213419a(0, true);
                ReactionHitPoint.f135903c.mo187697a();
            }

            @Override // com.ss.android.lark.reaction.widget.panel.ReactionPanelFacade.AbstractC53072b
            /* renamed from: a */
            public void mo22764a(String str, int i) {
                C54970a.m213419a(153, true);
                C33088a.this.mo122251a(str, i);
            }
        };
        if (!z || !CollectionUtils.isNotEmpty(list) || !a) {
            arrayList.addAll(list2);
        } else {
            for (int i2 = 0; i2 < list.size(); i2++) {
                arrayList.add(list.get(i2).getType());
            }
            if (CollectionUtils.isNotEmpty(list2)) {
                for (String str : list2) {
                    if (!arrayList.contains(str)) {
                        arrayList.add(str);
                    }
                    if (arrayList.size() == list2.size()) {
                        break;
                    }
                }
            }
        }
        if (DesktopUtil.m144301a(cVar.mo121613a())) {
            i = R.style.ReactionScrollableDialogStyle;
        } else {
            i = R.style.ReactionPanelAnimation;
        }
        ReactionPanelFacade a2 = new ReactionPanelFacade.C53071a(f).mo181315c(m127964a(cVar)).mo181309a(arrayList).mo181313b(list3).mo181308a(r5).mo181310a(cVar.mo121620h()).mo181314b(cVar.mo121621i()).mo181307a(i).mo181311a();
        this.f85225b = a2;
        a2.mo181302a(new PopupWindow.OnDismissListener() {
            /* class com.ss.android.lark.chat.chatwindow.chat.p1613b.$$Lambda$a$4_bR1Wipd16SE_sSWO5PJ8maiT4 */

            public final void onDismiss() {
                C33088a.this.m127966c();
            }
        });
    }

    @Override // com.ss.android.lark.chat.base.view.p1603a.AbstractC32926a
    /* renamed from: a */
    public boolean mo121585a(boolean z, int i, int i2, int i3) {
        ReactionPanelFacade reactionPanelFacade;
        if (this.f85224a == null || (reactionPanelFacade = this.f85225b) == null) {
            return false;
        }
        PopupWindow a = reactionPanelFacade.mo181299a(z, i, i2, i3);
        C32930d.AbstractC32938g d = this.f85224a.mo121616d();
        if (d != null) {
            d.onShow(a);
        }
        C54984a.m213522a();
        return true;
    }
}
