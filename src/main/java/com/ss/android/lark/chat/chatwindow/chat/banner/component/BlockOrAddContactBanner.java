package com.ss.android.lark.chat.chatwindow.chat.banner.component;

import android.text.TextUtils;
import android.view.View;
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
import com.ss.android.lark.base.fragment.BaseFragment;
import com.ss.android.lark.chat.chatwindow.chat.banner.AbstractC33152a;
import com.ss.android.lark.chat.chatwindow.chat.banner.AbstractC33155c;
import com.ss.android.lark.chatwindow.C35212a;
import com.ss.android.lark.dependency.AbstractC36493i;
import com.ss.android.lark.dto.chat.ProfileSource;
import com.ss.android.lark.statistics.chat.ChatHitPoint;
import com.ss.android.lark.widget.listener.OnSingleClickListener;

public class BlockOrAddContactBanner extends AbstractC33152a<C33170a> {

    /* renamed from: h */
    public final AbstractC36493i f85340h = C29990c.m110930b().ah();

    /* renamed from: i */
    public final AbstractC33172c f85341i;

    /* renamed from: j */
    private ViewHolder f85342j = null;

    /* renamed from: k */
    private C33170a f85343k = null;

    /* renamed from: com.ss.android.lark.chat.chatwindow.chat.banner.component.BlockOrAddContactBanner$c */
    public interface AbstractC33172c {
        /* renamed from: a */
        BaseFragment mo122376a();
    }

    @Override // com.ss.android.lark.chat.chatwindow.chat.banner.AbstractC33152a, com.ss.android.lark.chat.chatwindow.chat.banner.AbstractC33187f
    /* renamed from: f */
    public int mo122352f() {
        return R.layout.contact_action_banner;
    }

    @Override // com.ss.android.lark.chat.chatwindow.chat.banner.AbstractC33187f
    /* renamed from: i */
    public int mo122363i() {
        return 8;
    }

    /* renamed from: com.ss.android.lark.chat.chatwindow.chat.banner.component.BlockOrAddContactBanner$b */
    public static class C33171b extends AbstractC33152a.AbstractC33153a {

        /* renamed from: e */
        public AbstractC33172c f85355e;

        @Override // com.ss.android.lark.chat.chatwindow.chat.banner.AbstractC33152a.AbstractC33153a
        /* renamed from: a */
        public AbstractC33152a mo122358a() {
            return new BlockOrAddContactBanner(this);
        }

        /* renamed from: a */
        public AbstractC33152a.AbstractC33153a mo122375a(AbstractC33172c cVar) {
            this.f85355e = cVar;
            return this;
        }
    }

    /* renamed from: j */
    public static C33171b m128170j() {
        return new C33171b();
    }

    public class ViewHolder_ViewBinding implements Unbinder {

        /* renamed from: a */
        private ViewHolder f85351a;

        @Override // butterknife.Unbinder
        public void unbind() {
            ViewHolder viewHolder = this.f85351a;
            if (viewHolder != null) {
                this.f85351a = null;
                viewHolder.blockContactArea = null;
                viewHolder.addContactArea = null;
                return;
            }
            throw new IllegalStateException("Bindings already cleared.");
        }

        public ViewHolder_ViewBinding(ViewHolder viewHolder, View view) {
            this.f85351a = viewHolder;
            viewHolder.blockContactArea = Utils.findRequiredView(view, R.id.block_contact_area, "field 'blockContactArea'");
            viewHolder.addContactArea = Utils.findRequiredView(view, R.id.add_contact_area, "field 'addContactArea'");
        }
    }

    /* access modifiers changed from: package-private */
    public static class ViewHolder {
        @BindView(7170)
        View addContactArea;
        @BindView(7283)
        View blockContactArea;

        public ViewHolder(View view) {
            ButterKnife.bind(this, view);
        }
    }

