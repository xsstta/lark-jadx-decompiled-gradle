package com.ss.android.lark.readstate.impl.detail;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentManager;
import butterknife.ButterKnife;
import com.larksuite.component.ui.toast.LKUIToast;
import com.larksuite.suite.R;
import com.ss.android.lark.base.fragment.BaseFragment;
import com.ss.android.lark.chat.entity.message.Message;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.monitor.p2372a.C48211b;
import com.ss.android.lark.readstate.impl.detail.ReadStateDetailView;
import com.ss.android.lark.statistics.Statistics;

/* renamed from: com.ss.android.lark.readstate.impl.detail.b */
public class C53115b extends BaseFragment {

    /* renamed from: a */
    private C53119e f131358a;

    /* renamed from: b */
    private ReadStateDetailView.AbstractC53110a f131359b = new ReadStateDetailView.AbstractC53110a() {
        /* class com.ss.android.lark.readstate.impl.detail.C53115b.C531161 */

        @Override // com.ss.android.lark.readstate.impl.detail.ReadStateDetailView.AbstractC53110a
        /* renamed from: a */
        public FragmentManager mo181413a() {
            return C53115b.this.getChildFragmentManager();
        }

        @Override // com.ss.android.lark.readstate.impl.detail.ReadStateDetailView.AbstractC53110a
        /* renamed from: b */
        public void mo181416b() {
            C53115b.this.finish();
        }

        @Override // com.ss.android.lark.readstate.impl.detail.ReadStateDetailView.AbstractC53110a
        /* renamed from: a */
        public void mo181414a(ReadStateDetailView readStateDetailView) {
            ButterKnife.bind(readStateDetailView, C53115b.this.getView());
        }

        @Override // com.ss.android.lark.readstate.impl.detail.ReadStateDetailView.AbstractC53110a
        /* renamed from: a */
        public void mo181415a(String str) {
            LKUIToast.show(C53115b.this.getActivity(), str);
        }
    };

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        m205612a();
    }

    /* renamed from: a */
    private static void m205612a() {
        try {
            Statistics.sendEvent("readlist_view");
        } catch (Throwable th) {
            Log.m165382e(th.getMessage());
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        C53119e eVar = this.f131358a;
        if (eVar != null) {
            eVar.destroy();
        }
        super.onDestroy();
    }

    /* renamed from: b */
    private C53117c m205613b() {
        Bundle arguments = getArguments();
        if (arguments == null) {
            return null;
        }
        C53117c cVar = new C53117c();
        cVar.f131361a = (Message.Type) arguments.getSerializable("params_message_type");
        cVar.f131362b = arguments.getBoolean("extra.is.ding", false);
        cVar.f131363c = arguments.getString("params_chats");
        cVar.f131364d = arguments.getStringArrayList("params_all_at_chatterids");
        cVar.f131365e = arguments.getString("params_message");
        return cVar;
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, androidx.fragment.app.Fragment
    public void onActivityCreated(Bundle bundle) {
        C48211b.m190252a("MessageReadStateFragment").mo168688b();
        super.onActivityCreated(null);
        C48211b.m190251a().mo168689b("Init MVP");
        C53117c b = m205613b();
        if (b != null) {
            C53119e eVar = new C53119e(new C53118d(), new ReadStateDetailView(this.f131359b, this, b.f131365e, b.f131361a, b.f131363c, b.f131362b));
            this.f131358a = eVar;
            eVar.create();
            this.f131358a.mo181436a(b);
            return;
        }
        Log.m165382e("Init data is null");
        finish();
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.activity_message_readstate, viewGroup, false);
    }
}
