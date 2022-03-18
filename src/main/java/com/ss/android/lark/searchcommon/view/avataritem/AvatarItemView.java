package com.ss.android.lark.searchcommon.view.avataritem;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.huawei.updatesdk.service.otaupdate.UpdateKey;
import com.larksuite.component.ui.avatar.AvatarModel;
import com.larksuite.component.ui.avatar.v2.LarkAvatarView;
import com.larksuite.component.ui.badge.BadgeModel;
import com.larksuite.component.ui.badge.miniicon.MiniIconModel;
import com.larksuite.component.ui.list.C25676a;
import com.larksuite.component.ui.list.IComponentBinder;
import com.larksuite.component.ui.p1153e.C25653b;
import com.larksuite.component.ui.tag.LarkNameTag;
import com.larksuite.component.universe_design.checkbox.UDCheckBox;
import com.larksuite.framework.ui.SpareLayout;
import com.larksuite.framework.utils.CollectionUtils;
import com.larksuite.framework.utils.DeviceUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.searchcommon.SearchCommonModuleDependency;
import com.ss.android.lark.searchcommon.view.avataritem.assigntime.AssignTimeBinder;
import com.ss.android.lark.searchcommon.view.avataritem.assigntime.AssignTimeModel;
import com.ss.android.lark.searchcommon.view.avataritem.checkbox.CheckBoxBinder;
import com.ss.android.lark.searchcommon.view.avataritem.checkbox.CheckBoxModel;
import com.ss.android.lark.searchcommon.view.avataritem.localtime.LocalTimeBinder;
import com.ss.android.lark.searchcommon.view.avataritem.localtime.LocalTimeModel;
import com.ss.android.lark.searchcommon.view.avataritem.personalstatus.PersonalStatus;
import com.ss.android.lark.searchcommon.view.avataritem.personalstatus.PersonalStatusBinder;
import com.ss.android.lark.searchcommon.view.avataritem.subtitle.SubtitleModel;
import com.ss.android.lark.searchcommon.view.avataritem.summary.SummaryModel;
import com.ss.android.lark.searchcommon.view.avataritem.title.TitleBinder;
import com.ss.android.lark.searchcommon.view.avataritem.title.TitleModel;
import com.ss.android.lark.searchcommon.view.avataritem.title.TitleTailBinder;
import com.ss.android.lark.searchcommon.view.avataritem.title.TitleTailModel;
import com.ss.android.lark.searchcommon.view.avataritem.userstatus.UserStatusBinder;
import com.ss.android.lark.searchcommon.view.avataritem.userstatus.UserStatusModel;
import com.ss.android.lark.ui.p2892a.C57582a;
import com.ss.android.lark.utils.C57782ag;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.lark.widget.EllipsizedEmojiconTextView;
import com.ss.android.lark.widget.status.UserStatusLinearLayout;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0016\u0018\u0000 \u00012\u00020\u00012\u00020\u0002:\u0004\u0001\u0001B/\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000bJ\b\u00101\u001a\u000202H\u0002J\u000e\u00103\u001a\u00020\u00002\u0006\u00104\u001a\u00020\bJ\u000e\u00105\u001a\u0002022\u0006\u00106\u001a\u000207J\u000e\u00108\u001a\u0002022\u0006\u00109\u001a\u00020\u0019J\u000e\u0010:\u001a\u0002022\u0006\u0010;\u001a\u00020<J\u0010\u0010=\u001a\u0002022\u0006\u0010>\u001a\u00020\bH\u0002J\u000e\u0010?\u001a\u0002022\u0006\u0010@\u001a\u00020AJ\u000e\u0010B\u001a\u0002022\u0006\u0010C\u001a\u00020DJ\u000e\u0010E\u001a\u0002022\u0006\u0010>\u001a\u00020\bJ\u000e\u0010F\u001a\u0002022\u0006\u0010G\u001a\u00020HJ\u0010\u0010I\u001a\u0002022\b\u0010J\u001a\u0004\u0018\u00010KJ\u000e\u0010L\u001a\u0002022\u0006\u0010\u0012\u001a\u00020\u0013J\b\u0010M\u001a\u00020\u0019H\u0014J\b\u0010N\u001a\u000202H\u0002J\u000e\u0010O\u001a\u0002022\u0006\u0010O\u001a\u00020PJ\u0010\u0010Q\u001a\u0002022\b\u0010R\u001a\u0004\u0018\u00010SJ\u0018\u0010T\u001a\u0002022\u0006\u0010U\u001a\u00020\b2\u0006\u0010V\u001a\u00020\bH\u0014J\u000e\u0010W\u001a\u0002022\u0006\u0010X\u001a\u00020YJ\b\u0010Z\u001a\u000202H\u0014JÍ\u0001\u0010[\u001a\u000202\"\u0010\b\u0000\u0010\\*\n ^*\u0004\u0018\u00010]0]\"\u0010\b\u0001\u0010_*\n ^*\u0004\u0018\u00010\u00190\u00192*\u0010`\u001a&\u0012\f\u0012\n ^*\u0004\u0018\u0001H\\H\\ ^*\u0012\u0012\f\u0012\n ^*\u0004\u0018\u0001H\\H\\\u0018\u00010a0a2*\u0010b\u001a&\u0012\f\u0012\n ^*\u0004\u0018\u0001H_H_ ^*\u0012\u0012\f\u0012\n ^*\u0004\u0018\u0001H_H_\u0018\u00010a0a2F\u0010c\u001aB\u0012\f\u0012\n ^*\u0004\u0018\u0001H_H_\u0012\f\u0012\n ^*\u0004\u0018\u0001H\\H\\ ^* \u0012\f\u0012\n ^*\u0004\u0018\u0001H_H_\u0012\f\u0012\n ^*\u0004\u0018\u0001H\\H\\\u0018\u00010d0dH\u0001J\u0006\u0010e\u001a\u000202J\u0006\u0010f\u001a\u000202J\u0006\u0010g\u001a\u00020\u0000J\u0012\u0010h\u001a\u0002022\b\u0010i\u001a\u0004\u0018\u00010jH\u0016J\u000e\u0010k\u001a\u0002022\u0006\u0010l\u001a\u00020mJ\u0016\u0010k\u001a\u0002022\u0006\u0010l\u001a\u00020m2\u0006\u0010n\u001a\u00020\bJ\u000e\u0010o\u001a\u0002022\u0006\u0010p\u001a\u00020AJ\u000e\u0010q\u001a\u0002022\u0006\u0010r\u001a\u00020sJ\u0006\u0010t\u001a\u00020DJ\u000e\u0010u\u001a\u0002022\u0006\u0010v\u001a\u00020wJ\u000e\u0010x\u001a\u0002022\u0006\u0010y\u001a\u00020zJ\u000e\u0010{\u001a\u0002022\u0006\u0010|\u001a\u00020}J\u0012\u0010~\u001a\u0002022\n\u0010\u001a\u0006\u0012\u0002\b\u00030aJ\u0007\u0010\u0001\u001a\u000202J\u0010\u0010\u0001\u001a\u0002022\u0007\u0010\u0001\u001a\u00020AJ\u0010\u0010/\u001a\u0002022\b\u0010\u0001\u001a\u00030\u0001J\u000b\u0010\u0001\u001a\u00020\b*\u00020DJ\u000b\u0010\u0001\u001a\u00020\b*\u00020\bJ\u000b\u0010\u0001\u001a\u00020D*\u00020DJ\r\u0010\u0001\u001a\u00020\b*\u00020\rH\u0002R\u000e\u0010\f\u001a\u00020\rX.¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX.¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X.¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X.¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\u00020\nX\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u000e\u0010\u0016\u001a\u00020\u0017X.¢\u0006\u0002\n\u0000R\u001b\u0010\u0018\u001a\u00020\u00198BX\u0002¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001a\u0010\u001bR\u000e\u0010\u001e\u001a\u00020\u0019X.¢\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020\rX.¢\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020\bX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020\bX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020#X.¢\u0006\u0002\n\u0000R\u000e\u0010$\u001a\u00020%X.¢\u0006\u0002\n\u0000R\u000e\u0010&\u001a\u00020#X.¢\u0006\u0002\n\u0000R\u000e\u0010'\u001a\u00020\u0017X.¢\u0006\u0002\n\u0000R\u000e\u0010(\u001a\u00020)X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010*\u001a\u00020\rX.¢\u0006\u0002\n\u0000R\u000e\u0010+\u001a\u00020)X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010,\u001a\u00020\rX.¢\u0006\u0002\n\u0000R\u000e\u0010-\u001a\u00020\rX.¢\u0006\u0002\n\u0000R\u000e\u0010.\u001a\u00020\rX.¢\u0006\u0002\n\u0000R\u000e\u0010/\u001a\u000200X.¢\u0006\u0002\n\u0000¨\u0006\u0001"}, d2 = {"Lcom/ss/android/lark/searchcommon/view/avataritem/AvatarItemView;", "Landroid/widget/LinearLayout;", "Lcom/larksuite/component/ui/list/ICompositeComponent;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "compositeComponentDelegate", "Lcom/larksuite/component/ui/list/CompositeComponentDelegate;", "(Landroid/content/Context;Landroid/util/AttributeSet;ILcom/larksuite/component/ui/list/CompositeComponentDelegate;)V", "assignTimeView", "Landroid/widget/TextView;", "avatarView", "Lcom/larksuite/component/ui/avatar/v2/LarkAvatarView;", "checkBox", "Lcom/larksuite/component/universe_design/checkbox/UDCheckBox;", "checkBoxModel", "Lcom/ss/android/lark/searchcommon/view/avataritem/checkbox/CheckBoxModel;", "getCompositeComponentDelegate", "()Lcom/larksuite/component/ui/list/CompositeComponentDelegate;", "contentLayout", "Landroid/widget/FrameLayout;", "contentView", "Landroid/view/View;", "getContentView", "()Landroid/view/View;", "contentView$delegate", "Lkotlin/Lazy;", "divider", "localTimeView", "mOldHeightMeasureSpec", "mOldWidthMeasureSpec", "personalStatusView", "Landroid/widget/ImageView;", "rightItemWrapper", "Landroid/view/ViewGroup;", "rightTagWrapper", "rightViewHolder", "subTitleState", "Lcom/ss/android/lark/searchcommon/view/avataritem/AvatarItemView$UiState;", "subTitleView", "summaryState", "summaryView", "titleTailView", "titleView", "userStatus", "Lcom/ss/android/lark/widget/status/UserStatusLinearLayout;", "adjustAvatarTopMargin", "", "applyStyle", "style", "assignTime", "time", "Lcom/ss/android/lark/searchcommon/view/avataritem/assigntime/AssignTimeModel;", "attachRightView", "v", "avatar", "avatarModel", "Lcom/larksuite/component/ui/avatar/AvatarModel;", "avatarMarginStart", "margin", "avatarShape", "isOval", "", "avatarSizeAdjust", "size", "", "avatarTopMargin", "badge", "badgeModel", "Lcom/larksuite/component/ui/badge/BadgeModel;", "bindAvatarWithUrl", "url", "", "checkState", "createContentView", "layoutSelf", "localTime", "Lcom/ss/android/lark/searchcommon/view/avataritem/localtime/LocalTimeModel;", "miniIcon", "miniIconModel", "Lcom/larksuite/component/ui/badge/miniicon/MiniIconModel;", "onMeasure", "widthMeasureSpec", "heightMeasureSpec", "personalStatus", UpdateKey.STATUS, "Lcom/ss/android/lark/searchcommon/view/avataritem/personalstatus/PersonalStatus;", "registerBinder", "registerModelBinder", "M", "", "kotlin.jvm.PlatformType", "V", "p0", "Ljava/lang/Class;", "p1", "p2", "Lcom/larksuite/component/ui/list/IComponentBinder;", "removeRightView", "resetAllViews", "resetTags", "setOnClickListener", "l", "Landroid/view/View$OnClickListener;", "setTag", "builder", "Lcom/larksuite/component/ui/tag/LarkNameTag$Builder;", "tagMode", "showDivider", "isShow", "subTitle", "subtitleModel", "Lcom/ss/android/lark/searchcommon/view/avataritem/subtitle/SubtitleModel;", "subTitleTextSize", "summary", "summaryModel", "Lcom/ss/android/lark/searchcommon/view/avataritem/summary/SummaryModel;", "title", "titleModel", "Lcom/ss/android/lark/searchcommon/view/avataritem/title/TitleModel;", "titleTail", "tailModel", "Lcom/ss/android/lark/searchcommon/view/avataritem/title/TitleTailModel;", "unBindAvatar", "modelClass", "unbindPersonalStatus", "updateCheckState", "isChecked", "model", "Lcom/ss/android/lark/searchcommon/view/avataritem/userstatus/UserStatusModel;", "dp", "dpF", "numOfCharsByHanziOne", "Companion", "UiState", "search-common_release"}, mo238835k = 1, mv = {1, 1, 16})
public class AvatarItemView extends LinearLayout {

    /* renamed from: b */
    public static int f133490b = -1;

    /* renamed from: c */
    public static int f133491c = -1;

    /* renamed from: d */
    public static final Companion f133492d = new Companion(null);

    /* renamed from: a */
    private UDCheckBox f133493a;

    /* renamed from: e */
    private LarkAvatarView f133494e;

    /* renamed from: f */
    private TextView f133495f;

    /* renamed from: g */
    private ImageView f133496g;

    /* renamed from: h */
    private TextView f133497h;

    /* renamed from: i */
    private UserStatusLinearLayout f133498i;

    /* renamed from: j */
    private TextView f133499j;

    /* renamed from: k */
    private TextView f133500k;

    /* renamed from: l */
    private TextView f133501l;

    /* renamed from: m */
    private TextView f133502m;

    /* renamed from: n */
    private View f133503n;

    /* renamed from: o */
    private CheckBoxModel f133504o;

    /* renamed from: p */
    private FrameLayout f133505p;

    /* renamed from: q */
    private ViewGroup f133506q;

    /* renamed from: r */
    private ImageView f133507r;

    /* renamed from: s */
    private FrameLayout f133508s;

    /* renamed from: t */
    private final Lazy f133509t;

    /* renamed from: u */
    private int f133510u;

    /* renamed from: v */
    private int f133511v;

    /* renamed from: w */
    private UiState f133512w;

    /* renamed from: x */
    private UiState f133513x;

    /* renamed from: y */
    private final C25676a f133514y;

    /* access modifiers changed from: private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/ss/android/lark/searchcommon/view/avataritem/AvatarItemView$UiState;", "", "(Ljava/lang/String;I)V", "NONE", "SHOW", "HIDE", "search-common_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.searchcommon.view.avataritem.AvatarItemView$b */
    public enum UiState {
        NONE,
        SHOW,
        HIDE
    }

    public AvatarItemView(Context context) {
        this(context, null, 0, null, 14, null);
    }

    public AvatarItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, null, 12, null);
    }

    public AvatarItemView(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, null, 8, null);
    }

    private final View getContentView() {
        return (View) this.f133509t.getValue();
    }

    /* renamed from: a */
    public <M, V extends View> void mo184674a(Class<M> cls, Class<V> cls2, IComponentBinder<? super V, ? super M> bVar) {
        this.f133514y.mo89818a(cls, cls2, bVar);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u000e\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nXT¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\nXT¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\nXT¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u001a\u0010\u0018\u001a\u00020\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u001a\u0010\u001d\u001a\u00020\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001a\"\u0004\b\u001f\u0010\u001c¨\u0006 "}, d2 = {"Lcom/ss/android/lark/searchcommon/view/avataritem/AvatarItemView$Companion;", "", "()V", "AVATAR_ITEM_HEIGHT", "", "AVATAR_SIZE", "CHECKBOX_LAYOUT_SIZE", "DIVIDER_HEIGHT", "DRAWABLE_PADDING_4", "INVALID_NUM_OF_CHARS", "", "LAYOUT_MARGIN_12", "LAYOUT_MARGIN_16", "LAYOUT_MARGIN_4", "LAYOUT_MARGIN_8", "PERSONAL_STATUS_SIZE", "SUBTITLE_HEIGHT", "TAG", "", "TAG_MODE_ALIGN_RIGHT", "TAG_MODE_TEXT_END", "TEXT_SIZE_12", "TEXT_SIZE_17", "TITLE_HEIGHT", "subTitleNumOfChars", "getSubTitleNumOfChars", "()I", "setSubTitleNumOfChars", "(I)V", "titleNumOfChars", "getTitleNumOfChars", "setTitleNumOfChars", "search-common_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.searchcommon.view.avataritem.AvatarItemView$a */
    public static final class Companion {
        private Companion() {
        }

        /* renamed from: a */
        public final int mo184693a() {
            return AvatarItemView.f133490b;
        }

        /* renamed from: b */
        public final int mo184694b() {
            return AvatarItemView.f133491c;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* access modifiers changed from: protected */
    public final C25676a getCompositeComponentDelegate() {
        return this.f133514y;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v2, resolved type: com.larksuite.component.ui.list.a */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    public final void mo184665a(CheckBoxModel bVar) {
        Intrinsics.checkParameterIsNotNull(bVar, "checkBoxModel");
        if (bVar.mo184708c()) {
            m209326d(12);
        } else {
            m209326d(16);
        }
        this.f133504o = bVar;
        C25676a aVar = this.f133514y;
        Class<?> cls = getClass();
        UDCheckBox uDCheckBox = this.f133493a;
        if (uDCheckBox == null) {
            Intrinsics.throwUninitializedPropertyAccessException("checkBox");
        }
        aVar.mo89817a((Class<? extends Object>) cls, (View) uDCheckBox, (Object) bVar);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r5v1, resolved type: com.larksuite.component.ui.list.a */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    public final void mo184676a(boolean z) {
        CheckBoxModel bVar = this.f133504o;
        if (bVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("checkBoxModel");
        }
        bVar.mo184703a(z);
        C25676a aVar = this.f133514y;
        Class<?> cls = getClass();
        UDCheckBox uDCheckBox = this.f133493a;
        if (uDCheckBox == null) {
            Intrinsics.throwUninitializedPropertyAccessException("checkBox");
        }
        UDCheckBox uDCheckBox2 = uDCheckBox;
        CheckBoxModel bVar2 = this.f133504o;
        if (bVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("checkBoxModel");
        }
        aVar.mo89817a((Class<? extends Object>) cls, (View) uDCheckBox2, (Object) bVar2);
    }

    /* renamed from: a */
    public final void mo184675a(String str) {
        if (str == null || !(!StringsKt.isBlank(str))) {
            LarkAvatarView larkAvatarView = this.f133494e;
            if (larkAvatarView == null) {
                Intrinsics.throwUninitializedPropertyAccessException("avatarView");
            }
            larkAvatarView.setVisibility(8);
            FrameLayout frameLayout = this.f133505p;
            if (frameLayout == null) {
                Intrinsics.throwUninitializedPropertyAccessException("contentLayout");
            }
            ViewGroup.LayoutParams layoutParams = frameLayout.getLayoutParams();
            if (layoutParams != null) {
                ((RelativeLayout.LayoutParams) layoutParams).setMarginStart(mo184677b(16.0f));
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
        }
        LarkAvatarView larkAvatarView2 = this.f133494e;
        if (larkAvatarView2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("avatarView");
        }
        larkAvatarView2.setVisibility(0);
        FrameLayout frameLayout2 = this.f133505p;
        if (frameLayout2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("contentLayout");
        }
        ViewGroup.LayoutParams layoutParams2 = frameLayout2.getLayoutParams();
        if (layoutParams2 != null) {
            ((RelativeLayout.LayoutParams) layoutParams2).setMarginStart(0);
            SearchCommonModuleDependency.ISearchCommonModuleDependency b = SearchCommonModuleDependency.m208732b();
            Context context = getContext();
            LarkAvatarView larkAvatarView3 = this.f133494e;
            if (larkAvatarView3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("avatarView");
            }
            b.mo102892a(context, str, larkAvatarView3, UIHelper.getDrawable(R.drawable.lark_avatar_placeholder), null, mo184677b(48.0f), mo184677b(48.0f));
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
    }

    /* renamed from: a */
    public final void mo184673a(Class<?> cls) {
        Intrinsics.checkParameterIsNotNull(cls, "modelClass");
        LarkAvatarView larkAvatarView = this.f133494e;
        if (larkAvatarView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("avatarView");
        }
        larkAvatarView.mo89077a(cls);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: com.larksuite.component.ui.list.a */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    public final void mo184670a(TitleModel bVar) {
        Intrinsics.checkParameterIsNotNull(bVar, "titleModel");
        C25676a aVar = this.f133514y;
        Class<?> cls = getClass();
        TextView textView = this.f133495f;
        if (textView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("titleView");
        }
        aVar.mo89817a((Class<? extends Object>) cls, (View) textView, (Object) bVar);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: com.larksuite.component.ui.list.a */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    public final void mo184667a(PersonalStatus aVar) {
        Intrinsics.checkParameterIsNotNull(aVar, UpdateKey.STATUS);
        C25676a aVar2 = this.f133514y;
        Class<?> cls = getClass();
        ImageView imageView = this.f133496g;
        if (imageView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("personalStatusView");
        }
        aVar2.mo89817a((Class<? extends Object>) cls, (View) imageView, (Object) aVar);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: com.larksuite.component.ui.list.a */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    public final void mo184671a(TitleTailModel dVar) {
        Intrinsics.checkParameterIsNotNull(dVar, "tailModel");
        C25676a aVar = this.f133514y;
        Class<?> cls = getClass();
        TextView textView = this.f133497h;
        if (textView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("titleTailView");
        }
        aVar.mo89817a((Class<? extends Object>) cls, (View) textView, (Object) dVar);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: com.larksuite.component.ui.list.a */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    public final void mo184672a(UserStatusModel bVar) {
        Intrinsics.checkParameterIsNotNull(bVar, "model");
        C25676a aVar = this.f133514y;
        Class<?> cls = getClass();
        UserStatusLinearLayout userStatusLinearLayout = this.f133498i;
        if (userStatusLinearLayout == null) {
            Intrinsics.throwUninitializedPropertyAccessException("userStatus");
        }
        aVar.mo89817a((Class<? extends Object>) cls, (View) userStatusLinearLayout, (Object) bVar);
    }

    /* renamed from: a */
    public final void mo184668a(SubtitleModel aVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "subtitleModel");
        if (TextUtils.isEmpty(aVar.mo184719a()) || !aVar.mo184721b()) {
            TextView textView = this.f133499j;
            if (textView == null) {
                Intrinsics.throwUninitializedPropertyAccessException("subTitleView");
            }
            textView.setVisibility(8);
            this.f133512w = UiState.HIDE;
        } else {
            TextView textView2 = this.f133499j;
            if (textView2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("subTitleView");
            }
            textView2.setVisibility(0);
            this.f133512w = UiState.SHOW;
            if (CollectionUtils.isEmpty(aVar.mo184722c())) {
                TextView textView3 = this.f133499j;
                if (textView3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("subTitleView");
                }
                textView3.setText(aVar.mo184719a());
            } else {
                TextView textView4 = this.f133499j;
                if (textView4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("subTitleView");
                }
                CharSequence a = aVar.mo184719a();
                List<String> c = aVar.mo184722c();
                TextView textView5 = this.f133499j;
                if (textView5 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("subTitleView");
                }
                Context context = textView5.getContext();
                Intrinsics.checkExpressionValueIsNotNull(context, "subTitleView.context");
                textView4.setText(C57782ag.m224235a(a, c, context.getResources().getColor(aVar.mo184723d())));
            }
        }
        m209327h();
    }

    /* renamed from: a */
    public final void mo184669a(SummaryModel aVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "summaryModel");
        if (TextUtils.isEmpty(aVar.mo184724a()) || !aVar.mo184727b()) {
            TextView textView = this.f133502m;
            if (textView == null) {
                Intrinsics.throwUninitializedPropertyAccessException("summaryView");
            }
            textView.setVisibility(8);
            this.f133513x = UiState.HIDE;
        } else {
            TextView textView2 = this.f133502m;
            if (textView2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("summaryView");
            }
            textView2.setVisibility(0);
            this.f133513x = UiState.SHOW;
            if (CollectionUtils.isEmpty(aVar.mo184728c())) {
                TextView textView3 = this.f133502m;
                if (textView3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("summaryView");
                }
                textView3.setText(aVar.mo184724a());
            } else {
                TextView textView4 = this.f133502m;
                if (textView4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("summaryView");
                }
                CharSequence a = aVar.mo184724a();
                List<String> c = aVar.mo184728c();
                TextView textView5 = this.f133502m;
                if (textView5 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("summaryView");
                }
                Context context = textView5.getContext();
                Intrinsics.checkExpressionValueIsNotNull(context, "summaryView.context");
                textView4.setText(C57782ag.m224235a(a, c, context.getResources().getColor(aVar.mo184729d())));
            }
        }
        m209327h();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: com.larksuite.component.ui.list.a */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    public final void mo184666a(LocalTimeModel bVar) {
        Intrinsics.checkParameterIsNotNull(bVar, "localTime");
        C25676a aVar = this.f133514y;
        Class<?> cls = getClass();
        TextView textView = this.f133500k;
        if (textView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("localTimeView");
        }
        aVar.mo89817a((Class<? extends Object>) cls, (View) textView, (Object) bVar);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: com.larksuite.component.ui.list.a */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    public final void mo184664a(AssignTimeModel bVar) {
        Intrinsics.checkParameterIsNotNull(bVar, "time");
        C25676a aVar = this.f133514y;
        Class<?> cls = getClass();
        TextView textView = this.f133501l;
        if (textView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("assignTimeView");
        }
        aVar.mo89817a((Class<? extends Object>) cls, (View) textView, (Object) bVar);
    }

    /* renamed from: a */
    public final void mo184663a(LarkNameTag.Builder bVar, int i) {
        Intrinsics.checkParameterIsNotNull(bVar, "builder");
        if (i == 2) {
            LarkNameTag e = bVar.mo90027e();
            TextView textView = this.f133497h;
            if (textView == null) {
                Intrinsics.throwUninitializedPropertyAccessException("titleTailView");
            }
            e.mo90004a(textView);
            return;
        }
        ViewGroup viewGroup = this.f133506q;
        if (viewGroup == null) {
            Intrinsics.throwUninitializedPropertyAccessException("rightItemWrapper");
        }
        viewGroup.setVisibility(0);
        LarkNameTag e2 = bVar.mo90027e();
        ImageView imageView = this.f133507r;
        if (imageView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("rightTagWrapper");
        }
        e2.mo90003a(imageView);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroid/view/View;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.searchcommon.view.avataritem.AvatarItemView$c */
    static final class C53975c extends Lambda implements Function0<View> {
        final /* synthetic */ AvatarItemView this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C53975c(AvatarItemView avatarItemView) {
            super(0);
            this.this$0 = avatarItemView;
        }

        @Override // kotlin.jvm.functions.Function0
        public final View invoke() {
            return this.this$0.mo184685d();
        }
    }

    /* renamed from: g */
    public final float mo184688g() {
        TextView textView = this.f133499j;
        if (textView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("subTitleView");
        }
        return textView.getTextSize();
    }

    /* renamed from: a */
    public final AvatarItemView mo184656a() {
        AvatarItemView avatarItemView = this;
        TextView textView = avatarItemView.f133495f;
        if (textView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("titleView");
        }
        textView.setCompoundDrawables(null, null, null, null);
        ImageView imageView = avatarItemView.f133507r;
        if (imageView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("rightTagWrapper");
        }
        imageView.setBackground(null);
        return avatarItemView;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.larksuite.component.ui.list.a */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: b */
    public final void mo184678b() {
        C25676a aVar = this.f133514y;
        Class<?> cls = getClass();
        ImageView imageView = this.f133496g;
        if (imageView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("personalStatusView");
        }
        aVar.mo89816a((Class<? extends Object>) cls, (View) imageView, (Class<?>) PersonalStatus.class);
    }

    /* renamed from: c */
    public final void mo184683c() {
        FrameLayout frameLayout = this.f133508s;
        if (frameLayout == null) {
            Intrinsics.throwUninitializedPropertyAccessException("rightViewHolder");
        }
        frameLayout.removeAllViews();
        ViewGroup viewGroup = this.f133506q;
        if (viewGroup == null) {
            Intrinsics.throwUninitializedPropertyAccessException("rightItemWrapper");
        }
        viewGroup.setVisibility(8);
    }

    /* renamed from: h */
    private final void m209327h() {
        if (this.f133512w != UiState.NONE && this.f133513x != UiState.NONE) {
            if (this.f133512w == UiState.SHOW && this.f133513x == UiState.SHOW) {
                mo184679b(16);
            } else {
                mo184679b(12);
            }
        }
    }

    /* renamed from: f */
    public final void mo184687f() {
        this.f133514y.mo89815a();
        mo184683c();
        mo184673a(getClass());
        LarkAvatarView larkAvatarView = this.f133494e;
        if (larkAvatarView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("avatarView");
        }
        larkAvatarView.setVisibility(0);
        FrameLayout frameLayout = this.f133505p;
        if (frameLayout == null) {
            Intrinsics.throwUninitializedPropertyAccessException("contentLayout");
        }
        ViewGroup.LayoutParams layoutParams = frameLayout.getLayoutParams();
        if (layoutParams != null) {
            ((RelativeLayout.LayoutParams) layoutParams).setMarginStart(0);
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public void mo184686e() {
        TextView textView = this.f133495f;
        if (textView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("titleView");
        }
        mo184674a(TitleModel.class, textView.getClass(), TitleBinder.f133542a);
        TextView textView2 = this.f133497h;
        if (textView2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("titleTailView");
        }
        mo184674a(TitleTailModel.class, textView2.getClass(), TitleTailBinder.f133547a);
        UDCheckBox uDCheckBox = this.f133493a;
        if (uDCheckBox == null) {
            Intrinsics.throwUninitializedPropertyAccessException("checkBox");
        }
        mo184674a(CheckBoxModel.class, uDCheckBox.getClass(), CheckBoxBinder.f133520b.mo184702a());
        TextView textView3 = this.f133501l;
        if (textView3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("assignTimeView");
        }
        mo184674a(AssignTimeModel.class, textView3.getClass(), AssignTimeBinder.f133516a);
        TextView textView4 = this.f133500k;
        if (textView4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("localTimeView");
        }
        mo184674a(LocalTimeModel.class, textView4.getClass(), LocalTimeBinder.f133527a);
        UserStatusLinearLayout userStatusLinearLayout = this.f133498i;
        if (userStatusLinearLayout == null) {
            Intrinsics.throwUninitializedPropertyAccessException("userStatus");
        }
        mo184674a(UserStatusModel.class, userStatusLinearLayout.getClass(), UserStatusBinder.f133556a);
        ImageView imageView = this.f133496g;
        if (imageView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("personalStatusView");
        }
        mo184674a(PersonalStatus.class, imageView.getClass(), PersonalStatusBinder.f133533a);
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public View mo184685d() {
        RelativeLayout relativeLayout = new RelativeLayout(getContext());
        relativeLayout.setLayoutParams(new RelativeLayout.LayoutParams(-1, -2));
        relativeLayout.setMinimumHeight(mo184677b(72.0f));
        Context context = getContext();
        Intrinsics.checkExpressionValueIsNotNull(context, "context");
        UDCheckBox uDCheckBox = new UDCheckBox(context);
        uDCheckBox.setId(R.id.avatar_item_checkbox);
        uDCheckBox.setVisibility(8);
        uDCheckBox.setPadding(0, 0, 0, 0);
        uDCheckBox.setSize(UDCheckBox.CheckBoxSize.SMALL_SIZE);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(mo184677b(20.0f), mo184677b(20.0f));
        layoutParams.setMarginStart(mo184677b(16.0f));
        layoutParams.addRule(15);
        setGravity(16);
        Unit unit = Unit.INSTANCE;
        uDCheckBox.setLayoutParams(layoutParams);
        relativeLayout.addView(uDCheckBox);
        this.f133493a = uDCheckBox;
        LarkAvatarView larkAvatarView = new LarkAvatarView(getContext());
        larkAvatarView.setId(R.id.avatar_item_avatar);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(mo184677b(48.0f), mo184677b(48.0f));
        layoutParams2.addRule(17, R.id.avatar_item_checkbox);
        layoutParams2.addRule(1, R.id.avatar_item_checkbox);
        layoutParams2.topMargin = mo184677b(12.0f);
        layoutParams2.setMarginStart(mo184677b(16.0f));
        layoutParams2.setMarginEnd(mo184677b(12.0f));
        Unit unit2 = Unit.INSTANCE;
        larkAvatarView.setLayoutParams(layoutParams2);
        larkAvatarView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        relativeLayout.addView(larkAvatarView);
        this.f133494e = larkAvatarView;
        FrameLayout frameLayout = new FrameLayout(getContext());
        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams3.addRule(17, R.id.avatar_item_avatar);
        layoutParams3.addRule(1, R.id.avatar_item_avatar);
        layoutParams3.addRule(15);
        Unit unit3 = Unit.INSTANCE;
        frameLayout.setLayoutParams(layoutParams3);
        relativeLayout.addView(frameLayout);
        this.f133505p = frameLayout;
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setOrientation(0);
        linearLayout.setGravity(16);
        linearLayout.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        frameLayout.addView(linearLayout);
        LinearLayout linearLayout2 = new LinearLayout(getContext());
        linearLayout2.setId(R.id.avatar_item_subtitle_container);
        linearLayout2.setOrientation(1);
        linearLayout2.setGravity(16);
        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(0, -2, 1.0f);
        layoutParams4.setMarginEnd(mo184677b(16.0f));
        layoutParams4.topMargin = mo184677b(12.0f);
        layoutParams4.bottomMargin = mo184677b(12.0f);
        Unit unit4 = Unit.INSTANCE;
        linearLayout2.setLayoutParams(layoutParams4);
        linearLayout.addView(linearLayout2);
        LinearLayout linearLayout3 = new LinearLayout(getContext());
        linearLayout3.setOrientation(0);
        linearLayout3.setGravity(16);
        LinearLayout.LayoutParams layoutParams5 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams5.setMarginEnd(mo184677b(16.0f));
        this.f133506q = linearLayout3;
        linearLayout3.setVisibility(8);
        linearLayout.addView(linearLayout3, layoutParams5);
        ImageView imageView = new ImageView(getContext());
        LinearLayout.LayoutParams layoutParams6 = new LinearLayout.LayoutParams(-2, -2);
        this.f133507r = imageView;
        linearLayout3.addView(imageView, layoutParams6);
        FrameLayout frameLayout2 = new FrameLayout(getContext());
        LinearLayout.LayoutParams layoutParams7 = new LinearLayout.LayoutParams(-2, -2);
        this.f133508s = frameLayout2;
        linearLayout3.addView(frameLayout2, layoutParams7);
        RelativeLayout relativeLayout2 = new RelativeLayout(getContext());
        relativeLayout2.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        linearLayout2.addView(relativeLayout2);
        LinearLayout linearLayout4 = new LinearLayout(getContext());
        RelativeLayout.LayoutParams layoutParams8 = new RelativeLayout.LayoutParams(-1, mo184677b(24.0f));
        layoutParams8.addRule(16, R.id.avatar_item_assign_time);
        layoutParams8.addRule(0, R.id.avatar_item_assign_time);
        layoutParams8.addRule(9);
        Unit unit5 = Unit.INSTANCE;
        linearLayout4.setLayoutParams(layoutParams8);
        relativeLayout2.addView(linearLayout4);
        TextView textView = new TextView(getContext());
        textView.setId(R.id.avatar_item_assign_time);
        textView.setTextSize(1, 12.0f);
        Context context2 = getContext();
        Intrinsics.checkExpressionValueIsNotNull(context2, "context");
        textView.setTextColor(context2.getResources().getColor(R.color.lkui_N500));
        textView.setGravity(16);
        textView.setVisibility(8);
        RelativeLayout.LayoutParams layoutParams9 = new RelativeLayout.LayoutParams(-2, mo184677b(24.0f));
        layoutParams9.setMarginStart(mo184677b(8.0f));
        layoutParams9.addRule(11);
        relativeLayout2.addView(textView, layoutParams9);
        this.f133501l = textView;
        SpareLayout spareLayout = new SpareLayout(getContext());
        spareLayout.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        linearLayout4.addView(spareLayout);
        UserStatusLinearLayout userStatusLinearLayout = new UserStatusLinearLayout(getContext());
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-1, mo184677b(24.0f));
        marginLayoutParams.setMarginStart(mo184677b(4.0f));
        userStatusLinearLayout.setLayoutParams(marginLayoutParams);
        userStatusLinearLayout.setMaxLines(1);
        userStatusLinearLayout.setVisibility(8);
        linearLayout4.addView(userStatusLinearLayout);
        this.f133498i = userStatusLinearLayout;
        EllipsizedEmojiconTextView ellipsizedEmojiconTextView = new EllipsizedEmojiconTextView(getContext());
        ellipsizedEmojiconTextView.setId(R.id.avatar_item_title);
        ellipsizedEmojiconTextView.setLayoutParams(new LinearLayout.LayoutParams(-2, mo184677b(24.0f)));
        ellipsizedEmojiconTextView.setEllipsize(TextUtils.TruncateAt.END);
        ellipsizedEmojiconTextView.setIncludeFontPadding(false);
        ellipsizedEmojiconTextView.setGravity(16);
        ellipsizedEmojiconTextView.setMaxLines(1);
        ellipsizedEmojiconTextView.setSingleLine(true);
        ellipsizedEmojiconTextView.setTextSize(1, 17.0f);
        Context context3 = getContext();
        Intrinsics.checkExpressionValueIsNotNull(context3, "context");
        ellipsizedEmojiconTextView.setTextColor(context3.getResources().getColor(R.color.text_title));
        spareLayout.addView(ellipsizedEmojiconTextView);
        EllipsizedEmojiconTextView ellipsizedEmojiconTextView2 = ellipsizedEmojiconTextView;
        this.f133495f = ellipsizedEmojiconTextView2;
        ImageView imageView2 = new ImageView(getContext());
        FrameLayout.LayoutParams layoutParams10 = new FrameLayout.LayoutParams(mo184677b(20.0f), mo184677b(20.0f));
        layoutParams10.leftMargin = mo184677b(8.0f);
        layoutParams10.gravity = 16;
        imageView2.setLayoutParams(layoutParams10);
        imageView2.setVisibility(8);
        spareLayout.addView(imageView2);
        this.f133496g = imageView2;
        EllipsizedEmojiconTextView ellipsizedEmojiconTextView3 = new EllipsizedEmojiconTextView(getContext());
        ellipsizedEmojiconTextView3.setId(R.id.avatar_item_title_tail);
        ellipsizedEmojiconTextView3.setLayoutParams(new LinearLayout.LayoutParams(-2, mo184677b(24.0f)));
        ellipsizedEmojiconTextView3.setGravity(16);
        ellipsizedEmojiconTextView3.setMaxLines(1);
        ellipsizedEmojiconTextView3.setSingleLine(true);
        ellipsizedEmojiconTextView3.setTextSize(1, 17.0f);
        Context context4 = getContext();
        Intrinsics.checkExpressionValueIsNotNull(context4, "context");
        ellipsizedEmojiconTextView3.setTextColor(context4.getResources().getColor(R.color.text_placeholder));
        spareLayout.addView(ellipsizedEmojiconTextView3);
        this.f133497h = ellipsizedEmojiconTextView3;
        TextView textView2 = new TextView(getContext());
        textView2.setId(R.id.avatar_item_localtime);
        textView2.setTextSize(1, 12.0f);
        Context context5 = getContext();
        Intrinsics.checkExpressionValueIsNotNull(context5, "context");
        textView2.setTextColor(context5.getResources().getColor(R.color.lkui_N500));
        Context context6 = getContext();
        Intrinsics.checkExpressionValueIsNotNull(context6, "context");
        textView2.setCompoundDrawablesWithIntrinsicBounds(context6.getResources().getDrawable(R.drawable.icon_local_time), (Drawable) null, (Drawable) null, (Drawable) null);
        textView2.setCompoundDrawablePadding(mo184677b(4.0f));
        textView2.setIncludeFontPadding(false);
        textView2.setGravity(16);
        textView2.setVisibility(8);
        LinearLayout.LayoutParams layoutParams11 = new LinearLayout.LayoutParams(-2, -1);
        layoutParams11.setMarginStart(mo184677b(8.0f));
        spareLayout.addView(textView2, layoutParams11);
        this.f133500k = textView2;
        EllipsizedEmojiconTextView ellipsizedEmojiconTextView4 = new EllipsizedEmojiconTextView(getContext());
        ellipsizedEmojiconTextView4.setId(R.id.avatar_item_subtitle);
        ellipsizedEmojiconTextView4.setLayoutParams(new LinearLayout.LayoutParams(-1, mo184677b(20.0f)));
        ViewGroup.LayoutParams layoutParams12 = ellipsizedEmojiconTextView4.getLayoutParams();
        if (layoutParams12 != null) {
            ((LinearLayout.LayoutParams) layoutParams12).topMargin = mo184677b(4.0f);
            ellipsizedEmojiconTextView4.setIncludeFontPadding(false);
            ellipsizedEmojiconTextView4.setGravity(16);
            ellipsizedEmojiconTextView4.setEllipsize(TextUtils.TruncateAt.END);
            ellipsizedEmojiconTextView4.setMaxLines(1);
            ellipsizedEmojiconTextView4.setSingleLine(true);
            ellipsizedEmojiconTextView4.setTextSize(1, 12.0f);
            Context context7 = getContext();
            Intrinsics.checkExpressionValueIsNotNull(context7, "context");
            ellipsizedEmojiconTextView4.setTextColor(context7.getResources().getColor(R.color.text_placeholder));
            ellipsizedEmojiconTextView4.setVisibility(8);
            linearLayout2.addView(ellipsizedEmojiconTextView4);
            EllipsizedEmojiconTextView ellipsizedEmojiconTextView5 = ellipsizedEmojiconTextView4;
            this.f133499j = ellipsizedEmojiconTextView5;
            EllipsizedEmojiconTextView ellipsizedEmojiconTextView6 = new EllipsizedEmojiconTextView(getContext());
            ellipsizedEmojiconTextView6.setId(R.id.avatar_item_summary);
            ellipsizedEmojiconTextView6.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
            ViewGroup.LayoutParams layoutParams13 = ellipsizedEmojiconTextView6.getLayoutParams();
            if (layoutParams13 != null) {
                ((LinearLayout.LayoutParams) layoutParams13).topMargin = mo184677b(4.0f);
                ellipsizedEmojiconTextView6.setIncludeFontPadding(false);
                ellipsizedEmojiconTextView6.setGravity(16);
                ellipsizedEmojiconTextView6.setEllipsize(TextUtils.TruncateAt.END);
                ellipsizedEmojiconTextView6.setMaxLines(1);
                ellipsizedEmojiconTextView6.setSingleLine(true);
                ellipsizedEmojiconTextView6.setTextSize(1, 12.0f);
                Context context8 = getContext();
                Intrinsics.checkExpressionValueIsNotNull(context8, "context");
                ellipsizedEmojiconTextView6.setTextColor(context8.getResources().getColor(R.color.text_placeholder));
                ellipsizedEmojiconTextView6.setVisibility(8);
                linearLayout2.addView(ellipsizedEmojiconTextView6);
                this.f133502m = ellipsizedEmojiconTextView6;
                View view = new View(getContext());
                view.setId(R.id.avatar_item_divider);
                RelativeLayout.LayoutParams layoutParams14 = new RelativeLayout.LayoutParams(-1, mo184677b(0.5f));
                layoutParams14.addRule(12);
                layoutParams14.addRule(17, R.id.avatar_item_avatar);
                layoutParams14.addRule(1, R.id.avatar_item_avatar);
                Unit unit6 = Unit.INSTANCE;
                view.setLayoutParams(layoutParams14);
                Context context9 = getContext();
                Intrinsics.checkExpressionValueIsNotNull(context9, "context");
                view.setBackgroundColor(context9.getResources().getColor(R.color.line_divider_default));
                relativeLayout.addView(view);
                this.f133503n = view;
                mo184686e();
                if (f133490b == -1) {
                    int a = m209325a((TextView) ellipsizedEmojiconTextView2);
                    f133490b = a;
                    Log.m165379d("LarkSearch.Common.AvatarItemView", String.valueOf(a));
                }
                if (f133491c == -1) {
                    int a2 = m209325a((TextView) ellipsizedEmojiconTextView5);
                    f133491c = a2;
                    Log.m165379d("LarkSearch.Common.AvatarItemView", String.valueOf(a2));
                }
                return relativeLayout;
            }
            throw new TypeCastException("null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
        }
        throw new TypeCastException("null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
    }

    /* renamed from: b */
    public final int mo184677b(float f) {
        return (int) mo184681c(f);
    }

    /* renamed from: c */
    public final int mo184682c(int i) {
        return C57582a.m223600a(i);
    }

    /* renamed from: a */
    public final void mo184660a(MiniIconModel eVar) {
        LarkAvatarView larkAvatarView = this.f133494e;
        if (larkAvatarView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("avatarView");
        }
        larkAvatarView.mo89074a(eVar);
    }

    /* renamed from: c */
    public final float mo184681c(float f) {
        return C25653b.m91892a(getContext(), f);
    }

    public void setOnClickListener(View.OnClickListener onClickListener) {
        super.setOnClickListener(onClickListener);
        UDCheckBox uDCheckBox = this.f133493a;
        if (uDCheckBox == null) {
            Intrinsics.throwUninitializedPropertyAccessException("checkBox");
        }
        uDCheckBox.setOnClickListener(onClickListener);
    }

    public final void setTag(LarkNameTag.Builder bVar) {
        Intrinsics.checkParameterIsNotNull(bVar, "builder");
        mo184663a(bVar, 2);
    }

    /* renamed from: d */
    private final void m209326d(int i) {
        LarkAvatarView larkAvatarView = this.f133494e;
        if (larkAvatarView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("avatarView");
        }
        ViewGroup.LayoutParams layoutParams = larkAvatarView.getLayoutParams();
        if (layoutParams instanceof RelativeLayout.LayoutParams) {
            ((RelativeLayout.LayoutParams) layoutParams).setMarginStart(mo184682c(i));
        }
    }

    /* renamed from: a */
    public final void mo184658a(float f) {
        LarkAvatarView larkAvatarView = this.f133494e;
        if (larkAvatarView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("avatarView");
        }
        larkAvatarView.getLayoutParams().width = mo184677b(f);
        LarkAvatarView larkAvatarView2 = this.f133494e;
        if (larkAvatarView2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("avatarView");
        }
        larkAvatarView2.getLayoutParams().height = mo184677b(f);
    }

    /* renamed from: b */
    public final void mo184679b(int i) {
        LarkAvatarView larkAvatarView = this.f133494e;
        if (larkAvatarView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("avatarView");
        }
        ViewGroup.LayoutParams layoutParams = larkAvatarView.getLayoutParams();
        if (layoutParams instanceof RelativeLayout.LayoutParams) {
            ((RelativeLayout.LayoutParams) layoutParams).topMargin = mo184682c(i);
        }
    }

    /* renamed from: c */
    public final void mo184684c(boolean z) {
        LarkAvatarView larkAvatarView = this.f133494e;
        if (larkAvatarView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("avatarView");
        }
        larkAvatarView.setOval(z);
    }

    /* renamed from: a */
    private final int m209325a(TextView textView) {
        TextPaint paint = textView.getPaint();
        Context context = textView.getContext();
        Intrinsics.checkExpressionValueIsNotNull(context, "context");
        return (int) (((double) (((float) ((((DeviceUtils.getScreenWidth(textView.getContext()) - mo184677b(16.0f)) - mo184677b(48.0f)) - mo184677b(12.0f)) - mo184677b(16.0f))) / paint.measureText(context.getResources().getText(R.string.measure_unit).toString()))) * 0.9d * ((double) 2));
    }

    /* renamed from: b */
    public final void mo184680b(boolean z) {
        if (z) {
            View view = this.f133503n;
            if (view == null) {
                Intrinsics.throwUninitializedPropertyAccessException("divider");
            }
            view.setVisibility(0);
            return;
        }
        View view2 = this.f133503n;
        if (view2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("divider");
        }
        view2.setVisibility(8);
    }

    /* renamed from: a */
    public final void mo184659a(View view) {
        Intrinsics.checkParameterIsNotNull(view, "v");
        FrameLayout frameLayout = this.f133508s;
        if (frameLayout == null) {
            Intrinsics.throwUninitializedPropertyAccessException("rightViewHolder");
        }
        frameLayout.addView(view);
        ViewGroup viewGroup = this.f133506q;
        if (viewGroup == null) {
            Intrinsics.throwUninitializedPropertyAccessException("rightItemWrapper");
        }
        viewGroup.setVisibility(0);
    }

    /* renamed from: a */
    public final AvatarItemView mo184657a(int i) {
        AvatarItemView avatarItemView = this;
        TypedArray obtainStyledAttributes = avatarItemView.getContext().obtainStyledAttributes(i, new int[]{R.attr.avatar_size, R.attr.check_box_size, R.attr.space_left, R.attr.space_mid, R.attr.space_right, R.attr.subtitle_height, R.attr.subtitle_text_size, R.attr.summary_height, R.attr.summary_text_size, R.attr.title_height, R.attr.title_text_size});
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(1, avatarItemView.mo184677b(20.0f));
        int dimensionPixelSize2 = obtainStyledAttributes.getDimensionPixelSize(0, avatarItemView.mo184677b(48.0f));
        int dimensionPixelSize3 = obtainStyledAttributes.getDimensionPixelSize(9, avatarItemView.mo184677b(24.0f));
        int dimensionPixelSize4 = obtainStyledAttributes.getDimensionPixelSize(5, avatarItemView.mo184677b(20.0f));
        int dimensionPixelSize5 = obtainStyledAttributes.getDimensionPixelSize(7, -2);
        float dimension = obtainStyledAttributes.getDimension(10, avatarItemView.mo184681c(17.0f));
        float dimension2 = obtainStyledAttributes.getDimension(6, avatarItemView.mo184681c(12.0f));
        float dimension3 = obtainStyledAttributes.getDimension(8, avatarItemView.mo184681c(12.0f));
        int dimension4 = (int) obtainStyledAttributes.getDimension(2, avatarItemView.mo184681c(16.0f));
        int dimension5 = (int) obtainStyledAttributes.getDimension(3, avatarItemView.mo184681c(16.0f));
        int dimension6 = (int) obtainStyledAttributes.getDimension(4, avatarItemView.mo184681c(12.0f));
        obtainStyledAttributes.recycle();
        UDCheckBox uDCheckBox = avatarItemView.f133493a;
        if (uDCheckBox == null) {
            Intrinsics.throwUninitializedPropertyAccessException("checkBox");
        }
        ViewGroup.LayoutParams layoutParams = uDCheckBox.getLayoutParams();
        if (layoutParams != null) {
            layoutParams.height = dimensionPixelSize;
            layoutParams.width = dimensionPixelSize;
            ((RelativeLayout.LayoutParams) layoutParams).setMarginStart(dimension4);
            LarkAvatarView larkAvatarView = avatarItemView.f133494e;
            if (larkAvatarView == null) {
                Intrinsics.throwUninitializedPropertyAccessException("avatarView");
            }
            ViewGroup.LayoutParams layoutParams2 = larkAvatarView.getLayoutParams();
            if (layoutParams2 != null) {
                RelativeLayout.LayoutParams layoutParams3 = (RelativeLayout.LayoutParams) layoutParams2;
                layoutParams2.width = dimensionPixelSize2;
                layoutParams2.height = dimensionPixelSize2;
                layoutParams3.setMarginStart(dimension5);
                layoutParams3.setMarginEnd(dimension6);
                TextView textView = avatarItemView.f133495f;
                if (textView == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("titleView");
                }
                textView.getLayoutParams().height = dimensionPixelSize3;
                textView.setTextSize(0, dimension);
                TextView textView2 = avatarItemView.f133497h;
                if (textView2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("titleTailView");
                }
                textView2.getLayoutParams().height = dimensionPixelSize3;
                textView2.setTextSize(0, dimension);
                TextView textView3 = avatarItemView.f133499j;
                if (textView3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("subTitleView");
                }
                textView3.getLayoutParams().height = dimensionPixelSize4;
                textView3.setTextSize(0, dimension2);
                TextView textView4 = avatarItemView.f133502m;
                if (textView4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("summaryView");
                }
                textView4.getLayoutParams().height = dimensionPixelSize5;
                textView4.setTextSize(0, dimension3);
                return avatarItemView;
            }
            throw new TypeCastException("null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
        }
        throw new TypeCastException("null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
    }

    /* renamed from: a */
    public final void mo184661a(BadgeModel cVar) {
        Intrinsics.checkParameterIsNotNull(cVar, "badgeModel");
        LarkAvatarView larkAvatarView = this.f133494e;
        if (larkAvatarView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("avatarView");
        }
        larkAvatarView.mo89075a(cVar);
    }

    /* renamed from: a */
    public final void mo184662a(AvatarModel avatarModel) {
        Intrinsics.checkParameterIsNotNull(avatarModel, "avatarModel");
        LarkAvatarView larkAvatarView = this.f133494e;
        if (larkAvatarView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("avatarView");
        }
        larkAvatarView.mo89076a(avatarModel);
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        this.f133511v = i2;
        this.f133510u = i;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AvatarItemView(Context context, AttributeSet attributeSet, int i, C25676a aVar) {
        super(context, attributeSet, i);
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(aVar, "compositeComponentDelegate");
        this.f133514y = aVar;
        this.f133509t = LazyKt.lazy(new C53975c(this));
        this.f133510u = Integer.MIN_VALUE;
        this.f133511v = Integer.MIN_VALUE;
        setBackground(context.getDrawable(R.drawable.avatar_item_selector_bg));
        setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        addView(getContentView());
        if (attributeSet != null) {
            mo184657a(attributeSet.getStyleAttribute());
        }
        this.f133512w = UiState.NONE;
        this.f133513x = UiState.NONE;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ AvatarItemView(Context context, AttributeSet attributeSet, int i, C25676a aVar, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i, (i2 & 8) != 0 ? new C25676a() : aVar);
    }
}
