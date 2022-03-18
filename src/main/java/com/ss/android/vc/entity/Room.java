package com.ss.android.vc.entity;

import java.io.Serializable;
import java.util.List;

public class Room implements Serializable {
    public String avatarKey;
    public String avatarUrlTpl;
    public String backgroundUrl;
    public int capacity;
    public List<String> controllerIdList;
    public String fullName;
    public String fullNameParticipant;
    public String fullNameSite;
    public Location location;
    public String meetingNumber;
    public String name;
    public String primaryNameParticipant;
    public String primaryNameSite;
    public String roomId;
    public String secondaryName;

    public static class Location implements Serializable {
        public String buildingName;
        public String floorName;

        public String toString() {
            return "Location{floorName='" + this.floorName + '\'' + ", buildingName='" + this.buildingName + '\'' + '}';
        }
    }

    public String toString() {
        return "Room{name='" + this.name + '\'' + ", roomId='" + this.roomId + '\'' + ", capacity=" + this.capacity + ", controllerIdList=" + this.controllerIdList + ", backgroundUrl='" + this.backgroundUrl + ", meetingNumber='" + this.meetingNumber + '\'' + ", avatarKey='" + this.avatarKey + '\'' + ", avatarUrlTpl='" + this.avatarUrlTpl + '}';
    }
}
