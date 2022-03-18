package com.ss.android.lark.message.vote;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.C1363f;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.larksuite.framework.utils.CollectionUtils;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.message.card.p2262b.C45292a;
import com.ss.android.lark.message.card.p2262b.C45293b;
import com.ss.android.lark.message.vote.AbstractC45384a;
import com.ss.android.lark.message.vote.VoteCardOptionsAdapter;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.ss.android.lark.message.vote.c */
public class C45389c {

    /* renamed from: a */
    public final Context f114961a;

    /* renamed from: b */
    private final boolean f114962b;

    /* renamed from: c */
    private final boolean f114963c;

    /* renamed from: d */
    private final boolean f114964d;

    /* renamed from: e */
    private final boolean f114965e;

    /* renamed from: com.ss.android.lark.message.vote.c$a */
    public static final class C45392a {

        /* renamed from: a */
        public Context f114974a;

        /* renamed from: b */
        public boolean f114975b;

        /* renamed from: c */
        public boolean f114976c;

        /* renamed from: d */
        public boolean f114977d;

        /* renamed from: e */
        public boolean f114978e;

        /* renamed from: a */
        public C45389c mo160250a() {
            return new C45389c(this);
        }

        /* renamed from: a */
        public C45392a mo160249a(boolean z) {
            this.f114975b = z;
            return this;
        }

        /* renamed from: b */
        public C45392a mo160251b(boolean z) {
            this.f114976c = z;
            return this;
        }

        /* renamed from: c */
        public C45392a mo160252c(boolean z) {
            this.f114978e = z;
            return this;
        }

        private C45392a(Context context) {
            this.f114975b = true;
            this.f114976c = true;
            this.f114977d = true;
            this.f114978e = true;
            this.f114974a = context;
        }
    }

    /* renamed from: a */
    public static C45392a m180248a(Context context) {
        return new C45392a(context);
    }

    private C45389c(C45392a aVar) {
        this.f114961a = aVar.f114974a;
        this.f114962b = aVar.f114975b;
        this.f114963c = aVar.f114976c;
        this.f114964d = aVar.f114977d;
        this.f114965e = aVar.f114978e;
    }

    /* renamed from: a */
    public Map<String, String> mo160246a(VoteCardOptionsAdapter voteCardOptionsAdapter) {
        HashMap hashMap = new HashMap();
        if (voteCardOptionsAdapter == null) {
            return hashMap;
        }
        for (C45292a aVar : voteCardOptionsAdapter.getItems()) {
            if (aVar.mo160013e()) {
                hashMap.put(aVar.mo160004b(), aVar.mo160008c());
            }
        }
        return hashMap;
    }

