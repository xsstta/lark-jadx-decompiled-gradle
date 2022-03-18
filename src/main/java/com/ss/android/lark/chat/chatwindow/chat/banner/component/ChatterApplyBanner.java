package com.ss.android.lark.chat.chatwindow.chat.banner.component;

import android.content.Context;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.larksuite.component.universe_design.color.UDColorUtils;
import com.larksuite.component.universe_design.notice.UDNotice;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.callback.UIGetDataCallback;
import com.larksuite.suite.R;
import com.ss.android.lark.C29990c;
import com.ss.android.lark.chat.api.service.p1600b.C32821b;
import com.ss.android.lark.chat.chatwindow.chat.banner.AbstractC33152a;
import com.ss.android.lark.chat.chatwindow.chat.banner.AbstractC33155c;
import com.ss.android.lark.dependency.IChatSettingDependency;
import com.ss.android.lark.statistics.chat.ChatHitPoint;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.lark.widget.listener.OnSingleClickListener;

public class ChatterApplyBanner extends AbstractC33152a<C33176a> {

    /* renamed from: h */
    public final IChatSettingDependency f85356h = C29990c.m110930b().mo134595w();

    /* renamed from: i */
    private ViewHolder f85357i = null;

    /* renamed from: j */
    private C33176a f85358j = null;

    @Override // com.ss.android.lark.chat.chatwindow.chat.banner.AbstractC33152a, com.ss.android.lark.chat.chatwindow.chat.banner.AbstractC33187f
    /* renamed from: f */
    public int mo122352f() {
        return R.layout.chatter_apply_banner;
    }

    @Override // com.ss.android.lark.chat.chatwindow.chat.banner.AbstractC33187f
    /* renamed from: i */
    public int mo122363i() {
        return 2;
    }

    /* renamed from: com.ss.android.lark.chat.chatwindow.chat.banner.component.ChatterApplyBanner$b */
    public static class C33177b extends AbstractC33152a.AbstractC33153a {
        @Override // com.ss.android.lark.chat.chatwindow.chat.banner.AbstractC33152a.AbstractC33153a
        /* renamed from: a */
        public AbstractC33152a mo122358a() {
            return new ChatterApplyBanner(this);
        }
    }

    /* renamed from: j */
    public static AbstractC33152a.AbstractC33153a m128183j() {
        return new C33177b();
    }

    public class ViewHolder_ViewBinding implements Unbinder {

        /* renamed from: a */
        private ViewHolder f85366a;

        @Override // butterknife.Unbinder
        public void unbind() {
            ViewHolder viewHolder = this.f85366a;
            if (viewHolder != null) {
                this.f85366a = null;
                viewHolder.notice = null;
                return;
            }
            throw new IllegalStateException("Bindings already cleared.");
        }

        public ViewHolder_ViewBinding(ViewHolder viewHolder, View view) {
            this.f85366a = viewHolder;
            viewHolder.notice = (UDNotice) Utils.findRequiredViewAsType(view, R.id.notice, "field 'notice'", UDNotice.class);
        }
    }

    /* access modifiers changed from: package-private */
    public static class ViewHolder {

        /* renamed from: a */
        View f85365a;
        @BindView(8323)
        UDNotice notice;

        public ViewHolder(View view) {
            this.f85365a = view;
            ButterKnife.bind(this, view);
        }
    }

    public ChatterApplyBanner(AbstractC33152a.AbstractC33153a aVar) {
        super(aVar);
    }

    /* renamed from: a */
    public void mo122361a(C33176a aVar) {
        ViewHolder viewHolder = this.f85357i;
        if (viewHolder != null && aVar != null) {
            this.f85358j = aVar;
            Context context = viewHolder.notice.getContext();
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            SpannableString spannableString = new SpannableString(UIHelper.getQuantityString(R.plurals.Lark_Groups_NewNumPendingRequests, aVar.f85368b));
            spannableString.setSpan(new ForegroundColorSpan(UDColorUtils.getColor(context, R.color.text_title)), 0, spannableString.length(), 33);
            spannableStringBuilder.append((CharSequence) spannableString);
            SpannableString spannableString2 = new SpannableString(UIHelper.getString(R.string.Lark_Groups_NewClickToViewPendingRequests));
            spannableString2.setSpan(new ForegroundColorSpan(UDColorUtils.getColor(context, R.color.text_link_normal)), 0, spannableString2.length(), 33);
            spannableStringBuilder.append((CharSequence) spannableString2);
            this.f85357i.notice.setText(spannableStringBuilder);
        }
    }

    /* renamed from: com.ss.android.lark.chat.chatwindow.chat.banner.component.ChatterApplyBanner$a */
    public static class C33176a implements AbstractC33155c {

        /* renamed from: a */
        String f85367a;

        /* renamed from: b */
        int f85368b;

        public C33176a(String str, int i) {
            this.f85367a = str;
            this.f85368b = i;
        }
    }

    /* renamed from: a */
    public void mo122345a(final View view, final C33176a aVar) {
        super.mo122345a(view, (AbstractC33155c) aVar);
        ViewHolder viewHolder = new ViewHolder(view);
        this.f85357i = viewHolder;
        viewHolder.notice.setIconButtonListener(new OnSingleClickListener() {
            /* class com.ss.android.lark.chat.chatwindow.chat.banner.component.ChatterApplyBanner.C331731 */

            @Override // com.ss.android.lark.widget.listener.OnSingleClickListener
            public void onSingleClick(View view) {
                ChatHitPoint.f135648a.mo187363c();
                C32821b.m126120a().mo121063f(aVar.f85367a, false, (IGetDataCallback<Boolean>) new UIGetDataCallback(new IGetDataCallback<Boolean>() {
                    /* class com.ss.android.lark.chat.chatwindow.chat.banner.component.ChatterApplyBanner.C331731.C331741 */

                    @Override // com.larksuite.framework.callback.IGetDataCallback
                    public void onError(ErrorResult errorResult) {
                    }

                    /* renamed from: a */
                    public void onSuccess(Boolean bool) {
                        ChatterApplyBanner.this.mo122354h().mo122339a();
                        ChatterApplyBanner.this.mo122350d().mo122182c();
                    }
                }));
            }
        });
        this.f85357i.f85365a.setOnClickListener(new OnSingleClickListener() {
            /* class com.ss.android.lark.chat.chatwindow.chat.banner.component.ChatterApplyBanner.C331752 */

            @Override // com.ss.android.lark.widget.listener.OnSingleClickListener
            public void onSingleClick(View view) {
                ChatHitPoint.f135648a.mo187360b();
                ChatterApplyBanner.this.f85356h.mo134361b(view.getContext(), aVar.f85367a);
                ChatterApplyBanner.this.mo122354h().mo122339a();
            }
        });
        mo122361a(aVar);
    }
}
