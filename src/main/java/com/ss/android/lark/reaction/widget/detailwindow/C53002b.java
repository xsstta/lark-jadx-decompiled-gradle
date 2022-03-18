package com.ss.android.lark.reaction.widget.detailwindow;

import android.app.Dialog;
import android.content.DialogInterface;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.fragment.app.DialogInterface$OnCancelListenerC1021b;
import androidx.fragment.app.FragmentManager;
import androidx.viewpager.widget.ViewPager;
import com.larksuite.suite.R;
import com.ss.android.lark.desktopmode.C36512a;
import com.ss.android.lark.desktopmode.base.FloatWindowParams;
import com.ss.android.lark.desktopmode.p1787a.C36516a;
import com.ss.android.lark.desktopmode.p1787a.C36517b;
import com.ss.android.lark.desktopmode.utils.DesktopUtil;
import com.ss.android.lark.reaction.widget.detailwindow.C53009e;
import com.ss.android.lark.reaction.widget.detailwindow.bean.ReactionDetailViewModel;
import com.ss.android.lark.reaction.widget.detailwindow.scroller.ScrollableLayout;
import java.util.ArrayList;
import java.util.List;
import net.lucode.hackware.magicindicator.MagicIndicator;

/* renamed from: com.ss.android.lark.reaction.widget.detailwindow.b */
public class C53002b extends DialogInterface$OnCancelListenerC1021b {

    /* renamed from: c */
    public View f130933c;

    /* renamed from: d */
    public C36516a f130934d;

    /* renamed from: e */
    public AbstractC53005b f130935e;

    /* renamed from: f */
    public AbstractC53004a f130936f;

    /* renamed from: g */
    C53009e.AbstractC53019d f130937g = new C53009e.AbstractC53019d() {
        /* class com.ss.android.lark.reaction.widget.detailwindow.C53002b.C530031 */

        @Override // com.ss.android.lark.reaction.widget.detailwindow.C53009e.AbstractC53019d
        /* renamed from: b */
        public void mo181052b() {
            C53002b.this.mo5513b();
        }

        @Override // com.ss.android.lark.reaction.widget.detailwindow.C53009e.AbstractC53019d
        /* renamed from: a */
        public void mo181048a() {
            if (C53002b.this.f130934d != null) {
                C53002b.this.f130934d.finish();
            }
        }

        @Override // com.ss.android.lark.reaction.widget.detailwindow.C53009e.AbstractC53019d
        /* renamed from: a */
        public void mo181050a(String str) {
            if (C53002b.this.f130935e != null) {
                C53002b.this.f130935e.onItemClicked(str);
            }
        }

        @Override // com.ss.android.lark.reaction.widget.detailwindow.C53009e.AbstractC53019d
        /* renamed from: b */
        public ReactionDetailViewModel mo181051b(String str) {
            if (C53002b.this.f130936f != null) {
                return C53002b.this.f130936f.mo166647a(str);
            }
            return null;
        }

        @Override // com.ss.android.lark.reaction.widget.detailwindow.C53009e.AbstractC53019d
        /* renamed from: a */
        public void mo181049a(C53009e eVar) {
            eVar.f130951b = (ScrollableLayout) C53002b.this.f130933c.findViewById(R.id.scrollable_layout);
            eVar.f130952c = C53002b.this.f130933c.findViewById(R.id.reaction_popup_placeholder);
            eVar.f130953d = (ViewGroup) C53002b.this.f130933c.findViewById(R.id.reaction_facade_title);
            eVar.f130954e = (ViewGroup) C53002b.this.f130933c.findViewById(R.id.reaction_facade_title_wrapper);
            eVar.f130955f = C53002b.this.f130933c.findViewById(R.id.reaction_facade_title_masker);
            eVar.f130956g = (ViewGroup) C53002b.this.f130933c.findViewById(R.id.reaction_facade_body);
            eVar.f130957h = (MagicIndicator) C53002b.this.f130933c.findViewById(R.id.reaction_facade_indicator);
            eVar.f130958i = (ViewPager) C53002b.this.f130933c.findViewById(R.id.reaction_facade_vp);
            eVar.f130959j = C53002b.this.f130933c.findViewById(R.id.reaction_facade_close);
            eVar.f130960k = (ViewGroup) C53002b.this.f130933c.findViewById(R.id.reaction_facade_title_desktop);
            eVar.f130961l = C53002b.this.f130933c.findViewById(R.id.reaction_facade_close_desktop);
        }
    };

