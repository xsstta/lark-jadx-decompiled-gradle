package com.ss.android.vc.net.service;

import com.ss.android.lark.chat.export.entity.chatter.OpenChatter;
import com.ss.android.vc.common.p3077b.C60700b;
import java.util.List;

public class VideoChatUserService {
    private static VideoChatUser mCurrentUser;
    private VideoChatUserRole mCurrentUserRole = VideoChatUserRole.UNKNOWN;
    private List<VideoChatUser> mInVideoChatUsers;
    private VideoChatUser mMultiCaller;
    private VideoChatUser mSingleCallee;
    private VideoChatUser mSingleCaller;

    public VideoChatUser getHostUser() {
        return null;
    }

    public void setHostUser(VideoChatUser videoChatUser) {
    }

    public VideoChatUserRole getCurrentUserRole() {
        return this.mCurrentUserRole;
    }

    public List<VideoChatUser> getInVideoChatUserList() {
        return this.mInVideoChatUsers;
    }

    public VideoChatUser getMultiCaller() {
        return this.mMultiCaller;
    }

    public VideoChatUser getSingleCalleeUser() {
        return this.mSingleCallee;
    }

    public VideoChatUser getSingleCallerUser() {
        return this.mSingleCaller;
    }

    public static synchronized VideoChatUser getCurrentUser() {
        VideoChatUser videoChatUser;
        synchronized (VideoChatUserService.class) {
            videoChatUser = mCurrentUser;
        }
        return videoChatUser;
    }

    public VideoChatUser getSingleRemoteUser() {
        if (this.mCurrentUserRole == VideoChatUserRole.SINGLE_CALLER) {
            return this.mSingleCallee;
        }
        return this.mSingleCaller;
    }

    public void setCurrentUserRole(VideoChatUserRole videoChatUserRole) {
        this.mCurrentUserRole = videoChatUserRole;
    }

    public void setInVideoChatUserList(List<VideoChatUser> list) {
        this.mInVideoChatUsers = list;
    }

    public void setMultiCaller(VideoChatUser videoChatUser) {
        this.mMultiCaller = videoChatUser;
    }

    public void setSingleCalleeUser(VideoChatUser videoChatUser) {
        this.mSingleCallee = videoChatUser;
    }

    public void setSingleCallerUser(VideoChatUser videoChatUser) {
        this.mSingleCaller = videoChatUser;
    }

    public static synchronized void assembleCurrentUser(OpenChatter openChatter) {
        synchronized (VideoChatUserService.class) {
            C60700b.m235851b("VideoChatUserService", "[assembleCurrentUser]", "OpenChatter = " + openChatter);
            if (openChatter != null) {
                C60700b.m235851b("VideoChatUserService", "[assembleCurrentUser2]", "userId = " + openChatter.getId());
                mCurrentUser = new VideoChatUser(openChatter.getName(), openChatter.getId(), openChatter.getAvatarKey());
            }
        }
    }
}
