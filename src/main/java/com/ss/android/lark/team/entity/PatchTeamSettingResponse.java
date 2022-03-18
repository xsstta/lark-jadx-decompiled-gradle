package com.ss.android.lark.team.entity;

import java.io.Serializable;

public class PatchTeamSettingResponse implements Serializable {
    private static final long serialVersionUID = -288682316018350215L;
    private Team team;

    public Team getTeam() {
        return this.team;
    }

    public void setTeam(Team team2) {
        this.team = team2;
    }
}
