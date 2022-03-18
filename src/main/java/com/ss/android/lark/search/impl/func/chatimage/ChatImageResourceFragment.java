package com.ss.android.lark.search.impl.func.chatimage;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentManager;
import com.google.firebase.messaging.Constants;
import com.larksuite.suite.R;
import com.ss.android.lark.base.fragment.BaseFragment;
import com.ss.android.lark.chat.entity.chat.Chat;
import com.ss.android.lark.search.C53258a;
import com.ss.android.lark.search.dependency.ISearchModuleDependency;
import com.ss.android.lark.search.impl.func.chatimage.ChatImageResourceView;
import java.util.ArrayList;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u00162\u00020\u0001:\u0002\u0016\u0017B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0005\u001a\u00020\u0006H\u0002J\u0012\u0010\u0007\u001a\u00020\u00062\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0016J\"\u0010\n\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0016J&\u0010\u0010\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u00152\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0016R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u0002\n\u0000¨\u0006\u0018"}, d2 = {"Lcom/ss/android/lark/search/impl/func/chatimage/ChatImageResourceFragment;", "Lcom/ss/android/lark/base/fragment/BaseFragment;", "()V", "mPresenter", "Lcom/ss/android/lark/search/impl/func/chatimage/ChatImageResourcePresenter;", "initMVP", "", "onActivityCreated", "savedInstanceState", "Landroid/os/Bundle;", "onActivityResult", "requestCode", "", "resultCode", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Landroid/content/Intent;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "Companion", "Dependency", "core_search_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.search.impl.func.chatimage.a */
public final class ChatImageResourceFragment extends BaseFragment {

    /* renamed from: a */
    public static final String f131952a = "chat_id";

    /* renamed from: b */
    public static final String f131953b = "is_thread";

    /* renamed from: c */
    public static final Companion f131954c = new Companion(null);

    /* renamed from: d */
    private ChatImageResourcePresenter f131955d;

    /* renamed from: e */
    private HashMap f131956e;

    /* renamed from: a */
    public void mo182366a() {
        HashMap hashMap = this.f131956e;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, com.ss.android.lark.base.fragment.BaseFragment, androidx.fragment.app.Fragment
    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        mo182366a();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\u00020\u0004XD¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u0004XD¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/ss/android/lark/search/impl/func/chatimage/ChatImageResourceFragment$Companion;", "", "()V", "KEY_CHAT_ID", "", "getKEY_CHAT_ID", "()Ljava/lang/String;", "KEY_IS_THREAD", "getKEY_IS_THREAD", "core_search_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.search.impl.func.chatimage.a$a */
    public static final class Companion {
        private Companion() {
        }

        /* renamed from: a */
        public final String mo182367a() {
            return ChatImageResourceFragment.f131952a;
        }

        /* renamed from: b */
        public final String mo182368b() {
            return ChatImageResourceFragment.f131953b;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016J0\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0016\u0010\t\u001a\u0012\u0012\u0004\u0012\u00020\u000b0\nj\b\u0012\u0004\u0012\u00020\u000b`\f2\u0006\u0010\r\u001a\u00020\u000eH\u0016J0\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0016\u0010\t\u001a\u0012\u0012\u0004\u0012\u00020\u000b0\nj\b\u0012\u0004\u0012\u00020\u000b`\f2\u0006\u0010\r\u001a\u00020\u000eH\u0016¨\u0006\u0010"}, d2 = {"Lcom/ss/android/lark/search/impl/func/chatimage/ChatImageResourceFragment$Dependency;", "Lcom/ss/android/lark/search/impl/func/chatimage/ChatImageResourceView$ViewDependency;", "(Lcom/ss/android/lark/search/impl/func/chatimage/ChatImageResourceFragment;)V", "getSupportFragmentManager", "Landroidx/fragment/app/FragmentManager;", "onForward", "", "chat", "Lcom/ss/android/lark/chat/entity/chat/Chat;", "selectedMessageIds", "Ljava/util/ArrayList;", "", "Lkotlin/collections/ArrayList;", "requestCode", "", "onMergeForward", "core_search_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.search.impl.func.chatimage.a$b */
    public final class Dependency implements ChatImageResourceView.ViewDependency {
        @Override // com.ss.android.lark.search.impl.func.chatimage.ChatImageResourceView.ViewDependency
        /* renamed from: a */
        public FragmentManager mo182369a() {
            FragmentManager childFragmentManager = ChatImageResourceFragment.this.getChildFragmentManager();
            Intrinsics.checkExpressionValueIsNotNull(childFragmentManager, "childFragmentManager");
            return childFragmentManager;
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        public Dependency() {
        }

        @Override // com.ss.android.lark.search.impl.func.chatimage.ChatImageResourceView.ViewDependency
        /* renamed from: a */
        public void mo182370a(Chat chat, ArrayList<String> arrayList, int i) {
            Intrinsics.checkParameterIsNotNull(chat, "chat");
            Intrinsics.checkParameterIsNotNull(arrayList, "selectedMessageIds");
            ISearchModuleDependency a = C53258a.m205939a();
            Intrinsics.checkExpressionValueIsNotNull(a, "SearchModule.getDependency()");
            a.mo181766o().mo181824a(ChatImageResourceFragment.this.getActivity(), ChatImageResourceFragment.this, chat, arrayList, i);
        }

        @Override // com.ss.android.lark.search.impl.func.chatimage.ChatImageResourceView.ViewDependency
        /* renamed from: b */
        public void mo182371b(Chat chat, ArrayList<String> arrayList, int i) {
            Intrinsics.checkParameterIsNotNull(chat, "chat");
            Intrinsics.checkParameterIsNotNull(arrayList, "selectedMessageIds");
            ISearchModuleDependency a = C53258a.m205939a();
            Intrinsics.checkExpressionValueIsNotNull(a, "SearchModule.getDependency()");
            a.mo181766o().mo181825b(ChatImageResourceFragment.this.getActivity(), ChatImageResourceFragment.this, chat, arrayList, i);
        }
    }

    /* renamed from: b */
    private final void m206711b() {
        Bundle arguments;
        if (getView() != null && (arguments = getArguments()) != null) {
            String string = arguments.getString(f131952a, "");
            boolean z = arguments.getBoolean(f131953b, false);
            View view = getView();
            if (view == null) {
                Intrinsics.throwNpe();
            }
            Intrinsics.checkExpressionValueIsNotNull(view, "view!!");
            Intrinsics.checkExpressionValueIsNotNull(string, "chatId");
            ChatImageResourcePresenter dVar = new ChatImageResourcePresenter(view, new Dependency(), string, z);
            this.f131955d = dVar;
            if (dVar != null) {
                dVar.create();
            }
        }
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, androidx.fragment.app.Fragment
    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        m206711b();
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        ChatImageResourcePresenter dVar = this.f131955d;
        if (dVar != null) {
            dVar.mo182380a(i, i2, intent);
        }
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkParameterIsNotNull(layoutInflater, "inflater");
        return layoutInflater.inflate(R.layout.fragment_chat_image_resource, viewGroup, false);
    }
}
