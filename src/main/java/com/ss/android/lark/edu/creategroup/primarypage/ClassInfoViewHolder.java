package com.ss.android.lark.edu.creategroup.primarypage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import com.google.firebase.messaging.Constants;
import com.larksuite.component.ui.tag.LarkNameTag;
import com.larksuite.suite.R;
import com.ss.android.lark.chat.entity.chatter.TagInfo;
import com.ss.android.lark.edu.EduLauncher;
import com.ss.android.lark.edu.creategroup.primarypage.EduClassInfoListAdapter;
import com.ss.android.lark.edu.dto.ClassInfo;
import com.ss.android.lark.edu.util.EduStatisticUtil;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\t\u0018\u0000 \u00132\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0013B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0002H\u0002J\u0010\u0010\r\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0002H\u0002J\u0010\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u0002H\u0002J\u0010\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u0002H\u0002J\u0012\u0010\u0011\u001a\u00020\u000b2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0002H\u0016R\u0016\u0010\u0006\u001a\n \b*\u0004\u0018\u00010\u00070\u0007X\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\t\u001a\n \b*\u0004\u0018\u00010\u00070\u0007X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lcom/ss/android/lark/edu/creategroup/primarypage/ClassInfoViewHolder;", "Lcom/ss/android/lark/edu/creategroup/primarypage/EduClassInfoListAdapter$BaseViewHolder;", "Lcom/ss/android/lark/edu/dto/ClassInfo;", "v", "Landroid/view/View;", "(Landroid/view/View;)V", "classNameTV", "Landroid/widget/TextView;", "kotlin.jvm.PlatformType", "groupStateTV", "bindClassState", "", "info", "bindItemViewClick", "enterCreateGroupDetail", "classInfo", "enterGroupChat", "onBindData", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Companion", "features_edu_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.ss.android.lark.edu.creategroup.primarypage.a */
public final class ClassInfoViewHolder extends EduClassInfoListAdapter.BaseViewHolder<ClassInfo> {

    /* renamed from: a */
    public static final Companion f94939a = new Companion(null);

    /* renamed from: b */
    private final TextView f94940b;

    /* renamed from: c */
    private final TextView f94941c;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, d2 = {"Lcom/ss/android/lark/edu/creategroup/primarypage/ClassInfoViewHolder$Companion;", "", "()V", "create", "Lcom/ss/android/lark/edu/creategroup/primarypage/ClassInfoViewHolder;", "parent", "Landroid/view/ViewGroup;", "features_edu_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.ss.android.lark.edu.creategroup.primarypage.a$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final ClassInfoViewHolder mo136337a(ViewGroup viewGroup) {
            Intrinsics.checkParameterIsNotNull(viewGroup, "parent");
            View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.view_classinfo_item, viewGroup, false);
            Intrinsics.checkExpressionValueIsNotNull(inflate, "it");
            return new ClassInfoViewHolder(inflate);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.ss.android.lark.edu.creategroup.primarypage.a$b */
    public static final class View$OnClickListenerC36933b implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ ClassInfoViewHolder f94942a;

        /* renamed from: b */
        final /* synthetic */ ClassInfo f94943b;

        View$OnClickListenerC36933b(ClassInfoViewHolder aVar, ClassInfo classInfo) {
            this.f94942a = aVar;
            this.f94943b = classInfo;
        }

