package com.ss.android.lark.chatsetting.impl.group.info;

import android.content.Context;
import android.content.DialogInterface;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import butterknife.BindView;
import com.larksuite.component.ui.imageview.LKUIRoundedImageView2;
import com.larksuite.component.universe_design.dialog.UDDialogBuilder;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.chat.entity.chat.Chat;
import com.ss.android.lark.chatsetting.ChatSettingModule;
import com.ss.android.lark.chatsetting.impl.C34501a;
import com.ss.android.lark.chatsetting.impl.group.info.C34619c;
import com.ss.android.lark.chatsetting.impl.statistics.ChatSettingExtraParams;
import com.ss.android.lark.chatsetting.impl.statistics.ChatSettingHitPointNew;
import com.ss.android.lark.chatsetting.impl.statistics.group.GroupHitPoint;
import com.ss.android.lark.desktopmode.utils.DesktopUtil;
import com.ss.android.lark.team.entity.Team;
import com.ss.android.lark.ui.CommonTitleBar;
import com.ss.android.lark.ui.CommonTitleBarConstants;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.lark.widget.photo_picker.C58630d;
import java.util.ArrayList;
import java.util.List;

public class GroupInfoView implements C34619c.AbstractC34622b {

    /* renamed from: a */
    public AbstractC34610a f89359a;

    /* renamed from: b */
    public C34619c.AbstractC34622b.AbstractC34623a f89360b;

    /* renamed from: c */
    private Context f89361c;

    /* renamed from: d */
    private boolean f89362d;

    /* renamed from: e */
    private boolean f89363e = C34501a.m133933a();

    /* renamed from: f */
    private boolean f89364f = C34501a.m133933a();
    @BindView(6456)
    View mBindTeamLayout;
    @BindView(6457)
    TextView mBindTeamName;
    @BindView(6885)
    ImageView mGroupDescArrowIV;
    @BindView(7624)
    TextView mGroupDescTv;
    @BindView(6980)
    View mGroupDescribeRegion;
    @BindView(7642)
    TextView mGroupDescribeTV;
    @BindView(6884)
    ImageView mGroupNameArrowIV;
    @BindView(7645)
    TextView mGroupNameDescTv;
    @BindView(7315)
    View mGroupNameRegion;
    @BindView(7644)
    TextView mGroupNameTV;
    @BindView(6883)
    ImageView mGroupPhotoArrowIV;
    @BindView(7647)
    TextView mGroupPhotoDescTv;
    @BindView(6876)
    LKUIRoundedImageView2 mGroupPhotoIV;
    @BindView(7316)
    RelativeLayout mGroupPhotoRegion;
    @BindView(6983)
    RelativeLayout mGroupQRCodeRegion;
    @BindView(7669)
    TextView mQrcodeDescTv;
    @BindView(7600)
    CommonTitleBar mTitleBar;
    @BindView(7720)
    TextView mUnbindActionTip;

    /* renamed from: com.ss.android.lark.chatsetting.impl.group.info.GroupInfoView$a */
    public interface AbstractC34610a {
        /* renamed from: a */
        void mo127874a();

        /* renamed from: a */
        void mo127875a(Chat chat);

        /* renamed from: a */
        void mo127876a(GroupInfoView groupInfoView);

        /* renamed from: a */
        void mo127877a(String str);

        /* renamed from: a */
        void mo127878a(String str, int i);
    }

    @Override // com.ss.android.lark.chatsetting.impl.group.info.C34619c.AbstractC34622b
    /* renamed from: a */
    public void mo127864a(boolean z, Chat chat, List<String> list) {
        if (z) {
            String str = list.size() > 0 ? list.get(0) : "";
            if (chat.isThread()) {
                ChatSettingModule.m133639a().mo127267a(this.f89361c, chat.getId(), str, this.mGroupPhotoIV);
            } else {
                ChatSettingModule.m133639a().mo127286p().mo127299a(this.f89361c, chat.getId(), str, chat.getEntityId(), this.mGroupPhotoIV);
            }
        } else {
            ArrayList arrayList = new ArrayList();
            arrayList.add(chat.getEntityId());
            C58630d.m227374a(this.f89361c, list, (List<String>) arrayList, 0, (View) this.mGroupPhotoIV, false);
        }
    }

