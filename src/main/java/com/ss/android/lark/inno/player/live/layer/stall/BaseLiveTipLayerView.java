package com.ss.android.lark.inno.player.live.layer.stall;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.huawei.hms.adapter.internal.CommonCode;
import com.larksuite.suite.R;
import com.ss.android.lark.inno.player.layer.AbstractC39016b;
import com.ss.android.lark.inno.utils.C39093c;
import com.ss.android.lark.mm.p2288b.C45851c;
import com.ss.android.lark.mm.p2288b.C45859k;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.lark.widget.listener.OnSingleClickListener;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0006\b&\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u001a\u001bB\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0006\u0010\f\u001a\u00020\rJ\b\u0010\u000e\u001a\u00020\rH\u0002J\b\u0010\u000f\u001a\u00020\u0010H&J\u0010\u0010\u0011\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\u0010H\u0002J\u0016\u0010\u0013\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020\u00102\u0006\u0010\u0015\u001a\u00020\u0016J\u000e\u0010\u0017\u001a\u00020\r2\u0006\u0010\u0018\u001a\u00020\u0010J\u0010\u0010\u0019\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020\u0010H\u0002R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0004¢\u0006\u0002\n\u0000¨\u0006\u001c"}, d2 = {"Lcom/ss/android/lark/inno/player/live/layer/stall/BaseLiveTipLayerView;", "Lcom/ss/android/lark/inno/player/layer/BaseLayerView;", "Lcom/ss/android/lark/inno/player/live/layer/stall/ILiveStallViewDepend;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "mTipContainer", "Landroid/view/ViewGroup;", "stallViewHolder", "Lcom/ss/android/lark/inno/player/live/layer/stall/BaseLiveTipLayerView$StallViewHolder;", "switchViewHolder", "Lcom/ss/android/lark/inno/player/live/layer/stall/BaseLiveTipLayerView$SwitchViewHolder;", "dismissChangeClarity", "", "dismissSuggestTip", "getLayoutId", "", "setSuggestionTip", "suggestedClarity", "show", "suggestedResolution", "delayDismiss", "", "showChangeClarity", CommonCode.MapKey.HAS_RESOLUTION, "showSuggestTip", "StallViewHolder", "SwitchViewHolder", "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.inno.player.live.a.e.a */
public abstract class BaseLiveTipLayerView extends AbstractC39016b<ILiveStallViewDepend> {

    /* renamed from: a */
    public final ViewGroup f100239a;

    /* renamed from: b */
    private final SwitchViewHolder f100240b;

    /* renamed from: c */
    private final StallViewHolder f100241c;

    public abstract int getLayoutId();

    /* access modifiers changed from: private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0006\u0010\u0017\u001a\u00020\u0018J\u0006\u0010\u0019\u001a\u00020\u0018R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\t\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0010\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000bR\u0011\u0010\u0012\u001a\u00020\u0013¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u000b¨\u0006\u001a"}, d2 = {"Lcom/ss/android/lark/inno/player/live/layer/stall/BaseLiveTipLayerView$StallViewHolder;", "", "baseLiveStallLayerView", "Lcom/ss/android/lark/inno/player/live/layer/stall/BaseLiveTipLayerView;", "v", "Landroid/view/View;", "(Lcom/ss/android/lark/inno/player/live/layer/stall/BaseLiveTipLayerView;Landroid/view/View;)V", "getBaseLiveStallLayerView", "()Lcom/ss/android/lark/inno/player/live/layer/stall/BaseLiveTipLayerView;", "closeView", "getCloseView", "()Landroid/view/View;", "dismissTask", "Ljava/lang/Runnable;", "getDismissTask", "()Ljava/lang/Runnable;", "modeView", "getModeView", "suggestSwitchTipText", "Landroid/widget/TextView;", "getSuggestSwitchTipText", "()Landroid/widget/TextView;", "getV", "dismiss", "", "show", "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.inno.player.live.a.e.a$a */
    public static final class StallViewHolder {

        /* renamed from: a */
        private final View f100242a;

        /* renamed from: b */
        private final View f100243b;

        /* renamed from: c */
        private final TextView f100244c;

        /* renamed from: d */
        private final Runnable f100245d = new RunnableC39042a(this);

