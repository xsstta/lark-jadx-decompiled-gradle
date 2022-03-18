package com.ss.android.lark.chatsetting.impl.post;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.firebase.messaging.Constants;
import com.larksuite.suite.R;
import com.ss.android.lark.chat.entity.chat.Chat;
import com.ss.android.lark.chat.entity.chatter.Chatter;
import com.ss.android.lark.chatsetting.ChatSettingModule;
import com.ss.android.lark.chatsetting.dto.SelectChatterDTO;
import com.ss.android.lark.chatsetting.impl.post.PostTypeSettingView;
import com.ss.android.lark.chatsetting.p1693a.AbstractC34461c;
import com.ss.android.lark.desktopmode.base.FloatWindowParams;
import com.ss.android.lark.desktopmode.p1787a.C36516a;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\u0012\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0002J\u0012\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\rH\u0016J\"\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00132\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0016J&\u0010\u0017\u001a\u0004\u0018\u00010\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001c2\b\u0010\u0010\u001a\u0004\u0018\u00010\rH\u0016R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u000e\u0010\b\u001a\u00020\tX.¢\u0006\u0002\n\u0000¨\u0006\u001d"}, d2 = {"Lcom/ss/android/lark/chatsetting/impl/post/PostTypeSettingFragment;", "Lcom/ss/android/lark/desktopmode/app/DesktopCompatFragment;", "Lcom/ss/android/lark/desktopmode/base/FloatWindowParams;", "()V", "dependency", "Lcom/ss/android/lark/chatsetting/impl/post/PostTypeSettingView$ViewDependency;", "getDependency", "()Lcom/ss/android/lark/chatsetting/impl/post/PostTypeSettingView$ViewDependency;", "presenter", "Lcom/ss/android/lark/chatsetting/impl/post/PostTypeSettingPresenter;", "initMVP", "", "bundle", "Landroid/os/Bundle;", "onActivityCreated", "", "savedInstanceState", "onActivityResult", "requestCode", "", "resultCode", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Landroid/content/Intent;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "im_chatsetting_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.chatsetting.impl.post.b */
public final class PostTypeSettingFragment extends C36516a<FloatWindowParams> {

    /* renamed from: a */
    private PostTypeSettingPresenter f90438a;

    /* renamed from: b */
    private final PostTypeSettingView.ViewDependency f90439b = new C35054a(this);

    /* renamed from: c */
    private HashMap f90440c;

    /* renamed from: a */
    public void mo129145a() {
        HashMap hashMap = this.f90440c;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, androidx.fragment.app.Fragment
    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        mo129145a();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000-\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J(\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0016\u0010\u0007\u001a\u0012\u0012\u0004\u0012\u00020\u00060\bj\b\u0012\u0004\u0012\u00020\u0006`\tH\u0016J\"\u0010\n\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\r\u001a\u0004\u0018\u00010\u0006H\u0016¨\u0006\u000e"}, d2 = {"com/ss/android/lark/chatsetting/impl/post/PostTypeSettingFragment$dependency$1", "Lcom/ss/android/lark/chatsetting/impl/post/PostTypeSettingView$ViewDependency;", "closeCurrent", "", "openEditWhiteListPage", "chatId", "", "whiteList", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "openProfile", "chatter", "Lcom/ss/android/lark/chat/entity/chatter/Chatter;", "chatName", "im_chatsetting_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chatsetting.impl.post.b$a */
    public static final class C35054a implements PostTypeSettingView.ViewDependency {

        /* renamed from: a */
        final /* synthetic */ PostTypeSettingFragment f90441a;

        @Override // com.ss.android.lark.chatsetting.impl.post.PostTypeSettingView.ViewDependency
        /* renamed from: a */
        public void mo129146a() {
            this.f90441a.finish();
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C35054a(PostTypeSettingFragment bVar) {
            this.f90441a = bVar;
        }

        @Override // com.ss.android.lark.chatsetting.impl.post.PostTypeSettingView.ViewDependency
        /* renamed from: a */
        public void mo129148a(String str, ArrayList<String> arrayList) {
            Intrinsics.checkParameterIsNotNull(str, "chatId");
            Intrinsics.checkParameterIsNotNull(arrayList, "whiteList");
            AbstractC34461c a = ChatSettingModule.m133639a();
            Intrinsics.checkExpressionValueIsNotNull(a, "ChatSettingModule.getDependency()");
            AbstractC34461c.AbstractC34473l k = a.mo127281k();
            if (k != null) {
                k.mo127407a(this.f90441a, str, arrayList, 12045);
            }
        }

        @Override // com.ss.android.lark.chatsetting.impl.post.PostTypeSettingView.ViewDependency
        /* renamed from: a */
        public void mo129147a(Chatter chatter, String str, String str2) {
            Intrinsics.checkParameterIsNotNull(chatter, "chatter");
            Intrinsics.checkParameterIsNotNull(str, "chatId");
            if (chatter.isProfileEnable() && chatter.isUser()) {
                AbstractC34461c a = ChatSettingModule.m133639a();
                Intrinsics.checkExpressionValueIsNotNull(a, "ChatSettingModule.getDependency()");
                a.mo127280j().mo127422a(this.f90441a.getContext(), chatter, null, str, str2);
            }
        }
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, androidx.fragment.app.Fragment
    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        if (!m136560a(getArguments())) {
            finish();
            return;
        }
        PostTypeSettingPresenter eVar = this.f90438a;
        if (eVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("presenter");
        }
        eVar.create();
    }

    /* renamed from: a */
    private final boolean m136560a(Bundle bundle) {
        if (bundle == null) {
            return false;
        }
        String string = bundle.getString("extra_chat_id", "");
        String string2 = bundle.getString("extra_owner_id", "");
        Serializable serializable = bundle.getSerializable("extra_post_type");
        if (!(serializable instanceof Chat.PostType)) {
            serializable = null;
        }
        Chat.PostType postType = (Chat.PostType) serializable;
        Serializable serializable2 = bundle.getSerializable("extra_is_thread_chat");
        if (serializable2 != null) {
            boolean booleanValue = ((Boolean) serializable2).booleanValue();
            if (TextUtils.isEmpty(string) || TextUtils.isEmpty(string2) || postType == null || getView() == null) {
                return false;
            }
            View view = getView();
            if (view == null) {
                Intrinsics.throwNpe();
            }
            Intrinsics.checkExpressionValueIsNotNull(view, "view!!");
            PostTypeSettingView.ViewDependency bVar = this.f90439b;
            Intrinsics.checkExpressionValueIsNotNull(string, "chatId");
            Intrinsics.checkExpressionValueIsNotNull(string2, "ownerId");
            this.f90438a = new PostTypeSettingPresenter(view, bVar, string, string2, postType, booleanValue);
            return true;
        }
        throw new TypeCastException("null cannot be cast to non-null type kotlin.Boolean");
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkParameterIsNotNull(layoutInflater, "inflater");
        return layoutInflater.inflate(R.layout.activity_post_type_setting, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 12045 && i2 == -1 && intent != null) {
            AbstractC34461c a = ChatSettingModule.m133639a();
            Intrinsics.checkExpressionValueIsNotNull(a, "ChatSettingModule.getDependency()");
            List<SelectChatterDTO> a2 = a.mo127281k().mo127399a(intent);
            if (a2 != null) {
                PostTypeSettingPresenter eVar = this.f90438a;
                if (eVar == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("presenter");
                }
                eVar.mo129155a(a2);
            }
        }
    }
}
