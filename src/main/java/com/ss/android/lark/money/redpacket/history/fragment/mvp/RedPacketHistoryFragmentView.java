package com.ss.android.lark.money.redpacket.history.fragment.mvp;

import android.app.Activity;
import android.graphics.Typeface;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.TextView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.SimpleItemAnimator;
import butterknife.BindView;
import com.google.android.material.appbar.AppBarLayout;
import com.larksuite.component.ui.imageview.LKUIRoundedImageView;
import com.larksuite.component.ui.toast.LKUIToast;
import com.larksuite.component.universe_design.dialog.UDDialog;
import com.larksuite.component.universe_design.timepicker.impl.action.UDTimePickerBuilder;
import com.larksuite.suite.R;
import com.ss.android.lark.money.MoneyModule;
import com.ss.android.lark.money.p2367c.C48033a;
import com.ss.android.lark.money.redpacket.history.fragment.adapter.C48131a;
import com.ss.android.lark.money.redpacket.history.fragment.mvp.AbstractC48144a;
import com.ss.android.lark.money.redpacket.history.fragment.p2371b.C48135a;
import com.ss.android.lark.money.redpacket.widget.DialogC48191a;
import com.ss.android.lark.money.redpacket.widget.RedPacketYearPickerBuilder;
import com.ss.android.lark.money_export.IMoneyModuleDependency;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.lark.widget.listener.OnSingleClickListener;
import com.ss.android.lark.widget.ptr.LKUIPtrClassicFrameLayout;
import com.ss.android.lark.widget.ptr.LKUIPtrDefaultHandler2;
import com.ss.android.lark.widget.ptr.LKUIPtrFrameLayout;
import com.ss.android.lark.widget.recyclerview.RecyclerViewScrollDetector;
import java.util.List;

public class RedPacketHistoryFragmentView implements AbstractC48144a.AbstractC48146b {

    /* renamed from: f */
    private static final int f121151f = UIHelper.dp2px(64.0f);

    /* renamed from: a */
    public int f121152a;

    /* renamed from: b */
    public int f121153b;

    /* renamed from: c */
    public C48131a f121154c;

    /* renamed from: d */
    public AbstractC48144a.AbstractC48146b.AbstractC48147a f121155d;

    /* renamed from: e */
    public UDDialog f121156e;

    /* renamed from: g */
    private Activity f121157g;

    /* renamed from: h */
    private AbstractC48143a f121158h;

    /* renamed from: i */
    private DialogC48191a f121159i;
    @BindView(6314)
    public AppBarLayout mAppbarLayout;
    @BindView(7056)
    public LKUIPtrClassicFrameLayout mPtrLayout;
    @BindView(7079)
    public RecyclerView mRecyclerView;
    @BindView(7141)
    public View mRootView;
    @BindView(6353)
    public LKUIRoundedImageView mRoundImageView;
    @BindView(7394)
    public TextView mTotalAmountLabelTV;
    @BindView(7395)
    public TextView mTotalAmountTV;
    @BindView(7396)
    public TextView mTotalNumTV;
    @BindView(7558)
    public View mYearLayout;
    @BindView(7559)
    public TextView mYearTV;

    /* renamed from: com.ss.android.lark.money.redpacket.history.fragment.mvp.RedPacketHistoryFragmentView$a */
    public interface AbstractC48143a {
        /* renamed from: a */
        void mo168513a(RedPacketHistoryFragmentView redPacketHistoryFragmentView);
    }

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void destroy() {
        this.f121158h = null;
    }

    @Override // com.ss.android.lark.money.redpacket.history.fragment.mvp.AbstractC48144a.AbstractC48146b
    /* renamed from: a */
    public void mo168522a() {
        this.mPtrLayout.refreshComplete();
    }

