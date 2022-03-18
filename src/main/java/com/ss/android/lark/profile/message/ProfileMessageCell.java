package com.ss.android.lark.profile.message;

import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.larksuite.component.ui.display.manager.C25649b;
import com.larksuite.component.ui.imageview.LKUIRoundedImageView;
import com.larksuite.framework.utils.DeviceUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.biz.core.api.ContactSource;
import com.ss.android.lark.chat.entity.chatter.Chatter;
import com.ss.android.lark.chat.entity.message.Message;
import com.ss.android.lark.chat.export.ui.menu.OpenMenuDataHolder;
import com.ss.android.lark.chat.export.ui.message.IMessageContext;
import com.ss.android.lark.chat.export.ui.message.IOpenCellCallback;
import com.ss.android.lark.chat.export.ui.message.IOpenMessageCell;
import com.ss.android.lark.chat.export.ui.message.style.BubbleStyle;
import com.ss.android.lark.chat.export.ui.message.style.C34034b;
import com.ss.android.lark.chat.export.ui.message.style.C34035c;
import com.ss.android.lark.chat.export.ui.message.style.IOpenBubbleStyleProvider;
import com.ss.android.lark.chat.export.ui.p1672b.C34029b;
import com.ss.android.lark.chat.export.vo.OpenMessageVO;
import com.ss.android.lark.desktopmode.utils.DesktopUtil;
import com.ss.android.lark.profile.C52239a;
import com.ss.android.lark.profile.dependency.IProfileModuleDependency;
import com.ss.android.lark.profile.dto.ProfileLoadParams;
import com.ss.android.lark.profile.service.C52904e;
import com.ss.android.lark.profile.statistics.ProfileHitPointNew;
import com.ss.android.lark.ui.p2892a.C57582a;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.lark.widget.listener.OnSingleClickListener;
import java.util.List;

public class ProfileMessageCell implements IOpenMessageCell<ProfileContentVO>, IOpenBubbleStyleProvider<ProfileContentVO> {

    /* renamed from: b */
    private static final int f130675b = UIHelper.dp2px(12.0f);

    /* renamed from: c */
    private static final int f130676c = UIHelper.dp2px(8.0f);

    /* renamed from: d */
    private static int f130677d = UIHelper.dp2px((float) DeviceUtils.getDpFromDimenXml(UIHelper.getContext(), R.dimen.avatar_width_chatter));

    /* renamed from: a */
    public final IOpenCellCallback<ProfileContentVO> f130678a;

    /* renamed from: e */
    private final IMessageContext f130679e;

    /* renamed from: f */
    private IProfileModuleDependency.AbstractC52251f f130680f = C52239a.m202617d().mo133585o();

    @Override // com.ss.android.lark.chat.export.ui.message.IOpenMessageCell
    /* renamed from: a */
    public void mo120410a(View view) {
    }

    /* renamed from: a */
    public void mo180479a(List<C34029b> list, OpenMenuDataHolder<ProfileContentVO> cVar) {
    }

    @Override // com.ss.android.lark.chat.export.ui.message.IOpenMessageCell
    /* renamed from: a */
    public Class<ProfileContentVO> mo120409a() {
        return ProfileContentVO.class;
    }

    /* access modifiers changed from: package-private */
    public static class ProfileViewHolder {

        /* renamed from: a */
        public View f130687a;
        @BindView(6635)
        public LKUIRoundedImageView mAvatarIV;
        @BindView(6716)
        public TextView mChatterNameTV;
        @BindView(7501)
        public TextView mTagTV;

        /* renamed from: a */
        private void m204573a() {
            if (!DesktopUtil.m144307b()) {
                C25649b.m91853a(this.mAvatarIV, 40);
                C25649b.m91856a(this.mChatterNameTV, 16);
                C25649b.m91856a(this.mTagTV, 14);
            }
        }

        public ProfileViewHolder(View view) {
            this.f130687a = view;
            ButterKnife.bind(this, view);
            m204573a();
        }
    }

    public class ProfileViewHolder_ViewBinding implements Unbinder {

        /* renamed from: a */
        private ProfileViewHolder f130688a;

        @Override // butterknife.Unbinder
        public void unbind() {
            ProfileViewHolder profileViewHolder = this.f130688a;
            if (profileViewHolder != null) {
                this.f130688a = null;
                profileViewHolder.mAvatarIV = null;
                profileViewHolder.mChatterNameTV = null;
                profileViewHolder.mTagTV = null;
                return;
            }
            throw new IllegalStateException("Bindings already cleared.");
        }

        public ProfileViewHolder_ViewBinding(ProfileViewHolder profileViewHolder, View view) {
            this.f130688a = profileViewHolder;
            profileViewHolder.mAvatarIV = (LKUIRoundedImageView) Utils.findRequiredViewAsType(view, R.id.avatar_iv, "field 'mAvatarIV'", LKUIRoundedImageView.class);
            profileViewHolder.mChatterNameTV = (TextView) Utils.findRequiredViewAsType(view, R.id.chatter_name_tv, "field 'mChatterNameTV'", TextView.class);
            profileViewHolder.mTagTV = (TextView) Utils.findRequiredViewAsType(view, R.id.profile_tag_tv, "field 'mTagTV'", TextView.class);
        }
    }

    /* renamed from: c */
    private void m204559c(OpenMessageVO<ProfileContentVO> cVar) {
        ProfileHitPointNew.f130740b.mo180543a(cVar.mo121692b(), cVar.mo121681a(), cVar.mo121681a(), Message.Type.SHARE_USER_CARD);
    }

