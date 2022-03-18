package com.ss.android.lark.album;

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
import com.ss.android.lark.album.IChatAlbumContract;
import com.ss.android.lark.album.image.C28672a;
import com.ss.android.lark.album.image.ChatImageAdapter;
import com.ss.android.lark.album.image.ChatImageViewData;
import com.ss.android.lark.chat.entity.chat.Chat;
import com.ss.android.lark.log.Log;
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

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0010\r\n\u0002\b\u0010\u0018\u0000 =2\u00020\u0001:\u0002=>B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\b\u0010\u0016\u001a\u00020\u0017H\u0016J\b\u0010\u0018\u001a\u00020\u0017H\u0016J0\u0010\u0019\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u001b2\u0016\u0010\u001c\u001a\u0012\u0012\u0004\u0012\u00020\u00070\u001dj\b\u0012\u0004\u0012\u00020\u0007`\u001e2\u0006\u0010\u001f\u001a\u00020 H\u0016J\b\u0010!\u001a\u00020\fH\u0016J\b\u0010\"\u001a\u00020\u0017H\u0002J\b\u0010#\u001a\u00020\u0017H\u0002J\b\u0010$\u001a\u00020\u0017H\u0002J\b\u0010%\u001a\u00020\u0017H\u0002J\u0010\u0010&\u001a\u00020\u00172\u0006\u0010&\u001a\u00020\tH\u0016J0\u0010'\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u001b2\u0016\u0010\u001c\u001a\u0012\u0012\u0004\u0012\u00020\u00070\u001dj\b\u0012\u0004\u0012\u00020\u0007`\u001e2\u0006\u0010\u001f\u001a\u00020 H\u0016J\u0016\u0010(\u001a\u00020\u00172\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00070)H\u0016J\b\u0010*\u001a\u00020\u0017H\u0016J\u0012\u0010+\u001a\u00020\u00172\b\u0010,\u001a\u0004\u0018\u00010\u0013H\u0016J\u0010\u0010-\u001a\u00020\u00172\u0006\u0010.\u001a\u00020/H\u0016J\u0010\u0010-\u001a\u00020\u00172\u0006\u00100\u001a\u00020 H\u0016J \u00101\u001a\u00020\u00172\u0006\u00102\u001a\u00020 2\u0006\u00103\u001a\u00020 2\u0006\u00100\u001a\u00020 H\u0016J\u0010\u00104\u001a\u00020\u00172\u0006\u00100\u001a\u00020 H\u0016J\u0010\u00105\u001a\u00020\u00172\u0006\u00100\u001a\u00020 H\u0016J\u0012\u00106\u001a\u00020\u00172\b\b\u0001\u00100\u001a\u00020 H\u0016J\u0010\u00107\u001a\u00020\u00172\u0006\u00108\u001a\u00020\tH\u0002J\u0018\u00109\u001a\u00020\u00172\u0006\u0010:\u001a\u00020 2\u0006\u0010;\u001a\u00020 H\u0002J\b\u0010<\u001a\u00020\u0017H\u0002R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX.¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX.¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\tX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015¨\u0006?"}, d2 = {"Lcom/ss/android/lark/album/ChatAlbumView;", "Lcom/ss/android/lark/album/IChatAlbumContract$IView;", "mRootView", "Landroid/view/View;", "mViewDependency", "Lcom/ss/android/lark/album/ChatAlbumView$ViewDependency;", "mChatId", "", "mIsThread", "", "(Landroid/view/View;Lcom/ss/android/lark/album/ChatAlbumView$ViewDependency;Ljava/lang/String;Z)V", "mContext", "Landroid/content/Context;", "mFragment", "Lcom/ss/android/lark/album/image/ChatImageFragment;", "mIsSelectStatus", "getMRootView", "()Landroid/view/View;", "mViewDelegate", "Lcom/ss/android/lark/album/IChatAlbumContract$IView$Delegate;", "getMViewDependency", "()Lcom/ss/android/lark/album/ChatAlbumView$ViewDependency;", "create", "", "destroy", "forwardMessage", "chat", "Lcom/ss/android/lark/chat/entity/chat/Chat;", "messageIds", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "requestCode", "", "getContext", "initActionMenu", "initContentView", "initTitleBar", "initView", "isSelectStatus", "mergeForwardMessage", "removeItems", "", "resetItemSelectStatus", "setViewDelegate", "viewDelegate", "showDownloadFail", "text", "", "stringId", "showDownloadPartSuccess", "requestSucceedCount", "requestFailedCount", "showDownloadSuccess", "showLoading", "showToast", "updateActionMenu", "hasSelectItems", "updateIconTextColor", "iconColor", "textColor", "updateSelectStatus", "Companion", "ViewDependency", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.album.e */
public final class ChatAlbumView implements IChatAlbumContract.IView {

