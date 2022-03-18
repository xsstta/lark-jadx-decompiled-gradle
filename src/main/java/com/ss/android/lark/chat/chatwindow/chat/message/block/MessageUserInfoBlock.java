package com.ss.android.lark.chat.chatwindow.chat.message.block;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentActivity;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.larksuite.component.decoration.avatar.DecoratedAvatar;
import com.larksuite.component.ui.avatar.AvatarModel;
import com.larksuite.component.ui.avatar.v2.ChatterAvatar;
import com.larksuite.component.ui.avatar.v2.LarkAvatarView;
import com.larksuite.component.ui.display.manager.C25649b;
import com.larksuite.component.ui.display.manager.LKUIDisplayManager;
import com.larksuite.component.ui.display.manager.LarkFont;
import com.larksuite.component.ui.p1153e.C25653b;
import com.larksuite.component.ui.tag.LarkNameTag;
import com.larksuite.component.ui.tag.TextTag;
import com.larksuite.component.universe_design.icon.UDIconUtils;
import com.larksuite.framework.utils.C26317s;
import com.larksuite.framework.utils.DeviceUtils;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.C29990c;
import com.ss.android.lark.appreciablelib.Biz;
import com.ss.android.lark.appreciablelib.Scene;
import com.ss.android.lark.chat.api.AbstractC32812c;
import com.ss.android.lark.chat.chatwindow.chat.data.p1620a.C33221c;
import com.ss.android.lark.chat.chatwindow.chat.message.AbstractC33342d;
import com.ss.android.lark.chat.chatwindow.chat.message.p1624a.AbstractC33297g;
import com.ss.android.lark.chat.entity.chat.Chat;
import com.ss.android.lark.chat.entity.chatter.AvatarMedal;
import com.ss.android.lark.chat.entity.chatter.ChatChatter;
import com.ss.android.lark.chat.entity.chatter.ChatterCustomStatus;
import com.ss.android.lark.chat.entity.chatter.ChatterDescription;
import com.ss.android.lark.chat.entity.chatter.FilterRule;
import com.ss.android.lark.chat.entity.chatter.TagFilterRule;
import com.ss.android.lark.chat.entity.chatter.TagInfo;
import com.ss.android.lark.chat.entity.chatter.WorkStatus;
import com.ss.android.lark.chat.entity.message.content.SystemContent;
import com.ss.android.lark.chat.export.entity.message.Content;
import com.ss.android.lark.chat.p1660e.C33973b;
import com.ss.android.lark.chat.utils.C34336c;
import com.ss.android.lark.chat.utils.C34339g;
import com.ss.android.lark.chat.vo.ChatMessageVO;
import com.ss.android.lark.chatwindow.C35247g;
import com.ss.android.lark.dependency.AbstractC36450aa;
import com.ss.android.lark.dependency.AbstractC36461ah;
import com.ss.android.lark.dependency.AbstractC36474h;
import com.ss.android.lark.dependency.IBrowserDependency;
import com.ss.android.lark.dependency.al;
import com.ss.android.lark.desktopmode.utils.DesktopUtil;
import com.ss.android.lark.dto.chat.ProfileSource;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.reaction.p2557b.C52977a;
import com.ss.android.lark.statistics.chat.ChatHitPointNew;
import com.ss.android.lark.utils.C57859q;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.lark.utils.UserStatusHelper;
import com.ss.android.lark.widget.linked_emojicon.widget.LinkEmojiTextView;
import com.ss.android.lark.widget.listener.C58546g;
import com.ss.android.lark.widget.listener.OnSingleClickListener;
import com.ss.android.lark.widget.recyclerview.hive.AbstractC59004b;
import com.ss.android.lark.widget.recyclerview.hive.AbstractC59010e;
import com.ss.android.lark.widget.span.C59170l;
import com.ss.android.lark.widget.status.UserStatusLinearLayout;
import java.util.ArrayList;
import java.util.Objects;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

