package com.ss.android.lark.message.vote.message;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.larksuite.component.ui.display.manager.C25649b;
import com.larksuite.component.ui.display.manager.LKUIDisplayManager;
import com.larksuite.component.ui.display.manager.LarkFont;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.UIGetDataCallback;
import com.larksuite.suite.R;
import com.ss.android.lark.appcenter.wrapper.vote.statistics.VoteHitPoint;
import com.ss.android.lark.chat.entity.message.Message;
import com.ss.android.lark.chat.export.ui.menu.OpenMenuDataHolder;
import com.ss.android.lark.chat.export.ui.message.IMessageContext;
import com.ss.android.lark.chat.export.ui.message.IOpenMessageCell;
import com.ss.android.lark.chat.export.ui.message.style.BubbleStyle;
import com.ss.android.lark.chat.export.ui.message.style.C34034b;
import com.ss.android.lark.chat.export.ui.message.style.C34035c;
import com.ss.android.lark.chat.export.ui.message.style.IOpenBubbleStyleProvider;
import com.ss.android.lark.chat.export.ui.p1672b.C34029b;
import com.ss.android.lark.chat.export.vo.OpenMessageVO;
import com.ss.android.lark.desktopmode.utils.DesktopUtil;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.message.card.p2262b.C45293b;
import com.ss.android.lark.message.service.AbstractC45376a;
import com.ss.android.lark.message.service.dto.C45381b;
import com.ss.android.lark.message.service.p2268a.C45377b;
import com.ss.android.lark.message.vote.AbstractC45384a;
import com.ss.android.lark.message.vote.C45387b;
import com.ss.android.lark.message.vote.C45389c;
import com.ss.android.lark.message.vote.statistics.VoteHitPointNew;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.vc.meeting.framework.statemachine.SmEvents;
import java.util.List;
import java.util.Map;

public class VoteMessageCell implements IOpenMessageCell<VoteContentVO>, IOpenBubbleStyleProvider<VoteContentVO> {

    /* renamed from: a */
    public static final int f114981a = UIHelper.dp2px(12.0f);

    /* renamed from: b */
    public C45389c f114982b;

    /* renamed from: c */
    private final IMessageContext f114983c;

    @Override // com.ss.android.lark.chat.export.ui.message.IOpenMessageCell
    /* renamed from: a */
    public void mo120410a(View view) {
    }

    /* renamed from: a */
    public void mo160253a(List<C34029b> list, OpenMenuDataHolder<VoteContentVO> cVar) {
    }

    @Override // com.ss.android.lark.chat.export.ui.message.style.IOpenBubbleStyleProvider
    /* renamed from: b */
    public C34035c mo120416b(OpenMessageVO<VoteContentVO> cVar) {
        return null;
    }

    static class VoteMessageViewHolder implements AbstractC45384a {

        /* renamed from: a */
        private AbstractC45384a.AbstractC45386b f114987a;

        /* renamed from: b */
        private AbstractC45384a.AbstractC45385a f114988b;
        @BindView(6454)
        public TextView mActionBtn;
        @BindView(6469)
        public TextView mActualParticipantNumberTv;
        @BindView(7213)
        public TextView mNumberOfParticipantsTv;
        @BindView(7231)
        public RecyclerView mOptionsRv;
        @BindView(7458)
        public TextView mSelectType;
        @BindView(7628)
        public View mTitleLayout;
        @BindView(7632)
        public TextView mTitleTv;
        @BindView(7800)
        public View mVoteIcon;

        @Override // com.ss.android.lark.message.vote.AbstractC45384a
        /* renamed from: a */
        public TextView mo160232a() {
            return this.mTitleTv;
        }

        @Override // com.ss.android.lark.message.vote.AbstractC45384a
        /* renamed from: b */
        public TextView mo160233b() {
            return this.mSelectType;
        }

        @Override // com.ss.android.lark.message.vote.AbstractC45384a
        /* renamed from: c */
        public View mo160234c() {
            return this.mTitleLayout;
        }

        @Override // com.ss.android.lark.message.vote.AbstractC45384a
        /* renamed from: d */
        public RecyclerView mo160235d() {
            return this.mOptionsRv;
        }

        @Override // com.ss.android.lark.message.vote.AbstractC45384a
        /* renamed from: e */
        public TextView mo160236e() {
            return this.mNumberOfParticipantsTv;
        }

        @Override // com.ss.android.lark.message.vote.AbstractC45384a
        /* renamed from: f */
        public TextView mo160237f() {
            return this.mActualParticipantNumberTv;
        }

        @Override // com.ss.android.lark.message.vote.AbstractC45384a
        /* renamed from: g */
        public TextView mo160238g() {
            return this.mActionBtn;
        }

        @Override // com.ss.android.lark.message.vote.AbstractC45384a
        /* renamed from: h */
        public AbstractC45384a.AbstractC45386b mo160239h() {
            return this.f114987a;
        }

