package com.ss.android.lark.chat.chatwindow.chat.message;

import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.larksuite.component.ui.display.manager.C25649b;
import com.larksuite.component.ui.toast.LKUIToast;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.utils.CollectionUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.C29990c;
import com.ss.android.lark.chat.base.view.vo.message.SystemContentVO;
import com.ss.android.lark.chat.entity.message.content.SystemContent;
import com.ss.android.lark.chat.export.entity.message.content.SystemMessageType;
import com.ss.android.lark.chat.utils.C34357v;
import com.ss.android.lark.chat.vo.AbsMessageVO;
import com.ss.android.lark.dependency.AbstractC36456ae;
import com.ss.android.lark.desktopmode.utils.DesktopUtil;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.statistics.redpacket.RedPacketHitPoint;
import com.ss.android.lark.widget.dialog.CommonLoadingDialog;
import com.ss.android.lark.widget.recyclerview.hive.AbstractC59010e;
import java.util.Map;

public class RedPacketSystemMessageCell extends AbstractC33290a<SystemContentVO, SystemMessageViewHolder> {
    @Override // com.ss.android.lark.widget.recyclerview.hive.AbstractC59004b
    /* renamed from: c */
    public int mo122651c() {
        return R.layout.activity_chat_window_system_item_new;
    }

    /* access modifiers changed from: package-private */
    public static class SystemMessageViewHolder extends AbstractC59010e {

        /* renamed from: a */
        public View f85746a;
        @BindView(8533)
        public ImageView mRedPacketSystemIV;
        @BindView(8889)
        public View mSystemCheckLabel;
        @BindView(8887)
        public TextView mSystemTV;

        SystemMessageViewHolder() {
        }

        /* renamed from: a */
        private void m128842a() {
            if (!DesktopUtil.m144307b()) {
                C25649b.m91854a(this.mRedPacketSystemIV, 16, 16);
                C25649b.m91856a(this.mSystemTV, 14);
            }
        }