    /* renamed from: a */
    public void mo160247a(AbstractC45384a aVar, final C45293b bVar) {
        final VoteCardOptionsAdapter voteCardOptionsAdapter;
        VoteCardOptionsAdapter voteCardOptionsAdapter2;
        String str;
        if (aVar != null && bVar != null) {
            List<C45292a> d = bVar.mo160028d();
            if (!CollectionUtils.isEmpty(d)) {
                TextView a = aVar.mo160232a();
                TextView b = aVar.mo160233b();
                View c = aVar.mo160234c();
                RecyclerView d2 = aVar.mo160235d();
                RecyclerView.ItemAnimator itemAnimator = d2.getItemAnimator();
                if (itemAnimator instanceof C1363f) {
                    ((C1363f) itemAnimator).setSupportsChangeAnimations(false);
                    itemAnimator.setAddDuration(0);
                    itemAnimator.setChangeDuration(0);
                    itemAnimator.setMoveDuration(0);
                    itemAnimator.setRemoveDuration(0);
                }
                TextView e = aVar.mo160236e();
                TextView f = aVar.mo160237f();
                final AbstractC45384a.AbstractC45386b h = aVar.mo160239h();
                AbstractC45384a.AbstractC45385a i = aVar.mo160240i();
                final TextView g = aVar.mo160238g();
                if (this.f114962b) {
                    c.setVisibility(0);
                    a.setText(bVar.mo160020a().get(0));
                    if (bVar.mo160027c() > 1) {
                        str = UIUtils.getString(this.f114961a, R.string.Lark_Legacy_MultipleSelection);
                    } else {
                        str = UIUtils.getString(this.f114961a, R.string.Lark_Legacy_SingleSelectionInfo);
                    }
                    b.setText(str);
                } else {
                    c.setVisibility(8);
                }
                if (this.f114963c) {
                    d2.setVisibility(0);
                    if (d2.getAdapter() == null) {
                        voteCardOptionsAdapter2 = new VoteCardOptionsAdapter(this.f114961a);
                        d2.setLayoutManager(new LinearLayoutManager(this.f114961a, 1, false));
                        d2.setAdapter(voteCardOptionsAdapter2);
                    } else {
                        voteCardOptionsAdapter2 = (VoteCardOptionsAdapter) d2.getAdapter();
                    }
                    voteCardOptionsAdapter2.resetAll(d);
                    voteCardOptionsAdapter2.mo160225a(bVar.mo160024b());
                    voteCardOptionsAdapter2.mo160229b(bVar.mo160027c());
                    voteCardOptionsAdapter2.mo160227a(new VoteCardOptionsAdapter.AbstractC45383a() {
                        /* class com.ss.android.lark.message.vote.C45389c.C453901 */

                        @Override // com.ss.android.lark.message.vote.VoteCardOptionsAdapter.AbstractC45383a
                        /* renamed from: a */
                        public void mo160231a(int i) {
                            if (i <= 0) {
                                g.setEnabled(false);
                                g.setText(bVar.mo160020a().get(1));
                                g.setTextColor(UIUtils.getColor(C45389c.this.f114961a, R.color.text_placeholder));
                            } else if (!TextUtils.isEmpty(bVar.mo160029e())) {
                                g.setEnabled(true);
                                g.setText(bVar.mo160020a().get(2));
                                g.setTextColor(UIUtils.getColor(C45389c.this.f114961a, R.color.text_title));
                            }
                        }
                    });
                    voteCardOptionsAdapter2.mo160228a(i);
                    voteCardOptionsAdapter = voteCardOptionsAdapter2;
                } else {
                    VoteCardOptionsAdapter voteCardOptionsAdapter3 = new VoteCardOptionsAdapter(this.f114961a);
                    d2.setVisibility(8);
                    voteCardOptionsAdapter = voteCardOptionsAdapter3;
                }
                if (this.f114964d) {
                    g.setVisibility(0);
                    g.setEnabled(false);
                    g.setOnClickListener(new View.OnClickListener() {
                        /* class com.ss.android.lark.message.vote.C45389c.View$OnClickListenerC453912 */

                        public void onClick(View view) {
                            g.setEnabled(false);
                            AbstractC45384a.AbstractC45386b bVar = h;
                            if (bVar != null) {
                                bVar.onVote(bVar.mo160029e(), C45389c.this.mo160246a(voteCardOptionsAdapter));
                            }
                        }
                    });
                    if (TextUtils.isEmpty(bVar.mo160029e())) {
                        g.setVisibility(8);
                    } else {
                        g.setVisibility(0);
                        g.setText(bVar.mo160020a().get(1));
                        g.setTextColor(UIUtils.getColor(this.f114961a, R.color.text_placeholder));
                    }
                } else {
                    g.setVisibility(8);
                }
                if (!this.f114965e) {
                    f.setVisibility(8);
                    e.setVisibility(8);
                } else if (TextUtils.isEmpty(bVar.mo160029e())) {
                    f.setVisibility(0);
                    f.setText(bVar.mo160020a().get(1) + bVar.mo160020a().get(2));
                    e.setVisibility(0);
                    e.setText(bVar.mo160020a().get(3) + bVar.mo160020a().get(4));
                } else {
                    f.setVisibility(8);
                    e.setVisibility(8);
                }
            }
        }
    }
}
