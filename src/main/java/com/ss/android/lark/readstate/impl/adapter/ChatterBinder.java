package com.ss.android.lark.readstate.impl.adapter;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.larksuite.component.ui.imageview.LKUIRoundedImageView;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.chat.entity.chatter.Chatter;
import com.ss.android.lark.chat.entity.chatter.ChatterDescription;
import com.ss.android.lark.desktopmode.utils.DesktopUtil;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.readstate.ReadStateModule;
import com.ss.android.lark.readstate.impl.detail.C53123f;
import com.ss.android.lark.readstate.p2564a.AbstractC53096a;
import com.ss.android.lark.ui.p2892a.C57582a;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.lark.widget.listener.OnSingleClickListener;
import com.ss.android.lark.widget.status.UserStatusLinearLayout;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u0000 \u001c2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u001cB\u000f\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J \u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00032\u0006\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0013H\u0016J\u0018\u0010\u0019\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u001a\u001a\u00020\u001bH\u0016R\u000e\u0010\u0007\u001a\u00020\u0005XD¢\u0006\u0002\n\u0000R\u001a\u0010\b\u001a\u00020\tX.¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001a\u0010\u000e\u001a\u00020\u0005X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0006R\u000e\u0010\u0012\u001a\u00020\u0013X\u000e¢\u0006\u0002\n\u0000¨\u0006\u001d"}, d2 = {"Lcom/ss/android/lark/readstate/impl/adapter/ChatterBinder;", "Lcom/ss/android/lark/readstate/impl/adapter/IBinder;", "Lcom/ss/android/lark/readstate/impl/detail/ReadStateEntity;", "Lcom/ss/android/lark/readstate/impl/adapter/ReadMemberHolder;", "chatId", "", "(Ljava/lang/String;)V", "TAG", "context", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "setContext", "(Landroid/content/Context;)V", "fromChatId", "getFromChatId", "()Ljava/lang/String;", "setFromChatId", "mIsDesktopMode", "", "onBindViewHolder", "", "holder", "item", "isLastOne", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "Companion", "im_readstate_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.ss.android.lark.readstate.impl.adapter.a */
public final class ChatterBinder implements IBinder<C53123f, ReadMemberHolder> {

    /* renamed from: c */
    public static final Companion f131311c = new Companion(null);

    /* renamed from: a */
    public Context f131312a;

    /* renamed from: b */
    public String f131313b;

    /* renamed from: d */
    private final String f131314d = "ChatterBinder";

    /* renamed from: e */
    private boolean f131315e;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\b\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/ss/android/lark/readstate/impl/adapter/ChatterBinder$Companion;", "", "()V", "DESKTOP_MODE_AT_DING_MARGIN_SIZE", "", "DESKTOP_MODE_AT_DING_SIZE", "DESKTOP_MODE_AVATAR_SIZE", "DESKTOP_MODE_AVATAR_START_MARGIN_SIZE", "DESKTOP_MODE_AVATAR_TOP_MARGIN_SIZE", "DESKTOP_MODE_NAME_SIZE", "PHONE_MODE_AT_DING_MARGIN_SIZE", "PHONE_MODE_AVATAR_SIZE", "im_readstate_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.ss.android.lark.readstate.impl.adapter.a$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: a */
    public final Context mo181375a() {
        Context context = this.f131312a;
        if (context == null) {
            Intrinsics.throwUninitializedPropertyAccessException("context");
        }
        return context;
    }

    /* renamed from: b */
    public final String mo181380b() {
        String str = this.f131313b;
        if (str == null) {
            Intrinsics.throwUninitializedPropertyAccessException("fromChatId");
        }
        return str;
    }

