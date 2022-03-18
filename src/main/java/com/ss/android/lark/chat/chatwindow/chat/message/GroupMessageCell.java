package com.ss.android.lark.chat.chatwindow.chat.message;

import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.larksuite.component.ui.avatar.AvatarType;
import com.larksuite.component.ui.avatar.FeedAvatarModel;
import com.larksuite.component.ui.avatar.LarkAvatar;
import com.larksuite.component.ui.badge.miniicon.MiniIconModel;
import com.larksuite.component.ui.display.manager.C25649b;
import com.larksuite.component.ui.display.manager.LKUIDisplayManager;
import com.larksuite.component.ui.display.manager.LarkFont;
import com.larksuite.component.ui.tag.LarkNameTag;
import com.larksuite.component.universe_design.button.UDButton;
import com.larksuite.suite.R;
import com.ss.android.lark.appreciablelib.Scene;
import com.ss.android.lark.chat.base.view.vo.message.ShareGroupChatContentVO;
import com.ss.android.lark.chat.chatwindow.chat.message.GroupMessageCell;
import com.ss.android.lark.chat.entity.chat.Chat;
import com.ss.android.lark.chat.entity.chatter.TagInfo;
import com.ss.android.lark.chat.entity.message.Message;
import com.ss.android.lark.chat.utils.C34336c;
import com.ss.android.lark.chat.vo.AbsMessageVO;
import com.ss.android.lark.desktopmode.utils.DesktopUtil;
import com.ss.android.lark.share_group.C54821f;
import com.ss.android.lark.statistics.chat.ChatHitPointNew;
import com.ss.android.lark.statistics.thread.ThreadTopicHitPointNew;
import com.ss.android.lark.threaddetail.view.message.C55934b;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.lark.widget.recyclerview.hive.AbstractC59010e;

public class GroupMessageCell extends AbstractC33290a<ShareGroupChatContentVO, GroupMessageViewHolder> {

    /* renamed from: a */
    private final int f85636a;

    /* renamed from: b */
    private final int f85637b;