        /* renamed from: e */
        private final BaseLiveTipLayerView f100246e;

        /* renamed from: f */
        private final View f100247f;

        /* renamed from: a */
        public final View mo142799a() {
            return this.f100243b;
        }

        /* renamed from: b */
        public final TextView mo142800b() {
            return this.f100244c;
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.inno.player.live.a.e.a$a$a */
        static final class RunnableC39042a implements Runnable {

            /* renamed from: a */
            final /* synthetic */ StallViewHolder f100249a;

            RunnableC39042a(StallViewHolder aVar) {
                this.f100249a = aVar;
            }

            public final void run() {
                this.f100249a.mo142801c();
            }
        }

        /* renamed from: c */
        public final void mo142801c() {
            C45859k.m181687b(this.f100245d);
            this.f100246e.f100239a.removeView(this.f100247f);
        }

        /* renamed from: d */
        public final void mo142802d() {
            if (this.f100247f.getParent() == null) {
                this.f100246e.f100239a.addView(this.f100247f);
            }
            C45859k.m181686a(this.f100245d, 5000);
        }

        public StallViewHolder(BaseLiveTipLayerView aVar, View view) {
            Intrinsics.checkParameterIsNotNull(aVar, "baseLiveStallLayerView");
            Intrinsics.checkParameterIsNotNull(view, "v");
            this.f100246e = aVar;
            this.f100247f = view;
            View findViewById = view.findViewById(R.id.v_close_click);
            Intrinsics.checkExpressionValueIsNotNull(findViewById, "v.findViewById(R.id.v_close_click)");
            this.f100242a = findViewById;
            View findViewById2 = view.findViewById(R.id.v_mode_click);
            Intrinsics.checkExpressionValueIsNotNull(findViewById2, "v.findViewById(R.id.v_mode_click)");
            this.f100243b = findViewById2;
            View findViewById3 = view.findViewById(R.id.tv_mode);
            Intrinsics.checkExpressionValueIsNotNull(findViewById3, "v.findViewById(R.id.tv_mode)");
            this.f100244c = (TextView) findViewById3;
            findViewById.setOnClickListener(new OnSingleClickListener(this) {
                /* class com.ss.android.lark.inno.player.live.layer.stall.BaseLiveTipLayerView.StallViewHolder.C390411 */

                /* renamed from: a */
                final /* synthetic */ StallViewHolder f100248a;

                /* JADX WARN: Incorrect args count in method signature: ()V */
                {
                    this.f100248a = r1;
                }

                @Override // com.ss.android.lark.widget.listener.OnSingleClickListener
                public void onSingleClick(View view) {
                    this.f100248a.mo142801c();
                }
            });
        }
    }

    /* access modifiers changed from: private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0006\u0010\u0013\u001a\u00020\u0014J\u0006\u0010\u0015\u001a\u00020\u0014R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\r\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0016"}, d2 = {"Lcom/ss/android/lark/inno/player/live/layer/stall/BaseLiveTipLayerView$SwitchViewHolder;", "", "baseLiveStallLayerView", "Lcom/ss/android/lark/inno/player/live/layer/stall/BaseLiveTipLayerView;", "v", "Landroid/view/View;", "(Lcom/ss/android/lark/inno/player/live/layer/stall/BaseLiveTipLayerView;Landroid/view/View;)V", "getBaseLiveStallLayerView", "()Lcom/ss/android/lark/inno/player/live/layer/stall/BaseLiveTipLayerView;", "dismissTask", "Ljava/lang/Runnable;", "getDismissTask", "()Ljava/lang/Runnable;", "switchingToMode", "Landroid/widget/TextView;", "getSwitchingToMode", "()Landroid/widget/TextView;", "getV", "()Landroid/view/View;", "dismiss", "", "show", "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.inno.player.live.a.e.a$b */
    public static final class SwitchViewHolder {

        /* renamed from: a */
        private final TextView f100250a;

        /* renamed from: b */
        private final Runnable f100251b = new RunnableC39043a(this);

        /* renamed from: c */
        private final BaseLiveTipLayerView f100252c;

        /* renamed from: d */
        private final View f100253d;

