package com.ss.android.lark.feed.app.delayed;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
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
import com.ss.android.lark.desktopmode.p1787a.C36516a;
import com.ss.android.lark.desktopmode.utils.DesktopUtil;
import com.ss.android.lark.feed.app.delayed.mvp.C37519b;
import com.ss.android.lark.feed.app.delayed.mvp.DelayedFeedView;
import com.ss.android.lark.feed.app.entity.ChatFeedPreview;
import com.ss.android.lark.feed.app.entity.DocFeedPreview;
import com.ss.android.lark.feed.app.entity.LittleAppFeedPreview;
import com.ss.android.lark.feed.app.model.event.ChatStartEvent;
import com.ss.android.lark.feed.app.view.title.FeedListTitle;
import com.ss.android.lark.feed.p1847a.C37268c;
import com.ss.android.lark.feed.p1871b.AbstractC38037a;

/* renamed from: com.ss.android.lark.feed.app.delayed.c */
public class C37493c extends C36516a<MainWindowParams> {

    /* renamed from: a */
    public AbstractC38037a.AbstractC38046f f96160a = C37268c.m146766b().mo139202u();

    /* renamed from: b */
    private C37519b f96161b;

    /* renamed from: a */
    private DelayedFeedView.AbstractC37506a m147499a() {
        return new DelayedFeedView.AbstractC37506a() {
            /* class com.ss.android.lark.feed.app.delayed.C37493c.C374941 */

            @Override // com.ss.android.lark.feed.app.delayed.mvp.DelayedFeedView.AbstractC37506a
            /* renamed from: c */
            public void mo137487c() {
                C37268c.m146766b().mo139173a(2);
            }

            @Override // com.ss.android.lark.feed.app.delayed.mvp.DelayedFeedView.AbstractC37506a
            /* renamed from: a */
            public void mo137480a() {
                FragmentActivity activity = C37493c.this.getActivity();
                if (activity != null) {
                    if (!DesktopUtil.m144301a((Context) activity)) {
                        activity.finish();
                    } else if (C37493c.this.getParentFragment() != null) {
                        C37493c.this.getParentFragment().getChildFragmentManager().beginTransaction().remove(C37493c.this).commitAllowingStateLoss();
                        mo137486b();
                    }
                }
            }

            @Override // com.ss.android.lark.feed.app.delayed.mvp.DelayedFeedView.AbstractC37506a
            /* renamed from: b */
            public void mo137486b() {
                if (DesktopUtil.m144301a(C37493c.this.getContext())) {
                    C36529b bVar = new C36529b();
                    Bundle bundle = new Bundle();
                    bundle.putInt("holder", R.drawable.empty_default_icon);
                    bVar.setArguments(bundle);
                    C36512a.m144041a().mo134763a(bVar, new MainWindowParams.C36570a(ContainerType.Right).mo134958a("conversation").mo134930b());
                    EventBus.getDefault().trigger(new ChatStartEvent(null));
                }
            }

            @Override // com.ss.android.lark.feed.app.delayed.mvp.DelayedFeedView.AbstractC37506a
            /* renamed from: a */
            public void mo137481a(DelayedFeedView delayedFeedView) {
                ButterKnife.bind(delayedFeedView, C37493c.this.getView());
            }

            @Override // com.ss.android.lark.feed.app.delayed.mvp.DelayedFeedView.AbstractC37506a
            /* renamed from: a */
            public void mo137483a(LittleAppFeedPreview littleAppFeedPreview) {
                C37268c.m146766b().mo139179a(littleAppFeedPreview.getId(), littleAppFeedPreview.getId(), littleAppFeedPreview.getSchema(), littleAppFeedPreview.getLastAppNotificationId());
            }

            @Override // com.ss.android.lark.feed.app.delayed.mvp.DelayedFeedView.AbstractC37506a
            /* renamed from: a */
            public void mo137482a(DocFeedPreview docFeedPreview) {
                C37268c.m146766b().mo139196o().mo139416a();
                String docUrl = docFeedPreview.getDocUrl();
                AbstractC38037a.AbstractC38051k z = C37268c.m146766b().mo139207z();
                if (z != null) {
                    docUrl = z.mo139252a(docFeedPreview.getDocUrl(), docFeedPreview.buildQuerys());
                }
                C37493c.this.f96160a.mo139233a(C37493c.this.getActivity(), docUrl, "docs_feed", docFeedPreview.buildExtra());
            }

            @Override // com.ss.android.lark.feed.app.delayed.mvp.DelayedFeedView.AbstractC37506a
            /* renamed from: a */
            public void mo137484a(String str, int i) {
                C37268c.m146766b().mo139154A().mo139237a(C37493c.this.getActivity(), str, true, i);
            }

            @Override // com.ss.android.lark.feed.app.delayed.mvp.DelayedFeedView.AbstractC37506a
            /* renamed from: a */
            public void mo137485a(String str, ChatFeedPreview chatFeedPreview, IGetDataCallback<Chat> iGetDataCallback) {
                C37268c.m146766b().mo139154A().mo139236a(C37493c.this.getActivity(), str, chatFeedPreview.getChatMode(), chatFeedPreview.isSecret(), "feed", "feed", iGetDataCallback);
            }
        };
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        C37519b bVar = this.f96161b;
        if (bVar != null) {
            bVar.destroy();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        C37519b bVar = new C37519b(getActivity(), m147499a());
        this.f96161b = bVar;
        bVar.create();
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.activity_delayed_feed, viewGroup, false);
        if (viewGroup.getId() != 16908290) {
            inflate.setPadding(0, UIUtils.dp2px(viewGroup.getContext(), FeedListTitle.f97612a), 0, 0);
        }
        return inflate;
    }
}