    public ChatterBinder(String str) {
        Intrinsics.checkParameterIsNotNull(str, "chatId");
        this.f131313b = str;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/lark/readstate/impl/adapter/ChatterBinder$onBindViewHolder$1", "Lcom/ss/android/lark/widget/listener/OnSingleClickListener;", "onSingleClick", "", "v", "Landroid/view/View;", "im_readstate_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.ss.android.lark.readstate.impl.adapter.a$b */
    public static final class C53101b extends OnSingleClickListener {

        /* renamed from: a */
        final /* synthetic */ ChatterBinder f131316a;

        /* renamed from: b */
        final /* synthetic */ C53123f f131317b;

        @Override // com.ss.android.lark.widget.listener.OnSingleClickListener
        public void onSingleClick(View view) {
            if (this.f131317b.f131381f != null) {
                Chatter chatter = this.f131317b.f131381f;
                Intrinsics.checkExpressionValueIsNotNull(chatter, "item.chatter");
                if (chatter.isProfileEnable()) {
                    Chatter chatter2 = this.f131317b.f131381f;
                    Intrinsics.checkExpressionValueIsNotNull(chatter2, "item.chatter");
                    if (!chatter2.isAnonymous() && !this.f131317b.f131381f.isBot()) {
                        ReadStateModule.m205502a().mo144093a(this.f131316a.mo181375a(), this.f131317b.f131381f, this.f131316a.mo181380b());
                    }
                }
            }
        }

        C53101b(ChatterBinder aVar, C53123f fVar) {
            this.f131316a = aVar;
            this.f131317b = fVar;
        }
    }

    /* renamed from: a */
    public ReadMemberHolder mo181379b(Context context, ViewGroup viewGroup) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(viewGroup, "parent");
        this.f131312a = context;
        this.f131315e = DesktopUtil.m144301a(context);
        return new ReadMemberHolder(LayoutInflater.from(context).inflate(R.layout.read_state_chatter_item, viewGroup, false));
    }

