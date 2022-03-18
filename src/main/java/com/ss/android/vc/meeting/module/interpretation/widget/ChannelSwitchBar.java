package com.ss.android.vc.meeting.module.interpretation.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.larksuite.suite.R;
import com.ss.android.lark.widget.listener.OnSingleClickListener;
import com.ss.android.vc.common.p3077b.C60700b;
import com.ss.android.vc.common.p3083e.C60735ab;
import com.ss.android.vc.entity.LanguageType;
import com.ss.android.vc.meeting.module.interpretation.p3128c.C61958a;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u00002\u00020\u0001:\u0001-B%\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\b\u0010\u0014\u001a\u00020\u0015H\u0002J\b\u0010\u0016\u001a\u0004\u0018\u00010\u0010J\b\u0010\u0017\u001a\u0004\u0018\u00010\u0010J\b\u0010\u0018\u001a\u0004\u0018\u00010\u0010J\u0010\u0010\u0019\u001a\u00020\u00072\u0006\u0010\u001a\u001a\u00020\u001bH\u0002J\b\u0010\u001c\u001a\u00020\u0015H\u0002J\b\u0010\u001d\u001a\u00020\u0015H\u0002J(\u0010\u001e\u001a\u00020\u00152\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\u001b2\u0006\u0010$\u001a\u00020\u000eH\u0002J\u000e\u0010%\u001a\u00020\u00152\u0006\u0010&\u001a\u00020\u0012J\b\u0010'\u001a\u00020\u0015H\u0002J(\u0010(\u001a\u00020\u00152\u0006\u0010)\u001a\u00020\u00102\u0006\u0010*\u001a\u00020\u000e2\u0006\u0010+\u001a\u00020\u00102\u0006\u0010,\u001a\u00020\u000eH\u0002J$\u0010(\u001a\u00020\u00152\b\u0010)\u001a\u0004\u0018\u00010\u00102\b\u0010+\u001a\u0004\u0018\u00010\u00102\b\u0010$\u001a\u0004\u0018\u00010\u0010R\u0014\u0010\t\u001a\u00020\nXD¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u000e\u0010\r\u001a\u00020\u000eX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0010X\u000e¢\u0006\u0002\n\u0000¨\u0006."}, d2 = {"Lcom/ss/android/vc/meeting/module/interpretation/widget/ChannelSwitchBar;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "TAG", "", "getTAG", "()Ljava/lang/String;", "init", "", "leftLanguage", "Lcom/ss/android/vc/entity/LanguageType;", "mListener", "Lcom/ss/android/vc/meeting/module/interpretation/widget/ChannelSwitchBar$OnItemClickListener;", "rightLanguage", "adjustTxtWidth", "", "getLeftLanguage", "getRightLanguage", "getSelectedLanguage", "getTextLength", "txtView", "Landroid/widget/TextView;", "inflateAndInitIfNeed", "setClickListener", "setSelected", "container", "Landroid/view/View;", "languageLabel", "Lcom/ss/android/vc/meeting/module/interpretation/widget/LanguageLabel;", "item", "selected", "setSelectedListener", "listener", "setTextWatcher", "updateUI", "left", "leftSelected", "right", "rightSelected", "OnItemClickListener", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
public final class ChannelSwitchBar extends FrameLayout {

    /* renamed from: a */
    public LanguageType f155735a;

    /* renamed from: b */
    public LanguageType f155736b;

    /* renamed from: c */
    public OnItemClickListener f155737c;

    /* renamed from: d */
    private final String f155738d;

    /* renamed from: e */
    private boolean f155739e;

    /* renamed from: f */
    private HashMap f155740f;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u001a\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H&¨\u0006\b"}, d2 = {"Lcom/ss/android/vc/meeting/module/interpretation/widget/ChannelSwitchBar$OnItemClickListener;", "", "selected", "", "left", "", "languageType", "Lcom/ss/android/vc/entity/LanguageType;", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.meeting.module.interpretation.widget.ChannelSwitchBar$a */
    public interface OnItemClickListener {
        /* renamed from: a */
        void mo214473a(boolean z, LanguageType languageType);
    }

    public ChannelSwitchBar(Context context) {
        this(context, null, 0, 6, null);
    }

    public ChannelSwitchBar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    /* renamed from: a */
    public View mo214572a(int i) {
        if (this.f155740f == null) {
            this.f155740f = new HashMap();
        }
        View view = (View) this.f155740f.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f155740f.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public final LanguageType getLeftLanguage() {
        return this.f155735a;
    }

    public final LanguageType getRightLanguage() {
        return this.f155736b;
    }

    public final String getTAG() {
        return this.f155738d;
    }

    /* renamed from: a */
    public final void mo214573a() {
        C60735ab.m236002a(new RunnableC61986b(this), 60);
    }

    /* renamed from: c */
    private final void m242172c() {
        C61989e eVar = new C61989e(this);
        ((TextView) mo214572a(R.id.txt_left)).addTextChangedListener(eVar);
        ((TextView) mo214572a(R.id.txt_right)).addTextChangedListener(eVar);
    }

    public final LanguageType getSelectedLanguage() {
        TextView textView = (TextView) mo214572a(R.id.txt_left);
        Intrinsics.checkExpressionValueIsNotNull(textView, "txt_left");
        if (textView.isSelected()) {
            return this.f155735a;
        }
        return this.f155736b;
    }

    /* renamed from: b */
    private final void m242171b() {
        if (!this.f155739e) {
            C60700b.m235851b(this.f155738d, "[inflateAndInitIfNeed]", "ChannelSwitchBar");
            LayoutInflater.from(getContext()).inflate(R.layout.channel_switch_bar_layout, (ViewGroup) this, true);
            m242173d();
            m242172c();
            this.f155739e = true;
        }
    }

    /* renamed from: d */
    private final void m242173d() {
        ((LinearLayout) mo214572a(R.id.left_container)).setOnClickListener(new C61987c(this));
        ((LinearLayout) mo214572a(R.id.right_container)).setOnClickListener(new C61988d(this));
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.meeting.module.interpretation.widget.ChannelSwitchBar$b */
    public static final class RunnableC61986b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ ChannelSwitchBar f155741a;

        RunnableC61986b(ChannelSwitchBar channelSwitchBar) {
            this.f155741a = channelSwitchBar;
        }

        public final void run() {
            Integer num;
            ViewGroup.LayoutParams layoutParams;
            ViewGroup.LayoutParams layoutParams2;
            ViewGroup.LayoutParams layoutParams3;
            ViewGroup.LayoutParams layoutParams4;
            ChannelSwitchBar channelSwitchBar = this.f155741a;
            TextView textView = (TextView) channelSwitchBar.mo214572a(R.id.txt_left);
            Intrinsics.checkExpressionValueIsNotNull(textView, "txt_left");
            int a = channelSwitchBar.mo214571a(textView);
            ChannelSwitchBar channelSwitchBar2 = this.f155741a;
            TextView textView2 = (TextView) channelSwitchBar2.mo214572a(R.id.txt_right);
            Intrinsics.checkExpressionValueIsNotNull(textView2, "txt_right");
            int a2 = channelSwitchBar2.mo214571a(textView2);
            String tag = this.f155741a.getTAG();
            StringBuilder sb = new StringBuilder();
            sb.append("leftLen=");
            sb.append(a);
            sb.append(",rightLen=");
            sb.append(a2);
            sb.append(",txt_right.width=");
            TextView textView3 = (TextView) this.f155741a.mo214572a(R.id.txt_right);
            Intrinsics.checkExpressionValueIsNotNull(textView3, "txt_right");
            sb.append(textView3.getWidth());
            sb.append(",txt_left.width=");
            TextView textView4 = (TextView) this.f155741a.mo214572a(R.id.txt_left);
            Intrinsics.checkExpressionValueIsNotNull(textView4, "txt_left");
            sb.append(textView4.getWidth());
            C60700b.m235851b(tag, "[adjustTxtWidth]", sb.toString());
            String tag2 = this.f155741a.getTAG();
            StringBuilder sb2 = new StringBuilder();
            sb2.append("leftLen=");
            sb2.append(a);
            sb2.append(",rightLen=");
            sb2.append(a2);
            sb2.append(",right_container.width=");
            LinearLayout linearLayout = (LinearLayout) this.f155741a.mo214572a(R.id.right_container);
            Intrinsics.checkExpressionValueIsNotNull(linearLayout, "right_container");
            sb2.append(linearLayout.getWidth());
            sb2.append(",left_container.width=");
            LinearLayout linearLayout2 = (LinearLayout) this.f155741a.mo214572a(R.id.left_container);
            Intrinsics.checkExpressionValueIsNotNull(linearLayout2, "left_container");
            sb2.append(linearLayout2.getWidth());
            C60700b.m235851b(tag2, "[adjustTxtWidth2]", sb2.toString());
            LinearLayout linearLayout3 = (LinearLayout) this.f155741a.mo214572a(R.id.right_container);
            Integer num2 = null;
            if (linearLayout3 != null) {
                num = Integer.valueOf(linearLayout3.getWidth());
            } else {
                num = null;
            }
            LinearLayout linearLayout4 = (LinearLayout) this.f155741a.mo214572a(R.id.left_container);
            if (linearLayout4 != null) {
                num2 = Integer.valueOf(linearLayout4.getWidth());
            }
            if (a == a2) {
                LinearLayout linearLayout5 = (LinearLayout) this.f155741a.mo214572a(R.id.right_container);
                if (!(linearLayout5 == null || (layoutParams4 = linearLayout5.getLayoutParams()) == null)) {
                    layoutParams4.width = -2;
                }
                ((LinearLayout) this.f155741a.mo214572a(R.id.right_container)).requestLayout();
                LinearLayout linearLayout6 = (LinearLayout) this.f155741a.mo214572a(R.id.left_container);
                if (!(linearLayout6 == null || (layoutParams3 = linearLayout6.getLayoutParams()) == null)) {
                    layoutParams3.width = -2;
                }
                ((LinearLayout) this.f155741a.mo214572a(R.id.left_container)).requestLayout();
            } else if (a > a2) {
                LinearLayout linearLayout7 = (LinearLayout) this.f155741a.mo214572a(R.id.right_container);
                if (!(linearLayout7 == null || (layoutParams2 = linearLayout7.getLayoutParams()) == null)) {
                    layoutParams2.width = num2.intValue();
                }
                ((LinearLayout) this.f155741a.mo214572a(R.id.right_container)).requestLayout();
            } else if (a < a2) {
                LinearLayout linearLayout8 = (LinearLayout) this.f155741a.mo214572a(R.id.left_container);
                if (!(linearLayout8 == null || (layoutParams = linearLayout8.getLayoutParams()) == null)) {
                    layoutParams.width = num.intValue();
                }
                ((LinearLayout) this.f155741a.mo214572a(R.id.left_container)).requestLayout();
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/vc/meeting/module/interpretation/widget/ChannelSwitchBar$setClickListener$1", "Lcom/ss/android/lark/widget/listener/OnSingleClickListener;", "onSingleClick", "", "v", "Landroid/view/View;", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.meeting.module.interpretation.widget.ChannelSwitchBar$c */
    public static final class C61987c extends OnSingleClickListener {

        /* renamed from: a */
        final /* synthetic */ ChannelSwitchBar f155742a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C61987c(ChannelSwitchBar channelSwitchBar) {
            this.f155742a = channelSwitchBar;
        }

        @Override // com.ss.android.lark.widget.listener.OnSingleClickListener
        public void onSingleClick(View view) {
            LinearLayout linearLayout = (LinearLayout) this.f155742a.mo214572a(R.id.left_container);
            Intrinsics.checkExpressionValueIsNotNull(linearLayout, "left_container");
            if (!linearLayout.isSelected()) {
                ChannelSwitchBar channelSwitchBar = this.f155742a;
                LinearLayout linearLayout2 = (LinearLayout) channelSwitchBar.mo214572a(R.id.left_container);
                Intrinsics.checkExpressionValueIsNotNull(linearLayout2, "left_container");
                LanguageLabel languageLabel = (LanguageLabel) this.f155742a.mo214572a(R.id.txt_left_label);
                Intrinsics.checkExpressionValueIsNotNull(languageLabel, "txt_left_label");
                TextView textView = (TextView) this.f155742a.mo214572a(R.id.txt_left);
                Intrinsics.checkExpressionValueIsNotNull(textView, "txt_left");
                channelSwitchBar.mo214574a((View) linearLayout2, languageLabel, textView, true);
                ChannelSwitchBar channelSwitchBar2 = this.f155742a;
                LinearLayout linearLayout3 = (LinearLayout) channelSwitchBar2.mo214572a(R.id.right_container);
                Intrinsics.checkExpressionValueIsNotNull(linearLayout3, "right_container");
                LanguageLabel languageLabel2 = (LanguageLabel) this.f155742a.mo214572a(R.id.txt_right_label);
                Intrinsics.checkExpressionValueIsNotNull(languageLabel2, "txt_right_label");
                TextView textView2 = (TextView) this.f155742a.mo214572a(R.id.txt_right);
                Intrinsics.checkExpressionValueIsNotNull(textView2, "txt_right");
                channelSwitchBar2.mo214574a((View) linearLayout3, languageLabel2, textView2, false);
                OnItemClickListener aVar = this.f155742a.f155737c;
                if (aVar != null) {
                    aVar.mo214473a(true, this.f155742a.f155735a);
                }
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/vc/meeting/module/interpretation/widget/ChannelSwitchBar$setClickListener$2", "Lcom/ss/android/lark/widget/listener/OnSingleClickListener;", "onSingleClick", "", "v", "Landroid/view/View;", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.meeting.module.interpretation.widget.ChannelSwitchBar$d */
    public static final class C61988d extends OnSingleClickListener {

        /* renamed from: a */
        final /* synthetic */ ChannelSwitchBar f155743a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C61988d(ChannelSwitchBar channelSwitchBar) {
            this.f155743a = channelSwitchBar;
        }

        @Override // com.ss.android.lark.widget.listener.OnSingleClickListener
        public void onSingleClick(View view) {
            LinearLayout linearLayout = (LinearLayout) this.f155743a.mo214572a(R.id.right_container);
            Intrinsics.checkExpressionValueIsNotNull(linearLayout, "right_container");
            if (!linearLayout.isSelected()) {
                ChannelSwitchBar channelSwitchBar = this.f155743a;
                LinearLayout linearLayout2 = (LinearLayout) channelSwitchBar.mo214572a(R.id.right_container);
                Intrinsics.checkExpressionValueIsNotNull(linearLayout2, "right_container");
                LanguageLabel languageLabel = (LanguageLabel) this.f155743a.mo214572a(R.id.txt_right_label);
                Intrinsics.checkExpressionValueIsNotNull(languageLabel, "txt_right_label");
                TextView textView = (TextView) this.f155743a.mo214572a(R.id.txt_right);
                Intrinsics.checkExpressionValueIsNotNull(textView, "txt_right");
                channelSwitchBar.mo214574a((View) linearLayout2, languageLabel, textView, true);
                ChannelSwitchBar channelSwitchBar2 = this.f155743a;
                LinearLayout linearLayout3 = (LinearLayout) channelSwitchBar2.mo214572a(R.id.left_container);
                Intrinsics.checkExpressionValueIsNotNull(linearLayout3, "left_container");
                LanguageLabel languageLabel2 = (LanguageLabel) this.f155743a.mo214572a(R.id.txt_left_label);
                Intrinsics.checkExpressionValueIsNotNull(languageLabel2, "txt_left_label");
                TextView textView2 = (TextView) this.f155743a.mo214572a(R.id.txt_left);
                Intrinsics.checkExpressionValueIsNotNull(textView2, "txt_left");
                channelSwitchBar2.mo214574a((View) linearLayout3, languageLabel2, textView2, false);
                OnItemClickListener aVar = this.f155743a.f155737c;
                if (aVar != null) {
                    aVar.mo214473a(false, this.f155743a.f155736b);
                }
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J*\u0010\u0006\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\tH\u0016J*\u0010\f\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tH\u0016¨\u0006\u000e"}, d2 = {"com/ss/android/vc/meeting/module/interpretation/widget/ChannelSwitchBar$setTextWatcher$watcher$1", "Landroid/text/TextWatcher;", "afterTextChanged", "", "s", "Landroid/text/Editable;", "beforeTextChanged", "", "start", "", "count", "after", "onTextChanged", "before", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.meeting.module.interpretation.widget.ChannelSwitchBar$e */
    public static final class C61989e implements TextWatcher {

        /* renamed from: a */
        final /* synthetic */ ChannelSwitchBar f155744a;

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C61989e(ChannelSwitchBar channelSwitchBar) {
            this.f155744a = channelSwitchBar;
        }

        public void afterTextChanged(Editable editable) {
            this.f155744a.mo214573a();
        }
    }

    public final void setSelectedListener(OnItemClickListener aVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "listener");
        this.f155737c = aVar;
    }

    /* renamed from: a */
    public final int mo214571a(TextView textView) {
        if (TextUtils.isEmpty(textView.getText())) {
            return 0;
        }
        return textView.getText().length();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ChannelSwitchBar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkParameterIsNotNull(context, "context");
        this.f155738d = "ChannelSwitchBar";
        C60700b.m235851b("ChannelSwitchBar", "[init]", "init");
    }

    /* renamed from: a */
    public final void mo214575a(LanguageType languageType, LanguageType languageType2, LanguageType languageType3) {
        if (languageType != null && languageType2 != null && languageType3 != null) {
            m242171b();
            if (LanguageType.equalType(languageType, languageType3)) {
                m242170a(languageType, true, languageType2, false);
            } else if (LanguageType.equalType(languageType2, languageType3)) {
                m242170a(languageType, false, languageType2, true);
            }
        }
    }

    /* renamed from: a */
    public final void mo214574a(View view, LanguageLabel languageLabel, TextView textView, boolean z) {
        view.setSelected(z);
        if (z) {
            Drawable background = view.getBackground();
            if (background != null) {
                background.setAlpha(255);
            }
            textView.setTextColor(getResources().getColor(R.color.vc_btn_text_selected));
            languageLabel.setLanguageBackgroundColor(getResources().getColor(R.color.primary_pri_500));
            return;
        }
        Drawable background2 = view.getBackground();
        if (background2 != null) {
            background2.setAlpha(0);
        }
        textView.setTextColor(getResources().getColor(R.color.text_title));
        languageLabel.setLanguageBackgroundColor(getResources().getColor(R.color.icon_n3));
    }

    /* renamed from: a */
    private final void m242170a(LanguageType languageType, boolean z, LanguageType languageType2, boolean z2) {
        String str;
        this.f155735a = languageType;
        LinearLayout linearLayout = (LinearLayout) mo214572a(R.id.left_container);
        Intrinsics.checkExpressionValueIsNotNull(linearLayout, "left_container");
        LanguageLabel languageLabel = (LanguageLabel) mo214572a(R.id.txt_left_label);
        Intrinsics.checkExpressionValueIsNotNull(languageLabel, "txt_left_label");
        TextView textView = (TextView) mo214572a(R.id.txt_left);
        Intrinsics.checkExpressionValueIsNotNull(textView, "txt_left");
        mo214574a(linearLayout, languageLabel, textView, z);
        C61958a.m242072a(languageType, (TextView) mo214572a(R.id.txt_left));
        LanguageLabel languageLabel2 = (LanguageLabel) mo214572a(R.id.txt_left_label);
        LanguageType languageType3 = this.f155735a;
        String str2 = null;
        if (languageType3 != null) {
            str = languageType3.iconStr;
        } else {
            str = null;
        }
        languageLabel2.setLanguage(str);
        this.f155736b = languageType2;
        LinearLayout linearLayout2 = (LinearLayout) mo214572a(R.id.right_container);
        Intrinsics.checkExpressionValueIsNotNull(linearLayout2, "right_container");
        LanguageLabel languageLabel3 = (LanguageLabel) mo214572a(R.id.txt_right_label);
        Intrinsics.checkExpressionValueIsNotNull(languageLabel3, "txt_right_label");
        TextView textView2 = (TextView) mo214572a(R.id.txt_right);
        Intrinsics.checkExpressionValueIsNotNull(textView2, "txt_right");
        mo214574a(linearLayout2, languageLabel3, textView2, z2);
        C61958a.m242072a(languageType2, (TextView) mo214572a(R.id.txt_right));
        LanguageLabel languageLabel4 = (LanguageLabel) mo214572a(R.id.txt_right_label);
        LanguageType languageType4 = this.f155736b;
        if (languageType4 != null) {
            str2 = languageType4.iconStr;
        }
        languageLabel4.setLanguage(str2);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ChannelSwitchBar(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
