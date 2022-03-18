package com.bytedance.ee.bear.bitable.card.view.cell.user;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import com.bytedance.ee.bear.bitable.card.model.stmodel.cell.UserEntity;
import com.bytedance.ee.bear.widgets.FlowLayout;
import com.larksuite.suite.R;
import java.util.List;

public class UserCellView extends FlowLayout {

    /* renamed from: a */
    private AbstractC4697a f13856a;

    /* renamed from: b */
    private ViewGroup.MarginLayoutParams f13857b;

    public void setDelegate(AbstractC4697a aVar) {
        this.f13856a = aVar;
    }

    public UserCellView(Context context) {
        this(context, null);
    }

    public void setData(List<UserEntity> list) {
        removeAllViews();
        if (list != null) {
            for (UserEntity userEntity : list) {
                UserItemView userItemView = new UserItemView(getContext());
                userItemView.setDelegate(this.f13856a);
                userItemView.mo18374a(userEntity);
                addView(userItemView, this.f13857b);
            }
        }
    }

    public UserCellView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public UserCellView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.bitable_field_user_margin_horizontal);
        int dimensionPixelOffset = getResources().getDimensionPixelOffset(R.dimen.bitable_field_user_margin_vertical);
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-2, -2);
        this.f13857b = marginLayoutParams;
        marginLayoutParams.setMargins(dimensionPixelSize, dimensionPixelOffset, dimensionPixelSize, dimensionPixelOffset);
    }
}
