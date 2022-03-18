package com.bytedance.ee.bear.bitable.card.view.cell.user;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ee.bear.at.AbstractC4240g;
import com.bytedance.ee.bear.at.AtObject;
import com.bytedance.ee.bear.at.C4227b;
import com.bytedance.ee.bear.atfinder.AbstractC4272g;
import com.bytedance.ee.bear.atfinder.AtFinderResult;
import com.bytedance.ee.bear.bitable.card.model.stmodel.cell.UserEntity;
import com.bytedance.ee.bear.bitable.card.view.cell.AbstractC4565a;
import com.bytedance.ee.bear.bitable.card.view.cell.CellEditDragView;
import com.bytedance.ee.bear.document.at.C5664d;
import com.bytedance.ee.bear.facade.common.widget.BearLottieView;
import com.bytedance.ee.bear.widgets.AbstractView$OnClickListenerC11839e;
import com.bytedance.ee.bear.widgets.panel.CommonActionPanelLayout;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.C13655e;
import com.bytedance.ee.util.p718t.C13747j;
import com.larksuite.component.universe_design.checkbox.UDCheckBox;
import com.larksuite.suite.R;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\b\b\u0018\u0000 *2\u00020\u0001:\u0003*+,B=\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\r\u001a\u00020\u000b¢\u0006\u0002\u0010\u000eJ\b\u0010\u0019\u001a\u00020\u001aH\u0002J\b\u0010\u001b\u001a\u00020\u001aH\u0016J\u0010\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u0002\u001a\u00020\u0003H\u0014J\u0006\u0010\u001e\u001a\u00020\u000bJ\b\u0010\u001f\u001a\u00020\u001aH\u0002J\u0018\u0010 \u001a\u00020\u001a2\u0006\u0010!\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0002J(\u0010\"\u001a\u00020\u001a2\b\u0010\u0016\u001a\u0004\u0018\u00010\u00072\u0006\u0010#\u001a\u00020\u000b2\u000e\u0010$\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010%J\b\u0010&\u001a\u00020\u001aH\u0002J\b\u0010'\u001a\u00020\u001aH\u0016J\u0014\u0010(\u001a\u00020\u001a2\f\u0010)\u001a\b\u0012\u0004\u0012\u00020\u00140%R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u000bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u000bX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\u0012\u001a\u0012\u0012\u0004\u0012\u00020\u00140\u0013j\b\u0012\u0004\u0012\u00020\u0014`\u0015X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0007X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0017\u001a\b\u0018\u00010\u0018R\u00020\u0000X\u000e¢\u0006\u0002\n\u0000¨\u0006-"}, d2 = {"Lcom/bytedance/ee/bear/bitable/card/view/cell/user/MentionUserSelectPanel;", "Lcom/bytedance/ee/bear/bitable/card/view/cell/BaseCellEditPanel;", "context", "Landroid/content/Context;", "activity", "Landroidx/fragment/app/FragmentActivity;", "token", "", ShareHitPoint.f121868c, "", "canShowNotifyBar", "", "canShowCheckBox", "enableNotifyUser", "(Landroid/content/Context;Landroidx/fragment/app/FragmentActivity;Ljava/lang/String;IZZZ)V", "multiSelect", "searchCallback", "Lcom/bytedance/ee/bear/atfinder/OnSearchCallback;", "selectedUsers", "Ljava/util/ArrayList;", "Lcom/bytedance/ee/bear/bitable/card/model/stmodel/cell/UserEntity;", "Lkotlin/collections/ArrayList;", "title", "viewsHolder", "Lcom/bytedance/ee/bear/bitable/card/view/cell/user/MentionUserSelectPanel$ViewsHolder;", "destroy", "", "dismiss", "getContentView", "Landroid/view/View;", "getEnableNotifyUser", "initMentionUserDependency", "reportEditOperation", "itemChangeNum", "setData", "isMultiple", "originUserList", "", "setViewsHolderData", "show", "updateData", "userList", "Companion", "InputTextWatch", "ViewsHolder", "bitable-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.bitable.card.view.cell.user.b */
public final class MentionUserSelectPanel extends AbstractC4565a {

    /* renamed from: l */
    public static final Companion f13863l = new Companion(null);

    /* renamed from: f */
    public ViewsHolder f13864f;

    /* renamed from: g */
    public ArrayList<UserEntity> f13865g = new ArrayList<>();

    /* renamed from: h */
    public boolean f13866h;

    /* renamed from: i */
    public final boolean f13867i;

    /* renamed from: j */
    public final boolean f13868j;

    /* renamed from: k */
    public final boolean f13869k;

    /* renamed from: m */
    private AbstractC4272g f13870m;

    /* renamed from: n */
    private String f13871n = "";

    /* renamed from: o */
    private final FragmentActivity f13872o;

    /* renamed from: p */
    private final String f13873p;

    /* renamed from: q */
    private final int f13874q;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/bytedance/ee/bear/bitable/card/view/cell/user/MentionUserSelectPanel$Companion;", "", "()V", "TAG", "", "bitable-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.bitable.card.view.cell.user.b$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* access modifiers changed from: private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0006\u0010D\u001a\u00020EJ\b\u0010F\u001a\u00020EH\u0002J\b\u0010G\u001a\u00020EH\u0002J\b\u0010H\u001a\u00020EH\u0002J\b\u0010I\u001a\u00020EH\u0002J\b\u0010J\u001a\u00020EH\u0002J\b\u0010K\u001a\u00020EH\u0002J\u001e\u0010L\u001a\u00020E2\f\u0010M\u001a\b\u0012\u0004\u0012\u00020O0N2\u0006\u0010P\u001a\u00020QH\u0002J\u000e\u0010R\u001a\u00020E2\u0006\u0010S\u001a\u00020\u0016J\u000e\u0010T\u001a\u00020E2\u0006\u0010U\u001a\u00020QJ\u0014\u0010V\u001a\u00020E2\f\u0010M\u001a\b\u0012\u0004\u0012\u00020O0NJ\u0014\u0010W\u001a\u00020E2\f\u0010M\u001a\b\u0012\u0004\u0012\u00020O0NJ\u000e\u0010X\u001a\u00020E2\u0006\u0010Y\u001a\u00020QJ\u0006\u0010Z\u001a\u00020EJ\b\u0010[\u001a\u00020EH\u0002R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\r\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0011\u001a\u00020\u0012¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u000e\u0010\u0015\u001a\u00020\u0016X\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\u0017\u001a\u00020\u0018¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\u001b\u001a\u00020\u001c¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR \u0010\u001f\u001a\b\u0018\u00010 R\u00020!X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b&\u0010'R\u0011\u0010(\u001a\u00020)¢\u0006\b\n\u0000\u001a\u0004\b*\u0010+R\u0011\u0010,\u001a\u00020-¢\u0006\b\n\u0000\u001a\u0004\b.\u0010/R\u0011\u00100\u001a\u000201¢\u0006\b\n\u0000\u001a\u0004\b2\u00103R\u001a\u00104\u001a\u000205X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b6\u00107\"\u0004\b8\u00109R\u0011\u0010:\u001a\u000201¢\u0006\b\n\u0000\u001a\u0004\b;\u00103R\u001c\u0010<\u001a\u0004\u0018\u00010=X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b>\u0010?\"\u0004\b@\u0010AR\u000e\u0010B\u001a\u00020CX\u000e¢\u0006\u0002\n\u0000¨\u0006\\"}, d2 = {"Lcom/bytedance/ee/bear/bitable/card/view/cell/user/MentionUserSelectPanel$ViewsHolder;", "", "rootView", "Landroid/view/View;", "(Lcom/bytedance/ee/bear/bitable/card/view/cell/user/MentionUserSelectPanel;Landroid/view/View;)V", "checkBox", "Lcom/larksuite/component/universe_design/checkbox/UDCheckBox;", "getCheckBox", "()Lcom/larksuite/component/universe_design/checkbox/UDCheckBox;", "checkBoxContainer", "Landroid/widget/LinearLayout;", "getCheckBoxContainer", "()Landroid/widget/LinearLayout;", "dragView", "Lcom/bytedance/ee/bear/bitable/card/view/cell/CellEditDragView;", "getDragView", "()Lcom/bytedance/ee/bear/bitable/card/view/cell/CellEditDragView;", "hintText", "Landroid/widget/TextView;", "getHintText", "()Landroid/widget/TextView;", "isFirstShow", "", "mInputClearIv", "Landroid/widget/ImageView;", "getMInputClearIv", "()Landroid/widget/ImageView;", "mInputEdit", "Landroid/widget/EditText;", "getMInputEdit", "()Landroid/widget/EditText;", "mTextWatch", "Lcom/bytedance/ee/bear/bitable/card/view/cell/user/MentionUserSelectPanel$InputTextWatch;", "Lcom/bytedance/ee/bear/bitable/card/view/cell/user/MentionUserSelectPanel;", "getMTextWatch", "()Lcom/bytedance/ee/bear/bitable/card/view/cell/user/MentionUserSelectPanel$InputTextWatch;", "setMTextWatch", "(Lcom/bytedance/ee/bear/bitable/card/view/cell/user/MentionUserSelectPanel$InputTextWatch;)V", "getRootView", "()Landroid/view/View;", "searchLoadingAnimation", "Lcom/bytedance/ee/bear/facade/common/widget/BearLottieView;", "getSearchLoadingAnimation", "()Lcom/bytedance/ee/bear/facade/common/widget/BearLottieView;", "searchLoadingLayout", "Landroid/widget/FrameLayout;", "getSearchLoadingLayout", "()Landroid/widget/FrameLayout;", "selectedRv", "Landroidx/recyclerview/widget/RecyclerView;", "getSelectedRv", "()Landroidx/recyclerview/widget/RecyclerView;", "selectedUserAdapter", "Lcom/bytedance/ee/bear/bitable/card/view/cell/user/SelectedUserAdapter;", "getSelectedUserAdapter", "()Lcom/bytedance/ee/bear/bitable/card/view/cell/user/SelectedUserAdapter;", "setSelectedUserAdapter", "(Lcom/bytedance/ee/bear/bitable/card/view/cell/user/SelectedUserAdapter;)V", "suggestRv", "getSuggestRv", "suggestRvAnimation", "Landroid/animation/ObjectAnimator;", "getSuggestRvAnimation", "()Landroid/animation/ObjectAnimator;", "setSuggestRvAnimation", "(Landroid/animation/ObjectAnimator;)V", "suggestUserAdapter", "Lcom/bytedance/ee/bear/bitable/card/view/cell/user/SuggestUserAdapter;", "hideLoading", "", "hideSelectedRv", "initDragView", "initNotifyBar", "initSearchLayout", "initSelectedListView", "initSuggestListView", "innerUpdateSelectedUser", "list", "", "Lcom/bytedance/ee/bear/bitable/card/model/stmodel/cell/UserEntity;", ShareHitPoint.f121868c, "", "setEnableMultiSelect", "enabled", "setLanguage", "language", "setSelectedUsers", "setSuggestUsers", "setTitle", "title", "showLoading", "showSelectedRv", "bitable-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.bitable.card.view.cell.user.b$c */
    public final class ViewsHolder {

        /* renamed from: a */
        final /* synthetic */ MentionUserSelectPanel f13876a;

        /* renamed from: b */
        private final CellEditDragView f13877b;

        /* renamed from: c */
        private final RecyclerView f13878c;

        /* renamed from: d */
        private final RecyclerView f13879d;

        /* renamed from: e */
        private final EditText f13880e;

        /* renamed from: f */
        private InputTextWatch f13881f;

        /* renamed from: g */
        private final ImageView f13882g;

        /* renamed from: h */
        private final FrameLayout f13883h;

        /* renamed from: i */
        private final BearLottieView f13884i;

        /* renamed from: j */
        private final LinearLayout f13885j;

        /* renamed from: k */
        private final UDCheckBox f13886k;

        /* renamed from: l */
        private final TextView f13887l;

        /* renamed from: m */
        private ObjectAnimator f13888m;

        /* renamed from: n */
        private SuggestUserAdapter f13889n = new SuggestUserAdapter();

        /* renamed from: o */
        private SelectedUserAdapter f13890o = new SelectedUserAdapter();

        /* renamed from: p */
        private boolean f13891p = true;

        /* renamed from: q */
        private final View f13892q;

        /* renamed from: a */
        public final EditText mo18382a() {
            return this.f13880e;
        }

        /* renamed from: b */
        public final ImageView mo18387b() {
            return this.f13882g;
        }

        /* renamed from: c */
        public final BearLottieView mo18390c() {
            return this.f13884i;
        }

        /* renamed from: d */
        public final UDCheckBox mo18391d() {
            return this.f13886k;
        }

        /* renamed from: e */
        public final ObjectAnimator mo18392e() {
            return this.f13888m;
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, d2 = {"com/bytedance/ee/bear/bitable/card/view/cell/user/MentionUserSelectPanel$ViewsHolder$initDragView$1", "Lcom/bytedance/ee/bear/widgets/panel/CommonActionPanelLayout$SimpleActionListener;", "onClickRightText", "", "bitable-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
        /* renamed from: com.bytedance.ee.bear.bitable.card.view.cell.user.b$c$a */
        public static final class C4698a extends CommonActionPanelLayout.SimpleActionListener {

            /* renamed from: a */
            final /* synthetic */ ViewsHolder f13893a;

            @Override // com.bytedance.ee.bear.widgets.panel.CommonActionPanelLayout.OnActionListener, com.bytedance.ee.bear.widgets.panel.CommonActionPanelLayout.SimpleActionListener
            /* renamed from: b */
            public void mo18277b() {
                this.f13893a.f13876a.mo17978b();
            }

            /* JADX WARN: Incorrect args count in method signature: ()V */
            C4698a(ViewsHolder cVar) {
                this.f13893a = cVar;
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\b\u0010\u0004\u001a\u00020\u0003H\u0016J\b\u0010\u0005\u001a\u00020\u0003H\u0016¨\u0006\u0006"}, d2 = {"com/bytedance/ee/bear/bitable/card/view/cell/user/MentionUserSelectPanel$ViewsHolder$initDragView$2", "Lcom/bytedance/ee/bear/bitable/card/view/cell/CellEditDragView$OnPositionChangeListener;", "onChangeToMaxPosition", "", "onChangeToMidPosition", "onChangeToMinPosition", "bitable-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
        /* renamed from: com.bytedance.ee.bear.bitable.card.view.cell.user.b$c$b */
        public static final class C4699b implements CellEditDragView.AbstractC4564b {

            /* renamed from: a */
            final /* synthetic */ ViewsHolder f13894a;

            @Override // com.bytedance.ee.bear.bitable.card.view.cell.CellEditDragView.AbstractC4564b
            /* renamed from: b */
            public void mo17970b() {
            }

            @Override // com.bytedance.ee.bear.bitable.card.view.cell.CellEditDragView.AbstractC4564b
            /* renamed from: c */
            public void mo17971c() {
            }

            @Override // com.bytedance.ee.bear.bitable.card.view.cell.CellEditDragView.AbstractC4564b
            /* renamed from: a */
            public void mo17969a() {
                this.f13894a.f13876a.mo17978b();
            }

            /* JADX WARN: Incorrect args count in method signature: ()V */
            C4699b(ViewsHolder cVar) {
                this.f13894a = cVar;
            }
        }

        /* renamed from: f */
        public final void mo18393f() {
            this.f13883h.setVisibility(0);
            this.f13884i.setVisibility(0);
            this.f13884i.playAnimation();
            this.f13878c.setVisibility(8);
        }

        /* renamed from: g */
        public final void mo18394g() {
            this.f13884i.cancelAnimation();
            this.f13883h.setVisibility(8);
            this.f13884i.setVisibility(8);
            this.f13878c.setVisibility(0);
        }

        /* renamed from: h */
        private final void m19475h() {
            this.f13877b.setOnActionListener(new C4698a(this));
            this.f13877b.setOnPositionChangeListener(new C4699b(this));
            C13747j.m55726a(this.f13877b, (int) R.color.bg_body);
        }

        /* renamed from: i */
        private final void m19476i() {
            InputTextWatch bVar = new InputTextWatch();
            this.f13881f = bVar;
            this.f13880e.addTextChangedListener(bVar);
            this.f13880e.setOnEditorActionListener(new C4701d(this));
            this.f13882g.setOnClickListener(new C4702e(this));
            this.f13882g.setVisibility(8);
        }

        /* renamed from: j */
        private final void m19477j() {
            LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this.f13876a.mo17981e());
            linearLayoutManager.setOrientation(0);
            this.f13879d.setLayoutManager(linearLayoutManager);
            this.f13879d.setAdapter(this.f13890o);
            this.f13890o.mo18404a(new C4703f(this));
        }

        /* renamed from: k */
        private final void m19478k() {
            this.f13878c.setLayoutManager(new LinearLayoutManager(this.f13876a.mo17981e()));
            this.f13878c.setAdapter(this.f13889n);
            this.f13889n.mo18415a(new C4704g(this));
            this.f13878c.addOnScrollListener(new C4705h(this));
        }

        /* renamed from: m */
        private final void m19480m() {
            if (this.f13879d.getVisibility() != 0) {
                ObjectAnimator objectAnimator = this.f13888m;
                if (objectAnimator != null) {
                    objectAnimator.end();
                }
                this.f13879d.setVisibility(0);
                int a = C13655e.m55411a(38);
                ObjectAnimator duration = ObjectAnimator.ofFloat(this.f13878c, "translationY", -((float) a), 0.0f).setDuration(300L);
                this.f13888m = duration;
                if (duration != null) {
                    duration.start();
                }
            }
        }

        /* renamed from: n */
        private final void m19481n() {
            if (this.f13879d.getVisibility() != 8) {
                ObjectAnimator objectAnimator = this.f13888m;
                if (objectAnimator != null) {
                    objectAnimator.end();
                }
                this.f13879d.setVisibility(8);
                int a = C13655e.m55411a(38);
                ObjectAnimator duration = ObjectAnimator.ofFloat(this.f13878c, "translationY", (float) a, 0.0f).setDuration(300L);
                this.f13888m = duration;
                if (duration != null) {
                    duration.start();
                }
            }
        }

        /* renamed from: l */
        private final void m19479l() {
            this.f13886k.setChecked(this.f13876a.f13869k);
            if (!this.f13876a.f13867i) {
                this.f13887l.setVisibility(8);
                this.f13885j.setVisibility(8);
            } else if (this.f13876a.f13868j) {
                this.f13885j.setVisibility(0);
                this.f13887l.setVisibility(8);
            } else {
                this.f13885j.setVisibility(8);
                this.f13887l.setVisibility(0);
            }
            this.f13885j.setOnClickListener(new View$OnClickListenerC4700c(this));
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0014¨\u0006\u0006"}, d2 = {"com/bytedance/ee/bear/bitable/card/view/cell/user/MentionUserSelectPanel$ViewsHolder$initSearchLayout$2", "Lcom/bytedance/ee/bear/widgets/SafeClickListener;", "onClicked", "", "v", "Landroid/view/View;", "bitable-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
        /* renamed from: com.bytedance.ee.bear.bitable.card.view.cell.user.b$c$e */
        public static final class C4702e extends AbstractView$OnClickListenerC11839e {

            /* renamed from: a */
            final /* synthetic */ ViewsHolder f13897a;

            /* JADX WARN: Incorrect args count in method signature: ()V */
            C4702e(ViewsHolder cVar) {
                this.f13897a = cVar;
            }

            /* access modifiers changed from: protected */
            @Override // com.bytedance.ee.bear.widgets.AbstractView$OnClickListenerC11839e
            /* renamed from: a */
            public void mo16698a(View view) {
                this.f13897a.mo18382a().setText("");
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0004\u0012\u00020\u00040\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0002¨\u0006\u0007"}, d2 = {"com/bytedance/ee/bear/bitable/card/view/cell/user/MentionUserSelectPanel$ViewsHolder$initSelectedListView$1", "Lkotlin/Function1;", "", "Lcom/bytedance/ee/bear/bitable/card/model/stmodel/cell/UserEntity;", "", "invoke", "list", "bitable-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
        /* renamed from: com.bytedance.ee.bear.bitable.card.view.cell.user.b$c$f */
        public static final class C4703f implements Function1<List<? extends UserEntity>, Unit> {

            /* renamed from: a */
            final /* synthetic */ ViewsHolder f13898a;

            /* JADX WARN: Incorrect args count in method signature: ()V */
            C4703f(ViewsHolder cVar) {
                this.f13898a = cVar;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // kotlin.jvm.functions.Function1
            public /* synthetic */ Unit invoke(List<? extends UserEntity> list) {
                mo18397a(list);
                return Unit.INSTANCE;
            }

            /* renamed from: a */
            public void mo18397a(List<? extends UserEntity> list) {
                Intrinsics.checkParameterIsNotNull(list, "list");
                this.f13898a.mo18385a(list, "top_bar");
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0004\u0012\u00020\u00040\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0002¨\u0006\u0007"}, d2 = {"com/bytedance/ee/bear/bitable/card/view/cell/user/MentionUserSelectPanel$ViewsHolder$initSuggestListView$1", "Lkotlin/Function1;", "", "Lcom/bytedance/ee/bear/bitable/card/model/stmodel/cell/UserEntity;", "", "invoke", "list", "bitable-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
        /* renamed from: com.bytedance.ee.bear.bitable.card.view.cell.user.b$c$g */
        public static final class C4704g implements Function1<List<? extends UserEntity>, Unit> {

            /* renamed from: a */
            final /* synthetic */ ViewsHolder f13899a;

            /* JADX WARN: Incorrect args count in method signature: ()V */
            C4704g(ViewsHolder cVar) {
                this.f13899a = cVar;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // kotlin.jvm.functions.Function1
            public /* synthetic */ Unit invoke(List<? extends UserEntity> list) {
                mo18398a(list);
                return Unit.INSTANCE;
            }

            /* renamed from: a */
            public void mo18398a(List<? extends UserEntity> list) {
                Intrinsics.checkParameterIsNotNull(list, "list");
                this.f13899a.mo18385a(list, "bottom_list");
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\b"}, d2 = {"com/bytedance/ee/bear/bitable/card/view/cell/user/MentionUserSelectPanel$ViewsHolder$initSuggestListView$2", "Landroidx/recyclerview/widget/RecyclerView$OnScrollListener;", "onScrollStateChanged", "", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "newState", "", "bitable-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
        /* renamed from: com.bytedance.ee.bear.bitable.card.view.cell.user.b$c$h */
        public static final class C4705h extends RecyclerView.OnScrollListener {

            /* renamed from: a */
            final /* synthetic */ ViewsHolder f13900a;

            /* JADX WARN: Incorrect args count in method signature: ()V */
            C4705h(ViewsHolder cVar) {
                this.f13900a = cVar;
            }

            @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
            public void onScrollStateChanged(RecyclerView recyclerView, int i) {
                Intrinsics.checkParameterIsNotNull(recyclerView, "recyclerView");
                super.onScrollStateChanged(recyclerView, i);
                if (i != 0) {
                    this.f13900a.mo18382a().clearFocus();
                    this.f13900a.f13876a.mo17982f();
                }
            }
        }

        /* renamed from: a */
        public final void mo18383a(String str) {
            Intrinsics.checkParameterIsNotNull(str, "title");
            this.f13877b.setTitle(str);
        }

        /* renamed from: b */
        public final void mo18388b(String str) {
            Intrinsics.checkParameterIsNotNull(str, "language");
            this.f13889n.mo18413a(str);
            this.f13890o.mo18402a(str);
        }

        /* access modifiers changed from: package-private */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 15})
        /* renamed from: com.bytedance.ee.bear.bitable.card.view.cell.user.b$c$c */
        public static final class View$OnClickListenerC4700c implements View.OnClickListener {

            /* renamed from: a */
            final /* synthetic */ ViewsHolder f13895a;

            View$OnClickListenerC4700c(ViewsHolder cVar) {
                this.f13895a = cVar;
            }

            public final void onClick(View view) {
                this.f13895a.mo18391d().setChecked(!this.f13895a.mo18391d().isChecked());
            }
        }

        /* renamed from: a */
        public final void mo18384a(List<? extends UserEntity> list) {
            Intrinsics.checkParameterIsNotNull(list, "list");
            this.f13889n.mo18417b(list);
        }

        /* renamed from: b */
        public final void mo18389b(List<? extends UserEntity> list) {
            Intrinsics.checkParameterIsNotNull(list, "list");
            this.f13889n.mo18414a(list);
            this.f13890o.mo18403a(list);
            if (this.f13890o.getItemCount() > 0) {
                m19480m();
                if (this.f13891p) {
                    this.f13891p = false;
                } else {
                    this.f13879d.smoothScrollToPosition(this.f13890o.getItemCount() - 1);
                }
            } else {
                m19481n();
            }
        }

        /* renamed from: a */
        public final void mo18386a(boolean z) {
            this.f13890o.mo18405a(z);
            this.f13889n.mo18416a(z);
        }

        /* renamed from: a */
        public final void mo18385a(List<? extends UserEntity> list, String str) {
            AbstractC4565a.AbstractC4569b bVar = this.f13876a.f13459c;
            if (bVar != null) {
                bVar.mo17986a(list);
            }
            this.f13876a.mo18376a(list.size() - this.f13876a.f13865g.size(), str);
            if (this.f13876a.f13866h) {
                mo18389b(list);
            } else {
                this.f13876a.mo17978b();
            }
        }

        public ViewsHolder(MentionUserSelectPanel bVar, View view) {
            Intrinsics.checkParameterIsNotNull(view, "rootView");
            this.f13876a = bVar;
            this.f13892q = view;
            View findViewById = view.findViewById(R.id.dragView);
            Intrinsics.checkExpressionValueIsNotNull(findViewById, "rootView.findViewById(R.id.dragView)");
            this.f13877b = (CellEditDragView) findViewById;
            View findViewById2 = view.findViewById(R.id.rv_search_result_users);
            Intrinsics.checkExpressionValueIsNotNull(findViewById2, "rootView.findViewById(R.id.rv_search_result_users)");
            this.f13878c = (RecyclerView) findViewById2;
            View findViewById3 = view.findViewById(R.id.rv_selected_users);
            Intrinsics.checkExpressionValueIsNotNull(findViewById3, "rootView.findViewById(R.id.rv_selected_users)");
            this.f13879d = (RecyclerView) findViewById3;
            View findViewById4 = view.findViewById(R.id.et_search_user);
            Intrinsics.checkExpressionValueIsNotNull(findViewById4, "rootView.findViewById(R.id.et_search_user)");
            this.f13880e = (EditText) findViewById4;
            View findViewById5 = view.findViewById(R.id.iv_search_clear_icon);
            Intrinsics.checkExpressionValueIsNotNull(findViewById5, "rootView.findViewById(R.id.iv_search_clear_icon)");
            this.f13882g = (ImageView) findViewById5;
            View findViewById6 = view.findViewById(R.id.fl_search_loading);
            Intrinsics.checkExpressionValueIsNotNull(findViewById6, "rootView.findViewById(R.id.fl_search_loading)");
            this.f13883h = (FrameLayout) findViewById6;
            View findViewById7 = view.findViewById(R.id.blv_search_user_loading);
            Intrinsics.checkExpressionValueIsNotNull(findViewById7, "rootView.findViewById(R.….blv_search_user_loading)");
            this.f13884i = (BearLottieView) findViewById7;
            View findViewById8 = view.findViewById(R.id.ll_checkbox_container);
            Intrinsics.checkExpressionValueIsNotNull(findViewById8, "rootView.findViewById(R.id.ll_checkbox_container)");
            this.f13885j = (LinearLayout) findViewById8;
            View findViewById9 = view.findViewById(R.id.cb_notify_checkbox);
            Intrinsics.checkExpressionValueIsNotNull(findViewById9, "rootView.findViewById(R.id.cb_notify_checkbox)");
            this.f13886k = (UDCheckBox) findViewById9;
            View findViewById10 = view.findViewById(R.id.tv_hint_text);
            Intrinsics.checkExpressionValueIsNotNull(findViewById10, "rootView.findViewById(R.id.tv_hint_text)");
            this.f13887l = (TextView) findViewById10;
            m19475h();
            m19476i();
            m19477j();
            m19478k();
            m19479l();
        }

        /* access modifiers changed from: package-private */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u000e\u0010\u0007\u001a\n \u0004*\u0004\u0018\u00010\b0\bH\n¢\u0006\u0002\b\t"}, d2 = {"<anonymous>", "", "v", "Landroid/widget/TextView;", "kotlin.jvm.PlatformType", "actionId", "", "event", "Landroid/view/KeyEvent;", "onEditorAction"}, mo238835k = 3, mv = {1, 1, 15})
        /* renamed from: com.bytedance.ee.bear.bitable.card.view.cell.user.b$c$d */
        public static final class C4701d implements TextView.OnEditorActionListener {

            /* renamed from: a */
            final /* synthetic */ ViewsHolder f13896a;

            C4701d(ViewsHolder cVar) {
                this.f13896a = cVar;
            }

            public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
                if (i != 3 && i != 6) {
                    return false;
                }
                this.f13896a.f13876a.mo17982f();
                return true;
            }
        }
    }

    @Override // com.bytedance.ee.bear.bitable.card.view.cell.AbstractC4565a
    /* renamed from: b */
    public void mo17978b() {
        super.mo17978b();
        m19467k();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\b\u0010\u0006\u001a\u00020\u0003H\u0016¨\u0006\u0007"}, d2 = {"com/bytedance/ee/bear/bitable/card/view/cell/user/MentionUserSelectPanel$initMentionUserDependency$1", "Lcom/bytedance/ee/bear/atfinder/OnSearchCallback;", "onSearchResult", "", "result", "Lcom/bytedance/ee/bear/atfinder/AtFinderResult;", "onSearchStart", "bitable-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.bitable.card.view.cell.user.b$d */
    public static final class C4706d implements AbstractC4272g {

        /* renamed from: a */
        final /* synthetic */ MentionUserSelectPanel f13901a;

        @Override // com.bytedance.ee.bear.atfinder.AbstractC4272g
        /* renamed from: a */
        public void mo16696a() {
            ViewsHolder cVar = this.f13901a.f13864f;
            if (cVar != null) {
                cVar.mo18393f();
            }
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C4706d(MentionUserSelectPanel bVar) {
            this.f13901a = bVar;
        }

        @Override // com.bytedance.ee.bear.atfinder.AbstractC4272g
        /* renamed from: a */
        public void mo16697a(AtFinderResult atFinderResult) {
            Intrinsics.checkParameterIsNotNull(atFinderResult, "result");
            List<AtObject> list = atFinderResult.list;
            if (list == null) {
                C13479a.m54775e("UserSelectPresenter", "onSearchResult: list == null");
                return;
            }
            C13479a.m54764b("UserSelectPresenter", "onSearchResult()... result size = " + list.size());
            ArrayList arrayList = new ArrayList();
            for (AtObject atObject : list) {
                Intrinsics.checkExpressionValueIsNotNull(atObject, "atObject");
                arrayList.add(new UserEntity(atObject.getId(), atObject.getName(), atObject.getEn_name(), atObject.getAvatar_url(), atObject.getDepartment()));
            }
            ViewsHolder cVar = this.f13901a.f13864f;
            if (cVar != null) {
                cVar.mo18394g();
            }
            ViewsHolder cVar2 = this.f13901a.f13864f;
            if (cVar2 != null) {
                cVar2.mo18384a(arrayList);
            }
        }
    }

    /* renamed from: i */
    private final void m19465i() {
        C5664d.m22980a();
        C4227b.m17590c().mo16636a(this.f13872o, this.f13873p, this.f13874q, "0");
        this.f13870m = new C4706d(this);
    }

    /* renamed from: j */
    private final void m19466j() {
        ViewsHolder cVar = this.f13864f;
        if (cVar != null) {
            cVar.mo18386a(this.f13866h);
        }
        ViewsHolder cVar2 = this.f13864f;
        if (cVar2 != null) {
            cVar2.mo18389b(this.f13865g);
        }
        ViewsHolder cVar3 = this.f13864f;
        if (cVar3 != null) {
            cVar3.mo18383a(this.f13871n);
        }
    }

    /* renamed from: h */
    public final boolean mo18173h() {
        UDCheckBox d;
        ViewsHolder cVar = this.f13864f;
        if (cVar == null || (d = cVar.mo18391d()) == null || !d.isChecked()) {
            return false;
        }
        return true;
    }

    /* renamed from: k */
    private final void m19467k() {
        BearLottieView c;
        ObjectAnimator e;
        C4227b.m17590c().mo16639b(this.f13870m);
        C4227b.m17590c().mo16635a();
        ViewsHolder cVar = this.f13864f;
        if (!(cVar == null || (e = cVar.mo18392e()) == null)) {
            e.cancel();
        }
        ViewsHolder cVar2 = this.f13864f;
        if (cVar2 != null && (c = cVar2.mo18390c()) != null) {
            c.cancelAnimation();
        }
    }

    @Override // com.bytedance.ee.bear.bitable.card.view.cell.AbstractC4565a
    /* renamed from: a */
    public void mo17973a() {
        String str;
        EditText a;
        Editable text;
        C4227b.m17590c().mo16637a(this.f13870m);
        AbstractC4240g c = C4227b.m17590c();
        ViewsHolder cVar = this.f13864f;
        if (cVar == null || (a = cVar.mo18382a()) == null || (text = a.getText()) == null || (str = text.toString()) == null) {
            str = "";
        }
        c.mo16638a(str);
        super.mo17973a();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J(\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\nH\u0016J(\u0010\r\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nH\u0016¨\u0006\u000f"}, d2 = {"Lcom/bytedance/ee/bear/bitable/card/view/cell/user/MentionUserSelectPanel$InputTextWatch;", "Landroid/text/TextWatcher;", "(Lcom/bytedance/ee/bear/bitable/card/view/cell/user/MentionUserSelectPanel;)V", "afterTextChanged", "", "s", "Landroid/text/Editable;", "beforeTextChanged", "", "start", "", "count", "after", "onTextChanged", "before", "bitable-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.bitable.card.view.cell.user.b$b */
    public final class InputTextWatch implements TextWatcher {
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            Intrinsics.checkParameterIsNotNull(charSequence, "s");
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            Intrinsics.checkParameterIsNotNull(charSequence, "s");
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        public InputTextWatch() {
        }

        public void afterTextChanged(Editable editable) {
            ImageView b;
            int i;
            Intrinsics.checkParameterIsNotNull(editable, "s");
            String obj = editable.toString();
            C4227b.m17590c().mo16638a(obj);
            ViewsHolder cVar = MentionUserSelectPanel.this.f13864f;
            if (cVar != null && (b = cVar.mo18387b()) != null) {
                if (TextUtils.isEmpty(obj)) {
                    i = 8;
                } else {
                    i = 0;
                }
                b.setVisibility(i);
            }
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.bitable.card.view.cell.AbstractC4565a
    /* renamed from: a */
    public View mo17972a(Context context) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        View view = this.f13458b;
        Intrinsics.checkExpressionValueIsNotNull(view, "contentView");
        return view;
    }

    /* renamed from: a */
    public final void mo18378a(List<? extends UserEntity> list) {
        Intrinsics.checkParameterIsNotNull(list, "userList");
        ViewsHolder cVar = this.f13864f;
        if (cVar != null) {
            cVar.mo18389b(list);
        }
    }

    /* renamed from: a */
    public final void mo18376a(int i, String str) {
        Editable editable;
        int i2;
        EditText a;
        this.f13460d.clear();
        Map map = this.f13460d;
        Intrinsics.checkExpressionValueIsNotNull(map, "editParams");
        ViewsHolder cVar = this.f13864f;
        if (cVar == null || (a = cVar.mo18382a()) == null) {
            editable = null;
        } else {
            editable = a.getText();
        }
        map.put("bitable_edit_search", String.valueOf(!TextUtils.isEmpty(editable)));
        Map map2 = this.f13460d;
        Intrinsics.checkExpressionValueIsNotNull(map2, "editParams");
        map2.put("click_done_btn", String.valueOf(false));
        Map map3 = this.f13460d;
        Intrinsics.checkExpressionValueIsNotNull(map3, "editParams");
        map3.put("is_edit_panel_open", String.valueOf(this.f13866h));
        Map map4 = this.f13460d;
        Intrinsics.checkExpressionValueIsNotNull(map4, "editParams");
        if (i >= 0) {
            i2 = RangesKt.coerceAtMost(i, 1);
        } else {
            i2 = -1;
        }
        map4.put("cell_item_change", String.valueOf(i2));
        Map map5 = this.f13460d;
        Intrinsics.checkExpressionValueIsNotNull(map5, "editParams");
        map5.put("delete_item_source", str);
        this.f13459c.mo17987a("member", this.f13460d);
    }

    /* renamed from: a */
    public final void mo18377a(String str, boolean z, List<? extends UserEntity> list) {
        if (str == null) {
            str = "";
        }
        this.f13871n = str;
        this.f13866h = z;
        if (list == null) {
            list = CollectionsKt.emptyList();
        }
        this.f13865g.clear();
        this.f13865g.addAll(list);
        m19466j();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MentionUserSelectPanel(Context context, FragmentActivity fragmentActivity, String str, int i, boolean z, boolean z2, boolean z3) {
        super(context);
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(fragmentActivity, "activity");
        Intrinsics.checkParameterIsNotNull(str, "token");
        this.f13872o = fragmentActivity;
        this.f13873p = str;
        this.f13874q = i;
        this.f13867i = z;
        this.f13868j = z2;
        this.f13869k = z3;
        this.f13458b = LayoutInflater.from(context).inflate(R.layout.bitable_card_user_list_container, (ViewGroup) null);
        View view = this.f13458b;
        Intrinsics.checkExpressionValueIsNotNull(view, "contentView");
        ViewsHolder cVar = new ViewsHolder(this, view);
        this.f13864f = cVar;
        if (cVar != null) {
            Resources resources = context.getResources();
            Intrinsics.checkExpressionValueIsNotNull(resources, "context.resources");
            Locale locale = resources.getConfiguration().locale;
            Intrinsics.checkExpressionValueIsNotNull(locale, "context.resources.configuration.locale");
            String language = locale.getLanguage();
            Intrinsics.checkExpressionValueIsNotNull(language, "context.resources.configuration.locale.language");
            cVar.mo18388b(language);
        }
        m19465i();
    }
}
