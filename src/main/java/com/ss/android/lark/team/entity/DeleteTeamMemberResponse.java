package com.ss.android.lark.team.entity;

import java.io.Serializable;

public class DeleteTeamMemberResponse implements Serializable {
    private static final long serialVersionUID = -1280823418978928174L;
    private Team team;

    public Team getTeam() {
        return this.team;
    }

    public void setTeam(Team team2) {
        this.team = team2;
    }
}
