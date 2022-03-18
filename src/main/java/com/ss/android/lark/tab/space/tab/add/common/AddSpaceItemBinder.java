package com.ss.android.lark.tab.space.tab.add.common;

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
import com.larksuite.component.ui.imageview.LKUIRoundedImageView2;
import com.larksuite.framework.utils.DeviceUtils;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.C29990c;
import com.ss.android.lark.appreciablelib.Scene;
import com.ss.android.lark.chat.utils.C34336c;
import com.ss.android.lark.dependency.AbstractC36450aa;
import com.ss.android.lark.dependency.AbstractC36474h;
import com.ss.android.lark.dependency.AbstractC36498n;
import com.ss.android.lark.doc.entity.DocType;
import com.ss.android.lark.tab.space.tab.add.common.IItemBinder;
import com.ss.android.lark.tab.space.tab.add.list.entity.SpaceSelectViewData;
import com.ss.android.lark.utils.C57782ag;
import com.ss.android.lark.utils.UIHelper;
import java.util.ArrayList;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\t\u0018\u0000 )2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0002()B'\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u0018\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u00022\u0006\u0010\u001c\u001a\u00020\u0003H\u0016J\u0010\u0010\u001d\u001a\u00020\u00022\u0006\u0010\u001e\u001a\u00020\u001fH\u0016J\b\u0010 \u001a\u00020!H\u0002J\u0010\u0010\"\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0007H\u0016J\u0018\u0010#\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u00022\u0006\u0010\u001c\u001a\u00020\u0003H\u0002J\u0018\u0010$\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u00022\u0006\u0010\u001c\u001a\u00020\u0003H\u0002J\u0018\u0010%\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u00022\u0006\u0010\u001c\u001a\u00020\u0003H\u0002J\u0018\u0010&\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u00022\u0006\u0010\u001c\u001a\u00020\u0003H\u0002J\u0018\u0010'\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u00022\u0006\u0010\u001c\u001a\u00020\u0003H\u0002R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000R#\u0010\r\u001a\n \u000f*\u0004\u0018\u00010\u000e0\u000e8BX\u0002¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0010\u0010\u0011R#\u0010\u0014\u001a\n \u000f*\u0004\u0018\u00010\u00150\u00158BX\u0002¢\u0006\f\n\u0004\b\u0018\u0010\u0013\u001a\u0004\b\u0016\u0010\u0017R\u0016\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0007X\u0004¢\u0006\u0002\n\u0000¨\u0006*"}, d2 = {"Lcom/ss/android/lark/tab/space/tab/add/common/AddSpaceItemBinder;", "Lcom/ss/android/lark/tab/space/tab/add/common/IItemBinder;", "Lcom/ss/android/lark/tab/space/tab/add/common/AddSpaceItemBinder$AddSpaceViewHolder;", "Lcom/ss/android/lark/tab/space/tab/add/list/entity/SpaceSelectViewData;", "context", "Landroid/content/Context;", "onItemClickListener", "Lcom/ss/android/lark/tab/space/tab/add/common/IItemBinder$OnItemClickListener;", "isListItem", "", "(Landroid/content/Context;Lcom/ss/android/lark/tab/space/tab/add/common/IItemBinder$OnItemClickListener;Z)V", "getContext", "()Landroid/content/Context;", "mDocDependency", "Lcom/ss/android/lark/dependency/IDocDependency;", "kotlin.jvm.PlatformType", "getMDocDependency", "()Lcom/ss/android/lark/dependency/IDocDependency;", "mDocDependency$delegate", "Lkotlin/Lazy;", "mLoginDependency", "Lcom/ss/android/lark/dependency/ILoginDependency;", "getMLoginDependency", "()Lcom/ss/android/lark/dependency/ILoginDependency;", "mLoginDependency$delegate", "bindViewHolder", "", "holder", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "createViewHolder", "parent", "Landroid/view/ViewGroup;", "getHighColorMaxWidth", "", "getItemClickListener", "setOwnerAvatar", "setSpaceIcon", "setSpaceSubTitle", "setSpaceTag", "setSpaceTitle", "AddSpaceViewHolder", "Companion", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
public final class AddSpaceItemBinder implements IItemBinder<AddSpaceViewHolder, SpaceSelectViewData> {

