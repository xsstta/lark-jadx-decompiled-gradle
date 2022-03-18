package com.ss.android.lark.search.impl.func.pick.chatpick;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import butterknife.ButterKnife;
import com.larksuite.framework.callback.CallbackManager;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.suite.R;
import com.ss.android.lark.base.fragment.BaseFragment;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.search.impl.func.pick.chatpick.mvp.C53659b;
import com.ss.android.lark.search.impl.func.pick.chatpick.mvp.C53661c;
import com.ss.android.lark.search.impl.func.pick.chatpick.mvp.PickChatView;
import com.ss.android.lark.search.impl.func.pick.p2623a.C53637e;
import com.ss.android.lark.search.impl.func.pick.viewdata.BasePickViewData;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.lark.search.impl.func.pick.chatpick.b */
public class C53644b extends BaseFragment {

    /* renamed from: c */
    static final /* synthetic */ boolean f132412c = true;

    /* renamed from: a */
    public String f132413a = "";

    /* renamed from: b */
    public View f132414b;

    /* renamed from: d */
    private C53661c f132415d;

    /* renamed from: e */
    private CallbackManager f132416e = new CallbackManager();

    /* renamed from: f */
    private PickChatView.AbstractC53654a f132417f = new PickChatView.AbstractC53654a() {
        /* class com.ss.android.lark.search.impl.func.pick.chatpick.C53644b.C536451 */

        @Override // com.ss.android.lark.search.impl.func.pick.chatpick.mvp.PickChatView.AbstractC53654a
        /* renamed from: a */
        public void mo182966a() {
            C53644b.this.finish();
        }

        @Override // com.ss.android.lark.search.impl.func.pick.chatpick.mvp.PickChatView.AbstractC53654a
        /* renamed from: a */
        public void mo182967a(PickChatView pickChatView) {
            ButterKnife.bind(pickChatView, C53644b.this.f132414b);
        }

        @Override // com.ss.android.lark.search.impl.func.pick.chatpick.mvp.PickChatView.AbstractC53654a
        /* renamed from: a */
        public void mo182968a(List<BasePickViewData> list) {
            C53644b.this.mo182965a(list);
        }
    };

    /* renamed from: a */
    private boolean m207663a() {
        Bundle arguments = getArguments();
        if (arguments == null) {
            return false;
        }
        this.f132413a = arguments.getString("filter/from_source", "");
        return f132412c;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        CallbackManager callbackManager = this.f132416e;
        if (callbackManager != null) {
            callbackManager.cancelCallbacks();
        }
        C53661c cVar = this.f132415d;
        if (cVar != null) {
            cVar.destroy();
        }
        super.onDestroy();
    }

    /* renamed from: b */
    private void m207664b() {
        if (f132412c || getArguments() != null) {
            C53661c cVar = new C53661c(new C53659b(getArguments()), new PickChatView(getContext(), this.f132417f));
            this.f132415d = cVar;
            cVar.create();
            return;
        }
        throw new AssertionError();
    }

    /* renamed from: a */
    public void mo182965a(List<BasePickViewData> list) {
        if (TextUtils.isEmpty(this.f132413a)) {
            m207665b(list);
        } else {
            m207666c(list);
        }
    }

    /* renamed from: b */
    private void m207665b(List<BasePickViewData> list) {
        Intent intent = new Intent();
        intent.putExtra("message/filter/picked_chat", new ArrayList(list));
        setResult(-1, intent);
        finish();
    }

    /* renamed from: c */
    private void m207666c(List<BasePickViewData> list) {
        C53637e.m207640b(list, (IGetDataCallback) this.f132416e.wrapAndAddCallback(new IGetDataCallback<String>() {
            /* class com.ss.android.lark.search.impl.func.pick.chatpick.C53644b.C536462 */

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
            }

            /* renamed from: a */
            public void onSuccess(String str) {
                Intent intent = new Intent();
                intent.putExtra(C53644b.this.f132413a, str);
                C53644b.this.setResult(-1, intent);
                C53644b.this.finish();
            }
        }));
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        if (!m207663a()) {
            Log.m165383e("LarkSearch.Search.PickChatFragment", "intent data is invalid");
            finish();
            return;
        }
        m207664b();
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.activity_pick_chat, viewGroup, false);
        this.f132414b = inflate;
        return inflate;
    }
}
