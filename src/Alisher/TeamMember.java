package Alisher;

import java.time.LocalDate;

public class TeamMember extends Team{
    public LocalDate yesterday;
    public LocalDate today=LocalDate.now();
    public LocalDate tomorrow;
    public TeamMember(String name, String power, String weakness) {
        super(name, power, weakness);
    }

    @Override
    public void Retro() {
        System.out.println(getName()+": did { spent some time with son,finished couple warm up tasks on CodingBat }"+(yesterday=today.minusDays(1)));
        System.out.println(getName()+": working on { Joined on group meeting(git,tools), now watching git second video,finish short videos on git.Night will start new weekly videos }"+(today));
        System.out.println(getName()+": will do {Join on group meeting (STLC), finish one of the weekly videos  }"+(tomorrow=today.plusDays(1)));
    }


    }