        /* renamed from: a */
        public final TextView mo142804a() {
            return this.f100250a;
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.inno.player.live.a.e.a$b$a */
        static final class RunnableC39043a implements Runnable {

            /* renamed from: a */
            final /* synthetic */ SwitchViewHolder f100254a;

            RunnableC39043a(SwitchViewHolder bVar) {
                this.f100254a = bVar;
            }

            public final void run() {
                this.f100254a.mo142805b();
            }
        }

        /* renamed from: b */
        public final void mo142805b() {
            C45859k.m181687b(this.f100251b);
            this.f100252c.f100239a.removeView(this.f100253d);
        }

        /* renamed from: c */
        public final void mo142806c() {
            if (this.f100253d.getParent() == null) {
                this.f100252c.f100239a.addView(this.f100253d);
            }
            C45859k.m181686a(this.f100251b, 2000);
        }

        public SwitchViewHolder(BaseLiveTipLayerView aVar, View view) {
            Intrinsics.checkParameterIsNotNull(aVar, "baseLiveStallLayerView");
            Intrinsics.checkParameterIsNotNull(view, "v");
            this.f100252c = aVar;
            this.f100253d = view;
            View findViewById = view.findViewById(R.id.switching_to_mode);
            Intrinsics.checkExpressionValueIsNotNull(findViewById, "v.findViewById(R.id.switching_to_mode)");
            this.f100250a = (TextView) findViewById;
        }
    }

    /* renamed from: c */
    public final void mo142797c() {
        this.f100241c.mo142801c();
    }

    /* renamed from: b */
    private final void m154069b(int i) {
        setSuggestionTip(i);
        this.f100241c.mo142802d();
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005¨\u0006\u0006"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick", "com/ss/android/lark/inno/player/live/layer/stall/BaseLiveTipLayerView$setSuggestionTip$1$1"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.inno.player.live.a.e.a$c */
    public static final class View$OnClickListenerC39044c implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ BaseLiveTipLayerView f100255a;

        /* renamed from: b */
        final /* synthetic */ int f100256b;

        View$OnClickListenerC39044c(BaseLiveTipLayerView aVar, int i) {
            this.f100255a = aVar;
            this.f100256b = i;
        }

        public final void onClick(View view) {
            this.f100255a.mo142797c();
            ((ILiveStallViewDepend) this.f100255a.getDepend()).mo142809a(this.f100256b);
            this.f100255a.mo142795a(this.f100256b);
        }
    }

    private final void setSuggestionTip(int i) {
        StallViewHolder aVar = this.f100241c;
        aVar.mo142800b().setText(C39093c.m154345b(i));
        aVar.mo142799a().setOnClickListener(new View$OnClickListenerC39044c(this, i));
    }

    /* renamed from: a */
    public final void mo142795a(int i) {
        this.f100240b.mo142804a().setText(UIHelper.mustacheFormat(C45851c.m181647a(R.string.Common_G_Player_SwitchingToNetwork), "network", C39093c.m154344a(i)));
        this.f100240b.mo142806c();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BaseLiveTipLayerView(Context context) {
        super(context);
        Intrinsics.checkParameterIsNotNull(context, "context");
        BaseLiveTipLayerView aVar = this;
        LayoutInflater.from(context).inflate(getLayoutId(), aVar);
        View inflate = LayoutInflater.from(context).inflate(R.layout.inno_live_layer_stall_tip, (ViewGroup) aVar, false);
        Intrinsics.checkExpressionValueIsNotNull(inflate, "v");
        this.f100241c = new StallViewHolder(this, inflate);
        View inflate2 = LayoutInflater.from(context).inflate(R.layout.inno_live_layer_stall_switch, (ViewGroup) aVar, false);
        Intrinsics.checkExpressionValueIsNotNull(inflate2, "v");
        this.f100240b = new SwitchViewHolder(this, inflate2);
        View findViewById = findViewById(R.id.ll_tip_container);
        Intrinsics.checkExpressionValueIsNotNull(findViewById, "findViewById(R.id.ll_tip_container)");
        this.f100239a = (ViewGroup) findViewById;
    }

    /* renamed from: a */
    public final void mo142796a(int i, boolean z) {
        m154069b(i);
    }
}
