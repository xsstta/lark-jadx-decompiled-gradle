package com.ss.android.lark.todo.impl.features.detail.sections;

import android.graphics.Bitmap;
import android.graphics.Rect;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.lifecycle.AbstractC1178x;
import com.huawei.hms.support.api.entity.core.CommonCode;
import com.larksuite.framework.p1173a.p1174a.C25877a;
import com.larksuite.framework.section.IViewAbility;
import com.larksuite.framework.section.ViewSection;
import com.larksuite.suite.R;
import com.ss.android.lark.todo.dependency.TodoDependencyHolder;
import com.ss.android.lark.todo.impl.features.detail.common.LayerAvatarView;
import com.ss.android.lark.todo.impl.features.detail.viewmodel.FollowerBean;
import com.ss.android.lark.todo.impl.features.detail.viewmodel.ITodoDetailViewDataStore;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.lark.utils.rxjava.C57865c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006¢\u0006\u0002\u0010\u0007J\b\u0010\b\u001a\u00020\tH\u0016J\b\u0010\n\u001a\u00020\tH\u0016J\u0016\u0010\u000b\u001a\u00020\t2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/ss/android/lark/todo/impl/features/detail/sections/FollowerSection;", "Lcom/larksuite/framework/section/ViewSection;", "Lcom/ss/android/lark/todo/impl/features/detail/viewmodel/ITodoDetailViewDataStore;", "containerView", "Landroid/view/View;", "viewAbility", "Lcom/larksuite/framework/section/IViewAbility;", "(Landroid/view/View;Lcom/larksuite/framework/section/IViewAbility;)V", "initViewAction", "", "initViewObserver", "updateFollowerView", "followers", "", "Lcom/ss/android/lark/todo/impl/features/detail/viewmodel/FollowerBean;", "todo_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.todo.impl.features.detail.d.h */
public final class FollowerSection extends ViewSection<ITodoDetailViewDataStore> {

    /* renamed from: a */
    public final View f139995a;

