package com.ss.android.lark.mail.impl.share;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import com.bytedance.lark.pb.email.client.v1.CollaboratorType;
import com.bytedance.lark.pb.email.client.v1.Draft;
import com.bytedance.lark.pb.email.client.v1.MailGetThreadCollaboratorsInfoResponse;
import com.bytedance.lark.pb.email.client.v1.PermissionCode;
import com.bytedance.lark.pb.email.client.v1.UserInfo;
import com.larksuite.component.ui.imageview.LKUIRoundedImageView;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.utils.CollectionUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.mail.impl.AbstractC41849c;
import com.ss.android.lark.mail.impl.C41816b;
import com.ss.android.lark.mail.impl.p2168g.C42176e;
import com.ss.android.lark.mail.impl.p2195i.C42699a;
import com.ss.android.lark.mail.impl.utils.C43849u;
import com.ss.android.lark.utils.UIHelper;
import java.util.List;

/* renamed from: com.ss.android.lark.mail.impl.share.c */
public class C43645c extends PopupWindow {

    /* renamed from: a */
    public Context f110729a;

    /* renamed from: b */
    String f110730b;

    /* renamed from: c */
    String f110731c;

    /* renamed from: d */
    public TextView f110732d;

    /* renamed from: e */
    public ImageView f110733e;

    /* renamed from: f */
    public LinearLayout f110734f;

    /* renamed from: g */
    public PermissionCode f110735g;

    /* renamed from: h */
    private final String f110736h = "ShareEntrancePopupWindow";

    /* renamed from: i */
    private AbstractC43652a f110737i;

    /* renamed from: j */
    private View f110738j;

    /* renamed from: k */
    private View f110739k;

    /* renamed from: l */
    private View f110740l;

    /* renamed from: m */
    private TextView f110741m;

    /* renamed from: n */
    private final int f110742n = 7;

    /* renamed from: o */
    private final int f110743o = 6;

    /* renamed from: p */
    private int f110744p;

    /* renamed from: q */
    private int f110745q;

    /* renamed from: r */
    private int f110746r;

    /* renamed from: s */
    private Draft f110747s;

    /* renamed from: com.ss.android.lark.mail.impl.share.c$a */
    public interface AbstractC43652a {
    }

