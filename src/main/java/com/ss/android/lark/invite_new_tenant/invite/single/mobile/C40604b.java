package com.ss.android.lark.invite_new_tenant.invite.single.mobile;

import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import androidx.fragment.app.DialogInterface$OnCancelListenerC1021b;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.larksuite.framework.ui.p1198b.C26198f;
import com.larksuite.framework.utils.DeviceUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.invite_new_tenant.invite.single.AbstractC40580a;
import com.ss.android.lark.invite_new_tenant.invite.single.mobile.entity.MobileCode;
import com.ss.android.lark.utils.UIHelper;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.lark.invite_new_tenant.invite.single.mobile.b */
public class C40604b extends DialogInterface$OnCancelListenerC1021b {

    /* renamed from: c */
    private List<MobileCode> f103030c;

    /* renamed from: d */
    private List<MobileCode> f103031d;

    /* renamed from: e */
    private View f103032e;

    /* renamed from: f */
    private RecyclerView f103033f;

    /* renamed from: g */
    private AbstractC40580a f103034g;

    /* renamed from: f */
    private void m160601f() {
        this.f103033f = (RecyclerView) this.f103032e.findViewById(R.id.area_rv);
        C40600a aVar = new C40600a(this.f103030c, this.f103031d);
        aVar.mo146729a(this.f103034g);
        this.f103033f.addItemDecoration(new C26198f(aVar));
        this.f103033f.setLayoutManager(new LinearLayoutManager(getContext()));
        this.f103033f.setAdapter(aVar);
    }

    @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC1021b, androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        Window window = v_().getWindow();
        window.setBackgroundDrawable(new ColorDrawable(0));
        getActivity().getWindowManager().getDefaultDisplay().getMetrics(new DisplayMetrics());
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.gravity = 80;
        attributes.width = DeviceUtils.getScreenWidth(getContext()) - (UIHelper.dp2px(32.0f) * 2);
        attributes.height = (DeviceUtils.getScreenHeight(getContext()) - UIHelper.dp2px(91.0f)) - UIHelper.dp2px(116.0f);
        attributes.y = UIHelper.dp2px(91.0f);
        window.setAttributes(attributes);
    }

    /* renamed from: a */
    public void mo146734a(AbstractC40580a aVar) {
        this.f103034g = aVar;
    }

    @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC1021b, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (getArguments() != null) {
            this.f103030c = (List) getArguments().getSerializable("popularMobileCode");
            this.f103031d = (List) getArguments().getSerializable("allMobileCode");
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        m160601f();
    }

    /* renamed from: a */
    public static C40604b m160600a(ArrayList<MobileCode> arrayList, ArrayList<MobileCode> arrayList2) {
        C40604b bVar = new C40604b();
        Bundle bundle = new Bundle();
        bundle.putSerializable("popularMobileCode", arrayList);
        bundle.putSerializable("allMobileCode", arrayList2);
        bVar.setArguments(bundle);
        return bVar;
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.fragment_choose_mobile_area, viewGroup, false);
        this.f103032e = inflate;
        return inflate;
    }
}
