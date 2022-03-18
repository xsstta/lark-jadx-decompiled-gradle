package com.ss.android.lark.team.entity;

import java.io.Serializable;

public class PutTeamMemberResponse implements Serializable {
    private static final long serialVersionUID = 3597072974204111179L;
    private Team team;

    public Team getTeam() {
        return this.team;
    }

    public void setTeam(Team team2) {
        this.team = team2;
    }
}
