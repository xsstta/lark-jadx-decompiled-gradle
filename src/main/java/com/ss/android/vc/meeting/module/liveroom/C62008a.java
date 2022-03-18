package com.ss.android.vc.meeting.module.liveroom;

import android.app.Activity;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.larksuite.suite.R;
import com.ss.android.lark.base.fragment.BaseFragment;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.vc.common.p3077b.C60700b;
import com.ss.android.vc.common.p3083e.C60773o;
import com.ss.android.vc.common.p3083e.C60776r;
import com.ss.android.vc.dependency.VideoChatModuleDependency;
import com.ss.android.vc.service.C63634c;

/* renamed from: com.ss.android.vc.meeting.module.liveroom.a */
public class C62008a extends BaseFragment {

    /* renamed from: a */
    private View f155800a;

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        super.onAttach(context);
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(final View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        boolean b = C63634c.m249496b("byteview.meeting.android.live.tab");
        C60700b.m235851b("LandingPageFragment", "[onViewCreated]", "live tab: " + b);
        int f = C60776r.m236148f();
        View findViewById = view.findViewById(R.id.container);
        if (findViewById.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) {
            ((ViewGroup.MarginLayoutParams) findViewById.getLayoutParams()).topMargin = -f;
        }
        TextView textView = (TextView) view.findViewById(R.id.back);
        textView.setTextColor(new ColorStateList(new int[][]{new int[]{16842919}, new int[0]}, new int[]{C60773o.m236126d(R.color.ud_N900), C60773o.m236126d(R.color.ud_N800)}));
        textView.setOnClickListener(new View.OnClickListener() {
            /* class com.ss.android.vc.meeting.module.liveroom.C62008a.View$OnClickListenerC620091 */

            public void onClick(View view) {
                if (C62008a.this.getActivity() != null) {
                    C62008a.this.getActivity().finish();
                } else if (view.getContext() instanceof Activity) {
                    ((Activity) view.getContext()).finish();
                }
            }
        });
        TextView textView2 = (TextView) view.findViewById(R.id.tips);
        TextView textView3 = (TextView) view.findViewById(R.id.upgrade);
        if (b) {
            textView2.setCompoundDrawablesWithIntrinsicBounds(0, R.drawable.illustration_platform_empty_positive_upgrading_1, 0, 0);
            textView2.setText(R.string.View_G_MobileUpdateApp);
            textView3.setText(R.string.View_G_GoUpdate);
            textView3.setVisibility(0);
            textView3.setOnClickListener(new View.OnClickListener() {
                /* class com.ss.android.vc.meeting.module.liveroom.C62008a.View$OnClickListenerC620102 */

                public void onClick(View view) {
                    VideoChatModuleDependency.getAppUpgradeDependency().launchAppUpgrade(view.getContext());
                }
            });
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setColor(C60773o.m236126d(R.color.ud_B500));
            gradientDrawable.setCornerRadius((float) UIHelper.dp2px(4.0f));
            GradientDrawable gradientDrawable2 = new GradientDrawable();
            gradientDrawable2.setColor(C60773o.m236126d(R.color.ud_B600));
            gradientDrawable2.setCornerRadius((float) UIHelper.dp2px(4.0f));
            StateListDrawable stateListDrawable = new StateListDrawable();
            stateListDrawable.addState(new int[]{16842919}, gradientDrawable2);
            stateListDrawable.addState(new int[0], gradientDrawable);
            textView3.setBackground(stateListDrawable);
            return;
        }
        textView2.setText(R.string.View_G_MobileUseDesktop);
        textView2.setCompoundDrawablesWithIntrinsicBounds(0, R.drawable.live_room_not_support, 0, 0);
        textView3.setVisibility(8);
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.activity_live_room_landing_page, viewGroup, false);
        this.f155800a = inflate;
        return inflate;
    }
}
