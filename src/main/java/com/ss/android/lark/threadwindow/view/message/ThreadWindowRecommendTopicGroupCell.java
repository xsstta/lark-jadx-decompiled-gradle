package com.ss.android.lark.threadwindow.view.message;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.SimpleItemAnimator;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.larksuite.framework.utils.CollectionUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.chat.base.view.vo.ThreadMessageVO;
import com.ss.android.lark.chat.base.view.vo.message.PostContentVO;
import com.ss.android.lark.chat.chatwindow.chat.message.AbstractC33290a;
import com.ss.android.lark.chat.export.vo.ContentVO;
import com.ss.android.lark.chat.vo.AbsMessageVO;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.statistics.thread.ThreadTopicHitPoint;
import com.ss.android.lark.threaddetail.view.C55869b;
import com.ss.android.lark.threadtab.view.recommendgroup.C55988a;
import com.ss.android.lark.widget.listener.OnSingleClickListener;
import com.ss.android.lark.widget.recyclerview.hive.AbstractC59010e;
import java.util.ArrayList;

public class ThreadWindowRecommendTopicGroupCell extends AbstractC33290a<ContentVO<?>, RecommendTopicGroupViewHolder> {

    /* renamed from: a */
    public final C55988a f139066a;

    /* renamed from: b */
    public final AbstractC56196a f139067b;

    /* renamed from: com.ss.android.lark.threadwindow.view.message.ThreadWindowRecommendTopicGroupCell$a */
    public interface AbstractC56196a {
        /* renamed from: B */
        void mo191267B();
    }

    @Override // com.ss.android.lark.widget.recyclerview.hive.AbstractC59004b
    /* renamed from: c */
    public int mo122651c() {
        return R.layout.item_thread_tab_topic_group;
    }

    /* access modifiers changed from: package-private */
    public static class RecommendTopicGroupViewHolder extends AbstractC59010e {
        @BindView(8081)
        public ViewGroup mRecommendTopicsLayout;
        @BindView(8619)
        public RecyclerView mRvRecommendTopicGroup;
        @BindView(9136)
        public TextView mTvRecommendTopidGroup;
        @BindView(9144)
        public TextView mTvSeeMoreGroup;

        RecommendTopicGroupViewHolder() {
        }

        /* access modifiers changed from: protected */
        @Override // com.ss.android.lark.widget.recyclerview.hive.AbstractC59010e
        /* renamed from: a */
        public void mo122652a(View view) {
            ButterKnife.bind(this, view);
            LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this.mRvRecommendTopicGroup.getContext(), 0, false);
            linearLayoutManager.setRecycleChildrenOnDetach(true);
            linearLayoutManager.setStackFromEnd(false);
            this.mRvRecommendTopicGroup.setLayoutManager(linearLayoutManager);
            ((SimpleItemAnimator) this.mRvRecommendTopicGroup.getItemAnimator()).setSupportsChangeAnimations(false);
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.widget.recyclerview.hive.AbstractC59004b
    /* renamed from: a */
    public Class<?> mo122646a() {
        return PostContentVO.class;
    }

    public class RecommendTopicGroupViewHolder_ViewBinding implements Unbinder {

        /* renamed from: a */
        private RecommendTopicGroupViewHolder f139069a;

        @Override // butterknife.Unbinder
        public void unbind() {
            RecommendTopicGroupViewHolder recommendTopicGroupViewHolder = this.f139069a;
            if (recommendTopicGroupViewHolder != null) {
                this.f139069a = null;
                recommendTopicGroupViewHolder.mRvRecommendTopicGroup = null;
                recommendTopicGroupViewHolder.mTvSeeMoreGroup = null;
                recommendTopicGroupViewHolder.mTvRecommendTopidGroup = null;
                recommendTopicGroupViewHolder.mRecommendTopicsLayout = null;
                return;
            }
            throw new IllegalStateException("Bindings already cleared.");
        }

