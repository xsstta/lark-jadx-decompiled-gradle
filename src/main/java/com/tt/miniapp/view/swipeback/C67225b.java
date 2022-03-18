package com.tt.miniapp.view.swipeback;

import android.content.res.TypedArray;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import androidx.fragment.app.FragmentTransaction;
import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.larksuite.suite.R;
import com.tt.miniapp.p3331t.AbstractC66881b;
import com.tt.miniapp.view.swipeback.SwipeBackLayout;
import com.tt.miniapphost.AppbrandContext;
import com.tt.miniapphost.MiniappHostBase;

/* renamed from: com.tt.miniapp.view.swipeback.b */
public class C67225b extends AbstractC66881b {
    boolean mLocking;
    private Animation mNoAnim;
    private SwipeBackLayout mSwipeBackLayout;

    public SwipeBackLayout getSwipeBackLayout() {
        return this.mSwipeBackLayout;
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
    }

    /* access modifiers changed from: protected */
    public int getWindowBackground() {
        TypedArray obtainStyledAttributes = getActivity().getTheme().obtainStyledAttributes(new int[]{16842836});
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        obtainStyledAttributes.recycle();
        return resourceId;
    }

    /* access modifiers changed from: protected */
    public View attachToSwipeBack(View view) {
        this.mSwipeBackLayout.mo233720b(this, view);
        return this.mSwipeBackLayout;
    }

    /* access modifiers changed from: protected */
    public void setEdgeLevel(int i) {
        this.mSwipeBackLayout.setEdgeLevel(i);
    }

    public void setSwipeBackEnable(boolean z) {
        this.mSwipeBackLayout.setEnableGesture(z);
    }

    @Override // androidx.fragment.app.Fragment
    public void onHiddenChanged(boolean z) {
        SwipeBackLayout swipeBackLayout;
        super.onHiddenChanged(z);
        if (z && (swipeBackLayout = this.mSwipeBackLayout) != null) {
            swipeBackLayout.mo233719b();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("SWIPEBACKFRAGMENT_STATE_SAVE_IS_HIDDEN", isHidden());
    }

    /* access modifiers changed from: protected */
    public void setEdgeLevel(SwipeBackLayout.EdgeLevel edgeLevel) {
        this.mSwipeBackLayout.setEdgeLevel(edgeLevel);
    }

    private void initFragmentBackground(View view) {
        if (view instanceof SwipeBackLayout) {
            setBackground(((SwipeBackLayout) view).getChildAt(0));
        } else {
            setBackground(view);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        View view = getView();
        initFragmentBackground(view);
        if (view != null) {
            view.setClickable(true);
        }
    }

    public C67225b(IAppContext iAppContext) {
        this.mSwipeBackLayout = new SwipeBackLayout(AppbrandContext.getInst().getApplicationContext(), iAppContext);
        this.mSwipeBackLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        this.mSwipeBackLayout.setBackgroundColor(0);
    }

    private void setBackground(View view) {
        if (view != null && view.getBackground() == null) {
            int i = 0;
            if (getActivity() instanceof MiniappHostBase) {
                i = ((MiniappHostBase) getActivity()).getDefaultFragmentBackground();
            }
            if (i == 0) {
                view.setBackgroundResource(getWindowBackground());
            } else {
                view.setBackgroundResource(i);
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle != null) {
            boolean z = bundle.getBoolean("SWIPEBACKFRAGMENT_STATE_SAVE_IS_HIDDEN");
            FragmentTransaction beginTransaction = getFragmentManager().beginTransaction();
            if (z) {
                beginTransaction.hide(this);
            } else {
                beginTransaction.show(this);
            }
            beginTransaction.commit();
        }
        this.mNoAnim = AnimationUtils.loadAnimation(getActivity(), R.anim.microapp_i_no_anim);
    }

    /* access modifiers changed from: protected */
    public View attachToSwipeBack(View view, SwipeBackLayout.EdgeLevel edgeLevel) {
        this.mSwipeBackLayout.mo233720b(this, view);
        this.mSwipeBackLayout.setEdgeLevel(edgeLevel);
        return this.mSwipeBackLayout;
    }

    @Override // androidx.fragment.app.Fragment
    public Animation onCreateAnimation(int i, boolean z, int i2) {
        if (this.mLocking) {
            return this.mNoAnim;
        }
        return super.onCreateAnimation(i, z, i2);
    }
}