public class MessageUserInfoBlock extends AbstractC59004b<ChatMessageVO, UserInfoBlockHolder> {

    /* renamed from: g */
    private static final int f85808g = UIHelper.dp2px((float) DeviceUtils.getDpFromDimenXml(UIHelper.getContext(), R.dimen.avatar_width_chatter));

    /* renamed from: h */
    private static final Object f85809h = new Object();

    /* renamed from: i */
    private static final int f85810i = R.id.background_set_tag;

    /* renamed from: a */
    public final AbstractC33342d f85811a;

    /* renamed from: b */
    public final AbstractC33297g f85812b;

    /* renamed from: c */
    public final AbstractC32812c f85813c = C29990c.m110930b().mo134577e();

    /* renamed from: d */
    public final IBrowserDependency f85814d = C29990c.m110930b().mo134593u();

    /* renamed from: e */
    public final AbstractC36474h.AbstractC36489o f85815e = C29990c.m110930b().mo134525X();

    /* renamed from: j */
    private final al f85816j = C29990c.m110930b().mo134596x();

    /* renamed from: k */
    private final AbstractC36461ah f85817k = C29990c.m110930b().mo134523V();

    /* renamed from: l */
    private final AbstractC36450aa f85818l = C29990c.m110930b().mo134515N();

    /* renamed from: m */
    private final boolean f85819m;

    /* renamed from: n */
    private final AbstractC33319a f85820n;

    /* renamed from: o */
    private final Drawable f85821o;

    /* renamed from: com.ss.android.lark.chat.chatwindow.chat.message.block.MessageUserInfoBlock$a */
    public interface AbstractC33319a {
        /* renamed from: a */
        void mo122810a(String str, String str2);
    }

    @Override // com.ss.android.lark.widget.recyclerview.hive.AbstractC59004b
    /* renamed from: c */
    public int mo122651c() {
        return 0;
    }

    /* access modifiers changed from: package-private */
    public static class UserInfoBlockHolder extends AbstractC59010e {

        /* renamed from: a */
        public LarkAvatarView f85832a;
        @BindView(7245)
        public View mAvatarClickRegion;
        @BindView(7257)
        public View mAvatarWrapper;
        @BindView(7515)
        public AppCompatImageView mCustomStatus;
        @BindView(7260)
        public DecoratedAvatar mDecoratedAvatar;
        @BindView(8287)
        public TextView mNameTV;
        @BindView(9244)
        public ImageView mSecretSign;
        @BindView(9238)
        public UserStatusLinearLayout mUserStatus;

        UserInfoBlockHolder() {
        }

        /* renamed from: a */
        private void m128992a() {
            if (!DesktopUtil.m144307b()) {
                TextView textView = this.mNameTV;
                if (textView != null) {
                    C25649b.m91857a(textView, LarkFont.CAPTION0);
                }
                C25649b.m91853a(this.mDecoratedAvatar, 32);
                if (this.mAvatarWrapper != null) {
                    float a = ((float) this.mDecoratedAvatar.getLayoutParams().width) - C25653b.m91892a(this.mDecoratedAvatar.getContext(), 32.0f);
                    ViewGroup.LayoutParams layoutParams = this.mAvatarWrapper.getLayoutParams();
                    layoutParams.width = (int) (C25653b.m91892a(this.mDecoratedAvatar.getContext(), 56.0f) + a);
                    this.mAvatarWrapper.setLayoutParams(layoutParams);
                }
                UserStatusLinearLayout userStatusLinearLayout = this.mUserStatus;
                if (userStatusLinearLayout != null) {
                    userStatusLinearLayout.mo201151a();
                }
            }
        }

