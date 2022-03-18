package com.ss.android.vc.meeting.module.subtitle.filter;

import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.larksuite.component.ui.imageview.LKUIRoundedImageView;
import com.larksuite.suite.R;
import com.ss.android.lark.base.adapter.LarkRecyclerViewBaseAdapter;
import com.ss.android.lark.utils.C57782ag;
import com.ss.android.vc.common.p3083e.C60773o;
import com.ss.android.vc.common.p3083e.C60783v;
import com.ss.android.vc.common.widget.IconFontView;
import com.ss.android.vc.entity.ByteviewUser;
import com.ss.android.vc.meeting.framework.manager.MeetingUtil;
import com.ss.android.vc.net.service.GetUserInfoListener;
import com.ss.android.vc.net.service.UserInfoService;
import com.ss.android.vc.net.service.VideoChatUser;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u0012\u0012\b\u0012\u00060\u0002R\u00020\u0000\u0012\u0004\u0012\u00020\u00030\u0001:\u0002\u0019\u001aB\u0005¢\u0006\u0002\u0010\u0004J\u001c\u0010\n\u001a\u00020\u000b2\n\u0010\f\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\r\u001a\u00020\u000eH\u0016J\u001c\u0010\u000f\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u000eH\u0016J\u0010\u0010\u0013\u001a\u00020\u000b2\b\u0010\u0014\u001a\u0004\u0018\u00010\bJ\u000e\u0010\u0015\u001a\u00020\u000b2\u0006\u0010\u0016\u001a\u00020\u0006J\u0010\u0010\u0017\u001a\u00020\u000b2\b\u0010\u0018\u001a\u0004\u0018\u00010\bR\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\bX\u000e¢\u0006\u0002\n\u0000¨\u0006\u001b"}, d2 = {"Lcom/ss/android/vc/meeting/module/subtitle/filter/UserSelectAdapter;", "Lcom/ss/android/lark/base/adapter/LarkRecyclerViewBaseAdapter;", "Lcom/ss/android/vc/meeting/module/subtitle/filter/UserSelectAdapter$UserItemViewHolder;", "Lcom/ss/android/vc/entity/ByteviewUser;", "()V", "mListener", "Lcom/ss/android/vc/meeting/module/subtitle/filter/UserSelectAdapter$UserSelectListener;", "mMeetingId", "", "mSelectedUserId", "onBindViewHolder", "", "holder", "position", "", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "setMeetingId", "id", "setOnGroupSelectListener", "listener", "setSelectedUser", "uid", "UserItemViewHolder", "UserSelectListener", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.vc.meeting.module.subtitle.a.b */
public final class UserSelectAdapter extends LarkRecyclerViewBaseAdapter<UserItemViewHolder, ByteviewUser> {

    /* renamed from: a */
    public UserSelectListener f159087a;

    /* renamed from: b */
    public String f159088b;

