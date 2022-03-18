package com.ss.android.lark.ai.smartreply;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.suite.R;
import com.ss.android.lark.ai.smartreply.dto.SmartReplyItem;
import com.ss.android.lark.ai.smartreply.inter.AbstractC28623e;
import com.ss.android.lark.ai.smartreply.inter.AbstractC28624f;
import java.util.List;

/* renamed from: com.ss.android.lark.ai.smartreply.d */
public class C28610d implements AbstractC28623e {

    /* renamed from: a */
    public RecyclerView f71991a;

    /* renamed from: b */
    private C28598b f71992b;

    /* renamed from: c */
    private ViewGroup f71993c;

    /* renamed from: d */
    private C28612a f71994d = new C28612a();

    /* renamed from: e */
    private ObjectAnimator f71995e;

    /* renamed from: f */
    private List<SmartReplyItem> f71996f;

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: e */
    private /* synthetic */ void m104907e() {
        this.f71993c.setVisibility(8);
    }

    @Override // com.ss.android.lark.ai.smartreply.inter.AbstractC28623e
    /* renamed from: b */
    public void mo101831b() {
        this.f71993c.setVisibility(0);
    }

    @Override // com.ss.android.lark.ai.smartreply.inter.AbstractC28623e
    /* renamed from: d */
    public boolean mo101833d() {
        if (this.f71993c.getVisibility() == 0) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.lark.ai.smartreply.inter.AbstractC28623e
    /* renamed from: c */
    public void mo101832c() {
        this.f71995e.cancel();
        this.f71992b.mo101805a((List<SmartReplyItem>) null, this.f71993c.getContext());
        this.f71992b.mo101801a();
        this.f71993c.post(new Runnable() {
            /* class com.ss.android.lark.ai.smartreply.$$Lambda$d$4FoMXPuJpsFYWVVoqgxCRTBLQ */

            public final void run() {
                C28610d.this.m104907e();
            }
        });
    }

    @Override // com.ss.android.lark.ai.smartreply.inter.AbstractC28623e
    /* renamed from: a */
    public boolean mo101830a() {
        List<SmartReplyItem> list = this.f71996f;
        if (!(list == null || list.size() == 0)) {
            for (SmartReplyItem smartReplyItem : this.f71996f) {
                if (smartReplyItem.mo101843d() == SmartReplyItem.Type.TODO) {
                    return true;
                }
            }
        }
        return false;
    }

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.lark.ai.smartreply.d$a */
    public class C28612a implements Animator.AnimatorListener {

        /* renamed from: a */
        List<SmartReplyItem> f71997a;

        public void onAnimationCancel(Animator animator) {
        }

        public void onAnimationRepeat(Animator animator) {
        }

        public void onAnimationStart(Animator animator) {
        }

        private C28612a() {
        }

        public void onAnimationEnd(Animator animator) {
            C28610d.this.mo101828a(this.f71997a);
            C28610d.this.f71991a.setAlpha(1.0f);
        }
    }

    @Override // com.ss.android.lark.ai.smartreply.inter.AbstractC28623e
    /* renamed from: a */
    public void mo101826a(RecyclerView.OnScrollListener onScrollListener) {
        this.f71991a.addOnScrollListener(onScrollListener);
    }

    public C28610d(ViewGroup viewGroup) {
        m104906a(viewGroup);
    }

    @Override // com.ss.android.lark.ai.smartreply.inter.AbstractC28623e
    /* renamed from: a */
    public void mo101827a(AbstractC28624f fVar) {
        this.f71992b.mo101804a(fVar);
    }

    /* renamed from: a */
    public void mo101828a(List<SmartReplyItem> list) {
        this.f71996f = list;
        this.f71992b.mo101805a(list, this.f71993c.getContext());
    }

    /* renamed from: a */
    private void m104906a(ViewGroup viewGroup) {
        this.f71993c = viewGroup;
        viewGroup.setVisibility(8);
        RecyclerView recyclerView = (RecyclerView) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.view_chat_smart_reply, viewGroup).findViewById(R.id.rv_chat_smart_reply);
        this.f71991a = recyclerView;
        recyclerView.setLayoutManager(new LinearLayoutManager(viewGroup.getContext(), 0, false));
        C28598b bVar = new C28598b(viewGroup.getContext());
        this.f71992b = bVar;
        this.f71991a.setAdapter(bVar);
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f71991a, "alpha", 1.0f, BitmapDescriptorFactory.HUE_RED);
        this.f71995e = ofFloat;
        ofFloat.setDuration(150L);
        this.f71995e.addListener(this.f71994d);
    }

    @Override // com.ss.android.lark.ai.smartreply.inter.AbstractC28623e
    /* renamed from: a */
    public void mo101829a(List<SmartReplyItem> list, boolean z) {
        if (!z || this.f71992b.getItemCount() == 0) {
            mo101828a(list);
            return;
        }
        this.f71994d.f71997a = list;
        if (!this.f71995e.isRunning()) {
            this.f71995e.start();
        }
    }
}
