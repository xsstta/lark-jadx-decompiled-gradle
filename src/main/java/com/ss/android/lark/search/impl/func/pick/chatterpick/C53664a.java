package com.ss.android.lark.search.impl.func.pick.chatterpick;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import butterknife.ButterKnife;
import com.larksuite.framework.callback.CallbackManager;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.suite.R;
import com.ss.android.lark.base.fragment.BaseFragment;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.search.impl.func.pick.chatterpick.mvp.C53676b;
import com.ss.android.lark.search.impl.func.pick.chatterpick.mvp.C53677c;
import com.ss.android.lark.search.impl.func.pick.chatterpick.mvp.PickChatterView;
import com.ss.android.lark.search.impl.func.pick.p2623a.C53637e;
import com.ss.android.lark.search.impl.func.pick.viewdata.PickChatterViewData;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.lark.search.impl.func.pick.chatterpick.a */
public class C53664a extends BaseFragment {

    /* renamed from: a */
    public FragmentActivity f132445a;

    /* renamed from: b */
    public String f132446b = "";

    /* renamed from: c */
    private C53677c f132447c;

    /* renamed from: d */
    private CallbackManager f132448d;

    /* renamed from: e */
    private PickChatterView.AbstractC53671a f132449e = new PickChatterView.AbstractC53671a() {
        /* class com.ss.android.lark.search.impl.func.pick.chatterpick.C53664a.C536651 */

        @Override // com.ss.android.lark.search.impl.func.pick.chatterpick.mvp.PickChatterView.AbstractC53671a
        /* renamed from: a */
        public void mo183001a() {
            C53664a.this.finish();
        }

        @Override // com.ss.android.lark.search.impl.func.pick.chatterpick.mvp.PickChatterView.AbstractC53671a
        /* renamed from: b */
        public FragmentManager mo183004b() {
            return C53664a.this.getChildFragmentManager();
        }

        @Override // com.ss.android.lark.search.impl.func.pick.chatterpick.mvp.PickChatterView.AbstractC53671a
        /* renamed from: c */
        public Activity mo183005c() {
            return C53664a.this.f132445a;
        }

        @Override // com.ss.android.lark.search.impl.func.pick.chatterpick.mvp.PickChatterView.AbstractC53671a
        /* renamed from: a */
        public void mo183002a(PickChatterView pickChatterView) {
            ButterKnife.bind(pickChatterView, C53664a.this.getView());
        }

        @Override // com.ss.android.lark.search.impl.func.pick.chatterpick.mvp.PickChatterView.AbstractC53671a
        /* renamed from: a */
        public void mo183003a(List<PickChatterViewData> list) {
            C53664a.this.mo182999a(list);
        }
    };

    /* renamed from: b */
    private void m207734b() {
        this.f132448d = new CallbackManager();
    }

    /* renamed from: a */
    public boolean mo183000a() {
        C53677c cVar = this.f132447c;
        if (cVar != null) {
            return cVar.mo183024c();
        }
        return true;
    }

    /* renamed from: d */
    private void m207738d() {
        C53677c cVar = new C53677c(new C53676b(getArguments()), new PickChatterView(getContext(), this.f132449e));
        this.f132447c = cVar;
        cVar.create();
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        CallbackManager callbackManager = this.f132448d;
        if (callbackManager != null) {
            callbackManager.cancelCallbacks();
        }
        C53677c cVar = this.f132447c;
        if (cVar != null) {
            cVar.destroy();
        }
        super.onDestroy();
    }

    /* renamed from: c */
    private boolean m207737c() {
        if (getArguments() == null) {
            return false;
        }
        this.f132446b = getArguments().getString("filter/from_source", "");
        return true;
    }

    /* renamed from: b */
    private void m207735b(List<PickChatterViewData> list) {
        Intent intent = new Intent();
        intent.putExtra("message/filter/picked_chatter", new ArrayList(list));
        setResult(-1, intent);
        finish();
    }

    /* renamed from: c */
    private void m207736c(List<PickChatterViewData> list) {
        C53637e.m207638a(list, (IGetDataCallback) this.f132448d.wrapAndAddCallback(new IGetDataCallback<String>() {
            /* class com.ss.android.lark.search.impl.func.pick.chatterpick.C53664a.C536662 */

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
            }

            /* renamed from: a */
            public void onSuccess(String str) {
                Intent intent = new Intent();
                intent.putExtra(C53664a.this.f132446b, str);
                C53664a.this.setResult(-1, intent);
                C53664a.this.finish();
            }
        }));
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, androidx.fragment.app.Fragment
    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        if (!m207737c()) {
            Log.m165383e("LarkSearch.Search.PickChatterFragment", "intent data is invalid");
            finish();
            return;
        }
        m207734b();
        m207738d();
    }

    /* renamed from: a */
    public void mo182999a(List<PickChatterViewData> list) {
        for (PickChatterViewData pickChatterViewData : list) {
            pickChatterViewData.setBusinessId(pickChatterViewData.getId());
        }
        if (TextUtils.isEmpty(this.f132446b)) {
            m207735b(list);
        } else {
            m207736c(list);
        }
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        super.onAttach(context);
        FragmentActivity activity = getActivity();
        this.f132445a = activity;
        if (activity == null) {
            Log.m165383e("LarkSearch.Search.PickChatterFragment", "Fragment " + this + " not attached to an activity.");
        }
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.activity_pick_chatter, viewGroup, false);
    }
}
