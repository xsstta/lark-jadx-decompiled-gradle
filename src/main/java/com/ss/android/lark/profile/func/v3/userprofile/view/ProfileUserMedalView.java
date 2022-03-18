package com.ss.android.lark.profile.func.v3.userprofile.view;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.lark.pb.basic.v1.ImageSetPassThrough;
import com.bytedance.lark.pb.contact.v2.GetUserProfileResponse;
import com.google.firebase.messaging.Constants;
import com.larksuite.component.universe_design.icon.UDIconUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.image.ImageLoader;
import com.ss.android.lark.image.entity.PassThroughImage;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.profile.C52239a;
import com.ss.android.lark.profile.dependency.IProfileModuleDependency;
import com.ss.android.lark.ui.p2892a.C57582a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 /2\u00020\u0001:\u0002/0B%\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0002J\b\u0010\u0011\u001a\u00020\u000eH\u0002J\u0010\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u0007H\u0002J\u0018\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u0007H\u0002J\u0010\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0002J\u0018\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00100\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0002J0\u0010\u001b\u001a\u00020\u000e2\b\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\u001d2\u0006\u0010 \u001a\u00020\u001dJ\u0010\u0010!\u001a\u00020\u000e2\u0006\u0010\u001e\u001a\u00020\u001dH\u0002J\u001e\u0010\"\u001a\u00020\u000e2\f\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00100\u00182\u0006\u0010\u0015\u001a\u00020\u0007H\u0002J6\u0010$\u001a\u00020\u000e*\u00020%2\u0006\u0010&\u001a\u00020\u00072\u0006\u0010'\u001a\u00020\u00072\u0017\u0010(\u001a\u0013\u0012\u0004\u0012\u00020*\u0012\u0004\u0012\u00020\u000e0)¢\u0006\u0002\b+H\bJ\f\u0010,\u001a\u00020-*\u00020.H\u0002R\u000e\u0010\t\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0004¢\u0006\u0002\n\u0000¨\u00061"}, d2 = {"Lcom/ss/android/lark/profile/func/v3/userprofile/view/ProfileUserMedalView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "mIconSize", "mItemMargin", "mMedalContainer", "Landroid/widget/LinearLayout;", "addIconView", "", "item", "Lcom/ss/android/lark/profile/func/v3/userprofile/view/ProfileUserMedalView$Item;", "addMoreIconView", "addMoreTextView", "moreCount", "addMoreView", "totalCount", "addTextView", "getMedalList", "", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Lcom/bytedance/lark/pb/contact/v2/GetUserProfileResponse$MedalList;", "setMedalData", "isMedalEnabled", "", "isSelf", "isResigned", "isSameTenant", "showEmptyEntrance", "showMedalList", "list", "addToContainer", "Landroid/view/View;", "width", "height", "block", "Lkotlin/Function1;", "Landroid/widget/LinearLayout$LayoutParams;", "Lkotlin/ExtensionFunctionType;", "getValue", "", "Lcom/bytedance/lark/pb/contact/v2/GetUserProfileResponse$I18nVal;", "Companion", "Item", "core_profile_profile_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class ProfileUserMedalView extends ConstraintLayout {

    /* renamed from: b */
    public static final Companion f130657b = new Companion(null);

    /* renamed from: a */
    public final LinearLayout f130658a;

    /* renamed from: c */
    private final int f130659c;

    /* renamed from: d */
    private final int f130660d;

    public ProfileUserMedalView(Context context) {
        this(context, null, 0, 6, null);
    }

    public ProfileUserMedalView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lcom/ss/android/lark/profile/func/v3/userprofile/view/ProfileUserMedalView$Companion;", "", "()V", "MAX_MORE_COUNT", "", "TAG", "", "core_profile_profile_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.profile.func.v3.userprofile.view.ProfileUserMedalView$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* access modifiers changed from: private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/ss/android/lark/profile/func/v3/userprofile/view/ProfileUserMedalView$Item;", "", "passThroughImage", "Lcom/ss/android/lark/image/entity/PassThroughImage;", "name", "", "(Lcom/ss/android/lark/image/entity/PassThroughImage;Ljava/lang/String;)V", "getName", "()Ljava/lang/String;", "getPassThroughImage", "()Lcom/ss/android/lark/image/entity/PassThroughImage;", "core_profile_profile_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.profile.func.v3.userprofile.view.ProfileUserMedalView$b */
    public static final class Item {

        /* renamed from: a */
        private final PassThroughImage f130661a;

        /* renamed from: b */
        private final String f130662b;

        /* renamed from: a */
        public final PassThroughImage mo180462a() {
            return this.f130661a;
        }

        /* renamed from: b */
        public final String mo180463b() {
            return this.f130662b;
        }

        public Item(PassThroughImage passThroughImage, String str) {
            Intrinsics.checkParameterIsNotNull(passThroughImage, "passThroughImage");
            Intrinsics.checkParameterIsNotNull(str, "name");
            this.f130661a = passThroughImage;
            this.f130662b = str;
        }
    }

    /* renamed from: a */
    private final void m204547a(boolean z) {
        if (!z) {
            setVisibility(8);
            return;
        }
        setVisibility(0);
        this.f130658a.removeAllViews();
        AppCompatTextView appCompatTextView = new AppCompatTextView(getContext());
        appCompatTextView.setText(R.string.Lark_Profile_MyBadges);
        appCompatTextView.setTextColor(C57582a.m223616d(appCompatTextView.getContext(), R.color.static_white));
        appCompatTextView.setTextSize(14.0f);
        AppCompatTextView appCompatTextView2 = appCompatTextView;
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 16;
        int a = C57582a.m223601a(appCompatTextView.getContext(), 3.0f);
        layoutParams.setMargins(a, 0, a, 0);
        this.f130658a.addView(appCompatTextView2, layoutParams);
    }

    /* renamed from: a */
    public final void mo180461a(GetUserProfileResponse.MedalList medalList, boolean z, boolean z2, boolean z3, boolean z4) {
        Integer num;
        if (z3 || !z4 || !z) {
            setVisibility(8);
            return;
        }
        List<Item> a = m204541a(medalList);
        List<Item> list = a;
        int i = 0;
        if (list == null || list.isEmpty()) {
            m204547a(z2);
            return;
        }
        if (!(medalList == null || (num = medalList.total_num) == null)) {
            i = num.intValue();
        }
        m204546a(a, i);
    }

    /* renamed from: a */
    private final void m204542a() {
        FrameLayout frameLayout = new FrameLayout(getContext());
        int a = C57582a.m223600a(10);
        AppCompatImageView appCompatImageView = new AppCompatImageView(frameLayout.getContext());
        int d = C57582a.m223616d(appCompatImageView.getContext(), R.color.icon_n2);
        Context context = appCompatImageView.getContext();
        Intrinsics.checkExpressionValueIsNotNull(context, "context");
        appCompatImageView.setImageDrawable(UDIconUtils.getIconDrawable(context, (int) R.drawable.ud_icon_more_bold_outlined, d));
        appCompatImageView.setScaleType(ImageView.ScaleType.FIT_XY);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(a, a);
        layoutParams.gravity = 17;
        frameLayout.addView(appCompatImageView, layoutParams);
        frameLayout.setBackgroundResource(R.drawable.profile_user_medal_entrance_more_bg);
        int i = this.f130659c;
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(i, i);
        layoutParams2.gravity = 16;
        int i2 = this.f130660d;
        layoutParams2.setMargins(i2, i2, i2, i2);
        this.f130658a.addView(frameLayout, layoutParams2);
    }

    /* renamed from: a */
    private final void m204545a(Item bVar) {
        AppCompatImageView appCompatImageView = new AppCompatImageView(getContext());
        ImageLoader.with(appCompatImageView.getContext()).load(bVar.mo180462a()).placeholder(R.drawable.profile_user_medal_entrance_more_bg).into(appCompatImageView);
        int i = this.f130659c;
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(i, i);
        layoutParams.gravity = 16;
        int i2 = this.f130660d;
        layoutParams.setMargins(i2, i2, i2, i2);
        this.f130658a.addView(appCompatImageView, layoutParams);
    }

    /* renamed from: a */
    private final String m204540a(GetUserProfileResponse.I18nVal i18nVal) {
        StringBuilder sb = new StringBuilder();
        IProfileModuleDependency d = C52239a.m202617d();
        Intrinsics.checkExpressionValueIsNotNull(d, "ProfileModule.getDependency()");
        Locale h = d.mo133577h();
        Intrinsics.checkExpressionValueIsNotNull(h, "ProfileModule.getDependency().languageSetting");
        sb.append(h.getLanguage());
        sb.append('_');
        IProfileModuleDependency d2 = C52239a.m202617d();
        Intrinsics.checkExpressionValueIsNotNull(d2, "ProfileModule.getDependency()");
        Locale h2 = d2.mo133577h();
        Intrinsics.checkExpressionValueIsNotNull(h2, "ProfileModule.getDependency().languageSetting");
        sb.append(h2.getCountry());
        String sb2 = sb.toString();
        Map<String, String> map = i18nVal.i18n_vals;
        if (sb2 != null) {
            String lowerCase = sb2.toLowerCase();
            Intrinsics.checkExpressionValueIsNotNull(lowerCase, "(this as java.lang.String).toLowerCase()");
            String str = map.get(lowerCase);
            if (TextUtils.isEmpty(str)) {
                str = i18nVal.default_val;
            }
            if (str != null) {
                return str;
            }
            return "";
        }
        throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
    }

    /* renamed from: b */
    private final void m204548b(Item bVar) {
        AppCompatTextView appCompatTextView = new AppCompatTextView(getContext());
        appCompatTextView.setTextSize(14.0f);
        appCompatTextView.setSingleLine(true);
        appCompatTextView.setEllipsize(TextUtils.TruncateAt.END);
        appCompatTextView.setTextColor(C57582a.m223616d(appCompatTextView.getContext(), R.color.static_white));
        appCompatTextView.setText(bVar.mo180463b());
        appCompatTextView.setMaxWidth(C57582a.m223601a(appCompatTextView.getContext(), 82.0f));
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 16;
        int i = this.f130660d;
        layoutParams.setMargins(i, 0, i, 0);
        this.f130658a.addView(appCompatTextView, layoutParams);
    }

    /* renamed from: a */
    private final List<Item> m204541a(GetUserProfileResponse.MedalList medalList) {
        List<GetUserProfileResponse.Medal> list;
        boolean z;
        String str;
        if (medalList != null) {
            list = medalList.medal_meta;
        } else {
            list = null;
        }
        List<GetUserProfileResponse.Medal> list2 = list;
        if (list2 == null || list2.isEmpty()) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return CollectionsKt.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        for (GetUserProfileResponse.Medal medal : list) {
            ImageSetPassThrough imageSetPassThrough = medal.image;
            if (imageSetPassThrough != null) {
                PassThroughImage passThroughImage = new PassThroughImage(imageSetPassThrough.key, imageSetPassThrough.fs_unit);
                GetUserProfileResponse.I18nVal i18nVal = medal.i18n_name;
                if (i18nVal == null || (str = m204540a(i18nVal)) == null) {
                    str = "";
                }
                arrayList.add(new Item(passThroughImage, str));
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    private final void m204543a(int i) {
        StringBuilder sb = new StringBuilder();
        sb.append('+');
        sb.append(i);
        String sb2 = sb.toString();
        AppCompatTextView appCompatTextView = new AppCompatTextView(getContext());
        appCompatTextView.setTextSize(10.0f);
        appCompatTextView.setGravity(17);
        appCompatTextView.setText(sb2);
        appCompatTextView.setTextColor(C57582a.m223616d(appCompatTextView.getContext(), R.color.text_caption));
        appCompatTextView.setBackgroundResource(R.drawable.profile_user_medal_entrance_more_bg);
        int i2 = this.f130659c;
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(i2, i2);
        layoutParams.gravity = 16;
        int i3 = this.f130660d;
        layoutParams.setMargins(i3, i3, i3, i3);
        this.f130658a.addView(appCompatTextView, layoutParams);
    }

    /* renamed from: a */
    private final void m204544a(int i, int i2) {
        if (i > 12) {
            m204542a();
        } else {
            m204543a(i2);
        }
    }

    /* renamed from: a */
    private final void m204546a(List<Item> list, int i) {
        int i2 = 0;
        setVisibility(0);
        if (i < list.size()) {
            Log.m165397w("ProfileUserMedalView", "invalid total num:" + i + ",list size:" + list.size());
        } else {
            i2 = i - list.size();
        }
        this.f130658a.removeAllViews();
        if (list.size() == 1) {
            Item bVar = (Item) CollectionsKt.first((List) list);
            m204545a(bVar);
            m204548b(bVar);
            return;
        }
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            m204545a((Item) it.next());
        }
        if (i2 > 0) {
            m204544a(i, i2);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ProfileUserMedalView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkParameterIsNotNull(context, "context");
        this.f130659c = C57582a.m223601a(context, 16.0f);
        this.f130660d = C57582a.m223601a(context, 2.0f);
        ConstraintLayout.inflate(context, R.layout.profile_user_medal_entrance_layout, this);
        View findViewById = findViewById(R.id.container);
        Intrinsics.checkExpressionValueIsNotNull(findViewById, "findViewById(R.id.container)");
        this.f130658a = (LinearLayout) findViewById;
        ((ImageView) findViewById(R.id.arrow)).setImageDrawable(UDIconUtils.getIconDrawable(context, (int) R.drawable.ud_icon_right_outlined, -1));
        setBackgroundResource(R.drawable.profile_user_medal_entrance_bg);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ProfileUserMedalView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