    /* renamed from: e */
    public static final Companion f72094e = new Companion(null);

    /* renamed from: a */
    public C28672a f72095a;

    /* renamed from: b */
    public boolean f72096b;

    /* renamed from: c */
    public IChatAlbumContract.IView.Delegate f72097c;

    /* renamed from: d */
    public Context f72098d;

    /* renamed from: f */
    private final View f72099f;

    /* renamed from: g */
    private final ViewDependency f72100g;

    /* renamed from: h */
    private final String f72101h;

    /* renamed from: i */
    private final boolean f72102i;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J0\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0016\u0010\b\u001a\u0012\u0012\u0004\u0012\u00020\n0\tj\b\u0012\u0004\u0012\u00020\n`\u000b2\u0006\u0010\f\u001a\u00020\rH&J0\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0016\u0010\b\u001a\u0012\u0012\u0004\u0012\u00020\n0\tj\b\u0012\u0004\u0012\u00020\n`\u000b2\u0006\u0010\f\u001a\u00020\rH&¨\u0006\u000f"}, d2 = {"Lcom/ss/android/lark/album/ChatAlbumView$ViewDependency;", "", "getSupportFragmentManager", "Landroidx/fragment/app/FragmentManager;", "onForward", "", "chat", "Lcom/ss/android/lark/chat/entity/chat/Chat;", "selectMessageIds", "Ljava/util/ArrayList;", "", "Lkotlin/collections/ArrayList;", "requestCode", "", "onMergeForward", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.album.e$b */
    public interface ViewDependency {
        /* renamed from: a */
        FragmentManager mo101907a();

        /* renamed from: a */
        void mo101908a(Chat chat, ArrayList<String> arrayList, int i);

