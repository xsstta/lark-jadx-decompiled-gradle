package com.ss.android.lark.team.page.create_team;

import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.LiveData;
import com.google.firebase.messaging.Constants;
import com.larksuite.component.ui.imageview.LKUIRoundedImageView2;
import com.larksuite.component.universe_design.icon.UDIconUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.chat.entity.chat.AvatarMeta;
import com.ss.android.lark.piece.core.IPieceExport;
import com.ss.android.lark.piece.core.Piece;
import com.ss.android.lark.piece.core.PieceContext;
import com.ss.android.lark.piece.p2465b.C51468a;
import com.ss.android.lark.team.C55356a;
import com.ss.android.lark.team.dependency.ITeamModuleDependency;
import java.io.Serializable;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.TypeCastException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 #2\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002:\u0001#B\u0005¢\u0006\u0002\u0010\u0003J\b\u0010\f\u001a\u00020\u0005H\u0016J\n\u0010\r\u001a\u0004\u0018\u00010\u0007H\u0016J\u0018\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0016J\b\u0010\u0014\u001a\u00020\u0015H\u0002J\"\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\t2\u0006\u0010\u0019\u001a\u00020\t2\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0016J\u0010\u0010\u001c\u001a\u00020\u00152\u0006\u0010\u001d\u001a\u00020\u0005H\u0002J\b\u0010\u001e\u001a\u00020\u0015H\u0016J\u001c\u0010\u001f\u001a\u0016\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\"0!\u0012\u0004\u0012\u00020\"0 H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX.¢\u0006\u0002\n\u0000¨\u0006$"}, d2 = {"Lcom/ss/android/lark/team/page/create_team/CreateTeamAvatarPiece;", "Lcom/ss/android/lark/piece/core/Piece;", "Lcom/ss/android/lark/team/page/create_team/CreateTeamAvatarExport;", "()V", "avatarKey", "", "avatarMeta", "Lcom/ss/android/lark/chat/entity/chat/AvatarMeta;", "avatarSize", "", "avatarView", "Lcom/larksuite/component/ui/imageview/LKUIRoundedImageView2;", "getAvatarKey", "getAvatarMeta", "getView", "Landroid/view/View;", "context", "Landroid/content/Context;", "layoutConfig", "Landroid/view/ViewGroup$MarginLayoutParams;", "jumpToAvatarEdit", "", "onActivityResult", "", "requestCode", "resultCode", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Landroid/content/Intent;", "onAvatarKeyUpdated", "key", "onCreate", "providePieceExport", "Lkotlin/Pair;", "Ljava/lang/Class;", "Lcom/ss/android/lark/piece/core/IPieceExport;", "Companion", "im_team_team_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class CreateTeamAvatarPiece extends Piece<CreateTeamAvatarPiece> implements CreateTeamAvatarExport {

    /* renamed from: a */
    public static final ArrayList<String> f136976a = CollectionsKt.arrayListOf("default-avatar_4d386149-2385-471d-bd2d-37bae05d812c", "default-avatar_4ea03a71-56b9-435c-bf29-05d8703a606f", "default-avatar_8ee43cee-985e-4ce7-835d-65da0afc1169", "default-avatar_62543518-ab90-4962-b60b-d41b791c8e84", "default-avatar_a24872a7-3afd-4d63-80ee-0c402de59a41", "default-avatar_dc6fc8f9-09dc-48a4-80c6-2de25c2a279f", "default-avatar_dd2a4d13-8a80-4090-b7f0-7c38e6c8f530", "default-avatar_f4c3cd4a-9a70-4089-b41f-810bc2a45d34");

    /* renamed from: b */
    public static final Companion f136977b = new Companion(null);

    /* renamed from: g */
    private LKUIRoundedImageView2 f136978g;

    /* renamed from: h */
    private String f136979h = "";

    /* renamed from: i */
    private AvatarMeta f136980i;

    /* renamed from: j */
    private final int f136981j = C51468a.m199486a(88);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0007\u001a\u00020\u0005R\u001e\u0010\u0003\u001a\u0012\u0012\u0004\u0012\u00020\u00050\u0004j\b\u0012\u0004\u0012\u00020\u0005`\u0006X\u0004¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lcom/ss/android/lark/team/page/create_team/CreateTeamAvatarPiece$Companion;", "", "()V", "defaultAvatarIdList", "Ljava/util/ArrayList;", "", "Lkotlin/collections/ArrayList;", "getRandomAvatarKey", "im_team_team_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.team.page.create_team.CreateTeamAvatarPiece$a */
    public static final class Companion {
        private Companion() {
        }

        /* renamed from: a */
        public final String mo189310a() {
            String str = CreateTeamAvatarPiece.f136976a.get(((int) (Math.random() * ((double) 100))) % CreateTeamAvatarPiece.f136976a.size());
            Intrinsics.checkExpressionValueIsNotNull(str, "defaultAvatarIdList[pos]");
            return str;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // com.ss.android.lark.team.page.create_team.CreateTeamAvatarExport
    /* renamed from: a */
    public String mo189307a() {
        return this.f136979h;
    }

    @Override // com.ss.android.lark.team.page.create_team.CreateTeamAvatarExport
    /* renamed from: b */
    public AvatarMeta mo189308b() {
        return this.f136980i;
    }

    @Override // com.ss.android.lark.piece.core.Piece
    /* renamed from: B */
    public Pair<Class<? extends IPieceExport>, IPieceExport> mo177179B() {
        return TuplesKt.to(CreateTeamAvatarExport.class, this);
    }

    @Override // com.ss.android.lark.piece.core.Piece
    public void onCreate() {
        super.onCreate();
        m215250a(f136977b.mo189310a());
    }

    /* renamed from: c */
    public final void mo189309c() {
        IPieceExport aVar;
        String str;
        LiveData<String> a;
        PieceContext r = mo177204r();
        if (r != null) {
            aVar = r.mo177222a(CreateTeamNameExport.class);
        } else {
            aVar = null;
        }
        CreateTeamNameExport cVar = (CreateTeamNameExport) aVar;
        if (cVar == null || (a = cVar.mo189313a()) == null || (str = a.mo5927b()) == null) {
            str = "";
        }
        Intrinsics.checkExpressionValueIsNotNull(str, "getPieceExport<CreateTea…entLiveData()?.value ?:\"\"");
        mo177187a(C55356a.m214819a().mo144127f().mo144151a(mo177180C(), this.f136979h, str, null, this.f136980i, true), 9);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0002\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005¨\u0006\u0007"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick", "com/ss/android/lark/team/page/create_team/CreateTeamAvatarPiece$getView$1$2$2", "com/ss/android/lark/team/page/create_team/CreateTeamAvatarPiece$$special$$inlined$apply$lambda$1"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.team.page.create_team.CreateTeamAvatarPiece$b */
    static final class View$OnClickListenerC55480b implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ ConstraintLayout f136982a;

        /* renamed from: b */
        final /* synthetic */ CreateTeamAvatarPiece f136983b;

        /* renamed from: c */
        final /* synthetic */ ViewGroup.MarginLayoutParams f136984c;

        /* renamed from: d */
        final /* synthetic */ Context f136985d;

        View$OnClickListenerC55480b(ConstraintLayout constraintLayout, CreateTeamAvatarPiece createTeamAvatarPiece, ViewGroup.MarginLayoutParams marginLayoutParams, Context context) {
            this.f136982a = constraintLayout;
            this.f136983b = createTeamAvatarPiece;
            this.f136984c = marginLayoutParams;
            this.f136985d = context;
        }

        public final void onClick(View view) {
            this.f136983b.mo189309c();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0002\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005¨\u0006\u0007"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick", "com/ss/android/lark/team/page/create_team/CreateTeamAvatarPiece$getView$1$3$2", "com/ss/android/lark/team/page/create_team/CreateTeamAvatarPiece$$special$$inlined$apply$lambda$2"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.team.page.create_team.CreateTeamAvatarPiece$c */
    static final class View$OnClickListenerC55481c implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ ConstraintLayout f136986a;

        /* renamed from: b */
        final /* synthetic */ CreateTeamAvatarPiece f136987b;

        /* renamed from: c */
        final /* synthetic */ ViewGroup.MarginLayoutParams f136988c;

        /* renamed from: d */
        final /* synthetic */ Context f136989d;

        View$OnClickListenerC55481c(ConstraintLayout constraintLayout, CreateTeamAvatarPiece createTeamAvatarPiece, ViewGroup.MarginLayoutParams marginLayoutParams, Context context) {
            this.f136986a = constraintLayout;
            this.f136987b = createTeamAvatarPiece;
            this.f136988c = marginLayoutParams;
            this.f136989d = context;
        }

        public final void onClick(View view) {
            this.f136987b.mo189309c();
        }
    }

    /* renamed from: a */
    private final void m215250a(String str) {
        if (!Intrinsics.areEqual(str, this.f136979h)) {
            this.f136979h = str;
            ITeamModuleDependency.IImageDependency a = C55356a.m214819a().mo144121a();
            Context C = mo177180C();
            String str2 = this.f136979h;
            LKUIRoundedImageView2 lKUIRoundedImageView2 = this.f136978g;
            if (lKUIRoundedImageView2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("avatarView");
            }
            int i = this.f136981j;
            a.mo144129a(C, str2, "", lKUIRoundedImageView2, i, i);
        }
    }

    @Override // com.ss.android.lark.piece.core.Piece
    /* renamed from: a */
    public View mo127619a(Context context, ViewGroup.MarginLayoutParams marginLayoutParams) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(marginLayoutParams, "layoutConfig");
        ConstraintLayout constraintLayout = new ConstraintLayout(context);
        marginLayoutParams.width = -1;
        marginLayoutParams.height = C51468a.m199486a(152);
        constraintLayout.setBackgroundColor(C51468a.m199487a((int) R.color.bg_body, context));
        ConstraintLayout constraintLayout2 = constraintLayout;
        TextView textView = new TextView(constraintLayout2.getContext());
        textView.setTextSize(14.0f);
        textView.setTextColor(C51468a.m199487a((int) R.color.text_title, context));
        textView.setText(C51468a.m199493c(R.string.Project_MV_TeamProfilePicture, context));
        ConstraintLayout.LayoutParams layoutParams = new ConstraintLayout.LayoutParams(-2, -2);
        layoutParams.topMargin = C51468a.m199486a(14);
        layoutParams.setMarginStart(C51468a.m199486a(16));
        layoutParams.f2816h = 0;
        layoutParams.f2825q = 0;
        textView.setLayoutParams(layoutParams);
        constraintLayout2.addView(textView);
        LKUIRoundedImageView2 lKUIRoundedImageView2 = new LKUIRoundedImageView2(context, null, 0, 6, null);
        this.f136978g = lKUIRoundedImageView2;
        lKUIRoundedImageView2.setId(R.id.view_avatar);
        lKUIRoundedImageView2.setScaleType(ImageView.ScaleType.FIT_XY);
        int i = this.f136981j;
        ConstraintLayout.LayoutParams layoutParams2 = new ConstraintLayout.LayoutParams(i, i);
        layoutParams2.f2819k = 0;
        layoutParams2.f2825q = 0;
        layoutParams2.f2827s = 0;
        layoutParams2.bottomMargin = C51468a.m199486a(16);
        lKUIRoundedImageView2.setLayoutParams(layoutParams2);
        lKUIRoundedImageView2.setOval(true);
        lKUIRoundedImageView2.setOnClickListener(new View$OnClickListenerC55480b(constraintLayout, this, marginLayoutParams, context));
        constraintLayout.addView(lKUIRoundedImageView2);
        LKUIRoundedImageView2 lKUIRoundedImageView22 = new LKUIRoundedImageView2(context, null, 0, 6, null);
        int a = C51468a.m199486a(36);
        int a2 = C51468a.m199486a(56);
        ConstraintLayout.LayoutParams layoutParams3 = new ConstraintLayout.LayoutParams(a, a);
        layoutParams3.f2825q = R.id.view_avatar;
        layoutParams3.f2816h = R.id.view_avatar;
        layoutParams3.topMargin = a2;
        layoutParams3.setMarginStart(a2);
        lKUIRoundedImageView22.setLayoutParams(layoutParams3);
        lKUIRoundedImageView22.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        lKUIRoundedImageView22.setBackgroundResource(R.drawable.bg_avatar_edit_btn);
        Drawable iconDrawable = UDIconUtils.getIconDrawable(context, (int) R.drawable.icon_avatar_edit, C51468a.m199487a((int) R.color.static_white, context));
        int a3 = C51468a.m199486a(20);
        iconDrawable.setBounds(0, 0, a3, a3);
        lKUIRoundedImageView22.setImageDrawable(iconDrawable);
        constraintLayout.addView(lKUIRoundedImageView22);
        lKUIRoundedImageView22.setOnClickListener(new View$OnClickListenerC55481c(constraintLayout, this, marginLayoutParams, context));
        return constraintLayout;
    }

    @Override // com.ss.android.lark.piece.core.Piece
    /* renamed from: a */
    public boolean mo128689a(int i, int i2, Intent intent) {
        Serializable serializableExtra;
        String stringExtra;
        if (i2 != -1 || i != 9) {
            return false;
        }
        if (!(intent == null || (stringExtra = intent.getStringExtra("result_avatar_key")) == null)) {
            Intrinsics.checkExpressionValueIsNotNull(stringExtra, "it");
            m215250a(stringExtra);
        }
        if (intent == null || (serializableExtra = intent.getSerializableExtra("result_avatar_meta")) == null) {
            return true;
        }
        if (serializableExtra != null) {
            this.f136980i = (AvatarMeta) serializableExtra;
            return true;
        }
        throw new TypeCastException("null cannot be cast to non-null type com.ss.android.lark.chat.entity.chat.AvatarMeta");
    }
}
