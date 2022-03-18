package com.ss.android.lark.ding.service.impl.controller;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import com.larksuite.component.ui.dialog.C25639g;
import com.larksuite.component.ui.toast.LKUIToast;
import com.larksuite.framework.thread.CoreThreadPool;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.chat.entity.chatter.Chatter;
import com.ss.android.lark.chat.entity.message.Message;
import com.ss.android.lark.chat.entity.message.content.ImageContent;
import com.ss.android.lark.chat.entity.message.content.MergeForwardContent;
import com.ss.android.lark.chat.entity.message.content.ProfileContent;
import com.ss.android.lark.contact.entity.Contact;
import com.ss.android.lark.ding.C36618a;
import com.ss.android.lark.ding.dependency.IDingModuleDependency;
import com.ss.android.lark.ding.dto.C36637b;
import com.ss.android.lark.ding.dto.C36638c;
import com.ss.android.lark.ding.entity.DingStatus;
import com.ss.android.lark.ding.service.impl.controller.C36752j;
import com.ss.android.lark.ding.widget.switchbtn.SwitchBtn;
import com.ss.android.lark.image.ImageLoader;
import com.ss.android.lark.image.entity.Image;
import com.ss.android.lark.ui.CommonTitleBar;
import com.ss.android.lark.ui.IActionTitlebar;
import com.ss.android.lark.utils.C57814c;
import com.ss.android.lark.utils.ImageUtils;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.lark.widget.billing.BillingTipsDialog;
import com.ss.android.lark.widget.dialog.CommonLoadingDialog;
import com.ss.android.lark.widget.recyclerview.C58996h;
import java.util.ArrayList;
import java.util.List;

public class DingView implements C36752j.AbstractC36755b {

    /* renamed from: a */
    IDingModuleDependency.AbstractC36625c f94347a;

    /* renamed from: b */
    IDingModuleDependency.AbstractC36625c f94348b = C36618a.m144492a().mo135104i();

    /* renamed from: c */
    public final AbstractC36705a f94349c;

    /* renamed from: d */
    public C36752j.AbstractC36755b.AbstractC36756a f94350d;
    @BindView(6437)
    RecyclerView dingUsersRV;

    /* renamed from: e */
    public DingUsersShowAdapter f94351e;

    /* renamed from: f */
    public int f94352f = 1;

    /* renamed from: g */
    public boolean f94353g;

    /* renamed from: h */
    public boolean f94354h;

    /* renamed from: i */
    public boolean f94355i;

    /* renamed from: j */
    public List<Chatter> f94356j;

    /* renamed from: k */
    public List<Chatter> f94357k;

    /* renamed from: l */
    private final Context f94358l;

    /* renamed from: m */
    private List<Chatter> f94359m;
    @BindView(6072)
    ImageView mImageView;
    @BindView(6071)
    DingPostView mPostView;
    @BindView(6669)
    CommonTitleBar mTitleBar;

    /* renamed from: n */
    private CommonLoadingDialog f94360n;
    @BindView(6532)
    LinearLayout sendTypeSelect;
    @BindView(6598)
    SwitchBtn switchBtn;
    @BindView(6073)
    TextView textMessageTV;

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.lark.ding.service.impl.controller.DingView$a */
    public interface AbstractC36705a {
        /* renamed from: a */
        void mo135353a();

        /* renamed from: a */
        void mo135354a(Message message, DingStatus dingStatus);

        /* renamed from: a */
        void mo135355a(DingView dingView);

        /* renamed from: a */
        void mo135356a(List<Contact> list, int i);
    }

    /* renamed from: a */
    public boolean mo135341a(boolean z, int i) {
        if (!z) {
            return i == 2 || i == 3;
        }
        return false;
    }

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void destroy() {
    }

    @Override // com.ss.android.lark.ding.service.impl.controller.C36752j.AbstractC36755b
    /* renamed from: a */
    public void mo135339a(boolean z) {
        if (z) {
            this.sendTypeSelect.setVisibility(0);
        }
    }

    @Override // com.ss.android.lark.ding.service.impl.controller.C36752j.AbstractC36755b
    /* renamed from: a */
    public void mo135337a(List<Chatter> list) {
        this.f94359m = list;
        m144819b(list);
        m144825d(list);
        this.switchBtn.setEnableSmsPhone(this.f94353g);
    }

