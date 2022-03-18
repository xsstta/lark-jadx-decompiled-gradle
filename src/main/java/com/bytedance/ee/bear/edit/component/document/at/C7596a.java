package com.bytedance.ee.bear.edit.component.document.at;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.AbstractC1178x;
import com.bytedance.ee.bear.atbottombar.AtBottomBar;
import com.bytedance.ee.bear.atbottombar.C4255a;
import com.bytedance.ee.bear.atfinder.AtFinderJsCallbackData;
import com.bytedance.ee.bear.atfinder.MentionModel;
import com.bytedance.ee.bear.bean.C4520c;
import com.bytedance.ee.bear.browser.plugin.C4950k;
import com.bytedance.ee.bear.document.toolbar.editpanels.AbstractC6214a;
import com.bytedance.ee.bear.document.toolbar.editpanels.C6215b;
import com.bytedance.ee.bear.facade.common.AbstractC7710h;
import com.bytedance.ee.bear.facade.common.AbstractC7719m;
import com.bytedance.ee.bear.facade.common.C7667e;
import com.bytedance.ee.bear.p522q.p523a.AbstractC10549e;
import com.bytedance.ee.bear.p522q.p523a.AbstractC10550f;
import com.bytedance.ee.bear.p522q.p523a.C10548d;
import com.bytedance.ee.bear.thread.C11678b;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.p718t.C13742g;
import com.larksuite.suite.R;
import io.reactivex.AbstractC68307f;
import io.reactivex.AbstractC68323g;
import io.reactivex.AbstractC68324h;
import io.reactivex.BackpressureStrategy;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Function;
import java.util.concurrent.TimeUnit;

/* renamed from: com.bytedance.ee.bear.edit.component.document.at.a */
public class C7596a extends C7667e implements AbstractC10549e {

    /* renamed from: b */
    static final /* synthetic */ boolean f20614b = true;

    /* renamed from: a */
    public AtBottomBar f20615a;

    /* renamed from: c */
    private C6215b f20616c;

    /* renamed from: d */
    private C7599b f20617d;

    /* renamed from: e */
    private FragmentActivity f20618e;

    /* renamed from: f */
    private Runnable f20619f = new Runnable() {
        /* class com.bytedance.ee.bear.edit.component.document.at.$$Lambda$a$FkQRsJOaMJNe1ZbtUs1AeMJYtw */

        public final void run() {
            C7596a.this.m30472a();
        }
    };

    /* renamed from: g */
    private AbstractC68323g<AtFinderJsCallbackData> f20620g;

