package com.bytedance.ee.bear.middleground.feed.p457e;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.AbstractC1178x;
import androidx.lifecycle.LifecycleOwner;
import androidx.recyclerview.widget.C1374g;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.SimpleItemAnimator;
import com.bytedance.ee.bear.facade.common.AbstractC7665c;
import com.bytedance.ee.bear.facade.common.AbstractC7666d;
import com.bytedance.ee.bear.facade.common.AbstractC7710h;
import com.bytedance.ee.bear.facade.common.empty.C7690d;
import com.bytedance.ee.bear.facade.common.empty.C7692e;
import com.bytedance.ee.bear.facade.common.empty.EmptyView;
import com.bytedance.ee.bear.facade.common.widget.Toast;
import com.bytedance.ee.bear.facade.common.widget.p382a.C7728a;
import com.bytedance.ee.bear.middleground.comment.export.AbstractC9224g;
import com.bytedance.ee.bear.middleground.comment.export.bean.CommentBean;
import com.bytedance.ee.bear.middleground.comment.export.bean.ICommentTranslate;
import com.bytedance.ee.bear.middleground.comment.export.bean.TranslateConfig;
import com.bytedance.ee.bear.middleground.feed.export.bean.AbstractC9490b;
import com.bytedance.ee.bear.middleground.feed.export.bean.AbstractC9492e;
import com.bytedance.ee.bear.middleground.feed.export.bean.AbstractC9494g;
import com.bytedance.ee.bear.middleground.feed.export.bean.AbstractC9495h;
import com.bytedance.ee.bear.middleground.feed.export.bean.AtBean;
import com.bytedance.ee.bear.middleground.feed.export.bean.BaseFeedMessageDetailBean;
import com.bytedance.ee.bear.middleground.feed.export.bean.DeleteBean;
import com.bytedance.ee.bear.middleground.feed.export.bean.FeedCommentDetailBean;
import com.bytedance.ee.bear.middleground.feed.export.bean.LikeBean;
import com.bytedance.ee.bear.middleground.feed.export.bean.MessageConfig;
import com.bytedance.ee.bear.middleground.feed.export.bean.MessageResultBean;
import com.bytedance.ee.bear.middleground.feed.export.bean.StatusTitleBean;
import com.bytedance.ee.bear.middleground.feed.p454b.AbstractC9431a;
import com.bytedance.ee.bear.middleground.feed.p454b.C9432b;
import com.bytedance.ee.bear.middleground.feed.p456d.C9437a;
import com.bytedance.ee.bear.middleground.feed.statistics.FeedReportV2;
import com.bytedance.ee.bear.middleground.feed.view.adapter.FeedItemComment;
import com.bytedance.ee.bear.middleground.feed.view.adapter.FeedItemDelete;
import com.bytedance.ee.bear.middleground.feed.view.adapter.FeedItemLike;
import com.bytedance.ee.bear.middleground.feed.view.adapter.FeedItemMention;
import com.bytedance.ee.bear.middleground.feed.view.adapter.FeedItemStatusTitle;
import com.bytedance.ee.bear.middleground.feed.view.empty.FeedPanelStatusConfig;
import com.bytedance.ee.bear.service.C10917c;
import com.bytedance.ee.bear.widgets.AbstractView$OnClickListenerC11839e;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.p701d.C13615c;
import com.bytedance.ee.util.p718t.C13743h;
import com.huawei.hms.location.LocationRequest;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.suite.R;
import com.ss.android.lark.reaction.widget.panel.C53085d;
import com.ss.android.lark.reaction.widget.panel.ReactionPanelFacade;
import io.reactivex.AbstractC68307f;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function5;
import org.koin.java.KoinJavaComponent;

/* renamed from: com.bytedance.ee.bear.middleground.feed.e.b */
public class C9460b implements AbstractC9438a {

    /* renamed from: a */
    public final FragmentActivity f25472a;

    /* renamed from: b */
    public final C9486c f25473b;

    /* renamed from: c */
    private final ViewGroup f25474c;

    /* renamed from: d */
    private final View f25475d;

    /* renamed from: e */
    private final View f25476e;

    /* renamed from: f */
    private final RecyclerView f25477f;

    /* renamed from: g */
    private final EmptyView f25478g;

    /* renamed from: h */
    private final View f25479h;

    /* renamed from: i */
    private final C7728a f25480i;

    /* renamed from: j */
    private final C9432b f25481j = new C9432b();

    /* renamed from: k */
    private final C7690d f25482k;