    @Override // com.larksuite.framework.section.ViewSection
    /* renamed from: f */
    public void mo92109f() {
        ((ITodoDetailViewDataStore) mo92096a()).getFollowers().mo5923a(mo92105b(), new C56619a(this));
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\u0010\u0000\u001a&\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002 \u0003*\u0012\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0018\u00010\u00040\u0001H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "Landroid/graphics/Bitmap;", "kotlin.jvm.PlatformType", "", "produce"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.detail.d.h$b */
    public static final class C56620b<T> implements C57865c.AbstractC57873d<T> {

        /* renamed from: a */
        final /* synthetic */ FollowerSection f139997a;

        /* renamed from: b */
        final /* synthetic */ List f139998b;

        /* renamed from: c */
        final /* synthetic */ List f139999c;

        C56620b(FollowerSection hVar, List list, List list2) {
            this.f139997a = hVar;
            this.f139998b = list;
            this.f139999c = list2;
        }

        /* renamed from: a */
        public final List<Bitmap> produce() {
            return TodoDependencyHolder.f139242a.mo191730a().imageDependency().mo145391a(this.f139997a.mo92106c(), this.f139998b, this.f139999c, UIHelper.dp2px(24.0f), UIHelper.dp2px(24.0f));
        }
    }

    @Override // com.larksuite.framework.section.ViewSection
    /* renamed from: g */
    public void mo92110g() {
        LinearLayout linearLayout = (LinearLayout) this.f139995a.findViewById(R.id.detail_follower_container);
        Intrinsics.checkExpressionValueIsNotNull(linearLayout, "containerView.detail_follower_container");
        C25877a.m93658a(linearLayout, mo92107d(), CommonCode.StatusCode.API_CLIENT_EXPIRED, 32);
        View findViewById = this.f139995a.findViewById(R.id.layout_follower);
        Intrinsics.checkExpressionValueIsNotNull(findViewById, "containerView.layout_follower");
        C25877a.m93658a(findViewById, mo92107d(), CommonCode.StatusCode.API_CLIENT_EXPIRED, 31);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u001a\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "it", "", "Lcom/ss/android/lark/todo/impl/features/detail/viewmodel/FollowerBean;", "kotlin.jvm.PlatformType", "onChanged"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.detail.d.h$a */
    static final class C56619a<T> implements AbstractC1178x<List<? extends FollowerBean>> {

        /* renamed from: a */
        final /* synthetic */ FollowerSection f139996a;

        C56619a(FollowerSection hVar) {
            this.f139996a = hVar;
        }

        /* renamed from: a */
        public final void onChanged(List<FollowerBean> list) {
            FollowerSection hVar = this.f139996a;
            Intrinsics.checkExpressionValueIsNotNull(list, "it");
            hVar.mo192601a(list);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\u0010\u0000\u001a\u00020\u00012*\u0010\u0002\u001a&\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004 \u0005*\u0012\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004\u0018\u00010\u00060\u0003H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "bitmaps", "", "Landroid/graphics/Bitmap;", "kotlin.jvm.PlatformType", "", "consume"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.detail.d.h$c */
    public static final class C56621c<T> implements C57865c.AbstractC57871b<T> {

        /* renamed from: a */
        final /* synthetic */ FollowerSection f140000a;

        C56621c(FollowerSection hVar) {
            this.f140000a = hVar;
        }

        /* renamed from: a */
        public final void consume(List<Bitmap> list) {
            View findViewById = this.f140000a.f139995a.findViewById(R.id.layout_follower);
            Intrinsics.checkExpressionValueIsNotNull(findViewById, "containerView.layout_follower");
            Intrinsics.checkExpressionValueIsNotNull(list, "bitmaps");
            ((LayerAvatarView) findViewById.findViewById(R.id.avatar_list)).mo192511a(list);
        }
    }

    /* renamed from: a */
    public final void mo192601a(List<FollowerBean> list) {
        int size = list.size();
        if (size > 0) {
            TextView textView = (TextView) this.f139995a.findViewById(R.id.text_add_follower);
            Intrinsics.checkExpressionValueIsNotNull(textView, "containerView.text_add_follower");
            textView.setVisibility(8);
            LinearLayout linearLayout = (LinearLayout) this.f139995a.findViewById(R.id.detail_follower_container);
            Intrinsics.checkExpressionValueIsNotNull(linearLayout, "containerView.detail_follower_container");
            linearLayout.setClickable(false);
            View findViewById = this.f139995a.findViewById(R.id.layout_follower);
            Intrinsics.checkExpressionValueIsNotNull(findViewById, "containerView.layout_follower");
            findViewById.setVisibility(0);
            View findViewById2 = this.f139995a.findViewById(R.id.layout_follower);
            Intrinsics.checkExpressionValueIsNotNull(findViewById2, "containerView.layout_follower");
            ((LayerAvatarView) findViewById2.findViewById(R.id.avatar_list)).setMPaddingRect(new Rect(0, 0, 0, 0));
            View findViewById3 = this.f139995a.findViewById(R.id.layout_follower);
            Intrinsics.checkExpressionValueIsNotNull(findViewById3, "containerView.layout_follower");
            ((LayerAvatarView) findViewById3.findViewById(R.id.avatar_list)).setMIconSize((float) UIHelper.dp2px(24.0f));
            View findViewById4 = this.f139995a.findViewById(R.id.layout_follower);
            Intrinsics.checkExpressionValueIsNotNull(findViewById4, "containerView.layout_follower");
            ((LayerAvatarView) findViewById4.findViewById(R.id.avatar_list)).setMIconCoverMargin((float) UIHelper.dp2px(-4.0f));
            if (list.size() > 3) {
                list = list.subList(0, 3);
            }
            List<FollowerBean> list2 = list;
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
            Iterator<T> it = list2.iterator();
            while (it.hasNext()) {
                arrayList.add(it.next().mo193020c());
            }
            ArrayList arrayList2 = arrayList;
            ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
            Iterator<T> it2 = list2.iterator();
            while (it2.hasNext()) {
                arrayList3.add(it2.next().mo193018a());
            }
            C57865c.m224574a(new C56620b(this, arrayList2, arrayList3), new C56621c(this));
            if (size == 1) {
                View findViewById5 = this.f139995a.findViewById(R.id.layout_follower);
                Intrinsics.checkExpressionValueIsNotNull(findViewById5, "containerView.layout_follower");
                TextView textView2 = (TextView) findViewById5.findViewById(R.id.avatar_text);
                Intrinsics.checkExpressionValueIsNotNull(textView2, "containerView.layout_follower.avatar_text");
                textView2.setText(list.get(0).mo193019b());
                return;
            }
            View findViewById6 = this.f139995a.findViewById(R.id.layout_follower);
            Intrinsics.checkExpressionValueIsNotNull(findViewById6, "containerView.layout_follower");
            TextView textView3 = (TextView) findViewById6.findViewById(R.id.avatar_text);
            Intrinsics.checkExpressionValueIsNotNull(textView3, "containerView.layout_follower.avatar_text");
            textView3.setText(UIHelper.getQuantityString(R.plurals.Todo_Task_NumFollower, size));
            return;
        }
        TextView textView4 = (TextView) this.f139995a.findViewById(R.id.text_add_follower);
        Intrinsics.checkExpressionValueIsNotNull(textView4, "containerView.text_add_follower");
        textView4.setVisibility(0);
        LinearLayout linearLayout2 = (LinearLayout) this.f139995a.findViewById(R.id.detail_follower_container);
        Intrinsics.checkExpressionValueIsNotNull(linearLayout2, "containerView.detail_follower_container");
        linearLayout2.setClickable(true);
        View findViewById7 = this.f139995a.findViewById(R.id.layout_follower);
        Intrinsics.checkExpressionValueIsNotNull(findViewById7, "containerView.layout_follower");
        findViewById7.setVisibility(8);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FollowerSection(View view, IViewAbility<ITodoDetailViewDataStore> fVar) {
        super(fVar);
        Intrinsics.checkParameterIsNotNull(view, "containerView");
        Intrinsics.checkParameterIsNotNull(fVar, "viewAbility");
        this.f139995a = view;
    }
}
