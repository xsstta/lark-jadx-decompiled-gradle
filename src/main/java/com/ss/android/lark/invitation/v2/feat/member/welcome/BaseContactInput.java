package com.ss.android.lark.invitation.v2.feat.member.welcome;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import butterknife.BindView;

public abstract class BaseContactInput extends ConstraintLayout {

    /* renamed from: a */
    protected AbstractC40490a.AbstractC40491a f102838a;

    /* renamed from: b */
    private boolean f102839b = true;
    @BindView(7613)
    ImageView mClearBT;

    /* renamed from: com.ss.android.lark.invitation.v2.feat.member.welcome.BaseContactInput$a */
    public interface AbstractC40490a {

        /* renamed from: com.ss.android.lark.invitation.v2.feat.member.welcome.BaseContactInput$a$a */
        public interface AbstractC40491a {
        }
    }

    public abstract String getContent();

    public void setOnKeyboardDetectorListener(AbstractC40490a.AbstractC40491a aVar) {
        this.f102838a = aVar;
    }

    public BaseContactInput(Context context) {
        super(context);
    }

    public BaseContactInput(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public BaseContactInput(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
