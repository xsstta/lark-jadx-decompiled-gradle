package com.ss.android.appcenter.business.activity.appaddv2.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import com.larksuite.component.ui.imageview.LKUILottieAnimationView;
import com.larksuite.suite.R;
import com.ss.android.appcenter.common.util.C28209p;

public class ActionButton extends FrameLayout {

    /* renamed from: a */
    private TextView f68869a;

    /* renamed from: b */
    private LKUILottieAnimationView f68870b;

    /* renamed from: c */
    private FrameLayout f68871c;

    /* renamed from: d */
    private int f68872d;

    /* renamed from: e */
    private View f68873e;

    public enum ActionType {
        ADD(R.string.OpenPlatform_AppCenter_AddBttn, R.color.primary_pri_500, R.drawable.workplace_common_blue_bt_bg),
        ADD_LOADING("workplace_button_loading.json", R.drawable.workplace_common_blue_bt_bg),
        DELETE(R.string.OpenPlatform_AppCenter_RedoAddBttn, R.color.text_title, R.drawable.workplace_common_grey_bt_bg),
        DELETE_LOADING("workplace_button_loading.json", R.drawable.workplace_common_grey_bt_bg),
        GET(R.string.OpenPlatform_AppCenter_GetBttn, R.color.primary_pri_500, R.drawable.workplace_common_blue_bt_bg);
        
        private String mAnimatorAssetPath;
        private int mBackgroundResource;
        private int mTextColor;
        private int mTextResId;

        public String getAnimatorAssetPath() {
            return this.mAnimatorAssetPath;
        }

        public int getBackgroundResource() {
            return this.mBackgroundResource;
        }

        public int getTextColor() {
            return this.mTextColor;
        }

        public int getTextResId() {
            return this.mTextResId;
        }

        public boolean showLoading() {
            if (this == ADD_LOADING || this == DELETE_LOADING) {
                return true;
            }
            return false;
        }

        private ActionType(String str, int i) {
            this.mAnimatorAssetPath = str;
            this.mBackgroundResource = i;
        }

        private ActionType(int i, int i2, int i3) {
            this.mTextResId = i;
            this.mTextColor = i2;
            this.mBackgroundResource = i3;
        }
    }

    /* renamed from: a */
    private void m100759a() {
        View inflate = LayoutInflater.from(getContext()).inflate(R.layout.workplace_addapp_actionbutton_view, (ViewGroup) this, true);
        this.f68873e = inflate;
        this.f68869a = (TextView) inflate.findViewById(R.id.action_text);
        this.f68870b = (LKUILottieAnimationView) this.f68873e.findViewById(R.id.loading);
        this.f68871c = (FrameLayout) this.f68873e.findViewById(R.id.background);
        this.f68872d = C28209p.m103293a(getContext(), 60.0f);
    }

    public ActionButton(Context context) {
        this(context, null);
    }

    /* renamed from: a */
    public void mo98336a(ActionType actionType) {
        ViewGroup.LayoutParams layoutParams = this.f68871c.getLayoutParams();
        layoutParams.width = this.f68872d;
        this.f68871c.setLayoutParams(layoutParams);
        if (actionType.showLoading()) {
            this.f68871c.setBackgroundResource(actionType.getBackgroundResource());
            this.f68869a.setVisibility(4);
            this.f68870b.setAnimation(actionType.getAnimatorAssetPath());
            this.f68870b.setRepeatCount(-1);
            this.f68870b.setVisibility(0);
            this.f68870b.playAnimation();
            setEnabled(false);
            return;
        }
        this.f68870b.cancelAnimation();
        this.f68870b.setVisibility(8);
        setEnabled(true);
        this.f68869a.setText(actionType.getTextResId());
        this.f68869a.setTextColor(ContextCompat.getColor(getContext(), actionType.getTextColor()));
        this.f68869a.setVisibility(0);
        this.f68871c.setBackgroundResource(actionType.getBackgroundResource());
    }

    public ActionButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ActionButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m100759a();
    }
}
