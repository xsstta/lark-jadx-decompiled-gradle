package com.ss.android.lark.mm.module.participant;

import android.content.Context;
import android.content.DialogInterface;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.google.firebase.messaging.Constants;
import com.larksuite.component.universe_design.dialog.UDDialogBuilder;
import com.larksuite.component.universe_design.image.UDAvatar;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.mm.depend.C45899c;
import com.ss.android.lark.mm.depend.IMmDepend;
import com.ss.android.lark.mm.module.detail.baseinfo.BaseUserType;
import com.ss.android.lark.mm.module.share.model.User;
import com.ss.android.lark.mm.module.share.user.UserNameView;
import com.ss.android.lark.mm.p2288b.C45853e;
import com.ss.android.lark.mm.p2288b.C45855f;
import com.ss.android.lark.mm.statistics.hitpoint.C47083e;
import com.ss.android.lark.mm.statistics.hitpoint.C47085h;
import com.ss.android.lark.mm.statistics.hitpoint.C47086i;
import com.ss.android.lark.mm.utils.C47098d;
import com.ss.android.lark.mm.utils.ResString;
import com.ss.android.lark.mm.utils.ktextensions.C47110e;
import com.ss.android.lark.mm.widget.BoldTextView;
import com.ss.android.lark.mm.widget.swipemenu.SwipeMenuLayout;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u0019\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007B!\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ6\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\u00132\u000e\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u0015J0\u0010\u0016\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u000e\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u0015H\u0002J\b\u0010\u0017\u001a\u00020\u0010H\u0002J\u001a\u0010\u0018\u001a\u00020\u00102\b\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0019\u001a\u00020\fH\u0002J\b\u0010\u001a\u001a\u00020\u0010H\u0002J\b\u0010\u001b\u001a\u00020\u0010H\u0002J8\u0010\u001c\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u001d\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\u00132\u000e\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u0015H\u0002R\u000e\u0010\u000b\u001a\u00020\fX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX.¢\u0006\u0002\n\u0000¨\u0006\u001e"}, d2 = {"Lcom/ss/android/lark/mm/module/participant/ParticipantsListItemView;", "Lcom/ss/android/lark/mm/widget/swipemenu/SwipeMenuLayout;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "repoId", "", "user", "Lcom/ss/android/lark/mm/module/share/model/User;", "bindData", "", "objectToken", "isCanModify", "", "onDelete", "Lkotlin/Function0;", "deleteConfirm", "init", "onDeleteFailed", "errorMsg", "setAvatar", "setDesc", "showDelete", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class ParticipantsListItemView extends SwipeMenuLayout {

    /* renamed from: a */
    public User f117176a;

    /* renamed from: b */
    private String f117177b;

    /* renamed from: d */
    private HashMap f117178d;

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "<anonymous parameter 0>", "Landroid/content/DialogInterface;", "kotlin.jvm.PlatformType", "<anonymous parameter 1>", "", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.participant.ParticipantsListItemView$a */
    public static final class DialogInterface$OnClickListenerC46552a implements DialogInterface.OnClickListener {

        /* renamed from: a */
        public static final DialogInterface$OnClickListenerC46552a f117179a = new DialogInterface$OnClickListenerC46552a();

        DialogInterface$OnClickListenerC46552a() {
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
        }
    }

    /* renamed from: a */
    public View mo163292a(int i) {
        if (this.f117178d == null) {
            this.f117178d = new HashMap();
        }
        View view = (View) this.f117178d.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f117178d.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    /* renamed from: d */
    private final void m184143d() {
        LayoutInflater.from(getContext()).inflate(R.layout.mm_view_participant_list_item, this);
        setLayoutParams(new RecyclerView.LayoutParams(-1, UIUtils.dp2px(getContext(), 80.0f)));
    }

    /* renamed from: e */
    private final void m184144e() {
        User user = this.f117176a;
        if (user == null) {
            Intrinsics.throwUninitializedPropertyAccessException("user");
        }
        boolean z = true;
        if (user.isGroup()) {
            BoldTextView boldTextView = (BoldTextView) mo163292a(R.id.tvDesc);
            Intrinsics.checkExpressionValueIsNotNull(boldTextView, "tvDesc");
            User user2 = this.f117176a;
            if (user2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("user");
            }
            String groupDescription = user2.getGroupDescription();
            if (groupDescription == null) {
                groupDescription = ResString.f118656a.mo165504a(R.string.MMWeb_G_GroupNoDescription);
            }
            boldTextView.setText(groupDescription);
        } else {
            User user3 = this.f117176a;
            if (user3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("user");
            }
            if (Intrinsics.areEqual((Object) user3.isExternal(), (Object) true)) {
                BoldTextView boldTextView2 = (BoldTextView) mo163292a(R.id.tvDesc);
                Intrinsics.checkExpressionValueIsNotNull(boldTextView2, "tvDesc");
                User user4 = this.f117176a;
                if (user4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("user");
                }
                boldTextView2.setText(user4.getTenantName());
            } else {
                BoldTextView boldTextView3 = (BoldTextView) mo163292a(R.id.tvDesc);
                Intrinsics.checkExpressionValueIsNotNull(boldTextView3, "tvDesc");
                User user5 = this.f117176a;
                if (user5 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("user");
                }
                boldTextView3.setText(user5.getDepartmentName());
            }
        }
        BoldTextView boldTextView4 = (BoldTextView) mo163292a(R.id.tvDesc);
        Intrinsics.checkExpressionValueIsNotNull(boldTextView4, "tvDesc");
        BoldTextView boldTextView5 = (BoldTextView) mo163292a(R.id.tvDesc);
        Intrinsics.checkExpressionValueIsNotNull(boldTextView5, "tvDesc");
        CharSequence text = boldTextView5.getText();
        int i = 0;
        if (!(text == null || text.length() == 0)) {
            z = false;
        }
        if (z) {
            i = 8;
        }
        boldTextView4.setVisibility(i);
    }

    /* renamed from: f */
    private final void m184145f() {
        Object tag = ((UDAvatar) mo163292a(R.id.ivIcon)).getTag(R.id.mm_image_view_tag);
        StringBuilder sb = new StringBuilder();
        User user = this.f117176a;
        if (user == null) {
            Intrinsics.throwUninitializedPropertyAccessException("user");
        }
        sb.append(user.getUserId());
        User user2 = this.f117176a;
        if (user2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("user");
        }
        sb.append(user2.getAvatarUrl());
        User user3 = this.f117176a;
        if (user3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("user");
        }
        sb.append(user3.getAvatarKey());
        String sb2 = sb.toString();
        if (!Intrinsics.areEqual(tag, sb2)) {
            ((UDAvatar) mo163292a(R.id.ivIcon)).setTag(R.id.mm_image_view_tag, sb2);
            UDAvatar uDAvatar = (UDAvatar) mo163292a(R.id.ivIcon);
            User user4 = this.f117176a;
            if (user4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("user");
            }
            String userId = user4.getUserId();
            User user5 = this.f117176a;
            if (user5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("user");
            }
            String avatarUrl = user5.getAvatarUrl();
            User user6 = this.f117176a;
            if (user6 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("user");
            }
            C45853e.m181659a(uDAvatar, userId, avatarUrl, user6.getAvatarKey());
        }
        UDAvatar uDAvatar2 = (UDAvatar) mo163292a(R.id.ivIcon);
        Intrinsics.checkExpressionValueIsNotNull(uDAvatar2, "ivIcon");
        C47110e.m186573a(uDAvatar2, new C46555c(this));
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "<anonymous parameter 0>", "Landroid/content/DialogInterface;", "kotlin.jvm.PlatformType", "<anonymous parameter 1>", "", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.participant.ParticipantsListItemView$b */
    public static final class DialogInterface$OnClickListenerC46553b implements DialogInterface.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ String f117180a;

        /* renamed from: b */
        final /* synthetic */ String f117181b;

        /* renamed from: c */
        final /* synthetic */ User f117182c;

        /* renamed from: d */
        final /* synthetic */ Function0 f117183d;

        DialogInterface$OnClickListenerC46553b(String str, String str2, User user, Function0 function0) {
            this.f117180a = str;
            this.f117181b = str2;
            this.f117182c = user;
            this.f117183d = function0;
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004¨\u0006\u0005"}, d2 = {"<anonymous>", "", "errorMsg", "", "invoke", "com/ss/android/lark/mm/module/participant/ParticipantsListItemView$deleteConfirm$2$1$1"}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.mm.module.participant.ParticipantsListItemView$b$a */
        static final class C46554a extends Lambda implements Function1<String, Unit> {
            final /* synthetic */ DialogInterface$OnClickListenerC46553b this$0;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C46554a(DialogInterface$OnClickListenerC46553b bVar) {
                super(1);
                this.this$0 = bVar;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(String str) {
                invoke(str);
                return Unit.INSTANCE;
            }

            public final void invoke(String str) {
                boolean z;
                Function0 function0;
                Intrinsics.checkParameterIsNotNull(str, "errorMsg");
                if (str.length() == 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (z && (function0 = this.this$0.f117183d) != null) {
                    Unit unit = (Unit) function0.invoke();
                }
            }
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            ParticipantRepo b = ParticipantRepo.f117152e.mo163490b(this.f117180a);
            if (b != null) {
                C47083e.m186425a(C47085h.m186430a(b.mo163486d()), "vc_minutes_detail_click", C47086i.m186432a().mo165422d("participant_edit").mo165416b().mo165413a("edit_type", "delete_participant").mo165421c());
                b.mo163475a(this.f117181b, this.f117182c.getActionId(), this.f117182c.getUserType(), this.f117182c.getUserId(), new C46554a(this));
            }
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.participant.ParticipantsListItemView$c */
    public static final class C46555c extends Lambda implements Function1<View, Unit> {
        final /* synthetic */ ParticipantsListItemView this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C46555c(ParticipantsListItemView participantsListItemView) {
            super(1);
            this.this$0 = participantsListItemView;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(View view) {
            invoke(view);
            return Unit.INSTANCE;
        }

        public final void invoke(View view) {
            int i;
            Intrinsics.checkParameterIsNotNull(view, "it");
            C45855f.m181664c("ParticipantsListItemView", "click ivIcon, start profile");
            C47083e.m186423a(this.this$0.getContext(), "vc_mm_click_button", C47086i.m186432a().mo165409a("profile_picture").mo165413a("page_name", "detail_page").mo165413a("from_source", ParticipantsListItemView.m184141a(this.this$0).getFromSource()).mo165421c());
            C47083e.m186423a(this.this$0.getContext(), "vc_minutes_detail_click", C47086i.m186432a().mo165422d("profile").mo165423e("none").mo165424f(ParticipantsListItemView.m184141a(this.this$0).getFromSource()).mo165421c());
            IMmDepend a = C45899c.m181859a();
            Intrinsics.checkExpressionValueIsNotNull(a, "MmDepend.impl()");
            IMmDepend.AbstractC45879g hostDepend = a.getHostDepend();
            Context context = this.this$0.getContext();
            String userId = ParticipantsListItemView.m184141a(this.this$0).getUserId();
            BaseUserType.Companion aVar = BaseUserType.Companion;
            Integer userType = ParticipantsListItemView.m184141a(this.this$0).getUserType();
            if (userType != null) {
                i = userType.intValue();
            } else {
                i = BaseUserType.UNKNOWN.getValue();
            }
            hostDepend.mo144633a(context, userId, aVar.mo161469a(i));
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.participant.ParticipantsListItemView$d */
    public static final class C46556d extends Lambda implements Function1<View, Unit> {
        final /* synthetic */ User $data;
        final /* synthetic */ String $objectToken;
        final /* synthetic */ Function0 $onDelete;
        final /* synthetic */ String $repoId;
        final /* synthetic */ ParticipantsListItemView this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C46556d(ParticipantsListItemView participantsListItemView, String str, String str2, User user, Function0 function0) {
            super(1);
            this.this$0 = participantsListItemView;
            this.$repoId = str;
            this.$objectToken = str2;
            this.$data = user;
            this.$onDelete = function0;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(View view) {
            invoke(view);
            return Unit.INSTANCE;
        }

        public final void invoke(View view) {
            Intrinsics.checkParameterIsNotNull(view, "it");
            C45855f.m181664c("ParticipantsListItemView", "delete Confirm");
            this.this$0.mo163500a(this.$repoId, this.$objectToken, this.$data, this.$onDelete);
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public ParticipantsListItemView(Context context) {
        this(context, null);
        Intrinsics.checkParameterIsNotNull(context, "context");
    }

    /* renamed from: a */
    public static final /* synthetic */ User m184141a(ParticipantsListItemView participantsListItemView) {
        User user = participantsListItemView.f117176a;
        if (user == null) {
            Intrinsics.throwUninitializedPropertyAccessException("user");
        }
        return user;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public ParticipantsListItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Intrinsics.checkParameterIsNotNull(context, "context");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ParticipantsListItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkParameterIsNotNull(context, "context");
        this.f117177b = "";
        m184143d();
    }

    /* renamed from: a */
    public final void mo163500a(String str, String str2, User user, Function0<Unit> function0) {
        if (C47098d.m186535b(getContext())) {
            Context context = getContext();
            Intrinsics.checkExpressionValueIsNotNull(context, "context");
            UDDialogBuilder eVar = (UDDialogBuilder) new UDDialogBuilder(context).titleBold(true);
            ResString.Editor aVar = new ResString.Editor(R.string.MMWeb_G_DeleteQuestion);
            String userName = user.getUserName();
            if (userName == null) {
                userName = "";
            }
            ((UDDialogBuilder) ((UDDialogBuilder) ((UDDialogBuilder) ((UDDialogBuilder) eVar.title(aVar.mo165506a("itemName", userName).mo165507a())).addActionButton(R.id.ud_dialog_btn_primary, R.string.MMWeb_G_Cancel, DialogInterface$OnClickListenerC46552a.f117179a)).addActionButton(R.id.ud_dialog_btn_secondary, R.string.MMWeb_G_Delete, new DialogInterface$OnClickListenerC46553b(str, str2, user, function0))).message(ResString.f118656a.mo165504a(R.string.MMWeb_G_DeleteInfo))).show();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0038, code lost:
        if (r3 == true) goto L_0x003c;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m184142b(java.lang.String r8, com.ss.android.lark.mm.module.share.model.User r9, java.lang.String r10, boolean r11, kotlin.jvm.functions.Function0<kotlin.Unit> r12) {
        /*
            r7 = this;
            r0 = 8
            java.lang.String r1 = "ivDelete"
            r2 = 2131300839(0x7f0911e7, float:1.8219719E38)
            if (r11 != 0) goto L_0x0016
            android.view.View r8 = r7.mo163292a(r2)
            android.widget.RelativeLayout r8 = (android.widget.RelativeLayout) r8
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r8, r1)
            r8.setVisibility(r0)
            return
        L_0x0016:
            android.view.View r11 = r7.mo163292a(r2)
            android.widget.RelativeLayout r11 = (android.widget.RelativeLayout) r11
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r11, r1)
            java.lang.String r3 = r9.getActionId()
            r4 = 0
            if (r3 == 0) goto L_0x003c
            java.lang.String r3 = r9.getActionId()
            if (r3 == 0) goto L_0x003b
            java.lang.CharSequence r3 = (java.lang.CharSequence) r3
            int r3 = r3.length()
            r5 = 1
            if (r3 != 0) goto L_0x0037
            r3 = 1
            goto L_0x0038
        L_0x0037:
            r3 = 0
        L_0x0038:
            if (r3 != r5) goto L_0x003b
            goto L_0x003c
        L_0x003b:
            r0 = 0
        L_0x003c:
            r11.setVisibility(r0)
            android.view.View r11 = r7.mo163292a(r2)
            android.widget.RelativeLayout r11 = (android.widget.RelativeLayout) r11
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r11, r1)
            android.view.View r11 = (android.view.View) r11
            com.ss.android.lark.mm.module.participant.ParticipantsListItemView$d r6 = new com.ss.android.lark.mm.module.participant.ParticipantsListItemView$d
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r10
            r4 = r9
            r5 = r12
            r0.<init>(r1, r2, r3, r4, r5)
            kotlin.jvm.functions.Function1 r6 = (kotlin.jvm.functions.Function1) r6
            com.ss.android.lark.mm.utils.ktextensions.C47110e.m186573a(r11, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.mm.module.participant.ParticipantsListItemView.m184142b(java.lang.String, com.ss.android.lark.mm.module.share.model.User, java.lang.String, boolean, kotlin.jvm.functions.Function0):void");
    }

    /* renamed from: a */
    public final void mo163499a(String str, User user, String str2, boolean z, Function0<Unit> function0) {
        Intrinsics.checkParameterIsNotNull(str, "repoId");
        Intrinsics.checkParameterIsNotNull(user, "user");
        Intrinsics.checkParameterIsNotNull(str2, "objectToken");
        this.f117177b = str;
        this.f117176a = user;
        m184145f();
        ((UserNameView) mo163292a(R.id.userName)).mo165261a(user);
        m184144e();
        m184142b(str, user, str2, z, function0);
    }
}
