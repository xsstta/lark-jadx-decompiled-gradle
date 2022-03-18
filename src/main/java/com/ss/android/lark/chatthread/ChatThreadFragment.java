package com.ss.android.lark.chatthread;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import butterknife.ButterKnife;
import com.google.firebase.messaging.Constants;
import com.larksuite.suite.R;
import com.ss.android.lark.C29990c;
import com.ss.android.lark.base.fragment.BaseFragment;
import com.ss.android.lark.biz.im.api.ChatBundle;
import com.ss.android.lark.biz.im.api.OpenApp;
import com.ss.android.lark.chat.chatwindow.chat.p1613b.p1615b.C33103ae;
import com.ss.android.lark.chat.entity.chat.Chat;
import com.ss.android.lark.chat.entity.chatter.ChatChatter;
import com.ss.android.lark.chat.entity.message.Message;
import com.ss.android.lark.chat.entity.message.MessageInfo;
import com.ss.android.lark.chat.utils.C34339g;
import com.ss.android.lark.chatthread.AbstractC35135g;
import com.ss.android.lark.chatthread.p1714a.C35079a;
import com.ss.android.lark.chatthread.p1716c.C35098a;
import com.ss.android.lark.chatthread.view.ChatThreadView;
import com.ss.android.lark.chatwindow.C35228b;
import com.ss.android.lark.chatwindow.view.photo_preview.DialogMenuClickListenerImpl;
import com.ss.android.lark.dependency.AbstractC36474h;
import com.ss.android.lark.dependency.AbstractC36497m;
import com.ss.android.lark.ding.entity.DingStatus;
import com.ss.android.lark.keyboard.plugin.tool.voice.statistics.AppreciablePerformance;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.p1820e.C36913c;
import com.ss.android.lark.widget.photo_picker.C58557a;
import com.ss.android.lark.widget.photo_picker.C58630d;
import com.ss.android.lark.widget.photo_picker.C58633e;
import com.ss.android.lark.widget.photo_picker.animation.BaseData;
import com.ss.android.lark.widget.photo_picker.entity.PhotoItem;
import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\"B\u0005¢\u0006\u0002\u0010\u0002J\n\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0002J\n\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0002J\b\u0010\u000f\u001a\u00020\u0010H\u0002J\u0012\u0010\u0011\u001a\u00020\u00102\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0016J\"\u0010\u0014\u001a\u00020\u00102\u0006\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u00042\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0016J\u0006\u0010\u0019\u001a\u00020\u001aJ&\u0010\u001b\u001a\u0004\u0018\u00010\b2\u0006\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0016J\b\u0010 \u001a\u00020\u0010H\u0016J\b\u0010!\u001a\u00020\u0010H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004XD¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X.¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX.¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX.¢\u0006\u0002\n\u0000¨\u0006#"}, d2 = {"Lcom/ss/android/lark/chatthread/ChatThreadFragment;", "Lcom/ss/android/lark/base/fragment/BaseFragment;", "()V", "REQUEST_DING", "", "mChatThreadView", "Lcom/ss/android/lark/chatthread/IChatThreadContract$IThreadView;", "mRootView", "Landroid/view/View;", "mThreadPresenter", "Lcom/ss/android/lark/chatthread/ChatThreadPresenter;", "getInitData", "Lcom/ss/android/lark/chatthread/ChatThreadInitData;", "getInitData2", "Lcom/ss/android/lark/chatthread/dto/ChatThreadBundle;", "initMvp", "", "onActivityCreated", "savedInstanceState", "Landroid/os/Bundle;", "onActivityResult", "requestCode", "resultCode", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Landroid/content/Intent;", "onBackPressed", "", "onCreateView", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onDestroy", "onStop", "ViewDependence", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.chatthread.b */
public final class ChatThreadFragment extends BaseFragment {

    /* renamed from: a */
    public View f90539a;

    /* renamed from: b */
    private final int f90540b = 2;

    /* renamed from: c */
    private AbstractC35135g.AbstractC35138b f90541c;

    /* renamed from: d */
    private C35124e f90542d;

    /* renamed from: e */
    private HashMap f90543e;

    /* renamed from: b */
    public void mo129328b() {
        HashMap hashMap = this.f90543e;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, com.ss.android.lark.base.fragment.BaseFragment, androidx.fragment.app.Fragment
    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        mo129328b();
    }

    /* access modifiers changed from: private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016J\b\u0010\u0005\u001a\u00020\u0004H\u0016J\b\u0010\u0006\u001a\u00020\u0007H\u0016J\b\u0010\b\u001a\u00020\tH\u0016J\b\u0010\n\u001a\u00020\u000bH\u0016J \u0010\f\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0016J\u0010\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u0015H\u0016J\u0010\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u0018H\u0016J\u0010\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u001aH\u0016J.\u0010\u001b\u001a\u00020\u00042\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001d2\u0006\u0010\u001f\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010 \u001a\u00020!H\u0016J>\u0010\"\u001a\u00020\u00042\u0006\u0010#\u001a\u00020!2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010$\u001a\u00020\u00122\f\u0010%\u001a\b\u0012\u0004\u0012\u00020&0\u001d2\u0006\u0010'\u001a\u00020(2\u0006\u0010)\u001a\u00020!H\u0016J\u0010\u0010*\u001a\u00020\u00042\u0006\u0010+\u001a\u00020\u0010H\u0016J\b\u0010,\u001a\u00020\u0004H\u0016¨\u0006-"}, d2 = {"Lcom/ss/android/lark/chatthread/ChatThreadFragment$ViewDependence;", "Lcom/ss/android/lark/chatthread/IChatThreadContract$IThreadView$Dependency;", "(Lcom/ss/android/lark/chatthread/ChatThreadFragment;)V", "enableSecretChatStyle", "", "finish", "getActivity", "Landroid/app/Activity;", "getBaseFragment", "Landroidx/fragment/app/Fragment;", "getFragmentManager", "Landroidx/fragment/app/FragmentManager;", "gotoChatWindowActivity", "context", "Landroid/content/Context;", "chatId", "", "position", "", "injectView", "baseChatView", "Lcom/ss/android/lark/chatthread/IChatThreadContract$IThreadView;", "openAlbum", "param", "Lcom/ss/android/lark/widget/photo_picker/PhotoPicker$PhotoPickerBuilder;", "openImageReview", "Lcom/ss/android/lark/widget/photo_picker/PhotoPreviewPicker$PhotoPreviewPickerBuilder;", "showReactionListPopup", "reactionInfos", "", "Lcom/ss/android/lark/chat/entity/reaction/ReactionInfo;", "reactionType", "isP2PChat", "", "startPhotoPreview", "showSaveBtn", "currentPosition", "photoItems", "Lcom/ss/android/lark/widget/photo_picker/entity/PhotoItem;", "view", "Landroid/view/View;", "isMute", "startTranslatePreviewActivity", "messageId", "startTranslateSettingActivity", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chatthread.b$a */
    public final class ViewDependence implements AbstractC35135g.AbstractC35138b.AbstractC35140b {
        @Override // com.ss.android.lark.chatthread.view.AbstractC35205g.AbstractC35207b
        /* renamed from: a */
        public void mo129335a(String str) {
            Intrinsics.checkParameterIsNotNull(str, "messageId");
        }

        @Override // com.ss.android.lark.chatthread.view.AbstractC35205g.AbstractC35207b
        /* renamed from: a */
        public Fragment mo129329a() {
            return ChatThreadFragment.this;
        }

        @Override // com.ss.android.lark.chatthread.AbstractC35135g.AbstractC35138b.AbstractC35140b
        /* renamed from: e */
        public void mo129340e() {
            ChatThreadFragment.this.finish();
        }

        @Override // com.ss.android.lark.chatthread.AbstractC35135g.AbstractC35138b.AbstractC35140b
        /* renamed from: b */
        public Activity mo129337b() {
            FragmentActivity requireActivity = ChatThreadFragment.this.requireActivity();
            Intrinsics.checkExpressionValueIsNotNull(requireActivity, "this@ChatThreadFragment.requireActivity()");
            return requireActivity;
        }

        @Override // com.ss.android.lark.chatthread.AbstractC35135g.AbstractC35138b.AbstractC35140b
        /* renamed from: c */
        public FragmentManager mo129338c() {
            FragmentManager childFragmentManager = ChatThreadFragment.this.getChildFragmentManager();
            Intrinsics.checkExpressionValueIsNotNull(childFragmentManager, "childFragmentManager");
            return childFragmentManager;
        }

        @Override // com.ss.android.lark.chatthread.AbstractC35135g.AbstractC35138b.AbstractC35140b
        /* renamed from: d */
        public void mo129339d() {
            Activity b = mo129337b();
            if (b != null && !b.isFinishing() && (b instanceof ChatThreadActivity)) {
                ((ChatThreadActivity) b).mo129316a();
            }
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        public ViewDependence() {
        }

        /* renamed from: a */
        public void mo129332a(AbstractC35135g.AbstractC35138b bVar) {
            Intrinsics.checkParameterIsNotNull(bVar, "baseChatView");
            ButterKnife.bind(bVar, ChatThreadFragment.m136814a(ChatThreadFragment.this));
        }

        @Override // com.ss.android.lark.chatthread.view.AbstractC35205g.AbstractC35207b
        /* renamed from: a */
        public void mo129333a(C58557a.C58559a aVar) {
            Intrinsics.checkParameterIsNotNull(aVar, "param");
            Context context = ChatThreadFragment.this.getContext();
            if (context != null) {
                aVar.mo198512a(context, ChatThreadFragment.this, 233);
            }
        }

        @Override // com.ss.android.lark.chatthread.view.AbstractC35205g.AbstractC35207b
        /* renamed from: a */
        public void mo129334a(C58633e.C58634a aVar) {
            Intrinsics.checkParameterIsNotNull(aVar, "param");
            Context context = ChatThreadFragment.this.getContext();
            if (context != null) {
                aVar.mo198694a(context, ChatThreadFragment.this, 911);
            }
        }

        @Override // com.ss.android.lark.chatthread.AbstractC35135g.AbstractC35138b.AbstractC35140b
        /* renamed from: a */
        public void mo129330a(Context context, String str, int i) {
            Intrinsics.checkParameterIsNotNull(context, "context");
            Intrinsics.checkParameterIsNotNull(str, "chatId");
            C35228b.m137564a().mo121114a(context, ChatBundle.m109259a().mo105927a(str).mo105920a(i).mo105933c("chat_thread").mo105929a());
        }

        @Override // com.ss.android.lark.chatthread.view.AbstractC35205g.AbstractC35207b
        /* renamed from: a */
        public void mo129336a(boolean z, String str, int i, List<? extends PhotoItem> list, View view, boolean z2) {
            boolean z3;
            Intrinsics.checkParameterIsNotNull(str, "chatId");
            Intrinsics.checkParameterIsNotNull(list, "photoItems");
            Intrinsics.checkParameterIsNotNull(view, "view");
            DialogMenuClickListenerImpl dialogMenuClickListenerImpl = new DialogMenuClickListenerImpl(str);
            if (z) {
                AbstractC36474h b = C29990c.m110930b();
                Intrinsics.checkExpressionValueIsNotNull(b, "ChatModuleInstanceHolder.getDependency()");
                if (b.mo134586n().mo134685a("translate.message.image.viewer.enable")) {
                    z3 = true;
                    C58630d.m227367a(ChatThreadFragment.this.getContext(), list, i, view, BaseData.AnimationType.TRANSLATE_ANIMATION, z, z2, z3, dialogMenuClickListenerImpl);
                }
            }
            z3 = false;
            C58630d.m227367a(ChatThreadFragment.this.getContext(), list, i, view, BaseData.AnimationType.TRANSLATE_ANIMATION, z, z2, z3, dialogMenuClickListenerImpl);
        }
    }

    /* renamed from: d */
    private final C35079a m136816d() {
        Bundle arguments = getArguments();
        if (arguments != null) {
            return C35079a.m136809a(arguments);
        }
        return null;
    }

    /* renamed from: a */
    public final boolean mo129327a() {
        AbstractC35135g.AbstractC35138b bVar = this.f90541c;
        if (bVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mChatThreadView");
        }
        return bVar.mo129595s();
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        C35124e eVar = this.f90542d;
        if (eVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mThreadPresenter");
        }
        eVar.destroy();
        C36913c.m145732a(requireContext()).mo136289b();
        super.onDestroy();
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, androidx.fragment.app.Fragment
    public void onStop() {
        super.onStop();
        C35124e eVar = this.f90542d;
        if (eVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mThreadPresenter");
        }
        eVar.mo129502c();
        AppreciablePerformance.f104480a.mo147948f();
        C36913c.m145732a(requireContext()).mo136286a();
    }

    /* renamed from: c */
    private final C35095c m136815c() {
        Bundle arguments = getArguments();
        if (arguments != null) {
            Chat chat = (Chat) arguments.getSerializable("extra.chat");
            MessageInfo messageInfo = (MessageInfo) arguments.getSerializable("extra.message");
            if (!(chat == null || messageInfo == null)) {
                Message message = messageInfo.getMessage();
                Intrinsics.checkExpressionValueIsNotNull(message, "curMsg.getMessage()");
                if (message.getStatus() == Message.Status.DELETED) {
                    C34339g.m133166a(messageInfo);
                }
                return C35095c.m136924a().mo129405a(chat).mo129407a(messageInfo).mo129406a((ChatChatter) arguments.getSerializable("extra.selfChatter")).mo129409b((ChatChatter) arguments.getSerializable("extra.p2p.selfChatter")).mo129404a((OpenApp) arguments.getSerializable("extra.open.app")).mo129408a();
            }
        }
        return null;
    }

    /* renamed from: e */
    private final void m136817e() {
        C35098a aVar = new C35098a(m136815c(), m136816d(), C33103ae.from(getActivity()));
        FragmentActivity requireActivity = requireActivity();
        Intrinsics.checkExpressionValueIsNotNull(requireActivity, "requireActivity()");
        ChatThreadView chatThreadView = new ChatThreadView(new ViewDependence(), requireActivity, this);
        this.f90541c = chatThreadView;
        if (chatThreadView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mChatThreadView");
        }
        C35124e eVar = new C35124e(chatThreadView, aVar);
        this.f90542d = eVar;
        if (eVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mThreadPresenter");
        }
        eVar.create();
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, androidx.fragment.app.Fragment
    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        m136817e();
    }

    /* renamed from: a */
    public static final /* synthetic */ View m136814a(ChatThreadFragment bVar) {
        View view = bVar.f90539a;
        if (view == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mRootView");
        }
        return view;
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkParameterIsNotNull(layoutInflater, "inflater");
        View inflate = layoutInflater.inflate(R.layout.activity_thread2, viewGroup, false);
        Intrinsics.checkExpressionValueIsNotNull(inflate, "inflater.inflate(R.layou…hread2, container, false)");
        this.f90539a = inflate;
        if (inflate == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mRootView");
        }
        return inflate;
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityResult(int i, int i2, Intent intent) {
        Serializable serializable;
        super.onActivityResult(i, i2, intent);
        if (i2 == -1) {
            AbstractC35135g.AbstractC35138b bVar = this.f90541c;
            if (bVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mChatThreadView");
            }
            if (!bVar.mo129580a(i, i2, intent) && i == this.f90540b) {
                AbstractC36474h b = C29990c.m110930b();
                Intrinsics.checkExpressionValueIsNotNull(b, "ChatModuleInstanceHolder.getDependency()");
                AbstractC36497m J = b.mo134511J();
                Serializable serializable2 = null;
                if (intent != null) {
                    Intrinsics.checkExpressionValueIsNotNull(J, "dingDependency");
                    serializable = intent.getSerializableExtra(J.mo134662a());
                } else {
                    serializable = null;
                }
                Message message = (Message) serializable;
                if (message == null || !message.isFromMe()) {
                    Log.m165382e("ding message is abnormal");
                    return;
                }
                if (intent != null) {
                    Intrinsics.checkExpressionValueIsNotNull(J, "dingDependency");
                    serializable2 = intent.getSerializableExtra(J.mo134665b());
                }
                if (serializable2 != null) {
                    DingStatus dingStatus = (DingStatus) serializable2;
                    C35124e eVar = this.f90542d;
                    if (eVar == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mThreadPresenter");
                    }
                    eVar.mo129500a(message.getId(), dingStatus, true);
                    return;
                }
                throw new TypeCastException("null cannot be cast to non-null type com.ss.android.lark.ding.entity.DingStatus");
            }
        }
    }
}
