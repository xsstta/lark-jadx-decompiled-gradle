package com.ss.android.lark.chat.chatwindow.chat.banner.component;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.larksuite.component.ui.toast.LKUIToast;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.callback.UIGetDataCallback;
import com.larksuite.suite.R;
import com.ss.android.lark.C29990c;
import com.ss.android.lark.chat.chatwindow.chat.banner.AbstractC33152a;
import com.ss.android.lark.chat.chatwindow.chat.banner.AbstractC33155c;
import com.ss.android.lark.image.ImageLoader;
import com.ss.android.lark.image.entity.AvatarImage;
import com.ss.android.lark.statistics.chat.ChatHitPoint;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.lark.widget.listener.OnSingleClickListener;

public class ApplyMessageBanner extends AbstractC33152a<C33164a> {

    /* renamed from: j */
    private static final int f85325j = UIHelper.dp2px(36.0f);

    /* renamed from: h */
    public ViewHolder f85326h;

    /* renamed from: i */
    private C33164a f85327i;

    @Override // com.ss.android.lark.chat.chatwindow.chat.banner.AbstractC33152a, com.ss.android.lark.chat.chatwindow.chat.banner.AbstractC33187f
    /* renamed from: f */
    public int mo122352f() {
        return R.layout.apply_message_banner;
    }

    @Override // com.ss.android.lark.chat.chatwindow.chat.banner.AbstractC33187f
    /* renamed from: i */
    public int mo122363i() {
        return 32;
    }

    /* renamed from: com.ss.android.lark.chat.chatwindow.chat.banner.component.ApplyMessageBanner$b */
    public static class C33165b extends AbstractC33152a.AbstractC33153a {
        @Override // com.ss.android.lark.chat.chatwindow.chat.banner.AbstractC33152a.AbstractC33153a
        /* renamed from: a */
        public AbstractC33152a mo122358a() {
            return new ApplyMessageBanner(this);
        }
    }

    /* renamed from: j */
    public static AbstractC33152a.AbstractC33153a m128160j() {
        return new C33165b();
    }

    public class ViewHolder_ViewBinding implements Unbinder {

        /* renamed from: a */
        private ViewHolder f85335a;

        @Override // butterknife.Unbinder
        public void unbind() {
            ViewHolder viewHolder = this.f85335a;
            if (viewHolder != null) {
                this.f85335a = null;
                viewHolder.mApplyAvatar = null;
                viewHolder.mApplyReason = null;
                viewHolder.mAgreeButton = null;
                viewHolder.mCloseButton = null;
                return;
            }
            throw new IllegalStateException("Bindings already cleared.");
        }

        public ViewHolder_ViewBinding(ViewHolder viewHolder, View view) {
            this.f85335a = viewHolder;
            viewHolder.mApplyAvatar = (ImageView) Utils.findRequiredViewAsType(view, R.id.apply_avatar, "field 'mApplyAvatar'", ImageView.class);
            viewHolder.mApplyReason = (TextView) Utils.findRequiredViewAsType(view, R.id.apply_reason, "field 'mApplyReason'", TextView.class);
            viewHolder.mAgreeButton = (TextView) Utils.findRequiredViewAsType(view, R.id.agree_button, "field 'mAgreeButton'", TextView.class);
            viewHolder.mCloseButton = (ImageView) Utils.findRequiredViewAsType(view, R.id.close_button, "field 'mCloseButton'", ImageView.class);
        }
    }

    public ApplyMessageBanner(AbstractC33152a.AbstractC33153a aVar) {
        super(aVar);
    }