    @Override // com.ss.android.lark.ding.service.impl.controller.C36752j.AbstractC36755b
    /* renamed from: a */
    public void mo135336a(String str, DialogInterface.OnClickListener onClickListener, DialogInterface.OnClickListener onClickListener2) {
        new C25639g(this.f94358l).mo89237b(UIHelper.getString(R.string.Lark_Notification_DndBuzzConfirmTitle)).mo89238b(true).mo89242c(UIHelper.mustacheFormat((int) R.string.Lark_Notification_DndBuzzConfirmDetail, "Name", str)).mo89253l(8388611).mo89225a(R.id.lkui_dialog_btn_left, UIHelper.getString(R.string.Lark_Notification_DndBuzzCancel), onClickListener2).mo89225a(R.id.lkui_dialog_btn_right, UIHelper.getString(R.string.Lark_Notification_DndBuzzConfirm), onClickListener).mo89233b().show();
    }

    @Override // com.ss.android.lark.ding.service.impl.controller.C36752j.AbstractC36755b
    /* renamed from: a */
    public void mo135338a(List<Contact> list, int i) {
        this.f94349c.mo135356a(list, i);
    }

    /* renamed from: a */
    public boolean mo135340a(int i, int i2) {
        return i != i2 && !this.f94354h;
    }

    /* renamed from: d */
    private void m144823d() {
        CommonLoadingDialog commonLoadingDialog = this.f94360n;
        if (commonLoadingDialog != null) {
            commonLoadingDialog.dismiss();
        }
    }

    @Override // com.ss.android.lark.ding.service.impl.controller.C36752j.AbstractC36755b
    /* renamed from: a */
    public void mo135330a() {
        this.f94349c.mo135353a();
    }

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void create() {
        this.f94349c.mo135355a(this);
        m144817b();
    }

    /* renamed from: c */
    private void m144821c() {
        if (this.f94360n == null) {
            this.f94360n = new CommonLoadingDialog();
        }
        this.f94360n.show(this.f94358l);
    }

    /* renamed from: b */
    private void m144817b() {
        this.mTitleBar.setTitle(R.string.Lark_Legacy_UrgentConfirmTitle);
        this.mTitleBar.addAction(new IActionTitlebar.TextAction(UIUtils.getString(this.f94358l, R.string.Lark_Legacy_DingSend)) {
            /* class com.ss.android.lark.ding.service.impl.controller.DingView.C366981 */

            @Override // com.ss.android.lark.ui.IActionTitlebar.Action, com.ss.android.lark.ui.IActionTitlebar.BaseAction
            public void performAction(View view) {
                super.performAction(view);
                if (!DingView.this.f94355i) {
                    DingView.this.f94348b.mo135142c();
                    DingView.this.mo135346c(true);
                    DingView.this.f94350d.mo135428a(DingView.this.f94352f, DingView.this.f94354h, DingView.this.f94357k, DingView.this.f94356j);
                }
            }
        });
        this.mTitleBar.setLeftClickListener(new View.OnClickListener() {
            /* class com.ss.android.lark.ding.service.impl.controller.DingView.View$OnClickListenerC366992 */

            public void onClick(View view) {
                DingView.this.f94349c.mo135353a();
            }
        });
        this.switchBtn.setOnSwitchBtnListener(new SwitchBtn.AbstractC36784a() {
            /* class com.ss.android.lark.ding.service.impl.controller.DingView.C367003 */

            @Override // com.ss.android.lark.ding.widget.switchbtn.SwitchBtn.AbstractC36784a
            /* renamed from: a */
            public void mo135349a(int i) {
                DingView dingView = DingView.this;
                if (dingView.mo135341a(dingView.f94353g, i)) {
                    DingView dingView2 = DingView.this;
                    dingView2.mo135344b(dingView2.f94354h, i);
                    return;
                }
                DingView dingView3 = DingView.this;
                if (dingView3.mo135340a(dingView3.f94352f, i)) {
                    DingView.this.mo135331a(i);
                }
                DingView.this.f94352f = i;
            }
        });
    }

