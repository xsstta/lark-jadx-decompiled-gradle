package com.ss.android.vc.meeting.module.follow.common;

import androidx.lifecycle.C1177w;
import androidx.lifecycle.LiveData;
import com.ss.android.vc.entity.follow.FollowInfo;
import java.util.Stack;

public class FollowLinkStack extends Stack<FollowInfo> {
    private C1177w<Integer> followLinkStackSize;
    public LiveData<Integer> mFollowLinkStackSize;

    public LiveData<Integer> getFollowLinkNumLiveData() {
        return this.mFollowLinkStackSize;
    }

    public FollowLinkStack() {
        C1177w<Integer> wVar = new C1177w<>();
        this.followLinkStackSize = wVar;
        this.mFollowLinkStackSize = wVar;
        wVar.mo5926a((Integer) 0);
    }

    public void clear() {
        super.clear();
        this.followLinkStackSize.mo5926a(Integer.valueOf(size()));
    }

    @Override // java.util.Stack
    public FollowInfo pop() {
        FollowInfo followInfo = (FollowInfo) super.pop();
        this.followLinkStackSize.mo5926a(Integer.valueOf(size()));
        return followInfo;
    }

    public FollowInfo push(FollowInfo followInfo) {
        FollowInfo followInfo2 = (FollowInfo) super.push((Object) followInfo);
        this.followLinkStackSize.mo5926a(Integer.valueOf(size()));
        return followInfo2;
    }
}
