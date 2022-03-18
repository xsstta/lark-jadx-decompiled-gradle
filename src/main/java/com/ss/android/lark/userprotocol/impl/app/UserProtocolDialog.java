package com.ss.android.lark.userprotocol.impl.app;

import android.content.Context;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.huawei.hms.support.api.entity.auth.AuthCode;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.userprotocol.C57712a;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.lark.widget.linked_emojicon.widget.LinkEmojiTextView;
import com.ss.android.lark.widget.richtext.RichText;
import com.ss.android.lark.widget.richtext.RichTextView;

public class UserProtocolDialog extends DialogC57725a {

    /* renamed from: b */
    public C57724b f142206b;

    /* renamed from: c */
    private Context f142207c;
    @BindView(5300)
    public TextView titleView;
    @BindView(AuthCode.StatusCode.AUTH_INFO_NOT_EXIST)
    public View userPtocolCheckGroup;
    @BindView(AuthCode.StatusCode.CERT_FINGERPRINT_ERROR)
    public ImageButton userPtocolCheckIcon;
    @BindView(AuthCode.StatusCode.PERMISSION_NOT_AUTHORIZED)
    public TextView userPtocolConfirm;
    @BindView(6007)
    public RichTextView userPtocolContent;

    /* renamed from: com.ss.android.lark.userprotocol.impl.app.UserProtocolDialog$a */
    public interface AbstractC57723a {
        /* renamed from: a */
        void mo195892a(String str);
    }

    /* renamed from: com.ss.android.lark.userprotocol.impl.app.UserProtocolDialog$b */
    public static class C57724b {

        /* renamed from: a */
        private String f142214a;

        /* renamed from: b */
        private RichText f142215b;

        /* renamed from: c */
        private String f142216c;

        /* renamed from: d */
        private String f142217d;

        /* renamed from: e */
        private String f142218e;

        /* renamed from: a */
        public String mo195893a() {
            return this.f142214a;
        }

        /* renamed from: b */
        public RichText mo195894b() {
            return this.f142215b;
        }

        /* renamed from: c */
        public String mo195895c() {
            return this.f142216c;
        }

        public C57724b(String str, RichText richText, String str2, String str3, String str4) {
            this.f142214a = str;
            this.f142215b = richText;
            this.f142216c = str2;
            this.f142217d = str3;
            this.f142218e = str4;
        }
    }

    @Override // com.ss.android.lark.userprotocol.impl.app.DialogC57725a
    public void show() {
        getWindow().getAttributes().width = getContext().getResources().getDisplayMetrics().widthPixels - UIUtils.dp2px(this.f142207c, 75.0f);
        super.show();
    }

    public UserProtocolDialog(final Context context, C57724b bVar, final AbstractC57723a aVar) {
        super(context, R.style.UserProtocolDialog);
        setContentView(R.layout.view_dialog_user_protocol);
        ButterKnife.bind(this);
        this.f142207c = context;
        this.f142206b = bVar;
        View$OnClickListenerC577201 r0 = new View.OnClickListener() {
            /* class com.ss.android.lark.userprotocol.impl.app.UserProtocolDialog.View$OnClickListenerC577201 */

            public void onClick(View view) {
                int i;
                UserProtocolDialog.this.userPtocolCheckIcon.setSelected(!UserProtocolDialog.this.userPtocolCheckIcon.isSelected());
                TextView textView = UserProtocolDialog.this.userPtocolConfirm;
                Context context = context;
                if (UserProtocolDialog.this.userPtocolCheckIcon.isSelected()) {
                    i = R.color.lkui_B500;
                } else {
                    i = R.color.lkui_N400;
                }
                textView.setTextColor(UIUtils.getColor(context, i));
            }
        };
        this.userPtocolCheckGroup.setOnClickListener(r0);
        this.userPtocolCheckIcon.setOnClickListener(r0);
        this.titleView.setText(UIHelper.mustacheFormat((int) R.string.Lark_Legacy_DialogTitle));
        this.titleView.setText(bVar.mo195893a());
        this.userPtocolContent.setTextSize((float) UIUtils.dp2px(context, 14.0f));
        this.userPtocolContent.setTextColor(UIUtils.getColor(context, R.color.lkui_N900));
        this.userPtocolContent.mo200511a(false);
        this.userPtocolContent.setUrlStringClickListner(new LinkEmojiTextView.AbstractC58525j() {
            /* class com.ss.android.lark.userprotocol.impl.app.UserProtocolDialog.C577212 */

            @Override // com.ss.android.lark.widget.linked_emojicon.widget.LinkEmojiTextView.AbstractC58525j
            /* renamed from: b */
            public boolean mo122807b(View view, String str) {
                return false;
            }

            @Override // com.ss.android.lark.widget.linked_emojicon.widget.LinkEmojiTextView.AbstractC58525j
            /* renamed from: a */
            public void mo122806a(View view, String str) {
                C57712a.m224049a().mo177760b(context, str);
            }
        });
        this.userPtocolConfirm.setOnClickListener(new View.OnClickListener() {
            /* class com.ss.android.lark.userprotocol.impl.app.UserProtocolDialog.View$OnClickListenerC577223 */

            public void onClick(View view) {
                String c;
                if (UserProtocolDialog.this.userPtocolCheckIcon.isSelected() && (c = UserProtocolDialog.this.f142206b.mo195895c()) != null) {
                    aVar.mo195892a(c);
                }
            }
        });
        this.userPtocolContent.setNeedShowAtDot(false);
        this.userPtocolContent.setInfo(bVar.mo195894b());
    }
}