    @Override // com.ss.android.lark.chat.export.ui.message.style.IOpenBubbleStyleProvider
    /* renamed from: a */
    public C34034b mo120408a(OpenMessageVO<ProfileContentVO> cVar) {
        int i = f130675b;
        return C34034b.m131983a(i, 0, i, 0, false, 2);
    }

    @Override // com.ss.android.lark.chat.export.ui.message.style.IOpenBubbleStyleProvider
    /* renamed from: b */
    public C34035c mo120416b(OpenMessageVO<ProfileContentVO> cVar) {
        int d = C57582a.m223616d(this.f130679e.mo122543g(), R.color.text_caption);
        int d2 = C57582a.m223616d(this.f130679e.mo122543g(), R.color.text_caption);
        Drawable c = C57582a.m223614c(this.f130679e.mo122543g(), R.drawable.chat_bubble_reply_mark_bg);
        int i = f130675b;
        return C34035c.m131992a(d, d2, c, new int[]{i, f130676c, i, 0});
    }

    @Override // com.ss.android.lark.chat.export.ui.message.IOpenMessageCell
    /* renamed from: a */
    public View mo120406a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return layoutInflater.inflate(R.layout.profile_content_item, viewGroup, false);
    }

    public ProfileMessageCell(IMessageContext aVar, IOpenCellCallback<ProfileContentVO> bVar) {
        this.f130679e = aVar;
        this.f130678a = bVar;
    }

    @Override // com.ss.android.lark.chat.export.ui.message.style.IOpenBubbleStyleProvider
    /* renamed from: a */
    public BubbleStyle mo120407a(OpenMessageVO<ProfileContentVO> cVar, View view) {
        return BubbleStyle.m131964a(14, view.findViewById(R.id.profile_message_cell_header), new int[]{0, 0, 0, f130675b});
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo180481b(ProfileViewHolder profileViewHolder, OpenMessageVO<ProfileContentVO> cVar) {
        ProfileContentVO g = cVar.mo121699g();
        if (g.mo180486c() != Chatter.ChatterType.BOT) {
            C52904e.m204638a().mo105573a(this.f130679e.mo122543g(), g.mo180483a(), cVar.mo121692b(), new ContactSource.C29531a().mo104726a(7).mo104727a(g.mo180488e()).mo104731d(g.mo180483a()).mo104728a());
        } else {
            C52904e.m204638a().mo105585c(this.f130679e.mo122543g(), g.mo180483a());
        }
        m204559c(cVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo180478a(final ProfileViewHolder profileViewHolder, final OpenMessageVO<ProfileContentVO> cVar) {
        ProfileContentVO g = cVar.mo121699g();
        profileViewHolder.mChatterNameTV.setText(g.mo180485b());
        this.f130680f.mo133596a(this.f130679e.mo122543g(), profileViewHolder.mAvatarIV, g.mo180487d(), g.mo180483a(), new ProfileLoadParams().mo178889a(f130677d).mo178894b(f130677d));
        profileViewHolder.f130687a.setOnClickListener(new OnSingleClickListener() {
            /* class com.ss.android.lark.profile.message.ProfileMessageCell.C528771 */

            @Override // com.ss.android.lark.widget.listener.OnSingleClickListener
            public void onSingleClick(View view) {
                ProfileMessageCell.this.mo180481b(profileViewHolder, cVar);
            }
        });
        profileViewHolder.f130687a.setOnLongClickListener(new View.OnLongClickListener() {
            /* class com.ss.android.lark.profile.message.ProfileMessageCell.View$OnLongClickListenerC528782 */

            public boolean onLongClick(View view) {
                if (ProfileMessageCell.this.f130678a != null) {
                    return ProfileMessageCell.this.f130678a.mo122833b(profileViewHolder.f130687a, cVar);
                }
                return false;
            }
        });
        if (this.f130679e.mo122558v()) {
            int dp2px = UIHelper.dp2px(1.0f);
            profileViewHolder.f130687a.setPadding(dp2px, dp2px, dp2px, f130676c);
            profileViewHolder.f130687a.findViewById(R.id.profile_message_cell_header).setBackgroundResource(R.drawable.profile_message_cell_header_bg);
            profileViewHolder.f130687a.setBackgroundResource(R.drawable.profile_message_cell_bg);
        }
    }

    @Override // com.ss.android.lark.chat.export.ui.p1672b.AbstractC34028a
    /* renamed from: a */
    public /* bridge */ /* synthetic */ void mo120413a(List list, Object obj) {
        mo180479a((List<C34029b>) list, (OpenMenuDataHolder) obj);
    }

    /* renamed from: a */
    public boolean mo120415a(C34029b bVar, OpenMenuDataHolder<ProfileContentVO> cVar) {
        if (bVar.f87966a == 11 || bVar.f87966a == 25 || bVar.f87966a == 8) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.lark.chat.export.ui.message.IOpenMessageCell
    /* renamed from: a */
    public void mo120411a(View view, int i, OpenMessageVO<ProfileContentVO> cVar) {
        ProfileViewHolder profileViewHolder = (ProfileViewHolder) view.getTag();
        if (profileViewHolder == null) {
            profileViewHolder = new ProfileViewHolder(view);
            view.setTag(profileViewHolder);
        }
        mo180478a(profileViewHolder, cVar);
    }
}
