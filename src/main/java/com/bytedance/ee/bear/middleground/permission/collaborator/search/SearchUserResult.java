package com.bytedance.ee.bear.middleground.permission.collaborator.search;

import com.bytedance.ee.bear.contract.NetService;
import com.bytedance.ee.bear.middleground.permission.collaborator.invite.existmember.Member;
import com.bytedance.ee.bear.share.export.UserInfo;
import java.util.ArrayList;
import java.util.List;

public class SearchUserResult extends NetService.Result {
    public List<Member> existMembers = new ArrayList();
    public boolean hasMore = false;
    public boolean isRealUser = false;
    public boolean isRecent = false;
    public boolean isValid = false;
    public ArrayList<UserInfo> list = new ArrayList<>();
    public boolean refresh = true;
}
