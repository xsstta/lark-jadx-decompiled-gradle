package com.bytedance.ee.bear.middleground.record.privacy;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.AbstractC1178x;
import androidx.lifecycle.aj;
import com.bytedance.ee.bear.basesdk.services.C4511g;
import com.bytedance.ee.bear.facade.common.C7667e;
import com.bytedance.ee.bear.facade.common.widget.Toast;
import com.bytedance.ee.bear.middleground.record.C10115a;
import com.bytedance.ee.bear.route.AbstractC10740f;
import com.bytedance.ee.bear.widgets.C11824c;
import com.bytedance.ee.bear.widgets.universedesign.SpaceEmptyState;
import com.bytedance.ee.util.p718t.C13749l;
import com.jaeger.library.StatusBarUtil;
import com.larksuite.component.universe_design.udswitch.UDSwitch;
import com.larksuite.suite.R;
import org.koin.java.KoinJavaComponent;

/* renamed from: com.bytedance.ee.bear.middleground.record.privacy.a */
public class C10135a extends C7667e {

    /* renamed from: d */
    static final /* synthetic */ boolean f27364d = true;

    /* renamed from: a */
    public UDSwitch f27365a;

    /* renamed from: b */
    public C11824c f27366b;

    /* renamed from: c */
    public C10139b f27367c;

    /* renamed from: e */
    private int f27368e;

    /* renamed from: f */
    private String f27369f;

    /* renamed from: g */
    private View f27370g;

    /* renamed from: h */
    private TextView f27371h;

    /* renamed from: i */
    private SpaceEmptyState f27372i;

    /* renamed from: c */
    private void m42179c() {
        C10139b bVar = (C10139b) aj.m5364a(this).mo6005a(C10139b.class);
        this.f27367c = bVar;
        bVar.attach(this.f27369f, this.f27368e);
        this.f27367c.getData();
        this.f27367c.getIsCheckMutableLiveData().mo5923a(getViewLifecycleOwner(), new AbstractC1178x<Boolean>() {
            /* class com.bytedance.ee.bear.middleground.record.privacy.C10135a.C101372 */

            /* renamed from: a */
            public void onChanged(Boolean bool) {
                C10135a.this.mo38553a(bool.booleanValue());
            }
        });
        this.f27367c.getStateMutableLiveData().mo5923a(getViewLifecycleOwner(), new AbstractC1178x<Integer>() {
            /* class com.bytedance.ee.bear.middleground.record.privacy.C10135a.C101383 */

            /* renamed from: a */
            public void onChanged(Integer num) {
                int intValue = num.intValue();
                if (intValue != 0) {
                    if (intValue == 1) {
                        C10135a.this.f27366b.mo45303c();
                    } else if (intValue == 2) {
                        C10135a.this.f27366b.mo45303c();
                        C10135a.this.mo38552a();
                    } else if (intValue == 3) {
                        C10135a.this.f27366b.mo45303c();
                        Toast.showFailureText(C10135a.this.getContext(), C13749l.m55745a(C10135a.this.getContext(), (int) R.string.Doc_Facade_OperateFailed));
                        C10135a aVar = C10135a.this;
                        aVar.mo38553a(true ^ aVar.f27365a.isChecked());
                    } else if (intValue == 4) {
                        C10135a.this.f27367c.getData();
                    }
                } else if (!C10135a.this.f27366b.mo45302b()) {
                    C10135a.this.f27366b.m49046e();
                }
            }
        });
    }

    /* renamed from: a */
    public void mo38552a() {
        this.f27372i.setVisibility(0);
        this.f27372i.setTitle(C13749l.m55745a(getContext(), (int) R.string.CreationMobile_Stats_Visits_NoPermissionToUse_title));
        this.f27372i.setDesc(C13749l.m55745a(getContext(), (int) R.string.CreationMobile_Stats_Visits_NoPermissionToUse_desc));
        this.f27372i.setPrimaryText("");
        this.f27372i.setImageRes(Integer.valueOf((int) R.drawable.illustration_empty_neutral_no_access));
    }

    /* renamed from: b */
    private void m42178b() {
        this.f27371h = (TextView) this.f27370g.findViewById(R.id.lean_more);
        this.f27365a = (UDSwitch) this.f27370g.findViewById(R.id.ud_switch);
        SpaceEmptyState spaceEmptyState = (SpaceEmptyState) this.f27370g.findViewById(R.id.found_empty_state);
        this.f27372i = spaceEmptyState;
        spaceEmptyState.setVisibility(8);
        this.f27366b = new C11824c(getContext());
        this.f27371h.setOnClickListener(new View.OnClickListener() {
            /* class com.bytedance.ee.bear.middleground.record.privacy.C10135a.View$OnClickListenerC101361 */

            public void onClick(View view) {
                C10115a.m42132a("more_information");
                if (C4511g.m18594d().mo17343D()) {
                    ((AbstractC10740f) KoinJavaComponent.m268610a(AbstractC10740f.class)).mo17292a(C13749l.m55745a(C10135a.this.getContext(), (int) R.string.CreationMobile_Stats_URL_Lark));
                } else {
                    ((AbstractC10740f) KoinJavaComponent.m268610a(AbstractC10740f.class)).mo17292a(C13749l.m55745a(C10135a.this.getContext(), (int) R.string.CreationMobile_Stats_URL_Feishu));
                }
            }
        });
    }

    @Override // com.bytedance.ee.bear.facade.common.C7718l, androidx.fragment.app.Fragment, com.bytedance.ee.bear.facade.common.C7667e
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (f27364d || arguments != null) {
            this.f27368e = arguments.getInt("TYPE", 0);
            this.f27369f = arguments.getString("TOKEN", "");
            StatusBarUtil.setColorNoTranslucent(getActivity(), getContext().getResources().getColor(R.color.bg_float_base));
            return;
        }
        throw new AssertionError();
    }

    /* renamed from: a */
    public void mo38553a(boolean z) {
        this.f27365a.setOnCheckedChangeListener(null);
        this.f27365a.setChecked(z);
        this.f27365a.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            /* class com.bytedance.ee.bear.middleground.record.privacy.$$Lambda$a$DH4746fY6JIe6yVJ9LZzzgOcsHI */

            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                C10135a.this.m42177a((C10135a) compoundButton, (CompoundButton) z);
            }
        });
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: a */
    private /* synthetic */ void m42177a(CompoundButton compoundButton, boolean z) {
        this.f27367c.pushPrivacy(z);
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        m42178b();
        m42179c();
    }

    /* renamed from: a */
    public static Fragment m42176a(int i, String str) {
        Bundle bundle = new Bundle();
        bundle.putInt("TYPE", i);
        bundle.putString("TOKEN", str);
        C10135a aVar = new C10135a();
        aVar.setArguments(bundle);
        return aVar;
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.privacy_layout_fragment, viewGroup, false);
        this.f27370g = inflate;
        return inflate;
    }
}
