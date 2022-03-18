package com.ss.android.lark.chat.chatwindow.chat.banner.component;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.larksuite.suite.R;
import com.ss.android.lark.C29990c;
import com.ss.android.lark.base.fragment.BaseFragment;
import com.ss.android.lark.chat.chatwindow.chat.banner.AbstractC33152a;
import com.ss.android.lark.chat.chatwindow.chat.banner.AbstractC33155c;
import com.ss.android.lark.dto.chat.ProfileSource;
import com.ss.android.lark.image.ImageLoader;
import com.ss.android.lark.image.entity.AvatarImage;
import com.ss.android.lark.statistics.chat.ChatHitPoint;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.lark.widget.listener.OnSingleClickListener;

public class ApplyAddFriendBanner extends AbstractC33152a<C33157a> {

    /* renamed from: k */
    private static final int f85312k = UIHelper.dp2px(36.0f);

    /* renamed from: h */
    public final AbstractC33159c f85313h;

    /* renamed from: i */
    private ViewHolder f85314i;

    /* renamed from: j */
    private C33157a f85315j;

    /* renamed from: com.ss.android.lark.chat.chatwindow.chat.banner.component.ApplyAddFriendBanner$c */
    public interface AbstractC33159c {
        /* renamed from: a */
        BaseFragment mo122365a();
    }

    @Override // com.ss.android.lark.chat.chatwindow.chat.banner.AbstractC33152a, com.ss.android.lark.chat.chatwindow.chat.banner.AbstractC33187f
    /* renamed from: f */
    public int mo122352f() {
        return R.layout.apply_add_friend_banner;
    }

    @Override // com.ss.android.lark.chat.chatwindow.chat.banner.AbstractC33187f
    /* renamed from: i */
    public int mo122363i() {
        return 16;
    }

    /* renamed from: com.ss.android.lark.chat.chatwindow.chat.banner.component.ApplyAddFriendBanner$b */
    public static class C33158b extends AbstractC33152a.AbstractC33153a {

        /* renamed from: e */
        public AbstractC33159c f85324e;

        @Override // com.ss.android.lark.chat.chatwindow.chat.banner.AbstractC33152a.AbstractC33153a
        /* renamed from: a */
        public AbstractC33152a mo122358a() {
            return new ApplyAddFriendBanner(this);
        }

        /* renamed from: a */
        public AbstractC33152a.AbstractC33153a mo122364a(AbstractC33159c cVar) {
            this.f85324e = cVar;
            return this;
        }
    }

    /* renamed from: j */
    public static C33158b m128150j() {
        return new C33158b();
    }

    public class ViewHolder_ViewBinding implements Unbinder {

        /* renamed from: a */
        private ViewHolder f85319a;

        @Override // butterknife.Unbinder
        public void unbind() {
            ViewHolder viewHolder = this.f85319a;
            if (viewHolder != null) {
                this.f85319a = null;
                viewHolder.mAddAvatar = null;
                viewHolder.mAddButton = null;
                return;
            }
            throw new IllegalStateException("Bindings already cleared.");
        }

        public ViewHolder_ViewBinding(ViewHolder viewHolder, View view) {
            this.f85319a = viewHolder;
            viewHolder.mAddAvatar = (ImageView) Utils.findRequiredViewAsType(view, R.id.add_avatar, "field 'mAddAvatar'", ImageView.class);
            viewHolder.mAddButton = (TextView) Utils.findRequiredViewAsType(view, R.id.add_button, "field 'mAddButton'", TextView.class);
        }
    }

    public ApplyAddFriendBanner(C33158b bVar) {
        super(bVar);
        this.f85313h = bVar.f85324e;
    }

    /* renamed from: a */
    public void mo122361a(final C33157a aVar) {
        ViewHolder viewHolder = this.f85314i;
        if (viewHolder != null && aVar != null) {
            this.f85315j = aVar;
            viewHolder.mAddButton.setOnClickListener(new OnSingleClickListener() {
                /* class com.ss.android.lark.chat.chatwindow.chat.banner.component.ApplyAddFriendBanner.C331561 */

                @Override // com.ss.android.lark.widget.listener.OnSingleClickListener
                public void onSingleClick(View view) {
                    ChatHitPoint.f135648a.mo187361b("apply_initiator");
                    C29990c.m110930b().mo134523V().mo134437a(view.getContext(), aVar.f85321b, aVar.f85322c, new ProfileSource.C36868a().mo136060a(1).mo136064b(0).mo136065b(aVar.f85320a).mo136063a(), ApplyAddFriendBanner.this.f85313h.mo122365a(), 0);
                }
            });
            String str = aVar.f85323d;
            String str2 = aVar.f85321b;
            int i = f85312k;
            ImageLoader.with(this.f85314i.f85318a).load(AvatarImage.Builder.obtain(str, str2, i, i).build()).into(this.f85314i.mAddAvatar);
        }
    }

    /* access modifiers changed from: package-private */
    public static class ViewHolder {

        /* renamed from: a */
        Context f85318a;
        @BindView(7167)
        ImageView mAddAvatar;
        @BindView(7169)
        TextView mAddButton;

        public ViewHolder(View view, Context context) {
            this.f85318a = context;
            ButterKnife.bind(this, view);
        }
    }

    /* renamed from: a */
    public void mo122345a(View view, C33157a aVar) {
        super.mo122345a(view, (AbstractC33155c) aVar);
        this.f85314i = new ViewHolder(view, view.getContext());
        mo122361a(aVar);
    }

    /* renamed from: com.ss.android.lark.chat.chatwindow.chat.banner.component.ApplyAddFriendBanner$a */
    public static class C33157a implements AbstractC33155c {

        /* renamed from: a */
        public String f85320a;

        /* renamed from: b */
        public String f85321b;

        /* renamed from: c */
        public String f85322c;

        /* renamed from: d */
        public String f85323d;

        public C33157a(String str, String str2, String str3, String str4) {
            this.f85320a = str;
            this.f85321b = str2;
            this.f85322c = str3;
            this.f85323d = str4;
        }
    }
}
