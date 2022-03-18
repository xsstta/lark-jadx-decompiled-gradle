package com.ss.android.vc.meeting.module.multi;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.larksuite.suite.R;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.vc.common.p3083e.C60735ab;
import com.ss.android.vc.common.p3083e.C60773o;
import com.ss.android.vc.common.p3083e.C60783v;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b+\u0018\u00002\u00020\u0001:\u0001TB%\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\b\u0010)\u001a\u00020*H\u0002J\b\u0010+\u001a\u00020*H\u0002J\b\u0010,\u001a\u00020*H\u0002J\b\u0010-\u001a\u00020*H\u0002J0\u0010.\u001a\u00020*2\u0006\u0010/\u001a\u00020\f2\u0006\u00100\u001a\u00020\u00072\u0006\u00101\u001a\u00020\u00072\u0006\u00102\u001a\u00020\u00072\u0006\u00103\u001a\u00020\u0007H\u0014J\u0018\u00104\u001a\u00020*2\u0006\u00105\u001a\u00020\u00072\u0006\u00106\u001a\u00020\u0007H\u0014J#\u00107\u001a\u00020*2\n\b\u0002\u00108\u001a\u0004\u0018\u00010\f2\n\b\u0002\u00109\u001a\u0004\u0018\u00010\f¢\u0006\u0002\u0010:JS\u0010;\u001a\u00020*2\n\b\u0002\u00108\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010<\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010=\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010>\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010?\u001a\u0004\u0018\u00010\n2\n\b\u0002\u00109\u001a\u0004\u0018\u00010\f¢\u0006\u0002\u0010@J_\u0010;\u001a\u00020*2\n\b\u0002\u00108\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010<\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010=\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010>\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010?\u001a\u0004\u0018\u00010\n2\n\b\u0002\u00109\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010A\u001a\u0004\u0018\u00010\f¢\u0006\u0002\u0010BJ#\u0010C\u001a\u00020*2\n\b\u0002\u0010<\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010A\u001a\u0004\u0018\u00010\f¢\u0006\u0002\u0010:J\u0012\u0010D\u001a\u00020*2\n\b\u0002\u0010?\u001a\u0004\u0018\u00010\nJ\u0017\u0010E\u001a\u00020*2\n\b\u0002\u0010=\u001a\u0004\u0018\u00010\f¢\u0006\u0002\u0010FJ\u0010\u0010G\u001a\u00020*2\b\b\u0001\u0010H\u001a\u00020\u0007J\u000e\u0010I\u001a\u00020*2\u0006\u0010J\u001a\u00020\u0007J\u000e\u0010K\u001a\u00020*2\u0006\u0010L\u001a\u00020\u001bJ\u000e\u0010M\u001a\u00020*2\u0006\u0010N\u001a\u00020\u0007J\u000e\u0010O\u001a\u00020*2\u0006\u0010P\u001a\u00020!J\u000e\u0010Q\u001a\u00020*2\u0006\u0010R\u001a\u00020\fJ\b\u0010S\u001a\u00020*H\u0002R\u000e\u0010\t\u001a\u00020\nXD¢\u0006\u0002\n\u0000R\u0012\u0010\u000b\u001a\u0004\u0018\u00010\fX\u000e¢\u0006\u0004\n\u0002\u0010\rR\u0012\u0010\u000e\u001a\u0004\u0018\u00010\fX\u000e¢\u0006\u0004\n\u0002\u0010\rR\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u0011\u001a\u00020\u00078\u0002@\u0002X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0007X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\fX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0015X\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u0016\u001a\u0004\u0018\u00010\fX\u000e¢\u0006\u0004\n\u0002\u0010\rR\u0012\u0010\u0017\u001a\u0004\u0018\u00010\fX\u000e¢\u0006\u0004\n\u0002\u0010\rR\u0010\u0010\u0018\u001a\u0004\u0018\u00010\nX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u0010X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001a\u001a\u0004\u0018\u00010\u001bX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u0007X\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u001d\u001a\u0004\u0018\u00010\fX\u000e¢\u0006\u0004\n\u0002\u0010\rR\u0010\u0010\u001e\u001a\u0004\u0018\u00010\u0015X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020\u0007X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020!X\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\"\u001a\u00020!X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R\u0012\u0010'\u001a\u0004\u0018\u00010\fX\u000e¢\u0006\u0004\n\u0002\u0010\rR\u0010\u0010(\u001a\u0004\u0018\u00010\u0015X\u000e¢\u0006\u0002\n\u0000¨\u0006U"}, d2 = {"Lcom/ss/android/vc/meeting/module/multi/UserInfoStatusLayout;", "Landroid/widget/LinearLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyle", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "TAG", "", "mCoHost", "", "Ljava/lang/Boolean;", "mHost", "mHostTextView", "Landroid/widget/TextView;", "mHostTextViewBgRes", "mIconMargin", "mLimitHostTextWidth", "mMicIcon", "Landroid/widget/ImageView;", "mMicUnavailable", "mMicrophoneMuted", "mName", "mNameTextView", "mOnLayoutChangeObserver", "Lcom/ss/android/vc/meeting/module/multi/UserInfoStatusLayout$OnLayoutChangeObserver;", "mParentWidth", "mShareScreen", "mShareScreenIcon", "mTextPadding", "mTextSize", "", "mUdIconSize", "getMUdIconSize", "()F", "setMUdIconSize", "(F)V", "mWeakNet", "mWeakNetIcon", "initHostView", "", "initMicView", "initNameTextView", "initShareScreenView", "onLayout", "changed", "left", "top", "right", "bottom", "onMeasure", "widthMeasureSpec", "heightMeasureSpec", "onUserHostChanged", "host", "coHost", "(Ljava/lang/Boolean;Ljava/lang/Boolean;)V", "onUserInfoChanged", "microphoneMuted", "shareScreen", "weakNet", "name", "(Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Boolean;)V", "micUnavailable", "(Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;)V", "onUserMicChanged", "onUserNameChanged", "onUserShareChanged", "(Ljava/lang/Boolean;)V", "setHostTextViewBgRes", "resId", "setIconMargin", "distance", "setOnLayoutChangeObserver", "onLayoutChangeObserver", "setTextPadding", "padding", "setTextSize", "size", "shouldLimitHostTextWidth", "limit", "updateView", "OnLayoutChangeObserver", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
public final class UserInfoStatusLayout extends LinearLayout {

