package com.ss.android.lark.chatsetting.impl.group.setting;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import com.larksuite.component.ui.imageview.LKUIRoundedImageView;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.chat.entity.chatter.Chatter;
import com.ss.android.lark.chatsetting.ChatSettingModule;
import com.ss.android.lark.chatsetting.p1693a.AbstractC34461c;
import com.ss.android.lark.utils.UIHelper;

/* renamed from: com.ss.android.lark.chatsetting.impl.group.setting.e */
public class C34945e {

    /* renamed from: a */
    private static final int f90217a = UIHelper.dp2px(32.0f);

    /* renamed from: b */
    private int f90218b;

    /* renamed from: c */
    private Context f90219c;

    /* renamed from: d */
    private Chatter f90220d;

    /* renamed from: e */
    private C34946a f90221e;

    /* renamed from: a */
    public int mo128870a() {
        return this.f90218b;
    }

    /* renamed from: b */
    public Chatter mo128875b() {
        return this.f90220d;
    }

    /* renamed from: c */
    public static int m136037c() {
        return (UIHelper.getWindowWidth(UIHelper.getContext()) - UIUtils.dp2px(ChatSettingModule.m133639a().mo127295y(), 50.0f)) / (f90217a + UIUtils.dp2px(ChatSettingModule.m133639a().mo127295y(), 12.0f));
    }

    /* renamed from: com.ss.android.lark.chatsetting.impl.group.setting.e$a */
    class C34946a {

        /* renamed from: a */
        GroupMemberAvatarView f90222a;

        C34946a() {
        }
    }

    public C34945e(Context context) {
        this.f90219c = context;
    }

    /* renamed from: a */
    public void mo128872a(int i) {
        this.f90218b = i;
    }

    /* renamed from: a */
    public void mo128873a(Chatter chatter) {
        this.f90220d = chatter;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean mo128874a(View view, Class<?> cls) {
        Object tag = view.getTag();
        if (tag != null && cls.isInstance(tag)) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public View mo128871a(View view, ViewGroup viewGroup) {
        if (view == null || !mo128874a(view, C34946a.class)) {
            this.f90221e = new C34946a();
            view = new GroupMemberAvatarView(this.f90219c);
            this.f90221e.f90222a = (GroupMemberAvatarView) view;
            GroupMemberAvatarView groupMemberAvatarView = this.f90221e.f90222a;
            int i = f90217a;
            groupMemberAvatarView.setLayoutParams(new AbsListView.LayoutParams(i, i));
        } else {
            this.f90221e = (C34946a) view.getTag();
        }
        int i2 = this.f90218b;
        if (i2 == 1) {
            AbstractC34461c.AbstractC34474m i3 = ChatSettingModule.m133639a().mo127279i();
            Context context = this.f90219c;
            String avatarKey = this.f90220d.getAvatarKey();
            String id = this.f90220d.getId();
            LKUIRoundedImageView avatarIV = this.f90221e.f90222a.getAvatarIV();
            int i4 = f90217a;
            i3.mo127409a(context, avatarKey, id, avatarIV, i4, i4);
        } else if (i2 == 2) {
            this.f90221e.f90222a.setImageResource(R.drawable.icon_group_increase_member_redesign);
        } else if (i2 == 3) {
            this.f90221e.f90222a.setImageResource(R.drawable.icon_group_remove_member);
        }
        return view;
    }
}
