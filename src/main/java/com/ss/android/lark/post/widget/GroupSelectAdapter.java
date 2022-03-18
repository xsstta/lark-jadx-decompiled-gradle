package com.ss.android.lark.post.widget;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.larksuite.component.ui.imageview.LKUIRoundedImageView;
import com.larksuite.component.universe_design.checkbox.UDCheckBox;
import com.larksuite.suite.R;
import com.ss.android.lark.appreciablelib.Scene;
import com.ss.android.lark.base.adapter.LarkRecyclerViewBaseAdapter;
import com.ss.android.lark.biz.im.api.C29607af;
import com.ss.android.lark.chat.entity.chat.Chat;
import com.ss.android.lark.chat.entity.thread.TopicGroup;
import com.ss.android.lark.chat.utils.C34336c;
import com.ss.android.lark.utils.UIHelper;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u0012\u0012\b\u0012\u00060\u0002R\u00020\u0000\u0012\u0004\u0012\u00020\u00030\u0001:\u0002\u001b\u001cB\u0005¢\u0006\u0002\u0010\u0004J\u001c\u0010\u000b\u001a\u00020\f2\n\u0010\r\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\u001c\u0010\u0010\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u000fH\u0016J\u000e\u0010\u0014\u001a\u00020\f2\u0006\u0010\u0015\u001a\u00020\u0006J\u000e\u0010\u0016\u001a\u00020\f2\u0006\u0010\u0017\u001a\u00020\bJ\u000e\u0010\u0018\u001a\u00020\f2\u0006\u0010\u0019\u001a\u00020\u001aR\u000e\u0010\u0005\u001a\u00020\u0006X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u000e¢\u0006\u0002\n\u0000¨\u0006\u001d"}, d2 = {"Lcom/ss/android/lark/post/widget/GroupSelectAdapter;", "Lcom/ss/android/lark/base/adapter/LarkRecyclerViewBaseAdapter;", "Lcom/ss/android/lark/post/widget/GroupSelectAdapter$GroupItemViewHolder;", "Lcom/ss/android/lark/biz/im/api/TopicGroupChat;", "()V", "mIsShowRadioButton", "", "mListener", "Lcom/ss/android/lark/post/widget/GroupSelectAdapter$GroupSelectListener;", "mSelectedGroupId", "", "onBindViewHolder", "", "holder", "position", "", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "setIsShowRadioButton", "isShow", "setOnGroupSelectListener", "listener", "setSelectedGroup", "chat", "Lcom/ss/android/lark/chat/entity/chat/Chat;", "GroupItemViewHolder", "GroupSelectListener", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.post.b.a */
public final class GroupSelectAdapter extends LarkRecyclerViewBaseAdapter<GroupItemViewHolder, C29607af> {

    /* renamed from: a */
    public GroupSelectListener f129470a;

    /* renamed from: b */
    public boolean f129471b;