    /* renamed from: a */
    private final String f157163a;

    /* renamed from: b */
    private Boolean f157164b;

    /* renamed from: c */
    private Boolean f157165c;

    /* renamed from: d */
    private Boolean f157166d;

    /* renamed from: e */
    private Boolean f157167e;

    /* renamed from: f */
    private String f157168f;

    /* renamed from: g */
    private Boolean f157169g;

    /* renamed from: h */
    private Boolean f157170h;

    /* renamed from: i */
    private TextView f157171i;

    /* renamed from: j */
    private ImageView f157172j;

    /* renamed from: k */
    private ImageView f157173k;

    /* renamed from: l */
    private TextView f157174l;

    /* renamed from: m */
    private int f157175m;

    /* renamed from: n */
    private float f157176n;

    /* renamed from: o */
    private float f157177o;

    /* renamed from: p */
    private int f157178p;

    /* renamed from: q */
    private int f157179q;

    /* renamed from: r */
    private boolean f157180r;

    /* renamed from: s */
    private OnLayoutChangeObserver f157181s;

    /* renamed from: t */
    private int f157182t;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\bf\u0018\u00002\u00020\u0001J\u001a\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&¨\u0006\b"}, d2 = {"Lcom/ss/android/vc/meeting/module/multi/UserInfoStatusLayout$OnLayoutChangeObserver;", "", "onLayoutChange", "", "self", "Landroid/view/View;", "fillParent", "", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.meeting.module.multi.UserInfoStatusLayout$a */
    public interface OnLayoutChangeObserver {
        void onLayoutChange(View view, boolean z);
    }

    public UserInfoStatusLayout(Context context) {
        this(context, null, 0, 6, null);
    }

    public UserInfoStatusLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public final float getMUdIconSize() {
        return this.f157177o;
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.meeting.module.multi.UserInfoStatusLayout$b */
    public static final class RunnableC62483b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ UserInfoStatusLayout f157183a;

        RunnableC62483b(UserInfoStatusLayout userInfoStatusLayout) {
            this.f157183a = userInfoStatusLayout;
        }

        public final void run() {
            this.f157183a.mo215993a();
        }
    }