    /* renamed from: a */
    public void setViewDelegate(C36752j.AbstractC36755b.AbstractC36756a aVar) {
        this.f94350d = aVar;
    }

    @Override // com.ss.android.lark.ding.service.impl.controller.C36752j.AbstractC36755b
    /* renamed from: b */
    public void mo135343b(boolean z) {
        BillingTipsDialog.Type type;
        Context context = this.f94358l;
        if (z) {
            type = BillingTipsDialog.Type.BUZZ_LIMIT_ADMIN;
        } else {
            type = BillingTipsDialog.Type.BUZZ_LIMIT_USER;
        }
        BillingTipsDialog.m226151a(context, "", type);
    }

    @Override // com.ss.android.lark.ding.service.impl.controller.C36752j.AbstractC36755b
    /* renamed from: c */
    public void mo135346c(boolean z) {
        this.f94355i = z;
        if (z) {
            m144821c();
        } else {
            m144823d();
        }
    }

    @Override // com.ss.android.lark.ding.service.impl.controller.C36752j.AbstractC36755b
    /* renamed from: d */
    public void mo135347d(boolean z) {
        C36723d.m144892a(this.f94358l, z, null);
    }

    /* renamed from: b */
    private void m144819b(List<Chatter> list) {
        this.f94353g = false;
        for (Chatter chatter : list) {
            if (chatter.isAcceptSmsPhoneUrgent()) {
                this.f94353g = true;
                return;
            }
        }
    }

    /* renamed from: a */
    private void m144815a(final Message message) {
        this.textMessageTV.setVisibility(0);
        this.mImageView.setVisibility(8);
        this.mPostView.setVisibility(8);
        CoreThreadPool.getDefault().getFixedThreadPool().execute(new Runnable() {
            /* class com.ss.android.lark.ding.service.impl.controller.DingView.RunnableC367025 */

            public void run() {
                final CharSequence a = DingView.this.f94348b.mo135129a(message);
                if (a != null) {
                    CoreThreadPool.getDefault().getUIExecutor().execute(new Runnable() {
                        /* class com.ss.android.lark.ding.service.impl.controller.DingView.RunnableC367025.RunnableC367031 */

                        public void run() {
                            DingView.this.textMessageTV.setText(C57814c.m224346a(a));
                        }
                    });
                }
            }
        });
    }

    /* renamed from: c */
    private List<C36724e> m144820c(List<Chatter> list) {
        ArrayList arrayList = new ArrayList();
        if (list.size() > 0) {
            C36724e eVar = new C36724e();
            eVar.mo135379a(1, 1, null);
            arrayList.add(eVar);
        }
        for (Chatter chatter : list) {
            C36724e eVar2 = new C36724e();
            eVar2.mo135379a(2, 1, chatter);
            arrayList.add(eVar2);
        }
        return arrayList;
    }

    /* renamed from: d */
    private void m144824d(Message message) {
        this.textMessageTV.setVisibility(0);
        this.mImageView.setVisibility(8);
        this.mPostView.setVisibility(8);
        this.textMessageTV.setText(C36618a.m144492a().mo135104i().mo135128a(this.f94358l, message, this.textMessageTV.getCurrentTextColor()));
    }

    /* renamed from: e */
    private void m144826e(Message message) {
        this.textMessageTV.setVisibility(8);
        this.mImageView.setVisibility(8);
        this.mPostView.setVisibility(0);
        C36638c b = this.f94348b.mo135139b(this.f94358l, message);
        if (b != null) {
            this.mPostView.mo135326a(b.mo135179a(), b.mo135180b());
        }
    }

    /* renamed from: f */
    private void m144827f(Message message) {
        this.textMessageTV.setVisibility(0);
        this.mImageView.setVisibility(8);
        this.mPostView.setVisibility(8);
        MergeForwardContent mergeForwardContent = (MergeForwardContent) message.getContent();
        if (mergeForwardContent != null) {
            StringBuilder sb = new StringBuilder();
            C36637b a = this.f94347a.mo135126a(mergeForwardContent);
            sb.append(a.f94242a);
            sb.append("\n");
            sb.append(a.f94243b);
            this.textMessageTV.setText(sb.toString());
        }
    }

