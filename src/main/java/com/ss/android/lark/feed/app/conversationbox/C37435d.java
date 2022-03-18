package com.ss.android.lark.feed.app.conversationbox;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import butterknife.ButterKnife;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.ss.android.eventbus.EventBus;
import com.ss.android.lark.chat.entity.chat.Chat;
import com.ss.android.lark.desktopmode.C36512a;
import com.ss.android.lark.desktopmode.C36529b;
import com.ss.android.lark.desktopmode.base.ContainerType;
import com.ss.android.lark.desktopmode.base.MainWindowParams;
import com.ss.android.lark.desktopmode.utils.DesktopUtil;
import com.ss.android.lark.feed.app.conversationbox.mvp.C37461b;
import com.ss.android.lark.feed.app.conversationbox.mvp.ConversationBoxView;
import com.ss.android.lark.feed.app.entity.ChatFeedPreview;
import com.ss.android.lark.feed.app.model.event.ChatStartEvent;
import com.ss.android.lark.feed.app.view.title.FeedListTitle;
import com.ss.android.lark.feed.p1847a.C37268c;
import com.ss.android.lark.feed.statistics.chatbox.ChatBoxHitPoint;
import com.ss.android.lark.log.Log;

/* renamed from: com.ss.android.lark.feed.app.conversationbox.d */
public class C37435d extends Fragment {

    /* renamed from: a */
    private C37461b f96037a;

    /* renamed from: b */
    private String f96038b;

    /* renamed from: c */
    private ConversationBoxView.AbstractC37448a f96039c = new ConversationBoxView.AbstractC37448a() {
        /* class com.ss.android.lark.feed.app.conversationbox.C37435d.C374361 */

        @Override // com.ss.android.lark.feed.app.conversationbox.mvp.ConversationBoxView.AbstractC37448a
        /* renamed from: a */
        public void mo137354a() {
            C37435d.this.mo137353a();
        }

        @Override // com.ss.android.lark.feed.app.conversationbox.mvp.ConversationBoxView.AbstractC37448a
        /* renamed from: a */
        public void mo137355a(ConversationBoxView conversationBoxView) {
            ButterKnife.bind(conversationBoxView, C37435d.this.getView());
        }

        @Override // com.ss.android.lark.feed.app.conversationbox.mvp.ConversationBoxView.AbstractC37448a
        /* renamed from: a */
        public void mo137356a(String str, ChatFeedPreview chatFeedPreview, IGetDataCallback<Chat> iGetDataCallback) {
            ChatBoxHitPoint.f97733a.mo139409a();
            ChatBoxHitPoint.f97733a.mo139411a(new C37434c().mo137351a(chatFeedPreview), "feed");
            C37268c.m146766b().mo139154A().mo139236a(C37435d.this.getActivity(), str, chatFeedPreview.getChatMode(), chatFeedPreview.isSecret(), "feed", "feed", iGetDataCallback);
        }
    };

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        C37461b bVar = this.f96037a;
        if (bVar != null) {
            bVar.destroy();
        }
    }

    /* renamed from: b */
    private void m147325b() {
        C37461b bVar = new C37461b(getActivity(), this.f96039c, this.f96038b);
        this.f96037a = bVar;
        bVar.create();
    }

    /* renamed from: a */
    public void mo137353a() {
        FragmentActivity activity = getActivity();
        if (activity != null) {
            if (!DesktopUtil.m144301a((Context) activity)) {
                activity.finish();
            } else if (getParentFragment() != null) {
                getParentFragment().getChildFragmentManager().beginTransaction().remove(this).commitAllowingStateLoss();
                C36529b bVar = new C36529b();
                Bundle bundle = new Bundle();
                bundle.putInt("holder", R.drawable.empty_default_icon);
                bVar.setArguments(bundle);
                C36512a.m144041a().mo134763a(bVar, new MainWindowParams.C36570a(ContainerType.Right).mo134958a("conversation").mo134930b());
                EventBus.getDefault().trigger(new ChatStartEvent(null));
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        this.f96038b = getArguments().getString("parent_card_id");
        Log.m165389i("ConversationBoxActivity", "parent_card_id = " + this.f96038b);
        if (TextUtils.isEmpty(this.f96038b)) {
            mo137353a();
        }
        m147325b();
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.activity_conversation_box, viewGroup, false);
        if (viewGroup.getId() != 16908290) {
            inflate.setPadding(0, UIUtils.dp2px(viewGroup.getContext(), FeedListTitle.f97612a), 0, 0);
        }
        return inflate;
    }
}