    /* renamed from: c */
    public String f159089c;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, d2 = {"Lcom/ss/android/vc/meeting/module/subtitle/filter/UserSelectAdapter$UserSelectListener;", "", "onUserSelected", "", "user", "Lcom/ss/android/vc/entity/ByteviewUser;", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.meeting.module.subtitle.a.b$b */
    public interface UserSelectListener {
        /* renamed from: a */
        void mo218576a(ByteviewUser byteviewUser);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000b"}, d2 = {"Lcom/ss/android/vc/meeting/module/subtitle/filter/UserSelectAdapter$UserItemViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "view", "Landroid/view/View;", "(Lcom/ss/android/vc/meeting/module/subtitle/filter/UserSelectAdapter;Landroid/view/View;)V", "getView", "()Landroid/view/View;", "bindItem", "", "position", "", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.meeting.module.subtitle.a.b$a */
    public final class UserItemViewHolder extends RecyclerView.ViewHolder {

        /* renamed from: a */
        final /* synthetic */ UserSelectAdapter f159090a;

        /* renamed from: b */
        private final View f159091b;

        /* renamed from: a */
        public final View mo218585a() {
            return this.f159091b;
        }

        /* access modifiers changed from: package-private */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.ss.android.vc.meeting.module.subtitle.a.b$a$b */
        public static final class View$OnClickListenerC63128b implements View.OnClickListener {

            /* renamed from: a */
            final /* synthetic */ UserItemViewHolder f159093a;

            /* renamed from: b */
            final /* synthetic */ ByteviewUser f159094b;

            View$OnClickListenerC63128b(UserItemViewHolder aVar, ByteviewUser byteviewUser) {
                this.f159093a = aVar;
                this.f159094b = byteviewUser;
            }

            public final void onClick(View view) {
                UserSelectAdapter bVar = this.f159093a.f159090a;
                ByteviewUser byteviewUser = this.f159094b;
                Intrinsics.checkExpressionValueIsNotNull(byteviewUser, "user");
                bVar.f159088b = byteviewUser.getUserId();
                this.f159093a.f159090a.notifyDataSetChanged();
                UserSelectListener bVar2 = this.f159093a.f159090a.f159087a;
                if (bVar2 != null) {
                    ByteviewUser byteviewUser2 = this.f159094b;
                    Intrinsics.checkExpressionValueIsNotNull(byteviewUser2, "user");
                    bVar2.mo218576a(byteviewUser2);
                }
            }
        }

        /* access modifiers changed from: package-private */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "userInfo", "Lcom/ss/android/vc/net/service/VideoChatUser;", "kotlin.jvm.PlatformType", "onGetUserInfo"}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.ss.android.vc.meeting.module.subtitle.a.b$a$a */
        public static final class C63127a implements GetUserInfoListener {

            /* renamed from: a */
            final /* synthetic */ UserItemViewHolder f159092a;

            C63127a(UserItemViewHolder aVar) {
                this.f159092a = aVar;
            }

            @Override // com.ss.android.vc.net.service.GetUserInfoListener
            public final void onGetUserInfo(VideoChatUser videoChatUser) {
                String str;
                TextView textView = (TextView) this.f159092a.mo218585a().findViewById(R.id.userName);
                Intrinsics.checkExpressionValueIsNotNull(textView, "view.userName");
                Intrinsics.checkExpressionValueIsNotNull(videoChatUser, "userInfo");
                if (TextUtils.isEmpty(videoChatUser.getName())) {
                    str = videoChatUser.getNickname();
                } else {
                    str = videoChatUser.getName();
                }
                textView.setText(str);
                C60783v.m236230a(videoChatUser.getAvatarKey(), videoChatUser.getId(), videoChatUser.getType(), (LKUIRoundedImageView) this.f159092a.mo218585a().findViewById(R.id.userAvatar), 32, 32);
            }
        }

        /* renamed from: a */
        public final void mo218586a(int i) {
            ByteviewUser byteviewUser = (ByteviewUser) this.f159090a.getItem(i);
            if (MeetingUtil.m238368a(this.f159090a.f159089c, byteviewUser, MeetingUtil.IdType.DeviceId)) {
                C60783v.m236226a((int) R.drawable.icon_interviewer_avatar, (LKUIRoundedImageView) this.f159091b.findViewById(R.id.userAvatar));
                TextView textView = (TextView) this.f159091b.findViewById(R.id.userName);
                Intrinsics.checkExpressionValueIsNotNull(textView, "view.userName");
                textView.setText(C60773o.m236119a((int) R.string.View_M_Interviewer));
            } else {
                String str = this.f159090a.f159089c;
                Intrinsics.checkExpressionValueIsNotNull(byteviewUser, "user");
                UserInfoService.getUserInfoById(str, byteviewUser.getUserId(), byteviewUser.getParticipantType(), new C63127a(this));
            }
            String str2 = this.f159090a.f159088b;
            Intrinsics.checkExpressionValueIsNotNull(byteviewUser, "user");
            if (C57782ag.m224242a(str2, byteviewUser.getUserId())) {
                IconFontView iconFontView = (IconFontView) this.f159091b.findViewById(R.id.userSelectImage);
                Intrinsics.checkExpressionValueIsNotNull(iconFontView, "view.userSelectImage");
                iconFontView.setVisibility(0);
                ((TextView) this.f159091b.findViewById(R.id.userName)).setTextColor(C60773o.m236126d(R.color.primary_pri_500));
            } else {
                IconFontView iconFontView2 = (IconFontView) this.f159091b.findViewById(R.id.userSelectImage);
                Intrinsics.checkExpressionValueIsNotNull(iconFontView2, "view.userSelectImage");
                iconFontView2.setVisibility(8);
                ((TextView) this.f159091b.findViewById(R.id.userName)).setTextColor(C60773o.m236126d(R.color.text_title));
            }
            this.f159091b.setOnClickListener(new View$OnClickListenerC63128b(this, byteviewUser));
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public UserItemViewHolder(UserSelectAdapter bVar, View view) {
            super(view);
            Intrinsics.checkParameterIsNotNull(view, "view");
            this.f159090a = bVar;
            this.f159091b = view;
        }
    }

    /* renamed from: a */
    public final void mo218583a(String str) {
        this.f159088b = str;
    }

    /* renamed from: b */
    public final void mo218584b(String str) {
        this.f159089c = str;
    }

    /* renamed from: a */
    public final void mo218582a(UserSelectListener bVar) {
        Intrinsics.checkParameterIsNotNull(bVar, "listener");
        this.f159087a = bVar;
    }

    /* renamed from: a */
    public void onBindViewHolder(UserItemViewHolder aVar, int i) {
        Intrinsics.checkParameterIsNotNull(aVar, "holder");
        aVar.mo218586a(i);
    }

    /* renamed from: a */
    public UserItemViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        Intrinsics.checkParameterIsNotNull(viewGroup, "parent");
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_user_select, viewGroup, false);
        Intrinsics.checkExpressionValueIsNotNull(inflate, "view");
        return new UserItemViewHolder(this, inflate);
    }
}