    @Override // com.ss.android.lark.chatsetting.impl.group.info.C34619c.AbstractC34622b
    /* renamed from: a */
    public void mo127861a(Chat chat, boolean z, String str) {
        this.f89362d = chat != null && chat.isThread();
        this.mTitleBar.setMainTitleColor(UIUtils.getColor(this.f89361c, R.color.text_title));
        if (this.f89362d) {
            this.mTitleBar.setTitle(UIHelper.getString(R.string.Lark_Groups_ChannelInfo));
        } else {
            this.mTitleBar.setTitle(UIHelper.getString(R.string.Lark_Legacy_GroupInfo));
        }
        mo127866b(chat, z, str);
        this.mUnbindActionTip.setOnClickListener(new View.OnClickListener() {
            /* class com.ss.android.lark.chatsetting.impl.group.info.GroupInfoView.View$OnClickListenerC346072 */

            public void onClick(View view) {
                GroupInfoView.this.mo127858a();
                ChatSettingHitPointNew.m136623a(ChatSettingHitPointNew.GroupManageParam.UNBINDING_TEAM);
            }
        });
    }

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void destroy() {
        this.f89359a = null;
        this.f89360b = null;
    }

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void create() {
        this.f89359a.mo127876a(this);
        this.mTitleBar.setLeftClickListener(new View.OnClickListener() {
            /* class com.ss.android.lark.chatsetting.impl.group.info.GroupInfoView.View$OnClickListenerC346061 */

            public void onClick(View view) {
                GroupInfoView.this.f89359a.mo127874a();
            }
        });
        if (DesktopUtil.m144307b()) {
            this.mTitleBar.setLeftImageResource(CommonTitleBarConstants.ICON_CLOSE);
        }
        ChatSettingHitPointNew.m136629b();
    }