    /* renamed from: g */
    private void m144828g(Message message) {
        this.textMessageTV.setVisibility(0);
        this.mImageView.setVisibility(8);
        this.mPostView.setVisibility(8);
        ProfileContent profileContent = (ProfileContent) message.getContent();
        if (profileContent != null) {
            this.textMessageTV.setText(UIHelper.mustacheFormat((int) R.string.Lark_Legacy_PreviewUserCard, "user_name", profileContent.getDisplayName()));
        }
    }

    /* renamed from: b */
    private void m144818b(Message message) {
        this.textMessageTV.setVisibility(0);
        this.mImageView.setVisibility(8);
        this.mPostView.setVisibility(8);
        String a = this.f94348b.mo135130a(this.f94358l, message);
        if (a != null) {
            this.textMessageTV.setText(UIHelper.mustacheFormat((int) R.string.Lark_Legacy_DingAudioContent, "duration", a));
        }
    }

    /* renamed from: c */
    private void m144822c(Message message) {
        this.textMessageTV.setVisibility(8);
        this.mImageView.setVisibility(0);
        this.mPostView.setVisibility(8);
        ImageContent imageContent = (ImageContent) message.getContent();
        if (imageContent != null) {
            Image a = C36618a.m144492a().mo135104i().mo135127a(imageContent);
            Drawable drawable = UIHelper.getDrawable(R.drawable.common_failed_chat_picture);
            Drawable drawable2 = UIUtils.getDrawable(this.f94358l, R.drawable.common_chat_window_image_item_holder);
            int dp2px = UIUtils.dp2px(this.f94358l, 120.0f);
            C36618a.m144492a().mo135103h().mo135151a(this.f94358l, this.mImageView, a.getKey(), dp2px, dp2px, drawable, drawable2);
            return;
        }
        m144814a(this.f94358l, this.mImageView);
    }

    /* renamed from: d */
    private void m144825d(List<Chatter> list) {
        this.f94356j = new ArrayList();
        this.f94357k = new ArrayList();
        for (Chatter chatter : list) {
            if (chatter.isAcceptSmsPhoneUrgent()) {
                this.f94356j.add(chatter);
            } else {
                this.f94357k.add(chatter);
            }
        }
    }

    @Override // com.ss.android.lark.ding.service.impl.controller.C36752j.AbstractC36755b
    /* renamed from: b */
    public void mo135342b(String str) {
        new C25639g(this.f94358l).mo89242c(str).mo89238b(true).mo89251j(2).mo89225a(R.id.lkui_dialog_btn_right, UIHelper.getString(R.string.Lark_Chat_ExecutiveModeConfirm), (DialogInterface.OnClickListener) null).mo89239c();
    }

    @Override // com.ss.android.lark.ding.service.impl.controller.C36752j.AbstractC36755b
    /* renamed from: c */
    public void mo135345c(String str) {
        new C25639g(this.f94358l).mo89242c(str).mo89251j(2).mo89225a(R.id.lkui_dialog_btn_left, UIHelper.getString(R.string.Lark_Chat_ExecutiveModeCancel), (DialogInterface.OnClickListener) null).mo89225a(R.id.lkui_dialog_btn_right, UIHelper.getString(R.string.Lark_Chat_ExecutiveModeIgnoreAndSend), new DialogInterface.OnClickListener() {
            /* class com.ss.android.lark.ding.service.impl.controller.DingView.DialogInterface$OnClickListenerC367046 */

            public void onClick(DialogInterface dialogInterface, int i) {
                DingView.this.f94350d.mo135429b(DingView.this.f94352f, DingView.this.f94354h, DingView.this.f94357k, DingView.this.f94356j);
            }
        }).mo89239c();
    }

    /* renamed from: a */
    public void mo135331a(int i) {
        if (i == 1) {
            this.f94351e.diff(m144820c(this.f94359m));
            return;
        }
        this.f94351e.mo135329a(this.f94356j.size(), this.f94357k.size());
        this.f94351e.diff(m144813a(this.f94357k, this.f94356j, i));
    }

    @Override // com.ss.android.lark.ding.service.impl.controller.C36752j.AbstractC36755b
    /* renamed from: a */
    public void mo135335a(String str) {
        LKUIToast.show(this.f94358l, str);
    }