    /* renamed from: l */
    private final AbstractC7666d f25483l = new AbstractC7666d() {
        /* class com.bytedance.ee.bear.middleground.feed.p457e.$$Lambda$b$h8DrD590tjorbVMFQTCZ_KyTo */

        @Override // com.bytedance.ee.bear.facade.common.AbstractC7666d
        public final boolean onBackPressed() {
            return C9460b.this.m39180m();
        }
    };

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ void m39147a(View view) {
    }

    @Override // com.bytedance.ee.bear.middleground.feed.p457e.AbstractC9438a
    /* renamed from: a */
    public void mo35884a(boolean z) {
        FeedReportV2.f25356a.mo35969i();
        FeedReportV2.f25356a.mo35964d().set(z);
        this.f25480i.mo30258d();
        this.f25480i.mo30259e();
        C13479a.m54764b("PanelView", "showPanel, auto: " + this.f25473b.mo36078f().isAuto());
        AbstractC7665c cVar = (AbstractC7665c) AbstractC7710h.C7711a.m30833a(this.f25472a, AbstractC7665c.class);
        if (cVar != null) {
            cVar.mo30121a(this.f25483l);
        }
        this.f25473b.mo36079g().mo23347a(true, false);
        this.f25475d.setTranslationX(BitmapDescriptorFactory.HUE_RED);
        this.f25475d.setTranslationY(BitmapDescriptorFactory.HUE_RED);
        if (this.f25475d.getParent() == null) {
            ViewGroup viewGroup = this.f25474c;
            if (viewGroup != null) {
                viewGroup.addView(this.f25475d);
            } else {
                ((ViewGroup) this.f25472a.findViewById(16908290)).addView(this.f25475d);
            }
            m39161c();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(C7728a.m30906c(), 0.0f);
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            /* class com.bytedance.ee.bear.middleground.feed.p457e.$$Lambda$b$SwukAmP3_iwp59WUzGTAaLUUNI */

            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                C9460b.this.m39166d((C9460b) valueAnimator);
            }
        });
        ofFloat.setDuration(200L);
        ofFloat.start();
        View view = this.f25475d;
        C7728a aVar = this.f25480i;
        aVar.getClass();
        view.post(new Runnable() {
            /* class com.bytedance.ee.bear.middleground.feed.p457e.$$Lambda$F2de42Ys2rzstADsO0vvb_go */

            public final void run() {
                C7728a.this.mo30263i();
            }
        });
    }

    @Override // com.bytedance.ee.bear.middleground.feed.p457e.AbstractC9438a
    /* renamed from: a */
    public void mo35879a() {
        mo36049c(false);
    }

    @Override // com.bytedance.ee.bear.middleground.feed.p457e.AbstractC9438a
    /* renamed from: a */
    public void mo35881a(MessageResultBean messageResultBean) {
        this.f25473b.mo36064a(messageResultBean, this.f25472a);
    }

    @Override // com.bytedance.ee.bear.middleground.feed.p457e.AbstractC9438a
    /* renamed from: a */
    public void mo35882a(String str) {
        this.f25473b.mo36066a(str, this.f25472a);
    }

    @Override // com.bytedance.ee.bear.middleground.feed.p457e.AbstractC9438a
    /* renamed from: a */
    public void mo35883a(List<String> list) {
        this.f25473b.mo36061a(this.f25472a, list);
    }

    @Override // com.bytedance.ee.bear.middleground.feed.p457e.AbstractC9438a
    /* renamed from: a */
    public void mo35880a(MessageConfig messageConfig) {
        C13479a.m54764b("PanelView", "setMessageConfig message");
        this.f25473b.mo36063a(messageConfig);
        m39175h();
        this.f25473b.mo36060a((Context) this.f25472a);
    }

    @Override // com.bytedance.ee.bear.middleground.feed.p457e.AbstractC9438a
    /* renamed from: a */
    public AbstractC68307f<String> mo35878a(boolean z, String str) {
        return this.f25473b.mo36059a(z, str);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m39153a(boolean z, CommentBean.CommentDetail commentDetail, RecyclerView.Adapter adapter, int i, TranslateConfig translateConfig) {
        if (z) {
            ((ICommentTranslate) KoinJavaComponent.m268610a(ICommentTranslate.class)).mo35258a().put(commentDetail.getReply_id(), true);
            adapter.notifyItemChanged(i);
        } else if (((ICommentTranslate) KoinJavaComponent.m268610a(ICommentTranslate.class)).mo35265g(translateConfig, commentDetail)) {
            Boolean bool = ((ICommentTranslate) KoinJavaComponent.m268610a(ICommentTranslate.class)).mo35258a().get(commentDetail.getReply_id());
            if (bool == null) {
                bool = false;
            }
            ((ICommentTranslate) KoinJavaComponent.m268610a(ICommentTranslate.class)).mo35258a().put(commentDetail.getReply_id(), Boolean.valueOf(!bool.booleanValue()));
            adapter.notifyItemChanged(i);
        } else if (TextUtils.isEmpty(commentDetail.getTranslate_content())) {
            this.f25473b.mo36072b(commentDetail.getComment_id(), commentDetail.getReply_id());
        } else {
            ((ICommentTranslate) KoinJavaComponent.m268610a(ICommentTranslate.class)).mo35258a().remove(commentDetail.getReply_id());
            adapter.notifyItemChanged(i);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: l */
    public /* synthetic */ void m39179l() {
        this.f25473b.mo36074c(this.f25472a);
    }

    /* access modifiers changed from: private */
    /* renamed from: m */
    public /* synthetic */ boolean m39180m() {
        if (!mo35887b()) {
            return false;
        }
        mo35879a();
        return true;
    }

    /* renamed from: c */
    private void m39161c() {
        this.f25473b.mo36070b().mo5923a(this.f25472a, new AbstractC1178x() {
            /* class com.bytedance.ee.bear.middleground.feed.p457e.$$Lambda$b$AaE4rNKyzaAwDS8rUF30LZlfs1k */

            @Override // androidx.lifecycle.AbstractC1178x
            public final void onChanged(Object obj) {
                C9460b.this.m39152a((C9460b) ((Integer) obj));
            }
        });
        this.f25473b.mo36075d(this.f25472a).mo5923a(this.f25472a, new AbstractC1178x() {
            /* class com.bytedance.ee.bear.middleground.feed.p457e.$$Lambda$b$D40TN8SUprLNLZ7ytcyMwTITsHM */

            @Override // androidx.lifecycle.AbstractC1178x
            public final void onChanged(Object obj) {
                C9460b.this.m39174g((List) obj);
            }
        });
    }

    /* renamed from: e */
    private void m39169e() {
        this.f25479h.setOnClickListener(new AbstractView$OnClickListenerC11839e(LocationRequest.PRIORITY_INDOOR) {
            /* class com.bytedance.ee.bear.middleground.feed.p457e.C9460b.C94611 */

            /* access modifiers changed from: protected */
            @Override // com.bytedance.ee.bear.widgets.AbstractView$OnClickListenerC11839e
            /* renamed from: a */
            public void mo16698a(View view) {
                Toast.showText(C9460b.this.f25472a, (int) R.string.Doc_Facade_Loading);
            }
        });
        this.f25480i.mo30253a(new C7728a.AbstractC7730a() {
            /* class com.bytedance.ee.bear.middleground.feed.p457e.$$Lambda$b$jsTNbEvWzQ0oP0lfGKeCxWhfYo */

            @Override // com.bytedance.ee.bear.facade.common.widget.p382a.C7728a.AbstractC7730a
            public final void onHeightChange(int i) {
                C9460b.this.m39155b((C9460b) i);
            }
        });
        this.f25478g.setOnRetryListener(new EmptyView.AbstractC7668a() {
            /* class com.bytedance.ee.bear.middleground.feed.p457e.$$Lambda$b$IfUs8oOiuDW1vRZSbS76SHwXZU */

            @Override // com.bytedance.ee.bear.facade.common.empty.EmptyView.AbstractC7668a
            public final void onFailedRetry() {
                C9460b.this.m39179l();
            }
        });
        this.f25475d.setOnClickListener(new AbstractView$OnClickListenerC11839e(LocationRequest.PRIORITY_INDOOR) {
            /* class com.bytedance.ee.bear.middleground.feed.p457e.C9460b.C94622 */

            /* access modifiers changed from: protected */
            @Override // com.bytedance.ee.bear.widgets.AbstractView$OnClickListenerC11839e
            /* renamed from: a */
            public void mo16698a(View view) {
                C9460b.this.mo35879a();
            }
        });
        this.f25476e.setOnClickListener($$Lambda$b$_qwQpAIGBl4aie_tL8hIx3AbrU.INSTANCE);
        this.f25477f.addOnScrollListener(new RecyclerView.OnScrollListener() {
            /* class com.bytedance.ee.bear.middleground.feed.p457e.C9460b.C94633 */

            @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
            public void onScrollStateChanged(RecyclerView recyclerView, int i) {
                super.onScrollStateChanged(recyclerView, i);
                C9460b.this.f25473b.mo36068a(false);
            }

            @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
            public void onScrolled(RecyclerView recyclerView, int i, int i2) {
                super.onScrolled(recyclerView, i, i2);
            }
        });
    }

    /* renamed from: i */
    private ValueAnimator m39176i() {
        ValueAnimator ofInt = ValueAnimator.ofInt(0, this.f25475d.getHeight());
        ofInt.setDuration(300L);
        ofInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            /* class com.bytedance.ee.bear.middleground.feed.p457e.$$Lambda$b$TbLuDNrkQXk2NSiliLCCYyPwJxs */

            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                C9460b.this.m39162c((C9460b) valueAnimator);
            }
        });
        return ofInt;
    }

    /* renamed from: j */
    private ValueAnimator m39177j() {
        ValueAnimator ofInt = ValueAnimator.ofInt(0, this.f25475d.getWidth());
        ofInt.setDuration(300L);
        ofInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            /* class com.bytedance.ee.bear.middleground.feed.p457e.$$Lambda$b$No8I0Qb13QCDegWE42FXtdaizKU */

            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                C9460b.this.m39156b((C9460b) valueAnimator);
            }
        });
        return ofInt;
    }

    /* renamed from: k */
    private ValueAnimator m39178k() {
        ValueAnimator ofInt = ValueAnimator.ofInt(this.f25475d.getWidth(), 0);
        ofInt.setDuration(300L);
        ofInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            /* class com.bytedance.ee.bear.middleground.feed.p457e.$$Lambda$b$tKG8Q9LxHl_lQaucMSpyOWa2aAE */

            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                C9460b.this.m39146a((C9460b) valueAnimator);
            }
        });
        return ofInt;
    }

    @Override // com.bytedance.ee.bear.middleground.feed.p457e.AbstractC9438a
    /* renamed from: d */
    public void mo35889d() {
        C13479a.m54764b("PanelView", "destroy message");
        this.f25473b.mo36071b(this.f25472a);
    }

    /* renamed from: f */
    private void m39172f() {
        this.f25480i.mo30259e();
        this.f25480i.mo30252a(this.f25475d.findViewById(R.id.rl_title));
        if (this.f25473b.mo36078f().isLoadingSuccess()) {
            this.f25479h.setVisibility(8);
        } else {
            this.f25479h.setVisibility(0);
        }
        this.f25477f.setLayoutManager(new LinearLayoutManager(this.f25472a));
        this.f25477f.setAdapter(this.f25481j);
        this.f25477f.setOverScrollMode(2);
        if (this.f25477f.getItemAnimator() instanceof SimpleItemAnimator) {
            ((SimpleItemAnimator) this.f25477f.getItemAnimator()).setSupportsChangeAnimations(false);
        }
        m39173g();
        this.f25478g.setConfig(new FeedPanelStatusConfig(this.f25472a, this.f25473b.mo36076d()).mo36056a().invoke());
    }

    /* renamed from: h */
    private void m39175h() {
        C13479a.m54764b("PanelView", "updateConfig: " + this.f25473b.mo36078f().isLoadingSuccess());
        if (this.f25473b.mo36078f().isLoadingSuccess()) {
            this.f25479h.setVisibility(8);
        } else {
            this.f25479h.setVisibility(0);
        }
        AbstractC9431a<? extends RecyclerView.ViewHolder, ? extends AbstractC9495h> a = this.f25481j.mo35944a(StatusTitleBean.class);
        if (a instanceof FeedItemStatusTitle) {
            ((FeedItemStatusTitle) a).mo36044a(this.f25473b.mo36078f().isCanReopen());
        }
        AbstractC9431a<? extends RecyclerView.ViewHolder, ? extends AbstractC9495h> a2 = this.f25481j.mo35944a(FeedCommentDetailBean.class);
        if (a2 instanceof FeedItemComment) {
            ((FeedItemComment) a2).mo35987a(this.f25473b.mo36078f().getTranslateConfig());
        }
    }

    /* renamed from: g */
    private void m39173g() {
        this.f25481j.mo35946a(LikeBean.class, new FeedItemLike(this.f25473b.mo36077e(), new Function1() {
            /* class com.bytedance.ee.bear.middleground.feed.p457e.$$Lambda$b$a4IHmJM_8_Z_N4gzx8UEztR82JU */

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C9460b.this.m39170f((String) obj);
            }
        }, new Function1() {
            /* class com.bytedance.ee.bear.middleground.feed.p457e.$$Lambda$b$70x5ZUFsFjxTLY7Nes00BO0S0GE */

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C9460b.this.m39171f((List) obj);
            }
        }));
        this.f25481j.mo35946a(DeleteBean.class, new FeedItemDelete(this.f25473b.mo36077e(), new Function1() {
            /* class com.bytedance.ee.bear.middleground.feed.p457e.$$Lambda$b$fL04YkYADaPvNIwVrL2e0p606zk */

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C9460b.this.m39167e((String) obj);
            }
        }, new Function1() {
            /* class com.bytedance.ee.bear.middleground.feed.p457e.$$Lambda$b$oZIpX21wNl018_oLLbZAITcAZHo */

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C9460b.this.m39168e((List) obj);
            }
        }, new Function2() {
            /* class com.bytedance.ee.bear.middleground.feed.p457e.$$Lambda$b$rLZfe28wsSVLIboTvEeQt29iQ */

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return C9460b.this.m39159c((String) obj, (C10917c) obj2);
            }
        }));
        this.f25481j.mo35946a(FeedCommentDetailBean.class, new FeedItemComment(this.f25473b.mo36073c(), this.f25473b.mo36078f().getTranslateConfig(), this.f25473b.mo36077e(), ((AbstractC9224g) KoinJavaComponent.m268610a(AbstractC9224g.class)).mo34612a(this.f25472a, 1, this.f25473b.mo36078f().getDocumentType(), new Function1<String, Boolean>() {
            /* class com.bytedance.ee.bear.middleground.feed.p457e.C9460b.C94644 */

            /* renamed from: a */
            public Boolean invoke(String str) {
                return Boolean.valueOf(C9460b.this.f25473b.mo36079g().mo23349b(str));
            }
        }, new Function1<String, Unit>() {
            /* class com.bytedance.ee.bear.middleground.feed.p457e.C9460b.C94655 */

            /* renamed from: a */
            public Unit invoke(String str) {
                C9460b.this.mo35879a();
                return Unit.INSTANCE;
            }
        }, new Function1<String, Unit>() {
            /* class com.bytedance.ee.bear.middleground.feed.p457e.C9460b.C94666 */

            /* renamed from: a */
            public Unit invoke(String str) {
                C9460b.this.f25473b.mo36079g().mo23345a(str, C9460b.this.f25473b.mo36077e());
                return Unit.INSTANCE;
            }
        }), new Function5() {
            /* class com.bytedance.ee.bear.middleground.feed.p457e.$$Lambda$b$_0sFh0QxOt5hF5JBSRJurGHWzmQ */

            @Override // kotlin.jvm.functions.Function5
            public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
                return C9460b.this.m39142a((View) obj, (Integer) obj2, (String) obj3, (String) obj4, (String) obj5);
            }
        }, new Function2() {
            /* class com.bytedance.ee.bear.middleground.feed.p457e.$$Lambda$b$uyGb1NrLkyvWa17i7w_R_THQf7Q */

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return C9460b.this.m39144a((String) obj, (Boolean) obj2);
            }
        }, new Function1() {
            /* class com.bytedance.ee.bear.middleground.feed.p457e.$$Lambda$b$3VlmytdWpWDzfNVM8Y5VlrkJIJw */

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C9460b.this.m39165d((List) obj);
            }
        }, new Function2() {
            /* class com.bytedance.ee.bear.middleground.feed.p457e.$$Lambda$b$mHijV_yItEPTKc6rs4JNtwTYdw */

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return C9460b.this.m39154b((String) obj, (C10917c) obj2);
            }
        }));
        this.f25481j.mo35946a(AtBean.class, new FeedItemMention(this.f25473b.mo36077e(), new Function1() {
            /* class com.bytedance.ee.bear.middleground.feed.p457e.$$Lambda$b$0q9UUKJNkKWnmU22mfjRTYNHU */

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C9460b.this.m39164d((String) obj);
            }
        }, new Function1() {
            /* class com.bytedance.ee.bear.middleground.feed.p457e.$$Lambda$b$4BXhOgN4e0DtCLdfXmfbQsjHhfo */

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C9460b.this.m39160c((List) obj);
            }
        }, new Function2() {
            /* class com.bytedance.ee.bear.middleground.feed.p457e.$$Lambda$b$E3P44eHd2zbBEHDoBsFnn26JzWE */

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return C9460b.this.m39143a((String) obj, (C10917c) obj2);
            }
        }));
    }

    @Override // com.bytedance.ee.bear.middleground.feed.p457e.AbstractC9438a
    /* renamed from: b */
    public boolean mo35887b() {
        if (this.f25475d.getParent() != null) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public /* synthetic */ Unit m39164d(String str) {
        m39163c(str);
        return null;
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public /* synthetic */ Unit m39167e(String str) {
        m39163c(str);
        return null;
    }

    /* access modifiers changed from: private */
    /* renamed from: g */
    public /* synthetic */ void m39174g(List list) {
        if (list != null) {
            m39158b(list);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public /* synthetic */ Unit m39160c(List list) {
        this.f25473b.mo36061a(this.f25472a, list);
        return null;
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public /* synthetic */ Unit m39165d(List list) {
        this.f25473b.mo36061a(this.f25472a, list);
        return null;
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public /* synthetic */ Unit m39168e(List list) {
        this.f25473b.mo36061a(this.f25472a, list);
        return null;
    }

    /* access modifiers changed from: private */
    /* renamed from: f */
    public /* synthetic */ Unit m39170f(String str) {
        if (!m39163c(str)) {
            return null;
        }
        mo35879a();
        return null;
    }

    @Override // com.bytedance.ee.bear.middleground.feed.p457e.AbstractC9438a
    /* renamed from: b */
    public void mo35885b(String str) {
        this.f25473b.mo36065a(str);
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public /* synthetic */ void m39156b(ValueAnimator valueAnimator) {
        this.f25475d.setTranslationX((float) (-((Integer) valueAnimator.getAnimatedValue()).intValue()));
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public /* synthetic */ void m39162c(ValueAnimator valueAnimator) {
        this.f25475d.setTranslationY((float) ((Integer) valueAnimator.getAnimatedValue()).intValue());
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public /* synthetic */ void m39166d(ValueAnimator valueAnimator) {
        this.f25475d.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }

    /* access modifiers changed from: private */
    /* renamed from: f */
    public /* synthetic */ Unit m39171f(List list) {
        this.f25473b.mo36061a(this.f25472a, list);
        return null;
    }

    /* renamed from: a */
    private void m39145a(int i) {
        if (i == 0) {
            this.f25482k.mo30158a(new C7692e.C7695b(2));
        } else if (i == 2) {
            this.f25482k.mo30158a(new C7692e.C7695b(1));
        } else if (i == 3) {
            this.f25482k.mo30158a(new C7692e.C7695b(3));
        } else if (i == 1) {
            this.f25482k.mo30158a(new C7692e.C7695b(0));
        } else if (i == 4) {
            mo35879a();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public /* synthetic */ void m39155b(int i) {
        this.f25473b.mo36079g().mo23339a(i);
        ((AbstractC9224g) KoinJavaComponent.m268610a(AbstractC9224g.class)).mo34614c().mo34619a(i);
        if (i == 0 && mo35887b()) {
            mo35879a();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m39146a(ValueAnimator valueAnimator) {
        this.f25475d.setTranslationX((float) (-((Integer) valueAnimator.getAnimatedValue()).intValue()));
    }

    /* renamed from: b */
    private void m39158b(List<AbstractC9495h> list) {
        C1374g.m6298a(new C13743h(this.f25481j.mo35948b(), list, new C13743h.AbstractC13745b<AbstractC9495h>() {
            /* class com.bytedance.ee.bear.middleground.feed.p457e.C9460b.C94688 */

            /* renamed from: a */
            public boolean mo34851a(AbstractC9495h hVar, AbstractC9495h hVar2) {
                if (!(hVar instanceof AbstractC9490b) || !(hVar2 instanceof AbstractC9490b) || hVar.getClass() != hVar2.getClass() || !((AbstractC9490b) hVar).isSameItem(hVar2)) {
                    return false;
                }
                return true;
            }

            /* renamed from: b */
            public boolean mo34853b(AbstractC9495h hVar, AbstractC9495h hVar2) {
                if (!(hVar instanceof AbstractC9490b) || !(hVar2 instanceof AbstractC9490b) || hVar.getClass() != hVar2.getClass() || !((AbstractC9490b) hVar).contentSame(hVar2)) {
                    return false;
                }
                return true;
            }
        }), false).mo7412a(this.f25481j);
        this.f25481j.mo35947a(list);
        C13479a.m54764b("PanelView", "auto scroll to first：" + this.f25473b.mo36080h());
        if (this.f25473b.mo36080h()) {
            ((LinearLayoutManager) this.f25477f.getLayoutManager()).scrollToPositionWithOffset(0, 0);
        }
    }

    /* renamed from: c */
    private boolean m39163c(String str) {
        ValueAnimator i = m39176i();
        i.addListener(new AnimatorListenerAdapter() {
            /* class com.bytedance.ee.bear.middleground.feed.p457e.C9460b.C94677 */

            public void onAnimationEnd(Animator animator) {
                super.onAnimationEnd(animator);
                C9460b.this.mo36049c(true);
            }
        });
        return this.f25473b.mo36069a(this.f25472a, str, i);
    }

    @Override // com.bytedance.ee.bear.middleground.feed.p457e.AbstractC9438a
    /* renamed from: b */
    public void mo35886b(boolean z) {
        C13479a.m54764b("PanelView", "toComment:" + z);
        if (z) {
            ((AbstractC9224g) KoinJavaComponent.m268610a(AbstractC9224g.class)).mo34614c().mo34619a(this.f25480i.mo30264j());
            m39177j().start();
            return;
        }
        if (!((AbstractC9224g) KoinJavaComponent.m268610a(AbstractC9224g.class)).mo34614c().mo34620a()) {
            this.f25480i.mo30249a((float) ((AbstractC9224g) KoinJavaComponent.m268610a(AbstractC9224g.class)).mo34614c().mo34621b());
        }
        m39178k().start();
    }

    /* renamed from: c */
    public void mo36049c(boolean z) {
        C13479a.m54764b("PanelView", "hide message");
        this.f25473b.mo36079g().mo23347a(false, z);
        this.f25473b.mo36062a((LifecycleOwner) this.f25472a);
        this.f25481j.mo35945a();
        this.f25481j.notifyDataSetChanged();
        this.f25480i.mo30259e();
        this.f25475d.setTranslationX(BitmapDescriptorFactory.HUE_RED);
        this.f25475d.setTranslationY(BitmapDescriptorFactory.HUE_RED);
        AbstractC7665c cVar = (AbstractC7665c) AbstractC7710h.C7711a.m30833a(this.f25472a, AbstractC7665c.class);
        if (cVar != null) {
            cVar.mo30122b(this.f25483l);
        }
        if (this.f25475d.getParent() != null) {
            ViewGroup viewGroup = this.f25474c;
            if (viewGroup != null) {
                viewGroup.removeView(this.f25475d);
            } else {
                ((ViewGroup) this.f25472a.findViewById(16908290)).removeView(this.f25475d);
            }
        }
        FeedReportV2.f25356a.mo35965e();
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m39157b(TextView textView) {
        if (this.f25473b.mo36078f().isCanCopy()) {
            ClipData newPlainText = ClipData.newPlainText(null, textView.getText().toString().replaceFirst("<doc.at.~#_%=`>", ""));
            ClipboardManager clipboardManager = (ClipboardManager) textView.getContext().getSystemService("clipboard");
            if (clipboardManager != null) {
                clipboardManager.setPrimaryClip(newPlainText);
            }
            Toast.showSuccessText(textView.getContext(), textView.getContext().getString(R.string.Doc_Comment_CopySuccess), 0);
            return;
        }
        Toast.showFailureText(textView.getContext(), textView.getContext().getString(R.string.Doc_Comment_CopyFailed), 0);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m39152a(Integer num) {
        if (num != null) {
            m39145a(num.intValue());
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public /* synthetic */ Unit m39154b(String str, C10917c cVar) {
        this.f25473b.mo36067a(str, cVar);
        return null;
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public /* synthetic */ Unit m39159c(String str, C10917c cVar) {
        this.f25473b.mo36067a(str, cVar);
        return null;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ Unit m39143a(String str, C10917c cVar) {
        this.f25473b.mo36067a(str, cVar);
        return null;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ Unit m39144a(String str, Boolean bool) {
        if (!m39163c(str) || !bool.booleanValue()) {
            return null;
        }
        mo35879a();
        return null;
    }

    /* renamed from: a */
    private void m39149a(View view, boolean z, List<C53085d> list) {
        list.add(new C53085d(C13615c.f35773a.getString(R.string.Doc_Comment_Copy), ((AbstractC9224g) KoinJavaComponent.m268610a(AbstractC9224g.class)).mo34611a().mo35287a("COPY"), new C53085d.AbstractC53086a((TextView) view.findViewById(R.id.tv_content)) {
            /* class com.bytedance.ee.bear.middleground.feed.p457e.$$Lambda$b$7EduJykaYpn8YZDFh_L7slI52k */
            public final /* synthetic */ TextView f$1;

            {
                this.f$1 = r2;
            }

            @Override // com.ss.android.lark.reaction.widget.panel.C53085d.AbstractC53086a
            public final void onMenuItemClick() {
                C9460b.this.m39157b((C9460b) this.f$1);
            }
        }));
    }

    /* renamed from: a */
    private void m39148a(View view, Integer num, String str, String str2) {
        if (str != null && str2 != null) {
            ArrayList arrayList = new ArrayList();
            m39149a(view, this.f25473b.mo36078f().isCanCopy(), arrayList);
            BaseFeedMessageDetailBean a = this.f25473b.mo36058a(str, str2);
            TranslateConfig translateConfig = this.f25473b.mo36078f().getTranslateConfig();
            if (!(a == null || translateConfig == null)) {
                CommentBean.CommentDetail a2 = C9437a.m39065a(a);
                if (((ICommentTranslate) KoinJavaComponent.m268610a(ICommentTranslate.class)).mo35264f(translateConfig, a2) || ((ICommentTranslate) KoinJavaComponent.m268610a(ICommentTranslate.class)).mo35265g(translateConfig, a2) || ((ICommentTranslate) KoinJavaComponent.m268610a(ICommentTranslate.class)).mo35263e(translateConfig, a2)) {
                    m39151a(this.f25481j, a2, num.intValue(), translateConfig, arrayList);
                }
            }
            new ReactionPanelFacade.C53071a(view).mo181310a(false).mo181315c(arrayList).mo181311a().mo181298a(view);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ Unit m39142a(View view, Integer num, String str, String str2, String str3) {
        m39148a(view, num, str2, str3);
        return null;
    }

    /* renamed from: a */
    private void m39151a(RecyclerView.Adapter<?> adapter, CommentBean.CommentDetail commentDetail, int i, TranslateConfig translateConfig, List<C53085d> list) {
        String str;
        boolean z;
        String str2;
        if (((ICommentTranslate) KoinJavaComponent.m268610a(ICommentTranslate.class)).mo35264f(translateConfig, commentDetail)) {
            str = C13615c.f35773a.getString(R.string.Doc_Comment_OriginalTitle);
            z = true;
        } else {
            if (((ICommentTranslate) KoinJavaComponent.m268610a(ICommentTranslate.class)).mo35265g(translateConfig, commentDetail)) {
                str2 = C13615c.f35773a.getString(R.string.Doc_Comment_PackUpTranslation);
            } else {
                str2 = C13615c.f35773a.getString(R.string.Doc_Comment_Translate_Str);
            }
            str = str2;
            z = false;
        }
        list.add(new C53085d(str, ((AbstractC9224g) KoinJavaComponent.m268610a(AbstractC9224g.class)).mo34611a().mo35287a("TRANSLATE"), new C53085d.AbstractC53086a(z, commentDetail, adapter, i, translateConfig) {
            /* class com.bytedance.ee.bear.middleground.feed.p457e.$$Lambda$b$LqC4RVD5J_01MOfHZUTigM8AAI */
            public final /* synthetic */ boolean f$1;
            public final /* synthetic */ CommentBean.CommentDetail f$2;
            public final /* synthetic */ RecyclerView.Adapter f$3;
            public final /* synthetic */ int f$4;
            public final /* synthetic */ TranslateConfig f$5;

            {
                this.f$1 = r2;
                this.f$2 = r3;
                this.f$3 = r4;
                this.f$4 = r5;
                this.f$5 = r6;
            }

            @Override // com.ss.android.lark.reaction.widget.panel.C53085d.AbstractC53086a
            public final void onMenuItemClick() {
                C9460b.this.m39153a((C9460b) this.f$1, (boolean) this.f$2, (CommentBean.CommentDetail) this.f$3, (RecyclerView.Adapter) this.f$4, (int) this.f$5);
            }
        }));
    }

    public C9460b(FragmentActivity fragmentActivity, ViewGroup viewGroup, AbstractC9492e eVar, AbstractC9494g gVar, C10917c cVar, MessageConfig messageConfig) {
        this.f25472a = fragmentActivity;
        this.f25474c = viewGroup;
        this.f25473b = new C9486c(eVar, gVar, cVar, messageConfig, fragmentActivity);
        View inflate = LayoutInflater.from(fragmentActivity).inflate(R.layout.midele_feed_panel_layout, (ViewGroup) null);
        this.f25475d = inflate;
        View findViewById = inflate.findViewById(R.id.v_bg);
        this.f25476e = findViewById;
        RecyclerView recyclerView = (RecyclerView) inflate.findViewById(R.id.rl_content);
        this.f25477f = recyclerView;
        EmptyView emptyView = (EmptyView) inflate.findViewById(R.id.list_no_data_tip);
        this.f25478g = emptyView;
        this.f25479h = inflate.findViewById(R.id.mask_view);
        this.f25480i = new C7728a(fragmentActivity, findViewById);
        this.f25482k = new C7690d(fragmentActivity, emptyView, recyclerView);
        m39172f();
        m39169e();
    }
}
