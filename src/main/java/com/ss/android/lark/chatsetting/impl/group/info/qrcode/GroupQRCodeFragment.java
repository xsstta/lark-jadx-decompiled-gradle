package com.ss.android.lark.chatsetting.impl.group.info.qrcode;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import butterknife.ButterKnife;
import com.larksuite.framework.utils.C26311p;
import com.larksuite.suite.R;
import com.ss.android.eventbus.EventBus;
import com.ss.android.eventbus.Subscribe;
import com.ss.android.eventbus.ThreadMode;
import com.ss.android.lark.base.fragment.BaseFragment;
import com.ss.android.lark.chatsetting.C34456a;
import com.ss.android.lark.chatsetting.ChatSettingModule;
import com.ss.android.lark.chatsetting.impl.group.DesktopShareTimeFinishEvent;
import com.ss.android.lark.chatsetting.impl.group.info.qrcode.C34666b;
import com.ss.android.lark.chatsetting.impl.group.info.qrcode.GroupQRCodeView;
import com.ss.android.lark.chatsetting.impl.statistics.group.GroupHitPoint;
import com.ss.android.lark.chatsetting.p1693a.AbstractC34461c;
import com.ss.android.lark.desktopmode.utils.DesktopUtil;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.permission.AbstractC51324c;
import com.ss.android.lark.utils.C57805b;

public class GroupQRCodeFragment extends BaseFragment {

    /* renamed from: a */
    public View f89441a;

    /* renamed from: b */
    public final AbstractC34461c.AbstractC34472k f89442b = ChatSettingModule.m133639a().mo127276f();

    /* renamed from: c */
    private C34666b f89443c;

    /* renamed from: d */
    private final GroupQRCodeView.AbstractC34662c f89444d = new GroupQRCodeView.AbstractC34662c() {
        /* class com.ss.android.lark.chatsetting.impl.group.info.qrcode.GroupQRCodeFragment.C346541 */

        @Override // com.ss.android.lark.chatsetting.impl.group.info.qrcode.GroupQRCodeView.AbstractC34662c
        /* renamed from: a */
        public void mo127974a() {
            GroupQRCodeFragment.this.finish();
        }

        @Override // com.ss.android.lark.chatsetting.impl.group.info.qrcode.GroupQRCodeView.AbstractC34662c
        /* renamed from: a */
        public void mo127975a(GroupQRCodeView groupQRCodeView) {
            ButterKnife.bind(groupQRCodeView, GroupQRCodeFragment.this.f89441a);
        }

        @Override // com.ss.android.lark.chatsetting.impl.group.info.qrcode.GroupQRCodeView.AbstractC34662c
        /* renamed from: b */
        public void mo127977b(String str) {
            C34456a.m133678a(GroupQRCodeFragment.this.getActivity(), GroupQRCodeFragment.this, str, "qrcode");
        }

        @Override // com.ss.android.lark.chatsetting.impl.group.info.qrcode.GroupQRCodeView.AbstractC34662c
        /* renamed from: a */
        public void mo127976a(String str) {
            C26311p.m95268a(GroupQRCodeFragment.this.getActivity(), str);
        }
    };

    /* renamed from: e */
    private final C34666b.AbstractC34671b f89445e = new C34666b.AbstractC34671b() {
        /* class com.ss.android.lark.chatsetting.impl.group.info.qrcode.$$Lambda$GroupQRCodeFragment$3zuLcf8jo3hpGTUUq18o9VS1dIw */

        @Override // com.ss.android.lark.chatsetting.impl.group.info.qrcode.C34666b.AbstractC34671b
        public final void checkStoragePermission(AbstractC51324c cVar) {
            GroupQRCodeFragment.this.m134646a(cVar);
        }
    };

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        C34666b bVar = this.f89443c;
        if (bVar != null) {
            bVar.destroy();
            this.f89443c = null;
        }
        if (DesktopUtil.m144301a(getContext())) {
            EventBus.getDefault().unregister(this);
        }
    }

    /* renamed from: a */
    private void m134645a() {
        C34666b bVar = new C34666b(getActivity(), new C34663a(), new GroupQRCodeView(this.f89444d), this.f89445e);
        this.f89443c = bVar;
        bVar.create();
        this.f89443c.mo128016a(getArguments());
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m134646a(AbstractC51324c cVar) {
        C57805b.m224333d(getActivity(), new C57805b.AbstractC57809a() {
            /* class com.ss.android.lark.chatsetting.impl.group.info.qrcode.$$Lambda$GroupQRCodeFragment$0P3pPrD9XH58jy8GxcX7ph1khI */

            @Override // com.ss.android.lark.utils.C57805b.AbstractC57809a
            public final void permissionGranted(boolean z) {
                GroupQRCodeFragment.m134647a(AbstractC51324c.this, z);
            }
        });
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onDesktopEditShareTime(DesktopShareTimeFinishEvent aVar) {
        onActivityResult(aVar.mo127682a(), aVar.mo127683b(), aVar.mo127684c());
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, com.ss.android.lark.base.fragment.BaseFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (DesktopUtil.m144301a(getContext())) {
            EventBus.getDefault().register(this);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void setUserVisibleHint(boolean z) {
        C34666b bVar;
        super.setUserVisibleHint(z);
        if (z && (bVar = this.f89443c) != null) {
            bVar.mo128019b();
            this.f89443c.mo128018a(false);
        }
        Log.m165379d("GroupQRCodeFragment", "setUserVisibleHint:" + z);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ void m134647a(AbstractC51324c cVar, boolean z) {
        if (cVar != null) {
            if (z) {
                cVar.mo49823a();
            } else {
                cVar.mo49824b();
            }
        }
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i;
        if (DesktopUtil.m144307b()) {
            i = R.layout.activity_group_qrcode_desktop;
        } else {
            i = R.layout.activity_group_qrcode;
        }
        this.f89441a = layoutInflater.inflate(i, viewGroup, false);
        m134645a();
        return this.f89441a;
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i2 == -1) {
            if (i == 2020) {
                if (this.f89443c != null) {
                    this.f89443c.mo128015a(intent.getIntExtra("key_params_group_share_time", 0));
                }
            } else if (i == 10010) {
                GroupHitPoint.f90519a.mo129216a(true, "lark");
            }
        }
    }
}
