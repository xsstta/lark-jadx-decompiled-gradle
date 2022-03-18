package com.ss.android.lark.chatwindow.view.sidemenu;

import android.content.Context;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;
import com.larksuite.component.ui.imageview.LKUIBadgeView;
import com.larksuite.component.ui.imageview.LKUIRoundedImageView2;
import com.larksuite.suite.R;
import com.ss.android.lark.desktopmode.C36512a;
import com.ss.android.lark.desktopmode.p1787a.C36516a;
import com.ss.android.lark.desktopmode.p1788b.p1791c.AbstractC36546c;
import com.ss.android.lark.desktopmode.utils.DesktopUtil;
import com.ss.android.lark.desktopmode.view.C36592a;
import com.ss.android.lark.image.ImageLoader;
import com.ss.android.lark.image.entity.C38824b;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.lark.widget.chat_function_view.ChatFunctionBadge;
import com.ss.android.lark.widget.chat_function_view.IChatFunctionBinder;
import com.ss.android.lark.widget.chat_function_view.IChatFunctionController;
import com.ss.android.lark.widget.chat_function_view.IChatFunctionItem;
import java.util.HashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\u0018\u0000 .2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0002./B\r\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0018\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u001aH\u0002J\u0018\u0010\u001b\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u001aH\u0002J\u0018\u0010\u001c\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u001aH\u0002J\b\u0010\u001d\u001a\u00020\u0017H\u0002J\b\u0010\u001e\u001a\u00020\u0017H\u0002J\u0018\u0010\u001f\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u001aH\u0016J\u0018\u0010 \u001a\u00020\u00022\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$H\u0016J\b\u0010%\u001a\u00020\u0017H\u0016J\u0014\u0010&\u001a\u00020\u00172\n\u0010'\u001a\u0006\u0012\u0002\b\u00030(H\u0016J\u0018\u0010)\u001a\u00020*2\u0006\u0010\u0018\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u001aH\u0016J\u0018\u0010+\u001a\u00020\u00172\u0006\u0010,\u001a\u00020\u000e2\u0006\u0010-\u001a\u00020\u0013H\u0002R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00100\u0012X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0015X\u000e¢\u0006\u0002\n\u0000¨\u00060"}, d2 = {"Lcom/ss/android/lark/chatwindow/view/sidemenu/DesktopSideMenuItemBinder;", "Lcom/ss/android/lark/widget/chat_function_view/IChatFunctionBinder;", "Lcom/ss/android/lark/chatwindow/view/sidemenu/DesktopSideMenuItemBinder$ViewHolder;", "Lcom/ss/android/lark/desktopmode/frame/drawer/ISideMenuView;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "chatFunctionController", "Lcom/ss/android/lark/widget/chat_function_view/IChatFunctionController;", "getChatFunctionController", "()Lcom/ss/android/lark/widget/chat_function_view/IChatFunctionController;", "setChatFunctionController", "(Lcom/ss/android/lark/widget/chat_function_view/IChatFunctionController;)V", "mCurSelectItem", "Landroid/view/View;", "mCurSelectItemId", "", "mFragmentToMenuMap", "", "", "mHoverTipsWindow", "Lcom/ss/android/lark/desktopmode/view/HoverTipsWindow;", "bindItemBadge", "", "viewHolder", "item", "Lcom/ss/android/lark/widget/chat_function_view/IChatFunctionItem;", "bindItemIcon", "bindOnHoverListener", "hideHoverWindow", "initDesktopFragmentToMenuMap", "onBindViewHolder", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "inflater", "Landroid/view/LayoutInflater;", "onDrawerClosed", "onDrawerOpened", "fragment", "Lcom/ss/android/lark/desktopmode/app/DesktopCompatFragment;", "onItemClicked", "", "showTipsWindow", "anchorView", "tips", "Companion", "ViewHolder", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.chatwindow.view.sidemenu.b */
public final class DesktopSideMenuItemBinder extends IChatFunctionBinder<ViewHolder> implements AbstractC36546c {

    /* renamed from: a */
    public static final Companion f91226a = new Companion(null);

    /* renamed from: b */
    private C36592a f91227b;

    /* renamed from: c */
    private int f91228c = -1;

    /* renamed from: d */
    private View f91229d;

    /* renamed from: e */
    private final Map<String, Integer> f91230e = new HashMap();

    /* renamed from: f */
    private IChatFunctionController f91231f;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ss/android/lark/chatwindow/view/sidemenu/DesktopSideMenuItemBinder$Companion;", "", "()V", "UN_SELECT_ID", "", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chatwindow.view.sidemenu.b$a */
    private static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\r\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lcom/ss/android/lark/chatwindow/view/sidemenu/DesktopSideMenuItemBinder$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", "(Landroid/view/View;)V", "badge", "Lcom/larksuite/component/ui/imageview/LKUIBadgeView;", "getBadge", "()Lcom/larksuite/component/ui/imageview/LKUIBadgeView;", "image", "Landroid/widget/ImageView;", "getImage", "()Landroid/widget/ImageView;", "label", "Landroid/widget/TextView;", "getLabel", "()Landroid/widget/TextView;", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chatwindow.view.sidemenu.b$b */
    public static final class ViewHolder extends RecyclerView.ViewHolder {

