package com.larksuite.component.blockit.hashtag.widget;

import android.view.View;
import com.larksuite.component.blockit.hashtag.widget.Attributes;
import com.larksuite.component.blockit.hashtag.widget.SwipeLayout;
import java.util.HashSet;
import java.util.Set;

/* renamed from: com.larksuite.component.blockit.hashtag.widget.d */
public class C24127d {

    /* renamed from: a */
    public final int f59661a = -1;

    /* renamed from: b */
    protected int f59662b = -1;

    /* renamed from: c */
    protected Set<Integer> f59663c = new HashSet();

    /* renamed from: d */
    protected Set<SwipeLayout> f59664d = new HashSet();

    /* renamed from: e */
    protected AbstractC24126c f59665e;

    /* renamed from: f */
    public Attributes.Mode f59666f = Attributes.Mode.Single;

    /* renamed from: a */
    public void mo86623a() {
        if (this.f59666f == Attributes.Mode.Multiple) {
            this.f59663c.clear();
        } else {
            this.f59662b = -1;
        }
        for (SwipeLayout swipeLayout : this.f59664d) {
            swipeLayout.mo86585m();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.larksuite.component.blockit.hashtag.widget.d$a */
    public class C24128a implements SwipeLayout.AbstractC24119b {

        /* renamed from: b */
        private int f59668b;

        /* renamed from: a */
        public void mo86627a(int i) {
            this.f59668b = i;
        }

        @Override // com.larksuite.component.blockit.hashtag.widget.SwipeLayout.AbstractC24119b
        /* renamed from: a */
        public void mo86610a(SwipeLayout swipeLayout) {
            if (C24127d.this.mo86626a(this.f59668b)) {
                swipeLayout.mo86555a(false, false);
            } else {
                swipeLayout.mo86561b(false, false);
            }
        }

        C24128a(int i) {
            this.f59668b = i;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.larksuite.component.blockit.hashtag.widget.d$b */
    public class C24129b extends C24125b {

        /* renamed from: b */
        private int f59670b;

        /* renamed from: a */
        public void mo86628a(int i) {
            this.f59670b = i;
        }

        @Override // com.larksuite.component.blockit.hashtag.widget.C24125b, com.larksuite.component.blockit.hashtag.widget.SwipeLayout.AbstractC24123f
        /* renamed from: a */
        public void mo86615a(SwipeLayout swipeLayout) {
            if (C24127d.this.f59666f == Attributes.Mode.Single) {
                C24127d.this.mo86625a(swipeLayout);
            }
        }

        @Override // com.larksuite.component.blockit.hashtag.widget.C24125b, com.larksuite.component.blockit.hashtag.widget.SwipeLayout.AbstractC24123f
        /* renamed from: d */
        public void mo86620d(SwipeLayout swipeLayout) {
            if (C24127d.this.f59666f == Attributes.Mode.Multiple) {
                C24127d.this.f59663c.remove(Integer.valueOf(this.f59670b));
            } else {
                C24127d.this.f59662b = -1;
            }
        }

        @Override // com.larksuite.component.blockit.hashtag.widget.C24125b, com.larksuite.component.blockit.hashtag.widget.SwipeLayout.AbstractC24123f
        /* renamed from: b */
        public void mo86618b(SwipeLayout swipeLayout) {
            if (C24127d.this.f59666f == Attributes.Mode.Multiple) {
                C24127d.this.f59663c.add(Integer.valueOf(this.f59670b));
                return;
            }
            C24127d.this.mo86625a(swipeLayout);
            C24127d.this.f59662b = this.f59670b;
        }

        C24129b(int i) {
            this.f59670b = i;
        }
    }

    /* renamed from: a */
    public void mo86625a(SwipeLayout swipeLayout) {
        for (SwipeLayout swipeLayout2 : this.f59664d) {
            if (swipeLayout2 != swipeLayout) {
                swipeLayout2.mo86585m();
            }
        }
    }

    public C24127d(AbstractC24126c cVar) {
        if (cVar != null) {
            this.f59665e = cVar;
            return;
        }
        throw new IllegalArgumentException("SwipeAdapterInterface can not be null");
    }

    /* renamed from: a */
    public boolean mo86626a(int i) {
        if (this.f59666f == Attributes.Mode.Multiple) {
            return this.f59663c.contains(Integer.valueOf(i));
        }
        if (this.f59662b == i) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public void mo86624a(View view, int i) {
        int a = this.f59665e.mo86534a(i);
        SwipeLayout swipeLayout = (SwipeLayout) view.findViewById(a);
        if (swipeLayout == null) {
            throw new IllegalStateException("can not find SwipeLayout in target view");
        } else if (swipeLayout.getTag(a) == null) {
            C24128a aVar = new C24128a(i);
            C24129b bVar = new C24129b(i);
            swipeLayout.mo86554a(bVar);
            swipeLayout.mo86553a(aVar);
            swipeLayout.setTag(a, new C24130c(i, bVar, aVar));
            this.f59664d.add(swipeLayout);
        } else {
            C24130c cVar = (C24130c) swipeLayout.getTag(a);
            cVar.f59672b.mo86628a(i);
            cVar.f59671a.mo86627a(i);
            cVar.f59673c = i;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.larksuite.component.blockit.hashtag.widget.d$c */
    public class C24130c {

        /* renamed from: a */
        C24128a f59671a;

        /* renamed from: b */
        C24129b f59672b;

        /* renamed from: c */
        int f59673c;

        C24130c(int i, C24129b bVar, C24128a aVar) {
            this.f59672b = bVar;
            this.f59671a = aVar;
            this.f59673c = i;
        }
    }
}
