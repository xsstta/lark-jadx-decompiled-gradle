package com.ss.android.lark.search.impl.func.chatimage;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import com.larksuite.component.ui.toast.LKUIToast;
import com.larksuite.component.universe_design.dialog.UDDialogBuilder;
import com.larksuite.component.universe_design.icon.UDIconUtils;
import com.larksuite.component.universe_design.toast.UDToast;
import com.larksuite.framework.utils.CollectionUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.chat.entity.chat.Chat;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.search.impl.func.chatimage.IChatImageResourceContract;
import com.ss.android.lark.search.impl.func.chatinside.detail.image.C53491a;
import com.ss.android.lark.search.impl.func.chatinside.detail.image.ChatInsideSearchImageAdapter;
import com.ss.android.lark.search.impl.func.chatinside.detail.image.viewdata.ChatInsideSearchImageViewData;
import com.ss.android.lark.ui.CommonTitleBar;
import com.ss.android.lark.ui.IActionTitlebar;
import com.ss.android.lark.ui.p2892a.C57582a;
import com.ss.android.lark.utils.C57805b;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.lark.widget.listener.OnSingleClickListener;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0010 \n\u0002\b\u000e\u0018\u0000 ;2\u00020\u0001:\u0002;<B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\b\u0010\u0016\u001a\u00020\u0017H\u0016J\b\u0010\u0018\u001a\u00020\u0017H\u0016J0\u0010\u0019\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u001b2\u0016\u0010\u001c\u001a\u0012\u0012\u0004\u0012\u00020\u00070\u001dj\b\u0012\u0004\u0012\u00020\u0007`\u001e2\u0006\u0010\u001f\u001a\u00020 H\u0016J\b\u0010!\u001a\u00020\fH\u0016J\b\u0010\"\u001a\u00020\u0017H\u0002J\b\u0010#\u001a\u00020\u0017H\u0002J\b\u0010$\u001a\u00020\u0017H\u0002J\b\u0010%\u001a\u00020\u0017H\u0002J\u0010\u0010&\u001a\u00020\u00172\u0006\u0010&\u001a\u00020\tH\u0016J\u0010\u0010'\u001a\u00020\u00172\u0006\u0010(\u001a\u00020 H\u0016J \u0010)\u001a\u00020\u00172\u0006\u0010*\u001a\u00020 2\u0006\u0010+\u001a\u00020 2\u0006\u0010(\u001a\u00020 H\u0016J\u0010\u0010,\u001a\u00020\u00172\u0006\u0010(\u001a\u00020 H\u0016J0\u0010-\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u001b2\u0016\u0010\u001c\u001a\u0012\u0012\u0004\u0012\u00020\u00070\u001dj\b\u0012\u0004\u0012\u00020\u0007`\u001e2\u0006\u0010\u001f\u001a\u00020 H\u0016J\u0016\u0010.\u001a\u00020\u00172\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00070/H\u0016J\b\u00100\u001a\u00020\u0017H\u0016J\u0012\u00101\u001a\u00020\u00172\b\u00102\u001a\u0004\u0018\u00010\u0013H\u0016J\u0010\u00103\u001a\u00020\u00172\u0006\u0010(\u001a\u00020 H\u0016J\u0012\u00104\u001a\u00020\u00172\b\b\u0001\u0010(\u001a\u00020 H\u0016J\u0010\u00105\u001a\u00020\u00172\u0006\u00106\u001a\u00020\tH\u0002J\u0018\u00107\u001a\u00020\u00172\u0006\u00108\u001a\u00020 2\u0006\u00109\u001a\u00020 H\u0002J\b\u0010:\u001a\u00020\u0017H\u0002R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX.¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX.¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\tX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015¨\u0006="}, d2 = {"Lcom/ss/android/lark/search/impl/func/chatimage/ChatImageResourceView;", "Lcom/ss/android/lark/search/impl/func/chatimage/IChatImageResourceContract$IView;", "mRootView", "Landroid/view/View;", "mViewDependency", "Lcom/ss/android/lark/search/impl/func/chatimage/ChatImageResourceView$ViewDependency;", "mChatId", "", "mIsThread", "", "(Landroid/view/View;Lcom/ss/android/lark/search/impl/func/chatimage/ChatImageResourceView$ViewDependency;Ljava/lang/String;Z)V", "mContext", "Landroid/content/Context;", "mFragment", "Lcom/ss/android/lark/search/impl/func/chatinside/detail/image/ChatInsideSearchImageFragment;", "mIsSelectStatus", "getMRootView", "()Landroid/view/View;", "mViewDelegate", "Lcom/ss/android/lark/search/impl/func/chatimage/IChatImageResourceContract$IView$Delegate;", "getMViewDependency", "()Lcom/ss/android/lark/search/impl/func/chatimage/ChatImageResourceView$ViewDependency;", "create", "", "destroy", "forwardMessage", "chat", "Lcom/ss/android/lark/chat/entity/chat/Chat;", "messageIds", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "requestCode", "", "getContext", "initActionMenu", "initContentView", "initTitleBar", "initView", "isSelectStatus", "loadFail", "stringId", "loadPartSuccess", "requestSucceedCount", "requestFailedCount", "loadSuccess", "mergeForwardMessage", "removeItems", "", "resetItemSelectStatus", "setViewDelegate", "viewDelegate", "showLoading", "showToast", "updateActionMenu", "hasSelectItems", "updateIconTextColor", "iconColor", "textColor", "updateSelectStatus", "Companion", "ViewDependency", "core_search_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.search.impl.func.chatimage.e */
public final class ChatImageResourceView implements IChatImageResourceContract.IView {

    /* renamed from: e */
    public static final Companion f131982e = new Companion(null);

    /* renamed from: a */
    public C53491a f131983a;

    /* renamed from: b */
    public boolean f131984b;

    /* renamed from: c */
    public IChatImageResourceContract.IView.Delegate f131985c;

    /* renamed from: d */
    public Context f131986d;

    /* renamed from: f */
    private final View f131987f;

    /* renamed from: g */
    private final ViewDependency f131988g;

    /* renamed from: h */
    private final String f131989h;

    /* renamed from: i */
    private final boolean f131990i;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J0\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0016\u0010\b\u001a\u0012\u0012\u0004\u0012\u00020\n0\tj\b\u0012\u0004\u0012\u00020\n`\u000b2\u0006\u0010\f\u001a\u00020\rH&J0\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0016\u0010\b\u001a\u0012\u0012\u0004\u0012\u00020\n0\tj\b\u0012\u0004\u0012\u00020\n`\u000b2\u0006\u0010\f\u001a\u00020\rH&¨\u0006\u000f"}, d2 = {"Lcom/ss/android/lark/search/impl/func/chatimage/ChatImageResourceView$ViewDependency;", "", "getSupportFragmentManager", "Landroidx/fragment/app/FragmentManager;", "onForward", "", "chat", "Lcom/ss/android/lark/chat/entity/chat/Chat;", "selectMessageIds", "Ljava/util/ArrayList;", "", "Lkotlin/collections/ArrayList;", "requestCode", "", "onMergeForward", "core_search_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.search.impl.func.chatimage.e$b */
    public interface ViewDependency {
        /* renamed from: a */
        FragmentManager mo182369a();

        /* renamed from: a */
        void mo182370a(Chat chat, ArrayList<String> arrayList, int i);

        /* renamed from: b */
        void mo182371b(Chat chat, ArrayList<String> arrayList, int i);
    }

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void destroy() {
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ss/android/lark/search/impl/func/chatimage/ChatImageResourceView$Companion;", "", "()V", "LOG_TAG", "", "core_search_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.search.impl.func.chatimage.e$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: d */
    private final void m206746d() {
        m206749g();
        m206748f();
        m206747e();
    }

    @Override // com.ss.android.lark.search.impl.func.chatimage.IChatImageResourceContract.IView
    /* renamed from: c */
    public Context mo182410c() {
        Context context = this.f131986d;
        if (context == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mContext");
        }
        return context;
    }

    @Override // com.ss.android.lark.search.impl.func.chatimage.IChatImageResourceContract.IView
    /* renamed from: b */
    public void mo182406b() {
        C53491a aVar = this.f131983a;
        if (aVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mFragment");
        }
        aVar.mo182634c();
    }

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void create() {
        ChatImageResourceHitPoint.f131958a.mo182372a();
        Context context = this.f131987f.getContext();
        Intrinsics.checkExpressionValueIsNotNull(context, "mRootView.context");
        this.f131986d = context;
        m206746d();
    }

    /* renamed from: e */
    private final void m206747e() {
        mo182405a(false);
        ((LinearLayout) this.f131987f.findViewById(R.id.mergeForward)).setOnClickListener(new C53398c(this));
        ((LinearLayout) this.f131987f.findViewById(R.id.forwardLayout)).setOnClickListener(new C53399d(this));
        ((LinearLayout) this.f131987f.findViewById(R.id.downloadLayout)).setOnClickListener(new C53400e(this));
        ((LinearLayout) this.f131987f.findViewById(R.id.deleteLayout)).setOnClickListener(new C53402f(this));
    }

    /* renamed from: f */
    private final void m206748f() {
        C53491a a = C53491a.m207167a(this.f131989h, this.f131990i, true, true);
        Intrinsics.checkExpressionValueIsNotNull(a, "ChatInsideSearchImageFra…d, mIsThread, true, true)");
        this.f131983a = a;
        if (a == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mFragment");
        }
        a.mo182630a(new C53404g(this));
        FragmentTransaction beginTransaction = this.f131988g.mo182369a().beginTransaction();
        Intrinsics.checkExpressionValueIsNotNull(beginTransaction, "mViewDependency.getSuppo…ager().beginTransaction()");
        C53491a aVar = this.f131983a;
        if (aVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mFragment");
        }
        beginTransaction.add(R.id.flContent, aVar, (String) null);
        beginTransaction.commitNowAllowingStateLoss();
    }

    /* renamed from: g */
    private final void m206749g() {
        CommonTitleBar commonTitleBar = (CommonTitleBar) this.f131987f.findViewById(R.id.titleBar);
        Context context = this.f131986d;
        if (context == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mContext");
        }
        commonTitleBar.setTitle(context.getResources().getString(R.string.Lark_Legacy_PhotosAndVideos));
        CommonTitleBar commonTitleBar2 = (CommonTitleBar) this.f131987f.findViewById(R.id.titleBar);
        Context context2 = this.f131986d;
        if (context2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mContext");
        }
        commonTitleBar2.addAction(new C53405h(this, context2.getResources().getString(R.string.Lark_Legacy_SelectButton)));
    }

    /* renamed from: a */
    public final void mo182399a() {
        if (this.f131984b) {
            ChatImageResourceHitPoint.f131958a.mo182373a("select", "none");
            TextView rightText = ((CommonTitleBar) this.f131987f.findViewById(R.id.titleBar)).getRightText(0);
            Intrinsics.checkExpressionValueIsNotNull(rightText, "mRootView.titleBar.getRightText(0)");
            Context context = this.f131986d;
            if (context == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mContext");
            }
            rightText.setText(context.getResources().getString(R.string.Lark_Legacy_Cancel));
            C53491a aVar = this.f131983a;
            if (aVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mFragment");
            }
            aVar.mo182632a(true);
            ((FrameLayout) this.f131987f.findViewById(R.id.flContent)).setPadding(0, 0, 0, C57582a.m223600a(96));
            LinearLayout linearLayout = (LinearLayout) this.f131987f.findViewById(R.id.actionMenu);
            Intrinsics.checkExpressionValueIsNotNull(linearLayout, "mRootView.actionMenu");
            linearLayout.setVisibility(0);
            return;
        }
        TextView rightText2 = ((CommonTitleBar) this.f131987f.findViewById(R.id.titleBar)).getRightText(0);
        Intrinsics.checkExpressionValueIsNotNull(rightText2, "mRootView.titleBar.getRightText(0)");
        Context context2 = this.f131986d;
        if (context2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mContext");
        }
        rightText2.setText(context2.getResources().getString(R.string.Lark_Legacy_SelectButton));
        C53491a aVar2 = this.f131983a;
        if (aVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mFragment");
        }
        aVar2.mo182632a(false);
        C53491a aVar3 = this.f131983a;
        if (aVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mFragment");
        }
        aVar3.mo182634c();
        ((FrameLayout) this.f131987f.findViewById(R.id.flContent)).setPadding(0, 0, 0, 0);
        mo182405a(false);
        LinearLayout linearLayout2 = (LinearLayout) this.f131987f.findViewById(R.id.actionMenu);
        Intrinsics.checkExpressionValueIsNotNull(linearLayout2, "mRootView.actionMenu");
        linearLayout2.setVisibility(8);
    }

    /* renamed from: a */
    public void setViewDelegate(IChatImageResourceContract.IView.Delegate aVar) {
        this.f131985c = aVar;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/lark/search/impl/func/chatimage/ChatImageResourceView$initActionMenu$1", "Lcom/ss/android/lark/widget/listener/OnSingleClickListener;", "onSingleClick", "", "v", "Landroid/view/View;", "core_search_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.search.impl.func.chatimage.e$c */
    public static final class C53398c extends OnSingleClickListener {

        /* renamed from: a */
        final /* synthetic */ ChatImageResourceView f131991a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C53398c(ChatImageResourceView eVar) {
            this.f131991a = eVar;
        }

        @Override // com.ss.android.lark.widget.listener.OnSingleClickListener
        public void onSingleClick(View view) {
            IChatImageResourceContract.IView.Delegate aVar;
            ChatImageResourceHitPoint.f131958a.mo182373a("forward", "none");
            ArrayList<String> a = ChatImageResourceView.m206743a(this.f131991a).mo182629a();
            if (!CollectionUtils.isEmpty(a) && (aVar = this.f131991a.f131985c) != null) {
                Intrinsics.checkExpressionValueIsNotNull(a, "selectMessageIds");
                aVar.mo182388a(a);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/lark/search/impl/func/chatimage/ChatImageResourceView$initActionMenu$2", "Lcom/ss/android/lark/widget/listener/OnSingleClickListener;", "onSingleClick", "", "v", "Landroid/view/View;", "core_search_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.search.impl.func.chatimage.e$d */
    public static final class C53399d extends OnSingleClickListener {

        /* renamed from: a */
        final /* synthetic */ ChatImageResourceView f131992a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C53399d(ChatImageResourceView eVar) {
            this.f131992a = eVar;
        }

        @Override // com.ss.android.lark.widget.listener.OnSingleClickListener
        public void onSingleClick(View view) {
            IChatImageResourceContract.IView.Delegate aVar;
            ChatImageResourceHitPoint.f131958a.mo182373a("forward", "none");
            ArrayList<String> a = ChatImageResourceView.m206743a(this.f131992a).mo182629a();
            if (!CollectionUtils.isEmpty(a) && (aVar = this.f131992a.f131985c) != null) {
                Intrinsics.checkExpressionValueIsNotNull(a, "selectMessageIds");
                aVar.mo182390b(a);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/lark/search/impl/func/chatimage/ChatImageResourceView$initActionMenu$3", "Lcom/ss/android/lark/widget/listener/OnSingleClickListener;", "onSingleClick", "", "v", "Landroid/view/View;", "core_search_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.search.impl.func.chatimage.e$e */
    public static final class C53400e extends OnSingleClickListener {

        /* renamed from: a */
        final /* synthetic */ ChatImageResourceView f131993a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C53400e(ChatImageResourceView eVar) {
            this.f131993a = eVar;
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "isGranted", "", "permissionGranted"}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.search.impl.func.chatimage.e$e$a */
        static final class C53401a implements C57805b.AbstractC57809a {

            /* renamed from: a */
            final /* synthetic */ C53400e f131994a;

            /* renamed from: b */
            final /* synthetic */ List f131995b;

            C53401a(C53400e eVar, List list) {
                this.f131994a = eVar;
                this.f131995b = list;
            }

            @Override // com.ss.android.lark.utils.C57805b.AbstractC57809a
            public final void permissionGranted(boolean z) {
                if (z) {
                    IChatImageResourceContract.IView.Delegate aVar = this.f131994a.f131993a.f131985c;
                    if (aVar != null) {
                        List<? extends ChatInsideSearchImageViewData> list = this.f131995b;
                        Intrinsics.checkExpressionValueIsNotNull(list, "selectItems");
                        aVar.mo182389a(list);
                        return;
                    }
                    return;
                }
                this.f131994a.f131993a.mo182400a(R.string.Lark_Legacy_Writeexternalstorage);
            }
        }

        @Override // com.ss.android.lark.widget.listener.OnSingleClickListener
        public void onSingleClick(View view) {
            ChatImageResourceHitPoint.f131958a.mo182373a("download", "none");
            List<ChatInsideSearchImageViewData> b = ChatImageResourceView.m206743a(this.f131993a).mo182633b();
            if (!CollectionUtils.isEmpty(b)) {
                C57805b.m224333d((Activity) ChatImageResourceView.m206745b(this.f131993a), new C53401a(this, b));
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/lark/search/impl/func/chatimage/ChatImageResourceView$initActionMenu$4", "Lcom/ss/android/lark/widget/listener/OnSingleClickListener;", "onSingleClick", "", "v", "Landroid/view/View;", "core_search_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.search.impl.func.chatimage.e$f */
    public static final class C53402f extends OnSingleClickListener {

        /* renamed from: a */
        final /* synthetic */ ChatImageResourceView f131996a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C53402f(ChatImageResourceView eVar) {
            this.f131996a = eVar;
        }

        @Override // com.ss.android.lark.widget.listener.OnSingleClickListener
        public void onSingleClick(View view) {
            ChatImageResourceHitPoint.f131958a.mo182373a("delete", "none");
            ArrayList<String> a = ChatImageResourceView.m206743a(this.f131996a).mo182629a();
            if (!CollectionUtils.isEmpty(a)) {
                UDDialogBuilder eVar = new UDDialogBuilder(ChatImageResourceView.m206745b(this.f131996a));
                String string = ChatImageResourceView.m206745b(this.f131996a).getResources().getString(R.string.Lark_Legacy_DeleteConfirmationTitle);
                Intrinsics.checkExpressionValueIsNotNull(string, "mContext.resources.getSt…_DeleteConfirmationTitle)");
                String string2 = ChatImageResourceView.m206745b(this.f131996a).getResources().getString(R.string.Lark_Legacy_DeleteConfirmationDesc);
                Intrinsics.checkExpressionValueIsNotNull(string2, "mContext.resources.getSt…y_DeleteConfirmationDesc)");
                String string3 = ChatImageResourceView.m206745b(this.f131996a).getResources().getString(R.string.Lark_Legacy_DeleteConfirmationButton);
                Intrinsics.checkExpressionValueIsNotNull(string3, "mContext.resources.getSt…DeleteConfirmationButton)");
                String string4 = ChatImageResourceView.m206745b(this.f131996a).getResources().getString(R.string.Lark_Legacy_Cancel);
                Intrinsics.checkExpressionValueIsNotNull(string4, "mContext.resources.getSt…tring.Lark_Legacy_Cancel)");
                ((UDDialogBuilder) ((UDDialogBuilder) ((UDDialogBuilder) ((UDDialogBuilder) eVar.title(string)).message(string2)).addActionButton(R.id.ud_dialog_btn_primary, string3, new DialogInterface$OnClickListenerC53403a(this, a))).addActionButton(R.id.ud_dialog_btn_secondary, string4, (DialogInterface.OnClickListener) null)).show();
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001a\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\b"}, d2 = {"com/ss/android/lark/search/impl/func/chatimage/ChatImageResourceView$initActionMenu$4$onSingleClick$1", "Landroid/content/DialogInterface$OnClickListener;", "onClick", "", "dialog", "Landroid/content/DialogInterface;", "which", "", "core_search_release"}, mo238835k = 1, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.search.impl.func.chatimage.e$f$a */
        public static final class DialogInterface$OnClickListenerC53403a implements DialogInterface.OnClickListener {

            /* renamed from: a */
            final /* synthetic */ C53402f f131997a;

            /* renamed from: b */
            final /* synthetic */ ArrayList f131998b;

            DialogInterface$OnClickListenerC53403a(C53402f fVar, ArrayList arrayList) {
                this.f131997a = fVar;
                this.f131998b = arrayList;
            }

            public void onClick(DialogInterface dialogInterface, int i) {
                IChatImageResourceContract.IView.Delegate aVar = this.f131997a.f131996a.f131985c;
                if (aVar != null) {
                    ArrayList arrayList = this.f131998b;
                    Intrinsics.checkExpressionValueIsNotNull(arrayList, "selectMessageIds");
                    aVar.mo182391b((List<String>) arrayList);
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "hasSelectItem", "", "onItemSelectChange"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.search.impl.func.chatimage.e$g */
    public static final class C53404g implements ChatInsideSearchImageAdapter.AbstractC53490b {

        /* renamed from: a */
        final /* synthetic */ ChatImageResourceView f131999a;

        C53404g(ChatImageResourceView eVar) {
            this.f131999a = eVar;
        }

        @Override // com.ss.android.lark.search.impl.func.chatinside.detail.image.ChatInsideSearchImageAdapter.AbstractC53490b
        /* renamed from: a */
        public final void mo182414a(boolean z) {
            this.f131999a.mo182405a(z);
        }
    }

    /* renamed from: a */
    public static final /* synthetic */ C53491a m206743a(ChatImageResourceView eVar) {
        C53491a aVar = eVar.f131983a;
        if (aVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mFragment");
        }
        return aVar;
    }

    /* renamed from: b */
    public static final /* synthetic */ Context m206745b(ChatImageResourceView eVar) {
        Context context = eVar.f131986d;
        if (context == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mContext");
        }
        return context;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/lark/search/impl/func/chatimage/ChatImageResourceView$initTitleBar$1", "Lcom/ss/android/lark/ui/IActionTitlebar$TextAction;", "performAction", "", "view", "Landroid/view/View;", "core_search_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.search.impl.func.chatimage.e$h */
    public static final class C53405h extends IActionTitlebar.TextAction {

        /* renamed from: a */
        final /* synthetic */ ChatImageResourceView f132000a;

        @Override // com.ss.android.lark.ui.IActionTitlebar.Action, com.ss.android.lark.ui.IActionTitlebar.BaseAction
        public void performAction(View view) {
            Intrinsics.checkParameterIsNotNull(view, "view");
            super.performAction(view);
            ChatImageResourceView eVar = this.f132000a;
            eVar.f131984b = !eVar.f131984b;
            this.f132000a.mo182399a();
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C53405h(ChatImageResourceView eVar, String str) {
            super(str);
            this.f132000a = eVar;
        }
    }

    @Override // com.ss.android.lark.search.impl.func.chatimage.IChatImageResourceContract.IView
    /* renamed from: a */
    public void mo182400a(int i) {
        Context context = this.f131986d;
        if (context == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mContext");
        }
        UDToast.show(context, i);
    }

    @Override // com.ss.android.lark.search.impl.func.chatimage.IChatImageResourceContract.IView
    /* renamed from: c */
    public void mo182411c(int i) {
        Context context = this.f131986d;
        if (context == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mContext");
        }
        LKUIToast.loadSuccess(context, i);
    }

    @Override // com.ss.android.lark.search.impl.func.chatimage.IChatImageResourceContract.IView
    /* renamed from: d */
    public void mo182412d(int i) {
        Context context = this.f131986d;
        if (context == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mContext");
        }
        LKUIToast.loadFail(context, i);
    }

    @Override // com.ss.android.lark.search.impl.func.chatimage.IChatImageResourceContract.IView
    /* renamed from: b */
    public void mo182407b(int i) {
        Context context = this.f131986d;
        if (context == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mContext");
        }
        LKUIToast.showLoading(context, i);
    }

    @Override // com.ss.android.lark.search.impl.func.chatimage.IChatImageResourceContract.IView
    /* renamed from: b */
    public void mo182409b(boolean z) {
        this.f131984b = z;
        mo182399a();
        C53491a aVar = this.f131983a;
        if (aVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mFragment");
        }
        aVar.mo182632a(z);
    }

    @Override // com.ss.android.lark.search.impl.func.chatimage.IChatImageResourceContract.IView
    /* renamed from: a */
    public void mo182404a(List<String> list) {
        Intrinsics.checkParameterIsNotNull(list, "messageIds");
        C53491a aVar = this.f131983a;
        if (aVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mFragment");
        }
        aVar.mo182631a(list);
    }

    /* renamed from: a */
    public final void mo182405a(boolean z) {
        if (z) {
            m206744a(R.color.lkui_N800, R.color.lkui_N900);
        } else {
            m206744a(R.color.lkui_N400, R.color.lkui_N400);
        }
    }

    /* renamed from: a */
    private final void m206744a(int i, int i2) {
        ImageView imageView = (ImageView) this.f131987f.findViewById(R.id.mergeForwardIcon);
        Context context = this.f131987f.getContext();
        Intrinsics.checkExpressionValueIsNotNull(context, "mRootView.context");
        Context context2 = this.f131986d;
        if (context2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mContext");
        }
        imageView.setImageDrawable(UDIconUtils.getIconDrawable(context, (int) R.drawable.ud_icon_forward_com_outlined, context2.getResources().getColor(i)));
        TextView textView = (TextView) this.f131987f.findViewById(R.id.mergeForwardText);
        Context context3 = this.f131986d;
        if (context3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mContext");
        }
        textView.setTextColor(context3.getResources().getColor(i2));
        ImageView imageView2 = (ImageView) this.f131987f.findViewById(R.id.forwardIcon);
        Context context4 = this.f131987f.getContext();
        Intrinsics.checkExpressionValueIsNotNull(context4, "mRootView.context");
        Context context5 = this.f131986d;
        if (context5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mContext");
        }
        imageView2.setImageDrawable(UDIconUtils.getIconDrawable(context4, (int) R.drawable.ud_icon_forward_outlined, context5.getResources().getColor(i)));
        TextView textView2 = (TextView) this.f131987f.findViewById(R.id.forwardText);
        Context context6 = this.f131986d;
        if (context6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mContext");
        }
        textView2.setTextColor(context6.getResources().getColor(i2));
        ImageView imageView3 = (ImageView) this.f131987f.findViewById(R.id.downloadIcon);
        Context context7 = this.f131987f.getContext();
        Intrinsics.checkExpressionValueIsNotNull(context7, "mRootView.context");
        Context context8 = this.f131986d;
        if (context8 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mContext");
        }
        imageView3.setImageDrawable(UDIconUtils.getIconDrawable(context7, (int) R.drawable.ud_icon_download_outlined, context8.getResources().getColor(i)));
        TextView textView3 = (TextView) this.f131987f.findViewById(R.id.downloadText);
        Context context9 = this.f131986d;
        if (context9 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mContext");
        }
        textView3.setTextColor(context9.getResources().getColor(i2));
        ImageView imageView4 = (ImageView) this.f131987f.findViewById(R.id.deleteIcon);
        Context context10 = this.f131987f.getContext();
        Intrinsics.checkExpressionValueIsNotNull(context10, "mRootView.context");
        Context context11 = this.f131986d;
        if (context11 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mContext");
        }
        imageView4.setImageDrawable(UDIconUtils.getIconDrawable(context10, (int) R.drawable.ud_icon_delete_trash_outlined, context11.getResources().getColor(i)));
        TextView textView4 = (TextView) this.f131987f.findViewById(R.id.deleteText);
        Context context12 = this.f131986d;
        if (context12 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mContext");
        }
        textView4.setTextColor(context12.getResources().getColor(i2));
    }

    @Override // com.ss.android.lark.search.impl.func.chatimage.IChatImageResourceContract.IView
    /* renamed from: a */
    public void mo182402a(Chat chat, ArrayList<String> arrayList, int i) {
        Intrinsics.checkParameterIsNotNull(chat, "chat");
        Intrinsics.checkParameterIsNotNull(arrayList, "messageIds");
        this.f131988g.mo182370a(chat, arrayList, i);
    }

    @Override // com.ss.android.lark.search.impl.func.chatimage.IChatImageResourceContract.IView
    /* renamed from: a */
    public void mo182401a(int i, int i2, int i3) {
        HashMap hashMap = new HashMap();
        hashMap.put("numberDownload", String.valueOf(i));
        hashMap.put("numberFailed", String.valueOf(i2));
        Context context = this.f131986d;
        if (context == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mContext");
        }
        LKUIToast.loadSuccess(context, UIHelper.mustacheFormat(i3, hashMap));
        Log.m165389i("ChatImageResourceView", "requestSucceedCount : " + i + ";requestFailedCount=" + i2);
    }

    @Override // com.ss.android.lark.search.impl.func.chatimage.IChatImageResourceContract.IView
    /* renamed from: b */
    public void mo182408b(Chat chat, ArrayList<String> arrayList, int i) {
        Intrinsics.checkParameterIsNotNull(chat, "chat");
        Intrinsics.checkParameterIsNotNull(arrayList, "messageIds");
        this.f131988g.mo182371b(chat, arrayList, i);
    }

    public ChatImageResourceView(View view, ViewDependency bVar, String str, boolean z) {
        Intrinsics.checkParameterIsNotNull(view, "mRootView");
        Intrinsics.checkParameterIsNotNull(bVar, "mViewDependency");
        Intrinsics.checkParameterIsNotNull(str, "mChatId");
        this.f131987f = view;
        this.f131988g = bVar;
        this.f131989h = str;
        this.f131990i = z;
    }
}