    /* renamed from: a */
    public void mo127858a() {
        ((UDDialogBuilder) ((UDDialogBuilder) ((UDDialogBuilder) ((UDDialogBuilder) new UDDialogBuilder(this.f89361c).title(R.string.Project_T_ToastSureToUnlink)).message(R.string.Project_T_TeamGroupUnlinkRelation)).addActionButton(R.id.ud_dialog_btn_primary, R.string.Project_MV_UnlinkButton, new DialogInterface.OnClickListener() {
            /* class com.ss.android.lark.chatsetting.impl.group.info.GroupInfoView.DialogInterface$OnClickListenerC346094 */

            public void onClick(DialogInterface dialogInterface, int i) {
                GroupInfoView.this.f89360b.mo127902b();
                ChatSettingHitPointNew.m136628a(true);
            }
        })).addActionButton(R.id.ud_dialog_btn_secondary, R.string.Project_MV_CancelButton, new DialogInterface.OnClickListener() {
            /* class com.ss.android.lark.chatsetting.impl.group.info.GroupInfoView.DialogInterface$OnClickListenerC346083 */

            public void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.dismiss();
                ChatSettingHitPointNew.m136628a(false);
            }
        })).show();
    }

    /* renamed from: a */
    public void setViewDelegate(C34619c.AbstractC34622b.AbstractC34623a aVar) {
        this.f89360b = aVar;
    }

    @Override // com.ss.android.lark.chatsetting.impl.group.info.C34619c.AbstractC34622b
    /* renamed from: c */
    public void mo127869c(String str) {
        this.f89359a.mo127877a(str);
    }

    @Override // com.ss.android.lark.chatsetting.impl.group.info.C34619c.AbstractC34622b
    /* renamed from: a */
    public void mo127863a(String str) {
        if (!TextUtils.isEmpty(str)) {
            this.mGroupNameDescTv.setText(str);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m134457a(View view) {
        ChatSettingHitPointNew.m136632c(ChatSettingExtraParams.Click.GROUP_AVATAR.plus(ChatSettingExtraParams.Target.IM_EDIT_GROUP_AVATAR_VIEW));
        this.f89360b.mo127901a();
    }

    @Override // com.ss.android.lark.chatsetting.impl.group.info.C34619c.AbstractC34622b
    /* renamed from: b */
    public void mo127867b(String str) {
        if (!TextUtils.isEmpty(str)) {
            this.mGroupDescribeTV.setText(str);
        }
    }

    public GroupInfoView(Context context, AbstractC34610a aVar) {
        this.f89361c = context;
        this.f89359a = aVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m134458a(Chat chat, View view) {
        GroupHitPoint.f90519a.mo129238f();
        if (chat.isEdu()) {
            GroupHitPoint.f90519a.mo129215a(false);
        }
        ChatSettingHitPointNew.m136632c(ChatSettingExtraParams.Click.GROUP_QR.plus(ChatSettingExtraParams.Target.IM_GROUP_QR_VIEW));
        GroupHitPoint.f90519a.mo129210a(chat, "qr_code_cell");
        this.f89359a.mo127875a(chat);
    }

    /* renamed from: b */
    private void m134461b(Chat chat, String str) {
        int i;
        String str2;
        RelativeLayout relativeLayout = this.mGroupQRCodeRegion;
        if (m134460a(chat, str)) {
            i = 0;
        } else {
            i = 8;
        }
        relativeLayout.setVisibility(i);
        TextView textView = this.mQrcodeDescTv;
        if (this.f89362d) {
            str2 = UIUtils.getString(this.f89361c, R.string.Lark_Groups_GroupInfoGroupQrCode);
        } else {
            str2 = UIUtils.getString(this.f89361c, R.string.Lark_Legacy_QrCode);
        }
        textView.setText(str2);
        this.mGroupQRCodeRegion.setOnClickListener(new View.OnClickListener(chat) {
            /* class com.ss.android.lark.chatsetting.impl.group.info.$$Lambda$GroupInfoView$Mq2d7dtao4zML4bn8usUgKgi38 */
            public final /* synthetic */ Chat f$1;

            {
                this.f$1 = r2;
            }

            public final void onClick(View view) {
                GroupInfoView.m270431lambda$Mq2d7dtao4zML4bn8usUgKgi38(GroupInfoView.this, this.f$1, view);
            }
        });
    }

    /* renamed from: c */
    public void mo127868c(Chat chat, boolean z) {
        int i;
        if (chat.isSecret()) {
            this.mGroupDescribeRegion.setVisibility(8);
            this.mGroupNameRegion.setBackgroundResource(R.drawable.bg_setting_group_item_round_bottom);
            return;
        }
        String description = chat.getDescription();
        if (TextUtils.isEmpty(description)) {
            if (this.f89362d) {
                description = UIHelper.getString(R.string.Lark_Groups_DescriptionEmpty);
            } else {
                description = UIHelper.getString(R.string.Lark_Legacy_EmptyDescription);
            }
        }
        this.mGroupDescribeTV.setText(description);
        if (this.f89362d) {
            this.mGroupDescTv.setText(UIHelper.getString(R.string.Lark_Groups_Description));
        } else {
            this.mGroupDescTv.setText(UIHelper.getString(R.string.Lark_Legacy_GroupDescription));
        }
        ImageView imageView = this.mGroupDescArrowIV;
        if (z) {
            i = 0;
        } else {
            i = 4;
        }
        imageView.setVisibility(i);
        this.mGroupDescribeRegion.setOnClickListener(new View.OnClickListener(z, chat) {
            /* class com.ss.android.lark.chatsetting.impl.group.info.$$Lambda$GroupInfoView$M3SIPQg9Y_K9g9gRtCqbS52fNWA */
            public final /* synthetic */ boolean f$1;
            public final /* synthetic */ Chat f$2;

            {
                this.f$1 = r2;
                this.f$2 = r3;
            }

            public final void onClick(View view) {
                GroupInfoView.lambda$M3SIPQg9Y_K9g9gRtCqbS52fNWA(GroupInfoView.this, this.f$1, this.f$2, view);
            }
        });
    }

    /* renamed from: a */
    private boolean m134460a(Chat chat, String str) {
        if (chat.isSecret()) {
            return false;
        }
        if (chat.isTeam() && this.f89364f) {
            return false;
        }
        if (!C34501a.m133936b(chat) && chat.getShareCardPermission() != Chat.ShareCardPermission.ALLOWED) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    public void mo127865b(Chat chat, boolean z) {
        int i;
        if (!TextUtils.isEmpty(chat.getName())) {
            this.mGroupNameTV.setText(chat.getName());
        }
        if (this.f89362d) {
            this.mGroupNameDescTv.setText(UIUtils.getString(this.f89361c, R.string.Lark_Groups_GroupName));
        } else {
            this.mGroupNameDescTv.setText(UIUtils.getString(this.f89361c, R.string.Lark_Legacy_GroupName));
        }
        if (!z || !TextUtils.isEmpty(chat.getOnCallId())) {
            i = 4;
        } else {
            i = 0;
        }
        this.mGroupNameArrowIV.setVisibility(i);
        this.mGroupNameRegion.setOnClickListener(new View.OnClickListener(z, chat) {
            /* class com.ss.android.lark.chatsetting.impl.group.info.$$Lambda$GroupInfoView$Eyx6Uys1kdMnZSn2iLBWSQOwWq4 */
            public final /* synthetic */ boolean f$1;
            public final /* synthetic */ Chat f$2;

            {
                this.f$1 = r2;
                this.f$2 = r3;
            }

            public final void onClick(View view) {
                GroupInfoView.lambda$Eyx6Uys1kdMnZSn2iLBWSQOwWq4(GroupInfoView.this, this.f$1, this.f$2, view);
            }
        });
    }

    @Override // com.ss.android.lark.chatsetting.impl.group.info.C34619c.AbstractC34622b
    /* renamed from: a */
    public void mo127859a(Chat chat, Team team) {
        boolean z;
        int i = 8;
        if (chat == null || !this.f89363e || team == null || TextUtils.isEmpty(team.getName())) {
            this.mBindTeamLayout.setVisibility(8);
            return;
        }
        this.mBindTeamLayout.setVisibility(0);
        this.mBindTeamName.setText(team.getName());
        boolean equals = String.valueOf(team.getOwnerId()).equals(ChatSettingModule.m133639a().mo127277g().mo127412a());
        boolean equals2 = String.valueOf(team.getDefaultChatId()).equals(chat.getId());
        boolean b = C34501a.m133936b(chat);
        if (equals2 || (!equals && !b)) {
            z = false;
        } else {
            z = true;
        }
        TextView textView = this.mUnbindActionTip;
        if (z) {
            i = 0;
        }
        textView.setVisibility(i);
    }

    /* renamed from: a */
    public void mo127860a(Chat chat, boolean z) {
        int i;
        if (chat != null) {
            ChatSettingModule.m133639a().mo127279i().mo127409a(this.f89361c, chat.getAvatarKey(), chat.getId(), this.mGroupPhotoIV, UIHelper.dp2px(48.0f), UIHelper.dp2px(48.0f));
            this.mGroupPhotoDescTv.setText(UIUtils.getString(this.f89361c, R.string.Lark_Legacy_GroupPhoto));
            ImageView imageView = this.mGroupPhotoArrowIV;
            if (!TextUtils.isEmpty(chat.getOnCallId()) || !z) {
                i = 4;
            } else {
                i = 0;
            }
            imageView.setVisibility(i);
            this.mGroupPhotoRegion.setOnClickListener(new View.OnClickListener() {
                /* class com.ss.android.lark.chatsetting.impl.group.info.$$Lambda$GroupInfoView$mZHGxAFi8lRvIg3CDjbryYn6GzA */

                public final void onClick(View view) {
                    GroupInfoView.lambda$mZHGxAFi8lRvIg3CDjbryYn6GzA(GroupInfoView.this, view);
                }
            });
        }
    }

    @Override // com.ss.android.lark.chatsetting.impl.group.info.C34619c.AbstractC34622b
    /* renamed from: b */
    public void mo127866b(Chat chat, boolean z, String str) {
        mo127860a(chat, z);
        mo127865b(chat, z);
        mo127868c(chat, z);
        m134461b(chat, str);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m134459a(boolean z, Chat chat, View view) {
        if (z && chat.isAllowPost()) {
            ChatSettingHitPointNew.m136632c(ChatSettingExtraParams.Click.GROUP_DESCRIPTION.plus(ChatSettingExtraParams.Target.IM_EDIT_GROUP_DESCRIPTION_VIEW));
            GroupHitPoint.f90519a.mo129229d();
            GroupHitPoint.f90519a.mo129242g(chat);
            this.f89359a.mo127878a(chat.getId(), 2);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public /* synthetic */ void m134462b(boolean z, Chat chat, View view) {
        if (z && chat.isAllowPost() && TextUtils.isEmpty(chat.getOnCallId())) {
            ChatSettingHitPointNew.m136632c(ChatSettingExtraParams.Click.GROUP_NAME.plus(ChatSettingExtraParams.Target.IM_EDIT_GROUP_NAME_VIEW));
            GroupHitPoint.f90519a.mo129224c();
            GroupHitPoint.f90519a.mo129239f(chat);
            this.f89359a.mo127878a(chat.getId(), 1);
        }
    }
}