        public RecommendTopicGroupViewHolder_ViewBinding(RecommendTopicGroupViewHolder recommendTopicGroupViewHolder, View view) {
            this.f139069a = recommendTopicGroupViewHolder;
            recommendTopicGroupViewHolder.mRvRecommendTopicGroup = (RecyclerView) Utils.findRequiredViewAsType(view, R.id.rv_recommend_topic_group, "field 'mRvRecommendTopicGroup'", RecyclerView.class);
            recommendTopicGroupViewHolder.mTvSeeMoreGroup = (TextView) Utils.findRequiredViewAsType(view, R.id.tv_see_more_topic_group, "field 'mTvSeeMoreGroup'", TextView.class);
            recommendTopicGroupViewHolder.mTvRecommendTopidGroup = (TextView) Utils.findRequiredViewAsType(view, R.id.tv_recommend_topic_group, "field 'mTvRecommendTopidGroup'", TextView.class);
            recommendTopicGroupViewHolder.mRecommendTopicsLayout = (ViewGroup) Utils.findRequiredViewAsType(view, R.id.ll_recommend_groups, "field 'mRecommendTopicsLayout'", ViewGroup.class);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo191549b(RecommendTopicGroupViewHolder recommendTopicGroupViewHolder) {
        super.mo191549b(recommendTopicGroupViewHolder);
        Log.m165389i("RecommendTopicGroup", "recommend topic group onViewAttachedToWindow");
        RecyclerView recyclerView = recommendTopicGroupViewHolder.mRvRecommendTopicGroup;
        RecyclerView.Adapter adapter = recyclerView.getAdapter();
        if (adapter != null && adapter.getItemCount() > 0 && recyclerView.getChildCount() == 0) {
            Log.m165389i("RecommendTopicGroup", "recommend topic group onDraw failed,notifyDataSetChanged");
            adapter.notifyDataSetChanged();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo122649a(RecommendTopicGroupViewHolder recommendTopicGroupViewHolder, AbsMessageVO<ContentVO<?>> aVar) {
        super.mo122648a((AbstractC59010e) recommendTopicGroupViewHolder, (AbsMessageVO) aVar);
        if (aVar instanceof ThreadMessageVO) {
            ThreadMessageVO threadMessageVO = (ThreadMessageVO) aVar;
            if (recommendTopicGroupViewHolder.mRvRecommendTopicGroup.getAdapter() == null || recommendTopicGroupViewHolder.mRvRecommendTopicGroup.getChildCount() <= 0) {
                recommendTopicGroupViewHolder.mRvRecommendTopicGroup.setAdapter(this.f139066a);
                Log.m165389i("ThreadWindowRecommendTopicGroupCell", "RecycleViewChildCount: " + recommendTopicGroupViewHolder.mRvRecommendTopicGroup.getChildCount());
            }
            if (CollectionUtils.isNotEmpty(threadMessageVO.ab())) {
                Log.m165389i("ThreadWindowRecommendTopicGroupCell", "recommend topic group size: " + threadMessageVO.ab().size());
                recommendTopicGroupViewHolder.mRecommendTopicsLayout.setVisibility(0);
                this.f139066a.mo190832a(new ArrayList(threadMessageVO.ab()));
            } else {
                Log.m165389i("ThreadWindowRecommendTopicGroupCell", "recommend topic group size = 0 ");
                recommendTopicGroupViewHolder.mRecommendTopicsLayout.setVisibility(8);
            }
            if (threadMessageVO.aa()) {
                recommendTopicGroupViewHolder.mTvSeeMoreGroup.setVisibility(0);
            } else {
                recommendTopicGroupViewHolder.mTvSeeMoreGroup.setVisibility(8);
            }
            recommendTopicGroupViewHolder.mTvSeeMoreGroup.setOnClickListener(new OnSingleClickListener() {
                /* class com.ss.android.lark.threadwindow.view.message.ThreadWindowRecommendTopicGroupCell.C561951 */

                @Override // com.ss.android.lark.widget.listener.OnSingleClickListener
                public void onSingleClick(View view) {
                    if (ThreadWindowRecommendTopicGroupCell.this.f139067b != null) {
                        ThreadWindowRecommendTopicGroupCell.this.f139067b.mo191267B();
                        ThreadTopicHitPoint.f135906a.mo187744l();
                    }
                }
            });
            recommendTopicGroupViewHolder.mTvRecommendTopidGroup.setText(C55869b.m217003a((int) R.string.Lark_Groups_SuggestGroupsTitle));
        }
    }
}
