package com.ss.android.lark.chatthread.view;

import android.graphics.drawable.BitmapDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;
import android.widget.TextView;
import com.larksuite.framework.ui.BasePopupWindow;
import com.larksuite.suite.R;
import com.ss.android.lark.chat.base.view.vo.message.BaseTextContentVO;
import com.ss.android.lark.chat.base.view.vo.message.PostContentVO;
import com.ss.android.lark.chat.chatwindow.chat.C33240h;
import com.ss.android.lark.chat.chatwindow.chat.message.AbstractC33342d;
import com.ss.android.lark.chat.chatwindow.chat.p1613b.p1615b.AbstractC33114c;
import com.ss.android.lark.chat.chatwindow.chat.p1613b.p1615b.C33101ac;
import com.ss.android.lark.chat.chatwindow.chat.p1613b.p1615b.C33140z;
import com.ss.android.lark.chat.vo.AbsMessageVO;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012B)\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0010\u0010\u0006\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\b0\u0007¢\u0006\u0002\u0010\tJ\u0006\u0010\u000e\u001a\u00020\u000fJ\u0012\u0010\u0010\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\b0\u000bH\u0002J\u0006\u0010\u0011\u001a\u00020\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u0018\u0010\n\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\b0\u000bX\u0004¢\u0006\u0002\n\u0000R\u0018\u0010\u0006\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\b0\u0007X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u000e¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lcom/ss/android/lark/chatthread/view/CopyMessagePopupWindow;", "", "anchorView", "Landroid/view/View;", "chatContext", "Lcom/ss/android/lark/chat/chatwindow/chat/message/IChatContext;", "messageVO", "Lcom/ss/android/lark/chat/vo/AbsMessageVO;", "Lcom/ss/android/lark/chat/base/view/vo/message/BaseTextContentVO;", "(Landroid/view/View;Lcom/ss/android/lark/chat/chatwindow/chat/message/IChatContext;Lcom/ss/android/lark/chat/vo/AbsMessageVO;)V", "menuCopyHandler", "Lcom/ss/android/lark/chat/chatwindow/chat/menu/handler/ICopyMenuHandler;", "popupWindowView", "Landroid/widget/PopupWindow;", "dismiss", "", "getCopyHandler", "show", "Companion", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.chatthread.view.e */
public final class CopyMessagePopupWindow {

    /* renamed from: c */
    public static final Companion f90916c = new Companion(null);

    /* renamed from: a */
    public final AbstractC33114c<BaseTextContentVO<?>> f90917a;

    /* renamed from: b */
    public final AbsMessageVO<BaseTextContentVO<?>> f90918b;

    /* renamed from: d */
    private PopupWindow f90919d;

    /* renamed from: e */
    private final View f90920e;

    /* renamed from: f */
    private final AbstractC33342d f90921f;

    @JvmStatic
    /* renamed from: a */
    public static final CopyMessagePopupWindow m137451a(View view, AbstractC33342d dVar, AbsMessageVO<BaseTextContentVO<?>> aVar) {
        return f90916c.mo129645a(view, dVar, aVar);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J*\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0010\u0010\t\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u000b0\nH\u0007¨\u0006\f"}, d2 = {"Lcom/ss/android/lark/chatthread/view/CopyMessagePopupWindow$Companion;", "", "()V", "obtain", "Lcom/ss/android/lark/chatthread/view/CopyMessagePopupWindow;", "anchorView", "Landroid/view/View;", "chatContext", "Lcom/ss/android/lark/chat/chatwindow/chat/message/IChatContext;", "messageVO", "Lcom/ss/android/lark/chat/vo/AbsMessageVO;", "Lcom/ss/android/lark/chat/base/view/vo/message/BaseTextContentVO;", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chatthread.view.e$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        /* renamed from: a */
        public final CopyMessagePopupWindow mo129645a(View view, AbstractC33342d dVar, AbsMessageVO<BaseTextContentVO<?>> aVar) {
            Intrinsics.checkParameterIsNotNull(view, "anchorView");
            Intrinsics.checkParameterIsNotNull(dVar, "chatContext");
            Intrinsics.checkParameterIsNotNull(aVar, "messageVO");
            return new CopyMessagePopupWindow(view, dVar, aVar, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "onDismiss"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chatthread.view.e$c */
    static final class C35202c implements PopupWindow.OnDismissListener {

        /* renamed from: a */
        public static final C35202c f90924a = new C35202c();

        C35202c() {
        }

        public final void onDismiss() {
            C33240h.m128531a().mo122575b();
        }
    }

    /* renamed from: b */
    public final void mo129644b() {
        PopupWindow popupWindow = this.f90919d;
        if (popupWindow != null) {
            popupWindow.dismiss();
        }
    }

    /* renamed from: c */
    private final AbstractC33114c<BaseTextContentVO<?>> m137452c() {
        if (this.f90918b.mo121699g() instanceof PostContentVO) {
            return new C33140z(this.f90920e.getContext());
        }
        return new C33101ac(this.f90920e.getContext());
    }

    /* renamed from: a */
    public final CopyMessagePopupWindow mo129643a() {
        CopyMessagePopupWindow eVar = this;
        View inflate = LayoutInflater.from(eVar.f90920e.getContext()).inflate(R.layout.chat_message_menu, (ViewGroup) null);
        Intrinsics.checkExpressionValueIsNotNull(inflate, "LayoutInflater.from(cont….chat_message_menu, null)");
        View findViewById = inflate.findViewById(R.id.copy);
        if (findViewById != null) {
            TextView textView = (TextView) findViewById;
            BasePopupWindow basePopupWindow = new BasePopupWindow(inflate, -2, -2, true);
            basePopupWindow.setTouchable(true);
            basePopupWindow.setOutsideTouchable(true);
            basePopupWindow.setFocusable(false);
            basePopupWindow.setBackgroundDrawable(new BitmapDrawable());
            inflate.measure(0, 0);
            int[] u = eVar.f90921f.mo122557u();
            if (u != null) {
                Intrinsics.checkExpressionValueIsNotNull(u, "chatContext.selectCoordinate() ?: return this");
                basePopupWindow.showAtLocation(eVar.f90920e, 0, u[2], u[0] - inflate.getMeasuredHeight());
                textView.setOnClickListener(new View$OnClickListenerC35201b(eVar, basePopupWindow));
                basePopupWindow.setOnDismissListener(C35202c.f90924a);
                eVar.f90919d = basePopupWindow;
            }
            return eVar;
        }
        throw new TypeCastException("null cannot be cast to non-null type android.widget.TextView");
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chatthread.view.e$b */
    static final class View$OnClickListenerC35201b implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ CopyMessagePopupWindow f90922a;

        /* renamed from: b */
        final /* synthetic */ BasePopupWindow f90923b;

        View$OnClickListenerC35201b(CopyMessagePopupWindow eVar, BasePopupWindow basePopupWindow) {
            this.f90922a = eVar;
            this.f90923b = basePopupWindow;
        }

        public final void onClick(View view) {
            this.f90922a.f90917a.mo122270a(this.f90922a.f90918b);
            this.f90923b.dismiss();
        }
    }

    private CopyMessagePopupWindow(View view, AbstractC33342d dVar, AbsMessageVO<BaseTextContentVO<?>> aVar) {
        this.f90920e = view;
        this.f90921f = dVar;
        this.f90918b = aVar;
        this.f90917a = m137452c();
    }

    public /* synthetic */ CopyMessagePopupWindow(View view, AbstractC33342d dVar, AbsMessageVO aVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(view, dVar, aVar);
    }
}