        /* renamed from: a */
        private final ImageView f91232a;

        /* renamed from: b */
        private final LKUIBadgeView f91233b;

        /* renamed from: c */
        private final TextView f91234c;

        /* renamed from: a */
        public final ImageView mo129902a() {
            return this.f91232a;
        }

        /* renamed from: b */
        public final LKUIBadgeView mo129903b() {
            return this.f91233b;
        }

        /* renamed from: c */
        public final TextView mo129904c() {
            return this.f91234c;
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public ViewHolder(View view) {
            super(view);
            Intrinsics.checkParameterIsNotNull(view, "itemView");
            LKUIRoundedImageView2 lKUIRoundedImageView2 = (LKUIRoundedImageView2) view.findViewById(R.id.image_side_menu);
            Intrinsics.checkExpressionValueIsNotNull(lKUIRoundedImageView2, "itemView.image_side_menu");
            this.f91232a = lKUIRoundedImageView2;
            LKUIBadgeView lKUIBadgeView = (LKUIBadgeView) view.findViewById(R.id.badgeView);
            Intrinsics.checkExpressionValueIsNotNull(lKUIBadgeView, "itemView.badgeView");
            this.f91233b = lKUIBadgeView;
            TextView textView = (TextView) view.findViewById(R.id.text_side_menu);
            Intrinsics.checkExpressionValueIsNotNull(textView, "itemView.text_side_menu");
            this.f91234c = textView;
        }
    }

    /* renamed from: d */
    private final void m137858d() {
        this.f91230e.put("ChatGroupSettingFragment", 4);
        this.f91230e.put("ChatP2pSettingFragment", 4);
    }

    /* renamed from: b */
    public final void mo129899b() {
        C36592a aVar = this.f91227b;
        if (aVar != null && aVar.isShowing()) {
            aVar.dismiss();
            this.f91227b = null;
        }
    }

    @Override // com.ss.android.lark.desktopmode.p1788b.p1791c.AbstractC36546c
    /* renamed from: a */
    public void mo129894a() {
        if (DesktopUtil.m144301a(mo197618c())) {
            View view = this.f91229d;
            if (view != null) {
                if (view != null) {
                    view.setSelected(false);
                }
                this.f91229d = null;
            }
            this.f91228c = -1;
        }
    }