        /* renamed from: b */
        void mo101909b(Chat chat, ArrayList<String> arrayList, int i);
    }

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void destroy() {
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ss/android/lark/album/ChatAlbumView$Companion;", "", "()V", "LOG_TAG", "", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.album.e$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: d */
    private final void m105033d() {
        m105036g();
        m105035f();
        m105034e();
    }

    @Override // com.ss.android.lark.album.IChatAlbumContract.IView
    /* renamed from: c */
    public Context mo101951c() {
        Context context = this.f72098d;
        if (context == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mContext");
        }
        return context;
    }

    @Override // com.ss.android.lark.album.IChatAlbumContract.IView
    /* renamed from: b */
    public void mo101947b() {
        C28672a aVar = this.f72095a;
        if (aVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mFragment");
        }
        aVar.mo102017c();
    }

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void create() {
        ChatAlbumHitPoint.f72065a.mo101910a();
        Context context = this.f72099f.getContext();
        Intrinsics.checkExpressionValueIsNotNull(context, "mRootView.context");
        this.f72098d = context;
        m105033d();
    }

    /* renamed from: e */
    private final void m105034e() {
        mo101946a(false);
        ((LinearLayout) this.f72099f.findViewById(R.id.mergeForward)).setOnClickListener(new C28652c(this));
        ((LinearLayout) this.f72099f.findViewById(R.id.forwardLayout)).setOnClickListener(new C28653d(this));
        ((LinearLayout) this.f72099f.findViewById(R.id.downloadLayout)).setOnClickListener(new C28654e(this));
        ((LinearLayout) this.f72099f.findViewById(R.id.deleteLayout)).setOnClickListener(new C28656f(this));
    }

    /* renamed from: f */
    private final void m105035f() {
        C28672a a = C28672a.m105121a(this.f72101h, this.f72102i);
        Intrinsics.checkExpressionValueIsNotNull(a, "ChatImageFragment.newInstance(mChatId, mIsThread)");
        this.f72095a = a;
        if (a == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mFragment");
        }
        a.mo102013a(new C28658g(this));
        FragmentTransaction beginTransaction = this.f72100g.mo101907a().beginTransaction();
        Intrinsics.checkExpressionValueIsNotNull(beginTransaction, "mViewDependency.getSuppo…ager().beginTransaction()");
        C28672a aVar = this.f72095a;
        if (aVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mFragment");
        }
        beginTransaction.add(R.id.flContent, aVar, (String) null);
        beginTransaction.commitNowAllowingStateLoss();
    }

    /* renamed from: g */
    private final void m105036g() {
        CommonTitleBar commonTitleBar = (CommonTitleBar) this.f72099f.findViewById(R.id.titleBar);
        Context context = this.f72098d;
        if (context == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mContext");
        }
        commonTitleBar.setTitle(context.getResources().getString(R.string.Lark_Legacy_PhotosAndVideos));
        CommonTitleBar commonTitleBar2 = (CommonTitleBar) this.f72099f.findViewById(R.id.titleBar);
        Context context2 = this.f72098d;
        if (context2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mContext");
        }
        commonTitleBar2.addAction(new C28659h(this, context2.getResources().getString(R.string.Lark_Legacy_SelectButton)));
    }

    /* renamed from: a */
    public final void mo101939a() {
        if (this.f72096b) {
            ChatAlbumHitPoint.f72065a.mo101911a("select", "none");
            TextView rightText = ((CommonTitleBar) this.f72099f.findViewById(R.id.titleBar)).getRightText(0);
            Intrinsics.checkExpressionValueIsNotNull(rightText, "mRootView.titleBar.getRightText(0)");
            Context context = this.f72098d;
            if (context == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mContext");
            }
            rightText.setText(context.getResources().getString(R.string.Lark_Legacy_Cancel));
            C28672a aVar = this.f72095a;
            if (aVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mFragment");
            }
            aVar.mo102015a(true);
            ((FrameLayout) this.f72099f.findViewById(R.id.flContent)).setPadding(0, 0, 0, C57582a.m223600a(96));
            LinearLayout linearLayout = (LinearLayout) this.f72099f.findViewById(R.id.actionMenu);
            Intrinsics.checkExpressionValueIsNotNull(linearLayout, "mRootView.actionMenu");
            linearLayout.setVisibility(0);
            return;
        }
        TextView rightText2 = ((CommonTitleBar) this.f72099f.findViewById(R.id.titleBar)).getRightText(0);
        Intrinsics.checkExpressionValueIsNotNull(rightText2, "mRootView.titleBar.getRightText(0)");
        Context context2 = this.f72098d;
        if (context2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mContext");
        }
        rightText2.setText(context2.getResources().getString(R.string.Lark_Legacy_SelectButton));
        C28672a aVar2 = this.f72095a;
        if (aVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mFragment");
        }
        aVar2.mo102015a(false);
        C28672a aVar3 = this.f72095a;
        if (aVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mFragment");
        }
        aVar3.mo102017c();
        ((FrameLayout) this.f72099f.findViewById(R.id.flContent)).setPadding(0, 0, 0, 0);
        mo101946a(false);
        LinearLayout linearLayout2 = (LinearLayout) this.f72099f.findViewById(R.id.actionMenu);
        Intrinsics.checkExpressionValueIsNotNull(linearLayout2, "mRootView.actionMenu");
        linearLayout2.setVisibility(8);
    }

    /* renamed from: a */
    public void setViewDelegate(IChatAlbumContract.IView.Delegate aVar) {
        this.f72097c = aVar;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/lark/album/ChatAlbumView$initActionMenu$1", "Lcom/ss/android/lark/widget/listener/OnSingleClickListener;", "onSingleClick", "", "v", "Landroid/view/View;", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.album.e$c */
    public static final class C28652c extends OnSingleClickListener {

        /* renamed from: a */
        final /* synthetic */ ChatAlbumView f72103a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C28652c(ChatAlbumView eVar) {
            this.f72103a = eVar;
        }

        @Override // com.ss.android.lark.widget.listener.OnSingleClickListener
        public void onSingleClick(View view) {
            IChatAlbumContract.IView.Delegate aVar;
            ChatAlbumHitPoint.f72065a.mo101911a("forward", "none");
            ArrayList<String> a = ChatAlbumView.m105030a(this.f72103a).mo102012a();
            if (!CollectionUtils.isEmpty(a) && (aVar = this.f72103a.f72097c) != null) {
                Intrinsics.checkExpressionValueIsNotNull(a, "selectMessageIds");
                aVar.mo101928a(a);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/lark/album/ChatAlbumView$initActionMenu$2", "Lcom/ss/android/lark/widget/listener/OnSingleClickListener;", "onSingleClick", "", "v", "Landroid/view/View;", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.album.e$d */
    public static final class C28653d extends OnSingleClickListener {

        /* renamed from: a */
        final /* synthetic */ ChatAlbumView f72104a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C28653d(ChatAlbumView eVar) {
            this.f72104a = eVar;
        }

        @Override // com.ss.android.lark.widget.listener.OnSingleClickListener
        public void onSingleClick(View view) {
            IChatAlbumContract.IView.Delegate aVar;
            ChatAlbumHitPoint.f72065a.mo101911a("forward", "none");
            ArrayList<String> a = ChatAlbumView.m105030a(this.f72104a).mo102012a();
            if (!CollectionUtils.isEmpty(a) && (aVar = this.f72104a.f72097c) != null) {
                Intrinsics.checkExpressionValueIsNotNull(a, "selectMessageIds");
                aVar.mo101930b(a);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/lark/album/ChatAlbumView$initActionMenu$3", "Lcom/ss/android/lark/widget/listener/OnSingleClickListener;", "onSingleClick", "", "v", "Landroid/view/View;", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.album.e$e */
    public static final class C28654e extends OnSingleClickListener {

        /* renamed from: a */
        final /* synthetic */ ChatAlbumView f72105a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C28654e(ChatAlbumView eVar) {
            this.f72105a = eVar;
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "isGranted", "", "permissionGranted"}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.album.e$e$a */
        static final class C28655a implements C57805b.AbstractC57809a {

            /* renamed from: a */
            final /* synthetic */ C28654e f72106a;

            /* renamed from: b */
            final /* synthetic */ List f72107b;

            C28655a(C28654e eVar, List list) {
                this.f72106a = eVar;
                this.f72107b = list;
            }

            @Override // com.ss.android.lark.utils.C57805b.AbstractC57809a
            public final void permissionGranted(boolean z) {
                if (z) {
                    IChatAlbumContract.IView.Delegate aVar = this.f72106a.f72105a.f72097c;
                    if (aVar != null) {
                        List<? extends ChatImageViewData> list = this.f72107b;
                        Intrinsics.checkExpressionValueIsNotNull(list, "selectItems");
                        aVar.mo101929a(list);
                        return;
                    }
                    return;
                }
                this.f72106a.f72105a.mo101940a(R.string.Lark_Legacy_Writeexternalstorage);
            }
        }

        @Override // com.ss.android.lark.widget.listener.OnSingleClickListener
        public void onSingleClick(View view) {
            ChatAlbumHitPoint.f72065a.mo101911a("download", "none");
            List<ChatImageViewData> b = ChatAlbumView.m105030a(this.f72105a).mo102016b();
            if (!CollectionUtils.isEmpty(b)) {
                C57805b.m224333d((Activity) ChatAlbumView.m105032b(this.f72105a), new C28655a(this, b));
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/lark/album/ChatAlbumView$initActionMenu$4", "Lcom/ss/android/lark/widget/listener/OnSingleClickListener;", "onSingleClick", "", "v", "Landroid/view/View;", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.album.e$f */
    public static final class C28656f extends OnSingleClickListener {

        /* renamed from: a */
        final /* synthetic */ ChatAlbumView f72108a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C28656f(ChatAlbumView eVar) {
            this.f72108a = eVar;
        }

        @Override // com.ss.android.lark.widget.listener.OnSingleClickListener
        public void onSingleClick(View view) {
            ChatAlbumHitPoint.f72065a.mo101911a("delete", "none");
            ArrayList<String> a = ChatAlbumView.m105030a(this.f72108a).mo102012a();
            if (!CollectionUtils.isEmpty(a)) {
                UDDialogBuilder eVar = new UDDialogBuilder(ChatAlbumView.m105032b(this.f72108a));
                String string = ChatAlbumView.m105032b(this.f72108a).getResources().getString(R.string.Lark_Legacy_DeleteConfirmationTitle);
                Intrinsics.checkExpressionValueIsNotNull(string, "mContext.resources.getSt…_DeleteConfirmationTitle)");
                String string2 = ChatAlbumView.m105032b(this.f72108a).getResources().getString(R.string.Lark_Legacy_DeleteConfirmationDesc);
                Intrinsics.checkExpressionValueIsNotNull(string2, "mContext.resources.getSt…y_DeleteConfirmationDesc)");
                String string3 = ChatAlbumView.m105032b(this.f72108a).getResources().getString(R.string.Lark_Legacy_DeleteConfirmationButton);
                Intrinsics.checkExpressionValueIsNotNull(string3, "mContext.resources.getSt…DeleteConfirmationButton)");
                String string4 = ChatAlbumView.m105032b(this.f72108a).getResources().getString(R.string.Lark_Legacy_Cancel);
                Intrinsics.checkExpressionValueIsNotNull(string4, "mContext.resources.getSt…tring.Lark_Legacy_Cancel)");
                ((UDDialogBuilder) ((UDDialogBuilder) ((UDDialogBuilder) ((UDDialogBuilder) eVar.title(string)).message(string2)).addActionButton(R.id.ud_dialog_btn_primary, string3, new DialogInterface$OnClickListenerC28657a(this, a))).addActionButton(R.id.ud_dialog_btn_secondary, string4, (DialogInterface.OnClickListener) null)).show();
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001a\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\b"}, d2 = {"com/ss/android/lark/album/ChatAlbumView$initActionMenu$4$onSingleClick$1", "Landroid/content/DialogInterface$OnClickListener;", "onClick", "", "dialog", "Landroid/content/DialogInterface;", "which", "", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.album.e$f$a */
        public static final class DialogInterface$OnClickListenerC28657a implements DialogInterface.OnClickListener {

            /* renamed from: a */
            final /* synthetic */ C28656f f72109a;

            /* renamed from: b */
            final /* synthetic */ ArrayList f72110b;

            DialogInterface$OnClickListenerC28657a(C28656f fVar, ArrayList arrayList) {
                this.f72109a = fVar;
                this.f72110b = arrayList;
            }

            public void onClick(DialogInterface dialogInterface, int i) {
                IChatAlbumContract.IView.Delegate aVar = this.f72109a.f72108a.f72097c;
                if (aVar != null) {
                    ArrayList arrayList = this.f72110b;
                    Intrinsics.checkExpressionValueIsNotNull(arrayList, "selectMessageIds");
                    aVar.mo101931b((List<String>) arrayList);
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "hasSelectItem", "", "onItemSelectChange"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.album.e$g */
    public static final class C28658g implements ChatImageAdapter.AbstractC28662b {

        /* renamed from: a */
        final /* synthetic */ ChatAlbumView f72111a;

        C28658g(ChatAlbumView eVar) {
            this.f72111a = eVar;
        }

        @Override // com.ss.android.lark.album.image.ChatImageAdapter.AbstractC28662b
        /* renamed from: a */
        public final void mo101955a(boolean z) {
            this.f72111a.mo101946a(z);
        }
    }

    /* renamed from: a */
    public static final /* synthetic */ C28672a m105030a(ChatAlbumView eVar) {
        C28672a aVar = eVar.f72095a;
        if (aVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mFragment");
        }
        return aVar;
    }

    /* renamed from: b */
    public static final /* synthetic */ Context m105032b(ChatAlbumView eVar) {
        Context context = eVar.f72098d;
        if (context == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mContext");
        }
        return context;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/lark/album/ChatAlbumView$initTitleBar$1", "Lcom/ss/android/lark/ui/IActionTitlebar$TextAction;", "performAction", "", "view", "Landroid/view/View;", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.album.e$h */
    public static final class C28659h extends IActionTitlebar.TextAction {

        /* renamed from: a */
        final /* synthetic */ ChatAlbumView f72112a;

        @Override // com.ss.android.lark.ui.IActionTitlebar.Action, com.ss.android.lark.ui.IActionTitlebar.BaseAction
        public void performAction(View view) {
            Intrinsics.checkParameterIsNotNull(view, "view");
            super.performAction(view);
            ChatAlbumView eVar = this.f72112a;
            eVar.f72096b = !eVar.f72096b;
            this.f72112a.mo101939a();
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C28659h(ChatAlbumView eVar, String str) {
            super(str);
            this.f72112a = eVar;
        }
    }

    @Override // com.ss.android.lark.album.IChatAlbumContract.IView
    /* renamed from: a */
    public void mo101940a(int i) {
        Context context = this.f72098d;
        if (context == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mContext");
        }
        UDToast.show(context, i);
    }

    @Override // com.ss.android.lark.album.IChatAlbumContract.IView
    /* renamed from: c */
    public void mo101952c(int i) {
        Context context = this.f72098d;
        if (context == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mContext");
        }
        LKUIToast.loadSuccess(context, i);
    }

    @Override // com.ss.android.lark.album.IChatAlbumContract.IView
    /* renamed from: d */
    public void mo101953d(int i) {
        Context context = this.f72098d;
        if (context == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mContext");
        }
        LKUIToast.loadFail(context, i);
    }

    @Override // com.ss.android.lark.album.IChatAlbumContract.IView
    /* renamed from: b */
    public void mo101948b(int i) {
        Context context = this.f72098d;
        if (context == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mContext");
        }
        LKUIToast.showLoading(context, i);
    }

    @Override // com.ss.android.lark.album.IChatAlbumContract.IView
    /* renamed from: b */
    public void mo101950b(boolean z) {
        this.f72096b = z;
        mo101939a();
        C28672a aVar = this.f72095a;
        if (aVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mFragment");
        }
        aVar.mo102015a(z);
    }

    @Override // com.ss.android.lark.album.IChatAlbumContract.IView
    /* renamed from: a */
    public void mo101944a(CharSequence charSequence) {
        Intrinsics.checkParameterIsNotNull(charSequence, "text");
        Context context = this.f72098d;
        if (context == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mContext");
        }
        LKUIToast.loadFail(context, charSequence);
    }

    @Override // com.ss.android.lark.album.IChatAlbumContract.IView
    /* renamed from: a */
    public void mo101945a(List<String> list) {
        Intrinsics.checkParameterIsNotNull(list, "messageIds");
        C28672a aVar = this.f72095a;
        if (aVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mFragment");
        }
        aVar.mo102014a(list);
    }

    /* renamed from: a */
    public final void mo101946a(boolean z) {
        if (z) {
            m105031a(R.color.lkui_N800, R.color.lkui_N900);
        } else {
            m105031a(R.color.lkui_N400, R.color.lkui_N400);
        }
    }

    /* renamed from: a */
    private final void m105031a(int i, int i2) {
        ImageView imageView = (ImageView) this.f72099f.findViewById(R.id.mergeForwardIcon);
        Context context = this.f72099f.getContext();
        Intrinsics.checkExpressionValueIsNotNull(context, "mRootView.context");
        Context context2 = this.f72098d;
        if (context2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mContext");
        }
        imageView.setImageDrawable(UDIconUtils.getIconDrawable(context, (int) R.drawable.ud_icon_forward_com_outlined, context2.getResources().getColor(i)));
        TextView textView = (TextView) this.f72099f.findViewById(R.id.mergeForwardText);
        Context context3 = this.f72098d;
        if (context3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mContext");
        }
        textView.setTextColor(context3.getResources().getColor(i2));
        ImageView imageView2 = (ImageView) this.f72099f.findViewById(R.id.forwardIcon);
        Context context4 = this.f72099f.getContext();
        Intrinsics.checkExpressionValueIsNotNull(context4, "mRootView.context");
        Context context5 = this.f72098d;
        if (context5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mContext");
        }
        imageView2.setImageDrawable(UDIconUtils.getIconDrawable(context4, (int) R.drawable.ud_icon_forward_outlined, context5.getResources().getColor(i)));
        TextView textView2 = (TextView) this.f72099f.findViewById(R.id.forwardText);
        Context context6 = this.f72098d;
        if (context6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mContext");
        }
        textView2.setTextColor(context6.getResources().getColor(i2));
        ImageView imageView3 = (ImageView) this.f72099f.findViewById(R.id.downloadIcon);
        Context context7 = this.f72099f.getContext();
        Intrinsics.checkExpressionValueIsNotNull(context7, "mRootView.context");
        Context context8 = this.f72098d;
        if (context8 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mContext");
        }
        imageView3.setImageDrawable(UDIconUtils.getIconDrawable(context7, (int) R.drawable.ud_icon_download_outlined, context8.getResources().getColor(i)));
        TextView textView3 = (TextView) this.f72099f.findViewById(R.id.downloadText);
        Context context9 = this.f72098d;
        if (context9 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mContext");
        }
        textView3.setTextColor(context9.getResources().getColor(i2));
        ImageView imageView4 = (ImageView) this.f72099f.findViewById(R.id.deleteIcon);
        Context context10 = this.f72099f.getContext();
        Intrinsics.checkExpressionValueIsNotNull(context10, "mRootView.context");
        Context context11 = this.f72098d;
        if (context11 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mContext");
        }
        imageView4.setImageDrawable(UDIconUtils.getIconDrawable(context10, (int) R.drawable.ud_icon_delete_trash_outlined, context11.getResources().getColor(i)));
        TextView textView4 = (TextView) this.f72099f.findViewById(R.id.deleteText);
        Context context12 = this.f72098d;
        if (context12 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mContext");
        }
        textView4.setTextColor(context12.getResources().getColor(i2));
    }

    @Override // com.ss.android.lark.album.IChatAlbumContract.IView
    /* renamed from: a */
    public void mo101943a(Chat chat, ArrayList<String> arrayList, int i) {
        Intrinsics.checkParameterIsNotNull(chat, "chat");
        Intrinsics.checkParameterIsNotNull(arrayList, "messageIds");
        this.f72100g.mo101908a(chat, arrayList, i);
    }

    @Override // com.ss.android.lark.album.IChatAlbumContract.IView
    /* renamed from: a */
    public void mo101941a(int i, int i2, int i3) {
        HashMap hashMap = new HashMap();
        hashMap.put("numberDownload", String.valueOf(i));
        hashMap.put("numberFailed", String.valueOf(i2));
        Context context = this.f72098d;
        if (context == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mContext");
        }
        LKUIToast.loadSuccess(context, UIHelper.mustacheFormat(i3, hashMap));
        Log.m165389i("ChatAlbumView", "requestSucceedCount : " + i + ";requestFailedCount=" + i2);
    }

    @Override // com.ss.android.lark.album.IChatAlbumContract.IView
    /* renamed from: b */
    public void mo101949b(Chat chat, ArrayList<String> arrayList, int i) {
        Intrinsics.checkParameterIsNotNull(chat, "chat");
        Intrinsics.checkParameterIsNotNull(arrayList, "messageIds");
        this.f72100g.mo101909b(chat, arrayList, i);
    }

    public ChatAlbumView(View view, ViewDependency bVar, String str, boolean z) {
        Intrinsics.checkParameterIsNotNull(view, "mRootView");
        Intrinsics.checkParameterIsNotNull(bVar, "mViewDependency");
        Intrinsics.checkParameterIsNotNull(str, "mChatId");
        this.f72099f = view;
        this.f72100g = bVar;
        this.f72101h = str;
        this.f72102i = z;
    }
}
