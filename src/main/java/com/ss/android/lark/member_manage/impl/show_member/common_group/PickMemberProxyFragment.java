package com.ss.android.lark.member_manage.impl.show_member.common_group;

import android.app.Fragment;
import android.content.Intent;
import com.larksuite.framework.callback.IGetDataCallback;
import com.ss.android.lark.chat.entity.chatter.ChatChatter;
import java.util.List;

public class PickMemberProxyFragment extends Fragment {

    /* renamed from: a */
    private IGetDataCallback<List<ChatChatter>> f114386a;

    /* renamed from: a */
    public void mo159733a(IGetDataCallback<List<ChatChatter>> iGetDataCallback, Intent intent) {
        if (getActivity() != null) {
            this.f114386a = iGetDataCallback;
            startActivityForResult(intent, 4096);
        }
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        IGetDataCallback<List<ChatChatter>> iGetDataCallback;
        super.onActivityResult(i, i2, intent);
        if (i == 4096 && (iGetDataCallback = this.f114386a) != null && i2 == -1) {
            iGetDataCallback.onSuccess((List) intent.getSerializableExtra("result_key_checked_chatters"));
        }
    }
}
