package com.ss.android.lark.chat.chatwindow.chat.message.block;

import android.content.Context;
import android.content.DialogInterface;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.component.ui.dialog.C25639g;
import com.larksuite.component.ui.display.manager.C25649b;
import com.larksuite.component.ui.display.manager.LKUIDisplayManager;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.C29990c;
import com.ss.android.lark.chat.api.service.track.C32911g;
import com.ss.android.lark.chat.base.view.vo.message.AudioContentVO;
import com.ss.android.lark.chat.chatwindow.chat.message.AbstractC33342d;
import com.ss.android.lark.chat.chatwindow.chat.message.block.MessageStatusBlock;
import com.ss.android.lark.chat.entity.chat.Chat;
import com.ss.android.lark.chat.entity.message.Message;
import com.ss.android.lark.chat.entity.message.SendStatus;
import com.ss.android.lark.chat.entity.message.content.AudioContent;
import com.ss.android.lark.chat.export.vo.ContentVO;
import com.ss.android.lark.chat.open.message.IStatusLayoutPlaceProvider;
import com.ss.android.lark.chat.utils.C34346l;
import com.ss.android.lark.chat.vo.ChatMessageVO;
import com.ss.android.lark.chatwindow.C35247g;
import com.ss.android.lark.chatwindow.view.readstate.ReadStateView;
import com.ss.android.lark.chatwindow.view.widget.DelayDisplayProgressbar;
import com.ss.android.lark.dependency.ap;
import com.ss.android.lark.desktopmode.utils.DesktopUtil;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.lark.widget.listener.C58546g;
import com.ss.android.lark.widget.listener.OnSingleClickListener;
import com.ss.android.lark.widget.recyclerview.hive.AbstractC59004b;
import com.ss.android.lark.widget.recyclerview.hive.AbstractC59010e;
import java.util.ArrayList;

public class MessageStatusBlock extends AbstractC59004b<ChatMessageVO, StatusBlockHolder> {

    /* renamed from: a */
    public final AbstractC33342d f85794a;

    /* renamed from: b */
    public final AbstractC33313a f85795b;

    /* renamed from: c */
    private final ap f85796c = C29990c.m110930b().mo134516O();

    /* renamed from: d */
    private final IStatusLayoutPlaceProvider f85797d;

    /* renamed from: com.ss.android.lark.chat.chatwindow.chat.message.block.MessageStatusBlock$a */
    public interface AbstractC33313a {
        /* renamed from: g */
        void mo122797g(String str);

        /* renamed from: h */
        void mo122798h(String str);
    }

    @Override // com.ss.android.lark.widget.recyclerview.hive.AbstractC59004b
    /* renamed from: c */
    public int mo122651c() {
        return 0;
    }

    /* access modifiers changed from: package-private */
    public static class StatusBlockHolder extends AbstractC59010e {
        @BindView(9213)
        public ReadStateView mReadUnreadStateView;
        @BindView(8739)
        public ImageView mSendFailStatus;
        @BindView(8741)
        public DelayDisplayProgressbar mSendingStatus;
        @BindView(8985)
        public View mTimeAndReadStateWrapLayout;
        @BindView(8984)
        public FrameLayout mTimeReadStateAlignBubbleContainer;

        StatusBlockHolder() {
        }

        /* renamed from: a */
        private void m128947a() {
            if (!DesktopUtil.m144307b()) {
                C25649b.m91853a(this.mReadUnreadStateView, 20);
                C25649b.m91853a(this.mSendFailStatus, 19);
                C25649b.m91853a(this.mSendingStatus, 19);
                this.mTimeReadStateAlignBubbleContainer.setMinimumWidth(LKUIDisplayManager.m91881c(this.mReadUnreadStateView.getContext(), 20) + UIHelper.dp2px(5.0f));
            }
        }