    /* renamed from: a */
    public final void mo129898a(IChatFunctionController cVar) {
        this.f91231f = cVar;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DesktopSideMenuItemBinder(Context context) {
        super(context);
        Intrinsics.checkParameterIsNotNull(context, "context");
        m137858d();
    }

    @Override // com.ss.android.lark.desktopmode.p1788b.p1791c.AbstractC36546c
    /* renamed from: a */
    public void mo129897a(C36516a<?> aVar) {
        Integer num;
        View a;
        ImageView imageView;
        View view;
        Intrinsics.checkParameterIsNotNull(aVar, "fragment");
        if (DesktopUtil.m144301a(mo197618c()) && (num = this.f91230e.get(aVar.getClass().getSimpleName())) != null) {
            int intValue = num.intValue();
            IChatFunctionController cVar = this.f91231f;
            if (cVar != null && (a = cVar.mo127556a(intValue)) != null && (imageView = (ImageView) a.findViewById(R.id.image_side_menu)) != null && (view = this.f91229d) != imageView) {
                if (view != null) {
                    view.setSelected(false);
                }
                imageView.setSelected(true);
                this.f91228c = intValue;
                this.f91229d = imageView;
            }
        }
    }

    /* renamed from: e */
    private final void m137860e(ViewHolder bVar, IChatFunctionItem dVar) {
        bVar.mo129902a().setOnHoverListener(new View$OnHoverListenerC35303c(this, bVar, dVar));
    }

    /* renamed from: a */
    public ViewHolder mo127552b(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        Intrinsics.checkParameterIsNotNull(viewGroup, "parent");
        Intrinsics.checkParameterIsNotNull(layoutInflater, "inflater");
        View inflate = layoutInflater.inflate(R.layout.item_side_menu_desktop, viewGroup, false);
        Intrinsics.checkExpressionValueIsNotNull(inflate, "inflater.inflate(R.layou…u_desktop, parent, false)");
        return new ViewHolder(inflate);
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u00010\u00060\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "v", "Landroid/view/View;", "kotlin.jvm.PlatformType", "event", "Landroid/view/MotionEvent;", "onHover"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chatwindow.view.sidemenu.b$c */
    public static final class View$OnHoverListenerC35303c implements View.OnHoverListener {

        /* renamed from: a */
        final /* synthetic */ DesktopSideMenuItemBinder f91235a;

        /* renamed from: b */
        final /* synthetic */ ViewHolder f91236b;

        /* renamed from: c */
        final /* synthetic */ IChatFunctionItem f91237c;

        View$OnHoverListenerC35303c(DesktopSideMenuItemBinder bVar, ViewHolder bVar2, IChatFunctionItem dVar) {
            this.f91235a = bVar;
            this.f91236b = bVar2;
            this.f91237c = dVar;
        }

        public final boolean onHover(View view, MotionEvent motionEvent) {
            Intrinsics.checkExpressionValueIsNotNull(view, "v");
            if (view.isSelected()) {
                this.f91236b.mo129902a().setColorFilter((ColorFilter) null);
                return true;
            }
            Intrinsics.checkExpressionValueIsNotNull(motionEvent, "event");
            int action = motionEvent.getAction();
            if (action == 9) {
                this.f91235a.mo129899b();
                this.f91236b.mo129902a().setColorFilter(ContextCompat.getColor(view.getContext(), R.color.lkui_B500), PorterDuff.Mode.SRC_ATOP);
                DesktopSideMenuItemBinder bVar = this.f91235a;
                View view2 = this.f91236b.itemView;
                Intrinsics.checkExpressionValueIsNotNull(view2, "viewHolder.itemView");
                bVar.mo129895a(view2, this.f91237c.mo127576d());
            } else if (action == 10) {
                this.f91236b.mo129902a().setColorFilter((ColorFilter) null);
                this.f91235a.mo129899b();
            }
            return true;
        }
    }

    /* renamed from: c */
    private final void m137857c(ViewHolder bVar, IChatFunctionItem dVar) {
        if (dVar.mo127579g() >= 0) {
            bVar.mo129902a().setImageResource(dVar.mo127579g());
            return;
        }
        String e = dVar.mo127577e();
        if (e != null) {
            ImageLoader.with(mo197618c()).load(new C38824b(e)).override(UIHelper.dp2px(mo197618c().getResources().getDimension(R.dimen.chat_icon_desktop)), UIHelper.dp2px(mo197618c().getResources().getDimension(R.dimen.chat_icon_desktop))).into(bVar.mo129902a());
        }
    }

    /* renamed from: d */
    private final void m137859d(ViewHolder bVar, IChatFunctionItem dVar) {
        ChatFunctionBadge b = dVar.mo127574b();
        if (b == null) {
            return;
        }
        if (b.mo197616c() != 0) {
            bVar.mo129903b().setVisibility(0);
            bVar.mo129903b().mo89319a(String.valueOf(b.mo197616c())).mo89316a(12.0f).mo89317a(UIHelper.getColor(R.color.lkui_N00)).mo89322b(b.mo197611a()).mo89320a();
            return;
        }
        ChatFunctionBadge b2 = dVar.mo127574b();
        if (b2 == null || !b2.mo197615b()) {
            bVar.mo129903b().setVisibility(4);
            return;
        }
        bVar.mo129903b().setVisibility(0);
        bVar.mo129903b().mo89322b(b.mo197611a()).mo89320a();
    }

    /* renamed from: a */
    public final void mo129895a(View view, String str) {
        C36592a a = new C36592a.C36593a().mo135002a(str).mo135003a(mo197618c());
        this.f91227b = a;
        if (a != null) {
            a.mo135000b(view);
        }
    }

    /* renamed from: b */
    public boolean mo129900b(ViewHolder bVar, IChatFunctionItem dVar) {
        Intrinsics.checkParameterIsNotNull(bVar, "viewHolder");
        Intrinsics.checkParameterIsNotNull(dVar, "item");
        if (DesktopUtil.m144301a(mo197618c())) {
            if (this.f91228c == dVar.mo127572a()) {
                C36512a.m144041a().mo134775c();
                bVar.mo129902a().setSelected(false);
                this.f91228c = -1;
                this.f91229d = null;
                return false;
            }
            View view = this.f91229d;
            if (view != null) {
                if (view == null) {
                    Intrinsics.throwNpe();
                }
                view.setSelected(false);
                View view2 = this.f91229d;
                if (view2 instanceof ImageView) {
                    if (view2 != null) {
                        ((ImageView) view2).setColorFilter((ColorFilter) null);
                    } else {
                        throw new TypeCastException("null cannot be cast to non-null type android.widget.ImageView");
                    }
                }
            }
            this.f91229d = bVar.mo129902a();
            this.f91228c = dVar.mo127572a();
            bVar.mo129902a().setSelected(true);
            mo129899b();
        }
        return super.mo129900b((RecyclerView.ViewHolder) bVar, dVar);
    }

    /* renamed from: a */
    public void mo127550a(ViewHolder bVar, IChatFunctionItem dVar) {
        Intrinsics.checkParameterIsNotNull(bVar, "viewHolder");
        Intrinsics.checkParameterIsNotNull(dVar, "item");
        bVar.mo129904c().setText(dVar.mo127576d());
        m137857c(bVar, dVar);
        m137859d(bVar, dVar);
        m137860e(bVar, dVar);
    }
}
