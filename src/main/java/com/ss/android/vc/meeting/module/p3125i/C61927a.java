package com.ss.android.vc.meeting.module.p3125i;

import com.larksuite.framework.utils.CollectionUtils;
import com.ss.android.lark.pb.videoconference.v1.FollowGrootCellPayload;
import com.ss.android.lark.pb.videoconference.v1.GrootCell;
import com.ss.android.lark.pb.videoconference.v1.SketchGrootCellPayload;
import com.ss.android.lark.pb.videoconference.v1.VCTabListGrootCellPayload;
import com.ss.android.lark.pb.videoconference.v1.VCTabMeetingGrootCellPayload;
import com.ss.android.lark.pb.videoconference.v1.VCTabUserGrootCellPayload;
import com.ss.android.vc.entity.ChannelMeta;
import com.ss.android.vc.entity.GrootCell;
import com.ss.android.vc.entity.PushGrootCells;
import com.ss.android.vc.entity.p3092a.C60930c;
import java.io.IOException;
import java.util.ArrayList;

/* renamed from: com.ss.android.vc.meeting.module.i.a */
public class C61927a {
    /* renamed from: a */
    public static PushGrootCells m241915a(com.ss.android.lark.pb.videoconference.v1.PushGrootCells pushGrootCells) {
        PushGrootCells pushGrootCells2 = new PushGrootCells();
        if (pushGrootCells.channel_meta != null) {
            ChannelMeta channelMeta = new ChannelMeta();
            channelMeta.grootChannel = ChannelMeta.GrootChannel.fromValue(pushGrootCells.channel_meta.channel.getValue());
            channelMeta.channelId = pushGrootCells.channel_meta.channel_id;
            pushGrootCells2.channel_meta = channelMeta;
        }
        if (!CollectionUtils.isEmpty(pushGrootCells.cells)) {
            pushGrootCells2.cells = new ArrayList();
            for (GrootCell grootCell : pushGrootCells.cells) {
                com.ss.android.vc.entity.GrootCell grootCell2 = new com.ss.android.vc.entity.GrootCell();
                grootCell2.action = GrootCell.Action.fromValue(grootCell.action.getValue());
                grootCell2.payload = grootCell.payload;
                if (grootCell2.payload != null) {
                    try {
                        if (pushGrootCells2.channel_meta.grootChannel == ChannelMeta.GrootChannel.SKETCH) {
                            grootCell2.sketchGrootCellPayload = C60930c.m236896a(SketchGrootCellPayload.ADAPTER.decode(grootCell.payload));
                        } else if (pushGrootCells2.channel_meta.grootChannel == ChannelMeta.GrootChannel.FOLLOW) {
                            grootCell2.followGrootCellPayload = C60930c.m236888a(FollowGrootCellPayload.ADAPTER.decode(grootCell.payload));
                        } else if (pushGrootCells2.channel_meta.grootChannel == ChannelMeta.GrootChannel.VC_TAB_USER_CHANNEL) {
                            grootCell2.vcTabUserGrootCellPayload = C60930c.m236986a(VCTabUserGrootCellPayload.ADAPTER.decode(grootCell.payload));
                        } else if (pushGrootCells2.channel_meta.grootChannel == ChannelMeta.GrootChannel.VC_TAB_MEETING_CHANNEL) {
                            grootCell2.vcTabMeetingGrootCellPayload = C60930c.m236990a(VCTabMeetingGrootCellPayload.ADAPTER.decode(grootCell.payload));
                        } else if (pushGrootCells2.channel_meta.grootChannel == ChannelMeta.GrootChannel.VC_TAB_LIST_CHANNEL) {
                            grootCell2.vcTabListHistoryChangeInfo = C60930c.m236977a(VCTabListGrootCellPayload.ADAPTER.decode(grootCell.payload));
                        }
                    } catch (IOException unused) {
                    }
                }
                pushGrootCells2.cells.add(grootCell2);
            }
        }
        return pushGrootCells2;
    }
}
