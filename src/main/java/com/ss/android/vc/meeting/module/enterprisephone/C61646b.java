package com.ss.android.vc.meeting.module.enterprisephone;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import com.airbnb.lottie.LottieAnimationView;
import com.larksuite.suite.R;
import com.ss.android.lark.chat.export.entity.chatter.OpenChatter;

/* renamed from: com.ss.android.vc.meeting.module.enterprisephone.b */
public class C61646b extends AbstractC61645a {
    /* access modifiers changed from: protected */
    @Override // com.ss.android.vc.meeting.module.enterprisephone.AbstractC61645a
    /* renamed from: a */
    public int mo213537a() {
        return R.layout.vc_fragment_enterprise_phone_calling;
    }

    @Override // androidx.fragment.app.Fragment, com.ss.android.vc.meeting.module.enterprisephone.AbstractC61645a
    public void onDestroyView() {
        LottieAnimationView lottieAnimationView;
        super.onDestroyView();
        if (this.f154648b != null && (lottieAnimationView = (LottieAnimationView) this.f154648b.findViewById(R.id.ringing_view)) != null && lottieAnimationView.isAnimating()) {
            lottieAnimationView.cancelAnimation();
        }
    }

    /* renamed from: a */
    public static C61646b m240598a(Intent intent) {
        C61646b bVar = new C61646b();
        Bundle bundle = new Bundle();
        String stringExtra = intent.getStringExtra("fragment_type_key");
        bundle.putString("fragment_type_key", stringExtra);
        if (TextUtils.equals(stringExtra, "fragment_type_normal_calling")) {
            String stringExtra2 = intent.getStringExtra("chat_id");
            String stringExtra3 = intent.getStringExtra("phone_id");
            bundle.putSerializable("open_chatter", (OpenChatter) intent.getSerializableExtra("open_chatter"));
            bundle.putString("chat_id", stringExtra2);
            bundle.putString("phone_id", stringExtra3);
        } else if (TextUtils.equals(stringExtra, "fragment_type_dial_calling")) {
            String stringExtra4 = intent.getStringExtra("phone_number");
            String stringExtra5 = intent.getStringExtra("phone_id");
            bundle.putString("phone_number", stringExtra4);
            bundle.putString("phone_id", stringExtra5);
        } else if (TextUtils.equals(stringExtra, "fragment_type_phone_calling")) {
            String stringExtra6 = intent.getStringExtra("phone_number");
            String stringExtra7 = intent.getStringExtra("phone_id");
            bundle.putString("phone_number", stringExtra6);
            bundle.putString("phone_id", stringExtra7);
        }
        bVar.setArguments(bundle);
        return bVar;
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.vc.meeting.module.enterprisephone.AbstractC61645a
    /* renamed from: a */
    public void mo213538a(View view, Bundle bundle) {
        getLifecycle().addObserver(new EnterprisePhoneCallingObserver(this));
    }
}