    @Override // com.ss.android.lark.widget.recyclerview.hive.AbstractC59004b
    /* renamed from: c */
    public int mo122651c() {
        return R.layout.share_group_chat_content_item;
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.widget.recyclerview.hive.AbstractC59004b
    /* renamed from: a */
    public Class mo122646a() {
        return ShareGroupChatContentVO.class;
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.widget.recyclerview.hive.AbstractC59004b
    /* renamed from: b */
    public Class<GroupMessageViewHolder> mo122650b() {
        return GroupMessageViewHolder.class;
    }

    public class GroupMessageViewHolder_ViewBinding implements Unbinder {

        /* renamed from: a */
        private GroupMessageViewHolder f85641a;

        @Override // butterknife.Unbinder
        public void unbind() {
            GroupMessageViewHolder groupMessageViewHolder = this.f85641a;
            if (groupMessageViewHolder != null) {
                this.f85641a = null;
                groupMessageViewHolder.mAvator = null;
                groupMessageViewHolder.mGroupChatTitle = null;
                groupMessageViewHolder.mGroupChatDescription = null;
                groupMessageViewHolder.mGroupChatJoin = null;
                groupMessageViewHolder.mGroupChatHint = null;
                groupMessageViewHolder.mGroupChatcontentUp = null;
                groupMessageViewHolder.mGroupChatcontentRoot = null;
                return;
            }
            throw new IllegalStateException("Bindings already cleared.");
        }

        public GroupMessageViewHolder_ViewBinding(GroupMessageViewHolder groupMessageViewHolder, View view) {
            this.f85641a = groupMessageViewHolder;
            groupMessageViewHolder.mAvator = (ImageView) Utils.findRequiredViewAsType(view, R.id.iv_avator, "field 'mAvator'", ImageView.class);
            groupMessageViewHolder.mGroupChatTitle = (TextView) Utils.findRequiredViewAsType(view, R.id.tv_group_chat_title, "field 'mGroupChatTitle'", TextView.class);
            groupMessageViewHolder.mGroupChatDescription = (TextView) Utils.findRequiredViewAsType(view, R.id.tv_group_chat_description, "field 'mGroupChatDescription'", TextView.class);
            groupMessageViewHolder.mGroupChatJoin = (UDButton) Utils.findRequiredViewAsType(view, R.id.bt_group_chat_join, "field 'mGroupChatJoin'", UDButton.class);
            groupMessageViewHolder.mGroupChatHint = (TextView) Utils.findRequiredViewAsType(view, R.id.group_card_tv, "field 'mGroupChatHint'", TextView.class);
            groupMessageViewHolder.mGroupChatcontentUp = Utils.findRequiredView(view, R.id.top_part_layout, "field 'mGroupChatcontentUp'");
            groupMessageViewHolder.mGroupChatcontentRoot = Utils.findRequiredView(view, R.id.group_chat_content_root, "field 'mGroupChatcontentRoot'");
        }
    }

    public static class GroupMessageViewHolder extends AbstractC59010e {
        @BindView(7902)
        public ImageView mAvator;
        @BindView(9116)
        public TextView mGroupChatDescription;
        @BindView(7779)
        public TextView mGroupChatHint;
        @BindView(7303)
        public UDButton mGroupChatJoin;
        @BindView(9117)
        public TextView mGroupChatTitle;
        @BindView(7780)
        public View mGroupChatcontentRoot;
        @BindView(9051)
        public View mGroupChatcontentUp;

        /* renamed from: a */
        private void m128700a() {
            if (!DesktopUtil.m144307b()) {
                C25649b.m91853a(this.mAvator, 40);
                C25649b.m91857a(this.mGroupChatTitle, LarkFont.HEADLINE);
                C25649b.m91857a(this.mGroupChatDescription, LarkFont.CAPTION0);
                C25649b.m91857a(this.mGroupChatJoin, LarkFont.BODY1);
                C25649b.m91857a(this.mGroupChatHint, LarkFont.BODY1);
                ViewGroup.LayoutParams layoutParams = this.mGroupChatJoin.getLayoutParams();
                layoutParams.height = LKUIDisplayManager.m91881c(this.mGroupChatJoin.getContext(), 28);
                this.mGroupChatJoin.setLayoutParams(layoutParams);
            }
        }

        /* access modifiers changed from: protected */
        @Override // com.ss.android.lark.widget.recyclerview.hive.AbstractC59010e
        /* renamed from: a */
        public void mo122652a(View view) {
            ButterKnife.bind(this, view);
            m128700a();
        }
    }

    public GroupMessageCell(AbstractC33342d dVar) {
        this(dVar, 0, 0);
    }

    /* renamed from: a */
    private void m128692a(GroupMessageViewHolder groupMessageViewHolder, Chat chat) {
        if (chat.isCrossWithKa()) {
            TagInfo c = TagInfo.getFactory().mo124881c(mo122719d());
            LarkNameTag.Builder bVar = new LarkNameTag.Builder(mo122719d());
            TagInfo.apply(bVar, c);
            bVar.mo90027e().mo90004a(groupMessageViewHolder.mGroupChatTitle);
        } else if (chat.isEdu()) {
            TagInfo a = TagInfo.getFactory().mo124879a(mo122719d());
            LarkNameTag.Builder bVar2 = new LarkNameTag.Builder(mo122719d());
            TagInfo.apply(bVar2, a);
            bVar2.mo90020a(false, false, false);
            bVar2.mo90027e().mo90004a(groupMessageViewHolder.mGroupChatTitle);
        } else {
            new LarkNameTag.ChatterTagBuilder(this.f85789d.mo122543g()).mo90051i(chat.isCrossTenant()).mo90027e().mo90004a(groupMessageViewHolder.mGroupChatTitle);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo122649a(GroupMessageViewHolder groupMessageViewHolder, final AbsMessageVO<ShareGroupChatContentVO> aVar) {
        Scene scene;
        MiniIconModel eVar;
        super.mo122648a((AbstractC59010e) groupMessageViewHolder, (AbsMessageVO) aVar);
        groupMessageViewHolder.mGroupChatcontentRoot.getLayoutParams().width = -1;
        ShareGroupChatContentVO g = aVar.mo121699g();
        if (g != null && g.mo121888a() != null) {
            Drawable drawable = null;
            groupMessageViewHolder.mGroupChatcontentRoot.setBackground(null);
            final Chat a = g.mo121888a();
            String avatarKey = a.getAvatarKey();
            String entityId = a.getEntityId();
            if (LarkAvatar.m91600a()) {
                FeedAvatarModel gVar = new FeedAvatarModel();
                gVar.mo89008b(avatarKey);
                gVar.mo89011c(entityId);
                if (a.isThread()) {
                    eVar = new MiniIconModel(AvatarType.THRED);
                } else {
                    eVar = null;
                }
                LarkAvatar.m91597a(mo122719d()).mo89065a(gVar).mo89064a(eVar).mo89066a(groupMessageViewHolder.mAvator);
            } else {
                if (a.isSecret()) {
                    scene = Scene.SecretChat;
                } else if (a.isThread()) {
                    scene = Scene.Thread;
                } else {
                    scene = Scene.Chat;
                }
                C34336c.m133130a(mo122719d(), groupMessageViewHolder.mAvator, avatarKey, entityId, UIHelper.dp2px(40.0f), UIHelper.dp2px(40.0f), scene);
            }
            String description = a.getDescription();
            if (TextUtils.isEmpty(description)) {
                groupMessageViewHolder.mGroupChatTitle.setMaxLines(2);
                groupMessageViewHolder.mGroupChatDescription.setVisibility(8);
            } else {
                groupMessageViewHolder.mGroupChatTitle.setMaxLines(1);
                groupMessageViewHolder.mGroupChatDescription.setVisibility(0);
                groupMessageViewHolder.mGroupChatDescription.setText(description);
            }
            groupMessageViewHolder.mGroupChatTitle.setText(a.getName());
            m128692a(groupMessageViewHolder, a);
            if (this.f85789d.mo122558v()) {
                groupMessageViewHolder.mGroupChatcontentUp.setBackgroundResource(R.drawable.group_message_cell_header_bg);
            }
            Message message = new Message();
            message.setType(aVar.mo121710r());
            message.setMessageContent(g.mo126168z());
            message.setId(aVar.mo121681a());
            C54821f.m212665a(mo122719d(), groupMessageViewHolder.mGroupChatJoin, groupMessageViewHolder.mGroupChatHint, message, 0, new View.OnClickListener() {
                /* class com.ss.android.lark.chat.chatwindow.chat.message.GroupMessageCell.View$OnClickListenerC332651 */

                public void onClick(View view) {
                    if (GroupMessageCell.this.f85789d.mo122560x() && (GroupMessageCell.this.f85789d instanceof C55934b)) {
                        C55934b bVar = (C55934b) GroupMessageCell.this.f85789d;
                        ThreadTopicHitPointNew.f135908b.mo187753a(bVar.mo122550n(), bVar.mo190684a(), "msg", "none", ThreadTopicHitPointNew.f135908b.mo187748a(aVar, "shareGroupChat", (String) null, (String) null));
                    } else if (!GroupMessageCell.this.f85789d.mo122559w()) {
                        ChatHitPointNew.f135660c.mo187384a(a, "shareGroupChat", ChatHitPointNew.f135660c.mo187391b("shareGroupChat"), ChatHitPointNew.f135660c.mo187378a(aVar, (String) null, (String) null));
                    }
                }
            });
            C54821f.m212662a(mo122719d(), groupMessageViewHolder.mGroupChatcontentUp, message);
            $$Lambda$GroupMessageCell$jYXIqYrhAAVe4sxpaVfhPeSXL7Q r0 = new View.OnLongClickListener(groupMessageViewHolder, aVar) {
                /* class com.ss.android.lark.chat.chatwindow.chat.message.$$Lambda$GroupMessageCell$jYXIqYrhAAVe4sxpaVfhPeSXL7Q */
                public final /* synthetic */ GroupMessageCell.GroupMessageViewHolder f$1;
                public final /* synthetic */ AbsMessageVO f$2;

                {
                    this.f$1 = r2;
                    this.f$2 = r3;
                }

                public final boolean onLongClick(View view) {
                    return GroupMessageCell.lambda$jYXIqYrhAAVe4sxpaVfhPeSXL7Q(GroupMessageCell.this, this.f$1, this.f$2, view);
                }
            };
            groupMessageViewHolder.mGroupChatcontentUp.setOnLongClickListener(r0);
            groupMessageViewHolder.mGroupChatcontentRoot.setOnLongClickListener(r0);
            View view = groupMessageViewHolder.mGroupChatcontentRoot;
            if (this.f85637b != 0) {
                drawable = this.f85789d.mo122543g().getDrawable(this.f85637b);
            }
            view.setBackground(drawable);
            View view2 = groupMessageViewHolder.mGroupChatcontentRoot;
            int i = this.f85636a;
            view2.setPadding(i, i, i, i);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ boolean m128693a(GroupMessageViewHolder groupMessageViewHolder, AbsMessageVO aVar, View view) {
        return mo122755b(groupMessageViewHolder, aVar);
    }

    public GroupMessageCell(AbstractC33342d dVar, int i, int i2) {
        super(dVar);
        this.f85636a = i;
        this.f85637b = i2;
    }
}
