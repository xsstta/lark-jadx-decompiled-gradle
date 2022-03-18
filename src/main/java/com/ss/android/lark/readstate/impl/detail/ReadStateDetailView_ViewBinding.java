package com.ss.android.lark.readstate.impl.detail;

import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.larksuite.suite.R;
import com.ss.android.lark.ui.CommonTitleBar;
import net.lucode.hackware.magicindicator.MagicIndicator;

public class ReadStateDetailView_ViewBinding implements Unbinder {

    /* renamed from: a */
    private ReadStateDetailView f131346a;

    @Override // butterknife.Unbinder
    public void unbind() {
        ReadStateDetailView readStateDetailView = this.f131346a;
        if (readStateDetailView != null) {
            this.f131346a = null;
            readStateDetailView.mTitleBar = null;
            readStateDetailView.mViewPager = null;
            readStateDetailView.mIndicator = null;
            readStateDetailView.mSearchLayout = null;
            readStateDetailView.mSearchEt = null;
            readStateDetailView.mSearchDel = null;
            readStateDetailView.mFragmentContainer = null;
            readStateDetailView.mSearchResultRV = null;
            readStateDetailView.mEmptyHintView = null;
            readStateDetailView.mEmptyHintTv = null;
            readStateDetailView.mContentLayout = null;
            readStateDetailView.mLkpReadStateLayoutWrap = null;
            readStateDetailView.mLkpSplitView = null;
            readStateDetailView.mLkpReadTitleTv = null;
            readStateDetailView.mLkpReadFragmentLayout = null;
            readStateDetailView.mLkpUnreadTitleTv = null;
            readStateDetailView.mLkpUnreadFragmentLayout = null;
            readStateDetailView.mLkpReadCountTv = null;
            readStateDetailView.mLkpUnreadCountTv = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public ReadStateDetailView_ViewBinding(ReadStateDetailView readStateDetailView, View view) {
        this.f131346a = readStateDetailView;
        readStateDetailView.mTitleBar = (CommonTitleBar) Utils.findRequiredViewAsType(view, R.id.titlebar, "field 'mTitleBar'", CommonTitleBar.class);
        readStateDetailView.mViewPager = (ViewPager) Utils.findRequiredViewAsType(view, R.id.view_pager, "field 'mViewPager'", ViewPager.class);
        readStateDetailView.mIndicator = (MagicIndicator) Utils.findRequiredViewAsType(view, R.id.indicator, "field 'mIndicator'", MagicIndicator.class);
        readStateDetailView.mSearchLayout = Utils.findRequiredView(view, R.id.search_layout, "field 'mSearchLayout'");
        readStateDetailView.mSearchEt = (EditText) Utils.findRequiredViewAsType(view, R.id.search_txt, "field 'mSearchEt'", EditText.class);
        readStateDetailView.mSearchDel = Utils.findRequiredView(view, R.id.search_del, "field 'mSearchDel'");
        readStateDetailView.mFragmentContainer = (ViewGroup) Utils.findRequiredViewAsType(view, R.id.fragment_container, "field 'mFragmentContainer'", ViewGroup.class);
        readStateDetailView.mSearchResultRV = (RecyclerView) Utils.findRequiredViewAsType(view, R.id.search_result_rv, "field 'mSearchResultRV'", RecyclerView.class);
        readStateDetailView.mEmptyHintView = Utils.findRequiredView(view, R.id.load_empty, "field 'mEmptyHintView'");
        readStateDetailView.mEmptyHintTv = (TextView) Utils.findRequiredViewAsType(view, R.id.text_empty_tip, "field 'mEmptyHintTv'", TextView.class);
        readStateDetailView.mContentLayout = (FrameLayout) Utils.findRequiredViewAsType(view, R.id.content_layout, "field 'mContentLayout'", FrameLayout.class);
        readStateDetailView.mLkpReadStateLayoutWrap = Utils.findRequiredView(view, R.id.lkp_layout, "field 'mLkpReadStateLayoutWrap'");
        readStateDetailView.mLkpSplitView = Utils.findRequiredView(view, R.id.line_view, "field 'mLkpSplitView'");
        readStateDetailView.mLkpReadTitleTv = (TextView) Utils.findRequiredViewAsType(view, R.id.read_title_tv, "field 'mLkpReadTitleTv'", TextView.class);
        readStateDetailView.mLkpReadFragmentLayout = (FrameLayout) Utils.findRequiredViewAsType(view, R.id.read_fragment_container, "field 'mLkpReadFragmentLayout'", FrameLayout.class);
        readStateDetailView.mLkpUnreadTitleTv = (TextView) Utils.findRequiredViewAsType(view, R.id.unread_title_tv, "field 'mLkpUnreadTitleTv'", TextView.class);
        readStateDetailView.mLkpUnreadFragmentLayout = (FrameLayout) Utils.findRequiredViewAsType(view, R.id.unread_fragment_container, "field 'mLkpUnreadFragmentLayout'", FrameLayout.class);
        readStateDetailView.mLkpReadCountTv = (TextView) Utils.findRequiredViewAsType(view, R.id.read_title_count_tv, "field 'mLkpReadCountTv'", TextView.class);
        readStateDetailView.mLkpUnreadCountTv = (TextView) Utils.findRequiredViewAsType(view, R.id.unread_title_count_tv, "field 'mLkpUnreadCountTv'", TextView.class);
    }
}