    /* renamed from: a */
    public static final Companion f136518a = new Companion(null);

    /* renamed from: b */
    private final Lazy f136519b;

    /* renamed from: c */
    private final Lazy f136520c;

    /* renamed from: d */
    private final Context f136521d;

    /* renamed from: e */
    private final IItemBinder.OnItemClickListener<SpaceSelectViewData> f136522e;

    /* renamed from: f */
    private final boolean f136523f;

    /* renamed from: b */
    private final AbstractC36498n m214547b() {
        return (AbstractC36498n) this.f136519b.getValue();
    }

    /* renamed from: c */
    private final AbstractC36450aa m214549c() {
        return (AbstractC36450aa) this.f136520c.getValue();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ss/android/lark/tab/space/tab/add/common/AddSpaceItemBinder$Companion;", "", "()V", "OWNER_AVATAR_SIZE_IN_DP", "", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.tab.space.tab.add.common.AddSpaceItemBinder$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: a */
    public IItemBinder.OnItemClickListener<SpaceSelectViewData> mo188553a() {
        return this.f136522e;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u001e\u0010\u0005\u001a\u00020\u00038\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\u0004R\u001e\u0010\t\u001a\u00020\n8\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001e\u0010\u000f\u001a\u00020\u00108\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001e\u0010\u0015\u001a\u00020\u00168\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u001e\u0010\u001b\u001a\u00020\u00168\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0018\"\u0004\b\u001d\u0010\u001aR\u001e\u0010\u001e\u001a\u00020\u00168\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u0018\"\u0004\b \u0010\u001a¨\u0006!"}, d2 = {"Lcom/ss/android/lark/tab/space/tab/add/common/AddSpaceItemBinder$AddSpaceViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "contentView", "Landroid/view/View;", "(Landroid/view/View;)V", "mDivider", "getMDivider", "()Landroid/view/View;", "setMDivider", "mSpaceIconIV", "Landroid/widget/ImageView;", "getMSpaceIconIV", "()Landroid/widget/ImageView;", "setMSpaceIconIV", "(Landroid/widget/ImageView;)V", "mSpaceOwnerIV", "Lcom/larksuite/component/ui/imageview/LKUIRoundedImageView2;", "getMSpaceOwnerIV", "()Lcom/larksuite/component/ui/imageview/LKUIRoundedImageView2;", "setMSpaceOwnerIV", "(Lcom/larksuite/component/ui/imageview/LKUIRoundedImageView2;)V", "mSpaceSubTitleTV", "Landroid/widget/TextView;", "getMSpaceSubTitleTV", "()Landroid/widget/TextView;", "setMSpaceSubTitleTV", "(Landroid/widget/TextView;)V", "mSpaceTagTv", "getMSpaceTagTv", "setMSpaceTagTv", "mSpaceTitleTV", "getMSpaceTitleTV", "setMSpaceTitleTV", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    public static final class AddSpaceViewHolder extends RecyclerView.ViewHolder {
        @BindView(7589)
        public View mDivider;
        @BindView(8814)
        public ImageView mSpaceIconIV;
        @BindView(8379)
        public LKUIRoundedImageView2 mSpaceOwnerIV;
        @BindView(8816)
        public TextView mSpaceSubTitleTV;
        @BindView(8817)
        public TextView mSpaceTagTv;
        @BindView(8818)
        public TextView mSpaceTitleTV;

        /* renamed from: a */
        public final ImageView mo188555a() {
            ImageView imageView = this.mSpaceIconIV;
            if (imageView == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mSpaceIconIV");
            }
            return imageView;
        }

        /* renamed from: b */
        public final TextView mo188556b() {
            TextView textView = this.mSpaceTitleTV;
            if (textView == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mSpaceTitleTV");
            }
            return textView;
        }

        /* renamed from: c */
        public final TextView mo188557c() {
            TextView textView = this.mSpaceTagTv;
            if (textView == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mSpaceTagTv");
            }
            return textView;
        }

        /* renamed from: d */
        public final TextView mo188558d() {
            TextView textView = this.mSpaceSubTitleTV;
            if (textView == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mSpaceSubTitleTV");
            }
            return textView;
        }

        /* renamed from: e */
        public final LKUIRoundedImageView2 mo188559e() {
            LKUIRoundedImageView2 lKUIRoundedImageView2 = this.mSpaceOwnerIV;
            if (lKUIRoundedImageView2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mSpaceOwnerIV");
            }
            return lKUIRoundedImageView2;
        }

        /* renamed from: f */
        public final View mo188560f() {
            View view = this.mDivider;
            if (view == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mDivider");
            }
            return view;
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public AddSpaceViewHolder(View view) {
            super(view);
            Intrinsics.checkParameterIsNotNull(view, "contentView");
            ButterKnife.bind(this, view);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/dependency/IDocDependency;", "kotlin.jvm.PlatformType", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.tab.space.tab.add.common.AddSpaceItemBinder$c */
    static final class C55315c extends Lambda implements Function0<AbstractC36498n> {
        public static final C55315c INSTANCE = new C55315c();

        C55315c() {
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
    /* renamed from: com.ss.android.lark.tab.space.tab.add.common.AddSpaceItemBinder$d */
    static final class C55316d extends Lambda implements Function0<AbstractC36450aa> {
        public static final C55316d INSTANCE = new C55316d();

        C55316d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final AbstractC36450aa invoke() {
            AbstractC36474h b = C29990c.m110930b();
            Intrinsics.checkExpressionValueIsNotNull(b, "ChatModuleInstanceHolder.getDependency()");
            return b.mo134515N();
        }
    }

    public final class AddSpaceViewHolder_ViewBinding implements Unbinder {

        /* renamed from: a */
        private AddSpaceViewHolder f136524a;

        @Override // butterknife.Unbinder
        public void unbind() {
            AddSpaceViewHolder addSpaceViewHolder = this.f136524a;
            if (addSpaceViewHolder != null) {
                this.f136524a = null;
                addSpaceViewHolder.mSpaceIconIV = null;
                addSpaceViewHolder.mSpaceTitleTV = null;
                addSpaceViewHolder.mSpaceTagTv = null;
                addSpaceViewHolder.mSpaceSubTitleTV = null;
                addSpaceViewHolder.mSpaceOwnerIV = null;
                addSpaceViewHolder.mDivider = null;
                return;
            }
            throw new IllegalStateException("Bindings already cleared.");
        }

        public AddSpaceViewHolder_ViewBinding(AddSpaceViewHolder addSpaceViewHolder, View view) {
            this.f136524a = addSpaceViewHolder;
            addSpaceViewHolder.mSpaceIconIV = (ImageView) Utils.findRequiredViewAsType(view, R.id.space_icon, "field 'mSpaceIconIV'", ImageView.class);
            addSpaceViewHolder.mSpaceTitleTV = (TextView) Utils.findRequiredViewAsType(view, R.id.space_title, "field 'mSpaceTitleTV'", TextView.class);
            addSpaceViewHolder.mSpaceTagTv = (TextView) Utils.findRequiredViewAsType(view, R.id.space_tag, "field 'mSpaceTagTv'", TextView.class);
            addSpaceViewHolder.mSpaceSubTitleTV = (TextView) Utils.findRequiredViewAsType(view, R.id.space_sub_title, "field 'mSpaceSubTitleTV'", TextView.class);
            addSpaceViewHolder.mSpaceOwnerIV = (LKUIRoundedImageView2) Utils.findRequiredViewAsType(view, R.id.owner_avatar, "field 'mSpaceOwnerIV'", LKUIRoundedImageView2.class);
            addSpaceViewHolder.mDivider = Utils.findRequiredView(view, R.id.divider, "field 'mDivider'");
        }
    }

    /* renamed from: d */
    private final int m214551d() {
        int screenWidth = DeviceUtils.getScreenWidth(this.f136521d);
        int dp2px = UIUtils.dp2px(this.f136521d, (float) 32);
        return screenWidth - ((dp2px + UIUtils.dp2px(this.f136521d, (float) 35)) + UIUtils.dp2px(this.f136521d, (float) 16));
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.tab.space.tab.add.common.AddSpaceItemBinder$b */
    public static final class View$OnClickListenerC55314b implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ AddSpaceItemBinder f136525a;

        /* renamed from: b */
        final /* synthetic */ SpaceSelectViewData f136526b;

        View$OnClickListenerC55314b(AddSpaceItemBinder addSpaceItemBinder, SpaceSelectViewData spaceSelectViewData) {
            this.f136525a = addSpaceItemBinder;
            this.f136526b = spaceSelectViewData;
        }

        public final void onClick(View view) {
            IItemBinder.OnItemClickListener<SpaceSelectViewData> a = this.f136525a.mo188553a();
            if (a != null) {
                a.mo188562a(this.f136526b);
            }
        }
    }

    /* renamed from: a */
    public AddSpaceViewHolder mo188552a(ViewGroup viewGroup) {
        Intrinsics.checkParameterIsNotNull(viewGroup, "parent");
        View inflate = LayoutInflater.from(this.f136521d).inflate(R.layout.fragment_chat_tab_space_add_list_item, viewGroup, false);
        Intrinsics.checkExpressionValueIsNotNull(inflate, "itemView");
        return new AddSpaceViewHolder(inflate);
    }

    /* renamed from: b */
    private final void m214548b(AddSpaceViewHolder addSpaceViewHolder, SpaceSelectViewData spaceSelectViewData) {
        if (spaceSelectViewData.getOwnerAvatar() == null) {
            addSpaceViewHolder.mo188559e().setVisibility(8);
            return;
        }
        addSpaceViewHolder.mo188559e().setVisibility(0);
        C34336c.m133130a(this.f136521d, addSpaceViewHolder.mo188559e(), spaceSelectViewData.getOwnerAvatar(), spaceSelectViewData.getOwnerId(), UIHelper.dp2px(16.0f), UIHelper.dp2px(16.0f), Scene.Chat);
    }

    /* renamed from: a */
    public void mo188554a(AddSpaceViewHolder addSpaceViewHolder, SpaceSelectViewData spaceSelectViewData) {
        Intrinsics.checkParameterIsNotNull(addSpaceViewHolder, "holder");
        Intrinsics.checkParameterIsNotNull(spaceSelectViewData, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
        m214550c(addSpaceViewHolder, spaceSelectViewData);
        m214552d(addSpaceViewHolder, spaceSelectViewData);
        m214553e(addSpaceViewHolder, spaceSelectViewData);
        m214554f(addSpaceViewHolder, spaceSelectViewData);
        m214548b(addSpaceViewHolder, spaceSelectViewData);
        addSpaceViewHolder.itemView.setOnClickListener(new View$OnClickListenerC55314b(this, spaceSelectViewData));
    }

    /* renamed from: c */
    private final void m214550c(AddSpaceViewHolder addSpaceViewHolder, SpaceSelectViewData spaceSelectViewData) {
        if (spaceSelectViewData.getDocType() != DocType.WIKI || spaceSelectViewData.getWikiSubType() == null) {
            addSpaceViewHolder.mo188555a().setImageResource(m214547b().mo134666a(spaceSelectViewData.getDocType().getNumber(), spaceSelectViewData.getTitle(), false));
        } else {
            addSpaceViewHolder.mo188555a().setImageResource(m214547b().mo134666a(spaceSelectViewData.getWikiSubType().getNumber(), spaceSelectViewData.getTitle(), true));
        }
    }

    /* renamed from: d */
    private final void m214552d(AddSpaceViewHolder addSpaceViewHolder, SpaceSelectViewData spaceSelectViewData) {
        String str;
        ArrayList arrayList;
        int d = m214551d();
        if (TextUtils.isEmpty(spaceSelectViewData.getTitle())) {
            str = UIHelper.getString(R.string.Lark_Groups_UnnamedFile);
        } else {
            str = spaceSelectViewData.getTitle();
        }
        TextView b = addSpaceViewHolder.mo188556b();
        String str2 = str;
        if (this.f136523f) {
            arrayList = spaceSelectViewData.getNameHitTerms();
        } else {
            arrayList = new ArrayList();
        }
        b.setText(C57782ag.m224236a(str2, arrayList, addSpaceViewHolder.mo188556b().getPaint(), d, UIHelper.getColor(R.color.lkui_B500)));
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x004d  */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m214553e(com.ss.android.lark.tab.space.tab.add.common.AddSpaceItemBinder.AddSpaceViewHolder r4, com.ss.android.lark.tab.space.tab.add.list.entity.SpaceSelectViewData r5) {
        /*
            r3 = this;
            boolean r0 = r3.f136523f
            if (r0 != 0) goto L_0x0005
            return
        L_0x0005:
            boolean r5 = r5.getShowCrossTenantTag()
            r0 = 1
            r1 = 0
            if (r5 == 0) goto L_0x001e
            com.ss.android.lark.dependency.aa r5 = r3.m214549c()
            java.lang.String r2 = "mLoginDependency"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r5, r2)
            boolean r5 = r5.mo134406i()
            if (r5 != 0) goto L_0x001e
            r5 = 1
            goto L_0x001f
        L_0x001e:
            r5 = 0
        L_0x001f:
            if (r5 == 0) goto L_0x004d
            android.widget.TextView r5 = r4.mo188557c()
            r5.setVisibility(r1)
            android.widget.TextView r5 = r4.mo188557c()
            java.lang.String r1 = ""
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            r5.setText(r1)
            com.larksuite.component.ui.tag.d$f r5 = com.larksuite.component.ui.tag.LarkNameTag.f62897a
            android.content.Context r1 = r3.f136521d
            com.larksuite.component.ui.tag.d$g r5 = r5.mo90056e(r1)
            com.larksuite.component.ui.tag.d$g r5 = r5.mo90059a(r0)
            com.larksuite.component.ui.tag.d r5 = r5.mo90027e()
            android.widget.TextView r4 = r4.mo188557c()
            android.view.View r4 = (android.view.View) r4
            r5.mo90003a(r4)
            goto L_0x0056
        L_0x004d:
            android.widget.TextView r4 = r4.mo188557c()
            r5 = 8
            r4.setVisibility(r5)
        L_0x0056:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.tab.space.tab.add.common.AddSpaceItemBinder.m214553e(com.ss.android.lark.tab.space.tab.add.common.AddSpaceItemBinder$AddSpaceViewHolder, com.ss.android.lark.tab.space.tab.add.list.entity.SpaceSelectViewData):void");
    }

    /* renamed from: f */
    private final void m214554f(AddSpaceViewHolder addSpaceViewHolder, SpaceSelectViewData spaceSelectViewData) {
        ArrayList arrayList;
        if (spaceSelectViewData.getOwnerName() == null) {
            addSpaceViewHolder.mo188558d().setVisibility(8);
            return;
        }
        addSpaceViewHolder.mo188558d().setVisibility(0);
        String mustacheFormat = UIHelper.mustacheFormat((int) R.string.Lark_Legacy_OwnerOwnerName, "ownerName", spaceSelectViewData.getOwnerName());
        int d = m214551d() - UIHelper.dp2px((float) 16);
        TextView d2 = addSpaceViewHolder.mo188558d();
        String str = mustacheFormat;
        if (this.f136523f) {
            arrayList = spaceSelectViewData.getDescHitTerms();
        } else {
            arrayList = new ArrayList();
        }
        d2.setText(C57782ag.m224236a(str, arrayList, addSpaceViewHolder.mo188558d().getPaint(), d, UIHelper.getColor(R.color.lkui_B500)));
    }

    public AddSpaceItemBinder(Context context, IItemBinder.OnItemClickListener<SpaceSelectViewData> aVar, boolean z) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        this.f136521d = context;
        this.f136522e = aVar;
        this.f136523f = z;
        this.f136519b = LazyKt.lazy(C55315c.INSTANCE);
        this.f136520c = LazyKt.lazy(C55316d.INSTANCE);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ AddSpaceItemBinder(Context context, IItemBinder.OnItemClickListener aVar, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, aVar, (i & 4) != 0 ? true : z);
    }
}