        @Override // com.ss.android.lark.message.vote.AbstractC45384a
        /* renamed from: i */
        public AbstractC45384a.AbstractC45385a mo160240i() {
            return this.f114988b;
        }

        /* renamed from: j */
        private void m180298j() {
            if (!DesktopUtil.m144307b()) {
                C25649b.m91857a(this.mSelectType, LarkFont.CAPTION0);
                C25649b.m91857a(this.mTitleTv, LarkFont.HEADLINE);
                C25649b.m91857a(this.mNumberOfParticipantsTv, LarkFont.CAPTION0);
                C25649b.m91857a(this.mActualParticipantNumberTv, LarkFont.CAPTION0);
                C25649b.m91857a(this.mActionBtn, LarkFont.BODY2);
                C25649b.m91853a(this.mVoteIcon, 16);
                ViewGroup.LayoutParams layoutParams = this.mActionBtn.getLayoutParams();
                layoutParams.height = LKUIDisplayManager.m91881c(this.mActionBtn.getContext(), 32);
                this.mActionBtn.setLayoutParams(layoutParams);
            }
        }

        /* renamed from: a */
        public void mo160256a(AbstractC45384a.AbstractC45385a aVar) {
            this.f114988b = aVar;
        }

        public VoteMessageViewHolder(View view) {
            ButterKnife.bind(this, view);
            m180298j();
        }

        /* renamed from: a */
        public void mo160257a(AbstractC45384a.AbstractC45386b bVar) {
            this.f114987a = bVar;
        }
    }

    /* Return type fixed from 'java.lang.Class' to match base method */
    @Override // com.ss.android.lark.chat.export.ui.message.IOpenMessageCell
    /* renamed from: a */
    public Class<VoteContentVO> mo120409a() {
        return VoteContentVO.class;
    }

    public class VoteMessageViewHolder_ViewBinding implements Unbinder {

        /* renamed from: a */
        private VoteMessageViewHolder f114989a;

        @Override // butterknife.Unbinder
        public void unbind() {
            VoteMessageViewHolder voteMessageViewHolder = this.f114989a;
            if (voteMessageViewHolder != null) {
                this.f114989a = null;
                voteMessageViewHolder.mTitleLayout = null;
                voteMessageViewHolder.mTitleTv = null;
                voteMessageViewHolder.mVoteIcon = null;
                voteMessageViewHolder.mSelectType = null;
                voteMessageViewHolder.mOptionsRv = null;
                voteMessageViewHolder.mNumberOfParticipantsTv = null;
                voteMessageViewHolder.mActualParticipantNumberTv = null;
                voteMessageViewHolder.mActionBtn = null;
                return;
            }
            throw new IllegalStateException("Bindings already cleared.");
        }

        public VoteMessageViewHolder_ViewBinding(VoteMessageViewHolder voteMessageViewHolder, View view) {
            this.f114989a = voteMessageViewHolder;
            voteMessageViewHolder.mTitleLayout = Utils.findRequiredView(view, R.id.title_layout, "field 'mTitleLayout'");
            voteMessageViewHolder.mTitleTv = (TextView) Utils.findRequiredViewAsType(view, R.id.title_tv, "field 'mTitleTv'", TextView.class);
            voteMessageViewHolder.mVoteIcon = Utils.findRequiredView(view, R.id.vote_icon, "field 'mVoteIcon'");
            voteMessageViewHolder.mSelectType = (TextView) Utils.findRequiredViewAsType(view, R.id.select_type_tv, "field 'mSelectType'", TextView.class);
            voteMessageViewHolder.mOptionsRv = (RecyclerView) Utils.findRequiredViewAsType(view, R.id.options_rv, "field 'mOptionsRv'", RecyclerView.class);
            voteMessageViewHolder.mNumberOfParticipantsTv = (TextView) Utils.findRequiredViewAsType(view, R.id.number_of_participants_tv, "field 'mNumberOfParticipantsTv'", TextView.class);
            voteMessageViewHolder.mActualParticipantNumberTv = (TextView) Utils.findRequiredViewAsType(view, R.id.actual_participant_number_tv, "field 'mActualParticipantNumberTv'", TextView.class);
            voteMessageViewHolder.mActionBtn = (TextView) Utils.findRequiredViewAsType(view, R.id.action_btn, "field 'mActionBtn'", TextView.class);
        }
    }

    public VoteMessageCell(IMessageContext aVar) {
        this.f114983c = aVar;
    }

    @Override // com.ss.android.lark.chat.export.ui.message.style.IOpenBubbleStyleProvider
    /* renamed from: a */
    public C34034b mo120408a(OpenMessageVO<VoteContentVO> cVar) {
        return C34034b.m131982a(UIHelper.dp2px(12.0f), 2);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ void m180283a(OpenMessageVO cVar, boolean z) {
        VoteHitPointNew.f114955a.mo160244a(cVar.mo121692b(), cVar.mo121681a(), cVar.mo121696d(), Message.Type.CARD);
    }

    @Override // com.ss.android.lark.chat.export.ui.message.IOpenMessageCell
    /* renamed from: a */
    public View mo120406a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (this.f114982b == null) {
            this.f114982b = C45389c.m180248a(layoutInflater.getContext()).mo160249a(true).mo160251b(true).mo160252c(true).mo160250a();
        }
        return layoutInflater.inflate(R.layout.vote_card_content_item_layout, viewGroup, false);
    }

