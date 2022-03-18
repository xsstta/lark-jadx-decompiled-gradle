package com.ss.android.lark.pin.impl.v3.binder.p2472a;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.ss.android.lark.pin.impl.C51502e;
import com.ss.android.lark.pin.impl.entity.PinInfo;
import com.ss.android.lark.pin.impl.v3.binder.viewholder.C51604a;

/* renamed from: com.ss.android.lark.pin.impl.v3.binder.a.f */
public class C51547f extends AbstractC51540b<C51604a> {
    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ void m200054a(View view) {
    }

    public C51547f(Context context) {
        super(context, null);
    }

    /* renamed from: a */
    public C51604a mo31176b(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return C51604a.C51605a.m200242a(layoutInflater, viewGroup);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo177530a(C51604a aVar, PinInfo bVar) {
        aVar.itemView.setOnClickListener($$Lambda$f$IbwbI0tvxvkXNFPLuLgOKAixfQ.INSTANCE);
    }

    /* renamed from: a */
    public void mo177520a(C51604a aVar, int i, PinInfo bVar) {
        if (bVar instanceof C51502e.C51505b) {
            if (((C51502e.C51505b) bVar).f128184a) {
                aVar.itemView.setVisibility(0);
            } else {
                aVar.itemView.setVisibility(8);
            }
        }
        mo177530a(aVar, bVar);
    }
}