        public final void onClick(View view) {
            this.f94942a.mo136335b(this.f94943b);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.ss.android.lark.edu.creategroup.primarypage.a$c */
    public static final class View$OnClickListenerC36934c implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ ClassInfoViewHolder f94944a;

        /* renamed from: b */
        final /* synthetic */ ClassInfo f94945b;

        View$OnClickListenerC36934c(ClassInfoViewHolder aVar, ClassInfo classInfo) {
            this.f94944a = aVar;
            this.f94945b = classInfo;
        }

        public final void onClick(View view) {
            this.f94944a.mo136336c(this.f94945b);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ClassInfoViewHolder(View view) {
        super(view);
        Intrinsics.checkParameterIsNotNull(view, "v");
        this.f94940b = (TextView) view.findViewById(R.id.tv_class_name);
        this.f94941c = (TextView) view.findViewById(R.id.tv_group_state);
    }

    /* renamed from: e */
    private final void m145808e(ClassInfo classInfo) {
        if (classInfo.mo136394c()) {
            this.itemView.setOnClickListener(new View$OnClickListenerC36933b(this, classInfo));
        } else {
            this.itemView.setOnClickListener(new View$OnClickListenerC36934c(this, classInfo));
        }
    }

    /* renamed from: c */
    public final void mo136336c(ClassInfo classInfo) {
        EduStatisticUtil.m145870a();
        EduLauncher aVar = EduLauncher.f94914a;
        View view = this.itemView;
        Intrinsics.checkExpressionValueIsNotNull(view, "itemView");
        Context context = view.getContext();
        Intrinsics.checkExpressionValueIsNotNull(context, "itemView.context");
        aVar.mo136293a(context, classInfo);
    }

    /* renamed from: a */
    public void mo136334a(ClassInfo classInfo) {
        if (classInfo != null) {
            this.itemView.setOnClickListener(null);
            this.itemView.setBackgroundResource(R.drawable.item_slector_bg);
            TextView textView = this.f94940b;
            Intrinsics.checkExpressionValueIsNotNull(textView, "classNameTV");
            textView.setText(classInfo.mo136390b());
            m145807d(classInfo);
            m145808e(classInfo);
        }
    }

    /* renamed from: b */
    public final void mo136335b(ClassInfo classInfo) {
        String d = classInfo.mo136395d();
        if (d != null) {
            EduStatisticUtil.m145873b(classInfo.mo136395d());
            EduLauncher aVar = EduLauncher.f94914a;
            View view = this.itemView;
            Intrinsics.checkExpressionValueIsNotNull(view, "itemView");
            Context context = view.getContext();
            Intrinsics.checkExpressionValueIsNotNull(context, "itemView.context");
            Intrinsics.checkExpressionValueIsNotNull(d, "it");
            String a = classInfo.mo136387a();
            Intrinsics.checkExpressionValueIsNotNull(a, "classInfo.classId");
            aVar.mo136294a(context, d, a);
        }
    }

    /* renamed from: d */
    private final void m145807d(ClassInfo classInfo) {
        if (classInfo.mo136394c()) {
            this.f94941c.setText(R.string.Lark_Education_GroupCreatedEnter);
            TextView textView = this.f94941c;
            View view = this.itemView;
            Intrinsics.checkExpressionValueIsNotNull(view, "itemView");
            textView.setTextColor(ContextCompat.getColor(view.getContext(), R.color.lkui_N500));
        } else {
            this.f94941c.setText(R.string.Lark_Education_GoCreate);
            TextView textView2 = this.f94941c;
            View view2 = this.itemView;
            Intrinsics.checkExpressionValueIsNotNull(view2, "itemView");
            textView2.setTextColor(ContextCompat.getColor(view2.getContext(), R.color.lkui_B500));
        }
        if (classInfo.mo136399f()) {
            TextView textView3 = this.f94940b;
            Intrinsics.checkExpressionValueIsNotNull(textView3, "classNameTV");
            Context context = textView3.getContext();
            Intrinsics.checkExpressionValueIsNotNull(context, "ctx");
            LarkNameTag.Builder bVar = new LarkNameTag.Builder(context);
            TagInfo.Companion.mo124876a(bVar, TagInfo.Companion.mo124874a().mo124880b(context));
            LarkNameTag e = bVar.mo90027e();
            TextView textView4 = this.f94940b;
            Intrinsics.checkExpressionValueIsNotNull(textView4, "classNameTV");
            e.mo90004a(textView4);
        }
    }
}