    /* renamed from: h */
    private C53008d f130938h;

    /* renamed from: i */
    private LayoutInflater f130939i;

    /* renamed from: j */
    private DialogInterface.OnDismissListener f130940j;

    /* renamed from: com.ss.android.lark.reaction.widget.detailwindow.b$a */
    public interface AbstractC53004a {
        /* renamed from: a */
        ReactionDetailViewModel mo166647a(String str);
    }

    /* renamed from: com.ss.android.lark.reaction.widget.detailwindow.b$b */
    public interface AbstractC53005b {
        void onItemClicked(String str);
    }

    @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC1021b, androidx.fragment.app.Fragment
    public void onDestroyView() {
        C53008d dVar = this.f130938h;
        if (dVar != null) {
            dVar.mo181083b();
        }
        super.onDestroyView();
    }

    @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC1021b, androidx.fragment.app.Fragment
    public void onStart() {
        Window window;
        super.onStart();
        Dialog v_ = v_();
        if (v_ != null && (window = v_.getWindow()) != null) {
            window.setLayout(-1, -1);
            window.setBackgroundDrawable(new ColorDrawable(0));
        }
    }

    /* renamed from: f */
    private void m205275f() {
        C53008d dVar = new C53008d(new C53007c(getArguments()), new C53009e(this.f130937g, getContext(), this, this.f130939i));
        this.f130938h = dVar;
        dVar.mo181081a();
    }

    /* renamed from: a */
    public void mo181043a(DialogInterface.OnDismissListener onDismissListener) {
        this.f130940j = onDismissListener;
    }

    /* renamed from: a */
    public void mo181045a(AbstractC53004a aVar) {
        this.f130936f = aVar;
    }

    @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC1021b, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        mo5510a(1, R.style.ReactionScrollableDialogStyle);
    }

    @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC1021b
    public void onDismiss(DialogInterface dialogInterface) {
        DialogInterface.OnDismissListener onDismissListener = this.f130940j;
        if (onDismissListener != null) {
            onDismissListener.onDismiss(dialogInterface);
        }
        super.onDismiss(dialogInterface);
    }

    /* renamed from: a */
    public void mo181046a(AbstractC53005b bVar) {
        this.f130935e = bVar;
    }

    /* renamed from: a */
    public void mo181044a(FragmentManager fragmentManager) {
        if (!DesktopUtil.m144307b()) {
            mo5511a(fragmentManager, "ReactionPopupFacade");
            return;
        }
        FloatWindowParams a = new FloatWindowParams.C36567a().mo134930b();
        this.f130934d = C36517b.m144069a(this);
        C36512a.m144041a().mo134762a(this.f130934d, a);
    }

    /* renamed from: a */
    public void mo181047a(List<ReactionDetailViewModel> list) {
        C53008d dVar = this.f130938h;
        if (dVar != null) {
            dVar.mo181082a(list);
        }
    }

    /* renamed from: a */
    public static C53002b m205273a(List<ReactionDetailViewModel> list, String str) {
        return m205274a(list, str, false);
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        m205275f();
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f130939i = layoutInflater;
        View inflate = layoutInflater.inflate(R.layout.layout_reaction_detail_facade, viewGroup, false);
        this.f130933c = inflate;
        return inflate;
    }

    /* renamed from: a */
    public static C53002b m205274a(List<ReactionDetailViewModel> list, String str, boolean z) {
        C53002b bVar = new C53002b();
        Bundle bundle = new Bundle();
        bundle.putSerializable("reaction_info_list", new ArrayList(list));
        bundle.putString("reaction_opened_type", str);
        bundle.putBoolean("key_need_loading", z);
        bVar.setArguments(bundle);
        return bVar;
    }
}
