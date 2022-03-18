package com.ss.android.lark.album;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentManager;
import com.google.firebase.messaging.Constants;
import com.larksuite.suite.R;
import com.ss.android.lark.C29990c;
import com.ss.android.lark.album.ChatAlbumView;
import com.ss.android.lark.base.fragment.BaseFragment;
import com.ss.android.lark.chat.entity.chat.Chat;
import com.ss.android.lark.dependency.AbstractC36474h;
import java.util.ArrayList;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u00162\u00020\u0001:\u0002\u0016\u0017B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0005\u001a\u00020\u0006H\u0002J\u0012\u0010\u0007\u001a\u00020\u00062\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0016J\"\u0010\n\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0016J&\u0010\u0010\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u00152\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0016R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u0002\n\u0000¨\u0006\u0018"}, d2 = {"Lcom/ss/android/lark/album/ChatAlbumFragment;", "Lcom/ss/android/lark/base/fragment/BaseFragment;", "()V", "mPresenter", "Lcom/ss/android/lark/album/ChatAlbumPresenter;", "initMVP", "", "onActivityCreated", "savedInstanceState", "Landroid/os/Bundle;", "onActivityResult", "requestCode", "", "resultCode", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Landroid/content/Intent;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "Companion", "Dependency", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.album.a */
public final class ChatAlbumFragment extends BaseFragment {

    /* renamed from: a */
    public static final String f72059a = "chat_id";

    /* renamed from: b */
    public static final String f72060b = "is_thread";

    /* renamed from: c */
    public static final Companion f72061c = new Companion(null);

    /* renamed from: d */
    private ChatAlbumPresenter f72062d;

    /* renamed from: e */
    private HashMap f72063e;

    /* renamed from: a */
    public void mo101904a() {
        HashMap hashMap = this.f72063e;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, com.ss.android.lark.base.fragment.BaseFragment, androidx.fragment.app.Fragment
    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        mo101904a();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\u00020\u0004XD¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u0004XD¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/ss/android/lark/album/ChatAlbumFragment$Companion;", "", "()V", "KEY_CHAT_ID", "", "getKEY_CHAT_ID", "()Ljava/lang/String;", "KEY_IS_THREAD", "getKEY_IS_THREAD", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.album.a$a */
    public static final class Companion {
        private Companion() {
        }

        /* renamed from: a */
        public final String mo101905a() {
            return ChatAlbumFragment.f72059a;
        }

        /* renamed from: b */
        public final String mo101906b() {
            return ChatAlbumFragment.f72060b;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016J0\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0016\u0010\t\u001a\u0012\u0012\u0004\u0012\u00020\u000b0\nj\b\u0012\u0004\u0012\u00020\u000b`\f2\u0006\u0010\r\u001a\u00020\u000eH\u0016J0\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0016\u0010\t\u001a\u0012\u0012\u0004\u0012\u00020\u000b0\nj\b\u0012\u0004\u0012\u00020\u000b`\f2\u0006\u0010\r\u001a\u00020\u000eH\u0016¨\u0006\u0010"}, d2 = {"Lcom/ss/android/lark/album/ChatAlbumFragment$Dependency;", "Lcom/ss/android/lark/album/ChatAlbumView$ViewDependency;", "(Lcom/ss/android/lark/album/ChatAlbumFragment;)V", "getSupportFragmentManager", "Landroidx/fragment/app/FragmentManager;", "onForward", "", "chat", "Lcom/ss/android/lark/chat/entity/chat/Chat;", "selectedMessageIds", "Ljava/util/ArrayList;", "", "Lkotlin/collections/ArrayList;", "requestCode", "", "onMergeForward", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.album.a$b */
    public final class Dependency implements ChatAlbumView.ViewDependency {
        @Override // com.ss.android.lark.album.ChatAlbumView.ViewDependency
        /* renamed from: a */
        public FragmentManager mo101907a() {
            FragmentManager childFragmentManager = ChatAlbumFragment.this.getChildFragmentManager();
            Intrinsics.checkExpressionValueIsNotNull(childFragmentManager, "childFragmentManager");
            return childFragmentManager;
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        public Dependency() {
        }

        @Override // com.ss.android.lark.album.ChatAlbumView.ViewDependency
        /* renamed from: a */
        public void mo101908a(Chat chat, ArrayList<String> arrayList, int i) {
            Intrinsics.checkParameterIsNotNull(chat, "chat");
            Intrinsics.checkParameterIsNotNull(arrayList, "selectedMessageIds");
            AbstractC36474h b = C29990c.m110930b();
            Intrinsics.checkExpressionValueIsNotNull(b, "ChatModuleInstanceHolder.getDependency()");
            b.mo134506E().mo134373a(ChatAlbumFragment.this.getActivity(), ChatAlbumFragment.this, chat, arrayList, i, "click", "chat", false, "");
        }

        @Override // com.ss.android.lark.album.ChatAlbumView.ViewDependency
        /* renamed from: b */
        public void mo101909b(Chat chat, ArrayList<String> arrayList, int i) {
            Intrinsics.checkParameterIsNotNull(chat, "chat");
            Intrinsics.checkParameterIsNotNull(arrayList, "selectedMessageIds");
            AbstractC36474h b = C29990c.m110930b();
            Intrinsics.checkExpressionValueIsNotNull(b, "ChatModuleInstanceHolder.getDependency()");
            b.mo134506E().mo134372a(ChatAlbumFragment.this.getActivity(), ChatAlbumFragment.this, chat, arrayList, i, "click", "chat", "");
        }
    }

    /* renamed from: b */
    private final void m104995b() {
        Bundle arguments;
        View view = getView();
        if (view != null && (arguments = getArguments()) != null) {
            String string = arguments.getString(f72059a, "");
            boolean z = arguments.getBoolean(f72060b, false);
            Intrinsics.checkExpressionValueIsNotNull(view, "view");
            Intrinsics.checkExpressionValueIsNotNull(string, "chatId");
            ChatAlbumPresenter dVar = new ChatAlbumPresenter(view, new Dependency(), string, z);
            this.f72062d = dVar;
            if (dVar != null) {
                dVar.create();
            }
        }
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, androidx.fragment.app.Fragment
    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        m104995b();
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        ChatAlbumPresenter dVar = this.f72062d;
        if (dVar != null) {
            dVar.mo101920a(i, i2, intent);
        }
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkParameterIsNotNull(layoutInflater, "inflater");
        return layoutInflater.inflate(R.layout.fragment_chat_album, viewGroup, false);
    }
}
