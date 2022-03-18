package com.ss.android.lark.favorite.common.base;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.ui.p2892a.C57582a;

public class FavoriteHoverFuncView extends FrameLayout {

    /* renamed from: a */
    public AbstractC37109a f95374a;
    @BindView(7532)
    ImageView mDeleteIcon;
    @BindView(7747)
    ImageView mForwardIcon;

    /* renamed from: com.ss.android.lark.favorite.common.base.FavoriteHoverFuncView$a */
    public interface AbstractC37109a {
        /* renamed from: a */
        void mo136755a(View view);

        /* renamed from: b */
        void mo136756b(View view);
    }

    /* renamed from: a */
    private void m146342a() {
        ButterKnife.bind(this, LayoutInflater.from(getContext()).inflate(R.layout.view_favorite_list_hover, this));
        this.mForwardIcon.setImageTintList(UIUtils.getColorStateList(this.mDeleteIcon.getContext(), R.color.icon_favorite_forward_selector));
        this.mForwardIcon.setOnClickListener(new View.OnClickListener() {
            /* class com.ss.android.lark.favorite.common.base.FavoriteHoverFuncView.View$OnClickListenerC371071 */

            public void onClick(View view) {
                if (FavoriteHoverFuncView.this.f95374a != null) {
                    FavoriteHoverFuncView.this.f95374a.mo136755a(view);
                }
            }
        });
        ImageView imageView = this.mDeleteIcon;
        imageView.setImageTintList(UIUtils.getColorStateList(imageView.getContext(), R.color.icon_favorite_delete_selector));
        this.mDeleteIcon.setOnClickListener(new View.OnClickListener() {
            /* class com.ss.android.lark.favorite.common.base.FavoriteHoverFuncView.View$OnClickListenerC371082 */

            public void onClick(View view) {
                if (FavoriteHoverFuncView.this.f95374a != null) {
                    FavoriteHoverFuncView.this.f95374a.mo136756b(view);
                }
            }
        });
    }

    public void setFuncItemClickListener(AbstractC37109a aVar) {
        this.f95374a = aVar;
    }

    public FavoriteHoverFuncView(Context context) {
        super(context);
        m146342a();
    }

    /* renamed from: a */
    public void mo136751a(MotionEvent motionEvent) {
        if (C57582a.m223608a(this, motionEvent)) {
            if (C57582a.m223608a(this.mForwardIcon, motionEvent)) {
                this.mForwardIcon.setHovered(true);
            } else {
                this.mForwardIcon.setHovered(false);
            }
            if (C57582a.m223608a(this.mDeleteIcon, motionEvent)) {
                this.mDeleteIcon.setHovered(true);
            } else {
                this.mDeleteIcon.setHovered(false);
            }
        } else {
            this.mForwardIcon.setHovered(false);
            this.mDeleteIcon.setHovered(false);
        }
    }

    public FavoriteHoverFuncView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m146342a();
    }

    public FavoriteHoverFuncView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m146342a();
    }
}