    /* renamed from: b */
    private void m173197b() {
        C42176e.m168344a().mo152260i(this.f110730b, new IGetDataCallback<MailGetThreadCollaboratorsInfoResponse>() {
            /* class com.ss.android.lark.mail.impl.share.C43645c.C436494 */

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                Log.m165383e("ShareEntrancePopupWindow", "fetchCollaboratorList onError");
            }

            /* renamed from: a */
            public void onSuccess(MailGetThreadCollaboratorsInfoResponse mailGetThreadCollaboratorsInfoResponse) {
                Log.m165389i("ShareEntrancePopupWindow", "fetchCollaboratorList onSuccess");
                if (mailGetThreadCollaboratorsInfoResponse == null) {
                    Log.m165383e("ShareEntrancePopupWindow", "fetchCollaboratorList response null");
                } else if (TextUtils.isEmpty(mailGetThreadCollaboratorsInfoResponse.threadId) || !mailGetThreadCollaboratorsInfoResponse.threadId.equals(C43645c.this.f110730b)) {
                    Log.m165383e("ShareEntrancePopupWindow", "fetchCollaboratorList invalid thread");
                } else {
                    C43645c.this.mo155707a(mailGetThreadCollaboratorsInfoResponse.users);
                }
            }
        });
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.lark.mail.impl.share.c$6 */
    public static /* synthetic */ class C436516 {

        /* renamed from: a */
        static final /* synthetic */ int[] f110754a;

        static {
            int[] iArr = new int[PermissionCode.values().length];
            f110754a = iArr;
            try {
                iArr[PermissionCode.OWNER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
        }
    }

    /* renamed from: a */
    private void m173196a() {
        int windowWidth = UIHelper.getWindowWidth(this.f110729a);
        View inflate = LayoutInflater.from(this.f110729a).inflate(R.layout.mail_message_list_share_entrance_view, (ViewGroup) null);
        this.f110739k = inflate;
        setContentView(inflate);
        setWidth(windowWidth);
        setHeight(this.f110729a.getResources().getDimensionPixelSize(R.dimen.mail_message_list_share_view_title_container_height) + this.f110729a.getResources().getDimensionPixelSize(R.dimen.mail_message_list_share_view_avatar_container_height));
        setFocusable(true);
        setOnDismissListener(new PopupWindow.OnDismissListener() {
            /* class com.ss.android.lark.mail.impl.share.C43645c.C436461 */

            public void onDismiss() {
                C43645c.this.mo155703a(1.0f);
            }
        });
        this.f110739k.setOnClickListener(new View.OnClickListener() {
            /* class com.ss.android.lark.mail.impl.share.C43645c.View$OnClickListenerC436472 */

            public void onClick(View view) {
                Log.m165389i("ShareEntrancePopupWindow", "onClick share entrance");
                C42699a.m170265b(C43645c.this.f110729a, C43645c.this.f110730b, C43645c.this.f110735g);
                C43645c.this.dismiss();
            }
        });
        this.f110740l = this.f110739k.findViewById(R.id.message_list_share_entrance_title_container);
        this.f110741m = (TextView) this.f110739k.findViewById(R.id.message_list_share_entrance_title);
        this.f110732d = (TextView) this.f110739k.findViewById(R.id.message_list_share_entrance_view_number);
        this.f110734f = (LinearLayout) this.f110739k.findViewById(R.id.message_list_share_entrance_avatar_container);
        this.f110734f.setPadding(this.f110729a.getResources().getDimensionPixelSize(R.dimen.mail_message_list_share_view_vertical_space), 0, 0, 0);
        ImageView imageView = (ImageView) this.f110739k.findViewById(R.id.message_list_share_entrance_add_button);
        this.f110733e = imageView;
        imageView.setOnClickListener(new View.OnClickListener() {
            /* class com.ss.android.lark.mail.impl.share.C43645c.View$OnClickListenerC436483 */

            public void onClick(View view) {
                Log.m165389i("ShareEntrancePopupWindow", "onClick addButton");
                C42699a.m170233a(C43645c.this.f110729a, C43645c.this.f110730b, C43645c.this.f110735g);
                C43645c.this.dismiss();
            }
        });
        this.f110745q = this.f110729a.getResources().getDimensionPixelSize(R.dimen.mail_message_list_share_view_avatar_size);
        this.f110744p = (int) this.f110729a.getResources().getDimension(R.dimen.mail_message_list_share_view_avatar_size);
        this.f110746r = ((windowWidth - (this.f110745q * 7)) - (this.f110729a.getResources().getDimensionPixelSize(R.dimen.mail_message_list_share_view_vertical_space) * 2)) / 6;
    }

    /* renamed from: a */
    public void mo155704a(PermissionCode permissionCode) {
        mo155705a(permissionCode, null);
    }

    /* renamed from: a */
    public void mo155707a(final List<UserInfo> list) {
        C43849u.m173826a(new Runnable() {
            /* class com.ss.android.lark.mail.impl.share.C43645c.RunnableC436505 */

            public void run() {
                boolean z;
                int i;
                String str;
                boolean z2;
                while (C43645c.this.f110734f.getChildCount() > 1) {
                    C43645c.this.f110734f.removeViewAt(1);
                }
                if (C43645c.this.f110735g == PermissionCode.OWNER) {
                    C43645c.this.f110733e.setVisibility(0);
                    i = 6;
                    z = true;
                } else {
                    C43645c.this.f110733e.setVisibility(8);
                    i = 7;
                    z = false;
                }
                if (CollectionUtils.isEmpty(list)) {
                    Log.m165383e("ShareEntrancePopupWindow", "updateShareList empty list");
                    return;
                }
                int size = list.size();
                C43645c.this.f110732d.setText(String.valueOf(size));
                if (size <= i) {
                    i = size;
                }
                for (int i2 = 0; i2 < i; i2++) {
                    UserInfo userInfo = (UserInfo) list.get(i2);
                    if (userInfo != null) {
                        C43645c cVar = C43645c.this;
                        String str2 = userInfo.avatar;
                        if (userInfo.collaborator_type != CollaboratorType.GROUP || TextUtils.isEmpty(userInfo.chat_id)) {
                            str = userInfo.user_id;
                        } else {
                            str = userInfo.chat_id;
                        }
                        if (i2 != 0 || z) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        cVar.mo155706a(str2, str, z2);
                    }
                }
            }
        });
    }

    /* renamed from: a */
    public void mo155703a(float f) {
        try {
            Window window = ((Activity) this.f110729a).getWindow();
            WindowManager.LayoutParams attributes = window.getAttributes();
            attributes.alpha = f;
            window.setAttributes(attributes);
        } catch (Exception e) {
            Log.m165384e("ShareEntrancePopupWindow", "setWindowAlpha", e);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.lark.mail.impl.share.c$b */
    public class C43653b extends LKUIRoundedImageView {
        @Override // com.larksuite.component.ui.imageview.LKUIRoundedImageView
        public void setSelected(boolean z) {
        }

        public C43653b(Context context) {
            super(context);
        }
    }

    /* renamed from: a */
    public void mo155705a(PermissionCode permissionCode, Draft draft) {
        Log.m165389i("ShareEntrancePopupWindow", "showShareEntranceView");
        if (permissionCode == null || permissionCode == PermissionCode.NONE) {
            Log.m165383e("ShareEntrancePopupWindow", "showShareEntranceView invalid code, abort");
            return;
        }
        this.f110735g = permissionCode;
        this.f110747s = draft;
        m173197b();
        if (C436516.f110754a[this.f110735g.ordinal()] != 1) {
            this.f110741m.setText(R.string.Mail_Share_CheckSharing);
        } else {
            this.f110741m.setText(R.string.Mail_Share_ShareManageButton);
        }
        showAtLocation(this.f110738j, 80, 0, 0);
        mo155703a(0.7f);
    }

    /* renamed from: a */
    public void mo155706a(String str, String str2, boolean z) {
        if (!TextUtils.isEmpty(str)) {
            C43653b bVar = new C43653b(this.f110729a);
            bVar.setOval(true);
            bVar.setBackgroundResource(R.drawable.mail_share_oval_avatar_background);
            AbstractC41849c.AbstractC41861l v = C41816b.m166115a().mo150155v();
            Context context = this.f110729a;
            int i = this.f110744p;
            v.mo150206a(context, str, str2, bVar, i, i);
            int i2 = this.f110745q;
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(i2, i2);
            if (z) {
                layoutParams.leftMargin = this.f110746r;
            }
            this.f110734f.addView(bVar, layoutParams);
        }
    }

    public C43645c(Context context, AbstractC43652a aVar, View view, String str, String str2, PermissionCode permissionCode) {
        this.f110729a = context;
        if (!(context instanceof Activity)) {
            Log.m165397w("ShareEntrancePopupWindow", "context not activity");
        }
        this.f110737i = aVar;
        this.f110738j = view;
        this.f110730b = str;
        this.f110731c = str2;
        this.f110735g = permissionCode;
        m173196a();
    }
}
