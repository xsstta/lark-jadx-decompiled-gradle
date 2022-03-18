package com.ss.android.lark.mail.impl.compose.mention;

import android.animation.ValueAnimator;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ee.bear.facade.common.C7667e;
import com.bytedance.ee.bear.p522q.p523a.AbstractC10550f;
import com.bytedance.lark.pb.email.client.v1.SearchMemberInfo;
import com.larksuite.component.universe_design.checkbox.UDCheckBox;
import com.larksuite.framework.utils.CollectionUtils;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.mail.impl.C41816b;
import com.ss.android.lark.mail.impl.compose.mention.C42029c;
import java.util.List;

/* renamed from: com.ss.android.lark.mail.impl.compose.mention.a */
public class C42021a extends C7667e implements C42029c.AbstractC42031a {

    /* renamed from: a */
    public AbstractC42025a f106633a;

    /* renamed from: b */
    public UDCheckBox f106634b;

    /* renamed from: c */
    private final String f106635c = "MentionFragment";

    /* renamed from: d */
    private AbstractC10550f f106636d;

    /* renamed from: e */
    private RecyclerView f106637e;

    /* renamed from: f */
    private View f106638f;

    /* renamed from: g */
    private View f106639g;

    /* renamed from: h */
    private View f106640h;

    /* renamed from: i */
    private View f106641i;

    /* renamed from: j */
    private TextView f106642j;

    /* renamed from: k */
    private TextView f106643k;

    /* renamed from: l */
    private boolean f106644l = C41816b.m166115a().mo150154u().mo150160a("larkmail.cli.mention.addto");

    /* renamed from: m */
    private C42029c f106645m;

    /* renamed from: n */
    private ValueAnimator f106646n;

    /* renamed from: o */
    private ValueAnimator f106647o;

    /* renamed from: com.ss.android.lark.mail.impl.compose.mention.a$a */
    interface AbstractC42025a {
        /* renamed from: a */
        void mo151020a();

        /* renamed from: a */
        void mo151021a(SearchMemberInfo searchMemberInfo);

        /* renamed from: a */
        void mo151022a(boolean z);
    }

    /* renamed from: b */
    private void m167186b() {
        this.f106636d = AbstractC10550f.AbstractC10551a.m43717b(getActivity());
    }

