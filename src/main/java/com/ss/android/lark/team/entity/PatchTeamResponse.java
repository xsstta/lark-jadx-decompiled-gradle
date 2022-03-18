package com.ss.android.lark.team.entity;

import java.io.Serializable;

public class PatchTeamResponse implements Serializable {
    private static final long serialVersionUID = 5988073502108026730L;
    private Team team;

    public Team getTeam() {
        return this.team;
    }

    public void setTeam(Team team2) {
        this.team = team2;
    }
}
