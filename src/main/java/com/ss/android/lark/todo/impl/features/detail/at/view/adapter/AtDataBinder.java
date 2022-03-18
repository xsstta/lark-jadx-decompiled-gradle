package com.ss.android.lark.todo.impl.features.detail.at.view.adapter;

import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.firebase.messaging.Constants;
import com.larksuite.component.ui.avatar.v2.ChatterAvatar;
import com.larksuite.component.ui.avatar.v2.LarkAvatarView;
import com.larksuite.suite.R;
import com.ss.android.lark.todo.impl.features.common.helper.ExternalTagHelper;
import com.ss.android.lark.todo.impl.features.detail.at.view.adapter.AtSelectAdapter;
import com.ss.android.lark.utils.UIHelper;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0014B\r\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J \u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u000eH\u0016J\u0010\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J\u0010\u0010\u0012\u001a\u00020\u00132\u0006\u0010\f\u001a\u00020\u0002H\u0016R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0015"}, d2 = {"Lcom/ss/android/lark/todo/impl/features/detail/at/view/adapter/AtDataBinder;", "Lcom/ss/android/lark/todo/impl/features/detail/at/view/adapter/IAtBinder;", "Lcom/ss/android/lark/todo/impl/features/detail/at/view/adapter/AtDataBean;", "Lcom/ss/android/lark/todo/impl/features/detail/at/view/adapter/AtDataBinder$AtDataViewHolder;", "listener", "Lcom/ss/android/lark/todo/impl/features/detail/at/view/adapter/AtSelectAdapter$OnItemSelectListener;", "(Lcom/ss/android/lark/todo/impl/features/detail/at/view/adapter/AtSelectAdapter$OnItemSelectListener;)V", "getListener", "()Lcom/ss/android/lark/todo/impl/features/detail/at/view/adapter/AtSelectAdapter$OnItemSelectListener;", "bindData", "", "holder", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "position", "", "createViewHolder", "parent", "Landroid/view/ViewGroup;", "getHeaderId", "", "AtDataViewHolder", "todo_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.todo.impl.features.detail.at.view.adapter.b */
public final class AtDataBinder implements IAtBinder<AtDataBean, AtDataViewHolder> {

    /* renamed from: a */
    private final AtSelectAdapter.OnItemSelectListener f139679a;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\r\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\f¨\u0006\u000f"}, d2 = {"Lcom/ss/android/lark/todo/impl/features/detail/at/view/adapter/AtDataBinder$AtDataViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "view", "Landroid/view/View;", "(Landroid/view/View;)V", "mAvatar", "Lcom/larksuite/component/ui/avatar/v2/LarkAvatarView;", "getMAvatar", "()Lcom/larksuite/component/ui/avatar/v2/LarkAvatarView;", "mDesc", "Landroid/widget/TextView;", "getMDesc", "()Landroid/widget/TextView;", "mTitle", "getMTitle", "todo_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.detail.at.view.adapter.b$a */
    public static final class AtDataViewHolder extends RecyclerView.ViewHolder {

        /* renamed from: a */
        private final TextView f139680a;

        /* renamed from: b */
        private final TextView f139681b;

        /* renamed from: c */
        private final LarkAvatarView f139682c;

        /* renamed from: a */
        public final TextView mo192288a() {
            return this.f139680a;
        }

        /* renamed from: b */
        public final TextView mo192289b() {
            return this.f139681b;
        }

        /* renamed from: c */
        public final LarkAvatarView mo192290c() {
            return this.f139682c;
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public AtDataViewHolder(View view) {
            super(view);
            Intrinsics.checkParameterIsNotNull(view, "view");
            View findViewById = view.findViewById(R.id.title);
            Intrinsics.checkExpressionValueIsNotNull(findViewById, "view.findViewById(R.id.title)");
            this.f139680a = (TextView) findViewById;
            View findViewById2 = view.findViewById(R.id.desc);
            Intrinsics.checkExpressionValueIsNotNull(findViewById2, "view.findViewById(R.id.desc)");
            this.f139681b = (TextView) findViewById2;
            View findViewById3 = view.findViewById(R.id.avatar);
            Intrinsics.checkExpressionValueIsNotNull(findViewById3, "view.findViewById(R.id.avatar)");
            this.f139682c = (LarkAvatarView) findViewById3;
        }
    }

    /* renamed from: a */
    public final AtSelectAdapter.OnItemSelectListener mo192284a() {
        return this.f139679a;
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005¨\u0006\u0006"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick", "com/ss/android/lark/todo/impl/features/detail/at/view/adapter/AtDataBinder$bindData$1$2"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.detail.at.view.adapter.b$b */
    public static final class View$OnClickListenerC56471b implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ AtDataBinder f139683a;

        /* renamed from: b */
        final /* synthetic */ AtDataBean f139684b;

        View$OnClickListenerC56471b(AtDataBinder bVar, AtDataBean aVar) {
            this.f139683a = bVar;
            this.f139684b = aVar;
        }

        public final void onClick(View view) {
            this.f139683a.mo192284a().mo192268a(this.f139684b);
        }
    }

    public AtDataBinder(AtSelectAdapter.OnItemSelectListener bVar) {
        Intrinsics.checkParameterIsNotNull(bVar, "listener");
        this.f139679a = bVar;
    }

    /* renamed from: a */
    public long mo192281a(AtDataBean aVar) {
        Intrinsics.checkParameterIsNotNull(aVar, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
        return (long) aVar.mo192274c();
    }

    /* renamed from: a */
    public AtDataViewHolder mo192287b(ViewGroup viewGroup) {
        Intrinsics.checkParameterIsNotNull(viewGroup, "parent");
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.todo_detail_at_data_item, viewGroup, false);
        Intrinsics.checkExpressionValueIsNotNull(inflate, "view");
        inflate.setLayoutParams(new RecyclerView.LayoutParams(-1, UIHelper.dp2px(64.0f)));
        return new AtDataViewHolder(inflate);
    }

    /* renamed from: a */
    public void mo192285a(AtDataViewHolder aVar, AtDataBean aVar2, int i) {
        Intrinsics.checkParameterIsNotNull(aVar, "holder");
        Intrinsics.checkParameterIsNotNull(aVar2, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
        View view = aVar.itemView;
        Intrinsics.checkExpressionValueIsNotNull(view, "it.itemView");
        view.setVisibility(0);
        aVar.mo192288a().setText(aVar2.mo192277e());
        ExternalTagHelper.f139400a.mo192001a(aVar.mo192288a(), aVar2.mo192280h());
        if (TextUtils.isEmpty(aVar2.mo192278f())) {
            aVar.mo192289b().setVisibility(8);
        } else {
            aVar.mo192289b().setText(aVar2.mo192278f());
            aVar.mo192289b().setVisibility(0);
        }
        aVar.mo192290c().mo89076a(((ChatterAvatar.Builder) ((ChatterAvatar.Builder) new ChatterAvatar.Builder().mo89081c(aVar2.mo192276d()).mo88967b(aVar2.mo192276d())).mo88962a(aVar2.mo192279g())).mo88976k());
        aVar.itemView.setOnClickListener(new View$OnClickListenerC56471b(this, aVar2));
    }
}
