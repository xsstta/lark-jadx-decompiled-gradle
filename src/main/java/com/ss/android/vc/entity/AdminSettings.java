package com.ss.android.vc.entity;

import com.ss.android.vc.entity.background.MeetingBackground;
import java.io.Serializable;
import java.util.List;

public class AdminSettings implements Serializable {
    public boolean canPersonalInstall;
    public boolean enableCheckScreenShare;
    public boolean enableCustomMeetingBackground;
    public boolean enableMeetingBackground;
    public boolean enableRecord;
    public boolean enableSubtitile;
    public boolean enableVirtualAvatar;
    public List<MeetingBackground> meetingBackgroundList;
    public RTCProxy proxy;
    public boolean pstnEnableIncomingCall;
    public boolean pstnEnableOutgoingCall;
    public boolean pstnHidePhoneNumber;
    public List<String> pstnIncomingCallCountryDefault;
    public List<PSTNPhone> pstnIncomingCallPhoneList;
    public boolean pstnJoinMeetingPrompt;
    public List<String> pstnOutgoingCallCountryDefault;
    public List<String> pstnOutgoingCallCountryList;

    public String toString() {
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        StringBuilder sb = new StringBuilder();
        sb.append("AdminSettings{enableRecord=");
        sb.append(this.enableRecord);
        sb.append(", enableSubtitile=");
        sb.append(this.enableSubtitile);
        sb.append(", pstnEnableOutgoingCall=");
        sb.append(this.pstnEnableOutgoingCall);
        sb.append(", pstnHidePhoneNumber=");
        sb.append(this.pstnHidePhoneNumber);
        sb.append(", pstnEnableIncomingCall=");
        sb.append(this.pstnEnableIncomingCall);
        sb.append(", pstnIncomingCallCountryDefault size =");
        List<String> list = this.pstnIncomingCallCountryDefault;
        Object obj5 = "0";
        if (list == null) {
            obj = obj5;
        } else {
            obj = Integer.valueOf(list.size());
        }
        sb.append(obj);
        sb.append(", pstnIncomingCallPhoneList size =");
        List<PSTNPhone> list2 = this.pstnIncomingCallPhoneList;
        if (list2 == null) {
            obj2 = obj5;
        } else {
            obj2 = Integer.valueOf(list2.size());
        }
        sb.append(obj2);
        sb.append(", pstnOutgoingCallCountryDefault size =");
        List<String> list3 = this.pstnOutgoingCallCountryDefault;
        if (list3 == null) {
            obj3 = obj5;
        } else {
            obj3 = Integer.valueOf(list3.size());
        }
        sb.append(obj3);
        sb.append(", pstnOutgoingCallCountryList size=");
        List<String> list4 = this.pstnOutgoingCallCountryList;
        if (list4 == null) {
            obj4 = obj5;
        } else {
            obj4 = Integer.valueOf(list4.size());
        }
        sb.append(obj4);
        sb.append(", pstnJoinMeetingPrompt=");
        sb.append(this.pstnJoinMeetingPrompt);
        sb.append(", enableMeetingBackground=");
        sb.append(this.enableMeetingBackground);
        sb.append(", enableCustomMeetingBackground=");
        sb.append(this.enableCustomMeetingBackground);
        sb.append(", enableVirtualAvatar=");
        sb.append(this.enableVirtualAvatar);
        sb.append(", canPersonalInstall=");
        sb.append(this.canPersonalInstall);
        sb.append(", meetingBackgroundList size =");
        List<MeetingBackground> list5 = this.meetingBackgroundList;
        if (list5 != null) {
            obj5 = Integer.valueOf(list5.size());
        }
        sb.append(obj5);
        sb.append(", enableCheckScreenShare=");
        sb.append(this.enableCheckScreenShare);
        sb.append('}');
        return sb.toString();
    }
}