    @Override // com.bytedance.ee.bear.facade.common.C7667e, com.bytedance.ee.bear.facade.common.C7718l, androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        ValueAnimator valueAnimator = this.f106646n;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator valueAnimator2 = this.f106647o;
        if (valueAnimator2 != null) {
            valueAnimator2.cancel();
        }
    }

    /* renamed from: a */
    public void mo151035a() {
        RecyclerView recyclerView = this.f106637e;
        if (recyclerView != null) {
            ValueAnimator duration = ValueAnimator.ofInt(recyclerView.getHeight(), 0).setDuration(200L);
            this.f106647o = duration;
            duration.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                /* class com.ss.android.lark.mail.impl.compose.mention.$$Lambda$a$JYKEfMMnVPit7XxOVfrbxwaTqU */

                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    C42021a.this.m167185a((C42021a) valueAnimator);
                }
            });
            this.f106647o.start();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo151037a(AbstractC42025a aVar) {
        this.f106633a = aVar;
    }

    @Override // com.bytedance.ee.bear.facade.common.C7667e, com.bytedance.ee.bear.facade.common.C7718l, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        m167186b();
    }

    @Override // com.ss.android.lark.mail.impl.compose.mention.C42029c.AbstractC42031a
    /* renamed from: a */
    public void mo151036a(SearchMemberInfo searchMemberInfo) {
        Log.m165389i("MentionFragment", "onItemClick");
        AbstractC42025a aVar = this.f106633a;
        if (aVar != null) {
            aVar.mo151021a(searchMemberInfo);
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: a */
    private /* synthetic */ void m167185a(ValueAnimator valueAnimator) {
        RecyclerView recyclerView = this.f106637e;
        if (recyclerView != null) {
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) recyclerView.getLayoutParams();
            layoutParams.height = ((Integer) valueAnimator.getAnimatedValue()).intValue();
            this.f106637e.setLayoutParams(layoutParams);
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: b */
    private /* synthetic */ void m167187b(ValueAnimator valueAnimator) {
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f106637e.getLayoutParams();
        layoutParams.height = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        this.f106637e.setLayoutParams(layoutParams);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo151038a(List<SearchMemberInfo> list, boolean z) {
        float f;
        Log.m165389i("MentionFragment", "update");
        this.f106645m.mo151046a(list);
        this.f106637e.scrollToPosition(0);
        this.f106634b.setChecked(z);
        if (CollectionUtils.isEmpty(list)) {
            this.f106637e.setVisibility(8);
            this.f106641i.setVisibility(8);
            this.f106643k.setVisibility(0);
            return;
        }
        this.f106637e.setVisibility(0);
        int size = list.size();
        if (size > 2) {
            f = 166.0f;
        } else if (size > 1) {
            f = 136.0f;
        } else {
            f = 68.0f;
        }
        ValueAnimator valueAnimator = this.f106646n;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            this.f106646n.cancel();
        }
        this.f106637e.setLayoutParams(new LinearLayout.LayoutParams(-1, UIUtils.dp2px(this.f106637e.getContext(), f)));
        this.f106641i.setVisibility(0);
        this.f106643k.setVisibility(8);
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
        if (layoutParams == null) {
            Log.m165383e("MentionFragment", "layoutParams is null");
            return;
        }
        layoutParams.setMargins(0, 0, 0, this.f106636d.mo39936j() + getResources().getDimensionPixelSize(R.dimen.toolbar_menu_height) + UIUtils.dp2px(view.getContext(), 1.0f));
        view.setLayoutParams(layoutParams);
        ValueAnimator duration = ValueAnimator.ofInt(0, UIUtils.dp2px(this.f106637e.getContext(), 166.0f)).setDuration(200L);
        this.f106646n = duration;
        duration.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            /* class com.ss.android.lark.mail.impl.compose.mention.$$Lambda$a$e2xBCLBRm8HRdpS1PPHvbqjSps */

            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                C42021a.this.m167187b(valueAnimator);
            }
        });
        this.f106646n.start();
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i;
        int i2;
        int i3 = 0;
        View inflate = layoutInflater.inflate(R.layout.mail_compose_mention_layout, viewGroup, false);
        this.f106639g = inflate;
        View findViewById = inflate.findViewById(R.id.mail_compose_mention_touch);
        this.f106640h = findViewById;
        findViewById.setOnClickListener(new View.OnClickListener() {
            /* class com.ss.android.lark.mail.impl.compose.mention.C42021a.View$OnClickListenerC420221 */

            public void onClick(View view) {
                if (C42021a.this.f106633a != null) {
                    C42021a.this.f106633a.mo151020a();
                }
            }
        });
        UDCheckBox uDCheckBox = (UDCheckBox) this.f106639g.findViewById(R.id.mail_mention_recipient_radio);
        this.f106634b = uDCheckBox;
        uDCheckBox.setOnCheckedChangeListener(new UDCheckBox.OnCheckedChangeListener() {
            /* class com.ss.android.lark.mail.impl.compose.mention.C42021a.C420232 */

            @Override // com.larksuite.component.universe_design.checkbox.UDCheckBox.OnCheckedChangeListener
            public void onCheckedChanged(UDCheckBox uDCheckBox, boolean z) {
                if (C42021a.this.f106633a != null) {
                    C42021a.this.f106633a.mo151022a(z);
                }
            }
        });
        UDCheckBox uDCheckBox2 = this.f106634b;
        if (this.f106644l) {
            i = 0;
        } else {
            i = 8;
        }
        uDCheckBox2.setVisibility(i);
        View findViewById2 = this.f106639g.findViewById(R.id.mail_mention_space);
        this.f106638f = findViewById2;
        if (this.f106644l) {
            i3 = 8;
        }
        findViewById2.setVisibility(i3);
        this.f106637e = (RecyclerView) this.f106639g.findViewById(R.id.mail_compose_mention_list);
        TextView textView = (TextView) this.f106639g.findViewById(R.id.mail_compose_mention_title);
        this.f106642j = textView;
        textView.setOnClickListener(new View.OnClickListener() {
            /* class com.ss.android.lark.mail.impl.compose.mention.C42021a.View$OnClickListenerC420243 */

            public void onClick(View view) {
                C42021a.this.f106634b.toggle();
            }
        });
        TextView textView2 = this.f106642j;
        if (this.f106644l) {
            i2 = R.string.Mail_Edit_AddToRecipient;
        } else {
            i2 = R.string.Mail_Compose_Mentions_Title;
        }
        textView2.setText(i2);
        this.f106641i = this.f106639g.findViewById(R.id.mail_mention_recipient_ll);
        this.f106637e.setLayoutManager(new LinearLayoutManager(getContext()));
        C42029c cVar = new C42029c(getActivity(), this);
        this.f106645m = cVar;
        this.f106637e.setAdapter(cVar);
        TextView textView3 = (TextView) this.f106639g.findViewById(R.id.mail_compose_mention_hint);
        this.f106643k = textView3;
        textView3.setText(R.string.Mail_Compose_NoResults);
        return this.f106639g;
    }
}