    @Override // com.ss.android.lark.chat.export.ui.message.style.IOpenBubbleStyleProvider
    /* renamed from: a */
    public BubbleStyle mo120407a(OpenMessageVO<VoteContentVO> cVar, View view) {
        return BubbleStyle.m131964a((int) SmEvents.EVENT_NE_RR, view.findViewById(R.id.title_layout), new int[]{0, 0, 0, f114981a});
    }

    @Override // com.ss.android.lark.chat.export.ui.p1672b.AbstractC34028a
    /* renamed from: a */
    public /* bridge */ /* synthetic */ void mo120413a(List list, Object obj) {
        mo160253a((List<C34029b>) list, (OpenMenuDataHolder) obj);
    }

    /* renamed from: a */
    public boolean mo120415a(C34029b bVar, OpenMenuDataHolder<VoteContentVO> cVar) {
        if (bVar.f87966a == 9 || bVar.f87966a == 11 || bVar.f87966a == 25) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m180282a(OpenMessageVO cVar, String str, Map map) {
        C45377b.m180213a().mo160214a(str, cVar.mo121681a(), map, new UIGetDataCallback<C45381b>() {
            /* class com.ss.android.lark.message.vote.message.VoteMessageCell.C453941 */

            /* renamed from: a */
            public void onSuccessed(C45381b bVar) {
                Log.m165388i("vote action success");
            }

            @Override // com.larksuite.framework.callback.UIGetDataCallback
            public void onErrored(ErrorResult errorResult) {
                Log.m165382e("vote action fail:" + errorResult.toString());
            }
        });
        VoteHitPoint.Companion aVar = VoteHitPoint.f72953a;
        String valueOf = String.valueOf(map.size());
        boolean z = true;
        if (map.size() > 1) {
            z = false;
        }
        aVar.mo103335a(valueOf, z, str);
        VoteHitPointNew.f114955a.mo160244a(cVar.mo121692b(), cVar.mo121681a(), cVar.mo121696d(), Message.Type.CARD);
    }

    @Override // com.ss.android.lark.chat.export.ui.message.IOpenMessageCell
    /* renamed from: a */
    public void mo120411a(View view, int i, OpenMessageVO<VoteContentVO> cVar) {
        VoteContentVO g = cVar.mo121699g();
        if (g != null && g.mo160258a() != null) {
            final VoteMessageViewHolder voteMessageViewHolder = (VoteMessageViewHolder) view.getTag();
            if (voteMessageViewHolder == null) {
                voteMessageViewHolder = new VoteMessageViewHolder(view);
                view.setTag(voteMessageViewHolder);
            }
            voteMessageViewHolder.mo160257a(new AbstractC45384a.AbstractC45386b(cVar) {
                /* class com.ss.android.lark.message.vote.message.$$Lambda$VoteMessageCell$SirDlfcRiKctKFUL44CmWJZeZ8 */
                public final /* synthetic */ OpenMessageVO f$1;

                {
                    this.f$1 = r2;
                }

                @Override // com.ss.android.lark.message.vote.AbstractC45384a.AbstractC45386b
                public final void onVote(String str, Map map) {
                    VoteMessageCell.m270823lambda$SirDlfcRiKctKFUL44CmWJZeZ8(VoteMessageCell.this, this.f$1, str, map);
                }
            });
            voteMessageViewHolder.mo160256a(new AbstractC45384a.AbstractC45385a() {
                /* class com.ss.android.lark.message.vote.message.$$Lambda$VoteMessageCell$yS5iFU1nwWVEj0kh3EC7aujcGSA */

                @Override // com.ss.android.lark.message.vote.AbstractC45384a.AbstractC45385a
                public final void onItemSelected(boolean z) {
                    VoteMessageCell.lambda$yS5iFU1nwWVEj0kh3EC7aujcGSA(OpenMessageVO.this, z);
                }
            });
            new C45387b(g.mo160258a(), new AbstractC45376a() {
                /* class com.ss.android.lark.message.vote.message.VoteMessageCell.C453952 */

                @Override // com.ss.android.lark.message.service.AbstractC45376a
                /* renamed from: a */
                public void mo144083a() {
                }

                @Override // com.ss.android.lark.message.service.AbstractC45376a
                /* renamed from: a */
                public void mo144084a(C45293b bVar) {
                    VoteMessageCell.this.f114982b.mo160247a(voteMessageViewHolder, bVar);
                }
            }).mo160245a();
        }
    }
}