    /* renamed from: h */
    private Disposable f20621h;

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m30472a() {
        boolean z;
        if (this.f20616c.getActiveEditPanel().mo5927b() != null) {
            z = f20614b;
        } else {
            z = false;
        }
        if (!z) {
            C13479a.m54764b("AtPanelFragment", "dismissKeyboardIfNoActivePanel");
            C10548d.m43696a((Context) this.f20618e);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        C13742g.m55710c(this.f20619f);
        Disposable disposable = this.f20621h;
        if (disposable != null && !disposable.isDisposed()) {
            this.f20621h.dispose();
        }
    }

    @Override // com.bytedance.ee.bear.facade.common.C7667e, com.bytedance.ee.bear.facade.common.C7718l, androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        if (getActivity() != null && !getActivity().getSupportFragmentManager().isDestroyed()) {
            AbstractC10550f.AbstractC10551a.m43717b(getActivity()).mo39928b(this);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m30476a(AbstractC68323g gVar) throws Exception {
        this.f20620g = gVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public /* synthetic */ AtFinderJsCallbackData m30481d(AtFinderJsCallbackData atFinderJsCallbackData) throws Exception {
        m30474a(atFinderJsCallbackData);
        return atFinderJsCallbackData;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m30479b(AbstractC6214a aVar) {
        C13742g.m55710c(this.f20619f);
        if (aVar == null) {
            C13742g.m55706a(this.f20619f, 500);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public /* synthetic */ void m30478b(AtFinderJsCallbackData atFinderJsCallbackData) {
        AbstractC68323g<AtFinderJsCallbackData> gVar = this.f20620g;
        if (gVar == null || gVar.isCancelled()) {
            C13479a.m54758a("AtPanelFragment", "onViewCreated(): mEmitter is null");
        } else {
            this.f20620g.onNext(atFinderJsCallbackData);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m30473a(int i) {
        int keyboardHeight = i + this.f20617d.getKeyboardHeight();
        if (getActivity() != null) {
            this.f20616c.setPanelHeight(keyboardHeight + getActivity().getResources().getDimensionPixelSize(R.dimen.toolbar_menu_height), "AtPanel");
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ void m30477a(Throwable th) throws Exception {
        C13479a.m54765b("AtPanelFragment", "onViewCreated(): subscribe callbackData failed", new Throwable());
    }

    @Override // com.bytedance.ee.bear.facade.common.C7667e, com.bytedance.ee.bear.facade.common.C7718l, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C13479a.m54772d("AtPanelFragment", "onCreate");
        FragmentActivity activity = getActivity();
        this.f20618e = activity;
        if (f20614b || activity != null) {
            C7599b bVar = (C7599b) C4950k.m20474a(this, C7599b.class);
            this.f20617d = bVar;
            C6215b editPanelsManager = bVar.getEditPanelsManager();
            this.f20616c = editPanelsManager;
            editPanelsManager.getActiveEditPanel().mo5923a(this.f20618e, new AbstractC1178x() {
                /* class com.bytedance.ee.bear.edit.component.document.at.$$Lambda$a$dKjIuH_oLIsZ8srfKutRcvLSgbc */

                @Override // androidx.lifecycle.AbstractC1178x
                public final void onChanged(Object obj) {
                    C7596a.this.m30479b((C7596a) ((AbstractC6214a) obj));
                }
            });
            AbstractC10550f.AbstractC10551a.m43717b(getActivity()).mo39924a(this);
            return;
        }
        throw new AssertionError();
    }

    /* renamed from: a */
    private void m30474a(AtFinderJsCallbackData atFinderJsCallbackData) {
        C4520c cVar;
        if (atFinderJsCallbackData == null) {
            C13479a.m54758a("AtPanelFragment", "onViewCreated(): data is null");
        } else if (atFinderJsCallbackData.getShow() == 1) {
            AtFinderJsCallbackData.Mention mention = atFinderJsCallbackData.getMention();
            if (mention == null) {
                try {
                    cVar = new C4520c(atFinderJsCallbackData.getToken(), atFinderJsCallbackData.getSource(), "default", "text", "");
                } catch (Exception e) {
                    C13479a.m54759a("AtPanelFragment", "handle: ", e);
                    this.f20615a.mo16685a(false);
                    return;
                }
            } else {
                cVar = new C4520c(atFinderJsCallbackData.getToken(), atFinderJsCallbackData.getSource(), mention.getZone(), "text", mention.getFileType(), mention.getSource());
            }
            this.f20615a.mo16684a(this, cVar, atFinderJsCallbackData.getMentionPanel());
            this.f20615a.setSelectDataCallback(this.f20617d.getDataCallback());
            if (this.f20617d.getMentionDelegate() != null) {
                this.f20617d.getMentionDelegate().mo16810a(new MentionModel(atFinderJsCallbackData.getContent(), atFinderJsCallbackData.getToken(), atFinderJsCallbackData.getSource()));
            }
            this.f20615a.mo16686b();
            C10548d.m43702b(this.f20618e);
        } else if (atFinderJsCallbackData.getShow() == 0) {
            C13479a.m54764b("AtPanelFragment", "handle: show is 0. close atfinder");
            this.f20615a.mo16685a(false);
        } else {
            C13479a.m54772d("AtPanelFragment", "AtFinderHandler.handle error!!!");
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        view.setOnClickListener(new View.OnClickListener() {
            /* class com.bytedance.ee.bear.edit.component.document.at.C7596a.View$OnClickListenerC75971 */

            public void onClick(View view) {
                C13479a.m54764b("AtPanelFragment", "onClick(): ");
            }
        });
        $$Lambda$a$LveUeYv_7hOpQsZd4Fm6i93tCg r4 = new C4255a.AbstractC4256a() {
            /* class com.bytedance.ee.bear.edit.component.document.at.$$Lambda$a$LveUeYv_7hOpQsZd4Fm6i93tCg */

            @Override // com.bytedance.ee.bear.atbottombar.C4255a.AbstractC4256a
            public final void onHeightChange(int i) {
                C7596a.this.m30473a((C7596a) i);
            }
        };
        AtBottomBar atBottomBar = (AtBottomBar) view.findViewById(R.id.at_bottom_bar);
        this.f20615a = atBottomBar;
        atBottomBar.setCardsData(this.f20617d.getMentionDelegate().mo16808a());
        this.f20615a.setAtCommonConfig(this.f20617d.getMentionDelegate().mo16811b());
        this.f20615a.setDelegate(r4);
        this.f20617d.titleBarLocationLiveData().mo5923a(getViewLifecycleOwner(), new AbstractC1178x<Integer>() {
            /* class com.bytedance.ee.bear.edit.component.document.at.C7596a.C75982 */

            /* renamed from: a */
            public void onChanged(Integer num) {
                C7596a.this.f20615a.setTitleBarLocationY(num.intValue());
            }
        });
        this.f20615a.mo16683a();
        this.f20621h = AbstractC68307f.m265080a(new AbstractC68324h() {
            /* class com.bytedance.ee.bear.edit.component.document.at.$$Lambda$a$cuSrYsjWvVNdly8aqlxa1s4LcU */

            @Override // io.reactivex.AbstractC68324h
            public final void subscribe(AbstractC68323g gVar) {
                C7596a.this.m30476a((C7596a) gVar);
            }
        }, BackpressureStrategy.BUFFER).mo238012c(300, TimeUnit.MILLISECONDS).mo237985a(C11678b.m48481e()).mo238020d(new Function() {
            /* class com.bytedance.ee.bear.edit.component.document.at.$$Lambda$a$bSWYNGSJfocHrL6zlZjBg9JxEvY */

            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return C7596a.this.m30481d((AtFinderJsCallbackData) obj);
            }
        }).mo238001b($$Lambda$a$8wGIs1slW7SxT0MJ4oa41wN_Qoo.INSTANCE, $$Lambda$a$NSIeBvFTgiWaZgr5qujU7NUfYb8.INSTANCE);
        this.f20617d.getAtFinderLiveData().mo5923a(getViewLifecycleOwner(), new AbstractC1178x() {
            /* class com.bytedance.ee.bear.edit.component.document.at.$$Lambda$a$J4VTjIi5Lix3vOwdTfTTkjGv89c */

            @Override // androidx.lifecycle.AbstractC1178x
            public final void onChanged(Object obj) {
                C7596a.this.m30478b((C7596a) ((AtFinderJsCallbackData) obj));
            }
        });
        this.f20615a.setTouchMonitor((AbstractC7719m) AbstractC7710h.C7711a.m30833a(this.f20618e, AbstractC7719m.class));
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.at_tool_bar, viewGroup, false);
    }

    @Override // com.bytedance.ee.bear.p522q.p523a.AbstractC10549e
    public void onKeyboardHeightChanged(AbstractC10550f fVar, int i, int i2) {
        AtBottomBar atBottomBar;
        if (i == 0 && (atBottomBar = this.f20615a) != null) {
            atBottomBar.mo16685a(f20614b);
            this.f20616c.setPanelHeight(0, "AtPanel");
        }
    }
}
