package com.ss.android.lark.pin.impl.v3.binder;

import android.content.Context;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.lark.pin.PinModule;
import com.ss.android.lark.pin.dto.SearchResultInfo;
import com.ss.android.lark.pin.impl.C51489b;
import com.ss.android.lark.pin.impl.C51502e;
import com.ss.android.lark.pin.impl.entity.PinInfo;
import com.ss.android.lark.pin.impl.v3.binder.holderview.AudioHolderNewView2;
import com.ss.android.lark.pin.impl.v3.binder.holderview.SearchResultHolderView;
import com.ss.android.lark.pin.impl.v3.binder.p2472a.C51544e;
import com.ss.android.lark.pin.impl.v3.binder.p2472a.C51547f;
import com.ss.android.lark.pin.impl.v3.binder.p2472a.C51548g;
import com.ss.android.lark.pin.impl.v3.binder.p2472a.C51549h;
import com.ss.android.lark.pin.impl.v3.binder.p2472a.C51552i;
import com.ss.android.lark.pin.impl.v3.binder.p2472a.C51554j;
import com.ss.android.lark.pin.impl.v3.binder.p2472a.C51557k;
import com.ss.android.lark.pin.impl.v3.binder.p2472a.C51565o;
import com.ss.android.lark.pin.impl.v3.binder.p2472a.C51573p;
import com.ss.android.lark.pin.impl.v3.binder.p2472a.C51576r;
import com.ss.android.lark.pin.impl.v3.binder.p2472a.C51578s;
import com.ss.android.lark.pin.impl.v3.binder.p2472a.C51586t;
import com.ss.android.lark.pin.impl.v3.binder.p2472a.C51590u;
import com.ss.android.lark.pin.impl.v3.binder.p2472a.C51591v;
import com.ss.android.lark.pin.p2466a.AbstractC51472a;
import com.ss.android.lark.widget.recyclerview.AbstractC58992f;
import com.ss.android.lark.widget.recyclerview.AbstractView$OnClickListenerC58987e;

/* renamed from: com.ss.android.lark.pin.impl.v3.binder.a */
public class C51530a implements AbstractView$OnClickListenerC58987e.AbstractC58989b<PinInfo> {

    /* renamed from: a */
    private final Context f128277a;

    /* renamed from: b */
    private final C51502e f128278b;

    /* renamed from: c */
    private final C51502e.AbstractC51506c f128279c;

    /* renamed from: a */
    public int mo31301a(PinInfo bVar) {
        if (bVar instanceof C51502e.C51505b) {
            return -2;
        }
        if (bVar instanceof SearchResultInfo) {
            return 4096;
        }
        return C51489b.m199752c(bVar.mo177396g());
    }

    /* Return type fixed from 'com.ss.android.lark.widget.recyclerview.f<com.ss.android.lark.pin.impl.entity.b, ? extends androidx.recyclerview.widget.RecyclerView$ViewHolder>' to match base method */
    @Override // com.ss.android.lark.widget.recyclerview.AbstractView$OnClickListenerC58987e.AbstractC58989b
    /* renamed from: a */
    public AbstractC58992f<? extends PinInfo, ? extends RecyclerView.ViewHolder> mo31302a(int i) {
        if (i == 1) {
            return new C51578s(this.f128277a, this.f128279c);
        }
        if (i == 2) {
            return new C51565o(this.f128277a, this.f128279c);
        }
        if (i == 4) {
            return new C51549h(this.f128277a, this.f128279c);
        }
        if (i == 8 || i == 32768) {
            return new C51544e(this.f128277a, this.f128279c);
        }
        if (i == 16) {
            return new C51548g(this.f128277a, this.f128279c);
        }
        if (i == 32) {
            return new AudioHolderNewView2(this.f128277a, this.f128278b, this.f128279c);
        }
        if (i == 64) {
            return new C51557k(this.f128277a, this.f128279c);
        }
        if (i == 65536) {
            return new C51586t(this.f128277a, this.f128279c);
        }
        if (i == 128) {
            return new C51554j(this.f128277a, this.f128279c);
        }
        if (i == 256) {
            AbstractC51472a b = PinModule.m199585b();
            Context context = this.f128277a;
            return b.mo144016a(context, new C51594b(context, this.f128279c));
        } else if (i == 512) {
            return new C51591v(this.f128277a, this.f128279c);
        } else {
            if (i == 1024) {
                return new C51576r(this.f128277a, this.f128279c);
            }
            if (i == 2048) {
                return new C51552i(this.f128277a, this.f128279c);
            }
            if (i == 8192) {
                return new C51573p(this.f128277a, this.f128279c);
            }
            if (i == -2) {
                return new C51547f(this.f128277a);
            }
            if (i == 4096) {
                return new SearchResultHolderView(this.f128277a);
            }
            if (i != 16384) {
                return new C51590u(this.f128277a);
            }
            if (PinModule.m199585b() == null || PinModule.m199585b().mo144034h() == null) {
                return new C51590u(this.f128277a);
            }
            AbstractC51472a.AbstractC51486l h = PinModule.m199585b().mo144034h();
            Context context2 = this.f128277a;
            return h.mo144057a(context2, new C51594b(context2, this.f128279c));
        }
    }

    public C51530a(Context context, C51502e eVar, C51502e.AbstractC51506c cVar) {
        this.f128277a = context;
        this.f128278b = eVar;
        this.f128279c = cVar;
    }
}
