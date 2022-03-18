package com.ss.android.lark.desktopmode.p1788b.p1789a;

import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.larksuite.suite.R;
import com.ss.android.lark.desktopmode.p1787a.C36516a;
import java.util.Stack;

/* renamed from: com.ss.android.lark.desktopmode.b.a.c */
public class C36533c extends C36516a {

    /* renamed from: a */
    private View f94069a;

    /* renamed from: b */
    private Activity f94070b;

    /* renamed from: c */
    private FragmentManager f94071c;

    /* renamed from: d */
    private Stack<C36516a> f94072d = new Stack<>();

    /* renamed from: e */
    private AbstractC36534a f94073e;

    /* renamed from: com.ss.android.lark.desktopmode.b.a.c$a */
    public interface AbstractC36534a {
        /* renamed from: a */
        void mo134861a();
    }

    /* renamed from: a */
    public Fragment mo134857a() {
        if (this.f94072d.empty()) {
            return null;
        }
        return this.f94072d.peek();
    }

    /* renamed from: a */
    public void mo134859a(AbstractC36534a aVar) {
        this.f94073e = aVar;
    }

    /* renamed from: a */
    public void mo134858a(C36516a aVar) {
        this.f94072d.add(aVar);
        this.f94071c.beginTransaction().add(R.id.root, aVar).commitNowAllowingStateLoss();
    }

    /* renamed from: b */
    public void mo134860b(C36516a aVar) {
        AbstractC36534a aVar2;
        this.f94072d.remove(aVar);
        this.f94071c.beginTransaction().remove(aVar).commitNowAllowingStateLoss();
        if (this.f94072d.empty() && (aVar2 = this.f94073e) != null) {
            aVar2.mo134861a();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.f94071c = getChildFragmentManager();
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f94069a = layoutInflater.inflate(R.layout.fragment_base_layout, viewGroup, false);
        this.f94070b = getActivity();
        return this.f94069a;
    }
}