        /* access modifiers changed from: protected */
        @Override // com.ss.android.lark.widget.recyclerview.hive.AbstractC59010e
        /* renamed from: a */
        public void mo122652a(View view) {
            ButterKnife.bind(this, view);
            m128947a();
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.widget.recyclerview.hive.AbstractC59004b
    /* renamed from: b */
    public Class<StatusBlockHolder> mo122650b() {
        return StatusBlockHolder.class;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public Context mo122719d() {
        return this.f85794a.mo122543g();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.lark.chat.chatwindow.chat.message.block.MessageStatusBlock$3 */
    public static /* synthetic */ class C333123 {

        /* renamed from: a */
        static final /* synthetic */ int[] f85803a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            /*
                com.ss.android.lark.chat.entity.message.SendStatus[] r0 = com.ss.android.lark.chat.entity.message.SendStatus.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.ss.android.lark.chat.chatwindow.chat.message.block.MessageStatusBlock.C333123.f85803a = r0
                com.ss.android.lark.chat.entity.message.SendStatus r1 = com.ss.android.lark.chat.entity.message.SendStatus.SENDING     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = com.ss.android.lark.chat.chatwindow.chat.message.block.MessageStatusBlock.C333123.f85803a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.ss.android.lark.chat.entity.message.SendStatus r1 = com.ss.android.lark.chat.entity.message.SendStatus.FAIL     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.chat.chatwindow.chat.message.block.MessageStatusBlock.C333123.<clinit>():void");
        }
    }

    public class StatusBlockHolder_ViewBinding implements Unbinder {

        /* renamed from: a */
        private StatusBlockHolder f85804a;

        @Override // butterknife.Unbinder
        public void unbind() {
            StatusBlockHolder statusBlockHolder = this.f85804a;
            if (statusBlockHolder != null) {
                this.f85804a = null;
                statusBlockHolder.mSendingStatus = null;
                statusBlockHolder.mSendFailStatus = null;
                statusBlockHolder.mReadUnreadStateView = null;
                statusBlockHolder.mTimeAndReadStateWrapLayout = null;
                statusBlockHolder.mTimeReadStateAlignBubbleContainer = null;
                return;
            }
            throw new IllegalStateException("Bindings already cleared.");
        }

        public StatusBlockHolder_ViewBinding(StatusBlockHolder statusBlockHolder, View view) {
            this.f85804a = statusBlockHolder;
            statusBlockHolder.mSendingStatus = (DelayDisplayProgressbar) Utils.findRequiredViewAsType(view, R.id.sending_status, "field 'mSendingStatus'", DelayDisplayProgressbar.class);
            statusBlockHolder.mSendFailStatus = (ImageView) Utils.findRequiredViewAsType(view, R.id.sending_fail_status, "field 'mSendFailStatus'", ImageView.class);
            statusBlockHolder.mReadUnreadStateView = (ReadStateView) Utils.findRequiredViewAsType(view, R.id.unread_member_count, "field 'mReadUnreadStateView'", ReadStateView.class);
            statusBlockHolder.mTimeAndReadStateWrapLayout = Utils.findRequiredView(view, R.id.time_read_state_wrap_layout, "field 'mTimeAndReadStateWrapLayout'");
            statusBlockHolder.mTimeReadStateAlignBubbleContainer = (FrameLayout) Utils.findRequiredViewAsType(view, R.id.time_read_state_container_align_bubble, "field 'mTimeReadStateAlignBubbleContainer'", FrameLayout.class);
        }
    }

    /* renamed from: a */
    private int m128936a(long j) {
        if (System.currentTimeMillis() - (j * 1000) > 2000) {
            return 0;
        }
        return C35247g.m137623a();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo122649a(StatusBlockHolder statusBlockHolder, ChatMessageVO cVar) {
        m128938b(statusBlockHolder, cVar);
        m128940d(statusBlockHolder, cVar);
        m128939c(statusBlockHolder, cVar);
    }

    /* renamed from: b */
    private void m128938b(StatusBlockHolder statusBlockHolder, ChatMessageVO cVar) {
        int i;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) statusBlockHolder.mTimeAndReadStateWrapLayout.getLayoutParams();
        FrameLayout frameLayout = statusBlockHolder.mTimeReadStateAlignBubbleContainer;
        IStatusLayoutPlaceProvider iStatusLayoutPlaceProvider = this.f85797d;
        if (iStatusLayoutPlaceProvider != null) {
            i = iStatusLayoutPlaceProvider.mo122839a(cVar);
        } else {
            i = 2;
        }
        boolean z = true;
        if (i == 0 || i == 1) {
            if (layoutParams.gravity == 16) {
                z = false;
            }
            layoutParams.gravity = 16;
        } else {
            if (layoutParams.gravity == 80) {
                z = false;
            }
            layoutParams.gravity = 80;
        }
        statusBlockHolder.mTimeReadStateAlignBubbleContainer.setVisibility(0);
        if (frameLayout != statusBlockHolder.mTimeAndReadStateWrapLayout.getParent() || z) {
            C34346l.m133189a(frameLayout, statusBlockHolder.mTimeAndReadStateWrapLayout, layoutParams);
        }
    }

    /* renamed from: d */
    private void m128940d(StatusBlockHolder statusBlockHolder, final ChatMessageVO cVar) {
        boolean z;
        int i;
        boolean l = this.f85794a.mo122548l();
        if (!cVar.mo121695c() || l || this.f85794a.mo122541e()) {
            statusBlockHolder.mReadUnreadStateView.setVisibility(8);
            return;
        }
        final Chat n = this.f85794a.mo122550n();
        if (n == null || n.getMemberCount() > 1) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            i = cVar.ab();
        } else {
            i = cVar.ab() - 1;
        }
        int ac = cVar.ac();
        int i2 = i + ac;
        Log.m165389i("MessageStatusBlock", cVar.mo121681a() + ", unread:" + i2 + "/" + i + "/" + ac);
        C333112 r6 = null;
        if (this.f85794a.mo122547k()) {
            statusBlockHolder.mReadUnreadStateView.setVisibility(8);
            statusBlockHolder.mReadUnreadStateView.setOnClickListener(null);
            return;
        }
        if (i2 > 0) {
            statusBlockHolder.mReadUnreadStateView.setVisibility(0);
            statusBlockHolder.mReadUnreadStateView.setProgress((((float) i) * 1.0f) / ((float) i2));
        } else if (i2 == 0) {
            statusBlockHolder.mReadUnreadStateView.setVisibility(0);
            statusBlockHolder.mReadUnreadStateView.setProgress(1.0f);
        } else {
            statusBlockHolder.mReadUnreadStateView.setProgress(BitmapDescriptorFactory.HUE_RED);
            statusBlockHolder.mReadUnreadStateView.setVisibility(8);
        }
        statusBlockHolder.mReadUnreadStateView.setTag(false);
        C333112 r1 = new OnSingleClickListener() {
            /* class com.ss.android.lark.chat.chatwindow.chat.message.block.MessageStatusBlock.C333112 */

            @Override // com.ss.android.lark.widget.listener.OnSingleClickListener
            public void onSingleClick(View view) {
                ArrayList<String> a = C35247g.m137627a(cVar.mo121699g());
                C32911g.m126697d(n.getId()).mo121420b(cVar.mo121681a());
                if (DesktopUtil.m144301a(view.getContext())) {
                    C58546g.m227072a().mo198455a(view);
                }
                C29990c.m110930b().mo134539a(MessageStatusBlock.this.mo122719d(), cVar.mo121692b(), cVar.mo121710r(), cVar.mo121681a(), a, ((Boolean) view.getTag()).booleanValue());
                C29990c.m110930b().mo134583k().mo134719a("mobile_read_status", false);
            }
        };
        ReadStateView readStateView = statusBlockHolder.mReadUnreadStateView;
        if (this.f85794a.mo122540d()) {
            r6 = r1;
        }
        readStateView.setOnClickListener(r6);
        statusBlockHolder.mReadUnreadStateView.setOnLongClickListener(new View.OnLongClickListener(statusBlockHolder, cVar) {
            /* class com.ss.android.lark.chat.chatwindow.chat.message.block.$$Lambda$MessageStatusBlock$kIeVTVl4pqvSIssL_3xB3z1Bq0 */
            public final /* synthetic */ MessageStatusBlock.StatusBlockHolder f$1;
            public final /* synthetic */ ChatMessageVO f$2;

            {
                this.f$1 = r2;
                this.f$2 = r3;
            }

            public final boolean onLongClick(View view) {
                return MessageStatusBlock.this.m128937a(this.f$1, this.f$2, view);
            }
        });
    }

    /* renamed from: c */
    private void m128939c(StatusBlockHolder statusBlockHolder, final ChatMessageVO cVar) {
        boolean z;
        boolean z2;
        boolean z3;
        if (this.f85794a.mo122553q()) {
            UIUtils.hide(statusBlockHolder.mSendFailStatus);
            statusBlockHolder.mSendingStatus.mo129995a();
            return;
        }
        ContentVO g = cVar.mo121699g();
        boolean z4 = false;
        if (cVar.mo121656B() == SendStatus.SUCCESS) {
            z = true;
        } else {
            z = false;
        }
        if (!cVar.ai() || z) {
            if (this.f85794a.mo122549m()) {
                UIUtils.hide(statusBlockHolder.mReadUnreadStateView);
            } else if (this.f85794a.mo122541e()) {
                UIUtils.hide(statusBlockHolder.mReadUnreadStateView);
            } else if (cVar.mo121695c() && !this.f85794a.mo122548l() && !this.f85794a.mo122547k()) {
                UIUtils.show(statusBlockHolder.mReadUnreadStateView);
            } else if (cVar.mo121710r() == Message.Type.FILE || cVar.mo121710r() == Message.Type.SHARE_GROUP_CHAT || cVar.mo121710r() == Message.Type.CARD || cVar.mo121710r() == Message.Type.LOCATION || this.f85796c.mo134478a(cVar.mo121699g())) {
                UIUtils.hide(statusBlockHolder.mReadUnreadStateView);
            } else {
                UIUtils.hide(statusBlockHolder.mReadUnreadStateView);
            }
            statusBlockHolder.mSendingStatus.mo129995a();
            UIUtils.hide(statusBlockHolder.mSendFailStatus);
        } else {
            int i = C333123.f85803a[cVar.mo121656B().ordinal()];
            if (i == 1) {
                UIUtils.hide(statusBlockHolder.mReadUnreadStateView);
                UIUtils.hide(statusBlockHolder.mSendFailStatus);
                Message.Type r = cVar.mo121710r();
                if (r != Message.Type.MEDIA) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (DesktopUtil.m144301a(mo122719d())) {
                    if (r != Message.Type.FILE) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    z2 &= z3;
                }
                if (g instanceof AudioContentVO) {
                    if (((AudioContentVO) g).mo121815j() != AudioContent.AudioState.RECORDING) {
                        z4 = true;
                    }
                    z2 &= z4;
                }
                if (z2) {
                    statusBlockHolder.mSendingStatus.mo129996a(m128936a(cVar.mo121716x()));
                } else {
                    statusBlockHolder.mSendingStatus.mo129995a();
                }
            } else if (i == 2) {
                UIUtils.hide(statusBlockHolder.mReadUnreadStateView);
                statusBlockHolder.mSendingStatus.mo129995a();
                UIUtils.show(statusBlockHolder.mSendFailStatus);
                statusBlockHolder.mSendFailStatus.setOnClickListener(new OnSingleClickListener(300) {
                    /* class com.ss.android.lark.chat.chatwindow.chat.message.block.MessageStatusBlock.C333101 */

                    @Override // com.ss.android.lark.widget.listener.OnSingleClickListener
                    public void onSingleClick(View view) {
                        if (MessageStatusBlock.this.f85795b != null) {
                            new C25639g(MessageStatusBlock.this.f85794a.mo122543g()).mo89248g(R.string.Lark_Message_Mobilesendfailedalerttip).mo89224a(R.id.lkui_dialog_btn_left, R.string.Lark_Message_Mobilesendfailedalertbuttoncancel, (DialogInterface.OnClickListener) null).mo89224a(R.id.lkui_dialog_btn_right, R.string.Lark_Message_Mobilesendfailedalertbuttonresend, new DialogInterface.OnClickListener(cVar) {
                                /* class com.ss.android.lark.chat.chatwindow.chat.message.block.$$Lambda$MessageStatusBlock$1$Mxb08QgsutlvU0mOOqmdDWWOIFM */
                                public final /* synthetic */ ChatMessageVO f$1;

                                {
                                    this.f$1 = r2;
                                }

                                public final void onClick(DialogInterface dialogInterface, int i) {
                                    MessageStatusBlock.C333101.this.m128946a(this.f$1, dialogInterface, i);
                                }
                            }).mo89239c();
                        }
                    }

                    /* access modifiers changed from: private */
                    /* renamed from: a */
                    public /* synthetic */ void m128946a(ChatMessageVO cVar, DialogInterface dialogInterface, int i) {
                        MessageStatusBlock.this.f85795b.mo122797g(cVar.mo121681a());
                    }
                });
            }
        }
        if (DesktopUtil.m144301a(mo122719d())) {
            int dp2px = UIHelper.dp2px(16.0f);
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) statusBlockHolder.mReadUnreadStateView.getLayoutParams();
            marginLayoutParams.width = dp2px;
            marginLayoutParams.height = dp2px;
            marginLayoutParams.bottomMargin = -UIHelper.dp2px(1.0f);
            double d = (double) dp2px;
            statusBlockHolder.mReadUnreadStateView.mo129861a((float) ((int) (0.4d * d)), (float) ((int) (d * 0.1d)));
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ boolean m128937a(StatusBlockHolder statusBlockHolder, ChatMessageVO cVar, View view) {
        return mo122755b((AbstractC59010e) statusBlockHolder, (Object) cVar);
    }

    public MessageStatusBlock(AbstractC33342d dVar, AbstractC33313a aVar, IStatusLayoutPlaceProvider iStatusLayoutPlaceProvider) {
        this.f85794a = dVar;
        this.f85795b = aVar;
        this.f85797d = iStatusLayoutPlaceProvider;
    }
}
