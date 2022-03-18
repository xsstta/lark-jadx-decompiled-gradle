package com.ss.android.lark.search.impl.func.chatinside.detail;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.larksuite.suite.R;
import com.ss.android.lark.base.fragment.BaseFragment;
import com.ss.android.lark.chat.entity.chatter.ChatChatter;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.search.C53258a;
import com.ss.android.lark.search.impl.func.chatinside.detail.base.AbstractC53443a;
import com.ss.android.lark.search.impl.func.chatinside.detail.base.BaseChatInsideSearchView;
import com.ss.android.lark.search.impl.func.pick.viewdata.BasePickViewData;
import com.ss.android.lark.searchcommon.constant.SearchCommonConstants;
import java.util.List;

/* renamed from: com.ss.android.lark.search.impl.func.chatinside.detail.a */
public class C53416a extends BaseFragment {

    /* renamed from: a */
    private C53473d f132025a;

    /* renamed from: b */
    private String f132026b;

    /* renamed from: c */
    private int f132027c;

    /* renamed from: d */
    private View f132028d;

    /* renamed from: e */
    private boolean f132029e = true;

    /* renamed from: a */
    public int mo182451a() {
        return this.f132027c;
    }

    /* renamed from: b */
    public String mo182452b() {
        return this.f132025a.mo182586e();
    }

    /* renamed from: c */
    public String mo182453c() {
        return this.f132025a.mo182587f();
    }

    /* renamed from: d */
    public String mo182454d() {
        return this.f132025a.mo182588g();
    }

    /* renamed from: e */
    public int mo182455e() {
        return this.f132025a.mo182589h();
    }

    /* access modifiers changed from: private */
    /* renamed from: h */
    public /* synthetic */ void m206856h() {
        C53473d dVar;
        if (this.f132027c == 3 && (dVar = this.f132025a) != null) {
            dVar.mo182584c();
        }
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, com.ss.android.lark.base.fragment.BaseFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        C53473d dVar = this.f132025a;
        if (dVar != null) {
            dVar.destroy();
        }
        super.onDestroyView();
    }

    @Override // androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        this.f132025a.mo182585d();
    }

    /* renamed from: f */
    private void m206854f() {
        Pair<AbstractC53443a, BaseChatInsideSearchView> a = C53457c.m207006a(this, this.f132028d, this.f132026b, this.f132027c);
        if (a == null) {
            Log.m165383e("LarkSearch.Search.ChatInsideSearchDetailFragment", "inside search type is unknown");
            return;
        }
        C53473d dVar = new C53473d((AbstractC53443a) a.first, (BaseChatInsideSearchView) a.second, this.f132027c);
        this.f132025a = dVar;
        dVar.create();
    }

    /* renamed from: g */
    private boolean m206855g() {
        Bundle arguments = getArguments();
        if (arguments == null) {
            return false;
        }
        String string = arguments.getString("chat_id");
        this.f132026b = string;
        if (TextUtils.isEmpty(string)) {
            return false;
        }
        int i = getArguments().getInt(ShareHitPoint.f121869d);
        this.f132027c = i;
        if (i != 0) {
            return true;
        }
        return false;
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        Log.m165379d("LarkSearch.Search.ChatInsideSearchDetailFragment", "SearchResultType: " + SearchCommonConstants.m208815b(this.f132027c));
        this.f132025a.mo182580a();
        if (getView() != null && this.f132029e) {
            this.f132029e = false;
            getView().post(new Runnable() {
                /* class com.ss.android.lark.search.impl.func.chatinside.detail.$$Lambda$a$LqrvHmpAsTWF_OednBBotzQSAGo */

                public final void run() {
                    C53416a.this.m206856h();
                }
            });
        }
    }

    /* renamed from: a */
    private boolean m206853a(int i, Intent intent) {
        if (i != -1 || intent == null || intent.getExtras() == null) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public static Fragment m206852a(String str, int i) {
        C53416a aVar = new C53416a();
        Bundle bundle = new Bundle();
        bundle.putString("chat_id", str);
        bundle.putInt(ShareHitPoint.f121869d, i);
        aVar.setArguments(bundle);
        return aVar;
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        if (!m206855g()) {
            Log.m165383e("LarkSearch.Search.ChatInsideSearchDetailFragment", "chat inside search data is invalid");
        } else {
            m206854f();
        }
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.fragment_chat_inside_search, viewGroup, false);
        this.f132028d = inflate;
        return inflate;
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityResult(int i, int i2, Intent intent) {
        if (!m206853a(i2, intent)) {
            Log.m165383e("LarkSearch.Search.ChatInsideSearchDetailFragment", "onActivityResult failed: activity result is invalid");
        } else if (i == 161) {
            List<ChatChatter> a = C53258a.m205939a().mo181763l().mo181771a(intent);
            C53473d dVar = this.f132025a;
            if (dVar != null) {
                dVar.mo182581a(a);
            }
        } else if (i == 162) {
            List<BasePickViewData> list = (List) intent.getSerializableExtra("message/filter/picked_chatter");
            C53473d dVar2 = this.f132025a;
            if (dVar2 != null) {
                dVar2.mo182583b(list);
            }
        }
    }
}