    public BlockOrAddContactBanner(C33171b bVar) {
        super(bVar);
        this.f85341i = bVar.f85355e;
    }

    /* renamed from: a */
    public void mo122361a(C33170a aVar) {
        if (this.f85342j != null && aVar != null) {
            this.f85343k = aVar;
        }
    }

    /* renamed from: a */
    public void mo122345a(final View view, final C33170a aVar) {
        super.mo122345a(view, (AbstractC33155c) aVar);
        ViewHolder viewHolder = new ViewHolder(view);
        this.f85342j = viewHolder;
        viewHolder.addContactArea.setOnClickListener(new OnSingleClickListener() {
            /* class com.ss.android.lark.chat.chatwindow.chat.banner.component.BlockOrAddContactBanner.C331661 */

            @Override // com.ss.android.lark.widget.listener.OnSingleClickListener
            public void onSingleClick(View view) {
                ChatHitPoint.f135648a.mo187361b("apply_recipient");
                C29990c.m110930b().mo134523V().mo134437a(view.getContext(), aVar.f85353b, aVar.f85354c, new ProfileSource.C36868a().mo136060a(1).mo136064b(0).mo136065b(aVar.f85352a).mo136063a(), BlockOrAddContactBanner.this.f85341i.mo122376a(), 0);
            }
        });
        this.f85342j.blockContactArea.setOnClickListener(new OnSingleClickListener() {
            /* class com.ss.android.lark.chat.chatwindow.chat.banner.component.BlockOrAddContactBanner.C331672 */

            @Override // com.ss.android.lark.widget.listener.OnSingleClickListener
            public void onSingleClick(View view) {
                ChatHitPoint.f135648a.mo187367e();
                C35212a.m137541b(view.getContext(), new C35212a.AbstractC35215a() {
                    /* class com.ss.android.lark.chat.chatwindow.chat.banner.component.BlockOrAddContactBanner.C331672.C331681 */

                    @Override // com.ss.android.lark.chatwindow.C35212a.AbstractC35215a
                    /* renamed from: b */
                    public void mo122373b() {
                    }

                    @Override // com.ss.android.lark.chatwindow.C35212a.AbstractC35215a
                    /* renamed from: a */
                    public void mo122372a() {
                        ChatHitPoint.f135648a.mo187370g();
                        BlockOrAddContactBanner.this.f85340h.mo134649b(aVar.f85353b, new UIGetDataCallback(new IGetDataCallback<Boolean>() {
                            /* class com.ss.android.lark.chat.chatwindow.chat.banner.component.BlockOrAddContactBanner.C331672.C331681.C331691 */

                            @Override // com.larksuite.framework.callback.IGetDataCallback
                            public void onError(ErrorResult errorResult) {
                                String str;
                                if (!TextUtils.isEmpty(errorResult.getDisplayMsg())) {
                                    str = errorResult.getDisplayMsg();
                                } else {
                                    str = "";
                                }
                                LKUIToast.show(view.getContext(), str);
                            }

                            /* renamed from: a */
                            public void onSuccess(Boolean bool) {
                                LKUIToast.show(view.getContext(), (int) R.string.Lark_NewContacts_BlockedSuccessfully);
                                BlockOrAddContactBanner.this.mo122354h().mo122339a();
                                ChatHitPoint.f135648a.mo187364c(aVar.f85353b);
                            }
                        }));
                    }
                });
            }
        });
        mo122361a(aVar);
    }

    /* renamed from: com.ss.android.lark.chat.chatwindow.chat.banner.component.BlockOrAddContactBanner$a */
    public static class C33170a implements AbstractC33155c {

        /* renamed from: a */
        String f85352a;

        /* renamed from: b */
        String f85353b;

        /* renamed from: c */
        String f85354c;

        public C33170a(String str, String str2, String str3) {
            this.f85352a = str;
            this.f85353b = str2;
            this.f85354c = str3;
        }
    }
}