    /* renamed from: a */
    public void mo122361a(final C33164a aVar) {
        if (aVar != null && this.f85326h != null) {
            this.f85327i = aVar;
            String str = aVar.f85337b;
            String str2 = aVar.f85336a;
            int i = f85325j;
            ImageLoader.with(this.f85326h.f85334a).load(AvatarImage.Builder.obtain(str, str2, i, i).build()).into(this.f85326h.mApplyAvatar);
            if (!TextUtils.isEmpty(aVar.f85338c)) {
                this.f85326h.mApplyReason.setText(UIHelper.mustacheFormat((int) R.string.Lark_NewContacts_UserWantsToAddYouMessage, "RequestMessage", aVar.f85338c));
            }
            this.f85326h.mAgreeButton.setOnClickListener(new OnSingleClickListener() {
                /* class com.ss.android.lark.chat.chatwindow.chat.banner.component.ApplyMessageBanner.C331601 */

                @Override // com.ss.android.lark.widget.listener.OnSingleClickListener
                public void onSingleClick(View view) {
                    ChatHitPoint.f135648a.mo187361b("accept_recipient");
                    C29990c.m110930b().ah().mo134650c(aVar.f85339d, new UIGetDataCallback(new IGetDataCallback<Boolean>() {
                        /* class com.ss.android.lark.chat.chatwindow.chat.banner.component.ApplyMessageBanner.C331601.C331611 */

                        @Override // com.larksuite.framework.callback.IGetDataCallback
                        public void onError(ErrorResult errorResult) {
                            LKUIToast.show(ApplyMessageBanner.this.f85326h.f85334a, (int) R.string.Lark_Legacy_NetworkError);
                        }

                        /* renamed from: a */
                        public void onSuccess(Boolean bool) {
                            ApplyMessageBanner.this.mo122354h().mo122339a();
                            ApplyMessageBanner.this.mo122350d().mo122182c();
                        }
                    }));
                }
            });
            this.f85326h.mCloseButton.setOnClickListener(new OnSingleClickListener() {
                /* class com.ss.android.lark.chat.chatwindow.chat.banner.component.ApplyMessageBanner.C331622 */

                @Override // com.ss.android.lark.widget.listener.OnSingleClickListener
                public void onSingleClick(View view) {
                    ChatHitPoint.f135648a.mo187361b("close_recipient");
                    C29990c.m110930b().ah().mo134651d(aVar.f85336a, new UIGetDataCallback(new IGetDataCallback<Boolean>() {
                        /* class com.ss.android.lark.chat.chatwindow.chat.banner.component.ApplyMessageBanner.C331622.C331631 */

                        /* renamed from: a */
                        public void onSuccess(Boolean bool) {
                            ApplyMessageBanner.this.mo122354h().mo122339a();
                        }

                        @Override // com.larksuite.framework.callback.IGetDataCallback
                        public void onError(ErrorResult errorResult) {
                            ApplyMessageBanner.this.mo122354h().mo122339a();
                        }
                    }));
                }
            });
        }
    }

    /* access modifiers changed from: package-private */
    public static class ViewHolder {

        /* renamed from: a */
        Context f85334a;
        @BindView(7175)
        TextView mAgreeButton;
        @BindView(7197)
        ImageView mApplyAvatar;
        @BindView(7201)
        TextView mApplyReason;
        @BindView(7446)
        ImageView mCloseButton;

        public ViewHolder(View view, Context context) {
            this.f85334a = context;
            ButterKnife.bind(this, view);
        }
    }

    /* renamed from: a */
    public void mo122345a(View view, C33164a aVar) {
        super.mo122345a(view, (AbstractC33155c) aVar);
        this.f85326h = new ViewHolder(view, view.getContext());
        mo122361a(aVar);
    }

    /* renamed from: com.ss.android.lark.chat.chatwindow.chat.banner.component.ApplyMessageBanner$a */
    public static class C33164a implements AbstractC33155c {

        /* renamed from: a */
        public String f85336a;

        /* renamed from: b */
        public String f85337b;

        /* renamed from: c */
        public String f85338c;

        /* renamed from: d */
        public String f85339d;

        public C33164a(String str, String str2, String str3, String str4) {
            this.f85336a = str;
            this.f85337b = str2;
            this.f85338c = str3;
            this.f85339d = str4;
        }
    }
}
