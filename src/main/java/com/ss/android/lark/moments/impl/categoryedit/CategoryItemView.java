package com.ss.android.lark.moments.impl.categoryedit;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.RotateAnimation;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.firebase.messaging.Constants;
import com.larksuite.framework.utils.DeviceUtils;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.lark.widget.listener.OnSingleClickListener;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0018\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\r2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016J\u0006\u0010\u0017\u001a\u00020\u0013J\u0010\u0010\u0018\u001a\u00020\u00132\b\b\u0002\u0010\u0019\u001a\u00020\u001aR\u001a\u0010\u0005\u001a\u00020\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0007\"\u0004\b\b\u0010\tR\u000e\u0010\n\u001a\u00020\u000bX\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\f\u001a\u0004\u0018\u00010\rX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011¨\u0006\u001b"}, d2 = {"Lcom/ss/android/lark/moments/impl/categoryedit/CategoryItemView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "isEditing", "", "()Z", "setEditing", "(Z)V", "shakingAnim", "Landroid/view/animation/RotateAnimation;", "tabData", "Lcom/ss/android/lark/moments/impl/categoryedit/TabData;", "getTabData", "()Lcom/ss/android/lark/moments/impl/categoryedit/TabData;", "setTabData", "(Lcom/ss/android/lark/moments/impl/categoryedit/TabData;)V", "initItemView", "", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "clickItemListener", "Lcom/ss/android/lark/moments/impl/categoryedit/OnClickTabItemListener;", "shutEditing", "trigEditing", "animDelay", "", "im_moments-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.moments.impl.categoryedit.a */
public final class CategoryItemView extends ConstraintLayout {

    /* renamed from: a */
    public final RotateAnimation f119223a;

    /* renamed from: b */
    private TabData f119224b;

    /* renamed from: c */
    private boolean f119225c;

    /* renamed from: d */
    private HashMap f119226d;

    /* renamed from: a */
    public View mo166132a(int i) {
        if (this.f119226d == null) {
            this.f119226d = new HashMap();
        }
        View view = (View) this.f119226d.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f119226d.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    /* renamed from: a */
    public final boolean mo166135a() {
        return this.f119225c;
    }

    public final TabData getTabData() {
        return this.f119224b;
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.moments.impl.categoryedit.a$d */
    public static final class RunnableC47272d implements Runnable {

        /* renamed from: a */
        final /* synthetic */ CategoryItemView f119233a;

        RunnableC47272d(CategoryItemView aVar) {
            this.f119233a = aVar;
        }

        public final void run() {
            CategoryItemView aVar = this.f119233a;
            aVar.startAnimation(aVar.f119223a);
        }
    }

    /* renamed from: b */
    public final void mo166136b() {
        CategoryState e;
        this.f119225c = false;
        TabData hVar = this.f119224b;
        if (hVar == null || (e = hVar.mo166164e()) == null || !C47274c.m187200b(e)) {
            TabData hVar2 = this.f119224b;
            if (hVar2 != null && !hVar2.mo166163d()) {
                ((TextView) mo166132a(R.id.tvCategory)).setTextColor(UIUtils.getColor(getContext(), R.color.text_title));
                TextView textView = (TextView) mo166132a(R.id.tvCategory);
                Intrinsics.checkExpressionValueIsNotNull(textView, "tvCategory");
                textView.setBackground(UIUtils.getDrawable(getContext(), R.drawable.moments_category_edit_item_bg_selector));
            }
        } else {
            ((TextView) mo166132a(R.id.tvCategory)).setTextColor(UIUtils.getColor(getContext(), R.color.primary_pri_600));
            TextView textView2 = (TextView) mo166132a(R.id.tvCategory);
            Intrinsics.checkExpressionValueIsNotNull(textView2, "tvCategory");
            textView2.setBackground(UIUtils.getDrawable(getContext(), R.drawable.moments_category_edit_item_current_bg));
        }
        ImageView imageView = (ImageView) mo166132a(R.id.ivAction);
        Intrinsics.checkExpressionValueIsNotNull(imageView, "ivAction");
        imageView.setVisibility(8);
        clearAnimation();
    }

    public final void setEditing(boolean z) {
        this.f119225c = z;
    }

    public final void setTabData(TabData hVar) {
        this.f119224b = hVar;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/lark/moments/impl/categoryedit/CategoryItemView$initItemView$3", "Lcom/ss/android/lark/widget/listener/OnSingleClickListener;", "onSingleClick", "", "v", "Landroid/view/View;", "im_moments-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.moments.impl.categoryedit.a$c */
    public static final class C47271c extends OnSingleClickListener {

        /* renamed from: a */
        final /* synthetic */ CategoryItemView f119231a;

        /* renamed from: b */
        final /* synthetic */ OnClickTabItemListener f119232b;

        @Override // com.ss.android.lark.widget.listener.OnSingleClickListener
        public void onSingleClick(View view) {
            OnClickTabItemListener gVar = this.f119232b;
            if (gVar != null) {
                gVar.mo166110a(this.f119231a);
            }
        }

        C47271c(CategoryItemView aVar, OnClickTabItemListener gVar) {
            this.f119231a = aVar;
            this.f119232b = gVar;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CategoryItemView(Context context) {
        super(context);
        Intrinsics.checkParameterIsNotNull(context, "context");
        LayoutInflater.from(context).inflate(R.layout.moments_category_edit_item, this);
        RotateAnimation rotateAnimation = new RotateAnimation(-0.5f, 0.5f, 1, 0.5f, 1, 0.5f);
        rotateAnimation.setDuration(150);
        rotateAnimation.setRepeatMode(2);
        rotateAnimation.setRepeatCount(-1);
        this.f119223a = rotateAnimation;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/lark/moments/impl/categoryedit/CategoryItemView$initItemView$1", "Lcom/ss/android/lark/widget/listener/OnSingleClickListener;", "onSingleClick", "", "v", "Landroid/view/View;", "im_moments-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.moments.impl.categoryedit.a$a */
    public static final class C47269a extends OnSingleClickListener {

        /* renamed from: a */
        final /* synthetic */ CategoryItemView f119227a;

        /* renamed from: b */
        final /* synthetic */ OnClickTabItemListener f119228b;

        @Override // com.ss.android.lark.widget.listener.OnSingleClickListener
        public void onSingleClick(View view) {
            OnClickTabItemListener gVar;
            TabData tabData = this.f119227a.getTabData();
            if (tabData == null) {
                return;
            }
            if (this.f119227a.mo166135a()) {
                if (tabData.mo166163d() && (gVar = this.f119228b) != null) {
                    gVar.mo166110a(this.f119227a);
                }
            } else if (C47274c.m187199a(tabData.mo166164e())) {
                OnClickTabItemListener gVar2 = this.f119228b;
                if (gVar2 != null) {
                    gVar2.mo166111a(tabData.mo166160a());
                }
            } else {
                OnClickTabItemListener gVar3 = this.f119228b;
                if (gVar3 != null) {
                    gVar3.mo166112a(tabData.mo166160a(), tabData.mo166161b(), tabData.mo166162c());
                }
            }
        }

        C47269a(CategoryItemView aVar, OnClickTabItemListener gVar) {
            this.f119227a = aVar;
            this.f119228b = gVar;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/lark/moments/impl/categoryedit/CategoryItemView$initItemView$2", "Landroid/view/View$OnLongClickListener;", "onLongClick", "", "v", "Landroid/view/View;", "im_moments-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.moments.impl.categoryedit.a$b */
    public static final class View$OnLongClickListenerC47270b implements View.OnLongClickListener {

        /* renamed from: a */
        final /* synthetic */ CategoryItemView f119229a;

        /* renamed from: b */
        final /* synthetic */ OnClickTabItemListener f119230b;

        public boolean onLongClick(View view) {
            TabData tabData;
            CategoryState e;
            boolean z = false;
            if (this.f119230b == null || view == null || (tabData = this.f119229a.getTabData()) == null || (e = tabData.mo166164e()) == null) {
                return false;
            }
            TabData tabData2 = this.f119229a.getTabData();
            if (tabData2 != null && !tabData2.mo166163d() && this.f119229a.mo166135a()) {
                return false;
            }
            if (this.f119229a.mo166135a() && !C47274c.m187199a(e)) {
                return false;
            }
            OnClickTabItemListener gVar = this.f119230b;
            boolean a = this.f119229a.mo166135a();
            TabData tabData3 = this.f119229a.getTabData();
            if (tabData3 != null && tabData3.mo166163d() && C47274c.m187199a(e)) {
                z = true;
            }
            return gVar.mo166113a(view, a, z);
        }

        View$OnLongClickListenerC47270b(CategoryItemView aVar, OnClickTabItemListener gVar) {
            this.f119229a = aVar;
            this.f119230b = gVar;
        }
    }

    /* renamed from: a */
    public final void mo166133a(long j) {
        TabData hVar;
        CategoryState e;
        this.f119225c = true;
        TextView textView = (TextView) mo166132a(R.id.tvCategory);
        Intrinsics.checkExpressionValueIsNotNull(textView, "tvCategory");
        textView.setBackground(UIUtils.getDrawable(getContext(), R.drawable.moments_category_edit_item_bg_selector));
        TabData hVar2 = this.f119224b;
        if (hVar2 == null || !hVar2.mo166163d()) {
            ((TextView) mo166132a(R.id.tvCategory)).setTextColor(UIUtils.getColor(getContext(), R.color.text_disable));
            ImageView imageView = (ImageView) mo166132a(R.id.ivAction);
            Intrinsics.checkExpressionValueIsNotNull(imageView, "ivAction");
            imageView.setVisibility(8);
        } else {
            ((TextView) mo166132a(R.id.tvCategory)).setTextColor(UIUtils.getColor(getContext(), R.color.text_title));
            ImageView imageView2 = (ImageView) mo166132a(R.id.ivAction);
            Intrinsics.checkExpressionValueIsNotNull(imageView2, "ivAction");
            imageView2.setVisibility(0);
        }
        TabData hVar3 = this.f119224b;
        if (hVar3 != null && hVar3.mo166163d() && (hVar = this.f119224b) != null && (e = hVar.mo166164e()) != null && C47274c.m187199a(e)) {
            postDelayed(new RunnableC47272d(this), j);
        }
    }

    /* renamed from: a */
    public final void mo166134a(TabData hVar, OnClickTabItemListener gVar) {
        Intrinsics.checkParameterIsNotNull(hVar, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
        this.f119224b = hVar;
        TextView textView = (TextView) mo166132a(R.id.tvCategory);
        Intrinsics.checkExpressionValueIsNotNull(textView, "tvCategory");
        ViewGroup.LayoutParams layoutParams = textView.getLayoutParams();
        layoutParams.width = (DeviceUtils.getScreenWidth(getContext()) - UIUtils.dp2px(getContext(), 48.0f)) / 2;
        TextView textView2 = (TextView) mo166132a(R.id.tvCategory);
        Intrinsics.checkExpressionValueIsNotNull(textView2, "tvCategory");
        textView2.setLayoutParams(layoutParams);
        TextView textView3 = (TextView) mo166132a(R.id.tvCategory);
        Intrinsics.checkExpressionValueIsNotNull(textView3, "tvCategory");
        textView3.setText(hVar.mo166161b());
        ImageView imageView = (ImageView) mo166132a(R.id.ivAction);
        Intrinsics.checkExpressionValueIsNotNull(imageView, "ivAction");
        imageView.setVisibility(8);
        int i = C47273b.f119234a[hVar.mo166164e().ordinal()];
        if (i == 1) {
            ((ImageView) mo166132a(R.id.ivAction)).setImageDrawable(UIHelper.getDrawable(R.drawable.ud_icon_delete_colorful));
            ((TextView) mo166132a(R.id.tvCategory)).setTextColor(UIUtils.getColor(getContext(), R.color.primary_pri_600));
            TextView textView4 = (TextView) mo166132a(R.id.tvCategory);
            Intrinsics.checkExpressionValueIsNotNull(textView4, "tvCategory");
            textView4.setBackground(UIUtils.getDrawable(getContext(), R.drawable.moments_category_edit_item_current_bg));
        } else if (i == 2) {
            ((ImageView) mo166132a(R.id.ivAction)).setImageDrawable(UIHelper.getDrawable(R.drawable.ud_icon_add_colorful));
            ((TextView) mo166132a(R.id.tvCategory)).setTextColor(UIUtils.getColor(getContext(), R.color.text_title));
            TextView textView5 = (TextView) mo166132a(R.id.tvCategory);
            Intrinsics.checkExpressionValueIsNotNull(textView5, "tvCategory");
            textView5.setBackground(UIUtils.getDrawable(getContext(), R.drawable.moments_category_edit_item_current_bg));
        } else if (i == 3) {
            ((ImageView) mo166132a(R.id.ivAction)).setImageDrawable(UIHelper.getDrawable(R.drawable.ud_icon_delete_colorful));
            ((TextView) mo166132a(R.id.tvCategory)).setTextColor(UIUtils.getColor(getContext(), R.color.text_title));
            TextView textView6 = (TextView) mo166132a(R.id.tvCategory);
            Intrinsics.checkExpressionValueIsNotNull(textView6, "tvCategory");
            textView6.setBackground(UIUtils.getDrawable(getContext(), R.drawable.moments_category_edit_item_bg_selector));
        } else if (i == 4) {
            ((ImageView) mo166132a(R.id.ivAction)).setImageDrawable(UIHelper.getDrawable(R.drawable.ud_icon_add_colorful));
            ((TextView) mo166132a(R.id.tvCategory)).setTextColor(UIUtils.getColor(getContext(), R.color.text_title));
            TextView textView7 = (TextView) mo166132a(R.id.tvCategory);
            Intrinsics.checkExpressionValueIsNotNull(textView7, "tvCategory");
            textView7.setBackground(UIUtils.getDrawable(getContext(), R.drawable.moments_category_edit_item_bg_selector));
        }
        setOnClickListener(new C47269a(this, gVar));
        setOnLongClickListener(new View$OnLongClickListenerC47270b(this, gVar));
        ((ImageView) mo166132a(R.id.ivAction)).setOnClickListener(new C47271c(this, gVar));
    }

    /* renamed from: a */
    public static /* synthetic */ void m187193a(CategoryItemView aVar, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            j = 0;
        }
        aVar.mo166133a(j);
    }
}
