package com.bytedance.ee.bear.bitable.card.view.cell.user;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.bytedance.ee.bear.bitable.card.model.stmodel.cell.UserEntity;
import com.larksuite.suite.R;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B%\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0016\u0010\u0016\u001a\u00020\u00172\u000e\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u0019J\u000e\u0010\u001b\u001a\u00020\u00172\u0006\u0010\u001c\u001a\u00020\u001dJ\u000e\u0010\u001e\u001a\u00020\u00172\u0006\u0010\u001f\u001a\u00020\u001dR(\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\u0010\t\u001a\u0004\u0018\u00010\n@FX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u000e\u0010\u0010\u001a\u00020\u0011X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0004¢\u0006\u0002\n\u0000¨\u0006 "}, d2 = {"Lcom/bytedance/ee/bear/bitable/card/view/cell/user/UserCellContainer;", "Landroid/widget/RelativeLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "value", "Lcom/bytedance/ee/bear/bitable/card/view/cell/user/IUserDelegate;", "delegate", "getDelegate", "()Lcom/bytedance/ee/bear/bitable/card/view/cell/user/IUserDelegate;", "setDelegate", "(Lcom/bytedance/ee/bear/bitable/card/view/cell/user/IUserDelegate;)V", "dropTriangle", "Landroid/widget/ImageView;", "root", "Landroid/view/View;", "userCellView", "Lcom/bytedance/ee/bear/bitable/card/view/cell/user/UserCellView;", "setData", "", "userList", "", "Lcom/bytedance/ee/bear/bitable/card/model/stmodel/cell/UserEntity;", "setDropTriangleSelected", "selected", "", "setDropTriangleVisibility", "visible", "bitable-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
public final class UserCellContainer extends RelativeLayout {

    /* renamed from: a */
    private final View f13852a;

    /* renamed from: b */
    private final ImageView f13853b;

    /* renamed from: c */
    private final UserCellView f13854c;

    /* renamed from: d */
    private AbstractC4697a f13855d;

    public UserCellContainer(Context context) {
        this(context, null, 0, 6, null);
    }

    public UserCellContainer(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public final AbstractC4697a getDelegate() {
        return this.f13855d;
    }

    public final void setData(List<? extends UserEntity> list) {
        this.f13854c.setData(list);
    }

    public final void setDelegate(AbstractC4697a aVar) {
        this.f13855d = aVar;
        this.f13854c.setDelegate(aVar);
    }

    public final void setDropTriangleSelected(boolean z) {
        this.f13853b.setSelected(z);
    }

    public final void setDropTriangleVisibility(boolean z) {
        int i;
        ImageView imageView = this.f13853b;
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        imageView.setVisibility(i);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public UserCellContainer(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkParameterIsNotNull(context, "context");
        View inflate = LayoutInflater.from(context).inflate(R.layout.bitable_cell_user_container, this);
        Intrinsics.checkExpressionValueIsNotNull(inflate, "LayoutInflater.from(cont…ell_user_container, this)");
        this.f13852a = inflate;
        View findViewById = inflate.findViewById(R.id.bitable_cell_user_drop_triangle);
        Intrinsics.checkExpressionValueIsNotNull(findViewById, "root.findViewById(R.id.b…_cell_user_drop_triangle)");
        this.f13853b = (ImageView) findViewById;
        View findViewById2 = inflate.findViewById(R.id.bitable_cell_user_cell_view);
        Intrinsics.checkExpressionValueIsNotNull(findViewById2, "root.findViewById(R.id.b…able_cell_user_cell_view)");
        this.f13854c = (UserCellView) findViewById2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ UserCellContainer(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