    @Override // com.ss.android.lark.money.redpacket.history.fragment.mvp.AbstractC48144a.AbstractC48146b
    /* renamed from: c */
    public void mo168531c() {
        DialogC48191a aVar = this.f121159i;
        if (aVar != null) {
            aVar.dismiss();
        }
    }

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void create() {
        this.f121158h.mo168513a(this);
        m190024i();
    }

    /* renamed from: g */
    public int mo168535g() {
        return this.f121154c.getItemCount() * UIHelper.dp2px(64.0f);
    }

    @Override // com.ss.android.lark.money.redpacket.history.fragment.mvp.AbstractC48144a.AbstractC48146b
    /* renamed from: b */
    public void mo168529b() {
        if (this.f121159i == null) {
            this.f121159i = new DialogC48191a(this.f121157g);
        }
        this.f121159i.show();
    }

    @Override // com.ss.android.lark.money.redpacket.history.fragment.mvp.AbstractC48144a.AbstractC48146b
    /* renamed from: d */
    public void mo168532d() {
        C48135a aVar = new C48135a();
        aVar.f121143a = 2;
        this.f121154c.add(aVar);
        mo168536h();
    }

    @Override // com.ss.android.lark.money.redpacket.history.fragment.mvp.AbstractC48144a.AbstractC48146b
    /* renamed from: e */
    public void mo168533e() {
        this.mRecyclerView.requestLayout();
        this.mRootView.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() {
            /* class com.ss.android.lark.money.redpacket.history.fragment.mvp.RedPacketHistoryFragmentView.ViewTreeObserver$OnGlobalLayoutListenerC481383 */

            public void onGlobalLayout() {
                RedPacketHistoryFragmentView.this.mRootView.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                if (RedPacketHistoryFragmentView.this.mRootView.getHeight() >= UIHelper.dp2px(230.0f) + RedPacketHistoryFragmentView.this.mo168535g()) {
                    RedPacketHistoryFragmentView.this.mo168536h();
                }
            }
        });
    }

    /* renamed from: h */
    public void mo168536h() {
        AppBarLayout.Behavior behavior = new AppBarLayout.Behavior();
        behavior.setDragCallback(new AppBarLayout.Behavior.DragCallback() {
            /* class com.ss.android.lark.money.redpacket.history.fragment.mvp.RedPacketHistoryFragmentView.C481394 */

            @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior.BaseDragCallback
            public boolean canDrag(AppBarLayout appBarLayout) {
                return false;
            }
        });
        ((CoordinatorLayout.LayoutParams) this.mAppbarLayout.getLayoutParams()).setBehavior(behavior);
        this.mRecyclerView.setNestedScrollingEnabled(false);
    }

    /* renamed from: f */
    public void mo168534f() {
        if (this.f121156e == null) {
            this.f121156e = new RedPacketYearPickerBuilder(this.f121157g).mo168648a(this.f121157g.getString(R.string.Lark_Legacy_Cancel)).mo168649b(this.f121157g.getString(R.string.Lark_Legacy_Confirm)).mo168647a(new UDTimePickerBuilder.TimePickerActonListener() {
                /* class com.ss.android.lark.money.redpacket.history.fragment.mvp.RedPacketHistoryFragmentView.C481372 */

                @Override // com.larksuite.component.universe_design.timepicker.impl.action.UDTimePickerBuilder.TimePickerActonListener
                public void onClickRightAction(UDDialog uDDialog, int i, int i2, int i3, int i4, int i5) {
                    if (RedPacketHistoryFragmentView.this.f121153b != i) {
                        RedPacketHistoryFragmentView.this.f121155d.mo168542a(i);
                    }
                    if (RedPacketHistoryFragmentView.this.f121156e != null) {
                        RedPacketHistoryFragmentView.this.f121156e.dismiss();
                    }
                }
            }).build();
        }
        this.f121156e.show();
    }

    /* renamed from: i */
    private void m190024i() {
        this.mRecyclerView.setLayoutManager(new LinearLayoutManager(this.f121157g));
        ((SimpleItemAnimator) this.mRecyclerView.getItemAnimator()).setSupportsChangeAnimations(false);
        C48131a aVar = new C48131a(this.f121157g, this.f121152a);
        this.f121154c = aVar;
        this.mRecyclerView.setAdapter(aVar);
        this.f121154c.mo168519a(new C48131a.AbstractC48134a() {
            /* class com.ss.android.lark.money.redpacket.history.fragment.mvp.RedPacketHistoryFragmentView.C481405 */

            @Override // com.ss.android.lark.money.redpacket.history.fragment.adapter.C48131a.AbstractC48134a
            /* renamed from: a */
            public void mo168521a(String str) {
                boolean z = true;
                if (RedPacketHistoryFragmentView.this.f121152a != 1) {
                    z = false;
                }
                RedPacketHistoryFragmentView.this.f121155d.mo168543a(str, z);
            }
        });
        this.mPtrLayout.setKeepHeaderWhenRefresh(true);
        this.mPtrLayout.setForceBackWhenComplete(true);
        this.mPtrLayout.disableWhenHorizontalMove(true);
        this.mPtrLayout.setPtrHandler(new LKUIPtrDefaultHandler2() {
            /* class com.ss.android.lark.money.redpacket.history.fragment.mvp.RedPacketHistoryFragmentView.C481416 */

            @Override // com.ss.android.lark.widget.ptr.LKUIPtrHandler, com.ss.android.lark.widget.ptr.LKUIPtrDefaultHandler
            public boolean checkCanDoRefresh(LKUIPtrFrameLayout lKUIPtrFrameLayout, View view, View view2) {
                return false;
            }

            @Override // com.ss.android.lark.widget.ptr.LKUIPtrHandler
            public void onRefreshBegin(LKUIPtrFrameLayout lKUIPtrFrameLayout) {
            }

            @Override // com.ss.android.lark.widget.ptr.LKUIPtrHandler2
            public void onLoadMoreBegin(LKUIPtrFrameLayout lKUIPtrFrameLayout) {
                RedPacketHistoryFragmentView.this.f121155d.mo168545b();
            }

            @Override // com.ss.android.lark.widget.ptr.LKUIPtrDefaultHandler2, com.ss.android.lark.widget.ptr.LKUIPtrHandler2
            public boolean checkCanDoLoadMore(LKUIPtrFrameLayout lKUIPtrFrameLayout, View view, View view2) {
                if (!RedPacketHistoryFragmentView.this.f121155d.mo168544a() || !super.checkCanDoLoadMore(lKUIPtrFrameLayout, view, view2)) {
                    return false;
                }
                return true;
            }
        });
        this.mRecyclerView.addOnScrollListener(new RecyclerViewScrollDetector() {
            /* class com.ss.android.lark.money.redpacket.history.fragment.mvp.RedPacketHistoryFragmentView.C481427 */

            @Override // com.ss.android.lark.widget.recyclerview.RecyclerViewScrollDetector
            public void onScrollStop(int i, int i2) {
            }

            @Override // com.ss.android.lark.widget.recyclerview.RecyclerViewScrollDetector
            public void onScrollToBottom() {
            }

            @Override // com.ss.android.lark.widget.recyclerview.RecyclerViewScrollDetector
            public void onScrollPassed(int i, int i2) {
                if (i2 >= RedPacketHistoryFragmentView.this.f121154c.getItemCount() - 3 && RedPacketHistoryFragmentView.this.f121155d.mo168544a()) {
                    RedPacketHistoryFragmentView.this.f121155d.mo168545b();
                }
            }
        });
    }

    /* renamed from: a */
    public void setViewDelegate(AbstractC48144a.AbstractC48146b.AbstractC48147a aVar) {
        this.f121155d = aVar;
    }

    @Override // com.ss.android.lark.money.redpacket.history.fragment.mvp.AbstractC48144a.AbstractC48146b
    /* renamed from: b */
    public void mo168530b(List<C48135a> list) {
        this.f121154c.addAll(list);
    }

    @Override // com.ss.android.lark.money.redpacket.history.fragment.mvp.AbstractC48144a.AbstractC48146b
    /* renamed from: a */
    public void mo168526a(String str) {
        LKUIToast.show(this.f121157g, str);
    }

    /* renamed from: a */
    private void m190022a(long j) {
        this.mTotalAmountTV.setText(C48033a.m189577a(((double) j) * 0.01d));
        this.mTotalAmountTV.setTypeface(Typeface.createFromAsset(this.f121157g.getAssets(), "fonts/DINAlternateBold.ttf"));
        this.mTotalAmountLabelTV.setVisibility(0);
    }

    /* renamed from: b */
    private void m190023b(int i) {
        boolean z;
        String str;
        if (this.f121152a == 0) {
            z = true;
        } else {
            z = false;
        }
        String string = UIHelper.getString(R.string.Lark_Legacy_HistoryTotalSuffix);
        if (z) {
            str = UIHelper.getString(R.string.Lark_Legacy_HistoryTotalGrabPrefix);
        } else {
            str = UIHelper.getString(R.string.Lark_Legacy_HistoryTotalSendPrefix);
        }
        String valueOf = String.valueOf(i);
        SpannableString spannableString = new SpannableString(str + valueOf + string);
        spannableString.setSpan(new ForegroundColorSpan(ContextCompat.getColor(this.f121157g, R.color.lkui_Y600)), str.length(), str.length() + valueOf.length(), 34);
        this.mTotalNumTV.setText(spannableString);
    }

    @Override // com.ss.android.lark.money.redpacket.history.fragment.mvp.AbstractC48144a.AbstractC48146b
    /* renamed from: a */
    public void mo168523a(int i) {
        this.f121153b = i;
        TextView textView = this.mYearTV;
        textView.setText(String.valueOf(i) + UIHelper.getString(R.string.Lark_Legacy_HistoryYearLabel));
        this.mYearLayout.setOnClickListener(new OnSingleClickListener() {
            /* class com.ss.android.lark.money.redpacket.history.fragment.mvp.RedPacketHistoryFragmentView.C481361 */

            @Override // com.ss.android.lark.widget.listener.OnSingleClickListener
            public void onSingleClick(View view) {
                RedPacketHistoryFragmentView.this.mo168534f();
            }
        });
    }

    @Override // com.ss.android.lark.money.redpacket.history.fragment.mvp.AbstractC48144a.AbstractC48146b
    /* renamed from: a */
    public void mo168528a(List<C48135a> list) {
        this.f121154c.resetAll(list);
        this.mRecyclerView.setNestedScrollingEnabled(true);
    }

    @Override // com.ss.android.lark.money.redpacket.history.fragment.mvp.AbstractC48144a.AbstractC48146b
    /* renamed from: a */
    public void mo168527a(String str, String str2) {
        if (!TextUtils.isEmpty(str)) {
            IMoneyModuleDependency.IImageDependency imageDependency = MoneyModule.getDependency().getImageDependency();
            Activity activity = this.f121157g;
            LKUIRoundedImageView lKUIRoundedImageView = this.mRoundImageView;
            int i = f121151f;
            imageDependency.loadAvatarImage(activity, str, str2, lKUIRoundedImageView, i, i);
        }
    }

    public RedPacketHistoryFragmentView(Activity activity, int i, AbstractC48143a aVar) {
        this.f121157g = activity;
        this.f121152a = i;
        this.f121158h = aVar;
    }

    @Override // com.ss.android.lark.money.redpacket.history.fragment.mvp.AbstractC48144a.AbstractC48146b
    /* renamed from: a */
    public void mo168524a(int i, long j, int i2) {
        m190023b(i);
        m190022a(j);
        mo168523a(i2);
    }
}