    @Override // com.ss.android.lark.ding.service.impl.controller.C36752j.AbstractC36755b
    /* renamed from: a */
    public void mo135332a(Message message, DingStatus dingStatus) {
        this.f94349c.mo135354a(message, dingStatus);
    }

    public DingView(Context context, AbstractC36705a aVar) {
        this.f94358l = context;
        this.f94349c = aVar;
        this.f94347a = C36618a.m144492a().mo135104i();
    }

    /* renamed from: a */
    public static void m144814a(Context context, ImageView imageView) {
        int a = ImageUtils.m224128a(context);
        ImageLoader.with(context).load(Integer.valueOf((int) R.drawable.common_chat_window_image_item_holder)).override(a, a).centerCrop().into(imageView);
    }

    /* renamed from: a */
    private void m144816a(List<Chatter> list, boolean z) {
        this.f94354h = z;
        GridLayoutManager gridLayoutManager = new GridLayoutManager(this.f94358l, 5);
        this.dingUsersRV.setLayoutManager(gridLayoutManager);
        this.f94351e = new DingUsersShowAdapter(m144820c(list), z);
        gridLayoutManager.mo6501a(new GridLayoutManager.AbstractC1297b() {
            /* class com.ss.android.lark.ding.service.impl.controller.DingView.C367014 */

            @Override // androidx.recyclerview.widget.GridLayoutManager.AbstractC1297b
            /* renamed from: a */
            public int mo6533a(int i) {
                int itemViewType = DingView.this.f94351e.getItemViewType(i);
                if (itemViewType == 1 || itemViewType == 3) {
                    return 5;
                }
                return 1;
            }
        });
        C58996h.m228978b(this.dingUsersRV);
        this.dingUsersRV.setAdapter(this.f94351e);
    }

    /* renamed from: b */
    public void mo135344b(boolean z, int i) {
        if (z && i == 2) {
            mo135335a(this.f94358l.getString(R.string.Lark_buzz_TheOtherMessage));
        } else if (z && i == 3) {
            mo135335a(this.f94358l.getString(R.string.Lark_buzz_TheOtherPhoneCall));
        } else if (!z && i == 2) {
            mo135335a(this.f94358l.getString(R.string.Lark_buzz_HaveNotOpenedMessage));
        } else if (!z && i == 3) {
            mo135335a(this.f94358l.getString(R.string.Lark_buzz_HaveNotOpenedPhoneCall));
        }
    }

    /* renamed from: a */
    private List<C36724e> m144813a(List<Chatter> list, List<Chatter> list2, int i) {
        ArrayList arrayList = new ArrayList();
        if (list.size() > 0) {
            C36724e eVar = new C36724e();
            eVar.mo135379a(1, i, null);
            arrayList.add(eVar);
        }
        for (Chatter chatter : list) {
            C36724e eVar2 = new C36724e();
            eVar2.mo135379a(2, i, chatter);
            arrayList.add(eVar2);
        }
        if (list2.size() > 0) {
            C36724e eVar3 = new C36724e();
            eVar3.mo135379a(3, i, null);
            arrayList.add(eVar3);
        }
        for (Chatter chatter2 : list2) {
            C36724e eVar4 = new C36724e();
            eVar4.mo135379a(2, i, chatter2);
            arrayList.add(eVar4);
        }
        return arrayList;
    }

    @Override // com.ss.android.lark.ding.service.impl.controller.C36752j.AbstractC36755b
    /* renamed from: a */
    public void mo135333a(Message message, List<Chatter> list, boolean z) {
        if (message.getType() == Message.Type.TEXT) {
            m144815a(message);
        } else if (message.getType() == Message.Type.IMAGE) {
            m144822c(message);
        } else if (message.getType() == Message.Type.POST) {
            m144826e(message);
        } else if (message.getType() == Message.Type.AUDIO) {
            m144818b(message);
        } else if (message.getType() == Message.Type.MERGE_FORWARD) {
            m144827f(message);
        } else if (message.getType() == Message.Type.SHARE_USER_CARD) {
            m144828g(message);
        } else {
            m144824d(message);
        }
        m144816a(list, z);
        mo135337a(list);
    }
}
