package com.ss.android.lark.mail.impl.home.aggregation.p2179a;

import android.content.Context;
import android.util.Pair;
import android.view.View;
import com.larksuite.component.universe_design.emptystate.UDEmptyState;
import com.larksuite.suite.R;
import com.ss.android.lark.mail.impl.home.aggregation.AbstractC42401a;

/* renamed from: com.ss.android.lark.mail.impl.home.aggregation.a.a */
public class C42402a {

    /* renamed from: a */
    AbstractC42401a f107938a;

    /* renamed from: b */
    View f107939b;

    /* renamed from: a */
    public void mo152621a() {
        this.f107939b.setVisibility(0);
    }

    /* renamed from: b */
    public void mo152622b() {
        this.f107939b.setVisibility(8);
    }

    public C42402a(Context context, AbstractC42401a aVar, View view) {
        this.f107938a = aVar;
        this.f107939b = view;
        UDEmptyState uDEmptyState = (UDEmptyState) view.findViewById(R.id.mail_aggregation_empty_state);
        uDEmptyState.setImageRes(Integer.valueOf(this.f107938a.mo152620c()));
        uDEmptyState.setDesc(aVar.mo152616a(R.string.Mail_Manage_EmptyFolderLabel, new Pair[0]));
    }
}