    /* renamed from: a */
    public void mo181377a(ReadMemberHolder readMemberHolder, C53123f fVar, boolean z) {
        int i;
        int i2;
        int i3;
        int i4;
        Intrinsics.checkParameterIsNotNull(readMemberHolder, "holder");
        Intrinsics.checkParameterIsNotNull(fVar, "item");
        if (fVar.f131381f == null) {
            Log.m165383e(this.f131314d, "Message read state chatter is null");
            return;
        }
        View view = readMemberHolder.divider;
        Intrinsics.checkExpressionValueIsNotNull(view, "holder.divider");
        if (this.f131315e) {
            i = 8;
        } else {
            i = 0;
        }
        view.setVisibility(i);
        Context context = this.f131312a;
        if (context == null) {
            Intrinsics.throwUninitializedPropertyAccessException("context");
        }
        int a = C57582a.m223601a(context, 48.0f);
        float f = 11.5f;
        if (this.f131315e) {
            Context context2 = this.f131312a;
            if (context2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("context");
            }
            int a2 = C57582a.m223601a(context2, 24.0f);
            LKUIRoundedImageView lKUIRoundedImageView = readMemberHolder.mSingleAvatarIV;
            Intrinsics.checkExpressionValueIsNotNull(lKUIRoundedImageView, "holder.mSingleAvatarIV");
            ViewGroup.LayoutParams layoutParams = lKUIRoundedImageView.getLayoutParams();
            Context context3 = this.f131312a;
            if (context3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("context");
            }
            layoutParams.height = C57582a.m223601a(context3, 24.0f);
            LKUIRoundedImageView lKUIRoundedImageView2 = readMemberHolder.mSingleAvatarIV;
            Intrinsics.checkExpressionValueIsNotNull(lKUIRoundedImageView2, "holder.mSingleAvatarIV");
            ViewGroup.LayoutParams layoutParams2 = lKUIRoundedImageView2.getLayoutParams();
            Context context4 = this.f131312a;
            if (context4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("context");
            }
            layoutParams2.width = C57582a.m223601a(context4, 24.0f);
            LKUIRoundedImageView lKUIRoundedImageView3 = readMemberHolder.mSingleAvatarIV;
            Intrinsics.checkExpressionValueIsNotNull(lKUIRoundedImageView3, "holder.mSingleAvatarIV");
            ViewGroup.LayoutParams layoutParams3 = lKUIRoundedImageView3.getLayoutParams();
            if (layoutParams3 != null) {
                ConstraintLayout.LayoutParams layoutParams4 = (ConstraintLayout.LayoutParams) layoutParams3;
                Context context5 = this.f131312a;
                if (context5 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("context");
                }
                layoutParams4.topMargin = C57582a.m223601a(context5, 6.0f);
                LKUIRoundedImageView lKUIRoundedImageView4 = readMemberHolder.mSingleAvatarIV;
                Intrinsics.checkExpressionValueIsNotNull(lKUIRoundedImageView4, "holder.mSingleAvatarIV");
                ViewGroup.LayoutParams layoutParams5 = lKUIRoundedImageView4.getLayoutParams();
                if (layoutParams5 != null) {
                    ConstraintLayout.LayoutParams layoutParams6 = (ConstraintLayout.LayoutParams) layoutParams5;
                    Context context6 = this.f131312a;
                    if (context6 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("context");
                    }
                    layoutParams6.bottomMargin = C57582a.m223601a(context6, 6.0f);
                    LKUIRoundedImageView lKUIRoundedImageView5 = readMemberHolder.mSingleAvatarIV;
                    Intrinsics.checkExpressionValueIsNotNull(lKUIRoundedImageView5, "holder.mSingleAvatarIV");
                    ViewGroup.LayoutParams layoutParams7 = lKUIRoundedImageView5.getLayoutParams();
                    if (layoutParams7 != null) {
                        ConstraintLayout.LayoutParams layoutParams8 = (ConstraintLayout.LayoutParams) layoutParams7;
                        Context context7 = this.f131312a;
                        if (context7 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("context");
                        }
                        layoutParams8.leftMargin = C57582a.m223601a(context7, 12.0f);
                        TextView textView = readMemberHolder.mNameTV;
                        Intrinsics.checkExpressionValueIsNotNull(textView, "holder.mNameTV");
                        textView.setTextSize(14.0f);
                        TextView textView2 = readMemberHolder.mNameTV;
                        Intrinsics.checkExpressionValueIsNotNull(textView2, "holder.mNameTV");
                        ViewGroup.LayoutParams layoutParams9 = textView2.getLayoutParams();
                        if (layoutParams9 != null) {
                            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams9;
                            Context context8 = this.f131312a;
                            if (context8 == null) {
                                Intrinsics.throwUninitializedPropertyAccessException("context");
                            }
                            marginLayoutParams.leftMargin = C57582a.m223601a(context8, 6.0f);
                            ImageView imageView = readMemberHolder.atImage;
                            Intrinsics.checkExpressionValueIsNotNull(imageView, "holder.atImage");
                            ViewGroup.LayoutParams layoutParams10 = imageView.getLayoutParams();
                            Context context9 = this.f131312a;
                            if (context9 == null) {
                                Intrinsics.throwUninitializedPropertyAccessException("context");
                            }
                            layoutParams10.width = C57582a.m223601a(context9, 12.0f);
                            ImageView imageView2 = readMemberHolder.atImage;
                            Intrinsics.checkExpressionValueIsNotNull(imageView2, "holder.atImage");
                            ViewGroup.LayoutParams layoutParams11 = imageView2.getLayoutParams();
                            Context context10 = this.f131312a;
                            if (context10 == null) {
                                Intrinsics.throwUninitializedPropertyAccessException("context");
                            }
                            layoutParams11.height = C57582a.m223601a(context10, 12.0f);
                            ImageView imageView3 = readMemberHolder.dingImage;
                            Intrinsics.checkExpressionValueIsNotNull(imageView3, "holder.dingImage");
                            ViewGroup.LayoutParams layoutParams12 = imageView3.getLayoutParams();
                            Context context11 = this.f131312a;
                            if (context11 == null) {
                                Intrinsics.throwUninitializedPropertyAccessException("context");
                            }
                            layoutParams12.height = C57582a.m223601a(context11, 12.0f);
                            ImageView imageView4 = readMemberHolder.dingImage;
                            Intrinsics.checkExpressionValueIsNotNull(imageView4, "holder.dingImage");
                            ViewGroup.LayoutParams layoutParams13 = imageView4.getLayoutParams();
                            Context context12 = this.f131312a;
                            if (context12 == null) {
                                Intrinsics.throwUninitializedPropertyAccessException("context");
                            }
                            layoutParams13.width = C57582a.m223601a(context12, 12.0f);
                            i2 = a2;
                            f = 5.5f;
                        } else {
                            throw new TypeCastException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                        }
                    } else {
                        throw new TypeCastException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
                    }
                } else {
                    throw new TypeCastException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
                }
            } else {
                throw new TypeCastException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            }
        } else {
            i2 = a;
        }
        Chatter chatter = fVar.f131381f;
        AbstractC53096a a3 = ReadStateModule.m205502a();
        Context context13 = this.f131312a;
        if (context13 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("context");
        }
        a3.mo144094a(context13, chatter.getAvatarKey(), chatter.getId(), readMemberHolder.mSingleAvatarIV, i2, i2);
        TextView textView3 = readMemberHolder.mNameTV;
        Intrinsics.checkExpressionValueIsNotNull(textView3, "holder.mNameTV");
        textView3.setText(ReadStateModule.m205502a().mo144091a(fVar.f131381f));
        ImageView imageView5 = readMemberHolder.atImage;
        Intrinsics.checkExpressionValueIsNotNull(imageView5, "holder.atImage");
        if (fVar.f131377b) {
            i3 = 0;
        } else {
            i3 = 8;
        }
        imageView5.setVisibility(i3);
        ImageView imageView6 = readMemberHolder.dingImage;
        Intrinsics.checkExpressionValueIsNotNull(imageView6, "holder.dingImage");
        if (fVar.f131376a) {
            i4 = 0;
        } else {
            i4 = 8;
        }
        imageView6.setVisibility(i4);
        if (fVar.f131376a) {
            ViewGroup.LayoutParams layoutParams14 = readMemberHolder.dingImage.getLayoutParams();
            if (layoutParams14 != null) {
                ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams14;
                if (fVar.f131377b) {
                    marginLayoutParams2.setMargins(0, 0, UIHelper.dp2px(f), 0);
                } else {
                    marginLayoutParams2.setMargins(0, 0, 0, 0);
                }
            } else {
                throw new TypeCastException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            }
        }
        if (fVar.f131378c) {
            View view2 = readMemberHolder.shadow;
            Intrinsics.checkExpressionValueIsNotNull(view2, "holder.shadow");
            view2.setVisibility(0);
        } else {
            View view3 = readMemberHolder.shadow;
            Intrinsics.checkExpressionValueIsNotNull(view3, "holder.shadow");
            view3.setVisibility(8);
        }
        readMemberHolder.itemView.setOnClickListener(new C53101b(this, fVar));
        Chatter chatter2 = fVar.f131381f;
        Intrinsics.checkExpressionValueIsNotNull(chatter2, "item.chatter");
        ChatterDescription description = chatter2.getDescription();
        if ((!TextUtils.isEmpty(description.description) || description.type != ChatterDescription.Type.DEFAULT) && !this.f131315e) {
            UserStatusLinearLayout userStatusLinearLayout = readMemberHolder.userStatus;
            Intrinsics.checkExpressionValueIsNotNull(userStatusLinearLayout, "holder.userStatus");
            userStatusLinearLayout.setVisibility(0);
            readMemberHolder.userStatus.mo201154a(description.description, ReadStateModule.m205502a().mo144087a(description.type));
        } else {
            UserStatusLinearLayout userStatusLinearLayout2 = readMemberHolder.userStatus;
            Intrinsics.checkExpressionValueIsNotNull(userStatusLinearLayout2, "holder.userStatus");
            userStatusLinearLayout2.setVisibility(4);
        }
        if (fVar.f131382g == 7) {
            TextView textView4 = readMemberHolder.readState;
            Intrinsics.checkExpressionValueIsNotNull(textView4, "holder.readState");
            textView4.setVisibility(0);
            if (fVar.f131379d) {
                readMemberHolder.readState.setText(R.string.Lark_Legacy_ReadStatus);
                TextView textView5 = readMemberHolder.readState;
                Context context14 = this.f131312a;
                if (context14 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("context");
                }
                textView5.setTextColor(UIUtils.getColor(context14, R.color.function_success_600));
                readMemberHolder.readState.setBackgroundResource(R.drawable.read_tip_bg);
                return;
            }
            readMemberHolder.readState.setText(R.string.Lark_Legacy_Unread);
            TextView textView6 = readMemberHolder.readState;
            Context context15 = this.f131312a;
            if (context15 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("context");
            }
            textView6.setTextColor(UIUtils.getColor(context15, R.color.text_caption));
            readMemberHolder.readState.setBackgroundResource(R.drawable.unread_tip_bg);
            return;
        }
        TextView textView7 = readMemberHolder.readState;
        Intrinsics.checkExpressionValueIsNotNull(textView7, "holder.readState");
        textView7.setVisibility(8);
    }
}
