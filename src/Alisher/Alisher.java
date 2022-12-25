package Alisher;

import java.util.ArrayList;
import java.util.Arrays;

public class Alisher{
    public static void main(String[] args) {
        TeamMember Alisher=new TeamMember("Alisher","Too annoying","His son");
        Alisher.Retro();
        System.out.println();
        System.out.println();
        System.out.println("=================================================================================");
        System.out.println();
        System.out.println();

        System.out.println("Merry Christmas Terrific Team");
        Team person1 = new Team("Sehriban", "Leader", "Replit");
        Team person2 = new Team("Mustafa", "Mentor", "Argentina fan");
        Team person3 = new Team("Zeynep", "Super Woman", "Git Settings");
        Team person4 = new Team("Vladimir", "Best mechanic in the World", "Problems with Timezone");
        Team person5 = new Team("Vusal", "Best cat owner", "Very old guy");
        Team person6 = new Team("Jilili", "Nice guy", "Sometimes invisible");
        Team person7 = new Team("Tuna", "20 years SDET", "English not good friend");
        Team person8 = new Team("Tatyana", "Very positive", "Living very,very far");
        Team person9 = new Team("Keith", "Motivator", "Family");
        Team person10 = new Team("Slava", "Secret man", "Nobody knows");
        Team person11 = new Team("Alisher", "Too annoying", "His son");
        ArrayList<Team> team = new ArrayList<>(Arrays.asList(person1, person2, person3, person4, person5, person6, person7, person8, person9, person10, person11));
        System.out.println("Some funny thing from your group member");
        for (Team teamMember : team) {
            System.out.println(teamMember);
        }
        System.out.println("====================================================================================");

    }
}
