package com.ss.android.lark.mm.module.share.setting;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.RelativeLayout;
import androidx.appcompat.widget.AppCompatImageView;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.mm.module.share.model.User;
import com.ss.android.lark.mm.module.share.utils.UserUtil;
import com.ss.android.lark.mm.p2288b.C45853e;
import com.ss.android.lark.mm.p2288b.C45855f;
import com.ss.android.lark.mm.widget.avatar.Avatar;
import com.ss.android.lark.mm.widget.avatar.AvatarList;
import java.util.HashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0001\u0019B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u0019\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007B!\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nB)\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\t¢\u0006\u0002\u0010\fJ9\u0010\r\u001a\u00020\u000e2\u000e\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u00102!\u0010\u0012\u001a\u001d\u0012\u0013\u0012\u00110\u0014¢\u0006\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\b(\u0017\u0012\u0004\u0012\u00020\u000e0\u0013J\b\u0010\u0018\u001a\u00020\u000eH\u0002¨\u0006\u001a"}, d2 = {"Lcom/ss/android/lark/mm/module/share/setting/CollaboratorsView;", "Landroid/widget/RelativeLayout;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "defStyleRes", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "bindData", "", "list", "", "Lcom/ss/android/lark/mm/module/share/model/User;", "onClick", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", "name", "isInvite", "init", "AvatarListAdapter", "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class CollaboratorsView extends RelativeLayout {

    /* renamed from: a */
    private HashMap f118351a;

    /* renamed from: a */
    public View mo165221a(int i) {
        if (this.f118351a == null) {
            this.f118351a = new HashMap();
        }
        View view = (View) this.f118351a.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f118351a.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    /* renamed from: a */
    private final void m186141a() {
        LayoutInflater.from(getContext()).inflate(R.layout.mm_view_share_collaborator, this);
        setGravity(15);
        ((AvatarList) mo165221a(R.id.avatarList)).setOverlapWidth(-UIUtils.dp2px(getContext(), 12.0f));
    }

    /* access modifiers changed from: private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0018\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0004H\u0016¨\u0006\u000b"}, d2 = {"Lcom/ss/android/lark/mm/module/share/setting/CollaboratorsView$AvatarListAdapter;", "Lcom/ss/android/lark/mm/widget/avatar/AvatarList$AvatarAdapter;", "Lcom/ss/android/lark/mm/module/share/model/User;", "avatarSize", "", "(I)V", "onItemCreated", "", "avatar", "Lcom/ss/android/lark/mm/widget/avatar/Avatar;", "position", "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.share.setting.CollaboratorsView$a */
    public static final class AvatarListAdapter extends AvatarList.AvatarAdapter<User> {
        public AvatarListAdapter() {
            this(0, 1, null);
        }

        public AvatarListAdapter(int i) {
            super(i, null, false, 6, null);
        }

        @Override // com.ss.android.lark.mm.widget.avatar.AvatarList.AvatarAdapter
        /* renamed from: a */
        public void mo165223a(Avatar avatar, int i) {
            Intrinsics.checkParameterIsNotNull(avatar, "avatar");
            User user = (User) getItem(i);
            if (user != null) {
                C45853e.m181659a(avatar, user.getUserId(), user.getAvatarUrl(), user.getAvatarKey());
            }
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ AvatarListAdapter(int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this((i2 & 1) != 0 ? -4 : i);
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public CollaboratorsView(Context context) {
        this(context, null);
        Intrinsics.checkParameterIsNotNull(context, "context");
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.share.setting.CollaboratorsView$b */
    public static final class View$OnClickListenerC47021b implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ Function1 f118352a;

        View$OnClickListenerC47021b(Function1 function1) {
            this.f118352a = function1;
        }

        public final void onClick(View view) {
            C45855f.m181664c("CollaboratorsView", "click avatarList");
            this.f118352a.invoke(false);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.share.setting.CollaboratorsView$c */
    public static final class View$OnClickListenerC47022c implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ Function1 f118353a;

        View$OnClickListenerC47022c(Function1 function1) {
            this.f118353a = function1;
        }

        public final void onClick(View view) {
            C45855f.m181664c("CollaboratorsView", "click invite");
            this.f118353a.invoke(true);
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public CollaboratorsView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Intrinsics.checkParameterIsNotNull(context, "context");
    }

    /* renamed from: a */
    public final void mo165222a(List<User> list, Function1<? super Boolean, Unit> function1) {
        List<User> list2;
        Intrinsics.checkParameterIsNotNull(function1, "onClick");
        UserUtil aVar = UserUtil.f118275a;
        AvatarList.AvatarAdapter<?> adapter = ((AvatarList) mo165221a(R.id.avatarList)).getAdapter();
        if (!(adapter instanceof AvatarListAdapter)) {
            adapter = null;
        }
        AvatarListAdapter aVar2 = (AvatarListAdapter) adapter;
        if (aVar2 != null) {
            list2 = aVar2.mo165679a();
        } else {
            list2 = null;
        }
        if (!aVar.mo164967a(list2, list)) {
            AvatarListAdapter aVar3 = new AvatarListAdapter(0, 1, null);
            aVar3.mo165680a(list);
            ((AvatarList) mo165221a(R.id.avatarList)).setAdapter(aVar3);
        }
        ((AvatarList) mo165221a(R.id.avatarList)).setOnClickListener(new View$OnClickListenerC47021b(function1));
        ((AppCompatImageView) mo165221a(R.id.ivInvite)).setOnClickListener(new View$OnClickListenerC47022c(function1));
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public CollaboratorsView(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
        Intrinsics.checkParameterIsNotNull(context, "context");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CollaboratorsView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        Intrinsics.checkParameterIsNotNull(context, "context");
        m186141a();
    }
}
