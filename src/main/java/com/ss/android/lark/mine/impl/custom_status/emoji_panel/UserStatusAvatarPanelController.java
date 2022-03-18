package com.ss.android.lark.mine.impl.custom_status.emoji_panel;

import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.larksuite.component.universe_design.dialog.UDBaseDialogBuilder;
import com.larksuite.component.universe_design.dialog.UDDialog;
import com.larksuite.component.universe_design.dialog.UDDialogController;
import com.larksuite.suite.R;
import com.ss.android.lark.mine.impl.custom_status.CustomStatusUIUtils;
import com.ss.android.ttve.utils.C60275a;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u001b2\u00020\u0001:\u0003\u001b\u001c\u001dB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J.\u0010\u0010\u001a\u00020\u0011\"\u000e\b\u0000\u0010\u0012*\b\u0012\u0004\u0012\u0002H\u00120\u00132\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u0002H\u00120\u00132\u0006\u0010\u0015\u001a\u00020\u0016H\u0016J\b\u0010\u0017\u001a\u00020\u0011H\u0002J\n\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0014J\b\u0010\u001a\u001a\u00020\u0006H\u0014R\u000e\u0010\u0005\u001a\u00020\u0006X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0006X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0006X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0006X\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eX\u000e¢\u0006\u0002\n\u0000¨\u0006\u001e"}, d2 = {"Lcom/ss/android/lark/mine/impl/custom_status/emoji_panel/UserStatusAvatarPanelController;", "Lcom/larksuite/component/universe_design/dialog/UDDialogController;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "avatarContainerWidth", "", "avatarLeftMargin", "clickListener", "Lcom/ss/android/lark/mine/impl/custom_status/emoji_panel/UserStatusAvatarPanelController$OnAvatarItemClickListener;", "recommendSize", "recyclerViewPadding", "showColumn", "statusAvatarKeyList", "", "Lcom/ss/android/lark/mine/impl/custom_status/emoji_panel/AvatarViewData;", "apply", "", "T", "Lcom/larksuite/component/universe_design/dialog/UDBaseDialogBuilder;", "builder", "dialog", "Lcom/larksuite/component/universe_design/dialog/UDDialog;", "compute", "createView", "Landroid/view/View;", "getDefaultRootRes", "Companion", "OnAvatarItemClickListener", "SpaceItemDecoration", "core_mine_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.mine.impl.custom_status.emoji_panel.d */
public final class UserStatusAvatarPanelController extends UDDialogController {

    /* renamed from: b */
    public static final Companion f115091b = new Companion(null);

    /* renamed from: a */
    public OnAvatarItemClickListener f115092a;

    /* renamed from: c */
    private List<AvatarViewData> f115093c = new ArrayList();

    /* renamed from: d */
    private int f115094d;

    /* renamed from: e */
    private int f115095e;

    /* renamed from: f */
    private int f115096f;

    /* renamed from: g */
    private int f115097g;

    /* renamed from: h */
    private int f115098h;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, d2 = {"Lcom/ss/android/lark/mine/impl/custom_status/emoji_panel/UserStatusAvatarPanelController$OnAvatarItemClickListener;", "", "onAvatarItemClick", "", "iconKey", "", "core_mine_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mine.impl.custom_status.emoji_panel.d$b */
    public interface OnAvatarItemClickListener {
        /* renamed from: a */
        void mo160399a(String str);
    }

    /* access modifiers changed from: protected */
    @Override // com.larksuite.component.universe_design.dialog.UDDialogController
    public int getDefaultRootRes() {
        return R.layout.user_status_avatar_panel_root;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/ss/android/lark/mine/impl/custom_status/emoji_panel/UserStatusAvatarPanelController$Companion;", "", "()V", "DEFAULT_COLUMN", "", "LOG_TAG", "", "MARGIN_BOTTOM_LAST_EMOJI", "MARGIN_LEFT_FIRST_EMOJI", "MAX_X_WIDTH", "MIN_X_WIDTH", "TITLE_LEFT_MARGIN", "TITLE_TOP_MARGIN", "core_mine_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mine.impl.custom_status.emoji_panel.d$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: a */
    private final void m180640a() {
        int a = CustomStatusUIUtils.f115068a.mo160434a(30);
        int a2 = C60275a.m234186a(getContext());
        if (this.f115095e == 0) {
            int i = 6;
            int i2 = (a2 - (a * 2)) / 6;
            if (i2 > CustomStatusUIUtils.f115068a.mo160434a(64)) {
                i = 8;
            } else if (i2 >= CustomStatusUIUtils.f115068a.mo160434a(48)) {
                i = 7;
            }
            this.f115095e = i;
        }
        int i3 = a * 2;
        int i4 = (a2 - i3) / (this.f115095e - 1);
        if (i4 > i3) {
            this.f115096f = i3;
        } else {
            this.f115096f = i4;
            this.f115098h = a - (i4 / 2);
        }
        this.f115097g = i4 - this.f115096f;
    }

    /* access modifiers changed from: protected */
    @Override // com.larksuite.component.universe_design.dialog.UDDialogController
    public View createView() {
        View createView = super.createView();
        if (createView == null) {
            return null;
        }
        RecyclerView recyclerView = (RecyclerView) createView.findViewById(R.id.user_status_avatar_panel_list);
        if (recyclerView != null) {
            recyclerView.setLayoutManager(new GridLayoutManager(getContext(), this.f115095e));
            UserStatusAvatarPanelAdapter bVar = new UserStatusAvatarPanelAdapter(getContext(), this.f115096f);
            bVar.mo160442a(new C45479d(this));
            bVar.mo160443a(this.f115093c);
            recyclerView.setAdapter(bVar);
            recyclerView.addItemDecoration(new SpaceItemDecoration(this.f115097g, CustomStatusUIUtils.f115068a.mo160434a(8), CustomStatusUIUtils.f115068a.mo160434a(14) - this.f115098h, this.f115095e, this.f115094d));
        }
        return createView;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006¸\u0006\u0007"}, d2 = {"com/ss/android/lark/mine/impl/custom_status/emoji_panel/UserStatusAvatarPanelController$createView$1$1$1", "Lcom/ss/android/lark/mine/impl/custom_status/emoji_panel/UserStatusAvatarPanelController$OnAvatarItemClickListener;", "onAvatarItemClick", "", "iconKey", "", "core_mine_release", "com/ss/android/lark/mine/impl/custom_status/emoji_panel/UserStatusAvatarPanelController$$special$$inlined$apply$lambda$1"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mine.impl.custom_status.emoji_panel.d$d */
    public static final class C45479d implements OnAvatarItemClickListener {

        /* renamed from: a */
        final /* synthetic */ UserStatusAvatarPanelController f115105a;

        C45479d(UserStatusAvatarPanelController dVar) {
            this.f115105a = dVar;
        }

        @Override // com.ss.android.lark.mine.impl.custom_status.emoji_panel.UserStatusAvatarPanelController.OnAvatarItemClickListener
        /* renamed from: a */
        public void mo160399a(String str) {
            UDDialog mDialog;
            Intrinsics.checkParameterIsNotNull(str, "iconKey");
            if (this.f115105a.getMAutoDismiss() && (mDialog = this.f115105a.getMDialog()) != null) {
                mDialog.dismiss();
            }
            OnAvatarItemClickListener bVar = this.f115105a.f115092a;
            if (bVar != null) {
                bVar.mo160399a(str);
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public UserStatusAvatarPanelController(Context context) {
        super(context);
        Intrinsics.checkParameterIsNotNull(context, "context");
    }

    @Override // com.larksuite.component.universe_design.dialog.UDDialogController
    public <T extends UDBaseDialogBuilder<? extends T>> void apply(UDBaseDialogBuilder<? extends T> uDBaseDialogBuilder, UDDialog uDDialog) {
        Intrinsics.checkParameterIsNotNull(uDBaseDialogBuilder, "builder");
        Intrinsics.checkParameterIsNotNull(uDDialog, "dialog");
        if (uDBaseDialogBuilder instanceof UserStatusAvatarPanelBuilder) {
            super.apply(uDBaseDialogBuilder, uDDialog);
            UserStatusAvatarPanelBuilder cVar = (UserStatusAvatarPanelBuilder) uDBaseDialogBuilder;
            this.f115093c = cVar.mo160450a();
            this.f115092a = cVar.mo160451b();
            this.f115094d = cVar.mo160452c();
            m180640a();
            return;
        }
        throw new IllegalArgumentException(("builder should be UserStatusAvatarPanelBuilder, but actually " + uDBaseDialogBuilder.getClass().getSimpleName()).toString());
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0004\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003¢\u0006\u0002\u0010\bJ(\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lcom/ss/android/lark/mine/impl/custom_status/emoji_panel/UserStatusAvatarPanelController$SpaceItemDecoration;", "Landroidx/recyclerview/widget/RecyclerView$ItemDecoration;", "imageLeftMargin", "", "titleTopMargin", "titleLeftMargin", "showColumn", "recommendSize", "(Lcom/ss/android/lark/mine/impl/custom_status/emoji_panel/UserStatusAvatarPanelController;IIIII)V", "getItemOffsets", "", "outRect", "Landroid/graphics/Rect;", "view", "Landroid/view/View;", "parent", "Landroidx/recyclerview/widget/RecyclerView;", "state", "Landroidx/recyclerview/widget/RecyclerView$State;", "core_mine_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mine.impl.custom_status.emoji_panel.d$c */
    private final class SpaceItemDecoration extends RecyclerView.AbstractC1335d {

        /* renamed from: b */
        private final int f115100b;

        /* renamed from: c */
        private final int f115101c;

        /* renamed from: d */
        private final int f115102d;

        /* renamed from: e */
        private final int f115103e;

        /* renamed from: f */
        private final int f115104f;

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1335d
        public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.State state) {
            Integer num;
            int i;
            int i2;
            Intrinsics.checkParameterIsNotNull(rect, "outRect");
            Intrinsics.checkParameterIsNotNull(view, "view");
            Intrinsics.checkParameterIsNotNull(recyclerView, "parent");
            Intrinsics.checkParameterIsNotNull(state, "state");
            int i3 = this.f115104f;
            int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
            RecyclerView.Adapter adapter = recyclerView.getAdapter();
            if (adapter != null) {
                num = Integer.valueOf(adapter.getItemCount());
            } else {
                num = null;
            }
            RecyclerView.ViewHolder childViewHolder = recyclerView.getChildViewHolder(view);
            Intrinsics.checkExpressionValueIsNotNull(childViewHolder, "parent.getChildViewHolder(view)");
            if (childViewHolder.getItemViewType() == AvatarType.AVATAR_TITLE.getType()) {
                if (childAdapterPosition == 0) {
                    i2 = this.f115101c * 2;
                } else {
                    i2 = this.f115101c;
                }
                rect.top = i2;
                rect.left = this.f115102d;
                return;
            }
            int i4 = this.f115103e;
            if (childAdapterPosition < i4 + 1) {
                i = (childAdapterPosition - 1) % i4;
            } else {
                i = ((childAdapterPosition - i3) - 2) % i4;
            }
            rect.left = (this.f115100b * i) / i4;
            int i5 = this.f115100b;
            rect.right = i5 - (((i + 1) * i5) / this.f115103e);
            if (num != null) {
                num.intValue();
                double ceil = Math.ceil(((double) ((num.intValue() - 2) - i3)) / ((double) this.f115103e));
                int i6 = this.f115103e;
                if (((double) childAdapterPosition) >= (((ceil * ((double) i6)) + ((double) i3)) + ((double) 2)) - ((double) i6)) {
                    rect.bottom = CustomStatusUIUtils.f115068a.mo160434a(56);
                }
            }
        }

        public SpaceItemDecoration(int i, int i2, int i3, int i4, int i5) {
            this.f115100b = i;
            this.f115101c = i2;
            this.f115102d = i3;
            this.f115103e = i4;
            this.f115104f = i5;
        }
    }
}