        /* access modifiers changed from: protected */
        @Override // com.ss.android.lark.widget.recyclerview.hive.AbstractC59010e
        /* renamed from: a */
        public void mo122652a(View view) {
            this.f85746a = view;
            ButterKnife.bind(this, view);
            m128842a();
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.widget.recyclerview.hive.AbstractC59004b
    /* renamed from: a */
    public Class mo122646a() {
        return SystemContentVO.class;
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.widget.recyclerview.hive.AbstractC59004b
    /* renamed from: b */
    public Class<SystemMessageViewHolder> mo122650b() {
        return SystemMessageViewHolder.class;
    }

    public class SystemMessageViewHolder_ViewBinding implements Unbinder {

        /* renamed from: a */
        private SystemMessageViewHolder f85747a;

        @Override // butterknife.Unbinder
        public void unbind() {
            SystemMessageViewHolder systemMessageViewHolder = this.f85747a;
            if (systemMessageViewHolder != null) {
                this.f85747a = null;
                systemMessageViewHolder.mSystemCheckLabel = null;
                systemMessageViewHolder.mRedPacketSystemIV = null;
                systemMessageViewHolder.mSystemTV = null;
                return;
            }
            throw new IllegalStateException("Bindings already cleared.");
        }

        public SystemMessageViewHolder_ViewBinding(SystemMessageViewHolder systemMessageViewHolder, View view) {
            this.f85747a = systemMessageViewHolder;
            systemMessageViewHolder.mSystemCheckLabel = Utils.findRequiredView(view, R.id.system_message_check_label, "field 'mSystemCheckLabel'");
            systemMessageViewHolder.mRedPacketSystemIV = (ImageView) Utils.findRequiredViewAsType(view, R.id.red_packet_system_iv, "field 'mRedPacketSystemIV'", ImageView.class);
            systemMessageViewHolder.mSystemTV = (TextView) Utils.findRequiredViewAsType(view, R.id.system_label, "field 'mSystemTV'", TextView.class);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.lark.chat.chatwindow.chat.message.RedPacketSystemMessageCell$3 */
    public static /* synthetic */ class C332813 {

        /* renamed from: a */
        static final /* synthetic */ int[] f85745a;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        static {
            /*
                com.ss.android.lark.chat.export.entity.message.content.SystemMessageType[] r0 = com.ss.android.lark.chat.export.entity.message.content.SystemMessageType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.ss.android.lark.chat.chatwindow.chat.message.RedPacketSystemMessageCell.C332813.f85745a = r0
                com.ss.android.lark.chat.export.entity.message.content.SystemMessageType r1 = com.ss.android.lark.chat.export.entity.message.content.SystemMessageType.GRAB_OTHER_HONGBAO     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = com.ss.android.lark.chat.chatwindow.chat.message.RedPacketSystemMessageCell.C332813.f85745a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.ss.android.lark.chat.export.entity.message.content.SystemMessageType r1 = com.ss.android.lark.chat.export.entity.message.content.SystemMessageType.OTHER_GRAB_MY_HONGBAO     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = com.ss.android.lark.chat.chatwindow.chat.message.RedPacketSystemMessageCell.C332813.f85745a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.ss.android.lark.chat.export.entity.message.content.SystemMessageType r1 = com.ss.android.lark.chat.export.entity.message.content.SystemMessageType.LAST_HONGBAO_IS_GRABBED     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = com.ss.android.lark.chat.chatwindow.chat.message.RedPacketSystemMessageCell.C332813.f85745a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.ss.android.lark.chat.export.entity.message.content.SystemMessageType r1 = com.ss.android.lark.chat.export.entity.message.content.SystemMessageType.SEND_HONGBAO_MESSAGE_FAILED     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.chat.chatwindow.chat.message.RedPacketSystemMessageCell.C332813.<clinit>():void");
        }
    }

    public RedPacketSystemMessageCell(AbstractC33342d dVar) {
        super(dVar);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m128827a(SystemMessageType systemMessageType) {
        RedPacketHitPoint.m213531a(C29990c.m110930b().am().mo134626a(C29990c.m110930b().mo134598z().mo134423a()), C29990c.m110930b().am().mo134627b(C29990c.m110930b().mo134598z().mo134423a()));
        final AbstractC36456ae z = C29990c.m110930b().mo134598z();
        final CommonLoadingDialog commonLoadingDialog = new CommonLoadingDialog();
        z.mo134427a(new AbstractC36456ae.AbstractC36457a() {
            /* class com.ss.android.lark.chat.chatwindow.chat.message.RedPacketSystemMessageCell.C332802 */

            @Override // com.ss.android.lark.dependency.AbstractC36456ae.AbstractC36457a
            /* renamed from: b */
            public void mo122737b() {
                commonLoadingDialog.show(RedPacketSystemMessageCell.this.f85789d.mo122543g());
            }

            @Override // com.ss.android.lark.dependency.AbstractC36456ae.AbstractC36457a
            /* renamed from: a */
            public void mo122735a() {
                commonLoadingDialog.dismiss();
                z.mo134425a(RedPacketSystemMessageCell.this.f85789d.mo122543g());
            }

            @Override // com.ss.android.lark.dependency.AbstractC36456ae.AbstractC36457a
            /* renamed from: a */
            public void mo122736a(ErrorResult errorResult) {
                commonLoadingDialog.dismiss();
                LKUIToast.show(RedPacketSystemMessageCell.this.f85789d.mo122543g(), (int) R.string.Lark_Legacy_ErrorMessageTip);
            }
        });
    }

    /* renamed from: b */
    private void m128829b(SystemMessageViewHolder systemMessageViewHolder, AbsMessageVO<SystemContentVO> aVar) {
        if (!this.f85789d.mo122553q()) {
            systemMessageViewHolder.mSystemCheckLabel.setVisibility(8);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo122649a(SystemMessageViewHolder systemMessageViewHolder, AbsMessageVO<SystemContentVO> aVar) {
        super.mo122648a((AbstractC59010e) systemMessageViewHolder, (AbsMessageVO) aVar);
        SystemContent systemContent = (SystemContent) aVar.mo121699g().mo126168z();
        if (systemContent == null) {
            Log.m165389i("RedPacketSystem", "red packet system msg is empty, id：" + aVar.mo121681a());
            return;
        }
        String formattedContent = systemContent.getFormattedContent();
        if (TextUtils.isEmpty(formattedContent)) {
            systemMessageViewHolder.f85746a.setVisibility(8);
        } else {
            systemMessageViewHolder.mSystemTV.setText(formattedContent);
        }
        Map<String, String> contents = systemContent.getContents();
        if (!CollectionUtils.isEmpty(contents)) {
            SpannableStringBuilder spannableStringBuilder = null;
            int i = C332813.f85745a[systemContent.getType().ordinal()];
            if (i == 1 || i == 2 || i == 3) {
                String str = contents.get("hongbao");
                if (!TextUtils.isEmpty(str)) {
                    spannableStringBuilder = C34357v.m133264a(this.f85789d.mo122543g(), systemContent.getType(), formattedContent, str, new C34357v.C34362b.AbstractC34363a(contents, systemContent) {
                        /* class com.ss.android.lark.chat.chatwindow.chat.message.$$Lambda$RedPacketSystemMessageCell$ChhDkOSHWOKJ6Ym8NZA4FYyxPic */
                        public final /* synthetic */ Map f$1;
                        public final /* synthetic */ SystemContent f$2;

                        {
                            this.f$1 = r2;
                            this.f$2 = r3;
                        }

                        @Override // com.ss.android.lark.chat.utils.C34357v.C34362b.AbstractC34363a
                        public final void onRedPacketSystemMessageClicked(SystemMessageType systemMessageType) {
                            RedPacketSystemMessageCell.lambda$ChhDkOSHWOKJ6Ym8NZA4FYyxPic(RedPacketSystemMessageCell.this, this.f$1, this.f$2, systemMessageType);
                        }
                    });
                }
            } else if (i == 4) {
                String str2 = contents.get("wallet");
                if (!TextUtils.isEmpty(str2)) {
                    spannableStringBuilder = C34357v.m133264a(this.f85789d.mo122543g(), systemContent.getType(), formattedContent, str2, new C34357v.C34362b.AbstractC34363a() {
                        /* class com.ss.android.lark.chat.chatwindow.chat.message.$$Lambda$RedPacketSystemMessageCell$eEf6vDV0CLy2U03wPm3aZikEH9E */

                        @Override // com.ss.android.lark.chat.utils.C34357v.C34362b.AbstractC34363a
                        public final void onRedPacketSystemMessageClicked(SystemMessageType systemMessageType) {
                            RedPacketSystemMessageCell.lambda$eEf6vDV0CLy2U03wPm3aZikEH9E(RedPacketSystemMessageCell.this, systemMessageType);
                        }
                    });
                }
            }
            if (spannableStringBuilder != null) {
                systemMessageViewHolder.mSystemTV.setText(spannableStringBuilder);
                systemMessageViewHolder.mSystemTV.setMovementMethod(LinkMovementMethod.getInstance());
                systemMessageViewHolder.mSystemTV.setHighlightColor(0);
            }
            m128829b(systemMessageViewHolder, aVar);
            systemMessageViewHolder.mRedPacketSystemIV.setVisibility(0);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m128828a(Map map, SystemContent systemContent, SystemMessageType systemMessageType) {
        final boolean z;
        final String str = (String) map.get("message_id");
        final String str2 = (String) map.get("hongbao_id");
        if (!TextUtils.isEmpty(str2)) {
            RedPacketHitPoint.m213532b(C29990c.m110930b().am().mo134626a(C29990c.m110930b().mo134598z().mo134423a()), C29990c.m110930b().am().mo134627b(C29990c.m110930b().mo134598z().mo134423a()));
            if (systemContent.getType() == SystemMessageType.OTHER_GRAB_MY_HONGBAO || systemContent.getType() == SystemMessageType.LAST_HONGBAO_IS_GRABBED) {
                z = true;
            } else {
                z = false;
            }
            final AbstractC36456ae z2 = C29990c.m110930b().mo134598z();
            final CommonLoadingDialog commonLoadingDialog = new CommonLoadingDialog();
            z2.mo134427a(new AbstractC36456ae.AbstractC36457a() {
                /* class com.ss.android.lark.chat.chatwindow.chat.message.RedPacketSystemMessageCell.C332791 */

                @Override // com.ss.android.lark.dependency.AbstractC36456ae.AbstractC36457a
                /* renamed from: b */
                public void mo122737b() {
                    commonLoadingDialog.show(RedPacketSystemMessageCell.this.f85789d.mo122543g());
                }

                @Override // com.ss.android.lark.dependency.AbstractC36456ae.AbstractC36457a
                /* renamed from: a */
                public void mo122735a() {
                    commonLoadingDialog.dismiss();
                    z2.mo134424a(RedPacketSystemMessageCell.this.f85789d.mo122543g(), str2, str, z, true, false, false);
                }

                @Override // com.ss.android.lark.dependency.AbstractC36456ae.AbstractC36457a
                /* renamed from: a */
                public void mo122736a(ErrorResult errorResult) {
                    commonLoadingDialog.dismiss();
                    LKUIToast.show(RedPacketSystemMessageCell.this.f85789d.mo122543g(), (int) R.string.Lark_Legacy_ErrorMessageTip);
                }
            });
        }
    }
}
