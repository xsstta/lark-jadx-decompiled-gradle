package com.by.p098a;

import android.content.Context;
import android.content.res.Resources;
import android.util.TypedValue;
import android.view.C0178a;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.drawerlayout.widget.DrawerLayout;
import com.by.inflate_lib.AbstractC2604b;
import com.by.inflate_lib.C2599a;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.component.ui.layout.LKUILinearLayout;
import com.larksuite.component.ui.layout.LKUIRelativeLayout;
import com.larksuite.suite.R;
import com.ss.android.lark.chatwindow.view.widget.TitleBarRedDotView;
import com.ss.android.lark.ui.CommonTitleBar;
import com.ss.android.lark.widget.ChatWindowPtrLoadingHeader;
import com.ss.android.lark.widget.ptr.LKUIPtrFrameLayout;
import com.ss.android.lark.widget.recyclerview.FocusDisableRecycler;

/* renamed from: com.by.a.a */
public class C2570a implements AbstractC2604b {
    @Override // com.by.inflate_lib.AbstractC2604b
    /* renamed from: a */
    public View mo11274a(Context context, ViewGroup viewGroup, boolean z) throws Exception {
        int i;
        Resources resources = context.getResources();
        LKUILinearLayout lKUILinearLayout = new LKUILinearLayout(context);
        lKUILinearLayout.setId(R.id.side_menu_drawer_layout);
        lKUILinearLayout.setBackgroundColor(resources.getColor(R.color.lkui_N00));
        lKUILinearLayout.setFitsSystemWindows(true);
        lKUILinearLayout.setClickable(true);
        ViewGroup.LayoutParams a = C0178a.m579a(viewGroup, -1, -1);
        LKUIRelativeLayout lKUIRelativeLayout = new LKUIRelativeLayout(context);
        lKUIRelativeLayout.setId(R.id.frame_container);
        ViewGroup.LayoutParams a2 = C0178a.m579a(lKUILinearLayout, -1, -1);
        LKUIPtrFrameLayout lKUIPtrFrameLayout = new LKUIPtrFrameLayout(context);
        lKUIPtrFrameLayout.setDurationToClose(100);
        lKUIPtrFrameLayout.setKeepHeaderWhenRefresh(true);
        lKUIPtrFrameLayout.setPullToRefresh(false);
        lKUIPtrFrameLayout.setRatioOfHeaderHeightToRefresh(1.2f);
        lKUIPtrFrameLayout.setResistance(1.7f);
        lKUIPtrFrameLayout.setId(R.id.inbox_ptr_layout);
        ViewGroup.LayoutParams a3 = C0178a.m579a(lKUIRelativeLayout, -1, -1);
        if (RelativeLayout.LayoutParams.class.isInstance(a3)) {
            ((RelativeLayout.LayoutParams) a3).addRule(2, R.id.list_bottom_view);
        }
        if (RelativeLayout.LayoutParams.class.isInstance(a3)) {
            ((RelativeLayout.LayoutParams) a3).addRule(10, -1);
        }
        ChatWindowPtrLoadingHeader chatWindowPtrLoadingHeader = new ChatWindowPtrLoadingHeader(context);
        ViewGroup.MarginLayoutParams a4 = C0178a.m579a(lKUIPtrFrameLayout, -1, -2);
        C0178a.m580a(chatWindowPtrLoadingHeader);
        if (chatWindowPtrLoadingHeader.getParent() == null) {
            lKUIPtrFrameLayout.addView(chatWindowPtrLoadingHeader, a4);
        }
        FocusDisableRecycler focusDisableRecycler = new FocusDisableRecycler(context);
        focusDisableRecycler.setId(R.id.message_view);
        focusDisableRecycler.setClipToPadding(false);
        focusDisableRecycler.setOverScrollMode(2);
        focusDisableRecycler.setPadding(focusDisableRecycler.getPaddingLeft(), focusDisableRecycler.getPaddingTop(), focusDisableRecycler.getPaddingRight(), (int) TypedValue.applyDimension(1, 10.0f, resources.getDisplayMetrics()));
        ViewGroup.MarginLayoutParams a5 = C0178a.m579a(lKUIPtrFrameLayout, -1, -1);
        C0178a.m580a(focusDisableRecycler);
        if (focusDisableRecycler.getParent() == null) {
            lKUIPtrFrameLayout.addView(focusDisableRecycler, a5);
        }
        ChatWindowPtrLoadingHeader chatWindowPtrLoadingHeader2 = new ChatWindowPtrLoadingHeader(context);
        ViewGroup.MarginLayoutParams a6 = C0178a.m579a(lKUIPtrFrameLayout, -1, -2);
        C0178a.m580a(chatWindowPtrLoadingHeader2);
        if (chatWindowPtrLoadingHeader2.getParent() == null) {
            lKUIPtrFrameLayout.addView(chatWindowPtrLoadingHeader2, a6);
        }
        C0178a.m580a(lKUIPtrFrameLayout);
        if (lKUIPtrFrameLayout.getParent() == null) {
            lKUIRelativeLayout.addView(lKUIPtrFrameLayout, a3);
        }
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setId(R.id.list_bottom_view);
        linearLayout.setOrientation(1);
        ViewGroup.LayoutParams a7 = C0178a.m579a(lKUIRelativeLayout, -1, -2);
        if (RelativeLayout.LayoutParams.class.isInstance(a7)) {
            ((RelativeLayout.LayoutParams) a7).addRule(12, -1);
        }
        View a8 = C2599a.m10959a(context, R.layout.view_chat_timezone_tip, linearLayout, false, 0);
        if (a8.getParent() == null) {
            linearLayout.addView(a8);
        }
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setId(R.id.fl_chat_smart_reply_container);
        frameLayout.setVisibility(8);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, (int) resources.getDimension(R.dimen.dp_48));
        C0178a.m580a(frameLayout);
        if (frameLayout.getParent() == null) {
            linearLayout.addView(frameLayout, layoutParams);
        }
        View view = new View(context);
        view.setId(R.id.keyboard_hoder);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, (int) TypedValue.applyDimension(1, BitmapDescriptorFactory.HUE_RED, resources.getDisplayMetrics()));
        C0178a.m580a(view);
        if (view.getParent() == null) {
            linearLayout.addView(view, layoutParams2);
        }
        ViewStub viewStub = new ViewStub(context);
        viewStub.setId(R.id.chat_window_p2p_build_group_stub);
        viewStub.setLayoutResource(R.layout.chat_window_p2p_build_group_layout);
        viewStub.setVisibility(8);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-1, (int) TypedValue.applyDimension(1, 49.0f, resources.getDisplayMetrics()));
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams3)) {
            layoutParams3.gravity = 80;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParams3)) {
            ((FrameLayout.LayoutParams) layoutParams3).gravity = 80;
        }
        if (DrawerLayout.LayoutParams.class.isInstance(layoutParams3)) {
            ((DrawerLayout.LayoutParams) layoutParams3).f3665a = 80;
        }
        viewStub.setInflatedId(-1);
        C0178a.m580a(viewStub);
        if (viewStub.getParent() == null) {
            linearLayout.addView(viewStub, layoutParams3);
        }
        ViewStub viewStub2 = new ViewStub(context);
        viewStub2.setId(R.id.multi_select_menu_stub);
        viewStub2.setLayoutResource(R.layout.chat_window_multi_select_layout);
        viewStub2.setVisibility(8);
        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(-1, -2);
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams4)) {
            layoutParams4.gravity = 80;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParams4)) {
            ((FrameLayout.LayoutParams) layoutParams4).gravity = 80;
        }
        if (DrawerLayout.LayoutParams.class.isInstance(layoutParams4)) {
            ((DrawerLayout.LayoutParams) layoutParams4).f3665a = 80;
        }
        viewStub2.setInflatedId(-1);
        C0178a.m580a(viewStub2);
        if (viewStub2.getParent() == null) {
            linearLayout.addView(viewStub2, layoutParams4);
        }
        AppCompatTextView appCompatTextView = new AppCompatTextView(context);
        appCompatTextView.setId(R.id.chat_window_p2p_chatter_is_deactivied_tip);
        appCompatTextView.setBackgroundColor(resources.getColor(R.color.bg_body));
        appCompatTextView.setText(R.string.Lark_Legacy_ChatterResignPermissionMask);
        appCompatTextView.setTextColor(resources.getColorStateList(R.color.text_placeholder));
        appCompatTextView.setVisibility(8);
        LinearLayout.LayoutParams layoutParams5 = new LinearLayout.LayoutParams(-1, (int) resources.getDimension(R.dimen.p2p_chatter_is_dimission_tip_height));
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams5)) {
            layoutParams5.gravity = 80;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParams5)) {
            ((FrameLayout.LayoutParams) layoutParams5).gravity = 80;
        }
        if (DrawerLayout.LayoutParams.class.isInstance(layoutParams5)) {
            ((DrawerLayout.LayoutParams) layoutParams5).f3665a = 80;
        }
        appCompatTextView.setGravity(17);
        C0178a.m580a(appCompatTextView);
        if (appCompatTextView.getParent() == null) {
            linearLayout.addView(appCompatTextView, layoutParams5);
        }
        C0178a.m580a(linearLayout);
        if (linearLayout.getParent() == null) {
            lKUIRelativeLayout.addView(linearLayout, a7);
        }
        View commonTitleBar = new CommonTitleBar(context);
        commonTitleBar.setId(R.id.titlebar);
        ViewGroup.LayoutParams a9 = C0178a.m579a(lKUIRelativeLayout, -1, -2);
        C0178a.m580a(commonTitleBar);
        if (commonTitleBar.getParent() == null) {
            lKUIRelativeLayout.addView(commonTitleBar, a9);
        }
        View view2 = new View(context);
        view2.setId(R.id.titlebar_divider);
        view2.setVisibility(8);
        view2.setBackgroundColor(resources.getColor(R.color.line_border_card));
        ViewGroup.LayoutParams a10 = C0178a.m579a(lKUIRelativeLayout, -1, (int) TypedValue.applyDimension(1, 1.0f, resources.getDisplayMetrics()));
        if (ViewGroup.MarginLayoutParams.class.isInstance(a10)) {
            ((ViewGroup.MarginLayoutParams) a10).topMargin = (int) TypedValue.applyDimension(1, 48.0f, resources.getDisplayMetrics());
        }
        C0178a.m580a(view2);
        if (view2.getParent() == null) {
            lKUIRelativeLayout.addView(view2, a10);
        }
        AppCompatImageView appCompatImageView = new AppCompatImageView(context);
        appCompatImageView.setId(R.id.hide_back);
        appCompatImageView.setBackgroundResource(R.drawable.chat_window_back_bg_selector);
        appCompatImageView.setPadding(appCompatImageView.getPaddingLeft(), appCompatImageView.getPaddingTop(), appCompatImageView.getPaddingRight(), (int) TypedValue.applyDimension(1, 18.0f, resources.getDisplayMetrics()));
        appCompatImageView.setPadding(appCompatImageView.getPaddingLeft(), (int) TypedValue.applyDimension(1, 6.0f, resources.getDisplayMetrics()), appCompatImageView.getPaddingRight(), appCompatImageView.getPaddingBottom());
        appCompatImageView.setScaleType(ImageView.ScaleType.CENTER);
        ViewGroup.LayoutParams a11 = C0178a.m579a(lKUIRelativeLayout, (int) TypedValue.applyDimension(1, 52.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 52.0f, resources.getDisplayMetrics()));
        C0178a.m580a(appCompatImageView);
        if (appCompatImageView.getParent() == null) {
            lKUIRelativeLayout.addView(appCompatImageView, a11);
        }
        TitleBarRedDotView titleBarRedDotView = new TitleBarRedDotView(context);
        titleBarRedDotView.setBadgeSize((int) resources.getDimension(R.dimen.dp_13));
        titleBarRedDotView.setId(R.id.slide_fab);
        ViewGroup.LayoutParams a12 = C0178a.m579a(lKUIRelativeLayout, (int) TypedValue.applyDimension(1, 52.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 52.0f, resources.getDisplayMetrics()));
        if (RelativeLayout.LayoutParams.class.isInstance(a12)) {
            i = -1;
            ((RelativeLayout.LayoutParams) a12).addRule(10, -1);
        } else {
            i = -1;
        }
        if (RelativeLayout.LayoutParams.class.isInstance(a12)) {
            ((RelativeLayout.LayoutParams) a12).addRule(11, i);
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(a12)) {
            ((ViewGroup.MarginLayoutParams) a12).rightMargin = (int) TypedValue.applyDimension(1, 1.0f, resources.getDisplayMetrics());
        }
        C0178a.m580a(titleBarRedDotView);
        if (titleBarRedDotView.getParent() == null) {
            lKUIRelativeLayout.addView(titleBarRedDotView, a12);
        }
        FrameLayout frameLayout2 = new FrameLayout(context);
        frameLayout2.setId(R.id.chat_window_float_layout);
        ViewGroup.LayoutParams a13 = C0178a.m579a(lKUIRelativeLayout, -1, -1);
        if (RelativeLayout.LayoutParams.class.isInstance(a13)) {
            ((RelativeLayout.LayoutParams) a13).addRule(2, R.id.list_bottom_view);
        }
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setId(R.id.banner_container);
        linearLayout2.setOrientation(1);
        FrameLayout.LayoutParams layoutParams6 = new FrameLayout.LayoutParams(-1, -2);
        C0178a.m580a(linearLayout2);
        if (linearLayout2.getParent() == null) {
            frameLayout2.addView(linearLayout2, layoutParams6);
        }
        C0178a.m580a(frameLayout2);
        if (frameLayout2.getParent() == null) {
            lKUIRelativeLayout.addView(frameLayout2, a13);
        }
        View frameLayout3 = new FrameLayout(context);
        frameLayout3.setId(R.id.chat_window_keyboard_container);
        frameLayout3.setVisibility(0);
        ViewGroup.LayoutParams a14 = C0178a.m579a(lKUIRelativeLayout, -1, -2);
        if (RelativeLayout.LayoutParams.class.isInstance(a14)) {
            ((RelativeLayout.LayoutParams) a14).addRule(12, -1);
        }
        C0178a.m580a(frameLayout3);
        if (frameLayout3.getParent() == null) {
            lKUIRelativeLayout.addView(frameLayout3, a14);
        }
        C0178a.m580a(lKUIRelativeLayout);
        if (lKUIRelativeLayout.getParent() == null) {
            lKUILinearLayout.addView(lKUIRelativeLayout, a2);
        }
        C0178a.m580a(lKUILinearLayout);
        lKUILinearLayout.setLayoutParams(a);
        if (viewGroup != null && z) {
            viewGroup.addView(lKUILinearLayout);
        }
        return lKUILinearLayout;
    }
}
