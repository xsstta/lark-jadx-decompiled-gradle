package com.ss.android.vc.entity.breakoutroom;

import com.ss.android.vc.entity.ByteviewUser;
import java.io.Serializable;
import java.util.List;

public class MeetingBroadcastInfo implements Serializable {
    public String broadcastText;
    public List<ByteviewUser> users;
}
