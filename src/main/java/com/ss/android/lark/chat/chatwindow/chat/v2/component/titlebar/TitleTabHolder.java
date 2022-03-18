package com.ss.android.lark.chat.chatwindow.chat.v2.component.titlebar;

import android.view.View;
import android.widget.ImageView;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.larksuite.component.universe_design.tab.UDTabLayout;
import com.larksuite.framework.utils.DeviceUtils;
import com.ss.android.lark.chat.chatwindow.chat.v2.component.tab.util.ChatTabFgUtil;
import com.ss.android.lark.chat.entity.chat.Chat;
import com.ss.android.lark.utils.UIHelper;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u00010B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\u0006\u0010!\u001a\u00020\u0000J\b\u0010\"\u001a\u00020#H\u0002J\u0016\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020)J\u000e\u0010*\u001a\u00020%2\u0006\u0010+\u001a\u00020,J\"\u0010-\u001a\u00020%2\u0006\u0010&\u001a\u00020'2\u0012\u0010.\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020%0/R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u001e\u0010\t\u001a\u00020\n8\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001e\u0010\u000f\u001a\u00020\n8\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\f\"\u0004\b\u0011\u0010\u000eR\u001e\u0010\u0012\u001a\u00020\u00138\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001e\u0010\u0018\u001a\u00020\n8\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\f\"\u0004\b\u001a\u0010\u000eR\u001e\u0010\u001b\u001a\u00020\u00038\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u001d¨\u00061"}, d2 = {"Lcom/ss/android/lark/chat/chatwindow/chat/v2/component/titlebar/TitleTabHolder;", "", "rootView", "Landroid/view/View;", "listener", "Lcom/ss/android/lark/chat/chatwindow/chat/v2/component/titlebar/TitleTabHolder$OnTabFuncClickListener;", "(Landroid/view/View;Lcom/ss/android/lark/chat/chatwindow/chat/v2/component/titlebar/TitleTabHolder$OnTabFuncClickListener;)V", "getListener", "()Lcom/ss/android/lark/chat/chatwindow/chat/v2/component/titlebar/TitleTabHolder$OnTabFuncClickListener;", "mTabAddIcon", "Landroid/widget/ImageView;", "getMTabAddIcon", "()Landroid/widget/ImageView;", "setMTabAddIcon", "(Landroid/widget/ImageView;)V", "mTabAddIconFloat", "getMTabAddIconFloat", "setMTabAddIconFloat", "mTabLayout", "Lcom/larksuite/component/universe_design/tab/UDTabLayout;", "getMTabLayout", "()Lcom/larksuite/component/universe_design/tab/UDTabLayout;", "setMTabLayout", "(Lcom/larksuite/component/universe_design/tab/UDTabLayout;)V", "mTabMoreIcon", "getMTabMoreIcon", "setMTabMoreIcon", "mTitleBarTabContent", "getMTitleBarTabContent", "()Landroid/view/View;", "setMTitleBarTabContent", "(Landroid/view/View;)V", "getRootView", "bind", "calculateAllTabWidth", "", "locateTabIcon", "", "chat", "Lcom/ss/android/lark/chat/entity/chat/Chat;", "showManagerTab", "", "selectTab", "tabId", "", "setup", "binder", "Lkotlin/Function1;", "OnTabFuncClickListener", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
public final class TitleTabHolder {

    /* renamed from: a */
    private final View f86830a;

    /* renamed from: b */
    private final OnTabFuncClickListener f86831b;
    @BindView(8892)
    public ImageView mTabAddIcon;
    @BindView(8893)
    public ImageView mTabAddIconFloat;
    @BindView(8899)
    public UDTabLayout mTabLayout;
    @BindView(8901)
    public ImageView mTabMoreIcon;
    @BindView(8896)
    public View mTitleBarTabContent;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&¨\u0006\u0005"}, d2 = {"Lcom/ss/android/lark/chat/chatwindow/chat/v2/component/titlebar/TitleTabHolder$OnTabFuncClickListener;", "", "onAddTabClick", "", "onMoreTabClick", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.chatwindow.chat.v2.component.titlebar.TitleTabHolder$a */
    public interface OnTabFuncClickListener {
        /* renamed from: a */
        void mo123656a();

        /* renamed from: b */
        void mo123657b();
    }

    /* renamed from: b */
    public final OnTabFuncClickListener mo123655b() {
        return this.f86831b;
    }

    /* renamed from: c */
    private final int m130708c() {
        UDTabLayout uDTabLayout = this.mTabLayout;
        if (uDTabLayout == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mTabLayout");
        }
        int tabCount = uDTabLayout.getTabCount();
        int i = 0;
        for (int i2 = 0; i2 < tabCount; i2++) {
            UDTabLayout uDTabLayout2 = this.mTabLayout;
            if (uDTabLayout2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mTabLayout");
            }
            i += uDTabLayout2.getTabAt(i2).mo91341c().getWidth();
        }
        return i;
    }

    /* renamed from: a */
    public final TitleTabHolder mo123652a() {
        ButterKnife.bind(this, this.f86830a);
        ImageView imageView = this.mTabAddIcon;
        if (imageView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mTabAddIcon");
        }
        imageView.setOnClickListener(new View$OnClickListenerC33701b(this));
        ImageView imageView2 = this.mTabMoreIcon;
        if (imageView2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mTabMoreIcon");
        }
        imageView2.setOnClickListener(new View$OnClickListenerC33702c(this));
        UDTabLayout uDTabLayout = this.mTabLayout;
        if (uDTabLayout == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mTabLayout");
        }
        uDTabLayout.setNestedScrollingEnabled(false);
        return this;
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.chatwindow.chat.v2.component.titlebar.TitleTabHolder$b */
    public static final class View$OnClickListenerC33701b implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ TitleTabHolder f86832a;

        View$OnClickListenerC33701b(TitleTabHolder titleTabHolder) {
            this.f86832a = titleTabHolder;
        }

        public final void onClick(View view) {
            OnTabFuncClickListener b = this.f86832a.mo123655b();
            if (b != null) {
                b.mo123656a();
            }
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.chatwindow.chat.v2.component.titlebar.TitleTabHolder$c */
    public static final class View$OnClickListenerC33702c implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ TitleTabHolder f86833a;

        View$OnClickListenerC33702c(TitleTabHolder titleTabHolder) {
            this.f86833a = titleTabHolder;
        }

        public final void onClick(View view) {
            OnTabFuncClickListener b = this.f86833a.mo123655b();
            if (b != null) {
                b.mo123657b();
            }
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.chatwindow.chat.v2.component.titlebar.TitleTabHolder$d */
    public static final class View$OnClickListenerC33703d implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ TitleTabHolder f86834a;

        View$OnClickListenerC33703d(TitleTabHolder titleTabHolder) {
            this.f86834a = titleTabHolder;
        }

        public final void onClick(View view) {
            OnTabFuncClickListener b = this.f86834a.mo123655b();
            if (b != null) {
                b.mo123656a();
            }
        }
    }

    public TitleTabHolder(View view, OnTabFuncClickListener aVar) {
        Intrinsics.checkParameterIsNotNull(view, "rootView");
        this.f86830a = view;
        this.f86831b = aVar;
    }

    /* renamed from: a */
    public final void mo123653a(Chat chat, Function1<? super UDTabLayout, Unit> function1) {
        Intrinsics.checkParameterIsNotNull(chat, "chat");
        Intrinsics.checkParameterIsNotNull(function1, "binder");
        ImageView imageView = this.mTabAddIcon;
        if (imageView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mTabAddIcon");
        }
        imageView.setVisibility(8);
        ImageView imageView2 = this.mTabMoreIcon;
        if (imageView2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mTabMoreIcon");
        }
        imageView2.setVisibility(8);
        if (ChatTabFgUtil.f86815a.mo123637a(chat)) {
            View view = this.mTitleBarTabContent;
            if (view == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mTitleBarTabContent");
            }
            view.setVisibility(0);
            ImageView imageView3 = this.mTabAddIconFloat;
            if (imageView3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mTabAddIconFloat");
            }
            imageView3.setVisibility(8);
            ImageView imageView4 = this.mTabAddIconFloat;
            if (imageView4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mTabAddIconFloat");
            }
            imageView4.setOnClickListener(new View$OnClickListenerC33703d(this));
            if (ChatTabFgUtil.f86815a.mo123639b(chat)) {
                ImageView imageView5 = this.mTabAddIcon;
                if (imageView5 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mTabAddIcon");
                }
                imageView5.setVisibility(0);
                ImageView imageView6 = this.mTabMoreIcon;
                if (imageView6 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mTabMoreIcon");
                }
                imageView6.setVisibility(0);
            } else {
                ImageView imageView7 = this.mTabAddIcon;
                if (imageView7 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mTabAddIcon");
                }
                imageView7.setVisibility(8);
                ImageView imageView8 = this.mTabMoreIcon;
                if (imageView8 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mTabMoreIcon");
                }
                imageView8.setVisibility(8);
            }
            UDTabLayout uDTabLayout = this.mTabLayout;
            if (uDTabLayout == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mTabLayout");
            }
            function1.invoke(uDTabLayout);
            return;
        }
        View view2 = this.mTitleBarTabContent;
        if (view2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mTitleBarTabContent");
        }
        view2.setVisibility(8);
    }

    /* renamed from: a */
    public final void mo123654a(Chat chat, boolean z) {
        Intrinsics.checkParameterIsNotNull(chat, "chat");
        int i = 8;
        if (!ChatTabFgUtil.f86815a.mo123639b(chat)) {
            ImageView imageView = this.mTabAddIcon;
            if (imageView == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mTabAddIcon");
            }
            imageView.setVisibility(8);
            ImageView imageView2 = this.mTabAddIconFloat;
            if (imageView2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mTabAddIconFloat");
            }
            imageView2.setVisibility(8);
            ImageView imageView3 = this.mTabMoreIcon;
            if (imageView3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mTabMoreIcon");
            }
            imageView3.setVisibility(8);
            return;
        }
        if (m130708c() >= DeviceUtils.getScreenWidth(this.f86830a.getContext()) - (UIHelper.dp2px((float) 36) * 2)) {
            ImageView imageView4 = this.mTabAddIcon;
            if (imageView4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mTabAddIcon");
            }
            imageView4.setVisibility(0);
            ImageView imageView5 = this.mTabAddIconFloat;
            if (imageView5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mTabAddIconFloat");
            }
            imageView5.setVisibility(8);
        } else {
            ImageView imageView6 = this.mTabAddIcon;
            if (imageView6 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mTabAddIcon");
            }
            imageView6.setVisibility(8);
            ImageView imageView7 = this.mTabAddIconFloat;
            if (imageView7 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mTabAddIconFloat");
            }
            imageView7.setVisibility(0);
        }
        ImageView imageView8 = this.mTabMoreIcon;
        if (imageView8 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mTabMoreIcon");
        }
        if (z) {
            i = 0;
        }
        imageView8.setVisibility(i);
    }
}