    /* renamed from: b */
    private final void m244198b() {
        if (this.f157171i == null) {
            TextView textView = new TextView(getContext());
            this.f157171i = textView;
            if (textView != null) {
                textView.setIncludeFontPadding(false);
            }
            TextView textView2 = this.f157171i;
            if (textView2 != null) {
                textView2.setGravity(17);
            }
            TextView textView3 = this.f157171i;
            if (textView3 != null) {
                textView3.setTextColor(C60773o.m236126d(R.color.static_white));
            }
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -1);
            layoutParams.gravity = 8388611;
            TextView textView4 = this.f157171i;
            if (textView4 != null) {
                textView4.setLayoutParams(layoutParams);
            }
            TextView textView5 = this.f157171i;
            if (textView5 != null) {
                textView5.setBackground(C60773o.m236128f(this.f157175m));
            }
            TextView textView6 = this.f157171i;
            if (textView6 != null) {
                int i = this.f157179q;
                textView6.setPadding(i, 0, i - C60773o.m236115a(1.0d), 0);
            }
        }
        TextView textView7 = this.f157171i;
        if (textView7 != null) {
            textView7.setTextSize(1, this.f157176n);
        }
    }

    /* renamed from: c */
    private final void m244199c() {
        if (this.f157173k == null) {
            ImageView imageView = new ImageView(getContext());
            this.f157173k = imageView;
            C60783v.m236227a(imageView, (int) R.drawable.ud_icon_mic_off_filled, (int) R.color.function_danger_500);
        }
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.setMarginStart(C60773o.m236115a(4.0d));
        layoutParams.width = UIHelper.dp2px(this.f157177o);
        layoutParams.height = UIHelper.dp2px(this.f157177o);
        ImageView imageView2 = this.f157173k;
        if (imageView2 != null) {
            imageView2.setLayoutParams(layoutParams);
        }
    }

    /* renamed from: d */
    private final void m244200d() {
        int i;
        if (this.f157172j == null) {
            ImageView imageView = new ImageView(getContext());
            this.f157172j = imageView;
            C60783v.m236227a(imageView, (int) R.drawable.ud_icon_share_screen_filled, (int) R.color.function_success_500);
        }
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        if (Intrinsics.areEqual((Object) this.f157170h, (Object) true) || Intrinsics.areEqual((Object) this.f157166d, (Object) true)) {
            i = this.f157182t;
        } else {
            i = C60773o.m236115a(4.0d);
        }
        layoutParams.setMarginStart(i);
        layoutParams.width = UIHelper.dp2px(this.f157177o);
        layoutParams.height = UIHelper.dp2px(this.f157177o);
        ImageView imageView2 = this.f157172j;
        if (imageView2 != null) {
            imageView2.setLayoutParams(layoutParams);
        }
    }

    /* renamed from: e */
    private final void m244201e() {
        int i;
        if (this.f157174l == null) {
            TextView textView = new TextView(getContext());
            this.f157174l = textView;
            if (textView != null) {
                textView.setGravity(16);
            }
            TextView textView2 = this.f157174l;
            if (textView2 != null) {
                textView2.setMaxLines(1);
            }
            TextView textView3 = this.f157174l;
            if (textView3 != null) {
                textView3.setEllipsize(TextUtils.TruncateAt.END);
            }
            TextView textView4 = this.f157174l;
            if (textView4 != null) {
                textView4.setIncludeFontPadding(false);
            }
            TextView textView5 = this.f157174l;
            if (textView5 != null) {
                textView5.setTextColor(C60773o.m236126d(R.color.text_title));
            }
        }
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -1);
        if (Intrinsics.areEqual((Object) this.f157170h, (Object) true) || Intrinsics.areEqual((Object) this.f157166d, (Object) true) || Intrinsics.areEqual((Object) this.f157165c, (Object) true)) {
            i = this.f157182t;
        } else {
            i = this.f157179q;
        }
        layoutParams.setMarginStart(i);
        layoutParams.setMarginEnd(this.f157179q);
        TextView textView6 = this.f157174l;
        if (textView6 != null) {
            textView6.setLayoutParams(layoutParams);
        }
        TextView textView7 = this.f157174l;
        if (textView7 != null) {
            textView7.setTextSize(1, this.f157176n);
        }
    }

    /* renamed from: a */
    public final void mo215993a() {
        TextView textView;
        if (this.f157168f != null) {
            removeAllViews();
            if (Intrinsics.areEqual((Object) this.f157164b, (Object) true) || Intrinsics.areEqual((Object) this.f157169g, (Object) true)) {
                m244198b();
                if (Intrinsics.areEqual((Object) this.f157164b, (Object) true)) {
                    TextView textView2 = this.f157171i;
                    if (textView2 != null) {
                        textView2.setText(R.string.View_M_Host);
                    }
                } else if (Intrinsics.areEqual((Object) this.f157169g, (Object) true) && (textView = this.f157171i) != null) {
                    textView.setText(R.string.View_M_CoHost);
                }
                if (this.f157180r) {
                    if ((Intrinsics.areEqual((Object) this.f157170h, (Object) true) || Intrinsics.areEqual((Object) this.f157166d, (Object) true)) && Intrinsics.areEqual((Object) this.f157165c, (Object) true)) {
                        TextView textView3 = this.f157171i;
                        if (textView3 != null) {
                            textView3.setMaxWidth(UIHelper.dp2px(44.0f));
                        }
                        TextView textView4 = this.f157171i;
                        if (textView4 != null) {
                            textView4.setSingleLine(true);
                        }
                    } else {
                        TextView textView5 = this.f157171i;
                        if (textView5 != null) {
                            textView5.setMaxWidth(UIHelper.dp2px(120.0f));
                        }
                        TextView textView6 = this.f157171i;
                        if (textView6 != null) {
                            textView6.setSingleLine(true);
                        }
                    }
                    TextView textView7 = this.f157171i;
                    if (textView7 != null) {
                        textView7.setEllipsize(TextUtils.TruncateAt.END);
                    }
                }
                addView(this.f157171i);
            }
            if (Intrinsics.areEqual((Object) this.f157170h, (Object) true) || Intrinsics.areEqual((Object) this.f157166d, (Object) true)) {
                m244199c();
                if (Intrinsics.areEqual((Object) this.f157170h, (Object) true)) {
                    C60783v.m236227a(this.f157173k, (int) R.drawable.ud_icon_mic_off_filled, (int) R.color.icon_disable);
                } else if (Intrinsics.areEqual((Object) this.f157166d, (Object) true)) {
                    C60783v.m236227a(this.f157173k, (int) R.drawable.ud_icon_mic_off_filled, (int) R.color.function_danger_500);
                }
                addView(this.f157173k);
            }
            if (Intrinsics.areEqual((Object) this.f157165c, (Object) true)) {
                m244200d();
                addView(this.f157172j);
            }
            m244201e();
            TextView textView8 = this.f157174l;
            if (textView8 != null) {
                textView8.setText(this.f157168f);
            }
            addView(this.f157174l);
        }
    }

    /* renamed from: a */
    public final void mo215999a(boolean z) {
        this.f157180r = z;
    }

    public final void setHostTextViewBgRes(int i) {
        this.f157175m = i;
    }

    public final void setIconMargin(int i) {
        this.f157182t = i;
    }

    public final void setMUdIconSize(float f) {
        this.f157177o = f;
    }

    public final void setTextPadding(int i) {
        this.f157179q = i;
    }

    public final void setOnLayoutChangeObserver(OnLayoutChangeObserver aVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "onLayoutChangeObserver");
        this.f157181s = aVar;
    }

    public final void setTextSize(float f) {
        this.f157176n = f;
        mo215993a();
    }

    /* renamed from: a */
    public final void mo215994a(Boolean bool) {
        mo215997a(this.f157164b, this.f157166d, bool, this.f157167e, this.f157168f, this.f157169g, this.f157170h);
    }

    /* renamed from: a */
    public final void mo215998a(String str) {
        mo215997a(this.f157164b, this.f157166d, this.f157165c, this.f157167e, str, this.f157169g, this.f157170h);
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        this.f157178p = View.MeasureSpec.getSize(i);
        super.onMeasure(i, i2);
    }

    /* renamed from: b */
    public final void mo216000b(Boolean bool, Boolean bool2) {
        mo215997a(this.f157164b, bool, this.f157165c, this.f157167e, this.f157168f, this.f157169g, bool2);
    }

    /* renamed from: a */
    public final void mo215995a(Boolean bool, Boolean bool2) {
        mo215997a(bool, this.f157166d, this.f157165c, this.f157167e, this.f157168f, bool2, this.f157170h);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public UserInfoStatusLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkParameterIsNotNull(context, "context");
        this.f157163a = "UserInfoStatusLayout";
        this.f157175m = R.drawable.bg_user_info_host;
        this.f157176n = 12.0f;
        this.f157177o = 14.0f;
        this.f157179q = C60773o.m236115a(5.0d);
        this.f157182t = C60773o.m236115a(2.0d);
        setOrientation(0);
        setGravity(16);
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        OnLayoutChangeObserver aVar;
        boolean z2;
        super.onLayout(z, i, i2, i3, i4);
        if (z && (aVar = this.f157181s) != null && aVar != null) {
            UserInfoStatusLayout userInfoStatusLayout = this;
            if (getMeasuredWidth() >= this.f157178p) {
                z2 = true;
            } else {
                z2 = false;
            }
            aVar.onLayoutChange(userInfoStatusLayout, z2);
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ UserInfoStatusLayout(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* renamed from: a */
    public final void mo215996a(Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, String str, Boolean bool5) {
        mo215997a(bool, bool2, bool3, bool4, str, bool5, null);
    }

    /* renamed from: a */
    public final void mo215997a(Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, String str, Boolean bool5, Boolean bool6) {
        if (((!Intrinsics.areEqual(bool, this.f157164b)) | (!Intrinsics.areEqual(bool2, this.f157166d)) | (!Intrinsics.areEqual(bool3, this.f157165c)) | (!Intrinsics.areEqual(bool4, this.f157167e)) | (!TextUtils.equals(str, this.f157168f)) | (!Intrinsics.areEqual(bool5, this.f157169g))) || (!Intrinsics.areEqual(bool6, this.f157170h))) {
            this.f157164b = bool;
            this.f157166d = bool2;
            this.f157165c = bool3;
            this.f157167e = bool4;
            this.f157168f = str;
            this.f157169g = bool5;
            this.f157170h = bool6;
            C60735ab.m236001a(new RunnableC62483b(this));
        }
    }

    /* renamed from: a */
    public static /* synthetic */ void m244196a(UserInfoStatusLayout userInfoStatusLayout, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, String str, Boolean bool5, int i, Object obj) {
        if ((i & 1) != 0) {
            bool = userInfoStatusLayout.f157164b;
        }
        if ((i & 2) != 0) {
            bool2 = userInfoStatusLayout.f157166d;
        }
        if ((i & 4) != 0) {
            bool3 = userInfoStatusLayout.f157165c;
        }
        if ((i & 8) != 0) {
            bool4 = userInfoStatusLayout.f157167e;
        }
        if ((i & 16) != 0) {
            str = userInfoStatusLayout.f157168f;
        }
        if ((i & 32) != 0) {
            bool5 = userInfoStatusLayout.f157169g;
        }
        userInfoStatusLayout.mo215996a(bool, bool2, bool3, bool4, str, bool5);
    }

    /* renamed from: a */
    public static /* synthetic */ void m244197a(UserInfoStatusLayout userInfoStatusLayout, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, String str, Boolean bool5, Boolean bool6, int i, Object obj) {
        if ((i & 1) != 0) {
            bool = userInfoStatusLayout.f157164b;
        }
        if ((i & 2) != 0) {
            bool2 = userInfoStatusLayout.f157166d;
        }
        if ((i & 4) != 0) {
            bool3 = userInfoStatusLayout.f157165c;
        }
        if ((i & 8) != 0) {
            bool4 = userInfoStatusLayout.f157167e;
        }
        if ((i & 16) != 0) {
            str = userInfoStatusLayout.f157168f;
        }
        if ((i & 32) != 0) {
            bool5 = userInfoStatusLayout.f157169g;
        }
        if ((i & 64) != 0) {
            bool6 = userInfoStatusLayout.f157170h;
        }
        userInfoStatusLayout.mo215997a(bool, bool2, bool3, bool4, str, bool5, bool6);
    }
}
