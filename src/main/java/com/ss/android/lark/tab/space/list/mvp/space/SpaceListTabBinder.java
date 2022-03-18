package com.ss.android.lark.tab.space.list.mvp.space;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.google.firebase.messaging.Constants;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.C29990c;
import com.ss.android.lark.dependency.AbstractC36450aa;
import com.ss.android.lark.dependency.AbstractC36474h;
import com.ss.android.lark.dependency.AbstractC36498n;
import com.ss.android.lark.tab.space.list.entity.BaseListViewData;
import com.ss.android.lark.tab.space.list.entity.SpaceListViewData;
import com.ss.android.lark.tab.space.list.mvp.base.OnItemListener;
import com.ss.android.lark.tab.space.list.mvp.base.adapter.BaseCommonListTabBinder;
import com.ss.android.lark.tab.space.list.util.CommonTabListUtil;
import com.ss.android.lark.utils.C57782ag;
import com.ss.android.lark.utils.UIHelper;
import java.util.ArrayList;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001$B\r\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0012\u0010\u0013\u001a\u00020\u00022\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0016J\u0018\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u0003H\u0016J0\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u0018\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u00032\u000e\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u001d2\u0006\u0010\u001e\u001a\u00020\u0017H\u0016J0\u0010\u001f\u001a\u00020\u001b2\u0006\u0010\u0018\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u00032\u000e\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u001d2\u0006\u0010\u001e\u001a\u00020\u0017H\u0002J\u0018\u0010 \u001a\u00020\u001b2\u0006\u0010\u0018\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u0003H\u0002J\u0018\u0010!\u001a\u00020\u001b2\u0006\u0010\u0018\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u0003H\u0002J\u0018\u0010\"\u001a\u00020\u001b2\u0006\u0010\u0018\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u0003H\u0002J\u0018\u0010#\u001a\u00020\u001b2\u0006\u0010\u0018\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u0003H\u0002R#\u0010\u0007\u001a\n \t*\u0004\u0018\u00010\b0\b8BX\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\n\u0010\u000bR#\u0010\u000e\u001a\n \t*\u0004\u0018\u00010\u000f0\u000f8BX\u0002¢\u0006\f\n\u0004\b\u0012\u0010\r\u001a\u0004\b\u0010\u0010\u0011¨\u0006%"}, d2 = {"Lcom/ss/android/lark/tab/space/list/mvp/space/SpaceListTabBinder;", "Lcom/ss/android/lark/tab/space/list/mvp/base/adapter/BaseCommonListTabBinder;", "Lcom/ss/android/lark/tab/space/list/mvp/space/SpaceListTabBinder$SpaceListItemViewHolder;", "Lcom/ss/android/lark/tab/space/list/entity/SpaceListViewData;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "mDocDependency", "Lcom/ss/android/lark/dependency/IDocDependency;", "kotlin.jvm.PlatformType", "getMDocDependency", "()Lcom/ss/android/lark/dependency/IDocDependency;", "mDocDependency$delegate", "Lkotlin/Lazy;", "mLoginDependency", "Lcom/ss/android/lark/dependency/ILoginDependency;", "getMLoginDependency", "()Lcom/ss/android/lark/dependency/ILoginDependency;", "mLoginDependency$delegate", "createViewHolder", "parent", "Landroid/view/ViewGroup;", "getExtraWidth", "", "holder", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "onBindViewHolder", "", "itemListener", "Lcom/ss/android/lark/tab/space/list/mvp/base/OnItemListener;", "position", "setClickListeners", "setSpaceIcon", "setSpaceSubTitle", "setSpaceTag", "setSpaceTitle", "SpaceListItemViewHolder", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
public final class SpaceListTabBinder extends BaseCommonListTabBinder<SpaceListItemViewHolder, SpaceListViewData> {

    /* renamed from: b */
    private final Lazy f136508b = LazyKt.lazy(C55310a.INSTANCE);

    /* renamed from: c */
    private final Lazy f136509c = LazyKt.lazy(C55311b.INSTANCE);

    /* renamed from: c */
    private final AbstractC36498n m214522c() {
        return (AbstractC36498n) this.f136508b.getValue();
    }

    /* renamed from: d */
    private final AbstractC36450aa m214524d() {
        return (AbstractC36450aa) this.f136509c.getValue();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u001e\u0010\u0005\u001a\u00020\u00068\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001e\u0010\u000b\u001a\u00020\u00068\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\b\"\u0004\b\r\u0010\nR\u001e\u0010\u000e\u001a\u00020\u000f8\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001e\u0010\u0014\u001a\u00020\u000f8\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0011\"\u0004\b\u0016\u0010\u0013R\u001e\u0010\u0017\u001a\u00020\u000f8\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0011\"\u0004\b\u0019\u0010\u0013¨\u0006\u001a"}, d2 = {"Lcom/ss/android/lark/tab/space/list/mvp/space/SpaceListTabBinder$SpaceListItemViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", "(Landroid/view/View;)V", "mSpaceIconIV", "Landroid/widget/ImageView;", "getMSpaceIconIV", "()Landroid/widget/ImageView;", "setMSpaceIconIV", "(Landroid/widget/ImageView;)V", "mSpaceOpenIV", "getMSpaceOpenIV", "setMSpaceOpenIV", "mSpaceSubTitleTV", "Landroid/widget/TextView;", "getMSpaceSubTitleTV", "()Landroid/widget/TextView;", "setMSpaceSubTitleTV", "(Landroid/widget/TextView;)V", "mSpaceTagTv", "getMSpaceTagTv", "setMSpaceTagTv", "mSpaceTitleTV", "getMSpaceTitleTV", "setMSpaceTitleTV", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    public static final class SpaceListItemViewHolder extends RecyclerView.ViewHolder {
        @BindView(8814)
        public ImageView mSpaceIconIV;
        @BindView(8815)
        public ImageView mSpaceOpenIV;
        @BindView(8816)
        public TextView mSpaceSubTitleTV;
        @BindView(8817)
        public TextView mSpaceTagTv;
        @BindView(8818)
        public TextView mSpaceTitleTV;

        /* renamed from: a */
        public final ImageView mo188543a() {
            ImageView imageView = this.mSpaceIconIV;
            if (imageView == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mSpaceIconIV");
            }
            return imageView;
        }

        /* renamed from: b */
        public final TextView mo188544b() {
            TextView textView = this.mSpaceTitleTV;
            if (textView == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mSpaceTitleTV");
            }
            return textView;
        }

        /* renamed from: c */
        public final TextView mo188545c() {
            TextView textView = this.mSpaceTagTv;
            if (textView == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mSpaceTagTv");
            }
            return textView;
        }

        /* renamed from: d */
        public final TextView mo188546d() {
            TextView textView = this.mSpaceSubTitleTV;
            if (textView == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mSpaceSubTitleTV");
            }
            return textView;
        }

        /* renamed from: e */
        public final ImageView mo188547e() {
            ImageView imageView = this.mSpaceOpenIV;
            if (imageView == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mSpaceOpenIV");
            }
            return imageView;
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public SpaceListItemViewHolder(View view) {
            super(view);
            Intrinsics.checkParameterIsNotNull(view, "itemView");
            ButterKnife.bind(this, view);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/dependency/IDocDependency;", "kotlin.jvm.PlatformType", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.tab.space.list.mvp.space.SpaceListTabBinder$a */
    static final class C55310a extends Lambda implements Function0<AbstractC36498n> {
        public static final C55310a INSTANCE = new C55310a();

        C55310a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final AbstractC36498n invoke() {
            AbstractC36474h b = C29990c.m110930b();
            Intrinsics.checkExpressionValueIsNotNull(b, "ChatModuleInstanceHolder.getDependency()");
            return b.mo134513L();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/dependency/ILoginDependency;", "kotlin.jvm.PlatformType", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.tab.space.list.mvp.space.SpaceListTabBinder$b */
    static final class C55311b extends Lambda implements Function0<AbstractC36450aa> {
        public static final C55311b INSTANCE = new C55311b();

        C55311b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final AbstractC36450aa invoke() {
            AbstractC36474h b = C29990c.m110930b();
            Intrinsics.checkExpressionValueIsNotNull(b, "ChatModuleInstanceHolder.getDependency()");
            return b.mo134515N();
        }
    }

    public final class SpaceListItemViewHolder_ViewBinding implements Unbinder {

        /* renamed from: a */
        private SpaceListItemViewHolder f136510a;

        @Override // butterknife.Unbinder
        public void unbind() {
            SpaceListItemViewHolder spaceListItemViewHolder = this.f136510a;
            if (spaceListItemViewHolder != null) {
                this.f136510a = null;
                spaceListItemViewHolder.mSpaceIconIV = null;
                spaceListItemViewHolder.mSpaceTitleTV = null;
                spaceListItemViewHolder.mSpaceTagTv = null;
                spaceListItemViewHolder.mSpaceSubTitleTV = null;
                spaceListItemViewHolder.mSpaceOpenIV = null;
                return;
            }
            throw new IllegalStateException("Bindings already cleared.");
        }

        public SpaceListItemViewHolder_ViewBinding(SpaceListItemViewHolder spaceListItemViewHolder, View view) {
            this.f136510a = spaceListItemViewHolder;
            spaceListItemViewHolder.mSpaceIconIV = (ImageView) Utils.findRequiredViewAsType(view, R.id.space_icon, "field 'mSpaceIconIV'", ImageView.class);
            spaceListItemViewHolder.mSpaceTitleTV = (TextView) Utils.findRequiredViewAsType(view, R.id.space_title, "field 'mSpaceTitleTV'", TextView.class);
            spaceListItemViewHolder.mSpaceTagTv = (TextView) Utils.findRequiredViewAsType(view, R.id.space_tag, "field 'mSpaceTagTv'", TextView.class);
            spaceListItemViewHolder.mSpaceSubTitleTV = (TextView) Utils.findRequiredViewAsType(view, R.id.space_sub_title, "field 'mSpaceSubTitleTV'", TextView.class);
            spaceListItemViewHolder.mSpaceOpenIV = (ImageView) Utils.findRequiredViewAsType(view, R.id.space_open, "field 'mSpaceOpenIV'", ImageView.class);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.tab.space.list.mvp.space.SpaceListTabBinder$c */
    public static final class View$OnClickListenerC55312c implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ OnItemListener f136511a;

        /* renamed from: b */
        final /* synthetic */ SpaceListViewData f136512b;

        /* renamed from: c */
        final /* synthetic */ int f136513c;

        View$OnClickListenerC55312c(OnItemListener onItemListener, SpaceListViewData spaceListViewData, int i) {
            this.f136511a = onItemListener;
            this.f136512b = spaceListViewData;
            this.f136513c = i;
        }

        public final void onClick(View view) {
            OnItemListener onItemListener = this.f136511a;
            if (onItemListener != null) {
                onItemListener.mo188509a(this.f136512b, this.f136513c);
            }
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.tab.space.list.mvp.space.SpaceListTabBinder$d */
    public static final class View$OnClickListenerC55313d implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ OnItemListener f136514a;

        /* renamed from: b */
        final /* synthetic */ SpaceListViewData f136515b;

        /* renamed from: c */
        final /* synthetic */ int f136516c;

        View$OnClickListenerC55313d(OnItemListener onItemListener, SpaceListViewData spaceListViewData, int i) {
            this.f136514a = onItemListener;
            this.f136515b = spaceListViewData;
            this.f136516c = i;
        }

        public final void onClick(View view) {
            OnItemListener onItemListener = this.f136514a;
            if (onItemListener != null) {
                onItemListener.mo188510a(this.f136515b, this.f136516c, "space_partial_click/open_chat");
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SpaceListTabBinder(Context context) {
        super(context);
        Intrinsics.checkParameterIsNotNull(context, "context");
    }

    /* renamed from: b */
    public SpaceListItemViewHolder mo188518a(ViewGroup viewGroup) {
        View inflate = LayoutInflater.from(mo188531b()).inflate(R.layout.fragment_chat_tab_doclist_item, viewGroup, false);
        Intrinsics.checkExpressionValueIsNotNull(inflate, "rootView");
        return new SpaceListItemViewHolder(inflate);
    }

    /* renamed from: b */
    private final void m214520b(SpaceListItemViewHolder spaceListItemViewHolder, SpaceListViewData spaceListViewData) {
        spaceListItemViewHolder.mo188543a().setImageResource(m214522c().mo134666a(spaceListViewData.getDocType().getNumber(), spaceListViewData.getTitle(), spaceListViewData.isWiki()));
    }

    /* renamed from: a */
    public int mo188530b(SpaceListItemViewHolder spaceListItemViewHolder, SpaceListViewData spaceListViewData) {
        Intrinsics.checkParameterIsNotNull(spaceListItemViewHolder, "holder");
        Intrinsics.checkParameterIsNotNull(spaceListViewData, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
        return UIUtils.getWidth(spaceListItemViewHolder.mo188547e()) - UIUtils.dp2px(mo188531b(), (float) 16);
    }

    /* renamed from: c */
    private final void m214523c(SpaceListItemViewHolder spaceListItemViewHolder, SpaceListViewData spaceListViewData) {
        String str;
        if (TextUtils.isEmpty(spaceListViewData.getTitle())) {
            str = UIHelper.getString(R.string.Lark_Groups_UnnamedFile);
        } else {
            str = spaceListViewData.getTitle();
        }
        spaceListItemViewHolder.mo188544b().setText(C57782ag.m224236a(str, new ArrayList(), spaceListItemViewHolder.mo188544b().getPaint(), mo188529a((RecyclerView.ViewHolder) spaceListItemViewHolder, (BaseListViewData) spaceListViewData), UIHelper.getColor(R.color.lkui_B500)));
    }

    /* JADX WARNING: Removed duplicated region for block: B:7:0x001c  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x004a  */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m214525d(com.ss.android.lark.tab.space.list.mvp.space.SpaceListTabBinder.SpaceListItemViewHolder r4, com.ss.android.lark.tab.space.list.entity.SpaceListViewData r5) {
        /*
            r3 = this;
            boolean r5 = r5.isShowCrossTenantTag()
            r0 = 1
            r1 = 0
            if (r5 == 0) goto L_0x0019
            com.ss.android.lark.dependency.aa r5 = r3.m214524d()
            java.lang.String r2 = "mLoginDependency"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r5, r2)
            boolean r5 = r5.mo134406i()
            if (r5 != 0) goto L_0x0019
            r5 = 1
            goto L_0x001a
        L_0x0019:
            r5 = 0
        L_0x001a:
            if (r5 == 0) goto L_0x004a
            android.widget.TextView r5 = r4.mo188545c()
            r5.setVisibility(r1)
            android.widget.TextView r5 = r4.mo188545c()
            java.lang.String r1 = ""
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            r5.setText(r1)
            com.larksuite.component.ui.tag.d$f r5 = com.larksuite.component.ui.tag.LarkNameTag.f62897a
            android.content.Context r1 = r3.mo188531b()
            com.larksuite.component.ui.tag.d$g r5 = r5.mo90056e(r1)
            com.larksuite.component.ui.tag.d$g r5 = r5.mo90059a(r0)
            com.larksuite.component.ui.tag.d r5 = r5.mo90027e()
            android.widget.TextView r4 = r4.mo188545c()
            android.view.View r4 = (android.view.View) r4
            r5.mo90003a(r4)
            goto L_0x0053
        L_0x004a:
            android.widget.TextView r4 = r4.mo188545c()
            r5 = 8
            r4.setVisibility(r5)
        L_0x0053:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.tab.space.list.mvp.space.SpaceListTabBinder.m214525d(com.ss.android.lark.tab.space.list.mvp.space.SpaceListTabBinder$SpaceListItemViewHolder, com.ss.android.lark.tab.space.list.entity.SpaceListViewData):void");
    }

    /* renamed from: e */
    private final void m214526e(SpaceListItemViewHolder spaceListItemViewHolder, SpaceListViewData spaceListViewData) {
        int i;
        boolean z;
        String str = spaceListViewData.getSubTitle() + " " + CommonTabListUtil.m214424a(mo188531b(), spaceListViewData.getUpdateTime(), mo188521a());
        int a = mo188529a((RecyclerView.ViewHolder) spaceListItemViewHolder, (BaseListViewData) spaceListViewData);
        TextView d = spaceListItemViewHolder.mo188546d();
        String str2 = str;
        int length = str2.length() - 1;
        int i2 = 0;
        boolean z2 = false;
        while (i2 <= length) {
            if (!z2) {
                i = i2;
            } else {
                i = length;
            }
            if (str2.charAt(i) <= ' ') {
                z = true;
            } else {
                z = false;
            }
            if (!z2) {
                if (!z) {
                    z2 = true;
                } else {
                    i2++;
                }
            } else if (!z) {
                break;
            } else {
                length--;
            }
        }
        d.setText(C57782ag.m224236a(str2.subSequence(i2, length + 1).toString(), new ArrayList(), spaceListItemViewHolder.mo188546d().getPaint(), a, UIHelper.getColor(R.color.lkui_B500)));
    }

    /* renamed from: a */
    public void mo188519a(SpaceListItemViewHolder spaceListItemViewHolder, SpaceListViewData spaceListViewData, OnItemListener<SpaceListViewData> onItemListener, int i) {
        Intrinsics.checkParameterIsNotNull(spaceListItemViewHolder, "holder");
        Intrinsics.checkParameterIsNotNull(spaceListViewData, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
        m214520b(spaceListItemViewHolder, spaceListViewData);
        m214523c(spaceListItemViewHolder, spaceListViewData);
        m214525d(spaceListItemViewHolder, spaceListViewData);
        m214526e(spaceListItemViewHolder, spaceListViewData);
        m214521b(spaceListItemViewHolder, spaceListViewData, onItemListener, i);
    }

    /* renamed from: b */
    private final void m214521b(SpaceListItemViewHolder spaceListItemViewHolder, SpaceListViewData spaceListViewData, OnItemListener<SpaceListViewData> onItemListener, int i) {
        spaceListItemViewHolder.itemView.setOnClickListener(new View$OnClickListenerC55312c(onItemListener, spaceListViewData, i));
        spaceListItemViewHolder.mo188547e().getDrawable().setTint(UIHelper.getColor(R.color.icon_n2));
        spaceListItemViewHolder.mo188547e().setOnClickListener(new View$OnClickListenerC55313d(onItemListener, spaceListViewData, i));
    }
}