        /* access modifiers changed from: protected */
        @Override // com.ss.android.lark.widget.recyclerview.hive.AbstractC59010e
        /* renamed from: a */
        public void mo122652a(View view) {
            ButterKnife.bind(this, view);
            DecoratedAvatar decoratedAvatar = this.mDecoratedAvatar;
            if (decoratedAvatar != null) {
                LarkAvatarView larkAvatarView = (LarkAvatarView) decoratedAvatar.getAvatarView();
                this.f85832a = larkAvatarView;
                Objects.requireNonNull(larkAvatarView, "AvatarView must not be null");
                this.f85832a.setScaleType(ImageView.ScaleType.CENTER_CROP);
            }
            m128992a();
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.widget.recyclerview.hive.AbstractC59004b
    /* renamed from: b */
    public Class<UserInfoBlockHolder> mo122650b() {
        return UserInfoBlockHolder.class;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public Context mo122719d() {
        return this.f85811a.mo122543g();
    }

    public class UserInfoBlockHolder_ViewBinding implements Unbinder {

        /* renamed from: a */
        private UserInfoBlockHolder f85833a;

        @Override // butterknife.Unbinder
        public void unbind() {
            UserInfoBlockHolder userInfoBlockHolder = this.f85833a;
            if (userInfoBlockHolder != null) {
                this.f85833a = null;
                userInfoBlockHolder.mUserStatus = null;
                userInfoBlockHolder.mCustomStatus = null;
                userInfoBlockHolder.mAvatarWrapper = null;
                userInfoBlockHolder.mDecoratedAvatar = null;
                userInfoBlockHolder.mNameTV = null;
                userInfoBlockHolder.mSecretSign = null;
                userInfoBlockHolder.mAvatarClickRegion = null;
                return;
            }
            throw new IllegalStateException("Bindings already cleared.");
        }

        public UserInfoBlockHolder_ViewBinding(UserInfoBlockHolder userInfoBlockHolder, View view) {
            this.f85833a = userInfoBlockHolder;
            userInfoBlockHolder.mUserStatus = (UserStatusLinearLayout) Utils.findOptionalViewAsType(view, R.id.user_status, "field 'mUserStatus'", UserStatusLinearLayout.class);
            userInfoBlockHolder.mCustomStatus = (AppCompatImageView) Utils.findOptionalViewAsType(view, R.id.custom_status, "field 'mCustomStatus'", AppCompatImageView.class);
            userInfoBlockHolder.mAvatarWrapper = view.findViewById(R.id.avatar_region);
            userInfoBlockHolder.mDecoratedAvatar = (DecoratedAvatar) Utils.findRequiredViewAsType(view, R.id.avator, "field 'mDecoratedAvatar'", DecoratedAvatar.class);
            userInfoBlockHolder.mNameTV = (TextView) Utils.findOptionalViewAsType(view, R.id.name, "field 'mNameTV'", TextView.class);
            userInfoBlockHolder.mSecretSign = (ImageView) Utils.findRequiredViewAsType(view, R.id.v_secret_sign, "field 'mSecretSign'", ImageView.class);
            userInfoBlockHolder.mAvatarClickRegion = Utils.findRequiredView(view, R.id.avatar_click_region, "field 'mAvatarClickRegion'");
        }
    }

    /* renamed from: b */
    private boolean m128973b(ChatMessageVO cVar) {
        C33973b C = cVar.mo121657C();
        if (!this.f85811a.mo122540d() || C == null || WorkStatus.isInvalid(C.mo124219i())) {
            return false;
        }
        return true;
    }

    /* renamed from: c */
    private boolean m128975c(ChatMessageVO cVar) {
        C33973b C = cVar.mo121657C();
        if (C == null || C.mo124224l() || !C.mo124222j()) {
            return false;
        }
        return true;
    }

    /* renamed from: d */
    private boolean m128977d(ChatMessageVO cVar) {
        C33973b C;
        if (this.f85811a.mo122540d() && (C = cVar.mo121657C()) != null) {
            return this.f85816j.mo134463a(C.mo124229q());
        }
        return false;
    }

    /* renamed from: b */
    private void m128970b(UserInfoBlockHolder userInfoBlockHolder) {
        int i;
        ImageView imageView = userInfoBlockHolder.mSecretSign;
        if (this.f85811a.mo122546j()) {
            i = 0;
        } else {
            i = 8;
        }
        imageView.setVisibility(i);
        if (userInfoBlockHolder.mSecretSign.getVisibility() == 0 && !m128968a(userInfoBlockHolder.mSecretSign)) {
            userInfoBlockHolder.mSecretSign.setImageResource(R.drawable.ic_svg_message_item_secret);
            ViewGroup.LayoutParams layoutParams = userInfoBlockHolder.mSecretSign.getLayoutParams();
            if ((layoutParams instanceof ConstraintLayout.LayoutParams) && !DesktopUtil.m144307b()) {
                ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) layoutParams;
                layoutParams2.width = LKUIDisplayManager.m91881c(mo122719d(), 15);
                layoutParams2.height = LKUIDisplayManager.m91881c(mo122719d(), 15);
                layoutParams2.f2822n = LKUIDisplayManager.m91881c(mo122719d(), 32) / 2;
            }
            userInfoBlockHolder.mSecretSign.setLayoutParams(layoutParams);
        }
    }

    /* renamed from: e */
    private boolean m128979e(ChatMessageVO cVar) {
        C33973b bVar;
        boolean z;
        ChatChatter fromChatter;
        Content z2 = cVar.mo121699g().mo126168z();
        if (!(z2 instanceof SystemContent) || (fromChatter = ((SystemContent) z2).getFromChatter()) == null) {
            bVar = null;
        } else {
            bVar = new C33221c().mo122491a(fromChatter);
        }
        if (bVar == null) {
            bVar = cVar.mo121657C();
        }
        if (bVar == null || !bVar.mo124228p()) {
            z = false;
        } else {
            z = true;
        }
        Chat n = this.f85811a.mo122550n();
        if (n == null || Chat.Type.GROUP == n.getType()) {
            return z;
        }
        return false;
    }

    /* renamed from: a */
    private static boolean m128968a(View view) {
        int i = f85810i;
        Object tag = view.getTag(i);
        Object obj = f85809h;
        if (tag == obj) {
            return true;
        }
        view.setTag(i, obj);
        return false;
    }

    /* renamed from: a */
    private boolean m128969a(ChatMessageVO cVar) {
        if (cVar.mo121657C() == null) {
            return false;
        }
        return !C26317s.m95316a(cVar.mo121657C().mo124232t());
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo122700a(UserInfoBlockHolder userInfoBlockHolder) {
        super.mo122700a((AbstractC59010e) userInfoBlockHolder);
        if (this.f85819m && userInfoBlockHolder.f85832a != null) {
            userInfoBlockHolder.f85832a.setImageDrawable(this.f85821o);
        }
    }

    /* renamed from: a */
    private void m128965a(UserInfoBlockHolder userInfoBlockHolder, View.OnClickListener onClickListener) {
        userInfoBlockHolder.mDecoratedAvatar.setOnClickListener(onClickListener);
        userInfoBlockHolder.mAvatarClickRegion.setOnClickListener(onClickListener);
    }

    /* renamed from: e */
    private void m128978e(UserInfoBlockHolder userInfoBlockHolder, ChatMessageVO cVar) {
        C33973b C = cVar.mo121657C();
        m128967a(userInfoBlockHolder, C);
        m128971b(userInfoBlockHolder, C);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ Unit m128963a(String str, TextTag.Builder aVar) {
        aVar.mo90136a(str);
        aVar.mo90145d(R.color.function_danger_500);
        aVar.mo90147e(R.color.function_danger_100);
        return null;
    }

    /* renamed from: f */
    private void m128980f(UserInfoBlockHolder userInfoBlockHolder, ChatMessageVO cVar) {
        TextView textView = userInfoBlockHolder.mNameTV;
        if (textView != null) {
            textView.setVisibility(8);
        }
        UserStatusLinearLayout userStatusLinearLayout = userInfoBlockHolder.mUserStatus;
        if (userStatusLinearLayout != null) {
            userStatusLinearLayout.setVisibility(8);
        }
    }

    /* renamed from: a */
    private void m128964a(UserInfoBlockHolder userInfoBlockHolder, int i) {
        userInfoBlockHolder.mDecoratedAvatar.setVisibility(i);
        userInfoBlockHolder.mAvatarClickRegion.setVisibility(i);
        if (userInfoBlockHolder.mAvatarWrapper != null) {
            userInfoBlockHolder.mAvatarWrapper.setVisibility(i);
        }
    }

    /* renamed from: b */
    private void m128971b(UserInfoBlockHolder userInfoBlockHolder, C33973b bVar) {
        if (bVar != null) {
            ChatterCustomStatus u = bVar.mo124233u();
            AppCompatImageView appCompatImageView = userInfoBlockHolder.mCustomStatus;
            if (appCompatImageView == null) {
                return;
            }
            if (u != null) {
                C25649b.m91853a(appCompatImageView, 14);
                appCompatImageView.setVisibility(0);
                C52977a.m205190a().mo180995a(appCompatImageView, u.getIconKey());
                return;
            }
            appCompatImageView.setVisibility(8);
        }
    }

    /* renamed from: d */
    private void m128976d(UserInfoBlockHolder userInfoBlockHolder, ChatMessageVO cVar) {
        Chat n = this.f85811a.mo122550n();
        UserStatusLinearLayout userStatusLinearLayout = userInfoBlockHolder.mUserStatus;
        AppCompatImageView appCompatImageView = userInfoBlockHolder.mCustomStatus;
        if (n == null) {
            if (userStatusLinearLayout != null) {
                userStatusLinearLayout.setVisibility(8);
            }
            if (appCompatImageView != null) {
                appCompatImageView.setVisibility(8);
                return;
            }
            return;
        }
        Chat.Type type = n.getType();
        if (Chat.Type.P2P == type) {
            m128980f(userInfoBlockHolder, cVar);
        } else if (Chat.Type.GROUP == type) {
            m128978e(userInfoBlockHolder, cVar);
        } else {
            TextView textView = userInfoBlockHolder.mNameTV;
            if (textView != null) {
                textView.setVisibility(0);
            }
            if (userStatusLinearLayout != null) {
                userStatusLinearLayout.setVisibility(0);
            }
        }
    }

    /* renamed from: a */
    private void m128966a(UserInfoBlockHolder userInfoBlockHolder, View.OnLongClickListener onLongClickListener) {
        userInfoBlockHolder.mDecoratedAvatar.setOnLongClickListener(onLongClickListener);
        userInfoBlockHolder.mAvatarClickRegion.setOnLongClickListener(onLongClickListener);
    }

    /* renamed from: a */
    private void m128967a(UserInfoBlockHolder userInfoBlockHolder, C33973b bVar) {
        UserStatusLinearLayout userStatusLinearLayout = userInfoBlockHolder.mUserStatus;
        if (userStatusLinearLayout != null) {
            if (bVar == null || C35247g.m137630a(bVar.mo124223k())) {
                userStatusLinearLayout.setVisibility(8);
                return;
            }
            final FragmentActivity g = this.f85811a.mo122543g();
            ChatterDescription k = bVar.mo124223k();
            if (k == null || (TextUtils.isEmpty(k.description) && k.type == ChatterDescription.Type.DEFAULT)) {
                userStatusLinearLayout.setVisibility(8);
                return;
            }
            userStatusLinearLayout.setVisibility(0);
            userStatusLinearLayout.setTextColor(g.getResources().getColor(R.color.text_placeholder));
            Drawable iconDrawable = UDIconUtils.getIconDrawable(g, UserStatusHelper.m224138a().mo195998a(k.type.getNumber()));
            C59170l a = C59170l.m229843a();
            if (a.mo201118a(bVar.mo124202c() + k.description) != null) {
                userInfoBlockHolder.mUserStatus.mo201155a(k.description, bVar.mo124202c(), iconDrawable);
            } else {
                userInfoBlockHolder.mUserStatus.mo201154a(k.description, iconDrawable);
                this.f85820n.mo122810a(k.description, bVar.mo124202c());
            }
            userStatusLinearLayout.setOnURLClickListener(new LinkEmojiTextView.AbstractC58525j() {
                /* class com.ss.android.lark.chat.chatwindow.chat.message.block.MessageUserInfoBlock.C333174 */

                @Override // com.ss.android.lark.widget.linked_emojicon.widget.LinkEmojiTextView.AbstractC58525j
                /* renamed from: b */
                public boolean mo122807b(View view, String str) {
                    return false;
                }

                @Override // com.ss.android.lark.widget.linked_emojicon.widget.LinkEmojiTextView.AbstractC58525j
                /* renamed from: a */
                public void mo122806a(View view, String str) {
                    MessageUserInfoBlock.this.f85813c.mo120961b();
                    MessageUserInfoBlock.this.f85814d.mo134330a(g, str);
                    if (!MessageUserInfoBlock.this.f85811a.mo122546j()) {
                        C29990c.m110930b().mo134594v().mo134496a(str);
                    }
                }
            });
            userStatusLinearLayout.setOnPhoneClickListener(new LinkEmojiTextView.AbstractC58524i() {
                /* class com.ss.android.lark.chat.chatwindow.chat.message.block.MessageUserInfoBlock.C333185 */

                @Override // com.ss.android.lark.widget.linked_emojicon.widget.LinkEmojiTextView.AbstractC58524i
                /* renamed from: b */
                public void mo122809b(View view, String str) {
                }

                @Override // com.ss.android.lark.widget.linked_emojicon.widget.LinkEmojiTextView.AbstractC58524i
                /* renamed from: a */
                public void mo122808a(View view, String str) {
                    MessageUserInfoBlock.this.f85815e.mo134641a(g, str);
                }
            });
        }
    }

    /* renamed from: b */
    private void m128972b(UserInfoBlockHolder userInfoBlockHolder, ChatMessageVO cVar) {
        C33973b C;
        TextView textView = userInfoBlockHolder.mNameTV;
        if (textView != null) {
            boolean e = m128979e(cVar);
            boolean d = m128977d(cVar);
            boolean b = m128973b(cVar);
            boolean c = m128975c(cVar);
            boolean a = m128969a(cVar);
            if (e || d || b || a || c) {
                LarkNameTag.ChatterTagBuilder a2 = LarkNameTag.m92206b(this.f85811a.mo122543g()).mo90046b(d).mo90045a(e);
                if (b && (C = cVar.mo121657C()) != null) {
                    a2.mo89985b(TextTag.f62987a.mo90160a(new Function1(C.mo124219i().getDisplayTextNoDuration(this.f85811a.mo122543g())) {
                        /* class com.ss.android.lark.chat.chatwindow.chat.message.block.$$Lambda$MessageUserInfoBlock$BkStYnW9R7vEZAw0R_3nI3fU */
                        public final /* synthetic */ String f$0;

                        {
                            this.f$0 = r1;
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return MessageUserInfoBlock.m128963a(this.f$0, (TextTag.Builder) obj);
                        }
                    }), true);
                }
                if (c) {
                    a2.mo90047e(true);
                }
                C33973b C2 = cVar.mo121657C();
                if (C2 != null) {
                    TagInfo.apply(a2, C2.mo124232t(), new ArrayList<FilterRule>() {
                        /* class com.ss.android.lark.chat.chatwindow.chat.message.block.MessageUserInfoBlock.C333141 */

                        {
                            add(TagFilterRule.m131800a());
                            add(TagFilterRule.m131801b());
                        }
                    });
                }
                a2.mo90014a(LKUIDisplayManager.m91864a(mo122719d(), 12));
                a2.mo90021b((float) LKUIDisplayManager.m91881c(mo122719d(), 18));
                a2.mo90027e().mo90004a(textView);
                return;
            }
            textView.setCompoundDrawables(null, null, null, null);
        }
    }

    /* renamed from: c */
    private void m128974c(final UserInfoBlockHolder userInfoBlockHolder, final ChatMessageVO cVar) {
        final C33973b bVar;
        int i;
        Scene scene;
        ChatChatter fromChatter;
        Content z = cVar.mo121699g().mo126168z();
        String str = null;
        if (!(z instanceof SystemContent) || (fromChatter = ((SystemContent) z).getFromChatter()) == null) {
            bVar = null;
        } else {
            bVar = new C33221c().mo122491a(fromChatter);
        }
        if (bVar == null) {
            bVar = cVar.mo121657C();
        }
        FragmentActivity g = this.f85811a.mo122543g();
        TextView textView = userInfoBlockHolder.mNameTV;
        if (bVar != null) {
            if (textView != null) {
                textView.setText(bVar.mo124214g());
            }
            userInfoBlockHolder.mDecoratedAvatar.mo86669a();
            if (!this.f85811a.mo122546j() && this.f85817k.mo134442c() && !bVar.mo124224l() && Objects.equals(this.f85818l.mo134405h(), bVar.mo124187a())) {
                AvatarMedal s = bVar.mo124231s();
                if (s != null) {
                    str = s.getKey();
                }
                if (!TextUtils.isEmpty(str)) {
                    userInfoBlockHolder.mDecoratedAvatar.mo86671a(str);
                }
            }
            if (this.f85811a.mo122546j()) {
                scene = Scene.SecretChat;
            } else if (this.f85811a.mo122558v()) {
                scene = Scene.Thread;
            } else {
                scene = Scene.Chat;
            }
            userInfoBlockHolder.f85832a.mo89076a(((ChatterAvatar.Builder) ((ChatterAvatar.Builder) ((ChatterAvatar.Builder) ((ChatterAvatar.Builder) ((ChatterAvatar.Builder) ((ChatterAvatar.Builder) new ChatterAvatar.Builder().mo89081c(bVar.mo124202c()).mo88962a(bVar.mo124216h())).mo88967b(bVar.mo124202c())).mo88963a(this.f85819m)).mo88959a(AvatarModel.Size.SMALL)).mo88960a(Biz.Messenger)).mo88961a(scene)).mo88976k());
        } else if (textView != null) {
            textView.setText(g.getString(R.string.Lark_Legacy_UnknownErr));
            textView.setTextColor(UIUtils.getColor(this.f85811a.mo122543g(), R.color.text_placeholder));
        }
        if (this.f85811a.mo122553q()) {
            i = 8;
        } else {
            i = 0;
        }
        m128964a(userInfoBlockHolder, i);
        DesktopUtil.m144304b(userInfoBlockHolder.mDecoratedAvatar);
        m128965a(userInfoBlockHolder, (View.OnClickListener) new OnSingleClickListener() {
            /* class com.ss.android.lark.chat.chatwindow.chat.message.block.MessageUserInfoBlock.C333152 */

            @Override // com.ss.android.lark.widget.listener.OnSingleClickListener
            public void onSingleClick(View view) {
                C33973b bVar;
                C58546g.m227072a().mo198455a(view);
                C33973b bVar2 = bVar;
                if (bVar2 == null || !bVar2.mo124230r()) {
                    boolean z = false;
                    if (!(MessageUserInfoBlock.this.f85812b == null || (bVar = bVar) == null || !bVar.mo124226n())) {
                        if (MessageUserInfoBlock.this.f85811a.mo122549m()) {
                            C29990c.m110930b().mo134523V().mo134436a(MessageUserInfoBlock.this.mo122719d(), new ProfileSource.C36868a().mo136066c(bVar.mo124202c()).mo136061a(Boolean.valueOf(bVar.mo124225m())).mo136065b(MessageUserInfoBlock.this.f85811a.mo122544h()).mo136064b(2).mo136060a(0).mo136062a(C34339g.m133170d(MessageUserInfoBlock.this.f85811a.mo122550n())).mo136063a());
                        } else {
                            C29990c.m110930b().mo134523V().mo134435a(MessageUserInfoBlock.this.mo122719d(), bVar, MessageUserInfoBlock.this.f85811a.mo122550n());
                        }
                    }
                    ChatHitPointNew.f135660c.mo187384a(MessageUserInfoBlock.this.f85811a.mo122550n(), "icon", ChatHitPointNew.f135660c.mo187391b("icon"), ChatHitPointNew.f135660c.mo187378a(cVar, (String) null, (String) null));
                    if (userInfoBlockHolder.mDecoratedAvatar.getDecorationView() != null) {
                        if (userInfoBlockHolder.mDecoratedAvatar.getDecorationView().getDrawable() != null) {
                            z = true;
                        }
                        ChatHitPointNew.m213102a(C57859q.m224565a(bVar.mo124202c()), z);
                        return;
                    }
                    return;
                }
                Log.m165389i("MessageUserInfoBlock", "chatter is anonymous block avatar click");
            }
        });
        m128966a(userInfoBlockHolder, (View.OnLongClickListener) new View.OnLongClickListener() {
            /* class com.ss.android.lark.chat.chatwindow.chat.message.block.MessageUserInfoBlock.View$OnLongClickListenerC333163 */

            public boolean onLongClick(View view) {
                C33973b bVar = bVar;
                if (bVar != null && bVar.mo124230r()) {
                    Log.m165389i("MessageUserInfoBlock", "chatter is anonymous block avatar click");
                    return false;
                } else if (MessageUserInfoBlock.this.f85812b != null) {
                    return MessageUserInfoBlock.this.f85812b.mo122762a(bVar);
                } else {
                    return false;
                }
            }
        });
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo122649a(UserInfoBlockHolder userInfoBlockHolder, ChatMessageVO cVar) {
        int i;
        UserStatusLinearLayout userStatusLinearLayout = userInfoBlockHolder.mUserStatus;
        if (userStatusLinearLayout != null) {
            userStatusLinearLayout.setVisibility(8);
            userStatusLinearLayout.setNeedToRecognize(true);
        }
        TextView textView = userInfoBlockHolder.mNameTV;
        if (!cVar.mo124281p()) {
            m128964a(userInfoBlockHolder, 0);
            if (textView != null) {
                textView.setVisibility(0);
            }
            m128970b(userInfoBlockHolder);
            m128974c(userInfoBlockHolder, cVar);
            m128976d(userInfoBlockHolder, cVar);
            m128972b(userInfoBlockHolder, cVar);
            return;
        }
        if (this.f85811a.mo122553q()) {
            i = 8;
        } else {
            i = 4;
        }
        m128964a(userInfoBlockHolder, i);
        if (textView != null) {
            textView.setVisibility(8);
        }
        if (userInfoBlockHolder.mCustomStatus != null) {
            userInfoBlockHolder.mCustomStatus.setVisibility(8);
        }
        userInfoBlockHolder.mSecretSign.setVisibility(4);
    }

    public MessageUserInfoBlock(AbstractC33342d dVar, AbstractC33297g gVar, AbstractC33319a aVar) {
        this.f85811a = dVar;
        this.f85812b = gVar;
        this.f85820n = aVar;
        this.f85819m = C29990c.m110930b().mo134586n().mo134685a("lark.chat.load_avatar.async");
        FragmentActivity g = dVar.mo122543g();
        int i = f85808g;
        this.f85821o = C34336c.m133131b(g, i, i, 0);
    }
}