    /* renamed from: c */
    public String f129472c = "";

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, d2 = {"Lcom/ss/android/lark/post/widget/GroupSelectAdapter$GroupSelectListener;", "", "onGroupSelected", "", "topicGroup", "Lcom/ss/android/lark/biz/im/api/TopicGroupChat;", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.post.b.a$b */
    public interface GroupSelectListener {
        /* renamed from: a */
        void mo178721a(C29607af afVar);
    }

    /* renamed from: a */
    public final void mo178718a(boolean z) {
        this.f129471b = z;
    }

    /* renamed from: a */
    public final void mo178717a(GroupSelectListener bVar) {
        Intrinsics.checkParameterIsNotNull(bVar, "listener");
        this.f129470a = bVar;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000b"}, d2 = {"Lcom/ss/android/lark/post/widget/GroupSelectAdapter$GroupItemViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "view", "Landroid/view/View;", "(Lcom/ss/android/lark/post/widget/GroupSelectAdapter;Landroid/view/View;)V", "getView", "()Landroid/view/View;", "bindItem", "", "position", "", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.post.b.a$a */
    public final class GroupItemViewHolder extends RecyclerView.ViewHolder {

        /* renamed from: a */
        final /* synthetic */ GroupSelectAdapter f129473a;

        /* renamed from: b */
        private final View f129474b;

        /* access modifiers changed from: package-private */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.post.b.a$a$a */
        public static final class View$OnClickListenerC52181a implements View.OnClickListener {

            /* renamed from: a */
            final /* synthetic */ GroupItemViewHolder f129475a;

            /* renamed from: b */
            final /* synthetic */ C29607af f129476b;

            View$OnClickListenerC52181a(GroupItemViewHolder aVar, C29607af afVar) {
                this.f129475a = aVar;
                this.f129476b = afVar;
            }

            public final void onClick(View view) {
                if (this.f129475a.f129473a.f129471b) {
                    GroupSelectAdapter aVar = this.f129475a.f129473a;
                    C29607af afVar = this.f129476b;
                    Intrinsics.checkExpressionValueIsNotNull(afVar, "groupData");
                    String id = afVar.mo106680a().getId();
                    Intrinsics.checkExpressionValueIsNotNull(id, "groupData.chat.getId()");
                    aVar.f129472c = id;
                    this.f129475a.f129473a.notifyDataSetChanged();
                }
                GroupSelectListener bVar = this.f129475a.f129473a.f129470a;
                if (bVar != null) {
                    C29607af afVar2 = this.f129476b;
                    Intrinsics.checkExpressionValueIsNotNull(afVar2, "groupData");
                    bVar.mo178721a(afVar2);
                }
            }
        }

        /* renamed from: a */
        public final void mo178719a(int i) {
            Scene scene;
            C29607af afVar = (C29607af) this.f129473a.getItem(i);
            TextView textView = (TextView) this.f129474b.findViewById(R.id.groupName);
            Intrinsics.checkExpressionValueIsNotNull(textView, "view.groupName");
            Intrinsics.checkExpressionValueIsNotNull(afVar, "groupData");
            textView.setText(afVar.mo106680a().getName());
            TopicGroup b = afVar.mo106681b();
            Intrinsics.checkExpressionValueIsNotNull(b, "groupData.topicGroup");
            if (b.getType() == TopicGroup.Type.DEFAULT) {
                TextView textView2 = (TextView) this.f129474b.findViewById(R.id.groupDescription);
                Intrinsics.checkExpressionValueIsNotNull(textView2, "view.groupDescription");
                textView2.setVisibility(0);
                TextView textView3 = (TextView) this.f129474b.findViewById(R.id.topic_group_tag);
                Intrinsics.checkExpressionValueIsNotNull(textView3, "view.topic_group_tag");
                textView3.setVisibility(0);
            } else {
                TextView textView4 = (TextView) this.f129474b.findViewById(R.id.groupDescription);
                Intrinsics.checkExpressionValueIsNotNull(textView4, "view.groupDescription");
                textView4.setVisibility(8);
                TextView textView5 = (TextView) this.f129474b.findViewById(R.id.topic_group_tag);
                Intrinsics.checkExpressionValueIsNotNull(textView5, "view.topic_group_tag");
                textView5.setVisibility(8);
            }
            String avatarKey = afVar.mo106680a().getAvatarKey();
            Intrinsics.checkExpressionValueIsNotNull(avatarKey, "groupData.chat.getAvatarKey()");
            String id = afVar.mo106680a().getId();
            Intrinsics.checkExpressionValueIsNotNull(id, "groupData.chat.getId()");
            if (afVar.mo106680a().isSecret()) {
                scene = Scene.SecretChat;
            } else {
                Chat a = afVar.mo106680a();
                Intrinsics.checkExpressionValueIsNotNull(a, "groupData.chat");
                if (a.isThread()) {
                    scene = Scene.Thread;
                } else {
                    scene = Scene.Chat;
                }
            }
            C34336c.m133130a(this.f129474b.getContext(), (LKUIRoundedImageView) this.f129474b.findViewById(R.id.groupAvatar), avatarKey, id, UIHelper.dp2px(48.0f), UIHelper.dp2px(48.0f), scene);
            if (this.f129473a.f129471b) {
                UDCheckBox uDCheckBox = (UDCheckBox) this.f129474b.findViewById(R.id.groupSelectImage);
                Intrinsics.checkExpressionValueIsNotNull(uDCheckBox, "view.groupSelectImage");
                uDCheckBox.setVisibility(0);
                UDCheckBox uDCheckBox2 = (UDCheckBox) this.f129474b.findViewById(R.id.groupSelectImage);
                Intrinsics.checkExpressionValueIsNotNull(uDCheckBox2, "view.groupSelectImage");
                uDCheckBox2.setChecked(Intrinsics.areEqual(this.f129473a.f129472c, afVar.mo106680a().getId()));
            } else {
                UDCheckBox uDCheckBox3 = (UDCheckBox) this.f129474b.findViewById(R.id.groupSelectImage);
                Intrinsics.checkExpressionValueIsNotNull(uDCheckBox3, "view.groupSelectImage");
                uDCheckBox3.setVisibility(8);
            }
            this.f129474b.setOnClickListener(new View$OnClickListenerC52181a(this, afVar));
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public GroupItemViewHolder(GroupSelectAdapter aVar, View view) {
            super(view);
            Intrinsics.checkParameterIsNotNull(view, "view");
            this.f129473a = aVar;
            this.f129474b = view;
        }
    }

    /* renamed from: a */
    public final void mo178715a(Chat chat) {
        Intrinsics.checkParameterIsNotNull(chat, "chat");
        String id = chat.getId();
        Intrinsics.checkExpressionValueIsNotNull(id, "chat.getId()");
        this.f129472c = id;
    }

    /* renamed from: a */
    public void onBindViewHolder(GroupItemViewHolder aVar, int i) {
        Intrinsics.checkParameterIsNotNull(aVar, "holder");
        aVar.mo178719a(i);
    }

    /* renamed from: a */
    public GroupItemViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        Intrinsics.checkParameterIsNotNull(viewGroup, "parent");
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_thread_group_select, viewGroup, false);
        Intrinsics.checkExpressionValueIsNotNull(inflate, "view");
        return new GroupItemViewHolder(this, inflate);
    }
}
