package com.ss.android.lark.chat.chatwindow.biz.component.keyboard;

import androidx.fragment.app.FragmentManager;
import com.ss.android.lark.base.fragment.BaseFragment;
import com.ss.android.lark.chat.chatwindow.chat.v2.model.IMessageSender;
import com.ss.android.lark.keyboard.base.NestScrollFrameLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\b\u0010\u0006\u001a\u00020\u0007H&J\b\u0010\b\u001a\u00020\tH&J\f\u0010\n\u001a\u0006\u0012\u0002\b\u00030\u000bH&J\n\u0010\f\u001a\u0004\u0018\u00010\rH&J\n\u0010\u000e\u001a\u0004\u0018\u00010\u000fH&¨\u0006\u0010"}, d2 = {"Lcom/ss/android/lark/chat/chatwindow/biz/component/keyboard/KeyboardComponentDependency;", "", "attachNestRoot", "", "nestScrollFrameLayout", "Lcom/ss/android/lark/keyboard/base/NestScrollFrameLayout;", "getBaseFragment", "Lcom/ss/android/lark/base/fragment/BaseFragment;", "getFragmentManager", "Landroidx/fragment/app/FragmentManager;", "getListScroller", "Lcom/ss/android/lark/chat/chatwindow/chat/MessageListScroller;", "getMessageSender", "Lcom/ss/android/lark/chat/chatwindow/chat/v2/model/IMessageSender;", "getRootView", "Lcom/larksuite/component/ui/layout/ILKUILayout;", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.chat.chatwindow.biz.component.keyboard.f */
public interface KeyboardComponentDependency {

    @Metadata(bv = {1, 0, 3}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.chatwindow.biz.component.keyboard.f$a */
    public static final class C33038a {
        /* renamed from: a */
        public static void m127762a(KeyboardComponentDependency fVar, NestScrollFrameLayout nestScrollFrameLayout) {
            Intrinsics.checkParameterIsNotNull(nestScrollFrameLayout, "nestScrollFrameLayout");
        }
    }

    /* renamed from: a */
    FragmentManager mo122090a();

    /* renamed from: a */
    void mo122091a(NestScrollFrameLayout nestScrollFrameLayout);

    /* renamed from: b */
    BaseFragment mo122092b();

    /* renamed from: c */
    IMessageSender mo122093c();
}
